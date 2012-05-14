/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType;


import org.switchyard.tools.models.switchyard1_0.camel.*;
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
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage
 * @generated
 */
public class CamelSwitch<T> extends Switch<T> {
	/**
     * The cached model package
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static CamelPackage modelPackage;

	/**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CamelSwitch() {
        if (modelPackage == null) {
            modelPackage = CamelPackage.eINSTANCE;
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
            case CamelPackage.CAMEL_ATOM_BINDING_TYPE: {
                CamelAtomBindingType camelAtomBindingType = (CamelAtomBindingType)theEObject;
                T result = caseCamelAtomBindingType(camelAtomBindingType);
                if (result == null) result = caseSwitchYardBindingType(camelAtomBindingType);
                if (result == null) result = caseBinding(camelAtomBindingType);
                if (result == null) result = caseCommonExtensionBase(camelAtomBindingType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CamelPackage.CAMEL_BINDING_TYPE: {
                CamelBindingType camelBindingType = (CamelBindingType)theEObject;
                T result = caseCamelBindingType(camelBindingType);
                if (result == null) result = caseSwitchYardBindingType(camelBindingType);
                if (result == null) result = caseBinding(camelBindingType);
                if (result == null) result = caseCommonExtensionBase(camelBindingType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CamelPackage.CAMEL_DIRECT_BINDING_TYPE: {
                CamelDirectBindingType camelDirectBindingType = (CamelDirectBindingType)theEObject;
                T result = caseCamelDirectBindingType(camelDirectBindingType);
                if (result == null) result = caseSwitchYardBindingType(camelDirectBindingType);
                if (result == null) result = caseBinding(camelDirectBindingType);
                if (result == null) result = caseCommonExtensionBase(camelDirectBindingType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CamelPackage.CAMEL_FILE_BINDING_TYPE: {
                CamelFileBindingType camelFileBindingType = (CamelFileBindingType)theEObject;
                T result = caseCamelFileBindingType(camelFileBindingType);
                if (result == null) result = caseSwitchYardBindingType(camelFileBindingType);
                if (result == null) result = caseBinding(camelFileBindingType);
                if (result == null) result = caseCommonExtensionBase(camelFileBindingType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CamelPackage.CAMEL_IMPLEMENTATION_TYPE: {
                CamelImplementationType camelImplementationType = (CamelImplementationType)theEObject;
                T result = caseCamelImplementationType(camelImplementationType);
                if (result == null) result = caseImplementation(camelImplementationType);
                if (result == null) result = caseCommonExtensionBase(camelImplementationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CamelPackage.CAMEL_MOCK_BINDING_TYPE: {
                CamelMockBindingType camelMockBindingType = (CamelMockBindingType)theEObject;
                T result = caseCamelMockBindingType(camelMockBindingType);
                if (result == null) result = caseSwitchYardBindingType(camelMockBindingType);
                if (result == null) result = caseBinding(camelMockBindingType);
                if (result == null) result = caseCommonExtensionBase(camelMockBindingType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CamelPackage.CAMEL_OPERATION_SELECTOR_TYPE: {
                CamelOperationSelectorType camelOperationSelectorType = (CamelOperationSelectorType)theEObject;
                T result = caseCamelOperationSelectorType(camelOperationSelectorType);
                if (result == null) result = caseOperationSelectorType(camelOperationSelectorType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CamelPackage.CAMEL_SEDA_BINDING_TYPE: {
                CamelSedaBindingType camelSedaBindingType = (CamelSedaBindingType)theEObject;
                T result = caseCamelSedaBindingType(camelSedaBindingType);
                if (result == null) result = caseSwitchYardBindingType(camelSedaBindingType);
                if (result == null) result = caseBinding(camelSedaBindingType);
                if (result == null) result = caseCommonExtensionBase(camelSedaBindingType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CamelPackage.CAMEL_TIMER_BINDING_TYPE: {
                CamelTimerBindingType camelTimerBindingType = (CamelTimerBindingType)theEObject;
                T result = caseCamelTimerBindingType(camelTimerBindingType);
                if (result == null) result = caseSwitchYardBindingType(camelTimerBindingType);
                if (result == null) result = caseBinding(camelTimerBindingType);
                if (result == null) result = caseCommonExtensionBase(camelTimerBindingType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CamelPackage.DOCUMENT_ROOT: {
                DocumentRoot documentRoot = (DocumentRoot)theEObject;
                T result = caseDocumentRoot(documentRoot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CamelPackage.FILE_CONSUMER_TYPE: {
                FileConsumerType fileConsumerType = (FileConsumerType)theEObject;
                T result = caseFileConsumerType(fileConsumerType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CamelPackage.FILE_PRODUCER_TYPE: {
                FileProducerType fileProducerType = (FileProducerType)theEObject;
                T result = caseFileProducerType(fileProducerType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CamelPackage.JAVA_DSL_TYPE: {
                JavaDSLType javaDSLType = (JavaDSLType)theEObject;
                T result = caseJavaDSLType(javaDSLType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CamelPackage.XMLDSL_TYPE: {
                XMLDSLType xmldslType = (XMLDSLType)theEObject;
                T result = caseXMLDSLType(xmldslType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Atom Binding Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Atom Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCamelAtomBindingType(CamelAtomBindingType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Binding Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCamelBindingType(CamelBindingType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Direct Binding Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Direct Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCamelDirectBindingType(CamelDirectBindingType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>File Binding Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCamelFileBindingType(CamelFileBindingType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Implementation Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Implementation Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCamelImplementationType(CamelImplementationType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Mock Binding Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mock Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCamelMockBindingType(CamelMockBindingType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Operation Selector Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operation Selector Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCamelOperationSelectorType(CamelOperationSelectorType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Seda Binding Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Seda Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCamelSedaBindingType(CamelSedaBindingType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Timer Binding Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Timer Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCamelTimerBindingType(CamelTimerBindingType object) {
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
     * Returns the result of interpreting the object as an instance of '<em>File Consumer Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File Consumer Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseFileConsumerType(FileConsumerType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>File Producer Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File Producer Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseFileProducerType(FileProducerType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Java DSL Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Java DSL Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJavaDSLType(JavaDSLType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>XMLDSL Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>XMLDSL Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseXMLDSLType(XMLDSLType object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Implementation</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Implementation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseImplementation(Implementation object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Operation Selector Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operation Selector Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseOperationSelectorType(OperationSelectorType object) {
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

} //CamelSwitch
