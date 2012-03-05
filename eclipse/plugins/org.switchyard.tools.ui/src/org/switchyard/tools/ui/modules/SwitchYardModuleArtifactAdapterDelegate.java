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
package org.switchyard.tools.ui.modules;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.wst.server.core.IModule;
import org.eclipse.wst.server.core.IModuleArtifact;
import org.eclipse.wst.server.core.ServerUtil;
import org.eclipse.wst.server.core.model.ModuleArtifactAdapterDelegate;
import org.eclipse.wst.server.core.util.NullModuleArtifact;

/**
 * SwitchYardModuleArtifactAdapterDelegate
 * 
 * Adapter delegate used for adapting objects to IModuleArtifact. See extension
 * point documentation for org.eclipse.wst.server.core.moduleArtifactAdapters.
 * 
 * @author Rob Cernich
 */
public class SwitchYardModuleArtifactAdapterDelegate extends ModuleArtifactAdapterDelegate {

    /**
     * Create a new SwitchYardModuleArtifactAdapterDelegate.
     * 
     */
    public SwitchYardModuleArtifactAdapterDelegate() {
    }

    @Override
    public IModuleArtifact getModuleArtifact(Object obj) {
        IResource resource = null;
        if (obj instanceof IResource) {
            resource = (IResource) obj;
        } else if (obj instanceof IAdaptable) {
            resource = (IResource) ((IAdaptable) obj).getAdapter(IResource.class);
        }
        if (resource == null) {
            resource = (IResource) Platform.getAdapterManager().getAdapter(obj, IResource.class);
        }
        if (resource == null) {
            return null;
        }
        IModule module = ServerUtil.getModule(resource.getProject());
        if (module == null) {
            return null;
        }
        return new NullModuleArtifact(module);
    }

}
