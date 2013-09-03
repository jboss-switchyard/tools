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
package org.switchyard.tools.ui.editor.components.jca;

import java.util.List;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractBindingWizard;
import org.switchyard.tools.ui.editor.diagram.binding.IBindingWizard;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * SOAPBindingWizard
 * 
 * <p/>
 * Wizard for creating new {@link JCABinding} objects.
 * 
 * @author Rob Cernich
 */
public class JCABindingWizard extends AbstractBindingWizard implements IBindingWizard {

    @Override
    protected Binding createBinding() {
        final JCABinding binding = JcaFactory.eINSTANCE.createJCABinding();
        if (getTargetContainer() instanceof Service) {
            binding.setInboundConnection(JcaFactory.eINSTANCE.createJCAInboundConnection());
            binding.getInboundConnection().setActivationSpec(JcaFactory.eINSTANCE.createActivationSpec());
            binding.setInboundInteraction(JcaFactory.eINSTANCE.createJCAInboundInteraction());
        } else {
            binding.setOutboundConnection(JcaFactory.eINSTANCE.createJCAOutboundConnection());
            binding.setOutboundInteraction(JcaFactory.eINSTANCE.createJCAOutboundInteraction());
        }
        binding.setName(makeUniqueName("jca")); //$NON-NLS-1$
        return binding;
    }

    @Override
    protected List<IBindingComposite> createComposites() {
        return JCABindingTypeExtension.createComposites(getTargetContainer() instanceof Service);
    }

}
