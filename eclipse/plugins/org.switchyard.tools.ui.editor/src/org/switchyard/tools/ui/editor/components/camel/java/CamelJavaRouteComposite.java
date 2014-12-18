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
package org.switchyard.tools.ui.editor.components.camel.java;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.models.switchyard1_0.camel.JavaDSLType;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.property.AbstractChangeAwareModelComposite;
import org.switchyard.tools.ui.editor.property.ICompositeContainer;

/**
 * @author bfitzpat
 * 
 */
public class CamelJavaRouteComposite extends AbstractChangeAwareModelComposite<Component> {

    private Composite _panel;
    private CamelImplementationType _implementation = null;
    private ComponentService _service;
    private String _routeClassName = null;
    private Link _newClassLink;
    private Text _mClassText;
    private Button _browseClassBtn;
    private boolean _updating;

    /**
     * Create a new CamelJavaRouteImplementationComposite.
     * 
     * @param container the container.
     * @param parent the parent composite.
     * @param style style bits.
     */
    public CamelJavaRouteComposite(ICompositeContainer container, Composite parent, int style) {
        super(Component.class, container, parent, style);

        final FormToolkit factory = getWidgetFactory();
        _panel = this;
        _panel.setLayout(new GridLayout(3, false));

        _newClassLink = new Link(_panel, SWT.NONE);
        String message = Messages.link_routeBuilderClass;
        _newClassLink.setText(message);
        _newClassLink.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (_mClassText != null && !_mClassText.isDisposed()) {
//                    String classname = _mClassText.getText();
                    try {
//                        IType foundClass = canFindClass(classname);
//                        if (foundClass == null) {
                            String className = handleCreateJavaClass();
                            if (className != null) {
                                _mClassText.setText(className);
                                handleModify(_mClassText);
                                fireChangedEvent(_newClassLink);
                            }
                            return;
//                        } else {
//                            handleOpenJavaClass(foundClass);
//                        }
                    } catch (JavaModelException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });
        _mClassText = factory.createText(_panel, "", SWT.BORDER | SWT.READ_ONLY); //$NON-NLS-1$
        _mClassText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                handleModify(_mClassText);
                fireChangedEvent(_mClassText);
            }
        });
        GridData uriGD = new GridData(GridData.FILL_HORIZONTAL);
        _mClassText.setLayoutData(uriGD);

        _browseClassBtn = factory.createButton(_panel, Messages.button_browse, SWT.PUSH);
        GridData btnGD = new GridData();
        _browseClassBtn.setLayoutData(btnGD);
        _browseClassBtn.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                try {
                    IType selected = selectType(_panel.getShell(), "org.apache.camel.builder.RouteBuilder", null); //$NON-NLS-1$
                    if (selected != null) {
                        // TODO: parse class for service name
                        // (from("switchyard:serviceName)) and interface
                        // (@Route(type)).
                        _service = null;
                        // TODO: should also parse for references
                        // (to("switchyard:referenceName"))
                        _mClassText.setText(selected.getFullyQualifiedName());
                        handleModify(_mClassText);
                        fireChangedEvent(_browseClassBtn);
                    }
                } catch (JavaModelException e1) {
                    e1.printStackTrace();
                }
            }
        });

        validate();

        adaptChildren(this);
    }

    /**
     * @param serviceInterface the interface; may be null, indicating any
     *            interface is OK.
     */
    public void forceServiceInterfaceType(ComponentService serviceInterface) {
        _service = serviceInterface;
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
        if (superTypeName != null && !superTypeName.equals("java.lang.Object")) { //$NON-NLS-1$
            if (project == null) {
                project = SwitchyardSCAEditor.getActiveEditor().getModelFile().getProject();
            }
            IJavaProject javaProject = JavaCore.create(project);
            IType superType = javaProject.findType(superTypeName);
            if (superType != null) {
                searchScope = SearchEngine.createStrictHierarchyScope(javaProject, superType, true, false, null);
            }
        } else {
            searchScope = SearchEngine.createWorkspaceScope();
        }
        SelectionDialog dialog = JavaUI.createTypeDialog(shell, new ProgressMonitorDialog(shell), searchScope,
                IJavaElementSearchConstants.CONSIDER_CLASSES_AND_INTERFACES, false);
        dialog.setTitle(Messages.label_selectEntries);
        dialog.setMessage(Messages.label_matchingItems);
        if (dialog.open() == IDialogConstants.CANCEL_ID) {
            return null;
        }
        Object[] types = dialog.getResult();
        if (types == null || types.length == 0) {
            return null;
        }
        return (IType) types[0];
    }

//    private IType canFindClass(String classname) throws JavaModelException {
//        IProject project = null;
//        ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService()
//                .getSelection();
//        IStructuredSelection selectionToPass = StructuredSelection.EMPTY;
//        if (selection instanceof IStructuredSelection) {
//            selectionToPass = (IStructuredSelection) selection;
//            if (selectionToPass.getFirstElement() instanceof IFile) {
//                project = ((IFile) selectionToPass.getFirstElement()).getProject();
//            }
//        }
//        if (selectionToPass == StructuredSelection.EMPTY) {
//            project = SwitchyardSCAEditor.getActiveEditor().getModelFile().getProject();
//        }
//        if (project != null && classname != null) { //$NON-NLS-1$
//            IJavaProject javaProject = JavaCore.create(project);
//            IType superType = javaProject.findType(classname);
//            if (superType != null) {
//                return superType;
//            }
//        }
//        return null;
//    }
//
//    private void handleOpenJavaClass(IType classToOpen) {
//        if (classToOpen != null) {
//            try {
//                JavaUI.openInEditor(classToOpen);
//            } catch (PartInitException e) {
//                e.printStackTrace();
//            } catch (JavaModelException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    private String handleCreateJavaClass() throws JavaModelException {
        IProject project = null;
        IJavaProject javaProject = null;
        IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
        if (modelFile != null) {
            project = modelFile.getProject();
        }
        if (project != null) { //$NON-NLS-1$
            javaProject = JavaCore.create(project);
        }
        IJavaElement element = JavaUtil.getInitialPackageForProject(javaProject);
        IStructuredSelection selectionToPass = element == null ? StructuredSelection.EMPTY : new StructuredSelection(
                element);

        NewCamelJavaRouteComponentWizard wizard = new NewCamelJavaRouteComponentWizard(false);
        WizardDialog dialog = new WizardDialog(_panel.getShell(), wizard);
        wizard.init(PlatformUI.getWorkbench(), selectionToPass);
        wizard.forceServiceInterfaceType(getComponentContract());
        if (dialog.open() == WizardDialog.OK) {
            Component component = wizard.getCreatedObject();
            if (component != null) {
                List<ComponentService> services = component.getService();
                if (services != null && services.size() > 0) {
                    _service = services.get(0);
                }
                return ((CamelImplementationType) component.getImplementation()).getJava().getClass_();
            }
        }
        return null;
    }

    protected void handleModify(Control control) {
        if (_mClassText != null && !_mClassText.isDisposed()) {
            _routeClassName = _mClassText.getText().trim();
            getContainer().validated(validate());
            if (!_updating) {
                if (_mClassText != null && !_mClassText.isDisposed()) {
                    EObject targetForDomain = null;
                    if (getContainer() instanceof WizardPage) {
                        WizardPage page = (WizardPage) getContainer();
                        if (page.getWizard() instanceof CamelJavaImplementationWizard) {
                            CamelJavaImplementationWizard wizard = (CamelJavaImplementationWizard) page.getWizard();
                            targetForDomain = wizard.getComponentObject();
                        }
                    }
                    wrapOperation(new Runnable() {

                        @Override
                        public void run() {
                            if (_implementation == null) {
                                _implementation = CamelFactory.eINSTANCE.createCamelImplementationType();
                            }
                            
                            // handle java class name
                            JavaDSLType javatype = _implementation.getJava();
                            if (javatype == null) {
                                javatype = CamelFactory.eINSTANCE.createJavaDSLType();
                                _implementation.setJava(javatype);
                            }
                            javatype.setClass(_mClassText.getText());
                            _implementation.setXml(null);
                        }
                        
                    }, targetForDomain);
                 }
            }
        }
    }

    @Override
    public IStatus validate() {
        String errMessage = null;

        // test to make sure class is valid
        String className = _mClassText.getText();

        if (className == null || className.trim().length() == 0) {
            errMessage = Messages.error_noClassSpecified;
        } else if (className.trim().length() < className.length()) {
            errMessage = Messages.error_noSpacesInClassName;
        }

        if (errMessage != null) {
            return new Status(IStatus.ERROR, Activator.PLUGIN_ID, errMessage);
        }
        return Status.OK_STATUS;
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
            _updating = true;
            if (_implementation != null && _mClassText != null) {
                if (_implementation.getJava() != null) {
                    this._mClassText.setText(_implementation.getJava().getClass_());
                } else {
                    handleModify(_mClassText);
                }
            }
            _updating = false;
        }
    }

    /**
     * @return the service associated with the implementation; may be null.
     */
    public ComponentService getService() {
        return _service;
    }

    /**
     * @return panel
     */
    public Composite getPanel() {
        return _panel;
    }

    /**
     * @return String for camel class
     */
    public String getCamelRouteClass() {
        return this._routeClassName;
    }

    private ComponentService getComponentContract() {
        if (_implementation != null && _implementation.eContainer() instanceof Component) {
            Component component = (Component) _implementation.eContainer();
            if (component.getService() != null) {
                for (ComponentService service : component.getService()) {
                    _service = service;
                    break;
                }
            }
        }
        return _service;
    }

    @Override
    public void refresh() {
        _implementation = null;
        final Component bo = getTargetObject();
        if (bo != null) {
            _implementation = (CamelImplementationType) ((Component) bo).getImplementation();
            _updating = true;
            if (_implementation != null && _mClassText != null) {
                if (_implementation.getJava() != null) {
                    this._mClassText.setText(_implementation.getJava().getClass_());
                } else {
                    handleModify(_mClassText);
                }
            }
            _updating = false;
        }
    }
}
