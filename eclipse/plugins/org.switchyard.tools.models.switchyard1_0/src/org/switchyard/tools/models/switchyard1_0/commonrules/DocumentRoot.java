/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.commonrules;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot#getAudit <em>Audit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot#getImplementationCommonRules <em>Implementation Common Rules</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot#getAudit1 <em>Audit1</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot#getImplementationCommonRules1 <em>Implementation Common Rules1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
     * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Mixed</em>' attribute list.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getDocumentRoot_Mixed()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' name=':mixed'"
     * @generated
     */
	FeatureMap getMixed();

	/**
     * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>XMLNS Prefix Map</em>' map.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getDocumentRoot_XMLNSPrefixMap()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
     * @generated
     */
	EMap<String, String> getXMLNSPrefixMap();

	/**
     * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>XSI Schema Location</em>' map.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getDocumentRoot_XSISchemaLocation()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
     * @generated
     */
	EMap<String, String> getXSISchemaLocation();

	/**
     * Returns the value of the '<em><b>Audit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Audit</em>' attribute.
     * @see #setAudit(Object)
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getDocumentRoot_Audit()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='audit' namespace='##targetNamespace'"
     * @generated
     */
	Object getAudit();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot#getAudit <em>Audit</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Audit</em>' attribute.
     * @see #getAudit()
     * @generated
     */
	void setAudit(Object value);

	/**
     * Returns the value of the '<em><b>Implementation Common Rules</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Common Rules</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Implementation Common Rules</em>' attribute.
     * @see #setImplementationCommonRules(Object)
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getDocumentRoot_ImplementationCommonRules()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='implementation.common.rules' namespace='##targetNamespace'"
     * @generated
     */
	Object getImplementationCommonRules();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot#getImplementationCommonRules <em>Implementation Common Rules</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Implementation Common Rules</em>' attribute.
     * @see #getImplementationCommonRules()
     * @generated
     */
	void setImplementationCommonRules(Object value);

	/**
     * Returns the value of the '<em><b>Audit1</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audit1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Audit1</em>' attribute.
     * @see #setAudit1(Object)
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getDocumentRoot_Audit1()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='audit' namespace='##targetNamespace'"
     * @generated
     */
	Object getAudit1();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot#getAudit1 <em>Audit1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Audit1</em>' attribute.
     * @see #getAudit1()
     * @generated
     */
	void setAudit1(Object value);

	/**
     * Returns the value of the '<em><b>Implementation Common Rules1</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Common Rules1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Implementation Common Rules1</em>' attribute.
     * @see #setImplementationCommonRules1(Object)
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getDocumentRoot_ImplementationCommonRules1()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='implementation.common.rules' namespace='##targetNamespace'"
     * @generated
     */
	Object getImplementationCommonRules1();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.DocumentRoot#getImplementationCommonRules1 <em>Implementation Common Rules1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Implementation Common Rules1</em>' attribute.
     * @see #getImplementationCommonRules1()
     * @generated
     */
	void setImplementationCommonRules1(Object value);

} // DocumentRoot
