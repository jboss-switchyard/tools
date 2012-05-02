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
 * A representation of the model object '<em><b>Intercept Send To Endpoint Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.InterceptSendToEndpointDefinition#isSkipSendToOriginalEndpoint <em>Skip Send To Original Endpoint</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.InterceptSendToEndpointDefinition#getUri <em>Uri</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.InterceptSendToEndpointDefinition#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getInterceptSendToEndpointDefinition()
 * @model extendedMetaData="name='interceptSendToEndpointDefinition' kind='elementOnly'"
 * @generated
 */
public interface InterceptSendToEndpointDefinition extends Output {
	/**
	 * Returns the value of the '<em><b>Skip Send To Original Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skip Send To Original Endpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skip Send To Original Endpoint</em>' attribute.
	 * @see #isSetSkipSendToOriginalEndpoint()
	 * @see #unsetSkipSendToOriginalEndpoint()
	 * @see #setSkipSendToOriginalEndpoint(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getInterceptSendToEndpointDefinition_SkipSendToOriginalEndpoint()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='skipSendToOriginalEndpoint'"
	 * @generated
	 */
	boolean isSkipSendToOriginalEndpoint();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.InterceptSendToEndpointDefinition#isSkipSendToOriginalEndpoint <em>Skip Send To Original Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip Send To Original Endpoint</em>' attribute.
	 * @see #isSetSkipSendToOriginalEndpoint()
	 * @see #unsetSkipSendToOriginalEndpoint()
	 * @see #isSkipSendToOriginalEndpoint()
	 * @generated
	 */
	void setSkipSendToOriginalEndpoint(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.InterceptSendToEndpointDefinition#isSkipSendToOriginalEndpoint <em>Skip Send To Original Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSkipSendToOriginalEndpoint()
	 * @see #isSkipSendToOriginalEndpoint()
	 * @see #setSkipSendToOriginalEndpoint(boolean)
	 * @generated
	 */
	void unsetSkipSendToOriginalEndpoint();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.InterceptSendToEndpointDefinition#isSkipSendToOriginalEndpoint <em>Skip Send To Original Endpoint</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Skip Send To Original Endpoint</em>' attribute is set.
	 * @see #unsetSkipSendToOriginalEndpoint()
	 * @see #isSkipSendToOriginalEndpoint()
	 * @see #setSkipSendToOriginalEndpoint(boolean)
	 * @generated
	 */
	boolean isSetSkipSendToOriginalEndpoint();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getInterceptSendToEndpointDefinition_Uri()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='uri'"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.InterceptSendToEndpointDefinition#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getInterceptSendToEndpointDefinition_AnyAttribute2()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':10' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute2();

} // InterceptSendToEndpointDefinition
