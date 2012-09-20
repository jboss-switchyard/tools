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
package org.switchyard.tools.ui.editor.diagram;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;

/**
 * ReadOnlyDeleteFeature
 * 
 * <p/>
 * Default delete feature for working with merged models.
 */
public class ReadOnlyDeleteFeature extends DefaultDeleteFeature {

    /**
     * Create a new ReadOnlyDeleteFeature.
     * 
     * @param fp the feature provider.
     */
    public ReadOnlyDeleteFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canDelete(IDeleteContext context) {
        Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
        return super.canDelete(context)
                && bo instanceof EObject
                && (((EObject) bo).eResource() == null || !getFeatureProvider().getDiagramTypeProvider()
                        .getDiagramEditor().getEditingDomain().isReadOnly(((EObject) bo).eResource()));
    }

}
