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

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.LinkedWizardBase;

/**
 * CamelImplementationWizard
 * 
 * <p/>
 * Wizard providing support for creating/configuring Camel implementation types.
 * 
 * @author Rob Cernich
 */
public class CamelImplementationWizard extends LinkedWizardBase implements IComponentImplementationWizard {

    private CamelImplementationType _implementation = CamelFactory.eINSTANCE.createCamelImplementationType();
    private SCADiagramAddComponentImplementationCamelPage _page;

    @Override
    public void addPages() {
        _page = new SCADiagramAddComponentImplementationCamelPage(
                SCADiagramAddComponentImplementationCamelPage.class.getCanonicalName());
        _page.init(_implementation);
        addPage(_page);
    }

    @Override
    public String getDisplayName() {
        return "Camel";
    }

    @Override
    public Implementation getImplementation() {
        return _implementation;
    }

    @Override
    public void setImplementation(Implementation implementation) {
        _implementation = (CamelImplementationType) implementation;
    }

    @Override
    public EStructuralFeature getFeatureForImplementation() {
        return CamelPackage.eINSTANCE.getDocumentRoot_ImplementationCamel();
    }

    @Override
    public List<ComponentService> getImplementationServices() {
        // TODO: look at the specified xml or java class for service
        // definitions.
        return Collections.emptyList();
    }

    @Override
    public List<ComponentReference> getImplementationReferences() {
        // TODO: check the route for "switchyard:/..." references.
        return Collections.emptyList();
    }

    @Override
    public boolean doFinish() {
        // nothing really to do here since the page operates directly on the new
        // implementation.
        return true;
    }

}
