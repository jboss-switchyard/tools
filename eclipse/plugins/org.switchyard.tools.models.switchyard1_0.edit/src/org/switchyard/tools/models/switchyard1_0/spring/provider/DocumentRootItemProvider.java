/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.soa.sca.core.model.addressing.AddressingFactory;

import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;

import org.switchyard.tools.models.switchyard1_0.bean.BeanFactory;

import org.switchyard.tools.models.switchyard1_0.bean.provider.Switchyard_1EditPlugin;

import org.switchyard.tools.models.switchyard1_0.bpm.BPMFactory;

import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.amqp.AmqpFactory;
import org.switchyard.tools.models.switchyard1_0.camel.atom.AtomFactory;
import org.switchyard.tools.models.switchyard1_0.camel.core.CoreFactory;
import org.switchyard.tools.models.switchyard1_0.camel.file.FileFactory;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpFactory;
import org.switchyard.tools.models.switchyard1_0.camel.jms.JmsFactory;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaFactory;
import org.switchyard.tools.models.switchyard1_0.camel.mail.MailFactory;
import org.switchyard.tools.models.switchyard1_0.camel.netty.NettyFactory;
import org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzFactory;
import org.switchyard.tools.models.switchyard1_0.camel.sql.SqlFactory;

import org.switchyard.tools.models.switchyard1_0.clojure.ClojureFactory;

import org.switchyard.tools.models.switchyard1_0.http.HttpFactory;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;

import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyFactory;

import org.switchyard.tools.models.switchyard1_0.rules.RulesFactory;

import org.switchyard.tools.models.switchyard1_0.soap.SOAPFactory;

import org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.spring.SpringFactory;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;

import org.switchyard.tools.models.switchyard1_0.transform.TransformFactory;

import org.switchyard.tools.models.switchyard1_0.validate.ValidateFactory;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
    extends ItemProviderAdapter
    implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRootItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

        }
        return itemPropertyDescriptors;
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Aggregate());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Aop());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_BatchResequencerConfig());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Bean());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_BeanPostProcessor());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Bindy());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_CamelContext());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Castor());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Choice());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Constant());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_ConsumerTemplate());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_ContextScan());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_ConvertBodyTo());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Crypto());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Csv());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_CustomDataFormat());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_CustomLoadBalancer());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_DataFormats());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Delay());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Description());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_DoCatch());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_DoFinally());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_DoTry());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_DynamicRouter());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_El());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Endpoint());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Enrich());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_ErrorHandler());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Export());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Expression());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Failover());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Filter());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Flatpack());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_From());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Groovy());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Gzip());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Header());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Hl7());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_IdempotentConsumer());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_InOnly());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_InOut());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Intercept());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_InterceptFrom());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_InterceptToEndpoint());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_JavaScript());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Jaxb());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Jibx());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_JmxAgent());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Json());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Jxpath());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_KeyStoreParameters());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Language());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_LoadBalance());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Log());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Loop());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Marshal());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Method());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Multicast());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Mvel());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Ognl());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_OnCompletion());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_OnException());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Otherwise());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_PackageScan());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Pgp());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Php());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Pipeline());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Policy());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_PollEnrich());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Process());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Properties());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Property());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_PropertyPlaceholder());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Protobuf());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Proxy());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Python());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Random());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_RecipientList());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_RedeliveryPolicy());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_RedeliveryPolicyProfile());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Ref());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_RemoveHeader());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_RemoveHeaders());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_RemoveProperty());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Resequence());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Rollback());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_RoundRobin());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Route());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_RouteBuilder());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_RouteContext());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_RouteContextRef());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Routes());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_RoutingSlip());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Rss());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Ruby());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Sample());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_SecureRandomParameters());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_SecureXML());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Serialization());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_SetBody());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_SetExchangePattern());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_SetFaultBody());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_SetHeader());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_SetOutHeader());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_SetProperty());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Simple());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Soapjaxb());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Sort());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Spel());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Split());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Sql());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_SslContextParameters());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Sticky());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Stop());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_StreamResequencerConfig());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_String());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Syslog());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Template());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_ThreadPool());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_ThreadPoolProfile());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Threads());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Throttle());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_ThrowException());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_TidyMarkup());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_To());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Tokenize());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Topic());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Transacted());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Transform());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Unmarshal());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Validate());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Weighted());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_When());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_WireTap());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_XmlBeans());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Xpath());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Xquery());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Xstream());
            childrenFeatures.add(SpringPackage.eINSTANCE.getDocumentRoot_Zip());
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns DocumentRoot.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        return getString("_UI_DocumentRoot_type");
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(DocumentRoot.class)) {
            case SpringPackage.DOCUMENT_ROOT__AGGREGATE:
            case SpringPackage.DOCUMENT_ROOT__AOP:
            case SpringPackage.DOCUMENT_ROOT__BATCH_RESEQUENCER_CONFIG:
            case SpringPackage.DOCUMENT_ROOT__BEAN:
            case SpringPackage.DOCUMENT_ROOT__BEAN_POST_PROCESSOR:
            case SpringPackage.DOCUMENT_ROOT__BINDY:
            case SpringPackage.DOCUMENT_ROOT__CAMEL_CONTEXT:
            case SpringPackage.DOCUMENT_ROOT__CASTOR:
            case SpringPackage.DOCUMENT_ROOT__CHOICE:
            case SpringPackage.DOCUMENT_ROOT__CONSTANT:
            case SpringPackage.DOCUMENT_ROOT__CONSUMER_TEMPLATE:
            case SpringPackage.DOCUMENT_ROOT__CONTEXT_SCAN:
            case SpringPackage.DOCUMENT_ROOT__CONVERT_BODY_TO:
            case SpringPackage.DOCUMENT_ROOT__CRYPTO:
            case SpringPackage.DOCUMENT_ROOT__CSV:
            case SpringPackage.DOCUMENT_ROOT__CUSTOM_DATA_FORMAT:
            case SpringPackage.DOCUMENT_ROOT__CUSTOM_LOAD_BALANCER:
            case SpringPackage.DOCUMENT_ROOT__DATA_FORMATS:
            case SpringPackage.DOCUMENT_ROOT__DELAY:
            case SpringPackage.DOCUMENT_ROOT__DESCRIPTION:
            case SpringPackage.DOCUMENT_ROOT__DO_CATCH:
            case SpringPackage.DOCUMENT_ROOT__DO_FINALLY:
            case SpringPackage.DOCUMENT_ROOT__DO_TRY:
            case SpringPackage.DOCUMENT_ROOT__DYNAMIC_ROUTER:
            case SpringPackage.DOCUMENT_ROOT__EL:
            case SpringPackage.DOCUMENT_ROOT__ENDPOINT:
            case SpringPackage.DOCUMENT_ROOT__ENRICH:
            case SpringPackage.DOCUMENT_ROOT__ERROR_HANDLER:
            case SpringPackage.DOCUMENT_ROOT__EXPORT:
            case SpringPackage.DOCUMENT_ROOT__EXPRESSION:
            case SpringPackage.DOCUMENT_ROOT__EXPRESSION_DEFINITION:
            case SpringPackage.DOCUMENT_ROOT__FAILOVER:
            case SpringPackage.DOCUMENT_ROOT__FILTER:
            case SpringPackage.DOCUMENT_ROOT__FLATPACK:
            case SpringPackage.DOCUMENT_ROOT__FROM:
            case SpringPackage.DOCUMENT_ROOT__GROOVY:
            case SpringPackage.DOCUMENT_ROOT__GZIP:
            case SpringPackage.DOCUMENT_ROOT__HEADER:
            case SpringPackage.DOCUMENT_ROOT__HL7:
            case SpringPackage.DOCUMENT_ROOT__IDEMPOTENT_CONSUMER:
            case SpringPackage.DOCUMENT_ROOT__IN_ONLY:
            case SpringPackage.DOCUMENT_ROOT__IN_OUT:
            case SpringPackage.DOCUMENT_ROOT__INTERCEPT:
            case SpringPackage.DOCUMENT_ROOT__INTERCEPT_FROM:
            case SpringPackage.DOCUMENT_ROOT__INTERCEPT_TO_ENDPOINT:
            case SpringPackage.DOCUMENT_ROOT__JAVA_SCRIPT:
            case SpringPackage.DOCUMENT_ROOT__JAXB:
            case SpringPackage.DOCUMENT_ROOT__JIBX:
            case SpringPackage.DOCUMENT_ROOT__JMX_AGENT:
            case SpringPackage.DOCUMENT_ROOT__JSON:
            case SpringPackage.DOCUMENT_ROOT__JXPATH:
            case SpringPackage.DOCUMENT_ROOT__KEY_STORE_PARAMETERS:
            case SpringPackage.DOCUMENT_ROOT__LANGUAGE:
            case SpringPackage.DOCUMENT_ROOT__LOAD_BALANCE:
            case SpringPackage.DOCUMENT_ROOT__LOG:
            case SpringPackage.DOCUMENT_ROOT__LOOP:
            case SpringPackage.DOCUMENT_ROOT__MARSHAL:
            case SpringPackage.DOCUMENT_ROOT__METHOD:
            case SpringPackage.DOCUMENT_ROOT__MULTICAST:
            case SpringPackage.DOCUMENT_ROOT__MVEL:
            case SpringPackage.DOCUMENT_ROOT__OGNL:
            case SpringPackage.DOCUMENT_ROOT__ON_COMPLETION:
            case SpringPackage.DOCUMENT_ROOT__ON_EXCEPTION:
            case SpringPackage.DOCUMENT_ROOT__OTHERWISE:
            case SpringPackage.DOCUMENT_ROOT__PACKAGE_SCAN:
            case SpringPackage.DOCUMENT_ROOT__PGP:
            case SpringPackage.DOCUMENT_ROOT__PHP:
            case SpringPackage.DOCUMENT_ROOT__PIPELINE:
            case SpringPackage.DOCUMENT_ROOT__POLICY:
            case SpringPackage.DOCUMENT_ROOT__POLL_ENRICH:
            case SpringPackage.DOCUMENT_ROOT__PROCESS:
            case SpringPackage.DOCUMENT_ROOT__PROPERTIES:
            case SpringPackage.DOCUMENT_ROOT__PROPERTY:
            case SpringPackage.DOCUMENT_ROOT__PROPERTY_PLACEHOLDER:
            case SpringPackage.DOCUMENT_ROOT__PROTOBUF:
            case SpringPackage.DOCUMENT_ROOT__PROXY:
            case SpringPackage.DOCUMENT_ROOT__PYTHON:
            case SpringPackage.DOCUMENT_ROOT__RANDOM:
            case SpringPackage.DOCUMENT_ROOT__RECIPIENT_LIST:
            case SpringPackage.DOCUMENT_ROOT__REDELIVERY_POLICY:
            case SpringPackage.DOCUMENT_ROOT__REDELIVERY_POLICY_PROFILE:
            case SpringPackage.DOCUMENT_ROOT__REF:
            case SpringPackage.DOCUMENT_ROOT__REMOVE_HEADER:
            case SpringPackage.DOCUMENT_ROOT__REMOVE_HEADERS:
            case SpringPackage.DOCUMENT_ROOT__REMOVE_PROPERTY:
            case SpringPackage.DOCUMENT_ROOT__RESEQUENCE:
            case SpringPackage.DOCUMENT_ROOT__ROLLBACK:
            case SpringPackage.DOCUMENT_ROOT__ROUND_ROBIN:
            case SpringPackage.DOCUMENT_ROOT__ROUTE:
            case SpringPackage.DOCUMENT_ROOT__ROUTE_BUILDER:
            case SpringPackage.DOCUMENT_ROOT__ROUTE_CONTEXT:
            case SpringPackage.DOCUMENT_ROOT__ROUTE_CONTEXT_REF:
            case SpringPackage.DOCUMENT_ROOT__ROUTES:
            case SpringPackage.DOCUMENT_ROOT__ROUTING_SLIP:
            case SpringPackage.DOCUMENT_ROOT__RSS:
            case SpringPackage.DOCUMENT_ROOT__RUBY:
            case SpringPackage.DOCUMENT_ROOT__SAMPLE:
            case SpringPackage.DOCUMENT_ROOT__SECURE_RANDOM_PARAMETERS:
            case SpringPackage.DOCUMENT_ROOT__SECURE_XML:
            case SpringPackage.DOCUMENT_ROOT__SERIALIZATION:
            case SpringPackage.DOCUMENT_ROOT__SET_BODY:
            case SpringPackage.DOCUMENT_ROOT__SET_EXCHANGE_PATTERN:
            case SpringPackage.DOCUMENT_ROOT__SET_FAULT_BODY:
            case SpringPackage.DOCUMENT_ROOT__SET_HEADER:
            case SpringPackage.DOCUMENT_ROOT__SET_OUT_HEADER:
            case SpringPackage.DOCUMENT_ROOT__SET_PROPERTY:
            case SpringPackage.DOCUMENT_ROOT__SIMPLE:
            case SpringPackage.DOCUMENT_ROOT__SOAPJAXB:
            case SpringPackage.DOCUMENT_ROOT__SORT:
            case SpringPackage.DOCUMENT_ROOT__SPEL:
            case SpringPackage.DOCUMENT_ROOT__SPLIT:
            case SpringPackage.DOCUMENT_ROOT__SQL:
            case SpringPackage.DOCUMENT_ROOT__SSL_CONTEXT_PARAMETERS:
            case SpringPackage.DOCUMENT_ROOT__STICKY:
            case SpringPackage.DOCUMENT_ROOT__STOP:
            case SpringPackage.DOCUMENT_ROOT__STREAM_RESEQUENCER_CONFIG:
            case SpringPackage.DOCUMENT_ROOT__STRING:
            case SpringPackage.DOCUMENT_ROOT__SYSLOG:
            case SpringPackage.DOCUMENT_ROOT__TEMPLATE:
            case SpringPackage.DOCUMENT_ROOT__THREAD_POOL:
            case SpringPackage.DOCUMENT_ROOT__THREAD_POOL_PROFILE:
            case SpringPackage.DOCUMENT_ROOT__THREADS:
            case SpringPackage.DOCUMENT_ROOT__THROTTLE:
            case SpringPackage.DOCUMENT_ROOT__THROW_EXCEPTION:
            case SpringPackage.DOCUMENT_ROOT__TIDY_MARKUP:
            case SpringPackage.DOCUMENT_ROOT__TO:
            case SpringPackage.DOCUMENT_ROOT__TOKENIZE:
            case SpringPackage.DOCUMENT_ROOT__TOPIC:
            case SpringPackage.DOCUMENT_ROOT__TRANSACTED:
            case SpringPackage.DOCUMENT_ROOT__TRANSFORM:
            case SpringPackage.DOCUMENT_ROOT__UNMARSHAL:
            case SpringPackage.DOCUMENT_ROOT__VALIDATE:
            case SpringPackage.DOCUMENT_ROOT__WEIGHTED:
            case SpringPackage.DOCUMENT_ROOT__WHEN:
            case SpringPackage.DOCUMENT_ROOT__WIRE_TAP:
            case SpringPackage.DOCUMENT_ROOT__XML_BEANS:
            case SpringPackage.DOCUMENT_ROOT__XPATH:
            case SpringPackage.DOCUMENT_ROOT__XQUERY:
            case SpringPackage.DOCUMENT_ROOT__XSTREAM:
            case SpringPackage.DOCUMENT_ROOT__ZIP:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Aggregate(),
                 SpringFactory.eINSTANCE.createAggregateDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Aop(),
                 SpringFactory.eINSTANCE.createAopDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_BatchResequencerConfig(),
                 SpringFactory.eINSTANCE.createBatchResequencerConfig()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Bean(),
                 SpringFactory.eINSTANCE.createBeanDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_BeanPostProcessor(),
                 SpringFactory.eINSTANCE.createCamelBeanPostProcessor()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Bindy(),
                 SpringFactory.eINSTANCE.createBindyDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_CamelContext(),
                 SpringFactory.eINSTANCE.createCamelContextFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Castor(),
                 SpringFactory.eINSTANCE.createCastorDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Choice(),
                 SpringFactory.eINSTANCE.createChoiceDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Constant(),
                 SpringFactory.eINSTANCE.createConstantExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ConsumerTemplate(),
                 SpringFactory.eINSTANCE.createCamelConsumerTemplateFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ContextScan(),
                 SpringFactory.eINSTANCE.createContextScanDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ConvertBodyTo(),
                 SpringFactory.eINSTANCE.createConvertBodyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Crypto(),
                 SpringFactory.eINSTANCE.createCryptoDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Csv(),
                 SpringFactory.eINSTANCE.createCsvDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_CustomDataFormat(),
                 SpringFactory.eINSTANCE.createCustomDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_CustomLoadBalancer(),
                 SpringFactory.eINSTANCE.createCustomLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_DataFormats(),
                 SpringFactory.eINSTANCE.createDataFormatsDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Delay(),
                 SpringFactory.eINSTANCE.createDelayDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Description(),
                 SpringFactory.eINSTANCE.createDescriptionDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_DoCatch(),
                 SpringFactory.eINSTANCE.createCatchDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_DoFinally(),
                 SpringFactory.eINSTANCE.createFinallyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_DoTry(),
                 SpringFactory.eINSTANCE.createTryDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_DynamicRouter(),
                 SpringFactory.eINSTANCE.createDynamicRouterDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_El(),
                 SpringFactory.eINSTANCE.createElExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Endpoint(),
                 SpringFactory.eINSTANCE.createCamelEndpointFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Enrich(),
                 SpringFactory.eINSTANCE.createEnrichDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ErrorHandler(),
                 SpringFactory.eINSTANCE.createErrorHandlerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Export(),
                 SpringFactory.eINSTANCE.createCamelServiceExporterDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Expression(),
                 SpringFactory.eINSTANCE.createExpressionSubElementDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createConstantExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createElExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createGroovyExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createHeaderExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createJavaScriptExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createJxPathExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createLanguageExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createMethodCallExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createMvelExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createOgnlExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createPhpExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createPropertyExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createPythonExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createRefExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createRubyExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createSimpleExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createSpELExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createSqlExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createTokenizerExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createXPathExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition(),
                 SpringFactory.eINSTANCE.createXQueryExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Failover(),
                 SpringFactory.eINSTANCE.createFailoverLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Filter(),
                 SpringFactory.eINSTANCE.createFilterDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Flatpack(),
                 SpringFactory.eINSTANCE.createFlatpackDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_From(),
                 SpringFactory.eINSTANCE.createFromDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Groovy(),
                 SpringFactory.eINSTANCE.createGroovyExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Gzip(),
                 SpringFactory.eINSTANCE.createGzipDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Header(),
                 SpringFactory.eINSTANCE.createHeaderExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Hl7(),
                 SpringFactory.eINSTANCE.createHl7DataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_IdempotentConsumer(),
                 SpringFactory.eINSTANCE.createIdempotentConsumerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_InOnly(),
                 SpringFactory.eINSTANCE.createInOnlyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_InOut(),
                 SpringFactory.eINSTANCE.createInOutDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Intercept(),
                 SpringFactory.eINSTANCE.createInterceptDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Intercept(),
                 SpringFactory.eINSTANCE.createInterceptFromDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_InterceptFrom(),
                 SpringFactory.eINSTANCE.createInterceptFromDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_InterceptToEndpoint(),
                 SpringFactory.eINSTANCE.createInterceptSendToEndpointDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_JavaScript(),
                 SpringFactory.eINSTANCE.createJavaScriptExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Jaxb(),
                 SpringFactory.eINSTANCE.createJaxbDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Jibx(),
                 SpringFactory.eINSTANCE.createJibxDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_JmxAgent(),
                 SpringFactory.eINSTANCE.createCamelJMXAgentDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Json(),
                 SpringFactory.eINSTANCE.createJsonDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Jxpath(),
                 SpringFactory.eINSTANCE.createJxPathExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_KeyStoreParameters(),
                 SpringFactory.eINSTANCE.createKeyStoreParametersFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Language(),
                 SpringFactory.eINSTANCE.createLanguageExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_LoadBalance(),
                 SpringFactory.eINSTANCE.createLoadBalanceDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Log(),
                 SpringFactory.eINSTANCE.createLogDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Loop(),
                 SpringFactory.eINSTANCE.createLoopDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Marshal(),
                 SpringFactory.eINSTANCE.createMarshalDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Method(),
                 SpringFactory.eINSTANCE.createMethodCallExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Multicast(),
                 SpringFactory.eINSTANCE.createMulticastDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Mvel(),
                 SpringFactory.eINSTANCE.createMvelExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Ognl(),
                 SpringFactory.eINSTANCE.createOgnlExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_OnCompletion(),
                 SpringFactory.eINSTANCE.createOnCompletionDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_OnException(),
                 SpringFactory.eINSTANCE.createOnExceptionDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Otherwise(),
                 SpringFactory.eINSTANCE.createOtherwiseDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_PackageScan(),
                 SpringFactory.eINSTANCE.createPackageScanDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Pgp(),
                 SpringFactory.eINSTANCE.createPgpDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Php(),
                 SpringFactory.eINSTANCE.createPhpExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Pipeline(),
                 SpringFactory.eINSTANCE.createPipelineDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Policy(),
                 SpringFactory.eINSTANCE.createPolicyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_PollEnrich(),
                 SpringFactory.eINSTANCE.createPollEnrichDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Process(),
                 SpringFactory.eINSTANCE.createProcessDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Properties(),
                 SpringFactory.eINSTANCE.createPropertiesDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createAggregateDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createAliasEntry()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createAliasList()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createOutput()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createAopDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createBatchResequencerConfig()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createBeanDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createBindyDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createCamelBeanPostProcessor()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createCamelConsumerTemplateFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createCamelContextFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createCamelEndpointFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createCamelJMXAgentDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createCamelProducerTemplateFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createCamelPropertyPlaceholderDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createCamelProxyFactoryDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createCamelRedeliveryPolicyFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createCamelRouteContextFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createCamelServiceExporterDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createCamelThreadPoolFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createCastorDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createCatchDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createChoiceDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createCipherSuitesParameters()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createConstantExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createConstants()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createContextScanDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createConvertBodyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createConverterEntry()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createConverterList()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createCryptoDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createCsvDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createCustomDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createLoadBalancer()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createCustomLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createDataFormatsDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createExpressionNode()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createDelayDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createDescriptionDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createNoOutputExpressionNode()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createDynamicRouterDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createElExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createEnrichDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createErrorHandlerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createExpressionNodeHelper()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createExpressionSubElementDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createFailoverLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createFilterDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createFilterParameters()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createFinallyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createFlatpackDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createFromDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createGroovyExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createGzipDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createHeaderExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createHl7DataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createIdempotentConsumerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createImplicitCollectionEntry()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createImplicitCollectionList()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createInOnlyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createInOutDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createInterceptDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createInterceptFromDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createInterceptSendToEndpointDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createJavaScriptExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createJaxbDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createJibxDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createJsonDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createJxPathExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createKeyManagersParametersFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createKeyStoreParametersFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createLanguageExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createLoadBalanceDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createLogDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createLoopDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createMarshalDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createMethodCallExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createModelHelper()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createMulticastDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createMvelExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createNodeFactory()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createOgnlExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createOmitFieldEntry()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createOmitFieldList()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createOnCompletionDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createOnExceptionDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createOtherwiseDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createPackageScanDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createPhpExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createPipelineDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createPgpDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createPolicyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createPollEnrichDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createProcessDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createProcessorDefinitionHelper()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createPropertiesDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createPropertyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createPropertyExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createProtobufDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createPythonExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createRandomLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createRecipientListDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createRedeliveryPolicyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createRefExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createRemoveHeaderDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createRemoveHeadersDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createRemovePropertyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createResequenceDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createRollbackDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createRoundRobinLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createRouteBuilderDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createRouteContextRefDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createRouteDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createRouteDefinitionHelper()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createRoutesDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createRoutingSlipDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createRssDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createRubyExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createSamplingDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createSecureRandomParametersFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createSecureSocketProtocolsParameters()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createSerializationDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createSetBodyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createSetExchangePatternDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createSetFaultBodyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createSetHeaderDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createSetOutHeaderDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createSetPropertyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createSimpleExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createSoapJaxbDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createSortDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createSpELExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createSplitDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createSqlExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createSslContextClientParametersFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createSslContextParametersFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createSslContextServerParametersFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createStickyLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createStopDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createStreamResequencerConfig()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createStringDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createSyslogDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createThreadPoolProfileDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createThreadsDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createThrottleDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createThrowExceptionDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createTidyMarkupDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createToDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createTokenizerExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createTopicLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createTransactedDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createTransformDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createTrustManagersParametersFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createTryDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createUnmarshalDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createValidateDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createWeightedLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createWhenDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createWireTapDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createXmlBeansDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createXmlSecurityDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createXPathExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createXQueryExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createXStreamDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SpringFactory.eINSTANCE.createZipDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 BeanFactory.eINSTANCE.createBeanImplementationType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 BPMFactory.eINSTANCE.createBPMImplementationType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 BPMFactory.eINSTANCE.createChannelsType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 BPMFactory.eINSTANCE.createChannelType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 BPMFactory.eINSTANCE.createContainerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 BPMFactory.eINSTANCE.createFaultsType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 BPMFactory.eINSTANCE.createGlobalsType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 BPMFactory.eINSTANCE.createInputsType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 BPMFactory.eINSTANCE.createListenersType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 BPMFactory.eINSTANCE.createListenerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 BPMFactory.eINSTANCE.createLoggersType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 BPMFactory.eINSTANCE.createLoggerType1()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 BPMFactory.eINSTANCE.createManifestType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 BPMFactory.eINSTANCE.createMappingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 BPMFactory.eINSTANCE.createOperationsType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 BPMFactory.eINSTANCE.createBPMOperationType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 BPMFactory.eINSTANCE.createOutputsType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 BPMFactory.eINSTANCE.createPropertiesType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 BPMFactory.eINSTANCE.createPropertyType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 BPMFactory.eINSTANCE.createResourcesType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 BPMFactory.eINSTANCE.createResourceType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 BPMFactory.eINSTANCE.createUserGroupCallbackType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 BPMFactory.eINSTANCE.createWorkItemHandlersType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 BPMFactory.eINSTANCE.createWorkItemHandlerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SwitchyardFactory.eINSTANCE.createArtifactsType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SwitchyardFactory.eINSTANCE.createArtifactType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SwitchyardFactory.eINSTANCE.createContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SwitchyardFactory.eINSTANCE.createDomainType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SwitchyardFactory.eINSTANCE.createEsbInterface()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SwitchyardFactory.eINSTANCE.createJavaOperationSelectorType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SwitchyardFactory.eINSTANCE.createMessageComposerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SwitchyardFactory.eINSTANCE.createPropertiesType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SwitchyardFactory.eINSTANCE.createPropertyType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SwitchyardFactory.eINSTANCE.createRegexOperationSelectorType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SwitchyardFactory.eINSTANCE.createResourceType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SwitchyardFactory.eINSTANCE.createSecuritiesType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SwitchyardFactory.eINSTANCE.createSecurityType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SwitchyardFactory.eINSTANCE.createStaticOperationSelectorType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SwitchyardFactory.eINSTANCE.createSwitchYardType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SwitchyardFactory.eINSTANCE.createThrottlingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SwitchyardFactory.eINSTANCE.createTransformsType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SwitchyardFactory.eINSTANCE.createValidatesType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SwitchyardFactory.eINSTANCE.createXPathOperationSelectorType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ClojureFactory.eINSTANCE.createClojureImplementationType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 RulesFactory.eINSTANCE.createOperationsType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 RulesFactory.eINSTANCE.createRulesOperationType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 RulesFactory.eINSTANCE.createChannelsType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 RulesFactory.eINSTANCE.createChannelType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 RulesFactory.eINSTANCE.createContainerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 RulesFactory.eINSTANCE.createGlobalsType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 RulesFactory.eINSTANCE.createInputsType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 RulesFactory.eINSTANCE.createListenersType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 RulesFactory.eINSTANCE.createListenerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 RulesFactory.eINSTANCE.createLoggersType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 RulesFactory.eINSTANCE.createLoggerType1()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 RulesFactory.eINSTANCE.createManifestType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 RulesFactory.eINSTANCE.createMappingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 RulesFactory.eINSTANCE.createOutputsType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 RulesFactory.eINSTANCE.createPropertiesType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 RulesFactory.eINSTANCE.createPropertyType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 RulesFactory.eINSTANCE.createResourcesType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 RulesFactory.eINSTANCE.createResourceType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 RulesFactory.eINSTANCE.createRulesImplementationType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 RulesFactory.eINSTANCE.createFaultsType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SOAPFactory.eINSTANCE.createContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SOAPFactory.eINSTANCE.createEndpointConfigType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SOAPFactory.eINSTANCE.createInterceptorsType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SOAPFactory.eINSTANCE.createInterceptorType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SOAPFactory.eINSTANCE.createMessageComposerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SOAPFactory.eINSTANCE.createMtomType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SOAPFactory.eINSTANCE.createPropertiesType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SOAPFactory.eINSTANCE.createPropertyType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SOAPFactory.eINSTANCE.createProxyType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SOAPFactory.eINSTANCE.createSOAPBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SOAPFactory.eINSTANCE.createBasicAuthenticationType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SOAPFactory.eINSTANCE.createNTLMAuthenticationType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 TransformFactory.eINSTANCE.createJavaTransformType1()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 TransformFactory.eINSTANCE.createJAXBTransformType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 TransformFactory.eINSTANCE.createJsonTransformType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 TransformFactory.eINSTANCE.createSmooksTransformType1()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 TransformFactory.eINSTANCE.createXsltTransformType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ValidateFactory.eINSTANCE.createJavaValidateType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ValidateFactory.eINSTANCE.createXmlValidateType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ValidateFactory.eINSTANCE.createSchemaFilesType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ValidateFactory.eINSTANCE.createSchemaCatalogsType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ValidateFactory.eINSTANCE.createFileEntryType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 CamelFactory.eINSTANCE.createJavaDSLType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 CamelFactory.eINSTANCE.createXMLDSLType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 CamelFactory.eINSTANCE.createCamelImplementationType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 JcaFactory.eINSTANCE.createActivationSpec()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 JcaFactory.eINSTANCE.createBatchCommit()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 JcaFactory.eINSTANCE.createConnection()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 JcaFactory.eINSTANCE.createConnectionSpec()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 JcaFactory.eINSTANCE.createEndpoint()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 JcaFactory.eINSTANCE.createInteractionSpec()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 JcaFactory.eINSTANCE.createJCABinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 JcaFactory.eINSTANCE.createJCAInboundConnection()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 JcaFactory.eINSTANCE.createJCAInboundInteraction()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 JcaFactory.eINSTANCE.createJCAOutboundConnection()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 JcaFactory.eINSTANCE.createJCAOutboundInteraction()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 JcaFactory.eINSTANCE.createProcessor()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 JcaFactory.eINSTANCE.createProperty()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 JcaFactory.eINSTANCE.createResourceAdapter()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ResteasyFactory.eINSTANCE.createProxyType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ResteasyFactory.eINSTANCE.createRESTBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ResteasyFactory.eINSTANCE.createBasicAuthenticationType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ResteasyFactory.eINSTANCE.createNTLMAuthenticationType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 HttpFactory.eINSTANCE.createBasicAuthenticationType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 HttpFactory.eINSTANCE.createHTTPBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 HttpFactory.eINSTANCE.createNTLMAuthenticationType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 HttpFactory.eINSTANCE.createProxyType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 CoreFactory.eINSTANCE.createBaseCamelBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 CoreFactory.eINSTANCE.createCamelBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 CoreFactory.eINSTANCE.createCamelDirectBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 CoreFactory.eINSTANCE.createCamelMockBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 CoreFactory.eINSTANCE.createCamelSedaBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 CoreFactory.eINSTANCE.createCamelTimerBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 AmqpFactory.eINSTANCE.createBaseCamelBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 AmqpFactory.eINSTANCE.createCamelAmqpBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 AtomFactory.eINSTANCE.createAtomScheduledPollConsumerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 AtomFactory.eINSTANCE.createBaseCamelBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 AtomFactory.eINSTANCE.createCamelAtomBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 FileFactory.eINSTANCE.createBaseCamelBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 FileFactory.eINSTANCE.createCamelFileBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 FileFactory.eINSTANCE.createFileConsumerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 FileFactory.eINSTANCE.createFileProducerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 FtpFactory.eINSTANCE.createBaseCamelBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 FtpFactory.eINSTANCE.createCamelFtpBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 FtpFactory.eINSTANCE.createCamelFtpsBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 FtpFactory.eINSTANCE.createCamelSftpBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 FtpFactory.eINSTANCE.createRemoteFileConsumerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 FtpFactory.eINSTANCE.createRemoteFileProducerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 JmsFactory.eINSTANCE.createBaseCamelBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 JmsFactory.eINSTANCE.createCamelJmsBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 JpaFactory.eINSTANCE.createBaseCamelBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 JpaFactory.eINSTANCE.createCamelJpaBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 JpaFactory.eINSTANCE.createJpaConsumerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 JpaFactory.eINSTANCE.createJpaProducerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 MailFactory.eINSTANCE.createBaseCamelBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 MailFactory.eINSTANCE.createCamelMailBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 MailFactory.eINSTANCE.createCamelMailConsumerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 MailFactory.eINSTANCE.createCamelMailProducerType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 NettyFactory.eINSTANCE.createBaseCamelBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 NettyFactory.eINSTANCE.createCamelNettyTcpBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 NettyFactory.eINSTANCE.createCamelNettyUdpBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 QuartzFactory.eINSTANCE.createBaseCamelBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 QuartzFactory.eINSTANCE.createCamelQuartzBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SqlFactory.eINSTANCE.createBaseCamelBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 SqlFactory.eINSTANCE.createCamelSqlBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createActivationSpec()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createCommonExtensionBase()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createBindingProperty()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createBPELImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createCallback()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createCExport()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createCFunction()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createCImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createCImplementationFunction()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createCImport()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createCInterface()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createComponent()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createComponentReference()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createComponentService()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createComponentType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createComponentTypeReference()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createComposite()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createConnection()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createConnectionSpec()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createSCAPropertyBase()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createProperty()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createConstrainingProperty()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createConstrainingReference()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createConstrainingService()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createConstrainingType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createContributionType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createCPPExport()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createCPPFunction()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createCPPImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createCPPImplementationFunction()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createCPPImport()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createCPPInterface()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createDeployableType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createDocumentation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createEJBImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createEJBSessionBeanBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createExportType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createImplementationType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createImportType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createInboundOperation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createInclude()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createIntent()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createIntentMap()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createIntentQualifier()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createInteractionSpec()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createJavaExportType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createJavaImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createJavaImportType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createJavaInterface()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createJCABinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createJCAInboundConnection()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createJCAInboundInteraction()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createJCAOutboundConnection()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createJCAOutboundInteraction()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createJEEImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createJMSActivationSpec()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createJMSBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createJMSConnectionFactory()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createJMSDestination()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createJMSHeaders()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createJMSMessageSelection()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createJMSOperationProperties()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createJMSResourceAdapter()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createJMSResponse()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createOperation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createPolicySet()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createPolicySetAttachment()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createPolicySetReference()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createPropertyValue()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createQualifier()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createReference()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createResourceAdapter()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createSCABinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createSCAImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createService()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createSpringImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createTDefinitions()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createValueType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createWebImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createWebServiceBinding()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createWire()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 ScaFactory.eINSTANCE.createWSDLPortType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 AddressingFactory.eINSTANCE.createAttributedQNameType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 AddressingFactory.eINSTANCE.createAttributedUnsignedLongType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 AddressingFactory.eINSTANCE.createAttributedURIType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 AddressingFactory.eINSTANCE.createEndpointReferenceType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 AddressingFactory.eINSTANCE.createMetadataType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 AddressingFactory.eINSTANCE.createProblemActionType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 AddressingFactory.eINSTANCE.createReferenceParametersType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 AddressingFactory.eINSTANCE.createRelatesToType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Property(),
                 XMLTypeFactory.eINSTANCE.createAnyType()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_PropertyPlaceholder(),
                 SpringFactory.eINSTANCE.createCamelPropertyPlaceholderDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Protobuf(),
                 SpringFactory.eINSTANCE.createProtobufDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Proxy(),
                 SpringFactory.eINSTANCE.createCamelProxyFactoryDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Python(),
                 SpringFactory.eINSTANCE.createPythonExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Random(),
                 SpringFactory.eINSTANCE.createRandomLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_RecipientList(),
                 SpringFactory.eINSTANCE.createRecipientListDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_RedeliveryPolicy(),
                 SpringFactory.eINSTANCE.createRedeliveryPolicyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_RedeliveryPolicyProfile(),
                 SpringFactory.eINSTANCE.createCamelRedeliveryPolicyFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Ref(),
                 SpringFactory.eINSTANCE.createRefExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_RemoveHeader(),
                 SpringFactory.eINSTANCE.createRemoveHeaderDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_RemoveHeaders(),
                 SpringFactory.eINSTANCE.createRemoveHeadersDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_RemoveProperty(),
                 SpringFactory.eINSTANCE.createRemovePropertyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Resequence(),
                 SpringFactory.eINSTANCE.createResequenceDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Rollback(),
                 SpringFactory.eINSTANCE.createRollbackDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_RoundRobin(),
                 SpringFactory.eINSTANCE.createRoundRobinLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Route(),
                 SpringFactory.eINSTANCE.createRouteDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_RouteBuilder(),
                 SpringFactory.eINSTANCE.createRouteBuilderDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_RouteContext(),
                 SpringFactory.eINSTANCE.createCamelRouteContextFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_RouteContextRef(),
                 SpringFactory.eINSTANCE.createRouteContextRefDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Routes(),
                 SpringFactory.eINSTANCE.createRoutesDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_RoutingSlip(),
                 SpringFactory.eINSTANCE.createRoutingSlipDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Rss(),
                 SpringFactory.eINSTANCE.createRssDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Ruby(),
                 SpringFactory.eINSTANCE.createRubyExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Sample(),
                 SpringFactory.eINSTANCE.createSamplingDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_SecureRandomParameters(),
                 SpringFactory.eINSTANCE.createSecureRandomParametersFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_SecureXML(),
                 SpringFactory.eINSTANCE.createXmlSecurityDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Serialization(),
                 SpringFactory.eINSTANCE.createSerializationDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_SetBody(),
                 SpringFactory.eINSTANCE.createSetBodyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_SetExchangePattern(),
                 SpringFactory.eINSTANCE.createSetExchangePatternDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_SetFaultBody(),
                 SpringFactory.eINSTANCE.createSetFaultBodyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_SetHeader(),
                 SpringFactory.eINSTANCE.createSetHeaderDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_SetOutHeader(),
                 SpringFactory.eINSTANCE.createSetOutHeaderDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_SetProperty(),
                 SpringFactory.eINSTANCE.createSetPropertyDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Simple(),
                 SpringFactory.eINSTANCE.createSimpleExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Soapjaxb(),
                 SpringFactory.eINSTANCE.createSoapJaxbDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Sort(),
                 SpringFactory.eINSTANCE.createSortDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Spel(),
                 SpringFactory.eINSTANCE.createSpELExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Split(),
                 SpringFactory.eINSTANCE.createSplitDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Sql(),
                 SpringFactory.eINSTANCE.createSqlExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_SslContextParameters(),
                 SpringFactory.eINSTANCE.createSslContextParametersFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Sticky(),
                 SpringFactory.eINSTANCE.createStickyLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Stop(),
                 SpringFactory.eINSTANCE.createStopDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_StreamResequencerConfig(),
                 SpringFactory.eINSTANCE.createStreamResequencerConfig()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_String(),
                 SpringFactory.eINSTANCE.createStringDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Syslog(),
                 SpringFactory.eINSTANCE.createSyslogDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Template(),
                 SpringFactory.eINSTANCE.createCamelProducerTemplateFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ThreadPool(),
                 SpringFactory.eINSTANCE.createCamelThreadPoolFactoryBean()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ThreadPoolProfile(),
                 SpringFactory.eINSTANCE.createThreadPoolProfileDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Threads(),
                 SpringFactory.eINSTANCE.createThreadsDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Throttle(),
                 SpringFactory.eINSTANCE.createThrottleDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_ThrowException(),
                 SpringFactory.eINSTANCE.createThrowExceptionDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_TidyMarkup(),
                 SpringFactory.eINSTANCE.createTidyMarkupDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_To(),
                 SpringFactory.eINSTANCE.createToDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Tokenize(),
                 SpringFactory.eINSTANCE.createTokenizerExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Topic(),
                 SpringFactory.eINSTANCE.createTopicLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Transacted(),
                 SpringFactory.eINSTANCE.createTransactedDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Transform(),
                 SpringFactory.eINSTANCE.createTransformDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Unmarshal(),
                 SpringFactory.eINSTANCE.createUnmarshalDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Validate(),
                 SpringFactory.eINSTANCE.createValidateDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Weighted(),
                 SpringFactory.eINSTANCE.createWeightedLoadBalancerDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_When(),
                 SpringFactory.eINSTANCE.createWhenDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_WireTap(),
                 SpringFactory.eINSTANCE.createWireTapDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_XmlBeans(),
                 SpringFactory.eINSTANCE.createXmlBeansDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Xpath(),
                 SpringFactory.eINSTANCE.createXPathExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Xquery(),
                 SpringFactory.eINSTANCE.createXQueryExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Xstream(),
                 SpringFactory.eINSTANCE.createXStreamDataFormat()));

        newChildDescriptors.add
            (createChildParameter
                (SpringPackage.eINSTANCE.getDocumentRoot_Zip(),
                 SpringFactory.eINSTANCE.createZipDataFormat()));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify =
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Aggregate() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Property() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Aop() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_BatchResequencerConfig() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Bean() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_BeanPostProcessor() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Bindy() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_CamelContext() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Castor() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Choice() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Constant() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_ExpressionDefinition() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_ConsumerTemplate() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_ContextScan() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_ConvertBodyTo() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Crypto() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Csv() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_CustomDataFormat() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_CustomLoadBalancer() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_DataFormats() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Delay() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Description() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_DoCatch() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_DoFinally() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_DoTry() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_DynamicRouter() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_El() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Endpoint() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Enrich() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_ErrorHandler() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Export() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Expression() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Groovy() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Header() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_JavaScript() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Jxpath() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Language() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Method() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Mvel() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Ognl() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Php() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Python() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Ref() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Ruby() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Simple() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Spel() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Sql() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Tokenize() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Xpath() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Xquery() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Failover() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Filter() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Flatpack() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_From() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Gzip() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Hl7() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_IdempotentConsumer() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_InOnly() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_InOut() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Intercept() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_InterceptFrom() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_InterceptToEndpoint() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Jaxb() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Jibx() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_JmxAgent() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Json() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_KeyStoreParameters() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_LoadBalance() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Log() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Loop() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Marshal() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Multicast() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_OnCompletion() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_OnException() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Otherwise() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_PackageScan() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Pgp() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Pipeline() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Policy() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_PollEnrich() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Process() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Properties() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Template() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_PropertyPlaceholder() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Proxy() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_RedeliveryPolicyProfile() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_RouteContext() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_ThreadPool() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Protobuf() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Random() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_RecipientList() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_RedeliveryPolicy() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_RemoveHeader() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_RemoveHeaders() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_RemoveProperty() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Resequence() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Rollback() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_RoundRobin() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_RouteBuilder() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_RouteContextRef() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Route() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Routes() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_RoutingSlip() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Rss() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Sample() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_SecureRandomParameters() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Serialization() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_SetBody() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_SetExchangePattern() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_SetFaultBody() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_SetHeader() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_SetOutHeader() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_SetProperty() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Soapjaxb() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Sort() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Split() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_SslContextParameters() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Sticky() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Stop() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_StreamResequencerConfig() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_String() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Syslog() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_ThreadPoolProfile() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Threads() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Throttle() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_ThrowException() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_TidyMarkup() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_To() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Topic() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Transacted() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Transform() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Unmarshal() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Validate() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Weighted() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_When() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_WireTap() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_XmlBeans() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_SecureXML() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Xstream() ||
            childFeature == SpringPackage.eINSTANCE.getDocumentRoot_Zip();

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return Switchyard_1EditPlugin.INSTANCE;
    }

}
