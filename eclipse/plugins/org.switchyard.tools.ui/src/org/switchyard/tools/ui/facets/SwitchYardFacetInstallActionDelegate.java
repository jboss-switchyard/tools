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
package org.switchyard.tools.ui.facets;

import java.util.Collection;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.m2e.wtp.WTPProjectsUtil;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetDataModelProperties;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.project.facet.core.IDelegate;
import org.eclipse.wst.common.project.facet.core.IFacetedProjectWorkingCopy;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;
import org.sonatype.aether.version.Version;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.common.ISwitchYardComponentExtension;
import org.switchyard.tools.ui.common.ISwitchYardProject;
import org.switchyard.tools.ui.common.ISwitchYardProjectWorkingCopy;
import org.switchyard.tools.ui.common.impl.SwitchYardProjectManager;
import org.switchyard.tools.ui.operations.AbstractSwitchYardProjectOperation;

/**
 * SwitchYardFacetInstallActionDelegate
 * 
 * Add SwitchYard specific details to project.
 * 
 * @author Rob Cernich
 */
@SuppressWarnings("restriction")
public class SwitchYardFacetInstallActionDelegate implements IDelegate {

    @Override
    @SuppressWarnings("unchecked")
    public void execute(final IProject project, IProjectFacetVersion fv, Object config, IProgressMonitor monitor)
            throws CoreException {
        IDataModel dataModel = (IDataModel) config;

        // TODO: get selected components
        final ISwitchYardProjectWorkingCopy workingCopy;
        ISwitchYardProject switchYardProject = (ISwitchYardProject) dataModel
                .getProperty(ISwitchYardFacetConstants.SWITCHYARD_PROJECT);
        if (switchYardProject == null) {
            IFacetedProjectWorkingCopy ifpwc = (IFacetedProjectWorkingCopy) dataModel
                    .getProperty(IFacetDataModelProperties.FACETED_PROJECT_WORKING_COPY);
            if (ifpwc != null) {
                switchYardProject = SwitchYardProjectManager.instance().getSwitchYardProject(ifpwc.getProject());
            }
        }
        if (switchYardProject == null) {
            throw new CoreException(
                    new Status(
                            Status.ERROR,
                            Activator.PLUGIN_ID,
                            "Could not resolve SwitchYard project.  SwitchYard facet installation is incomplete.  Project POM has not been updated."));
        }

        Object versionObject = dataModel.getProperty(ISwitchYardFacetConstants.RUNTIME_VERSION);
        String versionString = versionObject instanceof Version ? ((Version) versionObject).toString() : null;

        workingCopy = switchYardProject.createWorkingCopy();
        workingCopy.setRuntimeVersion(versionString);
        workingCopy.addComponents((Collection<ISwitchYardComponentExtension>) dataModel
                .getProperty(ISwitchYardFacetConstants.RUNTIME_COMPONENTS));

        // make sure the sy stuff is in the pom
        new AbstractSwitchYardProjectOperation(workingCopy, false, "Installing SwitchYard Facet", null) {
            @Override
            protected void execute(IProgressMonitor monitor) throws CoreException {
                // make sure test folders get removed, save initiating a maven
                // project update
                WTPProjectsUtil.removeTestFolderLinks(getProject(), workingCopy.getMavenProject(), monitor, "/");
            }

            @Override
            protected IProject getProject() {
                return project;
            }

        }.run(monitor);
    }
}
