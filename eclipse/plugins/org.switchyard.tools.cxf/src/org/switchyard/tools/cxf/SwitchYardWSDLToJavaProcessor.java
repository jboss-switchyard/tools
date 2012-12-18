/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.cxf;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;

import javax.xml.namespace.QName;

import org.apache.cxf.service.model.InterfaceInfo;
import org.apache.cxf.service.model.OperationInfo;
import org.apache.cxf.service.model.ServiceInfo;
import org.apache.cxf.tools.common.model.JavaInterface;
import org.apache.cxf.tools.common.model.JavaModel;
import org.apache.cxf.tools.wsdlto.frontend.jaxws.processor.WSDLToJavaProcessor;
import org.apache.cxf.tools.wsdlto.frontend.jaxws.processor.internal.OperationProcessor;
import org.apache.cxf.tools.wsdlto.frontend.jaxws.processor.internal.PortTypeProcessor;

/**
 * SwitchYardWSDLToJavaProcessor
 * 
 * <p/>
 * Sets up the Java interface for SwitchYard consumption.
 */
public class SwitchYardWSDLToJavaProcessor extends WSDLToJavaProcessor {

    /**
     * Basically the same as super.process(), but we're not adding any
     * annotations.
     */
    @Override
    public void process() {
        ServiceInfo serviceInfo = context.get(ServiceInfo.class);
        InterfaceInfo interfaceInfo = serviceInfo.getInterface();
        if (interfaceInfo == null) {
            return;
        }

        Map<QName, Object> seenOperations = new HashMap<QName, Object>();
        JavaModel javaModel = null;
        @SuppressWarnings("unchecked")
        Map<QName, JavaModel> map = (Map<QName, JavaModel>) context.get(MODEL_MAP);
        if (map == null) {
            map = new LinkedHashMap<QName, JavaModel>();
            context.put(MODEL_MAP, map);
        }
        if (map.containsKey(serviceInfo.getName())) {
            javaModel = map.get(serviceInfo.getName());
        } else {
            javaModel = new JavaModel();
            map.put(serviceInfo.getName(), javaModel);
        }

        JavaInterface intf = PortTypeProcessor.getInterface(context, serviceInfo, interfaceInfo);
        intf.setJavaModel(javaModel);

        JavaInterface dummyInterface = new JavaInterface();
        Collection<OperationInfo> operations = interfaceInfo.getOperations();
        for (OperationInfo operation : operations) {
            if (seenOperations.put(operation.getName(), Boolean.TRUE) != null) {
                LOG.log(Level.WARNING, "SKIP_OVERLOADED_OPERATION", operation.getName());
                continue;
            }
            OperationProcessor operationProcessor = new OperationProcessor(context);
            operationProcessor.process(dummyInterface, operation);
        }

        intf.getMethods().addAll(dummyInterface.getMethods());
        javaModel.addInterface(intf.getName(), intf);

        context.setJavaModel(javaModel);
    }

}
