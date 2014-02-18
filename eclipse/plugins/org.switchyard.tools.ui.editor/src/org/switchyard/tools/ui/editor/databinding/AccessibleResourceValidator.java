/******************************************************************************* 
 * Copyright (c) 2014 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.editor.databinding;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.switchyard.tools.ui.PlatformResourceAdapterFactory;
import org.switchyard.tools.ui.SwitchYardModelUtils;
import org.switchyard.tools.ui.editor.Activator;

/**
 * AccessibleResourceValidator
 * <p/>
 * Validates that the specified resource is accessible via the project's
 * classpath.
 */
public class AccessibleResourceValidator implements IValidator {

    private final IObservableValue _target;

    /**
     * Create a new AccessibleResourceValidator.
     * 
     * @param target the target value, used to reconcile the classpath.
     */
    public AccessibleResourceValidator(IObservableValue target) {
        _target = target;
    }

    @Override
    public IStatus validate(Object value) {
        if (value == null || ((String) value).trim().isEmpty()) {
            return Status.OK_STATUS;
        }
        final IProject project = resolveCurrentProject();
        if (project == null || !project.getProject().isAccessible()) {
            return new Status(Status.WARNING, Activator.PLUGIN_ID, "Cannot verify accessibility of specified resource.");
        } else if (SwitchYardModelUtils.getJavaResource(project, (String) value) != null) {
            return Status.OK_STATUS;
        }
        return new Status(Status.WARNING, Activator.PLUGIN_ID, "Specified resource is not on the project's classpath.");
    }

    private IProject resolveCurrentProject() {
        try {
            return PlatformResourceAdapterFactory.getContainingProject(_target.getValue());
        } catch (Throwable e) {
            return null;
        }
    }

}
