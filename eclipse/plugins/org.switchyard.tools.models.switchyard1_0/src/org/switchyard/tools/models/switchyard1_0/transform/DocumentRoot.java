/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.transform;

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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformDozer <em>Transform Dozer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformJava <em>Transform Java</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformJaxb <em>Transform Jaxb</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformJson <em>Transform Json</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformSmooks <em>Transform Smooks</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformXslt <em>Transform Xslt</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getDocumentRoot()
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
     * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getDocumentRoot_Mixed()
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
     * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getDocumentRoot_XMLNSPrefixMap()
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
     * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getDocumentRoot_XSISchemaLocation()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
     * @generated
     */
	EMap<String, String> getXSISchemaLocation();

	/**
     * Returns the value of the '<em><b>Transform Dozer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transform Dozer</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transform Dozer</em>' containment reference.
     * @see #setTransformDozer(DozerTransformType)
     * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getDocumentRoot_TransformDozer()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='transform.dozer' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:2.0#transform'"
     * @generated
     */
    DozerTransformType getTransformDozer();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformDozer <em>Transform Dozer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transform Dozer</em>' containment reference.
     * @see #getTransformDozer()
     * @generated
     */
    void setTransformDozer(DozerTransformType value);

    /**
     * Returns the value of the '<em><b>Transform Java</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform Java</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Transform Java</em>' containment reference.
     * @see #setTransformJava(JavaTransformType1)
     * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getDocumentRoot_TransformJava()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='transform.java' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:2.0#transform'"
     * @generated
     */
	JavaTransformType1 getTransformJava();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformJava <em>Transform Java</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transform Java</em>' containment reference.
     * @see #getTransformJava()
     * @generated
     */
	void setTransformJava(JavaTransformType1 value);

	/**
     * Returns the value of the '<em><b>Transform Jaxb</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform Jaxb</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Transform Jaxb</em>' containment reference.
     * @see #setTransformJaxb(JAXBTransformType)
     * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getDocumentRoot_TransformJaxb()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='transform.jaxb' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:2.0#transform'"
     * @generated
     */
	JAXBTransformType getTransformJaxb();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformJaxb <em>Transform Jaxb</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transform Jaxb</em>' containment reference.
     * @see #getTransformJaxb()
     * @generated
     */
	void setTransformJaxb(JAXBTransformType value);

	/**
     * Returns the value of the '<em><b>Transform Json</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform Json</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Transform Json</em>' containment reference.
     * @see #setTransformJson(JsonTransformType)
     * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getDocumentRoot_TransformJson()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='transform.json' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:2.0#transform'"
     * @generated
     */
	JsonTransformType getTransformJson();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformJson <em>Transform Json</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transform Json</em>' containment reference.
     * @see #getTransformJson()
     * @generated
     */
	void setTransformJson(JsonTransformType value);

	/**
     * Returns the value of the '<em><b>Transform Smooks</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform Smooks</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Transform Smooks</em>' containment reference.
     * @see #setTransformSmooks(SmooksTransformType1)
     * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getDocumentRoot_TransformSmooks()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='transform.smooks' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:2.0#transform'"
     * @generated
     */
	SmooksTransformType1 getTransformSmooks();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformSmooks <em>Transform Smooks</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transform Smooks</em>' containment reference.
     * @see #getTransformSmooks()
     * @generated
     */
	void setTransformSmooks(SmooksTransformType1 value);

	/**
     * Returns the value of the '<em><b>Transform Xslt</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform Xslt</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Transform Xslt</em>' containment reference.
     * @see #setTransformXslt(XsltTransformType)
     * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getDocumentRoot_TransformXslt()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='transform.xslt' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:2.0#transform'"
     * @generated
     */
	XsltTransformType getTransformXslt();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.transform.DocumentRoot#getTransformXslt <em>Transform Xslt</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transform Xslt</em>' containment reference.
     * @see #getTransformXslt()
     * @generated
     */
	void setTransformXslt(XsltTransformType value);

} // DocumentRoot
