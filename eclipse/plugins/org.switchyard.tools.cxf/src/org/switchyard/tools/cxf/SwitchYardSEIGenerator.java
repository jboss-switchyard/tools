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

import java.util.Map;

import javax.xml.namespace.QName;

import org.apache.cxf.tools.common.ToolContext;
import org.apache.cxf.tools.common.model.JavaInterface;
import org.apache.cxf.tools.common.model.JavaModel;
import org.apache.cxf.tools.util.ClassCollector;
import org.apache.cxf.tools.wsdlto.core.AbstractGenerator;
import org.apache.cxf.tools.wsdlto.frontend.jaxws.processor.WSDLToJavaProcessor;

/**
 * SwitchYardSEIGenerator
 * 
 * <p/>
 * Generates Java interface for WSDL based SwitchYard service.
 */
public class SwitchYardSEIGenerator extends AbstractGenerator {

    private static final String SEI_TEMPLATE = "org/switchyard/tools/cxf/sei.vm";

    @Override
    public void register(ClassCollector collector, String packageName, String fileName) {
    }

    @Override
    public void generate(ToolContext env) {
        setEnvironment(env);
        @SuppressWarnings("unchecked")
        Map<QName, JavaModel> map = (Map<QName, JavaModel>) env.get(WSDLToJavaProcessor.MODEL_MAP);
        for (JavaModel javaModel : map.values()) {
            Map<String, JavaInterface> interfaces = javaModel.getInterfaces();

            if (interfaces.size() == 0) {
                // TODO: generate an error?
                return;
            }
            for (JavaInterface intf : interfaces.values()) {
                clearAttributes();
                setAttributes("intf", intf);
                setCommonAttributes();

                doWrite(SEI_TEMPLATE, parseOutputName(intf.getPackageName(), intf.getName()));
            }
        }
    }

}
