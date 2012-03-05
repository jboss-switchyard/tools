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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.wst.common.project.facet.core.IDelegate;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;

/**
 * SwitchYardFacetUnInstallActionDelegate
 * 
 * Processes the removal of the SwitchYard facet.
 * 
 * @author Rob Cernich
 */
public class SwitchYardFacetUnInstallActionDelegate implements IDelegate {

    /**
     * Create a new SwitchYardFacetUnInstallActionDelegate.
     * 
     */
    public SwitchYardFacetUnInstallActionDelegate() {
    }

    @Override
    public void execute(IProject project, IProjectFacetVersion fv, Object config, IProgressMonitor monitor)
            throws CoreException {
        // we just leave the pom as-is
    }

}
