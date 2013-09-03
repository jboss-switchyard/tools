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
import org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizardPage;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.IRefreshablePage;

/**
 * @author bfitzpat
 * 
 */
public class AddValidatorWizardXMLPage extends BaseWizardPage implements IRefreshablePage {

    private AddValidatorWizardStartPage _startPage = null;
    private XMLValidatorComposite _xmlComposite = null;

    /**
     * @param start Start page reference
     * @param pageName String for name
     */
    public AddValidatorWizardXMLPage(AddValidatorWizardStartPage start, String pageName) {
        this(pageName);
        this._startPage = start;
    }

    protected AddValidatorWizardXMLPage(String pageName) {
        super(pageName);
        setTitle(Messages.title_specifyXmlValidatorDetails);
        setDescription(Messages.description_specifyXmlValidatorDetails);
    }

    @Override
    public void createControl(Composite parent) {
        _xmlComposite = new XMLValidatorComposite();
        _xmlComposite.setWizardPage(this);
        if (_startPage != null && _startPage.getValidator() != null
                && _startPage.getValidator() instanceof XmlValidateType) {
            _xmlComposite.setValidator((XmlValidateType) _startPage.getValidator());
        } else if (getWizard() != null && getWizard() instanceof AddValidatorWizard) {
            _xmlComposite.setValidator(((AddValidatorWizard)getWizard()).getValidator());
        }
        _xmlComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent arg0) {
                setErrorMessage(_xmlComposite.getErrorMessage());
                setMessage(_xmlComposite.getWarningMessage(), DialogPage.WARNING);
                setPageComplete(_xmlComposite.getErrorMessage() == null);
            }
        });
        _xmlComposite.createContents(parent, SWT.NONE);

        setControl(_xmlComposite.getPanel());

        setErrorMessage(null);
    }

    @Override
    public boolean getSkippable() {
        if (this._startPage != null && this._startPage.getValidator() != null
                && _startPage.getValidator() instanceof XmlValidateType) {
            return false;
        }
        return true;
    }

    @Override
    public void refresh() {
        if (_startPage != null && _startPage.getValidator() instanceof XmlValidateType) {
            if (_xmlComposite != null && _xmlComposite.getPanel() != null) {
                _xmlComposite.setValidator((XmlValidateType) _startPage.getValidator());
                _xmlComposite.validate();
                setPageComplete(_xmlComposite.getErrorMessage() == null);
                setMessage(_xmlComposite.getWarningMessage(), DialogPage.WARNING);
                setErrorMessage(null);
            }
        }
    }

    @Override
    public boolean isPageComplete() {
        return _xmlComposite.getErrorMessage() == null && _xmlComposite.getValidator() != null;
    }
}
