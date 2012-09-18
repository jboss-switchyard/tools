/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.commonselector;

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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonselector.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonselector.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonselector.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonselector.DocumentRoot#getStaticOperationSelector <em>Static Operation Selector</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonselector.DocumentRoot#getXpathOperationSelector <em>Xpath Operation Selector</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonselector.DocumentRoot#getRegexOperationSelector <em>Regex Operation Selector</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonselector.DocumentRoot#getJavaOperationSelector <em>Java Operation Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.commonselector.CommonselectorPackage#getDocumentRoot()
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
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.CommonselectorPackage#getDocumentRoot_Mixed()
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
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.CommonselectorPackage#getDocumentRoot_XMLNSPrefixMap()
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
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.CommonselectorPackage#getDocumentRoot_XSISchemaLocation()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
     * @generated
     */
    EMap<String, String> getXSISchemaLocation();

    /**
     * Returns the value of the '<em><b>Static Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Static Operation Selector</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Static Operation Selector</em>' containment reference.
     * @see #setStaticOperationSelector(StaticOperationSelectorType)
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.CommonselectorPackage#getDocumentRoot_StaticOperationSelector()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='operationSelector' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#operationSelector.switchyard'"
     * @generated
     */
    StaticOperationSelectorType getStaticOperationSelector();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.commonselector.DocumentRoot#getStaticOperationSelector <em>Static Operation Selector</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Static Operation Selector</em>' containment reference.
     * @see #getStaticOperationSelector()
     * @generated
     */
    void setStaticOperationSelector(StaticOperationSelectorType value);

    /**
     * Returns the value of the '<em><b>Xpath Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xpath Operation Selector</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xpath Operation Selector</em>' containment reference.
     * @see #setXpathOperationSelector(XPathOperationSelectorType)
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.CommonselectorPackage#getDocumentRoot_XpathOperationSelector()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='operationSelector.xpath' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#operationSelector.switchyard'"
     * @generated
     */
    XPathOperationSelectorType getXpathOperationSelector();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.commonselector.DocumentRoot#getXpathOperationSelector <em>Xpath Operation Selector</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xpath Operation Selector</em>' containment reference.
     * @see #getXpathOperationSelector()
     * @generated
     */
    void setXpathOperationSelector(XPathOperationSelectorType value);

    /**
     * Returns the value of the '<em><b>Regex Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Regex Operation Selector</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Regex Operation Selector</em>' containment reference.
     * @see #setRegexOperationSelector(RegexOperationSelectorType)
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.CommonselectorPackage#getDocumentRoot_RegexOperationSelector()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='operationSelector.regex' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#operationSelector.switchyard'"
     * @generated
     */
    RegexOperationSelectorType getRegexOperationSelector();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.commonselector.DocumentRoot#getRegexOperationSelector <em>Regex Operation Selector</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Regex Operation Selector</em>' containment reference.
     * @see #getRegexOperationSelector()
     * @generated
     */
    void setRegexOperationSelector(RegexOperationSelectorType value);

    /**
     * Returns the value of the '<em><b>Java Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Java Operation Selector</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Java Operation Selector</em>' containment reference.
     * @see #setJavaOperationSelector(JavaOperationSelectorType)
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.CommonselectorPackage#getDocumentRoot_JavaOperationSelector()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='operationSelector.java' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#operationSelector.switchyard'"
     * @generated
     */
    JavaOperationSelectorType getJavaOperationSelector();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.commonselector.DocumentRoot#getJavaOperationSelector <em>Java Operation Selector</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Java Operation Selector</em>' containment reference.
     * @see #getJavaOperationSelector()
     * @generated
     */
    void setJavaOperationSelector(JavaOperationSelectorType value);

} // DocumentRoot
