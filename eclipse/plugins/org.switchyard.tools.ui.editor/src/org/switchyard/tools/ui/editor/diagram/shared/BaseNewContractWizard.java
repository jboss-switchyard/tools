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

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;

/**
 * BaseNewContractWizard
 * 
 * <p/>
 * Creates a new "Contract" type (e.g. CompositeService, CompositeReference,
 * etc.).
 * 
 * @author Rob Cernich
 */
public class BaseNewContractWizard extends Wizard {

    private NewContractWizardPage _page;

    /**
     * Create a new BaseNewContractWizard.
     * 
     * @param title the title for the page (e.g. New Composite Service)
     * @param description the description for the page.
     * @param contractType the type of contract.
     */
    public BaseNewContractWizard(String title, String description, EClass contractType) {
        _page = new NewContractWizardPage(NewContractWizardPage.class.getCanonicalName(), title, description,
                contractType);
        setWindowTitle(title);
    }

    /**
     * @param container a parent container that will eventually contain the
     *            contract being created.
     */
    public void init(EObject container) {
        if (container == null) {
            return;
        }
        Resource resource = container.eResource();
        if (resource == null || resource.getURI() == null || !resource.getURI().isPlatformResource()) {
            return;
        }
        IResource modelFile = ResourcesPlugin.getWorkspace().getRoot()
                .getFile(new Path(resource.getURI().toPlatformString(true)));
        if (modelFile == null) {
            return;
        }
        _page.setJavaProject(JavaCore.create(modelFile.getProject()));
    }

    /**
     * This initializes the controls using the details within the specified
     * contract. The contract passed in is not edited directly.
     * 
     * @param contract initialize control with details from an existing
     *            contract.
     */
    public void init(Contract contract) {
        _page.init(contract);
        init((EObject) contract);
    }

    /**
     * @return the new Contract
     */
    public Contract getContract() {
        return _page.getContract();
    }

    @Override
    public void addPages() {
        addPage(_page);
    }

    @Override
    public boolean performFinish() {
        return true;
    }

}
