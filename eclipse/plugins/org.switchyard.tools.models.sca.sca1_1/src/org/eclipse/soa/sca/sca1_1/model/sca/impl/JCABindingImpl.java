/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.impl;

import java.util.Collection;

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

import org.eclipse.soa.sca.sca1_1.model.sca.JCABinding;
import org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundConnection;
import org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundInteraction;
import org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundConnection;
import org.eclipse.soa.sca.sca1_1.model.sca.JCAOutboundInteraction;
import org.eclipse.soa.sca.sca1_1.model.sca.Property;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JCA Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JCABindingImpl#getOutboundConnection <em>Outbound Connection</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JCABindingImpl#getInboundConnection <em>Inbound Connection</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JCABindingImpl#getOutboundInteraction <em>Outbound Interaction</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JCABindingImpl#getInboundInteraction <em>Inbound Interaction</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JCABindingImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JCABindingImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JCABindingImpl#getConnectionInfo <em>Connection Info</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JCABindingImpl#getInitialContextFactory <em>Initial Context Factory</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JCABindingImpl#getJndiURL <em>Jndi URL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JCABindingImpl extends BindingImpl implements JCABinding {
	/**
     * The cached value of the '{@link #getOutboundConnection() <em>Outbound Connection</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOutboundConnection()
     * @generated
     * @ordered
     */
	protected JCAOutboundConnection outboundConnection;

	/**
     * The cached value of the '{@link #getInboundConnection() <em>Inbound Connection</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInboundConnection()
     * @generated
     * @ordered
     */
	protected JCAInboundConnection inboundConnection;

	/**
     * The cached value of the '{@link #getOutboundInteraction() <em>Outbound Interaction</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOutboundInteraction()
     * @generated
     * @ordered
     */
	protected JCAOutboundInteraction outboundInteraction;

	/**
     * The cached value of the '{@link #getInboundInteraction() <em>Inbound Interaction</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInboundInteraction()
     * @generated
     * @ordered
     */
	protected JCAInboundInteraction inboundInteraction;

	/**
     * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getProperty()
     * @generated
     * @ordered
     */
	protected EList<Property> property;

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
     * The default value of the '{@link #getConnectionInfo() <em>Connection Info</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getConnectionInfo()
     * @generated
     * @ordered
     */
	protected static final String CONNECTION_INFO_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getConnectionInfo() <em>Connection Info</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getConnectionInfo()
     * @generated
     * @ordered
     */
	protected String connectionInfo = CONNECTION_INFO_EDEFAULT;

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
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected JCABindingImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getJCABinding();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JCAOutboundConnection getOutboundConnection() {
        return outboundConnection;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetOutboundConnection(JCAOutboundConnection newOutboundConnection, NotificationChain msgs) {
        JCAOutboundConnection oldOutboundConnection = outboundConnection;
        outboundConnection = newOutboundConnection;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScaPackage.JCA_BINDING__OUTBOUND_CONNECTION, oldOutboundConnection, newOutboundConnection);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOutboundConnection(JCAOutboundConnection newOutboundConnection) {
        if (newOutboundConnection != outboundConnection) {
            NotificationChain msgs = null;
            if (outboundConnection != null)
                msgs = ((InternalEObject)outboundConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JCA_BINDING__OUTBOUND_CONNECTION, null, msgs);
            if (newOutboundConnection != null)
                msgs = ((InternalEObject)newOutboundConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JCA_BINDING__OUTBOUND_CONNECTION, null, msgs);
            msgs = basicSetOutboundConnection(newOutboundConnection, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JCA_BINDING__OUTBOUND_CONNECTION, newOutboundConnection, newOutboundConnection));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JCAInboundConnection getInboundConnection() {
        return inboundConnection;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetInboundConnection(JCAInboundConnection newInboundConnection, NotificationChain msgs) {
        JCAInboundConnection oldInboundConnection = inboundConnection;
        inboundConnection = newInboundConnection;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScaPackage.JCA_BINDING__INBOUND_CONNECTION, oldInboundConnection, newInboundConnection);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setInboundConnection(JCAInboundConnection newInboundConnection) {
        if (newInboundConnection != inboundConnection) {
            NotificationChain msgs = null;
            if (inboundConnection != null)
                msgs = ((InternalEObject)inboundConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JCA_BINDING__INBOUND_CONNECTION, null, msgs);
            if (newInboundConnection != null)
                msgs = ((InternalEObject)newInboundConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JCA_BINDING__INBOUND_CONNECTION, null, msgs);
            msgs = basicSetInboundConnection(newInboundConnection, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JCA_BINDING__INBOUND_CONNECTION, newInboundConnection, newInboundConnection));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JCAOutboundInteraction getOutboundInteraction() {
        return outboundInteraction;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetOutboundInteraction(JCAOutboundInteraction newOutboundInteraction, NotificationChain msgs) {
        JCAOutboundInteraction oldOutboundInteraction = outboundInteraction;
        outboundInteraction = newOutboundInteraction;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScaPackage.JCA_BINDING__OUTBOUND_INTERACTION, oldOutboundInteraction, newOutboundInteraction);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOutboundInteraction(JCAOutboundInteraction newOutboundInteraction) {
        if (newOutboundInteraction != outboundInteraction) {
            NotificationChain msgs = null;
            if (outboundInteraction != null)
                msgs = ((InternalEObject)outboundInteraction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JCA_BINDING__OUTBOUND_INTERACTION, null, msgs);
            if (newOutboundInteraction != null)
                msgs = ((InternalEObject)newOutboundInteraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JCA_BINDING__OUTBOUND_INTERACTION, null, msgs);
            msgs = basicSetOutboundInteraction(newOutboundInteraction, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JCA_BINDING__OUTBOUND_INTERACTION, newOutboundInteraction, newOutboundInteraction));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JCAInboundInteraction getInboundInteraction() {
        return inboundInteraction;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetInboundInteraction(JCAInboundInteraction newInboundInteraction, NotificationChain msgs) {
        JCAInboundInteraction oldInboundInteraction = inboundInteraction;
        inboundInteraction = newInboundInteraction;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScaPackage.JCA_BINDING__INBOUND_INTERACTION, oldInboundInteraction, newInboundInteraction);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setInboundInteraction(JCAInboundInteraction newInboundInteraction) {
        if (newInboundInteraction != inboundInteraction) {
            NotificationChain msgs = null;
            if (inboundInteraction != null)
                msgs = ((InternalEObject)inboundInteraction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JCA_BINDING__INBOUND_INTERACTION, null, msgs);
            if (newInboundInteraction != null)
                msgs = ((InternalEObject)newInboundInteraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JCA_BINDING__INBOUND_INTERACTION, null, msgs);
            msgs = basicSetInboundInteraction(newInboundInteraction, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JCA_BINDING__INBOUND_INTERACTION, newInboundInteraction, newInboundInteraction));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Property> getProperty() {
        if (property == null) {
            property = new EObjectContainmentEList<Property>(Property.class, this, ScaPackage.JCA_BINDING__PROPERTY);
        }
        return property;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAny() {
        if (any == null) {
            any = new BasicFeatureMap(this, ScaPackage.JCA_BINDING__ANY);
        }
        return any;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getConnectionInfo() {
        return connectionInfo;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setConnectionInfo(String newConnectionInfo) {
        String oldConnectionInfo = connectionInfo;
        connectionInfo = newConnectionInfo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JCA_BINDING__CONNECTION_INFO, oldConnectionInfo, connectionInfo));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JCA_BINDING__INITIAL_CONTEXT_FACTORY, oldInitialContextFactory, initialContextFactory));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JCA_BINDING__JNDI_URL, oldJndiURL, jndiURL));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScaPackage.JCA_BINDING__OUTBOUND_CONNECTION:
                return basicSetOutboundConnection(null, msgs);
            case ScaPackage.JCA_BINDING__INBOUND_CONNECTION:
                return basicSetInboundConnection(null, msgs);
            case ScaPackage.JCA_BINDING__OUTBOUND_INTERACTION:
                return basicSetOutboundInteraction(null, msgs);
            case ScaPackage.JCA_BINDING__INBOUND_INTERACTION:
                return basicSetInboundInteraction(null, msgs);
            case ScaPackage.JCA_BINDING__PROPERTY:
                return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
            case ScaPackage.JCA_BINDING__ANY:
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
            case ScaPackage.JCA_BINDING__OUTBOUND_CONNECTION:
                return getOutboundConnection();
            case ScaPackage.JCA_BINDING__INBOUND_CONNECTION:
                return getInboundConnection();
            case ScaPackage.JCA_BINDING__OUTBOUND_INTERACTION:
                return getOutboundInteraction();
            case ScaPackage.JCA_BINDING__INBOUND_INTERACTION:
                return getInboundInteraction();
            case ScaPackage.JCA_BINDING__PROPERTY:
                return getProperty();
            case ScaPackage.JCA_BINDING__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case ScaPackage.JCA_BINDING__CONNECTION_INFO:
                return getConnectionInfo();
            case ScaPackage.JCA_BINDING__INITIAL_CONTEXT_FACTORY:
                return getInitialContextFactory();
            case ScaPackage.JCA_BINDING__JNDI_URL:
                return getJndiURL();
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
            case ScaPackage.JCA_BINDING__OUTBOUND_CONNECTION:
                setOutboundConnection((JCAOutboundConnection)newValue);
                return;
            case ScaPackage.JCA_BINDING__INBOUND_CONNECTION:
                setInboundConnection((JCAInboundConnection)newValue);
                return;
            case ScaPackage.JCA_BINDING__OUTBOUND_INTERACTION:
                setOutboundInteraction((JCAOutboundInteraction)newValue);
                return;
            case ScaPackage.JCA_BINDING__INBOUND_INTERACTION:
                setInboundInteraction((JCAInboundInteraction)newValue);
                return;
            case ScaPackage.JCA_BINDING__PROPERTY:
                getProperty().clear();
                getProperty().addAll((Collection<? extends Property>)newValue);
                return;
            case ScaPackage.JCA_BINDING__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case ScaPackage.JCA_BINDING__CONNECTION_INFO:
                setConnectionInfo((String)newValue);
                return;
            case ScaPackage.JCA_BINDING__INITIAL_CONTEXT_FACTORY:
                setInitialContextFactory((String)newValue);
                return;
            case ScaPackage.JCA_BINDING__JNDI_URL:
                setJndiURL((String)newValue);
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
            case ScaPackage.JCA_BINDING__OUTBOUND_CONNECTION:
                setOutboundConnection((JCAOutboundConnection)null);
                return;
            case ScaPackage.JCA_BINDING__INBOUND_CONNECTION:
                setInboundConnection((JCAInboundConnection)null);
                return;
            case ScaPackage.JCA_BINDING__OUTBOUND_INTERACTION:
                setOutboundInteraction((JCAOutboundInteraction)null);
                return;
            case ScaPackage.JCA_BINDING__INBOUND_INTERACTION:
                setInboundInteraction((JCAInboundInteraction)null);
                return;
            case ScaPackage.JCA_BINDING__PROPERTY:
                getProperty().clear();
                return;
            case ScaPackage.JCA_BINDING__ANY:
                getAny().clear();
                return;
            case ScaPackage.JCA_BINDING__CONNECTION_INFO:
                setConnectionInfo(CONNECTION_INFO_EDEFAULT);
                return;
            case ScaPackage.JCA_BINDING__INITIAL_CONTEXT_FACTORY:
                setInitialContextFactory(INITIAL_CONTEXT_FACTORY_EDEFAULT);
                return;
            case ScaPackage.JCA_BINDING__JNDI_URL:
                setJndiURL(JNDI_URL_EDEFAULT);
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
            case ScaPackage.JCA_BINDING__OUTBOUND_CONNECTION:
                return outboundConnection != null;
            case ScaPackage.JCA_BINDING__INBOUND_CONNECTION:
                return inboundConnection != null;
            case ScaPackage.JCA_BINDING__OUTBOUND_INTERACTION:
                return outboundInteraction != null;
            case ScaPackage.JCA_BINDING__INBOUND_INTERACTION:
                return inboundInteraction != null;
            case ScaPackage.JCA_BINDING__PROPERTY:
                return property != null && !property.isEmpty();
            case ScaPackage.JCA_BINDING__ANY:
                return any != null && !any.isEmpty();
            case ScaPackage.JCA_BINDING__CONNECTION_INFO:
                return CONNECTION_INFO_EDEFAULT == null ? connectionInfo != null : !CONNECTION_INFO_EDEFAULT.equals(connectionInfo);
            case ScaPackage.JCA_BINDING__INITIAL_CONTEXT_FACTORY:
                return INITIAL_CONTEXT_FACTORY_EDEFAULT == null ? initialContextFactory != null : !INITIAL_CONTEXT_FACTORY_EDEFAULT.equals(initialContextFactory);
            case ScaPackage.JCA_BINDING__JNDI_URL:
                return JNDI_URL_EDEFAULT == null ? jndiURL != null : !JNDI_URL_EDEFAULT.equals(jndiURL);
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
        result.append(", connectionInfo: ");
        result.append(connectionInfo);
        result.append(", initialContextFactory: ");
        result.append(initialContextFactory);
        result.append(", jndiURL: ");
        result.append(jndiURL);
        result.append(')');
        return result.toString();
    }

    @Override
    public EStructuralFeature getDocumentFeature() {
        return ScaPackage.eINSTANCE.getDocumentRoot_BindingJca();
    }

} //JCABindingImpl
