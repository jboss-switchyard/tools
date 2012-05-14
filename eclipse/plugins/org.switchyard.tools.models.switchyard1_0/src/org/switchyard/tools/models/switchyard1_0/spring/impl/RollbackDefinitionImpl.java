/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.spring.RollbackDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rollback Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RollbackDefinitionImpl#isMarkRollbackOnly <em>Mark Rollback Only</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RollbackDefinitionImpl#isMarkRollbackOnlyLast <em>Mark Rollback Only Last</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RollbackDefinitionImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RollbackDefinitionImpl#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RollbackDefinitionImpl extends NoOutputDefinitionImpl implements RollbackDefinition {
	/**
     * The default value of the '{@link #isMarkRollbackOnly() <em>Mark Rollback Only</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isMarkRollbackOnly()
     * @generated
     * @ordered
     */
	protected static final boolean MARK_ROLLBACK_ONLY_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isMarkRollbackOnly() <em>Mark Rollback Only</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isMarkRollbackOnly()
     * @generated
     * @ordered
     */
	protected boolean markRollbackOnly = MARK_ROLLBACK_ONLY_EDEFAULT;

	/**
     * This is true if the Mark Rollback Only attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean markRollbackOnlyESet;

	/**
     * The default value of the '{@link #isMarkRollbackOnlyLast() <em>Mark Rollback Only Last</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isMarkRollbackOnlyLast()
     * @generated
     * @ordered
     */
	protected static final boolean MARK_ROLLBACK_ONLY_LAST_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isMarkRollbackOnlyLast() <em>Mark Rollback Only Last</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isMarkRollbackOnlyLast()
     * @generated
     * @ordered
     */
	protected boolean markRollbackOnlyLast = MARK_ROLLBACK_ONLY_LAST_EDEFAULT;

	/**
     * This is true if the Mark Rollback Only Last attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean markRollbackOnlyLastESet;

	/**
     * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMessage()
     * @generated
     * @ordered
     */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMessage()
     * @generated
     * @ordered
     */
	protected String message = MESSAGE_EDEFAULT;

	/**
     * The cached value of the '{@link #getAnyAttribute2() <em>Any Attribute2</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAnyAttribute2()
     * @generated
     * @ordered
     */
	protected FeatureMap anyAttribute2;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected RollbackDefinitionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getRollbackDefinition();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isMarkRollbackOnly() {
        return markRollbackOnly;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMarkRollbackOnly(boolean newMarkRollbackOnly) {
        boolean oldMarkRollbackOnly = markRollbackOnly;
        markRollbackOnly = newMarkRollbackOnly;
        boolean oldMarkRollbackOnlyESet = markRollbackOnlyESet;
        markRollbackOnlyESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ROLLBACK_DEFINITION__MARK_ROLLBACK_ONLY, oldMarkRollbackOnly, markRollbackOnly, !oldMarkRollbackOnlyESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetMarkRollbackOnly() {
        boolean oldMarkRollbackOnly = markRollbackOnly;
        boolean oldMarkRollbackOnlyESet = markRollbackOnlyESet;
        markRollbackOnly = MARK_ROLLBACK_ONLY_EDEFAULT;
        markRollbackOnlyESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.ROLLBACK_DEFINITION__MARK_ROLLBACK_ONLY, oldMarkRollbackOnly, MARK_ROLLBACK_ONLY_EDEFAULT, oldMarkRollbackOnlyESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetMarkRollbackOnly() {
        return markRollbackOnlyESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isMarkRollbackOnlyLast() {
        return markRollbackOnlyLast;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMarkRollbackOnlyLast(boolean newMarkRollbackOnlyLast) {
        boolean oldMarkRollbackOnlyLast = markRollbackOnlyLast;
        markRollbackOnlyLast = newMarkRollbackOnlyLast;
        boolean oldMarkRollbackOnlyLastESet = markRollbackOnlyLastESet;
        markRollbackOnlyLastESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ROLLBACK_DEFINITION__MARK_ROLLBACK_ONLY_LAST, oldMarkRollbackOnlyLast, markRollbackOnlyLast, !oldMarkRollbackOnlyLastESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetMarkRollbackOnlyLast() {
        boolean oldMarkRollbackOnlyLast = markRollbackOnlyLast;
        boolean oldMarkRollbackOnlyLastESet = markRollbackOnlyLastESet;
        markRollbackOnlyLast = MARK_ROLLBACK_ONLY_LAST_EDEFAULT;
        markRollbackOnlyLastESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.ROLLBACK_DEFINITION__MARK_ROLLBACK_ONLY_LAST, oldMarkRollbackOnlyLast, MARK_ROLLBACK_ONLY_LAST_EDEFAULT, oldMarkRollbackOnlyLastESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetMarkRollbackOnlyLast() {
        return markRollbackOnlyLastESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getMessage() {
        return message;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMessage(String newMessage) {
        String oldMessage = message;
        message = newMessage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ROLLBACK_DEFINITION__MESSAGE, oldMessage, message));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute2() {
        if (anyAttribute2 == null) {
            anyAttribute2 = new BasicFeatureMap(this, SpringPackage.ROLLBACK_DEFINITION__ANY_ATTRIBUTE2);
        }
        return anyAttribute2;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SpringPackage.ROLLBACK_DEFINITION__ANY_ATTRIBUTE2:
                return ((InternalEList<?>)getAnyAttribute2()).basicRemove(otherEnd, msgs);
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
            case SpringPackage.ROLLBACK_DEFINITION__MARK_ROLLBACK_ONLY:
                return isMarkRollbackOnly();
            case SpringPackage.ROLLBACK_DEFINITION__MARK_ROLLBACK_ONLY_LAST:
                return isMarkRollbackOnlyLast();
            case SpringPackage.ROLLBACK_DEFINITION__MESSAGE:
                return getMessage();
            case SpringPackage.ROLLBACK_DEFINITION__ANY_ATTRIBUTE2:
                if (coreType) return getAnyAttribute2();
                return ((FeatureMap.Internal)getAnyAttribute2()).getWrapper();
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
            case SpringPackage.ROLLBACK_DEFINITION__MARK_ROLLBACK_ONLY:
                setMarkRollbackOnly((Boolean)newValue);
                return;
            case SpringPackage.ROLLBACK_DEFINITION__MARK_ROLLBACK_ONLY_LAST:
                setMarkRollbackOnlyLast((Boolean)newValue);
                return;
            case SpringPackage.ROLLBACK_DEFINITION__MESSAGE:
                setMessage((String)newValue);
                return;
            case SpringPackage.ROLLBACK_DEFINITION__ANY_ATTRIBUTE2:
                ((FeatureMap.Internal)getAnyAttribute2()).set(newValue);
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
            case SpringPackage.ROLLBACK_DEFINITION__MARK_ROLLBACK_ONLY:
                unsetMarkRollbackOnly();
                return;
            case SpringPackage.ROLLBACK_DEFINITION__MARK_ROLLBACK_ONLY_LAST:
                unsetMarkRollbackOnlyLast();
                return;
            case SpringPackage.ROLLBACK_DEFINITION__MESSAGE:
                setMessage(MESSAGE_EDEFAULT);
                return;
            case SpringPackage.ROLLBACK_DEFINITION__ANY_ATTRIBUTE2:
                getAnyAttribute2().clear();
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
            case SpringPackage.ROLLBACK_DEFINITION__MARK_ROLLBACK_ONLY:
                return isSetMarkRollbackOnly();
            case SpringPackage.ROLLBACK_DEFINITION__MARK_ROLLBACK_ONLY_LAST:
                return isSetMarkRollbackOnlyLast();
            case SpringPackage.ROLLBACK_DEFINITION__MESSAGE:
                return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
            case SpringPackage.ROLLBACK_DEFINITION__ANY_ATTRIBUTE2:
                return anyAttribute2 != null && !anyAttribute2.isEmpty();
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
        result.append(" (markRollbackOnly: ");
        if (markRollbackOnlyESet) result.append(markRollbackOnly); else result.append("<unset>");
        result.append(", markRollbackOnlyLast: ");
        if (markRollbackOnlyLastESet) result.append(markRollbackOnlyLast); else result.append("<unset>");
        result.append(", message: ");
        result.append(message);
        result.append(", anyAttribute2: ");
        result.append(anyAttribute2);
        result.append(')');
        return result.toString();
    }

} //RollbackDefinitionImpl
