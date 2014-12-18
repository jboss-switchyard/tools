/*************************************************************************************
 * Copyright (c) 2011 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.debug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IDebugEventSetListener;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.jdt.debug.core.IJavaDebugTarget;
import org.eclipse.jdt.internal.debug.ui.IJDIPreferencesConstants;
import org.eclipse.jdt.internal.debug.ui.JDIDebugUIPlugin;
import org.eclipse.jdt.internal.debug.ui.JavaDebugOptionsManager;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.progress.UIJob;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 */
@SuppressWarnings("restriction")
public class Activator extends AbstractUIPlugin {

    /** The PLUGIN_ID. */
    public static final String PLUGIN_ID = "org.switchyard.tools.ui.debug"; //$NON-NLS-1$

    // The shared instance
    private static Activator plugin;

    private static AtomicBoolean _formattersAdded = new AtomicBoolean();

    private IDebugEventSetListener _debugListener;

    /**
     * The constructor.
     */
    public Activator() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
     * )
     */
    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
        addDebugEventListener();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
     * )
     */
    @Override
    public void stop(BundleContext context) throws Exception {
        removeDebugEventListener();
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance.
     * 
     * @return the shared instance
     */
    public static Activator getDefault() {
        return plugin;
    }

    private void addDebugEventListener() {
        if (_debugListener == null) {
            _debugListener = new SwitchYardDebugEventSetListener();
            DebugPlugin.getDefault().addDebugEventListener(_debugListener);
        }
    }

    private void removeDebugEventListener() {
        if (_debugListener != null) {
            DebugPlugin.getDefault().removeDebugEventListener(_debugListener);
            _debugListener = null;
        }
    }

    private static final class SwitchYardDebugEventSetListener implements IDebugEventSetListener {
        @Override
        public void handleDebugEvents(DebugEvent[] events) {
            for (DebugEvent event : events) {
                if (event.getKind() == DebugEvent.CREATE && event.getSource() instanceof IJavaDebugTarget) {
                    final IJavaDebugTarget target = (IJavaDebugTarget) event.getSource();
                    if (!ILaunchManager.DEBUG_MODE.equals(target.getLaunch().getLaunchMode())) {
                        continue;
                    }
                    final IBreakpoint[] breakpoints = DebugPlugin.getDefault().getBreakpointManager()
                            .getBreakpoints(SwitchYardDebugUtil.MODEL_IDENTIFIER);
                    if (breakpoints == null || breakpoints.length == 0) {
                        continue;
                    }
                    IResource[] resources = null;
                    try {
                        resources = target.getLaunch().getLaunchConfiguration().getMappedResources();
                    } catch (CoreException e) {
                        e.printStackTrace();
                    }
                    if (resources == null) {
                        // add them all
                        for (IBreakpoint breakpoint : breakpoints) {
                            try {
                                if (breakpoint.isEnabled()) {
                                    target.breakpointAdded(breakpoint);
                                }
                            } catch (CoreException e) {
                                e.printStackTrace();
                            }
                        }
                    } else {
                        /*
                         * some optimization as the breakpoints put a load on
                         * debugging.
                         */
                        final Set<IProject> projectSet = new HashSet<IProject>();
                        for (IResource resource : resources) {
                            addProjectBreakpoints(resource.getProject(), breakpoints, target, projectSet);
                        }
                    }
                    if (_formattersAdded.compareAndSet(false, true)) {
                        new AddDetailFormattersJob().schedule();
                    }
                }
            }
        }

        private void addProjectBreakpoints(IProject project, IBreakpoint[] breakpoints, IJavaDebugTarget target,
                Set<IProject> seen) {
            if (!seen.add(project)) {
                return;
            }
            if (!project.isAccessible()) {
                return;
            }
            for (IBreakpoint breakpoint : breakpoints) {
                final IProject breakpointProject = breakpoint.getMarker().getResource().getProject();
                if (project.equals(breakpointProject)) {
                    try {
                        if (breakpoint.isEnabled()) {
                            target.breakpointAdded(breakpoint);
                        }
                    } catch (CoreException e) {
                        e.printStackTrace();
                    }
                }
            }
            try {
                final IProjectDescription description = project.getDescription();
                for (IProject referenced : description.getDynamicReferences()) {
                    addProjectBreakpoints(referenced, breakpoints, target, seen);
                }
                for (IProject referenced : description.getReferencedProjects()) {
                    addProjectBreakpoints(referenced, breakpoints, target, seen);
                }
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     * Hacky solution to register SwitchYard specific detail formatters (there's
     * no extension point for adding these).
     */
    private static final class AddDetailFormattersJob extends UIJob {

        private AddDetailFormattersJob() {
            super("Add SwitchYard detail formatters");
        }

        @Override
        public IStatus runInUIThread(IProgressMonitor monitor) {
            final Set<String> types = new HashSet<String>();
            final String[] existingFormatters = JavaDebugOptionsManager.parseList(JDIDebugUIPlugin.getDefault().getPreferenceStore().getString(IJDIPreferencesConstants.PREF_DETAIL_FORMATTERS_LIST));
            if (existingFormatters.length % 3 != 0) {
                getDefault().getLog().log(
                        new Status(Status.ERROR, PLUGIN_ID,
                                "Error adding SwitchYard detail formatters.  The preference format has changed!"));
                return Status.OK_STATUS;
            }
            for (int i= 0, length= existingFormatters.length; i < length; i += 3) {
                types.add(existingFormatters[i]);
            }
            final List<String> copy = new ArrayList<String>(Arrays.asList(existingFormatters));
            // array format is group of three settings: type, expression, enabled (1|0).
            // note, "," needs to be escaped as "\u0000"
            if (!types.contains("org.switchyard.ExchangePhase")) {
                copy.add("org.switchyard.ExchangePhase");
                copy.add("toString()");
                copy.add("1");
            }

            if (!types.contains("org.switchyard.ExchangeState")) {
                copy.add("org.switchyard.ExchangeState");
                copy.add("toString()");
                copy.add("1");
            }

            if (!types.contains("javax.xml.namespace.QName")) {
                copy.add("javax.xml.namespace.QName");
                copy.add("getLocalPart() + ( getNamespaceURI() == null || \"\".equals(getNamespaceURI()) ? \"\" : \" {\" + getNamespaceURI() + \"}\")");
                copy.add("1");
            }

            if (!types.contains("org.switchyard.Property")) {
                copy.add("org.switchyard.Property");
                copy.add("getName() + \" = \" + getValue()");
                copy.add("1");
            }

            if (!types.contains("org.switchyard.extensions.wsdl.WSDLService")) {
                copy.add("org.switchyard.extensions.wsdl.WSDLService");
                copy.add("getPortType().getLocalPart()");
                copy.add("1");
            }

            if (!types.contains("org.switchyard.internal.ServiceImpl")) {
                copy.add("org.switchyard.internal.ServiceImpl");
                copy.add("getName().getLocalPart() + \" (\" + getClass().getSimpleName() + \")\"");
                copy.add("1");
            }

            if (!types.contains("org.switchyard.metadata.ServiceOperation")) {
                copy.add("org.switchyard.metadata.ServiceOperation");
                copy.add("getName()");
                copy.add("1");
            }

            if (!types.contains("org.switchyard.metadata.BaseService")) {
                copy.add("org.switchyard.metadata.BaseService");
                copy.add("getType() + \" (\" + getClass().getSimpleName() + \")\"");
                copy.add("1");
            }

            if (!types.contains("org.switchyard.Scope")) {
                copy.add("org.switchyard.Scope");
                copy.add("toString()");
                copy.add("1");
            }

            if (!types.contains("org.switchyard.extensions.java.JavaService")) {
                copy.add("org.switchyard.extensions.java.JavaService");
                copy.add("getJavaInterface()");
                copy.add("1");
            }

            if (!types.contains("org.switchyard.Service")) {
                copy.add("org.switchyard.Service");
                copy.add("getName().toString()");
                copy.add("1");
            }

            if (!types.contains("org.switchyard.bus.camel.CamelExchangeProperty")) {
                copy.add("org.switchyard.bus.camel.CamelExchangeProperty");
                copy.add("getName() + \" = \" + getValue() + \" (\" + getClass().getSimpleName() + \")\"");
                copy.add("1");
            }

            if (!types.contains("org.switchyard.ExchangePattern")) {
                copy.add("org.switchyard.ExchangePattern");
                copy.add("toString()");
                copy.add("1");
            }

            if (!types.contains("org.switchyard.ServiceReference")) {
                copy.add("org.switchyard.ServiceReference");
                copy.add("getName().toString()");
                copy.add("1");
            }

            if (!types.contains("org.switchyard.metadata.ExchangeContract")) {
                copy.add("org.switchyard.metadata.ExchangeContract");
                copy.add("\"\" + getConsumerOperation().getName() + \" => \" + getProviderOperation().getName()");
                copy.add("1");
            }

            if (!types.contains("org.switchyard.bus.camel.CamelMessageProperty")) {
                copy.add("org.switchyard.bus.camel.CamelMessageProperty");
                copy.add("getName() +\" = \" + getValue() + \" (\" + getClass().getSimpleName() + \")\"");
                copy.add("1");
            }

            if (!types.contains("org.switchyard.metadata.BaseExchangeContract")) {
                copy.add("org.switchyard.metadata.BaseExchangeContract");
                copy.add("getConsumerOperation().getName() + \" => \" + (getProviderOperation() == null ? \"<null>\" : getProviderOperation().getName()) + \" (\" + getClass().getSimpleName() + \")\"");
                copy.add("1");
            }

            if (!types.contains("org.switchyard.internal.ServiceReferenceImpl")) {
                copy.add("org.switchyard.internal.ServiceReferenceImpl");
                copy.add("getName().getLocalPart() + \" (\" + getClass().getSimpleName() + \")\"");
                copy.add("1");
            }

            if (!types.contains("org.switchyard.metadata.InOutOperation")) {
                copy.add("org.switchyard.metadata.InOutOperation");
                copy.add("getName() + \" (\" + getClass().getSimpleName() + \")\"");
                copy.add("1");
            }

            JDIDebugUIPlugin.getDefault().getPreferenceStore().setValue(IJDIPreferencesConstants.PREF_DETAIL_FORMATTERS_LIST, JavaDebugOptionsManager.serializeList(copy.toArray(new String[copy.size()])));

            return Status.OK_STATUS;
        }
    }
}
