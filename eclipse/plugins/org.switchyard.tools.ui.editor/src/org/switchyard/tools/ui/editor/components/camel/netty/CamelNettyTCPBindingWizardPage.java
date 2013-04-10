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
package org.switchyard.tools.ui.editor.components.camel.netty;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.netty.NettyFactory;

/**
 * @author bfitzpat
 * 
 */
public class CamelNettyTCPBindingWizardPage extends WizardPage {

    private CamelNettyTCPComposite _nettyTCPComposite = null;
    private CamelNettyTcpBindingType _binding = NettyFactory.eINSTANCE.createCamelNettyTcpBindingType();
    private Contract _targetContainer;

    /**
     * @param pageName String for name
     */
    public CamelNettyTCPBindingWizardPage(String pageName) {
        super(pageName);
        setTitle("Specify Netty TCP Binding Details");
        setDescription("Specify pertinent details for your Netty TCP Binding.");
    }

    @Override
    public void createControl(Composite parent) {
        _targetContainer = ((CamelNettyTCPBindingWizard)getWizard()).getTargetContainer();
        _nettyTCPComposite = new CamelNettyTCPComposite();
        _nettyTCPComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent arg0) {
                setErrorMessage(_nettyTCPComposite.getErrorMessage());
                setPageComplete(_nettyTCPComposite.getErrorMessage() == null);
            }
        });
        _nettyTCPComposite.setTargetObject(_targetContainer);
        _nettyTCPComposite.createContents(parent, SWT.NONE);
        _nettyTCPComposite.setBinding(_binding);

        setControl(_nettyTCPComposite.getPanel());
        setPageComplete(_nettyTCPComposite.getErrorMessage() == null);
        setErrorMessage(null);
    }

    /**
     * @return the binding being edited.
     */
    public Binding getBinding() {
        return _binding;
    }

}
