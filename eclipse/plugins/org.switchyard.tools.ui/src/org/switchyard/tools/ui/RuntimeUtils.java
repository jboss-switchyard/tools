/*************************************************************************************
 * Copyright (c) 2016 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui;

import org.eclipse.jdt.launching.environments.IExecutionEnvironment;
import org.eclipse.wst.common.project.facet.core.runtime.IRuntime;
import org.eclipse.wst.server.core.internal.facets.FacetUtil;
import org.eclipse.wst.server.core.model.RuntimeDelegate;
import org.fusesource.ide.server.karaf.core.runtime.IKarafRuntime;
import org.jboss.ide.eclipse.as.core.server.IJBossServerRuntime;

/**
 * RuntimeUtils
 * 
 * Utility functionality for working with various IRuntime implementations.
 * 
 * @author bfitzpat
 */
@SuppressWarnings("restriction")
public final class RuntimeUtils {

    private static final String J2SE_LABEL = "J2SE"; //$NON-NLS-1$
    private static final String JAVASE_LABEL = "JavaSE"; //$NON-NLS-1$

    /**
     * Takes a org.eclipse.wst.common.project.facet.core.runtime.IRuntime and
     * adapts it to a org.eclipse.wst.server.core.IRuntime so that we can get
     * the Execution Environment information from it.
     * 
     * @param rt incoming facet-based runtime reference
     * @return null or String corresponding to a Java version
     */
    public static String getJavaExecutionEnvironment(IRuntime rt) {
        String javaVersion = null;

        // the incoming runtime reference is a facet-based reference and
        // we need to convert it to a WST core reference
        org.eclipse.wst.server.core.IRuntime ort = FacetUtil.getRuntime(rt);
        RuntimeDelegate rd = (RuntimeDelegate) ort.loadAdapter(RuntimeDelegate.class, null);

        // now we can get the execution environment from the Fuse or
        // JBoss-server
        IExecutionEnvironment ee = null;
        if (rd instanceof IKarafRuntime) {
            ee = ((IKarafRuntime) rd).getExecutionEnvironment();
        } else if (rd instanceof IJBossServerRuntime) {
            ee = ((IJBossServerRuntime) rd).getExecutionEnvironment();
        }
        if (ee != null) {

            // now, based on the ID of the execution environment
            String javaID = ee.getId();
            if (javaID != null && javaID.indexOf('-') > 0
                    && (javaID.startsWith(J2SE_LABEL) || javaID.startsWith(JAVASE_LABEL))) {

                // we can return the java version like 1.6, 1.7, 1.8
                javaVersion = javaID.substring(javaID.indexOf('-') + 1, javaID.length());
            }
        }

        // if we have a version, return it - otherwise send null
        return javaVersion;
    }

    private RuntimeUtils() {
        // private constructor
    }
}
