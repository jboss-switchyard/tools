/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.sap.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcDestinationType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Sap SRfc Destination Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapSRfcDestinationTypeImpl#getDestinationName <em>Destination Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapSRfcDestinationTypeImpl#getRfcName <em>Rfc Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapSRfcDestinationTypeImpl#getTransacted <em>Transacted</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelSapSRfcDestinationTypeImpl extends EObjectImpl implements CamelSapSRfcDestinationType {
    /**
     * The default value of the '{@link #getDestinationName() <em>Destination Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDestinationName()
     * @generated
     * @ordered
     */
    protected static final String DESTINATION_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDestinationName() <em>Destination Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDestinationName()
     * @generated
     * @ordered
     */
    protected String destinationName = DESTINATION_NAME_EDEFAULT;

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
     * The default value of the '{@link #getTransacted() <em>Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransacted()
     * @generated
     * @ordered
     */
    protected static final Object TRANSACTED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTransacted() <em>Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransacted()
     * @generated
     * @ordered
     */
    protected Object transacted = TRANSACTED_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelSapSRfcDestinationTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SapPackage.Literals.CAMEL_SAP_SRFC_DESTINATION_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDestinationName() {
        return destinationName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDestinationName(String newDestinationName) {
        String oldDestinationName = destinationName;
        destinationName = newDestinationName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_SRFC_DESTINATION_TYPE__DESTINATION_NAME, oldDestinationName, destinationName));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_SRFC_DESTINATION_TYPE__RFC_NAME, oldRfcName, rfcName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getTransacted() {
        return transacted;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTransacted(Object newTransacted) {
        Object oldTransacted = transacted;
        transacted = newTransacted;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_SRFC_DESTINATION_TYPE__TRANSACTED, oldTransacted, transacted));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SapPackage.CAMEL_SAP_SRFC_DESTINATION_TYPE__DESTINATION_NAME:
                return getDestinationName();
            case SapPackage.CAMEL_SAP_SRFC_DESTINATION_TYPE__RFC_NAME:
                return getRfcName();
            case SapPackage.CAMEL_SAP_SRFC_DESTINATION_TYPE__TRANSACTED:
                return getTransacted();
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
            case SapPackage.CAMEL_SAP_SRFC_DESTINATION_TYPE__DESTINATION_NAME:
                setDestinationName((String)newValue);
                return;
            case SapPackage.CAMEL_SAP_SRFC_DESTINATION_TYPE__RFC_NAME:
                setRfcName((String)newValue);
                return;
            case SapPackage.CAMEL_SAP_SRFC_DESTINATION_TYPE__TRANSACTED:
                setTransacted(newValue);
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
            case SapPackage.CAMEL_SAP_SRFC_DESTINATION_TYPE__DESTINATION_NAME:
                setDestinationName(DESTINATION_NAME_EDEFAULT);
                return;
            case SapPackage.CAMEL_SAP_SRFC_DESTINATION_TYPE__RFC_NAME:
                setRfcName(RFC_NAME_EDEFAULT);
                return;
            case SapPackage.CAMEL_SAP_SRFC_DESTINATION_TYPE__TRANSACTED:
                setTransacted(TRANSACTED_EDEFAULT);
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
            case SapPackage.CAMEL_SAP_SRFC_DESTINATION_TYPE__DESTINATION_NAME:
                return DESTINATION_NAME_EDEFAULT == null ? destinationName != null : !DESTINATION_NAME_EDEFAULT.equals(destinationName);
            case SapPackage.CAMEL_SAP_SRFC_DESTINATION_TYPE__RFC_NAME:
                return RFC_NAME_EDEFAULT == null ? rfcName != null : !RFC_NAME_EDEFAULT.equals(rfcName);
            case SapPackage.CAMEL_SAP_SRFC_DESTINATION_TYPE__TRANSACTED:
                return TRANSACTED_EDEFAULT == null ? transacted != null : !TRANSACTED_EDEFAULT.equals(transacted);
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
        result.append(" (destinationName: ");
        result.append(destinationName);
        result.append(", rfcName: ");
        result.append(rfcName);
        result.append(", transacted: ");
        result.append(transacted);
        result.append(')');
        return result.toString();
    }

} //CamelSapSRfcDestinationTypeImpl
