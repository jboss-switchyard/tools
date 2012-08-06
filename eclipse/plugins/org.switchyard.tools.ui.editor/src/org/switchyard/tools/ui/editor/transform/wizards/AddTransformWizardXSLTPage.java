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

import org.eclipse.jface.dialogs.DialogPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.models.switchyard1_0.transform.XsltTransformType;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizardPage;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.IRefreshablePage;

/**
 * @author bfitzpat
 * 
 */
public class AddTransformWizardXSLTPage extends BaseWizardPage implements IRefreshablePage {

    private AddTransformWizardStartPage _startPage = null;
    private XSLTTransformComposite _xsltComposite = null;

    /**
     * @param start Start page reference
     * @param pageName String for name
     */
    public AddTransformWizardXSLTPage(AddTransformWizardStartPage start, String pageName) {
        this(pageName);
        this._startPage = start;
    }

    protected AddTransformWizardXSLTPage(String pageName) {
        super(pageName);
        setTitle("Specify XSLT Transform Details");
        setDescription("Specify pertinent details for your XSLT transform.");
    }

    @Override
    public void createControl(Composite parent) {
        _xsltComposite = new XSLTTransformComposite();
        if (_startPage != null && _startPage.getTransform() != null
                && _startPage.getTransform() instanceof XsltTransformType) {
            _xsltComposite.setTransform((XsltTransformType) _startPage.getTransform());
        }
        _xsltComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent arg0) {
                setMessage(_xsltComposite.getWarningMessage(), DialogPage.WARNING);
                setErrorMessage(_xsltComposite.getErrorMessage());
                setPageComplete(_xsltComposite.getErrorMessage() == null);
            }
        });
        _xsltComposite.setWizardPage(this);
        _xsltComposite.createContents(parent, SWT.NONE);

        setControl(_xsltComposite.getPanel());

        setErrorMessage(null);
    }

    @Override
    public boolean getSkippable() {
        if (this._startPage != null && this._startPage.getTransform() != null
                && _startPage.getTransform() instanceof XsltTransformType) {
            return false;
        }
        return true;
    }

    @Override
    public void refresh() {
        if (_startPage != null && _startPage.getTransform() instanceof XsltTransformType) {
            if (_xsltComposite != null && _xsltComposite.getPanel() != null) {
                _xsltComposite.setTransform((XsltTransformType) _startPage.getTransform());
                _xsltComposite.setFromObject(((AddTransformWizard)getWizard()).getFrom());
                _xsltComposite.setToObject(((AddTransformWizard)getWizard()).getTo());
                _xsltComposite.validate();
                setMessage(_xsltComposite.getWarningMessage(), DialogPage.WARNING);
                setPageComplete(_xsltComposite.getErrorMessage() == null);
                setErrorMessage(null);
            }
        }
    }

    @Override
    public boolean isPageComplete() {
        return _xsltComposite.getErrorMessage() == null && _xsltComposite.getTransform() != null;
    }
}
