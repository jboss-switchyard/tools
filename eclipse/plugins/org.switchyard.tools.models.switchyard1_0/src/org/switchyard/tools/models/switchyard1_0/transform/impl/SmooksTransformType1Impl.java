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
import org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1;
import org.switchyard.tools.models.switchyard1_0.transform.TransformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smooks Transform Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.impl.SmooksTransformType1Impl#getType <em>Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.impl.SmooksTransformType1Impl#getConfig <em>Config</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.impl.SmooksTransformType1Impl#getReportPath <em>Report Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SmooksTransformType1Impl extends TransformTypeImpl implements SmooksTransformType1 {
	/**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final SmooksTransformType TYPE_EDEFAULT = SmooksTransformType.SMOOKS;
    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected SmooksTransformType type = TYPE_EDEFAULT;
    /**
     * The default value of the '{@link #getConfig() <em>Config</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfig()
     * @generated
     * @ordered
     */
    protected static final String CONFIG_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getConfig() <em>Config</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfig()
     * @generated
     * @ordered
     */
    protected String config = CONFIG_EDEFAULT;
    /**
     * The default value of the '{@link #getReportPath() <em>Report Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReportPath()
     * @generated
     * @ordered
     */
    protected static final String REPORT_PATH_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getReportPath() <em>Report Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReportPath()
     * @generated
     * @ordered
     */
    protected String reportPath = REPORT_PATH_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SmooksTransformType1Impl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return TransformPackage.Literals.SMOOKS_TRANSFORM_TYPE1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SmooksTransformType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(SmooksTransformType newType) {
        SmooksTransformType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformPackage.SMOOKS_TRANSFORM_TYPE1__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getConfig() {
        return config;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConfig(String newConfig) {
        String oldConfig = config;
        config = newConfig;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformPackage.SMOOKS_TRANSFORM_TYPE1__CONFIG, oldConfig, config));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getReportPath() {
        return reportPath;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReportPath(String newReportPath) {
        String oldReportPath = reportPath;
        reportPath = newReportPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TransformPackage.SMOOKS_TRANSFORM_TYPE1__REPORT_PATH, oldReportPath, reportPath));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TransformPackage.SMOOKS_TRANSFORM_TYPE1__TYPE:
                return getType();
            case TransformPackage.SMOOKS_TRANSFORM_TYPE1__CONFIG:
                return getConfig();
            case TransformPackage.SMOOKS_TRANSFORM_TYPE1__REPORT_PATH:
                return getReportPath();
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
            case TransformPackage.SMOOKS_TRANSFORM_TYPE1__TYPE:
                setType((SmooksTransformType)newValue);
                return;
            case TransformPackage.SMOOKS_TRANSFORM_TYPE1__CONFIG:
                setConfig((String)newValue);
                return;
            case TransformPackage.SMOOKS_TRANSFORM_TYPE1__REPORT_PATH:
                setReportPath((String)newValue);
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
            case TransformPackage.SMOOKS_TRANSFORM_TYPE1__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case TransformPackage.SMOOKS_TRANSFORM_TYPE1__CONFIG:
                setConfig(CONFIG_EDEFAULT);
                return;
            case TransformPackage.SMOOKS_TRANSFORM_TYPE1__REPORT_PATH:
                setReportPath(REPORT_PATH_EDEFAULT);
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
            case TransformPackage.SMOOKS_TRANSFORM_TYPE1__TYPE:
                return type != TYPE_EDEFAULT;
            case TransformPackage.SMOOKS_TRANSFORM_TYPE1__CONFIG:
                return CONFIG_EDEFAULT == null ? config != null : !CONFIG_EDEFAULT.equals(config);
            case TransformPackage.SMOOKS_TRANSFORM_TYPE1__REPORT_PATH:
                return REPORT_PATH_EDEFAULT == null ? reportPath != null : !REPORT_PATH_EDEFAULT.equals(reportPath);
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
        result.append(" (type: ");
        result.append(type);
        result.append(", config: ");
        result.append(config);
        result.append(", reportPath: ");
        result.append(reportPath);
        result.append(')');
        return result.toString();
    }

} //SmooksTransformType1Impl
