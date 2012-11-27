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
package org.switchyard.tools.ui.editor.diagram.binding;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;

/**
 * @author bfitzpat
 *
 */
public class OperationSelectorOp extends ModelOperation {

    private String _featureID = null;
    private Object _value = null;
    private Binding _binding = null;
   
    /**
     * @param binding incoming binding
     * @param featureID feature ID to update
     * @param value value to set
     */
    public OperationSelectorOp(Binding binding, String featureID, Object value) {
        _featureID = featureID;
        _value = value;
        _binding = binding;
    }
    
    @Override
    public void run() throws Exception {
        Object object = _binding.getOperationSelector();
        if (object != null) {
            OperationSelectorType opSelect = (OperationSelectorType) object;
            setFeatureValue(opSelect, _featureID, _value);
        }
    }

    /**
     * @param eObject incoming object to update
     * @param featureId feature to update
     * @param value value for feature
     * @throws Exception in case something can't be found
     */
    public void setFeatureValue(EObject eObject, String featureId, Object value) throws Exception {
        EClass eClass = eObject.eClass();
        for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
            EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
            if (eStructuralFeature.isChangeable()) {
                if (eStructuralFeature.getName().equalsIgnoreCase(featureId)) {
                    eObject.eSet(eStructuralFeature, value);
                    return;
                }
            }
        }
        System.out.println("No love, didn't find feature: " + featureId);
        showFeatures(eObject);
        throw new Exception("Feature ID (" + featureId + ") not found.");
    }

    private void showFeatures(EObject eObject) {
        EClass eClass = eObject.eClass();
        for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
            EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
            if (eStructuralFeature.isChangeable()) {
                System.out.println("Feature: " + eStructuralFeature.getName());
            }
        }
    }
}
