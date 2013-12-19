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
package org.switchyard.tools.ui.debug;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.ui.debug.IInteractionConfiguration.AspectType;
import org.switchyard.tools.ui.debug.IInteractionConfiguration.TriggerType;

/**
 * SwitchYardDebugUtil
 * <p/>
 * Utility methods for SwitchYard debug support.
 */
public final class SwitchYardDebugUtil {

    /** The model ID for SwitchYard breakpoints. */
    public static final String MODEL_IDENTIFIER = "org.switchyard.tools.ui.debug";

    /** The id for the base SwitchYard breakpoint markers. */
    public static final String BASE_BREAKPOINT_MARKER_ID = "org.switchyard.tools.ui.debug.switchYardBreakpointMarker";
    /** The id for service (consumer and provider) breakpoint markers. */
    public static final String SERVICE_INTERACTION_BREAKPOINT_MARKER_ID = "org.switchyard.tools.ui.debug.switchYardServiceBreakpointMarker";
    /** The id for validate breakpoint markers. */
    public static final String VALIDATE_BREAKPOINT_MARKER_ID = "org.switchyard.tools.ui.debug.switchYardValidatorBreakpointMarker";
    /** The id for transform breakpoint markers. */
    public static final String TRANSFORM_BREAKPOINT_MARKER_ID = "org.switchyard.tools.ui.debug.switchYardTransformerBreakpointMarker";

    /** The id for transform breakpoint markers. */
    public static final String SWITCHYARD_CONTEXT_ID = "org.switchyard.tools.ui.debug.context";

    /**
     * The type of service breakpoint.
     */
    public enum ServiceType {
        /** Provider breakpoint. */
        PROVIDER,
        /** Consumer breakpoint. */
        CONSUMER;

        /**
         * The service type based on the contract type.
         * 
         * @param contract the contract
         * @return the service type, may be null.
         */
        public static ServiceType fromContract(Contract contract) {
            if (contract instanceof Service || contract instanceof ComponentReference) {
                return ServiceType.CONSUMER;
            } else if (contract instanceof Reference || contract instanceof ComponentService) {
                return ServiceType.PROVIDER;
            }
            return null;
        }
    }

    /**
     * Create a breakpoint corresponding to a specific service invocation.
     * 
     * @param resource the switchyard.xml file
     * @param service the service name
     * @param uri the emf object uri (e.g.
     *            generated:/switchyard[0]/composite[0]/ServiceName)
     * @param type the service type (provider/consumer)
     * @return a new service breakpoint
     * @throws CoreException if something goes awry.
     */
    public static ServiceInteractionBreakpoint createServiceBreakpoint(IResource resource, QName service, String uri,
            ServiceType type) throws CoreException {
        final InteractionConfigurationBuilder builder = InteractionConfigurationBuilder.create();
        final Set<AspectType> aspects = EnumSet.of(AspectType.ENTRY, AspectType.RETURN, AspectType.FAULT);
        if (type == ServiceType.PROVIDER) {
            aspects.add(AspectType.TARGET_INVOCATION);
            builder.provider(service, uri);
        } else {
            builder.consumer(service, uri);
        }
        builder.aspects(aspects);
        builder.triggers(EnumSet.allOf(TriggerType.class));
        return new ServiceInteractionBreakpoint(resource, builder.build(), true);
    }

    /**
     * @param project the associated project.
     * @return a new validate breakpoint
     * @throws CoreException if something goes awry.
     */
    public static ValidateHandlerBreakpoint createValidateBreakpoint(IProject project) throws CoreException {
        return new ValidateHandlerBreakpoint(project, InteractionConfigurationBuilder.create().build(),
                ValidateConfigurationBuilder.create().build(), true);
    }

    /**
     * @param project the associated project.
     * @return a new transform breakpoint
     * @throws CoreException if something goes awry.
     */
    public static TransformSequenceBreakpoint createTransformBreakpoint(IProject project) throws CoreException {
        return new TransformSequenceBreakpoint(project, InteractionConfigurationBuilder.create().build(),
                TransformConfigurationBuilder.create().build(), true);
    }

    /**
     * Utility for converting a set of enum values to a string. The form of the
     * string is: "VALUE1 VALUE2 VALUE3"
     * 
     * @param enumSet the set of enum values.
     * @param <E> the enum type
     * @return a string.
     */
    public static <E extends Enum<E>> String toString(Set<E> enumSet) {
        if (enumSet == null || enumSet.isEmpty()) {
            return null;
        }
        final StringBuffer buffer = new StringBuffer();
        for (E enumValue : enumSet) {
            buffer.append(enumValue.toString()).append(' ');
        }
        if (buffer.length() > 0) {
            buffer.deleteCharAt(buffer.length() - 1);
        }
        return buffer.toString();
    }

    /**
     * @param enumType the type of enum
     * @param value a space separated list of enum value strings
     * @param <E> the enum type
     * @return a set of enum values
     */
    public static <E extends Enum<E>> Set<E> fromString(Class<E> enumType, String value) {
        final Set<E> enumValues = new HashSet<E>();
        final StringTokenizer tokens = value == null ? null : new StringTokenizer(value);
        if (tokens == null || !tokens.hasMoreTokens()) {
            return EnumSet.noneOf(enumType);
        }
        for (; tokens.hasMoreTokens();) {
            try {
                final E enumValue = Enum.valueOf(enumType, tokens.nextToken());
                if (enumValue != null) {
                    enumValues.add(enumValue);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return enumValues.isEmpty() ? null : EnumSet.copyOf(enumValues);
    }

    private SwitchYardDebugUtil() {
    }

}
