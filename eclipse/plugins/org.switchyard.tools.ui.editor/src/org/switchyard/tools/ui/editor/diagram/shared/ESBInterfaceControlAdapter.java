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
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.swt.widgets.Shell;
import org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.ui.editor.Activator;

/**
 * JavaInterfaceControlAdapter
 * 
 * <p/>
 * Control adapter supporting Java interfaces.
 * 
 * @author Rob Cernich
 */
public class ESBInterfaceControlAdapter implements IInterfaceControlAdapter {

    private EsbInterface _interface;

    /**
     * Create a new JavaInterfaceControlAdapter.
     * 
     */
    public ESBInterfaceControlAdapter() {
        _interface = SwitchyardFactory.eINSTANCE.createEsbInterface();
    }

    @Override
    public Interface getInterface() {
        return _interface;
    }

    @Override
    public void init(Interface intf) {
    }

    @Override
    public boolean browse(Shell shell, IJavaProject project) {
        return false;
    }

    @Override
    public boolean open(Shell shell, IJavaProject project) {
        return false;
    }

    @Override
    public String getText() {
        return "";
    }

    @Override
    public IStatus validate(IJavaProject project) {
        return new Status(Status.ERROR, Activator.PLUGIN_ID, "ESB interface not supported (yet).");
    }

}
