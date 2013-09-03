/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.editor.transform;

import java.util.Collections;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.common.SwitchYardComponentExtensionManager;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.operations.AbstractSwitchYardProjectOperation;

/**
 * CreateJavaTransformerOperation
 * 
 * Creates a new Java transformer class.
 */
public class CreateJavaTransformerOperation extends AbstractSwitchYardProjectOperation {

    private NewJavaTransformerClassPage _page;

    /**
     * Create a new CreateJavaTransformerOperation.
     * 
     * @param page the page creating the new Java transformer class.
     * @param uiInfo adaptable for UI Shell, may be null.
     */
    public CreateJavaTransformerOperation(NewJavaTransformerClassPage page, IAdaptable uiInfo) {
        super(null, Collections
                .singleton(SwitchYardComponentExtensionManager.instance().getRuntimeComponentExtension()), false,
                Messages.message_creatingNewJavaTransformerClass, uiInfo);
        _page = page;
    }

    @Override
    protected void execute(IProgressMonitor monitor) throws CoreException {
        try {
            monitor.beginTask("", 100); //$NON-NLS-1$
            monitor.subTask(Messages.message_creatingJavaTransformerClass);
            IProgressMonitor subMonitor = new SubProgressMonitor(monitor, 100,
                    SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
            try {
                _page.createType(subMonitor);
            } catch (InterruptedException e) {
                throw new CoreException(new Status(Status.CANCEL, Activator.PLUGIN_ID, e.getMessage(), e));
            } finally {
                subMonitor.done();
                subMonitor.setTaskName(""); //$NON-NLS-1$
            }
        } finally {
            monitor.setTaskName(""); //$NON-NLS-1$
            monitor.done();
        }
    }

    @Override
    protected IProject getProject() {
        return _page.getJavaProject().getProject();
    }

}
