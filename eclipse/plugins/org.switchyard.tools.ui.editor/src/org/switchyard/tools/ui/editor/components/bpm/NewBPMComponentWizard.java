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
package org.switchyard.tools.ui.editor.components.bpm;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.switchyard.tools.models.switchyard1_0.bpm.AuditType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMFactory;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.TaskHandlerType;
import org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage;
import org.switchyard.tools.ui.editor.diagram.shared.BaseNewServiceFileWizard;

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

    private BPMImplementationType _implementation;
    private NewBPMProcessDetailsWizardPage _processPage;

    // private NewBPMActionConfigurationWizardPage _actionsPage;
    // private NewBPMExtraResourcesWizardPage _resourcesPage;

    /**
     * TODO: move this someplace more sensible.
     * 
     * @return a configured TaskHandler for handling "SwitchYard Service" tasks.
     */
    public static TaskHandlerType createSwitchYardServiceTaskHandler() {
        TaskHandlerType switchYardServiceHandler = BPMFactory.eINSTANCE.createTaskHandlerType();
        switchYardServiceHandler.setClass("org.switchyard.component.bpm.task.work.SwitchYardServiceTaskHandler");
        switchYardServiceHandler.setName("SwitchYard Service");
        return switchYardServiceHandler;
    }

    /**
     * Create a new NewBPMComponentWizard.
     * 
     * @param openAfterCreate true if the new file should be opened in an
     *            editor.
     */
    public NewBPMComponentWizard(boolean openAfterCreate) {
        super(openAfterCreate, "bpmn");
    }

    @Override
    public void addPages() {
        super.addPages();

        WizardNewFileCreationPage page = getFileCreationPage();
        page.setTitle("New SwitchYard BPMN File");
        page.setDescription("Create a new SwitchYard BPMN file.");
        if (getService() == null) {
            page.setFileName("ProcessComponent.bpmn");
        } else {
            page.setFileName("" + getService().getName() + "Process.bpmn");
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
        if (_processPage.getMessageInName() == null) {
            _implementation.eUnset(BPMPackage.eINSTANCE.getBPMImplementationType_MessageContentInName());
        } else {
            _implementation.setMessageContentInName(_processPage.getMessageInName());
        }
        if (_processPage.getMessageOutName() == null) {
            _implementation.eUnset(BPMPackage.eINSTANCE.getBPMImplementationType_MessageContentOutName());
        } else {
            _implementation.setMessageContentOutName(_processPage.getMessageOutName());
        }
        _implementation.setPersistent(_processPage.isPersistent());
        if (_processPage.isAuditingEnabled()) {
            AuditType auditSettings = _processPage.getAuditSettings();
            if (auditSettings.getLog() == null) {
                auditSettings.eUnset(CommonRulesPackage.eINSTANCE.getAuditType1_Log());
            }
            _implementation.setAudit(auditSettings);

        } else {
            _implementation.setAudit(null);
        }

        // TODO: prompt user for TaskHandler configuration
        // add the required "SwitchYard Service" task handler
        _implementation.getTaskHandler().add(createSwitchYardServiceTaskHandler());

        if (!super.performFinish()) {
            return false;
        }

        _implementation.setProcessDefinition(getCreatedFilePath());

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
        // this is crappy. ideally we would be using the bpmn2 model to do this.
        final StringBuffer buf = new StringBuffer();
        final String messageIn = _implementation.getMessageContentInName();
        final String messageOut = _implementation.getMessageContentOutName();
        final String messageInItem = "_" + messageIn + "Item";
        final String messageOutItem = "_" + messageOut + "Item";
        String lineSeparator;
        try {
            lineSeparator = JavaCore.create(ResourcesPlugin.getWorkspace().getRoot()).findRecommendedLineSeparator();
        } catch (JavaModelException e1) {
            lineSeparator = "\n";
        }
        buf.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>").append(lineSeparator);
        buf.append(
                "<definitions id=\"Definition_1\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"http://www.omg.org/spec/BPMN/20100524/MODEL\" xmlns:bpmndi=\"http://www.omg.org/spec/BPMN/20100524/DI\" xmlns:dc=\"http://www.omg.org/spec/DD/20100524/DC\" xmlns:di=\"http://www.omg.org/spec/DD/20100524/DI\" xmlns:tns=\"http://www.jboss.org/drools\" xsi:schemaLocation=\"http://www.omg.org/spec/BPMN/20100524/MODEL BPMN20.xsd\" targetNamespace=\"http://www.jboss.org/drools\">")
                .append(lineSeparator);
        buf.append("    <itemDefinition id=\"").append(messageInItem).append("\"/>").append(lineSeparator);
        buf.append("    <itemDefinition id=\"").append(messageOutItem).append("\"/>").append(lineSeparator);
        buf.append("    <process id=\"").append(_implementation.getProcessId()).append("\" tns:packageName=\"")
                .append(_processPage.getPackageName()).append("\" name=\"").append(_processPage.getProcessName())
                .append("\" isExecutable=\"true\" processType=\"Private\">").append(lineSeparator);
        buf.append("        <!-- process variables -->").append(lineSeparator);
        buf.append("        <property id=\"").append(messageIn).append("\" itemSubjectRef=\"").append(messageInItem)
                .append("\"/>").append(lineSeparator);
        buf.append("        <property id=\"").append(messageOut).append("\" itemSubjectRef=\"").append(messageOutItem)
                .append("\"/>").append(lineSeparator);
        buf.append("        <startEvent id=\"StartEvent_1\">").append(lineSeparator);
        buf.append("            <outgoing>SequenceFlow_1</outgoing>").append(lineSeparator);
        buf.append("        </startEvent>").append(lineSeparator);
        buf.append(
                "        <sequenceFlow id=\"SequenceFlow_1\" tns:priority=\"1\" sourceRef=\"StartEvent_1\" targetRef=\"EndEvent_1\"/>")
                .append(lineSeparator);
        buf.append("        <endEvent id=\"EndEvent_1\">").append(lineSeparator);
        buf.append("            <incoming>SequenceFlow_1</incoming>").append(lineSeparator);
        buf.append("        </endEvent>").append(lineSeparator);
        buf.append("    </process>").append(lineSeparator);
        // i wish there were a way we could get away without having to
        // initialize layout
        buf.append("    <bpmndi:BPMNDiagram>").append(lineSeparator);
        buf.append("        <bpmndi:BPMNPlane bpmnElement=\"").append(_implementation.getProcessId()).append("\" >")
                .append(lineSeparator);
        buf.append("            <bpmndi:BPMNShape id=\"BPMNShape_StartEvent_1\" bpmnElement=\"StartEvent_1\" >")
                .append(lineSeparator);
        buf.append("                <dc:Bounds x=\"50\" y=\"50\" width=\"48\" height=\"48\" />").append(lineSeparator);
        buf.append("            </bpmndi:BPMNShape>").append(lineSeparator);
        buf.append("            <bpmndi:BPMNShape id=\"BPMNShape_EndEvent_1\" bpmnElement=\"EndEvent_1\" >").append(
                lineSeparator);
        buf.append("                <dc:Bounds x=\"200\" y=\"50\" width=\"48\" height=\"48\" />").append(lineSeparator);
        buf.append("            </bpmndi:BPMNShape>").append(lineSeparator);
        buf.append(
                "            <bpmndi:BPMNEdge id=\"BPMNEdge_SequenceFlow_1\" bpmnElement=\"SequenceFlow_1\" sourceElement=\"BPMNShape_StartEvent_1\" targetElement=\"BPMNShape_EndEvent_1\">")
                .append(lineSeparator);
        buf.append("                <di:waypoint x=\"98\" y=\"74\" />").append(lineSeparator);
        buf.append("                <di:waypoint x=\"200\" y=\"74\" />").append(lineSeparator);
        buf.append("            </bpmndi:BPMNEdge>").append(lineSeparator);
        buf.append("        </bpmndi:BPMNPlane>").append(lineSeparator);
        buf.append("    </bpmndi:BPMNDiagram>").append(lineSeparator);
        buf.append("</definitions>").append(lineSeparator);

        try {
            return new ByteArrayInputStream(buf.toString().getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            // something better than nothing
            return new ByteArrayInputStream(buf.toString().getBytes());
        }
    }

}
