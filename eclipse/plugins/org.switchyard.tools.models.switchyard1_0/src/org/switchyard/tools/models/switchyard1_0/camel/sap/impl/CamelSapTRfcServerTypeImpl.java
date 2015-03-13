/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.sap.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcServerType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Sap TRfc Server Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapTRfcServerTypeImpl#getServerName <em>Server Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapTRfcServerTypeImpl#getRfcName <em>Rfc Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelSapTRfcServerTypeImpl extends EObjectImpl implements CamelSapTRfcServerType {
    /**
     * The default value of the '{@link #getServerName() <em>Server Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServerName()
     * @generated
     * @ordered
     */
    protected static final String SERVER_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getServerName() <em>Server Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServerName()
     * @generated
     * @ordered
     */
    protected String serverName = SERVER_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getRfcName() <em>Rfc Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRfcName()
     * @generated
     * @ordered
     */
    protected static final String RFC_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRfcName() <em>Rfc Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRfcName()
     * @generated
     * @ordered
     */
    protected String rfcName = RFC_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelSapTRfcServerTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SapPackage.Literals.CAMEL_SAP_TRFC_SERVER_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setServerName(String newServerName) {
        String oldServerName = serverName;
        serverName = newServerName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_TRFC_SERVER_TYPE__SERVER_NAME, oldServerName, serverName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRfcName() {
        return rfcName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRfcName(String newRfcName) {
        String oldRfcName = rfcName;
        rfcName = newRfcName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_TRFC_SERVER_TYPE__RFC_NAME, oldRfcName, rfcName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SapPackage.CAMEL_SAP_TRFC_SERVER_TYPE__SERVER_NAME:
                return getServerName();
            case SapPackage.CAMEL_SAP_TRFC_SERVER_TYPE__RFC_NAME:
                return getRfcName();
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
            case SapPackage.CAMEL_SAP_TRFC_SERVER_TYPE__SERVER_NAME:
                setServerName((String)newValue);
                return;
            case SapPackage.CAMEL_SAP_TRFC_SERVER_TYPE__RFC_NAME:
                setRfcName((String)newValue);
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
            case SapPackage.CAMEL_SAP_TRFC_SERVER_TYPE__SERVER_NAME:
                setServerName(SERVER_NAME_EDEFAULT);
                return;
            case SapPackage.CAMEL_SAP_TRFC_SERVER_TYPE__RFC_NAME:
                setRfcName(RFC_NAME_EDEFAULT);
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
            case SapPackage.CAMEL_SAP_TRFC_SERVER_TYPE__SERVER_NAME:
                return SERVER_NAME_EDEFAULT == null ? serverName != null : !SERVER_NAME_EDEFAULT.equals(serverName);
            case SapPackage.CAMEL_SAP_TRFC_SERVER_TYPE__RFC_NAME:
                return RFC_NAME_EDEFAULT == null ? rfcName != null : !RFC_NAME_EDEFAULT.equals(rfcName);
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
        result.append(" (serverName: ");
        result.append(serverName);
        result.append(", rfcName: ");
        result.append(rfcName);
        result.append(')');
        return result.toString();
    }

} //CamelSapTRfcServerTypeImpl
