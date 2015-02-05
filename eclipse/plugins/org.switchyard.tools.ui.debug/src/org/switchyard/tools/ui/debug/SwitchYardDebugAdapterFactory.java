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

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.internal.ui.DebugUIPlugin;
import org.eclipse.debug.internal.ui.viewers.model.provisional.IColumnPresentationFactory;
import org.eclipse.debug.internal.ui.viewers.model.provisional.IElementLabelProvider;
import org.eclipse.debug.internal.ui.viewers.model.provisional.ILabelUpdate;
import org.eclipse.debug.internal.ui.viewers.model.provisional.IModelProxyFactory;
import org.eclipse.debug.ui.BreakpointTypeCategory;
import org.eclipse.debug.ui.IBreakpointTypeCategory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.internal.debug.ui.variables.JavaVariableColumnPresentationFactory;
import org.eclipse.jdt.internal.debug.ui.variables.JavaVariableLabelProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.IImageDescriptors;
import org.switchyard.tools.ui.debug.structure.SwitchYardModelProxyFactory;

/**
 * SwitchYardDebugAdapterFactory
 * <p/>
 * Adapter factory for SwitchYard debug objects.
 */
@SuppressWarnings({"rawtypes", "restriction" })
public class SwitchYardDebugAdapterFactory implements IAdapterFactory {

    private static final Class[] TYPES = new Class[] {IBreakpointTypeCategory.class, IWorkbenchAdapter.class,
            IModelProxyFactory.class, ServiceInteractionBreakpoint.class, TransformSequenceBreakpoint.class,
            ValidateHandlerBreakpoint.class, IElementLabelProvider.class };

    private static final IElementLabelProvider LABEL_PROVIDER = new JavaVariableLabelProvider() {
        @Override
        protected ISchedulingRule getRule(ILabelUpdate update) {
            return null;
        };
    };

    @Override
    public Class[] getAdapterList() {
        return TYPES;
    }

    @Override
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        if (adapterType == IBreakpointTypeCategory.class) {
            return adaptBreakpointCategory(adaptableObject);
        } else if (adapterType == IWorkbenchAdapter.class) {
            return adaptWorkbenchAdapter(adaptableObject);
        } else if (adapterType == IModelProxyFactory.class) {
            return new SwitchYardModelProxyFactory();
        } else if (adapterType == IColumnPresentationFactory.class) {
            return new JavaVariableColumnPresentationFactory();
        } else if (adapterType == ServiceInteractionBreakpoint.class) {
            return adaptServiceInteractionBreakpoint(adaptableObject);
        } else if (adapterType == TransformSequenceBreakpoint.class) {
            return adaptTransformSequenceBreakpoint(adaptableObject);
        } else if (adapterType == ValidateHandlerBreakpoint.class) {
            return adaptValidateHandlerBreakpoint(adaptableObject);
        } else if (adapterType == IElementLabelProvider.class) {
            return LABEL_PROVIDER;
        }
        return null;
    }

    private Object adaptServiceInteractionBreakpoint(Object adaptableObject) {
        if (adaptableObject instanceof Contract) {
            final Contract contract = (Contract) adaptableObject;
            final IProject project = getProject(contract);
            if (project == null) {
                return null;
            }
            final IBreakpoint[] breakpoints = DebugPlugin.getDefault().getBreakpointManager()
                    .getBreakpoints(SwitchYardDebugUtil.MODEL_IDENTIFIER);
            for (IBreakpoint breakpoint : breakpoints) {
                final IMarker marker = breakpoint.getMarker();
                String markerType = null;
                try {
                    markerType = marker.getType();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (marker == null || !project.equals(marker.getResource())
                        || !SwitchYardDebugUtil.SERVICE_INTERACTION_BREAKPOINT_MARKER_ID.equals(markerType)
                        || !breakpointMatchesSelection((ServiceInteractionBreakpoint) breakpoint, contract)) {
                    continue;
                }
                return breakpoint;
            }
        }
        return null;
    }

    private Object adaptTransformSequenceBreakpoint(Object adaptableObject) {
        if (adaptableObject instanceof Composite) {
            final IProject project = getProject((Composite) adaptableObject);
            if (project == null) {
                return null;
            }
            final IBreakpoint[] breakpoints = DebugPlugin.getDefault().getBreakpointManager()
                    .getBreakpoints(SwitchYardDebugUtil.MODEL_IDENTIFIER);
            for (IBreakpoint breakpoint : breakpoints) {
                final IMarker marker = breakpoint.getMarker();
                String markerType = null;
                try {
                    markerType = marker.getType();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (marker == null || !project.equals(marker.getResource())
                        || !SwitchYardDebugUtil.TRANSFORM_BREAKPOINT_MARKER_ID.equals(markerType)) {
                    continue;
                }
                return breakpoint;
            }
        }
        return null;
    }

    private Object adaptValidateHandlerBreakpoint(Object adaptableObject) {
        if (adaptableObject instanceof Composite) {
            final IProject project = getProject((Composite) adaptableObject);
            if (project == null) {
                return null;
            }
            final IBreakpoint[] breakpoints = DebugPlugin.getDefault().getBreakpointManager()
                    .getBreakpoints(SwitchYardDebugUtil.MODEL_IDENTIFIER);
            for (IBreakpoint breakpoint : breakpoints) {
                final IMarker marker = breakpoint.getMarker();
                String markerType = null;
                try {
                    markerType = marker.getType();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (marker == null || !project.equals(marker.getResource())
                        || !SwitchYardDebugUtil.VALIDATE_BREAKPOINT_MARKER_ID.equals(markerType)) {
                    continue;
                }
                return breakpoint;
            }
        }
        return null;
    }

    private Object adaptBreakpointCategory(Object adaptableObject) {
        if (adaptableObject instanceof DelegatingJavaBreakpoint) {
            return new BreakpointTypeCategory("SwitchYard Breakpoints", Activator.getDefault().getImageRegistry()
                    .getDescriptor(IImageDescriptors.SWITCH_YARD_SMALL));
        }
        return null;
    }

    private Object adaptWorkbenchAdapter(Object adaptableObject) {
        if (adaptableObject instanceof DelegatingJavaBreakpoint) {
            final DelegatingJavaBreakpoint breakpoint = (DelegatingJavaBreakpoint<?>) adaptableObject;
            return new IWorkbenchAdapter() {

                @Override
                public Object getParent(Object o) {
                    return null;
                }

                @Override
                public String getLabel(Object o) {
                    return DebugUIPlugin.getModelPresentation().getText(breakpoint);
                }

                @Override
                public ImageDescriptor getImageDescriptor(Object object) {
                    return null;
                }

                @Override
                public Object[] getChildren(Object o) {
                    return null;
                }
            };
        }
        return null;
    }

    private boolean breakpointMatchesSelection(final ServiceInteractionBreakpoint breakpoint, final Contract contract) {
        final IInteractionConfiguration config = breakpoint.getInteractionConfiguration();
        if (config == null) {
            return false;
        }
        final QName name = getServiceName(contract);
        if (contract instanceof Service || contract instanceof ComponentReference) {
            return config.getProviderName() == null && name.equals(config.getConsumerName());
        } else {
            return config.getConsumerName() == null && name.equals(config.getProviderName());
        }
    }

    private QName getServiceName(Contract contract) {
        if (contract.getName() == null) {
            return null;
        }
        String targetNamespace = null;
        for (EObject container = contract.eContainer(); container != null && targetNamespace == null; container = container
                .eContainer()) {
            if (container instanceof Composite) {
                targetNamespace = ((Composite) container).getTargetNamespace();
            } else if (container instanceof SwitchYardType) {
                targetNamespace = ((SwitchYardType) container).getTargetNamespace();
            }
        }
        if (contract instanceof Service) {
            return new QName(targetNamespace, contract.getName());
        } else if (contract instanceof ComponentReference) {
            final String componentName = ((Component) contract.eContainer()).getName();
            return new QName(targetNamespace, componentName == null ? contract.getName() : componentName + "/"
                    + contract.getName());
        } else {
            return new QName(targetNamespace, contract.getName());
        }
    }

    private IProject getProject(final EObject object) {
        final Resource objectResource = object.eResource();
        if (objectResource == null) {
            return null;
        } else if (objectResource.getResourceSet() == null) {
            if (objectResource.getURI().isPlatformResource()) {
                final IResource iresource = ResourcesPlugin.getWorkspace().getRoot()
                        .findMember(objectResource.getURI().toPlatformString(true));
                if (iresource != null) {
                    return iresource.getProject();
                }
            }
            return null;
        }
        for (Resource resource : objectResource.getResourceSet().getResources()) {
            if (resource.getURI().isPlatformResource()) {
                final IResource iresource = ResourcesPlugin.getWorkspace().getRoot()
                        .findMember(resource.getURI().toPlatformString(true));
                if (iresource != null) {
                    return iresource.getProject();
                }
            }
        }
        return null;
    }

}
