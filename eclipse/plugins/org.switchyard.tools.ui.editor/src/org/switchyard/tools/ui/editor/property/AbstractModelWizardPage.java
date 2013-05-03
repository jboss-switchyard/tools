/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.editor.property;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.FormColors;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * AbstractPropertyPage
 * 
 * <p/>
 * Abstract implementation for a property page wrapping a model composite.
 * 
 * @param <T> the model type.
 */
public abstract class AbstractModelWizardPage<T extends EObject> extends WizardPage implements ICompositeContainer {

    private FormToolkit _toolkit;
    private AbstractModelComposite<T> _composite;

    /**
     * Create a new AbstractModelWizardPage.
     * 
     * @param name the page name
     */
    public AbstractModelWizardPage(String name) {
        super(name);
    }

    @Override
    public FormToolkit getToolkit() {
        return _toolkit;
    }

    @Override
    public void validated(IStatus status) {
        switch (status.getSeverity()) {
        case IStatus.OK:
            setErrorMessage(null);
            setMessage(_composite == null ? null : _composite.getDescription(), NONE);
            break;
        case IStatus.INFO:
            setErrorMessage(null);
            setMessage(status.getMessage(), INFORMATION);
            break;
        case IStatus.WARNING:
            setErrorMessage(null);
            setMessage(status.getMessage(), WARNING);
            break;
        case IStatus.ERROR:
            setErrorMessage(status.getMessage());
            break;
        }
        setPageComplete(getErrorMessage() == null);
    }

    @Override
    public void layout() {
        _composite.layout(true);
    }

    @Override
    public abstract EObject getSelectedBusinessObject();

    @Override
    public void createControl(Composite parent) {
        final FormColors colors = new FormColors(Display.getCurrent());
        colors.setBackground(null);
        colors.setForeground(null);
        _toolkit = new FormToolkit(colors);

        _composite = createComposite(parent, SWT.NONE);

        _composite.validate();
        setErrorMessage(null);

        setControl(_composite);
    }

    /**
     * @param parent the parent composite.
     * @param style the style bits.
     * 
     * @return the new composite.
     */
    protected abstract AbstractModelComposite<T> createComposite(Composite parent, int style);

}

