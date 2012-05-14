/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.switchyard.tools.models.switchyard1_0.spring.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage
 * @generated
 */
public class SpringSwitch<T> extends Switch<T> {
	/**
     * The cached model package
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static SpringPackage modelPackage;

	/**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SpringSwitch() {
        if (modelPackage == null) {
            modelPackage = SpringPackage.eINSTANCE;
        }
    }

	/**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

	/**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case SpringPackage.ABSTRACT_CAMEL_CONSUMER_TEMPLATE_FACTORY_BEAN: {
                AbstractCamelConsumerTemplateFactoryBean abstractCamelConsumerTemplateFactoryBean = (AbstractCamelConsumerTemplateFactoryBean)theEObject;
                T result = caseAbstractCamelConsumerTemplateFactoryBean(abstractCamelConsumerTemplateFactoryBean);
                if (result == null) result = caseAbstractCamelFactoryBean(abstractCamelConsumerTemplateFactoryBean);
                if (result == null) result = caseIdentifiedType(abstractCamelConsumerTemplateFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ABSTRACT_CAMEL_CONTEXT_FACTORY_BEAN: {
                AbstractCamelContextFactoryBean abstractCamelContextFactoryBean = (AbstractCamelContextFactoryBean)theEObject;
                T result = caseAbstractCamelContextFactoryBean(abstractCamelContextFactoryBean);
                if (result == null) result = caseIdentifiedType(abstractCamelContextFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ABSTRACT_CAMEL_ENDPOINT_FACTORY_BEAN: {
                AbstractCamelEndpointFactoryBean abstractCamelEndpointFactoryBean = (AbstractCamelEndpointFactoryBean)theEObject;
                T result = caseAbstractCamelEndpointFactoryBean(abstractCamelEndpointFactoryBean);
                if (result == null) result = caseAbstractCamelFactoryBean(abstractCamelEndpointFactoryBean);
                if (result == null) result = caseIdentifiedType(abstractCamelEndpointFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ABSTRACT_CAMEL_FACTORY_BEAN: {
                AbstractCamelFactoryBean abstractCamelFactoryBean = (AbstractCamelFactoryBean)theEObject;
                T result = caseAbstractCamelFactoryBean(abstractCamelFactoryBean);
                if (result == null) result = caseIdentifiedType(abstractCamelFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ABSTRACT_CAMEL_PRODUCER_TEMPLATE_FACTORY_BEAN: {
                AbstractCamelProducerTemplateFactoryBean abstractCamelProducerTemplateFactoryBean = (AbstractCamelProducerTemplateFactoryBean)theEObject;
                T result = caseAbstractCamelProducerTemplateFactoryBean(abstractCamelProducerTemplateFactoryBean);
                if (result == null) result = caseAbstractCamelFactoryBean(abstractCamelProducerTemplateFactoryBean);
                if (result == null) result = caseIdentifiedType(abstractCamelProducerTemplateFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ABSTRACT_CAMEL_REDELIVERY_POLICY_FACTORY_BEAN: {
                AbstractCamelRedeliveryPolicyFactoryBean abstractCamelRedeliveryPolicyFactoryBean = (AbstractCamelRedeliveryPolicyFactoryBean)theEObject;
                T result = caseAbstractCamelRedeliveryPolicyFactoryBean(abstractCamelRedeliveryPolicyFactoryBean);
                if (result == null) result = caseAbstractCamelFactoryBean(abstractCamelRedeliveryPolicyFactoryBean);
                if (result == null) result = caseIdentifiedType(abstractCamelRedeliveryPolicyFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ABSTRACT_CAMEL_THREAD_POOL_FACTORY_BEAN: {
                AbstractCamelThreadPoolFactoryBean abstractCamelThreadPoolFactoryBean = (AbstractCamelThreadPoolFactoryBean)theEObject;
                T result = caseAbstractCamelThreadPoolFactoryBean(abstractCamelThreadPoolFactoryBean);
                if (result == null) result = caseAbstractCamelFactoryBean(abstractCamelThreadPoolFactoryBean);
                if (result == null) result = caseIdentifiedType(abstractCamelThreadPoolFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ABSTRACT_JSSE_UTIL_FACTORY_BEAN: {
                AbstractJsseUtilFactoryBean abstractJsseUtilFactoryBean = (AbstractJsseUtilFactoryBean)theEObject;
                T result = caseAbstractJsseUtilFactoryBean(abstractJsseUtilFactoryBean);
                if (result == null) result = caseAbstractCamelFactoryBean(abstractJsseUtilFactoryBean);
                if (result == null) result = caseIdentifiedType(abstractJsseUtilFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ABSTRACT_KEY_MANAGERS_PARAMETERS_FACTORY_BEAN: {
                AbstractKeyManagersParametersFactoryBean abstractKeyManagersParametersFactoryBean = (AbstractKeyManagersParametersFactoryBean)theEObject;
                T result = caseAbstractKeyManagersParametersFactoryBean(abstractKeyManagersParametersFactoryBean);
                if (result == null) result = caseAbstractJsseUtilFactoryBean(abstractKeyManagersParametersFactoryBean);
                if (result == null) result = caseAbstractCamelFactoryBean(abstractKeyManagersParametersFactoryBean);
                if (result == null) result = caseIdentifiedType(abstractKeyManagersParametersFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ABSTRACT_KEY_STORE_PARAMETERS_FACTORY_BEAN: {
                AbstractKeyStoreParametersFactoryBean abstractKeyStoreParametersFactoryBean = (AbstractKeyStoreParametersFactoryBean)theEObject;
                T result = caseAbstractKeyStoreParametersFactoryBean(abstractKeyStoreParametersFactoryBean);
                if (result == null) result = caseAbstractJsseUtilFactoryBean(abstractKeyStoreParametersFactoryBean);
                if (result == null) result = caseAbstractCamelFactoryBean(abstractKeyStoreParametersFactoryBean);
                if (result == null) result = caseIdentifiedType(abstractKeyStoreParametersFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ABSTRACT_SECURE_RANDOM_PARAMETERS_FACTORY_BEAN: {
                AbstractSecureRandomParametersFactoryBean abstractSecureRandomParametersFactoryBean = (AbstractSecureRandomParametersFactoryBean)theEObject;
                T result = caseAbstractSecureRandomParametersFactoryBean(abstractSecureRandomParametersFactoryBean);
                if (result == null) result = caseAbstractJsseUtilFactoryBean(abstractSecureRandomParametersFactoryBean);
                if (result == null) result = caseAbstractCamelFactoryBean(abstractSecureRandomParametersFactoryBean);
                if (result == null) result = caseIdentifiedType(abstractSecureRandomParametersFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ABSTRACT_TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN: {
                AbstractTrustManagersParametersFactoryBean abstractTrustManagersParametersFactoryBean = (AbstractTrustManagersParametersFactoryBean)theEObject;
                T result = caseAbstractTrustManagersParametersFactoryBean(abstractTrustManagersParametersFactoryBean);
                if (result == null) result = caseAbstractJsseUtilFactoryBean(abstractTrustManagersParametersFactoryBean);
                if (result == null) result = caseAbstractCamelFactoryBean(abstractTrustManagersParametersFactoryBean);
                if (result == null) result = caseIdentifiedType(abstractTrustManagersParametersFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.AGGREGATE_DEFINITION: {
                AggregateDefinition aggregateDefinition = (AggregateDefinition)theEObject;
                T result = caseAggregateDefinition(aggregateDefinition);
                if (result == null) result = caseProcessorDefinition(aggregateDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(aggregateDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ALIAS_ENTRY: {
                AliasEntry aliasEntry = (AliasEntry)theEObject;
                T result = caseAliasEntry(aliasEntry);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ALIAS_LIST: {
                AliasList aliasList = (AliasList)theEObject;
                T result = caseAliasList(aliasList);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.AOP_DEFINITION: {
                AopDefinition aopDefinition = (AopDefinition)theEObject;
                T result = caseAopDefinition(aopDefinition);
                if (result == null) result = caseOutput(aopDefinition);
                if (result == null) result = caseProcessorDefinition(aopDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(aopDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.BATCH_RESEQUENCER_CONFIG: {
                BatchResequencerConfig batchResequencerConfig = (BatchResequencerConfig)theEObject;
                T result = caseBatchResequencerConfig(batchResequencerConfig);
                if (result == null) result = caseResequencerConfig(batchResequencerConfig);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.BEAN_DEFINITION: {
                BeanDefinition beanDefinition = (BeanDefinition)theEObject;
                T result = caseBeanDefinition(beanDefinition);
                if (result == null) result = caseNoOutputDefinition(beanDefinition);
                if (result == null) result = caseProcessorDefinition(beanDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(beanDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.BINDY_DATA_FORMAT: {
                BindyDataFormat bindyDataFormat = (BindyDataFormat)theEObject;
                T result = caseBindyDataFormat(bindyDataFormat);
                if (result == null) result = caseDataFormat(bindyDataFormat);
                if (result == null) result = caseIdentifiedType(bindyDataFormat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CAMEL_BEAN_POST_PROCESSOR: {
                CamelBeanPostProcessor camelBeanPostProcessor = (CamelBeanPostProcessor)theEObject;
                T result = caseCamelBeanPostProcessor(camelBeanPostProcessor);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CAMEL_CONSUMER_TEMPLATE_FACTORY_BEAN: {
                CamelConsumerTemplateFactoryBean camelConsumerTemplateFactoryBean = (CamelConsumerTemplateFactoryBean)theEObject;
                T result = caseCamelConsumerTemplateFactoryBean(camelConsumerTemplateFactoryBean);
                if (result == null) result = caseAbstractCamelConsumerTemplateFactoryBean(camelConsumerTemplateFactoryBean);
                if (result == null) result = caseAbstractCamelFactoryBean(camelConsumerTemplateFactoryBean);
                if (result == null) result = caseIdentifiedType(camelConsumerTemplateFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CAMEL_CONTEXT_FACTORY_BEAN: {
                CamelContextFactoryBean camelContextFactoryBean = (CamelContextFactoryBean)theEObject;
                T result = caseCamelContextFactoryBean(camelContextFactoryBean);
                if (result == null) result = caseAbstractCamelContextFactoryBean(camelContextFactoryBean);
                if (result == null) result = caseIdentifiedType(camelContextFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CAMEL_ENDPOINT_FACTORY_BEAN: {
                CamelEndpointFactoryBean camelEndpointFactoryBean = (CamelEndpointFactoryBean)theEObject;
                T result = caseCamelEndpointFactoryBean(camelEndpointFactoryBean);
                if (result == null) result = caseAbstractCamelEndpointFactoryBean(camelEndpointFactoryBean);
                if (result == null) result = caseAbstractCamelFactoryBean(camelEndpointFactoryBean);
                if (result == null) result = caseIdentifiedType(camelEndpointFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CAMEL_JMX_AGENT_DEFINITION: {
                CamelJMXAgentDefinition camelJMXAgentDefinition = (CamelJMXAgentDefinition)theEObject;
                T result = caseCamelJMXAgentDefinition(camelJMXAgentDefinition);
                if (result == null) result = caseIdentifiedType(camelJMXAgentDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CAMEL_PRODUCER_TEMPLATE_FACTORY_BEAN: {
                CamelProducerTemplateFactoryBean camelProducerTemplateFactoryBean = (CamelProducerTemplateFactoryBean)theEObject;
                T result = caseCamelProducerTemplateFactoryBean(camelProducerTemplateFactoryBean);
                if (result == null) result = caseAbstractCamelProducerTemplateFactoryBean(camelProducerTemplateFactoryBean);
                if (result == null) result = caseAbstractCamelFactoryBean(camelProducerTemplateFactoryBean);
                if (result == null) result = caseIdentifiedType(camelProducerTemplateFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CAMEL_PROPERTY_PLACEHOLDER_DEFINITION: {
                CamelPropertyPlaceholderDefinition camelPropertyPlaceholderDefinition = (CamelPropertyPlaceholderDefinition)theEObject;
                T result = caseCamelPropertyPlaceholderDefinition(camelPropertyPlaceholderDefinition);
                if (result == null) result = caseIdentifiedType(camelPropertyPlaceholderDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CAMEL_PROXY_FACTORY_DEFINITION: {
                CamelProxyFactoryDefinition camelProxyFactoryDefinition = (CamelProxyFactoryDefinition)theEObject;
                T result = caseCamelProxyFactoryDefinition(camelProxyFactoryDefinition);
                if (result == null) result = caseIdentifiedType(camelProxyFactoryDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CAMEL_REDELIVERY_POLICY_FACTORY_BEAN: {
                CamelRedeliveryPolicyFactoryBean camelRedeliveryPolicyFactoryBean = (CamelRedeliveryPolicyFactoryBean)theEObject;
                T result = caseCamelRedeliveryPolicyFactoryBean(camelRedeliveryPolicyFactoryBean);
                if (result == null) result = caseAbstractCamelRedeliveryPolicyFactoryBean(camelRedeliveryPolicyFactoryBean);
                if (result == null) result = caseAbstractCamelFactoryBean(camelRedeliveryPolicyFactoryBean);
                if (result == null) result = caseIdentifiedType(camelRedeliveryPolicyFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CAMEL_ROUTE_CONTEXT_FACTORY_BEAN: {
                CamelRouteContextFactoryBean camelRouteContextFactoryBean = (CamelRouteContextFactoryBean)theEObject;
                T result = caseCamelRouteContextFactoryBean(camelRouteContextFactoryBean);
                if (result == null) result = caseIdentifiedType(camelRouteContextFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CAMEL_SERVICE_EXPORTER_DEFINITION: {
                CamelServiceExporterDefinition camelServiceExporterDefinition = (CamelServiceExporterDefinition)theEObject;
                T result = caseCamelServiceExporterDefinition(camelServiceExporterDefinition);
                if (result == null) result = caseIdentifiedType(camelServiceExporterDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CAMEL_THREAD_POOL_FACTORY_BEAN: {
                CamelThreadPoolFactoryBean camelThreadPoolFactoryBean = (CamelThreadPoolFactoryBean)theEObject;
                T result = caseCamelThreadPoolFactoryBean(camelThreadPoolFactoryBean);
                if (result == null) result = caseAbstractCamelThreadPoolFactoryBean(camelThreadPoolFactoryBean);
                if (result == null) result = caseAbstractCamelFactoryBean(camelThreadPoolFactoryBean);
                if (result == null) result = caseIdentifiedType(camelThreadPoolFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CASTOR_DATA_FORMAT: {
                CastorDataFormat castorDataFormat = (CastorDataFormat)theEObject;
                T result = caseCastorDataFormat(castorDataFormat);
                if (result == null) result = caseDataFormat(castorDataFormat);
                if (result == null) result = caseIdentifiedType(castorDataFormat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CATCH_DEFINITION: {
                CatchDefinition catchDefinition = (CatchDefinition)theEObject;
                T result = caseCatchDefinition(catchDefinition);
                if (result == null) result = caseProcessorDefinition(catchDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(catchDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CHOICE_DEFINITION: {
                ChoiceDefinition choiceDefinition = (ChoiceDefinition)theEObject;
                T result = caseChoiceDefinition(choiceDefinition);
                if (result == null) result = caseProcessorDefinition(choiceDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(choiceDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CIPHER_SUITES_PARAMETERS: {
                CipherSuitesParameters cipherSuitesParameters = (CipherSuitesParameters)theEObject;
                T result = caseCipherSuitesParameters(cipherSuitesParameters);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CONSTANT_EXPRESSION: {
                ConstantExpression constantExpression = (ConstantExpression)theEObject;
                T result = caseConstantExpression(constantExpression);
                if (result == null) result = caseExpression(constantExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CONSTANTS: {
                Constants constants = (Constants)theEObject;
                T result = caseConstants(constants);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CONTEXT_SCAN_DEFINITION: {
                ContextScanDefinition contextScanDefinition = (ContextScanDefinition)theEObject;
                T result = caseContextScanDefinition(contextScanDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CONVERT_BODY_DEFINITION: {
                ConvertBodyDefinition convertBodyDefinition = (ConvertBodyDefinition)theEObject;
                T result = caseConvertBodyDefinition(convertBodyDefinition);
                if (result == null) result = caseNoOutputDefinition(convertBodyDefinition);
                if (result == null) result = caseProcessorDefinition(convertBodyDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(convertBodyDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CONVERTER_ENTRY: {
                ConverterEntry converterEntry = (ConverterEntry)theEObject;
                T result = caseConverterEntry(converterEntry);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CONVERTER_LIST: {
                ConverterList converterList = (ConverterList)theEObject;
                T result = caseConverterList(converterList);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CRYPTO_DATA_FORMAT: {
                CryptoDataFormat cryptoDataFormat = (CryptoDataFormat)theEObject;
                T result = caseCryptoDataFormat(cryptoDataFormat);
                if (result == null) result = caseDataFormat(cryptoDataFormat);
                if (result == null) result = caseIdentifiedType(cryptoDataFormat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CSV_DATA_FORMAT: {
                CsvDataFormat csvDataFormat = (CsvDataFormat)theEObject;
                T result = caseCsvDataFormat(csvDataFormat);
                if (result == null) result = caseDataFormat(csvDataFormat);
                if (result == null) result = caseIdentifiedType(csvDataFormat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CUSTOM_DATA_FORMAT: {
                CustomDataFormat customDataFormat = (CustomDataFormat)theEObject;
                T result = caseCustomDataFormat(customDataFormat);
                if (result == null) result = caseDataFormat(customDataFormat);
                if (result == null) result = caseIdentifiedType(customDataFormat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.CUSTOM_LOAD_BALANCER_DEFINITION: {
                CustomLoadBalancerDefinition customLoadBalancerDefinition = (CustomLoadBalancerDefinition)theEObject;
                T result = caseCustomLoadBalancerDefinition(customLoadBalancerDefinition);
                if (result == null) result = caseLoadBalancer(customLoadBalancerDefinition);
                if (result == null) result = caseIdentifiedType(customLoadBalancerDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.DATA_FORMAT: {
                DataFormat dataFormat = (DataFormat)theEObject;
                T result = caseDataFormat(dataFormat);
                if (result == null) result = caseIdentifiedType(dataFormat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.DATA_FORMATS_DEFINITION: {
                DataFormatsDefinition dataFormatsDefinition = (DataFormatsDefinition)theEObject;
                T result = caseDataFormatsDefinition(dataFormatsDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.DELAY_DEFINITION: {
                DelayDefinition delayDefinition = (DelayDefinition)theEObject;
                T result = caseDelayDefinition(delayDefinition);
                if (result == null) result = caseExpressionNode(delayDefinition);
                if (result == null) result = caseProcessorDefinition(delayDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(delayDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.DESCRIPTION_DEFINITION: {
                DescriptionDefinition descriptionDefinition = (DescriptionDefinition)theEObject;
                T result = caseDescriptionDefinition(descriptionDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.DOCUMENT_ROOT: {
                DocumentRoot documentRoot = (DocumentRoot)theEObject;
                T result = caseDocumentRoot(documentRoot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.DYNAMIC_ROUTER_DEFINITION: {
                DynamicRouterDefinition dynamicRouterDefinition = (DynamicRouterDefinition)theEObject;
                T result = caseDynamicRouterDefinition(dynamicRouterDefinition);
                if (result == null) result = caseNoOutputExpressionNode(dynamicRouterDefinition);
                if (result == null) result = caseExpressionNode(dynamicRouterDefinition);
                if (result == null) result = caseProcessorDefinition(dynamicRouterDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(dynamicRouterDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.EL_EXPRESSION: {
                ElExpression elExpression = (ElExpression)theEObject;
                T result = caseElExpression(elExpression);
                if (result == null) result = caseExpression(elExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ENRICH_DEFINITION: {
                EnrichDefinition enrichDefinition = (EnrichDefinition)theEObject;
                T result = caseEnrichDefinition(enrichDefinition);
                if (result == null) result = caseNoOutputDefinition(enrichDefinition);
                if (result == null) result = caseProcessorDefinition(enrichDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(enrichDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ERROR_HANDLER_DEFINITION: {
                ErrorHandlerDefinition errorHandlerDefinition = (ErrorHandlerDefinition)theEObject;
                T result = caseErrorHandlerDefinition(errorHandlerDefinition);
                if (result == null) result = caseIdentifiedType(errorHandlerDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.EXPRESSION: {
                Expression expression = (Expression)theEObject;
                T result = caseExpression(expression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.EXPRESSION_NODE: {
                ExpressionNode expressionNode = (ExpressionNode)theEObject;
                T result = caseExpressionNode(expressionNode);
                if (result == null) result = caseProcessorDefinition(expressionNode);
                if (result == null) result = caseOptionalIdentifiedDefinition(expressionNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.EXPRESSION_SUB_ELEMENT_DEFINITION: {
                ExpressionSubElementDefinition expressionSubElementDefinition = (ExpressionSubElementDefinition)theEObject;
                T result = caseExpressionSubElementDefinition(expressionSubElementDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.FAILOVER_LOAD_BALANCER_DEFINITION: {
                FailoverLoadBalancerDefinition failoverLoadBalancerDefinition = (FailoverLoadBalancerDefinition)theEObject;
                T result = caseFailoverLoadBalancerDefinition(failoverLoadBalancerDefinition);
                if (result == null) result = caseLoadBalancer(failoverLoadBalancerDefinition);
                if (result == null) result = caseIdentifiedType(failoverLoadBalancerDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.FILTER_DEFINITION: {
                FilterDefinition filterDefinition = (FilterDefinition)theEObject;
                T result = caseFilterDefinition(filterDefinition);
                if (result == null) result = caseExpressionNode(filterDefinition);
                if (result == null) result = caseProcessorDefinition(filterDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(filterDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.FILTER_PARAMETERS: {
                FilterParameters filterParameters = (FilterParameters)theEObject;
                T result = caseFilterParameters(filterParameters);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.FINALLY_DEFINITION: {
                FinallyDefinition finallyDefinition = (FinallyDefinition)theEObject;
                T result = caseFinallyDefinition(finallyDefinition);
                if (result == null) result = caseOutput(finallyDefinition);
                if (result == null) result = caseProcessorDefinition(finallyDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(finallyDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.FLATPACK_DATA_FORMAT: {
                FlatpackDataFormat flatpackDataFormat = (FlatpackDataFormat)theEObject;
                T result = caseFlatpackDataFormat(flatpackDataFormat);
                if (result == null) result = caseDataFormat(flatpackDataFormat);
                if (result == null) result = caseIdentifiedType(flatpackDataFormat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.FROM_DEFINITION: {
                FromDefinition fromDefinition = (FromDefinition)theEObject;
                T result = caseFromDefinition(fromDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(fromDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.GROOVY_EXPRESSION: {
                GroovyExpression groovyExpression = (GroovyExpression)theEObject;
                T result = caseGroovyExpression(groovyExpression);
                if (result == null) result = caseExpression(groovyExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.GZIP_DATA_FORMAT: {
                GzipDataFormat gzipDataFormat = (GzipDataFormat)theEObject;
                T result = caseGzipDataFormat(gzipDataFormat);
                if (result == null) result = caseDataFormat(gzipDataFormat);
                if (result == null) result = caseIdentifiedType(gzipDataFormat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.HEADER_EXPRESSION: {
                HeaderExpression headerExpression = (HeaderExpression)theEObject;
                T result = caseHeaderExpression(headerExpression);
                if (result == null) result = caseExpression(headerExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.HL7_DATA_FORMAT: {
                Hl7DataFormat hl7DataFormat = (Hl7DataFormat)theEObject;
                T result = caseHl7DataFormat(hl7DataFormat);
                if (result == null) result = caseDataFormat(hl7DataFormat);
                if (result == null) result = caseIdentifiedType(hl7DataFormat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION: {
                IdempotentConsumerDefinition idempotentConsumerDefinition = (IdempotentConsumerDefinition)theEObject;
                T result = caseIdempotentConsumerDefinition(idempotentConsumerDefinition);
                if (result == null) result = caseExpressionNode(idempotentConsumerDefinition);
                if (result == null) result = caseProcessorDefinition(idempotentConsumerDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(idempotentConsumerDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.IDENTIFIED_TYPE: {
                IdentifiedType identifiedType = (IdentifiedType)theEObject;
                T result = caseIdentifiedType(identifiedType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.IMPLICIT_COLLECTION_ENTRY: {
                ImplicitCollectionEntry implicitCollectionEntry = (ImplicitCollectionEntry)theEObject;
                T result = caseImplicitCollectionEntry(implicitCollectionEntry);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.IMPLICIT_COLLECTION_LIST: {
                ImplicitCollectionList implicitCollectionList = (ImplicitCollectionList)theEObject;
                T result = caseImplicitCollectionList(implicitCollectionList);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.IN_ONLY_DEFINITION: {
                InOnlyDefinition inOnlyDefinition = (InOnlyDefinition)theEObject;
                T result = caseInOnlyDefinition(inOnlyDefinition);
                if (result == null) result = caseSendDefinition(inOnlyDefinition);
                if (result == null) result = caseNoOutputDefinition(inOnlyDefinition);
                if (result == null) result = caseProcessorDefinition(inOnlyDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(inOnlyDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.IN_OUT_DEFINITION: {
                InOutDefinition inOutDefinition = (InOutDefinition)theEObject;
                T result = caseInOutDefinition(inOutDefinition);
                if (result == null) result = caseSendDefinition(inOutDefinition);
                if (result == null) result = caseNoOutputDefinition(inOutDefinition);
                if (result == null) result = caseProcessorDefinition(inOutDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(inOutDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.INTERCEPT_DEFINITION: {
                InterceptDefinition interceptDefinition = (InterceptDefinition)theEObject;
                T result = caseInterceptDefinition(interceptDefinition);
                if (result == null) result = caseOutput(interceptDefinition);
                if (result == null) result = caseProcessorDefinition(interceptDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(interceptDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.INTERCEPT_FROM_DEFINITION: {
                InterceptFromDefinition interceptFromDefinition = (InterceptFromDefinition)theEObject;
                T result = caseInterceptFromDefinition(interceptFromDefinition);
                if (result == null) result = caseInterceptDefinition(interceptFromDefinition);
                if (result == null) result = caseOutput(interceptFromDefinition);
                if (result == null) result = caseProcessorDefinition(interceptFromDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(interceptFromDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.INTERCEPT_SEND_TO_ENDPOINT_DEFINITION: {
                InterceptSendToEndpointDefinition interceptSendToEndpointDefinition = (InterceptSendToEndpointDefinition)theEObject;
                T result = caseInterceptSendToEndpointDefinition(interceptSendToEndpointDefinition);
                if (result == null) result = caseOutput(interceptSendToEndpointDefinition);
                if (result == null) result = caseProcessorDefinition(interceptSendToEndpointDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(interceptSendToEndpointDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.JAVA_SCRIPT_EXPRESSION: {
                JavaScriptExpression javaScriptExpression = (JavaScriptExpression)theEObject;
                T result = caseJavaScriptExpression(javaScriptExpression);
                if (result == null) result = caseExpression(javaScriptExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.JAXB_DATA_FORMAT: {
                JaxbDataFormat jaxbDataFormat = (JaxbDataFormat)theEObject;
                T result = caseJaxbDataFormat(jaxbDataFormat);
                if (result == null) result = caseDataFormat(jaxbDataFormat);
                if (result == null) result = caseIdentifiedType(jaxbDataFormat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.JIBX_DATA_FORMAT: {
                JibxDataFormat jibxDataFormat = (JibxDataFormat)theEObject;
                T result = caseJibxDataFormat(jibxDataFormat);
                if (result == null) result = caseDataFormat(jibxDataFormat);
                if (result == null) result = caseIdentifiedType(jibxDataFormat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.JSON_DATA_FORMAT: {
                JsonDataFormat jsonDataFormat = (JsonDataFormat)theEObject;
                T result = caseJsonDataFormat(jsonDataFormat);
                if (result == null) result = caseDataFormat(jsonDataFormat);
                if (result == null) result = caseIdentifiedType(jsonDataFormat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.JX_PATH_EXPRESSION: {
                JxPathExpression jxPathExpression = (JxPathExpression)theEObject;
                T result = caseJxPathExpression(jxPathExpression);
                if (result == null) result = caseExpression(jxPathExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.KEY_MANAGERS_PARAMETERS_FACTORY_BEAN: {
                KeyManagersParametersFactoryBean keyManagersParametersFactoryBean = (KeyManagersParametersFactoryBean)theEObject;
                T result = caseKeyManagersParametersFactoryBean(keyManagersParametersFactoryBean);
                if (result == null) result = caseAbstractKeyManagersParametersFactoryBean(keyManagersParametersFactoryBean);
                if (result == null) result = caseAbstractJsseUtilFactoryBean(keyManagersParametersFactoryBean);
                if (result == null) result = caseAbstractCamelFactoryBean(keyManagersParametersFactoryBean);
                if (result == null) result = caseIdentifiedType(keyManagersParametersFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.KEY_STORE_PARAMETERS_FACTORY_BEAN: {
                KeyStoreParametersFactoryBean keyStoreParametersFactoryBean = (KeyStoreParametersFactoryBean)theEObject;
                T result = caseKeyStoreParametersFactoryBean(keyStoreParametersFactoryBean);
                if (result == null) result = caseAbstractKeyStoreParametersFactoryBean(keyStoreParametersFactoryBean);
                if (result == null) result = caseAbstractJsseUtilFactoryBean(keyStoreParametersFactoryBean);
                if (result == null) result = caseAbstractCamelFactoryBean(keyStoreParametersFactoryBean);
                if (result == null) result = caseIdentifiedType(keyStoreParametersFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.LANGUAGE_EXPRESSION: {
                LanguageExpression languageExpression = (LanguageExpression)theEObject;
                T result = caseLanguageExpression(languageExpression);
                if (result == null) result = caseExpression(languageExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.LOAD_BALANCE_DEFINITION: {
                LoadBalanceDefinition loadBalanceDefinition = (LoadBalanceDefinition)theEObject;
                T result = caseLoadBalanceDefinition(loadBalanceDefinition);
                if (result == null) result = caseProcessorDefinition(loadBalanceDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(loadBalanceDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.LOAD_BALANCER: {
                LoadBalancer loadBalancer = (LoadBalancer)theEObject;
                T result = caseLoadBalancer(loadBalancer);
                if (result == null) result = caseIdentifiedType(loadBalancer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.LOG_DEFINITION: {
                LogDefinition logDefinition = (LogDefinition)theEObject;
                T result = caseLogDefinition(logDefinition);
                if (result == null) result = caseNoOutputDefinition(logDefinition);
                if (result == null) result = caseProcessorDefinition(logDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(logDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.LOOP_DEFINITION: {
                LoopDefinition loopDefinition = (LoopDefinition)theEObject;
                T result = caseLoopDefinition(loopDefinition);
                if (result == null) result = caseExpressionNode(loopDefinition);
                if (result == null) result = caseProcessorDefinition(loopDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(loopDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.MARSHAL_DEFINITION: {
                MarshalDefinition marshalDefinition = (MarshalDefinition)theEObject;
                T result = caseMarshalDefinition(marshalDefinition);
                if (result == null) result = caseNoOutputDefinition(marshalDefinition);
                if (result == null) result = caseProcessorDefinition(marshalDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(marshalDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.METHOD_CALL_EXPRESSION: {
                MethodCallExpression methodCallExpression = (MethodCallExpression)theEObject;
                T result = caseMethodCallExpression(methodCallExpression);
                if (result == null) result = caseExpression(methodCallExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.MULTICAST_DEFINITION: {
                MulticastDefinition multicastDefinition = (MulticastDefinition)theEObject;
                T result = caseMulticastDefinition(multicastDefinition);
                if (result == null) result = caseOutput(multicastDefinition);
                if (result == null) result = caseProcessorDefinition(multicastDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(multicastDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.MVEL_EXPRESSION: {
                MvelExpression mvelExpression = (MvelExpression)theEObject;
                T result = caseMvelExpression(mvelExpression);
                if (result == null) result = caseExpression(mvelExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.NAMESPACE_AWARE_EXPRESSION: {
                NamespaceAwareExpression namespaceAwareExpression = (NamespaceAwareExpression)theEObject;
                T result = caseNamespaceAwareExpression(namespaceAwareExpression);
                if (result == null) result = caseExpression(namespaceAwareExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.NODE_FACTORY: {
                NodeFactory nodeFactory = (NodeFactory)theEObject;
                T result = caseNodeFactory(nodeFactory);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.NO_OUTPUT_DEFINITION: {
                NoOutputDefinition noOutputDefinition = (NoOutputDefinition)theEObject;
                T result = caseNoOutputDefinition(noOutputDefinition);
                if (result == null) result = caseProcessorDefinition(noOutputDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(noOutputDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.NO_OUTPUT_EXPRESSION_NODE: {
                NoOutputExpressionNode noOutputExpressionNode = (NoOutputExpressionNode)theEObject;
                T result = caseNoOutputExpressionNode(noOutputExpressionNode);
                if (result == null) result = caseExpressionNode(noOutputExpressionNode);
                if (result == null) result = caseProcessorDefinition(noOutputExpressionNode);
                if (result == null) result = caseOptionalIdentifiedDefinition(noOutputExpressionNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.OGNL_EXPRESSION: {
                OgnlExpression ognlExpression = (OgnlExpression)theEObject;
                T result = caseOgnlExpression(ognlExpression);
                if (result == null) result = caseExpression(ognlExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.OMIT_FIELD_ENTRY: {
                OmitFieldEntry omitFieldEntry = (OmitFieldEntry)theEObject;
                T result = caseOmitFieldEntry(omitFieldEntry);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.OMIT_FIELD_LIST: {
                OmitFieldList omitFieldList = (OmitFieldList)theEObject;
                T result = caseOmitFieldList(omitFieldList);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ON_COMPLETION_DEFINITION: {
                OnCompletionDefinition onCompletionDefinition = (OnCompletionDefinition)theEObject;
                T result = caseOnCompletionDefinition(onCompletionDefinition);
                if (result == null) result = caseProcessorDefinition(onCompletionDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(onCompletionDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ON_EXCEPTION_DEFINITION: {
                OnExceptionDefinition onExceptionDefinition = (OnExceptionDefinition)theEObject;
                T result = caseOnExceptionDefinition(onExceptionDefinition);
                if (result == null) result = caseProcessorDefinition(onExceptionDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(onExceptionDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.OPTIONAL_IDENTIFIED_DEFINITION: {
                OptionalIdentifiedDefinition optionalIdentifiedDefinition = (OptionalIdentifiedDefinition)theEObject;
                T result = caseOptionalIdentifiedDefinition(optionalIdentifiedDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.OTHERWISE_DEFINITION: {
                OtherwiseDefinition otherwiseDefinition = (OtherwiseDefinition)theEObject;
                T result = caseOtherwiseDefinition(otherwiseDefinition);
                if (result == null) result = caseOutput(otherwiseDefinition);
                if (result == null) result = caseProcessorDefinition(otherwiseDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(otherwiseDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.OUTPUT: {
                Output output = (Output)theEObject;
                T result = caseOutput(output);
                if (result == null) result = caseProcessorDefinition(output);
                if (result == null) result = caseOptionalIdentifiedDefinition(output);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.PACKAGE_SCAN_DEFINITION: {
                PackageScanDefinition packageScanDefinition = (PackageScanDefinition)theEObject;
                T result = casePackageScanDefinition(packageScanDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.PHP_EXPRESSION: {
                PhpExpression phpExpression = (PhpExpression)theEObject;
                T result = casePhpExpression(phpExpression);
                if (result == null) result = caseExpression(phpExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.PIPELINE_DEFINITION: {
                PipelineDefinition pipelineDefinition = (PipelineDefinition)theEObject;
                T result = casePipelineDefinition(pipelineDefinition);
                if (result == null) result = caseOutput(pipelineDefinition);
                if (result == null) result = caseProcessorDefinition(pipelineDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(pipelineDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.POLICY_DEFINITION: {
                PolicyDefinition policyDefinition = (PolicyDefinition)theEObject;
                T result = casePolicyDefinition(policyDefinition);
                if (result == null) result = caseOutput(policyDefinition);
                if (result == null) result = caseProcessorDefinition(policyDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(policyDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.POLL_ENRICH_DEFINITION: {
                PollEnrichDefinition pollEnrichDefinition = (PollEnrichDefinition)theEObject;
                T result = casePollEnrichDefinition(pollEnrichDefinition);
                if (result == null) result = caseNoOutputDefinition(pollEnrichDefinition);
                if (result == null) result = caseProcessorDefinition(pollEnrichDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(pollEnrichDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.PROCESS_DEFINITION: {
                ProcessDefinition processDefinition = (ProcessDefinition)theEObject;
                T result = caseProcessDefinition(processDefinition);
                if (result == null) result = caseNoOutputDefinition(processDefinition);
                if (result == null) result = caseProcessorDefinition(processDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(processDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.PROCESSOR_DEFINITION: {
                ProcessorDefinition processorDefinition = (ProcessorDefinition)theEObject;
                T result = caseProcessorDefinition(processorDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(processorDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.PROCESSOR_DEFINITION_HELPER: {
                ProcessorDefinitionHelper processorDefinitionHelper = (ProcessorDefinitionHelper)theEObject;
                T result = caseProcessorDefinitionHelper(processorDefinitionHelper);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.PROPERTIES_DEFINITION: {
                PropertiesDefinition propertiesDefinition = (PropertiesDefinition)theEObject;
                T result = casePropertiesDefinition(propertiesDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.PROPERTY_DEFINITION: {
                PropertyDefinition propertyDefinition = (PropertyDefinition)theEObject;
                T result = casePropertyDefinition(propertyDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.PROPERTY_EXPRESSION: {
                PropertyExpression propertyExpression = (PropertyExpression)theEObject;
                T result = casePropertyExpression(propertyExpression);
                if (result == null) result = caseExpression(propertyExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.PROTOBUF_DATA_FORMAT: {
                ProtobufDataFormat protobufDataFormat = (ProtobufDataFormat)theEObject;
                T result = caseProtobufDataFormat(protobufDataFormat);
                if (result == null) result = caseDataFormat(protobufDataFormat);
                if (result == null) result = caseIdentifiedType(protobufDataFormat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.PYTHON_EXPRESSION: {
                PythonExpression pythonExpression = (PythonExpression)theEObject;
                T result = casePythonExpression(pythonExpression);
                if (result == null) result = caseExpression(pythonExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.RANDOM_LOAD_BALANCER_DEFINITION: {
                RandomLoadBalancerDefinition randomLoadBalancerDefinition = (RandomLoadBalancerDefinition)theEObject;
                T result = caseRandomLoadBalancerDefinition(randomLoadBalancerDefinition);
                if (result == null) result = caseLoadBalancer(randomLoadBalancerDefinition);
                if (result == null) result = caseIdentifiedType(randomLoadBalancerDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.RECIPIENT_LIST_DEFINITION: {
                RecipientListDefinition recipientListDefinition = (RecipientListDefinition)theEObject;
                T result = caseRecipientListDefinition(recipientListDefinition);
                if (result == null) result = caseNoOutputExpressionNode(recipientListDefinition);
                if (result == null) result = caseExpressionNode(recipientListDefinition);
                if (result == null) result = caseProcessorDefinition(recipientListDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(recipientListDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.REDELIVERY_POLICY_DEFINITION: {
                RedeliveryPolicyDefinition redeliveryPolicyDefinition = (RedeliveryPolicyDefinition)theEObject;
                T result = caseRedeliveryPolicyDefinition(redeliveryPolicyDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.REF_EXPRESSION: {
                RefExpression refExpression = (RefExpression)theEObject;
                T result = caseRefExpression(refExpression);
                if (result == null) result = caseExpression(refExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.REMOVE_HEADER_DEFINITION: {
                RemoveHeaderDefinition removeHeaderDefinition = (RemoveHeaderDefinition)theEObject;
                T result = caseRemoveHeaderDefinition(removeHeaderDefinition);
                if (result == null) result = caseNoOutputDefinition(removeHeaderDefinition);
                if (result == null) result = caseProcessorDefinition(removeHeaderDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(removeHeaderDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.REMOVE_HEADERS_DEFINITION: {
                RemoveHeadersDefinition removeHeadersDefinition = (RemoveHeadersDefinition)theEObject;
                T result = caseRemoveHeadersDefinition(removeHeadersDefinition);
                if (result == null) result = caseNoOutputDefinition(removeHeadersDefinition);
                if (result == null) result = caseProcessorDefinition(removeHeadersDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(removeHeadersDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.REMOVE_PROPERTY_DEFINITION: {
                RemovePropertyDefinition removePropertyDefinition = (RemovePropertyDefinition)theEObject;
                T result = caseRemovePropertyDefinition(removePropertyDefinition);
                if (result == null) result = caseNoOutputDefinition(removePropertyDefinition);
                if (result == null) result = caseProcessorDefinition(removePropertyDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(removePropertyDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.RESEQUENCE_DEFINITION: {
                ResequenceDefinition resequenceDefinition = (ResequenceDefinition)theEObject;
                T result = caseResequenceDefinition(resequenceDefinition);
                if (result == null) result = caseProcessorDefinition(resequenceDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(resequenceDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.RESEQUENCER_CONFIG: {
                ResequencerConfig resequencerConfig = (ResequencerConfig)theEObject;
                T result = caseResequencerConfig(resequencerConfig);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ROLLBACK_DEFINITION: {
                RollbackDefinition rollbackDefinition = (RollbackDefinition)theEObject;
                T result = caseRollbackDefinition(rollbackDefinition);
                if (result == null) result = caseNoOutputDefinition(rollbackDefinition);
                if (result == null) result = caseProcessorDefinition(rollbackDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(rollbackDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ROUND_ROBIN_LOAD_BALANCER_DEFINITION: {
                RoundRobinLoadBalancerDefinition roundRobinLoadBalancerDefinition = (RoundRobinLoadBalancerDefinition)theEObject;
                T result = caseRoundRobinLoadBalancerDefinition(roundRobinLoadBalancerDefinition);
                if (result == null) result = caseLoadBalancer(roundRobinLoadBalancerDefinition);
                if (result == null) result = caseIdentifiedType(roundRobinLoadBalancerDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ROUTE_BUILDER_DEFINITION: {
                RouteBuilderDefinition routeBuilderDefinition = (RouteBuilderDefinition)theEObject;
                T result = caseRouteBuilderDefinition(routeBuilderDefinition);
                if (result == null) result = caseIdentifiedType(routeBuilderDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ROUTE_CONTEXT_REF_DEFINITION: {
                RouteContextRefDefinition routeContextRefDefinition = (RouteContextRefDefinition)theEObject;
                T result = caseRouteContextRefDefinition(routeContextRefDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ROUTE_DEFINITION: {
                RouteDefinition routeDefinition = (RouteDefinition)theEObject;
                T result = caseRouteDefinition(routeDefinition);
                if (result == null) result = caseProcessorDefinition(routeDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(routeDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ROUTE_DEFINITION_HELPER: {
                RouteDefinitionHelper routeDefinitionHelper = (RouteDefinitionHelper)theEObject;
                T result = caseRouteDefinitionHelper(routeDefinitionHelper);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ROUTES_DEFINITION: {
                RoutesDefinition routesDefinition = (RoutesDefinition)theEObject;
                T result = caseRoutesDefinition(routesDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(routesDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ROUTING_SLIP_DEFINITION: {
                RoutingSlipDefinition routingSlipDefinition = (RoutingSlipDefinition)theEObject;
                T result = caseRoutingSlipDefinition(routingSlipDefinition);
                if (result == null) result = caseNoOutputExpressionNode(routingSlipDefinition);
                if (result == null) result = caseExpressionNode(routingSlipDefinition);
                if (result == null) result = caseProcessorDefinition(routingSlipDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(routingSlipDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.RSS_DATA_FORMAT: {
                RssDataFormat rssDataFormat = (RssDataFormat)theEObject;
                T result = caseRssDataFormat(rssDataFormat);
                if (result == null) result = caseDataFormat(rssDataFormat);
                if (result == null) result = caseIdentifiedType(rssDataFormat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.RUBY_EXPRESSION: {
                RubyExpression rubyExpression = (RubyExpression)theEObject;
                T result = caseRubyExpression(rubyExpression);
                if (result == null) result = caseExpression(rubyExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.SAMPLING_DEFINITION: {
                SamplingDefinition samplingDefinition = (SamplingDefinition)theEObject;
                T result = caseSamplingDefinition(samplingDefinition);
                if (result == null) result = caseOutput(samplingDefinition);
                if (result == null) result = caseProcessorDefinition(samplingDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(samplingDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.SECURE_RANDOM_PARAMETERS_FACTORY_BEAN: {
                SecureRandomParametersFactoryBean secureRandomParametersFactoryBean = (SecureRandomParametersFactoryBean)theEObject;
                T result = caseSecureRandomParametersFactoryBean(secureRandomParametersFactoryBean);
                if (result == null) result = caseAbstractSecureRandomParametersFactoryBean(secureRandomParametersFactoryBean);
                if (result == null) result = caseAbstractJsseUtilFactoryBean(secureRandomParametersFactoryBean);
                if (result == null) result = caseAbstractCamelFactoryBean(secureRandomParametersFactoryBean);
                if (result == null) result = caseIdentifiedType(secureRandomParametersFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.SECURE_SOCKET_PROTOCOLS_PARAMETERS: {
                SecureSocketProtocolsParameters secureSocketProtocolsParameters = (SecureSocketProtocolsParameters)theEObject;
                T result = caseSecureSocketProtocolsParameters(secureSocketProtocolsParameters);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.SEND_DEFINITION: {
                SendDefinition sendDefinition = (SendDefinition)theEObject;
                T result = caseSendDefinition(sendDefinition);
                if (result == null) result = caseNoOutputDefinition(sendDefinition);
                if (result == null) result = caseProcessorDefinition(sendDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(sendDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.SERIALIZATION_DATA_FORMAT: {
                SerializationDataFormat serializationDataFormat = (SerializationDataFormat)theEObject;
                T result = caseSerializationDataFormat(serializationDataFormat);
                if (result == null) result = caseDataFormat(serializationDataFormat);
                if (result == null) result = caseIdentifiedType(serializationDataFormat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.SET_BODY_DEFINITION: {
                SetBodyDefinition setBodyDefinition = (SetBodyDefinition)theEObject;
                T result = caseSetBodyDefinition(setBodyDefinition);
                if (result == null) result = caseNoOutputExpressionNode(setBodyDefinition);
                if (result == null) result = caseExpressionNode(setBodyDefinition);
                if (result == null) result = caseProcessorDefinition(setBodyDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(setBodyDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.SET_EXCHANGE_PATTERN_DEFINITION: {
                SetExchangePatternDefinition setExchangePatternDefinition = (SetExchangePatternDefinition)theEObject;
                T result = caseSetExchangePatternDefinition(setExchangePatternDefinition);
                if (result == null) result = caseNoOutputDefinition(setExchangePatternDefinition);
                if (result == null) result = caseProcessorDefinition(setExchangePatternDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(setExchangePatternDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.SET_FAULT_BODY_DEFINITION: {
                SetFaultBodyDefinition setFaultBodyDefinition = (SetFaultBodyDefinition)theEObject;
                T result = caseSetFaultBodyDefinition(setFaultBodyDefinition);
                if (result == null) result = caseNoOutputExpressionNode(setFaultBodyDefinition);
                if (result == null) result = caseExpressionNode(setFaultBodyDefinition);
                if (result == null) result = caseProcessorDefinition(setFaultBodyDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(setFaultBodyDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.SET_HEADER_DEFINITION: {
                SetHeaderDefinition setHeaderDefinition = (SetHeaderDefinition)theEObject;
                T result = caseSetHeaderDefinition(setHeaderDefinition);
                if (result == null) result = caseNoOutputExpressionNode(setHeaderDefinition);
                if (result == null) result = caseExpressionNode(setHeaderDefinition);
                if (result == null) result = caseProcessorDefinition(setHeaderDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(setHeaderDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.SET_OUT_HEADER_DEFINITION: {
                SetOutHeaderDefinition setOutHeaderDefinition = (SetOutHeaderDefinition)theEObject;
                T result = caseSetOutHeaderDefinition(setOutHeaderDefinition);
                if (result == null) result = caseNoOutputExpressionNode(setOutHeaderDefinition);
                if (result == null) result = caseExpressionNode(setOutHeaderDefinition);
                if (result == null) result = caseProcessorDefinition(setOutHeaderDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(setOutHeaderDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.SET_PROPERTY_DEFINITION: {
                SetPropertyDefinition setPropertyDefinition = (SetPropertyDefinition)theEObject;
                T result = caseSetPropertyDefinition(setPropertyDefinition);
                if (result == null) result = caseNoOutputExpressionNode(setPropertyDefinition);
                if (result == null) result = caseExpressionNode(setPropertyDefinition);
                if (result == null) result = caseProcessorDefinition(setPropertyDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(setPropertyDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.SIMPLE_EXPRESSION: {
                SimpleExpression simpleExpression = (SimpleExpression)theEObject;
                T result = caseSimpleExpression(simpleExpression);
                if (result == null) result = caseExpression(simpleExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.SOAP_JAXB_DATA_FORMAT: {
                SoapJaxbDataFormat soapJaxbDataFormat = (SoapJaxbDataFormat)theEObject;
                T result = caseSoapJaxbDataFormat(soapJaxbDataFormat);
                if (result == null) result = caseDataFormat(soapJaxbDataFormat);
                if (result == null) result = caseIdentifiedType(soapJaxbDataFormat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.SORT_DEFINITION: {
                SortDefinition sortDefinition = (SortDefinition)theEObject;
                T result = caseSortDefinition(sortDefinition);
                if (result == null) result = caseNoOutputExpressionNode(sortDefinition);
                if (result == null) result = caseExpressionNode(sortDefinition);
                if (result == null) result = caseProcessorDefinition(sortDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(sortDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.SP_EL_EXPRESSION: {
                SpELExpression spELExpression = (SpELExpression)theEObject;
                T result = caseSpELExpression(spELExpression);
                if (result == null) result = caseExpression(spELExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.SPLIT_DEFINITION: {
                SplitDefinition splitDefinition = (SplitDefinition)theEObject;
                T result = caseSplitDefinition(splitDefinition);
                if (result == null) result = caseExpressionNode(splitDefinition);
                if (result == null) result = caseProcessorDefinition(splitDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(splitDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.SQL_EXPRESSION: {
                SqlExpression sqlExpression = (SqlExpression)theEObject;
                T result = caseSqlExpression(sqlExpression);
                if (result == null) result = caseExpression(sqlExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.SSL_CONTEXT_CLIENT_PARAMETERS_FACTORY_BEAN: {
                SslContextClientParametersFactoryBean sslContextClientParametersFactoryBean = (SslContextClientParametersFactoryBean)theEObject;
                T result = caseSslContextClientParametersFactoryBean(sslContextClientParametersFactoryBean);
                if (result == null) result = caseAbstractJsseUtilFactoryBean(sslContextClientParametersFactoryBean);
                if (result == null) result = caseAbstractCamelFactoryBean(sslContextClientParametersFactoryBean);
                if (result == null) result = caseIdentifiedType(sslContextClientParametersFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.SSL_CONTEXT_PARAMETERS_FACTORY_BEAN: {
                SslContextParametersFactoryBean sslContextParametersFactoryBean = (SslContextParametersFactoryBean)theEObject;
                T result = caseSslContextParametersFactoryBean(sslContextParametersFactoryBean);
                if (result == null) result = caseAbstractJsseUtilFactoryBean(sslContextParametersFactoryBean);
                if (result == null) result = caseAbstractCamelFactoryBean(sslContextParametersFactoryBean);
                if (result == null) result = caseIdentifiedType(sslContextParametersFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.SSL_CONTEXT_SERVER_PARAMETERS_FACTORY_BEAN: {
                SslContextServerParametersFactoryBean sslContextServerParametersFactoryBean = (SslContextServerParametersFactoryBean)theEObject;
                T result = caseSslContextServerParametersFactoryBean(sslContextServerParametersFactoryBean);
                if (result == null) result = caseAbstractJsseUtilFactoryBean(sslContextServerParametersFactoryBean);
                if (result == null) result = caseAbstractCamelFactoryBean(sslContextServerParametersFactoryBean);
                if (result == null) result = caseIdentifiedType(sslContextServerParametersFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.STICKY_LOAD_BALANCER_DEFINITION: {
                StickyLoadBalancerDefinition stickyLoadBalancerDefinition = (StickyLoadBalancerDefinition)theEObject;
                T result = caseStickyLoadBalancerDefinition(stickyLoadBalancerDefinition);
                if (result == null) result = caseLoadBalancer(stickyLoadBalancerDefinition);
                if (result == null) result = caseIdentifiedType(stickyLoadBalancerDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.STOP_DEFINITION: {
                StopDefinition stopDefinition = (StopDefinition)theEObject;
                T result = caseStopDefinition(stopDefinition);
                if (result == null) result = caseNoOutputDefinition(stopDefinition);
                if (result == null) result = caseProcessorDefinition(stopDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(stopDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.STREAM_RESEQUENCER_CONFIG: {
                StreamResequencerConfig streamResequencerConfig = (StreamResequencerConfig)theEObject;
                T result = caseStreamResequencerConfig(streamResequencerConfig);
                if (result == null) result = caseResequencerConfig(streamResequencerConfig);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.STRING_DATA_FORMAT: {
                StringDataFormat stringDataFormat = (StringDataFormat)theEObject;
                T result = caseStringDataFormat(stringDataFormat);
                if (result == null) result = caseDataFormat(stringDataFormat);
                if (result == null) result = caseIdentifiedType(stringDataFormat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.SYSLOG_DATA_FORMAT: {
                SyslogDataFormat syslogDataFormat = (SyslogDataFormat)theEObject;
                T result = caseSyslogDataFormat(syslogDataFormat);
                if (result == null) result = caseDataFormat(syslogDataFormat);
                if (result == null) result = caseIdentifiedType(syslogDataFormat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.THREAD_POOL_PROFILE_DEFINITION: {
                ThreadPoolProfileDefinition threadPoolProfileDefinition = (ThreadPoolProfileDefinition)theEObject;
                T result = caseThreadPoolProfileDefinition(threadPoolProfileDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(threadPoolProfileDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.THREADS_DEFINITION: {
                ThreadsDefinition threadsDefinition = (ThreadsDefinition)theEObject;
                T result = caseThreadsDefinition(threadsDefinition);
                if (result == null) result = caseOutput(threadsDefinition);
                if (result == null) result = caseProcessorDefinition(threadsDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(threadsDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.THROTTLE_DEFINITION: {
                ThrottleDefinition throttleDefinition = (ThrottleDefinition)theEObject;
                T result = caseThrottleDefinition(throttleDefinition);
                if (result == null) result = caseExpressionNode(throttleDefinition);
                if (result == null) result = caseProcessorDefinition(throttleDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(throttleDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.THROW_EXCEPTION_DEFINITION: {
                ThrowExceptionDefinition throwExceptionDefinition = (ThrowExceptionDefinition)theEObject;
                T result = caseThrowExceptionDefinition(throwExceptionDefinition);
                if (result == null) result = caseNoOutputDefinition(throwExceptionDefinition);
                if (result == null) result = caseProcessorDefinition(throwExceptionDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(throwExceptionDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.TIDY_MARKUP_DATA_FORMAT: {
                TidyMarkupDataFormat tidyMarkupDataFormat = (TidyMarkupDataFormat)theEObject;
                T result = caseTidyMarkupDataFormat(tidyMarkupDataFormat);
                if (result == null) result = caseDataFormat(tidyMarkupDataFormat);
                if (result == null) result = caseIdentifiedType(tidyMarkupDataFormat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.TO_DEFINITION: {
                ToDefinition toDefinition = (ToDefinition)theEObject;
                T result = caseToDefinition(toDefinition);
                if (result == null) result = caseSendDefinition(toDefinition);
                if (result == null) result = caseNoOutputDefinition(toDefinition);
                if (result == null) result = caseProcessorDefinition(toDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(toDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.TOKENIZER_EXPRESSION: {
                TokenizerExpression tokenizerExpression = (TokenizerExpression)theEObject;
                T result = caseTokenizerExpression(tokenizerExpression);
                if (result == null) result = caseExpression(tokenizerExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.TOPIC_LOAD_BALANCER_DEFINITION: {
                TopicLoadBalancerDefinition topicLoadBalancerDefinition = (TopicLoadBalancerDefinition)theEObject;
                T result = caseTopicLoadBalancerDefinition(topicLoadBalancerDefinition);
                if (result == null) result = caseLoadBalancer(topicLoadBalancerDefinition);
                if (result == null) result = caseIdentifiedType(topicLoadBalancerDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.TRANSACTED_DEFINITION: {
                TransactedDefinition transactedDefinition = (TransactedDefinition)theEObject;
                T result = caseTransactedDefinition(transactedDefinition);
                if (result == null) result = caseOutput(transactedDefinition);
                if (result == null) result = caseProcessorDefinition(transactedDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(transactedDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.TRANSFORM_DEFINITION: {
                TransformDefinition transformDefinition = (TransformDefinition)theEObject;
                T result = caseTransformDefinition(transformDefinition);
                if (result == null) result = caseNoOutputExpressionNode(transformDefinition);
                if (result == null) result = caseExpressionNode(transformDefinition);
                if (result == null) result = caseProcessorDefinition(transformDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(transformDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.TRUST_MANAGERS_PARAMETERS_FACTORY_BEAN: {
                TrustManagersParametersFactoryBean trustManagersParametersFactoryBean = (TrustManagersParametersFactoryBean)theEObject;
                T result = caseTrustManagersParametersFactoryBean(trustManagersParametersFactoryBean);
                if (result == null) result = caseAbstractTrustManagersParametersFactoryBean(trustManagersParametersFactoryBean);
                if (result == null) result = caseAbstractJsseUtilFactoryBean(trustManagersParametersFactoryBean);
                if (result == null) result = caseAbstractCamelFactoryBean(trustManagersParametersFactoryBean);
                if (result == null) result = caseIdentifiedType(trustManagersParametersFactoryBean);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.TRY_DEFINITION: {
                TryDefinition tryDefinition = (TryDefinition)theEObject;
                T result = caseTryDefinition(tryDefinition);
                if (result == null) result = caseOutput(tryDefinition);
                if (result == null) result = caseProcessorDefinition(tryDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(tryDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.UNMARSHAL_DEFINITION: {
                UnmarshalDefinition unmarshalDefinition = (UnmarshalDefinition)theEObject;
                T result = caseUnmarshalDefinition(unmarshalDefinition);
                if (result == null) result = caseNoOutputDefinition(unmarshalDefinition);
                if (result == null) result = caseProcessorDefinition(unmarshalDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(unmarshalDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.VALIDATE_DEFINITION: {
                ValidateDefinition validateDefinition = (ValidateDefinition)theEObject;
                T result = caseValidateDefinition(validateDefinition);
                if (result == null) result = caseNoOutputExpressionNode(validateDefinition);
                if (result == null) result = caseExpressionNode(validateDefinition);
                if (result == null) result = caseProcessorDefinition(validateDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(validateDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.WEIGHTED_LOAD_BALANCER_DEFINITION: {
                WeightedLoadBalancerDefinition weightedLoadBalancerDefinition = (WeightedLoadBalancerDefinition)theEObject;
                T result = caseWeightedLoadBalancerDefinition(weightedLoadBalancerDefinition);
                if (result == null) result = caseLoadBalancer(weightedLoadBalancerDefinition);
                if (result == null) result = caseIdentifiedType(weightedLoadBalancerDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.WHEN_DEFINITION: {
                WhenDefinition whenDefinition = (WhenDefinition)theEObject;
                T result = caseWhenDefinition(whenDefinition);
                if (result == null) result = caseExpressionNode(whenDefinition);
                if (result == null) result = caseProcessorDefinition(whenDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(whenDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.WIRE_TAP_DEFINITION: {
                WireTapDefinition wireTapDefinition = (WireTapDefinition)theEObject;
                T result = caseWireTapDefinition(wireTapDefinition);
                if (result == null) result = caseNoOutputDefinition(wireTapDefinition);
                if (result == null) result = caseProcessorDefinition(wireTapDefinition);
                if (result == null) result = caseOptionalIdentifiedDefinition(wireTapDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.XML_BEANS_DATA_FORMAT: {
                XmlBeansDataFormat xmlBeansDataFormat = (XmlBeansDataFormat)theEObject;
                T result = caseXmlBeansDataFormat(xmlBeansDataFormat);
                if (result == null) result = caseDataFormat(xmlBeansDataFormat);
                if (result == null) result = caseIdentifiedType(xmlBeansDataFormat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.XML_SECURITY_DATA_FORMAT: {
                XmlSecurityDataFormat xmlSecurityDataFormat = (XmlSecurityDataFormat)theEObject;
                T result = caseXmlSecurityDataFormat(xmlSecurityDataFormat);
                if (result == null) result = caseDataFormat(xmlSecurityDataFormat);
                if (result == null) result = caseIdentifiedType(xmlSecurityDataFormat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.XPATH_EXPRESSION: {
                XPathExpression xPathExpression = (XPathExpression)theEObject;
                T result = caseXPathExpression(xPathExpression);
                if (result == null) result = caseNamespaceAwareExpression(xPathExpression);
                if (result == null) result = caseExpression(xPathExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.XQUERY_EXPRESSION: {
                XQueryExpression xQueryExpression = (XQueryExpression)theEObject;
                T result = caseXQueryExpression(xQueryExpression);
                if (result == null) result = caseNamespaceAwareExpression(xQueryExpression);
                if (result == null) result = caseExpression(xQueryExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.XSTREAM_DATA_FORMAT: {
                XStreamDataFormat xStreamDataFormat = (XStreamDataFormat)theEObject;
                T result = caseXStreamDataFormat(xStreamDataFormat);
                if (result == null) result = caseDataFormat(xStreamDataFormat);
                if (result == null) result = caseIdentifiedType(xStreamDataFormat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SpringPackage.ZIP_DATA_FORMAT: {
                ZipDataFormat zipDataFormat = (ZipDataFormat)theEObject;
                T result = caseZipDataFormat(zipDataFormat);
                if (result == null) result = caseDataFormat(zipDataFormat);
                if (result == null) result = caseIdentifiedType(zipDataFormat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Camel Consumer Template Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Camel Consumer Template Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAbstractCamelConsumerTemplateFactoryBean(AbstractCamelConsumerTemplateFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Camel Context Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Camel Context Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAbstractCamelContextFactoryBean(AbstractCamelContextFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Camel Endpoint Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Camel Endpoint Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAbstractCamelEndpointFactoryBean(AbstractCamelEndpointFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Camel Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Camel Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAbstractCamelFactoryBean(AbstractCamelFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Camel Producer Template Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Camel Producer Template Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAbstractCamelProducerTemplateFactoryBean(AbstractCamelProducerTemplateFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Camel Redelivery Policy Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Camel Redelivery Policy Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAbstractCamelRedeliveryPolicyFactoryBean(AbstractCamelRedeliveryPolicyFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Camel Thread Pool Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Camel Thread Pool Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAbstractCamelThreadPoolFactoryBean(AbstractCamelThreadPoolFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Jsse Util Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Jsse Util Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAbstractJsseUtilFactoryBean(AbstractJsseUtilFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Key Managers Parameters Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Key Managers Parameters Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAbstractKeyManagersParametersFactoryBean(AbstractKeyManagersParametersFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Key Store Parameters Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Key Store Parameters Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAbstractKeyStoreParametersFactoryBean(AbstractKeyStoreParametersFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Secure Random Parameters Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Secure Random Parameters Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAbstractSecureRandomParametersFactoryBean(AbstractSecureRandomParametersFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Trust Managers Parameters Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Trust Managers Parameters Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAbstractTrustManagersParametersFactoryBean(AbstractTrustManagersParametersFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Aggregate Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Aggregate Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAggregateDefinition(AggregateDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Alias Entry</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Alias Entry</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAliasEntry(AliasEntry object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Alias List</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Alias List</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAliasList(AliasList object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Aop Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Aop Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAopDefinition(AopDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Batch Resequencer Config</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Batch Resequencer Config</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBatchResequencerConfig(BatchResequencerConfig object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Bean Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bean Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBeanDefinition(BeanDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Bindy Data Format</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bindy Data Format</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBindyDataFormat(BindyDataFormat object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Camel Bean Post Processor</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Bean Post Processor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCamelBeanPostProcessor(CamelBeanPostProcessor object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Camel Consumer Template Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Consumer Template Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCamelConsumerTemplateFactoryBean(CamelConsumerTemplateFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Camel Context Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Context Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCamelContextFactoryBean(CamelContextFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Camel Endpoint Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Endpoint Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCamelEndpointFactoryBean(CamelEndpointFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Camel JMX Agent Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel JMX Agent Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCamelJMXAgentDefinition(CamelJMXAgentDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Camel Producer Template Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Producer Template Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCamelProducerTemplateFactoryBean(CamelProducerTemplateFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Camel Property Placeholder Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Property Placeholder Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCamelPropertyPlaceholderDefinition(CamelPropertyPlaceholderDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Camel Proxy Factory Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Proxy Factory Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCamelProxyFactoryDefinition(CamelProxyFactoryDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Camel Redelivery Policy Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Redelivery Policy Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCamelRedeliveryPolicyFactoryBean(CamelRedeliveryPolicyFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Camel Route Context Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Route Context Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCamelRouteContextFactoryBean(CamelRouteContextFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Camel Service Exporter Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Service Exporter Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCamelServiceExporterDefinition(CamelServiceExporterDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Camel Thread Pool Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Camel Thread Pool Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCamelThreadPoolFactoryBean(CamelThreadPoolFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Castor Data Format</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Castor Data Format</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCastorDataFormat(CastorDataFormat object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Catch Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Catch Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCatchDefinition(CatchDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Choice Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Choice Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseChoiceDefinition(ChoiceDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Cipher Suites Parameters</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cipher Suites Parameters</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCipherSuitesParameters(CipherSuitesParameters object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Constant Expression</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Constant Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseConstantExpression(ConstantExpression object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Constants</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Constants</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseConstants(Constants object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Context Scan Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Context Scan Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseContextScanDefinition(ContextScanDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Convert Body Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Convert Body Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseConvertBodyDefinition(ConvertBodyDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Converter Entry</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Converter Entry</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseConverterEntry(ConverterEntry object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Converter List</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Converter List</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseConverterList(ConverterList object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Crypto Data Format</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Crypto Data Format</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCryptoDataFormat(CryptoDataFormat object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Csv Data Format</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Csv Data Format</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCsvDataFormat(CsvDataFormat object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Custom Data Format</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Custom Data Format</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCustomDataFormat(CustomDataFormat object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Custom Load Balancer Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Custom Load Balancer Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCustomLoadBalancerDefinition(CustomLoadBalancerDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Data Format</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Format</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDataFormat(DataFormat object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Data Formats Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Formats Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDataFormatsDefinition(DataFormatsDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Delay Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Delay Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDelayDefinition(DelayDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Description Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Description Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDescriptionDefinition(DescriptionDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDocumentRoot(DocumentRoot object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Dynamic Router Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dynamic Router Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDynamicRouterDefinition(DynamicRouterDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>El Expression</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>El Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseElExpression(ElExpression object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Enrich Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enrich Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseEnrichDefinition(EnrichDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Error Handler Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Error Handler Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseErrorHandlerDefinition(ErrorHandlerDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseExpression(Expression object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Expression Node</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Expression Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseExpressionNode(ExpressionNode object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Expression Sub Element Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Expression Sub Element Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseExpressionSubElementDefinition(ExpressionSubElementDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Failover Load Balancer Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Failover Load Balancer Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseFailoverLoadBalancerDefinition(FailoverLoadBalancerDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Filter Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Filter Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseFilterDefinition(FilterDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Filter Parameters</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Filter Parameters</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseFilterParameters(FilterParameters object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Finally Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Finally Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseFinallyDefinition(FinallyDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Flatpack Data Format</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Flatpack Data Format</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseFlatpackDataFormat(FlatpackDataFormat object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>From Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>From Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseFromDefinition(FromDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Groovy Expression</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Groovy Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseGroovyExpression(GroovyExpression object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Gzip Data Format</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gzip Data Format</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseGzipDataFormat(GzipDataFormat object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Header Expression</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Header Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseHeaderExpression(HeaderExpression object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Hl7 Data Format</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hl7 Data Format</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseHl7DataFormat(Hl7DataFormat object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Idempotent Consumer Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Idempotent Consumer Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseIdempotentConsumerDefinition(IdempotentConsumerDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Identified Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identified Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseIdentifiedType(IdentifiedType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Implicit Collection Entry</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Implicit Collection Entry</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseImplicitCollectionEntry(ImplicitCollectionEntry object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Implicit Collection List</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Implicit Collection List</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseImplicitCollectionList(ImplicitCollectionList object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>In Only Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>In Only Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseInOnlyDefinition(InOnlyDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>In Out Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>In Out Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseInOutDefinition(InOutDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Intercept Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Intercept Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseInterceptDefinition(InterceptDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Intercept From Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Intercept From Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseInterceptFromDefinition(InterceptFromDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Intercept Send To Endpoint Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Intercept Send To Endpoint Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseInterceptSendToEndpointDefinition(InterceptSendToEndpointDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Java Script Expression</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Java Script Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJavaScriptExpression(JavaScriptExpression object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Jaxb Data Format</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Jaxb Data Format</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJaxbDataFormat(JaxbDataFormat object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Jibx Data Format</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Jibx Data Format</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJibxDataFormat(JibxDataFormat object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Json Data Format</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Json Data Format</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJsonDataFormat(JsonDataFormat object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Jx Path Expression</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Jx Path Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseJxPathExpression(JxPathExpression object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Key Managers Parameters Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Key Managers Parameters Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseKeyManagersParametersFactoryBean(KeyManagersParametersFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Key Store Parameters Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Key Store Parameters Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseKeyStoreParametersFactoryBean(KeyStoreParametersFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Language Expression</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Language Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseLanguageExpression(LanguageExpression object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Load Balance Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load Balance Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseLoadBalanceDefinition(LoadBalanceDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Load Balancer</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load Balancer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseLoadBalancer(LoadBalancer object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Log Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Log Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseLogDefinition(LogDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Loop Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Loop Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseLoopDefinition(LoopDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Marshal Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Marshal Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseMarshalDefinition(MarshalDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Method Call Expression</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Method Call Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseMethodCallExpression(MethodCallExpression object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Multicast Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Multicast Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseMulticastDefinition(MulticastDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Mvel Expression</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mvel Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseMvelExpression(MvelExpression object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Namespace Aware Expression</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Namespace Aware Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseNamespaceAwareExpression(NamespaceAwareExpression object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Node Factory</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node Factory</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseNodeFactory(NodeFactory object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>No Output Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>No Output Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseNoOutputDefinition(NoOutputDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>No Output Expression Node</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>No Output Expression Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseNoOutputExpressionNode(NoOutputExpressionNode object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Ognl Expression</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ognl Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseOgnlExpression(OgnlExpression object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Omit Field Entry</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Omit Field Entry</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseOmitFieldEntry(OmitFieldEntry object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Omit Field List</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Omit Field List</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseOmitFieldList(OmitFieldList object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>On Completion Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>On Completion Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseOnCompletionDefinition(OnCompletionDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>On Exception Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>On Exception Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseOnExceptionDefinition(OnExceptionDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Optional Identified Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Optional Identified Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseOptionalIdentifiedDefinition(OptionalIdentifiedDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Otherwise Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Otherwise Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseOtherwiseDefinition(OtherwiseDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Output</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseOutput(Output object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Package Scan Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Package Scan Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePackageScanDefinition(PackageScanDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Php Expression</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Php Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePhpExpression(PhpExpression object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Pipeline Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pipeline Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePipelineDefinition(PipelineDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Policy Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Policy Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePolicyDefinition(PolicyDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Poll Enrich Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Poll Enrich Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePollEnrichDefinition(PollEnrichDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Process Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Process Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseProcessDefinition(ProcessDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Processor Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Processor Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseProcessorDefinition(ProcessorDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Processor Definition Helper</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Processor Definition Helper</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseProcessorDefinitionHelper(ProcessorDefinitionHelper object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Properties Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Properties Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePropertiesDefinition(PropertiesDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Property Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePropertyDefinition(PropertyDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Property Expression</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePropertyExpression(PropertyExpression object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Protobuf Data Format</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Protobuf Data Format</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseProtobufDataFormat(ProtobufDataFormat object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Python Expression</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Python Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePythonExpression(PythonExpression object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Random Load Balancer Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Random Load Balancer Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseRandomLoadBalancerDefinition(RandomLoadBalancerDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Recipient List Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Recipient List Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseRecipientListDefinition(RecipientListDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Redelivery Policy Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Redelivery Policy Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseRedeliveryPolicyDefinition(RedeliveryPolicyDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Ref Expression</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ref Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseRefExpression(RefExpression object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Remove Header Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Remove Header Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseRemoveHeaderDefinition(RemoveHeaderDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Remove Headers Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Remove Headers Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseRemoveHeadersDefinition(RemoveHeadersDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Remove Property Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Remove Property Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseRemovePropertyDefinition(RemovePropertyDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Resequence Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resequence Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseResequenceDefinition(ResequenceDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Resequencer Config</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resequencer Config</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseResequencerConfig(ResequencerConfig object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Rollback Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rollback Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseRollbackDefinition(RollbackDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Round Robin Load Balancer Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Round Robin Load Balancer Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseRoundRobinLoadBalancerDefinition(RoundRobinLoadBalancerDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Route Builder Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Route Builder Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseRouteBuilderDefinition(RouteBuilderDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Route Context Ref Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Route Context Ref Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseRouteContextRefDefinition(RouteContextRefDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Route Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Route Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseRouteDefinition(RouteDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Route Definition Helper</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Route Definition Helper</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseRouteDefinitionHelper(RouteDefinitionHelper object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Routes Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Routes Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseRoutesDefinition(RoutesDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Routing Slip Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Routing Slip Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseRoutingSlipDefinition(RoutingSlipDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Rss Data Format</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rss Data Format</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseRssDataFormat(RssDataFormat object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Ruby Expression</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ruby Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseRubyExpression(RubyExpression object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Sampling Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sampling Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSamplingDefinition(SamplingDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Secure Random Parameters Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Secure Random Parameters Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSecureRandomParametersFactoryBean(SecureRandomParametersFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Secure Socket Protocols Parameters</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Secure Socket Protocols Parameters</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSecureSocketProtocolsParameters(SecureSocketProtocolsParameters object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Send Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Send Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSendDefinition(SendDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Serialization Data Format</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Serialization Data Format</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSerializationDataFormat(SerializationDataFormat object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Set Body Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Set Body Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSetBodyDefinition(SetBodyDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Set Exchange Pattern Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Set Exchange Pattern Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSetExchangePatternDefinition(SetExchangePatternDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Set Fault Body Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Set Fault Body Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSetFaultBodyDefinition(SetFaultBodyDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Set Header Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Set Header Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSetHeaderDefinition(SetHeaderDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Set Out Header Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Set Out Header Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSetOutHeaderDefinition(SetOutHeaderDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Set Property Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Set Property Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSetPropertyDefinition(SetPropertyDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Simple Expression</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Simple Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSimpleExpression(SimpleExpression object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Soap Jaxb Data Format</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Soap Jaxb Data Format</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSoapJaxbDataFormat(SoapJaxbDataFormat object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Sort Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sort Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSortDefinition(SortDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Sp EL Expression</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sp EL Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSpELExpression(SpELExpression object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Split Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Split Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSplitDefinition(SplitDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Sql Expression</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sql Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSqlExpression(SqlExpression object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Ssl Context Client Parameters Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ssl Context Client Parameters Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSslContextClientParametersFactoryBean(SslContextClientParametersFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Ssl Context Parameters Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ssl Context Parameters Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSslContextParametersFactoryBean(SslContextParametersFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Ssl Context Server Parameters Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ssl Context Server Parameters Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSslContextServerParametersFactoryBean(SslContextServerParametersFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Sticky Load Balancer Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sticky Load Balancer Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseStickyLoadBalancerDefinition(StickyLoadBalancerDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Stop Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Stop Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseStopDefinition(StopDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Stream Resequencer Config</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Stream Resequencer Config</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseStreamResequencerConfig(StreamResequencerConfig object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>String Data Format</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>String Data Format</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseStringDataFormat(StringDataFormat object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Syslog Data Format</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Syslog Data Format</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSyslogDataFormat(SyslogDataFormat object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Thread Pool Profile Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Thread Pool Profile Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseThreadPoolProfileDefinition(ThreadPoolProfileDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Threads Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Threads Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseThreadsDefinition(ThreadsDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Throttle Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Throttle Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseThrottleDefinition(ThrottleDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Throw Exception Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Throw Exception Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseThrowExceptionDefinition(ThrowExceptionDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Tidy Markup Data Format</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tidy Markup Data Format</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseTidyMarkupDataFormat(TidyMarkupDataFormat object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>To Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>To Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseToDefinition(ToDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Tokenizer Expression</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tokenizer Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseTokenizerExpression(TokenizerExpression object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Topic Load Balancer Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Topic Load Balancer Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseTopicLoadBalancerDefinition(TopicLoadBalancerDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Transacted Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Transacted Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseTransactedDefinition(TransactedDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Transform Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Transform Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseTransformDefinition(TransformDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Trust Managers Parameters Factory Bean</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Trust Managers Parameters Factory Bean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseTrustManagersParametersFactoryBean(TrustManagersParametersFactoryBean object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Try Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Try Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseTryDefinition(TryDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Unmarshal Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unmarshal Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseUnmarshalDefinition(UnmarshalDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Validate Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Validate Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseValidateDefinition(ValidateDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Weighted Load Balancer Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Weighted Load Balancer Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseWeightedLoadBalancerDefinition(WeightedLoadBalancerDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>When Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>When Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseWhenDefinition(WhenDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Wire Tap Definition</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wire Tap Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseWireTapDefinition(WireTapDefinition object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Xml Beans Data Format</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Xml Beans Data Format</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseXmlBeansDataFormat(XmlBeansDataFormat object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Xml Security Data Format</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Xml Security Data Format</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseXmlSecurityDataFormat(XmlSecurityDataFormat object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>XPath Expression</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>XPath Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseXPathExpression(XPathExpression object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>XQuery Expression</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>XQuery Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseXQueryExpression(XQueryExpression object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>XStream Data Format</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>XStream Data Format</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseXStreamDataFormat(XStreamDataFormat object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Zip Data Format</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Zip Data Format</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseZipDataFormat(ZipDataFormat object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
	@Override
	public T defaultCase(EObject object) {
        return null;
    }

} //SpringSwitch
