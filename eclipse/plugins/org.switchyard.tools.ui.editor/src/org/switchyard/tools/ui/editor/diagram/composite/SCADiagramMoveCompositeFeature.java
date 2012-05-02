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
package org.switchyard.tools.ui.editor.diagram.composite;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramMoveCompositeFeature extends DefaultMoveShapeFeature {

    /**
     * @param fp the feature provider
     */
    public SCADiagramMoveCompositeFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canMoveShape(IMoveShapeContext context) {
        boolean canMove = super.canMoveShape(context);

        // perform further check only if move allowed by default feature
        if (canMove) {
            // don't allow move if the class name has the length of 1
            Shape shape = context.getShape();
            Object bo = getBusinessObjectForPictogramElement(shape);
            if (bo instanceof Composite) {
                Composite c = (Composite) bo;
                if (c.getName() != null && c.getName().length() == 1) {
                    canMove = false;
                }
            }
        }
        return canMove;
    }

}
