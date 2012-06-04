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
package org.switchyard.tools.ui.editor.util;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.project.IMavenProjectFacade;

/**
 * JavaUtil
 * 
 * <p/>
 * Common functionality for working with Java projects.
 * 
 * @author Rob Cernich
 */
public final class JavaUtil {

    /**
     * Returns a Java element that may be used to initialize new class/type
     * wizards. If the resource is a Java file, its corresponding IJavaElement
     * will be returned. Other resources will return the first non-empty package
     * in the project's first source folder.
     * 
     * @param resource the initial resource.
     * 
     * @return a suitable initial Java element; may be null.
     */
    public static final IJavaElement getInitialJavaElementForResource(IResource resource) {
        if (resource == null) {
            return null;
        }
        if (resource.getType() == IResource.ROOT) {
            return null;
        }
        IJavaElement element = JavaCore.create(resource);
        if (element == null) {
            element = JavaCore.create(resource.getProject());
        }
        if (element == null) {
            return null;
        }

        if (element.getElementType() == IJavaElement.JAVA_PROJECT) {
            element = getInitialPackageForProject((IJavaProject) element);
        }
        return element;
    }

    /**
     * Returns the first non-empty package in the project's first source folder.
     * 
     * @param project the Java project
     * 
     * @return the first non-empty package; may be null.
     */
    public static IJavaElement getInitialPackageForProject(IJavaProject project) {
        if (project == null) {
            return null;
        }
        try {
            IPackageFragmentRoot sourceRoot = getFirstJavaSourceRoot(project);
            if (sourceRoot == null) {
                return project;
            }
            IJavaElement[] packages = sourceRoot.getChildren();
            IJavaElement element = sourceRoot;
            for (int i = 0; i < packages.length; i++) {
                IPackageFragment frag = (IPackageFragment) packages[i];
                element = frag;
                if (!frag.isDefaultPackage() && (!frag.hasSubpackages() || frag.containsJavaResources())) {
                    element = frag;
                    break;
                }
            }
            return element;
        } catch (JavaModelException e) {
            return project;
        }
    }

    /**
     * Returns the first source folder in the project. If the project is a maven
     * project, the first source folder configured will be used.
     * 
     * @param project the Java project
     * 
     * @return the source root; may be null.
     */
    public static IPackageFragmentRoot getFirstJavaSourceRoot(IJavaProject project) {
        if (project == null) {
            return null;
        }
        try {
            IPackageFragmentRoot sourceRoot = null;
            IMavenProjectFacade facade = MavenPlugin.getMavenProjectRegistry().getProject(project.getProject());
            if (facade == null) {
                for (IPackageFragmentRoot frag : project.getPackageFragmentRoots()) {
                    if (frag.getKind() == IPackageFragmentRoot.K_SOURCE) {
                        sourceRoot = frag;
                        break;
                    }
                }
            } else {
                IPath projectPath = project.getPath();
                for (IPath sourcePath : facade.getCompileSourceLocations()) {
                    IPackageFragmentRoot frag = project.findPackageFragmentRoot(projectPath.append(sourcePath));
                    if (frag != null) {
                        sourceRoot = frag;
                        break;
                    }
                }
            }
            return sourceRoot;
        } catch (JavaModelException e) {
            return null;
        }
    }

    /**
     * Returns the first resource folder in the project. If the project is a
     * maven project, the first resource folder configured will be used.
     * 
     * @param project the Java project
     * 
     * @return the resource root; may be null.
     */
    public static IResource getFirstResourceRoot(IJavaProject project) {
        if (project == null) {
            return null;
        }
        try {
            IResource sourceRoot = null;
            IMavenProjectFacade facade = MavenPlugin.getMavenProjectRegistry().getProject(project.getProject());
            if (facade == null) {
                for (IPackageFragmentRoot frag : project.getPackageFragmentRoots()) {
                    if (frag.getKind() == IPackageFragmentRoot.K_SOURCE) {
                        sourceRoot = frag.getUnderlyingResource();
                        break;
                    }
                }
            } else {
                IProject projectResource = project.getProject();
                for (IPath sourcePath : facade.getResourceLocations()) {
                    sourceRoot = projectResource.findMember(sourcePath);
                    if (sourceRoot != null) {
                        break;
                    }
                }
            }
            return sourceRoot;
        } catch (JavaModelException e) {
            return null;
        }
    }

    /**
     * Returns the resource path relative to its containing
     * IPackageFragmentRoot. If the resource is not located within a Java source
     * directory, the project name is stripped from the path.
     * 
     * @param resource the resource.
     * 
     * @return the relative path.
     */
    public static IPath getJavaPathForResource(final IResource resource) {
        if (resource == null || resource.getType() == IResource.PROJECT || resource.getType() == IResource.ROOT) {
            return null;
        }
        IJavaProject project = JavaCore.create(resource.getProject());
        if (project == null) {
            // just remove the project segment.
            return resource.getFullPath().removeFirstSegments(1);
        }
        IResource container = resource;
        if (container.getType() == IResource.FILE) {
            container = container.getParent();
        }
        IJavaElement element = null;
        for (; element == null && container != null; container = container.getParent()) {
            element = JavaCore.create(container, project);
        }
        if (element == null) {
            return resource.getFullPath().removeFirstSegments(1);
        } else if (element.getElementType() == IJavaElement.PACKAGE_FRAGMENT) {
            return resource.getFullPath().makeRelativeTo(element.getParent().getPath());
        }
        return resource.getFullPath().makeRelativeTo(element.getPath());
    }

    /**
     * Create a new JavaUtil.
     */
    private JavaUtil() {
    }

}
