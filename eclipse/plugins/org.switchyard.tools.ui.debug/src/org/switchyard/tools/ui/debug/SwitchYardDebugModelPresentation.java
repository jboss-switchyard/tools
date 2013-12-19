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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.ui.IDebugModelPresentation;
import org.eclipse.debug.ui.IValueDetailListener;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.IImageDescriptors;
import org.switchyard.tools.ui.common.impl.SwitchYardProjectManager;
import org.switchyard.tools.ui.debug.IInteractionConfiguration.TriggerType;

/**
 * SwitchYardDebugModelPresentation
 * <p/>
 * Presentation for SwitchYard debug objects (e.g. ServiceBreakpoint).
 */
public class SwitchYardDebugModelPresentation implements IDebugModelPresentation {

    @Override
    public void addListener(ILabelProviderListener listener) {
    }

    @Override
    public void dispose() {
    }

    @Override
    public boolean isLabelProperty(Object element, String property) {
        return false;
    }

    @Override
    public void removeListener(ILabelProviderListener listener) {
    }

    @Override
    public IEditorInput getEditorInput(Object element) {
        IResource resource = null;
        if (element instanceof IBreakpoint) {
            element = ((IBreakpoint) element).getMarker();
        }
        if (element instanceof IMarker) {
            resource = ((IMarker) element).getResource();
        }
        if (resource == null || resource.getProject() == null || !resource.getProject().isAccessible()) {
            return null;
        }
        IFile file = SwitchYardProjectManager.instance().getSwitchYardProject(resource.getProject())
                .getSwitchYardConfigurationFile();
        if (file != null) {
            return new FileEditorInput(file);
        }
        return null;
    }

    @Override
    public String getEditorId(IEditorInput input, Object element) {
        try {
            final IEditorDescriptor descriptor;
            if (input instanceof IFileEditorInput) {
                descriptor = IDE.getEditorDescriptor(((IFileEditorInput) input).getFile());
            } else {
                descriptor = IDE.getEditorDescriptor(input.getName());
            }
            return descriptor.getId();
        } catch (PartInitException e) {
            return null;
        }
    }

    @Override
    public void setAttribute(String attribute, Object value) {
    }

    @Override
    public Image getImage(Object element) {
        if (element instanceof IMarker) {
            element = DebugPlugin.getDefault().getBreakpointManager().getBreakpoint((IMarker) element);
        }
        if (element instanceof DelegatingJavaBreakpoint) {
            return Activator.getDefault().getImageRegistry().get(IImageDescriptors.SWITCH_YARD_SMALL);
        }
        return null;
    }

    @Override
    public String getText(Object element) {
        if (element instanceof IMarker) {
            element = DebugPlugin.getDefault().getBreakpointManager().getBreakpoint((IMarker) element);
        }
        if (element instanceof TransformSequenceBreakpoint) {
            return "Transform Breakpoint: " + ((IBreakpoint) element).getMarker().getResource().getName();
        } else if (element instanceof ValidateHandlerBreakpoint) {
            return "Validate Breakpoint: " + ((IBreakpoint) element).getMarker().getResource().getName();
        } else if (element instanceof DelegatingJavaBreakpoint) {
            final DelegatingJavaBreakpoint<?> breakpoint = (DelegatingJavaBreakpoint<?>) element;
            final IInteractionConfiguration config = breakpoint.getInteractionConfiguration();
            if (config.getConsumerName() == null) {
                if (config.getProviderName() == null) {
                    return String.format("SwitchYard Service: <all> on %s",
                            config.getTriggers() == null ? TriggerType.values() : config.getTriggers().toArray());
                }
                return String.format("SwitchYard PROVIDER: %s on %s", config.getProviderName().getLocalPart(),
                        config.getTriggers());
            } else if (config.getProviderName() == null) {
                return String.format("SwitchYard CONSUMER: %s on %s", config.getConsumerName().getLocalPart(),
                        config.getTriggers());
            }
            return String.format("SwitchYard Service Intercept: %s to %s on %s", config.getConsumerName()
                    .getLocalPart(), config.getProviderName().getLocalPart(), config.getTriggers());
        }
        return element == null ? "" : element.toString();
    }

    @Override
    public void computeDetail(IValue value, IValueDetailListener listener) {
    }

}
