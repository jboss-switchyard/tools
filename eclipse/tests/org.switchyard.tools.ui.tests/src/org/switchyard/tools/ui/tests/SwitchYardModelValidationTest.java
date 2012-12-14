/*************************************************************************************
 * Copyright (c) 2011 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.tests;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2e.tests.common.AbstractMavenProjectTestCase;
import org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceFactoryImpl;

/**
 * SwitchYardModelValidationTest
 * 
 * Tests whether the models load in the EMF model for SwitchYard.
 * 
 * @author bfitzpat
 * 
 */
@SuppressWarnings("restriction")
public class SwitchYardModelValidationTest extends AbstractMavenProjectTestCase {

    /**
     * Tests import and configuration of bean-service quickstart.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testBeanServiceQuickstart() throws Exception {
        runModelTest("bean-service");
    }

    /**
     * Tests Helpdesk demo quickstart.
     * 
     * @throws Exception exception
     */
    public void testDemosHelpdeskQuickstart() throws Exception {
        runModelTest("demos/helpdesk");
    }

    // /**
    // * Tests orders demo quickstart.
    // * @throws Exception exception
    // */
    // public void testDemosOrdersQuickstart() throws Exception {
    // runModelTest("demos/orders");
    // }

    /**
     * Tests import and configuration of bpm-service quickstart.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testBpmServiceQuickstart() throws Exception {
        runModelTest("bpm-service");
    }

    /**
     * Tests import and configuration of camel-binding quickstart.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testCamelBindingQuickstart() throws Exception {
        runModelTest("camel-binding");
    }

    /**
     * Tests import and configuration of camel-ftp-binding quickstart.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testCamelFTPBindingQuickstart() throws Exception {
        runModelTest("camel-ftp-binding");
    }

    /**
     * Tests import and configuration of camel-jms-binding quickstart.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testCamelJMSBindingQuickstart() throws Exception {
        runModelTest("camel-jms-binding");
    }

     /**
     * Tests import and configuration of camel-netty-binding quickstart.
     *
     * @throws Exception if a failure occurs.
     */
     public void testCamelNettyBindingQuickstart() throws Exception {
         // disabled with quickstart issue
//         runModelTest("camel-netty-binding");
     }

    /**
     * Tests import and configuration of camel-rest-binding quickstart.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testCamelRestBindingQuickstart() throws Exception {
        runModelTest("camel-rest-binding");
    }

    /**
     * Tests import and configuration of camel-service quickstart.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testCamelServiceQuickstart() throws Exception {
        runModelTest("camel-service");
    }

    /**
     * Tests import and configuration of camel-ampq quickstart.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testCamelAmqpQuickstart() throws Exception {
        runModelTest("camel-amqp-binding");
    }
    
    /**
     * Tests import and configuration of camel-quartz quickstart.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testCamelQuartzQuickstart() throws Exception {
        runModelTest("camel-quartz-binding");
    }

    /**
     * Tests import and configuration of camel-sql quickstart.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testCamelSqlQuickstart() throws Exception {
        runModelTest("camel-sql-binding");
    }

    /**
     * Tests import and configuration of camel-soap-proxy quickstart.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testCamelSOAPProxyQuickstart() throws Exception {
        runModelTest("camel-soap-proxy");
    }

    /**
     * Tests import and configuration of hornetq-binding quickstart.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testHornetQQuickstart() throws Exception {
        runModelTest("hornetq-binding");
    }

    /**
     * Tests import and configuration of rules-camel-cbr quickstart.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testRulesCamelCBRQuickstart() throws Exception {
        runModelTest("rules-camel-cbr");
    }

    /**
     * Tests import and configuration of rules-interview quickstart.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testRulesInterviewQuickstart() throws Exception {
        runModelTest("rules-interview");
    }

    /**
     * Tests import and configuration of rules-interview-agent quickstart.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testRulesInterviewAgentQuickstart() throws Exception {
        runModelTest("rules-interview-agent");
    }

    /**
     * Tests import and configuration of transform-jaxb quickstart.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testTransformJAXBQuickstart() throws Exception {
        runModelTest("transform-jaxb");
    }

    /**
     * Tests import and configuration of transform-json quickstart.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testTransformJSONQuickstart() throws Exception {
        runModelTest("transform-json");
    }

    /**
     * Tests import and configuration of transform-smooks quickstart.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testTransformSmooksQuickstart() throws Exception {
        runModelTest("transform-smooks");
    }

    /**
     * Tests import and configuration of transform-xslt quickstart.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testTransformXSLTQuickstart() throws Exception {
        runModelTest("transform-xslt");
    }

//    /**
//     * Tests import and configuration of camel-mail-binding quickstart.
//     * 
//     * @throws Exception if a failure occurs.
//     */
//    public void testCamelMailBindingQuickstart() throws Exception {
//        runModelTest("camel-mail-binding");
//    }

    /**
     * Tests import and configuration of camel-jpa-binding quickstart. DISABLED
     * UNTIL SWITCHYARD-1201 is fixed
     * 
     * @throws Exception if a failure occurs.
     */
    // public void testCamelJPABindingTQuickstart() throws Exception {
    // runModelTest("camel-jpa-binding");
    // }

    /**
     * Tests policy-security-basic demo quickstart.
     * 
     * @throws Exception exception
     */
    public void testDemosPolicySecurityBasicQuickstart() throws Exception {
        runModelTest("demos/policy-security-basic");
    }

    /**
     * Tests policy-security-saml demo quickstart.
     * 
     * @throws Exception exception
     */
    public void testDemosPolicySecuritySAMLQuickstart() throws Exception {
        runModelTest("demos/policy-security-saml");
    }

    /**
     * Tests policy-security-cert demo quickstart.
     * 
     * @throws Exception exception
     */
    public void testDemosPolicySecurityCertQuickstart() throws Exception {
        runModelTest("demos/policy-security-cert");
    }

    private void waitForJobs() throws Exception {
        waitForJobsToComplete();
    }

    /**
     * @param filepath path to model xml
     * @throws IOException exception thrown
     */
    private void loadModelFile(String filepath) throws IOException {
        // Initialize the model
        SwitchyardPackage.eINSTANCE.eClass();

        // Register the XMI resource factory for the .website extension

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xml", new SwitchyardResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        String fileURI = "platform:/plugin/org.switchyard.tools.ui.tests/" + filepath;

        // Get the resource
        Resource resource = resSet.getResource(URI.createURI(fileURI), true);
        assertTrue("root of test model is a Switchyard document root",
                resource.getContents().get(0) instanceof DocumentRoot);

        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        DocumentRoot docroot = (DocumentRoot) resource.getContents().get(0);

        SwitchYardType switchyard = docroot.getSwitchyard();
        assertTrue("document root has one switchyard element", switchyard != null);
        assertTrue("no errors", resource.getErrors().isEmpty());

    }

    private void runModelTest(String projectName) throws Exception {
        loadModelFile("test-data/quickstart-configs/" + projectName + "/META-INF/switchyard.xml");

        waitForJobs();
    }
}
