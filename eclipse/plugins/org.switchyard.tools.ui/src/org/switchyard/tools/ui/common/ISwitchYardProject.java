/* 
 * JBoss, Home of Professional Open Source 
 * Copyright 2012 Red Hat Inc. and/or its affiliates and other contributors
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
}
