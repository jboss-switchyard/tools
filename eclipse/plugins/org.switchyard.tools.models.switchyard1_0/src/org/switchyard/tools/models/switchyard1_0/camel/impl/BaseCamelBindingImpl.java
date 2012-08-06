/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.BaseCamelBinding;
import org.switchyard.tools.models.switchyard1_0.camel.CamelOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;

import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;

import org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardBindingTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Camel Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.impl.BaseCamelBindingImpl#getCamelOperationSelector <em>Camel Operation Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BaseCamelBindingImpl extends SwitchYardBindingTypeImpl implements BaseCamelBinding {
    /**
     * The cached value of the '{@link #getCamelOperationSelector() <em>Camel Operation Selector</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCamelOperationSelector()
     * @generated
     * @ordered
     */
    protected CamelOperationSelectorType camelOperationSelector;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BaseCamelBindingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CamelPackage.Literals.BASE_CAMEL_BINDING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelOperationSelectorType getCamelOperationSelector() {
        return camelOperationSelector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCamelOperationSelector(CamelOperationSelectorType newCamelOperationSelector, NotificationChain msgs) {
        CamelOperationSelectorType oldCamelOperationSelector = camelOperationSelector;
        camelOperationSelector = newCamelOperationSelector;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamelPackage.BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR, oldCamelOperationSelector, newCamelOperationSelector);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCamelOperationSelector(CamelOperationSelectorType newCamelOperationSelector) {
        if (newCamelOperationSelector != camelOperationSelector) {
            NotificationChain msgs = null;
            if (camelOperationSelector != null)
                msgs = ((InternalEObject)camelOperationSelector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamelPackage.BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR, null, msgs);
            if (newCamelOperationSelector != null)
                msgs = ((InternalEObject)newCamelOperationSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamelPackage.BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR, null, msgs);
            msgs = basicSetCamelOperationSelector(newCamelOperationSelector, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPackage.BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR, newCamelOperationSelector, newCamelOperationSelector));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CamelPackage.BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR:
                return basicSetCamelOperationSelector(null, msgs);
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
            case CamelPackage.BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR:
                return getCamelOperationSelector();
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
            case CamelPackage.BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR:
                setCamelOperationSelector((CamelOperationSelectorType)newValue);
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
            case CamelPackage.BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR:
                setCamelOperationSelector((CamelOperationSelectorType)null);
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
            case CamelPackage.BASE_CAMEL_BINDING__CAMEL_OPERATION_SELECTOR:
                return camelOperationSelector != null;
        }
        return super.eIsSet(featureID);
    }

} //BaseCamelBindingImpl
