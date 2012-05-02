/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.spring.AbstractKeyManagersParametersFactoryBean;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Key Managers Parameters Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractKeyManagersParametersFactoryBeanImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractKeyManagersParametersFactoryBeanImpl#getKeyPassword <em>Key Password</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractKeyManagersParametersFactoryBeanImpl#getProvider <em>Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractKeyManagersParametersFactoryBeanImpl extends AbstractJsseUtilFactoryBeanImpl implements AbstractKeyManagersParametersFactoryBean {
	/**
	 * The default value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String algorithm = ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyPassword() <em>Key Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyPassword() <em>Key Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyPassword()
	 * @generated
	 * @ordered
	 */
	protected String keyPassword = KEY_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected String provider = PROVIDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractKeyManagersParametersFactoryBeanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.eINSTANCE.getAbstractKeyManagersParametersFactoryBean();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithm(String newAlgorithm) {
		String oldAlgorithm = algorithm;
		algorithm = newAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_KEY_MANAGERS_PARAMETERS_FACTORY_BEAN__ALGORITHM, oldAlgorithm, algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyPassword() {
		return keyPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyPassword(String newKeyPassword) {
		String oldKeyPassword = keyPassword;
		keyPassword = newKeyPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_KEY_MANAGERS_PARAMETERS_FACTORY_BEAN__KEY_PASSWORD, oldKeyPassword, keyPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(String newProvider) {
		String oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_KEY_MANAGERS_PARAMETERS_FACTORY_BEAN__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpringPackage.ABSTRACT_KEY_MANAGERS_PARAMETERS_FACTORY_BEAN__ALGORITHM:
				return getAlgorithm();
			case SpringPackage.ABSTRACT_KEY_MANAGERS_PARAMETERS_FACTORY_BEAN__KEY_PASSWORD:
				return getKeyPassword();
			case SpringPackage.ABSTRACT_KEY_MANAGERS_PARAMETERS_FACTORY_BEAN__PROVIDER:
				return getProvider();
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
			case SpringPackage.ABSTRACT_KEY_MANAGERS_PARAMETERS_FACTORY_BEAN__ALGORITHM:
				setAlgorithm((String)newValue);
				return;
			case SpringPackage.ABSTRACT_KEY_MANAGERS_PARAMETERS_FACTORY_BEAN__KEY_PASSWORD:
				setKeyPassword((String)newValue);
				return;
			case SpringPackage.ABSTRACT_KEY_MANAGERS_PARAMETERS_FACTORY_BEAN__PROVIDER:
				setProvider((String)newValue);
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
			case SpringPackage.ABSTRACT_KEY_MANAGERS_PARAMETERS_FACTORY_BEAN__ALGORITHM:
				setAlgorithm(ALGORITHM_EDEFAULT);
				return;
			case SpringPackage.ABSTRACT_KEY_MANAGERS_PARAMETERS_FACTORY_BEAN__KEY_PASSWORD:
				setKeyPassword(KEY_PASSWORD_EDEFAULT);
				return;
			case SpringPackage.ABSTRACT_KEY_MANAGERS_PARAMETERS_FACTORY_BEAN__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
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
			case SpringPackage.ABSTRACT_KEY_MANAGERS_PARAMETERS_FACTORY_BEAN__ALGORITHM:
				return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
			case SpringPackage.ABSTRACT_KEY_MANAGERS_PARAMETERS_FACTORY_BEAN__KEY_PASSWORD:
				return KEY_PASSWORD_EDEFAULT == null ? keyPassword != null : !KEY_PASSWORD_EDEFAULT.equals(keyPassword);
			case SpringPackage.ABSTRACT_KEY_MANAGERS_PARAMETERS_FACTORY_BEAN__PROVIDER:
				return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
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
		result.append(" (algorithm: ");
		result.append(algorithm);
		result.append(", keyPassword: ");
		result.append(keyPassword);
		result.append(", provider: ");
		result.append(provider);
		result.append(')');
		return result.toString();
	}

} //AbstractKeyManagersParametersFactoryBeanImpl
