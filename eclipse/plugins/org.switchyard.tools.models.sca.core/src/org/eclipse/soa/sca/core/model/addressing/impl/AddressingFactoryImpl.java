/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.core.model.addressing.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.soa.sca.core.model.addressing.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AddressingFactoryImpl extends EFactoryImpl implements AddressingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AddressingFactory init() {
		try {
			AddressingFactory theAddressingFactory = (AddressingFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.w3.org/2005/08/addressing"); 
			if (theAddressingFactory != null) {
				return theAddressingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AddressingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AddressingPackage.ATTRIBUTED_QNAME_TYPE: return createAttributedQNameType();
			case AddressingPackage.ATTRIBUTED_UNSIGNED_LONG_TYPE: return createAttributedUnsignedLongType();
			case AddressingPackage.ATTRIBUTED_URI_TYPE: return createAttributedURIType();
			case AddressingPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case AddressingPackage.ENDPOINT_REFERENCE_TYPE: return createEndpointReferenceType();
			case AddressingPackage.METADATA_TYPE: return createMetadataType();
			case AddressingPackage.PROBLEM_ACTION_TYPE: return createProblemActionType();
			case AddressingPackage.REFERENCE_PARAMETERS_TYPE: return createReferenceParametersType();
			case AddressingPackage.RELATES_TO_TYPE: return createRelatesToType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AddressingPackage.RELATIONSHIP_TYPE:
				return createRelationshipTypeFromString(eDataType, initialValue);
			case AddressingPackage.FAULT_CODES_OPEN_ENUM_TYPE:
				return createFaultCodesOpenEnumTypeFromString(eDataType, initialValue);
			case AddressingPackage.FAULT_CODES_TYPE:
				return createFaultCodesTypeFromString(eDataType, initialValue);
			case AddressingPackage.RELATIONSHIP_TYPE_OBJECT:
				return createRelationshipTypeObjectFromString(eDataType, initialValue);
			case AddressingPackage.RELATIONSHIP_TYPE_OPEN_ENUM:
				return createRelationshipTypeOpenEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AddressingPackage.RELATIONSHIP_TYPE:
				return convertRelationshipTypeToString(eDataType, instanceValue);
			case AddressingPackage.FAULT_CODES_OPEN_ENUM_TYPE:
				return convertFaultCodesOpenEnumTypeToString(eDataType, instanceValue);
			case AddressingPackage.FAULT_CODES_TYPE:
				return convertFaultCodesTypeToString(eDataType, instanceValue);
			case AddressingPackage.RELATIONSHIP_TYPE_OBJECT:
				return convertRelationshipTypeObjectToString(eDataType, instanceValue);
			case AddressingPackage.RELATIONSHIP_TYPE_OPEN_ENUM:
				return convertRelationshipTypeOpenEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedQNameType createAttributedQNameType() {
		AttributedQNameTypeImpl attributedQNameType = new AttributedQNameTypeImpl();
		return attributedQNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedUnsignedLongType createAttributedUnsignedLongType() {
		AttributedUnsignedLongTypeImpl attributedUnsignedLongType = new AttributedUnsignedLongTypeImpl();
		return attributedUnsignedLongType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributedURIType createAttributedURIType() {
		AttributedURITypeImpl attributedURIType = new AttributedURITypeImpl();
		return attributedURIType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointReferenceType createEndpointReferenceType() {
		EndpointReferenceTypeImpl endpointReferenceType = new EndpointReferenceTypeImpl();
		return endpointReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataType createMetadataType() {
		MetadataTypeImpl metadataType = new MetadataTypeImpl();
		return metadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemActionType createProblemActionType() {
		ProblemActionTypeImpl problemActionType = new ProblemActionTypeImpl();
		return problemActionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceParametersType createReferenceParametersType() {
		ReferenceParametersTypeImpl referenceParametersType = new ReferenceParametersTypeImpl();
		return referenceParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatesToType createRelatesToType() {
		RelatesToTypeImpl relatesToType = new RelatesToTypeImpl();
		return relatesToType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType createRelationshipTypeFromString(EDataType eDataType, String initialValue) {
		RelationshipType result = RelationshipType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName createFaultCodesOpenEnumTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		QName result = null;
		RuntimeException exception = null;
		try {
			result = createFaultCodesTypeFromString(AddressingPackage.Literals.FAULT_CODES_TYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.QNAME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFaultCodesOpenEnumTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (AddressingPackage.Literals.FAULT_CODES_TYPE.isInstance(instanceValue)) {
			try {
				String value = convertFaultCodesTypeToString(AddressingPackage.Literals.FAULT_CODES_TYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.QNAME.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.QNAME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName createFaultCodesTypeFromString(EDataType eDataType, String initialValue) {
		return (QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.QNAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFaultCodesTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.QNAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType createRelationshipTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRelationshipTypeFromString(AddressingPackage.Literals.RELATIONSHIP_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRelationshipTypeToString(AddressingPackage.Literals.RELATIONSHIP_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createRelationshipTypeOpenEnumFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createRelationshipTypeFromString(AddressingPackage.Literals.RELATIONSHIP_TYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipTypeOpenEnumToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (AddressingPackage.Literals.RELATIONSHIP_TYPE.isInstance(instanceValue)) {
			try {
				String value = convertRelationshipTypeToString(AddressingPackage.Literals.RELATIONSHIP_TYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressingPackage getAddressingPackage() {
		return (AddressingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AddressingPackage getPackage() {
		return AddressingPackage.eINSTANCE;
	}

} //AddressingFactoryImpl
