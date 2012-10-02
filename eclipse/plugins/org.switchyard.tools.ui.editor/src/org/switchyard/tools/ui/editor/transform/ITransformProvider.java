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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.swt.widgets.Composite;

/**
 * ITransformProvider
 * 
 * <p/>
 * Interface used for defining the functionality provided by a transformer type.
 */
public interface ITransformProvider {

    /**
     * @return true if this provider uses a wizard for collecting transformer
     *         details.
     */
    public boolean providesWizard();

    /**
     * Creates a new wizard for collecting transformer details. Providers must
     * implement this method if {@link #providesWizard()} returns true.
     * 
     * @return a new wizard.
     */
    public INewTransformWizard createWizard();

    /**
     * Create controls required for collecting transformer details. Providers
     * must implement this method if {@link #providesWizard()} returns false.
     * 
     * @param parent the parent composite
     * @param container the containing wizard page
     * @return the control
     */
    public ITransformControl createTransformControl(Composite parent, IContainer container);

    /**
     * @return the name of this provider, e.g. Java Transform.
     */
    public String getName();

    /**
     * Interface providing methods for interacting with a
     * {@link ITransformControl}'s container.
     */
    public interface IContainer {

        /**
         * @return the runnable context of the host dialog.
         */
        IRunnableContext getContext();

        /**
         * @return the project containing the SwitchYard configuration that will
         *         declare the new transformers
         */
        IProject getContainingProject();

        /**
         * Notify the container that an {@link ITransformControl}'s validation
         * status has changed.
         * 
         * @param control the control whose status has changed
         * @param status the new status
         */
        void updateStatus(ITransformControl control, IStatus status);
    }
}
