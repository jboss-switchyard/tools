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
import java.util.Map;
import java.util.Set;

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceFactoryImpl;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceImpl;
import org.switchyard.tools.models.switchyard1_0.transform.TransformFactory;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.SwitchYardModelUtils;
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

    /**
     * @return a list of services defined within the current active editor's
     *         input.
     * @throws Exception if something goes wrong
     */
    public ArrayList<ServiceInterface> getOperationsForConfig() throws Exception {
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

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xml", new SwitchyardResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resourceSet = new ResourceSetImpl();
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
        typeList.add(smooksType);

        TransformType jsonType = TransformFactory.eINSTANCE.createJsonTransformType();
        typeList.add(jsonType);

        TransformType javaType = TransformFactory.eINSTANCE.createJavaTransformType1();
        typeList.add(javaType);
        return typeList;
    }
}
