/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

























import org.open.oasis.docs.ns.opencsa.sca.bpel.BPELPackage;

import org.open.oasis.docs.ns.opencsa.sca.bpel.impl.BPELPackageImpl;
import org.switchyard.tools.models.switchyard1_0.bean.BeanPackage;
import org.switchyard.tools.models.switchyard1_0.bean.impl.BeanPackageImpl;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMPackageImpl;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl;
import org.switchyard.tools.models.switchyard1_0.clojure.ClojurePackage;
import org.switchyard.tools.models.switchyard1_0.clojure.impl.ClojurePackageImpl;
import org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage;
import org.switchyard.tools.models.switchyard1_0.commonrules.impl.CommonRulesPackageImpl;
import org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage;
import org.switchyard.tools.models.switchyard1_0.hornetq.impl.HornetQPackageImpl;
import org.switchyard.tools.models.switchyard1_0.http.HttpPackage;
import org.switchyard.tools.models.switchyard1_0.http.impl.HttpPackageImpl;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;
import org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl;
import org.switchyard.tools.models.switchyard1_0.remote.RemotePackage;
import org.switchyard.tools.models.switchyard1_0.remote.impl.RemotePackageImpl;
import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage;
import org.switchyard.tools.models.switchyard1_0.resteasy.impl.ResteasyPackageImpl;
import org.switchyard.tools.models.switchyard1_0.rules.RulesPackage;
import org.switchyard.tools.models.switchyard1_0.rules.impl.RulesPackageImpl;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage;
import org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPPackageImpl;
import org.switchyard.tools.models.switchyard1_0.spring.SpringFactory;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.spring.util.SpringValidator;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchyardPackageImpl;
import org.switchyard.tools.models.switchyard1_0.transform.TransformPackage;
import org.switchyard.tools.models.switchyard1_0.transform.impl.TransformPackageImpl;
import org.switchyard.tools.models.switchyard1_0.validate.ValidatePackage;
import org.switchyard.tools.models.switchyard1_0.validate.impl.ValidatePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpringPackageImpl extends EPackageImpl implements SpringPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected String packageFilename = "spring.ecore";

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass abstractCamelConsumerTemplateFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass abstractCamelContextFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass abstractCamelEndpointFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass abstractCamelFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass abstractCamelProducerTemplateFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass abstractCamelRedeliveryPolicyFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass abstractCamelThreadPoolFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass abstractJsseUtilFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass abstractKeyManagersParametersFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass abstractKeyStoreParametersFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass abstractSecureRandomParametersFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass abstractTrustManagersParametersFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass aggregateDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass aliasEntryEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass aliasListEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass aopDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass batchResequencerConfigEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass beanDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass bindyDataFormatEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass camelBeanPostProcessorEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass camelConsumerTemplateFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass camelContextFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass camelEndpointFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass camelJMXAgentDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass camelProducerTemplateFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass camelPropertyPlaceholderDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass camelProxyFactoryDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass camelRedeliveryPolicyFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass camelRouteContextFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass camelServiceExporterDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass camelThreadPoolFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass castorDataFormatEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass catchDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass choiceDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cipherSuitesParametersEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass constantExpressionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass constantsEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass contextScanDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass convertBodyDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass converterEntryEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass converterListEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cryptoDataFormatEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass csvDataFormatEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass customDataFormatEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass customLoadBalancerDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass dataFormatEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass dataFormatsDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass delayDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass descriptionDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass documentRootEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass dynamicRouterDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass elExpressionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass enrichDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass errorHandlerDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass expressionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass expressionNodeEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass expressionNodeHelperEClass = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass expressionSubElementDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass failoverLoadBalancerDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass filterDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass filterParametersEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass finallyDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass flatpackDataFormatEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass fromDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass groovyExpressionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass gzipDataFormatEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass headerExpressionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass hl7DataFormatEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass idempotentConsumerDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass identifiedTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass implicitCollectionEntryEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass implicitCollectionListEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass inOnlyDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass inOutDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass interceptDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass interceptFromDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass interceptSendToEndpointDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass javaScriptExpressionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass jaxbDataFormatEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass jibxDataFormatEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass jsonDataFormatEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass jxPathExpressionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass keyManagersParametersFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass keyStoreParametersFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass languageExpressionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass loadBalanceDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass loadBalancerEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass logDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass loopDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass marshalDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass methodCallExpressionEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass modelHelperEClass = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass multicastDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mvelExpressionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass namespaceAwareExpressionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass nodeFactoryEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass noOutputDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass noOutputExpressionNodeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass ognlExpressionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass omitFieldEntryEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass omitFieldListEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass onCompletionDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass onExceptionDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass optionalIdentifiedDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass otherwiseDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass outputEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass packageScanDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass phpExpressionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pipelineDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass pgpDataFormatEClass = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass policyDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pollEnrichDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass processDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass processorDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass processorDefinitionHelperEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass propertiesDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass propertyDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass propertyExpressionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass protobufDataFormatEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass pythonExpressionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass randomLoadBalancerDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass recipientListDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass redeliveryPolicyDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass refExpressionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass removeHeaderDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass removeHeadersDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass removePropertyDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass resequenceDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass resequencerConfigEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass rollbackDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass roundRobinLoadBalancerDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass routeBuilderDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass routeContextRefDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass routeDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass routeDefinitionHelperEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass routesDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass routingSlipDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass rssDataFormatEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass rubyExpressionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass samplingDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass secureRandomParametersFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass secureSocketProtocolsParametersEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass sendDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass serializationDataFormatEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass setBodyDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass setExchangePatternDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass setFaultBodyDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass setHeaderDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass setOutHeaderDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass setPropertyDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass simpleExpressionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass soapJaxbDataFormatEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass sortDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass spELExpressionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass splitDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass sqlExpressionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass sslContextClientParametersFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass sslContextParametersFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass sslContextServerParametersFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass stickyLoadBalancerDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass stopDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass streamResequencerConfigEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass stringDataFormatEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass syslogDataFormatEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass threadPoolProfileDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass threadsDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass throttleDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass throwExceptionDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tidyMarkupDataFormatEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass toDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tokenizerExpressionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass topicLoadBalancerDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass transactedDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass transformDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass trustManagersParametersFactoryBeanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass tryDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass unmarshalDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass validateDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass weightedLoadBalancerDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass whenDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass wireTapDefinitionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass xmlBeansDataFormatEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass xmlSecurityDataFormatEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass xPathExpressionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass xQueryExpressionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass xStreamDataFormatEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass zipDataFormatEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum bindyTypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum errorHandlerTypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum exchangePatternEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum jsonLibraryEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum loggingLevelEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum managementStatisticsLevelEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum shutdownRouteEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum shutdownRunningTaskEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum threadPoolRejectedPolicyEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum waitForTaskToCompleteEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType bindyTypeObjectEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType classesTypeEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType errorHandlerTypeObjectEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType exchangePatternObjectEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType jsonLibraryObjectEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType loggingLevelObjectEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType managementStatisticsLevelObjectEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType packagesTypeEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType packagesType1EDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType shutdownRouteObjectEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType shutdownRunningTaskObjectEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType threadPoolRejectedPolicyObjectEDataType = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType waitForTaskToCompleteObjectEDataType = null;

	/**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private SpringPackageImpl() {
        super(eNS_URI, SpringFactory.eINSTANCE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static boolean isInited = false;

	/**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link SpringPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @generated
     */
	public static SpringPackage init() {
        if (isInited) return (SpringPackage)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI);

        // Obtain or create and register package
        SpringPackageImpl theSpringPackage = (SpringPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SpringPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SpringPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        ScaPackage.eINSTANCE.eClass();
        XMLTypePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        BeanPackageImpl theBeanPackage = (BeanPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BeanPackage.eNS_URI) instanceof BeanPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BeanPackage.eNS_URI) : BeanPackage.eINSTANCE);
        BPELPackageImpl theBPELPackage = (BPELPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BPELPackage.eNS_URI) instanceof BPELPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BPELPackage.eNS_URI) : BPELPackage.eINSTANCE);
        BPMPackageImpl theBPMPackage = (BPMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BPMPackage.eNS_URI) instanceof BPMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BPMPackage.eNS_URI) : BPMPackage.eINSTANCE);
        CommonRulesPackageImpl theCommonRulesPackage = (CommonRulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonRulesPackage.eNS_URI) instanceof CommonRulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonRulesPackage.eNS_URI) : CommonRulesPackage.eINSTANCE);
        SwitchyardPackageImpl theSwitchyardPackage = (SwitchyardPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SwitchyardPackage.eNS_URI) instanceof SwitchyardPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SwitchyardPackage.eNS_URI) : SwitchyardPackage.eINSTANCE);
        ClojurePackageImpl theClojurePackage = (ClojurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClojurePackage.eNS_URI) instanceof ClojurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClojurePackage.eNS_URI) : ClojurePackage.eINSTANCE);
        HornetQPackageImpl theHornetQPackage = (HornetQPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HornetQPackage.eNS_URI) instanceof HornetQPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HornetQPackage.eNS_URI) : HornetQPackage.eINSTANCE);
        RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);
        SOAPPackageImpl theSOAPPackage = (SOAPPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SOAPPackage.eNS_URI) instanceof SOAPPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SOAPPackage.eNS_URI) : SOAPPackage.eINSTANCE);
        TransformPackageImpl theTransformPackage = (TransformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TransformPackage.eNS_URI) instanceof TransformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TransformPackage.eNS_URI) : TransformPackage.eINSTANCE);
        ValidatePackageImpl theValidatePackage = (ValidatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValidatePackage.eNS_URI) instanceof ValidatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValidatePackage.eNS_URI) : ValidatePackage.eINSTANCE);
        CamelPackageImpl theCamelPackage = (CamelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) instanceof CamelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CamelPackage.eNS_URI) : CamelPackage.eINSTANCE);
        JcaPackageImpl theJcaPackage = (JcaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JcaPackage.eNS_URI) instanceof JcaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JcaPackage.eNS_URI) : JcaPackage.eINSTANCE);
        ResteasyPackageImpl theResteasyPackage = (ResteasyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResteasyPackage.eNS_URI) instanceof ResteasyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResteasyPackage.eNS_URI) : ResteasyPackage.eINSTANCE);
        HttpPackageImpl theHttpPackage = (HttpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HttpPackage.eNS_URI) instanceof HttpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HttpPackage.eNS_URI) : HttpPackage.eINSTANCE);
        RemotePackageImpl theRemotePackage = (RemotePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RemotePackage.eNS_URI) instanceof RemotePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RemotePackage.eNS_URI) : RemotePackage.eINSTANCE);

        // Load packages
        theSpringPackage.loadPackage();

        // Create package meta-data objects
        theBeanPackage.createPackageContents();
        theBPELPackage.createPackageContents();
        theBPMPackage.createPackageContents();
        theCommonRulesPackage.createPackageContents();
        theSwitchyardPackage.createPackageContents();
        theClojurePackage.createPackageContents();
        theHornetQPackage.createPackageContents();
        theRulesPackage.createPackageContents();
        theSOAPPackage.createPackageContents();
        theTransformPackage.createPackageContents();
        theValidatePackage.createPackageContents();
        theCamelPackage.createPackageContents();
        theJcaPackage.createPackageContents();
        theResteasyPackage.createPackageContents();
        theHttpPackage.createPackageContents();
        theRemotePackage.createPackageContents();

        // Initialize created meta-data
        theBeanPackage.initializePackageContents();
        theBPELPackage.initializePackageContents();
        theBPMPackage.initializePackageContents();
        theCommonRulesPackage.initializePackageContents();
        theSwitchyardPackage.initializePackageContents();
        theClojurePackage.initializePackageContents();
        theHornetQPackage.initializePackageContents();
        theRulesPackage.initializePackageContents();
        theSOAPPackage.initializePackageContents();
        theTransformPackage.initializePackageContents();
        theValidatePackage.initializePackageContents();
        theCamelPackage.initializePackageContents();
        theJcaPackage.initializePackageContents();
        theResteasyPackage.initializePackageContents();
        theHttpPackage.initializePackageContents();
        theRemotePackage.initializePackageContents();

        // Fix loaded packages
        theSpringPackage.fixPackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theSpringPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return SpringValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theSpringPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SpringPackage.eNS_URI, theSpringPackage);
        return theSpringPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAbstractCamelConsumerTemplateFactoryBean() {
        if (abstractCamelConsumerTemplateFactoryBeanEClass == null) {
            abstractCamelConsumerTemplateFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(0);
        }
        return abstractCamelConsumerTemplateFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelConsumerTemplateFactoryBean_MaximumCacheSize() {
        return (EAttribute)getAbstractCamelConsumerTemplateFactoryBean().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAbstractCamelContextFactoryBean() {
        if (abstractCamelContextFactoryBeanEClass == null) {
            abstractCamelContextFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(1);
        }
        return abstractCamelContextFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAbstractCamelEndpointFactoryBean() {
        if (abstractCamelEndpointFactoryBeanEClass == null) {
            abstractCamelEndpointFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(2);
        }
        return abstractCamelEndpointFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelEndpointFactoryBean_Pattern() {
        return (EAttribute)getAbstractCamelEndpointFactoryBean().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelEndpointFactoryBean_Singleton() {
        return (EAttribute)getAbstractCamelEndpointFactoryBean().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelEndpointFactoryBean_Uri() {
        return (EAttribute)getAbstractCamelEndpointFactoryBean().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAbstractCamelFactoryBean() {
        if (abstractCamelFactoryBeanEClass == null) {
            abstractCamelFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(3);
        }
        return abstractCamelFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelFactoryBean_CamelContextId() {
        return (EAttribute)getAbstractCamelFactoryBean().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAbstractCamelProducerTemplateFactoryBean() {
        if (abstractCamelProducerTemplateFactoryBeanEClass == null) {
            abstractCamelProducerTemplateFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(4);
        }
        return abstractCamelProducerTemplateFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelProducerTemplateFactoryBean_DefaultEndpoint() {
        return (EAttribute)getAbstractCamelProducerTemplateFactoryBean().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelProducerTemplateFactoryBean_MaximumCacheSize() {
        return (EAttribute)getAbstractCamelProducerTemplateFactoryBean().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAbstractCamelRedeliveryPolicyFactoryBean() {
        if (abstractCamelRedeliveryPolicyFactoryBeanEClass == null) {
            abstractCamelRedeliveryPolicyFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(5);
        }
        return abstractCamelRedeliveryPolicyFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelRedeliveryPolicyFactoryBean_AsyncDelayedRedelivery() {
        return (EAttribute)getAbstractCamelRedeliveryPolicyFactoryBean().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelRedeliveryPolicyFactoryBean_BackOffMultiplier() {
        return (EAttribute)getAbstractCamelRedeliveryPolicyFactoryBean().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelRedeliveryPolicyFactoryBean_CollisionAvoidanceFactor() {
        return (EAttribute)getAbstractCamelRedeliveryPolicyFactoryBean().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelRedeliveryPolicyFactoryBean_DelayPattern() {
        return (EAttribute)getAbstractCamelRedeliveryPolicyFactoryBean().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelRedeliveryPolicyFactoryBean_DisableRedelivery() {
        return (EAttribute)getAbstractCamelRedeliveryPolicyFactoryBean().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelRedeliveryPolicyFactoryBean_LogContinued() {
        return (EAttribute)getAbstractCamelRedeliveryPolicyFactoryBean().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelRedeliveryPolicyFactoryBean_LogExhausted() {
        return (EAttribute)getAbstractCamelRedeliveryPolicyFactoryBean().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelRedeliveryPolicyFactoryBean_LogHandled() {
        return (EAttribute)getAbstractCamelRedeliveryPolicyFactoryBean().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelRedeliveryPolicyFactoryBean_LogRetryAttempted() {
        return (EAttribute)getAbstractCamelRedeliveryPolicyFactoryBean().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelRedeliveryPolicyFactoryBean_LogRetryStackTrace() {
        return (EAttribute)getAbstractCamelRedeliveryPolicyFactoryBean().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelRedeliveryPolicyFactoryBean_LogStackTrace() {
        return (EAttribute)getAbstractCamelRedeliveryPolicyFactoryBean().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelRedeliveryPolicyFactoryBean_MaximumRedeliveries() {
        return (EAttribute)getAbstractCamelRedeliveryPolicyFactoryBean().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelRedeliveryPolicyFactoryBean_MaximumRedeliveryDelay() {
        return (EAttribute)getAbstractCamelRedeliveryPolicyFactoryBean().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelRedeliveryPolicyFactoryBean_RedeliveryDelay() {
        return (EAttribute)getAbstractCamelRedeliveryPolicyFactoryBean().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelRedeliveryPolicyFactoryBean_RetriesExhaustedLogLevel() {
        return (EAttribute)getAbstractCamelRedeliveryPolicyFactoryBean().getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelRedeliveryPolicyFactoryBean_RetryAttemptedLogLevel() {
        return (EAttribute)getAbstractCamelRedeliveryPolicyFactoryBean().getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelRedeliveryPolicyFactoryBean_UseCollisionAvoidance() {
        return (EAttribute)getAbstractCamelRedeliveryPolicyFactoryBean().getEStructuralFeatures().get(16);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelRedeliveryPolicyFactoryBean_UseExponentialBackOff() {
        return (EAttribute)getAbstractCamelRedeliveryPolicyFactoryBean().getEStructuralFeatures().get(17);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAbstractCamelThreadPoolFactoryBean() {
        if (abstractCamelThreadPoolFactoryBeanEClass == null) {
            abstractCamelThreadPoolFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(6);
        }
        return abstractCamelThreadPoolFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelThreadPoolFactoryBean_KeepAliveTime() {
        return (EAttribute)getAbstractCamelThreadPoolFactoryBean().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelThreadPoolFactoryBean_MaxPoolSize() {
        return (EAttribute)getAbstractCamelThreadPoolFactoryBean().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelThreadPoolFactoryBean_MaxQueueSize() {
        return (EAttribute)getAbstractCamelThreadPoolFactoryBean().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelThreadPoolFactoryBean_PoolSize() {
        return (EAttribute)getAbstractCamelThreadPoolFactoryBean().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelThreadPoolFactoryBean_RejectedPolicy() {
        return (EAttribute)getAbstractCamelThreadPoolFactoryBean().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelThreadPoolFactoryBean_ThreadName() {
        return (EAttribute)getAbstractCamelThreadPoolFactoryBean().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractCamelThreadPoolFactoryBean_TimeUnit() {
        return (EAttribute)getAbstractCamelThreadPoolFactoryBean().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAbstractJsseUtilFactoryBean() {
        if (abstractJsseUtilFactoryBeanEClass == null) {
            abstractJsseUtilFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(7);
        }
        return abstractJsseUtilFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAbstractKeyManagersParametersFactoryBean() {
        if (abstractKeyManagersParametersFactoryBeanEClass == null) {
            abstractKeyManagersParametersFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(8);
        }
        return abstractKeyManagersParametersFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractKeyManagersParametersFactoryBean_Algorithm() {
        return (EAttribute)getAbstractKeyManagersParametersFactoryBean().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractKeyManagersParametersFactoryBean_KeyPassword() {
        return (EAttribute)getAbstractKeyManagersParametersFactoryBean().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractKeyManagersParametersFactoryBean_Provider() {
        return (EAttribute)getAbstractKeyManagersParametersFactoryBean().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAbstractKeyStoreParametersFactoryBean() {
        if (abstractKeyStoreParametersFactoryBeanEClass == null) {
            abstractKeyStoreParametersFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(9);
        }
        return abstractKeyStoreParametersFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractKeyStoreParametersFactoryBean_Password() {
        return (EAttribute)getAbstractKeyStoreParametersFactoryBean().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractKeyStoreParametersFactoryBean_Provider() {
        return (EAttribute)getAbstractKeyStoreParametersFactoryBean().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractKeyStoreParametersFactoryBean_Resource() {
        return (EAttribute)getAbstractKeyStoreParametersFactoryBean().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractKeyStoreParametersFactoryBean_Type() {
        return (EAttribute)getAbstractKeyStoreParametersFactoryBean().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAbstractSecureRandomParametersFactoryBean() {
        if (abstractSecureRandomParametersFactoryBeanEClass == null) {
            abstractSecureRandomParametersFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(10);
        }
        return abstractSecureRandomParametersFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractSecureRandomParametersFactoryBean_Algorithm() {
        return (EAttribute)getAbstractSecureRandomParametersFactoryBean().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractSecureRandomParametersFactoryBean_Provider() {
        return (EAttribute)getAbstractSecureRandomParametersFactoryBean().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAbstractTrustManagersParametersFactoryBean() {
        if (abstractTrustManagersParametersFactoryBeanEClass == null) {
            abstractTrustManagersParametersFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(11);
        }
        return abstractTrustManagersParametersFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractTrustManagersParametersFactoryBean_Algorithm() {
        return (EAttribute)getAbstractTrustManagersParametersFactoryBean().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAbstractTrustManagersParametersFactoryBean_Provider() {
        return (EAttribute)getAbstractTrustManagersParametersFactoryBean().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAggregateDefinition() {
        if (aggregateDefinitionEClass == null) {
            aggregateDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(12);
        }
        return aggregateDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_CorrelationExpression() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_CompletionPredicate() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_CompletionTimeout() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_CompletionSize() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAggregateDefinition_Group() {
        return (EAttribute)getAggregateDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Aop() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Aggregate() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Bean() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_DoCatch() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_When() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Choice() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Otherwise() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_ConvertBodyTo() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Delay() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_DynamicRouter() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Enrich() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Filter() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(16);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_DoFinally() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(17);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_IdempotentConsumer() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(18);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_InOnly() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(19);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_InOut() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(20);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Intercept() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(21);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_InterceptFrom() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(22);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_InterceptToEndpoint() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(23);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_LoadBalance() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(24);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Log() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(25);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Loop() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(26);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Marshal() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(27);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Multicast() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(28);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_OnCompletion() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(29);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_OnException() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(30);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Pipeline() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(31);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Policy() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(32);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_PollEnrich() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(33);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Process() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(34);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_RecipientList() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(35);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_RemoveHeader() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(36);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_RemoveHeaders() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(37);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_RemoveProperty() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(38);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Resequence() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(39);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Rollback() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(40);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Route() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(41);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_RoutingSlip() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(42);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Sample() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(43);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_SetBody() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(44);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_SetExchangePattern() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(45);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_SetFaultBody() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(46);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_SetHeader() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(47);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_SetOutHeader() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(48);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_SetProperty() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(49);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Sort() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(50);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Split() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(51);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Stop() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(52);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Threads() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(53);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Throttle() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(54);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_ThrowException() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(55);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_To() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(56);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Transacted() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(57);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Transform() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(58);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_DoTry() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(59);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Unmarshal() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(60);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_Validate() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(61);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAggregateDefinition_WireTap() {
        return (EReference)getAggregateDefinition().getEStructuralFeatures().get(62);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAggregateDefinition_AggregationRepositoryRef() {
        return (EAttribute)getAggregateDefinition().getEStructuralFeatures().get(63);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAggregateDefinition_CloseCorrelationKeyOnCompletion() {
        return (EAttribute)getAggregateDefinition().getEStructuralFeatures().get(64);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAggregateDefinition_CompletionFromBatchConsumer() {
        return (EAttribute)getAggregateDefinition().getEStructuralFeatures().get(65);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAggregateDefinition_CompletionInterval() {
        return (EAttribute)getAggregateDefinition().getEStructuralFeatures().get(66);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAggregateDefinition_CompletionSize1() {
        return (EAttribute)getAggregateDefinition().getEStructuralFeatures().get(67);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAggregateDefinition_CompletionTimeout1() {
        return (EAttribute)getAggregateDefinition().getEStructuralFeatures().get(68);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAggregateDefinition_DiscardOnCompletionTimeout() {
        return (EAttribute)getAggregateDefinition().getEStructuralFeatures().get(69);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAggregateDefinition_EagerCheckCompletion() {
        return (EAttribute)getAggregateDefinition().getEStructuralFeatures().get(70);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAggregateDefinition_ExecutorServiceRef() {
        return (EAttribute)getAggregateDefinition().getEStructuralFeatures().get(71);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAggregateDefinition_ForceCompletionOnStop() {
        return (EAttribute)getAggregateDefinition().getEStructuralFeatures().get(72);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAggregateDefinition_GroupExchanges() {
        return (EAttribute)getAggregateDefinition().getEStructuralFeatures().get(73);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAggregateDefinition_IgnoreInvalidCorrelationKeys() {
        return (EAttribute)getAggregateDefinition().getEStructuralFeatures().get(74);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAggregateDefinition_ParallelProcessing() {
        return (EAttribute)getAggregateDefinition().getEStructuralFeatures().get(75);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAggregateDefinition_StrategyRef() {
        return (EAttribute)getAggregateDefinition().getEStructuralFeatures().get(76);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAggregateDefinition_TimeoutCheckerExecutorServiceRef() {
        return (EAttribute)getAggregateDefinition().getEStructuralFeatures().get(77);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAggregateDefinition_AnyAttribute1() {
        return (EAttribute)getAggregateDefinition().getEStructuralFeatures().get(78);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAliasEntry() {
        if (aliasEntryEClass == null) {
            aliasEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(13);
        }
        return aliasEntryEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAliasEntry_Class() {
        return (EAttribute)getAliasEntry().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAliasEntry_Name() {
        return (EAttribute)getAliasEntry().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAliasList() {
        if (aliasListEClass == null) {
            aliasListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(14);
        }
        return aliasListEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAliasList_Alias() {
        return (EReference)getAliasList().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAopDefinition() {
        if (aopDefinitionEClass == null) {
            aopDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(15);
        }
        return aopDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAopDefinition_AfterFinallyUri() {
        return (EAttribute)getAopDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAopDefinition_AfterUri() {
        return (EAttribute)getAopDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAopDefinition_BeforeUri() {
        return (EAttribute)getAopDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAopDefinition_AnyAttribute2() {
        return (EAttribute)getAopDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBatchResequencerConfig() {
        if (batchResequencerConfigEClass == null) {
            batchResequencerConfigEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(16);
        }
        return batchResequencerConfigEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBatchResequencerConfig_AllowDuplicates() {
        return (EAttribute)getBatchResequencerConfig().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBatchResequencerConfig_BatchSize() {
        return (EAttribute)getBatchResequencerConfig().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBatchResequencerConfig_BatchTimeout() {
        return (EAttribute)getBatchResequencerConfig().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBatchResequencerConfig_IgnoreInvalidExchanges() {
        return (EAttribute)getBatchResequencerConfig().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBatchResequencerConfig_Reverse() {
        return (EAttribute)getBatchResequencerConfig().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBeanDefinition() {
        if (beanDefinitionEClass == null) {
            beanDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(17);
        }
        return beanDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBeanDefinition_BeanType() {
        return (EAttribute)getBeanDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBeanDefinition_Method() {
        return (EAttribute)getBeanDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBeanDefinition_Ref() {
        return (EAttribute)getBeanDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBeanDefinition_AnyAttribute2() {
        return (EAttribute)getBeanDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBindyDataFormat() {
        if (bindyDataFormatEClass == null) {
            bindyDataFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(18);
        }
        return bindyDataFormatEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBindyDataFormat_Locale() {
        return (EAttribute)getBindyDataFormat().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBindyDataFormat_Packages() {
        return (EAttribute)getBindyDataFormat().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBindyDataFormat_Type() {
        return (EAttribute)getBindyDataFormat().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCamelBeanPostProcessor() {
        if (camelBeanPostProcessorEClass == null) {
            camelBeanPostProcessorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(21);
        }
        return camelBeanPostProcessorEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCamelConsumerTemplateFactoryBean() {
        if (camelConsumerTemplateFactoryBeanEClass == null) {
            camelConsumerTemplateFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(22);
        }
        return camelConsumerTemplateFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCamelContextFactoryBean() {
        if (camelContextFactoryBeanEClass == null) {
            camelContextFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(23);
        }
        return camelContextFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelContextFactoryBean_Properties() {
        return (EReference)getCamelContextFactoryBean().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelContextFactoryBean_PropertyPlaceholder() {
        return (EReference)getCamelContextFactoryBean().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelContextFactoryBean_Package() {
        return (EAttribute)getCamelContextFactoryBean().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelContextFactoryBean_PackageScan() {
        return (EReference)getCamelContextFactoryBean().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelContextFactoryBean_ContextScan() {
        return (EReference)getCamelContextFactoryBean().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelContextFactoryBean_JmxAgent() {
        return (EReference)getCamelContextFactoryBean().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelContextFactoryBean_Group() {
        return (EAttribute)getCamelContextFactoryBean().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelContextFactoryBean_Template() {
        return (EReference)getCamelContextFactoryBean().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelContextFactoryBean_ConsumerTemplate() {
        return (EReference)getCamelContextFactoryBean().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelContextFactoryBean_Proxy() {
        return (EReference)getCamelContextFactoryBean().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelContextFactoryBean_Export() {
        return (EReference)getCamelContextFactoryBean().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelContextFactoryBean_ErrorHandler() {
        return (EReference)getCamelContextFactoryBean().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelContextFactoryBean_RouteBuilder() {
        return (EReference)getCamelContextFactoryBean().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelContextFactoryBean_RouteContextRef() {
        return (EReference)getCamelContextFactoryBean().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelContextFactoryBean_ThreadPoolProfile() {
        return (EReference)getCamelContextFactoryBean().getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelContextFactoryBean_ThreadPool() {
        return (EReference)getCamelContextFactoryBean().getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelContextFactoryBean_Endpoint() {
        return (EReference)getCamelContextFactoryBean().getEStructuralFeatures().get(16);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelContextFactoryBean_DataFormats() {
        return (EReference)getCamelContextFactoryBean().getEStructuralFeatures().get(17);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelContextFactoryBean_RedeliveryPolicyProfile() {
        return (EReference)getCamelContextFactoryBean().getEStructuralFeatures().get(18);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelContextFactoryBean_OnException() {
        return (EReference)getCamelContextFactoryBean().getEStructuralFeatures().get(19);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelContextFactoryBean_OnCompletion() {
        return (EReference)getCamelContextFactoryBean().getEStructuralFeatures().get(20);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelContextFactoryBean_Intercept() {
        return (EReference)getCamelContextFactoryBean().getEStructuralFeatures().get(21);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelContextFactoryBean_InterceptFrom() {
        return (EReference)getCamelContextFactoryBean().getEStructuralFeatures().get(22);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelContextFactoryBean_InterceptSendToEndpoint() {
        return (EReference)getCamelContextFactoryBean().getEStructuralFeatures().get(23);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelContextFactoryBean_Route() {
        return (EReference)getCamelContextFactoryBean().getEStructuralFeatures().get(24);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelContextFactoryBean_AutoStartup() {
        return (EAttribute)getCamelContextFactoryBean().getEStructuralFeatures().get(25);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelContextFactoryBean_Delayer() {
        return (EAttribute)getCamelContextFactoryBean().getEStructuralFeatures().get(26);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelContextFactoryBean_DependsOn() {
        return (EAttribute)getCamelContextFactoryBean().getEStructuralFeatures().get(27);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelContextFactoryBean_ErrorHandlerRef() {
        return (EAttribute)getCamelContextFactoryBean().getEStructuralFeatures().get(28);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelContextFactoryBean_HandleFault() {
        return (EAttribute)getCamelContextFactoryBean().getEStructuralFeatures().get(29);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelContextFactoryBean_LazyLoadTypeConverters() {
        return (EAttribute)getCamelContextFactoryBean().getEStructuralFeatures().get(30);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelContextFactoryBean_ShutdownRoute() {
        return (EAttribute)getCamelContextFactoryBean().getEStructuralFeatures().get(31);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelContextFactoryBean_ShutdownRunningTask() {
        return (EAttribute)getCamelContextFactoryBean().getEStructuralFeatures().get(32);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelContextFactoryBean_StreamCache() {
        return (EAttribute)getCamelContextFactoryBean().getEStructuralFeatures().get(33);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelContextFactoryBean_Trace() {
        return (EAttribute)getCamelContextFactoryBean().getEStructuralFeatures().get(34);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelContextFactoryBean_UseBreadcrumb() {
        return (EAttribute)getCamelContextFactoryBean().getEStructuralFeatures().get(35);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelContextFactoryBean_UseMDCLogging() {
        return (EAttribute)getCamelContextFactoryBean().getEStructuralFeatures().get(36);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCamelEndpointFactoryBean() {
        if (camelEndpointFactoryBeanEClass == null) {
            camelEndpointFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(24);
        }
        return camelEndpointFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCamelJMXAgentDefinition() {
        if (camelJMXAgentDefinitionEClass == null) {
            camelJMXAgentDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(25);
        }
        return camelJMXAgentDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelJMXAgentDefinition_ConnectorPort() {
        return (EAttribute)getCamelJMXAgentDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelJMXAgentDefinition_CreateConnector() {
        return (EAttribute)getCamelJMXAgentDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelJMXAgentDefinition_Disabled() {
        return (EAttribute)getCamelJMXAgentDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelJMXAgentDefinition_MbeanObjectDomainName() {
        return (EAttribute)getCamelJMXAgentDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelJMXAgentDefinition_MbeanServerDefaultDomain() {
        return (EAttribute)getCamelJMXAgentDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelJMXAgentDefinition_OnlyRegisterProcessorWithCustomId() {
        return (EAttribute)getCamelJMXAgentDefinition().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelJMXAgentDefinition_RegisterAlways() {
        return (EAttribute)getCamelJMXAgentDefinition().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelJMXAgentDefinition_RegisterNewRoutes() {
        return (EAttribute)getCamelJMXAgentDefinition().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelJMXAgentDefinition_RegistryPort() {
        return (EAttribute)getCamelJMXAgentDefinition().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelJMXAgentDefinition_ServiceUrlPath() {
        return (EAttribute)getCamelJMXAgentDefinition().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelJMXAgentDefinition_StatisticsLevel() {
        return (EAttribute)getCamelJMXAgentDefinition().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelJMXAgentDefinition_UsePlatformMBeanServer() {
        return (EAttribute)getCamelJMXAgentDefinition().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCamelProducerTemplateFactoryBean() {
        if (camelProducerTemplateFactoryBeanEClass == null) {
            camelProducerTemplateFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(26);
        }
        return camelProducerTemplateFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCamelPropertyPlaceholderDefinition() {
        if (camelPropertyPlaceholderDefinitionEClass == null) {
            camelPropertyPlaceholderDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(27);
        }
        return camelPropertyPlaceholderDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelPropertyPlaceholderDefinition_FallbackToUnaugmentedProperty() {
        return (EAttribute)getCamelPropertyPlaceholderDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelPropertyPlaceholderDefinition_Location() {
        return (EAttribute)getCamelPropertyPlaceholderDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelPropertyPlaceholderDefinition_PrefixToken() {
        return (EAttribute)getCamelPropertyPlaceholderDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelPropertyPlaceholderDefinition_PropertiesParserRef() {
        return (EAttribute)getCamelPropertyPlaceholderDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelPropertyPlaceholderDefinition_PropertiesResolverRef() {
        return (EAttribute)getCamelPropertyPlaceholderDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelPropertyPlaceholderDefinition_PropertyPrefix() {
        return (EAttribute)getCamelPropertyPlaceholderDefinition().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelPropertyPlaceholderDefinition_PropertySuffix() {
        return (EAttribute)getCamelPropertyPlaceholderDefinition().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCamelPropertyPlaceholderDefinition_SuffixToken() {
        return (EAttribute)getCamelPropertyPlaceholderDefinition().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCamelProxyFactoryDefinition() {
        if (camelProxyFactoryDefinitionEClass == null) {
            camelProxyFactoryDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(28);
        }
        return camelProxyFactoryDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelProxyFactoryDefinition_CamelContextId() {
        return (EAttribute)getCamelProxyFactoryDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelProxyFactoryDefinition_ServiceInterface() {
        return (EAttribute)getCamelProxyFactoryDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelProxyFactoryDefinition_ServiceRef() {
        return (EAttribute)getCamelProxyFactoryDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelProxyFactoryDefinition_ServiceUrl() {
        return (EAttribute)getCamelProxyFactoryDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCamelRedeliveryPolicyFactoryBean() {
        if (camelRedeliveryPolicyFactoryBeanEClass == null) {
            camelRedeliveryPolicyFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(29);
        }
        return camelRedeliveryPolicyFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCamelRouteContextFactoryBean() {
        if (camelRouteContextFactoryBeanEClass == null) {
            camelRouteContextFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(30);
        }
        return camelRouteContextFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCamelRouteContextFactoryBean_Route() {
        return (EReference)getCamelRouteContextFactoryBean().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCamelServiceExporterDefinition() {
        if (camelServiceExporterDefinitionEClass == null) {
            camelServiceExporterDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(31);
        }
        return camelServiceExporterDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelServiceExporterDefinition_CamelContextId() {
        return (EAttribute)getCamelServiceExporterDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelServiceExporterDefinition_ServiceInterface() {
        return (EAttribute)getCamelServiceExporterDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelServiceExporterDefinition_ServiceRef() {
        return (EAttribute)getCamelServiceExporterDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCamelServiceExporterDefinition_Uri() {
        return (EAttribute)getCamelServiceExporterDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCamelThreadPoolFactoryBean() {
        if (camelThreadPoolFactoryBeanEClass == null) {
            camelThreadPoolFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(32);
        }
        return camelThreadPoolFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCastorDataFormat() {
        if (castorDataFormatEClass == null) {
            castorDataFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(33);
        }
        return castorDataFormatEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCastorDataFormat_Classes() {
        return (EAttribute)getCastorDataFormat().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCastorDataFormat_Encoding() {
        return (EAttribute)getCastorDataFormat().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCastorDataFormat_MappingFile() {
        return (EAttribute)getCastorDataFormat().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCastorDataFormat_Packages() {
        return (EAttribute)getCastorDataFormat().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCastorDataFormat_Validation() {
        return (EAttribute)getCastorDataFormat().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCatchDefinition() {
        if (catchDefinitionEClass == null) {
            catchDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(34);
        }
        return catchDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCatchDefinition_Exception() {
        return (EAttribute)getCatchDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_OnWhen() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Handled() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCatchDefinition_Group() {
        return (EAttribute)getCatchDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Aop() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Aggregate() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Bean() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_DoCatch() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_When() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Choice() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Otherwise() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_ConvertBodyTo() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Delay() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_DynamicRouter() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Enrich() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Filter() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_DoFinally() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(16);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_IdempotentConsumer() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(17);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_InOnly() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(18);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_InOut() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(19);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Intercept() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(20);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_InterceptFrom() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(21);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_InterceptToEndpoint() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(22);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_LoadBalance() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(23);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Log() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(24);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Loop() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(25);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Marshal() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(26);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Multicast() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(27);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_OnCompletion() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(28);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_OnException() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(29);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Pipeline() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(30);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Policy() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(31);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_PollEnrich() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(32);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Process() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(33);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_RecipientList() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(34);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_RemoveHeader() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(35);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_RemoveHeaders() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(36);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_RemoveProperty() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(37);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Resequence() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(38);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Rollback() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(39);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Route() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(40);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_RoutingSlip() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(41);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Sample() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(42);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_SetBody() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(43);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_SetExchangePattern() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(44);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_SetFaultBody() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(45);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_SetHeader() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(46);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_SetOutHeader() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(47);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_SetProperty() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(48);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Sort() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(49);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Split() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(50);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Stop() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(51);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Threads() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(52);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Throttle() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(53);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_ThrowException() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(54);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_To() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(55);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Transacted() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(56);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Transform() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(57);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_DoTry() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(58);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Unmarshal() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(59);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_Validate() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(60);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCatchDefinition_WireTap() {
        return (EReference)getCatchDefinition().getEStructuralFeatures().get(61);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCatchDefinition_AnyAttribute1() {
        return (EAttribute)getCatchDefinition().getEStructuralFeatures().get(62);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getChoiceDefinition() {
        if (choiceDefinitionEClass == null) {
            choiceDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(35);
        }
        return choiceDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getChoiceDefinition_When() {
        return (EReference)getChoiceDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getChoiceDefinition_Otherwise() {
        return (EReference)getChoiceDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getChoiceDefinition_AnyAttribute1() {
        return (EAttribute)getChoiceDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCipherSuitesParameters() {
        if (cipherSuitesParametersEClass == null) {
            cipherSuitesParametersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(36);
        }
        return cipherSuitesParametersEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCipherSuitesParameters_CipherSuite() {
        return (EAttribute)getCipherSuitesParameters().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getConstantExpression() {
        if (constantExpressionEClass == null) {
            constantExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(38);
        }
        return constantExpressionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getConstants() {
        if (constantsEClass == null) {
            constantsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(39);
        }
        return constantsEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getContextScanDefinition() {
        if (contextScanDefinitionEClass == null) {
            contextScanDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(40);
        }
        return contextScanDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getContextScanDefinition_Excludes() {
        return (EAttribute)getContextScanDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getContextScanDefinition_Includes() {
        return (EAttribute)getContextScanDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getConvertBodyDefinition() {
        if (convertBodyDefinitionEClass == null) {
            convertBodyDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(41);
        }
        return convertBodyDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getConvertBodyDefinition_Charset() {
        return (EAttribute)getConvertBodyDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getConvertBodyDefinition_Type() {
        return (EAttribute)getConvertBodyDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getConvertBodyDefinition_AnyAttribute2() {
        return (EAttribute)getConvertBodyDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getConverterEntry() {
        if (converterEntryEClass == null) {
            converterEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(42);
        }
        return converterEntryEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getConverterEntry_Class() {
        return (EAttribute)getConverterEntry().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getConverterList() {
        if (converterListEClass == null) {
            converterListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(43);
        }
        return converterListEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getConverterList_Converter() {
        return (EReference)getConverterList().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCryptoDataFormat() {
        if (cryptoDataFormatEClass == null) {
            cryptoDataFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(44);
        }
        return cryptoDataFormatEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCryptoDataFormat_Algorithm() {
        return (EAttribute)getCryptoDataFormat().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCryptoDataFormat_AlgorithmParameterRef() {
        return (EAttribute)getCryptoDataFormat().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCryptoDataFormat_Buffersize() {
        return (EAttribute)getCryptoDataFormat().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCryptoDataFormat_CryptoProvider() {
        return (EAttribute)getCryptoDataFormat().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCryptoDataFormat_InitVectorRef() {
        return (EAttribute)getCryptoDataFormat().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCryptoDataFormat_Inline() {
        return (EAttribute)getCryptoDataFormat().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCryptoDataFormat_KeyRef() {
        return (EAttribute)getCryptoDataFormat().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCryptoDataFormat_MacAlgorithm() {
        return (EAttribute)getCryptoDataFormat().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCryptoDataFormat_ShouldAppendHMAC() {
        return (EAttribute)getCryptoDataFormat().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCsvDataFormat() {
        if (csvDataFormatEClass == null) {
            csvDataFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(45);
        }
        return csvDataFormatEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCsvDataFormat_AutogenColumns() {
        return (EAttribute)getCsvDataFormat().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCsvDataFormat_ConfigRef() {
        return (EAttribute)getCsvDataFormat().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCsvDataFormat_Delimiter() {
        return (EAttribute)getCsvDataFormat().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCsvDataFormat_StrategyRef() {
        return (EAttribute)getCsvDataFormat().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCustomDataFormat() {
        if (customDataFormatEClass == null) {
            customDataFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(46);
        }
        return customDataFormatEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCustomDataFormat_Ref() {
        return (EAttribute)getCustomDataFormat().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCustomLoadBalancerDefinition() {
        if (customLoadBalancerDefinitionEClass == null) {
            customLoadBalancerDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(47);
        }
        return customLoadBalancerDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCustomLoadBalancerDefinition_Ref() {
        return (EAttribute)getCustomLoadBalancerDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDataFormat() {
        if (dataFormatEClass == null) {
            dataFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(48);
        }
        return dataFormatEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDataFormatsDefinition() {
        if (dataFormatsDefinitionEClass == null) {
            dataFormatsDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(49);
        }
        return dataFormatsDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDataFormatsDefinition_Group() {
        return (EAttribute)getDataFormatsDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataFormatsDefinition_Bindy() {
        return (EReference)getDataFormatsDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataFormatsDefinition_Castor() {
        return (EReference)getDataFormatsDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataFormatsDefinition_Crypto() {
        return (EReference)getDataFormatsDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataFormatsDefinition_Csv() {
        return (EReference)getDataFormatsDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataFormatsDefinition_Custom() {
        return (EReference)getDataFormatsDefinition().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataFormatsDefinition_Flatpack() {
        return (EReference)getDataFormatsDefinition().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataFormatsDefinition_Gzip() {
        return (EReference)getDataFormatsDefinition().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataFormatsDefinition_Hl7() {
        return (EReference)getDataFormatsDefinition().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataFormatsDefinition_Jaxb() {
        return (EReference)getDataFormatsDefinition().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataFormatsDefinition_Jibx() {
        return (EReference)getDataFormatsDefinition().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataFormatsDefinition_Json() {
        return (EReference)getDataFormatsDefinition().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataFormatsDefinition_Protobuf() {
        return (EReference)getDataFormatsDefinition().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataFormatsDefinition_Rss() {
        return (EReference)getDataFormatsDefinition().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataFormatsDefinition_SecureXML() {
        return (EReference)getDataFormatsDefinition().getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataFormatsDefinition_Serialization() {
        return (EReference)getDataFormatsDefinition().getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataFormatsDefinition_Soapjaxb() {
        return (EReference)getDataFormatsDefinition().getEStructuralFeatures().get(16);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataFormatsDefinition_String() {
        return (EReference)getDataFormatsDefinition().getEStructuralFeatures().get(17);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataFormatsDefinition_Syslog() {
        return (EReference)getDataFormatsDefinition().getEStructuralFeatures().get(18);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataFormatsDefinition_TidyMarkup() {
        return (EReference)getDataFormatsDefinition().getEStructuralFeatures().get(19);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataFormatsDefinition_XmlBeans() {
        return (EReference)getDataFormatsDefinition().getEStructuralFeatures().get(20);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataFormatsDefinition_Xstream() {
        return (EReference)getDataFormatsDefinition().getEStructuralFeatures().get(21);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataFormatsDefinition_Pgp() {
        return (EReference)getDataFormatsDefinition().getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataFormatsDefinition_Zip() {
        return (EReference)getDataFormatsDefinition().getEStructuralFeatures().get(23);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDelayDefinition() {
        if (delayDefinitionEClass == null) {
            delayDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(50);
        }
        return delayDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDelayDefinition_AsyncDelayed() {
        return (EAttribute)getDelayDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDelayDefinition_CallerRunsWhenRejected() {
        return (EAttribute)getDelayDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDelayDefinition_ExecutorServiceRef() {
        return (EAttribute)getDelayDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDelayDefinition_AnyAttribute2() {
        return (EAttribute)getDelayDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDescriptionDefinition() {
        if (descriptionDefinitionEClass == null) {
            descriptionDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(51);
        }
        return descriptionDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDescriptionDefinition_Value() {
        return (EAttribute)getDescriptionDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDescriptionDefinition_Lang() {
        return (EAttribute)getDescriptionDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDescriptionDefinition_LayoutHeight() {
        return (EAttribute)getDescriptionDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDescriptionDefinition_LayoutWidth() {
        return (EAttribute)getDescriptionDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDescriptionDefinition_LayoutX() {
        return (EAttribute)getDescriptionDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDescriptionDefinition_LayoutY() {
        return (EAttribute)getDescriptionDefinition().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDocumentRoot() {
        if (documentRootEClass == null) {
            documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(52);
        }
        return documentRootEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Aggregate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Aop() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_BatchResequencerConfig() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Bean() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_BeanPostProcessor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Bindy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_CamelContext() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Castor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Choice() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Constant() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ConsumerTemplate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ContextScan() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ConvertBodyTo() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Crypto() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(16);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Csv() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(17);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_CustomDataFormat() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(18);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_CustomLoadBalancer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(19);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_DataFormats() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(20);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Delay() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(21);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Description() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(22);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_DoCatch() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(23);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_DoFinally() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(24);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_DoTry() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(25);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_DynamicRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(26);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_El() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(27);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Endpoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(28);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Enrich() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(29);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ErrorHandler() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(30);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Export() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(31);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Expression() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(32);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ExpressionDefinition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(33);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Failover() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(34);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Filter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(35);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Flatpack() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(36);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_From() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(37);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Groovy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(38);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Gzip() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(39);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Header() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(40);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Hl7() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(41);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_IdempotentConsumer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(42);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_InOnly() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(43);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_InOut() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(44);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Intercept() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(45);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_InterceptFrom() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(46);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_InterceptToEndpoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(47);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_JavaScript() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(48);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Jaxb() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(49);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Jibx() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(50);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_JmxAgent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(51);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Json() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(52);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Jxpath() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(53);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_KeyStoreParameters() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(54);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Language() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(55);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_LoadBalance() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(56);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Log() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(57);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Loop() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(58);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Marshal() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(59);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Method() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(60);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Multicast() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(61);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Mvel() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(62);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Ognl() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(63);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_OnCompletion() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(64);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_OnException() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(65);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Otherwise() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(66);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_PackageScan() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(67);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Pgp() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(68);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Php() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(69);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Pipeline() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(70);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Policy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(71);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_PollEnrich() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(72);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Process() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(73);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Properties() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(74);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Property() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(75);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_PropertyPlaceholder() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(76);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Protobuf() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(77);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Proxy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(78);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Python() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(79);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Random() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(80);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_RecipientList() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(81);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_RedeliveryPolicy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(82);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_RedeliveryPolicyProfile() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(83);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Ref() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(84);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_RemoveHeader() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(85);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_RemoveHeaders() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(86);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_RemoveProperty() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(87);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Resequence() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(88);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Rollback() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(89);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_RoundRobin() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(90);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Route() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(91);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_RouteBuilder() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(92);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_RouteContext() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(93);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_RouteContextRef() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(94);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Routes() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(95);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_RoutingSlip() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(96);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Rss() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(97);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Ruby() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(98);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Sample() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(99);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_SecureRandomParameters() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(100);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_SecureXML() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(101);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Serialization() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(102);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_SetBody() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(103);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_SetExchangePattern() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(104);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_SetFaultBody() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(105);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_SetHeader() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(106);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_SetOutHeader() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(107);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_SetProperty() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(108);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Simple() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(109);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Soapjaxb() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(110);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Sort() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(111);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Spel() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(112);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Split() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(113);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Sql() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(114);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_SslContextParameters() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(115);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Sticky() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(116);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Stop() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(117);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_StreamResequencerConfig() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(118);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_String() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(119);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Syslog() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(120);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Template() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(121);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ThreadPool() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(122);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ThreadPoolProfile() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(123);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Threads() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(124);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Throttle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(125);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_ThrowException() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(126);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_TidyMarkup() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(127);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_To() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(128);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Tokenize() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(129);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Topic() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(130);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Transacted() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(131);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Transform() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(132);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Unmarshal() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(133);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Validate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(134);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Weighted() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(135);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_When() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(136);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_WireTap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(137);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_XmlBeans() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(138);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Xpath() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(139);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Xquery() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(140);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Xstream() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(141);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDocumentRoot_Zip() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(142);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDynamicRouterDefinition() {
        if (dynamicRouterDefinitionEClass == null) {
            dynamicRouterDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(53);
        }
        return dynamicRouterDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDynamicRouterDefinition_IgnoreInvalidEndpoints() {
        return (EAttribute)getDynamicRouterDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDynamicRouterDefinition_UriDelimiter() {
        return (EAttribute)getDynamicRouterDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDynamicRouterDefinition_AnyAttribute3() {
        return (EAttribute)getDynamicRouterDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getElExpression() {
        if (elExpressionEClass == null) {
            elExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(54);
        }
        return elExpressionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEnrichDefinition() {
        if (enrichDefinitionEClass == null) {
            enrichDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(55);
        }
        return enrichDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEnrichDefinition_Ref() {
        return (EAttribute)getEnrichDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEnrichDefinition_StrategyRef() {
        return (EAttribute)getEnrichDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEnrichDefinition_Uri() {
        return (EAttribute)getEnrichDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEnrichDefinition_AnyAttribute2() {
        return (EAttribute)getEnrichDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getErrorHandlerDefinition() {
        if (errorHandlerDefinitionEClass == null) {
            errorHandlerDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(56);
        }
        return errorHandlerDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getErrorHandlerDefinition_RedeliveryPolicy() {
        return (EReference)getErrorHandlerDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getErrorHandlerDefinition_DeadLetterUri() {
        return (EAttribute)getErrorHandlerDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getErrorHandlerDefinition_ExecutorServiceRef() {
        return (EAttribute)getErrorHandlerDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getErrorHandlerDefinition_Level() {
        return (EAttribute)getErrorHandlerDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getErrorHandlerDefinition_LogName() {
        return (EAttribute)getErrorHandlerDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getErrorHandlerDefinition_OnRedeliveryRef() {
        return (EAttribute)getErrorHandlerDefinition().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getErrorHandlerDefinition_RedeliveryPolicyRef() {
        return (EAttribute)getErrorHandlerDefinition().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getErrorHandlerDefinition_RetryWhileRef() {
        return (EAttribute)getErrorHandlerDefinition().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getErrorHandlerDefinition_RollbackLoggingLevel() {
        return (EAttribute)getErrorHandlerDefinition().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getErrorHandlerDefinition_TransactionManagerRef() {
        return (EAttribute)getErrorHandlerDefinition().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getErrorHandlerDefinition_TransactionTemplateRef() {
        return (EAttribute)getErrorHandlerDefinition().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getErrorHandlerDefinition_Type() {
        return (EAttribute)getErrorHandlerDefinition().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getErrorHandlerDefinition_UseOriginalMessage() {
        return (EAttribute)getErrorHandlerDefinition().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getExpression() {
        if (expressionEClass == null) {
            expressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(61);
        }
        return expressionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getExpression_Value() {
        return (EAttribute)getExpression().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getExpression_Id() {
        return (EAttribute)getExpression().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getExpressionNode() {
        if (expressionNodeEClass == null) {
            expressionNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(62);
        }
        return expressionNodeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_ExpressionDefinition() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Constant() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_El() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Groovy() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Header() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Jxpath() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_JavaScript() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Language() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Method() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Mvel() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Ognl() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Php() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Property() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Python() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Ref() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Ruby() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Simple() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(16);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Spel() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(17);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Sql() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(18);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Tokenize() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(19);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Xpath() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(20);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Xquery() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(21);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getExpressionNode_Group() {
        return (EAttribute)getExpressionNode().getEStructuralFeatures().get(22);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Aop() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(23);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Aggregate() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(24);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Bean() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(25);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_DoCatch() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(26);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_When() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(27);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Choice() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(28);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Otherwise() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(29);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_ConvertBodyTo() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(30);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Delay() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(31);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_DynamicRouter() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(32);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Enrich() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(33);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Filter() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(34);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_DoFinally() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(35);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_IdempotentConsumer() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(36);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_InOnly() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(37);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_InOut() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(38);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Intercept() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(39);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_InterceptFrom() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(40);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_InterceptToEndpoint() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(41);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_LoadBalance() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(42);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Log() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(43);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Loop() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(44);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Marshal() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(45);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Multicast() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(46);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_OnCompletion() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(47);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_OnException() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(48);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Pipeline() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(49);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Policy() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(50);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_PollEnrich() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(51);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Process() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(52);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_RecipientList() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(53);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_RemoveHeader() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(54);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_RemoveHeaders() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(55);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_RemoveProperty() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(56);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Resequence() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(57);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Rollback() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(58);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Route() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(59);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_RoutingSlip() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(60);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Sample() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(61);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_SetBody() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(62);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_SetExchangePattern() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(63);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_SetFaultBody() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(64);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_SetHeader() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(65);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_SetOutHeader() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(66);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_SetProperty() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(67);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Sort() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(68);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Split() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(69);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Stop() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(70);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Threads() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(71);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Throttle() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(72);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_ThrowException() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(73);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_To() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(74);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Transacted() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(75);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Transform() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(76);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_DoTry() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(77);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Unmarshal() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(78);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_Validate() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(79);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionNode_WireTap() {
        return (EReference)getExpressionNode().getEStructuralFeatures().get(80);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getExpressionNode_AnyAttribute1() {
        return (EAttribute)getExpressionNode().getEStructuralFeatures().get(81);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExpressionNodeHelper() {
        if (expressionNodeHelperEClass == null) {
            expressionNodeHelperEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(63);
        }
        return expressionNodeHelperEClass;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getExpressionSubElementDefinition() {
        if (expressionSubElementDefinitionEClass == null) {
            expressionSubElementDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(64);
        }
        return expressionSubElementDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionSubElementDefinition_ExpressionDefinition() {
        return (EReference)getExpressionSubElementDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionSubElementDefinition_Constant() {
        return (EReference)getExpressionSubElementDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionSubElementDefinition_El() {
        return (EReference)getExpressionSubElementDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionSubElementDefinition_Groovy() {
        return (EReference)getExpressionSubElementDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionSubElementDefinition_Header() {
        return (EReference)getExpressionSubElementDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionSubElementDefinition_Jxpath() {
        return (EReference)getExpressionSubElementDefinition().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionSubElementDefinition_JavaScript() {
        return (EReference)getExpressionSubElementDefinition().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionSubElementDefinition_Language() {
        return (EReference)getExpressionSubElementDefinition().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionSubElementDefinition_Method() {
        return (EReference)getExpressionSubElementDefinition().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionSubElementDefinition_Mvel() {
        return (EReference)getExpressionSubElementDefinition().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionSubElementDefinition_Ognl() {
        return (EReference)getExpressionSubElementDefinition().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionSubElementDefinition_Php() {
        return (EReference)getExpressionSubElementDefinition().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionSubElementDefinition_Property() {
        return (EReference)getExpressionSubElementDefinition().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionSubElementDefinition_Python() {
        return (EReference)getExpressionSubElementDefinition().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionSubElementDefinition_Ref() {
        return (EReference)getExpressionSubElementDefinition().getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionSubElementDefinition_Ruby() {
        return (EReference)getExpressionSubElementDefinition().getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionSubElementDefinition_Simple() {
        return (EReference)getExpressionSubElementDefinition().getEStructuralFeatures().get(16);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionSubElementDefinition_Spel() {
        return (EReference)getExpressionSubElementDefinition().getEStructuralFeatures().get(17);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionSubElementDefinition_Sql() {
        return (EReference)getExpressionSubElementDefinition().getEStructuralFeatures().get(18);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionSubElementDefinition_Tokenize() {
        return (EReference)getExpressionSubElementDefinition().getEStructuralFeatures().get(19);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionSubElementDefinition_Xpath() {
        return (EReference)getExpressionSubElementDefinition().getEStructuralFeatures().get(20);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExpressionSubElementDefinition_Xquery() {
        return (EReference)getExpressionSubElementDefinition().getEStructuralFeatures().get(21);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFailoverLoadBalancerDefinition() {
        if (failoverLoadBalancerDefinitionEClass == null) {
            failoverLoadBalancerDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(65);
        }
        return failoverLoadBalancerDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFailoverLoadBalancerDefinition_Exception() {
        return (EAttribute)getFailoverLoadBalancerDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFailoverLoadBalancerDefinition_MaximumFailoverAttempts() {
        return (EAttribute)getFailoverLoadBalancerDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFailoverLoadBalancerDefinition_RoundRobin() {
        return (EAttribute)getFailoverLoadBalancerDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFilterDefinition() {
        if (filterDefinitionEClass == null) {
            filterDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(66);
        }
        return filterDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFilterDefinition_AnyAttribute2() {
        return (EAttribute)getFilterDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFilterParameters() {
        if (filterParametersEClass == null) {
            filterParametersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(67);
        }
        return filterParametersEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFilterParameters_Include() {
        return (EAttribute)getFilterParameters().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFilterParameters_Exclude() {
        return (EAttribute)getFilterParameters().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFinallyDefinition() {
        if (finallyDefinitionEClass == null) {
            finallyDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(68);
        }
        return finallyDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFinallyDefinition_AnyAttribute2() {
        return (EAttribute)getFinallyDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFlatpackDataFormat() {
        if (flatpackDataFormatEClass == null) {
            flatpackDataFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(69);
        }
        return flatpackDataFormatEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFromDefinition() {
        if (fromDefinitionEClass == null) {
            fromDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(70);
        }
        return fromDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFromDefinition_Ref() {
        return (EAttribute)getFromDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFromDefinition_Uri() {
        return (EAttribute)getFromDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGroovyExpression() {
        if (groovyExpressionEClass == null) {
            groovyExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(71);
        }
        return groovyExpressionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGzipDataFormat() {
        if (gzipDataFormatEClass == null) {
            gzipDataFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(72);
        }
        return gzipDataFormatEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getHeaderExpression() {
        if (headerExpressionEClass == null) {
            headerExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(73);
        }
        return headerExpressionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getHl7DataFormat() {
        if (hl7DataFormatEClass == null) {
            hl7DataFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(74);
        }
        return hl7DataFormatEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getHl7DataFormat_Validate() {
        return (EAttribute)getHl7DataFormat().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getIdempotentConsumerDefinition() {
        if (idempotentConsumerDefinitionEClass == null) {
            idempotentConsumerDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(75);
        }
        return idempotentConsumerDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIdempotentConsumerDefinition_Eager() {
        return (EAttribute)getIdempotentConsumerDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIdempotentConsumerDefinition_MessageIdRepositoryRef() {
        return (EAttribute)getIdempotentConsumerDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIdempotentConsumerDefinition_RemoveOnFailure() {
        return (EAttribute)getIdempotentConsumerDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIdempotentConsumerDefinition_SkipDuplicate() {
        return (EAttribute)getIdempotentConsumerDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIdempotentConsumerDefinition_AnyAttribute2() {
        return (EAttribute)getIdempotentConsumerDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getIdentifiedType() {
        if (identifiedTypeEClass == null) {
            identifiedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(76);
        }
        return identifiedTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIdentifiedType_Id() {
        return (EAttribute)getIdentifiedType().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getImplicitCollectionEntry() {
        if (implicitCollectionEntryEClass == null) {
            implicitCollectionEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(77);
        }
        return implicitCollectionEntryEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImplicitCollectionEntry_Field() {
        return (EAttribute)getImplicitCollectionEntry().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getImplicitCollectionEntry_Name() {
        return (EAttribute)getImplicitCollectionEntry().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getImplicitCollectionList() {
        if (implicitCollectionListEClass == null) {
            implicitCollectionListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(78);
        }
        return implicitCollectionListEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getImplicitCollectionList_Class() {
        return (EReference)getImplicitCollectionList().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getInOnlyDefinition() {
        if (inOnlyDefinitionEClass == null) {
            inOnlyDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(79);
        }
        return inOnlyDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getInOnlyDefinition_AnyAttribute3() {
        return (EAttribute)getInOnlyDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getInOutDefinition() {
        if (inOutDefinitionEClass == null) {
            inOutDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(80);
        }
        return inOutDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getInOutDefinition_AnyAttribute3() {
        return (EAttribute)getInOutDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getInterceptDefinition() {
        if (interceptDefinitionEClass == null) {
            interceptDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(81);
        }
        return interceptDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getInterceptDefinition_AnyAttribute2() {
        return (EAttribute)getInterceptDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getInterceptFromDefinition() {
        if (interceptFromDefinitionEClass == null) {
            interceptFromDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(82);
        }
        return interceptFromDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getInterceptFromDefinition_Uri() {
        return (EAttribute)getInterceptFromDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getInterceptFromDefinition_AnyAttribute3() {
        return (EAttribute)getInterceptFromDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getInterceptSendToEndpointDefinition() {
        if (interceptSendToEndpointDefinitionEClass == null) {
            interceptSendToEndpointDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(83);
        }
        return interceptSendToEndpointDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getInterceptSendToEndpointDefinition_SkipSendToOriginalEndpoint() {
        return (EAttribute)getInterceptSendToEndpointDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getInterceptSendToEndpointDefinition_Uri() {
        return (EAttribute)getInterceptSendToEndpointDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getInterceptSendToEndpointDefinition_AnyAttribute2() {
        return (EAttribute)getInterceptSendToEndpointDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJavaScriptExpression() {
        if (javaScriptExpressionEClass == null) {
            javaScriptExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(84);
        }
        return javaScriptExpressionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJaxbDataFormat() {
        if (jaxbDataFormatEClass == null) {
            jaxbDataFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(85);
        }
        return jaxbDataFormatEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJaxbDataFormat_ContextPath() {
        return (EAttribute)getJaxbDataFormat().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJaxbDataFormat_Encoding() {
        return (EAttribute)getJaxbDataFormat().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJaxbDataFormat_FilterNonXmlChars() {
        return (EAttribute)getJaxbDataFormat().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJaxbDataFormat_Fragment() {
        return (EAttribute)getJaxbDataFormat().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJaxbDataFormat_IgnoreJAXBElement() {
        return (EAttribute)getJaxbDataFormat().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJaxbDataFormat_PartClass() {
        return (EAttribute)getJaxbDataFormat().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJaxbDataFormat_PartNamespace() {
        return (EAttribute)getJaxbDataFormat().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJaxbDataFormat_PrettyPrint() {
        return (EAttribute)getJaxbDataFormat().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJibxDataFormat() {
        if (jibxDataFormatEClass == null) {
            jibxDataFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(86);
        }
        return jibxDataFormatEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJibxDataFormat_UnmarshallClass() {
        return (EAttribute)getJibxDataFormat().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJsonDataFormat() {
        if (jsonDataFormatEClass == null) {
            jsonDataFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(87);
        }
        return jsonDataFormatEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJsonDataFormat_Library() {
        return (EAttribute)getJsonDataFormat().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJsonDataFormat_PrettyPrint() {
        return (EAttribute)getJsonDataFormat().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getJsonDataFormat_UnmarshalTypeName() {
        return (EAttribute)getJsonDataFormat().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJxPathExpression() {
        if (jxPathExpressionEClass == null) {
            jxPathExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(90);
        }
        return jxPathExpressionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getKeyManagersParametersFactoryBean() {
        if (keyManagersParametersFactoryBeanEClass == null) {
            keyManagersParametersFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(91);
        }
        return keyManagersParametersFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getKeyManagersParametersFactoryBean_KeyStore() {
        return (EReference)getKeyManagersParametersFactoryBean().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getKeyStoreParametersFactoryBean() {
        if (keyStoreParametersFactoryBeanEClass == null) {
            keyStoreParametersFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(92);
        }
        return keyStoreParametersFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getLanguageExpression() {
        if (languageExpressionEClass == null) {
            languageExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(93);
        }
        return languageExpressionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLanguageExpression_Language() {
        return (EAttribute)getLanguageExpression().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getLoadBalanceDefinition() {
        if (loadBalanceDefinitionEClass == null) {
            loadBalanceDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(94);
        }
        return loadBalanceDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Failover() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Random() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Custom() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_RoundRobin() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Sticky() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Topic() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Weighted() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLoadBalanceDefinition_Group() {
        return (EAttribute)getLoadBalanceDefinition().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Aop() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Aggregate() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Bean() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_DoCatch() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_When() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Choice() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Otherwise() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_ConvertBodyTo() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Delay() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(16);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_DynamicRouter() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(17);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Enrich() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(18);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Filter() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(19);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_DoFinally() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(20);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_IdempotentConsumer() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(21);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_InOnly() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(22);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_InOut() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(23);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Intercept() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(24);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_InterceptFrom() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(25);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_InterceptToEndpoint() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(26);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_LoadBalance() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(27);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Log() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(28);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Loop() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(29);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Marshal() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(30);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Multicast() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(31);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_OnCompletion() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(32);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_OnException() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(33);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Pipeline() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(34);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Policy() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(35);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_PollEnrich() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(36);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Process() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(37);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_RecipientList() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(38);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_RemoveHeader() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(39);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_RemoveHeaders() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(40);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_RemoveProperty() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(41);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Resequence() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(42);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Rollback() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(43);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Route() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(44);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_RoutingSlip() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(45);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Sample() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(46);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_SetBody() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(47);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_SetExchangePattern() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(48);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_SetFaultBody() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(49);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_SetHeader() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(50);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_SetOutHeader() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(51);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_SetProperty() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(52);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Sort() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(53);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Split() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(54);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Stop() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(55);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Threads() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(56);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Throttle() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(57);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_ThrowException() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(58);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_To() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(59);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Transacted() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(60);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Transform() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(61);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_DoTry() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(62);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Unmarshal() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(63);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_Validate() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(64);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLoadBalanceDefinition_WireTap() {
        return (EReference)getLoadBalanceDefinition().getEStructuralFeatures().get(65);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLoadBalanceDefinition_Ref() {
        return (EAttribute)getLoadBalanceDefinition().getEStructuralFeatures().get(66);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLoadBalanceDefinition_AnyAttribute1() {
        return (EAttribute)getLoadBalanceDefinition().getEStructuralFeatures().get(67);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getLoadBalancer() {
        if (loadBalancerEClass == null) {
            loadBalancerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(95);
        }
        return loadBalancerEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getLogDefinition() {
        if (logDefinitionEClass == null) {
            logDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(96);
        }
        return logDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLogDefinition_LoggingLevel() {
        return (EAttribute)getLogDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLogDefinition_LogName() {
        return (EAttribute)getLogDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLogDefinition_Marker() {
        return (EAttribute)getLogDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLogDefinition_Message() {
        return (EAttribute)getLogDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLogDefinition_AnyAttribute2() {
        return (EAttribute)getLogDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getLoopDefinition() {
        if (loopDefinitionEClass == null) {
            loopDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(99);
        }
        return loopDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLoopDefinition_Copy() {
        return (EAttribute)getLoopDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getLoopDefinition_AnyAttribute2() {
        return (EAttribute)getLoopDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMarshalDefinition() {
        if (marshalDefinitionEClass == null) {
            marshalDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(102);
        }
        return marshalDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMarshalDefinition_Bindy() {
        return (EReference)getMarshalDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMarshalDefinition_Castor() {
        return (EReference)getMarshalDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMarshalDefinition_Crypto() {
        return (EReference)getMarshalDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMarshalDefinition_Csv() {
        return (EReference)getMarshalDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMarshalDefinition_Custom() {
        return (EReference)getMarshalDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMarshalDefinition_Flatpack() {
        return (EReference)getMarshalDefinition().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMarshalDefinition_Gzip() {
        return (EReference)getMarshalDefinition().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMarshalDefinition_Hl7() {
        return (EReference)getMarshalDefinition().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMarshalDefinition_Jaxb() {
        return (EReference)getMarshalDefinition().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMarshalDefinition_Jibx() {
        return (EReference)getMarshalDefinition().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMarshalDefinition_Json() {
        return (EReference)getMarshalDefinition().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMarshalDefinition_Protobuf() {
        return (EReference)getMarshalDefinition().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMarshalDefinition_Rss() {
        return (EReference)getMarshalDefinition().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMarshalDefinition_SecureXML() {
        return (EReference)getMarshalDefinition().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMarshalDefinition_Serialization() {
        return (EReference)getMarshalDefinition().getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMarshalDefinition_Soapjaxb() {
        return (EReference)getMarshalDefinition().getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMarshalDefinition_String() {
        return (EReference)getMarshalDefinition().getEStructuralFeatures().get(16);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMarshalDefinition_Syslog() {
        return (EReference)getMarshalDefinition().getEStructuralFeatures().get(17);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMarshalDefinition_TidyMarkup() {
        return (EReference)getMarshalDefinition().getEStructuralFeatures().get(18);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMarshalDefinition_XmlBeans() {
        return (EReference)getMarshalDefinition().getEStructuralFeatures().get(19);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMarshalDefinition_Xstream() {
        return (EReference)getMarshalDefinition().getEStructuralFeatures().get(20);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMarshalDefinition_Pgp() {
        return (EReference)getMarshalDefinition().getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMarshalDefinition_Zip() {
        return (EReference)getMarshalDefinition().getEStructuralFeatures().get(22);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMarshalDefinition_Ref() {
        return (EAttribute)getMarshalDefinition().getEStructuralFeatures().get(23);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMarshalDefinition_AnyAttribute2() {
        return (EAttribute)getMarshalDefinition().getEStructuralFeatures().get(24);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMethodCallExpression() {
        if (methodCallExpressionEClass == null) {
            methodCallExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(103);
        }
        return methodCallExpressionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMethodCallExpression_Bean() {
        return (EAttribute)getMethodCallExpression().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMethodCallExpression_BeanType() {
        return (EAttribute)getMethodCallExpression().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMethodCallExpression_Method() {
        return (EAttribute)getMethodCallExpression().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMethodCallExpression_Ref() {
        return (EAttribute)getMethodCallExpression().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getModelHelper() {
        if (modelHelperEClass == null) {
            modelHelperEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(104);
        }
        return modelHelperEClass;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMulticastDefinition() {
        if (multicastDefinitionEClass == null) {
            multicastDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(105);
        }
        return multicastDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMulticastDefinition_ExecutorServiceRef() {
        return (EAttribute)getMulticastDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMulticastDefinition_OnPrepareRef() {
        return (EAttribute)getMulticastDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMulticastDefinition_ParallelProcessing() {
        return (EAttribute)getMulticastDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMulticastDefinition_ShareUnitOfWork() {
        return (EAttribute)getMulticastDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMulticastDefinition_StopOnException() {
        return (EAttribute)getMulticastDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMulticastDefinition_StrategyRef() {
        return (EAttribute)getMulticastDefinition().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMulticastDefinition_Streaming() {
        return (EAttribute)getMulticastDefinition().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMulticastDefinition_Timeout() {
        return (EAttribute)getMulticastDefinition().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMulticastDefinition_AnyAttribute2() {
        return (EAttribute)getMulticastDefinition().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMvelExpression() {
        if (mvelExpressionEClass == null) {
            mvelExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(106);
        }
        return mvelExpressionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getNamespaceAwareExpression() {
        if (namespaceAwareExpressionEClass == null) {
            namespaceAwareExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(107);
        }
        return namespaceAwareExpressionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getNodeFactory() {
        if (nodeFactoryEClass == null) {
            nodeFactoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(108);
        }
        return nodeFactoryEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getNoOutputDefinition() {
        if (noOutputDefinitionEClass == null) {
            noOutputDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(109);
        }
        return noOutputDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getNoOutputDefinition_AnyAttribute1() {
        return (EAttribute)getNoOutputDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getNoOutputExpressionNode() {
        if (noOutputExpressionNodeEClass == null) {
            noOutputExpressionNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(110);
        }
        return noOutputExpressionNodeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getNoOutputExpressionNode_AnyAttribute2() {
        return (EAttribute)getNoOutputExpressionNode().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getOgnlExpression() {
        if (ognlExpressionEClass == null) {
            ognlExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(111);
        }
        return ognlExpressionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getOmitFieldEntry() {
        if (omitFieldEntryEClass == null) {
            omitFieldEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(112);
        }
        return omitFieldEntryEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOmitFieldEntry_Field() {
        return (EAttribute)getOmitFieldEntry().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOmitFieldEntry_Class() {
        return (EAttribute)getOmitFieldEntry().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getOmitFieldList() {
        if (omitFieldListEClass == null) {
            omitFieldListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(113);
        }
        return omitFieldListEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOmitFieldList_OmitField() {
        return (EReference)getOmitFieldList().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getOnCompletionDefinition() {
        if (onCompletionDefinitionEClass == null) {
            onCompletionDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(114);
        }
        return onCompletionDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_OnWhen() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOnCompletionDefinition_Group() {
        return (EAttribute)getOnCompletionDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Aop() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Aggregate() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Bean() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_DoCatch() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_When() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Choice() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Otherwise() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_ConvertBodyTo() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Delay() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_DynamicRouter() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Enrich() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Filter() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_DoFinally() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_IdempotentConsumer() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_InOnly() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(16);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_InOut() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(17);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Intercept() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(18);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_InterceptFrom() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(19);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_InterceptToEndpoint() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(20);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_LoadBalance() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(21);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Log() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(22);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Loop() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(23);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Marshal() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(24);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Multicast() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(25);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_OnCompletion() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(26);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_OnException() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(27);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Pipeline() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(28);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Policy() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(29);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_PollEnrich() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(30);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Process() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(31);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_RecipientList() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(32);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_RemoveHeader() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(33);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_RemoveHeaders() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(34);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_RemoveProperty() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(35);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Resequence() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(36);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Rollback() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(37);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Route() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(38);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_RoutingSlip() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(39);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Sample() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(40);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_SetBody() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(41);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_SetExchangePattern() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(42);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_SetFaultBody() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(43);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_SetHeader() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(44);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_SetOutHeader() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(45);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_SetProperty() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(46);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Sort() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(47);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Split() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(48);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Stop() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(49);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Threads() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(50);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Throttle() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(51);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_ThrowException() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(52);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_To() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(53);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Transacted() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(54);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Transform() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(55);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_DoTry() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(56);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Unmarshal() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(57);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_Validate() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(58);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnCompletionDefinition_WireTap() {
        return (EReference)getOnCompletionDefinition().getEStructuralFeatures().get(59);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOnCompletionDefinition_ExecutorServiceRef() {
        return (EAttribute)getOnCompletionDefinition().getEStructuralFeatures().get(60);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOnCompletionDefinition_OnCompleteOnly() {
        return (EAttribute)getOnCompletionDefinition().getEStructuralFeatures().get(61);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOnCompletionDefinition_OnFailureOnly() {
        return (EAttribute)getOnCompletionDefinition().getEStructuralFeatures().get(62);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOnCompletionDefinition_UseOriginalMessage() {
        return (EAttribute)getOnCompletionDefinition().getEStructuralFeatures().get(63);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOnCompletionDefinition_AnyAttribute1() {
        return (EAttribute)getOnCompletionDefinition().getEStructuralFeatures().get(64);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getOnExceptionDefinition() {
        if (onExceptionDefinitionEClass == null) {
            onExceptionDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(115);
        }
        return onExceptionDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOnExceptionDefinition_Exception() {
        return (EAttribute)getOnExceptionDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_OnWhen() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_RetryWhile() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_RedeliveryPolicy() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Handled() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Continued() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOnExceptionDefinition_Group() {
        return (EAttribute)getOnExceptionDefinition().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Aop() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Aggregate() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Bean() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_DoCatch() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_When() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Choice() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Otherwise() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_ConvertBodyTo() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Delay() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_DynamicRouter() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(16);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Enrich() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(17);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Filter() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(18);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_DoFinally() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(19);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_IdempotentConsumer() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(20);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_InOnly() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(21);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_InOut() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(22);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Intercept() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(23);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_InterceptFrom() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(24);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_InterceptToEndpoint() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(25);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_LoadBalance() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(26);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Log() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(27);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Loop() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(28);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Marshal() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(29);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Multicast() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(30);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_OnCompletion() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(31);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_OnException() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(32);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Pipeline() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(33);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Policy() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(34);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_PollEnrich() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(35);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Process() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(36);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_RecipientList() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(37);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_RemoveHeader() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(38);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_RemoveHeaders() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(39);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_RemoveProperty() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(40);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Resequence() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(41);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Rollback() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(42);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Route() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(43);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_RoutingSlip() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(44);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Sample() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(45);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_SetBody() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(46);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_SetExchangePattern() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(47);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_SetFaultBody() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(48);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_SetHeader() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(49);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_SetOutHeader() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(50);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_SetProperty() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(51);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Sort() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(52);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Split() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(53);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Stop() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(54);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Threads() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(55);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Throttle() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(56);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_ThrowException() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(57);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_To() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(58);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Transacted() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(59);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Transform() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(60);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_DoTry() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(61);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Unmarshal() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(62);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_Validate() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(63);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOnExceptionDefinition_WireTap() {
        return (EReference)getOnExceptionDefinition().getEStructuralFeatures().get(64);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOnExceptionDefinition_OnRedeliveryRef() {
        return (EAttribute)getOnExceptionDefinition().getEStructuralFeatures().get(65);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOnExceptionDefinition_RedeliveryPolicyRef() {
        return (EAttribute)getOnExceptionDefinition().getEStructuralFeatures().get(66);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOnExceptionDefinition_UseOriginalMessage() {
        return (EAttribute)getOnExceptionDefinition().getEStructuralFeatures().get(67);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOnExceptionDefinition_AnyAttribute1() {
        return (EAttribute)getOnExceptionDefinition().getEStructuralFeatures().get(68);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getOptionalIdentifiedDefinition() {
        if (optionalIdentifiedDefinitionEClass == null) {
            optionalIdentifiedDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(116);
        }
        return optionalIdentifiedDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOptionalIdentifiedDefinition_Description() {
        return (EReference)getOptionalIdentifiedDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOptionalIdentifiedDefinition_Id() {
        return (EAttribute)getOptionalIdentifiedDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getOtherwiseDefinition() {
        if (otherwiseDefinitionEClass == null) {
            otherwiseDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(117);
        }
        return otherwiseDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOtherwiseDefinition_AnyAttribute2() {
        return (EAttribute)getOtherwiseDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getOutput() {
        if (outputEClass == null) {
            outputEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(118);
        }
        return outputEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOutput_Group() {
        return (EAttribute)getOutput().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Aop() {
        return (EReference)getOutput().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Aggregate() {
        return (EReference)getOutput().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Bean() {
        return (EReference)getOutput().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_DoCatch() {
        return (EReference)getOutput().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_When() {
        return (EReference)getOutput().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Choice() {
        return (EReference)getOutput().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Otherwise() {
        return (EReference)getOutput().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_ConvertBodyTo() {
        return (EReference)getOutput().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Delay() {
        return (EReference)getOutput().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_DynamicRouter() {
        return (EReference)getOutput().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Enrich() {
        return (EReference)getOutput().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Filter() {
        return (EReference)getOutput().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_DoFinally() {
        return (EReference)getOutput().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_IdempotentConsumer() {
        return (EReference)getOutput().getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_InOnly() {
        return (EReference)getOutput().getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_InOut() {
        return (EReference)getOutput().getEStructuralFeatures().get(16);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Intercept() {
        return (EReference)getOutput().getEStructuralFeatures().get(17);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_InterceptFrom() {
        return (EReference)getOutput().getEStructuralFeatures().get(18);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_InterceptToEndpoint() {
        return (EReference)getOutput().getEStructuralFeatures().get(19);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_LoadBalance() {
        return (EReference)getOutput().getEStructuralFeatures().get(20);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Log() {
        return (EReference)getOutput().getEStructuralFeatures().get(21);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Loop() {
        return (EReference)getOutput().getEStructuralFeatures().get(22);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Marshal() {
        return (EReference)getOutput().getEStructuralFeatures().get(23);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Multicast() {
        return (EReference)getOutput().getEStructuralFeatures().get(24);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_OnCompletion() {
        return (EReference)getOutput().getEStructuralFeatures().get(25);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_OnException() {
        return (EReference)getOutput().getEStructuralFeatures().get(26);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Pipeline() {
        return (EReference)getOutput().getEStructuralFeatures().get(27);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Policy() {
        return (EReference)getOutput().getEStructuralFeatures().get(28);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_PollEnrich() {
        return (EReference)getOutput().getEStructuralFeatures().get(29);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Process() {
        return (EReference)getOutput().getEStructuralFeatures().get(30);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_RecipientList() {
        return (EReference)getOutput().getEStructuralFeatures().get(31);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_RemoveHeader() {
        return (EReference)getOutput().getEStructuralFeatures().get(32);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_RemoveHeaders() {
        return (EReference)getOutput().getEStructuralFeatures().get(33);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_RemoveProperty() {
        return (EReference)getOutput().getEStructuralFeatures().get(34);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Resequence() {
        return (EReference)getOutput().getEStructuralFeatures().get(35);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Rollback() {
        return (EReference)getOutput().getEStructuralFeatures().get(36);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Route() {
        return (EReference)getOutput().getEStructuralFeatures().get(37);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_RoutingSlip() {
        return (EReference)getOutput().getEStructuralFeatures().get(38);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Sample() {
        return (EReference)getOutput().getEStructuralFeatures().get(39);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_SetBody() {
        return (EReference)getOutput().getEStructuralFeatures().get(40);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_SetExchangePattern() {
        return (EReference)getOutput().getEStructuralFeatures().get(41);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_SetFaultBody() {
        return (EReference)getOutput().getEStructuralFeatures().get(42);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_SetHeader() {
        return (EReference)getOutput().getEStructuralFeatures().get(43);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_SetOutHeader() {
        return (EReference)getOutput().getEStructuralFeatures().get(44);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_SetProperty() {
        return (EReference)getOutput().getEStructuralFeatures().get(45);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Sort() {
        return (EReference)getOutput().getEStructuralFeatures().get(46);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Split() {
        return (EReference)getOutput().getEStructuralFeatures().get(47);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Stop() {
        return (EReference)getOutput().getEStructuralFeatures().get(48);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Threads() {
        return (EReference)getOutput().getEStructuralFeatures().get(49);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Throttle() {
        return (EReference)getOutput().getEStructuralFeatures().get(50);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_ThrowException() {
        return (EReference)getOutput().getEStructuralFeatures().get(51);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_To() {
        return (EReference)getOutput().getEStructuralFeatures().get(52);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Transacted() {
        return (EReference)getOutput().getEStructuralFeatures().get(53);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Transform() {
        return (EReference)getOutput().getEStructuralFeatures().get(54);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_DoTry() {
        return (EReference)getOutput().getEStructuralFeatures().get(55);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Unmarshal() {
        return (EReference)getOutput().getEStructuralFeatures().get(56);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_Validate() {
        return (EReference)getOutput().getEStructuralFeatures().get(57);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOutput_WireTap() {
        return (EReference)getOutput().getEStructuralFeatures().get(58);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOutput_AnyAttribute1() {
        return (EAttribute)getOutput().getEStructuralFeatures().get(59);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPackageScanDefinition() {
        if (packageScanDefinitionEClass == null) {
            packageScanDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(119);
        }
        return packageScanDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPackageScanDefinition_Package() {
        return (EAttribute)getPackageScanDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPackageScanDefinition_Excludes() {
        return (EAttribute)getPackageScanDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPackageScanDefinition_Includes() {
        return (EAttribute)getPackageScanDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPhpExpression() {
        if (phpExpressionEClass == null) {
            phpExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(122);
        }
        return phpExpressionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPipelineDefinition() {
        if (pipelineDefinitionEClass == null) {
            pipelineDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(123);
        }
        return pipelineDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPipelineDefinition_AnyAttribute2() {
        return (EAttribute)getPipelineDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPgpDataFormat() {
        if (pgpDataFormatEClass == null) {
            pgpDataFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(124);
        }
        return pgpDataFormatEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPgpDataFormat_Armored() {
        return (EAttribute)getPgpDataFormat().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPgpDataFormat_Integrity() {
        return (EAttribute)getPgpDataFormat().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPgpDataFormat_KeyFileName() {
        return (EAttribute)getPgpDataFormat().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPgpDataFormat_KeyUserid() {
        return (EAttribute)getPgpDataFormat().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPgpDataFormat_Password() {
        return (EAttribute)getPgpDataFormat().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPolicyDefinition() {
        if (policyDefinitionEClass == null) {
            policyDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(125);
        }
        return policyDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPolicyDefinition_Ref() {
        return (EAttribute)getPolicyDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPolicyDefinition_AnyAttribute2() {
        return (EAttribute)getPolicyDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPollEnrichDefinition() {
        if (pollEnrichDefinitionEClass == null) {
            pollEnrichDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(126);
        }
        return pollEnrichDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPollEnrichDefinition_Ref() {
        return (EAttribute)getPollEnrichDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPollEnrichDefinition_StrategyRef() {
        return (EAttribute)getPollEnrichDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPollEnrichDefinition_Timeout() {
        return (EAttribute)getPollEnrichDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPollEnrichDefinition_Uri() {
        return (EAttribute)getPollEnrichDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPollEnrichDefinition_AnyAttribute2() {
        return (EAttribute)getPollEnrichDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getProcessDefinition() {
        if (processDefinitionEClass == null) {
            processDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(127);
        }
        return processDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getProcessDefinition_Ref() {
        return (EAttribute)getProcessDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getProcessDefinition_AnyAttribute2() {
        return (EAttribute)getProcessDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getProcessorDefinition() {
        if (processorDefinitionEClass == null) {
            processorDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(128);
        }
        return processorDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getProcessorDefinition_InheritErrorHandler() {
        return (EAttribute)getProcessorDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getProcessorDefinition_AnyAttribute() {
        return (EAttribute)getProcessorDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getProcessorDefinitionHelper() {
        if (processorDefinitionHelperEClass == null) {
            processorDefinitionHelperEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(129);
        }
        return processorDefinitionHelperEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPropertiesDefinition() {
        if (propertiesDefinitionEClass == null) {
            propertiesDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(130);
        }
        return propertiesDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getPropertiesDefinition_Property() {
        return (EReference)getPropertiesDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPropertyDefinition() {
        if (propertyDefinitionEClass == null) {
            propertyDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(131);
        }
        return propertyDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPropertyDefinition_Key() {
        return (EAttribute)getPropertyDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPropertyDefinition_Value() {
        return (EAttribute)getPropertyDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPropertyExpression() {
        if (propertyExpressionEClass == null) {
            propertyExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(132);
        }
        return propertyExpressionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getProtobufDataFormat() {
        if (protobufDataFormatEClass == null) {
            protobufDataFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(133);
        }
        return protobufDataFormatEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getProtobufDataFormat_InstanceClass() {
        return (EAttribute)getProtobufDataFormat().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPythonExpression() {
        if (pythonExpressionEClass == null) {
            pythonExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(134);
        }
        return pythonExpressionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getRandomLoadBalancerDefinition() {
        if (randomLoadBalancerDefinitionEClass == null) {
            randomLoadBalancerDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(135);
        }
        return randomLoadBalancerDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getRecipientListDefinition() {
        if (recipientListDefinitionEClass == null) {
            recipientListDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(136);
        }
        return recipientListDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRecipientListDefinition_Delimiter() {
        return (EAttribute)getRecipientListDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRecipientListDefinition_ExecutorServiceRef() {
        return (EAttribute)getRecipientListDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRecipientListDefinition_IgnoreInvalidEndpoints() {
        return (EAttribute)getRecipientListDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRecipientListDefinition_OnPrepareRef() {
        return (EAttribute)getRecipientListDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRecipientListDefinition_ParallelProcessing() {
        return (EAttribute)getRecipientListDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRecipientListDefinition_ShareUnitOfWork() {
        return (EAttribute)getRecipientListDefinition().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRecipientListDefinition_StopOnException() {
        return (EAttribute)getRecipientListDefinition().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRecipientListDefinition_StrategyRef() {
        return (EAttribute)getRecipientListDefinition().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRecipientListDefinition_Streaming() {
        return (EAttribute)getRecipientListDefinition().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRecipientListDefinition_Timeout() {
        return (EAttribute)getRecipientListDefinition().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRecipientListDefinition_AnyAttribute3() {
        return (EAttribute)getRecipientListDefinition().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getRedeliveryPolicyDefinition() {
        if (redeliveryPolicyDefinitionEClass == null) {
            redeliveryPolicyDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(137);
        }
        return redeliveryPolicyDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRedeliveryPolicyDefinition_AsyncDelayedRedelivery() {
        return (EAttribute)getRedeliveryPolicyDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRedeliveryPolicyDefinition_BackOffMultiplier() {
        return (EAttribute)getRedeliveryPolicyDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRedeliveryPolicyDefinition_CollisionAvoidanceFactor() {
        return (EAttribute)getRedeliveryPolicyDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRedeliveryPolicyDefinition_DelayPattern() {
        return (EAttribute)getRedeliveryPolicyDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRedeliveryPolicyDefinition_DisableRedelivery() {
        return (EAttribute)getRedeliveryPolicyDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRedeliveryPolicyDefinition_LogContinued() {
        return (EAttribute)getRedeliveryPolicyDefinition().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRedeliveryPolicyDefinition_LogExhausted() {
        return (EAttribute)getRedeliveryPolicyDefinition().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRedeliveryPolicyDefinition_LogHandled() {
        return (EAttribute)getRedeliveryPolicyDefinition().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRedeliveryPolicyDefinition_LogRetryAttempted() {
        return (EAttribute)getRedeliveryPolicyDefinition().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRedeliveryPolicyDefinition_LogRetryStackTrace() {
        return (EAttribute)getRedeliveryPolicyDefinition().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRedeliveryPolicyDefinition_LogStackTrace() {
        return (EAttribute)getRedeliveryPolicyDefinition().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRedeliveryPolicyDefinition_MaximumRedeliveries() {
        return (EAttribute)getRedeliveryPolicyDefinition().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRedeliveryPolicyDefinition_MaximumRedeliveryDelay() {
        return (EAttribute)getRedeliveryPolicyDefinition().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRedeliveryPolicyDefinition_RedeliveryDelay() {
        return (EAttribute)getRedeliveryPolicyDefinition().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRedeliveryPolicyDefinition_RetriesExhaustedLogLevel() {
        return (EAttribute)getRedeliveryPolicyDefinition().getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRedeliveryPolicyDefinition_RetryAttemptedLogLevel() {
        return (EAttribute)getRedeliveryPolicyDefinition().getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRedeliveryPolicyDefinition_UseCollisionAvoidance() {
        return (EAttribute)getRedeliveryPolicyDefinition().getEStructuralFeatures().get(16);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRedeliveryPolicyDefinition_UseExponentialBackOff() {
        return (EAttribute)getRedeliveryPolicyDefinition().getEStructuralFeatures().get(17);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getRefExpression() {
        if (refExpressionEClass == null) {
            refExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(138);
        }
        return refExpressionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getRemoveHeaderDefinition() {
        if (removeHeaderDefinitionEClass == null) {
            removeHeaderDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(139);
        }
        return removeHeaderDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRemoveHeaderDefinition_HeaderName() {
        return (EAttribute)getRemoveHeaderDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRemoveHeaderDefinition_AnyAttribute2() {
        return (EAttribute)getRemoveHeaderDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getRemoveHeadersDefinition() {
        if (removeHeadersDefinitionEClass == null) {
            removeHeadersDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(140);
        }
        return removeHeadersDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRemoveHeadersDefinition_ExcludePattern() {
        return (EAttribute)getRemoveHeadersDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRemoveHeadersDefinition_Pattern() {
        return (EAttribute)getRemoveHeadersDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRemoveHeadersDefinition_AnyAttribute2() {
        return (EAttribute)getRemoveHeadersDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getRemovePropertyDefinition() {
        if (removePropertyDefinitionEClass == null) {
            removePropertyDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(141);
        }
        return removePropertyDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRemovePropertyDefinition_PropertyName() {
        return (EAttribute)getRemovePropertyDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRemovePropertyDefinition_AnyAttribute2() {
        return (EAttribute)getRemovePropertyDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getResequenceDefinition() {
        if (resequenceDefinitionEClass == null) {
            resequenceDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(142);
        }
        return resequenceDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_BatchConfig() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_StreamConfig() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_ExpressionDefinition() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Constant() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_El() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Groovy() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Header() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Jxpath() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_JavaScript() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Language() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Method() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Mvel() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Ognl() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Php() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Property() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Python() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Ref() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(16);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Ruby() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(17);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Simple() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(18);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Spel() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(19);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Sql() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(20);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Tokenize() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(21);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Xpath() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(22);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Xquery() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(23);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResequenceDefinition_Group() {
        return (EAttribute)getResequenceDefinition().getEStructuralFeatures().get(24);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Aop() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(25);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Aggregate() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(26);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Bean() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(27);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_DoCatch() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(28);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_When() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(29);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Choice() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(30);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Otherwise() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(31);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_ConvertBodyTo() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(32);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Delay() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(33);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_DynamicRouter() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(34);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Enrich() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(35);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Filter() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(36);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_DoFinally() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(37);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_IdempotentConsumer() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(38);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_InOnly() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(39);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_InOut() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(40);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Intercept() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(41);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_InterceptFrom() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(42);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_InterceptToEndpoint() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(43);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_LoadBalance() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(44);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Log() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(45);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Loop() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(46);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Marshal() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(47);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Multicast() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(48);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_OnCompletion() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(49);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_OnException() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(50);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Pipeline() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(51);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Policy() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(52);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_PollEnrich() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(53);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Process() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(54);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_RecipientList() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(55);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_RemoveHeader() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(56);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_RemoveHeaders() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(57);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_RemoveProperty() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(58);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Resequence() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(59);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Rollback() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(60);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Route() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(61);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_RoutingSlip() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(62);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Sample() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(63);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_SetBody() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(64);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_SetExchangePattern() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(65);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_SetFaultBody() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(66);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_SetHeader() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(67);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_SetOutHeader() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(68);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_SetProperty() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(69);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Sort() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(70);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Split() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(71);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Stop() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(72);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Threads() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(73);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Throttle() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(74);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_ThrowException() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(75);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_To() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(76);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Transacted() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(77);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Transform() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(78);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_DoTry() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(79);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Unmarshal() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(80);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_Validate() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(81);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getResequenceDefinition_WireTap() {
        return (EReference)getResequenceDefinition().getEStructuralFeatures().get(82);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResequenceDefinition_AnyAttribute1() {
        return (EAttribute)getResequenceDefinition().getEStructuralFeatures().get(83);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getResequencerConfig() {
        if (resequencerConfigEClass == null) {
            resequencerConfigEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(143);
        }
        return resequencerConfigEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getRollbackDefinition() {
        if (rollbackDefinitionEClass == null) {
            rollbackDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(144);
        }
        return rollbackDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRollbackDefinition_MarkRollbackOnly() {
        return (EAttribute)getRollbackDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRollbackDefinition_MarkRollbackOnlyLast() {
        return (EAttribute)getRollbackDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRollbackDefinition_Message() {
        return (EAttribute)getRollbackDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRollbackDefinition_AnyAttribute2() {
        return (EAttribute)getRollbackDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getRoundRobinLoadBalancerDefinition() {
        if (roundRobinLoadBalancerDefinitionEClass == null) {
            roundRobinLoadBalancerDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(145);
        }
        return roundRobinLoadBalancerDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getRouteBuilderDefinition() {
        if (routeBuilderDefinitionEClass == null) {
            routeBuilderDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(146);
        }
        return routeBuilderDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRouteBuilderDefinition_Ref() {
        return (EAttribute)getRouteBuilderDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getRouteContextRefDefinition() {
        if (routeContextRefDefinitionEClass == null) {
            routeContextRefDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(147);
        }
        return routeContextRefDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRouteContextRefDefinition_Ref() {
        return (EAttribute)getRouteContextRefDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getRouteDefinition() {
        if (routeDefinitionEClass == null) {
            routeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(148);
        }
        return routeDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_From() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRouteDefinition_Group() {
        return (EAttribute)getRouteDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Aop() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Aggregate() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Bean() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_DoCatch() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_When() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Choice() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Otherwise() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_ConvertBodyTo() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Delay() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_DynamicRouter() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Enrich() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Filter() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_DoFinally() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_IdempotentConsumer() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_InOnly() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(16);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_InOut() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(17);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Intercept() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(18);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_InterceptFrom() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(19);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_InterceptToEndpoint() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(20);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_LoadBalance() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(21);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Log() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(22);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Loop() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(23);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Marshal() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(24);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Multicast() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(25);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_OnCompletion() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(26);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_OnException() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(27);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Pipeline() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(28);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Policy() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(29);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_PollEnrich() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(30);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Process() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(31);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_RecipientList() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(32);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_RemoveHeader() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(33);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_RemoveHeaders() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(34);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_RemoveProperty() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(35);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Resequence() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(36);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Rollback() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(37);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Route() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(38);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_RoutingSlip() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(39);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Sample() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(40);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_SetBody() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(41);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_SetExchangePattern() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(42);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_SetFaultBody() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(43);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_SetHeader() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(44);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_SetOutHeader() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(45);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_SetProperty() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(46);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Sort() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(47);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Split() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(48);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Stop() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(49);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Threads() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(50);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Throttle() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(51);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_ThrowException() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(52);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_To() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(53);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Transacted() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(54);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Transform() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(55);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_DoTry() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(56);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Unmarshal() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(57);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_Validate() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(58);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRouteDefinition_WireTap() {
        return (EReference)getRouteDefinition().getEStructuralFeatures().get(59);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRouteDefinition_AutoStartup() {
        return (EAttribute)getRouteDefinition().getEStructuralFeatures().get(60);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRouteDefinition_Delayer() {
        return (EAttribute)getRouteDefinition().getEStructuralFeatures().get(61);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRouteDefinition_ErrorHandlerRef() {
        return (EAttribute)getRouteDefinition().getEStructuralFeatures().get(62);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRouteDefinition_Group1() {
        return (EAttribute)getRouteDefinition().getEStructuralFeatures().get(63);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRouteDefinition_HandleFault() {
        return (EAttribute)getRouteDefinition().getEStructuralFeatures().get(64);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRouteDefinition_RoutePolicyRef() {
        return (EAttribute)getRouteDefinition().getEStructuralFeatures().get(65);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRouteDefinition_ShutdownRoute() {
        return (EAttribute)getRouteDefinition().getEStructuralFeatures().get(66);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRouteDefinition_ShutdownRunningTask() {
        return (EAttribute)getRouteDefinition().getEStructuralFeatures().get(67);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRouteDefinition_StartupOrder() {
        return (EAttribute)getRouteDefinition().getEStructuralFeatures().get(68);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRouteDefinition_StreamCache() {
        return (EAttribute)getRouteDefinition().getEStructuralFeatures().get(69);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRouteDefinition_Trace() {
        return (EAttribute)getRouteDefinition().getEStructuralFeatures().get(70);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRouteDefinition_AnyAttribute1() {
        return (EAttribute)getRouteDefinition().getEStructuralFeatures().get(71);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getRouteDefinitionHelper() {
        if (routeDefinitionHelperEClass == null) {
            routeDefinitionHelperEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(149);
        }
        return routeDefinitionHelperEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getRoutesDefinition() {
        if (routesDefinitionEClass == null) {
            routesDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(150);
        }
        return routesDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRoutesDefinition_Route() {
        return (EReference)getRoutesDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getRoutingSlipDefinition() {
        if (routingSlipDefinitionEClass == null) {
            routingSlipDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(151);
        }
        return routingSlipDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRoutingSlipDefinition_IgnoreInvalidEndpoints() {
        return (EAttribute)getRoutingSlipDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRoutingSlipDefinition_UriDelimiter() {
        return (EAttribute)getRoutingSlipDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRoutingSlipDefinition_AnyAttribute3() {
        return (EAttribute)getRoutingSlipDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getRssDataFormat() {
        if (rssDataFormatEClass == null) {
            rssDataFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(152);
        }
        return rssDataFormatEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getRubyExpression() {
        if (rubyExpressionEClass == null) {
            rubyExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(153);
        }
        return rubyExpressionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSamplingDefinition() {
        if (samplingDefinitionEClass == null) {
            samplingDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(154);
        }
        return samplingDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSamplingDefinition_MessageFrequency() {
        return (EAttribute)getSamplingDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSamplingDefinition_SamplePeriod() {
        return (EAttribute)getSamplingDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSamplingDefinition_Units() {
        return (EAttribute)getSamplingDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSamplingDefinition_AnyAttribute2() {
        return (EAttribute)getSamplingDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSecureRandomParametersFactoryBean() {
        if (secureRandomParametersFactoryBeanEClass == null) {
            secureRandomParametersFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(155);
        }
        return secureRandomParametersFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSecureSocketProtocolsParameters() {
        if (secureSocketProtocolsParametersEClass == null) {
            secureSocketProtocolsParametersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(156);
        }
        return secureSocketProtocolsParametersEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSecureSocketProtocolsParameters_SecureSocketProtocol() {
        return (EAttribute)getSecureSocketProtocolsParameters().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSendDefinition() {
        if (sendDefinitionEClass == null) {
            sendDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(157);
        }
        return sendDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSendDefinition_Ref() {
        return (EAttribute)getSendDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSendDefinition_Uri() {
        return (EAttribute)getSendDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSendDefinition_AnyAttribute2() {
        return (EAttribute)getSendDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSerializationDataFormat() {
        if (serializationDataFormatEClass == null) {
            serializationDataFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(158);
        }
        return serializationDataFormatEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSetBodyDefinition() {
        if (setBodyDefinitionEClass == null) {
            setBodyDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(159);
        }
        return setBodyDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSetBodyDefinition_AnyAttribute3() {
        return (EAttribute)getSetBodyDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSetExchangePatternDefinition() {
        if (setExchangePatternDefinitionEClass == null) {
            setExchangePatternDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(160);
        }
        return setExchangePatternDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSetExchangePatternDefinition_Pattern() {
        return (EAttribute)getSetExchangePatternDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSetExchangePatternDefinition_AnyAttribute2() {
        return (EAttribute)getSetExchangePatternDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSetFaultBodyDefinition() {
        if (setFaultBodyDefinitionEClass == null) {
            setFaultBodyDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(161);
        }
        return setFaultBodyDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSetFaultBodyDefinition_AnyAttribute3() {
        return (EAttribute)getSetFaultBodyDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSetHeaderDefinition() {
        if (setHeaderDefinitionEClass == null) {
            setHeaderDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(162);
        }
        return setHeaderDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSetHeaderDefinition_HeaderName() {
        return (EAttribute)getSetHeaderDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSetHeaderDefinition_AnyAttribute3() {
        return (EAttribute)getSetHeaderDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSetOutHeaderDefinition() {
        if (setOutHeaderDefinitionEClass == null) {
            setOutHeaderDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(163);
        }
        return setOutHeaderDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSetOutHeaderDefinition_HeaderName() {
        return (EAttribute)getSetOutHeaderDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSetOutHeaderDefinition_AnyAttribute3() {
        return (EAttribute)getSetOutHeaderDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSetPropertyDefinition() {
        if (setPropertyDefinitionEClass == null) {
            setPropertyDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(164);
        }
        return setPropertyDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSetPropertyDefinition_PropertyName() {
        return (EAttribute)getSetPropertyDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSetPropertyDefinition_AnyAttribute3() {
        return (EAttribute)getSetPropertyDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSimpleExpression() {
        if (simpleExpressionEClass == null) {
            simpleExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(169);
        }
        return simpleExpressionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSimpleExpression_ResultType() {
        return (EAttribute)getSimpleExpression().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSoapJaxbDataFormat() {
        if (soapJaxbDataFormatEClass == null) {
            soapJaxbDataFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(170);
        }
        return soapJaxbDataFormatEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSoapJaxbDataFormat_ContextPath() {
        return (EAttribute)getSoapJaxbDataFormat().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSoapJaxbDataFormat_ElementNameStrategyRef() {
        return (EAttribute)getSoapJaxbDataFormat().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSoapJaxbDataFormat_Encoding() {
        return (EAttribute)getSoapJaxbDataFormat().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSortDefinition() {
        if (sortDefinitionEClass == null) {
            sortDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(171);
        }
        return sortDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSortDefinition_ComparatorRef() {
        return (EAttribute)getSortDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSortDefinition_AnyAttribute3() {
        return (EAttribute)getSortDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSpELExpression() {
        if (spELExpressionEClass == null) {
            spELExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(172);
        }
        return spELExpressionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSplitDefinition() {
        if (splitDefinitionEClass == null) {
            splitDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(173);
        }
        return splitDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSplitDefinition_ExecutorServiceRef() {
        return (EAttribute)getSplitDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSplitDefinition_OnPrepareRef() {
        return (EAttribute)getSplitDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSplitDefinition_ParallelProcessing() {
        return (EAttribute)getSplitDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSplitDefinition_ShareUnitOfWork() {
        return (EAttribute)getSplitDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSplitDefinition_StopOnException() {
        return (EAttribute)getSplitDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSplitDefinition_StrategyRef() {
        return (EAttribute)getSplitDefinition().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSplitDefinition_Streaming() {
        return (EAttribute)getSplitDefinition().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSplitDefinition_Timeout() {
        return (EAttribute)getSplitDefinition().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSplitDefinition_AnyAttribute2() {
        return (EAttribute)getSplitDefinition().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSqlExpression() {
        if (sqlExpressionEClass == null) {
            sqlExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(174);
        }
        return sqlExpressionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSslContextClientParametersFactoryBean() {
        if (sslContextClientParametersFactoryBeanEClass == null) {
            sslContextClientParametersFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(175);
        }
        return sslContextClientParametersFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSslContextClientParametersFactoryBean_CipherSuites() {
        return (EReference)getSslContextClientParametersFactoryBean().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSslContextClientParametersFactoryBean_CipherSuitesFilter() {
        return (EReference)getSslContextClientParametersFactoryBean().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSslContextClientParametersFactoryBean_SecureSocketProtocols() {
        return (EReference)getSslContextClientParametersFactoryBean().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSslContextClientParametersFactoryBean_SecureSocketProtocolsFilter() {
        return (EReference)getSslContextClientParametersFactoryBean().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSslContextClientParametersFactoryBean_SessionTimeout() {
        return (EAttribute)getSslContextClientParametersFactoryBean().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSslContextParametersFactoryBean() {
        if (sslContextParametersFactoryBeanEClass == null) {
            sslContextParametersFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(176);
        }
        return sslContextParametersFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSslContextParametersFactoryBean_CipherSuites() {
        return (EReference)getSslContextParametersFactoryBean().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSslContextParametersFactoryBean_CipherSuitesFilter() {
        return (EReference)getSslContextParametersFactoryBean().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSslContextParametersFactoryBean_SecureSocketProtocols() {
        return (EReference)getSslContextParametersFactoryBean().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSslContextParametersFactoryBean_SecureSocketProtocolsFilter() {
        return (EReference)getSslContextParametersFactoryBean().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSslContextParametersFactoryBean_KeyManagers() {
        return (EReference)getSslContextParametersFactoryBean().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSslContextParametersFactoryBean_TrustManagers() {
        return (EReference)getSslContextParametersFactoryBean().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSslContextParametersFactoryBean_SecureRandom() {
        return (EReference)getSslContextParametersFactoryBean().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSslContextParametersFactoryBean_ClientParameters() {
        return (EReference)getSslContextParametersFactoryBean().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSslContextParametersFactoryBean_ServerParameters() {
        return (EReference)getSslContextParametersFactoryBean().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSslContextParametersFactoryBean_Provider() {
        return (EAttribute)getSslContextParametersFactoryBean().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSslContextParametersFactoryBean_SecureSocketProtocol() {
        return (EAttribute)getSslContextParametersFactoryBean().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSslContextParametersFactoryBean_SessionTimeout() {
        return (EAttribute)getSslContextParametersFactoryBean().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSslContextServerParametersFactoryBean() {
        if (sslContextServerParametersFactoryBeanEClass == null) {
            sslContextServerParametersFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(177);
        }
        return sslContextServerParametersFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSslContextServerParametersFactoryBean_CipherSuites() {
        return (EReference)getSslContextServerParametersFactoryBean().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSslContextServerParametersFactoryBean_CipherSuitesFilter() {
        return (EReference)getSslContextServerParametersFactoryBean().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSslContextServerParametersFactoryBean_SecureSocketProtocols() {
        return (EReference)getSslContextServerParametersFactoryBean().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSslContextServerParametersFactoryBean_SecureSocketProtocolsFilter() {
        return (EReference)getSslContextServerParametersFactoryBean().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSslContextServerParametersFactoryBean_ClientAuthentication() {
        return (EAttribute)getSslContextServerParametersFactoryBean().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSslContextServerParametersFactoryBean_SessionTimeout() {
        return (EAttribute)getSslContextServerParametersFactoryBean().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getStickyLoadBalancerDefinition() {
        if (stickyLoadBalancerDefinitionEClass == null) {
            stickyLoadBalancerDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(178);
        }
        return stickyLoadBalancerDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getStickyLoadBalancerDefinition_CorrelationExpression() {
        return (EReference)getStickyLoadBalancerDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getStopDefinition() {
        if (stopDefinitionEClass == null) {
            stopDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(179);
        }
        return stopDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getStopDefinition_AnyAttribute2() {
        return (EAttribute)getStopDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getStreamResequencerConfig() {
        if (streamResequencerConfigEClass == null) {
            streamResequencerConfigEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(180);
        }
        return streamResequencerConfigEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getStreamResequencerConfig_Capacity() {
        return (EAttribute)getStreamResequencerConfig().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStreamResequencerConfig_IgnoreInvalidExchanges() {
        return (EAttribute)getStreamResequencerConfig().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getStreamResequencerConfig_Timeout() {
        return (EAttribute)getStreamResequencerConfig().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getStringDataFormat() {
        if (stringDataFormatEClass == null) {
            stringDataFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(181);
        }
        return stringDataFormatEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getStringDataFormat_Charset() {
        return (EAttribute)getStringDataFormat().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSyslogDataFormat() {
        if (syslogDataFormatEClass == null) {
            syslogDataFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(182);
        }
        return syslogDataFormatEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getThreadPoolProfileDefinition() {
        if (threadPoolProfileDefinitionEClass == null) {
            threadPoolProfileDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(183);
        }
        return threadPoolProfileDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getThreadPoolProfileDefinition_TimeUnit() {
        return (EAttribute)getThreadPoolProfileDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getThreadPoolProfileDefinition_DefaultProfile() {
        return (EAttribute)getThreadPoolProfileDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getThreadPoolProfileDefinition_KeepAliveTime() {
        return (EAttribute)getThreadPoolProfileDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getThreadPoolProfileDefinition_MaxPoolSize() {
        return (EAttribute)getThreadPoolProfileDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getThreadPoolProfileDefinition_MaxQueueSize() {
        return (EAttribute)getThreadPoolProfileDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getThreadPoolProfileDefinition_PoolSize() {
        return (EAttribute)getThreadPoolProfileDefinition().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getThreadPoolProfileDefinition_RejectedPolicy() {
        return (EAttribute)getThreadPoolProfileDefinition().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getThreadsDefinition() {
        if (threadsDefinitionEClass == null) {
            threadsDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(186);
        }
        return threadsDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getThreadsDefinition_CallerRunsWhenRejected() {
        return (EAttribute)getThreadsDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getThreadsDefinition_ExecutorServiceRef() {
        return (EAttribute)getThreadsDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getThreadsDefinition_KeepAliveTime() {
        return (EAttribute)getThreadsDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getThreadsDefinition_MaxPoolSize() {
        return (EAttribute)getThreadsDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getThreadsDefinition_MaxQueueSize() {
        return (EAttribute)getThreadsDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getThreadsDefinition_PoolSize() {
        return (EAttribute)getThreadsDefinition().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getThreadsDefinition_RejectedPolicy() {
        return (EAttribute)getThreadsDefinition().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getThreadsDefinition_ThreadName() {
        return (EAttribute)getThreadsDefinition().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getThreadsDefinition_TimeUnit() {
        return (EAttribute)getThreadsDefinition().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getThreadsDefinition_AnyAttribute2() {
        return (EAttribute)getThreadsDefinition().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getThrottleDefinition() {
        if (throttleDefinitionEClass == null) {
            throttleDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(187);
        }
        return throttleDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getThrottleDefinition_AsyncDelayed() {
        return (EAttribute)getThrottleDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getThrottleDefinition_CallerRunsWhenRejected() {
        return (EAttribute)getThrottleDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getThrottleDefinition_ExecutorServiceRef() {
        return (EAttribute)getThrottleDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getThrottleDefinition_TimePeriodMillis() {
        return (EAttribute)getThrottleDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getThrottleDefinition_AnyAttribute2() {
        return (EAttribute)getThrottleDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getThrowExceptionDefinition() {
        if (throwExceptionDefinitionEClass == null) {
            throwExceptionDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(188);
        }
        return throwExceptionDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getThrowExceptionDefinition_Ref() {
        return (EAttribute)getThrowExceptionDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getThrowExceptionDefinition_AnyAttribute2() {
        return (EAttribute)getThrowExceptionDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTidyMarkupDataFormat() {
        if (tidyMarkupDataFormatEClass == null) {
            tidyMarkupDataFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(189);
        }
        return tidyMarkupDataFormatEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTidyMarkupDataFormat_DataObjectType() {
        return (EAttribute)getTidyMarkupDataFormat().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getToDefinition() {
        if (toDefinitionEClass == null) {
            toDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(190);
        }
        return toDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getToDefinition_Pattern() {
        return (EAttribute)getToDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getToDefinition_AnyAttribute3() {
        return (EAttribute)getToDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTokenizerExpression() {
        if (tokenizerExpressionEClass == null) {
            tokenizerExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(191);
        }
        return tokenizerExpressionEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTokenizerExpression_EndToken() {
        return (EAttribute)getTokenizerExpression().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTokenizerExpression_HeaderName() {
        return (EAttribute)getTokenizerExpression().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTokenizerExpression_IncludeTokens() {
        return (EAttribute)getTokenizerExpression().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTokenizerExpression_InheritNamespaceTagName() {
        return (EAttribute)getTokenizerExpression().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTokenizerExpression_Regex() {
        return (EAttribute)getTokenizerExpression().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTokenizerExpression_Token() {
        return (EAttribute)getTokenizerExpression().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTokenizerExpression_Xml() {
        return (EAttribute)getTokenizerExpression().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTopicLoadBalancerDefinition() {
        if (topicLoadBalancerDefinitionEClass == null) {
            topicLoadBalancerDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(192);
        }
        return topicLoadBalancerDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTransactedDefinition() {
        if (transactedDefinitionEClass == null) {
            transactedDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(193);
        }
        return transactedDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTransactedDefinition_Ref() {
        return (EAttribute)getTransactedDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTransactedDefinition_AnyAttribute2() {
        return (EAttribute)getTransactedDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTransformDefinition() {
        if (transformDefinitionEClass == null) {
            transformDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(194);
        }
        return transformDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTransformDefinition_AnyAttribute3() {
        return (EAttribute)getTransformDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTrustManagersParametersFactoryBean() {
        if (trustManagersParametersFactoryBeanEClass == null) {
            trustManagersParametersFactoryBeanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(195);
        }
        return trustManagersParametersFactoryBeanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getTrustManagersParametersFactoryBean_KeyStore() {
        return (EReference)getTrustManagersParametersFactoryBean().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTryDefinition() {
        if (tryDefinitionEClass == null) {
            tryDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(196);
        }
        return tryDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTryDefinition_AnyAttribute2() {
        return (EAttribute)getTryDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getUnmarshalDefinition() {
        if (unmarshalDefinitionEClass == null) {
            unmarshalDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(197);
        }
        return unmarshalDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUnmarshalDefinition_Bindy() {
        return (EReference)getUnmarshalDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUnmarshalDefinition_Castor() {
        return (EReference)getUnmarshalDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUnmarshalDefinition_Crypto() {
        return (EReference)getUnmarshalDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUnmarshalDefinition_Csv() {
        return (EReference)getUnmarshalDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUnmarshalDefinition_Custom() {
        return (EReference)getUnmarshalDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUnmarshalDefinition_Flatpack() {
        return (EReference)getUnmarshalDefinition().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUnmarshalDefinition_Gzip() {
        return (EReference)getUnmarshalDefinition().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUnmarshalDefinition_Hl7() {
        return (EReference)getUnmarshalDefinition().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUnmarshalDefinition_Jaxb() {
        return (EReference)getUnmarshalDefinition().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUnmarshalDefinition_Jibx() {
        return (EReference)getUnmarshalDefinition().getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUnmarshalDefinition_Json() {
        return (EReference)getUnmarshalDefinition().getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUnmarshalDefinition_Protobuf() {
        return (EReference)getUnmarshalDefinition().getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUnmarshalDefinition_Rss() {
        return (EReference)getUnmarshalDefinition().getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUnmarshalDefinition_SecureXML() {
        return (EReference)getUnmarshalDefinition().getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUnmarshalDefinition_Serialization() {
        return (EReference)getUnmarshalDefinition().getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUnmarshalDefinition_Soapjaxb() {
        return (EReference)getUnmarshalDefinition().getEStructuralFeatures().get(15);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUnmarshalDefinition_String() {
        return (EReference)getUnmarshalDefinition().getEStructuralFeatures().get(16);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUnmarshalDefinition_Syslog() {
        return (EReference)getUnmarshalDefinition().getEStructuralFeatures().get(17);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUnmarshalDefinition_TidyMarkup() {
        return (EReference)getUnmarshalDefinition().getEStructuralFeatures().get(18);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUnmarshalDefinition_XmlBeans() {
        return (EReference)getUnmarshalDefinition().getEStructuralFeatures().get(19);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUnmarshalDefinition_Xstream() {
        return (EReference)getUnmarshalDefinition().getEStructuralFeatures().get(20);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUnmarshalDefinition_Pgp() {
        return (EReference)getUnmarshalDefinition().getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUnmarshalDefinition_Zip() {
        return (EReference)getUnmarshalDefinition().getEStructuralFeatures().get(22);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getUnmarshalDefinition_Ref() {
        return (EAttribute)getUnmarshalDefinition().getEStructuralFeatures().get(23);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getUnmarshalDefinition_AnyAttribute2() {
        return (EAttribute)getUnmarshalDefinition().getEStructuralFeatures().get(24);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getValidateDefinition() {
        if (validateDefinitionEClass == null) {
            validateDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(198);
        }
        return validateDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getValidateDefinition_AnyAttribute3() {
        return (EAttribute)getValidateDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getWeightedLoadBalancerDefinition() {
        if (weightedLoadBalancerDefinitionEClass == null) {
            weightedLoadBalancerDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(201);
        }
        return weightedLoadBalancerDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWeightedLoadBalancerDefinition_DistributionRatio() {
        return (EAttribute)getWeightedLoadBalancerDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWeightedLoadBalancerDefinition_DistributionRatioDelimiter() {
        return (EAttribute)getWeightedLoadBalancerDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWeightedLoadBalancerDefinition_RoundRobin() {
        return (EAttribute)getWeightedLoadBalancerDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getWhenDefinition() {
        if (whenDefinitionEClass == null) {
            whenDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(202);
        }
        return whenDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWhenDefinition_AnyAttribute2() {
        return (EAttribute)getWhenDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getWireTapDefinition() {
        if (wireTapDefinitionEClass == null) {
            wireTapDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(203);
        }
        return wireTapDefinitionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getWireTapDefinition_Body() {
        return (EReference)getWireTapDefinition().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getWireTapDefinition_SetHeader() {
        return (EReference)getWireTapDefinition().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWireTapDefinition_Copy() {
        return (EAttribute)getWireTapDefinition().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWireTapDefinition_ExecutorServiceRef() {
        return (EAttribute)getWireTapDefinition().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWireTapDefinition_OnPrepareRef() {
        return (EAttribute)getWireTapDefinition().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWireTapDefinition_ProcessorRef() {
        return (EAttribute)getWireTapDefinition().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWireTapDefinition_Ref() {
        return (EAttribute)getWireTapDefinition().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWireTapDefinition_Uri() {
        return (EAttribute)getWireTapDefinition().getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWireTapDefinition_AnyAttribute2() {
        return (EAttribute)getWireTapDefinition().getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getXmlBeansDataFormat() {
        if (xmlBeansDataFormatEClass == null) {
            xmlBeansDataFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(204);
        }
        return xmlBeansDataFormatEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getXmlBeansDataFormat_PrettyPrint() {
        return (EAttribute)getXmlBeansDataFormat().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getXmlSecurityDataFormat() {
        if (xmlSecurityDataFormatEClass == null) {
            xmlSecurityDataFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(205);
        }
        return xmlSecurityDataFormatEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getXmlSecurityDataFormat_KeyCipherAlgorithm() {
        return (EAttribute)getXmlSecurityDataFormat().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXmlSecurityDataFormat_KeyOrTrustStoreParametersId() {
        return (EAttribute)getXmlSecurityDataFormat().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getXmlSecurityDataFormat_PassPhrase() {
        return (EAttribute)getXmlSecurityDataFormat().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getXmlSecurityDataFormat_RecipientKeyAlias() {
        return (EAttribute)getXmlSecurityDataFormat().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getXmlSecurityDataFormat_SecureTag() {
        return (EAttribute)getXmlSecurityDataFormat().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getXmlSecurityDataFormat_SecureTagContents() {
        return (EAttribute)getXmlSecurityDataFormat().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getXmlSecurityDataFormat_XmlCipherAlgorithm() {
        return (EAttribute)getXmlSecurityDataFormat().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getXPathExpression() {
        if (xPathExpressionEClass == null) {
            xPathExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(206);
        }
        return xPathExpressionEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXPathExpression_FactoryRef() {
        return (EAttribute)getXPathExpression().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXPathExpression_ObjectModel() {
        return (EAttribute)getXPathExpression().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getXPathExpression_ResultType() {
        return (EAttribute)getXPathExpression().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXPathExpression_Saxon() {
        return (EAttribute)getXPathExpression().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXPathExpression_TraceNamespaces() {
        return (EAttribute)getXPathExpression().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getXQueryExpression() {
        if (xQueryExpressionEClass == null) {
            xQueryExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(207);
        }
        return xQueryExpressionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getXQueryExpression_Type() {
        return (EAttribute)getXQueryExpression().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getXStreamDataFormat() {
        if (xStreamDataFormatEClass == null) {
            xStreamDataFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(208);
        }
        return xStreamDataFormatEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getXStreamDataFormat_Converters() {
        return (EReference)getXStreamDataFormat().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getXStreamDataFormat_Aliases() {
        return (EReference)getXStreamDataFormat().getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getXStreamDataFormat_OmitFields() {
        return (EReference)getXStreamDataFormat().getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getXStreamDataFormat_ImplicitCollections() {
        return (EReference)getXStreamDataFormat().getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getXStreamDataFormat_Driver() {
        return (EAttribute)getXStreamDataFormat().getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getXStreamDataFormat_DriverRef() {
        return (EAttribute)getXStreamDataFormat().getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getXStreamDataFormat_Encoding() {
        return (EAttribute)getXStreamDataFormat().getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getZipDataFormat() {
        if (zipDataFormatEClass == null) {
            zipDataFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(209);
        }
        return zipDataFormatEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getZipDataFormat_CompressionLevel() {
        return (EAttribute)getZipDataFormat().getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getBindyType() {
        if (bindyTypeEEnum == null) {
            bindyTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(19);
        }
        return bindyTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getErrorHandlerType() {
        if (errorHandlerTypeEEnum == null) {
            errorHandlerTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(57);
        }
        return errorHandlerTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getExchangePattern() {
        if (exchangePatternEEnum == null) {
            exchangePatternEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(59);
        }
        return exchangePatternEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getJsonLibrary() {
        if (jsonLibraryEEnum == null) {
            jsonLibraryEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(88);
        }
        return jsonLibraryEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getLoggingLevel() {
        if (loggingLevelEEnum == null) {
            loggingLevelEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(97);
        }
        return loggingLevelEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getManagementStatisticsLevel() {
        if (managementStatisticsLevelEEnum == null) {
            managementStatisticsLevelEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(100);
        }
        return managementStatisticsLevelEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getShutdownRoute() {
        if (shutdownRouteEEnum == null) {
            shutdownRouteEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(165);
        }
        return shutdownRouteEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getShutdownRunningTask() {
        if (shutdownRunningTaskEEnum == null) {
            shutdownRunningTaskEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(167);
        }
        return shutdownRunningTaskEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getThreadPoolRejectedPolicy() {
        if (threadPoolRejectedPolicyEEnum == null) {
            threadPoolRejectedPolicyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(184);
        }
        return threadPoolRejectedPolicyEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getWaitForTaskToComplete() {
        if (waitForTaskToCompleteEEnum == null) {
            waitForTaskToCompleteEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(199);
        }
        return waitForTaskToCompleteEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getBindyTypeObject() {
        if (bindyTypeObjectEDataType == null) {
            bindyTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(20);
        }
        return bindyTypeObjectEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getClassesType() {
        if (classesTypeEDataType == null) {
            classesTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(37);
        }
        return classesTypeEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getErrorHandlerTypeObject() {
        if (errorHandlerTypeObjectEDataType == null) {
            errorHandlerTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(58);
        }
        return errorHandlerTypeObjectEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getExchangePatternObject() {
        if (exchangePatternObjectEDataType == null) {
            exchangePatternObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(60);
        }
        return exchangePatternObjectEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getJsonLibraryObject() {
        if (jsonLibraryObjectEDataType == null) {
            jsonLibraryObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(89);
        }
        return jsonLibraryObjectEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getLoggingLevelObject() {
        if (loggingLevelObjectEDataType == null) {
            loggingLevelObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(98);
        }
        return loggingLevelObjectEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getManagementStatisticsLevelObject() {
        if (managementStatisticsLevelObjectEDataType == null) {
            managementStatisticsLevelObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(101);
        }
        return managementStatisticsLevelObjectEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getPackagesType() {
        if (packagesTypeEDataType == null) {
            packagesTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(120);
        }
        return packagesTypeEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getPackagesType1() {
        if (packagesType1EDataType == null) {
            packagesType1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(121);
        }
        return packagesType1EDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getShutdownRouteObject() {
        if (shutdownRouteObjectEDataType == null) {
            shutdownRouteObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(166);
        }
        return shutdownRouteObjectEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getShutdownRunningTaskObject() {
        if (shutdownRunningTaskObjectEDataType == null) {
            shutdownRunningTaskObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(168);
        }
        return shutdownRunningTaskObjectEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getThreadPoolRejectedPolicyObject() {
        if (threadPoolRejectedPolicyObjectEDataType == null) {
            threadPoolRejectedPolicyObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(185);
        }
        return threadPoolRejectedPolicyObjectEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getWaitForTaskToCompleteObject() {
        if (waitForTaskToCompleteObjectEDataType == null) {
            waitForTaskToCompleteObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI).getEClassifiers().get(200);
        }
        return waitForTaskToCompleteObjectEDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SpringFactory getSpringFactory() {
        return (SpringFactory)getEFactoryInstance();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isLoaded = false;

	/**
     * Laods the package and any sub-packages from their serialized form.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void loadPackage() {
        if (isLoaded) return;
        isLoaded = true;

        URL url = getClass().getResource(packageFilename);
        if (url == null) {
            throw new RuntimeException("Missing serialized package: " + packageFilename);
        }
        URI uri = URI.createURI(url.toString());
        Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
        try {
            resource.load(null);
        }
        catch (IOException exception) {
            throw new WrappedException(exception);
        }
        initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
        createResource(eNS_URI);
    }


	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isFixed = false;

	/**
     * Fixes up the loaded package, to make it appear as if it had been programmatically built.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void fixPackageContents() {
        if (isFixed) return;
        isFixed = true;
        fixEClassifiers();
    }

	/**
     * Sets the instance class on the given classifier.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
        if (eClassifier.getInstanceClassName() == null) {
            eClassifier.setInstanceClassName("org.switchyard.tools.models.switchyard1_0.spring." + eClassifier.getName());
            setGeneratedClassName(eClassifier);
        }
    }

} //SpringPackageImpl
