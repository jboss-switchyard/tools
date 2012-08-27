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
package org.switchyard.tools.ui.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;

/**
 * ServiceInterfaceConstraint
 * 
 * <p/>
 * Validates the interface associated with a service/reference contract.
 */
public class ServiceInterfaceConstraint extends AbstractModelConstraint {

    @Override
    public IStatus validate(IValidationContext ctx) {
        EObject eObj = ctx.getTarget();
        EMFEventType eType = ctx.getEventType();

        // In the case of batch mode.
        if (eType == EMFEventType.NULL) {
            if (eObj instanceof Contract) {
                return validate(ctx, (Contract) eObj);
            }
            // } else { // In the case of live mode.
        }

        return ctx.createSuccessStatus();
    }

    private IStatus validate(IValidationContext ctx, Contract contract) {
        if (contract.getInterface() == null) {
            return ctx.createFailureStatus();
        }
        return ctx.createSuccessStatus();
    }

}
