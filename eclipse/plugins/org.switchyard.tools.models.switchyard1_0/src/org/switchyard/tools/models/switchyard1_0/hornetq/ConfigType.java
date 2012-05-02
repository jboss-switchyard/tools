/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.hornetq;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getAckBatchSize <em>Ack Batch Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isAutoGroup <em>Auto Group</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isBlockOnAcknowledge <em>Block On Acknowledge</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isBlockOnDurableSend <em>Block On Durable Send</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isBlockOnNonDurableSend <em>Block On Non Durable Send</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isCacheLargeMessagesOnConsumer <em>Cache Large Messages On Consumer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getCallTimeout <em>Call Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getClientFailureCheckPeriod <em>Client Failure Check Period</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isCompressLargeMessages <em>Compress Large Messages</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConnectionLoadBalancingPolicyClassName <em>Connection Load Balancing Policy Class Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConnectionTTL <em>Connection TTL</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConfirmationWindowSize <em>Confirmation Window Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConsumerMaxRate <em>Consumer Max Rate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConsumerWindowSize <em>Consumer Window Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isDisableFinalizeCheck <em>Disable Finalize Check</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getDiscoveryGroup <em>Discovery Group</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isFailoverOnInitialConnection <em>Failover On Initial Connection</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getGroupID <em>Group ID</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getInitialMessagePacketSize <em>Initial Message Packet Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getInitialReconnectAttempts <em>Initial Reconnect Attempts</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getMaxRetryInterval <em>Max Retry Interval</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getMinLargeMessageSize <em>Min Large Message Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isPreAcknowledge <em>Pre Acknowledge</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getProducerMaxRate <em>Producer Max Rate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getProducerWindowSize <em>Producer Window Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getQueue <em>Queue</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getReconnectAttempts <em>Reconnect Attempts</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getRetryInterval <em>Retry Interval</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getRetryIntervalMultiplier <em>Retry Interval Multiplier</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getScheduledThreadPoolMaxSize <em>Scheduled Thread Pool Max Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getThreadPoolMaxSize <em>Thread Pool Max Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isUseGlobalPools <em>Use Global Pools</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isUseHA <em>Use HA</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isXaSession <em>Xa Session</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType()
 * @model extendedMetaData="name='ConfigType' kind='elementOnly'"
 * @generated
 */
public interface ConfigType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ack Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ack Batch Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ack Batch Size</em>' attribute.
	 * @see #isSetAckBatchSize()
	 * @see #unsetAckBatchSize()
	 * @see #setAckBatchSize(long)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_AckBatchSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='ackBatchSize' namespace='##targetNamespace'"
	 * @generated
	 */
	long getAckBatchSize();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getAckBatchSize <em>Ack Batch Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ack Batch Size</em>' attribute.
	 * @see #isSetAckBatchSize()
	 * @see #unsetAckBatchSize()
	 * @see #getAckBatchSize()
	 * @generated
	 */
	void setAckBatchSize(long value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getAckBatchSize <em>Ack Batch Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAckBatchSize()
	 * @see #getAckBatchSize()
	 * @see #setAckBatchSize(long)
	 * @generated
	 */
	void unsetAckBatchSize();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getAckBatchSize <em>Ack Batch Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ack Batch Size</em>' attribute is set.
	 * @see #unsetAckBatchSize()
	 * @see #getAckBatchSize()
	 * @see #setAckBatchSize(long)
	 * @generated
	 */
	boolean isSetAckBatchSize();

	/**
	 * Returns the value of the '<em><b>Auto Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Group</em>' attribute.
	 * @see #isSetAutoGroup()
	 * @see #unsetAutoGroup()
	 * @see #setAutoGroup(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_AutoGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='autoGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAutoGroup();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isAutoGroup <em>Auto Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Group</em>' attribute.
	 * @see #isSetAutoGroup()
	 * @see #unsetAutoGroup()
	 * @see #isAutoGroup()
	 * @generated
	 */
	void setAutoGroup(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isAutoGroup <em>Auto Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutoGroup()
	 * @see #isAutoGroup()
	 * @see #setAutoGroup(boolean)
	 * @generated
	 */
	void unsetAutoGroup();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isAutoGroup <em>Auto Group</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Auto Group</em>' attribute is set.
	 * @see #unsetAutoGroup()
	 * @see #isAutoGroup()
	 * @see #setAutoGroup(boolean)
	 * @generated
	 */
	boolean isSetAutoGroup();

	/**
	 * Returns the value of the '<em><b>Block On Acknowledge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block On Acknowledge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block On Acknowledge</em>' attribute.
	 * @see #isSetBlockOnAcknowledge()
	 * @see #unsetBlockOnAcknowledge()
	 * @see #setBlockOnAcknowledge(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_BlockOnAcknowledge()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='blockOnAcknowledge' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBlockOnAcknowledge();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isBlockOnAcknowledge <em>Block On Acknowledge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block On Acknowledge</em>' attribute.
	 * @see #isSetBlockOnAcknowledge()
	 * @see #unsetBlockOnAcknowledge()
	 * @see #isBlockOnAcknowledge()
	 * @generated
	 */
	void setBlockOnAcknowledge(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isBlockOnAcknowledge <em>Block On Acknowledge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBlockOnAcknowledge()
	 * @see #isBlockOnAcknowledge()
	 * @see #setBlockOnAcknowledge(boolean)
	 * @generated
	 */
	void unsetBlockOnAcknowledge();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isBlockOnAcknowledge <em>Block On Acknowledge</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Block On Acknowledge</em>' attribute is set.
	 * @see #unsetBlockOnAcknowledge()
	 * @see #isBlockOnAcknowledge()
	 * @see #setBlockOnAcknowledge(boolean)
	 * @generated
	 */
	boolean isSetBlockOnAcknowledge();

	/**
	 * Returns the value of the '<em><b>Block On Durable Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block On Durable Send</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block On Durable Send</em>' attribute.
	 * @see #isSetBlockOnDurableSend()
	 * @see #unsetBlockOnDurableSend()
	 * @see #setBlockOnDurableSend(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_BlockOnDurableSend()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='blockOnDurableSend' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBlockOnDurableSend();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isBlockOnDurableSend <em>Block On Durable Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block On Durable Send</em>' attribute.
	 * @see #isSetBlockOnDurableSend()
	 * @see #unsetBlockOnDurableSend()
	 * @see #isBlockOnDurableSend()
	 * @generated
	 */
	void setBlockOnDurableSend(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isBlockOnDurableSend <em>Block On Durable Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBlockOnDurableSend()
	 * @see #isBlockOnDurableSend()
	 * @see #setBlockOnDurableSend(boolean)
	 * @generated
	 */
	void unsetBlockOnDurableSend();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isBlockOnDurableSend <em>Block On Durable Send</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Block On Durable Send</em>' attribute is set.
	 * @see #unsetBlockOnDurableSend()
	 * @see #isBlockOnDurableSend()
	 * @see #setBlockOnDurableSend(boolean)
	 * @generated
	 */
	boolean isSetBlockOnDurableSend();

	/**
	 * Returns the value of the '<em><b>Block On Non Durable Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block On Non Durable Send</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block On Non Durable Send</em>' attribute.
	 * @see #isSetBlockOnNonDurableSend()
	 * @see #unsetBlockOnNonDurableSend()
	 * @see #setBlockOnNonDurableSend(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_BlockOnNonDurableSend()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='blockOnNonDurableSend' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBlockOnNonDurableSend();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isBlockOnNonDurableSend <em>Block On Non Durable Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block On Non Durable Send</em>' attribute.
	 * @see #isSetBlockOnNonDurableSend()
	 * @see #unsetBlockOnNonDurableSend()
	 * @see #isBlockOnNonDurableSend()
	 * @generated
	 */
	void setBlockOnNonDurableSend(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isBlockOnNonDurableSend <em>Block On Non Durable Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBlockOnNonDurableSend()
	 * @see #isBlockOnNonDurableSend()
	 * @see #setBlockOnNonDurableSend(boolean)
	 * @generated
	 */
	void unsetBlockOnNonDurableSend();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isBlockOnNonDurableSend <em>Block On Non Durable Send</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Block On Non Durable Send</em>' attribute is set.
	 * @see #unsetBlockOnNonDurableSend()
	 * @see #isBlockOnNonDurableSend()
	 * @see #setBlockOnNonDurableSend(boolean)
	 * @generated
	 */
	boolean isSetBlockOnNonDurableSend();

	/**
	 * Returns the value of the '<em><b>Cache Large Messages On Consumer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache Large Messages On Consumer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Large Messages On Consumer</em>' attribute.
	 * @see #isSetCacheLargeMessagesOnConsumer()
	 * @see #unsetCacheLargeMessagesOnConsumer()
	 * @see #setCacheLargeMessagesOnConsumer(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_CacheLargeMessagesOnConsumer()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='cacheLargeMessagesOnConsumer' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCacheLargeMessagesOnConsumer();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isCacheLargeMessagesOnConsumer <em>Cache Large Messages On Consumer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Large Messages On Consumer</em>' attribute.
	 * @see #isSetCacheLargeMessagesOnConsumer()
	 * @see #unsetCacheLargeMessagesOnConsumer()
	 * @see #isCacheLargeMessagesOnConsumer()
	 * @generated
	 */
	void setCacheLargeMessagesOnConsumer(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isCacheLargeMessagesOnConsumer <em>Cache Large Messages On Consumer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCacheLargeMessagesOnConsumer()
	 * @see #isCacheLargeMessagesOnConsumer()
	 * @see #setCacheLargeMessagesOnConsumer(boolean)
	 * @generated
	 */
	void unsetCacheLargeMessagesOnConsumer();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isCacheLargeMessagesOnConsumer <em>Cache Large Messages On Consumer</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cache Large Messages On Consumer</em>' attribute is set.
	 * @see #unsetCacheLargeMessagesOnConsumer()
	 * @see #isCacheLargeMessagesOnConsumer()
	 * @see #setCacheLargeMessagesOnConsumer(boolean)
	 * @generated
	 */
	boolean isSetCacheLargeMessagesOnConsumer();

	/**
	 * Returns the value of the '<em><b>Call Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Timeout</em>' attribute.
	 * @see #isSetCallTimeout()
	 * @see #unsetCallTimeout()
	 * @see #setCallTimeout(long)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_CallTimeout()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='callTimeout' namespace='##targetNamespace'"
	 * @generated
	 */
	long getCallTimeout();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getCallTimeout <em>Call Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Timeout</em>' attribute.
	 * @see #isSetCallTimeout()
	 * @see #unsetCallTimeout()
	 * @see #getCallTimeout()
	 * @generated
	 */
	void setCallTimeout(long value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getCallTimeout <em>Call Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCallTimeout()
	 * @see #getCallTimeout()
	 * @see #setCallTimeout(long)
	 * @generated
	 */
	void unsetCallTimeout();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getCallTimeout <em>Call Timeout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Call Timeout</em>' attribute is set.
	 * @see #unsetCallTimeout()
	 * @see #getCallTimeout()
	 * @see #setCallTimeout(long)
	 * @generated
	 */
	boolean isSetCallTimeout();

	/**
	 * Returns the value of the '<em><b>Client Failure Check Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Failure Check Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Failure Check Period</em>' attribute.
	 * @see #isSetClientFailureCheckPeriod()
	 * @see #unsetClientFailureCheckPeriod()
	 * @see #setClientFailureCheckPeriod(long)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_ClientFailureCheckPeriod()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='clientFailureCheckPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	long getClientFailureCheckPeriod();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getClientFailureCheckPeriod <em>Client Failure Check Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Failure Check Period</em>' attribute.
	 * @see #isSetClientFailureCheckPeriod()
	 * @see #unsetClientFailureCheckPeriod()
	 * @see #getClientFailureCheckPeriod()
	 * @generated
	 */
	void setClientFailureCheckPeriod(long value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getClientFailureCheckPeriod <em>Client Failure Check Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClientFailureCheckPeriod()
	 * @see #getClientFailureCheckPeriod()
	 * @see #setClientFailureCheckPeriod(long)
	 * @generated
	 */
	void unsetClientFailureCheckPeriod();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getClientFailureCheckPeriod <em>Client Failure Check Period</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Client Failure Check Period</em>' attribute is set.
	 * @see #unsetClientFailureCheckPeriod()
	 * @see #getClientFailureCheckPeriod()
	 * @see #setClientFailureCheckPeriod(long)
	 * @generated
	 */
	boolean isSetClientFailureCheckPeriod();

	/**
	 * Returns the value of the '<em><b>Compress Large Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compress Large Messages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compress Large Messages</em>' attribute.
	 * @see #isSetCompressLargeMessages()
	 * @see #unsetCompressLargeMessages()
	 * @see #setCompressLargeMessages(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_CompressLargeMessages()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='compressLargeMessages' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCompressLargeMessages();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isCompressLargeMessages <em>Compress Large Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compress Large Messages</em>' attribute.
	 * @see #isSetCompressLargeMessages()
	 * @see #unsetCompressLargeMessages()
	 * @see #isCompressLargeMessages()
	 * @generated
	 */
	void setCompressLargeMessages(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isCompressLargeMessages <em>Compress Large Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompressLargeMessages()
	 * @see #isCompressLargeMessages()
	 * @see #setCompressLargeMessages(boolean)
	 * @generated
	 */
	void unsetCompressLargeMessages();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isCompressLargeMessages <em>Compress Large Messages</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compress Large Messages</em>' attribute is set.
	 * @see #unsetCompressLargeMessages()
	 * @see #isCompressLargeMessages()
	 * @see #setCompressLargeMessages(boolean)
	 * @generated
	 */
	boolean isSetCompressLargeMessages();

	/**
	 * Returns the value of the '<em><b>Connection Load Balancing Policy Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Load Balancing Policy Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Load Balancing Policy Class Name</em>' attribute.
	 * @see #setConnectionLoadBalancingPolicyClassName(String)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_ConnectionLoadBalancingPolicyClassName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='connectionLoadBalancingPolicyClassName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConnectionLoadBalancingPolicyClassName();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConnectionLoadBalancingPolicyClassName <em>Connection Load Balancing Policy Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Load Balancing Policy Class Name</em>' attribute.
	 * @see #getConnectionLoadBalancingPolicyClassName()
	 * @generated
	 */
	void setConnectionLoadBalancingPolicyClassName(String value);

	/**
	 * Returns the value of the '<em><b>Connection TTL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection TTL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection TTL</em>' attribute.
	 * @see #isSetConnectionTTL()
	 * @see #unsetConnectionTTL()
	 * @see #setConnectionTTL(long)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_ConnectionTTL()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='connectionTTL' namespace='##targetNamespace'"
	 * @generated
	 */
	long getConnectionTTL();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConnectionTTL <em>Connection TTL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection TTL</em>' attribute.
	 * @see #isSetConnectionTTL()
	 * @see #unsetConnectionTTL()
	 * @see #getConnectionTTL()
	 * @generated
	 */
	void setConnectionTTL(long value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConnectionTTL <em>Connection TTL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectionTTL()
	 * @see #getConnectionTTL()
	 * @see #setConnectionTTL(long)
	 * @generated
	 */
	void unsetConnectionTTL();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConnectionTTL <em>Connection TTL</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connection TTL</em>' attribute is set.
	 * @see #unsetConnectionTTL()
	 * @see #getConnectionTTL()
	 * @see #setConnectionTTL(long)
	 * @generated
	 */
	boolean isSetConnectionTTL();

	/**
	 * Returns the value of the '<em><b>Confirmation Window Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirmation Window Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirmation Window Size</em>' attribute.
	 * @see #isSetConfirmationWindowSize()
	 * @see #unsetConfirmationWindowSize()
	 * @see #setConfirmationWindowSize(int)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_ConfirmationWindowSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='confirmationWindowSize' namespace='##targetNamespace'"
	 * @generated
	 */
	int getConfirmationWindowSize();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConfirmationWindowSize <em>Confirmation Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirmation Window Size</em>' attribute.
	 * @see #isSetConfirmationWindowSize()
	 * @see #unsetConfirmationWindowSize()
	 * @see #getConfirmationWindowSize()
	 * @generated
	 */
	void setConfirmationWindowSize(int value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConfirmationWindowSize <em>Confirmation Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConfirmationWindowSize()
	 * @see #getConfirmationWindowSize()
	 * @see #setConfirmationWindowSize(int)
	 * @generated
	 */
	void unsetConfirmationWindowSize();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConfirmationWindowSize <em>Confirmation Window Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Confirmation Window Size</em>' attribute is set.
	 * @see #unsetConfirmationWindowSize()
	 * @see #getConfirmationWindowSize()
	 * @see #setConfirmationWindowSize(int)
	 * @generated
	 */
	boolean isSetConfirmationWindowSize();

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference.
	 * @see #setConnector(ConnectorType)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_Connector()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='connector' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectorType getConnector();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConnector <em>Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' containment reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(ConnectorType value);

	/**
	 * Returns the value of the '<em><b>Consumer Max Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumer Max Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer Max Rate</em>' attribute.
	 * @see #isSetConsumerMaxRate()
	 * @see #unsetConsumerMaxRate()
	 * @see #setConsumerMaxRate(int)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_ConsumerMaxRate()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='consumerMaxRate' namespace='##targetNamespace'"
	 * @generated
	 */
	int getConsumerMaxRate();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConsumerMaxRate <em>Consumer Max Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer Max Rate</em>' attribute.
	 * @see #isSetConsumerMaxRate()
	 * @see #unsetConsumerMaxRate()
	 * @see #getConsumerMaxRate()
	 * @generated
	 */
	void setConsumerMaxRate(int value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConsumerMaxRate <em>Consumer Max Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConsumerMaxRate()
	 * @see #getConsumerMaxRate()
	 * @see #setConsumerMaxRate(int)
	 * @generated
	 */
	void unsetConsumerMaxRate();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConsumerMaxRate <em>Consumer Max Rate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Consumer Max Rate</em>' attribute is set.
	 * @see #unsetConsumerMaxRate()
	 * @see #getConsumerMaxRate()
	 * @see #setConsumerMaxRate(int)
	 * @generated
	 */
	boolean isSetConsumerMaxRate();

	/**
	 * Returns the value of the '<em><b>Consumer Window Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumer Window Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer Window Size</em>' attribute.
	 * @see #isSetConsumerWindowSize()
	 * @see #unsetConsumerWindowSize()
	 * @see #setConsumerWindowSize(int)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_ConsumerWindowSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='consumerWindowSize' namespace='##targetNamespace'"
	 * @generated
	 */
	int getConsumerWindowSize();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConsumerWindowSize <em>Consumer Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer Window Size</em>' attribute.
	 * @see #isSetConsumerWindowSize()
	 * @see #unsetConsumerWindowSize()
	 * @see #getConsumerWindowSize()
	 * @generated
	 */
	void setConsumerWindowSize(int value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConsumerWindowSize <em>Consumer Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConsumerWindowSize()
	 * @see #getConsumerWindowSize()
	 * @see #setConsumerWindowSize(int)
	 * @generated
	 */
	void unsetConsumerWindowSize();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getConsumerWindowSize <em>Consumer Window Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Consumer Window Size</em>' attribute is set.
	 * @see #unsetConsumerWindowSize()
	 * @see #getConsumerWindowSize()
	 * @see #setConsumerWindowSize(int)
	 * @generated
	 */
	boolean isSetConsumerWindowSize();

	/**
	 * Returns the value of the '<em><b>Disable Finalize Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable Finalize Check</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable Finalize Check</em>' attribute.
	 * @see #isSetDisableFinalizeCheck()
	 * @see #unsetDisableFinalizeCheck()
	 * @see #setDisableFinalizeCheck(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_DisableFinalizeCheck()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='disableFinalizeCheck' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDisableFinalizeCheck();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isDisableFinalizeCheck <em>Disable Finalize Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable Finalize Check</em>' attribute.
	 * @see #isSetDisableFinalizeCheck()
	 * @see #unsetDisableFinalizeCheck()
	 * @see #isDisableFinalizeCheck()
	 * @generated
	 */
	void setDisableFinalizeCheck(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isDisableFinalizeCheck <em>Disable Finalize Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisableFinalizeCheck()
	 * @see #isDisableFinalizeCheck()
	 * @see #setDisableFinalizeCheck(boolean)
	 * @generated
	 */
	void unsetDisableFinalizeCheck();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isDisableFinalizeCheck <em>Disable Finalize Check</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disable Finalize Check</em>' attribute is set.
	 * @see #unsetDisableFinalizeCheck()
	 * @see #isDisableFinalizeCheck()
	 * @see #setDisableFinalizeCheck(boolean)
	 * @generated
	 */
	boolean isSetDisableFinalizeCheck();

	/**
	 * Returns the value of the '<em><b>Discovery Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discovery Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovery Group</em>' containment reference.
	 * @see #setDiscoveryGroup(DiscoveryGroupType)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_DiscoveryGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='discoveryGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	DiscoveryGroupType getDiscoveryGroup();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getDiscoveryGroup <em>Discovery Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discovery Group</em>' containment reference.
	 * @see #getDiscoveryGroup()
	 * @generated
	 */
	void setDiscoveryGroup(DiscoveryGroupType value);

	/**
	 * Returns the value of the '<em><b>Failover On Initial Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failover On Initial Connection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failover On Initial Connection</em>' attribute.
	 * @see #isSetFailoverOnInitialConnection()
	 * @see #unsetFailoverOnInitialConnection()
	 * @see #setFailoverOnInitialConnection(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_FailoverOnInitialConnection()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='failoverOnInitialConnection' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isFailoverOnInitialConnection();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isFailoverOnInitialConnection <em>Failover On Initial Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failover On Initial Connection</em>' attribute.
	 * @see #isSetFailoverOnInitialConnection()
	 * @see #unsetFailoverOnInitialConnection()
	 * @see #isFailoverOnInitialConnection()
	 * @generated
	 */
	void setFailoverOnInitialConnection(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isFailoverOnInitialConnection <em>Failover On Initial Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFailoverOnInitialConnection()
	 * @see #isFailoverOnInitialConnection()
	 * @see #setFailoverOnInitialConnection(boolean)
	 * @generated
	 */
	void unsetFailoverOnInitialConnection();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isFailoverOnInitialConnection <em>Failover On Initial Connection</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Failover On Initial Connection</em>' attribute is set.
	 * @see #unsetFailoverOnInitialConnection()
	 * @see #isFailoverOnInitialConnection()
	 * @see #setFailoverOnInitialConnection(boolean)
	 * @generated
	 */
	boolean isSetFailoverOnInitialConnection();

	/**
	 * Returns the value of the '<em><b>Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group ID</em>' attribute.
	 * @see #setGroupID(String)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_GroupID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='groupID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGroupID();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getGroupID <em>Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group ID</em>' attribute.
	 * @see #getGroupID()
	 * @generated
	 */
	void setGroupID(String value);

	/**
	 * Returns the value of the '<em><b>Initial Message Packet Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Message Packet Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Message Packet Size</em>' attribute.
	 * @see #isSetInitialMessagePacketSize()
	 * @see #unsetInitialMessagePacketSize()
	 * @see #setInitialMessagePacketSize(int)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_InitialMessagePacketSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='initialMessagePacketSize' namespace='##targetNamespace'"
	 * @generated
	 */
	int getInitialMessagePacketSize();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getInitialMessagePacketSize <em>Initial Message Packet Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Message Packet Size</em>' attribute.
	 * @see #isSetInitialMessagePacketSize()
	 * @see #unsetInitialMessagePacketSize()
	 * @see #getInitialMessagePacketSize()
	 * @generated
	 */
	void setInitialMessagePacketSize(int value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getInitialMessagePacketSize <em>Initial Message Packet Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitialMessagePacketSize()
	 * @see #getInitialMessagePacketSize()
	 * @see #setInitialMessagePacketSize(int)
	 * @generated
	 */
	void unsetInitialMessagePacketSize();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getInitialMessagePacketSize <em>Initial Message Packet Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initial Message Packet Size</em>' attribute is set.
	 * @see #unsetInitialMessagePacketSize()
	 * @see #getInitialMessagePacketSize()
	 * @see #setInitialMessagePacketSize(int)
	 * @generated
	 */
	boolean isSetInitialMessagePacketSize();

	/**
	 * Returns the value of the '<em><b>Initial Reconnect Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Reconnect Attempts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Reconnect Attempts</em>' attribute.
	 * @see #isSetInitialReconnectAttempts()
	 * @see #unsetInitialReconnectAttempts()
	 * @see #setInitialReconnectAttempts(int)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_InitialReconnectAttempts()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='initialReconnectAttempts' namespace='##targetNamespace'"
	 * @generated
	 */
	int getInitialReconnectAttempts();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getInitialReconnectAttempts <em>Initial Reconnect Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Reconnect Attempts</em>' attribute.
	 * @see #isSetInitialReconnectAttempts()
	 * @see #unsetInitialReconnectAttempts()
	 * @see #getInitialReconnectAttempts()
	 * @generated
	 */
	void setInitialReconnectAttempts(int value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getInitialReconnectAttempts <em>Initial Reconnect Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitialReconnectAttempts()
	 * @see #getInitialReconnectAttempts()
	 * @see #setInitialReconnectAttempts(int)
	 * @generated
	 */
	void unsetInitialReconnectAttempts();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getInitialReconnectAttempts <em>Initial Reconnect Attempts</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initial Reconnect Attempts</em>' attribute is set.
	 * @see #unsetInitialReconnectAttempts()
	 * @see #getInitialReconnectAttempts()
	 * @see #setInitialReconnectAttempts(int)
	 * @generated
	 */
	boolean isSetInitialReconnectAttempts();

	/**
	 * Returns the value of the '<em><b>Max Retry Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Retry Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Retry Interval</em>' attribute.
	 * @see #isSetMaxRetryInterval()
	 * @see #unsetMaxRetryInterval()
	 * @see #setMaxRetryInterval(long)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_MaxRetryInterval()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='maxRetryInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	long getMaxRetryInterval();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getMaxRetryInterval <em>Max Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Retry Interval</em>' attribute.
	 * @see #isSetMaxRetryInterval()
	 * @see #unsetMaxRetryInterval()
	 * @see #getMaxRetryInterval()
	 * @generated
	 */
	void setMaxRetryInterval(long value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getMaxRetryInterval <em>Max Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxRetryInterval()
	 * @see #getMaxRetryInterval()
	 * @see #setMaxRetryInterval(long)
	 * @generated
	 */
	void unsetMaxRetryInterval();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getMaxRetryInterval <em>Max Retry Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Retry Interval</em>' attribute is set.
	 * @see #unsetMaxRetryInterval()
	 * @see #getMaxRetryInterval()
	 * @see #setMaxRetryInterval(long)
	 * @generated
	 */
	boolean isSetMaxRetryInterval();

	/**
	 * Returns the value of the '<em><b>Min Large Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Large Message Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Large Message Size</em>' attribute.
	 * @see #isSetMinLargeMessageSize()
	 * @see #unsetMinLargeMessageSize()
	 * @see #setMinLargeMessageSize(long)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_MinLargeMessageSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='minLargeMessageSize' namespace='##targetNamespace'"
	 * @generated
	 */
	long getMinLargeMessageSize();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getMinLargeMessageSize <em>Min Large Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Large Message Size</em>' attribute.
	 * @see #isSetMinLargeMessageSize()
	 * @see #unsetMinLargeMessageSize()
	 * @see #getMinLargeMessageSize()
	 * @generated
	 */
	void setMinLargeMessageSize(long value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getMinLargeMessageSize <em>Min Large Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinLargeMessageSize()
	 * @see #getMinLargeMessageSize()
	 * @see #setMinLargeMessageSize(long)
	 * @generated
	 */
	void unsetMinLargeMessageSize();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getMinLargeMessageSize <em>Min Large Message Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Large Message Size</em>' attribute is set.
	 * @see #unsetMinLargeMessageSize()
	 * @see #getMinLargeMessageSize()
	 * @see #setMinLargeMessageSize(long)
	 * @generated
	 */
	boolean isSetMinLargeMessageSize();

	/**
	 * Returns the value of the '<em><b>Pre Acknowledge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Acknowledge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Acknowledge</em>' attribute.
	 * @see #isSetPreAcknowledge()
	 * @see #unsetPreAcknowledge()
	 * @see #setPreAcknowledge(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_PreAcknowledge()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='preAcknowledge' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isPreAcknowledge();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isPreAcknowledge <em>Pre Acknowledge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Acknowledge</em>' attribute.
	 * @see #isSetPreAcknowledge()
	 * @see #unsetPreAcknowledge()
	 * @see #isPreAcknowledge()
	 * @generated
	 */
	void setPreAcknowledge(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isPreAcknowledge <em>Pre Acknowledge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreAcknowledge()
	 * @see #isPreAcknowledge()
	 * @see #setPreAcknowledge(boolean)
	 * @generated
	 */
	void unsetPreAcknowledge();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isPreAcknowledge <em>Pre Acknowledge</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pre Acknowledge</em>' attribute is set.
	 * @see #unsetPreAcknowledge()
	 * @see #isPreAcknowledge()
	 * @see #setPreAcknowledge(boolean)
	 * @generated
	 */
	boolean isSetPreAcknowledge();

	/**
	 * Returns the value of the '<em><b>Producer Max Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Producer Max Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producer Max Rate</em>' attribute.
	 * @see #isSetProducerMaxRate()
	 * @see #unsetProducerMaxRate()
	 * @see #setProducerMaxRate(int)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_ProducerMaxRate()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='producerMaxRate' namespace='##targetNamespace'"
	 * @generated
	 */
	int getProducerMaxRate();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getProducerMaxRate <em>Producer Max Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Producer Max Rate</em>' attribute.
	 * @see #isSetProducerMaxRate()
	 * @see #unsetProducerMaxRate()
	 * @see #getProducerMaxRate()
	 * @generated
	 */
	void setProducerMaxRate(int value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getProducerMaxRate <em>Producer Max Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProducerMaxRate()
	 * @see #getProducerMaxRate()
	 * @see #setProducerMaxRate(int)
	 * @generated
	 */
	void unsetProducerMaxRate();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getProducerMaxRate <em>Producer Max Rate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Producer Max Rate</em>' attribute is set.
	 * @see #unsetProducerMaxRate()
	 * @see #getProducerMaxRate()
	 * @see #setProducerMaxRate(int)
	 * @generated
	 */
	boolean isSetProducerMaxRate();

	/**
	 * Returns the value of the '<em><b>Producer Window Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Producer Window Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producer Window Size</em>' attribute.
	 * @see #isSetProducerWindowSize()
	 * @see #unsetProducerWindowSize()
	 * @see #setProducerWindowSize(int)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_ProducerWindowSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='producerWindowSize' namespace='##targetNamespace'"
	 * @generated
	 */
	int getProducerWindowSize();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getProducerWindowSize <em>Producer Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Producer Window Size</em>' attribute.
	 * @see #isSetProducerWindowSize()
	 * @see #unsetProducerWindowSize()
	 * @see #getProducerWindowSize()
	 * @generated
	 */
	void setProducerWindowSize(int value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getProducerWindowSize <em>Producer Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProducerWindowSize()
	 * @see #getProducerWindowSize()
	 * @see #setProducerWindowSize(int)
	 * @generated
	 */
	void unsetProducerWindowSize();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getProducerWindowSize <em>Producer Window Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Producer Window Size</em>' attribute is set.
	 * @see #unsetProducerWindowSize()
	 * @see #getProducerWindowSize()
	 * @see #setProducerWindowSize(int)
	 * @generated
	 */
	boolean isSetProducerWindowSize();

	/**
	 * Returns the value of the '<em><b>Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue</em>' attribute.
	 * @see #setQueue(String)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_Queue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='queue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getQueue();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getQueue <em>Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue</em>' attribute.
	 * @see #getQueue()
	 * @generated
	 */
	void setQueue(String value);

	/**
	 * Returns the value of the '<em><b>Reconnect Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconnect Attempts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconnect Attempts</em>' attribute.
	 * @see #isSetReconnectAttempts()
	 * @see #unsetReconnectAttempts()
	 * @see #setReconnectAttempts(int)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_ReconnectAttempts()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='reconnectAttempts' namespace='##targetNamespace'"
	 * @generated
	 */
	int getReconnectAttempts();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getReconnectAttempts <em>Reconnect Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconnect Attempts</em>' attribute.
	 * @see #isSetReconnectAttempts()
	 * @see #unsetReconnectAttempts()
	 * @see #getReconnectAttempts()
	 * @generated
	 */
	void setReconnectAttempts(int value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getReconnectAttempts <em>Reconnect Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReconnectAttempts()
	 * @see #getReconnectAttempts()
	 * @see #setReconnectAttempts(int)
	 * @generated
	 */
	void unsetReconnectAttempts();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getReconnectAttempts <em>Reconnect Attempts</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reconnect Attempts</em>' attribute is set.
	 * @see #unsetReconnectAttempts()
	 * @see #getReconnectAttempts()
	 * @see #setReconnectAttempts(int)
	 * @generated
	 */
	boolean isSetReconnectAttempts();

	/**
	 * Returns the value of the '<em><b>Retry Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retry Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry Interval</em>' attribute.
	 * @see #isSetRetryInterval()
	 * @see #unsetRetryInterval()
	 * @see #setRetryInterval(long)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_RetryInterval()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='retryInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	long getRetryInterval();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getRetryInterval <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Interval</em>' attribute.
	 * @see #isSetRetryInterval()
	 * @see #unsetRetryInterval()
	 * @see #getRetryInterval()
	 * @generated
	 */
	void setRetryInterval(long value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getRetryInterval <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRetryInterval()
	 * @see #getRetryInterval()
	 * @see #setRetryInterval(long)
	 * @generated
	 */
	void unsetRetryInterval();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getRetryInterval <em>Retry Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Retry Interval</em>' attribute is set.
	 * @see #unsetRetryInterval()
	 * @see #getRetryInterval()
	 * @see #setRetryInterval(long)
	 * @generated
	 */
	boolean isSetRetryInterval();

	/**
	 * Returns the value of the '<em><b>Retry Interval Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retry Interval Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry Interval Multiplier</em>' attribute.
	 * @see #isSetRetryIntervalMultiplier()
	 * @see #unsetRetryIntervalMultiplier()
	 * @see #setRetryIntervalMultiplier(float)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_RetryIntervalMultiplier()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='retryIntervalMultiplier' namespace='##targetNamespace'"
	 * @generated
	 */
	float getRetryIntervalMultiplier();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getRetryIntervalMultiplier <em>Retry Interval Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Interval Multiplier</em>' attribute.
	 * @see #isSetRetryIntervalMultiplier()
	 * @see #unsetRetryIntervalMultiplier()
	 * @see #getRetryIntervalMultiplier()
	 * @generated
	 */
	void setRetryIntervalMultiplier(float value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getRetryIntervalMultiplier <em>Retry Interval Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRetryIntervalMultiplier()
	 * @see #getRetryIntervalMultiplier()
	 * @see #setRetryIntervalMultiplier(float)
	 * @generated
	 */
	void unsetRetryIntervalMultiplier();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getRetryIntervalMultiplier <em>Retry Interval Multiplier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Retry Interval Multiplier</em>' attribute is set.
	 * @see #unsetRetryIntervalMultiplier()
	 * @see #getRetryIntervalMultiplier()
	 * @see #setRetryIntervalMultiplier(float)
	 * @generated
	 */
	boolean isSetRetryIntervalMultiplier();

	/**
	 * Returns the value of the '<em><b>Scheduled Thread Pool Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Thread Pool Max Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Thread Pool Max Size</em>' attribute.
	 * @see #isSetScheduledThreadPoolMaxSize()
	 * @see #unsetScheduledThreadPoolMaxSize()
	 * @see #setScheduledThreadPoolMaxSize(int)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_ScheduledThreadPoolMaxSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='scheduledThreadPoolMaxSize' namespace='##targetNamespace'"
	 * @generated
	 */
	int getScheduledThreadPoolMaxSize();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getScheduledThreadPoolMaxSize <em>Scheduled Thread Pool Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Thread Pool Max Size</em>' attribute.
	 * @see #isSetScheduledThreadPoolMaxSize()
	 * @see #unsetScheduledThreadPoolMaxSize()
	 * @see #getScheduledThreadPoolMaxSize()
	 * @generated
	 */
	void setScheduledThreadPoolMaxSize(int value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getScheduledThreadPoolMaxSize <em>Scheduled Thread Pool Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScheduledThreadPoolMaxSize()
	 * @see #getScheduledThreadPoolMaxSize()
	 * @see #setScheduledThreadPoolMaxSize(int)
	 * @generated
	 */
	void unsetScheduledThreadPoolMaxSize();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getScheduledThreadPoolMaxSize <em>Scheduled Thread Pool Max Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scheduled Thread Pool Max Size</em>' attribute is set.
	 * @see #unsetScheduledThreadPoolMaxSize()
	 * @see #getScheduledThreadPoolMaxSize()
	 * @see #setScheduledThreadPoolMaxSize(int)
	 * @generated
	 */
	boolean isSetScheduledThreadPoolMaxSize();

	/**
	 * Returns the value of the '<em><b>Thread Pool Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Pool Max Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Pool Max Size</em>' attribute.
	 * @see #isSetThreadPoolMaxSize()
	 * @see #unsetThreadPoolMaxSize()
	 * @see #setThreadPoolMaxSize(int)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_ThreadPoolMaxSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='threadPoolMaxSize' namespace='##targetNamespace'"
	 * @generated
	 */
	int getThreadPoolMaxSize();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getThreadPoolMaxSize <em>Thread Pool Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Pool Max Size</em>' attribute.
	 * @see #isSetThreadPoolMaxSize()
	 * @see #unsetThreadPoolMaxSize()
	 * @see #getThreadPoolMaxSize()
	 * @generated
	 */
	void setThreadPoolMaxSize(int value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getThreadPoolMaxSize <em>Thread Pool Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThreadPoolMaxSize()
	 * @see #getThreadPoolMaxSize()
	 * @see #setThreadPoolMaxSize(int)
	 * @generated
	 */
	void unsetThreadPoolMaxSize();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#getThreadPoolMaxSize <em>Thread Pool Max Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thread Pool Max Size</em>' attribute is set.
	 * @see #unsetThreadPoolMaxSize()
	 * @see #getThreadPoolMaxSize()
	 * @see #setThreadPoolMaxSize(int)
	 * @generated
	 */
	boolean isSetThreadPoolMaxSize();

	/**
	 * Returns the value of the '<em><b>Use Global Pools</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Global Pools</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Global Pools</em>' attribute.
	 * @see #isSetUseGlobalPools()
	 * @see #unsetUseGlobalPools()
	 * @see #setUseGlobalPools(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_UseGlobalPools()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='useGlobalPools' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isUseGlobalPools();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isUseGlobalPools <em>Use Global Pools</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Global Pools</em>' attribute.
	 * @see #isSetUseGlobalPools()
	 * @see #unsetUseGlobalPools()
	 * @see #isUseGlobalPools()
	 * @generated
	 */
	void setUseGlobalPools(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isUseGlobalPools <em>Use Global Pools</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseGlobalPools()
	 * @see #isUseGlobalPools()
	 * @see #setUseGlobalPools(boolean)
	 * @generated
	 */
	void unsetUseGlobalPools();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isUseGlobalPools <em>Use Global Pools</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Global Pools</em>' attribute is set.
	 * @see #unsetUseGlobalPools()
	 * @see #isUseGlobalPools()
	 * @see #setUseGlobalPools(boolean)
	 * @generated
	 */
	boolean isSetUseGlobalPools();

	/**
	 * Returns the value of the '<em><b>Use HA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use HA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use HA</em>' attribute.
	 * @see #isSetUseHA()
	 * @see #unsetUseHA()
	 * @see #setUseHA(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_UseHA()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='useHA' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isUseHA();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isUseHA <em>Use HA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use HA</em>' attribute.
	 * @see #isSetUseHA()
	 * @see #unsetUseHA()
	 * @see #isUseHA()
	 * @generated
	 */
	void setUseHA(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isUseHA <em>Use HA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseHA()
	 * @see #isUseHA()
	 * @see #setUseHA(boolean)
	 * @generated
	 */
	void unsetUseHA();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isUseHA <em>Use HA</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use HA</em>' attribute is set.
	 * @see #unsetUseHA()
	 * @see #isUseHA()
	 * @see #setUseHA(boolean)
	 * @generated
	 */
	boolean isSetUseHA();

	/**
	 * Returns the value of the '<em><b>Xa Session</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xa Session</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xa Session</em>' attribute.
	 * @see #isSetXaSession()
	 * @see #unsetXaSession()
	 * @see #setXaSession(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage#getConfigType_XaSession()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='xaSession' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isXaSession();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isXaSession <em>Xa Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xa Session</em>' attribute.
	 * @see #isSetXaSession()
	 * @see #unsetXaSession()
	 * @see #isXaSession()
	 * @generated
	 */
	void setXaSession(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isXaSession <em>Xa Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXaSession()
	 * @see #isXaSession()
	 * @see #setXaSession(boolean)
	 * @generated
	 */
	void unsetXaSession();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType#isXaSession <em>Xa Session</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Xa Session</em>' attribute is set.
	 * @see #unsetXaSession()
	 * @see #isXaSession()
	 * @see #setXaSession(boolean)
	 * @generated
	 */
	boolean isSetXaSession();

} // ConfigType
