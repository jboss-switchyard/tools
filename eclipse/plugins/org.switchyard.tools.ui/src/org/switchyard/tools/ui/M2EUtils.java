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
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.versioning.ArtifactVersion;
import org.apache.maven.artifact.versioning.DefaultArtifactVersion;
import org.apache.maven.model.Build;
import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.PluginExecution;
import org.apache.maven.model.Repository;
import org.apache.maven.project.MavenProject;
import org.apache.maven.repository.RepositorySystem;
import org.apache.maven.repository.legacy.metadata.ArtifactMetadataSource;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.embedder.IMaven;
import org.eclipse.m2e.core.internal.embedder.MavenImpl;
import org.eclipse.m2e.core.ui.internal.UpdateMavenProjectJob;
import org.switchyard.tools.ui.wizards.NewSwitchYardProjectWizard;

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
    /** The core SwitchYard BOM Artifact ID. */
    public static final String SWITCHYARD_BOM_ARTIFACT_ID = "switchyard-bom"; //$NON-NLS-1$
    
    /** Integration bom Group ID. */
    public static final String INTEGRATION_GROUP_ID = "org.jboss.integration.fuse"; //$NON-NLS-1$
    /** Integration bom artifact ID. */
    public static final String INTEGRATION_BOM_ARTIFACT_ID = "fuse-integration-bom"; //$NON-NLS-1$
    /** Integration version. */
    public static final String INTEGRATION_VERSION = "integration.version";
    /** KIE bom Group ID. */
    public static final String KIE_GROUP_ID = "org.kie"; //$NON-NLS-1$
    /** KIE bom artifact ID. */
    public static final String KIE_BOM_ARTIFACT_ID = "kie-bom"; //$NON-NLS-1$
    /** KIE version. */
    public static final String KIE_VERSION = "kie.version";
    /** Alternate KIE version property string. */
    public static final String ALT_KIE_VERSION = "version.org.kie";  //$NON-NLS-1$    
    /** Drools bom Group ID. */
    public static final String DROOLS_GROUP_ID = "org.drools"; //$NON-NLS-1$
    /** Drools bom artifact ID. */
    public static final String DROOLS_BOM_ARTIFACT_ID = "drools-bom"; //$NON-NLS-1$
    /** Drools version. */
    public static final String DROOLS_VERSION = "drools.version";
    /** JBPM bom Group ID. */
    public static final String JBPM_GROUP_ID = "org.jbpm"; //$NON-NLS-1$
    /** JBPM bom artifact ID. */
    public static final String JBPM_BOM_ARTIFACT_ID = "jbpm-bom"; //$NON-NLS-1$
    /** JBPM version. */
    public static final String JBPM_VERSION = "jbpm.version";
    /** SwitchYard BPM Component artifact ID. **/
    public static final String BPM_COMPONENT_ARTIFACT_ID = "switchyard-component-bpm";  //$NON-NLS-1$ 
    /** SwitchYard Rules Component artifact ID. **/
    public static final String RULES_COMPONENT_ARTIFACT_ID = "switchyard-component-rules";  //$NON-NLS-1$     

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
    public static List<ArtifactVersion> resolveSwitchYardVersionRange(IProgressMonitor monitor) throws CoreException {
        try {
            final List<ArtifactVersion> versions = resolveVersionRange(
                    ((MavenImpl) MavenPlugin.getMaven()).getPlexusContainer().lookup(RepositorySystem.class)
                            .createArtifact(SWITCHYARD_CORE_GROUP_ID, SWITCHYARD_API_ARTIFACT_ID, "[,]", "jar"),
                    monitor);
            // make sure the versions are in order
            Collections.sort(versions);
            return versions;
        } catch (Exception e) {
            throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "Error resolving version range", e)); //$NON-NLS-1$
        }
    }

    /**
     * Utility method for resolving the version range for Kie components.
     * 
     * @param monitor the progress monitor
     * @return the version range for org.kie:kie-bom
     * @throws CoreException if an error occurs.
     */
    public static List<ArtifactVersion> resolveKieVersionRange(IProgressMonitor monitor) throws CoreException {
        try {
            final List<ArtifactVersion> versions = resolveVersionRange(
                    ((MavenImpl) MavenPlugin.getMaven()).getPlexusContainer().lookup(RepositorySystem.class)
                            .createArtifact("org.kie", "kie-bom", "[,]", "jar"),
                    monitor);
            // make sure the versions are in order
            Collections.sort(versions);
            return versions;
        } catch (Exception e) {
            throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "Error resolving version range", e)); //$NON-NLS-1$
        }
    }

    /**
     * Utility method for resolving the version range for Kie components.
     * 
     * @param monitor the progress monitor
     * @return the version range for
     *         org.jboss.integration.fuse:fuse-integration-bom
     * @throws CoreException if an error occurs.
     */
    public static List<ArtifactVersion> resolveFuseIntegrationVersionRange(IProgressMonitor monitor)
            throws CoreException {
        try {
            final List<ArtifactVersion> versions = resolveVersionRange(
                    ((MavenImpl) MavenPlugin.getMaven()).getPlexusContainer().lookup(RepositorySystem.class)
                            .createArtifact("org.jboss.integration.fuse", "fuse-integration-bom", "[,]", "jar"),
                    monitor);
            // make sure the versions are in order
            Collections.sort(versions);
            return versions;
        } catch (Exception e) {
            throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "Error resolving version range", e)); //$NON-NLS-1$
        }
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
    public static List<ArtifactVersion> resolveVersionRange(Artifact artifact, IProgressMonitor monitor)
            throws CoreException {
        try {
            final IMaven maven = MavenPlugin.getMaven();
            final ArtifactMetadataSource source = ((MavenImpl) maven).getPlexusContainer().lookup(
                    ArtifactMetadataSource.class, "org.apache.maven.artifact.metadata.ArtifactMetadataSource", "maven"); //$NON-NLS-1$ $NON-NLS-2$
            return source.retrieveAvailableVersions(artifact, maven.getLocalRepository(),
                    maven.getArtifactRepositories());
        } catch (Exception e) {
            throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "Error resolving version range", e)); //$NON-NLS-1$
        }
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
        if (version != null) {
            plugin.setVersion(version);
        }

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

    /**
     * Refresh the project using the Maven->Update Project approach.
     * @param project Project to update.
     * @param monitor Monitor to use.
     * @throws CoreException if any errors show up.
     */
    public static void refreshProject(final IProject project, IProgressMonitor monitor) throws CoreException {
        // update the project so we ensure a Project->Clean is done so the
        // MANIFEST.MF is built and we don't run into trouble deploying the
        // project on a Fuse server.
        if (project != null) {
            try {
                waitJob(100, monitor);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
            // update the maven project so we start in a deployable state
            // with a valid MANIFEST.MF built as part of the build process.
            Job updateJob = new UpdateMavenProjectJob(new IProject[] {project });
            updateJob.schedule();
        }
    }
    
    private static void waitJob(int decreasingCounter, IProgressMonitor monitor) throws InterruptedException {
        if (decreasingCounter > 0) {
            return;
        }
        try {
            Job.getJobManager().join(ResourcesPlugin.FAMILY_AUTO_BUILD, monitor);
            Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_REFRESH, monitor);
            Job.getJobManager().join(ResourcesPlugin.FAMILY_AUTO_REFRESH, monitor);
            Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD, monitor);
        } catch (InterruptedException e) {
            // Workaround to bug
            // https://bugs.eclipse.org/bugs/show_bug.cgi?id=335251
            waitJob(decreasingCounter--, monitor);
        }
    }

    /**
     * Hack for SWITCHYARD-2936. This essentially replaces the GroupID for the
     * BPM or Rules dependency to use the one for the integration pack instead
     * of the one for the base SwitchYard components.
     * 
     * @param dependency Dependency to hack for BPM & Rules components
     */
    public static void hackIntegrationPackDependency(final Dependency dependency) {
        if (dependency != null) {
            if (dependency.getArtifactId().equalsIgnoreCase(M2EUtils.BPM_COMPONENT_ARTIFACT_ID)
                    || dependency.getArtifactId().equalsIgnoreCase(M2EUtils.RULES_COMPONENT_ARTIFACT_ID)) {
                dependency.setGroupId(M2EUtils.INTEGRATION_GROUP_ID);
            }
            // otherwise just leave it alone
        }
    }

    /**
     * Surf through the list of available artifact versions. 
     * @param versions list incoming
     * @return list outgoing
     */
    public static Set<ArtifactVersion> filterSwitchYardVersions(List<ArtifactVersion> versions) {
        final String onePointZero = "1.0"; //$NON-NLS-1$
        final Set<ArtifactVersion> filtered = new LinkedHashSet<ArtifactVersion>();
        String previousMajorMinor = null;
        boolean previousWasSnapshot = false;
        /* assumes list is sorted lowest to highest. */
        for (ListIterator<ArtifactVersion> it = versions.listIterator(versions.size()); it.hasPrevious();) {
            ArtifactVersion next = it.previous();
            String version = next.toString();
            String majorMinor = getMajorMinor(version);
            try {
                if (previousMajorMinor == null) {
                    filtered.add(next);
                    previousWasSnapshot = version.endsWith("-SNAPSHOT"); //$NON-NLS-1$
                } else if (version.endsWith("-SNAPSHOT")) { //$NON-NLS-1$
                    // skip snapshots
                    previousWasSnapshot = true;
                    continue;
                } else if (previousMajorMinor.equals(majorMinor) && !previousWasSnapshot) {
                    // we already have this version
                    continue;
                } else {
                    // don't have this one yet
                    filtered.add(next);
                    previousWasSnapshot = false;
                    if (onePointZero.equals(majorMinor)) {
                        // nothing before 1.0
                        break;
                    }
                }
            } finally {
                previousMajorMinor = majorMinor;
            }
        }
        return filtered;
    }

    /**
     * Parse the whole version string to get the Major/Minor versions.
     * @param version string
     * @return string
     */
    public static String getMajorMinor(final String version) {
        final int firstDot = version.indexOf('.');
        final int secondDot = firstDot < 0 ? -1 : version.indexOf('.', firstDot + 1);
        if (secondDot < 0) {
            return version;
        }
        return version.substring(0, secondDot);
    }
    
    /**
     * Ensure that the default and previous SwitchYard versions show up in the available versions list.
     * @param versions list incoming
     * @return list outgoing
     */
    public static Set<ArtifactVersion> ensureDefaultAndPreviousVersionAvailable(final Set<ArtifactVersion> versions) {
        // add default version
        final ArtifactVersion defaultVersion = parseVersion(NewSwitchYardProjectWizard.DEFAULT_RUNTIME_VERSION);
        versions.add(defaultVersion);

        // add previous version as well 
        final ArtifactVersion previousVersion = parseVersion(NewSwitchYardProjectWizard.PREVIOUS_RUNTIME_VERSION);
        versions.add(previousVersion);
        
        return versions;
    }
    
    /**
     * Turn a version string back into an ArtifactVersion
     * @param text for version
     * @return ArtifactVersion
     */
    public static ArtifactVersion parseVersion(final String text) {
        if (text == null || text.length() == 0) {
            return null;
        }
        return new DefaultArtifactVersion(text);
    }
    
    /**
     * Get list of available SwitchYard versions from the Maven repository.
     * @param monitor for progress
     * @return list of versions
     */
    public static Set<ArtifactVersion> populateSwitchYardVersionList(IProgressMonitor monitor) {
        try {
            final Set<ArtifactVersion> versions = filterSwitchYardVersions(resolveSwitchYardVersionRange(monitor));
            return versions;
        } catch (CoreException e) {
            final Set<ArtifactVersion> versions = new LinkedHashSet<ArtifactVersion>();
            return versions;
        }        
    }
    
    private M2EUtils() {
    }

}
