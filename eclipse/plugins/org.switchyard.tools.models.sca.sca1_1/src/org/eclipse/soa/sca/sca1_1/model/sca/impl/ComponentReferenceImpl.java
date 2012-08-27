/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectEList;

import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Multiplicity;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentReferenceImpl#isAutowire <em>Autowire</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentReferenceImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentReferenceImpl#isNonOverridable <em>Non Overridable</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentReferenceImpl#isWiredByImpl <em>Wired By Impl</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentReferenceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentReferenceImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentReferenceImpl extends ContractImpl implements ComponentReference {
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
     * The default value of the '{@link #isNonOverridable() <em>Non Overridable</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isNonOverridable()
     * @generated
     * @ordered
     */
	protected static final boolean NON_OVERRIDABLE_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isNonOverridable() <em>Non Overridable</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isNonOverridable()
     * @generated
     * @ordered
     */
	protected boolean nonOverridable = NON_OVERRIDABLE_EDEFAULT;

	/**
     * This is true if the Non Overridable attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean nonOverridableESet;

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
     * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
	protected EList<ComponentService> target;

	/**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
	protected static final String ID_EDEFAULT = "";

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ComponentReferenceImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getComponentReference();
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.COMPONENT_REFERENCE__AUTOWIRE, oldAutowire, autowire, !oldAutowireESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.COMPONENT_REFERENCE__AUTOWIRE, oldAutowire, AUTOWIRE_EDEFAULT, oldAutowireESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.COMPONENT_REFERENCE__MULTIPLICITY, oldMultiplicity, multiplicity, !oldMultiplicityESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.COMPONENT_REFERENCE__MULTIPLICITY, oldMultiplicity, MULTIPLICITY_EDEFAULT, oldMultiplicityESet));
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
	public boolean isNonOverridable() {
        return nonOverridable;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setNonOverridable(boolean newNonOverridable) {
        boolean oldNonOverridable = nonOverridable;
        nonOverridable = newNonOverridable;
        boolean oldNonOverridableESet = nonOverridableESet;
        nonOverridableESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.COMPONENT_REFERENCE__NON_OVERRIDABLE, oldNonOverridable, nonOverridable, !oldNonOverridableESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetNonOverridable() {
        boolean oldNonOverridable = nonOverridable;
        boolean oldNonOverridableESet = nonOverridableESet;
        nonOverridable = NON_OVERRIDABLE_EDEFAULT;
        nonOverridableESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.COMPONENT_REFERENCE__NON_OVERRIDABLE, oldNonOverridable, NON_OVERRIDABLE_EDEFAULT, oldNonOverridableESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetNonOverridable() {
        return nonOverridableESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.COMPONENT_REFERENCE__WIRED_BY_IMPL, oldWiredByImpl, wiredByImpl, !oldWiredByImplESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.COMPONENT_REFERENCE__WIRED_BY_IMPL, oldWiredByImpl, WIRED_BY_IMPL_EDEFAULT, oldWiredByImplESet));
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
	public EList<ComponentService> getTarget() {
        if (target == null) {
            target = new EObjectEList<ComponentService>(ComponentService.class, this, ScaPackage.COMPONENT_REFERENCE__TARGET);
        }
        return target;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getId() {
        final String id;
        final String compName;
        if (eContainer != null) {
            compName = (String) eContainer.eGet(ScaPackage.eINSTANCE.getComponent_Name());
        } else {
            compName = null;
        }
        final String name = getName();
        if (name == null) {
            id = null;
        } else if (compName == null) {
            id = "ComponentReference::" + name;
        } else {
            id = "ComponentReference:" + compName + ":" + name;
        }
        return id;
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setId(String newId) {
        // TODO: implement this method to set the 'Id' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ScaPackage.COMPONENT_REFERENCE__AUTOWIRE:
                return isAutowire();
            case ScaPackage.COMPONENT_REFERENCE__MULTIPLICITY:
                return getMultiplicity();
            case ScaPackage.COMPONENT_REFERENCE__NON_OVERRIDABLE:
                return isNonOverridable();
            case ScaPackage.COMPONENT_REFERENCE__WIRED_BY_IMPL:
                return isWiredByImpl();
            case ScaPackage.COMPONENT_REFERENCE__TARGET:
                return getTarget();
            case ScaPackage.COMPONENT_REFERENCE__ID:
                return getId();
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
            case ScaPackage.COMPONENT_REFERENCE__AUTOWIRE:
                setAutowire((Boolean)newValue);
                return;
            case ScaPackage.COMPONENT_REFERENCE__MULTIPLICITY:
                setMultiplicity((Multiplicity)newValue);
                return;
            case ScaPackage.COMPONENT_REFERENCE__NON_OVERRIDABLE:
                setNonOverridable((Boolean)newValue);
                return;
            case ScaPackage.COMPONENT_REFERENCE__WIRED_BY_IMPL:
                setWiredByImpl((Boolean)newValue);
                return;
            case ScaPackage.COMPONENT_REFERENCE__TARGET:
                getTarget().clear();
                getTarget().addAll((Collection<? extends ComponentService>)newValue);
                return;
            case ScaPackage.COMPONENT_REFERENCE__ID:
                setId((String)newValue);
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
            case ScaPackage.COMPONENT_REFERENCE__AUTOWIRE:
                unsetAutowire();
                return;
            case ScaPackage.COMPONENT_REFERENCE__MULTIPLICITY:
                unsetMultiplicity();
                return;
            case ScaPackage.COMPONENT_REFERENCE__NON_OVERRIDABLE:
                unsetNonOverridable();
                return;
            case ScaPackage.COMPONENT_REFERENCE__WIRED_BY_IMPL:
                unsetWiredByImpl();
                return;
            case ScaPackage.COMPONENT_REFERENCE__TARGET:
                getTarget().clear();
                return;
            case ScaPackage.COMPONENT_REFERENCE__ID:
                setId(ID_EDEFAULT);
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
            case ScaPackage.COMPONENT_REFERENCE__AUTOWIRE:
                return isSetAutowire();
            case ScaPackage.COMPONENT_REFERENCE__MULTIPLICITY:
                return isSetMultiplicity();
            case ScaPackage.COMPONENT_REFERENCE__NON_OVERRIDABLE:
                return isSetNonOverridable();
            case ScaPackage.COMPONENT_REFERENCE__WIRED_BY_IMPL:
                return isSetWiredByImpl();
            case ScaPackage.COMPONENT_REFERENCE__TARGET:
                return target != null && !target.isEmpty();
            case ScaPackage.COMPONENT_REFERENCE__ID:
                return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
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
        result.append(", nonOverridable: ");
        if (nonOverridableESet) result.append(nonOverridable); else result.append("<unset>");
        result.append(", wiredByImpl: ");
        if (wiredByImplESet) result.append(wiredByImpl); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ComponentReferenceImpl
