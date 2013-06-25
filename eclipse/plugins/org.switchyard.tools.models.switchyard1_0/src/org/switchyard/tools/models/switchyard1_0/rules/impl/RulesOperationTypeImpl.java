/**
 */
package org.switchyard.tools.models.switchyard1_0.rules.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.soa.sca.sca1_1.model.sca.impl.CommonExtensionBaseImpl;

import org.switchyard.tools.models.switchyard1_0.rules.FaultsType;
import org.switchyard.tools.models.switchyard1_0.rules.GlobalsType;
import org.switchyard.tools.models.switchyard1_0.rules.InputsType;
import org.switchyard.tools.models.switchyard1_0.rules.OperationType;
import org.switchyard.tools.models.switchyard1_0.rules.OutputsType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RulesOperationTypeImpl#getGlobals <em>Globals</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RulesOperationTypeImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RulesOperationTypeImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RulesOperationTypeImpl#getFaults <em>Faults</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RulesOperationTypeImpl#getEventId <em>Event Id</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RulesOperationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RulesOperationTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RulesOperationTypeImpl extends CommonExtensionBaseImpl implements RulesOperationType {
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
     * The cached value of the '{@link #getFaults() <em>Faults</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFaults()
     * @generated
     * @ordered
     */
    protected FaultsType faults;

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
    protected static final OperationType TYPE_EDEFAULT = OperationType.EXECUTE;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected OperationType type = TYPE_EDEFAULT;

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
    protected RulesOperationTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RulesPackage.Literals.RULES_OPERATION_TYPE;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_OPERATION_TYPE__GLOBALS, oldGlobals, newGlobals);
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
                msgs = ((InternalEObject)globals).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULES_OPERATION_TYPE__GLOBALS, null, msgs);
            if (newGlobals != null)
                msgs = ((InternalEObject)newGlobals).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULES_OPERATION_TYPE__GLOBALS, null, msgs);
            msgs = basicSetGlobals(newGlobals, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_OPERATION_TYPE__GLOBALS, newGlobals, newGlobals));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_OPERATION_TYPE__INPUTS, oldInputs, newInputs);
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
                msgs = ((InternalEObject)inputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULES_OPERATION_TYPE__INPUTS, null, msgs);
            if (newInputs != null)
                msgs = ((InternalEObject)newInputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULES_OPERATION_TYPE__INPUTS, null, msgs);
            msgs = basicSetInputs(newInputs, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_OPERATION_TYPE__INPUTS, newInputs, newInputs));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_OPERATION_TYPE__OUTPUTS, oldOutputs, newOutputs);
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
                msgs = ((InternalEObject)outputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULES_OPERATION_TYPE__OUTPUTS, null, msgs);
            if (newOutputs != null)
                msgs = ((InternalEObject)newOutputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULES_OPERATION_TYPE__OUTPUTS, null, msgs);
            msgs = basicSetOutputs(newOutputs, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_OPERATION_TYPE__OUTPUTS, newOutputs, newOutputs));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FaultsType getFaults() {
        return faults;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFaults(FaultsType newFaults, NotificationChain msgs) {
        FaultsType oldFaults = faults;
        faults = newFaults;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_OPERATION_TYPE__FAULTS, oldFaults, newFaults);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFaults(FaultsType newFaults) {
        if (newFaults != faults) {
            NotificationChain msgs = null;
            if (faults != null)
                msgs = ((InternalEObject)faults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULES_OPERATION_TYPE__FAULTS, null, msgs);
            if (newFaults != null)
                msgs = ((InternalEObject)newFaults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULES_OPERATION_TYPE__FAULTS, null, msgs);
            msgs = basicSetFaults(newFaults, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_OPERATION_TYPE__FAULTS, newFaults, newFaults));
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
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_OPERATION_TYPE__EVENT_ID, oldEventId, eventId));
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
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_OPERATION_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(OperationType newType) {
        OperationType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_OPERATION_TYPE__TYPE, oldType, type, !oldTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetType() {
        OperationType oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, RulesPackage.RULES_OPERATION_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
            case RulesPackage.RULES_OPERATION_TYPE__GLOBALS:
                return basicSetGlobals(null, msgs);
            case RulesPackage.RULES_OPERATION_TYPE__INPUTS:
                return basicSetInputs(null, msgs);
            case RulesPackage.RULES_OPERATION_TYPE__OUTPUTS:
                return basicSetOutputs(null, msgs);
            case RulesPackage.RULES_OPERATION_TYPE__FAULTS:
                return basicSetFaults(null, msgs);
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
            case RulesPackage.RULES_OPERATION_TYPE__GLOBALS:
                return getGlobals();
            case RulesPackage.RULES_OPERATION_TYPE__INPUTS:
                return getInputs();
            case RulesPackage.RULES_OPERATION_TYPE__OUTPUTS:
                return getOutputs();
            case RulesPackage.RULES_OPERATION_TYPE__FAULTS:
                return getFaults();
            case RulesPackage.RULES_OPERATION_TYPE__EVENT_ID:
                return getEventId();
            case RulesPackage.RULES_OPERATION_TYPE__NAME:
                return getName();
            case RulesPackage.RULES_OPERATION_TYPE__TYPE:
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
            case RulesPackage.RULES_OPERATION_TYPE__GLOBALS:
                setGlobals((GlobalsType)newValue);
                return;
            case RulesPackage.RULES_OPERATION_TYPE__INPUTS:
                setInputs((InputsType)newValue);
                return;
            case RulesPackage.RULES_OPERATION_TYPE__OUTPUTS:
                setOutputs((OutputsType)newValue);
                return;
            case RulesPackage.RULES_OPERATION_TYPE__FAULTS:
                setFaults((FaultsType)newValue);
                return;
            case RulesPackage.RULES_OPERATION_TYPE__EVENT_ID:
                setEventId((String)newValue);
                return;
            case RulesPackage.RULES_OPERATION_TYPE__NAME:
                setName((String)newValue);
                return;
            case RulesPackage.RULES_OPERATION_TYPE__TYPE:
                setType((OperationType)newValue);
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
            case RulesPackage.RULES_OPERATION_TYPE__GLOBALS:
                setGlobals((GlobalsType)null);
                return;
            case RulesPackage.RULES_OPERATION_TYPE__INPUTS:
                setInputs((InputsType)null);
                return;
            case RulesPackage.RULES_OPERATION_TYPE__OUTPUTS:
                setOutputs((OutputsType)null);
                return;
            case RulesPackage.RULES_OPERATION_TYPE__FAULTS:
                setFaults((FaultsType)null);
                return;
            case RulesPackage.RULES_OPERATION_TYPE__EVENT_ID:
                setEventId(EVENT_ID_EDEFAULT);
                return;
            case RulesPackage.RULES_OPERATION_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case RulesPackage.RULES_OPERATION_TYPE__TYPE:
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
            case RulesPackage.RULES_OPERATION_TYPE__GLOBALS:
                return globals != null;
            case RulesPackage.RULES_OPERATION_TYPE__INPUTS:
                return inputs != null;
            case RulesPackage.RULES_OPERATION_TYPE__OUTPUTS:
                return outputs != null;
            case RulesPackage.RULES_OPERATION_TYPE__FAULTS:
                return faults != null;
            case RulesPackage.RULES_OPERATION_TYPE__EVENT_ID:
                return EVENT_ID_EDEFAULT == null ? eventId != null : !EVENT_ID_EDEFAULT.equals(eventId);
            case RulesPackage.RULES_OPERATION_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case RulesPackage.RULES_OPERATION_TYPE__TYPE:
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
        result.append(", name: ");
        result.append(name);
        result.append(", type: ");
        if (typeESet) result.append(type); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //RulesOperationTypeImpl
