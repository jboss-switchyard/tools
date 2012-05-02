/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.switchyard.tools.models.switchyard1_0.spring.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpringFactoryImpl extends EFactoryImpl implements SpringFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpringFactory init() {
		try {
			SpringFactory theSpringFactory = (SpringFactory)EPackage.Registry.INSTANCE.getEFactory("http://camel.apache.org/schema/spring"); 
			if (theSpringFactory != null) {
				return theSpringFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpringFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpringFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SpringPackage.AGGREGATE_DEFINITION: return createAggregateDefinition();
			case SpringPackage.ALIAS_ENTRY: return createAliasEntry();
			case SpringPackage.ALIAS_LIST: return createAliasList();
			case SpringPackage.AOP_DEFINITION: return createAopDefinition();
			case SpringPackage.BATCH_RESEQUENCER_CONFIG: return createBatchResequencerConfig();
			case SpringPackage.BEAN_DEFINITION: return createBeanDefinition();
			case SpringPackage.BINDY_DATA_FORMAT: return createBindyDataFormat();
			case SpringPackage.CAMEL_BEAN_POST_PROCESSOR: return createCamelBeanPostProcessor();
			case SpringPackage.CAMEL_CONSUMER_TEMPLATE_FACTORY_BEAN: return createCamelConsumerTemplateFactoryBean();
			case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN: return createCamelContextFactoryBean();
			case SpringPackage.CAMEL_ENDPOINT_FACTORY_BEAN: return createCamelEndpointFactoryBean();
			case SpringPackage.CAMEL_JMX_AGENT_DEFINITION: return createCamelJMXAgentDefinition();
			case SpringPackage.CAMEL_PRODUCER_TEMPLATE_FACTORY_BEAN: return createCamelProducerTemplateFactoryBean();
			case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION: return createCamelPropertyPlaceholderDefinition();
			case SpringPackage.CAMEL_PROXY_FACTORY_DEFINITION: return createCamelProxyFactoryDefinition();
			case SpringPackage.CAMEL_REDELIVERY_POLICY_FACTORY_BEAN: return createCamelRedeliveryPolicyFactoryBean();
			case SpringPackage.CAMEL_ROUTE_CONTEXT_FACTORY_BEAN: return createCamelRouteContextFactoryBean();
			case SpringPackage.CAMEL_SERVICE_EXPORTER_DEFINITION: return createCamelServiceExporterDefinition();
			case SpringPackage.CAMEL_THREAD_POOL_FACTORY_BEAN: return createCamelThreadPoolFactoryBean();
			case SpringPackage.CASTOR_DATA_FORMAT: return createCastorDataFormat();
			case SpringPackage.CATCH_DEFINITION: return createCatchDefinition();
			case SpringPackage.CHOICE_DEFINITION: return createChoiceDefinition();
			case SpringPackage.CIPHER_SUITES_PARAMETERS: return createCipherSuitesParameters();
			case SpringPackage.CONSTANT_EXPRESSION: return createConstantExpression();
			case SpringPackage.CONSTANTS: return createConstants();
			case SpringPackage.CONTEXT_SCAN_DEFINITION: return createContextScanDefinition();
			case SpringPackage.CONVERT_BODY_DEFINITION: return createConvertBodyDefinition();
			case SpringPackage.CONVERTER_ENTRY: return createConverterEntry();
			case SpringPackage.CONVERTER_LIST: return createConverterList();
			case SpringPackage.CRYPTO_DATA_FORMAT: return createCryptoDataFormat();
			case SpringPackage.CSV_DATA_FORMAT: return createCsvDataFormat();
			case SpringPackage.CUSTOM_DATA_FORMAT: return createCustomDataFormat();
			case SpringPackage.CUSTOM_LOAD_BALANCER_DEFINITION: return createCustomLoadBalancerDefinition();
			case SpringPackage.DATA_FORMAT: return createDataFormat();
			case SpringPackage.DATA_FORMATS_DEFINITION: return createDataFormatsDefinition();
			case SpringPackage.DELAY_DEFINITION: return createDelayDefinition();
			case SpringPackage.DESCRIPTION_DEFINITION: return createDescriptionDefinition();
			case SpringPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case SpringPackage.DYNAMIC_ROUTER_DEFINITION: return createDynamicRouterDefinition();
			case SpringPackage.EL_EXPRESSION: return createElExpression();
			case SpringPackage.ENRICH_DEFINITION: return createEnrichDefinition();
			case SpringPackage.ERROR_HANDLER_DEFINITION: return createErrorHandlerDefinition();
			case SpringPackage.EXPRESSION: return createExpression();
			case SpringPackage.EXPRESSION_NODE: return createExpressionNode();
			case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION: return createExpressionSubElementDefinition();
			case SpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION: return createFailoverLoadBalancerDefinition();
			case SpringPackage.FILTER_DEFINITION: return createFilterDefinition();
			case SpringPackage.FILTER_PARAMETERS: return createFilterParameters();
			case SpringPackage.FINALLY_DEFINITION: return createFinallyDefinition();
			case SpringPackage.FLATPACK_DATA_FORMAT: return createFlatpackDataFormat();
			case SpringPackage.FROM_DEFINITION: return createFromDefinition();
			case SpringPackage.GROOVY_EXPRESSION: return createGroovyExpression();
			case SpringPackage.GZIP_DATA_FORMAT: return createGzipDataFormat();
			case SpringPackage.HEADER_EXPRESSION: return createHeaderExpression();
			case SpringPackage.HL7_DATA_FORMAT: return createHl7DataFormat();
			case SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION: return createIdempotentConsumerDefinition();
			case SpringPackage.IMPLICIT_COLLECTION_ENTRY: return createImplicitCollectionEntry();
			case SpringPackage.IMPLICIT_COLLECTION_LIST: return createImplicitCollectionList();
			case SpringPackage.IN_ONLY_DEFINITION: return createInOnlyDefinition();
			case SpringPackage.IN_OUT_DEFINITION: return createInOutDefinition();
			case SpringPackage.INTERCEPT_DEFINITION: return createInterceptDefinition();
			case SpringPackage.INTERCEPT_FROM_DEFINITION: return createInterceptFromDefinition();
			case SpringPackage.INTERCEPT_SEND_TO_ENDPOINT_DEFINITION: return createInterceptSendToEndpointDefinition();
			case SpringPackage.JAVA_SCRIPT_EXPRESSION: return createJavaScriptExpression();
			case SpringPackage.JAXB_DATA_FORMAT: return createJaxbDataFormat();
			case SpringPackage.JIBX_DATA_FORMAT: return createJibxDataFormat();
			case SpringPackage.JSON_DATA_FORMAT: return createJsonDataFormat();
			case SpringPackage.JX_PATH_EXPRESSION: return createJxPathExpression();
			case SpringPackage.KEY_MANAGERS_PARAMETERS_FACTORY_BEAN: return createKeyManagersParametersFactoryBean();
			case SpringPackage.KEY_STORE_PARAMETERS_FACTORY_BEAN: return createKeyStoreParametersFactoryBean();
			case SpringPackage.LANGUAGE_EXPRESSION: return createLanguageExpression();
			case SpringPackage.LOAD_BALANCE_DEFINITION: return createLoadBalanceDefinition();
			case SpringPackage.LOAD_BALANCER: return createLoadBalancer();
			case SpringPackage.LOG_DEFINITION: return createLogDefinition();
			case SpringPackage.LOOP_DEFINITION: return createLoopDefinition();
			case SpringPackage.MARSHAL_DEFINITION: return createMarshalDefinition();
			case SpringPackage.METHOD_CALL_EXPRESSION: return createMethodCallExpression();
			case SpringPackage.MULTICAST_DEFINITION: return createMulticastDefinition();
			case SpringPackage.MVEL_EXPRESSION: return createMvelExpression();
			case SpringPackage.NODE_FACTORY: return createNodeFactory();
			case SpringPackage.NO_OUTPUT_EXPRESSION_NODE: return createNoOutputExpressionNode();
			case SpringPackage.OGNL_EXPRESSION: return createOgnlExpression();
			case SpringPackage.OMIT_FIELD_ENTRY: return createOmitFieldEntry();
			case SpringPackage.OMIT_FIELD_LIST: return createOmitFieldList();
			case SpringPackage.ON_COMPLETION_DEFINITION: return createOnCompletionDefinition();
			case SpringPackage.ON_EXCEPTION_DEFINITION: return createOnExceptionDefinition();
			case SpringPackage.OTHERWISE_DEFINITION: return createOtherwiseDefinition();
			case SpringPackage.OUTPUT: return createOutput();
			case SpringPackage.PACKAGE_SCAN_DEFINITION: return createPackageScanDefinition();
			case SpringPackage.PHP_EXPRESSION: return createPhpExpression();
			case SpringPackage.PIPELINE_DEFINITION: return createPipelineDefinition();
			case SpringPackage.POLICY_DEFINITION: return createPolicyDefinition();
			case SpringPackage.POLL_ENRICH_DEFINITION: return createPollEnrichDefinition();
			case SpringPackage.PROCESS_DEFINITION: return createProcessDefinition();
			case SpringPackage.PROCESSOR_DEFINITION_HELPER: return createProcessorDefinitionHelper();
			case SpringPackage.PROPERTIES_DEFINITION: return createPropertiesDefinition();
			case SpringPackage.PROPERTY_DEFINITION: return createPropertyDefinition();
			case SpringPackage.PROPERTY_EXPRESSION: return createPropertyExpression();
			case SpringPackage.PROTOBUF_DATA_FORMAT: return createProtobufDataFormat();
			case SpringPackage.PYTHON_EXPRESSION: return createPythonExpression();
			case SpringPackage.RANDOM_LOAD_BALANCER_DEFINITION: return createRandomLoadBalancerDefinition();
			case SpringPackage.RECIPIENT_LIST_DEFINITION: return createRecipientListDefinition();
			case SpringPackage.REDELIVERY_POLICY_DEFINITION: return createRedeliveryPolicyDefinition();
			case SpringPackage.REF_EXPRESSION: return createRefExpression();
			case SpringPackage.REMOVE_HEADER_DEFINITION: return createRemoveHeaderDefinition();
			case SpringPackage.REMOVE_HEADERS_DEFINITION: return createRemoveHeadersDefinition();
			case SpringPackage.REMOVE_PROPERTY_DEFINITION: return createRemovePropertyDefinition();
			case SpringPackage.RESEQUENCE_DEFINITION: return createResequenceDefinition();
			case SpringPackage.ROLLBACK_DEFINITION: return createRollbackDefinition();
			case SpringPackage.ROUND_ROBIN_LOAD_BALANCER_DEFINITION: return createRoundRobinLoadBalancerDefinition();
			case SpringPackage.ROUTE_BUILDER_DEFINITION: return createRouteBuilderDefinition();
			case SpringPackage.ROUTE_CONTEXT_REF_DEFINITION: return createRouteContextRefDefinition();
			case SpringPackage.ROUTE_DEFINITION: return createRouteDefinition();
			case SpringPackage.ROUTE_DEFINITION_HELPER: return createRouteDefinitionHelper();
			case SpringPackage.ROUTES_DEFINITION: return createRoutesDefinition();
			case SpringPackage.ROUTING_SLIP_DEFINITION: return createRoutingSlipDefinition();
			case SpringPackage.RSS_DATA_FORMAT: return createRssDataFormat();
			case SpringPackage.RUBY_EXPRESSION: return createRubyExpression();
			case SpringPackage.SAMPLING_DEFINITION: return createSamplingDefinition();
			case SpringPackage.SECURE_RANDOM_PARAMETERS_FACTORY_BEAN: return createSecureRandomParametersFactoryBean();
			case SpringPackage.SECURE_SOCKET_PROTOCOLS_PARAMETERS: return createSecureSocketProtocolsParameters();
			case SpringPackage.SERIALIZATION_DATA_FORMAT: return createSerializationDataFormat();
			case SpringPackage.SET_BODY_DEFINITION: return createSetBodyDefinition();
			case SpringPackage.SET_EXCHANGE_PATTERN_DEFINITION: return createSetExchangePatternDefinition();
			case SpringPackage.SET_FAULT_BODY_DEFINITION: return createSetFaultBodyDefinition();
			case SpringPackage.SET_HEADER_DEFINITION: return createSetHeaderDefinition();
			case SpringPackage.SET_OUT_HEADER_DEFINITION: return createSetOutHeaderDefinition();
			case SpringPackage.SET_PROPERTY_DEFINITION: return createSetPropertyDefinition();
			case SpringPackage.SIMPLE_EXPRESSION: return createSimpleExpression();
			case SpringPackage.SOAP_JAXB_DATA_FORMAT: return createSoapJaxbDataFormat();
			case SpringPackage.SORT_DEFINITION: return createSortDefinition();
			case SpringPackage.SP_EL_EXPRESSION: return createSpELExpression();
			case SpringPackage.SPLIT_DEFINITION: return createSplitDefinition();
			case SpringPackage.SQL_EXPRESSION: return createSqlExpression();
			case SpringPackage.SSL_CONTEXT_CLIENT_PARAMETERS_FACTORY_BEAN: return createSslContextClientParametersFactoryBean();
			case SpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN: return createSslContextParametersFactoryBean();
			case SpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN: return createSslContextServerParametersFactoryBean();
			case SpringPackage.STICKY_LOAD_BALANCER_DEFINITION: return createStickyLoadBalancerDefinition();
			case SpringPackage.STOP_DEFINITION: return createStopDefinition();
			case SpringPackage.STREAM_RESEQUENCER_CONFIG: return createStreamResequencerConfig();
			case SpringPackage.STRING_DATA_FORMAT: return createStringDataFormat();
			case SpringPackage.SYSLOG_DATA_FORMAT: return createSyslogDataFormat();
			case SpringPackage.THREAD_POOL_PROFILE_DEFINITION: return createThreadPoolProfileDefinition();
			case SpringPackage.THREADS_DEFINITION: return createThreadsDefinition();
			case SpringPackage.THROTTLE_DEFINITION: return createThrottleDefinition();
			case SpringPackage.THROW_EXCEPTION_DEFINITION: return createThrowExceptionDefinition();
			case SpringPackage.TIDY_MARKUP_DATA_FORMAT: return createTidyMarkupDataFormat();
			case SpringPackage.TO_DEFINITION: return createToDefinition();
			case SpringPackage.TOKENIZER_EXPRESSION: return createTokenizerExpression();
			case SpringPackage.TOPIC_LOAD_BALANCER_DEFINITION: return createTopicLoadBalancerDefinition();
			case SpringPackage.TRANSACTED_DEFINITION: return createTransactedDefinition();
			case SpringPackage.TRANSFORM_DEFINITION: return createTransformDefinition();
			case SpringPackage.TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN: return createTrustManagersParametersFactoryBean();
			case SpringPackage.TRY_DEFINITION: return createTryDefinition();
			case SpringPackage.UNMARSHAL_DEFINITION: return createUnmarshalDefinition();
			case SpringPackage.VALIDATE_DEFINITION: return createValidateDefinition();
			case SpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION: return createWeightedLoadBalancerDefinition();
			case SpringPackage.WHEN_DEFINITION: return createWhenDefinition();
			case SpringPackage.WIRE_TAP_DEFINITION: return createWireTapDefinition();
			case SpringPackage.XML_BEANS_DATA_FORMAT: return createXmlBeansDataFormat();
			case SpringPackage.XML_SECURITY_DATA_FORMAT: return createXmlSecurityDataFormat();
			case SpringPackage.XPATH_EXPRESSION: return createXPathExpression();
			case SpringPackage.XQUERY_EXPRESSION: return createXQueryExpression();
			case SpringPackage.XSTREAM_DATA_FORMAT: return createXStreamDataFormat();
			case SpringPackage.ZIP_DATA_FORMAT: return createZipDataFormat();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SpringPackage.BINDY_TYPE:
				return createBindyTypeFromString(eDataType, initialValue);
			case SpringPackage.ERROR_HANDLER_TYPE:
				return createErrorHandlerTypeFromString(eDataType, initialValue);
			case SpringPackage.EXCHANGE_PATTERN:
				return createExchangePatternFromString(eDataType, initialValue);
			case SpringPackage.JSON_LIBRARY:
				return createJsonLibraryFromString(eDataType, initialValue);
			case SpringPackage.LOGGING_LEVEL:
				return createLoggingLevelFromString(eDataType, initialValue);
			case SpringPackage.MANAGEMENT_STATISTICS_LEVEL:
				return createManagementStatisticsLevelFromString(eDataType, initialValue);
			case SpringPackage.SHUTDOWN_ROUTE:
				return createShutdownRouteFromString(eDataType, initialValue);
			case SpringPackage.SHUTDOWN_RUNNING_TASK:
				return createShutdownRunningTaskFromString(eDataType, initialValue);
			case SpringPackage.THREAD_POOL_REJECTED_POLICY:
				return createThreadPoolRejectedPolicyFromString(eDataType, initialValue);
			case SpringPackage.WAIT_FOR_TASK_TO_COMPLETE:
				return createWaitForTaskToCompleteFromString(eDataType, initialValue);
			case SpringPackage.BINDY_TYPE_OBJECT:
				return createBindyTypeObjectFromString(eDataType, initialValue);
			case SpringPackage.CLASSES_TYPE:
				return createClassesTypeFromString(eDataType, initialValue);
			case SpringPackage.ERROR_HANDLER_TYPE_OBJECT:
				return createErrorHandlerTypeObjectFromString(eDataType, initialValue);
			case SpringPackage.EXCHANGE_PATTERN_OBJECT:
				return createExchangePatternObjectFromString(eDataType, initialValue);
			case SpringPackage.JSON_LIBRARY_OBJECT:
				return createJsonLibraryObjectFromString(eDataType, initialValue);
			case SpringPackage.LOGGING_LEVEL_OBJECT:
				return createLoggingLevelObjectFromString(eDataType, initialValue);
			case SpringPackage.MANAGEMENT_STATISTICS_LEVEL_OBJECT:
				return createManagementStatisticsLevelObjectFromString(eDataType, initialValue);
			case SpringPackage.PACKAGES_TYPE:
				return createPackagesTypeFromString(eDataType, initialValue);
			case SpringPackage.PACKAGES_TYPE1:
				return createPackagesType1FromString(eDataType, initialValue);
			case SpringPackage.SHUTDOWN_ROUTE_OBJECT:
				return createShutdownRouteObjectFromString(eDataType, initialValue);
			case SpringPackage.SHUTDOWN_RUNNING_TASK_OBJECT:
				return createShutdownRunningTaskObjectFromString(eDataType, initialValue);
			case SpringPackage.THREAD_POOL_REJECTED_POLICY_OBJECT:
				return createThreadPoolRejectedPolicyObjectFromString(eDataType, initialValue);
			case SpringPackage.WAIT_FOR_TASK_TO_COMPLETE_OBJECT:
				return createWaitForTaskToCompleteObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SpringPackage.BINDY_TYPE:
				return convertBindyTypeToString(eDataType, instanceValue);
			case SpringPackage.ERROR_HANDLER_TYPE:
				return convertErrorHandlerTypeToString(eDataType, instanceValue);
			case SpringPackage.EXCHANGE_PATTERN:
				return convertExchangePatternToString(eDataType, instanceValue);
			case SpringPackage.JSON_LIBRARY:
				return convertJsonLibraryToString(eDataType, instanceValue);
			case SpringPackage.LOGGING_LEVEL:
				return convertLoggingLevelToString(eDataType, instanceValue);
			case SpringPackage.MANAGEMENT_STATISTICS_LEVEL:
				return convertManagementStatisticsLevelToString(eDataType, instanceValue);
			case SpringPackage.SHUTDOWN_ROUTE:
				return convertShutdownRouteToString(eDataType, instanceValue);
			case SpringPackage.SHUTDOWN_RUNNING_TASK:
				return convertShutdownRunningTaskToString(eDataType, instanceValue);
			case SpringPackage.THREAD_POOL_REJECTED_POLICY:
				return convertThreadPoolRejectedPolicyToString(eDataType, instanceValue);
			case SpringPackage.WAIT_FOR_TASK_TO_COMPLETE:
				return convertWaitForTaskToCompleteToString(eDataType, instanceValue);
			case SpringPackage.BINDY_TYPE_OBJECT:
				return convertBindyTypeObjectToString(eDataType, instanceValue);
			case SpringPackage.CLASSES_TYPE:
				return convertClassesTypeToString(eDataType, instanceValue);
			case SpringPackage.ERROR_HANDLER_TYPE_OBJECT:
				return convertErrorHandlerTypeObjectToString(eDataType, instanceValue);
			case SpringPackage.EXCHANGE_PATTERN_OBJECT:
				return convertExchangePatternObjectToString(eDataType, instanceValue);
			case SpringPackage.JSON_LIBRARY_OBJECT:
				return convertJsonLibraryObjectToString(eDataType, instanceValue);
			case SpringPackage.LOGGING_LEVEL_OBJECT:
				return convertLoggingLevelObjectToString(eDataType, instanceValue);
			case SpringPackage.MANAGEMENT_STATISTICS_LEVEL_OBJECT:
				return convertManagementStatisticsLevelObjectToString(eDataType, instanceValue);
			case SpringPackage.PACKAGES_TYPE:
				return convertPackagesTypeToString(eDataType, instanceValue);
			case SpringPackage.PACKAGES_TYPE1:
				return convertPackagesType1ToString(eDataType, instanceValue);
			case SpringPackage.SHUTDOWN_ROUTE_OBJECT:
				return convertShutdownRouteObjectToString(eDataType, instanceValue);
			case SpringPackage.SHUTDOWN_RUNNING_TASK_OBJECT:
				return convertShutdownRunningTaskObjectToString(eDataType, instanceValue);
			case SpringPackage.THREAD_POOL_REJECTED_POLICY_OBJECT:
				return convertThreadPoolRejectedPolicyObjectToString(eDataType, instanceValue);
			case SpringPackage.WAIT_FOR_TASK_TO_COMPLETE_OBJECT:
				return convertWaitForTaskToCompleteObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateDefinition createAggregateDefinition() {
		AggregateDefinitionImpl aggregateDefinition = new AggregateDefinitionImpl();
		return aggregateDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasEntry createAliasEntry() {
		AliasEntryImpl aliasEntry = new AliasEntryImpl();
		return aliasEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasList createAliasList() {
		AliasListImpl aliasList = new AliasListImpl();
		return aliasList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AopDefinition createAopDefinition() {
		AopDefinitionImpl aopDefinition = new AopDefinitionImpl();
		return aopDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatchResequencerConfig createBatchResequencerConfig() {
		BatchResequencerConfigImpl batchResequencerConfig = new BatchResequencerConfigImpl();
		return batchResequencerConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeanDefinition createBeanDefinition() {
		BeanDefinitionImpl beanDefinition = new BeanDefinitionImpl();
		return beanDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindyDataFormat createBindyDataFormat() {
		BindyDataFormatImpl bindyDataFormat = new BindyDataFormatImpl();
		return bindyDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelBeanPostProcessor createCamelBeanPostProcessor() {
		CamelBeanPostProcessorImpl camelBeanPostProcessor = new CamelBeanPostProcessorImpl();
		return camelBeanPostProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelConsumerTemplateFactoryBean createCamelConsumerTemplateFactoryBean() {
		CamelConsumerTemplateFactoryBeanImpl camelConsumerTemplateFactoryBean = new CamelConsumerTemplateFactoryBeanImpl();
		return camelConsumerTemplateFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelContextFactoryBean createCamelContextFactoryBean() {
		CamelContextFactoryBeanImpl camelContextFactoryBean = new CamelContextFactoryBeanImpl();
		return camelContextFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelEndpointFactoryBean createCamelEndpointFactoryBean() {
		CamelEndpointFactoryBeanImpl camelEndpointFactoryBean = new CamelEndpointFactoryBeanImpl();
		return camelEndpointFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelJMXAgentDefinition createCamelJMXAgentDefinition() {
		CamelJMXAgentDefinitionImpl camelJMXAgentDefinition = new CamelJMXAgentDefinitionImpl();
		return camelJMXAgentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelProducerTemplateFactoryBean createCamelProducerTemplateFactoryBean() {
		CamelProducerTemplateFactoryBeanImpl camelProducerTemplateFactoryBean = new CamelProducerTemplateFactoryBeanImpl();
		return camelProducerTemplateFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelPropertyPlaceholderDefinition createCamelPropertyPlaceholderDefinition() {
		CamelPropertyPlaceholderDefinitionImpl camelPropertyPlaceholderDefinition = new CamelPropertyPlaceholderDefinitionImpl();
		return camelPropertyPlaceholderDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelProxyFactoryDefinition createCamelProxyFactoryDefinition() {
		CamelProxyFactoryDefinitionImpl camelProxyFactoryDefinition = new CamelProxyFactoryDefinitionImpl();
		return camelProxyFactoryDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelRedeliveryPolicyFactoryBean createCamelRedeliveryPolicyFactoryBean() {
		CamelRedeliveryPolicyFactoryBeanImpl camelRedeliveryPolicyFactoryBean = new CamelRedeliveryPolicyFactoryBeanImpl();
		return camelRedeliveryPolicyFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelRouteContextFactoryBean createCamelRouteContextFactoryBean() {
		CamelRouteContextFactoryBeanImpl camelRouteContextFactoryBean = new CamelRouteContextFactoryBeanImpl();
		return camelRouteContextFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelServiceExporterDefinition createCamelServiceExporterDefinition() {
		CamelServiceExporterDefinitionImpl camelServiceExporterDefinition = new CamelServiceExporterDefinitionImpl();
		return camelServiceExporterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamelThreadPoolFactoryBean createCamelThreadPoolFactoryBean() {
		CamelThreadPoolFactoryBeanImpl camelThreadPoolFactoryBean = new CamelThreadPoolFactoryBeanImpl();
		return camelThreadPoolFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CastorDataFormat createCastorDataFormat() {
		CastorDataFormatImpl castorDataFormat = new CastorDataFormatImpl();
		return castorDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatchDefinition createCatchDefinition() {
		CatchDefinitionImpl catchDefinition = new CatchDefinitionImpl();
		return catchDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceDefinition createChoiceDefinition() {
		ChoiceDefinitionImpl choiceDefinition = new ChoiceDefinitionImpl();
		return choiceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CipherSuitesParameters createCipherSuitesParameters() {
		CipherSuitesParametersImpl cipherSuitesParameters = new CipherSuitesParametersImpl();
		return cipherSuitesParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantExpression createConstantExpression() {
		ConstantExpressionImpl constantExpression = new ConstantExpressionImpl();
		return constantExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constants createConstants() {
		ConstantsImpl constants = new ConstantsImpl();
		return constants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextScanDefinition createContextScanDefinition() {
		ContextScanDefinitionImpl contextScanDefinition = new ContextScanDefinitionImpl();
		return contextScanDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConvertBodyDefinition createConvertBodyDefinition() {
		ConvertBodyDefinitionImpl convertBodyDefinition = new ConvertBodyDefinitionImpl();
		return convertBodyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConverterEntry createConverterEntry() {
		ConverterEntryImpl converterEntry = new ConverterEntryImpl();
		return converterEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConverterList createConverterList() {
		ConverterListImpl converterList = new ConverterListImpl();
		return converterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoDataFormat createCryptoDataFormat() {
		CryptoDataFormatImpl cryptoDataFormat = new CryptoDataFormatImpl();
		return cryptoDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsvDataFormat createCsvDataFormat() {
		CsvDataFormatImpl csvDataFormat = new CsvDataFormatImpl();
		return csvDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomDataFormat createCustomDataFormat() {
		CustomDataFormatImpl customDataFormat = new CustomDataFormatImpl();
		return customDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomLoadBalancerDefinition createCustomLoadBalancerDefinition() {
		CustomLoadBalancerDefinitionImpl customLoadBalancerDefinition = new CustomLoadBalancerDefinitionImpl();
		return customLoadBalancerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFormat createDataFormat() {
		DataFormatImpl dataFormat = new DataFormatImpl();
		return dataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFormatsDefinition createDataFormatsDefinition() {
		DataFormatsDefinitionImpl dataFormatsDefinition = new DataFormatsDefinitionImpl();
		return dataFormatsDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayDefinition createDelayDefinition() {
		DelayDefinitionImpl delayDefinition = new DelayDefinitionImpl();
		return delayDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionDefinition createDescriptionDefinition() {
		DescriptionDefinitionImpl descriptionDefinition = new DescriptionDefinitionImpl();
		return descriptionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicRouterDefinition createDynamicRouterDefinition() {
		DynamicRouterDefinitionImpl dynamicRouterDefinition = new DynamicRouterDefinitionImpl();
		return dynamicRouterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElExpression createElExpression() {
		ElExpressionImpl elExpression = new ElExpressionImpl();
		return elExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrichDefinition createEnrichDefinition() {
		EnrichDefinitionImpl enrichDefinition = new EnrichDefinitionImpl();
		return enrichDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorHandlerDefinition createErrorHandlerDefinition() {
		ErrorHandlerDefinitionImpl errorHandlerDefinition = new ErrorHandlerDefinitionImpl();
		return errorHandlerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionNode createExpressionNode() {
		ExpressionNodeImpl expressionNode = new ExpressionNodeImpl();
		return expressionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionSubElementDefinition createExpressionSubElementDefinition() {
		ExpressionSubElementDefinitionImpl expressionSubElementDefinition = new ExpressionSubElementDefinitionImpl();
		return expressionSubElementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailoverLoadBalancerDefinition createFailoverLoadBalancerDefinition() {
		FailoverLoadBalancerDefinitionImpl failoverLoadBalancerDefinition = new FailoverLoadBalancerDefinitionImpl();
		return failoverLoadBalancerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterDefinition createFilterDefinition() {
		FilterDefinitionImpl filterDefinition = new FilterDefinitionImpl();
		return filterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterParameters createFilterParameters() {
		FilterParametersImpl filterParameters = new FilterParametersImpl();
		return filterParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinallyDefinition createFinallyDefinition() {
		FinallyDefinitionImpl finallyDefinition = new FinallyDefinitionImpl();
		return finallyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlatpackDataFormat createFlatpackDataFormat() {
		FlatpackDataFormatImpl flatpackDataFormat = new FlatpackDataFormatImpl();
		return flatpackDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromDefinition createFromDefinition() {
		FromDefinitionImpl fromDefinition = new FromDefinitionImpl();
		return fromDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroovyExpression createGroovyExpression() {
		GroovyExpressionImpl groovyExpression = new GroovyExpressionImpl();
		return groovyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GzipDataFormat createGzipDataFormat() {
		GzipDataFormatImpl gzipDataFormat = new GzipDataFormatImpl();
		return gzipDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderExpression createHeaderExpression() {
		HeaderExpressionImpl headerExpression = new HeaderExpressionImpl();
		return headerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hl7DataFormat createHl7DataFormat() {
		Hl7DataFormatImpl hl7DataFormat = new Hl7DataFormatImpl();
		return hl7DataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdempotentConsumerDefinition createIdempotentConsumerDefinition() {
		IdempotentConsumerDefinitionImpl idempotentConsumerDefinition = new IdempotentConsumerDefinitionImpl();
		return idempotentConsumerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitCollectionEntry createImplicitCollectionEntry() {
		ImplicitCollectionEntryImpl implicitCollectionEntry = new ImplicitCollectionEntryImpl();
		return implicitCollectionEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitCollectionList createImplicitCollectionList() {
		ImplicitCollectionListImpl implicitCollectionList = new ImplicitCollectionListImpl();
		return implicitCollectionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InOnlyDefinition createInOnlyDefinition() {
		InOnlyDefinitionImpl inOnlyDefinition = new InOnlyDefinitionImpl();
		return inOnlyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InOutDefinition createInOutDefinition() {
		InOutDefinitionImpl inOutDefinition = new InOutDefinitionImpl();
		return inOutDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterceptDefinition createInterceptDefinition() {
		InterceptDefinitionImpl interceptDefinition = new InterceptDefinitionImpl();
		return interceptDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterceptFromDefinition createInterceptFromDefinition() {
		InterceptFromDefinitionImpl interceptFromDefinition = new InterceptFromDefinitionImpl();
		return interceptFromDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterceptSendToEndpointDefinition createInterceptSendToEndpointDefinition() {
		InterceptSendToEndpointDefinitionImpl interceptSendToEndpointDefinition = new InterceptSendToEndpointDefinitionImpl();
		return interceptSendToEndpointDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaScriptExpression createJavaScriptExpression() {
		JavaScriptExpressionImpl javaScriptExpression = new JavaScriptExpressionImpl();
		return javaScriptExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JaxbDataFormat createJaxbDataFormat() {
		JaxbDataFormatImpl jaxbDataFormat = new JaxbDataFormatImpl();
		return jaxbDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JibxDataFormat createJibxDataFormat() {
		JibxDataFormatImpl jibxDataFormat = new JibxDataFormatImpl();
		return jibxDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonDataFormat createJsonDataFormat() {
		JsonDataFormatImpl jsonDataFormat = new JsonDataFormatImpl();
		return jsonDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JxPathExpression createJxPathExpression() {
		JxPathExpressionImpl jxPathExpression = new JxPathExpressionImpl();
		return jxPathExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyManagersParametersFactoryBean createKeyManagersParametersFactoryBean() {
		KeyManagersParametersFactoryBeanImpl keyManagersParametersFactoryBean = new KeyManagersParametersFactoryBeanImpl();
		return keyManagersParametersFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyStoreParametersFactoryBean createKeyStoreParametersFactoryBean() {
		KeyStoreParametersFactoryBeanImpl keyStoreParametersFactoryBean = new KeyStoreParametersFactoryBeanImpl();
		return keyStoreParametersFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageExpression createLanguageExpression() {
		LanguageExpressionImpl languageExpression = new LanguageExpressionImpl();
		return languageExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalanceDefinition createLoadBalanceDefinition() {
		LoadBalanceDefinitionImpl loadBalanceDefinition = new LoadBalanceDefinitionImpl();
		return loadBalanceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalancer createLoadBalancer() {
		LoadBalancerImpl loadBalancer = new LoadBalancerImpl();
		return loadBalancer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogDefinition createLogDefinition() {
		LogDefinitionImpl logDefinition = new LogDefinitionImpl();
		return logDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopDefinition createLoopDefinition() {
		LoopDefinitionImpl loopDefinition = new LoopDefinitionImpl();
		return loopDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarshalDefinition createMarshalDefinition() {
		MarshalDefinitionImpl marshalDefinition = new MarshalDefinitionImpl();
		return marshalDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCallExpression createMethodCallExpression() {
		MethodCallExpressionImpl methodCallExpression = new MethodCallExpressionImpl();
		return methodCallExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MulticastDefinition createMulticastDefinition() {
		MulticastDefinitionImpl multicastDefinition = new MulticastDefinitionImpl();
		return multicastDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MvelExpression createMvelExpression() {
		MvelExpressionImpl mvelExpression = new MvelExpressionImpl();
		return mvelExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeFactory createNodeFactory() {
		NodeFactoryImpl nodeFactory = new NodeFactoryImpl();
		return nodeFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoOutputExpressionNode createNoOutputExpressionNode() {
		NoOutputExpressionNodeImpl noOutputExpressionNode = new NoOutputExpressionNodeImpl();
		return noOutputExpressionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OgnlExpression createOgnlExpression() {
		OgnlExpressionImpl ognlExpression = new OgnlExpressionImpl();
		return ognlExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OmitFieldEntry createOmitFieldEntry() {
		OmitFieldEntryImpl omitFieldEntry = new OmitFieldEntryImpl();
		return omitFieldEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OmitFieldList createOmitFieldList() {
		OmitFieldListImpl omitFieldList = new OmitFieldListImpl();
		return omitFieldList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnCompletionDefinition createOnCompletionDefinition() {
		OnCompletionDefinitionImpl onCompletionDefinition = new OnCompletionDefinitionImpl();
		return onCompletionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnExceptionDefinition createOnExceptionDefinition() {
		OnExceptionDefinitionImpl onExceptionDefinition = new OnExceptionDefinitionImpl();
		return onExceptionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherwiseDefinition createOtherwiseDefinition() {
		OtherwiseDefinitionImpl otherwiseDefinition = new OtherwiseDefinitionImpl();
		return otherwiseDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageScanDefinition createPackageScanDefinition() {
		PackageScanDefinitionImpl packageScanDefinition = new PackageScanDefinitionImpl();
		return packageScanDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhpExpression createPhpExpression() {
		PhpExpressionImpl phpExpression = new PhpExpressionImpl();
		return phpExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelineDefinition createPipelineDefinition() {
		PipelineDefinitionImpl pipelineDefinition = new PipelineDefinitionImpl();
		return pipelineDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyDefinition createPolicyDefinition() {
		PolicyDefinitionImpl policyDefinition = new PolicyDefinitionImpl();
		return policyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PollEnrichDefinition createPollEnrichDefinition() {
		PollEnrichDefinitionImpl pollEnrichDefinition = new PollEnrichDefinitionImpl();
		return pollEnrichDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessDefinition createProcessDefinition() {
		ProcessDefinitionImpl processDefinition = new ProcessDefinitionImpl();
		return processDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorDefinitionHelper createProcessorDefinitionHelper() {
		ProcessorDefinitionHelperImpl processorDefinitionHelper = new ProcessorDefinitionHelperImpl();
		return processorDefinitionHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesDefinition createPropertiesDefinition() {
		PropertiesDefinitionImpl propertiesDefinition = new PropertiesDefinitionImpl();
		return propertiesDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyDefinition createPropertyDefinition() {
		PropertyDefinitionImpl propertyDefinition = new PropertyDefinitionImpl();
		return propertyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyExpression createPropertyExpression() {
		PropertyExpressionImpl propertyExpression = new PropertyExpressionImpl();
		return propertyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtobufDataFormat createProtobufDataFormat() {
		ProtobufDataFormatImpl protobufDataFormat = new ProtobufDataFormatImpl();
		return protobufDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PythonExpression createPythonExpression() {
		PythonExpressionImpl pythonExpression = new PythonExpressionImpl();
		return pythonExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RandomLoadBalancerDefinition createRandomLoadBalancerDefinition() {
		RandomLoadBalancerDefinitionImpl randomLoadBalancerDefinition = new RandomLoadBalancerDefinitionImpl();
		return randomLoadBalancerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipientListDefinition createRecipientListDefinition() {
		RecipientListDefinitionImpl recipientListDefinition = new RecipientListDefinitionImpl();
		return recipientListDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedeliveryPolicyDefinition createRedeliveryPolicyDefinition() {
		RedeliveryPolicyDefinitionImpl redeliveryPolicyDefinition = new RedeliveryPolicyDefinitionImpl();
		return redeliveryPolicyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefExpression createRefExpression() {
		RefExpressionImpl refExpression = new RefExpressionImpl();
		return refExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveHeaderDefinition createRemoveHeaderDefinition() {
		RemoveHeaderDefinitionImpl removeHeaderDefinition = new RemoveHeaderDefinitionImpl();
		return removeHeaderDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveHeadersDefinition createRemoveHeadersDefinition() {
		RemoveHeadersDefinitionImpl removeHeadersDefinition = new RemoveHeadersDefinitionImpl();
		return removeHeadersDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemovePropertyDefinition createRemovePropertyDefinition() {
		RemovePropertyDefinitionImpl removePropertyDefinition = new RemovePropertyDefinitionImpl();
		return removePropertyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResequenceDefinition createResequenceDefinition() {
		ResequenceDefinitionImpl resequenceDefinition = new ResequenceDefinitionImpl();
		return resequenceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RollbackDefinition createRollbackDefinition() {
		RollbackDefinitionImpl rollbackDefinition = new RollbackDefinitionImpl();
		return rollbackDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoundRobinLoadBalancerDefinition createRoundRobinLoadBalancerDefinition() {
		RoundRobinLoadBalancerDefinitionImpl roundRobinLoadBalancerDefinition = new RoundRobinLoadBalancerDefinitionImpl();
		return roundRobinLoadBalancerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteBuilderDefinition createRouteBuilderDefinition() {
		RouteBuilderDefinitionImpl routeBuilderDefinition = new RouteBuilderDefinitionImpl();
		return routeBuilderDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteContextRefDefinition createRouteContextRefDefinition() {
		RouteContextRefDefinitionImpl routeContextRefDefinition = new RouteContextRefDefinitionImpl();
		return routeContextRefDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteDefinition createRouteDefinition() {
		RouteDefinitionImpl routeDefinition = new RouteDefinitionImpl();
		return routeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteDefinitionHelper createRouteDefinitionHelper() {
		RouteDefinitionHelperImpl routeDefinitionHelper = new RouteDefinitionHelperImpl();
		return routeDefinitionHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutesDefinition createRoutesDefinition() {
		RoutesDefinitionImpl routesDefinition = new RoutesDefinitionImpl();
		return routesDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutingSlipDefinition createRoutingSlipDefinition() {
		RoutingSlipDefinitionImpl routingSlipDefinition = new RoutingSlipDefinitionImpl();
		return routingSlipDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RssDataFormat createRssDataFormat() {
		RssDataFormatImpl rssDataFormat = new RssDataFormatImpl();
		return rssDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyExpression createRubyExpression() {
		RubyExpressionImpl rubyExpression = new RubyExpressionImpl();
		return rubyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SamplingDefinition createSamplingDefinition() {
		SamplingDefinitionImpl samplingDefinition = new SamplingDefinitionImpl();
		return samplingDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecureRandomParametersFactoryBean createSecureRandomParametersFactoryBean() {
		SecureRandomParametersFactoryBeanImpl secureRandomParametersFactoryBean = new SecureRandomParametersFactoryBeanImpl();
		return secureRandomParametersFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecureSocketProtocolsParameters createSecureSocketProtocolsParameters() {
		SecureSocketProtocolsParametersImpl secureSocketProtocolsParameters = new SecureSocketProtocolsParametersImpl();
		return secureSocketProtocolsParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializationDataFormat createSerializationDataFormat() {
		SerializationDataFormatImpl serializationDataFormat = new SerializationDataFormatImpl();
		return serializationDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetBodyDefinition createSetBodyDefinition() {
		SetBodyDefinitionImpl setBodyDefinition = new SetBodyDefinitionImpl();
		return setBodyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetExchangePatternDefinition createSetExchangePatternDefinition() {
		SetExchangePatternDefinitionImpl setExchangePatternDefinition = new SetExchangePatternDefinitionImpl();
		return setExchangePatternDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetFaultBodyDefinition createSetFaultBodyDefinition() {
		SetFaultBodyDefinitionImpl setFaultBodyDefinition = new SetFaultBodyDefinitionImpl();
		return setFaultBodyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetHeaderDefinition createSetHeaderDefinition() {
		SetHeaderDefinitionImpl setHeaderDefinition = new SetHeaderDefinitionImpl();
		return setHeaderDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetOutHeaderDefinition createSetOutHeaderDefinition() {
		SetOutHeaderDefinitionImpl setOutHeaderDefinition = new SetOutHeaderDefinitionImpl();
		return setOutHeaderDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetPropertyDefinition createSetPropertyDefinition() {
		SetPropertyDefinitionImpl setPropertyDefinition = new SetPropertyDefinitionImpl();
		return setPropertyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleExpression createSimpleExpression() {
		SimpleExpressionImpl simpleExpression = new SimpleExpressionImpl();
		return simpleExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoapJaxbDataFormat createSoapJaxbDataFormat() {
		SoapJaxbDataFormatImpl soapJaxbDataFormat = new SoapJaxbDataFormatImpl();
		return soapJaxbDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortDefinition createSortDefinition() {
		SortDefinitionImpl sortDefinition = new SortDefinitionImpl();
		return sortDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpELExpression createSpELExpression() {
		SpELExpressionImpl spELExpression = new SpELExpressionImpl();
		return spELExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitDefinition createSplitDefinition() {
		SplitDefinitionImpl splitDefinition = new SplitDefinitionImpl();
		return splitDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlExpression createSqlExpression() {
		SqlExpressionImpl sqlExpression = new SqlExpressionImpl();
		return sqlExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SslContextClientParametersFactoryBean createSslContextClientParametersFactoryBean() {
		SslContextClientParametersFactoryBeanImpl sslContextClientParametersFactoryBean = new SslContextClientParametersFactoryBeanImpl();
		return sslContextClientParametersFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SslContextParametersFactoryBean createSslContextParametersFactoryBean() {
		SslContextParametersFactoryBeanImpl sslContextParametersFactoryBean = new SslContextParametersFactoryBeanImpl();
		return sslContextParametersFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SslContextServerParametersFactoryBean createSslContextServerParametersFactoryBean() {
		SslContextServerParametersFactoryBeanImpl sslContextServerParametersFactoryBean = new SslContextServerParametersFactoryBeanImpl();
		return sslContextServerParametersFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StickyLoadBalancerDefinition createStickyLoadBalancerDefinition() {
		StickyLoadBalancerDefinitionImpl stickyLoadBalancerDefinition = new StickyLoadBalancerDefinitionImpl();
		return stickyLoadBalancerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopDefinition createStopDefinition() {
		StopDefinitionImpl stopDefinition = new StopDefinitionImpl();
		return stopDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamResequencerConfig createStreamResequencerConfig() {
		StreamResequencerConfigImpl streamResequencerConfig = new StreamResequencerConfigImpl();
		return streamResequencerConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringDataFormat createStringDataFormat() {
		StringDataFormatImpl stringDataFormat = new StringDataFormatImpl();
		return stringDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyslogDataFormat createSyslogDataFormat() {
		SyslogDataFormatImpl syslogDataFormat = new SyslogDataFormatImpl();
		return syslogDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadPoolProfileDefinition createThreadPoolProfileDefinition() {
		ThreadPoolProfileDefinitionImpl threadPoolProfileDefinition = new ThreadPoolProfileDefinitionImpl();
		return threadPoolProfileDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadsDefinition createThreadsDefinition() {
		ThreadsDefinitionImpl threadsDefinition = new ThreadsDefinitionImpl();
		return threadsDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrottleDefinition createThrottleDefinition() {
		ThrottleDefinitionImpl throttleDefinition = new ThrottleDefinitionImpl();
		return throttleDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrowExceptionDefinition createThrowExceptionDefinition() {
		ThrowExceptionDefinitionImpl throwExceptionDefinition = new ThrowExceptionDefinitionImpl();
		return throwExceptionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TidyMarkupDataFormat createTidyMarkupDataFormat() {
		TidyMarkupDataFormatImpl tidyMarkupDataFormat = new TidyMarkupDataFormatImpl();
		return tidyMarkupDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToDefinition createToDefinition() {
		ToDefinitionImpl toDefinition = new ToDefinitionImpl();
		return toDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenizerExpression createTokenizerExpression() {
		TokenizerExpressionImpl tokenizerExpression = new TokenizerExpressionImpl();
		return tokenizerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopicLoadBalancerDefinition createTopicLoadBalancerDefinition() {
		TopicLoadBalancerDefinitionImpl topicLoadBalancerDefinition = new TopicLoadBalancerDefinitionImpl();
		return topicLoadBalancerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactedDefinition createTransactedDefinition() {
		TransactedDefinitionImpl transactedDefinition = new TransactedDefinitionImpl();
		return transactedDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformDefinition createTransformDefinition() {
		TransformDefinitionImpl transformDefinition = new TransformDefinitionImpl();
		return transformDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrustManagersParametersFactoryBean createTrustManagersParametersFactoryBean() {
		TrustManagersParametersFactoryBeanImpl trustManagersParametersFactoryBean = new TrustManagersParametersFactoryBeanImpl();
		return trustManagersParametersFactoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TryDefinition createTryDefinition() {
		TryDefinitionImpl tryDefinition = new TryDefinitionImpl();
		return tryDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnmarshalDefinition createUnmarshalDefinition() {
		UnmarshalDefinitionImpl unmarshalDefinition = new UnmarshalDefinitionImpl();
		return unmarshalDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidateDefinition createValidateDefinition() {
		ValidateDefinitionImpl validateDefinition = new ValidateDefinitionImpl();
		return validateDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeightedLoadBalancerDefinition createWeightedLoadBalancerDefinition() {
		WeightedLoadBalancerDefinitionImpl weightedLoadBalancerDefinition = new WeightedLoadBalancerDefinitionImpl();
		return weightedLoadBalancerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhenDefinition createWhenDefinition() {
		WhenDefinitionImpl whenDefinition = new WhenDefinitionImpl();
		return whenDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireTapDefinition createWireTapDefinition() {
		WireTapDefinitionImpl wireTapDefinition = new WireTapDefinitionImpl();
		return wireTapDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlBeansDataFormat createXmlBeansDataFormat() {
		XmlBeansDataFormatImpl xmlBeansDataFormat = new XmlBeansDataFormatImpl();
		return xmlBeansDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlSecurityDataFormat createXmlSecurityDataFormat() {
		XmlSecurityDataFormatImpl xmlSecurityDataFormat = new XmlSecurityDataFormatImpl();
		return xmlSecurityDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPathExpression createXPathExpression() {
		XPathExpressionImpl xPathExpression = new XPathExpressionImpl();
		return xPathExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XQueryExpression createXQueryExpression() {
		XQueryExpressionImpl xQueryExpression = new XQueryExpressionImpl();
		return xQueryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XStreamDataFormat createXStreamDataFormat() {
		XStreamDataFormatImpl xStreamDataFormat = new XStreamDataFormatImpl();
		return xStreamDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZipDataFormat createZipDataFormat() {
		ZipDataFormatImpl zipDataFormat = new ZipDataFormatImpl();
		return zipDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindyType createBindyTypeFromString(EDataType eDataType, String initialValue) {
		BindyType result = BindyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorHandlerType createErrorHandlerTypeFromString(EDataType eDataType, String initialValue) {
		ErrorHandlerType result = ErrorHandlerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertErrorHandlerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangePattern createExchangePatternFromString(EDataType eDataType, String initialValue) {
		ExchangePattern result = ExchangePattern.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExchangePatternToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonLibrary createJsonLibraryFromString(EDataType eDataType, String initialValue) {
		JsonLibrary result = JsonLibrary.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJsonLibraryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoggingLevel createLoggingLevelFromString(EDataType eDataType, String initialValue) {
		LoggingLevel result = LoggingLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoggingLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementStatisticsLevel createManagementStatisticsLevelFromString(EDataType eDataType, String initialValue) {
		ManagementStatisticsLevel result = ManagementStatisticsLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertManagementStatisticsLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShutdownRoute createShutdownRouteFromString(EDataType eDataType, String initialValue) {
		ShutdownRoute result = ShutdownRoute.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShutdownRouteToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShutdownRunningTask createShutdownRunningTaskFromString(EDataType eDataType, String initialValue) {
		ShutdownRunningTask result = ShutdownRunningTask.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShutdownRunningTaskToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadPoolRejectedPolicy createThreadPoolRejectedPolicyFromString(EDataType eDataType, String initialValue) {
		ThreadPoolRejectedPolicy result = ThreadPoolRejectedPolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThreadPoolRejectedPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitForTaskToComplete createWaitForTaskToCompleteFromString(EDataType eDataType, String initialValue) {
		WaitForTaskToComplete result = WaitForTaskToComplete.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWaitForTaskToCompleteToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindyType createBindyTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBindyTypeFromString(SpringPackage.eINSTANCE.getBindyType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindyTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBindyTypeToString(SpringPackage.eINSTANCE.getBindyType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createClassesTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassesTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorHandlerType createErrorHandlerTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createErrorHandlerTypeFromString(SpringPackage.eINSTANCE.getErrorHandlerType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertErrorHandlerTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertErrorHandlerTypeToString(SpringPackage.eINSTANCE.getErrorHandlerType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangePattern createExchangePatternObjectFromString(EDataType eDataType, String initialValue) {
		return createExchangePatternFromString(SpringPackage.eINSTANCE.getExchangePattern(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExchangePatternObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExchangePatternToString(SpringPackage.eINSTANCE.getExchangePattern(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonLibrary createJsonLibraryObjectFromString(EDataType eDataType, String initialValue) {
		return createJsonLibraryFromString(SpringPackage.eINSTANCE.getJsonLibrary(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJsonLibraryObjectToString(EDataType eDataType, Object instanceValue) {
		return convertJsonLibraryToString(SpringPackage.eINSTANCE.getJsonLibrary(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoggingLevel createLoggingLevelObjectFromString(EDataType eDataType, String initialValue) {
		return createLoggingLevelFromString(SpringPackage.eINSTANCE.getLoggingLevel(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoggingLevelObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLoggingLevelToString(SpringPackage.eINSTANCE.getLoggingLevel(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementStatisticsLevel createManagementStatisticsLevelObjectFromString(EDataType eDataType, String initialValue) {
		return createManagementStatisticsLevelFromString(SpringPackage.eINSTANCE.getManagementStatisticsLevel(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertManagementStatisticsLevelObjectToString(EDataType eDataType, Object instanceValue) {
		return convertManagementStatisticsLevelToString(SpringPackage.eINSTANCE.getManagementStatisticsLevel(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createPackagesTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPackagesTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createPackagesType1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPackagesType1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShutdownRoute createShutdownRouteObjectFromString(EDataType eDataType, String initialValue) {
		return createShutdownRouteFromString(SpringPackage.eINSTANCE.getShutdownRoute(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShutdownRouteObjectToString(EDataType eDataType, Object instanceValue) {
		return convertShutdownRouteToString(SpringPackage.eINSTANCE.getShutdownRoute(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShutdownRunningTask createShutdownRunningTaskObjectFromString(EDataType eDataType, String initialValue) {
		return createShutdownRunningTaskFromString(SpringPackage.eINSTANCE.getShutdownRunningTask(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShutdownRunningTaskObjectToString(EDataType eDataType, Object instanceValue) {
		return convertShutdownRunningTaskToString(SpringPackage.eINSTANCE.getShutdownRunningTask(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadPoolRejectedPolicy createThreadPoolRejectedPolicyObjectFromString(EDataType eDataType, String initialValue) {
		return createThreadPoolRejectedPolicyFromString(SpringPackage.eINSTANCE.getThreadPoolRejectedPolicy(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThreadPoolRejectedPolicyObjectToString(EDataType eDataType, Object instanceValue) {
		return convertThreadPoolRejectedPolicyToString(SpringPackage.eINSTANCE.getThreadPoolRejectedPolicy(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitForTaskToComplete createWaitForTaskToCompleteObjectFromString(EDataType eDataType, String initialValue) {
		return createWaitForTaskToCompleteFromString(SpringPackage.eINSTANCE.getWaitForTaskToComplete(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWaitForTaskToCompleteObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWaitForTaskToCompleteToString(SpringPackage.eINSTANCE.getWaitForTaskToComplete(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpringPackage getSpringPackage() {
		return (SpringPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpringPackage getPackage() {
		return SpringPackage.eINSTANCE;
	}

} //SpringFactoryImpl
