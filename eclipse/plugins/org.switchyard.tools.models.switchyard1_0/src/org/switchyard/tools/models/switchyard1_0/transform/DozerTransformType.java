/**
 */
package org.switchyard.tools.models.switchyard1_0.transform;

import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dozer Transform Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 Dozer Transformer Configuration.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.DozerTransformType#getMappingFiles <em>Mapping Files</em>}</li>
 * </ul>
 *
 * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getDozerTransformType()
 * @model extendedMetaData="name='DozerTransformType' kind='elementOnly'"
 * @generated
 */
public interface DozerTransformType extends TransformType {
    /**
     * Returns the value of the '<em><b>Mapping Files</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mapping Files</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mapping Files</em>' containment reference.
     * @see #setMappingFiles(DozerMappingFilesType)
     * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getDozerTransformType_MappingFiles()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='mappingFiles' namespace='##targetNamespace'"
     * @generated
     */
    DozerMappingFilesType getMappingFiles();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.transform.DozerTransformType#getMappingFiles <em>Mapping Files</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mapping Files</em>' containment reference.
     * @see #getMappingFiles()
     * @generated
     */
    void setMappingFiles(DozerMappingFilesType value);

} // DozerTransformType
