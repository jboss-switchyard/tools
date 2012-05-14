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

import org.switchyard.tools.models.switchyard1_0.spring.DynamicRouterDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Router Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DynamicRouterDefinitionImpl#isIgnoreInvalidEndpoints <em>Ignore Invalid Endpoints</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DynamicRouterDefinitionImpl#getUriDelimiter <em>Uri Delimiter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DynamicRouterDefinitionImpl#getAnyAttribute3 <em>Any Attribute3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DynamicRouterDefinitionImpl extends NoOutputExpressionNodeImpl implements DynamicRouterDefinition {
	/**
     * The default value of the '{@link #isIgnoreInvalidEndpoints() <em>Ignore Invalid Endpoints</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isIgnoreInvalidEndpoints()
     * @generated
     * @ordered
     */
	protected static final boolean IGNORE_INVALID_ENDPOINTS_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isIgnoreInvalidEndpoints() <em>Ignore Invalid Endpoints</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isIgnoreInvalidEndpoints()
     * @generated
     * @ordered
     */
	protected boolean ignoreInvalidEndpoints = IGNORE_INVALID_ENDPOINTS_EDEFAULT;

	/**
     * This is true if the Ignore Invalid Endpoints attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean ignoreInvalidEndpointsESet;

	/**
     * The default value of the '{@link #getUriDelimiter() <em>Uri Delimiter</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUriDelimiter()
     * @generated
     * @ordered
     */
	protected static final String URI_DELIMITER_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getUriDelimiter() <em>Uri Delimiter</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUriDelimiter()
     * @generated
     * @ordered
     */
	protected String uriDelimiter = URI_DELIMITER_EDEFAULT;

	/**
     * The cached value of the '{@link #getAnyAttribute3() <em>Any Attribute3</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAnyAttribute3()
     * @generated
     * @ordered
     */
	protected FeatureMap anyAttribute3;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected DynamicRouterDefinitionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getDynamicRouterDefinition();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isIgnoreInvalidEndpoints() {
        return ignoreInvalidEndpoints;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setIgnoreInvalidEndpoints(boolean newIgnoreInvalidEndpoints) {
        boolean oldIgnoreInvalidEndpoints = ignoreInvalidEndpoints;
        ignoreInvalidEndpoints = newIgnoreInvalidEndpoints;
        boolean oldIgnoreInvalidEndpointsESet = ignoreInvalidEndpointsESet;
        ignoreInvalidEndpointsESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.DYNAMIC_ROUTER_DEFINITION__IGNORE_INVALID_ENDPOINTS, oldIgnoreInvalidEndpoints, ignoreInvalidEndpoints, !oldIgnoreInvalidEndpointsESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetIgnoreInvalidEndpoints() {
        boolean oldIgnoreInvalidEndpoints = ignoreInvalidEndpoints;
        boolean oldIgnoreInvalidEndpointsESet = ignoreInvalidEndpointsESet;
        ignoreInvalidEndpoints = IGNORE_INVALID_ENDPOINTS_EDEFAULT;
        ignoreInvalidEndpointsESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.DYNAMIC_ROUTER_DEFINITION__IGNORE_INVALID_ENDPOINTS, oldIgnoreInvalidEndpoints, IGNORE_INVALID_ENDPOINTS_EDEFAULT, oldIgnoreInvalidEndpointsESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetIgnoreInvalidEndpoints() {
        return ignoreInvalidEndpointsESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getUriDelimiter() {
        return uriDelimiter;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setUriDelimiter(String newUriDelimiter) {
        String oldUriDelimiter = uriDelimiter;
        uriDelimiter = newUriDelimiter;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.DYNAMIC_ROUTER_DEFINITION__URI_DELIMITER, oldUriDelimiter, uriDelimiter));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute3() {
        if (anyAttribute3 == null) {
            anyAttribute3 = new BasicFeatureMap(this, SpringPackage.DYNAMIC_ROUTER_DEFINITION__ANY_ATTRIBUTE3);
        }
        return anyAttribute3;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SpringPackage.DYNAMIC_ROUTER_DEFINITION__ANY_ATTRIBUTE3:
                return ((InternalEList<?>)getAnyAttribute3()).basicRemove(otherEnd, msgs);
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
            case SpringPackage.DYNAMIC_ROUTER_DEFINITION__IGNORE_INVALID_ENDPOINTS:
                return isIgnoreInvalidEndpoints();
            case SpringPackage.DYNAMIC_ROUTER_DEFINITION__URI_DELIMITER:
                return getUriDelimiter();
            case SpringPackage.DYNAMIC_ROUTER_DEFINITION__ANY_ATTRIBUTE3:
                if (coreType) return getAnyAttribute3();
                return ((FeatureMap.Internal)getAnyAttribute3()).getWrapper();
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
            case SpringPackage.DYNAMIC_ROUTER_DEFINITION__IGNORE_INVALID_ENDPOINTS:
                setIgnoreInvalidEndpoints((Boolean)newValue);
                return;
            case SpringPackage.DYNAMIC_ROUTER_DEFINITION__URI_DELIMITER:
                setUriDelimiter((String)newValue);
                return;
            case SpringPackage.DYNAMIC_ROUTER_DEFINITION__ANY_ATTRIBUTE3:
                ((FeatureMap.Internal)getAnyAttribute3()).set(newValue);
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
            case SpringPackage.DYNAMIC_ROUTER_DEFINITION__IGNORE_INVALID_ENDPOINTS:
                unsetIgnoreInvalidEndpoints();
                return;
            case SpringPackage.DYNAMIC_ROUTER_DEFINITION__URI_DELIMITER:
                setUriDelimiter(URI_DELIMITER_EDEFAULT);
                return;
            case SpringPackage.DYNAMIC_ROUTER_DEFINITION__ANY_ATTRIBUTE3:
                getAnyAttribute3().clear();
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
            case SpringPackage.DYNAMIC_ROUTER_DEFINITION__IGNORE_INVALID_ENDPOINTS:
                return isSetIgnoreInvalidEndpoints();
            case SpringPackage.DYNAMIC_ROUTER_DEFINITION__URI_DELIMITER:
                return URI_DELIMITER_EDEFAULT == null ? uriDelimiter != null : !URI_DELIMITER_EDEFAULT.equals(uriDelimiter);
            case SpringPackage.DYNAMIC_ROUTER_DEFINITION__ANY_ATTRIBUTE3:
                return anyAttribute3 != null && !anyAttribute3.isEmpty();
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
        result.append(" (ignoreInvalidEndpoints: ");
        if (ignoreInvalidEndpointsESet) result.append(ignoreInvalidEndpoints); else result.append("<unset>");
        result.append(", uriDelimiter: ");
        result.append(uriDelimiter);
        result.append(", anyAttribute3: ");
        result.append(anyAttribute3);
        result.append(')');
        return result.toString();
    }

} //DynamicRouterDefinitionImpl
