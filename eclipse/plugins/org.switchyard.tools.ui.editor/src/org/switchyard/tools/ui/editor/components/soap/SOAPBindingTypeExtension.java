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
package org.switchyard.tools.ui.editor.components.soap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.tb.IImageDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.ui.editor.IBindingTypeExtension;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.diagram.binding.CreateBindingFeature;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * SOAPBindingTypeExtension
 * 
 * <p/>
 * Editor extension support SOAP bindings.
 */
public class SOAPBindingTypeExtension implements IBindingTypeExtension {

    @Override
    public ICreateFeature[] newCreateFeatures(IFeatureProvider fp) {
        return new ICreateFeature[] {new CreateBindingFeature(fp, new SOAPBindingFactory(), "SOAP",
                "A SOAP based endpoint.", ImageProvider.IMG_16_SOAP) };
    }

    @Override
    public IImageDecorator getImageDecorator(Binding binding) {
        return new ImageDecorator(ImageProvider.IMG_16_SOAP);
    }

    @Override
    public boolean supports(Class<? extends Binding> type) {
        return SOAPBindingType.class.isAssignableFrom(type);
    }

    @Override
    public List<IBindingComposite> createComposites(Binding binding) {
        return createComposites(binding.eContainer() instanceof Service);
    }

    @Override
    public List<String> getRequiredCapabilities(Binding object) {
        return Collections.singletonList("org.switchyard.components:switchyard-component-soap");
    }

    @Override
    public String getTypeName(Binding object) {
        return "SOAP";
    }

    protected static List<IBindingComposite> createComposites(boolean forConsumer) {
        final List<IBindingComposite> composites = new ArrayList<IBindingComposite>(3);
        if (forConsumer) {
            final SOAPMessageComposerComposite messageComposer = new SOAPMessageComposerComposite();
            composites.add(new SOAPBindingServiceComposite(messageComposer));
            composites.add(new SOAPInterceptorsComposite());
            composites.add(messageComposer);
        } else {
            final SOAPMessageComposerComposite messageComposer = new SOAPMessageComposerComposite();
            composites.add(new SOAPBindingReferenceComposite(messageComposer));
            composites.add(new SOAPAuthenticationComposite());
            composites.add(new SOAPProxyComposite());
            composites.add(messageComposer);
        }
        return composites;
    }
}
