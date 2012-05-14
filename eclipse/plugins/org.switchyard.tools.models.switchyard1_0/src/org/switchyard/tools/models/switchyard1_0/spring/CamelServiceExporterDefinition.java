/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Service Exporter Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelServiceExporterDefinition#getCamelContextId <em>Camel Context Id</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelServiceExporterDefinition#getServiceInterface <em>Service Interface</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelServiceExporterDefinition#getServiceRef <em>Service Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CamelServiceExporterDefinition#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelServiceExporterDefinition()
 * @model extendedMetaData="name='camelServiceExporterDefinition' kind='empty'"
 * @generated
 */
public interface CamelServiceExporterDefinition extends IdentifiedType {
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelServiceExporterDefinition_CamelContextId()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='camelContextId'"
     * @generated
     */
	String getCamelContextId();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelServiceExporterDefinition#getCamelContextId <em>Camel Context Id</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelServiceExporterDefinition_ServiceInterface()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='serviceInterface'"
     * @generated
     */
	String getServiceInterface();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelServiceExporterDefinition#getServiceInterface <em>Service Interface</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelServiceExporterDefinition_ServiceRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='serviceRef'"
     * @generated
     */
	String getServiceRef();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelServiceExporterDefinition#getServiceRef <em>Service Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Ref</em>' attribute.
     * @see #getServiceRef()
     * @generated
     */
	void setServiceRef(String value);

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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCamelServiceExporterDefinition_Uri()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='uri'"
     * @generated
     */
	String getUri();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CamelServiceExporterDefinition#getUri <em>Uri</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uri</em>' attribute.
     * @see #getUri()
     * @generated
     */
	void setUri(String value);

} // CamelServiceExporterDefinition
