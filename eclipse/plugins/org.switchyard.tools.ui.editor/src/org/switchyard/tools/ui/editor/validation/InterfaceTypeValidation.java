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

import static org.switchyard.tools.ui.validation.ValidationProblem.IncompatibleInterfaceType;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.switchyard.tools.ui.common.InterfaceControl.InterfaceType;
import org.switchyard.tools.ui.editor.ComponentTypeExtensionManager;
import org.switchyard.tools.ui.editor.IComponentTypeExtension;

/**
 * InterfaceTypeValidation
 * 
 * <p/>
 * Validates the interface used by a component service/reference is compatible
 * with the implementation implementing the component.
 */
public class InterfaceTypeValidation extends AbstractModelConstraint {

    @Override
    public IStatus validate(IValidationContext ctx) {
        EObject eObj = ctx.getTarget();
        EMFEventType eType = ctx.getEventType();

        // In the case of batch mode.
        if (eType == EMFEventType.NULL) {
            if (eObj instanceof ComponentReference || eObj instanceof ComponentService) {
                return validate(ctx, (Contract) eObj);
            }
            // } else { // In the case of live mode.
        }

        return ctx.createSuccessStatus();
    }

    private IStatus validate(IValidationContext ctx, Contract contract) {
        final Interface intf = contract.getInterface();
        final Component component = (Component) contract.eContainer();
        final Implementation implementation = component.getImplementation();
        if (implementation == null) {
            return ctx.createSuccessStatus();
        }
        final IComponentTypeExtension extension = ComponentTypeExtensionManager.instance().getExtensionFor(
                implementation.getClass());
        if (InterfaceType.isInstance(intf, extension.getSupportedInterfaceTypes(implementation))) {
            return ctx.createSuccessStatus();
        }
        return ConstraintStatus.createStatus(ctx, contract, null, IncompatibleInterfaceType.getSeverity(),
                IncompatibleInterfaceType.ordinal(), IncompatibleInterfaceType.getMessage(),
                InterfaceType.valueOf(intf), extension.getTypeName(implementation), component.getName(),
                contract.getName());
    }
}
