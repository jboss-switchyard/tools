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

import org.switchyard.tools.models.switchyard1_0.spring.BeanDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bean Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.BeanDefinitionImpl#getBeanType <em>Bean Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.BeanDefinitionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.BeanDefinitionImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.BeanDefinitionImpl#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BeanDefinitionImpl extends NoOutputDefinitionImpl implements BeanDefinition {
	/**
	 * The default value of the '{@link #getBeanType() <em>Bean Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeanType()
	 * @generated
	 * @ordered
	 */
	protected static final String BEAN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeanType() <em>Bean Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeanType()
	 * @generated
	 * @ordered
	 */
	protected String beanType = BEAN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected String method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected String ref = REF_EDEFAULT;

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
	protected BeanDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.eINSTANCE.getBeanDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeanType() {
		return beanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeanType(String newBeanType) {
		String oldBeanType = beanType;
		beanType = newBeanType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BEAN_DEFINITION__BEAN_TYPE, oldBeanType, beanType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(String newMethod) {
		String oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BEAN_DEFINITION__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(String newRef) {
		String oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.BEAN_DEFINITION__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute2() {
		if (anyAttribute2 == null) {
			anyAttribute2 = new BasicFeatureMap(this, SpringPackage.BEAN_DEFINITION__ANY_ATTRIBUTE2);
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
			case SpringPackage.BEAN_DEFINITION__ANY_ATTRIBUTE2:
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
			case SpringPackage.BEAN_DEFINITION__BEAN_TYPE:
				return getBeanType();
			case SpringPackage.BEAN_DEFINITION__METHOD:
				return getMethod();
			case SpringPackage.BEAN_DEFINITION__REF:
				return getRef();
			case SpringPackage.BEAN_DEFINITION__ANY_ATTRIBUTE2:
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
			case SpringPackage.BEAN_DEFINITION__BEAN_TYPE:
				setBeanType((String)newValue);
				return;
			case SpringPackage.BEAN_DEFINITION__METHOD:
				setMethod((String)newValue);
				return;
			case SpringPackage.BEAN_DEFINITION__REF:
				setRef((String)newValue);
				return;
			case SpringPackage.BEAN_DEFINITION__ANY_ATTRIBUTE2:
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
			case SpringPackage.BEAN_DEFINITION__BEAN_TYPE:
				setBeanType(BEAN_TYPE_EDEFAULT);
				return;
			case SpringPackage.BEAN_DEFINITION__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case SpringPackage.BEAN_DEFINITION__REF:
				setRef(REF_EDEFAULT);
				return;
			case SpringPackage.BEAN_DEFINITION__ANY_ATTRIBUTE2:
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
			case SpringPackage.BEAN_DEFINITION__BEAN_TYPE:
				return BEAN_TYPE_EDEFAULT == null ? beanType != null : !BEAN_TYPE_EDEFAULT.equals(beanType);
			case SpringPackage.BEAN_DEFINITION__METHOD:
				return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
			case SpringPackage.BEAN_DEFINITION__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
			case SpringPackage.BEAN_DEFINITION__ANY_ATTRIBUTE2:
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
		result.append(" (beanType: ");
		result.append(beanType);
		result.append(", method: ");
		result.append(method);
		result.append(", ref: ");
		result.append(ref);
		result.append(", anyAttribute2: ");
		result.append(anyAttribute2);
		result.append(')');
		return result.toString();
	}

} //BeanDefinitionImpl
