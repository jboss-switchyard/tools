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
package org.switchyard.tools.ui.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Display;
import org.eclipse.wst.wsdl.Definition;
import org.eclipse.wst.wsdl.Operation;
import org.eclipse.wst.wsdl.PortType;
import org.eclipse.wst.wsdl.util.WSDLResourceImpl;
import org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface;

/**
 * @author bfitzpat
 *
 */
public final class InterfaceOpsUtil {

    private  InterfaceOpsUtil() {
        // empty constructor
    }

    /**
     * @param intfc WSDL interface
     * @return String array of operation names
     */
    private static String[] getOperationsForWSDLInterface(WSDLPortType intfc) {
        ArrayList<String> list = new ArrayList<String>();
        list.add(""); //$NON-NLS-1$
        final IResource wsdlfile = (IResource) Platform.getAdapterManager().loadAdapter(intfc, 
                IResource.class.getCanonicalName());

        String wsdlToFind = intfc.getInterface();
        String portBreak = "#wsdl.porttype("; //$NON-NLS-1$
        int portStart = wsdlToFind.indexOf(portBreak) + portBreak.length();
        int portEnd = wsdlToFind.lastIndexOf(')');
        String portTypeStr = wsdlToFind.substring(portStart, portEnd);
        final Definition[] holder = new Definition[1];
        BusyIndicator.showWhile(Display.getCurrent(), new Runnable() {
            public void run() {
                try {
                    ResourceSet resourceSet = new ResourceSetImpl();
                    WSDLResourceImpl resource = (WSDLResourceImpl) resourceSet.getResource(
                            URI.createPlatformResourceURI(wsdlfile.getFullPath().toString(), true), true);
                    holder[0] = resource.getDefinition();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        if (holder != null && holder.length == 1 && holder[0] != null) {
            Definition definition = holder[0];
            @SuppressWarnings("unchecked")
            Map<?, PortType> portTypes = definition.getPortTypes();
            Collection<PortType> ports = portTypes.values();
            for (PortType portType : ports) {
                if (portType.getQName().getLocalPart().equals(portTypeStr)) {
                    @SuppressWarnings("unchecked")
                    List<Operation> ops = portType.getOperations();
                    for (Operation operation : ops) {
                        String opName = operation.getName();
                        list.add(opName);
                    }
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }

    /**
     * @param intfc Java interface
     * @return String array of operation names
     */
    private static String[] getOperationsForJavaInterface(JavaInterface intfc) {
        ArrayList<String> list = new ArrayList<String>();
        list.add(""); //$NON-NLS-1$
        final IResource javafile = (IResource) Platform.getAdapterManager().loadAdapter(intfc, 
                IResource.class.getCanonicalName());
        if (javafile != null && javafile.getProject() != null) {
            IProject project = javafile.getProject();
            String classToFind = intfc.getInterface();
            IJavaProject javaProject = JavaCore.create(project);
            try {
                IType findType = javaProject.findType(classToFind);
                if (findType != null) {
                    IMethod[] methods = findType.getMethods();
                    for (int i = 0; i < methods.length; i++) {
                        IMethod method = methods[i];
                        list.add(method.getElementName());
                    }
                }
            } catch (JavaModelException e1) {
                e1.fillInStackTrace();
            }
        }
        return list.toArray(new String[list.size()]);
    }

    /**
     * @param contract Contract to check interface for
     * @return String array of operation names
     */
    public static String[] gatherOperations(Contract contract) {
        ArrayList<String> list = new ArrayList<String>();
        list.add(""); //$NON-NLS-1$
        Interface intfc = contract.getInterface();
        Service svc = null;
        if (contract instanceof Service) {
            svc = (Service) contract;
        }
        if (intfc == null && svc != null) {
            if (svc.getPromote() != null) {
                intfc = svc.getPromote().getInterface();
            }
        }
        if (intfc != null && intfc instanceof JavaInterface) {
            JavaInterface javaIntfc = (JavaInterface) intfc;
            String[] ops = getOperationsForJavaInterface(javaIntfc);
            return ops;
        } else if (intfc != null && intfc instanceof WSDLPortType) {
            WSDLPortType wsdlIntfc = (WSDLPortType) intfc;
            String[] ops = getOperationsForWSDLInterface(wsdlIntfc);
            return ops;
        } else if (intfc != null && intfc instanceof EsbInterface) {
            String[] ops = new String[]{""}; //$NON-NLS-1$
            return ops;
        }
        
        return list.toArray(new String[list.size()]);
    }
}
