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
package org.switchyard.tools.ui.editor.components.camel.ftps;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpFactory;

/**
 * @author bfitzpat
 * 
 */
public class CamelFTPSBindingWizardPage extends WizardPage {

    private CamelFTPSConsumerComposite _consumerComposite = null;
    private CamelFTPSProducerComposite _producerComposite = null;
    private CamelFtpsBindingType _binding = FtpFactory.eINSTANCE.createCamelFtpsBindingType();
    private boolean _showConsumer;
    private Contract _targetContainer;

    /**
     * @param pageName String for name
     */
    public CamelFTPSBindingWizardPage(String pageName) {
        super(pageName);
        setTitle("Specify FTPS Binding Details");
        setDescription("Specify pertinent details for your FTPS Binding.");
    }

    /**
     * Must be called prior to creating the control.
     * 
     * @param showConsumer true to show consumer details; false to show producer
     *            details.
     */
    public void setShowConsumer(boolean showConsumer) {
        _showConsumer = showConsumer;
        if (_binding != null) {
            if (_showConsumer) {
                _binding.setConsume(FtpFactory.eINSTANCE.createRemoteFileConsumerType());
            } else {
                _binding.setProduce(FtpFactory.eINSTANCE.createRemoteFileProducerType());
            }
        }
    }

    @Override
    public void createControl(Composite parent) {
        _targetContainer = ((CamelFTPSBindingWizard)getWizard()).getTargetContainer();
        if (_showConsumer) {
            _consumerComposite = new CamelFTPSConsumerComposite();
            _consumerComposite.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent arg0) {
                    setErrorMessage(_consumerComposite.getErrorMessage());
                    setPageComplete(_consumerComposite.getErrorMessage() == null);
                }
            });
            _consumerComposite.createContents(parent, SWT.NONE);
            _consumerComposite.setTargetObject(_targetContainer);
            _consumerComposite.setBinding(_binding);

            setControl(_consumerComposite.getPanel());
            setPageComplete(_consumerComposite.getErrorMessage() == null);
            setErrorMessage(null);
        } else {
            _producerComposite = new CamelFTPSProducerComposite();
            _producerComposite.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent arg0) {
                    setErrorMessage(_producerComposite.getErrorMessage());
                    setPageComplete(_producerComposite.getErrorMessage() == null);
                }
            });
            _producerComposite.createContents(parent, SWT.NONE);
            _producerComposite.setBinding(_binding);

            setControl(_producerComposite.getPanel());
            setPageComplete(_producerComposite.getErrorMessage() == null);
            setErrorMessage(null);

        }
    }

    /**
     * @return the binding being edited.
     */
    public Binding getBinding() {
        return _binding;
    }

}
