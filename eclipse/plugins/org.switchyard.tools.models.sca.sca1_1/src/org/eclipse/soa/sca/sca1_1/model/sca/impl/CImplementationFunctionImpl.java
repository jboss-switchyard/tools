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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.CImplementationFunction;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CImplementation Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CImplementationFunctionImpl#isAllowsPassByReference <em>Allows Pass By Reference</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CImplementationFunctionImpl#isDestoy <em>Destoy</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CImplementationFunctionImpl#isInit <em>Init</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CImplementationFunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CImplementationFunctionImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CImplementationFunctionImpl extends EObjectImpl implements CImplementationFunction {
	/**
     * The default value of the '{@link #isAllowsPassByReference() <em>Allows Pass By Reference</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isAllowsPassByReference()
     * @generated
     * @ordered
     */
	protected static final boolean ALLOWS_PASS_BY_REFERENCE_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isAllowsPassByReference() <em>Allows Pass By Reference</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isAllowsPassByReference()
     * @generated
     * @ordered
     */
	protected boolean allowsPassByReference = ALLOWS_PASS_BY_REFERENCE_EDEFAULT;

	/**
     * This is true if the Allows Pass By Reference attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean allowsPassByReferenceESet;

	/**
     * The default value of the '{@link #isDestoy() <em>Destoy</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isDestoy()
     * @generated
     * @ordered
     */
	protected static final boolean DESTOY_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isDestoy() <em>Destoy</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isDestoy()
     * @generated
     * @ordered
     */
	protected boolean destoy = DESTOY_EDEFAULT;

	/**
     * This is true if the Destoy attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean destoyESet;

	/**
     * The default value of the '{@link #isInit() <em>Init</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isInit()
     * @generated
     * @ordered
     */
	protected static final boolean INIT_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isInit() <em>Init</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isInit()
     * @generated
     * @ordered
     */
	protected boolean init = INIT_EDEFAULT;

	/**
     * This is true if the Init attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean initESet;

	/**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
	protected static final String NAME_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
	protected String name = NAME_EDEFAULT;

	/**
     * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAnyAttribute()
     * @generated
     * @ordered
     */
	protected FeatureMap anyAttribute;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CImplementationFunctionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getCImplementationFunction();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isAllowsPassByReference() {
        return allowsPassByReference;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAllowsPassByReference(boolean newAllowsPassByReference) {
        boolean oldAllowsPassByReference = allowsPassByReference;
        allowsPassByReference = newAllowsPassByReference;
        boolean oldAllowsPassByReferenceESet = allowsPassByReferenceESet;
        allowsPassByReferenceESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CIMPLEMENTATION_FUNCTION__ALLOWS_PASS_BY_REFERENCE, oldAllowsPassByReference, allowsPassByReference, !oldAllowsPassByReferenceESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetAllowsPassByReference() {
        boolean oldAllowsPassByReference = allowsPassByReference;
        boolean oldAllowsPassByReferenceESet = allowsPassByReferenceESet;
        allowsPassByReference = ALLOWS_PASS_BY_REFERENCE_EDEFAULT;
        allowsPassByReferenceESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.CIMPLEMENTATION_FUNCTION__ALLOWS_PASS_BY_REFERENCE, oldAllowsPassByReference, ALLOWS_PASS_BY_REFERENCE_EDEFAULT, oldAllowsPassByReferenceESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetAllowsPassByReference() {
        return allowsPassByReferenceESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isDestoy() {
        return destoy;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDestoy(boolean newDestoy) {
        boolean oldDestoy = destoy;
        destoy = newDestoy;
        boolean oldDestoyESet = destoyESet;
        destoyESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CIMPLEMENTATION_FUNCTION__DESTOY, oldDestoy, destoy, !oldDestoyESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetDestoy() {
        boolean oldDestoy = destoy;
        boolean oldDestoyESet = destoyESet;
        destoy = DESTOY_EDEFAULT;
        destoyESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.CIMPLEMENTATION_FUNCTION__DESTOY, oldDestoy, DESTOY_EDEFAULT, oldDestoyESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetDestoy() {
        return destoyESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isInit() {
        return init;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setInit(boolean newInit) {
        boolean oldInit = init;
        init = newInit;
        boolean oldInitESet = initESet;
        initESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CIMPLEMENTATION_FUNCTION__INIT, oldInit, init, !oldInitESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetInit() {
        boolean oldInit = init;
        boolean oldInitESet = initESet;
        init = INIT_EDEFAULT;
        initESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.CIMPLEMENTATION_FUNCTION__INIT, oldInit, INIT_EDEFAULT, oldInitESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetInit() {
        return initESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getName() {
        return name;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CIMPLEMENTATION_FUNCTION__NAME, oldName, name));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute() {
        if (anyAttribute == null) {
            anyAttribute = new BasicFeatureMap(this, ScaPackage.CIMPLEMENTATION_FUNCTION__ANY_ATTRIBUTE);
        }
        return anyAttribute;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScaPackage.CIMPLEMENTATION_FUNCTION__ANY_ATTRIBUTE:
                return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
            case ScaPackage.CIMPLEMENTATION_FUNCTION__ALLOWS_PASS_BY_REFERENCE:
                return isAllowsPassByReference();
            case ScaPackage.CIMPLEMENTATION_FUNCTION__DESTOY:
                return isDestoy();
            case ScaPackage.CIMPLEMENTATION_FUNCTION__INIT:
                return isInit();
            case ScaPackage.CIMPLEMENTATION_FUNCTION__NAME:
                return getName();
            case ScaPackage.CIMPLEMENTATION_FUNCTION__ANY_ATTRIBUTE:
                if (coreType) return getAnyAttribute();
                return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
            case ScaPackage.CIMPLEMENTATION_FUNCTION__ALLOWS_PASS_BY_REFERENCE:
                setAllowsPassByReference((Boolean)newValue);
                return;
            case ScaPackage.CIMPLEMENTATION_FUNCTION__DESTOY:
                setDestoy((Boolean)newValue);
                return;
            case ScaPackage.CIMPLEMENTATION_FUNCTION__INIT:
                setInit((Boolean)newValue);
                return;
            case ScaPackage.CIMPLEMENTATION_FUNCTION__NAME:
                setName((String)newValue);
                return;
            case ScaPackage.CIMPLEMENTATION_FUNCTION__ANY_ATTRIBUTE:
                ((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
            case ScaPackage.CIMPLEMENTATION_FUNCTION__ALLOWS_PASS_BY_REFERENCE:
                unsetAllowsPassByReference();
                return;
            case ScaPackage.CIMPLEMENTATION_FUNCTION__DESTOY:
                unsetDestoy();
                return;
            case ScaPackage.CIMPLEMENTATION_FUNCTION__INIT:
                unsetInit();
                return;
            case ScaPackage.CIMPLEMENTATION_FUNCTION__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ScaPackage.CIMPLEMENTATION_FUNCTION__ANY_ATTRIBUTE:
                getAnyAttribute().clear();
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
            case ScaPackage.CIMPLEMENTATION_FUNCTION__ALLOWS_PASS_BY_REFERENCE:
                return isSetAllowsPassByReference();
            case ScaPackage.CIMPLEMENTATION_FUNCTION__DESTOY:
                return isSetDestoy();
            case ScaPackage.CIMPLEMENTATION_FUNCTION__INIT:
                return isSetInit();
            case ScaPackage.CIMPLEMENTATION_FUNCTION__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ScaPackage.CIMPLEMENTATION_FUNCTION__ANY_ATTRIBUTE:
                return anyAttribute != null && !anyAttribute.isEmpty();
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
        result.append(" (allowsPassByReference: ");
        if (allowsPassByReferenceESet) result.append(allowsPassByReference); else result.append("<unset>");
        result.append(", destoy: ");
        if (destoyESet) result.append(destoy); else result.append("<unset>");
        result.append(", init: ");
        if (initESet) result.append(init); else result.append("<unset>");
        result.append(", name: ");
        result.append(name);
        result.append(", anyAttribute: ");
        result.append(anyAttribute);
        result.append(')');
        return result.toString();
    }

} //CImplementationFunctionImpl
