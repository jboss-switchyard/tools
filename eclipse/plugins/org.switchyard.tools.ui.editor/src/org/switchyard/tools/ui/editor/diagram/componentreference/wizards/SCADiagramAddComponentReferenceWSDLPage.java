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
package org.switchyard.tools.ui.editor.diagram.componentreference.wizards;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

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
public class SCADiagramAddComponentReferenceWSDLPage extends BaseWizardPage implements IRefreshablePage {

    private WSDLURISelectionComposite _uriComposite = null;
    private SCADiagramAddComponentReferenceStartPage _startPage = null;

    /**
     * @param start start page
     * @param pageName page name
     */
    public SCADiagramAddComponentReferenceWSDLPage(SCADiagramAddComponentReferenceStartPage start, String pageName) {
        this(pageName);
        this._startPage = start;
    }

    protected SCADiagramAddComponentReferenceWSDLPage(String pageName) {
        super(pageName);
        setTitle("Specify WSDL Path");
        setDescription("Specify the URI for the WSDL.");
    }

    @Override
    public void createControl(Composite parent) {
        _uriComposite = new WSDLURISelectionComposite();
        if (_startPage != null && _startPage.getInterface() != null) {
            _uriComposite.setInterface(_startPage.getInterface());
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
     * @return uri
     */
    public String getWSDLURI() {
        return this._uriComposite.getWSDLURI();
    }

    @Override
    public boolean getSkippable() {
        if (this._startPage != null && this._startPage.getInterface() != null) {
            if (_startPage.getInterface() instanceof WSDLPortType) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void refresh() {
        if (_startPage != null && _startPage.getInterface() instanceof WSDLPortType) {
            if (_uriComposite != null && _uriComposite.getcPanel() != null) {
                _uriComposite.setInterface(_startPage.getInterface());
            }
        }
    }

}
