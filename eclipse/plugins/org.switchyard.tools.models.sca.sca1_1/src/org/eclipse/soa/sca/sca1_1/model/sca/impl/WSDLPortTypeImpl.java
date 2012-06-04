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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WSDL Port Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.WSDLPortTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.WSDLPortTypeImpl#getCallbackInterface <em>Callback Interface</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.WSDLPortTypeImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.WSDLPortTypeImpl#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WSDLPortTypeImpl extends InterfaceImpl implements WSDLPortType {
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
     * The default value of the '{@link #getCallbackInterface() <em>Callback Interface</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCallbackInterface()
     * @generated
     * @ordered
     */
	protected static final String CALLBACK_INTERFACE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getCallbackInterface() <em>Callback Interface</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCallbackInterface()
     * @generated
     * @ordered
     */
	protected String callbackInterface = CALLBACK_INTERFACE_EDEFAULT;

	/**
     * The default value of the '{@link #getInterface() <em>Interface</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInterface()
     * @generated
     * @ordered
     */
	protected static final String INTERFACE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getInterface() <em>Interface</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInterface()
     * @generated
     * @ordered
     */
	protected String interface_ = INTERFACE_EDEFAULT;

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
	protected WSDLPortTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getWSDLPortType();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAny() {
        if (any == null) {
            any = new BasicFeatureMap(this, ScaPackage.WSDL_PORT_TYPE__ANY);
        }
        return any;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getCallbackInterface() {
        return callbackInterface;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCallbackInterface(String newCallbackInterface) {
        String oldCallbackInterface = callbackInterface;
        callbackInterface = newCallbackInterface;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.WSDL_PORT_TYPE__CALLBACK_INTERFACE, oldCallbackInterface, callbackInterface));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getInterface() {
        return interface_;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setInterface(String newInterface) {
        String oldInterface = interface_;
        interface_ = newInterface;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.WSDL_PORT_TYPE__INTERFACE, oldInterface, interface_));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute1() {
        if (anyAttribute1 == null) {
            anyAttribute1 = new BasicFeatureMap(this, ScaPackage.WSDL_PORT_TYPE__ANY_ATTRIBUTE1);
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
            case ScaPackage.WSDL_PORT_TYPE__ANY:
                return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
            case ScaPackage.WSDL_PORT_TYPE__ANY_ATTRIBUTE1:
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
            case ScaPackage.WSDL_PORT_TYPE__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case ScaPackage.WSDL_PORT_TYPE__CALLBACK_INTERFACE:
                return getCallbackInterface();
            case ScaPackage.WSDL_PORT_TYPE__INTERFACE:
                return getInterface();
            case ScaPackage.WSDL_PORT_TYPE__ANY_ATTRIBUTE1:
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
            case ScaPackage.WSDL_PORT_TYPE__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case ScaPackage.WSDL_PORT_TYPE__CALLBACK_INTERFACE:
                setCallbackInterface((String)newValue);
                return;
            case ScaPackage.WSDL_PORT_TYPE__INTERFACE:
                setInterface((String)newValue);
                return;
            case ScaPackage.WSDL_PORT_TYPE__ANY_ATTRIBUTE1:
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
            case ScaPackage.WSDL_PORT_TYPE__ANY:
                getAny().clear();
                return;
            case ScaPackage.WSDL_PORT_TYPE__CALLBACK_INTERFACE:
                setCallbackInterface(CALLBACK_INTERFACE_EDEFAULT);
                return;
            case ScaPackage.WSDL_PORT_TYPE__INTERFACE:
                setInterface(INTERFACE_EDEFAULT);
                return;
            case ScaPackage.WSDL_PORT_TYPE__ANY_ATTRIBUTE1:
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
            case ScaPackage.WSDL_PORT_TYPE__ANY:
                return any != null && !any.isEmpty();
            case ScaPackage.WSDL_PORT_TYPE__CALLBACK_INTERFACE:
                return CALLBACK_INTERFACE_EDEFAULT == null ? callbackInterface != null : !CALLBACK_INTERFACE_EDEFAULT.equals(callbackInterface);
            case ScaPackage.WSDL_PORT_TYPE__INTERFACE:
                return INTERFACE_EDEFAULT == null ? interface_ != null : !INTERFACE_EDEFAULT.equals(interface_);
            case ScaPackage.WSDL_PORT_TYPE__ANY_ATTRIBUTE1:
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
        result.append(", callbackInterface: ");
        result.append(callbackInterface);
        result.append(", interface: ");
        result.append(interface_);
        result.append(", anyAttribute1: ");
        result.append(anyAttribute1);
        result.append(')');
        return result.toString();
    }

    @Override
    public EStructuralFeature getDocumentFeature() {
        return ScaPackage.eINSTANCE.getDocumentRoot_InterfaceWsdl();
    }

} //WSDLPortTypeImpl
