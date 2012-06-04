/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.impl;

import java.util.Collection;

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
import org.eclipse.soa.sca.sca1_1.model.sca.Qualifier;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intent Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.IntentMapImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.IntentMapImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.IntentMapImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.IntentMapImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.IntentMapImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntentMapImpl extends EObjectImpl implements IntentMap {
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
     * The default value of the '{@link #getProvides() <em>Provides</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getProvides()
     * @generated
     * @ordered
     */
	protected static final QName PROVIDES_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getProvides() <em>Provides</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getProvides()
     * @generated
     * @ordered
     */
	protected QName provides = PROVIDES_EDEFAULT;

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
	protected IntentMapImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getIntentMap();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, ScaPackage.INTENT_MAP__GROUP);
        }
        return group;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Qualifier> getQualifier() {
        return getGroup().list(ScaPackage.eINSTANCE.getIntentMap_Qualifier());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAny() {
        return (FeatureMap)getGroup().<FeatureMap.Entry>list(ScaPackage.eINSTANCE.getIntentMap_Any());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public QName getProvides() {
        return provides;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setProvides(QName newProvides) {
        QName oldProvides = provides;
        provides = newProvides;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.INTENT_MAP__PROVIDES, oldProvides, provides));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute() {
        if (anyAttribute == null) {
            anyAttribute = new BasicFeatureMap(this, ScaPackage.INTENT_MAP__ANY_ATTRIBUTE);
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
            case ScaPackage.INTENT_MAP__GROUP:
                return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
            case ScaPackage.INTENT_MAP__QUALIFIER:
                return ((InternalEList<?>)getQualifier()).basicRemove(otherEnd, msgs);
            case ScaPackage.INTENT_MAP__ANY:
                return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
            case ScaPackage.INTENT_MAP__ANY_ATTRIBUTE:
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
            case ScaPackage.INTENT_MAP__GROUP:
                if (coreType) return getGroup();
                return ((FeatureMap.Internal)getGroup()).getWrapper();
            case ScaPackage.INTENT_MAP__QUALIFIER:
                return getQualifier();
            case ScaPackage.INTENT_MAP__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case ScaPackage.INTENT_MAP__PROVIDES:
                return getProvides();
            case ScaPackage.INTENT_MAP__ANY_ATTRIBUTE:
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
            case ScaPackage.INTENT_MAP__GROUP:
                ((FeatureMap.Internal)getGroup()).set(newValue);
                return;
            case ScaPackage.INTENT_MAP__QUALIFIER:
                getQualifier().clear();
                getQualifier().addAll((Collection<? extends Qualifier>)newValue);
                return;
            case ScaPackage.INTENT_MAP__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case ScaPackage.INTENT_MAP__PROVIDES:
                setProvides((QName)newValue);
                return;
            case ScaPackage.INTENT_MAP__ANY_ATTRIBUTE:
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
            case ScaPackage.INTENT_MAP__GROUP:
                getGroup().clear();
                return;
            case ScaPackage.INTENT_MAP__QUALIFIER:
                getQualifier().clear();
                return;
            case ScaPackage.INTENT_MAP__ANY:
                getAny().clear();
                return;
            case ScaPackage.INTENT_MAP__PROVIDES:
                setProvides(PROVIDES_EDEFAULT);
                return;
            case ScaPackage.INTENT_MAP__ANY_ATTRIBUTE:
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
            case ScaPackage.INTENT_MAP__GROUP:
                return group != null && !group.isEmpty();
            case ScaPackage.INTENT_MAP__QUALIFIER:
                return !getQualifier().isEmpty();
            case ScaPackage.INTENT_MAP__ANY:
                return !getAny().isEmpty();
            case ScaPackage.INTENT_MAP__PROVIDES:
                return PROVIDES_EDEFAULT == null ? provides != null : !PROVIDES_EDEFAULT.equals(provides);
            case ScaPackage.INTENT_MAP__ANY_ATTRIBUTE:
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
        result.append(", provides: ");
        result.append(provides);
        result.append(", anyAttribute: ");
        result.append(anyAttribute);
        result.append(')');
        return result.toString();
    }

} //IntentMapImpl
