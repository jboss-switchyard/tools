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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Include;
import org.eclipse.soa.sca.sca1_1.model.sca.Property;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.soa.sca.sca1_1.model.sca.Wire;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CompositeImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CompositeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CompositeImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CompositeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CompositeImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CompositeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CompositeImpl#getWire <em>Wire</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CompositeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CompositeImpl#isAutowire <em>Autowire</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CompositeImpl#getConstrainingType <em>Constraining Type</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CompositeImpl#isLocal <em>Local</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CompositeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CompositeImpl#getPolicySets <em>Policy Sets</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CompositeImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.CompositeImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeImpl extends CommonExtensionBaseImpl implements Composite {
	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<Include> include;

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
	 * The default value of the '{@link #isLocal() <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLocal() <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocal()
	 * @generated
	 * @ordered
	 */
	protected boolean local = LOCAL_EDEFAULT;

	/**
	 * This is true if the Local attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean localESet;

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
	 * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScaPackage.eINSTANCE.getComposite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Include> getInclude() {
		if (include == null) {
			include = new EObjectContainmentEList<Include>(Include.class, this, ScaPackage.COMPOSITE__INCLUDE);
		}
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, ScaPackage.COMPOSITE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getService() {
		return getGroup().list(ScaPackage.eINSTANCE.getComposite_Service());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		return getGroup().list(ScaPackage.eINSTANCE.getComposite_Property());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		return getGroup().list(ScaPackage.eINSTANCE.getComposite_Component());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReference() {
		return getGroup().list(ScaPackage.eINSTANCE.getComposite_Reference());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wire> getWire() {
		return getGroup().list(ScaPackage.eINSTANCE.getComposite_Wire());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, ScaPackage.COMPOSITE__ANY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.COMPOSITE__AUTOWIRE, oldAutowire, autowire, !oldAutowireESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.COMPOSITE__AUTOWIRE, oldAutowire, AUTOWIRE_EDEFAULT, oldAutowireESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.COMPOSITE__CONSTRAINING_TYPE, oldConstrainingType, constrainingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLocal() {
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocal(boolean newLocal) {
		boolean oldLocal = local;
		local = newLocal;
		boolean oldLocalESet = localESet;
		localESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.COMPOSITE__LOCAL, oldLocal, local, !oldLocalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLocal() {
		boolean oldLocal = local;
		boolean oldLocalESet = localESet;
		local = LOCAL_EDEFAULT;
		localESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.COMPOSITE__LOCAL, oldLocal, LOCAL_EDEFAULT, oldLocalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLocal() {
		return localESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.COMPOSITE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.COMPOSITE__POLICY_SETS, oldPolicySets, policySets));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.COMPOSITE__REQUIRES, oldRequires, requires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetNamespace() {
		return targetNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNamespace(String newTargetNamespace) {
		String oldTargetNamespace = targetNamespace;
		targetNamespace = newTargetNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.COMPOSITE__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScaPackage.COMPOSITE__INCLUDE:
				return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
			case ScaPackage.COMPOSITE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case ScaPackage.COMPOSITE__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
			case ScaPackage.COMPOSITE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case ScaPackage.COMPOSITE__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case ScaPackage.COMPOSITE__REFERENCE:
				return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
			case ScaPackage.COMPOSITE__WIRE:
				return ((InternalEList<?>)getWire()).basicRemove(otherEnd, msgs);
			case ScaPackage.COMPOSITE__ANY:
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
			case ScaPackage.COMPOSITE__INCLUDE:
				return getInclude();
			case ScaPackage.COMPOSITE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case ScaPackage.COMPOSITE__SERVICE:
				return getService();
			case ScaPackage.COMPOSITE__PROPERTY:
				return getProperty();
			case ScaPackage.COMPOSITE__COMPONENT:
				return getComponent();
			case ScaPackage.COMPOSITE__REFERENCE:
				return getReference();
			case ScaPackage.COMPOSITE__WIRE:
				return getWire();
			case ScaPackage.COMPOSITE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case ScaPackage.COMPOSITE__AUTOWIRE:
				return isAutowire();
			case ScaPackage.COMPOSITE__CONSTRAINING_TYPE:
				return getConstrainingType();
			case ScaPackage.COMPOSITE__LOCAL:
				return isLocal();
			case ScaPackage.COMPOSITE__NAME:
				return getName();
			case ScaPackage.COMPOSITE__POLICY_SETS:
				return getPolicySets();
			case ScaPackage.COMPOSITE__REQUIRES:
				return getRequires();
			case ScaPackage.COMPOSITE__TARGET_NAMESPACE:
				return getTargetNamespace();
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
			case ScaPackage.COMPOSITE__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends Include>)newValue);
				return;
			case ScaPackage.COMPOSITE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case ScaPackage.COMPOSITE__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends Service>)newValue);
				return;
			case ScaPackage.COMPOSITE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case ScaPackage.COMPOSITE__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case ScaPackage.COMPOSITE__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case ScaPackage.COMPOSITE__WIRE:
				getWire().clear();
				getWire().addAll((Collection<? extends Wire>)newValue);
				return;
			case ScaPackage.COMPOSITE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case ScaPackage.COMPOSITE__AUTOWIRE:
				setAutowire((Boolean)newValue);
				return;
			case ScaPackage.COMPOSITE__CONSTRAINING_TYPE:
				setConstrainingType((QName)newValue);
				return;
			case ScaPackage.COMPOSITE__LOCAL:
				setLocal((Boolean)newValue);
				return;
			case ScaPackage.COMPOSITE__NAME:
				setName((String)newValue);
				return;
			case ScaPackage.COMPOSITE__POLICY_SETS:
				setPolicySets((List<QName>)newValue);
				return;
			case ScaPackage.COMPOSITE__REQUIRES:
				setRequires((List<QName>)newValue);
				return;
			case ScaPackage.COMPOSITE__TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
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
			case ScaPackage.COMPOSITE__INCLUDE:
				getInclude().clear();
				return;
			case ScaPackage.COMPOSITE__GROUP:
				getGroup().clear();
				return;
			case ScaPackage.COMPOSITE__SERVICE:
				getService().clear();
				return;
			case ScaPackage.COMPOSITE__PROPERTY:
				getProperty().clear();
				return;
			case ScaPackage.COMPOSITE__COMPONENT:
				getComponent().clear();
				return;
			case ScaPackage.COMPOSITE__REFERENCE:
				getReference().clear();
				return;
			case ScaPackage.COMPOSITE__WIRE:
				getWire().clear();
				return;
			case ScaPackage.COMPOSITE__ANY:
				getAny().clear();
				return;
			case ScaPackage.COMPOSITE__AUTOWIRE:
				unsetAutowire();
				return;
			case ScaPackage.COMPOSITE__CONSTRAINING_TYPE:
				setConstrainingType(CONSTRAINING_TYPE_EDEFAULT);
				return;
			case ScaPackage.COMPOSITE__LOCAL:
				unsetLocal();
				return;
			case ScaPackage.COMPOSITE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ScaPackage.COMPOSITE__POLICY_SETS:
				setPolicySets(POLICY_SETS_EDEFAULT);
				return;
			case ScaPackage.COMPOSITE__REQUIRES:
				setRequires(REQUIRES_EDEFAULT);
				return;
			case ScaPackage.COMPOSITE__TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
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
			case ScaPackage.COMPOSITE__INCLUDE:
				return include != null && !include.isEmpty();
			case ScaPackage.COMPOSITE__GROUP:
				return group != null && !group.isEmpty();
			case ScaPackage.COMPOSITE__SERVICE:
				return !getService().isEmpty();
			case ScaPackage.COMPOSITE__PROPERTY:
				return !getProperty().isEmpty();
			case ScaPackage.COMPOSITE__COMPONENT:
				return !getComponent().isEmpty();
			case ScaPackage.COMPOSITE__REFERENCE:
				return !getReference().isEmpty();
			case ScaPackage.COMPOSITE__WIRE:
				return !getWire().isEmpty();
			case ScaPackage.COMPOSITE__ANY:
				return any != null && !any.isEmpty();
			case ScaPackage.COMPOSITE__AUTOWIRE:
				return isSetAutowire();
			case ScaPackage.COMPOSITE__CONSTRAINING_TYPE:
				return CONSTRAINING_TYPE_EDEFAULT == null ? constrainingType != null : !CONSTRAINING_TYPE_EDEFAULT.equals(constrainingType);
			case ScaPackage.COMPOSITE__LOCAL:
				return isSetLocal();
			case ScaPackage.COMPOSITE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ScaPackage.COMPOSITE__POLICY_SETS:
				return POLICY_SETS_EDEFAULT == null ? policySets != null : !POLICY_SETS_EDEFAULT.equals(policySets);
			case ScaPackage.COMPOSITE__REQUIRES:
				return REQUIRES_EDEFAULT == null ? requires != null : !REQUIRES_EDEFAULT.equals(requires);
			case ScaPackage.COMPOSITE__TARGET_NAMESPACE:
				return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", any: ");
		result.append(any);
		result.append(", autowire: ");
		if (autowireESet) result.append(autowire); else result.append("<unset>");
		result.append(", constrainingType: ");
		result.append(constrainingType);
		result.append(", local: ");
		if (localESet) result.append(local); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", policySets: ");
		result.append(policySets);
		result.append(", requires: ");
		result.append(requires);
		result.append(", targetNamespace: ");
		result.append(targetNamespace);
		result.append(')');
		return result.toString();
	}

} //CompositeImpl
