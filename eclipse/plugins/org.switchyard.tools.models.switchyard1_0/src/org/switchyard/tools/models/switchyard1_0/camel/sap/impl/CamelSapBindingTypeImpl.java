/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.sap.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Sap Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapBindingTypeImpl#getServer <em>Server</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapBindingTypeImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapBindingTypeImpl#getRfcName <em>Rfc Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapBindingTypeImpl#isTransacted <em>Transacted</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelSapBindingTypeImpl extends BaseCamelBindingImpl implements CamelSapBindingType {
    /**
     * The default value of the '{@link #getServer() <em>Server</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServer()
     * @generated
     * @ordered
     */
    protected static final String SERVER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getServer() <em>Server</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServer()
     * @generated
     * @ordered
     */
    protected String server = SERVER_EDEFAULT;

    /**
     * The default value of the '{@link #getDestination() <em>Destination</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDestination()
     * @generated
     * @ordered
     */
    protected static final String DESTINATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDestination()
     * @generated
     * @ordered
     */
    protected String destination = DESTINATION_EDEFAULT;

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
     * The default value of the '{@link #isTransacted() <em>Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTransacted()
     * @generated
     * @ordered
     */
    protected static final boolean TRANSACTED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isTransacted() <em>Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTransacted()
     * @generated
     * @ordered
     */
    protected boolean transacted = TRANSACTED_EDEFAULT;

    /**
     * This is true if the Transacted attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean transactedESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelSapBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SapPackage.Literals.CAMEL_SAP_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getServer() {
        return server;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setServer(String newServer) {
        String oldServer = server;
        server = newServer;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_BINDING_TYPE__SERVER, oldServer, server));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDestination() {
        return destination;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDestination(String newDestination) {
        String oldDestination = destination;
        destination = newDestination;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_BINDING_TYPE__DESTINATION, oldDestination, destination));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_BINDING_TYPE__RFC_NAME, oldRfcName, rfcName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isTransacted() {
        return transacted;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTransacted(boolean newTransacted) {
        boolean oldTransacted = transacted;
        transacted = newTransacted;
        boolean oldTransactedESet = transactedESet;
        transactedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_BINDING_TYPE__TRANSACTED, oldTransacted, transacted, !oldTransactedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTransacted() {
        boolean oldTransacted = transacted;
        boolean oldTransactedESet = transactedESet;
        transacted = TRANSACTED_EDEFAULT;
        transactedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SapPackage.CAMEL_SAP_BINDING_TYPE__TRANSACTED, oldTransacted, TRANSACTED_EDEFAULT, oldTransactedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTransacted() {
        return transactedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SapPackage.CAMEL_SAP_BINDING_TYPE__SERVER:
                return getServer();
            case SapPackage.CAMEL_SAP_BINDING_TYPE__DESTINATION:
                return getDestination();
            case SapPackage.CAMEL_SAP_BINDING_TYPE__RFC_NAME:
                return getRfcName();
            case SapPackage.CAMEL_SAP_BINDING_TYPE__TRANSACTED:
                return isTransacted();
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
            case SapPackage.CAMEL_SAP_BINDING_TYPE__SERVER:
                setServer((String)newValue);
                return;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__DESTINATION:
                setDestination((String)newValue);
                return;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__RFC_NAME:
                setRfcName((String)newValue);
                return;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__TRANSACTED:
                setTransacted((Boolean)newValue);
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
            case SapPackage.CAMEL_SAP_BINDING_TYPE__SERVER:
                setServer(SERVER_EDEFAULT);
                return;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__DESTINATION:
                setDestination(DESTINATION_EDEFAULT);
                return;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__RFC_NAME:
                setRfcName(RFC_NAME_EDEFAULT);
                return;
            case SapPackage.CAMEL_SAP_BINDING_TYPE__TRANSACTED:
                unsetTransacted();
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
            case SapPackage.CAMEL_SAP_BINDING_TYPE__SERVER:
                return SERVER_EDEFAULT == null ? server != null : !SERVER_EDEFAULT.equals(server);
            case SapPackage.CAMEL_SAP_BINDING_TYPE__DESTINATION:
                return DESTINATION_EDEFAULT == null ? destination != null : !DESTINATION_EDEFAULT.equals(destination);
            case SapPackage.CAMEL_SAP_BINDING_TYPE__RFC_NAME:
                return RFC_NAME_EDEFAULT == null ? rfcName != null : !RFC_NAME_EDEFAULT.equals(rfcName);
            case SapPackage.CAMEL_SAP_BINDING_TYPE__TRANSACTED:
                return isSetTransacted();
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
        result.append(" (server: ");
        result.append(server);
        result.append(", destination: ");
        result.append(destination);
        result.append(", rfcName: ");
        result.append(rfcName);
        result.append(", transacted: ");
        if (transactedESet) result.append(transacted); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //CamelSapBindingTypeImpl
