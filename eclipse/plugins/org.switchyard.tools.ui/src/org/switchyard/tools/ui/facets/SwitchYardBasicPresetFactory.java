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

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.wst.common.project.facet.core.IDynamicPreset;
import org.eclipse.wst.common.project.facet.core.IPreset;
import org.eclipse.wst.common.project.facet.core.IPreset.Type;
import org.eclipse.wst.common.project.facet.core.IPresetFactory;
import org.eclipse.wst.common.project.facet.core.IProjectFacet;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;
import org.eclipse.wst.common.project.facet.core.PresetDefinition;
import org.eclipse.wst.common.project.facet.core.ProjectFacetsManager;

/**
 * SwitchYardBasicPresetFactory
 * 
 * Provides the basic facets required for a simple SwitchYard project:
 * switchyard.core, java, jboss.m2 (optional).
 * 
 * @author Rob Cernich
 */
public class SwitchYardBasicPresetFactory implements IPresetFactory, ISwitchYardFacetConstants {

    /**
     * Create a new SwitchYardBasicPresetFactory.
     */
    public SwitchYardBasicPresetFactory() {
    }

    @Override
    public PresetDefinition createPreset(String presetId, Map<String, Object> context) throws CoreException {
        Set<IProjectFacetVersion> facets = new HashSet<IProjectFacetVersion>();

        // default facets
        IPreset defaultPreset = ProjectFacetsManager.getPreset(DEFAULT_PRESET_ID);
        if (defaultPreset != null) {
            if (defaultPreset.getType() == Type.DYNAMIC) {
                ((IDynamicPreset) defaultPreset).resolve(context);
            }
            facets.addAll(defaultPreset.getProjectFacets());
        }

        // SwitchYard facet
        facets.add(ProjectFacetsManager.getProjectFacet(SWITCHYARD_FACET_ID).getDefaultVersion());

        // Java facet; prefer 1.6 or later
        IProjectFacet javaFacet = ProjectFacetsManager.getProjectFacet(JAVA_FACET_ID);
        IProjectFacetVersion javaFacetVersion = javaFacet.getVersion(JAVA_FACET_VERSION);
        if (javaFacetVersion == null) {
            javaFacetVersion = javaFacet.getLatestVersion();
        }
        facets.add(javaFacetVersion);

        // JBoss Maven Integration facet (if available)
        if (ProjectFacetsManager.isProjectFacetDefined(JBOSS_M2_FACET_ID)) {
            facets.add(ProjectFacetsManager.getProjectFacet(JBOSS_M2_FACET_ID).getDefaultVersion());
        }

        return new PresetDefinition("Basic SwitchYard Application",
                "Basic project facet set for SwitchYard applications.", facets);
    }

}
