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

import org.switchyard.tools.models.switchyard1_0.spring.MethodCallExpression;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Call Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MethodCallExpressionImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MethodCallExpressionImpl#getBeanType <em>Bean Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MethodCallExpressionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.MethodCallExpressionImpl#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodCallExpressionImpl extends ExpressionImpl implements MethodCallExpression {
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
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected MethodCallExpressionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getMethodCallExpression();
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
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.METHOD_CALL_EXPRESSION__BEAN, oldBean, bean));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.METHOD_CALL_EXPRESSION__BEAN_TYPE, oldBeanType, beanType));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.METHOD_CALL_EXPRESSION__METHOD, oldMethod, method));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.METHOD_CALL_EXPRESSION__REF, oldRef, ref));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.METHOD_CALL_EXPRESSION__BEAN:
                return getBean();
            case SpringPackage.METHOD_CALL_EXPRESSION__BEAN_TYPE:
                return getBeanType();
            case SpringPackage.METHOD_CALL_EXPRESSION__METHOD:
                return getMethod();
            case SpringPackage.METHOD_CALL_EXPRESSION__REF:
                return getRef();
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
            case SpringPackage.METHOD_CALL_EXPRESSION__BEAN:
                setBean((String)newValue);
                return;
            case SpringPackage.METHOD_CALL_EXPRESSION__BEAN_TYPE:
                setBeanType((String)newValue);
                return;
            case SpringPackage.METHOD_CALL_EXPRESSION__METHOD:
                setMethod((String)newValue);
                return;
            case SpringPackage.METHOD_CALL_EXPRESSION__REF:
                setRef((String)newValue);
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
            case SpringPackage.METHOD_CALL_EXPRESSION__BEAN:
                setBean(BEAN_EDEFAULT);
                return;
            case SpringPackage.METHOD_CALL_EXPRESSION__BEAN_TYPE:
                setBeanType(BEAN_TYPE_EDEFAULT);
                return;
            case SpringPackage.METHOD_CALL_EXPRESSION__METHOD:
                setMethod(METHOD_EDEFAULT);
                return;
            case SpringPackage.METHOD_CALL_EXPRESSION__REF:
                setRef(REF_EDEFAULT);
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
            case SpringPackage.METHOD_CALL_EXPRESSION__BEAN:
                return BEAN_EDEFAULT == null ? bean != null : !BEAN_EDEFAULT.equals(bean);
            case SpringPackage.METHOD_CALL_EXPRESSION__BEAN_TYPE:
                return BEAN_TYPE_EDEFAULT == null ? beanType != null : !BEAN_TYPE_EDEFAULT.equals(beanType);
            case SpringPackage.METHOD_CALL_EXPRESSION__METHOD:
                return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
            case SpringPackage.METHOD_CALL_EXPRESSION__REF:
                return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
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
        result.append(" (bean: ");
        result.append(bean);
        result.append(", beanType: ");
        result.append(beanType);
        result.append(", method: ");
        result.append(method);
        result.append(", ref: ");
        result.append(ref);
        result.append(')');
        return result.toString();
    }

} //MethodCallExpressionImpl
