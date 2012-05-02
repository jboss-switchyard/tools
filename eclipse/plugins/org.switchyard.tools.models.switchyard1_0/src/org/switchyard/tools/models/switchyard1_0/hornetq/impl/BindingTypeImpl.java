/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.hornetq.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;


import org.switchyard.tools.models.switchyard1_0.hornetq.BindingType;
import org.switchyard.tools.models.switchyard1_0.hornetq.ConfigType;
import org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage;
import org.switchyard.tools.models.switchyard1_0.hornetq.OperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardBindingTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.BindingTypeImpl#getHqOperationSelector <em>Hq Operation Selector</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.BindingTypeImpl#getConfig <em>Config</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingTypeImpl extends SwitchYardBindingTypeImpl implements BindingType {
	/**
	 * The cached value of the '{@link #getHqOperationSelector() <em>Hq Operation Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHqOperationSelector()
	 * @generated
	 * @ordered
	 */
	protected OperationSelectorType hqOperationSelector;

	/**
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected ConfigType config;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HornetQPackage.Literals.BINDING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSelectorType getHqOperationSelector() {
		return hqOperationSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHqOperationSelector(OperationSelectorType newHqOperationSelector, NotificationChain msgs) {
		OperationSelectorType oldHqOperationSelector = hqOperationSelector;
		hqOperationSelector = newHqOperationSelector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HornetQPackage.BINDING_TYPE__HQ_OPERATION_SELECTOR, oldHqOperationSelector, newHqOperationSelector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHqOperationSelector(OperationSelectorType newHqOperationSelector) {
		if (newHqOperationSelector != hqOperationSelector) {
			NotificationChain msgs = null;
			if (hqOperationSelector != null)
				msgs = ((InternalEObject)hqOperationSelector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HornetQPackage.BINDING_TYPE__HQ_OPERATION_SELECTOR, null, msgs);
			if (newHqOperationSelector != null)
				msgs = ((InternalEObject)newHqOperationSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HornetQPackage.BINDING_TYPE__HQ_OPERATION_SELECTOR, null, msgs);
			msgs = basicSetHqOperationSelector(newHqOperationSelector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.BINDING_TYPE__HQ_OPERATION_SELECTOR, newHqOperationSelector, newHqOperationSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigType getConfig() {
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfig(ConfigType newConfig, NotificationChain msgs) {
		ConfigType oldConfig = config;
		config = newConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HornetQPackage.BINDING_TYPE__CONFIG, oldConfig, newConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfig(ConfigType newConfig) {
		if (newConfig != config) {
			NotificationChain msgs = null;
			if (config != null)
				msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HornetQPackage.BINDING_TYPE__CONFIG, null, msgs);
			if (newConfig != null)
				msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HornetQPackage.BINDING_TYPE__CONFIG, null, msgs);
			msgs = basicSetConfig(newConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.BINDING_TYPE__CONFIG, newConfig, newConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HornetQPackage.BINDING_TYPE__HQ_OPERATION_SELECTOR:
				return basicSetHqOperationSelector(null, msgs);
			case HornetQPackage.BINDING_TYPE__CONFIG:
				return basicSetConfig(null, msgs);
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
			case HornetQPackage.BINDING_TYPE__HQ_OPERATION_SELECTOR:
				return getHqOperationSelector();
			case HornetQPackage.BINDING_TYPE__CONFIG:
				return getConfig();
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
			case HornetQPackage.BINDING_TYPE__HQ_OPERATION_SELECTOR:
				setHqOperationSelector((OperationSelectorType)newValue);
				return;
			case HornetQPackage.BINDING_TYPE__CONFIG:
				setConfig((ConfigType)newValue);
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
			case HornetQPackage.BINDING_TYPE__HQ_OPERATION_SELECTOR:
				setHqOperationSelector((OperationSelectorType)null);
				return;
			case HornetQPackage.BINDING_TYPE__CONFIG:
				setConfig((ConfigType)null);
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
			case HornetQPackage.BINDING_TYPE__HQ_OPERATION_SELECTOR:
				return hqOperationSelector != null;
			case HornetQPackage.BINDING_TYPE__CONFIG:
				return config != null;
		}
		return super.eIsSet(featureID);
	}

} //BindingTypeImpl
