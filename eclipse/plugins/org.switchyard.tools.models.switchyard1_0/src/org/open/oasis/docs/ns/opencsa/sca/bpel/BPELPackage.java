/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.ns.opencsa.sca.bpel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

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
 * @see org.open.oasis.docs.ns.opencsa.sca.bpel.BPELFactory
 * @model kind="package"
 * @generated
 */
public interface BPELPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "bpel";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://docs.oasis-open.org/ns/opencsa/sca/200903";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "bpel";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	BPELPackage eINSTANCE = org.open.oasis.docs.ns.opencsa.sca.bpel.impl.BPELPackageImpl.init();

	/**
     * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.bpel.impl.BPELImplementationImpl <em>Implementation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.open.oasis.docs.ns.opencsa.sca.bpel.impl.BPELImplementationImpl
     * @see org.open.oasis.docs.ns.opencsa.sca.bpel.impl.BPELPackageImpl#getBPELImplementation()
     * @generated
     */
	int BPEL_IMPLEMENTATION = 0;

	/**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPEL_IMPLEMENTATION__DOCUMENTATION = ScaPackage.IMPLEMENTATION__DOCUMENTATION;

	/**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPEL_IMPLEMENTATION__ANY_ATTRIBUTE = ScaPackage.IMPLEMENTATION__ANY_ATTRIBUTE;

	/**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPEL_IMPLEMENTATION__POLICY_SETS = ScaPackage.IMPLEMENTATION__POLICY_SETS;

	/**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPEL_IMPLEMENTATION__REQUIRES = ScaPackage.IMPLEMENTATION__REQUIRES;

	/**
     * The feature id for the '<em><b>Process</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BPEL_IMPLEMENTATION__PROCESS = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Implementation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BPEL_IMPLEMENTATION_FEATURE_COUNT = ScaPackage.IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.bpel.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.open.oasis.docs.ns.opencsa.sca.bpel.impl.DocumentRootImpl
     * @see org.open.oasis.docs.ns.opencsa.sca.bpel.impl.BPELPackageImpl#getDocumentRoot()
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
     * The feature id for the '<em><b>Implementation Bpel</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT__IMPLEMENTATION_BPEL = 3;

	/**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;


	/**
     * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.bpel.BPELImplementation <em>Implementation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Implementation</em>'.
     * @see org.open.oasis.docs.ns.opencsa.sca.bpel.BPELImplementation
     * @generated
     */
	EClass getBPELImplementation();

	/**
     * Returns the meta object for the attribute '{@link org.open.oasis.docs.ns.opencsa.sca.bpel.BPELImplementation#getProcess <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Process</em>'.
     * @see org.open.oasis.docs.ns.opencsa.sca.bpel.BPELImplementation#getProcess()
     * @see #getBPELImplementation()
     * @generated
     */
    EAttribute getBPELImplementation_Process();

    /**
     * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.bpel.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.open.oasis.docs.ns.opencsa.sca.bpel.DocumentRoot
     * @generated
     */
	EClass getDocumentRoot();

	/**
     * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ns.opencsa.sca.bpel.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.open.oasis.docs.ns.opencsa.sca.bpel.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
	EAttribute getDocumentRoot_Mixed();

	/**
     * Returns the meta object for the map '{@link org.open.oasis.docs.ns.opencsa.sca.bpel.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.open.oasis.docs.ns.opencsa.sca.bpel.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
     * Returns the meta object for the map '{@link org.open.oasis.docs.ns.opencsa.sca.bpel.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.open.oasis.docs.ns.opencsa.sca.bpel.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
     * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ns.opencsa.sca.bpel.DocumentRoot#getImplementationBpel <em>Implementation Bpel</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Implementation Bpel</em>'.
     * @see org.open.oasis.docs.ns.opencsa.sca.bpel.DocumentRoot#getImplementationBpel()
     * @see #getDocumentRoot()
     * @generated
     */
	EReference getDocumentRoot_ImplementationBpel();

	/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	BPELFactory getBPELFactory();

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
         * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.bpel.impl.BPELImplementationImpl <em>Implementation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.open.oasis.docs.ns.opencsa.sca.bpel.impl.BPELImplementationImpl
         * @see org.open.oasis.docs.ns.opencsa.sca.bpel.impl.BPELPackageImpl#getBPELImplementation()
         * @generated
         */
		EClass BPEL_IMPLEMENTATION = eINSTANCE.getBPELImplementation();

		/**
         * The meta object literal for the '<em><b>Process</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BPEL_IMPLEMENTATION__PROCESS = eINSTANCE.getBPELImplementation_Process();

        /**
         * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.bpel.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.open.oasis.docs.ns.opencsa.sca.bpel.impl.DocumentRootImpl
         * @see org.open.oasis.docs.ns.opencsa.sca.bpel.impl.BPELPackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Implementation Bpel</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOCUMENT_ROOT__IMPLEMENTATION_BPEL = eINSTANCE.getDocumentRoot_ImplementationBpel();

	}

} //BPELPackage
