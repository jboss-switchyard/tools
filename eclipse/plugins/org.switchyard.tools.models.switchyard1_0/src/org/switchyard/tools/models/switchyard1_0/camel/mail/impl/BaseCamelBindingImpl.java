/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.mail.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.switchyard.tools.models.switchyard1_0.camel.mail.AdditionalUriParametersType;
import org.switchyard.tools.models.switchyard1_0.camel.mail.BaseCamelBinding;
import org.switchyard.tools.models.switchyard1_0.camel.mail.MailPackage;

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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.BaseCamelBindingImpl#getContextMapper <em>Context Mapper</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.BaseCamelBindingImpl#getMessageComposer <em>Message Composer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.mail.impl.BaseCamelBindingImpl#getAdditionalUriParameters <em>Additional Uri Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseCamelBindingImpl extends SwitchYardBindingTypeImpl implements BaseCamelBinding {
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
     * The cached value of the '{@link #getAdditionalUriParameters() <em>Additional Uri Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAdditionalUriParameters()
     * @generated
     * @ordered
     */
    protected AdditionalUriParametersType additionalUriParameters;
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
        return MailPackage.Literals.BASE_CAMEL_BINDING;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MailPackage.BASE_CAMEL_BINDING__CONTEXT_MAPPER, oldContextMapper, newContextMapper);
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
                msgs = ((InternalEObject)contextMapper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MailPackage.BASE_CAMEL_BINDING__CONTEXT_MAPPER, null, msgs);
            if (newContextMapper != null)
                msgs = ((InternalEObject)newContextMapper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MailPackage.BASE_CAMEL_BINDING__CONTEXT_MAPPER, null, msgs);
            msgs = basicSetContextMapper(newContextMapper, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.BASE_CAMEL_BINDING__CONTEXT_MAPPER, newContextMapper, newContextMapper));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MailPackage.BASE_CAMEL_BINDING__MESSAGE_COMPOSER, oldMessageComposer, newMessageComposer);
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
                msgs = ((InternalEObject)messageComposer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MailPackage.BASE_CAMEL_BINDING__MESSAGE_COMPOSER, null, msgs);
            if (newMessageComposer != null)
                msgs = ((InternalEObject)newMessageComposer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MailPackage.BASE_CAMEL_BINDING__MESSAGE_COMPOSER, null, msgs);
            msgs = basicSetMessageComposer(newMessageComposer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.BASE_CAMEL_BINDING__MESSAGE_COMPOSER, newMessageComposer, newMessageComposer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdditionalUriParametersType getAdditionalUriParameters() {
        return additionalUriParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAdditionalUriParameters(AdditionalUriParametersType newAdditionalUriParameters, NotificationChain msgs) {
        AdditionalUriParametersType oldAdditionalUriParameters = additionalUriParameters;
        additionalUriParameters = newAdditionalUriParameters;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MailPackage.BASE_CAMEL_BINDING__ADDITIONAL_URI_PARAMETERS, oldAdditionalUriParameters, newAdditionalUriParameters);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAdditionalUriParameters(AdditionalUriParametersType newAdditionalUriParameters) {
        if (newAdditionalUriParameters != additionalUriParameters) {
            NotificationChain msgs = null;
            if (additionalUriParameters != null)
                msgs = ((InternalEObject)additionalUriParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MailPackage.BASE_CAMEL_BINDING__ADDITIONAL_URI_PARAMETERS, null, msgs);
            if (newAdditionalUriParameters != null)
                msgs = ((InternalEObject)newAdditionalUriParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MailPackage.BASE_CAMEL_BINDING__ADDITIONAL_URI_PARAMETERS, null, msgs);
            msgs = basicSetAdditionalUriParameters(newAdditionalUriParameters, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MailPackage.BASE_CAMEL_BINDING__ADDITIONAL_URI_PARAMETERS, newAdditionalUriParameters, newAdditionalUriParameters));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case MailPackage.BASE_CAMEL_BINDING__CONTEXT_MAPPER:
                return basicSetContextMapper(null, msgs);
            case MailPackage.BASE_CAMEL_BINDING__MESSAGE_COMPOSER:
                return basicSetMessageComposer(null, msgs);
            case MailPackage.BASE_CAMEL_BINDING__ADDITIONAL_URI_PARAMETERS:
                return basicSetAdditionalUriParameters(null, msgs);
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
            case MailPackage.BASE_CAMEL_BINDING__CONTEXT_MAPPER:
                return getContextMapper();
            case MailPackage.BASE_CAMEL_BINDING__MESSAGE_COMPOSER:
                return getMessageComposer();
            case MailPackage.BASE_CAMEL_BINDING__ADDITIONAL_URI_PARAMETERS:
                return getAdditionalUriParameters();
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
            case MailPackage.BASE_CAMEL_BINDING__CONTEXT_MAPPER:
                setContextMapper((ContextMapperType)newValue);
                return;
            case MailPackage.BASE_CAMEL_BINDING__MESSAGE_COMPOSER:
                setMessageComposer((MessageComposerType)newValue);
                return;
            case MailPackage.BASE_CAMEL_BINDING__ADDITIONAL_URI_PARAMETERS:
                setAdditionalUriParameters((AdditionalUriParametersType)newValue);
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
            case MailPackage.BASE_CAMEL_BINDING__CONTEXT_MAPPER:
                setContextMapper((ContextMapperType)null);
                return;
            case MailPackage.BASE_CAMEL_BINDING__MESSAGE_COMPOSER:
                setMessageComposer((MessageComposerType)null);
                return;
            case MailPackage.BASE_CAMEL_BINDING__ADDITIONAL_URI_PARAMETERS:
                setAdditionalUriParameters((AdditionalUriParametersType)null);
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
            case MailPackage.BASE_CAMEL_BINDING__CONTEXT_MAPPER:
                return contextMapper != null;
            case MailPackage.BASE_CAMEL_BINDING__MESSAGE_COMPOSER:
                return messageComposer != null;
            case MailPackage.BASE_CAMEL_BINDING__ADDITIONAL_URI_PARAMETERS:
                return additionalUriParameters != null;
        }
        return super.eIsSet(featureID);
    }

} //BaseCamelBindingImpl
