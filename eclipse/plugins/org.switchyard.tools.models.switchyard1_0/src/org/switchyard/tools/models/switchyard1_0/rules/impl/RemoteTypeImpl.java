/**
 */
package org.switchyard.tools.models.switchyard1_0.rules.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.soa.sca.sca1_1.model.sca.impl.CommonExtensionBaseImpl;

import org.switchyard.tools.models.switchyard1_0.rules.ExtraJaxbClassesType;
import org.switchyard.tools.models.switchyard1_0.rules.RemoteType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RemoteTypeImpl#getDeploymentId <em>Deployment Id</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RemoteTypeImpl#getExtraJaxbClasses <em>Extra Jaxb Classes</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RemoteTypeImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RemoteTypeImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RemoteTypeImpl#getUserName <em>User Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RemoteTypeImpl extends CommonExtensionBaseImpl implements RemoteType {
    /**
     * The default value of the '{@link #getDeploymentId() <em>Deployment Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeploymentId()
     * @generated
     * @ordered
     */
    protected static final String DEPLOYMENT_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDeploymentId() <em>Deployment Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeploymentId()
     * @generated
     * @ordered
     */
    protected String deploymentId = DEPLOYMENT_ID_EDEFAULT;

    /**
     * The cached value of the '{@link #getExtraJaxbClasses() <em>Extra Jaxb Classes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtraJaxbClasses()
     * @generated
     * @ordered
     */
    protected ExtraJaxbClassesType extraJaxbClasses;

    /**
     * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassword()
     * @generated
     * @ordered
     */
    protected static final String PASSWORD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassword()
     * @generated
     * @ordered
     */
    protected String password = PASSWORD_EDEFAULT;

    /**
     * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeout()
     * @generated
     * @ordered
     */
    protected static final Object TIMEOUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeout()
     * @generated
     * @ordered
     */
    protected Object timeout = TIMEOUT_EDEFAULT;

    /**
     * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUserName()
     * @generated
     * @ordered
     */
    protected static final String USER_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUserName()
     * @generated
     * @ordered
     */
    protected String userName = USER_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RemoteTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RulesPackage.Literals.REMOTE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDeploymentId(String newDeploymentId) {
        String oldDeploymentId = deploymentId;
        deploymentId = newDeploymentId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.REMOTE_TYPE__DEPLOYMENT_ID, oldDeploymentId, deploymentId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtraJaxbClassesType getExtraJaxbClasses() {
        return extraJaxbClasses;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExtraJaxbClasses(ExtraJaxbClassesType newExtraJaxbClasses, NotificationChain msgs) {
        ExtraJaxbClassesType oldExtraJaxbClasses = extraJaxbClasses;
        extraJaxbClasses = newExtraJaxbClasses;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.REMOTE_TYPE__EXTRA_JAXB_CLASSES, oldExtraJaxbClasses, newExtraJaxbClasses);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExtraJaxbClasses(ExtraJaxbClassesType newExtraJaxbClasses) {
        if (newExtraJaxbClasses != extraJaxbClasses) {
            NotificationChain msgs = null;
            if (extraJaxbClasses != null)
                msgs = ((InternalEObject)extraJaxbClasses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.REMOTE_TYPE__EXTRA_JAXB_CLASSES, null, msgs);
            if (newExtraJaxbClasses != null)
                msgs = ((InternalEObject)newExtraJaxbClasses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.REMOTE_TYPE__EXTRA_JAXB_CLASSES, null, msgs);
            msgs = basicSetExtraJaxbClasses(newExtraJaxbClasses, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.REMOTE_TYPE__EXTRA_JAXB_CLASSES, newExtraJaxbClasses, newExtraJaxbClasses));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPassword(String newPassword) {
        String oldPassword = password;
        password = newPassword;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.REMOTE_TYPE__PASSWORD, oldPassword, password));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getTimeout() {
        return timeout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimeout(Object newTimeout) {
        Object oldTimeout = timeout;
        timeout = newTimeout;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.REMOTE_TYPE__TIMEOUT, oldTimeout, timeout));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUserName(String newUserName) {
        String oldUserName = userName;
        userName = newUserName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.REMOTE_TYPE__USER_NAME, oldUserName, userName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RulesPackage.REMOTE_TYPE__EXTRA_JAXB_CLASSES:
                return basicSetExtraJaxbClasses(null, msgs);
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
            case RulesPackage.REMOTE_TYPE__DEPLOYMENT_ID:
                return getDeploymentId();
            case RulesPackage.REMOTE_TYPE__EXTRA_JAXB_CLASSES:
                return getExtraJaxbClasses();
            case RulesPackage.REMOTE_TYPE__PASSWORD:
                return getPassword();
            case RulesPackage.REMOTE_TYPE__TIMEOUT:
                return getTimeout();
            case RulesPackage.REMOTE_TYPE__USER_NAME:
                return getUserName();
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
            case RulesPackage.REMOTE_TYPE__DEPLOYMENT_ID:
                setDeploymentId((String)newValue);
                return;
            case RulesPackage.REMOTE_TYPE__EXTRA_JAXB_CLASSES:
                setExtraJaxbClasses((ExtraJaxbClassesType)newValue);
                return;
            case RulesPackage.REMOTE_TYPE__PASSWORD:
                setPassword((String)newValue);
                return;
            case RulesPackage.REMOTE_TYPE__TIMEOUT:
                setTimeout(newValue);
                return;
            case RulesPackage.REMOTE_TYPE__USER_NAME:
                setUserName((String)newValue);
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
            case RulesPackage.REMOTE_TYPE__DEPLOYMENT_ID:
                setDeploymentId(DEPLOYMENT_ID_EDEFAULT);
                return;
            case RulesPackage.REMOTE_TYPE__EXTRA_JAXB_CLASSES:
                setExtraJaxbClasses((ExtraJaxbClassesType)null);
                return;
            case RulesPackage.REMOTE_TYPE__PASSWORD:
                setPassword(PASSWORD_EDEFAULT);
                return;
            case RulesPackage.REMOTE_TYPE__TIMEOUT:
                setTimeout(TIMEOUT_EDEFAULT);
                return;
            case RulesPackage.REMOTE_TYPE__USER_NAME:
                setUserName(USER_NAME_EDEFAULT);
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
            case RulesPackage.REMOTE_TYPE__DEPLOYMENT_ID:
                return DEPLOYMENT_ID_EDEFAULT == null ? deploymentId != null : !DEPLOYMENT_ID_EDEFAULT.equals(deploymentId);
            case RulesPackage.REMOTE_TYPE__EXTRA_JAXB_CLASSES:
                return extraJaxbClasses != null;
            case RulesPackage.REMOTE_TYPE__PASSWORD:
                return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
            case RulesPackage.REMOTE_TYPE__TIMEOUT:
                return TIMEOUT_EDEFAULT == null ? timeout != null : !TIMEOUT_EDEFAULT.equals(timeout);
            case RulesPackage.REMOTE_TYPE__USER_NAME:
                return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
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
        result.append(" (deploymentId: ");
        result.append(deploymentId);
        result.append(", password: ");
        result.append(password);
        result.append(", timeout: ");
        result.append(timeout);
        result.append(", userName: ");
        result.append(userName);
        result.append(')');
        return result.toString();
    }

} //RemoteTypeImpl
