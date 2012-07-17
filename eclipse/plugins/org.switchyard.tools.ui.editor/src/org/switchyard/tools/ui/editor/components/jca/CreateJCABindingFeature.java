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
package org.switchyard.tools.ui.editor.components.jca;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.ui.editor.diagram.binding.CreateBindingFeature;
import org.switchyard.tools.ui.editor.diagram.shared.ITypeFactory;

/**
 * CreateJCABindingFeature
 * 
 * <p/>
 * Feature for creating new JCA inbound Binding types.
 * TODO: When outbound tooling is ready, there won't be a need for this and we can
 * just use the CreateBindingFeature class
 * 
 * @author bfitzpat
 */
public class CreateJCABindingFeature extends CreateBindingFeature {

    /**
     * Create a new CreateBindingFeature.
     * 
     * @param fp the feature provider
     * @param factory the factory creating the binding
     * @param name the name of this feature
     * @param description the description for this feature
     */
    public CreateJCABindingFeature(IFeatureProvider fp, ITypeFactory<Binding, Contract> factory, String name,
            String description) {
        super(fp, factory, name, description);
    }
    @Override
    public boolean canCreate(ICreateContext context) {
        Object bo = getBusinessObjectForPictogramElement(context.getTargetContainer());
        // we don't allow bindings for all Contract types, just service at this point
        return super.canCreate(context) && (bo instanceof Service);
    }

}
