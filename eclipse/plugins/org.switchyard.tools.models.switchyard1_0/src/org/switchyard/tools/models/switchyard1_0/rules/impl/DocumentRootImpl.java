/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.rules.impl;

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

import org.switchyard.tools.models.switchyard1_0.rules.ActionType1;
import org.switchyard.tools.models.switchyard1_0.rules.AuditType;
import org.switchyard.tools.models.switchyard1_0.rules.ChannelType;
import org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.rules.EventListenerType;
import org.switchyard.tools.models.switchyard1_0.rules.FactsType;
import org.switchyard.tools.models.switchyard1_0.rules.GlobalsType;
import org.switchyard.tools.models.switchyard1_0.rules.MappingType;
import org.switchyard.tools.models.switchyard1_0.rules.ResourceType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.DocumentRootImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.DocumentRootImpl#getAudit <em>Audit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.DocumentRootImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.DocumentRootImpl#getGlobals <em>Globals</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.DocumentRootImpl#getImplementationRules <em>Implementation Rules</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.DocumentRootImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.DocumentRootImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.DocumentRootImpl#getFacts <em>Facts</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.DocumentRootImpl#getEventListener <em>Event Listener</em>}</li>
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
        return RulesPackage.Literals.DOCUMENT_ROOT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, RulesPackage.DOCUMENT_ROOT__MIXED);
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
            xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, RulesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
            xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, RulesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return xSISchemaLocation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ActionType1 getAction() {
        return (ActionType1)getMixed().get(RulesPackage.Literals.DOCUMENT_ROOT__ACTION, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetAction(ActionType1 newAction, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(RulesPackage.Literals.DOCUMENT_ROOT__ACTION, newAction, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAction(ActionType1 newAction) {
        ((FeatureMap.Internal)getMixed()).set(RulesPackage.Literals.DOCUMENT_ROOT__ACTION, newAction);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AuditType getAudit() {
        return (AuditType)getMixed().get(RulesPackage.Literals.DOCUMENT_ROOT__AUDIT, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetAudit(AuditType newAudit, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(RulesPackage.Literals.DOCUMENT_ROOT__AUDIT, newAudit, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAudit(AuditType newAudit) {
        ((FeatureMap.Internal)getMixed()).set(RulesPackage.Literals.DOCUMENT_ROOT__AUDIT, newAudit);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ChannelType getChannel() {
        return (ChannelType)getMixed().get(RulesPackage.Literals.DOCUMENT_ROOT__CHANNEL, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetChannel(ChannelType newChannel, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(RulesPackage.Literals.DOCUMENT_ROOT__CHANNEL, newChannel, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setChannel(ChannelType newChannel) {
        ((FeatureMap.Internal)getMixed()).set(RulesPackage.Literals.DOCUMENT_ROOT__CHANNEL, newChannel);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalsType getGlobals() {
        return (GlobalsType)getMixed().get(RulesPackage.Literals.DOCUMENT_ROOT__GLOBALS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGlobals(GlobalsType newGlobals, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(RulesPackage.Literals.DOCUMENT_ROOT__GLOBALS, newGlobals, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGlobals(GlobalsType newGlobals) {
        ((FeatureMap.Internal)getMixed()).set(RulesPackage.Literals.DOCUMENT_ROOT__GLOBALS, newGlobals);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RulesImplementationType getImplementationRules() {
        return (RulesImplementationType)getMixed().get(RulesPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_RULES, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetImplementationRules(RulesImplementationType newImplementationRules, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(RulesPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_RULES, newImplementationRules, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setImplementationRules(RulesImplementationType newImplementationRules) {
        ((FeatureMap.Internal)getMixed()).set(RulesPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_RULES, newImplementationRules);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MappingType getMapping() {
        return (MappingType)getMixed().get(RulesPackage.Literals.DOCUMENT_ROOT__MAPPING, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMapping(MappingType newMapping, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(RulesPackage.Literals.DOCUMENT_ROOT__MAPPING, newMapping, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMapping(MappingType newMapping) {
        ((FeatureMap.Internal)getMixed()).set(RulesPackage.Literals.DOCUMENT_ROOT__MAPPING, newMapping);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResourceType getResource() {
        return (ResourceType)getMixed().get(RulesPackage.Literals.DOCUMENT_ROOT__RESOURCE, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetResource(ResourceType newResource, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(RulesPackage.Literals.DOCUMENT_ROOT__RESOURCE, newResource, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setResource(ResourceType newResource) {
        ((FeatureMap.Internal)getMixed()).set(RulesPackage.Literals.DOCUMENT_ROOT__RESOURCE, newResource);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FactsType getFacts() {
        return (FactsType)getMixed().get(RulesPackage.Literals.DOCUMENT_ROOT__FACTS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFacts(FactsType newFacts, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(RulesPackage.Literals.DOCUMENT_ROOT__FACTS, newFacts, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFacts(FactsType newFacts) {
        ((FeatureMap.Internal)getMixed()).set(RulesPackage.Literals.DOCUMENT_ROOT__FACTS, newFacts);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventListenerType getEventListener() {
        return (EventListenerType)getMixed().get(RulesPackage.Literals.DOCUMENT_ROOT__EVENT_LISTENER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEventListener(EventListenerType newEventListener, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(RulesPackage.Literals.DOCUMENT_ROOT__EVENT_LISTENER, newEventListener, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEventListener(EventListenerType newEventListener) {
        ((FeatureMap.Internal)getMixed()).set(RulesPackage.Literals.DOCUMENT_ROOT__EVENT_LISTENER, newEventListener);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RulesPackage.DOCUMENT_ROOT__MIXED:
                return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
            case RulesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
            case RulesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
            case RulesPackage.DOCUMENT_ROOT__ACTION:
                return basicSetAction(null, msgs);
            case RulesPackage.DOCUMENT_ROOT__AUDIT:
                return basicSetAudit(null, msgs);
            case RulesPackage.DOCUMENT_ROOT__CHANNEL:
                return basicSetChannel(null, msgs);
            case RulesPackage.DOCUMENT_ROOT__GLOBALS:
                return basicSetGlobals(null, msgs);
            case RulesPackage.DOCUMENT_ROOT__IMPLEMENTATION_RULES:
                return basicSetImplementationRules(null, msgs);
            case RulesPackage.DOCUMENT_ROOT__MAPPING:
                return basicSetMapping(null, msgs);
            case RulesPackage.DOCUMENT_ROOT__RESOURCE:
                return basicSetResource(null, msgs);
            case RulesPackage.DOCUMENT_ROOT__FACTS:
                return basicSetFacts(null, msgs);
            case RulesPackage.DOCUMENT_ROOT__EVENT_LISTENER:
                return basicSetEventListener(null, msgs);
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
            case RulesPackage.DOCUMENT_ROOT__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case RulesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                if (coreType) return getXMLNSPrefixMap();
                else return getXMLNSPrefixMap().map();
            case RulesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                if (coreType) return getXSISchemaLocation();
                else return getXSISchemaLocation().map();
            case RulesPackage.DOCUMENT_ROOT__ACTION:
                return getAction();
            case RulesPackage.DOCUMENT_ROOT__AUDIT:
                return getAudit();
            case RulesPackage.DOCUMENT_ROOT__CHANNEL:
                return getChannel();
            case RulesPackage.DOCUMENT_ROOT__GLOBALS:
                return getGlobals();
            case RulesPackage.DOCUMENT_ROOT__IMPLEMENTATION_RULES:
                return getImplementationRules();
            case RulesPackage.DOCUMENT_ROOT__MAPPING:
                return getMapping();
            case RulesPackage.DOCUMENT_ROOT__RESOURCE:
                return getResource();
            case RulesPackage.DOCUMENT_ROOT__FACTS:
                return getFacts();
            case RulesPackage.DOCUMENT_ROOT__EVENT_LISTENER:
                return getEventListener();
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
            case RulesPackage.DOCUMENT_ROOT__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case RulesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
                return;
            case RulesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
                return;
            case RulesPackage.DOCUMENT_ROOT__ACTION:
                setAction((ActionType1)newValue);
                return;
            case RulesPackage.DOCUMENT_ROOT__AUDIT:
                setAudit((AuditType)newValue);
                return;
            case RulesPackage.DOCUMENT_ROOT__CHANNEL:
                setChannel((ChannelType)newValue);
                return;
            case RulesPackage.DOCUMENT_ROOT__GLOBALS:
                setGlobals((GlobalsType)newValue);
                return;
            case RulesPackage.DOCUMENT_ROOT__IMPLEMENTATION_RULES:
                setImplementationRules((RulesImplementationType)newValue);
                return;
            case RulesPackage.DOCUMENT_ROOT__MAPPING:
                setMapping((MappingType)newValue);
                return;
            case RulesPackage.DOCUMENT_ROOT__RESOURCE:
                setResource((ResourceType)newValue);
                return;
            case RulesPackage.DOCUMENT_ROOT__FACTS:
                setFacts((FactsType)newValue);
                return;
            case RulesPackage.DOCUMENT_ROOT__EVENT_LISTENER:
                setEventListener((EventListenerType)newValue);
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
            case RulesPackage.DOCUMENT_ROOT__MIXED:
                getMixed().clear();
                return;
            case RulesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                getXMLNSPrefixMap().clear();
                return;
            case RulesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                getXSISchemaLocation().clear();
                return;
            case RulesPackage.DOCUMENT_ROOT__ACTION:
                setAction((ActionType1)null);
                return;
            case RulesPackage.DOCUMENT_ROOT__AUDIT:
                setAudit((AuditType)null);
                return;
            case RulesPackage.DOCUMENT_ROOT__CHANNEL:
                setChannel((ChannelType)null);
                return;
            case RulesPackage.DOCUMENT_ROOT__GLOBALS:
                setGlobals((GlobalsType)null);
                return;
            case RulesPackage.DOCUMENT_ROOT__IMPLEMENTATION_RULES:
                setImplementationRules((RulesImplementationType)null);
                return;
            case RulesPackage.DOCUMENT_ROOT__MAPPING:
                setMapping((MappingType)null);
                return;
            case RulesPackage.DOCUMENT_ROOT__RESOURCE:
                setResource((ResourceType)null);
                return;
            case RulesPackage.DOCUMENT_ROOT__FACTS:
                setFacts((FactsType)null);
                return;
            case RulesPackage.DOCUMENT_ROOT__EVENT_LISTENER:
                setEventListener((EventListenerType)null);
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
            case RulesPackage.DOCUMENT_ROOT__MIXED:
                return mixed != null && !mixed.isEmpty();
            case RulesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
            case RulesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
            case RulesPackage.DOCUMENT_ROOT__ACTION:
                return getAction() != null;
            case RulesPackage.DOCUMENT_ROOT__AUDIT:
                return getAudit() != null;
            case RulesPackage.DOCUMENT_ROOT__CHANNEL:
                return getChannel() != null;
            case RulesPackage.DOCUMENT_ROOT__GLOBALS:
                return getGlobals() != null;
            case RulesPackage.DOCUMENT_ROOT__IMPLEMENTATION_RULES:
                return getImplementationRules() != null;
            case RulesPackage.DOCUMENT_ROOT__MAPPING:
                return getMapping() != null;
            case RulesPackage.DOCUMENT_ROOT__RESOURCE:
                return getResource() != null;
            case RulesPackage.DOCUMENT_ROOT__FACTS:
                return getFacts() != null;
            case RulesPackage.DOCUMENT_ROOT__EVENT_LISTENER:
                return getEventListener() != null;
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
