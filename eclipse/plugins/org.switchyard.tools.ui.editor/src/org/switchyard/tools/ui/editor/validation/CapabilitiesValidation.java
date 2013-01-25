/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.editor.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.switchyard.tools.ui.common.ISwitchYardComponentExtension;
import org.switchyard.tools.ui.common.ISwitchYardComponentExtension.Category;
import org.switchyard.tools.ui.common.SwitchYardComponentExtensionManager;
import org.switchyard.tools.ui.common.impl.SwitchYardProjectManager;
import org.switchyard.tools.ui.editor.BindingTypeExtensionManager;
import org.switchyard.tools.ui.editor.ComponentTypeExtensionManager;
import org.switchyard.tools.ui.validation.ValidationProblem;

/**
 * CapabilitiesValidation
 * 
 * <p/>
 * Validates capability utilization within the project/configuration.
 */
public class CapabilitiesValidation extends AbstractModelConstraint {

    @Override
    public IStatus validate(IValidationContext ctx) {
        EObject eObj = ctx.getTarget();
        EMFEventType eType = ctx.getEventType();

        // In the case of batch mode.
        if (eType == EMFEventType.NULL) {
            if (eObj instanceof Composite) {
                return validate(ctx, (Composite) eObj);
            }
            // } else { // In the case of live mode.
        }

        return ctx.createSuccessStatus();
    }

    private IStatus validate(IValidationContext ctx, Composite composite) {
        final List<IStatus> statuses = new ArrayList<IStatus>();
        final Set<ISwitchYardComponentExtension> configured = getConfiguredCapabilities(composite);
        final Set<ISwitchYardComponentExtension> allRequired = new HashSet<ISwitchYardComponentExtension>();
        final Collection<Binding> bindings = new ArrayList<Binding>();
        final Collection<Implementation> implementations = new ArrayList<Implementation>();
        for (Iterator<EObject> it = composite.eAllContents(); it.hasNext();) {
            final EObject next = it.next();
            if (next instanceof Binding) {
                bindings.add((Binding) next);
            } else if (next instanceof Implementation) {
                implementations.add((Implementation) next);
            }
        }
        for (Binding binding : bindings) {
            final Set<ISwitchYardComponentExtension> required = getComponents(BindingTypeExtensionManager.instance()
                    .getExtensionFor(binding.getClass()).getRequiredCapabilities(binding));
            allRequired.addAll(required);
            required.removeAll(configured);
            for (ISwitchYardComponentExtension missing : required) {
                final ValidationProblem problem = ValidationProblem.RequiredCapabilityMissing;
                // add the error to the container so it's visible in the diagram
                statuses.add(ConstraintStatus.createStatus(ctx, binding.eContainer(), null, problem.getSeverity(),
                        problem.ordinal(), problem.getMessage(), missing.getName(), "binding"));
            }
        }
        for (Implementation implementation : implementations) {
            final Set<ISwitchYardComponentExtension> required = getComponents(ComponentTypeExtensionManager.instance()
                    .getExtensionFor(implementation.getClass()).getRequiredCapabilities(implementation));
            allRequired.addAll(required);
            required.removeAll(configured);
            for (ISwitchYardComponentExtension missing : required) {
                final ValidationProblem problem = ValidationProblem.RequiredCapabilityMissing;
                // add the error to the container so it's visible in the diagram
                statuses.add(ConstraintStatus.createStatus(ctx, implementation.eContainer(), null,
                        problem.getSeverity(), problem.ordinal(), problem.getMessage(), missing.getName(),
                        "implementation"));
            }
        }

        /*
         * TODO: if we add more categories, we may need to remove anything that
         * is not in the set(gateway|implementation).
         */
        // remove the ones we need
        configured.removeAll(allRequired);
        // remove test capabilities
        configured.removeAll(SwitchYardComponentExtensionManager.instance().getComponentExtensions(Category.TEST));
        // remove the core runtime
        configured.remove(SwitchYardComponentExtensionManager.instance().getRuntimeComponentExtension());
        for (ISwitchYardComponentExtension superfluous : configured) {
            final ValidationProblem problem = ValidationProblem.UnusedCapability;
            statuses.add(ConstraintStatus.createStatus(ctx, composite, null, problem.getSeverity(), problem.ordinal(),
                    problem.getMessage(), superfluous.getName()));
        }
        if (statuses.isEmpty()) {
            return ctx.createSuccessStatus();
        }
        return ConstraintStatus.createMultiStatus(ctx, statuses);
    }

    private Set<ISwitchYardComponentExtension> getComponents(Collection<String> ids) {
        if (ids == null) {
            return Collections.emptySet();
        }
        Set<ISwitchYardComponentExtension> components = new HashSet<ISwitchYardComponentExtension>();
        for (String id : ids) {
            ISwitchYardComponentExtension component = SwitchYardComponentExtensionManager.instance()
                    .getComponentExtension(id);
            if (component != null) {
                components.add(component);
            }
        }
        return components;
    }

    private Set<ISwitchYardComponentExtension> getConfiguredCapabilities(Composite composite) {
        final Resource resource = composite.eResource();
        final IFile file = ResourcesPlugin.getWorkspace().getRoot()
                .getFile(new Path(resource.getURI().toPlatformString(true)));
        return new HashSet<ISwitchYardComponentExtension>(SwitchYardProjectManager.instance()
                .getSwitchYardProject(file.getProject()).getComponents());
    }
}
