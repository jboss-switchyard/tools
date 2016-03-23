/**
 */
package org.switchyard.tools.models.switchyard1_0.transform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dozer Mapping Files Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 Dozer mapping file configuration.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.DozerMappingFilesType#getEntry <em>Entry</em>}</li>
 * </ul>
 *
 * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getDozerMappingFilesType()
 * @model extendedMetaData="name='dozerMappingFilesType' kind='elementOnly'"
 * @generated
 */
public interface DozerMappingFilesType extends EObject {
    /**
     * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.transform.DozerFileEntryType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entry</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entry</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getDozerMappingFilesType_Entry()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='entry' namespace='##targetNamespace'"
     * @generated
     */
    EList<DozerFileEntryType> getEntry();

} // DozerMappingFilesType
