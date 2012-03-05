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
