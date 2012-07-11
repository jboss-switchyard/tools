/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.editor.util;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.switchyard.common.type.Classes;
import org.switchyard.extensions.wsdl.WSDLService;
import org.switchyard.metadata.BaseService;
import org.switchyard.metadata.InOnlyOperation;
import org.switchyard.metadata.InOnlyService;
import org.switchyard.metadata.InOutOperation;
import org.switchyard.metadata.InOutService;
import org.switchyard.metadata.ServiceInterface;
import org.switchyard.metadata.ServiceOperation;
import org.switchyard.metadata.java.JavaService;
import org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceFactoryImpl;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceImpl;
import org.switchyard.tools.ui.editor.core.ModelHandler;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 *
 */
public final class TransformTypesUtil {
    
    /**
     * Get operations for transformer types.
     */
    public TransformTypesUtil() {
        // empty
    }
    
    /**
     * @return ArrayList of Qnames
     * @throws Exception in case something goes wrong
     */
    public String[] getTypesAsStringsForConfig() throws Exception {
        Set<QName> typesList = getTypesForConfig();
        String[] outList = new String[typesList.size()];
        int count = 0;
        for (QName qName : typesList) {
            outList[count] = qName.toString();
            count++;
        }
        return outList;
    }

    /**
     * @return ArrayList of Qnames
     * @throws Exception in case something goes wrong
     */
    public Set<QName> getTypesForConfig() throws Exception {
        Set<QName> typesList = new HashSet<QName>();
        ArrayList<BaseService> services = getOperationsForConfig();
        for (BaseService baseService : services) {
            Set<ServiceOperation> ops = baseService.getOperations();
            for (ServiceOperation serviceOperation : ops) {
                if (serviceOperation.getInputType() != null) {
                    typesList.add(serviceOperation.getInputType());
                }
                if (serviceOperation.getOutputType() != null) {
                    typesList.add(serviceOperation.getOutputType());
                }
                if (serviceOperation.getFaultType() != null) {
                    typesList.add(serviceOperation.getFaultType());
                }
            }
        }
        return typesList;
    }
    
    /**
     * @return something
     * @throws Exception 
     */
    public ArrayList<BaseService> getOperationsForConfig() throws Exception {
        Composite composite = getCompositeFromTarget();
        ArrayList<BaseService> runtimeServices = new ArrayList<BaseService>();
        ClassLoader oldTCCL = Thread.currentThread().getContextClassLoader();
        Thread.currentThread().setContextClassLoader(getProjectClassLoader(SwitchyardSCAEditor.getActiveEditor().getTargetModelFile().getProject()));
        for (Service service : composite.getService()) {
         if (service.getInterface() != null) {
             if (service.getInterface() instanceof JavaInterface) {
                 JavaInterface javaIntfc = (JavaInterface) service.getInterface();
                 runtimeServices.add(JavaService.fromClass(loadClass(javaIntfc.getInterface())));
             } else if (service.getInterface() instanceof WSDLPortType) {
                 WSDLPortType wsdlIntfc = (WSDLPortType) service.getInterface();
                 runtimeServices.add(WSDLService.fromWSDL(wsdlIntfc.getInterface()));
            } else if (service.getInterface() instanceof EsbInterface) {
                EsbInterface esbIntfc = (EsbInterface) service.getInterface();
                BaseService serviceInterface = null;
                if (esbIntfc.getOutputType() == null) {
                    serviceInterface = new InOnlyService(new InOnlyOperation(
                            ServiceInterface.DEFAULT_OPERATION, new QName(esbIntfc.getInputType())));
                } else {
                    serviceInterface = new InOutService(new InOutOperation(
                            ServiceInterface.DEFAULT_OPERATION, 
                            new QName(esbIntfc.getInputType()), 
                            new QName(esbIntfc.getOutputType()), 
                            new QName(esbIntfc.getFaultType())));
                }
                runtimeServices.add(serviceInterface);
            }
         }
        }
        for (Reference reference : composite.getReference()) {
            if (reference.getInterface() != null) {
                if (reference.getInterface() instanceof JavaInterface) {
                    JavaInterface javaIntfc = (JavaInterface) reference.getInterface();
                    runtimeServices.add(JavaService.fromClass(loadClass(javaIntfc.getInterface())));
                } else if (reference.getInterface() instanceof WSDLPortType) {
                    WSDLPortType wsdlIntfc = (WSDLPortType) reference.getInterface();
                    runtimeServices.add(WSDLService.fromWSDL(wsdlIntfc.getInterface()));
               } else if (reference.getInterface() instanceof EsbInterface) {
                   EsbInterface esbIntfc = (EsbInterface) reference.getInterface();
                   BaseService serviceInterface = null;
                   if (esbIntfc.getOutputType() == null) {
                       serviceInterface = new InOnlyService(new InOnlyOperation(
                               ServiceInterface.DEFAULT_OPERATION, new QName(esbIntfc.getInputType())));
                   } else {
                       serviceInterface = new InOutService(new InOutOperation(
                               ServiceInterface.DEFAULT_OPERATION, 
                               new QName(esbIntfc.getInputType()), 
                               new QName(esbIntfc.getOutputType()), 
                               new QName(esbIntfc.getFaultType())));
                   }
                   runtimeServices.add(serviceInterface);
               }
            }
        }
        for (Component component : composite.getComponent()) {
         for (ComponentService service : component.getService()) {
             if (service.getInterface() instanceof JavaInterface) {
                 JavaInterface javaIntfc = (JavaInterface) service.getInterface();
                 runtimeServices.add(JavaService.fromClass(loadClass(javaIntfc.getInterface())));
             } else if (service.getInterface() instanceof WSDLPortType) {
                 WSDLPortType wsdlIntfc = (WSDLPortType) service.getInterface();
                 runtimeServices.add(WSDLService.fromWSDL(wsdlIntfc.getInterface()));
            } else if (service.getInterface() instanceof EsbInterface) {
                EsbInterface esbIntfc = (EsbInterface) service.getInterface();
                BaseService serviceInterface = null;
                if (esbIntfc.getOutputType() == null) {
                    serviceInterface = new InOnlyService(new InOnlyOperation(
                            ServiceInterface.DEFAULT_OPERATION, new QName(esbIntfc.getInputType())));
                } else {
                    serviceInterface = new InOutService(new InOutOperation(
                            ServiceInterface.DEFAULT_OPERATION, 
                            new QName(esbIntfc.getInputType()), 
                            new QName(esbIntfc.getOutputType()), 
                            new QName(esbIntfc.getFaultType())));
                }
                runtimeServices.add(serviceInterface);
            }
         }
         for (ComponentReference reference : component.getReference()) {
             if (reference.getInterface() != null) {
                 if (reference.getInterface() instanceof JavaInterface) {
                     JavaInterface javaIntfc = (JavaInterface) reference.getInterface();
                     runtimeServices.add(JavaService.fromClass(loadClass(javaIntfc.getInterface())));
                 } else if (reference.getInterface() instanceof WSDLPortType) {
                     WSDLPortType wsdlIntfc = (WSDLPortType) reference.getInterface();
                     runtimeServices.add(WSDLService.fromWSDL(wsdlIntfc.getInterface()));
                } else if (reference.getInterface() instanceof EsbInterface) {
                    EsbInterface esbIntfc = (EsbInterface) reference.getInterface();
                    BaseService serviceInterface = null;
                    if (esbIntfc.getOutputType() == null) {
                        serviceInterface = new InOnlyService(new InOnlyOperation(
                                ServiceInterface.DEFAULT_OPERATION, new QName(esbIntfc.getInputType())));
                    } else {
                        serviceInterface = new InOutService(new InOutOperation(
                                ServiceInterface.DEFAULT_OPERATION, 
                                new QName(esbIntfc.getInputType()), 
                                new QName(esbIntfc.getOutputType()), 
                                new QName(esbIntfc.getFaultType())));
                    }
                    runtimeServices.add(serviceInterface);
                }
             }
         }
        }
        Thread.currentThread().setContextClassLoader(oldTCCL);
        return runtimeServices;
    }
    
    private Class<?> loadClass(String className) {
        return Classes.forName(className);
    }

    private ClassLoader getProjectClassLoader(IProject project) throws Exception {
        IJavaProject javaProject = JavaCore.create(project);
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
        return new URLClassLoader(urls.toArray(new URL[urls.size()]), getClass().getClassLoader());
    }
    
    private Composite getCompositeFromTarget() {
        IFile target = SwitchyardSCAEditor.getActiveEditor().getTargetModelFile();
        if (target != null) {
            try {
                SwitchYardType switchyard = loadModelFile(target);
                return switchyard.getComposite();
            } catch (IOException e) {
                e.fillInStackTrace();
            }
        }
        return null;
    }
    
    private SwitchYardType loadModelFile(IFile file) throws IOException {
        SwitchyardPackage.eINSTANCE.eClass();
        
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xml", new SwitchyardResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resourceSet = new ResourceSetImpl();
        ModelHandler.registerPackages(resourceSet);

        URI modelUri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
        // Get the resource
        Resource resource = null;
        try {
            resource = (SwitchyardResourceImpl) resourceSet.getResource(modelUri, true);
        } catch (WrappedException we) {
            resource = (SwitchyardResourceImpl) resourceSet.getResource(modelUri, true);
        } catch (Exception e) {
            resource = (SwitchyardResourceImpl) resourceSet.getResource(modelUri, true);
        }
        
        if (resource != null) {
            DocumentRoot docroot = (DocumentRoot) resource.getContents().get(0);
            
            if (docroot != null) {
                SwitchYardType switchyard = docroot.getSwitchyard();
                return switchyard;
            }
        }
        return null;
    }
    
}
