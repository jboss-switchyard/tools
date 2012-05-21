/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.bpm.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.bpm.ActionType1;
import org.switchyard.tools.models.switchyard1_0.bpm.AuditType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.bpm.MappingType;
import org.switchyard.tools.models.switchyard1_0.bpm.ParametersType;
import org.switchyard.tools.models.switchyard1_0.bpm.ResourceType;
import org.switchyard.tools.models.switchyard1_0.bpm.ResultsType;
import org.switchyard.tools.models.switchyard1_0.bpm.TaskHandlerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getAudit <em>Audit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getImplementationBpm <em>Implementation Bpm</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getResults <em>Results</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getTaskHandler <em>Task Handler</em>}</li>
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
        return BPMPackage.Literals.DOCUMENT_ROOT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, BPMPackage.DOCUMENT_ROOT__MIXED);
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
            xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, BPMPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
            xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, BPMPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return xSISchemaLocation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ActionType1 getAction() {
        return (ActionType1)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__ACTION, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetAction(ActionType1 newAction, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__ACTION, newAction, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAction(ActionType1 newAction) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__ACTION, newAction);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AuditType getAudit() {
        return (AuditType)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__AUDIT, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetAudit(AuditType newAudit, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__AUDIT, newAudit, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAudit(AuditType newAudit) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__AUDIT, newAudit);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BPMImplementationType getImplementationBpm() {
        return (BPMImplementationType)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_BPM, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetImplementationBpm(BPMImplementationType newImplementationBpm, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_BPM, newImplementationBpm, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setImplementationBpm(BPMImplementationType newImplementationBpm) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_BPM, newImplementationBpm);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MappingType getMapping() {
        return (MappingType)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__MAPPING, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMapping(MappingType newMapping, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__MAPPING, newMapping, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMapping(MappingType newMapping) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__MAPPING, newMapping);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParametersType getParameters() {
        return (ParametersType)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__PARAMETERS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParameters(ParametersType newParameters, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__PARAMETERS, newParameters, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParameters(ParametersType newParameters) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__PARAMETERS, newParameters);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResourceType getResource() {
        return (ResourceType)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__RESOURCE, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetResource(ResourceType newResource, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__RESOURCE, newResource, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setResource(ResourceType newResource) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__RESOURCE, newResource);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResultsType getResults() {
        return (ResultsType)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__RESULTS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetResults(ResultsType newResults, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__RESULTS, newResults, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResults(ResultsType newResults) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__RESULTS, newResults);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TaskHandlerType getTaskHandler() {
        return (TaskHandlerType)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__TASK_HANDLER, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetTaskHandler(TaskHandlerType newTaskHandler, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__TASK_HANDLER, newTaskHandler, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTaskHandler(TaskHandlerType newTaskHandler) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__TASK_HANDLER, newTaskHandler);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BPMPackage.DOCUMENT_ROOT__MIXED:
                return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
            case BPMPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
            case BPMPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
            case BPMPackage.DOCUMENT_ROOT__ACTION:
                return basicSetAction(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__AUDIT:
                return basicSetAudit(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__IMPLEMENTATION_BPM:
                return basicSetImplementationBpm(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__MAPPING:
                return basicSetMapping(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__PARAMETERS:
                return basicSetParameters(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__RESOURCE:
                return basicSetResource(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__RESULTS:
                return basicSetResults(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__TASK_HANDLER:
                return basicSetTaskHandler(null, msgs);
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
            case BPMPackage.DOCUMENT_ROOT__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case BPMPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                if (coreType) return getXMLNSPrefixMap();
                else return getXMLNSPrefixMap().map();
            case BPMPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                if (coreType) return getXSISchemaLocation();
                else return getXSISchemaLocation().map();
            case BPMPackage.DOCUMENT_ROOT__ACTION:
                return getAction();
            case BPMPackage.DOCUMENT_ROOT__AUDIT:
                return getAudit();
            case BPMPackage.DOCUMENT_ROOT__IMPLEMENTATION_BPM:
                return getImplementationBpm();
            case BPMPackage.DOCUMENT_ROOT__MAPPING:
                return getMapping();
            case BPMPackage.DOCUMENT_ROOT__PARAMETERS:
                return getParameters();
            case BPMPackage.DOCUMENT_ROOT__RESOURCE:
                return getResource();
            case BPMPackage.DOCUMENT_ROOT__RESULTS:
                return getResults();
            case BPMPackage.DOCUMENT_ROOT__TASK_HANDLER:
                return getTaskHandler();
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
            case BPMPackage.DOCUMENT_ROOT__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__ACTION:
                setAction((ActionType1)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__AUDIT:
                setAudit((AuditType)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__IMPLEMENTATION_BPM:
                setImplementationBpm((BPMImplementationType)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__MAPPING:
                setMapping((MappingType)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__PARAMETERS:
                setParameters((ParametersType)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__RESOURCE:
                setResource((ResourceType)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__RESULTS:
                setResults((ResultsType)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__TASK_HANDLER:
                setTaskHandler((TaskHandlerType)newValue);
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
            case BPMPackage.DOCUMENT_ROOT__MIXED:
                getMixed().clear();
                return;
            case BPMPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                getXMLNSPrefixMap().clear();
                return;
            case BPMPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                getXSISchemaLocation().clear();
                return;
            case BPMPackage.DOCUMENT_ROOT__ACTION:
                setAction((ActionType1)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__AUDIT:
                setAudit((AuditType)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__IMPLEMENTATION_BPM:
                setImplementationBpm((BPMImplementationType)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__MAPPING:
                setMapping((MappingType)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__PARAMETERS:
                setParameters((ParametersType)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__RESOURCE:
                setResource((ResourceType)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__RESULTS:
                setResults((ResultsType)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__TASK_HANDLER:
                setTaskHandler((TaskHandlerType)null);
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
            case BPMPackage.DOCUMENT_ROOT__MIXED:
                return mixed != null && !mixed.isEmpty();
            case BPMPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
            case BPMPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
            case BPMPackage.DOCUMENT_ROOT__ACTION:
                return getAction() != null;
            case BPMPackage.DOCUMENT_ROOT__AUDIT:
                return getAudit() != null;
            case BPMPackage.DOCUMENT_ROOT__IMPLEMENTATION_BPM:
                return getImplementationBpm() != null;
            case BPMPackage.DOCUMENT_ROOT__MAPPING:
                return getMapping() != null;
            case BPMPackage.DOCUMENT_ROOT__PARAMETERS:
                return getParameters() != null;
            case BPMPackage.DOCUMENT_ROOT__RESOURCE:
                return getResource() != null;
            case BPMPackage.DOCUMENT_ROOT__RESULTS:
                return getResults() != null;
            case BPMPackage.DOCUMENT_ROOT__TASK_HANDLER:
                return getTaskHandler() != null;
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
        result.append(')');
        return result.toString();
    }

} //DocumentRootImpl
