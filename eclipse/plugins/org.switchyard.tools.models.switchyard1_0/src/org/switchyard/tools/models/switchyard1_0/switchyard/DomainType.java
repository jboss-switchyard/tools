/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DomainType#getTransforms <em>Transforms</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DomainType#getValidates <em>Validates</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DomainType#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DomainType#getSecurities <em>Securities</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DomainType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDomainType()
 * @model extendedMetaData="name='DomainType' kind='elementOnly'"
 * @generated
 */
public interface DomainType extends EObject {
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
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDomainType_Transforms()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='transforms' namespace='##targetNamespace'"
     * @generated
     */
	TransformsType getTransforms();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DomainType#getTransforms <em>Transforms</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDomainType_Validates()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='validates' namespace='##targetNamespace'"
     * @generated
     */
	ValidatesType getValidates();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DomainType#getValidates <em>Validates</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Validates</em>' containment reference.
     * @see #getValidates()
     * @generated
     */
	void setValidates(ValidatesType value);

	/**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference.
     * @see #setProperties(PropertiesType)
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDomainType_Properties()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
     * @generated
     */
	PropertiesType getProperties();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DomainType#getProperties <em>Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Properties</em>' containment reference.
     * @see #getProperties()
     * @generated
     */
	void setProperties(PropertiesType value);

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
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDomainType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
	String getName();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DomainType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
	void setName(String value);

    /**
     * Returns the value of the '<em><b>Securities</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Securities</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Securities</em>' containment reference.
     * @see #setSecurities(SecuritiesType)
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDomainType_Securities()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='securities' namespace='##targetNamespace'"
     * @generated
     */
    SecuritiesType getSecurities();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DomainType#getSecurities <em>Securities</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Securities</em>' containment reference.
     * @see #getSecurities()
     * @generated
     */
    void setSecurities(SecuritiesType value);

} // DomainType
