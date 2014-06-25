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
import org.switchyard.tools.ui.i18n.Messages;

/**
 * ValidationProblem
 * 
 * <p/>
 * Problem codes associated with validation errors/warnings.
 */
public enum ValidationProblem {

    /** OK. Ensures ordinal 0 (i.e. status code 0) reflects OK. */
    OK(Messages.ValidationProblem_NoProblem, IStatus.OK, false),
    /** The name used for the service or reference is not unique. */
    DuplicateName(Messages.ValidationProblem_DuplicateName,
            false),
    /**
     * The promoted component reference's name must match the reference
     * promoting it.
     */
    PromotedReferenceNameMismatch(
            Messages.ValidationProblem_PromotedReferenceNameMismatch,
            true),
    /** The component reference resolves to multiple services/references. */
    AmbiguousReference(
            Messages.ValidationProblem_AmbiguousReference,
            false),
    /** The component reference cannot be resolved to a service or reference. */
    UnresolvedReference(Messages.ValidationProblem_UnresolvedReference, true),
    /** The reference is not used by any component references. */
    UnusedReference(Messages.ValidationProblem_UnusedReference,
            IStatus.WARNING, false),
    /** The service is not bound to any component service. */
    UnboundService(
            Messages.ValidationProblem_UnboundService,
            IStatus.WARNING, false),
    /** The source operation does not existing in the target service/reference. */
    UnboundOperation(Messages.ValidationProblem_UnboundOperation, true),
    /** The return value from the target service is ignored. */
    UnusedReturnValue(Messages.ValidationProblem_UnusedReturnValue,
            IStatus.WARNING, true),
    /**
     * The message exchange patterns of the source and target service are
     * incompatible.
     */
    IncomptaibleMEP(
            Messages.ValidationProblem_IncompatibleMessageExchangePattern,
            true),
    /** The target service throws a fault which is not handled by the source. */
    UnhandledFault(Messages.ValidationProblem_UnhandledFault, true),
    /** A transformation is missing for the required from/to types. */
    MissingTransformation(Messages.ValidationProblem_RequiredTransformMissing, true),
    /** The service interface could not be resolved. */
    UnresolvableServiceInterface(
            Messages.ValidationProblem_UnresolvableServiceInterface, false),
    /** A failure occurred while trying to load the available transformers. */
    UnableToValidateTransformers(
            Messages.ValidationProblem_UnableToValidateTransformers,
            IStatus.WARNING, false),
    /** Missing capability, e.g. SOAP binding, but no SOAP capability. */
    RequiredCapabilityMissing(
            Messages.ValidationProblem_RequiredCapabilityMissing,
            IStatus.ERROR, false),
    /** Missing capability, e.g. SOAP binding, but no SOAP capability. */
    UnusedCapability(
            Messages.ValidationProblem_UnusedCapability,
            IStatus.WARNING, false),
    /**
     * Incompatible interface, e.g. a WSDL interface provided by a Bean service.
     */
    IncompatibleInterfaceType(
            Messages.ValidationProblem_IncompatibleInterfaceType,
            IStatus.ERROR, false),
    /** No class specified on implementation.bean. */
    BeanUnspecifiedClass(
            Messages.ValidationProblem_UnspecifiedBeanClass,
            IStatus.ERROR, false),
    /** Class cannot be resolved for implementation.bean. */
    BeanUnresolvableClass(Messages.ValidationProblem_UnresolvableBeanClass, 
            IStatus.ERROR, false),

    /** Service specified on implementation, but not in switchyard.xml. */
    MissingServiceDeclaration(
            Messages.ValidationProblem_MissingComponentService,
            IStatus.ERROR, false),
    /**
     * Service interface on implementation does not match interface in
     * switchyard.xml.
     */
    ServiceInterfaceMismatch(
            Messages.ValidationProblem_ServiceInterfaceMismatch,
            IStatus.ERROR, false),
    /** Service declaration is missing from implementation. */
    UnusedServiceDeclaration(
            Messages.ValidationProblem_UnimplementedServiceDeclaration,
            IStatus.ERROR, false),
    /**
     * Reference specified on implementation, but not in switchyard.xml.
     */
    MissingReferenceDeclaration(
            Messages.ValidationProblem_MissingComponentReference,
            IStatus.ERROR, false),
    /**
     * Reference interface on implementation does not match interface in
     * switchyard.xml.
     */
    ReferenceInterfaceMismatch(
            Messages.ValidationProblem_ReferenceInterfaceMismatch,
            IStatus.ERROR, false),
    /** Reference is not used by implementation. */
    UnusedReferenceDeclaration(
            Messages.ValidationProblem_UnusedComponentReference,
            IStatus.WARNING, false),
            
    /** No class specified on implementation.camel (java). */
    CamelJavaUnspecifiedClass(
            Messages.ValidationProblem_UnspecifiedCamelRouteClass,
            IStatus.ERROR, false),
    /** Class cannot be resolved for implementation.camel (java). */
    CamelJavaUnresolvableClass(Messages.ValidationProblem_UnresolvableCamelRouteClass, 
            IStatus.ERROR, false),
    /** Camel Java route class for implementation.camel (java) does not extend RouteBuilder. */
    CamelJavaWrongSuperclass(Messages.ValidationProblem_CamelJavaClassDoesNotExtendRouteBuilder, 
            IStatus.ERROR, false),
    /** No XML specified on implementation.camel (xml). */
    CamelXMLUnspecified(
            Messages.ValidationProblem_NoCamelXMLSpecified,
            IStatus.ERROR, false),
    /** No XML or Java route specified on implementation.camel (xml). */
    CamelImplementationIncomplete(
            Messages.ValidationProblem_CamelImplementationTypeMissing,
            IStatus.ERROR, false),
    /** The operation specified in the route for a implementation.camel (xml) is
     * incorrect. */
    InvalidCamelRouteOperationReference(
            Messages.ValidationProblem_InvalidCamelRouteOperationReference,
            IStatus.ERROR, false),
    /** The reference specified in the camel route URI is not available in the component. */
    CamelRouteOperationNotFoundAsReference(
            Messages.ValidationProblem_CamelRouteOperationNotFoundAsReference,
            IStatus.ERROR, false),
    /** The service specified in the camel route URI is not available in the component. */
    CamelRouteOperationNotFoundAsService(
            Messages.ValidationProblem_CamelRouteOperationNotFoundAsService,
            IStatus.ERROR, false),
    /** The referenced service or reference has multiple operations available. Route URI should
     * specify one. */
    CamelRouteOperationRequiredNotSpecified(
            Messages.ValidationProblem_CamelRouteOperationRequiredNotSpecified,
            IStatus.WARNING, false),
    /** XML specified on implementation.camel (xml) not found. */
    CamelXMLNotFound(
            Messages.ValidationProblem_CamelXMLNotFound,
            IStatus.ERROR, false),
    /** Route for implementation.camel specifies more than a single "from". */
    CamelRouteMoreThanOneFromFound(
            Messages.ValidationProblem_CamelRouteMoreThanOneFromFound,
            IStatus.ERROR, false);

    /** Used to identify the problem code attribute in IMarker objects. */
    public static final String PROBLEM_CODE = Messages.ValidationProblem_ValidateProblem;

    /**
     * @param statusCode the status code (i.e. ordinal).
     * 
     * @return true if the enum value associated with the status code applies to
     *         connections.
     */
    public static boolean isConnectionProblem(int statusCode) {
        if (statusCode > 0 && statusCode < values().length) {
            return values()[statusCode].isConnectionProblem();
        }
        return false;
    }

    private String _message;
    private int _severity;
    private boolean _connectionProblem;

    private ValidationProblem(String message, int severity, boolean connectionProblem) {
        _message = message;
        _severity = severity;
        _connectionProblem = connectionProblem;
    }

    private ValidationProblem(String message, boolean connectionProblem) {
        this(message, IStatus.ERROR, connectionProblem);
    }

    /**
     * @return true if this problem relates to a connection.
     */
    public boolean isConnectionProblem() {
        return _connectionProblem;
    }

    /**
     * @return the message associated with this problem.
     */
    public String getMessage() {
        return _message;
    }

    /**
     * @return the problem severity
     * @see IStatus#getSeverity()
     */
    public int getSeverity() {
        return _severity;
    }
}
