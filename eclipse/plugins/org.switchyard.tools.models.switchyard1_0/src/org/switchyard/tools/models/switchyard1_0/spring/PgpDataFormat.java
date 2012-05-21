/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pgp Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.PgpDataFormat#isArmored <em>Armored</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.PgpDataFormat#isIntegrity <em>Integrity</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.PgpDataFormat#getKeyFileName <em>Key File Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.PgpDataFormat#getKeyUserid <em>Key Userid</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.PgpDataFormat#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getPgpDataFormat()
 * @model extendedMetaData="name='pgpDataFormat' kind='empty'"
 * @generated
 */
public interface PgpDataFormat extends DataFormat {
    /**
     * Returns the value of the '<em><b>Armored</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Armored</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Armored</em>' attribute.
     * @see #isSetArmored()
     * @see #unsetArmored()
     * @see #setArmored(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getPgpDataFormat_Armored()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='armored'"
     * @generated
     */
    boolean isArmored();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.PgpDataFormat#isArmored <em>Armored</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Armored</em>' attribute.
     * @see #isSetArmored()
     * @see #unsetArmored()
     * @see #isArmored()
     * @generated
     */
    void setArmored(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.PgpDataFormat#isArmored <em>Armored</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetArmored()
     * @see #isArmored()
     * @see #setArmored(boolean)
     * @generated
     */
    void unsetArmored();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.PgpDataFormat#isArmored <em>Armored</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Armored</em>' attribute is set.
     * @see #unsetArmored()
     * @see #isArmored()
     * @see #setArmored(boolean)
     * @generated
     */
    boolean isSetArmored();

    /**
     * Returns the value of the '<em><b>Integrity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Integrity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Integrity</em>' attribute.
     * @see #isSetIntegrity()
     * @see #unsetIntegrity()
     * @see #setIntegrity(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getPgpDataFormat_Integrity()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='integrity'"
     * @generated
     */
    boolean isIntegrity();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.PgpDataFormat#isIntegrity <em>Integrity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Integrity</em>' attribute.
     * @see #isSetIntegrity()
     * @see #unsetIntegrity()
     * @see #isIntegrity()
     * @generated
     */
    void setIntegrity(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.PgpDataFormat#isIntegrity <em>Integrity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIntegrity()
     * @see #isIntegrity()
     * @see #setIntegrity(boolean)
     * @generated
     */
    void unsetIntegrity();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.PgpDataFormat#isIntegrity <em>Integrity</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Integrity</em>' attribute is set.
     * @see #unsetIntegrity()
     * @see #isIntegrity()
     * @see #setIntegrity(boolean)
     * @generated
     */
    boolean isSetIntegrity();

    /**
     * Returns the value of the '<em><b>Key File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Key File Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Key File Name</em>' attribute.
     * @see #setKeyFileName(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getPgpDataFormat_KeyFileName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='keyFileName'"
     * @generated
     */
    String getKeyFileName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.PgpDataFormat#getKeyFileName <em>Key File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key File Name</em>' attribute.
     * @see #getKeyFileName()
     * @generated
     */
    void setKeyFileName(String value);

    /**
     * Returns the value of the '<em><b>Key Userid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Key Userid</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Key Userid</em>' attribute.
     * @see #setKeyUserid(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getPgpDataFormat_KeyUserid()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='keyUserid'"
     * @generated
     */
    String getKeyUserid();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.PgpDataFormat#getKeyUserid <em>Key Userid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key Userid</em>' attribute.
     * @see #getKeyUserid()
     * @generated
     */
    void setKeyUserid(String value);

    /**
     * Returns the value of the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Password</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Password</em>' attribute.
     * @see #setPassword(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getPgpDataFormat_Password()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='password'"
     * @generated
     */
    String getPassword();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.PgpDataFormat#getPassword <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Password</em>' attribute.
     * @see #getPassword()
     * @generated
     */
    void setPassword(String value);

} // PgpDataFormat
