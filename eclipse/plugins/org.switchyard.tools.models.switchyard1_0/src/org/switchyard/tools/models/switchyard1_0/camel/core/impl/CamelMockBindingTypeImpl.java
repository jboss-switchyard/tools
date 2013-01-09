/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelMockBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mock Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelMockBindingTypeImpl#getCamelBindingName <em>Camel Binding Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelMockBindingTypeImpl#getReportGroup <em>Report Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelMockBindingTypeImpl extends BaseCamelBindingImpl implements CamelMockBindingType {
    /**
     * The default value of the '{@link #getCamelBindingName() <em>Camel Binding Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCamelBindingName()
     * @generated
     * @ordered
     */
    protected static final String CAMEL_BINDING_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCamelBindingName() <em>Camel Binding Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCamelBindingName()
     * @generated
     * @ordered
     */
    protected String camelBindingName = CAMEL_BINDING_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getReportGroup() <em>Report Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReportGroup()
     * @generated
     * @ordered
     */
    protected static final int REPORT_GROUP_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getReportGroup() <em>Report Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReportGroup()
     * @generated
     * @ordered
     */
    protected int reportGroup = REPORT_GROUP_EDEFAULT;

    /**
     * This is true if the Report Group attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reportGroupESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelMockBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CorePackage.Literals.CAMEL_MOCK_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCamelBindingName() {
        return camelBindingName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCamelBindingName(String newCamelBindingName) {
        String oldCamelBindingName = camelBindingName;
        camelBindingName = newCamelBindingName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CAMEL_MOCK_BINDING_TYPE__CAMEL_BINDING_NAME, oldCamelBindingName, camelBindingName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getReportGroup() {
        return reportGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReportGroup(int newReportGroup) {
        int oldReportGroup = reportGroup;
        reportGroup = newReportGroup;
        boolean oldReportGroupESet = reportGroupESet;
        reportGroupESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CAMEL_MOCK_BINDING_TYPE__REPORT_GROUP, oldReportGroup, reportGroup, !oldReportGroupESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetReportGroup() {
        int oldReportGroup = reportGroup;
        boolean oldReportGroupESet = reportGroupESet;
        reportGroup = REPORT_GROUP_EDEFAULT;
        reportGroupESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.CAMEL_MOCK_BINDING_TYPE__REPORT_GROUP, oldReportGroup, REPORT_GROUP_EDEFAULT, oldReportGroupESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetReportGroup() {
        return reportGroupESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CorePackage.CAMEL_MOCK_BINDING_TYPE__CAMEL_BINDING_NAME:
                return getCamelBindingName();
            case CorePackage.CAMEL_MOCK_BINDING_TYPE__REPORT_GROUP:
                return getReportGroup();
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
            case CorePackage.CAMEL_MOCK_BINDING_TYPE__CAMEL_BINDING_NAME:
                setCamelBindingName((String)newValue);
                return;
            case CorePackage.CAMEL_MOCK_BINDING_TYPE__REPORT_GROUP:
                setReportGroup((Integer)newValue);
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
            case CorePackage.CAMEL_MOCK_BINDING_TYPE__CAMEL_BINDING_NAME:
                setCamelBindingName(CAMEL_BINDING_NAME_EDEFAULT);
                return;
            case CorePackage.CAMEL_MOCK_BINDING_TYPE__REPORT_GROUP:
                unsetReportGroup();
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
            case CorePackage.CAMEL_MOCK_BINDING_TYPE__CAMEL_BINDING_NAME:
                return CAMEL_BINDING_NAME_EDEFAULT == null ? camelBindingName != null : !CAMEL_BINDING_NAME_EDEFAULT.equals(camelBindingName);
            case CorePackage.CAMEL_MOCK_BINDING_TYPE__REPORT_GROUP:
                return isSetReportGroup();
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
        result.append(" (camelBindingName: ");
        result.append(camelBindingName);
        result.append(", reportGroup: ");
        if (reportGroupESet) result.append(reportGroup); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //CamelMockBindingTypeImpl
