/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.quartz;

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
 * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzFactory
 * @model kind="package"
 * @generated
 */
public interface QuartzPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "quartz";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "urn:switchyard-component-camel-quartz:config:1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "quartz";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    QuartzPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.quartz.impl.QuartzPackageImpl.init();

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.impl.CamelQuartzBindingTypeImpl <em>Camel Quartz Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.impl.CamelQuartzBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.impl.QuartzPackageImpl#getCamelQuartzBindingType()
     * @generated
     */
    int CAMEL_QUARTZ_BINDING_TYPE = 0;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_QUARTZ_BINDING_TYPE__DOCUMENTATION = CamelPackage.BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_QUARTZ_BINDING_TYPE__ANY_ATTRIBUTE = CamelPackage.BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_QUARTZ_BINDING_TYPE__WIRE_FORMAT_GROUP = CamelPackage.BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_QUARTZ_BINDING_TYPE__WIRE_FORMAT = CamelPackage.BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_QUARTZ_BINDING_TYPE__OPERATION_SELECTOR_GROUP = CamelPackage.BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_QUARTZ_BINDING_TYPE__OPERATION_SELECTOR = CamelPackage.BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_QUARTZ_BINDING_TYPE__NAME = CamelPackage.BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_QUARTZ_BINDING_TYPE__POLICY_SETS = CamelPackage.BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_QUARTZ_BINDING_TYPE__REQUIRES = CamelPackage.BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_QUARTZ_BINDING_TYPE__URI = CamelPackage.BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_QUARTZ_BINDING_TYPE__CONTEXT_MAPPER = CamelPackage.BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_QUARTZ_BINDING_TYPE__MESSAGE_COMPOSER = CamelPackage.BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Camel Binding Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_QUARTZ_BINDING_TYPE__CAMEL_BINDING_NAME = CamelPackage.BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Cron</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_QUARTZ_BINDING_TYPE__CRON = CamelPackage.BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Stateful</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_QUARTZ_BINDING_TYPE__STATEFUL = CamelPackage.BASE_CAMEL_BINDING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Start Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_QUARTZ_BINDING_TYPE__START_TIME = CamelPackage.BASE_CAMEL_BINDING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>End Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_QUARTZ_BINDING_TYPE__END_TIME = CamelPackage.BASE_CAMEL_BINDING_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Camel Quartz Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_QUARTZ_BINDING_TYPE_FEATURE_COUNT = CamelPackage.BASE_CAMEL_BINDING_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.impl.QuartzPackageImpl#getDocumentRoot()
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
     * The feature id for the '<em><b>Binding Quartz</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_QUARTZ = 3;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 4;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType <em>Camel Quartz Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Quartz Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType
     * @generated
     */
    EClass getCamelQuartzBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getCamelBindingName <em>Camel Binding Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Camel Binding Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getCamelBindingName()
     * @see #getCamelQuartzBindingType()
     * @generated
     */
    EAttribute getCamelQuartzBindingType_CamelBindingName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getCron <em>Cron</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cron</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getCron()
     * @see #getCamelQuartzBindingType()
     * @generated
     */
    EAttribute getCamelQuartzBindingType_Cron();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getStateful <em>Stateful</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stateful</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getStateful()
     * @see #getCamelQuartzBindingType()
     * @generated
     */
    EAttribute getCamelQuartzBindingType_Stateful();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getStartTime <em>Start Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Start Time</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getStartTime()
     * @see #getCamelQuartzBindingType()
     * @generated
     */
    EAttribute getCamelQuartzBindingType_StartTime();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getEndTime <em>End Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>End Time</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType#getEndTime()
     * @see #getCamelQuartzBindingType()
     * @generated
     */
    EAttribute getCamelQuartzBindingType_EndTime();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.DocumentRoot#getBindingQuartz <em>Binding Quartz</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Quartz</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.DocumentRoot#getBindingQuartz()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingQuartz();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    QuartzFactory getQuartzFactory();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.impl.CamelQuartzBindingTypeImpl <em>Camel Quartz Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.impl.CamelQuartzBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.impl.QuartzPackageImpl#getCamelQuartzBindingType()
         * @generated
         */
        EClass CAMEL_QUARTZ_BINDING_TYPE = eINSTANCE.getCamelQuartzBindingType();

        /**
         * The meta object literal for the '<em><b>Camel Binding Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_QUARTZ_BINDING_TYPE__CAMEL_BINDING_NAME = eINSTANCE.getCamelQuartzBindingType_CamelBindingName();

        /**
         * The meta object literal for the '<em><b>Cron</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_QUARTZ_BINDING_TYPE__CRON = eINSTANCE.getCamelQuartzBindingType_Cron();

        /**
         * The meta object literal for the '<em><b>Stateful</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_QUARTZ_BINDING_TYPE__STATEFUL = eINSTANCE.getCamelQuartzBindingType_Stateful();

        /**
         * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_QUARTZ_BINDING_TYPE__START_TIME = eINSTANCE.getCamelQuartzBindingType_StartTime();

        /**
         * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_QUARTZ_BINDING_TYPE__END_TIME = eINSTANCE.getCamelQuartzBindingType_EndTime();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.quartz.impl.QuartzPackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Binding Quartz</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_QUARTZ = eINSTANCE.getDocumentRoot_BindingQuartz();

    }

} //QuartzPackage
