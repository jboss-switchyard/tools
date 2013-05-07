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
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;

/**
 * ConnectionDeleteFeature
 * 
 * <p/>
 * Handles deletion of a connection representing a reference promotion.
 */
public class ConnectionDeleteFeature extends DefaultDeleteFeature {

    /**
     * Create a new ConnectionDeleteFeature.
     * 
     * @param fp the feature provider.
     */
    public ConnectionDeleteFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canDelete(IDeleteContext context) {
        final PictogramElement pe = context.getPictogramElement();
        if (pe instanceof Connection) {
            final Connection connection = (Connection) pe;
            final Object startBO = getBusinessObjectForPictogramElement(connection.getStart());
            final Object endBO = getBusinessObjectForPictogramElement(connection.getEnd());
            if (startBO instanceof Service) {
                return ((EObject) startBO).eResource() == null
                        || !getFeatureProvider().getDiagramTypeProvider().getDiagramBehavior().getEditingDomain()
                                .isReadOnly(((EObject) startBO).eResource());
            } else if (endBO instanceof Reference) {
                return ((EObject) endBO).eResource() == null
                        || !getFeatureProvider().getDiagramTypeProvider().getDiagramBehavior().getEditingDomain()
                                .isReadOnly(((EObject) endBO).eResource());
            }
        }
        // can't delete connections between component references and component
        // services.
        return false;
    }

    @Override
    protected void deleteBusinessObjects(Object[] businessObjects) {
        // no business objects are actually associated with connections.
    }

    @Override
    public void preDelete(IDeleteContext context) {
        super.preDelete(context);
        final Connection connection = (Connection) context.getPictogramElement();
        final Object startBO = getBusinessObjectForPictogramElement(connection.getStart());
        final Object endBO = getBusinessObjectForPictogramElement(connection.getEnd());
        if (startBO instanceof Service) {
            ((Service) startBO).setPromote(null);
        } else if (endBO instanceof Reference) {
            ((Reference) endBO).getPromote().remove((ComponentReference) startBO);
        }
    }

}
