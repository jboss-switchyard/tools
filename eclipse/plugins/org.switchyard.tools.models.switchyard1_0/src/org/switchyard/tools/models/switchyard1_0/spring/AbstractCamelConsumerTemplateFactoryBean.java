/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Camel Consumer Template Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelConsumerTemplateFactoryBean#getMaximumCacheSize <em>Maximum Cache Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelConsumerTemplateFactoryBean()
 * @model abstract="true"
 *        extendedMetaData="name='abstractCamelConsumerTemplateFactoryBean' kind='empty'"
 * @generated
 */
public interface AbstractCamelConsumerTemplateFactoryBean extends AbstractCamelFactoryBean {
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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelConsumerTemplateFactoryBean_MaximumCacheSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='maximumCacheSize'"
	 * @generated
	 */
	int getMaximumCacheSize();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelConsumerTemplateFactoryBean#getMaximumCacheSize <em>Maximum Cache Size</em>}' attribute.
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
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelConsumerTemplateFactoryBean#getMaximumCacheSize <em>Maximum Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumCacheSize()
	 * @see #getMaximumCacheSize()
	 * @see #setMaximumCacheSize(int)
	 * @generated
	 */
	void unsetMaximumCacheSize();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelConsumerTemplateFactoryBean#getMaximumCacheSize <em>Maximum Cache Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Cache Size</em>' attribute is set.
	 * @see #unsetMaximumCacheSize()
	 * @see #getMaximumCacheSize()
	 * @see #setMaximumCacheSize(int)
	 * @generated
	 */
	boolean isSetMaximumCacheSize();

} // AbstractCamelConsumerTemplateFactoryBean
