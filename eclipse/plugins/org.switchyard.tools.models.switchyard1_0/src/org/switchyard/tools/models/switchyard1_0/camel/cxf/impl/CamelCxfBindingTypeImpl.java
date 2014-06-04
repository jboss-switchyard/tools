/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.cxf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.cxf.CamelCxfBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.cxf.CxfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Cxf Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.impl.CamelCxfBindingTypeImpl#getCxfURI <em>Cxf URI</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.impl.CamelCxfBindingTypeImpl#getWsdlURL <em>Wsdl URL</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.impl.CamelCxfBindingTypeImpl#getServiceClass <em>Service Class</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.impl.CamelCxfBindingTypeImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.impl.CamelCxfBindingTypeImpl#getPortName <em>Port Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.impl.CamelCxfBindingTypeImpl#getDataFormat <em>Data Format</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.impl.CamelCxfBindingTypeImpl#isRelayHeaders <em>Relay Headers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.impl.CamelCxfBindingTypeImpl#isWrapped <em>Wrapped</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.impl.CamelCxfBindingTypeImpl#isWrappedStyle <em>Wrapped Style</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.impl.CamelCxfBindingTypeImpl#isSetDefaultBus <em>Set Default Bus</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.impl.CamelCxfBindingTypeImpl#getBus <em>Bus</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.impl.CamelCxfBindingTypeImpl#getCxfBinding <em>Cxf Binding</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.impl.CamelCxfBindingTypeImpl#getHeaderFilterStrategy <em>Header Filter Strategy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.impl.CamelCxfBindingTypeImpl#isLoggingFeatureEnabled <em>Logging Feature Enabled</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.impl.CamelCxfBindingTypeImpl#getDefaultOperationName <em>Default Operation Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.impl.CamelCxfBindingTypeImpl#getDefaultOperationNamespace <em>Default Operation Namespace</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.impl.CamelCxfBindingTypeImpl#isSynchronous <em>Synchronous</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.impl.CamelCxfBindingTypeImpl#getPublishedEndpointUrl <em>Published Endpoint Url</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.impl.CamelCxfBindingTypeImpl#isAllowStreaming <em>Allow Streaming</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.impl.CamelCxfBindingTypeImpl#isSkipFaultLogging <em>Skip Fault Logging</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.impl.CamelCxfBindingTypeImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.cxf.impl.CamelCxfBindingTypeImpl#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelCxfBindingTypeImpl extends BaseCamelBindingImpl implements CamelCxfBindingType {
    /**
     * The default value of the '{@link #getCxfURI() <em>Cxf URI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCxfURI()
     * @generated
     * @ordered
     */
    protected static final String CXF_URI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCxfURI() <em>Cxf URI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCxfURI()
     * @generated
     * @ordered
     */
    protected String cxfURI = CXF_URI_EDEFAULT;

    /**
     * The default value of the '{@link #getWsdlURL() <em>Wsdl URL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWsdlURL()
     * @generated
     * @ordered
     */
    protected static final String WSDL_URL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWsdlURL() <em>Wsdl URL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWsdlURL()
     * @generated
     * @ordered
     */
    protected String wsdlURL = WSDL_URL_EDEFAULT;

    /**
     * The default value of the '{@link #getServiceClass() <em>Service Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceClass()
     * @generated
     * @ordered
     */
    protected static final String SERVICE_CLASS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getServiceClass() <em>Service Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceClass()
     * @generated
     * @ordered
     */
    protected String serviceClass = SERVICE_CLASS_EDEFAULT;

    /**
     * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceName()
     * @generated
     * @ordered
     */
    protected static final String SERVICE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceName()
     * @generated
     * @ordered
     */
    protected String serviceName = SERVICE_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getPortName() <em>Port Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPortName()
     * @generated
     * @ordered
     */
    protected static final String PORT_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPortName() <em>Port Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPortName()
     * @generated
     * @ordered
     */
    protected String portName = PORT_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getDataFormat() <em>Data Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataFormat()
     * @generated
     * @ordered
     */
    protected static final String DATA_FORMAT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDataFormat() <em>Data Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataFormat()
     * @generated
     * @ordered
     */
    protected String dataFormat = DATA_FORMAT_EDEFAULT;

    /**
     * The default value of the '{@link #isRelayHeaders() <em>Relay Headers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRelayHeaders()
     * @generated
     * @ordered
     */
    protected static final boolean RELAY_HEADERS_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isRelayHeaders() <em>Relay Headers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRelayHeaders()
     * @generated
     * @ordered
     */
    protected boolean relayHeaders = RELAY_HEADERS_EDEFAULT;

    /**
     * This is true if the Relay Headers attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean relayHeadersESet;

    /**
     * The default value of the '{@link #isWrapped() <em>Wrapped</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isWrapped()
     * @generated
     * @ordered
     */
    protected static final boolean WRAPPED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isWrapped() <em>Wrapped</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isWrapped()
     * @generated
     * @ordered
     */
    protected boolean wrapped = WRAPPED_EDEFAULT;

    /**
     * This is true if the Wrapped attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean wrappedESet;

    /**
     * The default value of the '{@link #isWrappedStyle() <em>Wrapped Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isWrappedStyle()
     * @generated
     * @ordered
     */
    protected static final boolean WRAPPED_STYLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isWrappedStyle() <em>Wrapped Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isWrappedStyle()
     * @generated
     * @ordered
     */
    protected boolean wrappedStyle = WRAPPED_STYLE_EDEFAULT;

    /**
     * This is true if the Wrapped Style attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean wrappedStyleESet;

    /**
     * The default value of the '{@link #isSetDefaultBus() <em>Set Default Bus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDefaultBus()
     * @generated
     * @ordered
     */
    protected static final boolean SET_DEFAULT_BUS_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSetDefaultBus() <em>Set Default Bus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDefaultBus()
     * @generated
     * @ordered
     */
    protected boolean setDefaultBus = SET_DEFAULT_BUS_EDEFAULT;

    /**
     * This is true if the Set Default Bus attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean setDefaultBusESet;

    /**
     * The default value of the '{@link #getBus() <em>Bus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBus()
     * @generated
     * @ordered
     */
    protected static final String BUS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBus() <em>Bus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBus()
     * @generated
     * @ordered
     */
    protected String bus = BUS_EDEFAULT;

    /**
     * The default value of the '{@link #getCxfBinding() <em>Cxf Binding</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCxfBinding()
     * @generated
     * @ordered
     */
    protected static final String CXF_BINDING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCxfBinding() <em>Cxf Binding</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCxfBinding()
     * @generated
     * @ordered
     */
    protected String cxfBinding = CXF_BINDING_EDEFAULT;

    /**
     * The default value of the '{@link #getHeaderFilterStrategy() <em>Header Filter Strategy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeaderFilterStrategy()
     * @generated
     * @ordered
     */
    protected static final String HEADER_FILTER_STRATEGY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHeaderFilterStrategy() <em>Header Filter Strategy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeaderFilterStrategy()
     * @generated
     * @ordered
     */
    protected String headerFilterStrategy = HEADER_FILTER_STRATEGY_EDEFAULT;

    /**
     * The default value of the '{@link #isLoggingFeatureEnabled() <em>Logging Feature Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLoggingFeatureEnabled()
     * @generated
     * @ordered
     */
    protected static final boolean LOGGING_FEATURE_ENABLED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isLoggingFeatureEnabled() <em>Logging Feature Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLoggingFeatureEnabled()
     * @generated
     * @ordered
     */
    protected boolean loggingFeatureEnabled = LOGGING_FEATURE_ENABLED_EDEFAULT;

    /**
     * This is true if the Logging Feature Enabled attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean loggingFeatureEnabledESet;

    /**
     * The default value of the '{@link #getDefaultOperationName() <em>Default Operation Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultOperationName()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_OPERATION_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefaultOperationName() <em>Default Operation Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultOperationName()
     * @generated
     * @ordered
     */
    protected String defaultOperationName = DEFAULT_OPERATION_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getDefaultOperationNamespace() <em>Default Operation Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultOperationNamespace()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_OPERATION_NAMESPACE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefaultOperationNamespace() <em>Default Operation Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultOperationNamespace()
     * @generated
     * @ordered
     */
    protected String defaultOperationNamespace = DEFAULT_OPERATION_NAMESPACE_EDEFAULT;

    /**
     * The default value of the '{@link #isSynchronous() <em>Synchronous</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSynchronous()
     * @generated
     * @ordered
     */
    protected static final boolean SYNCHRONOUS_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSynchronous() <em>Synchronous</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSynchronous()
     * @generated
     * @ordered
     */
    protected boolean synchronous = SYNCHRONOUS_EDEFAULT;

    /**
     * This is true if the Synchronous attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean synchronousESet;

    /**
     * The default value of the '{@link #getPublishedEndpointUrl() <em>Published Endpoint Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPublishedEndpointUrl()
     * @generated
     * @ordered
     */
    protected static final String PUBLISHED_ENDPOINT_URL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPublishedEndpointUrl() <em>Published Endpoint Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPublishedEndpointUrl()
     * @generated
     * @ordered
     */
    protected String publishedEndpointUrl = PUBLISHED_ENDPOINT_URL_EDEFAULT;

    /**
     * The default value of the '{@link #isAllowStreaming() <em>Allow Streaming</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAllowStreaming()
     * @generated
     * @ordered
     */
    protected static final boolean ALLOW_STREAMING_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isAllowStreaming() <em>Allow Streaming</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAllowStreaming()
     * @generated
     * @ordered
     */
    protected boolean allowStreaming = ALLOW_STREAMING_EDEFAULT;

    /**
     * This is true if the Allow Streaming attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean allowStreamingESet;

    /**
     * The default value of the '{@link #isSkipFaultLogging() <em>Skip Fault Logging</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSkipFaultLogging()
     * @generated
     * @ordered
     */
    protected static final boolean SKIP_FAULT_LOGGING_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSkipFaultLogging() <em>Skip Fault Logging</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSkipFaultLogging()
     * @generated
     * @ordered
     */
    protected boolean skipFaultLogging = SKIP_FAULT_LOGGING_EDEFAULT;

    /**
     * This is true if the Skip Fault Logging attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean skipFaultLoggingESet;

    /**
     * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsername()
     * @generated
     * @ordered
     */
    protected static final String USERNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsername()
     * @generated
     * @ordered
     */
    protected String username = USERNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassword()
     * @generated
     * @ordered
     */
    protected static final String PASSWORD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassword()
     * @generated
     * @ordered
     */
    protected String password = PASSWORD_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelCxfBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CxfPackage.Literals.CAMEL_CXF_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCxfURI() {
        return cxfURI;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCxfURI(String newCxfURI) {
        String oldCxfURI = cxfURI;
        cxfURI = newCxfURI;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CxfPackage.CAMEL_CXF_BINDING_TYPE__CXF_URI, oldCxfURI, cxfURI));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getWsdlURL() {
        return wsdlURL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWsdlURL(String newWsdlURL) {
        String oldWsdlURL = wsdlURL;
        wsdlURL = newWsdlURL;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CxfPackage.CAMEL_CXF_BINDING_TYPE__WSDL_URL, oldWsdlURL, wsdlURL));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getServiceClass() {
        return serviceClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setServiceClass(String newServiceClass) {
        String oldServiceClass = serviceClass;
        serviceClass = newServiceClass;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CxfPackage.CAMEL_CXF_BINDING_TYPE__SERVICE_CLASS, oldServiceClass, serviceClass));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setServiceName(String newServiceName) {
        String oldServiceName = serviceName;
        serviceName = newServiceName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CxfPackage.CAMEL_CXF_BINDING_TYPE__SERVICE_NAME, oldServiceName, serviceName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPortName() {
        return portName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPortName(String newPortName) {
        String oldPortName = portName;
        portName = newPortName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CxfPackage.CAMEL_CXF_BINDING_TYPE__PORT_NAME, oldPortName, portName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDataFormat() {
        return dataFormat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataFormat(String newDataFormat) {
        String oldDataFormat = dataFormat;
        dataFormat = newDataFormat;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CxfPackage.CAMEL_CXF_BINDING_TYPE__DATA_FORMAT, oldDataFormat, dataFormat));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRelayHeaders() {
        return relayHeaders;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRelayHeaders(boolean newRelayHeaders) {
        boolean oldRelayHeaders = relayHeaders;
        relayHeaders = newRelayHeaders;
        boolean oldRelayHeadersESet = relayHeadersESet;
        relayHeadersESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CxfPackage.CAMEL_CXF_BINDING_TYPE__RELAY_HEADERS, oldRelayHeaders, relayHeaders, !oldRelayHeadersESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetRelayHeaders() {
        boolean oldRelayHeaders = relayHeaders;
        boolean oldRelayHeadersESet = relayHeadersESet;
        relayHeaders = RELAY_HEADERS_EDEFAULT;
        relayHeadersESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CxfPackage.CAMEL_CXF_BINDING_TYPE__RELAY_HEADERS, oldRelayHeaders, RELAY_HEADERS_EDEFAULT, oldRelayHeadersESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetRelayHeaders() {
        return relayHeadersESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isWrapped() {
        return wrapped;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWrapped(boolean newWrapped) {
        boolean oldWrapped = wrapped;
        wrapped = newWrapped;
        boolean oldWrappedESet = wrappedESet;
        wrappedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CxfPackage.CAMEL_CXF_BINDING_TYPE__WRAPPED, oldWrapped, wrapped, !oldWrappedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetWrapped() {
        boolean oldWrapped = wrapped;
        boolean oldWrappedESet = wrappedESet;
        wrapped = WRAPPED_EDEFAULT;
        wrappedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CxfPackage.CAMEL_CXF_BINDING_TYPE__WRAPPED, oldWrapped, WRAPPED_EDEFAULT, oldWrappedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetWrapped() {
        return wrappedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isWrappedStyle() {
        return wrappedStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWrappedStyle(boolean newWrappedStyle) {
        boolean oldWrappedStyle = wrappedStyle;
        wrappedStyle = newWrappedStyle;
        boolean oldWrappedStyleESet = wrappedStyleESet;
        wrappedStyleESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CxfPackage.CAMEL_CXF_BINDING_TYPE__WRAPPED_STYLE, oldWrappedStyle, wrappedStyle, !oldWrappedStyleESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetWrappedStyle() {
        boolean oldWrappedStyle = wrappedStyle;
        boolean oldWrappedStyleESet = wrappedStyleESet;
        wrappedStyle = WRAPPED_STYLE_EDEFAULT;
        wrappedStyleESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CxfPackage.CAMEL_CXF_BINDING_TYPE__WRAPPED_STYLE, oldWrappedStyle, WRAPPED_STYLE_EDEFAULT, oldWrappedStyleESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetWrappedStyle() {
        return wrappedStyleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDefaultBus() {
        return setDefaultBus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSetDefaultBus(boolean newSetDefaultBus) {
        boolean oldSetDefaultBus = setDefaultBus;
        setDefaultBus = newSetDefaultBus;
        boolean oldSetDefaultBusESet = setDefaultBusESet;
        setDefaultBusESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CxfPackage.CAMEL_CXF_BINDING_TYPE__SET_DEFAULT_BUS, oldSetDefaultBus, setDefaultBus, !oldSetDefaultBusESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSetDefaultBus() {
        boolean oldSetDefaultBus = setDefaultBus;
        boolean oldSetDefaultBusESet = setDefaultBusESet;
        setDefaultBus = SET_DEFAULT_BUS_EDEFAULT;
        setDefaultBusESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CxfPackage.CAMEL_CXF_BINDING_TYPE__SET_DEFAULT_BUS, oldSetDefaultBus, SET_DEFAULT_BUS_EDEFAULT, oldSetDefaultBusESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSetDefaultBus() {
        return setDefaultBusESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBus() {
        return bus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBus(String newBus) {
        String oldBus = bus;
        bus = newBus;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CxfPackage.CAMEL_CXF_BINDING_TYPE__BUS, oldBus, bus));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCxfBinding() {
        return cxfBinding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCxfBinding(String newCxfBinding) {
        String oldCxfBinding = cxfBinding;
        cxfBinding = newCxfBinding;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CxfPackage.CAMEL_CXF_BINDING_TYPE__CXF_BINDING, oldCxfBinding, cxfBinding));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getHeaderFilterStrategy() {
        return headerFilterStrategy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHeaderFilterStrategy(String newHeaderFilterStrategy) {
        String oldHeaderFilterStrategy = headerFilterStrategy;
        headerFilterStrategy = newHeaderFilterStrategy;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CxfPackage.CAMEL_CXF_BINDING_TYPE__HEADER_FILTER_STRATEGY, oldHeaderFilterStrategy, headerFilterStrategy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLoggingFeatureEnabled() {
        return loggingFeatureEnabled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLoggingFeatureEnabled(boolean newLoggingFeatureEnabled) {
        boolean oldLoggingFeatureEnabled = loggingFeatureEnabled;
        loggingFeatureEnabled = newLoggingFeatureEnabled;
        boolean oldLoggingFeatureEnabledESet = loggingFeatureEnabledESet;
        loggingFeatureEnabledESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CxfPackage.CAMEL_CXF_BINDING_TYPE__LOGGING_FEATURE_ENABLED, oldLoggingFeatureEnabled, loggingFeatureEnabled, !oldLoggingFeatureEnabledESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetLoggingFeatureEnabled() {
        boolean oldLoggingFeatureEnabled = loggingFeatureEnabled;
        boolean oldLoggingFeatureEnabledESet = loggingFeatureEnabledESet;
        loggingFeatureEnabled = LOGGING_FEATURE_ENABLED_EDEFAULT;
        loggingFeatureEnabledESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CxfPackage.CAMEL_CXF_BINDING_TYPE__LOGGING_FEATURE_ENABLED, oldLoggingFeatureEnabled, LOGGING_FEATURE_ENABLED_EDEFAULT, oldLoggingFeatureEnabledESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetLoggingFeatureEnabled() {
        return loggingFeatureEnabledESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDefaultOperationName() {
        return defaultOperationName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultOperationName(String newDefaultOperationName) {
        String oldDefaultOperationName = defaultOperationName;
        defaultOperationName = newDefaultOperationName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CxfPackage.CAMEL_CXF_BINDING_TYPE__DEFAULT_OPERATION_NAME, oldDefaultOperationName, defaultOperationName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDefaultOperationNamespace() {
        return defaultOperationNamespace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultOperationNamespace(String newDefaultOperationNamespace) {
        String oldDefaultOperationNamespace = defaultOperationNamespace;
        defaultOperationNamespace = newDefaultOperationNamespace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CxfPackage.CAMEL_CXF_BINDING_TYPE__DEFAULT_OPERATION_NAMESPACE, oldDefaultOperationNamespace, defaultOperationNamespace));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSynchronous() {
        return synchronous;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSynchronous(boolean newSynchronous) {
        boolean oldSynchronous = synchronous;
        synchronous = newSynchronous;
        boolean oldSynchronousESet = synchronousESet;
        synchronousESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CxfPackage.CAMEL_CXF_BINDING_TYPE__SYNCHRONOUS, oldSynchronous, synchronous, !oldSynchronousESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSynchronous() {
        boolean oldSynchronous = synchronous;
        boolean oldSynchronousESet = synchronousESet;
        synchronous = SYNCHRONOUS_EDEFAULT;
        synchronousESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CxfPackage.CAMEL_CXF_BINDING_TYPE__SYNCHRONOUS, oldSynchronous, SYNCHRONOUS_EDEFAULT, oldSynchronousESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSynchronous() {
        return synchronousESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPublishedEndpointUrl() {
        return publishedEndpointUrl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPublishedEndpointUrl(String newPublishedEndpointUrl) {
        String oldPublishedEndpointUrl = publishedEndpointUrl;
        publishedEndpointUrl = newPublishedEndpointUrl;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CxfPackage.CAMEL_CXF_BINDING_TYPE__PUBLISHED_ENDPOINT_URL, oldPublishedEndpointUrl, publishedEndpointUrl));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isAllowStreaming() {
        return allowStreaming;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAllowStreaming(boolean newAllowStreaming) {
        boolean oldAllowStreaming = allowStreaming;
        allowStreaming = newAllowStreaming;
        boolean oldAllowStreamingESet = allowStreamingESet;
        allowStreamingESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CxfPackage.CAMEL_CXF_BINDING_TYPE__ALLOW_STREAMING, oldAllowStreaming, allowStreaming, !oldAllowStreamingESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAllowStreaming() {
        boolean oldAllowStreaming = allowStreaming;
        boolean oldAllowStreamingESet = allowStreamingESet;
        allowStreaming = ALLOW_STREAMING_EDEFAULT;
        allowStreamingESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CxfPackage.CAMEL_CXF_BINDING_TYPE__ALLOW_STREAMING, oldAllowStreaming, ALLOW_STREAMING_EDEFAULT, oldAllowStreamingESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAllowStreaming() {
        return allowStreamingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSkipFaultLogging() {
        return skipFaultLogging;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSkipFaultLogging(boolean newSkipFaultLogging) {
        boolean oldSkipFaultLogging = skipFaultLogging;
        skipFaultLogging = newSkipFaultLogging;
        boolean oldSkipFaultLoggingESet = skipFaultLoggingESet;
        skipFaultLoggingESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CxfPackage.CAMEL_CXF_BINDING_TYPE__SKIP_FAULT_LOGGING, oldSkipFaultLogging, skipFaultLogging, !oldSkipFaultLoggingESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSkipFaultLogging() {
        boolean oldSkipFaultLogging = skipFaultLogging;
        boolean oldSkipFaultLoggingESet = skipFaultLoggingESet;
        skipFaultLogging = SKIP_FAULT_LOGGING_EDEFAULT;
        skipFaultLoggingESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CxfPackage.CAMEL_CXF_BINDING_TYPE__SKIP_FAULT_LOGGING, oldSkipFaultLogging, SKIP_FAULT_LOGGING_EDEFAULT, oldSkipFaultLoggingESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSkipFaultLogging() {
        return skipFaultLoggingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUsername(String newUsername) {
        String oldUsername = username;
        username = newUsername;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CxfPackage.CAMEL_CXF_BINDING_TYPE__USERNAME, oldUsername, username));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPassword(String newPassword) {
        String oldPassword = password;
        password = newPassword;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CxfPackage.CAMEL_CXF_BINDING_TYPE__PASSWORD, oldPassword, password));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__CXF_URI:
                return getCxfURI();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__WSDL_URL:
                return getWsdlURL();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__SERVICE_CLASS:
                return getServiceClass();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__SERVICE_NAME:
                return getServiceName();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__PORT_NAME:
                return getPortName();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__DATA_FORMAT:
                return getDataFormat();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__RELAY_HEADERS:
                return isRelayHeaders();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__WRAPPED:
                return isWrapped();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__WRAPPED_STYLE:
                return isWrappedStyle();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__SET_DEFAULT_BUS:
                return isSetDefaultBus();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__BUS:
                return getBus();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__CXF_BINDING:
                return getCxfBinding();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__HEADER_FILTER_STRATEGY:
                return getHeaderFilterStrategy();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__LOGGING_FEATURE_ENABLED:
                return isLoggingFeatureEnabled();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__DEFAULT_OPERATION_NAME:
                return getDefaultOperationName();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__DEFAULT_OPERATION_NAMESPACE:
                return getDefaultOperationNamespace();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__SYNCHRONOUS:
                return isSynchronous();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__PUBLISHED_ENDPOINT_URL:
                return getPublishedEndpointUrl();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__ALLOW_STREAMING:
                return isAllowStreaming();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__SKIP_FAULT_LOGGING:
                return isSkipFaultLogging();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__USERNAME:
                return getUsername();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__PASSWORD:
                return getPassword();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__CXF_URI:
                setCxfURI((String)newValue);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__WSDL_URL:
                setWsdlURL((String)newValue);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__SERVICE_CLASS:
                setServiceClass((String)newValue);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__SERVICE_NAME:
                setServiceName((String)newValue);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__PORT_NAME:
                setPortName((String)newValue);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__DATA_FORMAT:
                setDataFormat((String)newValue);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__RELAY_HEADERS:
                setRelayHeaders((Boolean)newValue);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__WRAPPED:
                setWrapped((Boolean)newValue);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__WRAPPED_STYLE:
                setWrappedStyle((Boolean)newValue);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__SET_DEFAULT_BUS:
                setSetDefaultBus((Boolean)newValue);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__BUS:
                setBus((String)newValue);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__CXF_BINDING:
                setCxfBinding((String)newValue);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__HEADER_FILTER_STRATEGY:
                setHeaderFilterStrategy((String)newValue);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__LOGGING_FEATURE_ENABLED:
                setLoggingFeatureEnabled((Boolean)newValue);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__DEFAULT_OPERATION_NAME:
                setDefaultOperationName((String)newValue);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__DEFAULT_OPERATION_NAMESPACE:
                setDefaultOperationNamespace((String)newValue);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__SYNCHRONOUS:
                setSynchronous((Boolean)newValue);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__PUBLISHED_ENDPOINT_URL:
                setPublishedEndpointUrl((String)newValue);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__ALLOW_STREAMING:
                setAllowStreaming((Boolean)newValue);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__SKIP_FAULT_LOGGING:
                setSkipFaultLogging((Boolean)newValue);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__USERNAME:
                setUsername((String)newValue);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__PASSWORD:
                setPassword((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__CXF_URI:
                setCxfURI(CXF_URI_EDEFAULT);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__WSDL_URL:
                setWsdlURL(WSDL_URL_EDEFAULT);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__SERVICE_CLASS:
                setServiceClass(SERVICE_CLASS_EDEFAULT);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__SERVICE_NAME:
                setServiceName(SERVICE_NAME_EDEFAULT);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__PORT_NAME:
                setPortName(PORT_NAME_EDEFAULT);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__DATA_FORMAT:
                setDataFormat(DATA_FORMAT_EDEFAULT);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__RELAY_HEADERS:
                unsetRelayHeaders();
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__WRAPPED:
                unsetWrapped();
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__WRAPPED_STYLE:
                unsetWrappedStyle();
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__SET_DEFAULT_BUS:
                unsetSetDefaultBus();
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__BUS:
                setBus(BUS_EDEFAULT);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__CXF_BINDING:
                setCxfBinding(CXF_BINDING_EDEFAULT);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__HEADER_FILTER_STRATEGY:
                setHeaderFilterStrategy(HEADER_FILTER_STRATEGY_EDEFAULT);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__LOGGING_FEATURE_ENABLED:
                unsetLoggingFeatureEnabled();
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__DEFAULT_OPERATION_NAME:
                setDefaultOperationName(DEFAULT_OPERATION_NAME_EDEFAULT);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__DEFAULT_OPERATION_NAMESPACE:
                setDefaultOperationNamespace(DEFAULT_OPERATION_NAMESPACE_EDEFAULT);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__SYNCHRONOUS:
                unsetSynchronous();
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__PUBLISHED_ENDPOINT_URL:
                setPublishedEndpointUrl(PUBLISHED_ENDPOINT_URL_EDEFAULT);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__ALLOW_STREAMING:
                unsetAllowStreaming();
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__SKIP_FAULT_LOGGING:
                unsetSkipFaultLogging();
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__USERNAME:
                setUsername(USERNAME_EDEFAULT);
                return;
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__PASSWORD:
                setPassword(PASSWORD_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__CXF_URI:
                return CXF_URI_EDEFAULT == null ? cxfURI != null : !CXF_URI_EDEFAULT.equals(cxfURI);
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__WSDL_URL:
                return WSDL_URL_EDEFAULT == null ? wsdlURL != null : !WSDL_URL_EDEFAULT.equals(wsdlURL);
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__SERVICE_CLASS:
                return SERVICE_CLASS_EDEFAULT == null ? serviceClass != null : !SERVICE_CLASS_EDEFAULT.equals(serviceClass);
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__SERVICE_NAME:
                return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__PORT_NAME:
                return PORT_NAME_EDEFAULT == null ? portName != null : !PORT_NAME_EDEFAULT.equals(portName);
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__DATA_FORMAT:
                return DATA_FORMAT_EDEFAULT == null ? dataFormat != null : !DATA_FORMAT_EDEFAULT.equals(dataFormat);
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__RELAY_HEADERS:
                return isSetRelayHeaders();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__WRAPPED:
                return isSetWrapped();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__WRAPPED_STYLE:
                return isSetWrappedStyle();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__SET_DEFAULT_BUS:
                return isSetSetDefaultBus();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__BUS:
                return BUS_EDEFAULT == null ? bus != null : !BUS_EDEFAULT.equals(bus);
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__CXF_BINDING:
                return CXF_BINDING_EDEFAULT == null ? cxfBinding != null : !CXF_BINDING_EDEFAULT.equals(cxfBinding);
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__HEADER_FILTER_STRATEGY:
                return HEADER_FILTER_STRATEGY_EDEFAULT == null ? headerFilterStrategy != null : !HEADER_FILTER_STRATEGY_EDEFAULT.equals(headerFilterStrategy);
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__LOGGING_FEATURE_ENABLED:
                return isSetLoggingFeatureEnabled();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__DEFAULT_OPERATION_NAME:
                return DEFAULT_OPERATION_NAME_EDEFAULT == null ? defaultOperationName != null : !DEFAULT_OPERATION_NAME_EDEFAULT.equals(defaultOperationName);
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__DEFAULT_OPERATION_NAMESPACE:
                return DEFAULT_OPERATION_NAMESPACE_EDEFAULT == null ? defaultOperationNamespace != null : !DEFAULT_OPERATION_NAMESPACE_EDEFAULT.equals(defaultOperationNamespace);
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__SYNCHRONOUS:
                return isSetSynchronous();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__PUBLISHED_ENDPOINT_URL:
                return PUBLISHED_ENDPOINT_URL_EDEFAULT == null ? publishedEndpointUrl != null : !PUBLISHED_ENDPOINT_URL_EDEFAULT.equals(publishedEndpointUrl);
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__ALLOW_STREAMING:
                return isSetAllowStreaming();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__SKIP_FAULT_LOGGING:
                return isSetSkipFaultLogging();
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__USERNAME:
                return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
            case CxfPackage.CAMEL_CXF_BINDING_TYPE__PASSWORD:
                return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (cxfURI: ");
        result.append(cxfURI);
        result.append(", wsdlURL: ");
        result.append(wsdlURL);
        result.append(", serviceClass: ");
        result.append(serviceClass);
        result.append(", serviceName: ");
        result.append(serviceName);
        result.append(", portName: ");
        result.append(portName);
        result.append(", dataFormat: ");
        result.append(dataFormat);
        result.append(", relayHeaders: ");
        if (relayHeadersESet) result.append(relayHeaders); else result.append("<unset>");
        result.append(", wrapped: ");
        if (wrappedESet) result.append(wrapped); else result.append("<unset>");
        result.append(", wrappedStyle: ");
        if (wrappedStyleESet) result.append(wrappedStyle); else result.append("<unset>");
        result.append(", setDefaultBus: ");
        if (setDefaultBusESet) result.append(setDefaultBus); else result.append("<unset>");
        result.append(", bus: ");
        result.append(bus);
        result.append(", cxfBinding: ");
        result.append(cxfBinding);
        result.append(", headerFilterStrategy: ");
        result.append(headerFilterStrategy);
        result.append(", loggingFeatureEnabled: ");
        if (loggingFeatureEnabledESet) result.append(loggingFeatureEnabled); else result.append("<unset>");
        result.append(", defaultOperationName: ");
        result.append(defaultOperationName);
        result.append(", defaultOperationNamespace: ");
        result.append(defaultOperationNamespace);
        result.append(", synchronous: ");
        if (synchronousESet) result.append(synchronous); else result.append("<unset>");
        result.append(", publishedEndpointUrl: ");
        result.append(publishedEndpointUrl);
        result.append(", allowStreaming: ");
        if (allowStreamingESet) result.append(allowStreaming); else result.append("<unset>");
        result.append(", skipFaultLogging: ");
        if (skipFaultLoggingESet) result.append(skipFaultLogging); else result.append("<unset>");
        result.append(", username: ");
        result.append(username);
        result.append(", password: ");
        result.append(password);
        result.append(')');
        return result.toString();
    }

} //CamelCxfBindingTypeImpl
