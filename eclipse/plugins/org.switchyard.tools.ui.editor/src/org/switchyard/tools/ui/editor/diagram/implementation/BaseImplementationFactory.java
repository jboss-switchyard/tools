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

import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.switchyard.tools.ui.editor.diagram.component.wizards.IImplementationWizard;
import org.switchyard.tools.ui.editor.diagram.shared.BaseTypeFactory;

/**
 * BaseImplementationFactory
 * 
 * <p/>
 * Base factory for creating Implementation types.
 * 
 * @author Rob Cernich
 */
public abstract class BaseImplementationFactory extends
        BaseTypeFactory<Implementation, Component, IImplementationWizard> implements IImplementationTypeFactory {

    private List<ComponentService> _services;
    private List<ComponentReference> _references;

    @Override
    public List<ComponentService> getImplementationServices() {
        return _services;
    }

    @Override
    public List<ComponentReference> getImplementationReferences() {
        return _references;
    }

    @Override
    protected Implementation wizardComplete(IImplementationWizard wizard) {
        _services = wizard.getImplementationServices();
        _references = wizard.getImplementationReferences();
        return super.wizardComplete(wizard);
    }

}
