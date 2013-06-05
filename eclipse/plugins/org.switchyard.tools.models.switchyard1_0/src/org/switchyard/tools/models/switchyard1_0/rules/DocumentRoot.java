/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.rules;

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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getAction <em>Action</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getActions <em>Actions</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getContainer <em>Container</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getGlobal <em>Global</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getGlobals <em>Globals</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getImplementationRules <em>Implementation Rules</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getInput <em>Input</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getListener <em>Listener</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getListeners <em>Listeners</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getLogger <em>Logger</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getLoggers <em>Loggers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getManifest <em>Manifest</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getOutput <em>Output</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getProperty <em>Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getResource <em>Resource</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot()
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_Mixed()
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_XMLNSPrefixMap()
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_XSISchemaLocation()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
     * @generated
     */
	EMap<String, String> getXSISchemaLocation();

	/**
     * Returns the value of the '<em><b>Action</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Action</em>' containment reference.
     * @see #setAction(ActionType1)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_Action()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
     * @generated
     */
	ActionType1 getAction();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getAction <em>Action</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Action</em>' containment reference.
     * @see #getAction()
     * @generated
     */
	void setAction(ActionType1 value);

	/**
     * Returns the value of the '<em><b>Actions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actions</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Actions</em>' containment reference.
     * @see #setActions(ActionsType)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_Actions()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='actions' namespace='##targetNamespace'"
     * @generated
     */
    ActionsType getActions();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getActions <em>Actions</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Actions</em>' containment reference.
     * @see #getActions()
     * @generated
     */
    void setActions(ActionsType value);

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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_Channel()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='channel' namespace='##targetNamespace'"
     * @generated
     */
	ChannelType getChannel();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getChannel <em>Channel</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_Channels()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='channels' namespace='##targetNamespace'"
     * @generated
     */
    ChannelsType getChannels();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getChannels <em>Channels</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_Container()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='container' namespace='##targetNamespace'"
     * @generated
     */
    ContainerType getContainer();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getContainer <em>Container</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_Global()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='global' namespace='##targetNamespace'"
     * @generated
     */
    MappingType getGlobal();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getGlobal <em>Global</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_Globals()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='globals' namespace='##targetNamespace'"
     * @generated
     */
    GlobalsType getGlobals();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getGlobals <em>Globals</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Globals</em>' containment reference.
     * @see #getGlobals()
     * @generated
     */
    void setGlobals(GlobalsType value);

    /**
     * Returns the value of the '<em><b>Implementation Rules</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Rules</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Implementation Rules</em>' containment reference.
     * @see #setImplementationRules(RulesImplementationType)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_ImplementationRules()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='implementation.rules' namespace='##targetNamespace' affiliation='http://docs.oasis-open.org/ns/opencsa/sca/200912#implementation'"
     * @generated
     */
	RulesImplementationType getImplementationRules();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getImplementationRules <em>Implementation Rules</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Implementation Rules</em>' containment reference.
     * @see #getImplementationRules()
     * @generated
     */
	void setImplementationRules(RulesImplementationType value);

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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_Input()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
     * @generated
     */
    MappingType getInput();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getInput <em>Input</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_Inputs()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='inputs' namespace='##targetNamespace'"
     * @generated
     */
    InputsType getInputs();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getInputs <em>Inputs</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_Listener()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='listener' namespace='##targetNamespace'"
     * @generated
     */
    ListenerType getListener();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getListener <em>Listener</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_Listeners()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='listeners' namespace='##targetNamespace'"
     * @generated
     */
    ListenersType getListeners();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getListeners <em>Listeners</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_Logger()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='logger' namespace='##targetNamespace'"
     * @generated
     */
    LoggerType1 getLogger();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getLogger <em>Logger</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_Loggers()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='loggers' namespace='##targetNamespace'"
     * @generated
     */
    LoggersType getLoggers();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getLoggers <em>Loggers</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_Manifest()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='manifest' namespace='##targetNamespace'"
     * @generated
     */
    ManifestType getManifest();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getManifest <em>Manifest</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_Output()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='output' namespace='##targetNamespace'"
     * @generated
     */
    MappingType getOutput();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getOutput <em>Output</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_Outputs()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='outputs' namespace='##targetNamespace'"
     * @generated
     */
    OutputsType getOutputs();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getOutputs <em>Outputs</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_Properties()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
     * @generated
     */
    PropertiesType getProperties();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getProperties <em>Properties</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_Property()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
     * @generated
     */
    PropertyType getProperty();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getProperty <em>Property</em>}' containment reference.
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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_Resource()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
     * @generated
     */
	ResourceType getResource();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getResource <em>Resource</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource</em>' containment reference.
     * @see #getResource()
     * @generated
     */
	void setResource(ResourceType value);

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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_Resources()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='resources' namespace='##targetNamespace'"
     * @generated
     */
    ResourcesType getResources();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getResources <em>Resources</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resources</em>' containment reference.
     * @see #getResources()
     * @generated
     */
    void setResources(ResourcesType value);

} // DocumentRoot
