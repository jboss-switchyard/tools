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
import org.switchyard.tools.models.switchyard1_0.transform.JsonTransformType;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizardPage;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.IRefreshablePage;

/**
 * @author bfitzpat
 * 
 */
public class AddTransformWizardJSONPage extends BaseWizardPage implements IRefreshablePage {

    private AddTransformWizardStartPage _startPage = null;
    private JSONTransformComposite _jsonComposite = null;

    /**
     * @param start Start page reference
     * @param pageName String for name
     */
    public AddTransformWizardJSONPage(AddTransformWizardStartPage start, String pageName) {
        this(pageName);
        this._startPage = start;
    }

    protected AddTransformWizardJSONPage(String pageName) {
        super(pageName);
        setTitle("Specify JSON Transform Details");
        setDescription("Specify pertinent details for your JSON transform.");
    }

    @Override
    public void createControl(Composite parent) {
        _jsonComposite = new JSONTransformComposite();
        if (_startPage != null && _startPage.getTransform() != null
                && _startPage.getTransform() instanceof JsonTransformType) {
            _jsonComposite.setTransform((JsonTransformType) _startPage.getTransform());
        }
        _jsonComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent arg0) {
                setErrorMessage(_jsonComposite.getErrorMessage());
                setPageComplete(_jsonComposite.getErrorMessage() == null);
            }
        });
        _jsonComposite.createContents(parent, SWT.NONE);

        setControl(_jsonComposite.getPanel());

        setErrorMessage(null);
    }

    @Override
    public boolean getSkippable() {
        if (this._startPage != null && this._startPage.getTransform() != null
                && _startPage.getTransform() instanceof JsonTransformType) {
            return false;
        }
        return true;
    }

    @Override
    public void refresh() {
        if (_startPage != null && _startPage.getTransform() instanceof JsonTransformType) {
            if (_jsonComposite != null && _jsonComposite.getPanel() != null) {
                _jsonComposite.setTransform((JsonTransformType) _startPage.getTransform());
                _jsonComposite.validate();
                setPageComplete(_jsonComposite.getErrorMessage() == null);
                setErrorMessage(null);
            }
        }
    }

    @Override
    public boolean isPageComplete() {
        return _jsonComposite.getErrorMessage() == null && _jsonComposite.getTransform() != null;
    }
}
