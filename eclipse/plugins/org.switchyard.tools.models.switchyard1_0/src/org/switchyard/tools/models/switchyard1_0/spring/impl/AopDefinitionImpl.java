/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.spring.AopDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aop Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AopDefinitionImpl#getAfterFinallyUri <em>After Finally Uri</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AopDefinitionImpl#getAfterUri <em>After Uri</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AopDefinitionImpl#getBeforeUri <em>Before Uri</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AopDefinitionImpl#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AopDefinitionImpl extends OutputImpl implements AopDefinition {
	/**
	 * The default value of the '{@link #getAfterFinallyUri() <em>After Finally Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterFinallyUri()
	 * @generated
	 * @ordered
	 */
	protected static final String AFTER_FINALLY_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAfterFinallyUri() <em>After Finally Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterFinallyUri()
	 * @generated
	 * @ordered
	 */
	protected String afterFinallyUri = AFTER_FINALLY_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getAfterUri() <em>After Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterUri()
	 * @generated
	 * @ordered
	 */
	protected static final String AFTER_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAfterUri() <em>After Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterUri()
	 * @generated
	 * @ordered
	 */
	protected String afterUri = AFTER_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeforeUri() <em>Before Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeUri()
	 * @generated
	 * @ordered
	 */
	protected static final String BEFORE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeforeUri() <em>Before Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeUri()
	 * @generated
	 * @ordered
	 */
	protected String beforeUri = BEFORE_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute2() <em>Any Attribute2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute2()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AopDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.eINSTANCE.getAopDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAfterFinallyUri() {
		return afterFinallyUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterFinallyUri(String newAfterFinallyUri) {
		String oldAfterFinallyUri = afterFinallyUri;
		afterFinallyUri = newAfterFinallyUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.AOP_DEFINITION__AFTER_FINALLY_URI, oldAfterFinallyUri, afterFinallyUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAfterUri() {
		return afterUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterUri(String newAfterUri) {
		String oldAfterUri = afterUri;
		afterUri = newAfterUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.AOP_DEFINITION__AFTER_URI, oldAfterUri, afterUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeUri() {
		return beforeUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeUri(String newBeforeUri) {
		String oldBeforeUri = beforeUri;
		beforeUri = newBeforeUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.AOP_DEFINITION__BEFORE_URI, oldBeforeUri, beforeUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute2() {
		if (anyAttribute2 == null) {
			anyAttribute2 = new BasicFeatureMap(this, SpringPackage.AOP_DEFINITION__ANY_ATTRIBUTE2);
		}
		return anyAttribute2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpringPackage.AOP_DEFINITION__ANY_ATTRIBUTE2:
				return ((InternalEList<?>)getAnyAttribute2()).basicRemove(otherEnd, msgs);
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
			case SpringPackage.AOP_DEFINITION__AFTER_FINALLY_URI:
				return getAfterFinallyUri();
			case SpringPackage.AOP_DEFINITION__AFTER_URI:
				return getAfterUri();
			case SpringPackage.AOP_DEFINITION__BEFORE_URI:
				return getBeforeUri();
			case SpringPackage.AOP_DEFINITION__ANY_ATTRIBUTE2:
				if (coreType) return getAnyAttribute2();
				return ((FeatureMap.Internal)getAnyAttribute2()).getWrapper();
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
			case SpringPackage.AOP_DEFINITION__AFTER_FINALLY_URI:
				setAfterFinallyUri((String)newValue);
				return;
			case SpringPackage.AOP_DEFINITION__AFTER_URI:
				setAfterUri((String)newValue);
				return;
			case SpringPackage.AOP_DEFINITION__BEFORE_URI:
				setBeforeUri((String)newValue);
				return;
			case SpringPackage.AOP_DEFINITION__ANY_ATTRIBUTE2:
				((FeatureMap.Internal)getAnyAttribute2()).set(newValue);
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
			case SpringPackage.AOP_DEFINITION__AFTER_FINALLY_URI:
				setAfterFinallyUri(AFTER_FINALLY_URI_EDEFAULT);
				return;
			case SpringPackage.AOP_DEFINITION__AFTER_URI:
				setAfterUri(AFTER_URI_EDEFAULT);
				return;
			case SpringPackage.AOP_DEFINITION__BEFORE_URI:
				setBeforeUri(BEFORE_URI_EDEFAULT);
				return;
			case SpringPackage.AOP_DEFINITION__ANY_ATTRIBUTE2:
				getAnyAttribute2().clear();
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
			case SpringPackage.AOP_DEFINITION__AFTER_FINALLY_URI:
				return AFTER_FINALLY_URI_EDEFAULT == null ? afterFinallyUri != null : !AFTER_FINALLY_URI_EDEFAULT.equals(afterFinallyUri);
			case SpringPackage.AOP_DEFINITION__AFTER_URI:
				return AFTER_URI_EDEFAULT == null ? afterUri != null : !AFTER_URI_EDEFAULT.equals(afterUri);
			case SpringPackage.AOP_DEFINITION__BEFORE_URI:
				return BEFORE_URI_EDEFAULT == null ? beforeUri != null : !BEFORE_URI_EDEFAULT.equals(beforeUri);
			case SpringPackage.AOP_DEFINITION__ANY_ATTRIBUTE2:
				return anyAttribute2 != null && !anyAttribute2.isEmpty();
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
		result.append(" (afterFinallyUri: ");
		result.append(afterFinallyUri);
		result.append(", afterUri: ");
		result.append(afterUri);
		result.append(", beforeUri: ");
		result.append(beforeUri);
		result.append(", anyAttribute2: ");
		result.append(anyAttribute2);
		result.append(')');
		return result.toString();
	}

} //AopDefinitionImpl
