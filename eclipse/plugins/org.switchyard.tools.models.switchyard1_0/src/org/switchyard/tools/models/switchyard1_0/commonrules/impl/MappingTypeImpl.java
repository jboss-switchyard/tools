/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.commonrules.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.soa.sca.sca1_1.model.sca.impl.CommonExtensionBaseImpl;

import org.switchyard.tools.models.switchyard1_0.commonrules.CommonRulesPackage;
import org.switchyard.tools.models.switchyard1_0.commonrules.ContextScope;
import org.switchyard.tools.models.switchyard1_0.commonrules.ExpressionType;
import org.switchyard.tools.models.switchyard1_0.commonrules.MappingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.MappingTypeImpl#getContextScope <em>Context Scope</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.MappingTypeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.MappingTypeImpl#getExpressionType <em>Expression Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.commonrules.impl.MappingTypeImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MappingTypeImpl extends CommonExtensionBaseImpl implements MappingType {
    /**
     * The default value of the '{@link #getContextScope() <em>Context Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextScope()
     * @generated
     * @ordered
     */
    protected static final ContextScope CONTEXT_SCOPE_EDEFAULT = ContextScope.IN;
    /**
     * The cached value of the '{@link #getContextScope() <em>Context Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextScope()
     * @generated
     * @ordered
     */
    protected ContextScope contextScope = CONTEXT_SCOPE_EDEFAULT;
    /**
     * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpression()
     * @generated
     * @ordered
     */
    protected static final String EXPRESSION_EDEFAULT = "";
    /**
     * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpression()
     * @generated
     * @ordered
     */
    protected String expression = EXPRESSION_EDEFAULT;
    /**
     * The default value of the '{@link #getExpressionType() <em>Expression Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpressionType()
     * @generated
     * @ordered
     */
    protected static final ExpressionType EXPRESSION_TYPE_EDEFAULT = ExpressionType.MVEL;
    /**
     * The cached value of the '{@link #getExpressionType() <em>Expression Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpressionType()
     * @generated
     * @ordered
     */
    protected ExpressionType expressionType = EXPRESSION_TYPE_EDEFAULT;
    /**
     * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariable()
     * @generated
     * @ordered
     */
    protected static final String VARIABLE_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getVariable() <em>Variable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariable()
     * @generated
     * @ordered
     */
    protected String variable = VARIABLE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MappingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CommonRulesPackage.Literals.MAPPING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextScope getContextScope() {
        return contextScope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextScope(ContextScope newContextScope) {
        ContextScope oldContextScope = contextScope;
        contextScope = newContextScope == null ? CONTEXT_SCOPE_EDEFAULT : newContextScope;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CommonRulesPackage.MAPPING_TYPE__CONTEXT_SCOPE, oldContextScope, contextScope));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getExpression() {
        return expression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExpression(String newExpression) {
        String oldExpression = expression;
        expression = newExpression;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CommonRulesPackage.MAPPING_TYPE__EXPRESSION, oldExpression, expression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExpressionType getExpressionType() {
        return expressionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExpressionType(ExpressionType newExpressionType) {
        ExpressionType oldExpressionType = expressionType;
        expressionType = newExpressionType == null ? EXPRESSION_TYPE_EDEFAULT : newExpressionType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CommonRulesPackage.MAPPING_TYPE__EXPRESSION_TYPE, oldExpressionType, expressionType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVariable() {
        return variable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVariable(String newVariable) {
        String oldVariable = variable;
        variable = newVariable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CommonRulesPackage.MAPPING_TYPE__VARIABLE, oldVariable, variable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CommonRulesPackage.MAPPING_TYPE__CONTEXT_SCOPE:
                return getContextScope();
            case CommonRulesPackage.MAPPING_TYPE__EXPRESSION:
                return getExpression();
            case CommonRulesPackage.MAPPING_TYPE__EXPRESSION_TYPE:
                return getExpressionType();
            case CommonRulesPackage.MAPPING_TYPE__VARIABLE:
                return getVariable();
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
            case CommonRulesPackage.MAPPING_TYPE__CONTEXT_SCOPE:
                setContextScope((ContextScope)newValue);
                return;
            case CommonRulesPackage.MAPPING_TYPE__EXPRESSION:
                setExpression((String)newValue);
                return;
            case CommonRulesPackage.MAPPING_TYPE__EXPRESSION_TYPE:
                setExpressionType((ExpressionType)newValue);
                return;
            case CommonRulesPackage.MAPPING_TYPE__VARIABLE:
                setVariable((String)newValue);
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
            case CommonRulesPackage.MAPPING_TYPE__CONTEXT_SCOPE:
                setContextScope(CONTEXT_SCOPE_EDEFAULT);
                return;
            case CommonRulesPackage.MAPPING_TYPE__EXPRESSION:
                setExpression(EXPRESSION_EDEFAULT);
                return;
            case CommonRulesPackage.MAPPING_TYPE__EXPRESSION_TYPE:
                setExpressionType(EXPRESSION_TYPE_EDEFAULT);
                return;
            case CommonRulesPackage.MAPPING_TYPE__VARIABLE:
                setVariable(VARIABLE_EDEFAULT);
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
            case CommonRulesPackage.MAPPING_TYPE__CONTEXT_SCOPE:
                return contextScope != CONTEXT_SCOPE_EDEFAULT;
            case CommonRulesPackage.MAPPING_TYPE__EXPRESSION:
                return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
            case CommonRulesPackage.MAPPING_TYPE__EXPRESSION_TYPE:
                return expressionType != EXPRESSION_TYPE_EDEFAULT;
            case CommonRulesPackage.MAPPING_TYPE__VARIABLE:
                return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
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
        result.append(" (contextScope: ");
        result.append(contextScope);
        result.append(", expression: ");
        result.append(expression);
        result.append(", expressionType: ");
        result.append(expressionType);
        result.append(", variable: ");
        result.append(variable);
        result.append(')');
        return result.toString();
    }

} //MappingTypeImpl
