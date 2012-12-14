/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.jpa;

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
 * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaFactory
 * @model kind="package"
 * @generated
 */
public interface JpaPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "jpa";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "urn:switchyard-component-camel-jpa:config:1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "jpa";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    JpaPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl.init();

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 0;

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
     * The feature id for the '<em><b>Binding JPA</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_JPA = 3;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaProducerTypeImpl <em>Producer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaProducerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getJpaProducerType()
     * @generated
     */
    int JPA_PRODUCER_TYPE = 1;

    /**
     * The feature id for the '<em><b>Flush On Send</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_PRODUCER_TYPE__FLUSH_ON_SEND = 0;

    /**
     * The feature id for the '<em><b>Use Persist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_PRODUCER_TYPE__USE_PERSIST = 1;

    /**
     * The number of structural features of the '<em>Producer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_PRODUCER_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl <em>Consumer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getJpaConsumerType()
     * @generated
     */
    int JPA_CONSUMER_TYPE = 2;

    /**
     * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__INITIAL_DELAY = CamelPackage.SCHEDULED_BATCH_POLL_CONSUMER_TYPE__INITIAL_DELAY;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__DELAY = CamelPackage.SCHEDULED_BATCH_POLL_CONSUMER_TYPE__DELAY;

    /**
     * The feature id for the '<em><b>Use Fixed Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__USE_FIXED_DELAY = CamelPackage.SCHEDULED_BATCH_POLL_CONSUMER_TYPE__USE_FIXED_DELAY;

    /**
     * The feature id for the '<em><b>Send Empty Message When Idle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE = CamelPackage.SCHEDULED_BATCH_POLL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE;

    /**
     * The feature id for the '<em><b>Time Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__TIME_UNIT = CamelPackage.SCHEDULED_BATCH_POLL_CONSUMER_TYPE__TIME_UNIT;

    /**
     * The feature id for the '<em><b>Max Messages Per Poll</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL = CamelPackage.SCHEDULED_BATCH_POLL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL;

    /**
     * The feature id for the '<em><b>Consume Delete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__CONSUME_DELETE = CamelPackage.SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Consume Lock Entity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__CONSUME_LOCK_ENTITY = CamelPackage.SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Maximum Results</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__MAXIMUM_RESULTS = CamelPackage.SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Consumer Query</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__CONSUMER_QUERY = CamelPackage.SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Consumer Named Query</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__CONSUMER_NAMED_QUERY = CamelPackage.SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Consumer Native Query</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__CONSUMER_NATIVE_QUERY = CamelPackage.SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Consumer Result Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__CONSUMER_RESULT_CLASS = CamelPackage.SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Consumer Transacted</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__CONSUMER_TRANSACTED = CamelPackage.SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Consumer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE_FEATURE_COUNT = CamelPackage.SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 8;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.CamelJPABindingTypeImpl <em>Camel JPA Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.CamelJPABindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getCamelJPABindingType()
     * @generated
     */
    int CAMEL_JPA_BINDING_TYPE = 3;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__DOCUMENTATION = CamelPackage.BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__ANY_ATTRIBUTE = CamelPackage.BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__WIRE_FORMAT_GROUP = CamelPackage.BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__WIRE_FORMAT = CamelPackage.BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__OPERATION_SELECTOR_GROUP = CamelPackage.BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__OPERATION_SELECTOR = CamelPackage.BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__NAME = CamelPackage.BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__POLICY_SETS = CamelPackage.BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__REQUIRES = CamelPackage.BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__URI = CamelPackage.BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__CONTEXT_MAPPER = CamelPackage.BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__MESSAGE_COMPOSER = CamelPackage.BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Entity Class Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__ENTITY_CLASS_NAME = CamelPackage.BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Persistence Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__PERSISTENCE_UNIT = CamelPackage.BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Transaction Manager</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__TRANSACTION_MANAGER = CamelPackage.BASE_CAMEL_BINDING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Consume</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__CONSUME = CamelPackage.BASE_CAMEL_BINDING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Produce</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__PRODUCE = CamelPackage.BASE_CAMEL_BINDING_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Camel JPA Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE_FEATURE_COUNT = CamelPackage.BASE_CAMEL_BINDING_FEATURE_COUNT + 5;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.DocumentRoot#getBindingJPA <em>Binding JPA</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding JPA</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.DocumentRoot#getBindingJPA()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingJPA();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType <em>Producer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Producer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType
     * @generated
     */
    EClass getJpaProducerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType#getFlushOnSend <em>Flush On Send</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Flush On Send</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType#getFlushOnSend()
     * @see #getJpaProducerType()
     * @generated
     */
    EAttribute getJpaProducerType_FlushOnSend();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType#getUsePersist <em>Use Persist</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Persist</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType#getUsePersist()
     * @see #getJpaProducerType()
     * @generated
     */
    EAttribute getJpaProducerType_UsePersist();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType <em>Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Consumer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType
     * @generated
     */
    EClass getJpaConsumerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumeDelete <em>Consume Delete</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Consume Delete</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumeDelete()
     * @see #getJpaConsumerType()
     * @generated
     */
    EAttribute getJpaConsumerType_ConsumeDelete();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumeLockEntity <em>Consume Lock Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Consume Lock Entity</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumeLockEntity()
     * @see #getJpaConsumerType()
     * @generated
     */
    EAttribute getJpaConsumerType_ConsumeLockEntity();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getMaximumResults <em>Maximum Results</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Maximum Results</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getMaximumResults()
     * @see #getJpaConsumerType()
     * @generated
     */
    EAttribute getJpaConsumerType_MaximumResults();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerQuery <em>Consumer Query</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Consumer Query</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerQuery()
     * @see #getJpaConsumerType()
     * @generated
     */
    EAttribute getJpaConsumerType_ConsumerQuery();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerNamedQuery <em>Consumer Named Query</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Consumer Named Query</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerNamedQuery()
     * @see #getJpaConsumerType()
     * @generated
     */
    EAttribute getJpaConsumerType_ConsumerNamedQuery();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerNativeQuery <em>Consumer Native Query</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Consumer Native Query</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerNativeQuery()
     * @see #getJpaConsumerType()
     * @generated
     */
    EAttribute getJpaConsumerType_ConsumerNativeQuery();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerResultClass <em>Consumer Result Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Consumer Result Class</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerResultClass()
     * @see #getJpaConsumerType()
     * @generated
     */
    EAttribute getJpaConsumerType_ConsumerResultClass();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerTransacted <em>Consumer Transacted</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Consumer Transacted</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerTransacted()
     * @see #getJpaConsumerType()
     * @generated
     */
    EAttribute getJpaConsumerType_ConsumerTransacted();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJPABindingType <em>Camel JPA Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel JPA Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJPABindingType
     * @generated
     */
    EClass getCamelJPABindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJPABindingType#getEntityClassName <em>Entity Class Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Entity Class Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJPABindingType#getEntityClassName()
     * @see #getCamelJPABindingType()
     * @generated
     */
    EAttribute getCamelJPABindingType_EntityClassName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJPABindingType#getPersistenceUnit <em>Persistence Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Persistence Unit</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJPABindingType#getPersistenceUnit()
     * @see #getCamelJPABindingType()
     * @generated
     */
    EAttribute getCamelJPABindingType_PersistenceUnit();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJPABindingType#getTransactionManager <em>Transaction Manager</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transaction Manager</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJPABindingType#getTransactionManager()
     * @see #getCamelJPABindingType()
     * @generated
     */
    EAttribute getCamelJPABindingType_TransactionManager();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJPABindingType#getConsume <em>Consume</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Consume</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJPABindingType#getConsume()
     * @see #getCamelJPABindingType()
     * @generated
     */
    EReference getCamelJPABindingType_Consume();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJPABindingType#getProduce <em>Produce</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Produce</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJPABindingType#getProduce()
     * @see #getCamelJPABindingType()
     * @generated
     */
    EReference getCamelJPABindingType_Produce();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    JpaFactory getJpaFactory();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Binding JPA</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_JPA = eINSTANCE.getDocumentRoot_BindingJPA();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaProducerTypeImpl <em>Producer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaProducerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getJpaProducerType()
         * @generated
         */
        EClass JPA_PRODUCER_TYPE = eINSTANCE.getJpaProducerType();

        /**
         * The meta object literal for the '<em><b>Flush On Send</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_PRODUCER_TYPE__FLUSH_ON_SEND = eINSTANCE.getJpaProducerType_FlushOnSend();

        /**
         * The meta object literal for the '<em><b>Use Persist</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_PRODUCER_TYPE__USE_PERSIST = eINSTANCE.getJpaProducerType_UsePersist();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl <em>Consumer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getJpaConsumerType()
         * @generated
         */
        EClass JPA_CONSUMER_TYPE = eINSTANCE.getJpaConsumerType();

        /**
         * The meta object literal for the '<em><b>Consume Delete</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_CONSUMER_TYPE__CONSUME_DELETE = eINSTANCE.getJpaConsumerType_ConsumeDelete();

        /**
         * The meta object literal for the '<em><b>Consume Lock Entity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_CONSUMER_TYPE__CONSUME_LOCK_ENTITY = eINSTANCE.getJpaConsumerType_ConsumeLockEntity();

        /**
         * The meta object literal for the '<em><b>Maximum Results</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_CONSUMER_TYPE__MAXIMUM_RESULTS = eINSTANCE.getJpaConsumerType_MaximumResults();

        /**
         * The meta object literal for the '<em><b>Consumer Query</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_CONSUMER_TYPE__CONSUMER_QUERY = eINSTANCE.getJpaConsumerType_ConsumerQuery();

        /**
         * The meta object literal for the '<em><b>Consumer Named Query</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_CONSUMER_TYPE__CONSUMER_NAMED_QUERY = eINSTANCE.getJpaConsumerType_ConsumerNamedQuery();

        /**
         * The meta object literal for the '<em><b>Consumer Native Query</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_CONSUMER_TYPE__CONSUMER_NATIVE_QUERY = eINSTANCE.getJpaConsumerType_ConsumerNativeQuery();

        /**
         * The meta object literal for the '<em><b>Consumer Result Class</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_CONSUMER_TYPE__CONSUMER_RESULT_CLASS = eINSTANCE.getJpaConsumerType_ConsumerResultClass();

        /**
         * The meta object literal for the '<em><b>Consumer Transacted</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_CONSUMER_TYPE__CONSUMER_TRANSACTED = eINSTANCE.getJpaConsumerType_ConsumerTransacted();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.CamelJPABindingTypeImpl <em>Camel JPA Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.CamelJPABindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getCamelJPABindingType()
         * @generated
         */
        EClass CAMEL_JPA_BINDING_TYPE = eINSTANCE.getCamelJPABindingType();

        /**
         * The meta object literal for the '<em><b>Entity Class Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JPA_BINDING_TYPE__ENTITY_CLASS_NAME = eINSTANCE.getCamelJPABindingType_EntityClassName();

        /**
         * The meta object literal for the '<em><b>Persistence Unit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JPA_BINDING_TYPE__PERSISTENCE_UNIT = eINSTANCE.getCamelJPABindingType_PersistenceUnit();

        /**
         * The meta object literal for the '<em><b>Transaction Manager</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JPA_BINDING_TYPE__TRANSACTION_MANAGER = eINSTANCE.getCamelJPABindingType_TransactionManager();

        /**
         * The meta object literal for the '<em><b>Consume</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_JPA_BINDING_TYPE__CONSUME = eINSTANCE.getCamelJPABindingType_Consume();

        /**
         * The meta object literal for the '<em><b>Produce</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_JPA_BINDING_TYPE__PRODUCE = eINSTANCE.getCamelJPABindingType_Produce();

    }

} //JpaPackage
