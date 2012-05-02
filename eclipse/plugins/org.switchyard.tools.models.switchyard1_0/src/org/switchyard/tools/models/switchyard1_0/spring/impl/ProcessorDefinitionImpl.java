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

import org.switchyard.tools.models.switchyard1_0.spring.ProcessorDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ProcessorDefinitionImpl#isInheritErrorHandler <em>Inherit Error Handler</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.ProcessorDefinitionImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ProcessorDefinitionImpl extends OptionalIdentifiedDefinitionImpl implements ProcessorDefinition {
	/**
	 * The default value of the '{@link #isInheritErrorHandler() <em>Inherit Error Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInheritErrorHandler()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INHERIT_ERROR_HANDLER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInheritErrorHandler() <em>Inherit Error Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInheritErrorHandler()
	 * @generated
	 * @ordered
	 */
	protected boolean inheritErrorHandler = INHERIT_ERROR_HANDLER_EDEFAULT;

	/**
	 * This is true if the Inherit Error Handler attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inheritErrorHandlerESet;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.eINSTANCE.getProcessorDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInheritErrorHandler() {
		return inheritErrorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritErrorHandler(boolean newInheritErrorHandler) {
		boolean oldInheritErrorHandler = inheritErrorHandler;
		inheritErrorHandler = newInheritErrorHandler;
		boolean oldInheritErrorHandlerESet = inheritErrorHandlerESet;
		inheritErrorHandlerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.PROCESSOR_DEFINITION__INHERIT_ERROR_HANDLER, oldInheritErrorHandler, inheritErrorHandler, !oldInheritErrorHandlerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInheritErrorHandler() {
		boolean oldInheritErrorHandler = inheritErrorHandler;
		boolean oldInheritErrorHandlerESet = inheritErrorHandlerESet;
		inheritErrorHandler = INHERIT_ERROR_HANDLER_EDEFAULT;
		inheritErrorHandlerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.PROCESSOR_DEFINITION__INHERIT_ERROR_HANDLER, oldInheritErrorHandler, INHERIT_ERROR_HANDLER_EDEFAULT, oldInheritErrorHandlerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInheritErrorHandler() {
		return inheritErrorHandlerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, SpringPackage.PROCESSOR_DEFINITION__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpringPackage.PROCESSOR_DEFINITION__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case SpringPackage.PROCESSOR_DEFINITION__INHERIT_ERROR_HANDLER:
				return isInheritErrorHandler();
			case SpringPackage.PROCESSOR_DEFINITION__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case SpringPackage.PROCESSOR_DEFINITION__INHERIT_ERROR_HANDLER:
				setInheritErrorHandler((Boolean)newValue);
				return;
			case SpringPackage.PROCESSOR_DEFINITION__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case SpringPackage.PROCESSOR_DEFINITION__INHERIT_ERROR_HANDLER:
				unsetInheritErrorHandler();
				return;
			case SpringPackage.PROCESSOR_DEFINITION__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case SpringPackage.PROCESSOR_DEFINITION__INHERIT_ERROR_HANDLER:
				return isSetInheritErrorHandler();
			case SpringPackage.PROCESSOR_DEFINITION__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (inheritErrorHandler: ");
		if (inheritErrorHandlerESet) result.append(inheritErrorHandler); else result.append("<unset>");
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ProcessorDefinitionImpl
