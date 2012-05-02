/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.spring.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getAop <em>Aop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getBatchResequencerConfig <em>Batch Resequencer Config</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getBeanPostProcessor <em>Bean Post Processor</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getBindy <em>Bindy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getCamelContext <em>Camel Context</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getCastor <em>Castor</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getConsumerTemplate <em>Consumer Template</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getContextScan <em>Context Scan</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getCrypto <em>Crypto</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getCsv <em>Csv</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getCustomDataFormat <em>Custom Data Format</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getCustomLoadBalancer <em>Custom Load Balancer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getDataFormats <em>Data Formats</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getEl <em>El</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getErrorHandler <em>Error Handler</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getExport <em>Export</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getExpressionDefinition <em>Expression Definition</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getFailover <em>Failover</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getFlatpack <em>Flatpack</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getGroovy <em>Groovy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getGzip <em>Gzip</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getHl7 <em>Hl7</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getInOnly <em>In Only</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getInOut <em>In Out</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getInterceptToEndpoint <em>Intercept To Endpoint</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getJavaScript <em>Java Script</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getJaxb <em>Jaxb</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getJibx <em>Jibx</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getJmxAgent <em>Jmx Agent</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getJson <em>Json</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getJxpath <em>Jxpath</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getKeyStoreParameters <em>Key Store Parameters</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getLog <em>Log</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getMvel <em>Mvel</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getOgnl <em>Ognl</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getPackageScan <em>Package Scan</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getPhp <em>Php</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getPropertyPlaceholder <em>Property Placeholder</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getProtobuf <em>Protobuf</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getProxy <em>Proxy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getPython <em>Python</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getRandom <em>Random</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getRedeliveryPolicy <em>Redelivery Policy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getRedeliveryPolicyProfile <em>Redelivery Policy Profile</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getRoundRobin <em>Round Robin</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getRouteBuilder <em>Route Builder</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getRouteContext <em>Route Context</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getRouteContextRef <em>Route Context Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getRoutes <em>Routes</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getRss <em>Rss</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getSample <em>Sample</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getSecureRandomParameters <em>Secure Random Parameters</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getSecureXML <em>Secure XML</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getSerialization <em>Serialization</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getSetFaultBody <em>Set Fault Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getSetOutHeader <em>Set Out Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getSoapjaxb <em>Soapjaxb</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getSpel <em>Spel</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getSplit <em>Split</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getSql <em>Sql</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getSslContextParameters <em>Ssl Context Parameters</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getSticky <em>Sticky</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getStreamResequencerConfig <em>Stream Resequencer Config</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getString <em>String</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getSyslog <em>Syslog</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getThreadPool <em>Thread Pool</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getThreadPoolProfile <em>Thread Pool Profile</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getTidyMarkup <em>Tidy Markup</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getTokenize <em>Tokenize</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getWeighted <em>Weighted</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getXmlBeans <em>Xml Beans</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getXquery <em>Xquery</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getXstream <em>Xstream</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DocumentRootImpl#getZip <em>Zip</em>}</li>
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
		return SpringPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SpringPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SpringPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SpringPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateDefinition getAggregate() {
		return (AggregateDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Aggregate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregate(AggregateDefinition newAggregate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Aggregate(), newAggregate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregate(AggregateDefinition newAggregate) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Aggregate(), newAggregate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AopDefinition getAop() {
		return (AopDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Aop(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAop(AopDefinition newAop, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Aop(), newAop, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAop(AopDefinition newAop) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Aop(), newAop);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatchResequencerConfig getBatchResequencerConfig() {
		return (BatchResequencerConfig)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_BatchResequencerConfig(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBatchResequencerConfig(BatchResequencerConfig newBatchResequencerConfig, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_BatchResequencerConfig(), newBatchResequencerConfig, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatchResequencerConfig(BatchResequencerConfig newBatchResequencerConfig) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_BatchResequencerConfig(), newBatchResequencerConfig);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeanDefinition getBean() {
		return (BeanDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Bean(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBean(BeanDefinition newBean, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Bean(), newBean, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBean(BeanDefinition newBean) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Bean(), newBean);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelBeanPostProcessor getBeanPostProcessor() {
		return (CamelBeanPostProcessor)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_BeanPostProcessor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeanPostProcessor(CamelBeanPostProcessor newBeanPostProcessor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_BeanPostProcessor(), newBeanPostProcessor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeanPostProcessor(CamelBeanPostProcessor newBeanPostProcessor) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_BeanPostProcessor(), newBeanPostProcessor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindyDataFormat getBindy() {
		return (BindyDataFormat)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Bindy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindy(BindyDataFormat newBindy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Bindy(), newBindy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindy(BindyDataFormat newBindy) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Bindy(), newBindy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelContextFactoryBean getCamelContext() {
		return (CamelContextFactoryBean)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_CamelContext(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCamelContext(CamelContextFactoryBean newCamelContext, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_CamelContext(), newCamelContext, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCamelContext(CamelContextFactoryBean newCamelContext) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_CamelContext(), newCamelContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CastorDataFormat getCastor() {
		return (CastorDataFormat)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Castor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCastor(CastorDataFormat newCastor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Castor(), newCastor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCastor(CastorDataFormat newCastor) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Castor(), newCastor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceDefinition getChoice() {
		return (ChoiceDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Choice(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChoice(ChoiceDefinition newChoice, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Choice(), newChoice, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoice(ChoiceDefinition newChoice) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Choice(), newChoice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantExpression getConstant() {
		return (ConstantExpression)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Constant(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstant(ConstantExpression newConstant, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Constant(), newConstant, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(ConstantExpression newConstant) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Constant(), newConstant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelConsumerTemplateFactoryBean getConsumerTemplate() {
		return (CamelConsumerTemplateFactoryBean)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_ConsumerTemplate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsumerTemplate(CamelConsumerTemplateFactoryBean newConsumerTemplate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_ConsumerTemplate(), newConsumerTemplate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumerTemplate(CamelConsumerTemplateFactoryBean newConsumerTemplate) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_ConsumerTemplate(), newConsumerTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextScanDefinition getContextScan() {
		return (ContextScanDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_ContextScan(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextScan(ContextScanDefinition newContextScan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_ContextScan(), newContextScan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextScan(ContextScanDefinition newContextScan) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_ContextScan(), newContextScan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConvertBodyDefinition getConvertBodyTo() {
		return (ConvertBodyDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_ConvertBodyTo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConvertBodyTo(ConvertBodyDefinition newConvertBodyTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_ConvertBodyTo(), newConvertBodyTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConvertBodyTo(ConvertBodyDefinition newConvertBodyTo) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_ConvertBodyTo(), newConvertBodyTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoDataFormat getCrypto() {
		return (CryptoDataFormat)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Crypto(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrypto(CryptoDataFormat newCrypto, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Crypto(), newCrypto, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrypto(CryptoDataFormat newCrypto) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Crypto(), newCrypto);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsvDataFormat getCsv() {
		return (CsvDataFormat)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Csv(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCsv(CsvDataFormat newCsv, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Csv(), newCsv, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsv(CsvDataFormat newCsv) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Csv(), newCsv);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomDataFormat getCustomDataFormat() {
		return (CustomDataFormat)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_CustomDataFormat(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomDataFormat(CustomDataFormat newCustomDataFormat, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_CustomDataFormat(), newCustomDataFormat, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomDataFormat(CustomDataFormat newCustomDataFormat) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_CustomDataFormat(), newCustomDataFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomLoadBalancerDefinition getCustomLoadBalancer() {
		return (CustomLoadBalancerDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_CustomLoadBalancer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomLoadBalancer(CustomLoadBalancerDefinition newCustomLoadBalancer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_CustomLoadBalancer(), newCustomLoadBalancer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomLoadBalancer(CustomLoadBalancerDefinition newCustomLoadBalancer) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_CustomLoadBalancer(), newCustomLoadBalancer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFormatsDefinition getDataFormats() {
		return (DataFormatsDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_DataFormats(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataFormats(DataFormatsDefinition newDataFormats, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_DataFormats(), newDataFormats, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataFormats(DataFormatsDefinition newDataFormats) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_DataFormats(), newDataFormats);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayDefinition getDelay() {
		return (DelayDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Delay(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelay(DelayDefinition newDelay, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Delay(), newDelay, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(DelayDefinition newDelay) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Delay(), newDelay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionDefinition getDescription() {
		return (DescriptionDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DescriptionDefinition newDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Description(), newDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(DescriptionDefinition newDescription) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatchDefinition getDoCatch() {
		return (CatchDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_DoCatch(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoCatch(CatchDefinition newDoCatch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_DoCatch(), newDoCatch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoCatch(CatchDefinition newDoCatch) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_DoCatch(), newDoCatch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinallyDefinition getDoFinally() {
		return (FinallyDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_DoFinally(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoFinally(FinallyDefinition newDoFinally, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_DoFinally(), newDoFinally, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoFinally(FinallyDefinition newDoFinally) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_DoFinally(), newDoFinally);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TryDefinition getDoTry() {
		return (TryDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_DoTry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoTry(TryDefinition newDoTry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_DoTry(), newDoTry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoTry(TryDefinition newDoTry) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_DoTry(), newDoTry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicRouterDefinition getDynamicRouter() {
		return (DynamicRouterDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_DynamicRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynamicRouter(DynamicRouterDefinition newDynamicRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_DynamicRouter(), newDynamicRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicRouter(DynamicRouterDefinition newDynamicRouter) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_DynamicRouter(), newDynamicRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElExpression getEl() {
		return (ElExpression)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_El(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEl(ElExpression newEl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_El(), newEl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEl(ElExpression newEl) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_El(), newEl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelEndpointFactoryBean getEndpoint() {
		return (CamelEndpointFactoryBean)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Endpoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpoint(CamelEndpointFactoryBean newEndpoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Endpoint(), newEndpoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint(CamelEndpointFactoryBean newEndpoint) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Endpoint(), newEndpoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrichDefinition getEnrich() {
		return (EnrichDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Enrich(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnrich(EnrichDefinition newEnrich, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Enrich(), newEnrich, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnrich(EnrichDefinition newEnrich) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Enrich(), newEnrich);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorHandlerDefinition getErrorHandler() {
		return (ErrorHandlerDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_ErrorHandler(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorHandler(ErrorHandlerDefinition newErrorHandler, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_ErrorHandler(), newErrorHandler, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorHandler(ErrorHandlerDefinition newErrorHandler) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_ErrorHandler(), newErrorHandler);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelServiceExporterDefinition getExport() {
		return (CamelServiceExporterDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Export(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExport(CamelServiceExporterDefinition newExport, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Export(), newExport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExport(CamelServiceExporterDefinition newExport) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Export(), newExport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionSubElementDefinition getExpression() {
		return (ExpressionSubElementDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Expression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(ExpressionSubElementDefinition newExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Expression(), newExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(ExpressionSubElementDefinition newExpression) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Expression(), newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpressionDefinition() {
		return (Expression)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressionDefinition(Expression newExpressionDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(), newExpressionDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionDefinition(Expression newExpressionDefinition) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(), newExpressionDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailoverLoadBalancerDefinition getFailover() {
		return (FailoverLoadBalancerDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Failover(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFailover(FailoverLoadBalancerDefinition newFailover, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Failover(), newFailover, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailover(FailoverLoadBalancerDefinition newFailover) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Failover(), newFailover);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterDefinition getFilter() {
		return (FilterDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Filter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(FilterDefinition newFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Filter(), newFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(FilterDefinition newFilter) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Filter(), newFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlatpackDataFormat getFlatpack() {
		return (FlatpackDataFormat)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Flatpack(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlatpack(FlatpackDataFormat newFlatpack, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Flatpack(), newFlatpack, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlatpack(FlatpackDataFormat newFlatpack) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Flatpack(), newFlatpack);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromDefinition getFrom() {
		return (FromDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_From(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(FromDefinition newFrom, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_From(), newFrom, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(FromDefinition newFrom) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_From(), newFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroovyExpression getGroovy() {
		return (GroovyExpression)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Groovy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroovy(GroovyExpression newGroovy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Groovy(), newGroovy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroovy(GroovyExpression newGroovy) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Groovy(), newGroovy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GzipDataFormat getGzip() {
		return (GzipDataFormat)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Gzip(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGzip(GzipDataFormat newGzip, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Gzip(), newGzip, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGzip(GzipDataFormat newGzip) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Gzip(), newGzip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderExpression getHeader() {
		return (HeaderExpression)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Header(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(HeaderExpression newHeader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Header(), newHeader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(HeaderExpression newHeader) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Header(), newHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hl7DataFormat getHl7() {
		return (Hl7DataFormat)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Hl7(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHl7(Hl7DataFormat newHl7, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Hl7(), newHl7, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHl7(Hl7DataFormat newHl7) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Hl7(), newHl7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdempotentConsumerDefinition getIdempotentConsumer() {
		return (IdempotentConsumerDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_IdempotentConsumer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdempotentConsumer(IdempotentConsumerDefinition newIdempotentConsumer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_IdempotentConsumer(), newIdempotentConsumer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdempotentConsumer(IdempotentConsumerDefinition newIdempotentConsumer) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_IdempotentConsumer(), newIdempotentConsumer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InOnlyDefinition getInOnly() {
		return (InOnlyDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_InOnly(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInOnly(InOnlyDefinition newInOnly, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_InOnly(), newInOnly, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInOnly(InOnlyDefinition newInOnly) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_InOnly(), newInOnly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InOutDefinition getInOut() {
		return (InOutDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_InOut(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInOut(InOutDefinition newInOut, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_InOut(), newInOut, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInOut(InOutDefinition newInOut) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_InOut(), newInOut);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterceptDefinition getIntercept() {
		return (InterceptDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Intercept(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntercept(InterceptDefinition newIntercept, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Intercept(), newIntercept, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntercept(InterceptDefinition newIntercept) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Intercept(), newIntercept);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterceptFromDefinition getInterceptFrom() {
		return (InterceptFromDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_InterceptFrom(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterceptFrom(InterceptFromDefinition newInterceptFrom, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_InterceptFrom(), newInterceptFrom, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterceptFrom(InterceptFromDefinition newInterceptFrom) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_InterceptFrom(), newInterceptFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterceptSendToEndpointDefinition getInterceptToEndpoint() {
		return (InterceptSendToEndpointDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_InterceptToEndpoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterceptToEndpoint(InterceptSendToEndpointDefinition newInterceptToEndpoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_InterceptToEndpoint(), newInterceptToEndpoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterceptToEndpoint(InterceptSendToEndpointDefinition newInterceptToEndpoint) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_InterceptToEndpoint(), newInterceptToEndpoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaScriptExpression getJavaScript() {
		return (JavaScriptExpression)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_JavaScript(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJavaScript(JavaScriptExpression newJavaScript, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_JavaScript(), newJavaScript, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaScript(JavaScriptExpression newJavaScript) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_JavaScript(), newJavaScript);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JaxbDataFormat getJaxb() {
		return (JaxbDataFormat)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Jaxb(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJaxb(JaxbDataFormat newJaxb, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Jaxb(), newJaxb, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJaxb(JaxbDataFormat newJaxb) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Jaxb(), newJaxb);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JibxDataFormat getJibx() {
		return (JibxDataFormat)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Jibx(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJibx(JibxDataFormat newJibx, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Jibx(), newJibx, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJibx(JibxDataFormat newJibx) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Jibx(), newJibx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelJMXAgentDefinition getJmxAgent() {
		return (CamelJMXAgentDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_JmxAgent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJmxAgent(CamelJMXAgentDefinition newJmxAgent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_JmxAgent(), newJmxAgent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJmxAgent(CamelJMXAgentDefinition newJmxAgent) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_JmxAgent(), newJmxAgent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonDataFormat getJson() {
		return (JsonDataFormat)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Json(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJson(JsonDataFormat newJson, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Json(), newJson, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJson(JsonDataFormat newJson) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Json(), newJson);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JxPathExpression getJxpath() {
		return (JxPathExpression)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Jxpath(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJxpath(JxPathExpression newJxpath, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Jxpath(), newJxpath, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJxpath(JxPathExpression newJxpath) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Jxpath(), newJxpath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyStoreParametersFactoryBean getKeyStoreParameters() {
		return (KeyStoreParametersFactoryBean)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_KeyStoreParameters(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyStoreParameters(KeyStoreParametersFactoryBean newKeyStoreParameters, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_KeyStoreParameters(), newKeyStoreParameters, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyStoreParameters(KeyStoreParametersFactoryBean newKeyStoreParameters) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_KeyStoreParameters(), newKeyStoreParameters);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageExpression getLanguage() {
		return (LanguageExpression)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Language(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(LanguageExpression newLanguage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Language(), newLanguage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(LanguageExpression newLanguage) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Language(), newLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalanceDefinition getLoadBalance() {
		return (LoadBalanceDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_LoadBalance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadBalance(LoadBalanceDefinition newLoadBalance, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_LoadBalance(), newLoadBalance, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadBalance(LoadBalanceDefinition newLoadBalance) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_LoadBalance(), newLoadBalance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogDefinition getLog() {
		return (LogDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Log(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLog(LogDefinition newLog, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Log(), newLog, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLog(LogDefinition newLog) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Log(), newLog);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopDefinition getLoop() {
		return (LoopDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Loop(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoop(LoopDefinition newLoop, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Loop(), newLoop, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoop(LoopDefinition newLoop) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Loop(), newLoop);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarshalDefinition getMarshal() {
		return (MarshalDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Marshal(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarshal(MarshalDefinition newMarshal, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Marshal(), newMarshal, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarshal(MarshalDefinition newMarshal) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Marshal(), newMarshal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCallExpression getMethod() {
		return (MethodCallExpression)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Method(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(MethodCallExpression newMethod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Method(), newMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(MethodCallExpression newMethod) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Method(), newMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MulticastDefinition getMulticast() {
		return (MulticastDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Multicast(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMulticast(MulticastDefinition newMulticast, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Multicast(), newMulticast, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMulticast(MulticastDefinition newMulticast) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Multicast(), newMulticast);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MvelExpression getMvel() {
		return (MvelExpression)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Mvel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMvel(MvelExpression newMvel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Mvel(), newMvel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMvel(MvelExpression newMvel) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Mvel(), newMvel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OgnlExpression getOgnl() {
		return (OgnlExpression)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Ognl(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOgnl(OgnlExpression newOgnl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Ognl(), newOgnl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOgnl(OgnlExpression newOgnl) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Ognl(), newOgnl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnCompletionDefinition getOnCompletion() {
		return (OnCompletionDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_OnCompletion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnCompletion(OnCompletionDefinition newOnCompletion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_OnCompletion(), newOnCompletion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnCompletion(OnCompletionDefinition newOnCompletion) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_OnCompletion(), newOnCompletion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnExceptionDefinition getOnException() {
		return (OnExceptionDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_OnException(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnException(OnExceptionDefinition newOnException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_OnException(), newOnException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnException(OnExceptionDefinition newOnException) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_OnException(), newOnException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherwiseDefinition getOtherwise() {
		return (OtherwiseDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Otherwise(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtherwise(OtherwiseDefinition newOtherwise, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Otherwise(), newOtherwise, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherwise(OtherwiseDefinition newOtherwise) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Otherwise(), newOtherwise);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageScanDefinition getPackageScan() {
		return (PackageScanDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_PackageScan(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackageScan(PackageScanDefinition newPackageScan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_PackageScan(), newPackageScan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageScan(PackageScanDefinition newPackageScan) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_PackageScan(), newPackageScan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhpExpression getPhp() {
		return (PhpExpression)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Php(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhp(PhpExpression newPhp, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Php(), newPhp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhp(PhpExpression newPhp) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Php(), newPhp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelineDefinition getPipeline() {
		return (PipelineDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Pipeline(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPipeline(PipelineDefinition newPipeline, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Pipeline(), newPipeline, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPipeline(PipelineDefinition newPipeline) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Pipeline(), newPipeline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyDefinition getPolicy() {
		return (PolicyDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Policy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicy(PolicyDefinition newPolicy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Policy(), newPolicy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicy(PolicyDefinition newPolicy) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Policy(), newPolicy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PollEnrichDefinition getPollEnrich() {
		return (PollEnrichDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_PollEnrich(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPollEnrich(PollEnrichDefinition newPollEnrich, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_PollEnrich(), newPollEnrich, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPollEnrich(PollEnrichDefinition newPollEnrich) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_PollEnrich(), newPollEnrich);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessDefinition getProcess() {
		return (ProcessDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Process(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcess(ProcessDefinition newProcess, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Process(), newProcess, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(ProcessDefinition newProcess) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Process(), newProcess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesDefinition getProperties() {
		return (PropertiesDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Properties(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(PropertiesDefinition newProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Properties(), newProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(PropertiesDefinition newProperties) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Properties(), newProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getProperty() {
		return (EObject)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Property(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(EObject newProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Property(), newProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(EObject newProperty) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Property(), newProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelPropertyPlaceholderDefinition getPropertyPlaceholder() {
		return (CamelPropertyPlaceholderDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_PropertyPlaceholder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyPlaceholder(CamelPropertyPlaceholderDefinition newPropertyPlaceholder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_PropertyPlaceholder(), newPropertyPlaceholder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyPlaceholder(CamelPropertyPlaceholderDefinition newPropertyPlaceholder) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_PropertyPlaceholder(), newPropertyPlaceholder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtobufDataFormat getProtobuf() {
		return (ProtobufDataFormat)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Protobuf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtobuf(ProtobufDataFormat newProtobuf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Protobuf(), newProtobuf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtobuf(ProtobufDataFormat newProtobuf) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Protobuf(), newProtobuf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelProxyFactoryDefinition getProxy() {
		return (CamelProxyFactoryDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Proxy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProxy(CamelProxyFactoryDefinition newProxy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Proxy(), newProxy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProxy(CamelProxyFactoryDefinition newProxy) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Proxy(), newProxy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PythonExpression getPython() {
		return (PythonExpression)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Python(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPython(PythonExpression newPython, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Python(), newPython, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPython(PythonExpression newPython) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Python(), newPython);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RandomLoadBalancerDefinition getRandom() {
		return (RandomLoadBalancerDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Random(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRandom(RandomLoadBalancerDefinition newRandom, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Random(), newRandom, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRandom(RandomLoadBalancerDefinition newRandom) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Random(), newRandom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipientListDefinition getRecipientList() {
		return (RecipientListDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_RecipientList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecipientList(RecipientListDefinition newRecipientList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_RecipientList(), newRecipientList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipientList(RecipientListDefinition newRecipientList) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_RecipientList(), newRecipientList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedeliveryPolicyDefinition getRedeliveryPolicy() {
		return (RedeliveryPolicyDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_RedeliveryPolicy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRedeliveryPolicy(RedeliveryPolicyDefinition newRedeliveryPolicy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_RedeliveryPolicy(), newRedeliveryPolicy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedeliveryPolicy(RedeliveryPolicyDefinition newRedeliveryPolicy) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_RedeliveryPolicy(), newRedeliveryPolicy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelRedeliveryPolicyFactoryBean getRedeliveryPolicyProfile() {
		return (CamelRedeliveryPolicyFactoryBean)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_RedeliveryPolicyProfile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRedeliveryPolicyProfile(CamelRedeliveryPolicyFactoryBean newRedeliveryPolicyProfile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_RedeliveryPolicyProfile(), newRedeliveryPolicyProfile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedeliveryPolicyProfile(CamelRedeliveryPolicyFactoryBean newRedeliveryPolicyProfile) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_RedeliveryPolicyProfile(), newRedeliveryPolicyProfile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefExpression getRef() {
		return (RefExpression)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Ref(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRef(RefExpression newRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Ref(), newRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(RefExpression newRef) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Ref(), newRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveHeaderDefinition getRemoveHeader() {
		return (RemoveHeaderDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_RemoveHeader(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoveHeader(RemoveHeaderDefinition newRemoveHeader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_RemoveHeader(), newRemoveHeader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveHeader(RemoveHeaderDefinition newRemoveHeader) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_RemoveHeader(), newRemoveHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveHeadersDefinition getRemoveHeaders() {
		return (RemoveHeadersDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_RemoveHeaders(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoveHeaders(RemoveHeadersDefinition newRemoveHeaders, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_RemoveHeaders(), newRemoveHeaders, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveHeaders(RemoveHeadersDefinition newRemoveHeaders) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_RemoveHeaders(), newRemoveHeaders);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemovePropertyDefinition getRemoveProperty() {
		return (RemovePropertyDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_RemoveProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoveProperty(RemovePropertyDefinition newRemoveProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_RemoveProperty(), newRemoveProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveProperty(RemovePropertyDefinition newRemoveProperty) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_RemoveProperty(), newRemoveProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResequenceDefinition getResequence() {
		return (ResequenceDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Resequence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResequence(ResequenceDefinition newResequence, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Resequence(), newResequence, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResequence(ResequenceDefinition newResequence) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Resequence(), newResequence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RollbackDefinition getRollback() {
		return (RollbackDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Rollback(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRollback(RollbackDefinition newRollback, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Rollback(), newRollback, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRollback(RollbackDefinition newRollback) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Rollback(), newRollback);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoundRobinLoadBalancerDefinition getRoundRobin() {
		return (RoundRobinLoadBalancerDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_RoundRobin(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoundRobin(RoundRobinLoadBalancerDefinition newRoundRobin, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_RoundRobin(), newRoundRobin, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoundRobin(RoundRobinLoadBalancerDefinition newRoundRobin) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_RoundRobin(), newRoundRobin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteDefinition getRoute() {
		return (RouteDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Route(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoute(RouteDefinition newRoute, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Route(), newRoute, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(RouteDefinition newRoute) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Route(), newRoute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteBuilderDefinition getRouteBuilder() {
		return (RouteBuilderDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_RouteBuilder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteBuilder(RouteBuilderDefinition newRouteBuilder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_RouteBuilder(), newRouteBuilder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteBuilder(RouteBuilderDefinition newRouteBuilder) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_RouteBuilder(), newRouteBuilder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelRouteContextFactoryBean getRouteContext() {
		return (CamelRouteContextFactoryBean)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_RouteContext(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteContext(CamelRouteContextFactoryBean newRouteContext, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_RouteContext(), newRouteContext, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteContext(CamelRouteContextFactoryBean newRouteContext) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_RouteContext(), newRouteContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteContextRefDefinition getRouteContextRef() {
		return (RouteContextRefDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_RouteContextRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteContextRef(RouteContextRefDefinition newRouteContextRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_RouteContextRef(), newRouteContextRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteContextRef(RouteContextRefDefinition newRouteContextRef) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_RouteContextRef(), newRouteContextRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutesDefinition getRoutes() {
		return (RoutesDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Routes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoutes(RoutesDefinition newRoutes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Routes(), newRoutes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoutes(RoutesDefinition newRoutes) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Routes(), newRoutes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutingSlipDefinition getRoutingSlip() {
		return (RoutingSlipDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_RoutingSlip(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoutingSlip(RoutingSlipDefinition newRoutingSlip, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_RoutingSlip(), newRoutingSlip, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoutingSlip(RoutingSlipDefinition newRoutingSlip) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_RoutingSlip(), newRoutingSlip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RssDataFormat getRss() {
		return (RssDataFormat)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Rss(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRss(RssDataFormat newRss, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Rss(), newRss, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRss(RssDataFormat newRss) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Rss(), newRss);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyExpression getRuby() {
		return (RubyExpression)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Ruby(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuby(RubyExpression newRuby, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Ruby(), newRuby, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuby(RubyExpression newRuby) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Ruby(), newRuby);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SamplingDefinition getSample() {
		return (SamplingDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Sample(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSample(SamplingDefinition newSample, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Sample(), newSample, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSample(SamplingDefinition newSample) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Sample(), newSample);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecureRandomParametersFactoryBean getSecureRandomParameters() {
		return (SecureRandomParametersFactoryBean)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_SecureRandomParameters(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecureRandomParameters(SecureRandomParametersFactoryBean newSecureRandomParameters, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_SecureRandomParameters(), newSecureRandomParameters, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecureRandomParameters(SecureRandomParametersFactoryBean newSecureRandomParameters) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_SecureRandomParameters(), newSecureRandomParameters);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlSecurityDataFormat getSecureXML() {
		return (XmlSecurityDataFormat)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_SecureXML(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecureXML(XmlSecurityDataFormat newSecureXML, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_SecureXML(), newSecureXML, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecureXML(XmlSecurityDataFormat newSecureXML) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_SecureXML(), newSecureXML);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializationDataFormat getSerialization() {
		return (SerializationDataFormat)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Serialization(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSerialization(SerializationDataFormat newSerialization, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Serialization(), newSerialization, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerialization(SerializationDataFormat newSerialization) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Serialization(), newSerialization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetBodyDefinition getSetBody() {
		return (SetBodyDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_SetBody(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetBody(SetBodyDefinition newSetBody, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_SetBody(), newSetBody, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetBody(SetBodyDefinition newSetBody) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_SetBody(), newSetBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetExchangePatternDefinition getSetExchangePattern() {
		return (SetExchangePatternDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_SetExchangePattern(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetExchangePattern(SetExchangePatternDefinition newSetExchangePattern, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_SetExchangePattern(), newSetExchangePattern, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetExchangePattern(SetExchangePatternDefinition newSetExchangePattern) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_SetExchangePattern(), newSetExchangePattern);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetFaultBodyDefinition getSetFaultBody() {
		return (SetFaultBodyDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_SetFaultBody(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetFaultBody(SetFaultBodyDefinition newSetFaultBody, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_SetFaultBody(), newSetFaultBody, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetFaultBody(SetFaultBodyDefinition newSetFaultBody) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_SetFaultBody(), newSetFaultBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetHeaderDefinition getSetHeader() {
		return (SetHeaderDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_SetHeader(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetHeader(SetHeaderDefinition newSetHeader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_SetHeader(), newSetHeader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetHeader(SetHeaderDefinition newSetHeader) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_SetHeader(), newSetHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetOutHeaderDefinition getSetOutHeader() {
		return (SetOutHeaderDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_SetOutHeader(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetOutHeader(SetOutHeaderDefinition newSetOutHeader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_SetOutHeader(), newSetOutHeader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetOutHeader(SetOutHeaderDefinition newSetOutHeader) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_SetOutHeader(), newSetOutHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetPropertyDefinition getSetProperty() {
		return (SetPropertyDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_SetProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetProperty(SetPropertyDefinition newSetProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_SetProperty(), newSetProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetProperty(SetPropertyDefinition newSetProperty) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_SetProperty(), newSetProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleExpression getSimple() {
		return (SimpleExpression)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Simple(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimple(SimpleExpression newSimple, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Simple(), newSimple, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimple(SimpleExpression newSimple) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Simple(), newSimple);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoapJaxbDataFormat getSoapjaxb() {
		return (SoapJaxbDataFormat)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Soapjaxb(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoapjaxb(SoapJaxbDataFormat newSoapjaxb, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Soapjaxb(), newSoapjaxb, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoapjaxb(SoapJaxbDataFormat newSoapjaxb) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Soapjaxb(), newSoapjaxb);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortDefinition getSort() {
		return (SortDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Sort(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSort(SortDefinition newSort, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Sort(), newSort, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSort(SortDefinition newSort) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Sort(), newSort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpELExpression getSpel() {
		return (SpELExpression)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Spel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpel(SpELExpression newSpel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Spel(), newSpel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpel(SpELExpression newSpel) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Spel(), newSpel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitDefinition getSplit() {
		return (SplitDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Split(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSplit(SplitDefinition newSplit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Split(), newSplit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSplit(SplitDefinition newSplit) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Split(), newSplit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlExpression getSql() {
		return (SqlExpression)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Sql(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSql(SqlExpression newSql, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Sql(), newSql, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSql(SqlExpression newSql) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Sql(), newSql);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SslContextParametersFactoryBean getSslContextParameters() {
		return (SslContextParametersFactoryBean)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_SslContextParameters(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSslContextParameters(SslContextParametersFactoryBean newSslContextParameters, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_SslContextParameters(), newSslContextParameters, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSslContextParameters(SslContextParametersFactoryBean newSslContextParameters) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_SslContextParameters(), newSslContextParameters);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StickyLoadBalancerDefinition getSticky() {
		return (StickyLoadBalancerDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Sticky(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSticky(StickyLoadBalancerDefinition newSticky, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Sticky(), newSticky, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSticky(StickyLoadBalancerDefinition newSticky) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Sticky(), newSticky);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopDefinition getStop() {
		return (StopDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Stop(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStop(StopDefinition newStop, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Stop(), newStop, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStop(StopDefinition newStop) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Stop(), newStop);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamResequencerConfig getStreamResequencerConfig() {
		return (StreamResequencerConfig)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_StreamResequencerConfig(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStreamResequencerConfig(StreamResequencerConfig newStreamResequencerConfig, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_StreamResequencerConfig(), newStreamResequencerConfig, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreamResequencerConfig(StreamResequencerConfig newStreamResequencerConfig) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_StreamResequencerConfig(), newStreamResequencerConfig);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringDataFormat getString() {
		return (StringDataFormat)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_String(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetString(StringDataFormat newString, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_String(), newString, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setString(StringDataFormat newString) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_String(), newString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyslogDataFormat getSyslog() {
		return (SyslogDataFormat)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Syslog(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSyslog(SyslogDataFormat newSyslog, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Syslog(), newSyslog, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyslog(SyslogDataFormat newSyslog) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Syslog(), newSyslog);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelProducerTemplateFactoryBean getTemplate() {
		return (CamelProducerTemplateFactoryBean)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Template(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(CamelProducerTemplateFactoryBean newTemplate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Template(), newTemplate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(CamelProducerTemplateFactoryBean newTemplate) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Template(), newTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelThreadPoolFactoryBean getThreadPool() {
		return (CamelThreadPoolFactoryBean)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_ThreadPool(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThreadPool(CamelThreadPoolFactoryBean newThreadPool, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_ThreadPool(), newThreadPool, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadPool(CamelThreadPoolFactoryBean newThreadPool) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_ThreadPool(), newThreadPool);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadPoolProfileDefinition getThreadPoolProfile() {
		return (ThreadPoolProfileDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_ThreadPoolProfile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThreadPoolProfile(ThreadPoolProfileDefinition newThreadPoolProfile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_ThreadPoolProfile(), newThreadPoolProfile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadPoolProfile(ThreadPoolProfileDefinition newThreadPoolProfile) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_ThreadPoolProfile(), newThreadPoolProfile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadsDefinition getThreads() {
		return (ThreadsDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Threads(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThreads(ThreadsDefinition newThreads, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Threads(), newThreads, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreads(ThreadsDefinition newThreads) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Threads(), newThreads);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrottleDefinition getThrottle() {
		return (ThrottleDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Throttle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrottle(ThrottleDefinition newThrottle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Throttle(), newThrottle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThrottle(ThrottleDefinition newThrottle) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Throttle(), newThrottle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrowExceptionDefinition getThrowException() {
		return (ThrowExceptionDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_ThrowException(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrowException(ThrowExceptionDefinition newThrowException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_ThrowException(), newThrowException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThrowException(ThrowExceptionDefinition newThrowException) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_ThrowException(), newThrowException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TidyMarkupDataFormat getTidyMarkup() {
		return (TidyMarkupDataFormat)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_TidyMarkup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTidyMarkup(TidyMarkupDataFormat newTidyMarkup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_TidyMarkup(), newTidyMarkup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTidyMarkup(TidyMarkupDataFormat newTidyMarkup) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_TidyMarkup(), newTidyMarkup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToDefinition getTo() {
		return (ToDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_To(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(ToDefinition newTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_To(), newTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(ToDefinition newTo) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_To(), newTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenizerExpression getTokenize() {
		return (TokenizerExpression)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Tokenize(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTokenize(TokenizerExpression newTokenize, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Tokenize(), newTokenize, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenize(TokenizerExpression newTokenize) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Tokenize(), newTokenize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopicLoadBalancerDefinition getTopic() {
		return (TopicLoadBalancerDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Topic(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopic(TopicLoadBalancerDefinition newTopic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Topic(), newTopic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopic(TopicLoadBalancerDefinition newTopic) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Topic(), newTopic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactedDefinition getTransacted() {
		return (TransactedDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Transacted(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransacted(TransactedDefinition newTransacted, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Transacted(), newTransacted, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransacted(TransactedDefinition newTransacted) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Transacted(), newTransacted);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformDefinition getTransform() {
		return (TransformDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Transform(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransform(TransformDefinition newTransform, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Transform(), newTransform, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(TransformDefinition newTransform) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Transform(), newTransform);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnmarshalDefinition getUnmarshal() {
		return (UnmarshalDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Unmarshal(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnmarshal(UnmarshalDefinition newUnmarshal, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Unmarshal(), newUnmarshal, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnmarshal(UnmarshalDefinition newUnmarshal) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Unmarshal(), newUnmarshal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidateDefinition getValidate() {
		return (ValidateDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Validate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidate(ValidateDefinition newValidate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Validate(), newValidate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidate(ValidateDefinition newValidate) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Validate(), newValidate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeightedLoadBalancerDefinition getWeighted() {
		return (WeightedLoadBalancerDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Weighted(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeighted(WeightedLoadBalancerDefinition newWeighted, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Weighted(), newWeighted, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeighted(WeightedLoadBalancerDefinition newWeighted) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Weighted(), newWeighted);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhenDefinition getWhen() {
		return (WhenDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_When(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhen(WhenDefinition newWhen, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_When(), newWhen, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(WhenDefinition newWhen) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_When(), newWhen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireTapDefinition getWireTap() {
		return (WireTapDefinition)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_WireTap(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWireTap(WireTapDefinition newWireTap, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_WireTap(), newWireTap, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWireTap(WireTapDefinition newWireTap) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_WireTap(), newWireTap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlBeansDataFormat getXmlBeans() {
		return (XmlBeansDataFormat)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_XmlBeans(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmlBeans(XmlBeansDataFormat newXmlBeans, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_XmlBeans(), newXmlBeans, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmlBeans(XmlBeansDataFormat newXmlBeans) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_XmlBeans(), newXmlBeans);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPathExpression getXpath() {
		return (XPathExpression)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Xpath(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXpath(XPathExpression newXpath, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Xpath(), newXpath, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXpath(XPathExpression newXpath) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Xpath(), newXpath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XQueryExpression getXquery() {
		return (XQueryExpression)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Xquery(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXquery(XQueryExpression newXquery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Xquery(), newXquery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXquery(XQueryExpression newXquery) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Xquery(), newXquery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XStreamDataFormat getXstream() {
		return (XStreamDataFormat)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Xstream(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXstream(XStreamDataFormat newXstream, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Xstream(), newXstream, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXstream(XStreamDataFormat newXstream) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Xstream(), newXstream);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZipDataFormat getZip() {
		return (ZipDataFormat)getMixed().get(SpringPackage.eINSTANCE.getDocumentRoot_Zip(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZip(ZipDataFormat newZip, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpringPackage.eINSTANCE.getDocumentRoot_Zip(), newZip, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZip(ZipDataFormat newZip) {
		((FeatureMap.Internal)getMixed()).set(SpringPackage.eINSTANCE.getDocumentRoot_Zip(), newZip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpringPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SpringPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case SpringPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case SpringPackage.DOCUMENT_ROOT__AGGREGATE:
				return basicSetAggregate(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__AOP:
				return basicSetAop(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__BATCH_RESEQUENCER_CONFIG:
				return basicSetBatchResequencerConfig(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__BEAN:
				return basicSetBean(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__BEAN_POST_PROCESSOR:
				return basicSetBeanPostProcessor(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__BINDY:
				return basicSetBindy(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__CAMEL_CONTEXT:
				return basicSetCamelContext(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__CASTOR:
				return basicSetCastor(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__CHOICE:
				return basicSetChoice(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__CONSTANT:
				return basicSetConstant(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__CONSUMER_TEMPLATE:
				return basicSetConsumerTemplate(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__CONTEXT_SCAN:
				return basicSetContextScan(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__CONVERT_BODY_TO:
				return basicSetConvertBodyTo(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__CRYPTO:
				return basicSetCrypto(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__CSV:
				return basicSetCsv(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__CUSTOM_DATA_FORMAT:
				return basicSetCustomDataFormat(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__CUSTOM_LOAD_BALANCER:
				return basicSetCustomLoadBalancer(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__DATA_FORMATS:
				return basicSetDataFormats(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__DELAY:
				return basicSetDelay(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__DO_CATCH:
				return basicSetDoCatch(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__DO_FINALLY:
				return basicSetDoFinally(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__DO_TRY:
				return basicSetDoTry(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__DYNAMIC_ROUTER:
				return basicSetDynamicRouter(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__EL:
				return basicSetEl(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__ENDPOINT:
				return basicSetEndpoint(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__ENRICH:
				return basicSetEnrich(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__ERROR_HANDLER:
				return basicSetErrorHandler(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__EXPORT:
				return basicSetExport(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__EXPRESSION:
				return basicSetExpression(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__EXPRESSION_DEFINITION:
				return basicSetExpressionDefinition(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__FAILOVER:
				return basicSetFailover(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__FILTER:
				return basicSetFilter(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__FLATPACK:
				return basicSetFlatpack(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__FROM:
				return basicSetFrom(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__GROOVY:
				return basicSetGroovy(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__GZIP:
				return basicSetGzip(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__HEADER:
				return basicSetHeader(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__HL7:
				return basicSetHl7(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__IDEMPOTENT_CONSUMER:
				return basicSetIdempotentConsumer(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__IN_ONLY:
				return basicSetInOnly(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__IN_OUT:
				return basicSetInOut(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__INTERCEPT:
				return basicSetIntercept(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__INTERCEPT_FROM:
				return basicSetInterceptFrom(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__INTERCEPT_TO_ENDPOINT:
				return basicSetInterceptToEndpoint(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__JAVA_SCRIPT:
				return basicSetJavaScript(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__JAXB:
				return basicSetJaxb(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__JIBX:
				return basicSetJibx(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__JMX_AGENT:
				return basicSetJmxAgent(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__JSON:
				return basicSetJson(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__JXPATH:
				return basicSetJxpath(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__KEY_STORE_PARAMETERS:
				return basicSetKeyStoreParameters(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__LANGUAGE:
				return basicSetLanguage(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__LOAD_BALANCE:
				return basicSetLoadBalance(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__LOG:
				return basicSetLog(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__LOOP:
				return basicSetLoop(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__MARSHAL:
				return basicSetMarshal(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__METHOD:
				return basicSetMethod(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__MULTICAST:
				return basicSetMulticast(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__MVEL:
				return basicSetMvel(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__OGNL:
				return basicSetOgnl(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__ON_COMPLETION:
				return basicSetOnCompletion(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__ON_EXCEPTION:
				return basicSetOnException(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__OTHERWISE:
				return basicSetOtherwise(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__PACKAGE_SCAN:
				return basicSetPackageScan(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__PHP:
				return basicSetPhp(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__PIPELINE:
				return basicSetPipeline(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__POLICY:
				return basicSetPolicy(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__POLL_ENRICH:
				return basicSetPollEnrich(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__PROCESS:
				return basicSetProcess(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__PROPERTIES:
				return basicSetProperties(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__PROPERTY:
				return basicSetProperty(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__PROPERTY_PLACEHOLDER:
				return basicSetPropertyPlaceholder(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__PROTOBUF:
				return basicSetProtobuf(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__PROXY:
				return basicSetProxy(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__PYTHON:
				return basicSetPython(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__RANDOM:
				return basicSetRandom(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__RECIPIENT_LIST:
				return basicSetRecipientList(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__REDELIVERY_POLICY:
				return basicSetRedeliveryPolicy(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__REDELIVERY_POLICY_PROFILE:
				return basicSetRedeliveryPolicyProfile(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__REF:
				return basicSetRef(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__REMOVE_HEADER:
				return basicSetRemoveHeader(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__REMOVE_HEADERS:
				return basicSetRemoveHeaders(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__REMOVE_PROPERTY:
				return basicSetRemoveProperty(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__RESEQUENCE:
				return basicSetResequence(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__ROLLBACK:
				return basicSetRollback(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__ROUND_ROBIN:
				return basicSetRoundRobin(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__ROUTE:
				return basicSetRoute(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__ROUTE_BUILDER:
				return basicSetRouteBuilder(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__ROUTE_CONTEXT:
				return basicSetRouteContext(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__ROUTE_CONTEXT_REF:
				return basicSetRouteContextRef(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__ROUTES:
				return basicSetRoutes(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__ROUTING_SLIP:
				return basicSetRoutingSlip(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__RSS:
				return basicSetRss(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__RUBY:
				return basicSetRuby(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__SAMPLE:
				return basicSetSample(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__SECURE_RANDOM_PARAMETERS:
				return basicSetSecureRandomParameters(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__SECURE_XML:
				return basicSetSecureXML(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__SERIALIZATION:
				return basicSetSerialization(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__SET_BODY:
				return basicSetSetBody(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__SET_EXCHANGE_PATTERN:
				return basicSetSetExchangePattern(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__SET_FAULT_BODY:
				return basicSetSetFaultBody(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__SET_HEADER:
				return basicSetSetHeader(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__SET_OUT_HEADER:
				return basicSetSetOutHeader(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__SET_PROPERTY:
				return basicSetSetProperty(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__SIMPLE:
				return basicSetSimple(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__SOAPJAXB:
				return basicSetSoapjaxb(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__SORT:
				return basicSetSort(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__SPEL:
				return basicSetSpel(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__SPLIT:
				return basicSetSplit(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__SQL:
				return basicSetSql(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__SSL_CONTEXT_PARAMETERS:
				return basicSetSslContextParameters(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__STICKY:
				return basicSetSticky(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__STOP:
				return basicSetStop(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__STREAM_RESEQUENCER_CONFIG:
				return basicSetStreamResequencerConfig(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__STRING:
				return basicSetString(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__SYSLOG:
				return basicSetSyslog(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__TEMPLATE:
				return basicSetTemplate(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__THREAD_POOL:
				return basicSetThreadPool(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__THREAD_POOL_PROFILE:
				return basicSetThreadPoolProfile(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__THREADS:
				return basicSetThreads(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__THROTTLE:
				return basicSetThrottle(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__THROW_EXCEPTION:
				return basicSetThrowException(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__TIDY_MARKUP:
				return basicSetTidyMarkup(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__TO:
				return basicSetTo(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__TOKENIZE:
				return basicSetTokenize(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__TOPIC:
				return basicSetTopic(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__TRANSACTED:
				return basicSetTransacted(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__TRANSFORM:
				return basicSetTransform(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__UNMARSHAL:
				return basicSetUnmarshal(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__VALIDATE:
				return basicSetValidate(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__WEIGHTED:
				return basicSetWeighted(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__WHEN:
				return basicSetWhen(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__WIRE_TAP:
				return basicSetWireTap(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__XML_BEANS:
				return basicSetXmlBeans(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__XPATH:
				return basicSetXpath(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__XQUERY:
				return basicSetXquery(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__XSTREAM:
				return basicSetXstream(null, msgs);
			case SpringPackage.DOCUMENT_ROOT__ZIP:
				return basicSetZip(null, msgs);
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
			case SpringPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SpringPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case SpringPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case SpringPackage.DOCUMENT_ROOT__AGGREGATE:
				return getAggregate();
			case SpringPackage.DOCUMENT_ROOT__AOP:
				return getAop();
			case SpringPackage.DOCUMENT_ROOT__BATCH_RESEQUENCER_CONFIG:
				return getBatchResequencerConfig();
			case SpringPackage.DOCUMENT_ROOT__BEAN:
				return getBean();
			case SpringPackage.DOCUMENT_ROOT__BEAN_POST_PROCESSOR:
				return getBeanPostProcessor();
			case SpringPackage.DOCUMENT_ROOT__BINDY:
				return getBindy();
			case SpringPackage.DOCUMENT_ROOT__CAMEL_CONTEXT:
				return getCamelContext();
			case SpringPackage.DOCUMENT_ROOT__CASTOR:
				return getCastor();
			case SpringPackage.DOCUMENT_ROOT__CHOICE:
				return getChoice();
			case SpringPackage.DOCUMENT_ROOT__CONSTANT:
				return getConstant();
			case SpringPackage.DOCUMENT_ROOT__CONSUMER_TEMPLATE:
				return getConsumerTemplate();
			case SpringPackage.DOCUMENT_ROOT__CONTEXT_SCAN:
				return getContextScan();
			case SpringPackage.DOCUMENT_ROOT__CONVERT_BODY_TO:
				return getConvertBodyTo();
			case SpringPackage.DOCUMENT_ROOT__CRYPTO:
				return getCrypto();
			case SpringPackage.DOCUMENT_ROOT__CSV:
				return getCsv();
			case SpringPackage.DOCUMENT_ROOT__CUSTOM_DATA_FORMAT:
				return getCustomDataFormat();
			case SpringPackage.DOCUMENT_ROOT__CUSTOM_LOAD_BALANCER:
				return getCustomLoadBalancer();
			case SpringPackage.DOCUMENT_ROOT__DATA_FORMATS:
				return getDataFormats();
			case SpringPackage.DOCUMENT_ROOT__DELAY:
				return getDelay();
			case SpringPackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case SpringPackage.DOCUMENT_ROOT__DO_CATCH:
				return getDoCatch();
			case SpringPackage.DOCUMENT_ROOT__DO_FINALLY:
				return getDoFinally();
			case SpringPackage.DOCUMENT_ROOT__DO_TRY:
				return getDoTry();
			case SpringPackage.DOCUMENT_ROOT__DYNAMIC_ROUTER:
				return getDynamicRouter();
			case SpringPackage.DOCUMENT_ROOT__EL:
				return getEl();
			case SpringPackage.DOCUMENT_ROOT__ENDPOINT:
				return getEndpoint();
			case SpringPackage.DOCUMENT_ROOT__ENRICH:
				return getEnrich();
			case SpringPackage.DOCUMENT_ROOT__ERROR_HANDLER:
				return getErrorHandler();
			case SpringPackage.DOCUMENT_ROOT__EXPORT:
				return getExport();
			case SpringPackage.DOCUMENT_ROOT__EXPRESSION:
				return getExpression();
			case SpringPackage.DOCUMENT_ROOT__EXPRESSION_DEFINITION:
				return getExpressionDefinition();
			case SpringPackage.DOCUMENT_ROOT__FAILOVER:
				return getFailover();
			case SpringPackage.DOCUMENT_ROOT__FILTER:
				return getFilter();
			case SpringPackage.DOCUMENT_ROOT__FLATPACK:
				return getFlatpack();
			case SpringPackage.DOCUMENT_ROOT__FROM:
				return getFrom();
			case SpringPackage.DOCUMENT_ROOT__GROOVY:
				return getGroovy();
			case SpringPackage.DOCUMENT_ROOT__GZIP:
				return getGzip();
			case SpringPackage.DOCUMENT_ROOT__HEADER:
				return getHeader();
			case SpringPackage.DOCUMENT_ROOT__HL7:
				return getHl7();
			case SpringPackage.DOCUMENT_ROOT__IDEMPOTENT_CONSUMER:
				return getIdempotentConsumer();
			case SpringPackage.DOCUMENT_ROOT__IN_ONLY:
				return getInOnly();
			case SpringPackage.DOCUMENT_ROOT__IN_OUT:
				return getInOut();
			case SpringPackage.DOCUMENT_ROOT__INTERCEPT:
				return getIntercept();
			case SpringPackage.DOCUMENT_ROOT__INTERCEPT_FROM:
				return getInterceptFrom();
			case SpringPackage.DOCUMENT_ROOT__INTERCEPT_TO_ENDPOINT:
				return getInterceptToEndpoint();
			case SpringPackage.DOCUMENT_ROOT__JAVA_SCRIPT:
				return getJavaScript();
			case SpringPackage.DOCUMENT_ROOT__JAXB:
				return getJaxb();
			case SpringPackage.DOCUMENT_ROOT__JIBX:
				return getJibx();
			case SpringPackage.DOCUMENT_ROOT__JMX_AGENT:
				return getJmxAgent();
			case SpringPackage.DOCUMENT_ROOT__JSON:
				return getJson();
			case SpringPackage.DOCUMENT_ROOT__JXPATH:
				return getJxpath();
			case SpringPackage.DOCUMENT_ROOT__KEY_STORE_PARAMETERS:
				return getKeyStoreParameters();
			case SpringPackage.DOCUMENT_ROOT__LANGUAGE:
				return getLanguage();
			case SpringPackage.DOCUMENT_ROOT__LOAD_BALANCE:
				return getLoadBalance();
			case SpringPackage.DOCUMENT_ROOT__LOG:
				return getLog();
			case SpringPackage.DOCUMENT_ROOT__LOOP:
				return getLoop();
			case SpringPackage.DOCUMENT_ROOT__MARSHAL:
				return getMarshal();
			case SpringPackage.DOCUMENT_ROOT__METHOD:
				return getMethod();
			case SpringPackage.DOCUMENT_ROOT__MULTICAST:
				return getMulticast();
			case SpringPackage.DOCUMENT_ROOT__MVEL:
				return getMvel();
			case SpringPackage.DOCUMENT_ROOT__OGNL:
				return getOgnl();
			case SpringPackage.DOCUMENT_ROOT__ON_COMPLETION:
				return getOnCompletion();
			case SpringPackage.DOCUMENT_ROOT__ON_EXCEPTION:
				return getOnException();
			case SpringPackage.DOCUMENT_ROOT__OTHERWISE:
				return getOtherwise();
			case SpringPackage.DOCUMENT_ROOT__PACKAGE_SCAN:
				return getPackageScan();
			case SpringPackage.DOCUMENT_ROOT__PHP:
				return getPhp();
			case SpringPackage.DOCUMENT_ROOT__PIPELINE:
				return getPipeline();
			case SpringPackage.DOCUMENT_ROOT__POLICY:
				return getPolicy();
			case SpringPackage.DOCUMENT_ROOT__POLL_ENRICH:
				return getPollEnrich();
			case SpringPackage.DOCUMENT_ROOT__PROCESS:
				return getProcess();
			case SpringPackage.DOCUMENT_ROOT__PROPERTIES:
				return getProperties();
			case SpringPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty();
			case SpringPackage.DOCUMENT_ROOT__PROPERTY_PLACEHOLDER:
				return getPropertyPlaceholder();
			case SpringPackage.DOCUMENT_ROOT__PROTOBUF:
				return getProtobuf();
			case SpringPackage.DOCUMENT_ROOT__PROXY:
				return getProxy();
			case SpringPackage.DOCUMENT_ROOT__PYTHON:
				return getPython();
			case SpringPackage.DOCUMENT_ROOT__RANDOM:
				return getRandom();
			case SpringPackage.DOCUMENT_ROOT__RECIPIENT_LIST:
				return getRecipientList();
			case SpringPackage.DOCUMENT_ROOT__REDELIVERY_POLICY:
				return getRedeliveryPolicy();
			case SpringPackage.DOCUMENT_ROOT__REDELIVERY_POLICY_PROFILE:
				return getRedeliveryPolicyProfile();
			case SpringPackage.DOCUMENT_ROOT__REF:
				return getRef();
			case SpringPackage.DOCUMENT_ROOT__REMOVE_HEADER:
				return getRemoveHeader();
			case SpringPackage.DOCUMENT_ROOT__REMOVE_HEADERS:
				return getRemoveHeaders();
			case SpringPackage.DOCUMENT_ROOT__REMOVE_PROPERTY:
				return getRemoveProperty();
			case SpringPackage.DOCUMENT_ROOT__RESEQUENCE:
				return getResequence();
			case SpringPackage.DOCUMENT_ROOT__ROLLBACK:
				return getRollback();
			case SpringPackage.DOCUMENT_ROOT__ROUND_ROBIN:
				return getRoundRobin();
			case SpringPackage.DOCUMENT_ROOT__ROUTE:
				return getRoute();
			case SpringPackage.DOCUMENT_ROOT__ROUTE_BUILDER:
				return getRouteBuilder();
			case SpringPackage.DOCUMENT_ROOT__ROUTE_CONTEXT:
				return getRouteContext();
			case SpringPackage.DOCUMENT_ROOT__ROUTE_CONTEXT_REF:
				return getRouteContextRef();
			case SpringPackage.DOCUMENT_ROOT__ROUTES:
				return getRoutes();
			case SpringPackage.DOCUMENT_ROOT__ROUTING_SLIP:
				return getRoutingSlip();
			case SpringPackage.DOCUMENT_ROOT__RSS:
				return getRss();
			case SpringPackage.DOCUMENT_ROOT__RUBY:
				return getRuby();
			case SpringPackage.DOCUMENT_ROOT__SAMPLE:
				return getSample();
			case SpringPackage.DOCUMENT_ROOT__SECURE_RANDOM_PARAMETERS:
				return getSecureRandomParameters();
			case SpringPackage.DOCUMENT_ROOT__SECURE_XML:
				return getSecureXML();
			case SpringPackage.DOCUMENT_ROOT__SERIALIZATION:
				return getSerialization();
			case SpringPackage.DOCUMENT_ROOT__SET_BODY:
				return getSetBody();
			case SpringPackage.DOCUMENT_ROOT__SET_EXCHANGE_PATTERN:
				return getSetExchangePattern();
			case SpringPackage.DOCUMENT_ROOT__SET_FAULT_BODY:
				return getSetFaultBody();
			case SpringPackage.DOCUMENT_ROOT__SET_HEADER:
				return getSetHeader();
			case SpringPackage.DOCUMENT_ROOT__SET_OUT_HEADER:
				return getSetOutHeader();
			case SpringPackage.DOCUMENT_ROOT__SET_PROPERTY:
				return getSetProperty();
			case SpringPackage.DOCUMENT_ROOT__SIMPLE:
				return getSimple();
			case SpringPackage.DOCUMENT_ROOT__SOAPJAXB:
				return getSoapjaxb();
			case SpringPackage.DOCUMENT_ROOT__SORT:
				return getSort();
			case SpringPackage.DOCUMENT_ROOT__SPEL:
				return getSpel();
			case SpringPackage.DOCUMENT_ROOT__SPLIT:
				return getSplit();
			case SpringPackage.DOCUMENT_ROOT__SQL:
				return getSql();
			case SpringPackage.DOCUMENT_ROOT__SSL_CONTEXT_PARAMETERS:
				return getSslContextParameters();
			case SpringPackage.DOCUMENT_ROOT__STICKY:
				return getSticky();
			case SpringPackage.DOCUMENT_ROOT__STOP:
				return getStop();
			case SpringPackage.DOCUMENT_ROOT__STREAM_RESEQUENCER_CONFIG:
				return getStreamResequencerConfig();
			case SpringPackage.DOCUMENT_ROOT__STRING:
				return getString();
			case SpringPackage.DOCUMENT_ROOT__SYSLOG:
				return getSyslog();
			case SpringPackage.DOCUMENT_ROOT__TEMPLATE:
				return getTemplate();
			case SpringPackage.DOCUMENT_ROOT__THREAD_POOL:
				return getThreadPool();
			case SpringPackage.DOCUMENT_ROOT__THREAD_POOL_PROFILE:
				return getThreadPoolProfile();
			case SpringPackage.DOCUMENT_ROOT__THREADS:
				return getThreads();
			case SpringPackage.DOCUMENT_ROOT__THROTTLE:
				return getThrottle();
			case SpringPackage.DOCUMENT_ROOT__THROW_EXCEPTION:
				return getThrowException();
			case SpringPackage.DOCUMENT_ROOT__TIDY_MARKUP:
				return getTidyMarkup();
			case SpringPackage.DOCUMENT_ROOT__TO:
				return getTo();
			case SpringPackage.DOCUMENT_ROOT__TOKENIZE:
				return getTokenize();
			case SpringPackage.DOCUMENT_ROOT__TOPIC:
				return getTopic();
			case SpringPackage.DOCUMENT_ROOT__TRANSACTED:
				return getTransacted();
			case SpringPackage.DOCUMENT_ROOT__TRANSFORM:
				return getTransform();
			case SpringPackage.DOCUMENT_ROOT__UNMARSHAL:
				return getUnmarshal();
			case SpringPackage.DOCUMENT_ROOT__VALIDATE:
				return getValidate();
			case SpringPackage.DOCUMENT_ROOT__WEIGHTED:
				return getWeighted();
			case SpringPackage.DOCUMENT_ROOT__WHEN:
				return getWhen();
			case SpringPackage.DOCUMENT_ROOT__WIRE_TAP:
				return getWireTap();
			case SpringPackage.DOCUMENT_ROOT__XML_BEANS:
				return getXmlBeans();
			case SpringPackage.DOCUMENT_ROOT__XPATH:
				return getXpath();
			case SpringPackage.DOCUMENT_ROOT__XQUERY:
				return getXquery();
			case SpringPackage.DOCUMENT_ROOT__XSTREAM:
				return getXstream();
			case SpringPackage.DOCUMENT_ROOT__ZIP:
				return getZip();
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
			case SpringPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__AGGREGATE:
				setAggregate((AggregateDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__AOP:
				setAop((AopDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__BATCH_RESEQUENCER_CONFIG:
				setBatchResequencerConfig((BatchResequencerConfig)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__BEAN:
				setBean((BeanDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__BEAN_POST_PROCESSOR:
				setBeanPostProcessor((CamelBeanPostProcessor)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__BINDY:
				setBindy((BindyDataFormat)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__CAMEL_CONTEXT:
				setCamelContext((CamelContextFactoryBean)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__CASTOR:
				setCastor((CastorDataFormat)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__CHOICE:
				setChoice((ChoiceDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__CONSTANT:
				setConstant((ConstantExpression)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__CONSUMER_TEMPLATE:
				setConsumerTemplate((CamelConsumerTemplateFactoryBean)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__CONTEXT_SCAN:
				setContextScan((ContextScanDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__CONVERT_BODY_TO:
				setConvertBodyTo((ConvertBodyDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__CRYPTO:
				setCrypto((CryptoDataFormat)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__CSV:
				setCsv((CsvDataFormat)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__CUSTOM_DATA_FORMAT:
				setCustomDataFormat((CustomDataFormat)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__CUSTOM_LOAD_BALANCER:
				setCustomLoadBalancer((CustomLoadBalancerDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__DATA_FORMATS:
				setDataFormats((DataFormatsDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__DELAY:
				setDelay((DelayDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((DescriptionDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__DO_CATCH:
				setDoCatch((CatchDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__DO_FINALLY:
				setDoFinally((FinallyDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__DO_TRY:
				setDoTry((TryDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__DYNAMIC_ROUTER:
				setDynamicRouter((DynamicRouterDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__EL:
				setEl((ElExpression)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__ENDPOINT:
				setEndpoint((CamelEndpointFactoryBean)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__ENRICH:
				setEnrich((EnrichDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__ERROR_HANDLER:
				setErrorHandler((ErrorHandlerDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__EXPORT:
				setExport((CamelServiceExporterDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__EXPRESSION:
				setExpression((ExpressionSubElementDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__EXPRESSION_DEFINITION:
				setExpressionDefinition((Expression)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__FAILOVER:
				setFailover((FailoverLoadBalancerDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__FILTER:
				setFilter((FilterDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__FLATPACK:
				setFlatpack((FlatpackDataFormat)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__FROM:
				setFrom((FromDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__GROOVY:
				setGroovy((GroovyExpression)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__GZIP:
				setGzip((GzipDataFormat)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__HEADER:
				setHeader((HeaderExpression)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__HL7:
				setHl7((Hl7DataFormat)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__IDEMPOTENT_CONSUMER:
				setIdempotentConsumer((IdempotentConsumerDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__IN_ONLY:
				setInOnly((InOnlyDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__IN_OUT:
				setInOut((InOutDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__INTERCEPT:
				setIntercept((InterceptDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__INTERCEPT_FROM:
				setInterceptFrom((InterceptFromDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__INTERCEPT_TO_ENDPOINT:
				setInterceptToEndpoint((InterceptSendToEndpointDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__JAVA_SCRIPT:
				setJavaScript((JavaScriptExpression)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__JAXB:
				setJaxb((JaxbDataFormat)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__JIBX:
				setJibx((JibxDataFormat)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__JMX_AGENT:
				setJmxAgent((CamelJMXAgentDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__JSON:
				setJson((JsonDataFormat)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__JXPATH:
				setJxpath((JxPathExpression)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__KEY_STORE_PARAMETERS:
				setKeyStoreParameters((KeyStoreParametersFactoryBean)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__LANGUAGE:
				setLanguage((LanguageExpression)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__LOAD_BALANCE:
				setLoadBalance((LoadBalanceDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__LOG:
				setLog((LogDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__LOOP:
				setLoop((LoopDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__MARSHAL:
				setMarshal((MarshalDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__METHOD:
				setMethod((MethodCallExpression)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__MULTICAST:
				setMulticast((MulticastDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__MVEL:
				setMvel((MvelExpression)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__OGNL:
				setOgnl((OgnlExpression)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__ON_COMPLETION:
				setOnCompletion((OnCompletionDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__ON_EXCEPTION:
				setOnException((OnExceptionDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__OTHERWISE:
				setOtherwise((OtherwiseDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__PACKAGE_SCAN:
				setPackageScan((PackageScanDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__PHP:
				setPhp((PhpExpression)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__PIPELINE:
				setPipeline((PipelineDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__POLICY:
				setPolicy((PolicyDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__POLL_ENRICH:
				setPollEnrich((PollEnrichDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__PROCESS:
				setProcess((ProcessDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__PROPERTIES:
				setProperties((PropertiesDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((EObject)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__PROPERTY_PLACEHOLDER:
				setPropertyPlaceholder((CamelPropertyPlaceholderDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__PROTOBUF:
				setProtobuf((ProtobufDataFormat)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__PROXY:
				setProxy((CamelProxyFactoryDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__PYTHON:
				setPython((PythonExpression)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__RANDOM:
				setRandom((RandomLoadBalancerDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__RECIPIENT_LIST:
				setRecipientList((RecipientListDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__REDELIVERY_POLICY:
				setRedeliveryPolicy((RedeliveryPolicyDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__REDELIVERY_POLICY_PROFILE:
				setRedeliveryPolicyProfile((CamelRedeliveryPolicyFactoryBean)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__REF:
				setRef((RefExpression)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__REMOVE_HEADER:
				setRemoveHeader((RemoveHeaderDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__REMOVE_HEADERS:
				setRemoveHeaders((RemoveHeadersDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__REMOVE_PROPERTY:
				setRemoveProperty((RemovePropertyDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__RESEQUENCE:
				setResequence((ResequenceDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__ROLLBACK:
				setRollback((RollbackDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__ROUND_ROBIN:
				setRoundRobin((RoundRobinLoadBalancerDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__ROUTE:
				setRoute((RouteDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__ROUTE_BUILDER:
				setRouteBuilder((RouteBuilderDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__ROUTE_CONTEXT:
				setRouteContext((CamelRouteContextFactoryBean)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__ROUTE_CONTEXT_REF:
				setRouteContextRef((RouteContextRefDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__ROUTES:
				setRoutes((RoutesDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__ROUTING_SLIP:
				setRoutingSlip((RoutingSlipDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__RSS:
				setRss((RssDataFormat)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__RUBY:
				setRuby((RubyExpression)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__SAMPLE:
				setSample((SamplingDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__SECURE_RANDOM_PARAMETERS:
				setSecureRandomParameters((SecureRandomParametersFactoryBean)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__SECURE_XML:
				setSecureXML((XmlSecurityDataFormat)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__SERIALIZATION:
				setSerialization((SerializationDataFormat)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__SET_BODY:
				setSetBody((SetBodyDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__SET_EXCHANGE_PATTERN:
				setSetExchangePattern((SetExchangePatternDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__SET_FAULT_BODY:
				setSetFaultBody((SetFaultBodyDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__SET_HEADER:
				setSetHeader((SetHeaderDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__SET_OUT_HEADER:
				setSetOutHeader((SetOutHeaderDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__SET_PROPERTY:
				setSetProperty((SetPropertyDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__SIMPLE:
				setSimple((SimpleExpression)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__SOAPJAXB:
				setSoapjaxb((SoapJaxbDataFormat)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__SORT:
				setSort((SortDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__SPEL:
				setSpel((SpELExpression)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__SPLIT:
				setSplit((SplitDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__SQL:
				setSql((SqlExpression)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__SSL_CONTEXT_PARAMETERS:
				setSslContextParameters((SslContextParametersFactoryBean)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__STICKY:
				setSticky((StickyLoadBalancerDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__STOP:
				setStop((StopDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__STREAM_RESEQUENCER_CONFIG:
				setStreamResequencerConfig((StreamResequencerConfig)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__STRING:
				setString((StringDataFormat)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__SYSLOG:
				setSyslog((SyslogDataFormat)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__TEMPLATE:
				setTemplate((CamelProducerTemplateFactoryBean)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__THREAD_POOL:
				setThreadPool((CamelThreadPoolFactoryBean)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__THREAD_POOL_PROFILE:
				setThreadPoolProfile((ThreadPoolProfileDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__THREADS:
				setThreads((ThreadsDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__THROTTLE:
				setThrottle((ThrottleDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__THROW_EXCEPTION:
				setThrowException((ThrowExceptionDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__TIDY_MARKUP:
				setTidyMarkup((TidyMarkupDataFormat)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__TO:
				setTo((ToDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__TOKENIZE:
				setTokenize((TokenizerExpression)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__TOPIC:
				setTopic((TopicLoadBalancerDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__TRANSACTED:
				setTransacted((TransactedDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__TRANSFORM:
				setTransform((TransformDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__UNMARSHAL:
				setUnmarshal((UnmarshalDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__VALIDATE:
				setValidate((ValidateDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__WEIGHTED:
				setWeighted((WeightedLoadBalancerDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__WHEN:
				setWhen((WhenDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__WIRE_TAP:
				setWireTap((WireTapDefinition)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__XML_BEANS:
				setXmlBeans((XmlBeansDataFormat)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__XPATH:
				setXpath((XPathExpression)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__XQUERY:
				setXquery((XQueryExpression)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__XSTREAM:
				setXstream((XStreamDataFormat)newValue);
				return;
			case SpringPackage.DOCUMENT_ROOT__ZIP:
				setZip((ZipDataFormat)newValue);
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
			case SpringPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case SpringPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case SpringPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case SpringPackage.DOCUMENT_ROOT__AGGREGATE:
				setAggregate((AggregateDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__AOP:
				setAop((AopDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__BATCH_RESEQUENCER_CONFIG:
				setBatchResequencerConfig((BatchResequencerConfig)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__BEAN:
				setBean((BeanDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__BEAN_POST_PROCESSOR:
				setBeanPostProcessor((CamelBeanPostProcessor)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__BINDY:
				setBindy((BindyDataFormat)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__CAMEL_CONTEXT:
				setCamelContext((CamelContextFactoryBean)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__CASTOR:
				setCastor((CastorDataFormat)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__CHOICE:
				setChoice((ChoiceDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__CONSTANT:
				setConstant((ConstantExpression)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__CONSUMER_TEMPLATE:
				setConsumerTemplate((CamelConsumerTemplateFactoryBean)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__CONTEXT_SCAN:
				setContextScan((ContextScanDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__CONVERT_BODY_TO:
				setConvertBodyTo((ConvertBodyDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__CRYPTO:
				setCrypto((CryptoDataFormat)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__CSV:
				setCsv((CsvDataFormat)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__CUSTOM_DATA_FORMAT:
				setCustomDataFormat((CustomDataFormat)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__CUSTOM_LOAD_BALANCER:
				setCustomLoadBalancer((CustomLoadBalancerDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__DATA_FORMATS:
				setDataFormats((DataFormatsDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__DELAY:
				setDelay((DelayDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((DescriptionDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__DO_CATCH:
				setDoCatch((CatchDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__DO_FINALLY:
				setDoFinally((FinallyDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__DO_TRY:
				setDoTry((TryDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__DYNAMIC_ROUTER:
				setDynamicRouter((DynamicRouterDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__EL:
				setEl((ElExpression)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__ENDPOINT:
				setEndpoint((CamelEndpointFactoryBean)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__ENRICH:
				setEnrich((EnrichDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__ERROR_HANDLER:
				setErrorHandler((ErrorHandlerDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__EXPORT:
				setExport((CamelServiceExporterDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__EXPRESSION:
				setExpression((ExpressionSubElementDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__EXPRESSION_DEFINITION:
				setExpressionDefinition((Expression)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__FAILOVER:
				setFailover((FailoverLoadBalancerDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__FILTER:
				setFilter((FilterDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__FLATPACK:
				setFlatpack((FlatpackDataFormat)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__FROM:
				setFrom((FromDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__GROOVY:
				setGroovy((GroovyExpression)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__GZIP:
				setGzip((GzipDataFormat)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__HEADER:
				setHeader((HeaderExpression)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__HL7:
				setHl7((Hl7DataFormat)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__IDEMPOTENT_CONSUMER:
				setIdempotentConsumer((IdempotentConsumerDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__IN_ONLY:
				setInOnly((InOnlyDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__IN_OUT:
				setInOut((InOutDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__INTERCEPT:
				setIntercept((InterceptDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__INTERCEPT_FROM:
				setInterceptFrom((InterceptFromDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__INTERCEPT_TO_ENDPOINT:
				setInterceptToEndpoint((InterceptSendToEndpointDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__JAVA_SCRIPT:
				setJavaScript((JavaScriptExpression)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__JAXB:
				setJaxb((JaxbDataFormat)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__JIBX:
				setJibx((JibxDataFormat)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__JMX_AGENT:
				setJmxAgent((CamelJMXAgentDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__JSON:
				setJson((JsonDataFormat)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__JXPATH:
				setJxpath((JxPathExpression)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__KEY_STORE_PARAMETERS:
				setKeyStoreParameters((KeyStoreParametersFactoryBean)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__LANGUAGE:
				setLanguage((LanguageExpression)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__LOAD_BALANCE:
				setLoadBalance((LoadBalanceDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__LOG:
				setLog((LogDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__LOOP:
				setLoop((LoopDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__MARSHAL:
				setMarshal((MarshalDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__METHOD:
				setMethod((MethodCallExpression)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__MULTICAST:
				setMulticast((MulticastDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__MVEL:
				setMvel((MvelExpression)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__OGNL:
				setOgnl((OgnlExpression)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__ON_COMPLETION:
				setOnCompletion((OnCompletionDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__ON_EXCEPTION:
				setOnException((OnExceptionDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__OTHERWISE:
				setOtherwise((OtherwiseDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__PACKAGE_SCAN:
				setPackageScan((PackageScanDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__PHP:
				setPhp((PhpExpression)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__PIPELINE:
				setPipeline((PipelineDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__POLICY:
				setPolicy((PolicyDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__POLL_ENRICH:
				setPollEnrich((PollEnrichDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__PROCESS:
				setProcess((ProcessDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__PROPERTIES:
				setProperties((PropertiesDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((EObject)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__PROPERTY_PLACEHOLDER:
				setPropertyPlaceholder((CamelPropertyPlaceholderDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__PROTOBUF:
				setProtobuf((ProtobufDataFormat)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__PROXY:
				setProxy((CamelProxyFactoryDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__PYTHON:
				setPython((PythonExpression)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__RANDOM:
				setRandom((RandomLoadBalancerDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__RECIPIENT_LIST:
				setRecipientList((RecipientListDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__REDELIVERY_POLICY:
				setRedeliveryPolicy((RedeliveryPolicyDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__REDELIVERY_POLICY_PROFILE:
				setRedeliveryPolicyProfile((CamelRedeliveryPolicyFactoryBean)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__REF:
				setRef((RefExpression)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__REMOVE_HEADER:
				setRemoveHeader((RemoveHeaderDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__REMOVE_HEADERS:
				setRemoveHeaders((RemoveHeadersDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__REMOVE_PROPERTY:
				setRemoveProperty((RemovePropertyDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__RESEQUENCE:
				setResequence((ResequenceDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__ROLLBACK:
				setRollback((RollbackDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__ROUND_ROBIN:
				setRoundRobin((RoundRobinLoadBalancerDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__ROUTE:
				setRoute((RouteDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__ROUTE_BUILDER:
				setRouteBuilder((RouteBuilderDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__ROUTE_CONTEXT:
				setRouteContext((CamelRouteContextFactoryBean)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__ROUTE_CONTEXT_REF:
				setRouteContextRef((RouteContextRefDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__ROUTES:
				setRoutes((RoutesDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__ROUTING_SLIP:
				setRoutingSlip((RoutingSlipDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__RSS:
				setRss((RssDataFormat)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__RUBY:
				setRuby((RubyExpression)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__SAMPLE:
				setSample((SamplingDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__SECURE_RANDOM_PARAMETERS:
				setSecureRandomParameters((SecureRandomParametersFactoryBean)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__SECURE_XML:
				setSecureXML((XmlSecurityDataFormat)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__SERIALIZATION:
				setSerialization((SerializationDataFormat)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__SET_BODY:
				setSetBody((SetBodyDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__SET_EXCHANGE_PATTERN:
				setSetExchangePattern((SetExchangePatternDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__SET_FAULT_BODY:
				setSetFaultBody((SetFaultBodyDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__SET_HEADER:
				setSetHeader((SetHeaderDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__SET_OUT_HEADER:
				setSetOutHeader((SetOutHeaderDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__SET_PROPERTY:
				setSetProperty((SetPropertyDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__SIMPLE:
				setSimple((SimpleExpression)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__SOAPJAXB:
				setSoapjaxb((SoapJaxbDataFormat)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__SORT:
				setSort((SortDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__SPEL:
				setSpel((SpELExpression)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__SPLIT:
				setSplit((SplitDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__SQL:
				setSql((SqlExpression)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__SSL_CONTEXT_PARAMETERS:
				setSslContextParameters((SslContextParametersFactoryBean)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__STICKY:
				setSticky((StickyLoadBalancerDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__STOP:
				setStop((StopDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__STREAM_RESEQUENCER_CONFIG:
				setStreamResequencerConfig((StreamResequencerConfig)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__STRING:
				setString((StringDataFormat)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__SYSLOG:
				setSyslog((SyslogDataFormat)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__TEMPLATE:
				setTemplate((CamelProducerTemplateFactoryBean)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__THREAD_POOL:
				setThreadPool((CamelThreadPoolFactoryBean)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__THREAD_POOL_PROFILE:
				setThreadPoolProfile((ThreadPoolProfileDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__THREADS:
				setThreads((ThreadsDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__THROTTLE:
				setThrottle((ThrottleDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__THROW_EXCEPTION:
				setThrowException((ThrowExceptionDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__TIDY_MARKUP:
				setTidyMarkup((TidyMarkupDataFormat)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__TO:
				setTo((ToDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__TOKENIZE:
				setTokenize((TokenizerExpression)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__TOPIC:
				setTopic((TopicLoadBalancerDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__TRANSACTED:
				setTransacted((TransactedDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__TRANSFORM:
				setTransform((TransformDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__UNMARSHAL:
				setUnmarshal((UnmarshalDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__VALIDATE:
				setValidate((ValidateDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__WEIGHTED:
				setWeighted((WeightedLoadBalancerDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__WHEN:
				setWhen((WhenDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__WIRE_TAP:
				setWireTap((WireTapDefinition)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__XML_BEANS:
				setXmlBeans((XmlBeansDataFormat)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__XPATH:
				setXpath((XPathExpression)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__XQUERY:
				setXquery((XQueryExpression)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__XSTREAM:
				setXstream((XStreamDataFormat)null);
				return;
			case SpringPackage.DOCUMENT_ROOT__ZIP:
				setZip((ZipDataFormat)null);
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
			case SpringPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SpringPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case SpringPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case SpringPackage.DOCUMENT_ROOT__AGGREGATE:
				return getAggregate() != null;
			case SpringPackage.DOCUMENT_ROOT__AOP:
				return getAop() != null;
			case SpringPackage.DOCUMENT_ROOT__BATCH_RESEQUENCER_CONFIG:
				return getBatchResequencerConfig() != null;
			case SpringPackage.DOCUMENT_ROOT__BEAN:
				return getBean() != null;
			case SpringPackage.DOCUMENT_ROOT__BEAN_POST_PROCESSOR:
				return getBeanPostProcessor() != null;
			case SpringPackage.DOCUMENT_ROOT__BINDY:
				return getBindy() != null;
			case SpringPackage.DOCUMENT_ROOT__CAMEL_CONTEXT:
				return getCamelContext() != null;
			case SpringPackage.DOCUMENT_ROOT__CASTOR:
				return getCastor() != null;
			case SpringPackage.DOCUMENT_ROOT__CHOICE:
				return getChoice() != null;
			case SpringPackage.DOCUMENT_ROOT__CONSTANT:
				return getConstant() != null;
			case SpringPackage.DOCUMENT_ROOT__CONSUMER_TEMPLATE:
				return getConsumerTemplate() != null;
			case SpringPackage.DOCUMENT_ROOT__CONTEXT_SCAN:
				return getContextScan() != null;
			case SpringPackage.DOCUMENT_ROOT__CONVERT_BODY_TO:
				return getConvertBodyTo() != null;
			case SpringPackage.DOCUMENT_ROOT__CRYPTO:
				return getCrypto() != null;
			case SpringPackage.DOCUMENT_ROOT__CSV:
				return getCsv() != null;
			case SpringPackage.DOCUMENT_ROOT__CUSTOM_DATA_FORMAT:
				return getCustomDataFormat() != null;
			case SpringPackage.DOCUMENT_ROOT__CUSTOM_LOAD_BALANCER:
				return getCustomLoadBalancer() != null;
			case SpringPackage.DOCUMENT_ROOT__DATA_FORMATS:
				return getDataFormats() != null;
			case SpringPackage.DOCUMENT_ROOT__DELAY:
				return getDelay() != null;
			case SpringPackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription() != null;
			case SpringPackage.DOCUMENT_ROOT__DO_CATCH:
				return getDoCatch() != null;
			case SpringPackage.DOCUMENT_ROOT__DO_FINALLY:
				return getDoFinally() != null;
			case SpringPackage.DOCUMENT_ROOT__DO_TRY:
				return getDoTry() != null;
			case SpringPackage.DOCUMENT_ROOT__DYNAMIC_ROUTER:
				return getDynamicRouter() != null;
			case SpringPackage.DOCUMENT_ROOT__EL:
				return getEl() != null;
			case SpringPackage.DOCUMENT_ROOT__ENDPOINT:
				return getEndpoint() != null;
			case SpringPackage.DOCUMENT_ROOT__ENRICH:
				return getEnrich() != null;
			case SpringPackage.DOCUMENT_ROOT__ERROR_HANDLER:
				return getErrorHandler() != null;
			case SpringPackage.DOCUMENT_ROOT__EXPORT:
				return getExport() != null;
			case SpringPackage.DOCUMENT_ROOT__EXPRESSION:
				return getExpression() != null;
			case SpringPackage.DOCUMENT_ROOT__EXPRESSION_DEFINITION:
				return getExpressionDefinition() != null;
			case SpringPackage.DOCUMENT_ROOT__FAILOVER:
				return getFailover() != null;
			case SpringPackage.DOCUMENT_ROOT__FILTER:
				return getFilter() != null;
			case SpringPackage.DOCUMENT_ROOT__FLATPACK:
				return getFlatpack() != null;
			case SpringPackage.DOCUMENT_ROOT__FROM:
				return getFrom() != null;
			case SpringPackage.DOCUMENT_ROOT__GROOVY:
				return getGroovy() != null;
			case SpringPackage.DOCUMENT_ROOT__GZIP:
				return getGzip() != null;
			case SpringPackage.DOCUMENT_ROOT__HEADER:
				return getHeader() != null;
			case SpringPackage.DOCUMENT_ROOT__HL7:
				return getHl7() != null;
			case SpringPackage.DOCUMENT_ROOT__IDEMPOTENT_CONSUMER:
				return getIdempotentConsumer() != null;
			case SpringPackage.DOCUMENT_ROOT__IN_ONLY:
				return getInOnly() != null;
			case SpringPackage.DOCUMENT_ROOT__IN_OUT:
				return getInOut() != null;
			case SpringPackage.DOCUMENT_ROOT__INTERCEPT:
				return getIntercept() != null;
			case SpringPackage.DOCUMENT_ROOT__INTERCEPT_FROM:
				return getInterceptFrom() != null;
			case SpringPackage.DOCUMENT_ROOT__INTERCEPT_TO_ENDPOINT:
				return getInterceptToEndpoint() != null;
			case SpringPackage.DOCUMENT_ROOT__JAVA_SCRIPT:
				return getJavaScript() != null;
			case SpringPackage.DOCUMENT_ROOT__JAXB:
				return getJaxb() != null;
			case SpringPackage.DOCUMENT_ROOT__JIBX:
				return getJibx() != null;
			case SpringPackage.DOCUMENT_ROOT__JMX_AGENT:
				return getJmxAgent() != null;
			case SpringPackage.DOCUMENT_ROOT__JSON:
				return getJson() != null;
			case SpringPackage.DOCUMENT_ROOT__JXPATH:
				return getJxpath() != null;
			case SpringPackage.DOCUMENT_ROOT__KEY_STORE_PARAMETERS:
				return getKeyStoreParameters() != null;
			case SpringPackage.DOCUMENT_ROOT__LANGUAGE:
				return getLanguage() != null;
			case SpringPackage.DOCUMENT_ROOT__LOAD_BALANCE:
				return getLoadBalance() != null;
			case SpringPackage.DOCUMENT_ROOT__LOG:
				return getLog() != null;
			case SpringPackage.DOCUMENT_ROOT__LOOP:
				return getLoop() != null;
			case SpringPackage.DOCUMENT_ROOT__MARSHAL:
				return getMarshal() != null;
			case SpringPackage.DOCUMENT_ROOT__METHOD:
				return getMethod() != null;
			case SpringPackage.DOCUMENT_ROOT__MULTICAST:
				return getMulticast() != null;
			case SpringPackage.DOCUMENT_ROOT__MVEL:
				return getMvel() != null;
			case SpringPackage.DOCUMENT_ROOT__OGNL:
				return getOgnl() != null;
			case SpringPackage.DOCUMENT_ROOT__ON_COMPLETION:
				return getOnCompletion() != null;
			case SpringPackage.DOCUMENT_ROOT__ON_EXCEPTION:
				return getOnException() != null;
			case SpringPackage.DOCUMENT_ROOT__OTHERWISE:
				return getOtherwise() != null;
			case SpringPackage.DOCUMENT_ROOT__PACKAGE_SCAN:
				return getPackageScan() != null;
			case SpringPackage.DOCUMENT_ROOT__PHP:
				return getPhp() != null;
			case SpringPackage.DOCUMENT_ROOT__PIPELINE:
				return getPipeline() != null;
			case SpringPackage.DOCUMENT_ROOT__POLICY:
				return getPolicy() != null;
			case SpringPackage.DOCUMENT_ROOT__POLL_ENRICH:
				return getPollEnrich() != null;
			case SpringPackage.DOCUMENT_ROOT__PROCESS:
				return getProcess() != null;
			case SpringPackage.DOCUMENT_ROOT__PROPERTIES:
				return getProperties() != null;
			case SpringPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty() != null;
			case SpringPackage.DOCUMENT_ROOT__PROPERTY_PLACEHOLDER:
				return getPropertyPlaceholder() != null;
			case SpringPackage.DOCUMENT_ROOT__PROTOBUF:
				return getProtobuf() != null;
			case SpringPackage.DOCUMENT_ROOT__PROXY:
				return getProxy() != null;
			case SpringPackage.DOCUMENT_ROOT__PYTHON:
				return getPython() != null;
			case SpringPackage.DOCUMENT_ROOT__RANDOM:
				return getRandom() != null;
			case SpringPackage.DOCUMENT_ROOT__RECIPIENT_LIST:
				return getRecipientList() != null;
			case SpringPackage.DOCUMENT_ROOT__REDELIVERY_POLICY:
				return getRedeliveryPolicy() != null;
			case SpringPackage.DOCUMENT_ROOT__REDELIVERY_POLICY_PROFILE:
				return getRedeliveryPolicyProfile() != null;
			case SpringPackage.DOCUMENT_ROOT__REF:
				return getRef() != null;
			case SpringPackage.DOCUMENT_ROOT__REMOVE_HEADER:
				return getRemoveHeader() != null;
			case SpringPackage.DOCUMENT_ROOT__REMOVE_HEADERS:
				return getRemoveHeaders() != null;
			case SpringPackage.DOCUMENT_ROOT__REMOVE_PROPERTY:
				return getRemoveProperty() != null;
			case SpringPackage.DOCUMENT_ROOT__RESEQUENCE:
				return getResequence() != null;
			case SpringPackage.DOCUMENT_ROOT__ROLLBACK:
				return getRollback() != null;
			case SpringPackage.DOCUMENT_ROOT__ROUND_ROBIN:
				return getRoundRobin() != null;
			case SpringPackage.DOCUMENT_ROOT__ROUTE:
				return getRoute() != null;
			case SpringPackage.DOCUMENT_ROOT__ROUTE_BUILDER:
				return getRouteBuilder() != null;
			case SpringPackage.DOCUMENT_ROOT__ROUTE_CONTEXT:
				return getRouteContext() != null;
			case SpringPackage.DOCUMENT_ROOT__ROUTE_CONTEXT_REF:
				return getRouteContextRef() != null;
			case SpringPackage.DOCUMENT_ROOT__ROUTES:
				return getRoutes() != null;
			case SpringPackage.DOCUMENT_ROOT__ROUTING_SLIP:
				return getRoutingSlip() != null;
			case SpringPackage.DOCUMENT_ROOT__RSS:
				return getRss() != null;
			case SpringPackage.DOCUMENT_ROOT__RUBY:
				return getRuby() != null;
			case SpringPackage.DOCUMENT_ROOT__SAMPLE:
				return getSample() != null;
			case SpringPackage.DOCUMENT_ROOT__SECURE_RANDOM_PARAMETERS:
				return getSecureRandomParameters() != null;
			case SpringPackage.DOCUMENT_ROOT__SECURE_XML:
				return getSecureXML() != null;
			case SpringPackage.DOCUMENT_ROOT__SERIALIZATION:
				return getSerialization() != null;
			case SpringPackage.DOCUMENT_ROOT__SET_BODY:
				return getSetBody() != null;
			case SpringPackage.DOCUMENT_ROOT__SET_EXCHANGE_PATTERN:
				return getSetExchangePattern() != null;
			case SpringPackage.DOCUMENT_ROOT__SET_FAULT_BODY:
				return getSetFaultBody() != null;
			case SpringPackage.DOCUMENT_ROOT__SET_HEADER:
				return getSetHeader() != null;
			case SpringPackage.DOCUMENT_ROOT__SET_OUT_HEADER:
				return getSetOutHeader() != null;
			case SpringPackage.DOCUMENT_ROOT__SET_PROPERTY:
				return getSetProperty() != null;
			case SpringPackage.DOCUMENT_ROOT__SIMPLE:
				return getSimple() != null;
			case SpringPackage.DOCUMENT_ROOT__SOAPJAXB:
				return getSoapjaxb() != null;
			case SpringPackage.DOCUMENT_ROOT__SORT:
				return getSort() != null;
			case SpringPackage.DOCUMENT_ROOT__SPEL:
				return getSpel() != null;
			case SpringPackage.DOCUMENT_ROOT__SPLIT:
				return getSplit() != null;
			case SpringPackage.DOCUMENT_ROOT__SQL:
				return getSql() != null;
			case SpringPackage.DOCUMENT_ROOT__SSL_CONTEXT_PARAMETERS:
				return getSslContextParameters() != null;
			case SpringPackage.DOCUMENT_ROOT__STICKY:
				return getSticky() != null;
			case SpringPackage.DOCUMENT_ROOT__STOP:
				return getStop() != null;
			case SpringPackage.DOCUMENT_ROOT__STREAM_RESEQUENCER_CONFIG:
				return getStreamResequencerConfig() != null;
			case SpringPackage.DOCUMENT_ROOT__STRING:
				return getString() != null;
			case SpringPackage.DOCUMENT_ROOT__SYSLOG:
				return getSyslog() != null;
			case SpringPackage.DOCUMENT_ROOT__TEMPLATE:
				return getTemplate() != null;
			case SpringPackage.DOCUMENT_ROOT__THREAD_POOL:
				return getThreadPool() != null;
			case SpringPackage.DOCUMENT_ROOT__THREAD_POOL_PROFILE:
				return getThreadPoolProfile() != null;
			case SpringPackage.DOCUMENT_ROOT__THREADS:
				return getThreads() != null;
			case SpringPackage.DOCUMENT_ROOT__THROTTLE:
				return getThrottle() != null;
			case SpringPackage.DOCUMENT_ROOT__THROW_EXCEPTION:
				return getThrowException() != null;
			case SpringPackage.DOCUMENT_ROOT__TIDY_MARKUP:
				return getTidyMarkup() != null;
			case SpringPackage.DOCUMENT_ROOT__TO:
				return getTo() != null;
			case SpringPackage.DOCUMENT_ROOT__TOKENIZE:
				return getTokenize() != null;
			case SpringPackage.DOCUMENT_ROOT__TOPIC:
				return getTopic() != null;
			case SpringPackage.DOCUMENT_ROOT__TRANSACTED:
				return getTransacted() != null;
			case SpringPackage.DOCUMENT_ROOT__TRANSFORM:
				return getTransform() != null;
			case SpringPackage.DOCUMENT_ROOT__UNMARSHAL:
				return getUnmarshal() != null;
			case SpringPackage.DOCUMENT_ROOT__VALIDATE:
				return getValidate() != null;
			case SpringPackage.DOCUMENT_ROOT__WEIGHTED:
				return getWeighted() != null;
			case SpringPackage.DOCUMENT_ROOT__WHEN:
				return getWhen() != null;
			case SpringPackage.DOCUMENT_ROOT__WIRE_TAP:
				return getWireTap() != null;
			case SpringPackage.DOCUMENT_ROOT__XML_BEANS:
				return getXmlBeans() != null;
			case SpringPackage.DOCUMENT_ROOT__XPATH:
				return getXpath() != null;
			case SpringPackage.DOCUMENT_ROOT__XQUERY:
				return getXquery() != null;
			case SpringPackage.DOCUMENT_ROOT__XSTREAM:
				return getXstream() != null;
			case SpringPackage.DOCUMENT_ROOT__ZIP:
				return getZip() != null;
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
