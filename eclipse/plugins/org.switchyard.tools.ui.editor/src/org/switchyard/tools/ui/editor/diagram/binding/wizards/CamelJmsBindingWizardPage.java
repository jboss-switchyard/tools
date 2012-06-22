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
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType;
import org.switchyard.tools.ui.editor.diagram.shared.CamelJmsComposite;

/**
 * @author bfitzpat
 * 
 */
public class CamelJmsBindingWizardPage extends WizardPage {

    private CamelJmsComposite _consumerComposite = null;
    private CamelJmsBindingType _binding = CamelFactory.eINSTANCE.createCamelJmsBindingType();
    private Contract _targetContainer;

    /**
     * @param pageName String for name
     */
    public CamelJmsBindingWizardPage(String pageName) {
        super(pageName);
        setTitle("Specify JMS Binding Details");
        setDescription("Specify pertinent details for your JMS Binding.");
    }

    @Override
    public void createControl(Composite parent) {
        _targetContainer = ((CamelJmsBindingWizard)getWizard()).getTargetContainer();
        _consumerComposite = new CamelJmsComposite();
        _consumerComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent arg0) {
                setErrorMessage(_consumerComposite.getErrorMessage());
                setPageComplete(_consumerComposite.getErrorMessage() == null);
            }
        });
        _consumerComposite.setTargetObject(_targetContainer);
        _consumerComposite.createContents(parent, SWT.NONE);
        _consumerComposite.setBinding(_binding);
        setPageComplete(_consumerComposite.getErrorMessage() == null);

        setControl(_consumerComposite.getPanel());

        setErrorMessage(null);
    }

    /**
     * @return the binding being edited.
     */
    public Binding getBinding() {
        return _binding;
    }

}
