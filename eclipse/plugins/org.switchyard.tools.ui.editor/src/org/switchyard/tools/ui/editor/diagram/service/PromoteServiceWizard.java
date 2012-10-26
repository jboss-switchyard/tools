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
package org.switchyard.tools.ui.editor.diagram.service;

import java.util.Collection;

import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.ui.PlatformResourceAdapterFactory;

/**
 * PromoteServiceWizard
 * 
 * <p/>
 * Wizard for promoting a component service.
 */
public class PromoteServiceWizard extends Wizard {

    private PromoteServiceWizardPage _page;

    /**
     * Create a new PromoteServiceWizard.
     */
    public PromoteServiceWizard() {
        _page = new PromoteServiceWizardPage();
        setWindowTitle(_page.getTitle());
        setForcePreviousAndNextButtons(true);
    }

    /**
     * @param componentService the service being promoted.
     */
    public void init(ComponentService componentService) {
        _page.init(componentService, componentService);
        IProject project = PlatformResourceAdapterFactory.getContainingProject(componentService);
        if (project == null) {
            return;
        }
        _page.setJavaProject(JavaCore.create(project));
    }

    @Override
    public void addPages() {
        addPage(_page);
    }

    @Override
    public boolean performFinish() {
        return true;
    }

    /**
     * @return the new Contract
     */
    public Contract getContract() {
        return _page.getContract();
    }

    /**
     * @return any created transformers
     */
    public Collection<TransformType> getCreatedTransforms() {
        return _page.getCreatedTransforms();
    }

    @Override
    public IWizardPage getNextPage(IWizardPage page) {
        if (page == _page && _page.getNextWizard() != null) {
            return _page.getNextWizard().getStartingPage();
        }
        return super.getNextPage(page);
    }

    @Override
    public boolean canFinish() {
        boolean canFinish = super.canFinish();
        if (canFinish && _page.getNextWizard() != null) {
            canFinish = canFinish && _page.getNextWizard().canFinish();
        }
        return canFinish;
    }
    
    /**
     * @return true/false if remoted checkbox is clicked
     */
    public boolean isRemoted() {
        return _page.isRemoted();
    }
}
