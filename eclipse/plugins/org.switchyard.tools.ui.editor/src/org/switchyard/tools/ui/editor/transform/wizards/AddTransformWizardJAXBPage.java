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
package org.switchyard.tools.ui.editor.transform.wizards;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizardPage;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.IRefreshablePage;

/**
 * @author bfitzpat
 * 
 */
public class AddTransformWizardJAXBPage extends BaseWizardPage implements IRefreshablePage {

    private AddTransformWizardStartPage _startPage = null;
    private JAXBTransformComposite _jaxbComposite = null;

    /**
     * @param start Start page reference
     * @param pageName String for name
     */
    public AddTransformWizardJAXBPage(AddTransformWizardStartPage start, String pageName) {
        this(pageName);
        this._startPage = start;
    }

    protected AddTransformWizardJAXBPage(String pageName) {
        super(pageName);
        setTitle("Specify JAXB Transform Details");
        setDescription("Specify pertinent details for your JAXB transform.");
    }

    @Override
    public void createControl(Composite parent) {
        _jaxbComposite = new JAXBTransformComposite();
        if (_startPage != null && _startPage.getTransform() != null
                && _startPage.getTransform() instanceof JAXBTransformType) {
            _jaxbComposite.setTransform((JAXBTransformType) _startPage.getTransform());
        }
        _jaxbComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent arg0) {
                setErrorMessage(_jaxbComposite.getErrorMessage());
                setPageComplete(_jaxbComposite.getErrorMessage() == null);
            }
        });
        _jaxbComposite.createContents(parent, SWT.NONE);

        setControl(_jaxbComposite.getPanel());

        setErrorMessage(null);
    }

    @Override
    public boolean getSkippable() {
        if (this._startPage != null && this._startPage.getTransform() != null
                && _startPage.getTransform() instanceof JAXBTransformType) {
            return false;
        }
        return true;
    }

    @Override
    public void refresh() {
        if (_startPage != null && _startPage.getTransform() instanceof JAXBTransformType) {
            if (_jaxbComposite != null && _jaxbComposite.getPanel() != null) {
                _jaxbComposite.setTransform((JAXBTransformType) _startPage.getTransform());
                _jaxbComposite.validate();
                setPageComplete(_jaxbComposite.getErrorMessage() == null);
                setErrorMessage(null);
            }
        }
    }

    @Override
    public boolean isPageComplete() {
        return _jaxbComposite.getErrorMessage() == null && _jaxbComposite.getTransform() != null;
    }
}
