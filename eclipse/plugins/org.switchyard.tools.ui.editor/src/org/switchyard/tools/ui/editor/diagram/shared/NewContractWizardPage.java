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

import java.util.EnumSet;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.ui.editor.diagram.shared.InterfaceControl.InterfaceType;

/**
 * NewContractWizardPage
 * 
 * <p/>
 * Wizard page which creates a new Contract type.
 * 
 * @author Rob Cernich
 */
public class NewContractWizardPage extends WizardPage {

    private ContractControl _contractControl;

    /**
     * Create a new NewContractWizardPage.
     * 
     * @param pageName the page name
     * @param title the page title
     * @param description the description for the page.
     * @param contractType the type of contract.
     */
    public NewContractWizardPage(String pageName, String title, String description, EClass contractType) {
        super(pageName, title, null);
        setDescription(description);
        _contractControl = new ContractControl(contractType, null, EnumSet.of(InterfaceType.Java, InterfaceType.WSDL, InterfaceType.ESB));
    }

    @Override
    public void createControl(Composite parent) {
        Composite contents = new Composite(parent, SWT.NONE);
        contents.setLayout(new GridLayout(3, false));
        contents.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        _contractControl.createControl(contents, 3);
        _contractControl.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                validate();
            }
        });
        validate();
        setErrorMessage(null);

        setControl(contents);
    }

    /**
     * This initializes the controls using the details within the specified
     * contract. The contract passed in is not edited directly.
     * 
     * @param contract initialize control with details from an existing
     *            contract.
     */
    public void init(Contract contract) {
        _contractControl.init(contract);
    }

    /**
     * @return the new Contract
     */
    public Contract getContract() {
        return _contractControl.getContract();
    }

    /**
     * @param project the project containing the SwitchYard configuration.
     */
    public void setJavaProject(IJavaProject project) {
        _contractControl.setProject(project);
    }

    private void validate() {
        setMessage(null);
        setErrorMessage(null);

        IStatus status = _contractControl.getStatus();
        switch (status.getSeverity()) {
        case IStatus.ERROR:
            setErrorMessage(status.getMessage());
            break;
        case IStatus.WARNING:
            setMessage(status.getMessage(), WARNING);
            break;
        case IStatus.INFO:
            setMessage(status.getMessage(), INFORMATION);
            break;
        }

        setPageComplete(getErrorMessage() == null);
    }
}
