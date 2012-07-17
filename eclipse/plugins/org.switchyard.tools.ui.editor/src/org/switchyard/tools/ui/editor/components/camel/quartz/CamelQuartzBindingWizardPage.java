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
package org.switchyard.tools.ui.editor.components.camel.quartz;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelQuartzBindingType;

/**
 * @author bfitzpat
 * 
 */
public class CamelQuartzBindingWizardPage extends WizardPage {

    private CamelQuartzComposite _quartzComposite = null;
    private CamelQuartzBindingType _binding = CamelFactory.eINSTANCE.createCamelQuartzBindingType();
    private Contract _targetContainer;

    /**
     * @param pageName String for name
     */
    public CamelQuartzBindingWizardPage(String pageName) {
        super(pageName);
        setTitle("Specify Scheduling Binding Details");
        setDescription("Specify pertinent details for your Scheduling Binding.");
    }

    @Override
    public void createControl(Composite parent) {
        _targetContainer = ((CamelQuartzBindingWizard)getWizard()).getTargetContainer();
        _quartzComposite = new CamelQuartzComposite();
        _quartzComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent arg0) {
                setErrorMessage(_quartzComposite.getErrorMessage());
                setPageComplete(_quartzComposite.getErrorMessage() == null);
            }
        });
        _quartzComposite.createContents(parent, SWT.NONE);
        _quartzComposite.setTargetObject(_targetContainer);
        _quartzComposite.setBinding(_binding);

        setControl(_quartzComposite.getPanel());
        setPageComplete(_quartzComposite.getErrorMessage() == null);

        setErrorMessage(null);
    }

    /**
     * @return the binding being edited.
     */
    public Binding getBinding() {
        return _binding;
    }

}
