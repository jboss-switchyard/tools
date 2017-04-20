/******************************************************************************* 
 * Copyright (c) 2014 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.editor.databinding;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * ObservablesUtil
 * <p/>
 * Utilities for working with Observables.
 */
public final class ObservablesUtil {

    /**
     * Creates the appropriate detail value depending on whether or not an
     * editing domain is available.
     * 
     * @param domain the editing domain, may be null.
     * @param value the value being observed
     * @param eStructuralFeature the structural feature to observe
     * @return a new observable value
     */
    public static IObservableValue<?> observeDetailValue(EditingDomain domain, IObservableValue<?> value,
            EStructuralFeature eStructuralFeature) {
        return observeDetailValue(domain, value, FeaturePath.fromList(eStructuralFeature));
    }

    /**
     * Creates the appropriate detail value depending on whether or not an
     * editing domain is available.
     * 
     * @param domain the editing domain, may be null.
     * @param value the value being observed
     * @param featurePath the path to the feature to observe
     * @return a new observable value
     */
    public static IObservableValue<?> observeDetailValue(EditingDomain domain, IObservableValue<?> value,
            FeaturePath featurePath) {
        return domain == null ? EMFProperties.value(featurePath).observeDetail(value) : EMFEditProperties.value(domain,
                featurePath).observeDetail(value);
    }

    /**
     * @param object the object to check
     * @return true if the object has no contents
     */
    public static boolean isEmpty(EObject object) {
        final boolean hasContents = EcoreUtil.getAllContents(object, false).hasNext();
        if (hasContents) {
            return false;
        }
        for (EAttribute attribute : object.eClass().getEAllAttributes()) {
            if (object.eIsSet(attribute) || object.eGet(attribute) != null) {
                return false;
            }
        }
        return true;
    }

    private ObservablesUtil() {
    }

}
