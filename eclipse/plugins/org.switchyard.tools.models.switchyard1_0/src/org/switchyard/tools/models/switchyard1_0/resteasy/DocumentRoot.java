/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.resteasy;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.switchyard.tools.models.switchyard1_0.http.ProxyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.DocumentRoot#getBindingREST <em>Binding REST</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.DocumentRoot#getContextMapper <em>Context Mapper</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.DocumentRoot#getMessageComposer <em>Message Composer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.resteasy.DocumentRoot#getProxy <em>Proxy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage#getDocumentRoot()
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
     * @see org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage#getDocumentRoot_Mixed()
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
     * @see org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage#getDocumentRoot_XMLNSPrefixMap()
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
     * @see org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage#getDocumentRoot_XSISchemaLocation()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
     * @generated
     */
    EMap<String, String> getXSISchemaLocation();

    /**
     * Returns the value of the '<em><b>Binding REST</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Binding REST</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Binding REST</em>' containment reference.
     * @see #setBindingREST(RESTBindingType)
     * @see org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage#getDocumentRoot_BindingREST()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding.rest' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#binding.switchyard'"
     * @generated
     */
    RESTBindingType getBindingREST();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.resteasy.DocumentRoot#getBindingREST <em>Binding REST</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding REST</em>' containment reference.
     * @see #getBindingREST()
     * @generated
     */
    void setBindingREST(RESTBindingType value);

    /**
     * Returns the value of the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Mapper</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Mapper</em>' containment reference.
     * @see #setContextMapper(RESTContextMapperType)
     * @see org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage#getDocumentRoot_ContextMapper()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='contextMapper' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#contextMapper'"
     * @generated
     */
    RESTContextMapperType getContextMapper();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.resteasy.DocumentRoot#getContextMapper <em>Context Mapper</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Mapper</em>' containment reference.
     * @see #getContextMapper()
     * @generated
     */
    void setContextMapper(RESTContextMapperType value);

    /**
     * Returns the value of the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message Composer</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message Composer</em>' containment reference.
     * @see #setMessageComposer(RESTMessageComposerType)
     * @see org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage#getDocumentRoot_MessageComposer()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='messageComposer' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#messageComposer'"
     * @generated
     */
    RESTMessageComposerType getMessageComposer();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.resteasy.DocumentRoot#getMessageComposer <em>Message Composer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message Composer</em>' containment reference.
     * @see #getMessageComposer()
     * @generated
     */
    void setMessageComposer(RESTMessageComposerType value);

    /**
     * Returns the value of the '<em><b>Proxy</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Proxy</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Proxy</em>' containment reference.
     * @see #setProxy(org.switchyard.tools.models.switchyard1_0.resteasy.ProxyType)
     * @see org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage#getDocumentRoot_Proxy()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='proxy' namespace='##targetNamespace'"
     * @generated
     */
    org.switchyard.tools.models.switchyard1_0.resteasy.ProxyType getProxy();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.resteasy.DocumentRoot#getProxy <em>Proxy</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Proxy</em>' containment reference.
     * @see #getProxy()
     * @generated
     */
    void setProxy(org.switchyard.tools.models.switchyard1_0.resteasy.ProxyType value);

} // DocumentRoot
