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
package org.switchyard.tools.ui.editor.diagram.component.wizards;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.LinkedWizardBase;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramAddComponentWizard extends LinkedWizardBase {

    private SCADiagramAddComponentStartPage _startPage = null;
    private Component _component = ScaFactory.eINSTANCE.createComponent();

    /**
     * Constructor.
     */
    public SCADiagramAddComponentWizard() {
        super();
        initPages();
        setWindowTitle("New Component");
        setForcePreviousAndNextButtons(true);
    }

    /**
     * @return Component
     */
    public Component getComponent() {
        return this._component;
    }

    private void initPages() {
        _startPage = new SCADiagramAddComponentStartPage("start");
    }

    @Override
    public boolean doFinish() {
        if (_startPage != null && _startPage.getComponentName() != null) {
            _component.setName(_startPage.getComponentName());
            IComponentImplementationWizard wizard = _startPage.getImplementationWizard();
            if (wizard != null) {
                _component.getImplementationGroup().set(wizard.getFeatureForImplementation(),
                        wizard.getImplementation());
                for (ComponentService service : wizard.getImplementationServices()) {
                    _component.getService().add(service);
                }
                for (ComponentReference reference : wizard.getImplementationReferences()) {
                    _component.getReference().add(reference);
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void addPages() {
        addPage(_startPage);
    }

    @Override
    public IWizardPage getNextPage(IWizardPage page) {
        if (page == _startPage) {
            if (_startPage.getImplementationWizard() == null) {
                return null;
            }
            setNext(_startPage.getImplementationWizard());
        }
        return super.getNextPage(page);
    }

}
