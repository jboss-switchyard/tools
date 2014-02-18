/******************************************************************************* 
 * Copyright (c) 2013-2014 Red Hat, Inc. 
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
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage;
import org.switchyard.tools.ui.editor.IBindingTypeExtension;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.binding.CreateBindingFeature;
import org.switchyard.tools.ui.editor.diagram.binding.MessageComposerComposite;
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
        return new ICreateFeature[] {new CreateBindingFeature(fp, new SOAPBindingFactory(), Messages.label_soap,
                Messages.description_tool_soap, ImageProvider.IMG_16_SOAP) };
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
    public List<IBindingComposite> createComposites(FormToolkit toolkit, Binding binding) {
        return createComposites(toolkit, binding.eContainer() instanceof Service);
    }

    @Override
    public List<String> getRequiredCapabilities(Binding object) {
        return Collections.singletonList("org.switchyard.components:switchyard-component-soap"); //$NON-NLS-1$
    }

    @Override
    public String getTypeName(Binding object) {
        return Messages.label_soap;
    }

    protected static List<IBindingComposite> createComposites(FormToolkit toolkit, boolean forConsumer) {
        final List<IBindingComposite> composites = new ArrayList<IBindingComposite>(3);
        if (forConsumer) {
            final MessageComposerComposite messageComposer = new MessageComposerComposite(toolkit,
                    SOAPPackage.Literals.MESSAGE_COMPOSER_TYPE,
                    SOAPPackage.Literals.SOAP_BINDING_TYPE__MESSAGE_COMPOSER,
                    SOAPPackage.Literals.CONTEXT_MAPPER_TYPE,
                    SOAPPackage.Literals.SOAP_BINDING_TYPE__CONTEXT_MAPPER);
            composites.add(new SOAPBindingServiceComposite(toolkit));
            composites.add(new SOAPInterceptorsComposite(toolkit));
            composites.add(messageComposer);
        } else {
            final MessageComposerComposite messageComposer = new MessageComposerComposite(toolkit,
                    SOAPPackage.Literals.MESSAGE_COMPOSER_TYPE,
                    SOAPPackage.Literals.SOAP_BINDING_TYPE__MESSAGE_COMPOSER,
                    SOAPPackage.Literals.CONTEXT_MAPPER_TYPE,
                    SOAPPackage.Literals.SOAP_BINDING_TYPE__CONTEXT_MAPPER);
            composites.add(new SOAPBindingReferenceComposite(toolkit));
            composites.add(new SOAPAuthenticationComposite(toolkit));
            composites.add(new SOAPProxyComposite(toolkit));
            composites.add(messageComposer);
        }
        return composites;
    }
}
