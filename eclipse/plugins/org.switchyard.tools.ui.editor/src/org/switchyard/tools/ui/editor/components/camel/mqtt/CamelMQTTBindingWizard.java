/*************************************************************************************
 * Copyright (c) 2014 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.editor.components.camel.mqtt;

import java.util.List;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttFactory;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractBindingWizard;
import org.switchyard.tools.ui.editor.diagram.binding.IBindingWizard;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * CamelAtomBindingWizard
 * 
 * <p/>
 * Wizard for creating new CamelAtomBindingType objects.
 * 
 * @author bfitzpat
 */
public class CamelMQTTBindingWizard extends AbstractBindingWizard implements IBindingWizard {

    @Override
    protected Binding createBinding() {
        final CamelMqttBindingType binding = MqttFactory.eINSTANCE.createCamelMqttBindingType();
        binding.setName(makeUniqueName("mqtt")); //$NON-NLS-1$
        return binding;
    }

    @Override
    protected List<IBindingComposite> createComposites() {
        return CamelMQTTBindingTypeExtension.createComposites(getToolkit(), getTargetContainer() instanceof Service);
    }

}
