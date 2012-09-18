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
package org.switchyard.tools.ui.editor.components.http;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.models.switchyard1_0.http.HttpBindingType;
import org.switchyard.tools.models.switchyard1_0.http.HttpFactory;

/**
 * @author bfitzpat
 * 
 */
public class HttpBindingWizardPage extends WizardPage {

    private HttpBindingType _binding = HttpFactory.eINSTANCE.createHttpBindingType();
    private HttpBindingComposite _httpComposite = null;
    private Contract _targetContainer;

    /**
     * @param pageName String for name
     */
    public HttpBindingWizardPage(String pageName) {
        super(pageName);
        setTitle("Specify HTTP Binding Details");
        setDescription("Specify pertinent details for your HTTP Binding.");
    }

    @Override
    public void createControl(Composite parent) {
        _targetContainer = ((HttpBindingWizard)getWizard()).getTargetContainer();
//        if (_targetContainer instanceof Reference) {
//            _binding.setSocketAddr(null);
//        }
        _httpComposite = new HttpBindingComposite();
        _httpComposite.setTargetObject(_targetContainer);
        _httpComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent arg0) {
                setErrorMessage(_httpComposite.getErrorMessage());
                setPageComplete(_httpComposite.getErrorMessage() == null);
            }
        });
        _httpComposite.createContents(parent, SWT.NONE);
        _httpComposite.setBinding(_binding);

        setControl(_httpComposite.getPanel());
        setPageComplete(_httpComposite.getErrorMessage() == null);
        setErrorMessage(null);
    }

    /**
     * @return the binding being edited.
     */
    public Binding getBinding() {
        return _httpComposite.getBinding();
    }

}
