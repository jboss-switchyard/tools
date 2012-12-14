/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.file;

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
 * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileFactory
 * @model kind="package"
 * @generated
 */
public interface FilePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "file";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "urn:switchyard-component-camel-file:config:1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "file";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    FilePackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl.init();

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.CamelFileBindingTypeImpl <em>Camel File Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.CamelFileBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl#getCamelFileBindingType()
     * @generated
     */
    int CAMEL_FILE_BINDING_TYPE = 0;

    /**
     * The feature id for the '<em><b>Consume</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__CONSUME = 0;

    /**
     * The feature id for the '<em><b>Produce</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__PRODUCE = 1;

    /**
     * The number of structural features of the '<em>Camel File Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl <em>Consumer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl#getFileConsumerType()
     * @generated
     */
    int FILE_CONSUMER_TYPE = 1;

    /**
     * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__INITIAL_DELAY = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE__INITIAL_DELAY;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__DELAY = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE__DELAY;

    /**
     * The feature id for the '<em><b>Use Fixed Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__USE_FIXED_DELAY = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE__USE_FIXED_DELAY;

    /**
     * The feature id for the '<em><b>Send Empty Message When Idle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE;

    /**
     * The feature id for the '<em><b>Time Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__TIME_UNIT = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE__TIME_UNIT;

    /**
     * The feature id for the '<em><b>Max Messages Per Poll</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Delete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__DELETE = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Recursive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__RECURSIVE = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Noop</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__NOOP = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Pre Move</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__PRE_MOVE = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Move</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__MOVE = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Move Failed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__MOVE_FAILED = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Include</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__INCLUDE = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Exclude</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__EXCLUDE = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Idempotent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__IDEMPOTENT = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Idempotent Repository</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>In Progress Repository</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__FILTER = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Sorter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__SORTER = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Sort By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__SORT_BY = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Read Lock</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__READ_LOCK = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Read Lock Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Read Lock Check Interval</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Exclusive Read Lock Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Process Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__PROCESS_STRATEGY = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 19;

    /**
     * The feature id for the '<em><b>Starting Directory Must Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 20;

    /**
     * The feature id for the '<em><b>Directory Must Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 21;

    /**
     * The feature id for the '<em><b>Done File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__DONE_FILE_NAME = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 22;

    /**
     * The number of structural features of the '<em>Consumer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE_FEATURE_COUNT = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 23;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileProducerTypeImpl <em>Producer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileProducerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl#getFileProducerType()
     * @generated
     */
    int FILE_PRODUCER_TYPE = 2;

    /**
     * The feature id for the '<em><b>File Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_PRODUCER_TYPE__FILE_EXIST = CamelPackage.GENERIC_FILE_PRODUCER_TYPE__FILE_EXIST;

    /**
     * The feature id for the '<em><b>Temp Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_PRODUCER_TYPE__TEMP_PREFIX = CamelPackage.GENERIC_FILE_PRODUCER_TYPE__TEMP_PREFIX;

    /**
     * The feature id for the '<em><b>Temp File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_PRODUCER_TYPE__TEMP_FILE_NAME = CamelPackage.GENERIC_FILE_PRODUCER_TYPE__TEMP_FILE_NAME;

    /**
     * The feature id for the '<em><b>Keep Last Modified</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED = CamelPackage.GENERIC_FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED;

    /**
     * The feature id for the '<em><b>Eager Delete Target File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE = CamelPackage.GENERIC_FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE;

    /**
     * The feature id for the '<em><b>Done File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_PRODUCER_TYPE__DONE_FILE_NAME = CamelPackage.GENERIC_FILE_PRODUCER_TYPE__DONE_FILE_NAME;

    /**
     * The number of structural features of the '<em>Producer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_PRODUCER_TYPE_FEATURE_COUNT = CamelPackage.GENERIC_FILE_PRODUCER_TYPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 3;

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
     * The feature id for the '<em><b>Binding File</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_FILE = 3;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 4;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType <em>Camel File Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel File Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType
     * @generated
     */
    EClass getCamelFileBindingType();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getConsume <em>Consume</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Consume</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getConsume()
     * @see #getCamelFileBindingType()
     * @generated
     */
    EReference getCamelFileBindingType_Consume();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getProduce <em>Produce</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Produce</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType#getProduce()
     * @see #getCamelFileBindingType()
     * @generated
     */
    EReference getCamelFileBindingType_Produce();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType <em>Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Consumer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileConsumerType
     * @generated
     */
    EClass getFileConsumerType();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType <em>Producer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Producer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.FileProducerType
     * @generated
     */
    EClass getFileProducerType();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.file.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.camel.file.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.file.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.file.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.file.DocumentRoot#getBindingFile <em>Binding File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding File</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.file.DocumentRoot#getBindingFile()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingFile();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    FileFactory getFileFactory();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.CamelFileBindingTypeImpl <em>Camel File Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.CamelFileBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl#getCamelFileBindingType()
         * @generated
         */
        EClass CAMEL_FILE_BINDING_TYPE = eINSTANCE.getCamelFileBindingType();

        /**
         * The meta object literal for the '<em><b>Consume</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_FILE_BINDING_TYPE__CONSUME = eINSTANCE.getCamelFileBindingType_Consume();

        /**
         * The meta object literal for the '<em><b>Produce</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_FILE_BINDING_TYPE__PRODUCE = eINSTANCE.getCamelFileBindingType_Produce();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl <em>Consumer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileConsumerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl#getFileConsumerType()
         * @generated
         */
        EClass FILE_CONSUMER_TYPE = eINSTANCE.getFileConsumerType();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileProducerTypeImpl <em>Producer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FileProducerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl#getFileProducerType()
         * @generated
         */
        EClass FILE_PRODUCER_TYPE = eINSTANCE.getFileProducerType();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.file.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.file.impl.FilePackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Binding File</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_FILE = eINSTANCE.getDocumentRoot_BindingFile();

    }

} //FilePackage
