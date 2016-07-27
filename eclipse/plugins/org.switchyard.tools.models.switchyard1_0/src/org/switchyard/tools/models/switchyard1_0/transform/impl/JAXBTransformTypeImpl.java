/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.transform.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.impl.TransformTypeImpl;
import org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.TransformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JAXB Transform Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.impl.JAXBTransformTypeImpl#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.impl.JAXBTransformTypeImpl#getEnableAttachment <em>Enable Attachment</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.impl.JAXBTransformTypeImpl#getEnableXOPPackage <em>Enable XOP Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JAXBTransformTypeImpl extends TransformTypeImpl implements JAXBTransformType {
	/**
     * The default value of the '{@link #getContextPath() <em>Context Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextPath()
     * @generated
     * @ordered
     */
    protected static final String CONTEXT_PATH_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getContextPath() <em>Context Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextPath()
     * @generated
     * @ordered
     */
    protected String contextPath = CONTEXT_PATH_EDEFAULT;

    /**
     * The default value of the '{@link #getEnableAttachment() <em>Enable Attachment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnableAttachment()
     * @generated
     * @ordered
     */
    protected static final Object ENABLE_ATTACHMENT_EDEFAULT = SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.eINSTANCE.getPropBoolean(), "false");
    /**
     * The cached value of the '{@link #getEnableAttachment() <em>Enable Attachment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnableAttachment()
     * @generated
     * @ordered
     */
    protected Object enableAttachment = ENABLE_ATTACHMENT_EDEFAULT;
    /**
     * This is true if the Enable Attachment attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean enableAttachmentESet;
    /**
     * The default value of the '{@link #getEnableXOPPackage() <em>Enable XOP Package</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnableXOPPackage()
     * @generated
     * @ordered
     */
    protected static final Object ENABLE_XOP_PACKAGE_EDEFAULT = SwitchyardFactory.eINSTANCE.createFromString(SwitchyardPackage.eINSTANCE.getPropBoolean(), "true");
    /**
     * The cached value of the '{@link #getEnableXOPPackage() <em>Enable XOP Package</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnableXOPPackage()
     * @generated
     * @ordered
     */
    protected Object enableXOPPackage = ENABLE_XOP_PACKAGE_EDEFAULT;
    /**
     * This is true if the Enable XOP Package attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean enableXOPPackageESet;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected JAXBTransformTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return TransformPackage.Literals.JAXB_TRANSFORM_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getContextPath() {
        return contextPath;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextPath(String newContextPath) {
        String oldContextPath = contextPath;
        contextPath = newContextPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformPackage.JAXB_TRANSFORM_TYPE__CONTEXT_PATH, oldContextPath, contextPath));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getEnableAttachment() {
        return enableAttachment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnableAttachment(Object newEnableAttachment) {
        Object oldEnableAttachment = enableAttachment;
        enableAttachment = newEnableAttachment;
        boolean oldEnableAttachmentESet = enableAttachmentESet;
        enableAttachmentESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformPackage.JAXB_TRANSFORM_TYPE__ENABLE_ATTACHMENT, oldEnableAttachment, enableAttachment, !oldEnableAttachmentESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetEnableAttachment() {
        Object oldEnableAttachment = enableAttachment;
        boolean oldEnableAttachmentESet = enableAttachmentESet;
        enableAttachment = ENABLE_ATTACHMENT_EDEFAULT;
        enableAttachmentESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TransformPackage.JAXB_TRANSFORM_TYPE__ENABLE_ATTACHMENT, oldEnableAttachment, ENABLE_ATTACHMENT_EDEFAULT, oldEnableAttachmentESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetEnableAttachment() {
        return enableAttachmentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getEnableXOPPackage() {
        return enableXOPPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnableXOPPackage(Object newEnableXOPPackage) {
        Object oldEnableXOPPackage = enableXOPPackage;
        enableXOPPackage = newEnableXOPPackage;
        boolean oldEnableXOPPackageESet = enableXOPPackageESet;
        enableXOPPackageESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformPackage.JAXB_TRANSFORM_TYPE__ENABLE_XOP_PACKAGE, oldEnableXOPPackage, enableXOPPackage, !oldEnableXOPPackageESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetEnableXOPPackage() {
        Object oldEnableXOPPackage = enableXOPPackage;
        boolean oldEnableXOPPackageESet = enableXOPPackageESet;
        enableXOPPackage = ENABLE_XOP_PACKAGE_EDEFAULT;
        enableXOPPackageESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TransformPackage.JAXB_TRANSFORM_TYPE__ENABLE_XOP_PACKAGE, oldEnableXOPPackage, ENABLE_XOP_PACKAGE_EDEFAULT, oldEnableXOPPackageESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetEnableXOPPackage() {
        return enableXOPPackageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TransformPackage.JAXB_TRANSFORM_TYPE__CONTEXT_PATH:
                return getContextPath();
            case TransformPackage.JAXB_TRANSFORM_TYPE__ENABLE_ATTACHMENT:
                return getEnableAttachment();
            case TransformPackage.JAXB_TRANSFORM_TYPE__ENABLE_XOP_PACKAGE:
                return getEnableXOPPackage();
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
            case TransformPackage.JAXB_TRANSFORM_TYPE__CONTEXT_PATH:
                setContextPath((String)newValue);
                return;
            case TransformPackage.JAXB_TRANSFORM_TYPE__ENABLE_ATTACHMENT:
                setEnableAttachment(newValue);
                return;
            case TransformPackage.JAXB_TRANSFORM_TYPE__ENABLE_XOP_PACKAGE:
                setEnableXOPPackage(newValue);
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
            case TransformPackage.JAXB_TRANSFORM_TYPE__CONTEXT_PATH:
                setContextPath(CONTEXT_PATH_EDEFAULT);
                return;
            case TransformPackage.JAXB_TRANSFORM_TYPE__ENABLE_ATTACHMENT:
                unsetEnableAttachment();
                return;
            case TransformPackage.JAXB_TRANSFORM_TYPE__ENABLE_XOP_PACKAGE:
                unsetEnableXOPPackage();
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
            case TransformPackage.JAXB_TRANSFORM_TYPE__CONTEXT_PATH:
                return CONTEXT_PATH_EDEFAULT == null ? contextPath != null : !CONTEXT_PATH_EDEFAULT.equals(contextPath);
            case TransformPackage.JAXB_TRANSFORM_TYPE__ENABLE_ATTACHMENT:
                return isSetEnableAttachment();
            case TransformPackage.JAXB_TRANSFORM_TYPE__ENABLE_XOP_PACKAGE:
                return isSetEnableXOPPackage();
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
        result.append(" (contextPath: ");
        result.append(contextPath);
        result.append(", enableAttachment: ");
        if (enableAttachmentESet) result.append(enableAttachment); else result.append("<unset>");
        result.append(", enableXOPPackage: ");
        if (enableXOPPackageESet) result.append(enableXOPPackage); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //JAXBTransformTypeImpl
