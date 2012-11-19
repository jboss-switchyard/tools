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
package org.switchyard.tools.m2e;

import java.io.File;
import java.util.Set;

import org.apache.maven.model.Resource;
import org.apache.maven.plugin.MojoExecution;
import org.codehaus.plexus.util.Scanner;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.project.configurator.MojoExecutionBuildParticipant;
import org.sonatype.plexus.build.incremental.BuildContext;

/**
 * SwitchYardBuildParticipant
 * 
 * Manages SwitchYard mojo execution during Eclipse builds.
 * 
 * @author Rob Cernich
 */
public class SwitchYardBuildParticipant extends MojoExecutionBuildParticipant {

    private static final String SWITCHYARD_DEFAULT_OUTPUT_FILE_PATH = "META-INF/switchyard.xml";

    /**
     * Create a new SwitchYardBuildParticipant.
     * 
     * @param execution the execution wrapped by this build participant.
     */
    public SwitchYardBuildParticipant(MojoExecution execution) {
        super(execution, true);
    }

    @Override
    public Set<IProject> build(int kind, IProgressMonitor monitor) throws Exception {
        File outputDirectory = getOutputDirectory();
        File outputFile = getOutputFile(outputDirectory);

        if (IncrementalProjectBuilder.FULL_BUILD == kind) {
            // skip delta scanning and just perform the build.
            return performBuild(outputFile, kind, monitor);
        }

        // scan for changes
        // scan for changes to META-INF/switchyard.xml source file
        BuildContext buildContext = getBuildContext();
        Resource[] resources = getResources();
        for (Resource resource : resources) {
            if (resource.getDirectory() == null) {
                continue;
            }
            File testFile = new File(resource.getDirectory(), SWITCHYARD_DEFAULT_OUTPUT_FILE_PATH).getCanonicalFile();
            if (testFile.exists() && buildContext.hasDelta(testFile)) {
                return performBuild(outputFile, kind, monitor);
            }
        }

        // scan for changes in "scanned" output folders
        File[] scanDirectories = getScanDirectories(outputDirectory);
        String outputFilePath = outputFile.getCanonicalPath();
        for (File scanDirectory : scanDirectories) {
            Scanner scanner = buildContext.newScanner(scanDirectory);
            String scanPath = scanDirectory.getCanonicalPath();
            String[] excludes = null;
            if (outputFilePath.startsWith(scanPath)) {
                // we'll be changing this file and we don't want any infinite
                // build loops
                excludes = new String[] {outputFilePath.substring(scanPath.length()) };
                scanner.setExcludes(excludes);
            }
            scanner.scan();
            String[] includedFiles = scanner.getIncludedFiles();
            if (includedFiles != null && includedFiles.length > 0) {
                return performBuild(outputFile, kind, monitor);
            }
            scanner = buildContext.newDeleteScanner(scanDirectory);
            if (excludes != null) {
                scanner.setExcludes(excludes);
            }
            scanner.scan();
            includedFiles = scanner.getIncludedFiles();
            if (includedFiles != null && includedFiles.length > 0) {
                return performBuild(outputFile, kind, monitor);
            }
        }
        return null;
    }

    private Set<IProject> performBuild(File outputFile, int kind, IProgressMonitor monitor) throws Exception {
        Set<IProject> result = super.build(kind, monitor);
        getBuildContext().refresh(outputFile);
        return result;
    }

    private File getOutputDirectory() throws CoreException {
        File outputDirectory = MavenPlugin.getMaven().getMojoParameterValue(getSession(), getMojoExecution(),
                "_project_build_outputDirectory", File.class);
        if (outputDirectory == null) {
            // pre-0.6 property name
            outputDirectory = MavenPlugin.getMaven().getMojoParameterValue(getSession(), getMojoExecution(),
                    "outputDirectory", File.class);
        }
        return outputDirectory;
    }

    private File getOutputFile(File outputDirectory) throws CoreException {
        File outputFile = MavenPlugin.getMaven().getMojoParameterValue(getSession(), getMojoExecution(), "_outputFile",
                File.class);
        if (outputFile == null) {
            // pre-0.6 property name
            outputFile = MavenPlugin.getMaven().getMojoParameterValue(getSession(), getMojoExecution(), "outputFile",
                    File.class);
            if (outputFile == null) {
                outputFile = new File(outputDirectory, SWITCHYARD_DEFAULT_OUTPUT_FILE_PATH);
            }
        }
        return outputFile;
    }

    private Resource[] getResources() throws CoreException {
        Resource[] resources = MavenPlugin.getMaven().getMojoParameterValue(getSession(), getMojoExecution(),
                "_project_resources", Resource[].class);
        if (resources == null || resources.length == 0) {
            // pre-0.6 property name
            resources = MavenPlugin.getMaven().getMojoParameterValue(getSession(), getMojoExecution(), "resources",
                    Resource[].class);
            if (resources == null) {
                return new Resource[0];
            }
        }
        return resources;
    }

    private File[] getScanDirectories(File outputDirectory) throws CoreException {
        File[] scanDirectories = MavenPlugin.getMaven().getMojoParameterValue(getSession(), getMojoExecution(),
                "_scanDirectories", File[].class);
        if (scanDirectories == null || scanDirectories.length == 0) {
            // pre-0.6 property name
            scanDirectories = MavenPlugin.getMaven().getMojoParameterValue(getSession(), getMojoExecution(),
                    "scanDirectories", File[].class);
            if (scanDirectories == null || scanDirectories.length == 0) {
                return new File[] {outputDirectory };
            }
        }
        return scanDirectories;
    }

}
