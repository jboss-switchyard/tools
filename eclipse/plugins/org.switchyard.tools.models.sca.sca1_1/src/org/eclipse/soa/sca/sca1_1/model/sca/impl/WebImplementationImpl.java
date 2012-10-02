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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.WebImplementation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.WebImplementationImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.WebImplementationImpl#getWebUri <em>Web Uri</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.WebImplementationImpl#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebImplementationImpl extends ImplementationImpl implements WebImplementation {
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
     * The default value of the '{@link #getWebUri() <em>Web Uri</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getWebUri()
     * @generated
     * @ordered
     */
	protected static final String WEB_URI_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getWebUri() <em>Web Uri</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getWebUri()
     * @generated
     * @ordered
     */
	protected String webUri = WEB_URI_EDEFAULT;

	/**
     * The cached value of the '{@link #getAnyAttribute1() <em>Any Attribute1</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAnyAttribute1()
     * @generated
     * @ordered
     */
	protected FeatureMap anyAttribute1;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected WebImplementationImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getWebImplementation();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAny() {
        if (any == null) {
            any = new BasicFeatureMap(this, ScaPackage.WEB_IMPLEMENTATION__ANY);
        }
        return any;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getWebUri() {
        return webUri;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setWebUri(String newWebUri) {
        String oldWebUri = webUri;
        webUri = newWebUri;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.WEB_IMPLEMENTATION__WEB_URI, oldWebUri, webUri));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute1() {
        if (anyAttribute1 == null) {
            anyAttribute1 = new BasicFeatureMap(this, ScaPackage.WEB_IMPLEMENTATION__ANY_ATTRIBUTE1);
        }
        return anyAttribute1;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScaPackage.WEB_IMPLEMENTATION__ANY:
                return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
            case ScaPackage.WEB_IMPLEMENTATION__ANY_ATTRIBUTE1:
                return ((InternalEList<?>)getAnyAttribute1()).basicRemove(otherEnd, msgs);
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
            case ScaPackage.WEB_IMPLEMENTATION__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case ScaPackage.WEB_IMPLEMENTATION__WEB_URI:
                return getWebUri();
            case ScaPackage.WEB_IMPLEMENTATION__ANY_ATTRIBUTE1:
                if (coreType) return getAnyAttribute1();
                return ((FeatureMap.Internal)getAnyAttribute1()).getWrapper();
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
            case ScaPackage.WEB_IMPLEMENTATION__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case ScaPackage.WEB_IMPLEMENTATION__WEB_URI:
                setWebUri((String)newValue);
                return;
            case ScaPackage.WEB_IMPLEMENTATION__ANY_ATTRIBUTE1:
                ((FeatureMap.Internal)getAnyAttribute1()).set(newValue);
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
            case ScaPackage.WEB_IMPLEMENTATION__ANY:
                getAny().clear();
                return;
            case ScaPackage.WEB_IMPLEMENTATION__WEB_URI:
                setWebUri(WEB_URI_EDEFAULT);
                return;
            case ScaPackage.WEB_IMPLEMENTATION__ANY_ATTRIBUTE1:
                getAnyAttribute1().clear();
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
            case ScaPackage.WEB_IMPLEMENTATION__ANY:
                return any != null && !any.isEmpty();
            case ScaPackage.WEB_IMPLEMENTATION__WEB_URI:
                return WEB_URI_EDEFAULT == null ? webUri != null : !WEB_URI_EDEFAULT.equals(webUri);
            case ScaPackage.WEB_IMPLEMENTATION__ANY_ATTRIBUTE1:
                return anyAttribute1 != null && !anyAttribute1.isEmpty();
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
        result.append(", webUri: ");
        result.append(webUri);
        result.append(", anyAttribute1: ");
        result.append(anyAttribute1);
        result.append(')');
        return result.toString();
    }

} //WebImplementationImpl
