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
package org.switchyard.tools.ui.editor.diagram.componentservice.wizards;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizard;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramAddComponentServiceWizard extends BaseWizard {

    private SCADiagramAddComponentServiceStartPage _startPage = null;
    private SCADiagramAddComponentServiceJavaPage _javaPage = null;
    private SCADiagramAddComponentServiceWSDLPage _wsdlPage = null;

    /**
     * Constructor.
     */
    public SCADiagramAddComponentServiceWizard() {
        super();
        initPages();
        setWindowTitle("New Component Service");
    }

    private void initPages() {
        _startPage = new SCADiagramAddComponentServiceStartPage("start");
        _javaPage = new SCADiagramAddComponentServiceJavaPage(_startPage, "java");
        _wsdlPage = new SCADiagramAddComponentServiceWSDLPage(_startPage, "wsdl");
    }

    @Override
    public boolean performFinish() {
        if (_startPage != null && _startPage.getComponentServiceName() != null) {
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
     * @return string name
     */
    public String getComponentServiceName() {
        if (_startPage != null) {
            return _startPage.getComponentServiceName();
        }
        return null;
    }

    /**
     * @return interface
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
