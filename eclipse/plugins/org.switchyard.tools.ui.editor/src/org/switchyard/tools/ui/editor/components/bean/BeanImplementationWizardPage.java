/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.editor.components.bean;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.wizards.NewBeanServiceWizard;

/**
 * BeanImplementationWizardPage
 * 
 * <p/>
 * Collects information for a bean component implementation.
 * 
 * @author Rob Cernich
 */
public class BeanImplementationWizardPage extends WizardPage {

    private Link _newBeanLink;
    private Text _beanClassText;
    private Button _browseBeanButton;
    private IJavaProject _project;
    private IType _beanClass;
    private ComponentService _serviceInterface;
    private IType _serviceInterfaceType;

    /**
     * Create a new BeanImplementationWizardPage.
     * 
     * @param pageName the page name.
     */
    public BeanImplementationWizardPage(String pageName) {
        super(pageName);
        setTitle("Bean Implementation Details");
        setDescription("Select an implementation class.");
        setPageComplete(false);
        ResourceSet resourceSet = (ResourceSet) SwitchyardSCAEditor.getActiveEditor().getEditorInput()
                .getAdapter(ResourceSet.class);
        if (resourceSet != null && resourceSet.getResources().size() > 0) {
            for (Resource emfResource : resourceSet.getResources()) {
                String path = resourceSet.getURIConverter().normalize(emfResource.getURI()).toPlatformString(true);
                if (path != null) {
                    IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(path);
                    if (resource != null) {
                        IProject project = resource.getProject();
                        if (project != null) {
                            _project = JavaCore.create(project);
                            break;
                        }
                    }
                }
            }
        }
    }

    /**
     * @param component the existing component to which the implementation will
     *            be set; may be null.
     */
    public void setComponent(Component component) {
        _serviceInterface = null;
        if (_project == null || component == null || component.getService() == null) {
            return;
        }
        for (ComponentService service : component.getService()) {
            _serviceInterface = service;
            Interface intf = service.getInterface();
            if (intf instanceof JavaInterface && ((JavaInterface) intf).getInterface() != null) {
                try {
                    _serviceInterfaceType = _project.findType(((JavaInterface) intf).getInterface());
                } catch (JavaModelException e) {
                    e.fillInStackTrace();
                }
            }
            return;
        }
    }

    /**
     * @return the selected bean class.
     */
    public IType getBeanClass() {
        return _beanClass;
    }

    @Override
    public void createControl(Composite parent) {
        Composite contents = new Composite(parent, SWT.NONE);
        contents.setLayout(new GridLayout(3, false));

        _newBeanLink = new Link(contents, SWT.NONE);
        _newBeanLink.setText("<a>Bean Class:</a>");
        _newBeanLink.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                openNewBeanWizard();
            }

        });

        _beanClassText = new Text(contents, SWT.READ_ONLY | SWT.BORDER);
        _beanClassText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _beanClassText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                validate();
            }

        });

        _browseBeanButton = new Button(contents, SWT.PUSH);
        _browseBeanButton.setText("Browse...");
        _browseBeanButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                handleBrowse();
            }

        });

        setControl(contents);
    }

    private void validate() {
        setErrorMessage(null);
        if (_beanClass == null) {
            setErrorMessage("Please select a bean class.");
        }
        setPageComplete(getErrorMessage() == null);
    }

    private void handleBrowse() {
        IJavaSearchScope scope = null;
        if (_project == null) {
            scope = SearchEngine.createWorkspaceScope();
        } else {
            if (_serviceInterface == null) {
                scope = SearchEngine.createJavaSearchScope(new IJavaElement[] {_project });
            } else {
                try {
                    scope = SearchEngine.createStrictHierarchyScope(_project, _serviceInterfaceType, true, false, null);
                } catch (JavaModelException e) {
                    // fallback to any type
                    scope = SearchEngine.createJavaSearchScope(new IJavaElement[] {_project });
                }
            }
        }

        try {
            SelectionDialog dialog = JavaUI.createTypeDialog(getShell(), getContainer(), scope,
                    IJavaElementSearchConstants.CONSIDER_CLASSES, false, "*Bean");
            if (dialog.open() == SelectionDialog.OK) {
                Object[] result = dialog.getResult();
                if (result.length > 0 && result[0] instanceof IType) {
                    _beanClass = (IType) result[0];
                    _beanClassText.setText(((IType) result[0]).getFullyQualifiedName());
                }
            }
        } catch (JavaModelException e) {
            e.printStackTrace();
        }
    }

    private void openNewBeanWizard() {
        NewBeanServiceWizard wizard = new NewBeanServiceWizard(false, false);
        SwitchyardSCAEditor editor = SwitchyardSCAEditor.getActiveEditor();
        IJavaElement element = JavaUtil.getInitialPackageForProject(_project);
        IStructuredSelection selection = element == null ? StructuredSelection.EMPTY : new StructuredSelection(element);
        IWorkbench workbench = editor == null ? PlatformUI.getWorkbench() : editor.getEditorSite().getWorkbenchWindow()
                .getWorkbench();
        wizard.init(workbench, selection);
        wizard.forceServiceInterfaceType(_serviceInterface);
        WizardDialog dialog = new WizardDialog(getShell(), wizard);
        if (dialog.open() == WizardDialog.OK) {
            ICompilationUnit icu = JavaCore.createCompilationUnitFrom(wizard.getNewClassFile());
            if (icu != null) {
                IType type = icu.findPrimaryType();
                if (type != null) {
                    _beanClass = type;
                    _beanClassText.setText(type.getFullyQualifiedName());
                }
            }
        }
    }

}
