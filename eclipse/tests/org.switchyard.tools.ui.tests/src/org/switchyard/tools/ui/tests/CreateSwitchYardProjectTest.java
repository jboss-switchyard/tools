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
package org.switchyard.tools.ui.tests;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.m2e.tests.common.AbstractMavenProjectTestCase;
import org.switchyard.tools.ui.operations.CreateSwitchYardProjectOperation;

/**
 * CreateSwitchYardProjectTest
 * 
 * Tests CreateSwitchYardProjectOperation.
 * 
 * @author Rob Cernich
 */
@SuppressWarnings("restriction")
public class CreateSwitchYardProjectTest extends AbstractMavenProjectTestCase {

    /**
     * Tests the creation of a SwitchYard project: project, pom.xml,
     * switchyard.xml creation.
     * 
     * @throws Exception if an error occurs or test fails.
     */
    public void testCreateSwitchYardProjectOperation() throws Exception {
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IProject newProjectHandle = workspace.getRoot().getProject(CreateSwitchYardProjectTest.class.getSimpleName());
        String packageName = "test.package.name";
        String groupId = "test.project.group";
        String version = "0.0.1-SNAPSHOT";
        String runtimeVersion = "0.2.0";

        assertTrue("Project already exists.", !newProjectHandle.exists());

        final CreateSwitchYardProjectOperation op = new CreateSwitchYardProjectOperation(newProjectHandle, null,
                packageName, groupId, version, runtimeVersion, null);
        workspace.run(op, new NullProgressMonitor());

        waitForJobsToComplete();
        newProjectHandle.build(IncrementalProjectBuilder.FULL_BUILD, monitor);

        assertNoErrors(newProjectHandle);

        assertTrue(
                "Project contains errors",
                newProjectHandle.findMaxProblemSeverity(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE) < IMarker.SEVERITY_ERROR);

        assertTrue("Failed to create switchyard.xml",
                newProjectHandle.getFile("src/main/resources/META-INF/switchyard.xml").exists());

        assertTrue("Failed to create pom.xml", newProjectHandle.getFile("pom.xml").exists());
    }

}
