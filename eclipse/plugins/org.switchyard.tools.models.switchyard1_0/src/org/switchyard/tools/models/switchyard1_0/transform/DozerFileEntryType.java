/**
 */
package org.switchyard.tools.models.switchyard1_0.transform;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dozer File Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.DozerFileEntryType#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getDozerFileEntryType()
 * @model extendedMetaData="name='dozerFileEntryType' kind='empty'"
 * @generated
 */
public interface DozerFileEntryType extends EObject {
    /**
     * Returns the value of the '<em><b>File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>File</em>' attribute.
     * @see #setFile(String)
     * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getDozerFileEntryType_File()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='file'"
     * @generated
     */
    String getFile();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.transform.DozerFileEntryType#getFile <em>File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>File</em>' attribute.
     * @see #getFile()
     * @generated
     */
    void setFile(String value);

} // DozerFileEntryType
