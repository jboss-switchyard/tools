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
package org.switchyard.tools.ui.editor.diagram.implementation;

import java.util.List;

import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.swt.widgets.Shell;
import org.switchyard.tools.ui.editor.diagram.component.wizards.IImplementationWizard;

/**
 * BaseImplementationFactory
 * 
 * <p/>
 * Base factory for creating Implementation types.
 * 
 * @author Rob Cernich
 */
public abstract class BaseImplementationFactory implements IImplementationTypeFactory {

    private List<ComponentService> _services;
    private List<ComponentReference> _references;

    @Override
    public Implementation createType(Shell shell, Component container) {
        final IImplementationWizard wizard = createImplementationWizard();
        final WizardDialog dialog = new WizardDialog(shell, wizard);
        // TODO: add initialization to wizard.
        // wizard.init(container);
        if (dialog.open() == WizardDialog.OK) {
            _services = wizard.getImplementationServices();
            _references = wizard.getImplementationReferences();
            return wizard.getImplementation();
        }
        _services = null;
        _references = null;
        return null;
    }

    @Override
    public List<ComponentService> getImplementationServices() {
        return _services;
    }

    @Override
    public List<ComponentReference> getImplementationReferences() {
        return _references;
    }

    /**
     * @return a new wizard instance.
     */
    protected abstract IImplementationWizard createImplementationWizard();
}
