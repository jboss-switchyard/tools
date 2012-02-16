/* 
 * JBoss, Home of Professional Open Source 
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
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
package org.switchyard.tools.ui.operations;

import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.switchyard.tools.ui.common.ISwitchYardProjectWorkingCopy;

/**
 * UpdateProjectPomOperation
 * 
 * Updates a project's pom to include required dependencies and scanners.
 * 
 * @author Rob Cernich
 */
public class UpdateProjectPomOperation implements IWorkspaceRunnable {

    private final ISwitchYardProjectWorkingCopy _workingCopy;

    /**
     * Create a new UpdateProjectPomOperation.
     * 
     * @param workingCopy the working copy containing the changes.
     */
    public UpdateProjectPomOperation(ISwitchYardProjectWorkingCopy workingCopy) {
        _workingCopy = workingCopy;
    }

    @Override
    public void run(IProgressMonitor monitor) throws CoreException {
        try {
            _workingCopy.commit(monitor);
        } finally {
            monitor.done();
        }
    }

}
