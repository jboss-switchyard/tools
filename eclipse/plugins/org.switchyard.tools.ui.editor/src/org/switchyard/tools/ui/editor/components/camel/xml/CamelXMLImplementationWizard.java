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
package org.switchyard.tools.ui.editor.components.camel.xml;

import java.util.Collections;
import java.util.List;

import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.ui.editor.diagram.implementation.IImplementationWizard;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.LinkedWizardBase;

/**
 * CamelXMLImplementationWizard
 * 
 * <p/>
 * Wizard providing support for creating/configuring Camel XML based
 * implementation types.
 * 
 * @author Rob Cernich
 */
public class CamelXMLImplementationWizard extends LinkedWizardBase implements IImplementationWizard {

    private CamelImplementationType _implementation = CamelFactory.eINSTANCE.createCamelImplementationType();
    private CamelXMLRouteImplementationPage _page;
    private ComponentService _service;
    private List<ComponentReference> _references;

    @Override
    public void addPages() {
        _page = new CamelXMLRouteImplementationPage(CamelXMLRouteImplementationPage.class.getCanonicalName());
        _page.init(_implementation);
        _page.forceServiceInterfaceType(_service);
        addPage(_page);
    }

    @Override
    public void init(Component container) {
        if (container == null || container.getService() == null) {
            return;
        }
        for (ComponentService service : container.getService()) {
            _service = service;
            return;
        }
    }

    @Override
    public Implementation getCreatedObject() {
        return _implementation;
    }

    @Override
    public ComponentService getImplementedService() {
        return _service;
    }

    /**
     * @return the services referenced by the bean.
     */
    @Override
    public List<ComponentReference> getImplementationReferences() {
        return _references;
    }

    @Override
    public boolean doFinish() {
        _service = _page.getService();
        // TODO: _page.getReferences()
        _references = Collections.emptyList();
        return true;
    }

}
