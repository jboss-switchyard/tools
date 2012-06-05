/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.editor.diagram.shared;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * BaseTypeFactory
 * 
 * <p/>
 * Base factory for creating extended types.
 * 
 * @param <T> the extended type
 * @param <C> the container type
 * @param <W> the wizard type
 * 
 * @author Rob Cernich
 */
public abstract class BaseTypeFactory<T extends EObject, C extends EObject, W extends ITypeWizard<T, C>> implements
        ITypeFactory<T, C> {

    @Override
    public T createType(Shell shell, C container) {
        final W wizard = createTypeWizard();
        final WizardDialog dialog = new WizardDialog(shell, wizard);
        wizard.init(container);
        if (dialog.open() == WizardDialog.OK) {
            return wizardComplete(wizard);
        }
        return null;
    }

    /**
     * Default implementation simply returns
     * <code>wizard.getCreatedObject()</code>. Subclasses may specialize to do
     * additional work on completion.
     * 
     * @param wizard the wizard that just completed.
     * 
     * @return the new object.
     */
    protected T wizardComplete(W wizard) {
        return wizard.getCreatedObject();
    }

    /**
     * @return a new wizard instance.
     */
    protected abstract W createTypeWizard();
}
