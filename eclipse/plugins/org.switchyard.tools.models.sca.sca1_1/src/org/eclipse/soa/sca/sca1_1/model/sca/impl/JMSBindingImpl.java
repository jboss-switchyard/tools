/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.impl;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.soa.sca.sca1_1.model.sca.JMSActivationSpec;
import org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding;
import org.eclipse.soa.sca.sca1_1.model.sca.JMSConnectionFactory;
import org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination;
import org.eclipse.soa.sca.sca1_1.model.sca.JMSHeaders;
import org.eclipse.soa.sca.sca1_1.model.sca.JMSMessageSelection;
import org.eclipse.soa.sca.sca1_1.model.sca.JMSOperationProperties;
import org.eclipse.soa.sca.sca1_1.model.sca.JMSResourceAdapter;
import org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JMS Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSBindingImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSBindingImpl#getConnectionFactory <em>Connection Factory</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSBindingImpl#getActivationSpec <em>Activation Spec</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSBindingImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSBindingImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSBindingImpl#getMessageSelection <em>Message Selection</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSBindingImpl#getResourceAdapter <em>Resource Adapter</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSBindingImpl#getOperationProperties <em>Operation Properties</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSBindingImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSBindingImpl#getCorrelationScheme <em>Correlation Scheme</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSBindingImpl#getInitialContextFactory <em>Initial Context Factory</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSBindingImpl#getJndiURL <em>Jndi URL</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSBindingImpl#getOperationProperties1 <em>Operation Properties1</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSBindingImpl#getRequestConnection <em>Request Connection</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSBindingImpl#getResponseConnection <em>Response Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JMSBindingImpl extends BindingImpl implements JMSBinding {
	/**
     * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDestination()
     * @generated
     * @ordered
     */
	protected JMSDestination destination;

	/**
     * The cached value of the '{@link #getConnectionFactory() <em>Connection Factory</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getConnectionFactory()
     * @generated
     * @ordered
     */
	protected JMSConnectionFactory connectionFactory;

	/**
     * The cached value of the '{@link #getActivationSpec() <em>Activation Spec</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getActivationSpec()
     * @generated
     * @ordered
     */
	protected JMSActivationSpec activationSpec;

	/**
     * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResponse()
     * @generated
     * @ordered
     */
	protected JMSResponse response;

	/**
     * The cached value of the '{@link #getHeaders() <em>Headers</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHeaders()
     * @generated
     * @ordered
     */
	protected JMSHeaders headers;

	/**
     * The cached value of the '{@link #getMessageSelection() <em>Message Selection</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMessageSelection()
     * @generated
     * @ordered
     */
	protected JMSMessageSelection messageSelection;

	/**
     * The cached value of the '{@link #getResourceAdapter() <em>Resource Adapter</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResourceAdapter()
     * @generated
     * @ordered
     */
	protected JMSResourceAdapter resourceAdapter;

	/**
     * The cached value of the '{@link #getOperationProperties() <em>Operation Properties</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOperationProperties()
     * @generated
     * @ordered
     */
	protected EList<JMSOperationProperties> operationProperties;

	/**
     * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAny()
     * @generated
     * @ordered
     */
	protected FeatureMap any;

	/**
     * The default value of the '{@link #getCorrelationScheme() <em>Correlation Scheme</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCorrelationScheme()
     * @generated
     * @ordered
     */
	protected static final QName CORRELATION_SCHEME_EDEFAULT = (QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getQName(), "sca:messageId");

	/**
     * The cached value of the '{@link #getCorrelationScheme() <em>Correlation Scheme</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCorrelationScheme()
     * @generated
     * @ordered
     */
	protected QName correlationScheme = CORRELATION_SCHEME_EDEFAULT;

	/**
     * This is true if the Correlation Scheme attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean correlationSchemeESet;

	/**
     * The default value of the '{@link #getInitialContextFactory() <em>Initial Context Factory</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInitialContextFactory()
     * @generated
     * @ordered
     */
	protected static final String INITIAL_CONTEXT_FACTORY_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getInitialContextFactory() <em>Initial Context Factory</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInitialContextFactory()
     * @generated
     * @ordered
     */
	protected String initialContextFactory = INITIAL_CONTEXT_FACTORY_EDEFAULT;

	/**
     * The default value of the '{@link #getJndiURL() <em>Jndi URL</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getJndiURL()
     * @generated
     * @ordered
     */
	protected static final String JNDI_URL_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getJndiURL() <em>Jndi URL</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getJndiURL()
     * @generated
     * @ordered
     */
	protected String jndiURL = JNDI_URL_EDEFAULT;

	/**
     * The default value of the '{@link #getOperationProperties1() <em>Operation Properties1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOperationProperties1()
     * @generated
     * @ordered
     */
	protected static final QName OPERATION_PROPERTIES1_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getOperationProperties1() <em>Operation Properties1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOperationProperties1()
     * @generated
     * @ordered
     */
	protected QName operationProperties1 = OPERATION_PROPERTIES1_EDEFAULT;

	/**
     * The default value of the '{@link #getRequestConnection() <em>Request Connection</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRequestConnection()
     * @generated
     * @ordered
     */
	protected static final QName REQUEST_CONNECTION_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRequestConnection() <em>Request Connection</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRequestConnection()
     * @generated
     * @ordered
     */
	protected QName requestConnection = REQUEST_CONNECTION_EDEFAULT;

	/**
     * The default value of the '{@link #getResponseConnection() <em>Response Connection</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResponseConnection()
     * @generated
     * @ordered
     */
	protected static final QName RESPONSE_CONNECTION_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getResponseConnection() <em>Response Connection</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResponseConnection()
     * @generated
     * @ordered
     */
	protected QName responseConnection = RESPONSE_CONNECTION_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected JMSBindingImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getJMSBinding();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JMSDestination getDestination() {
        return destination;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetDestination(JMSDestination newDestination, NotificationChain msgs) {
        JMSDestination oldDestination = destination;
        destination = newDestination;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_BINDING__DESTINATION, oldDestination, newDestination);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDestination(JMSDestination newDestination) {
        if (newDestination != destination) {
            NotificationChain msgs = null;
            if (destination != null)
                msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JMS_BINDING__DESTINATION, null, msgs);
            if (newDestination != null)
                msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JMS_BINDING__DESTINATION, null, msgs);
            msgs = basicSetDestination(newDestination, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_BINDING__DESTINATION, newDestination, newDestination));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JMSConnectionFactory getConnectionFactory() {
        return connectionFactory;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetConnectionFactory(JMSConnectionFactory newConnectionFactory, NotificationChain msgs) {
        JMSConnectionFactory oldConnectionFactory = connectionFactory;
        connectionFactory = newConnectionFactory;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_BINDING__CONNECTION_FACTORY, oldConnectionFactory, newConnectionFactory);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setConnectionFactory(JMSConnectionFactory newConnectionFactory) {
        if (newConnectionFactory != connectionFactory) {
            NotificationChain msgs = null;
            if (connectionFactory != null)
                msgs = ((InternalEObject)connectionFactory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JMS_BINDING__CONNECTION_FACTORY, null, msgs);
            if (newConnectionFactory != null)
                msgs = ((InternalEObject)newConnectionFactory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JMS_BINDING__CONNECTION_FACTORY, null, msgs);
            msgs = basicSetConnectionFactory(newConnectionFactory, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_BINDING__CONNECTION_FACTORY, newConnectionFactory, newConnectionFactory));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JMSActivationSpec getActivationSpec() {
        return activationSpec;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetActivationSpec(JMSActivationSpec newActivationSpec, NotificationChain msgs) {
        JMSActivationSpec oldActivationSpec = activationSpec;
        activationSpec = newActivationSpec;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_BINDING__ACTIVATION_SPEC, oldActivationSpec, newActivationSpec);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setActivationSpec(JMSActivationSpec newActivationSpec) {
        if (newActivationSpec != activationSpec) {
            NotificationChain msgs = null;
            if (activationSpec != null)
                msgs = ((InternalEObject)activationSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JMS_BINDING__ACTIVATION_SPEC, null, msgs);
            if (newActivationSpec != null)
                msgs = ((InternalEObject)newActivationSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JMS_BINDING__ACTIVATION_SPEC, null, msgs);
            msgs = basicSetActivationSpec(newActivationSpec, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_BINDING__ACTIVATION_SPEC, newActivationSpec, newActivationSpec));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JMSResponse getResponse() {
        return response;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetResponse(JMSResponse newResponse, NotificationChain msgs) {
        JMSResponse oldResponse = response;
        response = newResponse;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_BINDING__RESPONSE, oldResponse, newResponse);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setResponse(JMSResponse newResponse) {
        if (newResponse != response) {
            NotificationChain msgs = null;
            if (response != null)
                msgs = ((InternalEObject)response).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JMS_BINDING__RESPONSE, null, msgs);
            if (newResponse != null)
                msgs = ((InternalEObject)newResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JMS_BINDING__RESPONSE, null, msgs);
            msgs = basicSetResponse(newResponse, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_BINDING__RESPONSE, newResponse, newResponse));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JMSHeaders getHeaders() {
        return headers;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetHeaders(JMSHeaders newHeaders, NotificationChain msgs) {
        JMSHeaders oldHeaders = headers;
        headers = newHeaders;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_BINDING__HEADERS, oldHeaders, newHeaders);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHeaders(JMSHeaders newHeaders) {
        if (newHeaders != headers) {
            NotificationChain msgs = null;
            if (headers != null)
                msgs = ((InternalEObject)headers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JMS_BINDING__HEADERS, null, msgs);
            if (newHeaders != null)
                msgs = ((InternalEObject)newHeaders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JMS_BINDING__HEADERS, null, msgs);
            msgs = basicSetHeaders(newHeaders, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_BINDING__HEADERS, newHeaders, newHeaders));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JMSMessageSelection getMessageSelection() {
        return messageSelection;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetMessageSelection(JMSMessageSelection newMessageSelection, NotificationChain msgs) {
        JMSMessageSelection oldMessageSelection = messageSelection;
        messageSelection = newMessageSelection;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_BINDING__MESSAGE_SELECTION, oldMessageSelection, newMessageSelection);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMessageSelection(JMSMessageSelection newMessageSelection) {
        if (newMessageSelection != messageSelection) {
            NotificationChain msgs = null;
            if (messageSelection != null)
                msgs = ((InternalEObject)messageSelection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JMS_BINDING__MESSAGE_SELECTION, null, msgs);
            if (newMessageSelection != null)
                msgs = ((InternalEObject)newMessageSelection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JMS_BINDING__MESSAGE_SELECTION, null, msgs);
            msgs = basicSetMessageSelection(newMessageSelection, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_BINDING__MESSAGE_SELECTION, newMessageSelection, newMessageSelection));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JMSResourceAdapter getResourceAdapter() {
        return resourceAdapter;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetResourceAdapter(JMSResourceAdapter newResourceAdapter, NotificationChain msgs) {
        JMSResourceAdapter oldResourceAdapter = resourceAdapter;
        resourceAdapter = newResourceAdapter;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_BINDING__RESOURCE_ADAPTER, oldResourceAdapter, newResourceAdapter);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setResourceAdapter(JMSResourceAdapter newResourceAdapter) {
        if (newResourceAdapter != resourceAdapter) {
            NotificationChain msgs = null;
            if (resourceAdapter != null)
                msgs = ((InternalEObject)resourceAdapter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JMS_BINDING__RESOURCE_ADAPTER, null, msgs);
            if (newResourceAdapter != null)
                msgs = ((InternalEObject)newResourceAdapter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JMS_BINDING__RESOURCE_ADAPTER, null, msgs);
            msgs = basicSetResourceAdapter(newResourceAdapter, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_BINDING__RESOURCE_ADAPTER, newResourceAdapter, newResourceAdapter));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<JMSOperationProperties> getOperationProperties() {
        if (operationProperties == null) {
            operationProperties = new EObjectContainmentEList<JMSOperationProperties>(JMSOperationProperties.class, this, ScaPackage.JMS_BINDING__OPERATION_PROPERTIES);
        }
        return operationProperties;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAny() {
        if (any == null) {
            any = new BasicFeatureMap(this, ScaPackage.JMS_BINDING__ANY);
        }
        return any;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public QName getCorrelationScheme() {
        return correlationScheme;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCorrelationScheme(QName newCorrelationScheme) {
        QName oldCorrelationScheme = correlationScheme;
        correlationScheme = newCorrelationScheme;
        boolean oldCorrelationSchemeESet = correlationSchemeESet;
        correlationSchemeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_BINDING__CORRELATION_SCHEME, oldCorrelationScheme, correlationScheme, !oldCorrelationSchemeESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetCorrelationScheme() {
        QName oldCorrelationScheme = correlationScheme;
        boolean oldCorrelationSchemeESet = correlationSchemeESet;
        correlationScheme = CORRELATION_SCHEME_EDEFAULT;
        correlationSchemeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.JMS_BINDING__CORRELATION_SCHEME, oldCorrelationScheme, CORRELATION_SCHEME_EDEFAULT, oldCorrelationSchemeESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetCorrelationScheme() {
        return correlationSchemeESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getInitialContextFactory() {
        return initialContextFactory;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setInitialContextFactory(String newInitialContextFactory) {
        String oldInitialContextFactory = initialContextFactory;
        initialContextFactory = newInitialContextFactory;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_BINDING__INITIAL_CONTEXT_FACTORY, oldInitialContextFactory, initialContextFactory));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getJndiURL() {
        return jndiURL;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setJndiURL(String newJndiURL) {
        String oldJndiURL = jndiURL;
        jndiURL = newJndiURL;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_BINDING__JNDI_URL, oldJndiURL, jndiURL));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public QName getOperationProperties1() {
        return operationProperties1;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOperationProperties1(QName newOperationProperties1) {
        QName oldOperationProperties1 = operationProperties1;
        operationProperties1 = newOperationProperties1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_BINDING__OPERATION_PROPERTIES1, oldOperationProperties1, operationProperties1));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public QName getRequestConnection() {
        return requestConnection;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRequestConnection(QName newRequestConnection) {
        QName oldRequestConnection = requestConnection;
        requestConnection = newRequestConnection;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_BINDING__REQUEST_CONNECTION, oldRequestConnection, requestConnection));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public QName getResponseConnection() {
        return responseConnection;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setResponseConnection(QName newResponseConnection) {
        QName oldResponseConnection = responseConnection;
        responseConnection = newResponseConnection;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_BINDING__RESPONSE_CONNECTION, oldResponseConnection, responseConnection));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScaPackage.JMS_BINDING__DESTINATION:
                return basicSetDestination(null, msgs);
            case ScaPackage.JMS_BINDING__CONNECTION_FACTORY:
                return basicSetConnectionFactory(null, msgs);
            case ScaPackage.JMS_BINDING__ACTIVATION_SPEC:
                return basicSetActivationSpec(null, msgs);
            case ScaPackage.JMS_BINDING__RESPONSE:
                return basicSetResponse(null, msgs);
            case ScaPackage.JMS_BINDING__HEADERS:
                return basicSetHeaders(null, msgs);
            case ScaPackage.JMS_BINDING__MESSAGE_SELECTION:
                return basicSetMessageSelection(null, msgs);
            case ScaPackage.JMS_BINDING__RESOURCE_ADAPTER:
                return basicSetResourceAdapter(null, msgs);
            case ScaPackage.JMS_BINDING__OPERATION_PROPERTIES:
                return ((InternalEList<?>)getOperationProperties()).basicRemove(otherEnd, msgs);
            case ScaPackage.JMS_BINDING__ANY:
                return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
            case ScaPackage.JMS_BINDING__DESTINATION:
                return getDestination();
            case ScaPackage.JMS_BINDING__CONNECTION_FACTORY:
                return getConnectionFactory();
            case ScaPackage.JMS_BINDING__ACTIVATION_SPEC:
                return getActivationSpec();
            case ScaPackage.JMS_BINDING__RESPONSE:
                return getResponse();
            case ScaPackage.JMS_BINDING__HEADERS:
                return getHeaders();
            case ScaPackage.JMS_BINDING__MESSAGE_SELECTION:
                return getMessageSelection();
            case ScaPackage.JMS_BINDING__RESOURCE_ADAPTER:
                return getResourceAdapter();
            case ScaPackage.JMS_BINDING__OPERATION_PROPERTIES:
                return getOperationProperties();
            case ScaPackage.JMS_BINDING__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case ScaPackage.JMS_BINDING__CORRELATION_SCHEME:
                return getCorrelationScheme();
            case ScaPackage.JMS_BINDING__INITIAL_CONTEXT_FACTORY:
                return getInitialContextFactory();
            case ScaPackage.JMS_BINDING__JNDI_URL:
                return getJndiURL();
            case ScaPackage.JMS_BINDING__OPERATION_PROPERTIES1:
                return getOperationProperties1();
            case ScaPackage.JMS_BINDING__REQUEST_CONNECTION:
                return getRequestConnection();
            case ScaPackage.JMS_BINDING__RESPONSE_CONNECTION:
                return getResponseConnection();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ScaPackage.JMS_BINDING__DESTINATION:
                setDestination((JMSDestination)newValue);
                return;
            case ScaPackage.JMS_BINDING__CONNECTION_FACTORY:
                setConnectionFactory((JMSConnectionFactory)newValue);
                return;
            case ScaPackage.JMS_BINDING__ACTIVATION_SPEC:
                setActivationSpec((JMSActivationSpec)newValue);
                return;
            case ScaPackage.JMS_BINDING__RESPONSE:
                setResponse((JMSResponse)newValue);
                return;
            case ScaPackage.JMS_BINDING__HEADERS:
                setHeaders((JMSHeaders)newValue);
                return;
            case ScaPackage.JMS_BINDING__MESSAGE_SELECTION:
                setMessageSelection((JMSMessageSelection)newValue);
                return;
            case ScaPackage.JMS_BINDING__RESOURCE_ADAPTER:
                setResourceAdapter((JMSResourceAdapter)newValue);
                return;
            case ScaPackage.JMS_BINDING__OPERATION_PROPERTIES:
                getOperationProperties().clear();
                getOperationProperties().addAll((Collection<? extends JMSOperationProperties>)newValue);
                return;
            case ScaPackage.JMS_BINDING__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case ScaPackage.JMS_BINDING__CORRELATION_SCHEME:
                setCorrelationScheme((QName)newValue);
                return;
            case ScaPackage.JMS_BINDING__INITIAL_CONTEXT_FACTORY:
                setInitialContextFactory((String)newValue);
                return;
            case ScaPackage.JMS_BINDING__JNDI_URL:
                setJndiURL((String)newValue);
                return;
            case ScaPackage.JMS_BINDING__OPERATION_PROPERTIES1:
                setOperationProperties1((QName)newValue);
                return;
            case ScaPackage.JMS_BINDING__REQUEST_CONNECTION:
                setRequestConnection((QName)newValue);
                return;
            case ScaPackage.JMS_BINDING__RESPONSE_CONNECTION:
                setResponseConnection((QName)newValue);
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
            case ScaPackage.JMS_BINDING__DESTINATION:
                setDestination((JMSDestination)null);
                return;
            case ScaPackage.JMS_BINDING__CONNECTION_FACTORY:
                setConnectionFactory((JMSConnectionFactory)null);
                return;
            case ScaPackage.JMS_BINDING__ACTIVATION_SPEC:
                setActivationSpec((JMSActivationSpec)null);
                return;
            case ScaPackage.JMS_BINDING__RESPONSE:
                setResponse((JMSResponse)null);
                return;
            case ScaPackage.JMS_BINDING__HEADERS:
                setHeaders((JMSHeaders)null);
                return;
            case ScaPackage.JMS_BINDING__MESSAGE_SELECTION:
                setMessageSelection((JMSMessageSelection)null);
                return;
            case ScaPackage.JMS_BINDING__RESOURCE_ADAPTER:
                setResourceAdapter((JMSResourceAdapter)null);
                return;
            case ScaPackage.JMS_BINDING__OPERATION_PROPERTIES:
                getOperationProperties().clear();
                return;
            case ScaPackage.JMS_BINDING__ANY:
                getAny().clear();
                return;
            case ScaPackage.JMS_BINDING__CORRELATION_SCHEME:
                unsetCorrelationScheme();
                return;
            case ScaPackage.JMS_BINDING__INITIAL_CONTEXT_FACTORY:
                setInitialContextFactory(INITIAL_CONTEXT_FACTORY_EDEFAULT);
                return;
            case ScaPackage.JMS_BINDING__JNDI_URL:
                setJndiURL(JNDI_URL_EDEFAULT);
                return;
            case ScaPackage.JMS_BINDING__OPERATION_PROPERTIES1:
                setOperationProperties1(OPERATION_PROPERTIES1_EDEFAULT);
                return;
            case ScaPackage.JMS_BINDING__REQUEST_CONNECTION:
                setRequestConnection(REQUEST_CONNECTION_EDEFAULT);
                return;
            case ScaPackage.JMS_BINDING__RESPONSE_CONNECTION:
                setResponseConnection(RESPONSE_CONNECTION_EDEFAULT);
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
            case ScaPackage.JMS_BINDING__DESTINATION:
                return destination != null;
            case ScaPackage.JMS_BINDING__CONNECTION_FACTORY:
                return connectionFactory != null;
            case ScaPackage.JMS_BINDING__ACTIVATION_SPEC:
                return activationSpec != null;
            case ScaPackage.JMS_BINDING__RESPONSE:
                return response != null;
            case ScaPackage.JMS_BINDING__HEADERS:
                return headers != null;
            case ScaPackage.JMS_BINDING__MESSAGE_SELECTION:
                return messageSelection != null;
            case ScaPackage.JMS_BINDING__RESOURCE_ADAPTER:
                return resourceAdapter != null;
            case ScaPackage.JMS_BINDING__OPERATION_PROPERTIES:
                return operationProperties != null && !operationProperties.isEmpty();
            case ScaPackage.JMS_BINDING__ANY:
                return any != null && !any.isEmpty();
            case ScaPackage.JMS_BINDING__CORRELATION_SCHEME:
                return isSetCorrelationScheme();
            case ScaPackage.JMS_BINDING__INITIAL_CONTEXT_FACTORY:
                return INITIAL_CONTEXT_FACTORY_EDEFAULT == null ? initialContextFactory != null : !INITIAL_CONTEXT_FACTORY_EDEFAULT.equals(initialContextFactory);
            case ScaPackage.JMS_BINDING__JNDI_URL:
                return JNDI_URL_EDEFAULT == null ? jndiURL != null : !JNDI_URL_EDEFAULT.equals(jndiURL);
            case ScaPackage.JMS_BINDING__OPERATION_PROPERTIES1:
                return OPERATION_PROPERTIES1_EDEFAULT == null ? operationProperties1 != null : !OPERATION_PROPERTIES1_EDEFAULT.equals(operationProperties1);
            case ScaPackage.JMS_BINDING__REQUEST_CONNECTION:
                return REQUEST_CONNECTION_EDEFAULT == null ? requestConnection != null : !REQUEST_CONNECTION_EDEFAULT.equals(requestConnection);
            case ScaPackage.JMS_BINDING__RESPONSE_CONNECTION:
                return RESPONSE_CONNECTION_EDEFAULT == null ? responseConnection != null : !RESPONSE_CONNECTION_EDEFAULT.equals(responseConnection);
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
        result.append(" (any: ");
        result.append(any);
        result.append(", correlationScheme: ");
        if (correlationSchemeESet) result.append(correlationScheme); else result.append("<unset>");
        result.append(", initialContextFactory: ");
        result.append(initialContextFactory);
        result.append(", jndiURL: ");
        result.append(jndiURL);
        result.append(", operationProperties1: ");
        result.append(operationProperties1);
        result.append(", requestConnection: ");
        result.append(requestConnection);
        result.append(", responseConnection: ");
        result.append(responseConnection);
        result.append(')');
        return result.toString();
    }

    @Override
    public EStructuralFeature getDocumentFeature() {
        return ScaPackage.eINSTANCE.getDocumentRoot_BindingJms();
    }

} //JMSBindingImpl
