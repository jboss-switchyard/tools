/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
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
package org.switchyard.tools.ui.editor.components.binding.sca;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.SCABinding;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

/**
 * @author bfitzpat
 * 
 */
public class BindingSCAWizardPage extends WizardPage {

    private BindingSCAComposite _consumerComposite = null;
    private SCABinding _binding = ScaFactory.eINSTANCE.createSCABinding();
    private boolean _showConsumer;
    private Contract _targetContainer;

    /**
     * @param pageName String for name
     */
    public BindingSCAWizardPage(String pageName) {
        super(pageName);
        setTitle("Specify SCA Binding Details");
        setDescription("Specify pertinent details for your SCA Binding.");
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
        _targetContainer = ((BindingSCAWizard)getWizard()).getTargetContainer();
        _consumerComposite = new BindingSCAComposite();
        
        _consumerComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent arg0) {
                setErrorMessage(_consumerComposite.getErrorMessage());
                setPageComplete(_consumerComposite.getErrorMessage() == null);
            }
        });
        _consumerComposite.setShowConsumer(_showConsumer);
        _consumerComposite.createContents(parent, SWT.NONE);
        _consumerComposite.setTargetObject(_targetContainer);
        _consumerComposite.setBinding(_binding);

        setControl(_consumerComposite.getPanel());
        setPageComplete(_consumerComposite.getErrorMessage() == null);
        setErrorMessage(null);
    }

    /**
     * @return the binding being edited.
     */
    public Binding getBinding() {
        return _binding;
    }

}
