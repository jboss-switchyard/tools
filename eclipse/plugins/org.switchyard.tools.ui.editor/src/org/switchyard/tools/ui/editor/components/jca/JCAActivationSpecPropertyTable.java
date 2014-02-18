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
import org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;
import org.switchyard.tools.models.switchyard1_0.jca.Property;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 *
 */
public class JCAActivationSpecPropertyTable extends JCAPropertyTable {

    private static final FeaturePath ACTIVATION_PROPERTIES = FeaturePath.fromList(
            JcaPackage.Literals.JCA_BINDING__INBOUND_CONNECTION,
            JcaPackage.Literals.JCA_INBOUND_CONNECTION__ACTIVATION_SPEC, JcaPackage.Literals.ACTIVATION_SPEC__PROPERTY);

    /**
     * @param parent Composite
     * @param style any additional style bits
     * @param toolkit Form toolkit to use when creating controls
     * @param context the data binding context
     * @param domain the editing domain
     */
    public JCAActivationSpecPropertyTable(Composite parent, int style, FormToolkit toolkit, DataBindingContext context, EditingDomain domain) {
        super(parent, style, false, toolkit, context, ACTIVATION_PROPERTIES, domain);
    }

    /**
     * @param parent Composite
     * @param style any additional style bits
     * @param isReadOnly flag
     * @param toolkit Form toolkit to use when creating controls
     * @param context the data binding context
     * @param domain the editing domain
     */
    public JCAActivationSpecPropertyTable(Composite parent, int style, boolean isReadOnly, FormToolkit toolkit,
            DataBindingContext context, EditingDomain domain) {
        super(parent, style, isReadOnly, toolkit, context, ACTIVATION_PROPERTIES, domain);
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
                            System.out.println("Property " + toRemove.getName() + " was removed: " + flag); //$NON-NLS-1$ //$NON-NLS-2$
                        }
                    });
                } else {
                    boolean flag = actSpec.getProperty().remove(toRemove);
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
                            
                            if (binding.getInboundConnection() == null) {
                                JCAInboundConnection inbound = JcaFactory.eINSTANCE.createJCAInboundConnection();
                                inbound.setActivationSpec(JcaFactory.eINSTANCE.createActivationSpec());
                                binding.setInboundConnection(inbound);
                            } else if (binding.getInboundConnection().getActivationSpec() == null) {
                                binding.getInboundConnection().setActivationSpec(JcaFactory.eINSTANCE.createActivationSpec());
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
                        JCAInboundConnection inbound = JcaFactory.eINSTANCE.createJCAInboundConnection();
                        inbound.setActivationSpec(JcaFactory.eINSTANCE.createActivationSpec());
                        binding.setInboundConnection(inbound);
                    } else if (binding.getInboundConnection().getActivationSpec() == null) {
                        binding.getInboundConnection().setActivationSpec(JcaFactory.eINSTANCE.createActivationSpec());
                    }
                    ActivationSpec actSpec = binding.getInboundConnection().getActivationSpec();
                    actSpec.getProperty().add(newProperty);
                    
                }
            }
        }
    }

}
