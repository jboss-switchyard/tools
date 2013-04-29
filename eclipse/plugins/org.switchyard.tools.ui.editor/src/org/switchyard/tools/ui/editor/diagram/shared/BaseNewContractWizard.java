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

import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.switchyard.tools.ui.PlatformResourceAdapterFactory;
import org.switchyard.tools.ui.common.InterfaceControl.InterfaceType;

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
     * Create a new BaseNewContractWizard.
     * 
     * @param title the title for the page (e.g. New Composite Service)
     * @param description the description for the page.
     * @param contractType the type of contract.
     * @param interfaceTypes the available interface types
     */
    public BaseNewContractWizard(String title, String description, EClass contractType,
            Set<InterfaceType> interfaceTypes) {
        _page = new NewContractWizardPage(NewContractWizardPage.class.getCanonicalName(), title, description,
                contractType, interfaceTypes);
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
        IProject project = PlatformResourceAdapterFactory.getContainingProject(container);
        if (project == null) {
            return;
        }
        _page.setJavaProject(JavaCore.create(project));
    }

    /**
     * This initializes the controls using the details within the specified
     * contract. The contract passed in is not edited directly.
     * 
     * @param contract initialize control with details from an existing
     *            contract.
     * @param related the related contract (e.g. when promoting a service)
     */
    public void init(Contract contract, Contract related) {
        _page.init(contract, related);
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
