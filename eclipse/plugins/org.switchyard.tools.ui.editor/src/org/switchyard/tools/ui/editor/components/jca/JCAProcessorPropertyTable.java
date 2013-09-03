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

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.models.switchyard1_0.jca.Processor;
import org.switchyard.tools.models.switchyard1_0.jca.Property;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 *
 */
public class JCAProcessorPropertyTable extends JCAPropertyTable {

    /**
     * @param parent Composite
     * @param style any additional style bits
     */
    public JCAProcessorPropertyTable(Composite parent, int style) {
        super(parent, style, false);
    }
    
    /**
     * @param parent Composite
     * @param style any additional style bits
     * @param isReadOnly flag
     */
    public JCAProcessorPropertyTable(Composite parent, int style, boolean isReadOnly) {
        super(parent, style, isReadOnly);
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
                                setFeatureValue(binding, "outboundInteraction", outbound); //$NON-NLS-1$
                            }
                            if (binding.getOutboundInteraction().getProcessor() == null) {
                                Processor processor = JcaFactory.eINSTANCE.createProcessor();
                                setFeatureValue(binding.getOutboundInteraction(), "processor", processor); //$NON-NLS-1$
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
                        setFeatureValue(binding, "inboundConnection", outbound); //$NON-NLS-1$
                    }
                    if (binding.getOutboundInteraction().getProcessor() == null) {
                        Processor processor = JcaFactory.eINSTANCE.createProcessor();
                        setFeatureValue(binding.getOutboundInteraction(), "processor", processor); //$NON-NLS-1$
                    }
                    Processor processor = binding.getOutboundInteraction().getProcessor();
                    processor.getProperty().add(newProperty);
                }
                fireChangedEvent(this);
            }
        }
    }

}
