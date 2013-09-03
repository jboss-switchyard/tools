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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.switchyard.tools.models.switchyard1_0.rules.ManifestType;
import org.switchyard.tools.models.switchyard1_0.rules.ResourceType;
import org.switchyard.tools.models.switchyard1_0.rules.ResourcesType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesFactory;
import org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.common.ContractControl;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.shared.BaseNewServiceFileWizard;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;

/**
 * NewRulesComponentWizard
 * 
 * <p/>
 * Wizard for collecting data necessary for creating new rules services
 * (components).
 * 
 * @author Rob Cernich
 */
public class NewRulesComponentWizard extends BaseNewServiceFileWizard implements INewWizard {

    private static final String TEMPLATE = "RulesTemplate.ftl"; //$NON-NLS-1$
    private static final String PACKAGE_NAME_PARAM = "packageName"; //$NON-NLS-1$
    private static final String COMPONENT_NAME_PARAM = "componentName"; //$NON-NLS-1$
    private static final String SERVICE_NAME_PARAM = "serviceName"; //$NON-NLS-1$

    private RulesImplementationType _implementation;
//    private NewRulesDetailsWizardPage _processPage;
    private WizardNewFileCreationPage _page;
    private IJavaProject _project;

    // private NewRulesActionConfigurationWizardPage _actionsPage;
    // private NewRulesExtraResourcesWizardPage _resourcesPage;

    /**
     * TODO: move this someplace more sensible (like RulesFactory?).
     * 
     * @param location the location of the rules file (on the classpath).
     * 
     * @return a configured Resource for the underlying rules file.
     */
    public static ResourceType createRulesResource(String location) {
        ResourceType rulesResource = RulesFactory.eINSTANCE.createResourceType();
        rulesResource.setLocation(location);
        rulesResource.setType("DRL"); //$NON-NLS-1$
        return rulesResource;
    }

    /**
     * Create a new NewRulesComponentWizard.
     * 
     * @param openAfterCreate true if the new file should be opened in an
     *            editor.
     */
    public NewRulesComponentWizard(boolean openAfterCreate) {
        super(openAfterCreate, "drl"); //$NON-NLS-1$
    }

    @Override
    public void addPages() {
//        super.addPages();

        _page = new RulesServiceImplementationFileCreationPage("newFilePage1", getSelection()); //$NON-NLS-1$
        _page.setTitle(Messages.title_newSwitchYardRulesFile);
        _page.setDescription(Messages.description_newSwitchYardRulesFile);
        if (getService() == null) {
            _page.setFileName("RulesComponent.drl"); //$NON-NLS-1$
        } else {
            _page.setFileName("" + getService().getName() + "Rules.drl"); //$NON-NLS-1$ //$NON-NLS-2$
        }
        if (getCreatedFilePath() != null) {
            _page.setFileName(getCreatedFilePath());
        }
        if (getFileExtension() != null) {
            _page.setFileExtension(getFileExtension());
        }
        setFileCreationPage(_page);
        addPage(_page);

//        _processPage = new NewRulesDetailsWizardPage(NewRulesDetailsWizardPage.class.getCanonicalName());
//        addPage(_processPage);

        // _actionsPage = new
        // NewRulesActionConfigurationWizardPage(NewRulesActionConfigurationWizardPage.class.getCanonicalName());
        // addPage(_processPage);
        //
        // _resourcesPage = new
        // NewRulesExtraResourcesWizardPage(NewRulesExtraResourcesWizardPage.class.getCanonicalName());
        // addPage(_processPage);
    }

    protected WizardNewFileCreationPage getFileCreationPage() {
        return _page;
    }

    @Override
    public boolean performFinish() {
        // make sure the implementation is initialized (to get correct defaults)
        _implementation = RulesFactory.eINSTANCE.createRulesImplementationType();

//        if (_processPage.isAuditingEnabled()) {
//            LoggerType1 auditSettings = _processPage.getAuditSettings();
//            if (auditSettings.getLog() == null) {
//                auditSettings.eUnset(RulesPackage.eINSTANCE.getLoggerType1_Log());
//            }
//            final LoggersType loggers = RulesFactory.eINSTANCE.createLoggersType();
//            loggers.getLogger().add(auditSettings);
//            _implementation.setLoggers(loggers);
//
//        } else {
            _implementation.setLoggers(null);
//        }

        if (!super.performFinish()) {
            return false;
        }

        final ManifestType manifest = RulesFactory.eINSTANCE.createManifestType();
        final ResourcesType resources = RulesFactory.eINSTANCE.createResourcesType();
        final ResourceType resource = createRulesResource(getCreatedFilePath());
        manifest.setResources(resources);
        resources.getResource().add(resource);
        _implementation.setManifest(manifest);

        return true;
    }

    @Override
    protected Implementation createImplementation() {
        return _implementation;
    }

    @Override
    protected List<ComponentReference> createReferences() {
        return Collections.emptyList();
    }

    @Override
    public boolean canFinish() {
        ((RulesServiceImplementationFileCreationPage)_page).update(getJavaProject());

        // _processPage.update(getJavaProject());

        // TODO: don't validate optional pages, i.e. actions and resources
        // for (IWizardPage page : getPages()) {
        // if (!page.isPageComplete()
        // && ((page == _actionsPage && _processPage.isActionConfigEnabled())
        // || (page == _resourcesPage && _processPage
        // .isResourceConfigEnabled()))) {
        // return false;
        // }
        // }
        // return true;
        return super.canFinish();
    }

    @Override
    public IWizardPage getNextPage(IWizardPage page) {
        final IWizardPage nextPage = super.getNextPage(page);
        // TODO: enablement for action and resources
        // if (nextPage == _actionsPage &&
        // !_processPage.isActionConfigEnabled()) {
        // return getNextPage(nextPage);
        // } else if (nextPage == _resourcesPage &&
        // !_processPage.isResourceConfigEnabled()) {
        // return getNextPage(nextPage);
        // }
        return nextPage;
    }

    @Override
    protected InputStream getInitialContents() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            Configuration config = new Configuration();
            config.setClassForTemplateLoading(getClass(), ""); //$NON-NLS-1$
            config.setObjectWrapper(new DefaultObjectWrapper());

            Template template = config.getTemplate(TEMPLATE);

            Map<String, Object> parameters = new HashMap<String, Object>();
            parameters.put(PACKAGE_NAME_PARAM, ((RulesServiceImplementationFileCreationPage)_page).getPackageName());
            parameters.put(COMPONENT_NAME_PARAM, getComponentName(new Path(getFileCreationPage().getFileName())));
            parameters.put(SERVICE_NAME_PARAM, getService().getName());

            template.process(parameters, new PrintWriter(baos));
            return new ByteArrayInputStream(baos.toByteArray());
        } catch (Exception e) {
            Activator.getDefault().getLog()
                    .log(new Status(Status.ERROR, Activator.PLUGIN_ID, Messages.error_creatingDrlFile, e));
            return null;
        } finally {
            try {
                baos.close();
            } catch (IOException e) {
                e.fillInStackTrace();
            }
        }
    }

    protected IJavaProject getJavaProject() {
        if (_page == null) {
            return null;
        }
        IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(_page.getContainerFullPath());
        if (resource == null || resource.getProject() == null) {
            _project = null;
        } else if (_project == null || !_project.getProject().equals(resource.getProject())) {

            _project = JavaCore.create(resource.getProject());
        }
        return _project;
    }

    private class RulesServiceImplementationFileCreationPage extends WizardNewFileCreationPage {

        private ContractControl _contractControl;
        private String _packageName;
        private Text _packageNameText;
        private String _oldPackageName;

        public RulesServiceImplementationFileCreationPage(String pageName, IStructuredSelection selection) {
            super(pageName, selection);
        }

        @Override
        protected InputStream getInitialContents() {
            return NewRulesComponentWizard.this.getInitialContents();
        }

        @Override
        protected void createAdvancedControls(Composite parent) {
            Composite contents = new Composite(parent, SWT.NONE);
            contents.setLayout(new GridLayout(3, false));
            contents.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

            _contractControl = new ContractControl(ScaPackage.eINSTANCE.getComponentService(), getJavaProject(),
                    NewRulesComponentWizard.this.getSupportedInterfaceTypes());
            _contractControl.createControl(contents, 3);
            _contractControl.addSelectionChangedListener(new ISelectionChangedListener() {
                @Override
                public void selectionChanged(SelectionChangedEvent event) {
                    setPageComplete(validatePage());
                }
            });

            if (getService() != null) {
                _contractControl.init(getService(), null);
                _contractControl.setEnabled(false);
            }
            // get the new instance
            NewRulesComponentWizard.this.setService((ComponentService) _contractControl.getContract());

            // add a separator
            Label separator = new Label(contents, SWT.SEPARATOR | SWT.HORIZONTAL);
            GridData lineGD = new GridData(GridData.FILL_HORIZONTAL);
            lineGD.horizontalSpan = 3;
            separator.setLayoutData(lineGD);
            
            // now add the package field (used to be on detail page)
            createLabel(contents, Messages.label_packageName);
            _packageNameText = new Text(contents, SWT.SINGLE | SWT.BORDER);
            GridData gd = new GridData(GridData.FILL_HORIZONTAL);
            gd.horizontalSpan = 2;
            _packageNameText.setLayoutData(gd);
            _packageNameText.addModifyListener(new ModifyListener() {
                @Override
                public void modifyText(ModifyEvent event) {
                    _packageName = _packageNameText.getText();
                }
            });

        }

        private Label createLabel(Composite parent, String text) {
            Label label = new Label(parent, SWT.NONE);
            label.setText(text);
            return label;
        }

        private String emptyForNull(String string) {
            return string == null ? "" : string; //$NON-NLS-1$
        }

        /**
         * Update the default values based on the setting in the file page.
         * 
         * @param project the currently targeted Java project.
         */
        public void update(IJavaProject project) {
            final String newPackageName;
            if (project == null) {
                newPackageName = ""; //$NON-NLS-1$
            } else {
                IJavaElement element = JavaUtil.getInitialPackageForProject(project);
                if (element.getElementType() == IJavaElement.PACKAGE_FRAGMENT) {
                    newPackageName = ((IPackageFragment) element).getElementName();
                } else {
                    newPackageName = ""; //$NON-NLS-1$
                }
            }
            if (updateDefault(_oldPackageName, newPackageName, _packageNameText.getText())) {
                setPackageName(newPackageName);
            }
            _oldPackageName = newPackageName;
        }

        private boolean updateDefault(String oldValue, String newValue, String currentValue) {
            return !currentValue.equals(newValue)
                    && (oldValue == null || oldValue.length() == 0 || currentValue.length() == 0 || oldValue
                            .equals(currentValue));
        }

        /**
         * @return the package name.
         */
        public String getPackageName() {
            return emptyForNull(_packageName);
        }

        /**
         * @param packageName The package name to set.
         */
        public void setPackageName(String packageName) {
            if (_packageNameText == null) {
                _packageName = packageName;
            } else {
                _packageNameText.setText(packageName);
            }
        }

        @Override
        protected boolean validatePage() {
            if (super.validatePage()) {
                _contractControl.setProject(getJavaProject());
                IStatus status = _contractControl.getStatus();
                if (status.getSeverity() < Status.ERROR) {
                    if (!status.isOK()) {
                        setMessage(status.getMessage(), status.getSeverity() == IStatus.WARNING ? WARNING : INFORMATION);
                    }
                    return true;
                }
                setErrorMessage(status.getMessage());
                return false;
            }
            return false;
        }

        @Override
        protected IStatus validateLinkedResource() {
            return Status.OK_STATUS;
        }

        @Override
        protected void createLinkTarget() {
        }

    }

}
