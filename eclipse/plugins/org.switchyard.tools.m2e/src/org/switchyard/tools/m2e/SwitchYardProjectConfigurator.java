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
package org.switchyard.tools.m2e;

import java.io.IOException;

import org.apache.maven.model.Dependency;
import org.apache.maven.plugin.MojoExecution;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.m2e.core.lifecyclemapping.model.IPluginExecutionMetadata;
import org.eclipse.m2e.core.project.IMavenProjectFacade;
import org.eclipse.m2e.core.project.configurator.AbstractBuildParticipant;
import org.eclipse.m2e.core.project.configurator.AbstractProjectConfigurator;
import org.eclipse.m2e.core.project.configurator.ILifecycleMappingConfiguration;
import org.eclipse.m2e.core.project.configurator.MojoExecutionKey;
import org.eclipse.m2e.core.project.configurator.ProjectConfigurationRequest;
import org.eclipse.m2e.wtp.ResourceCleaner;
import org.eclipse.m2e.wtp.WTPProjectsUtil;
import org.eclipse.wst.common.project.facet.core.IFacetedProject;
import org.eclipse.wst.common.project.facet.core.IFacetedProjectWorkingCopy;
import org.eclipse.wst.common.project.facet.core.IPreset;
import org.eclipse.wst.common.project.facet.core.IProjectFacet;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;
import org.eclipse.wst.common.project.facet.core.ProjectFacetsManager;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceFactoryImpl;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceFactoryImpl.NamespaceVersionConverter;

/**
 * SwitchYardProjectConfigurator
 * 
 * M2E project configurator for SwitchYard. Installs required project facets.
 * 
 * @see AbstractProjectConfigurator
 * 
 * @author Rob Cernich
 */
@SuppressWarnings("restriction")
public class SwitchYardProjectConfigurator extends AbstractProjectConfigurator {

    private static final IProjectFacet UTILITY_MODULE_FACET;
    private static final String VERSION_SUFFIX_1_0 = "1_0"; //$NON-NLS-1$
    private static final String VERSION_SUFFIX_1_1 = "1_1"; //$NON-NLS-1$
    private static final String LATEST_VERSION_SUFFIX = VERSION_SUFFIX_1_1;

    @Override
    public void configure(ProjectConfigurationRequest request, IProgressMonitor monitor) throws CoreException {
        IFacetedProject facetedProject = ProjectFacetsManager.create(request.getProject(), true, monitor);
        IFacetedProjectWorkingCopy ifpwc = facetedProject.createWorkingCopy();
        IPreset switchYardBasicPreset = getSwitchYardBasicPreset(ifpwc, request);
        if (switchYardBasicPreset == null) {
            return;
        }
        // add SwitchYard facets
        boolean modified = false;
        for (IProjectFacetVersion facet : switchYardBasicPreset.getProjectFacets()) {
            if (!ifpwc.hasProjectFacet(facet.getProjectFacet())) {
                ifpwc.addProjectFacet(facet);
                modified = true;
            } else if (!facet.getVersionString().equals(ifpwc.getProjectFacetVersion(facet.getProjectFacet()).getVersionString())) {
                // different version
                ifpwc.changeProjectFacetVersion(facet);
                modified = true;
            }
        }
        // make sure a JEE facet is installed
        if (UTILITY_MODULE_FACET != null && "jar".equals(request.getMavenProject().getPackaging()) //$NON-NLS-1$
                && !ifpwc.hasProjectFacet(UTILITY_MODULE_FACET)) {
            // add utility module facet
            ifpwc.addProjectFacet(UTILITY_MODULE_FACET.getDefaultVersion());
            modified = true;
        }
        if (modified) {
            final ResourceCleaner fileCleaner = new ResourceCleaner(request.getProject());
            try {
                final IMavenProjectFacade facade = request.getMavenProjectFacade();
                addFilesToClean(fileCleaner, facade.getResourceLocations());
                addFilesToClean(fileCleaner, facade.getCompileSourceLocations());
                ifpwc.commitChanges(monitor);
            } finally {
                // Remove any unwanted MANIFEST.MF the Facet installation has
                // created
                fileCleaner.cleanUp();
                // remove M2E classpath container
                WTPProjectsUtil.setNonDependencyAttributeToContainer(request.getProject(), new SubProgressMonitor(
                        monitor, 1));
            }
        }
    }

    protected void addFilesToClean(ResourceCleaner fileCleaner, IPath[] paths) {
        for (IPath resourceFolderPath : paths) {
            fileCleaner.addFiles(resourceFolderPath.append("META-INF/MANIFEST.MF")); //$NON-NLS-1$
        }
    }

    @Override
    public AbstractBuildParticipant getBuildParticipant(IMavenProjectFacade projectFacade, MojoExecution execution,
            IPluginExecutionMetadata executionMetadata) {
        return new SwitchYardBuildParticipant(execution);
    }

    private IPreset getSwitchYardBasicPreset(IFacetedProjectWorkingCopy ifpwc, ProjectConfigurationRequest request) {
        final String versionSuffix = getFacetVersionFromConfiguration(request);
        final String presetId = "preset.switchyard.basic." + versionSuffix; //$NON-NLS-1$
        for (IPreset preset : ifpwc.getAvailablePresets()) {
            if (presetId.equals(preset.getId())) {
                return preset;
            }
        }
        return null;
    }

    private String getFacetVersionFromConfiguration(ProjectConfigurationRequest request) {
        final IProject project = request.getProject();
        for (IPath resourceFolder : request.getMavenProjectFacade().getResourceLocations()) {
            IFile switchYardXML = project.getFile(resourceFolder.append("META-INF/switchyard.xml"));
            if (switchYardXML.exists()) {
                ResourceSet rs = new ResourceSetImpl();
                try {
                    // force the right content factory in case it gets changed elsewhere unexpectedly
                    rs.getResourceFactoryRegistry().getContentTypeToFactoryMap().
                        put(SwitchyardResourceFactoryImpl.CONTENT_TYPE, new SwitchyardResourceFactoryImpl());

                    XMLResource r = (XMLResource) rs.createResource(URI.createPlatformResourceURI(switchYardXML.getFullPath().toPortableString(), true), SwitchyardResourceFactoryImpl.CONTENT_TYPE);
                    try {
                        r.load(null);
                        NamespaceVersionConverter converter = (NamespaceVersionConverter) r.getDefaultLoadOptions().get(XMLResource.OPTION_EXTENDED_META_DATA);
                        return getFacetVersionSuffixVersionString(converter.getVersion());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
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
        }
        // try getting the version from the dependencies
        return getFacetVersionFromDependencies(request);
    }

    private String getFacetVersionFromDependencies(ProjectConfigurationRequest request) {
        for (Dependency dependency : request.getMavenProject().getDependencies()) {
            if ("org.switchyard".equals(dependency.getGroupId()) && dependency.getVersion() != null) { //$NON-NLS-1$
                try {
                    return getFacetVersionSuffixVersionString(dependency.getVersion());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return LATEST_VERSION_SUFFIX;
    }

    private String getFacetVersionSuffixVersionString(String version) {
        final String[] segments = version.split("\\.", 3); //$NON-NLS-1$
        final int majorVersion = Integer.valueOf(segments[0]);
        switch (majorVersion) {
        case 1:
            if (segments.length > 1) {
                final int minorVersion = Integer.valueOf(segments[1]);
                switch (minorVersion) {
                case 0:
                    return VERSION_SUFFIX_1_0;
                case 1:
                    return VERSION_SUFFIX_1_1;
                }
            }
        }
        // we either don't know or it's newer, so use the best we've got
        return LATEST_VERSION_SUFFIX;
    }

    @Override
    public boolean hasConfigurationChanged(IMavenProjectFacade newFacade,
            ILifecycleMappingConfiguration oldProjectConfiguration, MojoExecutionKey key, IProgressMonitor monitor) {
        // since we simply invoke the maven plugin directly, we don't need to
        // configure anything if the configuration changes
        return false;
    }

    static {
        if (ProjectFacetsManager.isProjectFacetDefined("jst.utility")) { //$NON-NLS-1$
            UTILITY_MODULE_FACET = ProjectFacetsManager.getProjectFacet("jst.utility"); //$NON-NLS-1$
        } else {
            UTILITY_MODULE_FACET = null;
        }
    }

}
