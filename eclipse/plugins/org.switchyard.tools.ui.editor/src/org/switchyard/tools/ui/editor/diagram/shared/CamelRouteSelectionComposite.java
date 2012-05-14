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

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.ListenerList;
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
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
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
public class CamelRouteSelectionComposite {

    // change listeners
    private ListenerList _changeListeners;

    private Composite _panel;
    private CamelImplementationType _implementation = null;
    private String _errorMessage = null;
    private String _camelRouteFilePath = null;
    private String _routeClassName = null;
    private GridData _rootGridData = null;
    private Button _optBtnXML;
    private Button _optBtnClass;
    private Link _newClassLink;
    private Text _mClassText;
    private Button _browseClassBtn;
    private Link _newXMLLink;
    private Button _browseXMLBtn;
    private Text _mXMLText;

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
        GridLayout gl = new GridLayout();
        gl.numColumns = 3;
        _panel.setLayout(gl);
        if (_rootGridData != null) {
            _panel.setLayoutData(_rootGridData);
        }

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
                handleModify();
                fireChangedEvent(_mXMLText);
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

    private void validate() {
        _errorMessage = null;
        boolean classControlsSelected = _optBtnClass.getSelection();

        if (classControlsSelected) {
            // test to make sure class is valid
            String className = _mClassText.getText();

            if (className == null || className.trim().length() == 0) {
                _errorMessage = "No Class specified";
            } else if (className.trim().length() < className.length()) {
                _errorMessage = "No spaces allowed in class name";
            }
        } else {
            String routeFileName = _mXMLText.getText();

            if (routeFileName == null || routeFileName.trim().length() == 0) {
                _errorMessage = "No Route file specified";
            } else if (routeFileName.trim().length() < routeFileName.length()) {
                _errorMessage = "No spaces allowed in Route file name/path";
            }
        }
    }

    /**
     * @return interface
     */
    public CamelImplementationType getImplementation() {
        return _implementation;
    }

    /**
     * @param cImplementation implementation coming in
     */
    public void setImplementation(CamelImplementationType cImplementation) {
        _implementation = cImplementation;
        if (_implementation != null && _mClassText != null) {
            if (_implementation.getJava() != null) {
                this._mClassText.setText(_implementation.getJava().getClass_());
            } else if (_implementation.getXml() != null) {
                this._mXMLText.setText(_implementation.getXml().getPath());
            } else {
                handleModify();
            }
        }
    }

    /**
     * @return string error message
     */
    public String getErrorMessage() {
        return _errorMessage;
    }

    /**
     * If we changed, fire a changed event.
     * 
     * @param source
     */
    private void fireChangedEvent(Object source) {
        ChangeEvent e = new ChangeEvent(source);
        // inform any listeners of the change event
        if (this._changeListeners != null && !this._changeListeners.isEmpty()) {
            Object[] listeners = this._changeListeners.getListeners();
            for (int i = 0; i < listeners.length; ++i) {
                ((ChangeListener) listeners[i]).stateChanged(e);
            }
        }
    }

    /**
     * Add a change listener.
     * 
     * @param listener new listener
     */
    public void addChangeListener(ChangeListener listener) {
        if (this._changeListeners == null) {
            this._changeListeners = new ListenerList();
        }
        this._changeListeners.add(listener);
    }

    /**
     * Remove a change listener.
     * 
     * @param listener to remove
     */
    public void removeChangeListener(ChangeListener listener) {
        this._changeListeners.remove(listener);
    }

    /**
     * @return panel
     */
    public Composite getcPanel() {
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

    /**
     * @param rootGridData the _rootGridData to set
     */
    public void setRootGridData(GridData rootGridData) {
        this._rootGridData = rootGridData;
    }

    private static String selectResourceFromWorkspace(Shell shell, final String extension) {

        ILabelProvider labelProvider = new LabelProvider() {

            public Image getImage(final Object element) {
                String imageType = ISharedImages.IMG_OBJ_FOLDER;
                if (((IResource) element).getType() == IResource.FILE) {
                    imageType = ISharedImages.IMG_OBJ_ELEMENT;
                }

                return PlatformUI.getWorkbench().getSharedImages().getImage(imageType);
            }

            public String getText(final Object element) {
                return ((IResource) element).getName();
            }
        };

        ITreeContentProvider contentProvider = new ITreeContentProvider() {
            public Object[] getChildren(final Object parentElement) {
                Object[] result = null;
                String cmpExt = "." + extension; //$NON-NLS-1$
                if (parentElement instanceof IContainer) {
                    try {
                        List<IResource> arrFolder = new ArrayList<IResource>();
                        List<IResource> arrFile = new ArrayList<IResource>();
                        IResource[] res = ((IContainer) parentElement).members();
                        for (int i = 0; i < res.length; ++i) {
                            if (res[i].getType() == IResource.FILE) {
                                if (res[i].getName().endsWith(cmpExt)) {
                                    arrFile.add(res[i]);
                                }
                            } else {
                                arrFolder.add(res[i]);
                            }
                        }

                        List<IResource> arr = new ArrayList<IResource>();
                        arr.addAll(arrFolder);
                        arr.addAll(arrFile);
                        result = arr.toArray();
                    } catch (CoreException e) {
                        e.fillInStackTrace();
                    }
                }
                return result;
            }

            /**
             * {@inheritDoc}
             */
            public Object getParent(Object element) {
                return ((IResource) element).getParent();
            }

            /**
             * {@inheritDoc}
             */
            public boolean hasChildren(Object element) {
                if (((IResource) element).getType() == IResource.FILE) {
                    return false;
                }
                return true;
            }

            /**
             * {@inheritDoc}
             */
            public Object[] getElements(Object inputElement) {
                return getChildren(inputElement);
            }

            /**
             * {@inheritDoc}
             */
            public void dispose() {
            }

            /**
             * {@inheritDoc}
             */
            public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
            }
        };

        ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(shell, labelProvider, contentProvider);
        dialog.setTitle("Select Workspace Route XML File Resource");
        dialog.setAllowMultiple(false);
        dialog.setDoubleClickSelects(true);
        dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
        IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
        if (modelFile != null) {
            dialog.setInitialSelection(modelFile.getParent());
        }
        if (dialog.open() == Window.OK) {
            IResource sel = (IResource) dialog.getFirstResult();
            if (sel.getType() == IResource.FILE) {
                return sel.getProjectRelativePath().toPortableString();
            }
        }

        return null;
    }

    // private static FileDialog getFileSelectionDialog(final Shell shell) {
    // FileDialog fileDialog = new FileDialog(shell, SWT.PRIMARY_MODAL |
    // SWT.OPEN);
    // IProject[] projects =
    // ResourcesPlugin.getWorkspace().getRoot().getProjects();
    // String strDefaultProject = (projects.length > 0) ?
    // projects[0].getFullPath().toOSString() : "";
    //        int index = strDefaultProject.indexOf("/"); //$NON-NLS-1$
    // if (index == -1) {
    //            index = strDefaultProject.indexOf("\\"); //$NON-NLS-1$
    // }
    // if (index != -1) {
    // strDefaultProject = strDefaultProject.substring(index + 1);
    // }
    // fileDialog.setFilterPath(strDefaultProject);
    // return fileDialog;
    // }

    // private static String openFileSelectionDialog(Shell shell, String
    // fileExt) {
    // String extName = "*." + fileExt;
    // FileDialog fileDialog = getFileSelectionDialog(shell);
    //        fileDialog.setFilterExtensions(new String[] {"*." + fileExt }); //$NON-NLS-1$
    // fileDialog.setFilterNames(new String[] {extName });
    // fileDialog.setText("Select File from File System");
    // return fileDialog.open();
    // }

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
