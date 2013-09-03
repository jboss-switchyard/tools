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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Status;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMFactory;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMOperationType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.InputsType;
import org.switchyard.tools.models.switchyard1_0.bpm.LoggerType1;
import org.switchyard.tools.models.switchyard1_0.bpm.LoggersType;
import org.switchyard.tools.models.switchyard1_0.bpm.ManifestType;
import org.switchyard.tools.models.switchyard1_0.bpm.MappingType;
import org.switchyard.tools.models.switchyard1_0.bpm.OperationType;
import org.switchyard.tools.models.switchyard1_0.bpm.OutputsType;
import org.switchyard.tools.models.switchyard1_0.bpm.ResourceType;
import org.switchyard.tools.models.switchyard1_0.bpm.ResourcesType;
import org.switchyard.tools.ui.bpmn2.Messages;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.diagram.shared.BaseNewServiceFileWizard;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;

/**
 * NewBPMComponentWizard
 * 
 * <p/>
 * Wizard for collecting data necessary for creating new BPM services
 * (components).
 * 
 * @author Rob Cernich
 */
public class NewBPMComponentWizard extends BaseNewServiceFileWizard implements INewWizard {

    private static final String TEMPLATE = "ProcessTemplate.ftl"; //$NON-NLS-1$
    private static final String PACKAGE_NAME_PARAM = "packageName"; //$NON-NLS-1$
    private static final String PROCESS_NAME_PARAM = "processName"; //$NON-NLS-1$
    private static final String PROCESS_ID_PARAM = "processID"; //$NON-NLS-1$
    private static final String MESSAGE_IN_NAME_PARAM = "messageInName"; //$NON-NLS-1$
    private static final String MESSAGE_OUT_NAME_PARAM = "messageOutName"; //$NON-NLS-1$

    private BPMImplementationType _implementation;
    private NewBPMProcessDetailsWizardPage _processPage;

    // private NewBPMActionConfigurationWizardPage _actionsPage;
    // private NewBPMExtraResourcesWizardPage _resourcesPage;

    /**
     * Create a new NewBPMComponentWizard.
     * 
     * @param openAfterCreate true if the new file should be opened in an
     *            editor.
     */
    public NewBPMComponentWizard(boolean openAfterCreate) {
        super(openAfterCreate, "bpmn"); //$NON-NLS-1$
    }

    @Override
    public void addPages() {
        super.addPages();

        WizardNewFileCreationPage page = getFileCreationPage();
        page.setTitle(Messages.title_newSwitchYardBpmnFile);
        page.setDescription(Messages.description_newSwitchYardBpmnFile);
        if (getService() == null) {
            page.setFileName("ProcessComponent.bpmn"); //$NON-NLS-1$
        } else {
            page.setFileName("" + getService().getName() + "Process.bpmn"); //$NON-NLS-1$ //$NON-NLS-2$
        }

        _processPage = new NewBPMProcessDetailsWizardPage(NewBPMProcessDetailsWizardPage.class.getCanonicalName());
        addPage(_processPage);

        // _actionsPage = new
        // NewBPMActionConfigurationWizardPage(NewBPMActionConfigurationWizardPage.class.getCanonicalName());
        // addPage(_processPage);
        //
        // _resourcesPage = new
        // NewBPMExtraResourcesWizardPage(NewBPMExtraResourcesWizardPage.class.getCanonicalName());
        // addPage(_processPage);
    }

    @Override
    public boolean performFinish() {
        // make sure the implementation is initialized (to get correct defaults)
        _implementation = BPMFactory.eINSTANCE.createBPMImplementationType();
        _implementation.setProcessId(_processPage.getProcessId());

        final BPMOperationType startAction = BPMFactory.eINSTANCE.createBPMOperationType();
        startAction.setType(OperationType.STARTPROCESS);
        if (_processPage.getMessageInName() == null) {
            startAction.setInputs(null);
        } else {
            final InputsType inputs = BPMFactory.eINSTANCE.createInputsType();
            final MappingType inputMapping = BPMFactory.eINSTANCE.createMappingType();
            inputMapping.setFrom("message.content"); //$NON-NLS-1$
            inputMapping.setTo(_processPage.getMessageInName());

            inputs.getInput().add(inputMapping);
            startAction.setInputs(inputs);
        }

        if (_processPage.getMessageOutName() == null) {
            startAction.setOutputs(null);
        } else {
            final OutputsType outputs = BPMFactory.eINSTANCE.createOutputsType();
            final MappingType outputMapping = BPMFactory.eINSTANCE.createMappingType();
            outputMapping.setFrom(_processPage.getMessageOutName());
            outputMapping.setTo("message.content"); //$NON-NLS-1$

            outputs.getOutput().add(outputMapping);
            startAction.setOutputs(outputs);
        }

        _implementation.setOperations(BPMFactory.eINSTANCE.createOperationsType());
        _implementation.getOperations().getOperation().add(startAction);

        _implementation.setPersistent(_processPage.isPersistent());

        if (_processPage.isAuditingEnabled()) {
            LoggerType1 auditSettings = _processPage.getAuditSettings();
            if (auditSettings.getLog() == null) {
                auditSettings.eUnset(BPMPackage.eINSTANCE.getLoggerType1_Log());
            }
            final LoggersType loggersType = BPMFactory.eINSTANCE.createLoggersType();
            loggersType.getLogger().add(auditSettings);
            _implementation.setLoggers(loggersType);

        } else {
            _implementation.setLoggers(null);
        }

        if (!super.performFinish()) {
            return false;
        }

        final ManifestType manifest = BPMFactory.eINSTANCE.createManifestType();
        final ResourcesType resources = BPMFactory.eINSTANCE.createResourcesType();
        final ResourceType resource = BPMFactory.eINSTANCE.createResourceType();
        resource.setLocation(getCreatedFilePath());
        resource.setType("BPMN2"); //$NON-NLS-1$

        resources.getResource().add(resource);
        manifest.setResources(resources);
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
        _processPage.update(getJavaProject(), getFileCreationPage().getFileName(), getService());

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
            parameters.put(PACKAGE_NAME_PARAM, _processPage.getPackageName());
            parameters.put(PROCESS_NAME_PARAM, _processPage.getProcessName());
            parameters.put(PROCESS_ID_PARAM, _processPage.getProcessId());
            parameters.put(MESSAGE_IN_NAME_PARAM,
                    _processPage.getMessageInName() == null ? "Parameter" : _processPage.getMessageInName()); //$NON-NLS-1$
            parameters.put(MESSAGE_OUT_NAME_PARAM,
                    _processPage.getMessageOutName() == null ? "Result" : _processPage.getMessageOutName()); //$NON-NLS-1$

            template.process(parameters, new PrintWriter(baos));
            return new ByteArrayInputStream(baos.toByteArray());
        } catch (Exception e) {
            Activator.getDefault().getLog()
                    .log(new Status(Status.ERROR, Activator.PLUGIN_ID, Messages.error_errorCreatingBpmn2File, e));
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
