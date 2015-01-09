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
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.switchyard.tools.ui.PlatformResourceAdapterFactory;
import org.switchyard.tools.ui.editor.Activator;

/**
 * AccessibleClassValidator
 * <p/>
 * Validates that the specified class is accessible via the project's classpath.
 */
public class AccessibleClassValidator implements IValidator {

    private final IObservableValue _target;
    private final EObject _container;

    /**
     * Create a new AccessibleClassValidator.
     * 
     * @param target the target value, used to reconcile the classpath.
     */
    public AccessibleClassValidator(IObservableValue target) {
        _target = target;
        _container = null;
    }
    
    /**
     * Create a new AccessibleClassValidator.
     * 
     * @param target the target value, used to reconcile the classpath.
     * @param container is the target's container - useful if on the wizard where a binding
     * doesn't have a container yet. 
     */
    public AccessibleClassValidator(IObservableValue target, EObject container) {
        _target = target;
        _container = container;
    }

    @Override
    public IStatus validate(Object value) {
        if (value == null || ((String) value).trim().isEmpty()) {
            return Status.OK_STATUS;
        }
        try {
            final IJavaProject project = resolveCurrentJavaProject();
            if (project == null || !project.getProject().isAccessible()) {
                return new Status(Status.WARNING, Activator.PLUGIN_ID,
                        "Cannot verify accessibility of specified class.");
            } else if (project.findType((String) value) != null) {
                return Status.OK_STATUS;
            }
        } catch (JavaModelException e) {
            e.fillInStackTrace();
        }
        return new Status(Status.WARNING, Activator.PLUGIN_ID, "Specified class is not on the project's classpath.");
    }

    private IJavaProject resolveCurrentJavaProject() {
        try {
            if (_container != null) {
                return JavaCore.create(PlatformResourceAdapterFactory.getContainingProject(_container));
            }
            return JavaCore.create(PlatformResourceAdapterFactory.getContainingProject(_target.getValue()));
        } catch (Throwable e) {
            return null;
        }
    }

}
