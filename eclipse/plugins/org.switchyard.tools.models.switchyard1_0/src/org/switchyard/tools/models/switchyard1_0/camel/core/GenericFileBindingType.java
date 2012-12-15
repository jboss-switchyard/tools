/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic File Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getDirectory <em>Directory</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getAutoCreate <em>Auto Create</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getFlatten <em>Flatten</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getCharset <em>Charset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileBindingType()
 * @model abstract="true"
 *        extendedMetaData="name='GenericFileBindingType' kind='elementOnly'"
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileBindingType_Directory()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='directory' namespace='##targetNamespace'"
     * @generated
     */
    String getDirectory();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getDirectory <em>Directory</em>}' attribute.
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
     * @see #setAutoCreate(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileBindingType_AutoCreate()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='autoCreate' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getAutoCreate();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getAutoCreate <em>Auto Create</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Auto Create</em>' attribute.
     * @see #isSetAutoCreate()
     * @see #unsetAutoCreate()
     * @see #getAutoCreate()
     * @generated
     */
    void setAutoCreate(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getAutoCreate <em>Auto Create</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAutoCreate()
     * @see #getAutoCreate()
     * @see #setAutoCreate(Boolean)
     * @generated
     */
    void unsetAutoCreate();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getAutoCreate <em>Auto Create</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Auto Create</em>' attribute is set.
     * @see #unsetAutoCreate()
     * @see #getAutoCreate()
     * @see #setAutoCreate(Boolean)
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
     * @see #isSetBufferSize()
     * @see #unsetBufferSize()
     * @see #setBufferSize(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileBindingType_BufferSize()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='bufferSize' namespace='##targetNamespace'"
     * @generated
     */
    Integer getBufferSize();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getBufferSize <em>Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Buffer Size</em>' attribute.
     * @see #isSetBufferSize()
     * @see #unsetBufferSize()
     * @see #getBufferSize()
     * @generated
     */
    void setBufferSize(Integer value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getBufferSize <em>Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBufferSize()
     * @see #getBufferSize()
     * @see #setBufferSize(Integer)
     * @generated
     */
    void unsetBufferSize();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getBufferSize <em>Buffer Size</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Buffer Size</em>' attribute is set.
     * @see #unsetBufferSize()
     * @see #getBufferSize()
     * @see #setBufferSize(Integer)
     * @generated
     */
    boolean isSetBufferSize();

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
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileBindingType_FileName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='fileName' namespace='##targetNamespace'"
     * @generated
     */
    String getFileName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getFileName <em>File Name</em>}' attribute.
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
     * @see #setFlatten(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileBindingType_Flatten()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='flatten' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getFlatten();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getFlatten <em>Flatten</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flatten</em>' attribute.
     * @see #isSetFlatten()
     * @see #unsetFlatten()
     * @see #getFlatten()
     * @generated
     */
    void setFlatten(Boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getFlatten <em>Flatten</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFlatten()
     * @see #getFlatten()
     * @see #setFlatten(Boolean)
     * @generated
     */
    void unsetFlatten();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getFlatten <em>Flatten</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Flatten</em>' attribute is set.
     * @see #unsetFlatten()
     * @see #getFlatten()
     * @see #setFlatten(Boolean)
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getGenericFileBindingType_Charset()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='charset' namespace='##targetNamespace'"
     * @generated
     */
    String getCharset();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.GenericFileBindingType#getCharset <em>Charset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Charset</em>' attribute.
     * @see #getCharset()
     * @generated
     */
    void setCharset(String value);

} // GenericFileBindingType
