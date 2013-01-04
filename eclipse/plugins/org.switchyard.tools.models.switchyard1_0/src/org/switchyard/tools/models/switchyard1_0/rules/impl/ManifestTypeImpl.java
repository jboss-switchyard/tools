/**
 */
package org.switchyard.tools.models.switchyard1_0.rules.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.soa.sca.sca1_1.model.sca.impl.CommonExtensionBaseImpl;

import org.switchyard.tools.models.switchyard1_0.rules.ContainerType;
import org.switchyard.tools.models.switchyard1_0.rules.ManifestType;
import org.switchyard.tools.models.switchyard1_0.rules.ResourcesType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manifest Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ManifestTypeImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.impl.ManifestTypeImpl#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManifestTypeImpl extends CommonExtensionBaseImpl implements ManifestType {
    /**
     * The cached value of the '{@link #getContainer() <em>Container</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainer()
     * @generated
     * @ordered
     */
    protected ContainerType container;

    /**
     * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResources()
     * @generated
     * @ordered
     */
    protected ResourcesType resources;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ManifestTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RulesPackage.Literals.MANIFEST_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContainerType getContainer() {
        return container;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContainer(ContainerType newContainer, NotificationChain msgs) {
        ContainerType oldContainer = container;
        container = newContainer;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.MANIFEST_TYPE__CONTAINER, oldContainer, newContainer);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContainer(ContainerType newContainer) {
        if (newContainer != container) {
            NotificationChain msgs = null;
            if (container != null)
                msgs = ((InternalEObject)container).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.MANIFEST_TYPE__CONTAINER, null, msgs);
            if (newContainer != null)
                msgs = ((InternalEObject)newContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.MANIFEST_TYPE__CONTAINER, null, msgs);
            msgs = basicSetContainer(newContainer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.MANIFEST_TYPE__CONTAINER, newContainer, newContainer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourcesType getResources() {
        return resources;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetResources(ResourcesType newResources, NotificationChain msgs) {
        ResourcesType oldResources = resources;
        resources = newResources;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.MANIFEST_TYPE__RESOURCES, oldResources, newResources);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResources(ResourcesType newResources) {
        if (newResources != resources) {
            NotificationChain msgs = null;
            if (resources != null)
                msgs = ((InternalEObject)resources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.MANIFEST_TYPE__RESOURCES, null, msgs);
            if (newResources != null)
                msgs = ((InternalEObject)newResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.MANIFEST_TYPE__RESOURCES, null, msgs);
            msgs = basicSetResources(newResources, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.MANIFEST_TYPE__RESOURCES, newResources, newResources));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RulesPackage.MANIFEST_TYPE__CONTAINER:
                return basicSetContainer(null, msgs);
            case RulesPackage.MANIFEST_TYPE__RESOURCES:
                return basicSetResources(null, msgs);
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
            case RulesPackage.MANIFEST_TYPE__CONTAINER:
                return getContainer();
            case RulesPackage.MANIFEST_TYPE__RESOURCES:
                return getResources();
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
            case RulesPackage.MANIFEST_TYPE__CONTAINER:
                setContainer((ContainerType)newValue);
                return;
            case RulesPackage.MANIFEST_TYPE__RESOURCES:
                setResources((ResourcesType)newValue);
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
            case RulesPackage.MANIFEST_TYPE__CONTAINER:
                setContainer((ContainerType)null);
                return;
            case RulesPackage.MANIFEST_TYPE__RESOURCES:
                setResources((ResourcesType)null);
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
            case RulesPackage.MANIFEST_TYPE__CONTAINER:
                return container != null;
            case RulesPackage.MANIFEST_TYPE__RESOURCES:
                return resources != null;
        }
        return super.eIsSet(featureID);
    }

} //ManifestTypeImpl
