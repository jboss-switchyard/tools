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
import org.eclipse.graphiti.tb.ImageDecorator;
import org.eclipse.soa.sca.sca1_1.model.sca.BPELImplementation;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.SCABinding;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.switchyard.tools.models.switchyard1_0.bean.BeanImplementationType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelDirectBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.jms.CamelJmsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJPABindingType;
import org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyUdpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.sql.CamelSqlBindingType;
import org.switchyard.tools.models.switchyard1_0.hornetq.BindingType;
import org.switchyard.tools.models.switchyard1_0.http.HttpBindingType;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidateType;
import org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType1;
import org.switchyard.tools.models.switchyard1_0.transform.JsonTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1;
import org.switchyard.tools.models.switchyard1_0.transform.XsltTransformType;
import org.switchyard.tools.models.switchyard1_0.validate.JavaValidateType;
import org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType;
import org.switchyard.tools.ui.editor.ImageProvider;
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
        } else if (objectForLabel instanceof Implementation) {
            return getLabelForImplementationType((Implementation) objectForLabel);
        } else if (objectForLabel instanceof Interface) {
            return getLabelForInterfaceType((Interface) objectForLabel);
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
            return "REST";
        } else if (binding instanceof HttpBindingType) {
            return "HTTP";
        } else if (binding instanceof CamelMailBindingType) {
            return "Mail";
        } else if (binding instanceof CamelJPABindingType) {
            return "JPA";
        } else if (binding instanceof SCABinding) {
            return "SCA";
        } else {
            return "Unsupported (" + binding.eClass().getClass().getName() + ")";
        }

    }
    
    private static String getLabelForImplementationType(Implementation impl) {
        if (impl instanceof BeanImplementationType) {
            return "Bean";
        } else if (impl instanceof BPELImplementation) {
            return "BPEL";
        } else if (impl instanceof CamelImplementationType) {
            CamelImplementationType camelimpl = (CamelImplementationType) impl;
            if (camelimpl.getJava() != null) {
                return "Camel (Java)";
            } else if (camelimpl.getRoute() != null) {
                return "Camel (XML)";
            } else {
                return "Camel";
            }
        } else if (impl instanceof BPMImplementationType) {
            return "BPM";
        } else if (impl instanceof RulesImplementationType) {
            return "Rules";
        } else {
            return "Unsupported (" + impl.eClass().getClass().getName() + ")";
        }
    }

    private static String getLabelForInterfaceType(Interface intfc) {
        if (intfc instanceof EsbInterface) {
            return "ESB";
        } else if (intfc instanceof JavaInterface) {
            return "Java";
        } else if (intfc instanceof WSDLPortType) {
            return "WSDL";
        } else {
            return "Unsupported (" + intfc.eClass().getClass().getName() + ")";
        }
    }
    /**
     * @param binding binding to check
     * @return IDecorator decorator image
     */
    public static ImageDecorator getImageDecoratorForBinding(Binding binding) {
        ImageDecorator imageRenderingDecorator = 
                new ImageDecorator(ImageProvider.IMG_16_CHAIN);
        if (binding instanceof SOAPBindingType) {
            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_SOAP);
        } else if (binding instanceof BindingType) {
            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_HORNETQ);
        } else if (binding instanceof CamelFileBindingType) {
            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_FILE);
        } else if (binding instanceof CamelQuartzBindingType) {
            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_SCHEDULER);
        } else if (binding instanceof CamelSftpBindingType) {
            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_FTP);
        } else if (binding instanceof CamelFtpBindingType) {
            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_FTP);
        } else if (binding instanceof CamelNettyTcpBindingType) {
            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_NETTY_TCP);
        } else if (binding instanceof CamelNettyUdpBindingType) {
            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_NETTY_UDP);
        } else if (binding instanceof CamelJmsBindingType) {
            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_QUEUE);
        } else if (binding instanceof CamelTimerBindingType) {
            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_SCHEDULER);
        } else if (binding instanceof CamelSqlBindingType) {
            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_SQL);
        } else if (binding instanceof JCABinding) {
            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_JCA);
        } else if (binding instanceof RESTBindingType) {
            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_RESTEASY);
        } else if (binding instanceof HttpBindingType) {
            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_HTTP);
        } else if (binding instanceof CamelBindingType) {
            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_CAMEL);
//        } else if (binding instanceof RemoteBindingType) {
//            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_REMOTE);
        } else if (binding instanceof CamelMailBindingType) {
            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_MAIL);
        } else if (binding instanceof CamelJPABindingType) {
            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_JPA);
        }
        return imageRenderingDecorator;
    }

    /**
     * @param intfc interface to check
     * @return IDecorator decorator image
     */
    public static ImageDecorator getImageDecoratorForInterface(Interface intfc) {
        ImageDecorator imageRenderingDecorator = 
                new ImageDecorator(ImageProvider.IMG_16_INTERFACE);
        if (intfc instanceof EsbInterface) {
            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_ESB);
        } else if (intfc instanceof JavaInterface) {
            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_INTERFACE);
        } else if (intfc instanceof WSDLPortType) {
            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_WSDL);
        }
        return imageRenderingDecorator;
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
