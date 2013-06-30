/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory
 * @model kind="package"
 * @generated
 */
public interface ScaPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "sca";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://docs.oasis-open.org/ns/opencsa/sca/200912";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "sca";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	ScaPackage eINSTANCE = org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl.init();

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ActivationSpecImpl <em>Activation Spec</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ActivationSpecImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getActivationSpec()
     * @generated
     */
	int ACTIVATION_SPEC = 0;

	/**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTIVATION_SPEC__PROPERTY = 0;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTIVATION_SPEC__ANY = 1;

	/**
     * The feature id for the '<em><b>Create</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTIVATION_SPEC__CREATE = 2;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTIVATION_SPEC__NAME = 3;

	/**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTIVATION_SPEC__TYPE = 4;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTIVATION_SPEC__ANY_ATTRIBUTE = 5;

	/**
     * The number of structural features of the '<em>Activation Spec</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACTIVATION_SPEC_FEATURE_COUNT = 6;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CommonExtensionBaseImpl <em>Common Extension Base</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.CommonExtensionBaseImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getCommonExtensionBase()
     * @generated
     */
	int COMMON_EXTENSION_BASE = 12;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMMON_EXTENSION_BASE__DOCUMENTATION = 0;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMMON_EXTENSION_BASE__ANY_ATTRIBUTE = 1;

	/**
     * The number of structural features of the '<em>Common Extension Base</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMMON_EXTENSION_BASE_FEATURE_COUNT = 2;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.BindingImpl <em>Binding</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.BindingImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getBinding()
     * @generated
     */
	int BINDING = 1;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BINDING__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BINDING__ANY_ATTRIBUTE = COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BINDING__WIRE_FORMAT_GROUP = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BINDING__WIRE_FORMAT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BINDING__OPERATION_SELECTOR_GROUP = COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BINDING__OPERATION_SELECTOR = COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BINDING__NAME = COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BINDING__POLICY_SETS = COMMON_EXTENSION_BASE_FEATURE_COUNT + 5;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BINDING__REQUIRES = COMMON_EXTENSION_BASE_FEATURE_COUNT + 6;

	/**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BINDING__URI = COMMON_EXTENSION_BASE_FEATURE_COUNT + 7;

	/**
     * The number of structural features of the '<em>Binding</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BINDING_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 8;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.BindingPropertyImpl <em>Binding Property</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.BindingPropertyImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getBindingProperty()
     * @generated
     */
	int BINDING_PROPERTY = 2;

	/**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BINDING_PROPERTY__VALUE = 0;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BINDING_PROPERTY__NAME = 1;

	/**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BINDING_PROPERTY__TYPE = 2;

	/**
     * The number of structural features of the '<em>Binding Property</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BINDING_PROPERTY_FEATURE_COUNT = 3;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.BindingTypeImpl <em>Binding Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.BindingTypeImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getBindingType()
     * @generated
     */
	int BINDING_TYPE = 3;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BINDING_TYPE__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BINDING_TYPE__ANY_ATTRIBUTE = COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BINDING_TYPE__ANY = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Always Provides</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BINDING_TYPE__ALWAYS_PROVIDES = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>May Provide</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BINDING_TYPE__MAY_PROVIDE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BINDING_TYPE__TYPE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

	/**
     * The number of structural features of the '<em>Binding Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BINDING_TYPE_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ImplementationImpl <em>Implementation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ImplementationImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getImplementation()
     * @generated
     */
	int IMPLEMENTATION = 41;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IMPLEMENTATION__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IMPLEMENTATION__ANY_ATTRIBUTE = COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IMPLEMENTATION__POLICY_SETS = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IMPLEMENTATION__REQUIRES = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Implementation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IMPLEMENTATION_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.BPELImplementationImpl <em>BPEL Implementation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.BPELImplementationImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getBPELImplementation()
     * @generated
     */
	int BPEL_IMPLEMENTATION = 4;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPEL_IMPLEMENTATION__DOCUMENTATION = IMPLEMENTATION__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPEL_IMPLEMENTATION__ANY_ATTRIBUTE = IMPLEMENTATION__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPEL_IMPLEMENTATION__POLICY_SETS = IMPLEMENTATION__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPEL_IMPLEMENTATION__REQUIRES = IMPLEMENTATION__REQUIRES;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPEL_IMPLEMENTATION__ANY = IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Process</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPEL_IMPLEMENTATION__PROCESS = IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Any Attribute1</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPEL_IMPLEMENTATION__ANY_ATTRIBUTE1 = IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
     * The number of structural features of the '<em>BPEL Implementation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPEL_IMPLEMENTATION_FEATURE_COUNT = IMPLEMENTATION_FEATURE_COUNT + 3;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CallbackImpl <em>Callback</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.CallbackImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getCallback()
     * @generated
     */
	int CALLBACK = 5;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CALLBACK__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CALLBACK__ANY_ATTRIBUTE = COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CALLBACK__GROUP = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Binding Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CALLBACK__BINDING_GROUP = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CALLBACK__BINDING = COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CALLBACK__ANY = COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CALLBACK__POLICY_SETS = COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CALLBACK__REQUIRES = COMMON_EXTENSION_BASE_FEATURE_COUNT + 5;

	/**
     * The number of structural features of the '<em>Callback</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CALLBACK_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 6;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ExportImpl <em>Export</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ExportImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getExport()
     * @generated
     */
	int EXPORT = 38;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXPORT__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXPORT__ANY_ATTRIBUTE = COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXPORT__ANY = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Export</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXPORT_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CExportImpl <em>CExport</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.CExportImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getCExport()
     * @generated
     */
	int CEXPORT = 6;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CEXPORT__DOCUMENTATION = EXPORT__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CEXPORT__ANY_ATTRIBUTE = EXPORT__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CEXPORT__ANY = EXPORT__ANY;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CEXPORT__NAME = EXPORT_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CEXPORT__PATH = EXPORT_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>CExport</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CEXPORT_FEATURE_COUNT = EXPORT_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CFunctionImpl <em>CFunction</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.CFunctionImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getCFunction()
     * @generated
     */
	int CFUNCTION = 7;

	/**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CFUNCTION__INPUT = 0;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CFUNCTION__NAME = 1;

	/**
     * The feature id for the '<em><b>One Way</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CFUNCTION__ONE_WAY = 2;

	/**
     * The feature id for the '<em><b>Output</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CFUNCTION__OUTPUT = 3;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CFUNCTION__REQUIRES = 4;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CFUNCTION__ANY_ATTRIBUTE = 5;

	/**
     * The number of structural features of the '<em>CFunction</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CFUNCTION_FEATURE_COUNT = 6;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CImplementationImpl <em>CImplementation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.CImplementationImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getCImplementation()
     * @generated
     */
	int CIMPLEMENTATION = 8;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPLEMENTATION__DOCUMENTATION = IMPLEMENTATION__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPLEMENTATION__ANY_ATTRIBUTE = IMPLEMENTATION__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPLEMENTATION__POLICY_SETS = IMPLEMENTATION__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPLEMENTATION__REQUIRES = IMPLEMENTATION__REQUIRES;

	/**
     * The feature id for the '<em><b>Operation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPLEMENTATION__OPERATION = IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPLEMENTATION__ANY = IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Allows Pass By Reference</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPLEMENTATION__ALLOWS_PASS_BY_REFERENCE = IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Component Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPLEMENTATION__COMPONENT_TYPE = IMPLEMENTATION_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Destoy</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPLEMENTATION__DESTOY = IMPLEMENTATION_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Eager Init</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPLEMENTATION__EAGER_INIT = IMPLEMENTATION_FEATURE_COUNT + 5;

	/**
     * The feature id for the '<em><b>Init</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPLEMENTATION__INIT = IMPLEMENTATION_FEATURE_COUNT + 6;

	/**
     * The feature id for the '<em><b>Library</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPLEMENTATION__LIBRARY = IMPLEMENTATION_FEATURE_COUNT + 7;

	/**
     * The feature id for the '<em><b>Module</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPLEMENTATION__MODULE = IMPLEMENTATION_FEATURE_COUNT + 8;

	/**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPLEMENTATION__PATH = IMPLEMENTATION_FEATURE_COUNT + 9;

	/**
     * The feature id for the '<em><b>Scope</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPLEMENTATION__SCOPE = IMPLEMENTATION_FEATURE_COUNT + 10;

	/**
     * The feature id for the '<em><b>Any Attribute1</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPLEMENTATION__ANY_ATTRIBUTE1 = IMPLEMENTATION_FEATURE_COUNT + 11;

	/**
     * The number of structural features of the '<em>CImplementation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPLEMENTATION_FEATURE_COUNT = IMPLEMENTATION_FEATURE_COUNT + 12;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CImplementationFunctionImpl <em>CImplementation Function</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.CImplementationFunctionImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getCImplementationFunction()
     * @generated
     */
	int CIMPLEMENTATION_FUNCTION = 9;

	/**
     * The feature id for the '<em><b>Allows Pass By Reference</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPLEMENTATION_FUNCTION__ALLOWS_PASS_BY_REFERENCE = 0;

	/**
     * The feature id for the '<em><b>Destoy</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPLEMENTATION_FUNCTION__DESTOY = 1;

	/**
     * The feature id for the '<em><b>Init</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPLEMENTATION_FUNCTION__INIT = 2;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPLEMENTATION_FUNCTION__NAME = 3;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPLEMENTATION_FUNCTION__ANY_ATTRIBUTE = 4;

	/**
     * The number of structural features of the '<em>CImplementation Function</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPLEMENTATION_FUNCTION_FEATURE_COUNT = 5;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ImportImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getImport()
     * @generated
     */
	int IMPORT = 43;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IMPORT__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IMPORT__ANY_ATTRIBUTE = COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IMPORT__ANY = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Import</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IMPORT_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CImportImpl <em>CImport</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.CImportImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getCImport()
     * @generated
     */
	int CIMPORT = 10;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPORT__DOCUMENTATION = IMPORT__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPORT__ANY_ATTRIBUTE = IMPORT__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPORT__ANY = IMPORT__ANY;

	/**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPORT__LOCATION = IMPORT_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPORT__NAME = IMPORT_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>CImport</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CIMPORT_FEATURE_COUNT = IMPORT_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.InterfaceImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getInterface()
     * @generated
     */
	int INTERFACE = 51;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTERFACE__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTERFACE__ANY_ATTRIBUTE = COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTERFACE__POLICY_SETS = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Remotable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTERFACE__REMOTABLE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTERFACE__REQUIRES = COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

	/**
     * The number of structural features of the '<em>Interface</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTERFACE_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CInterfaceImpl <em>CInterface</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.CInterfaceImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getCInterface()
     * @generated
     */
	int CINTERFACE = 11;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CINTERFACE__DOCUMENTATION = INTERFACE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CINTERFACE__ANY_ATTRIBUTE = INTERFACE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CINTERFACE__POLICY_SETS = INTERFACE__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Remotable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CINTERFACE__REMOTABLE = INTERFACE__REMOTABLE;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CINTERFACE__REQUIRES = INTERFACE__REQUIRES;

	/**
     * The feature id for the '<em><b>Function</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CINTERFACE__FUNCTION = INTERFACE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Callback Function</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CINTERFACE__CALLBACK_FUNCTION = INTERFACE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CINTERFACE__ANY = INTERFACE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Callback Header</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CINTERFACE__CALLBACK_HEADER = INTERFACE_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Header</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CINTERFACE__HEADER = INTERFACE_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Any Attribute1</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CINTERFACE__ANY_ATTRIBUTE1 = INTERFACE_FEATURE_COUNT + 5;

	/**
     * The number of structural features of the '<em>CInterface</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CINTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 6;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getComponent()
     * @generated
     */
	int COMPONENT = 13;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__ANY_ATTRIBUTE = COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Implementation Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__IMPLEMENTATION_GROUP = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Implementation</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__IMPLEMENTATION = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__GROUP = COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Service</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__SERVICE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__REFERENCE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__PROPERTY = COMMON_EXTENSION_BASE_FEATURE_COUNT + 5;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__ANY = COMMON_EXTENSION_BASE_FEATURE_COUNT + 6;

	/**
     * The feature id for the '<em><b>Autowire</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__AUTOWIRE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 7;

	/**
     * The feature id for the '<em><b>Constraining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__CONSTRAINING_TYPE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 8;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__NAME = COMMON_EXTENSION_BASE_FEATURE_COUNT + 9;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__POLICY_SETS = COMMON_EXTENSION_BASE_FEATURE_COUNT + 10;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__REQUIRES = COMMON_EXTENSION_BASE_FEATURE_COUNT + 11;

	/**
     * The number of structural features of the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 12;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ContractImpl <em>Contract</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ContractImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getContract()
     * @generated
     */
	int CONTRACT = 25;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTRACT__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTRACT__ANY_ATTRIBUTE = COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Interface Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTRACT__INTERFACE_GROUP = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Interface</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTRACT__INTERFACE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Binding Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTRACT__BINDING_GROUP = COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTRACT__BINDING = COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Callback</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTRACT__CALLBACK = COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Extensions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTRACT__EXTENSIONS = COMMON_EXTENSION_BASE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTRACT__ANY = COMMON_EXTENSION_BASE_FEATURE_COUNT + 6;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTRACT__NAME = COMMON_EXTENSION_BASE_FEATURE_COUNT + 7;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTRACT__POLICY_SETS = COMMON_EXTENSION_BASE_FEATURE_COUNT + 8;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTRACT__REQUIRES = COMMON_EXTENSION_BASE_FEATURE_COUNT + 9;

	/**
     * The number of structural features of the '<em>Contract</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTRACT_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 10;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentReferenceImpl <em>Component Reference</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentReferenceImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getComponentReference()
     * @generated
     */
	int COMPONENT_REFERENCE = 14;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REFERENCE__DOCUMENTATION = CONTRACT__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REFERENCE__ANY_ATTRIBUTE = CONTRACT__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Interface Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REFERENCE__INTERFACE_GROUP = CONTRACT__INTERFACE_GROUP;

	/**
     * The feature id for the '<em><b>Interface</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REFERENCE__INTERFACE = CONTRACT__INTERFACE;

	/**
     * The feature id for the '<em><b>Binding Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REFERENCE__BINDING_GROUP = CONTRACT__BINDING_GROUP;

	/**
     * The feature id for the '<em><b>Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REFERENCE__BINDING = CONTRACT__BINDING;

	/**
     * The feature id for the '<em><b>Callback</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REFERENCE__CALLBACK = CONTRACT__CALLBACK;

	/**
     * The feature id for the '<em><b>Extensions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_REFERENCE__EXTENSIONS = CONTRACT__EXTENSIONS;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REFERENCE__ANY = CONTRACT__ANY;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REFERENCE__NAME = CONTRACT__NAME;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REFERENCE__POLICY_SETS = CONTRACT__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REFERENCE__REQUIRES = CONTRACT__REQUIRES;

	/**
     * The feature id for the '<em><b>Autowire</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REFERENCE__AUTOWIRE = CONTRACT_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REFERENCE__MULTIPLICITY = CONTRACT_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Non Overridable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REFERENCE__NON_OVERRIDABLE = CONTRACT_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Wired By Impl</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REFERENCE__WIRED_BY_IMPL = CONTRACT_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Target</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REFERENCE__TARGET = CONTRACT_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REFERENCE__ID = CONTRACT_FEATURE_COUNT + 5;

	/**
     * The number of structural features of the '<em>Component Reference</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_REFERENCE_FEATURE_COUNT = CONTRACT_FEATURE_COUNT + 6;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentServiceImpl <em>Component Service</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentServiceImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getComponentService()
     * @generated
     */
	int COMPONENT_SERVICE = 15;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_SERVICE__DOCUMENTATION = CONTRACT__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_SERVICE__ANY_ATTRIBUTE = CONTRACT__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Interface Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_SERVICE__INTERFACE_GROUP = CONTRACT__INTERFACE_GROUP;

	/**
     * The feature id for the '<em><b>Interface</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_SERVICE__INTERFACE = CONTRACT__INTERFACE;

	/**
     * The feature id for the '<em><b>Binding Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_SERVICE__BINDING_GROUP = CONTRACT__BINDING_GROUP;

	/**
     * The feature id for the '<em><b>Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_SERVICE__BINDING = CONTRACT__BINDING;

	/**
     * The feature id for the '<em><b>Callback</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_SERVICE__CALLBACK = CONTRACT__CALLBACK;

	/**
     * The feature id for the '<em><b>Extensions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_SERVICE__EXTENSIONS = CONTRACT__EXTENSIONS;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_SERVICE__ANY = CONTRACT__ANY;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_SERVICE__NAME = CONTRACT__NAME;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_SERVICE__POLICY_SETS = CONTRACT__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_SERVICE__REQUIRES = CONTRACT__REQUIRES;

	/**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_SERVICE__ID = CONTRACT_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Component Service</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_SERVICE_FEATURE_COUNT = CONTRACT_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentTypeImpl <em>Component Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentTypeImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getComponentType()
     * @generated
     */
	int COMPONENT_TYPE = 16;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__ANY_ATTRIBUTE = COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__GROUP = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Service</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__SERVICE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__REFERENCE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__PROPERTY = COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__ANY = COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Constraining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE__CONSTRAINING_TYPE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 5;

	/**
     * The number of structural features of the '<em>Component Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 6;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentTypeReferenceImpl <em>Component Type Reference</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentTypeReferenceImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getComponentTypeReference()
     * @generated
     */
	int COMPONENT_TYPE_REFERENCE = 17;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE_REFERENCE__DOCUMENTATION = COMPONENT_REFERENCE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE_REFERENCE__ANY_ATTRIBUTE = COMPONENT_REFERENCE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Interface Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE_REFERENCE__INTERFACE_GROUP = COMPONENT_REFERENCE__INTERFACE_GROUP;

	/**
     * The feature id for the '<em><b>Interface</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE_REFERENCE__INTERFACE = COMPONENT_REFERENCE__INTERFACE;

	/**
     * The feature id for the '<em><b>Binding Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE_REFERENCE__BINDING_GROUP = COMPONENT_REFERENCE__BINDING_GROUP;

	/**
     * The feature id for the '<em><b>Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE_REFERENCE__BINDING = COMPONENT_REFERENCE__BINDING;

	/**
     * The feature id for the '<em><b>Callback</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE_REFERENCE__CALLBACK = COMPONENT_REFERENCE__CALLBACK;

	/**
     * The feature id for the '<em><b>Extensions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_TYPE_REFERENCE__EXTENSIONS = COMPONENT_REFERENCE__EXTENSIONS;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE_REFERENCE__ANY = COMPONENT_REFERENCE__ANY;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE_REFERENCE__NAME = COMPONENT_REFERENCE__NAME;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE_REFERENCE__POLICY_SETS = COMPONENT_REFERENCE__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE_REFERENCE__REQUIRES = COMPONENT_REFERENCE__REQUIRES;

	/**
     * The feature id for the '<em><b>Autowire</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE_REFERENCE__AUTOWIRE = COMPONENT_REFERENCE__AUTOWIRE;

	/**
     * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE_REFERENCE__MULTIPLICITY = COMPONENT_REFERENCE__MULTIPLICITY;

	/**
     * The feature id for the '<em><b>Non Overridable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE_REFERENCE__NON_OVERRIDABLE = COMPONENT_REFERENCE__NON_OVERRIDABLE;

	/**
     * The feature id for the '<em><b>Wired By Impl</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE_REFERENCE__WIRED_BY_IMPL = COMPONENT_REFERENCE__WIRED_BY_IMPL;

	/**
     * The feature id for the '<em><b>Target</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE_REFERENCE__TARGET = COMPONENT_REFERENCE__TARGET;

	/**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE_REFERENCE__ID = COMPONENT_REFERENCE__ID;

	/**
     * The number of structural features of the '<em>Component Type Reference</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_TYPE_REFERENCE_FEATURE_COUNT = COMPONENT_REFERENCE_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CompositeImpl <em>Composite</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.CompositeImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getComposite()
     * @generated
     */
	int COMPOSITE = 18;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPOSITE__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPOSITE__ANY_ATTRIBUTE = COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Include</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPOSITE__INCLUDE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPOSITE__GROUP = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Service</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPOSITE__SERVICE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPOSITE__PROPERTY = COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPOSITE__COMPONENT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPOSITE__REFERENCE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 5;

	/**
     * The feature id for the '<em><b>Wire</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPOSITE__WIRE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 6;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPOSITE__ANY = COMMON_EXTENSION_BASE_FEATURE_COUNT + 7;

	/**
     * The feature id for the '<em><b>Autowire</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPOSITE__AUTOWIRE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 8;

	/**
     * The feature id for the '<em><b>Constraining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPOSITE__CONSTRAINING_TYPE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 9;

	/**
     * The feature id for the '<em><b>Local</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPOSITE__LOCAL = COMMON_EXTENSION_BASE_FEATURE_COUNT + 10;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPOSITE__NAME = COMMON_EXTENSION_BASE_FEATURE_COUNT + 11;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPOSITE__POLICY_SETS = COMMON_EXTENSION_BASE_FEATURE_COUNT + 12;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPOSITE__REQUIRES = COMMON_EXTENSION_BASE_FEATURE_COUNT + 13;

	/**
     * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPOSITE__TARGET_NAMESPACE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 14;

	/**
     * The number of structural features of the '<em>Composite</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPOSITE_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 15;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ConnectionImpl <em>Connection</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ConnectionImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getConnection()
     * @generated
     */
	int CONNECTION = 19;

	/**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONNECTION__PROPERTY = 0;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONNECTION__ANY = 1;

	/**
     * The feature id for the '<em><b>Create</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONNECTION__CREATE = 2;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONNECTION__NAME = 3;

	/**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONNECTION__TYPE = 4;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONNECTION__ANY_ATTRIBUTE = 5;

	/**
     * The number of structural features of the '<em>Connection</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONNECTION_FEATURE_COUNT = 6;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ConnectionSpecImpl <em>Connection Spec</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ConnectionSpecImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getConnectionSpec()
     * @generated
     */
	int CONNECTION_SPEC = 20;

	/**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONNECTION_SPEC__PROPERTY = 0;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONNECTION_SPEC__ANY = 1;

	/**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONNECTION_SPEC__TYPE = 2;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONNECTION_SPEC__ANY_ATTRIBUTE = 3;

	/**
     * The number of structural features of the '<em>Connection Spec</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONNECTION_SPEC_FEATURE_COUNT = 4;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.SCAPropertyBaseImpl <em>SCA Property Base</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.SCAPropertyBaseImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getSCAPropertyBase()
     * @generated
     */
	int SCA_PROPERTY_BASE = 83;

	/**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCA_PROPERTY_BASE__MIXED = 0;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCA_PROPERTY_BASE__ANY = 1;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCA_PROPERTY_BASE__POLICY_SETS = 2;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCA_PROPERTY_BASE__REQUIRES = 3;

	/**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCA_PROPERTY_BASE__VALUE = 4;

    /**
     * The number of structural features of the '<em>SCA Property Base</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCA_PROPERTY_BASE_FEATURE_COUNT = 5;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.PropertyImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getProperty()
     * @generated
     */
	int PROPERTY = 76;

	/**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY__MIXED = SCA_PROPERTY_BASE__MIXED;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY__ANY = SCA_PROPERTY_BASE__ANY;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY__POLICY_SETS = SCA_PROPERTY_BASE__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY__REQUIRES = SCA_PROPERTY_BASE__REQUIRES;

	/**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__VALUE = SCA_PROPERTY_BASE__VALUE;

    /**
     * The feature id for the '<em><b>Element</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY__ELEMENT = SCA_PROPERTY_BASE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Many</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY__MANY = SCA_PROPERTY_BASE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Must Supply</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY__MUST_SUPPLY = SCA_PROPERTY_BASE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY__NAME = SCA_PROPERTY_BASE_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY__TYPE = SCA_PROPERTY_BASE_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY__ANY_ATTRIBUTE = SCA_PROPERTY_BASE_FEATURE_COUNT + 5;

	/**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY_FEATURE_COUNT = SCA_PROPERTY_BASE_FEATURE_COUNT + 6;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ConstrainingPropertyImpl <em>Constraining Property</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ConstrainingPropertyImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getConstrainingProperty()
     * @generated
     */
	int CONSTRAINING_PROPERTY = 21;

	/**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_PROPERTY__MIXED = PROPERTY__MIXED;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_PROPERTY__ANY = PROPERTY__ANY;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_PROPERTY__POLICY_SETS = PROPERTY__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_PROPERTY__REQUIRES = PROPERTY__REQUIRES;

	/**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRAINING_PROPERTY__VALUE = PROPERTY__VALUE;

    /**
     * The feature id for the '<em><b>Element</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_PROPERTY__ELEMENT = PROPERTY__ELEMENT;

	/**
     * The feature id for the '<em><b>Many</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_PROPERTY__MANY = PROPERTY__MANY;

	/**
     * The feature id for the '<em><b>Must Supply</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_PROPERTY__MUST_SUPPLY = PROPERTY__MUST_SUPPLY;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_PROPERTY__NAME = PROPERTY__NAME;

	/**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_PROPERTY__TYPE = PROPERTY__TYPE;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_PROPERTY__ANY_ATTRIBUTE = PROPERTY__ANY_ATTRIBUTE;

	/**
     * The number of structural features of the '<em>Constraining Property</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ConstrainingReferenceImpl <em>Constraining Reference</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ConstrainingReferenceImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getConstrainingReference()
     * @generated
     */
	int CONSTRAINING_REFERENCE = 22;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_REFERENCE__DOCUMENTATION = COMPONENT_REFERENCE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_REFERENCE__ANY_ATTRIBUTE = COMPONENT_REFERENCE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Interface Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_REFERENCE__INTERFACE_GROUP = COMPONENT_REFERENCE__INTERFACE_GROUP;

	/**
     * The feature id for the '<em><b>Interface</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_REFERENCE__INTERFACE = COMPONENT_REFERENCE__INTERFACE;

	/**
     * The feature id for the '<em><b>Binding Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_REFERENCE__BINDING_GROUP = COMPONENT_REFERENCE__BINDING_GROUP;

	/**
     * The feature id for the '<em><b>Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_REFERENCE__BINDING = COMPONENT_REFERENCE__BINDING;

	/**
     * The feature id for the '<em><b>Callback</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_REFERENCE__CALLBACK = COMPONENT_REFERENCE__CALLBACK;

	/**
     * The feature id for the '<em><b>Extensions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRAINING_REFERENCE__EXTENSIONS = COMPONENT_REFERENCE__EXTENSIONS;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_REFERENCE__ANY = COMPONENT_REFERENCE__ANY;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_REFERENCE__NAME = COMPONENT_REFERENCE__NAME;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_REFERENCE__POLICY_SETS = COMPONENT_REFERENCE__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_REFERENCE__REQUIRES = COMPONENT_REFERENCE__REQUIRES;

	/**
     * The feature id for the '<em><b>Autowire</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_REFERENCE__AUTOWIRE = COMPONENT_REFERENCE__AUTOWIRE;

	/**
     * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_REFERENCE__MULTIPLICITY = COMPONENT_REFERENCE__MULTIPLICITY;

	/**
     * The feature id for the '<em><b>Non Overridable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_REFERENCE__NON_OVERRIDABLE = COMPONENT_REFERENCE__NON_OVERRIDABLE;

	/**
     * The feature id for the '<em><b>Wired By Impl</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_REFERENCE__WIRED_BY_IMPL = COMPONENT_REFERENCE__WIRED_BY_IMPL;

	/**
     * The feature id for the '<em><b>Target</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_REFERENCE__TARGET = COMPONENT_REFERENCE__TARGET;

	/**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_REFERENCE__ID = COMPONENT_REFERENCE__ID;

	/**
     * The number of structural features of the '<em>Constraining Reference</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_REFERENCE_FEATURE_COUNT = COMPONENT_REFERENCE_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ConstrainingServiceImpl <em>Constraining Service</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ConstrainingServiceImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getConstrainingService()
     * @generated
     */
	int CONSTRAINING_SERVICE = 23;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_SERVICE__DOCUMENTATION = COMPONENT_SERVICE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_SERVICE__ANY_ATTRIBUTE = COMPONENT_SERVICE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Interface Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_SERVICE__INTERFACE_GROUP = COMPONENT_SERVICE__INTERFACE_GROUP;

	/**
     * The feature id for the '<em><b>Interface</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_SERVICE__INTERFACE = COMPONENT_SERVICE__INTERFACE;

	/**
     * The feature id for the '<em><b>Binding Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_SERVICE__BINDING_GROUP = COMPONENT_SERVICE__BINDING_GROUP;

	/**
     * The feature id for the '<em><b>Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_SERVICE__BINDING = COMPONENT_SERVICE__BINDING;

	/**
     * The feature id for the '<em><b>Callback</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_SERVICE__CALLBACK = COMPONENT_SERVICE__CALLBACK;

	/**
     * The feature id for the '<em><b>Extensions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRAINING_SERVICE__EXTENSIONS = COMPONENT_SERVICE__EXTENSIONS;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_SERVICE__ANY = COMPONENT_SERVICE__ANY;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_SERVICE__NAME = COMPONENT_SERVICE__NAME;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_SERVICE__POLICY_SETS = COMPONENT_SERVICE__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_SERVICE__REQUIRES = COMPONENT_SERVICE__REQUIRES;

	/**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_SERVICE__ID = COMPONENT_SERVICE__ID;

	/**
     * The number of structural features of the '<em>Constraining Service</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_SERVICE_FEATURE_COUNT = COMPONENT_SERVICE_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ConstrainingTypeImpl <em>Constraining Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ConstrainingTypeImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getConstrainingType()
     * @generated
     */
	int CONSTRAINING_TYPE = 24;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_TYPE__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_TYPE__ANY_ATTRIBUTE = COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_TYPE__GROUP = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Service</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_TYPE__SERVICE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_TYPE__REFERENCE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_TYPE__PROPERTY = COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_TYPE__ANY = COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_TYPE__NAME = COMMON_EXTENSION_BASE_FEATURE_COUNT + 5;

	/**
     * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_TYPE__TARGET_NAMESPACE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 6;

	/**
     * The number of structural features of the '<em>Constraining Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINING_TYPE_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 7;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ContributionTypeImpl <em>Contribution Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ContributionTypeImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getContributionType()
     * @generated
     */
	int CONTRIBUTION_TYPE = 26;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTRIBUTION_TYPE__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTRIBUTION_TYPE__ANY_ATTRIBUTE = COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Deployable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTRIBUTION_TYPE__DEPLOYABLE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Import Base Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTRIBUTION_TYPE__IMPORT_BASE_GROUP = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Import Base</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTRIBUTION_TYPE__IMPORT_BASE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Export Base Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTRIBUTION_TYPE__EXPORT_BASE_GROUP = COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Export Base</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTRIBUTION_TYPE__EXPORT_BASE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTRIBUTION_TYPE__ANY = COMMON_EXTENSION_BASE_FEATURE_COUNT + 5;

	/**
     * The number of structural features of the '<em>Contribution Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTRIBUTION_TYPE_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 6;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPExportImpl <em>CPP Export</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPExportImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getCPPExport()
     * @generated
     */
	int CPP_EXPORT = 27;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_EXPORT__DOCUMENTATION = EXPORT__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_EXPORT__ANY_ATTRIBUTE = EXPORT__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_EXPORT__ANY = EXPORT__ANY;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_EXPORT__NAME = EXPORT_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_EXPORT__PATH = EXPORT_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>CPP Export</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_EXPORT_FEATURE_COUNT = EXPORT_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPFunctionImpl <em>CPP Function</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPFunctionImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getCPPFunction()
     * @generated
     */
	int CPP_FUNCTION = 28;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_FUNCTION__NAME = 0;

	/**
     * The feature id for the '<em><b>One Way</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_FUNCTION__ONE_WAY = 1;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_FUNCTION__REQUIRES = 2;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_FUNCTION__ANY_ATTRIBUTE = 3;

	/**
     * The number of structural features of the '<em>CPP Function</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_FUNCTION_FEATURE_COUNT = 4;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPImplementationImpl <em>CPP Implementation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPImplementationImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getCPPImplementation()
     * @generated
     */
	int CPP_IMPLEMENTATION = 29;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPLEMENTATION__DOCUMENTATION = IMPLEMENTATION__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPLEMENTATION__ANY_ATTRIBUTE = IMPLEMENTATION__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPLEMENTATION__POLICY_SETS = IMPLEMENTATION__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPLEMENTATION__REQUIRES = IMPLEMENTATION__REQUIRES;

	/**
     * The feature id for the '<em><b>Function</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPLEMENTATION__FUNCTION = IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPLEMENTATION__ANY = IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Allows Pass By Reference</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPLEMENTATION__ALLOWS_PASS_BY_REFERENCE = IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPLEMENTATION__CLASS = IMPLEMENTATION_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Component Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPLEMENTATION__COMPONENT_TYPE = IMPLEMENTATION_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Eager Init</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPLEMENTATION__EAGER_INIT = IMPLEMENTATION_FEATURE_COUNT + 5;

	/**
     * The feature id for the '<em><b>Header</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPLEMENTATION__HEADER = IMPLEMENTATION_FEATURE_COUNT + 6;

	/**
     * The feature id for the '<em><b>Library</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPLEMENTATION__LIBRARY = IMPLEMENTATION_FEATURE_COUNT + 7;

	/**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPLEMENTATION__PATH = IMPLEMENTATION_FEATURE_COUNT + 8;

	/**
     * The feature id for the '<em><b>Scope</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPLEMENTATION__SCOPE = IMPLEMENTATION_FEATURE_COUNT + 9;

	/**
     * The feature id for the '<em><b>Any Attribute1</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPLEMENTATION__ANY_ATTRIBUTE1 = IMPLEMENTATION_FEATURE_COUNT + 10;

	/**
     * The number of structural features of the '<em>CPP Implementation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPLEMENTATION_FEATURE_COUNT = IMPLEMENTATION_FEATURE_COUNT + 11;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPImplementationFunctionImpl <em>CPP Implementation Function</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPImplementationFunctionImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getCPPImplementationFunction()
     * @generated
     */
	int CPP_IMPLEMENTATION_FUNCTION = 30;

	/**
     * The feature id for the '<em><b>Allows Pass By Reference</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPLEMENTATION_FUNCTION__ALLOWS_PASS_BY_REFERENCE = 0;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPLEMENTATION_FUNCTION__NAME = 1;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPLEMENTATION_FUNCTION__ANY_ATTRIBUTE = 2;

	/**
     * The number of structural features of the '<em>CPP Implementation Function</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPLEMENTATION_FUNCTION_FEATURE_COUNT = 3;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPImportImpl <em>CPP Import</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPImportImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getCPPImport()
     * @generated
     */
	int CPP_IMPORT = 31;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPORT__DOCUMENTATION = IMPORT__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPORT__ANY_ATTRIBUTE = IMPORT__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPORT__ANY = IMPORT__ANY;

	/**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPORT__LOCATION = IMPORT_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPORT__NAME = IMPORT_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>CPP Import</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_IMPORT_FEATURE_COUNT = IMPORT_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPInterfaceImpl <em>CPP Interface</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.CPPInterfaceImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getCPPInterface()
     * @generated
     */
	int CPP_INTERFACE = 32;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_INTERFACE__DOCUMENTATION = INTERFACE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_INTERFACE__ANY_ATTRIBUTE = INTERFACE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_INTERFACE__POLICY_SETS = INTERFACE__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Remotable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_INTERFACE__REMOTABLE = INTERFACE__REMOTABLE;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_INTERFACE__REQUIRES = INTERFACE__REQUIRES;

	/**
     * The feature id for the '<em><b>Function</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_INTERFACE__FUNCTION = INTERFACE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Callback Function</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_INTERFACE__CALLBACK_FUNCTION = INTERFACE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_INTERFACE__ANY = INTERFACE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Callback Class</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_INTERFACE__CALLBACK_CLASS = INTERFACE_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Callback Header</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_INTERFACE__CALLBACK_HEADER = INTERFACE_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_INTERFACE__CLASS = INTERFACE_FEATURE_COUNT + 5;

	/**
     * The feature id for the '<em><b>Header</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_INTERFACE__HEADER = INTERFACE_FEATURE_COUNT + 6;

	/**
     * The feature id for the '<em><b>Any Attribute1</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_INTERFACE__ANY_ATTRIBUTE1 = INTERFACE_FEATURE_COUNT + 7;

	/**
     * The number of structural features of the '<em>CPP Interface</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CPP_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 8;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DeployableTypeImpl <em>Deployable Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.DeployableTypeImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getDeployableType()
     * @generated
     */
	int DEPLOYABLE_TYPE = 33;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DEPLOYABLE_TYPE__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DEPLOYABLE_TYPE__ANY_ATTRIBUTE = COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DEPLOYABLE_TYPE__ANY = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Composite</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DEPLOYABLE_TYPE__COMPOSITE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Deployable Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DEPLOYABLE_TYPE_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentationImpl <em>Documentation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentationImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getDocumentation()
     * @generated
     */
	int DOCUMENTATION = 34;

	/**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENTATION__MIXED = 0;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENTATION__ANY = 1;

	/**
     * The feature id for the '<em><b>Lang</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENTATION__LANG = 2;

	/**
     * The number of structural features of the '<em>Documentation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENTATION_FEATURE_COUNT = 3;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.DocumentRootImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getDocumentRoot()
     * @generated
     */
	int DOCUMENT_ROOT = 35;

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
     * The feature id for the '<em><b>Binding</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__BINDING = 3;

	/**
     * The feature id for the '<em><b>Binding Ejb</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__BINDING_EJB = 4;

	/**
     * The feature id for the '<em><b>Binding Jca</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__BINDING_JCA = 5;

	/**
     * The feature id for the '<em><b>Binding Jms</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__BINDING_JMS = 6;

	/**
     * The feature id for the '<em><b>Binding Sca</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__BINDING_SCA = 7;

	/**
     * The feature id for the '<em><b>Binding Ws</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__BINDING_WS = 8;

	/**
     * The feature id for the '<em><b>Binding Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__BINDING_TYPE = 9;

	/**
     * The feature id for the '<em><b>Callback</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__CALLBACK = 10;

	/**
     * The feature id for the '<em><b>Component Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__COMPONENT_TYPE = 11;

	/**
     * The feature id for the '<em><b>Composite</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__COMPOSITE = 12;

	/**
     * The feature id for the '<em><b>Constraining Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__CONSTRAINING_TYPE = 13;

	/**
     * The feature id for the '<em><b>Contribution</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__CONTRIBUTION = 14;

	/**
     * The feature id for the '<em><b>Definitions</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__DEFINITIONS = 15;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__DOCUMENTATION = 16;

	/**
     * The feature id for the '<em><b>Export</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__EXPORT = 17;

	/**
     * The feature id for the '<em><b>Export Base</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__EXPORT_BASE = 18;

	/**
     * The feature id for the '<em><b>Export C</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__EXPORT_C = 19;

	/**
     * The feature id for the '<em><b>Export Cpp</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__EXPORT_CPP = 20;

	/**
     * The feature id for the '<em><b>Export Java</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__EXPORT_JAVA = 21;

	/**
     * The feature id for the '<em><b>Extensions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EXTENSIONS = 22;

    /**
     * The feature id for the '<em><b>Implementation</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__IMPLEMENTATION = 23;

	/**
     * The feature id for the '<em><b>Implementation Bpel</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__IMPLEMENTATION_BPEL = 24;

	/**
     * The feature id for the '<em><b>Implementation C</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__IMPLEMENTATION_C = 25;

	/**
     * The feature id for the '<em><b>Implementation Composite</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__IMPLEMENTATION_COMPOSITE = 26;

	/**
     * The feature id for the '<em><b>Implementation Cpp</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__IMPLEMENTATION_CPP = 27;

	/**
     * The feature id for the '<em><b>Implementation Ejb</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__IMPLEMENTATION_EJB = 28;

	/**
     * The feature id for the '<em><b>Implementation Java</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__IMPLEMENTATION_JAVA = 29;

	/**
     * The feature id for the '<em><b>Implementation Jee</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__IMPLEMENTATION_JEE = 30;

	/**
     * The feature id for the '<em><b>Implementation Spring</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__IMPLEMENTATION_SPRING = 31;

	/**
     * The feature id for the '<em><b>Implementation Web</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__IMPLEMENTATION_WEB = 32;

	/**
     * The feature id for the '<em><b>Implementation Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__IMPLEMENTATION_TYPE = 33;

	/**
     * The feature id for the '<em><b>Import</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__IMPORT = 34;

	/**
     * The feature id for the '<em><b>Import Base</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__IMPORT_BASE = 35;

	/**
     * The feature id for the '<em><b>Import C</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__IMPORT_C = 36;

	/**
     * The feature id for the '<em><b>Import Cpp</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__IMPORT_CPP = 37;

	/**
     * The feature id for the '<em><b>Import Java</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__IMPORT_JAVA = 38;

	/**
     * The feature id for the '<em><b>Include</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__INCLUDE = 39;

	/**
     * The feature id for the '<em><b>Intent</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__INTENT = 40;

	/**
     * The feature id for the '<em><b>Interface</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__INTERFACE = 41;

	/**
     * The feature id for the '<em><b>Interface C</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__INTERFACE_C = 42;

	/**
     * The feature id for the '<em><b>Interface Cpp</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__INTERFACE_CPP = 43;

	/**
     * The feature id for the '<em><b>Interface Java</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__INTERFACE_JAVA = 44;

	/**
     * The feature id for the '<em><b>Interface Wsdl</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__INTERFACE_WSDL = 45;

	/**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__OPERATION_SELECTOR = 46;

	/**
     * The feature id for the '<em><b>Operation Selector Jms Default</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__OPERATION_SELECTOR_JMS_DEFAULT = 47;

	/**
     * The feature id for the '<em><b>Policy Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__POLICY_SET = 48;

	/**
     * The feature id for the '<em><b>Policy Set Attachment</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__POLICY_SET_ATTACHMENT = 49;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__VALUE = 50;

	/**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__WIRE_FORMAT = 51;

	/**
     * The feature id for the '<em><b>Wire Format Jms Default</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__WIRE_FORMAT_JMS_DEFAULT = 52;

	/**
     * The feature id for the '<em><b>WS Callback</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__WS_CALLBACK = 53;

	/**
     * The feature id for the '<em><b>Callback1</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__CALLBACK1 = 54;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__REQUIRES = 55;

	/**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT_FEATURE_COUNT = 56;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.EJBImplementationImpl <em>EJB Implementation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.EJBImplementationImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getEJBImplementation()
     * @generated
     */
	int EJB_IMPLEMENTATION = 36;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EJB_IMPLEMENTATION__DOCUMENTATION = IMPLEMENTATION__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EJB_IMPLEMENTATION__ANY_ATTRIBUTE = IMPLEMENTATION__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EJB_IMPLEMENTATION__POLICY_SETS = IMPLEMENTATION__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EJB_IMPLEMENTATION__REQUIRES = IMPLEMENTATION__REQUIRES;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EJB_IMPLEMENTATION__ANY = IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Ejb Link</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EJB_IMPLEMENTATION__EJB_LINK = IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Any Attribute1</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EJB_IMPLEMENTATION__ANY_ATTRIBUTE1 = IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
     * The number of structural features of the '<em>EJB Implementation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EJB_IMPLEMENTATION_FEATURE_COUNT = IMPLEMENTATION_FEATURE_COUNT + 3;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.EJBSessionBeanBindingImpl <em>EJB Session Bean Binding</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.EJBSessionBeanBindingImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getEJBSessionBeanBinding()
     * @generated
     */
	int EJB_SESSION_BEAN_BINDING = 37;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EJB_SESSION_BEAN_BINDING__DOCUMENTATION = BINDING__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EJB_SESSION_BEAN_BINDING__ANY_ATTRIBUTE = BINDING__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EJB_SESSION_BEAN_BINDING__WIRE_FORMAT_GROUP = BINDING__WIRE_FORMAT_GROUP;

	/**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EJB_SESSION_BEAN_BINDING__WIRE_FORMAT = BINDING__WIRE_FORMAT;

	/**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EJB_SESSION_BEAN_BINDING__OPERATION_SELECTOR_GROUP = BINDING__OPERATION_SELECTOR_GROUP;

	/**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EJB_SESSION_BEAN_BINDING__OPERATION_SELECTOR = BINDING__OPERATION_SELECTOR;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EJB_SESSION_BEAN_BINDING__NAME = BINDING__NAME;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EJB_SESSION_BEAN_BINDING__POLICY_SETS = BINDING__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EJB_SESSION_BEAN_BINDING__REQUIRES = BINDING__REQUIRES;

	/**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EJB_SESSION_BEAN_BINDING__URI = BINDING__URI;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EJB_SESSION_BEAN_BINDING__ANY = BINDING_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Ejb Link Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EJB_SESSION_BEAN_BINDING__EJB_LINK_NAME = BINDING_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Ejb Version</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EJB_SESSION_BEAN_BINDING__EJB_VERSION = BINDING_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Home Interface</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EJB_SESSION_BEAN_BINDING__HOME_INTERFACE = BINDING_FEATURE_COUNT + 3;

	/**
     * The number of structural features of the '<em>EJB Session Bean Binding</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EJB_SESSION_BEAN_BINDING_FEATURE_COUNT = BINDING_FEATURE_COUNT + 4;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ExportTypeImpl <em>Export Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ExportTypeImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getExportType()
     * @generated
     */
	int EXPORT_TYPE = 39;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXPORT_TYPE__DOCUMENTATION = EXPORT__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXPORT_TYPE__ANY_ATTRIBUTE = EXPORT__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXPORT_TYPE__ANY = EXPORT__ANY;

	/**
     * The feature id for the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXPORT_TYPE__NAMESPACE = EXPORT_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Export Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXPORT_TYPE_FEATURE_COUNT = EXPORT_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ExtensionsTypeImpl <em>Extensions Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ExtensionsTypeImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getExtensionsType()
     * @generated
     */
    int EXTENSIONS_TYPE = 40;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSIONS_TYPE__ANY = 0;

    /**
     * The number of structural features of the '<em>Extensions Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSIONS_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ImplementationTypeImpl <em>Implementation Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ImplementationTypeImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getImplementationType()
     * @generated
     */
	int IMPLEMENTATION_TYPE = 42;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IMPLEMENTATION_TYPE__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IMPLEMENTATION_TYPE__ANY_ATTRIBUTE = COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IMPLEMENTATION_TYPE__ANY = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Always Provides</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IMPLEMENTATION_TYPE__ALWAYS_PROVIDES = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>May Provide</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IMPLEMENTATION_TYPE__MAY_PROVIDE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IMPLEMENTATION_TYPE__TYPE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

	/**
     * The number of structural features of the '<em>Implementation Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IMPLEMENTATION_TYPE_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ImportTypeImpl <em>Import Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ImportTypeImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getImportType()
     * @generated
     */
	int IMPORT_TYPE = 44;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IMPORT_TYPE__DOCUMENTATION = IMPORT__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IMPORT_TYPE__ANY_ATTRIBUTE = IMPORT__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IMPORT_TYPE__ANY = IMPORT__ANY;

	/**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IMPORT_TYPE__LOCATION = IMPORT_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IMPORT_TYPE__NAMESPACE = IMPORT_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Import Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int IMPORT_TYPE_FEATURE_COUNT = IMPORT_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.InboundOperationImpl <em>Inbound Operation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.InboundOperationImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getInboundOperation()
     * @generated
     */
	int INBOUND_OPERATION = 45;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INBOUND_OPERATION__ANY = 0;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INBOUND_OPERATION__NAME = 1;

	/**
     * The feature id for the '<em><b>Native Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INBOUND_OPERATION__NATIVE_OPERATION = 2;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INBOUND_OPERATION__ANY_ATTRIBUTE = 3;

	/**
     * The number of structural features of the '<em>Inbound Operation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INBOUND_OPERATION_FEATURE_COUNT = 4;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.IncludeImpl <em>Include</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.IncludeImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getInclude()
     * @generated
     */
	int INCLUDE = 46;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INCLUDE__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INCLUDE__ANY_ATTRIBUTE = COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INCLUDE__NAME = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Include</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INCLUDE_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.IntentImpl <em>Intent</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.IntentImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getIntent()
     * @generated
     */
	int INTENT = 47;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTENT__DESCRIPTION = 0;

	/**
     * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTENT__QUALIFIER = 1;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTENT__ANY = 2;

	/**
     * The feature id for the '<em><b>Constrains</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTENT__CONSTRAINS = 3;

	/**
     * The feature id for the '<em><b>Excludes</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTENT__EXCLUDES = 4;

	/**
     * The feature id for the '<em><b>Intent Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTENT__INTENT_TYPE = 5;

	/**
     * The feature id for the '<em><b>Mutually Exclusive</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTENT__MUTUALLY_EXCLUSIVE = 6;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTENT__NAME = 7;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTENT__REQUIRES = 8;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTENT__ANY_ATTRIBUTE = 9;

	/**
     * The number of structural features of the '<em>Intent</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTENT_FEATURE_COUNT = 10;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.IntentMapImpl <em>Intent Map</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.IntentMapImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getIntentMap()
     * @generated
     */
	int INTENT_MAP = 48;

	/**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTENT_MAP__GROUP = 0;

	/**
     * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTENT_MAP__QUALIFIER = 1;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTENT_MAP__ANY = 2;

	/**
     * The feature id for the '<em><b>Provides</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTENT_MAP__PROVIDES = 3;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTENT_MAP__ANY_ATTRIBUTE = 4;

	/**
     * The number of structural features of the '<em>Intent Map</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTENT_MAP_FEATURE_COUNT = 5;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.IntentQualifierImpl <em>Intent Qualifier</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.IntentQualifierImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getIntentQualifier()
     * @generated
     */
	int INTENT_QUALIFIER = 49;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTENT_QUALIFIER__DESCRIPTION = 0;

	/**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTENT_QUALIFIER__DEFAULT = 1;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTENT_QUALIFIER__NAME = 2;

	/**
     * The number of structural features of the '<em>Intent Qualifier</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTENT_QUALIFIER_FEATURE_COUNT = 3;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.InteractionSpecImpl <em>Interaction Spec</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.InteractionSpecImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getInteractionSpec()
     * @generated
     */
	int INTERACTION_SPEC = 50;

	/**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTERACTION_SPEC__PROPERTY = 0;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTERACTION_SPEC__ANY = 1;

	/**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTERACTION_SPEC__TYPE = 2;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTERACTION_SPEC__ANY_ATTRIBUTE = 3;

	/**
     * The number of structural features of the '<em>Interaction Spec</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTERACTION_SPEC_FEATURE_COUNT = 4;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JavaExportTypeImpl <em>Java Export Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.JavaExportTypeImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getJavaExportType()
     * @generated
     */
	int JAVA_EXPORT_TYPE = 52;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_EXPORT_TYPE__DOCUMENTATION = EXPORT__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_EXPORT_TYPE__ANY_ATTRIBUTE = EXPORT__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_EXPORT_TYPE__ANY = EXPORT__ANY;

	/**
     * The feature id for the '<em><b>Package</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_EXPORT_TYPE__PACKAGE = EXPORT_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Java Export Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_EXPORT_TYPE_FEATURE_COUNT = EXPORT_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JavaImplementationImpl <em>Java Implementation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.JavaImplementationImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getJavaImplementation()
     * @generated
     */
	int JAVA_IMPLEMENTATION = 53;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_IMPLEMENTATION__DOCUMENTATION = IMPLEMENTATION__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_IMPLEMENTATION__ANY_ATTRIBUTE = IMPLEMENTATION__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_IMPLEMENTATION__POLICY_SETS = IMPLEMENTATION__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_IMPLEMENTATION__REQUIRES = IMPLEMENTATION__REQUIRES;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_IMPLEMENTATION__ANY = IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_IMPLEMENTATION__CLASS = IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Any Attribute1</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_IMPLEMENTATION__ANY_ATTRIBUTE1 = IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
     * The number of structural features of the '<em>Java Implementation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_IMPLEMENTATION_FEATURE_COUNT = IMPLEMENTATION_FEATURE_COUNT + 3;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JavaImportTypeImpl <em>Java Import Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.JavaImportTypeImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getJavaImportType()
     * @generated
     */
	int JAVA_IMPORT_TYPE = 54;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_IMPORT_TYPE__DOCUMENTATION = IMPORT__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_IMPORT_TYPE__ANY_ATTRIBUTE = IMPORT__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_IMPORT_TYPE__ANY = IMPORT__ANY;

	/**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_IMPORT_TYPE__LOCATION = IMPORT_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Package</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_IMPORT_TYPE__PACKAGE = IMPORT_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Java Import Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_IMPORT_TYPE_FEATURE_COUNT = IMPORT_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JavaInterfaceImpl <em>Java Interface</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.JavaInterfaceImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getJavaInterface()
     * @generated
     */
	int JAVA_INTERFACE = 55;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_INTERFACE__DOCUMENTATION = INTERFACE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_INTERFACE__ANY_ATTRIBUTE = INTERFACE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_INTERFACE__POLICY_SETS = INTERFACE__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Remotable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_INTERFACE__REMOTABLE = INTERFACE__REMOTABLE;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_INTERFACE__REQUIRES = INTERFACE__REQUIRES;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_INTERFACE__ANY = INTERFACE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Callback Interface</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_INTERFACE__CALLBACK_INTERFACE = INTERFACE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Interface</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_INTERFACE__INTERFACE = INTERFACE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Any Attribute1</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_INTERFACE__ANY_ATTRIBUTE1 = INTERFACE_FEATURE_COUNT + 3;

	/**
     * The number of structural features of the '<em>Java Interface</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JAVA_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 4;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JCABindingImpl <em>JCA Binding</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.JCABindingImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getJCABinding()
     * @generated
     */
	int JCA_BINDING = 56;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_BINDING__DOCUMENTATION = BINDING__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_BINDING__ANY_ATTRIBUTE = BINDING__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_BINDING__WIRE_FORMAT_GROUP = BINDING__WIRE_FORMAT_GROUP;

	/**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_BINDING__WIRE_FORMAT = BINDING__WIRE_FORMAT;

	/**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_BINDING__OPERATION_SELECTOR_GROUP = BINDING__OPERATION_SELECTOR_GROUP;

	/**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_BINDING__OPERATION_SELECTOR = BINDING__OPERATION_SELECTOR;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_BINDING__NAME = BINDING__NAME;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_BINDING__POLICY_SETS = BINDING__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_BINDING__REQUIRES = BINDING__REQUIRES;

	/**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_BINDING__URI = BINDING__URI;

	/**
     * The feature id for the '<em><b>Outbound Connection</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_BINDING__OUTBOUND_CONNECTION = BINDING_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Inbound Connection</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_BINDING__INBOUND_CONNECTION = BINDING_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Outbound Interaction</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_BINDING__OUTBOUND_INTERACTION = BINDING_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Inbound Interaction</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_BINDING__INBOUND_INTERACTION = BINDING_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_BINDING__PROPERTY = BINDING_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_BINDING__ANY = BINDING_FEATURE_COUNT + 5;

	/**
     * The feature id for the '<em><b>Connection Info</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_BINDING__CONNECTION_INFO = BINDING_FEATURE_COUNT + 6;

	/**
     * The feature id for the '<em><b>Initial Context Factory</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_BINDING__INITIAL_CONTEXT_FACTORY = BINDING_FEATURE_COUNT + 7;

	/**
     * The feature id for the '<em><b>Jndi URL</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_BINDING__JNDI_URL = BINDING_FEATURE_COUNT + 8;

	/**
     * The number of structural features of the '<em>JCA Binding</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_BINDING_FEATURE_COUNT = BINDING_FEATURE_COUNT + 9;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JCAInboundConnectionImpl <em>JCA Inbound Connection</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.JCAInboundConnectionImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getJCAInboundConnection()
     * @generated
     */
	int JCA_INBOUND_CONNECTION = 57;

	/**
     * The feature id for the '<em><b>Resource Adapter</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_INBOUND_CONNECTION__RESOURCE_ADAPTER = 0;

	/**
     * The feature id for the '<em><b>Activation Spec</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_INBOUND_CONNECTION__ACTIVATION_SPEC = 1;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_INBOUND_CONNECTION__ANY = 2;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_INBOUND_CONNECTION__ANY_ATTRIBUTE = 3;

	/**
     * The number of structural features of the '<em>JCA Inbound Connection</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_INBOUND_CONNECTION_FEATURE_COUNT = 4;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JCAInboundInteractionImpl <em>JCA Inbound Interaction</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.JCAInboundInteractionImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getJCAInboundInteraction()
     * @generated
     */
	int JCA_INBOUND_INTERACTION = 58;

	/**
     * The feature id for the '<em><b>Listener</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_INBOUND_INTERACTION__LISTENER = 0;

	/**
     * The feature id for the '<em><b>Inbound Operation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_INBOUND_INTERACTION__INBOUND_OPERATION = 1;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_INBOUND_INTERACTION__ANY = 2;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_INBOUND_INTERACTION__ANY_ATTRIBUTE = 3;

	/**
     * The number of structural features of the '<em>JCA Inbound Interaction</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_INBOUND_INTERACTION_FEATURE_COUNT = 4;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JCAOutboundConnectionImpl <em>JCA Outbound Connection</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.JCAOutboundConnectionImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getJCAOutboundConnection()
     * @generated
     */
	int JCA_OUTBOUND_CONNECTION = 59;

	/**
     * The feature id for the '<em><b>Resource Adapter</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_OUTBOUND_CONNECTION__RESOURCE_ADAPTER = 0;

	/**
     * The feature id for the '<em><b>Connection</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_OUTBOUND_CONNECTION__CONNECTION = 1;

	/**
     * The feature id for the '<em><b>Res Auth</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_OUTBOUND_CONNECTION__RES_AUTH = 2;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_OUTBOUND_CONNECTION__ANY = 3;

	/**
     * The feature id for the '<em><b>Managed</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_OUTBOUND_CONNECTION__MANAGED = 4;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_OUTBOUND_CONNECTION__ANY_ATTRIBUTE = 5;

	/**
     * The number of structural features of the '<em>JCA Outbound Connection</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_OUTBOUND_CONNECTION_FEATURE_COUNT = 6;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JCAOutboundInteractionImpl <em>JCA Outbound Interaction</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.JCAOutboundInteractionImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getJCAOutboundInteraction()
     * @generated
     */
	int JCA_OUTBOUND_INTERACTION = 60;

	/**
     * The feature id for the '<em><b>Connection Spec</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_OUTBOUND_INTERACTION__CONNECTION_SPEC = 0;

	/**
     * The feature id for the '<em><b>Interaction Spec</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_OUTBOUND_INTERACTION__INTERACTION_SPEC = 1;

	/**
     * The feature id for the '<em><b>Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_OUTBOUND_INTERACTION__OPERATION = 2;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_OUTBOUND_INTERACTION__ANY = 3;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_OUTBOUND_INTERACTION__ANY_ATTRIBUTE = 4;

	/**
     * The number of structural features of the '<em>JCA Outbound Interaction</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JCA_OUTBOUND_INTERACTION_FEATURE_COUNT = 5;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JEEImplementationImpl <em>JEE Implementation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.JEEImplementationImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getJEEImplementation()
     * @generated
     */
	int JEE_IMPLEMENTATION = 61;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JEE_IMPLEMENTATION__DOCUMENTATION = IMPLEMENTATION__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JEE_IMPLEMENTATION__ANY_ATTRIBUTE = IMPLEMENTATION__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JEE_IMPLEMENTATION__POLICY_SETS = IMPLEMENTATION__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JEE_IMPLEMENTATION__REQUIRES = IMPLEMENTATION__REQUIRES;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JEE_IMPLEMENTATION__ANY = IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Archive</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JEE_IMPLEMENTATION__ARCHIVE = IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Any Attribute1</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JEE_IMPLEMENTATION__ANY_ATTRIBUTE1 = IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
     * The number of structural features of the '<em>JEE Implementation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JEE_IMPLEMENTATION_FEATURE_COUNT = IMPLEMENTATION_FEATURE_COUNT + 3;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSActivationSpecImpl <em>JMS Activation Spec</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSActivationSpecImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getJMSActivationSpec()
     * @generated
     */
	int JMS_ACTIVATION_SPEC = 62;

	/**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_ACTIVATION_SPEC__PROPERTY = 0;

	/**
     * The feature id for the '<em><b>Create</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_ACTIVATION_SPEC__CREATE = 1;

	/**
     * The feature id for the '<em><b>Jndi Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_ACTIVATION_SPEC__JNDI_NAME = 2;

	/**
     * The number of structural features of the '<em>JMS Activation Spec</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_ACTIVATION_SPEC_FEATURE_COUNT = 3;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSBindingImpl <em>JMS Binding</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSBindingImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getJMSBinding()
     * @generated
     */
	int JMS_BINDING = 63;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__DOCUMENTATION = BINDING__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__ANY_ATTRIBUTE = BINDING__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__WIRE_FORMAT_GROUP = BINDING__WIRE_FORMAT_GROUP;

	/**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__WIRE_FORMAT = BINDING__WIRE_FORMAT;

	/**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__OPERATION_SELECTOR_GROUP = BINDING__OPERATION_SELECTOR_GROUP;

	/**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__OPERATION_SELECTOR = BINDING__OPERATION_SELECTOR;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__NAME = BINDING__NAME;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__POLICY_SETS = BINDING__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__REQUIRES = BINDING__REQUIRES;

	/**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__URI = BINDING__URI;

	/**
     * The feature id for the '<em><b>Destination</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__DESTINATION = BINDING_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Connection Factory</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__CONNECTION_FACTORY = BINDING_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Activation Spec</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__ACTIVATION_SPEC = BINDING_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Response</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__RESPONSE = BINDING_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Headers</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__HEADERS = BINDING_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Message Selection</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__MESSAGE_SELECTION = BINDING_FEATURE_COUNT + 5;

	/**
     * The feature id for the '<em><b>Resource Adapter</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__RESOURCE_ADAPTER = BINDING_FEATURE_COUNT + 6;

	/**
     * The feature id for the '<em><b>Operation Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__OPERATION_PROPERTIES = BINDING_FEATURE_COUNT + 7;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__ANY = BINDING_FEATURE_COUNT + 8;

	/**
     * The feature id for the '<em><b>Correlation Scheme</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__CORRELATION_SCHEME = BINDING_FEATURE_COUNT + 9;

	/**
     * The feature id for the '<em><b>Initial Context Factory</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__INITIAL_CONTEXT_FACTORY = BINDING_FEATURE_COUNT + 10;

	/**
     * The feature id for the '<em><b>Jndi URL</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__JNDI_URL = BINDING_FEATURE_COUNT + 11;

	/**
     * The feature id for the '<em><b>Operation Properties1</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__OPERATION_PROPERTIES1 = BINDING_FEATURE_COUNT + 12;

	/**
     * The feature id for the '<em><b>Request Connection</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__REQUEST_CONNECTION = BINDING_FEATURE_COUNT + 13;

	/**
     * The feature id for the '<em><b>Response Connection</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING__RESPONSE_CONNECTION = BINDING_FEATURE_COUNT + 14;

	/**
     * The number of structural features of the '<em>JMS Binding</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_BINDING_FEATURE_COUNT = BINDING_FEATURE_COUNT + 15;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSConnectionFactoryImpl <em>JMS Connection Factory</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSConnectionFactoryImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getJMSConnectionFactory()
     * @generated
     */
	int JMS_CONNECTION_FACTORY = 64;

	/**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_CONNECTION_FACTORY__PROPERTY = 0;

	/**
     * The feature id for the '<em><b>Create</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_CONNECTION_FACTORY__CREATE = 1;

	/**
     * The feature id for the '<em><b>Jndi Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_CONNECTION_FACTORY__JNDI_NAME = 2;

	/**
     * The number of structural features of the '<em>JMS Connection Factory</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_CONNECTION_FACTORY_FEATURE_COUNT = 3;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSDestinationImpl <em>JMS Destination</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSDestinationImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getJMSDestination()
     * @generated
     */
	int JMS_DESTINATION = 65;

	/**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_DESTINATION__PROPERTY = 0;

	/**
     * The feature id for the '<em><b>Create</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_DESTINATION__CREATE = 1;

	/**
     * The feature id for the '<em><b>Jndi Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_DESTINATION__JNDI_NAME = 2;

	/**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_DESTINATION__TYPE = 3;

	/**
     * The number of structural features of the '<em>JMS Destination</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_DESTINATION_FEATURE_COUNT = 4;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSHeadersImpl <em>JMS Headers</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSHeadersImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getJMSHeaders()
     * @generated
     */
	int JMS_HEADERS = 66;

	/**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_HEADERS__PROPERTY = 0;

	/**
     * The feature id for the '<em><b>Delivery Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_HEADERS__DELIVERY_MODE = 1;

	/**
     * The feature id for the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_HEADERS__PRIORITY = 2;

	/**
     * The feature id for the '<em><b>Time To Live</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_HEADERS__TIME_TO_LIVE = 3;

	/**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_HEADERS__TYPE = 4;

	/**
     * The number of structural features of the '<em>JMS Headers</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_HEADERS_FEATURE_COUNT = 5;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSMessageSelectionImpl <em>JMS Message Selection</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSMessageSelectionImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getJMSMessageSelection()
     * @generated
     */
	int JMS_MESSAGE_SELECTION = 67;

	/**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_MESSAGE_SELECTION__PROPERTY = 0;

	/**
     * The feature id for the '<em><b>Selector</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_MESSAGE_SELECTION__SELECTOR = 1;

	/**
     * The number of structural features of the '<em>JMS Message Selection</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_MESSAGE_SELECTION_FEATURE_COUNT = 2;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSOperationPropertiesImpl <em>JMS Operation Properties</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSOperationPropertiesImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getJMSOperationProperties()
     * @generated
     */
	int JMS_OPERATION_PROPERTIES = 68;

	/**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_OPERATION_PROPERTIES__PROPERTY = 0;

	/**
     * The feature id for the '<em><b>Headers</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_OPERATION_PROPERTIES__HEADERS = 1;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_OPERATION_PROPERTIES__NAME = 2;

	/**
     * The feature id for the '<em><b>Native Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_OPERATION_PROPERTIES__NATIVE_OPERATION = 3;

	/**
     * The number of structural features of the '<em>JMS Operation Properties</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_OPERATION_PROPERTIES_FEATURE_COUNT = 4;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSResourceAdapterImpl <em>JMS Resource Adapter</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSResourceAdapterImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getJMSResourceAdapter()
     * @generated
     */
	int JMS_RESOURCE_ADAPTER = 69;

	/**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_RESOURCE_ADAPTER__PROPERTY = 0;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_RESOURCE_ADAPTER__NAME = 1;

	/**
     * The number of structural features of the '<em>JMS Resource Adapter</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_RESOURCE_ADAPTER_FEATURE_COUNT = 2;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSResponseImpl <em>JMS Response</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSResponseImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getJMSResponse()
     * @generated
     */
	int JMS_RESPONSE = 70;

	/**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_RESPONSE__WIRE_FORMAT = 0;

	/**
     * The feature id for the '<em><b>Destination</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_RESPONSE__DESTINATION = 1;

	/**
     * The feature id for the '<em><b>Connection Factory</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_RESPONSE__CONNECTION_FACTORY = 2;

	/**
     * The feature id for the '<em><b>Activation Spec</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_RESPONSE__ACTIVATION_SPEC = 3;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_RESPONSE__ANY = 4;

	/**
     * The number of structural features of the '<em>JMS Response</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JMS_RESPONSE_FEATURE_COUNT = 5;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.OperationImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getOperation()
     * @generated
     */
	int OPERATION = 71;

	/**
     * The feature id for the '<em><b>Interaction Spec</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int OPERATION__INTERACTION_SPEC = 0;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int OPERATION__ANY = 1;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int OPERATION__NAME = 2;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int OPERATION__ANY_ATTRIBUTE = 3;

	/**
     * The number of structural features of the '<em>Operation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int OPERATION_FEATURE_COUNT = 4;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.OperationSelectorTypeImpl <em>Operation Selector Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.OperationSelectorTypeImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getOperationSelectorType()
     * @generated
     */
	int OPERATION_SELECTOR_TYPE = 72;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int OPERATION_SELECTOR_TYPE__ANY = 0;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int OPERATION_SELECTOR_TYPE__ANY_ATTRIBUTE = 1;

	/**
     * The number of structural features of the '<em>Operation Selector Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int OPERATION_SELECTOR_TYPE_FEATURE_COUNT = 2;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.PolicySetImpl <em>Policy Set</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.PolicySetImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getPolicySet()
     * @generated
     */
	int POLICY_SET = 73;

	/**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_SET__GROUP = 0;

	/**
     * The feature id for the '<em><b>Policy Set Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_SET__POLICY_SET_REFERENCE = 1;

	/**
     * The feature id for the '<em><b>Intent Map</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_SET__INTENT_MAP = 2;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_SET__ANY = 3;

	/**
     * The feature id for the '<em><b>Applies To</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_SET__APPLIES_TO = 4;

	/**
     * The feature id for the '<em><b>Attach To</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_SET__ATTACH_TO = 5;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_SET__NAME = 6;

	/**
     * The feature id for the '<em><b>Provides</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_SET__PROVIDES = 7;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_SET__ANY_ATTRIBUTE = 8;

	/**
     * The number of structural features of the '<em>Policy Set</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_SET_FEATURE_COUNT = 9;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.PolicySetAttachmentImpl <em>Policy Set Attachment</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.PolicySetAttachmentImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getPolicySetAttachment()
     * @generated
     */
	int POLICY_SET_ATTACHMENT = 74;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_SET_ATTACHMENT__NAME = 0;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_SET_ATTACHMENT__ANY_ATTRIBUTE = 1;

	/**
     * The number of structural features of the '<em>Policy Set Attachment</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_SET_ATTACHMENT_FEATURE_COUNT = 2;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.PolicySetReferenceImpl <em>Policy Set Reference</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.PolicySetReferenceImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getPolicySetReference()
     * @generated
     */
	int POLICY_SET_REFERENCE = 75;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_SET_REFERENCE__NAME = 0;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_SET_REFERENCE__ANY_ATTRIBUTE = 1;

	/**
     * The number of structural features of the '<em>Policy Set Reference</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int POLICY_SET_REFERENCE_FEATURE_COUNT = 2;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.PropertyValueImpl <em>Property Value</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.PropertyValueImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getPropertyValue()
     * @generated
     */
	int PROPERTY_VALUE = 77;

	/**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY_VALUE__MIXED = SCA_PROPERTY_BASE__MIXED;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY_VALUE__ANY = SCA_PROPERTY_BASE__ANY;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY_VALUE__POLICY_SETS = SCA_PROPERTY_BASE__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY_VALUE__REQUIRES = SCA_PROPERTY_BASE__REQUIRES;

	/**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY_VALUE__VALUE = SCA_PROPERTY_BASE__VALUE;

    /**
     * The feature id for the '<em><b>Element</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY_VALUE__ELEMENT = SCA_PROPERTY_BASE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>File</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY_VALUE__FILE = SCA_PROPERTY_BASE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Many</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY_VALUE__MANY = SCA_PROPERTY_BASE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY_VALUE__NAME = SCA_PROPERTY_BASE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY_VALUE__SOURCE = SCA_PROPERTY_BASE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY_VALUE__TYPE = SCA_PROPERTY_BASE_FEATURE_COUNT + 5;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY_VALUE__ANY_ATTRIBUTE = SCA_PROPERTY_BASE_FEATURE_COUNT + 6;

	/**
     * The number of structural features of the '<em>Property Value</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY_VALUE_FEATURE_COUNT = SCA_PROPERTY_BASE_FEATURE_COUNT + 7;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.QualifierImpl <em>Qualifier</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.QualifierImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getQualifier()
     * @generated
     */
	int QUALIFIER = 78;

	/**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUALIFIER__GROUP = 0;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUALIFIER__ANY = 1;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUALIFIER__NAME = 2;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUALIFIER__ANY_ATTRIBUTE = 3;

	/**
     * The number of structural features of the '<em>Qualifier</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUALIFIER_FEATURE_COUNT = 4;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ReferenceImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getReference()
     * @generated
     */
	int REFERENCE = 79;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCE__DOCUMENTATION = CONTRACT__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCE__ANY_ATTRIBUTE = CONTRACT__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Interface Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCE__INTERFACE_GROUP = CONTRACT__INTERFACE_GROUP;

	/**
     * The feature id for the '<em><b>Interface</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCE__INTERFACE = CONTRACT__INTERFACE;

	/**
     * The feature id for the '<em><b>Binding Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCE__BINDING_GROUP = CONTRACT__BINDING_GROUP;

	/**
     * The feature id for the '<em><b>Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCE__BINDING = CONTRACT__BINDING;

	/**
     * The feature id for the '<em><b>Callback</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCE__CALLBACK = CONTRACT__CALLBACK;

	/**
     * The feature id for the '<em><b>Extensions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE__EXTENSIONS = CONTRACT__EXTENSIONS;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCE__ANY = CONTRACT__ANY;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCE__NAME = CONTRACT__NAME;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCE__POLICY_SETS = CONTRACT__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCE__REQUIRES = CONTRACT__REQUIRES;

	/**
     * The feature id for the '<em><b>Autowire</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCE__AUTOWIRE = CONTRACT_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCE__MULTIPLICITY = CONTRACT_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Target</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCE__TARGET = CONTRACT_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Wired By Impl</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCE__WIRED_BY_IMPL = CONTRACT_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Promote</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCE__PROMOTE = CONTRACT_FEATURE_COUNT + 4;

	/**
     * The number of structural features of the '<em>Reference</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFERENCE_FEATURE_COUNT = CONTRACT_FEATURE_COUNT + 5;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ResourceAdapterImpl <em>Resource Adapter</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ResourceAdapterImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getResourceAdapter()
     * @generated
     */
	int RESOURCE_ADAPTER = 80;

	/**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_ADAPTER__PROPERTY = 0;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_ADAPTER__ANY = 1;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_ADAPTER__NAME = 2;

	/**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_ADAPTER__TYPE = 3;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_ADAPTER__ANY_ATTRIBUTE = 4;

	/**
     * The number of structural features of the '<em>Resource Adapter</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_ADAPTER_FEATURE_COUNT = 5;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.SCABindingImpl <em>SCA Binding</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.SCABindingImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getSCABinding()
     * @generated
     */
	int SCA_BINDING = 81;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCA_BINDING__DOCUMENTATION = BINDING__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCA_BINDING__ANY_ATTRIBUTE = BINDING__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCA_BINDING__WIRE_FORMAT_GROUP = BINDING__WIRE_FORMAT_GROUP;

	/**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCA_BINDING__WIRE_FORMAT = BINDING__WIRE_FORMAT;

	/**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCA_BINDING__OPERATION_SELECTOR_GROUP = BINDING__OPERATION_SELECTOR_GROUP;

	/**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCA_BINDING__OPERATION_SELECTOR = BINDING__OPERATION_SELECTOR;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCA_BINDING__NAME = BINDING__NAME;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCA_BINDING__POLICY_SETS = BINDING__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCA_BINDING__REQUIRES = BINDING__REQUIRES;

	/**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCA_BINDING__URI = BINDING__URI;

	/**
     * The number of structural features of the '<em>SCA Binding</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCA_BINDING_FEATURE_COUNT = BINDING_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.SCAImplementationImpl <em>SCA Implementation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.SCAImplementationImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getSCAImplementation()
     * @generated
     */
	int SCA_IMPLEMENTATION = 82;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCA_IMPLEMENTATION__DOCUMENTATION = IMPLEMENTATION__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCA_IMPLEMENTATION__ANY_ATTRIBUTE = IMPLEMENTATION__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCA_IMPLEMENTATION__POLICY_SETS = IMPLEMENTATION__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCA_IMPLEMENTATION__REQUIRES = IMPLEMENTATION__REQUIRES;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCA_IMPLEMENTATION__ANY = IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCA_IMPLEMENTATION__NAME = IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>SCA Implementation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCA_IMPLEMENTATION_FEATURE_COUNT = IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ServiceImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getService()
     * @generated
     */
	int SERVICE = 84;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE__DOCUMENTATION = CONTRACT__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE__ANY_ATTRIBUTE = CONTRACT__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Interface Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE__INTERFACE_GROUP = CONTRACT__INTERFACE_GROUP;

	/**
     * The feature id for the '<em><b>Interface</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE__INTERFACE = CONTRACT__INTERFACE;

	/**
     * The feature id for the '<em><b>Binding Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE__BINDING_GROUP = CONTRACT__BINDING_GROUP;

	/**
     * The feature id for the '<em><b>Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE__BINDING = CONTRACT__BINDING;

	/**
     * The feature id for the '<em><b>Callback</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE__CALLBACK = CONTRACT__CALLBACK;

	/**
     * The feature id for the '<em><b>Extensions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE__EXTENSIONS = CONTRACT__EXTENSIONS;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE__ANY = CONTRACT__ANY;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE__NAME = CONTRACT__NAME;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE__POLICY_SETS = CONTRACT__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE__REQUIRES = CONTRACT__REQUIRES;

	/**
     * The feature id for the '<em><b>Promote</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE__PROMOTE = CONTRACT_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Service</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE_FEATURE_COUNT = CONTRACT_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.SpringImplementationImpl <em>Spring Implementation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.SpringImplementationImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getSpringImplementation()
     * @generated
     */
	int SPRING_IMPLEMENTATION = 85;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRING_IMPLEMENTATION__DOCUMENTATION = IMPLEMENTATION__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRING_IMPLEMENTATION__ANY_ATTRIBUTE = IMPLEMENTATION__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRING_IMPLEMENTATION__POLICY_SETS = IMPLEMENTATION__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRING_IMPLEMENTATION__REQUIRES = IMPLEMENTATION__REQUIRES;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRING_IMPLEMENTATION__ANY = IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRING_IMPLEMENTATION__LOCATION = IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Spring Implementation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRING_IMPLEMENTATION_FEATURE_COUNT = IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.TDefinitionsImpl <em>TDefinitions</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.TDefinitionsImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getTDefinitions()
     * @generated
     */
	int TDEFINITIONS = 86;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TDEFINITIONS__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TDEFINITIONS__ANY_ATTRIBUTE = COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TDEFINITIONS__GROUP = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Intent</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TDEFINITIONS__INTENT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Policy Set</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TDEFINITIONS__POLICY_SET = COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Binding Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TDEFINITIONS__BINDING_GROUP = COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TDEFINITIONS__BINDING = COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Binding Type</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TDEFINITIONS__BINDING_TYPE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 5;

	/**
     * The feature id for the '<em><b>Implementation Type</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TDEFINITIONS__IMPLEMENTATION_TYPE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 6;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TDEFINITIONS__ANY = COMMON_EXTENSION_BASE_FEATURE_COUNT + 7;

	/**
     * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TDEFINITIONS__TARGET_NAMESPACE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 8;

	/**
     * The number of structural features of the '<em>TDefinitions</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TDEFINITIONS_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 9;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ValueTypeImpl <em>Value Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ValueTypeImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getValueType()
     * @generated
     */
	int VALUE_TYPE = 87;

	/**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VALUE_TYPE__MIXED = 0;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VALUE_TYPE__ANY = 1;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VALUE_TYPE__ANY_ATTRIBUTE = 2;

	/**
     * The number of structural features of the '<em>Value Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VALUE_TYPE_FEATURE_COUNT = 3;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.WebImplementationImpl <em>Web Implementation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.WebImplementationImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getWebImplementation()
     * @generated
     */
	int WEB_IMPLEMENTATION = 88;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_IMPLEMENTATION__DOCUMENTATION = IMPLEMENTATION__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_IMPLEMENTATION__ANY_ATTRIBUTE = IMPLEMENTATION__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_IMPLEMENTATION__POLICY_SETS = IMPLEMENTATION__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_IMPLEMENTATION__REQUIRES = IMPLEMENTATION__REQUIRES;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_IMPLEMENTATION__ANY = IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Web Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_IMPLEMENTATION__WEB_URI = IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Any Attribute1</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_IMPLEMENTATION__ANY_ATTRIBUTE1 = IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
     * The number of structural features of the '<em>Web Implementation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_IMPLEMENTATION_FEATURE_COUNT = IMPLEMENTATION_FEATURE_COUNT + 3;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.WebServiceBindingImpl <em>Web Service Binding</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.WebServiceBindingImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getWebServiceBinding()
     * @generated
     */
	int WEB_SERVICE_BINDING = 89;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_SERVICE_BINDING__DOCUMENTATION = BINDING__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_SERVICE_BINDING__ANY_ATTRIBUTE = BINDING__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_SERVICE_BINDING__WIRE_FORMAT_GROUP = BINDING__WIRE_FORMAT_GROUP;

	/**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_SERVICE_BINDING__WIRE_FORMAT = BINDING__WIRE_FORMAT;

	/**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_SERVICE_BINDING__OPERATION_SELECTOR_GROUP = BINDING__OPERATION_SELECTOR_GROUP;

	/**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_SERVICE_BINDING__OPERATION_SELECTOR = BINDING__OPERATION_SELECTOR;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_SERVICE_BINDING__NAME = BINDING__NAME;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_SERVICE_BINDING__POLICY_SETS = BINDING__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_SERVICE_BINDING__REQUIRES = BINDING__REQUIRES;

	/**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_SERVICE_BINDING__URI = BINDING__URI;

	/**
     * The feature id for the '<em><b>Endpoint Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_SERVICE_BINDING__ENDPOINT_REFERENCE = BINDING_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_SERVICE_BINDING__ANY = BINDING_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Wsdl Element</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_SERVICE_BINDING__WSDL_ELEMENT = BINDING_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Wsdl Location</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_SERVICE_BINDING__WSDL_LOCATION = BINDING_FEATURE_COUNT + 3;

	/**
     * The number of structural features of the '<em>Web Service Binding</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_SERVICE_BINDING_FEATURE_COUNT = BINDING_FEATURE_COUNT + 4;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.WireImpl <em>Wire</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.WireImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getWire()
     * @generated
     */
	int WIRE = 90;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WIRE__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WIRE__ANY_ATTRIBUTE = COMMON_EXTENSION_BASE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WIRE__ANY = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Replace</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WIRE__REPLACE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WIRE__SOURCE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Target</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WIRE__TARGET = COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Source2</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WIRE__SOURCE2 = COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Target2</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WIRE__TARGET2 = COMMON_EXTENSION_BASE_FEATURE_COUNT + 5;

	/**
     * The number of structural features of the '<em>Wire</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WIRE_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 6;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.WireFormatTypeImpl <em>Wire Format Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.WireFormatTypeImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getWireFormatType()
     * @generated
     */
	int WIRE_FORMAT_TYPE = 91;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WIRE_FORMAT_TYPE__ANY = 0;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WIRE_FORMAT_TYPE__ANY_ATTRIBUTE = 1;

	/**
     * The number of structural features of the '<em>Wire Format Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WIRE_FORMAT_TYPE_FEATURE_COUNT = 2;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.WSCallbackTypeImpl <em>WS Callback Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.WSCallbackTypeImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getWSCallbackType()
     * @generated
     */
	int WS_CALLBACK_TYPE = 92;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WS_CALLBACK_TYPE__ANY = 0;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WS_CALLBACK_TYPE__ANY_ATTRIBUTE = 1;

	/**
     * The number of structural features of the '<em>WS Callback Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WS_CALLBACK_TYPE_FEATURE_COUNT = 2;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.WSDLPortTypeImpl <em>WSDL Port Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.WSDLPortTypeImpl
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getWSDLPortType()
     * @generated
     */
	int WSDL_PORT_TYPE = 93;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WSDL_PORT_TYPE__DOCUMENTATION = INTERFACE__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WSDL_PORT_TYPE__ANY_ATTRIBUTE = INTERFACE__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WSDL_PORT_TYPE__POLICY_SETS = INTERFACE__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Remotable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WSDL_PORT_TYPE__REMOTABLE = INTERFACE__REMOTABLE;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WSDL_PORT_TYPE__REQUIRES = INTERFACE__REQUIRES;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WSDL_PORT_TYPE__ANY = INTERFACE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Callback Interface</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WSDL_PORT_TYPE__CALLBACK_INTERFACE = INTERFACE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Interface</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WSDL_PORT_TYPE__INTERFACE = INTERFACE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Any Attribute1</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WSDL_PORT_TYPE__ANY_ATTRIBUTE1 = INTERFACE_FEATURE_COUNT + 3;

	/**
     * The number of structural features of the '<em>WSDL Port Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WSDL_PORT_TYPE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 4;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.ExtendableType <em>Extendable Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ExtendableType
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getExtendableType()
     * @generated
     */
    int EXTENDABLE_TYPE = 94;

    /**
     * The number of structural features of the '<em>Extendable Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDABLE_TYPE_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationScope <em>CImplementation Scope</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementationScope
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getCImplementationScope()
     * @generated
     */
	int CIMPLEMENTATION_SCOPE = 95;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationScope <em>CPP Implementation Scope</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationScope
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getCPPImplementationScope()
     * @generated
     */
	int CPP_IMPLEMENTATION_SCOPE = 96;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.CreateResource <em>Create Resource</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CreateResource
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getCreateResource()
     * @generated
     */
	int CREATE_RESOURCE = 97;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.DeliveryModeType <em>Delivery Mode Type</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DeliveryModeType
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getDeliveryModeType()
     * @generated
     */
	int DELIVERY_MODE_TYPE = 98;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.InteractionOrImplementation <em>Interaction Or Implementation</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.InteractionOrImplementation
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getInteractionOrImplementation()
     * @generated
     */
	int INTERACTION_OR_IMPLEMENTATION = 99;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCACreateResource <em>JCA Create Resource</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCACreateResource
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getJCACreateResource()
     * @generated
     */
	int JCA_CREATE_RESOURCE = 100;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSCreateResource <em>JMS Create Resource</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSCreateResource
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getJMSCreateResource()
     * @generated
     */
	int JMS_CREATE_RESOURCE = 101;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.Multiplicity <em>Multiplicity</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Multiplicity
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getMultiplicity()
     * @generated
     */
	int MULTIPLICITY = 102;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.OverrideOptions <em>Override Options</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.OverrideOptions
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getOverrideOptions()
     * @generated
     */
	int OVERRIDE_OPTIONS = 103;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.PriorityType <em>Priority Type</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PriorityType
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getPriorityType()
     * @generated
     */
	int PRIORITY_TYPE = 104;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.ResAuth <em>Res Auth</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ResAuth
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getResAuth()
     * @generated
     */
	int RES_AUTH = 105;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.TypeType <em>Type Type</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.TypeType
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getTypeType()
     * @generated
     */
	int TYPE_TYPE = 106;

	/**
     * The meta object id for the '{@link org.eclipse.soa.sca.sca1_1.model.sca.VersionValue <em>Version Value</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.VersionValue
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getVersionValue()
     * @generated
     */
	int VERSION_VALUE = 107;

	/**
     * The meta object id for the '<em>CImplementation Scope Object</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementationScope
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getCImplementationScopeObject()
     * @generated
     */
	int CIMPLEMENTATION_SCOPE_OBJECT = 108;

	/**
     * The meta object id for the '<em>CPP Implementation Scope Object</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationScope
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getCPPImplementationScopeObject()
     * @generated
     */
	int CPP_IMPLEMENTATION_SCOPE_OBJECT = 109;

	/**
     * The meta object id for the '<em>Create Resource Object</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CreateResource
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getCreateResourceObject()
     * @generated
     */
	int CREATE_RESOURCE_OBJECT = 110;

	/**
     * The meta object id for the '<em>Delivery Mode Type Object</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DeliveryModeType
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getDeliveryModeTypeObject()
     * @generated
     */
	int DELIVERY_MODE_TYPE_OBJECT = 111;

	/**
     * The meta object id for the '<em>Interaction Or Implementation Object</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.InteractionOrImplementation
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getInteractionOrImplementationObject()
     * @generated
     */
	int INTERACTION_OR_IMPLEMENTATION_OBJECT = 112;

	/**
     * The meta object id for the '<em>JCA Create Resource Object</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCACreateResource
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getJCACreateResourceObject()
     * @generated
     */
	int JCA_CREATE_RESOURCE_OBJECT = 113;

	/**
     * The meta object id for the '<em>JMS Create Resource Object</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSCreateResource
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getJMSCreateResourceObject()
     * @generated
     */
	int JMS_CREATE_RESOURCE_OBJECT = 114;

	/**
     * The meta object id for the '<em>List Of Any UR Is</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getListOfAnyURIs()
     * @generated
     */
	int LIST_OF_ANY_UR_IS = 115;

	/**
     * The meta object id for the '<em>List Of NC Names</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getListOfNCNames()
     * @generated
     */
	int LIST_OF_NC_NAMES = 116;

	/**
     * The meta object id for the '<em>List Of QNames</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getListOfQNames()
     * @generated
     */
	int LIST_OF_QNAMES = 117;

	/**
     * The meta object id for the '<em>Multiplicity Object</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Multiplicity
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getMultiplicityObject()
     * @generated
     */
	int MULTIPLICITY_OBJECT = 118;

	/**
     * The meta object id for the '<em>Override Options Object</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.OverrideOptions
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getOverrideOptionsObject()
     * @generated
     */
	int OVERRIDE_OPTIONS_OBJECT = 119;

	/**
     * The meta object id for the '<em>Priority Type Object</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PriorityType
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getPriorityTypeObject()
     * @generated
     */
	int PRIORITY_TYPE_OBJECT = 120;

	/**
     * The meta object id for the '<em>Res Auth Object</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ResAuth
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getResAuthObject()
     * @generated
     */
	int RES_AUTH_OBJECT = 121;

	/**
     * The meta object id for the '<em>Type Type Object</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.TypeType
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getTypeTypeObject()
     * @generated
     */
	int TYPE_TYPE_OBJECT = 122;

	/**
     * The meta object id for the '<em>Version Value Object</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.soa.sca.sca1_1.model.sca.VersionValue
     * @see org.eclipse.soa.sca.sca1_1.model.sca.impl.ScaPackageImpl#getVersionValueObject()
     * @generated
     */
	int VERSION_VALUE_OBJECT = 123;


	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ActivationSpec <em>Activation Spec</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Activation Spec</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ActivationSpec
     * @generated
     */
	EClass getActivationSpec();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ActivationSpec#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ActivationSpec#getProperty()
     * @see #getActivationSpec()
     * @generated
     */
	EReference getActivationSpec_Property();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ActivationSpec#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ActivationSpec#getAny()
     * @see #getActivationSpec()
     * @generated
     */
	EAttribute getActivationSpec_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.ActivationSpec#getCreate <em>Create</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Create</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ActivationSpec#getCreate()
     * @see #getActivationSpec()
     * @generated
     */
	EAttribute getActivationSpec_Create();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.ActivationSpec#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ActivationSpec#getName()
     * @see #getActivationSpec()
     * @generated
     */
	EAttribute getActivationSpec_Name();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.ActivationSpec#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ActivationSpec#getType()
     * @see #getActivationSpec()
     * @generated
     */
	EAttribute getActivationSpec_Type();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ActivationSpec#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ActivationSpec#getAnyAttribute()
     * @see #getActivationSpec()
     * @generated
     */
	EAttribute getActivationSpec_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Binding <em>Binding</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Binding</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Binding
     * @generated
     */
	EClass getBinding();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Binding#getWireFormatGroup <em>Wire Format Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Wire Format Group</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Binding#getWireFormatGroup()
     * @see #getBinding()
     * @generated
     */
	EAttribute getBinding_WireFormatGroup();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.Binding#getWireFormat <em>Wire Format</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Wire Format</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Binding#getWireFormat()
     * @see #getBinding()
     * @generated
     */
	EReference getBinding_WireFormat();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Binding#getOperationSelectorGroup <em>Operation Selector Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Operation Selector Group</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Binding#getOperationSelectorGroup()
     * @see #getBinding()
     * @generated
     */
	EAttribute getBinding_OperationSelectorGroup();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.Binding#getOperationSelector <em>Operation Selector</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operation Selector</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Binding#getOperationSelector()
     * @see #getBinding()
     * @generated
     */
	EReference getBinding_OperationSelector();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Binding#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Binding#getName()
     * @see #getBinding()
     * @generated
     */
	EAttribute getBinding_Name();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Binding#getPolicySets <em>Policy Sets</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Policy Sets</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Binding#getPolicySets()
     * @see #getBinding()
     * @generated
     */
	EAttribute getBinding_PolicySets();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Binding#getRequires <em>Requires</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Requires</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Binding#getRequires()
     * @see #getBinding()
     * @generated
     */
	EAttribute getBinding_Requires();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Binding#getUri <em>Uri</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uri</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Binding#getUri()
     * @see #getBinding()
     * @generated
     */
	EAttribute getBinding_Uri();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.BindingProperty <em>Binding Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Binding Property</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.BindingProperty
     * @generated
     */
	EClass getBindingProperty();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.BindingProperty#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.BindingProperty#getValue()
     * @see #getBindingProperty()
     * @generated
     */
	EAttribute getBindingProperty_Value();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.BindingProperty#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.BindingProperty#getName()
     * @see #getBindingProperty()
     * @generated
     */
	EAttribute getBindingProperty_Name();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.BindingProperty#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.BindingProperty#getType()
     * @see #getBindingProperty()
     * @generated
     */
	EAttribute getBindingProperty_Type();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.BindingType <em>Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Binding Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.BindingType
     * @generated
     */
	EClass getBindingType();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.BindingType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.BindingType#getAny()
     * @see #getBindingType()
     * @generated
     */
	EAttribute getBindingType_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.BindingType#getAlwaysProvides <em>Always Provides</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Always Provides</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.BindingType#getAlwaysProvides()
     * @see #getBindingType()
     * @generated
     */
	EAttribute getBindingType_AlwaysProvides();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.BindingType#getMayProvide <em>May Provide</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>May Provide</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.BindingType#getMayProvide()
     * @see #getBindingType()
     * @generated
     */
	EAttribute getBindingType_MayProvide();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.BindingType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.BindingType#getType()
     * @see #getBindingType()
     * @generated
     */
	EAttribute getBindingType_Type();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.BPELImplementation <em>BPEL Implementation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>BPEL Implementation</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.BPELImplementation
     * @generated
     */
	EClass getBPELImplementation();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.BPELImplementation#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.BPELImplementation#getAny()
     * @see #getBPELImplementation()
     * @generated
     */
	EAttribute getBPELImplementation_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.BPELImplementation#getProcess <em>Process</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Process</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.BPELImplementation#getProcess()
     * @see #getBPELImplementation()
     * @generated
     */
	EAttribute getBPELImplementation_Process();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.BPELImplementation#getAnyAttribute1 <em>Any Attribute1</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute1</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.BPELImplementation#getAnyAttribute1()
     * @see #getBPELImplementation()
     * @generated
     */
	EAttribute getBPELImplementation_AnyAttribute1();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Callback <em>Callback</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Callback</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Callback
     * @generated
     */
	EClass getCallback();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Callback#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Callback#getGroup()
     * @see #getCallback()
     * @generated
     */
	EAttribute getCallback_Group();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Callback#getBindingGroup <em>Binding Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Binding Group</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Callback#getBindingGroup()
     * @see #getCallback()
     * @generated
     */
	EAttribute getCallback_BindingGroup();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Callback#getBinding <em>Binding</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Binding</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Callback#getBinding()
     * @see #getCallback()
     * @generated
     */
	EReference getCallback_Binding();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Callback#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Callback#getAny()
     * @see #getCallback()
     * @generated
     */
	EAttribute getCallback_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Callback#getPolicySets <em>Policy Sets</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Policy Sets</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Callback#getPolicySets()
     * @see #getCallback()
     * @generated
     */
	EAttribute getCallback_PolicySets();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Callback#getRequires <em>Requires</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Requires</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Callback#getRequires()
     * @see #getCallback()
     * @generated
     */
	EAttribute getCallback_Requires();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CExport <em>CExport</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>CExport</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CExport
     * @generated
     */
	EClass getCExport();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CExport#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CExport#getName()
     * @see #getCExport()
     * @generated
     */
	EAttribute getCExport_Name();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CExport#getPath <em>Path</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Path</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CExport#getPath()
     * @see #getCExport()
     * @generated
     */
	EAttribute getCExport_Path();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CFunction <em>CFunction</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>CFunction</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CFunction
     * @generated
     */
	EClass getCFunction();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CFunction#getInput <em>Input</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CFunction#getInput()
     * @see #getCFunction()
     * @generated
     */
	EAttribute getCFunction_Input();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CFunction#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CFunction#getName()
     * @see #getCFunction()
     * @generated
     */
	EAttribute getCFunction_Name();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CFunction#isOneWay <em>One Way</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>One Way</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CFunction#isOneWay()
     * @see #getCFunction()
     * @generated
     */
	EAttribute getCFunction_OneWay();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CFunction#getOutput <em>Output</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CFunction#getOutput()
     * @see #getCFunction()
     * @generated
     */
	EAttribute getCFunction_Output();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CFunction#getRequires <em>Requires</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Requires</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CFunction#getRequires()
     * @see #getCFunction()
     * @generated
     */
	EAttribute getCFunction_Requires();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.CFunction#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CFunction#getAnyAttribute()
     * @see #getCFunction()
     * @generated
     */
	EAttribute getCFunction_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation <em>CImplementation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>CImplementation</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementation
     * @generated
     */
	EClass getCImplementation();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getOperation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Operation</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getOperation()
     * @see #getCImplementation()
     * @generated
     */
	EReference getCImplementation_Operation();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getAny()
     * @see #getCImplementation()
     * @generated
     */
	EAttribute getCImplementation_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isAllowsPassByReference <em>Allows Pass By Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Allows Pass By Reference</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isAllowsPassByReference()
     * @see #getCImplementation()
     * @generated
     */
	EAttribute getCImplementation_AllowsPassByReference();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getComponentType <em>Component Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Component Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getComponentType()
     * @see #getCImplementation()
     * @generated
     */
	EAttribute getCImplementation_ComponentType();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isDestoy <em>Destoy</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Destoy</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isDestoy()
     * @see #getCImplementation()
     * @generated
     */
	EAttribute getCImplementation_Destoy();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isEagerInit <em>Eager Init</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Eager Init</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isEagerInit()
     * @see #getCImplementation()
     * @generated
     */
	EAttribute getCImplementation_EagerInit();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isInit <em>Init</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Init</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isInit()
     * @see #getCImplementation()
     * @generated
     */
	EAttribute getCImplementation_Init();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isLibrary <em>Library</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Library</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#isLibrary()
     * @see #getCImplementation()
     * @generated
     */
	EAttribute getCImplementation_Library();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getModule <em>Module</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Module</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getModule()
     * @see #getCImplementation()
     * @generated
     */
	EAttribute getCImplementation_Module();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getPath <em>Path</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Path</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getPath()
     * @see #getCImplementation()
     * @generated
     */
	EAttribute getCImplementation_Path();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getScope <em>Scope</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scope</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getScope()
     * @see #getCImplementation()
     * @generated
     */
	EAttribute getCImplementation_Scope();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getAnyAttribute1 <em>Any Attribute1</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute1</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementation#getAnyAttribute1()
     * @see #getCImplementation()
     * @generated
     */
	EAttribute getCImplementation_AnyAttribute1();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction <em>CImplementation Function</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>CImplementation Function</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction
     * @generated
     */
	EClass getCImplementationFunction();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#isAllowsPassByReference <em>Allows Pass By Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Allows Pass By Reference</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#isAllowsPassByReference()
     * @see #getCImplementationFunction()
     * @generated
     */
	EAttribute getCImplementationFunction_AllowsPassByReference();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#isDestoy <em>Destoy</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Destoy</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#isDestoy()
     * @see #getCImplementationFunction()
     * @generated
     */
	EAttribute getCImplementationFunction_Destoy();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#isInit <em>Init</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Init</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#isInit()
     * @see #getCImplementationFunction()
     * @generated
     */
	EAttribute getCImplementationFunction_Init();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#getName()
     * @see #getCImplementationFunction()
     * @generated
     */
	EAttribute getCImplementationFunction_Name();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction#getAnyAttribute()
     * @see #getCImplementationFunction()
     * @generated
     */
	EAttribute getCImplementationFunction_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImport <em>CImport</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>CImport</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImport
     * @generated
     */
	EClass getCImport();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImport#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Location</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImport#getLocation()
     * @see #getCImport()
     * @generated
     */
	EAttribute getCImport_Location();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImport#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImport#getName()
     * @see #getCImport()
     * @generated
     */
	EAttribute getCImport_Name();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CInterface <em>CInterface</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>CInterface</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CInterface
     * @generated
     */
	EClass getCInterface();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.CInterface#getFunction <em>Function</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Function</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CInterface#getFunction()
     * @see #getCInterface()
     * @generated
     */
	EReference getCInterface_Function();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.CInterface#getCallbackFunction <em>Callback Function</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Callback Function</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CInterface#getCallbackFunction()
     * @see #getCInterface()
     * @generated
     */
	EReference getCInterface_CallbackFunction();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.CInterface#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CInterface#getAny()
     * @see #getCInterface()
     * @generated
     */
	EAttribute getCInterface_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CInterface#getCallbackHeader <em>Callback Header</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Callback Header</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CInterface#getCallbackHeader()
     * @see #getCInterface()
     * @generated
     */
	EAttribute getCInterface_CallbackHeader();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CInterface#getHeader <em>Header</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Header</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CInterface#getHeader()
     * @see #getCInterface()
     * @generated
     */
	EAttribute getCInterface_Header();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.CInterface#getAnyAttribute1 <em>Any Attribute1</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute1</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CInterface#getAnyAttribute1()
     * @see #getCInterface()
     * @generated
     */
	EAttribute getCInterface_AnyAttribute1();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase <em>Common Extension Base</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Common Extension Base</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase
     * @generated
     */
	EClass getCommonExtensionBase();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Documentation</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase#getDocumentation()
     * @see #getCommonExtensionBase()
     * @generated
     */
	EReference getCommonExtensionBase_Documentation();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase#getAnyAttribute()
     * @see #getCommonExtensionBase()
     * @generated
     */
	EAttribute getCommonExtensionBase_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Component <em>Component</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Component
     * @generated
     */
	EClass getComponent();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Component#getImplementationGroup <em>Implementation Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Implementation Group</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Component#getImplementationGroup()
     * @see #getComponent()
     * @generated
     */
	EAttribute getComponent_ImplementationGroup();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.Component#getImplementation <em>Implementation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Implementation</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Component#getImplementation()
     * @see #getComponent()
     * @generated
     */
	EReference getComponent_Implementation();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Component#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Component#getGroup()
     * @see #getComponent()
     * @generated
     */
	EAttribute getComponent_Group();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Component#getService <em>Service</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Component#getService()
     * @see #getComponent()
     * @generated
     */
	EReference getComponent_Service();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Component#getReference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Reference</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Component#getReference()
     * @see #getComponent()
     * @generated
     */
	EReference getComponent_Reference();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Component#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Component#getProperty()
     * @see #getComponent()
     * @generated
     */
	EReference getComponent_Property();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Component#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Component#getAny()
     * @see #getComponent()
     * @generated
     */
	EAttribute getComponent_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Component#isAutowire <em>Autowire</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Autowire</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Component#isAutowire()
     * @see #getComponent()
     * @generated
     */
	EAttribute getComponent_Autowire();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Component#getConstrainingType <em>Constraining Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Constraining Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Component#getConstrainingType()
     * @see #getComponent()
     * @generated
     */
	EAttribute getComponent_ConstrainingType();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Component#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Component#getName()
     * @see #getComponent()
     * @generated
     */
	EAttribute getComponent_Name();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Component#getPolicySets <em>Policy Sets</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Policy Sets</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Component#getPolicySets()
     * @see #getComponent()
     * @generated
     */
	EAttribute getComponent_PolicySets();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Component#getRequires <em>Requires</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Requires</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Component#getRequires()
     * @see #getComponent()
     * @generated
     */
	EAttribute getComponent_Requires();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference <em>Component Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component Reference</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference
     * @generated
     */
	EClass getComponentReference();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference#isAutowire <em>Autowire</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Autowire</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference#isAutowire()
     * @see #getComponentReference()
     * @generated
     */
	EAttribute getComponentReference_Autowire();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference#getMultiplicity <em>Multiplicity</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Multiplicity</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference#getMultiplicity()
     * @see #getComponentReference()
     * @generated
     */
	EAttribute getComponentReference_Multiplicity();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference#isNonOverridable <em>Non Overridable</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Non Overridable</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference#isNonOverridable()
     * @see #getComponentReference()
     * @generated
     */
	EAttribute getComponentReference_NonOverridable();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference#isWiredByImpl <em>Wired By Impl</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Wired By Impl</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference#isWiredByImpl()
     * @see #getComponentReference()
     * @generated
     */
	EAttribute getComponentReference_WiredByImpl();

	/**
     * Returns the meta object for the reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Target</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference#getTarget()
     * @see #getComponentReference()
     * @generated
     */
	EReference getComponentReference_Target();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference#getId()
     * @see #getComponentReference()
     * @generated
     */
	EAttribute getComponentReference_Id();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ComponentService <em>Component Service</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component Service</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ComponentService
     * @generated
     */
	EClass getComponentService();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.ComponentService#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ComponentService#getId()
     * @see #getComponentService()
     * @generated
     */
	EAttribute getComponentService_Id();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ComponentType <em>Component Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ComponentType
     * @generated
     */
	EClass getComponentType();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ComponentType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ComponentType#getGroup()
     * @see #getComponentType()
     * @generated
     */
	EAttribute getComponentType_Group();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ComponentType#getService <em>Service</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ComponentType#getService()
     * @see #getComponentType()
     * @generated
     */
	EReference getComponentType_Service();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ComponentType#getReference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Reference</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ComponentType#getReference()
     * @see #getComponentType()
     * @generated
     */
	EReference getComponentType_Reference();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ComponentType#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ComponentType#getProperty()
     * @see #getComponentType()
     * @generated
     */
	EReference getComponentType_Property();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ComponentType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ComponentType#getAny()
     * @see #getComponentType()
     * @generated
     */
	EAttribute getComponentType_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.ComponentType#getConstrainingType <em>Constraining Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Constraining Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ComponentType#getConstrainingType()
     * @see #getComponentType()
     * @generated
     */
	EAttribute getComponentType_ConstrainingType();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ComponentTypeReference <em>Component Type Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component Type Reference</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ComponentTypeReference
     * @generated
     */
	EClass getComponentTypeReference();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite <em>Composite</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Composite</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Composite
     * @generated
     */
	EClass getComposite();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getInclude <em>Include</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Include</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Composite#getInclude()
     * @see #getComposite()
     * @generated
     */
	EReference getComposite_Include();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Composite#getGroup()
     * @see #getComposite()
     * @generated
     */
	EAttribute getComposite_Group();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getService <em>Service</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Composite#getService()
     * @see #getComposite()
     * @generated
     */
	EReference getComposite_Service();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Composite#getProperty()
     * @see #getComposite()
     * @generated
     */
	EReference getComposite_Property();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getComponent <em>Component</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Component</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Composite#getComponent()
     * @see #getComposite()
     * @generated
     */
	EReference getComposite_Component();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getReference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Reference</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Composite#getReference()
     * @see #getComposite()
     * @generated
     */
	EReference getComposite_Reference();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getWire <em>Wire</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Wire</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Composite#getWire()
     * @see #getComposite()
     * @generated
     */
	EReference getComposite_Wire();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Composite#getAny()
     * @see #getComposite()
     * @generated
     */
	EAttribute getComposite_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#isAutowire <em>Autowire</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Autowire</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Composite#isAutowire()
     * @see #getComposite()
     * @generated
     */
	EAttribute getComposite_Autowire();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getConstrainingType <em>Constraining Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Constraining Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Composite#getConstrainingType()
     * @see #getComposite()
     * @generated
     */
	EAttribute getComposite_ConstrainingType();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#isLocal <em>Local</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Composite#isLocal()
     * @see #getComposite()
     * @generated
     */
	EAttribute getComposite_Local();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Composite#getName()
     * @see #getComposite()
     * @generated
     */
	EAttribute getComposite_Name();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getPolicySets <em>Policy Sets</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Policy Sets</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Composite#getPolicySets()
     * @see #getComposite()
     * @generated
     */
	EAttribute getComposite_PolicySets();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getRequires <em>Requires</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Requires</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Composite#getRequires()
     * @see #getComposite()
     * @generated
     */
	EAttribute getComposite_Requires();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Composite#getTargetNamespace <em>Target Namespace</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Namespace</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Composite#getTargetNamespace()
     * @see #getComposite()
     * @generated
     */
	EAttribute getComposite_TargetNamespace();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Connection <em>Connection</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connection</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Connection
     * @generated
     */
	EClass getConnection();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Connection#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Connection#getProperty()
     * @see #getConnection()
     * @generated
     */
	EReference getConnection_Property();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Connection#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Connection#getAny()
     * @see #getConnection()
     * @generated
     */
	EAttribute getConnection_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Connection#getCreate <em>Create</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Create</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Connection#getCreate()
     * @see #getConnection()
     * @generated
     */
	EAttribute getConnection_Create();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Connection#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Connection#getName()
     * @see #getConnection()
     * @generated
     */
	EAttribute getConnection_Name();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Connection#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Connection#getType()
     * @see #getConnection()
     * @generated
     */
	EAttribute getConnection_Type();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Connection#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Connection#getAnyAttribute()
     * @see #getConnection()
     * @generated
     */
	EAttribute getConnection_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ConnectionSpec <em>Connection Spec</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connection Spec</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ConnectionSpec
     * @generated
     */
	EClass getConnectionSpec();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ConnectionSpec#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ConnectionSpec#getProperty()
     * @see #getConnectionSpec()
     * @generated
     */
	EReference getConnectionSpec_Property();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ConnectionSpec#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ConnectionSpec#getAny()
     * @see #getConnectionSpec()
     * @generated
     */
	EAttribute getConnectionSpec_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.ConnectionSpec#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ConnectionSpec#getType()
     * @see #getConnectionSpec()
     * @generated
     */
	EAttribute getConnectionSpec_Type();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ConnectionSpec#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ConnectionSpec#getAnyAttribute()
     * @see #getConnectionSpec()
     * @generated
     */
	EAttribute getConnectionSpec_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingProperty <em>Constraining Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Constraining Property</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingProperty
     * @generated
     */
	EClass getConstrainingProperty();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingReference <em>Constraining Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Constraining Reference</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingReference
     * @generated
     */
	EClass getConstrainingReference();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingService <em>Constraining Service</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Constraining Service</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingService
     * @generated
     */
	EClass getConstrainingService();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingType <em>Constraining Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Constraining Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingType
     * @generated
     */
	EClass getConstrainingType();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingType#getGroup()
     * @see #getConstrainingType()
     * @generated
     */
	EAttribute getConstrainingType_Group();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingType#getService <em>Service</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingType#getService()
     * @see #getConstrainingType()
     * @generated
     */
	EReference getConstrainingType_Service();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingType#getReference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Reference</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingType#getReference()
     * @see #getConstrainingType()
     * @generated
     */
	EReference getConstrainingType_Reference();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingType#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingType#getProperty()
     * @see #getConstrainingType()
     * @generated
     */
	EReference getConstrainingType_Property();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingType#getAny()
     * @see #getConstrainingType()
     * @generated
     */
	EAttribute getConstrainingType_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingType#getName()
     * @see #getConstrainingType()
     * @generated
     */
	EAttribute getConstrainingType_Name();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingType#getTargetNamespace <em>Target Namespace</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Namespace</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingType#getTargetNamespace()
     * @see #getConstrainingType()
     * @generated
     */
	EAttribute getConstrainingType_TargetNamespace();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract <em>Contract</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Contract</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Contract
     * @generated
     */
	EClass getContract();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract#getInterfaceGroup <em>Interface Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Interface Group</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Contract#getInterfaceGroup()
     * @see #getContract()
     * @generated
     */
	EAttribute getContract_InterfaceGroup();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract#getInterface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Interface</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Contract#getInterface()
     * @see #getContract()
     * @generated
     */
	EReference getContract_Interface();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract#getBindingGroup <em>Binding Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Binding Group</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Contract#getBindingGroup()
     * @see #getContract()
     * @generated
     */
	EAttribute getContract_BindingGroup();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract#getBinding <em>Binding</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Binding</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Contract#getBinding()
     * @see #getContract()
     * @generated
     */
	EReference getContract_Binding();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract#getCallback <em>Callback</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Callback</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Contract#getCallback()
     * @see #getContract()
     * @generated
     */
	EReference getContract_Callback();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract#getExtensions <em>Extensions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Extensions</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Contract#getExtensions()
     * @see #getContract()
     * @generated
     */
    EReference getContract_Extensions();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Contract#getAny()
     * @see #getContract()
     * @generated
     */
	EAttribute getContract_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Contract#getName()
     * @see #getContract()
     * @generated
     */
	EAttribute getContract_Name();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract#getPolicySets <em>Policy Sets</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Policy Sets</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Contract#getPolicySets()
     * @see #getContract()
     * @generated
     */
	EAttribute getContract_PolicySets();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Contract#getRequires <em>Requires</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Requires</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Contract#getRequires()
     * @see #getContract()
     * @generated
     */
	EAttribute getContract_Requires();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ContributionType <em>Contribution Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Contribution Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ContributionType
     * @generated
     */
	EClass getContributionType();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ContributionType#getDeployable <em>Deployable</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Deployable</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ContributionType#getDeployable()
     * @see #getContributionType()
     * @generated
     */
	EReference getContributionType_Deployable();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ContributionType#getImportBaseGroup <em>Import Base Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Import Base Group</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ContributionType#getImportBaseGroup()
     * @see #getContributionType()
     * @generated
     */
	EAttribute getContributionType_ImportBaseGroup();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ContributionType#getImportBase <em>Import Base</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Import Base</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ContributionType#getImportBase()
     * @see #getContributionType()
     * @generated
     */
	EReference getContributionType_ImportBase();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ContributionType#getExportBaseGroup <em>Export Base Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Export Base Group</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ContributionType#getExportBaseGroup()
     * @see #getContributionType()
     * @generated
     */
	EAttribute getContributionType_ExportBaseGroup();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ContributionType#getExportBase <em>Export Base</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Export Base</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ContributionType#getExportBase()
     * @see #getContributionType()
     * @generated
     */
	EReference getContributionType_ExportBase();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ContributionType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ContributionType#getAny()
     * @see #getContributionType()
     * @generated
     */
	EAttribute getContributionType_Any();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPExport <em>CPP Export</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>CPP Export</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPExport
     * @generated
     */
	EClass getCPPExport();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPExport#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPExport#getName()
     * @see #getCPPExport()
     * @generated
     */
	EAttribute getCPPExport_Name();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPExport#getPath <em>Path</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Path</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPExport#getPath()
     * @see #getCPPExport()
     * @generated
     */
	EAttribute getCPPExport_Path();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPFunction <em>CPP Function</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>CPP Function</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPFunction
     * @generated
     */
	EClass getCPPFunction();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPFunction#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPFunction#getName()
     * @see #getCPPFunction()
     * @generated
     */
	EAttribute getCPPFunction_Name();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPFunction#isOneWay <em>One Way</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>One Way</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPFunction#isOneWay()
     * @see #getCPPFunction()
     * @generated
     */
	EAttribute getCPPFunction_OneWay();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPFunction#getRequires <em>Requires</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Requires</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPFunction#getRequires()
     * @see #getCPPFunction()
     * @generated
     */
	EAttribute getCPPFunction_Requires();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPFunction#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPFunction#getAnyAttribute()
     * @see #getCPPFunction()
     * @generated
     */
	EAttribute getCPPFunction_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation <em>CPP Implementation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>CPP Implementation</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation
     * @generated
     */
	EClass getCPPImplementation();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getFunction <em>Function</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Function</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getFunction()
     * @see #getCPPImplementation()
     * @generated
     */
	EReference getCPPImplementation_Function();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getAny()
     * @see #getCPPImplementation()
     * @generated
     */
	EAttribute getCPPImplementation_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#isAllowsPassByReference <em>Allows Pass By Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Allows Pass By Reference</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#isAllowsPassByReference()
     * @see #getCPPImplementation()
     * @generated
     */
	EAttribute getCPPImplementation_AllowsPassByReference();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getClass_ <em>Class</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Class</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getClass_()
     * @see #getCPPImplementation()
     * @generated
     */
	EAttribute getCPPImplementation_Class();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getComponentType <em>Component Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Component Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getComponentType()
     * @see #getCPPImplementation()
     * @generated
     */
	EAttribute getCPPImplementation_ComponentType();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#isEagerInit <em>Eager Init</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Eager Init</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#isEagerInit()
     * @see #getCPPImplementation()
     * @generated
     */
	EAttribute getCPPImplementation_EagerInit();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getHeader <em>Header</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Header</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getHeader()
     * @see #getCPPImplementation()
     * @generated
     */
	EAttribute getCPPImplementation_Header();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getLibrary <em>Library</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Library</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getLibrary()
     * @see #getCPPImplementation()
     * @generated
     */
	EAttribute getCPPImplementation_Library();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getPath <em>Path</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Path</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getPath()
     * @see #getCPPImplementation()
     * @generated
     */
	EAttribute getCPPImplementation_Path();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getScope <em>Scope</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scope</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getScope()
     * @see #getCPPImplementation()
     * @generated
     */
	EAttribute getCPPImplementation_Scope();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getAnyAttribute1 <em>Any Attribute1</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute1</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementation#getAnyAttribute1()
     * @see #getCPPImplementation()
     * @generated
     */
	EAttribute getCPPImplementation_AnyAttribute1();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationFunction <em>CPP Implementation Function</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>CPP Implementation Function</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationFunction
     * @generated
     */
	EClass getCPPImplementationFunction();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationFunction#isAllowsPassByReference <em>Allows Pass By Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Allows Pass By Reference</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationFunction#isAllowsPassByReference()
     * @see #getCPPImplementationFunction()
     * @generated
     */
	EAttribute getCPPImplementationFunction_AllowsPassByReference();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationFunction#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationFunction#getName()
     * @see #getCPPImplementationFunction()
     * @generated
     */
	EAttribute getCPPImplementationFunction_Name();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationFunction#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationFunction#getAnyAttribute()
     * @see #getCPPImplementationFunction()
     * @generated
     */
	EAttribute getCPPImplementationFunction_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImport <em>CPP Import</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>CPP Import</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImport
     * @generated
     */
	EClass getCPPImport();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImport#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Location</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImport#getLocation()
     * @see #getCPPImport()
     * @generated
     */
	EAttribute getCPPImport_Location();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImport#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImport#getName()
     * @see #getCPPImport()
     * @generated
     */
	EAttribute getCPPImport_Name();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface <em>CPP Interface</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>CPP Interface</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface
     * @generated
     */
	EClass getCPPInterface();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getFunction <em>Function</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Function</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getFunction()
     * @see #getCPPInterface()
     * @generated
     */
	EReference getCPPInterface_Function();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getCallbackFunction <em>Callback Function</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Callback Function</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getCallbackFunction()
     * @see #getCPPInterface()
     * @generated
     */
	EReference getCPPInterface_CallbackFunction();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getAny()
     * @see #getCPPInterface()
     * @generated
     */
	EAttribute getCPPInterface_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getCallbackClass <em>Callback Class</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Callback Class</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getCallbackClass()
     * @see #getCPPInterface()
     * @generated
     */
	EAttribute getCPPInterface_CallbackClass();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getCallbackHeader <em>Callback Header</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Callback Header</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getCallbackHeader()
     * @see #getCPPInterface()
     * @generated
     */
	EAttribute getCPPInterface_CallbackHeader();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getClass_ <em>Class</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Class</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getClass_()
     * @see #getCPPInterface()
     * @generated
     */
	EAttribute getCPPInterface_Class();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getHeader <em>Header</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Header</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getHeader()
     * @see #getCPPInterface()
     * @generated
     */
	EAttribute getCPPInterface_Header();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getAnyAttribute1 <em>Any Attribute1</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute1</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPInterface#getAnyAttribute1()
     * @see #getCPPInterface()
     * @generated
     */
	EAttribute getCPPInterface_AnyAttribute1();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.DeployableType <em>Deployable Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Deployable Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DeployableType
     * @generated
     */
	EClass getDeployableType();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.DeployableType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DeployableType#getAny()
     * @see #getDeployableType()
     * @generated
     */
	EAttribute getDeployableType_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.DeployableType#getComposite <em>Composite</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Composite</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DeployableType#getComposite()
     * @see #getDeployableType()
     * @generated
     */
	EAttribute getDeployableType_Composite();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Documentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Documentation</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Documentation
     * @generated
     */
	EClass getDocumentation();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Documentation#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Documentation#getMixed()
     * @see #getDocumentation()
     * @generated
     */
	EAttribute getDocumentation_Mixed();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Documentation#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Documentation#getAny()
     * @see #getDocumentation()
     * @generated
     */
	EAttribute getDocumentation_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Documentation#getLang <em>Lang</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lang</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Documentation#getLang()
     * @see #getDocumentation()
     * @generated
     */
	EAttribute getDocumentation_Lang();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot
     * @generated
     */
	EClass getDocumentRoot();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
	EAttribute getDocumentRoot_Mixed();

	/**
     * Returns the meta object for the map '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
     * Returns the meta object for the map '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBinding <em>Binding</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBinding()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Binding();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBindingEjb <em>Binding Ejb</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Ejb</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBindingEjb()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_BindingEjb();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBindingJca <em>Binding Jca</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Jca</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBindingJca()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_BindingJca();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBindingJms <em>Binding Jms</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Jms</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBindingJms()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_BindingJms();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBindingSca <em>Binding Sca</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Sca</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBindingSca()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_BindingSca();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBindingWs <em>Binding Ws</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Ws</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBindingWs()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_BindingWs();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBindingType <em>Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getBindingType()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_BindingType();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getCallback <em>Callback</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Callback</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getCallback()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Callback();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getComponentType <em>Component Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Component Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getComponentType()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ComponentType();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getComposite <em>Composite</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Composite</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getComposite()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Composite();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getConstrainingType <em>Constraining Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Constraining Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getConstrainingType()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ConstrainingType();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getContribution <em>Contribution</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Contribution</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getContribution()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Contribution();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getDefinitions <em>Definitions</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Definitions</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getDefinitions()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Definitions();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Documentation</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getDocumentation()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Documentation();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getExport <em>Export</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Export</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getExport()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Export();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getExportBase <em>Export Base</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Export Base</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getExportBase()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ExportBase();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getExportC <em>Export C</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Export C</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getExportC()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ExportC();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getExportCpp <em>Export Cpp</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Export Cpp</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getExportCpp()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ExportCpp();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getExportJava <em>Export Java</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Export Java</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getExportJava()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ExportJava();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getExtensions <em>Extensions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Extensions</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getExtensions()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Extensions();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementation <em>Implementation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Implementation</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementation()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Implementation();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationBpel <em>Implementation Bpel</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Implementation Bpel</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationBpel()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ImplementationBpel();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationC <em>Implementation C</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Implementation C</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationC()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ImplementationC();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationComposite <em>Implementation Composite</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Implementation Composite</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationComposite()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ImplementationComposite();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationCpp <em>Implementation Cpp</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Implementation Cpp</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationCpp()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ImplementationCpp();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationEjb <em>Implementation Ejb</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Implementation Ejb</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationEjb()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ImplementationEjb();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationJava <em>Implementation Java</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Implementation Java</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationJava()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ImplementationJava();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationJee <em>Implementation Jee</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Implementation Jee</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationJee()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ImplementationJee();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationSpring <em>Implementation Spring</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Implementation Spring</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationSpring()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ImplementationSpring();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationWeb <em>Implementation Web</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Implementation Web</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationWeb()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ImplementationWeb();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationType <em>Implementation Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Implementation Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImplementationType()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ImplementationType();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImport <em>Import</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Import</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImport()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Import();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImportBase <em>Import Base</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Import Base</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImportBase()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ImportBase();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImportC <em>Import C</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Import C</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImportC()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ImportC();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImportCpp <em>Import Cpp</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Import Cpp</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImportCpp()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ImportCpp();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImportJava <em>Import Java</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Import Java</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getImportJava()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ImportJava();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getInclude <em>Include</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Include</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getInclude()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Include();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getIntent <em>Intent</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Intent</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getIntent()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Intent();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getInterface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Interface</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getInterface()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Interface();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getInterfaceC <em>Interface C</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Interface C</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getInterfaceC()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_InterfaceC();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getInterfaceCpp <em>Interface Cpp</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Interface Cpp</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getInterfaceCpp()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_InterfaceCpp();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getInterfaceJava <em>Interface Java</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Interface Java</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getInterfaceJava()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_InterfaceJava();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getInterfaceWsdl <em>Interface Wsdl</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Interface Wsdl</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getInterfaceWsdl()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_InterfaceWsdl();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getOperationSelector <em>Operation Selector</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operation Selector</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getOperationSelector()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_OperationSelector();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getOperationSelectorJmsDefault <em>Operation Selector Jms Default</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operation Selector Jms Default</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getOperationSelectorJmsDefault()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_OperationSelectorJmsDefault();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getPolicySet <em>Policy Set</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Policy Set</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getPolicySet()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_PolicySet();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getPolicySetAttachment <em>Policy Set Attachment</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Policy Set Attachment</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getPolicySetAttachment()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_PolicySetAttachment();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getValue()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_Value();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getWireFormat <em>Wire Format</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Wire Format</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getWireFormat()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_WireFormat();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getWireFormatJmsDefault <em>Wire Format Jms Default</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Wire Format Jms Default</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getWireFormatJmsDefault()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_WireFormatJmsDefault();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getWSCallback <em>WS Callback</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>WS Callback</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getWSCallback()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_WSCallback();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getCallback1 <em>Callback1</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Callback1</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getCallback1()
     * @see #getDocumentRoot()
     * @generated
     */
	EAttribute getDocumentRoot_Callback1();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getRequires <em>Requires</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Requires</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot#getRequires()
     * @see #getDocumentRoot()
     * @generated
     */
	EAttribute getDocumentRoot_Requires();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.EJBImplementation <em>EJB Implementation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>EJB Implementation</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.EJBImplementation
     * @generated
     */
	EClass getEJBImplementation();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.EJBImplementation#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.EJBImplementation#getAny()
     * @see #getEJBImplementation()
     * @generated
     */
	EAttribute getEJBImplementation_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.EJBImplementation#getEjbLink <em>Ejb Link</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ejb Link</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.EJBImplementation#getEjbLink()
     * @see #getEJBImplementation()
     * @generated
     */
	EAttribute getEJBImplementation_EjbLink();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.EJBImplementation#getAnyAttribute1 <em>Any Attribute1</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute1</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.EJBImplementation#getAnyAttribute1()
     * @see #getEJBImplementation()
     * @generated
     */
	EAttribute getEJBImplementation_AnyAttribute1();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.EJBSessionBeanBinding <em>EJB Session Bean Binding</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>EJB Session Bean Binding</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.EJBSessionBeanBinding
     * @generated
     */
	EClass getEJBSessionBeanBinding();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.EJBSessionBeanBinding#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.EJBSessionBeanBinding#getAny()
     * @see #getEJBSessionBeanBinding()
     * @generated
     */
	EAttribute getEJBSessionBeanBinding_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.EJBSessionBeanBinding#getEjbLinkName <em>Ejb Link Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ejb Link Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.EJBSessionBeanBinding#getEjbLinkName()
     * @see #getEJBSessionBeanBinding()
     * @generated
     */
	EAttribute getEJBSessionBeanBinding_EjbLinkName();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.EJBSessionBeanBinding#getEjbVersion <em>Ejb Version</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ejb Version</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.EJBSessionBeanBinding#getEjbVersion()
     * @see #getEJBSessionBeanBinding()
     * @generated
     */
	EAttribute getEJBSessionBeanBinding_EjbVersion();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.EJBSessionBeanBinding#getHomeInterface <em>Home Interface</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Home Interface</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.EJBSessionBeanBinding#getHomeInterface()
     * @see #getEJBSessionBeanBinding()
     * @generated
     */
	EAttribute getEJBSessionBeanBinding_HomeInterface();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Export <em>Export</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Export</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Export
     * @generated
     */
	EClass getExport();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Export#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Export#getAny()
     * @see #getExport()
     * @generated
     */
	EAttribute getExport_Any();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ExportType <em>Export Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Export Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ExportType
     * @generated
     */
	EClass getExportType();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.ExportType#getNamespace <em>Namespace</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Namespace</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ExportType#getNamespace()
     * @see #getExportType()
     * @generated
     */
	EAttribute getExportType_Namespace();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ExtensionsType <em>Extensions Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Extensions Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ExtensionsType
     * @generated
     */
    EClass getExtensionsType();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ExtensionsType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ExtensionsType#getAny()
     * @see #getExtensionsType()
     * @generated
     */
    EAttribute getExtensionsType_Any();

    /**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Implementation <em>Implementation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Implementation</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Implementation
     * @generated
     */
	EClass getImplementation();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Implementation#getPolicySets <em>Policy Sets</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Policy Sets</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Implementation#getPolicySets()
     * @see #getImplementation()
     * @generated
     */
	EAttribute getImplementation_PolicySets();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Implementation#getRequires <em>Requires</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Requires</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Implementation#getRequires()
     * @see #getImplementation()
     * @generated
     */
	EAttribute getImplementation_Requires();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ImplementationType <em>Implementation Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Implementation Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ImplementationType
     * @generated
     */
	EClass getImplementationType();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ImplementationType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ImplementationType#getAny()
     * @see #getImplementationType()
     * @generated
     */
	EAttribute getImplementationType_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.ImplementationType#getAlwaysProvides <em>Always Provides</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Always Provides</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ImplementationType#getAlwaysProvides()
     * @see #getImplementationType()
     * @generated
     */
	EAttribute getImplementationType_AlwaysProvides();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.ImplementationType#getMayProvide <em>May Provide</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>May Provide</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ImplementationType#getMayProvide()
     * @see #getImplementationType()
     * @generated
     */
	EAttribute getImplementationType_MayProvide();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.ImplementationType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ImplementationType#getType()
     * @see #getImplementationType()
     * @generated
     */
	EAttribute getImplementationType_Type();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Import <em>Import</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Import</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Import
     * @generated
     */
	EClass getImport();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Import#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Import#getAny()
     * @see #getImport()
     * @generated
     */
	EAttribute getImport_Any();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ImportType <em>Import Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Import Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ImportType
     * @generated
     */
	EClass getImportType();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.ImportType#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Location</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ImportType#getLocation()
     * @see #getImportType()
     * @generated
     */
	EAttribute getImportType_Location();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.ImportType#getNamespace <em>Namespace</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Namespace</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ImportType#getNamespace()
     * @see #getImportType()
     * @generated
     */
	EAttribute getImportType_Namespace();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.InboundOperation <em>Inbound Operation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Inbound Operation</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.InboundOperation
     * @generated
     */
	EClass getInboundOperation();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.InboundOperation#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.InboundOperation#getAny()
     * @see #getInboundOperation()
     * @generated
     */
	EAttribute getInboundOperation_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.InboundOperation#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.InboundOperation#getName()
     * @see #getInboundOperation()
     * @generated
     */
	EAttribute getInboundOperation_Name();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.InboundOperation#getNativeOperation <em>Native Operation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Native Operation</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.InboundOperation#getNativeOperation()
     * @see #getInboundOperation()
     * @generated
     */
	EAttribute getInboundOperation_NativeOperation();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.InboundOperation#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.InboundOperation#getAnyAttribute()
     * @see #getInboundOperation()
     * @generated
     */
	EAttribute getInboundOperation_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Include <em>Include</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Include</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Include
     * @generated
     */
	EClass getInclude();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Include#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Include#getName()
     * @see #getInclude()
     * @generated
     */
	EAttribute getInclude_Name();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent <em>Intent</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Intent</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Intent
     * @generated
     */
	EClass getIntent();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Intent#getDescription()
     * @see #getIntent()
     * @generated
     */
	EAttribute getIntent_Description();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getQualifier <em>Qualifier</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Qualifier</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Intent#getQualifier()
     * @see #getIntent()
     * @generated
     */
	EReference getIntent_Qualifier();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Intent#getAny()
     * @see #getIntent()
     * @generated
     */
	EAttribute getIntent_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getConstrains <em>Constrains</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Constrains</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Intent#getConstrains()
     * @see #getIntent()
     * @generated
     */
	EAttribute getIntent_Constrains();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getExcludes <em>Excludes</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Excludes</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Intent#getExcludes()
     * @see #getIntent()
     * @generated
     */
	EAttribute getIntent_Excludes();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getIntentType <em>Intent Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Intent Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Intent#getIntentType()
     * @see #getIntent()
     * @generated
     */
	EAttribute getIntent_IntentType();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#isMutuallyExclusive <em>Mutually Exclusive</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mutually Exclusive</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Intent#isMutuallyExclusive()
     * @see #getIntent()
     * @generated
     */
	EAttribute getIntent_MutuallyExclusive();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Intent#getName()
     * @see #getIntent()
     * @generated
     */
	EAttribute getIntent_Name();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getRequires <em>Requires</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Requires</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Intent#getRequires()
     * @see #getIntent()
     * @generated
     */
	EAttribute getIntent_Requires();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Intent#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Intent#getAnyAttribute()
     * @see #getIntent()
     * @generated
     */
	EAttribute getIntent_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.IntentMap <em>Intent Map</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Intent Map</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.IntentMap
     * @generated
     */
	EClass getIntentMap();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.IntentMap#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.IntentMap#getGroup()
     * @see #getIntentMap()
     * @generated
     */
	EAttribute getIntentMap_Group();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.IntentMap#getQualifier <em>Qualifier</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Qualifier</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.IntentMap#getQualifier()
     * @see #getIntentMap()
     * @generated
     */
	EReference getIntentMap_Qualifier();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.IntentMap#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.IntentMap#getAny()
     * @see #getIntentMap()
     * @generated
     */
	EAttribute getIntentMap_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.IntentMap#getProvides <em>Provides</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Provides</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.IntentMap#getProvides()
     * @see #getIntentMap()
     * @generated
     */
	EAttribute getIntentMap_Provides();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.IntentMap#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.IntentMap#getAnyAttribute()
     * @see #getIntentMap()
     * @generated
     */
	EAttribute getIntentMap_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.IntentQualifier <em>Intent Qualifier</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Intent Qualifier</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.IntentQualifier
     * @generated
     */
	EClass getIntentQualifier();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.IntentQualifier#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.IntentQualifier#getDescription()
     * @see #getIntentQualifier()
     * @generated
     */
	EAttribute getIntentQualifier_Description();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.IntentQualifier#isDefault <em>Default</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.IntentQualifier#isDefault()
     * @see #getIntentQualifier()
     * @generated
     */
	EAttribute getIntentQualifier_Default();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.IntentQualifier#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.IntentQualifier#getName()
     * @see #getIntentQualifier()
     * @generated
     */
	EAttribute getIntentQualifier_Name();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.InteractionSpec <em>Interaction Spec</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction Spec</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.InteractionSpec
     * @generated
     */
	EClass getInteractionSpec();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.InteractionSpec#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.InteractionSpec#getProperty()
     * @see #getInteractionSpec()
     * @generated
     */
	EReference getInteractionSpec_Property();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.InteractionSpec#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.InteractionSpec#getAny()
     * @see #getInteractionSpec()
     * @generated
     */
	EAttribute getInteractionSpec_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.InteractionSpec#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.InteractionSpec#getType()
     * @see #getInteractionSpec()
     * @generated
     */
	EAttribute getInteractionSpec_Type();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.InteractionSpec#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.InteractionSpec#getAnyAttribute()
     * @see #getInteractionSpec()
     * @generated
     */
	EAttribute getInteractionSpec_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Interface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interface</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Interface
     * @generated
     */
	EClass getInterface();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Interface#getPolicySets <em>Policy Sets</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Policy Sets</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Interface#getPolicySets()
     * @see #getInterface()
     * @generated
     */
	EAttribute getInterface_PolicySets();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Interface#isRemotable <em>Remotable</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remotable</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Interface#isRemotable()
     * @see #getInterface()
     * @generated
     */
	EAttribute getInterface_Remotable();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Interface#getRequires <em>Requires</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Requires</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Interface#getRequires()
     * @see #getInterface()
     * @generated
     */
	EAttribute getInterface_Requires();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JavaExportType <em>Java Export Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Java Export Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JavaExportType
     * @generated
     */
	EClass getJavaExportType();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JavaExportType#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Package</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JavaExportType#getPackage()
     * @see #getJavaExportType()
     * @generated
     */
	EAttribute getJavaExportType_Package();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JavaImplementation <em>Java Implementation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Java Implementation</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JavaImplementation
     * @generated
     */
	EClass getJavaImplementation();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JavaImplementation#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JavaImplementation#getAny()
     * @see #getJavaImplementation()
     * @generated
     */
	EAttribute getJavaImplementation_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JavaImplementation#getClass_ <em>Class</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Class</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JavaImplementation#getClass_()
     * @see #getJavaImplementation()
     * @generated
     */
	EAttribute getJavaImplementation_Class();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JavaImplementation#getAnyAttribute1 <em>Any Attribute1</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute1</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JavaImplementation#getAnyAttribute1()
     * @see #getJavaImplementation()
     * @generated
     */
	EAttribute getJavaImplementation_AnyAttribute1();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JavaImportType <em>Java Import Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Java Import Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JavaImportType
     * @generated
     */
	EClass getJavaImportType();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JavaImportType#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Location</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JavaImportType#getLocation()
     * @see #getJavaImportType()
     * @generated
     */
	EAttribute getJavaImportType_Location();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JavaImportType#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Package</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JavaImportType#getPackage()
     * @see #getJavaImportType()
     * @generated
     */
	EAttribute getJavaImportType_Package();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface <em>Java Interface</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Java Interface</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface
     * @generated
     */
	EClass getJavaInterface();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface#getAny()
     * @see #getJavaInterface()
     * @generated
     */
	EAttribute getJavaInterface_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface#getCallbackInterface <em>Callback Interface</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Callback Interface</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface#getCallbackInterface()
     * @see #getJavaInterface()
     * @generated
     */
	EAttribute getJavaInterface_CallbackInterface();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface#getInterface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Interface</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface#getInterface()
     * @see #getJavaInterface()
     * @generated
     */
	EAttribute getJavaInterface_Interface();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface#getAnyAttribute1 <em>Any Attribute1</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute1</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface#getAnyAttribute1()
     * @see #getJavaInterface()
     * @generated
     */
	EAttribute getJavaInterface_AnyAttribute1();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding <em>JCA Binding</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>JCA Binding</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCABinding
     * @generated
     */
	EClass getJCABinding();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getOutboundConnection <em>Outbound Connection</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Outbound Connection</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getOutboundConnection()
     * @see #getJCABinding()
     * @generated
     */
	EReference getJCABinding_OutboundConnection();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getInboundConnection <em>Inbound Connection</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Inbound Connection</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getInboundConnection()
     * @see #getJCABinding()
     * @generated
     */
	EReference getJCABinding_InboundConnection();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getOutboundInteraction <em>Outbound Interaction</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Outbound Interaction</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getOutboundInteraction()
     * @see #getJCABinding()
     * @generated
     */
	EReference getJCABinding_OutboundInteraction();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getInboundInteraction <em>Inbound Interaction</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Inbound Interaction</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getInboundInteraction()
     * @see #getJCABinding()
     * @generated
     */
	EReference getJCABinding_InboundInteraction();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getProperty()
     * @see #getJCABinding()
     * @generated
     */
	EReference getJCABinding_Property();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getAny()
     * @see #getJCABinding()
     * @generated
     */
	EAttribute getJCABinding_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getConnectionInfo <em>Connection Info</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connection Info</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getConnectionInfo()
     * @see #getJCABinding()
     * @generated
     */
	EAttribute getJCABinding_ConnectionInfo();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getInitialContextFactory <em>Initial Context Factory</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initial Context Factory</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getInitialContextFactory()
     * @see #getJCABinding()
     * @generated
     */
	EAttribute getJCABinding_InitialContextFactory();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getJndiURL <em>Jndi URL</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Jndi URL</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCABinding#getJndiURL()
     * @see #getJCABinding()
     * @generated
     */
	EAttribute getJCABinding_JndiURL();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundConnection <em>JCA Inbound Connection</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>JCA Inbound Connection</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundConnection
     * @generated
     */
	EClass getJCAInboundConnection();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundConnection#getResourceAdapter <em>Resource Adapter</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Resource Adapter</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundConnection#getResourceAdapter()
     * @see #getJCAInboundConnection()
     * @generated
     */
	EReference getJCAInboundConnection_ResourceAdapter();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundConnection#getActivationSpec <em>Activation Spec</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Activation Spec</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundConnection#getActivationSpec()
     * @see #getJCAInboundConnection()
     * @generated
     */
	EReference getJCAInboundConnection_ActivationSpec();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundConnection#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundConnection#getAny()
     * @see #getJCAInboundConnection()
     * @generated
     */
	EAttribute getJCAInboundConnection_Any();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundConnection#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundConnection#getAnyAttribute()
     * @see #getJCAInboundConnection()
     * @generated
     */
	EAttribute getJCAInboundConnection_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundInteraction <em>JCA Inbound Interaction</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>JCA Inbound Interaction</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundInteraction
     * @generated
     */
	EClass getJCAInboundInteraction();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundInteraction#getListener <em>Listener</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Listener</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundInteraction#getListener()
     * @see #getJCAInboundInteraction()
     * @generated
     */
	EAttribute getJCAInboundInteraction_Listener();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundInteraction#getInboundOperation <em>Inbound Operation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Inbound Operation</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundInteraction#getInboundOperation()
     * @see #getJCAInboundInteraction()
     * @generated
     */
	EReference getJCAInboundInteraction_InboundOperation();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundInteraction#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundInteraction#getAny()
     * @see #getJCAInboundInteraction()
     * @generated
     */
	EAttribute getJCAInboundInteraction_Any();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundInteraction#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundInteraction#getAnyAttribute()
     * @see #getJCAInboundInteraction()
     * @generated
     */
	EAttribute getJCAInboundInteraction_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundConnection <em>JCA Outbound Connection</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>JCA Outbound Connection</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundConnection
     * @generated
     */
	EClass getJCAOutboundConnection();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundConnection#getResourceAdapter <em>Resource Adapter</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Resource Adapter</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundConnection#getResourceAdapter()
     * @see #getJCAOutboundConnection()
     * @generated
     */
	EReference getJCAOutboundConnection_ResourceAdapter();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundConnection#getConnection <em>Connection</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Connection</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundConnection#getConnection()
     * @see #getJCAOutboundConnection()
     * @generated
     */
	EReference getJCAOutboundConnection_Connection();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundConnection#getResAuth <em>Res Auth</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Res Auth</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundConnection#getResAuth()
     * @see #getJCAOutboundConnection()
     * @generated
     */
	EAttribute getJCAOutboundConnection_ResAuth();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundConnection#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundConnection#getAny()
     * @see #getJCAOutboundConnection()
     * @generated
     */
	EAttribute getJCAOutboundConnection_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundConnection#isManaged <em>Managed</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Managed</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundConnection#isManaged()
     * @see #getJCAOutboundConnection()
     * @generated
     */
	EAttribute getJCAOutboundConnection_Managed();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundConnection#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundConnection#getAnyAttribute()
     * @see #getJCAOutboundConnection()
     * @generated
     */
	EAttribute getJCAOutboundConnection_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundInteraction <em>JCA Outbound Interaction</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>JCA Outbound Interaction</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundInteraction
     * @generated
     */
	EClass getJCAOutboundInteraction();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundInteraction#getConnectionSpec <em>Connection Spec</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Connection Spec</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundInteraction#getConnectionSpec()
     * @see #getJCAOutboundInteraction()
     * @generated
     */
	EReference getJCAOutboundInteraction_ConnectionSpec();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundInteraction#getInteractionSpec <em>Interaction Spec</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Interaction Spec</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundInteraction#getInteractionSpec()
     * @see #getJCAOutboundInteraction()
     * @generated
     */
	EReference getJCAOutboundInteraction_InteractionSpec();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundInteraction#getOperation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operation</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundInteraction#getOperation()
     * @see #getJCAOutboundInteraction()
     * @generated
     */
	EReference getJCAOutboundInteraction_Operation();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundInteraction#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundInteraction#getAny()
     * @see #getJCAOutboundInteraction()
     * @generated
     */
	EAttribute getJCAOutboundInteraction_Any();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundInteraction#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundInteraction#getAnyAttribute()
     * @see #getJCAOutboundInteraction()
     * @generated
     */
	EAttribute getJCAOutboundInteraction_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JEEImplementation <em>JEE Implementation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>JEE Implementation</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JEEImplementation
     * @generated
     */
	EClass getJEEImplementation();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JEEImplementation#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JEEImplementation#getAny()
     * @see #getJEEImplementation()
     * @generated
     */
	EAttribute getJEEImplementation_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JEEImplementation#getArchive <em>Archive</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Archive</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JEEImplementation#getArchive()
     * @see #getJEEImplementation()
     * @generated
     */
	EAttribute getJEEImplementation_Archive();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JEEImplementation#getAnyAttribute1 <em>Any Attribute1</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute1</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JEEImplementation#getAnyAttribute1()
     * @see #getJEEImplementation()
     * @generated
     */
	EAttribute getJEEImplementation_AnyAttribute1();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSActivationSpec <em>JMS Activation Spec</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>JMS Activation Spec</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSActivationSpec
     * @generated
     */
	EClass getJMSActivationSpec();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSActivationSpec#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSActivationSpec#getProperty()
     * @see #getJMSActivationSpec()
     * @generated
     */
	EReference getJMSActivationSpec_Property();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSActivationSpec#getCreate <em>Create</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Create</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSActivationSpec#getCreate()
     * @see #getJMSActivationSpec()
     * @generated
     */
	EAttribute getJMSActivationSpec_Create();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSActivationSpec#getJndiName <em>Jndi Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Jndi Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSActivationSpec#getJndiName()
     * @see #getJMSActivationSpec()
     * @generated
     */
	EAttribute getJMSActivationSpec_JndiName();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding <em>JMS Binding</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>JMS Binding</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding
     * @generated
     */
	EClass getJMSBinding();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getDestination <em>Destination</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Destination</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getDestination()
     * @see #getJMSBinding()
     * @generated
     */
	EReference getJMSBinding_Destination();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getConnectionFactory <em>Connection Factory</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Connection Factory</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getConnectionFactory()
     * @see #getJMSBinding()
     * @generated
     */
	EReference getJMSBinding_ConnectionFactory();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getActivationSpec <em>Activation Spec</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Activation Spec</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getActivationSpec()
     * @see #getJMSBinding()
     * @generated
     */
	EReference getJMSBinding_ActivationSpec();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getResponse <em>Response</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Response</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getResponse()
     * @see #getJMSBinding()
     * @generated
     */
	EReference getJMSBinding_Response();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getHeaders <em>Headers</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Headers</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getHeaders()
     * @see #getJMSBinding()
     * @generated
     */
	EReference getJMSBinding_Headers();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getMessageSelection <em>Message Selection</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Message Selection</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getMessageSelection()
     * @see #getJMSBinding()
     * @generated
     */
	EReference getJMSBinding_MessageSelection();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getResourceAdapter <em>Resource Adapter</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Resource Adapter</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getResourceAdapter()
     * @see #getJMSBinding()
     * @generated
     */
	EReference getJMSBinding_ResourceAdapter();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getOperationProperties <em>Operation Properties</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Operation Properties</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getOperationProperties()
     * @see #getJMSBinding()
     * @generated
     */
	EReference getJMSBinding_OperationProperties();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getAny()
     * @see #getJMSBinding()
     * @generated
     */
	EAttribute getJMSBinding_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getCorrelationScheme <em>Correlation Scheme</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Correlation Scheme</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getCorrelationScheme()
     * @see #getJMSBinding()
     * @generated
     */
	EAttribute getJMSBinding_CorrelationScheme();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getInitialContextFactory <em>Initial Context Factory</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initial Context Factory</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getInitialContextFactory()
     * @see #getJMSBinding()
     * @generated
     */
	EAttribute getJMSBinding_InitialContextFactory();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getJndiURL <em>Jndi URL</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Jndi URL</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getJndiURL()
     * @see #getJMSBinding()
     * @generated
     */
	EAttribute getJMSBinding_JndiURL();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getOperationProperties1 <em>Operation Properties1</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operation Properties1</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getOperationProperties1()
     * @see #getJMSBinding()
     * @generated
     */
	EAttribute getJMSBinding_OperationProperties1();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getRequestConnection <em>Request Connection</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Request Connection</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getRequestConnection()
     * @see #getJMSBinding()
     * @generated
     */
	EAttribute getJMSBinding_RequestConnection();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getResponseConnection <em>Response Connection</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Response Connection</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding#getResponseConnection()
     * @see #getJMSBinding()
     * @generated
     */
	EAttribute getJMSBinding_ResponseConnection();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSConnectionFactory <em>JMS Connection Factory</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>JMS Connection Factory</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSConnectionFactory
     * @generated
     */
	EClass getJMSConnectionFactory();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSConnectionFactory#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSConnectionFactory#getProperty()
     * @see #getJMSConnectionFactory()
     * @generated
     */
	EReference getJMSConnectionFactory_Property();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSConnectionFactory#getCreate <em>Create</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Create</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSConnectionFactory#getCreate()
     * @see #getJMSConnectionFactory()
     * @generated
     */
	EAttribute getJMSConnectionFactory_Create();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSConnectionFactory#getJndiName <em>Jndi Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Jndi Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSConnectionFactory#getJndiName()
     * @see #getJMSConnectionFactory()
     * @generated
     */
	EAttribute getJMSConnectionFactory_JndiName();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination <em>JMS Destination</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>JMS Destination</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination
     * @generated
     */
	EClass getJMSDestination();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination#getProperty()
     * @see #getJMSDestination()
     * @generated
     */
	EReference getJMSDestination_Property();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination#getCreate <em>Create</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Create</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination#getCreate()
     * @see #getJMSDestination()
     * @generated
     */
	EAttribute getJMSDestination_Create();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination#getJndiName <em>Jndi Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Jndi Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination#getJndiName()
     * @see #getJMSDestination()
     * @generated
     */
	EAttribute getJMSDestination_JndiName();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination#getType()
     * @see #getJMSDestination()
     * @generated
     */
	EAttribute getJMSDestination_Type();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders <em>JMS Headers</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>JMS Headers</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders
     * @generated
     */
	EClass getJMSHeaders();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getProperty()
     * @see #getJMSHeaders()
     * @generated
     */
	EReference getJMSHeaders_Property();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getDeliveryMode <em>Delivery Mode</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delivery Mode</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getDeliveryMode()
     * @see #getJMSHeaders()
     * @generated
     */
	EAttribute getJMSHeaders_DeliveryMode();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getPriority <em>Priority</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Priority</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getPriority()
     * @see #getJMSHeaders()
     * @generated
     */
	EAttribute getJMSHeaders_Priority();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getTimeToLive <em>Time To Live</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time To Live</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getTimeToLive()
     * @see #getJMSHeaders()
     * @generated
     */
	EAttribute getJMSHeaders_TimeToLive();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders#getType()
     * @see #getJMSHeaders()
     * @generated
     */
	EAttribute getJMSHeaders_Type();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSMessageSelection <em>JMS Message Selection</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>JMS Message Selection</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSMessageSelection
     * @generated
     */
	EClass getJMSMessageSelection();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSMessageSelection#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSMessageSelection#getProperty()
     * @see #getJMSMessageSelection()
     * @generated
     */
	EReference getJMSMessageSelection_Property();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSMessageSelection#getSelector <em>Selector</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Selector</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSMessageSelection#getSelector()
     * @see #getJMSMessageSelection()
     * @generated
     */
	EAttribute getJMSMessageSelection_Selector();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSOperationProperties <em>JMS Operation Properties</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>JMS Operation Properties</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSOperationProperties
     * @generated
     */
	EClass getJMSOperationProperties();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSOperationProperties#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSOperationProperties#getProperty()
     * @see #getJMSOperationProperties()
     * @generated
     */
	EReference getJMSOperationProperties_Property();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSOperationProperties#getHeaders <em>Headers</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Headers</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSOperationProperties#getHeaders()
     * @see #getJMSOperationProperties()
     * @generated
     */
	EReference getJMSOperationProperties_Headers();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSOperationProperties#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSOperationProperties#getName()
     * @see #getJMSOperationProperties()
     * @generated
     */
	EAttribute getJMSOperationProperties_Name();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSOperationProperties#getNativeOperation <em>Native Operation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Native Operation</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSOperationProperties#getNativeOperation()
     * @see #getJMSOperationProperties()
     * @generated
     */
	EAttribute getJMSOperationProperties_NativeOperation();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSResourceAdapter <em>JMS Resource Adapter</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>JMS Resource Adapter</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSResourceAdapter
     * @generated
     */
	EClass getJMSResourceAdapter();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSResourceAdapter#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSResourceAdapter#getProperty()
     * @see #getJMSResourceAdapter()
     * @generated
     */
	EReference getJMSResourceAdapter_Property();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSResourceAdapter#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSResourceAdapter#getName()
     * @see #getJMSResourceAdapter()
     * @generated
     */
	EAttribute getJMSResourceAdapter_Name();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse <em>JMS Response</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>JMS Response</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse
     * @generated
     */
	EClass getJMSResponse();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse#getWireFormat <em>Wire Format</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Wire Format</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse#getWireFormat()
     * @see #getJMSResponse()
     * @generated
     */
	EReference getJMSResponse_WireFormat();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse#getDestination <em>Destination</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Destination</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse#getDestination()
     * @see #getJMSResponse()
     * @generated
     */
	EReference getJMSResponse_Destination();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse#getConnectionFactory <em>Connection Factory</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Connection Factory</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse#getConnectionFactory()
     * @see #getJMSResponse()
     * @generated
     */
	EReference getJMSResponse_ConnectionFactory();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse#getActivationSpec <em>Activation Spec</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Activation Spec</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse#getActivationSpec()
     * @see #getJMSResponse()
     * @generated
     */
	EReference getJMSResponse_ActivationSpec();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse#getAny()
     * @see #getJMSResponse()
     * @generated
     */
	EAttribute getJMSResponse_Any();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Operation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operation</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Operation
     * @generated
     */
	EClass getOperation();

	/**
     * Returns the meta object for the containment reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.Operation#getInteractionSpec <em>Interaction Spec</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Interaction Spec</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Operation#getInteractionSpec()
     * @see #getOperation()
     * @generated
     */
	EReference getOperation_InteractionSpec();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Operation#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Operation#getAny()
     * @see #getOperation()
     * @generated
     */
	EAttribute getOperation_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Operation#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Operation#getName()
     * @see #getOperation()
     * @generated
     */
	EAttribute getOperation_Name();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Operation#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Operation#getAnyAttribute()
     * @see #getOperation()
     * @generated
     */
	EAttribute getOperation_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType <em>Operation Selector Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operation Selector Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType
     * @generated
     */
	EClass getOperationSelectorType();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType#getAny()
     * @see #getOperationSelectorType()
     * @generated
     */
	EAttribute getOperationSelectorType_Any();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType#getAnyAttribute()
     * @see #getOperationSelectorType()
     * @generated
     */
	EAttribute getOperationSelectorType_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet <em>Policy Set</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Policy Set</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PolicySet
     * @generated
     */
	EClass getPolicySet();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getGroup()
     * @see #getPolicySet()
     * @generated
     */
	EAttribute getPolicySet_Group();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getPolicySetReference <em>Policy Set Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Policy Set Reference</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getPolicySetReference()
     * @see #getPolicySet()
     * @generated
     */
	EReference getPolicySet_PolicySetReference();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getIntentMap <em>Intent Map</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Intent Map</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getIntentMap()
     * @see #getPolicySet()
     * @generated
     */
	EReference getPolicySet_IntentMap();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getAny()
     * @see #getPolicySet()
     * @generated
     */
	EAttribute getPolicySet_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getAppliesTo <em>Applies To</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Applies To</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getAppliesTo()
     * @see #getPolicySet()
     * @generated
     */
	EAttribute getPolicySet_AppliesTo();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getAttachTo <em>Attach To</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Attach To</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getAttachTo()
     * @see #getPolicySet()
     * @generated
     */
	EAttribute getPolicySet_AttachTo();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getName()
     * @see #getPolicySet()
     * @generated
     */
	EAttribute getPolicySet_Name();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getProvides <em>Provides</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Provides</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getProvides()
     * @see #getPolicySet()
     * @generated
     */
	EAttribute getPolicySet_Provides();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PolicySet#getAnyAttribute()
     * @see #getPolicySet()
     * @generated
     */
	EAttribute getPolicySet_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySetAttachment <em>Policy Set Attachment</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Policy Set Attachment</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PolicySetAttachment
     * @generated
     */
	EClass getPolicySetAttachment();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySetAttachment#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PolicySetAttachment#getName()
     * @see #getPolicySetAttachment()
     * @generated
     */
	EAttribute getPolicySetAttachment_Name();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySetAttachment#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PolicySetAttachment#getAnyAttribute()
     * @see #getPolicySetAttachment()
     * @generated
     */
	EAttribute getPolicySetAttachment_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySetReference <em>Policy Set Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Policy Set Reference</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PolicySetReference
     * @generated
     */
	EClass getPolicySetReference();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySetReference#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PolicySetReference#getName()
     * @see #getPolicySetReference()
     * @generated
     */
	EAttribute getPolicySetReference_Name();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.PolicySetReference#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PolicySetReference#getAnyAttribute()
     * @see #getPolicySetReference()
     * @generated
     */
	EAttribute getPolicySetReference_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Property
     * @generated
     */
	EClass getProperty();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Property#getElement <em>Element</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Element</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Property#getElement()
     * @see #getProperty()
     * @generated
     */
	EAttribute getProperty_Element();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Property#isMany <em>Many</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Many</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Property#isMany()
     * @see #getProperty()
     * @generated
     */
	EAttribute getProperty_Many();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Property#isMustSupply <em>Must Supply</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Must Supply</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Property#isMustSupply()
     * @see #getProperty()
     * @generated
     */
	EAttribute getProperty_MustSupply();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Property#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Property#getName()
     * @see #getProperty()
     * @generated
     */
	EAttribute getProperty_Name();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Property#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Property#getType()
     * @see #getProperty()
     * @generated
     */
	EAttribute getProperty_Type();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Property#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Property#getAnyAttribute()
     * @see #getProperty()
     * @generated
     */
	EAttribute getProperty_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue <em>Property Value</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property Value</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue
     * @generated
     */
	EClass getPropertyValue();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#getElement <em>Element</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Element</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#getElement()
     * @see #getPropertyValue()
     * @generated
     */
	EAttribute getPropertyValue_Element();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#getFile <em>File</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#getFile()
     * @see #getPropertyValue()
     * @generated
     */
	EAttribute getPropertyValue_File();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#isMany <em>Many</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Many</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#isMany()
     * @see #getPropertyValue()
     * @generated
     */
	EAttribute getPropertyValue_Many();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#getName()
     * @see #getPropertyValue()
     * @generated
     */
	EAttribute getPropertyValue_Name();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#getSource()
     * @see #getPropertyValue()
     * @generated
     */
	EAttribute getPropertyValue_Source();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#getType()
     * @see #getPropertyValue()
     * @generated
     */
	EAttribute getPropertyValue_Type();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue#getAnyAttribute()
     * @see #getPropertyValue()
     * @generated
     */
	EAttribute getPropertyValue_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Qualifier <em>Qualifier</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Qualifier</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Qualifier
     * @generated
     */
	EClass getQualifier();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Qualifier#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Qualifier#getGroup()
     * @see #getQualifier()
     * @generated
     */
	EAttribute getQualifier_Group();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Qualifier#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Qualifier#getAny()
     * @see #getQualifier()
     * @generated
     */
	EAttribute getQualifier_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Qualifier#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Qualifier#getName()
     * @see #getQualifier()
     * @generated
     */
	EAttribute getQualifier_Name();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Qualifier#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Qualifier#getAnyAttribute()
     * @see #getQualifier()
     * @generated
     */
	EAttribute getQualifier_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Reference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reference</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Reference
     * @generated
     */
	EClass getReference();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Reference#isAutowire <em>Autowire</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Autowire</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Reference#isAutowire()
     * @see #getReference()
     * @generated
     */
	EAttribute getReference_Autowire();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Reference#getMultiplicity <em>Multiplicity</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Multiplicity</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Reference#getMultiplicity()
     * @see #getReference()
     * @generated
     */
	EAttribute getReference_Multiplicity();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Reference#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Reference#getTarget()
     * @see #getReference()
     * @generated
     */
	EAttribute getReference_Target();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Reference#isWiredByImpl <em>Wired By Impl</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Wired By Impl</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Reference#isWiredByImpl()
     * @see #getReference()
     * @generated
     */
	EAttribute getReference_WiredByImpl();

	/**
     * Returns the meta object for the reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Reference#getPromote <em>Promote</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Promote</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Reference#getPromote()
     * @see #getReference()
     * @generated
     */
	EReference getReference_Promote();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ResourceAdapter <em>Resource Adapter</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resource Adapter</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ResourceAdapter
     * @generated
     */
	EClass getResourceAdapter();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ResourceAdapter#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ResourceAdapter#getProperty()
     * @see #getResourceAdapter()
     * @generated
     */
	EReference getResourceAdapter_Property();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ResourceAdapter#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ResourceAdapter#getAny()
     * @see #getResourceAdapter()
     * @generated
     */
	EAttribute getResourceAdapter_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.ResourceAdapter#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ResourceAdapter#getName()
     * @see #getResourceAdapter()
     * @generated
     */
	EAttribute getResourceAdapter_Name();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.ResourceAdapter#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ResourceAdapter#getType()
     * @see #getResourceAdapter()
     * @generated
     */
	EAttribute getResourceAdapter_Type();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ResourceAdapter#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ResourceAdapter#getAnyAttribute()
     * @see #getResourceAdapter()
     * @generated
     */
	EAttribute getResourceAdapter_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.SCABinding <em>SCA Binding</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>SCA Binding</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.SCABinding
     * @generated
     */
	EClass getSCABinding();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.SCAImplementation <em>SCA Implementation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>SCA Implementation</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.SCAImplementation
     * @generated
     */
	EClass getSCAImplementation();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.SCAImplementation#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.SCAImplementation#getAny()
     * @see #getSCAImplementation()
     * @generated
     */
	EAttribute getSCAImplementation_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.SCAImplementation#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.SCAImplementation#getName()
     * @see #getSCAImplementation()
     * @generated
     */
	EAttribute getSCAImplementation_Name();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.SCAPropertyBase <em>SCA Property Base</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>SCA Property Base</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.SCAPropertyBase
     * @generated
     */
	EClass getSCAPropertyBase();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.SCAPropertyBase#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.SCAPropertyBase#getMixed()
     * @see #getSCAPropertyBase()
     * @generated
     */
	EAttribute getSCAPropertyBase_Mixed();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.SCAPropertyBase#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.SCAPropertyBase#getAny()
     * @see #getSCAPropertyBase()
     * @generated
     */
	EAttribute getSCAPropertyBase_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.SCAPropertyBase#getPolicySets <em>Policy Sets</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Policy Sets</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.SCAPropertyBase#getPolicySets()
     * @see #getSCAPropertyBase()
     * @generated
     */
	EAttribute getSCAPropertyBase_PolicySets();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.SCAPropertyBase#getRequires <em>Requires</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Requires</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.SCAPropertyBase#getRequires()
     * @see #getSCAPropertyBase()
     * @generated
     */
	EAttribute getSCAPropertyBase_Requires();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.SCAPropertyBase#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.SCAPropertyBase#getValue()
     * @see #getSCAPropertyBase()
     * @generated
     */
    EAttribute getSCAPropertyBase_Value();

    /**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Service <em>Service</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Service
     * @generated
     */
	EClass getService();

	/**
     * Returns the meta object for the reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.Service#getPromote <em>Promote</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Promote</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Service#getPromote()
     * @see #getService()
     * @generated
     */
	EReference getService_Promote();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.SpringImplementation <em>Spring Implementation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Spring Implementation</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.SpringImplementation
     * @generated
     */
	EClass getSpringImplementation();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.SpringImplementation#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.SpringImplementation#getAny()
     * @see #getSpringImplementation()
     * @generated
     */
	EAttribute getSpringImplementation_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.SpringImplementation#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Location</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.SpringImplementation#getLocation()
     * @see #getSpringImplementation()
     * @generated
     */
	EAttribute getSpringImplementation_Location();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions <em>TDefinitions</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>TDefinitions</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions
     * @generated
     */
	EClass getTDefinitions();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getGroup()
     * @see #getTDefinitions()
     * @generated
     */
	EAttribute getTDefinitions_Group();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getIntent <em>Intent</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Intent</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getIntent()
     * @see #getTDefinitions()
     * @generated
     */
	EReference getTDefinitions_Intent();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getPolicySet <em>Policy Set</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Policy Set</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getPolicySet()
     * @see #getTDefinitions()
     * @generated
     */
	EReference getTDefinitions_PolicySet();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getBindingGroup <em>Binding Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Binding Group</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getBindingGroup()
     * @see #getTDefinitions()
     * @generated
     */
	EAttribute getTDefinitions_BindingGroup();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getBinding <em>Binding</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Binding</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getBinding()
     * @see #getTDefinitions()
     * @generated
     */
	EReference getTDefinitions_Binding();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getBindingType <em>Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Binding Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getBindingType()
     * @see #getTDefinitions()
     * @generated
     */
	EReference getTDefinitions_BindingType();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getImplementationType <em>Implementation Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Implementation Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getImplementationType()
     * @see #getTDefinitions()
     * @generated
     */
	EReference getTDefinitions_ImplementationType();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getAny()
     * @see #getTDefinitions()
     * @generated
     */
	EAttribute getTDefinitions_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getTargetNamespace <em>Target Namespace</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Namespace</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.TDefinitions#getTargetNamespace()
     * @see #getTDefinitions()
     * @generated
     */
	EAttribute getTDefinitions_TargetNamespace();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ValueType <em>Value Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Value Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ValueType
     * @generated
     */
	EClass getValueType();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ValueType#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ValueType#getMixed()
     * @see #getValueType()
     * @generated
     */
	EAttribute getValueType_Mixed();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ValueType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ValueType#getAny()
     * @see #getValueType()
     * @generated
     */
	EAttribute getValueType_Any();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.ValueType#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ValueType#getAnyAttribute()
     * @see #getValueType()
     * @generated
     */
	EAttribute getValueType_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.WebImplementation <em>Web Implementation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Web Implementation</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.WebImplementation
     * @generated
     */
	EClass getWebImplementation();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.WebImplementation#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.WebImplementation#getAny()
     * @see #getWebImplementation()
     * @generated
     */
	EAttribute getWebImplementation_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.WebImplementation#getWebUri <em>Web Uri</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Web Uri</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.WebImplementation#getWebUri()
     * @see #getWebImplementation()
     * @generated
     */
	EAttribute getWebImplementation_WebUri();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.WebImplementation#getAnyAttribute1 <em>Any Attribute1</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute1</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.WebImplementation#getAnyAttribute1()
     * @see #getWebImplementation()
     * @generated
     */
	EAttribute getWebImplementation_AnyAttribute1();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.WebServiceBinding <em>Web Service Binding</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Web Service Binding</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.WebServiceBinding
     * @generated
     */
	EClass getWebServiceBinding();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.soa.sca.sca1_1.model.sca.WebServiceBinding#getEndpointReference <em>Endpoint Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Endpoint Reference</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.WebServiceBinding#getEndpointReference()
     * @see #getWebServiceBinding()
     * @generated
     */
	EReference getWebServiceBinding_EndpointReference();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.WebServiceBinding#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.WebServiceBinding#getAny()
     * @see #getWebServiceBinding()
     * @generated
     */
	EAttribute getWebServiceBinding_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.WebServiceBinding#getWsdlElement <em>Wsdl Element</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Wsdl Element</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.WebServiceBinding#getWsdlElement()
     * @see #getWebServiceBinding()
     * @generated
     */
	EAttribute getWebServiceBinding_WsdlElement();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.WebServiceBinding#getWsdlLocation <em>Wsdl Location</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Wsdl Location</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.WebServiceBinding#getWsdlLocation()
     * @see #getWebServiceBinding()
     * @generated
     */
	EAttribute getWebServiceBinding_WsdlLocation();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Wire <em>Wire</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Wire</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Wire
     * @generated
     */
	EClass getWire();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.Wire#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Wire#getAny()
     * @see #getWire()
     * @generated
     */
	EAttribute getWire_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Wire#isReplace <em>Replace</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Replace</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Wire#isReplace()
     * @see #getWire()
     * @generated
     */
	EAttribute getWire_Replace();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Wire#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Wire#getSource()
     * @see #getWire()
     * @generated
     */
	EAttribute getWire_Source();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.Wire#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Wire#getTarget()
     * @see #getWire()
     * @generated
     */
	EAttribute getWire_Target();

	/**
     * Returns the meta object for the reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.Wire#getSource2 <em>Source2</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source2</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Wire#getSource2()
     * @see #getWire()
     * @generated
     */
	EReference getWire_Source2();

	/**
     * Returns the meta object for the reference '{@link org.eclipse.soa.sca.sca1_1.model.sca.Wire#getTarget2 <em>Target2</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target2</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Wire#getTarget2()
     * @see #getWire()
     * @generated
     */
	EReference getWire_Target2();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.WireFormatType <em>Wire Format Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Wire Format Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.WireFormatType
     * @generated
     */
	EClass getWireFormatType();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.WireFormatType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.WireFormatType#getAny()
     * @see #getWireFormatType()
     * @generated
     */
	EAttribute getWireFormatType_Any();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.WireFormatType#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.WireFormatType#getAnyAttribute()
     * @see #getWireFormatType()
     * @generated
     */
	EAttribute getWireFormatType_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.WSCallbackType <em>WS Callback Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS Callback Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.WSCallbackType
     * @generated
     */
	EClass getWSCallbackType();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.WSCallbackType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.WSCallbackType#getAny()
     * @see #getWSCallbackType()
     * @generated
     */
	EAttribute getWSCallbackType_Any();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.WSCallbackType#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.WSCallbackType#getAnyAttribute()
     * @see #getWSCallbackType()
     * @generated
     */
	EAttribute getWSCallbackType_AnyAttribute();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType <em>WSDL Port Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>WSDL Port Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType
     * @generated
     */
	EClass getWSDLPortType();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType#getAny()
     * @see #getWSDLPortType()
     * @generated
     */
	EAttribute getWSDLPortType_Any();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType#getCallbackInterface <em>Callback Interface</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Callback Interface</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType#getCallbackInterface()
     * @see #getWSDLPortType()
     * @generated
     */
	EAttribute getWSDLPortType_CallbackInterface();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType#getInterface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Interface</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType#getInterface()
     * @see #getWSDLPortType()
     * @generated
     */
	EAttribute getWSDLPortType_Interface();

	/**
     * Returns the meta object for the attribute list '{@link org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType#getAnyAttribute1 <em>Any Attribute1</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute1</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType#getAnyAttribute1()
     * @see #getWSDLPortType()
     * @generated
     */
	EAttribute getWSDLPortType_AnyAttribute1();

	/**
     * Returns the meta object for class '{@link org.eclipse.soa.sca.sca1_1.model.sca.ExtendableType <em>Extendable Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Extendable Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ExtendableType
     * @generated
     */
    EClass getExtendableType();

    /**
     * Returns the meta object for enum '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationScope <em>CImplementation Scope</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>CImplementation Scope</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementationScope
     * @generated
     */
	EEnum getCImplementationScope();

	/**
     * Returns the meta object for enum '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationScope <em>CPP Implementation Scope</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>CPP Implementation Scope</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationScope
     * @generated
     */
	EEnum getCPPImplementationScope();

	/**
     * Returns the meta object for enum '{@link org.eclipse.soa.sca.sca1_1.model.sca.CreateResource <em>Create Resource</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Create Resource</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CreateResource
     * @generated
     */
	EEnum getCreateResource();

	/**
     * Returns the meta object for enum '{@link org.eclipse.soa.sca.sca1_1.model.sca.DeliveryModeType <em>Delivery Mode Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Delivery Mode Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DeliveryModeType
     * @generated
     */
	EEnum getDeliveryModeType();

	/**
     * Returns the meta object for enum '{@link org.eclipse.soa.sca.sca1_1.model.sca.InteractionOrImplementation <em>Interaction Or Implementation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Interaction Or Implementation</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.InteractionOrImplementation
     * @generated
     */
	EEnum getInteractionOrImplementation();

	/**
     * Returns the meta object for enum '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCACreateResource <em>JCA Create Resource</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>JCA Create Resource</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCACreateResource
     * @generated
     */
	EEnum getJCACreateResource();

	/**
     * Returns the meta object for enum '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSCreateResource <em>JMS Create Resource</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>JMS Create Resource</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSCreateResource
     * @generated
     */
	EEnum getJMSCreateResource();

	/**
     * Returns the meta object for enum '{@link org.eclipse.soa.sca.sca1_1.model.sca.Multiplicity <em>Multiplicity</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Multiplicity</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Multiplicity
     * @generated
     */
	EEnum getMultiplicity();

	/**
     * Returns the meta object for enum '{@link org.eclipse.soa.sca.sca1_1.model.sca.OverrideOptions <em>Override Options</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Override Options</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.OverrideOptions
     * @generated
     */
	EEnum getOverrideOptions();

	/**
     * Returns the meta object for enum '{@link org.eclipse.soa.sca.sca1_1.model.sca.PriorityType <em>Priority Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Priority Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PriorityType
     * @generated
     */
	EEnum getPriorityType();

	/**
     * Returns the meta object for enum '{@link org.eclipse.soa.sca.sca1_1.model.sca.ResAuth <em>Res Auth</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Res Auth</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ResAuth
     * @generated
     */
	EEnum getResAuth();

	/**
     * Returns the meta object for enum '{@link org.eclipse.soa.sca.sca1_1.model.sca.TypeType <em>Type Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Type Type</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.TypeType
     * @generated
     */
	EEnum getTypeType();

	/**
     * Returns the meta object for enum '{@link org.eclipse.soa.sca.sca1_1.model.sca.VersionValue <em>Version Value</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Version Value</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.VersionValue
     * @generated
     */
	EEnum getVersionValue();

	/**
     * Returns the meta object for data type '{@link org.eclipse.soa.sca.sca1_1.model.sca.CImplementationScope <em>CImplementation Scope Object</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>CImplementation Scope Object</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CImplementationScope
     * @model instanceClass="org.eclipse.soa.sca.sca1_1.model.sca.CImplementationScope"
     *        extendedMetaData="name='CImplementationScope:Object' baseType='CImplementationScope'"
     * @generated
     */
	EDataType getCImplementationScopeObject();

	/**
     * Returns the meta object for data type '{@link org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationScope <em>CPP Implementation Scope Object</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>CPP Implementation Scope Object</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationScope
     * @model instanceClass="org.eclipse.soa.sca.sca1_1.model.sca.CPPImplementationScope"
     *        extendedMetaData="name='CPPImplementationScope:Object' baseType='CPPImplementationScope'"
     * @generated
     */
	EDataType getCPPImplementationScopeObject();

	/**
     * Returns the meta object for data type '{@link org.eclipse.soa.sca.sca1_1.model.sca.CreateResource <em>Create Resource Object</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Create Resource Object</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CreateResource
     * @model instanceClass="org.eclipse.soa.sca.sca1_1.model.sca.CreateResource"
     *        extendedMetaData="name='CreateResource:Object' baseType='CreateResource'"
     * @generated
     */
	EDataType getCreateResourceObject();

	/**
     * Returns the meta object for data type '{@link org.eclipse.soa.sca.sca1_1.model.sca.DeliveryModeType <em>Delivery Mode Type Object</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Delivery Mode Type Object</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.DeliveryModeType
     * @model instanceClass="org.eclipse.soa.sca.sca1_1.model.sca.DeliveryModeType"
     *        extendedMetaData="name='deliveryMode_._type:Object' baseType='deliveryMode_._type'"
     * @generated
     */
	EDataType getDeliveryModeTypeObject();

	/**
     * Returns the meta object for data type '{@link org.eclipse.soa.sca.sca1_1.model.sca.InteractionOrImplementation <em>Interaction Or Implementation Object</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Interaction Or Implementation Object</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.InteractionOrImplementation
     * @model instanceClass="org.eclipse.soa.sca.sca1_1.model.sca.InteractionOrImplementation"
     *        extendedMetaData="name='InteractionOrImplementation:Object' baseType='InteractionOrImplementation'"
     * @generated
     */
	EDataType getInteractionOrImplementationObject();

	/**
     * Returns the meta object for data type '{@link org.eclipse.soa.sca.sca1_1.model.sca.JCACreateResource <em>JCA Create Resource Object</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>JCA Create Resource Object</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JCACreateResource
     * @model instanceClass="org.eclipse.soa.sca.sca1_1.model.sca.JCACreateResource"
     *        extendedMetaData="name='JCACreateResource:Object' baseType='JCACreateResource'"
     * @generated
     */
	EDataType getJCACreateResourceObject();

	/**
     * Returns the meta object for data type '{@link org.eclipse.soa.sca.sca1_1.model.sca.JMSCreateResource <em>JMS Create Resource Object</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>JMS Create Resource Object</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.JMSCreateResource
     * @model instanceClass="org.eclipse.soa.sca.sca1_1.model.sca.JMSCreateResource"
     *        extendedMetaData="name='JMSCreateResource:Object' baseType='JMSCreateResource'"
     * @generated
     */
	EDataType getJMSCreateResourceObject();

	/**
     * Returns the meta object for data type '{@link java.util.List <em>List Of Any UR Is</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>List Of Any UR Is</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List"
     *        extendedMetaData="name='listOfAnyURIs' itemType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
     * @generated
     */
	EDataType getListOfAnyURIs();

	/**
     * Returns the meta object for data type '{@link java.util.List <em>List Of NC Names</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>List Of NC Names</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List"
     *        extendedMetaData="name='listOfNCNames' itemType='http://www.eclipse.org/emf/2003/XMLType#NCName'"
     * @generated
     */
	EDataType getListOfNCNames();

	/**
     * Returns the meta object for data type '{@link java.util.List <em>List Of QNames</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>List Of QNames</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List"
     *        extendedMetaData="name='listOfQNames' itemType='http://www.eclipse.org/emf/2003/XMLType#QName'"
     * @generated
     */
	EDataType getListOfQNames();

	/**
     * Returns the meta object for data type '{@link org.eclipse.soa.sca.sca1_1.model.sca.Multiplicity <em>Multiplicity Object</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Multiplicity Object</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Multiplicity
     * @model instanceClass="org.eclipse.soa.sca.sca1_1.model.sca.Multiplicity"
     *        extendedMetaData="name='Multiplicity:Object' baseType='Multiplicity'"
     * @generated
     */
	EDataType getMultiplicityObject();

	/**
     * Returns the meta object for data type '{@link org.eclipse.soa.sca.sca1_1.model.sca.OverrideOptions <em>Override Options Object</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Override Options Object</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.OverrideOptions
     * @model instanceClass="org.eclipse.soa.sca.sca1_1.model.sca.OverrideOptions"
     *        extendedMetaData="name='OverrideOptions:Object' baseType='OverrideOptions'"
     * @generated
     */
	EDataType getOverrideOptionsObject();

	/**
     * Returns the meta object for data type '{@link org.eclipse.soa.sca.sca1_1.model.sca.PriorityType <em>Priority Type Object</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Priority Type Object</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.PriorityType
     * @model instanceClass="org.eclipse.soa.sca.sca1_1.model.sca.PriorityType"
     *        extendedMetaData="name='priority_._type:Object' baseType='priority_._type'"
     * @generated
     */
	EDataType getPriorityTypeObject();

	/**
     * Returns the meta object for data type '{@link org.eclipse.soa.sca.sca1_1.model.sca.ResAuth <em>Res Auth Object</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Res Auth Object</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.ResAuth
     * @model instanceClass="org.eclipse.soa.sca.sca1_1.model.sca.ResAuth"
     *        extendedMetaData="name='ResAuth:Object' baseType='ResAuth'"
     * @generated
     */
	EDataType getResAuthObject();

	/**
     * Returns the meta object for data type '{@link org.eclipse.soa.sca.sca1_1.model.sca.TypeType <em>Type Type Object</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Type Type Object</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.TypeType
     * @model instanceClass="org.eclipse.soa.sca.sca1_1.model.sca.TypeType"
     *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
     * @generated
     */
	EDataType getTypeTypeObject();

	/**
     * Returns the meta object for data type '{@link org.eclipse.soa.sca.sca1_1.model.sca.VersionValue <em>Version Value Object</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Version Value Object</em>'.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.VersionValue
     * @model instanceClass="org.eclipse.soa.sca.sca1_1.model.sca.VersionValue"
     *        extendedMetaData="name='VersionValue:Object' baseType='VersionValue'"
     * @generated
     */
	EDataType getVersionValueObject();

	/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	ScaFactory getScaFactory();

} //ScaPackage
