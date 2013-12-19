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

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.debug.core.IJavaBreakpoint;
import org.eclipse.jdt.internal.debug.ui.breakpoints.AbstractJavaBreakpointEditor;
import org.eclipse.jdt.internal.debug.ui.propertypages.JavaBreakpointPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IPropertyListener;

/**
 * SwitchYardBreakpointPage
 * <p/>
 * Property page for Service Interaction breakpoint.
 */
@SuppressWarnings("restriction")
public class SwitchYardBreakpointPage extends JavaBreakpointPage {

    private AbstractJavaBreakpointEditor _editor;
    private final Class<? extends IBreakpoint> _type;

    protected SwitchYardBreakpointPage(final Class<? extends IBreakpoint> type) {
        _type = type;
    }

    /**
     * ServiceInteractionBreakpointPage.
     */
    public static final class ServiceInteractionBreakpointPage extends SwitchYardBreakpointPage {
        /**
         * Create a new ServiceInteractionBreakpointPage.
         */
        public ServiceInteractionBreakpointPage() {
            super(ServiceInteractionBreakpoint.class);
        }
    }

    /**
     * TransformSequenceBreakpointPage.
     */
    public static final class TransformSequenceBreakpointPage extends SwitchYardBreakpointPage {
        /**
         * Create a new TransformSequenceBreakpointPage.
         */
        public TransformSequenceBreakpointPage() {
            super(TransformSequenceBreakpoint.class);
        }
    }

    /**
     * ValidateHandlerBreakpointPage.
     */
    public static final class ValidateHandlerBreakpointPage extends SwitchYardBreakpointPage {
        /**
         * Create a new ValidateHandlerBreakpointPage.
         */
        public ValidateHandlerBreakpointPage() {
            super(ValidateHandlerBreakpoint.class);
        }
    }

    @Override
    public void setElement(IAdaptable element) {
        final Object source = element.getAdapter(EObject.class);
        if (source == null) {
            super.setElement(element);
        } else {
            super.setElement((IAdaptable) Platform.getAdapterManager().getAdapter(source, _type));
        }
    }

    @Override
    protected void doStore() throws CoreException {
        IJavaBreakpoint breakpoint = getBreakpoint();
        breakpoint.setEnabled(fEnabledButton.getSelection());
        if (_editor.isDirty()) {
            _editor.doSave();
        }
    }

    @Override
    protected void createTypeSpecificEditors(Composite parent) {
        try {
            String type = getBreakpoint().getMarker().getType();
            if (SwitchYardDebugUtil.TRANSFORM_BREAKPOINT_MARKER_ID.equals(type)) {
                _editor = new TransformBreakpointEditor();
            } else if (SwitchYardDebugUtil.VALIDATE_BREAKPOINT_MARKER_ID.equals(type)) {
                _editor = new ValidateBreakpointEditor();
            } else {
                _editor = new ServiceInteractionBreakpointEditor();
            }
            _editor.createControl(parent);
            _editor.addPropertyListener(new IPropertyListener() {
                public void propertyChanged(Object source, int propId) {
                    IStatus status = _editor.getStatus();
                    if (status.isOK()) {
                        if (fPrevMessage != null) {
                            removeErrorMessage(fPrevMessage);
                            fPrevMessage = null;
                        }
                    } else {
                        fPrevMessage = status.getMessage();
                        addErrorMessage(fPrevMessage);
                    }
                }
            });
            _editor.setInput(getBreakpoint());
        } catch (CoreException e) {
            setErrorMessage(e.getMessage());
        }
    }

    @Override
    protected void createTypeSpecificLabels(Composite parent) {
        final DelegatingJavaBreakpoint<?> breakpoint = (DelegatingJavaBreakpoint<?>) getBreakpoint();
        final IResource resource = breakpoint.getMarker().getResource();
        final IInteractionConfiguration configuration = breakpoint.getInteractionConfiguration();
        final QName service;
        if (configuration.getConsumerName() != null) {
            service = configuration.getConsumerName();
        } else if (configuration.getProviderName() != null) {
            service = configuration.getProviderName();
        } else {
            service = null;
        }
        if (service != null) {
            createLabel(parent, "Service Name");
            SWTFactory.createText(parent, SWT.READ_ONLY, 1, service.getLocalPart());
            if (service.getNamespaceURI() != null) {
                createLabel(parent, "Service Namespace");
                SWTFactory.createText(parent, SWT.READ_ONLY, 1, service.getNamespaceURI());
            }
        }
        if (resource != null && resource.getProject() != null) {
            createLabel(parent, "Project");
            SWTFactory.createText(parent, SWT.READ_ONLY, 1, resource.getProject().getName());
        }
        setTitle(new SwitchYardDebugModelPresentation().getText(breakpoint));
    }

}
