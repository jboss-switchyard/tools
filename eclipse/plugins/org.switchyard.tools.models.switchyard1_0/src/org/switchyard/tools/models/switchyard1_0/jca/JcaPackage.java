/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.jca;

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
 * @see org.switchyard.tools.models.switchyard1_0.jca.JcaFactory
 * @model kind="package"
 * @generated
 */
public interface JcaPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "jca";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "urn:switchyard-component-jca:config:2.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "jca";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    JcaPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl.init();

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.ActivationSpecImpl <em>Activation Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.ActivationSpecImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getActivationSpec()
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
     * The number of structural features of the '<em>Activation Spec</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVATION_SPEC_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.ConnectionImpl <em>Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.ConnectionImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getConnection()
     * @generated
     */
    int CONNECTION = 2;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.ConnectionSpecImpl <em>Connection Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.ConnectionSpecImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getConnectionSpec()
     * @generated
     */
    int CONNECTION_SPEC = 3;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 4;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.InteractionSpecImpl <em>Interaction Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.InteractionSpecImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getInteractionSpec()
     * @generated
     */
    int INTERACTION_SPEC = 6;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCABindingImpl <em>JCA Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JCABindingImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCABinding()
     * @generated
     */
    int JCA_BINDING = 7;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAInboundConnectionImpl <em>JCA Inbound Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JCAInboundConnectionImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCAInboundConnection()
     * @generated
     */
    int JCA_INBOUND_CONNECTION = 8;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAInboundInteractionImpl <em>JCA Inbound Interaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JCAInboundInteractionImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCAInboundInteraction()
     * @generated
     */
    int JCA_INBOUND_INTERACTION = 9;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundConnectionImpl <em>JCA Outbound Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundConnectionImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCAOutboundConnection()
     * @generated
     */
    int JCA_OUTBOUND_CONNECTION = 10;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundInteractionImpl <em>JCA Outbound Interaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundInteractionImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCAOutboundInteraction()
     * @generated
     */
    int JCA_OUTBOUND_INTERACTION = 11;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.PropertyImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getProperty()
     * @generated
     */
    int PROPERTY = 13;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.ResourceAdapterImpl <em>Resource Adapter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.ResourceAdapterImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getResourceAdapter()
     * @generated
     */
    int RESOURCE_ADAPTER = 14;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.ProcessorImpl <em>Processor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.ProcessorImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getProcessor()
     * @generated
     */
    int PROCESSOR = 12;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.EndpointImpl <em>Endpoint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.EndpointImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getEndpoint()
     * @generated
     */
    int ENDPOINT = 5;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.BatchCommitImpl <em>Batch Commit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.BatchCommitImpl
     * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getBatchCommit()
     * @generated
     */
    int BATCH_COMMIT = 1;

    /**
     * The feature id for the '<em><b>Batch Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BATCH_COMMIT__BATCH_SIZE = 0;

    /**
     * The feature id for the '<em><b>Batch Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BATCH_COMMIT__BATCH_TIMEOUT = 1;

    /**
     * The number of structural features of the '<em>Batch Commit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BATCH_COMMIT_FEATURE_COUNT = 2;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__PROPERTY = 0;

    /**
     * The feature id for the '<em><b>Jndi Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__JNDI_NAME = 1;

    /**
     * The number of structural features of the '<em>Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_FEATURE_COUNT = 2;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_SPEC__PROPERTY = 0;

    /**
     * The number of structural features of the '<em>Connection Spec</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_SPEC_FEATURE_COUNT = 1;

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
     * The feature id for the '<em><b>Binding Jca</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_JCA = 3;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 4;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT__PROPERTY = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT__TYPE = 1;

    /**
     * The number of structural features of the '<em>Endpoint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT_FEATURE_COUNT = 2;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_SPEC__PROPERTY = 0;

    /**
     * The number of structural features of the '<em>Interaction Spec</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_SPEC_FEATURE_COUNT = 1;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__DOCUMENTATION = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__ANY_ATTRIBUTE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__WIRE_FORMAT_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__WIRE_FORMAT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__OPERATION_SELECTOR_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__OPERATION_SELECTOR = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__NAME = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__POLICY_SETS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__REQUIRES = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__URI = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__CONTEXT_MAPPER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__MESSAGE_COMPOSER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Outbound Connection</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__OUTBOUND_CONNECTION = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Inbound Connection</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__INBOUND_CONNECTION = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Outbound Interaction</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__OUTBOUND_INTERACTION = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Inbound Interaction</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__INBOUND_INTERACTION = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__PROPERTY = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Extensions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING__EXTENSIONS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>JCA Binding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_BINDING_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 8;

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
     * The number of structural features of the '<em>JCA Inbound Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_INBOUND_CONNECTION_FEATURE_COUNT = 2;

    /**
     * The feature id for the '<em><b>Listener</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_INBOUND_INTERACTION__LISTENER = 0;

    /**
     * The feature id for the '<em><b>Endpoint</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_INBOUND_INTERACTION__ENDPOINT = 1;

    /**
     * The feature id for the '<em><b>Transacted</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_INBOUND_INTERACTION__TRANSACTED = 2;

    /**
     * The feature id for the '<em><b>Batch Commit</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_INBOUND_INTERACTION__BATCH_COMMIT = 3;

    /**
     * The number of structural features of the '<em>JCA Inbound Interaction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_INBOUND_INTERACTION_FEATURE_COUNT = 4;

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
     * The number of structural features of the '<em>JCA Outbound Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_OUTBOUND_CONNECTION_FEATURE_COUNT = 2;

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
     * The feature id for the '<em><b>Processor</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_OUTBOUND_INTERACTION__PROCESSOR = 2;

    /**
     * The number of structural features of the '<em>JCA Outbound Interaction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JCA_OUTBOUND_INTERACTION_FEATURE_COUNT = 3;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR__PROPERTY = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR__TYPE = 1;

    /**
     * The number of structural features of the '<em>Processor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSOR_FEATURE_COUNT = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__NAME = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__VALUE = 1;

    /**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_FEATURE_COUNT = 2;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_ADAPTER__PROPERTY = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_ADAPTER__NAME = 1;

    /**
     * The number of structural features of the '<em>Resource Adapter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_ADAPTER_FEATURE_COUNT = 2;

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec <em>Activation Spec</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Activation Spec</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec
     * @generated
     */
    EClass getActivationSpec();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec#getProperty()
     * @see #getActivationSpec()
     * @generated
     */
    EReference getActivationSpec_Property();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.Connection <em>Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connection</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Connection
     * @generated
     */
    EClass getConnection();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.jca.Connection#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Connection#getProperty()
     * @see #getConnection()
     * @generated
     */
    EReference getConnection_Property();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.Connection#getJndiName <em>Jndi Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Jndi Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Connection#getJndiName()
     * @see #getConnection()
     * @generated
     */
    EAttribute getConnection_JndiName();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.ConnectionSpec <em>Connection Spec</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connection Spec</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ConnectionSpec
     * @generated
     */
    EClass getConnectionSpec();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.jca.ConnectionSpec#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ConnectionSpec#getProperty()
     * @see #getConnectionSpec()
     * @generated
     */
    EReference getConnectionSpec_Property();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot#getBindingJca <em>Binding Jca</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Jca</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot#getBindingJca()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingJca();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.BatchCommit <em>Batch Commit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Batch Commit</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.BatchCommit
     * @generated
     */
    EClass getBatchCommit();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.BatchCommit#getBatchSize <em>Batch Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Batch Size</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.BatchCommit#getBatchSize()
     * @see #getBatchCommit()
     * @generated
     */
    EAttribute getBatchCommit_BatchSize();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.BatchCommit#getBatchTimeout <em>Batch Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Batch Timeout</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.BatchCommit#getBatchTimeout()
     * @see #getBatchCommit()
     * @generated
     */
    EAttribute getBatchCommit_BatchTimeout();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.InteractionSpec <em>Interaction Spec</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction Spec</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.InteractionSpec
     * @generated
     */
    EClass getInteractionSpec();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.jca.InteractionSpec#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.InteractionSpec#getProperty()
     * @see #getInteractionSpec()
     * @generated
     */
    EReference getInteractionSpec_Property();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding <em>JCA Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>JCA Binding</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCABinding
     * @generated
     */
    EClass getJCABinding();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getContextMapper <em>Context Mapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Context Mapper</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getContextMapper()
     * @see #getJCABinding()
     * @generated
     */
    EReference getJCABinding_ContextMapper();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getMessageComposer <em>Message Composer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Message Composer</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getMessageComposer()
     * @see #getJCABinding()
     * @generated
     */
    EReference getJCABinding_MessageComposer();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getOutboundConnection <em>Outbound Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Outbound Connection</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getOutboundConnection()
     * @see #getJCABinding()
     * @generated
     */
    EReference getJCABinding_OutboundConnection();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getInboundConnection <em>Inbound Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Inbound Connection</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getInboundConnection()
     * @see #getJCABinding()
     * @generated
     */
    EReference getJCABinding_InboundConnection();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getInboundInteraction <em>Inbound Interaction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Inbound Interaction</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getInboundInteraction()
     * @see #getJCABinding()
     * @generated
     */
    EReference getJCABinding_InboundInteraction();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getOutboundInteraction <em>Outbound Interaction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Outbound Interaction</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getOutboundInteraction()
     * @see #getJCABinding()
     * @generated
     */
    EReference getJCABinding_OutboundInteraction();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getProperty()
     * @see #getJCABinding()
     * @generated
     */
    EReference getJCABinding_Property();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getExtensions <em>Extensions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Extensions</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCABinding#getExtensions()
     * @see #getJCABinding()
     * @generated
     */
    EReference getJCABinding_Extensions();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection <em>JCA Inbound Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>JCA Inbound Connection</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection
     * @generated
     */
    EClass getJCAInboundConnection();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection#getResourceAdapter <em>Resource Adapter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Resource Adapter</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection#getResourceAdapter()
     * @see #getJCAInboundConnection()
     * @generated
     */
    EReference getJCAInboundConnection_ResourceAdapter();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection#getActivationSpec <em>Activation Spec</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Activation Spec</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection#getActivationSpec()
     * @see #getJCAInboundConnection()
     * @generated
     */
    EReference getJCAInboundConnection_ActivationSpec();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction <em>JCA Inbound Interaction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>JCA Inbound Interaction</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction
     * @generated
     */
    EClass getJCAInboundInteraction();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#getListener <em>Listener</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Listener</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#getListener()
     * @see #getJCAInboundInteraction()
     * @generated
     */
    EAttribute getJCAInboundInteraction_Listener();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#getEndpoint <em>Endpoint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Endpoint</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#getEndpoint()
     * @see #getJCAInboundInteraction()
     * @generated
     */
    EReference getJCAInboundInteraction_Endpoint();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#isTransacted <em>Transacted</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transacted</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#isTransacted()
     * @see #getJCAInboundInteraction()
     * @generated
     */
    EAttribute getJCAInboundInteraction_Transacted();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#getBatchCommit <em>Batch Commit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Batch Commit</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction#getBatchCommit()
     * @see #getJCAInboundInteraction()
     * @generated
     */
    EReference getJCAInboundInteraction_BatchCommit();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection <em>JCA Outbound Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>JCA Outbound Connection</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection
     * @generated
     */
    EClass getJCAOutboundConnection();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getResourceAdapter <em>Resource Adapter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Resource Adapter</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getResourceAdapter()
     * @see #getJCAOutboundConnection()
     * @generated
     */
    EReference getJCAOutboundConnection_ResourceAdapter();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getConnection <em>Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Connection</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection#getConnection()
     * @see #getJCAOutboundConnection()
     * @generated
     */
    EReference getJCAOutboundConnection_Connection();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction <em>JCA Outbound Interaction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>JCA Outbound Interaction</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction
     * @generated
     */
    EClass getJCAOutboundInteraction();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction#getConnectionSpec <em>Connection Spec</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Connection Spec</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction#getConnectionSpec()
     * @see #getJCAOutboundInteraction()
     * @generated
     */
    EReference getJCAOutboundInteraction_ConnectionSpec();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction#getInteractionSpec <em>Interaction Spec</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Interaction Spec</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction#getInteractionSpec()
     * @see #getJCAOutboundInteraction()
     * @generated
     */
    EReference getJCAOutboundInteraction_InteractionSpec();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction#getProcessor <em>Processor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Processor</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction#getProcessor()
     * @see #getJCAOutboundInteraction()
     * @generated
     */
    EReference getJCAOutboundInteraction_Processor();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Property
     * @generated
     */
    EClass getProperty();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.Property#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Property#getName()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Name();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.Property#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Property#getValue()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Value();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter <em>Resource Adapter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resource Adapter</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter
     * @generated
     */
    EClass getResourceAdapter();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter#getProperty()
     * @see #getResourceAdapter()
     * @generated
     */
    EReference getResourceAdapter_Property();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter#getName()
     * @see #getResourceAdapter()
     * @generated
     */
    EAttribute getResourceAdapter_Name();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.Processor <em>Processor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Processor</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Processor
     * @generated
     */
    EClass getProcessor();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.jca.Processor#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Processor#getProperty()
     * @see #getProcessor()
     * @generated
     */
    EReference getProcessor_Property();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.Processor#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Processor#getType()
     * @see #getProcessor()
     * @generated
     */
    EAttribute getProcessor_Type();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.jca.Endpoint <em>Endpoint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Endpoint</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Endpoint
     * @generated
     */
    EClass getEndpoint();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.jca.Endpoint#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Endpoint#getProperty()
     * @see #getEndpoint()
     * @generated
     */
    EReference getEndpoint_Property();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.jca.Endpoint#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.jca.Endpoint#getType()
     * @see #getEndpoint()
     * @generated
     */
    EAttribute getEndpoint_Type();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    JcaFactory getJcaFactory();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.ActivationSpecImpl <em>Activation Spec</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.ActivationSpecImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getActivationSpec()
         * @generated
         */
        EClass ACTIVATION_SPEC = eINSTANCE.getActivationSpec();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVATION_SPEC__PROPERTY = eINSTANCE.getActivationSpec_Property();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.ConnectionImpl <em>Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.ConnectionImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getConnection()
         * @generated
         */
        EClass CONNECTION = eINSTANCE.getConnection();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTION__PROPERTY = eINSTANCE.getConnection_Property();

        /**
         * The meta object literal for the '<em><b>Jndi Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION__JNDI_NAME = eINSTANCE.getConnection_JndiName();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.ConnectionSpecImpl <em>Connection Spec</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.ConnectionSpecImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getConnectionSpec()
         * @generated
         */
        EClass CONNECTION_SPEC = eINSTANCE.getConnectionSpec();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTION_SPEC__PROPERTY = eINSTANCE.getConnectionSpec_Property();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Binding Jca</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_JCA = eINSTANCE.getDocumentRoot_BindingJca();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.BatchCommitImpl <em>Batch Commit</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.BatchCommitImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getBatchCommit()
         * @generated
         */
        EClass BATCH_COMMIT = eINSTANCE.getBatchCommit();

        /**
         * The meta object literal for the '<em><b>Batch Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BATCH_COMMIT__BATCH_SIZE = eINSTANCE.getBatchCommit_BatchSize();

        /**
         * The meta object literal for the '<em><b>Batch Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BATCH_COMMIT__BATCH_TIMEOUT = eINSTANCE.getBatchCommit_BatchTimeout();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.InteractionSpecImpl <em>Interaction Spec</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.InteractionSpecImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getInteractionSpec()
         * @generated
         */
        EClass INTERACTION_SPEC = eINSTANCE.getInteractionSpec();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_SPEC__PROPERTY = eINSTANCE.getInteractionSpec_Property();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCABindingImpl <em>JCA Binding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JCABindingImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCABinding()
         * @generated
         */
        EClass JCA_BINDING = eINSTANCE.getJCABinding();

        /**
         * The meta object literal for the '<em><b>Context Mapper</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_BINDING__CONTEXT_MAPPER = eINSTANCE.getJCABinding_ContextMapper();

        /**
         * The meta object literal for the '<em><b>Message Composer</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_BINDING__MESSAGE_COMPOSER = eINSTANCE.getJCABinding_MessageComposer();

        /**
         * The meta object literal for the '<em><b>Outbound Connection</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_BINDING__OUTBOUND_CONNECTION = eINSTANCE.getJCABinding_OutboundConnection();

        /**
         * The meta object literal for the '<em><b>Inbound Connection</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_BINDING__INBOUND_CONNECTION = eINSTANCE.getJCABinding_InboundConnection();

        /**
         * The meta object literal for the '<em><b>Inbound Interaction</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_BINDING__INBOUND_INTERACTION = eINSTANCE.getJCABinding_InboundInteraction();

        /**
         * The meta object literal for the '<em><b>Outbound Interaction</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_BINDING__OUTBOUND_INTERACTION = eINSTANCE.getJCABinding_OutboundInteraction();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_BINDING__PROPERTY = eINSTANCE.getJCABinding_Property();

        /**
         * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_BINDING__EXTENSIONS = eINSTANCE.getJCABinding_Extensions();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAInboundConnectionImpl <em>JCA Inbound Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JCAInboundConnectionImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCAInboundConnection()
         * @generated
         */
        EClass JCA_INBOUND_CONNECTION = eINSTANCE.getJCAInboundConnection();

        /**
         * The meta object literal for the '<em><b>Resource Adapter</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_INBOUND_CONNECTION__RESOURCE_ADAPTER = eINSTANCE.getJCAInboundConnection_ResourceAdapter();

        /**
         * The meta object literal for the '<em><b>Activation Spec</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_INBOUND_CONNECTION__ACTIVATION_SPEC = eINSTANCE.getJCAInboundConnection_ActivationSpec();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAInboundInteractionImpl <em>JCA Inbound Interaction</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JCAInboundInteractionImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCAInboundInteraction()
         * @generated
         */
        EClass JCA_INBOUND_INTERACTION = eINSTANCE.getJCAInboundInteraction();

        /**
         * The meta object literal for the '<em><b>Listener</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JCA_INBOUND_INTERACTION__LISTENER = eINSTANCE.getJCAInboundInteraction_Listener();

        /**
         * The meta object literal for the '<em><b>Endpoint</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_INBOUND_INTERACTION__ENDPOINT = eINSTANCE.getJCAInboundInteraction_Endpoint();

        /**
         * The meta object literal for the '<em><b>Transacted</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JCA_INBOUND_INTERACTION__TRANSACTED = eINSTANCE.getJCAInboundInteraction_Transacted();

        /**
         * The meta object literal for the '<em><b>Batch Commit</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_INBOUND_INTERACTION__BATCH_COMMIT = eINSTANCE.getJCAInboundInteraction_BatchCommit();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundConnectionImpl <em>JCA Outbound Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundConnectionImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCAOutboundConnection()
         * @generated
         */
        EClass JCA_OUTBOUND_CONNECTION = eINSTANCE.getJCAOutboundConnection();

        /**
         * The meta object literal for the '<em><b>Resource Adapter</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_OUTBOUND_CONNECTION__RESOURCE_ADAPTER = eINSTANCE.getJCAOutboundConnection_ResourceAdapter();

        /**
         * The meta object literal for the '<em><b>Connection</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_OUTBOUND_CONNECTION__CONNECTION = eINSTANCE.getJCAOutboundConnection_Connection();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundInteractionImpl <em>JCA Outbound Interaction</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JCAOutboundInteractionImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getJCAOutboundInteraction()
         * @generated
         */
        EClass JCA_OUTBOUND_INTERACTION = eINSTANCE.getJCAOutboundInteraction();

        /**
         * The meta object literal for the '<em><b>Connection Spec</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_OUTBOUND_INTERACTION__CONNECTION_SPEC = eINSTANCE.getJCAOutboundInteraction_ConnectionSpec();

        /**
         * The meta object literal for the '<em><b>Interaction Spec</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_OUTBOUND_INTERACTION__INTERACTION_SPEC = eINSTANCE.getJCAOutboundInteraction_InteractionSpec();

        /**
         * The meta object literal for the '<em><b>Processor</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JCA_OUTBOUND_INTERACTION__PROCESSOR = eINSTANCE.getJCAOutboundInteraction_Processor();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.PropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.PropertyImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getProperty()
         * @generated
         */
        EClass PROPERTY = eINSTANCE.getProperty();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.ResourceAdapterImpl <em>Resource Adapter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.ResourceAdapterImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getResourceAdapter()
         * @generated
         */
        EClass RESOURCE_ADAPTER = eINSTANCE.getResourceAdapter();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESOURCE_ADAPTER__PROPERTY = eINSTANCE.getResourceAdapter_Property();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_ADAPTER__NAME = eINSTANCE.getResourceAdapter_Name();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.ProcessorImpl <em>Processor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.ProcessorImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getProcessor()
         * @generated
         */
        EClass PROCESSOR = eINSTANCE.getProcessor();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESSOR__PROPERTY = eINSTANCE.getProcessor_Property();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESSOR__TYPE = eINSTANCE.getProcessor_Type();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.jca.impl.EndpointImpl <em>Endpoint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.EndpointImpl
         * @see org.switchyard.tools.models.switchyard1_0.jca.impl.JcaPackageImpl#getEndpoint()
         * @generated
         */
        EClass ENDPOINT = eINSTANCE.getEndpoint();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENDPOINT__PROPERTY = eINSTANCE.getEndpoint_Property();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENDPOINT__TYPE = eINSTANCE.getEndpoint_Type();

    }

} //JcaPackage
