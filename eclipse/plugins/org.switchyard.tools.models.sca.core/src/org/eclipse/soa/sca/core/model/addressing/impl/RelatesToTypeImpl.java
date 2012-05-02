/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.core.model.addressing.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.soa.sca.core.model.addressing.AddressingPackage;
import org.eclipse.soa.sca.core.model.addressing.RelatesToType;
import org.eclipse.soa.sca.core.model.addressing.RelationshipType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relates To Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.impl.RelatesToTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.impl.RelatesToTypeImpl#getRelationshipType <em>Relationship Type</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.core.model.addressing.impl.RelatesToTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatesToTypeImpl extends EObjectImpl implements RelatesToType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelationshipType()
	 * <em>Relationship Type</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getRelationshipType()
	 * @generated NOT
	 * @ordered
	 */
	// [SDR]
	protected static final Object RELATIONSHIP_TYPE_EDEFAULT = RelationshipType.HTTP_WWW_W3_ORG200508_ADDRESSING_REPLY;
	// TODO The default value literal
	// "http://www.w3.org/2005/08/addressing/reply" is not valid.
	// [/SDR]

	/**
	 * The cached value of the '{@link #getRelationshipType() <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected Object relationshipType = RELATIONSHIP_TYPE_EDEFAULT;

	/**
	 * This is true if the Relationship Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean relationshipTypeESet;

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
	protected RelatesToTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AddressingPackage.Literals.RELATES_TO_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return this.value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = this.value;
		this.value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressingPackage.RELATES_TO_TYPE__VALUE, oldValue, this.value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRelationshipType() {
		return this.relationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshipType(Object newRelationshipType) {
		Object oldRelationshipType = this.relationshipType;
		this.relationshipType = newRelationshipType;
		boolean oldRelationshipTypeESet = this.relationshipTypeESet;
		this.relationshipTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddressingPackage.RELATES_TO_TYPE__RELATIONSHIP_TYPE, oldRelationshipType, this.relationshipType, !oldRelationshipTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelationshipType() {
		Object oldRelationshipType = this.relationshipType;
		boolean oldRelationshipTypeESet = this.relationshipTypeESet;
		this.relationshipType = RELATIONSHIP_TYPE_EDEFAULT;
		this.relationshipTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AddressingPackage.RELATES_TO_TYPE__RELATIONSHIP_TYPE, oldRelationshipType, RELATIONSHIP_TYPE_EDEFAULT, oldRelationshipTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelationshipType() {
		return this.relationshipTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (this.anyAttribute == null) {
			this.anyAttribute = new BasicFeatureMap(this, AddressingPackage.RELATES_TO_TYPE__ANY_ATTRIBUTE);
		}
		return this.anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AddressingPackage.RELATES_TO_TYPE__ANY_ATTRIBUTE:
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
		case AddressingPackage.RELATES_TO_TYPE__VALUE:
			return getValue();
		case AddressingPackage.RELATES_TO_TYPE__RELATIONSHIP_TYPE:
			return getRelationshipType();
		case AddressingPackage.RELATES_TO_TYPE__ANY_ATTRIBUTE:
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
		case AddressingPackage.RELATES_TO_TYPE__VALUE:
			setValue((String)newValue);
			return;
		case AddressingPackage.RELATES_TO_TYPE__RELATIONSHIP_TYPE:
			setRelationshipType(newValue);
			return;
		case AddressingPackage.RELATES_TO_TYPE__ANY_ATTRIBUTE:
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
		case AddressingPackage.RELATES_TO_TYPE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case AddressingPackage.RELATES_TO_TYPE__RELATIONSHIP_TYPE:
			unsetRelationshipType();
			return;
		case AddressingPackage.RELATES_TO_TYPE__ANY_ATTRIBUTE:
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
		case AddressingPackage.RELATES_TO_TYPE__VALUE:
			return VALUE_EDEFAULT == null ? this.value != null : !VALUE_EDEFAULT.equals(this.value);
		case AddressingPackage.RELATES_TO_TYPE__RELATIONSHIP_TYPE:
			return isSetRelationshipType();
		case AddressingPackage.RELATES_TO_TYPE__ANY_ATTRIBUTE:
			return this.anyAttribute != null && !this.anyAttribute.isEmpty();
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
		result.append(" (value: ");
		result.append(this.value);
		result.append(", relationshipType: ");
		if (this.relationshipTypeESet) result.append(this.relationshipType); else result.append("<unset>");
		result.append(", anyAttribute: ");
		result.append(this.anyAttribute);
		result.append(')');
		return result.toString();
	}

} //RelatesToTypeImpl
