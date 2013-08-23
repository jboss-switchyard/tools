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
import org.eclipse.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.DataAssociation;
import org.eclipse.bpmn2.DataInput;
import org.eclipse.bpmn2.DataInputAssociation;
import org.eclipse.bpmn2.DataOutput;
import org.eclipse.bpmn2.DataOutputAssociation;
import org.eclipse.bpmn2.FormalExpression;
import org.eclipse.bpmn2.InputOutputSpecification;
import org.eclipse.bpmn2.InputSet;
import org.eclipse.bpmn2.ItemAwareElement;
import org.eclipse.bpmn2.Message;
import org.eclipse.bpmn2.Operation;
import org.eclipse.bpmn2.OutputSet;
import org.eclipse.bpmn2.ServiceTask;
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
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
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
public class SwitchYardServiceTaskPropertiesComposite extends JbpmCustomTaskDetailComposite {

    private boolean _operationNotBound = true;
    private DataInput _parameter;
    private DataOutput _result;
    private Adapter _adapter = new AdapterImpl() {
        @Override
        public void notifyChanged(Notification notification) {
            if (notification == null || notification.isTouch() || notification.getNotifier() == null
                    || notification.getNotifier() != getBusinessObject()
                    || notification.getFeature() != PACKAGE.getServiceTask_OperationRef()) {
                return;
            }
            Operation operation = ((ServiceTask) getBusinessObject()).getOperationRef();
            Message inMessage = operation == null ? null : operation.getInMessageRef();
            Message outMessage = operation == null ? null : operation.getOutMessageRef();
            updateDataType(_parameter, inMessage);
            updateDataType(_result, outMessage);
        }
    };

    /**
     * Create a new SwitchYardServiceTaskPropertiesComposite.
     * 
     * @param parent the parent composite.
     * @param style the style bits.
     */
    public SwitchYardServiceTaskPropertiesComposite(Composite parent, int style) {
        super(parent, style);
    }

    /**
     * Create a new SwitchYardServiceTaskPropertiesComposite.
     * 
     * @param section the containing section.
     */
    public SwitchYardServiceTaskPropertiesComposite(AbstractBpmn2PropertySection section) {
        super(section);
    }

    @Override
    public void createBindings(EObject be) {
        // bind operation first
        bindReference(be, Bpmn2Package.eINSTANCE.getServiceTask_OperationRef());
        _operationNotBound = false;
        super.createBindings(be);
        if (be != null) {
            be.eAdapters().add(_adapter);
        }
    }

    @Override
    public void cleanBindings() {
        EObject be = getBusinessObject();
        if (be != null) {
            be.eAdapters().remove(_adapter);
        }
        super.cleanBindings();
    }

    @Override
    protected boolean isModelObjectEnabled(String className, String featureName) {
        return "operationRef".equals(featureName) ? _operationNotBound : super.isModelObjectEnabled(className,
                featureName);
    }

    protected void createInputParameterBindings(Task task) {
        ModelExtensionAdapter adapter = ModelExtensionDescriptor.getModelExtensionAdapter(task);
        if (adapter != null) {
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
                ioSpec = copyCreateModelObject(InputOutputSpecification.class);
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
                    parameter = copyCreateModelObject(DataInput.class);
                    parameter.setName(name);
                    InsertionAdapter.add(ioSpec, PACKAGE.getInputOutputSpecification_DataInputs(), parameter);

                    // create the InputSet if needed
                    InputSet inputSet = null;
                    if (ioSpec.getInputSets().size() == 0) {
                        inputSet = copyCreateModelObject(InputSet.class);
                        InsertionAdapter.add(ioSpec, PACKAGE.getInputOutputSpecification_InputSets(), inputSet);
                    } else {
                        inputSet = ioSpec.getInputSets().get(0);
                    }
                    // add the parameter to the InputSet also
                    InsertionAdapter.add(inputSet, PACKAGE.getInputSet_DataInputRefs(), parameter);
                }

                // create the DataInputAssociation if needed
                if (association == null) {
                    association = copyCreateModelObject(DataInputAssociation.class);
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
                    assignment = copyCreateModelObject(Assignment.class);
                    FormalExpression toExpression = copyCreateModelObject(FormalExpression.class);
                    toExpression.setBody(parameter.getId());
                    toExpression.setLanguage("http://www.mvel.org/2.0");
                    assignment.setTo(toExpression);
                    InsertionAdapter.add(association, PACKAGE.getDataAssociation_Assignment(), assignment);
                }
                if (fromExpression == null) {
                    fromExpression = copyCreateModelObject(FormalExpression.class);
                    fromExpression.setLanguage("http://www.mvel.org/2.0");
                    InsertionAdapter.add(assignment, PACKAGE.getAssignment_From(), fromExpression);
                }

                if ("Parameter".equals(name)) {
                    _parameter = parameter;
                    Section inputSection = createSection(this, "Input");
                    inputSection.setLayout(new FillLayout());
                    inputSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
                    InputOutputAssociationDetailComposite inputComposite = new InputOutputAssociationDetailComposite(
                            inputSection);
                    inputSection.setClient(inputComposite);
                    inputComposite.setBusinessObject(parameter);
                    inputSection.setText("Parameter Mapping Details");
                } else {
                    // create the Object Editor for the "From" expression body:
                    // the data type is obtained from the DataInput <property>
                    // element from plugin.xml
                    EAttribute attribute = PACKAGE.getFormalExpression_Body();
                    String dataType = property.type;
                    if ("FaultAction".equals(name)) {
                        ObjectEditor editor = new FaultActionObjectEditor(this, fromExpression);
                        editor.createControl(getAttributesParent(), "Fault Action");
                    } else if ("FaultName".equals(name)) {
                        TextObjectEditor editor = new TextObjectEditor(this, fromExpression, attribute);
                        editor.setMultiLine(false);
                        editor.createControl(getAttributesParent(), "Fault Name");
                    } else {
                        ObjectEditor editor;
                        if ("FaultEventId".equals(name)) {
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
        createOutputParameterBindings(task);
    }

    protected void createOutputParameterBindings(Task task) {
        ModelExtensionAdapter adapter = ModelExtensionDescriptor.getModelExtensionAdapter(task);
        if (adapter != null) {
            Resource resource = task.eResource();
            List<Property> props = adapter.getProperties("ioSpecification/dataOutputs/name");
            InputOutputSpecification ioSpec = task.getIoSpecification();
            if (ioSpec == null) {
                ioSpec = copyCreateModelObject(InputOutputSpecification.class);
                InsertionAdapter.add(task, PACKAGE.getActivity_IoSpecification(), ioSpec);
            }
            for (Property property : props) {
                // this will become the label for the Object Editor
                String name = property.getFirstStringValue();
                // the output result
                DataOutput result = null;
                // the DataOutputAssociation
                DataOutputAssociation association = null;
                for (final DataOutput dout : ioSpec.getDataOutputs()) {
                    if (name.equals(dout.getName())) {
                        // this is the one!
                        result = dout;
                        for (DataOutputAssociation doa : task.getDataOutputAssociations()) {
                            if (doa.getSourceRef().contains(dout)) {
                                association = doa;
                                break;
                            }
                        }
                        break;
                    }
                }

                // create the DataOutput element (the result) if needed
                if (result == null) {
                    result = copyCreateModelObject(DataOutput.class);
                    ModelUtil.setID(result, resource);
                    result.setName(name);
                    InsertionAdapter.add(ioSpec, PACKAGE.getInputOutputSpecification_DataOutputs(), result);

                    // create the OutputSet if needed
                    OutputSet outputSet = null;
                    if (ioSpec.getOutputSets().size() == 0) {
                        outputSet = copyCreateModelObject(OutputSet.class);
                        InsertionAdapter.add(ioSpec, PACKAGE.getInputOutputSpecification_OutputSets(), outputSet);
                    } else {
                        outputSet = ioSpec.getOutputSets().get(0);
                    }
                    // add the parameter to the InputSet also
                    InsertionAdapter.add(outputSet, PACKAGE.getOutputSet_DataOutputRefs(), result);
                }

                // create the DataInputAssociation if needed
                if (association == null) {
                    association = copyCreateModelObject(DataOutputAssociation.class);
                    association.getSourceRef().add(result);
                    InsertionAdapter.add(task, PACKAGE.getActivity_DataOutputAssociations(), association);
                }

                if ("Result".equals(name)) {
                    _result = result;
                    Section outputSection = createSection(this, "Output");
                    outputSection.setLayout(new FillLayout());
                    outputSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
                    InputOutputAssociationDetailComposite outputComposite = new InputOutputAssociationDetailComposite(
                            outputSection);
                    outputSection.setClient(outputComposite);
                    outputComposite.setBusinessObject(result);
                    outputSection.setText("Result Mapping Details");
                    outputSection.setExpanded(false);
                } else if ("Fault".equals(name)) {
                    Section faultSection = createSection(this, "Fault");
                    faultSection.setLayout(new FillLayout());
                    faultSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
                    InputOutputAssociationDetailComposite faultComposite = new InputOutputAssociationDetailComposite(
                            faultSection);
                    faultSection.setClient(faultComposite);
                    faultComposite.setBusinessObject(result);
                    faultSection.setText("Fault Mapping Details");
                    faultSection.setExpanded(false);
                }
            }
        }
    }

    private void updateDataType(ItemAwareElement dataIO, Message message) {
        if (dataIO == null) {
            return;
        }
        if (message == null || message.getItemRef() == null) {
            dataIO.setItemSubjectRef(null);
        } else if (dataIO.getItemSubjectRef() != message.getItemRef()) {
            dataIO.setItemSubjectRef(message.getItemRef());
        }
    }

    private <T extends EObject> T copyCreateModelObject(Class<T> clazz) {
        T object = null;
        EClass eClass = (EClass) Bpmn2Package.eINSTANCE.getEClassifier(clazz.getSimpleName());
        if (eClass != null) {
            object = clazz.cast(Bpmn2Factory.eINSTANCE.create(eClass));
            ModelUtil.setID(object, ModelUtil.getResource(businessObject));
        }
        return object;
    }
}
