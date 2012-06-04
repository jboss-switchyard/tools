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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentType;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentTypeReference;
import org.eclipse.soa.sca.sca1_1.model.sca.Property;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentTypeImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentTypeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentTypeImpl#getConstrainingType <em>Constraining Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentTypeImpl extends CommonExtensionBaseImpl implements ComponentType {
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
     * The default value of the '{@link #getConstrainingType() <em>Constraining Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getConstrainingType()
     * @generated
     * @ordered
     */
	protected static final QName CONSTRAINING_TYPE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getConstrainingType() <em>Constraining Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getConstrainingType()
     * @generated
     * @ordered
     */
	protected QName constrainingType = CONSTRAINING_TYPE_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ComponentTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getComponentType();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, ScaPackage.COMPONENT_TYPE__GROUP);
        }
        return group;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ComponentService> getService() {
        return getGroup().list(ScaPackage.eINSTANCE.getComponentType_Service());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ComponentTypeReference> getReference() {
        return getGroup().list(ScaPackage.eINSTANCE.getComponentType_Reference());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Property> getProperty() {
        return getGroup().list(ScaPackage.eINSTANCE.getComponentType_Property());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAny() {
        if (any == null) {
            any = new BasicFeatureMap(this, ScaPackage.COMPONENT_TYPE__ANY);
        }
        return any;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public QName getConstrainingType() {
        return constrainingType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setConstrainingType(QName newConstrainingType) {
        QName oldConstrainingType = constrainingType;
        constrainingType = newConstrainingType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.COMPONENT_TYPE__CONSTRAINING_TYPE, oldConstrainingType, constrainingType));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScaPackage.COMPONENT_TYPE__GROUP:
                return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
            case ScaPackage.COMPONENT_TYPE__SERVICE:
                return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
            case ScaPackage.COMPONENT_TYPE__REFERENCE:
                return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
            case ScaPackage.COMPONENT_TYPE__PROPERTY:
                return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
            case ScaPackage.COMPONENT_TYPE__ANY:
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
            case ScaPackage.COMPONENT_TYPE__GROUP:
                if (coreType) return getGroup();
                return ((FeatureMap.Internal)getGroup()).getWrapper();
            case ScaPackage.COMPONENT_TYPE__SERVICE:
                return getService();
            case ScaPackage.COMPONENT_TYPE__REFERENCE:
                return getReference();
            case ScaPackage.COMPONENT_TYPE__PROPERTY:
                return getProperty();
            case ScaPackage.COMPONENT_TYPE__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case ScaPackage.COMPONENT_TYPE__CONSTRAINING_TYPE:
                return getConstrainingType();
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
            case ScaPackage.COMPONENT_TYPE__GROUP:
                ((FeatureMap.Internal)getGroup()).set(newValue);
                return;
            case ScaPackage.COMPONENT_TYPE__SERVICE:
                getService().clear();
                getService().addAll((Collection<? extends ComponentService>)newValue);
                return;
            case ScaPackage.COMPONENT_TYPE__REFERENCE:
                getReference().clear();
                getReference().addAll((Collection<? extends ComponentTypeReference>)newValue);
                return;
            case ScaPackage.COMPONENT_TYPE__PROPERTY:
                getProperty().clear();
                getProperty().addAll((Collection<? extends Property>)newValue);
                return;
            case ScaPackage.COMPONENT_TYPE__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case ScaPackage.COMPONENT_TYPE__CONSTRAINING_TYPE:
                setConstrainingType((QName)newValue);
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
            case ScaPackage.COMPONENT_TYPE__GROUP:
                getGroup().clear();
                return;
            case ScaPackage.COMPONENT_TYPE__SERVICE:
                getService().clear();
                return;
            case ScaPackage.COMPONENT_TYPE__REFERENCE:
                getReference().clear();
                return;
            case ScaPackage.COMPONENT_TYPE__PROPERTY:
                getProperty().clear();
                return;
            case ScaPackage.COMPONENT_TYPE__ANY:
                getAny().clear();
                return;
            case ScaPackage.COMPONENT_TYPE__CONSTRAINING_TYPE:
                setConstrainingType(CONSTRAINING_TYPE_EDEFAULT);
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
            case ScaPackage.COMPONENT_TYPE__GROUP:
                return group != null && !group.isEmpty();
            case ScaPackage.COMPONENT_TYPE__SERVICE:
                return !getService().isEmpty();
            case ScaPackage.COMPONENT_TYPE__REFERENCE:
                return !getReference().isEmpty();
            case ScaPackage.COMPONENT_TYPE__PROPERTY:
                return !getProperty().isEmpty();
            case ScaPackage.COMPONENT_TYPE__ANY:
                return any != null && !any.isEmpty();
            case ScaPackage.COMPONENT_TYPE__CONSTRAINING_TYPE:
                return CONSTRAINING_TYPE_EDEFAULT == null ? constrainingType != null : !CONSTRAINING_TYPE_EDEFAULT.equals(constrainingType);
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
        result.append(", constrainingType: ");
        result.append(constrainingType);
        result.append(')');
        return result.toString();
    }

} //ComponentTypeImpl
