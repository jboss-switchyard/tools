/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failover Load Balancer Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.FailoverLoadBalancerDefinition#getException <em>Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.FailoverLoadBalancerDefinition#getMaximumFailoverAttempts <em>Maximum Failover Attempts</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.FailoverLoadBalancerDefinition#isRoundRobin <em>Round Robin</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getFailoverLoadBalancerDefinition()
 * @model extendedMetaData="name='failoverLoadBalancerDefinition' kind='elementOnly'"
 * @generated
 */
public interface FailoverLoadBalancerDefinition extends LoadBalancer {
	/**
	 * Returns the value of the '<em><b>Exception</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' attribute list.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getFailoverLoadBalancerDefinition_Exception()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='exception' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getException();

	/**
	 * Returns the value of the '<em><b>Maximum Failover Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Failover Attempts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Failover Attempts</em>' attribute.
	 * @see #isSetMaximumFailoverAttempts()
	 * @see #unsetMaximumFailoverAttempts()
	 * @see #setMaximumFailoverAttempts(int)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getFailoverLoadBalancerDefinition_MaximumFailoverAttempts()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='maximumFailoverAttempts'"
	 * @generated
	 */
	int getMaximumFailoverAttempts();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.FailoverLoadBalancerDefinition#getMaximumFailoverAttempts <em>Maximum Failover Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Failover Attempts</em>' attribute.
	 * @see #isSetMaximumFailoverAttempts()
	 * @see #unsetMaximumFailoverAttempts()
	 * @see #getMaximumFailoverAttempts()
	 * @generated
	 */
	void setMaximumFailoverAttempts(int value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.FailoverLoadBalancerDefinition#getMaximumFailoverAttempts <em>Maximum Failover Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumFailoverAttempts()
	 * @see #getMaximumFailoverAttempts()
	 * @see #setMaximumFailoverAttempts(int)
	 * @generated
	 */
	void unsetMaximumFailoverAttempts();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.FailoverLoadBalancerDefinition#getMaximumFailoverAttempts <em>Maximum Failover Attempts</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Failover Attempts</em>' attribute is set.
	 * @see #unsetMaximumFailoverAttempts()
	 * @see #getMaximumFailoverAttempts()
	 * @see #setMaximumFailoverAttempts(int)
	 * @generated
	 */
	boolean isSetMaximumFailoverAttempts();

	/**
	 * Returns the value of the '<em><b>Round Robin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Round Robin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Round Robin</em>' attribute.
	 * @see #isSetRoundRobin()
	 * @see #unsetRoundRobin()
	 * @see #setRoundRobin(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getFailoverLoadBalancerDefinition_RoundRobin()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='roundRobin'"
	 * @generated
	 */
	boolean isRoundRobin();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.FailoverLoadBalancerDefinition#isRoundRobin <em>Round Robin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Round Robin</em>' attribute.
	 * @see #isSetRoundRobin()
	 * @see #unsetRoundRobin()
	 * @see #isRoundRobin()
	 * @generated
	 */
	void setRoundRobin(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.FailoverLoadBalancerDefinition#isRoundRobin <em>Round Robin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRoundRobin()
	 * @see #isRoundRobin()
	 * @see #setRoundRobin(boolean)
	 * @generated
	 */
	void unsetRoundRobin();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.FailoverLoadBalancerDefinition#isRoundRobin <em>Round Robin</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Round Robin</em>' attribute is set.
	 * @see #unsetRoundRobin()
	 * @see #isRoundRobin()
	 * @see #setRoundRobin(boolean)
	 * @generated
	 */
	boolean isSetRoundRobin();

} // FailoverLoadBalancerDefinition
