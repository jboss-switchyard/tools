/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.bpel;

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdapterFactory;
import org.open.oasis.docs.ns.opencsa.sca.bpel.BPELImplementation;
import org.switchyard.tools.ui.PlatformResourceAdapterFactory;

/**
 * BPELResourceAdapterFactory
 * 
 * <p/>
 * Adapter factory for converting SwitchYard types to IResource.
 * 
 * @author Rob Cernich
 */
@SuppressWarnings({"rawtypes", "unchecked" })
public class BPELResourceAdapterFactory implements IAdapterFactory {

    private static final Class[] ADAPTER_LIST = new Class[] {IResource.class, IFile.class };

    @Override
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        if (!adapterType.isAssignableFrom(IFile.class)) {
            return null;
        }
        IProject project = PlatformResourceAdapterFactory.getContainingProject(adaptableObject);
        if (project == null) {
            return null;
        }
        return getFileForObject(adaptableObject, project);
    }

    /**
     * @param adaptableObject the object to be adapted to a file.
     * @param project the containing project.
     * @return the file, if it can be resolved.
     */
    public static IFile getFileForObject(Object adaptableObject, IProject project) {
        if (!(adaptableObject instanceof BPELImplementation)) {
            return null;
        }
        final BPELImplementation impl = (BPELImplementation) adaptableObject;
        final QName processName = impl.getProcess();
        return Activator.getDefault().getFileForProcess(project, processName);
    }

    @Override
    public Class[] getAdapterList() {
        return ADAPTER_LIST;
    }

}
