/*************************************************************************************
 * Copyright (c) 2012-2014 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.editor.components.rules;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
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
import org.switchyard.tools.models.switchyard1_0.rules.ContainerType;
import org.switchyard.tools.models.switchyard1_0.rules.ManifestType;
import org.switchyard.tools.models.switchyard1_0.rules.RemoteJmsType;
import org.switchyard.tools.models.switchyard1_0.rules.RemoteRestType;
import org.switchyard.tools.models.switchyard1_0.rules.ResourceType;
import org.switchyard.tools.models.switchyard1_0.rules.ResourcesType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesFactory;
import org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.PlatformResourceAdapterFactory;
import org.switchyard.tools.ui.common.ClasspathResourceSelectionDialog;
import org.switchyard.tools.ui.editor.Messages;
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

    private Component _component;
    private ComponentService _serviceInterface;
    private Link _newRulesLink;
    private Text _rulesFileText;
    private Button _browseRulesButton;
    private IJavaProject _project;
    private RulesImplementationType _implementation;
    private ResourcesType _resources = RulesFactory.eINSTANCE.createResourcesType();
    private ContainerType _container = RulesFactory.eINSTANCE.createContainerType();
    private RemoteJmsType _remoteJms = RulesFactory.eINSTANCE.createRemoteJmsType();
    private RemoteRestType _remoteRest = RulesFactory.eINSTANCE.createRemoteRestType();
    
    private ComponentService _service;
    private RemoteRestContainerDetailsComposite _remoteRestContainerDetailsControls;
    private RemoteJMSContainerDetailsComposite _remoteJMSContainerDetailsControls;

    /**
     * Create a new RulesImplementationWizardPage.
     * 
     * @param pageName the page name.
     */
    public RulesImplementationWizardPage(String pageName) {
        super(pageName);
        setTitle(Messages.title_rulesImplementationDetails);
        setDescription(Messages.description_rulesImplementationDetails);
        setPageComplete(false);
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
        final Button remoteJMSRadio = factory.createButton(resourceButtonsComposite, "Remote JMS", SWT.RADIO);
        final Button remoteRESTRadio = factory.createButton(resourceButtonsComposite, "Remote REST", SWT.RADIO);

        Composite resourceDetailsComposite = factory.createComposite(contents);
        resourceDetailsComposite.setLayout(manifestLayout);
        resourceDetailsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        final Composite resourceControls = createResourceControls(resourceDetailsComposite);
        final KIEContainerDetailsComposite containerControls = new KIEContainerDetailsComposite(
                resourceDetailsComposite, factory);
        containerControls.setContainer(_container);
        _remoteJMSContainerDetailsControls = new RemoteJMSContainerDetailsComposite(null, resourceDetailsComposite, SWT.NONE, factory);
        _remoteJMSContainerDetailsControls.setRemoteJMS(_remoteJms);
        _remoteJMSContainerDetailsControls.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                validate();
            }
        });
        _remoteRestContainerDetailsControls = new RemoteRestContainerDetailsComposite(null, resourceDetailsComposite, SWT.NONE, factory);
        _remoteRestContainerDetailsControls.setRemoteREST(_remoteRest);
        _remoteRestContainerDetailsControls.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                validate();
            }
        });

        resourcesRadio.setSelection(true);
        manifestLayout.topControl = resourceControls;

        SelectionListener radioListener = new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                if (_implementation == null) {
                    _implementation = RulesFactory.eINSTANCE.createRulesImplementationType();
                }
                if (_implementation.getManifest() == null) {
                    _implementation.setManifest(RulesFactory.eINSTANCE.createManifestType());
                }
                if (resourcesRadio.getSelection()) {
                    manifestLayout.topControl = resourceControls;
                    resourceControls.getParent().layout();
                    _implementation.getManifest().setContainer(null);
                    _implementation.getManifest().setResources(_resources);
                    _implementation.getManifest().setRemoteJms(null);
                    _implementation.getManifest().setRemoteRest(null);
                } else if (containerRadio.getSelection()) {
                    manifestLayout.topControl = containerControls;
                    containerControls.getParent().layout();
                    _implementation.getManifest().setResources(null);
                    _implementation.getManifest().setContainer(_container);
                    _implementation.getManifest().setRemoteJms(null);
                    _implementation.getManifest().setRemoteRest(null);
                } else if (remoteRESTRadio.getSelection()) {
                    manifestLayout.topControl = _remoteRestContainerDetailsControls;
                    _remoteRestContainerDetailsControls.getParent().layout();
                    _implementation.getManifest().setResources(null);
                    _implementation.getManifest().setContainer(null);
                    _implementation.getManifest().setRemoteJms(null);
                    _implementation.getManifest().setRemoteRest(_remoteRest);
                } else if (remoteJMSRadio.getSelection()) {
                    manifestLayout.topControl = _remoteJMSContainerDetailsControls;
                    _remoteJMSContainerDetailsControls.getParent().layout();
                    _implementation.getManifest().setResources(null);
                    _implementation.getManifest().setContainer(null);
                    _implementation.getManifest().setRemoteJms(_remoteJms);
                    _implementation.getManifest().setRemoteRest(null);
                }
                validate();
            }
        };

        resourcesRadio.addSelectionListener(radioListener);
        containerRadio.addSelectionListener(radioListener);
        remoteRESTRadio.addSelectionListener(radioListener);
        remoteJMSRadio.addSelectionListener(radioListener);

        setControl(contents);
    }

    private Composite createResourceControls(Composite parent) {
        Composite contents = new Composite(parent, SWT.NONE);
        contents.setLayout(new GridLayout(3, false));
        contents.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));

        _newRulesLink = new Link(contents, SWT.NONE);
        _newRulesLink.setText(Messages.link_rulesFile);
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
        _browseRulesButton.setText(Messages.button_browse);
        _browseRulesButton.addSelectionListener(new SelectionAdapter() {
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
            setErrorMessage(Messages.error_noRulesFile);
        }
        if (_implementation != null && _implementation.getManifest() != null) {
            ManifestType manifest = _implementation.getManifest();
            if (manifest.getRemoteJms() != null) {
                IStatus jmsStatus = _remoteJMSContainerDetailsControls.validate();
                if (jmsStatus != Status.OK_STATUS) {
                    setErrorMessage(jmsStatus.getMessage());
                }
            } else if (manifest.getRemoteRest() != null) {
                IStatus restStatus = _remoteRestContainerDetailsControls.validate();
                if (restStatus != Status.OK_STATUS) {
                    setErrorMessage(restStatus.getMessage());
                }
            }
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
        ClasspathResourceSelectionDialog dialog = new ClasspathResourceSelectionDialog(getShell(), container, "drl"); //$NON-NLS-1$
        dialog.setInitialPattern("*.drl"); //$NON-NLS-1$
        if (dialog.open() == SelectionDialog.OK) {
            Object[] result = dialog.getResult();
            if (result.length > 0 && result[0] instanceof IResource) {
                IResource rulesFile = (IResource) result[0];
                String rulesFilePath = JavaUtil.getJavaPathForResource(rulesFile).toString();
                _implementation = RulesFactory.eINSTANCE.createRulesImplementationType();
                final ManifestType manifest = RulesFactory.eINSTANCE.createManifestType();
                final ResourceType resource = NewRulesComponentWizard.createRulesResource(rulesFilePath);
                _resources.getResource().clear();
                _resources.getResource().add(resource);
                manifest.setResources(_resources);
                _implementation.setManifest(manifest);

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
        wizard.init(_component == null ? null : (org.eclipse.soa.sca.sca1_1.model.sca.Composite) _component
                .eContainer());
        wizard.forceServiceInterfaceType(_serviceInterface);
        WizardDialog dialog = new WizardDialog(getShell(), wizard);
        if (dialog.open() == WizardDialog.OK) {
            _implementation = (RulesImplementationType) wizard.getCreatedObject().getImplementation();
            _service = wizard.getService();
            _rulesFileText.setText(wizard.getCreatedFilePath());
            _resources = _implementation.getManifest().getResources();
        }
    }

}
