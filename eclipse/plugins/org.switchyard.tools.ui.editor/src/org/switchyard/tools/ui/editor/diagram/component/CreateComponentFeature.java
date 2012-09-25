/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.editor.diagram.component;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.diagram.shared.CreateTypeFeature;
import org.switchyard.tools.ui.editor.diagram.shared.ITypeFactory;

/**
 * CreateImplementationFeature
 * 
 * <p/>
 * Feature for creating new Implementation types.
 * 
 * @author Rob Cernich
 */
public class CreateComponentFeature extends CreateTypeFeature<Component, Composite> {

    private String _imageId = ImageProvider.IMG_16_COMPONENT;

    /**
     * Create a new CreateImplementationFeature.
     * 
     * @param fp the feature provider
     * @param factory the factory creating the component
     * @param name the name of this feature
     * @param description the description for this feature
     */
    public CreateComponentFeature(IFeatureProvider fp, ITypeFactory<Component, Composite> factory, String name,
            String description) {
        super(fp, factory, Composite.class, name, description);
    }

    /**
     * Create a new CreateImplementationFeature.
     * 
     * @param fp the feature provider
     * @param factory the factory creating the component
     * @param name the name of this feature
     * @param description the description for this feature
     * @param imageId the image for this feature
     */
    public CreateComponentFeature(IFeatureProvider fp, ITypeFactory<Component, Composite> factory, String name,
            String description, String imageId) {
        super(fp, factory, Composite.class, name, description);
        this._imageId = imageId;
    }

    @Override
    protected Object[] updateContainer(ICreateContext context, Component newObject) {
        getContainerObject(context).getComponent().add(newObject);
        return new Object[] {newObject };
    }

    @Override
    public String getCreateImageId() {
        return this._imageId;
    }

}
