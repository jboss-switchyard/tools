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
package org.switchyard.tools.ui.editor.components.camel.ftp;

import java.util.List;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpFactory;
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
public class CamelFTPBindingWizard extends AbstractBindingWizard implements IBindingWizard {

    @Override
    protected Binding createBinding() {
        final CamelFtpBindingType binding = FtpFactory.eINSTANCE.createCamelFtpBindingType();
        if (getTargetContainer() instanceof Service) {
            binding.setConsume(FtpFactory.eINSTANCE.createRemoteFileConsumerType());
        } else {
            binding.setProduce(FtpFactory.eINSTANCE.createRemoteFileProducerType());
        }
        binding.setName(makeUniqueName("ftp")); //$NON-NLS-1$
        return binding;
    }

    @Override
    protected List<IBindingComposite> createComposites() {
        return CamelFTPBindingTypeExtension.createComposites(getToolkit(), getTargetContainer() instanceof Service);
    }

}
