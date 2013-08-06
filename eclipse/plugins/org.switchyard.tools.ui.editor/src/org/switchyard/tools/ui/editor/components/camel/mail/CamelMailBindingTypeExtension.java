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
package org.switchyard.tools.ui.editor.components.camel.mail;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.tb.IImageDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType;
import org.switchyard.tools.ui.editor.IBindingTypeExtension;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.diagram.binding.AdvancedBindingDetailsComposite;
import org.switchyard.tools.ui.editor.diagram.binding.CreateBindingFeature;
import org.switchyard.tools.ui.editor.diagram.binding.MessageComposerComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * CamelMailBindingTypeExtension
 * 
 * <p/>
 * Editor extension support Camel mail bindings.
 */
public class CamelMailBindingTypeExtension implements IBindingTypeExtension {

    @Override
    public ICreateFeature[] newCreateFeatures(IFeatureProvider fp) {
        return new ICreateFeature[] {new CreateBindingFeature(fp, new CamelMailBindingFactory(), "Mail",
                "A Camel Mail based endpoint.", ImageProvider.IMG_16_MAIL) };
    }

    @Override
    public IImageDecorator getImageDecorator(Binding binding) {
        return new ImageDecorator(ImageProvider.IMG_16_MAIL);
    }

    @Override
    public boolean supports(Class<? extends Binding> type) {
        return CamelMailBindingType.class.isAssignableFrom(type);
    }

    @Override
    public List<IBindingComposite> createComposites(Binding binding) {
        return createComposites(binding.eContainer() instanceof Service);
    }

    @Override
    public List<String> getRequiredCapabilities(Binding object) {
        return Collections.singletonList("org.switchyard.components:switchyard-component-camel-mail");
    }

    @Override
    public String getTypeName(Binding object) {
        return "Mail";
    }

    protected static List<IBindingComposite> createComposites(boolean forConsumer) {
        final List<IBindingComposite> composites = new ArrayList<IBindingComposite>(4);
        if (forConsumer) {
            composites.add(new CamelMailConsumerComposite());
            composites.add(new MessageComposerComposite());
            composites.add(new AdvancedBindingDetailsComposite(CONSUMER_ADVANCED_PROPS));
        } else {
            composites.add(new CamelMailProducerComposite());
            composites.add(new MessageComposerComposite());
            composites.add(new AdvancedBindingDetailsComposite(PRODUCER_ADVANCED_PROPS));
        }
        return composites;
    }
    private static final List<String> PRODUCER_ADVANCED_PROPS;
    
    static {
        PRODUCER_ADVANCED_PROPS = new ArrayList<String>();
        PRODUCER_ADVANCED_PROPS.add("connectionTimeout");
    }

    private static final List<String> CONSUMER_ADVANCED_PROPS;
    
    static {
        CONSUMER_ADVANCED_PROPS = new ArrayList<String>();
        CONSUMER_ADVANCED_PROPS.add("connectionTimeout");
        CONSUMER_ADVANCED_PROPS.add("maxMessagesPerPoll");
        CONSUMER_ADVANCED_PROPS.add("initialDelay");
        CONSUMER_ADVANCED_PROPS.add("delay");
        CONSUMER_ADVANCED_PROPS.add("useFixedDelay");
        CONSUMER_ADVANCED_PROPS.add("sendEmptyMessageWhenIdle");
        CONSUMER_ADVANCED_PROPS.add("timeUnit");
        CONSUMER_ADVANCED_PROPS.add("copyTo");
        CONSUMER_ADVANCED_PROPS.add("disconnect");
    }
}
