package org.switchyard.tools.ui.editor.diagram.binding;

import org.eclipse.emf.ecore.EObject;

/**
 * @author bfitzpat
 *
 */
public class PropertyObject {

    private String _featureName = null;
    private EObject _eObject = null;

    /**
     * @param object incoming eobject
     * @param feature incoming feature id
     */
    public PropertyObject(EObject object, String feature) {
        this._featureName = feature;
        this._eObject = object;
    }

    /**
     * @return String
     */
    public String getFeatureName() {
        return _featureName;
    }

    /**
     * @return EObject
     */
    public EObject getEObject() {
        return _eObject;
    }

}
