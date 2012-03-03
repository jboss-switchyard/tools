/* 
 * JBoss, Home of Professional Open Source 
 * Copyright 2012 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved. 
 * See the copyright.txt in the distribution for a 
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use, 
 * modify, copy, or redistribute it subject to the terms and conditions 
 * of the GNU Lesser General Public License, v. 2.1. 
 * This program is distributed in the hope that it will be useful, but WITHOUT A 
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details. 
 * You should have received a copy of the GNU Lesser General Public License, 
 * v.2.1 along with this distribution; if not, write to the Free Software 
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA  02110-1301, USA.
 */
package org.switchyard.tools.ui.wizards;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardNode;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.internal.dialogs.WizardCollectionElement;
import org.eclipse.ui.internal.dialogs.WorkbenchWizardElement;
import org.eclipse.ui.internal.dialogs.WorkbenchWizardListSelectionPage;
import org.eclipse.ui.internal.dialogs.WorkbenchWizardNode;
import org.eclipse.ui.internal.registry.WizardsRegistryReader;

/**
 * RepositoryArtifactReferenceWizard
 * 
 * <p/>
 * Wizard supporting the creation of artifact references.
 * 
 * @author Rob Cernich
 */
@SuppressWarnings("restriction")
public class RepositoryArtifactReferenceWizard extends Wizard implements INewWizard {

    private class WizardSelectionPage extends WorkbenchWizardListSelectionPage {

        public WizardSelectionPage() {
            super(_workbench, _selection, _wizardsList, "Wizards:", "org.switchyard.tools.ui.repositorySupport");
            setTitle("Select a wizard");
        }

        @Override
        protected IWizardNode createWizardNode(WorkbenchWizardElement element) {
            return new WorkbenchWizardNode(this, element) {
                public IWorkbenchWizard createWizard() throws CoreException {
                    return wizardElement.createWizard();
                }
            };
        }

    }

    private IWorkbench _workbench;
    private IStructuredSelection _selection;
    private WizardCollectionElement _wizardsList;
    private WizardSelectionPage _selectionPage;

    /**
     * Create a new RepositoryArtifactReferenceWizard.
     */
    public RepositoryArtifactReferenceWizard() {
        super();
        setForcePreviousAndNextButtons(true);
        setNeedsProgressMonitor(true);
        setWindowTitle("Add Artifact Reference");
    }

    /**
     * Initializes the wizard state.
     * 
     * @param workbench the workbench.
     * @param selection the selection to operate on.
     */
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        _workbench = workbench;
        _selection = selection;
    }

    @Override
    public void addPages() {
        _wizardsList = ((WizardCollectionElement) NewArtifactReferenceWizardRegistry.instance().getRootCategory())
                .findCategory(WizardsRegistryReader.UNCATEGORIZED_WIZARD_CATEGORY);
        _selectionPage = new WizardSelectionPage();
        addPage(_selectionPage);
    }

    @Override
    public boolean performFinish() {
        _selectionPage.saveWidgetValues();
        return true;
    }

}
