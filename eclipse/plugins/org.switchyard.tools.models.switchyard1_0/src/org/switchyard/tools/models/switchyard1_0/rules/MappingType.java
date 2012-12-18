/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.rules;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.MappingType#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.MappingType#getExpressionType <em>Expression Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.MappingType#getScope <em>Scope</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.MappingType#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getMappingType()
 * @model extendedMetaData="name='MappingType' kind='elementOnly'"
 * @generated
 */
public interface MappingType extends CommonExtensionBase {

    /**
     * Returns the value of the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' attribute.
     * @see #setExpression(String)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getMappingType_Expression()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='expression'"
     * @generated
     */
    String getExpression();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.MappingType#getExpression <em>Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' attribute.
     * @see #getExpression()
     * @generated
     */
    void setExpression(String value);

    /**
     * Returns the value of the '<em><b>Expression Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.rules.ExpressionType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ExpressionType
     * @see #isSetExpressionType()
     * @see #unsetExpressionType()
     * @see #setExpressionType(ExpressionType)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getMappingType_ExpressionType()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='expressionType'"
     * @generated
     */
    ExpressionType getExpressionType();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.MappingType#getExpressionType <em>Expression Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ExpressionType
     * @see #isSetExpressionType()
     * @see #unsetExpressionType()
     * @see #getExpressionType()
     * @generated
     */
    void setExpressionType(ExpressionType value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.MappingType#getExpressionType <em>Expression Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExpressionType()
     * @see #getExpressionType()
     * @see #setExpressionType(ExpressionType)
     * @generated
     */
    void unsetExpressionType();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.MappingType#getExpressionType <em>Expression Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Expression Type</em>' attribute is set.
     * @see #unsetExpressionType()
     * @see #getExpressionType()
     * @see #setExpressionType(ExpressionType)
     * @generated
     */
    boolean isSetExpressionType();

    /**
     * Returns the value of the '<em><b>Scope</b></em>' attribute.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.rules.ScopeType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scope</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scope</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ScopeType
     * @see #isSetScope()
     * @see #unsetScope()
     * @see #setScope(ScopeType)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getMappingType_Scope()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='scope'"
     * @generated
     */
    ScopeType getScope();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.MappingType#getScope <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scope</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ScopeType
     * @see #isSetScope()
     * @see #unsetScope()
     * @see #getScope()
     * @generated
     */
    void setScope(ScopeType value);

    /**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.MappingType#getScope <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetScope()
     * @see #getScope()
     * @see #setScope(ScopeType)
     * @generated
     */
    void unsetScope();

    /**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.MappingType#getScope <em>Scope</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scope</em>' attribute is set.
     * @see #unsetScope()
     * @see #getScope()
     * @see #setScope(ScopeType)
     * @generated
     */
    boolean isSetScope();

    /**
     * Returns the value of the '<em><b>Variable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variable</em>' attribute.
     * @see #setVariable(String)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getMappingType_Variable()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='variable'"
     * @generated
     */
    String getVariable();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.MappingType#getVariable <em>Variable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Variable</em>' attribute.
     * @see #getVariable()
     * @generated
     */
    void setVariable(String value);
} // MappingType
