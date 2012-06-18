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
package org.switchyard.tools.ui.editor.diagram.implementation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.diagram.shared.CreateTypeFeature;

/**
 * CreateImplementationFeature
 * 
 * <p/>
 * Feature for creating new Implementation types.
 * 
 * @author Rob Cernich
 */
public class CreateImplementationFeature extends CreateTypeFeature<Implementation, Component> {

    /**
     * Create a new CreateImplementationFeature.
     * 
     * @param fp the feature provider
     * @param factory the factory creating the implementation
     * @param name the name of this feature
     * @param description the description for this feature
     */
    public CreateImplementationFeature(IFeatureProvider fp, IImplementationTypeFactory factory, String name,
            String description) {
        super(fp, factory, Component.class, name, description);
    }

    @Override
    public Object[] create(ICreateContext context) {
        if (getContainerObject(context).getImplementation() != null) {
            if (!MessageDialog
                    .openQuestion(
                            getShell(),
                            "Replace Current Implementation",
                            "This component is already associated with an implementation.  Do you want to replace the existing implementation with a new one?")) {
                return null;
            }
        }
        return super.create(context);
    }

    @Override
    protected Object[] updateContainer(ICreateContext context, Implementation newObject) {
        final List<Object> added = new ArrayList<Object>(3);
        final Component component = getContainerObject(context);

        // add the implementation
        component.getImplementationGroup().clear();
        component.getImplementationGroup().set(newObject.getDocumentFeature(), newObject);
        added.add(newObject);

        final IImplementationTypeFactory factory = (IImplementationTypeFactory) getFactory();
        if (component.getService().size() == 0) {
            // add any new services
            final ComponentService service = factory.getImplementedService();
            if (service != null) {
                component.getService().add(service);
                added.add(service);
            }
        }

        if (component.getReference().size() == 0) {
            // add any new references
            final List<ComponentReference> references = factory.getImplementationReferences();
            if (references != null) {
                for (ComponentReference reference : references) {
                    component.getReference().add(reference);
                    added.add(reference);
                }
            }
        }

        return added.toArray();
    }

    @Override
    public String getCreateImageId() {
        return ImageProvider.IMG_16_IMPLEMENTATION_TYPE;
    }

}
