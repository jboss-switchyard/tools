/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifacts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactsType#getArtifact <em>Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getArtifactsType()
 * @model extendedMetaData="name='ArtifactsType' kind='elementOnly'"
 * @generated
 */
public interface ArtifactsType extends EObject {
	/**
     * Returns the value of the '<em><b>Artifact</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Artifact</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getArtifactsType_Artifact()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='artifact' namespace='##targetNamespace'"
     * @generated
     */
	EList<ArtifactType> getArtifact();

} // ArtifactsType
