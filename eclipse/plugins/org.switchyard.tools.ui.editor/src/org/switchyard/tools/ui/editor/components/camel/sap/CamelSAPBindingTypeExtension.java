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
package org.switchyard.tools.ui.editor.components.camel.sap;

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
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage;
import org.switchyard.tools.ui.editor.IBindingTypeExtension;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.binding.AdvancedCamelBindingDetailsComposite;
import org.switchyard.tools.ui.editor.diagram.binding.CreateBindingFeature;
import org.switchyard.tools.ui.editor.diagram.binding.MessageComposerComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * CamelSAPBindingTypeExtension
 * 
 * <p/>
 * Editor extension support Camel SAP bindings.
 */
public class CamelSAPBindingTypeExtension implements IBindingTypeExtension {

    @Override
    public ICreateFeature[] newCreateFeatures(IFeatureProvider fp) {
        return new ICreateFeature[] {new CreateBindingFeature(fp, new CamelSAPBindingFactory(), Messages.CamelSAPBindingTypeExtension_SAP_label,
                Messages.CamelSAPBindingTypeExtension_SAP_description, ImageProvider.IMG_16_SAP) };
    }

    @Override
    public IImageDecorator getImageDecorator(Binding binding) {
        return new ImageDecorator(ImageProvider.IMG_16_SAP);
    }

    @Override
    public boolean supports(Class<? extends Binding> type) {
        return CamelSapBindingType.class.isAssignableFrom(type);
    }

    @Override
    public List<IBindingComposite> createComposites(FormToolkit toolkit, Binding binding) {
        return createComposites(toolkit, binding.eContainer() instanceof Service);
    }

    @Override
    public List<String> getRequiredCapabilities(Binding object) {
        return Collections.singletonList("org.switchyard.components:switchyard-component-camel-sap"); //$NON-NLS-1$
    }

    @Override
    public String getTypeName(Binding object) {
        return Messages.CamelSAPBindingTypeExtension_SAP_label;
    }

    protected static List<IBindingComposite> createComposites(FormToolkit toolkit, boolean forConsumer) {
        final List<IBindingComposite> composites = new ArrayList<IBindingComposite>(4);
        if (forConsumer) {
            composites.add(new CamelSAPConsumerComposite(toolkit));
        } else {
            composites.add(new CamelSAPProducerComposite(toolkit));
        }
        composites.add(new MessageComposerComposite(toolkit,
                SapPackage.Literals.BASE_CAMEL_BINDING__MESSAGE_COMPOSER,
                SapPackage.Literals.BASE_CAMEL_BINDING__CONTEXT_MAPPER));
        composites.add(new AdvancedCamelBindingDetailsComposite(toolkit, ADVANCED_PROPS,
                SapPackage.eINSTANCE.getBaseCamelBinding_AdditionalUriParameters(), 
                SapPackage.eINSTANCE.getAdditionalUriParametersType_Parameter(), 
                SapPackage.eINSTANCE.getParameterType()));
        return composites;
    }

    private static final List<String> ADVANCED_PROPS;
    
    static {
        ADVANCED_PROPS = new ArrayList<String>();
    }
}
