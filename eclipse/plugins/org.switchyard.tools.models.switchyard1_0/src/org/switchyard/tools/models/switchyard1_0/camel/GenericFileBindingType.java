/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic File Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#getDirectory <em>Directory</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#isAutoCreate <em>Auto Create</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#isFlatten <em>Flatten</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#getCharset <em>Charset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileBindingType()
 * @model extendedMetaData="name='GenericFileBindingType' kind='elementOnly'"
 * @generated
 */
public interface GenericFileBindingType extends BaseCamelBinding {
    /**
     * Returns the value of the '<em><b>Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Directory</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Directory</em>' attribute.
     * @see #setDirectory(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileBindingType_Directory()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='directory' namespace='##targetNamespace'"
     * @generated
     */
    String getDirectory();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#getDirectory <em>Directory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Directory</em>' attribute.
     * @see #getDirectory()
     * @generated
     */
    void setDirectory(String value);

    /**
     * Returns the value of the '<em><b>Auto Create</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Auto Create</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Auto Create</em>' attribute.
     * @see #isSetAutoCreate()
     * @see #unsetAutoCreate()
     * @see #setAutoCreate(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileBindingType_AutoCreate()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='autoCreate' namespace='##targetNamespace'"
     * @generated
     */
    boolean isAutoCreate();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#isAutoCreate <em>Auto Create</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Auto Create</em>' attribute.
     * @see #isSetAutoCreate()
     * @see #unsetAutoCreate()
     * @see #isAutoCreate()
     * @generated
     */
    void setAutoCreate(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#isAutoCreate <em>Auto Create</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAutoCreate()
     * @see #isAutoCreate()
     * @see #setAutoCreate(boolean)
     * @generated
     */
    void unsetAutoCreate();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#isAutoCreate <em>Auto Create</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Auto Create</em>' attribute is set.
     * @see #unsetAutoCreate()
     * @see #isAutoCreate()
     * @see #setAutoCreate(boolean)
     * @generated
     */
    boolean isSetAutoCreate();

    /**
     * Returns the value of the '<em><b>Buffer Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Buffer Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Buffer Size</em>' attribute.
     * @see #setBufferSize(BigInteger)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileBindingType_BufferSize()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
     *        extendedMetaData="kind='element' name='bufferSize' namespace='##targetNamespace'"
     * @generated
     */
    BigInteger getBufferSize();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#getBufferSize <em>Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Buffer Size</em>' attribute.
     * @see #getBufferSize()
     * @generated
     */
    void setBufferSize(BigInteger value);

    /**
     * Returns the value of the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>File Name</em>' attribute.
     * @see #setFileName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileBindingType_FileName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='fileName' namespace='##targetNamespace'"
     * @generated
     */
    String getFileName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#getFileName <em>File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>File Name</em>' attribute.
     * @see #getFileName()
     * @generated
     */
    void setFileName(String value);

    /**
     * Returns the value of the '<em><b>Flatten</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flatten</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flatten</em>' attribute.
     * @see #isSetFlatten()
     * @see #unsetFlatten()
     * @see #setFlatten(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileBindingType_Flatten()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='flatten' namespace='##targetNamespace'"
     * @generated
     */
    boolean isFlatten();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#isFlatten <em>Flatten</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flatten</em>' attribute.
     * @see #isSetFlatten()
     * @see #unsetFlatten()
     * @see #isFlatten()
     * @generated
     */
    void setFlatten(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#isFlatten <em>Flatten</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFlatten()
     * @see #isFlatten()
     * @see #setFlatten(boolean)
     * @generated
     */
    void unsetFlatten();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#isFlatten <em>Flatten</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Flatten</em>' attribute is set.
     * @see #unsetFlatten()
     * @see #isFlatten()
     * @see #setFlatten(boolean)
     * @generated
     */
    boolean isSetFlatten();

    /**
     * Returns the value of the '<em><b>Charset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Charset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Charset</em>' attribute.
     * @see #setCharset(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getGenericFileBindingType_Charset()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='charset' namespace='##targetNamespace'"
     * @generated
     */
    String getCharset();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#getCharset <em>Charset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Charset</em>' attribute.
     * @see #getCharset()
     * @generated
     */
    void setCharset(String value);

} // GenericFileBindingType
