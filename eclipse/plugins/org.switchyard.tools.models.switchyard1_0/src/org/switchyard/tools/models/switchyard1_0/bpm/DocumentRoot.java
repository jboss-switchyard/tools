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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getAction <em>Action</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getAudit <em>Audit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getImplementationBpm <em>Implementation Bpm</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getResource <em>Resource</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getResults <em>Results</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getTaskHandler <em>Task Handler</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getEventListener <em>Event Listener</em>}</li>
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
     * Returns the value of the '<em><b>Action</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Action</em>' containment reference.
     * @see #setAction(ActionType1)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Action()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
     * @generated
     */
	ActionType1 getAction();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getAction <em>Action</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Action</em>' containment reference.
     * @see #getAction()
     * @generated
     */
	void setAction(ActionType1 value);

	/**
     * Returns the value of the '<em><b>Audit</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Audit</em>' containment reference.
     * @see #setAudit(AuditType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Audit()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='audit' namespace='##targetNamespace' affiliation='urn:switchyard-component-common-rules:config:1.0#audit'"
     * @generated
     */
	AuditType getAudit();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getAudit <em>Audit</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Audit</em>' containment reference.
     * @see #getAudit()
     * @generated
     */
	void setAudit(AuditType value);

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
     *        extendedMetaData="kind='element' name='implementation.bpm' namespace='##targetNamespace' affiliation='urn:switchyard-component-common-rules:config:1.0#implementation.common.rules'"
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
     * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mapping</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mapping</em>' containment reference.
     * @see #setMapping(MappingType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Mapping()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='mapping' namespace='##targetNamespace' affiliation='urn:switchyard-component-common-rules:config:1.0#mapping'"
     * @generated
     */
    MappingType getMapping();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getMapping <em>Mapping</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mapping</em>' containment reference.
     * @see #getMapping()
     * @generated
     */
    void setMapping(MappingType value);

    /**
     * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameters</em>' containment reference.
     * @see #setParameters(ParametersType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Parameters()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='parameters' namespace='##targetNamespace'"
     * @generated
     */
    ParametersType getParameters();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getParameters <em>Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parameters</em>' containment reference.
     * @see #getParameters()
     * @generated
     */
    void setParameters(ParametersType value);

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
     *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#resource'"
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
     * Returns the value of the '<em><b>Results</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Results</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Results</em>' containment reference.
     * @see #setResults(ResultsType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_Results()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='results' namespace='##targetNamespace'"
     * @generated
     */
    ResultsType getResults();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getResults <em>Results</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Results</em>' containment reference.
     * @see #getResults()
     * @generated
     */
    void setResults(ResultsType value);

    /**
     * Returns the value of the '<em><b>Task Handler</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Handler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Task Handler</em>' containment reference.
     * @see #setTaskHandler(TaskHandlerType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_TaskHandler()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='taskHandler' namespace='##targetNamespace'"
     * @generated
     */
	TaskHandlerType getTaskHandler();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getTaskHandler <em>Task Handler</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Task Handler</em>' containment reference.
     * @see #getTaskHandler()
     * @generated
     */
	void setTaskHandler(TaskHandlerType value);

    /**
     * Returns the value of the '<em><b>Event Listener</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Listener</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Listener</em>' containment reference.
     * @see #setEventListener(EventListenerType)
     * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage#getDocumentRoot_EventListener()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='eventListener' namespace='##targetNamespace' affiliation='urn:switchyard-component-common-rules:config:1.0#mapping'"
     * @generated
     */
    EventListenerType getEventListener();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.bpm.DocumentRoot#getEventListener <em>Event Listener</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event Listener</em>' containment reference.
     * @see #getEventListener()
     * @generated
     */
    void setEventListener(EventListenerType value);

} // DocumentRoot
