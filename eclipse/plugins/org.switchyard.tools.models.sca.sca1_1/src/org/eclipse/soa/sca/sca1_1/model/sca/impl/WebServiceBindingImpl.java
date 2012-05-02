/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.WebServiceBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Service Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.WebServiceBindingImpl#getEndpointReference <em>Endpoint Reference</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.WebServiceBindingImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.WebServiceBindingImpl#getWsdlElement <em>Wsdl Element</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.WebServiceBindingImpl#getWsdlLocation <em>Wsdl Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebServiceBindingImpl extends BindingImpl implements WebServiceBinding {
	/**
	 * The cached value of the '{@link #getEndpointReference() <em>Endpoint Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointReference()
	 * @generated
	 * @ordered
	 */
	protected EList<EndpointReferenceType> endpointReference;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The default value of the '{@link #getWsdlElement() <em>Wsdl Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlElement()
	 * @generated
	 * @ordered
	 */
	protected static final String WSDL_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsdlElement() <em>Wsdl Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlElement()
	 * @generated
	 * @ordered
	 */
	protected String wsdlElement = WSDL_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsdlLocation() <em>Wsdl Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlLocation()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> WSDL_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsdlLocation() <em>Wsdl Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlLocation()
	 * @generated
	 * @ordered
	 */
	protected List<String> wsdlLocation = WSDL_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebServiceBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScaPackage.eINSTANCE.getWebServiceBinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndpointReferenceType> getEndpointReference() {
		if (endpointReference == null) {
			endpointReference = new EObjectContainmentEList<EndpointReferenceType>(EndpointReferenceType.class, this, ScaPackage.WEB_SERVICE_BINDING__ENDPOINT_REFERENCE);
		}
		return endpointReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, ScaPackage.WEB_SERVICE_BINDING__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWsdlElement() {
		return wsdlElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlElement(String newWsdlElement) {
		String oldWsdlElement = wsdlElement;
		wsdlElement = newWsdlElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.WEB_SERVICE_BINDING__WSDL_ELEMENT, oldWsdlElement, wsdlElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getWsdlLocation() {
		return wsdlLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlLocation(List<String> newWsdlLocation) {
		List<String> oldWsdlLocation = wsdlLocation;
		wsdlLocation = newWsdlLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.WEB_SERVICE_BINDING__WSDL_LOCATION, oldWsdlLocation, wsdlLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScaPackage.WEB_SERVICE_BINDING__ENDPOINT_REFERENCE:
				return ((InternalEList<?>)getEndpointReference()).basicRemove(otherEnd, msgs);
			case ScaPackage.WEB_SERVICE_BINDING__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScaPackage.WEB_SERVICE_BINDING__ENDPOINT_REFERENCE:
				return getEndpointReference();
			case ScaPackage.WEB_SERVICE_BINDING__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case ScaPackage.WEB_SERVICE_BINDING__WSDL_ELEMENT:
				return getWsdlElement();
			case ScaPackage.WEB_SERVICE_BINDING__WSDL_LOCATION:
				return getWsdlLocation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScaPackage.WEB_SERVICE_BINDING__ENDPOINT_REFERENCE:
				getEndpointReference().clear();
				getEndpointReference().addAll((Collection<? extends EndpointReferenceType>)newValue);
				return;
			case ScaPackage.WEB_SERVICE_BINDING__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case ScaPackage.WEB_SERVICE_BINDING__WSDL_ELEMENT:
				setWsdlElement((String)newValue);
				return;
			case ScaPackage.WEB_SERVICE_BINDING__WSDL_LOCATION:
				setWsdlLocation((List<String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ScaPackage.WEB_SERVICE_BINDING__ENDPOINT_REFERENCE:
				getEndpointReference().clear();
				return;
			case ScaPackage.WEB_SERVICE_BINDING__ANY:
				getAny().clear();
				return;
			case ScaPackage.WEB_SERVICE_BINDING__WSDL_ELEMENT:
				setWsdlElement(WSDL_ELEMENT_EDEFAULT);
				return;
			case ScaPackage.WEB_SERVICE_BINDING__WSDL_LOCATION:
				setWsdlLocation(WSDL_LOCATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ScaPackage.WEB_SERVICE_BINDING__ENDPOINT_REFERENCE:
				return endpointReference != null && !endpointReference.isEmpty();
			case ScaPackage.WEB_SERVICE_BINDING__ANY:
				return any != null && !any.isEmpty();
			case ScaPackage.WEB_SERVICE_BINDING__WSDL_ELEMENT:
				return WSDL_ELEMENT_EDEFAULT == null ? wsdlElement != null : !WSDL_ELEMENT_EDEFAULT.equals(wsdlElement);
			case ScaPackage.WEB_SERVICE_BINDING__WSDL_LOCATION:
				return WSDL_LOCATION_EDEFAULT == null ? wsdlLocation != null : !WSDL_LOCATION_EDEFAULT.equals(wsdlLocation);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (any: ");
		result.append(any);
		result.append(", wsdlElement: ");
		result.append(wsdlElement);
		result.append(", wsdlLocation: ");
		result.append(wsdlLocation);
		result.append(')');
		return result.toString();
	}

} //WebServiceBindingImpl
