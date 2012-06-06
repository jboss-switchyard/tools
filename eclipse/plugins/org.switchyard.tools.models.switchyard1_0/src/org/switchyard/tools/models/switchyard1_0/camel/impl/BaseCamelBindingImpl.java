/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.BaseCamelBinding;
import org.switchyard.tools.models.switchyard1_0.camel.CamelOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;

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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.BaseCamelBindingImpl#getContextMapper <em>Context Mapper</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.BaseCamelBindingImpl#getMessageComposer <em>Message Composer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.BaseCamelBindingImpl#getCamelOperationSelector <em>Camel Operation Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BaseCamelBindingImpl extends SwitchYardBindingTypeImpl implements BaseCamelBinding {
    /**
     * The cached value of the '{@link #getContextMapper() <em>Context Mapper</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextMapper()
     * @generated
     * @ordered
     */
    protected ContextMapperType contextMapper;

    /**
     * This is true if the Context Mapper reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean contextMapperESet;

    /**
     * The cached value of the '{@link #getMessageComposer() <em>Message Composer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageComposer()
     * @generated
     * @ordered
     */
    protected MessageComposerType messageComposer;

    /**
     * The cached value of the '{@link #getCamelOperationSelector() <em>Camel Operation Selector</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCamelOperationSelector()
     * @generated
     * @ordered
     */
    protected CamelOperationSelectorType camelOperationSelector;

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
        return CamelPackage.Literals.BASE_CAMEL_BINDING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextMapperType getContextMapper() {
        if (contextMapper != null && contextMapper.eIsProxy()) {
            InternalEObject oldContextMapper = (InternalEObject)contextMapper;
            contextMapper = (ContextMapperType)eResolveProxy(oldContextMapper);
            if (contextMapper != oldContextMapper) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CamelPackage.BASE_CAMEL_BINDING__CONTEXT_MAPPER, oldContextMapper, contextMapper));
            }
        }
        return contextMapper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextMapperType basicGetContextMapper() {
        return contextMapper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextMapper(ContextMapperType newContextMapper) {
        ContextMapperType oldContextMapper = contextMapper;
        contextMapper = newContextMapper;
        boolean oldContextMapperESet = contextMapperESet;
        contextMapperESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.BASE_CAMEL_BINDING__CONTEXT_MAPPER, oldContextMapper, contextMapper, !oldContextMapperESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetContextMapper() {
        ContextMapperType oldContextMapper = contextMapper;
        boolean oldContextMapperESet = contextMapperESet;
        contextMapper = null;
        contextMapperESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CamelPackage.BASE_CAMEL_BINDING__CONTEXT_MAPPER, oldContextMapper, null, oldContextMapperESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetContextMapper() {
        return contextMapperESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageComposerType getMessageComposer() {
        if (messageComposer != null && messageComposer.eIsProxy()) {
            InternalEObject oldMessageComposer = (InternalEObject)messageComposer;
            messageComposer = (MessageComposerType)eResolveProxy(oldMessageComposer);
            if (messageComposer != oldMessageComposer) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CamelPackage.BASE_CAMEL_BINDING__MESSAGE_COMPOSER, oldMessageComposer, messageComposer));
            }
        }
        return messageComposer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageComposerType basicGetMessageComposer() {
        return messageComposer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessageComposer(MessageComposerType newMessageComposer) {
        MessageComposerType oldMessageComposer = messageComposer;
        messageComposer = newMessageComposer;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.BASE_CAMEL_BINDING__MESSAGE_COMPOSER, oldMessageComposer, messageComposer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelOperationSelectorType getCamelOperationSelector() {
        return camelOperationSelector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCamelOperationSelector(CamelOperationSelectorType newCamelOperationSelector, NotificationChain msgs) {
        CamelOperationSelectorType oldCamelOperationSelector = camelOperationSelector;
        camelOperationSelector = newCamelOperationSelector;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelPackage.BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR, oldCamelOperationSelector, newCamelOperationSelector);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCamelOperationSelector(CamelOperationSelectorType newCamelOperationSelector) {
        if (newCamelOperationSelector != camelOperationSelector) {
            NotificationChain msgs = null;
            if (camelOperationSelector != null)
                msgs = ((InternalEObject)camelOperationSelector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelPackage.BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR, null, msgs);
            if (newCamelOperationSelector != null)
                msgs = ((InternalEObject)newCamelOperationSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelPackage.BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR, null, msgs);
            msgs = basicSetCamelOperationSelector(newCamelOperationSelector, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR, newCamelOperationSelector, newCamelOperationSelector));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CamelPackage.BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR:
                return basicSetCamelOperationSelector(null, msgs);
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
            case CamelPackage.BASE_CAMEL_BINDING__CONTEXT_MAPPER:
                if (resolve) return getContextMapper();
                return basicGetContextMapper();
            case CamelPackage.BASE_CAMEL_BINDING__MESSAGE_COMPOSER:
                if (resolve) return getMessageComposer();
                return basicGetMessageComposer();
            case CamelPackage.BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR:
                return getCamelOperationSelector();
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
            case CamelPackage.BASE_CAMEL_BINDING__CONTEXT_MAPPER:
                setContextMapper((ContextMapperType)newValue);
                return;
            case CamelPackage.BASE_CAMEL_BINDING__MESSAGE_COMPOSER:
                setMessageComposer((MessageComposerType)newValue);
                return;
            case CamelPackage.BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR:
                setCamelOperationSelector((CamelOperationSelectorType)newValue);
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
            case CamelPackage.BASE_CAMEL_BINDING__CONTEXT_MAPPER:
                unsetContextMapper();
                return;
            case CamelPackage.BASE_CAMEL_BINDING__MESSAGE_COMPOSER:
                setMessageComposer((MessageComposerType)null);
                return;
            case CamelPackage.BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR:
                setCamelOperationSelector((CamelOperationSelectorType)null);
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
            case CamelPackage.BASE_CAMEL_BINDING__CONTEXT_MAPPER:
                return isSetContextMapper();
            case CamelPackage.BASE_CAMEL_BINDING__MESSAGE_COMPOSER:
                return messageComposer != null;
            case CamelPackage.BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR:
                return camelOperationSelector != null;
        }
        return super.eIsSet(featureID);
    }

} //BaseCamelBindingImpl
