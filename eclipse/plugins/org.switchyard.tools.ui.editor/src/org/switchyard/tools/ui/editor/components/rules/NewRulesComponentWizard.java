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

import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage;
import org.switchyard.tools.models.switchyard1_0.rules.AuditType;
import org.switchyard.tools.models.switchyard1_0.rules.ResourceType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesFactory;
import org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesPackage;
import org.switchyard.tools.ui.editor.Activator;
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

    private static final String TEMPLATE = "RulesTemplate.ftl";
    private static final String PACKAGE_NAME_PARAM = "packageName";
    private static final String COMPONENT_NAME_PARAM = "componentName";
    private static final String SERVICE_NAME_PARAM = "serviceName";

    private RulesImplementationType _implementation;
    private NewRulesDetailsWizardPage _processPage;

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
        rulesResource.setType("DRL");
        return rulesResource;
    }

    /**
     * Create a new NewRulesComponentWizard.
     * 
     * @param openAfterCreate true if the new file should be opened in an
     *            editor.
     */
    public NewRulesComponentWizard(boolean openAfterCreate) {
        super(openAfterCreate, "drl");
    }

    @Override
    public void addPages() {
        super.addPages();

        WizardNewFileCreationPage page = getFileCreationPage();
        page.setTitle("New SwitchYard Rules File");
        page.setDescription("Create a new SwitchYard Rules file.");
        if (getService() == null) {
            page.setFileName("RulesComponent.drl");
        } else {
            page.setFileName("" + getService().getName() + "Rules.drl");
        }

        _processPage = new NewRulesDetailsWizardPage(NewRulesDetailsWizardPage.class.getCanonicalName());
        addPage(_processPage);

        // _actionsPage = new
        // NewRulesActionConfigurationWizardPage(NewRulesActionConfigurationWizardPage.class.getCanonicalName());
        // addPage(_processPage);
        //
        // _resourcesPage = new
        // NewRulesExtraResourcesWizardPage(NewRulesExtraResourcesWizardPage.class.getCanonicalName());
        // addPage(_processPage);
    }

    @Override
    public boolean performFinish() {
        // make sure the implementation is initialized (to get correct defaults)
        _implementation = RulesFactory.eINSTANCE.createRulesImplementationType();
        if (_processPage.getMessageName() == null) {
            _implementation.eUnset(RulesPackage.eINSTANCE.getRulesImplementationType_MessageContentName());
        } else {
            _implementation.setMessageContentName(_processPage.getMessageName());
        }
        if (_processPage.isAuditingEnabled()) {
            AuditType auditSettings = _processPage.getAuditSettings();
            if (auditSettings.getLog() == null) {
                auditSettings.eUnset(CommonRulesPackage.eINSTANCE.getAuditType1_Log());
            }
            _implementation.setAudit(auditSettings);

        } else {
            _implementation.setAudit(null);
        }

        if (!super.performFinish()) {
            return false;
        }

        _implementation.getResource().add(createRulesResource(getCreatedFilePath()));

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
        _processPage.update(getJavaProject());

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
            config.setClassForTemplateLoading(getClass(), "");
            config.setObjectWrapper(new DefaultObjectWrapper());

            Template template = config.getTemplate(TEMPLATE);

            Map<String, Object> parameters = new HashMap<String, Object>();
            parameters.put(PACKAGE_NAME_PARAM, _processPage.getPackageName());
            parameters.put(COMPONENT_NAME_PARAM, getComponentName(new Path(getFileCreationPage().getFileName())));
            parameters.put(SERVICE_NAME_PARAM, getService().getName());

            template.process(parameters, new PrintWriter(baos));
            return new ByteArrayInputStream(baos.toByteArray());
        } catch (Exception e) {
            Activator.getDefault().getLog()
                    .log(new Status(Status.ERROR, Activator.PLUGIN_ID, "Error occurred creating drl file.", e));
            return null;
        } finally {
            try {
                baos.close();
            } catch (IOException e) {
                e.fillInStackTrace();
            }
        }
    }

}
