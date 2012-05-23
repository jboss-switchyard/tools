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

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizardPage;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.IRefreshablePage;
import org.switchyard.tools.ui.editor.diagram.shared.WSDLURISelectionComposite;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramAddBindingSOAPPage extends BaseWizardPage implements IRefreshablePage {

    private SCADiagramAddBindingStartPage _startPage = null;
    private WSDLURISelectionComposite _uriComposite = null;

    /**
     * @param start Start page reference
     * @param pageName String for name
     */
    public SCADiagramAddBindingSOAPPage(SCADiagramAddBindingStartPage start, String pageName) {
        this(pageName);
        this._startPage = start;
    }

    protected SCADiagramAddBindingSOAPPage(String pageName) {
        super(pageName);
        setTitle("Specify SOAP Binding Details");
        setDescription("Specify pertinent details for your SOAP Binding.");
    }

    @Override
    public void createControl(Composite parent) {
        _uriComposite = new WSDLURISelectionComposite();
        if (_startPage != null && _startPage.getBinding() != null && _startPage.getBinding() instanceof SOAPBindingType) {
            _uriComposite.setBinding((SOAPBindingType) _startPage.getBinding());
        }
        _uriComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent arg0) {
                setErrorMessage(_uriComposite.getErrorMessage());
                setPageComplete(_uriComposite.getErrorMessage() == null);
            }
        });
        _uriComposite.createContents(parent, SWT.NONE);

        setControl(_uriComposite.getPanel());

        setErrorMessage(null);
    }

    /**
     * @return String for URI
     */
    public String getBindingURI() {
        return this._uriComposite.getWSDLURI();
    }

    /**
     * @return String for port #
     */
    public String getBindingPort() {
        return this._uriComposite.getsBindingPort();
    }

    @Override
    public boolean getSkippable() {
        if (this._startPage != null && this._startPage.getBinding() != null && _startPage.getBinding() instanceof SOAPBindingType) {
           return false;
        }
        return super.getSkippable();
    }

    @Override
    public void refresh() {
        if (_startPage != null && _startPage.getBinding() instanceof SOAPBindingType) {
            if (_uriComposite != null && _uriComposite.getPanel() != null) {
                _uriComposite.setBinding((SOAPBindingType) _startPage.getBinding());
            }
        }
    }
}
