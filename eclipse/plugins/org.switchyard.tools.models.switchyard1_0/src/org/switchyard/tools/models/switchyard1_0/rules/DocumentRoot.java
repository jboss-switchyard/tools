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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getAudit <em>Audit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getGlobals <em>Globals</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getImplementationRules <em>Implementation Rules</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getResource <em>Resource</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getFacts <em>Facts</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getEventListener <em>Event Listener</em>}</li>
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
     * Returns the value of the '<em><b>Audit</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Audit</em>' containment reference.
     * @see #setAudit(AuditType)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_Audit()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='audit' namespace='##targetNamespace' affiliation='urn:switchyard-component-common-rules:config:1.0#audit'"
     * @generated
     */
	AuditType getAudit();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getAudit <em>Audit</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Audit</em>' containment reference.
     * @see #getAudit()
     * @generated
     */
	void setAudit(AuditType value);

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
     *        extendedMetaData="kind='element' name='implementation.rules' namespace='##targetNamespace' affiliation='urn:switchyard-component-common-rules:config:1.0#implementation.common.rules'"
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
     * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mapping</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mapping</em>' containment reference.
     * @see #setMapping(MappingType)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_Mapping()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='mapping' namespace='##targetNamespace' affiliation='urn:switchyard-component-common-rules:config:1.0#mapping'"
     * @generated
     */
    MappingType getMapping();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getMapping <em>Mapping</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mapping</em>' containment reference.
     * @see #getMapping()
     * @generated
     */
    void setMapping(MappingType value);

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
     *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace' affiliation='urn:switchyard-config:switchyard:1.0#resource'"
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
     * Returns the value of the '<em><b>Facts</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Facts</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Facts</em>' containment reference.
     * @see #setFacts(FactsType)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_Facts()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='facts' namespace='##targetNamespace'"
     * @generated
     */
    FactsType getFacts();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getFacts <em>Facts</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Facts</em>' containment reference.
     * @see #getFacts()
     * @generated
     */
    void setFacts(FactsType value);

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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getDocumentRoot_EventListener()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='eventListener' namespace='##targetNamespace' affiliation='urn:switchyard-component-common-rules:config:1.0#mapping'"
     * @generated
     */
    EventListenerType getEventListener();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.DocumentRoot#getEventListener <em>Event Listener</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event Listener</em>' containment reference.
     * @see #getEventListener()
     * @generated
     */
    void setEventListener(EventListenerType value);

} // DocumentRoot
