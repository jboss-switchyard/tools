/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.soap;

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
 * </p>
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getBindingSoap <em>Binding Soap</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getInterceptor <em>Interceptor</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getDocumentRoot()
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
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getDocumentRoot_Mixed()
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
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getDocumentRoot_XMLNSPrefixMap()
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
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getDocumentRoot_XSISchemaLocation()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
     * @generated
     */
    EMap<String, String> getXSISchemaLocation();

    /**
     * Returns the value of the '<em><b>Binding Soap</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Binding Soap</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Soap</em>' containment reference.
     * @see #setBindingSoap(SOAPBindingType)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getDocumentRoot_BindingSoap()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding.soap' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:2.0#binding.switchyard'"
     * @generated
     */
    SOAPBindingType getBindingSoap();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getBindingSoap <em>Binding Soap</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding Soap</em>' containment reference.
     * @see #getBindingSoap()
     * @generated
     */
    void setBindingSoap(SOAPBindingType value);

    /**
     * Returns the value of the '<em><b>Interceptor</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interceptor</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interceptor</em>' containment reference.
     * @see #setInterceptor(InterceptorType)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getDocumentRoot_Interceptor()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='interceptor' namespace='##targetNamespace'"
     * @generated
     */
    InterceptorType getInterceptor();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getInterceptor <em>Interceptor</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interceptor</em>' containment reference.
     * @see #getInterceptor()
     * @generated
     */
    void setInterceptor(InterceptorType value);

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
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getDocumentRoot_Properties()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
     * @generated
     */
    PropertiesType getProperties();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getProperties <em>Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Properties</em>' containment reference.
     * @see #getProperties()
     * @generated
     */
    void setProperties(PropertiesType value);

    /**
     * Returns the value of the '<em><b>Property</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property</em>' containment reference.
     * @see #setProperty(PropertyType)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getDocumentRoot_Property()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
     * @generated
     */
    PropertyType getProperty();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getProperty <em>Property</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property</em>' containment reference.
     * @see #getProperty()
     * @generated
     */
    void setProperty(PropertyType value);

} // DocumentRoot
