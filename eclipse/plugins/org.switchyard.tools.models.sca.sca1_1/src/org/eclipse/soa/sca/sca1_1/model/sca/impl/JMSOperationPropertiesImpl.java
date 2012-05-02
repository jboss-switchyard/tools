/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.BindingProperty;
import org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders;
import org.eclipse.soa.sca.sca1_1.model.sca.JMSOperationProperties;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JMS Operation Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSOperationPropertiesImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSOperationPropertiesImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSOperationPropertiesImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSOperationPropertiesImpl#getNativeOperation <em>Native Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JMSOperationPropertiesImpl extends EObjectImpl implements JMSOperationProperties {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingProperty> property;

	/**
	 * The cached value of the '{@link #getHeaders() <em>Headers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected JMSHeaders headers;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNativeOperation() <em>Native Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNativeOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String NATIVE_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNativeOperation() <em>Native Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNativeOperation()
	 * @generated
	 * @ordered
	 */
	protected String nativeOperation = NATIVE_OPERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JMSOperationPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScaPackage.eINSTANCE.getJMSOperationProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindingProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<BindingProperty>(BindingProperty.class, this, ScaPackage.JMS_OPERATION_PROPERTIES__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JMSHeaders getHeaders() {
		return headers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeaders(JMSHeaders newHeaders, NotificationChain msgs) {
		JMSHeaders oldHeaders = headers;
		headers = newHeaders;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_OPERATION_PROPERTIES__HEADERS, oldHeaders, newHeaders);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaders(JMSHeaders newHeaders) {
		if (newHeaders != headers) {
			NotificationChain msgs = null;
			if (headers != null)
				msgs = ((InternalEObject)headers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JMS_OPERATION_PROPERTIES__HEADERS, null, msgs);
			if (newHeaders != null)
				msgs = ((InternalEObject)newHeaders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JMS_OPERATION_PROPERTIES__HEADERS, null, msgs);
			msgs = basicSetHeaders(newHeaders, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_OPERATION_PROPERTIES__HEADERS, newHeaders, newHeaders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_OPERATION_PROPERTIES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNativeOperation() {
		return nativeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNativeOperation(String newNativeOperation) {
		String oldNativeOperation = nativeOperation;
		nativeOperation = newNativeOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_OPERATION_PROPERTIES__NATIVE_OPERATION, oldNativeOperation, nativeOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScaPackage.JMS_OPERATION_PROPERTIES__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case ScaPackage.JMS_OPERATION_PROPERTIES__HEADERS:
				return basicSetHeaders(null, msgs);
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
			case ScaPackage.JMS_OPERATION_PROPERTIES__PROPERTY:
				return getProperty();
			case ScaPackage.JMS_OPERATION_PROPERTIES__HEADERS:
				return getHeaders();
			case ScaPackage.JMS_OPERATION_PROPERTIES__NAME:
				return getName();
			case ScaPackage.JMS_OPERATION_PROPERTIES__NATIVE_OPERATION:
				return getNativeOperation();
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
			case ScaPackage.JMS_OPERATION_PROPERTIES__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends BindingProperty>)newValue);
				return;
			case ScaPackage.JMS_OPERATION_PROPERTIES__HEADERS:
				setHeaders((JMSHeaders)newValue);
				return;
			case ScaPackage.JMS_OPERATION_PROPERTIES__NAME:
				setName((String)newValue);
				return;
			case ScaPackage.JMS_OPERATION_PROPERTIES__NATIVE_OPERATION:
				setNativeOperation((String)newValue);
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
			case ScaPackage.JMS_OPERATION_PROPERTIES__PROPERTY:
				getProperty().clear();
				return;
			case ScaPackage.JMS_OPERATION_PROPERTIES__HEADERS:
				setHeaders((JMSHeaders)null);
				return;
			case ScaPackage.JMS_OPERATION_PROPERTIES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ScaPackage.JMS_OPERATION_PROPERTIES__NATIVE_OPERATION:
				setNativeOperation(NATIVE_OPERATION_EDEFAULT);
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
			case ScaPackage.JMS_OPERATION_PROPERTIES__PROPERTY:
				return property != null && !property.isEmpty();
			case ScaPackage.JMS_OPERATION_PROPERTIES__HEADERS:
				return headers != null;
			case ScaPackage.JMS_OPERATION_PROPERTIES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ScaPackage.JMS_OPERATION_PROPERTIES__NATIVE_OPERATION:
				return NATIVE_OPERATION_EDEFAULT == null ? nativeOperation != null : !NATIVE_OPERATION_EDEFAULT.equals(nativeOperation);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", nativeOperation: ");
		result.append(nativeOperation);
		result.append(')');
		return result.toString();
	}

} //JMSOperationPropertiesImpl
