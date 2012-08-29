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

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;

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
            if (contract instanceof Service) {
                // service can inherit from the component service it is
                // promoting.
                return ctx.createSuccessStatus();
            } else if (contract instanceof Reference) {
                List<ComponentReference> promotions = ((Reference) contract).getPromote();
                if (promotions != null && promotions.size() > 1) {
                    Interface baseInterface = promotions.get(0).getInterface();
                    for (ComponentReference promotedReference : promotions) {
                        if (!EcoreUtil.equals(baseInterface, promotedReference.getInterface())) {
                            return ctx.createFailureStatus();
                        }
                    }
                }
                return ctx.createSuccessStatus();
            }
            return ctx.createFailureStatus();
        }
        return ctx.createSuccessStatus();
    }

}
