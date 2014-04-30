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
package org.switchyard.tools.ui.editor.components.camel.atom;

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
import org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage;
import org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType;
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
public class CamelAtomBindingTypeExtension implements IBindingTypeExtension {

    @Override
    public ICreateFeature[] newCreateFeatures(IFeatureProvider fp) {
        return new ICreateFeature[] {new CreateBindingFeature(fp, new CamelAtomBindingFactory(), Messages.label_atom,
                Messages.description_tool_atom, ImageProvider.IMG_16_FEED) };
    }

    @Override
    public IImageDecorator getImageDecorator(Binding binding) {
        return new ImageDecorator(ImageProvider.IMG_16_FEED);
    }

    @Override
    public boolean supports(Class<? extends Binding> type) {
        return CamelAtomBindingType.class.isAssignableFrom(type);
    }

    @Override
    public List<IBindingComposite> createComposites(FormToolkit toolkit, Binding binding) {
        return createComposites(toolkit, binding.eContainer() instanceof Service);
    }

    @Override
    public List<String> getRequiredCapabilities(Binding object) {
        return Collections.singletonList("org.switchyard.components:switchyard-component-camel-atom"); //$NON-NLS-1$
    }

    @Override
    public String getTypeName(Binding object) {
        return Messages.label_atom;
    }

    protected static List<IBindingComposite> createComposites(FormToolkit toolkit, boolean forConsumer) {
        final List<IBindingComposite> composites = new ArrayList<IBindingComposite>(4);
        if (forConsumer) {
            composites.add(new CamelAtomConsumerComposite(toolkit));
            composites.add(new MessageComposerComposite(toolkit,
                    AtomPackage.Literals.BASE_CAMEL_BINDING__MESSAGE_COMPOSER,
                    AtomPackage.Literals.BASE_CAMEL_BINDING__CONTEXT_MAPPER));
            composites.add(new AdvancedCamelBindingDetailsComposite(toolkit, CONSUMER_ADVANCED_PROPS,
                    AtomPackage.eINSTANCE.getBaseCamelBinding_AdditionalUriParameters(), 
                    AtomPackage.eINSTANCE.getAdditionalUriParametersType_Parameter(), 
                    AtomPackage.eINSTANCE.getParameterType()));
        } else {
            composites.add(new CamelAtomProducerComposite(toolkit));
            composites.add(new MessageComposerComposite(toolkit,
                    AtomPackage.Literals.BASE_CAMEL_BINDING__MESSAGE_COMPOSER,
                    AtomPackage.Literals.BASE_CAMEL_BINDING__CONTEXT_MAPPER));
            composites.add(new AdvancedCamelBindingDetailsComposite(toolkit, PRODUCER_ADVANCED_PROPS,
                    AtomPackage.eINSTANCE.getBaseCamelBinding_AdditionalUriParameters(), 
                    AtomPackage.eINSTANCE.getAdditionalUriParametersType_Parameter(), 
                    AtomPackage.eINSTANCE.getParameterType()));
        }
        return composites;
    }

    private static final List<String> CONSUMER_ADVANCED_PROPS;
    
    static {
        CONSUMER_ADVANCED_PROPS = new ArrayList<String>();
        CONSUMER_ADVANCED_PROPS.add("throttleEntries"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("feedHeader"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("consumer/initialDelay"); //$NON-NLS-1$
        CONSUMER_ADVANCED_PROPS.add("consumer/useFixedDelay"); //$NON-NLS-1$
    }

    private static final List<String> PRODUCER_ADVANCED_PROPS;
    
    static {
        PRODUCER_ADVANCED_PROPS = new ArrayList<String>();
        PRODUCER_ADVANCED_PROPS.add("throttleEntries"); //$NON-NLS-1$
        PRODUCER_ADVANCED_PROPS.add("feedHeader"); //$NON-NLS-1$
    }
}
