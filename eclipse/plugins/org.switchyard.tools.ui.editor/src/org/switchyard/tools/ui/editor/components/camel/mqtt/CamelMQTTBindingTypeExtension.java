/******************************************************************************* 
 * Copyright (c) 2014 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.editor.components.camel.mqtt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.tb.IImageDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage;
import org.switchyard.tools.ui.editor.IBindingTypeExtension;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.binding.AdvancedCamelBindingDetailsComposite;
import org.switchyard.tools.ui.editor.diagram.binding.CreateBindingFeature;
import org.switchyard.tools.ui.editor.diagram.binding.MessageComposerComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * CamelAtomBindingTypeExtension
 * 
 * <p/>
 * Editor extension support Camel atom bindings.
 */
public class CamelMQTTBindingTypeExtension implements IBindingTypeExtension {

    @Override
    public ICreateFeature[] newCreateFeatures(IFeatureProvider fp) {
        return new ICreateFeature[] {new CreateBindingFeature(fp, new CamelMQTTBindingFactory(), Messages.label_mqtt,
                Messages.description_tool_mqtt, ImageProvider.IMG_16_MQTT) };
    }

    @Override
    public IImageDecorator getImageDecorator(Binding binding) {
        return new ImageDecorator(ImageProvider.IMG_16_MQTT);
    }

    @Override
    public boolean supports(Class<? extends Binding> type) {
        return CamelMqttBindingType.class.isAssignableFrom(type);
    }

    @Override
    public List<IBindingComposite> createComposites(FormToolkit toolkit, Binding binding) {
        return createComposites(toolkit, binding.eContainer() instanceof Service);
    }

    @Override
    public List<String> getRequiredCapabilities(Binding object) {
        return Collections.singletonList("org.switchyard.components:switchyard-component-camel-mqtt"); //$NON-NLS-1$
    }

    @Override
    public String getTypeName(Binding object) {
        return Messages.label_mqtt;
    }

    protected static List<IBindingComposite> createComposites(FormToolkit toolkit, boolean forConsumer) {
        final List<IBindingComposite> composites = new ArrayList<IBindingComposite>(4);
        if (forConsumer) {
            composites.add(new CamelMQTTConsumerComposite(toolkit));
            composites.add(new MessageComposerComposite(toolkit,
                    MqttPackage.Literals.BASE_CAMEL_BINDING__MESSAGE_COMPOSER,
                    MqttPackage.Literals.BASE_CAMEL_BINDING__CONTEXT_MAPPER));
            composites.add(new AdvancedCamelBindingDetailsComposite(toolkit, CONSUMER_ADVANCED_PROPS,
                    MqttPackage.eINSTANCE.getBaseCamelBinding_AdditionalUriParameters(), 
                    MqttPackage.eINSTANCE.getAdditionalUriParametersType_Parameter(), 
                    MqttPackage.eINSTANCE.getParameterType()));
        } else {
            composites.add(new CamelMQTTProducerComposite(toolkit));
            composites.add(new MessageComposerComposite(toolkit,
                    MqttPackage.Literals.BASE_CAMEL_BINDING__MESSAGE_COMPOSER,
                    MqttPackage.Literals.BASE_CAMEL_BINDING__CONTEXT_MAPPER));
            composites.add(new AdvancedCamelBindingDetailsComposite(toolkit, PRODUCER_ADVANCED_PROPS,
                    MqttPackage.eINSTANCE.getBaseCamelBinding_AdditionalUriParameters(), 
                    MqttPackage.eINSTANCE.getAdditionalUriParametersType_Parameter(), 
                    MqttPackage.eINSTANCE.getParameterType()));
        }
        return composites;
    }

    private static final List<String> CONSUMER_ADVANCED_PROPS;
    
    static {
        CONSUMER_ADVANCED_PROPS = new ArrayList<String>();
        CONSUMER_ADVANCED_PROPS.add("localAddress"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("reconnectDelay"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("reconnectBackOffMultiplier"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("reconnectDelayMax"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("connectWaitInSeconds"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("disconnectWaitInSeconds"); //$NON-NLS-1$
    }

    private static final List<String> PRODUCER_ADVANCED_PROPS;
    
    static {
        PRODUCER_ADVANCED_PROPS = new ArrayList<String>();
        PRODUCER_ADVANCED_PROPS.add("localAddress"); //$NON-NLS-1$
        PRODUCER_ADVANCED_PROPS.add("reconnectDelay"); //$NON-NLS-1$
        PRODUCER_ADVANCED_PROPS.add("reconnectBackOffMultiplier"); //$NON-NLS-1$
        PRODUCER_ADVANCED_PROPS.add("reconnectDelayMax"); //$NON-NLS-1$
        PRODUCER_ADVANCED_PROPS.add("mqttTopicPropertyName"); //$NON-NLS-1$
        PRODUCER_ADVANCED_PROPS.add("mqttRetainPropertyName"); //$NON-NLS-1$
        PRODUCER_ADVANCED_PROPS.add("mqttQosPropertyName"); //$NON-NLS-1$
        PRODUCER_ADVANCED_PROPS.add("connectWaitInSeconds"); //$NON-NLS-1$
        PRODUCER_ADVANCED_PROPS.add("disconnectWaitInSeconds"); //$NON-NLS-1$
        PRODUCER_ADVANCED_PROPS.add("sendWaitInSeconds"); //$NON-NLS-1$
    }
}
