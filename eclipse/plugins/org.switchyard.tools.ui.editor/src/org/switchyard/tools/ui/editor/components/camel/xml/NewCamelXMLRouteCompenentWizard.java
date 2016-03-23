/******************************************************************************* 
 * Copyright (c) 2012-2016 Red Hat, Inc. 
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
package org.switchyard.tools.ui.editor.components.camel.xml;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.models.switchyard1_0.camel.XMLDSLType;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.shared.BaseNewServiceFileWizard;

/**
 * NewCamelXMLRouteCompenentWizard
 * 
 * <p/>
 * Creates a new Camel implementation based on an XML route definition.
 * 
 * @author bfitzpat
 * @author Rob Cernich
 */
public class NewCamelXMLRouteCompenentWizard extends BaseNewServiceFileWizard {

    /**
     * Create a new NewCamelXMLRouteCompenentWizard.
     * 
     * @param openAfterCreate true if the resource should be opened after
     *            creation.
     */
    public NewCamelXMLRouteCompenentWizard(boolean openAfterCreate) {
        super(openAfterCreate, "xml"); //$NON-NLS-1$
        setWindowTitle(Messages.title_newCamelXmlRouteFile);
    }

    @Override
    public void addPages() {
        super.addPages();

        WizardNewFileCreationPage page = getFileCreationPage();
        page.setTitle(Messages.title_routeFile);
        page.setDescription(Messages.description_routeFile);
        if (getService() == null) {
            page.setFileName("route.xml"); //$NON-NLS-1$
        } else {
            page.setFileName("" + getService().getName() + "Route.xml"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    @Override
    protected Implementation createImplementation() {
        XMLDSLType xmlType = CamelFactory.eINSTANCE.createXMLDSLType();
        xmlType.setPath(getCreatedFilePath());

        CamelImplementationType implementation = CamelFactory.eINSTANCE.createCamelImplementationType();
        implementation.setXml(xmlType);

        return implementation;
    }

    @Override
    protected List<ComponentReference> createReferences() {
        return Collections.emptyList();
    }

    String getSpringStubText(String serviceName) {
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        sb.append("<beans xmlns=\"http://www.springframework.org/schema/beans\"\n");
        sb.append("       xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd        http://camel.apache.org/schema/spring http://camel.apache.org/schema/spring/camel-spring.xsd\">\n");
        sb.append("   <camelContext id=\"camelContext1\" xmlns=\"http://camel.apache.org/schema/spring\">\n");
        sb.append("      <route id=\"_route1\">\n");
        sb.append("         <from id=\"_from1\" uri=\"switchyard://" + serviceName + "\"/>\n");
        sb.append("         <log id=\"_log1\" message=\"" + serviceName + " - message received: ${body}\"/>\n");
        sb.append("      </route>\n");
        sb.append("   </camelContext>\n");
        sb.append("</beans>\n");
        return sb.toString();
    }
    
    
    @Override
    protected InputStream getInitialContents() {
        String serviceName = getService().getName();
        if (serviceName != null) {
            return new ByteArrayInputStream(getSpringStubText(serviceName).getBytes());
        }
        return null;
    }

}
