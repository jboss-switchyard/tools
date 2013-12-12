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
package org.switchyard.tools.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
import org.sonatype.aether.util.artifact.DefaultArtifact;

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
    public static final String SWITCHYARD_VERSION = "switchyard.version"; //$NON-NLS-1$

    /** The group ID for SwitchYard core projects. */
    public static final String SWITCHYARD_CORE_GROUP_ID = "org.switchyard"; //$NON-NLS-1$
    /** The core SwitchYard API project artifact ID. */
    public static final String SWITCHYARD_API_ARTIFACT_ID = "switchyard-api"; //$NON-NLS-1$
    /** The core SwitchYard plugin project artifact ID. */
    public static final String SWITCHYARD_PLUGIN_ARTIFACT_ID = "switchyard-plugin"; //$NON-NLS-1$

    /** src/main/java. */
    public static final String MAVEN_MAIN_JAVA_PATH = "src/main/java"; //$NON-NLS-1$
    /** src/main/resources. */
    public static final String MAVEN_MAIN_RESOURCES_PATH = "src/main/resources"; //$NON-NLS-1$
    /** src/test/java. */
    public static final String MAVEN_TEST_JAVA_PATH = "src/test/java"; //$NON-NLS-1$
    /** src/test/resources. */
    public static final String MAVEN_TEST_RESOURCES_PATH = "src/test/resources"; //$NON-NLS-1$

    /** The default ID for representing the JBoss Public Maven repository. */
    public static final String JBOSS_PUBLIC_REPOSITORY_DEFAULT_ID = "jboss-public-repository"; //$NON-NLS-1$

    /** switchyard.xml. */
    public static final String SWITCHYARD_XML = "switchyard.xml"; //$NON-NLS-1$
    /** META-INF. */
    public static final String META_INF = "META-INF"; //$NON-NLS-1$

    /**
     * The as opposed to null, this identifies an indeterminate for the version
     * string.
     */
    public static final String UNKNOWN_VERSION_STRING = new String("unknown"); //$NON-NLS-1$

    // SwitchYard configure plugin configuration
    /** The key identifying the SwitchYard configure plugin. */
    public static final String SWITCHYARD_PLUGIN_KEY = Plugin.constructKey(SWITCHYARD_CORE_GROUP_ID,
            SWITCHYARD_PLUGIN_ARTIFACT_ID);
    /** Maven "configuration" element. */
    public static final String CONFIGURATION_ELEMENT = "configuration"; //$NON-NLS-1$
    /** The SwitchYard plugin "scannerClassNames" element. */
    public static final String SCANNER_CLASS_NAMES_ELEMENT = "scannerClassNames"; //$NON-NLS-1$
    /** The SwitchYard plugin "outputFile" element. */
    public static final String OUTPUT_FILE_ELEMENT = "outputFile"; //$NON-NLS-1$
    /** The SwitchYard plugin "outputDirectory" element. */
    public static final String OUTPUT_DIRECTORY_ELEMENT = "outputDirectory"; //$NON-NLS-1$
    /** The SwitchYard plugin "param" element. */
    public static final String PARAM_ELEMENT = "param"; //$NON-NLS-1$
    /** The SwitchYard plugin "configure" goal. */
    public static final String CONFIGURE_GOAL = "configure"; //$NON-NLS-1$

    /** The URL for the JBoss public Maven repository. */
    public static final String JBOSS_PUBLIC_REPOSITORY_URL = "http://repository.jboss.org/nexus/content/groups/public"; //$NON-NLS-1$

    /**
     * @param groupId the groupId
     * @param artifactId the artifactId
     * @return a new Dependency
     */
    public static Dependency createSwitchYardDependency(String groupId, String artifactId) {
        return createSwitchYardDependency(groupId, artifactId, null);
    }

    /**
     * @param groupId the groupId
     * @param artifactId the artifactId
     * @param scope the scope
     * @return a new Dependency
     */
    public static Dependency createSwitchYardDependency(String groupId, String artifactId, String scope) {
        Dependency dependency = new Dependency();
        dependency.setArtifactId(artifactId);
        dependency.setGroupId(groupId);
        dependency.setScope(scope);
        return dependency;
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
        repository.setName("JBoss Public Maven Repository"); //$NON-NLS-1$
        repository.setUrl(JBOSS_PUBLIC_REPOSITORY_URL);
        repository.setLayout("default"); //$NON-NLS-1$
        return repository;
    }

    /**
     * Utility method for resolving the version range for SwitchYard.
     * 
     * @param monitor the progress monitor
     * @return the version range for org.switchyard:switchyard-api
     * @throws CoreException if an error occurs.
     */
    public static VersionRangeResult resolveSwitchYardVersionRange(IProgressMonitor monitor) throws CoreException {
        return resolveVersionRange(new DefaultArtifact(SWITCHYARD_CORE_GROUP_ID, SWITCHYARD_API_ARTIFACT_ID, "jar", //$NON-NLS-1$
                "[,]"), monitor); //$NON-NLS-1$
    }

    /**
     * Utility method for resolving the version range for a particular artifact.
     * 
     * It would be nice if this were exposed directly from m2e.
     * 
     * @param artifact to resolve.
     * @param monitor the progress monitor
     * 
     * @return the version range for the artifact.
     * @throws CoreException if an error occurs.
     */
    public static VersionRangeResult resolveVersionRange(Artifact artifact, IProgressMonitor monitor)
            throws CoreException {
        try {
            IMaven maven = MavenPlugin.getMaven();
            ArtifactRepository localRepository = maven.getLocalRepository();

            PlexusContainer container = ((MavenImpl) maven).getPlexusContainer();
            org.sonatype.aether.RepositorySystem repoSystem = container
                    .lookup(org.sonatype.aether.RepositorySystem.class);

            MavenRepositorySystemSession session = new MavenRepositorySystemSession();
            session.setLocalRepositoryManager(repoSystem.newLocalRepositoryManager(new LocalRepository(localRepository
                    .getBasedir())));
            // use null progress to prevent SWTException: invalid thread access
            session.setTransferListener(((MavenImpl) maven).createArtifactTransferListener(new NullProgressMonitor()));
            VersionRangeRequest rangeRequest = new VersionRangeRequest(artifact, getRemoteRepositories(), null);
            return repoSystem.resolveVersionRange(session, rangeRequest);
        } catch (Exception e) {
            throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "Error resolving version range", e)); //$NON-NLS-1$
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
                RemoteRepository remoteRepository = new RemoteRepository(repository.getId(), "default", //$NON-NLS-1$
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
     * @param version the plugin version
     * @param createExecution true to create an execution with a configure goal
     * @param scanners the scanners to configure
     * @return a new Plugin instance
     */
    public static Plugin createSwitchYardPlugin(String version, boolean createExecution, Set<String> scanners) {
        Plugin plugin = new Plugin();

        plugin.setArtifactId(SWITCHYARD_PLUGIN_ARTIFACT_ID);
        plugin.setGroupId(SWITCHYARD_CORE_GROUP_ID);
        plugin.setVersion(version);

        if (createExecution) {
            PluginExecution execution = new PluginExecution();
            execution.addGoal(CONFIGURE_GOAL);
            plugin.addExecution(execution);
        }

        if (scanners.isEmpty()) {
            return plugin;
        }

        Xpp3Dom configuration = new Xpp3Dom(CONFIGURATION_ELEMENT);
        plugin.setConfiguration(configuration);
        Xpp3Dom scannerElement = new Xpp3Dom(SCANNER_CLASS_NAMES_ELEMENT);
        configuration.addChild(scannerElement);
        for (String scanner : scanners) {
            Xpp3Dom paramElement = new Xpp3Dom(PARAM_ELEMENT);
            paramElement.setValue(scanner);
            scannerElement.addChild(paramElement);
        }

        return plugin;
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
            Xpp3Dom node = configuration.getChild("outputFile"); //$NON-NLS-1$
            if (node != null && node.getValue() != null) {
                return new File(project.getBasedir(), node.getValue());
            }
            node = configuration.getChild("outputDirectory"); //$NON-NLS-1$
            if (node != null && node.getValue() != null) {
                return new File(new File(project.getBasedir(), node.getValue()), "META-INF/switchyard.xml"); //$NON-NLS-1$
            }
        }
        return new File(project.getBuild().getOutputDirectory(), "META-INF/switchyard.xml"); //$NON-NLS-1$
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

    private M2EUtils() {
    }

}
