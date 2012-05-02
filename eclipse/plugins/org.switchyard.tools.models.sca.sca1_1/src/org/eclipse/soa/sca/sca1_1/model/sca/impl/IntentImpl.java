/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.impl;

import java.util.Collection;
import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.Intent;
import org.eclipse.soa.sca.sca1_1.model.sca.IntentQualifier;
import org.eclipse.soa.sca.sca1_1.model.sca.InteractionOrImplementation;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.IntentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.IntentImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.IntentImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.IntentImpl#getConstrains <em>Constrains</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.IntentImpl#getExcludes <em>Excludes</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.IntentImpl#getIntentType <em>Intent Type</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.IntentImpl#isMutuallyExclusive <em>Mutually Exclusive</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.IntentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.IntentImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.IntentImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntentImpl extends EObjectImpl implements Intent {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<IntentQualifier> qualifier;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The default value of the '{@link #getConstrains() <em>Constrains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrains()
	 * @generated
	 * @ordered
	 */
	protected static final List<QName> CONSTRAINS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstrains() <em>Constrains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrains()
	 * @generated
	 * @ordered
	 */
	protected List<QName> constrains = CONSTRAINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExcludes() <em>Excludes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludes()
	 * @generated
	 * @ordered
	 */
	protected static final List<QName> EXCLUDES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcludes() <em>Excludes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludes()
	 * @generated
	 * @ordered
	 */
	protected List<QName> excludes = EXCLUDES_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntentType() <em>Intent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntentType()
	 * @generated
	 * @ordered
	 */
	protected static final InteractionOrImplementation INTENT_TYPE_EDEFAULT = InteractionOrImplementation.INTERACTION;

	/**
	 * The cached value of the '{@link #getIntentType() <em>Intent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntentType()
	 * @generated
	 * @ordered
	 */
	protected InteractionOrImplementation intentType = INTENT_TYPE_EDEFAULT;

	/**
	 * This is true if the Intent Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean intentTypeESet;

	/**
	 * The default value of the '{@link #isMutuallyExclusive() <em>Mutually Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMutuallyExclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUTUALLY_EXCLUSIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMutuallyExclusive() <em>Mutually Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMutuallyExclusive()
	 * @generated
	 * @ordered
	 */
	protected boolean mutuallyExclusive = MUTUALLY_EXCLUSIVE_EDEFAULT;

	/**
	 * This is true if the Mutually Exclusive attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mutuallyExclusiveESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequires() <em>Requires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected static final List<QName> REQUIRES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected List<QName> requires = REQUIRES_EDEFAULT;

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
	protected IntentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScaPackage.eINSTANCE.getIntent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.INTENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntentQualifier> getQualifier() {
		if (qualifier == null) {
			qualifier = new EObjectContainmentEList<IntentQualifier>(IntentQualifier.class, this, ScaPackage.INTENT__QUALIFIER);
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, ScaPackage.INTENT__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QName> getConstrains() {
		return constrains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrains(List<QName> newConstrains) {
		List<QName> oldConstrains = constrains;
		constrains = newConstrains;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.INTENT__CONSTRAINS, oldConstrains, constrains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QName> getExcludes() {
		return excludes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludes(List<QName> newExcludes) {
		List<QName> oldExcludes = excludes;
		excludes = newExcludes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.INTENT__EXCLUDES, oldExcludes, excludes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOrImplementation getIntentType() {
		return intentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntentType(InteractionOrImplementation newIntentType) {
		InteractionOrImplementation oldIntentType = intentType;
		intentType = newIntentType == null ? INTENT_TYPE_EDEFAULT : newIntentType;
		boolean oldIntentTypeESet = intentTypeESet;
		intentTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.INTENT__INTENT_TYPE, oldIntentType, intentType, !oldIntentTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIntentType() {
		InteractionOrImplementation oldIntentType = intentType;
		boolean oldIntentTypeESet = intentTypeESet;
		intentType = INTENT_TYPE_EDEFAULT;
		intentTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.INTENT__INTENT_TYPE, oldIntentType, INTENT_TYPE_EDEFAULT, oldIntentTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIntentType() {
		return intentTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMutuallyExclusive() {
		return mutuallyExclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMutuallyExclusive(boolean newMutuallyExclusive) {
		boolean oldMutuallyExclusive = mutuallyExclusive;
		mutuallyExclusive = newMutuallyExclusive;
		boolean oldMutuallyExclusiveESet = mutuallyExclusiveESet;
		mutuallyExclusiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.INTENT__MUTUALLY_EXCLUSIVE, oldMutuallyExclusive, mutuallyExclusive, !oldMutuallyExclusiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMutuallyExclusive() {
		boolean oldMutuallyExclusive = mutuallyExclusive;
		boolean oldMutuallyExclusiveESet = mutuallyExclusiveESet;
		mutuallyExclusive = MUTUALLY_EXCLUSIVE_EDEFAULT;
		mutuallyExclusiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.INTENT__MUTUALLY_EXCLUSIVE, oldMutuallyExclusive, MUTUALLY_EXCLUSIVE_EDEFAULT, oldMutuallyExclusiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMutuallyExclusive() {
		return mutuallyExclusiveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.INTENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QName> getRequires() {
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequires(List<QName> newRequires) {
		List<QName> oldRequires = requires;
		requires = newRequires;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.INTENT__REQUIRES, oldRequires, requires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, ScaPackage.INTENT__ANY_ATTRIBUTE);
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
			case ScaPackage.INTENT__QUALIFIER:
				return ((InternalEList<?>)getQualifier()).basicRemove(otherEnd, msgs);
			case ScaPackage.INTENT__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case ScaPackage.INTENT__ANY_ATTRIBUTE:
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
			case ScaPackage.INTENT__DESCRIPTION:
				return getDescription();
			case ScaPackage.INTENT__QUALIFIER:
				return getQualifier();
			case ScaPackage.INTENT__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case ScaPackage.INTENT__CONSTRAINS:
				return getConstrains();
			case ScaPackage.INTENT__EXCLUDES:
				return getExcludes();
			case ScaPackage.INTENT__INTENT_TYPE:
				return getIntentType();
			case ScaPackage.INTENT__MUTUALLY_EXCLUSIVE:
				return isMutuallyExclusive();
			case ScaPackage.INTENT__NAME:
				return getName();
			case ScaPackage.INTENT__REQUIRES:
				return getRequires();
			case ScaPackage.INTENT__ANY_ATTRIBUTE:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScaPackage.INTENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ScaPackage.INTENT__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends IntentQualifier>)newValue);
				return;
			case ScaPackage.INTENT__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case ScaPackage.INTENT__CONSTRAINS:
				setConstrains((List<QName>)newValue);
				return;
			case ScaPackage.INTENT__EXCLUDES:
				setExcludes((List<QName>)newValue);
				return;
			case ScaPackage.INTENT__INTENT_TYPE:
				setIntentType((InteractionOrImplementation)newValue);
				return;
			case ScaPackage.INTENT__MUTUALLY_EXCLUSIVE:
				setMutuallyExclusive((Boolean)newValue);
				return;
			case ScaPackage.INTENT__NAME:
				setName((String)newValue);
				return;
			case ScaPackage.INTENT__REQUIRES:
				setRequires((List<QName>)newValue);
				return;
			case ScaPackage.INTENT__ANY_ATTRIBUTE:
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
			case ScaPackage.INTENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ScaPackage.INTENT__QUALIFIER:
				getQualifier().clear();
				return;
			case ScaPackage.INTENT__ANY:
				getAny().clear();
				return;
			case ScaPackage.INTENT__CONSTRAINS:
				setConstrains(CONSTRAINS_EDEFAULT);
				return;
			case ScaPackage.INTENT__EXCLUDES:
				setExcludes(EXCLUDES_EDEFAULT);
				return;
			case ScaPackage.INTENT__INTENT_TYPE:
				unsetIntentType();
				return;
			case ScaPackage.INTENT__MUTUALLY_EXCLUSIVE:
				unsetMutuallyExclusive();
				return;
			case ScaPackage.INTENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ScaPackage.INTENT__REQUIRES:
				setRequires(REQUIRES_EDEFAULT);
				return;
			case ScaPackage.INTENT__ANY_ATTRIBUTE:
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
			case ScaPackage.INTENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ScaPackage.INTENT__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
			case ScaPackage.INTENT__ANY:
				return any != null && !any.isEmpty();
			case ScaPackage.INTENT__CONSTRAINS:
				return CONSTRAINS_EDEFAULT == null ? constrains != null : !CONSTRAINS_EDEFAULT.equals(constrains);
			case ScaPackage.INTENT__EXCLUDES:
				return EXCLUDES_EDEFAULT == null ? excludes != null : !EXCLUDES_EDEFAULT.equals(excludes);
			case ScaPackage.INTENT__INTENT_TYPE:
				return isSetIntentType();
			case ScaPackage.INTENT__MUTUALLY_EXCLUSIVE:
				return isSetMutuallyExclusive();
			case ScaPackage.INTENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ScaPackage.INTENT__REQUIRES:
				return REQUIRES_EDEFAULT == null ? requires != null : !REQUIRES_EDEFAULT.equals(requires);
			case ScaPackage.INTENT__ANY_ATTRIBUTE:
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
		result.append(" (description: ");
		result.append(description);
		result.append(", any: ");
		result.append(any);
		result.append(", constrains: ");
		result.append(constrains);
		result.append(", excludes: ");
		result.append(excludes);
		result.append(", intentType: ");
		if (intentTypeESet) result.append(intentType); else result.append("<unset>");
		result.append(", mutuallyExclusive: ");
		if (mutuallyExclusiveESet) result.append(mutuallyExclusive); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", requires: ");
		result.append(requires);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //IntentImpl
