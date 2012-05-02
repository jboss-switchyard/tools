/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.JMSActivationSpec;
import org.eclipse.soa.sca.sca1_1.model.sca.JMSConnectionFactory;
import org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination;
import org.eclipse.soa.sca.sca1_1.model.sca.JMSResponse;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.WireFormatType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JMS Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSResponseImpl#getWireFormat <em>Wire Format</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSResponseImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSResponseImpl#getConnectionFactory <em>Connection Factory</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSResponseImpl#getActivationSpec <em>Activation Spec</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSResponseImpl#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JMSResponseImpl extends EObjectImpl implements JMSResponse {
	/**
	 * The cached value of the '{@link #getWireFormat() <em>Wire Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWireFormat()
	 * @generated
	 * @ordered
	 */
	protected WireFormatType wireFormat;

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
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JMSResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScaPackage.eINSTANCE.getJMSResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireFormatType getWireFormat() {
		return wireFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWireFormat(WireFormatType newWireFormat, NotificationChain msgs) {
		WireFormatType oldWireFormat = wireFormat;
		wireFormat = newWireFormat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_RESPONSE__WIRE_FORMAT, oldWireFormat, newWireFormat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWireFormat(WireFormatType newWireFormat) {
		if (newWireFormat != wireFormat) {
			NotificationChain msgs = null;
			if (wireFormat != null)
				msgs = ((InternalEObject)wireFormat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JMS_RESPONSE__WIRE_FORMAT, null, msgs);
			if (newWireFormat != null)
				msgs = ((InternalEObject)newWireFormat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JMS_RESPONSE__WIRE_FORMAT, null, msgs);
			msgs = basicSetWireFormat(newWireFormat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_RESPONSE__WIRE_FORMAT, newWireFormat, newWireFormat));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_RESPONSE__DESTINATION, oldDestination, newDestination);
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
				msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JMS_RESPONSE__DESTINATION, null, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JMS_RESPONSE__DESTINATION, null, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_RESPONSE__DESTINATION, newDestination, newDestination));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_RESPONSE__CONNECTION_FACTORY, oldConnectionFactory, newConnectionFactory);
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
				msgs = ((InternalEObject)connectionFactory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JMS_RESPONSE__CONNECTION_FACTORY, null, msgs);
			if (newConnectionFactory != null)
				msgs = ((InternalEObject)newConnectionFactory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JMS_RESPONSE__CONNECTION_FACTORY, null, msgs);
			msgs = basicSetConnectionFactory(newConnectionFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_RESPONSE__CONNECTION_FACTORY, newConnectionFactory, newConnectionFactory));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_RESPONSE__ACTIVATION_SPEC, oldActivationSpec, newActivationSpec);
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
				msgs = ((InternalEObject)activationSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JMS_RESPONSE__ACTIVATION_SPEC, null, msgs);
			if (newActivationSpec != null)
				msgs = ((InternalEObject)newActivationSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScaPackage.JMS_RESPONSE__ACTIVATION_SPEC, null, msgs);
			msgs = basicSetActivationSpec(newActivationSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_RESPONSE__ACTIVATION_SPEC, newActivationSpec, newActivationSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, ScaPackage.JMS_RESPONSE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScaPackage.JMS_RESPONSE__WIRE_FORMAT:
				return basicSetWireFormat(null, msgs);
			case ScaPackage.JMS_RESPONSE__DESTINATION:
				return basicSetDestination(null, msgs);
			case ScaPackage.JMS_RESPONSE__CONNECTION_FACTORY:
				return basicSetConnectionFactory(null, msgs);
			case ScaPackage.JMS_RESPONSE__ACTIVATION_SPEC:
				return basicSetActivationSpec(null, msgs);
			case ScaPackage.JMS_RESPONSE__ANY:
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
			case ScaPackage.JMS_RESPONSE__WIRE_FORMAT:
				return getWireFormat();
			case ScaPackage.JMS_RESPONSE__DESTINATION:
				return getDestination();
			case ScaPackage.JMS_RESPONSE__CONNECTION_FACTORY:
				return getConnectionFactory();
			case ScaPackage.JMS_RESPONSE__ACTIVATION_SPEC:
				return getActivationSpec();
			case ScaPackage.JMS_RESPONSE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
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
			case ScaPackage.JMS_RESPONSE__WIRE_FORMAT:
				setWireFormat((WireFormatType)newValue);
				return;
			case ScaPackage.JMS_RESPONSE__DESTINATION:
				setDestination((JMSDestination)newValue);
				return;
			case ScaPackage.JMS_RESPONSE__CONNECTION_FACTORY:
				setConnectionFactory((JMSConnectionFactory)newValue);
				return;
			case ScaPackage.JMS_RESPONSE__ACTIVATION_SPEC:
				setActivationSpec((JMSActivationSpec)newValue);
				return;
			case ScaPackage.JMS_RESPONSE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
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
			case ScaPackage.JMS_RESPONSE__WIRE_FORMAT:
				setWireFormat((WireFormatType)null);
				return;
			case ScaPackage.JMS_RESPONSE__DESTINATION:
				setDestination((JMSDestination)null);
				return;
			case ScaPackage.JMS_RESPONSE__CONNECTION_FACTORY:
				setConnectionFactory((JMSConnectionFactory)null);
				return;
			case ScaPackage.JMS_RESPONSE__ACTIVATION_SPEC:
				setActivationSpec((JMSActivationSpec)null);
				return;
			case ScaPackage.JMS_RESPONSE__ANY:
				getAny().clear();
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
			case ScaPackage.JMS_RESPONSE__WIRE_FORMAT:
				return wireFormat != null;
			case ScaPackage.JMS_RESPONSE__DESTINATION:
				return destination != null;
			case ScaPackage.JMS_RESPONSE__CONNECTION_FACTORY:
				return connectionFactory != null;
			case ScaPackage.JMS_RESPONSE__ACTIVATION_SPEC:
				return activationSpec != null;
			case ScaPackage.JMS_RESPONSE__ANY:
				return any != null && !any.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //JMSResponseImpl
