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
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.editor.diagram;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.impl.CreateContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

/**
 * This custom feature wraps a create feature so we can use it as a menu item
 * in the graphiti context menu.
 * @author bfitzpat
 *
 */
public class CreateWrapperCustomFeature extends AbstractCustomFeature implements ICustomFeature {
    
    private ICreateFeature _createFeature = null;
    
    /**
     * Create this class.
     * @param fp Feature Provider
     * @param cf Create Feature to wrap
     */
    public CreateWrapperCustomFeature(IFeatureProvider fp, ICreateFeature cf) {
        super(fp);
        _createFeature = cf;
    }

    @Override
    public void execute(ICustomContext context) {
        ICreateContext createContext = adaptCustomContextToCreateContext(context);
        _createFeature.execute(createContext);
    }

    @Override
    public String getDescription() {
        if (_createFeature !=  null) {
            return _createFeature.getCreateDescription();
        }
        return null;
    }

    @Override
    public String getImageId() {
        if (_createFeature !=  null) {
            return _createFeature.getCreateImageId();
        }
        return null;
    }

    @Override
    public String getName() {
        if (_createFeature !=  null) {
            return _createFeature.getCreateName();
        } 
        return null;
    }

    private ICreateContext adaptCustomContextToCreateContext(ICustomContext customContext) {
        CreateContext createContext = new CreateContext();
        PictogramElement[] picElements = customContext.getPictogramElements();
        createContext.setTargetContainer((ContainerShape) picElements[0]);

        // making the absolute location point relative to the container
        int x = createContext.getTargetContainer().getGraphicsAlgorithm().getX() + 20;
        int y = createContext.getTargetContainer().getGraphicsAlgorithm().getY() + 20;
        createContext.setLocation(x, y);
        
        return createContext;
    }

    @Override
    public boolean canExecute(ICustomContext context) {
        ICreateContext createContext = adaptCustomContextToCreateContext(context);
        return _createFeature.canExecute(createContext);
    }
}
