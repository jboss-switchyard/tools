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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.DeleteParticipant;
import org.eclipse.ltk.core.refactoring.resource.DeleteResourceChange;

/**
 * SwitchYardDeleteParticipant
 * <p/>
 * Participates in the deletion of switchyard.xml files.
 */
public class SwitchYardDeleteParticipant extends DeleteParticipant {

    private IFile _diagramFile;

    @Override
    protected boolean initialize(Object element) {
        if (!(element instanceof IFile)) {
            return false;
        }
        final IFile modelFile = (IFile) element;
        final IPath diagramPath = modelFile.getProject().getFullPath().append(".xml") //$NON-NLS-1$
                .append(modelFile.getProjectRelativePath()).addFileExtension("diagram"); //$NON-NLS-1$
        _diagramFile = modelFile.getWorkspace().getRoot().getFile(diagramPath);
        return _diagramFile.exists();
    }

    @Override
    public String getName() {
        return "SwitchYard Diagram File Deletion";
    }

    @Override
    public RefactoringStatus checkConditions(IProgressMonitor pm, CheckConditionsContext context)
            throws OperationCanceledException {
        return new RefactoringStatus();
    }

    @Override
    public Change createChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
        return new DeleteResourceChange(_diagramFile.getFullPath(), true);
    }

}
