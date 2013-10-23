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

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.switchyard.common.type.Classes;
import org.switchyard.component.bean.config.model.BeanComponentImplementationModel;
import org.switchyard.component.bpm.config.model.BPMComponentImplementationModel;
import org.switchyard.component.camel.model.CamelComponentImplementationModel;
import org.switchyard.component.clojure.config.model.ClojureComponentImplementationModel;
import org.switchyard.component.rules.config.model.RulesComponentImplementationModel;
import org.switchyard.config.model.composite.ComponentImplementationModel;
import org.switchyard.config.model.composite.InterfaceModel;
import org.switchyard.config.model.implementation.bpel.BPELComponentImplementationModel;
import org.switchyard.extensions.java.JavaService;
import org.switchyard.extensions.wsdl.WSDLService;
import org.switchyard.metadata.InOnlyOperation;
import org.switchyard.metadata.InOnlyService;
import org.switchyard.metadata.InOutOperation;
import org.switchyard.metadata.InOutService;
import org.switchyard.metadata.ServiceInterface;
import org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.ui.common.ISwitchYardProject;
import org.switchyard.tools.ui.common.impl.SwitchYardProjectManager;
import org.switchyard.tools.ui.i18n.Messages;

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
    public static SwitchYardType createSwitchYardModel(String name, String targetNamespace) {
        SwitchYardType switchYardModel = SwitchyardFactory.eINSTANCE.createSwitchYardType();
        switchYardModel.setName(name);
        switchYardModel.setTargetNamespace(targetNamespace);
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
        return "urn:" + groupId + ":" + artifactId + ":" + version; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
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
            if (bpmIm.getManifest() == null || bpmIm.getManifest().getResources() == null
                    || bpmIm.getManifest().getResources().getResources() == null
                    || bpmIm.getManifest().getResources().getResources().size() != 1) {
                return null;
            }
            return getJavaResource(project, bpmIm.getManifest().getResources().getResources().get(0).getLocation());
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
            if (rulesIm.getManifest() == null || rulesIm.getManifest().getResources() == null
                    || rulesIm.getManifest().getResources().getResources() == null
                    || rulesIm.getManifest().getResources().getResources().size() != 1) {
                return null;
            }
            return getJavaResource(project, rulesIm.getManifest().getResources().getResources().get(0).getLocation());
        }
        return null;
    }

    /**
     * Return the corresponding resource for the specified type.
     * 
     * @param project the project containing the type (or type reference)
     * @param type the type
     * @return the corresponding resource
     */
    public static IResource getJavaType(IProject project, String type) {
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

    /**
     * Return the corresponding resource for the resource path.
     * 
     * @param project the project containing the resource (or reference)
     * @param resourcePath the location relative to the project's classpath
     * @return the corresponding resource.
     */
    public static IResource getJavaResource(IProject project, String resourcePath) {
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

    /**
     * Returns the ServiceInterface declared by the Interface type. Uses thread
     * class loader to resolve the Java type or WSDL file. The caller is
     * responsible for setting up the thread context classloader so the types
     * may be resolved correctly.
     * 
     * @param intf the service interface.
     * 
     * @return the resulting ServiceInterface.
     * 
     * @throws Exception if something goes wrong or the Interface type is not
     *             supported.
     */
    public static ServiceInterface getServiceInterface(Interface intf) throws Exception {
        if (intf instanceof JavaInterface) {
            JavaInterface javaIntfc = (JavaInterface) intf;
            return JavaService.fromClass(Classes.forName(javaIntfc.getInterface()));
        } else if (intf instanceof WSDLPortType) {
            WSDLPortType wsdlIntfc = (WSDLPortType) intf;
            return WSDLService.fromWSDL(wsdlIntfc.getInterface());
        } else if (intf instanceof EsbInterface) {
            EsbInterface esbIntfc = (EsbInterface) intf;
            if (esbIntfc.getOutputType() == null) {
                return new InOnlyService(new InOnlyOperation(ServiceInterface.DEFAULT_OPERATION, QName.valueOf(
                        esbIntfc.getInputType())));
            } else {
                return new InOutService(new InOutOperation(ServiceInterface.DEFAULT_OPERATION, QName.valueOf(
                        esbIntfc.getInputType()), QName.valueOf(esbIntfc.getOutputType()),
                        esbIntfc.getFaultType() == null ? null : QName.valueOf(esbIntfc.getFaultType())));
            }
        }
        throw new IllegalArgumentException(Messages.SwitchYardModelUtils_InterfaceTypeUnsupportedException
                + (intf == null ? "null" : intf.eClass().getInstanceTypeName())); //$NON-NLS-1$

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
