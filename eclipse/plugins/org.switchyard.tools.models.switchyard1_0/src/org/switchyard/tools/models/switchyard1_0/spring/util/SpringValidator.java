/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.switchyard.tools.models.switchyard1_0.spring.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage
 * @generated
 */
public class SpringValidator extends EObjectValidator {
	/**
     * The cached model package
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final SpringValidator INSTANCE = new SpringValidator();

	/**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
	public static final String DIAGNOSTIC_SOURCE = "org.switchyard.tools.models.switchyard1_0.spring";

	/**
     * A constant with a fixed name that can be used as the base value for additional hand written constants.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
     * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
     * The cached base package validator.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected XMLTypeValidator xmlTypeValidator;

	/**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SpringValidator() {
        super();
        xmlTypeValidator = XMLTypeValidator.INSTANCE;
    }

	/**
     * Returns the package of this validator switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EPackage getEPackage() {
      return SpringPackage.eINSTANCE;
    }

	/**
     * Calls <code>validateXXX</code> for the corresponding classifier of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
        switch (classifierID) {
            case SpringPackage.ABSTRACT_CAMEL_CONSUMER_TEMPLATE_FACTORY_BEAN:
                return validateAbstractCamelConsumerTemplateFactoryBean((AbstractCamelConsumerTemplateFactoryBean)value, diagnostics, context);
            case SpringPackage.ABSTRACT_CAMEL_CONTEXT_FACTORY_BEAN:
                return validateAbstractCamelContextFactoryBean((AbstractCamelContextFactoryBean)value, diagnostics, context);
            case SpringPackage.ABSTRACT_CAMEL_ENDPOINT_FACTORY_BEAN:
                return validateAbstractCamelEndpointFactoryBean((AbstractCamelEndpointFactoryBean)value, diagnostics, context);
            case SpringPackage.ABSTRACT_CAMEL_FACTORY_BEAN:
                return validateAbstractCamelFactoryBean((AbstractCamelFactoryBean)value, diagnostics, context);
            case SpringPackage.ABSTRACT_CAMEL_PRODUCER_TEMPLATE_FACTORY_BEAN:
                return validateAbstractCamelProducerTemplateFactoryBean((AbstractCamelProducerTemplateFactoryBean)value, diagnostics, context);
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN:
                return validateAbstractCamelRedeliveryPolicyFactoryBean((AbstractCamelRedeliveryPolicyFactoryBean)value, diagnostics, context);
            case SpringPackage.ABSTRACT_CAMEL_THREAD_POOL_FACTORY_BEAN:
                return validateAbstractCamelThreadPoolFactoryBean((AbstractCamelThreadPoolFactoryBean)value, diagnostics, context);
            case SpringPackage.ABSTRACT_JSSE_UTIL_FACTORY_BEAN:
                return validateAbstractJsseUtilFactoryBean((AbstractJsseUtilFactoryBean)value, diagnostics, context);
            case SpringPackage.ABSTRACT_KEY_MANAGERS_PARAMETERS_FACTORY_BEAN:
                return validateAbstractKeyManagersParametersFactoryBean((AbstractKeyManagersParametersFactoryBean)value, diagnostics, context);
            case SpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN:
                return validateAbstractKeyStoreParametersFactoryBean((AbstractKeyStoreParametersFactoryBean)value, diagnostics, context);
            case SpringPackage.ABSTRACT_SECURE_RANDOM_PARAMETERS_FACTORY_BEAN:
                return validateAbstractSecureRandomParametersFactoryBean((AbstractSecureRandomParametersFactoryBean)value, diagnostics, context);
            case SpringPackage.ABSTRACT_TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN:
                return validateAbstractTrustManagersParametersFactoryBean((AbstractTrustManagersParametersFactoryBean)value, diagnostics, context);
            case SpringPackage.AGGREGATE_DEFINITION:
                return validateAggregateDefinition((AggregateDefinition)value, diagnostics, context);
            case SpringPackage.ALIAS_ENTRY:
                return validateAliasEntry((AliasEntry)value, diagnostics, context);
            case SpringPackage.ALIAS_LIST:
                return validateAliasList((AliasList)value, diagnostics, context);
            case SpringPackage.AOP_DEFINITION:
                return validateAopDefinition((AopDefinition)value, diagnostics, context);
            case SpringPackage.BATCH_RESEQUENCER_CONFIG:
                return validateBatchResequencerConfig((BatchResequencerConfig)value, diagnostics, context);
            case SpringPackage.BEAN_DEFINITION:
                return validateBeanDefinition((BeanDefinition)value, diagnostics, context);
            case SpringPackage.BINDY_DATA_FORMAT:
                return validateBindyDataFormat((BindyDataFormat)value, diagnostics, context);
            case SpringPackage.CAMEL_BEAN_POST_PROCESSOR:
                return validateCamelBeanPostProcessor((CamelBeanPostProcessor)value, diagnostics, context);
            case SpringPackage.CAMEL_CONSUMER_TEMPLATE_FACTORY_BEAN:
                return validateCamelConsumerTemplateFactoryBean((CamelConsumerTemplateFactoryBean)value, diagnostics, context);
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN:
                return validateCamelContextFactoryBean((CamelContextFactoryBean)value, diagnostics, context);
            case SpringPackage.CAMEL_ENDPOINT_FACTORY_BEAN:
                return validateCamelEndpointFactoryBean((CamelEndpointFactoryBean)value, diagnostics, context);
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION:
                return validateCamelJMXAgentDefinition((CamelJMXAgentDefinition)value, diagnostics, context);
            case SpringPackage.CAMEL_PRODUCER_TEMPLATE_FACTORY_BEAN:
                return validateCamelProducerTemplateFactoryBean((CamelProducerTemplateFactoryBean)value, diagnostics, context);
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION:
                return validateCamelPropertyPlaceholderDefinition((CamelPropertyPlaceholderDefinition)value, diagnostics, context);
            case SpringPackage.CAMEL_PROXY_FACTORY_DEFINITION:
                return validateCamelProxyFactoryDefinition((CamelProxyFactoryDefinition)value, diagnostics, context);
            case SpringPackage.CAMEL_REDELIVERY_POLICY_FACTORY_BEAN:
                return validateCamelRedeliveryPolicyFactoryBean((CamelRedeliveryPolicyFactoryBean)value, diagnostics, context);
            case SpringPackage.CAMEL_ROUTE_CONTEXT_FACTORY_BEAN:
                return validateCamelRouteContextFactoryBean((CamelRouteContextFactoryBean)value, diagnostics, context);
            case SpringPackage.CAMEL_SERVICE_EXPORTER_DEFINITION:
                return validateCamelServiceExporterDefinition((CamelServiceExporterDefinition)value, diagnostics, context);
            case SpringPackage.CAMEL_THREAD_POOL_FACTORY_BEAN:
                return validateCamelThreadPoolFactoryBean((CamelThreadPoolFactoryBean)value, diagnostics, context);
            case SpringPackage.CASTOR_DATA_FORMAT:
                return validateCastorDataFormat((CastorDataFormat)value, diagnostics, context);
            case SpringPackage.CATCH_DEFINITION:
                return validateCatchDefinition((CatchDefinition)value, diagnostics, context);
            case SpringPackage.CHOICE_DEFINITION:
                return validateChoiceDefinition((ChoiceDefinition)value, diagnostics, context);
            case SpringPackage.CIPHER_SUITES_PARAMETERS:
                return validateCipherSuitesParameters((CipherSuitesParameters)value, diagnostics, context);
            case SpringPackage.CONSTANT_EXPRESSION:
                return validateConstantExpression((ConstantExpression)value, diagnostics, context);
            case SpringPackage.CONSTANTS:
                return validateConstants((Constants)value, diagnostics, context);
            case SpringPackage.CONTEXT_SCAN_DEFINITION:
                return validateContextScanDefinition((ContextScanDefinition)value, diagnostics, context);
            case SpringPackage.CONVERT_BODY_DEFINITION:
                return validateConvertBodyDefinition((ConvertBodyDefinition)value, diagnostics, context);
            case SpringPackage.CONVERTER_ENTRY:
                return validateConverterEntry((ConverterEntry)value, diagnostics, context);
            case SpringPackage.CONVERTER_LIST:
                return validateConverterList((ConverterList)value, diagnostics, context);
            case SpringPackage.CRYPTO_DATA_FORMAT:
                return validateCryptoDataFormat((CryptoDataFormat)value, diagnostics, context);
            case SpringPackage.CSV_DATA_FORMAT:
                return validateCsvDataFormat((CsvDataFormat)value, diagnostics, context);
            case SpringPackage.CUSTOM_DATA_FORMAT:
                return validateCustomDataFormat((CustomDataFormat)value, diagnostics, context);
            case SpringPackage.CUSTOM_LOAD_BALANCER_DEFINITION:
                return validateCustomLoadBalancerDefinition((CustomLoadBalancerDefinition)value, diagnostics, context);
            case SpringPackage.DATA_FORMAT:
                return validateDataFormat((DataFormat)value, diagnostics, context);
            case SpringPackage.DATA_FORMATS_DEFINITION:
                return validateDataFormatsDefinition((DataFormatsDefinition)value, diagnostics, context);
            case SpringPackage.DELAY_DEFINITION:
                return validateDelayDefinition((DelayDefinition)value, diagnostics, context);
            case SpringPackage.DESCRIPTION_DEFINITION:
                return validateDescriptionDefinition((DescriptionDefinition)value, diagnostics, context);
            case SpringPackage.DOCUMENT_ROOT:
                return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
            case SpringPackage.DYNAMIC_ROUTER_DEFINITION:
                return validateDynamicRouterDefinition((DynamicRouterDefinition)value, diagnostics, context);
            case SpringPackage.EL_EXPRESSION:
                return validateElExpression((ElExpression)value, diagnostics, context);
            case SpringPackage.ENRICH_DEFINITION:
                return validateEnrichDefinition((EnrichDefinition)value, diagnostics, context);
            case SpringPackage.ERROR_HANDLER_DEFINITION:
                return validateErrorHandlerDefinition((ErrorHandlerDefinition)value, diagnostics, context);
            case SpringPackage.EXPRESSION:
                return validateExpression((Expression)value, diagnostics, context);
            case SpringPackage.EXPRESSION_NODE:
                return validateExpressionNode((ExpressionNode)value, diagnostics, context);
            case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION:
                return validateExpressionSubElementDefinition((ExpressionSubElementDefinition)value, diagnostics, context);
            case SpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION:
                return validateFailoverLoadBalancerDefinition((FailoverLoadBalancerDefinition)value, diagnostics, context);
            case SpringPackage.FILTER_DEFINITION:
                return validateFilterDefinition((FilterDefinition)value, diagnostics, context);
            case SpringPackage.FILTER_PARAMETERS:
                return validateFilterParameters((FilterParameters)value, diagnostics, context);
            case SpringPackage.FINALLY_DEFINITION:
                return validateFinallyDefinition((FinallyDefinition)value, diagnostics, context);
            case SpringPackage.FLATPACK_DATA_FORMAT:
                return validateFlatpackDataFormat((FlatpackDataFormat)value, diagnostics, context);
            case SpringPackage.FROM_DEFINITION:
                return validateFromDefinition((FromDefinition)value, diagnostics, context);
            case SpringPackage.GROOVY_EXPRESSION:
                return validateGroovyExpression((GroovyExpression)value, diagnostics, context);
            case SpringPackage.GZIP_DATA_FORMAT:
                return validateGzipDataFormat((GzipDataFormat)value, diagnostics, context);
            case SpringPackage.HEADER_EXPRESSION:
                return validateHeaderExpression((HeaderExpression)value, diagnostics, context);
            case SpringPackage.HL7_DATA_FORMAT:
                return validateHl7DataFormat((Hl7DataFormat)value, diagnostics, context);
            case SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION:
                return validateIdempotentConsumerDefinition((IdempotentConsumerDefinition)value, diagnostics, context);
            case SpringPackage.IDENTIFIED_TYPE:
                return validateIdentifiedType((IdentifiedType)value, diagnostics, context);
            case SpringPackage.IMPLICIT_COLLECTION_ENTRY:
                return validateImplicitCollectionEntry((ImplicitCollectionEntry)value, diagnostics, context);
            case SpringPackage.IMPLICIT_COLLECTION_LIST:
                return validateImplicitCollectionList((ImplicitCollectionList)value, diagnostics, context);
            case SpringPackage.IN_ONLY_DEFINITION:
                return validateInOnlyDefinition((InOnlyDefinition)value, diagnostics, context);
            case SpringPackage.IN_OUT_DEFINITION:
                return validateInOutDefinition((InOutDefinition)value, diagnostics, context);
            case SpringPackage.INTERCEPT_DEFINITION:
                return validateInterceptDefinition((InterceptDefinition)value, diagnostics, context);
            case SpringPackage.INTERCEPT_FROM_DEFINITION:
                return validateInterceptFromDefinition((InterceptFromDefinition)value, diagnostics, context);
            case SpringPackage.INTERCEPT_SEND_TO_ENDPOINT_DEFINITION:
                return validateInterceptSendToEndpointDefinition((InterceptSendToEndpointDefinition)value, diagnostics, context);
            case SpringPackage.JAVA_SCRIPT_EXPRESSION:
                return validateJavaScriptExpression((JavaScriptExpression)value, diagnostics, context);
            case SpringPackage.JAXB_DATA_FORMAT:
                return validateJaxbDataFormat((JaxbDataFormat)value, diagnostics, context);
            case SpringPackage.JIBX_DATA_FORMAT:
                return validateJibxDataFormat((JibxDataFormat)value, diagnostics, context);
            case SpringPackage.JSON_DATA_FORMAT:
                return validateJsonDataFormat((JsonDataFormat)value, diagnostics, context);
            case SpringPackage.JX_PATH_EXPRESSION:
                return validateJxPathExpression((JxPathExpression)value, diagnostics, context);
            case SpringPackage.KEY_MANAGERS_PARAMETERS_FACTORY_BEAN:
                return validateKeyManagersParametersFactoryBean((KeyManagersParametersFactoryBean)value, diagnostics, context);
            case SpringPackage.KEY_STORE_PARAMETERS_FACTORY_BEAN:
                return validateKeyStoreParametersFactoryBean((KeyStoreParametersFactoryBean)value, diagnostics, context);
            case SpringPackage.LANGUAGE_EXPRESSION:
                return validateLanguageExpression((LanguageExpression)value, diagnostics, context);
            case SpringPackage.LOAD_BALANCE_DEFINITION:
                return validateLoadBalanceDefinition((LoadBalanceDefinition)value, diagnostics, context);
            case SpringPackage.LOAD_BALANCER:
                return validateLoadBalancer((LoadBalancer)value, diagnostics, context);
            case SpringPackage.LOG_DEFINITION:
                return validateLogDefinition((LogDefinition)value, diagnostics, context);
            case SpringPackage.LOOP_DEFINITION:
                return validateLoopDefinition((LoopDefinition)value, diagnostics, context);
            case SpringPackage.MARSHAL_DEFINITION:
                return validateMarshalDefinition((MarshalDefinition)value, diagnostics, context);
            case SpringPackage.METHOD_CALL_EXPRESSION:
                return validateMethodCallExpression((MethodCallExpression)value, diagnostics, context);
            case SpringPackage.MULTICAST_DEFINITION:
                return validateMulticastDefinition((MulticastDefinition)value, diagnostics, context);
            case SpringPackage.MVEL_EXPRESSION:
                return validateMvelExpression((MvelExpression)value, diagnostics, context);
            case SpringPackage.NAMESPACE_AWARE_EXPRESSION:
                return validateNamespaceAwareExpression((NamespaceAwareExpression)value, diagnostics, context);
            case SpringPackage.NODE_FACTORY:
                return validateNodeFactory((NodeFactory)value, diagnostics, context);
            case SpringPackage.NO_OUTPUT_DEFINITION:
                return validateNoOutputDefinition((NoOutputDefinition)value, diagnostics, context);
            case SpringPackage.NO_OUTPUT_EXPRESSION_NODE:
                return validateNoOutputExpressionNode((NoOutputExpressionNode)value, diagnostics, context);
            case SpringPackage.OGNL_EXPRESSION:
                return validateOgnlExpression((OgnlExpression)value, diagnostics, context);
            case SpringPackage.OMIT_FIELD_ENTRY:
                return validateOmitFieldEntry((OmitFieldEntry)value, diagnostics, context);
            case SpringPackage.OMIT_FIELD_LIST:
                return validateOmitFieldList((OmitFieldList)value, diagnostics, context);
            case SpringPackage.ON_COMPLETION_DEFINITION:
                return validateOnCompletionDefinition((OnCompletionDefinition)value, diagnostics, context);
            case SpringPackage.ON_EXCEPTION_DEFINITION:
                return validateOnExceptionDefinition((OnExceptionDefinition)value, diagnostics, context);
            case SpringPackage.OPTIONAL_IDENTIFIED_DEFINITION:
                return validateOptionalIdentifiedDefinition((OptionalIdentifiedDefinition)value, diagnostics, context);
            case SpringPackage.OTHERWISE_DEFINITION:
                return validateOtherwiseDefinition((OtherwiseDefinition)value, diagnostics, context);
            case SpringPackage.OUTPUT:
                return validateOutput((Output)value, diagnostics, context);
            case SpringPackage.PACKAGE_SCAN_DEFINITION:
                return validatePackageScanDefinition((PackageScanDefinition)value, diagnostics, context);
            case SpringPackage.PHP_EXPRESSION:
                return validatePhpExpression((PhpExpression)value, diagnostics, context);
            case SpringPackage.PIPELINE_DEFINITION:
                return validatePipelineDefinition((PipelineDefinition)value, diagnostics, context);
            case SpringPackage.POLICY_DEFINITION:
                return validatePolicyDefinition((PolicyDefinition)value, diagnostics, context);
            case SpringPackage.POLL_ENRICH_DEFINITION:
                return validatePollEnrichDefinition((PollEnrichDefinition)value, diagnostics, context);
            case SpringPackage.PROCESS_DEFINITION:
                return validateProcessDefinition((ProcessDefinition)value, diagnostics, context);
            case SpringPackage.PROCESSOR_DEFINITION:
                return validateProcessorDefinition((ProcessorDefinition)value, diagnostics, context);
            case SpringPackage.PROCESSOR_DEFINITION_HELPER:
                return validateProcessorDefinitionHelper((ProcessorDefinitionHelper)value, diagnostics, context);
            case SpringPackage.PROPERTIES_DEFINITION:
                return validatePropertiesDefinition((PropertiesDefinition)value, diagnostics, context);
            case SpringPackage.PROPERTY_DEFINITION:
                return validatePropertyDefinition((PropertyDefinition)value, diagnostics, context);
            case SpringPackage.PROPERTY_EXPRESSION:
                return validatePropertyExpression((PropertyExpression)value, diagnostics, context);
            case SpringPackage.PROTOBUF_DATA_FORMAT:
                return validateProtobufDataFormat((ProtobufDataFormat)value, diagnostics, context);
            case SpringPackage.PYTHON_EXPRESSION:
                return validatePythonExpression((PythonExpression)value, diagnostics, context);
            case SpringPackage.RANDOM_LOAD_BALANCER_DEFINITION:
                return validateRandomLoadBalancerDefinition((RandomLoadBalancerDefinition)value, diagnostics, context);
            case SpringPackage.RECIPIENT_LIST_DEFINITION:
                return validateRecipientListDefinition((RecipientListDefinition)value, diagnostics, context);
            case SpringPackage.REDELIVERY_POLICY_DEFINITION:
                return validateRedeliveryPolicyDefinition((RedeliveryPolicyDefinition)value, diagnostics, context);
            case SpringPackage.REF_EXPRESSION:
                return validateRefExpression((RefExpression)value, diagnostics, context);
            case SpringPackage.REMOVE_HEADER_DEFINITION:
                return validateRemoveHeaderDefinition((RemoveHeaderDefinition)value, diagnostics, context);
            case SpringPackage.REMOVE_HEADERS_DEFINITION:
                return validateRemoveHeadersDefinition((RemoveHeadersDefinition)value, diagnostics, context);
            case SpringPackage.REMOVE_PROPERTY_DEFINITION:
                return validateRemovePropertyDefinition((RemovePropertyDefinition)value, diagnostics, context);
            case SpringPackage.RESEQUENCE_DEFINITION:
                return validateResequenceDefinition((ResequenceDefinition)value, diagnostics, context);
            case SpringPackage.RESEQUENCER_CONFIG:
                return validateResequencerConfig((ResequencerConfig)value, diagnostics, context);
            case SpringPackage.ROLLBACK_DEFINITION:
                return validateRollbackDefinition((RollbackDefinition)value, diagnostics, context);
            case SpringPackage.ROUND_ROBIN_LOAD_BALANCER_DEFINITION:
                return validateRoundRobinLoadBalancerDefinition((RoundRobinLoadBalancerDefinition)value, diagnostics, context);
            case SpringPackage.ROUTE_BUILDER_DEFINITION:
                return validateRouteBuilderDefinition((RouteBuilderDefinition)value, diagnostics, context);
            case SpringPackage.ROUTE_CONTEXT_REF_DEFINITION:
                return validateRouteContextRefDefinition((RouteContextRefDefinition)value, diagnostics, context);
            case SpringPackage.ROUTE_DEFINITION:
                return validateRouteDefinition((RouteDefinition)value, diagnostics, context);
            case SpringPackage.ROUTE_DEFINITION_HELPER:
                return validateRouteDefinitionHelper((RouteDefinitionHelper)value, diagnostics, context);
            case SpringPackage.ROUTES_DEFINITION:
                return validateRoutesDefinition((RoutesDefinition)value, diagnostics, context);
            case SpringPackage.ROUTING_SLIP_DEFINITION:
                return validateRoutingSlipDefinition((RoutingSlipDefinition)value, diagnostics, context);
            case SpringPackage.RSS_DATA_FORMAT:
                return validateRssDataFormat((RssDataFormat)value, diagnostics, context);
            case SpringPackage.RUBY_EXPRESSION:
                return validateRubyExpression((RubyExpression)value, diagnostics, context);
            case SpringPackage.SAMPLING_DEFINITION:
                return validateSamplingDefinition((SamplingDefinition)value, diagnostics, context);
            case SpringPackage.SECURE_RANDOM_PARAMETERS_FACTORY_BEAN:
                return validateSecureRandomParametersFactoryBean((SecureRandomParametersFactoryBean)value, diagnostics, context);
            case SpringPackage.SECURE_SOCKET_PROTOCOLS_PARAMETERS:
                return validateSecureSocketProtocolsParameters((SecureSocketProtocolsParameters)value, diagnostics, context);
            case SpringPackage.SEND_DEFINITION:
                return validateSendDefinition((SendDefinition)value, diagnostics, context);
            case SpringPackage.SERIALIZATION_DATA_FORMAT:
                return validateSerializationDataFormat((SerializationDataFormat)value, diagnostics, context);
            case SpringPackage.SET_BODY_DEFINITION:
                return validateSetBodyDefinition((SetBodyDefinition)value, diagnostics, context);
            case SpringPackage.SET_EXCHANGE_PATTERN_DEFINITION:
                return validateSetExchangePatternDefinition((SetExchangePatternDefinition)value, diagnostics, context);
            case SpringPackage.SET_FAULT_BODY_DEFINITION:
                return validateSetFaultBodyDefinition((SetFaultBodyDefinition)value, diagnostics, context);
            case SpringPackage.SET_HEADER_DEFINITION:
                return validateSetHeaderDefinition((SetHeaderDefinition)value, diagnostics, context);
            case SpringPackage.SET_OUT_HEADER_DEFINITION:
                return validateSetOutHeaderDefinition((SetOutHeaderDefinition)value, diagnostics, context);
            case SpringPackage.SET_PROPERTY_DEFINITION:
                return validateSetPropertyDefinition((SetPropertyDefinition)value, diagnostics, context);
            case SpringPackage.SIMPLE_EXPRESSION:
                return validateSimpleExpression((SimpleExpression)value, diagnostics, context);
            case SpringPackage.SOAP_JAXB_DATA_FORMAT:
                return validateSoapJaxbDataFormat((SoapJaxbDataFormat)value, diagnostics, context);
            case SpringPackage.SORT_DEFINITION:
                return validateSortDefinition((SortDefinition)value, diagnostics, context);
            case SpringPackage.SP_EL_EXPRESSION:
                return validateSpELExpression((SpELExpression)value, diagnostics, context);
            case SpringPackage.SPLIT_DEFINITION:
                return validateSplitDefinition((SplitDefinition)value, diagnostics, context);
            case SpringPackage.SQL_EXPRESSION:
                return validateSqlExpression((SqlExpression)value, diagnostics, context);
            case SpringPackage.SSL_CONTEXT_CLIENT_PARAMETERS_FACTORY_BEAN:
                return validateSslContextClientParametersFactoryBean((SslContextClientParametersFactoryBean)value, diagnostics, context);
            case SpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN:
                return validateSslContextParametersFactoryBean((SslContextParametersFactoryBean)value, diagnostics, context);
            case SpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN:
                return validateSslContextServerParametersFactoryBean((SslContextServerParametersFactoryBean)value, diagnostics, context);
            case SpringPackage.STICKY_LOAD_BALANCER_DEFINITION:
                return validateStickyLoadBalancerDefinition((StickyLoadBalancerDefinition)value, diagnostics, context);
            case SpringPackage.STOP_DEFINITION:
                return validateStopDefinition((StopDefinition)value, diagnostics, context);
            case SpringPackage.STREAM_RESEQUENCER_CONFIG:
                return validateStreamResequencerConfig((StreamResequencerConfig)value, diagnostics, context);
            case SpringPackage.STRING_DATA_FORMAT:
                return validateStringDataFormat((StringDataFormat)value, diagnostics, context);
            case SpringPackage.SYSLOG_DATA_FORMAT:
                return validateSyslogDataFormat((SyslogDataFormat)value, diagnostics, context);
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION:
                return validateThreadPoolProfileDefinition((ThreadPoolProfileDefinition)value, diagnostics, context);
            case SpringPackage.THREADS_DEFINITION:
                return validateThreadsDefinition((ThreadsDefinition)value, diagnostics, context);
            case SpringPackage.THROTTLE_DEFINITION:
                return validateThrottleDefinition((ThrottleDefinition)value, diagnostics, context);
            case SpringPackage.THROW_EXCEPTION_DEFINITION:
                return validateThrowExceptionDefinition((ThrowExceptionDefinition)value, diagnostics, context);
            case SpringPackage.TIDY_MARKUP_DATA_FORMAT:
                return validateTidyMarkupDataFormat((TidyMarkupDataFormat)value, diagnostics, context);
            case SpringPackage.TO_DEFINITION:
                return validateToDefinition((ToDefinition)value, diagnostics, context);
            case SpringPackage.TOKENIZER_EXPRESSION:
                return validateTokenizerExpression((TokenizerExpression)value, diagnostics, context);
            case SpringPackage.TOPIC_LOAD_BALANCER_DEFINITION:
                return validateTopicLoadBalancerDefinition((TopicLoadBalancerDefinition)value, diagnostics, context);
            case SpringPackage.TRANSACTED_DEFINITION:
                return validateTransactedDefinition((TransactedDefinition)value, diagnostics, context);
            case SpringPackage.TRANSFORM_DEFINITION:
                return validateTransformDefinition((TransformDefinition)value, diagnostics, context);
            case SpringPackage.TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN:
                return validateTrustManagersParametersFactoryBean((TrustManagersParametersFactoryBean)value, diagnostics, context);
            case SpringPackage.TRY_DEFINITION:
                return validateTryDefinition((TryDefinition)value, diagnostics, context);
            case SpringPackage.UNMARSHAL_DEFINITION:
                return validateUnmarshalDefinition((UnmarshalDefinition)value, diagnostics, context);
            case SpringPackage.VALIDATE_DEFINITION:
                return validateValidateDefinition((ValidateDefinition)value, diagnostics, context);
            case SpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION:
                return validateWeightedLoadBalancerDefinition((WeightedLoadBalancerDefinition)value, diagnostics, context);
            case SpringPackage.WHEN_DEFINITION:
                return validateWhenDefinition((WhenDefinition)value, diagnostics, context);
            case SpringPackage.WIRE_TAP_DEFINITION:
                return validateWireTapDefinition((WireTapDefinition)value, diagnostics, context);
            case SpringPackage.XML_BEANS_DATA_FORMAT:
                return validateXmlBeansDataFormat((XmlBeansDataFormat)value, diagnostics, context);
            case SpringPackage.XML_SECURITY_DATA_FORMAT:
                return validateXmlSecurityDataFormat((XmlSecurityDataFormat)value, diagnostics, context);
            case SpringPackage.XPATH_EXPRESSION:
                return validateXPathExpression((XPathExpression)value, diagnostics, context);
            case SpringPackage.XQUERY_EXPRESSION:
                return validateXQueryExpression((XQueryExpression)value, diagnostics, context);
            case SpringPackage.XSTREAM_DATA_FORMAT:
                return validateXStreamDataFormat((XStreamDataFormat)value, diagnostics, context);
            case SpringPackage.ZIP_DATA_FORMAT:
                return validateZipDataFormat((ZipDataFormat)value, diagnostics, context);
            case SpringPackage.BINDY_TYPE:
                return validateBindyType((BindyType)value, diagnostics, context);
            case SpringPackage.ERROR_HANDLER_TYPE:
                return validateErrorHandlerType((ErrorHandlerType)value, diagnostics, context);
            case SpringPackage.EXCHANGE_PATTERN:
                return validateExchangePattern((ExchangePattern)value, diagnostics, context);
            case SpringPackage.JSON_LIBRARY:
                return validateJsonLibrary((JsonLibrary)value, diagnostics, context);
            case SpringPackage.LOGGING_LEVEL:
                return validateLoggingLevel((LoggingLevel)value, diagnostics, context);
            case SpringPackage.MANAGEMENT_STATISTICS_LEVEL:
                return validateManagementStatisticsLevel((ManagementStatisticsLevel)value, diagnostics, context);
            case SpringPackage.SHUTDOWN_ROUTE:
                return validateShutdownRoute((ShutdownRoute)value, diagnostics, context);
            case SpringPackage.SHUTDOWN_RUNNING_TASK:
                return validateShutdownRunningTask((ShutdownRunningTask)value, diagnostics, context);
            case SpringPackage.THREAD_POOL_REJECTED_POLICY:
                return validateThreadPoolRejectedPolicy((ThreadPoolRejectedPolicy)value, diagnostics, context);
            case SpringPackage.WAIT_FOR_TASK_TO_COMPLETE:
                return validateWaitForTaskToComplete((WaitForTaskToComplete)value, diagnostics, context);
            case SpringPackage.BINDY_TYPE_OBJECT:
                return validateBindyTypeObject((BindyType)value, diagnostics, context);
            case SpringPackage.CLASSES_TYPE:
                return validateClassesType((List<?>)value, diagnostics, context);
            case SpringPackage.ERROR_HANDLER_TYPE_OBJECT:
                return validateErrorHandlerTypeObject((ErrorHandlerType)value, diagnostics, context);
            case SpringPackage.EXCHANGE_PATTERN_OBJECT:
                return validateExchangePatternObject((ExchangePattern)value, diagnostics, context);
            case SpringPackage.JSON_LIBRARY_OBJECT:
                return validateJsonLibraryObject((JsonLibrary)value, diagnostics, context);
            case SpringPackage.LOGGING_LEVEL_OBJECT:
                return validateLoggingLevelObject((LoggingLevel)value, diagnostics, context);
            case SpringPackage.MANAGEMENT_STATISTICS_LEVEL_OBJECT:
                return validateManagementStatisticsLevelObject((ManagementStatisticsLevel)value, diagnostics, context);
            case SpringPackage.PACKAGES_TYPE:
                return validatePackagesType((List<?>)value, diagnostics, context);
            case SpringPackage.PACKAGES_TYPE1:
                return validatePackagesType1((List<?>)value, diagnostics, context);
            case SpringPackage.SHUTDOWN_ROUTE_OBJECT:
                return validateShutdownRouteObject((ShutdownRoute)value, diagnostics, context);
            case SpringPackage.SHUTDOWN_RUNNING_TASK_OBJECT:
                return validateShutdownRunningTaskObject((ShutdownRunningTask)value, diagnostics, context);
            case SpringPackage.THREAD_POOL_REJECTED_POLICY_OBJECT:
                return validateThreadPoolRejectedPolicyObject((ThreadPoolRejectedPolicy)value, diagnostics, context);
            case SpringPackage.WAIT_FOR_TASK_TO_COMPLETE_OBJECT:
                return validateWaitForTaskToCompleteObject((WaitForTaskToComplete)value, diagnostics, context);
            default:
                return true;
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateAbstractCamelConsumerTemplateFactoryBean(AbstractCamelConsumerTemplateFactoryBean abstractCamelConsumerTemplateFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(abstractCamelConsumerTemplateFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateAbstractCamelContextFactoryBean(AbstractCamelContextFactoryBean abstractCamelContextFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(abstractCamelContextFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateAbstractCamelEndpointFactoryBean(AbstractCamelEndpointFactoryBean abstractCamelEndpointFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(abstractCamelEndpointFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateAbstractCamelFactoryBean(AbstractCamelFactoryBean abstractCamelFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(abstractCamelFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateAbstractCamelProducerTemplateFactoryBean(AbstractCamelProducerTemplateFactoryBean abstractCamelProducerTemplateFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(abstractCamelProducerTemplateFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateAbstractCamelRedeliveryPolicyFactoryBean(AbstractCamelRedeliveryPolicyFactoryBean abstractCamelRedeliveryPolicyFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(abstractCamelRedeliveryPolicyFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateAbstractCamelThreadPoolFactoryBean(AbstractCamelThreadPoolFactoryBean abstractCamelThreadPoolFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(abstractCamelThreadPoolFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateAbstractJsseUtilFactoryBean(AbstractJsseUtilFactoryBean abstractJsseUtilFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(abstractJsseUtilFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateAbstractKeyManagersParametersFactoryBean(AbstractKeyManagersParametersFactoryBean abstractKeyManagersParametersFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(abstractKeyManagersParametersFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateAbstractKeyStoreParametersFactoryBean(AbstractKeyStoreParametersFactoryBean abstractKeyStoreParametersFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(abstractKeyStoreParametersFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateAbstractSecureRandomParametersFactoryBean(AbstractSecureRandomParametersFactoryBean abstractSecureRandomParametersFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(abstractSecureRandomParametersFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateAbstractTrustManagersParametersFactoryBean(AbstractTrustManagersParametersFactoryBean abstractTrustManagersParametersFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(abstractTrustManagersParametersFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateAggregateDefinition(AggregateDefinition aggregateDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(aggregateDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateAliasEntry(AliasEntry aliasEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(aliasEntry, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateAliasList(AliasList aliasList, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(aliasList, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateAopDefinition(AopDefinition aopDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(aopDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateBatchResequencerConfig(BatchResequencerConfig batchResequencerConfig, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(batchResequencerConfig, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateBeanDefinition(BeanDefinition beanDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(beanDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateBindyDataFormat(BindyDataFormat bindyDataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(bindyDataFormat, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateCamelBeanPostProcessor(CamelBeanPostProcessor camelBeanPostProcessor, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(camelBeanPostProcessor, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateCamelConsumerTemplateFactoryBean(CamelConsumerTemplateFactoryBean camelConsumerTemplateFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(camelConsumerTemplateFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateCamelContextFactoryBean(CamelContextFactoryBean camelContextFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(camelContextFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateCamelEndpointFactoryBean(CamelEndpointFactoryBean camelEndpointFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(camelEndpointFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateCamelJMXAgentDefinition(CamelJMXAgentDefinition camelJMXAgentDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(camelJMXAgentDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateCamelProducerTemplateFactoryBean(CamelProducerTemplateFactoryBean camelProducerTemplateFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(camelProducerTemplateFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateCamelPropertyPlaceholderDefinition(CamelPropertyPlaceholderDefinition camelPropertyPlaceholderDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(camelPropertyPlaceholderDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateCamelProxyFactoryDefinition(CamelProxyFactoryDefinition camelProxyFactoryDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(camelProxyFactoryDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateCamelRedeliveryPolicyFactoryBean(CamelRedeliveryPolicyFactoryBean camelRedeliveryPolicyFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(camelRedeliveryPolicyFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateCamelRouteContextFactoryBean(CamelRouteContextFactoryBean camelRouteContextFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(camelRouteContextFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateCamelServiceExporterDefinition(CamelServiceExporterDefinition camelServiceExporterDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(camelServiceExporterDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateCamelThreadPoolFactoryBean(CamelThreadPoolFactoryBean camelThreadPoolFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(camelThreadPoolFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateCastorDataFormat(CastorDataFormat castorDataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(castorDataFormat, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateCatchDefinition(CatchDefinition catchDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(catchDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateChoiceDefinition(ChoiceDefinition choiceDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(choiceDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateCipherSuitesParameters(CipherSuitesParameters cipherSuitesParameters, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(cipherSuitesParameters, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateConstantExpression(ConstantExpression constantExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(constantExpression, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateConstants(Constants constants, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(constants, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateContextScanDefinition(ContextScanDefinition contextScanDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(contextScanDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateConvertBodyDefinition(ConvertBodyDefinition convertBodyDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(convertBodyDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateConverterEntry(ConverterEntry converterEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(converterEntry, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateConverterList(ConverterList converterList, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(converterList, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateCryptoDataFormat(CryptoDataFormat cryptoDataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(cryptoDataFormat, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateCsvDataFormat(CsvDataFormat csvDataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(csvDataFormat, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateCustomDataFormat(CustomDataFormat customDataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(customDataFormat, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateCustomLoadBalancerDefinition(CustomLoadBalancerDefinition customLoadBalancerDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(customLoadBalancerDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateDataFormat(DataFormat dataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(dataFormat, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateDataFormatsDefinition(DataFormatsDefinition dataFormatsDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(dataFormatsDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateDelayDefinition(DelayDefinition delayDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(delayDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateDescriptionDefinition(DescriptionDefinition descriptionDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(descriptionDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateDynamicRouterDefinition(DynamicRouterDefinition dynamicRouterDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(dynamicRouterDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateElExpression(ElExpression elExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(elExpression, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateEnrichDefinition(EnrichDefinition enrichDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(enrichDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateErrorHandlerDefinition(ErrorHandlerDefinition errorHandlerDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(errorHandlerDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateExpression(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(expression, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateExpressionNode(ExpressionNode expressionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(expressionNode, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateExpressionSubElementDefinition(ExpressionSubElementDefinition expressionSubElementDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(expressionSubElementDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateFailoverLoadBalancerDefinition(FailoverLoadBalancerDefinition failoverLoadBalancerDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(failoverLoadBalancerDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateFilterDefinition(FilterDefinition filterDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(filterDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateFilterParameters(FilterParameters filterParameters, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(filterParameters, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateFinallyDefinition(FinallyDefinition finallyDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(finallyDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateFlatpackDataFormat(FlatpackDataFormat flatpackDataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(flatpackDataFormat, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateFromDefinition(FromDefinition fromDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(fromDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateGroovyExpression(GroovyExpression groovyExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(groovyExpression, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateGzipDataFormat(GzipDataFormat gzipDataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(gzipDataFormat, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateHeaderExpression(HeaderExpression headerExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(headerExpression, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateHl7DataFormat(Hl7DataFormat hl7DataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(hl7DataFormat, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateIdempotentConsumerDefinition(IdempotentConsumerDefinition idempotentConsumerDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(idempotentConsumerDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateIdentifiedType(IdentifiedType identifiedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(identifiedType, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateImplicitCollectionEntry(ImplicitCollectionEntry implicitCollectionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(implicitCollectionEntry, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateImplicitCollectionList(ImplicitCollectionList implicitCollectionList, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(implicitCollectionList, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateInOnlyDefinition(InOnlyDefinition inOnlyDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(inOnlyDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateInOutDefinition(InOutDefinition inOutDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(inOutDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateInterceptDefinition(InterceptDefinition interceptDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(interceptDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateInterceptFromDefinition(InterceptFromDefinition interceptFromDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(interceptFromDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateInterceptSendToEndpointDefinition(InterceptSendToEndpointDefinition interceptSendToEndpointDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(interceptSendToEndpointDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateJavaScriptExpression(JavaScriptExpression javaScriptExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(javaScriptExpression, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateJaxbDataFormat(JaxbDataFormat jaxbDataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(jaxbDataFormat, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateJibxDataFormat(JibxDataFormat jibxDataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(jibxDataFormat, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateJsonDataFormat(JsonDataFormat jsonDataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(jsonDataFormat, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateJxPathExpression(JxPathExpression jxPathExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(jxPathExpression, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateKeyManagersParametersFactoryBean(KeyManagersParametersFactoryBean keyManagersParametersFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(keyManagersParametersFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateKeyStoreParametersFactoryBean(KeyStoreParametersFactoryBean keyStoreParametersFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(keyStoreParametersFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateLanguageExpression(LanguageExpression languageExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(languageExpression, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateLoadBalanceDefinition(LoadBalanceDefinition loadBalanceDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(loadBalanceDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateLoadBalancer(LoadBalancer loadBalancer, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(loadBalancer, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateLogDefinition(LogDefinition logDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(logDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateLoopDefinition(LoopDefinition loopDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(loopDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateMarshalDefinition(MarshalDefinition marshalDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(marshalDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateMethodCallExpression(MethodCallExpression methodCallExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(methodCallExpression, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateMulticastDefinition(MulticastDefinition multicastDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(multicastDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateMvelExpression(MvelExpression mvelExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(mvelExpression, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateNamespaceAwareExpression(NamespaceAwareExpression namespaceAwareExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(namespaceAwareExpression, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateNodeFactory(NodeFactory nodeFactory, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(nodeFactory, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateNoOutputDefinition(NoOutputDefinition noOutputDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(noOutputDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateNoOutputExpressionNode(NoOutputExpressionNode noOutputExpressionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(noOutputExpressionNode, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateOgnlExpression(OgnlExpression ognlExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(ognlExpression, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateOmitFieldEntry(OmitFieldEntry omitFieldEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(omitFieldEntry, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateOmitFieldList(OmitFieldList omitFieldList, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(omitFieldList, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateOnCompletionDefinition(OnCompletionDefinition onCompletionDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(onCompletionDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateOnExceptionDefinition(OnExceptionDefinition onExceptionDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(onExceptionDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateOptionalIdentifiedDefinition(OptionalIdentifiedDefinition optionalIdentifiedDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(optionalIdentifiedDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateOtherwiseDefinition(OtherwiseDefinition otherwiseDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(otherwiseDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateOutput(Output output, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(output, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validatePackageScanDefinition(PackageScanDefinition packageScanDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(packageScanDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validatePhpExpression(PhpExpression phpExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(phpExpression, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validatePipelineDefinition(PipelineDefinition pipelineDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(pipelineDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validatePolicyDefinition(PolicyDefinition policyDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(policyDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validatePollEnrichDefinition(PollEnrichDefinition pollEnrichDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(pollEnrichDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateProcessDefinition(ProcessDefinition processDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(processDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateProcessorDefinition(ProcessorDefinition processorDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(processorDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateProcessorDefinitionHelper(ProcessorDefinitionHelper processorDefinitionHelper, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(processorDefinitionHelper, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validatePropertiesDefinition(PropertiesDefinition propertiesDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(propertiesDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validatePropertyDefinition(PropertyDefinition propertyDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(propertyDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validatePropertyExpression(PropertyExpression propertyExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(propertyExpression, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateProtobufDataFormat(ProtobufDataFormat protobufDataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(protobufDataFormat, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validatePythonExpression(PythonExpression pythonExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(pythonExpression, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateRandomLoadBalancerDefinition(RandomLoadBalancerDefinition randomLoadBalancerDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(randomLoadBalancerDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateRecipientListDefinition(RecipientListDefinition recipientListDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(recipientListDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateRedeliveryPolicyDefinition(RedeliveryPolicyDefinition redeliveryPolicyDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(redeliveryPolicyDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateRefExpression(RefExpression refExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(refExpression, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateRemoveHeaderDefinition(RemoveHeaderDefinition removeHeaderDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(removeHeaderDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateRemoveHeadersDefinition(RemoveHeadersDefinition removeHeadersDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(removeHeadersDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateRemovePropertyDefinition(RemovePropertyDefinition removePropertyDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(removePropertyDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateResequenceDefinition(ResequenceDefinition resequenceDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(resequenceDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateResequencerConfig(ResequencerConfig resequencerConfig, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(resequencerConfig, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateRollbackDefinition(RollbackDefinition rollbackDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(rollbackDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateRoundRobinLoadBalancerDefinition(RoundRobinLoadBalancerDefinition roundRobinLoadBalancerDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(roundRobinLoadBalancerDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateRouteBuilderDefinition(RouteBuilderDefinition routeBuilderDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(routeBuilderDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateRouteContextRefDefinition(RouteContextRefDefinition routeContextRefDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(routeContextRefDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateRouteDefinition(RouteDefinition routeDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(routeDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateRouteDefinitionHelper(RouteDefinitionHelper routeDefinitionHelper, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(routeDefinitionHelper, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateRoutesDefinition(RoutesDefinition routesDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(routesDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateRoutingSlipDefinition(RoutingSlipDefinition routingSlipDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(routingSlipDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateRssDataFormat(RssDataFormat rssDataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(rssDataFormat, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateRubyExpression(RubyExpression rubyExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(rubyExpression, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSamplingDefinition(SamplingDefinition samplingDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(samplingDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSecureRandomParametersFactoryBean(SecureRandomParametersFactoryBean secureRandomParametersFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(secureRandomParametersFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSecureSocketProtocolsParameters(SecureSocketProtocolsParameters secureSocketProtocolsParameters, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(secureSocketProtocolsParameters, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSendDefinition(SendDefinition sendDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(sendDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSerializationDataFormat(SerializationDataFormat serializationDataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(serializationDataFormat, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSetBodyDefinition(SetBodyDefinition setBodyDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(setBodyDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSetExchangePatternDefinition(SetExchangePatternDefinition setExchangePatternDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(setExchangePatternDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSetFaultBodyDefinition(SetFaultBodyDefinition setFaultBodyDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(setFaultBodyDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSetHeaderDefinition(SetHeaderDefinition setHeaderDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(setHeaderDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSetOutHeaderDefinition(SetOutHeaderDefinition setOutHeaderDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(setOutHeaderDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSetPropertyDefinition(SetPropertyDefinition setPropertyDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(setPropertyDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSimpleExpression(SimpleExpression simpleExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(simpleExpression, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSoapJaxbDataFormat(SoapJaxbDataFormat soapJaxbDataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(soapJaxbDataFormat, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSortDefinition(SortDefinition sortDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(sortDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSpELExpression(SpELExpression spELExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(spELExpression, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSplitDefinition(SplitDefinition splitDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(splitDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSqlExpression(SqlExpression sqlExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(sqlExpression, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSslContextClientParametersFactoryBean(SslContextClientParametersFactoryBean sslContextClientParametersFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(sslContextClientParametersFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSslContextParametersFactoryBean(SslContextParametersFactoryBean sslContextParametersFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(sslContextParametersFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSslContextServerParametersFactoryBean(SslContextServerParametersFactoryBean sslContextServerParametersFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(sslContextServerParametersFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateStickyLoadBalancerDefinition(StickyLoadBalancerDefinition stickyLoadBalancerDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(stickyLoadBalancerDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateStopDefinition(StopDefinition stopDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(stopDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateStreamResequencerConfig(StreamResequencerConfig streamResequencerConfig, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(streamResequencerConfig, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateStringDataFormat(StringDataFormat stringDataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(stringDataFormat, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSyslogDataFormat(SyslogDataFormat syslogDataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(syslogDataFormat, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateThreadPoolProfileDefinition(ThreadPoolProfileDefinition threadPoolProfileDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(threadPoolProfileDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateThreadsDefinition(ThreadsDefinition threadsDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(threadsDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateThrottleDefinition(ThrottleDefinition throttleDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(throttleDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateThrowExceptionDefinition(ThrowExceptionDefinition throwExceptionDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(throwExceptionDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateTidyMarkupDataFormat(TidyMarkupDataFormat tidyMarkupDataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(tidyMarkupDataFormat, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateToDefinition(ToDefinition toDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(toDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateTokenizerExpression(TokenizerExpression tokenizerExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(tokenizerExpression, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateTopicLoadBalancerDefinition(TopicLoadBalancerDefinition topicLoadBalancerDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(topicLoadBalancerDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateTransactedDefinition(TransactedDefinition transactedDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(transactedDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateTransformDefinition(TransformDefinition transformDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(transformDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateTrustManagersParametersFactoryBean(TrustManagersParametersFactoryBean trustManagersParametersFactoryBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(trustManagersParametersFactoryBean, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateTryDefinition(TryDefinition tryDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(tryDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateUnmarshalDefinition(UnmarshalDefinition unmarshalDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(unmarshalDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateValidateDefinition(ValidateDefinition validateDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(validateDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateWeightedLoadBalancerDefinition(WeightedLoadBalancerDefinition weightedLoadBalancerDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(weightedLoadBalancerDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateWhenDefinition(WhenDefinition whenDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(whenDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateWireTapDefinition(WireTapDefinition wireTapDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(wireTapDefinition, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateXmlBeansDataFormat(XmlBeansDataFormat xmlBeansDataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(xmlBeansDataFormat, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateXmlSecurityDataFormat(XmlSecurityDataFormat xmlSecurityDataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(xmlSecurityDataFormat, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateXPathExpression(XPathExpression xPathExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(xPathExpression, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateXQueryExpression(XQueryExpression xQueryExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(xQueryExpression, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateXStreamDataFormat(XStreamDataFormat xStreamDataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(xStreamDataFormat, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateZipDataFormat(ZipDataFormat zipDataFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(zipDataFormat, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateBindyType(BindyType bindyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateErrorHandlerType(ErrorHandlerType errorHandlerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateExchangePattern(ExchangePattern exchangePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateJsonLibrary(JsonLibrary jsonLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateLoggingLevel(LoggingLevel loggingLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateManagementStatisticsLevel(ManagementStatisticsLevel managementStatisticsLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateShutdownRoute(ShutdownRoute shutdownRoute, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateShutdownRunningTask(ShutdownRunningTask shutdownRunningTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateThreadPoolRejectedPolicy(ThreadPoolRejectedPolicy threadPoolRejectedPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateWaitForTaskToComplete(WaitForTaskToComplete waitForTaskToComplete, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateBindyTypeObject(BindyType bindyTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateClassesType(List<?> classesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        boolean result = validateClassesType_ItemType(classesType, diagnostics, context);
        return result;
    }

	/**
     * Validates the ItemType constraint of '<em>Classes Type</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateClassesType_ItemType(List<?> classesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        boolean result = true;
        for (Iterator<?> i = classesType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
            Object item = i.next();
            if (XMLTypePackage.Literals.STRING.isInstance(item)) {
                result &= xmlTypeValidator.validateString((String)item, diagnostics, context);
            }
            else {
                result = false;
                reportDataValueTypeViolation(XMLTypePackage.Literals.STRING, item, diagnostics, context);
            }
        }
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateErrorHandlerTypeObject(ErrorHandlerType errorHandlerTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateExchangePatternObject(ExchangePattern exchangePatternObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateJsonLibraryObject(JsonLibrary jsonLibraryObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateLoggingLevelObject(LoggingLevel loggingLevelObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateManagementStatisticsLevelObject(ManagementStatisticsLevel managementStatisticsLevelObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validatePackagesType(List<?> packagesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        boolean result = validatePackagesType_ItemType(packagesType, diagnostics, context);
        return result;
    }

	/**
     * Validates the ItemType constraint of '<em>Packages Type</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validatePackagesType_ItemType(List<?> packagesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        boolean result = true;
        for (Iterator<?> i = packagesType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
            Object item = i.next();
            if (XMLTypePackage.Literals.STRING.isInstance(item)) {
                result &= xmlTypeValidator.validateString((String)item, diagnostics, context);
            }
            else {
                result = false;
                reportDataValueTypeViolation(XMLTypePackage.Literals.STRING, item, diagnostics, context);
            }
        }
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validatePackagesType1(List<?> packagesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
        boolean result = validatePackagesType1_ItemType(packagesType1, diagnostics, context);
        return result;
    }

	/**
     * Validates the ItemType constraint of '<em>Packages Type1</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validatePackagesType1_ItemType(List<?> packagesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
        boolean result = true;
        for (Iterator<?> i = packagesType1.iterator(); i.hasNext() && (result || diagnostics != null); ) {
            Object item = i.next();
            if (XMLTypePackage.Literals.STRING.isInstance(item)) {
                result &= xmlTypeValidator.validateString((String)item, diagnostics, context);
            }
            else {
                result = false;
                reportDataValueTypeViolation(XMLTypePackage.Literals.STRING, item, diagnostics, context);
            }
        }
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateShutdownRouteObject(ShutdownRoute shutdownRouteObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateShutdownRunningTaskObject(ShutdownRunningTask shutdownRunningTaskObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateThreadPoolRejectedPolicyObject(ThreadPoolRejectedPolicy threadPoolRejectedPolicyObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateWaitForTaskToCompleteObject(WaitForTaskToComplete waitForTaskToCompleteObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

	/**
     * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ResourceLocator getResourceLocator() {
        // TODO
        // Specialize this to return a resource locator for messages specific to this validator.
        // Ensure that you remove @generated or mark it @generated NOT
        return super.getResourceLocator();
    }

} //SpringValidator
