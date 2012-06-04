/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contribution Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.ContributionType#getDeployable <em>Deployable</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.ContributionType#getImportBaseGroup <em>Import Base Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.ContributionType#getImportBase <em>Import Base</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.ContributionType#getExportBaseGroup <em>Export Base Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.ContributionType#getExportBase <em>Export Base</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.ContributionType#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getContributionType()
 * @model extendedMetaData="name='ContributionType' kind='elementOnly'"
 * @generated
 */
public interface ContributionType extends CommonExtensionBase {
	/**
     * Returns the value of the '<em><b>Deployable</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.DeployableType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Deployable</em>' containment reference list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getContributionType_Deployable()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='deployable' namespace='##targetNamespace'"
     * @generated
     */
	EList<DeployableType> getDeployable();

	/**
     * Returns the value of the '<em><b>Import Base Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Base Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Import Base Group</em>' attribute list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getContributionType_ImportBaseGroup()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='importBase:group' namespace='##targetNamespace'"
     * @generated
     */
	FeatureMap getImportBaseGroup();

	/**
     * Returns the value of the '<em><b>Import Base</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.Import}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Base</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Import Base</em>' containment reference list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getContributionType_ImportBase()
     * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='importBase' namespace='##targetNamespace' group='importBase:group'"
     * @generated
     */
	EList<Import> getImportBase();

	/**
     * Returns the value of the '<em><b>Export Base Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export Base Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Export Base Group</em>' attribute list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getContributionType_ExportBaseGroup()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='exportBase:group' namespace='##targetNamespace'"
     * @generated
     */
	FeatureMap getExportBaseGroup();

	/**
     * Returns the value of the '<em><b>Export Base</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.soa.sca.sca1_1.model.sca.Export}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export Base</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Export Base</em>' containment reference list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getContributionType_ExportBase()
     * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='exportBase' namespace='##targetNamespace' group='exportBase:group'"
     * @generated
     */
	EList<Export> getExportBase();

	/**
     * Returns the value of the '<em><b>Any</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Any</em>' attribute list.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getContributionType_Any()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':7' processing='lax'"
     * @generated
     */
	FeatureMap getAny();

} // ContributionType
