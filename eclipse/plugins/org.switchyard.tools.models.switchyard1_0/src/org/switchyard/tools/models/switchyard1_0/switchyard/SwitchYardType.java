/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.soa.sca.sca1_1.model.sca.Composite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Yard Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getName <em>Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getComposite <em>Composite</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getTransforms <em>Transforms</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getValidates <em>Validates</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getSwitchYardType()
 * @model extendedMetaData="name='SwitchYardType' kind='elementOnly'"
 * @generated
 */
public interface SwitchYardType extends EObject {
	/**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getSwitchYardType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
	String getName();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
	void setName(String value);

	/**
     * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Target Namespace</em>' attribute.
     * @see #setTargetNamespace(String)
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getSwitchYardType_TargetNamespace()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='targetNamespace'"
     * @generated
     */
	String getTargetNamespace();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getTargetNamespace <em>Target Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Namespace</em>' attribute.
     * @see #getTargetNamespace()
     * @generated
     */
	void setTargetNamespace(String value);

	/**
     * Returns the value of the '<em><b>Composite</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Composite</em>' containment reference.
     * @see #setComposite(Composite)
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getSwitchYardType_Composite()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='composite' namespace='http://docs.oasis-open.org/ns/opencsa/sca/200912'"
     * @generated
     */
	Composite getComposite();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getComposite <em>Composite</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Composite</em>' containment reference.
     * @see #getComposite()
     * @generated
     */
	void setComposite(Composite value);

	/**
     * Returns the value of the '<em><b>Transforms</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transforms</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Transforms</em>' containment reference.
     * @see #setTransforms(TransformsType)
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getSwitchYardType_Transforms()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='transforms' namespace='##targetNamespace'"
     * @generated
     */
	TransformsType getTransforms();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getTransforms <em>Transforms</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transforms</em>' containment reference.
     * @see #getTransforms()
     * @generated
     */
	void setTransforms(TransformsType value);

	/**
     * Returns the value of the '<em><b>Validates</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Validates</em>' containment reference.
     * @see #setValidates(ValidatesType)
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getSwitchYardType_Validates()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='validates' namespace='##targetNamespace'"
     * @generated
     */
	ValidatesType getValidates();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getValidates <em>Validates</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Validates</em>' containment reference.
     * @see #getValidates()
     * @generated
     */
	void setValidates(ValidatesType value);

	/**
     * Returns the value of the '<em><b>Domain</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Domain</em>' containment reference.
     * @see #setDomain(DomainType)
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getSwitchYardType_Domain()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='domain' namespace='##targetNamespace'"
     * @generated
     */
	DomainType getDomain();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getDomain <em>Domain</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Domain</em>' containment reference.
     * @see #getDomain()
     * @generated
     */
	void setDomain(DomainType value);

	/**
     * Returns the value of the '<em><b>Artifacts</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifacts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Artifacts</em>' containment reference.
     * @see #setArtifacts(ArtifactsType)
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getSwitchYardType_Artifacts()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='artifacts' namespace='##targetNamespace'"
     * @generated
     */
	ArtifactsType getArtifacts();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType#getArtifacts <em>Artifacts</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Artifacts</em>' containment reference.
     * @see #getArtifacts()
     * @generated
     */
	void setArtifacts(ArtifactsType value);

} // SwitchYardType
