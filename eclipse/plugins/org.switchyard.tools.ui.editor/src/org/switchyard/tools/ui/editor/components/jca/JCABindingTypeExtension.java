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
package org.switchyard.tools.ui.editor.components.jca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.tb.IImageDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.ui.editor.IBindingTypeExtension;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.components.soap.SOAPMessageComposerComposite;
import org.switchyard.tools.ui.editor.diagram.binding.CreateBindingFeature;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * JCABindingTypeExtension
 * 
 * <p/>
 * Editor extension support JCA bindings.
 */
public class JCABindingTypeExtension implements IBindingTypeExtension {

    @Override
    public ICreateFeature[] newCreateFeatures(IFeatureProvider fp) {
        return new ICreateFeature[] {new CreateBindingFeature(fp, new JCABindingFactory(), "JCA",
                "A JCA based endpoint.", ImageProvider.IMG_16_JCA) };
    }

    @Override
    public IImageDecorator getImageDecorator(Binding binding) {
        return new ImageDecorator(ImageProvider.IMG_16_JCA);
    }

    @Override
    public boolean supports(Class<? extends Binding> type) {
        return JCABinding.class.isAssignableFrom(type);
    }

    @Override
    public List<IBindingComposite> createComposites(Binding binding) {
        return createComposites(binding.eContainer() instanceof Service);
    }

    @Override
    public List<String> getRequiredCapabilities(Binding object) {
        return Collections.singletonList("org.switchyard.components:switchyard-component-jca");
    }

    @Override
    public String getTypeName(Binding object) {
        return "JCA";
    }

    protected static List<IBindingComposite> createComposites(boolean forConsumer) {
        final List<IBindingComposite> composites = new ArrayList<IBindingComposite>(3);
        if (forConsumer) {
            composites.add(new JCABindingInboundComposite());
            composites.add(new JCAInteractionDetailsComposite());
            composites.add(new SOAPMessageComposerComposite());
        } else {
            composites.add(new JCABindingOutboundComposite());
            composites.add(new SOAPMessageComposerComposite());
        }
        return composites;
    }
}
