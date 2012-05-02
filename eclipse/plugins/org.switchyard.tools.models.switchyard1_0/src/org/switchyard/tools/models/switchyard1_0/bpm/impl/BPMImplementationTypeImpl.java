/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.bpm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.impl.ImplementationImpl;

import org.switchyard.tools.models.switchyard1_0.bpm.ActionType1;
import org.switchyard.tools.models.switchyard1_0.bpm.AuditType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.ResourceType;
import org.switchyard.tools.models.switchyard1_0.bpm.TaskHandlerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getAudit <em>Audit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getTaskHandler <em>Task Handler</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.BPMImplementationTypeImpl#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BPMImplementationTypeImpl extends ImplementationImpl implements BPMImplementationType {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionType1> action;

	/**
	 * The cached value of the '{@link #getAudit() <em>Audit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudit()
	 * @generated
	 * @ordered
	 */
	protected AuditType audit;

	/**
	 * The cached value of the '{@link #getTaskHandler() <em>Task Handler</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskHandler()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskHandlerType> taskHandler;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceType> resource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMImplementationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMPackage.Literals.BPM_IMPLEMENTATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionType1> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<ActionType1>(ActionType1.class, this, BPMPackage.BPM_IMPLEMENTATION_TYPE__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditType getAudit() {
		return audit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAudit(AuditType newAudit, NotificationChain msgs) {
		AuditType oldAudit = audit;
		audit = newAudit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__AUDIT, oldAudit, newAudit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAudit(AuditType newAudit) {
		if (newAudit != audit) {
			NotificationChain msgs = null;
			if (audit != null)
				msgs = ((InternalEObject)audit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMPackage.BPM_IMPLEMENTATION_TYPE__AUDIT, null, msgs);
			if (newAudit != null)
				msgs = ((InternalEObject)newAudit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMPackage.BPM_IMPLEMENTATION_TYPE__AUDIT, null, msgs);
			msgs = basicSetAudit(newAudit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.BPM_IMPLEMENTATION_TYPE__AUDIT, newAudit, newAudit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskHandlerType> getTaskHandler() {
		if (taskHandler == null) {
			taskHandler = new EObjectContainmentEList<TaskHandlerType>(TaskHandlerType.class, this, BPMPackage.BPM_IMPLEMENTATION_TYPE__TASK_HANDLER);
		}
		return taskHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceType> getResource() {
		if (resource == null) {
			resource = new EObjectContainmentEList<ResourceType>(ResourceType.class, this, BPMPackage.BPM_IMPLEMENTATION_TYPE__RESOURCE);
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMPackage.BPM_IMPLEMENTATION_TYPE__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case BPMPackage.BPM_IMPLEMENTATION_TYPE__AUDIT:
				return basicSetAudit(null, msgs);
			case BPMPackage.BPM_IMPLEMENTATION_TYPE__TASK_HANDLER:
				return ((InternalEList<?>)getTaskHandler()).basicRemove(otherEnd, msgs);
			case BPMPackage.BPM_IMPLEMENTATION_TYPE__RESOURCE:
				return ((InternalEList<?>)getResource()).basicRemove(otherEnd, msgs);
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
			case BPMPackage.BPM_IMPLEMENTATION_TYPE__ACTION:
				return getAction();
			case BPMPackage.BPM_IMPLEMENTATION_TYPE__AUDIT:
				return getAudit();
			case BPMPackage.BPM_IMPLEMENTATION_TYPE__TASK_HANDLER:
				return getTaskHandler();
			case BPMPackage.BPM_IMPLEMENTATION_TYPE__RESOURCE:
				return getResource();
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
			case BPMPackage.BPM_IMPLEMENTATION_TYPE__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends ActionType1>)newValue);
				return;
			case BPMPackage.BPM_IMPLEMENTATION_TYPE__AUDIT:
				setAudit((AuditType)newValue);
				return;
			case BPMPackage.BPM_IMPLEMENTATION_TYPE__TASK_HANDLER:
				getTaskHandler().clear();
				getTaskHandler().addAll((Collection<? extends TaskHandlerType>)newValue);
				return;
			case BPMPackage.BPM_IMPLEMENTATION_TYPE__RESOURCE:
				getResource().clear();
				getResource().addAll((Collection<? extends ResourceType>)newValue);
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
			case BPMPackage.BPM_IMPLEMENTATION_TYPE__ACTION:
				getAction().clear();
				return;
			case BPMPackage.BPM_IMPLEMENTATION_TYPE__AUDIT:
				setAudit((AuditType)null);
				return;
			case BPMPackage.BPM_IMPLEMENTATION_TYPE__TASK_HANDLER:
				getTaskHandler().clear();
				return;
			case BPMPackage.BPM_IMPLEMENTATION_TYPE__RESOURCE:
				getResource().clear();
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
			case BPMPackage.BPM_IMPLEMENTATION_TYPE__ACTION:
				return action != null && !action.isEmpty();
			case BPMPackage.BPM_IMPLEMENTATION_TYPE__AUDIT:
				return audit != null;
			case BPMPackage.BPM_IMPLEMENTATION_TYPE__TASK_HANDLER:
				return taskHandler != null && !taskHandler.isEmpty();
			case BPMPackage.BPM_IMPLEMENTATION_TYPE__RESOURCE:
				return resource != null && !resource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BPMImplementationTypeImpl
