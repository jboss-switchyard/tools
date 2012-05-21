/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;

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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getAop <em>Aop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getBatchResequencerConfig <em>Batch Resequencer Config</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getBean <em>Bean</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getBeanPostProcessor <em>Bean Post Processor</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getBindy <em>Bindy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getCamelContext <em>Camel Context</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getCastor <em>Castor</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getConsumerTemplate <em>Consumer Template</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getContextScan <em>Context Scan</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getCrypto <em>Crypto</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getCsv <em>Csv</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getCustomDataFormat <em>Custom Data Format</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getCustomLoadBalancer <em>Custom Load Balancer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getDataFormats <em>Data Formats</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getEl <em>El</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getErrorHandler <em>Error Handler</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getExport <em>Export</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getExpressionDefinition <em>Expression Definition</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getFailover <em>Failover</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getFlatpack <em>Flatpack</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getFrom <em>From</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getGroovy <em>Groovy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getGzip <em>Gzip</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getHeader <em>Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getHl7 <em>Hl7</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getInOnly <em>In Only</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getInOut <em>In Out</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getInterceptToEndpoint <em>Intercept To Endpoint</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getJavaScript <em>Java Script</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getJaxb <em>Jaxb</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getJibx <em>Jibx</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getJmxAgent <em>Jmx Agent</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getJson <em>Json</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getJxpath <em>Jxpath</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getKeyStoreParameters <em>Key Store Parameters</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getLog <em>Log</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getMethod <em>Method</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getMvel <em>Mvel</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getOgnl <em>Ognl</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getPackageScan <em>Package Scan</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getPgp <em>Pgp</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getPhp <em>Php</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getProcess <em>Process</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getProperty <em>Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getPropertyPlaceholder <em>Property Placeholder</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getProtobuf <em>Protobuf</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getProxy <em>Proxy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getPython <em>Python</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRandom <em>Random</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRedeliveryPolicy <em>Redelivery Policy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRedeliveryPolicyProfile <em>Redelivery Policy Profile</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRef <em>Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRoundRobin <em>Round Robin</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRoute <em>Route</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRouteBuilder <em>Route Builder</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRouteContext <em>Route Context</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRouteContextRef <em>Route Context Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRoutes <em>Routes</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRss <em>Rss</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRuby <em>Ruby</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSample <em>Sample</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSecureRandomParameters <em>Secure Random Parameters</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSecureXML <em>Secure XML</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSerialization <em>Serialization</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSetFaultBody <em>Set Fault Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSetOutHeader <em>Set Out Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSoapjaxb <em>Soapjaxb</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSort <em>Sort</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSpel <em>Spel</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSplit <em>Split</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSql <em>Sql</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSslContextParameters <em>Ssl Context Parameters</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSticky <em>Sticky</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getStop <em>Stop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getStreamResequencerConfig <em>Stream Resequencer Config</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getString <em>String</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSyslog <em>Syslog</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getThreadPool <em>Thread Pool</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getThreadPoolProfile <em>Thread Pool Profile</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getTidyMarkup <em>Tidy Markup</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getTo <em>To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getTokenize <em>Tokenize</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getWeighted <em>Weighted</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getWhen <em>When</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getXmlBeans <em>Xml Beans</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getXquery <em>Xquery</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getXstream <em>Xstream</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getZip <em>Zip</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot()
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Mixed()
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_XMLNSPrefixMap()
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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_XSISchemaLocation()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
     * @generated
     */
	EMap<String, String> getXSISchemaLocation();

	/**
     * Returns the value of the '<em><b>Aggregate</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Aggregate</em>' containment reference.
     * @see #setAggregate(AggregateDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Aggregate()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='aggregate' namespace='##targetNamespace'"
     * @generated
     */
	AggregateDefinition getAggregate();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getAggregate <em>Aggregate</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Aggregate</em>' containment reference.
     * @see #getAggregate()
     * @generated
     */
	void setAggregate(AggregateDefinition value);

	/**
     * Returns the value of the '<em><b>Aop</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aop</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Aop</em>' containment reference.
     * @see #setAop(AopDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Aop()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='aop' namespace='##targetNamespace'"
     * @generated
     */
	AopDefinition getAop();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getAop <em>Aop</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Aop</em>' containment reference.
     * @see #getAop()
     * @generated
     */
	void setAop(AopDefinition value);

	/**
     * Returns the value of the '<em><b>Batch Resequencer Config</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Batch Resequencer Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Batch Resequencer Config</em>' containment reference.
     * @see #setBatchResequencerConfig(BatchResequencerConfig)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_BatchResequencerConfig()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='batchResequencerConfig' namespace='##targetNamespace'"
     * @generated
     */
	BatchResequencerConfig getBatchResequencerConfig();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getBatchResequencerConfig <em>Batch Resequencer Config</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Batch Resequencer Config</em>' containment reference.
     * @see #getBatchResequencerConfig()
     * @generated
     */
	void setBatchResequencerConfig(BatchResequencerConfig value);

	/**
     * Returns the value of the '<em><b>Bean</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bean</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Bean</em>' containment reference.
     * @see #setBean(BeanDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Bean()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='bean' namespace='##targetNamespace'"
     * @generated
     */
	BeanDefinition getBean();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getBean <em>Bean</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bean</em>' containment reference.
     * @see #getBean()
     * @generated
     */
	void setBean(BeanDefinition value);

	/**
     * Returns the value of the '<em><b>Bean Post Processor</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bean Post Processor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Bean Post Processor</em>' containment reference.
     * @see #setBeanPostProcessor(CamelBeanPostProcessor)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_BeanPostProcessor()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='beanPostProcessor' namespace='##targetNamespace'"
     * @generated
     */
	CamelBeanPostProcessor getBeanPostProcessor();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getBeanPostProcessor <em>Bean Post Processor</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bean Post Processor</em>' containment reference.
     * @see #getBeanPostProcessor()
     * @generated
     */
	void setBeanPostProcessor(CamelBeanPostProcessor value);

	/**
     * Returns the value of the '<em><b>Bindy</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Bindy</em>' containment reference.
     * @see #setBindy(BindyDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Bindy()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='bindy' namespace='##targetNamespace'"
     * @generated
     */
	BindyDataFormat getBindy();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getBindy <em>Bindy</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bindy</em>' containment reference.
     * @see #getBindy()
     * @generated
     */
	void setBindy(BindyDataFormat value);

	/**
     * Returns the value of the '<em><b>Camel Context</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Camel Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Camel Context</em>' containment reference.
     * @see #setCamelContext(CamelContextFactoryBean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_CamelContext()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='camelContext' namespace='##targetNamespace'"
     * @generated
     */
	CamelContextFactoryBean getCamelContext();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getCamelContext <em>Camel Context</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Camel Context</em>' containment reference.
     * @see #getCamelContext()
     * @generated
     */
	void setCamelContext(CamelContextFactoryBean value);

	/**
     * Returns the value of the '<em><b>Castor</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Castor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Castor</em>' containment reference.
     * @see #setCastor(CastorDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Castor()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='castor' namespace='##targetNamespace'"
     * @generated
     */
	CastorDataFormat getCastor();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getCastor <em>Castor</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Castor</em>' containment reference.
     * @see #getCastor()
     * @generated
     */
	void setCastor(CastorDataFormat value);

	/**
     * Returns the value of the '<em><b>Choice</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choice</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Choice</em>' containment reference.
     * @see #setChoice(ChoiceDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Choice()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='choice' namespace='##targetNamespace'"
     * @generated
     */
	ChoiceDefinition getChoice();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getChoice <em>Choice</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Choice</em>' containment reference.
     * @see #getChoice()
     * @generated
     */
	void setChoice(ChoiceDefinition value);

	/**
     * Returns the value of the '<em><b>Constant</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Constant</em>' containment reference.
     * @see #setConstant(ConstantExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Constant()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='constant' namespace='##targetNamespace'"
     * @generated
     */
	ConstantExpression getConstant();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getConstant <em>Constant</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Constant</em>' containment reference.
     * @see #getConstant()
     * @generated
     */
	void setConstant(ConstantExpression value);

	/**
     * Returns the value of the '<em><b>Consumer Template</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumer Template</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Consumer Template</em>' containment reference.
     * @see #setConsumerTemplate(CamelConsumerTemplateFactoryBean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_ConsumerTemplate()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='consumerTemplate' namespace='##targetNamespace'"
     * @generated
     */
	CamelConsumerTemplateFactoryBean getConsumerTemplate();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getConsumerTemplate <em>Consumer Template</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Consumer Template</em>' containment reference.
     * @see #getConsumerTemplate()
     * @generated
     */
	void setConsumerTemplate(CamelConsumerTemplateFactoryBean value);

	/**
     * Returns the value of the '<em><b>Context Scan</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Scan</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Context Scan</em>' containment reference.
     * @see #setContextScan(ContextScanDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_ContextScan()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='contextScan' namespace='##targetNamespace'"
     * @generated
     */
	ContextScanDefinition getContextScan();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getContextScan <em>Context Scan</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Scan</em>' containment reference.
     * @see #getContextScan()
     * @generated
     */
	void setContextScan(ContextScanDefinition value);

	/**
     * Returns the value of the '<em><b>Convert Body To</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Convert Body To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Convert Body To</em>' containment reference.
     * @see #setConvertBodyTo(ConvertBodyDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_ConvertBodyTo()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='convertBodyTo' namespace='##targetNamespace'"
     * @generated
     */
	ConvertBodyDefinition getConvertBodyTo();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getConvertBodyTo <em>Convert Body To</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Convert Body To</em>' containment reference.
     * @see #getConvertBodyTo()
     * @generated
     */
	void setConvertBodyTo(ConvertBodyDefinition value);

	/**
     * Returns the value of the '<em><b>Crypto</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crypto</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Crypto</em>' containment reference.
     * @see #setCrypto(CryptoDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Crypto()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='crypto' namespace='##targetNamespace'"
     * @generated
     */
	CryptoDataFormat getCrypto();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getCrypto <em>Crypto</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Crypto</em>' containment reference.
     * @see #getCrypto()
     * @generated
     */
	void setCrypto(CryptoDataFormat value);

	/**
     * Returns the value of the '<em><b>Csv</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csv</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Csv</em>' containment reference.
     * @see #setCsv(CsvDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Csv()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='csv' namespace='##targetNamespace'"
     * @generated
     */
	CsvDataFormat getCsv();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getCsv <em>Csv</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Csv</em>' containment reference.
     * @see #getCsv()
     * @generated
     */
	void setCsv(CsvDataFormat value);

	/**
     * Returns the value of the '<em><b>Custom Data Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Data Format</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Custom Data Format</em>' containment reference.
     * @see #setCustomDataFormat(CustomDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_CustomDataFormat()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='customDataFormat' namespace='##targetNamespace'"
     * @generated
     */
	CustomDataFormat getCustomDataFormat();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getCustomDataFormat <em>Custom Data Format</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Custom Data Format</em>' containment reference.
     * @see #getCustomDataFormat()
     * @generated
     */
	void setCustomDataFormat(CustomDataFormat value);

	/**
     * Returns the value of the '<em><b>Custom Load Balancer</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Load Balancer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Custom Load Balancer</em>' containment reference.
     * @see #setCustomLoadBalancer(CustomLoadBalancerDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_CustomLoadBalancer()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='customLoadBalancer' namespace='##targetNamespace'"
     * @generated
     */
	CustomLoadBalancerDefinition getCustomLoadBalancer();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getCustomLoadBalancer <em>Custom Load Balancer</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Custom Load Balancer</em>' containment reference.
     * @see #getCustomLoadBalancer()
     * @generated
     */
	void setCustomLoadBalancer(CustomLoadBalancerDefinition value);

	/**
     * Returns the value of the '<em><b>Data Formats</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Formats</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Data Formats</em>' containment reference.
     * @see #setDataFormats(DataFormatsDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_DataFormats()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='dataFormats' namespace='##targetNamespace'"
     * @generated
     */
	DataFormatsDefinition getDataFormats();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getDataFormats <em>Data Formats</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Formats</em>' containment reference.
     * @see #getDataFormats()
     * @generated
     */
	void setDataFormats(DataFormatsDefinition value);

	/**
     * Returns the value of the '<em><b>Delay</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Delay</em>' containment reference.
     * @see #setDelay(DelayDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Delay()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='delay' namespace='##targetNamespace'"
     * @generated
     */
	DelayDefinition getDelay();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getDelay <em>Delay</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delay</em>' containment reference.
     * @see #getDelay()
     * @generated
     */
	void setDelay(DelayDefinition value);

	/**
     * Returns the value of the '<em><b>Description</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' containment reference.
     * @see #setDescription(DescriptionDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Description()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
     * @generated
     */
	DescriptionDefinition getDescription();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getDescription <em>Description</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' containment reference.
     * @see #getDescription()
     * @generated
     */
	void setDescription(DescriptionDefinition value);

	/**
     * Returns the value of the '<em><b>Do Catch</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Catch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Do Catch</em>' containment reference.
     * @see #setDoCatch(CatchDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_DoCatch()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='doCatch' namespace='##targetNamespace'"
     * @generated
     */
	CatchDefinition getDoCatch();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getDoCatch <em>Do Catch</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Do Catch</em>' containment reference.
     * @see #getDoCatch()
     * @generated
     */
	void setDoCatch(CatchDefinition value);

	/**
     * Returns the value of the '<em><b>Do Finally</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Finally</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Do Finally</em>' containment reference.
     * @see #setDoFinally(FinallyDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_DoFinally()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='doFinally' namespace='##targetNamespace'"
     * @generated
     */
	FinallyDefinition getDoFinally();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getDoFinally <em>Do Finally</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Do Finally</em>' containment reference.
     * @see #getDoFinally()
     * @generated
     */
	void setDoFinally(FinallyDefinition value);

	/**
     * Returns the value of the '<em><b>Do Try</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Try</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Do Try</em>' containment reference.
     * @see #setDoTry(TryDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_DoTry()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='doTry' namespace='##targetNamespace'"
     * @generated
     */
	TryDefinition getDoTry();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getDoTry <em>Do Try</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Do Try</em>' containment reference.
     * @see #getDoTry()
     * @generated
     */
	void setDoTry(TryDefinition value);

	/**
     * Returns the value of the '<em><b>Dynamic Router</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Dynamic Router</em>' containment reference.
     * @see #setDynamicRouter(DynamicRouterDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_DynamicRouter()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='dynamicRouter' namespace='##targetNamespace'"
     * @generated
     */
	DynamicRouterDefinition getDynamicRouter();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getDynamicRouter <em>Dynamic Router</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dynamic Router</em>' containment reference.
     * @see #getDynamicRouter()
     * @generated
     */
	void setDynamicRouter(DynamicRouterDefinition value);

	/**
     * Returns the value of the '<em><b>El</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>El</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>El</em>' containment reference.
     * @see #setEl(ElExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_El()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='el' namespace='##targetNamespace'"
     * @generated
     */
	ElExpression getEl();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getEl <em>El</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>El</em>' containment reference.
     * @see #getEl()
     * @generated
     */
	void setEl(ElExpression value);

	/**
     * Returns the value of the '<em><b>Endpoint</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Endpoint</em>' containment reference.
     * @see #setEndpoint(CamelEndpointFactoryBean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Endpoint()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='endpoint' namespace='##targetNamespace'"
     * @generated
     */
	CamelEndpointFactoryBean getEndpoint();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getEndpoint <em>Endpoint</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Endpoint</em>' containment reference.
     * @see #getEndpoint()
     * @generated
     */
	void setEndpoint(CamelEndpointFactoryBean value);

	/**
     * Returns the value of the '<em><b>Enrich</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enrich</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Enrich</em>' containment reference.
     * @see #setEnrich(EnrichDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Enrich()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='enrich' namespace='##targetNamespace'"
     * @generated
     */
	EnrichDefinition getEnrich();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getEnrich <em>Enrich</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enrich</em>' containment reference.
     * @see #getEnrich()
     * @generated
     */
	void setEnrich(EnrichDefinition value);

	/**
     * Returns the value of the '<em><b>Error Handler</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Handler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Error Handler</em>' containment reference.
     * @see #setErrorHandler(ErrorHandlerDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_ErrorHandler()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='errorHandler' namespace='##targetNamespace'"
     * @generated
     */
	ErrorHandlerDefinition getErrorHandler();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getErrorHandler <em>Error Handler</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Error Handler</em>' containment reference.
     * @see #getErrorHandler()
     * @generated
     */
	void setErrorHandler(ErrorHandlerDefinition value);

	/**
     * Returns the value of the '<em><b>Export</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Export</em>' containment reference.
     * @see #setExport(CamelServiceExporterDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Export()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='export' namespace='##targetNamespace'"
     * @generated
     */
	CamelServiceExporterDefinition getExport();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getExport <em>Export</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Export</em>' containment reference.
     * @see #getExport()
     * @generated
     */
	void setExport(CamelServiceExporterDefinition value);

	/**
     * Returns the value of the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' containment reference.
     * @see #setExpression(ExpressionSubElementDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Expression()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace'"
     * @generated
     */
	ExpressionSubElementDefinition getExpression();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getExpression <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' containment reference.
     * @see #getExpression()
     * @generated
     */
	void setExpression(ExpressionSubElementDefinition value);

	/**
     * Returns the value of the '<em><b>Expression Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Expression Definition</em>' containment reference.
     * @see #setExpressionDefinition(Expression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_ExpressionDefinition()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='expressionDefinition' namespace='##targetNamespace'"
     * @generated
     */
	Expression getExpressionDefinition();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getExpressionDefinition <em>Expression Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression Definition</em>' containment reference.
     * @see #getExpressionDefinition()
     * @generated
     */
	void setExpressionDefinition(Expression value);

	/**
     * Returns the value of the '<em><b>Failover</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failover</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Failover</em>' containment reference.
     * @see #setFailover(FailoverLoadBalancerDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Failover()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='failover' namespace='##targetNamespace'"
     * @generated
     */
	FailoverLoadBalancerDefinition getFailover();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getFailover <em>Failover</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Failover</em>' containment reference.
     * @see #getFailover()
     * @generated
     */
	void setFailover(FailoverLoadBalancerDefinition value);

	/**
     * Returns the value of the '<em><b>Filter</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Filter</em>' containment reference.
     * @see #setFilter(FilterDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Filter()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
     * @generated
     */
	FilterDefinition getFilter();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getFilter <em>Filter</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Filter</em>' containment reference.
     * @see #getFilter()
     * @generated
     */
	void setFilter(FilterDefinition value);

	/**
     * Returns the value of the '<em><b>Flatpack</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flatpack</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Flatpack</em>' containment reference.
     * @see #setFlatpack(FlatpackDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Flatpack()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='flatpack' namespace='##targetNamespace'"
     * @generated
     */
	FlatpackDataFormat getFlatpack();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getFlatpack <em>Flatpack</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flatpack</em>' containment reference.
     * @see #getFlatpack()
     * @generated
     */
	void setFlatpack(FlatpackDataFormat value);

	/**
     * Returns the value of the '<em><b>From</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' containment reference.
     * @see #setFrom(FromDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_From()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='from' namespace='##targetNamespace'"
     * @generated
     */
	FromDefinition getFrom();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getFrom <em>From</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' containment reference.
     * @see #getFrom()
     * @generated
     */
	void setFrom(FromDefinition value);

	/**
     * Returns the value of the '<em><b>Groovy</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groovy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Groovy</em>' containment reference.
     * @see #setGroovy(GroovyExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Groovy()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='groovy' namespace='##targetNamespace'"
     * @generated
     */
	GroovyExpression getGroovy();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getGroovy <em>Groovy</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Groovy</em>' containment reference.
     * @see #getGroovy()
     * @generated
     */
	void setGroovy(GroovyExpression value);

	/**
     * Returns the value of the '<em><b>Gzip</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gzip</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Gzip</em>' containment reference.
     * @see #setGzip(GzipDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Gzip()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='gzip' namespace='##targetNamespace'"
     * @generated
     */
	GzipDataFormat getGzip();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getGzip <em>Gzip</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gzip</em>' containment reference.
     * @see #getGzip()
     * @generated
     */
	void setGzip(GzipDataFormat value);

	/**
     * Returns the value of the '<em><b>Header</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Header</em>' containment reference.
     * @see #setHeader(HeaderExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Header()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='header' namespace='##targetNamespace'"
     * @generated
     */
	HeaderExpression getHeader();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getHeader <em>Header</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Header</em>' containment reference.
     * @see #getHeader()
     * @generated
     */
	void setHeader(HeaderExpression value);

	/**
     * Returns the value of the '<em><b>Hl7</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hl7</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Hl7</em>' containment reference.
     * @see #setHl7(Hl7DataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Hl7()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='hl7' namespace='##targetNamespace'"
     * @generated
     */
	Hl7DataFormat getHl7();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getHl7 <em>Hl7</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hl7</em>' containment reference.
     * @see #getHl7()
     * @generated
     */
	void setHl7(Hl7DataFormat value);

	/**
     * Returns the value of the '<em><b>Idempotent Consumer</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idempotent Consumer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Idempotent Consumer</em>' containment reference.
     * @see #setIdempotentConsumer(IdempotentConsumerDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_IdempotentConsumer()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='idempotentConsumer' namespace='##targetNamespace'"
     * @generated
     */
	IdempotentConsumerDefinition getIdempotentConsumer();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getIdempotentConsumer <em>Idempotent Consumer</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Idempotent Consumer</em>' containment reference.
     * @see #getIdempotentConsumer()
     * @generated
     */
	void setIdempotentConsumer(IdempotentConsumerDefinition value);

	/**
     * Returns the value of the '<em><b>In Only</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Only</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>In Only</em>' containment reference.
     * @see #setInOnly(InOnlyDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_InOnly()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='inOnly' namespace='##targetNamespace'"
     * @generated
     */
	InOnlyDefinition getInOnly();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getInOnly <em>In Only</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>In Only</em>' containment reference.
     * @see #getInOnly()
     * @generated
     */
	void setInOnly(InOnlyDefinition value);

	/**
     * Returns the value of the '<em><b>In Out</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Out</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>In Out</em>' containment reference.
     * @see #setInOut(InOutDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_InOut()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='inOut' namespace='##targetNamespace'"
     * @generated
     */
	InOutDefinition getInOut();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getInOut <em>In Out</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>In Out</em>' containment reference.
     * @see #getInOut()
     * @generated
     */
	void setInOut(InOutDefinition value);

	/**
     * Returns the value of the '<em><b>Intercept</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intercept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Intercept</em>' containment reference.
     * @see #setIntercept(InterceptDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Intercept()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='intercept' namespace='##targetNamespace'"
     * @generated
     */
	InterceptDefinition getIntercept();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getIntercept <em>Intercept</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Intercept</em>' containment reference.
     * @see #getIntercept()
     * @generated
     */
	void setIntercept(InterceptDefinition value);

	/**
     * Returns the value of the '<em><b>Intercept From</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intercept From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Intercept From</em>' containment reference.
     * @see #setInterceptFrom(InterceptFromDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_InterceptFrom()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='interceptFrom' namespace='##targetNamespace'"
     * @generated
     */
	InterceptFromDefinition getInterceptFrom();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getInterceptFrom <em>Intercept From</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Intercept From</em>' containment reference.
     * @see #getInterceptFrom()
     * @generated
     */
	void setInterceptFrom(InterceptFromDefinition value);

	/**
     * Returns the value of the '<em><b>Intercept To Endpoint</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intercept To Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Intercept To Endpoint</em>' containment reference.
     * @see #setInterceptToEndpoint(InterceptSendToEndpointDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_InterceptToEndpoint()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='interceptToEndpoint' namespace='##targetNamespace'"
     * @generated
     */
	InterceptSendToEndpointDefinition getInterceptToEndpoint();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getInterceptToEndpoint <em>Intercept To Endpoint</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Intercept To Endpoint</em>' containment reference.
     * @see #getInterceptToEndpoint()
     * @generated
     */
	void setInterceptToEndpoint(InterceptSendToEndpointDefinition value);

	/**
     * Returns the value of the '<em><b>Java Script</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Script</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Java Script</em>' containment reference.
     * @see #setJavaScript(JavaScriptExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_JavaScript()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='javaScript' namespace='##targetNamespace'"
     * @generated
     */
	JavaScriptExpression getJavaScript();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getJavaScript <em>Java Script</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Java Script</em>' containment reference.
     * @see #getJavaScript()
     * @generated
     */
	void setJavaScript(JavaScriptExpression value);

	/**
     * Returns the value of the '<em><b>Jaxb</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jaxb</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Jaxb</em>' containment reference.
     * @see #setJaxb(JaxbDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Jaxb()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='jaxb' namespace='##targetNamespace'"
     * @generated
     */
	JaxbDataFormat getJaxb();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getJaxb <em>Jaxb</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Jaxb</em>' containment reference.
     * @see #getJaxb()
     * @generated
     */
	void setJaxb(JaxbDataFormat value);

	/**
     * Returns the value of the '<em><b>Jibx</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jibx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Jibx</em>' containment reference.
     * @see #setJibx(JibxDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Jibx()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='jibx' namespace='##targetNamespace'"
     * @generated
     */
	JibxDataFormat getJibx();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getJibx <em>Jibx</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Jibx</em>' containment reference.
     * @see #getJibx()
     * @generated
     */
	void setJibx(JibxDataFormat value);

	/**
     * Returns the value of the '<em><b>Jmx Agent</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jmx Agent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Jmx Agent</em>' containment reference.
     * @see #setJmxAgent(CamelJMXAgentDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_JmxAgent()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='jmxAgent' namespace='##targetNamespace'"
     * @generated
     */
	CamelJMXAgentDefinition getJmxAgent();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getJmxAgent <em>Jmx Agent</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Jmx Agent</em>' containment reference.
     * @see #getJmxAgent()
     * @generated
     */
	void setJmxAgent(CamelJMXAgentDefinition value);

	/**
     * Returns the value of the '<em><b>Json</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Json</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Json</em>' containment reference.
     * @see #setJson(JsonDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Json()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='json' namespace='##targetNamespace'"
     * @generated
     */
	JsonDataFormat getJson();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getJson <em>Json</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Json</em>' containment reference.
     * @see #getJson()
     * @generated
     */
	void setJson(JsonDataFormat value);

	/**
     * Returns the value of the '<em><b>Jxpath</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jxpath</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Jxpath</em>' containment reference.
     * @see #setJxpath(JxPathExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Jxpath()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='jxpath' namespace='##targetNamespace'"
     * @generated
     */
	JxPathExpression getJxpath();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getJxpath <em>Jxpath</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Jxpath</em>' containment reference.
     * @see #getJxpath()
     * @generated
     */
	void setJxpath(JxPathExpression value);

	/**
     * Returns the value of the '<em><b>Key Store Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Store Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Key Store Parameters</em>' containment reference.
     * @see #setKeyStoreParameters(KeyStoreParametersFactoryBean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_KeyStoreParameters()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='keyStoreParameters' namespace='##targetNamespace'"
     * @generated
     */
	KeyStoreParametersFactoryBean getKeyStoreParameters();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getKeyStoreParameters <em>Key Store Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key Store Parameters</em>' containment reference.
     * @see #getKeyStoreParameters()
     * @generated
     */
	void setKeyStoreParameters(KeyStoreParametersFactoryBean value);

	/**
     * Returns the value of the '<em><b>Language</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Language</em>' containment reference.
     * @see #setLanguage(LanguageExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Language()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
     * @generated
     */
	LanguageExpression getLanguage();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getLanguage <em>Language</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Language</em>' containment reference.
     * @see #getLanguage()
     * @generated
     */
	void setLanguage(LanguageExpression value);

	/**
     * Returns the value of the '<em><b>Load Balance</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Balance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Load Balance</em>' containment reference.
     * @see #setLoadBalance(LoadBalanceDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_LoadBalance()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='loadBalance' namespace='##targetNamespace'"
     * @generated
     */
	LoadBalanceDefinition getLoadBalance();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getLoadBalance <em>Load Balance</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Load Balance</em>' containment reference.
     * @see #getLoadBalance()
     * @generated
     */
	void setLoadBalance(LoadBalanceDefinition value);

	/**
     * Returns the value of the '<em><b>Log</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Log</em>' containment reference.
     * @see #setLog(LogDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Log()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='log' namespace='##targetNamespace'"
     * @generated
     */
	LogDefinition getLog();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getLog <em>Log</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Log</em>' containment reference.
     * @see #getLog()
     * @generated
     */
	void setLog(LogDefinition value);

	/**
     * Returns the value of the '<em><b>Loop</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Loop</em>' containment reference.
     * @see #setLoop(LoopDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Loop()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='loop' namespace='##targetNamespace'"
     * @generated
     */
	LoopDefinition getLoop();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getLoop <em>Loop</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Loop</em>' containment reference.
     * @see #getLoop()
     * @generated
     */
	void setLoop(LoopDefinition value);

	/**
     * Returns the value of the '<em><b>Marshal</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marshal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Marshal</em>' containment reference.
     * @see #setMarshal(MarshalDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Marshal()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='marshal' namespace='##targetNamespace'"
     * @generated
     */
	MarshalDefinition getMarshal();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getMarshal <em>Marshal</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Marshal</em>' containment reference.
     * @see #getMarshal()
     * @generated
     */
	void setMarshal(MarshalDefinition value);

	/**
     * Returns the value of the '<em><b>Method</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Method</em>' containment reference.
     * @see #setMethod(MethodCallExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Method()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
     * @generated
     */
	MethodCallExpression getMethod();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getMethod <em>Method</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Method</em>' containment reference.
     * @see #getMethod()
     * @generated
     */
	void setMethod(MethodCallExpression value);

	/**
     * Returns the value of the '<em><b>Multicast</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multicast</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Multicast</em>' containment reference.
     * @see #setMulticast(MulticastDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Multicast()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='multicast' namespace='##targetNamespace'"
     * @generated
     */
	MulticastDefinition getMulticast();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getMulticast <em>Multicast</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Multicast</em>' containment reference.
     * @see #getMulticast()
     * @generated
     */
	void setMulticast(MulticastDefinition value);

	/**
     * Returns the value of the '<em><b>Mvel</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mvel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Mvel</em>' containment reference.
     * @see #setMvel(MvelExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Mvel()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='mvel' namespace='##targetNamespace'"
     * @generated
     */
	MvelExpression getMvel();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getMvel <em>Mvel</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mvel</em>' containment reference.
     * @see #getMvel()
     * @generated
     */
	void setMvel(MvelExpression value);

	/**
     * Returns the value of the '<em><b>Ognl</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ognl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Ognl</em>' containment reference.
     * @see #setOgnl(OgnlExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Ognl()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ognl' namespace='##targetNamespace'"
     * @generated
     */
	OgnlExpression getOgnl();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getOgnl <em>Ognl</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ognl</em>' containment reference.
     * @see #getOgnl()
     * @generated
     */
	void setOgnl(OgnlExpression value);

	/**
     * Returns the value of the '<em><b>On Completion</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Completion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>On Completion</em>' containment reference.
     * @see #setOnCompletion(OnCompletionDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_OnCompletion()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='onCompletion' namespace='##targetNamespace'"
     * @generated
     */
	OnCompletionDefinition getOnCompletion();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getOnCompletion <em>On Completion</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>On Completion</em>' containment reference.
     * @see #getOnCompletion()
     * @generated
     */
	void setOnCompletion(OnCompletionDefinition value);

	/**
     * Returns the value of the '<em><b>On Exception</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Exception</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>On Exception</em>' containment reference.
     * @see #setOnException(OnExceptionDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_OnException()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='onException' namespace='##targetNamespace'"
     * @generated
     */
	OnExceptionDefinition getOnException();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getOnException <em>On Exception</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>On Exception</em>' containment reference.
     * @see #getOnException()
     * @generated
     */
	void setOnException(OnExceptionDefinition value);

	/**
     * Returns the value of the '<em><b>Otherwise</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Otherwise</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Otherwise</em>' containment reference.
     * @see #setOtherwise(OtherwiseDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Otherwise()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='otherwise' namespace='##targetNamespace'"
     * @generated
     */
	OtherwiseDefinition getOtherwise();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getOtherwise <em>Otherwise</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Otherwise</em>' containment reference.
     * @see #getOtherwise()
     * @generated
     */
	void setOtherwise(OtherwiseDefinition value);

	/**
     * Returns the value of the '<em><b>Package Scan</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Scan</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Package Scan</em>' containment reference.
     * @see #setPackageScan(PackageScanDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_PackageScan()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='packageScan' namespace='##targetNamespace'"
     * @generated
     */
	PackageScanDefinition getPackageScan();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getPackageScan <em>Package Scan</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package Scan</em>' containment reference.
     * @see #getPackageScan()
     * @generated
     */
	void setPackageScan(PackageScanDefinition value);

	/**
     * Returns the value of the '<em><b>Pgp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pgp</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pgp</em>' containment reference.
     * @see #setPgp(PgpDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Pgp()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='pgp' namespace='##targetNamespace'"
     * @generated
     */
    PgpDataFormat getPgp();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getPgp <em>Pgp</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pgp</em>' containment reference.
     * @see #getPgp()
     * @generated
     */
    void setPgp(PgpDataFormat value);

    /**
     * Returns the value of the '<em><b>Php</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Php</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Php</em>' containment reference.
     * @see #setPhp(PhpExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Php()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='php' namespace='##targetNamespace'"
     * @generated
     */
	PhpExpression getPhp();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getPhp <em>Php</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Php</em>' containment reference.
     * @see #getPhp()
     * @generated
     */
	void setPhp(PhpExpression value);

	/**
     * Returns the value of the '<em><b>Pipeline</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pipeline</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Pipeline</em>' containment reference.
     * @see #setPipeline(PipelineDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Pipeline()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='pipeline' namespace='##targetNamespace'"
     * @generated
     */
	PipelineDefinition getPipeline();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getPipeline <em>Pipeline</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pipeline</em>' containment reference.
     * @see #getPipeline()
     * @generated
     */
	void setPipeline(PipelineDefinition value);

	/**
     * Returns the value of the '<em><b>Policy</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Policy</em>' containment reference.
     * @see #setPolicy(PolicyDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Policy()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='policy' namespace='##targetNamespace'"
     * @generated
     */
	PolicyDefinition getPolicy();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getPolicy <em>Policy</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Policy</em>' containment reference.
     * @see #getPolicy()
     * @generated
     */
	void setPolicy(PolicyDefinition value);

	/**
     * Returns the value of the '<em><b>Poll Enrich</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poll Enrich</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Poll Enrich</em>' containment reference.
     * @see #setPollEnrich(PollEnrichDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_PollEnrich()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='pollEnrich' namespace='##targetNamespace'"
     * @generated
     */
	PollEnrichDefinition getPollEnrich();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getPollEnrich <em>Poll Enrich</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Poll Enrich</em>' containment reference.
     * @see #getPollEnrich()
     * @generated
     */
	void setPollEnrich(PollEnrichDefinition value);

	/**
     * Returns the value of the '<em><b>Process</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Process</em>' containment reference.
     * @see #setProcess(ProcessDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Process()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='process' namespace='##targetNamespace'"
     * @generated
     */
	ProcessDefinition getProcess();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getProcess <em>Process</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process</em>' containment reference.
     * @see #getProcess()
     * @generated
     */
	void setProcess(ProcessDefinition value);

	/**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference.
     * @see #setProperties(PropertiesDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Properties()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
     * @generated
     */
	PropertiesDefinition getProperties();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getProperties <em>Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Properties</em>' containment reference.
     * @see #getProperties()
     * @generated
     */
	void setProperties(PropertiesDefinition value);

	/**
     * Returns the value of the '<em><b>Property</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Property</em>' containment reference.
     * @see #setProperty(EObject)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Property()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
     * @generated
     */
	EObject getProperty();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getProperty <em>Property</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property</em>' containment reference.
     * @see #getProperty()
     * @generated
     */
	void setProperty(EObject value);

	/**
     * Returns the value of the '<em><b>Property Placeholder</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Property Placeholder</em>' containment reference.
     * @see #setPropertyPlaceholder(CamelPropertyPlaceholderDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_PropertyPlaceholder()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='propertyPlaceholder' namespace='##targetNamespace'"
     * @generated
     */
	CamelPropertyPlaceholderDefinition getPropertyPlaceholder();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getPropertyPlaceholder <em>Property Placeholder</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property Placeholder</em>' containment reference.
     * @see #getPropertyPlaceholder()
     * @generated
     */
	void setPropertyPlaceholder(CamelPropertyPlaceholderDefinition value);

	/**
     * Returns the value of the '<em><b>Protobuf</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protobuf</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Protobuf</em>' containment reference.
     * @see #setProtobuf(ProtobufDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Protobuf()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='protobuf' namespace='##targetNamespace'"
     * @generated
     */
	ProtobufDataFormat getProtobuf();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getProtobuf <em>Protobuf</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Protobuf</em>' containment reference.
     * @see #getProtobuf()
     * @generated
     */
	void setProtobuf(ProtobufDataFormat value);

	/**
     * Returns the value of the '<em><b>Proxy</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Proxy</em>' containment reference.
     * @see #setProxy(CamelProxyFactoryDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Proxy()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='proxy' namespace='##targetNamespace'"
     * @generated
     */
	CamelProxyFactoryDefinition getProxy();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getProxy <em>Proxy</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Proxy</em>' containment reference.
     * @see #getProxy()
     * @generated
     */
	void setProxy(CamelProxyFactoryDefinition value);

	/**
     * Returns the value of the '<em><b>Python</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Python</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Python</em>' containment reference.
     * @see #setPython(PythonExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Python()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='python' namespace='##targetNamespace'"
     * @generated
     */
	PythonExpression getPython();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getPython <em>Python</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Python</em>' containment reference.
     * @see #getPython()
     * @generated
     */
	void setPython(PythonExpression value);

	/**
     * Returns the value of the '<em><b>Random</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Random</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Random</em>' containment reference.
     * @see #setRandom(RandomLoadBalancerDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Random()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='random' namespace='##targetNamespace'"
     * @generated
     */
	RandomLoadBalancerDefinition getRandom();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRandom <em>Random</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Random</em>' containment reference.
     * @see #getRandom()
     * @generated
     */
	void setRandom(RandomLoadBalancerDefinition value);

	/**
     * Returns the value of the '<em><b>Recipient List</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipient List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Recipient List</em>' containment reference.
     * @see #setRecipientList(RecipientListDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_RecipientList()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='recipientList' namespace='##targetNamespace'"
     * @generated
     */
	RecipientListDefinition getRecipientList();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRecipientList <em>Recipient List</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Recipient List</em>' containment reference.
     * @see #getRecipientList()
     * @generated
     */
	void setRecipientList(RecipientListDefinition value);

	/**
     * Returns the value of the '<em><b>Redelivery Policy</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redelivery Policy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Redelivery Policy</em>' containment reference.
     * @see #setRedeliveryPolicy(RedeliveryPolicyDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_RedeliveryPolicy()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='redeliveryPolicy' namespace='##targetNamespace'"
     * @generated
     */
	RedeliveryPolicyDefinition getRedeliveryPolicy();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRedeliveryPolicy <em>Redelivery Policy</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Redelivery Policy</em>' containment reference.
     * @see #getRedeliveryPolicy()
     * @generated
     */
	void setRedeliveryPolicy(RedeliveryPolicyDefinition value);

	/**
     * Returns the value of the '<em><b>Redelivery Policy Profile</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redelivery Policy Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Redelivery Policy Profile</em>' containment reference.
     * @see #setRedeliveryPolicyProfile(CamelRedeliveryPolicyFactoryBean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_RedeliveryPolicyProfile()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='redeliveryPolicyProfile' namespace='##targetNamespace'"
     * @generated
     */
	CamelRedeliveryPolicyFactoryBean getRedeliveryPolicyProfile();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRedeliveryPolicyProfile <em>Redelivery Policy Profile</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Redelivery Policy Profile</em>' containment reference.
     * @see #getRedeliveryPolicyProfile()
     * @generated
     */
	void setRedeliveryPolicyProfile(CamelRedeliveryPolicyFactoryBean value);

	/**
     * Returns the value of the '<em><b>Ref</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Ref</em>' containment reference.
     * @see #setRef(RefExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Ref()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ref' namespace='##targetNamespace'"
     * @generated
     */
	RefExpression getRef();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRef <em>Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ref</em>' containment reference.
     * @see #getRef()
     * @generated
     */
	void setRef(RefExpression value);

	/**
     * Returns the value of the '<em><b>Remove Header</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Remove Header</em>' containment reference.
     * @see #setRemoveHeader(RemoveHeaderDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_RemoveHeader()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='removeHeader' namespace='##targetNamespace'"
     * @generated
     */
	RemoveHeaderDefinition getRemoveHeader();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRemoveHeader <em>Remove Header</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remove Header</em>' containment reference.
     * @see #getRemoveHeader()
     * @generated
     */
	void setRemoveHeader(RemoveHeaderDefinition value);

	/**
     * Returns the value of the '<em><b>Remove Headers</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove Headers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Remove Headers</em>' containment reference.
     * @see #setRemoveHeaders(RemoveHeadersDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_RemoveHeaders()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='removeHeaders' namespace='##targetNamespace'"
     * @generated
     */
	RemoveHeadersDefinition getRemoveHeaders();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRemoveHeaders <em>Remove Headers</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remove Headers</em>' containment reference.
     * @see #getRemoveHeaders()
     * @generated
     */
	void setRemoveHeaders(RemoveHeadersDefinition value);

	/**
     * Returns the value of the '<em><b>Remove Property</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Remove Property</em>' containment reference.
     * @see #setRemoveProperty(RemovePropertyDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_RemoveProperty()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='removeProperty' namespace='##targetNamespace'"
     * @generated
     */
	RemovePropertyDefinition getRemoveProperty();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRemoveProperty <em>Remove Property</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remove Property</em>' containment reference.
     * @see #getRemoveProperty()
     * @generated
     */
	void setRemoveProperty(RemovePropertyDefinition value);

	/**
     * Returns the value of the '<em><b>Resequence</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Resequence</em>' containment reference.
     * @see #setResequence(ResequenceDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Resequence()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='resequence' namespace='##targetNamespace'"
     * @generated
     */
	ResequenceDefinition getResequence();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getResequence <em>Resequence</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resequence</em>' containment reference.
     * @see #getResequence()
     * @generated
     */
	void setResequence(ResequenceDefinition value);

	/**
     * Returns the value of the '<em><b>Rollback</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rollback</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Rollback</em>' containment reference.
     * @see #setRollback(RollbackDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Rollback()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='rollback' namespace='##targetNamespace'"
     * @generated
     */
	RollbackDefinition getRollback();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRollback <em>Rollback</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rollback</em>' containment reference.
     * @see #getRollback()
     * @generated
     */
	void setRollback(RollbackDefinition value);

	/**
     * Returns the value of the '<em><b>Round Robin</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Round Robin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Round Robin</em>' containment reference.
     * @see #setRoundRobin(RoundRobinLoadBalancerDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_RoundRobin()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='roundRobin' namespace='##targetNamespace'"
     * @generated
     */
	RoundRobinLoadBalancerDefinition getRoundRobin();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRoundRobin <em>Round Robin</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Round Robin</em>' containment reference.
     * @see #getRoundRobin()
     * @generated
     */
	void setRoundRobin(RoundRobinLoadBalancerDefinition value);

	/**
     * Returns the value of the '<em><b>Route</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Route</em>' containment reference.
     * @see #setRoute(RouteDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Route()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='route' namespace='##targetNamespace'"
     * @generated
     */
	RouteDefinition getRoute();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRoute <em>Route</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Route</em>' containment reference.
     * @see #getRoute()
     * @generated
     */
	void setRoute(RouteDefinition value);

	/**
     * Returns the value of the '<em><b>Route Builder</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Builder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Route Builder</em>' containment reference.
     * @see #setRouteBuilder(RouteBuilderDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_RouteBuilder()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='routeBuilder' namespace='##targetNamespace'"
     * @generated
     */
	RouteBuilderDefinition getRouteBuilder();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRouteBuilder <em>Route Builder</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Route Builder</em>' containment reference.
     * @see #getRouteBuilder()
     * @generated
     */
	void setRouteBuilder(RouteBuilderDefinition value);

	/**
     * Returns the value of the '<em><b>Route Context</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Route Context</em>' containment reference.
     * @see #setRouteContext(CamelRouteContextFactoryBean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_RouteContext()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='routeContext' namespace='##targetNamespace'"
     * @generated
     */
	CamelRouteContextFactoryBean getRouteContext();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRouteContext <em>Route Context</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Route Context</em>' containment reference.
     * @see #getRouteContext()
     * @generated
     */
	void setRouteContext(CamelRouteContextFactoryBean value);

	/**
     * Returns the value of the '<em><b>Route Context Ref</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Context Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Route Context Ref</em>' containment reference.
     * @see #setRouteContextRef(RouteContextRefDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_RouteContextRef()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='routeContextRef' namespace='##targetNamespace'"
     * @generated
     */
	RouteContextRefDefinition getRouteContextRef();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRouteContextRef <em>Route Context Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Route Context Ref</em>' containment reference.
     * @see #getRouteContextRef()
     * @generated
     */
	void setRouteContextRef(RouteContextRefDefinition value);

	/**
     * Returns the value of the '<em><b>Routes</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Routes</em>' containment reference.
     * @see #setRoutes(RoutesDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Routes()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='routes' namespace='##targetNamespace'"
     * @generated
     */
	RoutesDefinition getRoutes();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRoutes <em>Routes</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Routes</em>' containment reference.
     * @see #getRoutes()
     * @generated
     */
	void setRoutes(RoutesDefinition value);

	/**
     * Returns the value of the '<em><b>Routing Slip</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing Slip</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Routing Slip</em>' containment reference.
     * @see #setRoutingSlip(RoutingSlipDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_RoutingSlip()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='routingSlip' namespace='##targetNamespace'"
     * @generated
     */
	RoutingSlipDefinition getRoutingSlip();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRoutingSlip <em>Routing Slip</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Routing Slip</em>' containment reference.
     * @see #getRoutingSlip()
     * @generated
     */
	void setRoutingSlip(RoutingSlipDefinition value);

	/**
     * Returns the value of the '<em><b>Rss</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rss</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Rss</em>' containment reference.
     * @see #setRss(RssDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Rss()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='rss' namespace='##targetNamespace'"
     * @generated
     */
	RssDataFormat getRss();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRss <em>Rss</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rss</em>' containment reference.
     * @see #getRss()
     * @generated
     */
	void setRss(RssDataFormat value);

	/**
     * Returns the value of the '<em><b>Ruby</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruby</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Ruby</em>' containment reference.
     * @see #setRuby(RubyExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Ruby()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ruby' namespace='##targetNamespace'"
     * @generated
     */
	RubyExpression getRuby();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getRuby <em>Ruby</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ruby</em>' containment reference.
     * @see #getRuby()
     * @generated
     */
	void setRuby(RubyExpression value);

	/**
     * Returns the value of the '<em><b>Sample</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Sample</em>' containment reference.
     * @see #setSample(SamplingDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Sample()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='sample' namespace='##targetNamespace'"
     * @generated
     */
	SamplingDefinition getSample();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSample <em>Sample</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sample</em>' containment reference.
     * @see #getSample()
     * @generated
     */
	void setSample(SamplingDefinition value);

	/**
     * Returns the value of the '<em><b>Secure Random Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secure Random Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Secure Random Parameters</em>' containment reference.
     * @see #setSecureRandomParameters(SecureRandomParametersFactoryBean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_SecureRandomParameters()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='secureRandomParameters' namespace='##targetNamespace'"
     * @generated
     */
	SecureRandomParametersFactoryBean getSecureRandomParameters();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSecureRandomParameters <em>Secure Random Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Secure Random Parameters</em>' containment reference.
     * @see #getSecureRandomParameters()
     * @generated
     */
	void setSecureRandomParameters(SecureRandomParametersFactoryBean value);

	/**
     * Returns the value of the '<em><b>Secure XML</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secure XML</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Secure XML</em>' containment reference.
     * @see #setSecureXML(XmlSecurityDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_SecureXML()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='secureXML' namespace='##targetNamespace'"
     * @generated
     */
	XmlSecurityDataFormat getSecureXML();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSecureXML <em>Secure XML</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Secure XML</em>' containment reference.
     * @see #getSecureXML()
     * @generated
     */
	void setSecureXML(XmlSecurityDataFormat value);

	/**
     * Returns the value of the '<em><b>Serialization</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serialization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Serialization</em>' containment reference.
     * @see #setSerialization(SerializationDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Serialization()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='serialization' namespace='##targetNamespace'"
     * @generated
     */
	SerializationDataFormat getSerialization();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSerialization <em>Serialization</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Serialization</em>' containment reference.
     * @see #getSerialization()
     * @generated
     */
	void setSerialization(SerializationDataFormat value);

	/**
     * Returns the value of the '<em><b>Set Body</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Set Body</em>' containment reference.
     * @see #setSetBody(SetBodyDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_SetBody()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='setBody' namespace='##targetNamespace'"
     * @generated
     */
	SetBodyDefinition getSetBody();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSetBody <em>Set Body</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Set Body</em>' containment reference.
     * @see #getSetBody()
     * @generated
     */
	void setSetBody(SetBodyDefinition value);

	/**
     * Returns the value of the '<em><b>Set Exchange Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Exchange Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Set Exchange Pattern</em>' containment reference.
     * @see #setSetExchangePattern(SetExchangePatternDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_SetExchangePattern()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='setExchangePattern' namespace='##targetNamespace'"
     * @generated
     */
	SetExchangePatternDefinition getSetExchangePattern();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSetExchangePattern <em>Set Exchange Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Set Exchange Pattern</em>' containment reference.
     * @see #getSetExchangePattern()
     * @generated
     */
	void setSetExchangePattern(SetExchangePatternDefinition value);

	/**
     * Returns the value of the '<em><b>Set Fault Body</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Fault Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Set Fault Body</em>' containment reference.
     * @see #setSetFaultBody(SetFaultBodyDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_SetFaultBody()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='setFaultBody' namespace='##targetNamespace'"
     * @generated
     */
	SetFaultBodyDefinition getSetFaultBody();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSetFaultBody <em>Set Fault Body</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Set Fault Body</em>' containment reference.
     * @see #getSetFaultBody()
     * @generated
     */
	void setSetFaultBody(SetFaultBodyDefinition value);

	/**
     * Returns the value of the '<em><b>Set Header</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Set Header</em>' containment reference.
     * @see #setSetHeader(SetHeaderDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_SetHeader()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='setHeader' namespace='##targetNamespace'"
     * @generated
     */
	SetHeaderDefinition getSetHeader();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSetHeader <em>Set Header</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Set Header</em>' containment reference.
     * @see #getSetHeader()
     * @generated
     */
	void setSetHeader(SetHeaderDefinition value);

	/**
     * Returns the value of the '<em><b>Set Out Header</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Out Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Set Out Header</em>' containment reference.
     * @see #setSetOutHeader(SetOutHeaderDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_SetOutHeader()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='setOutHeader' namespace='##targetNamespace'"
     * @generated
     */
	SetOutHeaderDefinition getSetOutHeader();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSetOutHeader <em>Set Out Header</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Set Out Header</em>' containment reference.
     * @see #getSetOutHeader()
     * @generated
     */
	void setSetOutHeader(SetOutHeaderDefinition value);

	/**
     * Returns the value of the '<em><b>Set Property</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Set Property</em>' containment reference.
     * @see #setSetProperty(SetPropertyDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_SetProperty()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='setProperty' namespace='##targetNamespace'"
     * @generated
     */
	SetPropertyDefinition getSetProperty();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSetProperty <em>Set Property</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Set Property</em>' containment reference.
     * @see #getSetProperty()
     * @generated
     */
	void setSetProperty(SetPropertyDefinition value);

	/**
     * Returns the value of the '<em><b>Simple</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Simple</em>' containment reference.
     * @see #setSimple(SimpleExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Simple()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='simple' namespace='##targetNamespace'"
     * @generated
     */
	SimpleExpression getSimple();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSimple <em>Simple</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Simple</em>' containment reference.
     * @see #getSimple()
     * @generated
     */
	void setSimple(SimpleExpression value);

	/**
     * Returns the value of the '<em><b>Soapjaxb</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soapjaxb</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Soapjaxb</em>' containment reference.
     * @see #setSoapjaxb(SoapJaxbDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Soapjaxb()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='soapjaxb' namespace='##targetNamespace'"
     * @generated
     */
	SoapJaxbDataFormat getSoapjaxb();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSoapjaxb <em>Soapjaxb</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Soapjaxb</em>' containment reference.
     * @see #getSoapjaxb()
     * @generated
     */
	void setSoapjaxb(SoapJaxbDataFormat value);

	/**
     * Returns the value of the '<em><b>Sort</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Sort</em>' containment reference.
     * @see #setSort(SortDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Sort()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='sort' namespace='##targetNamespace'"
     * @generated
     */
	SortDefinition getSort();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSort <em>Sort</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sort</em>' containment reference.
     * @see #getSort()
     * @generated
     */
	void setSort(SortDefinition value);

	/**
     * Returns the value of the '<em><b>Spel</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Spel</em>' containment reference.
     * @see #setSpel(SpELExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Spel()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='spel' namespace='##targetNamespace'"
     * @generated
     */
	SpELExpression getSpel();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSpel <em>Spel</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Spel</em>' containment reference.
     * @see #getSpel()
     * @generated
     */
	void setSpel(SpELExpression value);

	/**
     * Returns the value of the '<em><b>Split</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Split</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Split</em>' containment reference.
     * @see #setSplit(SplitDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Split()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='split' namespace='##targetNamespace'"
     * @generated
     */
	SplitDefinition getSplit();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSplit <em>Split</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Split</em>' containment reference.
     * @see #getSplit()
     * @generated
     */
	void setSplit(SplitDefinition value);

	/**
     * Returns the value of the '<em><b>Sql</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Sql</em>' containment reference.
     * @see #setSql(SqlExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Sql()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='sql' namespace='##targetNamespace'"
     * @generated
     */
	SqlExpression getSql();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSql <em>Sql</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sql</em>' containment reference.
     * @see #getSql()
     * @generated
     */
	void setSql(SqlExpression value);

	/**
     * Returns the value of the '<em><b>Ssl Context Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssl Context Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Ssl Context Parameters</em>' containment reference.
     * @see #setSslContextParameters(SslContextParametersFactoryBean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_SslContextParameters()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='sslContextParameters' namespace='##targetNamespace'"
     * @generated
     */
	SslContextParametersFactoryBean getSslContextParameters();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSslContextParameters <em>Ssl Context Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ssl Context Parameters</em>' containment reference.
     * @see #getSslContextParameters()
     * @generated
     */
	void setSslContextParameters(SslContextParametersFactoryBean value);

	/**
     * Returns the value of the '<em><b>Sticky</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sticky</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Sticky</em>' containment reference.
     * @see #setSticky(StickyLoadBalancerDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Sticky()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='sticky' namespace='##targetNamespace'"
     * @generated
     */
	StickyLoadBalancerDefinition getSticky();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSticky <em>Sticky</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sticky</em>' containment reference.
     * @see #getSticky()
     * @generated
     */
	void setSticky(StickyLoadBalancerDefinition value);

	/**
     * Returns the value of the '<em><b>Stop</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Stop</em>' containment reference.
     * @see #setStop(StopDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Stop()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='stop' namespace='##targetNamespace'"
     * @generated
     */
	StopDefinition getStop();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getStop <em>Stop</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stop</em>' containment reference.
     * @see #getStop()
     * @generated
     */
	void setStop(StopDefinition value);

	/**
     * Returns the value of the '<em><b>Stream Resequencer Config</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stream Resequencer Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Stream Resequencer Config</em>' containment reference.
     * @see #setStreamResequencerConfig(StreamResequencerConfig)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_StreamResequencerConfig()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='streamResequencerConfig' namespace='##targetNamespace'"
     * @generated
     */
	StreamResequencerConfig getStreamResequencerConfig();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getStreamResequencerConfig <em>Stream Resequencer Config</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stream Resequencer Config</em>' containment reference.
     * @see #getStreamResequencerConfig()
     * @generated
     */
	void setStreamResequencerConfig(StreamResequencerConfig value);

	/**
     * Returns the value of the '<em><b>String</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>String</em>' containment reference.
     * @see #setString(StringDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_String()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='string' namespace='##targetNamespace'"
     * @generated
     */
	StringDataFormat getString();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getString <em>String</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>String</em>' containment reference.
     * @see #getString()
     * @generated
     */
	void setString(StringDataFormat value);

	/**
     * Returns the value of the '<em><b>Syslog</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Syslog</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Syslog</em>' containment reference.
     * @see #setSyslog(SyslogDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Syslog()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='syslog' namespace='##targetNamespace'"
     * @generated
     */
	SyslogDataFormat getSyslog();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getSyslog <em>Syslog</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Syslog</em>' containment reference.
     * @see #getSyslog()
     * @generated
     */
	void setSyslog(SyslogDataFormat value);

	/**
     * Returns the value of the '<em><b>Template</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Template</em>' containment reference.
     * @see #setTemplate(CamelProducerTemplateFactoryBean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Template()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='template' namespace='##targetNamespace'"
     * @generated
     */
	CamelProducerTemplateFactoryBean getTemplate();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getTemplate <em>Template</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Template</em>' containment reference.
     * @see #getTemplate()
     * @generated
     */
	void setTemplate(CamelProducerTemplateFactoryBean value);

	/**
     * Returns the value of the '<em><b>Thread Pool</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Pool</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Thread Pool</em>' containment reference.
     * @see #setThreadPool(CamelThreadPoolFactoryBean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_ThreadPool()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='threadPool' namespace='##targetNamespace'"
     * @generated
     */
	CamelThreadPoolFactoryBean getThreadPool();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getThreadPool <em>Thread Pool</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Thread Pool</em>' containment reference.
     * @see #getThreadPool()
     * @generated
     */
	void setThreadPool(CamelThreadPoolFactoryBean value);

	/**
     * Returns the value of the '<em><b>Thread Pool Profile</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Pool Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Thread Pool Profile</em>' containment reference.
     * @see #setThreadPoolProfile(ThreadPoolProfileDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_ThreadPoolProfile()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='threadPoolProfile' namespace='##targetNamespace'"
     * @generated
     */
	ThreadPoolProfileDefinition getThreadPoolProfile();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getThreadPoolProfile <em>Thread Pool Profile</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Thread Pool Profile</em>' containment reference.
     * @see #getThreadPoolProfile()
     * @generated
     */
	void setThreadPoolProfile(ThreadPoolProfileDefinition value);

	/**
     * Returns the value of the '<em><b>Threads</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threads</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Threads</em>' containment reference.
     * @see #setThreads(ThreadsDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Threads()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='threads' namespace='##targetNamespace'"
     * @generated
     */
	ThreadsDefinition getThreads();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getThreads <em>Threads</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Threads</em>' containment reference.
     * @see #getThreads()
     * @generated
     */
	void setThreads(ThreadsDefinition value);

	/**
     * Returns the value of the '<em><b>Throttle</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throttle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Throttle</em>' containment reference.
     * @see #setThrottle(ThrottleDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Throttle()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='throttle' namespace='##targetNamespace'"
     * @generated
     */
	ThrottleDefinition getThrottle();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getThrottle <em>Throttle</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Throttle</em>' containment reference.
     * @see #getThrottle()
     * @generated
     */
	void setThrottle(ThrottleDefinition value);

	/**
     * Returns the value of the '<em><b>Throw Exception</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throw Exception</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Throw Exception</em>' containment reference.
     * @see #setThrowException(ThrowExceptionDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_ThrowException()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='throwException' namespace='##targetNamespace'"
     * @generated
     */
	ThrowExceptionDefinition getThrowException();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getThrowException <em>Throw Exception</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Throw Exception</em>' containment reference.
     * @see #getThrowException()
     * @generated
     */
	void setThrowException(ThrowExceptionDefinition value);

	/**
     * Returns the value of the '<em><b>Tidy Markup</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tidy Markup</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Tidy Markup</em>' containment reference.
     * @see #setTidyMarkup(TidyMarkupDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_TidyMarkup()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='tidyMarkup' namespace='##targetNamespace'"
     * @generated
     */
	TidyMarkupDataFormat getTidyMarkup();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getTidyMarkup <em>Tidy Markup</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tidy Markup</em>' containment reference.
     * @see #getTidyMarkup()
     * @generated
     */
	void setTidyMarkup(TidyMarkupDataFormat value);

	/**
     * Returns the value of the '<em><b>To</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>To</em>' containment reference.
     * @see #setTo(ToDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_To()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='to' namespace='##targetNamespace'"
     * @generated
     */
	ToDefinition getTo();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getTo <em>To</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>To</em>' containment reference.
     * @see #getTo()
     * @generated
     */
	void setTo(ToDefinition value);

	/**
     * Returns the value of the '<em><b>Tokenize</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokenize</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Tokenize</em>' containment reference.
     * @see #setTokenize(TokenizerExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Tokenize()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='tokenize' namespace='##targetNamespace'"
     * @generated
     */
	TokenizerExpression getTokenize();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getTokenize <em>Tokenize</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tokenize</em>' containment reference.
     * @see #getTokenize()
     * @generated
     */
	void setTokenize(TokenizerExpression value);

	/**
     * Returns the value of the '<em><b>Topic</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Topic</em>' containment reference.
     * @see #setTopic(TopicLoadBalancerDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Topic()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='topic' namespace='##targetNamespace'"
     * @generated
     */
	TopicLoadBalancerDefinition getTopic();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getTopic <em>Topic</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Topic</em>' containment reference.
     * @see #getTopic()
     * @generated
     */
	void setTopic(TopicLoadBalancerDefinition value);

	/**
     * Returns the value of the '<em><b>Transacted</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transacted</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Transacted</em>' containment reference.
     * @see #setTransacted(TransactedDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Transacted()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='transacted' namespace='##targetNamespace'"
     * @generated
     */
	TransactedDefinition getTransacted();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getTransacted <em>Transacted</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transacted</em>' containment reference.
     * @see #getTransacted()
     * @generated
     */
	void setTransacted(TransactedDefinition value);

	/**
     * Returns the value of the '<em><b>Transform</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Transform</em>' containment reference.
     * @see #setTransform(TransformDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Transform()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='transform' namespace='##targetNamespace'"
     * @generated
     */
	TransformDefinition getTransform();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getTransform <em>Transform</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transform</em>' containment reference.
     * @see #getTransform()
     * @generated
     */
	void setTransform(TransformDefinition value);

	/**
     * Returns the value of the '<em><b>Unmarshal</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unmarshal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Unmarshal</em>' containment reference.
     * @see #setUnmarshal(UnmarshalDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Unmarshal()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='unmarshal' namespace='##targetNamespace'"
     * @generated
     */
	UnmarshalDefinition getUnmarshal();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getUnmarshal <em>Unmarshal</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unmarshal</em>' containment reference.
     * @see #getUnmarshal()
     * @generated
     */
	void setUnmarshal(UnmarshalDefinition value);

	/**
     * Returns the value of the '<em><b>Validate</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Validate</em>' containment reference.
     * @see #setValidate(ValidateDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Validate()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='validate' namespace='##targetNamespace'"
     * @generated
     */
	ValidateDefinition getValidate();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getValidate <em>Validate</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Validate</em>' containment reference.
     * @see #getValidate()
     * @generated
     */
	void setValidate(ValidateDefinition value);

	/**
     * Returns the value of the '<em><b>Weighted</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weighted</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Weighted</em>' containment reference.
     * @see #setWeighted(WeightedLoadBalancerDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Weighted()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='weighted' namespace='##targetNamespace'"
     * @generated
     */
	WeightedLoadBalancerDefinition getWeighted();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getWeighted <em>Weighted</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Weighted</em>' containment reference.
     * @see #getWeighted()
     * @generated
     */
	void setWeighted(WeightedLoadBalancerDefinition value);

	/**
     * Returns the value of the '<em><b>When</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>When</em>' containment reference.
     * @see #setWhen(WhenDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_When()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='when' namespace='##targetNamespace'"
     * @generated
     */
	WhenDefinition getWhen();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getWhen <em>When</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>When</em>' containment reference.
     * @see #getWhen()
     * @generated
     */
	void setWhen(WhenDefinition value);

	/**
     * Returns the value of the '<em><b>Wire Tap</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire Tap</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Wire Tap</em>' containment reference.
     * @see #setWireTap(WireTapDefinition)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_WireTap()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='wireTap' namespace='##targetNamespace'"
     * @generated
     */
	WireTapDefinition getWireTap();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getWireTap <em>Wire Tap</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wire Tap</em>' containment reference.
     * @see #getWireTap()
     * @generated
     */
	void setWireTap(WireTapDefinition value);

	/**
     * Returns the value of the '<em><b>Xml Beans</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml Beans</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Xml Beans</em>' containment reference.
     * @see #setXmlBeans(XmlBeansDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_XmlBeans()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='xmlBeans' namespace='##targetNamespace'"
     * @generated
     */
	XmlBeansDataFormat getXmlBeans();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getXmlBeans <em>Xml Beans</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xml Beans</em>' containment reference.
     * @see #getXmlBeans()
     * @generated
     */
	void setXmlBeans(XmlBeansDataFormat value);

	/**
     * Returns the value of the '<em><b>Xpath</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xpath</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Xpath</em>' containment reference.
     * @see #setXpath(XPathExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Xpath()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='xpath' namespace='##targetNamespace'"
     * @generated
     */
	XPathExpression getXpath();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getXpath <em>Xpath</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xpath</em>' containment reference.
     * @see #getXpath()
     * @generated
     */
	void setXpath(XPathExpression value);

	/**
     * Returns the value of the '<em><b>Xquery</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xquery</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Xquery</em>' containment reference.
     * @see #setXquery(XQueryExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Xquery()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='xquery' namespace='##targetNamespace'"
     * @generated
     */
	XQueryExpression getXquery();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getXquery <em>Xquery</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xquery</em>' containment reference.
     * @see #getXquery()
     * @generated
     */
	void setXquery(XQueryExpression value);

	/**
     * Returns the value of the '<em><b>Xstream</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xstream</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Xstream</em>' containment reference.
     * @see #setXstream(XStreamDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Xstream()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='xstream' namespace='##targetNamespace'"
     * @generated
     */
	XStreamDataFormat getXstream();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getXstream <em>Xstream</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xstream</em>' containment reference.
     * @see #getXstream()
     * @generated
     */
	void setXstream(XStreamDataFormat value);

	/**
     * Returns the value of the '<em><b>Zip</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zip</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Zip</em>' containment reference.
     * @see #setZip(ZipDataFormat)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getDocumentRoot_Zip()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='zip' namespace='##targetNamespace'"
     * @generated
     */
	ZipDataFormat getZip();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot#getZip <em>Zip</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Zip</em>' containment reference.
     * @see #getZip()
     * @generated
     */
	void setZip(ZipDataFormat value);

} // DocumentRoot
