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

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.metadata.ServiceInterface;
import org.switchyard.metadata.ServiceOperation;
import org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidateType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidatesType;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceImpl;
import org.switchyard.tools.models.switchyard1_0.validate.ValidateFactory;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.SwitchYardModelUtils;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public final class ValidatorTypesUtil {

    private Set<QName> _typeQNames = null;
    private ValidatesType _targetValidators = null;

    /**
     * Get operations for validator types.
     */
    public ValidatorTypesUtil() {
        try {
            _typeQNames = getTypesForConfig();
            _targetValidators = loadValidatorsFromTarget();
        } catch (Exception e) {
            // ignore
            e.fillInStackTrace();
        }
    }

    /**
     * @return list of supported transform types
     */
    public static List<ValidateType> getSupportedValidateTypes() {
        ArrayList<ValidateType> typeList = new ArrayList<ValidateType>();

        ValidateType xmlType = ValidateFactory.eINSTANCE.createXmlValidateType();
        typeList.add(xmlType);

        ValidateType javaType = ValidateFactory.eINSTANCE.createJavaValidateType();
        typeList.add(javaType);

        return typeList;
    }

    private Set<QName> getTypesForConfig() throws Exception {
        if (_typeQNames != null) {
            return _typeQNames;
        }
        Set<QName> typesList = new HashSet<QName>();
        ArrayList<ServiceInterface> services = getOperationsForConfig();
        for (ServiceInterface baseService : services) {
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

    private ArrayList<ServiceInterface> getOperationsForConfig() throws Exception {
        Composite composite = getCompositeFromTarget();
        ArrayList<ServiceInterface> runtimeServices = new ArrayList<ServiceInterface>();
        ClassLoader oldTCCL = Thread.currentThread().getContextClassLoader();
        Thread.currentThread()
                .setContextClassLoader(
                        JavaUtil.getProjectClassLoader(JavaCore.create(SwitchyardSCAEditor.getActiveEditor()
                                .getTargetModelFile().getProject()), null));
        try {
            for (Service service : composite.getService()) {
                if (service.getInterface() != null) {
                    runtimeServices.add(SwitchYardModelUtils.getServiceInterface(service.getInterface()));
                }
            }
            for (Reference reference : composite.getReference()) {
                if (reference.getInterface() != null) {
                    runtimeServices.add(SwitchYardModelUtils.getServiceInterface(reference.getInterface()));
                }
            }
            for (Component component : composite.getComponent()) {
                for (ComponentService service : component.getService()) {
                    if (service.getInterface() != null) {
                        runtimeServices.add(SwitchYardModelUtils.getServiceInterface(service.getInterface()));
                    }
                }
                for (ComponentReference reference : component.getReference()) {
                    if (reference.getInterface() != null) {
                        runtimeServices.add(SwitchYardModelUtils.getServiceInterface(reference.getInterface()));
                    }
                }
            }
        } finally {
            Thread.currentThread().setContextClassLoader(oldTCCL);
        }
        return runtimeServices;
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

        // Obtain a new resource set
        ResourceSet resourceSet = SwitchYardModelUtils.newResourceSet();

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
            if (resource.getContents() != null && resource.getContents().size() > 0) {
                DocumentRoot docroot = (DocumentRoot) resource.getContents().get(0);
    
                if (docroot != null) {
                    SwitchYardType switchyard = docroot.getSwitchyard();
                    return switchyard;
                }
            }
        }
        return null;
    }

    private String[] getTypesAsStrings(Set<QName> typesList) throws Exception {
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
    public String[] getTypesAsStringsForConfig() throws Exception {
        return getTypesAsStrings(getTypesForConfig());
    }

    private ValidatesType loadValidatorsFromTarget() {
        IFile target = SwitchyardSCAEditor.getActiveEditor().getTargetModelFile();
        if (target != null) {
            try {
                SwitchYardType switchyard = loadModelFile(target);
                if (switchyard != null && switchyard.getValidates() != null) {
                    return switchyard.getValidates();
                }
            } catch (IOException e) {
                e.fillInStackTrace();
            }
        }
        return null;
    }

    /**
     * @return Transforms root type
     */
    public ValidatesType getValidatorsFromTarget() {
        if (_targetValidators != null) {
            return _targetValidators;
        }
        return loadValidatorsFromTarget();
    }

    /**
     * @param name QName type
     * @return true/false if the validator already exists
     */
    public boolean validatorExists(String name) {
        if (loadValidatorsFromTarget() != null && loadValidatorsFromTarget().getValidate() != null) {
            for (ValidateType targetValidatorType : loadValidatorsFromTarget().getValidate()) {
                boolean testToMatch = targetValidatorType.getName().equals(name);
                if (testToMatch) {
                    return true;
                }
            }
        }
        return false;
    }
}
