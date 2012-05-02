/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectEList;

import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.Multiplicity;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ReferenceImpl#isAutowire <em>Autowire</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ReferenceImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ReferenceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ReferenceImpl#isWiredByImpl <em>Wired By Impl</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ReferenceImpl#getPromote <em>Promote</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceImpl extends ContractImpl implements Reference {
	/**
     * The default value of the '{@link #isAutowire() <em>Autowire</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isAutowire()
     * @generated
     * @ordered
     */
	protected static final boolean AUTOWIRE_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isAutowire() <em>Autowire</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isAutowire()
     * @generated
     * @ordered
     */
	protected boolean autowire = AUTOWIRE_EDEFAULT;

	/**
     * This is true if the Autowire attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean autowireESet;

	/**
     * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMultiplicity()
     * @generated
     * @ordered
     */
	protected static final Multiplicity MULTIPLICITY_EDEFAULT = Multiplicity._11;

	/**
     * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMultiplicity()
     * @generated
     * @ordered
     */
	protected Multiplicity multiplicity = MULTIPLICITY_EDEFAULT;

	/**
     * This is true if the Multiplicity attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean multiplicityESet;

	/**
     * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
	protected static final List<String> TARGET_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
	protected List<String> target = TARGET_EDEFAULT;

	/**
     * The default value of the '{@link #isWiredByImpl() <em>Wired By Impl</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isWiredByImpl()
     * @generated
     * @ordered
     */
	protected static final boolean WIRED_BY_IMPL_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isWiredByImpl() <em>Wired By Impl</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isWiredByImpl()
     * @generated
     * @ordered
     */
	protected boolean wiredByImpl = WIRED_BY_IMPL_EDEFAULT;

	/**
     * This is true if the Wired By Impl attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean wiredByImplESet;

	/**
     * The cached value of the '{@link #getPromote() <em>Promote</em>}' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPromote()
     * @generated
     * @ordered
     */
	protected EList<ComponentReference> promote;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ReferenceImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getReference();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isAutowire() {
        return autowire;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAutowire(boolean newAutowire) {
        boolean oldAutowire = autowire;
        autowire = newAutowire;
        boolean oldAutowireESet = autowireESet;
        autowireESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.REFERENCE__AUTOWIRE, oldAutowire, autowire, !oldAutowireESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetAutowire() {
        boolean oldAutowire = autowire;
        boolean oldAutowireESet = autowireESet;
        autowire = AUTOWIRE_EDEFAULT;
        autowireESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.REFERENCE__AUTOWIRE, oldAutowire, AUTOWIRE_EDEFAULT, oldAutowireESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetAutowire() {
        return autowireESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Multiplicity getMultiplicity() {
        return multiplicity;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMultiplicity(Multiplicity newMultiplicity) {
        Multiplicity oldMultiplicity = multiplicity;
        multiplicity = newMultiplicity == null ? MULTIPLICITY_EDEFAULT : newMultiplicity;
        boolean oldMultiplicityESet = multiplicityESet;
        multiplicityESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.REFERENCE__MULTIPLICITY, oldMultiplicity, multiplicity, !oldMultiplicityESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetMultiplicity() {
        Multiplicity oldMultiplicity = multiplicity;
        boolean oldMultiplicityESet = multiplicityESet;
        multiplicity = MULTIPLICITY_EDEFAULT;
        multiplicityESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.REFERENCE__MULTIPLICITY, oldMultiplicity, MULTIPLICITY_EDEFAULT, oldMultiplicityESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetMultiplicity() {
        return multiplicityESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public List<String> getTarget() {
        return target;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTarget(List<String> newTarget) {
        List<String> oldTarget = target;
        target = newTarget;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.REFERENCE__TARGET, oldTarget, target));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isWiredByImpl() {
        return wiredByImpl;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setWiredByImpl(boolean newWiredByImpl) {
        boolean oldWiredByImpl = wiredByImpl;
        wiredByImpl = newWiredByImpl;
        boolean oldWiredByImplESet = wiredByImplESet;
        wiredByImplESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.REFERENCE__WIRED_BY_IMPL, oldWiredByImpl, wiredByImpl, !oldWiredByImplESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetWiredByImpl() {
        boolean oldWiredByImpl = wiredByImpl;
        boolean oldWiredByImplESet = wiredByImplESet;
        wiredByImpl = WIRED_BY_IMPL_EDEFAULT;
        wiredByImplESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.REFERENCE__WIRED_BY_IMPL, oldWiredByImpl, WIRED_BY_IMPL_EDEFAULT, oldWiredByImplESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetWiredByImpl() {
        return wiredByImplESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ComponentReference> getPromote() {
        if (promote == null) {
            promote = new EObjectEList<ComponentReference>(ComponentReference.class, this, ScaPackage.REFERENCE__PROMOTE);
        }
        return promote;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ScaPackage.REFERENCE__AUTOWIRE:
                return isAutowire();
            case ScaPackage.REFERENCE__MULTIPLICITY:
                return getMultiplicity();
            case ScaPackage.REFERENCE__TARGET:
                return getTarget();
            case ScaPackage.REFERENCE__WIRED_BY_IMPL:
                return isWiredByImpl();
            case ScaPackage.REFERENCE__PROMOTE:
                return getPromote();
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
            case ScaPackage.REFERENCE__AUTOWIRE:
                setAutowire((Boolean)newValue);
                return;
            case ScaPackage.REFERENCE__MULTIPLICITY:
                setMultiplicity((Multiplicity)newValue);
                return;
            case ScaPackage.REFERENCE__TARGET:
                setTarget((List<String>)newValue);
                return;
            case ScaPackage.REFERENCE__WIRED_BY_IMPL:
                setWiredByImpl((Boolean)newValue);
                return;
            case ScaPackage.REFERENCE__PROMOTE:
                getPromote().clear();
                getPromote().addAll((Collection<? extends ComponentReference>)newValue);
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
            case ScaPackage.REFERENCE__AUTOWIRE:
                unsetAutowire();
                return;
            case ScaPackage.REFERENCE__MULTIPLICITY:
                unsetMultiplicity();
                return;
            case ScaPackage.REFERENCE__TARGET:
                setTarget(TARGET_EDEFAULT);
                return;
            case ScaPackage.REFERENCE__WIRED_BY_IMPL:
                unsetWiredByImpl();
                return;
            case ScaPackage.REFERENCE__PROMOTE:
                getPromote().clear();
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
            case ScaPackage.REFERENCE__AUTOWIRE:
                return isSetAutowire();
            case ScaPackage.REFERENCE__MULTIPLICITY:
                return isSetMultiplicity();
            case ScaPackage.REFERENCE__TARGET:
                return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
            case ScaPackage.REFERENCE__WIRED_BY_IMPL:
                return isSetWiredByImpl();
            case ScaPackage.REFERENCE__PROMOTE:
                return promote != null && !promote.isEmpty();
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
        result.append(" (autowire: ");
        if (autowireESet) result.append(autowire); else result.append("<unset>");
        result.append(", multiplicity: ");
        if (multiplicityESet) result.append(multiplicity); else result.append("<unset>");
        result.append(", target: ");
        result.append(target);
        result.append(", wiredByImpl: ");
        if (wiredByImplESet) result.append(wiredByImpl); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ReferenceImpl
