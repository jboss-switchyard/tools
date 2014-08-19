/**
 */
package org.switchyard.tools.models.switchyard1_0.bpm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.RemoteRestType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote Rest Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.RemoteRestTypeImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.RemoteRestTypeImpl#getUseFormBasedAuth <em>Use Form Based Auth</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoteRestTypeImpl extends RemoteTypeImpl implements RemoteRestType {
    /**
     * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUrl()
     * @generated
     * @ordered
     */
    protected static final String URL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUrl()
     * @generated
     * @ordered
     */
    protected String url = URL_EDEFAULT;

    /**
     * The default value of the '{@link #getUseFormBasedAuth() <em>Use Form Based Auth</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUseFormBasedAuth()
     * @generated
     * @ordered
     */
    protected static final Object USE_FORM_BASED_AUTH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUseFormBasedAuth() <em>Use Form Based Auth</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUseFormBasedAuth()
     * @generated
     * @ordered
     */
    protected Object useFormBasedAuth = USE_FORM_BASED_AUTH_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RemoteRestTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BPMPackage.Literals.REMOTE_REST_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUrl() {
        return url;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUrl(String newUrl) {
        String oldUrl = url;
        url = newUrl;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.REMOTE_REST_TYPE__URL, oldUrl, url));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getUseFormBasedAuth() {
        return useFormBasedAuth;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUseFormBasedAuth(Object newUseFormBasedAuth) {
        Object oldUseFormBasedAuth = useFormBasedAuth;
        useFormBasedAuth = newUseFormBasedAuth;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.REMOTE_REST_TYPE__USE_FORM_BASED_AUTH, oldUseFormBasedAuth, useFormBasedAuth));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BPMPackage.REMOTE_REST_TYPE__URL:
                return getUrl();
            case BPMPackage.REMOTE_REST_TYPE__USE_FORM_BASED_AUTH:
                return getUseFormBasedAuth();
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
            case BPMPackage.REMOTE_REST_TYPE__URL:
                setUrl((String)newValue);
                return;
            case BPMPackage.REMOTE_REST_TYPE__USE_FORM_BASED_AUTH:
                setUseFormBasedAuth(newValue);
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
            case BPMPackage.REMOTE_REST_TYPE__URL:
                setUrl(URL_EDEFAULT);
                return;
            case BPMPackage.REMOTE_REST_TYPE__USE_FORM_BASED_AUTH:
                setUseFormBasedAuth(USE_FORM_BASED_AUTH_EDEFAULT);
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
            case BPMPackage.REMOTE_REST_TYPE__URL:
                return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
            case BPMPackage.REMOTE_REST_TYPE__USE_FORM_BASED_AUTH:
                return USE_FORM_BASED_AUTH_EDEFAULT == null ? useFormBasedAuth != null : !USE_FORM_BASED_AUTH_EDEFAULT.equals(useFormBasedAuth);
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
        result.append(" (url: ");
        result.append(url);
        result.append(", useFormBasedAuth: ");
        result.append(useFormBasedAuth);
        result.append(')');
        return result.toString();
    }

} //RemoteRestTypeImpl
