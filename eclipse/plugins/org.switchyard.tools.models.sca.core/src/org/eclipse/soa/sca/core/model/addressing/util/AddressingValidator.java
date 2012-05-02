/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.core.model.addressing.util;

import java.util.Collection;
import java.util.Map;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.soa.sca.core.model.addressing.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.soa.sca.core.model.addressing.AddressingPackage
 * @generated
 */
public class AddressingValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AddressingValidator INSTANCE = new AddressingValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.soa.sca.core.model.addressing";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressingValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AddressingPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AddressingPackage.ATTRIBUTED_QNAME_TYPE:
				return validateAttributedQNameType((AttributedQNameType)value, diagnostics, context);
			case AddressingPackage.ATTRIBUTED_UNSIGNED_LONG_TYPE:
				return validateAttributedUnsignedLongType((AttributedUnsignedLongType)value, diagnostics, context);
			case AddressingPackage.ATTRIBUTED_URI_TYPE:
				return validateAttributedURIType((AttributedURIType)value, diagnostics, context);
			case AddressingPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE:
				return validateEndpointReferenceType((EndpointReferenceType)value, diagnostics, context);
			case AddressingPackage.METADATA_TYPE:
				return validateMetadataType((MetadataType)value, diagnostics, context);
			case AddressingPackage.PROBLEM_ACTION_TYPE:
				return validateProblemActionType((ProblemActionType)value, diagnostics, context);
			case AddressingPackage.REFERENCE_PARAMETERS_TYPE:
				return validateReferenceParametersType((ReferenceParametersType)value, diagnostics, context);
			case AddressingPackage.RELATES_TO_TYPE:
				return validateRelatesToType((RelatesToType)value, diagnostics, context);
			case AddressingPackage.RELATIONSHIP_TYPE:
				return validateRelationshipType((RelationshipType)value, diagnostics, context);
			case AddressingPackage.FAULT_CODES_OPEN_ENUM_TYPE:
				return validateFaultCodesOpenEnumType((QName)value, diagnostics, context);
			case AddressingPackage.FAULT_CODES_TYPE:
				return validateFaultCodesType((QName)value, diagnostics, context);
			case AddressingPackage.RELATIONSHIP_TYPE_OBJECT:
				return validateRelationshipTypeObject((RelationshipType)value, diagnostics, context);
			case AddressingPackage.RELATIONSHIP_TYPE_OPEN_ENUM:
				return validateRelationshipTypeOpenEnum(value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributedQNameType(AttributedQNameType attributedQNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributedQNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributedUnsignedLongType(AttributedUnsignedLongType attributedUnsignedLongType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributedUnsignedLongType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributedURIType(AttributedURIType attributedURIType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributedURIType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpointReferenceType(EndpointReferenceType endpointReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endpointReferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetadataType(MetadataType metadataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metadataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemActionType(ProblemActionType problemActionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(problemActionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceParametersType(ReferenceParametersType referenceParametersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceParametersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatesToType(RelatesToType relatesToType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatesToType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipType(RelationshipType relationshipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFaultCodesOpenEnumType(QName faultCodesOpenEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFaultCodesOpenEnumType_MemberTypes(faultCodesOpenEnumType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Fault Codes Open Enum Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFaultCodesOpenEnumType_MemberTypes(QName faultCodesOpenEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (AddressingPackage.Literals.FAULT_CODES_TYPE.isInstance(faultCodesOpenEnumType)) {
				if (validateFaultCodesType(faultCodesOpenEnumType, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.QNAME.isInstance(faultCodesOpenEnumType)) {
				if (xmlTypeValidator.validateQName(faultCodesOpenEnumType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (AddressingPackage.Literals.FAULT_CODES_TYPE.isInstance(faultCodesOpenEnumType)) {
				if (validateFaultCodesType(faultCodesOpenEnumType, null, context)) return true;
			}
			if (XMLTypePackage.Literals.QNAME.isInstance(faultCodesOpenEnumType)) {
				if (xmlTypeValidator.validateQName(faultCodesOpenEnumType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFaultCodesType(QName faultCodesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFaultCodesType_Enumeration(faultCodesType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFaultCodesType_Enumeration
	 */
	public static final Collection<Object> FAULT_CODES_TYPE__ENUMERATION__VALUES =
		wrapEnumerationValues
			(new Object[] {
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType(), "{http://www.w3.org/2005/08/addressing}InvalidAddressingHeader"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType(), "{http://www.w3.org/2005/08/addressing}InvalidAddress"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType(), "{http://www.w3.org/2005/08/addressing}InvalidEPR"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType(), "{http://www.w3.org/2005/08/addressing}InvalidCardinality"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType(), "{http://www.w3.org/2005/08/addressing}MissingAddressInEPR"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType(), "{http://www.w3.org/2005/08/addressing}DuplicateMessageID"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType(), "{http://www.w3.org/2005/08/addressing}ActionMismatch"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType(), "{http://www.w3.org/2005/08/addressing}MessageAddressingHeaderRequired"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType(), "{http://www.w3.org/2005/08/addressing}DestinationUnreachable"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType(), "{http://www.w3.org/2005/08/addressing}ActionNotSupported"),
				 AddressingFactory.eINSTANCE.createFromString(AddressingPackage.eINSTANCE.getFaultCodesType(), "{http://www.w3.org/2005/08/addressing}EndpointUnavailable")
			 });

	/**
	 * Validates the Enumeration constraint of '<em>Fault Codes Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFaultCodesType_Enumeration(QName faultCodesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = FAULT_CODES_TYPE__ENUMERATION__VALUES.contains(faultCodesType);
		if (!result && diagnostics != null)
			reportEnumerationViolation(AddressingPackage.Literals.FAULT_CODES_TYPE, faultCodesType, FAULT_CODES_TYPE__ENUMERATION__VALUES, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipTypeObject(RelationshipType relationshipTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipTypeOpenEnum(Object relationshipTypeOpenEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRelationshipTypeOpenEnum_MemberTypes(relationshipTypeOpenEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Relationship Type Open Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipTypeOpenEnum_MemberTypes(Object relationshipTypeOpenEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (AddressingPackage.Literals.RELATIONSHIP_TYPE.isInstance(relationshipTypeOpenEnum)) {
				if (validateRelationshipType((RelationshipType)relationshipTypeOpenEnum, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(relationshipTypeOpenEnum)) {
				if (xmlTypeValidator.validateAnyURI((String)relationshipTypeOpenEnum, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (AddressingPackage.Literals.RELATIONSHIP_TYPE.isInstance(relationshipTypeOpenEnum)) {
				if (validateRelationshipType((RelationshipType)relationshipTypeOpenEnum, null, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(relationshipTypeOpenEnum)) {
				if (xmlTypeValidator.validateAnyURI((String)relationshipTypeOpenEnum, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AddressingValidator
