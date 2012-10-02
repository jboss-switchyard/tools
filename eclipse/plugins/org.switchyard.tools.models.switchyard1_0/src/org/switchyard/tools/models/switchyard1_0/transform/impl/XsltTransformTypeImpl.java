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
import org.switchyard.tools.models.switchyard1_0.switchyard.impl.TransformTypeImpl;
import org.switchyard.tools.models.switchyard1_0.transform.TransformPackage;
import org.switchyard.tools.models.switchyard1_0.transform.XsltTransformType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xslt Transform Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.impl.XsltTransformTypeImpl#getXsltFile <em>Xslt File</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.impl.XsltTransformTypeImpl#getFailOnWarning <em>Fail On Warning</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XsltTransformTypeImpl extends TransformTypeImpl implements XsltTransformType {
	/**
     * The default value of the '{@link #getXsltFile() <em>Xslt File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXsltFile()
     * @generated
     * @ordered
     */
    protected static final String XSLT_FILE_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getXsltFile() <em>Xslt File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXsltFile()
     * @generated
     * @ordered
     */
    protected String xsltFile = XSLT_FILE_EDEFAULT;
    /**
     * The default value of the '{@link #getFailOnWarning() <em>Fail On Warning</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFailOnWarning()
     * @generated
     * @ordered
     */
    protected static final String FAIL_ON_WARNING_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getFailOnWarning() <em>Fail On Warning</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFailOnWarning()
     * @generated
     * @ordered
     */
    protected String failOnWarning = FAIL_ON_WARNING_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected XsltTransformTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return TransformPackage.Literals.XSLT_TRANSFORM_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getXsltFile() {
        return xsltFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setXsltFile(String newXsltFile) {
        String oldXsltFile = xsltFile;
        xsltFile = newXsltFile;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformPackage.XSLT_TRANSFORM_TYPE__XSLT_FILE, oldXsltFile, xsltFile));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFailOnWarning() {
        return failOnWarning;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFailOnWarning(String newFailOnWarning) {
        String oldFailOnWarning = failOnWarning;
        failOnWarning = newFailOnWarning;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformPackage.XSLT_TRANSFORM_TYPE__FAIL_ON_WARNING, oldFailOnWarning, failOnWarning));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TransformPackage.XSLT_TRANSFORM_TYPE__XSLT_FILE:
                return getXsltFile();
            case TransformPackage.XSLT_TRANSFORM_TYPE__FAIL_ON_WARNING:
                return getFailOnWarning();
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
            case TransformPackage.XSLT_TRANSFORM_TYPE__XSLT_FILE:
                setXsltFile((String)newValue);
                return;
            case TransformPackage.XSLT_TRANSFORM_TYPE__FAIL_ON_WARNING:
                setFailOnWarning((String)newValue);
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
            case TransformPackage.XSLT_TRANSFORM_TYPE__XSLT_FILE:
                setXsltFile(XSLT_FILE_EDEFAULT);
                return;
            case TransformPackage.XSLT_TRANSFORM_TYPE__FAIL_ON_WARNING:
                setFailOnWarning(FAIL_ON_WARNING_EDEFAULT);
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
            case TransformPackage.XSLT_TRANSFORM_TYPE__XSLT_FILE:
                return XSLT_FILE_EDEFAULT == null ? xsltFile != null : !XSLT_FILE_EDEFAULT.equals(xsltFile);
            case TransformPackage.XSLT_TRANSFORM_TYPE__FAIL_ON_WARNING:
                return FAIL_ON_WARNING_EDEFAULT == null ? failOnWarning != null : !FAIL_ON_WARNING_EDEFAULT.equals(failOnWarning);
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
        result.append(" (xsltFile: ");
        result.append(xsltFile);
        result.append(", failOnWarning: ");
        result.append(failOnWarning);
        result.append(')');
        return result.toString();
    }

} //XsltTransformTypeImpl
