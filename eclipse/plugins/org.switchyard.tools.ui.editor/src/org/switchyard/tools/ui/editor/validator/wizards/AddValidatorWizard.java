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

import org.eclipse.jface.wizard.IWizardPage;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidateType;
import org.switchyard.tools.models.switchyard1_0.validate.JavaValidateType;
import org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizard;

/**
 * @author bfitzpat
 *
 */
public class AddValidatorWizard extends BaseWizard {

    private AddValidatorWizardStartPage _startPage = null;
    private AddValidatorWizardXMLPage _xmlPage = null;
    private AddValidatorWizardJavaPage _javaPage = null;
    private ValidateType _validator = null;

    /**
     * Opens the add transform wizard.
     */
    public AddValidatorWizard() {
        super();
        initPages();
        setWindowTitle(Messages.title_newValidator);
    }

    private void initPages() {
        _startPage = new AddValidatorWizardStartPage("start"); //$NON-NLS-1$
        _xmlPage = new AddValidatorWizardXMLPage(_startPage, "xml"); //$NON-NLS-1$
        _javaPage = new AddValidatorWizardJavaPage(_startPage, "java"); //$NON-NLS-1$
        
    }

    @Override
    public boolean performFinish() {
        if (_startPage != null && _startPage.getValidator() != null) {
            return true;
        } else if (this._validator != null) {
            return true;
        }
        return false;
    }

    @Override
    public void addPages() {
        if (_validator == null) {
            addPage(_startPage);
            addPage(_xmlPage);
            addPage(_javaPage);
        } else if (_validator instanceof XmlValidateType) {
            addPage(_xmlPage);
        } else if (_validator instanceof JavaValidateType) {
            addPage(_javaPage);
        }
    }

    /**
     * @return selected validator
     */
    public ValidateType getValidator() {
        if (_startPage != null && _startPage.getValidator() != null) {
            return _startPage.getValidator();
        } else if (_validator != null) {
            return _validator;
        }
        return null;
    }
    
    /**
     * @param validator set initial validator
     */
    public void setValidator(ValidateType validator) {
        if (_startPage != null) {
            _validator = validator;
        }
    }

    @Override
    public IWizardPage getNextPage(IWizardPage page) {
        if (page.equals(_startPage)) {
            ValidateType validatorToTest = _startPage.getValidator();
            if (validatorToTest instanceof XmlValidateType) {
                _xmlPage.refresh();
                return _xmlPage;
            } else if (validatorToTest instanceof JavaValidateType) {
                _javaPage.refresh();
                return _javaPage;
            }
        }
        return null;
    }
    
}
