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

import org.apache.maven.plugin.MojoExecution;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
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

    @Override
    public void configure(ProjectConfigurationRequest request, IProgressMonitor monitor) throws CoreException {
        IFacetedProject facetedProject = ProjectFacetsManager.create(request.getProject(), true, monitor);
        IFacetedProjectWorkingCopy ifpwc = facetedProject.createWorkingCopy();
        IPreset switchYardBasicPreset = getSwitchYardBasicPreset(ifpwc);
        if (switchYardBasicPreset == null) {
            return;
        }
        // add SwitchYard facets
        boolean modified = false;
        for (IProjectFacetVersion facet : switchYardBasicPreset.getProjectFacets()) {
            if (!ifpwc.hasProjectFacet(facet.getProjectFacet())) {
                ifpwc.addProjectFacet(facet);
                modified = true;
            }
        }
        // make sure a JEE facet is installed
        if (UTILITY_MODULE_FACET != null && "jar".equals(request.getMavenProject().getPackaging())
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
            fileCleaner.addFiles(resourceFolderPath.append("META-INF/MANIFEST.MF"));
        }
    }

    @Override
    public AbstractBuildParticipant getBuildParticipant(IMavenProjectFacade projectFacade, MojoExecution execution,
            IPluginExecutionMetadata executionMetadata) {
        return new SwitchYardBuildParticipant(execution);
    }

    private IPreset getSwitchYardBasicPreset(IFacetedProjectWorkingCopy ifpwc) {
        for (IPreset preset : ifpwc.getAvailablePresets()) {
            if ("preset.switchyard.basic".equals(preset.getId())) {
                return preset;
            }
        }
        return null;
    }

    @Override
    public boolean hasConfigurationChanged(IMavenProjectFacade newFacade,
            ILifecycleMappingConfiguration oldProjectConfiguration, MojoExecutionKey key, IProgressMonitor monitor) {
        // since we simply invoke the maven plugin directly, we don't need to
        // configure anything if the configuration changes
        return false;
    }

    static {
        if (ProjectFacetsManager.isProjectFacetDefined("jst.utility")) {
            UTILITY_MODULE_FACET = ProjectFacetsManager.getProjectFacet("jst.utility");
        } else {
            UTILITY_MODULE_FACET = null;
        }
    }

}
