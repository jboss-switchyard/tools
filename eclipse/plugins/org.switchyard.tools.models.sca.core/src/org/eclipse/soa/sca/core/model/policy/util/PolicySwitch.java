/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.core.model.policy.util;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.soa.sca.core.model.policy.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.soa.sca.core.model.policy.PolicyPackage
 * @generated
 */
public class PolicySwitch<T> extends Switch<T> {
	/**
     * The cached model package
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static PolicyPackage modelPackage;

	/**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PolicySwitch() {
        if (modelPackage == null) {
            modelPackage = PolicyPackage.eINSTANCE;
        }
    }

	/**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	@Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case PolicyPackage.APPLIES_TO_TYPE: {
                AppliesToType appliesToType = (AppliesToType)theEObject;
                T result = caseAppliesToType(appliesToType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PolicyPackage.DOCUMENT_ROOT: {
                DocumentRoot documentRoot = (DocumentRoot)theEObject;
                T result = caseDocumentRoot(documentRoot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PolicyPackage.OPERATOR_CONTENT_TYPE: {
                OperatorContentType operatorContentType = (OperatorContentType)theEObject;
                T result = caseOperatorContentType(operatorContentType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PolicyPackage.POLICY_ATTACHMENT_TYPE: {
                PolicyAttachmentType policyAttachmentType = (PolicyAttachmentType)theEObject;
                T result = casePolicyAttachmentType(policyAttachmentType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PolicyPackage.POLICY_REFERENCE_TYPE: {
                PolicyReferenceType policyReferenceType = (PolicyReferenceType)theEObject;
                T result = casePolicyReferenceType(policyReferenceType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PolicyPackage.POLICY_TYPE: {
                PolicyType policyType = (PolicyType)theEObject;
                T result = casePolicyType(policyType);
                if (result == null) result = caseOperatorContentType(policyType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Applies To Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Applies To Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAppliesToType(AppliesToType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDocumentRoot(DocumentRoot object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Operator Content Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operator Content Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseOperatorContentType(OperatorContentType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Attachment Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attachment Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePolicyAttachmentType(PolicyAttachmentType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Reference Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reference Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePolicyReferenceType(PolicyReferenceType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePolicyType(PolicyType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
	@Override
    public T defaultCase(EObject object) {
        return null;
    }

} //PolicySwitch
