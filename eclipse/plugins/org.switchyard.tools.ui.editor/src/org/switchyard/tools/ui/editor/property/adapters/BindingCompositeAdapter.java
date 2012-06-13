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
package org.switchyard.tools.ui.editor.property.adapters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelNettyTcpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelNettyUdpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelQuartzBindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;
import org.switchyard.tools.ui.editor.diagram.shared.CamelFTPConsumerComposite;
import org.switchyard.tools.ui.editor.diagram.shared.CamelFTPProducerComposite;
import org.switchyard.tools.ui.editor.diagram.shared.CamelFileConsumerComposite;
import org.switchyard.tools.ui.editor.diagram.shared.CamelFileProducerComposite;
import org.switchyard.tools.ui.editor.diagram.shared.CamelNettyTCPComposite;
import org.switchyard.tools.ui.editor.diagram.shared.CamelNettyUDPComposite;
import org.switchyard.tools.ui.editor.diagram.shared.CamelQuartzComposite;
import org.switchyard.tools.ui.editor.diagram.shared.SOAPBindingComposite;

/**
 * @author bfitzpat
 * 
 */
public final class BindingCompositeAdapter {

    private BindingCompositeAdapter() {
        // empty constructor
    }

    /**
     * @param object incoming model object
     * @return outgoing composite instance or null
     */
    public static AbstractSwitchyardComposite adaptModelToComposite(EObject object) {
        AbstractSwitchyardComposite composite = null;
        if (object instanceof SOAPBindingType) {
            composite = new SOAPBindingComposite();
            GridData wsdlGD = new GridData(SWT.FILL, SWT.FILL, true, true);
            composite.setRootGridData(wsdlGD);
        } else if (object instanceof CamelFileBindingType) {
            CamelFileBindingType binding = (CamelFileBindingType) object;
            if (binding.eContainer() instanceof Service) {
                composite = new CamelFileConsumerComposite();
                GridData wsdlGD = new GridData(SWT.FILL, SWT.FILL, true, true);
                composite.setRootGridData(wsdlGD);
            } else if (binding.eContainer() instanceof Reference) {
                composite = new CamelFileProducerComposite();
                GridData wsdlGD = new GridData(SWT.FILL, SWT.FILL, true, true);
                composite.setRootGridData(wsdlGD);
            }
        } else if (object instanceof CamelFtpBindingType) {
            CamelFtpBindingType binding = (CamelFtpBindingType) object;
            if (binding.eContainer() instanceof Service) {
                composite = new CamelFTPConsumerComposite();
                GridData wsdlGD = new GridData(SWT.FILL, SWT.FILL, true, true);
                composite.setRootGridData(wsdlGD);
            } else if (binding.eContainer() instanceof Reference) {
                composite = new CamelFTPProducerComposite();
                GridData wsdlGD = new GridData(SWT.FILL, SWT.FILL, true, true);
                composite.setRootGridData(wsdlGD);
            }
        } else if (object instanceof CamelQuartzBindingType) {
            composite = new CamelQuartzComposite();
            GridData wsdlGD = new GridData(SWT.FILL, SWT.FILL, true, true);
            composite.setRootGridData(wsdlGD);
        } else if (object instanceof CamelNettyTcpBindingType) {
            composite = new CamelNettyTCPComposite();
            GridData wsdlGD = new GridData(SWT.FILL, SWT.FILL, true, true);
            composite.setRootGridData(wsdlGD);
        } else if (object instanceof CamelNettyUdpBindingType) {
            composite = new CamelNettyUDPComposite();
            GridData wsdlGD = new GridData(SWT.FILL, SWT.FILL, true, true);
            composite.setRootGridData(wsdlGD);
        }
        if (composite != null) {
            return composite;
        }
        return null;
    }

}
