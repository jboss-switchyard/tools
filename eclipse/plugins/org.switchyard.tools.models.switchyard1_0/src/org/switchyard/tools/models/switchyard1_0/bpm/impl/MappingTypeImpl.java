/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.bpm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.soa.sca.sca1_1.model.sca.impl.CommonExtensionBaseImpl;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.ExpressionType;
import org.switchyard.tools.models.switchyard1_0.bpm.MappingType;
import org.switchyard.tools.models.switchyard1_0.bpm.ScopeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.MappingTypeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.MappingTypeImpl#getExpressionType <em>Expression Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.MappingTypeImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.bpm.impl.MappingTypeImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingTypeImpl extends CommonExtensionBaseImpl implements MappingType {
    /**
     * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpression()
     * @generated
     * @ordered
     */
    protected static final String EXPRESSION_EDEFAULT = null;
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
     * This is true if the Expression Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean expressionTypeESet;
    /**
     * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScope()
     * @generated
     * @ordered
     */
    protected static final ScopeType SCOPE_EDEFAULT = ScopeType.IN;
    /**
     * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScope()
     * @generated
     * @ordered
     */
    protected ScopeType scope = SCOPE_EDEFAULT;
    /**
     * This is true if the Scope attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean scopeESet;
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
        return BPMPackage.Literals.MAPPING_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.MAPPING_TYPE__EXPRESSION, oldExpression, expression));
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
        boolean oldExpressionTypeESet = expressionTypeESet;
        expressionTypeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.MAPPING_TYPE__EXPRESSION_TYPE, oldExpressionType, expressionType, !oldExpressionTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetExpressionType() {
        ExpressionType oldExpressionType = expressionType;
        boolean oldExpressionTypeESet = expressionTypeESet;
        expressionType = EXPRESSION_TYPE_EDEFAULT;
        expressionTypeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, BPMPackage.MAPPING_TYPE__EXPRESSION_TYPE, oldExpressionType, EXPRESSION_TYPE_EDEFAULT, oldExpressionTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetExpressionType() {
        return expressionTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScopeType getScope() {
        return scope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScope(ScopeType newScope) {
        ScopeType oldScope = scope;
        scope = newScope == null ? SCOPE_EDEFAULT : newScope;
        boolean oldScopeESet = scopeESet;
        scopeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.MAPPING_TYPE__SCOPE, oldScope, scope, !oldScopeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetScope() {
        ScopeType oldScope = scope;
        boolean oldScopeESet = scopeESet;
        scope = SCOPE_EDEFAULT;
        scopeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, BPMPackage.MAPPING_TYPE__SCOPE, oldScope, SCOPE_EDEFAULT, oldScopeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetScope() {
        return scopeESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, BPMPackage.MAPPING_TYPE__VARIABLE, oldVariable, variable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BPMPackage.MAPPING_TYPE__EXPRESSION:
                return getExpression();
            case BPMPackage.MAPPING_TYPE__EXPRESSION_TYPE:
                return getExpressionType();
            case BPMPackage.MAPPING_TYPE__SCOPE:
                return getScope();
            case BPMPackage.MAPPING_TYPE__VARIABLE:
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
            case BPMPackage.MAPPING_TYPE__EXPRESSION:
                setExpression((String)newValue);
                return;
            case BPMPackage.MAPPING_TYPE__EXPRESSION_TYPE:
                setExpressionType((ExpressionType)newValue);
                return;
            case BPMPackage.MAPPING_TYPE__SCOPE:
                setScope((ScopeType)newValue);
                return;
            case BPMPackage.MAPPING_TYPE__VARIABLE:
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
            case BPMPackage.MAPPING_TYPE__EXPRESSION:
                setExpression(EXPRESSION_EDEFAULT);
                return;
            case BPMPackage.MAPPING_TYPE__EXPRESSION_TYPE:
                unsetExpressionType();
                return;
            case BPMPackage.MAPPING_TYPE__SCOPE:
                unsetScope();
                return;
            case BPMPackage.MAPPING_TYPE__VARIABLE:
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
            case BPMPackage.MAPPING_TYPE__EXPRESSION:
                return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
            case BPMPackage.MAPPING_TYPE__EXPRESSION_TYPE:
                return isSetExpressionType();
            case BPMPackage.MAPPING_TYPE__SCOPE:
                return isSetScope();
            case BPMPackage.MAPPING_TYPE__VARIABLE:
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
        result.append(" (expression: ");
        result.append(expression);
        result.append(", expressionType: ");
        if (expressionTypeESet) result.append(expressionType); else result.append("<unset>");
        result.append(", scope: ");
        if (scopeESet) result.append(scope); else result.append("<unset>");
        result.append(", variable: ");
        result.append(variable);
        result.append(')');
        return result.toString();
    }

} //MappingTypeImpl
