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
package org.switchyard.tools.ui.editor.components.camel.jms;

import java.util.List;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.switchyard.tools.models.switchyard1_0.camel.jms.CamelJmsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.jms.JmsFactory;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractBindingWizard;
import org.switchyard.tools.ui.editor.diagram.binding.IBindingWizard;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * CamelFileBindingWizard
 * 
 * <p/>
 * Wizard for creating new CamelFileBindingType objects.
 * 
 * @author Rob Cernich
 */
public class CamelJmsBindingWizard extends AbstractBindingWizard implements IBindingWizard {

    @Override
    protected Binding createBinding() {
        final CamelJmsBindingType binding = JmsFactory.eINSTANCE.createCamelJmsBindingType();
        binding.setName(makeUniqueName("jms"));
        return binding;
    }

    @Override
    protected List<IBindingComposite> createComposites() {
        return CamelJMSBindingTypeExtension.createComposites();
    }

}
