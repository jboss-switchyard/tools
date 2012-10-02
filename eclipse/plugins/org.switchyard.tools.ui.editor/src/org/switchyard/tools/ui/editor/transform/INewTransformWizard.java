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

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.wizard.IWizard;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;

/**
 * INewTransformWizard
 * 
 * <p/>
 * Interface for new transforms.
 */
public interface INewTransformWizard extends IWizard {

    /**
     * @param project the project that will contain the new transforms.
     */
    public void init(IProject project);

    /**
     * @param transforms the transforms to be created.
     */
    public void setSelectedTransforms(Collection<TransformType> transforms);

    /**
     * @return the transforms created by this wizard.
     */
    public Collection<TransformType> getCreatedTransforms();
}
