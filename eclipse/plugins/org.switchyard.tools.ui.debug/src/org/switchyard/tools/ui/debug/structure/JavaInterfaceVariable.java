/******************************************************************************* 
 * Copyright (c) 2014 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.debug.structure;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.debug.core.IJavaClassType;
import org.eclipse.jdt.debug.core.IJavaDebugTarget;
import org.eclipse.jdt.debug.core.IJavaInterfaceType;
import org.eclipse.jdt.debug.core.IJavaObject;
import org.eclipse.jdt.debug.core.IJavaThread;
import org.eclipse.jdt.debug.core.IJavaType;
import org.eclipse.jdt.debug.core.IJavaValue;
import org.eclipse.jdt.debug.core.IJavaVariable;
import org.eclipse.jdt.debug.core.JDIDebugModel;
import org.eclipse.jdt.internal.debug.core.logicalstructures.JavaLogicalStructure;
import org.eclipse.jdt.internal.debug.core.model.JDIDebugTarget;
import org.eclipse.jdt.internal.debug.core.model.JDIPlaceholderValue;
import org.eclipse.jdt.internal.debug.ui.JDIModelPresentation;

/**
 * JavaInterfaceVariable
 * <p/>
 * Implements IJavaVariable by delegating to get/set methods on the parent
 * value.
 */
@SuppressWarnings("restriction")
public abstract class JavaInterfaceVariable extends DebugElement implements IJavaVariable {

    private final String _name;
    private final String _valueType;
    private final String _getterExpression;
    private final String _setterMethod;
    private final IJavaObject _underlyingObject;
    private IValue _value;

    /**
     * Create a new JavaInterfaceVariable.
     * 
     * Delegates to the other constructor whereby the get expression is
     * <code>get&lt;variableName&gt;()</code> and setter method is
     * <code>set&lt;variableName&gt;</code>
     * 
     * @param underlyingObject the underlying object
     * @param variableName the name of this value
     * @param valueType the type of value represented by this variable; must
     *            match the parameter type of the setter method.
     * @param readOnly true if this is a read-only variable
     */
    public JavaInterfaceVariable(final IJavaObject underlyingObject, final String variableName, final String valueType,
            final boolean readOnly) {
        this(underlyingObject, variableName, "get" + pruneWhiteSpace(variableName) + "()", readOnly ? null : "set"
                + pruneWhiteSpace(variableName), valueType);
    }

    /**
     * Create a new JavaInterfaceVariable.
     * 
     * @param underlyingObject the underlying object
     * @param variableName the name of this value
     * @param getterExpression the expression used to get the value for this
     *            variable
     * @param setterMethod the method used to set the value for this variable;
     *            null indicates read-only
     * @param valueType the type of value represented by this variable; must
     *            match the parameter type of the setter method.
     */
    public JavaInterfaceVariable(final IJavaObject underlyingObject, final String variableName,
            final String getterExpression, final String setterMethod, final String valueType) {
        super(underlyingObject.getDebugTarget());
        _name = variableName;
        _getterExpression = getterExpression;
        _setterMethod = setterMethod;
        _valueType = valueType;
        _underlyingObject = underlyingObject;
    }

    /**
     * @return true if this variable uses a logical structure for its value.
     */
    public boolean hasGetterExpression() {
        return _getterExpression != null;
    }

    @Override
    public boolean isPublic() throws DebugException {
        return true;
    }

    @Override
    public boolean isPrivate() throws DebugException {
        return false;
    }

    @Override
    public boolean isProtected() throws DebugException {
        return false;
    }

    @Override
    public boolean isPackagePrivate() throws DebugException {
        return false;
    }

    @Override
    public boolean isFinal() throws DebugException {
        return false;
    }

    @Override
    public boolean isStatic() throws DebugException {
        return false;
    }

    @Override
    public boolean isSynthetic() throws DebugException {
        return false;
    }

    @Override
    public synchronized IValue getValue() throws DebugException {
        if (_value == null) {
            try {
                final IJavaValue value = getRawValue();
                if (value.isNull()) {
                    _value = value;
                } else {
                    _value = wrapJavaValue(value);
                }
            } catch (CoreException e) {
                _value = new JDIPlaceholderValue((JDIDebugTarget) getDebugTarget(), "Could not retrieve value");
            }
        }
        return _value;
    }

    protected abstract IValue wrapJavaValue(IJavaValue actualValue);

    protected IJavaValue getRawValue() throws CoreException {
        if (_getterExpression == null) {
            return getUnderlyingObject();
        }
        return (IJavaValue) new JavaLogicalStructure(_underlyingObject.getReferenceTypeName(), true, _getterExpression,
                null, null).getLogicalStructure(_underlyingObject);
    }

    @Override
    public String getName() throws DebugException {
        return _name;
    }

    @Override
    public String getReferenceTypeName() throws DebugException {
        return _valueType;
    }

    @Override
    public boolean hasValueChanged() throws DebugException {
        return false;
    }

    @Override
    public void setValue(String expression) throws DebugException {
        notSupported("setValue(java.lang.String) not supported.", null);
    }

    @Override
    public synchronized void setValue(final IValue value) throws DebugException {
        if (_setterMethod == null) {
            notSupported(getReferenceTypeName() + " does not support setValue()", null);
        }
        if (value instanceof IJavaValue) {
            final IJavaThread thread = JDIModelPresentation.getEvaluationThread((IJavaDebugTarget) getDebugTarget());
            _underlyingObject.sendMessage(_setterMethod, getSetterMethodSignature(),
                    new IJavaValue[] {(IJavaValue) value }, thread, false);
            _value = null;
            fireChangeEvent(DebugEvent.CONTENT);
        }
    }

    protected String getSetterMethodSignature() {
        return Signature.createMethodSignature(new String[] {Signature.createTypeSignature(_valueType, true) }, "V")
                .replace('.', '/');
    }

    @Override
    public boolean supportsValueModification() {
        return _setterMethod != null;
    }

    @Override
    public boolean verifyValue(String expression) throws DebugException {
        // cannot directly set expressions, only values
        return false;
    }

    @Override
    public boolean verifyValue(IValue value) throws DebugException {
        return value instanceof IJavaValue && typeCompatible(((IJavaValue) value).getJavaType());
    }

    private boolean typeCompatible(IJavaType type) {
        try {
            if (type instanceof IJavaClassType) {
                for (IJavaInterfaceType intf : ((IJavaClassType) type).getAllInterfaces()) {
                    if (intf.getName().equals(_valueType)) {
                        return true;
                    }
                }
            }
        } catch (DebugException e) {
            e.fillInStackTrace();
        }
        return false;
    }

    @Override
    public String getModelIdentifier() {
        return JDIDebugModel.getPluginIdentifier();
    }

    @Override
    public String getSignature() throws DebugException {
        return Signature.getTypeErasure(getGenericSignature()).replace('.', '/');
    }

    @Override
    public String getGenericSignature() throws DebugException {
        return Signature.createTypeSignature(_valueType, true).replace('.', '/');
    }

    @Override
    public IJavaType getJavaType() throws DebugException {
        return ((IJavaValue) getValue()).getJavaType();
    }

    @Override
    public boolean isLocal() throws DebugException {
        return false;
    }

    protected IJavaValue getUnderlyingObject() {
        return _underlyingObject;
    }

    private static String pruneWhiteSpace(final String source) {
        final StringBuffer buffer = new StringBuffer();
        for (String segment : source.split("\\s*")) {
            buffer.append(segment);
        }
        return buffer.toString();
    }
}
