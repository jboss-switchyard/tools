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
import org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizardPage;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.IRefreshablePage;

/**
 * @author bfitzpat
 * 
 */
public class AddTransformWizardSmooksPage extends BaseWizardPage implements IRefreshablePage {

    private AddTransformWizardStartPage _startPage = null;
    private SmooksTransformComposite _smooksComposite = null;

    /**
     * @param start Start page reference
     * @param pageName String for name
     */
    public AddTransformWizardSmooksPage(AddTransformWizardStartPage start, String pageName) {
        this(pageName);
        this._startPage = start;
    }

    protected AddTransformWizardSmooksPage(String pageName) {
        super(pageName);
        setTitle("Specify Smooks Transform Details");
        setDescription("Specify pertinent details for your Smooks transform.");
    }

    @Override
    public void createControl(Composite parent) {
        _smooksComposite = new SmooksTransformComposite();
        if (_startPage != null && _startPage.getTransform() != null
                && _startPage.getTransform() instanceof SmooksTransformType1) {
            _smooksComposite.setTransform((SmooksTransformType1) _startPage.getTransform());
        }
        _smooksComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent arg0) {
                setMessage(_smooksComposite.getWarningMessage(), DialogPage.WARNING);
                setErrorMessage(_smooksComposite.getErrorMessage());
                setPageComplete(_smooksComposite.getErrorMessage() == null);
            }
        });
        _smooksComposite.setWizardPage(this);
        _smooksComposite.createContents(parent, SWT.NONE);

        setControl(_smooksComposite.getPanel());

        setErrorMessage(null);
    }

    @Override
    public boolean getSkippable() {
        if (this._startPage != null && this._startPage.getTransform() != null
                && _startPage.getTransform() instanceof SmooksTransformType1) {
            return false;
        }
        return true;
    }

    @Override
    public void refresh() {
        if (_startPage != null && _startPage.getTransform() instanceof SmooksTransformType1) {
            if (_smooksComposite != null && _smooksComposite.getPanel() != null) {
                _smooksComposite.setTransform((SmooksTransformType1) _startPage.getTransform());
                _smooksComposite.setFromObject(((AddTransformWizard)getWizard()).getFrom());
                _smooksComposite.setToObject(((AddTransformWizard)getWizard()).getTo());
                _smooksComposite.validate();
                setMessage(_smooksComposite.getWarningMessage(), DialogPage.WARNING);
                setPageComplete(_smooksComposite.getErrorMessage() == null);
                setErrorMessage(null);
            }
        }
    }

    @Override
    public boolean isPageComplete() {
        return _smooksComposite.getErrorMessage() == null && _smooksComposite.getTransform() != null;
    }
}
