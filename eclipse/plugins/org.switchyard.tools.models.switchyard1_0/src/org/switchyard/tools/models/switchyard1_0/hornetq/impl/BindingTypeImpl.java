/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.hornetq.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.hornetq.BindingType;
import org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType;
import org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage;
import org.switchyard.tools.models.switchyard1_0.hornetq.hqOperationSelectorType;

import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;

import org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardBindingTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.BindingTypeImpl#getContextMapper <em>Context Mapper</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.BindingTypeImpl#getMessageComposer <em>Message Composer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.BindingTypeImpl#getHqOperationSelector <em>Hq Operation Selector</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.BindingTypeImpl#getConfig <em>Config</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingTypeImpl extends SwitchYardBindingTypeImpl implements BindingType {
    /**
     * The cached value of the '{@link #getContextMapper() <em>Context Mapper</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextMapper()
     * @generated
     * @ordered
     */
    protected ContextMapperType contextMapper;

    /**
     * The cached value of the '{@link #getMessageComposer() <em>Message Composer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageComposer()
     * @generated
     * @ordered
     */
    protected MessageComposerType messageComposer;

    /**
     * The cached value of the '{@link #getHqOperationSelector() <em>Hq Operation Selector</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHqOperationSelector()
     * @generated
     * @ordered
     */
    protected hqOperationSelectorType hqOperationSelector;

    /**
     * The cached value of the '{@link #getConfig() <em>Config</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfig()
     * @generated
     * @ordered
     */
    protected ConfigType config;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return HornetQPackage.Literals.BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextMapperType getContextMapper() {
        return contextMapper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContextMapper(ContextMapperType newContextMapper, NotificationChain msgs) {
        ContextMapperType oldContextMapper = contextMapper;
        contextMapper = newContextMapper;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HornetQPackage.BINDING_TYPE__CONTEXT_MAPPER, oldContextMapper, newContextMapper);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextMapper(ContextMapperType newContextMapper) {
        if (newContextMapper != contextMapper) {
            NotificationChain msgs = null;
            if (contextMapper != null)
                msgs = ((InternalEObject)contextMapper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HornetQPackage.BINDING_TYPE__CONTEXT_MAPPER, null, msgs);
            if (newContextMapper != null)
                msgs = ((InternalEObject)newContextMapper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HornetQPackage.BINDING_TYPE__CONTEXT_MAPPER, null, msgs);
            msgs = basicSetContextMapper(newContextMapper, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.BINDING_TYPE__CONTEXT_MAPPER, newContextMapper, newContextMapper));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageComposerType getMessageComposer() {
        return messageComposer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMessageComposer(MessageComposerType newMessageComposer, NotificationChain msgs) {
        MessageComposerType oldMessageComposer = messageComposer;
        messageComposer = newMessageComposer;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HornetQPackage.BINDING_TYPE__MESSAGE_COMPOSER, oldMessageComposer, newMessageComposer);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessageComposer(MessageComposerType newMessageComposer) {
        if (newMessageComposer != messageComposer) {
            NotificationChain msgs = null;
            if (messageComposer != null)
                msgs = ((InternalEObject)messageComposer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HornetQPackage.BINDING_TYPE__MESSAGE_COMPOSER, null, msgs);
            if (newMessageComposer != null)
                msgs = ((InternalEObject)newMessageComposer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HornetQPackage.BINDING_TYPE__MESSAGE_COMPOSER, null, msgs);
            msgs = basicSetMessageComposer(newMessageComposer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.BINDING_TYPE__MESSAGE_COMPOSER, newMessageComposer, newMessageComposer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public hqOperationSelectorType getHqOperationSelector() {
        return hqOperationSelector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHqOperationSelector(hqOperationSelectorType newHqOperationSelector, NotificationChain msgs) {
        hqOperationSelectorType oldHqOperationSelector = hqOperationSelector;
        hqOperationSelector = newHqOperationSelector;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HornetQPackage.BINDING_TYPE__HQ_OPERATION_SELECTOR, oldHqOperationSelector, newHqOperationSelector);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHqOperationSelector(hqOperationSelectorType newHqOperationSelector) {
        if (newHqOperationSelector != hqOperationSelector) {
            NotificationChain msgs = null;
            if (hqOperationSelector != null)
                msgs = ((InternalEObject)hqOperationSelector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HornetQPackage.BINDING_TYPE__HQ_OPERATION_SELECTOR, null, msgs);
            if (newHqOperationSelector != null)
                msgs = ((InternalEObject)newHqOperationSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HornetQPackage.BINDING_TYPE__HQ_OPERATION_SELECTOR, null, msgs);
            msgs = basicSetHqOperationSelector(newHqOperationSelector, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.BINDING_TYPE__HQ_OPERATION_SELECTOR, newHqOperationSelector, newHqOperationSelector));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConfigType getConfig() {
        return config;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConfig(ConfigType newConfig, NotificationChain msgs) {
        ConfigType oldConfig = config;
        config = newConfig;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HornetQPackage.BINDING_TYPE__CONFIG, oldConfig, newConfig);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConfig(ConfigType newConfig) {
        if (newConfig != config) {
            NotificationChain msgs = null;
            if (config != null)
                msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HornetQPackage.BINDING_TYPE__CONFIG, null, msgs);
            if (newConfig != null)
                msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HornetQPackage.BINDING_TYPE__CONFIG, null, msgs);
            msgs = basicSetConfig(newConfig, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.BINDING_TYPE__CONFIG, newConfig, newConfig));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case HornetQPackage.BINDING_TYPE__CONTEXT_MAPPER:
                return basicSetContextMapper(null, msgs);
            case HornetQPackage.BINDING_TYPE__MESSAGE_COMPOSER:
                return basicSetMessageComposer(null, msgs);
            case HornetQPackage.BINDING_TYPE__HQ_OPERATION_SELECTOR:
                return basicSetHqOperationSelector(null, msgs);
            case HornetQPackage.BINDING_TYPE__CONFIG:
                return basicSetConfig(null, msgs);
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
            case HornetQPackage.BINDING_TYPE__CONTEXT_MAPPER:
                return getContextMapper();
            case HornetQPackage.BINDING_TYPE__MESSAGE_COMPOSER:
                return getMessageComposer();
            case HornetQPackage.BINDING_TYPE__HQ_OPERATION_SELECTOR:
                return getHqOperationSelector();
            case HornetQPackage.BINDING_TYPE__CONFIG:
                return getConfig();
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
            case HornetQPackage.BINDING_TYPE__CONTEXT_MAPPER:
                setContextMapper((ContextMapperType)newValue);
                return;
            case HornetQPackage.BINDING_TYPE__MESSAGE_COMPOSER:
                setMessageComposer((MessageComposerType)newValue);
                return;
            case HornetQPackage.BINDING_TYPE__HQ_OPERATION_SELECTOR:
                setHqOperationSelector((hqOperationSelectorType)newValue);
                return;
            case HornetQPackage.BINDING_TYPE__CONFIG:
                setConfig((ConfigType)newValue);
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
            case HornetQPackage.BINDING_TYPE__CONTEXT_MAPPER:
                setContextMapper((ContextMapperType)null);
                return;
            case HornetQPackage.BINDING_TYPE__MESSAGE_COMPOSER:
                setMessageComposer((MessageComposerType)null);
                return;
            case HornetQPackage.BINDING_TYPE__HQ_OPERATION_SELECTOR:
                setHqOperationSelector((hqOperationSelectorType)null);
                return;
            case HornetQPackage.BINDING_TYPE__CONFIG:
                setConfig((ConfigType)null);
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
            case HornetQPackage.BINDING_TYPE__CONTEXT_MAPPER:
                return contextMapper != null;
            case HornetQPackage.BINDING_TYPE__MESSAGE_COMPOSER:
                return messageComposer != null;
            case HornetQPackage.BINDING_TYPE__HQ_OPERATION_SELECTOR:
                return hqOperationSelector != null;
            case HornetQPackage.BINDING_TYPE__CONFIG:
                return config != null;
        }
        return super.eIsSet(featureID);
    }

    @Override
    public EStructuralFeature getDocumentFeature() {
        return HornetQPackage.eINSTANCE.getDocumentRoot_BindingHornetq();
    }

} //BindingTypeImpl
