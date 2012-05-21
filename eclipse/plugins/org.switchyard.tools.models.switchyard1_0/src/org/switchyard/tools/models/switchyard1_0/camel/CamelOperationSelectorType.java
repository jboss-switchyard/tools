/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel;

import org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Selector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelOperationSelectorType#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelOperationSelectorType#getOperationName <em>Operation Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelOperationSelectorType()
 * @model extendedMetaData="name='CamelOperationSelectorType' kind='empty'"
 * @generated
 */
public interface CamelOperationSelectorType extends OperationSelectorType {

    /**
     * Returns the value of the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Namespace</em>' attribute.
     * @see #setNamespace(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelOperationSelectorType_Namespace()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='namespace'"
     * @generated
     */
    String getNamespace();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelOperationSelectorType#getNamespace <em>Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Namespace</em>' attribute.
     * @see #getNamespace()
     * @generated
     */
    void setNamespace(String value);

    /**
     * Returns the value of the '<em><b>Operation Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operation Name</em>' attribute.
     * @see #setOperationName(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelOperationSelectorType_OperationName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='operationName'"
     * @generated
     */
    String getOperationName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelOperationSelectorType#getOperationName <em>Operation Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation Name</em>' attribute.
     * @see #getOperationName()
     * @generated
     */
    void setOperationName(String value);
} // CamelOperationSelectorType
