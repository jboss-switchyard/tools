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
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import org.apache.maven.model.Resource;
import org.apache.maven.plugin.MojoExecution;
import org.codehaus.plexus.util.Scanner;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.project.configurator.MojoExecutionBuildParticipant;
import org.eclipse.wst.validation.ValidationFramework;
import org.sonatype.plexus.build.incremental.BuildContext;

/**
 * SwitchYardBuildParticipant
 * 
 * Manages SwitchYard mojo execution during Eclipse builds.
 * 
 * @author Rob Cernich
 */
public class SwitchYardBuildParticipant extends MojoExecutionBuildParticipant {

    private static final String SWITCHYARD_DEFAULT_OUTPUT_FILE_PATH = "META-INF/switchyard.xml"; //$NON-NLS-1$

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
                // switchyard.xml source file changed
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
            if ((includedFiles != null && includedFiles.length > 0) || checkRefreshedFiles(scanDirectory, outputFile)) {
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
        IFile workspaceOutputFile = ResourcesPlugin.getWorkspace().getRoot()
                .getFileForLocation(new Path(outputFile.getAbsolutePath()));
        if (workspaceOutputFile != null) {
            try {
                workspaceOutputFile.refreshLocal(IResource.DEPTH_ZERO, monitor);
            } catch (CoreException e) {
                e.fillInStackTrace();
            }
        }
        IProject project = getMavenProjectFacade().getProject();
        for (IPath resourceFolder : getMavenProjectFacade().getResourceLocations()) {
            IFile sourceFile = project.getFile(resourceFolder.append(SWITCHYARD_DEFAULT_OUTPUT_FILE_PATH));
            if (sourceFile.exists()) {
                ValidationFramework.getDefault().validate(sourceFile, monitor);
                break;
            }
        }
        return result;
    }

    /**
     * This scans the refreshed list on the build context to see if the
     * specified scan directory may have been changed by a build participant
     * earlier in the execution. The resource delta backing the scanner may not
     * include these files.
     * 
     * @param scanDirectory directory to check
     * @param outputFile the outputFile to ignore
     * @return true if a previous build participant may have updated the file.
     */
    private boolean checkRefreshedFiles(File scanDirectory, File outputFile) {
        if (scanDirectory == null) {
            return false;
        }
        try {
            final IPath scanPath = new Path(scanDirectory.getCanonicalPath());
            for (File refreshed : getRefreshedFiles()) {
                if (refreshed == null) {
                    continue;
                }
                try {
                    if (scanDirectory.equals(refreshed)
                            || (!refreshed.isDirectory() && !refreshed.equals(outputFile) && scanPath
                                    .isPrefixOf(new Path(refreshed.getCanonicalPath())))) {
                        return true;
                    }
                } catch (Exception e) {
                    e.fillInStackTrace();
                }
            }
        } catch (Exception e) {
            e.fillInStackTrace();
        }
        return false;
    }

    /**
     * The Eclipse build context changed packages between m2e 1.4 and 1.5, see
     * if we can work with both.
     * 
     * @return the collection of refreshed files
     */
    @SuppressWarnings("unchecked")
    private Collection<File> getRefreshedFiles() {
        final BuildContext buildContext = getBuildContext();
        try {
            final Method getFilesMethod = buildContext.getClass().getMethod("getFiles", new Class<?>[0]);
            return (Collection<File>) getFilesMethod.invoke(buildContext, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptySet();
    }

    private File getOutputDirectory() throws CoreException {
        File outputDirectory = MavenPlugin.getMaven().getMojoParameterValue(getMavenProjectFacade().getMavenProject(),
                getMojoExecution(), "_project_build_outputDirectory", File.class, new NullProgressMonitor()); //$NON-NLS-1$
        if (outputDirectory == null) {
            // pre-0.6 property name
            outputDirectory = MavenPlugin.getMaven().getMojoParameterValue(getMavenProjectFacade().getMavenProject(),
                    getMojoExecution(), "outputDirectory", File.class, new NullProgressMonitor()); //$NON-NLS-1$
        }
        return outputDirectory;
    }

    private File getOutputFile(File outputDirectory) throws CoreException {
        File outputFile = MavenPlugin.getMaven().getMojoParameterValue(getMavenProjectFacade().getMavenProject(),
                getMojoExecution(), "_outputFile", //$NON-NLS-1$
                File.class, new NullProgressMonitor());
        if (outputFile == null) {
            // pre-0.6 property name
            outputFile = MavenPlugin.getMaven().getMojoParameterValue(getMavenProjectFacade().getMavenProject(),
                    getMojoExecution(), "outputFile", //$NON-NLS-1$
                    File.class, new NullProgressMonitor());
            if (outputFile == null) {
                outputFile = new File(outputDirectory, SWITCHYARD_DEFAULT_OUTPUT_FILE_PATH);
            }
        }
        return outputFile;
    }

    private Resource[] getResources() throws CoreException {
        Resource[] resources = MavenPlugin.getMaven().getMojoParameterValue(getMavenProjectFacade().getMavenProject(),
                getMojoExecution(), "_project_resources", Resource[].class, new NullProgressMonitor()); //$NON-NLS-1$
        if (resources == null || resources.length == 0) {
            // pre-0.6 property name
            resources = MavenPlugin.getMaven().getMojoParameterValue(getMavenProjectFacade().getMavenProject(),
                    getMojoExecution(), "resources", //$NON-NLS-1$
                    Resource[].class, new NullProgressMonitor());
            if (resources == null) {
                return new Resource[0];
            }
        }
        return resources;
    }

    private File[] getScanDirectories(File outputDirectory) throws CoreException {
        File[] scanDirectories = MavenPlugin.getMaven().getMojoParameterValue(
                getMavenProjectFacade().getMavenProject(), getMojoExecution(),
                "_scanDirectories", File[].class, new NullProgressMonitor()); //$NON-NLS-1$
        if (scanDirectories == null || scanDirectories.length == 0) {
            // pre-0.6 property name
            scanDirectories = MavenPlugin.getMaven().getMojoParameterValue(getMavenProjectFacade().getMavenProject(),
                    getMojoExecution(), "scanDirectories", File[].class, new NullProgressMonitor()); //$NON-NLS-1$
            if (scanDirectories == null || scanDirectories.length == 0) {
                return new File[] {outputDirectory };
            }
        }
        return scanDirectories;
    }

}
