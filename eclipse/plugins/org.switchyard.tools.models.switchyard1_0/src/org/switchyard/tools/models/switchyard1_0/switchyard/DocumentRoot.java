/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard;

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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getBindingSwitchyard <em>Binding Switchyard</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getInterfaceEsb <em>Interface Esb</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getOperationSelector <em>Operation Selector</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getOperationSelectorSwitchyard <em>Operation Selector Switchyard</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getOperationSelectorJava <em>Operation Selector Java</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getOperationSelectorRegex <em>Operation Selector Regex</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getOperationSelectorXpath <em>Operation Selector Xpath</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getProperty <em>Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getResource <em>Resource</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getSecurities <em>Securities</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getSwitchyard <em>Switchyard</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getThrottling <em>Throttling</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getTransforms <em>Transforms</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getValidates <em>Validates</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#isClustered <em>Clustered</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#isPreferLocal <em>Prefer Local</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getSecurity1 <em>Security1</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getTarget <em>Target</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getTargetNamespace <em>Target Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot()
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
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_Mixed()
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
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' containment reference.
	 * @see #setArtifact(ArtifactType)
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_Artifact()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='artifact' namespace='##targetNamespace'"
	 * @generated
	 */
	ArtifactType getArtifact();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getArtifact <em>Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact</em>' containment reference.
	 * @see #getArtifact()
	 * @generated
	 */
	void setArtifact(ArtifactType value);

	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifacts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifacts</em>' containment reference.
	 * @see #setArtifacts(ArtifactsType)
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_Artifacts()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='artifacts' namespace='##targetNamespace'"
	 * @generated
	 */
	ArtifactsType getArtifacts();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getArtifacts <em>Artifacts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifacts</em>' containment reference.
	 * @see #getArtifacts()
	 * @generated
	 */
	void setArtifacts(ArtifactsType value);

	/**
	 * Returns the value of the '<em><b>Binding Switchyard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Switchyard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Switchyard</em>' containment reference.
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_BindingSwitchyard()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='binding.switchyard' namespace='##targetNamespace' affiliation='http://docs.oasis-open.org/ns/opencsa/sca/200912#binding'"
	 * @generated
	 */
	SwitchYardBindingType getBindingSwitchyard();

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(DomainType)
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_Domain()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='domain' namespace='##targetNamespace'"
	 * @generated
	 */
	DomainType getDomain();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(DomainType value);

	/**
	 * Returns the value of the '<em><b>Interface Esb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Esb</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Esb</em>' containment reference.
	 * @see #setInterfaceEsb(EsbInterface)
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_InterfaceEsb()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interface.esb' namespace='##targetNamespace' affiliation='http://docs.oasis-open.org/ns/opencsa/sca/200912#interface'"
	 * @generated
	 */
	EsbInterface getInterfaceEsb();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getInterfaceEsb <em>Interface Esb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Esb</em>' containment reference.
	 * @see #getInterfaceEsb()
	 * @generated
	 */
	void setInterfaceEsb(EsbInterface value);

	/**
	 * Returns the value of the '<em><b>Operation Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation Selector</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Selector</em>' containment reference.
	 * @see #setOperationSelector(StaticOperationSelectorType)
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_OperationSelector()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='operationSelector' namespace='##targetNamespace' affiliation='operationSelector.switchyard'"
	 * @generated
	 */
    StaticOperationSelectorType getOperationSelector();

    /**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getOperationSelector <em>Operation Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Selector</em>' containment reference.
	 * @see #getOperationSelector()
	 * @generated
	 */
    void setOperationSelector(StaticOperationSelectorType value);

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
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_Properties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType getProperties();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getProperties <em>Properties</em>}' containment reference.
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
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_Property()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyType getProperty();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getProperty <em>Property</em>}' containment reference.
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
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_Resource()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceType getResource();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(ResourceType value);

	/**
	 * Returns the value of the '<em><b>Switchyard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switchyard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switchyard</em>' containment reference.
	 * @see #setSwitchyard(SwitchYardType)
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_Switchyard()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='switchyard' namespace='##targetNamespace'"
	 * @generated
	 */
	SwitchYardType getSwitchyard();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getSwitchyard <em>Switchyard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switchyard</em>' containment reference.
	 * @see #getSwitchyard()
	 * @generated
	 */
	void setSwitchyard(SwitchYardType value);

	/**
	 * Returns the value of the '<em><b>Throttling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Throttling</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Throttling</em>' containment reference.
	 * @see #setThrottling(ThrottlingType)
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_Throttling()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='throttling' namespace='##targetNamespace'"
	 * @generated
	 */
    ThrottlingType getThrottling();

    /**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getThrottling <em>Throttling</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throttling</em>' containment reference.
	 * @see #getThrottling()
	 * @generated
	 */
    void setThrottling(ThrottlingType value);

    /**
	 * Returns the value of the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' containment reference.
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_Transform()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transform' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformType getTransform();

	/**
	 * Returns the value of the '<em><b>Transforms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transforms</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transforms</em>' containment reference.
	 * @see #setTransforms(TransformsType)
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_Transforms()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transforms' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformsType getTransforms();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getTransforms <em>Transforms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transforms</em>' containment reference.
	 * @see #getTransforms()
	 * @generated
	 */
	void setTransforms(TransformsType value);

	/**
	 * Returns the value of the '<em><b>Validate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate</em>' containment reference.
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_Validate()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='validate' namespace='##targetNamespace'"
	 * @generated
	 */
	ValidateType getValidate();

	/**
	 * Returns the value of the '<em><b>Validates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validates</em>' containment reference.
	 * @see #setValidates(ValidatesType)
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_Validates()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='validates' namespace='##targetNamespace'"
	 * @generated
	 */
	ValidatesType getValidates();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getValidates <em>Validates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validates</em>' containment reference.
	 * @see #getValidates()
	 * @generated
	 */
	void setValidates(ValidatesType value);

    /**
	 * Returns the value of the '<em><b>Operation Selector Switchyard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation Selector Switchyard</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Selector Switchyard</em>' containment reference.
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_OperationSelectorSwitchyard()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='operationSelector.switchyard' namespace='##targetNamespace' affiliation='http://docs.oasis-open.org/ns/opencsa/sca/200912#operationSelector'"
	 * @generated
	 */
    SwitchYardOperationSelectorType getOperationSelectorSwitchyard();

    /**
	 * Returns the value of the '<em><b>Operation Selector Java</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation Selector Java</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Selector Java</em>' containment reference.
	 * @see #setOperationSelectorJava(JavaOperationSelectorType)
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_OperationSelectorJava()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='operationSelector.java' namespace='##targetNamespace' affiliation='operationSelector.switchyard'"
	 * @generated
	 */
    JavaOperationSelectorType getOperationSelectorJava();

    /**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getOperationSelectorJava <em>Operation Selector Java</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Selector Java</em>' containment reference.
	 * @see #getOperationSelectorJava()
	 * @generated
	 */
    void setOperationSelectorJava(JavaOperationSelectorType value);

    /**
	 * Returns the value of the '<em><b>Operation Selector Regex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation Selector Regex</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Selector Regex</em>' containment reference.
	 * @see #setOperationSelectorRegex(RegexOperationSelectorType)
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_OperationSelectorRegex()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='operationSelector.regex' namespace='##targetNamespace' affiliation='operationSelector.switchyard'"
	 * @generated
	 */
    RegexOperationSelectorType getOperationSelectorRegex();

    /**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getOperationSelectorRegex <em>Operation Selector Regex</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Selector Regex</em>' containment reference.
	 * @see #getOperationSelectorRegex()
	 * @generated
	 */
    void setOperationSelectorRegex(RegexOperationSelectorType value);

    /**
	 * Returns the value of the '<em><b>Operation Selector Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation Selector Xpath</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Selector Xpath</em>' containment reference.
	 * @see #setOperationSelectorXpath(XPathOperationSelectorType)
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_OperationSelectorXpath()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='operationSelector.xpath' namespace='##targetNamespace' affiliation='operationSelector.switchyard'"
	 * @generated
	 */
    XPathOperationSelectorType getOperationSelectorXpath();

    /**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getOperationSelectorXpath <em>Operation Selector Xpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Selector Xpath</em>' containment reference.
	 * @see #getOperationSelectorXpath()
	 * @generated
	 */
    void setOperationSelectorXpath(XPathOperationSelectorType value);

    /**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Security</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' containment reference.
	 * @see #setSecurity(SecurityType)
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_Security()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='security' namespace='##targetNamespace'"
	 * @generated
	 */
    SecurityType getSecurity();

                /**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getSecurity <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' containment reference.
	 * @see #getSecurity()
	 * @generated
	 */
    void setSecurity(SecurityType value);

                /**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_Target()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
    String getTarget();

                /**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
    void setTarget(String value);

                /**
	 * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Namespace</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Namespace</em>' attribute.
	 * @see #setTargetNamespace(String)
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_TargetNamespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='targetNamespace' namespace='##targetNamespace'"
	 * @generated
	 */
    String getTargetNamespace();

                /**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
    void setTargetNamespace(String value);

                /**
	 * Returns the value of the '<em><b>Clustered</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Clustered</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Clustered</em>' attribute.
	 * @see #isSetClustered()
	 * @see #unsetClustered()
	 * @see #setClustered(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_Clustered()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='clustered' namespace='##targetNamespace'"
	 * @generated
	 */
    boolean isClustered();

                /**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#isClustered <em>Clustered</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clustered</em>' attribute.
	 * @see #isSetClustered()
	 * @see #unsetClustered()
	 * @see #isClustered()
	 * @generated
	 */
    void setClustered(boolean value);

                /**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#isClustered <em>Clustered</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetClustered()
	 * @see #isClustered()
	 * @see #setClustered(boolean)
	 * @generated
	 */
    void unsetClustered();

                /**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#isClustered <em>Clustered</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Clustered</em>' attribute is set.
	 * @see #unsetClustered()
	 * @see #isClustered()
	 * @see #setClustered(boolean)
	 * @generated
	 */
    boolean isSetClustered();

                /**
	 * Returns the value of the '<em><b>Load Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Load Balance</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Balance</em>' attribute.
	 * @see #setLoadBalance(String)
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_LoadBalance()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='loadBalance' namespace='##targetNamespace'"
	 * @generated
	 */
    String getLoadBalance();

                /**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getLoadBalance <em>Load Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Balance</em>' attribute.
	 * @see #getLoadBalance()
	 * @generated
	 */
    void setLoadBalance(String value);

                /**
	 * Returns the value of the '<em><b>Prefer Local</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefer Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefer Local</em>' attribute.
	 * @see #isSetPreferLocal()
	 * @see #unsetPreferLocal()
	 * @see #setPreferLocal(boolean)
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_PreferLocal()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='preferLocal' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isPreferLocal();

																/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#isPreferLocal <em>Prefer Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefer Local</em>' attribute.
	 * @see #isSetPreferLocal()
	 * @see #unsetPreferLocal()
	 * @see #isPreferLocal()
	 * @generated
	 */
	void setPreferLocal(boolean value);

																/**
	 * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#isPreferLocal <em>Prefer Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreferLocal()
	 * @see #isPreferLocal()
	 * @see #setPreferLocal(boolean)
	 * @generated
	 */
	void unsetPreferLocal();

																/**
	 * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#isPreferLocal <em>Prefer Local</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prefer Local</em>' attribute is set.
	 * @see #unsetPreferLocal()
	 * @see #isPreferLocal()
	 * @see #setPreferLocal(boolean)
	 * @generated
	 */
	boolean isSetPreferLocal();

																/**
	 * Returns the value of the '<em><b>Security1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security1</em>' attribute.
	 * @see #setSecurity1(String)
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_Security1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='security' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSecurity1();

																/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getSecurity1 <em>Security1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security1</em>' attribute.
	 * @see #getSecurity1()
	 * @generated
	 */
	void setSecurity1(String value);

																/**
	 * Returns the value of the '<em><b>Securities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Securities</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Securities</em>' containment reference.
	 * @see #setSecurities(SecuritiesType)
	 * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage#getDocumentRoot_Securities()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='securities' namespace='##targetNamespace'"
	 * @generated
	 */
    SecuritiesType getSecurities();

                /**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot#getSecurities <em>Securities</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securities</em>' containment reference.
	 * @see #getSecurities()
	 * @generated
	 */
    void setSecurities(SecuritiesType value);

} // DocumentRoot
