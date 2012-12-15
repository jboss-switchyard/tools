/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

import org.switchyard.tools.models.switchyard1_0.camel.core.*;

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
 * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage
 * @generated
 */
public class CoreSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static CorePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CoreSwitch() {
        if (modelPackage == null) {
            modelPackage = CorePackage.eINSTANCE;
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
            case CorePackage.BASE_CAMEL_BINDING: {
                BaseCamelBinding baseCamelBinding = (BaseCamelBinding)theEObject;
                T result = caseBaseCamelBinding(baseCamelBinding);
                if (result == null) result = caseSwitchYardBindingType(baseCamelBinding);
                if (result == null) result = caseBinding(baseCamelBinding);
                if (result == null) result = caseCommonExtensionBase(baseCamelBinding);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CorePackage.CAMEL_BINDING_TYPE: {
                CamelBindingType camelBindingType = (CamelBindingType)theEObject;
                T result = caseCamelBindingType(camelBindingType);
                if (result == null) result = caseBaseCamelBinding(camelBindingType);
                if (result == null) result = caseSwitchYardBindingType(camelBindingType);
                if (result == null) result = caseBinding(camelBindingType);
                if (result == null) result = caseCommonExtensionBase(camelBindingType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CorePackage.CAMEL_DIRECT_BINDING_TYPE: {
                CamelDirectBindingType camelDirectBindingType = (CamelDirectBindingType)theEObject;
                T result = caseCamelDirectBindingType(camelDirectBindingType);
                if (result == null) result = caseBaseCamelBinding(camelDirectBindingType);
                if (result == null) result = caseSwitchYardBindingType(camelDirectBindingType);
                if (result == null) result = caseBinding(camelDirectBindingType);
                if (result == null) result = caseCommonExtensionBase(camelDirectBindingType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CorePackage.CAMEL_TIMER_BINDING_TYPE: {
                CamelTimerBindingType camelTimerBindingType = (CamelTimerBindingType)theEObject;
                T result = caseCamelTimerBindingType(camelTimerBindingType);
                if (result == null) result = caseBaseCamelBinding(camelTimerBindingType);
                if (result == null) result = caseSwitchYardBindingType(camelTimerBindingType);
                if (result == null) result = caseBinding(camelTimerBindingType);
                if (result == null) result = caseCommonExtensionBase(camelTimerBindingType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CorePackage.CAMEL_SEDA_BINDING_TYPE: {
                CamelSedaBindingType camelSedaBindingType = (CamelSedaBindingType)theEObject;
                T result = caseCamelSedaBindingType(camelSedaBindingType);
                if (result == null) result = caseBaseCamelBinding(camelSedaBindingType);
                if (result == null) result = caseSwitchYardBindingType(camelSedaBindingType);
                if (result == null) result = caseBinding(camelSedaBindingType);
                if (result == null) result = caseCommonExtensionBase(camelSedaBindingType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CorePackage.CAMEL_MOCK_BINDING_TYPE: {
                CamelMockBindingType camelMockBindingType = (CamelMockBindingType)theEObject;
                T result = caseCamelMockBindingType(camelMockBindingType);
                if (result == null) result = caseBaseCamelBinding(camelMockBindingType);
                if (result == null) result = caseSwitchYardBindingType(camelMockBindingType);
                if (result == null) result = caseBinding(camelMockBindingType);
                if (result == null) result = caseCommonExtensionBase(camelMockBindingType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CorePackage.DOCUMENT_ROOT: {
                DocumentRoot documentRoot = (DocumentRoot)theEObject;
                T result = caseDocumentRoot(documentRoot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
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
     * Returns the result of interpreting the object as an instance of '<em>Camel Binding Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCamelBindingType(CamelBindingType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Camel Direct Binding Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Direct Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCamelDirectBindingType(CamelDirectBindingType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Camel Timer Binding Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Timer Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCamelTimerBindingType(CamelTimerBindingType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Camel Seda Binding Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Seda Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCamelSedaBindingType(CamelSedaBindingType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Camel Mock Binding Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Mock Binding Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCamelMockBindingType(CamelMockBindingType object) {
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

} //CoreSwitch
