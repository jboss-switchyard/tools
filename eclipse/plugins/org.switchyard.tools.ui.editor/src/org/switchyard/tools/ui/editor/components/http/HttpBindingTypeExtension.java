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
package org.switchyard.tools.ui.editor.components.http;

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
import org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType;
import org.switchyard.tools.models.switchyard1_0.http.HttpPackage;
import org.switchyard.tools.ui.editor.IBindingTypeExtension;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.binding.CreateBindingFeature;
import org.switchyard.tools.ui.editor.diagram.binding.MessageComposerComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * HttpBindingTypeExtension
 * 
 * <p/>
 * Editor extension support HTTP bindings.
 */
public class HttpBindingTypeExtension implements IBindingTypeExtension {

    @Override
    public ICreateFeature[] newCreateFeatures(IFeatureProvider fp) {
        return new ICreateFeature[] {new CreateBindingFeature(fp, new HttpBindingFactory(), Messages.label_http,
                Messages.description_tool_http, ImageProvider.IMG_16_HTTP) };
    }

    @Override
    public IImageDecorator getImageDecorator(Binding binding) {
        return new ImageDecorator(ImageProvider.IMG_16_HTTP);
    }

    @Override
    public boolean supports(Class<? extends Binding> type) {
        return HTTPBindingType.class.isAssignableFrom(type);
    }

    @Override
    public List<IBindingComposite> createComposites(FormToolkit toolkit, Binding binding) {
        return createComposites(toolkit, binding.eContainer() instanceof Service);
    }

    @Override
    public List<String> getRequiredCapabilities(Binding object) {
        return Collections.singletonList("org.switchyard.components:switchyard-component-http"); //$NON-NLS-1$
    }

    @Override
    public String getTypeName(Binding object) {
        return Messages.label_http;
    }

    protected static List<IBindingComposite> createComposites(FormToolkit toolkit, boolean forConsumer) {
        final List<IBindingComposite> composites = new ArrayList<IBindingComposite>(3);
        if (forConsumer) {
            composites.add(new HttpBindingComposite(toolkit));
            composites.add(new MessageComposerComposite(toolkit,
                    HttpPackage.Literals.HTTP_BINDING_TYPE__MESSAGE_COMPOSER,
                    HttpPackage.Literals.HTTP_BINDING_TYPE__CONTEXT_MAPPER));
        } else {
            composites.add(new HttpBindingComposite(toolkit));
            composites.add(new HttpAuthenticationComposite(toolkit));
            composites.add(new HttpProxyComposite(toolkit));
            composites.add(new MessageComposerComposite(toolkit,
                    HttpPackage.Literals.HTTP_BINDING_TYPE__MESSAGE_COMPOSER,
                    HttpPackage.Literals.HTTP_BINDING_TYPE__CONTEXT_MAPPER));
        }
        return composites;
    }
}
