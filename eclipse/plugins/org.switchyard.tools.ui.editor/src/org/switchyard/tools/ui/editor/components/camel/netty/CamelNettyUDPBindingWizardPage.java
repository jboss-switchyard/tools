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
import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelNettyUdpBindingType;

/**
 * @author bfitzpat
 * 
 */
public class CamelNettyUDPBindingWizardPage extends WizardPage {

    private CamelNettyUDPComposite _nettyUDPComposite = null;
    private CamelNettyUdpBindingType _binding = CamelFactory.eINSTANCE.createCamelNettyUdpBindingType();
    private Contract _targetContainer;

    /**
     * @param pageName String for name
     */
    public CamelNettyUDPBindingWizardPage(String pageName) {
        super(pageName);
        setTitle("Specify Netty UDP Binding Details");
        setDescription("Specify pertinent details for your Netty UDP Binding.");
    }

    @Override
    public void createControl(Composite parent) {
        _targetContainer = ((CamelNettyUDPBindingWizard)getWizard()).getTargetContainer();
        _nettyUDPComposite = new CamelNettyUDPComposite();
        _nettyUDPComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent arg0) {
                setErrorMessage(_nettyUDPComposite.getErrorMessage());
                setPageComplete(_nettyUDPComposite.getErrorMessage() == null);
            }
        });
        _nettyUDPComposite.createContents(parent, SWT.NONE);
        _nettyUDPComposite.setTargetObject(_targetContainer);
        _nettyUDPComposite.setBinding(_binding);

        setControl(_nettyUDPComposite.getPanel());
        setPageComplete(_nettyUDPComposite.getErrorMessage() == null);
        setErrorMessage(null);
    }

    /**
     * @return the binding being edited.
     */
    public Binding getBinding() {
        return _binding;
    }

}
