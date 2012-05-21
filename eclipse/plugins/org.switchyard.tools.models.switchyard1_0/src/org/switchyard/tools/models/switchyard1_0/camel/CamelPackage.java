/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.BaseCamelBindingImpl <em>Base Camel Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.BaseCamelBindingImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getBaseCamelBinding()
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
     * The feature id for the '<em><b>Context Mapper</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__CONTEXT_MAPPER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__MESSAGE_COMPOSER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Camel Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Base Camel Binding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelAtomBindingTypeImpl <em>Atom Binding Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelAtomBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelAtomBindingType()
     * @generated
     */
	int CAMEL_ATOM_BINDING_TYPE = 1;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_ATOM_BINDING_TYPE__DOCUMENTATION = BASE_CAMEL_BINDING__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_ATOM_BINDING_TYPE__ANY_ATTRIBUTE = BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_ATOM_BINDING_TYPE__WIRE_FORMAT_GROUP = BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

	/**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_ATOM_BINDING_TYPE__WIRE_FORMAT = BASE_CAMEL_BINDING__WIRE_FORMAT;

	/**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_ATOM_BINDING_TYPE__OPERATION_SELECTOR_GROUP = BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

	/**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_ATOM_BINDING_TYPE__OPERATION_SELECTOR = BASE_CAMEL_BINDING__OPERATION_SELECTOR;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_ATOM_BINDING_TYPE__NAME = BASE_CAMEL_BINDING__NAME;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_ATOM_BINDING_TYPE__POLICY_SETS = BASE_CAMEL_BINDING__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_ATOM_BINDING_TYPE__REQUIRES = BASE_CAMEL_BINDING__REQUIRES;

	/**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_ATOM_BINDING_TYPE__URI = BASE_CAMEL_BINDING__URI;

	/**
     * The feature id for the '<em><b>Context Mapper</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_ATOM_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

	/**
     * The feature id for the '<em><b>Message Composer</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_ATOM_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

	/**
     * The feature id for the '<em><b>Camel Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_ATOM_BINDING_TYPE__CAMEL_OPERATION_SELECTOR = BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Feed URI</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_ATOM_BINDING_TYPE__FEED_URI = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Split Entries</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_ATOM_BINDING_TYPE__SPLIT_ENTRIES = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_ATOM_BINDING_TYPE__FILTER = BASE_CAMEL_BINDING_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Last Update</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_ATOM_BINDING_TYPE__LAST_UPDATE = BASE_CAMEL_BINDING_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Throttle Entries</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_ATOM_BINDING_TYPE__THROTTLE_ENTRIES = BASE_CAMEL_BINDING_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Feed Header</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_ATOM_BINDING_TYPE__FEED_HEADER = BASE_CAMEL_BINDING_FEATURE_COUNT + 5;

	/**
     * The feature id for the '<em><b>Sort Entries</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_ATOM_BINDING_TYPE__SORT_ENTRIES = BASE_CAMEL_BINDING_FEATURE_COUNT + 6;

	/**
     * The feature id for the '<em><b>Consume</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_ATOM_BINDING_TYPE__CONSUME = BASE_CAMEL_BINDING_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Atom Binding Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_ATOM_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 8;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelBindingTypeImpl <em>Binding Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelBindingType()
     * @generated
     */
	int CAMEL_BINDING_TYPE = 2;

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
     * The feature id for the '<em><b>Context Mapper</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

	/**
     * The feature id for the '<em><b>Message Composer</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

	/**
     * The feature id for the '<em><b>Camel Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__CAMEL_OPERATION_SELECTOR = BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Config URI</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_BINDING_TYPE__CONFIG_URI = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Binding Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelDirectBindingTypeImpl <em>Direct Binding Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelDirectBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelDirectBindingType()
     * @generated
     */
	int CAMEL_DIRECT_BINDING_TYPE = 3;

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
     * The feature id for the '<em><b>Context Mapper</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_DIRECT_BINDING_TYPE__CONTEXT_MAPPER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Message Composer</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_DIRECT_BINDING_TYPE__MESSAGE_COMPOSER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Name Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_DIRECT_BINDING_TYPE__NAME_ELEMENT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Direct Binding Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_DIRECT_BINDING_TYPE_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 3;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.GenericFileBindingTypeImpl <em>Generic File Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.GenericFileBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getGenericFileBindingType()
     * @generated
     */
    int GENERIC_FILE_BINDING_TYPE = 21;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__DOCUMENTATION = BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__ANY_ATTRIBUTE = BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__WIRE_FORMAT_GROUP = BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__WIRE_FORMAT = BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__OPERATION_SELECTOR_GROUP = BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__OPERATION_SELECTOR = BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__NAME = BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__POLICY_SETS = BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__REQUIRES = BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__URI = BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Camel Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__CAMEL_OPERATION_SELECTOR = BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__DIRECTORY = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Auto Create</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__AUTO_CREATE = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__BUFFER_SIZE = BASE_CAMEL_BINDING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__FILE_NAME = BASE_CAMEL_BINDING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Flatten</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__FLATTEN = BASE_CAMEL_BINDING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Charset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE__CHARSET = BASE_CAMEL_BINDING_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Generic File Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 6;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFileBindingTypeImpl <em>File Binding Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFileBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelFileBindingType()
     * @generated
     */
	int CAMEL_FILE_BINDING_TYPE = 4;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_FILE_BINDING_TYPE__DOCUMENTATION = GENERIC_FILE_BINDING_TYPE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_FILE_BINDING_TYPE__ANY_ATTRIBUTE = GENERIC_FILE_BINDING_TYPE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_FILE_BINDING_TYPE__WIRE_FORMAT_GROUP = GENERIC_FILE_BINDING_TYPE__WIRE_FORMAT_GROUP;

	/**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_FILE_BINDING_TYPE__WIRE_FORMAT = GENERIC_FILE_BINDING_TYPE__WIRE_FORMAT;

	/**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_FILE_BINDING_TYPE__OPERATION_SELECTOR_GROUP = GENERIC_FILE_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

	/**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_FILE_BINDING_TYPE__OPERATION_SELECTOR = GENERIC_FILE_BINDING_TYPE__OPERATION_SELECTOR;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_FILE_BINDING_TYPE__NAME = GENERIC_FILE_BINDING_TYPE__NAME;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_FILE_BINDING_TYPE__POLICY_SETS = GENERIC_FILE_BINDING_TYPE__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_FILE_BINDING_TYPE__REQUIRES = GENERIC_FILE_BINDING_TYPE__REQUIRES;

	/**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_FILE_BINDING_TYPE__URI = GENERIC_FILE_BINDING_TYPE__URI;

	/**
     * The feature id for the '<em><b>Context Mapper</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_FILE_BINDING_TYPE__CONTEXT_MAPPER = GENERIC_FILE_BINDING_TYPE__CONTEXT_MAPPER;

	/**
     * The feature id for the '<em><b>Message Composer</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_FILE_BINDING_TYPE__MESSAGE_COMPOSER = GENERIC_FILE_BINDING_TYPE__MESSAGE_COMPOSER;

	/**
     * The feature id for the '<em><b>Camel Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__CAMEL_OPERATION_SELECTOR = GENERIC_FILE_BINDING_TYPE__CAMEL_OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FILE_BINDING_TYPE__DIRECTORY = GENERIC_FILE_BINDING_TYPE__DIRECTORY;

    /**
     * The feature id for the '<em><b>Auto Create</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_FILE_BINDING_TYPE__AUTO_CREATE = GENERIC_FILE_BINDING_TYPE__AUTO_CREATE;

	/**
     * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_FILE_BINDING_TYPE__BUFFER_SIZE = GENERIC_FILE_BINDING_TYPE__BUFFER_SIZE;

	/**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_FILE_BINDING_TYPE__FILE_NAME = GENERIC_FILE_BINDING_TYPE__FILE_NAME;

	/**
     * The feature id for the '<em><b>Flatten</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_FILE_BINDING_TYPE__FLATTEN = GENERIC_FILE_BINDING_TYPE__FLATTEN;

	/**
     * The feature id for the '<em><b>Charset</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_FILE_BINDING_TYPE__CHARSET = GENERIC_FILE_BINDING_TYPE__CHARSET;

	/**
     * The feature id for the '<em><b>Consume</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_FILE_BINDING_TYPE__CONSUME = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Produce</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_FILE_BINDING_TYPE__PRODUCE = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>File Binding Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_FILE_BINDING_TYPE_FEATURE_COUNT = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelRemoteBindingTypeImpl <em>Remote Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelRemoteBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelRemoteBindingType()
     * @generated
     */
    int CAMEL_REMOTE_BINDING_TYPE = 15;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__DOCUMENTATION = GENERIC_FILE_BINDING_TYPE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__ANY_ATTRIBUTE = GENERIC_FILE_BINDING_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__WIRE_FORMAT_GROUP = GENERIC_FILE_BINDING_TYPE__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__WIRE_FORMAT = GENERIC_FILE_BINDING_TYPE__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__OPERATION_SELECTOR_GROUP = GENERIC_FILE_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__OPERATION_SELECTOR = GENERIC_FILE_BINDING_TYPE__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__NAME = GENERIC_FILE_BINDING_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__POLICY_SETS = GENERIC_FILE_BINDING_TYPE__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__REQUIRES = GENERIC_FILE_BINDING_TYPE__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__URI = GENERIC_FILE_BINDING_TYPE__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__CONTEXT_MAPPER = GENERIC_FILE_BINDING_TYPE__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__MESSAGE_COMPOSER = GENERIC_FILE_BINDING_TYPE__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Camel Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__CAMEL_OPERATION_SELECTOR = GENERIC_FILE_BINDING_TYPE__CAMEL_OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__DIRECTORY = GENERIC_FILE_BINDING_TYPE__DIRECTORY;

    /**
     * The feature id for the '<em><b>Auto Create</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__AUTO_CREATE = GENERIC_FILE_BINDING_TYPE__AUTO_CREATE;

    /**
     * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__BUFFER_SIZE = GENERIC_FILE_BINDING_TYPE__BUFFER_SIZE;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__FILE_NAME = GENERIC_FILE_BINDING_TYPE__FILE_NAME;

    /**
     * The feature id for the '<em><b>Flatten</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__FLATTEN = GENERIC_FILE_BINDING_TYPE__FLATTEN;

    /**
     * The feature id for the '<em><b>Charset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__CHARSET = GENERIC_FILE_BINDING_TYPE__CHARSET;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__HOST = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__PORT = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__USERNAME = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__PASSWORD = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Binary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__BINARY = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Connect Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__CONNECT_TIMEOUT = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Disconnect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__DISCONNECT = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Maximum Reconnect Attempts</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Reconnect Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__RECONNECT_DELAY = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Separator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__SEPARATOR = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Stepwise</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__STEPWISE = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Throw Exception On Connect Failed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Consume</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__CONSUME = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Produce</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE__PRODUCE = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 13;

    /**
     * The number of structural features of the '<em>Remote Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_REMOTE_BINDING_TYPE_FEATURE_COUNT = GENERIC_FILE_BINDING_TYPE_FEATURE_COUNT + 14;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFtpBindingTypeImpl <em>Ftp Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFtpBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelFtpBindingType()
     * @generated
     */
    int CAMEL_FTP_BINDING_TYPE = 5;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__DOCUMENTATION = CAMEL_REMOTE_BINDING_TYPE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__ANY_ATTRIBUTE = CAMEL_REMOTE_BINDING_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__WIRE_FORMAT_GROUP = CAMEL_REMOTE_BINDING_TYPE__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__WIRE_FORMAT = CAMEL_REMOTE_BINDING_TYPE__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__OPERATION_SELECTOR_GROUP = CAMEL_REMOTE_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__OPERATION_SELECTOR = CAMEL_REMOTE_BINDING_TYPE__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__NAME = CAMEL_REMOTE_BINDING_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__POLICY_SETS = CAMEL_REMOTE_BINDING_TYPE__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__REQUIRES = CAMEL_REMOTE_BINDING_TYPE__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__URI = CAMEL_REMOTE_BINDING_TYPE__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__CONTEXT_MAPPER = CAMEL_REMOTE_BINDING_TYPE__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__MESSAGE_COMPOSER = CAMEL_REMOTE_BINDING_TYPE__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Camel Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__CAMEL_OPERATION_SELECTOR = CAMEL_REMOTE_BINDING_TYPE__CAMEL_OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__DIRECTORY = CAMEL_REMOTE_BINDING_TYPE__DIRECTORY;

    /**
     * The feature id for the '<em><b>Auto Create</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__AUTO_CREATE = CAMEL_REMOTE_BINDING_TYPE__AUTO_CREATE;

    /**
     * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__BUFFER_SIZE = CAMEL_REMOTE_BINDING_TYPE__BUFFER_SIZE;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__FILE_NAME = CAMEL_REMOTE_BINDING_TYPE__FILE_NAME;

    /**
     * The feature id for the '<em><b>Flatten</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__FLATTEN = CAMEL_REMOTE_BINDING_TYPE__FLATTEN;

    /**
     * The feature id for the '<em><b>Charset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__CHARSET = CAMEL_REMOTE_BINDING_TYPE__CHARSET;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__HOST = CAMEL_REMOTE_BINDING_TYPE__HOST;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__PORT = CAMEL_REMOTE_BINDING_TYPE__PORT;

    /**
     * The feature id for the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__USERNAME = CAMEL_REMOTE_BINDING_TYPE__USERNAME;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__PASSWORD = CAMEL_REMOTE_BINDING_TYPE__PASSWORD;

    /**
     * The feature id for the '<em><b>Binary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__BINARY = CAMEL_REMOTE_BINDING_TYPE__BINARY;

    /**
     * The feature id for the '<em><b>Connect Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__CONNECT_TIMEOUT = CAMEL_REMOTE_BINDING_TYPE__CONNECT_TIMEOUT;

    /**
     * The feature id for the '<em><b>Disconnect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__DISCONNECT = CAMEL_REMOTE_BINDING_TYPE__DISCONNECT;

    /**
     * The feature id for the '<em><b>Maximum Reconnect Attempts</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS = CAMEL_REMOTE_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS;

    /**
     * The feature id for the '<em><b>Reconnect Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__RECONNECT_DELAY = CAMEL_REMOTE_BINDING_TYPE__RECONNECT_DELAY;

    /**
     * The feature id for the '<em><b>Separator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__SEPARATOR = CAMEL_REMOTE_BINDING_TYPE__SEPARATOR;

    /**
     * The feature id for the '<em><b>Stepwise</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__STEPWISE = CAMEL_REMOTE_BINDING_TYPE__STEPWISE;

    /**
     * The feature id for the '<em><b>Throw Exception On Connect Failed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED = CAMEL_REMOTE_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED;

    /**
     * The feature id for the '<em><b>Consume</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__CONSUME = CAMEL_REMOTE_BINDING_TYPE__CONSUME;

    /**
     * The feature id for the '<em><b>Produce</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__PRODUCE = CAMEL_REMOTE_BINDING_TYPE__PRODUCE;

    /**
     * The feature id for the '<em><b>Passive Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE = CAMEL_REMOTE_BINDING_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__TIMEOUT = CAMEL_REMOTE_BINDING_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>So Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT = CAMEL_REMOTE_BINDING_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Site Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE__SITE_COMMAND = CAMEL_REMOTE_BINDING_TYPE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Ftp Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTP_BINDING_TYPE_FEATURE_COUNT = CAMEL_REMOTE_BINDING_TYPE_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFtpsBindingTypeImpl <em>Ftps Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFtpsBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelFtpsBindingType()
     * @generated
     */
    int CAMEL_FTPS_BINDING_TYPE = 6;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__DOCUMENTATION = CAMEL_FTP_BINDING_TYPE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__ANY_ATTRIBUTE = CAMEL_FTP_BINDING_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__WIRE_FORMAT_GROUP = CAMEL_FTP_BINDING_TYPE__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__WIRE_FORMAT = CAMEL_FTP_BINDING_TYPE__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__OPERATION_SELECTOR_GROUP = CAMEL_FTP_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__OPERATION_SELECTOR = CAMEL_FTP_BINDING_TYPE__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__NAME = CAMEL_FTP_BINDING_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__POLICY_SETS = CAMEL_FTP_BINDING_TYPE__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__REQUIRES = CAMEL_FTP_BINDING_TYPE__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__URI = CAMEL_FTP_BINDING_TYPE__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__CONTEXT_MAPPER = CAMEL_FTP_BINDING_TYPE__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__MESSAGE_COMPOSER = CAMEL_FTP_BINDING_TYPE__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Camel Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__CAMEL_OPERATION_SELECTOR = CAMEL_FTP_BINDING_TYPE__CAMEL_OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__DIRECTORY = CAMEL_FTP_BINDING_TYPE__DIRECTORY;

    /**
     * The feature id for the '<em><b>Auto Create</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__AUTO_CREATE = CAMEL_FTP_BINDING_TYPE__AUTO_CREATE;

    /**
     * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__BUFFER_SIZE = CAMEL_FTP_BINDING_TYPE__BUFFER_SIZE;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__FILE_NAME = CAMEL_FTP_BINDING_TYPE__FILE_NAME;

    /**
     * The feature id for the '<em><b>Flatten</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__FLATTEN = CAMEL_FTP_BINDING_TYPE__FLATTEN;

    /**
     * The feature id for the '<em><b>Charset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__CHARSET = CAMEL_FTP_BINDING_TYPE__CHARSET;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__HOST = CAMEL_FTP_BINDING_TYPE__HOST;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__PORT = CAMEL_FTP_BINDING_TYPE__PORT;

    /**
     * The feature id for the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__USERNAME = CAMEL_FTP_BINDING_TYPE__USERNAME;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__PASSWORD = CAMEL_FTP_BINDING_TYPE__PASSWORD;

    /**
     * The feature id for the '<em><b>Binary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__BINARY = CAMEL_FTP_BINDING_TYPE__BINARY;

    /**
     * The feature id for the '<em><b>Connect Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__CONNECT_TIMEOUT = CAMEL_FTP_BINDING_TYPE__CONNECT_TIMEOUT;

    /**
     * The feature id for the '<em><b>Disconnect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__DISCONNECT = CAMEL_FTP_BINDING_TYPE__DISCONNECT;

    /**
     * The feature id for the '<em><b>Maximum Reconnect Attempts</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS = CAMEL_FTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS;

    /**
     * The feature id for the '<em><b>Reconnect Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__RECONNECT_DELAY = CAMEL_FTP_BINDING_TYPE__RECONNECT_DELAY;

    /**
     * The feature id for the '<em><b>Separator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__SEPARATOR = CAMEL_FTP_BINDING_TYPE__SEPARATOR;

    /**
     * The feature id for the '<em><b>Stepwise</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__STEPWISE = CAMEL_FTP_BINDING_TYPE__STEPWISE;

    /**
     * The feature id for the '<em><b>Throw Exception On Connect Failed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED = CAMEL_FTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED;

    /**
     * The feature id for the '<em><b>Consume</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__CONSUME = CAMEL_FTP_BINDING_TYPE__CONSUME;

    /**
     * The feature id for the '<em><b>Produce</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__PRODUCE = CAMEL_FTP_BINDING_TYPE__PRODUCE;

    /**
     * The feature id for the '<em><b>Passive Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__PASSIVE_MODE = CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE;

    /**
     * The feature id for the '<em><b>Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__TIMEOUT = CAMEL_FTP_BINDING_TYPE__TIMEOUT;

    /**
     * The feature id for the '<em><b>So Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__SO_TIMEOUT = CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT;

    /**
     * The feature id for the '<em><b>Site Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__SITE_COMMAND = CAMEL_FTP_BINDING_TYPE__SITE_COMMAND;

    /**
     * The feature id for the '<em><b>Security Protocol</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__SECURITY_PROTOCOL = CAMEL_FTP_BINDING_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Implicit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__IS_IMPLICIT = CAMEL_FTP_BINDING_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Exec Pbsz</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__EXEC_PBSZ = CAMEL_FTP_BINDING_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Exec Prot</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__EXEC_PROT = CAMEL_FTP_BINDING_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Disable Secure Data Channel Defaults</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE__DISABLE_SECURE_DATA_CHANNEL_DEFAULTS = CAMEL_FTP_BINDING_TYPE_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Ftps Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_FTPS_BINDING_TYPE_FEATURE_COUNT = CAMEL_FTP_BINDING_TYPE_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelImplementationTypeImpl <em>Implementation Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelImplementationTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelImplementationType()
     * @generated
     */
	int CAMEL_IMPLEMENTATION_TYPE = 7;

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
     * The feature id for the '<em><b>Route</b></em>' reference.
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
     * The feature id for the '<em><b>Xml</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_IMPLEMENTATION_TYPE__XML = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Implementation Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_IMPLEMENTATION_TYPE_FEATURE_COUNT = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 3;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelJmsBindingTypeImpl <em>Jms Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelJmsBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelJmsBindingType()
     * @generated
     */
    int CAMEL_JMS_BINDING_TYPE = 8;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__DOCUMENTATION = BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__ANY_ATTRIBUTE = BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__WIRE_FORMAT_GROUP = BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__WIRE_FORMAT = BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__OPERATION_SELECTOR_GROUP = BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__OPERATION_SELECTOR = BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__NAME = BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__POLICY_SETS = BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__REQUIRES = BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__URI = BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Camel Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__CAMEL_OPERATION_SELECTOR = BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Queue</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__QUEUE = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Topic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__TOPIC = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Connection Factory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__CONNECTION_FACTORY = BASE_CAMEL_BINDING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__USERNAME = BASE_CAMEL_BINDING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__PASSWORD = BASE_CAMEL_BINDING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Client Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__CLIENT_ID = BASE_CAMEL_BINDING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Durable Subscription Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__DURABLE_SUBSCRIPTION_NAME = BASE_CAMEL_BINDING_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Concurrent Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__CONCURRENT_CONSUMERS = BASE_CAMEL_BINDING_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Max Concurrent Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__MAX_CONCURRENT_CONSUMERS = BASE_CAMEL_BINDING_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Disable Reply To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__DISABLE_REPLY_TO = BASE_CAMEL_BINDING_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Preserve Message Qos</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__PRESERVE_MESSAGE_QOS = BASE_CAMEL_BINDING_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Delivery Persistent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__DELIVERY_PERSISTENT = BASE_CAMEL_BINDING_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__PRIORITY = BASE_CAMEL_BINDING_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Explicit Qos Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__EXPLICIT_QOS_ENABLED = BASE_CAMEL_BINDING_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Reply To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__REPLY_TO = BASE_CAMEL_BINDING_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Reply To Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__REPLY_TO_TYPE = BASE_CAMEL_BINDING_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Request Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__REQUEST_TIMEOUT = BASE_CAMEL_BINDING_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Selector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__SELECTOR = BASE_CAMEL_BINDING_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Time To Live</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__TIME_TO_LIVE = BASE_CAMEL_BINDING_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Transacted</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__TRANSACTED = BASE_CAMEL_BINDING_FEATURE_COUNT + 19;

    /**
     * The feature id for the '<em><b>Transaction Manager</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE__TRANSACTION_MANAGER = BASE_CAMEL_BINDING_FEATURE_COUNT + 20;

    /**
     * The number of structural features of the '<em>Jms Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JMS_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 21;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelMockBindingTypeImpl <em>Mock Binding Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelMockBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelMockBindingType()
     * @generated
     */
	int CAMEL_MOCK_BINDING_TYPE = 9;

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
     * The feature id for the '<em><b>Context Mapper</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_MOCK_BINDING_TYPE__CONTEXT_MAPPER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Message Composer</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_MOCK_BINDING_TYPE__MESSAGE_COMPOSER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Name Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MOCK_BINDING_TYPE__NAME_ELEMENT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Report Group</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_MOCK_BINDING_TYPE__REPORT_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 3;

	/**
     * The number of structural features of the '<em>Mock Binding Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_MOCK_BINDING_TYPE_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 4;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelOperationSelectorTypeImpl <em>Operation Selector Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelOperationSelectorTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelOperationSelectorType()
     * @generated
     */
	int CAMEL_OPERATION_SELECTOR_TYPE = 10;

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
     * The feature id for the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_OPERATION_SELECTOR_TYPE__NAMESPACE = ScaPackage.OPERATION_SELECTOR_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Operation Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_OPERATION_SELECTOR_TYPE__OPERATION_NAME = ScaPackage.OPERATION_SELECTOR_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Operation Selector Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_OPERATION_SELECTOR_TYPE_FEATURE_COUNT = ScaPackage.OPERATION_SELECTOR_TYPE_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelSedaBindingTypeImpl <em>Seda Binding Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelSedaBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelSedaBindingType()
     * @generated
     */
	int CAMEL_SEDA_BINDING_TYPE = 11;

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
     * The feature id for the '<em><b>Context Mapper</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_SEDA_BINDING_TYPE__CONTEXT_MAPPER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Message Composer</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_SEDA_BINDING_TYPE__MESSAGE_COMPOSER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Name Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SEDA_BINDING_TYPE__NAME_ELEMENT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Size</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_SEDA_BINDING_TYPE__SIZE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Concurrent Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_SEDA_BINDING_TYPE__CONCURRENT_CONSUMERS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Wait For Task To Complete</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_SEDA_BINDING_TYPE__WAIT_FOR_TASK_TO_COMPLETE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 5;

	/**
     * The feature id for the '<em><b>Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_SEDA_BINDING_TYPE__TIMEOUT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 6;

	/**
     * The feature id for the '<em><b>Multiple Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_SEDA_BINDING_TYPE__MULTIPLE_CONSUMERS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 7;

	/**
     * The feature id for the '<em><b>Limit Concurrent Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_SEDA_BINDING_TYPE__LIMIT_CONCURRENT_CONSUMERS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 8;

	/**
     * The number of structural features of the '<em>Seda Binding Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_SEDA_BINDING_TYPE_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 9;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelTimerBindingTypeImpl <em>Timer Binding Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelTimerBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelTimerBindingType()
     * @generated
     */
	int CAMEL_TIMER_BINDING_TYPE = 12;

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
     * The feature id for the '<em><b>Context Mapper</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_TIMER_BINDING_TYPE__CONTEXT_MAPPER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Message Composer</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_TIMER_BINDING_TYPE__MESSAGE_COMPOSER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Name Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_TIMER_BINDING_TYPE__NAME_ELEMENT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Time</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_TIMER_BINDING_TYPE__TIME = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_TIMER_BINDING_TYPE__PATTERN = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Period</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_TIMER_BINDING_TYPE__PERIOD = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 5;

	/**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_TIMER_BINDING_TYPE__DELAY = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 6;

	/**
     * The feature id for the '<em><b>Fixed Rate</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_TIMER_BINDING_TYPE__FIXED_RATE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 7;

	/**
     * The feature id for the '<em><b>Daemon</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_TIMER_BINDING_TYPE__DAEMON = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 8;

	/**
     * The number of structural features of the '<em>Timer Binding Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CAMEL_TIMER_BINDING_TYPE_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 9;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelSftpBindingTypeImpl <em>Sftp Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelSftpBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelSftpBindingType()
     * @generated
     */
    int CAMEL_SFTP_BINDING_TYPE = 13;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__DOCUMENTATION = CAMEL_REMOTE_BINDING_TYPE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__ANY_ATTRIBUTE = CAMEL_REMOTE_BINDING_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__WIRE_FORMAT_GROUP = CAMEL_REMOTE_BINDING_TYPE__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__WIRE_FORMAT = CAMEL_REMOTE_BINDING_TYPE__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__OPERATION_SELECTOR_GROUP = CAMEL_REMOTE_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__OPERATION_SELECTOR = CAMEL_REMOTE_BINDING_TYPE__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__NAME = CAMEL_REMOTE_BINDING_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__POLICY_SETS = CAMEL_REMOTE_BINDING_TYPE__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__REQUIRES = CAMEL_REMOTE_BINDING_TYPE__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__URI = CAMEL_REMOTE_BINDING_TYPE__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__CONTEXT_MAPPER = CAMEL_REMOTE_BINDING_TYPE__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__MESSAGE_COMPOSER = CAMEL_REMOTE_BINDING_TYPE__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Camel Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__CAMEL_OPERATION_SELECTOR = CAMEL_REMOTE_BINDING_TYPE__CAMEL_OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__DIRECTORY = CAMEL_REMOTE_BINDING_TYPE__DIRECTORY;

    /**
     * The feature id for the '<em><b>Auto Create</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__AUTO_CREATE = CAMEL_REMOTE_BINDING_TYPE__AUTO_CREATE;

    /**
     * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__BUFFER_SIZE = CAMEL_REMOTE_BINDING_TYPE__BUFFER_SIZE;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__FILE_NAME = CAMEL_REMOTE_BINDING_TYPE__FILE_NAME;

    /**
     * The feature id for the '<em><b>Flatten</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__FLATTEN = CAMEL_REMOTE_BINDING_TYPE__FLATTEN;

    /**
     * The feature id for the '<em><b>Charset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__CHARSET = CAMEL_REMOTE_BINDING_TYPE__CHARSET;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__HOST = CAMEL_REMOTE_BINDING_TYPE__HOST;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__PORT = CAMEL_REMOTE_BINDING_TYPE__PORT;

    /**
     * The feature id for the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__USERNAME = CAMEL_REMOTE_BINDING_TYPE__USERNAME;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__PASSWORD = CAMEL_REMOTE_BINDING_TYPE__PASSWORD;

    /**
     * The feature id for the '<em><b>Binary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__BINARY = CAMEL_REMOTE_BINDING_TYPE__BINARY;

    /**
     * The feature id for the '<em><b>Connect Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__CONNECT_TIMEOUT = CAMEL_REMOTE_BINDING_TYPE__CONNECT_TIMEOUT;

    /**
     * The feature id for the '<em><b>Disconnect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__DISCONNECT = CAMEL_REMOTE_BINDING_TYPE__DISCONNECT;

    /**
     * The feature id for the '<em><b>Maximum Reconnect Attempts</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS = CAMEL_REMOTE_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS;

    /**
     * The feature id for the '<em><b>Reconnect Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__RECONNECT_DELAY = CAMEL_REMOTE_BINDING_TYPE__RECONNECT_DELAY;

    /**
     * The feature id for the '<em><b>Separator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__SEPARATOR = CAMEL_REMOTE_BINDING_TYPE__SEPARATOR;

    /**
     * The feature id for the '<em><b>Stepwise</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__STEPWISE = CAMEL_REMOTE_BINDING_TYPE__STEPWISE;

    /**
     * The feature id for the '<em><b>Throw Exception On Connect Failed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED = CAMEL_REMOTE_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED;

    /**
     * The feature id for the '<em><b>Consume</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__CONSUME = CAMEL_REMOTE_BINDING_TYPE__CONSUME;

    /**
     * The feature id for the '<em><b>Produce</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__PRODUCE = CAMEL_REMOTE_BINDING_TYPE__PRODUCE;

    /**
     * The feature id for the '<em><b>Known Hosts File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__KNOWN_HOSTS_FILE = CAMEL_REMOTE_BINDING_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Private Key File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE = CAMEL_REMOTE_BINDING_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Private Key File Passphrase</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE_PASSPHRASE = CAMEL_REMOTE_BINDING_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Sftp Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SFTP_BINDING_TYPE_FEATURE_COUNT = CAMEL_REMOTE_BINDING_TYPE_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getDocumentRoot()
     * @generated
     */
	int DOCUMENT_ROOT = 14;

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
     * The feature id for the '<em><b>Binding Ftp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_FTP = 7;

    /**
     * The feature id for the '<em><b>Binding Ftps</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_FTPS = 8;

    /**
     * The feature id for the '<em><b>Binding Jms</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_JMS = 9;

    /**
     * The feature id for the '<em><b>Binding Mock</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__BINDING_MOCK = 10;

	/**
     * The feature id for the '<em><b>Binding Seda</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__BINDING_SEDA = 11;

	/**
     * The feature id for the '<em><b>Binding Sftp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_SFTP = 12;

    /**
     * The feature id for the '<em><b>Binding Timer</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__BINDING_TIMER = 13;

	/**
     * The feature id for the '<em><b>Implementation Camel</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__IMPLEMENTATION_CAMEL = 14;

	/**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT_FEATURE_COUNT = 15;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.ScheduledPollConsumerTypeImpl <em>Scheduled Poll Consumer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.ScheduledPollConsumerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getScheduledPollConsumerType()
     * @generated
     */
    int SCHEDULED_POLL_CONSUMER_TYPE = 20;

    /**
     * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_POLL_CONSUMER_TYPE__INITIAL_DELAY = 0;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_POLL_CONSUMER_TYPE__DELAY = 1;

    /**
     * The feature id for the '<em><b>Use Fixed Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_POLL_CONSUMER_TYPE__USE_FIXED_DELAY = 2;

    /**
     * The feature id for the '<em><b>Send Empty Message When Idle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_POLL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE = 3;

    /**
     * The feature id for the '<em><b>Time Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_POLL_CONSUMER_TYPE__TIME_UNIT = 4;

    /**
     * The number of structural features of the '<em>Scheduled Poll Consumer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.ScheduledBatchPollConsumerTypeImpl <em>Scheduled Batch Poll Consumer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.ScheduledBatchPollConsumerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getScheduledBatchPollConsumerType()
     * @generated
     */
    int SCHEDULED_BATCH_POLL_CONSUMER_TYPE = 22;

    /**
     * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_BATCH_POLL_CONSUMER_TYPE__INITIAL_DELAY = SCHEDULED_POLL_CONSUMER_TYPE__INITIAL_DELAY;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_BATCH_POLL_CONSUMER_TYPE__DELAY = SCHEDULED_POLL_CONSUMER_TYPE__DELAY;

    /**
     * The feature id for the '<em><b>Use Fixed Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_BATCH_POLL_CONSUMER_TYPE__USE_FIXED_DELAY = SCHEDULED_POLL_CONSUMER_TYPE__USE_FIXED_DELAY;

    /**
     * The feature id for the '<em><b>Send Empty Message When Idle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_BATCH_POLL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE = SCHEDULED_POLL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE;

    /**
     * The feature id for the '<em><b>Time Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_BATCH_POLL_CONSUMER_TYPE__TIME_UNIT = SCHEDULED_POLL_CONSUMER_TYPE__TIME_UNIT;

    /**
     * The feature id for the '<em><b>Max Messages Per Poll</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_BATCH_POLL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL = SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Scheduled Batch Poll Consumer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT = SCHEDULED_POLL_CONSUMER_TYPE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.GenericFileConsumerTypeImpl <em>Generic File Consumer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.GenericFileConsumerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getGenericFileConsumerType()
     * @generated
     */
    int GENERIC_FILE_CONSUMER_TYPE = 23;

    /**
     * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__INITIAL_DELAY = SCHEDULED_BATCH_POLL_CONSUMER_TYPE__INITIAL_DELAY;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__DELAY = SCHEDULED_BATCH_POLL_CONSUMER_TYPE__DELAY;

    /**
     * The feature id for the '<em><b>Use Fixed Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__USE_FIXED_DELAY = SCHEDULED_BATCH_POLL_CONSUMER_TYPE__USE_FIXED_DELAY;

    /**
     * The feature id for the '<em><b>Send Empty Message When Idle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE = SCHEDULED_BATCH_POLL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE;

    /**
     * The feature id for the '<em><b>Time Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__TIME_UNIT = SCHEDULED_BATCH_POLL_CONSUMER_TYPE__TIME_UNIT;

    /**
     * The feature id for the '<em><b>Max Messages Per Poll</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL = SCHEDULED_BATCH_POLL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL;

    /**
     * The feature id for the '<em><b>Delete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__DELETE = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Recursive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__RECURSIVE = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Noop</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__NOOP = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Pre Move</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__PRE_MOVE = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Move</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__MOVE = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Move Failed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__MOVE_FAILED = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Include</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__INCLUDE = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Exclude</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__EXCLUDE = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Idempotent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Idempotent Repository</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>In Progress Repository</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__FILTER = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Sorter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__SORTER = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Sort By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__SORT_BY = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Read Lock</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__READ_LOCK = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Read Lock Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Read Lock Check Interval</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Exclusive Read Lock Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Process Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__PROCESS_STRATEGY = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Starting Directory Must Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 19;

    /**
     * The feature id for the '<em><b>Directory Must Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 20;

    /**
     * The feature id for the '<em><b>Done File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE__DONE_FILE_NAME = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 21;

    /**
     * The number of structural features of the '<em>Generic File Consumer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_CONSUMER_TYPE_FEATURE_COUNT = SCHEDULED_BATCH_POLL_CONSUMER_TYPE_FEATURE_COUNT + 22;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl <em>File Consumer Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.FileConsumerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getFileConsumerType()
     * @generated
     */
	int FILE_CONSUMER_TYPE = 16;

	/**
     * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__INITIAL_DELAY = GENERIC_FILE_CONSUMER_TYPE__INITIAL_DELAY;

	/**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__DELAY = GENERIC_FILE_CONSUMER_TYPE__DELAY;

	/**
     * The feature id for the '<em><b>Use Fixed Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__USE_FIXED_DELAY = GENERIC_FILE_CONSUMER_TYPE__USE_FIXED_DELAY;

	/**
     * The feature id for the '<em><b>Send Empty Message When Idle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE = GENERIC_FILE_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE;

    /**
     * The feature id for the '<em><b>Time Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONSUMER_TYPE__TIME_UNIT = GENERIC_FILE_CONSUMER_TYPE__TIME_UNIT;

    /**
     * The feature id for the '<em><b>Max Messages Per Poll</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL = GENERIC_FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL;

    /**
     * The feature id for the '<em><b>Delete</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__DELETE = GENERIC_FILE_CONSUMER_TYPE__DELETE;

    /**
     * The feature id for the '<em><b>Recursive</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__RECURSIVE = GENERIC_FILE_CONSUMER_TYPE__RECURSIVE;

    /**
     * The feature id for the '<em><b>Noop</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__NOOP = GENERIC_FILE_CONSUMER_TYPE__NOOP;

    /**
     * The feature id for the '<em><b>Pre Move</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__PRE_MOVE = GENERIC_FILE_CONSUMER_TYPE__PRE_MOVE;

    /**
     * The feature id for the '<em><b>Move</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__MOVE = GENERIC_FILE_CONSUMER_TYPE__MOVE;

    /**
     * The feature id for the '<em><b>Move Failed</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__MOVE_FAILED = GENERIC_FILE_CONSUMER_TYPE__MOVE_FAILED;

    /**
     * The feature id for the '<em><b>Include</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__INCLUDE = GENERIC_FILE_CONSUMER_TYPE__INCLUDE;

    /**
     * The feature id for the '<em><b>Exclude</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__EXCLUDE = GENERIC_FILE_CONSUMER_TYPE__EXCLUDE;

    /**
     * The feature id for the '<em><b>Idempotent</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__IDEMPOTENT = GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT;

    /**
     * The feature id for the '<em><b>Idempotent Repository</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY = GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY;

    /**
     * The feature id for the '<em><b>In Progress Repository</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY = GENERIC_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY;

    /**
     * The feature id for the '<em><b>Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__FILTER = GENERIC_FILE_CONSUMER_TYPE__FILTER;

    /**
     * The feature id for the '<em><b>Sorter</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__SORTER = GENERIC_FILE_CONSUMER_TYPE__SORTER;

    /**
     * The feature id for the '<em><b>Sort By</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__SORT_BY = GENERIC_FILE_CONSUMER_TYPE__SORT_BY;

    /**
     * The feature id for the '<em><b>Read Lock</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__READ_LOCK = GENERIC_FILE_CONSUMER_TYPE__READ_LOCK;

    /**
     * The feature id for the '<em><b>Read Lock Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT = GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT;

    /**
     * The feature id for the '<em><b>Read Lock Check Interval</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL = GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL;

    /**
     * The feature id for the '<em><b>Exclusive Read Lock Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY = GENERIC_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY;

    /**
     * The feature id for the '<em><b>Process Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__PROCESS_STRATEGY = GENERIC_FILE_CONSUMER_TYPE__PROCESS_STRATEGY;

	/**
     * The feature id for the '<em><b>Starting Directory Must Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST = GENERIC_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST;

	/**
     * The feature id for the '<em><b>Directory Must Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST = GENERIC_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST;

	/**
     * The feature id for the '<em><b>Done File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE__DONE_FILE_NAME = GENERIC_FILE_CONSUMER_TYPE__DONE_FILE_NAME;

	/**
     * The number of structural features of the '<em>File Consumer Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_CONSUMER_TYPE_FEATURE_COUNT = GENERIC_FILE_CONSUMER_TYPE_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.GenericFileProducerTypeImpl <em>Generic File Producer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.GenericFileProducerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getGenericFileProducerType()
     * @generated
     */
    int GENERIC_FILE_PRODUCER_TYPE = 24;

    /**
     * The feature id for the '<em><b>File Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_PRODUCER_TYPE__FILE_EXIST = 0;

    /**
     * The feature id for the '<em><b>Temp Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_PRODUCER_TYPE__TEMP_PREFIX = 1;

    /**
     * The feature id for the '<em><b>Temp File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_PRODUCER_TYPE__TEMP_FILE_NAME = 2;

    /**
     * The feature id for the '<em><b>Keep Last Modified</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED = 3;

    /**
     * The feature id for the '<em><b>Eager Delete Target File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE = 4;

    /**
     * The feature id for the '<em><b>Done File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_PRODUCER_TYPE__DONE_FILE_NAME = 5;

    /**
     * The number of structural features of the '<em>Generic File Producer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_FILE_PRODUCER_TYPE_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileProducerTypeImpl <em>File Producer Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.FileProducerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getFileProducerType()
     * @generated
     */
	int FILE_PRODUCER_TYPE = 17;

	/**
     * The feature id for the '<em><b>File Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_PRODUCER_TYPE__FILE_EXIST = GENERIC_FILE_PRODUCER_TYPE__FILE_EXIST;

	/**
     * The feature id for the '<em><b>Temp Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_PRODUCER_TYPE__TEMP_PREFIX = GENERIC_FILE_PRODUCER_TYPE__TEMP_PREFIX;

	/**
     * The feature id for the '<em><b>Temp File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_PRODUCER_TYPE__TEMP_FILE_NAME = GENERIC_FILE_PRODUCER_TYPE__TEMP_FILE_NAME;

	/**
     * The feature id for the '<em><b>Keep Last Modified</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED = GENERIC_FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED;

	/**
     * The feature id for the '<em><b>Eager Delete Target File</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE = GENERIC_FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE;

	/**
     * The feature id for the '<em><b>Done File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_PRODUCER_TYPE__DONE_FILE_NAME = GENERIC_FILE_PRODUCER_TYPE__DONE_FILE_NAME;

	/**
     * The number of structural features of the '<em>File Producer Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FILE_PRODUCER_TYPE_FEATURE_COUNT = GENERIC_FILE_PRODUCER_TYPE_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.JavaDSLTypeImpl <em>Java DSL Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.JavaDSLTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getJavaDSLType()
     * @generated
     */
	int JAVA_DSL_TYPE = 18;

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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.XMLDSLTypeImpl <em>XMLDSL Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.XMLDSLTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getXMLDSLType()
     * @generated
     */
    int XMLDSL_TYPE = 19;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XMLDSL_TYPE__PATH = 0;

    /**
     * The number of structural features of the '<em>XMLDSL Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XMLDSL_TYPE_FEATURE_COUNT = 1;


    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.RemoteFileConsumerTypeImpl <em>Remote File Consumer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.RemoteFileConsumerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getRemoteFileConsumerType()
     * @generated
     */
    int REMOTE_FILE_CONSUMER_TYPE = 25;

    /**
     * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__INITIAL_DELAY = GENERIC_FILE_CONSUMER_TYPE__INITIAL_DELAY;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__DELAY = GENERIC_FILE_CONSUMER_TYPE__DELAY;

    /**
     * The feature id for the '<em><b>Use Fixed Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__USE_FIXED_DELAY = GENERIC_FILE_CONSUMER_TYPE__USE_FIXED_DELAY;

    /**
     * The feature id for the '<em><b>Send Empty Message When Idle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE = GENERIC_FILE_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE;

    /**
     * The feature id for the '<em><b>Time Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__TIME_UNIT = GENERIC_FILE_CONSUMER_TYPE__TIME_UNIT;

    /**
     * The feature id for the '<em><b>Max Messages Per Poll</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL = GENERIC_FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL;

    /**
     * The feature id for the '<em><b>Delete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__DELETE = GENERIC_FILE_CONSUMER_TYPE__DELETE;

    /**
     * The feature id for the '<em><b>Recursive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__RECURSIVE = GENERIC_FILE_CONSUMER_TYPE__RECURSIVE;

    /**
     * The feature id for the '<em><b>Noop</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__NOOP = GENERIC_FILE_CONSUMER_TYPE__NOOP;

    /**
     * The feature id for the '<em><b>Pre Move</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__PRE_MOVE = GENERIC_FILE_CONSUMER_TYPE__PRE_MOVE;

    /**
     * The feature id for the '<em><b>Move</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__MOVE = GENERIC_FILE_CONSUMER_TYPE__MOVE;

    /**
     * The feature id for the '<em><b>Move Failed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__MOVE_FAILED = GENERIC_FILE_CONSUMER_TYPE__MOVE_FAILED;

    /**
     * The feature id for the '<em><b>Include</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__INCLUDE = GENERIC_FILE_CONSUMER_TYPE__INCLUDE;

    /**
     * The feature id for the '<em><b>Exclude</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__EXCLUDE = GENERIC_FILE_CONSUMER_TYPE__EXCLUDE;

    /**
     * The feature id for the '<em><b>Idempotent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT = GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT;

    /**
     * The feature id for the '<em><b>Idempotent Repository</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY = GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY;

    /**
     * The feature id for the '<em><b>In Progress Repository</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY = GENERIC_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY;

    /**
     * The feature id for the '<em><b>Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__FILTER = GENERIC_FILE_CONSUMER_TYPE__FILTER;

    /**
     * The feature id for the '<em><b>Sorter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__SORTER = GENERIC_FILE_CONSUMER_TYPE__SORTER;

    /**
     * The feature id for the '<em><b>Sort By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__SORT_BY = GENERIC_FILE_CONSUMER_TYPE__SORT_BY;

    /**
     * The feature id for the '<em><b>Read Lock</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__READ_LOCK = GENERIC_FILE_CONSUMER_TYPE__READ_LOCK;

    /**
     * The feature id for the '<em><b>Read Lock Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT = GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT;

    /**
     * The feature id for the '<em><b>Read Lock Check Interval</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL = GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL;

    /**
     * The feature id for the '<em><b>Exclusive Read Lock Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY = GENERIC_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY;

    /**
     * The feature id for the '<em><b>Process Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__PROCESS_STRATEGY = GENERIC_FILE_CONSUMER_TYPE__PROCESS_STRATEGY;

    /**
     * The feature id for the '<em><b>Starting Directory Must Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST = GENERIC_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST;

    /**
     * The feature id for the '<em><b>Directory Must Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST = GENERIC_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST;

    /**
     * The feature id for the '<em><b>Done File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE__DONE_FILE_NAME = GENERIC_FILE_CONSUMER_TYPE__DONE_FILE_NAME;

    /**
     * The number of structural features of the '<em>Remote File Consumer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_CONSUMER_TYPE_FEATURE_COUNT = GENERIC_FILE_CONSUMER_TYPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.RemoteFileProducerTypeImpl <em>Remote File Producer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.RemoteFileProducerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getRemoteFileProducerType()
     * @generated
     */
    int REMOTE_FILE_PRODUCER_TYPE = 26;

    /**
     * The feature id for the '<em><b>File Exist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_PRODUCER_TYPE__FILE_EXIST = GENERIC_FILE_PRODUCER_TYPE__FILE_EXIST;

    /**
     * The feature id for the '<em><b>Temp Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_PRODUCER_TYPE__TEMP_PREFIX = GENERIC_FILE_PRODUCER_TYPE__TEMP_PREFIX;

    /**
     * The feature id for the '<em><b>Temp File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_PRODUCER_TYPE__TEMP_FILE_NAME = GENERIC_FILE_PRODUCER_TYPE__TEMP_FILE_NAME;

    /**
     * The feature id for the '<em><b>Keep Last Modified</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED = GENERIC_FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED;

    /**
     * The feature id for the '<em><b>Eager Delete Target File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE = GENERIC_FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE;

    /**
     * The feature id for the '<em><b>Done File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_PRODUCER_TYPE__DONE_FILE_NAME = GENERIC_FILE_PRODUCER_TYPE__DONE_FILE_NAME;

    /**
     * The number of structural features of the '<em>Remote File Producer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMOTE_FILE_PRODUCER_TYPE_FEATURE_COUNT = GENERIC_FILE_PRODUCER_TYPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.TimeUnit <em>Time Unit</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.TimeUnit
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getTimeUnit()
     * @generated
     */
    int TIME_UNIT = 27;

    /**
     * The meta object id for the '<em>Time Unit Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.TimeUnit
     * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getTimeUnitObject()
     * @generated
     */
    int TIME_UNIT_OBJECT = 28;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.BaseCamelBinding <em>Base Camel Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base Camel Binding</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.BaseCamelBinding
     * @generated
     */
    EClass getBaseCamelBinding();

    /**
     * Returns the meta object for the reference '{@link org.switchyard.tools.models.switchyard1_0.camel.BaseCamelBinding#getContextMapper <em>Context Mapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Context Mapper</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.BaseCamelBinding#getContextMapper()
     * @see #getBaseCamelBinding()
     * @generated
     */
    EReference getBaseCamelBinding_ContextMapper();

    /**
     * Returns the meta object for the reference '{@link org.switchyard.tools.models.switchyard1_0.camel.BaseCamelBinding#getMessageComposer <em>Message Composer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Message Composer</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.BaseCamelBinding#getMessageComposer()
     * @see #getBaseCamelBinding()
     * @generated
     */
    EReference getBaseCamelBinding_MessageComposer();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.BaseCamelBinding#getCamelOperationSelector <em>Camel Operation Selector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Camel Operation Selector</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.BaseCamelBinding#getCamelOperationSelector()
     * @see #getBaseCamelBinding()
     * @generated
     */
    EReference getBaseCamelBinding_CamelOperationSelector();

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
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType#getConsume <em>Consume</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Consume</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType#getConsume()
     * @see #getCamelAtomBindingType()
     * @generated
     */
    EReference getCamelAtomBindingType_Consume();

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
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelBindingType#getConfigURI <em>Config URI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Config URI</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelBindingType#getConfigURI()
     * @see #getCamelBindingType()
     * @generated
     */
    EAttribute getCamelBindingType_ConfigURI();

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
     * Returns the meta object for the reference '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelDirectBindingType#getContextMapper <em>Context Mapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Context Mapper</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelDirectBindingType#getContextMapper()
     * @see #getCamelDirectBindingType()
     * @generated
     */
    EReference getCamelDirectBindingType_ContextMapper();

    /**
     * Returns the meta object for the reference '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelDirectBindingType#getMessageComposer <em>Message Composer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Message Composer</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelDirectBindingType#getMessageComposer()
     * @see #getCamelDirectBindingType()
     * @generated
     */
    EReference getCamelDirectBindingType_MessageComposer();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelDirectBindingType#getNameElement <em>Name Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name Element</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelDirectBindingType#getNameElement()
     * @see #getCamelDirectBindingType()
     * @generated
     */
    EAttribute getCamelDirectBindingType_NameElement();

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
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType <em>Ftp Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ftp Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType
     * @generated
     */
    EClass getCamelFtpBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType#isPassiveMode <em>Passive Mode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Passive Mode</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType#isPassiveMode()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_PassiveMode();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType#getTimeout <em>Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Timeout</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType#getTimeout()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_Timeout();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType#getSoTimeout <em>So Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>So Timeout</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType#getSoTimeout()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_SoTimeout();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType#getSiteCommand <em>Site Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Site Command</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType#getSiteCommand()
     * @see #getCamelFtpBindingType()
     * @generated
     */
    EAttribute getCamelFtpBindingType_SiteCommand();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpsBindingType <em>Ftps Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ftps Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFtpsBindingType
     * @generated
     */
    EClass getCamelFtpsBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpsBindingType#getSecurityProtocol <em>Security Protocol</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Security Protocol</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFtpsBindingType#getSecurityProtocol()
     * @see #getCamelFtpsBindingType()
     * @generated
     */
    EAttribute getCamelFtpsBindingType_SecurityProtocol();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpsBindingType#isIsImplicit <em>Is Implicit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Implicit</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFtpsBindingType#isIsImplicit()
     * @see #getCamelFtpsBindingType()
     * @generated
     */
    EAttribute getCamelFtpsBindingType_IsImplicit();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpsBindingType#getExecPbsz <em>Exec Pbsz</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Exec Pbsz</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFtpsBindingType#getExecPbsz()
     * @see #getCamelFtpsBindingType()
     * @generated
     */
    EAttribute getCamelFtpsBindingType_ExecPbsz();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpsBindingType#getExecProt <em>Exec Prot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Exec Prot</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFtpsBindingType#getExecProt()
     * @see #getCamelFtpsBindingType()
     * @generated
     */
    EAttribute getCamelFtpsBindingType_ExecProt();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFtpsBindingType#isDisableSecureDataChannelDefaults <em>Disable Secure Data Channel Defaults</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Disable Secure Data Channel Defaults</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFtpsBindingType#isDisableSecureDataChannelDefaults()
     * @see #getCamelFtpsBindingType()
     * @generated
     */
    EAttribute getCamelFtpsBindingType_DisableSecureDataChannelDefaults();

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
     * Returns the meta object for the reference '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType#getRoute <em>Route</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Route</em>'.
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
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType#getXml <em>Xml</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Xml</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType#getXml()
     * @see #getCamelImplementationType()
     * @generated
     */
    EReference getCamelImplementationType_Xml();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType <em>Jms Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Jms Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType
     * @generated
     */
    EClass getCamelJmsBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getQueue <em>Queue</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Queue</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getQueue()
     * @see #getCamelJmsBindingType()
     * @generated
     */
    EAttribute getCamelJmsBindingType_Queue();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getTopic <em>Topic</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Topic</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getTopic()
     * @see #getCamelJmsBindingType()
     * @generated
     */
    EAttribute getCamelJmsBindingType_Topic();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getConnectionFactory <em>Connection Factory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connection Factory</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getConnectionFactory()
     * @see #getCamelJmsBindingType()
     * @generated
     */
    EAttribute getCamelJmsBindingType_ConnectionFactory();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getUsername <em>Username</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Username</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getUsername()
     * @see #getCamelJmsBindingType()
     * @generated
     */
    EAttribute getCamelJmsBindingType_Username();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getPassword <em>Password</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Password</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getPassword()
     * @see #getCamelJmsBindingType()
     * @generated
     */
    EAttribute getCamelJmsBindingType_Password();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getClientId <em>Client Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Client Id</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getClientId()
     * @see #getCamelJmsBindingType()
     * @generated
     */
    EAttribute getCamelJmsBindingType_ClientId();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getDurableSubscriptionName <em>Durable Subscription Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Durable Subscription Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getDurableSubscriptionName()
     * @see #getCamelJmsBindingType()
     * @generated
     */
    EAttribute getCamelJmsBindingType_DurableSubscriptionName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getConcurrentConsumers <em>Concurrent Consumers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Concurrent Consumers</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getConcurrentConsumers()
     * @see #getCamelJmsBindingType()
     * @generated
     */
    EAttribute getCamelJmsBindingType_ConcurrentConsumers();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getMaxConcurrentConsumers <em>Max Concurrent Consumers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Concurrent Consumers</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getMaxConcurrentConsumers()
     * @see #getCamelJmsBindingType()
     * @generated
     */
    EAttribute getCamelJmsBindingType_MaxConcurrentConsumers();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isDisableReplyTo <em>Disable Reply To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Disable Reply To</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isDisableReplyTo()
     * @see #getCamelJmsBindingType()
     * @generated
     */
    EAttribute getCamelJmsBindingType_DisableReplyTo();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isPreserveMessageQos <em>Preserve Message Qos</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Preserve Message Qos</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isPreserveMessageQos()
     * @see #getCamelJmsBindingType()
     * @generated
     */
    EAttribute getCamelJmsBindingType_PreserveMessageQos();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isDeliveryPersistent <em>Delivery Persistent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delivery Persistent</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isDeliveryPersistent()
     * @see #getCamelJmsBindingType()
     * @generated
     */
    EAttribute getCamelJmsBindingType_DeliveryPersistent();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getPriority <em>Priority</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Priority</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getPriority()
     * @see #getCamelJmsBindingType()
     * @generated
     */
    EAttribute getCamelJmsBindingType_Priority();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isExplicitQosEnabled <em>Explicit Qos Enabled</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Explicit Qos Enabled</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isExplicitQosEnabled()
     * @see #getCamelJmsBindingType()
     * @generated
     */
    EAttribute getCamelJmsBindingType_ExplicitQosEnabled();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getReplyTo <em>Reply To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reply To</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getReplyTo()
     * @see #getCamelJmsBindingType()
     * @generated
     */
    EAttribute getCamelJmsBindingType_ReplyTo();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getReplyToType <em>Reply To Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reply To Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getReplyToType()
     * @see #getCamelJmsBindingType()
     * @generated
     */
    EAttribute getCamelJmsBindingType_ReplyToType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getRequestTimeout <em>Request Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Request Timeout</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getRequestTimeout()
     * @see #getCamelJmsBindingType()
     * @generated
     */
    EAttribute getCamelJmsBindingType_RequestTimeout();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getSelector <em>Selector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Selector</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getSelector()
     * @see #getCamelJmsBindingType()
     * @generated
     */
    EAttribute getCamelJmsBindingType_Selector();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getTimeToLive <em>Time To Live</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time To Live</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getTimeToLive()
     * @see #getCamelJmsBindingType()
     * @generated
     */
    EAttribute getCamelJmsBindingType_TimeToLive();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isTransacted <em>Transacted</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transacted</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#isTransacted()
     * @see #getCamelJmsBindingType()
     * @generated
     */
    EAttribute getCamelJmsBindingType_Transacted();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getTransactionManager <em>Transaction Manager</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transaction Manager</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType#getTransactionManager()
     * @see #getCamelJmsBindingType()
     * @generated
     */
    EAttribute getCamelJmsBindingType_TransactionManager();

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
     * Returns the meta object for the reference '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType#getContextMapper <em>Context Mapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Context Mapper</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType#getContextMapper()
     * @see #getCamelMockBindingType()
     * @generated
     */
    EReference getCamelMockBindingType_ContextMapper();

    /**
     * Returns the meta object for the reference '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType#getMessageComposer <em>Message Composer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Message Composer</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType#getMessageComposer()
     * @see #getCamelMockBindingType()
     * @generated
     */
    EReference getCamelMockBindingType_MessageComposer();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType#getNameElement <em>Name Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name Element</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType#getNameElement()
     * @see #getCamelMockBindingType()
     * @generated
     */
    EAttribute getCamelMockBindingType_NameElement();

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
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelOperationSelectorType#getNamespace <em>Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Namespace</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelOperationSelectorType#getNamespace()
     * @see #getCamelOperationSelectorType()
     * @generated
     */
    EAttribute getCamelOperationSelectorType_Namespace();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelOperationSelectorType#getOperationName <em>Operation Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operation Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelOperationSelectorType#getOperationName()
     * @see #getCamelOperationSelectorType()
     * @generated
     */
    EAttribute getCamelOperationSelectorType_OperationName();

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
     * Returns the meta object for the reference '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getContextMapper <em>Context Mapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Context Mapper</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getContextMapper()
     * @see #getCamelSedaBindingType()
     * @generated
     */
    EReference getCamelSedaBindingType_ContextMapper();

    /**
     * Returns the meta object for the reference '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getMessageComposer <em>Message Composer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Message Composer</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getMessageComposer()
     * @see #getCamelSedaBindingType()
     * @generated
     */
    EReference getCamelSedaBindingType_MessageComposer();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getNameElement <em>Name Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name Element</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType#getNameElement()
     * @see #getCamelSedaBindingType()
     * @generated
     */
    EAttribute getCamelSedaBindingType_NameElement();

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
     * Returns the meta object for the reference '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getContextMapper <em>Context Mapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Context Mapper</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getContextMapper()
     * @see #getCamelTimerBindingType()
     * @generated
     */
    EReference getCamelTimerBindingType_ContextMapper();

    /**
     * Returns the meta object for the reference '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getMessageComposer <em>Message Composer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Message Composer</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getMessageComposer()
     * @see #getCamelTimerBindingType()
     * @generated
     */
    EReference getCamelTimerBindingType_MessageComposer();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getNameElement <em>Name Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name Element</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType#getNameElement()
     * @see #getCamelTimerBindingType()
     * @generated
     */
    EAttribute getCamelTimerBindingType_NameElement();

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
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSftpBindingType <em>Sftp Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sftp Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelSftpBindingType
     * @generated
     */
    EClass getCamelSftpBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSftpBindingType#getKnownHostsFile <em>Known Hosts File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Known Hosts File</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelSftpBindingType#getKnownHostsFile()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EAttribute getCamelSftpBindingType_KnownHostsFile();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSftpBindingType#getPrivateKeyFile <em>Private Key File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Private Key File</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelSftpBindingType#getPrivateKeyFile()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EAttribute getCamelSftpBindingType_PrivateKeyFile();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSftpBindingType#getPrivateKeyFilePassphrase <em>Private Key File Passphrase</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Private Key File Passphrase</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelSftpBindingType#getPrivateKeyFilePassphrase()
     * @see #getCamelSftpBindingType()
     * @generated
     */
    EAttribute getCamelSftpBindingType_PrivateKeyFilePassphrase();

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
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingFtp <em>Binding Ftp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Ftp</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingFtp()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingFtp();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingFtps <em>Binding Ftps</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Ftps</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingFtps()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingFtps();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingJms <em>Binding Jms</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Jms</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingJms()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingJms();

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
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingSftp <em>Binding Sftp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Sftp</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot#getBindingSftp()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingSftp();

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
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType <em>Remote Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Remote Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType
     * @generated
     */
    EClass getCamelRemoteBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getHost <em>Host</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Host</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getHost()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EAttribute getCamelRemoteBindingType_Host();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getPort <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Port</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getPort()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EAttribute getCamelRemoteBindingType_Port();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getUsername <em>Username</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Username</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getUsername()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EAttribute getCamelRemoteBindingType_Username();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getPassword <em>Password</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Password</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getPassword()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EAttribute getCamelRemoteBindingType_Password();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#isBinary <em>Binary</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Binary</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#isBinary()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EAttribute getCamelRemoteBindingType_Binary();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getConnectTimeout <em>Connect Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connect Timeout</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getConnectTimeout()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EAttribute getCamelRemoteBindingType_ConnectTimeout();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#isDisconnect <em>Disconnect</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Disconnect</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#isDisconnect()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EAttribute getCamelRemoteBindingType_Disconnect();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getMaximumReconnectAttempts <em>Maximum Reconnect Attempts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Maximum Reconnect Attempts</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getMaximumReconnectAttempts()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EAttribute getCamelRemoteBindingType_MaximumReconnectAttempts();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getReconnectDelay <em>Reconnect Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reconnect Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getReconnectDelay()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EAttribute getCamelRemoteBindingType_ReconnectDelay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getSeparator <em>Separator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Separator</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getSeparator()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EAttribute getCamelRemoteBindingType_Separator();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#isStepwise <em>Stepwise</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stepwise</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#isStepwise()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EAttribute getCamelRemoteBindingType_Stepwise();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#isThrowExceptionOnConnectFailed <em>Throw Exception On Connect Failed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Throw Exception On Connect Failed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#isThrowExceptionOnConnectFailed()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EAttribute getCamelRemoteBindingType_ThrowExceptionOnConnectFailed();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getConsume <em>Consume</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Consume</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getConsume()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EReference getCamelRemoteBindingType_Consume();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getProduce <em>Produce</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Produce</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelRemoteBindingType#getProduce()
     * @see #getCamelRemoteBindingType()
     * @generated
     */
    EReference getCamelRemoteBindingType_Produce();

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
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.FileProducerType <em>File Producer Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>File Producer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.FileProducerType
     * @generated
     */
	EClass getFileProducerType();

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
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.XMLDSLType <em>XMLDSL Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>XMLDSL Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.XMLDSLType
     * @generated
     */
    EClass getXMLDSLType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.XMLDSLType#getPath <em>Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Path</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.XMLDSLType#getPath()
     * @see #getXMLDSLType()
     * @generated
     */
    EAttribute getXMLDSLType_Path();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.ScheduledPollConsumerType <em>Scheduled Poll Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scheduled Poll Consumer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ScheduledPollConsumerType
     * @generated
     */
    EClass getScheduledPollConsumerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ScheduledPollConsumerType#getInitialDelay <em>Initial Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initial Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ScheduledPollConsumerType#getInitialDelay()
     * @see #getScheduledPollConsumerType()
     * @generated
     */
    EAttribute getScheduledPollConsumerType_InitialDelay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ScheduledPollConsumerType#getDelay <em>Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ScheduledPollConsumerType#getDelay()
     * @see #getScheduledPollConsumerType()
     * @generated
     */
    EAttribute getScheduledPollConsumerType_Delay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ScheduledPollConsumerType#isUseFixedDelay <em>Use Fixed Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Fixed Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ScheduledPollConsumerType#isUseFixedDelay()
     * @see #getScheduledPollConsumerType()
     * @generated
     */
    EAttribute getScheduledPollConsumerType_UseFixedDelay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ScheduledPollConsumerType#isSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Send Empty Message When Idle</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ScheduledPollConsumerType#isSendEmptyMessageWhenIdle()
     * @see #getScheduledPollConsumerType()
     * @generated
     */
    EAttribute getScheduledPollConsumerType_SendEmptyMessageWhenIdle();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ScheduledPollConsumerType#getTimeUnit <em>Time Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time Unit</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ScheduledPollConsumerType#getTimeUnit()
     * @see #getScheduledPollConsumerType()
     * @generated
     */
    EAttribute getScheduledPollConsumerType_TimeUnit();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType <em>Generic File Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Generic File Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType
     * @generated
     */
    EClass getGenericFileBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#getDirectory <em>Directory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Directory</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#getDirectory()
     * @see #getGenericFileBindingType()
     * @generated
     */
    EAttribute getGenericFileBindingType_Directory();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#isAutoCreate <em>Auto Create</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Auto Create</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#isAutoCreate()
     * @see #getGenericFileBindingType()
     * @generated
     */
    EAttribute getGenericFileBindingType_AutoCreate();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#getBufferSize <em>Buffer Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Buffer Size</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#getBufferSize()
     * @see #getGenericFileBindingType()
     * @generated
     */
    EAttribute getGenericFileBindingType_BufferSize();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#getFileName <em>File Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#getFileName()
     * @see #getGenericFileBindingType()
     * @generated
     */
    EAttribute getGenericFileBindingType_FileName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#isFlatten <em>Flatten</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Flatten</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#isFlatten()
     * @see #getGenericFileBindingType()
     * @generated
     */
    EAttribute getGenericFileBindingType_Flatten();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#getCharset <em>Charset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Charset</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileBindingType#getCharset()
     * @see #getGenericFileBindingType()
     * @generated
     */
    EAttribute getGenericFileBindingType_Charset();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.ScheduledBatchPollConsumerType <em>Scheduled Batch Poll Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scheduled Batch Poll Consumer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ScheduledBatchPollConsumerType
     * @generated
     */
    EClass getScheduledBatchPollConsumerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.ScheduledBatchPollConsumerType#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Messages Per Poll</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.ScheduledBatchPollConsumerType#getMaxMessagesPerPoll()
     * @see #getScheduledBatchPollConsumerType()
     * @generated
     */
    EAttribute getScheduledBatchPollConsumerType_MaxMessagesPerPoll();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType <em>Generic File Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Generic File Consumer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType
     * @generated
     */
    EClass getGenericFileConsumerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isDelete <em>Delete</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delete</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isDelete()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_Delete();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isRecursive <em>Recursive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Recursive</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isRecursive()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_Recursive();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isNoop <em>Noop</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Noop</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isNoop()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_Noop();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getPreMove <em>Pre Move</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pre Move</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getPreMove()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_PreMove();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getMove <em>Move</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Move</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getMove()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_Move();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getMoveFailed <em>Move Failed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Move Failed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getMoveFailed()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_MoveFailed();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getInclude <em>Include</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Include</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getInclude()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_Include();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getExclude <em>Exclude</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Exclude</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getExclude()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_Exclude();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isIdempotent <em>Idempotent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idempotent</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isIdempotent()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_Idempotent();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getIdempotentRepository <em>Idempotent Repository</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idempotent Repository</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getIdempotentRepository()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_IdempotentRepository();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getInProgressRepository <em>In Progress Repository</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>In Progress Repository</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getInProgressRepository()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_InProgressRepository();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getFilter <em>Filter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Filter</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getFilter()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_Filter();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getSorter <em>Sorter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sorter</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getSorter()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_Sorter();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getSortBy <em>Sort By</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sort By</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getSortBy()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_SortBy();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getReadLock <em>Read Lock</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Read Lock</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getReadLock()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_ReadLock();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getReadLockTimeout <em>Read Lock Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Read Lock Timeout</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getReadLockTimeout()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_ReadLockTimeout();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getReadLockCheckInterval <em>Read Lock Check Interval</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Read Lock Check Interval</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getReadLockCheckInterval()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_ReadLockCheckInterval();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getExclusiveReadLockStrategy <em>Exclusive Read Lock Strategy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Exclusive Read Lock Strategy</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getExclusiveReadLockStrategy()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_ExclusiveReadLockStrategy();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getProcessStrategy <em>Process Strategy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Process Strategy</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getProcessStrategy()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_ProcessStrategy();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isStartingDirectoryMustExist <em>Starting Directory Must Exist</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Starting Directory Must Exist</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isStartingDirectoryMustExist()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_StartingDirectoryMustExist();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isDirectoryMustExist <em>Directory Must Exist</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Directory Must Exist</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#isDirectoryMustExist()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_DirectoryMustExist();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getDoneFileName <em>Done File Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Done File Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType#getDoneFileName()
     * @see #getGenericFileConsumerType()
     * @generated
     */
    EAttribute getGenericFileConsumerType_DoneFileName();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileProducerType <em>Generic File Producer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Generic File Producer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileProducerType
     * @generated
     */
    EClass getGenericFileProducerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileProducerType#getFileExist <em>File Exist</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File Exist</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileProducerType#getFileExist()
     * @see #getGenericFileProducerType()
     * @generated
     */
    EAttribute getGenericFileProducerType_FileExist();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileProducerType#getTempPrefix <em>Temp Prefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Temp Prefix</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileProducerType#getTempPrefix()
     * @see #getGenericFileProducerType()
     * @generated
     */
    EAttribute getGenericFileProducerType_TempPrefix();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileProducerType#getTempFileName <em>Temp File Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Temp File Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileProducerType#getTempFileName()
     * @see #getGenericFileProducerType()
     * @generated
     */
    EAttribute getGenericFileProducerType_TempFileName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileProducerType#isKeepLastModified <em>Keep Last Modified</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Keep Last Modified</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileProducerType#isKeepLastModified()
     * @see #getGenericFileProducerType()
     * @generated
     */
    EAttribute getGenericFileProducerType_KeepLastModified();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileProducerType#isEagerDeleteTargetFile <em>Eager Delete Target File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Eager Delete Target File</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileProducerType#isEagerDeleteTargetFile()
     * @see #getGenericFileProducerType()
     * @generated
     */
    EAttribute getGenericFileProducerType_EagerDeleteTargetFile();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileProducerType#getDoneFileName <em>Done File Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Done File Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.GenericFileProducerType#getDoneFileName()
     * @see #getGenericFileProducerType()
     * @generated
     */
    EAttribute getGenericFileProducerType_DoneFileName();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.RemoteFileConsumerType <em>Remote File Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Remote File Consumer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.RemoteFileConsumerType
     * @generated
     */
    EClass getRemoteFileConsumerType();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.RemoteFileProducerType <em>Remote File Producer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Remote File Producer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.RemoteFileProducerType
     * @generated
     */
    EClass getRemoteFileProducerType();

    /**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.camel.TimeUnit <em>Time Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Time Unit</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.TimeUnit
     * @generated
     */
    EEnum getTimeUnit();

    /**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.camel.TimeUnit <em>Time Unit Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Time Unit Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.TimeUnit
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.camel.TimeUnit"
     *        extendedMetaData="name='TimeUnit:Object' baseType='TimeUnit'"
     * @generated
     */
    EDataType getTimeUnitObject();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.BaseCamelBindingImpl <em>Base Camel Binding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.BaseCamelBindingImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getBaseCamelBinding()
         * @generated
         */
        EClass BASE_CAMEL_BINDING = eINSTANCE.getBaseCamelBinding();

        /**
         * The meta object literal for the '<em><b>Context Mapper</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASE_CAMEL_BINDING__CONTEXT_MAPPER = eINSTANCE.getBaseCamelBinding_ContextMapper();

        /**
         * The meta object literal for the '<em><b>Message Composer</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASE_CAMEL_BINDING__MESSAGE_COMPOSER = eINSTANCE.getBaseCamelBinding_MessageComposer();

        /**
         * The meta object literal for the '<em><b>Camel Operation Selector</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR = eINSTANCE.getBaseCamelBinding_CamelOperationSelector();

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
         * The meta object literal for the '<em><b>Consume</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_ATOM_BINDING_TYPE__CONSUME = eINSTANCE.getCamelAtomBindingType_Consume();

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
         * The meta object literal for the '<em><b>Config URI</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_BINDING_TYPE__CONFIG_URI = eINSTANCE.getCamelBindingType_ConfigURI();

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
         * The meta object literal for the '<em><b>Context Mapper</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_DIRECT_BINDING_TYPE__CONTEXT_MAPPER = eINSTANCE.getCamelDirectBindingType_ContextMapper();

        /**
         * The meta object literal for the '<em><b>Message Composer</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_DIRECT_BINDING_TYPE__MESSAGE_COMPOSER = eINSTANCE.getCamelDirectBindingType_MessageComposer();

        /**
         * The meta object literal for the '<em><b>Name Element</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_DIRECT_BINDING_TYPE__NAME_ELEMENT = eINSTANCE.getCamelDirectBindingType_NameElement();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFtpBindingTypeImpl <em>Ftp Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFtpBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelFtpBindingType()
         * @generated
         */
        EClass CAMEL_FTP_BINDING_TYPE = eINSTANCE.getCamelFtpBindingType();

        /**
         * The meta object literal for the '<em><b>Passive Mode</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__PASSIVE_MODE = eINSTANCE.getCamelFtpBindingType_PassiveMode();

        /**
         * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__TIMEOUT = eINSTANCE.getCamelFtpBindingType_Timeout();

        /**
         * The meta object literal for the '<em><b>So Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__SO_TIMEOUT = eINSTANCE.getCamelFtpBindingType_SoTimeout();

        /**
         * The meta object literal for the '<em><b>Site Command</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTP_BINDING_TYPE__SITE_COMMAND = eINSTANCE.getCamelFtpBindingType_SiteCommand();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFtpsBindingTypeImpl <em>Ftps Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFtpsBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelFtpsBindingType()
         * @generated
         */
        EClass CAMEL_FTPS_BINDING_TYPE = eINSTANCE.getCamelFtpsBindingType();

        /**
         * The meta object literal for the '<em><b>Security Protocol</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTPS_BINDING_TYPE__SECURITY_PROTOCOL = eINSTANCE.getCamelFtpsBindingType_SecurityProtocol();

        /**
         * The meta object literal for the '<em><b>Is Implicit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTPS_BINDING_TYPE__IS_IMPLICIT = eINSTANCE.getCamelFtpsBindingType_IsImplicit();

        /**
         * The meta object literal for the '<em><b>Exec Pbsz</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTPS_BINDING_TYPE__EXEC_PBSZ = eINSTANCE.getCamelFtpsBindingType_ExecPbsz();

        /**
         * The meta object literal for the '<em><b>Exec Prot</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTPS_BINDING_TYPE__EXEC_PROT = eINSTANCE.getCamelFtpsBindingType_ExecProt();

        /**
         * The meta object literal for the '<em><b>Disable Secure Data Channel Defaults</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_FTPS_BINDING_TYPE__DISABLE_SECURE_DATA_CHANNEL_DEFAULTS = eINSTANCE.getCamelFtpsBindingType_DisableSecureDataChannelDefaults();

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
         * The meta object literal for the '<em><b>Route</b></em>' reference feature.
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
         * The meta object literal for the '<em><b>Xml</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_IMPLEMENTATION_TYPE__XML = eINSTANCE.getCamelImplementationType_Xml();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelJmsBindingTypeImpl <em>Jms Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelJmsBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelJmsBindingType()
         * @generated
         */
        EClass CAMEL_JMS_BINDING_TYPE = eINSTANCE.getCamelJmsBindingType();

        /**
         * The meta object literal for the '<em><b>Queue</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JMS_BINDING_TYPE__QUEUE = eINSTANCE.getCamelJmsBindingType_Queue();

        /**
         * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JMS_BINDING_TYPE__TOPIC = eINSTANCE.getCamelJmsBindingType_Topic();

        /**
         * The meta object literal for the '<em><b>Connection Factory</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JMS_BINDING_TYPE__CONNECTION_FACTORY = eINSTANCE.getCamelJmsBindingType_ConnectionFactory();

        /**
         * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JMS_BINDING_TYPE__USERNAME = eINSTANCE.getCamelJmsBindingType_Username();

        /**
         * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JMS_BINDING_TYPE__PASSWORD = eINSTANCE.getCamelJmsBindingType_Password();

        /**
         * The meta object literal for the '<em><b>Client Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JMS_BINDING_TYPE__CLIENT_ID = eINSTANCE.getCamelJmsBindingType_ClientId();

        /**
         * The meta object literal for the '<em><b>Durable Subscription Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JMS_BINDING_TYPE__DURABLE_SUBSCRIPTION_NAME = eINSTANCE.getCamelJmsBindingType_DurableSubscriptionName();

        /**
         * The meta object literal for the '<em><b>Concurrent Consumers</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JMS_BINDING_TYPE__CONCURRENT_CONSUMERS = eINSTANCE.getCamelJmsBindingType_ConcurrentConsumers();

        /**
         * The meta object literal for the '<em><b>Max Concurrent Consumers</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JMS_BINDING_TYPE__MAX_CONCURRENT_CONSUMERS = eINSTANCE.getCamelJmsBindingType_MaxConcurrentConsumers();

        /**
         * The meta object literal for the '<em><b>Disable Reply To</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JMS_BINDING_TYPE__DISABLE_REPLY_TO = eINSTANCE.getCamelJmsBindingType_DisableReplyTo();

        /**
         * The meta object literal for the '<em><b>Preserve Message Qos</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JMS_BINDING_TYPE__PRESERVE_MESSAGE_QOS = eINSTANCE.getCamelJmsBindingType_PreserveMessageQos();

        /**
         * The meta object literal for the '<em><b>Delivery Persistent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JMS_BINDING_TYPE__DELIVERY_PERSISTENT = eINSTANCE.getCamelJmsBindingType_DeliveryPersistent();

        /**
         * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JMS_BINDING_TYPE__PRIORITY = eINSTANCE.getCamelJmsBindingType_Priority();

        /**
         * The meta object literal for the '<em><b>Explicit Qos Enabled</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JMS_BINDING_TYPE__EXPLICIT_QOS_ENABLED = eINSTANCE.getCamelJmsBindingType_ExplicitQosEnabled();

        /**
         * The meta object literal for the '<em><b>Reply To</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JMS_BINDING_TYPE__REPLY_TO = eINSTANCE.getCamelJmsBindingType_ReplyTo();

        /**
         * The meta object literal for the '<em><b>Reply To Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JMS_BINDING_TYPE__REPLY_TO_TYPE = eINSTANCE.getCamelJmsBindingType_ReplyToType();

        /**
         * The meta object literal for the '<em><b>Request Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JMS_BINDING_TYPE__REQUEST_TIMEOUT = eINSTANCE.getCamelJmsBindingType_RequestTimeout();

        /**
         * The meta object literal for the '<em><b>Selector</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JMS_BINDING_TYPE__SELECTOR = eINSTANCE.getCamelJmsBindingType_Selector();

        /**
         * The meta object literal for the '<em><b>Time To Live</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JMS_BINDING_TYPE__TIME_TO_LIVE = eINSTANCE.getCamelJmsBindingType_TimeToLive();

        /**
         * The meta object literal for the '<em><b>Transacted</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JMS_BINDING_TYPE__TRANSACTED = eINSTANCE.getCamelJmsBindingType_Transacted();

        /**
         * The meta object literal for the '<em><b>Transaction Manager</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JMS_BINDING_TYPE__TRANSACTION_MANAGER = eINSTANCE.getCamelJmsBindingType_TransactionManager();

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
         * The meta object literal for the '<em><b>Context Mapper</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_MOCK_BINDING_TYPE__CONTEXT_MAPPER = eINSTANCE.getCamelMockBindingType_ContextMapper();

        /**
         * The meta object literal for the '<em><b>Message Composer</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_MOCK_BINDING_TYPE__MESSAGE_COMPOSER = eINSTANCE.getCamelMockBindingType_MessageComposer();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelOperationSelectorTypeImpl <em>Operation Selector Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelOperationSelectorTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelOperationSelectorType()
         * @generated
         */
		EClass CAMEL_OPERATION_SELECTOR_TYPE = eINSTANCE.getCamelOperationSelectorType();

		/**
         * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_OPERATION_SELECTOR_TYPE__NAMESPACE = eINSTANCE.getCamelOperationSelectorType_Namespace();

        /**
         * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_OPERATION_SELECTOR_TYPE__OPERATION_NAME = eINSTANCE.getCamelOperationSelectorType_OperationName();

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
         * The meta object literal for the '<em><b>Context Mapper</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_SEDA_BINDING_TYPE__CONTEXT_MAPPER = eINSTANCE.getCamelSedaBindingType_ContextMapper();

        /**
         * The meta object literal for the '<em><b>Message Composer</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_SEDA_BINDING_TYPE__MESSAGE_COMPOSER = eINSTANCE.getCamelSedaBindingType_MessageComposer();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelTimerBindingTypeImpl <em>Timer Binding Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelTimerBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelTimerBindingType()
         * @generated
         */
		EClass CAMEL_TIMER_BINDING_TYPE = eINSTANCE.getCamelTimerBindingType();

		/**
         * The meta object literal for the '<em><b>Context Mapper</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_TIMER_BINDING_TYPE__CONTEXT_MAPPER = eINSTANCE.getCamelTimerBindingType_ContextMapper();

        /**
         * The meta object literal for the '<em><b>Message Composer</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_TIMER_BINDING_TYPE__MESSAGE_COMPOSER = eINSTANCE.getCamelTimerBindingType_MessageComposer();

        /**
         * The meta object literal for the '<em><b>Name Element</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_TIMER_BINDING_TYPE__NAME_ELEMENT = eINSTANCE.getCamelTimerBindingType_NameElement();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelSftpBindingTypeImpl <em>Sftp Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelSftpBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelSftpBindingType()
         * @generated
         */
        EClass CAMEL_SFTP_BINDING_TYPE = eINSTANCE.getCamelSftpBindingType();

        /**
         * The meta object literal for the '<em><b>Known Hosts File</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SFTP_BINDING_TYPE__KNOWN_HOSTS_FILE = eINSTANCE.getCamelSftpBindingType_KnownHostsFile();

        /**
         * The meta object literal for the '<em><b>Private Key File</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE = eINSTANCE.getCamelSftpBindingType_PrivateKeyFile();

        /**
         * The meta object literal for the '<em><b>Private Key File Passphrase</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SFTP_BINDING_TYPE__PRIVATE_KEY_FILE_PASSPHRASE = eINSTANCE.getCamelSftpBindingType_PrivateKeyFilePassphrase();

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
         * The meta object literal for the '<em><b>Binding Ftp</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_FTP = eINSTANCE.getDocumentRoot_BindingFtp();

        /**
         * The meta object literal for the '<em><b>Binding Ftps</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_FTPS = eINSTANCE.getDocumentRoot_BindingFtps();

        /**
         * The meta object literal for the '<em><b>Binding Jms</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_JMS = eINSTANCE.getDocumentRoot_BindingJms();

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
         * The meta object literal for the '<em><b>Binding Sftp</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_SFTP = eINSTANCE.getDocumentRoot_BindingSftp();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.CamelRemoteBindingTypeImpl <em>Remote Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelRemoteBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getCamelRemoteBindingType()
         * @generated
         */
        EClass CAMEL_REMOTE_BINDING_TYPE = eINSTANCE.getCamelRemoteBindingType();

        /**
         * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_REMOTE_BINDING_TYPE__HOST = eINSTANCE.getCamelRemoteBindingType_Host();

        /**
         * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_REMOTE_BINDING_TYPE__PORT = eINSTANCE.getCamelRemoteBindingType_Port();

        /**
         * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_REMOTE_BINDING_TYPE__USERNAME = eINSTANCE.getCamelRemoteBindingType_Username();

        /**
         * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_REMOTE_BINDING_TYPE__PASSWORD = eINSTANCE.getCamelRemoteBindingType_Password();

        /**
         * The meta object literal for the '<em><b>Binary</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_REMOTE_BINDING_TYPE__BINARY = eINSTANCE.getCamelRemoteBindingType_Binary();

        /**
         * The meta object literal for the '<em><b>Connect Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_REMOTE_BINDING_TYPE__CONNECT_TIMEOUT = eINSTANCE.getCamelRemoteBindingType_ConnectTimeout();

        /**
         * The meta object literal for the '<em><b>Disconnect</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_REMOTE_BINDING_TYPE__DISCONNECT = eINSTANCE.getCamelRemoteBindingType_Disconnect();

        /**
         * The meta object literal for the '<em><b>Maximum Reconnect Attempts</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_REMOTE_BINDING_TYPE__MAXIMUM_RECONNECT_ATTEMPTS = eINSTANCE.getCamelRemoteBindingType_MaximumReconnectAttempts();

        /**
         * The meta object literal for the '<em><b>Reconnect Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_REMOTE_BINDING_TYPE__RECONNECT_DELAY = eINSTANCE.getCamelRemoteBindingType_ReconnectDelay();

        /**
         * The meta object literal for the '<em><b>Separator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_REMOTE_BINDING_TYPE__SEPARATOR = eINSTANCE.getCamelRemoteBindingType_Separator();

        /**
         * The meta object literal for the '<em><b>Stepwise</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_REMOTE_BINDING_TYPE__STEPWISE = eINSTANCE.getCamelRemoteBindingType_Stepwise();

        /**
         * The meta object literal for the '<em><b>Throw Exception On Connect Failed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_REMOTE_BINDING_TYPE__THROW_EXCEPTION_ON_CONNECT_FAILED = eINSTANCE.getCamelRemoteBindingType_ThrowExceptionOnConnectFailed();

        /**
         * The meta object literal for the '<em><b>Consume</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_REMOTE_BINDING_TYPE__CONSUME = eINSTANCE.getCamelRemoteBindingType_Consume();

        /**
         * The meta object literal for the '<em><b>Produce</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_REMOTE_BINDING_TYPE__PRODUCE = eINSTANCE.getCamelRemoteBindingType_Produce();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.FileProducerTypeImpl <em>File Producer Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.FileProducerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getFileProducerType()
         * @generated
         */
		EClass FILE_PRODUCER_TYPE = eINSTANCE.getFileProducerType();

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

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.XMLDSLTypeImpl <em>XMLDSL Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.XMLDSLTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getXMLDSLType()
         * @generated
         */
        EClass XMLDSL_TYPE = eINSTANCE.getXMLDSLType();

        /**
         * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute XMLDSL_TYPE__PATH = eINSTANCE.getXMLDSLType_Path();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.ScheduledPollConsumerTypeImpl <em>Scheduled Poll Consumer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.ScheduledPollConsumerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getScheduledPollConsumerType()
         * @generated
         */
        EClass SCHEDULED_POLL_CONSUMER_TYPE = eINSTANCE.getScheduledPollConsumerType();

        /**
         * The meta object literal for the '<em><b>Initial Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEDULED_POLL_CONSUMER_TYPE__INITIAL_DELAY = eINSTANCE.getScheduledPollConsumerType_InitialDelay();

        /**
         * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEDULED_POLL_CONSUMER_TYPE__DELAY = eINSTANCE.getScheduledPollConsumerType_Delay();

        /**
         * The meta object literal for the '<em><b>Use Fixed Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEDULED_POLL_CONSUMER_TYPE__USE_FIXED_DELAY = eINSTANCE.getScheduledPollConsumerType_UseFixedDelay();

        /**
         * The meta object literal for the '<em><b>Send Empty Message When Idle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEDULED_POLL_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE = eINSTANCE.getScheduledPollConsumerType_SendEmptyMessageWhenIdle();

        /**
         * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEDULED_POLL_CONSUMER_TYPE__TIME_UNIT = eINSTANCE.getScheduledPollConsumerType_TimeUnit();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.GenericFileBindingTypeImpl <em>Generic File Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.GenericFileBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getGenericFileBindingType()
         * @generated
         */
        EClass GENERIC_FILE_BINDING_TYPE = eINSTANCE.getGenericFileBindingType();

        /**
         * The meta object literal for the '<em><b>Directory</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_BINDING_TYPE__DIRECTORY = eINSTANCE.getGenericFileBindingType_Directory();

        /**
         * The meta object literal for the '<em><b>Auto Create</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_BINDING_TYPE__AUTO_CREATE = eINSTANCE.getGenericFileBindingType_AutoCreate();

        /**
         * The meta object literal for the '<em><b>Buffer Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_BINDING_TYPE__BUFFER_SIZE = eINSTANCE.getGenericFileBindingType_BufferSize();

        /**
         * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_BINDING_TYPE__FILE_NAME = eINSTANCE.getGenericFileBindingType_FileName();

        /**
         * The meta object literal for the '<em><b>Flatten</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_BINDING_TYPE__FLATTEN = eINSTANCE.getGenericFileBindingType_Flatten();

        /**
         * The meta object literal for the '<em><b>Charset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_BINDING_TYPE__CHARSET = eINSTANCE.getGenericFileBindingType_Charset();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.ScheduledBatchPollConsumerTypeImpl <em>Scheduled Batch Poll Consumer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.ScheduledBatchPollConsumerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getScheduledBatchPollConsumerType()
         * @generated
         */
        EClass SCHEDULED_BATCH_POLL_CONSUMER_TYPE = eINSTANCE.getScheduledBatchPollConsumerType();

        /**
         * The meta object literal for the '<em><b>Max Messages Per Poll</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEDULED_BATCH_POLL_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL = eINSTANCE.getScheduledBatchPollConsumerType_MaxMessagesPerPoll();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.GenericFileConsumerTypeImpl <em>Generic File Consumer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.GenericFileConsumerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getGenericFileConsumerType()
         * @generated
         */
        EClass GENERIC_FILE_CONSUMER_TYPE = eINSTANCE.getGenericFileConsumerType();

        /**
         * The meta object literal for the '<em><b>Delete</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__DELETE = eINSTANCE.getGenericFileConsumerType_Delete();

        /**
         * The meta object literal for the '<em><b>Recursive</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__RECURSIVE = eINSTANCE.getGenericFileConsumerType_Recursive();

        /**
         * The meta object literal for the '<em><b>Noop</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__NOOP = eINSTANCE.getGenericFileConsumerType_Noop();

        /**
         * The meta object literal for the '<em><b>Pre Move</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__PRE_MOVE = eINSTANCE.getGenericFileConsumerType_PreMove();

        /**
         * The meta object literal for the '<em><b>Move</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__MOVE = eINSTANCE.getGenericFileConsumerType_Move();

        /**
         * The meta object literal for the '<em><b>Move Failed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__MOVE_FAILED = eINSTANCE.getGenericFileConsumerType_MoveFailed();

        /**
         * The meta object literal for the '<em><b>Include</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__INCLUDE = eINSTANCE.getGenericFileConsumerType_Include();

        /**
         * The meta object literal for the '<em><b>Exclude</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__EXCLUDE = eINSTANCE.getGenericFileConsumerType_Exclude();

        /**
         * The meta object literal for the '<em><b>Idempotent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT = eINSTANCE.getGenericFileConsumerType_Idempotent();

        /**
         * The meta object literal for the '<em><b>Idempotent Repository</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY = eINSTANCE.getGenericFileConsumerType_IdempotentRepository();

        /**
         * The meta object literal for the '<em><b>In Progress Repository</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY = eINSTANCE.getGenericFileConsumerType_InProgressRepository();

        /**
         * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__FILTER = eINSTANCE.getGenericFileConsumerType_Filter();

        /**
         * The meta object literal for the '<em><b>Sorter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__SORTER = eINSTANCE.getGenericFileConsumerType_Sorter();

        /**
         * The meta object literal for the '<em><b>Sort By</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__SORT_BY = eINSTANCE.getGenericFileConsumerType_SortBy();

        /**
         * The meta object literal for the '<em><b>Read Lock</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__READ_LOCK = eINSTANCE.getGenericFileConsumerType_ReadLock();

        /**
         * The meta object literal for the '<em><b>Read Lock Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT = eINSTANCE.getGenericFileConsumerType_ReadLockTimeout();

        /**
         * The meta object literal for the '<em><b>Read Lock Check Interval</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL = eINSTANCE.getGenericFileConsumerType_ReadLockCheckInterval();

        /**
         * The meta object literal for the '<em><b>Exclusive Read Lock Strategy</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY = eINSTANCE.getGenericFileConsumerType_ExclusiveReadLockStrategy();

        /**
         * The meta object literal for the '<em><b>Process Strategy</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__PROCESS_STRATEGY = eINSTANCE.getGenericFileConsumerType_ProcessStrategy();

        /**
         * The meta object literal for the '<em><b>Starting Directory Must Exist</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST = eINSTANCE.getGenericFileConsumerType_StartingDirectoryMustExist();

        /**
         * The meta object literal for the '<em><b>Directory Must Exist</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST = eINSTANCE.getGenericFileConsumerType_DirectoryMustExist();

        /**
         * The meta object literal for the '<em><b>Done File Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_CONSUMER_TYPE__DONE_FILE_NAME = eINSTANCE.getGenericFileConsumerType_DoneFileName();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.GenericFileProducerTypeImpl <em>Generic File Producer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.GenericFileProducerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getGenericFileProducerType()
         * @generated
         */
        EClass GENERIC_FILE_PRODUCER_TYPE = eINSTANCE.getGenericFileProducerType();

        /**
         * The meta object literal for the '<em><b>File Exist</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_PRODUCER_TYPE__FILE_EXIST = eINSTANCE.getGenericFileProducerType_FileExist();

        /**
         * The meta object literal for the '<em><b>Temp Prefix</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_PRODUCER_TYPE__TEMP_PREFIX = eINSTANCE.getGenericFileProducerType_TempPrefix();

        /**
         * The meta object literal for the '<em><b>Temp File Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_PRODUCER_TYPE__TEMP_FILE_NAME = eINSTANCE.getGenericFileProducerType_TempFileName();

        /**
         * The meta object literal for the '<em><b>Keep Last Modified</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_PRODUCER_TYPE__KEEP_LAST_MODIFIED = eINSTANCE.getGenericFileProducerType_KeepLastModified();

        /**
         * The meta object literal for the '<em><b>Eager Delete Target File</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_PRODUCER_TYPE__EAGER_DELETE_TARGET_FILE = eINSTANCE.getGenericFileProducerType_EagerDeleteTargetFile();

        /**
         * The meta object literal for the '<em><b>Done File Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_FILE_PRODUCER_TYPE__DONE_FILE_NAME = eINSTANCE.getGenericFileProducerType_DoneFileName();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.RemoteFileConsumerTypeImpl <em>Remote File Consumer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.RemoteFileConsumerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getRemoteFileConsumerType()
         * @generated
         */
        EClass REMOTE_FILE_CONSUMER_TYPE = eINSTANCE.getRemoteFileConsumerType();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.impl.RemoteFileProducerTypeImpl <em>Remote File Producer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.RemoteFileProducerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getRemoteFileProducerType()
         * @generated
         */
        EClass REMOTE_FILE_PRODUCER_TYPE = eINSTANCE.getRemoteFileProducerType();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.TimeUnit <em>Time Unit</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.TimeUnit
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getTimeUnit()
         * @generated
         */
        EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

        /**
         * The meta object literal for the '<em>Time Unit Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.TimeUnit
         * @see org.switchyard.tools.models.switchyard1_0.camel.impl.CamelPackageImpl#getTimeUnitObject()
         * @generated
         */
        EDataType TIME_UNIT_OBJECT = eINSTANCE.getTimeUnitObject();

	}

} //CamelPackage
