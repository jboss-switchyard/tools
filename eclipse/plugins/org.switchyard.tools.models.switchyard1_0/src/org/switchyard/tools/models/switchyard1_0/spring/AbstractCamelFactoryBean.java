/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Camel Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelFactoryBean#getCamelContextId <em>Camel Context Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelFactoryBean()
 * @model abstract="true"
 *        extendedMetaData="name='abstractCamelFactoryBean' kind='empty'"
 * @generated
 */
public interface AbstractCamelFactoryBean extends IdentifiedType {
	/**
     * Returns the value of the '<em><b>Camel Context Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Camel Context Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Camel Context Id</em>' attribute.
     * @see #setCamelContextId(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getAbstractCamelFactoryBean_CamelContextId()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='camelContextId'"
     * @generated
     */
	String getCamelContextId();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelFactoryBean#getCamelContextId <em>Camel Context Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Camel Context Id</em>' attribute.
     * @see #getCamelContextId()
     * @generated
     */
	void setCamelContextId(String value);

} // AbstractCamelFactoryBean
