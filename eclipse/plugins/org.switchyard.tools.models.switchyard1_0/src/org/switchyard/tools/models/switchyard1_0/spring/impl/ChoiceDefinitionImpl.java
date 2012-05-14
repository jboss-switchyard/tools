/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.spring.ChoiceDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.OtherwiseDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.spring.WhenDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ChoiceDefinitionImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ChoiceDefinitionImpl#getOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ChoiceDefinitionImpl#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChoiceDefinitionImpl extends ProcessorDefinitionImpl implements ChoiceDefinition {
	/**
     * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getWhen()
     * @generated
     * @ordered
     */
	protected EList<WhenDefinition> when;

	/**
     * The cached value of the '{@link #getOtherwise() <em>Otherwise</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOtherwise()
     * @generated
     * @ordered
     */
	protected OtherwiseDefinition otherwise;

	/**
     * The cached value of the '{@link #getAnyAttribute1() <em>Any Attribute1</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAnyAttribute1()
     * @generated
     * @ordered
     */
	protected FeatureMap anyAttribute1;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ChoiceDefinitionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getChoiceDefinition();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<WhenDefinition> getWhen() {
        if (when == null) {
            when = new EObjectContainmentEList<WhenDefinition>(WhenDefinition.class, this, SpringPackage.CHOICE_DEFINITION__WHEN);
        }
        return when;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public OtherwiseDefinition getOtherwise() {
        return otherwise;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetOtherwise(OtherwiseDefinition newOtherwise, NotificationChain msgs) {
        OtherwiseDefinition oldOtherwise = otherwise;
        otherwise = newOtherwise;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringPackage.CHOICE_DEFINITION__OTHERWISE, oldOtherwise, newOtherwise);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOtherwise(OtherwiseDefinition newOtherwise) {
        if (newOtherwise != otherwise) {
            NotificationChain msgs = null;
            if (otherwise != null)
                msgs = ((InternalEObject)otherwise).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringPackage.CHOICE_DEFINITION__OTHERWISE, null, msgs);
            if (newOtherwise != null)
                msgs = ((InternalEObject)newOtherwise).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringPackage.CHOICE_DEFINITION__OTHERWISE, null, msgs);
            msgs = basicSetOtherwise(newOtherwise, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.CHOICE_DEFINITION__OTHERWISE, newOtherwise, newOtherwise));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute1() {
        if (anyAttribute1 == null) {
            anyAttribute1 = new BasicFeatureMap(this, SpringPackage.CHOICE_DEFINITION__ANY_ATTRIBUTE1);
        }
        return anyAttribute1;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SpringPackage.CHOICE_DEFINITION__WHEN:
                return ((InternalEList<?>)getWhen()).basicRemove(otherEnd, msgs);
            case SpringPackage.CHOICE_DEFINITION__OTHERWISE:
                return basicSetOtherwise(null, msgs);
            case SpringPackage.CHOICE_DEFINITION__ANY_ATTRIBUTE1:
                return ((InternalEList<?>)getAnyAttribute1()).basicRemove(otherEnd, msgs);
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
            case SpringPackage.CHOICE_DEFINITION__WHEN:
                return getWhen();
            case SpringPackage.CHOICE_DEFINITION__OTHERWISE:
                return getOtherwise();
            case SpringPackage.CHOICE_DEFINITION__ANY_ATTRIBUTE1:
                if (coreType) return getAnyAttribute1();
                return ((FeatureMap.Internal)getAnyAttribute1()).getWrapper();
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
            case SpringPackage.CHOICE_DEFINITION__WHEN:
                getWhen().clear();
                getWhen().addAll((Collection<? extends WhenDefinition>)newValue);
                return;
            case SpringPackage.CHOICE_DEFINITION__OTHERWISE:
                setOtherwise((OtherwiseDefinition)newValue);
                return;
            case SpringPackage.CHOICE_DEFINITION__ANY_ATTRIBUTE1:
                ((FeatureMap.Internal)getAnyAttribute1()).set(newValue);
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
            case SpringPackage.CHOICE_DEFINITION__WHEN:
                getWhen().clear();
                return;
            case SpringPackage.CHOICE_DEFINITION__OTHERWISE:
                setOtherwise((OtherwiseDefinition)null);
                return;
            case SpringPackage.CHOICE_DEFINITION__ANY_ATTRIBUTE1:
                getAnyAttribute1().clear();
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
            case SpringPackage.CHOICE_DEFINITION__WHEN:
                return when != null && !when.isEmpty();
            case SpringPackage.CHOICE_DEFINITION__OTHERWISE:
                return otherwise != null;
            case SpringPackage.CHOICE_DEFINITION__ANY_ATTRIBUTE1:
                return anyAttribute1 != null && !anyAttribute1.isEmpty();
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
        result.append(" (anyAttribute1: ");
        result.append(anyAttribute1);
        result.append(')');
        return result.toString();
    }

} //ChoiceDefinitionImpl
