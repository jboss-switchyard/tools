/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.rules.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.soa.sca.sca1_1.model.sca.impl.ImplementationImpl;
import org.switchyard.tools.models.switchyard1_0.rules.ActionsType;
import org.switchyard.tools.models.switchyard1_0.rules.ChannelsType;
import org.switchyard.tools.models.switchyard1_0.rules.ListenersType;
import org.switchyard.tools.models.switchyard1_0.rules.LoggersType;
import org.switchyard.tools.models.switchyard1_0.rules.ManifestType;
import org.switchyard.tools.models.switchyard1_0.rules.PropertiesType;


import org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RulesImplementationTypeImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RulesImplementationTypeImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RulesImplementationTypeImpl#getListeners <em>Listeners</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RulesImplementationTypeImpl#getLoggers <em>Loggers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RulesImplementationTypeImpl#getManifest <em>Manifest</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RulesImplementationTypeImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RulesImplementationTypeImpl extends ImplementationImpl implements RulesImplementationType {
	/**
     * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActions()
     * @generated
     * @ordered
     */
    protected ActionsType actions;

    /**
     * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChannels()
     * @generated
     * @ordered
     */
    protected ChannelsType channels;

    /**
     * The cached value of the '{@link #getListeners() <em>Listeners</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getListeners()
     * @generated
     * @ordered
     */
    protected ListenersType listeners;

    /**
     * The cached value of the '{@link #getLoggers() <em>Loggers</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoggers()
     * @generated
     * @ordered
     */
    protected LoggersType loggers;

    /**
     * The cached value of the '{@link #getManifest() <em>Manifest</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getManifest()
     * @generated
     * @ordered
     */
    protected ManifestType manifest;

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
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected RulesImplementationTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return RulesPackage.Literals.RULES_IMPLEMENTATION_TYPE;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionsType getActions() {
        return actions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetActions(ActionsType newActions, NotificationChain msgs) {
        ActionsType oldActions = actions;
        actions = newActions;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_IMPLEMENTATION_TYPE__ACTIONS, oldActions, newActions);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActions(ActionsType newActions) {
        if (newActions != actions) {
            NotificationChain msgs = null;
            if (actions != null)
                msgs = ((InternalEObject)actions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULES_IMPLEMENTATION_TYPE__ACTIONS, null, msgs);
            if (newActions != null)
                msgs = ((InternalEObject)newActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULES_IMPLEMENTATION_TYPE__ACTIONS, null, msgs);
            msgs = basicSetActions(newActions, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_IMPLEMENTATION_TYPE__ACTIONS, newActions, newActions));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChannelsType getChannels() {
        return channels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChannels(ChannelsType newChannels, NotificationChain msgs) {
        ChannelsType oldChannels = channels;
        channels = newChannels;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_IMPLEMENTATION_TYPE__CHANNELS, oldChannels, newChannels);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChannels(ChannelsType newChannels) {
        if (newChannels != channels) {
            NotificationChain msgs = null;
            if (channels != null)
                msgs = ((InternalEObject)channels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULES_IMPLEMENTATION_TYPE__CHANNELS, null, msgs);
            if (newChannels != null)
                msgs = ((InternalEObject)newChannels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULES_IMPLEMENTATION_TYPE__CHANNELS, null, msgs);
            msgs = basicSetChannels(newChannels, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_IMPLEMENTATION_TYPE__CHANNELS, newChannels, newChannels));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ListenersType getListeners() {
        return listeners;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetListeners(ListenersType newListeners, NotificationChain msgs) {
        ListenersType oldListeners = listeners;
        listeners = newListeners;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_IMPLEMENTATION_TYPE__LISTENERS, oldListeners, newListeners);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setListeners(ListenersType newListeners) {
        if (newListeners != listeners) {
            NotificationChain msgs = null;
            if (listeners != null)
                msgs = ((InternalEObject)listeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULES_IMPLEMENTATION_TYPE__LISTENERS, null, msgs);
            if (newListeners != null)
                msgs = ((InternalEObject)newListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULES_IMPLEMENTATION_TYPE__LISTENERS, null, msgs);
            msgs = basicSetListeners(newListeners, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_IMPLEMENTATION_TYPE__LISTENERS, newListeners, newListeners));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LoggersType getLoggers() {
        return loggers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLoggers(LoggersType newLoggers, NotificationChain msgs) {
        LoggersType oldLoggers = loggers;
        loggers = newLoggers;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_IMPLEMENTATION_TYPE__LOGGERS, oldLoggers, newLoggers);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLoggers(LoggersType newLoggers) {
        if (newLoggers != loggers) {
            NotificationChain msgs = null;
            if (loggers != null)
                msgs = ((InternalEObject)loggers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULES_IMPLEMENTATION_TYPE__LOGGERS, null, msgs);
            if (newLoggers != null)
                msgs = ((InternalEObject)newLoggers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULES_IMPLEMENTATION_TYPE__LOGGERS, null, msgs);
            msgs = basicSetLoggers(newLoggers, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_IMPLEMENTATION_TYPE__LOGGERS, newLoggers, newLoggers));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ManifestType getManifest() {
        return manifest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetManifest(ManifestType newManifest, NotificationChain msgs) {
        ManifestType oldManifest = manifest;
        manifest = newManifest;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_IMPLEMENTATION_TYPE__MANIFEST, oldManifest, newManifest);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setManifest(ManifestType newManifest) {
        if (newManifest != manifest) {
            NotificationChain msgs = null;
            if (manifest != null)
                msgs = ((InternalEObject)manifest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULES_IMPLEMENTATION_TYPE__MANIFEST, null, msgs);
            if (newManifest != null)
                msgs = ((InternalEObject)newManifest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULES_IMPLEMENTATION_TYPE__MANIFEST, null, msgs);
            msgs = basicSetManifest(newManifest, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_IMPLEMENTATION_TYPE__MANIFEST, newManifest, newManifest));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_IMPLEMENTATION_TYPE__PROPERTIES, oldProperties, newProperties);
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
                msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULES_IMPLEMENTATION_TYPE__PROPERTIES, null, msgs);
            if (newProperties != null)
                msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULES_IMPLEMENTATION_TYPE__PROPERTIES, null, msgs);
            msgs = basicSetProperties(newProperties, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_IMPLEMENTATION_TYPE__PROPERTIES, newProperties, newProperties));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__ACTIONS:
                return basicSetActions(null, msgs);
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__CHANNELS:
                return basicSetChannels(null, msgs);
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__LISTENERS:
                return basicSetListeners(null, msgs);
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__LOGGERS:
                return basicSetLoggers(null, msgs);
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__MANIFEST:
                return basicSetManifest(null, msgs);
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__PROPERTIES:
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
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__ACTIONS:
                return getActions();
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__CHANNELS:
                return getChannels();
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__LISTENERS:
                return getListeners();
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__LOGGERS:
                return getLoggers();
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__MANIFEST:
                return getManifest();
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__PROPERTIES:
                return getProperties();
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
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__ACTIONS:
                setActions((ActionsType)newValue);
                return;
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__CHANNELS:
                setChannels((ChannelsType)newValue);
                return;
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__LISTENERS:
                setListeners((ListenersType)newValue);
                return;
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__LOGGERS:
                setLoggers((LoggersType)newValue);
                return;
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__MANIFEST:
                setManifest((ManifestType)newValue);
                return;
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__PROPERTIES:
                setProperties((PropertiesType)newValue);
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
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__ACTIONS:
                setActions((ActionsType)null);
                return;
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__CHANNELS:
                setChannels((ChannelsType)null);
                return;
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__LISTENERS:
                setListeners((ListenersType)null);
                return;
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__LOGGERS:
                setLoggers((LoggersType)null);
                return;
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__MANIFEST:
                setManifest((ManifestType)null);
                return;
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__PROPERTIES:
                setProperties((PropertiesType)null);
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
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__ACTIONS:
                return actions != null;
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__CHANNELS:
                return channels != null;
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__LISTENERS:
                return listeners != null;
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__LOGGERS:
                return loggers != null;
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__MANIFEST:
                return manifest != null;
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__PROPERTIES:
                return properties != null;
        }
        return super.eIsSet(featureID);
    }

} //RulesImplementationTypeImpl
