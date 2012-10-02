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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.CFunction;
import org.eclipse.soa.sca.sca1_1.model.sca.CInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CInterface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CInterfaceImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CInterfaceImpl#getCallbackFunction <em>Callback Function</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CInterfaceImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CInterfaceImpl#getCallbackHeader <em>Callback Header</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CInterfaceImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CInterfaceImpl#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CInterfaceImpl extends InterfaceImpl implements CInterface {
	/**
     * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFunction()
     * @generated
     * @ordered
     */
	protected EList<CFunction> function;

	/**
     * The cached value of the '{@link #getCallbackFunction() <em>Callback Function</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCallbackFunction()
     * @generated
     * @ordered
     */
	protected EList<CFunction> callbackFunction;

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
     * The default value of the '{@link #getCallbackHeader() <em>Callback Header</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCallbackHeader()
     * @generated
     * @ordered
     */
	protected static final String CALLBACK_HEADER_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getCallbackHeader() <em>Callback Header</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCallbackHeader()
     * @generated
     * @ordered
     */
	protected String callbackHeader = CALLBACK_HEADER_EDEFAULT;

	/**
     * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHeader()
     * @generated
     * @ordered
     */
	protected static final String HEADER_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHeader()
     * @generated
     * @ordered
     */
	protected String header = HEADER_EDEFAULT;

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
	protected CInterfaceImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getCInterface();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<CFunction> getFunction() {
        if (function == null) {
            function = new EObjectContainmentEList<CFunction>(CFunction.class, this, ScaPackage.CINTERFACE__FUNCTION);
        }
        return function;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<CFunction> getCallbackFunction() {
        if (callbackFunction == null) {
            callbackFunction = new EObjectContainmentEList<CFunction>(CFunction.class, this, ScaPackage.CINTERFACE__CALLBACK_FUNCTION);
        }
        return callbackFunction;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAny() {
        if (any == null) {
            any = new BasicFeatureMap(this, ScaPackage.CINTERFACE__ANY);
        }
        return any;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getCallbackHeader() {
        return callbackHeader;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCallbackHeader(String newCallbackHeader) {
        String oldCallbackHeader = callbackHeader;
        callbackHeader = newCallbackHeader;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CINTERFACE__CALLBACK_HEADER, oldCallbackHeader, callbackHeader));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getHeader() {
        return header;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHeader(String newHeader) {
        String oldHeader = header;
        header = newHeader;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CINTERFACE__HEADER, oldHeader, header));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute1() {
        if (anyAttribute1 == null) {
            anyAttribute1 = new BasicFeatureMap(this, ScaPackage.CINTERFACE__ANY_ATTRIBUTE1);
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
            case ScaPackage.CINTERFACE__FUNCTION:
                return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
            case ScaPackage.CINTERFACE__CALLBACK_FUNCTION:
                return ((InternalEList<?>)getCallbackFunction()).basicRemove(otherEnd, msgs);
            case ScaPackage.CINTERFACE__ANY:
                return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
            case ScaPackage.CINTERFACE__ANY_ATTRIBUTE1:
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
            case ScaPackage.CINTERFACE__FUNCTION:
                return getFunction();
            case ScaPackage.CINTERFACE__CALLBACK_FUNCTION:
                return getCallbackFunction();
            case ScaPackage.CINTERFACE__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case ScaPackage.CINTERFACE__CALLBACK_HEADER:
                return getCallbackHeader();
            case ScaPackage.CINTERFACE__HEADER:
                return getHeader();
            case ScaPackage.CINTERFACE__ANY_ATTRIBUTE1:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ScaPackage.CINTERFACE__FUNCTION:
                getFunction().clear();
                getFunction().addAll((Collection<? extends CFunction>)newValue);
                return;
            case ScaPackage.CINTERFACE__CALLBACK_FUNCTION:
                getCallbackFunction().clear();
                getCallbackFunction().addAll((Collection<? extends CFunction>)newValue);
                return;
            case ScaPackage.CINTERFACE__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case ScaPackage.CINTERFACE__CALLBACK_HEADER:
                setCallbackHeader((String)newValue);
                return;
            case ScaPackage.CINTERFACE__HEADER:
                setHeader((String)newValue);
                return;
            case ScaPackage.CINTERFACE__ANY_ATTRIBUTE1:
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
            case ScaPackage.CINTERFACE__FUNCTION:
                getFunction().clear();
                return;
            case ScaPackage.CINTERFACE__CALLBACK_FUNCTION:
                getCallbackFunction().clear();
                return;
            case ScaPackage.CINTERFACE__ANY:
                getAny().clear();
                return;
            case ScaPackage.CINTERFACE__CALLBACK_HEADER:
                setCallbackHeader(CALLBACK_HEADER_EDEFAULT);
                return;
            case ScaPackage.CINTERFACE__HEADER:
                setHeader(HEADER_EDEFAULT);
                return;
            case ScaPackage.CINTERFACE__ANY_ATTRIBUTE1:
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
            case ScaPackage.CINTERFACE__FUNCTION:
                return function != null && !function.isEmpty();
            case ScaPackage.CINTERFACE__CALLBACK_FUNCTION:
                return callbackFunction != null && !callbackFunction.isEmpty();
            case ScaPackage.CINTERFACE__ANY:
                return any != null && !any.isEmpty();
            case ScaPackage.CINTERFACE__CALLBACK_HEADER:
                return CALLBACK_HEADER_EDEFAULT == null ? callbackHeader != null : !CALLBACK_HEADER_EDEFAULT.equals(callbackHeader);
            case ScaPackage.CINTERFACE__HEADER:
                return HEADER_EDEFAULT == null ? header != null : !HEADER_EDEFAULT.equals(header);
            case ScaPackage.CINTERFACE__ANY_ATTRIBUTE1:
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
        result.append(", callbackHeader: ");
        result.append(callbackHeader);
        result.append(", header: ");
        result.append(header);
        result.append(", anyAttribute1: ");
        result.append(anyAttribute1);
        result.append(')');
        return result.toString();
    }

} //CInterfaceImpl
