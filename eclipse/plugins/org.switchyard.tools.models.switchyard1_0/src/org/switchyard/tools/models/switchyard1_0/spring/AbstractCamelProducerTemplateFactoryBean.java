/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Camel Producer Template Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelProducerTemplateFactoryBean#getDefaultEndpoint <em>Default Endpoint</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelProducerTemplateFactoryBean#getMaximumCacheSize <em>Maximum Cache Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelProducerTemplateFactoryBean()
 * @model abstract="true"
 *        extendedMetaData="name='abstractCamelProducerTemplateFactoryBean' kind='empty'"
 * @generated
 */
public interface AbstractCamelProducerTemplateFactoryBean extends AbstractCamelFactoryBean {
	/**
	 * Returns the value of the '<em><b>Default Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Endpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Endpoint</em>' attribute.
	 * @see #setDefaultEndpoint(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelProducerTemplateFactoryBean_DefaultEndpoint()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultEndpoint'"
	 * @generated
	 */
	String getDefaultEndpoint();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelProducerTemplateFactoryBean#getDefaultEndpoint <em>Default Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Endpoint</em>' attribute.
	 * @see #getDefaultEndpoint()
	 * @generated
	 */
	void setDefaultEndpoint(String value);

	/**
	 * Returns the value of the '<em><b>Maximum Cache Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Cache Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Cache Size</em>' attribute.
	 * @see #isSetMaximumCacheSize()
	 * @see #unsetMaximumCacheSize()
	 * @see #setMaximumCacheSize(int)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelProducerTemplateFactoryBean_MaximumCacheSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='maximumCacheSize'"
	 * @generated
	 */
	int getMaximumCacheSize();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelProducerTemplateFactoryBean#getMaximumCacheSize <em>Maximum Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Cache Size</em>' attribute.
	 * @see #isSetMaximumCacheSize()
	 * @see #unsetMaximumCacheSize()
	 * @see #getMaximumCacheSize()
	 * @generated
	 */
	void setMaximumCacheSize(int value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelProducerTemplateFactoryBean#getMaximumCacheSize <em>Maximum Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumCacheSize()
	 * @see #getMaximumCacheSize()
	 * @see #setMaximumCacheSize(int)
	 * @generated
	 */
	void unsetMaximumCacheSize();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelProducerTemplateFactoryBean#getMaximumCacheSize <em>Maximum Cache Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Cache Size</em>' attribute is set.
	 * @see #unsetMaximumCacheSize()
	 * @see #getMaximumCacheSize()
	 * @see #setMaximumCacheSize(int)
	 * @generated
	 */
	boolean isSetMaximumCacheSize();

} // AbstractCamelProducerTemplateFactoryBean
