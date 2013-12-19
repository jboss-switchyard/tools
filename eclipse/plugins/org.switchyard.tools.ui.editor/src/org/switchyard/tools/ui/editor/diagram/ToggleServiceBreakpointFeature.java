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
package org.switchyard.tools.ui.editor.diagram;

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.platform.IDiagramContainer;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.ui.debug.IInteractionConfiguration;
import org.switchyard.tools.ui.debug.ServiceInteractionBreakpoint;
import org.switchyard.tools.ui.debug.SwitchYardDebugUtil;
import org.switchyard.tools.ui.debug.SwitchYardDebugUtil.ServiceType;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * ToggleServiceBreakpointFeature
 * <p/>
 * Toggles a breakpoint on a selected figure.
 */
public class ToggleServiceBreakpointFeature extends AbstractCustomFeature implements ICustomFeature {

    private IBreakpoint _toDelete;
    private final PictogramElement _pe;
    private final Contract _contract;

    /**
     * Create a new ToggleServiceBreakpointFeature.
     * 
     * @param fp the feature provider
     * @param context the context
     */
    public ToggleServiceBreakpointFeature(IFeatureProvider fp, ICustomContext context) {
        super(fp);
        _pe = context.getPictogramElements()[0] instanceof Connection ? ((Connection) context.getPictogramElements()[0])
                .getStart().getParent() : context.getPictogramElements()[0];
        final Object bo = getBusinessObjectForPictogramElement(_pe);
        final IProject project = getProject();
        if (bo instanceof Contract) {
            _contract = (Contract) bo;
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
                        || !breakpointMatchesSelection((ServiceInteractionBreakpoint) breakpoint, (Contract) bo)) {
                    continue;
                }
                _toDelete = breakpoint;
                break;
            }
        } else {
            _contract = null;
        }
    }

    @Override
    public void execute(ICustomContext context) {
        final IProject project = getProject();
        if (_toDelete != null) {
            try {
                _toDelete.delete();
            } catch (CoreException e) {
                final IDiagramContainer container = getDiagramBehavior().getDiagramContainer();
                final Shell shell;
                if (container instanceof SwitchyardSCAEditor) {
                    shell = ((SwitchyardSCAEditor) container).getEditorSite().getShell();
                } else {
                    shell = Display.getCurrent().getActiveShell();
                }
                MessageDialog.openError(shell, "Error Removing Breakpoint", e.getStatus().getMessage());
                return;
            }
        } else {
            final URI uri = URI.createGenericURI("switchyard", "generated", EcoreUtil.getURI(_contract).fragment());
            try {
                SwitchYardDebugUtil.createServiceBreakpoint(project, getServiceName(_contract), uri.toString(),
                        ServiceType.fromContract(_contract));
            } catch (CoreException e) {
                final IDiagramContainer container = getDiagramBehavior().getDiagramContainer();
                final Shell shell;
                if (container instanceof SwitchyardSCAEditor) {
                    shell = ((SwitchyardSCAEditor) container).getEditorSite().getShell();
                } else {
                    shell = Display.getCurrent().getActiveShell();
                }
                MessageDialog.openError(shell, "Error Adding Breakpoint", e.getStatus().getMessage());
                return;
            }
        }
        getDiagramBehavior().refreshRenderingDecorators(_pe);
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

    @Override
    public String getDescription() {
        return (_toDelete == null ? "Set" : "Clear") + " a breakpoint on the selected service.";
    }

    @Override
    public String getImageId() {
        return ImageProvider.IMG_16_SERVICE_WATCH;
    }

    @Override
    public boolean canExecute(ICustomContext context) {
        return isAvailable(context);
    }

    @Override
    public boolean isAvailable(IContext context) {
        if (_contract == null || getProject() == null) {
            return false;
        }
        final QName serviceName = getServiceName(_contract);
        return serviceName != null && serviceName.getLocalPart() != null;
    }

    @Override
    public boolean hasDoneChanges() {
        // we don't change anything
        return false;
    }

    @Override
    public String getName() {
        return (_toDelete == null ? "Enable " : "Disable") + " Breakpoint";
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

    private IProject getProject() {
        final IDiagramContainer container = getDiagramBehavior().getDiagramContainer();
        if (container instanceof SwitchyardSCAEditor) {
            return ((SwitchyardSCAEditor) container).getModelFile().getProject();
        }
        return null;
    }
}
