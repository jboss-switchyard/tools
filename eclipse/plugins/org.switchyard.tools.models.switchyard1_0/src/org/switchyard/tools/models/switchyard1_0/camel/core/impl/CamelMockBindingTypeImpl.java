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
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelMockBindingTypeImpl#getNameElement <em>Name Element</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.impl.CamelMockBindingTypeImpl#getReportGroup <em>Report Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelMockBindingTypeImpl extends BaseCamelBindingImpl implements CamelMockBindingType {
    /**
     * The default value of the '{@link #getNameElement() <em>Name Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNameElement()
     * @generated
     * @ordered
     */
    protected static final String NAME_ELEMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNameElement() <em>Name Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNameElement()
     * @generated
     * @ordered
     */
    protected String nameElement = NAME_ELEMENT_EDEFAULT;

    /**
     * The default value of the '{@link #getReportGroup() <em>Report Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReportGroup()
     * @generated
     * @ordered
     */
    protected static final Integer REPORT_GROUP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReportGroup() <em>Report Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReportGroup()
     * @generated
     * @ordered
     */
    protected Integer reportGroup = REPORT_GROUP_EDEFAULT;

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
    public String getNameElement() {
        return nameElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNameElement(String newNameElement) {
        String oldNameElement = nameElement;
        nameElement = newNameElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CAMEL_MOCK_BINDING_TYPE__NAME_ELEMENT, oldNameElement, nameElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getReportGroup() {
        return reportGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReportGroup(Integer newReportGroup) {
        Integer oldReportGroup = reportGroup;
        reportGroup = newReportGroup;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CAMEL_MOCK_BINDING_TYPE__REPORT_GROUP, oldReportGroup, reportGroup));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CorePackage.CAMEL_MOCK_BINDING_TYPE__NAME_ELEMENT:
                return getNameElement();
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
            case CorePackage.CAMEL_MOCK_BINDING_TYPE__NAME_ELEMENT:
                setNameElement((String)newValue);
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
            case CorePackage.CAMEL_MOCK_BINDING_TYPE__NAME_ELEMENT:
                setNameElement(NAME_ELEMENT_EDEFAULT);
                return;
            case CorePackage.CAMEL_MOCK_BINDING_TYPE__REPORT_GROUP:
                setReportGroup(REPORT_GROUP_EDEFAULT);
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
            case CorePackage.CAMEL_MOCK_BINDING_TYPE__NAME_ELEMENT:
                return NAME_ELEMENT_EDEFAULT == null ? nameElement != null : !NAME_ELEMENT_EDEFAULT.equals(nameElement);
            case CorePackage.CAMEL_MOCK_BINDING_TYPE__REPORT_GROUP:
                return REPORT_GROUP_EDEFAULT == null ? reportGroup != null : !REPORT_GROUP_EDEFAULT.equals(reportGroup);
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
        result.append(" (nameElement: ");
        result.append(nameElement);
        result.append(", reportGroup: ");
        result.append(reportGroup);
        result.append(')');
        return result.toString();
    }

} //CamelMockBindingTypeImpl
