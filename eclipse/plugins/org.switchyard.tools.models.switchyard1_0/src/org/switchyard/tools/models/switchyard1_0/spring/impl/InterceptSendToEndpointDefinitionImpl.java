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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.spring.InterceptSendToEndpointDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intercept Send To Endpoint Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.InterceptSendToEndpointDefinitionImpl#isSkipSendToOriginalEndpoint <em>Skip Send To Original Endpoint</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.InterceptSendToEndpointDefinitionImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.InterceptSendToEndpointDefinitionImpl#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterceptSendToEndpointDefinitionImpl extends OutputImpl implements InterceptSendToEndpointDefinition {
	/**
     * The default value of the '{@link #isSkipSendToOriginalEndpoint() <em>Skip Send To Original Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSkipSendToOriginalEndpoint()
     * @generated
     * @ordered
     */
	protected static final boolean SKIP_SEND_TO_ORIGINAL_ENDPOINT_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isSkipSendToOriginalEndpoint() <em>Skip Send To Original Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSkipSendToOriginalEndpoint()
     * @generated
     * @ordered
     */
	protected boolean skipSendToOriginalEndpoint = SKIP_SEND_TO_ORIGINAL_ENDPOINT_EDEFAULT;

	/**
     * This is true if the Skip Send To Original Endpoint attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean skipSendToOriginalEndpointESet;

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
     * The cached value of the '{@link #getAnyAttribute2() <em>Any Attribute2</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAnyAttribute2()
     * @generated
     * @ordered
     */
	protected FeatureMap anyAttribute2;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected InterceptSendToEndpointDefinitionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getInterceptSendToEndpointDefinition();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSkipSendToOriginalEndpoint() {
        return skipSendToOriginalEndpoint;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSkipSendToOriginalEndpoint(boolean newSkipSendToOriginalEndpoint) {
        boolean oldSkipSendToOriginalEndpoint = skipSendToOriginalEndpoint;
        skipSendToOriginalEndpoint = newSkipSendToOriginalEndpoint;
        boolean oldSkipSendToOriginalEndpointESet = skipSendToOriginalEndpointESet;
        skipSendToOriginalEndpointESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.INTERCEPT_SEND_TO_ENDPOINT_DEFINITION__SKIP_SEND_TO_ORIGINAL_ENDPOINT, oldSkipSendToOriginalEndpoint, skipSendToOriginalEndpoint, !oldSkipSendToOriginalEndpointESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetSkipSendToOriginalEndpoint() {
        boolean oldSkipSendToOriginalEndpoint = skipSendToOriginalEndpoint;
        boolean oldSkipSendToOriginalEndpointESet = skipSendToOriginalEndpointESet;
        skipSendToOriginalEndpoint = SKIP_SEND_TO_ORIGINAL_ENDPOINT_EDEFAULT;
        skipSendToOriginalEndpointESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.INTERCEPT_SEND_TO_ENDPOINT_DEFINITION__SKIP_SEND_TO_ORIGINAL_ENDPOINT, oldSkipSendToOriginalEndpoint, SKIP_SEND_TO_ORIGINAL_ENDPOINT_EDEFAULT, oldSkipSendToOriginalEndpointESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetSkipSendToOriginalEndpoint() {
        return skipSendToOriginalEndpointESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.INTERCEPT_SEND_TO_ENDPOINT_DEFINITION__URI, oldUri, uri));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute2() {
        if (anyAttribute2 == null) {
            anyAttribute2 = new BasicFeatureMap(this, SpringPackage.INTERCEPT_SEND_TO_ENDPOINT_DEFINITION__ANY_ATTRIBUTE2);
        }
        return anyAttribute2;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SpringPackage.INTERCEPT_SEND_TO_ENDPOINT_DEFINITION__ANY_ATTRIBUTE2:
                return ((InternalEList<?>)getAnyAttribute2()).basicRemove(otherEnd, msgs);
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
            case SpringPackage.INTERCEPT_SEND_TO_ENDPOINT_DEFINITION__SKIP_SEND_TO_ORIGINAL_ENDPOINT:
                return isSkipSendToOriginalEndpoint();
            case SpringPackage.INTERCEPT_SEND_TO_ENDPOINT_DEFINITION__URI:
                return getUri();
            case SpringPackage.INTERCEPT_SEND_TO_ENDPOINT_DEFINITION__ANY_ATTRIBUTE2:
                if (coreType) return getAnyAttribute2();
                return ((FeatureMap.Internal)getAnyAttribute2()).getWrapper();
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
            case SpringPackage.INTERCEPT_SEND_TO_ENDPOINT_DEFINITION__SKIP_SEND_TO_ORIGINAL_ENDPOINT:
                setSkipSendToOriginalEndpoint((Boolean)newValue);
                return;
            case SpringPackage.INTERCEPT_SEND_TO_ENDPOINT_DEFINITION__URI:
                setUri((String)newValue);
                return;
            case SpringPackage.INTERCEPT_SEND_TO_ENDPOINT_DEFINITION__ANY_ATTRIBUTE2:
                ((FeatureMap.Internal)getAnyAttribute2()).set(newValue);
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
            case SpringPackage.INTERCEPT_SEND_TO_ENDPOINT_DEFINITION__SKIP_SEND_TO_ORIGINAL_ENDPOINT:
                unsetSkipSendToOriginalEndpoint();
                return;
            case SpringPackage.INTERCEPT_SEND_TO_ENDPOINT_DEFINITION__URI:
                setUri(URI_EDEFAULT);
                return;
            case SpringPackage.INTERCEPT_SEND_TO_ENDPOINT_DEFINITION__ANY_ATTRIBUTE2:
                getAnyAttribute2().clear();
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
            case SpringPackage.INTERCEPT_SEND_TO_ENDPOINT_DEFINITION__SKIP_SEND_TO_ORIGINAL_ENDPOINT:
                return isSetSkipSendToOriginalEndpoint();
            case SpringPackage.INTERCEPT_SEND_TO_ENDPOINT_DEFINITION__URI:
                return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
            case SpringPackage.INTERCEPT_SEND_TO_ENDPOINT_DEFINITION__ANY_ATTRIBUTE2:
                return anyAttribute2 != null && !anyAttribute2.isEmpty();
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
        result.append(" (skipSendToOriginalEndpoint: ");
        if (skipSendToOriginalEndpointESet) result.append(skipSendToOriginalEndpoint); else result.append("<unset>");
        result.append(", uri: ");
        result.append(uri);
        result.append(", anyAttribute2: ");
        result.append(anyAttribute2);
        result.append(')');
        return result.toString();
    }

} //InterceptSendToEndpointDefinitionImpl
