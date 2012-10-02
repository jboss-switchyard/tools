/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.impl;

import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.InterfaceImpl#getPolicySets <em>Policy Sets</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.InterfaceImpl#isRemotable <em>Remotable</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.InterfaceImpl#getRequires <em>Requires</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InterfaceImpl extends CommonExtensionBaseImpl implements Interface {
	/**
     * The default value of the '{@link #getPolicySets() <em>Policy Sets</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPolicySets()
     * @generated
     * @ordered
     */
	protected static final List<QName> POLICY_SETS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getPolicySets() <em>Policy Sets</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPolicySets()
     * @generated
     * @ordered
     */
	protected List<QName> policySets = POLICY_SETS_EDEFAULT;

	/**
     * The default value of the '{@link #isRemotable() <em>Remotable</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isRemotable()
     * @generated
     * @ordered
     */
	protected static final boolean REMOTABLE_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isRemotable() <em>Remotable</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isRemotable()
     * @generated
     * @ordered
     */
	protected boolean remotable = REMOTABLE_EDEFAULT;

	/**
     * This is true if the Remotable attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean remotableESet;

	/**
     * The default value of the '{@link #getRequires() <em>Requires</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRequires()
     * @generated
     * @ordered
     */
	protected static final List<QName> REQUIRES_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRequires() <em>Requires</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRequires()
     * @generated
     * @ordered
     */
	protected List<QName> requires = REQUIRES_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected InterfaceImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getInterface();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public List<QName> getPolicySets() {
        return policySets;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPolicySets(List<QName> newPolicySets) {
        List<QName> oldPolicySets = policySets;
        policySets = newPolicySets;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.INTERFACE__POLICY_SETS, oldPolicySets, policySets));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isRemotable() {
        return remotable;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRemotable(boolean newRemotable) {
        boolean oldRemotable = remotable;
        remotable = newRemotable;
        boolean oldRemotableESet = remotableESet;
        remotableESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.INTERFACE__REMOTABLE, oldRemotable, remotable, !oldRemotableESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetRemotable() {
        boolean oldRemotable = remotable;
        boolean oldRemotableESet = remotableESet;
        remotable = REMOTABLE_EDEFAULT;
        remotableESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.INTERFACE__REMOTABLE, oldRemotable, REMOTABLE_EDEFAULT, oldRemotableESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetRemotable() {
        return remotableESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public List<QName> getRequires() {
        return requires;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRequires(List<QName> newRequires) {
        List<QName> oldRequires = requires;
        requires = newRequires;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.INTERFACE__REQUIRES, oldRequires, requires));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ScaPackage.INTERFACE__POLICY_SETS:
                return getPolicySets();
            case ScaPackage.INTERFACE__REMOTABLE:
                return isRemotable();
            case ScaPackage.INTERFACE__REQUIRES:
                return getRequires();
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
            case ScaPackage.INTERFACE__POLICY_SETS:
                setPolicySets((List<QName>)newValue);
                return;
            case ScaPackage.INTERFACE__REMOTABLE:
                setRemotable((Boolean)newValue);
                return;
            case ScaPackage.INTERFACE__REQUIRES:
                setRequires((List<QName>)newValue);
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
            case ScaPackage.INTERFACE__POLICY_SETS:
                setPolicySets(POLICY_SETS_EDEFAULT);
                return;
            case ScaPackage.INTERFACE__REMOTABLE:
                unsetRemotable();
                return;
            case ScaPackage.INTERFACE__REQUIRES:
                setRequires(REQUIRES_EDEFAULT);
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
            case ScaPackage.INTERFACE__POLICY_SETS:
                return POLICY_SETS_EDEFAULT == null ? policySets != null : !POLICY_SETS_EDEFAULT.equals(policySets);
            case ScaPackage.INTERFACE__REMOTABLE:
                return isSetRemotable();
            case ScaPackage.INTERFACE__REQUIRES:
                return REQUIRES_EDEFAULT == null ? requires != null : !REQUIRES_EDEFAULT.equals(requires);
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
        result.append(" (policySets: ");
        result.append(policySets);
        result.append(", remotable: ");
        if (remotableESet) result.append(remotable); else result.append("<unset>");
        result.append(", requires: ");
        result.append(requires);
        result.append(')');
        return result.toString();
    }

} //InterfaceImpl
