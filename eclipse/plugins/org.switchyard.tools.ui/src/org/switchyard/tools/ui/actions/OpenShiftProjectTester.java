/*************************************************************************************
 * Copyright (c) 2013 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.actions;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.project.IMavenProjectFacade;

/**
 * Test to see if the IProject is an OpenShift project and 
 * configured to do war packaging.
 * @author bfitzpat
 *
 */
public class OpenShiftProjectTester extends PropertyTester {

    @Override
    public boolean test(Object arg0, String arg1, Object[] arg2, Object arg3) {
        IProject project = (IProject) arg0;
        IFolder openshiftFolder = project.getFolder(".openshift"); //$NON-NLS-1$
        if (openshiftFolder != null && openshiftFolder.exists()) {
            if (!isJarPackaging(project)) {
                return true;
            }
        }
        return false;
    }

    private boolean isJarPackaging(IProject project) {
        final IMavenProjectFacade mavenFacade = MavenPlugin.getMavenProjectRegistry().getProject(project);
        return mavenFacade == null || "jar".equals(mavenFacade.getPackaging()); //$NON-NLS-1$
    }

}
