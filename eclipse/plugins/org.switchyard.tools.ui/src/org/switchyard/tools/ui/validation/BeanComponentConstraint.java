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

import static org.switchyard.tools.ui.validation.ValidationProblem.BeanUnresolvableClass;
import static org.switchyard.tools.ui.validation.ValidationProblem.BeanUnspecifiedClass;
import static org.switchyard.tools.ui.validation.ValidationProblem.MissingReferenceDeclaration;
import static org.switchyard.tools.ui.validation.ValidationProblem.MissingServiceDeclaration;
import static org.switchyard.tools.ui.validation.ValidationProblem.ReferenceInterfaceMismatch;
import static org.switchyard.tools.ui.validation.ValidationProblem.ServiceInterfaceMismatch;
import static org.switchyard.tools.ui.validation.ValidationProblem.UnusedReferenceDeclaration;
import static org.switchyard.tools.ui.validation.ValidationProblem.UnusedServiceDeclaration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.switchyard.tools.models.switchyard1_0.bean.BeanImplementationType;
import org.switchyard.tools.ui.JavaTypeScanner;
import org.switchyard.tools.ui.validation.SwitchYardProjectValidator.ValidationAdapter;

/**
 * BeanComponentConstraint
 * 
 * <p/>
 * Validates details specific to bean components, specifically that the class
 * exists, that @Service matches what's in switchyard.xml, and that @Reference's
 * match what's in switchyard.xml.
 */
public class BeanComponentConstraint extends AbstractModelConstraint {

    @Override
    public IStatus validate(IValidationContext ctx) {
        EObject eObj = ctx.getTarget();
        EMFEventType eType = ctx.getEventType();

        // In the case of batch mode.
        if (eType == EMFEventType.NULL) {
            if (eObj instanceof BeanImplementationType) {
                return validate(ctx, (BeanImplementationType) eObj);
            }
            // } else { // In the case of live mode.
        }

        return ctx.createSuccessStatus();
    }

    private IStatus validate(IValidationContext ctx, BeanImplementationType bean) {
        final Component component = (Component) bean.eContainer();
        final String className = bean.getClass_();
        if (className == null || className.length() == 0) {
            return ConstraintStatus.createStatus(ctx, component, null, BeanUnspecifiedClass.getSeverity(),
                    BeanUnspecifiedClass.ordinal(), BeanUnspecifiedClass.getMessage(), component.getName());
        }
        final ValidationAdapter adapter = (ValidationAdapter) EcoreUtil.getAdapter(bean.eResource().eAdapters(),
                ValidationAdapter.class);
        final IJavaProject javaProject = adapter.getJavaProject();
        try {
            final IType javaClass = javaProject == null ? null : javaProject.findType(className);
            if (javaClass == null) {
                return ConstraintStatus.createStatus(ctx, component, null, BeanUnresolvableClass.getSeverity(),
                        BeanUnresolvableClass.ordinal(), BeanUnresolvableClass.getMessage(), className,
                        component.getName());
            }
            final List<IStatus> statuses = new ArrayList<IStatus>();
            final JavaTypeScanner scanner = new JavaTypeScanner(javaClass);
            adapter.addDependency(javaClass.getResource());
            statuses.add(validateContracts(ctx, component, component.getService(), scanner.getServices(),
                    MissingServiceDeclaration, ServiceInterfaceMismatch, UnusedServiceDeclaration));
            statuses.add(validateContracts(ctx, component, component.getReference(), scanner.getReferences(),
                    MissingReferenceDeclaration, ReferenceInterfaceMismatch, UnusedReferenceDeclaration));
            return ConstraintStatus.createMultiStatus(ctx, statuses);
        } catch (JavaModelException e) {
            return ConstraintStatus
                    .createStatus(ctx, component, null, BeanUnresolvableClass.getSeverity(),
                            BeanUnresolvableClass.ordinal(), BeanUnresolvableClass.getMessage(), className,
                            component.getName());
        }
    }

    private IStatus validateContracts(IValidationContext ctx, Component component, List<? extends Contract> switchYard,
            List<? extends Contract> java, ValidationProblem missingProblem, ValidationProblem mismatchProblem,
            ValidationProblem superfluousProblem) {
        final List<IStatus> statuses = new ArrayList<IStatus>();
        final List<Contract> switchYardContracts = new ArrayList<Contract>(switchYard);
        /*
         * check for missing declarations (i.e. @Reference but no
         * sca:reference).
         */
        JAVA_CONTRACTS: for (Contract javaContract : java) {
            if (javaContract == null) {
                continue;
            }
            for (Iterator<Contract> switchIt = switchYardContracts.iterator(); switchIt.hasNext();) {
                final Contract switchYardContract = switchIt.next();
                if (switchYardContract == null) {
                    switchIt.remove();
                    continue;
                }
                if (javaContract.getName().equals(switchYardContract.getName())) {
                    /*
                     * check for type mismatches (i.e. interface.java/@class !=
                     * interface.java/@class).
                     */
                    boolean isReferenceInvoker = false;
                    if (javaContract.getInterface() instanceof JavaInterface) {
                        JavaInterface jInt = (JavaInterface) javaContract.getInterface();
                        if (jInt.getInterface().contentEquals("org.switchyard.component.bean.ReferenceInvoker")) { //$NON-NLS-1$
                            /*
                             * Check to see if the implementation is a reference invoker. If so,
                             * it's up to the caller to take care of casting the return data. 
                             */
                            isReferenceInvoker = true;
                        }
                    }
                    if (!isReferenceInvoker && !EcoreUtil.equals(javaContract.getInterface(), switchYardContract.getInterface())) {
                        // interface mismatch
                        statuses.add(ConstraintStatus.createStatus(ctx, switchYardContract, null,
                                mismatchProblem.getSeverity(), mismatchProblem.ordinal(), mismatchProblem.getMessage(),
                                javaContract.getName(), component.getName()));
                    }
                    // else no problem
                    switchIt.remove();
                    continue JAVA_CONTRACTS;
                }
            }
            // missing contract
            statuses.add(ConstraintStatus.createStatus(ctx, component, null, missingProblem.getSeverity(),
                    missingProblem.ordinal(), missingProblem.getMessage(), javaContract.getName(), component.getName()));
        }
        /*
         * check for superfluous declarations (i.e. sca:reference but no
         * 
         * @Reference). (everything that's left)
         */
        for (Contract switchYardContract : switchYardContracts) {
            // superfluous
            statuses.add(ConstraintStatus.createStatus(ctx, switchYardContract, null, superfluousProblem.getSeverity(),
                    superfluousProblem.ordinal(), superfluousProblem.getMessage(), switchYardContract.getName(),
                    component.getName()));
        }
        if (statuses.isEmpty()) {
            return ctx.createSuccessStatus();
        }
        return ConstraintStatus.createMultiStatus(ctx, statuses);
    }
}
