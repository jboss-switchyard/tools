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

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.jdt.debug.core.IJavaFieldVariable;
import org.eclipse.jdt.debug.core.IJavaObject;
import org.eclipse.jdt.debug.core.IJavaThread;
import org.eclipse.jdt.debug.core.IJavaType;
import org.eclipse.jdt.debug.core.IJavaValue;
import org.switchyard.tools.ui.debug.SwitchYardDebugUtil;

/**
 * JavaInterfaceValue
 * <p/>
 * Wraps a Java value whose variables will be exposed via get/set methods on the
 * interface implemented by the value.
 */
public abstract class JavaInterfaceValue extends DebugElement implements IJavaObject {

    private final IJavaObject _delegate;

    protected JavaInterfaceValue(final IJavaObject delegate) {
        super(delegate.getDebugTarget());
        _delegate = delegate;
    }

    @Override
    public String getReferenceTypeName() throws DebugException {
        return _delegate.getReferenceTypeName();
    }

    @Override
    public String getValueString() throws DebugException {
        return _delegate.getValueString();
    }

    @Override
    public boolean isAllocated() throws DebugException {
        return _delegate.isAllocated();
    }

    @Override
    public boolean hasVariables() throws DebugException {
        return getVariables().length > 0;
    }

    @Override
    public String getModelIdentifier() {
        return SwitchYardDebugUtil.MODEL_IDENTIFIER;
    }

    @Override
    public String getSignature() throws DebugException {
        return _delegate.getSignature();
    }

    @Override
    public String getGenericSignature() throws DebugException {
        return _delegate.getGenericSignature();
    }

    @Override
    public IJavaType getJavaType() throws DebugException {
        return _delegate.getJavaType();
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public IJavaValue sendMessage(String selector, String signature, IJavaValue[] args, IJavaThread thread,
            boolean superSend) throws DebugException {
        return _delegate.sendMessage(selector, signature, args, thread, superSend);
    }

    @Override
    public IJavaValue sendMessage(String selector, String signature, IJavaValue[] args, IJavaThread thread,
            String typeSignature) throws DebugException {
        return _delegate.sendMessage(selector, signature, args, thread, typeSignature);
    }

    @Override
    public IJavaFieldVariable getField(String name, boolean superField) throws DebugException {
        return _delegate.getField(name, superField);
    }

    @Override
    public IJavaFieldVariable getField(String name, String typeSignature) throws DebugException {
        return _delegate.getField(name, typeSignature);
    }

    @Override
    public IJavaThread[] getWaitingThreads() throws DebugException {
        return _delegate.getWaitingThreads();
    }

    @Override
    public IJavaThread getOwningThread() throws DebugException {
        return _delegate.getOwningThread();
    }

    @Override
    public IJavaObject[] getReferringObjects(long max) throws DebugException {
        return _delegate.getReferringObjects(max);
    }

    @Override
    public void enableCollection() throws DebugException {
        _delegate.enableCollection();
    }

    @Override
    public void disableCollection() throws DebugException {
        _delegate.disableCollection();
    }

    @Override
    public long getUniqueId() throws DebugException {
        return _delegate.getUniqueId();
    }

    protected IJavaObject getDelegate() {
        return _delegate;
    }
}
