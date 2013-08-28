/*************************************************************************************
 * Copyright (c) 2013 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.operations;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.switchyard.tools.cxf.WSDL2JavaOperation;
import org.switchyard.tools.cxf.WSDL2JavaOptions;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.i18n.Messages;

/**
 * CreateJavaFromWSDLOperation
 * 
 * <p/>
 * Create a Java interface from a WSDL file.
 */
public class CreateJavaFromWSDLOperation implements IWorkspaceRunnable {

    private final MultiStatus _status = new MultiStatus(Activator.PLUGIN_ID, 0, Messages.CreateJavaFromWSDLOperation_statusLabel_wsdl2JavaOperation, null);
    private final WSDL2JavaOptions _options;

    /**
     * Create a new CreateJavaFromWSDLOperation.
     * 
     * @param options the options to use when creating Java types
     */
    public CreateJavaFromWSDLOperation(WSDL2JavaOptions options) {
        _options = options;
    }

    /**
     * @return the status of the operation.
     */
    public IStatus getStatus() {
        return _status;
    }

    @Override
    public void run(IProgressMonitor monitor) throws CoreException {
        final WSDL2JavaOperation wsdl2Java = new WSDL2JavaOperation(_options);
        try {
            wsdl2Java.run(monitor);
        } catch (InvocationTargetException e) {
            throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, Messages.CreateJavaFromWSDLOperation_statusLabel_javaGenerationFailed,
                    e.getTargetException()));
        } catch (Exception e) {
            throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, Messages.CreateJavaFromWSDLOperation_statusLabel_javaGenerationFailed, e));
        }
        _status.add(new Status(Status.INFO, Activator.PLUGIN_ID, Messages.CreateJavaFromWSDLOperation_statusLabel_javaGeneratedSuccessfully));

        try {
            _options.getOutputFolder().refreshLocal(IResource.DEPTH_INFINITE, monitor);
            _status.add(new Status(Status.INFO, Activator.PLUGIN_ID, Messages.CreateJavaFromWSDLOperation_statusLabel_refreshedOutputFolder));
        } catch (CoreException e) {
            _status.add(e.getStatus());
        }
    }

}
