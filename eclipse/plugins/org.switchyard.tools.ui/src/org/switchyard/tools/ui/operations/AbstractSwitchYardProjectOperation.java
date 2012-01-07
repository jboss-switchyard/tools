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

import static org.switchyard.tools.ui.SwitchYardModelUtils.createSwitchYardModel;
import static org.switchyard.tools.ui.SwitchYardModelUtils.createTargetnamespace;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collection;

import org.apache.maven.model.Dependency;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.embedder.ArtifactKey;
import org.eclipse.m2e.core.project.IMavenProjectFacade;
import org.eclipse.ui.ide.undo.CreateFileOperation;
import org.switchyard.config.OutputKey;
import org.switchyard.config.model.ModelPuller;
import org.switchyard.config.model.composite.CompositeModel;
import org.switchyard.config.model.composite.v1.V1CompositeModel;
import org.switchyard.config.model.switchyard.SwitchYardModel;
import org.switchyard.tools.ui.Activator;

/**
 * AbstractSwitchYardProjectOperation
 * 
 * Executes extension operation, then updates project if necessary.
 * 
 * @author Rob Cernich
 */
public abstract class AbstractSwitchYardProjectOperation implements IWorkspaceRunnable {

    private Collection<Dependency> _dependencies;
    private Collection<String> _scanners;
    private String _switchYardVersion;
    private String _label;
    private boolean _addingServices;
    private IProject _project;
    private IMavenProjectFacade _mavenProjectFacade;
    private IAdaptable _uiInfo;

    /**
     * Create a new CreateBeanServiceOperation. If the extended operation is
     * adding service, the switchyard.xml validation will ensure that a
     * composite element exists.
     * 
     * @param switchYardVersion the version of the SwitchYard dependencies
     * @param requiredDependencies required dependencies.
     * @param requiredScanners required SwitchYard plugin scanners.
     * @param addingServices true if this operation is adding a service to the
     *            project.
     * @param label monitor task label.
     * @param uiInfo adaptable for UI Shell, may be null.
     */
    public AbstractSwitchYardProjectOperation(String switchYardVersion, Collection<Dependency> requiredDependencies,
            Collection<String> requiredScanners, boolean addingServices, String label, IAdaptable uiInfo) {
        _switchYardVersion = switchYardVersion;
        _dependencies = requiredDependencies;
        _scanners = requiredScanners;
        _addingServices = addingServices;
        _label = label;
        _uiInfo = uiInfo;
    }

    @Override
    public void run(IProgressMonitor monitor) throws CoreException {
        MultiStatus status = new MultiStatus(Activator.PLUGIN_ID, 15,
                "Errors occurred while updating project configuration", null);

        monitor.beginTask(_label, 600);
        try {
            IProgressMonitor subMonitor = new SubProgressMonitor(monitor, 100,
                    SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
            try {
                execute(subMonitor);
            } catch (CoreException e) {
                if ((e.getStatus().getSeverity() & (Status.ERROR | Status.CANCEL)) != 0) {
                    throw e;
                } else {
                    status.merge(e.getStatus());
                }
            } finally {
                subMonitor.done();
                subMonitor.setTaskName("");
            }

            _project = getProject();

            // read project pom
            try {
                monitor.subTask("Reading project pom.");
                subMonitor = new SubProgressMonitor(monitor, 100, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                _mavenProjectFacade = MavenPlugin.getMavenProjectRegistry().create(_project.getFile("pom.xml"), true,
                        subMonitor);
            } finally {
                subMonitor.done();
                subMonitor.setTaskName("");
            }

            if (_mavenProjectFacade == null) {
                throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID,
                        "Unable to read project configuration."));
            }

            // make sure bean.xml exists
            try {
                monitor.subTask("Creating beans.xml files.");
                // create source beans.xml
                subMonitor = new SubProgressMonitor(monitor, 100, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                createBeansXMLFile(_mavenProjectFacade.getResourceLocations(), subMonitor);
                subMonitor.done();
                subMonitor.setTaskName("");

                // create test beans.xml
                subMonitor = new SubProgressMonitor(monitor, 100, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                createBeansXMLFile(_mavenProjectFacade.getTestResourceLocations(), subMonitor);
            } catch (ExecutionException e) {
                status.merge(new Status(Status.ERROR, Activator.PLUGIN_ID, "Unable to create beans.xml.", e));
            } finally {
                subMonitor.done();
                subMonitor.setTaskName("");
            }

            // make sure composite exists in switchyard.xml
            try {
                monitor.subTask("Updating switchyard.xml file.");
                subMonitor = new SubProgressMonitor(monitor, 100, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                updateSwitchYardFile(_mavenProjectFacade.getResourceLocations(), subMonitor);
            } catch (CoreException e) {
                status.merge(e.getStatus());
            } finally {
                subMonitor.done();
                subMonitor.setTaskName("");
            }

            // update the project's pom
            try {
                monitor.subTask("Updating project pom.xml file");
                UpdateProjectPomOperation op = new UpdateProjectPomOperation(_project, _switchYardVersion, _dependencies, _scanners);
                subMonitor = new SubProgressMonitor(monitor, 100, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                op.run(subMonitor);
            } catch (CoreException e) {
                status.merge(e.getStatus());
            } finally {
                subMonitor.done();
                subMonitor.setTaskName("");
            }

            if (!status.isOK()) {
                throw new CoreException(status);
            }
        } finally {
            monitor.subTask("");
            monitor.done();
        }
    }

    /**
     * Perform operation (e.g. create a bean service class). If an exception is
     * thrown from this method, the operation will exit without updating any
     * project files.
     * 
     * @param monitor the progress monitor.
     * @throws CoreException if an error occurs.
     */
    protected abstract void execute(IProgressMonitor monitor) throws CoreException;

    /**
     * @return the project upon which the operation is acting.
     */
    protected abstract IProject getProject();

    private void createBeansXMLFile(IPath[] resourceLocations, IProgressMonitor monitor) throws ExecutionException {
        IFile beansFile = null;
        for (IPath resourceLocation : resourceLocations) {
            IFile temp = _project.getFolder(resourceLocation).getFile("META-INF/beans.xml");
            if (temp.exists()) {
                beansFile = temp;
                break;
            }
        }
        if (beansFile == null && resourceLocations.length > 0) {
            // TODO: find the first resource root that would include a beans.xml
            // file
            IFile beansIFile = _project.getFolder(resourceLocations[0]).getFile("META-INF/beans.xml");
            CreateFileOperation op = new CreateFileOperation(beansIFile, null, null, "Creating beans.xml file.");
            op.execute(monitor, _uiInfo);
        }
    }

    private void updateSwitchYardFile(IPath[] resourceLocations, IProgressMonitor monitor) throws CoreException {
        monitor.beginTask("Updating switchyard.xml", 100);
        try {
            monitor.subTask("Reading switchyard.xml");
            IFile switchYardFile = null;
            for (IPath resourceLocation : resourceLocations) {
                IFile temp = _project.getFolder(resourceLocation).getFile("META-INF/switchyard.xml");
                if (temp.exists()) {
                    switchYardFile = temp;
                    break;
                }
            }

            boolean modelUpdated = false;
            SwitchYardModel switchYardModel;
            if (switchYardFile == null) {
                ArtifactKey key = _mavenProjectFacade.getArtifactKey();
                switchYardModel = createSwitchYardModel(key.getArtifactId(),
                        createTargetnamespace(key.getGroupId(), key.getArtifactId(), key.getVersion()));
                modelUpdated = true;
            } else {
                InputStream is = switchYardFile.getContents(true);
                try {
                    switchYardModel = new ModelPuller<SwitchYardModel>().pull(is);
                } finally {
                    is.close();
                }
            }
            monitor.worked(50);

            if (_addingServices) {
                CompositeModel composite = switchYardModel.getComposite();
                if (composite == null) {
                    composite = new V1CompositeModel();
                    composite.setName(switchYardModel.getName());
                    composite.setTargetNamespace(switchYardModel.getTargetNamespace());
                    switchYardModel.setComposite(composite);
                    modelUpdated = true;
                } else {
                    if (composite.getName() == null || composite.getName().length() == 0) {
                        composite.setName(switchYardModel.getName());
                        modelUpdated = true;
                    } else if (composite.getTargetNamespace() == null || composite.getTargetNamespace().length() == 0) {
                        composite.setTargetNamespace(switchYardModel.getTargetNamespace());
                        modelUpdated = true;
                    }
                }
            }

            if (!modelUpdated) {
                return;
            }
            if (switchYardFile == null) {
                if (resourceLocations.length > 0) {
                    // TODO: find the first resource root that would include a
                    // switchyard.xml file
                    switchYardFile = _project.getFolder(resourceLocations[0]).getFile("META-INF/switchyard.xml");
                }
            }
            if (switchYardFile == null) {
                throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID,
                        "Could not locate switchyard.xml file."));
            }

            monitor.subTask("Writing udpated switchyard.xml");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            switchYardModel.getModelConfiguration().write(baos, new OutputKey[0]);
            if (switchYardFile.exists()) {
                switchYardFile.setContents(new ByteArrayInputStream(baos.toByteArray()), true, true,
                        new SubProgressMonitor(monitor, 50));
            } else {
                try {
                    new CreateFileOperation(switchYardFile, null, new ByteArrayInputStream(baos.toByteArray()),
                            "Creating switchyard.xml file.").execute(monitor, _uiInfo);
                } catch (ExecutionException e) {
                    if (e.getCause() instanceof CoreException) {
                        throw (CoreException) e.getCause();
                    }
                    throw e;
                }
            }
        } catch (Exception e) {
            throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "Error updating switchyard.xml.", e));
        } finally {
            monitor.done();
        }
    }

}
