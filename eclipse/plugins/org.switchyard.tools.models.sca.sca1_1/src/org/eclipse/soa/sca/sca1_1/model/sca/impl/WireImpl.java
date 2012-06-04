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

import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.Wire;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.WireImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.WireImpl#isReplace <em>Replace</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.WireImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.WireImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.WireImpl#getSource2 <em>Source2</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.WireImpl#getTarget2 <em>Target2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WireImpl extends CommonExtensionBaseImpl implements Wire {
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
     * The default value of the '{@link #isReplace() <em>Replace</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isReplace()
     * @generated
     * @ordered
     */
	protected static final boolean REPLACE_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isReplace() <em>Replace</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isReplace()
     * @generated
     * @ordered
     */
	protected boolean replace = REPLACE_EDEFAULT;

	/**
     * This is true if the Replace attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean replaceESet;

	/**
     * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
	protected static final String SOURCE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
	protected String source = SOURCE_EDEFAULT;

	/**
     * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
	protected static final String TARGET_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
	protected String target = TARGET_EDEFAULT;

	/**
     * The cached value of the '{@link #getSource2() <em>Source2</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSource2()
     * @generated
     * @ordered
     */
	protected ComponentReference source2;

	/**
     * The cached value of the '{@link #getTarget2() <em>Target2</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTarget2()
     * @generated
     * @ordered
     */
	protected ComponentService target2;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected WireImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getWire();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAny() {
        if (any == null) {
            any = new BasicFeatureMap(this, ScaPackage.WIRE__ANY);
        }
        return any;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isReplace() {
        return replace;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setReplace(boolean newReplace) {
        boolean oldReplace = replace;
        replace = newReplace;
        boolean oldReplaceESet = replaceESet;
        replaceESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.WIRE__REPLACE, oldReplace, replace, !oldReplaceESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetReplace() {
        boolean oldReplace = replace;
        boolean oldReplaceESet = replaceESet;
        replace = REPLACE_EDEFAULT;
        replaceESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.WIRE__REPLACE, oldReplace, REPLACE_EDEFAULT, oldReplaceESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetReplace() {
        return replaceESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getSource() {
        return source;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSource(String newSource) {
        String oldSource = source;
        source = newSource;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.WIRE__SOURCE, oldSource, source));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getTarget() {
        return target;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTarget(String newTarget) {
        String oldTarget = target;
        target = newTarget;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.WIRE__TARGET, oldTarget, target));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ComponentReference getSource2() {
        if (source2 != null && source2.eIsProxy()) {
            InternalEObject oldSource2 = (InternalEObject)source2;
            source2 = (ComponentReference)eResolveProxy(oldSource2);
            if (source2 != oldSource2) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScaPackage.WIRE__SOURCE2, oldSource2, source2));
            }
        }
        return source2;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ComponentReference basicGetSource2() {
        return source2;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSource2(ComponentReference newSource2) {
        ComponentReference oldSource2 = source2;
        source2 = newSource2;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.WIRE__SOURCE2, oldSource2, source2));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ComponentService getTarget2() {
        if (target2 != null && target2.eIsProxy()) {
            InternalEObject oldTarget2 = (InternalEObject)target2;
            target2 = (ComponentService)eResolveProxy(oldTarget2);
            if (target2 != oldTarget2) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScaPackage.WIRE__TARGET2, oldTarget2, target2));
            }
        }
        return target2;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ComponentService basicGetTarget2() {
        return target2;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTarget2(ComponentService newTarget2) {
        ComponentService oldTarget2 = target2;
        target2 = newTarget2;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.WIRE__TARGET2, oldTarget2, target2));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScaPackage.WIRE__ANY:
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
            case ScaPackage.WIRE__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case ScaPackage.WIRE__REPLACE:
                return isReplace();
            case ScaPackage.WIRE__SOURCE:
                return getSource();
            case ScaPackage.WIRE__TARGET:
                return getTarget();
            case ScaPackage.WIRE__SOURCE2:
                if (resolve) return getSource2();
                return basicGetSource2();
            case ScaPackage.WIRE__TARGET2:
                if (resolve) return getTarget2();
                return basicGetTarget2();
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
            case ScaPackage.WIRE__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case ScaPackage.WIRE__REPLACE:
                setReplace((Boolean)newValue);
                return;
            case ScaPackage.WIRE__SOURCE:
                setSource((String)newValue);
                return;
            case ScaPackage.WIRE__TARGET:
                setTarget((String)newValue);
                return;
            case ScaPackage.WIRE__SOURCE2:
                setSource2((ComponentReference)newValue);
                return;
            case ScaPackage.WIRE__TARGET2:
                setTarget2((ComponentService)newValue);
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
            case ScaPackage.WIRE__ANY:
                getAny().clear();
                return;
            case ScaPackage.WIRE__REPLACE:
                unsetReplace();
                return;
            case ScaPackage.WIRE__SOURCE:
                setSource(SOURCE_EDEFAULT);
                return;
            case ScaPackage.WIRE__TARGET:
                setTarget(TARGET_EDEFAULT);
                return;
            case ScaPackage.WIRE__SOURCE2:
                setSource2((ComponentReference)null);
                return;
            case ScaPackage.WIRE__TARGET2:
                setTarget2((ComponentService)null);
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
            case ScaPackage.WIRE__ANY:
                return any != null && !any.isEmpty();
            case ScaPackage.WIRE__REPLACE:
                return isSetReplace();
            case ScaPackage.WIRE__SOURCE:
                return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
            case ScaPackage.WIRE__TARGET:
                return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
            case ScaPackage.WIRE__SOURCE2:
                return source2 != null;
            case ScaPackage.WIRE__TARGET2:
                return target2 != null;
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
        result.append(", replace: ");
        if (replaceESet) result.append(replace); else result.append("<unset>");
        result.append(", source: ");
        result.append(source);
        result.append(", target: ");
        result.append(target);
        result.append(')');
        return result.toString();
    }

} //WireImpl
