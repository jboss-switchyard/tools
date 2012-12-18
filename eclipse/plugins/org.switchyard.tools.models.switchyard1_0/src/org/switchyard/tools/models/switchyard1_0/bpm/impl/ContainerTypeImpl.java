/**
 */
package org.switchyard.tools.models.switchyard1_0.bpm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.soa.sca.sca1_1.model.sca.impl.CommonExtensionBaseImpl;

import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.ContainerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ContainerTypeImpl#getBaseName <em>Base Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ContainerTypeImpl#getReleaseId <em>Release Id</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.ContainerTypeImpl#getSessionName <em>Session Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerTypeImpl extends CommonExtensionBaseImpl implements ContainerType {
    /**
     * The default value of the '{@link #getBaseName() <em>Base Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaseName()
     * @generated
     * @ordered
     */
    protected static final String BASE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBaseName() <em>Base Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaseName()
     * @generated
     * @ordered
     */
    protected String baseName = BASE_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getReleaseId() <em>Release Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReleaseId()
     * @generated
     * @ordered
     */
    protected static final String RELEASE_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReleaseId() <em>Release Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReleaseId()
     * @generated
     * @ordered
     */
    protected String releaseId = RELEASE_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getSessionName() <em>Session Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSessionName()
     * @generated
     * @ordered
     */
    protected static final String SESSION_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSessionName() <em>Session Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSessionName()
     * @generated
     * @ordered
     */
    protected String sessionName = SESSION_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContainerTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BPMPackage.Literals.CONTAINER_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBaseName() {
        return baseName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBaseName(String newBaseName) {
        String oldBaseName = baseName;
        baseName = newBaseName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.CONTAINER_TYPE__BASE_NAME, oldBaseName, baseName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getReleaseId() {
        return releaseId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReleaseId(String newReleaseId) {
        String oldReleaseId = releaseId;
        releaseId = newReleaseId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.CONTAINER_TYPE__RELEASE_ID, oldReleaseId, releaseId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSessionName() {
        return sessionName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSessionName(String newSessionName) {
        String oldSessionName = sessionName;
        sessionName = newSessionName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.CONTAINER_TYPE__SESSION_NAME, oldSessionName, sessionName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BPMPackage.CONTAINER_TYPE__BASE_NAME:
                return getBaseName();
            case BPMPackage.CONTAINER_TYPE__RELEASE_ID:
                return getReleaseId();
            case BPMPackage.CONTAINER_TYPE__SESSION_NAME:
                return getSessionName();
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
            case BPMPackage.CONTAINER_TYPE__BASE_NAME:
                setBaseName((String)newValue);
                return;
            case BPMPackage.CONTAINER_TYPE__RELEASE_ID:
                setReleaseId((String)newValue);
                return;
            case BPMPackage.CONTAINER_TYPE__SESSION_NAME:
                setSessionName((String)newValue);
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
            case BPMPackage.CONTAINER_TYPE__BASE_NAME:
                setBaseName(BASE_NAME_EDEFAULT);
                return;
            case BPMPackage.CONTAINER_TYPE__RELEASE_ID:
                setReleaseId(RELEASE_ID_EDEFAULT);
                return;
            case BPMPackage.CONTAINER_TYPE__SESSION_NAME:
                setSessionName(SESSION_NAME_EDEFAULT);
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
            case BPMPackage.CONTAINER_TYPE__BASE_NAME:
                return BASE_NAME_EDEFAULT == null ? baseName != null : !BASE_NAME_EDEFAULT.equals(baseName);
            case BPMPackage.CONTAINER_TYPE__RELEASE_ID:
                return RELEASE_ID_EDEFAULT == null ? releaseId != null : !RELEASE_ID_EDEFAULT.equals(releaseId);
            case BPMPackage.CONTAINER_TYPE__SESSION_NAME:
                return SESSION_NAME_EDEFAULT == null ? sessionName != null : !SESSION_NAME_EDEFAULT.equals(sessionName);
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
        result.append(" (baseName: ");
        result.append(baseName);
        result.append(", releaseId: ");
        result.append(releaseId);
        result.append(", sessionName: ");
        result.append(sessionName);
        result.append(')');
        return result.toString();
    }

} //ContainerTypeImpl
