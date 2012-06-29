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
package org.switchyard.tools.ui.editor.components.rules;

import java.util.Collections;
import java.util.List;

import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType;
import org.switchyard.tools.ui.editor.diagram.component.wizards.IImplementationWizard;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.LinkedWizardBase;

/**
 * RulesImplementationWizard
 * 
 * <p/>
 * Wizard providing support for creating/configuring rules implementation types.
 * 
 * @author Rob Cernich
 */
public class RulesImplementationWizard extends LinkedWizardBase implements IImplementationWizard {

    private Component _component;
    private RulesImplementationType _implementation;
    private RulesImplementationWizardPage _page;
    private ComponentService _service;

    @Override
    public void addPages() {
        _page = new RulesImplementationWizardPage(RulesImplementationWizardPage.class.getCanonicalName());
        _page.init(_component);
        addPage(_page);
    }

    @Override
    public void init(Component container) {
        _component = container;
    }

    @Override
    public Implementation getCreatedObject() {
        return _implementation;
    }

    @Override
    public ComponentService getImplementedService() {
        return _service;
    }

    @Override
    public List<ComponentReference> getImplementationReferences() {
        return Collections.emptyList();
    }

    @Override
    public boolean doFinish() {
        _implementation = _page.getImplementation();
        _service = _page.getService();
        return true;
    }

}
