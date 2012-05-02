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

import org.switchyard.tools.models.switchyard1_0.spring.IdempotentConsumerDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Idempotent Consumer Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.IdempotentConsumerDefinitionImpl#isEager <em>Eager</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.IdempotentConsumerDefinitionImpl#getMessageIdRepositoryRef <em>Message Id Repository Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.IdempotentConsumerDefinitionImpl#isSkipDuplicate <em>Skip Duplicate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.IdempotentConsumerDefinitionImpl#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdempotentConsumerDefinitionImpl extends ExpressionNodeImpl implements IdempotentConsumerDefinition {
	/**
	 * The default value of the '{@link #isEager() <em>Eager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEager()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EAGER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEager() <em>Eager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEager()
	 * @generated
	 * @ordered
	 */
	protected boolean eager = EAGER_EDEFAULT;

	/**
	 * This is true if the Eager attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eagerESet;

	/**
	 * The default value of the '{@link #getMessageIdRepositoryRef() <em>Message Id Repository Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageIdRepositoryRef()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_ID_REPOSITORY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageIdRepositoryRef() <em>Message Id Repository Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageIdRepositoryRef()
	 * @generated
	 * @ordered
	 */
	protected String messageIdRepositoryRef = MESSAGE_ID_REPOSITORY_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #isSkipDuplicate() <em>Skip Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSkipDuplicate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SKIP_DUPLICATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSkipDuplicate() <em>Skip Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSkipDuplicate()
	 * @generated
	 * @ordered
	 */
	protected boolean skipDuplicate = SKIP_DUPLICATE_EDEFAULT;

	/**
	 * This is true if the Skip Duplicate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean skipDuplicateESet;

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
	protected IdempotentConsumerDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.eINSTANCE.getIdempotentConsumerDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEager() {
		return eager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEager(boolean newEager) {
		boolean oldEager = eager;
		eager = newEager;
		boolean oldEagerESet = eagerESet;
		eagerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION__EAGER, oldEager, eager, !oldEagerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEager() {
		boolean oldEager = eager;
		boolean oldEagerESet = eagerESet;
		eager = EAGER_EDEFAULT;
		eagerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION__EAGER, oldEager, EAGER_EDEFAULT, oldEagerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEager() {
		return eagerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageIdRepositoryRef() {
		return messageIdRepositoryRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageIdRepositoryRef(String newMessageIdRepositoryRef) {
		String oldMessageIdRepositoryRef = messageIdRepositoryRef;
		messageIdRepositoryRef = newMessageIdRepositoryRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION__MESSAGE_ID_REPOSITORY_REF, oldMessageIdRepositoryRef, messageIdRepositoryRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSkipDuplicate() {
		return skipDuplicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkipDuplicate(boolean newSkipDuplicate) {
		boolean oldSkipDuplicate = skipDuplicate;
		skipDuplicate = newSkipDuplicate;
		boolean oldSkipDuplicateESet = skipDuplicateESet;
		skipDuplicateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION__SKIP_DUPLICATE, oldSkipDuplicate, skipDuplicate, !oldSkipDuplicateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSkipDuplicate() {
		boolean oldSkipDuplicate = skipDuplicate;
		boolean oldSkipDuplicateESet = skipDuplicateESet;
		skipDuplicate = SKIP_DUPLICATE_EDEFAULT;
		skipDuplicateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION__SKIP_DUPLICATE, oldSkipDuplicate, SKIP_DUPLICATE_EDEFAULT, oldSkipDuplicateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSkipDuplicate() {
		return skipDuplicateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute2() {
		if (anyAttribute2 == null) {
			anyAttribute2 = new BasicFeatureMap(this, SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION__ANY_ATTRIBUTE2);
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
			case SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION__ANY_ATTRIBUTE2:
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
			case SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION__EAGER:
				return isEager();
			case SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION__MESSAGE_ID_REPOSITORY_REF:
				return getMessageIdRepositoryRef();
			case SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION__SKIP_DUPLICATE:
				return isSkipDuplicate();
			case SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION__ANY_ATTRIBUTE2:
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
			case SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION__EAGER:
				setEager((Boolean)newValue);
				return;
			case SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION__MESSAGE_ID_REPOSITORY_REF:
				setMessageIdRepositoryRef((String)newValue);
				return;
			case SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION__SKIP_DUPLICATE:
				setSkipDuplicate((Boolean)newValue);
				return;
			case SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION__ANY_ATTRIBUTE2:
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
			case SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION__EAGER:
				unsetEager();
				return;
			case SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION__MESSAGE_ID_REPOSITORY_REF:
				setMessageIdRepositoryRef(MESSAGE_ID_REPOSITORY_REF_EDEFAULT);
				return;
			case SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION__SKIP_DUPLICATE:
				unsetSkipDuplicate();
				return;
			case SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION__ANY_ATTRIBUTE2:
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
			case SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION__EAGER:
				return isSetEager();
			case SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION__MESSAGE_ID_REPOSITORY_REF:
				return MESSAGE_ID_REPOSITORY_REF_EDEFAULT == null ? messageIdRepositoryRef != null : !MESSAGE_ID_REPOSITORY_REF_EDEFAULT.equals(messageIdRepositoryRef);
			case SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION__SKIP_DUPLICATE:
				return isSetSkipDuplicate();
			case SpringPackage.IDEMPOTENT_CONSUMER_DEFINITION__ANY_ATTRIBUTE2:
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
		result.append(" (eager: ");
		if (eagerESet) result.append(eager); else result.append("<unset>");
		result.append(", messageIdRepositoryRef: ");
		result.append(messageIdRepositoryRef);
		result.append(", skipDuplicate: ");
		if (skipDuplicateESet) result.append(skipDuplicate); else result.append("<unset>");
		result.append(", anyAttribute2: ");
		result.append(anyAttribute2);
		result.append(')');
		return result.toString();
	}

} //IdempotentConsumerDefinitionImpl
