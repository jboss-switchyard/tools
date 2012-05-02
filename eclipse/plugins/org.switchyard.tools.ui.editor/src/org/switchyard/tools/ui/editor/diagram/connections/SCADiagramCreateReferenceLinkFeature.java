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
package org.switchyard.tools.ui.editor.diagram.connections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.switchyard.tools.ui.editor.ImageProvider;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramCreateReferenceLinkFeature extends AbstractCreateConnectionFeature {

    /**
     * @param fp the feature provider
     */
    public SCADiagramCreateReferenceLinkFeature(IFeatureProvider fp) {
        super(fp, "Reference (dashed)", "Create Reference");
    }

    @Override
    public boolean canCreate(ICreateConnectionContext context) {
        if (context.getSourceAnchor() != null && context.getTargetAnchor() != null) {

            Object source = getObjectForAnchor(context.getSourceAnchor());
            Object target = getObjectForAnchor(context.getTargetAnchor());
            if (source != null && target != null) {
                if (source instanceof Component && target instanceof Reference) {
                    Object src = getFeatureProvider().getBusinessObjectForPictogramElement(
                            context.getSourceAnchor().getLink().getPictogramElement());
                    if (src != null && src instanceof ComponentReference) {
                        return true;
                    }
                } else if (source instanceof Component && target instanceof Component) {
                    Object src = getFeatureProvider().getBusinessObjectForPictogramElement(
                            context.getSourceAnchor().getLink().getPictogramElement());
                    Object tgt = getFeatureProvider().getBusinessObjectForPictogramElement(
                            context.getTargetAnchor().getLink().getPictogramElement());
                    if (src != null && src instanceof ComponentService && tgt != null
                            && tgt instanceof ComponentReference) {
                        return true;
                    }
                }

            }
        }
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.graphiti.func.ICreateConnection#canStartConnection(org.eclipse.graphiti.features.context.ICreateConnectionContext)
     */
    @Override
    public boolean canStartConnection(ICreateConnectionContext context) {
        // return true if start anchor is a component/component reference
        if (getObjectForAnchor(context.getSourceAnchor()) != null) {
            Object source = getObjectForAnchor(context.getSourceAnchor());
            if (source != null) {
                if (source instanceof Component) {
                    Object src = getFeatureProvider().getBusinessObjectForPictogramElement(
                            context.getSourceAnchor().getLink().getPictogramElement());
                    if (src != null && src instanceof ComponentReference) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.graphiti.func.ICreateConnection#create(org.eclipse.graphiti.features.context.ICreateConnectionContext)
     */
    @Override
    public Connection create(ICreateConnectionContext context) {
        Connection newConnection = null;

        Object source = getObjectForAnchor(context.getSourceAnchor());
        Object target = getObjectForAnchor(context.getTargetAnchor());

        if (source instanceof Component && target instanceof Reference) {
            // get EClasses which should be connected
            Component src = (Component) getObjectForAnchor(context.getSourceAnchor());
            Reference tgt = (Reference) getObjectForAnchor(context.getTargetAnchor());

            if (source != null && target != null) {
                // create new business object
                ComponentReference eReference = createComponentReference(src, tgt);

                // add connection for business object
                AddConnectionContext addContext = new AddConnectionContext(context.getSourceAnchor(),
                        context.getTargetAnchor());
                addContext.setNewObject(eReference);
                newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
            }
        } else if (source instanceof Component && target instanceof Component) {
            Component src = (Component) getObjectForAnchor(context.getSourceAnchor());
            Component tgt = (Component) getObjectForAnchor(context.getTargetAnchor());

            // create new business object
            ComponentReference eReference = createComponentReference(src, tgt);

            // add connection for business object
            AddConnectionContext addContext = new AddConnectionContext(context.getSourceAnchor(),
                    context.getTargetAnchor());
            addContext.setNewObject(eReference);
            newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
        }

        return newConnection;
    }

    /*
     * Returns the object belonging to the anchor, or null if not available.
     * @param anchor the anchor to check
     * @return the linked object
     */
    private Object getObjectForAnchor(Anchor anchor) {
        if (anchor != null) {
            Object object = getBusinessObjectForPictogramElement(anchor.getParent());
            if (object instanceof Component || object instanceof Reference) {
                return object;
            }
        }
        return null;
    }

    /*
     * Creates a connection between a component reference and a reference
     * @param source Component
     * @param target Reference
     * @return ComponentReference
     */
    private ComponentReference createComponentReference(Component source, Reference target) {
        EList<ComponentReference> references = source.getReference();
        ComponentReference eRef = null;
        for (ComponentReference componentReference : references) {
            eRef = componentReference;
            break;
        }
        target.getPromote().add(eRef);
        return eRef;
    }

    /*
     * @param source Component
     * @param target Component
     * @return ComponentReference
     */
    private ComponentReference createComponentReference(Component source, Component target) {
        EList<ComponentService> services = source.getService();
        ComponentService eSvc = null;
        for (ComponentService componentService : services) {
            eSvc = componentService;
            break;
        }
        EList<ComponentReference> references = target.getReference();
        ComponentReference eRef = null;
        for (ComponentReference componentReference : references) {
            eRef = componentReference;
            break;
        }
        eRef.setName(eSvc.getName());
        return eRef;
    }

    @Override
    public String getCreateImageId() {
        return ImageProvider.IMG_16_CONNECTION;
    }
}
