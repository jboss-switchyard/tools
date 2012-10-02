/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.EJBSessionBeanBinding;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.VersionValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EJB Session Bean Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.EJBSessionBeanBindingImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.EJBSessionBeanBindingImpl#getEjbLinkName <em>Ejb Link Name</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.EJBSessionBeanBindingImpl#getEjbVersion <em>Ejb Version</em>}</li>
 *   <li>{@link org.eclipse.soa.sca.sca1_1.model.sca.impl.EJBSessionBeanBindingImpl#getHomeInterface <em>Home Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EJBSessionBeanBindingImpl extends BindingImpl implements EJBSessionBeanBinding {
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
     * The default value of the '{@link #getEjbLinkName() <em>Ejb Link Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEjbLinkName()
     * @generated
     * @ordered
     */
	protected static final String EJB_LINK_NAME_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getEjbLinkName() <em>Ejb Link Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEjbLinkName()
     * @generated
     * @ordered
     */
	protected String ejbLinkName = EJB_LINK_NAME_EDEFAULT;

	/**
     * The default value of the '{@link #getEjbVersion() <em>Ejb Version</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEjbVersion()
     * @generated
     * @ordered
     */
	protected static final VersionValue EJB_VERSION_EDEFAULT = VersionValue.EJB3;

	/**
     * The cached value of the '{@link #getEjbVersion() <em>Ejb Version</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEjbVersion()
     * @generated
     * @ordered
     */
	protected VersionValue ejbVersion = EJB_VERSION_EDEFAULT;

	/**
     * This is true if the Ejb Version attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean ejbVersionESet;

	/**
     * The default value of the '{@link #getHomeInterface() <em>Home Interface</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHomeInterface()
     * @generated
     * @ordered
     */
	protected static final String HOME_INTERFACE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getHomeInterface() <em>Home Interface</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHomeInterface()
     * @generated
     * @ordered
     */
	protected String homeInterface = HOME_INTERFACE_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected EJBSessionBeanBindingImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScaPackage.eINSTANCE.getEJBSessionBeanBinding();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAny() {
        if (any == null) {
            any = new BasicFeatureMap(this, ScaPackage.EJB_SESSION_BEAN_BINDING__ANY);
        }
        return any;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getEjbLinkName() {
        return ejbLinkName;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setEjbLinkName(String newEjbLinkName) {
        String oldEjbLinkName = ejbLinkName;
        ejbLinkName = newEjbLinkName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.EJB_SESSION_BEAN_BINDING__EJB_LINK_NAME, oldEjbLinkName, ejbLinkName));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public VersionValue getEjbVersion() {
        return ejbVersion;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setEjbVersion(VersionValue newEjbVersion) {
        VersionValue oldEjbVersion = ejbVersion;
        ejbVersion = newEjbVersion == null ? EJB_VERSION_EDEFAULT : newEjbVersion;
        boolean oldEjbVersionESet = ejbVersionESet;
        ejbVersionESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.EJB_SESSION_BEAN_BINDING__EJB_VERSION, oldEjbVersion, ejbVersion, !oldEjbVersionESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetEjbVersion() {
        VersionValue oldEjbVersion = ejbVersion;
        boolean oldEjbVersionESet = ejbVersionESet;
        ejbVersion = EJB_VERSION_EDEFAULT;
        ejbVersionESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ScaPackage.EJB_SESSION_BEAN_BINDING__EJB_VERSION, oldEjbVersion, EJB_VERSION_EDEFAULT, oldEjbVersionESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetEjbVersion() {
        return ejbVersionESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getHomeInterface() {
        return homeInterface;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHomeInterface(String newHomeInterface) {
        String oldHomeInterface = homeInterface;
        homeInterface = newHomeInterface;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScaPackage.EJB_SESSION_BEAN_BINDING__HOME_INTERFACE, oldHomeInterface, homeInterface));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScaPackage.EJB_SESSION_BEAN_BINDING__ANY:
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
            case ScaPackage.EJB_SESSION_BEAN_BINDING__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case ScaPackage.EJB_SESSION_BEAN_BINDING__EJB_LINK_NAME:
                return getEjbLinkName();
            case ScaPackage.EJB_SESSION_BEAN_BINDING__EJB_VERSION:
                return getEjbVersion();
            case ScaPackage.EJB_SESSION_BEAN_BINDING__HOME_INTERFACE:
                return getHomeInterface();
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
            case ScaPackage.EJB_SESSION_BEAN_BINDING__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case ScaPackage.EJB_SESSION_BEAN_BINDING__EJB_LINK_NAME:
                setEjbLinkName((String)newValue);
                return;
            case ScaPackage.EJB_SESSION_BEAN_BINDING__EJB_VERSION:
                setEjbVersion((VersionValue)newValue);
                return;
            case ScaPackage.EJB_SESSION_BEAN_BINDING__HOME_INTERFACE:
                setHomeInterface((String)newValue);
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
            case ScaPackage.EJB_SESSION_BEAN_BINDING__ANY:
                getAny().clear();
                return;
            case ScaPackage.EJB_SESSION_BEAN_BINDING__EJB_LINK_NAME:
                setEjbLinkName(EJB_LINK_NAME_EDEFAULT);
                return;
            case ScaPackage.EJB_SESSION_BEAN_BINDING__EJB_VERSION:
                unsetEjbVersion();
                return;
            case ScaPackage.EJB_SESSION_BEAN_BINDING__HOME_INTERFACE:
                setHomeInterface(HOME_INTERFACE_EDEFAULT);
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
            case ScaPackage.EJB_SESSION_BEAN_BINDING__ANY:
                return any != null && !any.isEmpty();
            case ScaPackage.EJB_SESSION_BEAN_BINDING__EJB_LINK_NAME:
                return EJB_LINK_NAME_EDEFAULT == null ? ejbLinkName != null : !EJB_LINK_NAME_EDEFAULT.equals(ejbLinkName);
            case ScaPackage.EJB_SESSION_BEAN_BINDING__EJB_VERSION:
                return isSetEjbVersion();
            case ScaPackage.EJB_SESSION_BEAN_BINDING__HOME_INTERFACE:
                return HOME_INTERFACE_EDEFAULT == null ? homeInterface != null : !HOME_INTERFACE_EDEFAULT.equals(homeInterface);
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
        result.append(" (any: ");
        result.append(any);
        result.append(", ejbLinkName: ");
        result.append(ejbLinkName);
        result.append(", ejbVersion: ");
        if (ejbVersionESet) result.append(ejbVersion); else result.append("<unset>");
        result.append(", homeInterface: ");
        result.append(homeInterface);
        result.append(')');
        return result.toString();
    }

} //EJBSessionBeanBindingImpl
