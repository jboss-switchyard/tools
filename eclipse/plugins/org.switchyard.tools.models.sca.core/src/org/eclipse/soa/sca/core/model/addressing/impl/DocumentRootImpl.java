/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.core.model.addressing.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.core.model.addressing.AddressingPackage;
import org.eclipse.soa.sca.core.model.addressing.AttributedQNameType;
import org.eclipse.soa.sca.core.model.addressing.AttributedURIType;
import org.eclipse.soa.sca.core.model.addressing.AttributedUnsignedLongType;
import org.eclipse.soa.sca.core.model.addressing.DocumentRoot;
import org.eclipse.soa.sca.core.model.addressing.EndpointReferenceType;
import org.eclipse.soa.sca.core.model.addressing.MetadataType;
import org.eclipse.soa.sca.core.model.addressing.ProblemActionType;
import org.eclipse.soa.sca.core.model.addressing.ReferenceParametersType;
import org.eclipse.soa.sca.core.model.addressing.RelatesToType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.impl.DocumentRootImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.impl.DocumentRootImpl#getEndpointReference <em>Endpoint Reference</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.impl.DocumentRootImpl#getFaultTo <em>Fault To</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.impl.DocumentRootImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.impl.DocumentRootImpl#getMessageID <em>Message ID</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.impl.DocumentRootImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.impl.DocumentRootImpl#getProblemAction <em>Problem Action</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.impl.DocumentRootImpl#getProblemHeaderQName <em>Problem Header QName</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.impl.DocumentRootImpl#getProblemIRI <em>Problem IRI</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.impl.DocumentRootImpl#getReferenceParameters <em>Reference Parameters</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.impl.DocumentRootImpl#getRelatesTo <em>Relates To</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.impl.DocumentRootImpl#getReplyTo <em>Reply To</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.impl.DocumentRootImpl#getRetryAfter <em>Retry After</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.impl.DocumentRootImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.impl.DocumentRootImpl#isIsReferenceParameter <em>Is Reference Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #isIsReferenceParameter() <em>Is Reference Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReferenceParameter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REFERENCE_PARAMETER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReferenceParameter() <em>Is Reference Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReferenceParameter()
	 * @generated
	 * @ordered
	 */
	protected boolean isReferenceParameter = IS_REFERENCE_PARAMETER_EDEFAULT;

	/**
	 * This is true if the Is Reference Parameter attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isReferenceParameterESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AddressingPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, AddressingPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, AddressingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, AddressingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedURIType getAction() {
		return (AttributedURIType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(AttributedURIType newAction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__ACTION, newAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(AttributedURIType newAction) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__ACTION, newAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointReferenceType getEndpointReference() {
		return (EndpointReferenceType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__ENDPOINT_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpointReference(EndpointReferenceType newEndpointReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__ENDPOINT_REFERENCE, newEndpointReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointReference(EndpointReferenceType newEndpointReference) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__ENDPOINT_REFERENCE, newEndpointReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointReferenceType getFaultTo() {
		return (EndpointReferenceType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__FAULT_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFaultTo(EndpointReferenceType newFaultTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__FAULT_TO, newFaultTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultTo(EndpointReferenceType newFaultTo) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__FAULT_TO, newFaultTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointReferenceType getFrom() {
		return (EndpointReferenceType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(EndpointReferenceType newFrom, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__FROM, newFrom, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(EndpointReferenceType newFrom) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__FROM, newFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedURIType getMessageID() {
		return (AttributedURIType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__MESSAGE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageID(AttributedURIType newMessageID, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__MESSAGE_ID, newMessageID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageID(AttributedURIType newMessageID) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__MESSAGE_ID, newMessageID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataType getMetadata() {
		return (MetadataType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__METADATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(MetadataType newMetadata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__METADATA, newMetadata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata(MetadataType newMetadata) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__METADATA, newMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemActionType getProblemAction() {
		return (ProblemActionType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProblemAction(ProblemActionType newProblemAction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_ACTION, newProblemAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblemAction(ProblemActionType newProblemAction) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_ACTION, newProblemAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedQNameType getProblemHeaderQName() {
		return (AttributedQNameType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProblemHeaderQName(AttributedQNameType newProblemHeaderQName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME, newProblemHeaderQName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblemHeaderQName(AttributedQNameType newProblemHeaderQName) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME, newProblemHeaderQName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedURIType getProblemIRI() {
		return (AttributedURIType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_IRI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProblemIRI(AttributedURIType newProblemIRI, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_IRI, newProblemIRI, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblemIRI(AttributedURIType newProblemIRI) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_IRI, newProblemIRI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceParametersType getReferenceParameters() {
		return (ReferenceParametersType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__REFERENCE_PARAMETERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceParameters(ReferenceParametersType newReferenceParameters, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__REFERENCE_PARAMETERS, newReferenceParameters, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceParameters(ReferenceParametersType newReferenceParameters) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__REFERENCE_PARAMETERS, newReferenceParameters);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatesToType getRelatesTo() {
		return (RelatesToType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__RELATES_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatesTo(RelatesToType newRelatesTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__RELATES_TO, newRelatesTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatesTo(RelatesToType newRelatesTo) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__RELATES_TO, newRelatesTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointReferenceType getReplyTo() {
		return (EndpointReferenceType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__REPLY_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplyTo(EndpointReferenceType newReplyTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__REPLY_TO, newReplyTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplyTo(EndpointReferenceType newReplyTo) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__REPLY_TO, newReplyTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedUnsignedLongType getRetryAfter() {
		return (AttributedUnsignedLongType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__RETRY_AFTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRetryAfter(AttributedUnsignedLongType newRetryAfter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__RETRY_AFTER, newRetryAfter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetryAfter(AttributedUnsignedLongType newRetryAfter) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__RETRY_AFTER, newRetryAfter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedURIType getTo() {
		return (AttributedURIType)getMixed().get(AddressingPackage.Literals.DOCUMENT_ROOT__TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(AttributedURIType newTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AddressingPackage.Literals.DOCUMENT_ROOT__TO, newTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(AttributedURIType newTo) {
		((FeatureMap.Internal)getMixed()).set(AddressingPackage.Literals.DOCUMENT_ROOT__TO, newTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReferenceParameter() {
		return isReferenceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReferenceParameter(boolean newIsReferenceParameter) {
		boolean oldIsReferenceParameter = isReferenceParameter;
		isReferenceParameter = newIsReferenceParameter;
		boolean oldIsReferenceParameterESet = isReferenceParameterESet;
		isReferenceParameterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressingPackage.DOCUMENT_ROOT__IS_REFERENCE_PARAMETER, oldIsReferenceParameter, isReferenceParameter, !oldIsReferenceParameterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsReferenceParameter() {
		boolean oldIsReferenceParameter = isReferenceParameter;
		boolean oldIsReferenceParameterESet = isReferenceParameterESet;
		isReferenceParameter = IS_REFERENCE_PARAMETER_EDEFAULT;
		isReferenceParameterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AddressingPackage.DOCUMENT_ROOT__IS_REFERENCE_PARAMETER, oldIsReferenceParameter, IS_REFERENCE_PARAMETER_EDEFAULT, oldIsReferenceParameterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsReferenceParameter() {
		return isReferenceParameterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AddressingPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case AddressingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case AddressingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case AddressingPackage.DOCUMENT_ROOT__ACTION:
				return basicSetAction(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__ENDPOINT_REFERENCE:
				return basicSetEndpointReference(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__FAULT_TO:
				return basicSetFaultTo(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__FROM:
				return basicSetFrom(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__MESSAGE_ID:
				return basicSetMessageID(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__METADATA:
				return basicSetMetadata(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_ACTION:
				return basicSetProblemAction(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME:
				return basicSetProblemHeaderQName(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_IRI:
				return basicSetProblemIRI(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__REFERENCE_PARAMETERS:
				return basicSetReferenceParameters(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__RELATES_TO:
				return basicSetRelatesTo(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__REPLY_TO:
				return basicSetReplyTo(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__RETRY_AFTER:
				return basicSetRetryAfter(null, msgs);
			case AddressingPackage.DOCUMENT_ROOT__TO:
				return basicSetTo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AddressingPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case AddressingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case AddressingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case AddressingPackage.DOCUMENT_ROOT__ACTION:
				return getAction();
			case AddressingPackage.DOCUMENT_ROOT__ENDPOINT_REFERENCE:
				return getEndpointReference();
			case AddressingPackage.DOCUMENT_ROOT__FAULT_TO:
				return getFaultTo();
			case AddressingPackage.DOCUMENT_ROOT__FROM:
				return getFrom();
			case AddressingPackage.DOCUMENT_ROOT__MESSAGE_ID:
				return getMessageID();
			case AddressingPackage.DOCUMENT_ROOT__METADATA:
				return getMetadata();
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_ACTION:
				return getProblemAction();
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME:
				return getProblemHeaderQName();
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_IRI:
				return getProblemIRI();
			case AddressingPackage.DOCUMENT_ROOT__REFERENCE_PARAMETERS:
				return getReferenceParameters();
			case AddressingPackage.DOCUMENT_ROOT__RELATES_TO:
				return getRelatesTo();
			case AddressingPackage.DOCUMENT_ROOT__REPLY_TO:
				return getReplyTo();
			case AddressingPackage.DOCUMENT_ROOT__RETRY_AFTER:
				return getRetryAfter();
			case AddressingPackage.DOCUMENT_ROOT__TO:
				return getTo();
			case AddressingPackage.DOCUMENT_ROOT__IS_REFERENCE_PARAMETER:
				return isIsReferenceParameter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AddressingPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__ACTION:
				setAction((AttributedURIType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__ENDPOINT_REFERENCE:
				setEndpointReference((EndpointReferenceType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__FAULT_TO:
				setFaultTo((EndpointReferenceType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__FROM:
				setFrom((EndpointReferenceType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__MESSAGE_ID:
				setMessageID((AttributedURIType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__METADATA:
				setMetadata((MetadataType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_ACTION:
				setProblemAction((ProblemActionType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME:
				setProblemHeaderQName((AttributedQNameType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_IRI:
				setProblemIRI((AttributedURIType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__REFERENCE_PARAMETERS:
				setReferenceParameters((ReferenceParametersType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__RELATES_TO:
				setRelatesTo((RelatesToType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__REPLY_TO:
				setReplyTo((EndpointReferenceType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__RETRY_AFTER:
				setRetryAfter((AttributedUnsignedLongType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__TO:
				setTo((AttributedURIType)newValue);
				return;
			case AddressingPackage.DOCUMENT_ROOT__IS_REFERENCE_PARAMETER:
				setIsReferenceParameter((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AddressingPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case AddressingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case AddressingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case AddressingPackage.DOCUMENT_ROOT__ACTION:
				setAction((AttributedURIType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__ENDPOINT_REFERENCE:
				setEndpointReference((EndpointReferenceType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__FAULT_TO:
				setFaultTo((EndpointReferenceType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__FROM:
				setFrom((EndpointReferenceType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__MESSAGE_ID:
				setMessageID((AttributedURIType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__METADATA:
				setMetadata((MetadataType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_ACTION:
				setProblemAction((ProblemActionType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME:
				setProblemHeaderQName((AttributedQNameType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_IRI:
				setProblemIRI((AttributedURIType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__REFERENCE_PARAMETERS:
				setReferenceParameters((ReferenceParametersType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__RELATES_TO:
				setRelatesTo((RelatesToType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__REPLY_TO:
				setReplyTo((EndpointReferenceType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__RETRY_AFTER:
				setRetryAfter((AttributedUnsignedLongType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__TO:
				setTo((AttributedURIType)null);
				return;
			case AddressingPackage.DOCUMENT_ROOT__IS_REFERENCE_PARAMETER:
				unsetIsReferenceParameter();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AddressingPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case AddressingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case AddressingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case AddressingPackage.DOCUMENT_ROOT__ACTION:
				return getAction() != null;
			case AddressingPackage.DOCUMENT_ROOT__ENDPOINT_REFERENCE:
				return getEndpointReference() != null;
			case AddressingPackage.DOCUMENT_ROOT__FAULT_TO:
				return getFaultTo() != null;
			case AddressingPackage.DOCUMENT_ROOT__FROM:
				return getFrom() != null;
			case AddressingPackage.DOCUMENT_ROOT__MESSAGE_ID:
				return getMessageID() != null;
			case AddressingPackage.DOCUMENT_ROOT__METADATA:
				return getMetadata() != null;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_ACTION:
				return getProblemAction() != null;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME:
				return getProblemHeaderQName() != null;
			case AddressingPackage.DOCUMENT_ROOT__PROBLEM_IRI:
				return getProblemIRI() != null;
			case AddressingPackage.DOCUMENT_ROOT__REFERENCE_PARAMETERS:
				return getReferenceParameters() != null;
			case AddressingPackage.DOCUMENT_ROOT__RELATES_TO:
				return getRelatesTo() != null;
			case AddressingPackage.DOCUMENT_ROOT__REPLY_TO:
				return getReplyTo() != null;
			case AddressingPackage.DOCUMENT_ROOT__RETRY_AFTER:
				return getRetryAfter() != null;
			case AddressingPackage.DOCUMENT_ROOT__TO:
				return getTo() != null;
			case AddressingPackage.DOCUMENT_ROOT__IS_REFERENCE_PARAMETER:
				return isSetIsReferenceParameter();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", isReferenceParameter: ");
		if (isReferenceParameterESet) result.append(isReferenceParameter); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
