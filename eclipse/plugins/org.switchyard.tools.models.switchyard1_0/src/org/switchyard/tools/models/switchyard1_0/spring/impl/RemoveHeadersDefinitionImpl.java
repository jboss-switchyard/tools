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

import org.switchyard.tools.models.switchyard1_0.spring.RemoveHeadersDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Headers Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RemoveHeadersDefinitionImpl#getExcludePattern <em>Exclude Pattern</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RemoveHeadersDefinitionImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RemoveHeadersDefinitionImpl#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoveHeadersDefinitionImpl extends NoOutputDefinitionImpl implements RemoveHeadersDefinition {
	/**
	 * The default value of the '{@link #getExcludePattern() <em>Exclude Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludePattern()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCLUDE_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcludePattern() <em>Exclude Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludePattern()
	 * @generated
	 * @ordered
	 */
	protected String excludePattern = EXCLUDE_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected String pattern = PATTERN_EDEFAULT;

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
	protected RemoveHeadersDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.eINSTANCE.getRemoveHeadersDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExcludePattern() {
		return excludePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludePattern(String newExcludePattern) {
		String oldExcludePattern = excludePattern;
		excludePattern = newExcludePattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.REMOVE_HEADERS_DEFINITION__EXCLUDE_PATTERN, oldExcludePattern, excludePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.REMOVE_HEADERS_DEFINITION__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute2() {
		if (anyAttribute2 == null) {
			anyAttribute2 = new BasicFeatureMap(this, SpringPackage.REMOVE_HEADERS_DEFINITION__ANY_ATTRIBUTE2);
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
			case SpringPackage.REMOVE_HEADERS_DEFINITION__ANY_ATTRIBUTE2:
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
			case SpringPackage.REMOVE_HEADERS_DEFINITION__EXCLUDE_PATTERN:
				return getExcludePattern();
			case SpringPackage.REMOVE_HEADERS_DEFINITION__PATTERN:
				return getPattern();
			case SpringPackage.REMOVE_HEADERS_DEFINITION__ANY_ATTRIBUTE2:
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
			case SpringPackage.REMOVE_HEADERS_DEFINITION__EXCLUDE_PATTERN:
				setExcludePattern((String)newValue);
				return;
			case SpringPackage.REMOVE_HEADERS_DEFINITION__PATTERN:
				setPattern((String)newValue);
				return;
			case SpringPackage.REMOVE_HEADERS_DEFINITION__ANY_ATTRIBUTE2:
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
			case SpringPackage.REMOVE_HEADERS_DEFINITION__EXCLUDE_PATTERN:
				setExcludePattern(EXCLUDE_PATTERN_EDEFAULT);
				return;
			case SpringPackage.REMOVE_HEADERS_DEFINITION__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case SpringPackage.REMOVE_HEADERS_DEFINITION__ANY_ATTRIBUTE2:
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
			case SpringPackage.REMOVE_HEADERS_DEFINITION__EXCLUDE_PATTERN:
				return EXCLUDE_PATTERN_EDEFAULT == null ? excludePattern != null : !EXCLUDE_PATTERN_EDEFAULT.equals(excludePattern);
			case SpringPackage.REMOVE_HEADERS_DEFINITION__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case SpringPackage.REMOVE_HEADERS_DEFINITION__ANY_ATTRIBUTE2:
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
		result.append(" (excludePattern: ");
		result.append(excludePattern);
		result.append(", pattern: ");
		result.append(pattern);
		result.append(", anyAttribute2: ");
		result.append(anyAttribute2);
		result.append(')');
		return result.toString();
	}

} //RemoveHeadersDefinitionImpl
