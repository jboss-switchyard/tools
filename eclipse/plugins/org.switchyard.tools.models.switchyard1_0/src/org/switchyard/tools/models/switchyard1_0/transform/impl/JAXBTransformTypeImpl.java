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
import org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.TransformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JAXB Transform Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.impl.JAXBTransformTypeImpl#getContextPath <em>Context Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JAXBTransformTypeImpl extends TransformTypeImpl implements JAXBTransformType {
	/**
     * The default value of the '{@link #getContextPath() <em>Context Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextPath()
     * @generated
     * @ordered
     */
    protected static final String CONTEXT_PATH_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getContextPath() <em>Context Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextPath()
     * @generated
     * @ordered
     */
    protected String contextPath = CONTEXT_PATH_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected JAXBTransformTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return TransformPackage.Literals.JAXB_TRANSFORM_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getContextPath() {
        return contextPath;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextPath(String newContextPath) {
        String oldContextPath = contextPath;
        contextPath = newContextPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformPackage.JAXB_TRANSFORM_TYPE__CONTEXT_PATH, oldContextPath, contextPath));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TransformPackage.JAXB_TRANSFORM_TYPE__CONTEXT_PATH:
                return getContextPath();
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
            case TransformPackage.JAXB_TRANSFORM_TYPE__CONTEXT_PATH:
                setContextPath((String)newValue);
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
            case TransformPackage.JAXB_TRANSFORM_TYPE__CONTEXT_PATH:
                setContextPath(CONTEXT_PATH_EDEFAULT);
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
            case TransformPackage.JAXB_TRANSFORM_TYPE__CONTEXT_PATH:
                return CONTEXT_PATH_EDEFAULT == null ? contextPath != null : !CONTEXT_PATH_EDEFAULT.equals(contextPath);
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
        result.append(" (contextPath: ");
        result.append(contextPath);
        result.append(')');
        return result.toString();
    }

} //JAXBTransformTypeImpl
