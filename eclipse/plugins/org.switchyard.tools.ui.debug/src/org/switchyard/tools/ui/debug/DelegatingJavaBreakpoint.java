/******************************************************************************* 
 * Copyright (c) 2014 Red Hat, Inc. 
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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.jdt.debug.core.IJavaBreakpoint;
import org.eclipse.jdt.debug.core.IJavaDebugTarget;
import org.eclipse.jdt.debug.core.IJavaObject;
import org.eclipse.jdt.debug.core.IJavaThread;
import org.eclipse.jdt.internal.debug.core.breakpoints.JavaBreakpoint;
import org.eclipse.jdt.internal.debug.core.model.JDIDebugTarget;

import com.sun.jdi.ObjectReference;
import com.sun.jdi.ReferenceType;
import com.sun.jdi.ThreadReference;
import com.sun.jdi.request.EventRequest;

/**
 * DelegatingJavaBreakpoint
 * <p/>
 * A breakpoint that is actually implemented using more than one individual
 * breakpoints.
 * 
 * @param <T> type for keys in delegate map
 */
@SuppressWarnings("restriction")
public abstract class DelegatingJavaBreakpoint<T> extends JavaBreakpoint implements ISwitchYardBreakpoint {

    private IInteractionConfiguration _interactionConfiguration;
    private Map<T, JavaBreakpoint> _delegates = new HashMap<T, JavaBreakpoint>();
    private boolean _creating;
    private String _markerId;

    /**
     * Create a new DelegatingJavaBreakpoint.
     */
    protected DelegatingJavaBreakpoint() {
        super();
    }

    /**
     * Create a new DelegatingJavaBreakpoint.
     * 
     * @throws DebugException if the marker can't be created.
     */
    protected DelegatingJavaBreakpoint(final IResource resource, final IInteractionConfiguration configuration,
            final boolean register, final String markerId) throws DebugException {
        IWorkspaceRunnable wr = new IWorkspaceRunnable() {
            public void run(IProgressMonitor monitor) throws CoreException {
                DelegatingJavaBreakpoint.super.setMarker(resource.createMarker(markerId));
                final Map<String, Object> attributes;
                if (configuration == null) {
                    attributes = new HashMap<String, Object>();
                } else {
                    attributes = configuration.toAttributesMap();
                }
                attributes.put(IBreakpoint.ID, getModelIdentifier());
                attributes.put(IBreakpoint.ENABLED, Boolean.valueOf(true));
                if (!register) {
                    attributes.put(IBreakpoint.PERSISTED, false);
                    attributes.put(IMarker.TRANSIENT, true);
                }
                ensureMarker().setAttributes(attributes);
                register(register);
            }
        };
        _markerId = markerId;
        run(getMarkerRule(resource), wr);
        _interactionConfiguration = configuration;
    }

    /**
     * @return the ID of the marker associated with this breakpoint
     */
    public String getMarkerId() {
        return _markerId;
    }

    @Override
    public void setMarker(IMarker marker) throws CoreException {
        _markerId = marker.getType();
        super.setMarker(marker);
    }

    /**
     * @return the configuration details for this breakpoint.
     */
    public synchronized IInteractionConfiguration getInteractionConfiguration() {
        if (_interactionConfiguration == null) {
            _interactionConfiguration = readInteractionConfiguration();
        }
        return _interactionConfiguration;
    }

    /**
     * Update this breakpoint with new settings.
     * 
     * @param configuration the new configuration
     * @throws CoreException if something goes awry
     */
    public synchronized void setInteractionConfiguration(IInteractionConfiguration configuration) throws CoreException {
        if (configuration.equals(_interactionConfiguration)) {
            return;
        }
        Map<String, Object> attributes = getMarker().getAttributes();
        attributes.putAll(configuration.toAttributesMap());
        setAttributes(attributes);
        _interactionConfiguration = configuration;
        if (_delegates.size() > 0) {
            configurationUpdated();
        }
    }

    /**
     * @return a configuration object corresponding to the attributes of this
     *         breakpoint.
     */
    protected IInteractionConfiguration readInteractionConfiguration() {
        try {
            return InteractionConfigurationBuilder.create().updateFrom(getMarker().getAttributes()).build();
        } catch (CoreException e) {
            return null;
        }
    }

    protected synchronized Map<T, JavaBreakpoint> getDelegates() {
        return _delegates;
    }

    protected synchronized JavaBreakpoint getDelegate(T key) {
        return _delegates.containsKey(key) ? _delegates.get(key) : null;
    }

    protected synchronized void addDelegate(T key, JavaBreakpoint delegate) {
        _delegates.put(key, delegate);
        if (fInstalledTargets != null && !_creating) {
            for (IJavaDebugTarget target : fInstalledTargets) {
                try {
                    delegate.addToTarget((JDIDebugTarget) target);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Create the delegates implementing this breakpoint. Delegates should be
     * created with persist and regiser set to false.
     * 
     * @throws CoreException if something goes awry
     */
    protected abstract void createDelegates() throws CoreException;

    /**
     * Reinstalls the delegates after configuration changes. Subclasses
     * overriding this method should invoke super to ensure any configuration
     * changes made are reflected in any active debug sessions.
     * 
     * @throws CoreException if something goes awry
     */
    protected void configurationUpdated() throws CoreException {
        if (fInstalledTargets != null && !_creating) {
            /*
             * we need to replace the breakpoint requests for the delegates so
             * they reflect any changes that have been made.
             */
            for (IJavaDebugTarget target : fInstalledTargets) {
                for (JavaBreakpoint delegate : _delegates.values()) {
                    try {
                        if (delegate != null) {
                            delegate.removeFromTarget((JDIDebugTarget) target);
                            delegate.addToTarget((JDIDebugTarget) target);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /**
     * Deletes all existing delegates.
     */
    protected synchronized void clearDelegates() {
        for (JavaBreakpoint delegate : _delegates.values()) {
            try {
                if (delegate != null) {
                    if (fInstalledTargets != null) {
                        for (IJavaDebugTarget target : fInstalledTargets) {
                            try {
                                delegate.removeFromTarget((JDIDebugTarget) target);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    delegate.delete();
                }
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }
        _delegates.clear();
    }

    /**
     * Notification that the enabled state of this breakpoint has been updated.
     * Child types should update the enabled state of the delegates from within
     * this method.
     * 
     * @param enabled true if this breakpoint is being enabled
     * @throws CoreException if something goes awry
     */
    protected abstract void updateEnabled(boolean enabled) throws CoreException;

    @Override
    public String getModelIdentifier() {
        return SwitchYardDebugUtil.MODEL_IDENTIFIER;
    }

    @Override
    public void delete() throws CoreException {
        for (IJavaBreakpoint delegate : _delegates.values()) {
            try {
                if (delegate != null) {
                    delegate.delete();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        super.delete();
    }

    @Override
    public void setEnabled(boolean enabled) throws CoreException {
        if (_delegates.size() > 0 && enabled != isEnabled()) {
            updateEnabled(enabled);
        }
        super.setEnabled(enabled);
    }

    @Override
    public String getTypeName() throws CoreException {
        return null;
    }

    @Override
    public int getHitCount() throws CoreException {
        // FIXME getHitCount
        return 0;
    }

    @Override
    public void setHitCount(int count) throws CoreException {
        // FIXME setHitCount

    }

    @Override
    public void setSuspendPolicy(int suspendPolicy) throws CoreException {
        for (IJavaBreakpoint delegate : _delegates.values()) {
            try {
                if (delegate != null) {
                    delegate.setSuspendPolicy(suspendPolicy);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        super.setSuspendPolicy(suspendPolicy);
    }

    @Override
    public void setThreadFilter(IJavaThread thread) throws CoreException {
        for (IJavaBreakpoint delegate : _delegates.values()) {
            try {
                if (delegate != null) {
                    delegate.setThreadFilter(thread);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        super.setThreadFilter(thread);
    }

    @Override
    public void removeThreadFilter(IJavaDebugTarget target) throws CoreException {
        for (IJavaBreakpoint delegate : _delegates.values()) {
            try {
                if (delegate != null) {
                    delegate.removeThreadFilter(target);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        super.removeThreadFilter(target);
    }

    @Override
    public void addInstanceFilter(IJavaObject object) throws CoreException {
    }

    @Override
    public void removeInstanceFilter(IJavaObject object) throws CoreException {
    }

    @Override
    public boolean supportsInstanceFilters() {
        return false;
    }

    @Override
    public IJavaObject[] getInstanceFilters() {
        return new IJavaObject[0];
    }

    @Override
    public boolean supportsThreadFilters() {
        return true;
    }

    @Override
    public synchronized void addToTarget(JDIDebugTarget target) throws CoreException {
        if (_delegates.size() == 0) {
            _creating = true;
            try {
                createDelegates();
            } finally {
                _creating = false;
            }
        }
        // add the delegates
        for (JavaBreakpoint delegate : _delegates.values()) {
            try {
                if (delegate != null) {
                    delegate.addToTarget(target);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        super.addToTarget(target);
        incrementInstallCount();
        fireInstalled(target);
    }

    @Override
    protected void createRequests(JDIDebugTarget target) throws CoreException {
        // do nothing. everything is handled by the delegates.
    }

    @Override
    public synchronized void removeFromTarget(JDIDebugTarget target) throws CoreException {
        for (JavaBreakpoint delegate : _delegates.values()) {
            try {
                if (delegate != null) {
                    delegate.removeFromTarget(target);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        super.removeFromTarget(target);
        if (markerExists()) {
            decrementInstallCount();
        }
        if (!isInstalled()) {
            clearDelegates();
        }
    }

    @Override
    public void setExpired(boolean expired) throws CoreException {
        for (JavaBreakpoint delegate : _delegates.values()) {
            try {
                if (delegate != null) {
                    delegate.setExpired(expired);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        super.setExpired(expired);
    }

    @Override
    protected void addInstanceFilter(EventRequest request, ObjectReference object) {
    }

    @Override
    protected EventRequest[] newRequests(JDIDebugTarget target, ReferenceType type) throws CoreException {
        return new EventRequest[0];
    }

    @Override
    protected void setRequestThreadFilter(EventRequest request, ThreadReference thread) {
    }

}
