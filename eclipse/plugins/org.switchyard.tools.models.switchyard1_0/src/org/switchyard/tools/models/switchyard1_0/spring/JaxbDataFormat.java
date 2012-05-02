/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jaxb Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat#isFilterNonXmlChars <em>Filter Non Xml Chars</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat#isFragment <em>Fragment</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat#isIgnoreJAXBElement <em>Ignore JAXB Element</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat#getPartClass <em>Part Class</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat#getPartNamespace <em>Part Namespace</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat#isPrettyPrint <em>Pretty Print</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getJaxbDataFormat()
 * @model extendedMetaData="name='jaxbDataFormat' kind='empty'"
 * @generated
 */
public interface JaxbDataFormat extends DataFormat {
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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getJaxbDataFormat_ContextPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='contextPath'"
	 * @generated
	 */
	String getContextPath();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat#getContextPath <em>Context Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Path</em>' attribute.
	 * @see #getContextPath()
	 * @generated
	 */
	void setContextPath(String value);

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
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getJaxbDataFormat_Encoding()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='encoding'"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Filter Non Xml Chars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Non Xml Chars</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Non Xml Chars</em>' attribute.
	 * @see #isSetFilterNonXmlChars()
	 * @see #unsetFilterNonXmlChars()
	 * @see #setFilterNonXmlChars(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getJaxbDataFormat_FilterNonXmlChars()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='filterNonXmlChars'"
	 * @generated
	 */
	boolean isFilterNonXmlChars();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat#isFilterNonXmlChars <em>Filter Non Xml Chars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Non Xml Chars</em>' attribute.
	 * @see #isSetFilterNonXmlChars()
	 * @see #unsetFilterNonXmlChars()
	 * @see #isFilterNonXmlChars()
	 * @generated
	 */
	void setFilterNonXmlChars(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat#isFilterNonXmlChars <em>Filter Non Xml Chars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilterNonXmlChars()
	 * @see #isFilterNonXmlChars()
	 * @see #setFilterNonXmlChars(boolean)
	 * @generated
	 */
	void unsetFilterNonXmlChars();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat#isFilterNonXmlChars <em>Filter Non Xml Chars</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Filter Non Xml Chars</em>' attribute is set.
	 * @see #unsetFilterNonXmlChars()
	 * @see #isFilterNonXmlChars()
	 * @see #setFilterNonXmlChars(boolean)
	 * @generated
	 */
	boolean isSetFilterNonXmlChars();

	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragment</em>' attribute.
	 * @see #isSetFragment()
	 * @see #unsetFragment()
	 * @see #setFragment(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getJaxbDataFormat_Fragment()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='fragment'"
	 * @generated
	 */
	boolean isFragment();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat#isFragment <em>Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fragment</em>' attribute.
	 * @see #isSetFragment()
	 * @see #unsetFragment()
	 * @see #isFragment()
	 * @generated
	 */
	void setFragment(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat#isFragment <em>Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFragment()
	 * @see #isFragment()
	 * @see #setFragment(boolean)
	 * @generated
	 */
	void unsetFragment();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat#isFragment <em>Fragment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fragment</em>' attribute is set.
	 * @see #unsetFragment()
	 * @see #isFragment()
	 * @see #setFragment(boolean)
	 * @generated
	 */
	boolean isSetFragment();

	/**
	 * Returns the value of the '<em><b>Ignore JAXB Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore JAXB Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore JAXB Element</em>' attribute.
	 * @see #isSetIgnoreJAXBElement()
	 * @see #unsetIgnoreJAXBElement()
	 * @see #setIgnoreJAXBElement(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getJaxbDataFormat_IgnoreJAXBElement()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='ignoreJAXBElement'"
	 * @generated
	 */
	boolean isIgnoreJAXBElement();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat#isIgnoreJAXBElement <em>Ignore JAXB Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore JAXB Element</em>' attribute.
	 * @see #isSetIgnoreJAXBElement()
	 * @see #unsetIgnoreJAXBElement()
	 * @see #isIgnoreJAXBElement()
	 * @generated
	 */
	void setIgnoreJAXBElement(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat#isIgnoreJAXBElement <em>Ignore JAXB Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIgnoreJAXBElement()
	 * @see #isIgnoreJAXBElement()
	 * @see #setIgnoreJAXBElement(boolean)
	 * @generated
	 */
	void unsetIgnoreJAXBElement();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat#isIgnoreJAXBElement <em>Ignore JAXB Element</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ignore JAXB Element</em>' attribute is set.
	 * @see #unsetIgnoreJAXBElement()
	 * @see #isIgnoreJAXBElement()
	 * @see #setIgnoreJAXBElement(boolean)
	 * @generated
	 */
	boolean isSetIgnoreJAXBElement();

	/**
	 * Returns the value of the '<em><b>Part Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Class</em>' attribute.
	 * @see #setPartClass(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getJaxbDataFormat_PartClass()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='partClass'"
	 * @generated
	 */
	String getPartClass();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat#getPartClass <em>Part Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Class</em>' attribute.
	 * @see #getPartClass()
	 * @generated
	 */
	void setPartClass(String value);

	/**
	 * Returns the value of the '<em><b>Part Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Namespace</em>' attribute.
	 * @see #setPartNamespace(String)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getJaxbDataFormat_PartNamespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='partNamespace'"
	 * @generated
	 */
	String getPartNamespace();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat#getPartNamespace <em>Part Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Namespace</em>' attribute.
	 * @see #getPartNamespace()
	 * @generated
	 */
	void setPartNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Pretty Print</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pretty Print</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pretty Print</em>' attribute.
	 * @see #isSetPrettyPrint()
	 * @see #unsetPrettyPrint()
	 * @see #setPrettyPrint(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getJaxbDataFormat_PrettyPrint()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='prettyPrint'"
	 * @generated
	 */
	boolean isPrettyPrint();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat#isPrettyPrint <em>Pretty Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pretty Print</em>' attribute.
	 * @see #isSetPrettyPrint()
	 * @see #unsetPrettyPrint()
	 * @see #isPrettyPrint()
	 * @generated
	 */
	void setPrettyPrint(boolean value);

	/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat#isPrettyPrint <em>Pretty Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrettyPrint()
	 * @see #isPrettyPrint()
	 * @see #setPrettyPrint(boolean)
	 * @generated
	 */
	void unsetPrettyPrint();

	/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat#isPrettyPrint <em>Pretty Print</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pretty Print</em>' attribute is set.
	 * @see #unsetPrettyPrint()
	 * @see #isPrettyPrint()
	 * @see #setPrettyPrint(boolean)
	 * @generated
	 */
	boolean isSetPrettyPrint();

} // JaxbDataFormat
