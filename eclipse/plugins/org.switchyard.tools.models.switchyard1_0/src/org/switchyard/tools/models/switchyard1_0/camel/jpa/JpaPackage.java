/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.jpa;

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
 * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaFactory
 * @model kind="package"
 * @generated
 */
public interface JpaPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "jpa";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "urn:switchyard-component-camel-jpa:config:1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "jpa";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    JpaPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl.init();

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.AdditionalUriParametersTypeImpl <em>Additional Uri Parameters Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.AdditionalUriParametersTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getAdditionalUriParametersType()
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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.BaseCamelBindingImpl <em>Base Camel Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.BaseCamelBindingImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getBaseCamelBinding()
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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 3;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaProducerTypeImpl <em>Producer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaProducerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getJpaProducerType()
     * @generated
     */
    int JPA_PRODUCER_TYPE = 5;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.TimeUnitType <em>Time Unit Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.TimeUnitType
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getTimeUnitType()
     * @generated
     */
    int TIME_UNIT_TYPE = 7;

    /**
     * The meta object id for the '<em>Time Unit Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.TimeUnitType
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getTimeUnitTypeObject()
     * @generated
     */
    int TIME_UNIT_TYPE_OBJECT = 8;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.AdditionalUriParametersType <em>Additional Uri Parameters Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Additional Uri Parameters Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.AdditionalUriParametersType
     * @generated
     */
    EClass getAdditionalUriParametersType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.AdditionalUriParametersType#getParameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameter</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.AdditionalUriParametersType#getParameter()
     * @see #getAdditionalUriParametersType()
     * @generated
     */
    EReference getAdditionalUriParametersType_Parameter();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.BaseCamelBinding <em>Base Camel Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base Camel Binding</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.BaseCamelBinding
     * @generated
     */
    EClass getBaseCamelBinding();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.BaseCamelBinding#getContextMapper <em>Context Mapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Context Mapper</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.BaseCamelBinding#getContextMapper()
     * @see #getBaseCamelBinding()
     * @generated
     */
    EReference getBaseCamelBinding_ContextMapper();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.BaseCamelBinding#getMessageComposer <em>Message Composer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Message Composer</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.BaseCamelBinding#getMessageComposer()
     * @see #getBaseCamelBinding()
     * @generated
     */
    EReference getBaseCamelBinding_MessageComposer();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.BaseCamelBinding#getAdditionalUriParameters <em>Additional Uri Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Additional Uri Parameters</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.BaseCamelBinding#getAdditionalUriParameters()
     * @see #getBaseCamelBinding()
     * @generated
     */
    EReference getBaseCamelBinding_AdditionalUriParameters();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType <em>Camel Jpa Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Jpa Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType
     * @generated
     */
    EClass getCamelJpaBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType#getEntityClassName <em>Entity Class Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Entity Class Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType#getEntityClassName()
     * @see #getCamelJpaBindingType()
     * @generated
     */
    EAttribute getCamelJpaBindingType_EntityClassName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType#getPersistenceUnit <em>Persistence Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Persistence Unit</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType#getPersistenceUnit()
     * @see #getCamelJpaBindingType()
     * @generated
     */
    EAttribute getCamelJpaBindingType_PersistenceUnit();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType#getTransactionManager <em>Transaction Manager</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transaction Manager</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType#getTransactionManager()
     * @see #getCamelJpaBindingType()
     * @generated
     */
    EAttribute getCamelJpaBindingType_TransactionManager();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType#getConsume <em>Consume</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Consume</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType#getConsume()
     * @see #getCamelJpaBindingType()
     * @generated
     */
    EReference getCamelJpaBindingType_Consume();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType#getProduce <em>Produce</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Produce</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType#getProduce()
     * @see #getCamelJpaBindingType()
     * @generated
     */
    EReference getCamelJpaBindingType_Produce();

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl <em>Consumer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getJpaConsumerType()
     * @generated
     */
    int JPA_CONSUMER_TYPE = 4;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.CamelJpaBindingTypeImpl <em>Camel Jpa Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.CamelJpaBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getCamelJpaBindingType()
     * @generated
     */
    int CAMEL_JPA_BINDING_TYPE = 2;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__DOCUMENTATION = BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__ANY_ATTRIBUTE = BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__WIRE_FORMAT_GROUP = BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__WIRE_FORMAT = BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__OPERATION_SELECTOR_GROUP = BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__OPERATION_SELECTOR = BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__NAME = BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__POLICY_SETS = BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__REQUIRES = BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__URI = BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Additional Uri Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__ADDITIONAL_URI_PARAMETERS = BASE_CAMEL_BINDING__ADDITIONAL_URI_PARAMETERS;

    /**
     * The feature id for the '<em><b>Entity Class Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__ENTITY_CLASS_NAME = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Persistence Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__PERSISTENCE_UNIT = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Transaction Manager</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__TRANSACTION_MANAGER = BASE_CAMEL_BINDING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Consume</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__CONSUME = BASE_CAMEL_BINDING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Produce</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE__PRODUCE = BASE_CAMEL_BINDING_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Camel Jpa Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_JPA_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 5;

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
     * The feature id for the '<em><b>Binding Jpa</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_JPA = 3;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 4;

    /**
     * The feature id for the '<em><b>Scheduled Poll Consumer Type</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__SCHEDULED_POLL_CONSUMER_TYPE = 0;

    /**
     * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__INITIAL_DELAY = 1;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__DELAY = 2;

    /**
     * The feature id for the '<em><b>Use Fixed Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__USE_FIXED_DELAY = 3;

    /**
     * The feature id for the '<em><b>Send Empty Message When Idle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE = 4;

    /**
     * The feature id for the '<em><b>Time Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__TIME_UNIT = 5;

    /**
     * The feature id for the '<em><b>Scheduled Batch Poll Consumer Type</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__SCHEDULED_BATCH_POLL_CONSUMER_TYPE = 6;

    /**
     * The feature id for the '<em><b>Max Messages Per Poll</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL = 7;

    /**
     * The feature id for the '<em><b>Consume Delete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__CONSUME_DELETE = 8;

    /**
     * The feature id for the '<em><b>Consume Lock Entity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__CONSUME_LOCK_ENTITY = 9;

    /**
     * The feature id for the '<em><b>Maximum Results</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__MAXIMUM_RESULTS = 10;

    /**
     * The feature id for the '<em><b>Consumer Query</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__CONSUMER_QUERY = 11;

    /**
     * The feature id for the '<em><b>Consumer Named Query</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__CONSUMER_NAMED_QUERY = 12;

    /**
     * The feature id for the '<em><b>Consumer Native Query</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__CONSUMER_NATIVE_QUERY = 13;

    /**
     * The feature id for the '<em><b>Consumer Result Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__CONSUMER_RESULT_CLASS = 14;

    /**
     * The feature id for the '<em><b>Consumer Transacted</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE__CONSUMER_TRANSACTED = 15;

    /**
     * The number of structural features of the '<em>Consumer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_CONSUMER_TYPE_FEATURE_COUNT = 16;

    /**
     * The feature id for the '<em><b>Flush On Send</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_PRODUCER_TYPE__FLUSH_ON_SEND = 0;

    /**
     * The feature id for the '<em><b>Use Persist</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_PRODUCER_TYPE__USE_PERSIST = 1;

    /**
     * The number of structural features of the '<em>Producer Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JPA_PRODUCER_TYPE_FEATURE_COUNT = 2;


    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.ParameterTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getParameterType()
     * @generated
     */
    int PARAMETER_TYPE = 6;

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
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.DocumentRoot#getBindingJpa <em>Binding Jpa</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Jpa</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.DocumentRoot#getBindingJpa()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingJpa();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType <em>Producer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Producer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType
     * @generated
     */
    EClass getJpaProducerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType#isFlushOnSend <em>Flush On Send</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Flush On Send</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType#isFlushOnSend()
     * @see #getJpaProducerType()
     * @generated
     */
    EAttribute getJpaProducerType_FlushOnSend();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType#isUsePersist <em>Use Persist</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Persist</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaProducerType#isUsePersist()
     * @see #getJpaProducerType()
     * @generated
     */
    EAttribute getJpaProducerType_UsePersist();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.ParameterType <em>Parameter Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.ParameterType
     * @generated
     */
    EClass getParameterType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.ParameterType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.ParameterType#getName()
     * @see #getParameterType()
     * @generated
     */
    EAttribute getParameterType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.ParameterType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.ParameterType#getValue()
     * @see #getParameterType()
     * @generated
     */
    EAttribute getParameterType_Value();

    /**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.TimeUnitType <em>Time Unit Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Time Unit Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.TimeUnitType
     * @generated
     */
    EEnum getTimeUnitType();

    /**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.TimeUnitType <em>Time Unit Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Time Unit Type Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.TimeUnitType
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.camel.jpa.TimeUnitType"
     *        extendedMetaData="name='timeUnit_._type:Object' baseType='timeUnit_._type'"
     * @generated
     */
    EDataType getTimeUnitTypeObject();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType <em>Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Consumer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType
     * @generated
     */
    EClass getJpaConsumerType();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getScheduledPollConsumerType <em>Scheduled Poll Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Scheduled Poll Consumer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getScheduledPollConsumerType()
     * @see #getJpaConsumerType()
     * @generated
     */
    EAttribute getJpaConsumerType_ScheduledPollConsumerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getInitialDelay <em>Initial Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initial Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getInitialDelay()
     * @see #getJpaConsumerType()
     * @generated
     */
    EAttribute getJpaConsumerType_InitialDelay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getDelay <em>Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getDelay()
     * @see #getJpaConsumerType()
     * @generated
     */
    EAttribute getJpaConsumerType_Delay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#isUseFixedDelay <em>Use Fixed Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Fixed Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#isUseFixedDelay()
     * @see #getJpaConsumerType()
     * @generated
     */
    EAttribute getJpaConsumerType_UseFixedDelay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#isSendEmptyMessageWhenIdle <em>Send Empty Message When Idle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Send Empty Message When Idle</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#isSendEmptyMessageWhenIdle()
     * @see #getJpaConsumerType()
     * @generated
     */
    EAttribute getJpaConsumerType_SendEmptyMessageWhenIdle();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getTimeUnit <em>Time Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time Unit</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getTimeUnit()
     * @see #getJpaConsumerType()
     * @generated
     */
    EAttribute getJpaConsumerType_TimeUnit();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getScheduledBatchPollConsumerType <em>Scheduled Batch Poll Consumer Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Scheduled Batch Poll Consumer Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getScheduledBatchPollConsumerType()
     * @see #getJpaConsumerType()
     * @generated
     */
    EAttribute getJpaConsumerType_ScheduledBatchPollConsumerType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getMaxMessagesPerPoll <em>Max Messages Per Poll</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Messages Per Poll</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getMaxMessagesPerPoll()
     * @see #getJpaConsumerType()
     * @generated
     */
    EAttribute getJpaConsumerType_MaxMessagesPerPoll();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#isConsumeDelete <em>Consume Delete</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Consume Delete</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#isConsumeDelete()
     * @see #getJpaConsumerType()
     * @generated
     */
    EAttribute getJpaConsumerType_ConsumeDelete();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#isConsumeLockEntity <em>Consume Lock Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Consume Lock Entity</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#isConsumeLockEntity()
     * @see #getJpaConsumerType()
     * @generated
     */
    EAttribute getJpaConsumerType_ConsumeLockEntity();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getMaximumResults <em>Maximum Results</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Maximum Results</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getMaximumResults()
     * @see #getJpaConsumerType()
     * @generated
     */
    EAttribute getJpaConsumerType_MaximumResults();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerQuery <em>Consumer Query</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Consumer Query</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerQuery()
     * @see #getJpaConsumerType()
     * @generated
     */
    EAttribute getJpaConsumerType_ConsumerQuery();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerNamedQuery <em>Consumer Named Query</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Consumer Named Query</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerNamedQuery()
     * @see #getJpaConsumerType()
     * @generated
     */
    EAttribute getJpaConsumerType_ConsumerNamedQuery();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerNativeQuery <em>Consumer Native Query</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Consumer Native Query</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerNativeQuery()
     * @see #getJpaConsumerType()
     * @generated
     */
    EAttribute getJpaConsumerType_ConsumerNativeQuery();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerResultClass <em>Consumer Result Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Consumer Result Class</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#getConsumerResultClass()
     * @see #getJpaConsumerType()
     * @generated
     */
    EAttribute getJpaConsumerType_ConsumerResultClass();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#isConsumerTransacted <em>Consumer Transacted</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Consumer Transacted</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaConsumerType#isConsumerTransacted()
     * @see #getJpaConsumerType()
     * @generated
     */
    EAttribute getJpaConsumerType_ConsumerTransacted();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    JpaFactory getJpaFactory();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.AdditionalUriParametersTypeImpl <em>Additional Uri Parameters Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.AdditionalUriParametersTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getAdditionalUriParametersType()
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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.BaseCamelBindingImpl <em>Base Camel Binding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.BaseCamelBindingImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getBaseCamelBinding()
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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Binding Jpa</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_JPA = eINSTANCE.getDocumentRoot_BindingJpa();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaProducerTypeImpl <em>Producer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaProducerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getJpaProducerType()
         * @generated
         */
        EClass JPA_PRODUCER_TYPE = eINSTANCE.getJpaProducerType();

        /**
         * The meta object literal for the '<em><b>Flush On Send</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_PRODUCER_TYPE__FLUSH_ON_SEND = eINSTANCE.getJpaProducerType_FlushOnSend();

        /**
         * The meta object literal for the '<em><b>Use Persist</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_PRODUCER_TYPE__USE_PERSIST = eINSTANCE.getJpaProducerType_UsePersist();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.ParameterTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getParameterType()
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

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.TimeUnitType <em>Time Unit Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.TimeUnitType
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getTimeUnitType()
         * @generated
         */
        EEnum TIME_UNIT_TYPE = eINSTANCE.getTimeUnitType();

        /**
         * The meta object literal for the '<em>Time Unit Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.TimeUnitType
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getTimeUnitTypeObject()
         * @generated
         */
        EDataType TIME_UNIT_TYPE_OBJECT = eINSTANCE.getTimeUnitTypeObject();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl <em>Consumer Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaConsumerTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getJpaConsumerType()
         * @generated
         */
        EClass JPA_CONSUMER_TYPE = eINSTANCE.getJpaConsumerType();

        /**
         * The meta object literal for the '<em><b>Scheduled Poll Consumer Type</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_CONSUMER_TYPE__SCHEDULED_POLL_CONSUMER_TYPE = eINSTANCE.getJpaConsumerType_ScheduledPollConsumerType();

        /**
         * The meta object literal for the '<em><b>Initial Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_CONSUMER_TYPE__INITIAL_DELAY = eINSTANCE.getJpaConsumerType_InitialDelay();

        /**
         * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_CONSUMER_TYPE__DELAY = eINSTANCE.getJpaConsumerType_Delay();

        /**
         * The meta object literal for the '<em><b>Use Fixed Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_CONSUMER_TYPE__USE_FIXED_DELAY = eINSTANCE.getJpaConsumerType_UseFixedDelay();

        /**
         * The meta object literal for the '<em><b>Send Empty Message When Idle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE = eINSTANCE.getJpaConsumerType_SendEmptyMessageWhenIdle();

        /**
         * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_CONSUMER_TYPE__TIME_UNIT = eINSTANCE.getJpaConsumerType_TimeUnit();

        /**
         * The meta object literal for the '<em><b>Scheduled Batch Poll Consumer Type</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_CONSUMER_TYPE__SCHEDULED_BATCH_POLL_CONSUMER_TYPE = eINSTANCE.getJpaConsumerType_ScheduledBatchPollConsumerType();

        /**
         * The meta object literal for the '<em><b>Max Messages Per Poll</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL = eINSTANCE.getJpaConsumerType_MaxMessagesPerPoll();

        /**
         * The meta object literal for the '<em><b>Consume Delete</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_CONSUMER_TYPE__CONSUME_DELETE = eINSTANCE.getJpaConsumerType_ConsumeDelete();

        /**
         * The meta object literal for the '<em><b>Consume Lock Entity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_CONSUMER_TYPE__CONSUME_LOCK_ENTITY = eINSTANCE.getJpaConsumerType_ConsumeLockEntity();

        /**
         * The meta object literal for the '<em><b>Maximum Results</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_CONSUMER_TYPE__MAXIMUM_RESULTS = eINSTANCE.getJpaConsumerType_MaximumResults();

        /**
         * The meta object literal for the '<em><b>Consumer Query</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_CONSUMER_TYPE__CONSUMER_QUERY = eINSTANCE.getJpaConsumerType_ConsumerQuery();

        /**
         * The meta object literal for the '<em><b>Consumer Named Query</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_CONSUMER_TYPE__CONSUMER_NAMED_QUERY = eINSTANCE.getJpaConsumerType_ConsumerNamedQuery();

        /**
         * The meta object literal for the '<em><b>Consumer Native Query</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_CONSUMER_TYPE__CONSUMER_NATIVE_QUERY = eINSTANCE.getJpaConsumerType_ConsumerNativeQuery();

        /**
         * The meta object literal for the '<em><b>Consumer Result Class</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_CONSUMER_TYPE__CONSUMER_RESULT_CLASS = eINSTANCE.getJpaConsumerType_ConsumerResultClass();

        /**
         * The meta object literal for the '<em><b>Consumer Transacted</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JPA_CONSUMER_TYPE__CONSUMER_TRANSACTED = eINSTANCE.getJpaConsumerType_ConsumerTransacted();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.CamelJpaBindingTypeImpl <em>Camel Jpa Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.CamelJpaBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.jpa.impl.JpaPackageImpl#getCamelJpaBindingType()
         * @generated
         */
        EClass CAMEL_JPA_BINDING_TYPE = eINSTANCE.getCamelJpaBindingType();

        /**
         * The meta object literal for the '<em><b>Entity Class Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JPA_BINDING_TYPE__ENTITY_CLASS_NAME = eINSTANCE.getCamelJpaBindingType_EntityClassName();

        /**
         * The meta object literal for the '<em><b>Persistence Unit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JPA_BINDING_TYPE__PERSISTENCE_UNIT = eINSTANCE.getCamelJpaBindingType_PersistenceUnit();

        /**
         * The meta object literal for the '<em><b>Transaction Manager</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_JPA_BINDING_TYPE__TRANSACTION_MANAGER = eINSTANCE.getCamelJpaBindingType_TransactionManager();

        /**
         * The meta object literal for the '<em><b>Consume</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_JPA_BINDING_TYPE__CONSUME = eINSTANCE.getCamelJpaBindingType_Consume();

        /**
         * The meta object literal for the '<em><b>Produce</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAMEL_JPA_BINDING_TYPE__PRODUCE = eINSTANCE.getCamelJpaBindingType_Produce();

    }

} //JpaPackage
