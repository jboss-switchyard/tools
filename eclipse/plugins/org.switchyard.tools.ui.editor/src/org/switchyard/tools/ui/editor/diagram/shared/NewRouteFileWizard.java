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
package org.switchyard.tools.ui.editor.diagram.shared;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.switchyard.tools.models.switchyard1_0.spring.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.spring.FromDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.LogDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringFactory;
import org.switchyard.tools.models.switchyard1_0.spring.util.SpringResourceFactoryImpl;
import org.switchyard.tools.ui.editor.Activator;

/**
 * @author bfitzpat
 * 
 */
class NewRouteFileWizard extends BaseNewServiceFileWizard {

    NewRouteFileWizard(boolean openAfterCreate) {
        super(openAfterCreate, "xml");
        setWindowTitle("New Camel XML Route File");
    }

    @Override
    public void addPages() {
        super.addPages();

        WizardNewFileCreationPage page = getFileCreationPage();
        page.setTitle("Route File");
        page.setDescription("Create a new Camel Route file resource.");
        page.setFileName("route.xml");

    }

    @Override
    protected InputStream getInitialContents() {
        ByteArrayOutputStream baos = null;
        try {
            DocumentRoot doc = SpringFactory.eINSTANCE.createDocumentRoot();
            RouteDefinition route = SpringFactory.eINSTANCE.createRouteDefinition();
            FromDefinition from = SpringFactory.eINSTANCE.createFromDefinition();
            LogDefinition log = SpringFactory.eINSTANCE.createLogDefinition();
            String serviceName = getService().getName();

            from.setUri("switchyard://" + serviceName);
            log.setMessage("" + serviceName + " - message received: ${body}");

            doc.setRoute(route);
            route.getFrom().add(from);
            route.getLog().add(log);

            Resource routeResource = new SpringResourceFactoryImpl().createResource(URI.createGenericURI("temp",
                    "temp", null));
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

}
