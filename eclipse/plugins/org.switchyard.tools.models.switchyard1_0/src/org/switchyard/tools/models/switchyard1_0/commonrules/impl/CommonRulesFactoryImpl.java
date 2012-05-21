/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.commonrules.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.commonrules.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonRulesFactoryImpl extends EFactoryImpl implements CommonRulesFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static CommonRulesFactory init() {
        try {
            CommonRulesFactory theCommonRulesFactory = (CommonRulesFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-component-common-rules:config:1.0"); 
            if (theCommonRulesFactory != null) {
                return theCommonRulesFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new CommonRulesFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CommonRulesFactoryImpl() {
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
            case CommonRulesPackage.DOCUMENT_ROOT: return createDocumentRoot();
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
            case CommonRulesPackage.AUDIT_TYPE:
                return createAuditTypeFromString(eDataType, initialValue);
            case CommonRulesPackage.CLOCK_TYPE:
                return createClockTypeFromString(eDataType, initialValue);
            case CommonRulesPackage.CONTEXT_SCOPE:
                return createContextScopeFromString(eDataType, initialValue);
            case CommonRulesPackage.EVENT_PROCESSING_TYPE:
                return createEventProcessingTypeFromString(eDataType, initialValue);
            case CommonRulesPackage.EXPRESSION_TYPE:
                return createExpressionTypeFromString(eDataType, initialValue);
            case CommonRulesPackage.AUDIT_TYPE_OBJECT:
                return createAuditTypeObjectFromString(eDataType, initialValue);
            case CommonRulesPackage.CLOCK_TYPE_OBJECT:
                return createClockTypeObjectFromString(eDataType, initialValue);
            case CommonRulesPackage.CONTEXT_SCOPE_OBJECT:
                return createContextScopeObjectFromString(eDataType, initialValue);
            case CommonRulesPackage.EVENT_PROCESSING_TYPE_OBJECT:
                return createEventProcessingTypeObjectFromString(eDataType, initialValue);
            case CommonRulesPackage.EXPRESSION_TYPE_OBJECT:
                return createExpressionTypeObjectFromString(eDataType, initialValue);
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
            case CommonRulesPackage.AUDIT_TYPE:
                return convertAuditTypeToString(eDataType, instanceValue);
            case CommonRulesPackage.CLOCK_TYPE:
                return convertClockTypeToString(eDataType, instanceValue);
            case CommonRulesPackage.CONTEXT_SCOPE:
                return convertContextScopeToString(eDataType, instanceValue);
            case CommonRulesPackage.EVENT_PROCESSING_TYPE:
                return convertEventProcessingTypeToString(eDataType, instanceValue);
            case CommonRulesPackage.EXPRESSION_TYPE:
                return convertExpressionTypeToString(eDataType, instanceValue);
            case CommonRulesPackage.AUDIT_TYPE_OBJECT:
                return convertAuditTypeObjectToString(eDataType, instanceValue);
            case CommonRulesPackage.CLOCK_TYPE_OBJECT:
                return convertClockTypeObjectToString(eDataType, instanceValue);
            case CommonRulesPackage.CONTEXT_SCOPE_OBJECT:
                return convertContextScopeObjectToString(eDataType, instanceValue);
            case CommonRulesPackage.EVENT_PROCESSING_TYPE_OBJECT:
                return convertEventProcessingTypeObjectToString(eDataType, instanceValue);
            case CommonRulesPackage.EXPRESSION_TYPE_OBJECT:
                return convertExpressionTypeObjectToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
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
    public AuditType createAuditTypeFromString(EDataType eDataType, String initialValue) {
        AuditType result = AuditType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAuditTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClockType createClockTypeFromString(EDataType eDataType, String initialValue) {
        ClockType result = ClockType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertClockTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextScope createContextScopeFromString(EDataType eDataType, String initialValue) {
        ContextScope result = ContextScope.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertContextScopeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventProcessingType createEventProcessingTypeFromString(EDataType eDataType, String initialValue) {
        EventProcessingType result = EventProcessingType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEventProcessingTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExpressionType createExpressionTypeFromString(EDataType eDataType, String initialValue) {
        ExpressionType result = ExpressionType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertExpressionTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AuditType createAuditTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createAuditTypeFromString(CommonRulesPackage.Literals.AUDIT_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAuditTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertAuditTypeToString(CommonRulesPackage.Literals.AUDIT_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClockType createClockTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createClockTypeFromString(CommonRulesPackage.Literals.CLOCK_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertClockTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertClockTypeToString(CommonRulesPackage.Literals.CLOCK_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextScope createContextScopeObjectFromString(EDataType eDataType, String initialValue) {
        return createContextScopeFromString(CommonRulesPackage.Literals.CONTEXT_SCOPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertContextScopeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertContextScopeToString(CommonRulesPackage.Literals.CONTEXT_SCOPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventProcessingType createEventProcessingTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createEventProcessingTypeFromString(CommonRulesPackage.Literals.EVENT_PROCESSING_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEventProcessingTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertEventProcessingTypeToString(CommonRulesPackage.Literals.EVENT_PROCESSING_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExpressionType createExpressionTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createExpressionTypeFromString(CommonRulesPackage.Literals.EXPRESSION_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertExpressionTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertExpressionTypeToString(CommonRulesPackage.Literals.EXPRESSION_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CommonRulesPackage getCommonRulesPackage() {
        return (CommonRulesPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static CommonRulesPackage getPackage() {
        return CommonRulesPackage.eINSTANCE;
    }

} //CommonRulesFactoryImpl
