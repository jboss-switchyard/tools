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
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.models.switchyard1_0.camel.XMLDSLType;
import org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.spring.FromDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.LogDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RoutesDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringFactory;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.spring.util.SpringResourceFactoryImpl;
import org.switchyard.tools.ui.SwitchYardModelUtils;
import org.switchyard.tools.ui.editor.Activator;
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

    private String getNewRouteStubText(String serviceName) {
        
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

    private InputStream getOldRouteStubText() {
        ByteArrayOutputStream baos = null;
        try {
            DocumentRoot doc = SpringFactory.eINSTANCE.createDocumentRoot();
            RoutesDefinition routes = SpringFactory.eINSTANCE.createRoutesDefinition();
            RouteDefinition route = SpringFactory.eINSTANCE.createRouteDefinition();
            route.setId("_route1");
            FromDefinition from = SpringFactory.eINSTANCE.createFromDefinition();
            from.setId("_from1");
            LogDefinition log = SpringFactory.eINSTANCE.createLogDefinition();
            log.setId("_log1");
            String serviceName = getService().getName();

            from.setUri("switchyard://" + serviceName); //$NON-NLS-1$
            log.setMessage("" + serviceName + " - message received: ${body}"); //$NON-NLS-1$ //$NON-NLS-2$

            doc.setRoutes(routes);
            doc.setRoute(route);
            route.getFrom().add(from);
            route.getLog().add(log);
            routes.getRoute().add(route);

            doc.getXMLNSPrefixMap().put("", SpringPackage.eNS_URI); //$NON-NLS-1$

            Resource routeResource = new SpringResourceFactoryImpl().createResource(URI.createGenericURI("temp", //$NON-NLS-1$
                    "temp", null)); //$NON-NLS-1$
            routeResource.getContents().add(doc);

            baos = new ByteArrayOutputStream();
            routeResource.save(baos, null);
            return new ByteArrayInputStream(baos.toByteArray());
        } catch (IOException e2) {
            e2.printStackTrace();
            Activator.logError(e2);
        } finally {
            if (baos != null) {
                try {
                    baos.close();
                } catch (IOException e) {
                    e.fillInStackTrace();
                }
            }    
        }
        return null;
    }
    
    @Override
    protected InputStream getInitialContents() {
        boolean useNewCamelRoute = true;
        IProject project = getJavaProject().getProject();
        String version = SwitchYardModelUtils.getSwitchYardProjectRuntimeVersion(project);
        if (version.startsWith("2.0") || version.startsWith("1")) {
            useNewCamelRoute = false;
        }
        // otherwise we're using the new one
        
        String serviceName = getService().getName();
        if (serviceName != null) {
            if (useNewCamelRoute) {
                return new ByteArrayInputStream(
                        getNewRouteStubText(serviceName).getBytes(
                                java.nio.charset.StandardCharsets.UTF_8));
            } else {
                return getOldRouteStubText();
            }
        }
        return null;
    }

}
