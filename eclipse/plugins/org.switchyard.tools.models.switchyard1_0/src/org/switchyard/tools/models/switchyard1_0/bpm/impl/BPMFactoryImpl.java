/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.bpm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.switchyard.tools.models.switchyard1_0.bpm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMFactoryImpl extends EFactoryImpl implements BPMFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static BPMFactory init() {
        try {
            BPMFactory theBPMFactory = (BPMFactory)EPackage.Registry.INSTANCE.getEFactory("urn:switchyard-component-bpm:config:1.0"); 
            if (theBPMFactory != null) {
                return theBPMFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new BPMFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BPMFactoryImpl() {
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
            case BPMPackage.ACTION_TYPE1: return createActionType1();
            case BPMPackage.AUDIT_TYPE: return createAuditType();
            case BPMPackage.BPM_IMPLEMENTATION_TYPE: return createBPMImplementationType();
            case BPMPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case BPMPackage.MAPPING_TYPE: return createMappingType();
            case BPMPackage.PARAMETERS_TYPE: return createParametersType();
            case BPMPackage.RESOURCE_TYPE: return createResourceType();
            case BPMPackage.RESULTS_TYPE: return createResultsType();
            case BPMPackage.TASK_HANDLER_TYPE: return createTaskHandlerType();
            case BPMPackage.EVENT_LISTENER_TYPE: return createEventListenerType();
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
            case BPMPackage.ACTION_TYPE:
                return createActionTypeFromString(eDataType, initialValue);
            case BPMPackage.ACTION_TYPE_OBJECT:
                return createActionTypeObjectFromString(eDataType, initialValue);
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
            case BPMPackage.ACTION_TYPE:
                return convertActionTypeToString(eDataType, instanceValue);
            case BPMPackage.ACTION_TYPE_OBJECT:
                return convertActionTypeObjectToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ActionType1 createActionType1() {
        ActionType1Impl actionType1 = new ActionType1Impl();
        return actionType1;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AuditType createAuditType() {
        AuditTypeImpl auditType = new AuditTypeImpl();
        return auditType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BPMImplementationType createBPMImplementationType() {
        BPMImplementationTypeImpl bpmImplementationType = new BPMImplementationTypeImpl();
        return bpmImplementationType;
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
    public MappingType createMappingType() {
        MappingTypeImpl mappingType = new MappingTypeImpl();
        return mappingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParametersType createParametersType() {
        ParametersTypeImpl parametersType = new ParametersTypeImpl();
        return parametersType;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResourceType createResourceType() {
        ResourceTypeImpl resourceType = new ResourceTypeImpl();
        return resourceType;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResultsType createResultsType() {
        ResultsTypeImpl resultsType = new ResultsTypeImpl();
        return resultsType;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TaskHandlerType createTaskHandlerType() {
        TaskHandlerTypeImpl taskHandlerType = new TaskHandlerTypeImpl();
        return taskHandlerType;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventListenerType createEventListenerType() {
        EventListenerTypeImpl eventListenerType = new EventListenerTypeImpl();
        return eventListenerType;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ActionType createActionTypeFromString(EDataType eDataType, String initialValue) {
        ActionType result = ActionType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertActionTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ActionType createActionTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createActionTypeFromString(BPMPackage.Literals.ACTION_TYPE, initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertActionTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertActionTypeToString(BPMPackage.Literals.ACTION_TYPE, instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BPMPackage getBPMPackage() {
        return (BPMPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static BPMPackage getPackage() {
        return BPMPackage.eINSTANCE;
    }

} //BPMFactoryImpl
