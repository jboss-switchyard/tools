/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileProducerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Ftp Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#isPassiveMode <em>Passive Mode</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getSoTimeout <em>So Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getSiteCommand <em>Site Command</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getConsume <em>Consume</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.CamelFtpBindingTypeImpl#getProduce <em>Produce</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelFtpBindingTypeImpl extends GenericFtpBindingTypeImpl implements CamelFtpBindingType {
    /**
     * The default value of the '{@link #isPassiveMode() <em>Passive Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPassiveMode()
     * @generated
     * @ordered
     */
    protected static final boolean PASSIVE_MODE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isPassiveMode() <em>Passive Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPassiveMode()
     * @generated
     * @ordered
     */
    protected boolean passiveMode = PASSIVE_MODE_EDEFAULT;

    /**
     * This is true if the Passive Mode attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean passiveModeESet;

    /**
     * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeout()
     * @generated
     * @ordered
     */
    protected static final Object TIMEOUT_EDEFAULT = SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.eINSTANCE.getPropInteger(), "30000");

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
     * This is true if the Timeout attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timeoutESet;

    /**
     * The default value of the '{@link #getSoTimeout() <em>So Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSoTimeout()
     * @generated
     * @ordered
     */
    protected static final Object SO_TIMEOUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSoTimeout() <em>So Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSoTimeout()
     * @generated
     * @ordered
     */
    protected Object soTimeout = SO_TIMEOUT_EDEFAULT;

    /**
     * This is true if the So Timeout attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean soTimeoutESet;

    /**
     * The default value of the '{@link #getSiteCommand() <em>Site Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSiteCommand()
     * @generated
     * @ordered
     */
    protected static final String SITE_COMMAND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSiteCommand() <em>Site Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSiteCommand()
     * @generated
     * @ordered
     */
    protected String siteCommand = SITE_COMMAND_EDEFAULT;

    /**
     * The cached value of the '{@link #getConsume() <em>Consume</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsume()
     * @generated
     * @ordered
     */
    protected RemoteFileConsumerType consume;

    /**
     * The cached value of the '{@link #getProduce() <em>Produce</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProduce()
     * @generated
     * @ordered
     */
    protected RemoteFileProducerType produce;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelFtpBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FtpPackage.Literals.CAMEL_FTP_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isPassiveMode() {
        return passiveMode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPassiveMode(boolean newPassiveMode) {
        boolean oldPassiveMode = passiveMode;
        passiveMode = newPassiveMode;
        boolean oldPassiveModeESet = passiveModeESet;
        passiveModeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE, oldPassiveMode, passiveMode, !oldPassiveModeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPassiveMode() {
        boolean oldPassiveMode = passiveMode;
        boolean oldPassiveModeESet = passiveModeESet;
        passiveMode = PASSIVE_MODE_EDEFAULT;
        passiveModeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE, oldPassiveMode, PASSIVE_MODE_EDEFAULT, oldPassiveModeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPassiveMode() {
        return passiveModeESet;
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
        boolean oldTimeoutESet = timeoutESet;
        timeoutESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__TIMEOUT, oldTimeout, timeout, !oldTimeoutESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTimeout() {
        Object oldTimeout = timeout;
        boolean oldTimeoutESet = timeoutESet;
        timeout = TIMEOUT_EDEFAULT;
        timeoutESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.CAMEL_FTP_BINDING_TYPE__TIMEOUT, oldTimeout, TIMEOUT_EDEFAULT, oldTimeoutESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTimeout() {
        return timeoutESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSoTimeout() {
        return soTimeout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSoTimeout(Object newSoTimeout) {
        Object oldSoTimeout = soTimeout;
        soTimeout = newSoTimeout;
        boolean oldSoTimeoutESet = soTimeoutESet;
        soTimeoutESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT, oldSoTimeout, soTimeout, !oldSoTimeoutESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSoTimeout() {
        Object oldSoTimeout = soTimeout;
        boolean oldSoTimeoutESet = soTimeoutESet;
        soTimeout = SO_TIMEOUT_EDEFAULT;
        soTimeoutESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, FtpPackage.CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT, oldSoTimeout, SO_TIMEOUT_EDEFAULT, oldSoTimeoutESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSoTimeout() {
        return soTimeoutESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSiteCommand() {
        return siteCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSiteCommand(String newSiteCommand) {
        String oldSiteCommand = siteCommand;
        siteCommand = newSiteCommand;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__SITE_COMMAND, oldSiteCommand, siteCommand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RemoteFileConsumerType getConsume() {
        return consume;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConsume(RemoteFileConsumerType newConsume, NotificationChain msgs) {
        RemoteFileConsumerType oldConsume = consume;
        consume = newConsume;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__CONSUME, oldConsume, newConsume);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConsume(RemoteFileConsumerType newConsume) {
        if (newConsume != consume) {
            NotificationChain msgs = null;
            if (consume != null)
                msgs = ((InternalEObject)consume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtpPackage.CAMEL_FTP_BINDING_TYPE__CONSUME, null, msgs);
            if (newConsume != null)
                msgs = ((InternalEObject)newConsume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FtpPackage.CAMEL_FTP_BINDING_TYPE__CONSUME, null, msgs);
            msgs = basicSetConsume(newConsume, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__CONSUME, newConsume, newConsume));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RemoteFileProducerType getProduce() {
        return produce;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProduce(RemoteFileProducerType newProduce, NotificationChain msgs) {
        RemoteFileProducerType oldProduce = produce;
        produce = newProduce;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__PRODUCE, oldProduce, newProduce);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProduce(RemoteFileProducerType newProduce) {
        if (newProduce != produce) {
            NotificationChain msgs = null;
            if (produce != null)
                msgs = ((InternalEObject)produce).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtpPackage.CAMEL_FTP_BINDING_TYPE__PRODUCE, null, msgs);
            if (newProduce != null)
                msgs = ((InternalEObject)newProduce).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FtpPackage.CAMEL_FTP_BINDING_TYPE__PRODUCE, null, msgs);
            msgs = basicSetProduce(newProduce, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.CAMEL_FTP_BINDING_TYPE__PRODUCE, newProduce, newProduce));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__CONSUME:
                return basicSetConsume(null, msgs);
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PRODUCE:
                return basicSetProduce(null, msgs);
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
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE:
                return isPassiveMode();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__TIMEOUT:
                return getTimeout();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT:
                return getSoTimeout();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SITE_COMMAND:
                return getSiteCommand();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__CONSUME:
                return getConsume();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PRODUCE:
                return getProduce();
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
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE:
                setPassiveMode((Boolean)newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__TIMEOUT:
                setTimeout(newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT:
                setSoTimeout(newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SITE_COMMAND:
                setSiteCommand((String)newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__CONSUME:
                setConsume((RemoteFileConsumerType)newValue);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PRODUCE:
                setProduce((RemoteFileProducerType)newValue);
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
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE:
                unsetPassiveMode();
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__TIMEOUT:
                unsetTimeout();
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT:
                unsetSoTimeout();
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SITE_COMMAND:
                setSiteCommand(SITE_COMMAND_EDEFAULT);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__CONSUME:
                setConsume((RemoteFileConsumerType)null);
                return;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PRODUCE:
                setProduce((RemoteFileProducerType)null);
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
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE:
                return isSetPassiveMode();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__TIMEOUT:
                return isSetTimeout();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT:
                return isSetSoTimeout();
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__SITE_COMMAND:
                return SITE_COMMAND_EDEFAULT == null ? siteCommand != null : !SITE_COMMAND_EDEFAULT.equals(siteCommand);
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__CONSUME:
                return consume != null;
            case FtpPackage.CAMEL_FTP_BINDING_TYPE__PRODUCE:
                return produce != null;
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
        result.append(" (passiveMode: ");
        if (passiveModeESet) result.append(passiveMode); else result.append("<unset>");
        result.append(", timeout: ");
        if (timeoutESet) result.append(timeout); else result.append("<unset>");
        result.append(", soTimeout: ");
        if (soTimeoutESet) result.append(soTimeout); else result.append("<unset>");
        result.append(", siteCommand: ");
        result.append(siteCommand);
        result.append(')');
        return result.toString();
    }

} //CamelFtpBindingTypeImpl
