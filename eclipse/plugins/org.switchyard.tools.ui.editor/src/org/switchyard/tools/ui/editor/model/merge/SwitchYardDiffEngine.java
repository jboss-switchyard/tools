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
package org.switchyard.tools.ui.editor.model.merge;

import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

/**
 * SwitchYardDiffEngine
 * 
 * <p/>
 * Differencing engine for SwitchYard models.
 */
public class SwitchYardDiffEngine extends DefaultDiffEngine implements IDiffEngine {

    /**
     * Create a new SwitchYardDiffEngine.
     * 
     * @param processor the processor
     */
    public SwitchYardDiffEngine(IDiffProcessor processor) {
        super(processor);
    }

    @Override
    protected FeatureFilter createFeatureFilter() {
        // we want diff's for the actual features, not the feature groups
        return new FeatureFilter() {
            @Override
            protected boolean isIgnoredAttribute(EAttribute attribute) {
                return !attribute.isTransient()
                        && (super.isIgnoredAttribute(attribute) || FeatureMapUtil.isFeatureMap(attribute));
            }

            @Override
            protected boolean isIgnoredReference(Match match, EReference reference) {
                return !reference.isTransient()
                        && (super.isIgnoredReference(match, reference) || FeatureMapUtil.isFeatureMap(reference));
            }
        };
    }

    // @Override
    // protected void checkContainmentUpdate(DiffGroup current, Match2Elements
    // matchElement) {
    // final EObject leftElement = matchElement.getLeftElement();
    // final EObject rightElement = matchElement.getRightElement();
    // if (leftElement.eContainmentFeature() != null &&
    // rightElement.eContainmentFeature() != null) {
    // final EStructuralFeature leftAffiliate =
    // ExtendedMetaData.INSTANCE.getAffiliation(leftElement.eContainer()
    // .eClass(), leftElement.eContainmentFeature());
    // final EStructuralFeature rightAffiliate =
    // ExtendedMetaData.INSTANCE.getAffiliation(rightElement
    // .eContainer().eClass(), rightElement.eContainmentFeature());
    // if (!leftAffiliate.getName().equals(rightAffiliate.getName())
    // &&
    // getMatchedEObject(leftElement.eContainer()).equals(rightElement.eContainer()))
    // {
    // createUpdateContainmentOperation(current, leftElement, rightElement);
    // }
    // }
    // }
    //
    // private void createUpdateContainmentOperation(DiffGroup root, EObject
    // left, EObject right) {
    // final UpdateContainmentFeature updateContainment =
    // DiffFactory.eINSTANCE.createUpdateContainmentFeature();
    // updateContainment.setLeftElement(left);
    // updateContainment.setRightElement(right);
    // updateContainment.setRightTarget(getMatchedEObject(left.eContainer()));
    // updateContainment.setLeftTarget(getMatchedEObject(right.eContainer()));
    // root.getSubDiffElements().add(updateContainment);
    // }

}
