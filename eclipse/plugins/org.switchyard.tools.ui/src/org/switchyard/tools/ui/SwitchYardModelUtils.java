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
package org.switchyard.tools.ui;

import java.net.URI;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.switchyard.component.bean.config.model.BeanComponentImplementationModel;
import org.switchyard.component.bpel.config.model.BPELComponentImplementationModel;
import org.switchyard.component.bpm.config.model.BPMComponentImplementationModel;
import org.switchyard.component.camel.config.model.CamelComponentImplementationModel;
import org.switchyard.component.clojure.config.model.ClojureComponentImplementationModel;
import org.switchyard.component.rules.config.model.RulesComponentImplementationModel;
import org.switchyard.config.model.composite.ComponentImplementationModel;
import org.switchyard.config.model.composite.InterfaceModel;
import org.switchyard.config.model.switchyard.SwitchYardModel;
import org.switchyard.config.model.switchyard.v1.V1SwitchYardModel;
import org.switchyard.tools.ui.common.ISwitchYardProject;
import org.switchyard.tools.ui.common.impl.SwitchYardProjectManager;

/**
 * SwitchYardModelUtils
 * 
 * Utility methods for working with SwitchYard models.
 * 
 * @author Rob Cernich
 */
public final class SwitchYardModelUtils {

    /**
     * Creates a new SwitchYardModel.
     * 
     * @param name the name of the application.
     * @param targetNamespace the application's targetNamespace.
     * @return a new SwitchYardModel.
     */
    public static SwitchYardModel createSwitchYardModel(String name, String targetNamespace) {
        SwitchYardModel switchYardModel = new V1SwitchYardModel();
        switchYardModel.setName(name);
        // switchYardModel.setTargetNamespace(_targetNamespace);
        switchYardModel.getModelConfiguration().setAttribute("targetNamespace", targetNamespace);
        return switchYardModel;
    }

    /**
     * Creates a targetNamespace in the form:
     * urn:&lt;groupId&gt;:&lt;artifactId&gt;:&lt;version&gt;.
     * 
     * @param groupId the groupId.
     * @param artifactId the artifactId.
     * @param version the version.
     * @return the targetNamespace.
     */
    public static String createTargetnamespace(String groupId, String artifactId, String version) {
        return "urn:" + groupId + ":" + artifactId + ":" + version;
    }

    /**
     * Returns the workspace file associated with an interface definition. This
     * method scans the build classpath for the project (i.e. the referenced
     * resource must be on the build path).
     * 
     * @param project the containing project.
     * @param im the interface model
     * 
     * @return the associated resource; null if the resource could not be
     *         located.
     */
    public static IResource getAssociatedResource(IProject project, InterfaceModel im) {
        if (im == null) {
            return null;
        }

        IJavaProject jp = JavaCore.create(project);
        if (jp == null) {
            return null;
        }

        if (InterfaceModel.JAVA.equals(im.getType())) {
            return getJavaType(project, im.getInterface());
        } else if (InterfaceModel.WSDL.equals(im.getType())) {
            return getJavaResource(project, im.getInterface());
        }
        return null;
    }

    /**
     * Returns the workspace file associated with an implementation definition.
     * This method scans the build classpath for the project (i.e. the
     * referenced resource must be on the build path).
     * 
     * @param project the containing project.
     * @param im the component implementation model
     * @return the associated resource; null if the resource could not be
     *         located.
     */
    public static IResource getAssociatedResource(IProject project, ComponentImplementationModel im) {
        if (im == null) {
            return null;
        }

        if (im instanceof BeanComponentImplementationModel) {
            return getJavaType(project, ((BeanComponentImplementationModel) im).getClazz());
        } else if (im instanceof BPELComponentImplementationModel) {
            return getJavaResource(project, ((BPELComponentImplementationModel) im).getProcess());
        } else if (im instanceof BPMComponentImplementationModel) {
            BPMComponentImplementationModel bpmIm = (BPMComponentImplementationModel) im;
            if (bpmIm.getProcessDefinition() == null) {
                return null;
            }
            return getJavaResource(project, bpmIm.getProcessDefinition().getLocation());
        } else if (im instanceof CamelComponentImplementationModel) {
            CamelComponentImplementationModel camelIm = (CamelComponentImplementationModel) im;
            if (camelIm.getJavaClass() == null || camelIm.getJavaClass().length() == 0) {
                return getSwitchYardConfigurationFile(project);
            }
            return getJavaType(project, camelIm.getJavaClass());
        } else if (im instanceof ClojureComponentImplementationModel) {
            ClojureComponentImplementationModel clojureIm = (ClojureComponentImplementationModel) im;
            if (clojureIm.getScriptFile() == null || clojureIm.getScriptFile().length() == 0) {
                return getSwitchYardConfigurationFile(project);
            }
            return getJavaResource(project, clojureIm.getScriptFile());
        } else if (im instanceof RulesComponentImplementationModel) {
            RulesComponentImplementationModel rulesIm = (RulesComponentImplementationModel) im;
            if (rulesIm.getResources() == null || rulesIm.getResources().size() != 1) {
                return null;
            }
            return getJavaResource(project, rulesIm.getResources().get(0).getLocation());
        }
        return null;
    }

    private static IResource getJavaType(IProject project, String type) {
        if (project == null || type == null || type.length() == 0) {
            return null;
        }

        IJavaProject jp = JavaCore.create(project);
        if (jp == null) {
            return null;
        }

        try {
            IType it = jp.findType(type);
            if (it == null) {
                return null;
            }
            return it.getUnderlyingResource();
        } catch (JavaModelException e) {
            return null;
        }
    }

    private static IResource getJavaResource(IProject project, String resourcePath) {
        if (project == null || resourcePath == null || resourcePath.length() == 0) {
            return null;
        }

        IJavaProject jp = JavaCore.create(project);
        if (jp == null) {
            return null;
        }
        resourcePath = URI.create(resourcePath).getPath();
        try {
            for (IPackageFragmentRoot pfr : jp.getAllPackageFragmentRoots()) {
                if (pfr.isArchive() || pfr.isExternal()) {
                    continue;
                }
                final IPath path = pfr.getPath().append(resourcePath);
                IFile file = project.getWorkspace().getRoot().getFile(path);
                if (file.exists()) {
                    return file;
                }
            }
        } catch (JavaModelException e) {
            return null;
        }
        return null;
    }

    private static IFile getSwitchYardConfigurationFile(IProject project) {
        ISwitchYardProject switchYardProject = SwitchYardProjectManager.instance().getSwitchYardProject(project);
        if (switchYardProject == null) {
            return null;
        }
        return switchYardProject.getSwitchYardConfigurationFile();
    }

    private SwitchYardModelUtils() {
    }

}
