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
package org.switchyard.tools.ui.editor.diagram.component.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IMemberValuePair;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.Signature;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.switchyard.tools.models.switchyard1_0.bean.BeanFactory;
import org.switchyard.tools.models.switchyard1_0.bean.BeanImplementationType;
import org.switchyard.tools.models.switchyard1_0.bean.BeanPackage;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.LinkedWizardBase;

/**
 * CamelImplementationWizard
 * 
 * <p/>
 * Wizard providing support for creating/configuring Camel implementation types.
 * 
 * @author Rob Cernich
 */
public class BeanImplementationWizard extends LinkedWizardBase implements IComponentImplementationWizard {

    private BeanImplementationType _implementation;
    private BeanComponentWizardPage _page;
    private List<ComponentService> _services;
    private List<ComponentReference> _references;

    @Override
    public void addPages() {
        _page = new BeanComponentWizardPage(BeanComponentWizardPage.class.getCanonicalName());
        addPage(_page);
    }

    @Override
    public String getDisplayName() {
        return "Bean (CDI)";
    }

    @Override
    public Implementation getImplementation() {
        return _implementation;
    }

    @Override
    public void setImplementation(Implementation implementation) {
        _implementation = (BeanImplementationType) implementation;
    }

    @Override
    public EStructuralFeature getFeatureForImplementation() {
        return BeanPackage.eINSTANCE.getDocumentRoot_ImplementationBean();
    }

    @Override
    public List<ComponentService> getImplementationServices() {
        return _services;
    }

    @Override
    public List<ComponentReference> getImplementationReferences() {
        return _references;
    }

    @Override
    public boolean doFinish() {
        IType type = _page.getBeanClass();
        if (type == null) {
            return false;
        }
        _implementation = BeanFactory.eINSTANCE.createBeanImplementationType();
        _implementation.setClass(type.getFullyQualifiedName());

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
                if (!"org.switchyard.component.bean".equals(annoTypes[0][0]) && !"Service".equals(annoTypes[0][1])) {
                    continue;
                }
                for (IMemberValuePair pair : annotation.getMemberValuePairs()) {
                    if ("value".equals(pair.getMemberName())) {
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
                    } else if ("name".equals(pair.getMemberName())) {
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
                        if (!"org.switchyard.component.bean".equals(annoTypes[0][0])
                                && !"Reference".equals(annoTypes[0][1])) {
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
                        reference.getInterfaceGroup().add(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceJava(),
                                intf);
                        reference.setName(getSimpleNameFromQualifiedName(interfaceName));

                        for (IMemberValuePair pair : annotation.getMemberValuePairs()) {
                            if ("value".equals(pair.getMemberName())) {
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
                    e.fillInStackTrace();
                }
            }
        } catch (Exception e) {
            e.fillInStackTrace();
        }
        return true;
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
