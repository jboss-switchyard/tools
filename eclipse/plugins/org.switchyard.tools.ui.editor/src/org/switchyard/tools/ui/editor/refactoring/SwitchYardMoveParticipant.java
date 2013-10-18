/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.editor.refactoring;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.MoveParticipant;
import org.eclipse.ltk.core.refactoring.resource.DeleteResourceChange;
import org.eclipse.ltk.core.refactoring.resource.MoveResourceChange;

/**
 * SwitchYardMoveParticipant
 * <p/>
 * Participates in the moving of switchyard.xml files.
 */
public class SwitchYardMoveParticipant extends MoveParticipant {

    private IFile _diagramFile;
    private IFolder _destination;

    @Override
    protected boolean initialize(Object element) {
        if (!(element instanceof IFile)) {
            return false;
        }
        final IFile modelFile = (IFile) element;
        final IPath diagramPath = modelFile.getProject().getFullPath().append(".xml") //$NON-NLS-1$
                .append(modelFile.getProjectRelativePath()).addFileExtension("diagram"); //$NON-NLS-1$
        _diagramFile = modelFile.getWorkspace().getRoot().getFile(diagramPath);

        final IContainer destinationFolder = (IContainer) getArguments().getDestination();
        final IPath destinationPath = destinationFolder.getProject().getFullPath().append(".xml")
                .append(destinationFolder.getProjectRelativePath());
        _destination = modelFile.getWorkspace().getRoot().getFolder(destinationPath);

        return _diagramFile.exists();
    }

    @Override
    public String getName() {
        return "SwitchYard Diagram File Move";
    }

    @Override
    public RefactoringStatus checkConditions(IProgressMonitor pm, CheckConditionsContext context)
            throws OperationCanceledException {
        /*
         * TODO: do we need to ensure the folder exists? do we need to make sure
         * we're not overwriting an existing diagram file?
         */
        return new RefactoringStatus();
    }

    @Override
    public Change createChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
        final CompositeChange change = new CompositeChange(getName());
        if (!_destination.exists()) {
            change.add(new CreateFolderChange(_destination));
        } else {
            final IFile newFile = _destination.getFile(_diagramFile.getName());
            if (newFile.exists()) {
                change.add(new DeleteResourceChange(newFile.getFullPath(), true));
            }
        }
        change.add(new MoveResourceChange(_diagramFile, _destination));
        change.add(new UpdateReferencedModelURIChange(_diagramFile) {
            @Override
            protected IFile getDestination() {
                return _destination.getFile(_diagramFile.getName());
            }
        });
        return change;
    }
}
