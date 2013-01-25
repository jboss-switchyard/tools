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
package org.switchyard.tools.ui.editor.diagram.binding;

import java.util.Collection;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.ui.editor.BindingTypeExtensionManager;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.diagram.shared.CreateTypeFeature;
import org.switchyard.tools.ui.editor.diagram.shared.ITypeFactory;

/**
 * CreateBindingFeature
 * 
 * <p/>
 * Feature for creating new Binding types.
 * 
 * @author Rob Cernich
 */
public class CreateBindingFeature extends CreateTypeFeature<Binding, Contract> {

    private String _imageProvider = ImageProvider.IMG_16_CHAIN;

    /**
     * Create a new CreateBindingFeature.
     * 
     * @param fp the feature provider
     * @param factory the factory creating the binding
     * @param name the name of this feature
     * @param description the description for this feature
     */
    public CreateBindingFeature(IFeatureProvider fp, ITypeFactory<Binding, Contract> factory, String name,
            String description) {
        super(fp, factory, Contract.class, name, description);
    }

    /**
     * Create a new CreateBindingFeature.
     * 
     * @param fp the feature provider
     * @param factory the factory creating the binding
     * @param name the name of this feature
     * @param description the description for this feature
     * @param imageId the image ID for this feature
     */
    public CreateBindingFeature(IFeatureProvider fp, ITypeFactory<Binding, Contract> factory, String name,
            String description, String imageId) {
        super(fp, factory, Contract.class, name, description);
        _imageProvider = imageId;
    }

    @Override
    public boolean canCreate(ICreateContext context) {
        Object bo = getBusinessObjectForPictogramElement(context.getTargetContainer());
        // we don't allow bindings for all Contract types
        return super.canCreate(context) && (bo instanceof Reference || bo instanceof Service);
    }

    @Override
    protected Object[] updateContainer(ICreateContext context, Binding newObject) {
        getContainerObject(context).getBinding().add(newObject);
        return new Object[] {newObject };
    }

    @Override
    public String getCreateImageId() {
        return _imageProvider;
    }

    @Override
    protected Collection<String> getRequiredCapabilities(Binding newObject) {
        return BindingTypeExtensionManager.instance().getExtensionFor(newObject.getClass())
                .getRequiredCapabilities(newObject);
    }

}
