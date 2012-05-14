/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Proxy Factory Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelProxyFactoryDefinition#getCamelContextId <em>Camel Context Id</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelProxyFactoryDefinition#getServiceInterface <em>Service Interface</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelProxyFactoryDefinition#getServiceRef <em>Service Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelProxyFactoryDefinition#getServiceUrl <em>Service Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelProxyFactoryDefinition()
 * @model extendedMetaData="name='camelProxyFactoryDefinition' kind='empty'"
 * @generated
 */
public interface CamelProxyFactoryDefinition extends IdentifiedType {
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelProxyFactoryDefinition_CamelContextId()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='camelContextId'"
     * @generated
     */
	String getCamelContextId();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelProxyFactoryDefinition#getCamelContextId <em>Camel Context Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Camel Context Id</em>' attribute.
     * @see #getCamelContextId()
     * @generated
     */
	void setCamelContextId(String value);

	/**
     * Returns the value of the '<em><b>Service Interface</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Service Interface</em>' attribute.
     * @see #setServiceInterface(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelProxyFactoryDefinition_ServiceInterface()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='serviceInterface'"
     * @generated
     */
	String getServiceInterface();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelProxyFactoryDefinition#getServiceInterface <em>Service Interface</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Interface</em>' attribute.
     * @see #getServiceInterface()
     * @generated
     */
	void setServiceInterface(String value);

	/**
     * Returns the value of the '<em><b>Service Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Service Ref</em>' attribute.
     * @see #setServiceRef(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelProxyFactoryDefinition_ServiceRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='serviceRef'"
     * @generated
     */
	String getServiceRef();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelProxyFactoryDefinition#getServiceRef <em>Service Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Ref</em>' attribute.
     * @see #getServiceRef()
     * @generated
     */
	void setServiceRef(String value);

	/**
     * Returns the value of the '<em><b>Service Url</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Service Url</em>' attribute.
     * @see #setServiceUrl(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelProxyFactoryDefinition_ServiceUrl()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='serviceUrl'"
     * @generated
     */
	String getServiceUrl();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelProxyFactoryDefinition#getServiceUrl <em>Service Url</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Url</em>' attribute.
     * @see #getServiceUrl()
     * @generated
     */
	void setServiceUrl(String value);

} // CamelProxyFactoryDefinition
