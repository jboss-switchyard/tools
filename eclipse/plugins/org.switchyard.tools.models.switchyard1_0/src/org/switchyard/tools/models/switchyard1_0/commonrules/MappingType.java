/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.commonrules;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.MappingType#getContextScope <em>Context Scope</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.MappingType#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.MappingType#getExpressionType <em>Expression Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.MappingType#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getMappingType()
 * @model abstract="true"
 *        extendedMetaData="name='MappingType' kind='empty'"
 * @generated
 */
public interface MappingType extends CommonExtensionBase {

    /**
     * Returns the value of the '<em><b>Context Scope</b></em>' attribute.
     * The default value is <code>"IN"</code>.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.commonrules.ContextScope}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Scope</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Scope</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.ContextScope
     * @see #setContextScope(ContextScope)
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getMappingType_ContextScope()
     * @model default="IN"
     *        extendedMetaData="kind='attribute' name='contextScope'"
     * @generated
     */
    ContextScope getContextScope();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.MappingType#getContextScope <em>Context Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Scope</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.ContextScope
     * @see #getContextScope()
     * @generated
     */
    void setContextScope(ContextScope value);

    /**
     * Returns the value of the '<em><b>Expression</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' attribute.
     * @see #setExpression(String)
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getMappingType_Expression()
     * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='expression'"
     * @generated
     */
    String getExpression();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.MappingType#getExpression <em>Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' attribute.
     * @see #getExpression()
     * @generated
     */
    void setExpression(String value);

    /**
     * Returns the value of the '<em><b>Expression Type</b></em>' attribute.
     * The default value is <code>"MVEL"</code>.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.commonrules.ExpressionType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.ExpressionType
     * @see #setExpressionType(ExpressionType)
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getMappingType_ExpressionType()
     * @model default="MVEL"
     *        extendedMetaData="kind='attribute' name='expressionType'"
     * @generated
     */
    ExpressionType getExpressionType();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.MappingType#getExpressionType <em>Expression Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.ExpressionType
     * @see #getExpressionType()
     * @generated
     */
    void setExpressionType(ExpressionType value);

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
     * @see org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage#getMappingType_Variable()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
     *        extendedMetaData="kind='attribute' name='variable'"
     * @generated
     */
    String getVariable();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.commonrules.MappingType#getVariable <em>Variable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Variable</em>' attribute.
     * @see #getVariable()
     * @generated
     */
    void setVariable(String value);
} // MappingType
