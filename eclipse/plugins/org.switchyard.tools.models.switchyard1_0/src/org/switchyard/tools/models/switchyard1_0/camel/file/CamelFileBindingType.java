/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.file;

import org.switchyard.tools.models.switchyard1_0.camel.core.BaseCamelBinding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel File Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getDirectory <em>Directory</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getAutoCreate <em>Auto Create</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getFlatten <em>Flatten</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getConsume <em>Consume</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getProduce <em>Produce</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage#getCamelFileBindingType()
 * @model extendedMetaData="name='CamelFileBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelFileBindingType extends BaseCamelBinding {
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage#getCamelFileBindingType_Directory()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='directory' namespace='##targetNamespace'"
     * @generated
     */
    String getDirectory();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getDirectory <em>Directory</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage#getCamelFileBindingType_AutoCreate()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='autoCreate' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getAutoCreate();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getAutoCreate <em>Auto Create</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getAutoCreate <em>Auto Create</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAutoCreate()
     * @see #getAutoCreate()
     * @see #setAutoCreate(Boolean)
     * @generated
     */
    void unsetAutoCreate();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getAutoCreate <em>Auto Create</em>}' attribute is set.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage#getCamelFileBindingType_BufferSize()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='bufferSize' namespace='##targetNamespace'"
     * @generated
     */
    Integer getBufferSize();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getBufferSize <em>Buffer Size</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getBufferSize <em>Buffer Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBufferSize()
     * @see #getBufferSize()
     * @see #setBufferSize(Integer)
     * @generated
     */
    void unsetBufferSize();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getBufferSize <em>Buffer Size</em>}' attribute is set.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage#getCamelFileBindingType_FileName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='fileName' namespace='##targetNamespace'"
     * @generated
     */
    String getFileName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getFileName <em>File Name</em>}' attribute.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage#getCamelFileBindingType_Flatten()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='flatten' namespace='##targetNamespace'"
     * @generated
     */
    Boolean getFlatten();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getFlatten <em>Flatten</em>}' attribute.
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
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getFlatten <em>Flatten</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFlatten()
     * @see #getFlatten()
     * @see #setFlatten(Boolean)
     * @generated
     */
    void unsetFlatten();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getFlatten <em>Flatten</em>}' attribute is set.
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
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage#getCamelFileBindingType_Charset()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='charset' namespace='##targetNamespace'"
     * @generated
     */
    String getCharset();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getCharset <em>Charset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Charset</em>' attribute.
     * @see #getCharset()
     * @generated
     */
    void setCharset(String value);

    /**
     * Returns the value of the '<em><b>Consume</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Consume</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Consume</em>' containment reference.
     * @see #setConsume(FileConsumerType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage#getCamelFileBindingType_Consume()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='consume' namespace='##targetNamespace'"
     * @generated
     */
    FileConsumerType getConsume();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getConsume <em>Consume</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Consume</em>' containment reference.
     * @see #getConsume()
     * @generated
     */
    void setConsume(FileConsumerType value);

    /**
     * Returns the value of the '<em><b>Produce</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Produce</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Produce</em>' containment reference.
     * @see #setProduce(FileProducerType)
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage#getCamelFileBindingType_Produce()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='produce' namespace='##targetNamespace'"
     * @generated
     */
    FileProducerType getProduce();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getProduce <em>Produce</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Produce</em>' containment reference.
     * @see #getProduce()
     * @generated
     */
    void setProduce(FileProducerType value);

} // CamelFileBindingType
