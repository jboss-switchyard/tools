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
import org.switchyard.tools.ui.explorer.ISwitchYardNode;
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
        } else if (obj instanceof ISwitchYardNode) {
            _project = ((ISwitchYardNode) obj).getRoot().getProject();
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
