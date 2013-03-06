/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.transform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;


import org.switchyard.tools.models.switchyard1_0.switchyard.impl.TransformTypeImpl;
import org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType1;
import org.switchyard.tools.models.switchyard1_0.transform.TransformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Transform Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.impl.JavaTransformType1Impl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.impl.JavaTransformType1Impl#getBean <em>Bean</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaTransformType1Impl extends TransformTypeImpl implements JavaTransformType1 {
	/**
     * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getClass_()
     * @generated
     * @ordered
     */
	protected static final String CLASS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getClass_()
     * @generated
     * @ordered
     */
	protected String class_ = CLASS_EDEFAULT;

	/**
     * The default value of the '{@link #getBean() <em>Bean</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBean()
     * @generated
     * @ordered
     */
    protected static final String BEAN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBean() <em>Bean</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBean()
     * @generated
     * @ordered
     */
    protected String bean = BEAN_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected JavaTransformType1Impl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return TransformPackage.Literals.JAVA_TRANSFORM_TYPE1;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getClass_() {
        return class_;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setClass(String newClass) {
        String oldClass = class_;
        class_ = newClass;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformPackage.JAVA_TRANSFORM_TYPE1__CLASS, oldClass, class_));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBean() {
        return bean;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBean(String newBean) {
        String oldBean = bean;
        bean = newBean;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformPackage.JAVA_TRANSFORM_TYPE1__BEAN, oldBean, bean));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TransformPackage.JAVA_TRANSFORM_TYPE1__CLASS:
                return getClass_();
            case TransformPackage.JAVA_TRANSFORM_TYPE1__BEAN:
                return getBean();
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
            case TransformPackage.JAVA_TRANSFORM_TYPE1__CLASS:
                setClass((String)newValue);
                return;
            case TransformPackage.JAVA_TRANSFORM_TYPE1__BEAN:
                setBean((String)newValue);
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
            case TransformPackage.JAVA_TRANSFORM_TYPE1__CLASS:
                setClass(CLASS_EDEFAULT);
                return;
            case TransformPackage.JAVA_TRANSFORM_TYPE1__BEAN:
                setBean(BEAN_EDEFAULT);
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
            case TransformPackage.JAVA_TRANSFORM_TYPE1__CLASS:
                return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
            case TransformPackage.JAVA_TRANSFORM_TYPE1__BEAN:
                return BEAN_EDEFAULT == null ? bean != null : !BEAN_EDEFAULT.equals(bean);
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
        result.append(" (class: ");
        result.append(class_);
        result.append(", bean: ");
        result.append(bean);
        result.append(')');
        return result.toString();
    }

} //JavaTransformType1Impl
