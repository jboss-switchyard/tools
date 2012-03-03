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
package org.switchyard.tools.ui.actions;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.ActionDelegate;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.wizards.RepositoryArtifactReferenceWizard;

/**
 * AddArtifactReferenceAction
 * 
 * <p/>
 * Action which displays the new artifact reference wizard, allowing the user to
 * create a new repository artifact reference.
 * 
 * @author Rob Cernich
 */
public class AddArtifactReferenceAction extends ActionDelegate implements IObjectActionDelegate {

    private IProject _project;
    private IWorkbenchPart _targetPart;

    @Override
    public void setActivePart(IAction action, IWorkbenchPart targetPart) {
        _targetPart = targetPart;
    }

    @Override
    public void selectionChanged(IAction action, ISelection selection) {
        super.selectionChanged(action, selection);
        _project = null;
        if (selection.isEmpty() || !(selection instanceof IStructuredSelection)) {
            return;
        }
        Object obj = ((IStructuredSelection) selection).getFirstElement();
        if (obj instanceof IProject) {
            _project = (IProject) obj;
        }
    }

    @Override
    public void run(IAction action) {
        if (_project == null || _targetPart == null) {
            return;
        }

        IDialogSettings workbenchSettings = Activator.getDefault().getDialogSettings();
        IDialogSettings wizardSettings = workbenchSettings.getSection("AddArtifactReferenceAction"); //$NON-NLS-1$
        if (wizardSettings == null) {
            wizardSettings = workbenchSettings.addNewSection("AddArtifactReferenceAction"); //$NON-NLS-1$
        }

        RepositoryArtifactReferenceWizard wizard = new RepositoryArtifactReferenceWizard();
        wizard.setDialogSettings(wizardSettings);
        wizard.init(_targetPart.getSite().getWorkbenchWindow().getWorkbench(), new StructuredSelection(_project));
        new WizardDialog(_targetPart.getSite().getShell(), wizard).open();
    }

    @Override
    public void dispose() {
        _project = null;
        _targetPart = null;
        super.dispose();
    }

}
