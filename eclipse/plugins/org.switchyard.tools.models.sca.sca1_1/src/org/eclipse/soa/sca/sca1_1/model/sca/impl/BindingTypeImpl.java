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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.BindingType;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.BindingTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.BindingTypeImpl#getAlwaysProvides <em>Always Provides</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.BindingTypeImpl#getMayProvide <em>May Provide</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.BindingTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingTypeImpl extends CommonExtensionBaseImpl implements BindingType {
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
     * The default value of the '{@link #getAlwaysProvides() <em>Always Provides</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAlwaysProvides()
     * @generated
     * @ordered
     */
	protected static final List<QName> ALWAYS_PROVIDES_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getAlwaysProvides() <em>Always Provides</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAlwaysProvides()
     * @generated
     * @ordered
     */
	protected List<QName> alwaysProvides = ALWAYS_PROVIDES_EDEFAULT;

	/**
     * The default value of the '{@link #getMayProvide() <em>May Provide</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMayProvide()
     * @generated
     * @ordered
     */
	protected static final List<QName> MAY_PROVIDE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getMayProvide() <em>May Provide</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMayProvide()
     * @generated
     * @ordered
     */
	protected List<QName> mayProvide = MAY_PROVIDE_EDEFAULT;

	/**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
	protected static final QName TYPE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
	protected QName type = TYPE_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected BindingTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getBindingType();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAny() {
        if (any == null) {
            any = new BasicFeatureMap(this, ScaPackage.BINDING_TYPE__ANY);
        }
        return any;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public List<QName> getAlwaysProvides() {
        return alwaysProvides;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAlwaysProvides(List<QName> newAlwaysProvides) {
        List<QName> oldAlwaysProvides = alwaysProvides;
        alwaysProvides = newAlwaysProvides;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.BINDING_TYPE__ALWAYS_PROVIDES, oldAlwaysProvides, alwaysProvides));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public List<QName> getMayProvide() {
        return mayProvide;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMayProvide(List<QName> newMayProvide) {
        List<QName> oldMayProvide = mayProvide;
        mayProvide = newMayProvide;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.BINDING_TYPE__MAY_PROVIDE, oldMayProvide, mayProvide));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public QName getType() {
        return type;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setType(QName newType) {
        QName oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.BINDING_TYPE__TYPE, oldType, type));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScaPackage.BINDING_TYPE__ANY:
                return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
            case ScaPackage.BINDING_TYPE__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case ScaPackage.BINDING_TYPE__ALWAYS_PROVIDES:
                return getAlwaysProvides();
            case ScaPackage.BINDING_TYPE__MAY_PROVIDE:
                return getMayProvide();
            case ScaPackage.BINDING_TYPE__TYPE:
                return getType();
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
            case ScaPackage.BINDING_TYPE__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case ScaPackage.BINDING_TYPE__ALWAYS_PROVIDES:
                setAlwaysProvides((List<QName>)newValue);
                return;
            case ScaPackage.BINDING_TYPE__MAY_PROVIDE:
                setMayProvide((List<QName>)newValue);
                return;
            case ScaPackage.BINDING_TYPE__TYPE:
                setType((QName)newValue);
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
            case ScaPackage.BINDING_TYPE__ANY:
                getAny().clear();
                return;
            case ScaPackage.BINDING_TYPE__ALWAYS_PROVIDES:
                setAlwaysProvides(ALWAYS_PROVIDES_EDEFAULT);
                return;
            case ScaPackage.BINDING_TYPE__MAY_PROVIDE:
                setMayProvide(MAY_PROVIDE_EDEFAULT);
                return;
            case ScaPackage.BINDING_TYPE__TYPE:
                setType(TYPE_EDEFAULT);
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
            case ScaPackage.BINDING_TYPE__ANY:
                return any != null && !any.isEmpty();
            case ScaPackage.BINDING_TYPE__ALWAYS_PROVIDES:
                return ALWAYS_PROVIDES_EDEFAULT == null ? alwaysProvides != null : !ALWAYS_PROVIDES_EDEFAULT.equals(alwaysProvides);
            case ScaPackage.BINDING_TYPE__MAY_PROVIDE:
                return MAY_PROVIDE_EDEFAULT == null ? mayProvide != null : !MAY_PROVIDE_EDEFAULT.equals(mayProvide);
            case ScaPackage.BINDING_TYPE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
        result.append(", alwaysProvides: ");
        result.append(alwaysProvides);
        result.append(", mayProvide: ");
        result.append(mayProvide);
        result.append(", type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

} //BindingTypeImpl
