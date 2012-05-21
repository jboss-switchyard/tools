/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.rules.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.soa.sca.sca1_1.model.sca.impl.CommonExtensionBaseImpl;
import org.switchyard.tools.models.switchyard1_0.rules.ActionType;

import org.switchyard.tools.models.switchyard1_0.rules.ActionType1;
import org.switchyard.tools.models.switchyard1_0.rules.RulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ActionType1Impl#getName <em>Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ActionType1Impl#getType <em>Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ActionType1Impl#getEventType <em>Event Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionType1Impl extends CommonExtensionBaseImpl implements ActionType1 {
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
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final ActionType TYPE_EDEFAULT = ActionType.EXECUTE;
    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected ActionType type = TYPE_EDEFAULT;
    /**
     * The default value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventType()
     * @generated
     * @ordered
     */
    protected static final String EVENT_TYPE_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventType()
     * @generated
     * @ordered
     */
    protected String eventType = EVENT_TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ActionType1Impl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return RulesPackage.Literals.ACTION_TYPE1;
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
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.ACTION_TYPE1__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(ActionType newType) {
        ActionType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.ACTION_TYPE1__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEventType(String newEventType) {
        String oldEventType = eventType;
        eventType = newEventType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.ACTION_TYPE1__EVENT_TYPE, oldEventType, eventType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RulesPackage.ACTION_TYPE1__NAME:
                return getName();
            case RulesPackage.ACTION_TYPE1__TYPE:
                return getType();
            case RulesPackage.ACTION_TYPE1__EVENT_TYPE:
                return getEventType();
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
            case RulesPackage.ACTION_TYPE1__NAME:
                setName((String)newValue);
                return;
            case RulesPackage.ACTION_TYPE1__TYPE:
                setType((ActionType)newValue);
                return;
            case RulesPackage.ACTION_TYPE1__EVENT_TYPE:
                setEventType((String)newValue);
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
            case RulesPackage.ACTION_TYPE1__NAME:
                setName(NAME_EDEFAULT);
                return;
            case RulesPackage.ACTION_TYPE1__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case RulesPackage.ACTION_TYPE1__EVENT_TYPE:
                setEventType(EVENT_TYPE_EDEFAULT);
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
            case RulesPackage.ACTION_TYPE1__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case RulesPackage.ACTION_TYPE1__TYPE:
                return type != TYPE_EDEFAULT;
            case RulesPackage.ACTION_TYPE1__EVENT_TYPE:
                return EVENT_TYPE_EDEFAULT == null ? eventType != null : !EVENT_TYPE_EDEFAULT.equals(eventType);
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
        result.append(" (name: ");
        result.append(name);
        result.append(", type: ");
        result.append(type);
        result.append(", eventType: ");
        result.append(eventType);
        result.append(')');
        return result.toString();
    }

} //ActionType1Impl
