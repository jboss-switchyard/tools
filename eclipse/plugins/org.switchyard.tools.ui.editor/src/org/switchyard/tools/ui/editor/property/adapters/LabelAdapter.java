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
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelSftpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.jms.CamelJmsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyUdpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.sql.CamelSqlBindingType;
import org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType;
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
import org.switchyard.tools.ui.editor.BindingTypeExtensionManager;
import org.switchyard.tools.ui.editor.ComponentTypeExtensionManager;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.Messages;
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
        String bindingLabel = BindingTypeExtensionManager.instance().getExtensionFor(binding.getClass()).getTypeName(binding);
        if (binding.getName() != null && !binding.getName().trim().isEmpty()) {
            bindingLabel = bindingLabel + " (" + binding.getName() + ")";
        }
        return bindingLabel;
    }
    
    private static String getLabelForImplementationType(Implementation impl) {
        return ComponentTypeExtensionManager.instance().getExtensionFor(impl.getClass()).getTypeName(impl);
    }

    private static String getLabelForInterfaceType(Interface intfc) {
        if (intfc instanceof EsbInterface) {
            return Messages.constant_esb;
        } else if (intfc instanceof JavaInterface) {
            return Messages.constant_java;
        } else if (intfc instanceof WSDLPortType) {
            return Messages.constant_wsdl;
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
        } else if (binding instanceof HTTPBindingType) {
            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_HTTP);
        } else if (binding instanceof CamelBindingType) {
            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_CAMEL);
//        } else if (binding instanceof RemoteBindingType) {
//            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_REMOTE);
        } else if (binding instanceof CamelMailBindingType) {
            imageRenderingDecorator = new ImageDecorator(ImageProvider.IMG_16_MAIL);
        } else if (binding instanceof CamelJpaBindingType) {
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
            label = Messages.constant_jaxb;
        } else if (transform instanceof XsltTransformType) {
            label = Messages.constant_xslt;
        } else if (transform instanceof JavaTransformType1) {
            label = Messages.constant_java;
        } else if (transform instanceof JsonTransformType) {
            label = Messages.constant_json;
        } else if (transform instanceof SmooksTransformType1) {
            label = Messages.constant_smooks;
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
            label = Messages.constant_xml;
        } else if (validator instanceof JavaValidateType) {
            label = Messages.constant_java;
        }
        URI _modelUri = URI.createPlatformResourceURI(SwitchyardSCAEditor.getActiveEditor().getModelFile()
                .getFullPath().toString(), true);
        if (validator.eResource() != null && !validator.eResource().getURI().toString().equals(_modelUri.toString())) {
            label = label + '*';
        }
        return label;
    }

}
