/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.editor.impl;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.transaction.ExceptionHandler;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomainEvent;
import org.eclipse.emf.transaction.TransactionalEditingDomainListenerImpl;

/**
 * @author bfitzpat
 *
 */
public class SwitchyardSCAEditingDomainListener extends TransactionalEditingDomainListenerImpl implements
        ExceptionHandler {

    private BasicDiagnostic _diagnostics;

    /**
     * @param switchyardSCAEditor editor
     */
    public SwitchyardSCAEditingDomainListener(SwitchyardSCAEditor switchyardSCAEditor) {
        super();
        TransactionalEditingDomain editingDomain = switchyardSCAEditor.getEditingDomain();
        TransactionalCommandStack stack = (TransactionalCommandStack) editingDomain.getCommandStack();
        stack.setExceptionHandler(this);
    }

    @Override
    public void transactionStarting(TransactionalEditingDomainEvent event) {
        _diagnostics = null;
    }

    @Override
    public void handleException(Exception e) {
        String source = null;
        int code = 0;
        String message = e.getMessage();
        Object[] data = null;
        StackTraceElement[] trace = e.getStackTrace();
        if (trace != null && trace.length > 0) {
            source = trace[0].getMethodName();
        }
        if (_diagnostics == null) {
            _diagnostics = new BasicDiagnostic(source, code, message, data);
        } else {
            _diagnostics.add(new BasicDiagnostic(source, code, message, data));
        }
    }

    /**
     * @return diagnostics
     */
    public BasicDiagnostic getDiagnostics() {
        return _diagnostics;
    }
}
