/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.core.model.policy.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.soa.sca.core.model.policy.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicyFactoryImpl extends EFactoryImpl implements PolicyFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static PolicyFactory init() {
        try {
            PolicyFactory thePolicyFactory = (PolicyFactory)EPackage.Registry.INSTANCE.getEFactory("http://schemas.xmlsoap.org/ws/2004/09/policy"); 
            if (thePolicyFactory != null) {
                return thePolicyFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new PolicyFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PolicyFactoryImpl() {
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
            case PolicyPackage.APPLIES_TO_TYPE: return createAppliesToType();
            case PolicyPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case PolicyPackage.OPERATOR_CONTENT_TYPE: return createOperatorContentType();
            case PolicyPackage.POLICY_ATTACHMENT_TYPE: return createPolicyAttachmentType();
            case PolicyPackage.POLICY_REFERENCE_TYPE: return createPolicyReferenceType();
            case PolicyPackage.POLICY_TYPE: return createPolicyType();
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
            case PolicyPackage.POLICY_UR_IS_TYPE:
                return createPolicyURIsTypeFromString(eDataType, initialValue);
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
            case PolicyPackage.POLICY_UR_IS_TYPE:
                return convertPolicyURIsTypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AppliesToType createAppliesToType() {
        AppliesToTypeImpl appliesToType = new AppliesToTypeImpl();
        return appliesToType;
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
	public OperatorContentType createOperatorContentType() {
        OperatorContentTypeImpl operatorContentType = new OperatorContentTypeImpl();
        return operatorContentType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PolicyAttachmentType createPolicyAttachmentType() {
        PolicyAttachmentTypeImpl policyAttachmentType = new PolicyAttachmentTypeImpl();
        return policyAttachmentType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PolicyReferenceType createPolicyReferenceType() {
        PolicyReferenceTypeImpl policyReferenceType = new PolicyReferenceTypeImpl();
        return policyReferenceType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PolicyType createPolicyType() {
        PolicyTypeImpl policyType = new PolicyTypeImpl();
        return policyType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public List<String> createPolicyURIsTypeFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        List<String> result = new ArrayList<String>();
        for (String item : split(initialValue)) {
            result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, item));
        }
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertPolicyURIsTypeToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        List<?> list = (List<?>)instanceValue;
        if (list.isEmpty()) return "";
        StringBuffer result = new StringBuffer();
        for (Object item : list) {
            result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, item));
            result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PolicyPackage getPolicyPackage() {
        return (PolicyPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static PolicyPackage getPackage() {
        return PolicyPackage.eINSTANCE;
    }

} //PolicyFactoryImpl
