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

import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.wst.common.componentcore.datamodel.FacetInstallDataModelProvider;
import org.eclipse.wst.common.project.facet.core.IFacetedProjectWorkingCopy;
import org.sonatype.aether.util.version.GenericVersionScheme;
import org.sonatype.aether.version.Version;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.M2EUtils;

/**
 * SwitchYardFacetInstallConfigFactory
 * 
 * Creates configuration object used when installing the SwitchYard facet.
 * 
 * @author Rob Cernich
 */
public class SwitchYardFacetInstallConfigFactory extends FacetInstallDataModelProvider implements
        ISwitchYardFacetConstants {

    @SuppressWarnings({"rawtypes", "unchecked" })
    @Override
    public Set getPropertyNames() {
        Set names = super.getPropertyNames();
        names.add(RUNTIME_PROVIDED);
        names.add(RUNTIME_VERSION);
        return names;
    }

    @Override
    public Object getDefaultProperty(String propertyName) {
        if (FACET_ID.equals(propertyName)) {
            return SWITCHYARD_FACET_ID;
        } else if (RUNTIME_PROVIDED.equals(propertyName)) {
            return true;
        } else if (RUNTIME_VERSION.equals(propertyName)) {
            IFacetedProjectWorkingCopy ifpwc = (IFacetedProjectWorkingCopy) getProperty(FACETED_PROJECT_WORKING_COPY);
            if (ifpwc == null || !ifpwc.getProject().exists()) {
                return null;
            }
            String versionString = M2EUtils.getSwitchYardVersion(ifpwc.getProject());
            if (versionString == null || versionString.length() == 0) {
                return null;
            }
            try {
                return new GenericVersionScheme().parseVersion(versionString);
            } catch (Exception e) {
                return null;
            }
        }
        return super.getDefaultProperty(propertyName);
    }

    @Override
    public boolean propertySet(String propertyName, Object propertyValue) {
        if (RUNTIME_PROVIDED.equals(propertyName)) {
            return true;
        } else if (RUNTIME_VERSION.equals(propertyName)) {
            return true;
        }
        return super.propertySet(propertyName, propertyValue);
    }

    @Override
    public IStatus validate(String name) {
        if (RUNTIME_PROVIDED.equals(name)) {
            return Status.OK_STATUS;
        } else if (RUNTIME_VERSION.equals(name)) {
            Object version = getProperty(RUNTIME_VERSION);
            if (version instanceof Version) {
                return Status.OK_STATUS;
            }
            return new Status(Status.ERROR, Activator.PLUGIN_ID, "Must specify SwitchYard runtime version.");
        }
        return super.validate(name);
    }

}
