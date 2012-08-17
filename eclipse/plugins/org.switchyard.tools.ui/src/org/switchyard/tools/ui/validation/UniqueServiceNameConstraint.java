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

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;

/**
 * UniqueServiceNameConstraint
 * 
 * <p/>
 * Checks to make sure all component service names are unique.
 */
public class UniqueServiceNameConstraint extends AbstractModelConstraint {

    @Override
    public IStatus validate(IValidationContext ctx) {
        EObject eObj = ctx.getTarget();
        EMFEventType eType = ctx.getEventType();

        // In the case of batch mode.
        if (eType == EMFEventType.NULL) {
            System.err.println("Batch: " + getClass().getSimpleName() + ": " + eObj);
            if (eObj instanceof Contract) {
                return validate(ctx, (Contract) eObj);
            }
        } else { // In the case of live mode.
            System.err.println("Live: " + getClass().getSimpleName() + ": " + eObj + ": " + ctx.getFeatureNewValue());
        }

        return ctx.createSuccessStatus();
    }

    private IStatus validate(IValidationContext ctx, Contract contract) {
        ctx.skipCurrentConstraintFor(contract);
        if (contract == null || contract instanceof ComponentReference || contract.getName() == null) {
            return ctx.createSuccessStatus();
        }

        @SuppressWarnings("unchecked")
        Map<String, Set<Contract>> names = (Map<String, Set<Contract>>) ctx.getCurrentConstraintData();
        if (names == null) {
            names = collectNames(getSwitchYard(ctx.getTarget().eResource()));
            ctx.putCurrentConstraintData(names);
        }
        Set<Contract> contracts = names.get(contract.getName());
        if (contracts == null) {
            contracts = new LinkedHashSet<Contract>();
            names.put(contract.getName(), contracts);
            return ctx.createSuccessStatus();
        }
        Set<Contract> duplicates = new LinkedHashSet<Contract>();
        int count = 0;
        for (Contract other : contracts) {
            duplicates.add(other);
            if (other == contract || (other instanceof Service && ((Service) other).getPromote() == contract)
                    || (contract instanceof Service && ((Service) contract).getPromote() == other)) {
                continue;
            }
            ++count;
        }
        if (count == 0) {
            return ctx.createSuccessStatus();
        }
        ctx.addResults(duplicates);
        return ctx.createFailureStatus(contract.getName());
    }

    private Map<String, Set<Contract>> collectNames(SwitchYardType switchyard) {
        Map<String, Set<Contract>> names = new HashMap<String, Set<Contract>>();
        if (switchyard == null || switchyard.getComposite() == null) {
            return names;
        }
        Composite composite = switchyard.getComposite();
        for (Service service : composite.getService()) {
            if (service.getName() == null) {
                continue;
            }
            Set<Contract> contracts = new LinkedHashSet<Contract>();
            contracts.add(service);
            names.put(service.getName(), contracts);
        }
        for (Component component : composite.getComponent()) {
            for (ComponentService service : component.getService()) {
                if (service.getName() == null) {
                    break;
                }
                Set<Contract> contracts = names.get(service.getName());
                if (contracts == null) {
                    contracts = new LinkedHashSet<Contract>();
                    contracts.add(service);
                    names.put(service.getName(), contracts);
                    break;
                }
                int promotedCount = 0;
                for (Contract existing : contracts) {
                    if (existing instanceof Service && ((Service) existing).getPromote() == service) {
                        ++promotedCount;
                    }
                }
                if (promotedCount > 0) {
                    continue;
                }
                contracts.add(service);
            }
        }
        for (Reference reference : composite.getReference()) {
            if (reference.getName() == null) {
                continue;
            }
            Set<Contract> contracts = names.get(reference.getName());
            if (contracts == null) {
                contracts = new LinkedHashSet<Contract>();
                names.put(reference.getName(), contracts);
            }
            contracts.add(reference);
        }
        return names;
    }

    private SwitchYardType getSwitchYard(Resource resource) {
        if (resource == null || resource.getContents().isEmpty()) {
            return null;
        }
        EObject docroot = resource.getContents().get(0);
        if (docroot instanceof DocumentRoot) {
            return ((DocumentRoot) docroot).getSwitchyard();
        }
        return null;
    }
}
