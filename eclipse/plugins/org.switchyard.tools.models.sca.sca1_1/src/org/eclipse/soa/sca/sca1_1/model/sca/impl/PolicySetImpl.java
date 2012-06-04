/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.impl;

import java.util.Collection;
import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.IntentMap;
import org.eclipse.soa.sca.sca1_1.model.sca.PolicySet;
import org.eclipse.soa.sca.sca1_1.model.sca.PolicySetReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.PolicySetImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.PolicySetImpl#getPolicySetReference <em>Policy Set Reference</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.PolicySetImpl#getIntentMap <em>Intent Map</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.PolicySetImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.PolicySetImpl#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.PolicySetImpl#getAttachTo <em>Attach To</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.PolicySetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.PolicySetImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.PolicySetImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolicySetImpl extends EObjectImpl implements PolicySet {
	/**
     * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGroup()
     * @generated
     * @ordered
     */
	protected FeatureMap group;

	/**
     * The default value of the '{@link #getAppliesTo() <em>Applies To</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAppliesTo()
     * @generated
     * @ordered
     */
	protected static final String APPLIES_TO_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getAppliesTo() <em>Applies To</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAppliesTo()
     * @generated
     * @ordered
     */
	protected String appliesTo = APPLIES_TO_EDEFAULT;

	/**
     * The default value of the '{@link #getAttachTo() <em>Attach To</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAttachTo()
     * @generated
     * @ordered
     */
	protected static final String ATTACH_TO_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getAttachTo() <em>Attach To</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAttachTo()
     * @generated
     * @ordered
     */
	protected String attachTo = ATTACH_TO_EDEFAULT;

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
     * The default value of the '{@link #getProvides() <em>Provides</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getProvides()
     * @generated
     * @ordered
     */
	protected static final List<QName> PROVIDES_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getProvides() <em>Provides</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getProvides()
     * @generated
     * @ordered
     */
	protected List<QName> provides = PROVIDES_EDEFAULT;

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
	protected PolicySetImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getPolicySet();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, ScaPackage.POLICY_SET__GROUP);
        }
        return group;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<PolicySetReference> getPolicySetReference() {
        return getGroup().list(ScaPackage.eINSTANCE.getPolicySet_PolicySetReference());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<IntentMap> getIntentMap() {
        return getGroup().list(ScaPackage.eINSTANCE.getPolicySet_IntentMap());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAny() {
        return (FeatureMap)getGroup().<FeatureMap.Entry>list(ScaPackage.eINSTANCE.getPolicySet_Any());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getAppliesTo() {
        return appliesTo;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAppliesTo(String newAppliesTo) {
        String oldAppliesTo = appliesTo;
        appliesTo = newAppliesTo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.POLICY_SET__APPLIES_TO, oldAppliesTo, appliesTo));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getAttachTo() {
        return attachTo;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAttachTo(String newAttachTo) {
        String oldAttachTo = attachTo;
        attachTo = newAttachTo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.POLICY_SET__ATTACH_TO, oldAttachTo, attachTo));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.POLICY_SET__NAME, oldName, name));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public List<QName> getProvides() {
        return provides;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setProvides(List<QName> newProvides) {
        List<QName> oldProvides = provides;
        provides = newProvides;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.POLICY_SET__PROVIDES, oldProvides, provides));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute() {
        if (anyAttribute == null) {
            anyAttribute = new BasicFeatureMap(this, ScaPackage.POLICY_SET__ANY_ATTRIBUTE);
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
            case ScaPackage.POLICY_SET__GROUP:
                return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
            case ScaPackage.POLICY_SET__POLICY_SET_REFERENCE:
                return ((InternalEList<?>)getPolicySetReference()).basicRemove(otherEnd, msgs);
            case ScaPackage.POLICY_SET__INTENT_MAP:
                return ((InternalEList<?>)getIntentMap()).basicRemove(otherEnd, msgs);
            case ScaPackage.POLICY_SET__ANY:
                return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
            case ScaPackage.POLICY_SET__ANY_ATTRIBUTE:
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
            case ScaPackage.POLICY_SET__GROUP:
                if (coreType) return getGroup();
                return ((FeatureMap.Internal)getGroup()).getWrapper();
            case ScaPackage.POLICY_SET__POLICY_SET_REFERENCE:
                return getPolicySetReference();
            case ScaPackage.POLICY_SET__INTENT_MAP:
                return getIntentMap();
            case ScaPackage.POLICY_SET__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case ScaPackage.POLICY_SET__APPLIES_TO:
                return getAppliesTo();
            case ScaPackage.POLICY_SET__ATTACH_TO:
                return getAttachTo();
            case ScaPackage.POLICY_SET__NAME:
                return getName();
            case ScaPackage.POLICY_SET__PROVIDES:
                return getProvides();
            case ScaPackage.POLICY_SET__ANY_ATTRIBUTE:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ScaPackage.POLICY_SET__GROUP:
                ((FeatureMap.Internal)getGroup()).set(newValue);
                return;
            case ScaPackage.POLICY_SET__POLICY_SET_REFERENCE:
                getPolicySetReference().clear();
                getPolicySetReference().addAll((Collection<? extends PolicySetReference>)newValue);
                return;
            case ScaPackage.POLICY_SET__INTENT_MAP:
                getIntentMap().clear();
                getIntentMap().addAll((Collection<? extends IntentMap>)newValue);
                return;
            case ScaPackage.POLICY_SET__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case ScaPackage.POLICY_SET__APPLIES_TO:
                setAppliesTo((String)newValue);
                return;
            case ScaPackage.POLICY_SET__ATTACH_TO:
                setAttachTo((String)newValue);
                return;
            case ScaPackage.POLICY_SET__NAME:
                setName((String)newValue);
                return;
            case ScaPackage.POLICY_SET__PROVIDES:
                setProvides((List<QName>)newValue);
                return;
            case ScaPackage.POLICY_SET__ANY_ATTRIBUTE:
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
            case ScaPackage.POLICY_SET__GROUP:
                getGroup().clear();
                return;
            case ScaPackage.POLICY_SET__POLICY_SET_REFERENCE:
                getPolicySetReference().clear();
                return;
            case ScaPackage.POLICY_SET__INTENT_MAP:
                getIntentMap().clear();
                return;
            case ScaPackage.POLICY_SET__ANY:
                getAny().clear();
                return;
            case ScaPackage.POLICY_SET__APPLIES_TO:
                setAppliesTo(APPLIES_TO_EDEFAULT);
                return;
            case ScaPackage.POLICY_SET__ATTACH_TO:
                setAttachTo(ATTACH_TO_EDEFAULT);
                return;
            case ScaPackage.POLICY_SET__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ScaPackage.POLICY_SET__PROVIDES:
                setProvides(PROVIDES_EDEFAULT);
                return;
            case ScaPackage.POLICY_SET__ANY_ATTRIBUTE:
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
            case ScaPackage.POLICY_SET__GROUP:
                return group != null && !group.isEmpty();
            case ScaPackage.POLICY_SET__POLICY_SET_REFERENCE:
                return !getPolicySetReference().isEmpty();
            case ScaPackage.POLICY_SET__INTENT_MAP:
                return !getIntentMap().isEmpty();
            case ScaPackage.POLICY_SET__ANY:
                return !getAny().isEmpty();
            case ScaPackage.POLICY_SET__APPLIES_TO:
                return APPLIES_TO_EDEFAULT == null ? appliesTo != null : !APPLIES_TO_EDEFAULT.equals(appliesTo);
            case ScaPackage.POLICY_SET__ATTACH_TO:
                return ATTACH_TO_EDEFAULT == null ? attachTo != null : !ATTACH_TO_EDEFAULT.equals(attachTo);
            case ScaPackage.POLICY_SET__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ScaPackage.POLICY_SET__PROVIDES:
                return PROVIDES_EDEFAULT == null ? provides != null : !PROVIDES_EDEFAULT.equals(provides);
            case ScaPackage.POLICY_SET__ANY_ATTRIBUTE:
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
        result.append(" (group: ");
        result.append(group);
        result.append(", appliesTo: ");
        result.append(appliesTo);
        result.append(", attachTo: ");
        result.append(attachTo);
        result.append(", name: ");
        result.append(name);
        result.append(", provides: ");
        result.append(provides);
        result.append(", anyAttribute: ");
        result.append(anyAttribute);
        result.append(')');
        return result.toString();
    }

} //PolicySetImpl
