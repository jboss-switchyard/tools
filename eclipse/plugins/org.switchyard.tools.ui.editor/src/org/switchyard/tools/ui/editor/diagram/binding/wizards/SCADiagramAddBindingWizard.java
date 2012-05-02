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

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramAddBindingWizard extends Wizard {

    private SCADiagramAddBindingStartPage _startPage = null;
    private SCADiagramAddBindingSOAPPage _soapPage = null;

    /**
     * No-arg constructor.
     */
    public SCADiagramAddBindingWizard() {
        super();
        initPages();
        setWindowTitle("New Binding");
    }

    private void initPages() {
        _startPage = new SCADiagramAddBindingStartPage("start");
        _soapPage = new SCADiagramAddBindingSOAPPage(_startPage, "soap");
    }

    @Override
    public boolean performFinish() {
        if (_startPage != null && _startPage.getBinding() != null) {
            return true;
        }
        return false;
    }

    @Override
    public void addPages() {
        addPage(_startPage);
        addPage(_soapPage);
    }

    /**
     * @return selected binding
     */
    public SwitchYardBindingType getBinding() {
        if (_startPage != null) {
            return _startPage.getBinding();
        }
        return null;
    }

    @Override
    public IWizardPage getNextPage(IWizardPage page) {
        if (page.equals(_startPage)) {
            SwitchYardBindingType bindingToTest = _startPage.getBinding();
            if (bindingToTest instanceof SOAPBindingType) {
                _soapPage.refresh();
                return _soapPage;
            }
        }
        return super.getNextPage(page);
    }
}
