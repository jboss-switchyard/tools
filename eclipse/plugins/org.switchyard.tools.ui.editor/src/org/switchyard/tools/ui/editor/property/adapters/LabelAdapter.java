/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package org.switchyard.tools.ui.editor.property.adapters;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelDirectBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelNettyTcpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelNettyUdpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelQuartzBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelSftpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelSqlBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType;
import org.switchyard.tools.models.switchyard1_0.hornetq.BindingType;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidateType;
import org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType1;
import org.switchyard.tools.models.switchyard1_0.transform.JsonTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1;
import org.switchyard.tools.models.switchyard1_0.transform.XsltTransformType;
import org.switchyard.tools.models.switchyard1_0.validate.JavaValidateType;
import org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * Adapt incoming SCA/SwitchYard model elements and return a display label.
 * 
 */
public final class LabelAdapter {

    /**
     * Empty constructor
     */
    private LabelAdapter() {
    }
    
    /**
     * @param objectForLabel Object needing a label
     * @return String for label
     */
    public static String getLabel(EObject objectForLabel) {
        if (objectForLabel instanceof Binding) {
            return getLabelForBindingType((Binding) objectForLabel);
        } else if (objectForLabel instanceof TransformType) {
            return getLabelForTransformType((TransformType) objectForLabel);
        } else if (objectForLabel instanceof ValidateType) {
            return getLabelForValidatorType((ValidateType) objectForLabel);
        }
        return objectForLabel.toString();
    }

    /**
     * @param binding binding to check
     * @return String label
     */
    private static String getLabelForBindingType(Binding binding) {
        if (binding instanceof SOAPBindingType) {
            return "SOAP";
        } else if (binding instanceof BindingType) {
            return "HornetQ";
        } else if (binding instanceof CamelBindingType) {
            return "Camel";
        } else if (binding instanceof CamelFileBindingType) {
            return "File";
        } else if (binding instanceof CamelQuartzBindingType) {
            return "Scheduler";
        } else if (binding instanceof CamelSftpBindingType) {
            return "SFTP";
        } else if (binding instanceof CamelFtpBindingType) {
            return "FTP";
        } else if (binding instanceof CamelNettyTcpBindingType) {
            return "Netty TCP";
        } else if (binding instanceof CamelNettyUdpBindingType) {
            return "Netty UDP";
        } else if (binding instanceof CamelJmsBindingType) {
            return "JMS";
        } else if (binding instanceof CamelAtomBindingType) {
            return "Atom";
        } else if (binding instanceof CamelDirectBindingType) {
            return "Direct";
        } else if (binding instanceof CamelSedaBindingType) {
            return "Seda";
        } else if (binding instanceof CamelTimerBindingType) {
            return "Timer";
        } else if (binding instanceof CamelSqlBindingType) {
            return "SQL";
        } else if (binding instanceof JCABinding) {
            return "JCA";
        } else if (binding instanceof RESTBindingType) {
            return "RESTeasy";
        } else {
            return "Unsupported (" + binding.eClass().getClass().getName() + ")";
        }

    }

    /**
     * @param transform transform to check
     * @return String label
     */
    private static String getLabelForTransformType(TransformType transform) {
        String label = "Unsupported (" + transform.eClass().getClass().getName() + ")";
        if (transform instanceof JAXBTransformType) {
            label = "JAXB";
        } else if (transform instanceof XsltTransformType) {
            label = "XSLT";
        } else if (transform instanceof JavaTransformType1) {
            label = "Java";
        } else if (transform instanceof JsonTransformType) {
            label = "JSON";
        } else if (transform instanceof SmooksTransformType1) {
            label = "Smooks";
        }
        URI _modelUri = URI.createPlatformResourceURI(SwitchyardSCAEditor.getActiveEditor().getModelFile()
                .getFullPath().toString(), true);
        if (transform.eResource() != null && !transform.eResource().getURI().toString().equals(_modelUri.toString())) {
            label = label + '*';
        }
        return label;
    }

    /**
     * @param validator transform to check
     * @return String label
     */
    private static String getLabelForValidatorType(ValidateType validator) {
        String label = "Unsupported (" + validator.eClass().getClass().getName() + ")";
        if (validator instanceof XmlValidateType) {
            label = "XML";
        } else if (validator instanceof JavaValidateType) {
            label = "Java";
        }
        URI _modelUri = URI.createPlatformResourceURI(SwitchyardSCAEditor.getActiveEditor().getModelFile()
                .getFullPath().toString(), true);
        if (validator.eResource() != null && !validator.eResource().getURI().toString().equals(_modelUri.toString())) {
            label = label + '*';
        }
        return label;
    }

}
