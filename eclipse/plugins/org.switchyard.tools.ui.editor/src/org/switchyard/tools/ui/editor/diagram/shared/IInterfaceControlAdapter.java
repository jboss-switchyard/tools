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
package org.switchyard.tools.ui.editor.diagram.shared;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.swt.widgets.Shell;

/**
 * IInterfaceControlAdapter
 * 
 * <p/>
 * Provides basic UI functionality for specific interface types.
 * 
 * @author Rob Cernich
 */
public interface IInterfaceControlAdapter {

    /**
     * @return the Interface data object associated with the control.
     */
    public Interface getInterface();

    /**
     * @param intf the Interface data object associated with the control.
     */
    public void init(Interface intf);

    /**
     * The "browse" button on the control has been pressed. Implementations
     * should implement appropriate behavior based on the type they are
     * supporting (e.g. select type for JavaInterface).
     * 
     * @param shell the parent shell
     * @param project the containing project (may be used to reduce scope)
     * 
     * @return true if the data associated with this adapter has changed.
     */
    public boolean browse(Shell shell, IJavaProject project);

    /**
     * The "open/create" link on the control has been pressed. Implementations
     * should implement appropriate behavior based on the type they are
     * supporting (e.g. new Java interface).
     * 
     * @param shell the parent shell
     * @param project the containing project (may be used to reduce scope)
     * 
     * @return true if the data associated with this adapter has changed.
     */
    public boolean open(Shell shell, IJavaProject project);

    /**
     * @return the text that should be displayed for the interface type (e.g.
     *         Java interface name).
     */
    public String getText();

    /**
     * @param project the containing project (may be used to reduce scope)
     * 
     * @return status after validation.
     */
    public IStatus validate(IJavaProject project);

}
