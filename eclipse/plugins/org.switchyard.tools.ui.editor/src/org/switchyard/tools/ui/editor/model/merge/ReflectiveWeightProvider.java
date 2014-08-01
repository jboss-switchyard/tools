/*******************************************************************************
 * Copyright (c) 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *     Redhat, Inc. - updated a few variable names to make CheckStyle happy
 *******************************************************************************/
package org.switchyard.tools.ui.editor.model.merge;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.util.Map;
import java.util.Set;

import org.eclipse.emf.compare.match.eobject.WeightProvider;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

/**
 * Default implementation which is parameterized to set weights based on features, to ignore features and
 * consider "name" features as more important.
 * 
 * Copied from org.eclipse.emf.compare.match.eobject.internal.ReflectiveWeightProvider to combat any
 * API changes between Kepler and Luna.
 * 
 * @author <a href="mailto:cedric.brun@obeo.fr">Cedric Brun</a>
 */
public class ReflectiveWeightProvider implements WeightProvider {

    /***
     * Something not impacting the object identity unless it adds up a lot.
     */
    private static final int SMALL = 5;

    /**
     * A normal change in an object.
     */
    private static final int NORMAL = 10;

    /**
     * Likely to impact the object identity.
     */
    private static final int SIGNIFICANT = 20;

    /**
     * Quite important regarding the Object identity.
     */
    private static final int MAJOR = 150;

    /**
     * Very important regarding the Object identity.
     */
    private static final int MASSIVE = 350;

    /**
     * It is very unlikely the elements are matching if they have differences of this magnitude.
     */
    private static final int UNLIKELY_TO_MATCH = 1000;

    /**
     * The list of specific weight to apply on specific Features.
     */
    private Map<EStructuralFeature, Integer> _weights;

    /**
     * The list of features to ignore during the distance computation.
     */
    private Set<EStructuralFeature> _toBeIgnored;

    /**
     * Weight coefficient of a change on a reference.
     */
    private int _referenceChangeCoef = NORMAL;

    /**
     * Weight coefficient of a change on an attribute.
     */
    private int _attributeChangeCoef = SIGNIFICANT;

    /**
     * Create the weight provider.
     */
    public ReflectiveWeightProvider() {
        _weights = Maps.newHashMap();
        _toBeIgnored = Sets.newLinkedHashSet();
    }

    /**
     * {@inheritDoc}
     */
    public int getWeight(EStructuralFeature feature) {

        if (irrelevant(feature) || _toBeIgnored.contains(feature)) {
            return 0;
        }

        Integer found = _weights.get(feature);
        if (found == null) {
            found = Integer.valueOf(SMALL);
            /*
             * This is worst than empirical but it works in many cases, if your feature is a "name" its likely
             * that it's important for matching the element. At some point I'll have to come up with something
             * which is more extensible..
             */
            if ("name".equals(feature.getName()) || "id".equals(feature.getName())) { //$NON-NLS-1$
                found = Integer.valueOf(SIGNIFICANT);
            }
            if (feature instanceof EReference && ((EReference)feature).isContainment()) {
                found = Integer.valueOf(NORMAL);
            }
        }
        if (feature instanceof EReference) {
            found = _referenceChangeCoef * found.intValue();
        } else {
            found = _attributeChangeCoef * found.intValue();
        }
        return found;
    }

    /**
     * return true i the feature is irrelevant for the comparison.
     * 
     * @param feat
     *            any feature.
     * @return true i the feature is irrelevant for the comparison.
     */
    protected boolean irrelevant(EStructuralFeature feat) {
        boolean irrelevantFeature = feat.isDerived() || feat.isTransient();
        if (!irrelevantFeature && feat instanceof EReference) {
            EReference ref = (EReference)feat;
            irrelevantFeature = ref.isContainment() || ref.isContainer();
        }
        return irrelevantFeature;
    }

    /**
     * {@inheritDoc}
     */
    // CHECKSTYLE:OFF
    public int getParentWeight(EObject a) {
        /*
         * these should belong to an Ecore specific class
         */
        if (a instanceof EStructuralFeature) {
            return MASSIVE;
        } else if (a instanceof EAnnotation) {
            return UNLIKELY_TO_MATCH;
        } else if (a instanceof EOperation) {
            return MAJOR;
        } else if (a instanceof EParameter) {
            return UNLIKELY_TO_MATCH;
        } else if (a instanceof EStringToStringMapEntryImpl) {
            return UNLIKELY_TO_MATCH;
        }
        return SIGNIFICANT;
    }

    // CHECKSTYLE:ON

    /**
     * {@inheritDoc}
     */
    public int getContainingFeatureWeight(EObject a) {
        /*
         * these should belong to an ECore specific class
         */
        if (a instanceof EStructuralFeature || a instanceof EAnnotation || a instanceof EOperation) {
            return MAJOR;
        }
        return SIGNIFICANT;
    }

}
