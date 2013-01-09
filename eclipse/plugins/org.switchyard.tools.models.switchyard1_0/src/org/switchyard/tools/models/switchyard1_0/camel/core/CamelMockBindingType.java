/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mock Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelMockBindingType#getCamelBindingName <em>Camel Binding Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelMockBindingType#getReportGroup <em>Report Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelMockBindingType()
 * @model extendedMetaData="name='CamelMockBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelMockBindingType extends BaseCamelBinding {
    /**
     * Returns the value of the '<em><b>Camel Binding Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Camel Binding Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Camel Binding Name</em>' attribute.
     * @see #setCamelBindingName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelMockBindingType_CamelBindingName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
     * @generated
     */
    String getCamelBindingName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelMockBindingType#getCamelBindingName <em>Camel Binding Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Camel Binding Name</em>' attribute.
     * @see #getCamelBindingName()
     * @generated
     */
    void setCamelBindingName(String value);

    /**
     * Returns the value of the '<em><b>Report Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Report Group</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Report Group</em>' attribute.
     * @see #isSetReportGroup()
     * @see #unsetReportGroup()
     * @see #setReportGroup(int)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelMockBindingType_ReportGroup()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='element' name='reportGroup' namespace='##targetNamespace'"
     * @generated
     */
    int getReportGroup();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelMockBindingType#getReportGroup <em>Report Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Report Group</em>' attribute.
     * @see #isSetReportGroup()
     * @see #unsetReportGroup()
     * @see #getReportGroup()
     * @generated
     */
    void setReportGroup(int value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelMockBindingType#getReportGroup <em>Report Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReportGroup()
     * @see #getReportGroup()
     * @see #setReportGroup(int)
     * @generated
     */
    void unsetReportGroup();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelMockBindingType#getReportGroup <em>Report Group</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Report Group</em>' attribute is set.
     * @see #unsetReportGroup()
     * @see #getReportGroup()
     * @see #setReportGroup(int)
     * @generated
     */
    boolean isSetReportGroup();

} // CamelMockBindingType
