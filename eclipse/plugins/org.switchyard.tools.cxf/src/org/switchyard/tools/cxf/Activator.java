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
package org.switchyard.tools.cxf;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 */
public class Activator extends AbstractUIPlugin {

    /** The PLUGIN_ID. */
    public static final String PLUGIN_ID = "org.switchyard.tools.cxf"; //$NON-NLS-1$

    // The shared instance
    private static Activator plugin;

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
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance.
     * 
     * @return the shared instance
     */
    public static Activator getDefault() {
        return plugin;
    }

    /* package */static ClassLoader getProjectBuildClassLoader(IJavaProject javaProject) throws Exception {
        IProject project = javaProject.getProject();
        IWorkspaceRoot root = project.getWorkspace().getRoot();
        List<URL> urls = new ArrayList<URL>();
        urls.add(new File(project.getLocation() + "/" + javaProject.getOutputLocation().removeFirstSegments(1) + "/")
                .toURI().toURL());
        for (IClasspathEntry classpathEntry : javaProject.getResolvedClasspath(true)) {
            if (classpathEntry.getEntryKind() == IClasspathEntry.CPE_PROJECT) {
                IPath projectPath = classpathEntry.getPath();
                IProject otherProject = root.getProject(projectPath.segment(0));
                IJavaProject otherJavaProject = JavaCore.create(otherProject);
                urls.add(new File(otherProject.getLocation() + "/"
                        + otherJavaProject.getOutputLocation().removeFirstSegments(1) + "/").toURI().toURL());
            } else if (classpathEntry.getEntryKind() == IClasspathEntry.CPE_LIBRARY) {
                urls.add(new File(classpathEntry.getPath().toOSString()).toURI().toURL());
            }
        }
        return new URLClassLoader(urls.toArray(new URL[urls.size()]), Activator.class.getClassLoader());
    }

}
