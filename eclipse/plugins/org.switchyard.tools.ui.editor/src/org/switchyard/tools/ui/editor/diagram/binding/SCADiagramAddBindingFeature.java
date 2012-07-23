/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.editor.diagram.binding;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramAddBindingFeature extends AbstractAddShapeFeature {

    /**
     * @param fp feature provider
     */
    public SCADiagramAddBindingFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canAdd(IAddContext context) {
        // check if user wants to add a component service
        if (context.getNewObject() instanceof SwitchYardBindingType) {
            ContainerShape targetContainer = context.getTargetContainer();
            // check if user wants to add to a component
            if (getBusinessObjectForPictogramElement(targetContainer) instanceof Service) {
                return true;
            } else if (getBusinessObjectForPictogramElement(targetContainer) instanceof Reference) {
                return true;
            }

        }
        return false;
    }

    @Override
    public PictogramElement add(IAddContext context) {
        ContainerShape targetContainer = context.getTargetContainer();

        // nothing really to add - just refresh the object so the decorator
        // appears
        getDiagramEditor().refreshRenderingDecorators(targetContainer);

        return targetContainer;
    }

}
