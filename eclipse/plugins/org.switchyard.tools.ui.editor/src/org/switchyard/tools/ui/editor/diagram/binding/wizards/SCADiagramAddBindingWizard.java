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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramAddBindingWizard extends Wizard {

    private SCADiagramAddBindingStartPage _startPage = null;
    private SCADiagramAddBindingSOAPPage _soapPage = null;
    private SCADiagramAddBindingCamelFilePage _camelFilePage = null;
    private EObject _parent;

    /**
     * @param parent Parent object (Service or Reference)
     */
    public SCADiagramAddBindingWizard(EObject parent) {
        super();
        this._parent = parent;
        initPages();
        setWindowTitle("New Binding");
    }

    private void initPages() {
        _startPage = new SCADiagramAddBindingStartPage("start");
        _soapPage = new SCADiagramAddBindingSOAPPage(_startPage, "soap");
        _camelFilePage = new SCADiagramAddBindingCamelFilePage(_startPage, "camelFile");
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
        addPage(_camelFilePage);
    }

    /**
     * @return selected binding
     */
    public Binding getBinding() {
        if (_startPage != null) {
            return _startPage.getBinding();
        }
        return null;
    }

    @Override
    public IWizardPage getNextPage(IWizardPage page) {
        if (page.equals(_startPage)) {
            Binding bindingToTest = _startPage.getBinding();
            if (bindingToTest instanceof SOAPBindingType) {
                _soapPage.refresh();
                return _soapPage;
            } else if (bindingToTest instanceof CamelFileBindingType) {
                _camelFilePage.refresh();
                return _camelFilePage;
            } else {
                return null;
            }
        }
        return super.getNextPage(page);
    }
    
    /**
     * @return parent EObject (Service or Reference)
     */
    public EObject getParentObject() {
        return this._parent;
    }
}
