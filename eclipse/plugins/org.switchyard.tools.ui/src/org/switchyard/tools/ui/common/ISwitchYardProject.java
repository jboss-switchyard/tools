/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.common;

import java.io.IOException;
import java.util.Set;

import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.switchyard.config.model.switchyard.SwitchYardModel;

/**
 * ISwitchYardProject
 * 
 * <p/>
 * Represents a SwitchYard project. Wraps and provides accessors for SwitchYard
 * specific meta-data.
 * 
 * @author Rob Cernich
 */
public interface ISwitchYardProject {

    /**
     * @return the underlying project.
     */
    IProject getProject();

    /**
     * @return the associated Maven project.
     */
    MavenProject getMavenProject();

    /**
     * @return the SwitchYard version.
     */
    String getVersion();

    /**
     * @return the property key used to define the SwitchYard version.
     */
    String getVersionPropertyKey();

    /**
     * @return the components configured on the project.
     */
    Set<ISwitchYardComponentExtension> getComponents();

    /**
     * @return true if dependencies are resolved using dependency management
     *         (i.e. getRawVersionString() == null).
     */
    boolean isUsingDependencyManagement();

    /**
     * @return the raw version string (e.g. ${switchyard.version}); may be null;
     */
    String getRawVersionString();

    /**
     * @return true if the meta-data for this project needs to be updated.
     */
    boolean needsLoading();

    /**
     * Scans resource folders for the first instance of META-INF/switchyard.xml.
     * If one is not located, the first applicable resource folder will be used.
     * 
     * @return the location of the switchyard.xml file.
     */
    public IFile getSwitchYardConfigurationFile();

    /**
     * Returns the location of the generated switchyard.xml file.
     * 
     * @return the location of the generated switchyard.xml file.
     */
    public IFile getOutputSwitchYardConfigurationFile();

    /**
     * Loads the SwitchYardModel associated with this project. This method will
     * return an empty model if a switchyard.xml file does not exist within the
     * project.
     * 
     * @param monitor the progress monitor.
     * @return the SwitchYardModel associated with this project.
     * @throws CoreException if an error occurs accessing the workspace
     *             resource.
     * @throws IOException if an error occurs loading the model.
     */
    public SwitchYardModel loadSwitchYardModel(IProgressMonitor monitor) throws CoreException, IOException;

    /**
     * Force loading of project meta-data. This may be a long running operation
     * depending on whether or not Maven project meta-data has been cached (i.e.
     * this may force a load of the Maven meta-data).
     * 
     * @param monitor the progress monitor.
     */
    void load(IProgressMonitor monitor);

    /**
     * @return a working copy for making changes to SwitchYard settings.
     */
    ISwitchYardProjectWorkingCopy createWorkingCopy();
    
    /**
     * Scans resource folders for the first instance of features.xml.
     * If one is not located, the first applicable resource folder will be used.
     * 
     * @return the location of the features.xml file.
     */
    public IFile getSwitchYardFeaturesFile();
}
