/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.spring.CamelProxyFactoryDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Proxy Factory Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelProxyFactoryDefinitionImpl#getCamelContextId <em>Camel Context Id</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelProxyFactoryDefinitionImpl#getServiceInterface <em>Service Interface</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelProxyFactoryDefinitionImpl#getServiceRef <em>Service Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.CamelProxyFactoryDefinitionImpl#getServiceUrl <em>Service Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelProxyFactoryDefinitionImpl extends IdentifiedTypeImpl implements CamelProxyFactoryDefinition {
	/**
	 * The default value of the '{@link #getCamelContextId() <em>Camel Context Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCamelContextId()
	 * @generated
	 * @ordered
	 */
	protected static final String CAMEL_CONTEXT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCamelContextId() <em>Camel Context Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCamelContextId()
	 * @generated
	 * @ordered
	 */
	protected String camelContextId = CAMEL_CONTEXT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceInterface() <em>Service Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInterface()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_INTERFACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceInterface() <em>Service Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInterface()
	 * @generated
	 * @ordered
	 */
	protected String serviceInterface = SERVICE_INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceRef() <em>Service Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceRef()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceRef() <em>Service Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceRef()
	 * @generated
	 * @ordered
	 */
	protected String serviceRef = SERVICE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceUrl() <em>Service Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceUrl() <em>Service Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceUrl()
	 * @generated
	 * @ordered
	 */
	protected String serviceUrl = SERVICE_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CamelProxyFactoryDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.eINSTANCE.getCamelProxyFactoryDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCamelContextId() {
		return camelContextId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCamelContextId(String newCamelContextId) {
		String oldCamelContextId = camelContextId;
		camelContextId = newCamelContextId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_PROXY_FACTORY_DEFINITION__CAMEL_CONTEXT_ID, oldCamelContextId, camelContextId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceInterface() {
		return serviceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceInterface(String newServiceInterface) {
		String oldServiceInterface = serviceInterface;
		serviceInterface = newServiceInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_PROXY_FACTORY_DEFINITION__SERVICE_INTERFACE, oldServiceInterface, serviceInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceRef() {
		return serviceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceRef(String newServiceRef) {
		String oldServiceRef = serviceRef;
		serviceRef = newServiceRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_PROXY_FACTORY_DEFINITION__SERVICE_REF, oldServiceRef, serviceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceUrl() {
		return serviceUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceUrl(String newServiceUrl) {
		String oldServiceUrl = serviceUrl;
		serviceUrl = newServiceUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CAMEL_PROXY_FACTORY_DEFINITION__SERVICE_URL, oldServiceUrl, serviceUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpringPackage.CAMEL_PROXY_FACTORY_DEFINITION__CAMEL_CONTEXT_ID:
				return getCamelContextId();
			case SpringPackage.CAMEL_PROXY_FACTORY_DEFINITION__SERVICE_INTERFACE:
				return getServiceInterface();
			case SpringPackage.CAMEL_PROXY_FACTORY_DEFINITION__SERVICE_REF:
				return getServiceRef();
			case SpringPackage.CAMEL_PROXY_FACTORY_DEFINITION__SERVICE_URL:
				return getServiceUrl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpringPackage.CAMEL_PROXY_FACTORY_DEFINITION__CAMEL_CONTEXT_ID:
				setCamelContextId((String)newValue);
				return;
			case SpringPackage.CAMEL_PROXY_FACTORY_DEFINITION__SERVICE_INTERFACE:
				setServiceInterface((String)newValue);
				return;
			case SpringPackage.CAMEL_PROXY_FACTORY_DEFINITION__SERVICE_REF:
				setServiceRef((String)newValue);
				return;
			case SpringPackage.CAMEL_PROXY_FACTORY_DEFINITION__SERVICE_URL:
				setServiceUrl((String)newValue);
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
			case SpringPackage.CAMEL_PROXY_FACTORY_DEFINITION__CAMEL_CONTEXT_ID:
				setCamelContextId(CAMEL_CONTEXT_ID_EDEFAULT);
				return;
			case SpringPackage.CAMEL_PROXY_FACTORY_DEFINITION__SERVICE_INTERFACE:
				setServiceInterface(SERVICE_INTERFACE_EDEFAULT);
				return;
			case SpringPackage.CAMEL_PROXY_FACTORY_DEFINITION__SERVICE_REF:
				setServiceRef(SERVICE_REF_EDEFAULT);
				return;
			case SpringPackage.CAMEL_PROXY_FACTORY_DEFINITION__SERVICE_URL:
				setServiceUrl(SERVICE_URL_EDEFAULT);
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
			case SpringPackage.CAMEL_PROXY_FACTORY_DEFINITION__CAMEL_CONTEXT_ID:
				return CAMEL_CONTEXT_ID_EDEFAULT == null ? camelContextId != null : !CAMEL_CONTEXT_ID_EDEFAULT.equals(camelContextId);
			case SpringPackage.CAMEL_PROXY_FACTORY_DEFINITION__SERVICE_INTERFACE:
				return SERVICE_INTERFACE_EDEFAULT == null ? serviceInterface != null : !SERVICE_INTERFACE_EDEFAULT.equals(serviceInterface);
			case SpringPackage.CAMEL_PROXY_FACTORY_DEFINITION__SERVICE_REF:
				return SERVICE_REF_EDEFAULT == null ? serviceRef != null : !SERVICE_REF_EDEFAULT.equals(serviceRef);
			case SpringPackage.CAMEL_PROXY_FACTORY_DEFINITION__SERVICE_URL:
				return SERVICE_URL_EDEFAULT == null ? serviceUrl != null : !SERVICE_URL_EDEFAULT.equals(serviceUrl);
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
		result.append(" (camelContextId: ");
		result.append(camelContextId);
		result.append(", serviceInterface: ");
		result.append(serviceInterface);
		result.append(", serviceRef: ");
		result.append(serviceRef);
		result.append(", serviceUrl: ");
		result.append(serviceUrl);
		result.append(')');
		return result.toString();
	}

} //CamelProxyFactoryDefinitionImpl
