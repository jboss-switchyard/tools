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

import org.switchyard.tools.models.switchyard1_0.switchyard.DomainType;
import org.switchyard.tools.models.switchyard1_0.switchyard.HandlersType;
import org.switchyard.tools.models.switchyard1_0.switchyard.PropertiesType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SecuritiesType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformsType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidatesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DomainTypeImpl#getTransforms <em>Transforms</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DomainTypeImpl#getValidates <em>Validates</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DomainTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DomainTypeImpl#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DomainTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DomainTypeImpl#getSecurities <em>Securities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainTypeImpl extends EObjectImpl implements DomainType {
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
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
	protected PropertiesType properties;

	/**
     * The cached value of the '{@link #getHandlers() <em>Handlers</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHandlers()
     * @generated
     * @ordered
     */
	protected HandlersType handlers;

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
     * The cached value of the '{@link #getSecurities() <em>Securities</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSecurities()
     * @generated
     * @ordered
     */
    protected SecuritiesType securities;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected DomainTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SwitchyardPackage.Literals.DOMAIN_TYPE;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwitchyardPackage.DOMAIN_TYPE__TRANSFORMS, oldTransforms, newTransforms);
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
                msgs = ((InternalEObject)transforms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.DOMAIN_TYPE__TRANSFORMS, null, msgs);
            if (newTransforms != null)
                msgs = ((InternalEObject)newTransforms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.DOMAIN_TYPE__TRANSFORMS, null, msgs);
            msgs = basicSetTransforms(newTransforms, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.DOMAIN_TYPE__TRANSFORMS, newTransforms, newTransforms));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwitchyardPackage.DOMAIN_TYPE__VALIDATES, oldValidates, newValidates);
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
                msgs = ((InternalEObject)validates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.DOMAIN_TYPE__VALIDATES, null, msgs);
            if (newValidates != null)
                msgs = ((InternalEObject)newValidates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.DOMAIN_TYPE__VALIDATES, null, msgs);
            msgs = basicSetValidates(newValidates, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.DOMAIN_TYPE__VALIDATES, newValidates, newValidates));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PropertiesType getProperties() {
        return properties;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetProperties(PropertiesType newProperties, NotificationChain msgs) {
        PropertiesType oldProperties = properties;
        properties = newProperties;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwitchyardPackage.DOMAIN_TYPE__PROPERTIES, oldProperties, newProperties);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setProperties(PropertiesType newProperties) {
        if (newProperties != properties) {
            NotificationChain msgs = null;
            if (properties != null)
                msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.DOMAIN_TYPE__PROPERTIES, null, msgs);
            if (newProperties != null)
                msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.DOMAIN_TYPE__PROPERTIES, null, msgs);
            msgs = basicSetProperties(newProperties, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.DOMAIN_TYPE__PROPERTIES, newProperties, newProperties));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public HandlersType getHandlers() {
        return handlers;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetHandlers(HandlersType newHandlers, NotificationChain msgs) {
        HandlersType oldHandlers = handlers;
        handlers = newHandlers;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwitchyardPackage.DOMAIN_TYPE__HANDLERS, oldHandlers, newHandlers);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHandlers(HandlersType newHandlers) {
        if (newHandlers != handlers) {
            NotificationChain msgs = null;
            if (handlers != null)
                msgs = ((InternalEObject)handlers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.DOMAIN_TYPE__HANDLERS, null, msgs);
            if (newHandlers != null)
                msgs = ((InternalEObject)newHandlers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.DOMAIN_TYPE__HANDLERS, null, msgs);
            msgs = basicSetHandlers(newHandlers, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.DOMAIN_TYPE__HANDLERS, newHandlers, newHandlers));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.DOMAIN_TYPE__NAME, oldName, name));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SecuritiesType getSecurities() {
        return securities;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSecurities(SecuritiesType newSecurities, NotificationChain msgs) {
        SecuritiesType oldSecurities = securities;
        securities = newSecurities;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwitchyardPackage.DOMAIN_TYPE__SECURITIES, oldSecurities, newSecurities);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSecurities(SecuritiesType newSecurities) {
        if (newSecurities != securities) {
            NotificationChain msgs = null;
            if (securities != null)
                msgs = ((InternalEObject)securities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.DOMAIN_TYPE__SECURITIES, null, msgs);
            if (newSecurities != null)
                msgs = ((InternalEObject)newSecurities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.DOMAIN_TYPE__SECURITIES, null, msgs);
            msgs = basicSetSecurities(newSecurities, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.DOMAIN_TYPE__SECURITIES, newSecurities, newSecurities));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SwitchyardPackage.DOMAIN_TYPE__TRANSFORMS:
                return basicSetTransforms(null, msgs);
            case SwitchyardPackage.DOMAIN_TYPE__VALIDATES:
                return basicSetValidates(null, msgs);
            case SwitchyardPackage.DOMAIN_TYPE__PROPERTIES:
                return basicSetProperties(null, msgs);
            case SwitchyardPackage.DOMAIN_TYPE__HANDLERS:
                return basicSetHandlers(null, msgs);
            case SwitchyardPackage.DOMAIN_TYPE__SECURITIES:
                return basicSetSecurities(null, msgs);
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
            case SwitchyardPackage.DOMAIN_TYPE__TRANSFORMS:
                return getTransforms();
            case SwitchyardPackage.DOMAIN_TYPE__VALIDATES:
                return getValidates();
            case SwitchyardPackage.DOMAIN_TYPE__PROPERTIES:
                return getProperties();
            case SwitchyardPackage.DOMAIN_TYPE__HANDLERS:
                return getHandlers();
            case SwitchyardPackage.DOMAIN_TYPE__NAME:
                return getName();
            case SwitchyardPackage.DOMAIN_TYPE__SECURITIES:
                return getSecurities();
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
            case SwitchyardPackage.DOMAIN_TYPE__TRANSFORMS:
                setTransforms((TransformsType)newValue);
                return;
            case SwitchyardPackage.DOMAIN_TYPE__VALIDATES:
                setValidates((ValidatesType)newValue);
                return;
            case SwitchyardPackage.DOMAIN_TYPE__PROPERTIES:
                setProperties((PropertiesType)newValue);
                return;
            case SwitchyardPackage.DOMAIN_TYPE__HANDLERS:
                setHandlers((HandlersType)newValue);
                return;
            case SwitchyardPackage.DOMAIN_TYPE__NAME:
                setName((String)newValue);
                return;
            case SwitchyardPackage.DOMAIN_TYPE__SECURITIES:
                setSecurities((SecuritiesType)newValue);
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
            case SwitchyardPackage.DOMAIN_TYPE__TRANSFORMS:
                setTransforms((TransformsType)null);
                return;
            case SwitchyardPackage.DOMAIN_TYPE__VALIDATES:
                setValidates((ValidatesType)null);
                return;
            case SwitchyardPackage.DOMAIN_TYPE__PROPERTIES:
                setProperties((PropertiesType)null);
                return;
            case SwitchyardPackage.DOMAIN_TYPE__HANDLERS:
                setHandlers((HandlersType)null);
                return;
            case SwitchyardPackage.DOMAIN_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case SwitchyardPackage.DOMAIN_TYPE__SECURITIES:
                setSecurities((SecuritiesType)null);
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
            case SwitchyardPackage.DOMAIN_TYPE__TRANSFORMS:
                return transforms != null;
            case SwitchyardPackage.DOMAIN_TYPE__VALIDATES:
                return validates != null;
            case SwitchyardPackage.DOMAIN_TYPE__PROPERTIES:
                return properties != null;
            case SwitchyardPackage.DOMAIN_TYPE__HANDLERS:
                return handlers != null;
            case SwitchyardPackage.DOMAIN_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case SwitchyardPackage.DOMAIN_TYPE__SECURITIES:
                return securities != null;
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
        result.append(')');
        return result.toString();
    }

} //DomainTypeImpl
