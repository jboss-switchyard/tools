/*************************************************************************************
 * Copyright (c) 2016 Red Hat, Inc. and others.
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.maven.model.Build;
import org.apache.maven.model.Dependency;
import org.apache.maven.model.DependencyManagement;
import org.apache.maven.model.Model;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.PluginExecution;
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
import org.eclipse.wst.common.project.facet.core.runtime.IRuntime;
import org.eclipse.wst.common.project.facet.core.runtime.IRuntimeComponent;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceFactoryImpl;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceFactoryImpl.NamespaceVersionConverter;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.M2EUtils;
import org.switchyard.tools.ui.RuntimeUtils;
import org.switchyard.tools.ui.SwitchYardModelUtils;
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

    /**
     * Default Java Version used elsewhere.
     */
    public static final String DEFAULT_JAVA_VERSION = "1.7"; //$NON-NLS-1$

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
        private String _kieVersion;
        private String _integVersion;
        private boolean _isOSGIEnabled = false;
        private boolean _useSwitchYardDependencyBOM = false;
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
         * @return kie runtime version.
         */
        public String getKieVersion() {
            return _kieVersion;
        }

        /**
         * @param version new data to set.
         */
        public void setKieVersion(String version) {
            _kieVersion = version;
        }

        /**
         * @return integration runtime version.
         */
        public String getIntegrationVersion() {
            return _integVersion;
        }

        /**
         * @param version new data to set
         */
        public void setIntegrationVersion(String version) {
            _integVersion = version;
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

        /**
         * @return flag true/false (default false) adding OSGI bundle (Karaf)
         *         support.
         */
        public boolean isOSGIEnabled() {
            return _isOSGIEnabled;
        }

        /**
         * @param isEnabled Should support OSGI bundle (Karaf) config.
         */
        public void setIsOSGIEnabled(boolean isEnabled) {
            this._isOSGIEnabled = isEnabled;
        }

        /**
         * @return flag true/false (default false) adding SwitchYard Dependency
         *         BOM support.
         */
        public boolean isSwitchYardDependencyBOMEnabled() {
            return _useSwitchYardDependencyBOM;
        }

        /**
         * @param isEnabled Should support the SwitchYard Dependency BOM.
         */
        public void setIsSwitchYardDependencyBOMEnabled(boolean isEnabled) {
            this._useSwitchYardDependencyBOM = isEnabled;
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
                final IProjectDescription description = workspace
                        .newProjectDescription(_projectMetatData.getNewProjectHandle().getName());
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
                mergeStatus(status, Messages.CreateSwitchYardProjectOperation_statusMessage_errorCreatingDefaultFolders,
                        e);
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
                CreateFileOperation op = new CreateFileOperation(pomFile, null,
                        new ByteArrayInputStream(baos.toByteArray()),
                        Messages.CreateSwitchYardProjectOperation_operationLabel_creatingPOM);
                subMonitor = new SubProgressMonitor(monitor, 100, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                op.execute(subMonitor, _uiInfo);
            } catch (Exception e) {
                mergeStatus(status, Messages.CreateSwitchYardProjectOperation_statusMessage_errorCreatingPOM, e);
            } finally {
                subMonitor.done();
                subMonitor.setTaskName(""); //$NON-NLS-1$
            }

            if (_projectMetatData.isOSGIEnabled()) {
                try { // create features.xml
                    createFeaturesXML(monitor, status);
                } catch (Exception e) {
                    mergeStatus(status, Messages.CreateSwitchYardProjectOperation_ErrorCreatingFeaturesXML, e);
                } finally {
                    subMonitor.done();
                    subMonitor.setTaskName(""); //$NON-NLS-1$
                }
            }

            try { // create switchyard.xml
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
                        mavenProjectConfigurationManager
                                .getResolverConfiguration(_projectMetatData.getNewProjectHandle()),
                        subMonitor);
            } catch (Exception e) {
                mergeStatus(status,
                        Messages.CreateSwitchYardProjectOperation_statusMessage_errorUpdatingMavenProjectConfig, e);
            } finally {
                subMonitor.done();
                subMonitor.setTaskName(""); //$NON-NLS-1$
            }

            // create log4j.xml
            try {
                createLog4jXMLFile(monitor, status);
            } catch (Exception e) {
                mergeStatus(status, "Error encountered while creating log4j.xml file.", e);
            } finally {
                subMonitor.done();
                subMonitor.setTaskName(""); //$NON-NLS-1$
            }

            // attach target runtime
            if (_projectMetatData.getTargetRuntime() != null) {
                attachTargetRuntime(monitor, status);
            }
            IProject project = _projectMetatData.getNewProjectHandle();
            M2EUtils.refreshProject(project, monitor);
            if (!status.isOK()) {
                throw new CoreException(status);
            }
        } finally {
            monitor.done();
        }
    }

    private void createFeaturesXML(IProgressMonitor monitor, MultiStatus status) throws IOException {
        if (_projectMetatData.isOSGIEnabled()) {
            // create features.xml

            IProgressMonitor subMonitor = null;
            try {
                monitor.subTask(Messages.CreateSwitchYardProjectOperation_CreatingFeaturesXML);
                IFile featuresFile = _projectMetatData.getNewProjectHandle().getFolder(MAVEN_MAIN_RESOURCES_PATH)
                        .getFile("features.xml"); //$NON-NLS-1$
                StringBuffer contents = new StringBuffer();
                contents.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"); //$NON-NLS-1$
                contents.append("<features xmlns=\"http://karaf.apache.org/xmlns/features/v1.0.0\">\n"); //$NON-NLS-1$
                contents.append("\t<repository>mvn:org.switchyard.karaf/switchyard/" //$NON-NLS-1$
                        + "${" + SWITCHYARD_VERSION + "}/xml/features</repository>\n"); //$NON-NLS-1$
                contents.append("\t<feature name=\"" + _projectMetatData.getNewProjectHandle().getName() //$NON-NLS-1$
                        + "\" version=\"" + _projectMetatData._projectVersion + "\" resolver=\"(obr)\"" + ">\n"); //$NON-NLS-1$ //$NON-NLS-2$
                for (ISwitchYardComponentExtension component : _projectMetatData.getComponents()) {
                    String featureId = component.getBundleId();
                    if (featureId != null && featureId.length() > 0) {
                        contents.append(
                                "\t\t<feature version=\"${" + SWITCHYARD_VERSION + "}\">" + featureId + "</feature>\n"); //$NON-NLS-1$ //$NON-NLS-2$
                    }
                }
                contents.append(
                        "\t\t<bundle>mvn:${project.groupId}/${project.artifactId}/${project.version}</bundle>\n"); //$NON-NLS-1$
                contents.append("\t</feature>\n"); //$NON-NLS-1$

                contents.append("</features>\n"); //$NON-NLS-1$
                CreateFileOperation op = new CreateFileOperation(featuresFile, null,
                        new ByteArrayInputStream(contents.toString().getBytes()),
                        Messages.CreateSwitchYardProjectOperation_CreatingFeaturesXML);
                subMonitor = new SubProgressMonitor(monitor, 100, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                op.execute(subMonitor, _uiInfo);
            } catch (Exception e) {
                mergeStatus(status, Messages.CreateSwitchYardProjectOperation_ErrorCreatingFeaturesXML, e);
            } finally {
                if (subMonitor != null) {
                    subMonitor.done();
                    subMonitor.setTaskName(""); //$NON-NLS-1$
                }
            }
        }
    }

    private void createLog4jXMLFile(IProgressMonitor monitor, MultiStatus status) throws IOException {
        IProgressMonitor subMonitor = null;
        try {
            monitor.subTask("Creating log4j.xml in Test Resources");
            IFile featuresFile = _projectMetatData.getNewProjectHandle().getFolder(MAVEN_TEST_RESOURCES_PATH)
                    .getFile("log4j.xml"); //$NON-NLS-1$
            StringBuffer contents = new StringBuffer();
            contents.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"); //$NON-NLS-1$
            contents.append("<log4j:configuration xmlns:log4j=\"http://jakarta.apache.org/log4j/\">\n"); //$NON-NLS-1$
            contents.append("\t<appender name=\"STDOUT\" class=\"org.apache.log4j.ConsoleAppender\">\n"); //$NON-NLS-1$
            contents.append("\t\t<layout class=\"org.apache.log4j.PatternLayout\">\n"); //$NON-NLS-1$
            contents.append("\t\t\t<param name=\"ConversionPattern\" value=\"%d{HH:mm:ss,SSS} %-5p [%c] %m%n\"/>\n"); //$NON-NLS-1$
            contents.append("\t\t</layout>\n"); //$NON-NLS-1$
            contents.append("\t</appender>\n"); //$NON-NLS-1$
            contents.append("\t<logger name=\"org.jboss.weld.Bootstrap\">\n"); //$NON-NLS-1$
            contents.append("\t\t<level value=\"ERROR\"/>\n"); //$NON-NLS-1$
            contents.append("\t</logger>\n"); //$NON-NLS-1$
            contents.append("\t<root>\n"); //$NON-NLS-1$
            contents.append("\t\t<level value=\"INFO\"/>\n"); //$NON-NLS-1$
            contents.append("\t\t<appender-ref ref=\"STDOUT\"/>\n"); //$NON-NLS-1$
            contents.append("\t</root>\n"); //$NON-NLS-1$
            contents.append("</log4j:configuration>\n"); //$NON-NLS-1$
            CreateFileOperation op = new CreateFileOperation(featuresFile, null,
                    new ByteArrayInputStream(contents.toString().getBytes()),
                    Messages.CreateSwitchYardProjectOperation_CreatingFeaturesXML);
            subMonitor = new SubProgressMonitor(monitor, 100, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
            op.execute(subMonitor, _uiInfo);
        } catch (Exception e) {
            mergeStatus(status, Messages.CreateSwitchYardProjectOperation_ErrorCreatingFeaturesXML, e);
        } finally {
            if (subMonitor != null) {
                subMonitor.done();
                subMonitor.setTaskName(""); //$NON-NLS-1$
            }
        }
    }

    private void createSwitchYardConfig(IProgressMonitor monitor) throws IOException {
        ResourceSet rs = SwitchYardModelUtils.newResourceSet();
        try {
            _switchYardFile = _projectMetatData.getNewProjectHandle().getFolder(MAVEN_MAIN_RESOURCES_PATH)
                    .getFolder(M2EUtils.META_INF).getFile(M2EUtils.SWITCHYARD_XML);

            // force the right content factory in case it gets changed elsewhere
            // unexpectedly
            rs.getResourceFactoryRegistry().getContentTypeToFactoryMap().put(SwitchyardResourceFactoryImpl.CONTENT_TYPE,
                    new SwitchyardResourceFactoryImpl());

            XMLResource switchYardResource = (XMLResource) rs.createResource(
                    org.eclipse.emf.common.util.URI
                            .createPlatformResourceURI(_switchYardFile.getFullPath().toPortableString(), true),
                    SwitchyardResourceFactoryImpl.CONTENT_TYPE);
            final String namespace = _projectMetatData.getNamespace();
            SwitchYardType switchYardModel = newSwitchYardModel(_projectMetatData.getNewProjectHandle().getName(),
                    namespace == null || namespace.length() == 0 ? createTargetnamespace(_projectMetatData.getGroupId(),
                            _projectMetatData.getNewProjectHandle().getName(), _projectMetatData.getProjectVersion())
                            : namespace);
            switchYardResource.getContents().add(switchYardModel);
            IProjectFacetVersion configVersion = _projectMetatData.getConfigurationVersion();
            NamespaceVersionConverter converter = (NamespaceVersionConverter) switchYardResource.getDefaultSaveOptions()
                    .get(XMLResource.OPTION_EXTENDED_META_DATA);
            converter.setVersion(configVersion == null
                    ? ISwitchYardFacetConstants.SWITCHYARD_FACET.getDefaultVersion().getVersionString()
                    : configVersion.getVersionString());
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

        IProgressMonitor subMonitor = new SubProgressMonitor(monitor, 50,
                SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
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
            mergeStatus(status,
                    Messages.CreateSwitchYardProjectOperation_errorMessage_errorAttachingTargetRuntimeToProject, e);
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

        if (_projectMetatData.isOSGIEnabled()) {
            model.setPackaging("bundle"); //$NON-NLS-1$
        } else {
            model.setPackaging("jar"); //$NON-NLS-1$
        }
        model.setName(_projectMetatData.getGroupId() + ":" + _projectMetatData.getNewProjectHandle().getName()); //$NON-NLS-1$

        boolean isIntegration = _projectMetatData.getIntegrationVersion() != null;

        String versionString = "${" + SWITCHYARD_VERSION + "}"; //$NON-NLS-1$ //$NON-NLS-2$

        // add runtime dependencies
        if (isIntegration) {
            model.addProperty("integration.version", _projectMetatData.getIntegrationVersion());
            model.addProperty("kie.version", _projectMetatData.getKieVersion());
        }
        model.addProperty(SWITCHYARD_VERSION, _projectMetatData.getRuntimeVersion());
        
        String javaVersion = DEFAULT_JAVA_VERSION;

        // if we have a target runtime, get the java version from it
        if (_projectMetatData.getTargetRuntime() != null) {
            IRuntimeComponent rtc = _projectMetatData.getTargetRuntime();
            IRuntime rt = rtc.getRuntime();
            String tempVersion = RuntimeUtils.getJavaExecutionEnvironment(rt);
            if (tempVersion != null) {
                javaVersion = tempVersion;
            }
        }
        
        model.addProperty("maven.compiler.target", javaVersion); //$NON-NLS-1$
        model.addProperty("maven.compiler.source", javaVersion); //$NON-NLS-1$
        
        if (_projectMetatData.isOSGIEnabled()) {
            model.addProperty("switchyard.osgi.require.capability", //$NON-NLS-1$
                    "org.ops4j.pax.cdi.extension; filter:=\"(extension=switchyard-component-bean)\",\n" //$NON-NLS-1$
                            + "org.ops4j.pax.cdi.extension; filter:=\"(extension=deltaspike-core-api)\",\n" //$NON-NLS-1$
                            + "osgi.extender; filter:=\"(osgi.extender=pax.cdi)\""); //$NON-NLS-1$
            // model.addProperty("switchyard.osgi.provide.capability", "");
            // //$NON-NLS-1$ //$NON-NLS-2$
            model.addProperty("switchyard.osgi.symbolic.name", //$NON-NLS-1$
                    _projectMetatData.getGroupId() + "." + model.getArtifactId()); //$NON-NLS-1$
            model.addProperty("switchyard.osgi.import.switchyard.version",
                    "version=\"[$(version;==;${switchyard.osgi.version}),$(version;=+;${switchyard.osgi.version}))\"");
            model.addProperty("switchyard.osgi.import.default.version", "[$(version;==;$(@)),$(version;+;$(@)))");
            model.addProperty("switchyard.osgi.export", _projectMetatData.getPackageName() + "*"); //$NON-NLS-1$ //$NON-NLS-2$
            model.addProperty("switchyard.osgi.import", //$NON-NLS-1$
                    "org.switchyard.*;${switchyard.osgi.import.switchyard.version},*"); //$NON-NLS-1$
            model.addProperty("switchyard.osgi.dynamic", //$NON-NLS-1$
                    "org.switchyard,org.switchyard.*"); //$NON-NLS-1$
        }

        // add dependency management for SwitchYard BOM
        if (_projectMetatData.isSwitchYardDependencyBOMEnabled()) {

            if (model.getDependencyManagement() == null) {
                model.setDependencyManagement(new DependencyManagement());
            }

            if (isIntegration) {
                Dependency integrationBomDependency = new Dependency();
                integrationBomDependency.setGroupId(M2EUtils.INTEGRATION_GROUP_ID);
                integrationBomDependency.setArtifactId(M2EUtils.INTEGRATION_BOM_ARTIFACT_ID);
                integrationBomDependency.setVersion("${" + M2EUtils.INTEGRATION_VERSION + "}"); //$NON-NLS-1$ //$NON-NLS-2$
                integrationBomDependency.setScope("import"); //$NON-NLS-1$
                integrationBomDependency.setType("pom"); //$NON-NLS-1$
                model.getDependencyManagement().addDependency(integrationBomDependency);

                Dependency kieBomDependency = new Dependency();
                kieBomDependency.setGroupId(M2EUtils.KIE_GROUP_ID);
                kieBomDependency.setArtifactId(M2EUtils.KIE_BOM_ARTIFACT_ID);
                kieBomDependency.setVersion("${" + M2EUtils.KIE_VERSION + "}"); //$NON-NLS-1$ //$NON-NLS-2$
                kieBomDependency.setScope("import"); //$NON-NLS-1$
                kieBomDependency.setType("pom"); //$NON-NLS-1$
                model.getDependencyManagement().addDependency(kieBomDependency);

                Dependency droolsBomDependency = new Dependency();
                droolsBomDependency.setGroupId(M2EUtils.DROOLS_GROUP_ID);
                droolsBomDependency.setArtifactId(M2EUtils.DROOLS_BOM_ARTIFACT_ID);
                droolsBomDependency.setVersion("${" + M2EUtils.KIE_VERSION + "}"); //$NON-NLS-1$ //$NON-NLS-2$
                droolsBomDependency.setScope("import"); //$NON-NLS-1$
                droolsBomDependency.setType("pom"); //$NON-NLS-1$
                model.getDependencyManagement().addDependency(droolsBomDependency);

                Dependency jbpmBomDependency = new Dependency();
                jbpmBomDependency.setGroupId(M2EUtils.JBPM_GROUP_ID);
                jbpmBomDependency.setArtifactId(M2EUtils.JBPM_BOM_ARTIFACT_ID);
                jbpmBomDependency.setVersion("${" + M2EUtils.KIE_VERSION + "}"); //$NON-NLS-1$ //$NON-NLS-2$
                jbpmBomDependency.setScope("import"); //$NON-NLS-1$
                jbpmBomDependency.setType("pom"); //$NON-NLS-1$
                model.getDependencyManagement().addDependency(jbpmBomDependency);
            }
            
            Dependency bomDependency = new Dependency();
            bomDependency.setGroupId(M2EUtils.SWITCHYARD_CORE_GROUP_ID);
            bomDependency.setArtifactId(M2EUtils.SWITCHYARD_BOM_ARTIFACT_ID);
            bomDependency.setVersion("${" + M2EUtils.SWITCHYARD_VERSION + "}"); //$NON-NLS-1$ //$NON-NLS-2$
            bomDependency.setScope("import"); //$NON-NLS-1$
            bomDependency.setType("pom"); //$NON-NLS-1$
            model.getDependencyManagement().addDependency(bomDependency);
            
        }

        // add dependencies
        Set<String> scanners = new LinkedHashSet<String>();
        for (ISwitchYardComponentExtension component : _projectMetatData.getComponents()) {
            String scanner = component.getScannerClassName();
            if (scanner != null) {
                scanners.add(scanner);
            }
            for (Dependency dependency : component.getDependencies()) {
                dependency = dependency.clone();
                if (!_projectMetatData.isSwitchYardDependencyBOMEnabled()) {
                    dependency.setVersion(versionString);
                } else {
                    if (dependency.getArtifactId().equals("switchyard-plugin")) {
                        dependency.setVersion(versionString);
                    } // else don't add it
                }
                if (isIntegration) { // hack for SWITCHYARD-2936
                    M2EUtils.hackIntegrationPackDependency(dependency);
                }
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
        if (_projectMetatData.isOSGIEnabled()) {
            build.addPlugin(createBundlePlugin());
            build.addPlugin(createAttachFeaturePlugin());
            build.addResource(createFilteredResource());
            build.addResource(createUnFilteredResource());
        }
        return build;
    }

    private org.apache.maven.model.Resource createFilteredResource() {
        org.apache.maven.model.Resource mvnResource = new org.apache.maven.model.Resource();
        mvnResource.setDirectory(MAVEN_MAIN_RESOURCES_PATH);
        mvnResource.setFiltering(true);
        ArrayList<String> includesList = new ArrayList<String>();
        includesList.add("features.xml");
        mvnResource.setIncludes(includesList);
        return mvnResource;
    }

    private org.apache.maven.model.Resource createUnFilteredResource() {
        org.apache.maven.model.Resource mvnResource = new org.apache.maven.model.Resource();
        mvnResource.setDirectory(MAVEN_MAIN_RESOURCES_PATH);
        mvnResource.setFiltering(false);
        ArrayList<String> excludesList = new ArrayList<String>();
        excludesList.add("features.xml");
        mvnResource.setExcludes(excludesList);
        return mvnResource;
    }

    private Plugin createAttachFeaturePlugin() {
        Plugin plugin = new Plugin();
        plugin.setArtifactId("build-helper-maven-plugin"); //$NON-NLS-1$
        plugin.setGroupId("org.codehaus.mojo"); //$NON-NLS-1$

        PluginExecution attachFeatureExecution = new PluginExecution();
        attachFeatureExecution.setId("attach-artifacts"); //$NON-NLS-1$
        attachFeatureExecution.setPhase("package"); //$NON-NLS-1$
        attachFeatureExecution.addGoal("attach-artifact"); //$NON-NLS-1$

        Xpp3Dom configuration = createNode("configuration"); //$NON-NLS-1$
        Xpp3Dom artifacts = createNode("artifacts"); //$NON-NLS-1$
        Xpp3Dom artifact = createNode("artifact"); //$NON-NLS-1$
        Xpp3Dom file = createNode("file", "target/classes/features.xml"); //$NON-NLS-1$ //$NON-NLS-2$
        artifact.addChild(file);
        Xpp3Dom type = createNode("type", "xml"); //$NON-NLS-1$ //$NON-NLS-2$
        artifact.addChild(type);
        Xpp3Dom classifier = createNode("classifier", "features"); //$NON-NLS-1$ //$NON-NLS-2$
        artifact.addChild(classifier);
        artifacts.addChild(artifact);
        configuration.addChild(artifacts);
        attachFeatureExecution.setConfiguration(configuration);

        plugin.addExecution(attachFeatureExecution);

        return plugin;
    }

    private Xpp3Dom createNode(String tag) {
        return createNode(tag, null);
    }

    private Xpp3Dom createNode(String tag, String value) {
        Xpp3Dom domNode = new Xpp3Dom(tag);
        if (value != null) {
            domNode.setValue(value);
        }
        return domNode;
    }

    private Plugin createBundlePlugin() {
        Plugin plugin = new Plugin();
        plugin.setArtifactId("maven-bundle-plugin"); //$NON-NLS-1$
        plugin.setGroupId("org.apache.felix"); //$NON-NLS-1$
        plugin.setVersion("2.4.0"); //$NON-NLS-1$
        plugin.setExtensions(true);

        String versionStr = "${switchyard.version}";
        ArrayList<PluginExecution> executions = new ArrayList<PluginExecution>();
        PluginExecution execution = new PluginExecution();
        execution.setId("cleanVersions"); //$NON-NLS-1$
        execution.setPhase("generate-sources"); //$NON-NLS-1$
        execution.addGoal("cleanVersions"); //$NON-NLS-1$
        Xpp3Dom exeuctionConfiguration = createNode("configuration"); //$NON-NLS-1$
        Xpp3Dom exeuctionVersions = createNode("versions"); //$NON-NLS-1$
        Xpp3Dom executionVersionsOSGIVersion = createNode("switchyard.osgi.version", versionStr); //$NON-NLS-1$ //$NON-NLS-2$
        exeuctionVersions.addChild(executionVersionsOSGIVersion);
        exeuctionConfiguration.addChild(exeuctionVersions);
        execution.setConfiguration(exeuctionConfiguration);
        executions.add(execution);
        plugin.setExecutions(executions);

        Xpp3Dom configuration = createNode("configuration"); //$NON-NLS-1$
        Xpp3Dom excludeDeps = createNode("excludeDependencies", "false"); //$NON-NLS-1$ //$NON-NLS-2$
        configuration.addChild(excludeDeps);

        Xpp3Dom instructions = createNode("instructions"); //$NON-NLS-1$
        instructions.addChild(createNode("Bundle-Name", "${project.name}")); //$NON-NLS-1$ //$NON-NLS-2$
        instructions.addChild(createNode("Bundle-SymbolicName", "${project.groupId}" + "." + "${project.artifactId}")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        instructions.addChild(createNode("Import-Package", "${switchyard.osgi.import}")); //$NON-NLS-1$ //$NON-NLS-2$
        instructions.addChild(createNode("Include-Resource", //$NON-NLS-1$
                "{maven-resources}, META-INF/switchyard.xml=target/classes/META-INF/switchyard.xml")); //$NON-NLS-1$
        instructions.addChild(createNode("DynamicImport-Package", "${switchyard.osgi.dynamic}")); //$NON-NLS-1$ //$NON-NLS-2$
        instructions.addChild(createNode("_failok", "true")); //$NON-NLS-1$ //$NON-NLS-2$
        instructions.addChild(createNode("Embed-Dependency", "!*")); //$NON-NLS-1$ //$NON-NLS-2$
        instructions.addChild(createNode("Require-Capability", "${switchyard.osgi.require.capability}")); //$NON-NLS-1$ //$NON-NLS-2$

        configuration.addChild(instructions);

        Xpp3Dom archive = createNode("archive"); //$NON-NLS-1$
        Xpp3Dom manifestEntries = createNode("manifestEntries"); //$NON-NLS-1$
        manifestEntries.addChild(createNode("Project-Artifact-Id", "${project.artifactId}")); //$NON-NLS-1$ //$NON-NLS-2$
        manifestEntries.addChild(createNode("Project-Group-Id", "${project.groupId}")); //$NON-NLS-1$ //$NON-NLS-2$
        manifestEntries.addChild(createNode("Project-Version", "${project.version}")); //$NON-NLS-1$ //$NON-NLS-2$
        archive.addChild(manifestEntries);
        configuration.addChild(archive);

        plugin.setConfiguration(configuration);

        return plugin;
    }

    private Plugin createSwitchYardPlugin(String versionString, Set<String> scanners) {
        boolean isIntegration = false;
        if (_projectMetatData.getTargetRuntime() != null) {
            String label = _projectMetatData.getTargetRuntime().getProperty("switchyard.label");
            isIntegration = label.contains("Integration"); // hack
        }

        if (isIntegration) {
            return M2EUtils.createSwitchYardPlugin(null, true, scanners);
        }
        return M2EUtils.createSwitchYardPlugin(versionString, true, scanners);
    }
}
