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
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaPackage;
import org.switchyard.tools.ui.editor.IBindingTypeExtension;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.binding.AdvancedCamelBindingDetailsComposite;
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
        return new ICreateFeature[] {new CreateBindingFeature(fp, new CamelJPABindingFactory(), Messages.label_jpa,
                Messages.description_jpa, ImageProvider.IMG_16_JPA) };
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
    public List<IBindingComposite> createComposites(FormToolkit toolkit, Binding binding) {
        return createComposites(toolkit, binding.eContainer() instanceof Service);
    }

    @Override
    public List<String> getRequiredCapabilities(Binding object) {
        return Collections.singletonList("org.switchyard.components:switchyard-component-camel-jpa"); //$NON-NLS-1$
    }

    @Override
    public String getTypeName(Binding object) {
        return Messages.label_jpa;
    }

    protected static List<IBindingComposite> createComposites(FormToolkit toolkit, boolean forConsumer) {
        final List<IBindingComposite> composites = new ArrayList<IBindingComposite>(4);
        if (forConsumer) {
            composites.add(new CamelJPAConsumerComposite(toolkit));
            composites.add(new MessageComposerComposite(toolkit,
                    JpaPackage.Literals.BASE_CAMEL_BINDING__MESSAGE_COMPOSER,
                    JpaPackage.Literals.BASE_CAMEL_BINDING__CONTEXT_MAPPER));
            composites.add(new AdvancedCamelBindingDetailsComposite(toolkit, CONSUMER_ADVANCED_PROPS,
                    JpaPackage.eINSTANCE.getBaseCamelBinding_AdditionalUriParameters(), 
                    JpaPackage.eINSTANCE.getAdditionalUriParametersType_Parameter(), 
                    JpaPackage.eINSTANCE.getParameterType()));
        } else {
            composites.add(new CamelJPAProducerComposite(toolkit));
            composites.add(new MessageComposerComposite(toolkit,
                    JpaPackage.Literals.BASE_CAMEL_BINDING__MESSAGE_COMPOSER,
                    JpaPackage.Literals.BASE_CAMEL_BINDING__CONTEXT_MAPPER));
            composites.add(new AdvancedCamelBindingDetailsComposite(toolkit, new ArrayList<String>(),
                    JpaPackage.eINSTANCE.getBaseCamelBinding_AdditionalUriParameters(), 
                    JpaPackage.eINSTANCE.getAdditionalUriParametersType_Parameter(), 
                    JpaPackage.eINSTANCE.getParameterType()));
        }
        return composites;
    }
    private static final List<String> CONSUMER_ADVANCED_PROPS;
    
    static {
        CONSUMER_ADVANCED_PROPS = new ArrayList<String>();
        CONSUMER_ADVANCED_PROPS.add("maxMessagesPerPoll"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("initialDelay"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("delay"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("useFixedDelay"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("sendEmptyMessageWhenIdle"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("timeUnit"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("consumerResultClass"); //$NON-NLS-1$
    }
}
