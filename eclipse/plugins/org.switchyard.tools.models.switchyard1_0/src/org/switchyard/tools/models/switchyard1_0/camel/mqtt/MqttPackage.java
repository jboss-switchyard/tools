/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.mqtt;

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
 * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttFactory
 * @model kind="package"
 * @generated
 */
public interface MqttPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "mqtt";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "urn:switchyard-component-camel-mqtt:config:2.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "mqtt";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MqttPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.MqttPackageImpl.init();

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.AdditionalUriParametersTypeImpl <em>Additional Uri Parameters Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.AdditionalUriParametersTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.MqttPackageImpl#getAdditionalUriParametersType()
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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.BaseCamelBindingImpl <em>Base Camel Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.BaseCamelBindingImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.MqttPackageImpl#getBaseCamelBinding()
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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.CamelMqttBindingTypeImpl <em>Camel Mqtt Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.CamelMqttBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.MqttPackageImpl#getCamelMqttBindingType()
     * @generated
     */
    int CAMEL_MQTT_BINDING_TYPE = 2;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__DOCUMENTATION = BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__ANY_ATTRIBUTE = BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__WIRE_FORMAT_GROUP = BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__WIRE_FORMAT = BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__OPERATION_SELECTOR_GROUP = BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__OPERATION_SELECTOR = BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__NAME = BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__POLICY_SETS = BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__REQUIRES = BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__URI = BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Additional Uri Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__ADDITIONAL_URI_PARAMETERS = BASE_CAMEL_BINDING__ADDITIONAL_URI_PARAMETERS;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__HOST = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Local Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__LOCAL_ADDRESS = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Connect Attempts Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__CONNECT_ATTEMPTS_MAX = BASE_CAMEL_BINDING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Reconnect Attempts Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__RECONNECT_ATTEMPTS_MAX = BASE_CAMEL_BINDING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Reconnect Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__RECONNECT_DELAY = BASE_CAMEL_BINDING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Reconnect Back Off Multiplier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__RECONNECT_BACK_OFF_MULTIPLIER = BASE_CAMEL_BINDING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Reconnect Delay Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__RECONNECT_DELAY_MAX = BASE_CAMEL_BINDING_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>User Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__USER_NAME = BASE_CAMEL_BINDING_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__PASSWORD = BASE_CAMEL_BINDING_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Quality Of Service</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__QUALITY_OF_SERVICE = BASE_CAMEL_BINDING_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Subscribe Topic Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__SUBSCRIBE_TOPIC_NAME = BASE_CAMEL_BINDING_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Publish Topic Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__PUBLISH_TOPIC_NAME = BASE_CAMEL_BINDING_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>By Default Retain</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__BY_DEFAULT_RETAIN = BASE_CAMEL_BINDING_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Mqtt Topic Property Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__MQTT_TOPIC_PROPERTY_NAME = BASE_CAMEL_BINDING_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Mqtt Retain Property Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__MQTT_RETAIN_PROPERTY_NAME = BASE_CAMEL_BINDING_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Mqtt Qos Property Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__MQTT_QOS_PROPERTY_NAME = BASE_CAMEL_BINDING_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Connect Wait In Seconds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__CONNECT_WAIT_IN_SECONDS = BASE_CAMEL_BINDING_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Disconnect Wait In Seconds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__DISCONNECT_WAIT_IN_SECONDS = BASE_CAMEL_BINDING_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Send Wait In Seconds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE__SEND_WAIT_IN_SECONDS = BASE_CAMEL_BINDING_FEATURE_COUNT + 18;

    /**
     * The number of structural features of the '<em>Camel Mqtt Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_MQTT_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 19;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.MqttPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 3;

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
     * The feature id for the '<em><b>Binding Mqtt</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_MQTT = 3;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.ParameterTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.MqttPackageImpl#getParameterType()
     * @generated
     */
    int PARAMETER_TYPE = 4;

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
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.QualityOfServiceType <em>Quality Of Service Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.QualityOfServiceType
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.MqttPackageImpl#getQualityOfServiceType()
     * @generated
     */
    int QUALITY_OF_SERVICE_TYPE = 5;

    /**
     * The meta object id for the '<em>Quality Of Service Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.QualityOfServiceType
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.MqttPackageImpl#getQualityOfServiceTypeObject()
     * @generated
     */
    int QUALITY_OF_SERVICE_TYPE_OBJECT = 6;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.AdditionalUriParametersType <em>Additional Uri Parameters Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Additional Uri Parameters Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.AdditionalUriParametersType
     * @generated
     */
    EClass getAdditionalUriParametersType();

    /**
     * Returns the meta object for the containment reference list '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.AdditionalUriParametersType#getParameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameter</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.AdditionalUriParametersType#getParameter()
     * @see #getAdditionalUriParametersType()
     * @generated
     */
    EReference getAdditionalUriParametersType_Parameter();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.BaseCamelBinding <em>Base Camel Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base Camel Binding</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.BaseCamelBinding
     * @generated
     */
    EClass getBaseCamelBinding();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.BaseCamelBinding#getContextMapper <em>Context Mapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Context Mapper</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.BaseCamelBinding#getContextMapper()
     * @see #getBaseCamelBinding()
     * @generated
     */
    EReference getBaseCamelBinding_ContextMapper();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.BaseCamelBinding#getMessageComposer <em>Message Composer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Message Composer</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.BaseCamelBinding#getMessageComposer()
     * @see #getBaseCamelBinding()
     * @generated
     */
    EReference getBaseCamelBinding_MessageComposer();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.BaseCamelBinding#getAdditionalUriParameters <em>Additional Uri Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Additional Uri Parameters</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.BaseCamelBinding#getAdditionalUriParameters()
     * @see #getBaseCamelBinding()
     * @generated
     */
    EReference getBaseCamelBinding_AdditionalUriParameters();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType <em>Camel Mqtt Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Mqtt Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType
     * @generated
     */
    EClass getCamelMqttBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getHost <em>Host</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Host</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getHost()
     * @see #getCamelMqttBindingType()
     * @generated
     */
    EAttribute getCamelMqttBindingType_Host();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getLocalAddress <em>Local Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Address</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getLocalAddress()
     * @see #getCamelMqttBindingType()
     * @generated
     */
    EAttribute getCamelMqttBindingType_LocalAddress();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getConnectAttemptsMax <em>Connect Attempts Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connect Attempts Max</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getConnectAttemptsMax()
     * @see #getCamelMqttBindingType()
     * @generated
     */
    EAttribute getCamelMqttBindingType_ConnectAttemptsMax();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getReconnectAttemptsMax <em>Reconnect Attempts Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reconnect Attempts Max</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getReconnectAttemptsMax()
     * @see #getCamelMqttBindingType()
     * @generated
     */
    EAttribute getCamelMqttBindingType_ReconnectAttemptsMax();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getReconnectDelay <em>Reconnect Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reconnect Delay</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getReconnectDelay()
     * @see #getCamelMqttBindingType()
     * @generated
     */
    EAttribute getCamelMqttBindingType_ReconnectDelay();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getReconnectBackOffMultiplier <em>Reconnect Back Off Multiplier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reconnect Back Off Multiplier</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getReconnectBackOffMultiplier()
     * @see #getCamelMqttBindingType()
     * @generated
     */
    EAttribute getCamelMqttBindingType_ReconnectBackOffMultiplier();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getReconnectDelayMax <em>Reconnect Delay Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reconnect Delay Max</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getReconnectDelayMax()
     * @see #getCamelMqttBindingType()
     * @generated
     */
    EAttribute getCamelMqttBindingType_ReconnectDelayMax();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getUserName <em>User Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>User Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getUserName()
     * @see #getCamelMqttBindingType()
     * @generated
     */
    EAttribute getCamelMqttBindingType_UserName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getPassword <em>Password</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Password</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getPassword()
     * @see #getCamelMqttBindingType()
     * @generated
     */
    EAttribute getCamelMqttBindingType_Password();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getQualityOfService <em>Quality Of Service</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Quality Of Service</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getQualityOfService()
     * @see #getCamelMqttBindingType()
     * @generated
     */
    EAttribute getCamelMqttBindingType_QualityOfService();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getSubscribeTopicName <em>Subscribe Topic Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Subscribe Topic Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getSubscribeTopicName()
     * @see #getCamelMqttBindingType()
     * @generated
     */
    EAttribute getCamelMqttBindingType_SubscribeTopicName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getPublishTopicName <em>Publish Topic Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Publish Topic Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getPublishTopicName()
     * @see #getCamelMqttBindingType()
     * @generated
     */
    EAttribute getCamelMqttBindingType_PublishTopicName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getByDefaultRetain <em>By Default Retain</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>By Default Retain</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getByDefaultRetain()
     * @see #getCamelMqttBindingType()
     * @generated
     */
    EAttribute getCamelMqttBindingType_ByDefaultRetain();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getMqttTopicPropertyName <em>Mqtt Topic Property Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mqtt Topic Property Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getMqttTopicPropertyName()
     * @see #getCamelMqttBindingType()
     * @generated
     */
    EAttribute getCamelMqttBindingType_MqttTopicPropertyName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getMqttRetainPropertyName <em>Mqtt Retain Property Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mqtt Retain Property Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getMqttRetainPropertyName()
     * @see #getCamelMqttBindingType()
     * @generated
     */
    EAttribute getCamelMqttBindingType_MqttRetainPropertyName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getMqttQosPropertyName <em>Mqtt Qos Property Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mqtt Qos Property Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getMqttQosPropertyName()
     * @see #getCamelMqttBindingType()
     * @generated
     */
    EAttribute getCamelMqttBindingType_MqttQosPropertyName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getConnectWaitInSeconds <em>Connect Wait In Seconds</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connect Wait In Seconds</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getConnectWaitInSeconds()
     * @see #getCamelMqttBindingType()
     * @generated
     */
    EAttribute getCamelMqttBindingType_ConnectWaitInSeconds();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getDisconnectWaitInSeconds <em>Disconnect Wait In Seconds</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Disconnect Wait In Seconds</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getDisconnectWaitInSeconds()
     * @see #getCamelMqttBindingType()
     * @generated
     */
    EAttribute getCamelMqttBindingType_DisconnectWaitInSeconds();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getSendWaitInSeconds <em>Send Wait In Seconds</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Send Wait In Seconds</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType#getSendWaitInSeconds()
     * @see #getCamelMqttBindingType()
     * @generated
     */
    EAttribute getCamelMqttBindingType_SendWaitInSeconds();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.DocumentRoot#getBindingMqtt <em>Binding Mqtt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Mqtt</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.DocumentRoot#getBindingMqtt()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingMqtt();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.ParameterType <em>Parameter Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.ParameterType
     * @generated
     */
    EClass getParameterType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.ParameterType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.ParameterType#getName()
     * @see #getParameterType()
     * @generated
     */
    EAttribute getParameterType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.ParameterType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.ParameterType#getValue()
     * @see #getParameterType()
     * @generated
     */
    EAttribute getParameterType_Value();

    /**
     * Returns the meta object for enum '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.QualityOfServiceType <em>Quality Of Service Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Quality Of Service Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.QualityOfServiceType
     * @generated
     */
    EEnum getQualityOfServiceType();

    /**
     * Returns the meta object for data type '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.QualityOfServiceType <em>Quality Of Service Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Quality Of Service Type Object</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.QualityOfServiceType
     * @model instanceClass="org.switchyard.tools.models.switchyard1_0.camel.mqtt.QualityOfServiceType"
     *        extendedMetaData="name='qualityOfService_._type:Object' baseType='qualityOfService_._type'"
     * @generated
     */
    EDataType getQualityOfServiceTypeObject();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    MqttFactory getMqttFactory();

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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.AdditionalUriParametersTypeImpl <em>Additional Uri Parameters Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.AdditionalUriParametersTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.MqttPackageImpl#getAdditionalUriParametersType()
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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.BaseCamelBindingImpl <em>Base Camel Binding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.BaseCamelBindingImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.MqttPackageImpl#getBaseCamelBinding()
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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.CamelMqttBindingTypeImpl <em>Camel Mqtt Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.CamelMqttBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.MqttPackageImpl#getCamelMqttBindingType()
         * @generated
         */
        EClass CAMEL_MQTT_BINDING_TYPE = eINSTANCE.getCamelMqttBindingType();

        /**
         * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MQTT_BINDING_TYPE__HOST = eINSTANCE.getCamelMqttBindingType_Host();

        /**
         * The meta object literal for the '<em><b>Local Address</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MQTT_BINDING_TYPE__LOCAL_ADDRESS = eINSTANCE.getCamelMqttBindingType_LocalAddress();

        /**
         * The meta object literal for the '<em><b>Connect Attempts Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MQTT_BINDING_TYPE__CONNECT_ATTEMPTS_MAX = eINSTANCE.getCamelMqttBindingType_ConnectAttemptsMax();

        /**
         * The meta object literal for the '<em><b>Reconnect Attempts Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MQTT_BINDING_TYPE__RECONNECT_ATTEMPTS_MAX = eINSTANCE.getCamelMqttBindingType_ReconnectAttemptsMax();

        /**
         * The meta object literal for the '<em><b>Reconnect Delay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MQTT_BINDING_TYPE__RECONNECT_DELAY = eINSTANCE.getCamelMqttBindingType_ReconnectDelay();

        /**
         * The meta object literal for the '<em><b>Reconnect Back Off Multiplier</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MQTT_BINDING_TYPE__RECONNECT_BACK_OFF_MULTIPLIER = eINSTANCE.getCamelMqttBindingType_ReconnectBackOffMultiplier();

        /**
         * The meta object literal for the '<em><b>Reconnect Delay Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MQTT_BINDING_TYPE__RECONNECT_DELAY_MAX = eINSTANCE.getCamelMqttBindingType_ReconnectDelayMax();

        /**
         * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MQTT_BINDING_TYPE__USER_NAME = eINSTANCE.getCamelMqttBindingType_UserName();

        /**
         * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MQTT_BINDING_TYPE__PASSWORD = eINSTANCE.getCamelMqttBindingType_Password();

        /**
         * The meta object literal for the '<em><b>Quality Of Service</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MQTT_BINDING_TYPE__QUALITY_OF_SERVICE = eINSTANCE.getCamelMqttBindingType_QualityOfService();

        /**
         * The meta object literal for the '<em><b>Subscribe Topic Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MQTT_BINDING_TYPE__SUBSCRIBE_TOPIC_NAME = eINSTANCE.getCamelMqttBindingType_SubscribeTopicName();

        /**
         * The meta object literal for the '<em><b>Publish Topic Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MQTT_BINDING_TYPE__PUBLISH_TOPIC_NAME = eINSTANCE.getCamelMqttBindingType_PublishTopicName();

        /**
         * The meta object literal for the '<em><b>By Default Retain</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MQTT_BINDING_TYPE__BY_DEFAULT_RETAIN = eINSTANCE.getCamelMqttBindingType_ByDefaultRetain();

        /**
         * The meta object literal for the '<em><b>Mqtt Topic Property Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MQTT_BINDING_TYPE__MQTT_TOPIC_PROPERTY_NAME = eINSTANCE.getCamelMqttBindingType_MqttTopicPropertyName();

        /**
         * The meta object literal for the '<em><b>Mqtt Retain Property Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MQTT_BINDING_TYPE__MQTT_RETAIN_PROPERTY_NAME = eINSTANCE.getCamelMqttBindingType_MqttRetainPropertyName();

        /**
         * The meta object literal for the '<em><b>Mqtt Qos Property Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MQTT_BINDING_TYPE__MQTT_QOS_PROPERTY_NAME = eINSTANCE.getCamelMqttBindingType_MqttQosPropertyName();

        /**
         * The meta object literal for the '<em><b>Connect Wait In Seconds</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MQTT_BINDING_TYPE__CONNECT_WAIT_IN_SECONDS = eINSTANCE.getCamelMqttBindingType_ConnectWaitInSeconds();

        /**
         * The meta object literal for the '<em><b>Disconnect Wait In Seconds</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MQTT_BINDING_TYPE__DISCONNECT_WAIT_IN_SECONDS = eINSTANCE.getCamelMqttBindingType_DisconnectWaitInSeconds();

        /**
         * The meta object literal for the '<em><b>Send Wait In Seconds</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_MQTT_BINDING_TYPE__SEND_WAIT_IN_SECONDS = eINSTANCE.getCamelMqttBindingType_SendWaitInSeconds();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.MqttPackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Binding Mqtt</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_MQTT = eINSTANCE.getDocumentRoot_BindingMqtt();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.ParameterTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.MqttPackageImpl#getParameterType()
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
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.mqtt.QualityOfServiceType <em>Quality Of Service Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.QualityOfServiceType
         * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.MqttPackageImpl#getQualityOfServiceType()
         * @generated
         */
        EEnum QUALITY_OF_SERVICE_TYPE = eINSTANCE.getQualityOfServiceType();

        /**
         * The meta object literal for the '<em>Quality Of Service Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.QualityOfServiceType
         * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.MqttPackageImpl#getQualityOfServiceTypeObject()
         * @generated
         */
        EDataType QUALITY_OF_SERVICE_TYPE_OBJECT = eINSTANCE.getQualityOfServiceTypeObject();

    }

} //MqttPackage
