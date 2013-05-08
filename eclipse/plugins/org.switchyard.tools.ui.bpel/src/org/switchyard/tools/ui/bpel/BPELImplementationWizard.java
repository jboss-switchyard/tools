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
package org.switchyard.tools.ui.bpel;

import java.util.Collections;
import java.util.List;

import org.eclipse.soa.sca.sca1_1.model.sca.BPELImplementation;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.switchyard.tools.ui.editor.diagram.implementation.IImplementationWizard;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.LinkedWizardBase;

/**
 * BPELImplementationWizard
 * 
 * <p/>
 * Wizard providing support for creating/configuring BPEL implementation types.
 * 
 * @author Rob Cernich
 */
public class BPELImplementationWizard extends LinkedWizardBase implements IImplementationWizard {

    private Component _component;
    private BPELImplementation _implementation;
    private BPELImplementationWizardPage _page;
    private ComponentService _service;

    @Override
    public void addPages() {
        _page = new BPELImplementationWizardPage(BPELImplementationWizardPage.class.getCanonicalName());
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
