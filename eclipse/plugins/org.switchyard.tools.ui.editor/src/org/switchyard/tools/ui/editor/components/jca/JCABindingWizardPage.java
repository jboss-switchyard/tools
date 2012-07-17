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
package org.switchyard.tools.ui.editor.components.jca;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;

/**
 * @author bfitzpat
 * 
 */
public class JCABindingWizardPage extends WizardPage {

    private JCABinding _binding = JcaFactory.eINSTANCE.createJCABinding();
    private JCABindingInboundComposite _jcaInComposite = null;
    private JCABindingOutboundComposite _jcaOutComposite = null;
    private Contract _targetContainer;

    /**
     * @param pageName String for name
     */
    public JCABindingWizardPage(String pageName) {
        super(pageName);
        setTitle("Specify JCA Inbound Binding Details");
        setDescription("Specify pertinent details for your JCA Inbound Binding. Resource adapters may require unique properties.");
    }

    @Override
    public void createControl(Composite parent) {
        _targetContainer = ((JCABindingWizard)getWizard()).getTargetContainer();
        if (_targetContainer instanceof Service) {
            _jcaInComposite = new JCABindingInboundComposite();
            _jcaInComposite.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent arg0) {
                    setErrorMessage(_jcaInComposite.getErrorMessage());
                    setPageComplete(_jcaInComposite.getErrorMessage() == null);
                }
            });
            _jcaInComposite.createContents(parent, SWT.NONE);
            _jcaInComposite.setTargetObject(_targetContainer);
            _jcaInComposite.setBinding(_binding);
    
            setControl(_jcaInComposite.getPanel());
            setPageComplete(_jcaInComposite.getErrorMessage() == null);
        } else if (_targetContainer instanceof Reference) {
            setTitle("Specify JCA Outbound Binding Details");
            setDescription("Specify pertinent details for your JCA Outbound Binding. Resource adapters may require unique properties.");
            _jcaOutComposite = new JCABindingOutboundComposite();
            _jcaOutComposite.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent arg0) {
                    setErrorMessage(_jcaOutComposite.getErrorMessage());
                    setPageComplete(_jcaOutComposite.getErrorMessage() == null);
                }
            });
            _jcaOutComposite.createContents(parent, SWT.NONE);
            _jcaOutComposite.setTargetObject(_targetContainer);
            _jcaOutComposite.setBinding(_binding);
    
            setControl(_jcaOutComposite.getPanel());
            setPageComplete(_jcaOutComposite.getErrorMessage() == null);
        }
        setErrorMessage(null);
    }

    /**
     * @return the binding being edited.
     */
    public Binding getBinding() {
        if (_jcaOutComposite != null) {
            return _jcaOutComposite.getBinding();
        } else {
            return _jcaInComposite.getBinding();
        }
    }

}
