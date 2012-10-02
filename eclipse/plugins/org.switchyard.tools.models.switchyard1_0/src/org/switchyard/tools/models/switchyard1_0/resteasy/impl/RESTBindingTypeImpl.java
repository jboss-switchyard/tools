/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.resteasy.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType;
import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardBindingTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REST Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.impl.RESTBindingTypeImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.impl.RESTBindingTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.impl.RESTBindingTypeImpl#getContextPath <em>Context Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RESTBindingTypeImpl extends SwitchYardBindingTypeImpl implements RESTBindingType {
    /**
     * The default value of the '{@link #getInterfaces() <em>Interfaces</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterfaces()
     * @generated
     * @ordered
     */
    protected static final String INTERFACES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterfaces()
     * @generated
     * @ordered
     */
    protected String interfaces = INTERFACES_EDEFAULT;

    /**
     * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddress()
     * @generated
     * @ordered
     */
    protected static final String ADDRESS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddress()
     * @generated
     * @ordered
     */
    protected String address = ADDRESS_EDEFAULT;

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
    protected RESTBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ResteasyPackage.Literals.REST_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getInterfaces() {
        return interfaces;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInterfaces(String newInterfaces) {
        String oldInterfaces = interfaces;
        interfaces = newInterfaces;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ResteasyPackage.REST_BINDING_TYPE__INTERFACES, oldInterfaces, interfaces));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAddress(String newAddress) {
        String oldAddress = address;
        address = newAddress;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ResteasyPackage.REST_BINDING_TYPE__ADDRESS, oldAddress, address));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ResteasyPackage.REST_BINDING_TYPE__CONTEXT_PATH, oldContextPath, contextPath));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ResteasyPackage.REST_BINDING_TYPE__INTERFACES:
                return getInterfaces();
            case ResteasyPackage.REST_BINDING_TYPE__ADDRESS:
                return getAddress();
            case ResteasyPackage.REST_BINDING_TYPE__CONTEXT_PATH:
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
            case ResteasyPackage.REST_BINDING_TYPE__INTERFACES:
                setInterfaces((String)newValue);
                return;
            case ResteasyPackage.REST_BINDING_TYPE__ADDRESS:
                setAddress((String)newValue);
                return;
            case ResteasyPackage.REST_BINDING_TYPE__CONTEXT_PATH:
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
            case ResteasyPackage.REST_BINDING_TYPE__INTERFACES:
                setInterfaces(INTERFACES_EDEFAULT);
                return;
            case ResteasyPackage.REST_BINDING_TYPE__ADDRESS:
                setAddress(ADDRESS_EDEFAULT);
                return;
            case ResteasyPackage.REST_BINDING_TYPE__CONTEXT_PATH:
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
            case ResteasyPackage.REST_BINDING_TYPE__INTERFACES:
                return INTERFACES_EDEFAULT == null ? interfaces != null : !INTERFACES_EDEFAULT.equals(interfaces);
            case ResteasyPackage.REST_BINDING_TYPE__ADDRESS:
                return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
            case ResteasyPackage.REST_BINDING_TYPE__CONTEXT_PATH:
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
        result.append(" (interfaces: ");
        result.append(interfaces);
        result.append(", address: ");
        result.append(address);
        result.append(", contextPath: ");
        result.append(contextPath);
        result.append(')');
        return result.toString();
    }

} //RESTBindingTypeImpl
