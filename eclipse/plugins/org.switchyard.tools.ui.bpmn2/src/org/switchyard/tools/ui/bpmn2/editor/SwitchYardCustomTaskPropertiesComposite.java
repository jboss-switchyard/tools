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
package org.switchyard.tools.ui.bpmn2.editor;

import java.util.List;

import org.eclipse.bpmn2.Assignment;
import org.eclipse.bpmn2.DataAssociation;
import org.eclipse.bpmn2.DataInput;
import org.eclipse.bpmn2.FormalExpression;
import org.eclipse.bpmn2.InputOutputSpecification;
import org.eclipse.bpmn2.InputSet;
import org.eclipse.bpmn2.Task;
import org.eclipse.bpmn2.modeler.core.adapters.InsertionAdapter;
import org.eclipse.bpmn2.modeler.core.merrimac.clad.AbstractBpmn2PropertySection;
import org.eclipse.bpmn2.modeler.core.merrimac.dialogs.BooleanObjectEditor;
import org.eclipse.bpmn2.modeler.core.merrimac.dialogs.IntObjectEditor;
import org.eclipse.bpmn2.modeler.core.merrimac.dialogs.NCNameObjectEditor;
import org.eclipse.bpmn2.modeler.core.merrimac.dialogs.ObjectEditor;
import org.eclipse.bpmn2.modeler.core.merrimac.dialogs.TextObjectEditor;
import org.eclipse.bpmn2.modeler.core.runtime.ModelExtensionDescriptor;
import org.eclipse.bpmn2.modeler.core.runtime.ModelExtensionDescriptor.ModelExtensionAdapter;
import org.eclipse.bpmn2.modeler.core.runtime.ModelExtensionDescriptor.Property;
import org.eclipse.bpmn2.modeler.core.utils.ModelUtil;
import org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.property.JbpmCustomTaskDetailComposite;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Section;

/**
 * SwitchYardServiceTaskPropertiesComposite
 * 
 * <p/>
 * Custom properties control for "SwitchYard Service" custom tasks.
 * 
 * @author Rob Cernich
 */
public class SwitchYardCustomTaskPropertiesComposite extends JbpmCustomTaskDetailComposite {

    /**
     * Create a new SwitchYardServiceTaskPropertiesComposite.
     * 
     * @param parent the parent composite.
     * @param style the style bits.
     */
    public SwitchYardCustomTaskPropertiesComposite(Composite parent, int style) {
        super(parent, style);
    }

    /**
     * Create a new SwitchYardServiceTaskPropertiesComposite.
     * 
     * @param section the containing section.
     */
    public SwitchYardCustomTaskPropertiesComposite(AbstractBpmn2PropertySection section) {
        super(section);
    }

    protected void createInputParameterBindings(Task task) {
        ModelExtensionAdapter adapter = ModelExtensionDescriptor.getModelExtensionAdapter(task);
        if (adapter != null) {
            Resource resource = task.eResource();

            /*
             * This Task object has <modelExtension> properties defined in the
             * plugin.xml check if any of the <property> elements extend the
             * DataInputs or DataOutputs (i.e. the I/O Parameter mappings) and
             * create Object Editors for them. If the Task does not define these
             * parameter mappings, create temporary objects for the editors
             * (these will go away if they are not touched by the user)
             */
            List<Property> props = adapter.getProperties("ioSpecification/dataInputs/name");
            InputOutputSpecification ioSpec = task.getIoSpecification();
            if (ioSpec == null) {
                ioSpec = FACTORY.createInputOutputSpecification();
                InsertionAdapter.add(task, PACKAGE.getActivity_IoSpecification(), ioSpec);
            }
            for (Property property : props) {

                // this will become the label for the Object Editor
                String name = property.getFirstStringValue();
                // the input parameter
                DataInput parameter = null;
                // the DataInputAssociation
                DataAssociation association = null;
                for (final DataInput di : ioSpec.getDataInputs()) {
                    migrateOldInputs(di);
                    if (name.equals(di.getName())) {
                        // this is the one!
                        parameter = di;
                        for (DataAssociation da : task.getDataInputAssociations()) {
                            if (da.getTargetRef() == di) {
                                association = da;
                                break;
                            }
                        }
                        break;
                    }
                }

                // create the DataInput element (the parameter) if needed
                if (parameter == null) {
                    parameter = FACTORY.createDataInput();
                    ModelUtil.setID(parameter, resource);
                    parameter.setName(name);
                    InsertionAdapter.add(ioSpec, PACKAGE.getInputOutputSpecification_DataInputs(), parameter);

                    // create the InputSet if needed
                    InputSet inputSet = null;
                    if (ioSpec.getInputSets().size() == 0) {
                        inputSet = FACTORY.createInputSet();
                        InsertionAdapter.add(ioSpec, PACKAGE.getInputOutputSpecification_InputSets(), inputSet);
                    } else {
                        inputSet = ioSpec.getInputSets().get(0);
                    }
                    // add the parameter to the InputSet also
                    InsertionAdapter.add(inputSet, PACKAGE.getInputSet_DataInputRefs(), parameter);
                }

                // create the DataInputAssociation if needed
                if (association == null) {
                    association = FACTORY.createDataInputAssociation();
                    association.setTargetRef(parameter);
                    InsertionAdapter.add(task, PACKAGE.getActivity_DataInputAssociations(), association);
                }

                // create an Assignment and FormalExpression if needed
                // the "To" expression is the input parameter,
                // the "From" expression body is the target of the Object
                // Editor
                FormalExpression fromExpression = null;
                Assignment assignment = null;
                if (association.getAssignment().size() == 1) {
                    assignment = (Assignment) association.getAssignment().get(0);
                    fromExpression = (FormalExpression) assignment.getFrom();
                }
                if (assignment == null) {
                    assignment = FACTORY.createAssignment();
                    FormalExpression toExpression = FACTORY.createFormalExpression();
                    toExpression.setBody(parameter.getId());
                    assignment.setTo(toExpression);
                    InsertionAdapter.add(association, PACKAGE.getDataAssociation_Assignment(), assignment);
                }
                if (fromExpression == null) {
                    fromExpression = FACTORY.createFormalExpression();
                    InsertionAdapter.add(assignment, PACKAGE.getAssignment_From(), fromExpression);
                }

                if ("ServiceName".equals(name)) {
                    Section inputSection = createSection(this, "Input");
                    inputSection.setLayout(new FillLayout());
                    inputSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
                    InputOutputAssociationDetailComposite inputComposite = new InputOutputAssociationDetailComposite(
                            inputSection);
                    inputSection.setClient(inputComposite);
                    inputComposite.setBusinessObject(parameter);
                    inputSection.setText("Service Name Mapping Details");
                } else if ("ServiceOperationName".equals(name)) {
                    Section inputSection = createSection(this, "Input");
                    inputSection.setLayout(new FillLayout());
                    inputSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
                    InputOutputAssociationDetailComposite inputComposite = new InputOutputAssociationDetailComposite(
                            inputSection);
                    inputSection.setClient(inputComposite);
                    inputComposite.setBusinessObject(parameter);
                    inputSection.setText("Operation Name Mapping Details");
                } else {
                    // create the Object Editor for the "From" expression body:
                    // the data type is obtained from the DataInput <property>
                    // element from plugin.xml
                    EAttribute attribute = PACKAGE.getFormalExpression_Body();
                    String dataType = property.type;
                    ObjectEditor editor = null;
                    if ("FaultWorkItemAction".equals(name)) {
                        editor = new FaultActionObjectEditor(this, fromExpression);
                    } else if ("FaultSignalId".equals(name)) {
                        editor = new FaultSignalIdObjectEditor(this, fromExpression);
                    } else if ("EInt".equals(dataType)) {
                        editor = new IntObjectEditor(this, fromExpression, attribute);
                    } else if ("EBoolean".equals(dataType)) {
                        editor = new BooleanObjectEditor(this, fromExpression, attribute);
                    } else if ("ID".equals(dataType)) {
                        editor = new NCNameObjectEditor(this, fromExpression, attribute);
                    } else {
                        editor = new TextObjectEditor(this, fromExpression, attribute);
                        ((TextObjectEditor) editor).setMultiLine(false);
                    }
                    editor.createControl(getAttributesParent(), ModelUtil.toDisplayName(name));
                }
            }
        }
    }

    private void migrateOldInputs(final DataInput di) {
        if ("FaultEventType".equals(di.getName())) {
            TransactionalEditingDomain domain = getDiagramEditor().getEditingDomain();
            domain.getCommandStack().execute(
                    new RecordingCommand(domain, "Update \"FaultEventType\" to \"FaultSignalId\"") {
                        @Override
                        protected void doExecute() {
                            di.setName("FaultSignalId");
                        }
                    });
        } else if ("CompleteAfterFault".equals(di.getName())) {
            TransactionalEditingDomain domain = getDiagramEditor().getEditingDomain();
            domain.getCommandStack()
                    .execute(
                            new RecordingCommand(domain,
                                    "Update \"CompleteAfterFault\" to \"FaultWorkItemAction\"") {
                                @Override
                                protected void doExecute() {
                                    di.setName("FaultWorkItemAction");
                                }
                            });
        } else if ("messageContentIn".equals(di.getName())) {
            TransactionalEditingDomain domain = getDiagramEditor().getEditingDomain();
            domain.getCommandStack().execute(
                    new RecordingCommand(domain, "Update \"messageContentIn\" to \"ContentInputName\"") {
                        @Override
                        protected void doExecute() {
                            di.setName("ContentInputName");
                        }
                    });
        } else if ("messageContentOut".equals(di.getName())) {
            TransactionalEditingDomain domain = getDiagramEditor().getEditingDomain();
            domain.getCommandStack().execute(
                    new RecordingCommand(domain, "Update \"messageContentOut\" to \"ContentOutputName\"") {
                        @Override
                        protected void doExecute() {
                            di.setName("ContentOutputName");
                        }
                    });
        }
    }

}
