/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingProperty;
import org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingService;
import org.eclipse.soa.sca.sca1_1.model.sca.ConstrainingType;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraining Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ConstrainingTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ConstrainingTypeImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ConstrainingTypeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ConstrainingTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ConstrainingTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ConstrainingTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ConstrainingTypeImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstrainingTypeImpl extends CommonExtensionBaseImpl implements ConstrainingType {
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
     * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAny()
     * @generated
     * @ordered
     */
	protected FeatureMap any;

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
     * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTargetNamespace()
     * @generated
     * @ordered
     */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTargetNamespace()
     * @generated
     * @ordered
     */
	protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ConstrainingTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getConstrainingType();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, ScaPackage.CONSTRAINING_TYPE__GROUP);
        }
        return group;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ConstrainingService> getService() {
        return getGroup().list(ScaPackage.eINSTANCE.getConstrainingType_Service());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ConstrainingReference> getReference() {
        return getGroup().list(ScaPackage.eINSTANCE.getConstrainingType_Reference());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ConstrainingProperty> getProperty() {
        return getGroup().list(ScaPackage.eINSTANCE.getConstrainingType_Property());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAny() {
        if (any == null) {
            any = new BasicFeatureMap(this, ScaPackage.CONSTRAINING_TYPE__ANY);
        }
        return any;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CONSTRAINING_TYPE__NAME, oldName, name));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getTargetNamespace() {
        return targetNamespace;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTargetNamespace(String newTargetNamespace) {
        String oldTargetNamespace = targetNamespace;
        targetNamespace = newTargetNamespace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.CONSTRAINING_TYPE__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScaPackage.CONSTRAINING_TYPE__GROUP:
                return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
            case ScaPackage.CONSTRAINING_TYPE__SERVICE:
                return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
            case ScaPackage.CONSTRAINING_TYPE__REFERENCE:
                return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
            case ScaPackage.CONSTRAINING_TYPE__PROPERTY:
                return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
            case ScaPackage.CONSTRAINING_TYPE__ANY:
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
            case ScaPackage.CONSTRAINING_TYPE__GROUP:
                if (coreType) return getGroup();
                return ((FeatureMap.Internal)getGroup()).getWrapper();
            case ScaPackage.CONSTRAINING_TYPE__SERVICE:
                return getService();
            case ScaPackage.CONSTRAINING_TYPE__REFERENCE:
                return getReference();
            case ScaPackage.CONSTRAINING_TYPE__PROPERTY:
                return getProperty();
            case ScaPackage.CONSTRAINING_TYPE__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case ScaPackage.CONSTRAINING_TYPE__NAME:
                return getName();
            case ScaPackage.CONSTRAINING_TYPE__TARGET_NAMESPACE:
                return getTargetNamespace();
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
            case ScaPackage.CONSTRAINING_TYPE__GROUP:
                ((FeatureMap.Internal)getGroup()).set(newValue);
                return;
            case ScaPackage.CONSTRAINING_TYPE__SERVICE:
                getService().clear();
                getService().addAll((Collection<? extends ConstrainingService>)newValue);
                return;
            case ScaPackage.CONSTRAINING_TYPE__REFERENCE:
                getReference().clear();
                getReference().addAll((Collection<? extends ConstrainingReference>)newValue);
                return;
            case ScaPackage.CONSTRAINING_TYPE__PROPERTY:
                getProperty().clear();
                getProperty().addAll((Collection<? extends ConstrainingProperty>)newValue);
                return;
            case ScaPackage.CONSTRAINING_TYPE__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case ScaPackage.CONSTRAINING_TYPE__NAME:
                setName((String)newValue);
                return;
            case ScaPackage.CONSTRAINING_TYPE__TARGET_NAMESPACE:
                setTargetNamespace((String)newValue);
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
            case ScaPackage.CONSTRAINING_TYPE__GROUP:
                getGroup().clear();
                return;
            case ScaPackage.CONSTRAINING_TYPE__SERVICE:
                getService().clear();
                return;
            case ScaPackage.CONSTRAINING_TYPE__REFERENCE:
                getReference().clear();
                return;
            case ScaPackage.CONSTRAINING_TYPE__PROPERTY:
                getProperty().clear();
                return;
            case ScaPackage.CONSTRAINING_TYPE__ANY:
                getAny().clear();
                return;
            case ScaPackage.CONSTRAINING_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ScaPackage.CONSTRAINING_TYPE__TARGET_NAMESPACE:
                setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
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
            case ScaPackage.CONSTRAINING_TYPE__GROUP:
                return group != null && !group.isEmpty();
            case ScaPackage.CONSTRAINING_TYPE__SERVICE:
                return !getService().isEmpty();
            case ScaPackage.CONSTRAINING_TYPE__REFERENCE:
                return !getReference().isEmpty();
            case ScaPackage.CONSTRAINING_TYPE__PROPERTY:
                return !getProperty().isEmpty();
            case ScaPackage.CONSTRAINING_TYPE__ANY:
                return any != null && !any.isEmpty();
            case ScaPackage.CONSTRAINING_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ScaPackage.CONSTRAINING_TYPE__TARGET_NAMESPACE:
                return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
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
        result.append(", any: ");
        result.append(any);
        result.append(", name: ");
        result.append(name);
        result.append(", targetNamespace: ");
        result.append(targetNamespace);
        result.append(')');
        return result.toString();
    }

} //ConstrainingTypeImpl
