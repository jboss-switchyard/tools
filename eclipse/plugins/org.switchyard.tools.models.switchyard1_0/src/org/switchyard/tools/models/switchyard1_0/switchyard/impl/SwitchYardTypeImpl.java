/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.soa.sca.sca1_1.model.sca.Composite;

import org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactsType;
import org.switchyard.tools.models.switchyard1_0.switchyard.DomainType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformsType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidatesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Yard Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardTypeImpl#getComposite <em>Composite</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardTypeImpl#getTransforms <em>Transforms</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardTypeImpl#getValidates <em>Validates</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardTypeImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardTypeImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardTypeImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchYardTypeImpl extends EObjectImpl implements SwitchYardType {
	/**
     * The cached value of the '{@link #getComposite() <em>Composite</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getComposite()
     * @generated
     * @ordered
     */
	protected Composite composite;

	/**
     * The cached value of the '{@link #getTransforms() <em>Transforms</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTransforms()
     * @generated
     * @ordered
     */
	protected TransformsType transforms;

	/**
     * The cached value of the '{@link #getValidates() <em>Validates</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getValidates()
     * @generated
     * @ordered
     */
	protected ValidatesType validates;

	/**
     * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDomain()
     * @generated
     * @ordered
     */
	protected DomainType domain;

	/**
     * The cached value of the '{@link #getArtifacts() <em>Artifacts</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getArtifacts()
     * @generated
     * @ordered
     */
	protected ArtifactsType artifacts;

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
	protected SwitchYardTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SwitchyardPackage.Literals.SWITCH_YARD_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.SWITCH_YARD_TYPE__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.SWITCH_YARD_TYPE__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Composite getComposite() {
        return composite;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetComposite(Composite newComposite, NotificationChain msgs) {
        Composite oldComposite = composite;
        composite = newComposite;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwitchyardPackage.SWITCH_YARD_TYPE__COMPOSITE, oldComposite, newComposite);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setComposite(Composite newComposite) {
        if (newComposite != composite) {
            NotificationChain msgs = null;
            if (composite != null)
                msgs = ((InternalEObject)composite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.SWITCH_YARD_TYPE__COMPOSITE, null, msgs);
            if (newComposite != null)
                msgs = ((InternalEObject)newComposite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.SWITCH_YARD_TYPE__COMPOSITE, null, msgs);
            msgs = basicSetComposite(newComposite, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.SWITCH_YARD_TYPE__COMPOSITE, newComposite, newComposite));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TransformsType getTransforms() {
        return transforms;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetTransforms(TransformsType newTransforms, NotificationChain msgs) {
        TransformsType oldTransforms = transforms;
        transforms = newTransforms;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwitchyardPackage.SWITCH_YARD_TYPE__TRANSFORMS, oldTransforms, newTransforms);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTransforms(TransformsType newTransforms) {
        if (newTransforms != transforms) {
            NotificationChain msgs = null;
            if (transforms != null)
                msgs = ((InternalEObject)transforms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.SWITCH_YARD_TYPE__TRANSFORMS, null, msgs);
            if (newTransforms != null)
                msgs = ((InternalEObject)newTransforms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.SWITCH_YARD_TYPE__TRANSFORMS, null, msgs);
            msgs = basicSetTransforms(newTransforms, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.SWITCH_YARD_TYPE__TRANSFORMS, newTransforms, newTransforms));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ValidatesType getValidates() {
        return validates;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetValidates(ValidatesType newValidates, NotificationChain msgs) {
        ValidatesType oldValidates = validates;
        validates = newValidates;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwitchyardPackage.SWITCH_YARD_TYPE__VALIDATES, oldValidates, newValidates);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setValidates(ValidatesType newValidates) {
        if (newValidates != validates) {
            NotificationChain msgs = null;
            if (validates != null)
                msgs = ((InternalEObject)validates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.SWITCH_YARD_TYPE__VALIDATES, null, msgs);
            if (newValidates != null)
                msgs = ((InternalEObject)newValidates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.SWITCH_YARD_TYPE__VALIDATES, null, msgs);
            msgs = basicSetValidates(newValidates, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.SWITCH_YARD_TYPE__VALIDATES, newValidates, newValidates));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DomainType getDomain() {
        return domain;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetDomain(DomainType newDomain, NotificationChain msgs) {
        DomainType oldDomain = domain;
        domain = newDomain;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwitchyardPackage.SWITCH_YARD_TYPE__DOMAIN, oldDomain, newDomain);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDomain(DomainType newDomain) {
        if (newDomain != domain) {
            NotificationChain msgs = null;
            if (domain != null)
                msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.SWITCH_YARD_TYPE__DOMAIN, null, msgs);
            if (newDomain != null)
                msgs = ((InternalEObject)newDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.SWITCH_YARD_TYPE__DOMAIN, null, msgs);
            msgs = basicSetDomain(newDomain, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.SWITCH_YARD_TYPE__DOMAIN, newDomain, newDomain));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ArtifactsType getArtifacts() {
        return artifacts;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetArtifacts(ArtifactsType newArtifacts, NotificationChain msgs) {
        ArtifactsType oldArtifacts = artifacts;
        artifacts = newArtifacts;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwitchyardPackage.SWITCH_YARD_TYPE__ARTIFACTS, oldArtifacts, newArtifacts);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setArtifacts(ArtifactsType newArtifacts) {
        if (newArtifacts != artifacts) {
            NotificationChain msgs = null;
            if (artifacts != null)
                msgs = ((InternalEObject)artifacts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.SWITCH_YARD_TYPE__ARTIFACTS, null, msgs);
            if (newArtifacts != null)
                msgs = ((InternalEObject)newArtifacts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.SWITCH_YARD_TYPE__ARTIFACTS, null, msgs);
            msgs = basicSetArtifacts(newArtifacts, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.SWITCH_YARD_TYPE__ARTIFACTS, newArtifacts, newArtifacts));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SwitchyardPackage.SWITCH_YARD_TYPE__COMPOSITE:
                return basicSetComposite(null, msgs);
            case SwitchyardPackage.SWITCH_YARD_TYPE__TRANSFORMS:
                return basicSetTransforms(null, msgs);
            case SwitchyardPackage.SWITCH_YARD_TYPE__VALIDATES:
                return basicSetValidates(null, msgs);
            case SwitchyardPackage.SWITCH_YARD_TYPE__DOMAIN:
                return basicSetDomain(null, msgs);
            case SwitchyardPackage.SWITCH_YARD_TYPE__ARTIFACTS:
                return basicSetArtifacts(null, msgs);
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
            case SwitchyardPackage.SWITCH_YARD_TYPE__COMPOSITE:
                return getComposite();
            case SwitchyardPackage.SWITCH_YARD_TYPE__TRANSFORMS:
                return getTransforms();
            case SwitchyardPackage.SWITCH_YARD_TYPE__VALIDATES:
                return getValidates();
            case SwitchyardPackage.SWITCH_YARD_TYPE__DOMAIN:
                return getDomain();
            case SwitchyardPackage.SWITCH_YARD_TYPE__ARTIFACTS:
                return getArtifacts();
            case SwitchyardPackage.SWITCH_YARD_TYPE__NAME:
                return getName();
            case SwitchyardPackage.SWITCH_YARD_TYPE__TARGET_NAMESPACE:
                return getTargetNamespace();
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
            case SwitchyardPackage.SWITCH_YARD_TYPE__COMPOSITE:
                setComposite((Composite)newValue);
                return;
            case SwitchyardPackage.SWITCH_YARD_TYPE__TRANSFORMS:
                setTransforms((TransformsType)newValue);
                return;
            case SwitchyardPackage.SWITCH_YARD_TYPE__VALIDATES:
                setValidates((ValidatesType)newValue);
                return;
            case SwitchyardPackage.SWITCH_YARD_TYPE__DOMAIN:
                setDomain((DomainType)newValue);
                return;
            case SwitchyardPackage.SWITCH_YARD_TYPE__ARTIFACTS:
                setArtifacts((ArtifactsType)newValue);
                return;
            case SwitchyardPackage.SWITCH_YARD_TYPE__NAME:
                setName((String)newValue);
                return;
            case SwitchyardPackage.SWITCH_YARD_TYPE__TARGET_NAMESPACE:
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
            case SwitchyardPackage.SWITCH_YARD_TYPE__COMPOSITE:
                setComposite((Composite)null);
                return;
            case SwitchyardPackage.SWITCH_YARD_TYPE__TRANSFORMS:
                setTransforms((TransformsType)null);
                return;
            case SwitchyardPackage.SWITCH_YARD_TYPE__VALIDATES:
                setValidates((ValidatesType)null);
                return;
            case SwitchyardPackage.SWITCH_YARD_TYPE__DOMAIN:
                setDomain((DomainType)null);
                return;
            case SwitchyardPackage.SWITCH_YARD_TYPE__ARTIFACTS:
                setArtifacts((ArtifactsType)null);
                return;
            case SwitchyardPackage.SWITCH_YARD_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case SwitchyardPackage.SWITCH_YARD_TYPE__TARGET_NAMESPACE:
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
            case SwitchyardPackage.SWITCH_YARD_TYPE__COMPOSITE:
                return composite != null;
            case SwitchyardPackage.SWITCH_YARD_TYPE__TRANSFORMS:
                return transforms != null;
            case SwitchyardPackage.SWITCH_YARD_TYPE__VALIDATES:
                return validates != null;
            case SwitchyardPackage.SWITCH_YARD_TYPE__DOMAIN:
                return domain != null;
            case SwitchyardPackage.SWITCH_YARD_TYPE__ARTIFACTS:
                return artifacts != null;
            case SwitchyardPackage.SWITCH_YARD_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case SwitchyardPackage.SWITCH_YARD_TYPE__TARGET_NAMESPACE:
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
        result.append(" (name: ");
        result.append(name);
        result.append(", targetNamespace: ");
        result.append(targetNamespace);
        result.append(')');
        return result.toString();
    }

} //SwitchYardTypeImpl
