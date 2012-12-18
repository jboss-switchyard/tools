/**
 */
package org.switchyard.tools.models.switchyard1_0.bpm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.impl.CommonExtensionBaseImpl;

import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.WorkItemHandlerType;
import org.switchyard.tools.models.switchyard1_0.bpm.WorkItemHandlersType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Item Handlers Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.WorkItemHandlersTypeImpl#getWorkItemHandler <em>Work Item Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkItemHandlersTypeImpl extends CommonExtensionBaseImpl implements WorkItemHandlersType {
    /**
     * The cached value of the '{@link #getWorkItemHandler() <em>Work Item Handler</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorkItemHandler()
     * @generated
     * @ordered
     */
    protected EList<WorkItemHandlerType> workItemHandler;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WorkItemHandlersTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BPMPackage.Literals.WORK_ITEM_HANDLERS_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<WorkItemHandlerType> getWorkItemHandler() {
        if (workItemHandler == null) {
            workItemHandler = new EObjectContainmentEList<WorkItemHandlerType>(WorkItemHandlerType.class, this, BPMPackage.WORK_ITEM_HANDLERS_TYPE__WORK_ITEM_HANDLER);
        }
        return workItemHandler;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BPMPackage.WORK_ITEM_HANDLERS_TYPE__WORK_ITEM_HANDLER:
                return ((InternalEList<?>)getWorkItemHandler()).basicRemove(otherEnd, msgs);
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
            case BPMPackage.WORK_ITEM_HANDLERS_TYPE__WORK_ITEM_HANDLER:
                return getWorkItemHandler();
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
            case BPMPackage.WORK_ITEM_HANDLERS_TYPE__WORK_ITEM_HANDLER:
                getWorkItemHandler().clear();
                getWorkItemHandler().addAll((Collection<? extends WorkItemHandlerType>)newValue);
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
            case BPMPackage.WORK_ITEM_HANDLERS_TYPE__WORK_ITEM_HANDLER:
                getWorkItemHandler().clear();
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
            case BPMPackage.WORK_ITEM_HANDLERS_TYPE__WORK_ITEM_HANDLER:
                return workItemHandler != null && !workItemHandler.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //WorkItemHandlersTypeImpl
