/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.rules.impl;

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

import org.switchyard.tools.models.switchyard1_0.rules.ActionType1;
import org.switchyard.tools.models.switchyard1_0.rules.AuditType;
import org.switchyard.tools.models.switchyard1_0.rules.ChannelType;
import org.switchyard.tools.models.switchyard1_0.rules.ResourceType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RulesImplementationTypeImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RulesImplementationTypeImpl#getAudit <em>Audit</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RulesImplementationTypeImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.RulesImplementationTypeImpl#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RulesImplementationTypeImpl extends ImplementationImpl implements RulesImplementationType {
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
     * The cached value of the '{@link #getChannel() <em>Channel</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getChannel()
     * @generated
     * @ordered
     */
	protected EList<ChannelType> channel;

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
	protected RulesImplementationTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return RulesPackage.Literals.RULES_IMPLEMENTATION_TYPE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ActionType1> getAction() {
        if (action == null) {
            action = new EObjectContainmentEList<ActionType1>(ActionType1.class, this, RulesPackage.RULES_IMPLEMENTATION_TYPE__ACTION);
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_IMPLEMENTATION_TYPE__AUDIT, oldAudit, newAudit);
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
                msgs = ((InternalEObject)audit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULES_IMPLEMENTATION_TYPE__AUDIT, null, msgs);
            if (newAudit != null)
                msgs = ((InternalEObject)newAudit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULES_IMPLEMENTATION_TYPE__AUDIT, null, msgs);
            msgs = basicSetAudit(newAudit, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.RULES_IMPLEMENTATION_TYPE__AUDIT, newAudit, newAudit));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ChannelType> getChannel() {
        if (channel == null) {
            channel = new EObjectContainmentEList<ChannelType>(ChannelType.class, this, RulesPackage.RULES_IMPLEMENTATION_TYPE__CHANNEL);
        }
        return channel;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ResourceType> getResource() {
        if (resource == null) {
            resource = new EObjectContainmentEList<ResourceType>(ResourceType.class, this, RulesPackage.RULES_IMPLEMENTATION_TYPE__RESOURCE);
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
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__ACTION:
                return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__AUDIT:
                return basicSetAudit(null, msgs);
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__CHANNEL:
                return ((InternalEList<?>)getChannel()).basicRemove(otherEnd, msgs);
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__RESOURCE:
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
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__ACTION:
                return getAction();
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__AUDIT:
                return getAudit();
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__CHANNEL:
                return getChannel();
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__RESOURCE:
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
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__ACTION:
                getAction().clear();
                getAction().addAll((Collection<? extends ActionType1>)newValue);
                return;
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__AUDIT:
                setAudit((AuditType)newValue);
                return;
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__CHANNEL:
                getChannel().clear();
                getChannel().addAll((Collection<? extends ChannelType>)newValue);
                return;
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__RESOURCE:
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
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__ACTION:
                getAction().clear();
                return;
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__AUDIT:
                setAudit((AuditType)null);
                return;
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__CHANNEL:
                getChannel().clear();
                return;
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__RESOURCE:
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
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__ACTION:
                return action != null && !action.isEmpty();
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__AUDIT:
                return audit != null;
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__CHANNEL:
                return channel != null && !channel.isEmpty();
            case RulesPackage.RULES_IMPLEMENTATION_TYPE__RESOURCE:
                return resource != null && !resource.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //RulesImplementationTypeImpl
