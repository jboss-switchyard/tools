/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.commonselector;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.switchyard.tools.models.switchyard1_0.commonselector.CommonselectorFactory
 * @model kind="package"
 * @generated
 */
public interface CommonselectorPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "commonselector";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "urn:switchyard-component-common-selector:config:1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "common_selector";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CommonselectorPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.commonselector.impl.CommonselectorPackageImpl.init();

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.commonselector.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.impl.CommonselectorPackageImpl#getDocumentRoot()
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
     * The feature id for the '<em><b>Static Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__STATIC_OPERATION_SELECTOR = 3;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.commonselector.impl.StaticOperationSelectorTypeImpl <em>Static Operation Selector Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.impl.StaticOperationSelectorTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.impl.CommonselectorPackageImpl#getStaticOperationSelectorType()
     * @generated
     */
    int STATIC_OPERATION_SELECTOR_TYPE = 1;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_OPERATION_SELECTOR_TYPE__ANY = SwitchyardPackage.SWITCH_YARD_OPERATION_SELECTOR_TYPE__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_OPERATION_SELECTOR_TYPE__ANY_ATTRIBUTE = SwitchyardPackage.SWITCH_YARD_OPERATION_SELECTOR_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Operation Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_OPERATION_SELECTOR_TYPE__OPERATION_NAME = SwitchyardPackage.SWITCH_YARD_OPERATION_SELECTOR_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Static Operation Selector Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_OPERATION_SELECTOR_TYPE_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_OPERATION_SELECTOR_TYPE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.commonselector.impl.XPathOperationSelectorTypeImpl <em>XPath Operation Selector Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.impl.XPathOperationSelectorTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.impl.CommonselectorPackageImpl#getXPathOperationSelectorType()
     * @generated
     */
    int XPATH_OPERATION_SELECTOR_TYPE = 2;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XPATH_OPERATION_SELECTOR_TYPE__ANY = SwitchyardPackage.SWITCH_YARD_OPERATION_SELECTOR_TYPE__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XPATH_OPERATION_SELECTOR_TYPE__ANY_ATTRIBUTE = SwitchyardPackage.SWITCH_YARD_OPERATION_SELECTOR_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XPATH_OPERATION_SELECTOR_TYPE__EXPRESSION = SwitchyardPackage.SWITCH_YARD_OPERATION_SELECTOR_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>XPath Operation Selector Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XPATH_OPERATION_SELECTOR_TYPE_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_OPERATION_SELECTOR_TYPE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.commonselector.impl.RegexOperationSelectorTypeImpl <em>Regex Operation Selector Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.impl.RegexOperationSelectorTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.impl.CommonselectorPackageImpl#getRegexOperationSelectorType()
     * @generated
     */
    int REGEX_OPERATION_SELECTOR_TYPE = 3;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEX_OPERATION_SELECTOR_TYPE__ANY = SwitchyardPackage.SWITCH_YARD_OPERATION_SELECTOR_TYPE__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEX_OPERATION_SELECTOR_TYPE__ANY_ATTRIBUTE = SwitchyardPackage.SWITCH_YARD_OPERATION_SELECTOR_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEX_OPERATION_SELECTOR_TYPE__EXPRESSION = SwitchyardPackage.SWITCH_YARD_OPERATION_SELECTOR_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Regex Operation Selector Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEX_OPERATION_SELECTOR_TYPE_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_OPERATION_SELECTOR_TYPE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.commonselector.impl.JavaOperationSelectorTypeImpl <em>Java Operation Selector Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.impl.JavaOperationSelectorTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.impl.CommonselectorPackageImpl#getJavaOperationSelectorType()
     * @generated
     */
    int JAVA_OPERATION_SELECTOR_TYPE = 4;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_OPERATION_SELECTOR_TYPE__ANY = SwitchyardPackage.SWITCH_YARD_OPERATION_SELECTOR_TYPE__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_OPERATION_SELECTOR_TYPE__ANY_ATTRIBUTE = SwitchyardPackage.SWITCH_YARD_OPERATION_SELECTOR_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_OPERATION_SELECTOR_TYPE__CLASS = SwitchyardPackage.SWITCH_YARD_OPERATION_SELECTOR_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Java Operation Selector Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_OPERATION_SELECTOR_TYPE_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_OPERATION_SELECTOR_TYPE_FEATURE_COUNT + 1;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.commonselector.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.commonselector.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.commonselector.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.commonselector.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.commonselector.DocumentRoot#getStaticOperationSelector <em>Static Operation Selector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Static Operation Selector</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.DocumentRoot#getStaticOperationSelector()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_StaticOperationSelector();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.commonselector.StaticOperationSelectorType <em>Static Operation Selector Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Static Operation Selector Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.StaticOperationSelectorType
     * @generated
     */
    EClass getStaticOperationSelectorType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.commonselector.StaticOperationSelectorType#getOperationName <em>Operation Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operation Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.StaticOperationSelectorType#getOperationName()
     * @see #getStaticOperationSelectorType()
     * @generated
     */
    EAttribute getStaticOperationSelectorType_OperationName();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.commonselector.XPathOperationSelectorType <em>XPath Operation Selector Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>XPath Operation Selector Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.XPathOperationSelectorType
     * @generated
     */
    EClass getXPathOperationSelectorType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.commonselector.XPathOperationSelectorType#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Expression</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.XPathOperationSelectorType#getExpression()
     * @see #getXPathOperationSelectorType()
     * @generated
     */
    EAttribute getXPathOperationSelectorType_Expression();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.commonselector.RegexOperationSelectorType <em>Regex Operation Selector Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Regex Operation Selector Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.RegexOperationSelectorType
     * @generated
     */
    EClass getRegexOperationSelectorType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.commonselector.RegexOperationSelectorType#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Expression</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.RegexOperationSelectorType#getExpression()
     * @see #getRegexOperationSelectorType()
     * @generated
     */
    EAttribute getRegexOperationSelectorType_Expression();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.commonselector.JavaOperationSelectorType <em>Java Operation Selector Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Java Operation Selector Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.JavaOperationSelectorType
     * @generated
     */
    EClass getJavaOperationSelectorType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.commonselector.JavaOperationSelectorType#getClass_ <em>Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Class</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.commonselector.JavaOperationSelectorType#getClass_()
     * @see #getJavaOperationSelectorType()
     * @generated
     */
    EAttribute getJavaOperationSelectorType_Class();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CommonselectorFactory getCommonselectorFactory();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.commonselector.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.commonselector.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.commonselector.impl.CommonselectorPackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Static Operation Selector</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__STATIC_OPERATION_SELECTOR = eINSTANCE.getDocumentRoot_StaticOperationSelector();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.commonselector.impl.StaticOperationSelectorTypeImpl <em>Static Operation Selector Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.commonselector.impl.StaticOperationSelectorTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.commonselector.impl.CommonselectorPackageImpl#getStaticOperationSelectorType()
         * @generated
         */
        EClass STATIC_OPERATION_SELECTOR_TYPE = eINSTANCE.getStaticOperationSelectorType();

        /**
         * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STATIC_OPERATION_SELECTOR_TYPE__OPERATION_NAME = eINSTANCE.getStaticOperationSelectorType_OperationName();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.commonselector.impl.XPathOperationSelectorTypeImpl <em>XPath Operation Selector Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.commonselector.impl.XPathOperationSelectorTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.commonselector.impl.CommonselectorPackageImpl#getXPathOperationSelectorType()
         * @generated
         */
        EClass XPATH_OPERATION_SELECTOR_TYPE = eINSTANCE.getXPathOperationSelectorType();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute XPATH_OPERATION_SELECTOR_TYPE__EXPRESSION = eINSTANCE.getXPathOperationSelectorType_Expression();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.commonselector.impl.RegexOperationSelectorTypeImpl <em>Regex Operation Selector Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.commonselector.impl.RegexOperationSelectorTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.commonselector.impl.CommonselectorPackageImpl#getRegexOperationSelectorType()
         * @generated
         */
        EClass REGEX_OPERATION_SELECTOR_TYPE = eINSTANCE.getRegexOperationSelectorType();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REGEX_OPERATION_SELECTOR_TYPE__EXPRESSION = eINSTANCE.getRegexOperationSelectorType_Expression();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.commonselector.impl.JavaOperationSelectorTypeImpl <em>Java Operation Selector Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.commonselector.impl.JavaOperationSelectorTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.commonselector.impl.CommonselectorPackageImpl#getJavaOperationSelectorType()
         * @generated
         */
        EClass JAVA_OPERATION_SELECTOR_TYPE = eINSTANCE.getJavaOperationSelectorType();

        /**
         * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JAVA_OPERATION_SELECTOR_TYPE__CLASS = eINSTANCE.getJavaOperationSelectorType_Class();

    }

} //CommonselectorPackage
