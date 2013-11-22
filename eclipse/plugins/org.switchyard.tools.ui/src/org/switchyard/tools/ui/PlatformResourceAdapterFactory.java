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
package org.switchyard.tools.ui;

import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.switchyard.tools.models.switchyard1_0.bean.BeanImplementationType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.models.switchyard1_0.clojure.ClojureImplementationType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType;
import org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType1;
import org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1;
import org.switchyard.tools.models.switchyard1_0.transform.XsltTransformType;

/**
 * PlatformResourceAdapterFactory
 * 
 * <p/>
 * Adapter factory for converting SwitchYard types to IResource.
 * 
 * @author Rob Cernich
 */
@SuppressWarnings({"rawtypes", "unchecked" })
public class PlatformResourceAdapterFactory implements IAdapterFactory {

    private static final Class[] ADAPTER_LIST = new Class[] {IResource.class, IFile.class };

    @Override
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        if (!adapterType.isAssignableFrom(IFile.class)) {
            return null;
        }
        if (adaptableObject instanceof Component) {
            final Component component = (Component) adaptableObject;
            return component.getImplementation() == null ? null : Platform.getAdapterManager().loadAdapter(
                    component.getImplementation(), adapterType.getCanonicalName());
        }
        IProject project = getContainingProject(adaptableObject);
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
        if (adaptableObject instanceof Implementation) {
            Implementation impl = (Implementation) adaptableObject;
            if (impl instanceof BeanImplementationType) {
                return (IFile) SwitchYardModelUtils.getJavaType(project, ((BeanImplementationType) impl).getClass_());
            } else if (impl instanceof BPMImplementationType) {
                org.switchyard.tools.models.switchyard1_0.bpm.ManifestType manifest = ((BPMImplementationType) impl)
                        .getManifest();
                if (manifest == null || manifest.getResources() == null) {
                    return null;
                }
                for (org.switchyard.tools.models.switchyard1_0.bpm.ResourceType resource : manifest.getResources()
                        .getResource()) {
                    // TODO: should we verify this is a bpmn2 file?
                    return (IFile) SwitchYardModelUtils.getJavaResource(project, resource.getLocation());
                }
                return null;
            } else if (impl instanceof RulesImplementationType) {
                org.switchyard.tools.models.switchyard1_0.rules.ManifestType manifest = ((RulesImplementationType) impl)
                        .getManifest();
                if (manifest == null || manifest.getResources() == null) {
                    return null;
                }
                for (org.switchyard.tools.models.switchyard1_0.rules.ResourceType resource : manifest.getResources()
                        .getResource()) {
                    // TODO: should we verify this is a drl file?
                    return (IFile) SwitchYardModelUtils.getJavaResource(project, resource.getLocation());
                }
                return null;
            } else if (impl instanceof CamelImplementationType) {
                CamelImplementationType camelImpl = (CamelImplementationType) impl;
                if (camelImpl.getJava() != null) {
                    return (IFile) SwitchYardModelUtils.getJavaType(project, camelImpl.getJava().getClass_());
                } else if (camelImpl.getXml() != null) {
                    return (IFile) SwitchYardModelUtils.getJavaResource(project, camelImpl.getXml().getPath());
                }
                return null;
            } else if (impl instanceof ClojureImplementationType) {
                return (IFile) SwitchYardModelUtils.getJavaResource(project,
                        ((ClojureImplementationType) impl).getScript());
            }
            return null;
        } else if (adaptableObject instanceof Service) {
            Service service = (Service) adaptableObject;
            if (service.getInterface() == null) {
                if (service.getPromote() == null) {
                    return null;
                }
                if (service.getPromote() == null) {
                    return null;
                }
                return getFileForObject(service.getPromote(), project);
            }
            return getFileForObject(service.getInterface(), project);
        } else if (adaptableObject instanceof Reference) {
            Reference reference = (Reference) adaptableObject;
            if (reference.getInterface() == null) {
                if (reference.getPromote() == null) {
                    return null;
                }
                for (ComponentReference promoted : reference.getPromote()) {
                    if (promoted.getInterface() == null) {
                        continue;
                    }
                    return getFileForObject(promoted, project);
                }
                return null;
            }
            return getFileForObject(reference.getInterface(), project);
        } else if (adaptableObject instanceof ComponentService) {
            ComponentService service = (ComponentService) adaptableObject;
            if (service.getInterface() == null) {
                return null;
            }
            return getFileForObject(service.getInterface(), project);
        } else if (adaptableObject instanceof ComponentReference) {
            ComponentReference reference = (ComponentReference) adaptableObject;
            if (reference.getInterface() == null) {
                return null;
            }
            return getFileForObject(reference.getInterface(), project);
        } else if (adaptableObject instanceof JavaInterface) {
            return (IFile) SwitchYardModelUtils.getJavaType(project, ((JavaInterface) adaptableObject).getInterface());
        } else if (adaptableObject instanceof WSDLPortType) {
            return (IFile) SwitchYardModelUtils.getJavaResource(project,
                    ((WSDLPortType) adaptableObject).getInterface());
        } else if (adaptableObject instanceof JavaTransformType1) {
            return (IFile) SwitchYardModelUtils.getJavaType(project, ((JavaTransformType1) adaptableObject).getClass_());
        } else if (adaptableObject instanceof SmooksTransformType1) {
            return (IFile) SwitchYardModelUtils.getJavaResource(project, ((SmooksTransformType1) adaptableObject).getConfig());
        } else if (adaptableObject instanceof XsltTransformType) {
            return (IFile) SwitchYardModelUtils.getJavaResource(project, ((XsltTransformType) adaptableObject).getXsltFile());
        }
        return null;
    }

    @Override
    public Class[] getAdapterList() {
        return ADAPTER_LIST;
    }

    /**
     * I'm sure there's a better way than this...
     * 
     * @param obj the EObject to resolve
     * 
     * @return the containing project; may be null if the object is not an
     *         EObject or is not contained within a workspace resource.
     */
    public static IProject getContainingProject(Object obj) {
        if (!(obj instanceof EObject)) {
            return null;
        }
        Resource objectResource = ((EObject) obj).eResource();
        if (objectResource == null) {
            return null;
        }
        for (Resource resource : objectResource.getResourceSet() == null ? Collections.singleton(objectResource)
                : objectResource.getResourceSet().getResources()) {
            URI uri = resource.getURI();
            if (uri.isPlatformResource()) {
                IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true)));
                if (file == null) {
                    return null;
                }
                return file.getProject();
            } else if (uri.isFile()) {
                // XXX: this may fail if there are nested projects.
                IFile file = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(uri.toFileString()));
                if (file == null) {
                    return null;
                }
                return file.getProject();
            }
        }
        return null;
    }
}
