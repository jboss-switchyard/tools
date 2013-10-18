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
import org.eclipse.jdt.internal.corext.refactoring.changes.CopyResourceChange;
import org.eclipse.jdt.internal.corext.refactoring.reorg.INewNameQuery;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.CopyParticipant;
import org.eclipse.ltk.core.refactoring.participants.ReorgExecutionLog;

/**
 * SwitchYardCopyParticipant
 * <p/>
 * Participates in the copying of switchyard.xml files.
 */
@SuppressWarnings("restriction")
public class SwitchYardCopyParticipant extends CopyParticipant {

    private IFile _diagramFile;
    private IFile _modelFile;
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
        return "SwitchYard Diagram File Copy";
    }

    @Override
    public RefactoringStatus checkConditions(IProgressMonitor pm, CheckConditionsContext context)
            throws OperationCanceledException {
        /*
         * TODO: check to see if we would be overwriting an existing diagram
         * file. I don't think so since the important bit is the model file.
         */
        return new RefactoringStatus();
    }

    @Override
    public Change createChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
        final CompositeChange change = new CompositeChange(getName());
        if (!_destination.exists()) {
            change.add(new CreateFolderChange(_destination));
        }
        final INewNameQuery nameQuery = new INewNameQuery() {
            @Override
            public String getNewName() throws OperationCanceledException {
                final ReorgExecutionLog log = getArguments().getExecutionLog();
                if (log.isRenamed(_modelFile)) {
                    return log.getNewName(_modelFile) + ".diagram";
                }
                return null;
            }
        };
        change.add(new CopyResourceChange(_diagramFile, _destination, nameQuery));
        change.add(new UpdateReferencedModelURIChange(_diagramFile) {
            @Override
            protected IFile getDestination() {
                final String newName = nameQuery.getNewName();
                if (newName == null) {
                    return _destination.getFile(_diagramFile.getName());
                }
                return _destination.getFile(newName);
            }
        });
        return change;
    }

}
