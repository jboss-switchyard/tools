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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.tests.common.AbstractMavenProjectTestCase;
import org.eclipse.m2e.tests.common.WorkspaceHelpers;
import org.switchyard.tools.ui.validation.SwitchYardProjectValidator;

/**
 * SwitchYardValidatorTest
 * 
 * Tests the validator logic.
 * 
 * @author Rob Cernich, Brian Fitzpatrick
 */
@SuppressWarnings("restriction")
public class SwitchYardValidatorTest extends AbstractMavenProjectTestCase {

    /**
     * Tests wiring validation.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testWiringValidation() throws Exception {
        IProject project = importProject("test-data/validator-tests/wiring-validation-tests/pom.xml");
        waitForJobsToComplete();

        project.build(IncrementalProjectBuilder.FULL_BUILD, monitor);
        waitForJobsToComplete();
        project.build(IncrementalProjectBuilder.INCREMENTAL_BUILD, monitor);
        waitForJobsToComplete();

        IFile switchYardFile = project.getFile("src/main/resources/META-INF/switchyard.xml");
        assertTrue("switchyard.xml does not exist.", switchYardFile != null && switchYardFile.exists());

        IMarker[] markers = switchYardFile.findMarkers(SwitchYardProjectValidator.SWITCHYARD_MARKER_ID, true,
                IFile.DEPTH_ZERO);
        int errorCount = 0;
        int warningCount = 0;
        int infoCount = 0;
        int unknownCount = 0;
        for (IMarker marker : markers) {
            switch (marker.getAttribute(IMarker.SEVERITY, -1)) {
            case IMarker.SEVERITY_ERROR:
                ++errorCount;
                break;
            case IMarker.SEVERITY_INFO:
                ++infoCount;
                break;
            case IMarker.SEVERITY_WARNING:
                ++warningCount;
                break;
            default:
                ++unknownCount;
                break;
            }
        }
        assertEquals("Expecting 16 errors: " + WorkspaceHelpers.toString(markers), 16, errorCount);
        assertEquals("Expecting 6 warnings: " + WorkspaceHelpers.toString(markers), 6, warningCount);
        assertEquals("Expecting 0 infos: " + WorkspaceHelpers.toString(markers), 0, infoCount);
        assertEquals("Unexpected marker severity (not info, warning, error): " + WorkspaceHelpers.toString(markers), 0,
                unknownCount);

        project.build(IncrementalProjectBuilder.CLEAN_BUILD, monitor);
        waitForJobsToComplete();
        markers = project.findMarkers(null, true, IFile.DEPTH_INFINITE);
        assertEquals(WorkspaceHelpers.toString(markers), 0, markers.length);

        project.build(IncrementalProjectBuilder.FULL_BUILD, monitor);
        waitForJobsToComplete();
        markers = switchYardFile.findMarkers(SwitchYardProjectValidator.SWITCHYARD_MARKER_ID, true,
                IFile.DEPTH_ZERO);
        assertEquals(WorkspaceHelpers.toString(markers), 21, markers.length);
        
        MavenPlugin.getProjectConfigurationManager().updateProjectConfiguration(project, monitor);
        project.build(IncrementalProjectBuilder.CLEAN_BUILD, monitor);
        waitForJobsToComplete();
        markers = project.findMarkers(null, true, IFile.DEPTH_INFINITE);
        assertEquals(WorkspaceHelpers.toString(markers), 0, markers.length);

        project.build(IncrementalProjectBuilder.FULL_BUILD, monitor);
        waitForJobsToComplete();
        markers = switchYardFile.findMarkers(SwitchYardProjectValidator.SWITCHYARD_MARKER_ID, true,
                IFile.DEPTH_ZERO);
        assertEquals(WorkspaceHelpers.toString(markers), 21, markers.length);
    }

    /**
     * Tests Camel route validation.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testCamelRouteValidation() throws Exception {
        IProject project = importProject("test-data/validator-tests/camel-route-tests/pom.xml");
        waitForJobsToComplete();

        project.build(IncrementalProjectBuilder.FULL_BUILD, monitor);
        waitForJobsToComplete();
        project.build(IncrementalProjectBuilder.INCREMENTAL_BUILD, monitor);
        waitForJobsToComplete();

        IFile switchYardFile = project.getFile("src/main/resources/META-INF/switchyard.xml");
        assertTrue("switchyard.xml does not exist.", switchYardFile != null && switchYardFile.exists());

        IMarker[] markers = switchYardFile.findMarkers(SwitchYardProjectValidator.SWITCHYARD_MARKER_ID, true,
                IFile.DEPTH_ZERO);
        int errorCount = 0;
        int warningCount = 0;
        int infoCount = 0;
        int unknownCount = 0;
        for (IMarker marker : markers) {
            switch (marker.getAttribute(IMarker.SEVERITY, -1)) {
            case IMarker.SEVERITY_ERROR:
                ++errorCount;
                break;
            case IMarker.SEVERITY_INFO:
                ++infoCount;
                break;
            case IMarker.SEVERITY_WARNING:
                ++warningCount;
                break;
            default:
                ++unknownCount;
                break;
            }
        }

        int expectedErrorCount = 12;
        assertEquals("Expecting " + expectedErrorCount + " errors: " + WorkspaceHelpers.toString(markers), expectedErrorCount, errorCount);
        assertEquals("Expecting 0 warnings: " + WorkspaceHelpers.toString(markers), 0, warningCount);
        assertEquals("Expecting 0 infos: " + WorkspaceHelpers.toString(markers), 0, infoCount);
        assertEquals("Unexpected marker severity (not info, warning, error): " + WorkspaceHelpers.toString(markers), 0,
                unknownCount);

        project.build(IncrementalProjectBuilder.CLEAN_BUILD, monitor);
        waitForJobsToComplete();
        markers = project.findMarkers(null, true, IFile.DEPTH_INFINITE);
        assertEquals(WorkspaceHelpers.toString(markers), 0, markers.length);

        project.build(IncrementalProjectBuilder.FULL_BUILD, monitor);
        waitForJobsToComplete();
        markers = switchYardFile.findMarkers(SwitchYardProjectValidator.SWITCHYARD_MARKER_ID, true,
                IFile.DEPTH_ZERO);
        assertEquals(WorkspaceHelpers.toString(markers), expectedErrorCount, markers.length);

        MavenPlugin.getProjectConfigurationManager().updateProjectConfiguration(project, monitor);
        project.build(IncrementalProjectBuilder.CLEAN_BUILD, monitor);
        waitForJobsToComplete();
        markers = project.findMarkers(null, true, IFile.DEPTH_INFINITE);
        assertEquals(WorkspaceHelpers.toString(markers), 0, markers.length);

        project.build(IncrementalProjectBuilder.FULL_BUILD, monitor);
        waitForJobsToComplete();
        markers = switchYardFile.findMarkers(SwitchYardProjectValidator.SWITCHYARD_MARKER_ID, true,
                IFile.DEPTH_ZERO);
        assertEquals(WorkspaceHelpers.toString(markers), expectedErrorCount, markers.length);
    }
}
