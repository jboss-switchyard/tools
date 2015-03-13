/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.sap.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Sap IDoc List Destination Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapIDocListDestinationTypeImpl#getDestinationName <em>Destination Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapIDocListDestinationTypeImpl#getIdocType <em>Idoc Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapIDocListDestinationTypeImpl#getIdocTypeExtension <em>Idoc Type Extension</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapIDocListDestinationTypeImpl#getSystemRelease <em>System Release</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapIDocListDestinationTypeImpl#getApplicationRelease <em>Application Release</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelSapIDocListDestinationTypeImpl extends EObjectImpl implements CamelSapIDocListDestinationType {
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
     * The default value of the '{@link #getIdocType() <em>Idoc Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdocType()
     * @generated
     * @ordered
     */
    protected static final String IDOC_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIdocType() <em>Idoc Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdocType()
     * @generated
     * @ordered
     */
    protected String idocType = IDOC_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getIdocTypeExtension() <em>Idoc Type Extension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdocTypeExtension()
     * @generated
     * @ordered
     */
    protected static final String IDOC_TYPE_EXTENSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIdocTypeExtension() <em>Idoc Type Extension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdocTypeExtension()
     * @generated
     * @ordered
     */
    protected String idocTypeExtension = IDOC_TYPE_EXTENSION_EDEFAULT;

    /**
     * The default value of the '{@link #getSystemRelease() <em>System Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSystemRelease()
     * @generated
     * @ordered
     */
    protected static final String SYSTEM_RELEASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSystemRelease() <em>System Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSystemRelease()
     * @generated
     * @ordered
     */
    protected String systemRelease = SYSTEM_RELEASE_EDEFAULT;

    /**
     * The default value of the '{@link #getApplicationRelease() <em>Application Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApplicationRelease()
     * @generated
     * @ordered
     */
    protected static final String APPLICATION_RELEASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getApplicationRelease() <em>Application Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApplicationRelease()
     * @generated
     * @ordered
     */
    protected String applicationRelease = APPLICATION_RELEASE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelSapIDocListDestinationTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SapPackage.Literals.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__DESTINATION_NAME, oldDestinationName, destinationName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getIdocType() {
        return idocType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdocType(String newIdocType) {
        String oldIdocType = idocType;
        idocType = newIdocType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__IDOC_TYPE, oldIdocType, idocType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getIdocTypeExtension() {
        return idocTypeExtension;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdocTypeExtension(String newIdocTypeExtension) {
        String oldIdocTypeExtension = idocTypeExtension;
        idocTypeExtension = newIdocTypeExtension;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__IDOC_TYPE_EXTENSION, oldIdocTypeExtension, idocTypeExtension));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSystemRelease() {
        return systemRelease;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSystemRelease(String newSystemRelease) {
        String oldSystemRelease = systemRelease;
        systemRelease = newSystemRelease;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__SYSTEM_RELEASE, oldSystemRelease, systemRelease));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getApplicationRelease() {
        return applicationRelease;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setApplicationRelease(String newApplicationRelease) {
        String oldApplicationRelease = applicationRelease;
        applicationRelease = newApplicationRelease;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__APPLICATION_RELEASE, oldApplicationRelease, applicationRelease));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__DESTINATION_NAME:
                return getDestinationName();
            case SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__IDOC_TYPE:
                return getIdocType();
            case SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__IDOC_TYPE_EXTENSION:
                return getIdocTypeExtension();
            case SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__SYSTEM_RELEASE:
                return getSystemRelease();
            case SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__APPLICATION_RELEASE:
                return getApplicationRelease();
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
            case SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__DESTINATION_NAME:
                setDestinationName((String)newValue);
                return;
            case SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__IDOC_TYPE:
                setIdocType((String)newValue);
                return;
            case SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__IDOC_TYPE_EXTENSION:
                setIdocTypeExtension((String)newValue);
                return;
            case SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__SYSTEM_RELEASE:
                setSystemRelease((String)newValue);
                return;
            case SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__APPLICATION_RELEASE:
                setApplicationRelease((String)newValue);
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
            case SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__DESTINATION_NAME:
                setDestinationName(DESTINATION_NAME_EDEFAULT);
                return;
            case SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__IDOC_TYPE:
                setIdocType(IDOC_TYPE_EDEFAULT);
                return;
            case SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__IDOC_TYPE_EXTENSION:
                setIdocTypeExtension(IDOC_TYPE_EXTENSION_EDEFAULT);
                return;
            case SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__SYSTEM_RELEASE:
                setSystemRelease(SYSTEM_RELEASE_EDEFAULT);
                return;
            case SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__APPLICATION_RELEASE:
                setApplicationRelease(APPLICATION_RELEASE_EDEFAULT);
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
            case SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__DESTINATION_NAME:
                return DESTINATION_NAME_EDEFAULT == null ? destinationName != null : !DESTINATION_NAME_EDEFAULT.equals(destinationName);
            case SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__IDOC_TYPE:
                return IDOC_TYPE_EDEFAULT == null ? idocType != null : !IDOC_TYPE_EDEFAULT.equals(idocType);
            case SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__IDOC_TYPE_EXTENSION:
                return IDOC_TYPE_EXTENSION_EDEFAULT == null ? idocTypeExtension != null : !IDOC_TYPE_EXTENSION_EDEFAULT.equals(idocTypeExtension);
            case SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__SYSTEM_RELEASE:
                return SYSTEM_RELEASE_EDEFAULT == null ? systemRelease != null : !SYSTEM_RELEASE_EDEFAULT.equals(systemRelease);
            case SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__APPLICATION_RELEASE:
                return APPLICATION_RELEASE_EDEFAULT == null ? applicationRelease != null : !APPLICATION_RELEASE_EDEFAULT.equals(applicationRelease);
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
        result.append(", idocType: ");
        result.append(idocType);
        result.append(", idocTypeExtension: ");
        result.append(idocTypeExtension);
        result.append(", systemRelease: ");
        result.append(systemRelease);
        result.append(", applicationRelease: ");
        result.append(applicationRelease);
        result.append(')');
        return result.toString();
    }

} //CamelSapIDocListDestinationTypeImpl
