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

import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * ISwitchYardProjectWorkingCopy
 * 
 * <p/>
 * Manages modifications to a SwitchYard project.
 * 
 * @author Rob Cernich
 */
public interface ISwitchYardProjectWorkingCopy extends ISwitchYardProject {

    /**
     * @param version the new version.
     */
    void setRuntimeVersion(String version);

    /**
     * @param component the component to add.
     */
    void addComponent(ISwitchYardComponentExtension component);

    /**
     * @param components the components to add.
     */
    void addComponents(Collection<ISwitchYardComponentExtension> components);

    /**
     * @param component the component to remove.
     */
    void removeComponent(ISwitchYardComponentExtension component);

    /**
     * @param components the components to remove.
     */
    void removeComponents(Collection<ISwitchYardComponentExtension> components);

    /**
     * @return true if any SwitchYard settings have been modified.
     */
    boolean isModified();

    /**
     * Incorporates any changes into the project's pom.xml. If the commit
     * operation is successful, isModified() will return false.
     * 
     * @param monitor the progress monitor.
     * @throws CoreException if something goes awry.
     */
    void commit(IProgressMonitor monitor) throws CoreException;

    /**
     * Resets any changes made to this working copy. After calling this method,
     * isModified() will return false.
     */
    void revert();

    /**
     * Releases resources held by the working copy.
     */
    void dispose();
}
