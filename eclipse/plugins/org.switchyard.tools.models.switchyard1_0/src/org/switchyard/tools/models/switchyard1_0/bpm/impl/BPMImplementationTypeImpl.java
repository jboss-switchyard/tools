/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.bpm.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.soa.sca.sca1_1.model.sca.impl.ImplementationImpl;
import org.switchyard.tools.models.switchyard1_0.bpm.ActionsType;

import org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.ChannelsType;
import org.switchyard.tools.models.switchyard1_0.bpm.ListenersType;
import org.switchyard.tools.models.switchyard1_0.bpm.LoggersType;
import org.switchyard.tools.models.switchyard1_0.bpm.ManifestType;
import org.switchyard.tools.models.switchyard1_0.bpm.PropertiesType;
import org.switchyard.tools.models.switchyard1_0.bpm.UserGroupCallbackType;
import org.switchyard.tools.models.switchyard1_0.bpm.WorkItemHandlersType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getListeners <em>Listeners</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getLoggers <em>Loggers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getManifest <em>Manifest</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getUserGroupCallback <em>User Group Callback</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getWorkItemHandlers <em>Work Item Handlers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getProcessId <em>Process Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BPMImplementationTypeImpl extends ImplementationImpl implements BPMImplementationType {
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
     * The cached value of the '{@link #getUserGroupCallback() <em>User Group Callback</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUserGroupCallback()
     * @generated
     * @ordered
     */
    protected UserGroupCallbackType userGroupCallback;

    /**
     * The cached value of the '{@link #getWorkItemHandlers() <em>Work Item Handlers</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorkItemHandlers()
     * @generated
     * @ordered
     */
    protected WorkItemHandlersType workItemHandlers;

    /**
     * The default value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPersistent()
     * @generated
     * @ordered
     */
    protected static final boolean PERSISTENT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPersistent()
     * @generated
     * @ordered
     */
    protected boolean persistent = PERSISTENT_EDEFAULT;

    /**
     * This is true if the Persistent attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean persistentESet;

    /**
     * The default value of the '{@link #getProcessId() <em>Process Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessId()
     * @generated
     * @ordered
     */
    protected static final String PROCESS_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProcessId() <em>Process Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessId()
     * @generated
     * @ordered
     */
    protected String processId = PROCESS_ID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected BPMImplementationTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__ACTIONS, oldActions, newActions);
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
                msgs = ((InternalEObject)actions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMPackage.BPM_IMPLEMENTATION_TYPE__ACTIONS, null, msgs);
            if (newActions != null)
                msgs = ((InternalEObject)newActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMPackage.BPM_IMPLEMENTATION_TYPE__ACTIONS, null, msgs);
            msgs = basicSetActions(newActions, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__ACTIONS, newActions, newActions));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__CHANNELS, oldChannels, newChannels);
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
                msgs = ((InternalEObject)channels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMPackage.BPM_IMPLEMENTATION_TYPE__CHANNELS, null, msgs);
            if (newChannels != null)
                msgs = ((InternalEObject)newChannels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMPackage.BPM_IMPLEMENTATION_TYPE__CHANNELS, null, msgs);
            msgs = basicSetChannels(newChannels, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__CHANNELS, newChannels, newChannels));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__LISTENERS, oldListeners, newListeners);
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
                msgs = ((InternalEObject)listeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMPackage.BPM_IMPLEMENTATION_TYPE__LISTENERS, null, msgs);
            if (newListeners != null)
                msgs = ((InternalEObject)newListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMPackage.BPM_IMPLEMENTATION_TYPE__LISTENERS, null, msgs);
            msgs = basicSetListeners(newListeners, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__LISTENERS, newListeners, newListeners));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__LOGGERS, oldLoggers, newLoggers);
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
                msgs = ((InternalEObject)loggers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMPackage.BPM_IMPLEMENTATION_TYPE__LOGGERS, null, msgs);
            if (newLoggers != null)
                msgs = ((InternalEObject)newLoggers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMPackage.BPM_IMPLEMENTATION_TYPE__LOGGERS, null, msgs);
            msgs = basicSetLoggers(newLoggers, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__LOGGERS, newLoggers, newLoggers));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__MANIFEST, oldManifest, newManifest);
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
                msgs = ((InternalEObject)manifest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMPackage.BPM_IMPLEMENTATION_TYPE__MANIFEST, null, msgs);
            if (newManifest != null)
                msgs = ((InternalEObject)newManifest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMPackage.BPM_IMPLEMENTATION_TYPE__MANIFEST, null, msgs);
            msgs = basicSetManifest(newManifest, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__MANIFEST, newManifest, newManifest));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__PROPERTIES, oldProperties, newProperties);
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
                msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMPackage.BPM_IMPLEMENTATION_TYPE__PROPERTIES, null, msgs);
            if (newProperties != null)
                msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMPackage.BPM_IMPLEMENTATION_TYPE__PROPERTIES, null, msgs);
            msgs = basicSetProperties(newProperties, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__PROPERTIES, newProperties, newProperties));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UserGroupCallbackType getUserGroupCallback() {
        return userGroupCallback;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUserGroupCallback(UserGroupCallbackType newUserGroupCallback, NotificationChain msgs) {
        UserGroupCallbackType oldUserGroupCallback = userGroupCallback;
        userGroupCallback = newUserGroupCallback;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__USER_GROUP_CALLBACK, oldUserGroupCallback, newUserGroupCallback);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUserGroupCallback(UserGroupCallbackType newUserGroupCallback) {
        if (newUserGroupCallback != userGroupCallback) {
            NotificationChain msgs = null;
            if (userGroupCallback != null)
                msgs = ((InternalEObject)userGroupCallback).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMPackage.BPM_IMPLEMENTATION_TYPE__USER_GROUP_CALLBACK, null, msgs);
            if (newUserGroupCallback != null)
                msgs = ((InternalEObject)newUserGroupCallback).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMPackage.BPM_IMPLEMENTATION_TYPE__USER_GROUP_CALLBACK, null, msgs);
            msgs = basicSetUserGroupCallback(newUserGroupCallback, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__USER_GROUP_CALLBACK, newUserGroupCallback, newUserGroupCallback));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorkItemHandlersType getWorkItemHandlers() {
        return workItemHandlers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWorkItemHandlers(WorkItemHandlersType newWorkItemHandlers, NotificationChain msgs) {
        WorkItemHandlersType oldWorkItemHandlers = workItemHandlers;
        workItemHandlers = newWorkItemHandlers;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__WORK_ITEM_HANDLERS, oldWorkItemHandlers, newWorkItemHandlers);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWorkItemHandlers(WorkItemHandlersType newWorkItemHandlers) {
        if (newWorkItemHandlers != workItemHandlers) {
            NotificationChain msgs = null;
            if (workItemHandlers != null)
                msgs = ((InternalEObject)workItemHandlers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMPackage.BPM_IMPLEMENTATION_TYPE__WORK_ITEM_HANDLERS, null, msgs);
            if (newWorkItemHandlers != null)
                msgs = ((InternalEObject)newWorkItemHandlers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMPackage.BPM_IMPLEMENTATION_TYPE__WORK_ITEM_HANDLERS, null, msgs);
            msgs = basicSetWorkItemHandlers(newWorkItemHandlers, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__WORK_ITEM_HANDLERS, newWorkItemHandlers, newWorkItemHandlers));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcessId(String newProcessId) {
        String oldProcessId = processId;
        processId = newProcessId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__PROCESS_ID, oldProcessId, processId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isPersistent() {
        return persistent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPersistent(boolean newPersistent) {
        boolean oldPersistent = persistent;
        persistent = newPersistent;
        boolean oldPersistentESet = persistentESet;
        persistentESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__PERSISTENT, oldPersistent, persistent, !oldPersistentESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPersistent() {
        boolean oldPersistent = persistent;
        boolean oldPersistentESet = persistentESet;
        persistent = PERSISTENT_EDEFAULT;
        persistentESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, BPMPackage.BPM_IMPLEMENTATION_TYPE__PERSISTENT, oldPersistent, PERSISTENT_EDEFAULT, oldPersistentESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPersistent() {
        return persistentESet;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__ACTIONS:
                return basicSetActions(null, msgs);
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__CHANNELS:
                return basicSetChannels(null, msgs);
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__LISTENERS:
                return basicSetListeners(null, msgs);
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__LOGGERS:
                return basicSetLoggers(null, msgs);
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__MANIFEST:
                return basicSetManifest(null, msgs);
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROPERTIES:
                return basicSetProperties(null, msgs);
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__USER_GROUP_CALLBACK:
                return basicSetUserGroupCallback(null, msgs);
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__WORK_ITEM_HANDLERS:
                return basicSetWorkItemHandlers(null, msgs);
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
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__ACTIONS:
                return getActions();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__CHANNELS:
                return getChannels();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__LISTENERS:
                return getListeners();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__LOGGERS:
                return getLoggers();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__MANIFEST:
                return getManifest();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROPERTIES:
                return getProperties();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__USER_GROUP_CALLBACK:
                return getUserGroupCallback();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__WORK_ITEM_HANDLERS:
                return getWorkItemHandlers();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PERSISTENT:
                return isPersistent();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROCESS_ID:
                return getProcessId();
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
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__ACTIONS:
                setActions((ActionsType)newValue);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__CHANNELS:
                setChannels((ChannelsType)newValue);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__LISTENERS:
                setListeners((ListenersType)newValue);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__LOGGERS:
                setLoggers((LoggersType)newValue);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__MANIFEST:
                setManifest((ManifestType)newValue);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROPERTIES:
                setProperties((PropertiesType)newValue);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__USER_GROUP_CALLBACK:
                setUserGroupCallback((UserGroupCallbackType)newValue);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__WORK_ITEM_HANDLERS:
                setWorkItemHandlers((WorkItemHandlersType)newValue);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PERSISTENT:
                setPersistent((Boolean)newValue);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROCESS_ID:
                setProcessId((String)newValue);
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
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__ACTIONS:
                setActions((ActionsType)null);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__CHANNELS:
                setChannels((ChannelsType)null);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__LISTENERS:
                setListeners((ListenersType)null);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__LOGGERS:
                setLoggers((LoggersType)null);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__MANIFEST:
                setManifest((ManifestType)null);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROPERTIES:
                setProperties((PropertiesType)null);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__USER_GROUP_CALLBACK:
                setUserGroupCallback((UserGroupCallbackType)null);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__WORK_ITEM_HANDLERS:
                setWorkItemHandlers((WorkItemHandlersType)null);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PERSISTENT:
                unsetPersistent();
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROCESS_ID:
                setProcessId(PROCESS_ID_EDEFAULT);
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
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__ACTIONS:
                return actions != null;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__CHANNELS:
                return channels != null;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__LISTENERS:
                return listeners != null;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__LOGGERS:
                return loggers != null;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__MANIFEST:
                return manifest != null;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROPERTIES:
                return properties != null;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__USER_GROUP_CALLBACK:
                return userGroupCallback != null;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__WORK_ITEM_HANDLERS:
                return workItemHandlers != null;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PERSISTENT:
                return isSetPersistent();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROCESS_ID:
                return PROCESS_ID_EDEFAULT == null ? processId != null : !PROCESS_ID_EDEFAULT.equals(processId);
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
        result.append(" (persistent: ");
        if (persistentESet) result.append(persistent); else result.append("<unset>");
        result.append(", processId: ");
        result.append(processId);
        result.append(')');
        return result.toString();
    }

} //BPMImplementationTypeImpl
