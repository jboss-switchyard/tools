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

import org.switchyard.tools.models.switchyard1_0.spring.RemoveHeaderDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Header Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RemoveHeaderDefinitionImpl#getHeaderName <em>Header Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RemoveHeaderDefinitionImpl#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoveHeaderDefinitionImpl extends NoOutputDefinitionImpl implements RemoveHeaderDefinition {
	/**
     * The default value of the '{@link #getHeaderName() <em>Header Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHeaderName()
     * @generated
     * @ordered
     */
	protected static final String HEADER_NAME_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getHeaderName() <em>Header Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHeaderName()
     * @generated
     * @ordered
     */
	protected String headerName = HEADER_NAME_EDEFAULT;

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
	protected RemoveHeaderDefinitionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getRemoveHeaderDefinition();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getHeaderName() {
        return headerName;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHeaderName(String newHeaderName) {
        String oldHeaderName = headerName;
        headerName = newHeaderName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.REMOVE_HEADER_DEFINITION__HEADER_NAME, oldHeaderName, headerName));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute2() {
        if (anyAttribute2 == null) {
            anyAttribute2 = new BasicFeatureMap(this, SpringPackage.REMOVE_HEADER_DEFINITION__ANY_ATTRIBUTE2);
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
            case SpringPackage.REMOVE_HEADER_DEFINITION__ANY_ATTRIBUTE2:
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
            case SpringPackage.REMOVE_HEADER_DEFINITION__HEADER_NAME:
                return getHeaderName();
            case SpringPackage.REMOVE_HEADER_DEFINITION__ANY_ATTRIBUTE2:
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
            case SpringPackage.REMOVE_HEADER_DEFINITION__HEADER_NAME:
                setHeaderName((String)newValue);
                return;
            case SpringPackage.REMOVE_HEADER_DEFINITION__ANY_ATTRIBUTE2:
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
            case SpringPackage.REMOVE_HEADER_DEFINITION__HEADER_NAME:
                setHeaderName(HEADER_NAME_EDEFAULT);
                return;
            case SpringPackage.REMOVE_HEADER_DEFINITION__ANY_ATTRIBUTE2:
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
            case SpringPackage.REMOVE_HEADER_DEFINITION__HEADER_NAME:
                return HEADER_NAME_EDEFAULT == null ? headerName != null : !HEADER_NAME_EDEFAULT.equals(headerName);
            case SpringPackage.REMOVE_HEADER_DEFINITION__ANY_ATTRIBUTE2:
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
        result.append(" (headerName: ");
        result.append(headerName);
        result.append(", anyAttribute2: ");
        result.append(anyAttribute2);
        result.append(')');
        return result.toString();
    }

} //RemoveHeaderDefinitionImpl
