/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage
 * @generated
 */
public interface SpringFactory extends EFactory {
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	SpringFactory eINSTANCE = org.switchyard.tools.models.switchyard1_0.spring.impl.SpringFactoryImpl.init();

	/**
     * Returns a new object of class '<em>Aggregate Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Aggregate Definition</em>'.
     * @generated
     */
	AggregateDefinition createAggregateDefinition();

	/**
     * Returns a new object of class '<em>Alias Entry</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Alias Entry</em>'.
     * @generated
     */
	AliasEntry createAliasEntry();

	/**
     * Returns a new object of class '<em>Alias List</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Alias List</em>'.
     * @generated
     */
	AliasList createAliasList();

	/**
     * Returns a new object of class '<em>Aop Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Aop Definition</em>'.
     * @generated
     */
	AopDefinition createAopDefinition();

	/**
     * Returns a new object of class '<em>Batch Resequencer Config</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Batch Resequencer Config</em>'.
     * @generated
     */
	BatchResequencerConfig createBatchResequencerConfig();

	/**
     * Returns a new object of class '<em>Bean Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Bean Definition</em>'.
     * @generated
     */
	BeanDefinition createBeanDefinition();

	/**
     * Returns a new object of class '<em>Bindy Data Format</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Bindy Data Format</em>'.
     * @generated
     */
	BindyDataFormat createBindyDataFormat();

	/**
     * Returns a new object of class '<em>Camel Bean Post Processor</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Camel Bean Post Processor</em>'.
     * @generated
     */
	CamelBeanPostProcessor createCamelBeanPostProcessor();

	/**
     * Returns a new object of class '<em>Camel Consumer Template Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Camel Consumer Template Factory Bean</em>'.
     * @generated
     */
	CamelConsumerTemplateFactoryBean createCamelConsumerTemplateFactoryBean();

	/**
     * Returns a new object of class '<em>Camel Context Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Camel Context Factory Bean</em>'.
     * @generated
     */
	CamelContextFactoryBean createCamelContextFactoryBean();

	/**
     * Returns a new object of class '<em>Camel Endpoint Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Camel Endpoint Factory Bean</em>'.
     * @generated
     */
	CamelEndpointFactoryBean createCamelEndpointFactoryBean();

	/**
     * Returns a new object of class '<em>Camel JMX Agent Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Camel JMX Agent Definition</em>'.
     * @generated
     */
	CamelJMXAgentDefinition createCamelJMXAgentDefinition();

	/**
     * Returns a new object of class '<em>Camel Producer Template Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Camel Producer Template Factory Bean</em>'.
     * @generated
     */
	CamelProducerTemplateFactoryBean createCamelProducerTemplateFactoryBean();

	/**
     * Returns a new object of class '<em>Camel Property Placeholder Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Camel Property Placeholder Definition</em>'.
     * @generated
     */
	CamelPropertyPlaceholderDefinition createCamelPropertyPlaceholderDefinition();

	/**
     * Returns a new object of class '<em>Camel Proxy Factory Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Camel Proxy Factory Definition</em>'.
     * @generated
     */
	CamelProxyFactoryDefinition createCamelProxyFactoryDefinition();

	/**
     * Returns a new object of class '<em>Camel Redelivery Policy Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Camel Redelivery Policy Factory Bean</em>'.
     * @generated
     */
	CamelRedeliveryPolicyFactoryBean createCamelRedeliveryPolicyFactoryBean();

	/**
     * Returns a new object of class '<em>Camel Route Context Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Camel Route Context Factory Bean</em>'.
     * @generated
     */
	CamelRouteContextFactoryBean createCamelRouteContextFactoryBean();

	/**
     * Returns a new object of class '<em>Camel Service Exporter Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Camel Service Exporter Definition</em>'.
     * @generated
     */
	CamelServiceExporterDefinition createCamelServiceExporterDefinition();

	/**
     * Returns a new object of class '<em>Camel Thread Pool Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Camel Thread Pool Factory Bean</em>'.
     * @generated
     */
	CamelThreadPoolFactoryBean createCamelThreadPoolFactoryBean();

	/**
     * Returns a new object of class '<em>Castor Data Format</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Castor Data Format</em>'.
     * @generated
     */
	CastorDataFormat createCastorDataFormat();

	/**
     * Returns a new object of class '<em>Catch Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Catch Definition</em>'.
     * @generated
     */
	CatchDefinition createCatchDefinition();

	/**
     * Returns a new object of class '<em>Choice Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Choice Definition</em>'.
     * @generated
     */
	ChoiceDefinition createChoiceDefinition();

	/**
     * Returns a new object of class '<em>Cipher Suites Parameters</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Cipher Suites Parameters</em>'.
     * @generated
     */
	CipherSuitesParameters createCipherSuitesParameters();

	/**
     * Returns a new object of class '<em>Constant Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Constant Expression</em>'.
     * @generated
     */
	ConstantExpression createConstantExpression();

	/**
     * Returns a new object of class '<em>Constants</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Constants</em>'.
     * @generated
     */
	Constants createConstants();

	/**
     * Returns a new object of class '<em>Context Scan Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Context Scan Definition</em>'.
     * @generated
     */
	ContextScanDefinition createContextScanDefinition();

	/**
     * Returns a new object of class '<em>Convert Body Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Convert Body Definition</em>'.
     * @generated
     */
	ConvertBodyDefinition createConvertBodyDefinition();

	/**
     * Returns a new object of class '<em>Converter Entry</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Converter Entry</em>'.
     * @generated
     */
	ConverterEntry createConverterEntry();

	/**
     * Returns a new object of class '<em>Converter List</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Converter List</em>'.
     * @generated
     */
	ConverterList createConverterList();

	/**
     * Returns a new object of class '<em>Crypto Data Format</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Crypto Data Format</em>'.
     * @generated
     */
	CryptoDataFormat createCryptoDataFormat();

	/**
     * Returns a new object of class '<em>Csv Data Format</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Csv Data Format</em>'.
     * @generated
     */
	CsvDataFormat createCsvDataFormat();

	/**
     * Returns a new object of class '<em>Custom Data Format</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Custom Data Format</em>'.
     * @generated
     */
	CustomDataFormat createCustomDataFormat();

	/**
     * Returns a new object of class '<em>Custom Load Balancer Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Custom Load Balancer Definition</em>'.
     * @generated
     */
	CustomLoadBalancerDefinition createCustomLoadBalancerDefinition();

	/**
     * Returns a new object of class '<em>Data Format</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Format</em>'.
     * @generated
     */
	DataFormat createDataFormat();

	/**
     * Returns a new object of class '<em>Data Formats Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Formats Definition</em>'.
     * @generated
     */
	DataFormatsDefinition createDataFormatsDefinition();

	/**
     * Returns a new object of class '<em>Delay Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Delay Definition</em>'.
     * @generated
     */
	DelayDefinition createDelayDefinition();

	/**
     * Returns a new object of class '<em>Description Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Description Definition</em>'.
     * @generated
     */
	DescriptionDefinition createDescriptionDefinition();

	/**
     * Returns a new object of class '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Document Root</em>'.
     * @generated
     */
	DocumentRoot createDocumentRoot();

	/**
     * Returns a new object of class '<em>Dynamic Router Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Dynamic Router Definition</em>'.
     * @generated
     */
	DynamicRouterDefinition createDynamicRouterDefinition();

	/**
     * Returns a new object of class '<em>El Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>El Expression</em>'.
     * @generated
     */
	ElExpression createElExpression();

	/**
     * Returns a new object of class '<em>Enrich Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Enrich Definition</em>'.
     * @generated
     */
	EnrichDefinition createEnrichDefinition();

	/**
     * Returns a new object of class '<em>Error Handler Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Error Handler Definition</em>'.
     * @generated
     */
	ErrorHandlerDefinition createErrorHandlerDefinition();

	/**
     * Returns a new object of class '<em>Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Expression</em>'.
     * @generated
     */
	Expression createExpression();

	/**
     * Returns a new object of class '<em>Expression Node</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Expression Node</em>'.
     * @generated
     */
	ExpressionNode createExpressionNode();

	/**
     * Returns a new object of class '<em>Expression Node Helper</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Expression Node Helper</em>'.
     * @generated
     */
    ExpressionNodeHelper createExpressionNodeHelper();

    /**
     * Returns a new object of class '<em>Expression Sub Element Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Expression Sub Element Definition</em>'.
     * @generated
     */
	ExpressionSubElementDefinition createExpressionSubElementDefinition();

	/**
     * Returns a new object of class '<em>Failover Load Balancer Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Failover Load Balancer Definition</em>'.
     * @generated
     */
	FailoverLoadBalancerDefinition createFailoverLoadBalancerDefinition();

	/**
     * Returns a new object of class '<em>Filter Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Filter Definition</em>'.
     * @generated
     */
	FilterDefinition createFilterDefinition();

	/**
     * Returns a new object of class '<em>Filter Parameters</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Filter Parameters</em>'.
     * @generated
     */
	FilterParameters createFilterParameters();

	/**
     * Returns a new object of class '<em>Finally Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Finally Definition</em>'.
     * @generated
     */
	FinallyDefinition createFinallyDefinition();

	/**
     * Returns a new object of class '<em>Flatpack Data Format</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Flatpack Data Format</em>'.
     * @generated
     */
	FlatpackDataFormat createFlatpackDataFormat();

	/**
     * Returns a new object of class '<em>From Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>From Definition</em>'.
     * @generated
     */
	FromDefinition createFromDefinition();

	/**
     * Returns a new object of class '<em>Groovy Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Groovy Expression</em>'.
     * @generated
     */
	GroovyExpression createGroovyExpression();

	/**
     * Returns a new object of class '<em>Gzip Data Format</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Gzip Data Format</em>'.
     * @generated
     */
	GzipDataFormat createGzipDataFormat();

	/**
     * Returns a new object of class '<em>Header Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Header Expression</em>'.
     * @generated
     */
	HeaderExpression createHeaderExpression();

	/**
     * Returns a new object of class '<em>Hl7 Data Format</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Hl7 Data Format</em>'.
     * @generated
     */
	Hl7DataFormat createHl7DataFormat();

	/**
     * Returns a new object of class '<em>Idempotent Consumer Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Idempotent Consumer Definition</em>'.
     * @generated
     */
	IdempotentConsumerDefinition createIdempotentConsumerDefinition();

	/**
     * Returns a new object of class '<em>Implicit Collection Entry</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Implicit Collection Entry</em>'.
     * @generated
     */
	ImplicitCollectionEntry createImplicitCollectionEntry();

	/**
     * Returns a new object of class '<em>Implicit Collection List</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Implicit Collection List</em>'.
     * @generated
     */
	ImplicitCollectionList createImplicitCollectionList();

	/**
     * Returns a new object of class '<em>In Only Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>In Only Definition</em>'.
     * @generated
     */
	InOnlyDefinition createInOnlyDefinition();

	/**
     * Returns a new object of class '<em>In Out Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>In Out Definition</em>'.
     * @generated
     */
	InOutDefinition createInOutDefinition();

	/**
     * Returns a new object of class '<em>Intercept Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Intercept Definition</em>'.
     * @generated
     */
	InterceptDefinition createInterceptDefinition();

	/**
     * Returns a new object of class '<em>Intercept From Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Intercept From Definition</em>'.
     * @generated
     */
	InterceptFromDefinition createInterceptFromDefinition();

	/**
     * Returns a new object of class '<em>Intercept Send To Endpoint Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Intercept Send To Endpoint Definition</em>'.
     * @generated
     */
	InterceptSendToEndpointDefinition createInterceptSendToEndpointDefinition();

	/**
     * Returns a new object of class '<em>Java Script Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Java Script Expression</em>'.
     * @generated
     */
	JavaScriptExpression createJavaScriptExpression();

	/**
     * Returns a new object of class '<em>Jaxb Data Format</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Jaxb Data Format</em>'.
     * @generated
     */
	JaxbDataFormat createJaxbDataFormat();

	/**
     * Returns a new object of class '<em>Jibx Data Format</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Jibx Data Format</em>'.
     * @generated
     */
	JibxDataFormat createJibxDataFormat();

	/**
     * Returns a new object of class '<em>Json Data Format</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Json Data Format</em>'.
     * @generated
     */
	JsonDataFormat createJsonDataFormat();

	/**
     * Returns a new object of class '<em>Jx Path Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Jx Path Expression</em>'.
     * @generated
     */
	JxPathExpression createJxPathExpression();

	/**
     * Returns a new object of class '<em>Key Managers Parameters Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Key Managers Parameters Factory Bean</em>'.
     * @generated
     */
	KeyManagersParametersFactoryBean createKeyManagersParametersFactoryBean();

	/**
     * Returns a new object of class '<em>Key Store Parameters Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Key Store Parameters Factory Bean</em>'.
     * @generated
     */
	KeyStoreParametersFactoryBean createKeyStoreParametersFactoryBean();

	/**
     * Returns a new object of class '<em>Language Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Language Expression</em>'.
     * @generated
     */
	LanguageExpression createLanguageExpression();

	/**
     * Returns a new object of class '<em>Load Balance Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Load Balance Definition</em>'.
     * @generated
     */
	LoadBalanceDefinition createLoadBalanceDefinition();

	/**
     * Returns a new object of class '<em>Load Balancer</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Load Balancer</em>'.
     * @generated
     */
	LoadBalancer createLoadBalancer();

	/**
     * Returns a new object of class '<em>Log Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Log Definition</em>'.
     * @generated
     */
	LogDefinition createLogDefinition();

	/**
     * Returns a new object of class '<em>Loop Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Loop Definition</em>'.
     * @generated
     */
	LoopDefinition createLoopDefinition();

	/**
     * Returns a new object of class '<em>Marshal Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Marshal Definition</em>'.
     * @generated
     */
	MarshalDefinition createMarshalDefinition();

	/**
     * Returns a new object of class '<em>Method Call Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Method Call Expression</em>'.
     * @generated
     */
	MethodCallExpression createMethodCallExpression();

	/**
     * Returns a new object of class '<em>Model Helper</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Model Helper</em>'.
     * @generated
     */
    ModelHelper createModelHelper();

    /**
     * Returns a new object of class '<em>Multicast Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Multicast Definition</em>'.
     * @generated
     */
	MulticastDefinition createMulticastDefinition();

	/**
     * Returns a new object of class '<em>Mvel Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Mvel Expression</em>'.
     * @generated
     */
	MvelExpression createMvelExpression();

	/**
     * Returns a new object of class '<em>Node Factory</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Node Factory</em>'.
     * @generated
     */
	NodeFactory createNodeFactory();

	/**
     * Returns a new object of class '<em>No Output Expression Node</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>No Output Expression Node</em>'.
     * @generated
     */
	NoOutputExpressionNode createNoOutputExpressionNode();

	/**
     * Returns a new object of class '<em>Ognl Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Ognl Expression</em>'.
     * @generated
     */
	OgnlExpression createOgnlExpression();

	/**
     * Returns a new object of class '<em>Omit Field Entry</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Omit Field Entry</em>'.
     * @generated
     */
	OmitFieldEntry createOmitFieldEntry();

	/**
     * Returns a new object of class '<em>Omit Field List</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Omit Field List</em>'.
     * @generated
     */
	OmitFieldList createOmitFieldList();

	/**
     * Returns a new object of class '<em>On Completion Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>On Completion Definition</em>'.
     * @generated
     */
	OnCompletionDefinition createOnCompletionDefinition();

	/**
     * Returns a new object of class '<em>On Exception Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>On Exception Definition</em>'.
     * @generated
     */
	OnExceptionDefinition createOnExceptionDefinition();

	/**
     * Returns a new object of class '<em>Otherwise Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Otherwise Definition</em>'.
     * @generated
     */
	OtherwiseDefinition createOtherwiseDefinition();

	/**
     * Returns a new object of class '<em>Output</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Output</em>'.
     * @generated
     */
	Output createOutput();

	/**
     * Returns a new object of class '<em>Package Scan Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Package Scan Definition</em>'.
     * @generated
     */
	PackageScanDefinition createPackageScanDefinition();

	/**
     * Returns a new object of class '<em>Php Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Php Expression</em>'.
     * @generated
     */
	PhpExpression createPhpExpression();

	/**
     * Returns a new object of class '<em>Pipeline Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Pipeline Definition</em>'.
     * @generated
     */
	PipelineDefinition createPipelineDefinition();

	/**
     * Returns a new object of class '<em>Pgp Data Format</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pgp Data Format</em>'.
     * @generated
     */
    PgpDataFormat createPgpDataFormat();

    /**
     * Returns a new object of class '<em>Policy Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Policy Definition</em>'.
     * @generated
     */
	PolicyDefinition createPolicyDefinition();

	/**
     * Returns a new object of class '<em>Poll Enrich Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Poll Enrich Definition</em>'.
     * @generated
     */
	PollEnrichDefinition createPollEnrichDefinition();

	/**
     * Returns a new object of class '<em>Process Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Process Definition</em>'.
     * @generated
     */
	ProcessDefinition createProcessDefinition();

	/**
     * Returns a new object of class '<em>Processor Definition Helper</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Processor Definition Helper</em>'.
     * @generated
     */
	ProcessorDefinitionHelper createProcessorDefinitionHelper();

	/**
     * Returns a new object of class '<em>Properties Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Properties Definition</em>'.
     * @generated
     */
	PropertiesDefinition createPropertiesDefinition();

	/**
     * Returns a new object of class '<em>Property Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Property Definition</em>'.
     * @generated
     */
	PropertyDefinition createPropertyDefinition();

	/**
     * Returns a new object of class '<em>Property Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Property Expression</em>'.
     * @generated
     */
	PropertyExpression createPropertyExpression();

	/**
     * Returns a new object of class '<em>Protobuf Data Format</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Protobuf Data Format</em>'.
     * @generated
     */
	ProtobufDataFormat createProtobufDataFormat();

	/**
     * Returns a new object of class '<em>Python Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Python Expression</em>'.
     * @generated
     */
	PythonExpression createPythonExpression();

	/**
     * Returns a new object of class '<em>Random Load Balancer Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Random Load Balancer Definition</em>'.
     * @generated
     */
	RandomLoadBalancerDefinition createRandomLoadBalancerDefinition();

	/**
     * Returns a new object of class '<em>Recipient List Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Recipient List Definition</em>'.
     * @generated
     */
	RecipientListDefinition createRecipientListDefinition();

	/**
     * Returns a new object of class '<em>Redelivery Policy Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Redelivery Policy Definition</em>'.
     * @generated
     */
	RedeliveryPolicyDefinition createRedeliveryPolicyDefinition();

	/**
     * Returns a new object of class '<em>Ref Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Ref Expression</em>'.
     * @generated
     */
	RefExpression createRefExpression();

	/**
     * Returns a new object of class '<em>Remove Header Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Remove Header Definition</em>'.
     * @generated
     */
	RemoveHeaderDefinition createRemoveHeaderDefinition();

	/**
     * Returns a new object of class '<em>Remove Headers Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Remove Headers Definition</em>'.
     * @generated
     */
	RemoveHeadersDefinition createRemoveHeadersDefinition();

	/**
     * Returns a new object of class '<em>Remove Property Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Remove Property Definition</em>'.
     * @generated
     */
	RemovePropertyDefinition createRemovePropertyDefinition();

	/**
     * Returns a new object of class '<em>Resequence Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Resequence Definition</em>'.
     * @generated
     */
	ResequenceDefinition createResequenceDefinition();

	/**
     * Returns a new object of class '<em>Rollback Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Rollback Definition</em>'.
     * @generated
     */
	RollbackDefinition createRollbackDefinition();

	/**
     * Returns a new object of class '<em>Round Robin Load Balancer Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Round Robin Load Balancer Definition</em>'.
     * @generated
     */
	RoundRobinLoadBalancerDefinition createRoundRobinLoadBalancerDefinition();

	/**
     * Returns a new object of class '<em>Route Builder Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Route Builder Definition</em>'.
     * @generated
     */
	RouteBuilderDefinition createRouteBuilderDefinition();

	/**
     * Returns a new object of class '<em>Route Context Ref Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Route Context Ref Definition</em>'.
     * @generated
     */
	RouteContextRefDefinition createRouteContextRefDefinition();

	/**
     * Returns a new object of class '<em>Route Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Route Definition</em>'.
     * @generated
     */
	RouteDefinition createRouteDefinition();

	/**
     * Returns a new object of class '<em>Route Definition Helper</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Route Definition Helper</em>'.
     * @generated
     */
	RouteDefinitionHelper createRouteDefinitionHelper();

	/**
     * Returns a new object of class '<em>Routes Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Routes Definition</em>'.
     * @generated
     */
	RoutesDefinition createRoutesDefinition();

	/**
     * Returns a new object of class '<em>Routing Slip Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Routing Slip Definition</em>'.
     * @generated
     */
	RoutingSlipDefinition createRoutingSlipDefinition();

	/**
     * Returns a new object of class '<em>Rss Data Format</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Rss Data Format</em>'.
     * @generated
     */
	RssDataFormat createRssDataFormat();

	/**
     * Returns a new object of class '<em>Ruby Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Ruby Expression</em>'.
     * @generated
     */
	RubyExpression createRubyExpression();

	/**
     * Returns a new object of class '<em>Sampling Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Sampling Definition</em>'.
     * @generated
     */
	SamplingDefinition createSamplingDefinition();

	/**
     * Returns a new object of class '<em>Secure Random Parameters Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Secure Random Parameters Factory Bean</em>'.
     * @generated
     */
	SecureRandomParametersFactoryBean createSecureRandomParametersFactoryBean();

	/**
     * Returns a new object of class '<em>Secure Socket Protocols Parameters</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Secure Socket Protocols Parameters</em>'.
     * @generated
     */
	SecureSocketProtocolsParameters createSecureSocketProtocolsParameters();

	/**
     * Returns a new object of class '<em>Serialization Data Format</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Serialization Data Format</em>'.
     * @generated
     */
	SerializationDataFormat createSerializationDataFormat();

	/**
     * Returns a new object of class '<em>Set Body Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Set Body Definition</em>'.
     * @generated
     */
	SetBodyDefinition createSetBodyDefinition();

	/**
     * Returns a new object of class '<em>Set Exchange Pattern Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Set Exchange Pattern Definition</em>'.
     * @generated
     */
	SetExchangePatternDefinition createSetExchangePatternDefinition();

	/**
     * Returns a new object of class '<em>Set Fault Body Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Set Fault Body Definition</em>'.
     * @generated
     */
	SetFaultBodyDefinition createSetFaultBodyDefinition();

	/**
     * Returns a new object of class '<em>Set Header Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Set Header Definition</em>'.
     * @generated
     */
	SetHeaderDefinition createSetHeaderDefinition();

	/**
     * Returns a new object of class '<em>Set Out Header Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Set Out Header Definition</em>'.
     * @generated
     */
	SetOutHeaderDefinition createSetOutHeaderDefinition();

	/**
     * Returns a new object of class '<em>Set Property Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Set Property Definition</em>'.
     * @generated
     */
	SetPropertyDefinition createSetPropertyDefinition();

	/**
     * Returns a new object of class '<em>Simple Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Simple Expression</em>'.
     * @generated
     */
	SimpleExpression createSimpleExpression();

	/**
     * Returns a new object of class '<em>Soap Jaxb Data Format</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Soap Jaxb Data Format</em>'.
     * @generated
     */
	SoapJaxbDataFormat createSoapJaxbDataFormat();

	/**
     * Returns a new object of class '<em>Sort Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Sort Definition</em>'.
     * @generated
     */
	SortDefinition createSortDefinition();

	/**
     * Returns a new object of class '<em>Sp EL Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Sp EL Expression</em>'.
     * @generated
     */
	SpELExpression createSpELExpression();

	/**
     * Returns a new object of class '<em>Split Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Split Definition</em>'.
     * @generated
     */
	SplitDefinition createSplitDefinition();

	/**
     * Returns a new object of class '<em>Sql Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Sql Expression</em>'.
     * @generated
     */
	SqlExpression createSqlExpression();

	/**
     * Returns a new object of class '<em>Ssl Context Client Parameters Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Ssl Context Client Parameters Factory Bean</em>'.
     * @generated
     */
	SslContextClientParametersFactoryBean createSslContextClientParametersFactoryBean();

	/**
     * Returns a new object of class '<em>Ssl Context Parameters Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Ssl Context Parameters Factory Bean</em>'.
     * @generated
     */
	SslContextParametersFactoryBean createSslContextParametersFactoryBean();

	/**
     * Returns a new object of class '<em>Ssl Context Server Parameters Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Ssl Context Server Parameters Factory Bean</em>'.
     * @generated
     */
	SslContextServerParametersFactoryBean createSslContextServerParametersFactoryBean();

	/**
     * Returns a new object of class '<em>Sticky Load Balancer Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Sticky Load Balancer Definition</em>'.
     * @generated
     */
	StickyLoadBalancerDefinition createStickyLoadBalancerDefinition();

	/**
     * Returns a new object of class '<em>Stop Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Stop Definition</em>'.
     * @generated
     */
	StopDefinition createStopDefinition();

	/**
     * Returns a new object of class '<em>Stream Resequencer Config</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Stream Resequencer Config</em>'.
     * @generated
     */
	StreamResequencerConfig createStreamResequencerConfig();

	/**
     * Returns a new object of class '<em>String Data Format</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>String Data Format</em>'.
     * @generated
     */
	StringDataFormat createStringDataFormat();

	/**
     * Returns a new object of class '<em>Syslog Data Format</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Syslog Data Format</em>'.
     * @generated
     */
	SyslogDataFormat createSyslogDataFormat();

	/**
     * Returns a new object of class '<em>Thread Pool Profile Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Thread Pool Profile Definition</em>'.
     * @generated
     */
	ThreadPoolProfileDefinition createThreadPoolProfileDefinition();

	/**
     * Returns a new object of class '<em>Threads Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Threads Definition</em>'.
     * @generated
     */
	ThreadsDefinition createThreadsDefinition();

	/**
     * Returns a new object of class '<em>Throttle Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Throttle Definition</em>'.
     * @generated
     */
	ThrottleDefinition createThrottleDefinition();

	/**
     * Returns a new object of class '<em>Throw Exception Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Throw Exception Definition</em>'.
     * @generated
     */
	ThrowExceptionDefinition createThrowExceptionDefinition();

	/**
     * Returns a new object of class '<em>Tidy Markup Data Format</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Tidy Markup Data Format</em>'.
     * @generated
     */
	TidyMarkupDataFormat createTidyMarkupDataFormat();

	/**
     * Returns a new object of class '<em>To Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>To Definition</em>'.
     * @generated
     */
	ToDefinition createToDefinition();

	/**
     * Returns a new object of class '<em>Tokenizer Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Tokenizer Expression</em>'.
     * @generated
     */
	TokenizerExpression createTokenizerExpression();

	/**
     * Returns a new object of class '<em>Topic Load Balancer Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Topic Load Balancer Definition</em>'.
     * @generated
     */
	TopicLoadBalancerDefinition createTopicLoadBalancerDefinition();

	/**
     * Returns a new object of class '<em>Transacted Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Transacted Definition</em>'.
     * @generated
     */
	TransactedDefinition createTransactedDefinition();

	/**
     * Returns a new object of class '<em>Transform Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Transform Definition</em>'.
     * @generated
     */
	TransformDefinition createTransformDefinition();

	/**
     * Returns a new object of class '<em>Trust Managers Parameters Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Trust Managers Parameters Factory Bean</em>'.
     * @generated
     */
	TrustManagersParametersFactoryBean createTrustManagersParametersFactoryBean();

	/**
     * Returns a new object of class '<em>Try Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Try Definition</em>'.
     * @generated
     */
	TryDefinition createTryDefinition();

	/**
     * Returns a new object of class '<em>Unmarshal Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Unmarshal Definition</em>'.
     * @generated
     */
	UnmarshalDefinition createUnmarshalDefinition();

	/**
     * Returns a new object of class '<em>Validate Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Validate Definition</em>'.
     * @generated
     */
	ValidateDefinition createValidateDefinition();

	/**
     * Returns a new object of class '<em>Weighted Load Balancer Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Weighted Load Balancer Definition</em>'.
     * @generated
     */
	WeightedLoadBalancerDefinition createWeightedLoadBalancerDefinition();

	/**
     * Returns a new object of class '<em>When Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>When Definition</em>'.
     * @generated
     */
	WhenDefinition createWhenDefinition();

	/**
     * Returns a new object of class '<em>Wire Tap Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Wire Tap Definition</em>'.
     * @generated
     */
	WireTapDefinition createWireTapDefinition();

	/**
     * Returns a new object of class '<em>Xml Beans Data Format</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Xml Beans Data Format</em>'.
     * @generated
     */
	XmlBeansDataFormat createXmlBeansDataFormat();

	/**
     * Returns a new object of class '<em>Xml Security Data Format</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Xml Security Data Format</em>'.
     * @generated
     */
	XmlSecurityDataFormat createXmlSecurityDataFormat();

	/**
     * Returns a new object of class '<em>XPath Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>XPath Expression</em>'.
     * @generated
     */
	XPathExpression createXPathExpression();

	/**
     * Returns a new object of class '<em>XQuery Expression</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>XQuery Expression</em>'.
     * @generated
     */
	XQueryExpression createXQueryExpression();

	/**
     * Returns a new object of class '<em>XStream Data Format</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>XStream Data Format</em>'.
     * @generated
     */
	XStreamDataFormat createXStreamDataFormat();

	/**
     * Returns a new object of class '<em>Zip Data Format</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Zip Data Format</em>'.
     * @generated
     */
	ZipDataFormat createZipDataFormat();

	/**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	SpringPackage getSpringPackage();

} //SpringFactory
