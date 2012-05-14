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

import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.LinkedWizardBase;

/**
 * @author bfitzpat
 * 
 */
public class SCADiagramAddImplementationWizard extends LinkedWizardBase implements IComponentImplementationWizard {

    private Implementation _implementation;
    private EStructuralFeature _structuralFeature;
    private List<ComponentService> _services;
    private List<ComponentReference> _references;
    private SCADiagramAddImplementationStartPage _startPage = null;

    /**
     * Constructor.
     */
    public SCADiagramAddImplementationWizard() {
        super();
        initPages();
        setWindowTitle("New Implementation");
        setForcePreviousAndNextButtons(true);
    }

    private void initPages() {
        _startPage = new SCADiagramAddImplementationStartPage("start");
    }

    @Override
    public boolean doFinish() {
        if (_startPage == null || _startPage.getImplementationWizard() == null) {
            return false;
        }

        IComponentImplementationWizard wizard = _startPage.getImplementationWizard();
        _implementation = wizard.getImplementation();
        _structuralFeature = wizard.getFeatureForImplementation();
        _services = wizard.getImplementationServices();
        _references = wizard.getImplementationReferences();

        return true;
    }

    @Override
    public void addPages() {
        addPage(_startPage);
    }

    @Override
    public Implementation getImplementation() {
        return _implementation;
    }

    @Override
    public String getDisplayName() {
        return "New Component Implementation";
    }

    @Override
    public void setImplementation(Implementation implementation) throws ClassCastException {
        _implementation = implementation;
        // TODO: should probably propagate to child wizards.
    }

    @Override
    public EStructuralFeature getFeatureForImplementation() {
        return _structuralFeature;
    }

    @Override
    public List<ComponentService> getImplementationServices() {
        return _services;
    }

    @Override
    public List<ComponentReference> getImplementationReferences() {
        return _references;
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
