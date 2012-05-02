/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Camel Endpoint Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelEndpointFactoryBean#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelEndpointFactoryBean#isSingleton <em>Singleton</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelEndpointFactoryBean#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelEndpointFactoryBean()
 * @model abstract="true"
 *        extendedMetaData="name='abstractCamelEndpointFactoryBean' kind='empty'"
 * @generated
 */
public interface AbstractCamelEndpointFactoryBean extends AbstractCamelFactoryBean {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.spring.ExchangePattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.ExchangePattern
	 * @see #isSetPattern()
	 * @see #unsetPattern()
	 * @see #setPattern(ExchangePattern)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelEndpointFactoryBean_Pattern()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='pattern'"
	 * @generated
	 */
	ExchangePattern getPattern();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelEndpointFactoryBean#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see org.switchyard.tools.models.switchyard1_0.spring.ExchangePattern
	 * @see #isSetPattern()
	 * @see #unsetPattern()
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(ExchangePattern value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelEndpointFactoryBean#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPattern()
	 * @see #getPattern()
	 * @see #setPattern(ExchangePattern)
	 * @generated
	 */
	void unsetPattern();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelEndpointFactoryBean#getPattern <em>Pattern</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pattern</em>' attribute is set.
	 * @see #unsetPattern()
	 * @see #getPattern()
	 * @see #setPattern(ExchangePattern)
	 * @generated
	 */
	boolean isSetPattern();

	/**
	 * Returns the value of the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singleton</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singleton</em>' attribute.
	 * @see #isSetSingleton()
	 * @see #unsetSingleton()
	 * @see #setSingleton(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelEndpointFactoryBean_Singleton()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='singleton'"
	 * @generated
	 */
	boolean isSingleton();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelEndpointFactoryBean#isSingleton <em>Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singleton</em>' attribute.
	 * @see #isSetSingleton()
	 * @see #unsetSingleton()
	 * @see #isSingleton()
	 * @generated
	 */
	void setSingleton(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelEndpointFactoryBean#isSingleton <em>Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSingleton()
	 * @see #isSingleton()
	 * @see #setSingleton(boolean)
	 * @generated
	 */
	void unsetSingleton();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelEndpointFactoryBean#isSingleton <em>Singleton</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Singleton</em>' attribute is set.
	 * @see #unsetSingleton()
	 * @see #isSingleton()
	 * @see #setSingleton(boolean)
	 * @generated
	 */
	boolean isSetSingleton();

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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelEndpointFactoryBean_Uri()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='uri'"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelEndpointFactoryBean#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // AbstractCamelEndpointFactoryBean
