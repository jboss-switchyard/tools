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
import org.switchyard.tools.models.switchyard1_0.bpm.ActionsType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.ChannelType;
import org.switchyard.tools.models.switchyard1_0.bpm.ChannelsType;
import org.switchyard.tools.models.switchyard1_0.bpm.ContainerType;
import org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.bpm.ListenerType;
import org.switchyard.tools.models.switchyard1_0.bpm.ListenersType;
import org.switchyard.tools.models.switchyard1_0.bpm.LoggerType1;
import org.switchyard.tools.models.switchyard1_0.bpm.LoggersType;
import org.switchyard.tools.models.switchyard1_0.bpm.ManifestType;
import org.switchyard.tools.models.switchyard1_0.bpm.MappingType;
import org.switchyard.tools.models.switchyard1_0.bpm.MappingsType;
import org.switchyard.tools.models.switchyard1_0.bpm.PropertiesType;
import org.switchyard.tools.models.switchyard1_0.bpm.PropertyType;
import org.switchyard.tools.models.switchyard1_0.bpm.ResourceType;
import org.switchyard.tools.models.switchyard1_0.bpm.ResourcesType;
import org.switchyard.tools.models.switchyard1_0.bpm.WorkItemHandlerType;
import org.switchyard.tools.models.switchyard1_0.bpm.WorkItemHandlersType;

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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getGlobals <em>Globals</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getImplementationBpm <em>Implementation Bpm</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getListener <em>Listener</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getListeners <em>Listeners</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getLoggers <em>Loggers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getManifest <em>Manifest</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getWorkItemHandler <em>Work Item Handler</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.DocumentRootImpl#getWorkItemHandlers <em>Work Item Handlers</em>}</li>
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
    public ActionsType getActions() {
        return (ActionsType)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__ACTIONS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetActions(ActionsType newActions, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__ACTIONS, newActions, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActions(ActionsType newActions) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__ACTIONS, newActions);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChannelType getChannel() {
        return (ChannelType)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__CHANNEL, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChannel(ChannelType newChannel, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__CHANNEL, newChannel, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChannel(ChannelType newChannel) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__CHANNEL, newChannel);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChannelsType getChannels() {
        return (ChannelsType)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__CHANNELS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChannels(ChannelsType newChannels, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__CHANNELS, newChannels, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChannels(ChannelsType newChannels) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__CHANNELS, newChannels);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContainerType getContainer() {
        return (ContainerType)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__CONTAINER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContainer(ContainerType newContainer, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__CONTAINER, newContainer, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContainer(ContainerType newContainer) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__CONTAINER, newContainer);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MappingsType getGlobals() {
        return (MappingsType)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__GLOBALS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGlobals(MappingsType newGlobals, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__GLOBALS, newGlobals, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGlobals(MappingsType newGlobals) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__GLOBALS, newGlobals);
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
    public MappingsType getInputs() {
        return (MappingsType)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__INPUTS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInputs(MappingsType newInputs, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__INPUTS, newInputs, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInputs(MappingsType newInputs) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__INPUTS, newInputs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ListenerType getListener() {
        return (ListenerType)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__LISTENER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetListener(ListenerType newListener, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__LISTENER, newListener, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setListener(ListenerType newListener) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__LISTENER, newListener);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ListenersType getListeners() {
        return (ListenersType)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__LISTENERS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetListeners(ListenersType newListeners, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__LISTENERS, newListeners, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setListeners(ListenersType newListeners) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__LISTENERS, newListeners);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LoggerType1 getLogger() {
        return (LoggerType1)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__LOGGER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLogger(LoggerType1 newLogger, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__LOGGER, newLogger, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLogger(LoggerType1 newLogger) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__LOGGER, newLogger);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LoggersType getLoggers() {
        return (LoggersType)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__LOGGERS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLoggers(LoggersType newLoggers, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__LOGGERS, newLoggers, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLoggers(LoggersType newLoggers) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__LOGGERS, newLoggers);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ManifestType getManifest() {
        return (ManifestType)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__MANIFEST, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetManifest(ManifestType newManifest, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__MANIFEST, newManifest, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setManifest(ManifestType newManifest) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__MANIFEST, newManifest);
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
    public MappingsType getOutputs() {
        return (MappingsType)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__OUTPUTS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOutputs(MappingsType newOutputs, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__OUTPUTS, newOutputs, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutputs(MappingsType newOutputs) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__OUTPUTS, newOutputs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertiesType getProperties() {
        return (PropertiesType)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__PROPERTIES, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProperties(PropertiesType newProperties, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__PROPERTIES, newProperties, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProperties(PropertiesType newProperties) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__PROPERTIES, newProperties);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertyType getProperty() {
        return (PropertyType)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__PROPERTY, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProperty(PropertyType newProperty, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__PROPERTY, newProperty, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProperty(PropertyType newProperty) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__PROPERTY, newProperty);
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
    public ResourcesType getResources() {
        return (ResourcesType)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__RESOURCES, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetResources(ResourcesType newResources, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__RESOURCES, newResources, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResources(ResourcesType newResources) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__RESOURCES, newResources);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorkItemHandlerType getWorkItemHandler() {
        return (WorkItemHandlerType)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__WORK_ITEM_HANDLER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWorkItemHandler(WorkItemHandlerType newWorkItemHandler, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__WORK_ITEM_HANDLER, newWorkItemHandler, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWorkItemHandler(WorkItemHandlerType newWorkItemHandler) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__WORK_ITEM_HANDLER, newWorkItemHandler);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorkItemHandlersType getWorkItemHandlers() {
        return (WorkItemHandlersType)getMixed().get(BPMPackage.Literals.DOCUMENT_ROOT__WORK_ITEM_HANDLERS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWorkItemHandlers(WorkItemHandlersType newWorkItemHandlers, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BPMPackage.Literals.DOCUMENT_ROOT__WORK_ITEM_HANDLERS, newWorkItemHandlers, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWorkItemHandlers(WorkItemHandlersType newWorkItemHandlers) {
        ((FeatureMap.Internal)getMixed()).set(BPMPackage.Literals.DOCUMENT_ROOT__WORK_ITEM_HANDLERS, newWorkItemHandlers);
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
            case BPMPackage.DOCUMENT_ROOT__ACTIONS:
                return basicSetActions(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__CHANNEL:
                return basicSetChannel(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__CHANNELS:
                return basicSetChannels(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__CONTAINER:
                return basicSetContainer(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__GLOBALS:
                return basicSetGlobals(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__IMPLEMENTATION_BPM:
                return basicSetImplementationBpm(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__INPUTS:
                return basicSetInputs(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__LISTENER:
                return basicSetListener(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__LISTENERS:
                return basicSetListeners(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__LOGGER:
                return basicSetLogger(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__LOGGERS:
                return basicSetLoggers(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__MANIFEST:
                return basicSetManifest(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__MAPPING:
                return basicSetMapping(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__OUTPUTS:
                return basicSetOutputs(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__PROPERTIES:
                return basicSetProperties(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__PROPERTY:
                return basicSetProperty(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__RESOURCE:
                return basicSetResource(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__RESOURCES:
                return basicSetResources(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__WORK_ITEM_HANDLER:
                return basicSetWorkItemHandler(null, msgs);
            case BPMPackage.DOCUMENT_ROOT__WORK_ITEM_HANDLERS:
                return basicSetWorkItemHandlers(null, msgs);
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
            case BPMPackage.DOCUMENT_ROOT__ACTIONS:
                return getActions();
            case BPMPackage.DOCUMENT_ROOT__CHANNEL:
                return getChannel();
            case BPMPackage.DOCUMENT_ROOT__CHANNELS:
                return getChannels();
            case BPMPackage.DOCUMENT_ROOT__CONTAINER:
                return getContainer();
            case BPMPackage.DOCUMENT_ROOT__GLOBALS:
                return getGlobals();
            case BPMPackage.DOCUMENT_ROOT__IMPLEMENTATION_BPM:
                return getImplementationBpm();
            case BPMPackage.DOCUMENT_ROOT__INPUTS:
                return getInputs();
            case BPMPackage.DOCUMENT_ROOT__LISTENER:
                return getListener();
            case BPMPackage.DOCUMENT_ROOT__LISTENERS:
                return getListeners();
            case BPMPackage.DOCUMENT_ROOT__LOGGER:
                return getLogger();
            case BPMPackage.DOCUMENT_ROOT__LOGGERS:
                return getLoggers();
            case BPMPackage.DOCUMENT_ROOT__MANIFEST:
                return getManifest();
            case BPMPackage.DOCUMENT_ROOT__MAPPING:
                return getMapping();
            case BPMPackage.DOCUMENT_ROOT__OUTPUTS:
                return getOutputs();
            case BPMPackage.DOCUMENT_ROOT__PROPERTIES:
                return getProperties();
            case BPMPackage.DOCUMENT_ROOT__PROPERTY:
                return getProperty();
            case BPMPackage.DOCUMENT_ROOT__RESOURCE:
                return getResource();
            case BPMPackage.DOCUMENT_ROOT__RESOURCES:
                return getResources();
            case BPMPackage.DOCUMENT_ROOT__WORK_ITEM_HANDLER:
                return getWorkItemHandler();
            case BPMPackage.DOCUMENT_ROOT__WORK_ITEM_HANDLERS:
                return getWorkItemHandlers();
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
            case BPMPackage.DOCUMENT_ROOT__ACTIONS:
                setActions((ActionsType)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__CHANNEL:
                setChannel((ChannelType)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__CHANNELS:
                setChannels((ChannelsType)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__CONTAINER:
                setContainer((ContainerType)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__GLOBALS:
                setGlobals((MappingsType)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__IMPLEMENTATION_BPM:
                setImplementationBpm((BPMImplementationType)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__INPUTS:
                setInputs((MappingsType)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__LISTENER:
                setListener((ListenerType)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__LISTENERS:
                setListeners((ListenersType)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__LOGGER:
                setLogger((LoggerType1)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__LOGGERS:
                setLoggers((LoggersType)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__MANIFEST:
                setManifest((ManifestType)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__MAPPING:
                setMapping((MappingType)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__OUTPUTS:
                setOutputs((MappingsType)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__PROPERTIES:
                setProperties((PropertiesType)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__PROPERTY:
                setProperty((PropertyType)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__RESOURCE:
                setResource((ResourceType)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__RESOURCES:
                setResources((ResourcesType)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__WORK_ITEM_HANDLER:
                setWorkItemHandler((WorkItemHandlerType)newValue);
                return;
            case BPMPackage.DOCUMENT_ROOT__WORK_ITEM_HANDLERS:
                setWorkItemHandlers((WorkItemHandlersType)newValue);
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
            case BPMPackage.DOCUMENT_ROOT__ACTIONS:
                setActions((ActionsType)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__CHANNEL:
                setChannel((ChannelType)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__CHANNELS:
                setChannels((ChannelsType)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__CONTAINER:
                setContainer((ContainerType)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__GLOBALS:
                setGlobals((MappingsType)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__IMPLEMENTATION_BPM:
                setImplementationBpm((BPMImplementationType)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__INPUTS:
                setInputs((MappingsType)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__LISTENER:
                setListener((ListenerType)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__LISTENERS:
                setListeners((ListenersType)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__LOGGER:
                setLogger((LoggerType1)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__LOGGERS:
                setLoggers((LoggersType)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__MANIFEST:
                setManifest((ManifestType)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__MAPPING:
                setMapping((MappingType)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__OUTPUTS:
                setOutputs((MappingsType)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__PROPERTIES:
                setProperties((PropertiesType)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__PROPERTY:
                setProperty((PropertyType)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__RESOURCE:
                setResource((ResourceType)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__RESOURCES:
                setResources((ResourcesType)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__WORK_ITEM_HANDLER:
                setWorkItemHandler((WorkItemHandlerType)null);
                return;
            case BPMPackage.DOCUMENT_ROOT__WORK_ITEM_HANDLERS:
                setWorkItemHandlers((WorkItemHandlersType)null);
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
            case BPMPackage.DOCUMENT_ROOT__ACTIONS:
                return getActions() != null;
            case BPMPackage.DOCUMENT_ROOT__CHANNEL:
                return getChannel() != null;
            case BPMPackage.DOCUMENT_ROOT__CHANNELS:
                return getChannels() != null;
            case BPMPackage.DOCUMENT_ROOT__CONTAINER:
                return getContainer() != null;
            case BPMPackage.DOCUMENT_ROOT__GLOBALS:
                return getGlobals() != null;
            case BPMPackage.DOCUMENT_ROOT__IMPLEMENTATION_BPM:
                return getImplementationBpm() != null;
            case BPMPackage.DOCUMENT_ROOT__INPUTS:
                return getInputs() != null;
            case BPMPackage.DOCUMENT_ROOT__LISTENER:
                return getListener() != null;
            case BPMPackage.DOCUMENT_ROOT__LISTENERS:
                return getListeners() != null;
            case BPMPackage.DOCUMENT_ROOT__LOGGER:
                return getLogger() != null;
            case BPMPackage.DOCUMENT_ROOT__LOGGERS:
                return getLoggers() != null;
            case BPMPackage.DOCUMENT_ROOT__MANIFEST:
                return getManifest() != null;
            case BPMPackage.DOCUMENT_ROOT__MAPPING:
                return getMapping() != null;
            case BPMPackage.DOCUMENT_ROOT__OUTPUTS:
                return getOutputs() != null;
            case BPMPackage.DOCUMENT_ROOT__PROPERTIES:
                return getProperties() != null;
            case BPMPackage.DOCUMENT_ROOT__PROPERTY:
                return getProperty() != null;
            case BPMPackage.DOCUMENT_ROOT__RESOURCE:
                return getResource() != null;
            case BPMPackage.DOCUMENT_ROOT__RESOURCES:
                return getResources() != null;
            case BPMPackage.DOCUMENT_ROOT__WORK_ITEM_HANDLER:
                return getWorkItemHandler() != null;
            case BPMPackage.DOCUMENT_ROOT__WORK_ITEM_HANDLERS:
                return getWorkItemHandlers() != null;
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
