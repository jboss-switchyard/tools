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
package org.switchyard.tools.ui.editor.components.rules;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.tb.IImageDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType;
import org.switchyard.tools.ui.common.InterfaceControl.InterfaceType;
import org.switchyard.tools.ui.editor.IComponentTypeExtension;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.diagram.component.CreateComponentFeature;
import org.switchyard.tools.ui.editor.diagram.implementation.CreateImplementationFeature;
import org.switchyard.tools.ui.editor.diagram.shared.CompositeCreateFeature;

/**
 * RulesComponentTypeExtension
 * 
 * <p/>
 * Provides support for rules components in the SwitchYard editor.
 */
public class RulesComponentTypeExtension implements IComponentTypeExtension {

    @Override
    public ICreateFeature[] newCreateFeatures(IFeatureProvider fp) {
        return new ICreateFeature[] {new CompositeCreateFeature(fp, "Rules (DRL)",
                "A rules based component/implementation.", new CreateComponentFeature(fp, new RulesComponentFactory(),
                        "Rules (DRL)", "Create a component implemented using rules.", ImageProvider.IMG_16_RULES),
                new CreateImplementationFeature(fp, new RulesImplementationFactory(), "Rules (DRL)",
                        "An implementation using rules.")) };
    }

    @Override
    public IImageDecorator getImageDecorator(Implementation implementation) {
        return new ImageDecorator(ImageProvider.IMG_16_RULES);
    }

    @Override
    public boolean supports(Class<? extends Implementation> type) {
        return RulesImplementationType.class.isAssignableFrom(type);
    }

    @Override
    public List<String> getRequiredCapabilities(Implementation object) {
        return Collections.singletonList("org.switchyard.components:switchyard-component-rules");
    }

    @Override
    public Set<InterfaceType> getSupportedInterfaceTypes(Implementation implementation) {
        return EnumSet.allOf(InterfaceType.class);
    }

    @Override
    public String getTypeName(Implementation object) {
        return "Rules";
    }
}
