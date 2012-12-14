/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.atom;

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
 * @see org.switchyard.tools.models.switchyard1_0.camel.atom.AtomFactory
 * @model kind="package"
 * @generated
 */
public interface AtomPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "atom";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "urn:switchyard-component-camel-atom:config:1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "atom";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AtomPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.atom.impl.AtomPackageImpl.init();

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.impl.CamelAtomBindingTypeImpl <em>Camel Atom Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.impl.CamelAtomBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.impl.AtomPackageImpl#getCamelAtomBindingType()
     * @generated
     */
    int CAMEL_ATOM_BINDING_TYPE = 0;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_ATOM_BINDING_TYPE__DOCUMENTATION = CamelPackage.BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_ATOM_BINDING_TYPE__ANY_ATTRIBUTE = CamelPackage.BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_ATOM_BINDING_TYPE__WIRE_FORMAT_GROUP = CamelPackage.BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_ATOM_BINDING_TYPE__WIRE_FORMAT = CamelPackage.BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_ATOM_BINDING_TYPE__OPERATION_SELECTOR_GROUP = CamelPackage.BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_ATOM_BINDING_TYPE__OPERATION_SELECTOR = CamelPackage.BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_ATOM_BINDING_TYPE__NAME = CamelPackage.BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_ATOM_BINDING_TYPE__POLICY_SETS = CamelPackage.BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_ATOM_BINDING_TYPE__REQUIRES = CamelPackage.BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_ATOM_BINDING_TYPE__URI = CamelPackage.BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_ATOM_BINDING_TYPE__CONTEXT_MAPPER = CamelPackage.BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_ATOM_BINDING_TYPE__MESSAGE_COMPOSER = CamelPackage.BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Feed URI</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_ATOM_BINDING_TYPE__FEED_URI = CamelPackage.BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Split Entries</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_ATOM_BINDING_TYPE__SPLIT_ENTRIES = CamelPackage.BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_ATOM_BINDING_TYPE__FILTER = CamelPackage.BASE_CAMEL_BINDING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Last Update</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_ATOM_BINDING_TYPE__LAST_UPDATE = CamelPackage.BASE_CAMEL_BINDING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Throttle Entries</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_ATOM_BINDING_TYPE__THROTTLE_ENTRIES = CamelPackage.BASE_CAMEL_BINDING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Feed Header</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_ATOM_BINDING_TYPE__FEED_HEADER = CamelPackage.BASE_CAMEL_BINDING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Sort Entries</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_ATOM_BINDING_TYPE__SORT_ENTRIES = CamelPackage.BASE_CAMEL_BINDING_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Consume</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_ATOM_BINDING_TYPE__CONSUME = CamelPackage.BASE_CAMEL_BINDING_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Camel Atom Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_ATOM_BINDING_TYPE_FEATURE_COUNT = CamelPackage.BASE_CAMEL_BINDING_FEATURE_COUNT + 8;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.impl.AtomScheduledPollConsumerTypeImpl <em>Scheduled Poll Consumer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.impl.AtomScheduledPollConsumerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.impl.AtomPackageImpl#getAtomScheduledPollConsumerType()
     * @generated
     */
    int ATOM_SCHEDULED_POLL_CONSUMER_TYPE = 1;

    /**
     * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATOM_SCHEDULED_POLL_CONSUMER_TYPE__INITIAL_DELAY = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE__INITIAL_DELAY;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATOM_SCHEDULED_POLL_CONSUMER_TYPE__DELAY = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE__DELAY;

    /**
     * The feature id for the '<em><b>Use Fixed Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATOM_SCHEDULED_POLL_CONSUMER_TYPE__USE_FIXED_DELAY = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE__USE_FIXED_DELAY;

    /**
     * The feature id for the '<em><b>Send Empty Message When Idle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATOM_SCHEDULED_POLL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE;

    /**
     * The feature id for the '<em><b>Time Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATOM_SCHEDULED_POLL_CONSUMER_TYPE__TIME_UNIT = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE__TIME_UNIT;

    /**
     * The number of structural features of the '<em>Scheduled Poll Consumer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATOM_SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT = CamelPackage.SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.impl.AtomPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 2;

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
     * The feature id for the '<em><b>Binding Atom</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_ATOM = 3;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 4;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType <em>Camel Atom Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Atom Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType
     * @generated
     */
    EClass getCamelAtomBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getFeedURI <em>Feed URI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Feed URI</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getFeedURI()
     * @see #getCamelAtomBindingType()
     * @generated
     */
    EAttribute getCamelAtomBindingType_FeedURI();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getSplitEntries <em>Split Entries</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Split Entries</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getSplitEntries()
     * @see #getCamelAtomBindingType()
     * @generated
     */
    EAttribute getCamelAtomBindingType_SplitEntries();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getFilter <em>Filter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Filter</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getFilter()
     * @see #getCamelAtomBindingType()
     * @generated
     */
    EAttribute getCamelAtomBindingType_Filter();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getLastUpdate <em>Last Update</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Last Update</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getLastUpdate()
     * @see #getCamelAtomBindingType()
     * @generated
     */
    EAttribute getCamelAtomBindingType_LastUpdate();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getThrottleEntries <em>Throttle Entries</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Throttle Entries</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getThrottleEntries()
     * @see #getCamelAtomBindingType()
     * @generated
     */
    EAttribute getCamelAtomBindingType_ThrottleEntries();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getFeedHeader <em>Feed Header</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Feed Header</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getFeedHeader()
     * @see #getCamelAtomBindingType()
     * @generated
     */
    EAttribute getCamelAtomBindingType_FeedHeader();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getSortEntries <em>Sort Entries</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sort Entries</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getSortEntries()
     * @see #getCamelAtomBindingType()
     * @generated
     */
    EAttribute getCamelAtomBindingType_SortEntries();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getConsume <em>Consume</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Consume</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType#getConsume()
     * @see #getCamelAtomBindingType()
     * @generated
     */
    EReference getCamelAtomBindingType_Consume();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.AtomScheduledPollConsumerType <em>Scheduled Poll Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scheduled Poll Consumer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.AtomScheduledPollConsumerType
     * @generated
     */
    EClass getAtomScheduledPollConsumerType();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.DocumentRoot#getBindingAtom <em>Binding Atom</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Atom</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.atom.DocumentRoot#getBindingAtom()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingAtom();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    AtomFactory getAtomFactory();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.impl.CamelAtomBindingTypeImpl <em>Camel Atom Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.atom.impl.CamelAtomBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.atom.impl.AtomPackageImpl#getCamelAtomBindingType()
         * @generated
         */
        EClass CAMEL_ATOM_BINDING_TYPE = eINSTANCE.getCamelAtomBindingType();

        /**
         * The meta object literal for the '<em><b>Feed URI</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_ATOM_BINDING_TYPE__FEED_URI = eINSTANCE.getCamelAtomBindingType_FeedURI();

        /**
         * The meta object literal for the '<em><b>Split Entries</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_ATOM_BINDING_TYPE__SPLIT_ENTRIES = eINSTANCE.getCamelAtomBindingType_SplitEntries();

        /**
         * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_ATOM_BINDING_TYPE__FILTER = eINSTANCE.getCamelAtomBindingType_Filter();

        /**
         * The meta object literal for the '<em><b>Last Update</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_ATOM_BINDING_TYPE__LAST_UPDATE = eINSTANCE.getCamelAtomBindingType_LastUpdate();

        /**
         * The meta object literal for the '<em><b>Throttle Entries</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_ATOM_BINDING_TYPE__THROTTLE_ENTRIES = eINSTANCE.getCamelAtomBindingType_ThrottleEntries();

        /**
         * The meta object literal for the '<em><b>Feed Header</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_ATOM_BINDING_TYPE__FEED_HEADER = eINSTANCE.getCamelAtomBindingType_FeedHeader();

        /**
         * The meta object literal for the '<em><b>Sort Entries</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_ATOM_BINDING_TYPE__SORT_ENTRIES = eINSTANCE.getCamelAtomBindingType_SortEntries();

        /**
         * The meta object literal for the '<em><b>Consume</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_ATOM_BINDING_TYPE__CONSUME = eINSTANCE.getCamelAtomBindingType_Consume();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.impl.AtomScheduledPollConsumerTypeImpl <em>Scheduled Poll Consumer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.atom.impl.AtomScheduledPollConsumerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.atom.impl.AtomPackageImpl#getAtomScheduledPollConsumerType()
         * @generated
         */
        EClass ATOM_SCHEDULED_POLL_CONSUMER_TYPE = eINSTANCE.getAtomScheduledPollConsumerType();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.atom.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.atom.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.atom.impl.AtomPackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Binding Atom</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_ATOM = eINSTANCE.getDocumentRoot_BindingAtom();

    }

} //AtomPackage
