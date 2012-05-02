/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weighted Load Balancer Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.WeightedLoadBalancerDefinition#getDistributionRatio <em>Distribution Ratio</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.WeightedLoadBalancerDefinition#getDistributionRatioDelimiter <em>Distribution Ratio Delimiter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.WeightedLoadBalancerDefinition#isRoundRobin <em>Round Robin</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getWeightedLoadBalancerDefinition()
 * @model extendedMetaData="name='weightedLoadBalancerDefinition' kind='empty'"
 * @generated
 */
public interface WeightedLoadBalancerDefinition extends LoadBalancer {
	/**
	 * Returns the value of the '<em><b>Distribution Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution Ratio</em>' attribute.
	 * @see #setDistributionRatio(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getWeightedLoadBalancerDefinition_DistributionRatio()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='distributionRatio'"
	 * @generated
	 */
	String getDistributionRatio();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.WeightedLoadBalancerDefinition#getDistributionRatio <em>Distribution Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution Ratio</em>' attribute.
	 * @see #getDistributionRatio()
	 * @generated
	 */
	void setDistributionRatio(String value);

	/**
	 * Returns the value of the '<em><b>Distribution Ratio Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution Ratio Delimiter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution Ratio Delimiter</em>' attribute.
	 * @see #setDistributionRatioDelimiter(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getWeightedLoadBalancerDefinition_DistributionRatioDelimiter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='distributionRatioDelimiter'"
	 * @generated
	 */
	String getDistributionRatioDelimiter();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.WeightedLoadBalancerDefinition#getDistributionRatioDelimiter <em>Distribution Ratio Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution Ratio Delimiter</em>' attribute.
	 * @see #getDistributionRatioDelimiter()
	 * @generated
	 */
	void setDistributionRatioDelimiter(String value);

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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getWeightedLoadBalancerDefinition_RoundRobin()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='roundRobin'"
	 * @generated
	 */
	boolean isRoundRobin();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.WeightedLoadBalancerDefinition#isRoundRobin <em>Round Robin</em>}' attribute.
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
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.WeightedLoadBalancerDefinition#isRoundRobin <em>Round Robin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRoundRobin()
	 * @see #isRoundRobin()
	 * @see #setRoundRobin(boolean)
	 * @generated
	 */
	void unsetRoundRobin();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.WeightedLoadBalancerDefinition#isRoundRobin <em>Round Robin</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Round Robin</em>' attribute is set.
	 * @see #unsetRoundRobin()
	 * @see #isRoundRobin()
	 * @see #setRoundRobin(boolean)
	 * @generated
	 */
	boolean isSetRoundRobin();

} // WeightedLoadBalancerDefinition
