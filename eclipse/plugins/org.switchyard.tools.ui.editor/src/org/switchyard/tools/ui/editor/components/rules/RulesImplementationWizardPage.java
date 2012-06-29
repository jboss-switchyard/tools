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
package org.switchyard.tools.ui.editor.components.rules;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
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
import org.switchyard.tools.models.switchyard1_0.rules.RulesFactory;
import org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.editor.diagram.shared.ClasspathResourceSelectionDialog;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * RulesImplementationWizardPage
 * 
 * <p/>
 * Collects information for a rules component implementation.
 * 
 * @author Rob Cernich
 */
public class RulesImplementationWizardPage extends WizardPage {

    private ComponentService _serviceInterface;
    private Link _newRulesLink;
    private Text _rulesFileText;
    private Button _browseRulesButton;
    private IJavaProject _project;
    private RulesImplementationType _implementation;
    private ComponentService _service;

    /**
     * Create a new RulesImplementationWizardPage.
     * 
     * @param pageName the page name.
     */
    public RulesImplementationWizardPage(String pageName) {
        super(pageName);
        setTitle("Rules Implementation Details");
        setDescription("Select a rules file.");
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
     * @return the rules implementation configuration.
     */
    public RulesImplementationType getImplementation() {
        return _implementation;
    }

    /**
     * @return the component service.
     */
    public ComponentService getService() {
        return _service;
    }

    /**
     * Initialize controls based on the target component (e.g. service interface
     * details).
     * 
     * @param component the containing component.
     */
    public void init(Component component) {
        if (component == null || component.getService() == null) {
            return;
        }
        for (ComponentService service : component.getService()) {
            _serviceInterface = service;
            return;
        }
    }

    @Override
    public void createControl(Composite parent) {
        Composite contents = new Composite(parent, SWT.NONE);
        contents.setLayout(new GridLayout(3, false));

        _newRulesLink = new Link(contents, SWT.NONE);
        _newRulesLink.setText("<a>Rules File:</a>");
        _newRulesLink.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                openNewWizard();
            }

        });

        _rulesFileText = new Text(contents, SWT.READ_ONLY | SWT.BORDER);
        _rulesFileText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _rulesFileText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                validate();
            }

        });

        _browseRulesButton = new Button(contents, SWT.PUSH);
        _browseRulesButton.setText("Browse...");
        _browseRulesButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                handleBrowse();
            }

        });

        setControl(contents);
    }

    private void validate() {
        setErrorMessage(null);
        if (_implementation == null) {
            setErrorMessage("Please select a rules file.");
        }
        setPageComplete(getErrorMessage() == null);
    }

    private void handleBrowse() {
        IContainer container;
        if (_project == null) {
            container = ResourcesPlugin.getWorkspace().getRoot();
        } else {
            container = _project.getProject();
        }
        ClasspathResourceSelectionDialog dialog = new ClasspathResourceSelectionDialog(getShell(), container, "drl");
        if (dialog.open() == SelectionDialog.OK) {
            Object[] result = dialog.getResult();
            if (result.length > 0 && result[0] instanceof IResource) {
                IResource rulesFile = (IResource) result[0];
                String rulesFilePath = JavaUtil.getJavaPathForResource(rulesFile).toString();
                _implementation = RulesFactory.eINSTANCE.createRulesImplementationType();
                _implementation.getResource().add(NewRulesComponentWizard.createRulesResource(rulesFilePath));

                // we have no way of inferring the service interface
                _service = null;

                // update the text box, which should trigger a validate
                _rulesFileText.setText(rulesFilePath);
            }
        }
    }

    private void openNewWizard() {
        NewRulesComponentWizard wizard = new NewRulesComponentWizard(false);
        SwitchyardSCAEditor editor = SwitchyardSCAEditor.getActiveEditor();
        IResource resource = JavaUtil.getFirstResourceRoot(_project);
        IStructuredSelection selection = resource == null ? StructuredSelection.EMPTY : new StructuredSelection(
                resource);
        IWorkbench workbench = editor == null ? PlatformUI.getWorkbench() : editor.getEditorSite().getWorkbenchWindow()
                .getWorkbench();
        wizard.init(workbench, selection);
        wizard.forceServiceInterfaceType(_serviceInterface);
        WizardDialog dialog = new WizardDialog(getShell(), wizard);
        if (dialog.open() == WizardDialog.OK) {
            _implementation = (RulesImplementationType) wizard.getCreatedObject().getImplementation();
            _service = wizard.getService();
            _rulesFileText.setText(wizard.getCreatedFilePath());
        }
    }

}
