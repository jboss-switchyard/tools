/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.bpm;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getContainer <em>Container</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getFault <em>Fault</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getFaults <em>Faults</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getGlobal <em>Global</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getGlobals <em>Globals</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getImplementationBpm <em>Implementation Bpm</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getInput <em>Input</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getListener <em>Listener</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getListeners <em>Listeners</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getLogger <em>Logger</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getLoggers <em>Loggers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getManifest <em>Manifest</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getOutput <em>Output</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getProperty <em>Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getResource <em>Resource</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getResourceDetail <em>Resource Detail</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getResources <em>Resources</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getUserGroupCallback <em>User Group Callback</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getWorkItemHandler <em>Work Item Handler</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getWorkItemHandlers <em>Work Item Handlers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
     * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Mixed</em>' attribute list.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Mixed()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' name=':mixed'"
     * @generated
     */
	FeatureMap getMixed();

	/**
     * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>XMLNS Prefix Map</em>' map.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_XMLNSPrefixMap()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
     * @generated
     */
	EMap<String, String> getXMLNSPrefixMap();

	/**
     * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>XSI Schema Location</em>' map.
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_XSISchemaLocation()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
     * @generated
     */
	EMap<String, String> getXSISchemaLocation();

	/**
     * Returns the value of the '<em><b>Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operation</em>' containment reference.
     * @see #setOperation(BPMOperationType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Operation()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
     * @generated
     */
    BPMOperationType getOperation();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getOperation <em>Operation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation</em>' containment reference.
     * @see #getOperation()
     * @generated
     */
    void setOperation(BPMOperationType value);

    /**
     * Returns the value of the '<em><b>Operations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operations</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operations</em>' containment reference.
     * @see #setOperations(OperationsType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Operations()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='operations' namespace='##targetNamespace'"
     * @generated
     */
    OperationsType getOperations();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getOperations <em>Operations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operations</em>' containment reference.
     * @see #getOperations()
     * @generated
     */
    void setOperations(OperationsType value);

    /**
     * Returns the value of the '<em><b>Channel</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Channel</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Channel</em>' containment reference.
     * @see #setChannel(ChannelType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Channel()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='channel' namespace='##targetNamespace'"
     * @generated
     */
    ChannelType getChannel();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getChannel <em>Channel</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Channel</em>' containment reference.
     * @see #getChannel()
     * @generated
     */
    void setChannel(ChannelType value);

    /**
     * Returns the value of the '<em><b>Channels</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Channels</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Channels</em>' containment reference.
     * @see #setChannels(ChannelsType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Channels()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='channels' namespace='##targetNamespace'"
     * @generated
     */
    ChannelsType getChannels();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getChannels <em>Channels</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Channels</em>' containment reference.
     * @see #getChannels()
     * @generated
     */
    void setChannels(ChannelsType value);

    /**
     * Returns the value of the '<em><b>Container</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Container</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Container</em>' containment reference.
     * @see #setContainer(ContainerType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Container()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='container' namespace='##targetNamespace'"
     * @generated
     */
    ContainerType getContainer();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getContainer <em>Container</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Container</em>' containment reference.
     * @see #getContainer()
     * @generated
     */
    void setContainer(ContainerType value);

    /**
     * Returns the value of the '<em><b>Global</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Global</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Global</em>' containment reference.
     * @see #setGlobal(MappingType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Global()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='global' namespace='##targetNamespace'"
     * @generated
     */
    MappingType getGlobal();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getGlobal <em>Global</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Global</em>' containment reference.
     * @see #getGlobal()
     * @generated
     */
    void setGlobal(MappingType value);

    /**
     * Returns the value of the '<em><b>Globals</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Globals</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Globals</em>' containment reference.
     * @see #setGlobals(GlobalsType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Globals()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='globals' namespace='##targetNamespace'"
     * @generated
     */
    GlobalsType getGlobals();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getGlobals <em>Globals</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Globals</em>' containment reference.
     * @see #getGlobals()
     * @generated
     */
    void setGlobals(GlobalsType value);

    /**
     * Returns the value of the '<em><b>Implementation Bpm</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Bpm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Implementation Bpm</em>' containment reference.
     * @see #setImplementationBpm(BPMImplementationType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_ImplementationBpm()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='implementation.bpm' namespace='##targetNamespace' affiliation='http://docs.oasis-open.org/ns/opencsa/sca/200912#implementation'"
     * @generated
     */
	BPMImplementationType getImplementationBpm();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getImplementationBpm <em>Implementation Bpm</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Implementation Bpm</em>' containment reference.
     * @see #getImplementationBpm()
     * @generated
     */
	void setImplementationBpm(BPMImplementationType value);

	/**
     * Returns the value of the '<em><b>Input</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input</em>' containment reference.
     * @see #setInput(MappingType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Input()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
     * @generated
     */
    MappingType getInput();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getInput <em>Input</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input</em>' containment reference.
     * @see #getInput()
     * @generated
     */
    void setInput(MappingType value);

    /**
     * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inputs</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inputs</em>' containment reference.
     * @see #setInputs(InputsType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Inputs()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='inputs' namespace='##targetNamespace'"
     * @generated
     */
    InputsType getInputs();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getInputs <em>Inputs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inputs</em>' containment reference.
     * @see #getInputs()
     * @generated
     */
    void setInputs(InputsType value);

    /**
     * Returns the value of the '<em><b>Listener</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Listener</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Listener</em>' containment reference.
     * @see #setListener(ListenerType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Listener()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='listener' namespace='##targetNamespace'"
     * @generated
     */
    ListenerType getListener();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getListener <em>Listener</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Listener</em>' containment reference.
     * @see #getListener()
     * @generated
     */
    void setListener(ListenerType value);

    /**
     * Returns the value of the '<em><b>Listeners</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Listeners</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Listeners</em>' containment reference.
     * @see #setListeners(ListenersType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Listeners()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='listeners' namespace='##targetNamespace'"
     * @generated
     */
    ListenersType getListeners();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getListeners <em>Listeners</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Listeners</em>' containment reference.
     * @see #getListeners()
     * @generated
     */
    void setListeners(ListenersType value);

    /**
     * Returns the value of the '<em><b>Logger</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Logger</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Logger</em>' containment reference.
     * @see #setLogger(LoggerType1)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Logger()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='logger' namespace='##targetNamespace'"
     * @generated
     */
    LoggerType1 getLogger();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getLogger <em>Logger</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Logger</em>' containment reference.
     * @see #getLogger()
     * @generated
     */
    void setLogger(LoggerType1 value);

    /**
     * Returns the value of the '<em><b>Loggers</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Loggers</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Loggers</em>' containment reference.
     * @see #setLoggers(LoggersType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Loggers()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='loggers' namespace='##targetNamespace'"
     * @generated
     */
    LoggersType getLoggers();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getLoggers <em>Loggers</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Loggers</em>' containment reference.
     * @see #getLoggers()
     * @generated
     */
    void setLoggers(LoggersType value);

    /**
     * Returns the value of the '<em><b>Manifest</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Manifest</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Manifest</em>' containment reference.
     * @see #setManifest(ManifestType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Manifest()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='manifest' namespace='##targetNamespace'"
     * @generated
     */
    ManifestType getManifest();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getManifest <em>Manifest</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Manifest</em>' containment reference.
     * @see #getManifest()
     * @generated
     */
    void setManifest(ManifestType value);

    /**
     * Returns the value of the '<em><b>Output</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output</em>' containment reference.
     * @see #setOutput(MappingType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Output()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='output' namespace='##targetNamespace'"
     * @generated
     */
    MappingType getOutput();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getOutput <em>Output</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output</em>' containment reference.
     * @see #getOutput()
     * @generated
     */
    void setOutput(MappingType value);

    /**
     * Returns the value of the '<em><b>Outputs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outputs</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outputs</em>' containment reference.
     * @see #setOutputs(OutputsType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Outputs()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='outputs' namespace='##targetNamespace'"
     * @generated
     */
    OutputsType getOutputs();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getOutputs <em>Outputs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Outputs</em>' containment reference.
     * @see #getOutputs()
     * @generated
     */
    void setOutputs(OutputsType value);

    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference.
     * @see #setProperties(PropertiesType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Properties()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
     * @generated
     */
    PropertiesType getProperties();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getProperties <em>Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Properties</em>' containment reference.
     * @see #getProperties()
     * @generated
     */
    void setProperties(PropertiesType value);

    /**
     * Returns the value of the '<em><b>Property</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property</em>' containment reference.
     * @see #setProperty(PropertyType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Property()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
     * @generated
     */
    PropertyType getProperty();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getProperty <em>Property</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property</em>' containment reference.
     * @see #getProperty()
     * @generated
     */
    void setProperty(PropertyType value);

    /**
     * Returns the value of the '<em><b>Resource</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Resource</em>' containment reference.
     * @see #setResource(ResourceType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Resource()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
     * @generated
     */
	ResourceType getResource();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getResource <em>Resource</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource</em>' containment reference.
     * @see #getResource()
     * @generated
     */
	void setResource(ResourceType value);

	/**
     * Returns the value of the '<em><b>Resource Detail</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource Detail</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resource Detail</em>' containment reference.
     * @see #setResourceDetail(ResourceDetailType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_ResourceDetail()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='resourceDetail' namespace='##targetNamespace'"
     * @generated
     */
    ResourceDetailType getResourceDetail();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getResourceDetail <em>Resource Detail</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource Detail</em>' containment reference.
     * @see #getResourceDetail()
     * @generated
     */
    void setResourceDetail(ResourceDetailType value);

    /**
     * Returns the value of the '<em><b>Resources</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resources</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resources</em>' containment reference.
     * @see #setResources(ResourcesType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Resources()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='resources' namespace='##targetNamespace'"
     * @generated
     */
    ResourcesType getResources();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getResources <em>Resources</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resources</em>' containment reference.
     * @see #getResources()
     * @generated
     */
    void setResources(ResourcesType value);

    /**
     * Returns the value of the '<em><b>Work Item Handler</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Work Item Handler</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Work Item Handler</em>' containment reference.
     * @see #setWorkItemHandler(WorkItemHandlerType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_WorkItemHandler()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='workItemHandler' namespace='##targetNamespace'"
     * @generated
     */
    WorkItemHandlerType getWorkItemHandler();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getWorkItemHandler <em>Work Item Handler</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Work Item Handler</em>' containment reference.
     * @see #getWorkItemHandler()
     * @generated
     */
    void setWorkItemHandler(WorkItemHandlerType value);

    /**
     * Returns the value of the '<em><b>Work Item Handlers</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Work Item Handlers</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Work Item Handlers</em>' containment reference.
     * @see #setWorkItemHandlers(WorkItemHandlersType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_WorkItemHandlers()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='workItemHandlers' namespace='##targetNamespace'"
     * @generated
     */
    WorkItemHandlersType getWorkItemHandlers();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getWorkItemHandlers <em>Work Item Handlers</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Work Item Handlers</em>' containment reference.
     * @see #getWorkItemHandlers()
     * @generated
     */
    void setWorkItemHandlers(WorkItemHandlersType value);

    /**
     * Returns the value of the '<em><b>User Group Callback</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User Group Callback</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>User Group Callback</em>' containment reference.
     * @see #setUserGroupCallback(UserGroupCallbackType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_UserGroupCallback()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='userGroupCallback' namespace='##targetNamespace'"
     * @generated
     */
    UserGroupCallbackType getUserGroupCallback();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getUserGroupCallback <em>User Group Callback</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>User Group Callback</em>' containment reference.
     * @see #getUserGroupCallback()
     * @generated
     */
    void setUserGroupCallback(UserGroupCallbackType value);

    /**
     * Returns the value of the '<em><b>Faults</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Faults</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Faults</em>' containment reference.
     * @see #setFaults(FaultsType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Faults()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='faults' namespace='##targetNamespace'"
     * @generated
     */
    FaultsType getFaults();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getFaults <em>Faults</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Faults</em>' containment reference.
     * @see #getFaults()
     * @generated
     */
    void setFaults(FaultsType value);

    /**
     * Returns the value of the '<em><b>Fault</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fault</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fault</em>' containment reference.
     * @see #setFault(MappingType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Fault()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='fault' namespace='##targetNamespace'"
     * @generated
     */
    MappingType getFault();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getFault <em>Fault</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fault</em>' containment reference.
     * @see #getFault()
     * @generated
     */
    void setFault(MappingType value);

} // DocumentRoot
