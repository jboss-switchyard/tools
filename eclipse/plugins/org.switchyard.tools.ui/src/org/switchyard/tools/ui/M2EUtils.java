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
package org.switchyard.tools.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.maven.RepositoryUtils;
import org.apache.maven.artifact.repository.ArtifactRepository;
import org.apache.maven.model.Build;
import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.PluginExecution;
import org.apache.maven.model.Repository;
import org.apache.maven.project.MavenProject;
import org.apache.maven.repository.internal.MavenRepositorySystemSession;
import org.apache.maven.wagon.authentication.AuthenticationInfo;
import org.codehaus.plexus.PlexusContainer;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.embedder.IMaven;
import org.eclipse.m2e.core.internal.embedder.MavenImpl;
import org.eclipse.m2e.core.repository.IRepository;
import org.eclipse.m2e.core.repository.IRepositoryRegistry;
import org.sonatype.aether.artifact.Artifact;
import org.sonatype.aether.repository.Authentication;
import org.sonatype.aether.repository.LocalRepository;
import org.sonatype.aether.repository.RemoteRepository;
import org.sonatype.aether.resolution.VersionRangeRequest;
import org.sonatype.aether.resolution.VersionRangeResult;

/**
 * M2EUtils
 * 
 * Utility functionality for working with m2e.
 * 
 * @author Rob Cernich
 */
@SuppressWarnings("restriction")
public final class M2EUtils {

    /** The switchyard.version property key. */
    public static final String SWITCHYARD_VERSION = "switchyard.version";

    /** The group ID for SwitchYard core projects. */
    public static final String SWITCHYARD_CORE_GROUP_ID = "org.switchyard";
    /** The core SwitchYard API project artifact ID. */
    public static final String SWITCHYARD_API_ARTIFACT_ID = "switchyard-api";
    /** The core SwitchYard plugin project artifact ID. */
    public static final String SWITCHYARD_PLUGIN_ARTIFACT_ID = "switchyard-plugin";
    /** The core SwitchYard test project artifact ID. */
    public static final String SWITCHYARD_TEST_ARTIFACT_ID = "switchyard-test";

    /** The group ID for SwitchYard components projects. */
    public static final String SWITCHYARD_COMPONENTS_GROUP_ID = "org.switchyard.components";
    /** The SwitchYard bean component artifact ID. */
    public static final String SWITCHYARD_BEAN_COMPONENT_ARTIFACT_ID = "switchyard-component-bean";

    /** src/main/java. */
    public static final String MAVEN_MAIN_JAVA_PATH = "src/main/java";
    /** src/main/resources. */
    public static final String MAVEN_MAIN_RESOURCES_PATH = "src/main/resources";
    /** src/test/java. */
    public static final String MAVEN_TEST_JAVA_PATH = "src/test/java";
    /** src/test/resources. */
    public static final String MAVEN_TEST_RESOURCES_PATH = "src/test/resources";

    /** The default ID for representing the JBoss Public Maven repository. */
    public static final String JBOSS_PUBLIC_REPOSITORY_DEFAULT_ID = "jboss-public-repository";

    /** The DEFAULT_SCANNERS. */
    public static final String[] DEFAULT_SCANNERS = {
            "org.switchyard.component.bean.config.model.BeanSwitchYardScanner",
            "org.switchyard.component.camel.config.model.RouteScanner",
            "org.switchyard.component.bpm.config.model.BPMSwitchYardScanner",
            "org.switchyard.component.rules.config.model.RulesSwitchYardScanner",
            "org.switchyard.transform.config.model.TransformSwitchYardScanner" };

    /** The default SwitchYard dependencies. */
    public static final Collection<Dependency> DEFAULT_DEPENDENCIES;

    private static final String CONFIGURATION_ELEMENT = "configuration";
    private static final String SCANNER_CLASS_NAMES_ELEMENT = "scannerClassNames";
    private static final String PARAM_ELEMENT = "param";
    private static final String CONFIGURE_GOAL = "configure";

    /**
     * @param groupId the groupId
     * @param artifactId the artifactId
     * @return a new Dependency
     */
    public static Dependency createSwitchYardDependency(String groupId, String artifactId) {
        Dependency dependency = new Dependency();
        dependency.setArtifactId(artifactId);
        dependency.setGroupId(groupId);
        dependency.setVersion("${" + SWITCHYARD_VERSION + "}");
        return dependency;
    }

    /**
     * @param scanners the scanners to include in the configuration.
     * @return a new SwitchYard plugin instance.
     */
    public static Plugin createSwitchYardPlugin(Collection<String> scanners) {
        Plugin plugin = createSwitchYardPlugin();
        plugin.addExecution(createSwitchYardPluginExecution());
        plugin.setConfiguration(createSwitchYardPluginConfiguration(scanners));
        return plugin;
    }

    /**
     * Creates a new Repository representing the JBoss Public Maven repository.
     * 
     * @param id to use for the new Repository.
     * @return the new Repository.
     */
    public static Repository createJBossPublicRepository(String id) {
        Repository repository = new Repository();
        repository.setId(id);
        repository.setName("JBoss Public Maven Repository");
        repository.setUrl("http://repository.jboss.org/nexus/content/groups/public");
        repository.setLayout("default");
        return repository;
    }

    /**
     * Utility method for resolving the version range for a particular artifact.
     * 
     * It would be nice if this were exposed directly from m2e.
     * 
     * @param artifact to resolve.
     * 
     * @return the version range for the artifact.
     * @throws CoreException if an error occurs.
     */
    public static VersionRangeResult resolveVersionRange(Artifact artifact) throws CoreException {
        try {
            IMaven maven = MavenPlugin.getMaven();
            ArtifactRepository localRepository = maven.getLocalRepository();

            PlexusContainer container = ((MavenImpl) maven).getPlexusContainer();
            org.sonatype.aether.RepositorySystem repoSystem = container
                    .lookup(org.sonatype.aether.RepositorySystem.class);

            MavenRepositorySystemSession session = new MavenRepositorySystemSession();
            session.setLocalRepositoryManager(repoSystem.newLocalRepositoryManager(new LocalRepository(localRepository
                    .getBasedir())));
            session.setTransferListener(((MavenImpl) maven).createArtifactTransferListener(new NullProgressMonitor()));
            VersionRangeRequest rangeRequest = new VersionRangeRequest(artifact, getRemoteRepositories(), null);
            return repoSystem.resolveVersionRange(session, rangeRequest);
        } catch (Exception e) {
            throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "Error resolving version range", e));
        }
    }

    private static List<RemoteRepository> getRemoteRepositories() {
        List<RemoteRepository> remoteRepositories;
        try {
            remoteRepositories = RepositoryUtils.toRepos(MavenPlugin.getMaven().getArtifactRepositories());
        } catch (CoreException e) {
            // we've tried
            remoteRepositories = new ArrayList<RemoteRepository>();
        }

        // add in any other repositories
        List<IRepository> repositories = MavenPlugin.getRepositoryRegistry().getRepositories(
                IRepositoryRegistry.SCOPE_SETTINGS | IRepositoryRegistry.SCOPE_UNKNOWN);
        for (IRepository repository : repositories) {
            boolean found = false;
            for (RemoteRepository remoteRepository : remoteRepositories) {
                if (remoteRepository.getUrl().equals(repository.getUrl())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                RemoteRepository remoteRepository = new RemoteRepository(repository.getId(), "default",
                        repository.getUrl());
                AuthenticationInfo authInfo = repository.getAuthenticationInfo();
                if (authInfo != null) {
                    remoteRepository.setAuthentication(new Authentication(authInfo.getUserName(), authInfo
                            .getPassword(), authInfo.getPrivateKey(), authInfo.getPassphrase()));
                }
                remoteRepositories.add(remoteRepository);
            }
        }
        return remoteRepositories;
    }

    /**
     * Returns the generated switchyard.xml file. By default, this is
     * target/class/META-INF/switchyard.xml.
     * 
     * @param project the project
     * @return the location of the generated switchyard.xml file.
     */
    public static File getSwitchYardOutputFile(MavenProject project) {
        if (project == null) {
            return null;
        }
        Plugin plugin = findSwitchYardPlugin(project.getModel());
        if (plugin == null) {
            return null;
        }
        Xpp3Dom configuration = findSwitchYardPluginConfiguration(plugin);
        if (configuration != null) {
            Xpp3Dom node = configuration.getChild("outputFile");
            if (node != null && node.getValue() != null) {
                return new File(project.getBasedir(), node.getValue());
            }
            node = configuration.getChild("outputDirectory");
            if (node != null && node.getValue() != null) {
                return new File(new File(project.getBasedir(), node.getValue()), "META-INF/switchyard.xml");
            }
        }
        return new File(project.getBuild().getOutputDirectory(), "META-INF/switchyard.xml");
    }

    /**
     * Updates a pom model ensuring the required dependencies and scanners are
     * properly configured in the pom. Returns the updated model.
     * 
     * @param pomFile the location of the pom.
     * @param requiredDependencies the required dependencies.
     * @param requiredScanners the required configuration scanners.
     * @param monitor the monitor
     * @return the updated model; null if the model was not updated.
     * 
     * @throws CoreException if an error occurs.
     */
    public static Model updatePom(File pomFile, Collection<Dependency> requiredDependencies,
            Collection<String> requiredScanners, IProgressMonitor monitor) throws CoreException {
        requiredDependencies = new ArrayList<Dependency>(requiredDependencies);
        requiredScanners = new ArrayList<String>(requiredScanners);

        monitor.beginTask("Updating project pom.xml file.", 100);
        IMaven maven = MavenPlugin.getMaven();

        monitor.subTask("Reading current pom model.");
        MavenProject project = maven.readProject(pomFile, monitor);
        Model model = maven.readModel(pomFile);
        monitor.worked(50);

        boolean modelUpdated = false;

        monitor.subTask("Validating switchyard.version property.");
        if (project.getProperties().getProperty(SWITCHYARD_VERSION) == null) {
            model.addProperty(SWITCHYARD_VERSION, "");
            modelUpdated = true;
        }
        monitor.worked(10);

        monitor.subTask("Validating component dependencies.");
        Map<String, Dependency> requiredDependencyMap = createDependencyMap(requiredDependencies);
        requiredDependencyMap.keySet().removeAll(createDependencyMap(project.getDependencies()).keySet());
        if (requiredDependencyMap.size() > 0) {
            model.getDependencies().addAll(requiredDependencyMap.values());
            modelUpdated = true;
        }
        monitor.worked(10);

        monitor.subTask("Validating SwitchYard plugin.");
        Plugin plugin = findSwitchYardPlugin(project.getModel());
        if (plugin == null) {
            Build build = model.getBuild();
            if (build == null) {
                build = new Build();
                model.setBuild(build);
            }
            plugin = createSwitchYardPlugin();
            plugin.addExecution(createSwitchYardPluginExecution());
            plugin.setConfiguration(createSwitchYardPluginConfiguration(requiredScanners));
            modelUpdated = true;
        } else {
            Plugin modelPlugin = null;
            for (PluginExecution execution : plugin.getExecutions()) {
                if (!execution.getGoals().contains(CONFIGURE_GOAL)) {
                    modelPlugin = getOrCreateSwitchYardPlugin(model);
                    modelPlugin.addExecution(createSwitchYardPluginExecution());
                    modelUpdated = true;
                }
            }
            Xpp3Dom configuration = findSwitchYardPluginConfiguration(plugin);
            if (configuration == null) {
                modelPlugin.setConfiguration(createSwitchYardPluginConfiguration(requiredScanners));
                modelUpdated = true;
            } else {
                Xpp3Dom scannerClassNames = ((Xpp3Dom) configuration).getChild(SCANNER_CLASS_NAMES_ELEMENT);
                if (scannerClassNames == null) {
                    configuration = findSwitchYardPluginConfiguration(modelPlugin);
                    if (configuration == null) {
                        modelPlugin.setConfiguration(createSwitchYardPluginConfiguration(requiredScanners));
                    } else {
                        configuration.addChild(createSwitchYardPluginScannerClassNames(requiredScanners));
                    }
                    modelUpdated = true;
                } else {
                    for (Xpp3Dom param : scannerClassNames.getChildren(PARAM_ELEMENT)) {
                        requiredScanners.remove(param.getValue());
                    }
                    if (requiredScanners.size() > 0) {
                        configuration = findSwitchYardPluginConfiguration(modelPlugin);
                        if (configuration == null) {
                            modelPlugin.setConfiguration(createSwitchYardPluginConfiguration(requiredScanners));
                        } else {
                            scannerClassNames = configuration.getChild(SCANNER_CLASS_NAMES_ELEMENT);
                            if (scannerClassNames == null) {
                                configuration.addChild(createSwitchYardPluginScannerClassNames(requiredScanners));
                            } else {
                                for (String scannerClassName : requiredScanners) {
                                    Xpp3Dom param = new Xpp3Dom(PARAM_ELEMENT);
                                    param.setValue(scannerClassName);
                                    scannerClassNames.addChild(param);
                                }
                            }
                        }
                        modelUpdated = true;
                    }
                }
            }
        }

        monitor.done();
        if (modelUpdated) {
            return model;
        }
        return null;
    }

    /**
     * @return a new SwitchYard plugin instance.
     */
    private static Plugin createSwitchYardPlugin() {
        Plugin plugin = new Plugin();
        plugin.setArtifactId(SWITCHYARD_PLUGIN_ARTIFACT_ID);
        plugin.setGroupId(SWITCHYARD_CORE_GROUP_ID);
        plugin.setVersion("${" + SWITCHYARD_VERSION + "}");
        return plugin;
    }

    /**
     * @param scanners the scanners to add to the configuration.
     * @return a new SwitchYard configuration element.
     */
    private static Xpp3Dom createSwitchYardPluginConfiguration(Collection<String> scanners) {
        Xpp3Dom configuration = new Xpp3Dom(CONFIGURATION_ELEMENT);
        Xpp3Dom scannerClassNames = new Xpp3Dom(SCANNER_CLASS_NAMES_ELEMENT);
        for (String scanner : scanners) {
            Xpp3Dom param = new Xpp3Dom(PARAM_ELEMENT);
            param.setValue(scanner);
            scannerClassNames.addChild(param);
        }
        configuration.addChild(scannerClassNames);

        return configuration;
    }

    /**
     * Creates a new PluginExecution with a "configure" goal.
     * 
     * @return a new SwitchYard PluginExecution.
     */
    private static final PluginExecution createSwitchYardPluginExecution() {
        PluginExecution execution = new PluginExecution();
        execution.addGoal(CONFIGURE_GOAL);
        return execution;
    }

    private static Map<String, Dependency> createDependencyMap(Collection<Dependency> dependencies) {
        Map<String, Dependency> dependencyMap = new LinkedHashMap<String, Dependency>();
        for (Dependency dependency : dependencies) {
            dependencyMap.put(dependency.getManagementKey(), dependency);
        }
        return dependencyMap;
    }

    private static Plugin findSwitchYardPlugin(Model model) {
        Build build = model.getBuild();
        if (build == null) {
            return null;
        }
        for (Plugin plugin : build.getPlugins()) {
            if (SWITCHYARD_CORE_GROUP_ID.equals(plugin.getGroupId())
                    && SWITCHYARD_PLUGIN_ARTIFACT_ID.equals(plugin.getArtifactId())) {
                return plugin;
            }
        }
        return null;
    }

    private static Plugin getOrCreateSwitchYardPlugin(Model model) {
        Build build = model.getBuild();
        if (build == null) {
            build = new Build();
            model.setBuild(build);
        }
        Plugin plugin = findSwitchYardPlugin(model);
        if (plugin == null) {
            plugin = createSwitchYardPlugin();
            build.addPlugin(plugin);
        }
        return plugin;
    }

    private static Xpp3Dom findSwitchYardPluginConfiguration(Plugin plugin) {
        Object configuration = plugin.getConfiguration();
        if (configuration instanceof Xpp3Dom) {
            return (Xpp3Dom) configuration;
        }
        for (PluginExecution execution : plugin.getExecutions()) {
            if (execution.getGoals().contains(CONFIGURE_GOAL)) {
                configuration = execution.getConfiguration();
                if (configuration instanceof Xpp3Dom) {
                    return (Xpp3Dom) configuration;
                }
                return null;
            }
        }
        return null;
    }

    private static final Xpp3Dom createSwitchYardPluginScannerClassNames(Collection<String> scanners) {
        Xpp3Dom scannerClassNames = new Xpp3Dom(SCANNER_CLASS_NAMES_ELEMENT);
        for (String scanner : scanners) {
            scannerClassNames.addChild(createParam(scanner));
        }
        return scannerClassNames;
    }

    private static final Xpp3Dom createParam(String value) {
        Xpp3Dom param = new Xpp3Dom(PARAM_ELEMENT);
        param.setValue(value);
        return param;
    }

    private M2EUtils() {
    }

    static {
        List<Dependency> dependencies = new ArrayList<Dependency>();
        dependencies.add(createSwitchYardDependency(SWITCHYARD_CORE_GROUP_ID, SWITCHYARD_API_ARTIFACT_ID));
        dependencies.add(createSwitchYardDependency(SWITCHYARD_CORE_GROUP_ID, SWITCHYARD_PLUGIN_ARTIFACT_ID));
        dependencies.add(createSwitchYardDependency(SWITCHYARD_CORE_GROUP_ID, SWITCHYARD_TEST_ARTIFACT_ID));
        DEFAULT_DEPENDENCIES = Collections.unmodifiableCollection(dependencies);
    }

}
