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

import org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelEndpointFactoryBean;
import org.switchyard.tools.models.switchyard1_0.spring.ExchangePattern;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Camel Endpoint Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractCamelEndpointFactoryBeanImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractCamelEndpointFactoryBeanImpl#isSingleton <em>Singleton</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractCamelEndpointFactoryBeanImpl#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractCamelEndpointFactoryBeanImpl extends AbstractCamelFactoryBeanImpl implements AbstractCamelEndpointFactoryBean {
	/**
     * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPattern()
     * @generated
     * @ordered
     */
	protected static final ExchangePattern PATTERN_EDEFAULT = ExchangePattern.IN_ONLY;

	/**
     * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPattern()
     * @generated
     * @ordered
     */
	protected ExchangePattern pattern = PATTERN_EDEFAULT;

	/**
     * This is true if the Pattern attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean patternESet;

	/**
     * The default value of the '{@link #isSingleton() <em>Singleton</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSingleton()
     * @generated
     * @ordered
     */
	protected static final boolean SINGLETON_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isSingleton() <em>Singleton</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSingleton()
     * @generated
     * @ordered
     */
	protected boolean singleton = SINGLETON_EDEFAULT;

	/**
     * This is true if the Singleton attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean singletonESet;

	/**
     * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUri()
     * @generated
     * @ordered
     */
	protected static final String URI_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUri()
     * @generated
     * @ordered
     */
	protected String uri = URI_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected AbstractCamelEndpointFactoryBeanImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getAbstractCamelEndpointFactoryBean();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ExchangePattern getPattern() {
        return pattern;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPattern(ExchangePattern newPattern) {
        ExchangePattern oldPattern = pattern;
        pattern = newPattern == null ? PATTERN_EDEFAULT : newPattern;
        boolean oldPatternESet = patternESet;
        patternESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_CAMEL_ENDPOINT_FACTORY_BEAN__PATTERN, oldPattern, pattern, !oldPatternESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetPattern() {
        ExchangePattern oldPattern = pattern;
        boolean oldPatternESet = patternESet;
        pattern = PATTERN_EDEFAULT;
        patternESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.ABSTRACT_CAMEL_ENDPOINT_FACTORY_BEAN__PATTERN, oldPattern, PATTERN_EDEFAULT, oldPatternESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetPattern() {
        return patternESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSingleton() {
        return singleton;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSingleton(boolean newSingleton) {
        boolean oldSingleton = singleton;
        singleton = newSingleton;
        boolean oldSingletonESet = singletonESet;
        singletonESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_CAMEL_ENDPOINT_FACTORY_BEAN__SINGLETON, oldSingleton, singleton, !oldSingletonESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetSingleton() {
        boolean oldSingleton = singleton;
        boolean oldSingletonESet = singletonESet;
        singleton = SINGLETON_EDEFAULT;
        singletonESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.ABSTRACT_CAMEL_ENDPOINT_FACTORY_BEAN__SINGLETON, oldSingleton, SINGLETON_EDEFAULT, oldSingletonESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetSingleton() {
        return singletonESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getUri() {
        return uri;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setUri(String newUri) {
        String oldUri = uri;
        uri = newUri;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_CAMEL_ENDPOINT_FACTORY_BEAN__URI, oldUri, uri));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.ABSTRACT_CAMEL_ENDPOINT_FACTORY_BEAN__PATTERN:
                return getPattern();
            case SpringPackage.ABSTRACT_CAMEL_ENDPOINT_FACTORY_BEAN__SINGLETON:
                return isSingleton();
            case SpringPackage.ABSTRACT_CAMEL_ENDPOINT_FACTORY_BEAN__URI:
                return getUri();
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
            case SpringPackage.ABSTRACT_CAMEL_ENDPOINT_FACTORY_BEAN__PATTERN:
                setPattern((ExchangePattern)newValue);
                return;
            case SpringPackage.ABSTRACT_CAMEL_ENDPOINT_FACTORY_BEAN__SINGLETON:
                setSingleton((Boolean)newValue);
                return;
            case SpringPackage.ABSTRACT_CAMEL_ENDPOINT_FACTORY_BEAN__URI:
                setUri((String)newValue);
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
            case SpringPackage.ABSTRACT_CAMEL_ENDPOINT_FACTORY_BEAN__PATTERN:
                unsetPattern();
                return;
            case SpringPackage.ABSTRACT_CAMEL_ENDPOINT_FACTORY_BEAN__SINGLETON:
                unsetSingleton();
                return;
            case SpringPackage.ABSTRACT_CAMEL_ENDPOINT_FACTORY_BEAN__URI:
                setUri(URI_EDEFAULT);
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
            case SpringPackage.ABSTRACT_CAMEL_ENDPOINT_FACTORY_BEAN__PATTERN:
                return isSetPattern();
            case SpringPackage.ABSTRACT_CAMEL_ENDPOINT_FACTORY_BEAN__SINGLETON:
                return isSetSingleton();
            case SpringPackage.ABSTRACT_CAMEL_ENDPOINT_FACTORY_BEAN__URI:
                return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
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
        result.append(" (pattern: ");
        if (patternESet) result.append(pattern); else result.append("<unset>");
        result.append(", singleton: ");
        if (singletonESet) result.append(singleton); else result.append("<unset>");
        result.append(", uri: ");
        result.append(uri);
        result.append(')');
        return result.toString();
    }

} //AbstractCamelEndpointFactoryBeanImpl
