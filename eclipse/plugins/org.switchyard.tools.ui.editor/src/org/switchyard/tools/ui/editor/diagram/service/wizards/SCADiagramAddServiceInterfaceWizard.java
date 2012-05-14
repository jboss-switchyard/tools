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
package org.switchyard.tools.ui.editor.diagram.service.wizards;

import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizard;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramAddServiceInterfaceWizard extends BaseWizard {

    @Override
    public boolean canFinish() {
        if (getInterface() == null) {
            return false;
        }
        return super.canFinish();
    }

    private SCADiagramAddServiceInterfaceStartPage _startPage = null;
    private SCADiagramAddCompositeServiceJavaPage _javaPage = null;
    private SCADiagramAddCompositeServiceWSDLPage _wsdlPage = null;
    
    private Diagram _diagram = null;
    private Component _component = null;

    /**
     * Constructor.
     */
    public SCADiagramAddServiceInterfaceWizard() {
        super();
        initPages();
        setWindowTitle("New Service Interface");
    }

    /**
     * @param component this component
     */
    public void setComponent(Component component) {
        this._component = component;
    }

    /**
     * @param inheritedInterface interface from the component service to promote
     */
    public void setInheritedInterface(Interface inheritedInterface) {
        if (_startPage != null) {
            _startPage.setInheritedInterface(inheritedInterface);
        }
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
        _startPage = new SCADiagramAddServiceInterfaceStartPage("start");
        _javaPage = new SCADiagramAddCompositeServiceJavaPage(_startPage, "camel");
        _wsdlPage = new SCADiagramAddCompositeServiceWSDLPage(_startPage, "wsdl");
    }

    @Override
    public boolean performFinish() {
        if (_startPage != null && _startPage.getInterface() != null) {
            return true;
        }
        return false;
    }

    @Override
    public void addPages() {
        addPage(_startPage);
        addPage(_javaPage);
        addPage(_wsdlPage);
    }

    /**
     * @return the implementation
     */
    public Interface getInterface() {
        if (_startPage != null) {
            return _startPage.getInterface();
        }
        return null;
    }

    @Override
    public IWizardPage getNextPage(IWizardPage page) {
        if (page.equals(_startPage)) {
            Interface interfaceToTest = _startPage.getInterface();
            if (interfaceToTest instanceof JavaInterface) {
                _javaPage.refresh();
                return _javaPage;
            } else if (interfaceToTest instanceof WSDLPortType) {
                _wsdlPage.refresh();
                return _wsdlPage;
            }

        }
        return super.getNextPage(page);
    }
}
