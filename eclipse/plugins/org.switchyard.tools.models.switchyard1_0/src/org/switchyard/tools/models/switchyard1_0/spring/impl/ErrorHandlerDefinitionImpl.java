/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerType;
import org.switchyard.tools.models.switchyard1_0.spring.LoggingLevel;
import org.switchyard.tools.models.switchyard1_0.spring.RedeliveryPolicyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Handler Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ErrorHandlerDefinitionImpl#getRedeliveryPolicy <em>Redelivery Policy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ErrorHandlerDefinitionImpl#getDeadLetterUri <em>Dead Letter Uri</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ErrorHandlerDefinitionImpl#getExecutorServiceRef <em>Executor Service Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ErrorHandlerDefinitionImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ErrorHandlerDefinitionImpl#getLogName <em>Log Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ErrorHandlerDefinitionImpl#getOnRedeliveryRef <em>On Redelivery Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ErrorHandlerDefinitionImpl#getRedeliveryPolicyRef <em>Redelivery Policy Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ErrorHandlerDefinitionImpl#getRetryWhileRef <em>Retry While Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ErrorHandlerDefinitionImpl#getTransactionManagerRef <em>Transaction Manager Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ErrorHandlerDefinitionImpl#getTransactionTemplateRef <em>Transaction Template Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ErrorHandlerDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ErrorHandlerDefinitionImpl#isUseOriginalMessage <em>Use Original Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorHandlerDefinitionImpl extends IdentifiedTypeImpl implements ErrorHandlerDefinition {
	/**
	 * The cached value of the '{@link #getRedeliveryPolicy() <em>Redelivery Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedeliveryPolicy()
	 * @generated
	 * @ordered
	 */
	protected RedeliveryPolicyDefinition redeliveryPolicy;

	/**
	 * The default value of the '{@link #getDeadLetterUri() <em>Dead Letter Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadLetterUri()
	 * @generated
	 * @ordered
	 */
	protected static final String DEAD_LETTER_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeadLetterUri() <em>Dead Letter Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadLetterUri()
	 * @generated
	 * @ordered
	 */
	protected String deadLetterUri = DEAD_LETTER_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutorServiceRef() <em>Executor Service Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutorServiceRef()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTOR_SERVICE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutorServiceRef() <em>Executor Service Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutorServiceRef()
	 * @generated
	 * @ordered
	 */
	protected String executorServiceRef = EXECUTOR_SERVICE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final LoggingLevel LEVEL_EDEFAULT = LoggingLevel.DEBUG;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected LoggingLevel level = LEVEL_EDEFAULT;

	/**
	 * This is true if the Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean levelESet;

	/**
	 * The default value of the '{@link #getLogName() <em>Log Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogName() <em>Log Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogName()
	 * @generated
	 * @ordered
	 */
	protected String logName = LOG_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnRedeliveryRef() <em>On Redelivery Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnRedeliveryRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_REDELIVERY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnRedeliveryRef() <em>On Redelivery Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnRedeliveryRef()
	 * @generated
	 * @ordered
	 */
	protected String onRedeliveryRef = ON_REDELIVERY_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedeliveryPolicyRef() <em>Redelivery Policy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedeliveryPolicyRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REDELIVERY_POLICY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedeliveryPolicyRef() <em>Redelivery Policy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedeliveryPolicyRef()
	 * @generated
	 * @ordered
	 */
	protected String redeliveryPolicyRef = REDELIVERY_POLICY_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetryWhileRef() <em>Retry While Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryWhileRef()
	 * @generated
	 * @ordered
	 */
	protected static final String RETRY_WHILE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetryWhileRef() <em>Retry While Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryWhileRef()
	 * @generated
	 * @ordered
	 */
	protected String retryWhileRef = RETRY_WHILE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionManagerRef() <em>Transaction Manager Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionManagerRef()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSACTION_MANAGER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionManagerRef() <em>Transaction Manager Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionManagerRef()
	 * @generated
	 * @ordered
	 */
	protected String transactionManagerRef = TRANSACTION_MANAGER_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionTemplateRef() <em>Transaction Template Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionTemplateRef()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSACTION_TEMPLATE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionTemplateRef() <em>Transaction Template Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionTemplateRef()
	 * @generated
	 * @ordered
	 */
	protected String transactionTemplateRef = TRANSACTION_TEMPLATE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ErrorHandlerType TYPE_EDEFAULT = ErrorHandlerType.DEFAULT_ERROR_HANDLER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ErrorHandlerType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #isUseOriginalMessage() <em>Use Original Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseOriginalMessage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_ORIGINAL_MESSAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseOriginalMessage() <em>Use Original Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseOriginalMessage()
	 * @generated
	 * @ordered
	 */
	protected boolean useOriginalMessage = USE_ORIGINAL_MESSAGE_EDEFAULT;

	/**
	 * This is true if the Use Original Message attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useOriginalMessageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorHandlerDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.eINSTANCE.getErrorHandlerDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedeliveryPolicyDefinition getRedeliveryPolicy() {
		return redeliveryPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRedeliveryPolicy(RedeliveryPolicyDefinition newRedeliveryPolicy, NotificationChain msgs) {
		RedeliveryPolicyDefinition oldRedeliveryPolicy = redeliveryPolicy;
		redeliveryPolicy = newRedeliveryPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY, oldRedeliveryPolicy, newRedeliveryPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedeliveryPolicy(RedeliveryPolicyDefinition newRedeliveryPolicy) {
		if (newRedeliveryPolicy != redeliveryPolicy) {
			NotificationChain msgs = null;
			if (redeliveryPolicy != null)
				msgs = ((InternalEObject)redeliveryPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY, null, msgs);
			if (newRedeliveryPolicy != null)
				msgs = ((InternalEObject)newRedeliveryPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY, null, msgs);
			msgs = basicSetRedeliveryPolicy(newRedeliveryPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY, newRedeliveryPolicy, newRedeliveryPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeadLetterUri() {
		return deadLetterUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadLetterUri(String newDeadLetterUri) {
		String oldDeadLetterUri = deadLetterUri;
		deadLetterUri = newDeadLetterUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ERROR_HANDLER_DEFINITION__DEAD_LETTER_URI, oldDeadLetterUri, deadLetterUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExecutorServiceRef() {
		return executorServiceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutorServiceRef(String newExecutorServiceRef) {
		String oldExecutorServiceRef = executorServiceRef;
		executorServiceRef = newExecutorServiceRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ERROR_HANDLER_DEFINITION__EXECUTOR_SERVICE_REF, oldExecutorServiceRef, executorServiceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoggingLevel getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(LoggingLevel newLevel) {
		LoggingLevel oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		boolean oldLevelESet = levelESet;
		levelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ERROR_HANDLER_DEFINITION__LEVEL, oldLevel, level, !oldLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLevel() {
		LoggingLevel oldLevel = level;
		boolean oldLevelESet = levelESet;
		level = LEVEL_EDEFAULT;
		levelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.ERROR_HANDLER_DEFINITION__LEVEL, oldLevel, LEVEL_EDEFAULT, oldLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLevel() {
		return levelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogName() {
		return logName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogName(String newLogName) {
		String oldLogName = logName;
		logName = newLogName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ERROR_HANDLER_DEFINITION__LOG_NAME, oldLogName, logName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnRedeliveryRef() {
		return onRedeliveryRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnRedeliveryRef(String newOnRedeliveryRef) {
		String oldOnRedeliveryRef = onRedeliveryRef;
		onRedeliveryRef = newOnRedeliveryRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ERROR_HANDLER_DEFINITION__ON_REDELIVERY_REF, oldOnRedeliveryRef, onRedeliveryRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedeliveryPolicyRef() {
		return redeliveryPolicyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedeliveryPolicyRef(String newRedeliveryPolicyRef) {
		String oldRedeliveryPolicyRef = redeliveryPolicyRef;
		redeliveryPolicyRef = newRedeliveryPolicyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY_REF, oldRedeliveryPolicyRef, redeliveryPolicyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRetryWhileRef() {
		return retryWhileRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetryWhileRef(String newRetryWhileRef) {
		String oldRetryWhileRef = retryWhileRef;
		retryWhileRef = newRetryWhileRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ERROR_HANDLER_DEFINITION__RETRY_WHILE_REF, oldRetryWhileRef, retryWhileRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransactionManagerRef() {
		return transactionManagerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionManagerRef(String newTransactionManagerRef) {
		String oldTransactionManagerRef = transactionManagerRef;
		transactionManagerRef = newTransactionManagerRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ERROR_HANDLER_DEFINITION__TRANSACTION_MANAGER_REF, oldTransactionManagerRef, transactionManagerRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransactionTemplateRef() {
		return transactionTemplateRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionTemplateRef(String newTransactionTemplateRef) {
		String oldTransactionTemplateRef = transactionTemplateRef;
		transactionTemplateRef = newTransactionTemplateRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ERROR_HANDLER_DEFINITION__TRANSACTION_TEMPLATE_REF, oldTransactionTemplateRef, transactionTemplateRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorHandlerType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ErrorHandlerType newType) {
		ErrorHandlerType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ERROR_HANDLER_DEFINITION__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		ErrorHandlerType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.ERROR_HANDLER_DEFINITION__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseOriginalMessage() {
		return useOriginalMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseOriginalMessage(boolean newUseOriginalMessage) {
		boolean oldUseOriginalMessage = useOriginalMessage;
		useOriginalMessage = newUseOriginalMessage;
		boolean oldUseOriginalMessageESet = useOriginalMessageESet;
		useOriginalMessageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ERROR_HANDLER_DEFINITION__USE_ORIGINAL_MESSAGE, oldUseOriginalMessage, useOriginalMessage, !oldUseOriginalMessageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseOriginalMessage() {
		boolean oldUseOriginalMessage = useOriginalMessage;
		boolean oldUseOriginalMessageESet = useOriginalMessageESet;
		useOriginalMessage = USE_ORIGINAL_MESSAGE_EDEFAULT;
		useOriginalMessageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.ERROR_HANDLER_DEFINITION__USE_ORIGINAL_MESSAGE, oldUseOriginalMessage, USE_ORIGINAL_MESSAGE_EDEFAULT, oldUseOriginalMessageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseOriginalMessage() {
		return useOriginalMessageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpringPackage.ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY:
				return basicSetRedeliveryPolicy(null, msgs);
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
			case SpringPackage.ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY:
				return getRedeliveryPolicy();
			case SpringPackage.ERROR_HANDLER_DEFINITION__DEAD_LETTER_URI:
				return getDeadLetterUri();
			case SpringPackage.ERROR_HANDLER_DEFINITION__EXECUTOR_SERVICE_REF:
				return getExecutorServiceRef();
			case SpringPackage.ERROR_HANDLER_DEFINITION__LEVEL:
				return getLevel();
			case SpringPackage.ERROR_HANDLER_DEFINITION__LOG_NAME:
				return getLogName();
			case SpringPackage.ERROR_HANDLER_DEFINITION__ON_REDELIVERY_REF:
				return getOnRedeliveryRef();
			case SpringPackage.ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY_REF:
				return getRedeliveryPolicyRef();
			case SpringPackage.ERROR_HANDLER_DEFINITION__RETRY_WHILE_REF:
				return getRetryWhileRef();
			case SpringPackage.ERROR_HANDLER_DEFINITION__TRANSACTION_MANAGER_REF:
				return getTransactionManagerRef();
			case SpringPackage.ERROR_HANDLER_DEFINITION__TRANSACTION_TEMPLATE_REF:
				return getTransactionTemplateRef();
			case SpringPackage.ERROR_HANDLER_DEFINITION__TYPE:
				return getType();
			case SpringPackage.ERROR_HANDLER_DEFINITION__USE_ORIGINAL_MESSAGE:
				return isUseOriginalMessage();
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
			case SpringPackage.ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY:
				setRedeliveryPolicy((RedeliveryPolicyDefinition)newValue);
				return;
			case SpringPackage.ERROR_HANDLER_DEFINITION__DEAD_LETTER_URI:
				setDeadLetterUri((String)newValue);
				return;
			case SpringPackage.ERROR_HANDLER_DEFINITION__EXECUTOR_SERVICE_REF:
				setExecutorServiceRef((String)newValue);
				return;
			case SpringPackage.ERROR_HANDLER_DEFINITION__LEVEL:
				setLevel((LoggingLevel)newValue);
				return;
			case SpringPackage.ERROR_HANDLER_DEFINITION__LOG_NAME:
				setLogName((String)newValue);
				return;
			case SpringPackage.ERROR_HANDLER_DEFINITION__ON_REDELIVERY_REF:
				setOnRedeliveryRef((String)newValue);
				return;
			case SpringPackage.ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY_REF:
				setRedeliveryPolicyRef((String)newValue);
				return;
			case SpringPackage.ERROR_HANDLER_DEFINITION__RETRY_WHILE_REF:
				setRetryWhileRef((String)newValue);
				return;
			case SpringPackage.ERROR_HANDLER_DEFINITION__TRANSACTION_MANAGER_REF:
				setTransactionManagerRef((String)newValue);
				return;
			case SpringPackage.ERROR_HANDLER_DEFINITION__TRANSACTION_TEMPLATE_REF:
				setTransactionTemplateRef((String)newValue);
				return;
			case SpringPackage.ERROR_HANDLER_DEFINITION__TYPE:
				setType((ErrorHandlerType)newValue);
				return;
			case SpringPackage.ERROR_HANDLER_DEFINITION__USE_ORIGINAL_MESSAGE:
				setUseOriginalMessage((Boolean)newValue);
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
			case SpringPackage.ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY:
				setRedeliveryPolicy((RedeliveryPolicyDefinition)null);
				return;
			case SpringPackage.ERROR_HANDLER_DEFINITION__DEAD_LETTER_URI:
				setDeadLetterUri(DEAD_LETTER_URI_EDEFAULT);
				return;
			case SpringPackage.ERROR_HANDLER_DEFINITION__EXECUTOR_SERVICE_REF:
				setExecutorServiceRef(EXECUTOR_SERVICE_REF_EDEFAULT);
				return;
			case SpringPackage.ERROR_HANDLER_DEFINITION__LEVEL:
				unsetLevel();
				return;
			case SpringPackage.ERROR_HANDLER_DEFINITION__LOG_NAME:
				setLogName(LOG_NAME_EDEFAULT);
				return;
			case SpringPackage.ERROR_HANDLER_DEFINITION__ON_REDELIVERY_REF:
				setOnRedeliveryRef(ON_REDELIVERY_REF_EDEFAULT);
				return;
			case SpringPackage.ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY_REF:
				setRedeliveryPolicyRef(REDELIVERY_POLICY_REF_EDEFAULT);
				return;
			case SpringPackage.ERROR_HANDLER_DEFINITION__RETRY_WHILE_REF:
				setRetryWhileRef(RETRY_WHILE_REF_EDEFAULT);
				return;
			case SpringPackage.ERROR_HANDLER_DEFINITION__TRANSACTION_MANAGER_REF:
				setTransactionManagerRef(TRANSACTION_MANAGER_REF_EDEFAULT);
				return;
			case SpringPackage.ERROR_HANDLER_DEFINITION__TRANSACTION_TEMPLATE_REF:
				setTransactionTemplateRef(TRANSACTION_TEMPLATE_REF_EDEFAULT);
				return;
			case SpringPackage.ERROR_HANDLER_DEFINITION__TYPE:
				unsetType();
				return;
			case SpringPackage.ERROR_HANDLER_DEFINITION__USE_ORIGINAL_MESSAGE:
				unsetUseOriginalMessage();
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
			case SpringPackage.ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY:
				return redeliveryPolicy != null;
			case SpringPackage.ERROR_HANDLER_DEFINITION__DEAD_LETTER_URI:
				return DEAD_LETTER_URI_EDEFAULT == null ? deadLetterUri != null : !DEAD_LETTER_URI_EDEFAULT.equals(deadLetterUri);
			case SpringPackage.ERROR_HANDLER_DEFINITION__EXECUTOR_SERVICE_REF:
				return EXECUTOR_SERVICE_REF_EDEFAULT == null ? executorServiceRef != null : !EXECUTOR_SERVICE_REF_EDEFAULT.equals(executorServiceRef);
			case SpringPackage.ERROR_HANDLER_DEFINITION__LEVEL:
				return isSetLevel();
			case SpringPackage.ERROR_HANDLER_DEFINITION__LOG_NAME:
				return LOG_NAME_EDEFAULT == null ? logName != null : !LOG_NAME_EDEFAULT.equals(logName);
			case SpringPackage.ERROR_HANDLER_DEFINITION__ON_REDELIVERY_REF:
				return ON_REDELIVERY_REF_EDEFAULT == null ? onRedeliveryRef != null : !ON_REDELIVERY_REF_EDEFAULT.equals(onRedeliveryRef);
			case SpringPackage.ERROR_HANDLER_DEFINITION__REDELIVERY_POLICY_REF:
				return REDELIVERY_POLICY_REF_EDEFAULT == null ? redeliveryPolicyRef != null : !REDELIVERY_POLICY_REF_EDEFAULT.equals(redeliveryPolicyRef);
			case SpringPackage.ERROR_HANDLER_DEFINITION__RETRY_WHILE_REF:
				return RETRY_WHILE_REF_EDEFAULT == null ? retryWhileRef != null : !RETRY_WHILE_REF_EDEFAULT.equals(retryWhileRef);
			case SpringPackage.ERROR_HANDLER_DEFINITION__TRANSACTION_MANAGER_REF:
				return TRANSACTION_MANAGER_REF_EDEFAULT == null ? transactionManagerRef != null : !TRANSACTION_MANAGER_REF_EDEFAULT.equals(transactionManagerRef);
			case SpringPackage.ERROR_HANDLER_DEFINITION__TRANSACTION_TEMPLATE_REF:
				return TRANSACTION_TEMPLATE_REF_EDEFAULT == null ? transactionTemplateRef != null : !TRANSACTION_TEMPLATE_REF_EDEFAULT.equals(transactionTemplateRef);
			case SpringPackage.ERROR_HANDLER_DEFINITION__TYPE:
				return isSetType();
			case SpringPackage.ERROR_HANDLER_DEFINITION__USE_ORIGINAL_MESSAGE:
				return isSetUseOriginalMessage();
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
		result.append(" (deadLetterUri: ");
		result.append(deadLetterUri);
		result.append(", executorServiceRef: ");
		result.append(executorServiceRef);
		result.append(", level: ");
		if (levelESet) result.append(level); else result.append("<unset>");
		result.append(", logName: ");
		result.append(logName);
		result.append(", onRedeliveryRef: ");
		result.append(onRedeliveryRef);
		result.append(", redeliveryPolicyRef: ");
		result.append(redeliveryPolicyRef);
		result.append(", retryWhileRef: ");
		result.append(retryWhileRef);
		result.append(", transactionManagerRef: ");
		result.append(transactionManagerRef);
		result.append(", transactionTemplateRef: ");
		result.append(transactionTemplateRef);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", useOriginalMessage: ");
		if (useOriginalMessageESet) result.append(useOriginalMessage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ErrorHandlerDefinitionImpl
