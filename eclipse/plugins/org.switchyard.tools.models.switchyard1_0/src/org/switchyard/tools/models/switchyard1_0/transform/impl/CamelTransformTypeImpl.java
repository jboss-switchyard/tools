/**
 */
package org.switchyard.tools.models.switchyard1_0.transform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.switchyard.impl.TransformTypeImpl;

import org.switchyard.tools.models.switchyard1_0.transform.CamelTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.TransformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Transform Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.impl.CamelTransformTypeImpl#getEndpointUri <em>Endpoint Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CamelTransformTypeImpl extends TransformTypeImpl implements CamelTransformType {
    /**
     * The default value of the '{@link #getEndpointUri() <em>Endpoint Uri</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndpointUri()
     * @generated
     * @ordered
     */
    protected static final String ENDPOINT_URI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEndpointUri() <em>Endpoint Uri</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndpointUri()
     * @generated
     * @ordered
     */
    protected String endpointUri = ENDPOINT_URI_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelTransformTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TransformPackage.Literals.CAMEL_TRANSFORM_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEndpointUri() {
        return endpointUri;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEndpointUri(String newEndpointUri) {
        String oldEndpointUri = endpointUri;
        endpointUri = newEndpointUri;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformPackage.CAMEL_TRANSFORM_TYPE__ENDPOINT_URI, oldEndpointUri, endpointUri));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TransformPackage.CAMEL_TRANSFORM_TYPE__ENDPOINT_URI:
                return getEndpointUri();
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
            case TransformPackage.CAMEL_TRANSFORM_TYPE__ENDPOINT_URI:
                setEndpointUri((String)newValue);
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
            case TransformPackage.CAMEL_TRANSFORM_TYPE__ENDPOINT_URI:
                setEndpointUri(ENDPOINT_URI_EDEFAULT);
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
            case TransformPackage.CAMEL_TRANSFORM_TYPE__ENDPOINT_URI:
                return ENDPOINT_URI_EDEFAULT == null ? endpointUri != null : !ENDPOINT_URI_EDEFAULT.equals(endpointUri);
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
        result.append(" (endpointUri: ");
        result.append(endpointUri);
        result.append(')');
        return result.toString();
    }

} //CamelTransformTypeImpl
