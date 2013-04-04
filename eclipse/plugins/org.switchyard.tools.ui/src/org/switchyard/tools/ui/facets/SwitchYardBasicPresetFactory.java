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
        // JBIDE-13929, m2 installation will fail if jst.seam is missing
        if (ProjectFacetsManager.isProjectFacetDefined(JBOSS_M2_FACET_ID)
                && ProjectFacetsManager.isProjectFacetDefined("jst.seam")) {
            facets.add(ProjectFacetsManager.getProjectFacet(JBOSS_M2_FACET_ID).getDefaultVersion());
        }

        return new PresetDefinition("Basic SwitchYard Application",
                "Basic project facet set for SwitchYard applications.", facets);
    }

}
