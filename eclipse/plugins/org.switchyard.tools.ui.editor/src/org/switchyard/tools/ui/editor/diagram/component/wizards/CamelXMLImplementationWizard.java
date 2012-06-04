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
package org.switchyard.tools.ui.editor.diagram.component.wizards;

import java.util.Collections;
import java.util.List;

import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
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
    private List<ComponentService> _services;
    private List<ComponentReference> _references;

    @Override
    public void addPages() {
        _page = new CamelXMLRouteImplementationPage(CamelXMLRouteImplementationPage.class.getCanonicalName());
        _page.init(_implementation);
        addPage(_page);
    }

    /**
     * @return the new camel implementation.
     */
    public Implementation getImplementation() {
        return _implementation;
    }

    /**
     * @return the services implemented by the bean.
     */
    @Override
    public List<ComponentService> getImplementationServices() {
        return _services;
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
        ComponentService service = _page.getService();
        if (service == null) {
            _services = Collections.emptyList();
        } else {
            _services = Collections.singletonList(service);
        }
        // TODO: _page.getReferences()
        _references = Collections.emptyList();
        return true;
    }

}
