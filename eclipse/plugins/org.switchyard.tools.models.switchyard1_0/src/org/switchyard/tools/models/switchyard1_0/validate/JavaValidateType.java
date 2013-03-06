/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.validate;

import org.switchyard.tools.models.switchyard1_0.switchyard.ValidateType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Validate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 Generic/Custom Java Validator Configuration.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.validate.JavaValidateType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.validate.JavaValidateType#getBean <em>Bean</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage#getJavaValidateType()
 * @model extendedMetaData="name='JavaValidateType' kind='empty'"
 * @generated
 */
public interface JavaValidateType extends ValidateType {

	/**
     * Returns the value of the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Class</em>' attribute.
     * @see #setClass(String)
     * @see org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage#getJavaValidateType_Class()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='class'"
     * @generated
     */
	String getClass_();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.validate.JavaValidateType#getClass_ <em>Class</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Class</em>' attribute.
     * @see #getClass_()
     * @generated
     */
	void setClass(String value);

    /**
     * Returns the value of the '<em><b>Bean</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bean</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bean</em>' attribute.
     * @see #setBean(String)
     * @see org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage#getJavaValidateType_Bean()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='bean'"
     * @generated
     */
    String getBean();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.validate.JavaValidateType#getBean <em>Bean</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bean</em>' attribute.
     * @see #getBean()
     * @generated
     */
    void setBean(String value);
} // JavaValidateType
