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

import static org.switchyard.tools.ui.M2EUtils.updatePom;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Collection;

import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.m2e.core.MavenPlugin;
import org.switchyard.tools.ui.Activator;

/**
 * UpdateProjectPomOperation
 * 
 * Updates a project's pom to include required dependencies and scanners.
 * 
 * @author Rob Cernich
 */
public class UpdateProjectPomOperation implements IWorkspaceRunnable {

    private IProject _project;
    private String _switchYardVersion;
    private Collection<Dependency> _requiredDependencies;
    private Collection<String> _requiredScanners;

    /**
     * Create a new UpdateProjectPomOperation.
     * 
     * @param project the project to update.
     * @param switchYardVersion the version of the SwitchYard dependencies; may be null.
     * @param requiredDependencies the required dependencies.
     * @param requiredScanners the required scanners.
     */
    public UpdateProjectPomOperation(IProject project, String switchYardVersion, Collection<Dependency> requiredDependencies,
            Collection<String> requiredScanners) {
        _project = project;
        _switchYardVersion = switchYardVersion;
        _requiredDependencies = requiredDependencies;
        _requiredScanners = requiredScanners;
    }

    @Override
    public void run(IProgressMonitor monitor) throws CoreException {
        monitor.beginTask("Updating project pom.", 100);
        IProgressMonitor subMonitor = new SubProgressMonitor(monitor, 50,
                SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
        try {
            IFile pomFile = _project.getFile("pom.xml");
            Model model = updatePom(pomFile.getLocation().toFile(), _switchYardVersion, _requiredDependencies, _requiredScanners, subMonitor);
            subMonitor.done();
            if (model != null) {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                MavenPlugin.getMaven().writeModel(model, baos);

                subMonitor = new SubProgressMonitor(monitor, 50, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                pomFile.setContents(new ByteArrayInputStream(baos.toByteArray()), true, true, subMonitor);
                subMonitor.done();
            }
        } catch (CoreException e) {
            throw new CoreException(new MultiStatus(Activator.PLUGIN_ID, Status.ERROR, new IStatus[] {e.getStatus() },
                    "Unable to update project pom.xml file.", e));
        } finally {
            monitor.done();
        }
    }

}
