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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.BindingProperty;
import org.eclipse.soa.sca.sca1_1.model.sca.JMSActivationSpec;
import org.eclipse.soa.sca.sca1_1.model.sca.JMSCreateResource;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JMS Activation Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSActivationSpecImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSActivationSpecImpl#getCreate <em>Create</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSActivationSpecImpl#getJndiName <em>Jndi Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JMSActivationSpecImpl extends EObjectImpl implements JMSActivationSpec {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingProperty> property;

	/**
	 * The default value of the '{@link #getCreate() <em>Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreate()
	 * @generated
	 * @ordered
	 */
	protected static final JMSCreateResource CREATE_EDEFAULT = JMSCreateResource.IF_NOT_EXIST;

	/**
	 * The cached value of the '{@link #getCreate() <em>Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreate()
	 * @generated
	 * @ordered
	 */
	protected JMSCreateResource create = CREATE_EDEFAULT;

	/**
	 * This is true if the Create attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean createESet;

	/**
	 * The default value of the '{@link #getJndiName() <em>Jndi Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiName()
	 * @generated
	 * @ordered
	 */
	protected static final String JNDI_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJndiName() <em>Jndi Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiName()
	 * @generated
	 * @ordered
	 */
	protected String jndiName = JNDI_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JMSActivationSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScaPackage.eINSTANCE.getJMSActivationSpec();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindingProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<BindingProperty>(BindingProperty.class, this, ScaPackage.JMS_ACTIVATION_SPEC__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JMSCreateResource getCreate() {
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreate(JMSCreateResource newCreate) {
		JMSCreateResource oldCreate = create;
		create = newCreate == null ? CREATE_EDEFAULT : newCreate;
		boolean oldCreateESet = createESet;
		createESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_ACTIVATION_SPEC__CREATE, oldCreate, create, !oldCreateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCreate() {
		JMSCreateResource oldCreate = create;
		boolean oldCreateESet = createESet;
		create = CREATE_EDEFAULT;
		createESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.JMS_ACTIVATION_SPEC__CREATE, oldCreate, CREATE_EDEFAULT, oldCreateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCreate() {
		return createESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJndiName() {
		return jndiName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJndiName(String newJndiName) {
		String oldJndiName = jndiName;
		jndiName = newJndiName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_ACTIVATION_SPEC__JNDI_NAME, oldJndiName, jndiName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScaPackage.JMS_ACTIVATION_SPEC__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
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
			case ScaPackage.JMS_ACTIVATION_SPEC__PROPERTY:
				return getProperty();
			case ScaPackage.JMS_ACTIVATION_SPEC__CREATE:
				return getCreate();
			case ScaPackage.JMS_ACTIVATION_SPEC__JNDI_NAME:
				return getJndiName();
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
			case ScaPackage.JMS_ACTIVATION_SPEC__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends BindingProperty>)newValue);
				return;
			case ScaPackage.JMS_ACTIVATION_SPEC__CREATE:
				setCreate((JMSCreateResource)newValue);
				return;
			case ScaPackage.JMS_ACTIVATION_SPEC__JNDI_NAME:
				setJndiName((String)newValue);
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
			case ScaPackage.JMS_ACTIVATION_SPEC__PROPERTY:
				getProperty().clear();
				return;
			case ScaPackage.JMS_ACTIVATION_SPEC__CREATE:
				unsetCreate();
				return;
			case ScaPackage.JMS_ACTIVATION_SPEC__JNDI_NAME:
				setJndiName(JNDI_NAME_EDEFAULT);
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
			case ScaPackage.JMS_ACTIVATION_SPEC__PROPERTY:
				return property != null && !property.isEmpty();
			case ScaPackage.JMS_ACTIVATION_SPEC__CREATE:
				return isSetCreate();
			case ScaPackage.JMS_ACTIVATION_SPEC__JNDI_NAME:
				return JNDI_NAME_EDEFAULT == null ? jndiName != null : !JNDI_NAME_EDEFAULT.equals(jndiName);
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
		result.append(" (create: ");
		if (createESet) result.append(create); else result.append("<unset>");
		result.append(", jndiName: ");
		result.append(jndiName);
		result.append(')');
		return result.toString();
	}

} //JMSActivationSpecImpl
