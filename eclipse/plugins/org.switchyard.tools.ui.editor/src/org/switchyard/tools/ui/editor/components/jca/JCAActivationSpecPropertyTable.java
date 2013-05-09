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
import org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.models.switchyard1_0.jca.Property;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 *
 */
public class JCAActivationSpecPropertyTable extends JCAPropertyTable {

    /**
     * @param parent Composite
     * @param style any additional style bits
     */
    public JCAActivationSpecPropertyTable(Composite parent, int style) {
        super(parent, style, false);
    }
    
    /**
     * @param parent Composite
     * @param style any additional style bits
     * @param isReadOnly flag
     */
    public JCAActivationSpecPropertyTable(Composite parent, int style, boolean isReadOnly) {
        super(parent, style, isReadOnly);
    }

    protected void removeFromList() {
        final Property toRemove = getTableSelection();
        if (toRemove != null) {
            if (getTargetObject() instanceof JCABinding) {
                final JCABinding binding = (JCABinding) getTargetObject();
                final ActivationSpec actSpec = binding.getInboundConnection().getActivationSpec();
                if (toRemove.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            boolean flag = actSpec.getProperty().remove(toRemove);
                            System.out.println("Property " + toRemove.getName() + " was removed: " + flag);
                        }
                    });
                } else {
                    boolean flag = actSpec.getProperty().remove(toRemove);
                    System.out.println("Property " + toRemove.getName() + " was removed: " + flag);
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
                            
                            if (binding.getInboundConnection() == null) {
                                if (binding.getInboundConnection() == null) {
                                    JCAInboundConnection inbound = JcaFactory.eINSTANCE.createJCAInboundConnection();
                                    setFeatureValue(binding, "inboundConnection", inbound);
                                }
                            }
                            if (binding.getInboundConnection().getActivationSpec() == null) {
                                ActivationSpec newspec = JcaFactory.eINSTANCE.createActivationSpec();
                                setFeatureValue(binding.getInboundConnection(), "activationSpec", newspec);
                            }
                            ActivationSpec actSpec = binding.getInboundConnection().getActivationSpec();
                            actSpec.getProperty().add(newProperty);
                        }
                    });
                } else {
                    Property newProperty = JcaFactory.eINSTANCE.createProperty();
                    newProperty.setName(dialog.getPropertyName());
                    newProperty.setValue(dialog.getPropertyValue());
                    
                    if (binding.getInboundConnection() == null) {
                        if (binding.getInboundConnection() == null) {
                            JCAInboundConnection inbound = JcaFactory.eINSTANCE.createJCAInboundConnection();
                            setFeatureValue(binding, "inboundConnection", inbound);
                        }
                    }
                    if (binding.getInboundConnection().getActivationSpec() == null) {
                        ActivationSpec newspec = JcaFactory.eINSTANCE.createActivationSpec();
                        setFeatureValue(binding.getInboundConnection(), "activationSpec", newspec);
                    }
                    ActivationSpec actSpec = binding.getInboundConnection().getActivationSpec();
                    actSpec.getProperty().add(newProperty);
                    
                }
            }
        }
    }

}
