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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.metadata.ServiceInterface;
import org.switchyard.metadata.ServiceOperation;
import org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceImpl;
import org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1;
import org.switchyard.tools.models.switchyard1_0.transform.TransformFactory;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.SwitchYardModelUtils;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.model.merge.MergedModelUtil;
import org.switchyard.tools.ui.editor.model.merge.SwitchYardMergedModelAdapter;
import org.switchyard.tools.ui.editor.transform.NewTransformWizard;

/**
 * @author bfitzpat
 * 
 */
public final class TransformTypesUtil {

    private Set<QName> _outputTypeQNames = null;
    private Set<QName> _inputTypeQNames = null;
    private List<TransformType> _targetTransforms = null;

    /**
     * Get operations for transformer types.
     * 
     * @param switchYard the root SwitchYard model
     */
    public TransformTypesUtil(SwitchYardType switchYard) {
        try {
            _inputTypeQNames = getInputTypesForConfig();
            _outputTypeQNames = getOutputTypesForConfig();
            _targetTransforms = loadTransformsFromTarget(switchYard);
        } catch (Exception e) {
            // ignore
            e.fillInStackTrace();
        }
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

    /**
     * @return ArrayList of Qnames
     * @throws Exception in case something goes wrong
     */
    public String[] getInputTypesAsStringsForConfig() throws Exception {
        return getTypesAsStrings(_inputTypeQNames);
    }

    /**
     * @return ArrayList of Qnames
     * @throws Exception in case something goes wrong
     */
    public String[] getOutputTypesAsStringsForConfig() throws Exception {
        return getTypesAsStrings(_outputTypeQNames);
    }

    /**
     * @return ArrayList of Qnames
     * @throws Exception in case something goes wrong
     */
    public Set<QName> getTypesForConfig() throws Exception {
        Set<QName> typesList = new HashSet<QName>();
        if (_inputTypeQNames != null) {
            typesList.addAll(_inputTypeQNames);
        }
        if (_outputTypeQNames != null) {
            typesList.addAll(_outputTypeQNames);
        }
        return typesList;
    }

    private Set<QName> getInputTypesForConfig() throws Exception {
        Set<QName> typesList = new HashSet<QName>();
        ArrayList<ServiceInterface> services = getOperationsForConfig();
        for (ServiceInterface baseService : services) {
            Set<ServiceOperation> ops = baseService.getOperations();
            for (ServiceOperation serviceOperation : ops) {
                if (serviceOperation.getInputType() != null) {
                    typesList.add(serviceOperation.getInputType());
                }
            }
        }
        return typesList;
    }

    private Set<QName> getOutputTypesForConfig() throws Exception {
        Set<QName> typesList = new HashSet<QName>();
        ArrayList<ServiceInterface> services = getOperationsForConfig();
        for (ServiceInterface baseService : services) {
            Set<ServiceOperation> ops = baseService.getOperations();
            for (ServiceOperation serviceOperation : ops) {
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
     * @param input String for qName to test
     * @return true/false whether it's an input type or not
     */
    public boolean isQNameInput(String input) {
        try {
            QName toTest = QName.valueOf(input);
            Set<QName> inputQNames = _inputTypeQNames;
            if (inputQNames.contains(toTest)) {
                return true;
            }
        } catch (Exception e) {
            // ignore
            e.fillInStackTrace();
        }
        return false;
    }

    /**
     * @param input String for qName to test
     * @return true/false whether it's an output type or not
     */
    public boolean isQNameOutput(String input) {
        try {
            QName toTest = QName.valueOf(input);
            Set<QName> outputQNames = _outputTypeQNames;
            if (outputQNames.contains(toTest)) {
                return true;
            }
        } catch (Exception e) {
            // ignore
            e.fillInStackTrace();
        }
        return false;
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
        SwitchyardSCAEditor.registerPackages(resourceSet);

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

    /**
     * @return list of supported transform types
     */
    public static List<TransformType> getSupportedTransformTypes() {
        ArrayList<TransformType> typeList = new ArrayList<TransformType>();

        TransformType jaxbType = TransformFactory.eINSTANCE.createJAXBTransformType();
        typeList.add(jaxbType);

        TransformType xsltType = TransformFactory.eINSTANCE.createXsltTransformType();
        typeList.add(xsltType);

        TransformType smooksType = TransformFactory.eINSTANCE.createSmooksTransformType1();
        ((SmooksTransformType1) smooksType).setType(SmooksTransformType.SMOOKS);
        typeList.add(smooksType);

        TransformType jsonType = TransformFactory.eINSTANCE.createJsonTransformType();
        typeList.add(jsonType);

        TransformType javaType = TransformFactory.eINSTANCE.createJavaTransformType1();
        typeList.add(javaType);
        return typeList;
    }

    /**
     * Returns text to use as a label for a type. The label will be formatted as
     * "SimpleName {namespace | package}".
     * 
     * @param typeString the QName.toString() value for the type.
     * @return a String that may be used as a label.
     */
    public static String getLabelForType(String typeString) {
        if (typeString == null || typeString.length() == 0) {
            return ""; //$NON-NLS-1$
        }
        final QName qname = QName.valueOf(typeString);
        if (NewTransformWizard.isJavaType(typeString)) {
            final int lastDot = qname.getLocalPart().lastIndexOf('.');
            if (lastDot >= 0) {
                return qname.getLocalPart().substring(lastDot + 1) + " {" + qname.getLocalPart().substring(5, lastDot) //$NON-NLS-1$
                        + "}"; //$NON-NLS-1$
            }
            return qname.getLocalPart().substring(5);
        }
        final String namespaceURI = qname.getNamespaceURI();
        if (namespaceURI == null || namespaceURI.isEmpty()) {
            return qname.getLocalPart();
        }
        return qname.getLocalPart() + " {" + namespaceURI + "}"; //$NON-NLS-1$ //$NON-NLS-2$
    }

    private List<TransformType> loadTransformsFromTarget(SwitchYardType switchYard) {
        return MergedModelUtil.getAdapter(switchYard, SwitchYardMergedModelAdapter.class).getTransforms();
    }

    /**
     * @param from QName type
     * @param to QName type
     * @return true/false if the transform already exists
     */
    public boolean transformExists(String from, String to) {
        if (_targetTransforms != null) {
            for (TransformType targetTransformType : _targetTransforms) {
                boolean testToMatch = targetTransformType.getTo().equals(to);
                boolean testFromMatch = targetTransformType.getFrom().equals(from);
                if (testToMatch && testFromMatch) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * @param modelObj model object to check types for
     * @return string list of types
     * @throws Exception if something goes wrong
     */
    public String[] getInputTypesAsStringsForEObjectConfig(EObject modelObj) throws Exception {
        return getTypesAsStrings(getTypesForConfigFromModelObject(modelObj, true, false, false));
    }

    /**
     * @param modelObj model object to check types for
     * @return string list of types
     * @throws Exception if something goes wrong
     */
    public String[] getTypesAsStringsForEObjectConfig(EObject modelObj) throws Exception {
        return getTypesAsStrings(getTypesForConfigFromModelObject(modelObj, true, true, true));
    }

    /**
     * @param modelObj model object to check types for
     * @return string list of types
     * @throws Exception if something goes wrong
     */
    public String[] getOutputTypesAsStringsForEObjectConfig(EObject modelObj) throws Exception {
        return getTypesAsStrings(getTypesForConfigFromModelObject(modelObj, false, true, true));
    }

    private Set<QName> getTypesForConfigFromModelObject(EObject modelObj, boolean input, boolean output, boolean fault)
            throws Exception {
        Set<QName> typesList = new HashSet<QName>();
        ArrayList<ServiceInterface> services = getOperationsForConfigFromModelObject(modelObj);
        for (ServiceInterface baseService : services) {
            Set<ServiceOperation> ops = baseService.getOperations();
            for (ServiceOperation serviceOperation : ops) {
                if (serviceOperation.getInputType() != null && input) {
                    typesList.add(serviceOperation.getInputType());
                }
                if (serviceOperation.getOutputType() != null && output) {
                    typesList.add(serviceOperation.getOutputType());
                }
                if (serviceOperation.getFaultType() != null && fault) {
                    typesList.add(serviceOperation.getFaultType());
                }
            }
        }
        return typesList;
    }

    /**
     * @param object incoming object to test (a model object - a CONTRACT from the SCA model)
     * @return boolean - true/false if it only has one operation
     * @throws Exception in case something goes wrong
     */
    public boolean isOnlyOneServiceOperation(EObject object) throws Exception {
        ArrayList<ServiceInterface> services = getOperationsForConfigFromModelObject(object);
        for (ServiceInterface service : services) {
            if (service.getOperations().size() == 1) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param fromObj the FROM object
     * @param toObj the TO object
     * @return the MAP to return
     * @throws Exception in case something goes wrong
     */
    public HashMap<String, String> createMappings(EObject fromObj, EObject toObj) throws Exception {
        HashMap<String, String> mappings = new HashMap<String, String>();
        ArrayList<ServiceInterface> fromservices = getOperationsForConfigFromModelObject(fromObj);
        ArrayList<ServiceInterface> toservices = getOperationsForConfigFromModelObject(toObj);
        for (ServiceInterface baseFromService : fromservices) {
            Set<ServiceOperation> fromOps = baseFromService.getOperations();
            for (ServiceOperation fromServiceOperation : fromOps) {
                for (ServiceInterface baseToService : toservices) {
                    Set<ServiceOperation> toOps = baseToService.getOperations();
                    for (ServiceOperation toServiceOperation : toOps) {
                        if (fromServiceOperation.getName().equals(toServiceOperation.getName())) {
                            if (fromServiceOperation.getInputType() != null
                                    && toServiceOperation.getInputType() != null) {
                                mappings.put(fromServiceOperation.getInputType().toString(), toServiceOperation
                                        .getInputType().toString());
                            }
                            if (fromServiceOperation.getOutputType() != null
                                    && toServiceOperation.getOutputType() != null) {
                                mappings.put(fromServiceOperation.getOutputType().toString(), toServiceOperation
                                        .getOutputType().toString());
                            }
                            if (fromServiceOperation.getFaultType() != null
                                    && toServiceOperation.getFaultType() != null) {
                                mappings.put(fromServiceOperation.getFaultType().toString(), toServiceOperation
                                        .getFaultType().toString());
                            }
                            break;
                        }
                    }
                }
            }
        }
        return mappings;
    }

    private ArrayList<ServiceInterface> getOperationsForConfigFromModelObject(EObject modelObj) throws Exception {
        ArrayList<ServiceInterface> runtimeServices = new ArrayList<ServiceInterface>();
        ClassLoader oldTCCL = Thread.currentThread().getContextClassLoader();
        Thread.currentThread()
                .setContextClassLoader(
                        JavaUtil.getProjectClassLoader(JavaCore.create(SwitchyardSCAEditor.getActiveEditor()
                                .getTargetModelFile().getProject()), null));
        try {
            if (modelObj instanceof Contract) {
                Contract contract = (Contract) modelObj;
                if (contract.getInterface() != null) {
                    runtimeServices.add(SwitchYardModelUtils.getServiceInterface(contract.getInterface()));
                }
            }
        } finally {
            Thread.currentThread().setContextClassLoader(oldTCCL);
        }
        return runtimeServices;
    }

}
