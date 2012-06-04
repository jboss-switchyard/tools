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

import org.eclipse.jface.wizard.IWizardPage;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.transform.JAXBTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1;
import org.switchyard.tools.models.switchyard1_0.transform.XsltTransformType;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizard;

/**
 * @author bfitzpat
 *
 */
public class AddTransformWizard extends BaseWizard {

    private AddTransformWizardStartPage _startPage = null;
    private AddTransformWizardJAXBPage _jaxbPage = null;
    private AddTransformWizardXSLTPage _xsltPage = null;
    private AddTransformWizardSmooksPage _smooksPage = null;

    /**
     * Opens the add transform wizard.
     */
    public AddTransformWizard() {
        super();
        initPages();
        setWindowTitle("New Transformer");
    }

    private void initPages() {
        _startPage = new AddTransformWizardStartPage("start");
        _jaxbPage = new AddTransformWizardJAXBPage(_startPage, "jaxb");
        _xsltPage = new AddTransformWizardXSLTPage(_startPage, "xslt");
        _smooksPage = new AddTransformWizardSmooksPage(_startPage, "smooks");
    }

    @Override
    public boolean performFinish() {
        if (_startPage != null && _startPage.getTransform() != null) {
            return true;
        }
        return false;
    }

    @Override
    public void addPages() {
        addPage(_startPage);
        addPage(_jaxbPage);
        addPage(_xsltPage);
        addPage(_smooksPage);
    }

    /**
     * @return selected binding
     */
    public TransformType getTransform() {
        if (_startPage != null) {
            return _startPage.getTransform();
        }
        return null;
    }

    @Override
    public IWizardPage getNextPage(IWizardPage page) {
        if (page.equals(_startPage)) {
            TransformType transformToTest = _startPage.getTransform();
            if (transformToTest instanceof JAXBTransformType) {
                _jaxbPage.refresh();
                return _jaxbPage;
            } else if (transformToTest instanceof XsltTransformType) {
                _xsltPage.refresh();
                return _xsltPage;
            } else if (transformToTest instanceof SmooksTransformType1) {
                _smooksPage.refresh();
                return _smooksPage;
            }
        }
        return null;
    }
    
}
