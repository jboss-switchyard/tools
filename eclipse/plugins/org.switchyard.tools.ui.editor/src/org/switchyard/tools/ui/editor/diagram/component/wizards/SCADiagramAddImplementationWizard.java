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

import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizard;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramAddImplementationWizard extends BaseWizard {

    private SCADiagramAddImplementationStartPage _startPage = null;
    private SCADiagramAddComponentImplementationCamelPage _camelPage = null;
    private Diagram _diagram = null;
    private Component _component = null;

    /**
     * Constructor.
     */
    public SCADiagramAddImplementationWizard() {
        super();
        initPages();
        setWindowTitle("New Implementation");
    }

    /**
     * @param component this component
     */
    public void setComponent(Component component) {
        this._component = component;
    }

    /**
     * @return the component
     */
    public Component getComponent() {
        return this._component;
    }

    /**
     * @param diagram the diagram
     */
    public void setDiagram(Diagram diagram) {
        this._diagram = diagram;
    }

    /**
     * @return the diagram
     */
    public Diagram getDiagram() {
        return this._diagram;
    }

    private void initPages() {
        _startPage = new SCADiagramAddImplementationStartPage("start");
        _camelPage = new SCADiagramAddComponentImplementationCamelPage(_startPage, "camel");
    }

    @Override
    public boolean performFinish() {
        if (_startPage != null && _startPage.getImplementation() != null) {
            return true;
        }
        return false;
    }

    @Override
    public void addPages() {
        addPage(_startPage);
        addPage(_camelPage);
    }

    /**
     * @return the implementation
     */
    public Implementation getImplementation() {
        if (_startPage != null) {
            return _startPage.getImplementation();
        }
        return null;
    }

    @Override
    public IWizardPage getNextPage(IWizardPage page) {
        if (page.equals(_startPage)) {
            Implementation interfaceToTest = _startPage.getImplementation();
            if (interfaceToTest instanceof CamelImplementationType) {
                _camelPage.refresh();
                return _camelPage;
            }
        }
        return super.getNextPage(page);
    }
}
