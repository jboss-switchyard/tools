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
import org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.jms.CamelJmsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJPABindingType;
import org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyUdpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.sql.CamelSqlBindingType;
import org.switchyard.tools.models.switchyard1_0.http.HttpBindingType;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.ui.editor.components.camel.file.CamelFileConsumerComposite;
import org.switchyard.tools.ui.editor.components.camel.file.CamelFileProducerComposite;
import org.switchyard.tools.ui.editor.components.camel.ftp.CamelFTPConsumerComposite;
import org.switchyard.tools.ui.editor.components.camel.ftp.CamelFTPProducerComposite;
import org.switchyard.tools.ui.editor.components.camel.jms.CamelJmsComposite;
import org.switchyard.tools.ui.editor.components.camel.jpa.CamelJPAConsumerComposite;
import org.switchyard.tools.ui.editor.components.camel.jpa.CamelJPAProducerComposite;
import org.switchyard.tools.ui.editor.components.camel.mail.CamelMailConsumerComposite;
import org.switchyard.tools.ui.editor.components.camel.mail.CamelMailProducerComposite;
import org.switchyard.tools.ui.editor.components.camel.netty.CamelNettyTCPComposite;
import org.switchyard.tools.ui.editor.components.camel.netty.CamelNettyUDPComposite;
import org.switchyard.tools.ui.editor.components.camel.quartz.CamelQuartzComposite;
import org.switchyard.tools.ui.editor.components.camel.sql.CamelSQLComposite;
import org.switchyard.tools.ui.editor.components.http.HttpBindingComposite;
import org.switchyard.tools.ui.editor.components.jca.JCABindingInboundComposite;
import org.switchyard.tools.ui.editor.components.jca.JCABindingOutboundComposite;
import org.switchyard.tools.ui.editor.components.resteasy.ResteasyBindingComposite;
import org.switchyard.tools.ui.editor.components.soap.SOAPBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;

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
            SOAPBindingType binding = (SOAPBindingType) object;
            composite = new SOAPBindingComposite();
            GridData wsdlGD = new GridData(SWT.FILL, SWT.FILL, true, true);
            composite.setRootGridData(wsdlGD);
            if (binding.eContainer() !=  null) {
                ((SOAPBindingComposite)composite).setTargetObject(binding.eContainer());
            }
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
        } else if (object instanceof CamelSqlBindingType) {
            composite = new CamelSQLComposite();
            GridData wsdlGD = new GridData(SWT.FILL, SWT.FILL, true, true);
            composite.setRootGridData(wsdlGD);
        } else if (object instanceof CamelJmsBindingType) {
            composite = new CamelJmsComposite();
            GridData wsdlGD = new GridData(SWT.FILL, SWT.FILL, true, true);
            composite.setRootGridData(wsdlGD);
            ((CamelJmsComposite) composite).setTargetObject(object.eContainer());
        } else if (object instanceof RESTBindingType) {
            composite = new ResteasyBindingComposite();
            GridData wsdlGD = new GridData(SWT.FILL, SWT.FILL, true, true);
            composite.setRootGridData(wsdlGD);
            ((ResteasyBindingComposite) composite).setTargetObject(object.eContainer());
        } else if (object instanceof HttpBindingType) {
            composite = new HttpBindingComposite();
            GridData wsdlGD = new GridData(SWT.FILL, SWT.FILL, true, true);
            composite.setRootGridData(wsdlGD);
            ((HttpBindingComposite) composite).setTargetObject(object.eContainer());
        } else if (object instanceof JCABinding) {
            JCABinding binding = (JCABinding) object;
            if (binding.eContainer() instanceof Service) {
                composite = new JCABindingInboundComposite();
            } else if (binding.eContainer() instanceof Reference) {
                composite = new JCABindingOutboundComposite();
            }
        } else if (object instanceof CamelMailBindingType) {
            CamelMailBindingType binding = (CamelMailBindingType) object;
            if (binding.eContainer() instanceof Service) {
                composite = new CamelMailConsumerComposite();
                GridData wsdlGD = new GridData(SWT.FILL, SWT.FILL, true, true);
                composite.setRootGridData(wsdlGD);
            } else if (binding.eContainer() instanceof Reference) {
                composite = new CamelMailProducerComposite();
                GridData wsdlGD = new GridData(SWT.FILL, SWT.FILL, true, true);
                composite.setRootGridData(wsdlGD);
            }
        } else if (object instanceof CamelJPABindingType) {
            CamelJPABindingType binding = (CamelJPABindingType) object;
            if (binding.eContainer() instanceof Service) {
                composite = new CamelJPAConsumerComposite();
                GridData wsdlGD = new GridData(SWT.FILL, SWT.FILL, true, true);
                composite.setRootGridData(wsdlGD);
            } else if (binding.eContainer() instanceof Reference) {
                composite = new CamelJPAProducerComposite();
                GridData wsdlGD = new GridData(SWT.FILL, SWT.FILL, true, true);
                composite.setRootGridData(wsdlGD);
            }
        }
        if (composite != null) {
            return composite;
        }
        return null;
    }

}
