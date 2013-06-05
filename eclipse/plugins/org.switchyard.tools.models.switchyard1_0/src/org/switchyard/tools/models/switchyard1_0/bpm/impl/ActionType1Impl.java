/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.bpm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.soa.sca.sca1_1.model.sca.impl.CommonExtensionBaseImpl;
import org.switchyard.tools.models.switchyard1_0.bpm.ActionType;

import org.switchyard.tools.models.switchyard1_0.bpm.ActionType1;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.GlobalsType;
import org.switchyard.tools.models.switchyard1_0.bpm.InputsType;
import org.switchyard.tools.models.switchyard1_0.bpm.OutputsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ActionType1Impl#getGlobals <em>Globals</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ActionType1Impl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ActionType1Impl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ActionType1Impl#getEventId <em>Event Id</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ActionType1Impl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ActionType1Impl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionType1Impl extends CommonExtensionBaseImpl implements ActionType1 {
	/**
     * The cached value of the '{@link #getGlobals() <em>Globals</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGlobals()
     * @generated
     * @ordered
     */
    protected GlobalsType globals;
    /**
     * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputs()
     * @generated
     * @ordered
     */
    protected InputsType inputs;
    /**
     * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputs()
     * @generated
     * @ordered
     */
    protected OutputsType outputs;
    /**
     * The default value of the '{@link #getEventId() <em>Event Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventId()
     * @generated
     * @ordered
     */
    protected static final String EVENT_ID_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getEventId() <em>Event Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventId()
     * @generated
     * @ordered
     */
    protected String eventId = EVENT_ID_EDEFAULT;
    /**
     * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperation()
     * @generated
     * @ordered
     */
    protected static final String OPERATION_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperation()
     * @generated
     * @ordered
     */
    protected String operation = OPERATION_EDEFAULT;
    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final ActionType TYPE_EDEFAULT = ActionType.STARTPROCESS;
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
        return BPMPackage.Literals.ACTION_TYPE1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalsType getGlobals() {
        return globals;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGlobals(GlobalsType newGlobals, NotificationChain msgs) {
        GlobalsType oldGlobals = globals;
        globals = newGlobals;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMPackage.ACTION_TYPE1__GLOBALS, oldGlobals, newGlobals);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGlobals(GlobalsType newGlobals) {
        if (newGlobals != globals) {
            NotificationChain msgs = null;
            if (globals != null)
                msgs = ((InternalEObject)globals).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMPackage.ACTION_TYPE1__GLOBALS, null, msgs);
            if (newGlobals != null)
                msgs = ((InternalEObject)newGlobals).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMPackage.ACTION_TYPE1__GLOBALS, null, msgs);
            msgs = basicSetGlobals(newGlobals, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.ACTION_TYPE1__GLOBALS, newGlobals, newGlobals));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputsType getInputs() {
        return inputs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInputs(InputsType newInputs, NotificationChain msgs) {
        InputsType oldInputs = inputs;
        inputs = newInputs;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMPackage.ACTION_TYPE1__INPUTS, oldInputs, newInputs);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInputs(InputsType newInputs) {
        if (newInputs != inputs) {
            NotificationChain msgs = null;
            if (inputs != null)
                msgs = ((InternalEObject)inputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMPackage.ACTION_TYPE1__INPUTS, null, msgs);
            if (newInputs != null)
                msgs = ((InternalEObject)newInputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMPackage.ACTION_TYPE1__INPUTS, null, msgs);
            msgs = basicSetInputs(newInputs, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.ACTION_TYPE1__INPUTS, newInputs, newInputs));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputsType getOutputs() {
        return outputs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOutputs(OutputsType newOutputs, NotificationChain msgs) {
        OutputsType oldOutputs = outputs;
        outputs = newOutputs;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMPackage.ACTION_TYPE1__OUTPUTS, oldOutputs, newOutputs);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutputs(OutputsType newOutputs) {
        if (newOutputs != outputs) {
            NotificationChain msgs = null;
            if (outputs != null)
                msgs = ((InternalEObject)outputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMPackage.ACTION_TYPE1__OUTPUTS, null, msgs);
            if (newOutputs != null)
                msgs = ((InternalEObject)newOutputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMPackage.ACTION_TYPE1__OUTPUTS, null, msgs);
            msgs = basicSetOutputs(newOutputs, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.ACTION_TYPE1__OUTPUTS, newOutputs, newOutputs));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEventId(String newEventId) {
        String oldEventId = eventId;
        eventId = newEventId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.ACTION_TYPE1__EVENT_ID, oldEventId, eventId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOperation() {
        return operation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOperation(String newOperation) {
        String oldOperation = operation;
        operation = newOperation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.ACTION_TYPE1__OPERATION, oldOperation, operation));
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
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.ACTION_TYPE1__TYPE, oldType, type, !oldTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetType() {
        ActionType oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, BPMPackage.ACTION_TYPE1__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
            case BPMPackage.ACTION_TYPE1__GLOBALS:
                return basicSetGlobals(null, msgs);
            case BPMPackage.ACTION_TYPE1__INPUTS:
                return basicSetInputs(null, msgs);
            case BPMPackage.ACTION_TYPE1__OUTPUTS:
                return basicSetOutputs(null, msgs);
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
            case BPMPackage.ACTION_TYPE1__GLOBALS:
                return getGlobals();
            case BPMPackage.ACTION_TYPE1__INPUTS:
                return getInputs();
            case BPMPackage.ACTION_TYPE1__OUTPUTS:
                return getOutputs();
            case BPMPackage.ACTION_TYPE1__EVENT_ID:
                return getEventId();
            case BPMPackage.ACTION_TYPE1__OPERATION:
                return getOperation();
            case BPMPackage.ACTION_TYPE1__TYPE:
                return getType();
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
            case BPMPackage.ACTION_TYPE1__GLOBALS:
                setGlobals((GlobalsType)newValue);
                return;
            case BPMPackage.ACTION_TYPE1__INPUTS:
                setInputs((InputsType)newValue);
                return;
            case BPMPackage.ACTION_TYPE1__OUTPUTS:
                setOutputs((OutputsType)newValue);
                return;
            case BPMPackage.ACTION_TYPE1__EVENT_ID:
                setEventId((String)newValue);
                return;
            case BPMPackage.ACTION_TYPE1__OPERATION:
                setOperation((String)newValue);
                return;
            case BPMPackage.ACTION_TYPE1__TYPE:
                setType((ActionType)newValue);
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
            case BPMPackage.ACTION_TYPE1__GLOBALS:
                setGlobals((GlobalsType)null);
                return;
            case BPMPackage.ACTION_TYPE1__INPUTS:
                setInputs((InputsType)null);
                return;
            case BPMPackage.ACTION_TYPE1__OUTPUTS:
                setOutputs((OutputsType)null);
                return;
            case BPMPackage.ACTION_TYPE1__EVENT_ID:
                setEventId(EVENT_ID_EDEFAULT);
                return;
            case BPMPackage.ACTION_TYPE1__OPERATION:
                setOperation(OPERATION_EDEFAULT);
                return;
            case BPMPackage.ACTION_TYPE1__TYPE:
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
            case BPMPackage.ACTION_TYPE1__GLOBALS:
                return globals != null;
            case BPMPackage.ACTION_TYPE1__INPUTS:
                return inputs != null;
            case BPMPackage.ACTION_TYPE1__OUTPUTS:
                return outputs != null;
            case BPMPackage.ACTION_TYPE1__EVENT_ID:
                return EVENT_ID_EDEFAULT == null ? eventId != null : !EVENT_ID_EDEFAULT.equals(eventId);
            case BPMPackage.ACTION_TYPE1__OPERATION:
                return OPERATION_EDEFAULT == null ? operation != null : !OPERATION_EDEFAULT.equals(operation);
            case BPMPackage.ACTION_TYPE1__TYPE:
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
        result.append(" (eventId: ");
        result.append(eventId);
        result.append(", operation: ");
        result.append(operation);
        result.append(", type: ");
        if (typeESet) result.append(type); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ActionType1Impl
