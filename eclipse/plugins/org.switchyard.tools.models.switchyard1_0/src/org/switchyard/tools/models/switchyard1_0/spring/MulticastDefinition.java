/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multicast Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#getExecutorServiceRef <em>Executor Service Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#getOnPrepareRef <em>On Prepare Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#isParallelProcessing <em>Parallel Processing</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#isShareUnitOfWork <em>Share Unit Of Work</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#isStopOnException <em>Stop On Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#getStrategyRef <em>Strategy Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#isStreaming <em>Streaming</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMulticastDefinition()
 * @model extendedMetaData="name='multicastDefinition' kind='elementOnly'"
 * @generated
 */
public interface MulticastDefinition extends Output {
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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMulticastDefinition_ExecutorServiceRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='executorServiceRef'"
	 * @generated
	 */
	String getExecutorServiceRef();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#getExecutorServiceRef <em>Executor Service Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor Service Ref</em>' attribute.
	 * @see #getExecutorServiceRef()
	 * @generated
	 */
	void setExecutorServiceRef(String value);

	/**
	 * Returns the value of the '<em><b>On Prepare Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Prepare Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Prepare Ref</em>' attribute.
	 * @see #setOnPrepareRef(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMulticastDefinition_OnPrepareRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='onPrepareRef'"
	 * @generated
	 */
	String getOnPrepareRef();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#getOnPrepareRef <em>On Prepare Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Prepare Ref</em>' attribute.
	 * @see #getOnPrepareRef()
	 * @generated
	 */
	void setOnPrepareRef(String value);

	/**
	 * Returns the value of the '<em><b>Parallel Processing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallel Processing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel Processing</em>' attribute.
	 * @see #isSetParallelProcessing()
	 * @see #unsetParallelProcessing()
	 * @see #setParallelProcessing(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMulticastDefinition_ParallelProcessing()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='parallelProcessing'"
	 * @generated
	 */
	boolean isParallelProcessing();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#isParallelProcessing <em>Parallel Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel Processing</em>' attribute.
	 * @see #isSetParallelProcessing()
	 * @see #unsetParallelProcessing()
	 * @see #isParallelProcessing()
	 * @generated
	 */
	void setParallelProcessing(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#isParallelProcessing <em>Parallel Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetParallelProcessing()
	 * @see #isParallelProcessing()
	 * @see #setParallelProcessing(boolean)
	 * @generated
	 */
	void unsetParallelProcessing();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#isParallelProcessing <em>Parallel Processing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Parallel Processing</em>' attribute is set.
	 * @see #unsetParallelProcessing()
	 * @see #isParallelProcessing()
	 * @see #setParallelProcessing(boolean)
	 * @generated
	 */
	boolean isSetParallelProcessing();

	/**
	 * Returns the value of the '<em><b>Share Unit Of Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Share Unit Of Work</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Share Unit Of Work</em>' attribute.
	 * @see #isSetShareUnitOfWork()
	 * @see #unsetShareUnitOfWork()
	 * @see #setShareUnitOfWork(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMulticastDefinition_ShareUnitOfWork()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='shareUnitOfWork'"
	 * @generated
	 */
	boolean isShareUnitOfWork();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#isShareUnitOfWork <em>Share Unit Of Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Share Unit Of Work</em>' attribute.
	 * @see #isSetShareUnitOfWork()
	 * @see #unsetShareUnitOfWork()
	 * @see #isShareUnitOfWork()
	 * @generated
	 */
	void setShareUnitOfWork(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#isShareUnitOfWork <em>Share Unit Of Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShareUnitOfWork()
	 * @see #isShareUnitOfWork()
	 * @see #setShareUnitOfWork(boolean)
	 * @generated
	 */
	void unsetShareUnitOfWork();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#isShareUnitOfWork <em>Share Unit Of Work</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Share Unit Of Work</em>' attribute is set.
	 * @see #unsetShareUnitOfWork()
	 * @see #isShareUnitOfWork()
	 * @see #setShareUnitOfWork(boolean)
	 * @generated
	 */
	boolean isSetShareUnitOfWork();

	/**
	 * Returns the value of the '<em><b>Stop On Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop On Exception</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop On Exception</em>' attribute.
	 * @see #isSetStopOnException()
	 * @see #unsetStopOnException()
	 * @see #setStopOnException(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMulticastDefinition_StopOnException()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='stopOnException'"
	 * @generated
	 */
	boolean isStopOnException();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#isStopOnException <em>Stop On Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop On Exception</em>' attribute.
	 * @see #isSetStopOnException()
	 * @see #unsetStopOnException()
	 * @see #isStopOnException()
	 * @generated
	 */
	void setStopOnException(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#isStopOnException <em>Stop On Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStopOnException()
	 * @see #isStopOnException()
	 * @see #setStopOnException(boolean)
	 * @generated
	 */
	void unsetStopOnException();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#isStopOnException <em>Stop On Exception</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stop On Exception</em>' attribute is set.
	 * @see #unsetStopOnException()
	 * @see #isStopOnException()
	 * @see #setStopOnException(boolean)
	 * @generated
	 */
	boolean isSetStopOnException();

	/**
	 * Returns the value of the '<em><b>Strategy Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy Ref</em>' attribute.
	 * @see #setStrategyRef(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMulticastDefinition_StrategyRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='strategyRef'"
	 * @generated
	 */
	String getStrategyRef();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#getStrategyRef <em>Strategy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Ref</em>' attribute.
	 * @see #getStrategyRef()
	 * @generated
	 */
	void setStrategyRef(String value);

	/**
	 * Returns the value of the '<em><b>Streaming</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Streaming</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Streaming</em>' attribute.
	 * @see #isSetStreaming()
	 * @see #unsetStreaming()
	 * @see #setStreaming(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMulticastDefinition_Streaming()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='streaming'"
	 * @generated
	 */
	boolean isStreaming();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#isStreaming <em>Streaming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Streaming</em>' attribute.
	 * @see #isSetStreaming()
	 * @see #unsetStreaming()
	 * @see #isStreaming()
	 * @generated
	 */
	void setStreaming(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#isStreaming <em>Streaming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStreaming()
	 * @see #isStreaming()
	 * @see #setStreaming(boolean)
	 * @generated
	 */
	void unsetStreaming();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#isStreaming <em>Streaming</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Streaming</em>' attribute is set.
	 * @see #unsetStreaming()
	 * @see #isStreaming()
	 * @see #setStreaming(boolean)
	 * @generated
	 */
	boolean isSetStreaming();

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #isSetTimeout()
	 * @see #unsetTimeout()
	 * @see #setTimeout(long)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMulticastDefinition_Timeout()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='timeout'"
	 * @generated
	 */
	long getTimeout();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #isSetTimeout()
	 * @see #unsetTimeout()
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(long value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeout()
	 * @see #getTimeout()
	 * @see #setTimeout(long)
	 * @generated
	 */
	void unsetTimeout();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition#getTimeout <em>Timeout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Timeout</em>' attribute is set.
	 * @see #unsetTimeout()
	 * @see #getTimeout()
	 * @see #setTimeout(long)
	 * @generated
	 */
	boolean isSetTimeout();

	/**
	 * Returns the value of the '<em><b>Any Attribute2</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute2</em>' attribute list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getMulticastDefinition_AnyAttribute2()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':16' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute2();

} // MulticastDefinition
