/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.spring.KeyManagersParametersFactoryBean;
import org.switchyard.tools.models.switchyard1_0.spring.KeyStoreParametersFactoryBean;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Managers Parameters Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.KeyManagersParametersFactoryBeanImpl#getKeyStore <em>Key Store</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyManagersParametersFactoryBeanImpl extends AbstractKeyManagersParametersFactoryBeanImpl implements KeyManagersParametersFactoryBean {
	/**
     * The cached value of the '{@link #getKeyStore() <em>Key Store</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKeyStore()
     * @generated
     * @ordered
     */
	protected KeyStoreParametersFactoryBean keyStore;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected KeyManagersParametersFactoryBeanImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getKeyManagersParametersFactoryBean();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public KeyStoreParametersFactoryBean getKeyStore() {
        return keyStore;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetKeyStore(KeyStoreParametersFactoryBean newKeyStore, NotificationChain msgs) {
        KeyStoreParametersFactoryBean oldKeyStore = keyStore;
        keyStore = newKeyStore;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.KEY_MANAGERS_PARAMETERS_FACTORY_BEAN__KEY_STORE, oldKeyStore, newKeyStore);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setKeyStore(KeyStoreParametersFactoryBean newKeyStore) {
        if (newKeyStore != keyStore) {
            NotificationChain msgs = null;
            if (keyStore != null)
                msgs = ((InternalEObject)keyStore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.KEY_MANAGERS_PARAMETERS_FACTORY_BEAN__KEY_STORE, null, msgs);
            if (newKeyStore != null)
                msgs = ((InternalEObject)newKeyStore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.KEY_MANAGERS_PARAMETERS_FACTORY_BEAN__KEY_STORE, null, msgs);
            msgs = basicSetKeyStore(newKeyStore, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.KEY_MANAGERS_PARAMETERS_FACTORY_BEAN__KEY_STORE, newKeyStore, newKeyStore));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SpringPackage.KEY_MANAGERS_PARAMETERS_FACTORY_BEAN__KEY_STORE:
                return basicSetKeyStore(null, msgs);
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
            case SpringPackage.KEY_MANAGERS_PARAMETERS_FACTORY_BEAN__KEY_STORE:
                return getKeyStore();
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
            case SpringPackage.KEY_MANAGERS_PARAMETERS_FACTORY_BEAN__KEY_STORE:
                setKeyStore((KeyStoreParametersFactoryBean)newValue);
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
            case SpringPackage.KEY_MANAGERS_PARAMETERS_FACTORY_BEAN__KEY_STORE:
                setKeyStore((KeyStoreParametersFactoryBean)null);
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
            case SpringPackage.KEY_MANAGERS_PARAMETERS_FACTORY_BEAN__KEY_STORE:
                return keyStore != null;
        }
        return super.eIsSet(featureID);
    }

} //KeyManagersParametersFactoryBeanImpl
