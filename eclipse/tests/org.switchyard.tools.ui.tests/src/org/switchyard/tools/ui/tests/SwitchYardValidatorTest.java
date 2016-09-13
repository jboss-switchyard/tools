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
import org.eclipse.core.runtime.CoreException;
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
        // should be 19, but changing to 18 until I can introduce the 19th error after the update 
        // to the ServiceInterfaceConstraint. I need to figure out how best to do that in this case.
        // so for now we'll set this to 18.
        assertEquals("Expecting 18 errors: " + WorkspaceHelpers.toString(markers), 18, errorCount);
        assertEquals("Expecting 5 warnings: " + WorkspaceHelpers.toString(markers), 5, warningCount);
        assertEquals("Expecting 0 infos: " + WorkspaceHelpers.toString(markers), 0, infoCount);
        assertEquals("Unexpected marker severity (not info, warning, error): " + WorkspaceHelpers.toString(markers), 0, unknownCount);

        ensureMarkersCleanedOnProjectClean(project);

        ensureValidationErrorFoundAfterFullBuild(project, switchYardFile, 23);
        
        MavenPlugin.getProjectConfigurationManager().updateProjectConfiguration(project, monitor);
        ensureMarkersCleanedOnProjectClean(project);

        ensureValidationErrorFoundAfterFullBuild(project, switchYardFile, 23);
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

        IMarker[] markers = switchYardFile.findMarkers(SwitchYardProjectValidator.SWITCHYARD_MARKER_ID, true, IFile.DEPTH_ZERO);
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

        ensureMarkersCleanedOnProjectClean(project);

        ensureValidationErrorFoundAfterFullBuild(project, switchYardFile, expectedErrorCount);

        MavenPlugin.getProjectConfigurationManager().updateProjectConfiguration(project, monitor);
        ensureMarkersCleanedOnProjectClean(project);

        ensureValidationErrorFoundAfterFullBuild(project, switchYardFile, expectedErrorCount);
    }

    private void ensureValidationErrorFoundAfterFullBuild(IProject project, IFile switchYardFile, int expectedErrorCount) throws CoreException, InterruptedException {
        project.build(IncrementalProjectBuilder.FULL_BUILD, monitor);
        waitForJobsToComplete();
        IMarker[] markers = switchYardFile.findMarkers(SwitchYardProjectValidator.SWITCHYARD_MARKER_ID, true, IFile.DEPTH_ZERO);
        assertEquals(WorkspaceHelpers.toString(markers), expectedErrorCount, markers.length);
    }

    private void ensureMarkersCleanedOnProjectClean(IProject project) throws InterruptedException, CoreException {
        waitForJobsToComplete();
        project.build(IncrementalProjectBuilder.CLEAN_BUILD, monitor);
        waitForJobsToComplete();
        IMarker[] markers = project.findMarkers(null, true, IFile.DEPTH_INFINITE);
        assertEquals(WorkspaceHelpers.toString(markers), 0, markers.length);
    }
}
