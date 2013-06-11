/**
 */
package org.switchyard.tools.models.switchyard1_0.soap.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.soa.sca.sca1_1.model.sca.impl.CommonExtensionBaseImpl;

import org.switchyard.tools.models.switchyard1_0.soap.EndpointConfigType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endpoint Config Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.EndpointConfigTypeImpl#getConfigFile <em>Config File</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.EndpointConfigTypeImpl#getConfigName <em>Config Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndpointConfigTypeImpl extends CommonExtensionBaseImpl implements EndpointConfigType {
    /**
     * The default value of the '{@link #getConfigFile() <em>Config File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigFile()
     * @generated
     * @ordered
     */
    protected static final String CONFIG_FILE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConfigFile() <em>Config File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigFile()
     * @generated
     * @ordered
     */
    protected String configFile = CONFIG_FILE_EDEFAULT;

    /**
     * The default value of the '{@link #getConfigName() <em>Config Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigName()
     * @generated
     * @ordered
     */
    protected static final String CONFIG_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConfigName() <em>Config Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigName()
     * @generated
     * @ordered
     */
    protected String configName = CONFIG_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EndpointConfigTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SOAPPackage.Literals.ENDPOINT_CONFIG_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getConfigFile() {
        return configFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConfigFile(String newConfigFile) {
        String oldConfigFile = configFile;
        configFile = newConfigFile;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.ENDPOINT_CONFIG_TYPE__CONFIG_FILE, oldConfigFile, configFile));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getConfigName() {
        return configName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConfigName(String newConfigName) {
        String oldConfigName = configName;
        configName = newConfigName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.ENDPOINT_CONFIG_TYPE__CONFIG_NAME, oldConfigName, configName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SOAPPackage.ENDPOINT_CONFIG_TYPE__CONFIG_FILE:
                return getConfigFile();
            case SOAPPackage.ENDPOINT_CONFIG_TYPE__CONFIG_NAME:
                return getConfigName();
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
            case SOAPPackage.ENDPOINT_CONFIG_TYPE__CONFIG_FILE:
                setConfigFile((String)newValue);
                return;
            case SOAPPackage.ENDPOINT_CONFIG_TYPE__CONFIG_NAME:
                setConfigName((String)newValue);
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
            case SOAPPackage.ENDPOINT_CONFIG_TYPE__CONFIG_FILE:
                setConfigFile(CONFIG_FILE_EDEFAULT);
                return;
            case SOAPPackage.ENDPOINT_CONFIG_TYPE__CONFIG_NAME:
                setConfigName(CONFIG_NAME_EDEFAULT);
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
            case SOAPPackage.ENDPOINT_CONFIG_TYPE__CONFIG_FILE:
                return CONFIG_FILE_EDEFAULT == null ? configFile != null : !CONFIG_FILE_EDEFAULT.equals(configFile);
            case SOAPPackage.ENDPOINT_CONFIG_TYPE__CONFIG_NAME:
                return CONFIG_NAME_EDEFAULT == null ? configName != null : !CONFIG_NAME_EDEFAULT.equals(configName);
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
        result.append(" (configFile: ");
        result.append(configFile);
        result.append(", configName: ");
        result.append(configName);
        result.append(')');
        return result.toString();
    }

} //EndpointConfigTypeImpl
