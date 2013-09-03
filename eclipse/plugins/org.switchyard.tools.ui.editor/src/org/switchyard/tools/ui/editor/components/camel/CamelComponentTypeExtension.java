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
package org.switchyard.tools.ui.editor.components.camel;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.tb.IImageDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.ui.common.InterfaceControl.InterfaceType;
import org.switchyard.tools.ui.editor.IComponentTypeExtension;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.components.camel.java.CamelJavaComponentFactory;
import org.switchyard.tools.ui.editor.components.camel.java.CamelJavaImplementationFactory;
import org.switchyard.tools.ui.editor.components.camel.xml.CamelXMLComponentFactory;
import org.switchyard.tools.ui.editor.components.camel.xml.CamelXMLImplementationFactory;
import org.switchyard.tools.ui.editor.diagram.component.CreateComponentFeature;
import org.switchyard.tools.ui.editor.diagram.implementation.CreateImplementationFeature;
import org.switchyard.tools.ui.editor.diagram.shared.CompositeCreateFeature;

/**
 * CamelComponentTypeExtension
 * 
 * <p/>
 * Provides support for Camel components in the SwitchYard editor.
 */
public class CamelComponentTypeExtension implements IComponentTypeExtension {

    @Override
    public ICreateFeature[] newCreateFeatures(IFeatureProvider fp) {
        return new ICreateFeature[] {
                new CompositeCreateFeature(fp, Messages.label_camelJava, Messages.description_tool_camelJavaComponentImplementation,
                        new CreateComponentFeature(fp, new CamelJavaComponentFactory(), Messages.label_camelJava,
                                Messages.description_tool_camelJavaComponent,
                                ImageProvider.IMG_16_CAMEL_JAVA), new CreateImplementationFeature(fp,
                                new CamelJavaImplementationFactory(), Messages.label_camelJava,
                                Messages.description_tool_camelJavaImplementation)),
                new CompositeCreateFeature(fp, Messages.label_camelXml, Messages.description_tool_camelXmlComponentImplementation,
                        new CreateComponentFeature(fp, new CamelXMLComponentFactory(), Messages.label_camelXml,
                                Messages.description_tool_camelXmlComponent,
                                ImageProvider.IMG_16_CAMEL_XML), new CreateImplementationFeature(fp,
                                new CamelXMLImplementationFactory(), Messages.label_camelXml,
                                Messages.description_tool_camelXmlImplementation)) };
    }

    @Override
    public IImageDecorator getImageDecorator(Implementation implementation) {
        final CamelImplementationType camelImpl = (CamelImplementationType) implementation;
        if (camelImpl.getJava() != null) {
            return new ImageDecorator(ImageProvider.IMG_16_CAMEL_JAVA);
        } else if (camelImpl.getXml() != null) {
            return new ImageDecorator(ImageProvider.IMG_16_CAMEL_XML);
        }
        return new ImageDecorator(ImageProvider.IMG_16_CAMEL);
    }

    @Override
    public boolean supports(Class<? extends Implementation> type) {
        return CamelImplementationType.class.isAssignableFrom(type);
    }

    @Override
    public List<String> getRequiredCapabilities(Implementation object) {
        return Collections.singletonList("org.switchyard.components:switchyard-component-camel"); //$NON-NLS-1$
    }

    @Override
    public Set<InterfaceType> getSupportedInterfaceTypes(Implementation implementation) {
        return EnumSet.allOf(InterfaceType.class);
    }

    @Override
    public String getTypeName(Implementation object) {
        return Messages.label_camel;
    }
}
