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
package org.switchyard.tools.ui.bpmn2.component;

import java.util.Arrays;
import java.util.HashSet;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.forms.FormColors;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMFactory;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType;
import org.switchyard.tools.models.switchyard1_0.bpm.ContainerType;
import org.switchyard.tools.models.switchyard1_0.bpm.ManifestType;
import org.switchyard.tools.models.switchyard1_0.bpm.ResourceType;
import org.switchyard.tools.models.switchyard1_0.bpm.ResourcesType;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.PlatformResourceAdapterFactory;
import org.switchyard.tools.ui.bpmn2.Messages;
import org.switchyard.tools.ui.common.ClasspathResourceSelectionDialog;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * BPMImplementationWizardPage
 * 
 * <p/>
 * Collects information for a BPM component implementation.
 * 
 * @author Rob Cernich
 */
public class BPMImplementationWizardPage extends WizardPage {

    private Component _component;
    private ComponentService _serviceInterface;
    private Link _newBPMNLink;
    private Text _bpmnFileText;
    private Button _browseBPMNButton;
    private IJavaProject _project;
    private BPMImplementationType _implementation;
    private ResourcesType _resources = BPMFactory.eINSTANCE.createResourcesType();
    private ContainerType _container = BPMFactory.eINSTANCE.createContainerType();
    private ComponentService _service;

    /**
     * Create a new BPMImplementationWizardPage.
     * 
     * @param pageName the page name.
     */
    public BPMImplementationWizardPage(String pageName) {
        super(pageName);
        setTitle(Messages.title_bpmImplementationDetails);
        setDescription(Messages.description_bpmImplementationDetails);
        setPageComplete(false);
    }

    /**
     * @return the BPM implementation configuration.
     */
    public BPMImplementationType getImplementation() {
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
        _component = component;
        if (component == null) {
            return;
        }
        IProject project = PlatformResourceAdapterFactory.getContainingProject(component);
        _project = project == null ? null : JavaCore.create(project);
        if (component.getService() == null) {
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
        contents.setLayout(new GridLayout());
        contents.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        TabbedPropertySheetWidgetFactory factory = new TabbedPropertySheetWidgetFactory();
        FormColors colors = factory.getColors();
        colors.setBackground(null);
        colors.setForeground(null);

        Composite resourceButtonsComposite = factory.createComposite(contents);
        resourceButtonsComposite.setLayout(new RowLayout());
        resourceButtonsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));

        final StackLayout manifestLayout = new StackLayout();
        final Button resourcesRadio = factory.createButton(resourceButtonsComposite, Messages.label_projectResource, SWT.RADIO);
        final Button containerRadio = factory.createButton(resourceButtonsComposite, Messages.label_knowledgeContainer, SWT.RADIO);

        Composite resourceDetailsComposite = factory.createComposite(contents);
        resourceDetailsComposite.setLayout(manifestLayout);
        resourceDetailsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        final Composite resourceControls = createResourceControls(resourceDetailsComposite);
        final KIEContainerDetailsComposite containerControls = new KIEContainerDetailsComposite(
                resourceDetailsComposite, factory);
        containerControls.setContainer(_container);

        resourcesRadio.setSelection(true);
        manifestLayout.topControl = resourceControls;

        SelectionListener radioListener = new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                if (_implementation == null) {
                    _implementation = BPMFactory.eINSTANCE.createBPMImplementationType();
                }
                if (_implementation.getManifest() == null) {
                    _implementation.setManifest(BPMFactory.eINSTANCE.createManifestType());
                }
                if (resourcesRadio.getSelection()) {
                    manifestLayout.topControl = resourceControls;
                    resourceControls.getParent().layout();
                    _implementation.getManifest().setContainer(null);
                    _implementation.getManifest().setResources(_resources);
                } else {
                    manifestLayout.topControl = containerControls;
                    containerControls.getParent().layout();
                    _implementation.getManifest().setResources(null);
                    _implementation.getManifest().setContainer(_container);
                }
                validate();
            }
        };

        resourcesRadio.addSelectionListener(radioListener);
        containerRadio.addSelectionListener(radioListener);

        setControl(contents);
    }

    private Composite createResourceControls(Composite parent) {
        Composite contents = new Composite(parent, SWT.NONE);
        contents.setLayout(new GridLayout(3, false));
        contents.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));

        _newBPMNLink = new Link(contents, SWT.NONE);
        _newBPMNLink.setText(Messages.link_bpmnFile);
        _newBPMNLink.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                openNewWizard();
            }

        });

        _bpmnFileText = new Text(contents, SWT.READ_ONLY | SWT.BORDER);
        _bpmnFileText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _bpmnFileText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                validate();
            }

        });

        _browseBPMNButton = new Button(contents, SWT.PUSH);
        _browseBPMNButton.setText(Messages.button_browse);
        _browseBPMNButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                handleBrowse();
            }

        });

        return contents;
    }

    private void validate() {
        setErrorMessage(null);
        if (_implementation == null) {
            setErrorMessage(Messages.error_noBpmnFile);
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
        ClasspathResourceSelectionDialog dialog = new ClasspathResourceSelectionDialog(getShell(), 
                container, new HashSet<String>(Arrays.asList("bpmn", "bpmn2"))); //$NON-NLS-1$
        dialog.setInitialPattern("*.bpmn"); //$NON-NLS-1$
        if (dialog.open() == SelectionDialog.OK) {
            Object[] result = dialog.getResult();
            if (result.length > 0 && result[0] instanceof IResource) {
                IResource bpmnFile = (IResource) result[0];
                String bpmnFilePath = JavaUtil.getJavaPathForResource(bpmnFile).toString();
                _implementation = BPMFactory.eINSTANCE.createBPMImplementationType();

                final ManifestType manifest = BPMFactory.eINSTANCE.createManifestType();
                final ResourceType resource = BPMFactory.eINSTANCE.createResourceType();
                resource.setLocation(bpmnFilePath);
                resource.setType("BPMN2"); //$NON-NLS-1$

                _resources.getResource().clear();
                _resources.getResource().add(resource);
                manifest.setResources(_resources);
                _implementation.setManifest(manifest);

                // TODO: see if we can get the processId
                // _implementation.setProcessId(processId);

                // we have no way of inferring the service interface
                _service = null;

                // update the text box, which should trigger a validate
                _bpmnFileText.setText(bpmnFilePath);
            }
        }
    }

    private void openNewWizard() {
        NewBPMComponentWizard wizard = new NewBPMComponentWizard(false);
        SwitchyardSCAEditor editor = SwitchyardSCAEditor.getActiveEditor();
        IResource resource = JavaUtil.getFirstResourceRoot(_project);
        IStructuredSelection selection = resource == null ? StructuredSelection.EMPTY : new StructuredSelection(
                resource);
        IWorkbench workbench = editor == null ? PlatformUI.getWorkbench() : editor.getEditorSite().getWorkbenchWindow()
                .getWorkbench();
        wizard.init(workbench, selection);
        wizard.init(_component == null ? null : (org.eclipse.soa.sca.sca1_1.model.sca.Composite) _component
                .eContainer());
        wizard.forceServiceInterfaceType(_serviceInterface);
        WizardDialog dialog = new WizardDialog(getShell(), wizard);
        if (dialog.open() == WizardDialog.OK) {
            _implementation = (BPMImplementationType) wizard.getCreatedObject().getImplementation();
            _service = wizard.getService();
            _bpmnFileText.setText(_implementation.getManifest().getResources().getResource().get(0).getLocation());
            _resources = _implementation.getManifest().getResources();
        }
    }

}
