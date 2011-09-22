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

import static org.switchyard.tools.ui.M2EUtils.DEFAULT_DEPENDENCIES;
import static org.switchyard.tools.ui.M2EUtils.DEFAULT_SCANNERS;
import static org.switchyard.tools.ui.M2EUtils.JBOSS_PUBLIC_REPOSITORY_DEFAULT_ID;
import static org.switchyard.tools.ui.M2EUtils.MAVEN_MAIN_JAVA_PATH;
import static org.switchyard.tools.ui.M2EUtils.MAVEN_MAIN_RESOURCES_PATH;
import static org.switchyard.tools.ui.M2EUtils.MAVEN_TEST_JAVA_PATH;
import static org.switchyard.tools.ui.M2EUtils.MAVEN_TEST_RESOURCES_PATH;
import static org.switchyard.tools.ui.M2EUtils.SWITCHYARD_VERSION;
import static org.switchyard.tools.ui.M2EUtils.createJBossPublicRepository;
import static org.switchyard.tools.ui.SwitchYardModelUtils.createSwitchYardModel;
import static org.switchyard.tools.ui.SwitchYardModelUtils.createTargetnamespace;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.net.URI;
import java.util.Arrays;

import org.apache.maven.model.Build;
import org.apache.maven.model.Model;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.Repository;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.project.IProjectConfigurationManager;
import org.eclipse.ui.ide.undo.CreateFileOperation;
import org.eclipse.ui.ide.undo.CreateFolderOperation;
import org.eclipse.ui.ide.undo.CreateProjectOperation;
import org.eclipse.wst.common.project.facet.core.IFacetedProject;
import org.eclipse.wst.common.project.facet.core.IFacetedProjectWorkingCopy;
import org.eclipse.wst.common.project.facet.core.ProjectFacetsManager;
import org.switchyard.config.OutputKey;
import org.switchyard.config.model.switchyard.SwitchYardModel;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.M2EUtils;

/**
 * CreateSwitchYardProjectOperation
 * 
 * Creates a new SwtichYard project: project, pom.xml, switchyard.xml, default
 * package folders.
 * 
 * TODO: replace hard-coded string literals with constants.
 * 
 * @author Rob Cernich
 */
public class CreateSwitchYardProjectOperation implements IWorkspaceRunnable {

    private static final String META_INF = "META-INF";
    private static final String SWITCHYARD_XML = "switchyard.xml";
    private static final String DEFAULT_JAVA_VERSION = "1.6";

    private IProject _newProjectHandle;
    private URI _projectLocation;
    private String _packageName;
    private String _groupId;
    private String _version;
    private String _runtimeVersion;
    private IAdaptable _uiInfo;

    /**
     * Create a new CreateSwitchYardProjectOperation.
     * 
     * @param newProjectHandle handle for the new project.
     * @param projectLocation location for the project, may be null.
     * @param packageName default Java package for project.
     * @param groupId for project pom.
     * @param version for project.
     * @param runtimeVersion for switchyard.
     * @param uiInfo adaptable for UI Shell, may be null.
     */
    public CreateSwitchYardProjectOperation(IProject newProjectHandle, URI projectLocation, String packageName,
            String groupId, String version, String runtimeVersion, IAdaptable uiInfo) {
        _newProjectHandle = newProjectHandle;
        _projectLocation = projectLocation;
        _packageName = packageName;
        _groupId = groupId;
        _version = version;
        _runtimeVersion = runtimeVersion;
        _uiInfo = uiInfo;
    }

    @Override
    public void run(IProgressMonitor monitor) throws CoreException {
        MultiStatus status = new MultiStatus(Activator.PLUGIN_ID, 15, "Errors occurred while creating project", null);

        monitor.beginTask("Creating new SwitchYard project.", 600);
        try {
            // create the project
            IProgressMonitor subMonitor = new SubProgressMonitor(monitor, 100,
                    SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
            try {
                IWorkspace workspace = ResourcesPlugin.getWorkspace();
                final IProjectDescription description = workspace.newProjectDescription(_newProjectHandle.getName());
                description.setLocationURI(_projectLocation);
                CreateProjectOperation op = new CreateProjectOperation(description, "New SwitchYard Project");
                op.execute(subMonitor, _uiInfo);
            } catch (ExecutionException e) {
                if (e.getCause() instanceof CoreException) {
                    throw (CoreException) e.getCause();
                }
                throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID,
                        "Error occurred creating SwitchYard project.", e));
            } finally {
                subMonitor.done();
                subMonitor.setTaskName("");
            }

            // create the folder structure
            try {
                monitor.subTask("Creating default folders.");
                String packageFolder = _packageName.replace('.', '/');
                IFolder folder = _newProjectHandle.getFolder(MAVEN_MAIN_JAVA_PATH).getFolder(packageFolder);
                CreateFolderOperation op = new CreateFolderOperation(folder, null,
                        "Creating default main source folder");
                subMonitor = new SubProgressMonitor(monitor, 25, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                op.execute(subMonitor, _uiInfo);
                subMonitor.done();
                subMonitor.setTaskName("");

                folder = _newProjectHandle.getFolder(MAVEN_MAIN_RESOURCES_PATH);
                op = new CreateFolderOperation(folder, null, "Creating default main resource folder");
                subMonitor = new SubProgressMonitor(monitor, 25, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                op.execute(subMonitor, _uiInfo);
                subMonitor.done();
                subMonitor.setTaskName("");

                folder = _newProjectHandle.getFolder(MAVEN_TEST_JAVA_PATH).getFolder(packageFolder);
                op = new CreateFolderOperation(folder, null, "Creating default test source folder");
                subMonitor = new SubProgressMonitor(monitor, 25, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                op.execute(subMonitor, _uiInfo);
                subMonitor.done();
                subMonitor.setTaskName("");

                folder = _newProjectHandle.getFolder(MAVEN_TEST_RESOURCES_PATH);
                op = new CreateFolderOperation(folder, null, "Creating default test resource folder");
                subMonitor = new SubProgressMonitor(monitor, 25, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                op.execute(subMonitor, _uiInfo);
            } catch (Exception e) {
                mergeStatus(status, "Error creating default folders.", e);
            } finally {
                subMonitor.done();
                subMonitor.setTaskName("");
            }

            // create pom.xml
            try {
                monitor.subTask("Creating project pom.xml.");
                Model model = createPom();
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                MavenPlugin.getMaven().writeModel(model, baos);
                IFile pomFile = _newProjectHandle.getFile("pom.xml");
                CreateFileOperation op = new CreateFileOperation(pomFile, null, new ByteArrayInputStream(
                        baos.toByteArray()), "Creating pom.xml");
                subMonitor = new SubProgressMonitor(monitor, 100, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                op.execute(subMonitor, _uiInfo);
            } catch (Exception e) {
                mergeStatus(status, "Error creating pom.xml.", e);
            } finally {
                subMonitor.done();
                subMonitor.setTaskName("");
            }

            // create switchyard.xml
            try {
                monitor.subTask("Creating switchyard.xml file.");
                SwitchYardModel switchYardModel = createSwitchYardModel(_newProjectHandle.getName(),
                        createTargetnamespace(_groupId, _newProjectHandle.getName(), _version));
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                switchYardModel.getModelConfiguration().write(baos, new OutputKey[0]);
                IFile switchYardFile = _newProjectHandle.getFolder(MAVEN_MAIN_RESOURCES_PATH).getFolder(META_INF)
                        .getFile(SWITCHYARD_XML);
                CreateFileOperation op = new CreateFileOperation(switchYardFile, null, new ByteArrayInputStream(
                        baos.toByteArray()), "Creating switchyard.xml");
                subMonitor = new SubProgressMonitor(monitor, 100, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                op.execute(subMonitor, _uiInfo);
            } catch (Exception e) {
                mergeStatus(status, "Error creating switchyard.xml.", e);
            } finally {
                subMonitor.done();
                subMonitor.setTaskName("");
            }

            // update maven configuration.
            try {
                monitor.subTask("Updating maven project configuration.");
                subMonitor = new SubProgressMonitor(monitor, 100, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                IProjectConfigurationManager mavenProjectConfigurationManager = MavenPlugin
                        .getProjectConfigurationManager();
                mavenProjectConfigurationManager.enableMavenNature(_newProjectHandle,
                        mavenProjectConfigurationManager.getResolverConfiguration(_newProjectHandle), subMonitor);
            } catch (Exception e) {
                mergeStatus(status, "Error updating maven project configuration.", e);
            } finally {
                subMonitor.done();
                subMonitor.setTaskName("");
            }

            // attach project facets
            try {
                monitor.subTask("Configuring project facets.");
                subMonitor = new SubProgressMonitor(monitor, 50, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                final IFacetedProject facetedProject = ProjectFacetsManager.create(_newProjectHandle, true, subMonitor);
                subMonitor.done();
                subMonitor.setTaskName("");

                subMonitor = new SubProgressMonitor(monitor, 50, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                final IFacetedProjectWorkingCopy fpwc = facetedProject.createWorkingCopy();
                fpwc.setSelectedPreset("org.switchyard.tools.ui.facet.switchYardJarPreset");
                fpwc.commitChanges(subMonitor);
            } catch (Exception e) {
                mergeStatus(status, "Error configuring project facets.", e);
            } finally {
                subMonitor.done();
                subMonitor.setTaskName("");
            }

            if (!status.isOK()) {
                throw new CoreException(status);
            }
        } finally {
            monitor.done();
        }
    }

    private void mergeStatus(MultiStatus status, String message, Exception e) {
        if (e instanceof CoreException) {
            status.merge(((CoreException) e).getStatus());
        } else if (e.getCause() instanceof CoreException) {
            status.merge(((CoreException) e.getCause()).getStatus());
        } else {
            status.merge(new Status(Status.ERROR, Activator.PLUGIN_ID, message, e));
        }
    }

    private Model createPom() {
        Model model = new Model();

        // basic project setup
        model.setModelVersion("4.0.0");
        model.setGroupId(_groupId);
        model.setArtifactId(_newProjectHandle.getName());
        model.setVersion(_version);
        model.setPackaging("jar");
        model.setName(_groupId + ":" + _newProjectHandle.getName());

        // add runtime dependencies
        model.addProperty(SWITCHYARD_VERSION, _runtimeVersion);
        model.getDependencies().addAll(DEFAULT_DEPENDENCIES);

        // add build section
        model.setBuild(createBuildSection());

        // add repository
        Repository repository = createJBossPublicRepository(JBOSS_PUBLIC_REPOSITORY_DEFAULT_ID);
        model.addRepository(repository);
        model.addPluginRepository(repository);

        return model;
    }

    private Build createBuildSection() {
        Build build = new Build();
        build.addPlugin(createCompilerPlugin());
        build.addPlugin(createSwitchYardPlugin());
        return build;
    }

    private Plugin createCompilerPlugin() {
        Plugin plugin = new Plugin();
        plugin.setArtifactId("maven-compiler-plugin");
        plugin.setGroupId("org.apache.maven.plugins");
        plugin.setVersion("2.3.2");

        Xpp3Dom configuration = new Xpp3Dom("configuration");
        Xpp3Dom source = new Xpp3Dom("source");
        source.setValue(DEFAULT_JAVA_VERSION);
        configuration.addChild(source);
        Xpp3Dom target = new Xpp3Dom("target");
        target.setValue(DEFAULT_JAVA_VERSION);
        configuration.addChild(target);
        Xpp3Dom debug = new Xpp3Dom("debug");
        debug.setValue("true");
        configuration.addChild(debug);
        Xpp3Dom showWarnings = new Xpp3Dom("showWarnings");
        showWarnings.setValue("true");
        configuration.addChild(showWarnings);
        Xpp3Dom showDeprecation = new Xpp3Dom("showDeprecation");
        showDeprecation.setValue("true");
        configuration.addChild(showDeprecation);
        plugin.setConfiguration(configuration);

        return plugin;
    }

    private Plugin createSwitchYardPlugin() {
        return M2EUtils.createSwitchYardPlugin(Arrays.asList(DEFAULT_SCANNERS));
    }

}
