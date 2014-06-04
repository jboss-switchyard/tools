/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.cxf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Cxf Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getCxfURI <em>Cxf URI</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getWsdlURL <em>Wsdl URL</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getServiceClass <em>Service Class</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getPortName <em>Port Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getDataFormat <em>Data Format</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isRelayHeaders <em>Relay Headers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isWrapped <em>Wrapped</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isWrappedStyle <em>Wrapped Style</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isSetDefaultBus <em>Set Default Bus</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getBus <em>Bus</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getCxfBinding <em>Cxf Binding</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getHeaderFilterStrategy <em>Header Filter Strategy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isLoggingFeatureEnabled <em>Logging Feature Enabled</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getDefaultOperationName <em>Default Operation Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getDefaultOperationNamespace <em>Default Operation Namespace</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isSynchronous <em>Synchronous</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getPublishedEndpointUrl <em>Published Endpoint Url</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isAllowStreaming <em>Allow Streaming</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isSkipFaultLogging <em>Skip Fault Logging</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getUsername <em>Username</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage#getCamelCxfBindingType()
 * @model extendedMetaData="name='CamelCxfBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelCxfBindingType extends BaseCamelBinding {
    /**
     * Returns the value of the '<em><b>Cxf URI</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cxf URI</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cxf URI</em>' attribute.
     * @see #setCxfURI(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage#getCamelCxfBindingType_CxfURI()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
     *        extendedMetaData="kind='element' name='cxfURI' namespace='##targetNamespace'"
     * @generated
     */
    String getCxfURI();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getCxfURI <em>Cxf URI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cxf URI</em>' attribute.
     * @see #getCxfURI()
     * @generated
     */
    void setCxfURI(String value);

    /**
     * Returns the value of the '<em><b>Wsdl URL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wsdl URL</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wsdl URL</em>' attribute.
     * @see #setWsdlURL(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage#getCamelCxfBindingType_WsdlURL()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='wsdlURL' namespace='##targetNamespace'"
     * @generated
     */
    String getWsdlURL();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getWsdlURL <em>Wsdl URL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wsdl URL</em>' attribute.
     * @see #getWsdlURL()
     * @generated
     */
    void setWsdlURL(String value);

    /**
     * Returns the value of the '<em><b>Service Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Class</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Class</em>' attribute.
     * @see #setServiceClass(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage#getCamelCxfBindingType_ServiceClass()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='serviceClass' namespace='##targetNamespace'"
     * @generated
     */
    String getServiceClass();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getServiceClass <em>Service Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Class</em>' attribute.
     * @see #getServiceClass()
     * @generated
     */
    void setServiceClass(String value);

    /**
     * Returns the value of the '<em><b>Service Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Name</em>' attribute.
     * @see #setServiceName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage#getCamelCxfBindingType_ServiceName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='serviceName' namespace='##targetNamespace'"
     * @generated
     */
    String getServiceName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getServiceName <em>Service Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Name</em>' attribute.
     * @see #getServiceName()
     * @generated
     */
    void setServiceName(String value);

    /**
     * Returns the value of the '<em><b>Port Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Port Name</em>' attribute.
     * @see #setPortName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage#getCamelCxfBindingType_PortName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='portName' namespace='##targetNamespace'"
     * @generated
     */
    String getPortName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getPortName <em>Port Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Port Name</em>' attribute.
     * @see #getPortName()
     * @generated
     */
    void setPortName(String value);

    /**
     * Returns the value of the '<em><b>Data Format</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Format</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Format</em>' attribute.
     * @see #setDataFormat(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage#getCamelCxfBindingType_DataFormat()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='dataFormat' namespace='##targetNamespace'"
     * @generated
     */
    String getDataFormat();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getDataFormat <em>Data Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Format</em>' attribute.
     * @see #getDataFormat()
     * @generated
     */
    void setDataFormat(String value);

    /**
     * Returns the value of the '<em><b>Relay Headers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Relay Headers</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relay Headers</em>' attribute.
     * @see #isSetRelayHeaders()
     * @see #unsetRelayHeaders()
     * @see #setRelayHeaders(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage#getCamelCxfBindingType_RelayHeaders()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='relayHeaders' namespace='##targetNamespace'"
     * @generated
     */
    boolean isRelayHeaders();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isRelayHeaders <em>Relay Headers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Relay Headers</em>' attribute.
     * @see #isSetRelayHeaders()
     * @see #unsetRelayHeaders()
     * @see #isRelayHeaders()
     * @generated
     */
    void setRelayHeaders(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isRelayHeaders <em>Relay Headers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRelayHeaders()
     * @see #isRelayHeaders()
     * @see #setRelayHeaders(boolean)
     * @generated
     */
    void unsetRelayHeaders();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isRelayHeaders <em>Relay Headers</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Relay Headers</em>' attribute is set.
     * @see #unsetRelayHeaders()
     * @see #isRelayHeaders()
     * @see #setRelayHeaders(boolean)
     * @generated
     */
    boolean isSetRelayHeaders();

    /**
     * Returns the value of the '<em><b>Wrapped</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wrapped</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wrapped</em>' attribute.
     * @see #isSetWrapped()
     * @see #unsetWrapped()
     * @see #setWrapped(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage#getCamelCxfBindingType_Wrapped()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='wrapped' namespace='##targetNamespace'"
     * @generated
     */
    boolean isWrapped();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isWrapped <em>Wrapped</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wrapped</em>' attribute.
     * @see #isSetWrapped()
     * @see #unsetWrapped()
     * @see #isWrapped()
     * @generated
     */
    void setWrapped(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isWrapped <em>Wrapped</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWrapped()
     * @see #isWrapped()
     * @see #setWrapped(boolean)
     * @generated
     */
    void unsetWrapped();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isWrapped <em>Wrapped</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wrapped</em>' attribute is set.
     * @see #unsetWrapped()
     * @see #isWrapped()
     * @see #setWrapped(boolean)
     * @generated
     */
    boolean isSetWrapped();

    /**
     * Returns the value of the '<em><b>Wrapped Style</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wrapped Style</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wrapped Style</em>' attribute.
     * @see #isSetWrappedStyle()
     * @see #unsetWrappedStyle()
     * @see #setWrappedStyle(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage#getCamelCxfBindingType_WrappedStyle()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='wrappedStyle' namespace='##targetNamespace'"
     * @generated
     */
    boolean isWrappedStyle();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isWrappedStyle <em>Wrapped Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wrapped Style</em>' attribute.
     * @see #isSetWrappedStyle()
     * @see #unsetWrappedStyle()
     * @see #isWrappedStyle()
     * @generated
     */
    void setWrappedStyle(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isWrappedStyle <em>Wrapped Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWrappedStyle()
     * @see #isWrappedStyle()
     * @see #setWrappedStyle(boolean)
     * @generated
     */
    void unsetWrappedStyle();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isWrappedStyle <em>Wrapped Style</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wrapped Style</em>' attribute is set.
     * @see #unsetWrappedStyle()
     * @see #isWrappedStyle()
     * @see #setWrappedStyle(boolean)
     * @generated
     */
    boolean isSetWrappedStyle();

    /**
     * Returns the value of the '<em><b>Set Default Bus</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Set Default Bus</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Set Default Bus</em>' attribute.
     * @see #isSetSetDefaultBus()
     * @see #unsetSetDefaultBus()
     * @see #setSetDefaultBus(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage#getCamelCxfBindingType_SetDefaultBus()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='setDefaultBus' namespace='##targetNamespace'"
     * @generated
     */
    boolean isSetDefaultBus();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isSetDefaultBus <em>Set Default Bus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Set Default Bus</em>' attribute.
     * @see #isSetSetDefaultBus()
     * @see #unsetSetDefaultBus()
     * @see #isSetDefaultBus()
     * @generated
     */
    void setSetDefaultBus(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isSetDefaultBus <em>Set Default Bus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSetDefaultBus()
     * @see #isSetDefaultBus()
     * @see #setSetDefaultBus(boolean)
     * @generated
     */
    void unsetSetDefaultBus();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isSetDefaultBus <em>Set Default Bus</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Set Default Bus</em>' attribute is set.
     * @see #unsetSetDefaultBus()
     * @see #isSetDefaultBus()
     * @see #setSetDefaultBus(boolean)
     * @generated
     */
    boolean isSetSetDefaultBus();

    /**
     * Returns the value of the '<em><b>Bus</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bus</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bus</em>' attribute.
     * @see #setBus(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage#getCamelCxfBindingType_Bus()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='bus' namespace='##targetNamespace'"
     * @generated
     */
    String getBus();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getBus <em>Bus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bus</em>' attribute.
     * @see #getBus()
     * @generated
     */
    void setBus(String value);

    /**
     * Returns the value of the '<em><b>Cxf Binding</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cxf Binding</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cxf Binding</em>' attribute.
     * @see #setCxfBinding(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage#getCamelCxfBindingType_CxfBinding()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='cxfBinding' namespace='##targetNamespace'"
     * @generated
     */
    String getCxfBinding();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getCxfBinding <em>Cxf Binding</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cxf Binding</em>' attribute.
     * @see #getCxfBinding()
     * @generated
     */
    void setCxfBinding(String value);

    /**
     * Returns the value of the '<em><b>Header Filter Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Header Filter Strategy</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Header Filter Strategy</em>' attribute.
     * @see #setHeaderFilterStrategy(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage#getCamelCxfBindingType_HeaderFilterStrategy()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='headerFilterStrategy' namespace='##targetNamespace'"
     * @generated
     */
    String getHeaderFilterStrategy();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getHeaderFilterStrategy <em>Header Filter Strategy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Header Filter Strategy</em>' attribute.
     * @see #getHeaderFilterStrategy()
     * @generated
     */
    void setHeaderFilterStrategy(String value);

    /**
     * Returns the value of the '<em><b>Logging Feature Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Logging Feature Enabled</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Logging Feature Enabled</em>' attribute.
     * @see #isSetLoggingFeatureEnabled()
     * @see #unsetLoggingFeatureEnabled()
     * @see #setLoggingFeatureEnabled(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage#getCamelCxfBindingType_LoggingFeatureEnabled()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='loggingFeatureEnabled' namespace='##targetNamespace'"
     * @generated
     */
    boolean isLoggingFeatureEnabled();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isLoggingFeatureEnabled <em>Logging Feature Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Logging Feature Enabled</em>' attribute.
     * @see #isSetLoggingFeatureEnabled()
     * @see #unsetLoggingFeatureEnabled()
     * @see #isLoggingFeatureEnabled()
     * @generated
     */
    void setLoggingFeatureEnabled(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isLoggingFeatureEnabled <em>Logging Feature Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLoggingFeatureEnabled()
     * @see #isLoggingFeatureEnabled()
     * @see #setLoggingFeatureEnabled(boolean)
     * @generated
     */
    void unsetLoggingFeatureEnabled();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isLoggingFeatureEnabled <em>Logging Feature Enabled</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Logging Feature Enabled</em>' attribute is set.
     * @see #unsetLoggingFeatureEnabled()
     * @see #isLoggingFeatureEnabled()
     * @see #setLoggingFeatureEnabled(boolean)
     * @generated
     */
    boolean isSetLoggingFeatureEnabled();

    /**
     * Returns the value of the '<em><b>Default Operation Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Operation Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Operation Name</em>' attribute.
     * @see #setDefaultOperationName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage#getCamelCxfBindingType_DefaultOperationName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='defaultOperationName' namespace='##targetNamespace'"
     * @generated
     */
    String getDefaultOperationName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getDefaultOperationName <em>Default Operation Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Operation Name</em>' attribute.
     * @see #getDefaultOperationName()
     * @generated
     */
    void setDefaultOperationName(String value);

    /**
     * Returns the value of the '<em><b>Default Operation Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Operation Namespace</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Operation Namespace</em>' attribute.
     * @see #setDefaultOperationNamespace(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage#getCamelCxfBindingType_DefaultOperationNamespace()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='defaultOperationNamespace' namespace='##targetNamespace'"
     * @generated
     */
    String getDefaultOperationNamespace();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getDefaultOperationNamespace <em>Default Operation Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Operation Namespace</em>' attribute.
     * @see #getDefaultOperationNamespace()
     * @generated
     */
    void setDefaultOperationNamespace(String value);

    /**
     * Returns the value of the '<em><b>Synchronous</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Synchronous</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Synchronous</em>' attribute.
     * @see #isSetSynchronous()
     * @see #unsetSynchronous()
     * @see #setSynchronous(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage#getCamelCxfBindingType_Synchronous()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='synchronous' namespace='##targetNamespace'"
     * @generated
     */
    boolean isSynchronous();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isSynchronous <em>Synchronous</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Synchronous</em>' attribute.
     * @see #isSetSynchronous()
     * @see #unsetSynchronous()
     * @see #isSynchronous()
     * @generated
     */
    void setSynchronous(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isSynchronous <em>Synchronous</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSynchronous()
     * @see #isSynchronous()
     * @see #setSynchronous(boolean)
     * @generated
     */
    void unsetSynchronous();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isSynchronous <em>Synchronous</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Synchronous</em>' attribute is set.
     * @see #unsetSynchronous()
     * @see #isSynchronous()
     * @see #setSynchronous(boolean)
     * @generated
     */
    boolean isSetSynchronous();

    /**
     * Returns the value of the '<em><b>Published Endpoint Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Published Endpoint Url</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Published Endpoint Url</em>' attribute.
     * @see #setPublishedEndpointUrl(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage#getCamelCxfBindingType_PublishedEndpointUrl()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='publishedEndpointUrl' namespace='##targetNamespace'"
     * @generated
     */
    String getPublishedEndpointUrl();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getPublishedEndpointUrl <em>Published Endpoint Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Published Endpoint Url</em>' attribute.
     * @see #getPublishedEndpointUrl()
     * @generated
     */
    void setPublishedEndpointUrl(String value);

    /**
     * Returns the value of the '<em><b>Allow Streaming</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Allow Streaming</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Allow Streaming</em>' attribute.
     * @see #isSetAllowStreaming()
     * @see #unsetAllowStreaming()
     * @see #setAllowStreaming(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage#getCamelCxfBindingType_AllowStreaming()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='allowStreaming' namespace='##targetNamespace'"
     * @generated
     */
    boolean isAllowStreaming();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isAllowStreaming <em>Allow Streaming</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Allow Streaming</em>' attribute.
     * @see #isSetAllowStreaming()
     * @see #unsetAllowStreaming()
     * @see #isAllowStreaming()
     * @generated
     */
    void setAllowStreaming(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isAllowStreaming <em>Allow Streaming</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAllowStreaming()
     * @see #isAllowStreaming()
     * @see #setAllowStreaming(boolean)
     * @generated
     */
    void unsetAllowStreaming();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isAllowStreaming <em>Allow Streaming</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Allow Streaming</em>' attribute is set.
     * @see #unsetAllowStreaming()
     * @see #isAllowStreaming()
     * @see #setAllowStreaming(boolean)
     * @generated
     */
    boolean isSetAllowStreaming();

    /**
     * Returns the value of the '<em><b>Skip Fault Logging</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Skip Fault Logging</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Skip Fault Logging</em>' attribute.
     * @see #isSetSkipFaultLogging()
     * @see #unsetSkipFaultLogging()
     * @see #setSkipFaultLogging(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage#getCamelCxfBindingType_SkipFaultLogging()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='skipFaultLogging' namespace='##targetNamespace'"
     * @generated
     */
    boolean isSkipFaultLogging();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isSkipFaultLogging <em>Skip Fault Logging</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Skip Fault Logging</em>' attribute.
     * @see #isSetSkipFaultLogging()
     * @see #unsetSkipFaultLogging()
     * @see #isSkipFaultLogging()
     * @generated
     */
    void setSkipFaultLogging(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isSkipFaultLogging <em>Skip Fault Logging</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSkipFaultLogging()
     * @see #isSkipFaultLogging()
     * @see #setSkipFaultLogging(boolean)
     * @generated
     */
    void unsetSkipFaultLogging();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#isSkipFaultLogging <em>Skip Fault Logging</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Skip Fault Logging</em>' attribute is set.
     * @see #unsetSkipFaultLogging()
     * @see #isSkipFaultLogging()
     * @see #setSkipFaultLogging(boolean)
     * @generated
     */
    boolean isSetSkipFaultLogging();

    /**
     * Returns the value of the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Username</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Username</em>' attribute.
     * @see #setUsername(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage#getCamelCxfBindingType_Username()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='username' namespace='##targetNamespace'"
     * @generated
     */
    String getUsername();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getUsername <em>Username</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Username</em>' attribute.
     * @see #getUsername()
     * @generated
     */
    void setUsername(String value);

    /**
     * Returns the value of the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Password</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Password</em>' attribute.
     * @see #setPassword(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage#getCamelCxfBindingType_Password()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='password' namespace='##targetNamespace'"
     * @generated
     */
    String getPassword();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType#getPassword <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Password</em>' attribute.
     * @see #getPassword()
     * @generated
     */
    void setPassword(String value);

} // CamelCxfBindingType
