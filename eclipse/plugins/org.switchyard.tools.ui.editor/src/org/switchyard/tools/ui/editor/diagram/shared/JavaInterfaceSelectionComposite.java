/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.editor.diagram.shared;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.internal.core.PackageFragment;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jdt.ui.actions.OpenNewInterfaceWizardAction;
import org.eclipse.jdt.ui.wizards.NewInterfaceWizardPage;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
@SuppressWarnings("restriction")
public class JavaInterfaceSelectionComposite extends AbstractSwitchyardComposite implements IInterfaceComposite {

    private Composite _panel;
    private Interface _interface = null;
    private Hyperlink _newClassLink;
    private Text _mClassText;
    private Button _browseClassBtn;

    /**
     * Constructor.
     * 
     * @param toolkit the toolkit to use for creating controls
     */
    public JavaInterfaceSelectionComposite(FormToolkit toolkit) {
        super(toolkit);
        // empty
    }

    @Override
    public void createContents(Composite parent, int style, DataBindingContext context) {

        _panel = getToolkit().createComposite(parent, SWT.NONE);
        GridLayout gl = new GridLayout();
        gl.numColumns = 3;
        _panel.setLayout(gl);
        if (getRootGridData() != null) {
            _panel.setLayoutData(getRootGridData());
        }

        _newClassLink = getToolkit().createHyperlink(_panel, Messages.link_javaInterface, SWT.NONE);
        _newClassLink.addHyperlinkListener(new HyperlinkAdapter() {
            @Override
            public void linkActivated(HyperlinkEvent event) {
                if (_mClassText != null && !_mClassText.isDisposed()) {
                    String classname = _mClassText.getText();
                    try {
                        IType foundClass = canFindClass(classname);
                        if (foundClass == null) {
                            String className = handleCreateJavaClass();
                            if (className != null) {
                                _mClassText.setText(className);
                                handleModify(_mClassText);
                                fireChangedEvent(_newClassLink);
                            }
                            return;
                        } else {
                            handleOpenJavaClass(foundClass);
                        }
                    } catch (JavaModelException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });
        _mClassText = getToolkit().createText(_panel, null, SWT.BORDER);
        _mClassText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // ignore
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (!inUpdate()) {
                    handleModify(_mClassText);
                    fireChangedEvent(_mClassText);
                }
            }
        });

        GridData uriGD = new GridData(GridData.FILL_HORIZONTAL);
        _mClassText.setLayoutData(uriGD);

        _browseClassBtn = getToolkit().createButton(_panel, Messages.button_browse, SWT.PUSH);
        GridData btnGD = new GridData();
        _browseClassBtn.setLayoutData(btnGD);
        _browseClassBtn.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                try {
                    IType selected = selectType(_panel.getShell(), null, null);
                    if (selected != null) {
                        _mClassText.setText(selected.getFullyQualifiedName());
                        handleModify(_mClassText);
                        fireChangedEvent(_browseClassBtn);
                    }
                } catch (JavaModelException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }

    /**
     * @param shell Shell for the window
     * @param superTypeName supertype to search for
     * @param project project to look in
     * @return IType the type created
     * @throws JavaModelException exception thrown
     */
    public IType selectType(Shell shell, String superTypeName, IProject project) throws JavaModelException {
        IJavaSearchScope searchScope = null;
        if (project == null) {
            ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService()
                    .getSelection();
            IStructuredSelection selectionToPass = StructuredSelection.EMPTY;
            if (selection instanceof IStructuredSelection) {
                selectionToPass = (IStructuredSelection) selection;
                if (selectionToPass.getFirstElement() instanceof IFile) {
                    project = ((IFile) selectionToPass.getFirstElement()).getProject();
                }
            }
        }
        if (project != null && superTypeName != null && !superTypeName.equals("java.lang.Object")) { //$NON-NLS-1$
            IJavaProject javaProject = JavaCore.create(project);
            IType superType = javaProject.findType(superTypeName);
            if (superType != null) {
                searchScope = SearchEngine.createHierarchyScope(superType);
            }
        } else if (project != null) {
            IJavaProject javaProject = JavaCore.create(project);
            searchScope = SearchEngine.createJavaSearchScope(javaProject.getJavaModel().getChildren());
        } else {
            searchScope = SearchEngine.createWorkspaceScope();
        }
        SelectionDialog dialog = JavaUI.createTypeDialog(shell, new ProgressMonitorDialog(shell), searchScope,
                IJavaElementSearchConstants.CONSIDER_INTERFACES, false);
        dialog.setTitle(Messages.title_selectEntries);
        dialog.setMessage(Messages.description_matchingItems);
        if (dialog.open() == IDialogConstants.CANCEL_ID) {
            return null;
        }
        Object[] types = dialog.getResult();
        if (types == null || types.length == 0) {
            return null;
        }
        return (IType) types[0];
    }

    private IType canFindClass(String classname) throws JavaModelException {
        IProject project = null;
        ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService()
                .getSelection();
        IStructuredSelection selectionToPass = StructuredSelection.EMPTY;
        if (selection instanceof IStructuredSelection) {
            selectionToPass = (IStructuredSelection) selection;
            if (selectionToPass.getFirstElement() instanceof IFile) {
                project = ((IFile) selectionToPass.getFirstElement()).getProject();
            }
        }
        if (selectionToPass == StructuredSelection.EMPTY) {
            project = SwitchyardSCAEditor.getActiveEditor().getModelFile().getProject();
        }
        if (project != null && classname != null) { //$NON-NLS-1$
            IJavaProject javaProject = JavaCore.create(project);
            IType superType = javaProject.findType(classname);
            if (superType != null) {
                return superType;
            }
        }
        return null;
    }

    private void handleOpenJavaClass(IType classToOpen) {
        if (classToOpen != null) {
            try {
                JavaUI.openInEditor(classToOpen);
            } catch (PartInitException e) {
                e.printStackTrace();
            } catch (JavaModelException e) {
                e.printStackTrace();
            }
        }
    }

    private String handleCreateJavaClass() throws JavaModelException {
        IProject project = null;
        IJavaProject javaProject = null;
        OpenNewInterfaceWizardAction action = new OpenNewInterfaceWizardAction();
        IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
        IStructuredSelection selectionToPass = StructuredSelection.EMPTY;
        if (modelFile != null) {
            selectionToPass = new StructuredSelection(modelFile);
            project = ((IFile) selectionToPass.getFirstElement()).getProject();
        }
        String className = _mClassText.getText().trim();
        NewInterfaceWizardPage page = new NewInterfaceWizardPage();
        IPackageFragmentRoot packRoot = null;
        if (project != null) { //$NON-NLS-1$
            javaProject = JavaCore.create(project);
            if (!className.isEmpty()) {
                if (className.contains(".")) { //$NON-NLS-1$
                    className = className.substring(className.lastIndexOf('.') + 1);
                }
                page.setTypeName(className, true);
            }
            IPackageFragment[] packages = javaProject.getPackageFragments();
            for (IPackageFragment mypackage : packages) {
                if (mypackage.getKind() == IPackageFragmentRoot.K_SOURCE) {
                    selectionToPass = new StructuredSelection(mypackage);
                    packRoot = (IPackageFragmentRoot) mypackage.getParent();
                    break;
                }
            }
            page.setPackageFragmentRoot(packRoot, true);
        }
        action.setSelection(selectionToPass);
        if (javaProject != null) {
            IJavaElement[] roots = packRoot.getChildren();
            PackageFragment stashFrag = null;
            for (int i = 0; i < roots.length; i++) {
                PackageFragment frag = (PackageFragment) roots[i];
                if (!frag.isDefaultPackage() && !frag.hasSubpackages()) {
                    stashFrag = frag;
                    break;
                }
            }
            if (stashFrag != null) {
                page.setPackageFragment(stashFrag, true);
            }
        }
        action.setConfiguredWizardPage(page);
        action.setOpenEditorOnFinish(false);
        action.run();
        IJavaElement createdElement = action.getCreatedElement();
        if (createdElement != null && createdElement instanceof IType) {
            IType stype = (IType) createdElement;
            String name = stype.getFullyQualifiedName();
            if (name != null) {
                return name;
            }
        }
        return null;
    }

    protected void handleModify(Control control) {
        final String interfaceClassName = _mClassText.getText().trim();
        validate();
        if (_interface instanceof JavaInterface) {
            if (_mClassText != null && !_mClassText.isDisposed() && _mClassText.isEnabled()) {
                if (_interface.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            ((JavaInterface) _interface).setInterface(interfaceClassName);
                        }
                    });
                } else {
                    ((JavaInterface) _interface).setInterface(interfaceClassName);
                }
            }
        }
    }

    protected boolean validate() {
        setErrorMessage(null);
        // test to make sure class is valid
        String className = _mClassText.getText();

        if (className == null || className.trim().length() == 0) {
            setErrorMessage(Messages.error_noClassSpecified);
        } else if (className.trim().length() < className.length()) {
            setErrorMessage(Messages.error_spacesInClassName);
        }
        return (getErrorMessage() == null);
    }

    /**
     * @return interface
     */
    public Interface getInterface() {
        return _interface;
    }

    /**
     * @param cInterface interface coming in
     */
    public void setInterface(Interface cInterface) {
        this._interface = cInterface;
        if (this._interface != null && this._interface instanceof JavaInterface) {
            JavaInterface javaIntfc = (JavaInterface) this._interface;
            setInUpdate(true);
            if (javaIntfc.getInterface() != null && !this._mClassText.isDisposed()) {
                this._mClassText.setText(javaIntfc.getInterface());
            } else if (javaIntfc.getInterface() == null && !this._mClassText.isDisposed()) {
                this._mClassText.setText("org.example.IServiceInterface"); //$NON-NLS-1$
            }
            setInUpdate(false);
        }
    }

    /**
     * @return panel
     */
    public Composite getPanel() {
        return _panel;
    }

    /**
     * @param canEdit flag
     */
    public void setCanEdit(boolean canEdit) {
        super.setCanEdit(canEdit);
        if (this._mClassText != null && !this._mClassText.isDisposed()) {
            this._mClassText.setEnabled(canEdit());
        }
        if (this._newClassLink != null && !this._newClassLink.isDisposed()) {
            this._newClassLink.setEnabled(canEdit());
        }
        if (this._browseClassBtn != null && !this._browseClassBtn.isDisposed()) {
            this._browseClassBtn.setEnabled(canEdit());
        }
    }
}
