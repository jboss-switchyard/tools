/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;

import java.util.List;

import javax.xml.namespace.QName;

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
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBindingEjb <em>Binding Ejb</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBindingJca <em>Binding Jca</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBindingJms <em>Binding Jms</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBindingSca <em>Binding Sca</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBindingWs <em>Binding Ws</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBindingType <em>Binding Type</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getCallback <em>Callback</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getComposite <em>Composite</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getConstrainingType <em>Constraining Type</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getContribution <em>Contribution</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getExport <em>Export</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getExportBase <em>Export Base</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getExportC <em>Export C</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getExportCpp <em>Export Cpp</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getExportJava <em>Export Java</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationBpel <em>Implementation Bpel</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationC <em>Implementation C</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationComposite <em>Implementation Composite</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationCpp <em>Implementation Cpp</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationEjb <em>Implementation Ejb</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationJava <em>Implementation Java</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationJee <em>Implementation Jee</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationSpring <em>Implementation Spring</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationWeb <em>Implementation Web</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationType <em>Implementation Type</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImport <em>Import</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImportBase <em>Import Base</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImportC <em>Import C</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImportCpp <em>Import Cpp</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImportJava <em>Import Java</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getInclude <em>Include</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getInterfaceC <em>Interface C</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getInterfaceCpp <em>Interface Cpp</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getInterfaceJava <em>Interface Java</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getInterfaceWsdl <em>Interface Wsdl</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getOperationSelector <em>Operation Selector</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getOperationSelectorJmsDefault <em>Operation Selector Jms Default</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getPolicySet <em>Policy Set</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getPolicySetAttachment <em>Policy Set Attachment</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getWireFormat <em>Wire Format</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getWireFormatJmsDefault <em>Wire Format Jms Default</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getWSCallback <em>WS Callback</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getCallback1 <em>Callback1</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getRequires <em>Requires</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot()
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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_Mixed()
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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_XMLNSPrefixMap()
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
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_XSISchemaLocation()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
     * @generated
     */
	EMap<String, String> getXSISchemaLocation();

	/**
     * Returns the value of the '<em><b>Binding</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Binding</em>' containment reference.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_Binding()
     * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding' namespace='##targetNamespace'"
     * @generated
     */
	Binding getBinding();

	/**
     * Returns the value of the '<em><b>Binding Ejb</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Ejb</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Ejb</em>' containment reference.
     * @see #setBindingEjb(EJBSessionBeanBinding)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_BindingEjb()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding.ejb' namespace='##targetNamespace' affiliation='binding'"
     * @generated
     */
	EJBSessionBeanBinding getBindingEjb();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBindingEjb <em>Binding Ejb</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding Ejb</em>' containment reference.
     * @see #getBindingEjb()
     * @generated
     */
	void setBindingEjb(EJBSessionBeanBinding value);

	/**
     * Returns the value of the '<em><b>Binding Jca</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Jca</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Jca</em>' containment reference.
     * @see #setBindingJca(JCABinding)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_BindingJca()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding.jca' namespace='##targetNamespace' affiliation='binding'"
     * @generated
     */
	JCABinding getBindingJca();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBindingJca <em>Binding Jca</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding Jca</em>' containment reference.
     * @see #getBindingJca()
     * @generated
     */
	void setBindingJca(JCABinding value);

	/**
     * Returns the value of the '<em><b>Binding Jms</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Jms</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Jms</em>' containment reference.
     * @see #setBindingJms(JMSBinding)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_BindingJms()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding.jms' namespace='##targetNamespace' affiliation='binding'"
     * @generated
     */
	JMSBinding getBindingJms();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBindingJms <em>Binding Jms</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding Jms</em>' containment reference.
     * @see #getBindingJms()
     * @generated
     */
	void setBindingJms(JMSBinding value);

	/**
     * Returns the value of the '<em><b>Binding Sca</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Sca</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Sca</em>' containment reference.
     * @see #setBindingSca(SCABinding)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_BindingSca()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding.sca' namespace='##targetNamespace' affiliation='binding'"
     * @generated
     */
	SCABinding getBindingSca();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBindingSca <em>Binding Sca</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding Sca</em>' containment reference.
     * @see #getBindingSca()
     * @generated
     */
	void setBindingSca(SCABinding value);

	/**
     * Returns the value of the '<em><b>Binding Ws</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Ws</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Ws</em>' containment reference.
     * @see #setBindingWs(WebServiceBinding)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_BindingWs()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding.ws' namespace='##targetNamespace' affiliation='binding'"
     * @generated
     */
	WebServiceBinding getBindingWs();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBindingWs <em>Binding Ws</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding Ws</em>' containment reference.
     * @see #getBindingWs()
     * @generated
     */
	void setBindingWs(WebServiceBinding value);

	/**
     * Returns the value of the '<em><b>Binding Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Type</em>' containment reference.
     * @see #setBindingType(BindingType)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_BindingType()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='bindingType' namespace='##targetNamespace'"
     * @generated
     */
	BindingType getBindingType();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBindingType <em>Binding Type</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding Type</em>' containment reference.
     * @see #getBindingType()
     * @generated
     */
	void setBindingType(BindingType value);

	/**
     * Returns the value of the '<em><b>Callback</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callback</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Callback</em>' containment reference.
     * @see #setCallback(Callback)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_Callback()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='callback' namespace='##targetNamespace'"
     * @generated
     */
	Callback getCallback();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getCallback <em>Callback</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Callback</em>' containment reference.
     * @see #getCallback()
     * @generated
     */
	void setCallback(Callback value);

	/**
     * Returns the value of the '<em><b>Component Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Component Type</em>' containment reference.
     * @see #setComponentType(ComponentType)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_ComponentType()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='componentType' namespace='##targetNamespace'"
     * @generated
     */
	ComponentType getComponentType();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getComponentType <em>Component Type</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Component Type</em>' containment reference.
     * @see #getComponentType()
     * @generated
     */
	void setComponentType(ComponentType value);

	/**
     * Returns the value of the '<em><b>Composite</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Composite</em>' containment reference.
     * @see #setComposite(Composite)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_Composite()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='composite' namespace='##targetNamespace'"
     * @generated
     */
	Composite getComposite();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getComposite <em>Composite</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Composite</em>' containment reference.
     * @see #getComposite()
     * @generated
     */
	void setComposite(Composite value);

	/**
     * Returns the value of the '<em><b>Constraining Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraining Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Constraining Type</em>' containment reference.
     * @see #setConstrainingType(ConstrainingType)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_ConstrainingType()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='constrainingType' namespace='##targetNamespace'"
     * @generated
     */
	ConstrainingType getConstrainingType();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getConstrainingType <em>Constraining Type</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Constraining Type</em>' containment reference.
     * @see #getConstrainingType()
     * @generated
     */
	void setConstrainingType(ConstrainingType value);

	/**
     * Returns the value of the '<em><b>Contribution</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contribution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Contribution</em>' containment reference.
     * @see #setContribution(ContributionType)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_Contribution()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='contribution' namespace='##targetNamespace'"
     * @generated
     */
	ContributionType getContribution();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getContribution <em>Contribution</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Contribution</em>' containment reference.
     * @see #getContribution()
     * @generated
     */
	void setContribution(ContributionType value);

	/**
     * Returns the value of the '<em><b>Definitions</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Definitions</em>' containment reference.
     * @see #setDefinitions(TDefinitions)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_Definitions()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='definitions' namespace='##targetNamespace'"
     * @generated
     */
	TDefinitions getDefinitions();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getDefinitions <em>Definitions</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Definitions</em>' containment reference.
     * @see #getDefinitions()
     * @generated
     */
	void setDefinitions(TDefinitions value);

	/**
     * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Documentation</em>' containment reference.
     * @see #setDocumentation(Documentation)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_Documentation()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
     * @generated
     */
	Documentation getDocumentation();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getDocumentation <em>Documentation</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Documentation</em>' containment reference.
     * @see #getDocumentation()
     * @generated
     */
	void setDocumentation(Documentation value);

	/**
     * Returns the value of the '<em><b>Export</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Export</em>' containment reference.
     * @see #setExport(ExportType)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_Export()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='export' namespace='##targetNamespace' affiliation='exportBase'"
     * @generated
     */
	ExportType getExport();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getExport <em>Export</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Export</em>' containment reference.
     * @see #getExport()
     * @generated
     */
	void setExport(ExportType value);

	/**
     * Returns the value of the '<em><b>Export Base</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export Base</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Export Base</em>' containment reference.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_ExportBase()
     * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='exportBase' namespace='##targetNamespace'"
     * @generated
     */
	Export getExportBase();

	/**
     * Returns the value of the '<em><b>Export C</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export C</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Export C</em>' containment reference.
     * @see #setExportC(CExport)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_ExportC()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='export.c' namespace='##targetNamespace' affiliation='exportBase'"
     * @generated
     */
	CExport getExportC();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getExportC <em>Export C</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Export C</em>' containment reference.
     * @see #getExportC()
     * @generated
     */
	void setExportC(CExport value);

	/**
     * Returns the value of the '<em><b>Export Cpp</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export Cpp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Export Cpp</em>' containment reference.
     * @see #setExportCpp(CPPExport)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_ExportCpp()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='export.cpp' namespace='##targetNamespace' affiliation='exportBase'"
     * @generated
     */
	CPPExport getExportCpp();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getExportCpp <em>Export Cpp</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Export Cpp</em>' containment reference.
     * @see #getExportCpp()
     * @generated
     */
	void setExportCpp(CPPExport value);

	/**
     * Returns the value of the '<em><b>Export Java</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export Java</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Export Java</em>' containment reference.
     * @see #setExportJava(JavaExportType)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_ExportJava()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='export.java' namespace='##targetNamespace' affiliation='exportBase'"
     * @generated
     */
	JavaExportType getExportJava();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getExportJava <em>Export Java</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Export Java</em>' containment reference.
     * @see #getExportJava()
     * @generated
     */
	void setExportJava(JavaExportType value);

	/**
     * Returns the value of the '<em><b>Implementation</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Implementation</em>' containment reference.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_Implementation()
     * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='implementation' namespace='##targetNamespace'"
     * @generated
     */
	Implementation getImplementation();

	/**
     * Returns the value of the '<em><b>Implementation Bpel</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Bpel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Implementation Bpel</em>' containment reference.
     * @see #setImplementationBpel(BPELImplementation)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_ImplementationBpel()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='implementation.bpel' namespace='##targetNamespace' affiliation='implementation'"
     * @generated
     */
	BPELImplementation getImplementationBpel();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationBpel <em>Implementation Bpel</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Implementation Bpel</em>' containment reference.
     * @see #getImplementationBpel()
     * @generated
     */
	void setImplementationBpel(BPELImplementation value);

	/**
     * Returns the value of the '<em><b>Implementation C</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation C</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Implementation C</em>' containment reference.
     * @see #setImplementationC(CImplementation)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_ImplementationC()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='implementation.c' namespace='##targetNamespace' affiliation='implementation'"
     * @generated
     */
	CImplementation getImplementationC();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationC <em>Implementation C</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Implementation C</em>' containment reference.
     * @see #getImplementationC()
     * @generated
     */
	void setImplementationC(CImplementation value);

	/**
     * Returns the value of the '<em><b>Implementation Composite</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Composite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Implementation Composite</em>' containment reference.
     * @see #setImplementationComposite(SCAImplementation)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_ImplementationComposite()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='implementation.composite' namespace='##targetNamespace' affiliation='implementation'"
     * @generated
     */
	SCAImplementation getImplementationComposite();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationComposite <em>Implementation Composite</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Implementation Composite</em>' containment reference.
     * @see #getImplementationComposite()
     * @generated
     */
	void setImplementationComposite(SCAImplementation value);

	/**
     * Returns the value of the '<em><b>Implementation Cpp</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Cpp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Implementation Cpp</em>' containment reference.
     * @see #setImplementationCpp(CPPImplementation)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_ImplementationCpp()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='implementation.cpp' namespace='##targetNamespace' affiliation='implementation'"
     * @generated
     */
	CPPImplementation getImplementationCpp();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationCpp <em>Implementation Cpp</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Implementation Cpp</em>' containment reference.
     * @see #getImplementationCpp()
     * @generated
     */
	void setImplementationCpp(CPPImplementation value);

	/**
     * Returns the value of the '<em><b>Implementation Ejb</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Ejb</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Implementation Ejb</em>' containment reference.
     * @see #setImplementationEjb(EJBImplementation)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_ImplementationEjb()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='implementation.ejb' namespace='##targetNamespace' affiliation='implementation'"
     * @generated
     */
	EJBImplementation getImplementationEjb();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationEjb <em>Implementation Ejb</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Implementation Ejb</em>' containment reference.
     * @see #getImplementationEjb()
     * @generated
     */
	void setImplementationEjb(EJBImplementation value);

	/**
     * Returns the value of the '<em><b>Implementation Java</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Java</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Implementation Java</em>' containment reference.
     * @see #setImplementationJava(JavaImplementation)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_ImplementationJava()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='implementation.java' namespace='##targetNamespace' affiliation='implementation'"
     * @generated
     */
	JavaImplementation getImplementationJava();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationJava <em>Implementation Java</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Implementation Java</em>' containment reference.
     * @see #getImplementationJava()
     * @generated
     */
	void setImplementationJava(JavaImplementation value);

	/**
     * Returns the value of the '<em><b>Implementation Jee</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Jee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Implementation Jee</em>' containment reference.
     * @see #setImplementationJee(JEEImplementation)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_ImplementationJee()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='implementation.jee' namespace='##targetNamespace' affiliation='implementation'"
     * @generated
     */
	JEEImplementation getImplementationJee();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationJee <em>Implementation Jee</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Implementation Jee</em>' containment reference.
     * @see #getImplementationJee()
     * @generated
     */
	void setImplementationJee(JEEImplementation value);

	/**
     * Returns the value of the '<em><b>Implementation Spring</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Spring</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Implementation Spring</em>' containment reference.
     * @see #setImplementationSpring(SpringImplementation)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_ImplementationSpring()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='implementation.spring' namespace='##targetNamespace' affiliation='implementation'"
     * @generated
     */
	SpringImplementation getImplementationSpring();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationSpring <em>Implementation Spring</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Implementation Spring</em>' containment reference.
     * @see #getImplementationSpring()
     * @generated
     */
	void setImplementationSpring(SpringImplementation value);

	/**
     * Returns the value of the '<em><b>Implementation Web</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Web</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Implementation Web</em>' containment reference.
     * @see #setImplementationWeb(WebImplementation)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_ImplementationWeb()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='implementation.web' namespace='##targetNamespace' affiliation='implementation'"
     * @generated
     */
	WebImplementation getImplementationWeb();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationWeb <em>Implementation Web</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Implementation Web</em>' containment reference.
     * @see #getImplementationWeb()
     * @generated
     */
	void setImplementationWeb(WebImplementation value);

	/**
     * Returns the value of the '<em><b>Implementation Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Implementation Type</em>' containment reference.
     * @see #setImplementationType(ImplementationType)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_ImplementationType()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='implementationType' namespace='##targetNamespace'"
     * @generated
     */
	ImplementationType getImplementationType();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationType <em>Implementation Type</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Implementation Type</em>' containment reference.
     * @see #getImplementationType()
     * @generated
     */
	void setImplementationType(ImplementationType value);

	/**
     * Returns the value of the '<em><b>Import</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Import</em>' containment reference.
     * @see #setImport(ImportType)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_Import()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='import' namespace='##targetNamespace' affiliation='importBase'"
     * @generated
     */
	ImportType getImport();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImport <em>Import</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Import</em>' containment reference.
     * @see #getImport()
     * @generated
     */
	void setImport(ImportType value);

	/**
     * Returns the value of the '<em><b>Import Base</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Base</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Import Base</em>' containment reference.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_ImportBase()
     * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='importBase' namespace='##targetNamespace'"
     * @generated
     */
	Import getImportBase();

	/**
     * Returns the value of the '<em><b>Import C</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import C</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Import C</em>' containment reference.
     * @see #setImportC(CImport)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_ImportC()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='import.c' namespace='##targetNamespace' affiliation='importBase'"
     * @generated
     */
	CImport getImportC();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImportC <em>Import C</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Import C</em>' containment reference.
     * @see #getImportC()
     * @generated
     */
	void setImportC(CImport value);

	/**
     * Returns the value of the '<em><b>Import Cpp</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Cpp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Import Cpp</em>' containment reference.
     * @see #setImportCpp(CPPImport)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_ImportCpp()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='import.cpp' namespace='##targetNamespace' affiliation='importBase'"
     * @generated
     */
	CPPImport getImportCpp();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImportCpp <em>Import Cpp</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Import Cpp</em>' containment reference.
     * @see #getImportCpp()
     * @generated
     */
	void setImportCpp(CPPImport value);

	/**
     * Returns the value of the '<em><b>Import Java</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Java</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Import Java</em>' containment reference.
     * @see #setImportJava(JavaImportType)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_ImportJava()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='import.java' namespace='##targetNamespace' affiliation='importBase'"
     * @generated
     */
	JavaImportType getImportJava();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImportJava <em>Import Java</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Import Java</em>' containment reference.
     * @see #getImportJava()
     * @generated
     */
	void setImportJava(JavaImportType value);

	/**
     * Returns the value of the '<em><b>Include</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Include</em>' containment reference.
     * @see #setInclude(Include)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_Include()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='include' namespace='##targetNamespace'"
     * @generated
     */
	Include getInclude();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getInclude <em>Include</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Include</em>' containment reference.
     * @see #getInclude()
     * @generated
     */
	void setInclude(Include value);

	/**
     * Returns the value of the '<em><b>Intent</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Intent</em>' containment reference.
     * @see #setIntent(Intent)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_Intent()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='intent' namespace='##targetNamespace'"
     * @generated
     */
	Intent getIntent();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getIntent <em>Intent</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Intent</em>' containment reference.
     * @see #getIntent()
     * @generated
     */
	void setIntent(Intent value);

	/**
     * Returns the value of the '<em><b>Interface</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Interface</em>' containment reference.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_Interface()
     * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='interface' namespace='##targetNamespace'"
     * @generated
     */
	Interface getInterface();

	/**
     * Returns the value of the '<em><b>Interface C</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface C</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Interface C</em>' containment reference.
     * @see #setInterfaceC(CInterface)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_InterfaceC()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='interface.c' namespace='##targetNamespace' affiliation='interface'"
     * @generated
     */
	CInterface getInterfaceC();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getInterfaceC <em>Interface C</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interface C</em>' containment reference.
     * @see #getInterfaceC()
     * @generated
     */
	void setInterfaceC(CInterface value);

	/**
     * Returns the value of the '<em><b>Interface Cpp</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Cpp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Interface Cpp</em>' containment reference.
     * @see #setInterfaceCpp(CPPInterface)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_InterfaceCpp()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='interface.cpp' namespace='##targetNamespace' affiliation='interface'"
     * @generated
     */
	CPPInterface getInterfaceCpp();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getInterfaceCpp <em>Interface Cpp</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interface Cpp</em>' containment reference.
     * @see #getInterfaceCpp()
     * @generated
     */
	void setInterfaceCpp(CPPInterface value);

	/**
     * Returns the value of the '<em><b>Interface Java</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Java</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Interface Java</em>' containment reference.
     * @see #setInterfaceJava(JavaInterface)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_InterfaceJava()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='interface.java' namespace='##targetNamespace' affiliation='interface'"
     * @generated
     */
	JavaInterface getInterfaceJava();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getInterfaceJava <em>Interface Java</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interface Java</em>' containment reference.
     * @see #getInterfaceJava()
     * @generated
     */
	void setInterfaceJava(JavaInterface value);

	/**
     * Returns the value of the '<em><b>Interface Wsdl</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Wsdl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Interface Wsdl</em>' containment reference.
     * @see #setInterfaceWsdl(WSDLPortType)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_InterfaceWsdl()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='interface.wsdl' namespace='##targetNamespace' affiliation='interface'"
     * @generated
     */
	WSDLPortType getInterfaceWsdl();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getInterfaceWsdl <em>Interface Wsdl</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interface Wsdl</em>' containment reference.
     * @see #getInterfaceWsdl()
     * @generated
     */
	void setInterfaceWsdl(WSDLPortType value);

	/**
     * Returns the value of the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Selector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Operation Selector</em>' containment reference.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_OperationSelector()
     * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='operationSelector' namespace='##targetNamespace'"
     * @generated
     */
	OperationSelectorType getOperationSelector();

	/**
     * Returns the value of the '<em><b>Operation Selector Jms Default</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Selector Jms Default</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Operation Selector Jms Default</em>' containment reference.
     * @see #setOperationSelectorJmsDefault(OperationSelectorType)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_OperationSelectorJmsDefault()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='operationSelector.jmsDefault' namespace='##targetNamespace' affiliation='operationSelector'"
     * @generated
     */
	OperationSelectorType getOperationSelectorJmsDefault();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getOperationSelectorJmsDefault <em>Operation Selector Jms Default</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation Selector Jms Default</em>' containment reference.
     * @see #getOperationSelectorJmsDefault()
     * @generated
     */
	void setOperationSelectorJmsDefault(OperationSelectorType value);

	/**
     * Returns the value of the '<em><b>Policy Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Policy Set</em>' containment reference.
     * @see #setPolicySet(PolicySet)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_PolicySet()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='policySet' namespace='##targetNamespace'"
     * @generated
     */
	PolicySet getPolicySet();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getPolicySet <em>Policy Set</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Policy Set</em>' containment reference.
     * @see #getPolicySet()
     * @generated
     */
	void setPolicySet(PolicySet value);

	/**
     * Returns the value of the '<em><b>Policy Set Attachment</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Set Attachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Policy Set Attachment</em>' containment reference.
     * @see #setPolicySetAttachment(PolicySetAttachment)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_PolicySetAttachment()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='policySetAttachment' namespace='##targetNamespace'"
     * @generated
     */
	PolicySetAttachment getPolicySetAttachment();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getPolicySetAttachment <em>Policy Set Attachment</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Policy Set Attachment</em>' containment reference.
     * @see #getPolicySetAttachment()
     * @generated
     */
	void setPolicySetAttachment(PolicySetAttachment value);

	/**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(ValueType)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_Value()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
     * @generated
     */
	ValueType getValue();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
	void setValue(ValueType value);

	/**
     * Returns the value of the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire Format</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Wire Format</em>' containment reference.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_WireFormat()
     * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='wireFormat' namespace='##targetNamespace'"
     * @generated
     */
	WireFormatType getWireFormat();

	/**
     * Returns the value of the '<em><b>Wire Format Jms Default</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire Format Jms Default</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Wire Format Jms Default</em>' containment reference.
     * @see #setWireFormatJmsDefault(WireFormatType)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_WireFormatJmsDefault()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='wireFormat.jmsDefault' namespace='##targetNamespace' affiliation='wireFormat'"
     * @generated
     */
	WireFormatType getWireFormatJmsDefault();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getWireFormatJmsDefault <em>Wire Format Jms Default</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wire Format Jms Default</em>' containment reference.
     * @see #getWireFormatJmsDefault()
     * @generated
     */
	void setWireFormatJmsDefault(WireFormatType value);

	/**
     * Returns the value of the '<em><b>WS Callback</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>WS Callback</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>WS Callback</em>' containment reference.
     * @see #setWSCallback(WSCallbackType)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_WSCallback()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='WSCallback' namespace='##targetNamespace'"
     * @generated
     */
	WSCallbackType getWSCallback();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getWSCallback <em>WS Callback</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>WS Callback</em>' containment reference.
     * @see #getWSCallback()
     * @generated
     */
	void setWSCallback(WSCallbackType value);

	/**
     * Returns the value of the '<em><b>Callback1</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callback1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Callback1</em>' attribute.
     * @see #setCallback1(String)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_Callback1()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='callback' namespace='##targetNamespace'"
     * @generated
     */
	String getCallback1();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getCallback1 <em>Callback1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Callback1</em>' attribute.
     * @see #getCallback1()
     * @generated
     */
	void setCallback1(String value);

	/**
     * Returns the value of the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Requires</em>' attribute.
     * @see #setRequires(List)
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage#getDocumentRoot_Requires()
     * @model dataType="org.eclipse.soa.sca.sca1_1.model.sca.ListOfQNames" many="false"
     *        extendedMetaData="kind='attribute' name='requires' namespace='##targetNamespace'"
     * @generated
     */
	List<QName> getRequires();

	/**
     * Sets the value of the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getRequires <em>Requires</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Requires</em>' attribute.
     * @see #getRequires()
     * @generated
     */
	void setRequires(List<QName> value);

} // DocumentRoot
