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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.InboundOperation;
import org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundInteraction;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JCA Inbound Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JCAInboundInteractionImpl#getListener <em>Listener</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JCAInboundInteractionImpl#getInboundOperation <em>Inbound Operation</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JCAInboundInteractionImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JCAInboundInteractionImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JCAInboundInteractionImpl extends EObjectImpl implements JCAInboundInteraction {
	/**
	 * The default value of the '{@link #getListener() <em>Listener</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListener()
	 * @generated
	 * @ordered
	 */
	protected static final String LISTENER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListener() <em>Listener</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListener()
	 * @generated
	 * @ordered
	 */
	protected String listener = LISTENER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInboundOperation() <em>Inbound Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInboundOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<InboundOperation> inboundOperation;

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
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JCAInboundInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScaPackage.eINSTANCE.getJCAInboundInteraction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getListener() {
		return listener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListener(String newListener) {
		String oldListener = listener;
		listener = newListener;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JCA_INBOUND_INTERACTION__LISTENER, oldListener, listener));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InboundOperation> getInboundOperation() {
		if (inboundOperation == null) {
			inboundOperation = new EObjectContainmentEList<InboundOperation>(InboundOperation.class, this, ScaPackage.JCA_INBOUND_INTERACTION__INBOUND_OPERATION);
		}
		return inboundOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, ScaPackage.JCA_INBOUND_INTERACTION__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, ScaPackage.JCA_INBOUND_INTERACTION__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScaPackage.JCA_INBOUND_INTERACTION__INBOUND_OPERATION:
				return ((InternalEList<?>)getInboundOperation()).basicRemove(otherEnd, msgs);
			case ScaPackage.JCA_INBOUND_INTERACTION__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case ScaPackage.JCA_INBOUND_INTERACTION__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case ScaPackage.JCA_INBOUND_INTERACTION__LISTENER:
				return getListener();
			case ScaPackage.JCA_INBOUND_INTERACTION__INBOUND_OPERATION:
				return getInboundOperation();
			case ScaPackage.JCA_INBOUND_INTERACTION__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case ScaPackage.JCA_INBOUND_INTERACTION__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case ScaPackage.JCA_INBOUND_INTERACTION__LISTENER:
				setListener((String)newValue);
				return;
			case ScaPackage.JCA_INBOUND_INTERACTION__INBOUND_OPERATION:
				getInboundOperation().clear();
				getInboundOperation().addAll((Collection<? extends InboundOperation>)newValue);
				return;
			case ScaPackage.JCA_INBOUND_INTERACTION__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case ScaPackage.JCA_INBOUND_INTERACTION__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case ScaPackage.JCA_INBOUND_INTERACTION__LISTENER:
				setListener(LISTENER_EDEFAULT);
				return;
			case ScaPackage.JCA_INBOUND_INTERACTION__INBOUND_OPERATION:
				getInboundOperation().clear();
				return;
			case ScaPackage.JCA_INBOUND_INTERACTION__ANY:
				getAny().clear();
				return;
			case ScaPackage.JCA_INBOUND_INTERACTION__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case ScaPackage.JCA_INBOUND_INTERACTION__LISTENER:
				return LISTENER_EDEFAULT == null ? listener != null : !LISTENER_EDEFAULT.equals(listener);
			case ScaPackage.JCA_INBOUND_INTERACTION__INBOUND_OPERATION:
				return inboundOperation != null && !inboundOperation.isEmpty();
			case ScaPackage.JCA_INBOUND_INTERACTION__ANY:
				return any != null && !any.isEmpty();
			case ScaPackage.JCA_INBOUND_INTERACTION__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (listener: ");
		result.append(listener);
		result.append(", any: ");
		result.append(any);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //JCAInboundInteractionImpl
