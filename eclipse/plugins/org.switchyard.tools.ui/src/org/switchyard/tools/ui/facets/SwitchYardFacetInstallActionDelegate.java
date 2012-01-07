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

import java.util.Arrays;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.project.facet.core.IDelegate;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;
import org.sonatype.aether.version.Version;
import org.switchyard.tools.ui.M2EUtils;
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
    public void execute(final IProject project, IProjectFacetVersion fv, Object config, IProgressMonitor monitor)
            throws CoreException {
        Object versionObject = config instanceof IDataModel ? ((IDataModel) config)
                .getProperty(ISwitchYardFacetConstants.RUNTIME_VERSION) : null;
        String versionString = versionObject instanceof Version ? ((Version) versionObject).toString() : null;
        // make sure the sy stuff is in the pom
        new AbstractSwitchYardProjectOperation(versionString, M2EUtils.DEFAULT_DEPENDENCIES,
                Arrays.asList(M2EUtils.DEFAULT_SCANNERS), false, "Installing SwitchYard Facet", null) {
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
