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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.soa.sca.sca1_1.model.sca.PropertyValue;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentImpl#getImplementationGroup <em>Implementation Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentImpl#isAutowire <em>Autowire</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentImpl#getConstrainingType <em>Constraining Type</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentImpl#getPolicySets <em>Policy Sets</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.ComponentImpl#getRequires <em>Requires</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends CommonExtensionBaseImpl implements Component {
	/**
	 * The cached value of the '{@link #getImplementationGroup() <em>Implementation Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap implementationGroup;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	 * The default value of the '{@link #isAutowire() <em>Autowire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutowire()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOWIRE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutowire() <em>Autowire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutowire()
	 * @generated
	 * @ordered
	 */
	protected boolean autowire = AUTOWIRE_EDEFAULT;

	/**
	 * This is true if the Autowire attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autowireESet;

	/**
	 * The default value of the '{@link #getConstrainingType() <em>Constraining Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainingType()
	 * @generated
	 * @ordered
	 */
	protected static final QName CONSTRAINING_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstrainingType() <em>Constraining Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainingType()
	 * @generated
	 * @ordered
	 */
	protected QName constrainingType = CONSTRAINING_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getPolicySets() <em>Policy Sets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicySets()
	 * @generated
	 * @ordered
	 */
	protected static final List<QName> POLICY_SETS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicySets() <em>Policy Sets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicySets()
	 * @generated
	 * @ordered
	 */
	protected List<QName> policySets = POLICY_SETS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScaPackage.eINSTANCE.getComponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getImplementationGroup() {
		if (implementationGroup == null) {
			implementationGroup = new BasicFeatureMap(this, ScaPackage.COMPONENT__IMPLEMENTATION_GROUP);
		}
		return implementationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation getImplementation() {
		return (Implementation)getImplementationGroup().get(ScaPackage.eINSTANCE.getComponent_Implementation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementation(Implementation newImplementation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getImplementationGroup()).basicAdd(ScaPackage.eINSTANCE.getComponent_Implementation(), newImplementation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, ScaPackage.COMPONENT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentService> getService() {
		return getGroup().list(ScaPackage.eINSTANCE.getComponent_Service());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentReference> getReference() {
		return getGroup().list(ScaPackage.eINSTANCE.getComponent_Reference());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyValue> getProperty() {
		return getGroup().list(ScaPackage.eINSTANCE.getComponent_Property());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, ScaPackage.COMPONENT__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutowire() {
		return autowire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutowire(boolean newAutowire) {
		boolean oldAutowire = autowire;
		autowire = newAutowire;
		boolean oldAutowireESet = autowireESet;
		autowireESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.COMPONENT__AUTOWIRE, oldAutowire, autowire, !oldAutowireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutowire() {
		boolean oldAutowire = autowire;
		boolean oldAutowireESet = autowireESet;
		autowire = AUTOWIRE_EDEFAULT;
		autowireESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.COMPONENT__AUTOWIRE, oldAutowire, AUTOWIRE_EDEFAULT, oldAutowireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutowire() {
		return autowireESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getConstrainingType() {
		return constrainingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainingType(QName newConstrainingType) {
		QName oldConstrainingType = constrainingType;
		constrainingType = newConstrainingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.COMPONENT__CONSTRAINING_TYPE, oldConstrainingType, constrainingType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QName> getPolicySets() {
		return policySets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicySets(List<QName> newPolicySets) {
		List<QName> oldPolicySets = policySets;
		policySets = newPolicySets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.COMPONENT__POLICY_SETS, oldPolicySets, policySets));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.COMPONENT__REQUIRES, oldRequires, requires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScaPackage.COMPONENT__IMPLEMENTATION_GROUP:
				return ((InternalEList<?>)getImplementationGroup()).basicRemove(otherEnd, msgs);
			case ScaPackage.COMPONENT__IMPLEMENTATION:
				return basicSetImplementation(null, msgs);
			case ScaPackage.COMPONENT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case ScaPackage.COMPONENT__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
			case ScaPackage.COMPONENT__REFERENCE:
				return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
			case ScaPackage.COMPONENT__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case ScaPackage.COMPONENT__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case ScaPackage.COMPONENT__IMPLEMENTATION_GROUP:
				if (coreType) return getImplementationGroup();
				return ((FeatureMap.Internal)getImplementationGroup()).getWrapper();
			case ScaPackage.COMPONENT__IMPLEMENTATION:
				return getImplementation();
			case ScaPackage.COMPONENT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case ScaPackage.COMPONENT__SERVICE:
				return getService();
			case ScaPackage.COMPONENT__REFERENCE:
				return getReference();
			case ScaPackage.COMPONENT__PROPERTY:
				return getProperty();
			case ScaPackage.COMPONENT__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case ScaPackage.COMPONENT__AUTOWIRE:
				return isAutowire();
			case ScaPackage.COMPONENT__CONSTRAINING_TYPE:
				return getConstrainingType();
			case ScaPackage.COMPONENT__NAME:
				return getName();
			case ScaPackage.COMPONENT__POLICY_SETS:
				return getPolicySets();
			case ScaPackage.COMPONENT__REQUIRES:
				return getRequires();
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
			case ScaPackage.COMPONENT__IMPLEMENTATION_GROUP:
				((FeatureMap.Internal)getImplementationGroup()).set(newValue);
				return;
			case ScaPackage.COMPONENT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case ScaPackage.COMPONENT__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends ComponentService>)newValue);
				return;
			case ScaPackage.COMPONENT__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends ComponentReference>)newValue);
				return;
			case ScaPackage.COMPONENT__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends PropertyValue>)newValue);
				return;
			case ScaPackage.COMPONENT__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case ScaPackage.COMPONENT__AUTOWIRE:
				setAutowire((Boolean)newValue);
				return;
			case ScaPackage.COMPONENT__CONSTRAINING_TYPE:
				setConstrainingType((QName)newValue);
				return;
			case ScaPackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case ScaPackage.COMPONENT__POLICY_SETS:
				setPolicySets((List<QName>)newValue);
				return;
			case ScaPackage.COMPONENT__REQUIRES:
				setRequires((List<QName>)newValue);
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
			case ScaPackage.COMPONENT__IMPLEMENTATION_GROUP:
				getImplementationGroup().clear();
				return;
			case ScaPackage.COMPONENT__GROUP:
				getGroup().clear();
				return;
			case ScaPackage.COMPONENT__SERVICE:
				getService().clear();
				return;
			case ScaPackage.COMPONENT__REFERENCE:
				getReference().clear();
				return;
			case ScaPackage.COMPONENT__PROPERTY:
				getProperty().clear();
				return;
			case ScaPackage.COMPONENT__ANY:
				getAny().clear();
				return;
			case ScaPackage.COMPONENT__AUTOWIRE:
				unsetAutowire();
				return;
			case ScaPackage.COMPONENT__CONSTRAINING_TYPE:
				setConstrainingType(CONSTRAINING_TYPE_EDEFAULT);
				return;
			case ScaPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ScaPackage.COMPONENT__POLICY_SETS:
				setPolicySets(POLICY_SETS_EDEFAULT);
				return;
			case ScaPackage.COMPONENT__REQUIRES:
				setRequires(REQUIRES_EDEFAULT);
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
			case ScaPackage.COMPONENT__IMPLEMENTATION_GROUP:
				return implementationGroup != null && !implementationGroup.isEmpty();
			case ScaPackage.COMPONENT__IMPLEMENTATION:
				return getImplementation() != null;
			case ScaPackage.COMPONENT__GROUP:
				return group != null && !group.isEmpty();
			case ScaPackage.COMPONENT__SERVICE:
				return !getService().isEmpty();
			case ScaPackage.COMPONENT__REFERENCE:
				return !getReference().isEmpty();
			case ScaPackage.COMPONENT__PROPERTY:
				return !getProperty().isEmpty();
			case ScaPackage.COMPONENT__ANY:
				return any != null && !any.isEmpty();
			case ScaPackage.COMPONENT__AUTOWIRE:
				return isSetAutowire();
			case ScaPackage.COMPONENT__CONSTRAINING_TYPE:
				return CONSTRAINING_TYPE_EDEFAULT == null ? constrainingType != null : !CONSTRAINING_TYPE_EDEFAULT.equals(constrainingType);
			case ScaPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ScaPackage.COMPONENT__POLICY_SETS:
				return POLICY_SETS_EDEFAULT == null ? policySets != null : !POLICY_SETS_EDEFAULT.equals(policySets);
			case ScaPackage.COMPONENT__REQUIRES:
				return REQUIRES_EDEFAULT == null ? requires != null : !REQUIRES_EDEFAULT.equals(requires);
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
		result.append(" (implementationGroup: ");
		result.append(implementationGroup);
		result.append(", group: ");
		result.append(group);
		result.append(", any: ");
		result.append(any);
		result.append(", autowire: ");
		if (autowireESet) result.append(autowire); else result.append("<unset>");
		result.append(", constrainingType: ");
		result.append(constrainingType);
		result.append(", name: ");
		result.append(name);
		result.append(", policySets: ");
		result.append(policySets);
		result.append(", requires: ");
		result.append(requires);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
