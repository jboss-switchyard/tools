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
package org.switchyard.tools.ui.editor.components.camel.cxf;

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
import org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage;
import org.switchyard.tools.ui.editor.IBindingTypeExtension;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.binding.AdvancedCamelBindingDetailsComposite;
import org.switchyard.tools.ui.editor.diagram.binding.CreateBindingFeature;
import org.switchyard.tools.ui.editor.diagram.binding.MessageComposerComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * CamelCxfBindingTypeExtension
 * 
 * <p/>
 * Editor extension support Camel cxf bindings.
 */
public class CamelCxfBindingTypeExtension implements IBindingTypeExtension {

    @Override
    public ICreateFeature[] newCreateFeatures(IFeatureProvider fp) {
        return new ICreateFeature[] {new CreateBindingFeature(fp, new CamelCxfBindingFactory(), 
                Messages.label_cxf,
                Messages.description_tool_cxf, ImageProvider.IMG_16_CXF) };
    }

    @Override
    public IImageDecorator getImageDecorator(Binding binding) {
        return new ImageDecorator(ImageProvider.IMG_16_CXF);
    }

    @Override
    public boolean supports(Class<? extends Binding> type) {
        return CamelCxfBindingType.class.isAssignableFrom(type);
    }

    @Override
    public List<IBindingComposite> createComposites(FormToolkit toolkit, Binding binding) {
        return createComposites(toolkit, binding.eContainer() instanceof Service);
    }

    @Override
    public List<String> getRequiredCapabilities(Binding object) {
        return Collections.singletonList("org.switchyard.components:switchyard-component-camel-cxf"); //$NON-NLS-1$
    }

    @Override
    public String getTypeName(Binding object) {
        return Messages.label_cxf;
    }

    protected static List<IBindingComposite> createComposites(FormToolkit toolkit, boolean forConsumer) {
        final List<IBindingComposite> composites = new ArrayList<IBindingComposite>(4);
        if (forConsumer) {
            composites.add(new CamelCxfConsumerComposite(toolkit));
            composites.add(new MessageComposerComposite(toolkit,
                    CxfPackage.Literals.BASE_CAMEL_BINDING__MESSAGE_COMPOSER,
                    CxfPackage.Literals.BASE_CAMEL_BINDING__CONTEXT_MAPPER));
            composites.add(new AdvancedCamelBindingDetailsComposite(toolkit, ADVANCED_PROPS,
                    CxfPackage.eINSTANCE.getBaseCamelBinding_AdditionalUriParameters(), 
                    CxfPackage.eINSTANCE.getAdditionalUriParametersType_Parameter(), 
                    CxfPackage.eINSTANCE.getParameterType()));
        } else {
            composites.add(new CamelCxfProducerComposite(toolkit));
            composites.add(new MessageComposerComposite(toolkit,
                    CxfPackage.Literals.BASE_CAMEL_BINDING__MESSAGE_COMPOSER,
                    CxfPackage.Literals.BASE_CAMEL_BINDING__CONTEXT_MAPPER));
            composites.add(new AdvancedCamelBindingDetailsComposite(toolkit, ADVANCED_PROPS,
                    CxfPackage.eINSTANCE.getBaseCamelBinding_AdditionalUriParameters(), 
                    CxfPackage.eINSTANCE.getAdditionalUriParametersType_Parameter(), 
                    CxfPackage.eINSTANCE.getParameterType()));
        }
        return composites;
    }

    private static final List<String> ADVANCED_PROPS;
    
    static {
        ADVANCED_PROPS = new ArrayList<String>();
        ADVANCED_PROPS.add("setDefaultBus"); //$NON-NLS-1$
        ADVANCED_PROPS.add("loggingFeatureEnabled"); //$NON-NLS-1$
        ADVANCED_PROPS.add("synchronous"); //$NON-NLS-1$
        ADVANCED_PROPS.add("publishedEndpointUrl"); //$NON-NLS-1$
        ADVANCED_PROPS.add("allowStreaming"); //$NON-NLS-1$
        ADVANCED_PROPS.add("skipFaultLogging"); //$NON-NLS-1$
        ADVANCED_PROPS.add("cxfBinding"); //$NON-NLS-1$
        ADVANCED_PROPS.add("bus"); //$NON-NLS-1$
        ADVANCED_PROPS.add("headerFilterStrategy"); //$NON-NLS-1$
    }

}
