/**
 */
package org.switchyard.tools.models.switchyard1_0.rules;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Detail Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.ResourceDetailType#getInputType <em>Input Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.ResourceDetailType#isUsingExternalTypes <em>Using External Types</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.ResourceDetailType#getWorksheetName <em>Worksheet Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getResourceDetailType()
 * @model extendedMetaData="name='ResourceDetailType' kind='elementOnly'"
 * @generated
 */
public interface ResourceDetailType extends CommonExtensionBase {
    /**
     * Returns the value of the '<em><b>Input Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input Type</em>' attribute.
     * @see #setInputType(String)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getResourceDetailType_InputType()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='inputType'"
     * @generated
     */
    String getInputType();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.ResourceDetailType#getInputType <em>Input Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input Type</em>' attribute.
     * @see #getInputType()
     * @generated
     */
    void setInputType(String value);

    /**
     * Returns the value of the '<em><b>Using External Types</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Using External Types</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Using External Types</em>' attribute.
     * @see #isSetUsingExternalTypes()
     * @see #unsetUsingExternalTypes()
     * @see #setUsingExternalTypes(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getResourceDetailType_UsingExternalTypes()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='usingExternalTypes'"
     * @generated
     */
    boolean isUsingExternalTypes();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.ResourceDetailType#isUsingExternalTypes <em>Using External Types</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Using External Types</em>' attribute.
     * @see #isSetUsingExternalTypes()
     * @see #unsetUsingExternalTypes()
     * @see #isUsingExternalTypes()
     * @generated
     */
    void setUsingExternalTypes(boolean value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.ResourceDetailType#isUsingExternalTypes <em>Using External Types</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsingExternalTypes()
     * @see #isUsingExternalTypes()
     * @see #setUsingExternalTypes(boolean)
     * @generated
     */
    void unsetUsingExternalTypes();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.ResourceDetailType#isUsingExternalTypes <em>Using External Types</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Using External Types</em>' attribute is set.
     * @see #unsetUsingExternalTypes()
     * @see #isUsingExternalTypes()
     * @see #setUsingExternalTypes(boolean)
     * @generated
     */
    boolean isSetUsingExternalTypes();

    /**
     * Returns the value of the '<em><b>Worksheet Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Worksheet Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Worksheet Name</em>' attribute.
     * @see #setWorksheetName(String)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getResourceDetailType_WorksheetName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='worksheetName'"
     * @generated
     */
    String getWorksheetName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.ResourceDetailType#getWorksheetName <em>Worksheet Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Worksheet Name</em>' attribute.
     * @see #getWorksheetName()
     * @generated
     */
    void setWorksheetName(String value);

} // ResourceDetailType
