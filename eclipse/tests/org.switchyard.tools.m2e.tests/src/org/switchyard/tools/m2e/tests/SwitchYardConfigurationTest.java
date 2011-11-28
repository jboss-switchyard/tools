/* 
 * JBoss, Home of Professional Open Source 
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved. 
 * See the copyright.txt in the distribution for a 
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use, 
 * modify, copy, or redistribute it subject to the terms and conditions 
 * of the GNU Lesser General Public License, v. 2.1. 
 * This program is distributed in the hope that it will be useful, but WITHOUT A 
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details. 
 * You should have received a copy of the GNU Lesser General Public License, 
 * v.2.1 along with this distribution; if not, write to the Free Software 
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA  02110-1301, USA.
 */
package org.switchyard.tools.m2e.tests;

import java.io.InputStreamReader;
import java.io.Reader;

import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.ElementNameAndAttributeQualifier;
import org.custommonkey.xmlunit.XMLUnit;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.m2e.core.project.ResolverConfiguration;
import org.eclipse.m2e.tests.common.AbstractMavenProjectTestCase;

/**
 * SwitchYardConfigurationTest
 * 
 * Tests for SwitchYard m2e extension.
 * 
 * @author Rob Cernich
 */
@SuppressWarnings("restriction")
public class SwitchYardConfigurationTest extends AbstractMavenProjectTestCase {

    /**
     * Tests import and configuration of bean-service quickstart.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testBeanServiceQuickstart() throws Exception {
        runProjectTest("bean-service");
    }

    /**
     * Tests import and configuration of helpdesk demo.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testHelpDeskDemo() throws Exception {
        runProjectTest("helpdesk");
    }

    private void runProjectTest(String projectName) throws Exception {
        ResolverConfiguration configuration = new ResolverConfiguration();
        IProject project = importProject("test-data/projects/" + projectName + "/pom.xml", configuration);
        waitForJobsToComplete();

        project.build(IncrementalProjectBuilder.FULL_BUILD, monitor);
        project.build(IncrementalProjectBuilder.INCREMENTAL_BUILD, monitor);
        waitForJobsToComplete();

        assertNoErrors(project);

        assertTrue(project.getFile("target/classes/META-INF/switchyard.xml").isSynchronized(IResource.DEPTH_ZERO));
        assertTrue(project.getFile("target/classes/META-INF/switchyard.xml").isAccessible());

        Reader sourceReader = null;
        Reader testReader = null;
        try {
            sourceReader = new InputStreamReader(project.getFile("target/classes/META-INF/switchyard.xml")
                    .getContents());
            testReader = new InputStreamReader(SwitchYardConfigurationTest.class.getClassLoader().getResourceAsStream(
                    "test-data/validation/" + projectName + "/META-INF/switchyard.xml"));
            Diff diff = XMLUnit.compareXML(sourceReader, testReader);
            diff.overrideElementQualifier(new ElementNameAndAttributeQualifier());
            assertTrue(diff.toString(), diff.similar());
        } finally {
            if (sourceReader != null) {
                try {
                    sourceReader.close();
                } catch (Exception e) {
                    // for codestyle check
                    e.fillInStackTrace();
                }
            }
            if (testReader != null) {
                try {
                    testReader.close();
                } catch (Exception e) {
                    // for codestyle check
                    e.fillInStackTrace();
                }
            }
        }
    }

}
