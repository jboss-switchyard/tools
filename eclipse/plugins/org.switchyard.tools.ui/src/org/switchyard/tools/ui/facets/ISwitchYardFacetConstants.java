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
    public static final String RUNTIME_PROVIDED = "SwitchYard.RUNTIME_PROVIDED"; //$NON-NLS-1$
    /** Property ID used to indicate the desired SwitchYard runtime version. */
    public static final String RUNTIME_VERSION = "SwitchYard.RUNTIME_VERSION"; //$NON-NLS-1$
    /** Property ID used to indicate the desired SwitchYard components. */
    public static final String RUNTIME_COMPONENTS = "SwitchYard.RUNTIME_COMPONENTS"; //$NON-NLS-1$
    /** Property ID used to indicate the desired SwitchYard target runtime. */
    public static final String RUNTIME_TARGET = "SwitchYard.RUNTIME_TARGET"; //$NON-NLS-1$
    /** Property ID used to indicate the ISwitchYardProject instance. */
    public static final String SWITCHYARD_PROJECT = "SwitchYard.SWITCHYARD_PROJECT"; //$NON-NLS-1$

    /** The ID of the SwitchYard facet. */
    public static final String SWITCHYARD_FACET_ID = "switchyard.core"; //$NON-NLS-1$

    /** The ID of the basic SwitchYard 1.0 facet set. */
    public static final String SWITCHYARD_BASIC_1_0_PRESET_ID = "preset.switchyard.basic.1_0"; //$NON-NLS-1$
    /** The ID of the basic SwitchYard 1.1 facet set. */
    public static final String SWITCHYARD_BASIC_1_1_PRESET_ID = "preset.switchyard.basic.1_1"; //$NON-NLS-1$
    /** The ID of the basic SwitchYard 1.1 facet set. */
    public static final String SWITCHYARD_BASIC_2_0_PRESET_ID = "preset.switchyard.basic.2_0"; //$NON-NLS-1$
    /** The ID of the default basic SwitchYard facet set. */
    public static final String SWITCHYARD_BASIC_PRESET_ID = SWITCHYARD_BASIC_2_0_PRESET_ID;
    /** The ID of the JAR SwitchYard 1.0 facet set. */
    public static final String SWITCHYARD_JAR_1_0_PRESET_ID = "preset.switchyard.jar.1_0"; //$NON-NLS-1$
    /** The ID of the JAR SwitchYard 1.1 facet set. */
    public static final String SWITCHYARD_JAR_1_1_PRESET_ID = "preset.switchyard.jar.1_1"; //$NON-NLS-1$
    /** The ID of the JAR SwitchYard 1.1 facet set. */
    public static final String SWITCHYARD_JAR_2_0_PRESET_ID = "preset.switchyard.jar.2_0"; //$NON-NLS-1$
    /** The ID of the default JAR SwitchYard facet set. */
    public static final String SWITCHYARD_JAR_PRESET_ID = SWITCHYARD_JAR_2_0_PRESET_ID;

    /** The ID of the framework default facet set. */
    public static final String DEFAULT_PRESET_ID = "default.configuration"; //$NON-NLS-1$
    /** The ID of the Java facet. */
    public static final String JAVA_FACET_ID = "java"; //$NON-NLS-1$
    /** Our preferred version of Java. */
    public static final String JAVA_FACET_VERSION = "1.6"; //$NON-NLS-1$
    /** The ID of the JBoss Maven Integration facet. */
    public static final String JBOSS_M2_FACET_ID = "jboss.m2"; //$NON-NLS-1$

    /** The SwitchYard facet. */
    public static final IProjectFacet SWITCHYARD_FACET = ProjectFacetsManager.getProjectFacet(SWITCHYARD_FACET_ID);
    
    // runtime components
    /** The SwitchYard runtime component ID. */
    public static final String SWITCHYARD_RUNTIME_ID = "switchyard.runtime"; //$NON-NLS-1$
    /** The SwitchYard 1.0 runtime version. */
    public static final String SWITCHYARD_RUNTIME_VERSION_1_0 = "1.0"; //$NON-NLS-1$
    /** The SwitchYard 1.0 runtime version. */
    public static final String SWITCHYARD_RUNTIME_VERSION_1_1 = "1.1"; //$NON-NLS-1$
    /** The SwitchYard 2.0 runtime version. */
    public static final String SWITCHYARD_RUNTIME_VERSION_2_0 = "2.0"; //$NON-NLS-1$

    /** The SwitchYard FSW runtime component ID. */
    public static final String FSW_RUNTIME_ID = "fuseServiceWorks.runtime"; //$NON-NLS-1$
    /** The FSW 6.0 runtime version. */
    public static final String FSW_RUNTIME_VERSION_6_0 = "6.0"; //$NON-NLS-1$
    /** The FSW 6.1 runtime version. */
    public static final String FSW_RUNTIME_VERSION_6_1 = "6.1"; //$NON-NLS-1$

    /**
     * Key for retrieving SY runtime version (String) from runtime component
     * properties.
     */
    public static final String SWITCHYARD_RUNTIME_VERSION_KEY = "switchyard.version"; //$NON-NLS-1$
    /**
     * Key for retrieving SY runtime label (String) from runtime component
     * properties.
     */
    public static final String SWITCHYARD_RUNTIME_LABEL_KEY = "switchyard.label"; //$NON-NLS-1$

}
