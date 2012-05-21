/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Handler Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getRedeliveryPolicy <em>Redelivery Policy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getDeadLetterUri <em>Dead Letter Uri</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getExecutorServiceRef <em>Executor Service Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getLevel <em>Level</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getLogName <em>Log Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getOnRedeliveryRef <em>On Redelivery Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getRedeliveryPolicyRef <em>Redelivery Policy Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getRetryWhileRef <em>Retry While Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getRollbackLoggingLevel <em>Rollback Logging Level</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getTransactionManagerRef <em>Transaction Manager Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getTransactionTemplateRef <em>Transaction Template Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#isUseOriginalMessage <em>Use Original Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getErrorHandlerDefinition()
 * @model extendedMetaData="name='errorHandlerDefinition' kind='elementOnly'"
 * @generated
 */
public interface ErrorHandlerDefinition extends IdentifiedType {
	/**
     * Returns the value of the '<em><b>Redelivery Policy</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redelivery Policy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Redelivery Policy</em>' containment reference.
     * @see #setRedeliveryPolicy(CamelRedeliveryPolicyFactoryBean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getErrorHandlerDefinition_RedeliveryPolicy()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='redeliveryPolicy' namespace='##targetNamespace'"
     * @generated
     */
	CamelRedeliveryPolicyFactoryBean getRedeliveryPolicy();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getRedeliveryPolicy <em>Redelivery Policy</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Redelivery Policy</em>' containment reference.
     * @see #getRedeliveryPolicy()
     * @generated
     */
    void setRedeliveryPolicy(CamelRedeliveryPolicyFactoryBean value);

    /**
     * Returns the value of the '<em><b>Dead Letter Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dead Letter Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Dead Letter Uri</em>' attribute.
     * @see #setDeadLetterUri(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getErrorHandlerDefinition_DeadLetterUri()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='deadLetterUri'"
     * @generated
     */
	String getDeadLetterUri();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getDeadLetterUri <em>Dead Letter Uri</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dead Letter Uri</em>' attribute.
     * @see #getDeadLetterUri()
     * @generated
     */
	void setDeadLetterUri(String value);

	/**
     * Returns the value of the '<em><b>Executor Service Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executor Service Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Executor Service Ref</em>' attribute.
     * @see #setExecutorServiceRef(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getErrorHandlerDefinition_ExecutorServiceRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='executorServiceRef'"
     * @generated
     */
	String getExecutorServiceRef();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getExecutorServiceRef <em>Executor Service Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Executor Service Ref</em>' attribute.
     * @see #getExecutorServiceRef()
     * @generated
     */
	void setExecutorServiceRef(String value);

	/**
     * Returns the value of the '<em><b>Level</b></em>' attribute.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.spring.LoggingLevel}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Level</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.spring.LoggingLevel
     * @see #isSetLevel()
     * @see #unsetLevel()
     * @see #setLevel(LoggingLevel)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getErrorHandlerDefinition_Level()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='level'"
     * @generated
     */
	LoggingLevel getLevel();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getLevel <em>Level</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Level</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.spring.LoggingLevel
     * @see #isSetLevel()
     * @see #unsetLevel()
     * @see #getLevel()
     * @generated
     */
	void setLevel(LoggingLevel value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getLevel <em>Level</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetLevel()
     * @see #getLevel()
     * @see #setLevel(LoggingLevel)
     * @generated
     */
	void unsetLevel();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getLevel <em>Level</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Level</em>' attribute is set.
     * @see #unsetLevel()
     * @see #getLevel()
     * @see #setLevel(LoggingLevel)
     * @generated
     */
	boolean isSetLevel();

	/**
     * Returns the value of the '<em><b>Log Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Log Name</em>' attribute.
     * @see #setLogName(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getErrorHandlerDefinition_LogName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='logName'"
     * @generated
     */
	String getLogName();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getLogName <em>Log Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Log Name</em>' attribute.
     * @see #getLogName()
     * @generated
     */
	void setLogName(String value);

	/**
     * Returns the value of the '<em><b>On Redelivery Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Redelivery Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>On Redelivery Ref</em>' attribute.
     * @see #setOnRedeliveryRef(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getErrorHandlerDefinition_OnRedeliveryRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='onRedeliveryRef'"
     * @generated
     */
	String getOnRedeliveryRef();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getOnRedeliveryRef <em>On Redelivery Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>On Redelivery Ref</em>' attribute.
     * @see #getOnRedeliveryRef()
     * @generated
     */
	void setOnRedeliveryRef(String value);

	/**
     * Returns the value of the '<em><b>Redelivery Policy Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redelivery Policy Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Redelivery Policy Ref</em>' attribute.
     * @see #setRedeliveryPolicyRef(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getErrorHandlerDefinition_RedeliveryPolicyRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='redeliveryPolicyRef'"
     * @generated
     */
	String getRedeliveryPolicyRef();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getRedeliveryPolicyRef <em>Redelivery Policy Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Redelivery Policy Ref</em>' attribute.
     * @see #getRedeliveryPolicyRef()
     * @generated
     */
	void setRedeliveryPolicyRef(String value);

	/**
     * Returns the value of the '<em><b>Retry While Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retry While Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Retry While Ref</em>' attribute.
     * @see #setRetryWhileRef(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getErrorHandlerDefinition_RetryWhileRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='retryWhileRef'"
     * @generated
     */
	String getRetryWhileRef();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getRetryWhileRef <em>Retry While Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Retry While Ref</em>' attribute.
     * @see #getRetryWhileRef()
     * @generated
     */
	void setRetryWhileRef(String value);

	/**
     * Returns the value of the '<em><b>Rollback Logging Level</b></em>' attribute.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.spring.LoggingLevel}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rollback Logging Level</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rollback Logging Level</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.spring.LoggingLevel
     * @see #isSetRollbackLoggingLevel()
     * @see #unsetRollbackLoggingLevel()
     * @see #setRollbackLoggingLevel(LoggingLevel)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getErrorHandlerDefinition_RollbackLoggingLevel()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='rollbackLoggingLevel'"
     * @generated
     */
    LoggingLevel getRollbackLoggingLevel();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getRollbackLoggingLevel <em>Rollback Logging Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rollback Logging Level</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.spring.LoggingLevel
     * @see #isSetRollbackLoggingLevel()
     * @see #unsetRollbackLoggingLevel()
     * @see #getRollbackLoggingLevel()
     * @generated
     */
    void setRollbackLoggingLevel(LoggingLevel value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getRollbackLoggingLevel <em>Rollback Logging Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRollbackLoggingLevel()
     * @see #getRollbackLoggingLevel()
     * @see #setRollbackLoggingLevel(LoggingLevel)
     * @generated
     */
    void unsetRollbackLoggingLevel();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getRollbackLoggingLevel <em>Rollback Logging Level</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rollback Logging Level</em>' attribute is set.
     * @see #unsetRollbackLoggingLevel()
     * @see #getRollbackLoggingLevel()
     * @see #setRollbackLoggingLevel(LoggingLevel)
     * @generated
     */
    boolean isSetRollbackLoggingLevel();

    /**
     * Returns the value of the '<em><b>Transaction Manager Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Manager Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Transaction Manager Ref</em>' attribute.
     * @see #setTransactionManagerRef(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getErrorHandlerDefinition_TransactionManagerRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='transactionManagerRef'"
     * @generated
     */
	String getTransactionManagerRef();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getTransactionManagerRef <em>Transaction Manager Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transaction Manager Ref</em>' attribute.
     * @see #getTransactionManagerRef()
     * @generated
     */
	void setTransactionManagerRef(String value);

	/**
     * Returns the value of the '<em><b>Transaction Template Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Template Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Transaction Template Ref</em>' attribute.
     * @see #setTransactionTemplateRef(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getErrorHandlerDefinition_TransactionTemplateRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='transactionTemplateRef'"
     * @generated
     */
	String getTransactionTemplateRef();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getTransactionTemplateRef <em>Transaction Template Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transaction Template Ref</em>' attribute.
     * @see #getTransactionTemplateRef()
     * @generated
     */
	void setTransactionTemplateRef(String value);

	/**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerType
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(ErrorHandlerType)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getErrorHandlerDefinition_Type()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
	ErrorHandlerType getType();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerType
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
	void setType(ErrorHandlerType value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(ErrorHandlerType)
     * @generated
     */
	void unsetType();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(ErrorHandlerType)
     * @generated
     */
	boolean isSetType();

	/**
     * Returns the value of the '<em><b>Use Original Message</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Original Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Use Original Message</em>' attribute.
     * @see #isSetUseOriginalMessage()
     * @see #unsetUseOriginalMessage()
     * @see #setUseOriginalMessage(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getErrorHandlerDefinition_UseOriginalMessage()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='useOriginalMessage'"
     * @generated
     */
	boolean isUseOriginalMessage();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#isUseOriginalMessage <em>Use Original Message</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Original Message</em>' attribute.
     * @see #isSetUseOriginalMessage()
     * @see #unsetUseOriginalMessage()
     * @see #isUseOriginalMessage()
     * @generated
     */
	void setUseOriginalMessage(boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#isUseOriginalMessage <em>Use Original Message</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetUseOriginalMessage()
     * @see #isUseOriginalMessage()
     * @see #setUseOriginalMessage(boolean)
     * @generated
     */
	void unsetUseOriginalMessage();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ErrorHandlerDefinition#isUseOriginalMessage <em>Use Original Message</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Use Original Message</em>' attribute is set.
     * @see #unsetUseOriginalMessage()
     * @see #isUseOriginalMessage()
     * @see #setUseOriginalMessage(boolean)
     * @generated
     */
	boolean isSetUseOriginalMessage();

} // ErrorHandlerDefinition
