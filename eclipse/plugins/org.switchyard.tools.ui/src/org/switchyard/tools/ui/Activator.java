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
package org.switchyard.tools.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 */
public class Activator extends AbstractUIPlugin {

    /** The PLUGIN_ID. */
    public static final String PLUGIN_ID = "org.switchyard.tools.ui"; //$NON-NLS-1$

    // The shared instance
    private static Activator plugin;

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

    @Override
    protected void initializeImageRegistry(ImageRegistry reg) {
        super.initializeImageRegistry(reg);
        reg.put(IImageDescriptors.SWITCH_YARD_SMALL, createImageDescriptor(IImageDescriptors.SWITCH_YARD_SMALL));
        reg.put(IImageDescriptors.SWITCH_YARD_LARGE, createImageDescriptor(IImageDescriptors.SWITCH_YARD_LARGE));
        reg.put(IImageDescriptors.SERVICE_ICON, createImageDescriptor(IImageDescriptors.SERVICE_ICON));
        reg.put(IImageDescriptors.REFERENCE_ICON, createImageDescriptor(IImageDescriptors.REFERENCE_ICON));
        reg.put(IImageDescriptors.COMPONENT_ICON, createImageDescriptor(IImageDescriptors.COMPONENT_ICON));
        reg.put(IImageDescriptors.ARTIFACT_ICON, createImageDescriptor(IImageDescriptors.ARTIFACT_ICON));
    }

    private ImageDescriptor createImageDescriptor(String id) {
        return imageDescriptorFromPlugin(PLUGIN_ID, id);
    }

}
