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

import static org.switchyard.tools.ui.M2EUtils.MAVEN_MAIN_JAVA_PATH;
import static org.switchyard.tools.ui.M2EUtils.MAVEN_MAIN_RESOURCES_PATH;
import static org.switchyard.tools.ui.M2EUtils.MAVEN_TEST_JAVA_PATH;
import static org.switchyard.tools.ui.M2EUtils.MAVEN_TEST_RESOURCES_PATH;
import static org.switchyard.tools.ui.M2EUtils.SWITCHYARD_VERSION;
import static org.switchyard.tools.ui.SwitchYardModelUtils.createSwitchYardModel;
import static org.switchyard.tools.ui.SwitchYardModelUtils.createTargetnamespace;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.maven.model.Build;
import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;
import org.apache.maven.model.Plugin;
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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.project.IProjectConfigurationManager;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.ui.ide.undo.CreateFileOperation;
import org.eclipse.ui.ide.undo.CreateFolderOperation;
import org.eclipse.ui.ide.undo.CreateProjectOperation;
import org.eclipse.wst.common.project.facet.core.IFacetedProject;
import org.eclipse.wst.common.project.facet.core.IFacetedProjectWorkingCopy;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;
import org.eclipse.wst.common.project.facet.core.ProjectFacetsManager;
import org.eclipse.wst.common.project.facet.core.runtime.IRuntimeComponent;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceFactoryImpl;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceFactoryImpl.NamespaceVersionConverter;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.M2EUtils;
import org.switchyard.tools.ui.common.ISwitchYardComponentExtension;
import org.switchyard.tools.ui.facets.ISwitchYardFacetConstants;
import org.switchyard.tools.ui.i18n.Messages;

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

    private static final String DEFAULT_JAVA_VERSION = "1.6"; //$NON-NLS-1$

    /**
     * Simple bean used for specifying details about the project to be created.
     */
    public static final class NewSwitchYardProjectMetaData {
        private IProject _newProjectHandle;
        private URI _projectLocation;
        private String _namespace;
        private String _packageName;
        private String _groupId;
        private String _projectVersion;
        private String _runtimeVersion;
        private IProjectFacetVersion _configurationVersion;
        private IRuntimeComponent _targetRuntime;

        /**
         * @return the switchYardFacet.
         */
        public IProjectFacetVersion getConfigurationVersion() {
            return _configurationVersion;
        }

        /**
         * @param switchYardFacet The switchYardFacet to set.
         */
        public void setConfigurationVersion(IProjectFacetVersion switchYardFacet) {
            _configurationVersion = switchYardFacet;
        }

        /**
         * @return the target runtime.
         */
        public IRuntimeComponent getTargetRuntime() {
            return _targetRuntime;
        }

        /**
         * @param targetRuntime The target runtime to set.
         */
        public void setTargetRuntime(IRuntimeComponent targetRuntime) {
            _targetRuntime = targetRuntime;
        }

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
         * @return the namespace for the application.
         */
        public String getNamespace() {
            return _namespace;
        }

        /**
         * @param namespace the namespace for the application.
         */
        public void setNamespace(String namespace) {
            _namespace = namespace;
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
    private IFile _switchYardFile;

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

    /**
     * @return the newly created switchyard.xml file.
     */
    public IFile getSwitchYardFile() {
        return _switchYardFile;
    }

    @Override
    public void run(IProgressMonitor monitor) throws CoreException {
        MultiStatus status = new MultiStatus(Activator.PLUGIN_ID, 15,
                Messages.CreateSwitchYardProjectOperation_statusLabel_errorsCreatingProject, null);

        monitor.beginTask(Messages.CreateSwitchYardProjectOperation_taskLabel_creatingSYProject, 700);
        try {
            // create the project
            IProgressMonitor subMonitor = new SubProgressMonitor(monitor, 100,
                    SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
            try {
                IWorkspace workspace = ResourcesPlugin.getWorkspace();
                final IProjectDescription description = workspace.newProjectDescription(_projectMetatData
                        .getNewProjectHandle().getName());
                description.setLocationURI(_projectMetatData.getProjectLocation());
                CreateProjectOperation op = new CreateProjectOperation(description,
                        Messages.CreateSwitchYardProjectOperation_operationLabel_newSYProject);
                op.execute(subMonitor, _uiInfo);
            } catch (ExecutionException e) {
                if (e.getCause() instanceof CoreException) {
                    throw (CoreException) e.getCause();
                }
                throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID,
                        Messages.CreateSwitchYardProjectOperation_exceptionMessage_errorCreatingSYProject, e));
            } finally {
                subMonitor.done();
                subMonitor.setTaskName(""); //$NON-NLS-1$
            }

            // create the folder structure
            try {
                monitor.subTask(Messages.CreateSwitchYardProjectOperation_taskLabel_creatingDefaultFolders);
                String packageFolder = _projectMetatData.getPackageName().replace('.', '/');
                IFolder folder = _projectMetatData.getNewProjectHandle().getFolder(MAVEN_MAIN_JAVA_PATH)
                        .getFolder(packageFolder);
                CreateFolderOperation op = new CreateFolderOperation(folder, null,
                        Messages.CreateSwitchYardProjectOperation_operationLabel_creatingDefaultMainSourceFolder);
                subMonitor = new SubProgressMonitor(monitor, 25, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                op.execute(subMonitor, _uiInfo);
                subMonitor.done();
                subMonitor.setTaskName(""); //$NON-NLS-1$

                folder = _projectMetatData.getNewProjectHandle().getFolder(MAVEN_MAIN_RESOURCES_PATH);
                op = new CreateFolderOperation(folder, null,
                        Messages.CreateSwitchYardProjectOperation_operationLabel_creatingDefaultMainResourceFolder);
                subMonitor = new SubProgressMonitor(monitor, 25, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                op.execute(subMonitor, _uiInfo);
                subMonitor.done();
                subMonitor.setTaskName(""); //$NON-NLS-1$

                folder = _projectMetatData.getNewProjectHandle().getFolder(MAVEN_TEST_JAVA_PATH)
                        .getFolder(packageFolder);
                op = new CreateFolderOperation(folder, null,
                        Messages.CreateSwitchYardProjectOperation_operationLabel_creatingDefaultMainTestSourceFolder);
                subMonitor = new SubProgressMonitor(monitor, 25, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                op.execute(subMonitor, _uiInfo);
                subMonitor.done();
                subMonitor.setTaskName(""); //$NON-NLS-1$

                folder = _projectMetatData.getNewProjectHandle().getFolder(MAVEN_TEST_RESOURCES_PATH);
                op = new CreateFolderOperation(folder, null,
                        Messages.CreateSwitchYardProjectOperation_operationLabel_creatingDefaultTestResourceFolder);
                subMonitor = new SubProgressMonitor(monitor, 25, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                op.execute(subMonitor, _uiInfo);
            } catch (Exception e) {
                mergeStatus(status,
                        Messages.CreateSwitchYardProjectOperation_statusMessage_errorCreatingDefaultFolders, e);
            } finally {
                subMonitor.done();
                subMonitor.setTaskName(""); //$NON-NLS-1$
            }

            // create pom.xml
            try {
                monitor.subTask(Messages.CreateSwitchYardProjectOperation_taskLabel_creatingPOM);
                Model model = createPom();
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                MavenPlugin.getMaven().writeModel(model, baos);
                IFile pomFile = _projectMetatData.getNewProjectHandle().getFile("pom.xml"); //$NON-NLS-1$
                CreateFileOperation op = new CreateFileOperation(pomFile, null, new ByteArrayInputStream(
                        baos.toByteArray()), Messages.CreateSwitchYardProjectOperation_operationLabel_creatingPOM);
                subMonitor = new SubProgressMonitor(monitor, 100, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                op.execute(subMonitor, _uiInfo);
            } catch (Exception e) {
                mergeStatus(status, Messages.CreateSwitchYardProjectOperation_statusMessage_errorCreatingPOM, e);
            } finally {
                subMonitor.done();
                subMonitor.setTaskName(""); //$NON-NLS-1$
            }

            // create switchyard.xml
            try {
                monitor.subTask(Messages.CreateSwitchYardProjectOperation_taskLabel_creatingSYXMLFile);
                subMonitor = new SubProgressMonitor(monitor, 100, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                createSwitchYardConfig(subMonitor);
            } catch (Exception e) {
                mergeStatus(status, Messages.CreateSwitchYardProjectOperation_statusMessage_errorCreatingSYXML, e);
            } finally {
                subMonitor.done();
                subMonitor.setTaskName(""); //$NON-NLS-1$
            }

            // update maven configuration.
            try {
                monitor.subTask(Messages.CreateSwitchYardProjectOperation_taskLabel_updatingMavenProjectConfig);
                subMonitor = new SubProgressMonitor(monitor, 100, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                IProjectConfigurationManager mavenProjectConfigurationManager = MavenPlugin
                        .getProjectConfigurationManager();
                mavenProjectConfigurationManager.enableMavenNature(_projectMetatData.getNewProjectHandle(),
                        mavenProjectConfigurationManager.getResolverConfiguration(_projectMetatData
                                .getNewProjectHandle()), subMonitor);
            } catch (Exception e) {
                mergeStatus(status,
                        Messages.CreateSwitchYardProjectOperation_statusMessage_errorUpdatingMavenProjectConfig, e);
            } finally {
                subMonitor.done();
                subMonitor.setTaskName(""); //$NON-NLS-1$
            }

            // attach target runtime
            if (_projectMetatData.getTargetRuntime() != null) {
                attachTargetRuntime(monitor, status);
            }

            if (!status.isOK()) {
                throw new CoreException(status);
            }
        } finally {
            monitor.done();
        }
    }

    private void createSwitchYardConfig(IProgressMonitor monitor) throws IOException {
        ResourceSet rs = new ResourceSetImpl();
        try {
            _switchYardFile = _projectMetatData.getNewProjectHandle().getFolder(MAVEN_MAIN_RESOURCES_PATH)
                    .getFolder(M2EUtils.META_INF).getFile(M2EUtils.SWITCHYARD_XML);
            XMLResource switchYardResource = (XMLResource) rs.createResource(org.eclipse.emf.common.util.URI.createPlatformResourceURI(_switchYardFile.getFullPath().toPortableString(), true), SwitchyardResourceFactoryImpl.CONTENT_TYPE);
            final String namespace = _projectMetatData.getNamespace();
            SwitchYardType switchYardModel = newSwitchYardModel(
                    _projectMetatData.getNewProjectHandle().getName(),
                    namespace == null || namespace.length() == 0 ? createTargetnamespace(
                            _projectMetatData.getGroupId(), _projectMetatData.getNewProjectHandle().getName(),
                            _projectMetatData.getProjectVersion()) : namespace);
            switchYardResource.getContents().add(switchYardModel);
            IProjectFacetVersion configVersion = _projectMetatData.getConfigurationVersion();
            NamespaceVersionConverter converter = (NamespaceVersionConverter) switchYardResource.getDefaultSaveOptions().get(XMLResource.OPTION_EXTENDED_META_DATA);
            converter.setVersion(configVersion == null ? ISwitchYardFacetConstants.SWITCHYARD_FACET
                    .getDefaultVersion().getVersionString() : configVersion.getVersionString());
            switchYardResource.save(null);
        } finally {
            for (Resource resource : rs.getResources()) {
                try {
                    resource.unload();
                } catch (Exception e) {
                    e.fillInStackTrace();
                }
            }
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

    private void attachTargetRuntime(IProgressMonitor monitor, MultiStatus status) {
        monitor.subTask(Messages.CreateSwitchYardProjectOperation_taskLabel_attachingTargetRuntimeToProject);

        IProgressMonitor subMonitor = new SubProgressMonitor(monitor, 50, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
        IFacetedProjectWorkingCopy ifpwc = null;
        try {
            IFacetedProject ifp = ProjectFacetsManager.create(_projectMetatData.getNewProjectHandle(), true,
                    subMonitor);

            subMonitor.done();

            ifpwc = ifp.createWorkingCopy();
            ifpwc.addTargetedRuntime(_projectMetatData.getTargetRuntime().getRuntime());
            subMonitor = new SubProgressMonitor(monitor, 50, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
            ifpwc.commitChanges(subMonitor);
        } catch (Exception e) {
            mergeStatus(status, Messages.CreateSwitchYardProjectOperation_errorMessage_errorAttachingTargetRuntimeToProject, e);
        } finally {
            if (ifpwc != null) {
                ifpwc.dispose();
            }
            subMonitor.done();
            subMonitor.setTaskName(""); //$NON-NLS-1$
        }
    }

    private SwitchYardType newSwitchYardModel(String name, String targetNamespace) {
        SwitchYardType switchYardModel = createSwitchYardModel(name, targetNamespace);
        Composite composite = ScaFactory.eINSTANCE.createComposite();
        composite.setName(name);
        composite.setTargetNamespace(targetNamespace);
        switchYardModel.setComposite(composite);
        return switchYardModel;
    }

    private Model createPom() {
        Model model = new Model();

        // basic project setup
        model.setModelVersion("4.0.0"); //$NON-NLS-1$
        model.setGroupId(_projectMetatData.getGroupId());
        model.setArtifactId(_projectMetatData.getNewProjectHandle().getName());
        model.setVersion(_projectMetatData.getProjectVersion());
        model.setPackaging("jar"); //$NON-NLS-1$
        model.setName(_projectMetatData.getGroupId() + ":" + _projectMetatData.getNewProjectHandle().getName()); //$NON-NLS-1$

        // add runtime dependencies
        model.addProperty(SWITCHYARD_VERSION, _projectMetatData.getRuntimeVersion());

        String versionString = "${" + SWITCHYARD_VERSION + "}"; //$NON-NLS-1$ //$NON-NLS-2$
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
        // Repository repository =
        // createJBossPublicRepository(JBOSS_PUBLIC_REPOSITORY_DEFAULT_ID);
        // model.addRepository(repository);
        // model.addPluginRepository(repository);

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
        plugin.setArtifactId("maven-compiler-plugin"); //$NON-NLS-1$
        plugin.setGroupId("org.apache.maven.plugins"); //$NON-NLS-1$
        plugin.setVersion("2.3.2"); //$NON-NLS-1$

        Xpp3Dom configuration = new Xpp3Dom("configuration"); //$NON-NLS-1$
        Xpp3Dom source = new Xpp3Dom("source"); //$NON-NLS-1$
        source.setValue(DEFAULT_JAVA_VERSION);
        configuration.addChild(source);
        Xpp3Dom target = new Xpp3Dom("target"); //$NON-NLS-1$
        target.setValue(DEFAULT_JAVA_VERSION);
        configuration.addChild(target);
        Xpp3Dom debug = new Xpp3Dom("debug"); //$NON-NLS-1$
        debug.setValue("true"); //$NON-NLS-1$
        configuration.addChild(debug);
        Xpp3Dom showWarnings = new Xpp3Dom("showWarnings"); //$NON-NLS-1$
        showWarnings.setValue("true"); //$NON-NLS-1$
        configuration.addChild(showWarnings);
        Xpp3Dom showDeprecation = new Xpp3Dom("showDeprecation"); //$NON-NLS-1$
        showDeprecation.setValue("true"); //$NON-NLS-1$
        configuration.addChild(showDeprecation);
        plugin.setConfiguration(configuration);

        return plugin;
    }

    private Plugin createSwitchYardPlugin(String versionString, Set<String> scanners) {
        return M2EUtils.createSwitchYardPlugin(versionString, true, scanners);
    }

}
