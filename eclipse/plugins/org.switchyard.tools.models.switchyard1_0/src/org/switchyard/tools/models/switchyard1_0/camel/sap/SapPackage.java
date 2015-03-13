/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.sap;

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
 * <!-- begin-model-doc -->
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *     <h1>About the XML namespace</h1>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema document describes the XML namespace, in a form
 *       suitable for import by other schema documents.
 *      </p>
 *      <p>
 *       See <a href="http://www.w3.org/XML/1998/namespace.html">
 *       http://www.w3.org/XML/1998/namespace.html</a> and
 *       <a href="http://www.w3.org/TR/REC-xml">
 *       http://www.w3.org/TR/REC-xml</a> for information 
 *       about this namespace.
 *      </p>
 *      <p>
 *       Note that local names in this namespace are intended to be
 *       defined only by the World Wide Web Consortium or its subgroups.
 *       The names currently defined in this namespace are listed below.
 *       They should not be used with conflicting semantics by any Working
 *       Group, specification, or document instance.
 *      </p>
 *      <p>   
 *       See further below in this document for more information about <a href="#usage">how to refer to this schema document from your own
 *       XSD schema documents</a> and about <a href="#nsversioning">the
 *       namespace-versioning policy governing this schema document</a>.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *    
 *     <h3>Father (in any context at all)</h3> 
 * 
 *     <div class="bodytext">
 *      <p>
 *       denotes Jon Bosak, the chair of 
 *       the original XML Working Group.  This name is reserved by 
 *       the following decision of the W3C XML Plenary and 
 *       XML Coordination groups:
 *      </p>
 *      <blockquote>
 *        <p>
 * 	In appreciation for his vision, leadership and
 * 	dedication the W3C XML Plenary on this 10th day of
 * 	February, 2000, reserves for Jon Bosak in perpetuity
 * 	the XML name "xml:Father".
 *        </p>
 *      </blockquote>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="usage" xml:id="usage" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="usage">About this schema document</a>
 *     </h2>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema defines attributes and an attribute group suitable
 *       for use by schemas wishing to allow <code>xml:base</code>,
 *       <code>xml:lang</code>, <code>xml:space</code> or
 *       <code>xml:id</code> attributes on elements they define.
 *      </p>
 *      <p>
 *       To enable this, such a schema must import this schema for
 *       the XML namespace, e.g. as follows:
 *      </p>
 *      <pre>
 *           &lt;schema . . .&gt;
 *            . . .
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       or
 *      </p>
 *      <pre>
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2009/01/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       Subsequently, qualified reference to any of the attributes or the
 *       group defined below will have the desired effect, e.g.
 *      </p>
 *      <pre>
 *           &lt;type . . .&gt;
 *            . . .
 *            &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *      </pre>
 *      <p>
 *       will define a type which will schema-validate an instance element
 *       with any of those attributes.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="nsversioning" xml:id="nsversioning" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="nsversioning">Versioning policy for this schema document</a>
 *     </h2>
 *     <div class="bodytext">
 *      <p>
 *       In keeping with the XML Schema WG's standard versioning
 *       policy, this schema document will persist at
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd</a>.
 *      </p>
 *      <p>
 *       At the date of issue it can also be found at
 *       <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd</a>.
 *      </p>
 *      <p>
 *       The schema document at that URI may however change in the future,
 *       in order to remain compatible with the latest version of XML
 *       Schema itself, or with the XML namespace itself.  In other words,
 *       if the XML Schema or XML namespaces change, the version of this
 *       document at <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd 
 *       </a> 
 *       will change accordingly; the version at 
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd 
 *       </a> 
 *       will not change.
 *      </p>
 *      <p>
 *       Previous dated (and unchanging) versions of this schema 
 *       document are at:
 *      </p>
 *      <ul>
 *       <li>
 *           <a href="http://www.w3.org/2009/01/xml.xsd">
 * 	http://www.w3.org/2009/01/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2007/08/xml.xsd">
 * 	http://www.w3.org/2007/08/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2004/10/xml.xsd">
 * 	http://www.w3.org/2004/10/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2001/03/xml.xsd">
 * 	http://www.w3.org/2001/03/xml.xsd</a>
 *         </li>
 *      </ul>
 *     </div>
 *    </div>
 *   
 * <!-- end-model-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.camel.sap.SapFactory
 * @model kind="package"
 * @generated
 */
public interface SapPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "sap";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "urn:switchyard-component-camel-sap:config:2.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "sap";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SapPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl.init();

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.AdditionalUriParametersTypeImpl <em>Additional Uri Parameters Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.AdditionalUriParametersTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getAdditionalUriParametersType()
     * @generated
     */
    int ADDITIONAL_URI_PARAMETERS_TYPE = 0;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_URI_PARAMETERS_TYPE__PARAMETER = 0;

    /**
     * The number of structural features of the '<em>Additional Uri Parameters Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_URI_PARAMETERS_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.BaseCamelBindingImpl <em>Base Camel Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.BaseCamelBindingImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getBaseCamelBinding()
     * @generated
     */
    int BASE_CAMEL_BINDING = 1;

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
    int BASE_CAMEL_BINDING__CONTEXT_MAPPER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__MESSAGE_COMPOSER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Additional Uri Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__ADDITIONAL_URI_PARAMETERS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Base Camel Binding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapBindingTypeImpl <em>Camel Sap Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getCamelSapBindingType()
     * @generated
     */
    int CAMEL_SAP_BINDING_TYPE = 2;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_BINDING_TYPE__DOCUMENTATION = BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_BINDING_TYPE__ANY_ATTRIBUTE = BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_BINDING_TYPE__WIRE_FORMAT_GROUP = BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_BINDING_TYPE__WIRE_FORMAT = BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_BINDING_TYPE__OPERATION_SELECTOR_GROUP = BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_BINDING_TYPE__OPERATION_SELECTOR = BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_BINDING_TYPE__NAME = BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_BINDING_TYPE__POLICY_SETS = BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_BINDING_TYPE__REQUIRES = BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_BINDING_TYPE__URI = BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Additional Uri Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_BINDING_TYPE__ADDITIONAL_URI_PARAMETERS = BASE_CAMEL_BINDING__ADDITIONAL_URI_PARAMETERS;

    /**
     * The feature id for the '<em><b>Idoclist Server</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_BINDING_TYPE__IDOCLIST_SERVER = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Srfc Server</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_BINDING_TYPE__SRFC_SERVER = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Trfc Server</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_BINDING_TYPE__TRFC_SERVER = BASE_CAMEL_BINDING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Idoc Destination</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_BINDING_TYPE__IDOC_DESTINATION = BASE_CAMEL_BINDING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Idoclist Destination</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_BINDING_TYPE__IDOCLIST_DESTINATION = BASE_CAMEL_BINDING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Qidoc Destination</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_BINDING_TYPE__QIDOC_DESTINATION = BASE_CAMEL_BINDING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Qidoclist Destination</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_BINDING_TYPE__QIDOCLIST_DESTINATION = BASE_CAMEL_BINDING_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Qrfc Destination</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_BINDING_TYPE__QRFC_DESTINATION = BASE_CAMEL_BINDING_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Srfc Destination</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_BINDING_TYPE__SRFC_DESTINATION = BASE_CAMEL_BINDING_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Trfc Destination</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_BINDING_TYPE__TRFC_DESTINATION = BASE_CAMEL_BINDING_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Camel Sap Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 10;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapIDocDestinationTypeImpl <em>Camel Sap IDoc Destination Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapIDocDestinationTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getCamelSapIDocDestinationType()
     * @generated
     */
    int CAMEL_SAP_IDOC_DESTINATION_TYPE = 3;

    /**
     * The feature id for the '<em><b>Destination Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_IDOC_DESTINATION_TYPE__DESTINATION_NAME = 0;

    /**
     * The feature id for the '<em><b>Idoc Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_IDOC_DESTINATION_TYPE__IDOC_TYPE = 1;

    /**
     * The feature id for the '<em><b>Idoc Type Extension</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_IDOC_DESTINATION_TYPE__IDOC_TYPE_EXTENSION = 2;

    /**
     * The feature id for the '<em><b>System Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_IDOC_DESTINATION_TYPE__SYSTEM_RELEASE = 3;

    /**
     * The feature id for the '<em><b>Application Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_IDOC_DESTINATION_TYPE__APPLICATION_RELEASE = 4;

    /**
     * The number of structural features of the '<em>Camel Sap IDoc Destination Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_IDOC_DESTINATION_TYPE_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapIDocListDestinationTypeImpl <em>Camel Sap IDoc List Destination Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapIDocListDestinationTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getCamelSapIDocListDestinationType()
     * @generated
     */
    int CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE = 4;

    /**
     * The feature id for the '<em><b>Destination Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__DESTINATION_NAME = 0;

    /**
     * The feature id for the '<em><b>Idoc Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__IDOC_TYPE = 1;

    /**
     * The feature id for the '<em><b>Idoc Type Extension</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__IDOC_TYPE_EXTENSION = 2;

    /**
     * The feature id for the '<em><b>System Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__SYSTEM_RELEASE = 3;

    /**
     * The feature id for the '<em><b>Application Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__APPLICATION_RELEASE = 4;

    /**
     * The number of structural features of the '<em>Camel Sap IDoc List Destination Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapIDocListServerTypeImpl <em>Camel Sap IDoc List Server Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapIDocListServerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getCamelSapIDocListServerType()
     * @generated
     */
    int CAMEL_SAP_IDOC_LIST_SERVER_TYPE = 5;

    /**
     * The feature id for the '<em><b>Server Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_IDOC_LIST_SERVER_TYPE__SERVER_NAME = 0;

    /**
     * The feature id for the '<em><b>Idoc Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_IDOC_LIST_SERVER_TYPE__IDOC_TYPE = 1;

    /**
     * The feature id for the '<em><b>Idoc Type Extension</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_IDOC_LIST_SERVER_TYPE__IDOC_TYPE_EXTENSION = 2;

    /**
     * The feature id for the '<em><b>System Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_IDOC_LIST_SERVER_TYPE__SYSTEM_RELEASE = 3;

    /**
     * The feature id for the '<em><b>Application Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_IDOC_LIST_SERVER_TYPE__APPLICATION_RELEASE = 4;

    /**
     * The number of structural features of the '<em>Camel Sap IDoc List Server Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_IDOC_LIST_SERVER_TYPE_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapQIDocDestinationTypeImpl <em>Camel Sap QI Doc Destination Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapQIDocDestinationTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getCamelSapQIDocDestinationType()
     * @generated
     */
    int CAMEL_SAP_QI_DOC_DESTINATION_TYPE = 6;

    /**
     * The feature id for the '<em><b>Destination Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_QI_DOC_DESTINATION_TYPE__DESTINATION_NAME = 0;

    /**
     * The feature id for the '<em><b>Queue Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_QI_DOC_DESTINATION_TYPE__QUEUE_NAME = 1;

    /**
     * The feature id for the '<em><b>Idoc Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_QI_DOC_DESTINATION_TYPE__IDOC_TYPE = 2;

    /**
     * The feature id for the '<em><b>Idoc Type Extension</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_QI_DOC_DESTINATION_TYPE__IDOC_TYPE_EXTENSION = 3;

    /**
     * The feature id for the '<em><b>System Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_QI_DOC_DESTINATION_TYPE__SYSTEM_RELEASE = 4;

    /**
     * The feature id for the '<em><b>Application Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_QI_DOC_DESTINATION_TYPE__APPLICATION_RELEASE = 5;

    /**
     * The number of structural features of the '<em>Camel Sap QI Doc Destination Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_QI_DOC_DESTINATION_TYPE_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapQIDocListDestinationTypeImpl <em>Camel Sap QI Doc List Destination Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapQIDocListDestinationTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getCamelSapQIDocListDestinationType()
     * @generated
     */
    int CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE = 7;

    /**
     * The feature id for the '<em><b>Destination Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE__DESTINATION_NAME = 0;

    /**
     * The feature id for the '<em><b>Queue Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE__QUEUE_NAME = 1;

    /**
     * The feature id for the '<em><b>Idoc Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE__IDOC_TYPE = 2;

    /**
     * The feature id for the '<em><b>Idoc Type Extension</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE__IDOC_TYPE_EXTENSION = 3;

    /**
     * The feature id for the '<em><b>System Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE__SYSTEM_RELEASE = 4;

    /**
     * The feature id for the '<em><b>Application Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE__APPLICATION_RELEASE = 5;

    /**
     * The number of structural features of the '<em>Camel Sap QI Doc List Destination Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapQRfcDestinationTypeImpl <em>Camel Sap QRfc Destination Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapQRfcDestinationTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getCamelSapQRfcDestinationType()
     * @generated
     */
    int CAMEL_SAP_QRFC_DESTINATION_TYPE = 8;

    /**
     * The feature id for the '<em><b>Destination Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_QRFC_DESTINATION_TYPE__DESTINATION_NAME = 0;

    /**
     * The feature id for the '<em><b>Queue Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_QRFC_DESTINATION_TYPE__QUEUE_NAME = 1;

    /**
     * The feature id for the '<em><b>Rfc Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_QRFC_DESTINATION_TYPE__RFC_NAME = 2;

    /**
     * The feature id for the '<em><b>Transacted</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_QRFC_DESTINATION_TYPE__TRANSACTED = 3;

    /**
     * The number of structural features of the '<em>Camel Sap QRfc Destination Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_QRFC_DESTINATION_TYPE_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapSRfcDestinationTypeImpl <em>Camel Sap SRfc Destination Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapSRfcDestinationTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getCamelSapSRfcDestinationType()
     * @generated
     */
    int CAMEL_SAP_SRFC_DESTINATION_TYPE = 9;

    /**
     * The feature id for the '<em><b>Destination Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_SRFC_DESTINATION_TYPE__DESTINATION_NAME = 0;

    /**
     * The feature id for the '<em><b>Rfc Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_SRFC_DESTINATION_TYPE__RFC_NAME = 1;

    /**
     * The feature id for the '<em><b>Transacted</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_SRFC_DESTINATION_TYPE__TRANSACTED = 2;

    /**
     * The number of structural features of the '<em>Camel Sap SRfc Destination Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_SRFC_DESTINATION_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapSRfcServerTypeImpl <em>Camel Sap SRfc Server Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapSRfcServerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getCamelSapSRfcServerType()
     * @generated
     */
    int CAMEL_SAP_SRFC_SERVER_TYPE = 10;

    /**
     * The feature id for the '<em><b>Server Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_SRFC_SERVER_TYPE__SERVER_NAME = 0;

    /**
     * The feature id for the '<em><b>Rfc Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_SRFC_SERVER_TYPE__RFC_NAME = 1;

    /**
     * The number of structural features of the '<em>Camel Sap SRfc Server Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_SRFC_SERVER_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapTRfcDestinationTypeImpl <em>Camel Sap TRfc Destination Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapTRfcDestinationTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getCamelSapTRfcDestinationType()
     * @generated
     */
    int CAMEL_SAP_TRFC_DESTINATION_TYPE = 11;

    /**
     * The feature id for the '<em><b>Destination Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_TRFC_DESTINATION_TYPE__DESTINATION_NAME = 0;

    /**
     * The feature id for the '<em><b>Rfc Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_TRFC_DESTINATION_TYPE__RFC_NAME = 1;

    /**
     * The feature id for the '<em><b>Transacted</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_TRFC_DESTINATION_TYPE__TRANSACTED = 2;

    /**
     * The number of structural features of the '<em>Camel Sap TRfc Destination Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_TRFC_DESTINATION_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapTRfcServerTypeImpl <em>Camel Sap TRfc Server Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapTRfcServerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getCamelSapTRfcServerType()
     * @generated
     */
    int CAMEL_SAP_TRFC_SERVER_TYPE = 12;

    /**
     * The feature id for the '<em><b>Server Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_TRFC_SERVER_TYPE__SERVER_NAME = 0;

    /**
     * The feature id for the '<em><b>Rfc Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_TRFC_SERVER_TYPE__RFC_NAME = 1;

    /**
     * The number of structural features of the '<em>Camel Sap TRfc Server Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_SAP_TRFC_SERVER_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 13;

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
     * The feature id for the '<em><b>Binding Sap</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_SAP = 3;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.ParameterTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getParameterType()
     * @generated
     */
    int PARAMETER_TYPE = 14;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE__NAME = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE__VALUE = 1;

    /**
     * The number of structural features of the '<em>Parameter Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE_FEATURE_COUNT = 2;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.AdditionalUriParametersType <em>Additional Uri Parameters Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Additional Uri Parameters Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.AdditionalUriParametersType
     * @generated
     */
    EClass getAdditionalUriParametersType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.AdditionalUriParametersType#getParameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameter</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.AdditionalUriParametersType#getParameter()
     * @see #getAdditionalUriParametersType()
     * @generated
     */
    EReference getAdditionalUriParametersType_Parameter();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.BaseCamelBinding <em>Base Camel Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base Camel Binding</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.BaseCamelBinding
     * @generated
     */
    EClass getBaseCamelBinding();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.BaseCamelBinding#getContextMapper <em>Context Mapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Context Mapper</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.BaseCamelBinding#getContextMapper()
     * @see #getBaseCamelBinding()
     * @generated
     */
    EReference getBaseCamelBinding_ContextMapper();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.BaseCamelBinding#getMessageComposer <em>Message Composer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Message Composer</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.BaseCamelBinding#getMessageComposer()
     * @see #getBaseCamelBinding()
     * @generated
     */
    EReference getBaseCamelBinding_MessageComposer();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.BaseCamelBinding#getAdditionalUriParameters <em>Additional Uri Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Additional Uri Parameters</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.BaseCamelBinding#getAdditionalUriParameters()
     * @see #getBaseCamelBinding()
     * @generated
     */
    EReference getBaseCamelBinding_AdditionalUriParameters();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType <em>Camel Sap Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Sap Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType
     * @generated
     */
    EClass getCamelSapBindingType();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getIdoclistServer <em>Idoclist Server</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Idoclist Server</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getIdoclistServer()
     * @see #getCamelSapBindingType()
     * @generated
     */
    EReference getCamelSapBindingType_IdoclistServer();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getSrfcServer <em>Srfc Server</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Srfc Server</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getSrfcServer()
     * @see #getCamelSapBindingType()
     * @generated
     */
    EReference getCamelSapBindingType_SrfcServer();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getTrfcServer <em>Trfc Server</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Trfc Server</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getTrfcServer()
     * @see #getCamelSapBindingType()
     * @generated
     */
    EReference getCamelSapBindingType_TrfcServer();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getIdocDestination <em>Idoc Destination</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Idoc Destination</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getIdocDestination()
     * @see #getCamelSapBindingType()
     * @generated
     */
    EReference getCamelSapBindingType_IdocDestination();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getIdoclistDestination <em>Idoclist Destination</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Idoclist Destination</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getIdoclistDestination()
     * @see #getCamelSapBindingType()
     * @generated
     */
    EReference getCamelSapBindingType_IdoclistDestination();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getQidocDestination <em>Qidoc Destination</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Qidoc Destination</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getQidocDestination()
     * @see #getCamelSapBindingType()
     * @generated
     */
    EReference getCamelSapBindingType_QidocDestination();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getQidoclistDestination <em>Qidoclist Destination</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Qidoclist Destination</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getQidoclistDestination()
     * @see #getCamelSapBindingType()
     * @generated
     */
    EReference getCamelSapBindingType_QidoclistDestination();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getQrfcDestination <em>Qrfc Destination</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Qrfc Destination</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getQrfcDestination()
     * @see #getCamelSapBindingType()
     * @generated
     */
    EReference getCamelSapBindingType_QrfcDestination();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getSrfcDestination <em>Srfc Destination</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Srfc Destination</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getSrfcDestination()
     * @see #getCamelSapBindingType()
     * @generated
     */
    EReference getCamelSapBindingType_SrfcDestination();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getTrfcDestination <em>Trfc Destination</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Trfc Destination</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType#getTrfcDestination()
     * @see #getCamelSapBindingType()
     * @generated
     */
    EReference getCamelSapBindingType_TrfcDestination();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocDestinationType <em>Camel Sap IDoc Destination Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Sap IDoc Destination Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocDestinationType
     * @generated
     */
    EClass getCamelSapIDocDestinationType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocDestinationType#getDestinationName <em>Destination Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Destination Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocDestinationType#getDestinationName()
     * @see #getCamelSapIDocDestinationType()
     * @generated
     */
    EAttribute getCamelSapIDocDestinationType_DestinationName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocDestinationType#getIdocType <em>Idoc Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idoc Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocDestinationType#getIdocType()
     * @see #getCamelSapIDocDestinationType()
     * @generated
     */
    EAttribute getCamelSapIDocDestinationType_IdocType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocDestinationType#getIdocTypeExtension <em>Idoc Type Extension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idoc Type Extension</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocDestinationType#getIdocTypeExtension()
     * @see #getCamelSapIDocDestinationType()
     * @generated
     */
    EAttribute getCamelSapIDocDestinationType_IdocTypeExtension();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocDestinationType#getSystemRelease <em>System Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>System Release</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocDestinationType#getSystemRelease()
     * @see #getCamelSapIDocDestinationType()
     * @generated
     */
    EAttribute getCamelSapIDocDestinationType_SystemRelease();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocDestinationType#getApplicationRelease <em>Application Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Application Release</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocDestinationType#getApplicationRelease()
     * @see #getCamelSapIDocDestinationType()
     * @generated
     */
    EAttribute getCamelSapIDocDestinationType_ApplicationRelease();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType <em>Camel Sap IDoc List Destination Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Sap IDoc List Destination Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType
     * @generated
     */
    EClass getCamelSapIDocListDestinationType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType#getDestinationName <em>Destination Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Destination Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType#getDestinationName()
     * @see #getCamelSapIDocListDestinationType()
     * @generated
     */
    EAttribute getCamelSapIDocListDestinationType_DestinationName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType#getIdocType <em>Idoc Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idoc Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType#getIdocType()
     * @see #getCamelSapIDocListDestinationType()
     * @generated
     */
    EAttribute getCamelSapIDocListDestinationType_IdocType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType#getIdocTypeExtension <em>Idoc Type Extension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idoc Type Extension</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType#getIdocTypeExtension()
     * @see #getCamelSapIDocListDestinationType()
     * @generated
     */
    EAttribute getCamelSapIDocListDestinationType_IdocTypeExtension();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType#getSystemRelease <em>System Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>System Release</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType#getSystemRelease()
     * @see #getCamelSapIDocListDestinationType()
     * @generated
     */
    EAttribute getCamelSapIDocListDestinationType_SystemRelease();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType#getApplicationRelease <em>Application Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Application Release</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType#getApplicationRelease()
     * @see #getCamelSapIDocListDestinationType()
     * @generated
     */
    EAttribute getCamelSapIDocListDestinationType_ApplicationRelease();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListServerType <em>Camel Sap IDoc List Server Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Sap IDoc List Server Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListServerType
     * @generated
     */
    EClass getCamelSapIDocListServerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListServerType#getServerName <em>Server Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Server Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListServerType#getServerName()
     * @see #getCamelSapIDocListServerType()
     * @generated
     */
    EAttribute getCamelSapIDocListServerType_ServerName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListServerType#getIdocType <em>Idoc Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idoc Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListServerType#getIdocType()
     * @see #getCamelSapIDocListServerType()
     * @generated
     */
    EAttribute getCamelSapIDocListServerType_IdocType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListServerType#getIdocTypeExtension <em>Idoc Type Extension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idoc Type Extension</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListServerType#getIdocTypeExtension()
     * @see #getCamelSapIDocListServerType()
     * @generated
     */
    EAttribute getCamelSapIDocListServerType_IdocTypeExtension();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListServerType#getSystemRelease <em>System Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>System Release</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListServerType#getSystemRelease()
     * @see #getCamelSapIDocListServerType()
     * @generated
     */
    EAttribute getCamelSapIDocListServerType_SystemRelease();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListServerType#getApplicationRelease <em>Application Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Application Release</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListServerType#getApplicationRelease()
     * @see #getCamelSapIDocListServerType()
     * @generated
     */
    EAttribute getCamelSapIDocListServerType_ApplicationRelease();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocDestinationType <em>Camel Sap QI Doc Destination Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Sap QI Doc Destination Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocDestinationType
     * @generated
     */
    EClass getCamelSapQIDocDestinationType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocDestinationType#getDestinationName <em>Destination Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Destination Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocDestinationType#getDestinationName()
     * @see #getCamelSapQIDocDestinationType()
     * @generated
     */
    EAttribute getCamelSapQIDocDestinationType_DestinationName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocDestinationType#getQueueName <em>Queue Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Queue Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocDestinationType#getQueueName()
     * @see #getCamelSapQIDocDestinationType()
     * @generated
     */
    EAttribute getCamelSapQIDocDestinationType_QueueName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocDestinationType#getIdocType <em>Idoc Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idoc Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocDestinationType#getIdocType()
     * @see #getCamelSapQIDocDestinationType()
     * @generated
     */
    EAttribute getCamelSapQIDocDestinationType_IdocType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocDestinationType#getIdocTypeExtension <em>Idoc Type Extension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idoc Type Extension</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocDestinationType#getIdocTypeExtension()
     * @see #getCamelSapQIDocDestinationType()
     * @generated
     */
    EAttribute getCamelSapQIDocDestinationType_IdocTypeExtension();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocDestinationType#getSystemRelease <em>System Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>System Release</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocDestinationType#getSystemRelease()
     * @see #getCamelSapQIDocDestinationType()
     * @generated
     */
    EAttribute getCamelSapQIDocDestinationType_SystemRelease();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocDestinationType#getApplicationRelease <em>Application Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Application Release</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocDestinationType#getApplicationRelease()
     * @see #getCamelSapQIDocDestinationType()
     * @generated
     */
    EAttribute getCamelSapQIDocDestinationType_ApplicationRelease();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocListDestinationType <em>Camel Sap QI Doc List Destination Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Sap QI Doc List Destination Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocListDestinationType
     * @generated
     */
    EClass getCamelSapQIDocListDestinationType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocListDestinationType#getDestinationName <em>Destination Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Destination Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocListDestinationType#getDestinationName()
     * @see #getCamelSapQIDocListDestinationType()
     * @generated
     */
    EAttribute getCamelSapQIDocListDestinationType_DestinationName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocListDestinationType#getQueueName <em>Queue Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Queue Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocListDestinationType#getQueueName()
     * @see #getCamelSapQIDocListDestinationType()
     * @generated
     */
    EAttribute getCamelSapQIDocListDestinationType_QueueName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocListDestinationType#getIdocType <em>Idoc Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idoc Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocListDestinationType#getIdocType()
     * @see #getCamelSapQIDocListDestinationType()
     * @generated
     */
    EAttribute getCamelSapQIDocListDestinationType_IdocType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocListDestinationType#getIdocTypeExtension <em>Idoc Type Extension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idoc Type Extension</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocListDestinationType#getIdocTypeExtension()
     * @see #getCamelSapQIDocListDestinationType()
     * @generated
     */
    EAttribute getCamelSapQIDocListDestinationType_IdocTypeExtension();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocListDestinationType#getSystemRelease <em>System Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>System Release</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocListDestinationType#getSystemRelease()
     * @see #getCamelSapQIDocListDestinationType()
     * @generated
     */
    EAttribute getCamelSapQIDocListDestinationType_SystemRelease();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocListDestinationType#getApplicationRelease <em>Application Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Application Release</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocListDestinationType#getApplicationRelease()
     * @see #getCamelSapQIDocListDestinationType()
     * @generated
     */
    EAttribute getCamelSapQIDocListDestinationType_ApplicationRelease();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQRfcDestinationType <em>Camel Sap QRfc Destination Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Sap QRfc Destination Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQRfcDestinationType
     * @generated
     */
    EClass getCamelSapQRfcDestinationType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQRfcDestinationType#getDestinationName <em>Destination Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Destination Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQRfcDestinationType#getDestinationName()
     * @see #getCamelSapQRfcDestinationType()
     * @generated
     */
    EAttribute getCamelSapQRfcDestinationType_DestinationName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQRfcDestinationType#getQueueName <em>Queue Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Queue Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQRfcDestinationType#getQueueName()
     * @see #getCamelSapQRfcDestinationType()
     * @generated
     */
    EAttribute getCamelSapQRfcDestinationType_QueueName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQRfcDestinationType#getRfcName <em>Rfc Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rfc Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQRfcDestinationType#getRfcName()
     * @see #getCamelSapQRfcDestinationType()
     * @generated
     */
    EAttribute getCamelSapQRfcDestinationType_RfcName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQRfcDestinationType#getTransacted <em>Transacted</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transacted</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQRfcDestinationType#getTransacted()
     * @see #getCamelSapQRfcDestinationType()
     * @generated
     */
    EAttribute getCamelSapQRfcDestinationType_Transacted();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcDestinationType <em>Camel Sap SRfc Destination Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Sap SRfc Destination Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcDestinationType
     * @generated
     */
    EClass getCamelSapSRfcDestinationType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcDestinationType#getDestinationName <em>Destination Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Destination Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcDestinationType#getDestinationName()
     * @see #getCamelSapSRfcDestinationType()
     * @generated
     */
    EAttribute getCamelSapSRfcDestinationType_DestinationName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcDestinationType#getRfcName <em>Rfc Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rfc Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcDestinationType#getRfcName()
     * @see #getCamelSapSRfcDestinationType()
     * @generated
     */
    EAttribute getCamelSapSRfcDestinationType_RfcName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcDestinationType#getTransacted <em>Transacted</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transacted</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcDestinationType#getTransacted()
     * @see #getCamelSapSRfcDestinationType()
     * @generated
     */
    EAttribute getCamelSapSRfcDestinationType_Transacted();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcServerType <em>Camel Sap SRfc Server Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Sap SRfc Server Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcServerType
     * @generated
     */
    EClass getCamelSapSRfcServerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcServerType#getServerName <em>Server Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Server Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcServerType#getServerName()
     * @see #getCamelSapSRfcServerType()
     * @generated
     */
    EAttribute getCamelSapSRfcServerType_ServerName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcServerType#getRfcName <em>Rfc Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rfc Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcServerType#getRfcName()
     * @see #getCamelSapSRfcServerType()
     * @generated
     */
    EAttribute getCamelSapSRfcServerType_RfcName();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcDestinationType <em>Camel Sap TRfc Destination Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Sap TRfc Destination Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcDestinationType
     * @generated
     */
    EClass getCamelSapTRfcDestinationType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcDestinationType#getDestinationName <em>Destination Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Destination Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcDestinationType#getDestinationName()
     * @see #getCamelSapTRfcDestinationType()
     * @generated
     */
    EAttribute getCamelSapTRfcDestinationType_DestinationName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcDestinationType#getRfcName <em>Rfc Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rfc Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcDestinationType#getRfcName()
     * @see #getCamelSapTRfcDestinationType()
     * @generated
     */
    EAttribute getCamelSapTRfcDestinationType_RfcName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcDestinationType#getTransacted <em>Transacted</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transacted</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcDestinationType#getTransacted()
     * @see #getCamelSapTRfcDestinationType()
     * @generated
     */
    EAttribute getCamelSapTRfcDestinationType_Transacted();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcServerType <em>Camel Sap TRfc Server Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Sap TRfc Server Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcServerType
     * @generated
     */
    EClass getCamelSapTRfcServerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcServerType#getServerName <em>Server Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Server Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcServerType#getServerName()
     * @see #getCamelSapTRfcServerType()
     * @generated
     */
    EAttribute getCamelSapTRfcServerType_ServerName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcServerType#getRfcName <em>Rfc Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rfc Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcServerType#getRfcName()
     * @see #getCamelSapTRfcServerType()
     * @generated
     */
    EAttribute getCamelSapTRfcServerType_RfcName();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.DocumentRoot#getBindingSap <em>Binding Sap</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Sap</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.DocumentRoot#getBindingSap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingSap();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.ParameterType <em>Parameter Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.ParameterType
     * @generated
     */
    EClass getParameterType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.ParameterType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.ParameterType#getName()
     * @see #getParameterType()
     * @generated
     */
    EAttribute getParameterType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.ParameterType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.sap.ParameterType#getValue()
     * @see #getParameterType()
     * @generated
     */
    EAttribute getParameterType_Value();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SapFactory getSapFactory();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.AdditionalUriParametersTypeImpl <em>Additional Uri Parameters Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.AdditionalUriParametersTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getAdditionalUriParametersType()
         * @generated
         */
        EClass ADDITIONAL_URI_PARAMETERS_TYPE = eINSTANCE.getAdditionalUriParametersType();

        /**
         * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ADDITIONAL_URI_PARAMETERS_TYPE__PARAMETER = eINSTANCE.getAdditionalUriParametersType_Parameter();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.BaseCamelBindingImpl <em>Base Camel Binding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.BaseCamelBindingImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getBaseCamelBinding()
         * @generated
         */
        EClass BASE_CAMEL_BINDING = eINSTANCE.getBaseCamelBinding();

        /**
         * The meta object literal for the '<em><b>Context Mapper</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASE_CAMEL_BINDING__CONTEXT_MAPPER = eINSTANCE.getBaseCamelBinding_ContextMapper();

        /**
         * The meta object literal for the '<em><b>Message Composer</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASE_CAMEL_BINDING__MESSAGE_COMPOSER = eINSTANCE.getBaseCamelBinding_MessageComposer();

        /**
         * The meta object literal for the '<em><b>Additional Uri Parameters</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASE_CAMEL_BINDING__ADDITIONAL_URI_PARAMETERS = eINSTANCE.getBaseCamelBinding_AdditionalUriParameters();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapBindingTypeImpl <em>Camel Sap Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getCamelSapBindingType()
         * @generated
         */
        EClass CAMEL_SAP_BINDING_TYPE = eINSTANCE.getCamelSapBindingType();

        /**
         * The meta object literal for the '<em><b>Idoclist Server</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_SAP_BINDING_TYPE__IDOCLIST_SERVER = eINSTANCE.getCamelSapBindingType_IdoclistServer();

        /**
         * The meta object literal for the '<em><b>Srfc Server</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_SAP_BINDING_TYPE__SRFC_SERVER = eINSTANCE.getCamelSapBindingType_SrfcServer();

        /**
         * The meta object literal for the '<em><b>Trfc Server</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_SAP_BINDING_TYPE__TRFC_SERVER = eINSTANCE.getCamelSapBindingType_TrfcServer();

        /**
         * The meta object literal for the '<em><b>Idoc Destination</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_SAP_BINDING_TYPE__IDOC_DESTINATION = eINSTANCE.getCamelSapBindingType_IdocDestination();

        /**
         * The meta object literal for the '<em><b>Idoclist Destination</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_SAP_BINDING_TYPE__IDOCLIST_DESTINATION = eINSTANCE.getCamelSapBindingType_IdoclistDestination();

        /**
         * The meta object literal for the '<em><b>Qidoc Destination</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_SAP_BINDING_TYPE__QIDOC_DESTINATION = eINSTANCE.getCamelSapBindingType_QidocDestination();

        /**
         * The meta object literal for the '<em><b>Qidoclist Destination</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_SAP_BINDING_TYPE__QIDOCLIST_DESTINATION = eINSTANCE.getCamelSapBindingType_QidoclistDestination();

        /**
         * The meta object literal for the '<em><b>Qrfc Destination</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_SAP_BINDING_TYPE__QRFC_DESTINATION = eINSTANCE.getCamelSapBindingType_QrfcDestination();

        /**
         * The meta object literal for the '<em><b>Srfc Destination</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_SAP_BINDING_TYPE__SRFC_DESTINATION = eINSTANCE.getCamelSapBindingType_SrfcDestination();

        /**
         * The meta object literal for the '<em><b>Trfc Destination</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_SAP_BINDING_TYPE__TRFC_DESTINATION = eINSTANCE.getCamelSapBindingType_TrfcDestination();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapIDocDestinationTypeImpl <em>Camel Sap IDoc Destination Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapIDocDestinationTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getCamelSapIDocDestinationType()
         * @generated
         */
        EClass CAMEL_SAP_IDOC_DESTINATION_TYPE = eINSTANCE.getCamelSapIDocDestinationType();

        /**
         * The meta object literal for the '<em><b>Destination Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_IDOC_DESTINATION_TYPE__DESTINATION_NAME = eINSTANCE.getCamelSapIDocDestinationType_DestinationName();

        /**
         * The meta object literal for the '<em><b>Idoc Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_IDOC_DESTINATION_TYPE__IDOC_TYPE = eINSTANCE.getCamelSapIDocDestinationType_IdocType();

        /**
         * The meta object literal for the '<em><b>Idoc Type Extension</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_IDOC_DESTINATION_TYPE__IDOC_TYPE_EXTENSION = eINSTANCE.getCamelSapIDocDestinationType_IdocTypeExtension();

        /**
         * The meta object literal for the '<em><b>System Release</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_IDOC_DESTINATION_TYPE__SYSTEM_RELEASE = eINSTANCE.getCamelSapIDocDestinationType_SystemRelease();

        /**
         * The meta object literal for the '<em><b>Application Release</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_IDOC_DESTINATION_TYPE__APPLICATION_RELEASE = eINSTANCE.getCamelSapIDocDestinationType_ApplicationRelease();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapIDocListDestinationTypeImpl <em>Camel Sap IDoc List Destination Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapIDocListDestinationTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getCamelSapIDocListDestinationType()
         * @generated
         */
        EClass CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE = eINSTANCE.getCamelSapIDocListDestinationType();

        /**
         * The meta object literal for the '<em><b>Destination Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__DESTINATION_NAME = eINSTANCE.getCamelSapIDocListDestinationType_DestinationName();

        /**
         * The meta object literal for the '<em><b>Idoc Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__IDOC_TYPE = eINSTANCE.getCamelSapIDocListDestinationType_IdocType();

        /**
         * The meta object literal for the '<em><b>Idoc Type Extension</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__IDOC_TYPE_EXTENSION = eINSTANCE.getCamelSapIDocListDestinationType_IdocTypeExtension();

        /**
         * The meta object literal for the '<em><b>System Release</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__SYSTEM_RELEASE = eINSTANCE.getCamelSapIDocListDestinationType_SystemRelease();

        /**
         * The meta object literal for the '<em><b>Application Release</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__APPLICATION_RELEASE = eINSTANCE.getCamelSapIDocListDestinationType_ApplicationRelease();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapIDocListServerTypeImpl <em>Camel Sap IDoc List Server Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapIDocListServerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getCamelSapIDocListServerType()
         * @generated
         */
        EClass CAMEL_SAP_IDOC_LIST_SERVER_TYPE = eINSTANCE.getCamelSapIDocListServerType();

        /**
         * The meta object literal for the '<em><b>Server Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_IDOC_LIST_SERVER_TYPE__SERVER_NAME = eINSTANCE.getCamelSapIDocListServerType_ServerName();

        /**
         * The meta object literal for the '<em><b>Idoc Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_IDOC_LIST_SERVER_TYPE__IDOC_TYPE = eINSTANCE.getCamelSapIDocListServerType_IdocType();

        /**
         * The meta object literal for the '<em><b>Idoc Type Extension</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_IDOC_LIST_SERVER_TYPE__IDOC_TYPE_EXTENSION = eINSTANCE.getCamelSapIDocListServerType_IdocTypeExtension();

        /**
         * The meta object literal for the '<em><b>System Release</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_IDOC_LIST_SERVER_TYPE__SYSTEM_RELEASE = eINSTANCE.getCamelSapIDocListServerType_SystemRelease();

        /**
         * The meta object literal for the '<em><b>Application Release</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_IDOC_LIST_SERVER_TYPE__APPLICATION_RELEASE = eINSTANCE.getCamelSapIDocListServerType_ApplicationRelease();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapQIDocDestinationTypeImpl <em>Camel Sap QI Doc Destination Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapQIDocDestinationTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getCamelSapQIDocDestinationType()
         * @generated
         */
        EClass CAMEL_SAP_QI_DOC_DESTINATION_TYPE = eINSTANCE.getCamelSapQIDocDestinationType();

        /**
         * The meta object literal for the '<em><b>Destination Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_QI_DOC_DESTINATION_TYPE__DESTINATION_NAME = eINSTANCE.getCamelSapQIDocDestinationType_DestinationName();

        /**
         * The meta object literal for the '<em><b>Queue Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_QI_DOC_DESTINATION_TYPE__QUEUE_NAME = eINSTANCE.getCamelSapQIDocDestinationType_QueueName();

        /**
         * The meta object literal for the '<em><b>Idoc Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_QI_DOC_DESTINATION_TYPE__IDOC_TYPE = eINSTANCE.getCamelSapQIDocDestinationType_IdocType();

        /**
         * The meta object literal for the '<em><b>Idoc Type Extension</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_QI_DOC_DESTINATION_TYPE__IDOC_TYPE_EXTENSION = eINSTANCE.getCamelSapQIDocDestinationType_IdocTypeExtension();

        /**
         * The meta object literal for the '<em><b>System Release</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_QI_DOC_DESTINATION_TYPE__SYSTEM_RELEASE = eINSTANCE.getCamelSapQIDocDestinationType_SystemRelease();

        /**
         * The meta object literal for the '<em><b>Application Release</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_QI_DOC_DESTINATION_TYPE__APPLICATION_RELEASE = eINSTANCE.getCamelSapQIDocDestinationType_ApplicationRelease();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapQIDocListDestinationTypeImpl <em>Camel Sap QI Doc List Destination Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapQIDocListDestinationTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getCamelSapQIDocListDestinationType()
         * @generated
         */
        EClass CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE = eINSTANCE.getCamelSapQIDocListDestinationType();

        /**
         * The meta object literal for the '<em><b>Destination Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE__DESTINATION_NAME = eINSTANCE.getCamelSapQIDocListDestinationType_DestinationName();

        /**
         * The meta object literal for the '<em><b>Queue Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE__QUEUE_NAME = eINSTANCE.getCamelSapQIDocListDestinationType_QueueName();

        /**
         * The meta object literal for the '<em><b>Idoc Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE__IDOC_TYPE = eINSTANCE.getCamelSapQIDocListDestinationType_IdocType();

        /**
         * The meta object literal for the '<em><b>Idoc Type Extension</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE__IDOC_TYPE_EXTENSION = eINSTANCE.getCamelSapQIDocListDestinationType_IdocTypeExtension();

        /**
         * The meta object literal for the '<em><b>System Release</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE__SYSTEM_RELEASE = eINSTANCE.getCamelSapQIDocListDestinationType_SystemRelease();

        /**
         * The meta object literal for the '<em><b>Application Release</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE__APPLICATION_RELEASE = eINSTANCE.getCamelSapQIDocListDestinationType_ApplicationRelease();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapQRfcDestinationTypeImpl <em>Camel Sap QRfc Destination Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapQRfcDestinationTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getCamelSapQRfcDestinationType()
         * @generated
         */
        EClass CAMEL_SAP_QRFC_DESTINATION_TYPE = eINSTANCE.getCamelSapQRfcDestinationType();

        /**
         * The meta object literal for the '<em><b>Destination Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_QRFC_DESTINATION_TYPE__DESTINATION_NAME = eINSTANCE.getCamelSapQRfcDestinationType_DestinationName();

        /**
         * The meta object literal for the '<em><b>Queue Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_QRFC_DESTINATION_TYPE__QUEUE_NAME = eINSTANCE.getCamelSapQRfcDestinationType_QueueName();

        /**
         * The meta object literal for the '<em><b>Rfc Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_QRFC_DESTINATION_TYPE__RFC_NAME = eINSTANCE.getCamelSapQRfcDestinationType_RfcName();

        /**
         * The meta object literal for the '<em><b>Transacted</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_QRFC_DESTINATION_TYPE__TRANSACTED = eINSTANCE.getCamelSapQRfcDestinationType_Transacted();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapSRfcDestinationTypeImpl <em>Camel Sap SRfc Destination Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapSRfcDestinationTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getCamelSapSRfcDestinationType()
         * @generated
         */
        EClass CAMEL_SAP_SRFC_DESTINATION_TYPE = eINSTANCE.getCamelSapSRfcDestinationType();

        /**
         * The meta object literal for the '<em><b>Destination Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_SRFC_DESTINATION_TYPE__DESTINATION_NAME = eINSTANCE.getCamelSapSRfcDestinationType_DestinationName();

        /**
         * The meta object literal for the '<em><b>Rfc Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_SRFC_DESTINATION_TYPE__RFC_NAME = eINSTANCE.getCamelSapSRfcDestinationType_RfcName();

        /**
         * The meta object literal for the '<em><b>Transacted</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_SRFC_DESTINATION_TYPE__TRANSACTED = eINSTANCE.getCamelSapSRfcDestinationType_Transacted();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapSRfcServerTypeImpl <em>Camel Sap SRfc Server Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapSRfcServerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getCamelSapSRfcServerType()
         * @generated
         */
        EClass CAMEL_SAP_SRFC_SERVER_TYPE = eINSTANCE.getCamelSapSRfcServerType();

        /**
         * The meta object literal for the '<em><b>Server Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_SRFC_SERVER_TYPE__SERVER_NAME = eINSTANCE.getCamelSapSRfcServerType_ServerName();

        /**
         * The meta object literal for the '<em><b>Rfc Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_SRFC_SERVER_TYPE__RFC_NAME = eINSTANCE.getCamelSapSRfcServerType_RfcName();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapTRfcDestinationTypeImpl <em>Camel Sap TRfc Destination Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapTRfcDestinationTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getCamelSapTRfcDestinationType()
         * @generated
         */
        EClass CAMEL_SAP_TRFC_DESTINATION_TYPE = eINSTANCE.getCamelSapTRfcDestinationType();

        /**
         * The meta object literal for the '<em><b>Destination Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_TRFC_DESTINATION_TYPE__DESTINATION_NAME = eINSTANCE.getCamelSapTRfcDestinationType_DestinationName();

        /**
         * The meta object literal for the '<em><b>Rfc Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_TRFC_DESTINATION_TYPE__RFC_NAME = eINSTANCE.getCamelSapTRfcDestinationType_RfcName();

        /**
         * The meta object literal for the '<em><b>Transacted</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_TRFC_DESTINATION_TYPE__TRANSACTED = eINSTANCE.getCamelSapTRfcDestinationType_Transacted();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapTRfcServerTypeImpl <em>Camel Sap TRfc Server Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.CamelSapTRfcServerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getCamelSapTRfcServerType()
         * @generated
         */
        EClass CAMEL_SAP_TRFC_SERVER_TYPE = eINSTANCE.getCamelSapTRfcServerType();

        /**
         * The meta object literal for the '<em><b>Server Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_TRFC_SERVER_TYPE__SERVER_NAME = eINSTANCE.getCamelSapTRfcServerType_ServerName();

        /**
         * The meta object literal for the '<em><b>Rfc Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_SAP_TRFC_SERVER_TYPE__RFC_NAME = eINSTANCE.getCamelSapTRfcServerType_RfcName();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Binding Sap</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_SAP = eINSTANCE.getDocumentRoot_BindingSap();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.sap.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.ParameterTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.sap.impl.SapPackageImpl#getParameterType()
         * @generated
         */
        EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER_TYPE__NAME = eINSTANCE.getParameterType_Name();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER_TYPE__VALUE = eINSTANCE.getParameterType_Value();

    }

} //SapPackage
