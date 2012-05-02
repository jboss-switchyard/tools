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

import org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelFactoryBean;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Camel Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractCamelFactoryBeanImpl#getCamelContextId <em>Camel Context Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractCamelFactoryBeanImpl extends IdentifiedTypeImpl implements AbstractCamelFactoryBean {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCamelFactoryBeanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.eINSTANCE.getAbstractCamelFactoryBean();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_CAMEL_FACTORY_BEAN__CAMEL_CONTEXT_ID, oldCamelContextId, camelContextId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpringPackage.ABSTRACT_CAMEL_FACTORY_BEAN__CAMEL_CONTEXT_ID:
				return getCamelContextId();
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
			case SpringPackage.ABSTRACT_CAMEL_FACTORY_BEAN__CAMEL_CONTEXT_ID:
				setCamelContextId((String)newValue);
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
			case SpringPackage.ABSTRACT_CAMEL_FACTORY_BEAN__CAMEL_CONTEXT_ID:
				setCamelContextId(CAMEL_CONTEXT_ID_EDEFAULT);
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
			case SpringPackage.ABSTRACT_CAMEL_FACTORY_BEAN__CAMEL_CONTEXT_ID:
				return CAMEL_CONTEXT_ID_EDEFAULT == null ? camelContextId != null : !CAMEL_CONTEXT_ID_EDEFAULT.equals(camelContextId);
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
		result.append(')');
		return result.toString();
	}

} //AbstractCamelFactoryBeanImpl
