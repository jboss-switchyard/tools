/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

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
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFactory
 * @model kind="package"
 * @generated
 */
public interface CamelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "camel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:switchyard-component-camel:config:1.0";

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
	CamelPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelAtomBindingTypeImpl <em>Atom Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelAtomBindingTypeImpl
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelAtomBindingType()
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
	int CAMEL_ATOM_BINDING_TYPE__DOCUMENTATION = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_ATOM_BINDING_TYPE__ANY_ATTRIBUTE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_ATOM_BINDING_TYPE__WIRE_FORMAT_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT_GROUP;

	/**
	 * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_ATOM_BINDING_TYPE__WIRE_FORMAT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT;

	/**
	 * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_ATOM_BINDING_TYPE__OPERATION_SELECTOR_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_ATOM_BINDING_TYPE__OPERATION_SELECTOR = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_ATOM_BINDING_TYPE__NAME = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_ATOM_BINDING_TYPE__POLICY_SETS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__POLICY_SETS;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_ATOM_BINDING_TYPE__REQUIRES = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__REQUIRES;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_ATOM_BINDING_TYPE__URI = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_ATOM_BINDING_TYPE__CONTEXT_MAPPER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER;

	/**
	 * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_ATOM_BINDING_TYPE__MESSAGE_COMPOSER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER;

	/**
	 * The feature id for the '<em><b>Feed URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_ATOM_BINDING_TYPE__FEED_URI = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Split Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_ATOM_BINDING_TYPE__SPLIT_ENTRIES = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_ATOM_BINDING_TYPE__FILTER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_ATOM_BINDING_TYPE__LAST_UPDATE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Throttle Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_ATOM_BINDING_TYPE__THROTTLE_ENTRIES = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Feed Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_ATOM_BINDING_TYPE__FEED_HEADER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sort Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_ATOM_BINDING_TYPE__SORT_ENTRIES = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Consumer Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_ATOM_BINDING_TYPE__CONSUMER_DELAY = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Consumer Initial Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_ATOM_BINDING_TYPE__CONSUMER_INITIAL_DELAY = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Consumer User Fixed Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_ATOM_BINDING_TYPE__CONSUMER_USER_FIXED_DELAY = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Atom Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_ATOM_BINDING_TYPE_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelBindingTypeImpl <em>Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelBindingTypeImpl
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelBindingType()
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
	int CAMEL_BINDING_TYPE__DOCUMENTATION = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_BINDING_TYPE__ANY_ATTRIBUTE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_BINDING_TYPE__WIRE_FORMAT_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT_GROUP;

	/**
	 * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_BINDING_TYPE__WIRE_FORMAT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT;

	/**
	 * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_BINDING_TYPE__OPERATION_SELECTOR_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_BINDING_TYPE__OPERATION_SELECTOR = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_BINDING_TYPE__NAME = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_BINDING_TYPE__POLICY_SETS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__POLICY_SETS;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_BINDING_TYPE__REQUIRES = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__REQUIRES;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_BINDING_TYPE__URI = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_BINDING_TYPE__CONTEXT_MAPPER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER;

	/**
	 * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_BINDING_TYPE__MESSAGE_COMPOSER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER;

	/**
	 * The number of structural features of the '<em>Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_BINDING_TYPE_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelDirectBindingTypeImpl <em>Direct Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelDirectBindingTypeImpl
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelDirectBindingType()
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
	int CAMEL_DIRECT_BINDING_TYPE__DOCUMENTATION = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_DIRECT_BINDING_TYPE__ANY_ATTRIBUTE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_DIRECT_BINDING_TYPE__WIRE_FORMAT_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT_GROUP;

	/**
	 * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_DIRECT_BINDING_TYPE__WIRE_FORMAT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT;

	/**
	 * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_DIRECT_BINDING_TYPE__OPERATION_SELECTOR_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_DIRECT_BINDING_TYPE__OPERATION_SELECTOR = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_DIRECT_BINDING_TYPE__NAME = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_DIRECT_BINDING_TYPE__POLICY_SETS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__POLICY_SETS;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_DIRECT_BINDING_TYPE__REQUIRES = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__REQUIRES;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_DIRECT_BINDING_TYPE__URI = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_DIRECT_BINDING_TYPE__CONTEXT_MAPPER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER;

	/**
	 * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_DIRECT_BINDING_TYPE__MESSAGE_COMPOSER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER;

	/**
	 * The number of structural features of the '<em>Direct Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_DIRECT_BINDING_TYPE_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFileBindingTypeImpl <em>File Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFileBindingTypeImpl
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelFileBindingType()
	 * @generated
	 */
	int CAMEL_FILE_BINDING_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_FILE_BINDING_TYPE__DOCUMENTATION = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_FILE_BINDING_TYPE__ANY_ATTRIBUTE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_FILE_BINDING_TYPE__WIRE_FORMAT_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT_GROUP;

	/**
	 * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_FILE_BINDING_TYPE__WIRE_FORMAT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT;

	/**
	 * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_FILE_BINDING_TYPE__OPERATION_SELECTOR_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_FILE_BINDING_TYPE__OPERATION_SELECTOR = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_FILE_BINDING_TYPE__NAME = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_FILE_BINDING_TYPE__POLICY_SETS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__POLICY_SETS;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_FILE_BINDING_TYPE__REQUIRES = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__REQUIRES;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_FILE_BINDING_TYPE__URI = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_FILE_BINDING_TYPE__CONTEXT_MAPPER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER;

	/**
	 * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_FILE_BINDING_TYPE__MESSAGE_COMPOSER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER;

	/**
	 * The feature id for the '<em><b>Target Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_FILE_BINDING_TYPE__TARGET_DIR = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Auto Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_FILE_BINDING_TYPE__AUTO_CREATE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_FILE_BINDING_TYPE__BUFFER_SIZE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_FILE_BINDING_TYPE__FILE_NAME = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Flatten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_FILE_BINDING_TYPE__FLATTEN = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_FILE_BINDING_TYPE__CHARSET = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Consume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_FILE_BINDING_TYPE__CONSUME = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Produce</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_FILE_BINDING_TYPE__PRODUCE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>File Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_FILE_BINDING_TYPE_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelImplementationTypeImpl <em>Implementation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelImplementationTypeImpl
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelImplementationType()
	 * @generated
	 */
	int CAMEL_IMPLEMENTATION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_IMPLEMENTATION_TYPE__DOCUMENTATION = ScaPackage.IMPLEMENTATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_IMPLEMENTATION_TYPE__ANY_ATTRIBUTE = ScaPackage.IMPLEMENTATION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_IMPLEMENTATION_TYPE__POLICY_SETS = ScaPackage.IMPLEMENTATION__POLICY_SETS;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_IMPLEMENTATION_TYPE__REQUIRES = ScaPackage.IMPLEMENTATION__REQUIRES;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_IMPLEMENTATION_TYPE__ROUTE = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Java</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_IMPLEMENTATION_TYPE__JAVA = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Implementation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_IMPLEMENTATION_TYPE_FEATURE_COUNT = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelMockBindingTypeImpl <em>Mock Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelMockBindingTypeImpl
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelMockBindingType()
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
	int CAMEL_MOCK_BINDING_TYPE__DOCUMENTATION = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MOCK_BINDING_TYPE__ANY_ATTRIBUTE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MOCK_BINDING_TYPE__WIRE_FORMAT_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT_GROUP;

	/**
	 * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MOCK_BINDING_TYPE__WIRE_FORMAT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT;

	/**
	 * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MOCK_BINDING_TYPE__OPERATION_SELECTOR_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MOCK_BINDING_TYPE__OPERATION_SELECTOR = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MOCK_BINDING_TYPE__NAME = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MOCK_BINDING_TYPE__POLICY_SETS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__POLICY_SETS;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MOCK_BINDING_TYPE__REQUIRES = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__REQUIRES;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MOCK_BINDING_TYPE__URI = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MOCK_BINDING_TYPE__CONTEXT_MAPPER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER;

	/**
	 * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MOCK_BINDING_TYPE__MESSAGE_COMPOSER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER;

	/**
	 * The feature id for the '<em><b>Report Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MOCK_BINDING_TYPE__REPORT_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mock Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_MOCK_BINDING_TYPE_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelOperationSelectorTypeImpl <em>Operation Selector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelOperationSelectorTypeImpl
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelOperationSelectorType()
	 * @generated
	 */
	int CAMEL_OPERATION_SELECTOR_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_OPERATION_SELECTOR_TYPE__ANY = ScaPackage.OPERATION_SELECTOR_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_OPERATION_SELECTOR_TYPE__ANY_ATTRIBUTE = ScaPackage.OPERATION_SELECTOR_TYPE__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Operation Selector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_OPERATION_SELECTOR_TYPE_FEATURE_COUNT = ScaPackage.OPERATION_SELECTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelSedaBindingTypeImpl <em>Seda Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelSedaBindingTypeImpl
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelSedaBindingType()
	 * @generated
	 */
	int CAMEL_SEDA_BINDING_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_SEDA_BINDING_TYPE__DOCUMENTATION = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_SEDA_BINDING_TYPE__ANY_ATTRIBUTE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_SEDA_BINDING_TYPE__WIRE_FORMAT_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT_GROUP;

	/**
	 * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_SEDA_BINDING_TYPE__WIRE_FORMAT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT;

	/**
	 * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_SEDA_BINDING_TYPE__OPERATION_SELECTOR_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_SEDA_BINDING_TYPE__OPERATION_SELECTOR = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_SEDA_BINDING_TYPE__NAME = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_SEDA_BINDING_TYPE__POLICY_SETS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__POLICY_SETS;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_SEDA_BINDING_TYPE__REQUIRES = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__REQUIRES;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_SEDA_BINDING_TYPE__URI = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_SEDA_BINDING_TYPE__CONTEXT_MAPPER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER;

	/**
	 * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_SEDA_BINDING_TYPE__MESSAGE_COMPOSER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_SEDA_BINDING_TYPE__SIZE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concurrent Consumers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_SEDA_BINDING_TYPE__CONCURRENT_CONSUMERS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wait For Task To Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_SEDA_BINDING_TYPE__WAIT_FOR_TASK_TO_COMPLETE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_SEDA_BINDING_TYPE__TIMEOUT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Multiple Consumers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_SEDA_BINDING_TYPE__MULTIPLE_CONSUMERS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Limit Concurrent Consumers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_SEDA_BINDING_TYPE__LIMIT_CONCURRENT_CONSUMERS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Seda Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_SEDA_BINDING_TYPE_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelTimerBindingTypeImpl <em>Timer Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelTimerBindingTypeImpl
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelTimerBindingType()
	 * @generated
	 */
	int CAMEL_TIMER_BINDING_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_TIMER_BINDING_TYPE__DOCUMENTATION = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_TIMER_BINDING_TYPE__ANY_ATTRIBUTE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_TIMER_BINDING_TYPE__WIRE_FORMAT_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT_GROUP;

	/**
	 * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_TIMER_BINDING_TYPE__WIRE_FORMAT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT;

	/**
	 * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_TIMER_BINDING_TYPE__OPERATION_SELECTOR_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_TIMER_BINDING_TYPE__OPERATION_SELECTOR = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_TIMER_BINDING_TYPE__NAME = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_TIMER_BINDING_TYPE__POLICY_SETS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__POLICY_SETS;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_TIMER_BINDING_TYPE__REQUIRES = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__REQUIRES;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_TIMER_BINDING_TYPE__URI = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_TIMER_BINDING_TYPE__CONTEXT_MAPPER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER;

	/**
	 * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_TIMER_BINDING_TYPE__MESSAGE_COMPOSER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_TIMER_BINDING_TYPE__TIME = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_TIMER_BINDING_TYPE__PATTERN = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_TIMER_BINDING_TYPE__PERIOD = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_TIMER_BINDING_TYPE__DELAY = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fixed Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_TIMER_BINDING_TYPE__FIXED_RATE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Daemon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_TIMER_BINDING_TYPE__DAEMON = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Timer Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMEL_TIMER_BINDING_TYPE_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.DocumentRootImpl
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 9;

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
	 * The feature id for the '<em><b>Binding Camel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BINDING_CAMEL = 4;

	/**
	 * The feature id for the '<em><b>Binding Direct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BINDING_DIRECT = 5;

	/**
	 * The feature id for the '<em><b>Binding File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BINDING_FILE = 6;

	/**
	 * The feature id for the '<em><b>Binding Mock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BINDING_MOCK = 7;

	/**
	 * The feature id for the '<em><b>Binding Seda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BINDING_SEDA = 8;

	/**
	 * The feature id for the '<em><b>Binding Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BINDING_TIMER = 9;

	/**
	 * The feature id for the '<em><b>Implementation Camel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMPLEMENTATION_CAMEL = 10;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl <em>File Consumer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getFileConsumerType()
	 * @generated
	 */
	int FILE_CONSUMER_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__INITIAL_DELAY = 0;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__DELAY = 1;

	/**
	 * The feature id for the '<em><b>Use Fixed Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__USE_FIXED_DELAY = 2;

	/**
	 * The feature id for the '<em><b>Recursive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__RECURSIVE = 3;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__DELETE = 4;

	/**
	 * The feature id for the '<em><b>Noop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__NOOP = 5;

	/**
	 * The feature id for the '<em><b>Pre Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__PRE_MOVE = 6;

	/**
	 * The feature id for the '<em><b>Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__MOVE = 7;

	/**
	 * The feature id for the '<em><b>Move Failed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__MOVE_FAILED = 8;

	/**
	 * The feature id for the '<em><b>Include</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__INCLUDE = 9;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__EXCLUDE = 10;

	/**
	 * The feature id for the '<em><b>Idempotent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__IDEMPOTENT = 11;

	/**
	 * The feature id for the '<em><b>Idempotent Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY = 12;

	/**
	 * The feature id for the '<em><b>In Progress Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY = 13;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__FILTER = 14;

	/**
	 * The feature id for the '<em><b>Sorter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__SORTER = 15;

	/**
	 * The feature id for the '<em><b>Sort By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__SORT_BY = 16;

	/**
	 * The feature id for the '<em><b>Read Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__READ_LOCK = 17;

	/**
	 * The feature id for the '<em><b>Read Lock Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT = 18;

	/**
	 * The feature id for the '<em><b>Read Lock Check Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL = 19;

	/**
	 * The feature id for the '<em><b>Exclusive Read Lock Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY = 20;

	/**
	 * The feature id for the '<em><b>Process Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__PROCESS_STRATEGY = 21;

	/**
	 * The feature id for the '<em><b>Max Messages Per Poll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL = 22;

	/**
	 * The feature id for the '<em><b>Starting Directory Must Exist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST = 23;

	/**
	 * The feature id for the '<em><b>Directory Must Exist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST = 24;

	/**
	 * The feature id for the '<em><b>Done File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE__DONE_FILE_NAME = 25;

	/**
	 * The number of structural features of the '<em>File Consumer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONSUMER_TYPE_FEATURE_COUNT = 26;

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileProducerTypeImpl <em>File Producer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.FileProducerTypeImpl
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getFileProducerType()
	 * @generated
	 */
	int FILE_PRODUCER_TYPE = 11;

	/**
	 * The feature id for the '<em><b>File Exist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PRODUCER_TYPE__FILE_EXIST = 0;

	/**
	 * The feature id for the '<em><b>Temp Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PRODUCER_TYPE__TEMP_PREFIX = 1;

	/**
	 * The feature id for the '<em><b>Temp File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PRODUCER_TYPE__TEMP_FILE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Keep Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED = 3;

	/**
	 * The feature id for the '<em><b>Eager Delete Target File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE = 4;

	/**
	 * The feature id for the '<em><b>Done File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PRODUCER_TYPE__DONE_FILE_NAME = 5;

	/**
	 * The number of structural features of the '<em>File Producer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PRODUCER_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.JavaDSLTypeImpl <em>Java DSL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.JavaDSLTypeImpl
	 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getJavaDSLType()
	 * @generated
	 */
	int JAVA_DSL_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DSL_TYPE__CLASS = 0;

	/**
	 * The number of structural features of the '<em>Java DSL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DSL_TYPE_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType <em>Atom Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atom Binding Type</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType
	 * @generated
	 */
	EClass getCamelAtomBindingType();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType#getFeedURI <em>Feed URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feed URI</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType#getFeedURI()
	 * @see #getCamelAtomBindingType()
	 * @generated
	 */
	EAttribute getCamelAtomBindingType_FeedURI();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType#isSplitEntries <em>Split Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Split Entries</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType#isSplitEntries()
	 * @see #getCamelAtomBindingType()
	 * @generated
	 */
	EAttribute getCamelAtomBindingType_SplitEntries();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType#isFilter()
	 * @see #getCamelAtomBindingType()
	 * @generated
	 */
	EAttribute getCamelAtomBindingType_Filter();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType#getLastUpdate <em>Last Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Update</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType#getLastUpdate()
	 * @see #getCamelAtomBindingType()
	 * @generated
	 */
	EAttribute getCamelAtomBindingType_LastUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType#isThrottleEntries <em>Throttle Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throttle Entries</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType#isThrottleEntries()
	 * @see #getCamelAtomBindingType()
	 * @generated
	 */
	EAttribute getCamelAtomBindingType_ThrottleEntries();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType#isFeedHeader <em>Feed Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feed Header</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType#isFeedHeader()
	 * @see #getCamelAtomBindingType()
	 * @generated
	 */
	EAttribute getCamelAtomBindingType_FeedHeader();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType#isSortEntries <em>Sort Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Entries</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType#isSortEntries()
	 * @see #getCamelAtomBindingType()
	 * @generated
	 */
	EAttribute getCamelAtomBindingType_SortEntries();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType#getConsumerDelay <em>Consumer Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumer Delay</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType#getConsumerDelay()
	 * @see #getCamelAtomBindingType()
	 * @generated
	 */
	EAttribute getCamelAtomBindingType_ConsumerDelay();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType#getConsumerInitialDelay <em>Consumer Initial Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumer Initial Delay</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType#getConsumerInitialDelay()
	 * @see #getCamelAtomBindingType()
	 * @generated
	 */
	EAttribute getCamelAtomBindingType_ConsumerInitialDelay();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType#isConsumerUserFixedDelay <em>Consumer User Fixed Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumer User Fixed Delay</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType#isConsumerUserFixedDelay()
	 * @see #getCamelAtomBindingType()
	 * @generated
	 */
	EAttribute getCamelAtomBindingType_ConsumerUserFixedDelay();

	/**
	 * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelBindingType <em>Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Type</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelBindingType
	 * @generated
	 */
	EClass getCamelBindingType();

	/**
	 * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelDirectBindingType <em>Direct Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Binding Type</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelDirectBindingType
	 * @generated
	 */
	EClass getCamelDirectBindingType();

	/**
	 * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType <em>File Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Binding Type</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType
	 * @generated
	 */
	EClass getCamelFileBindingType();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType#getTargetDir <em>Target Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Dir</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType#getTargetDir()
	 * @see #getCamelFileBindingType()
	 * @generated
	 */
	EAttribute getCamelFileBindingType_TargetDir();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType#isAutoCreate <em>Auto Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Create</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType#isAutoCreate()
	 * @see #getCamelFileBindingType()
	 * @generated
	 */
	EAttribute getCamelFileBindingType_AutoCreate();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType#getBufferSize <em>Buffer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffer Size</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType#getBufferSize()
	 * @see #getCamelFileBindingType()
	 * @generated
	 */
	EAttribute getCamelFileBindingType_BufferSize();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType#getFileName()
	 * @see #getCamelFileBindingType()
	 * @generated
	 */
	EAttribute getCamelFileBindingType_FileName();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType#isFlatten <em>Flatten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flatten</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType#isFlatten()
	 * @see #getCamelFileBindingType()
	 * @generated
	 */
	EAttribute getCamelFileBindingType_Flatten();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType#getCharset <em>Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charset</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType#getCharset()
	 * @see #getCamelFileBindingType()
	 * @generated
	 */
	EAttribute getCamelFileBindingType_Charset();

	/**
	 * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType#getConsume <em>Consume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consume</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType#getConsume()
	 * @see #getCamelFileBindingType()
	 * @generated
	 */
	EReference getCamelFileBindingType_Consume();

	/**
	 * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType#getProduce <em>Produce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Produce</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType#getProduce()
	 * @see #getCamelFileBindingType()
	 * @generated
	 */
	EReference getCamelFileBindingType_Produce();

	/**
	 * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType <em>Implementation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Type</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType
	 * @generated
	 */
	EClass getCamelImplementationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Route</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType#getRoute()
	 * @see #getCamelImplementationType()
	 * @generated
	 */
	EReference getCamelImplementationType_Route();

	/**
	 * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType#getJava <em>Java</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Java</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType#getJava()
	 * @see #getCamelImplementationType()
	 * @generated
	 */
	EReference getCamelImplementationType_Java();

	/**
	 * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType <em>Mock Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mock Binding Type</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType
	 * @generated
	 */
	EClass getCamelMockBindingType();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType#getReportGroup <em>Report Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Report Group</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType#getReportGroup()
	 * @see #getCamelMockBindingType()
	 * @generated
	 */
	EAttribute getCamelMockBindingType_ReportGroup();

	/**
	 * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelOperationSelectorType <em>Operation Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Selector Type</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelOperationSelectorType
	 * @generated
	 */
	EClass getCamelOperationSelectorType();

	/**
	 * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType <em>Seda Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seda Binding Type</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType
	 * @generated
	 */
	EClass getCamelSedaBindingType();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getSize()
	 * @see #getCamelSedaBindingType()
	 * @generated
	 */
	EAttribute getCamelSedaBindingType_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getConcurrentConsumers <em>Concurrent Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concurrent Consumers</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getConcurrentConsumers()
	 * @see #getCamelSedaBindingType()
	 * @generated
	 */
	EAttribute getCamelSedaBindingType_ConcurrentConsumers();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getWaitForTaskToComplete <em>Wait For Task To Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wait For Task To Complete</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getWaitForTaskToComplete()
	 * @see #getCamelSedaBindingType()
	 * @generated
	 */
	EAttribute getCamelSedaBindingType_WaitForTaskToComplete();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getTimeout()
	 * @see #getCamelSedaBindingType()
	 * @generated
	 */
	EAttribute getCamelSedaBindingType_Timeout();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#isMultipleConsumers <em>Multiple Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Consumers</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#isMultipleConsumers()
	 * @see #getCamelSedaBindingType()
	 * @generated
	 */
	EAttribute getCamelSedaBindingType_MultipleConsumers();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#isLimitConcurrentConsumers <em>Limit Concurrent Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit Concurrent Consumers</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#isLimitConcurrentConsumers()
	 * @see #getCamelSedaBindingType()
	 * @generated
	 */
	EAttribute getCamelSedaBindingType_LimitConcurrentConsumers();

	/**
	 * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType <em>Timer Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer Binding Type</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType
	 * @generated
	 */
	EClass getCamelTimerBindingType();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getTime()
	 * @see #getCamelTimerBindingType()
	 * @generated
	 */
	EAttribute getCamelTimerBindingType_Time();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getPattern()
	 * @see #getCamelTimerBindingType()
	 * @generated
	 */
	EAttribute getCamelTimerBindingType_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getPeriod()
	 * @see #getCamelTimerBindingType()
	 * @generated
	 */
	EAttribute getCamelTimerBindingType_Period();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getDelay()
	 * @see #getCamelTimerBindingType()
	 * @generated
	 */
	EAttribute getCamelTimerBindingType_Delay();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#isFixedRate <em>Fixed Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Rate</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#isFixedRate()
	 * @see #getCamelTimerBindingType()
	 * @generated
	 */
	EAttribute getCamelTimerBindingType_FixedRate();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#isDaemon <em>Daemon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Daemon</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#isDaemon()
	 * @see #getCamelTimerBindingType()
	 * @generated
	 */
	EAttribute getCamelTimerBindingType_Daemon();

	/**
	 * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingAtom <em>Binding Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Atom</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingAtom()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BindingAtom();

	/**
	 * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingCamel <em>Binding Camel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Camel</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingCamel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BindingCamel();

	/**
	 * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingDirect <em>Binding Direct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Direct</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingDirect()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BindingDirect();

	/**
	 * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingFile <em>Binding File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding File</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingFile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BindingFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingMock <em>Binding Mock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Mock</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingMock()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BindingMock();

	/**
	 * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingSeda <em>Binding Seda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Seda</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingSeda()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BindingSeda();

	/**
	 * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingTimer <em>Binding Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Timer</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingTimer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BindingTimer();

	/**
	 * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getImplementationCamel <em>Implementation Camel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation Camel</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getImplementationCamel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ImplementationCamel();

	/**
	 * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType <em>File Consumer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Consumer Type</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType
	 * @generated
	 */
	EClass getFileConsumerType();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getInitialDelay <em>Initial Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Delay</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getInitialDelay()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_InitialDelay();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getDelay()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_Delay();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#isUseFixedDelay <em>Use Fixed Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Fixed Delay</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#isUseFixedDelay()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_UseFixedDelay();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#isRecursive <em>Recursive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recursive</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#isRecursive()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_Recursive();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#isDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#isDelete()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_Delete();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#isNoop <em>Noop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Noop</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#isNoop()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_Noop();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getPreMove <em>Pre Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre Move</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getPreMove()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_PreMove();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getMove <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Move</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getMove()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_Move();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getMoveFailed <em>Move Failed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Move Failed</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getMoveFailed()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_MoveFailed();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getInclude()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_Include();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getExclude()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_Exclude();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#isIdempotent <em>Idempotent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idempotent</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#isIdempotent()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_Idempotent();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getIdempotentRepository <em>Idempotent Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idempotent Repository</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getIdempotentRepository()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_IdempotentRepository();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getInProgressRepository <em>In Progress Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Progress Repository</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getInProgressRepository()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_InProgressRepository();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getFilter()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_Filter();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getSorter <em>Sorter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorter</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getSorter()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_Sorter();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getSortBy <em>Sort By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort By</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getSortBy()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_SortBy();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getReadLock <em>Read Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Lock</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getReadLock()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_ReadLock();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getReadLockTimeout <em>Read Lock Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Lock Timeout</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getReadLockTimeout()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_ReadLockTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getReadLockCheckInterval <em>Read Lock Check Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Lock Check Interval</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getReadLockCheckInterval()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_ReadLockCheckInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getExclusiveReadLockStrategy <em>Exclusive Read Lock Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive Read Lock Strategy</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getExclusiveReadLockStrategy()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_ExclusiveReadLockStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getProcessStrategy <em>Process Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Strategy</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getProcessStrategy()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_ProcessStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Messages Per Poll</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getMaxMessagesPerPoll()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_MaxMessagesPerPoll();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#isStartingDirectoryMustExist <em>Starting Directory Must Exist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starting Directory Must Exist</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#isStartingDirectoryMustExist()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_StartingDirectoryMustExist();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#isDirectoryMustExist <em>Directory Must Exist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directory Must Exist</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#isDirectoryMustExist()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_DirectoryMustExist();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getDoneFileName <em>Done File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Done File Name</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType#getDoneFileName()
	 * @see #getFileConsumerType()
	 * @generated
	 */
	EAttribute getFileConsumerType_DoneFileName();

	/**
	 * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.FileProducerType <em>File Producer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Producer Type</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileProducerType
	 * @generated
	 */
	EClass getFileProducerType();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileProducerType#getFileExist <em>File Exist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Exist</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileProducerType#getFileExist()
	 * @see #getFileProducerType()
	 * @generated
	 */
	EAttribute getFileProducerType_FileExist();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileProducerType#getTempPrefix <em>Temp Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp Prefix</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileProducerType#getTempPrefix()
	 * @see #getFileProducerType()
	 * @generated
	 */
	EAttribute getFileProducerType_TempPrefix();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileProducerType#getTempFileName <em>Temp File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp File Name</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileProducerType#getTempFileName()
	 * @see #getFileProducerType()
	 * @generated
	 */
	EAttribute getFileProducerType_TempFileName();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileProducerType#isKeepLastModified <em>Keep Last Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keep Last Modified</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileProducerType#isKeepLastModified()
	 * @see #getFileProducerType()
	 * @generated
	 */
	EAttribute getFileProducerType_KeepLastModified();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileProducerType#isEagerDeleteTargetFile <em>Eager Delete Target File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eager Delete Target File</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileProducerType#isEagerDeleteTargetFile()
	 * @see #getFileProducerType()
	 * @generated
	 */
	EAttribute getFileProducerType_EagerDeleteTargetFile();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.FileProducerType#getDoneFileName <em>Done File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Done File Name</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.FileProducerType#getDoneFileName()
	 * @see #getFileProducerType()
	 * @generated
	 */
	EAttribute getFileProducerType_DoneFileName();

	/**
	 * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.JavaDSLType <em>Java DSL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java DSL Type</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.JavaDSLType
	 * @generated
	 */
	EClass getJavaDSLType();

	/**
	 * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.JavaDSLType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.switchyard.tools.models.switchyard1_0.camel.JavaDSLType#getClass_()
	 * @see #getJavaDSLType()
	 * @generated
	 */
	EAttribute getJavaDSLType_Class();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CamelFactory getCamelFactory();

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
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelAtomBindingTypeImpl <em>Atom Binding Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelAtomBindingTypeImpl
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelAtomBindingType()
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
		 * The meta object literal for the '<em><b>Consumer Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMEL_ATOM_BINDING_TYPE__CONSUMER_DELAY = eINSTANCE.getCamelAtomBindingType_ConsumerDelay();

		/**
		 * The meta object literal for the '<em><b>Consumer Initial Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMEL_ATOM_BINDING_TYPE__CONSUMER_INITIAL_DELAY = eINSTANCE.getCamelAtomBindingType_ConsumerInitialDelay();

		/**
		 * The meta object literal for the '<em><b>Consumer User Fixed Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMEL_ATOM_BINDING_TYPE__CONSUMER_USER_FIXED_DELAY = eINSTANCE.getCamelAtomBindingType_ConsumerUserFixedDelay();

		/**
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelBindingTypeImpl <em>Binding Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelBindingTypeImpl
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelBindingType()
		 * @generated
		 */
		EClass CAMEL_BINDING_TYPE = eINSTANCE.getCamelBindingType();

		/**
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelDirectBindingTypeImpl <em>Direct Binding Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelDirectBindingTypeImpl
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelDirectBindingType()
		 * @generated
		 */
		EClass CAMEL_DIRECT_BINDING_TYPE = eINSTANCE.getCamelDirectBindingType();

		/**
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFileBindingTypeImpl <em>File Binding Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFileBindingTypeImpl
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelFileBindingType()
		 * @generated
		 */
		EClass CAMEL_FILE_BINDING_TYPE = eINSTANCE.getCamelFileBindingType();

		/**
		 * The meta object literal for the '<em><b>Target Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMEL_FILE_BINDING_TYPE__TARGET_DIR = eINSTANCE.getCamelFileBindingType_TargetDir();

		/**
		 * The meta object literal for the '<em><b>Auto Create</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMEL_FILE_BINDING_TYPE__AUTO_CREATE = eINSTANCE.getCamelFileBindingType_AutoCreate();

		/**
		 * The meta object literal for the '<em><b>Buffer Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMEL_FILE_BINDING_TYPE__BUFFER_SIZE = eINSTANCE.getCamelFileBindingType_BufferSize();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMEL_FILE_BINDING_TYPE__FILE_NAME = eINSTANCE.getCamelFileBindingType_FileName();

		/**
		 * The meta object literal for the '<em><b>Flatten</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMEL_FILE_BINDING_TYPE__FLATTEN = eINSTANCE.getCamelFileBindingType_Flatten();

		/**
		 * The meta object literal for the '<em><b>Charset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMEL_FILE_BINDING_TYPE__CHARSET = eINSTANCE.getCamelFileBindingType_Charset();

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
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelImplementationTypeImpl <em>Implementation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelImplementationTypeImpl
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelImplementationType()
		 * @generated
		 */
		EClass CAMEL_IMPLEMENTATION_TYPE = eINSTANCE.getCamelImplementationType();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMEL_IMPLEMENTATION_TYPE__ROUTE = eINSTANCE.getCamelImplementationType_Route();

		/**
		 * The meta object literal for the '<em><b>Java</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMEL_IMPLEMENTATION_TYPE__JAVA = eINSTANCE.getCamelImplementationType_Java();

		/**
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelMockBindingTypeImpl <em>Mock Binding Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelMockBindingTypeImpl
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelMockBindingType()
		 * @generated
		 */
		EClass CAMEL_MOCK_BINDING_TYPE = eINSTANCE.getCamelMockBindingType();

		/**
		 * The meta object literal for the '<em><b>Report Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMEL_MOCK_BINDING_TYPE__REPORT_GROUP = eINSTANCE.getCamelMockBindingType_ReportGroup();

		/**
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelOperationSelectorTypeImpl <em>Operation Selector Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelOperationSelectorTypeImpl
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelOperationSelectorType()
		 * @generated
		 */
		EClass CAMEL_OPERATION_SELECTOR_TYPE = eINSTANCE.getCamelOperationSelectorType();

		/**
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelSedaBindingTypeImpl <em>Seda Binding Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelSedaBindingTypeImpl
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelSedaBindingType()
		 * @generated
		 */
		EClass CAMEL_SEDA_BINDING_TYPE = eINSTANCE.getCamelSedaBindingType();

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
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelTimerBindingTypeImpl <em>Timer Binding Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelTimerBindingTypeImpl
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelTimerBindingType()
		 * @generated
		 */
		EClass CAMEL_TIMER_BINDING_TYPE = eINSTANCE.getCamelTimerBindingType();

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
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.DocumentRootImpl
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Binding File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BINDING_FILE = eINSTANCE.getDocumentRoot_BindingFile();

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

		/**
		 * The meta object literal for the '<em><b>Implementation Camel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IMPLEMENTATION_CAMEL = eINSTANCE.getDocumentRoot_ImplementationCamel();

		/**
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl <em>File Consumer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getFileConsumerType()
		 * @generated
		 */
		EClass FILE_CONSUMER_TYPE = eINSTANCE.getFileConsumerType();

		/**
		 * The meta object literal for the '<em><b>Initial Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__INITIAL_DELAY = eINSTANCE.getFileConsumerType_InitialDelay();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__DELAY = eINSTANCE.getFileConsumerType_Delay();

		/**
		 * The meta object literal for the '<em><b>Use Fixed Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__USE_FIXED_DELAY = eINSTANCE.getFileConsumerType_UseFixedDelay();

		/**
		 * The meta object literal for the '<em><b>Recursive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__RECURSIVE = eINSTANCE.getFileConsumerType_Recursive();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__DELETE = eINSTANCE.getFileConsumerType_Delete();

		/**
		 * The meta object literal for the '<em><b>Noop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__NOOP = eINSTANCE.getFileConsumerType_Noop();

		/**
		 * The meta object literal for the '<em><b>Pre Move</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__PRE_MOVE = eINSTANCE.getFileConsumerType_PreMove();

		/**
		 * The meta object literal for the '<em><b>Move</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__MOVE = eINSTANCE.getFileConsumerType_Move();

		/**
		 * The meta object literal for the '<em><b>Move Failed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__MOVE_FAILED = eINSTANCE.getFileConsumerType_MoveFailed();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__INCLUDE = eINSTANCE.getFileConsumerType_Include();

		/**
		 * The meta object literal for the '<em><b>Exclude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__EXCLUDE = eINSTANCE.getFileConsumerType_Exclude();

		/**
		 * The meta object literal for the '<em><b>Idempotent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__IDEMPOTENT = eINSTANCE.getFileConsumerType_Idempotent();

		/**
		 * The meta object literal for the '<em><b>Idempotent Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY = eINSTANCE.getFileConsumerType_IdempotentRepository();

		/**
		 * The meta object literal for the '<em><b>In Progress Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY = eINSTANCE.getFileConsumerType_InProgressRepository();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__FILTER = eINSTANCE.getFileConsumerType_Filter();

		/**
		 * The meta object literal for the '<em><b>Sorter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__SORTER = eINSTANCE.getFileConsumerType_Sorter();

		/**
		 * The meta object literal for the '<em><b>Sort By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__SORT_BY = eINSTANCE.getFileConsumerType_SortBy();

		/**
		 * The meta object literal for the '<em><b>Read Lock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__READ_LOCK = eINSTANCE.getFileConsumerType_ReadLock();

		/**
		 * The meta object literal for the '<em><b>Read Lock Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT = eINSTANCE.getFileConsumerType_ReadLockTimeout();

		/**
		 * The meta object literal for the '<em><b>Read Lock Check Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL = eINSTANCE.getFileConsumerType_ReadLockCheckInterval();

		/**
		 * The meta object literal for the '<em><b>Exclusive Read Lock Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY = eINSTANCE.getFileConsumerType_ExclusiveReadLockStrategy();

		/**
		 * The meta object literal for the '<em><b>Process Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__PROCESS_STRATEGY = eINSTANCE.getFileConsumerType_ProcessStrategy();

		/**
		 * The meta object literal for the '<em><b>Max Messages Per Poll</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL = eINSTANCE.getFileConsumerType_MaxMessagesPerPoll();

		/**
		 * The meta object literal for the '<em><b>Starting Directory Must Exist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST = eINSTANCE.getFileConsumerType_StartingDirectoryMustExist();

		/**
		 * The meta object literal for the '<em><b>Directory Must Exist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST = eINSTANCE.getFileConsumerType_DirectoryMustExist();

		/**
		 * The meta object literal for the '<em><b>Done File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONSUMER_TYPE__DONE_FILE_NAME = eINSTANCE.getFileConsumerType_DoneFileName();

		/**
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileProducerTypeImpl <em>File Producer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.FileProducerTypeImpl
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getFileProducerType()
		 * @generated
		 */
		EClass FILE_PRODUCER_TYPE = eINSTANCE.getFileProducerType();

		/**
		 * The meta object literal for the '<em><b>File Exist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_PRODUCER_TYPE__FILE_EXIST = eINSTANCE.getFileProducerType_FileExist();

		/**
		 * The meta object literal for the '<em><b>Temp Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_PRODUCER_TYPE__TEMP_PREFIX = eINSTANCE.getFileProducerType_TempPrefix();

		/**
		 * The meta object literal for the '<em><b>Temp File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_PRODUCER_TYPE__TEMP_FILE_NAME = eINSTANCE.getFileProducerType_TempFileName();

		/**
		 * The meta object literal for the '<em><b>Keep Last Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED = eINSTANCE.getFileProducerType_KeepLastModified();

		/**
		 * The meta object literal for the '<em><b>Eager Delete Target File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE = eINSTANCE.getFileProducerType_EagerDeleteTargetFile();

		/**
		 * The meta object literal for the '<em><b>Done File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_PRODUCER_TYPE__DONE_FILE_NAME = eINSTANCE.getFileProducerType_DoneFileName();

		/**
		 * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.JavaDSLTypeImpl <em>Java DSL Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.JavaDSLTypeImpl
		 * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getJavaDSLType()
		 * @generated
		 */
		EClass JAVA_DSL_TYPE = eINSTANCE.getJavaDSLType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_DSL_TYPE__CLASS = eINSTANCE.getJavaDSLType_Class();

	}

} //CamelPackage
