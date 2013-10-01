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
package org.switchyard.tools.ui.editor.diagram;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.wst.validation.ValidationFramework;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.Messages;

/**
 * ValidateModelFeature
 * 
 * <p/>
 * Custom feature used for validating the current state of the model.
 */
@SuppressWarnings("restriction")
public class ValidateModelFeature extends AbstractCustomFeature {

    /**
     * Create a new ValidateModelFeature.
     * 
     * @param fp the feature provider.
     */
    public ValidateModelFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public String getDescription() {
        return Messages.featureDescription_validate;
    }

    @Override
    public String getName() {
        return Messages.featureName_validate;
    }

    @Override
    public boolean canExecute(ICustomContext context) {
        return true;
    }

    @Override
    public void execute(ICustomContext context) {
        final Object bo = getBusinessObjectForPictogramElement(getDiagram());
        if (!(bo instanceof EObject)) {
            return;
        }
        final IFile switchYardFile = ResourcesPlugin.getWorkspace().getRoot()
                .getFile(new Path(((EObject) bo).eResource().getURI().toPlatformString(true)));
        try {
            ValidationFramework.getDefault().validate(switchYardFile, new NullProgressMonitor());
        } catch (CoreException e) {
            Activator.logStatus(e.getStatus());
        }
    }

    @Override
    public boolean hasDoneChanges() {
        // we never do any work
        return false;
    }

}
