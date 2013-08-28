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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IMemberValuePair;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.Signature;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * JavaTypeScanner
 * 
 * <p/>
 * Scans the type for @Service and @Reference annotations.
 * 
 * @author Rob Cernich
 */
public class JavaTypeScanner {

    private List<ComponentService> _services;
    private List<ComponentReference> _references;

    /**
     * Create a new JavaTypeScanner.
     * 
     * @param type the type to scan.
     */
    public JavaTypeScanner(IType type) {
        // see if there are any services on the class
        _services = new ArrayList<ComponentService>();
        _references = new ArrayList<ComponentReference>();
        try {
            ComponentService service = null;
            for (IAnnotation annotation : type.getAnnotations()) {
                String[][] annoTypes = type.resolveType(annotation.getElementName());
                if (annoTypes == null || annoTypes.length == 0) {
                    continue;
                }
                if (!"org.switchyard.component.bean".equals(annoTypes[0][0]) || !"Service".equals(annoTypes[0][1])) { //$NON-NLS-1$ //$NON-NLS-2$
                    continue;
                }
                for (IMemberValuePair pair : annotation.getMemberValuePairs()) {
                    if ("value".equals(pair.getMemberName())) { //$NON-NLS-1$
                        if (service == null) {
                            service = ScaFactory.eINSTANCE.createComponentService();
                        }
                        try {
                            String interfaceName = (String) pair.getValue();
                            String[][] serviceTypes = type.resolveType(interfaceName);
                            if (serviceTypes != null && serviceTypes.length > 0) {
                                if (serviceTypes[0][0].length() == 0) {
                                    interfaceName = serviceTypes[0][1];
                                } else {
                                    interfaceName = serviceTypes[0][0] + '.' + serviceTypes[0][1];
                                }
                            }
                            if (interfaceName != null) {
                                JavaInterface intf = ScaFactory.eINSTANCE.createJavaInterface();
                                intf.setInterface(interfaceName);
                                service.getInterfaceGroup().add(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceJava(),
                                        intf);
                                service.setName(getSimpleNameFromQualifiedName(interfaceName));
                            }
                        } catch (Exception e) {
                            e.fillInStackTrace();
                        }
                    } else if ("name".equals(pair.getMemberName())) { //$NON-NLS-1$
                        String name = (String) pair.getValue();
                        if (name == null || name.length() == 0) {
                            continue;
                        }
                        if (service == null) {
                            service = ScaFactory.eINSTANCE.createComponentService();
                        }
                        service.setName(name);
                    }
                }
                if (service != null) {
                    if (service.getName() != null) {
                        _services.add(service);
                    }
                    break;
                }
            }
        } catch (Exception e) {
            e.fillInStackTrace();
        }
        try {
            for (IField field : type.getFields()) {
                try {
                    ComponentReference reference = null;
                    for (IAnnotation annotation : field.getAnnotations()) {
                        String[][] annoTypes = type.resolveType(annotation.getElementName());
                        if (annoTypes == null || annoTypes.length == 0) {
                            continue;
                        }
                        if (!"org.switchyard.component.bean".equals(annoTypes[0][0]) //$NON-NLS-1$
                                || !"Reference".equals(annoTypes[0][1])) { //$NON-NLS-1$
                            continue;
                        }

                        reference = ScaFactory.eINSTANCE.createComponentReference();

                        String interfaceName = Signature.toString(field.getTypeSignature());
                        String[][] referenceTypes = type.resolveType(interfaceName);
                        if (referenceTypes != null && referenceTypes.length > 0) {
                            if (referenceTypes[0][0].length() == 0) {
                                interfaceName = referenceTypes[0][1];
                            } else {
                                interfaceName = referenceTypes[0][0] + '.' + referenceTypes[0][1];
                            }
                        }
                        JavaInterface intf = ScaFactory.eINSTANCE.createJavaInterface();
                        intf.setInterface(interfaceName);
                        reference.getInterfaceGroup().add(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceJava(), intf);
                        reference.setName(getSimpleNameFromQualifiedName(interfaceName));

                        for (IMemberValuePair pair : annotation.getMemberValuePairs()) {
                            if ("value".equals(pair.getMemberName())) { //$NON-NLS-1$
                                String name = (String) pair.getValue();
                                if (name != null && name.length() > 0) {
                                    reference.setName(name);
                                }
                            }
                        }
                        if (reference.getName() != null) {
                            _references.add(reference);
                        }
                        break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Get the services registered by the type through @Service.
     * 
     * @return the services.
     */
    public List<ComponentService> getServices() {
        return _services;
    }

    /**
     * Get the references used by the type through @Reference.
     * 
     * @return the references.
     */
    public List<ComponentReference> getReferences() {
        return _references;
    }

    private String getSimpleNameFromQualifiedName(String typeName) {
        int index = typeName.lastIndexOf('.');
        if (index >= 0) {
            return typeName.substring(index + 1);
        } else {
            return typeName;
        }
    }
}
