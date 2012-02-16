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
package org.switchyard.tools.ui.facets;

import java.util.Collection;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
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
import org.switchyard.tools.ui.common.impl.SwitchYardProject;
import org.switchyard.tools.ui.operations.AbstractSwitchYardProjectOperation;

/**
 * SwitchYardFacetInstallActionDelegate
 * 
 * Add SwitchYard specific details to project.
 * 
 * @author Rob Cernich
 */
public class SwitchYardFacetInstallActionDelegate implements IDelegate {

    @Override
    @SuppressWarnings("unchecked")
    public void execute(final IProject project, IProjectFacetVersion fv, Object config, IProgressMonitor monitor)
            throws CoreException {
        IDataModel dataModel = (IDataModel) config;

        // TODO: get selected components
        ISwitchYardProjectWorkingCopy workingCopy;
        ISwitchYardProject switchYardProject = (ISwitchYardProject) dataModel
                .getProperty(ISwitchYardFacetConstants.SWITCHYARD_PROJECT);
        if (switchYardProject == null) {
            IFacetedProjectWorkingCopy ifpwc = (IFacetedProjectWorkingCopy) dataModel
                    .getProperty(IFacetDataModelProperties.FACETED_PROJECT_WORKING_COPY);
            if (ifpwc != null) {
                switchYardProject = new SwitchYardProject(ifpwc.getProject());
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
                // nothing extra
            }

            @Override
            protected IProject getProject() {
                return project;
            }

        }.run(monitor);
    }
}
