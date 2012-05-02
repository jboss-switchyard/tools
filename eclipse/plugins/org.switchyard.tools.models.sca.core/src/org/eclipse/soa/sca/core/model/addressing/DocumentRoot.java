/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.core.model.addressing;

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
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getEndpointReference <em>Endpoint Reference</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getFaultTo <em>Fault To</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getMessageID <em>Message ID</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getProblemAction <em>Problem Action</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getProblemHeaderQName <em>Problem Header QName</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getProblemIRI <em>Problem IRI</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getReferenceParameters <em>Reference Parameters</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getRelatesTo <em>Relates To</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getReplyTo <em>Reply To</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getRetryAfter <em>Retry After</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#isIsReferenceParameter <em>Is Reference Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getDocumentRoot()
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
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getDocumentRoot_Mixed()
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
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(AttributedURIType)
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getDocumentRoot_Action()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Action' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributedURIType getAction();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(AttributedURIType value);

	/**
	 * Returns the value of the '<em><b>Endpoint Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Reference</em>' containment reference.
	 * @see #setEndpointReference(EndpointReferenceType)
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getDocumentRoot_EndpointReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EndpointReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EndpointReferenceType getEndpointReference();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getEndpointReference <em>Endpoint Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Reference</em>' containment reference.
	 * @see #getEndpointReference()
	 * @generated
	 */
	void setEndpointReference(EndpointReferenceType value);

	/**
	 * Returns the value of the '<em><b>Fault To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault To</em>' containment reference.
	 * @see #setFaultTo(EndpointReferenceType)
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getDocumentRoot_FaultTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FaultTo' namespace='##targetNamespace'"
	 * @generated
	 */
	EndpointReferenceType getFaultTo();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getFaultTo <em>Fault To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault To</em>' containment reference.
	 * @see #getFaultTo()
	 * @generated
	 */
	void setFaultTo(EndpointReferenceType value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(EndpointReferenceType)
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getDocumentRoot_From()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='From' namespace='##targetNamespace'"
	 * @generated
	 */
	EndpointReferenceType getFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(EndpointReferenceType value);

	/**
	 * Returns the value of the '<em><b>Message ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message ID</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message ID</em>' containment reference.
	 * @see #setMessageID(AttributedURIType)
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getDocumentRoot_MessageID()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MessageID' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributedURIType getMessageID();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getMessageID <em>Message ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message ID</em>' containment reference.
	 * @see #getMessageID()
	 * @generated
	 */
	void setMessageID(AttributedURIType value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(MetadataType)
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getDocumentRoot_Metadata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	MetadataType getMetadata();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(MetadataType value);

	/**
	 * Returns the value of the '<em><b>Problem Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem Action</em>' containment reference.
	 * @see #setProblemAction(ProblemActionType)
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getDocumentRoot_ProblemAction()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProblemAction' namespace='##targetNamespace'"
	 * @generated
	 */
	ProblemActionType getProblemAction();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getProblemAction <em>Problem Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem Action</em>' containment reference.
	 * @see #getProblemAction()
	 * @generated
	 */
	void setProblemAction(ProblemActionType value);

	/**
	 * Returns the value of the '<em><b>Problem Header QName</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem Header QName</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem Header QName</em>' containment reference.
	 * @see #setProblemHeaderQName(AttributedQNameType)
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getDocumentRoot_ProblemHeaderQName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProblemHeaderQName' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributedQNameType getProblemHeaderQName();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getProblemHeaderQName <em>Problem Header QName</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem Header QName</em>' containment reference.
	 * @see #getProblemHeaderQName()
	 * @generated
	 */
	void setProblemHeaderQName(AttributedQNameType value);

	/**
	 * Returns the value of the '<em><b>Problem IRI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem IRI</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem IRI</em>' containment reference.
	 * @see #setProblemIRI(AttributedURIType)
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getDocumentRoot_ProblemIRI()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProblemIRI' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributedURIType getProblemIRI();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getProblemIRI <em>Problem IRI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem IRI</em>' containment reference.
	 * @see #getProblemIRI()
	 * @generated
	 */
	void setProblemIRI(AttributedURIType value);

	/**
	 * Returns the value of the '<em><b>Reference Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Parameters</em>' containment reference.
	 * @see #setReferenceParameters(ReferenceParametersType)
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getDocumentRoot_ReferenceParameters()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReferenceParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceParametersType getReferenceParameters();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getReferenceParameters <em>Reference Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Parameters</em>' containment reference.
	 * @see #getReferenceParameters()
	 * @generated
	 */
	void setReferenceParameters(ReferenceParametersType value);

	/**
	 * Returns the value of the '<em><b>Relates To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relates To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relates To</em>' containment reference.
	 * @see #setRelatesTo(RelatesToType)
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getDocumentRoot_RelatesTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RelatesTo' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatesToType getRelatesTo();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getRelatesTo <em>Relates To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relates To</em>' containment reference.
	 * @see #getRelatesTo()
	 * @generated
	 */
	void setRelatesTo(RelatesToType value);

	/**
	 * Returns the value of the '<em><b>Reply To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reply To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply To</em>' containment reference.
	 * @see #setReplyTo(EndpointReferenceType)
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getDocumentRoot_ReplyTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReplyTo' namespace='##targetNamespace'"
	 * @generated
	 */
	EndpointReferenceType getReplyTo();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getReplyTo <em>Reply To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply To</em>' containment reference.
	 * @see #getReplyTo()
	 * @generated
	 */
	void setReplyTo(EndpointReferenceType value);

	/**
	 * Returns the value of the '<em><b>Retry After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retry After</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry After</em>' containment reference.
	 * @see #setRetryAfter(AttributedUnsignedLongType)
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getDocumentRoot_RetryAfter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RetryAfter' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributedUnsignedLongType getRetryAfter();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getRetryAfter <em>Retry After</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry After</em>' containment reference.
	 * @see #getRetryAfter()
	 * @generated
	 */
	void setRetryAfter(AttributedUnsignedLongType value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(AttributedURIType)
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getDocumentRoot_To()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='To' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributedURIType getTo();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(AttributedURIType value);

	/**
	 * Returns the value of the '<em><b>Is Reference Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Reference Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reference Parameter</em>' attribute.
	 * @see #isSetIsReferenceParameter()
	 * @see #unsetIsReferenceParameter()
	 * @see #setIsReferenceParameter(boolean)
	 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage#getDocumentRoot_IsReferenceParameter()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsReferenceParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsReferenceParameter();

	/**
	 * Sets the value of the '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#isIsReferenceParameter <em>Is Reference Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reference Parameter</em>' attribute.
	 * @see #isSetIsReferenceParameter()
	 * @see #unsetIsReferenceParameter()
	 * @see #isIsReferenceParameter()
	 * @generated
	 */
	void setIsReferenceParameter(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#isIsReferenceParameter <em>Is Reference Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsReferenceParameter()
	 * @see #isIsReferenceParameter()
	 * @see #setIsReferenceParameter(boolean)
	 * @generated
	 */
	void unsetIsReferenceParameter();

	/**
	 * Returns whether the value of the '{@link org.eclipse.soa.sca.core.model.addressing.DocumentRoot#isIsReferenceParameter <em>Is Reference Parameter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Reference Parameter</em>' attribute is set.
	 * @see #unsetIsReferenceParameter()
	 * @see #isIsReferenceParameter()
	 * @see #setIsReferenceParameter(boolean)
	 * @generated
	 */
	boolean isSetIsReferenceParameter();

} // DocumentRoot
