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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
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
import org.eclipse.jdt.ui.actions.OpenNewClassWizardAction;
import org.eclipse.jdt.ui.wizards.NewClassWizardPage;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.models.switchyard1_0.camel.JavaDSLType;
import org.switchyard.tools.models.switchyard1_0.camel.XMLDSLType;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
@SuppressWarnings("restriction")
public class CamelRouteSelectionComposite extends AbstractSwitchyardComposite implements IImplementationComposite {

    private Composite _panel;
    private CamelImplementationType _implementation = null;
    private String _camelRouteFilePath = null;
    private String _routeClassName = null;
    private Button _optBtnXML;
    private Button _optBtnClass;
    private Link _newClassLink;
    private Text _mClassText;
    private Button _browseClassBtn;
    private Link _newXMLLink;
    private Button _browseXMLBtn;
    private Text _mXMLText;
    private boolean _inUpdate = false;

    /**
     * Constructor.
     */
    public CamelRouteSelectionComposite() {
        // empty
    }

    /**
     * @param parent composite parent
     * @param style any style bits
     */
    public void createContents(Composite parent, int style) {

        _panel = new Composite(parent, SWT.NONE);
        _panel.setLayout(new GridLayout(3, false));
//        if (getRootGridData() != null) {
//            _panel.setLayoutData(getRootGridData());
//        }

        _optBtnXML = new Button(_panel, SWT.RADIO);
        GridData optBtnXMLGD = new GridData(GridData.FILL_HORIZONTAL);
        optBtnXMLGD.horizontalSpan = 3;
        _optBtnXML.setLayoutData(optBtnXMLGD);
        _optBtnXML.setText("&XML Route:");
        _optBtnXML.setSelection(true);
        _optBtnXML.addSelectionListener(new SelectionListener() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                updateSelectionBasedOnOptionBtn();
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                updateSelectionBasedOnOptionBtn();
            }
        });

        _newXMLLink = new Link(_panel, SWT.NONE);
        String xmlmessage = "<a>Route XML File:</a>";
        _newXMLLink.setText(xmlmessage);
        _newXMLLink.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                String path = getPathToNewXML(_panel.getShell(), _mXMLText.getText());
                if (path != null) {
                    _mXMLText.setText(path);
                    handleModify();
                    fireChangedEvent(_newXMLLink);
                }
            }
        });
        _mXMLText = new Text(_panel, SWT.BORDER);
        _mXMLText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                if (!_inUpdate) {
                    handleModify();
                    fireChangedEvent(_mXMLText);
                }
            }
        });
        GridData uriGDXML = new GridData(GridData.FILL_HORIZONTAL);
        _mXMLText.setLayoutData(uriGDXML);

        _browseXMLBtn = new Button(_panel, SWT.PUSH);
        _browseXMLBtn.setText("Browse...");
        GridData btnGDXML = new GridData();
        _browseXMLBtn.setLayoutData(btnGDXML);
        _browseXMLBtn.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                String path = selectResourceFromWorkspace(_panel.getShell(), "xml");
                if (path != null) {
                    _mXMLText.setText(path);
                    handleModify();
                    fireChangedEvent(_browseXMLBtn);
                }
            }
        });

        _optBtnClass = new Button(_panel, SWT.RADIO);
        GridData optBtnClassGD = new GridData(GridData.FILL_HORIZONTAL);
        optBtnClassGD.horizontalSpan = 3;
        _optBtnClass.setLayoutData(optBtnClassGD);
        _optBtnClass.setText("Java &Class:");
        _optBtnClass.addSelectionListener(new SelectionListener() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                updateSelectionBasedOnOptionBtn();
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                updateSelectionBasedOnOptionBtn();
            }
        });

        _newClassLink = new Link(_panel, SWT.NONE);
        String message = "<a>Route Builder Class:</a>";
        _newClassLink.setText(message);
        _newClassLink.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (_mClassText != null && !_mClassText.isDisposed()) {
                    String classname = _mClassText.getText();
                    try {
                        IType foundClass = canFindClass(classname);
                        if (foundClass == null) {
                            String className = handleCreateJavaClass();
                            if (className != null) {
                                _mClassText.setText(className);
                                handleModify();
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
        _mClassText = new Text(_panel, SWT.BORDER);
        _mClassText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                handleModify();
                fireChangedEvent(_mClassText);
            }
        });
        GridData uriGD = new GridData(GridData.FILL_HORIZONTAL);
        _mClassText.setLayoutData(uriGD);

        _browseClassBtn = new Button(_panel, SWT.PUSH);
        _browseClassBtn.setText("Browse...");
        GridData btnGD = new GridData();
        _browseClassBtn.setLayoutData(btnGD);
        _browseClassBtn.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                try {
                    IType selected = selectType(_panel.getShell(), "org.apache.camel.builder.RouteBuilder", null);
                    if (selected != null) {
                        _mClassText.setText(selected.getFullyQualifiedName());
                        handleModify();
                        fireChangedEvent(_browseClassBtn);
                    }
                } catch (JavaModelException e1) {
                    e1.printStackTrace();
                }
            }
        });

        updateSelectionBasedOnOptionBtn();

        _mXMLText.setText("route.xml");
        _camelRouteFilePath = _mXMLText.getText();
        validate();
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
        } else {
            searchScope = SearchEngine.createWorkspaceScope();
        }
        SelectionDialog dialog = JavaUI.createTypeDialog(shell, new ProgressMonitorDialog(shell), searchScope,
                IJavaElementSearchConstants.CONSIDER_CLASSES_AND_INTERFACES, false);
        dialog.setTitle("Select entries");
        dialog.setMessage("Matching items");
        if (dialog.open() == IDialogConstants.CANCEL_ID) {
            return null;
        }
        Object[] types = dialog.getResult();
        if (types == null || types.length == 0) {
            return null;
        }
        return (IType) types[0];
    }

    private void updateSelectionBasedOnOptionBtn() {
        _browseClassBtn.setEnabled(_optBtnClass.getSelection());
        _mClassText.setEnabled(_optBtnClass.getSelection());
        _newClassLink.setEnabled(_optBtnClass.getSelection());
        _browseXMLBtn.setEnabled(_optBtnXML.getSelection());
        _newXMLLink.setEnabled(_optBtnXML.getSelection());
        _mXMLText.setEnabled(_optBtnXML.getSelection());
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
        OpenNewClassWizardAction action = new OpenNewClassWizardAction();
        IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
        IStructuredSelection selectionToPass = StructuredSelection.EMPTY;
        if (modelFile != null) {
            selectionToPass = new StructuredSelection(modelFile);
            project = ((IFile) selectionToPass.getFirstElement()).getProject();
        }
        IPackageFragmentRoot packRoot = null;
        if (project != null) { //$NON-NLS-1$
            javaProject = JavaCore.create(project);
            IPackageFragment[] packages = javaProject.getPackageFragments();
            for (IPackageFragment mypackage : packages) {
                if (mypackage.getKind() == IPackageFragmentRoot.K_SOURCE) {
                    selectionToPass = new StructuredSelection(mypackage);
                    packRoot = (IPackageFragmentRoot) mypackage.getParent();
                    break;
                }
            }
        }
        action.setSelection(selectionToPass);
        MyClassWizardPage page = new MyClassWizardPage();
        action.setConfiguredWizardPage(page);
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
            if (packRoot != null) {
                page.setPackageFragmentRoot(packRoot, true);
            }
        }
        page.setSuperClass("org.apache.camel.builder.RouteBuilder", false);
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

    private void handleModify() {
        _camelRouteFilePath = _mXMLText.getText().trim();
        _routeClassName = _mClassText.getText().trim();
        validate();
        if (_implementation == null) {
            return;
        }
        if (!_inUpdate) {
            if (_mXMLText != null && !_mXMLText.isDisposed() && _mXMLText.isEnabled()) {
                // handle xml file path
                XMLDSLType xmltype = _implementation.getXml();
                if (xmltype == null) {
                    xmltype = CamelFactory.eINSTANCE.createXMLDSLType();
                    _implementation.setXml(xmltype);
                }
                // camelImpl.getXml().eSet(CamelPackage.eINSTANCE.getXMLDSLType().getEStructuralFeature(CamelPackage.XMLDSL_TYPE__PATH),
                // _mXMLText.getText());
                xmltype.setPath(_mXMLText.getText());
                _implementation.setJava(null);
            } else if (_mClassText != null && !_mClassText.isDisposed() && _mClassText.isEnabled()) {
                // handle java class name
                JavaDSLType javatype = _implementation.getJava();
                if (javatype == null) {
                    javatype = CamelFactory.eINSTANCE.createJavaDSLType();
                    _implementation.setJava(javatype);
                }
                javatype.setClass(_mClassText.getText());
                _implementation.setXml(null);
            }
        }
    }

    protected void validate() {
        setErrorMessage(null);
        boolean classControlsSelected = _optBtnClass.getSelection();

        if (classControlsSelected) {
            // test to make sure class is valid
            String className = _mClassText.getText();

            if (className == null || className.trim().length() == 0) {
                setErrorMessage("No Class specified");
            } else if (className.trim().length() < className.length()) {
                setErrorMessage("No spaces allowed in class name");
            }
        } else {
            String routeFileName = _mXMLText.getText();

            if (routeFileName == null || routeFileName.trim().length() == 0) {
                setErrorMessage("No Route file specified");
            } else if (routeFileName.trim().length() < routeFileName.length()) {
                setErrorMessage("No spaces allowed in Route file name/path");
            }
        }
    }

    /**
     * @return interface
     */
    public Implementation getImplementation() {
        return _implementation;
    }

    /**
     * @param impl implementation coming in
     */
    public void setImplementation(Implementation impl) {
        if (impl instanceof CamelImplementationType) {
            _implementation = (CamelImplementationType) impl;
            _inUpdate = true;
            if (_implementation != null && _mClassText != null) {
                if (_implementation.getJava() != null) {
                    this._mClassText.setText(_implementation.getJava().getClass_());
                } else if (_implementation.getXml() != null) {
                    this._mXMLText.setText(_implementation.getXml().getPath());
                } else {
                    handleModify();
                }
            }
            _inUpdate = false;
        }
    }

    /**
     * @return panel
     */
    public Composite getPanel() {
        return _panel;
    }

    /**
     * @return String for camel route
     */
    public String getCamelRouteString() {
        return this._camelRouteFilePath;
    }

    /**
     * @return String for camel class
     */
    public String getCamelRouteClass() {
        return this._routeClassName;
    }

    private static String selectResourceFromWorkspace(Shell shell, final String extension) {

        IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
        IJavaProject javaProject = null;
        if (modelFile != null) {
            if (modelFile.getProject() != null) { //$NON-NLS-1$
                javaProject = JavaCore.create(modelFile.getProject());
            }
        }
        FindResourceDialog dialog = null;
        if (javaProject == null) {
            dialog = new FindResourceDialog(shell, ResourcesPlugin.getWorkspace().getRoot());
        } else {
            dialog = new FindResourceDialog(shell, javaProject.getProject());
        }
        dialog.setTitle("Select Route XML File from Project");
        dialog.setInitialPattern("*.xml");
        dialog.open();
        Object[] result = dialog.getResult();
        if (result == null || result.length == 0 || !(result[0] instanceof IResource)) {
            return null;
        }
        IJavaElement element = JavaCore.create((IResource) result[0]);
        IResource resource = null;
        if (element != null && element.exists()) {
            try {
                resource = element.getCorrespondingResource();
            } catch (JavaModelException e) {
                e.fillInStackTrace();
            }
        } else {
            resource = ((IResource) result[0]);
        }
        IPackageFragmentRoot root = javaProject.getPackageFragmentRoot(modelFile);
        IResource pkgresource = root.getResource();
        if (pkgresource == null) {
            IJavaElement parent = root.getParent();
            pkgresource = parent.getResource();
        }
        if (resource instanceof IFile) {
            pkgresource = ((IFile) resource).getParent();
        }
        if (pkgresource instanceof IFolder) {
            IFolder folder = (IFolder) pkgresource;
            IFolder parent = (IFolder) folder.getParent();
            IPath outpath  = resource.getProjectRelativePath()
                    .makeRelativeTo(parent.getProjectRelativePath());
            return outpath.toPortableString();
        }

        return null;
    }

    private static String getPathToNewXML(final Shell shell, String defaultName) {
        NewRouteFileWizard newWizard = new NewRouteFileWizard();
        IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
        IStructuredSelection selectionToPass = StructuredSelection.EMPTY;
        if (modelFile != null) {
            if (modelFile.getProject() != null) { //$NON-NLS-1$
                IJavaProject javaProject = JavaCore.create(modelFile.getProject());
                IPackageFragmentRoot folder = javaProject.getPackageFragmentRoot(modelFile);
                selectionToPass = new StructuredSelection(folder);
            }
        }
        newWizard.init(PlatformUI.getWorkbench(), selectionToPass);
        newWizard.setCreatedFilePath(defaultName);
        WizardDialog dialog = new WizardDialog(shell, newWizard);
        if (dialog.open() == Window.OK) {
            return newWizard.getCreatedFilePath();
        }
        return null;
    }

    private class MyClassWizardPage extends NewClassWizardPage {

        @Override
        protected void createTypeMembers(IType type, ImportsManager imports, IProgressMonitor monitor)
                throws CoreException {
            super.createTypeMembers(type, imports, monitor);

            StringBuffer buf = new StringBuffer();
            final String lineDelim = "\n"; // OK, since content is formatted afterwards //$NON-NLS-1$
            String comment = "/**" + lineDelim + " * The Camel route is configured via this method.  The from:"
                    + lineDelim + " * endpoint is required to be a SwitchYard service." + lineDelim + " */" + lineDelim;
            if (comment != null) {
                buf.append(comment);
                buf.append(lineDelim);
            }
            buf.append("public void configure() {"); //$NON-NLS-1$
            buf.append(lineDelim);
            buf.append("from(\"switchyard://${service.name}\")");
            buf.append(lineDelim);
            buf.append(".log(\"Received message for ${service.name} : ${body}\");");
            buf.append(lineDelim);
            buf.append("}"); //$NON-NLS-1$
            type.createMethod(buf.toString(), null, false, null);
        }

    }
}
