/**
 */
package org.switchyard.tools.models.switchyard1_0.soap.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.soa.sca.sca1_1.model.sca.impl.CommonExtensionBaseImpl;

import org.switchyard.tools.models.switchyard1_0.soap.PropertyType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.PropertyTypeImpl#getPropName <em>Prop Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.PropertyTypeImpl#getPropValue <em>Prop Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyTypeImpl extends CommonExtensionBaseImpl implements PropertyType {
    /**
     * The default value of the '{@link #getPropName() <em>Prop Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPropName()
     * @generated
     * @ordered
     */
    protected static final String PROP_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPropName() <em>Prop Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPropName()
     * @generated
     * @ordered
     */
    protected String propName = PROP_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getPropValue() <em>Prop Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPropValue()
     * @generated
     * @ordered
     */
    protected static final String PROP_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPropValue() <em>Prop Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPropValue()
     * @generated
     * @ordered
     */
    protected String propValue = PROP_VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PropertyTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SOAPPackage.Literals.PROPERTY_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPropName() {
        return propName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPropName(String newPropName) {
        String oldPropName = propName;
        propName = newPropName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.PROPERTY_TYPE__PROP_NAME, oldPropName, propName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPropValue() {
        return propValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPropValue(String newPropValue) {
        String oldPropValue = propValue;
        propValue = newPropValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.PROPERTY_TYPE__PROP_VALUE, oldPropValue, propValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SOAPPackage.PROPERTY_TYPE__PROP_NAME:
                return getPropName();
            case SOAPPackage.PROPERTY_TYPE__PROP_VALUE:
                return getPropValue();
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
            case SOAPPackage.PROPERTY_TYPE__PROP_NAME:
                setPropName((String)newValue);
                return;
            case SOAPPackage.PROPERTY_TYPE__PROP_VALUE:
                setPropValue((String)newValue);
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
            case SOAPPackage.PROPERTY_TYPE__PROP_NAME:
                setPropName(PROP_NAME_EDEFAULT);
                return;
            case SOAPPackage.PROPERTY_TYPE__PROP_VALUE:
                setPropValue(PROP_VALUE_EDEFAULT);
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
            case SOAPPackage.PROPERTY_TYPE__PROP_NAME:
                return PROP_NAME_EDEFAULT == null ? propName != null : !PROP_NAME_EDEFAULT.equals(propName);
            case SOAPPackage.PROPERTY_TYPE__PROP_VALUE:
                return PROP_VALUE_EDEFAULT == null ? propValue != null : !PROP_VALUE_EDEFAULT.equals(propValue);
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
        result.append(" (propName: ");
        result.append(propName);
        result.append(", propValue: ");
        result.append(propValue);
        result.append(')');
        return result.toString();
    }

} //PropertyTypeImpl
