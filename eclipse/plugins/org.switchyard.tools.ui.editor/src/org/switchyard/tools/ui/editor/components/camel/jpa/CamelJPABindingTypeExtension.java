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
package org.switchyard.tools.ui.editor.components.camel.jpa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.tb.IImageDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType;
import org.switchyard.tools.ui.editor.IBindingTypeExtension;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.diagram.binding.AdvancedBindingDetailsComposite;
import org.switchyard.tools.ui.editor.diagram.binding.CreateBindingFeature;
import org.switchyard.tools.ui.editor.diagram.binding.MessageComposerComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * CamelJPABindingTypeExtension
 * 
 * <p/>
 * Editor extension support Camel JPA bindings.
 */
public class CamelJPABindingTypeExtension implements IBindingTypeExtension {

    @Override
    public ICreateFeature[] newCreateFeatures(IFeatureProvider fp) {
        return new ICreateFeature[] {new CreateBindingFeature(fp, new CamelJPABindingFactory(), "JPA",
                "A Camel JPA based endpoint.", ImageProvider.IMG_16_JPA) };
    }

    @Override
    public IImageDecorator getImageDecorator(Binding binding) {
        return new ImageDecorator(ImageProvider.IMG_16_JPA);
    }

    @Override
    public boolean supports(Class<? extends Binding> type) {
        return CamelJpaBindingType.class.isAssignableFrom(type);
    }

    @Override
    public List<IBindingComposite> createComposites(Binding binding) {
        return createComposites(binding.eContainer() instanceof Service);
    }

    @Override
    public List<String> getRequiredCapabilities(Binding object) {
        return Collections.singletonList("org.switchyard.components:switchyard-component-camel-jpa");
    }

    @Override
    public String getTypeName(Binding object) {
        return "JPA";
    }

    protected static List<IBindingComposite> createComposites(boolean forConsumer) {
        final List<IBindingComposite> composites = new ArrayList<IBindingComposite>(4);
        if (forConsumer) {
            composites.add(new CamelJPAConsumerComposite());
            composites.add(new MessageComposerComposite());
            composites.add(new AdvancedBindingDetailsComposite(CONSUMER_ADVANCED_PROPS));
        } else {
            composites.add(new CamelJPAProducerComposite());
            composites.add(new MessageComposerComposite());
        }
        return composites;
    }
    private static final List<String> CONSUMER_ADVANCED_PROPS;
    
    static {
        CONSUMER_ADVANCED_PROPS = new ArrayList<String>();
        CONSUMER_ADVANCED_PROPS.add("maxMessagesPerPoll");
        CONSUMER_ADVANCED_PROPS.add("initialDelay");
        CONSUMER_ADVANCED_PROPS.add("delay");
        CONSUMER_ADVANCED_PROPS.add("useFixedDelay");
        CONSUMER_ADVANCED_PROPS.add("sendEmptyMessageWhenIdle");
        CONSUMER_ADVANCED_PROPS.add("timeUnit");
        CONSUMER_ADVANCED_PROPS.add("consumerResultClass");
    }
}
