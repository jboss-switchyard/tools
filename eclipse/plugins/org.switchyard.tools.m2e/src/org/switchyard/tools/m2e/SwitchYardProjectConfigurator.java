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
package org.switchyard.tools.m2e;

import org.apache.maven.plugin.MojoExecution;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.m2e.core.lifecyclemapping.model.IPluginExecutionMetadata;
import org.eclipse.m2e.core.project.IMavenProjectFacade;
import org.eclipse.m2e.core.project.configurator.AbstractBuildParticipant;
import org.eclipse.m2e.core.project.configurator.AbstractProjectConfigurator;
import org.eclipse.m2e.core.project.configurator.ProjectConfigurationRequest;
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
            ifpwc.commitChanges(monitor);
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

    static {
        if (ProjectFacetsManager.isProjectFacetDefined("jst.utility")) {
            UTILITY_MODULE_FACET = ProjectFacetsManager.getProjectFacet("jst.utility");
        } else {
            UTILITY_MODULE_FACET = null;
        }
    }

}
