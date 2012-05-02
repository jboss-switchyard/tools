/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sticky Load Balancer Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.StickyLoadBalancerDefinition#getCorrelationExpression <em>Correlation Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getStickyLoadBalancerDefinition()
 * @model extendedMetaData="name='stickyLoadBalancerDefinition' kind='elementOnly'"
 * @generated
 */
public interface StickyLoadBalancerDefinition extends LoadBalancer {
	/**
	 * Returns the value of the '<em><b>Correlation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Expression</em>' containment reference.
	 * @see #setCorrelationExpression(ExpressionSubElementDefinition)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getStickyLoadBalancerDefinition_CorrelationExpression()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='correlationExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpressionSubElementDefinition getCorrelationExpression();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.StickyLoadBalancerDefinition#getCorrelationExpression <em>Correlation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Expression</em>' containment reference.
	 * @see #getCorrelationExpression()
	 * @generated
	 */
	void setCorrelationExpression(ExpressionSubElementDefinition value);

} // StickyLoadBalancerDefinition
