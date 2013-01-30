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
package org.switchyard.tools.ui.common.impl;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.window.Window;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.swt.widgets.Shell;
import org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.common.ESBInterfaceInputDialog;
import org.switchyard.tools.ui.common.IInterfaceControlAdapter;

/**
 * EsbInterfaceControlAdapter
 * 
 * <p/>
 * Control adapter supporting Esb interfaces.
 * 
 * @author Rob Cernich
 */
public class ESBInterfaceControlAdapter implements IInterfaceControlAdapter {

    private EsbInterface _interface;

    /**
     * Create a new EsbInterfaceControlAdapter.
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
    public void setRelatedInterface(Interface related) {
    }

    @Override
    public void init(Interface intf) {
        if (intf instanceof EsbInterface) {
            final EsbInterface esbIntfc = (EsbInterface) intf;
            _interface.setFaultType(esbIntfc.getFaultType());
            _interface.setInputType(esbIntfc.getInputType());
            _interface.setOutputType(esbIntfc.getOutputType());
        } else {
            _interface.setFaultType(null);
            _interface.setInputType(null);
            _interface.setOutputType(null);
        }
    }

    @Override
    public boolean browse(Shell shell, IJavaProject project) {
        ESBInterfaceInputDialog dialog = new ESBInterfaceInputDialog(shell);
        if (_interface.getFaultType() != null && !_interface.getFaultType().trim().isEmpty()) {
            dialog.setFaultType(_interface.getFaultType());
        }
        if (_interface.getOutputType() != null && !_interface.getOutputType().trim().isEmpty()) {
            dialog.setOutputType(_interface.getOutputType());
        }
        if (_interface.getInputType() != null && !_interface.getInputType().trim().isEmpty()) {
            dialog.setInputType(_interface.getInputType());
        }
        int rtn_code = dialog.open();
        if (rtn_code == Window.OK) {
            if (dialog.getFaultType() != null && !dialog.getFaultType().trim().isEmpty()) {
                _interface.setFaultType(dialog.getFaultType());
            }
            if (dialog.getOutputType() != null && !dialog.getOutputType().trim().isEmpty()) {
                _interface.setOutputType(dialog.getOutputType());
            }
            if (dialog.getInputType() != null && !dialog.getInputType().trim().isEmpty()) {
                _interface.setInputType(dialog.getInputType());
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean open(Shell shell, IJavaProject project, boolean useRelated) {
        return browse(shell, project);
    }

    @Override
    public String getText() {
        if (_interface == null) {
            return "";
        } else if (_interface.getInputType() == null && _interface.getOutputType() == null && _interface.getFaultType() == null) {
            return "";
        }
        // (void | outputType) esbOperation(inputType) throws faultType
        String renderText = "";
        if (_interface.getOutputType() != null) {
            renderText = "(" + _interface.getOutputType() + ") ";
        } else {
            renderText = "(void) ";
        }
        renderText = renderText + "esbOperation(";
        if (_interface.getInputType() != null) {
            renderText = renderText + _interface.getInputType() + ")";
        } else {
            renderText = renderText + ")";
        }
        if (_interface.getFaultType() != null) {
            renderText = renderText + " throws " + _interface.getFaultType();
        }
        return renderText;
    }

    @Override
    public IStatus validate(IJavaProject project) {
        if (_interface.getInputType() == null) {
            return new Status(Status.ERROR, Activator.PLUGIN_ID, "Please specify an input type for the ESB interface.");
        }
        
        if (_interface.getFaultType() != null && _interface.getOutputType() == null) {
            return new Status(Status.ERROR, Activator.PLUGIN_ID, "Specifying a fault type also requires the output type for the ESB interface.");
        }
        
        return Status.OK_STATUS;
    }

}
