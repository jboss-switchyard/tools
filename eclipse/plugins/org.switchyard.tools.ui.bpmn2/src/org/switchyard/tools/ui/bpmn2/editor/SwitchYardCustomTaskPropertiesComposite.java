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
import org.eclipse.bpmn2.FormalExpression;
import org.eclipse.bpmn2.InputOutputSpecification;
import org.eclipse.bpmn2.InputSet;
import org.eclipse.bpmn2.ItemAwareElement;
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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

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
        migrateTaskName(task);
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

                // create the Object Editor for the "From" expression body:
                // the data type is obtained from the DataInput <property>
                // element from plugin.xml
                EAttribute attribute = PACKAGE.getFormalExpression_Body();
                String dataType = property.type;
                if ("FaultWorkItemAction".equals(name)) {
                    ObjectEditor editor = new FaultActionObjectEditor(this, fromExpression);
                    editor.createControl(getAttributesParent(), "Fault Action");
                } else if ("FaultResultName".equals(name)) {
                    TextObjectEditor editor = createTextObjectEditor(association, fromExpression, attribute);
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
                        editor = createTextObjectEditor(association, fromExpression, attribute);
                        ((TextObjectEditor) editor).setMultiLine(false);
                    }
                    editor.createControl(getAttributesParent(), ModelUtil.toDisplayName(name));
                }
            }
        }
    }

    private TextObjectEditor createTextObjectEditor(final DataAssociation association,
            final FormalExpression fromExpression, final EAttribute attribute) {
        return new TextObjectEditor(this, fromExpression, attribute) {
            // special handling if the association is mapped from a variable
            @Override
            protected String getText() {
                final List<ItemAwareElement> sources = association.getSourceRef();
                if (sources == null || sources.isEmpty()) {
                    return super.getText();
                }
                return ModelUtil.getDisplayName(sources.get(0));
            }

            @Override
            protected boolean setValue(Object result) {
                if (result != null && result.equals(getText())) {
                    return false;
                }
                if (super.setValue(result)) {
                    final List<ItemAwareElement> sources = association.getSourceRef();
                    if (sources != null && sources.size() > 0) {
                        TransactionalEditingDomain domain = getDiagramEditor().getEditingDomain();
                        domain.getCommandStack().execute(new RecordingCommand(domain) {
                            @Override
                            protected void doExecute() {
                                sources.clear();
                            }
                        });
                        updateText();
                    }
                    return true;
                }
                return false;
            }

            @Override
            protected Control createControl(Composite composite, String label, int style) {
                final Control control = super.createControl(composite, label, style);
                updateText();
                return control;
            }

            @Override
            public void notifyChanged(Notification notification) {
                super.notifyChanged(notification);
                if (association == notification.getNotifier()
                        && notification.getFeature() == Bpmn2Package.eINSTANCE.getDataAssociation_SourceRef()) {
                    updateText();
                }
            }
        };
    }

    private void migrateOldInputs(final DataInput di) {
        if ("FaultEventType".equals(di.getName())) {
            TransactionalEditingDomain domain = getDiagramEditor().getEditingDomain();
            domain.getCommandStack().execute(
                    new RecordingCommand(domain, "Update \"FaultEventType\" to \"FaultEventId\"") {
                        @Override
                        protected void doExecute() {
                            di.setName("FaultEventId");
                        }
                    });
        } else if ("FaultSignalId".equals(di.getName())) {
                TransactionalEditingDomain domain = getDiagramEditor().getEditingDomain();
                domain.getCommandStack().execute(
                        new RecordingCommand(domain, "Update \"FaultSignalId\" to \"FaultEventId\"") {
                            @Override
                            protected void doExecute() {
                                di.setName("FaultEventId");
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
                    new RecordingCommand(domain, "Update \"messageContentIn\" to \"ParameterName\"") {
                        @Override
                        protected void doExecute() {
                            di.setName("ParameterName");
                        }
                    });
        } else if ("ContentInputName".equals(di.getName())) {
            TransactionalEditingDomain domain = getDiagramEditor().getEditingDomain();
            domain.getCommandStack().execute(
                    new RecordingCommand(domain, "Update \"ContentInputName\" to \"ParameterName\"") {
                        @Override
                        protected void doExecute() {
                            di.setName("ParameterName");
                        }
                    });
        } else if ("messageContentOut".equals(di.getName())) {
            TransactionalEditingDomain domain = getDiagramEditor().getEditingDomain();
            domain.getCommandStack().execute(
                    new RecordingCommand(domain, "Update \"messageContentOut\" to \"ResultName\"") {
                        @Override
                        protected void doExecute() {
                            di.setName("ResultName");
                        }
                    });
        } else if ("ContentOutputName".equals(di.getName())) {
            TransactionalEditingDomain domain = getDiagramEditor().getEditingDomain();
            domain.getCommandStack().execute(
                    new RecordingCommand(domain, "Update \"ContentOutputName\" to \"ResultName\"") {
                        @Override
                        protected void doExecute() {
                            di.setName("ResultName");
                        }
                    });
        }
    }

    private void migrateTaskName(final Task task) {
        List<EStructuralFeature> features = ModelUtil.getAnyAttributes(task);
        for (EStructuralFeature f : features) {
            if ("taskName".equals(f.getName()) && "SwitchYard Service".equals(task.getAnyAttribute().get(f, false))) {
                final EStructuralFeature taskNameFeature = f;
                TransactionalEditingDomain domain = getDiagramEditor().getEditingDomain();
                domain.getCommandStack().execute(
                        new RecordingCommand(domain, "Update \"SwitchYard Service\" to \"SwitchYard Service Task\"") {
                            @Override
                            protected void doExecute() {
                                task.getAnyAttribute().set(taskNameFeature, "SwitchYard Service Task");
                            }
                        });
            }
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
