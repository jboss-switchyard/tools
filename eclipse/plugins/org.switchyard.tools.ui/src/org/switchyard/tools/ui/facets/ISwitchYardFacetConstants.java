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

import org.eclipse.wst.common.project.facet.core.IProjectFacet;
import org.eclipse.wst.common.project.facet.core.ProjectFacetsManager;

/**
 * ISwitchYardFacetConstants
 * 
 * Constants used within the SwitchYard project facet extension.
 * 
 * @author Rob Cernich
 */
public interface ISwitchYardFacetConstants {

    /**
     * Property ID used to indicate whether or not the runtime supplies the
     * SwitchYard dependencies.
     */
    public static final String RUNTIME_PROVIDED = "SwitchYard.RUNTIME_PROVIDED";
    /** Property ID used to indicate the desired SwitchYard runtime version. */
    public static final String RUNTIME_VERSION = "SwitchYard.RUNTIME_VERSION";
    /** Property ID used to indicate the desired SwitchYard components. */
    public static final String RUNTIME_COMPONENTS = "SwitchYard.RUNTIME_COMPONENTS";
    /** Property ID used to indicate the ISwitchYardProject instance. */
    public static final String SWITCHYARD_PROJECT = "SwitchYard.SWITCHYARD_PROJECT";

    /** The ID of the SwitchYard facet. */
    public static final String SWITCHYARD_FACET_ID = "switchyard.core";

    /** The ID of the basic SwitchYard facet set. */
    public static final String SWITCHYARD_BASIC_PRESET_ID = "preset.switchyard.basic";
    /** The ID of the JAR SwitchYard facet set. */
    public static final String SWITCHYARD_JAR_PRESET_ID = "preset.switchyard.jar";

    /** The ID of the framework default facet set. */
    public static final String DEFAULT_PRESET_ID = "default.configuration";
    /** The ID of the Java facet. */
    public static final String JAVA_FACET_ID = "java";
    /** Our preferred version of Java. */
    public static final String JAVA_FACET_VERSION = "1.6";
    /** The ID of the JBoss Maven Integration facet. */
    public static final String JBOSS_M2_FACET_ID = "jboss.m2";

    /** The SwitchYard facet. */
    public static final IProjectFacet SWITCHYARD_FACET = ProjectFacetsManager.getProjectFacet(SWITCHYARD_FACET_ID);
}
