/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.soap.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.switchyard.tools.models.switchyard1_0.soap.BasicAuthenticationType;
import org.switchyard.tools.models.switchyard1_0.soap.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.soap.EndpointConfigType;
import org.switchyard.tools.models.switchyard1_0.soap.InterceptorsType;
import org.switchyard.tools.models.switchyard1_0.soap.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.soap.MtomType;
import org.switchyard.tools.models.switchyard1_0.soap.NTLMAuthenticationType;
import org.switchyard.tools.models.switchyard1_0.soap.ProxyType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardBindingTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl#getContextMapper <em>Context Mapper</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl#getMessageComposer <em>Message Composer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl#getWsdl <em>Wsdl</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl#getWsdlPort <em>Wsdl Port</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl#getSocketAddr <em>Socket Addr</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl#getEndpointConfig <em>Endpoint Config</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl#getEndpointAddress <em>Endpoint Address</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl#getNtlm <em>Ntlm</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl#getProxy <em>Proxy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl#getMtom <em>Mtom</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl#getInInterceptors <em>In Interceptors</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.SOAPBindingTypeImpl#getOutInterceptors <em>Out Interceptors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SOAPBindingTypeImpl extends SwitchYardBindingTypeImpl implements SOAPBindingType {
    /**
     * The cached value of the '{@link #getContextMapper() <em>Context Mapper</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextMapper()
     * @generated
     * @ordered
     */
    protected ContextMapperType contextMapper;

    /**
     * The cached value of the '{@link #getMessageComposer() <em>Message Composer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageComposer()
     * @generated
     * @ordered
     */
    protected MessageComposerType messageComposer;

    /**
     * The default value of the '{@link #getWsdl() <em>Wsdl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWsdl()
     * @generated
     * @ordered
     */
    protected static final String WSDL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWsdl() <em>Wsdl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWsdl()
     * @generated
     * @ordered
     */
    protected String wsdl = WSDL_EDEFAULT;

    /**
     * The default value of the '{@link #getWsdlPort() <em>Wsdl Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWsdlPort()
     * @generated
     * @ordered
     */
    protected static final String WSDL_PORT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWsdlPort() <em>Wsdl Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWsdlPort()
     * @generated
     * @ordered
     */
    protected String wsdlPort = WSDL_PORT_EDEFAULT;

    /**
     * The default value of the '{@link #getSocketAddr() <em>Socket Addr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSocketAddr()
     * @generated
     * @ordered
     */
    protected static final String SOCKET_ADDR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSocketAddr() <em>Socket Addr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSocketAddr()
     * @generated
     * @ordered
     */
    protected String socketAddr = SOCKET_ADDR_EDEFAULT;

    /**
     * The default value of the '{@link #getContextPath() <em>Context Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextPath()
     * @generated
     * @ordered
     */
    protected static final String CONTEXT_PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getContextPath() <em>Context Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextPath()
     * @generated
     * @ordered
     */
    protected String contextPath = CONTEXT_PATH_EDEFAULT;

    /**
     * The cached value of the '{@link #getEndpointConfig() <em>Endpoint Config</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndpointConfig()
     * @generated
     * @ordered
     */
    protected EndpointConfigType endpointConfig;

    /**
     * The default value of the '{@link #getEndpointAddress() <em>Endpoint Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndpointAddress()
     * @generated
     * @ordered
     */
    protected static final String ENDPOINT_ADDRESS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEndpointAddress() <em>Endpoint Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndpointAddress()
     * @generated
     * @ordered
     */
    protected String endpointAddress = ENDPOINT_ADDRESS_EDEFAULT;

    /**
     * The cached value of the '{@link #getBasic() <em>Basic</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBasic()
     * @generated
     * @ordered
     */
    protected BasicAuthenticationType basic;

    /**
     * The cached value of the '{@link #getNtlm() <em>Ntlm</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNtlm()
     * @generated
     * @ordered
     */
    protected NTLMAuthenticationType ntlm;

    /**
     * The cached value of the '{@link #getProxy() <em>Proxy</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProxy()
     * @generated
     * @ordered
     */
    protected ProxyType proxy;

    /**
     * The cached value of the '{@link #getMtom() <em>Mtom</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMtom()
     * @generated
     * @ordered
     */
    protected MtomType mtom;

    /**
     * The cached value of the '{@link #getInInterceptors() <em>In Interceptors</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInInterceptors()
     * @generated
     * @ordered
     */
    protected InterceptorsType inInterceptors;

    /**
     * The cached value of the '{@link #getOutInterceptors() <em>Out Interceptors</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutInterceptors()
     * @generated
     * @ordered
     */
    protected InterceptorsType outInterceptors;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SOAPBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SOAPPackage.Literals.SOAP_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextMapperType getContextMapper() {
        return contextMapper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContextMapper(ContextMapperType newContextMapper, NotificationChain msgs) {
        ContextMapperType oldContextMapper = contextMapper;
        contextMapper = newContextMapper;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__CONTEXT_MAPPER, oldContextMapper, newContextMapper);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextMapper(ContextMapperType newContextMapper) {
        if (newContextMapper != contextMapper) {
            NotificationChain msgs = null;
            if (contextMapper != null)
                msgs = ((InternalEObject)contextMapper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__CONTEXT_MAPPER, null, msgs);
            if (newContextMapper != null)
                msgs = ((InternalEObject)newContextMapper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__CONTEXT_MAPPER, null, msgs);
            msgs = basicSetContextMapper(newContextMapper, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__CONTEXT_MAPPER, newContextMapper, newContextMapper));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageComposerType getMessageComposer() {
        return messageComposer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMessageComposer(MessageComposerType newMessageComposer, NotificationChain msgs) {
        MessageComposerType oldMessageComposer = messageComposer;
        messageComposer = newMessageComposer;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__MESSAGE_COMPOSER, oldMessageComposer, newMessageComposer);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessageComposer(MessageComposerType newMessageComposer) {
        if (newMessageComposer != messageComposer) {
            NotificationChain msgs = null;
            if (messageComposer != null)
                msgs = ((InternalEObject)messageComposer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__MESSAGE_COMPOSER, null, msgs);
            if (newMessageComposer != null)
                msgs = ((InternalEObject)newMessageComposer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__MESSAGE_COMPOSER, null, msgs);
            msgs = basicSetMessageComposer(newMessageComposer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__MESSAGE_COMPOSER, newMessageComposer, newMessageComposer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getWsdl() {
        return wsdl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWsdl(String newWsdl) {
        String oldWsdl = wsdl;
        wsdl = newWsdl;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__WSDL, oldWsdl, wsdl));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getWsdlPort() {
        return wsdlPort;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWsdlPort(String newWsdlPort) {
        String oldWsdlPort = wsdlPort;
        wsdlPort = newWsdlPort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__WSDL_PORT, oldWsdlPort, wsdlPort));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSocketAddr() {
        return socketAddr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSocketAddr(String newSocketAddr) {
        String oldSocketAddr = socketAddr;
        socketAddr = newSocketAddr;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__SOCKET_ADDR, oldSocketAddr, socketAddr));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getContextPath() {
        return contextPath;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextPath(String newContextPath) {
        String oldContextPath = contextPath;
        contextPath = newContextPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__CONTEXT_PATH, oldContextPath, contextPath));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEndpointAddress() {
        return endpointAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEndpointAddress(String newEndpointAddress) {
        String oldEndpointAddress = endpointAddress;
        endpointAddress = newEndpointAddress;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_ADDRESS, oldEndpointAddress, endpointAddress));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BasicAuthenticationType getBasic() {
        return basic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBasic(BasicAuthenticationType newBasic, NotificationChain msgs) {
        BasicAuthenticationType oldBasic = basic;
        basic = newBasic;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__BASIC, oldBasic, newBasic);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBasic(BasicAuthenticationType newBasic) {
        if (newBasic != basic) {
            NotificationChain msgs = null;
            if (basic != null)
                msgs = ((InternalEObject)basic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__BASIC, null, msgs);
            if (newBasic != null)
                msgs = ((InternalEObject)newBasic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__BASIC, null, msgs);
            msgs = basicSetBasic(newBasic, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__BASIC, newBasic, newBasic));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NTLMAuthenticationType getNtlm() {
        return ntlm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNtlm(NTLMAuthenticationType newNtlm, NotificationChain msgs) {
        NTLMAuthenticationType oldNtlm = ntlm;
        ntlm = newNtlm;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__NTLM, oldNtlm, newNtlm);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNtlm(NTLMAuthenticationType newNtlm) {
        if (newNtlm != ntlm) {
            NotificationChain msgs = null;
            if (ntlm != null)
                msgs = ((InternalEObject)ntlm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__NTLM, null, msgs);
            if (newNtlm != null)
                msgs = ((InternalEObject)newNtlm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__NTLM, null, msgs);
            msgs = basicSetNtlm(newNtlm, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__NTLM, newNtlm, newNtlm));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InterceptorsType getInInterceptors() {
        return inInterceptors;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInInterceptors(InterceptorsType newInInterceptors, NotificationChain msgs) {
        InterceptorsType oldInInterceptors = inInterceptors;
        inInterceptors = newInInterceptors;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__IN_INTERCEPTORS, oldInInterceptors, newInInterceptors);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInInterceptors(InterceptorsType newInInterceptors) {
        if (newInInterceptors != inInterceptors) {
            NotificationChain msgs = null;
            if (inInterceptors != null)
                msgs = ((InternalEObject)inInterceptors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__IN_INTERCEPTORS, null, msgs);
            if (newInInterceptors != null)
                msgs = ((InternalEObject)newInInterceptors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__IN_INTERCEPTORS, null, msgs);
            msgs = basicSetInInterceptors(newInInterceptors, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__IN_INTERCEPTORS, newInInterceptors, newInInterceptors));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InterceptorsType getOutInterceptors() {
        return outInterceptors;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOutInterceptors(InterceptorsType newOutInterceptors, NotificationChain msgs) {
        InterceptorsType oldOutInterceptors = outInterceptors;
        outInterceptors = newOutInterceptors;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__OUT_INTERCEPTORS, oldOutInterceptors, newOutInterceptors);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutInterceptors(InterceptorsType newOutInterceptors) {
        if (newOutInterceptors != outInterceptors) {
            NotificationChain msgs = null;
            if (outInterceptors != null)
                msgs = ((InternalEObject)outInterceptors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__OUT_INTERCEPTORS, null, msgs);
            if (newOutInterceptors != null)
                msgs = ((InternalEObject)newOutInterceptors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__OUT_INTERCEPTORS, null, msgs);
            msgs = basicSetOutInterceptors(newOutInterceptors, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__OUT_INTERCEPTORS, newOutInterceptors, newOutInterceptors));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MtomType getMtom() {
        return mtom;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMtom(MtomType newMtom, NotificationChain msgs) {
        MtomType oldMtom = mtom;
        mtom = newMtom;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__MTOM, oldMtom, newMtom);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMtom(MtomType newMtom) {
        if (newMtom != mtom) {
            NotificationChain msgs = null;
            if (mtom != null)
                msgs = ((InternalEObject)mtom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__MTOM, null, msgs);
            if (newMtom != null)
                msgs = ((InternalEObject)newMtom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__MTOM, null, msgs);
            msgs = basicSetMtom(newMtom, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__MTOM, newMtom, newMtom));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EndpointConfigType getEndpointConfig() {
        return endpointConfig;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEndpointConfig(EndpointConfigType newEndpointConfig, NotificationChain msgs) {
        EndpointConfigType oldEndpointConfig = endpointConfig;
        endpointConfig = newEndpointConfig;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_CONFIG, oldEndpointConfig, newEndpointConfig);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEndpointConfig(EndpointConfigType newEndpointConfig) {
        if (newEndpointConfig != endpointConfig) {
            NotificationChain msgs = null;
            if (endpointConfig != null)
                msgs = ((InternalEObject)endpointConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_CONFIG, null, msgs);
            if (newEndpointConfig != null)
                msgs = ((InternalEObject)newEndpointConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_CONFIG, null, msgs);
            msgs = basicSetEndpointConfig(newEndpointConfig, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_CONFIG, newEndpointConfig, newEndpointConfig));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProxyType getProxy() {
        return proxy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProxy(ProxyType newProxy, NotificationChain msgs) {
        ProxyType oldProxy = proxy;
        proxy = newProxy;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__PROXY, oldProxy, newProxy);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProxy(ProxyType newProxy) {
        if (newProxy != proxy) {
            NotificationChain msgs = null;
            if (proxy != null)
                msgs = ((InternalEObject)proxy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__PROXY, null, msgs);
            if (newProxy != null)
                msgs = ((InternalEObject)newProxy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOAPPackage.SOAP_BINDING_TYPE__PROXY, null, msgs);
            msgs = basicSetProxy(newProxy, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.SOAP_BINDING_TYPE__PROXY, newProxy, newProxy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SOAPPackage.SOAP_BINDING_TYPE__CONTEXT_MAPPER:
                return basicSetContextMapper(null, msgs);
            case SOAPPackage.SOAP_BINDING_TYPE__MESSAGE_COMPOSER:
                return basicSetMessageComposer(null, msgs);
            case SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_CONFIG:
                return basicSetEndpointConfig(null, msgs);
            case SOAPPackage.SOAP_BINDING_TYPE__BASIC:
                return basicSetBasic(null, msgs);
            case SOAPPackage.SOAP_BINDING_TYPE__NTLM:
                return basicSetNtlm(null, msgs);
            case SOAPPackage.SOAP_BINDING_TYPE__PROXY:
                return basicSetProxy(null, msgs);
            case SOAPPackage.SOAP_BINDING_TYPE__MTOM:
                return basicSetMtom(null, msgs);
            case SOAPPackage.SOAP_BINDING_TYPE__IN_INTERCEPTORS:
                return basicSetInInterceptors(null, msgs);
            case SOAPPackage.SOAP_BINDING_TYPE__OUT_INTERCEPTORS:
                return basicSetOutInterceptors(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SOAPPackage.SOAP_BINDING_TYPE__CONTEXT_MAPPER:
                return getContextMapper();
            case SOAPPackage.SOAP_BINDING_TYPE__MESSAGE_COMPOSER:
                return getMessageComposer();
            case SOAPPackage.SOAP_BINDING_TYPE__WSDL:
                return getWsdl();
            case SOAPPackage.SOAP_BINDING_TYPE__WSDL_PORT:
                return getWsdlPort();
            case SOAPPackage.SOAP_BINDING_TYPE__SOCKET_ADDR:
                return getSocketAddr();
            case SOAPPackage.SOAP_BINDING_TYPE__CONTEXT_PATH:
                return getContextPath();
            case SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_CONFIG:
                return getEndpointConfig();
            case SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_ADDRESS:
                return getEndpointAddress();
            case SOAPPackage.SOAP_BINDING_TYPE__BASIC:
                return getBasic();
            case SOAPPackage.SOAP_BINDING_TYPE__NTLM:
                return getNtlm();
            case SOAPPackage.SOAP_BINDING_TYPE__PROXY:
                return getProxy();
            case SOAPPackage.SOAP_BINDING_TYPE__MTOM:
                return getMtom();
            case SOAPPackage.SOAP_BINDING_TYPE__IN_INTERCEPTORS:
                return getInInterceptors();
            case SOAPPackage.SOAP_BINDING_TYPE__OUT_INTERCEPTORS:
                return getOutInterceptors();
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
            case SOAPPackage.SOAP_BINDING_TYPE__CONTEXT_MAPPER:
                setContextMapper((ContextMapperType)newValue);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__MESSAGE_COMPOSER:
                setMessageComposer((MessageComposerType)newValue);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__WSDL:
                setWsdl((String)newValue);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__WSDL_PORT:
                setWsdlPort((String)newValue);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__SOCKET_ADDR:
                setSocketAddr((String)newValue);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__CONTEXT_PATH:
                setContextPath((String)newValue);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_CONFIG:
                setEndpointConfig((EndpointConfigType)newValue);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_ADDRESS:
                setEndpointAddress((String)newValue);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__BASIC:
                setBasic((BasicAuthenticationType)newValue);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__NTLM:
                setNtlm((NTLMAuthenticationType)newValue);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__PROXY:
                setProxy((ProxyType)newValue);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__MTOM:
                setMtom((MtomType)newValue);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__IN_INTERCEPTORS:
                setInInterceptors((InterceptorsType)newValue);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__OUT_INTERCEPTORS:
                setOutInterceptors((InterceptorsType)newValue);
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
            case SOAPPackage.SOAP_BINDING_TYPE__CONTEXT_MAPPER:
                setContextMapper((ContextMapperType)null);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__MESSAGE_COMPOSER:
                setMessageComposer((MessageComposerType)null);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__WSDL:
                setWsdl(WSDL_EDEFAULT);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__WSDL_PORT:
                setWsdlPort(WSDL_PORT_EDEFAULT);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__SOCKET_ADDR:
                setSocketAddr(SOCKET_ADDR_EDEFAULT);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__CONTEXT_PATH:
                setContextPath(CONTEXT_PATH_EDEFAULT);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_CONFIG:
                setEndpointConfig((EndpointConfigType)null);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_ADDRESS:
                setEndpointAddress(ENDPOINT_ADDRESS_EDEFAULT);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__BASIC:
                setBasic((BasicAuthenticationType)null);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__NTLM:
                setNtlm((NTLMAuthenticationType)null);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__PROXY:
                setProxy((ProxyType)null);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__MTOM:
                setMtom((MtomType)null);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__IN_INTERCEPTORS:
                setInInterceptors((InterceptorsType)null);
                return;
            case SOAPPackage.SOAP_BINDING_TYPE__OUT_INTERCEPTORS:
                setOutInterceptors((InterceptorsType)null);
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
            case SOAPPackage.SOAP_BINDING_TYPE__CONTEXT_MAPPER:
                return contextMapper != null;
            case SOAPPackage.SOAP_BINDING_TYPE__MESSAGE_COMPOSER:
                return messageComposer != null;
            case SOAPPackage.SOAP_BINDING_TYPE__WSDL:
                return WSDL_EDEFAULT == null ? wsdl != null : !WSDL_EDEFAULT.equals(wsdl);
            case SOAPPackage.SOAP_BINDING_TYPE__WSDL_PORT:
                return WSDL_PORT_EDEFAULT == null ? wsdlPort != null : !WSDL_PORT_EDEFAULT.equals(wsdlPort);
            case SOAPPackage.SOAP_BINDING_TYPE__SOCKET_ADDR:
                return SOCKET_ADDR_EDEFAULT == null ? socketAddr != null : !SOCKET_ADDR_EDEFAULT.equals(socketAddr);
            case SOAPPackage.SOAP_BINDING_TYPE__CONTEXT_PATH:
                return CONTEXT_PATH_EDEFAULT == null ? contextPath != null : !CONTEXT_PATH_EDEFAULT.equals(contextPath);
            case SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_CONFIG:
                return endpointConfig != null;
            case SOAPPackage.SOAP_BINDING_TYPE__ENDPOINT_ADDRESS:
                return ENDPOINT_ADDRESS_EDEFAULT == null ? endpointAddress != null : !ENDPOINT_ADDRESS_EDEFAULT.equals(endpointAddress);
            case SOAPPackage.SOAP_BINDING_TYPE__BASIC:
                return basic != null;
            case SOAPPackage.SOAP_BINDING_TYPE__NTLM:
                return ntlm != null;
            case SOAPPackage.SOAP_BINDING_TYPE__PROXY:
                return proxy != null;
            case SOAPPackage.SOAP_BINDING_TYPE__MTOM:
                return mtom != null;
            case SOAPPackage.SOAP_BINDING_TYPE__IN_INTERCEPTORS:
                return inInterceptors != null;
            case SOAPPackage.SOAP_BINDING_TYPE__OUT_INTERCEPTORS:
                return outInterceptors != null;
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
        result.append(" (wsdl: ");
        result.append(wsdl);
        result.append(", wsdlPort: ");
        result.append(wsdlPort);
        result.append(", socketAddr: ");
        result.append(socketAddr);
        result.append(", contextPath: ");
        result.append(contextPath);
        result.append(", endpointAddress: ");
        result.append(endpointAddress);
        result.append(')');
        return result.toString();
    }

    @Override
    public void setMessageComposer(
            org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType messageComposer) {
        setMessageComposer((MessageComposerType) messageComposer);
    }

    @Override
    public void setContextMapper(org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType contextMapper) {
        setContextMapper((ContextMapperType) contextMapper);
    }

} //SOAPBindingTypeImpl
