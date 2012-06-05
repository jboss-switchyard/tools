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
package org.switchyard.tools.ui.editor.diagram.binding.wizards;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType;
import org.switchyard.tools.ui.editor.diagram.shared.CamelFTPConsumerComposite;
import org.switchyard.tools.ui.editor.diagram.shared.CamelFTPProducerComposite;

/**
 * @author bfitzpat
 * 
 */
public class CamelFTPBindingWizardPage extends WizardPage {

    private CamelFTPConsumerComposite _consumerComposite = null;
    private CamelFTPProducerComposite _producerComposite = null;
    private CamelFtpBindingType _binding = CamelFactory.eINSTANCE.createCamelFtpBindingType();
    private boolean _showConsumer;

    /**
     * @param pageName String for name
     */
    public CamelFTPBindingWizardPage(String pageName) {
        super(pageName);
        setTitle("Specify FTP Binding Details");
        setDescription("Specify pertinent details for your FTP Binding.");
    }

    /**
     * Must be called prior to creating the control.
     * 
     * @param showConsumer true to show consumer details; false to show producer
     *            details.
     */
    public void setShowConsumer(boolean showConsumer) {
        _showConsumer = showConsumer;
    }

    @Override
    public void createControl(Composite parent) {
        if (_showConsumer) {
            _consumerComposite = new CamelFTPConsumerComposite();
            _consumerComposite.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent arg0) {
                    setErrorMessage(_consumerComposite.getErrorMessage());
                    setPageComplete(_consumerComposite.getErrorMessage() == null);
                }
            });
            _consumerComposite.createContents(parent, SWT.NONE);
            _consumerComposite.setBinding(_binding);

            setControl(_consumerComposite.getPanel());
        } else {
            _producerComposite = new CamelFTPProducerComposite();
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
        }

        setErrorMessage(null);
    }

    /**
     * @return the binding being edited.
     */
    public Binding getBinding() {
        return _binding;
    }

}
