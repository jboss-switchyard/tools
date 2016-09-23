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
package org.switchyard.tools.ui.bpmn2.component;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.tb.IImageDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType;
import org.switchyard.tools.ui.PlatformResourceAdapterFactory;
import org.switchyard.tools.ui.SwitchYardModelUtils;
import org.switchyard.tools.ui.bpmn2.Messages;
import org.switchyard.tools.ui.common.InterfaceControl.InterfaceType;
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
        return new ICreateFeature[] {new CompositeCreateFeature(fp, Messages.label_processBpmn,
                Messages.description_tool_processBpmnComponentImplementation, new CreateComponentFeature(fp,
                        new BPMComponentFactory(), Messages.label_processBpmn,
                        Messages.description_tool_processBpmnComponent, ImageProvider.IMG_16_BPMN),
                new CreateImplementationFeature(fp, new BPMImplementationFactory(), Messages.label_processBpmn,
                        Messages.description_tool_processBpmnImplementation)) };
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
        String defaultRequirement = "org.switchyard.components:switchyard-component-bpm"; //$NON-NLS-1$
        IProject project = PlatformResourceAdapterFactory.getContainingProject(object);
        if (project != null) {
            if (SwitchYardModelUtils.projectUsesIntegrationPack(project)) {
                defaultRequirement = "org.jboss.integration.fuse:switchyard-component-bpm"; //$NON-NLS-1$
            }
        }
        return Collections.singletonList(defaultRequirement);
    }

    @Override
    public Set<InterfaceType> getSupportedInterfaceTypes(Implementation implementation) {
        return EnumSet.allOf(InterfaceType.class);
    }

    @Override
    public String getTypeName(Implementation object) {
        return Messages.label_bpm;
    }
}
