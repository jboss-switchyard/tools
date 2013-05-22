/**
 */
package org.switchyard.tools.models.switchyard1_0.switchyard.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.switchyard.tools.models.switchyard1_0.switchyard.PropertiesType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SecurityTypeImpl#getCallbackHandler <em>Callback Handler</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SecurityTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SecurityTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SecurityTypeImpl#getRolesAllowed <em>Roles Allowed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SecurityTypeImpl#getRunAs <em>Run As</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SecurityTypeImpl#getSecurityDomain <em>Security Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecurityTypeImpl extends EObjectImpl implements SecurityType {
    /**
     * The default value of the '{@link #getCallbackHandler() <em>Callback Handler</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCallbackHandler()
     * @generated
     * @ordered
     */
    protected static final String CALLBACK_HANDLER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCallbackHandler() <em>Callback Handler</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCallbackHandler()
     * @generated
     * @ordered
     */
    protected String callbackHandler = CALLBACK_HANDLER_EDEFAULT;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
    protected PropertiesType properties;

    /**
     * The default value of the '{@link #getRolesAllowed() <em>Roles Allowed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRolesAllowed()
     * @generated
     * @ordered
     */
    protected static final String ROLES_ALLOWED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRolesAllowed() <em>Roles Allowed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRolesAllowed()
     * @generated
     * @ordered
     */
    protected String rolesAllowed = ROLES_ALLOWED_EDEFAULT;

    /**
     * The default value of the '{@link #getRunAs() <em>Run As</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRunAs()
     * @generated
     * @ordered
     */
    protected static final String RUN_AS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRunAs() <em>Run As</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRunAs()
     * @generated
     * @ordered
     */
    protected String runAs = RUN_AS_EDEFAULT;

    /**
     * The default value of the '{@link #getSecurityDomain() <em>Security Domain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSecurityDomain()
     * @generated
     * @ordered
     */
    protected static final String SECURITY_DOMAIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSecurityDomain() <em>Security Domain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSecurityDomain()
     * @generated
     * @ordered
     */
    protected String securityDomain = SECURITY_DOMAIN_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SecurityTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SwitchyardPackage.Literals.SECURITY_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCallbackHandler() {
        return callbackHandler;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCallbackHandler(String newCallbackHandler) {
        String oldCallbackHandler = callbackHandler;
        callbackHandler = newCallbackHandler;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.SECURITY_TYPE__CALLBACK_HANDLER, oldCallbackHandler, callbackHandler));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.SECURITY_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertiesType getProperties() {
        return properties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProperties(PropertiesType newProperties, NotificationChain msgs) {
        PropertiesType oldProperties = properties;
        properties = newProperties;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwitchyardPackage.SECURITY_TYPE__PROPERTIES, oldProperties, newProperties);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProperties(PropertiesType newProperties) {
        if (newProperties != properties) {
            NotificationChain msgs = null;
            if (properties != null)
                msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.SECURITY_TYPE__PROPERTIES, null, msgs);
            if (newProperties != null)
                msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.SECURITY_TYPE__PROPERTIES, null, msgs);
            msgs = basicSetProperties(newProperties, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.SECURITY_TYPE__PROPERTIES, newProperties, newProperties));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRolesAllowed() {
        return rolesAllowed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRolesAllowed(String newRolesAllowed) {
        String oldRolesAllowed = rolesAllowed;
        rolesAllowed = newRolesAllowed;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.SECURITY_TYPE__ROLES_ALLOWED, oldRolesAllowed, rolesAllowed));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRunAs() {
        return runAs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRunAs(String newRunAs) {
        String oldRunAs = runAs;
        runAs = newRunAs;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.SECURITY_TYPE__RUN_AS, oldRunAs, runAs));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSecurityDomain() {
        return securityDomain;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSecurityDomain(String newSecurityDomain) {
        String oldSecurityDomain = securityDomain;
        securityDomain = newSecurityDomain;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.SECURITY_TYPE__SECURITY_DOMAIN, oldSecurityDomain, securityDomain));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SwitchyardPackage.SECURITY_TYPE__PROPERTIES:
                return basicSetProperties(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SwitchyardPackage.SECURITY_TYPE__CALLBACK_HANDLER:
                return getCallbackHandler();
            case SwitchyardPackage.SECURITY_TYPE__NAME:
                return getName();
            case SwitchyardPackage.SECURITY_TYPE__PROPERTIES:
                return getProperties();
            case SwitchyardPackage.SECURITY_TYPE__ROLES_ALLOWED:
                return getRolesAllowed();
            case SwitchyardPackage.SECURITY_TYPE__RUN_AS:
                return getRunAs();
            case SwitchyardPackage.SECURITY_TYPE__SECURITY_DOMAIN:
                return getSecurityDomain();
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
            case SwitchyardPackage.SECURITY_TYPE__CALLBACK_HANDLER:
                setCallbackHandler((String)newValue);
                return;
            case SwitchyardPackage.SECURITY_TYPE__NAME:
                setName((String)newValue);
                return;
            case SwitchyardPackage.SECURITY_TYPE__PROPERTIES:
                setProperties((PropertiesType)newValue);
                return;
            case SwitchyardPackage.SECURITY_TYPE__ROLES_ALLOWED:
                setRolesAllowed((String)newValue);
                return;
            case SwitchyardPackage.SECURITY_TYPE__RUN_AS:
                setRunAs((String)newValue);
                return;
            case SwitchyardPackage.SECURITY_TYPE__SECURITY_DOMAIN:
                setSecurityDomain((String)newValue);
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
            case SwitchyardPackage.SECURITY_TYPE__CALLBACK_HANDLER:
                setCallbackHandler(CALLBACK_HANDLER_EDEFAULT);
                return;
            case SwitchyardPackage.SECURITY_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case SwitchyardPackage.SECURITY_TYPE__PROPERTIES:
                setProperties((PropertiesType)null);
                return;
            case SwitchyardPackage.SECURITY_TYPE__ROLES_ALLOWED:
                setRolesAllowed(ROLES_ALLOWED_EDEFAULT);
                return;
            case SwitchyardPackage.SECURITY_TYPE__RUN_AS:
                setRunAs(RUN_AS_EDEFAULT);
                return;
            case SwitchyardPackage.SECURITY_TYPE__SECURITY_DOMAIN:
                setSecurityDomain(SECURITY_DOMAIN_EDEFAULT);
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
            case SwitchyardPackage.SECURITY_TYPE__CALLBACK_HANDLER:
                return CALLBACK_HANDLER_EDEFAULT == null ? callbackHandler != null : !CALLBACK_HANDLER_EDEFAULT.equals(callbackHandler);
            case SwitchyardPackage.SECURITY_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case SwitchyardPackage.SECURITY_TYPE__PROPERTIES:
                return properties != null;
            case SwitchyardPackage.SECURITY_TYPE__ROLES_ALLOWED:
                return ROLES_ALLOWED_EDEFAULT == null ? rolesAllowed != null : !ROLES_ALLOWED_EDEFAULT.equals(rolesAllowed);
            case SwitchyardPackage.SECURITY_TYPE__RUN_AS:
                return RUN_AS_EDEFAULT == null ? runAs != null : !RUN_AS_EDEFAULT.equals(runAs);
            case SwitchyardPackage.SECURITY_TYPE__SECURITY_DOMAIN:
                return SECURITY_DOMAIN_EDEFAULT == null ? securityDomain != null : !SECURITY_DOMAIN_EDEFAULT.equals(securityDomain);
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
        result.append(" (callbackHandler: ");
        result.append(callbackHandler);
        result.append(", name: ");
        result.append(name);
        result.append(", rolesAllowed: ");
        result.append(rolesAllowed);
        result.append(", runAs: ");
        result.append(runAs);
        result.append(", securityDomain: ");
        result.append(securityDomain);
        result.append(')');
        return result.toString();
    }

} //SecurityTypeImpl
