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

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.resource.DeleteResourceChange;
import org.eclipse.ltk.core.refactoring.resource.ResourceChange;

/**
 * CreateFolderChange
 * <p/>
 * Creates the specified folder, including any missing parent folders.
 */
public class CreateFolderChange extends ResourceChange {

    private final IFolder _folder;

    /**
     * Create a new CreateFolderChange.
     * 
     * @param folder the folder to create.
     */
    public CreateFolderChange(final IFolder folder) {
        _folder = folder;
    }

    @Override
    protected IResource getModifiedResource() {
        return _folder;
    }

    @Override
    public String getName() {
        return "Create destination folder hierarchy";
    }

    @Override
    public Change perform(IProgressMonitor pm) throws CoreException {
        final IFolder createdRootFolder = recursiveCreateFolder(_folder, pm);
        return new DeleteResourceChange(createdRootFolder.getFullPath(), true);
    }

    private IFolder recursiveCreateFolder(IFolder folder, IProgressMonitor pm) throws CoreException {
        if (folder.getParent().exists()) {
            folder.create(true, true, pm);
            return folder;
        }
        IFolder root = recursiveCreateFolder((IFolder) folder.getParent(), pm);
        folder.create(true, true, pm);
        return root;
    }

}
