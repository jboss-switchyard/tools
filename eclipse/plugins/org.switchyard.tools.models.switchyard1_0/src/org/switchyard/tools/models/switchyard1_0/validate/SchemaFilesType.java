/**
 */
package org.switchyard.tools.models.switchyard1_0.validate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Files Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.validate.SchemaFilesType#getEntryGroup <em>Entry Group</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.validate.SchemaFilesType#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage#getSchemaFilesType()
 * @model extendedMetaData="name='schemaFilesType' kind='elementOnly'"
 * @generated
 */
public interface SchemaFilesType extends EObject {
    /**
     * Returns the value of the '<em><b>Entry Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entry Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entry Group</em>' attribute list.
     * @see org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage#getSchemaFilesType_EntryGroup()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='entry:group' namespace='##targetNamespace'"
     * @generated
     */
    FeatureMap getEntryGroup();

    /**
     * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.validate.FileEntryType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entry</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entry</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage#getSchemaFilesType_Entry()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='entry' namespace='##targetNamespace' group='entry:group'"
     * @generated
     */
    EList<FileEntryType> getEntry();

} // SchemaFilesType
