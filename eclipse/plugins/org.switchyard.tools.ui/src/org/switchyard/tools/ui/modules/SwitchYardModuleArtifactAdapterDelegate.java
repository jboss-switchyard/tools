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
