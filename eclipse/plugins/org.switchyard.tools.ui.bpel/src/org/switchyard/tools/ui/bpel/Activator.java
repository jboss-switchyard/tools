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
package org.switchyard.tools.ui.bpel;

import javax.xml.namespace.QName;

import org.eclipse.bpel.ui.util.BPELUtil;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.switchyard.tools.ui.JavaUtil;

/**
 * The activator class controls the plug-in life cycle.
 */
public class Activator extends AbstractUIPlugin {

    /** The PLUGIN_ID. */
    public static final String PLUGIN_ID = "org.switchyard.tools.ui.bpel"; //$NON-NLS-1$

    /** The property key for retrieving the cached process name on a resource. */
    public static final QualifiedName PROCESS_NAME_PROPERTY = new QualifiedName(PLUGIN_ID, "bpelProcessName"); //$NON-NLS-1$

    private static final QName NULL_NAME = new QName("null:NULL", "null"); //$NON-NLS-1$ //$NON-NLS-2$

    // The shared instance
    private static Activator plugin;

    private IResourceChangeListener _resourceListener = new IResourceChangeListener() {

        @Override
        public void resourceChanged(IResourceChangeEvent event) {
            clearRelated(event.getDelta());
        }
    };

    /**
     * The constructor.
     */
    public Activator() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
     * )
     */
    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
        ResourcesPlugin.getWorkspace().addResourceChangeListener(_resourceListener, IResourceChangeEvent.POST_CHANGE);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
     * )
     */
    @Override
    public void stop(BundleContext context) throws Exception {
        ResourcesPlugin.getWorkspace().removeResourceChangeListener(_resourceListener);
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the IFile that corresponds to the named BPEL process. This may
     * scan all *.bpel files in the root folder (e.g. src/main/resources) until
     * it finds the file containing the process.
     * 
     * @param project the project in which to look for the bpel
     * @param process the process
     * @return the corresponding workspace file
     */
    public IFile getFileForProcess(IProject project, QName process) {
        if (process == null || project == null || !project.isAccessible()) {
            return null;
        }
        // TODO: this should be more robust
        IContainer resourceRoot = (IContainer) JavaUtil.getFirstResourceRoot(JavaCore.create(project));
        if (resourceRoot == null) {
            return null;
        }
        try {
            // if more than one file has the same process name, we'll take
            // the first member
            for (IResource resource : resourceRoot.members()) {
                if (resource.getType() != IResource.FILE || !"bpel".equals(resource.getFileExtension())) { //$NON-NLS-1$
                    // it's not a file
                    // it's not a bpel file
                    continue;
                }
                QName processName = (QName) resource.getSessionProperty(PROCESS_NAME_PROPERTY);
                if (processName == null) {
                    processName = loadProcessName((IFile) resource);
                    resource.setSessionProperty(PROCESS_NAME_PROPERTY, processName);
                }
                if (processName.equals(process)) {
                    return (IFile) resource;
                }
            }
        } catch (Exception e) {
            e.fillInStackTrace();
        }
        return null;
    }

    /**
     * Returns the process name that corresponds to the file. This may load the
     * specified file.
     * 
     * @param file the bpel file
     * @return the process name
     */
    public QName getProcessForFile(IFile file) {
        if (file == null || !file.isAccessible()) {
            return null;
        }
        try {
            QName name = (QName) file.getSessionProperty(PROCESS_NAME_PROPERTY);
            if (name == null) {
                name = loadProcessName(file);
                file.setSessionProperty(PROCESS_NAME_PROPERTY, name);
            }
            return name == NULL_NAME ? null : name;
        } catch (Exception e) {
            e.fillInStackTrace();
        }
        return null;
    }

    /**
     * Returns the shared instance.
     * 
     * @return the shared instance
     */
    public static Activator getDefault() {
        return plugin;
    }

    /**
     * Log the error.
     * 
     * @param e the exception to be logged
     */
    public static void logError(Exception e) {
        getDefault().getLog().log(createStatus(e));
    }

    /**
     * @param e the exception to be put in the status
     * @return
     */
    private static Status createStatus(Exception e) {
        return new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
    }

    private void clearRelated(IResourceDelta delta) {
        final IResource resource = delta.getResource();
        if (resource.getType() == IResource.FILE) {
            if ("bpel".equals(resource.getFileExtension()) //$NON-NLS-1$
                    && (delta.getFlags() & IResourceDelta.CONTENT) == IResourceDelta.CONTENT) {
                try {
                    resource.setSessionProperty(PROCESS_NAME_PROPERTY, null);
                } catch (Exception e) {
                    e.fillInStackTrace();
                }
            }
        } else if (resource.getType() == IResource.PROJECT) {
            final IContainer rootContainer = (IContainer) JavaUtil.getFirstResourceRoot(JavaCore
                    .create((IProject) resource));
            if (rootContainer == null) {
                return;
            }
            final IResourceDelta containerDelta = delta.findMember(rootContainer.getProjectRelativePath());
            for (IResourceDelta memberDelta : containerDelta.getAffectedChildren()) {
                clearRelated(memberDelta);
            }
        }
    }

    private QName loadProcessName(IFile file) {
        try {
            final org.eclipse.bpel.model.Process process = BPELUtil.getProcess(file, BPELUtil.createResourceSetImpl());
            try {
                final String name = process.getName();
                final String fileName = file.getName();
                return name == null ? NULL_NAME : new QName(process.getTargetNamespace(), process.getName(), fileName
                        .substring(0, 1).toLowerCase() + fileName.substring(1, fileName.lastIndexOf('.')));
            } finally {
                process.eResource().unload();
            }
        } catch (Exception e) {
            return null;
        }
    }
}
