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
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getBindingSoap <em>Binding Soap</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getContextMapperSoap <em>Context Mapper Soap</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getMessageComposerSoap <em>Message Composer Soap</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getInterceptor <em>Interceptor</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getMtom <em>Mtom</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getEndpointConfig <em>Endpoint Config</em>}</li>
 * </ul>
 * </p>
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
     *        extendedMetaData="kind='element' name='binding.soap' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#binding.switchyard'"
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
     * Returns the value of the '<em><b>Context Mapper Soap</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Mapper Soap</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Mapper Soap</em>' containment reference.
     * @see #setContextMapperSoap(ContextMapperType)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getDocumentRoot_ContextMapperSoap()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='contextMapper' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#contextMapper'"
     * @generated
     */
    ContextMapperType getContextMapperSoap();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getContextMapperSoap <em>Context Mapper Soap</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Mapper Soap</em>' containment reference.
     * @see #getContextMapperSoap()
     * @generated
     */
    void setContextMapperSoap(ContextMapperType value);

    /**
     * Returns the value of the '<em><b>Message Composer Soap</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message Composer Soap</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message Composer Soap</em>' containment reference.
     * @see #setMessageComposerSoap(SOAPMessageComposerType)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getDocumentRoot_MessageComposerSoap()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='messageComposer' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#messageComposer'"
     * @generated
     */
    SOAPMessageComposerType getMessageComposerSoap();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getMessageComposerSoap <em>Message Composer Soap</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message Composer Soap</em>' containment reference.
     * @see #getMessageComposerSoap()
     * @generated
     */
    void setMessageComposerSoap(SOAPMessageComposerType value);

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
     * Returns the value of the '<em><b>Mtom</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mtom</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mtom</em>' reference.
     * @see #setMtom(MtomType)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getDocumentRoot_Mtom()
     * @model upper="-2"
     *        extendedMetaData="kind='element' name='mtom' namespace='##targetNamespace'"
     * @generated
     */
    MtomType getMtom();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getMtom <em>Mtom</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mtom</em>' reference.
     * @see #getMtom()
     * @generated
     */
    void setMtom(MtomType value);

    /**
     * Returns the value of the '<em><b>Endpoint Config</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Endpoint Config</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Endpoint Config</em>' reference.
     * @see #setEndpointConfig(EndpointConfigType)
     * @see org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage#getDocumentRoot_EndpointConfig()
     * @model upper="-2"
     *        extendedMetaData="kind='element' name='endpointConfig' namespace='##targetNamespace'"
     * @generated
     */
    EndpointConfigType getEndpointConfig();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot#getEndpointConfig <em>Endpoint Config</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Endpoint Config</em>' reference.
     * @see #getEndpointConfig()
     * @generated
     */
    void setEndpointConfig(EndpointConfigType value);

} // DocumentRoot
