/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.BaseCamelBinding;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;

import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardBindingTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Camel Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.BaseCamelBindingImpl#getCamelContextMapper <em>Camel Context Mapper</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.ftp.impl.BaseCamelBindingImpl#getCamelMessageComposer <em>Camel Message Composer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseCamelBindingImpl extends SwitchYardBindingTypeImpl implements BaseCamelBinding {
    /**
     * The cached value of the '{@link #getCamelContextMapper() <em>Camel Context Mapper</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCamelContextMapper()
     * @generated
     * @ordered
     */
    protected ContextMapperType camelContextMapper;
    /**
     * The cached value of the '{@link #getCamelMessageComposer() <em>Camel Message Composer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCamelMessageComposer()
     * @generated
     * @ordered
     */
    protected MessageComposerType camelMessageComposer;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BaseCamelBindingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FtpPackage.Literals.BASE_CAMEL_BINDING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextMapperType getCamelContextMapper() {
        return camelContextMapper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCamelContextMapper(ContextMapperType newCamelContextMapper, NotificationChain msgs) {
        ContextMapperType oldCamelContextMapper = camelContextMapper;
        camelContextMapper = newCamelContextMapper;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtpPackage.BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER, oldCamelContextMapper, newCamelContextMapper);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCamelContextMapper(ContextMapperType newCamelContextMapper) {
        if (newCamelContextMapper != camelContextMapper) {
            NotificationChain msgs = null;
            if (camelContextMapper != null)
                msgs = ((InternalEObject)camelContextMapper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtpPackage.BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER, null, msgs);
            if (newCamelContextMapper != null)
                msgs = ((InternalEObject)newCamelContextMapper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FtpPackage.BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER, null, msgs);
            msgs = basicSetCamelContextMapper(newCamelContextMapper, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER, newCamelContextMapper, newCamelContextMapper));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageComposerType getCamelMessageComposer() {
        return camelMessageComposer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCamelMessageComposer(MessageComposerType newCamelMessageComposer, NotificationChain msgs) {
        MessageComposerType oldCamelMessageComposer = camelMessageComposer;
        camelMessageComposer = newCamelMessageComposer;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtpPackage.BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER, oldCamelMessageComposer, newCamelMessageComposer);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCamelMessageComposer(MessageComposerType newCamelMessageComposer) {
        if (newCamelMessageComposer != camelMessageComposer) {
            NotificationChain msgs = null;
            if (camelMessageComposer != null)
                msgs = ((InternalEObject)camelMessageComposer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtpPackage.BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER, null, msgs);
            if (newCamelMessageComposer != null)
                msgs = ((InternalEObject)newCamelMessageComposer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FtpPackage.BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER, null, msgs);
            msgs = basicSetCamelMessageComposer(newCamelMessageComposer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER, newCamelMessageComposer, newCamelMessageComposer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FtpPackage.BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER:
                return basicSetCamelContextMapper(null, msgs);
            case FtpPackage.BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER:
                return basicSetCamelMessageComposer(null, msgs);
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
            case FtpPackage.BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER:
                return getCamelContextMapper();
            case FtpPackage.BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER:
                return getCamelMessageComposer();
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
            case FtpPackage.BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER:
                setCamelContextMapper((ContextMapperType)newValue);
                return;
            case FtpPackage.BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER:
                setCamelMessageComposer((MessageComposerType)newValue);
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
            case FtpPackage.BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER:
                setCamelContextMapper((ContextMapperType)null);
                return;
            case FtpPackage.BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER:
                setCamelMessageComposer((MessageComposerType)null);
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
            case FtpPackage.BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER:
                return camelContextMapper != null;
            case FtpPackage.BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER:
                return camelMessageComposer != null;
        }
        return super.eIsSet(featureID);
    }

    @Override
    public ContextMapperType getContextMapper() {
        return getCamelContextMapper();
    }

    @Override
    public void setContextMapper(ContextMapperType newContextMapper) {
        setCamelContextMapper(newContextMapper);
    }

    @Override
    public MessageComposerType getMessageComposer() {
        return getCamelMessageComposer();
    }

    @Override
    public void setMessageComposer(MessageComposerType newMessageComposer) {
        setCamelMessageComposer(newMessageComposer);
    }

} //BaseCamelBindingImpl
