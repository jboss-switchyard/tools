/*******************************************************************************
 * Copyright (c) 2006, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.switchyard.tools.ui.editor.model.merge;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.compare.EMFComparePlugin;
import org.eclipse.emf.compare.FactoryException;
import org.eclipse.emf.compare.diff.merge.DefaultMerger;
import org.eclipse.emf.compare.diff.metamodel.ModelElementChangeLeftTarget;
import org.eclipse.emf.compare.diff.metamodel.ReferenceChangeLeftTarget;
import org.eclipse.emf.compare.diff.metamodel.ReferenceOrderChange;
import org.eclipse.emf.compare.util.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;

/**
 * Merger for an {@link ModelElementChangeLeftTarget} operation.<br/>
 * <p>
 * Are considered for this merger :
 * <ul>
 * <li>AddModelElement</li>
 * <li>RemoteRemoveModelElement</li>
 * </ul>
 * </p>
 * 
 * @author <a href="mailto:laurent.goubet@obeo.fr">Laurent Goubet</a>
 */
public class ModelElementChangeLeftTargetMerger extends DefaultMerger {
    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.emf.compare.diff.merge.api.AbstractMerger#applyInOrigin()
     */
    @Override
    public void applyInOrigin() {
        final ModelElementChangeLeftTarget theDiff = (ModelElementChangeLeftTarget)this.diff;
        final EObject element = theDiff.getLeftElement();
        final EObject parent = theDiff.getLeftElement().eContainer();
        EcoreUtil.remove(element);
        // now removes all the dangling references
        removeDanglingReferences(parent);
        super.applyInOrigin();
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.emf.compare.diff.merge.api.AbstractMerger#undoInTarget()
     */
    @Override
    public void undoInTarget() {
        final ModelElementChangeLeftTarget theDiff = (ModelElementChangeLeftTarget)this.diff;
        // we should copy the element to the Origin one.
        final EObject origin = theDiff.getRightParent();
        final EObject element = theDiff.getLeftElement();
        final EObject newOne = copy(element);
        final EReference ref = element.eContainmentFeature();
        if (ref != null) {
            try {
                int elementIndex = -1;
                if (ref.isMany()) {
                    final Object containmentRefVal = element.eContainer().eGet(ref);
                    if (containmentRefVal instanceof List) {
                        final List listVal = (List)containmentRefVal;
                        elementIndex = listVal.indexOf(element);
                    }
                }
                EFactory.eAdd(origin, ExtendedMetaData.INSTANCE.getAffiliation(origin.eClass(), ref).getName(), newOne,
                        elementIndex);
                setXMIID(newOne, getXMIID(element));
            } catch (final FactoryException e) {
                EMFComparePlugin.log(e, true);
            }
        } else if (origin == null && getDiffModel().getRightRoots().size() > 0) {
            getDiffModel().getRightRoots().get(0).eResource().getContents().add(newOne);
        } else if (origin != null) {
            origin.eResource().getContents().add(newOne);
//        } else {
            // FIXME throw exception : couldn't merge this
        }
        // we should now have a look for RemovedReferencesLinks needing elements to apply
        final Iterator<EObject> siblings = getDiffModel().eAllContents();
        while (siblings.hasNext()) {
            final Object op = siblings.next();
            if (op instanceof ReferenceChangeLeftTarget) {
                final ReferenceChangeLeftTarget link = (ReferenceChangeLeftTarget)op;
                // now if I'm in the target References I should put my copy in the origin
                if (link.getRightTarget() != null && link.getRightTarget().equals(element)) {
                    link.setLeftTarget(newOne);
                }
            } else if (op instanceof ReferenceOrderChange) {
                final ReferenceOrderChange link = (ReferenceOrderChange)op;
                if (link.getReference().equals(ref)) {
                    // FIXME respect ordering!
                    link.getRightTarget().add(newOne);
                }
            }
        }
        super.undoInTarget();
    }
}
