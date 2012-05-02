/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Soap Jaxb Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SoapJaxbDataFormat#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SoapJaxbDataFormat#getElementNameStrategyRef <em>Element Name Strategy Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.SoapJaxbDataFormat#getEncoding <em>Encoding</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSoapJaxbDataFormat()
 * @model extendedMetaData="name='soapJaxbDataFormat' kind='empty'"
 * @generated
 */
public interface SoapJaxbDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Path</em>' attribute.
	 * @see #setContextPath(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSoapJaxbDataFormat_ContextPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='contextPath'"
	 * @generated
	 */
	String getContextPath();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SoapJaxbDataFormat#getContextPath <em>Context Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Path</em>' attribute.
	 * @see #getContextPath()
	 * @generated
	 */
	void setContextPath(String value);

	/**
	 * Returns the value of the '<em><b>Element Name Strategy Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Name Strategy Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Name Strategy Ref</em>' attribute.
	 * @see #setElementNameStrategyRef(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSoapJaxbDataFormat_ElementNameStrategyRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='elementNameStrategyRef'"
	 * @generated
	 */
	String getElementNameStrategyRef();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SoapJaxbDataFormat#getElementNameStrategyRef <em>Element Name Strategy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name Strategy Ref</em>' attribute.
	 * @see #getElementNameStrategyRef()
	 * @generated
	 */
	void setElementNameStrategyRef(String value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getSoapJaxbDataFormat_Encoding()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='encoding'"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.SoapJaxbDataFormat#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

} // SoapJaxbDataFormat
