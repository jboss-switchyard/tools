/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.amqp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.switchyard.tools.models.switchyard1_0.camel.core.CamelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.AmqpFactory
 * @model kind="package"
 * @generated
 */
public interface AmqpPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "amqp";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "urn:switchyard-component-camel-amqp:config:1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "amqp";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AmqpPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.AmqpPackageImpl.init();

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.CamelAmqpBindingTypeImpl <em>Camel Amqp Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.CamelAmqpBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.AmqpPackageImpl#getCamelAmqpBindingType()
     * @generated
     */
    int CAMEL_AMQP_BINDING_TYPE = 0;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__DOCUMENTATION = CamelPackage.JMS_BINDING_TYPE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__ANY_ATTRIBUTE = CamelPackage.JMS_BINDING_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__WIRE_FORMAT_GROUP = CamelPackage.JMS_BINDING_TYPE__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__WIRE_FORMAT = CamelPackage.JMS_BINDING_TYPE__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__OPERATION_SELECTOR_GROUP = CamelPackage.JMS_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__OPERATION_SELECTOR = CamelPackage.JMS_BINDING_TYPE__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__NAME = CamelPackage.JMS_BINDING_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__POLICY_SETS = CamelPackage.JMS_BINDING_TYPE__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__REQUIRES = CamelPackage.JMS_BINDING_TYPE__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__URI = CamelPackage.JMS_BINDING_TYPE__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__CONTEXT_MAPPER = CamelPackage.JMS_BINDING_TYPE__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__MESSAGE_COMPOSER = CamelPackage.JMS_BINDING_TYPE__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Queue</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__QUEUE = CamelPackage.JMS_BINDING_TYPE__QUEUE;

    /**
     * The feature id for the '<em><b>Topic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__TOPIC = CamelPackage.JMS_BINDING_TYPE__TOPIC;

    /**
     * The feature id for the '<em><b>Connection Factory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__CONNECTION_FACTORY = CamelPackage.JMS_BINDING_TYPE__CONNECTION_FACTORY;

    /**
     * The feature id for the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__USERNAME = CamelPackage.JMS_BINDING_TYPE__USERNAME;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__PASSWORD = CamelPackage.JMS_BINDING_TYPE__PASSWORD;

    /**
     * The feature id for the '<em><b>Client Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__CLIENT_ID = CamelPackage.JMS_BINDING_TYPE__CLIENT_ID;

    /**
     * The feature id for the '<em><b>Durable Subscription Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__DURABLE_SUBSCRIPTION_NAME = CamelPackage.JMS_BINDING_TYPE__DURABLE_SUBSCRIPTION_NAME;

    /**
     * The feature id for the '<em><b>Concurrent Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__CONCURRENT_CONSUMERS = CamelPackage.JMS_BINDING_TYPE__CONCURRENT_CONSUMERS;

    /**
     * The feature id for the '<em><b>Max Concurrent Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__MAX_CONCURRENT_CONSUMERS = CamelPackage.JMS_BINDING_TYPE__MAX_CONCURRENT_CONSUMERS;

    /**
     * The feature id for the '<em><b>Disable Reply To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__DISABLE_REPLY_TO = CamelPackage.JMS_BINDING_TYPE__DISABLE_REPLY_TO;

    /**
     * The feature id for the '<em><b>Preserve Message Qos</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__PRESERVE_MESSAGE_QOS = CamelPackage.JMS_BINDING_TYPE__PRESERVE_MESSAGE_QOS;

    /**
     * The feature id for the '<em><b>Delivery Persistent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__DELIVERY_PERSISTENT = CamelPackage.JMS_BINDING_TYPE__DELIVERY_PERSISTENT;

    /**
     * The feature id for the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__PRIORITY = CamelPackage.JMS_BINDING_TYPE__PRIORITY;

    /**
     * The feature id for the '<em><b>Explicit Qos Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__EXPLICIT_QOS_ENABLED = CamelPackage.JMS_BINDING_TYPE__EXPLICIT_QOS_ENABLED;

    /**
     * The feature id for the '<em><b>Reply To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__REPLY_TO = CamelPackage.JMS_BINDING_TYPE__REPLY_TO;

    /**
     * The feature id for the '<em><b>Reply To Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__REPLY_TO_TYPE = CamelPackage.JMS_BINDING_TYPE__REPLY_TO_TYPE;

    /**
     * The feature id for the '<em><b>Request Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__REQUEST_TIMEOUT = CamelPackage.JMS_BINDING_TYPE__REQUEST_TIMEOUT;

    /**
     * The feature id for the '<em><b>Selector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__SELECTOR = CamelPackage.JMS_BINDING_TYPE__SELECTOR;

    /**
     * The feature id for the '<em><b>Time To Live</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__TIME_TO_LIVE = CamelPackage.JMS_BINDING_TYPE__TIME_TO_LIVE;

    /**
     * The feature id for the '<em><b>Transacted</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__TRANSACTED = CamelPackage.JMS_BINDING_TYPE__TRANSACTED;

    /**
     * The feature id for the '<em><b>Transaction Manager</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__TRANSACTION_MANAGER = CamelPackage.JMS_BINDING_TYPE__TRANSACTION_MANAGER;

    /**
     * The number of structural features of the '<em>Camel Amqp Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE_FEATURE_COUNT = CamelPackage.JMS_BINDING_TYPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.AmqpPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 1;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIXED = 0;

    /**
     * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

    /**
     * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

    /**
     * The feature id for the '<em><b>Binding Amqp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_AMQP = 3;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 4;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType <em>Camel Amqp Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Amqp Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType
     * @generated
     */
    EClass getCamelAmqpBindingType();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.DocumentRoot#getBindingAmqp <em>Binding Amqp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Amqp</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.DocumentRoot#getBindingAmqp()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingAmqp();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    AmqpFactory getAmqpFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.CamelAmqpBindingTypeImpl <em>Camel Amqp Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.CamelAmqpBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.AmqpPackageImpl#getCamelAmqpBindingType()
         * @generated
         */
        EClass CAMEL_AMQP_BINDING_TYPE = eINSTANCE.getCamelAmqpBindingType();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.AmqpPackageImpl#getDocumentRoot()
         * @generated
         */
        EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

        /**
         * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

        /**
         * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

        /**
         * The meta object literal for the '<em><b>Binding Amqp</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_AMQP = eINSTANCE.getDocumentRoot_BindingAmqp();

    }

} //AmqpPackage
