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
