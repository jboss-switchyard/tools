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

import org.switchyard.tools.models.switchyard1_0.spring.ExchangePattern;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.spring.ToDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ToDefinitionImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ToDefinitionImpl#getAnyAttribute3 <em>Any Attribute3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToDefinitionImpl extends SendDefinitionImpl implements ToDefinition {
	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final ExchangePattern PATTERN_EDEFAULT = ExchangePattern.IN_ONLY;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected ExchangePattern pattern = PATTERN_EDEFAULT;

	/**
	 * This is true if the Pattern attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean patternESet;

	/**
	 * The cached value of the '{@link #getAnyAttribute3() <em>Any Attribute3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute3()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.eINSTANCE.getToDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangePattern getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(ExchangePattern newPattern) {
		ExchangePattern oldPattern = pattern;
		pattern = newPattern == null ? PATTERN_EDEFAULT : newPattern;
		boolean oldPatternESet = patternESet;
		patternESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.TO_DEFINITION__PATTERN, oldPattern, pattern, !oldPatternESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPattern() {
		ExchangePattern oldPattern = pattern;
		boolean oldPatternESet = patternESet;
		pattern = PATTERN_EDEFAULT;
		patternESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.TO_DEFINITION__PATTERN, oldPattern, PATTERN_EDEFAULT, oldPatternESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPattern() {
		return patternESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute3() {
		if (anyAttribute3 == null) {
			anyAttribute3 = new BasicFeatureMap(this, SpringPackage.TO_DEFINITION__ANY_ATTRIBUTE3);
		}
		return anyAttribute3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpringPackage.TO_DEFINITION__ANY_ATTRIBUTE3:
				return ((InternalEList<?>)getAnyAttribute3()).basicRemove(otherEnd, msgs);
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
			case SpringPackage.TO_DEFINITION__PATTERN:
				return getPattern();
			case SpringPackage.TO_DEFINITION__ANY_ATTRIBUTE3:
				if (coreType) return getAnyAttribute3();
				return ((FeatureMap.Internal)getAnyAttribute3()).getWrapper();
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
			case SpringPackage.TO_DEFINITION__PATTERN:
				setPattern((ExchangePattern)newValue);
				return;
			case SpringPackage.TO_DEFINITION__ANY_ATTRIBUTE3:
				((FeatureMap.Internal)getAnyAttribute3()).set(newValue);
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
			case SpringPackage.TO_DEFINITION__PATTERN:
				unsetPattern();
				return;
			case SpringPackage.TO_DEFINITION__ANY_ATTRIBUTE3:
				getAnyAttribute3().clear();
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
			case SpringPackage.TO_DEFINITION__PATTERN:
				return isSetPattern();
			case SpringPackage.TO_DEFINITION__ANY_ATTRIBUTE3:
				return anyAttribute3 != null && !anyAttribute3.isEmpty();
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
		result.append(" (pattern: ");
		if (patternESet) result.append(pattern); else result.append("<unset>");
		result.append(", anyAttribute3: ");
		result.append(anyAttribute3);
		result.append(')');
		return result.toString();
	}

} //ToDefinitionImpl
