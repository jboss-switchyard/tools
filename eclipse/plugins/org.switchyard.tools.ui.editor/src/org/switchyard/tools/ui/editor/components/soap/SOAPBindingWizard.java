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
package org.switchyard.tools.ui.editor.components.soap;

import java.util.List;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPFactory;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractBindingWizard;
import org.switchyard.tools.ui.editor.diagram.binding.IBindingWizard;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * SOAPBindingWizard
 * 
 * <p/>
 * Wizard for creating new SOAPBindingType objects.
 * 
 * @author Rob Cernich
 */
public class SOAPBindingWizard extends AbstractBindingWizard implements IBindingWizard {

    @Override
    protected Binding createBinding() {
        final SOAPBindingType binding = SOAPFactory.eINSTANCE.createSOAPBindingType();
        if (getTargetContainer() instanceof Reference) {
            binding.setSocketAddr(null);
        }
        if (getTargetContainer().getInterface() instanceof WSDLPortType) {
            String wsdlPortType = ((WSDLPortType) getTargetContainer().getInterface()).getInterface();
            if (wsdlPortType != null) {
                final int fragmentIndex = wsdlPortType.indexOf('#');
                if (fragmentIndex >= 0) {
                    binding.setWsdl(wsdlPortType.substring(0, fragmentIndex));
                } else {
                    binding.setWsdl(wsdlPortType);
                }
            }
        }
        binding.setName(makeUniqueName("soap"));
        return binding;
    }

    @Override
    protected List<IBindingComposite> createComposites() {
        return SOAPBindingTypeExtension.createComposites(getTargetContainer() instanceof Service);
    }

}
