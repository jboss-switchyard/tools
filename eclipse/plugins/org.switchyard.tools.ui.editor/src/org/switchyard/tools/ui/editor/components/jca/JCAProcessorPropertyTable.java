/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.editor.components.jca;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;
import org.switchyard.tools.models.switchyard1_0.jca.Processor;
import org.switchyard.tools.models.switchyard1_0.jca.Property;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 *
 */
public class JCAProcessorPropertyTable extends JCAPropertyTable {

    private static final FeaturePath PROCESSOR_PROPERTIES = FeaturePath.fromList(
            JcaPackage.Literals.JCA_BINDING__OUTBOUND_INTERACTION,
            JcaPackage.Literals.JCA_OUTBOUND_INTERACTION__PROCESSOR, JcaPackage.Literals.PROCESSOR__PROPERTY);

    /**
     * @param parent Composite
     * @param style any additional style bits
     * @param toolkit Form toolkit to use when creating controls
     * @param context the data binding context
     * @param domain the editing domain
     */
    public JCAProcessorPropertyTable(Composite parent, int style, FormToolkit toolkit, DataBindingContext context, EditingDomain domain) {
        super(parent, style, false, toolkit, context, PROCESSOR_PROPERTIES, domain);
    }

    /**
     * @param parent Composite
     * @param style any additional style bits
     * @param isReadOnly flag
     * @param toolkit Form toolkit to use when creating controls
     * @param context the data binding context
     * @param domain the editing domain
     */
    public JCAProcessorPropertyTable(Composite parent, int style, boolean isReadOnly, FormToolkit toolkit,
            DataBindingContext context, EditingDomain domain) {
        super(parent, style, isReadOnly, toolkit, context, PROCESSOR_PROPERTIES, domain);
    }

    protected void removeFromList() {
        final Property toRemove = getTableSelection();
        if (toRemove != null) {
            if (getTargetObject() instanceof JCABinding) {
                final JCABinding binding = (JCABinding) getTargetObject();
                final Processor processor = binding.getOutboundInteraction().getProcessor();
                if (toRemove.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            boolean flag = processor.getProperty().remove(toRemove);
                            System.out.println("Property " + toRemove.getName() + " was removed: " + flag); //$NON-NLS-1$ //$NON-NLS-2$
                        }
                    });
                } else {
                    boolean flag = processor.getProperty().remove(toRemove);
                    System.out.println("Property " + toRemove.getName() + " was removed: " + flag); //$NON-NLS-1$ //$NON-NLS-2$
                }
            }
        }
    }

    /**
     * Add a new property to the list
     */
    protected void addPropertyToList() {
        final JCAPropertyInputDialog dialog = new JCAPropertyInputDialog(Display.getCurrent().getActiveShell());
        int rtn_value = dialog.open();
        if (rtn_value == JCAPropertyInputDialog.OK) {
            if (getTargetObject() instanceof JCABinding) {
                final JCABinding binding = (JCABinding) getTargetObject();
                if (getTargetObject().eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            Property newProperty = JcaFactory.eINSTANCE.createProperty();
                            newProperty.setName(dialog.getPropertyName());
                            newProperty.setValue(dialog.getPropertyValue());
                            
                            if (binding.getOutboundInteraction() == null) {
                                JCAOutboundInteraction outbound = JcaFactory.eINSTANCE.createJCAOutboundInteraction();
                                outbound.setProcessor(JcaFactory.eINSTANCE.createProcessor());
                                binding.setOutboundInteraction(outbound);
                            } else if (binding.getOutboundInteraction().getProcessor() == null) {
                                binding.getOutboundInteraction().setProcessor(JcaFactory.eINSTANCE.createProcessor());
                            }
                            Processor processor = binding.getOutboundInteraction().getProcessor();
                            processor.getProperty().add(newProperty);
                        }
                    });
                } else {
                    Property newProperty = JcaFactory.eINSTANCE.createProperty();
                    newProperty.setName(dialog.getPropertyName());
                    newProperty.setValue(dialog.getPropertyValue());
                    
                    if (binding.getOutboundInteraction() == null) {
                        JCAOutboundInteraction outbound = JcaFactory.eINSTANCE.createJCAOutboundInteraction();
                        outbound.setProcessor(JcaFactory.eINSTANCE.createProcessor());
                        binding.setOutboundInteraction(outbound);
                    } else if (binding.getOutboundInteraction().getProcessor() == null) {
                        binding.getOutboundInteraction().setProcessor(JcaFactory.eINSTANCE.createProcessor());
                    }
                    Processor processor = binding.getOutboundInteraction().getProcessor();
                    processor.getProperty().add(newProperty);
                }
                fireChangedEvent(this);
            }
        }
    }

}
