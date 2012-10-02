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
package org.switchyard.tools.ui.editor.transform;

import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;

/**
 * ITransformControl
 * 
 * <p/>
 * A control for collecting information required to create transforms.
 */
public interface ITransformControl {

    /**
     * Set the visibility of the controls.
     * 
     * @param visible true to make the control visible.
     */
    public void setVisible(boolean visible);

    /**
     * @param transforms the transforms selected for creation.
     */
    public void setSelectedTransforms(Collection<TransformType> transforms);

    /**
     * @return validate the controls.
     */
    public IStatus validate();

    /**
     * @return the created transforms.
     * 
     * @throws CoreException if something goes wrong creating the transforms
     */
    public Collection<TransformType> createTransforms() throws CoreException;

    /**
     * @param data the layout data to set on the control.
     */
    public void setLayoutData(Object data);

    /**
     * Clean up any resources allocated, if necessary.
     */
    public void dispose();
}
