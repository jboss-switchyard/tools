/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.editor.components.camel.jms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.tb.IImageDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.switchyard.tools.models.switchyard1_0.camel.jms.CamelJmsBindingType;
import org.switchyard.tools.ui.editor.IBindingTypeExtension;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.diagram.binding.AdvancedBindingDetailsComposite;
import org.switchyard.tools.ui.editor.diagram.binding.CreateBindingFeature;
import org.switchyard.tools.ui.editor.diagram.binding.MessageComposerComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * CamelJMSBindingTypeExtension
 * 
 * <p/>
 * Editor extension support Camel JMS bindings.
 */
public class CamelJMSBindingTypeExtension implements IBindingTypeExtension {

    @Override
    public ICreateFeature[] newCreateFeatures(IFeatureProvider fp) {
        return new ICreateFeature[] {new CreateBindingFeature(fp, new CamelJmsBindingFactory(), "JMS",
                "A Camel JMS based endpoint.", ImageProvider.IMG_16_QUEUE) };
    }

    @Override
    public IImageDecorator getImageDecorator(Binding binding) {
        return new ImageDecorator(ImageProvider.IMG_16_QUEUE);
    }

    @Override
    public boolean supports(Class<? extends Binding> type) {
        return CamelJmsBindingType.class.isAssignableFrom(type);
    }

    @Override
    public List<IBindingComposite> createComposites(Binding binding) {
        return createComposites();
    }

    @Override
    public List<String> getRequiredCapabilities(Binding object) {
        return Collections.singletonList("org.switchyard.components:switchyard-component-camel-jms");
    }

    @Override
    public String getTypeName(Binding object) {
        return "JMS";
    }

    protected static List<IBindingComposite> createComposites() {
        final List<IBindingComposite> composites = new ArrayList<IBindingComposite>(4);
        composites.add(new CamelJmsComposite());
        composites.add(new MessageComposerComposite());
        composites.add(new AdvancedBindingDetailsComposite(ADVANCED_PROPS));
        return composites;
    }

    private static final List<String> ADVANCED_PROPS;
    
    static {
        ADVANCED_PROPS = new ArrayList<String>();
        ADVANCED_PROPS.add("username");
        ADVANCED_PROPS.add("password");
        ADVANCED_PROPS.add("clientId");
        ADVANCED_PROPS.add("durableSubscriptionName");
        ADVANCED_PROPS.add("disableReplyTo");
        ADVANCED_PROPS.add("preserveMessageQos");
        ADVANCED_PROPS.add("deliveryPersistent");
        ADVANCED_PROPS.add("priority");
        ADVANCED_PROPS.add("explicitQosEnabled");
        ADVANCED_PROPS.add("replyToType");
        ADVANCED_PROPS.add("requestTimeout");
        ADVANCED_PROPS.add("selector");
        ADVANCED_PROPS.add("timeToLive");
    }
}
