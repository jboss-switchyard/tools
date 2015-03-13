/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.sap.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

import org.switchyard.tools.models.switchyard1_0.camel.sap.*;

import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;

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
 * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage
 * @generated
 */
public class SapSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static SapPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SapSwitch() {
        if (modelPackage == null) {
            modelPackage = SapPackage.eINSTANCE;
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
            case SapPackage.ADDITIONAL_URI_PARAMETERS_TYPE: {
                AdditionalUriParametersType additionalUriParametersType = (AdditionalUriParametersType)theEObject;
                T result = caseAdditionalUriParametersType(additionalUriParametersType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SapPackage.BASE_CAMEL_BINDING: {
                BaseCamelBinding baseCamelBinding = (BaseCamelBinding)theEObject;
                T result = caseBaseCamelBinding(baseCamelBinding);
                if (result == null) result = caseSwitchYardBindingType(baseCamelBinding);
                if (result == null) result = caseBinding(baseCamelBinding);
                if (result == null) result = caseCommonExtensionBase(baseCamelBinding);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SapPackage.CAMEL_SAP_BINDING_TYPE: {
                CamelSapBindingType camelSapBindingType = (CamelSapBindingType)theEObject;
                T result = caseCamelSapBindingType(camelSapBindingType);
                if (result == null) result = caseBaseCamelBinding(camelSapBindingType);
                if (result == null) result = caseSwitchYardBindingType(camelSapBindingType);
                if (result == null) result = caseBinding(camelSapBindingType);
                if (result == null) result = caseCommonExtensionBase(camelSapBindingType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SapPackage.CAMEL_SAP_IDOC_DESTINATION_TYPE: {
                CamelSapIDocDestinationType camelSapIDocDestinationType = (CamelSapIDocDestinationType)theEObject;
                T result = caseCamelSapIDocDestinationType(camelSapIDocDestinationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SapPackage.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE: {
                CamelSapIDocListDestinationType camelSapIDocListDestinationType = (CamelSapIDocListDestinationType)theEObject;
                T result = caseCamelSapIDocListDestinationType(camelSapIDocListDestinationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SapPackage.CAMEL_SAP_IDOC_LIST_SERVER_TYPE: {
                CamelSapIDocListServerType camelSapIDocListServerType = (CamelSapIDocListServerType)theEObject;
                T result = caseCamelSapIDocListServerType(camelSapIDocListServerType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SapPackage.CAMEL_SAP_QI_DOC_DESTINATION_TYPE: {
                CamelSapQIDocDestinationType camelSapQIDocDestinationType = (CamelSapQIDocDestinationType)theEObject;
                T result = caseCamelSapQIDocDestinationType(camelSapQIDocDestinationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SapPackage.CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE: {
                CamelSapQIDocListDestinationType camelSapQIDocListDestinationType = (CamelSapQIDocListDestinationType)theEObject;
                T result = caseCamelSapQIDocListDestinationType(camelSapQIDocListDestinationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SapPackage.CAMEL_SAP_QRFC_DESTINATION_TYPE: {
                CamelSapQRfcDestinationType camelSapQRfcDestinationType = (CamelSapQRfcDestinationType)theEObject;
                T result = caseCamelSapQRfcDestinationType(camelSapQRfcDestinationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SapPackage.CAMEL_SAP_SRFC_DESTINATION_TYPE: {
                CamelSapSRfcDestinationType camelSapSRfcDestinationType = (CamelSapSRfcDestinationType)theEObject;
                T result = caseCamelSapSRfcDestinationType(camelSapSRfcDestinationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SapPackage.CAMEL_SAP_SRFC_SERVER_TYPE: {
                CamelSapSRfcServerType camelSapSRfcServerType = (CamelSapSRfcServerType)theEObject;
                T result = caseCamelSapSRfcServerType(camelSapSRfcServerType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SapPackage.CAMEL_SAP_TRFC_DESTINATION_TYPE: {
                CamelSapTRfcDestinationType camelSapTRfcDestinationType = (CamelSapTRfcDestinationType)theEObject;
                T result = caseCamelSapTRfcDestinationType(camelSapTRfcDestinationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SapPackage.CAMEL_SAP_TRFC_SERVER_TYPE: {
                CamelSapTRfcServerType camelSapTRfcServerType = (CamelSapTRfcServerType)theEObject;
                T result = caseCamelSapTRfcServerType(camelSapTRfcServerType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SapPackage.DOCUMENT_ROOT: {
                DocumentRoot documentRoot = (DocumentRoot)theEObject;
                T result = caseDocumentRoot(documentRoot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SapPackage.PARAMETER_TYPE: {
                ParameterType parameterType = (ParameterType)theEObject;
                T result = caseParameterType(parameterType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Additional Uri Parameters Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Additional Uri Parameters Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAdditionalUriParametersType(AdditionalUriParametersType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Base Camel Binding</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Base Camel Binding</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBaseCamelBinding(BaseCamelBinding object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Camel Sap Binding Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Sap Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCamelSapBindingType(CamelSapBindingType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Camel Sap IDoc Destination Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Sap IDoc Destination Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCamelSapIDocDestinationType(CamelSapIDocDestinationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Camel Sap IDoc List Destination Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Sap IDoc List Destination Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCamelSapIDocListDestinationType(CamelSapIDocListDestinationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Camel Sap IDoc List Server Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Sap IDoc List Server Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCamelSapIDocListServerType(CamelSapIDocListServerType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Camel Sap QI Doc Destination Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Sap QI Doc Destination Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCamelSapQIDocDestinationType(CamelSapQIDocDestinationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Camel Sap QI Doc List Destination Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Sap QI Doc List Destination Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCamelSapQIDocListDestinationType(CamelSapQIDocListDestinationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Camel Sap QRfc Destination Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Sap QRfc Destination Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCamelSapQRfcDestinationType(CamelSapQRfcDestinationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Camel Sap SRfc Destination Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Sap SRfc Destination Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCamelSapSRfcDestinationType(CamelSapSRfcDestinationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Camel Sap SRfc Server Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Sap SRfc Server Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCamelSapSRfcServerType(CamelSapSRfcServerType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Camel Sap TRfc Destination Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Sap TRfc Destination Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCamelSapTRfcDestinationType(CamelSapTRfcDestinationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Camel Sap TRfc Server Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Sap TRfc Server Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCamelSapTRfcServerType(CamelSapTRfcServerType object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParameterType(ParameterType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Common Extension Base</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Common Extension Base</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommonExtensionBase(CommonExtensionBase object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBinding(Binding object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Switch Yard Binding Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Switch Yard Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitchYardBindingType(SwitchYardBindingType object) {
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

} //SapSwitch
