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
import org.eclipse.soa.sca.sca1_1.model.sca.JMSCreateResource;
import org.eclipse.soa.sca.sca1_1.model.sca.JMSDestination;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JMS Destination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSDestinationImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSDestinationImpl#getCreate <em>Create</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSDestinationImpl#getJndiName <em>Jndi Name</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.JMSDestinationImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JMSDestinationImpl extends EObjectImpl implements JMSDestination {
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
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
	protected static final TypeType TYPE_EDEFAULT = TypeType.QUEUE;

	/**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
	protected TypeType type = TYPE_EDEFAULT;

	/**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean typeESet;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected JMSDestinationImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getJMSDestination();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<BindingProperty> getProperty() {
        if (property == null) {
            property = new EObjectContainmentEList<BindingProperty>(BindingProperty.class, this, ScaPackage.JMS_DESTINATION__PROPERTY);
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_DESTINATION__CREATE, oldCreate, create, !oldCreateESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.JMS_DESTINATION__CREATE, oldCreate, CREATE_EDEFAULT, oldCreateESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_DESTINATION__JNDI_NAME, oldJndiName, jndiName));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TypeType getType() {
        return type;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setType(TypeType newType) {
        TypeType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.JMS_DESTINATION__TYPE, oldType, type, !oldTypeESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetType() {
        TypeType oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.JMS_DESTINATION__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetType() {
        return typeESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScaPackage.JMS_DESTINATION__PROPERTY:
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
            case ScaPackage.JMS_DESTINATION__PROPERTY:
                return getProperty();
            case ScaPackage.JMS_DESTINATION__CREATE:
                return getCreate();
            case ScaPackage.JMS_DESTINATION__JNDI_NAME:
                return getJndiName();
            case ScaPackage.JMS_DESTINATION__TYPE:
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
            case ScaPackage.JMS_DESTINATION__PROPERTY:
                getProperty().clear();
                getProperty().addAll((Collection<? extends BindingProperty>)newValue);
                return;
            case ScaPackage.JMS_DESTINATION__CREATE:
                setCreate((JMSCreateResource)newValue);
                return;
            case ScaPackage.JMS_DESTINATION__JNDI_NAME:
                setJndiName((String)newValue);
                return;
            case ScaPackage.JMS_DESTINATION__TYPE:
                setType((TypeType)newValue);
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
            case ScaPackage.JMS_DESTINATION__PROPERTY:
                getProperty().clear();
                return;
            case ScaPackage.JMS_DESTINATION__CREATE:
                unsetCreate();
                return;
            case ScaPackage.JMS_DESTINATION__JNDI_NAME:
                setJndiName(JNDI_NAME_EDEFAULT);
                return;
            case ScaPackage.JMS_DESTINATION__TYPE:
                unsetType();
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
            case ScaPackage.JMS_DESTINATION__PROPERTY:
                return property != null && !property.isEmpty();
            case ScaPackage.JMS_DESTINATION__CREATE:
                return isSetCreate();
            case ScaPackage.JMS_DESTINATION__JNDI_NAME:
                return JNDI_NAME_EDEFAULT == null ? jndiName != null : !JNDI_NAME_EDEFAULT.equals(jndiName);
            case ScaPackage.JMS_DESTINATION__TYPE:
                return isSetType();
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
        result.append(", type: ");
        if (typeESet) result.append(type); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //JMSDestinationImpl
