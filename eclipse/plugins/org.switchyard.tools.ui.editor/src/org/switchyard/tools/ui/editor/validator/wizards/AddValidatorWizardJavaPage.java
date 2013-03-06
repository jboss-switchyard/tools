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
package org.switchyard.tools.ui.editor.validator.wizards;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.jface.dialogs.DialogPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.models.switchyard1_0.validate.JavaValidateType;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizardPage;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.IRefreshablePage;

/**
 * @author bfitzpat
 * 
 */
public class AddValidatorWizardJavaPage extends BaseWizardPage implements IRefreshablePage {

    private AddValidatorWizardStartPage _startPage = null;
    private JavaValidatorComposite _javaComposite = null;

    /**
     * @param start Start page reference
     * @param pageName String for name
     */
    public AddValidatorWizardJavaPage(AddValidatorWizardStartPage start, String pageName) {
        this(pageName);
        this._startPage = start;
    }

    protected AddValidatorWizardJavaPage(String pageName) {
        super(pageName);
        setTitle("Specify Java Validator Details");
        setDescription("Specify pertinent details for your Java validator.");
    }

    @Override
    public void createControl(Composite parent) {
        _javaComposite = new JavaValidatorComposite();
        _javaComposite.setWizardPage(this);
        _javaComposite.createContents(parent, SWT.NONE);
        if (_startPage != null && _startPage.getValidator() != null
                && _startPage.getValidator() instanceof JavaValidateType) {
            _javaComposite.setValidator((JavaValidateType) _startPage.getValidator());
        } else if (getWizard() != null && getWizard() instanceof AddValidatorWizard) {
            _javaComposite.setValidator(((AddValidatorWizard)getWizard()).getValidator());
        }
        _javaComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent arg0) {
                setErrorMessage(_javaComposite.getErrorMessage());
                setMessage(_javaComposite.getWarningMessage(), DialogPage.WARNING);
                setPageComplete(_javaComposite.getErrorMessage() == null);
            }
        });

        setControl(_javaComposite.getPanel());

        setErrorMessage(null);
    }

    @Override
    public boolean getSkippable() {
        if (this._startPage != null && this._startPage.getValidator() != null
                && _startPage.getValidator() instanceof JavaValidateType) {
            return false;
        }
        return true;
    }

    @Override
    public void refresh() {
        if (_startPage != null && _startPage.getValidator() instanceof JavaValidateType) {
            if (_javaComposite != null && _javaComposite.getPanel() != null) {
                _javaComposite.setValidator((JavaValidateType) _startPage.getValidator());
                _javaComposite.validate();
                setPageComplete(_javaComposite.getErrorMessage() == null);
                setMessage(_javaComposite.getWarningMessage(), DialogPage.WARNING);
                setErrorMessage(null);
            }
        }
    }

    @Override
    public boolean isPageComplete() {
        return _javaComposite.getErrorMessage() == null && _javaComposite.getValidator() != null;
    }
}
