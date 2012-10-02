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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.JavaImplementation;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JavaImplementationImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JavaImplementationImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JavaImplementationImpl#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaImplementationImpl extends ImplementationImpl implements JavaImplementation {
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
     * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getClass_()
     * @generated
     * @ordered
     */
	protected static final String CLASS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getClass_()
     * @generated
     * @ordered
     */
	protected String class_ = CLASS_EDEFAULT;

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
	protected JavaImplementationImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getJavaImplementation();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAny() {
        if (any == null) {
            any = new BasicFeatureMap(this, ScaPackage.JAVA_IMPLEMENTATION__ANY);
        }
        return any;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getClass_() {
        return class_;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setClass(String newClass) {
        String oldClass = class_;
        class_ = newClass;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JAVA_IMPLEMENTATION__CLASS, oldClass, class_));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute1() {
        if (anyAttribute1 == null) {
            anyAttribute1 = new BasicFeatureMap(this, ScaPackage.JAVA_IMPLEMENTATION__ANY_ATTRIBUTE1);
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
            case ScaPackage.JAVA_IMPLEMENTATION__ANY:
                return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
            case ScaPackage.JAVA_IMPLEMENTATION__ANY_ATTRIBUTE1:
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
            case ScaPackage.JAVA_IMPLEMENTATION__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case ScaPackage.JAVA_IMPLEMENTATION__CLASS:
                return getClass_();
            case ScaPackage.JAVA_IMPLEMENTATION__ANY_ATTRIBUTE1:
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
            case ScaPackage.JAVA_IMPLEMENTATION__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case ScaPackage.JAVA_IMPLEMENTATION__CLASS:
                setClass((String)newValue);
                return;
            case ScaPackage.JAVA_IMPLEMENTATION__ANY_ATTRIBUTE1:
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
            case ScaPackage.JAVA_IMPLEMENTATION__ANY:
                getAny().clear();
                return;
            case ScaPackage.JAVA_IMPLEMENTATION__CLASS:
                setClass(CLASS_EDEFAULT);
                return;
            case ScaPackage.JAVA_IMPLEMENTATION__ANY_ATTRIBUTE1:
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
            case ScaPackage.JAVA_IMPLEMENTATION__ANY:
                return any != null && !any.isEmpty();
            case ScaPackage.JAVA_IMPLEMENTATION__CLASS:
                return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
            case ScaPackage.JAVA_IMPLEMENTATION__ANY_ATTRIBUTE1:
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
        result.append(", class: ");
        result.append(class_);
        result.append(", anyAttribute1: ");
        result.append(anyAttribute1);
        result.append(')');
        return result.toString();
    }

} //JavaImplementationImpl
