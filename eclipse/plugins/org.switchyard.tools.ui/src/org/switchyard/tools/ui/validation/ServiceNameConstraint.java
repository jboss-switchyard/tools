/*************************************************************************************
 * Copyright (c) 2014 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;

/**
 * ServiceNameConstraints
 * 
 * <p/>
 * Verifies that all composite-level services have unique names.
 */
public class ServiceNameConstraint extends AbstractModelConstraint {

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
        List<IStatus> statuses = new ArrayList<IStatus>();
        IStatus status = validateUniqueNames(ctx, composite);
        if (status != null) {
            statuses.add(status);
        }
        if (statuses.isEmpty()) {
            return ctx.createSuccessStatus();
        }
        return ConstraintStatus.createMultiStatus(ctx, statuses);
    }

    private IStatus validateUniqueNames(IValidationContext ctx, Composite composite) {
        final EList<Service> compositeServices = composite.getService();
        boolean dupd = false;
        ArrayList<String> allNames = new ArrayList<String>();
        ArrayList<EObject> allServices = new ArrayList<EObject>();
        Service dupeService = null;
        for (Service other : compositeServices) {
            allServices.add(other);
            if (allNames.contains(other.getName())) {
                dupeService = other;
                dupd = true;
                break;
            }
            allNames.add(other.getName());
        }
        if (dupd) {
            final ValidationProblem problem = ValidationProblem.DuplicateServiceName;
            return ConstraintStatus.createStatus(ctx, composite, allServices, problem.getSeverity(), problem.ordinal(),
                    problem.getMessage(), dupeService.getName());
        }
        return null;
    }
}
