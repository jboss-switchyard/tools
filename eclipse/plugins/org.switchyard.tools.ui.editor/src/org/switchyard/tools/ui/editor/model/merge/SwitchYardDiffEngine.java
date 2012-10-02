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

import org.eclipse.emf.compare.diff.engine.GenericDiffEngine;
import org.eclipse.emf.compare.diff.engine.IDiffEngine;
import org.eclipse.emf.compare.diff.engine.check.AttributesCheck;
import org.eclipse.emf.compare.diff.engine.check.ReferencesCheck;
import org.eclipse.emf.compare.diff.metamodel.DiffFactory;
import org.eclipse.emf.compare.diff.metamodel.DiffGroup;
import org.eclipse.emf.compare.diff.metamodel.UpdateContainmentFeature;
import org.eclipse.emf.compare.match.metamodel.Match2Elements;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

/**
 * SwitchYardDiffEngine
 * 
 * <p/>
 * Differencing engine for SwitchYard models.
 */
public class SwitchYardDiffEngine extends GenericDiffEngine implements IDiffEngine {

    /**
     * Create a new SwitchYardDiffEngine.
     */
    public SwitchYardDiffEngine() {
    }

    @Override
    protected AttributesCheck getAttributesChecker() {
        return new AttributesCheck(matchCrossReferencer) {
            @Override
            protected boolean shouldBeIgnored(EAttribute attribute) {
                return super.shouldBeIgnored(attribute) || FeatureMapUtil.isFeatureMap(attribute);
            }
        };
    }

    @Override
    protected ReferencesCheck getReferencesChecker() {
        return new ReferencesCheck(matchCrossReferencer) {
            @Override
            protected boolean shouldBeIgnored(EReference reference) {
                return super.shouldBeIgnored(reference) || FeatureMapUtil.isFeatureMap(reference);
            }
        };
    }

    @Override
    protected void checkContainmentUpdate(DiffGroup current, Match2Elements matchElement) {
        final EObject leftElement = matchElement.getLeftElement();
        final EObject rightElement = matchElement.getRightElement();
        if (leftElement.eContainmentFeature() != null && rightElement.eContainmentFeature() != null) {
            final EStructuralFeature leftAffiliate = ExtendedMetaData.INSTANCE.getAffiliation(leftElement.eContainer()
                    .eClass(), leftElement.eContainmentFeature());
            final EStructuralFeature rightAffiliate = ExtendedMetaData.INSTANCE.getAffiliation(rightElement
                    .eContainer().eClass(), rightElement.eContainmentFeature());
            if (!leftAffiliate.getName().equals(rightAffiliate.getName())
                    && getMatchedEObject(leftElement.eContainer()).equals(rightElement.eContainer())) {
                createUpdateContainmentOperation(current, leftElement, rightElement);
            }
        }
    }

    private void createUpdateContainmentOperation(DiffGroup root, EObject left, EObject right) {
        final UpdateContainmentFeature updateContainment = DiffFactory.eINSTANCE.createUpdateContainmentFeature();
        updateContainment.setLeftElement(left);
        updateContainment.setRightElement(right);
        updateContainment.setRightTarget(getMatchedEObject(left.eContainer()));
        updateContainment.setLeftTarget(getMatchedEObject(right.eContainer()));
        root.getSubDiffElements().add(updateContainment);
    }

}
