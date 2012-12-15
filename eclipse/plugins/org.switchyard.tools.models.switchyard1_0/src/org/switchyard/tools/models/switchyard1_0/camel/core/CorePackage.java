/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;

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
 * @see org.switchyard.tools.models.switchyard1_0.camel.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "core";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "urn:switchyard-component-camel-core:config:1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "camel";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CorePackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.core.impl.CorePackageImpl.init();

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.BaseCamelBindingImpl <em>Base Camel Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.BaseCamelBindingImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CorePackageImpl#getBaseCamelBinding()
     * @generated
     */
    int BASE_CAMEL_BINDING = 0;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__DOCUMENTATION = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__ANY_ATTRIBUTE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__WIRE_FORMAT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__OPERATION_SELECTOR = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__NAME = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__POLICY_SETS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__REQUIRES = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__URI = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__CONTEXT_MAPPER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__MESSAGE_COMPOSER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER;

    /**
     * The number of structural features of the '<em>Base Camel Binding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelBindingTypeImpl <em>Camel Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CorePackageImpl#getCamelBindingType()
     * @generated
     */
    int CAMEL_BINDING_TYPE = 1;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__DOCUMENTATION = BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__ANY_ATTRIBUTE = BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__WIRE_FORMAT_GROUP = BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__WIRE_FORMAT = BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__OPERATION_SELECTOR_GROUP = BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__OPERATION_SELECTOR = BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__NAME = BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__POLICY_SETS = BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__REQUIRES = BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__URI = BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Config URI</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__CONFIG_URI = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Camel Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelDirectBindingTypeImpl <em>Camel Direct Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelDirectBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CorePackageImpl#getCamelDirectBindingType()
     * @generated
     */
    int CAMEL_DIRECT_BINDING_TYPE = 2;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__DOCUMENTATION = BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__ANY_ATTRIBUTE = BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__WIRE_FORMAT_GROUP = BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__WIRE_FORMAT = BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__OPERATION_SELECTOR_GROUP = BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__OPERATION_SELECTOR = BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__NAME = BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__POLICY_SETS = BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__REQUIRES = BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__URI = BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Name Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__NAME_ELEMENT = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Camel Direct Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelTimerBindingTypeImpl <em>Camel Timer Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelTimerBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CorePackageImpl#getCamelTimerBindingType()
     * @generated
     */
    int CAMEL_TIMER_BINDING_TYPE = 3;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__DOCUMENTATION = BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__ANY_ATTRIBUTE = BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__WIRE_FORMAT_GROUP = BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__WIRE_FORMAT = BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__OPERATION_SELECTOR_GROUP = BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__OPERATION_SELECTOR = BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__NAME = BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__POLICY_SETS = BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__REQUIRES = BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__URI = BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Camel Binding Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__CAMEL_BINDING_NAME = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__TIME = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__PATTERN = BASE_CAMEL_BINDING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Period</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__PERIOD = BASE_CAMEL_BINDING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__DELAY = BASE_CAMEL_BINDING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Fixed Rate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__FIXED_RATE = BASE_CAMEL_BINDING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Daemon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__DAEMON = BASE_CAMEL_BINDING_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Camel Timer Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 7;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelSedaBindingTypeImpl <em>Camel Seda Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelSedaBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CorePackageImpl#getCamelSedaBindingType()
     * @generated
     */
    int CAMEL_SEDA_BINDING_TYPE = 4;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__DOCUMENTATION = BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__ANY_ATTRIBUTE = BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__WIRE_FORMAT_GROUP = BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__WIRE_FORMAT = BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__OPERATION_SELECTOR_GROUP = BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__OPERATION_SELECTOR = BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__NAME = BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__POLICY_SETS = BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__REQUIRES = BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__URI = BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Name Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__NAME_ELEMENT = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__SIZE = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Concurrent Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__CONCURRENT_CONSUMERS = BASE_CAMEL_BINDING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Wait For Task To Complete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__WAIT_FOR_TASK_TO_COMPLETE = BASE_CAMEL_BINDING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__TIMEOUT = BASE_CAMEL_BINDING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Multiple Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__MULTIPLE_CONSUMERS = BASE_CAMEL_BINDING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Limit Concurrent Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__LIMIT_CONCURRENT_CONSUMERS = BASE_CAMEL_BINDING_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Camel Seda Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 7;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelMockBindingTypeImpl <em>Camel Mock Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelMockBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CorePackageImpl#getCamelMockBindingType()
     * @generated
     */
    int CAMEL_MOCK_BINDING_TYPE = 5;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__DOCUMENTATION = BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__ANY_ATTRIBUTE = BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__WIRE_FORMAT_GROUP = BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__WIRE_FORMAT = BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__OPERATION_SELECTOR_GROUP = BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__OPERATION_SELECTOR = BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__NAME = BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__POLICY_SETS = BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__REQUIRES = BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__URI = BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Name Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__NAME_ELEMENT = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Report Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__REPORT_GROUP = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Camel Mock Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CorePackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 6;

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
     * The feature id for the '<em><b>Binding Camel</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_CAMEL = 3;

    /**
     * The feature id for the '<em><b>Binding Direct</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_DIRECT = 4;

    /**
     * The feature id for the '<em><b>Binding Mock</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_MOCK = 5;

    /**
     * The feature id for the '<em><b>Binding Seda</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_SEDA = 6;

    /**
     * The feature id for the '<em><b>Binding Timer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_TIMER = 7;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 8;

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.BaseCamelBinding <em>Base Camel Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base Camel Binding</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.BaseCamelBinding
     * @generated
     */
    EClass getBaseCamelBinding();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelBindingType <em>Camel Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelBindingType
     * @generated
     */
    EClass getCamelBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelBindingType#getConfigURI <em>Config URI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Config URI</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelBindingType#getConfigURI()
     * @see #getCamelBindingType()
     * @generated
     */
    EAttribute getCamelBindingType_ConfigURI();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelDirectBindingType <em>Camel Direct Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Direct Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelDirectBindingType
     * @generated
     */
    EClass getCamelDirectBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelDirectBindingType#getNameElement <em>Name Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name Element</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelDirectBindingType#getNameElement()
     * @see #getCamelDirectBindingType()
     * @generated
     */
    EAttribute getCamelDirectBindingType_NameElement();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType <em>Camel Timer Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Timer Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType
     * @generated
     */
    EClass getCamelTimerBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getCamelBindingName <em>Camel Binding Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Camel Binding Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getCamelBindingName()
     * @see #getCamelTimerBindingType()
     * @generated
     */
    EAttribute getCamelTimerBindingType_CamelBindingName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getTime <em>Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getTime()
     * @see #getCamelTimerBindingType()
     * @generated
     */
    EAttribute getCamelTimerBindingType_Time();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getPattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pattern</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getPattern()
     * @see #getCamelTimerBindingType()
     * @generated
     */
    EAttribute getCamelTimerBindingType_Pattern();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getPeriod <em>Period</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Period</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getPeriod()
     * @see #getCamelTimerBindingType()
     * @generated
     */
    EAttribute getCamelTimerBindingType_Period();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getDelay <em>Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getDelay()
     * @see #getCamelTimerBindingType()
     * @generated
     */
    EAttribute getCamelTimerBindingType_Delay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getFixedRate <em>Fixed Rate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fixed Rate</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getFixedRate()
     * @see #getCamelTimerBindingType()
     * @generated
     */
    EAttribute getCamelTimerBindingType_FixedRate();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getDaemon <em>Daemon</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Daemon</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelTimerBindingType#getDaemon()
     * @see #getCamelTimerBindingType()
     * @generated
     */
    EAttribute getCamelTimerBindingType_Daemon();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType <em>Camel Seda Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Seda Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType
     * @generated
     */
    EClass getCamelSedaBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getNameElement <em>Name Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name Element</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getNameElement()
     * @see #getCamelSedaBindingType()
     * @generated
     */
    EAttribute getCamelSedaBindingType_NameElement();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getSize <em>Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Size</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getSize()
     * @see #getCamelSedaBindingType()
     * @generated
     */
    EAttribute getCamelSedaBindingType_Size();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getConcurrentConsumers <em>Concurrent Consumers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Concurrent Consumers</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getConcurrentConsumers()
     * @see #getCamelSedaBindingType()
     * @generated
     */
    EAttribute getCamelSedaBindingType_ConcurrentConsumers();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getWaitForTaskToComplete <em>Wait For Task To Complete</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Wait For Task To Complete</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getWaitForTaskToComplete()
     * @see #getCamelSedaBindingType()
     * @generated
     */
    EAttribute getCamelSedaBindingType_WaitForTaskToComplete();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getTimeout <em>Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Timeout</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getTimeout()
     * @see #getCamelSedaBindingType()
     * @generated
     */
    EAttribute getCamelSedaBindingType_Timeout();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getMultipleConsumers <em>Multiple Consumers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Multiple Consumers</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getMultipleConsumers()
     * @see #getCamelSedaBindingType()
     * @generated
     */
    EAttribute getCamelSedaBindingType_MultipleConsumers();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getLimitConcurrentConsumers <em>Limit Concurrent Consumers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Limit Concurrent Consumers</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelSedaBindingType#getLimitConcurrentConsumers()
     * @see #getCamelSedaBindingType()
     * @generated
     */
    EAttribute getCamelSedaBindingType_LimitConcurrentConsumers();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelMockBindingType <em>Camel Mock Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Mock Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelMockBindingType
     * @generated
     */
    EClass getCamelMockBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelMockBindingType#getNameElement <em>Name Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name Element</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelMockBindingType#getNameElement()
     * @see #getCamelMockBindingType()
     * @generated
     */
    EAttribute getCamelMockBindingType_NameElement();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelMockBindingType#getReportGroup <em>Report Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Report Group</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CamelMockBindingType#getReportGroup()
     * @see #getCamelMockBindingType()
     * @generated
     */
    EAttribute getCamelMockBindingType_ReportGroup();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getBindingCamel <em>Binding Camel</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Camel</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getBindingCamel()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingCamel();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getBindingDirect <em>Binding Direct</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Direct</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getBindingDirect()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingDirect();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getBindingMock <em>Binding Mock</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Mock</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getBindingMock()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingMock();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getBindingSeda <em>Binding Seda</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Seda</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getBindingSeda()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingSeda();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getBindingTimer <em>Binding Timer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Timer</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.DocumentRoot#getBindingTimer()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingTimer();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CoreFactory getCoreFactory();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.BaseCamelBindingImpl <em>Base Camel Binding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.BaseCamelBindingImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CorePackageImpl#getBaseCamelBinding()
         * @generated
         */
        EClass BASE_CAMEL_BINDING = eINSTANCE.getBaseCamelBinding();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelBindingTypeImpl <em>Camel Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CorePackageImpl#getCamelBindingType()
         * @generated
         */
        EClass CAMEL_BINDING_TYPE = eINSTANCE.getCamelBindingType();

        /**
         * The meta object literal for the '<em><b>Config URI</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_BINDING_TYPE__CONFIG_URI = eINSTANCE.getCamelBindingType_ConfigURI();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelDirectBindingTypeImpl <em>Camel Direct Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelDirectBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CorePackageImpl#getCamelDirectBindingType()
         * @generated
         */
        EClass CAMEL_DIRECT_BINDING_TYPE = eINSTANCE.getCamelDirectBindingType();

        /**
         * The meta object literal for the '<em><b>Name Element</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_DIRECT_BINDING_TYPE__NAME_ELEMENT = eINSTANCE.getCamelDirectBindingType_NameElement();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelTimerBindingTypeImpl <em>Camel Timer Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelTimerBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CorePackageImpl#getCamelTimerBindingType()
         * @generated
         */
        EClass CAMEL_TIMER_BINDING_TYPE = eINSTANCE.getCamelTimerBindingType();

        /**
         * The meta object literal for the '<em><b>Camel Binding Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_TIMER_BINDING_TYPE__CAMEL_BINDING_NAME = eINSTANCE.getCamelTimerBindingType_CamelBindingName();

        /**
         * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_TIMER_BINDING_TYPE__TIME = eINSTANCE.getCamelTimerBindingType_Time();

        /**
         * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_TIMER_BINDING_TYPE__PATTERN = eINSTANCE.getCamelTimerBindingType_Pattern();

        /**
         * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_TIMER_BINDING_TYPE__PERIOD = eINSTANCE.getCamelTimerBindingType_Period();

        /**
         * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_TIMER_BINDING_TYPE__DELAY = eINSTANCE.getCamelTimerBindingType_Delay();

        /**
         * The meta object literal for the '<em><b>Fixed Rate</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_TIMER_BINDING_TYPE__FIXED_RATE = eINSTANCE.getCamelTimerBindingType_FixedRate();

        /**
         * The meta object literal for the '<em><b>Daemon</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_TIMER_BINDING_TYPE__DAEMON = eINSTANCE.getCamelTimerBindingType_Daemon();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelSedaBindingTypeImpl <em>Camel Seda Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelSedaBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CorePackageImpl#getCamelSedaBindingType()
         * @generated
         */
        EClass CAMEL_SEDA_BINDING_TYPE = eINSTANCE.getCamelSedaBindingType();

        /**
         * The meta object literal for the '<em><b>Name Element</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SEDA_BINDING_TYPE__NAME_ELEMENT = eINSTANCE.getCamelSedaBindingType_NameElement();

        /**
         * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SEDA_BINDING_TYPE__SIZE = eINSTANCE.getCamelSedaBindingType_Size();

        /**
         * The meta object literal for the '<em><b>Concurrent Consumers</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SEDA_BINDING_TYPE__CONCURRENT_CONSUMERS = eINSTANCE.getCamelSedaBindingType_ConcurrentConsumers();

        /**
         * The meta object literal for the '<em><b>Wait For Task To Complete</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SEDA_BINDING_TYPE__WAIT_FOR_TASK_TO_COMPLETE = eINSTANCE.getCamelSedaBindingType_WaitForTaskToComplete();

        /**
         * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SEDA_BINDING_TYPE__TIMEOUT = eINSTANCE.getCamelSedaBindingType_Timeout();

        /**
         * The meta object literal for the '<em><b>Multiple Consumers</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SEDA_BINDING_TYPE__MULTIPLE_CONSUMERS = eINSTANCE.getCamelSedaBindingType_MultipleConsumers();

        /**
         * The meta object literal for the '<em><b>Limit Concurrent Consumers</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SEDA_BINDING_TYPE__LIMIT_CONCURRENT_CONSUMERS = eINSTANCE.getCamelSedaBindingType_LimitConcurrentConsumers();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelMockBindingTypeImpl <em>Camel Mock Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelMockBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CorePackageImpl#getCamelMockBindingType()
         * @generated
         */
        EClass CAMEL_MOCK_BINDING_TYPE = eINSTANCE.getCamelMockBindingType();

        /**
         * The meta object literal for the '<em><b>Name Element</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MOCK_BINDING_TYPE__NAME_ELEMENT = eINSTANCE.getCamelMockBindingType_NameElement();

        /**
         * The meta object literal for the '<em><b>Report Group</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MOCK_BINDING_TYPE__REPORT_GROUP = eINSTANCE.getCamelMockBindingType_ReportGroup();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.core.impl.CorePackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Binding Camel</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_CAMEL = eINSTANCE.getDocumentRoot_BindingCamel();

        /**
         * The meta object literal for the '<em><b>Binding Direct</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_DIRECT = eINSTANCE.getDocumentRoot_BindingDirect();

        /**
         * The meta object literal for the '<em><b>Binding Mock</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_MOCK = eINSTANCE.getDocumentRoot_BindingMock();

        /**
         * The meta object literal for the '<em><b>Binding Seda</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_SEDA = eINSTANCE.getDocumentRoot_BindingSeda();

        /**
         * The meta object literal for the '<em><b>Binding Timer</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_TIMER = eINSTANCE.getDocumentRoot_BindingTimer();

    }

} //CorePackage
