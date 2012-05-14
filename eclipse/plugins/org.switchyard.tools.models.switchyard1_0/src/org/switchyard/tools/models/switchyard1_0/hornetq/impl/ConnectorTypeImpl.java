/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.hornetq.impl;

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

import org.switchyard.tools.models.switchyard1_0.hornetq.ConnectorType;
import org.switchyard.tools.models.switchyard1_0.hornetq.HornetQPackage;
import org.switchyard.tools.models.switchyard1_0.hornetq.PropertiesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConnectorTypeImpl#getFactoryClass <em>Factory Class</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConnectorTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.hornetq.impl.ConnectorTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorTypeImpl extends EObjectImpl implements ConnectorType {
	/**
     * The default value of the '{@link #getFactoryClass() <em>Factory Class</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFactoryClass()
     * @generated
     * @ordered
     */
	protected static final String FACTORY_CLASS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getFactoryClass() <em>Factory Class</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFactoryClass()
     * @generated
     * @ordered
     */
	protected String factoryClass = FACTORY_CLASS_EDEFAULT;

	/**
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
	protected EList<PropertiesType> properties;

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
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ConnectorTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return HornetQPackage.Literals.CONNECTOR_TYPE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getFactoryClass() {
        return factoryClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFactoryClass(String newFactoryClass) {
        String oldFactoryClass = factoryClass;
        factoryClass = newFactoryClass;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONNECTOR_TYPE__FACTORY_CLASS, oldFactoryClass, factoryClass));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<PropertiesType> getProperties() {
        if (properties == null) {
            properties = new EObjectContainmentEList<PropertiesType>(PropertiesType.class, this, HornetQPackage.CONNECTOR_TYPE__PROPERTIES);
        }
        return properties;
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
            eNotify(new ENotificationImpl(this, Notification.SET, HornetQPackage.CONNECTOR_TYPE__NAME, oldName, name));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case HornetQPackage.CONNECTOR_TYPE__PROPERTIES:
                return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
            case HornetQPackage.CONNECTOR_TYPE__FACTORY_CLASS:
                return getFactoryClass();
            case HornetQPackage.CONNECTOR_TYPE__PROPERTIES:
                return getProperties();
            case HornetQPackage.CONNECTOR_TYPE__NAME:
                return getName();
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
            case HornetQPackage.CONNECTOR_TYPE__FACTORY_CLASS:
                setFactoryClass((String)newValue);
                return;
            case HornetQPackage.CONNECTOR_TYPE__PROPERTIES:
                getProperties().clear();
                getProperties().addAll((Collection<? extends PropertiesType>)newValue);
                return;
            case HornetQPackage.CONNECTOR_TYPE__NAME:
                setName((String)newValue);
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
            case HornetQPackage.CONNECTOR_TYPE__FACTORY_CLASS:
                setFactoryClass(FACTORY_CLASS_EDEFAULT);
                return;
            case HornetQPackage.CONNECTOR_TYPE__PROPERTIES:
                getProperties().clear();
                return;
            case HornetQPackage.CONNECTOR_TYPE__NAME:
                setName(NAME_EDEFAULT);
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
            case HornetQPackage.CONNECTOR_TYPE__FACTORY_CLASS:
                return FACTORY_CLASS_EDEFAULT == null ? factoryClass != null : !FACTORY_CLASS_EDEFAULT.equals(factoryClass);
            case HornetQPackage.CONNECTOR_TYPE__PROPERTIES:
                return properties != null && !properties.isEmpty();
            case HornetQPackage.CONNECTOR_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
        result.append(" (factoryClass: ");
        result.append(factoryClass);
        result.append(", name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //ConnectorTypeImpl
