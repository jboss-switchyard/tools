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

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.ObservablesManager;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.jface.databinding.wizard.WizardPageSupport;
import org.eclipse.jface.dialogs.DialogPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.FormColors;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.validate.JavaValidateType;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizardPage;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.IRefreshablePage;

/**
 * @author bfitzpat
 * 
 */
public class AddValidatorWizardJavaPage extends BaseWizardPage implements IRefreshablePage {

    private AddValidatorWizardStartPage _startPage = null;
    private JavaValidatorComposite _javaComposite = null;
    private final FormToolkit _toolkit;
    private final DataBindingContext _context = new EMFDataBindingContext();
    private final ObservablesManager _observablesManager = new ObservablesManager();
    private WizardPageSupport _support;

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
        setTitle(Messages.title_specifyJavaValidatorDetails);
        setDescription(Messages.description_specifyJavaValidatorDetails);

        FormColors colors= new FormColors(Display.getCurrent());
        colors.setBackground(null);
        colors.setForeground(null);
        _toolkit= new FormToolkit(colors);

        _observablesManager.addObservablesFromContext(_context, true, true);
    }

    @Override
    public void dispose() {
        _toolkit.dispose();
        if (_support != null) {
            _support.dispose();
            _support = null;
        }
        _observablesManager.dispose();
        _context.dispose();
        super.dispose();
    }

    @Override
    public void createControl(final Composite parent) {
        _javaComposite = new JavaValidatorComposite(_toolkit);
        _javaComposite.setWizardPage(this);
        _observablesManager.runAndCollect(new Runnable() {
            @Override
            public void run() {
                _javaComposite.createContents(parent, SWT.NONE, _context);
            }
        });
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

        _support = WizardPageSupport.create(this, _context);

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
