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
package org.switchyard.tools.ui.editor.components.resteasy;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType;
import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyFactory;

/**
 * @author bfitzpat
 * 
 */
public class ResteasyBindingWizardPage extends WizardPage {

    private RESTBindingType _binding = ResteasyFactory.eINSTANCE.createRESTBindingType();
    private ResteasyBindingComposite _restComposite = null;
    private Contract _targetContainer;

    /**
     * @param pageName String for name
     */
    public ResteasyBindingWizardPage(String pageName) {
        super(pageName);
        setTitle("Specify RESTEasy Binding Details");
        setDescription("Specify pertinent details for your RESTEasy Binding.");
    }

    @Override
    public void createControl(Composite parent) {
        _targetContainer = ((ResteasyBindingWizard)getWizard()).getTargetContainer();
//        if (_targetContainer instanceof Reference) {
//            _binding.setSocketAddr(null);
//        }
        _restComposite = new ResteasyBindingComposite();
        _restComposite.setTargetObject(_targetContainer);
        _restComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent arg0) {
                setErrorMessage(_restComposite.getErrorMessage());
                setPageComplete(_restComposite.getErrorMessage() == null);
            }
        });
        _restComposite.createContents(parent, SWT.NONE);
        _restComposite.setBinding(_binding);

        setControl(_restComposite.getPanel());
        setPageComplete(_restComposite.getErrorMessage() == null);
        setErrorMessage(null);
    }

    /**
     * @return the binding being edited.
     */
    public Binding getBinding() {
        return _restComposite.getBinding();
    }

}
