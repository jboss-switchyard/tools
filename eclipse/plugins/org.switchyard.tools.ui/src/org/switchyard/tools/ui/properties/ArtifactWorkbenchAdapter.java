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
package org.switchyard.tools.ui.properties;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.WorkbenchAdapter;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.IImageDescriptors;
import org.switchyard.tools.ui.explorer.IArtifactNode;

/**
 * ArtifactWorkbenchAdapter
 * 
 * <p/>
 * Provides workbench adapter for IArtifactNode objects.
 * 
 * @author Rob Cernich
 */
public class ArtifactWorkbenchAdapter extends WorkbenchAdapter {

    @Override
    public ImageDescriptor getImageDescriptor(Object object) {
        return Activator.getDefault().getImageRegistry().getDescriptor(IImageDescriptors.ARTIFACT_ICON);
    }

    @Override
    public String getLabel(Object o) {
        return ((IArtifactNode) o).getName();
    }

    @Override
    public Object getParent(Object o) {
        return ((IArtifactNode) o).getParent();
    }

}
