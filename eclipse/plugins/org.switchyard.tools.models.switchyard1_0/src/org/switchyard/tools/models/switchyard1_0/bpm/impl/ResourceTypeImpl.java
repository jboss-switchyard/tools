/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.bpm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.soa.sca.sca1_1.model.sca.impl.CommonExtensionBaseImpl;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.ResourceDetailType;
import org.switchyard.tools.models.switchyard1_0.bpm.ResourceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ResourceTypeImpl#getResourceDetail <em>Resource Detail</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ResourceTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ResourceTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceTypeImpl extends CommonExtensionBaseImpl implements ResourceType {
	/**
     * The cached value of the '{@link #getResourceDetail() <em>Resource Detail</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResourceDetail()
     * @generated
     * @ordered
     */
    protected ResourceDetailType resourceDetail;
    /**
     * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected static final String LOCATION_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected String location = LOCATION_EDEFAULT;
    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ResourceTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return BPMPackage.Literals.RESOURCE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceDetailType getResourceDetail() {
        return resourceDetail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetResourceDetail(ResourceDetailType newResourceDetail, NotificationChain msgs) {
        ResourceDetailType oldResourceDetail = resourceDetail;
        resourceDetail = newResourceDetail;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMPackage.RESOURCE_TYPE__RESOURCE_DETAIL, oldResourceDetail, newResourceDetail);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResourceDetail(ResourceDetailType newResourceDetail) {
        if (newResourceDetail != resourceDetail) {
            NotificationChain msgs = null;
            if (resourceDetail != null)
                msgs = ((InternalEObject)resourceDetail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMPackage.RESOURCE_TYPE__RESOURCE_DETAIL, null, msgs);
            if (newResourceDetail != null)
                msgs = ((InternalEObject)newResourceDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMPackage.RESOURCE_TYPE__RESOURCE_DETAIL, null, msgs);
            msgs = basicSetResourceDetail(newResourceDetail, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.RESOURCE_TYPE__RESOURCE_DETAIL, newResourceDetail, newResourceDetail));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLocation() {
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocation(String newLocation) {
        String oldLocation = location;
        location = newLocation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.RESOURCE_TYPE__LOCATION, oldLocation, location));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.RESOURCE_TYPE__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BPMPackage.RESOURCE_TYPE__RESOURCE_DETAIL:
                return basicSetResourceDetail(null, msgs);
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
            case BPMPackage.RESOURCE_TYPE__RESOURCE_DETAIL:
                return getResourceDetail();
            case BPMPackage.RESOURCE_TYPE__LOCATION:
                return getLocation();
            case BPMPackage.RESOURCE_TYPE__TYPE:
                return getType();
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
            case BPMPackage.RESOURCE_TYPE__RESOURCE_DETAIL:
                setResourceDetail((ResourceDetailType)newValue);
                return;
            case BPMPackage.RESOURCE_TYPE__LOCATION:
                setLocation((String)newValue);
                return;
            case BPMPackage.RESOURCE_TYPE__TYPE:
                setType((String)newValue);
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
            case BPMPackage.RESOURCE_TYPE__RESOURCE_DETAIL:
                setResourceDetail((ResourceDetailType)null);
                return;
            case BPMPackage.RESOURCE_TYPE__LOCATION:
                setLocation(LOCATION_EDEFAULT);
                return;
            case BPMPackage.RESOURCE_TYPE__TYPE:
                setType(TYPE_EDEFAULT);
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
            case BPMPackage.RESOURCE_TYPE__RESOURCE_DETAIL:
                return resourceDetail != null;
            case BPMPackage.RESOURCE_TYPE__LOCATION:
                return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
            case BPMPackage.RESOURCE_TYPE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
        result.append(" (location: ");
        result.append(location);
        result.append(", type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

} //ResourceTypeImpl
