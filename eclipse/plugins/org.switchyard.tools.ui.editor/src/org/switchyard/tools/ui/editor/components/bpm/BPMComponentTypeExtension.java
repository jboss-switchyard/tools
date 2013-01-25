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
package org.switchyard.tools.ui.editor.components.bpm;

import java.util.Collections;
import java.util.List;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.tb.IImageDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType;
import org.switchyard.tools.ui.editor.IComponentTypeExtension;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.diagram.component.CreateComponentFeature;
import org.switchyard.tools.ui.editor.diagram.implementation.CreateImplementationFeature;
import org.switchyard.tools.ui.editor.diagram.shared.CompositeCreateFeature;

/**
 * BPMComponentTypeExtension
 * 
 * <p/>
 * Provides support for BPM components in the SwitchYard editor.
 */
public class BPMComponentTypeExtension implements IComponentTypeExtension {

    @Override
    public ICreateFeature[] newCreateFeatures(IFeatureProvider fp) {
        return new ICreateFeature[] {new CompositeCreateFeature(fp, "Process (BPMN)",
                "A BPMN process based component/implementation.", new CreateComponentFeature(fp,
                        new BPMComponentFactory(), "Process (BPMN)",
                        "Create a component implemented as a BPMN process.", ImageProvider.IMG_16_BPMN),
                new CreateImplementationFeature(fp, new BPMImplementationFactory(), "Process (BPMN)",
                        "An implementation using a BPMN process.")) };
    }

    @Override
    public IImageDecorator getImageDecorator(Implementation implementation) {
        return new ImageDecorator(ImageProvider.IMG_16_BPMN);
    }

    @Override
    public boolean supports(Class<? extends Implementation> type) {
        return BPMImplementationType.class.isAssignableFrom(type);
    }


    @Override
    public List<String> getRequiredCapabilities(Implementation object) {
        return Collections.singletonList("org.switchyard.components:switchyard-component-bpm");
    }
}
