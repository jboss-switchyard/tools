/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.soa.sca.sca1_1.model.sca.util.ScaResourceImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceFactoryImpl
 * @generated NOT
 */
public class SwitchyardResourceImpl extends ScaResourceImpl {
    
    private Resource _generated;
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public SwitchyardResourceImpl(URI uri) {
		super(uri);
	}

	/**
	 * @param generated the generated SwitchYard resource.
	 * @generated NOT
	 */
	public void setGeneratedResource(Resource generated) {
	    _generated = generated;
	}

    /**
     * @return the generated SwitchYard resource associated with this source
     *         resource.
     * @generated NOT
     */
	public Resource getGeneratedResource() {
	    return _generated;
	}

    @Override
    public EObject getEObject(String uriFragment) {
        EObject object = super.getEObject(uriFragment);
        if (object == null && _generated != null) {
            object = _generated.getEObject(uriFragment);
        }
        return object;
    }

} //SwitchyardResourceImpl
