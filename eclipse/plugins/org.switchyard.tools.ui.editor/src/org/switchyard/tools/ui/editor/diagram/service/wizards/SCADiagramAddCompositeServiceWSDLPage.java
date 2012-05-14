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

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizardPage;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.IRefreshablePage;
import org.switchyard.tools.ui.editor.diagram.shared.WSDLURISelectionComposite;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramAddCompositeServiceWSDLPage extends BaseWizardPage implements IRefreshablePage {

    private WizardPage _startPage = null;
    private WSDLURISelectionComposite _uriComposite = null;
    private boolean _canEdit = true;

    /**
     * @param start start page
     * @param pageName page name
     */
    public SCADiagramAddCompositeServiceWSDLPage(WizardPage start, String pageName) {
        this(pageName);
        this._startPage = start;
    }

    protected SCADiagramAddCompositeServiceWSDLPage(String pageName) {
        super(pageName);
        setTitle("Specify WSDL Path");
        setDescription("Specify the URI for the WSDL.");
    }

    @Override
    public void createControl(Composite parent) {
        _uriComposite = new WSDLURISelectionComposite();
        if (_startPage != null && getInterfaceFromStartPage() != null) {
            _uriComposite.setInterface(getInterfaceFromStartPage());
            _uriComposite.setCanEdit(_canEdit);
        }
        _uriComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent arg0) {
                setErrorMessage(_uriComposite.getErrorMessage());
                setPageComplete(_uriComposite.getErrorMessage() == null);
            }
        });
        _uriComposite.createContents(parent, SWT.NONE);

        setControl(_uriComposite.getcPanel());

        setErrorMessage(null);
    }

    /**
     * @return string uri
     */
    public String getWSDLURI() {
        return this._uriComposite.getWSDLURI();
    }

    @Override
    public boolean getSkippable() {
        if (this._startPage != null && getInterfaceFromStartPage() != null) {
            if (getInterfaceFromStartPage() instanceof WSDLPortType) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void refresh() {
        if (_startPage != null && getInterfaceFromStartPage() instanceof WSDLPortType) {
            if (_uriComposite != null && _uriComposite.getcPanel() != null) {
                _uriComposite.setInterface(getInterfaceFromStartPage());
                _uriComposite.setCanEdit(_canEdit);
            }
        }
    }

    private Interface getInterfaceFromStartPage() {
        if (_startPage != null) {
            if (_startPage instanceof SCADiagramAddCompositeServiceStartPage) {
                SCADiagramAddCompositeServiceStartPage compositeSvcStart = (SCADiagramAddCompositeServiceStartPage) _startPage;
                return compositeSvcStart.getInterface();
            } else if (_startPage instanceof SCADiagramAddServiceInterfaceStartPage) {
                SCADiagramAddServiceInterfaceStartPage compositeSvcStart = (SCADiagramAddServiceInterfaceStartPage) _startPage;
                if (((SCADiagramAddServiceInterfaceStartPage) _startPage).interfaceIsEqual(
                        compositeSvcStart.getInterface(), compositeSvcStart.getInheritedInterface())) {
                    _canEdit = false;
                } else {
                    _canEdit = true;
                }
                return compositeSvcStart.getInterface();
            }
        }
        return null;
    }
}
