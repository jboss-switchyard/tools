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
package org.switchyard.tools.ui.editor.components.camel.binding;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.CoreFactory;

/**
 * @author bfitzpat
 * 
 */
public class CamelBindingWizardPage extends WizardPage {

    private CamelComposite _camelComposite = null;
    private CamelBindingType _binding = CoreFactory.eINSTANCE.createCamelBindingType();
    private Contract _targetContainer;

    /**
     * @param pageName String for name
     */
    public CamelBindingWizardPage(String pageName) {
        super(pageName);
        setTitle("Specify Camel Binding Details");
        setDescription("Specify pertinent details for your Camel Binding.");
    }

    @Override
    public void createControl(Composite parent) {
        _targetContainer = ((CamelBindingWizard)getWizard()).getTargetContainer();
        _camelComposite = new CamelComposite();
        _camelComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent arg0) {
                setErrorMessage(_camelComposite.getErrorMessage());
                setPageComplete(_camelComposite.getErrorMessage() == null);
            }
        });
        _camelComposite.setTargetObject(_targetContainer);
        _camelComposite.createContents(parent, SWT.NONE);
        _camelComposite.setBinding(_binding);

        setControl(_camelComposite.getPanel());
        setPageComplete(_camelComposite.getErrorMessage() == null);

        setErrorMessage(null);
    }

    /**
     * @return the binding being edited.
     */
    public Binding getBinding() {
        return _binding;
    }

}
