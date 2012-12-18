/**
 */
package org.switchyard.tools.models.switchyard1_0.bpm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.soa.sca.sca1_1.model.sca.impl.CommonExtensionBaseImpl;

import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.ContainerType;
import org.switchyard.tools.models.switchyard1_0.bpm.ManifestType;
import org.switchyard.tools.models.switchyard1_0.bpm.ResourcesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manifest Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ManifestTypeImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ManifestTypeImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ManifestTypeImpl#isScan <em>Scan</em>}</li>
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
     * The default value of the '{@link #isScan() <em>Scan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isScan()
     * @generated
     * @ordered
     */
    protected static final boolean SCAN_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isScan() <em>Scan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isScan()
     * @generated
     * @ordered
     */
    protected boolean scan = SCAN_EDEFAULT;

    /**
     * This is true if the Scan attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean scanESet;

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
        return BPMPackage.Literals.MANIFEST_TYPE;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMPackage.MANIFEST_TYPE__CONTAINER, oldContainer, newContainer);
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
                msgs = ((InternalEObject)container).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMPackage.MANIFEST_TYPE__CONTAINER, null, msgs);
            if (newContainer != null)
                msgs = ((InternalEObject)newContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMPackage.MANIFEST_TYPE__CONTAINER, null, msgs);
            msgs = basicSetContainer(newContainer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.MANIFEST_TYPE__CONTAINER, newContainer, newContainer));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMPackage.MANIFEST_TYPE__RESOURCES, oldResources, newResources);
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
                msgs = ((InternalEObject)resources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMPackage.MANIFEST_TYPE__RESOURCES, null, msgs);
            if (newResources != null)
                msgs = ((InternalEObject)newResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMPackage.MANIFEST_TYPE__RESOURCES, null, msgs);
            msgs = basicSetResources(newResources, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.MANIFEST_TYPE__RESOURCES, newResources, newResources));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isScan() {
        return scan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScan(boolean newScan) {
        boolean oldScan = scan;
        scan = newScan;
        boolean oldScanESet = scanESet;
        scanESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.MANIFEST_TYPE__SCAN, oldScan, scan, !oldScanESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetScan() {
        boolean oldScan = scan;
        boolean oldScanESet = scanESet;
        scan = SCAN_EDEFAULT;
        scanESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, BPMPackage.MANIFEST_TYPE__SCAN, oldScan, SCAN_EDEFAULT, oldScanESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetScan() {
        return scanESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BPMPackage.MANIFEST_TYPE__CONTAINER:
                return basicSetContainer(null, msgs);
            case BPMPackage.MANIFEST_TYPE__RESOURCES:
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
            case BPMPackage.MANIFEST_TYPE__CONTAINER:
                return getContainer();
            case BPMPackage.MANIFEST_TYPE__RESOURCES:
                return getResources();
            case BPMPackage.MANIFEST_TYPE__SCAN:
                return isScan();
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
            case BPMPackage.MANIFEST_TYPE__CONTAINER:
                setContainer((ContainerType)newValue);
                return;
            case BPMPackage.MANIFEST_TYPE__RESOURCES:
                setResources((ResourcesType)newValue);
                return;
            case BPMPackage.MANIFEST_TYPE__SCAN:
                setScan((Boolean)newValue);
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
            case BPMPackage.MANIFEST_TYPE__CONTAINER:
                setContainer((ContainerType)null);
                return;
            case BPMPackage.MANIFEST_TYPE__RESOURCES:
                setResources((ResourcesType)null);
                return;
            case BPMPackage.MANIFEST_TYPE__SCAN:
                unsetScan();
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
            case BPMPackage.MANIFEST_TYPE__CONTAINER:
                return container != null;
            case BPMPackage.MANIFEST_TYPE__RESOURCES:
                return resources != null;
            case BPMPackage.MANIFEST_TYPE__SCAN:
                return isSetScan();
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
        result.append(" (scan: ");
        if (scanESet) result.append(scan); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ManifestTypeImpl
