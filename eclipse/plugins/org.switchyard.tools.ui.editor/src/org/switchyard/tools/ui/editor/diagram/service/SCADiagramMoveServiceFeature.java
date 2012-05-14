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
package org.switchyard.tools.ui.editor.diagram.service;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.impl.MoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramMoveServiceFeature extends DefaultMoveShapeFeature {

    /**
     * @param fp the feature provider
     */
    public SCADiagramMoveServiceFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    protected void preMoveShape(IMoveShapeContext context) {
        super.preMoveShape(context);
        if (context instanceof MoveShapeContext) {
            // X coordinate of service shape cannot change (i.e. it's fixed to
            // the left edge of the composite)
            MoveShapeContext msc = (MoveShapeContext) context;
            msc.setX(msc.getX() - msc.getDeltaX());
            msc.setDeltaX(0);
        }
    }

}
