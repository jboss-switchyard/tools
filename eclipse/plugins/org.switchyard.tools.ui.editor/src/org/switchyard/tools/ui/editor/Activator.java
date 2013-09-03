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
package org.switchyard.tools.ui.editor;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 */
public class Activator extends AbstractUIPlugin {

    /** The plug-in ID. **/
    public static final String PLUGIN_ID = "org.switchyard.tools.ui.editor"; //$NON-NLS-1$

    /* The shared instance */
    private static Activator PLUGIN;

    /**
     * The constructor.
     */
    public Activator() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
     *      )
     */
    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        PLUGIN = this;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
     * )
     */
    @Override
    public void stop(BundleContext context) throws Exception {
        PLUGIN = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance.
     * 
     * @return the shared instance
     */
    public static Activator getDefault() {
        return PLUGIN;
    }

    /**
     * Log the status.
     * @param status the status to be logged
     */
    public static void logStatus(IStatus status) {
        Platform.getLog(PLUGIN.getBundle()).log(status);
    }

    /**
     * Log the error.
     * @param e the exception to be logged
     */
    public static void logError(Exception e) {
        logStatus(createStatus(e));
    }

    /**
     * @param e the exception to be put in the status
     * @return
     */
    private static Status createStatus(Exception e) {
        return new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
    }

    /**
     * Create a status message.
     * @param message the message to include in the status
     * @return Status
     */
    public static Status createStatus(String message) {
        return new Status(IStatus.ERROR, Activator.PLUGIN_ID, message, null);
    }

    /**
     * Show an error dialog and log the exception.
     * @param e the Exception to log and pop up the dialog for
     */
    public static void showErrorWithLogging(Exception e) {
        Status s = createStatus(e);
        logStatus(s);
        ErrorDialog.openError(PlatformUI.getWorkbench().getDisplay().getActiveShell(), Messages.error_errorOccurred, null, s);
    }

}
