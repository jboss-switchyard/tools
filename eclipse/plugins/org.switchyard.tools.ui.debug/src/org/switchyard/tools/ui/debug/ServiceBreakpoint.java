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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.internal.debug.core.breakpoints.JavaMethodBreakpoint;
import org.eclipse.jdt.internal.debug.core.model.JDIDebugTarget;
import org.switchyard.tools.ui.debug.IInteractionConfiguration.TriggerType;
import org.switchyard.tools.ui.debug.SwitchYardDebugUtil.ServiceType;

import com.sun.jdi.request.EventRequest;
import com.sun.jdi.request.MethodExitRequest;

/**
 * ServiceBreakpoint
 * <p/>
 * Breakpoint for SwitchYard provider (component service/composite reference)
 * in/out/fault.
 */
@SuppressWarnings("restriction")
public class ServiceBreakpoint extends JavaMethodBreakpoint {

    /** Attributes key for trigger type. */
    public static final String TRIGGER_KEY = "switchYardServiceBreakpoint.trigger";
    /** Attributes key for service type. */
    public static final String SERVICE_TYPE_KEY = "switchYardServiceBreakpoint.type";
    /** Attributes key for service name. */
    public static final String SERVICE_NAME_KEY = "switchYardServiceBreakpoint.name";

    /**
     * Create a new ServiceBreakpoint.
     */
    public ServiceBreakpoint() {
    }

    /**
     * Create a new ServiceBreakpoint.
     * 
     * @param resource the switchyard.xml file
     * @param service the service name
     * @param uri the emf object uri (e.g.
     *            generated:/switchyard[0]/composite[0]/ServiceName)
     * @param type the service type (provider/consumer)
     * @param triggers when to trigger the breakpoint
     * @throws CoreException if something goes awry.
     */
    public ServiceBreakpoint(IResource resource, QName service, String uri, ServiceType type, Set<TriggerType> triggers)
            throws CoreException {
        super(resource, "org.switchyard.bus.camel.processors.InterceptProcessor", "process",
                "(Lorg/apache/camel/Exchange;)V", true, false, false, -1, -1, -1, 0, true, createAttributes(service,
                        uri, type, triggers));
    }

    @Override
    public void setMarker(IMarker marker) throws CoreException {
        if (!SwitchYardDebugUtil.SERVICE_INTERACTION_BREAKPOINT_MARKER_ID.equals(marker.getType())) {
            marker.delete();
            marker = marker.getResource().createMarker(SwitchYardDebugUtil.SERVICE_INTERACTION_BREAKPOINT_MARKER_ID);
        }
        super.setMarker(marker);
    }

    @Override
    public String getModelIdentifier() {
        return SwitchYardDebugUtil.MODEL_IDENTIFIER;
    }

    @Override
    public boolean isEntry() throws CoreException {
        return getTriggerTypes().contains(TriggerType.IN);
    }

    @Override
    public void setEntry(boolean entry) throws CoreException {
        // we'll update the trigger types
        final Set<TriggerType> triggers = getTriggerTypes();
        final boolean update;
        if (entry) {
            update = triggers.add(TriggerType.IN);
        } else {
            update = triggers.remove(TriggerType.IN);
        }
        if (update) {
            update(getServiceName(), getServiceType(), triggers);
        }
    }

    @Override
    public boolean isExit() throws CoreException {
        return getTriggerTypes().contains(TriggerType.OUT);
    }

    @Override
    public void setExit(boolean exit) throws CoreException {
        // we'll update the trigger types
        final Set<TriggerType> triggers = getTriggerTypes();
        final boolean update;
        if (exit) {
            update = triggers.add(TriggerType.OUT);
        } else {
            update = triggers.remove(TriggerType.OUT);
        }
        if (update) {
            update(getServiceName(), getServiceType(), triggers);
        }
    }

    /*
     * Specialized because entry and exit mean different things for our service
     * breakpoint.
     */
    @Override
    protected void updateEnabledState(EventRequest request, JDIDebugTarget target) throws CoreException {
        boolean enabled = isEnabled();
        if (request instanceof MethodExitRequest) {
            // exit is always disabled
            enabled = false;
        }

        if (enabled != request.isEnabled()) {
            internalUpdateEnabledState(request, enabled, target);
        }
    }

    /**
     * @return the name of the service to which this breakpoint applies.
     */
    public QName getServiceName() {
        final String name = getMarker().getAttribute(SERVICE_NAME_KEY, null);
        return name == null ? null : QName.valueOf(name);
    }

    /**
     * @return the type of the service (provider/consumer) to which this
     *         breakpoint applies.
     */
    public ServiceType getServiceType() {
        final String type = getMarker().getAttribute(SERVICE_TYPE_KEY, null);
        return type == null ? null : ServiceType.valueOf(type);
    }

    /**
     * @return the trigger points for this breakpoint
     */
    public Set<TriggerType> getTriggerTypes() {
        final String triggerStrings = getMarker().getAttribute(TRIGGER_KEY, null);
        return triggerStrings == null ? null : SwitchYardDebugUtil.fromString(TriggerType.class, triggerStrings);
    }

    /**
     * Update this breakpoint.
     * 
     * @param service the service name
     * @param type the service type
     * @param triggers the trigger points
     * @throws CoreException if something goes awry
     */
    public void update(QName service, ServiceType type, Set<TriggerType> triggers) throws CoreException {
        setAttributes(
                new String[] {TRIGGER_KEY, SERVICE_TYPE_KEY, SERVICE_NAME_KEY, IMarker.MESSAGE },
                new Object[] {
                        SwitchYardDebugUtil.toString(triggers),
                        type.toString(),
                        service.toString(),
                        String.format("Service %s: %s {%s} on %s", type, service.getLocalPart(),
                                service.getNamespaceURI(), triggers) });
        setCondition(createCondition(service, type, triggers));
    }

    private static Map<String, Object> createAttributes(QName service, String uri, ServiceType type,
            Set<TriggerType> triggers) {
        final Map<String, Object> attributes = new HashMap<String, Object>();
        attributes.put(TRIGGER_KEY, SwitchYardDebugUtil.toString(triggers));
        attributes.put(SERVICE_TYPE_KEY, type.toString());
        attributes.put(SERVICE_NAME_KEY, service.toString());
        attributes.put(CONDITION_ENABLED, Boolean.TRUE);
        attributes.put(CONDITION, createCondition(service, type, triggers));
        attributes.put(IMarker.MESSAGE, String.format("Service %s: %s {%s} on %s", type, service.getLocalPart(),
                service.getNamespaceURI(), triggers));
        attributes.put("uri", uri);
        return attributes;
    }

    private static String createCondition(QName service, ServiceType type, Set<TriggerType> triggers) {
        final StringBuffer buffer = new StringBuffer();

        // type (provider/consumer)
        buffer.append('"').append(type.toString()).append('"').append(".equalsIgnoreCase(this._target)");

        buffer.append("\n        && ");

        // trigger
        if (triggers == null || triggers.isEmpty()) {
            triggers = EnumSet.allOf(TriggerType.class);
        }
        boolean addOr = false;
        buffer.append("(");
        if (triggers.contains(TriggerType.IN)) {
            buffer.append("org.switchyard.ExchangePhase.IN == ex.getProperty(\"org.switchyard.bus.camel.phase\", org.switchyard.ExchangePhase.class)");
            addOr = true;
        }
        if (triggers.contains(TriggerType.OUT)) {
            if (addOr) {
                buffer.append("\n            || ");
            }
            buffer.append("org.switchyard.ExchangePhase.OUT == ex.getProperty(\"org.switchyard.bus.camel.phase\", org.switchyard.ExchangePhase.class)");
        } else if (triggers.contains(TriggerType.FAULT)) {
            if (addOr) {
                buffer.append("\n            || ");
            }
            buffer.append("ex.getProperty(\"org.switchyard.bus.camel.fault\", false, Boolean.class)");
        }
        buffer.append(")");

        buffer.append("\n        && ");

        // service name
        if (type == ServiceType.PROVIDER) {
            buffer.append('"')
                    .append(service.toString())
                    .append('"')
                    .append(".equals(ex.getProperty(\"org.switchyard.bus.camel.provider\", org.switchyard.Service.class).getName().toString())");
        } else {
            buffer.append('"')
                    .append(service.toString())
                    .append('"')
                    .append(".equals(ex.getProperty(\"org.switchyard.bus.camel.consumer\", org.switchyard.ServiceReference.class).getName().toString())");
        }

        return buffer.toString();
    }

}
