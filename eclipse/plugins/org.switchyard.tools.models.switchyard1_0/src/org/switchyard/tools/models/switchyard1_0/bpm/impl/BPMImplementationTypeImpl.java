/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.bpm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.bpm.ActionType1;
import org.switchyard.tools.models.switchyard1_0.bpm.AuditType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.EventListenerType;
import org.switchyard.tools.models.switchyard1_0.bpm.ParametersType;
import org.switchyard.tools.models.switchyard1_0.bpm.ResourceType;
import org.switchyard.tools.models.switchyard1_0.bpm.ResultsType;
import org.switchyard.tools.models.switchyard1_0.bpm.TaskHandlerType;
import org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonImplementationTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getAudit <em>Audit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getEventListener <em>Event Listener</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getTaskHandler <em>Task Handler</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getResults <em>Results</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getProcessDefinition <em>Process Definition</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getProcessDefinitionType <em>Process Definition Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getProcessId <em>Process Id</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getMessageContentInName <em>Message Content In Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getMessageContentOutName <em>Message Content Out Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getSessionId <em>Session Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BPMImplementationTypeImpl extends CommonImplementationTypeImpl implements BPMImplementationType {
	/**
     * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAction()
     * @generated
     * @ordered
     */
	protected EList<ActionType1> action;

	/**
     * The cached value of the '{@link #getAudit() <em>Audit</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAudit()
     * @generated
     * @ordered
     */
	protected AuditType audit;

	/**
     * The cached value of the '{@link #getEventListener() <em>Event Listener</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventListener()
     * @generated
     * @ordered
     */
    protected EList<EventListenerType> eventListener;

    /**
     * The cached value of the '{@link #getTaskHandler() <em>Task Handler</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTaskHandler()
     * @generated
     * @ordered
     */
	protected EList<TaskHandlerType> taskHandler;

	/**
     * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResource()
     * @generated
     * @ordered
     */
	protected EList<ResourceType> resource;

	/**
     * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameters()
     * @generated
     * @ordered
     */
    protected ParametersType parameters;

    /**
     * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResults()
     * @generated
     * @ordered
     */
    protected ResultsType results;

    /**
     * The default value of the '{@link #getProcessDefinition() <em>Process Definition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessDefinition()
     * @generated
     * @ordered
     */
    protected static final String PROCESS_DEFINITION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProcessDefinition() <em>Process Definition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessDefinition()
     * @generated
     * @ordered
     */
    protected String processDefinition = PROCESS_DEFINITION_EDEFAULT;

    /**
     * The default value of the '{@link #getProcessDefinitionType() <em>Process Definition Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessDefinitionType()
     * @generated
     * @ordered
     */
    protected static final String PROCESS_DEFINITION_TYPE_EDEFAULT = "BPMN2";

    /**
     * The cached value of the '{@link #getProcessDefinitionType() <em>Process Definition Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessDefinitionType()
     * @generated
     * @ordered
     */
    protected String processDefinitionType = PROCESS_DEFINITION_TYPE_EDEFAULT;

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
     * The default value of the '{@link #getMessageContentInName() <em>Message Content In Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageContentInName()
     * @generated
     * @ordered
     */
    protected static final String MESSAGE_CONTENT_IN_NAME_EDEFAULT = "messageContentIn";

    /**
     * The cached value of the '{@link #getMessageContentInName() <em>Message Content In Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageContentInName()
     * @generated
     * @ordered
     */
    protected String messageContentInName = MESSAGE_CONTENT_IN_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getMessageContentOutName() <em>Message Content Out Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageContentOutName()
     * @generated
     * @ordered
     */
    protected static final String MESSAGE_CONTENT_OUT_NAME_EDEFAULT = "messageContentOut";

    /**
     * The cached value of the '{@link #getMessageContentOutName() <em>Message Content Out Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageContentOutName()
     * @generated
     * @ordered
     */
    protected String messageContentOutName = MESSAGE_CONTENT_OUT_NAME_EDEFAULT;

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
     * The default value of the '{@link #getSessionId() <em>Session Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSessionId()
     * @generated
     * @ordered
     */
    protected static final String SESSION_ID_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getSessionId() <em>Session Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSessionId()
     * @generated
     * @ordered
     */
    protected String sessionId = SESSION_ID_EDEFAULT;

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
	public EList<ActionType1> getAction() {
        if (action == null) {
            action = new EObjectContainmentEList<ActionType1>(ActionType1.class, this, BPMPackage.BPM_IMPLEMENTATION_TYPE__ACTION);
        }
        return action;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AuditType getAudit() {
        return audit;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetAudit(AuditType newAudit, NotificationChain msgs) {
        AuditType oldAudit = audit;
        audit = newAudit;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__AUDIT, oldAudit, newAudit);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAudit(AuditType newAudit) {
        if (newAudit != audit) {
            NotificationChain msgs = null;
            if (audit != null)
                msgs = ((InternalEObject)audit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMPackage.BPM_IMPLEMENTATION_TYPE__AUDIT, null, msgs);
            if (newAudit != null)
                msgs = ((InternalEObject)newAudit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMPackage.BPM_IMPLEMENTATION_TYPE__AUDIT, null, msgs);
            msgs = basicSetAudit(newAudit, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__AUDIT, newAudit, newAudit));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EventListenerType> getEventListener() {
        if (eventListener == null) {
            eventListener = new EObjectContainmentEList<EventListenerType>(EventListenerType.class, this, BPMPackage.BPM_IMPLEMENTATION_TYPE__EVENT_LISTENER);
        }
        return eventListener;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<TaskHandlerType> getTaskHandler() {
        if (taskHandler == null) {
            taskHandler = new EObjectContainmentEList<TaskHandlerType>(TaskHandlerType.class, this, BPMPackage.BPM_IMPLEMENTATION_TYPE__TASK_HANDLER);
        }
        return taskHandler;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ResourceType> getResource() {
        if (resource == null) {
            resource = new EObjectContainmentEList<ResourceType>(ResourceType.class, this, BPMPackage.BPM_IMPLEMENTATION_TYPE__RESOURCE);
        }
        return resource;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParametersType getParameters() {
        return parameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParameters(ParametersType newParameters, NotificationChain msgs) {
        ParametersType oldParameters = parameters;
        parameters = newParameters;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__PARAMETERS, oldParameters, newParameters);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParameters(ParametersType newParameters) {
        if (newParameters != parameters) {
            NotificationChain msgs = null;
            if (parameters != null)
                msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMPackage.BPM_IMPLEMENTATION_TYPE__PARAMETERS, null, msgs);
            if (newParameters != null)
                msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMPackage.BPM_IMPLEMENTATION_TYPE__PARAMETERS, null, msgs);
            msgs = basicSetParameters(newParameters, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__PARAMETERS, newParameters, newParameters));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResultsType getResults() {
        return results;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetResults(ResultsType newResults, NotificationChain msgs) {
        ResultsType oldResults = results;
        results = newResults;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__RESULTS, oldResults, newResults);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResults(ResultsType newResults) {
        if (newResults != results) {
            NotificationChain msgs = null;
            if (results != null)
                msgs = ((InternalEObject)results).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMPackage.BPM_IMPLEMENTATION_TYPE__RESULTS, null, msgs);
            if (newResults != null)
                msgs = ((InternalEObject)newResults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMPackage.BPM_IMPLEMENTATION_TYPE__RESULTS, null, msgs);
            msgs = basicSetResults(newResults, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__RESULTS, newResults, newResults));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getProcessDefinition() {
        return processDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcessDefinition(String newProcessDefinition) {
        String oldProcessDefinition = processDefinition;
        processDefinition = newProcessDefinition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__PROCESS_DEFINITION, oldProcessDefinition, processDefinition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getProcessDefinitionType() {
        return processDefinitionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcessDefinitionType(String newProcessDefinitionType) {
        String oldProcessDefinitionType = processDefinitionType;
        processDefinitionType = newProcessDefinitionType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__PROCESS_DEFINITION_TYPE, oldProcessDefinitionType, processDefinitionType));
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
    public String getMessageContentInName() {
        return messageContentInName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessageContentInName(String newMessageContentInName) {
        String oldMessageContentInName = messageContentInName;
        messageContentInName = newMessageContentInName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__MESSAGE_CONTENT_IN_NAME, oldMessageContentInName, messageContentInName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMessageContentOutName() {
        return messageContentOutName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessageContentOutName(String newMessageContentOutName) {
        String oldMessageContentOutName = messageContentOutName;
        messageContentOutName = newMessageContentOutName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__MESSAGE_CONTENT_OUT_NAME, oldMessageContentOutName, messageContentOutName));
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
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__PERSISTENT, oldPersistent, persistent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSessionId(String newSessionId) {
        String oldSessionId = sessionId;
        sessionId = newSessionId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__SESSION_ID, oldSessionId, sessionId));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__ACTION:
                return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__AUDIT:
                return basicSetAudit(null, msgs);
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__EVENT_LISTENER:
                return ((InternalEList<?>)getEventListener()).basicRemove(otherEnd, msgs);
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__TASK_HANDLER:
                return ((InternalEList<?>)getTaskHandler()).basicRemove(otherEnd, msgs);
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__RESOURCE:
                return ((InternalEList<?>)getResource()).basicRemove(otherEnd, msgs);
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PARAMETERS:
                return basicSetParameters(null, msgs);
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__RESULTS:
                return basicSetResults(null, msgs);
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
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__ACTION:
                return getAction();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__AUDIT:
                return getAudit();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__EVENT_LISTENER:
                return getEventListener();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__TASK_HANDLER:
                return getTaskHandler();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__RESOURCE:
                return getResource();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PARAMETERS:
                return getParameters();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__RESULTS:
                return getResults();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROCESS_DEFINITION:
                return getProcessDefinition();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROCESS_DEFINITION_TYPE:
                return getProcessDefinitionType();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROCESS_ID:
                return getProcessId();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__MESSAGE_CONTENT_IN_NAME:
                return getMessageContentInName();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__MESSAGE_CONTENT_OUT_NAME:
                return getMessageContentOutName();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PERSISTENT:
                return isPersistent();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__SESSION_ID:
                return getSessionId();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__ACTION:
                getAction().clear();
                getAction().addAll((Collection<? extends ActionType1>)newValue);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__AUDIT:
                setAudit((AuditType)newValue);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__EVENT_LISTENER:
                getEventListener().clear();
                getEventListener().addAll((Collection<? extends EventListenerType>)newValue);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__TASK_HANDLER:
                getTaskHandler().clear();
                getTaskHandler().addAll((Collection<? extends TaskHandlerType>)newValue);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__RESOURCE:
                getResource().clear();
                getResource().addAll((Collection<? extends ResourceType>)newValue);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PARAMETERS:
                setParameters((ParametersType)newValue);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__RESULTS:
                setResults((ResultsType)newValue);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROCESS_DEFINITION:
                setProcessDefinition((String)newValue);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROCESS_DEFINITION_TYPE:
                setProcessDefinitionType((String)newValue);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROCESS_ID:
                setProcessId((String)newValue);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__MESSAGE_CONTENT_IN_NAME:
                setMessageContentInName((String)newValue);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__MESSAGE_CONTENT_OUT_NAME:
                setMessageContentOutName((String)newValue);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PERSISTENT:
                setPersistent((Boolean)newValue);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__SESSION_ID:
                setSessionId((String)newValue);
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
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__ACTION:
                getAction().clear();
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__AUDIT:
                setAudit((AuditType)null);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__EVENT_LISTENER:
                getEventListener().clear();
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__TASK_HANDLER:
                getTaskHandler().clear();
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__RESOURCE:
                getResource().clear();
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PARAMETERS:
                setParameters((ParametersType)null);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__RESULTS:
                setResults((ResultsType)null);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROCESS_DEFINITION:
                setProcessDefinition(PROCESS_DEFINITION_EDEFAULT);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROCESS_DEFINITION_TYPE:
                setProcessDefinitionType(PROCESS_DEFINITION_TYPE_EDEFAULT);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROCESS_ID:
                setProcessId(PROCESS_ID_EDEFAULT);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__MESSAGE_CONTENT_IN_NAME:
                setMessageContentInName(MESSAGE_CONTENT_IN_NAME_EDEFAULT);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__MESSAGE_CONTENT_OUT_NAME:
                setMessageContentOutName(MESSAGE_CONTENT_OUT_NAME_EDEFAULT);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PERSISTENT:
                setPersistent(PERSISTENT_EDEFAULT);
                return;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__SESSION_ID:
                setSessionId(SESSION_ID_EDEFAULT);
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
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__ACTION:
                return action != null && !action.isEmpty();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__AUDIT:
                return audit != null;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__EVENT_LISTENER:
                return eventListener != null && !eventListener.isEmpty();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__TASK_HANDLER:
                return taskHandler != null && !taskHandler.isEmpty();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__RESOURCE:
                return resource != null && !resource.isEmpty();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PARAMETERS:
                return parameters != null;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__RESULTS:
                return results != null;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROCESS_DEFINITION:
                return PROCESS_DEFINITION_EDEFAULT == null ? processDefinition != null : !PROCESS_DEFINITION_EDEFAULT.equals(processDefinition);
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROCESS_DEFINITION_TYPE:
                return PROCESS_DEFINITION_TYPE_EDEFAULT == null ? processDefinitionType != null : !PROCESS_DEFINITION_TYPE_EDEFAULT.equals(processDefinitionType);
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PROCESS_ID:
                return PROCESS_ID_EDEFAULT == null ? processId != null : !PROCESS_ID_EDEFAULT.equals(processId);
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__MESSAGE_CONTENT_IN_NAME:
                return MESSAGE_CONTENT_IN_NAME_EDEFAULT == null ? messageContentInName != null : !MESSAGE_CONTENT_IN_NAME_EDEFAULT.equals(messageContentInName);
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__MESSAGE_CONTENT_OUT_NAME:
                return MESSAGE_CONTENT_OUT_NAME_EDEFAULT == null ? messageContentOutName != null : !MESSAGE_CONTENT_OUT_NAME_EDEFAULT.equals(messageContentOutName);
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__PERSISTENT:
                return persistent != PERSISTENT_EDEFAULT;
            case BPMPackage.BPM_IMPLEMENTATION_TYPE__SESSION_ID:
                return SESSION_ID_EDEFAULT == null ? sessionId != null : !SESSION_ID_EDEFAULT.equals(sessionId);
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
        result.append(" (processDefinition: ");
        result.append(processDefinition);
        result.append(", processDefinitionType: ");
        result.append(processDefinitionType);
        result.append(", processId: ");
        result.append(processId);
        result.append(", messageContentInName: ");
        result.append(messageContentInName);
        result.append(", messageContentOutName: ");
        result.append(messageContentOutName);
        result.append(", persistent: ");
        result.append(persistent);
        result.append(", sessionId: ");
        result.append(sessionId);
        result.append(')');
        return result.toString();
    }

    @Override
    public EStructuralFeature getDocumentFeature() {
        return BPMPackage.eINSTANCE.getDocumentRoot_ImplementationBpm();
    }

} //BPMImplementationTypeImpl
