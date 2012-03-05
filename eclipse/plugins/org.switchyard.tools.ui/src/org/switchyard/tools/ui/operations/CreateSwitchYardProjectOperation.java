/*************************************************************************************
 * Copyright (c) 2011 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.operations;

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
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.maven.model.Build;
import org.apache.maven.model.Dependency;
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
import org.switchyard.tools.ui.common.ISwitchYardComponentExtension;
import org.switchyard.tools.ui.facets.ISwitchYardFacetConstants;

/**
 * CreateSwitchYardProjectOperation
 * 
 * Creates a new SwitchYard project: project, pom.xml, switchyard.xml, default
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

    /**
     * Simple bean used for specifying details about the project to be created.
     */
    public static final class NewSwitchYardProjectMetaData {
        private IProject _newProjectHandle;
        private URI _projectLocation;
        private String _packageName;
        private String _groupId;
        private String _projectVersion;
        private String _runtimeVersion;
        private Collection<ISwitchYardComponentExtension> _components;

        /**
         * @return the new project handle.
         */
        public IProject getNewProjectHandle() {
            return _newProjectHandle;
        }

        /**
         * @param newProjectHandle the new project handle.
         */
        public void setNewProjectHandle(IProject newProjectHandle) {
            _newProjectHandle = newProjectHandle;
        }

        /**
         * @return the project location.
         */
        public URI getProjectLocation() {
            return _projectLocation;
        }

        /**
         * @param projectLocation the project location.
         */
        public void setProjectLocation(URI projectLocation) {
            _projectLocation = projectLocation;
        }

        /**
         * @return the default package name.
         */
        public String getPackageName() {
            return _packageName;
        }

        /**
         * @param packageName the default package name.
         */
        public void setPackageName(String packageName) {
            _packageName = packageName;
        }

        /**
         * @return the groupId.
         */
        public String getGroupId() {
            return _groupId;
        }

        /**
         * @param groupId the groupId.
         */
        public void setGroupId(String groupId) {
            _groupId = groupId;
        }

        /**
         * @return the project version.
         */
        public String getProjectVersion() {
            return _projectVersion;
        }

        /**
         * @param projectVersion the project version.
         */
        public void setProjectVersion(String projectVersion) {
            _projectVersion = projectVersion;
        }

        /**
         * @return the SwitchYard runtime version.
         */
        public String getRuntimeVersion() {
            return _runtimeVersion;
        }

        /**
         * @param runtimeVersion SwtichYard runtime version.
         */
        public void setRuntimeVersion(String runtimeVersion) {
            _runtimeVersion = runtimeVersion;
        }

        /**
         * @return the SwitchYard components.
         */
        public Collection<ISwitchYardComponentExtension> getComponents() {
            return _components;
        }

        /**
         * @param components the SwitchYard components.
         */
        public void setComponents(Collection<ISwitchYardComponentExtension> components) {
            _components = components;
        }
    }

    private final NewSwitchYardProjectMetaData _projectMetatData;
    private final IAdaptable _uiInfo;

    /**
     * Create a new CreateSwitchYardProjectOperation.
     * 
     * @param projectMetatData details about the project to be created.
     * @param uiInfo adaptable for UI Shell, may be null.
     */
    public CreateSwitchYardProjectOperation(NewSwitchYardProjectMetaData projectMetatData, IAdaptable uiInfo) {
        _projectMetatData = projectMetatData;
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
                final IProjectDescription description = workspace.newProjectDescription(_projectMetatData
                        .getNewProjectHandle().getName());
                description.setLocationURI(_projectMetatData.getProjectLocation());
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
                String packageFolder = _projectMetatData.getPackageName().replace('.', '/');
                IFolder folder = _projectMetatData.getNewProjectHandle().getFolder(MAVEN_MAIN_JAVA_PATH)
                        .getFolder(packageFolder);
                CreateFolderOperation op = new CreateFolderOperation(folder, null,
                        "Creating default main source folder");
                subMonitor = new SubProgressMonitor(monitor, 25, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                op.execute(subMonitor, _uiInfo);
                subMonitor.done();
                subMonitor.setTaskName("");

                folder = _projectMetatData.getNewProjectHandle().getFolder(MAVEN_MAIN_RESOURCES_PATH);
                op = new CreateFolderOperation(folder, null, "Creating default main resource folder");
                subMonitor = new SubProgressMonitor(monitor, 25, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                op.execute(subMonitor, _uiInfo);
                subMonitor.done();
                subMonitor.setTaskName("");

                folder = _projectMetatData.getNewProjectHandle().getFolder(MAVEN_TEST_JAVA_PATH)
                        .getFolder(packageFolder);
                op = new CreateFolderOperation(folder, null, "Creating default test source folder");
                subMonitor = new SubProgressMonitor(monitor, 25, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                op.execute(subMonitor, _uiInfo);
                subMonitor.done();
                subMonitor.setTaskName("");

                folder = _projectMetatData.getNewProjectHandle().getFolder(MAVEN_TEST_RESOURCES_PATH);
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
                IFile pomFile = _projectMetatData.getNewProjectHandle().getFile("pom.xml");
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
                SwitchYardModel switchYardModel = createSwitchYardModel(
                        _projectMetatData.getNewProjectHandle().getName(),
                        createTargetnamespace(_projectMetatData.getGroupId(), _projectMetatData.getNewProjectHandle()
                                .getName(), _projectMetatData.getProjectVersion()));
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                switchYardModel.getModelConfiguration().write(baos, new OutputKey[0]);
                IFile switchYardFile = _projectMetatData.getNewProjectHandle().getFolder(MAVEN_MAIN_RESOURCES_PATH)
                        .getFolder(META_INF).getFile(SWITCHYARD_XML);
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
                mavenProjectConfigurationManager.enableMavenNature(_projectMetatData.getNewProjectHandle(),
                        mavenProjectConfigurationManager.getResolverConfiguration(_projectMetatData
                                .getNewProjectHandle()), subMonitor);
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
                final IFacetedProject facetedProject = ProjectFacetsManager.create(
                        _projectMetatData.getNewProjectHandle(), true, subMonitor);
                subMonitor.done();
                subMonitor.setTaskName("");

                subMonitor = new SubProgressMonitor(monitor, 50, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                final IFacetedProjectWorkingCopy fpwc = facetedProject.createWorkingCopy();
                fpwc.setSelectedPreset(ISwitchYardFacetConstants.SWITCHYARD_JAR_PRESET_ID);
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
        model.setGroupId(_projectMetatData.getGroupId());
        model.setArtifactId(_projectMetatData.getNewProjectHandle().getName());
        model.setVersion(_projectMetatData.getProjectVersion());
        model.setPackaging("jar");
        model.setName(_projectMetatData.getGroupId() + ":" + _projectMetatData.getNewProjectHandle().getName());

        // add runtime dependencies
        model.addProperty(SWITCHYARD_VERSION, _projectMetatData.getRuntimeVersion());

        String versionString = "${" + SWITCHYARD_VERSION + "}";
        Set<String> scanners = new LinkedHashSet<String>();
        for (ISwitchYardComponentExtension component : _projectMetatData.getComponents()) {
            String scanner = component.getScannerClassName();
            if (scanner != null) {
                scanners.add(scanner);
            }
            for (Dependency dependency : component.getDependencies()) {
                dependency = dependency.clone();
                dependency.setVersion(versionString);
                model.getDependencies().add(dependency);
            }
        }

        // add build section
        model.setBuild(createBuildSection(versionString, scanners));

        // add repository
        Repository repository = createJBossPublicRepository(JBOSS_PUBLIC_REPOSITORY_DEFAULT_ID);
        model.addRepository(repository);
        model.addPluginRepository(repository);

        return model;
    }

    private Build createBuildSection(String versionString, Set<String> scanners) {
        Build build = new Build();
        build.addPlugin(createSwitchYardPlugin(versionString, scanners));
        build.addPlugin(createCompilerPlugin());
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

    private Plugin createSwitchYardPlugin(String versionString, Set<String> scanners) {
        return M2EUtils.createSwitchYardPlugin(versionString, true, scanners);
    }

}
