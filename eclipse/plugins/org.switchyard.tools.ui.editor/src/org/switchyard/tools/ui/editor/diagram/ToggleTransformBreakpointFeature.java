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

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.platform.IDiagramContainer;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.switchyard.tools.ui.debug.SwitchYardDebugUtil;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * ToggleTransformBreakpointFeature
 * <p/>
 * Toggles a transform breakpoint on the project.
 */
public class ToggleTransformBreakpointFeature extends AbstractCustomFeature implements ICustomFeature {

    private IBreakpoint _toDelete;
    private final PictogramElement _pe;
    private final Composite _composite;

    /**
     * Create a new ToggleTransformBreakpointFeature.
     * 
     * @param fp the feature provider
     * @param context the context
     */
    public ToggleTransformBreakpointFeature(IFeatureProvider fp, ICustomContext context) {
        super(fp);
        _pe = context.getPictogramElements()[0];
        final Object bo = getBusinessObjectForPictogramElement(_pe);
        final IProject project = getProject();
        if (bo instanceof Composite) {
            _composite = (Composite) bo;
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
                _toDelete = breakpoint;
                break;
            }
        } else {
            _composite = null;
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
            try {
                SwitchYardDebugUtil.createTransformBreakpoint(project);
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

    @Override
    public String getDescription() {
        return (_toDelete == null ? "Set" : "Clear") + " a transform breakpoint.";
    }

    @Override
    public String getImageId() {
        return ImageProvider.IMG_16_TRANSFORM_WATCH;
    }

    @Override
    public boolean canExecute(ICustomContext context) {
        return isAvailable(context);
    }

    @Override
    public boolean isAvailable(IContext context) {
        return getProject() != null && _composite != null;
    }

    @Override
    public boolean hasDoneChanges() {
        // we don't change anything
        return false;
    }

    @Override
    public String getName() {
        return (_toDelete == null ? "Enable " : "Disable") + " Transform Breakpoint";
    }

    private IProject getProject() {
        final IDiagramContainer container = getDiagramBehavior().getDiagramContainer();
        if (container instanceof SwitchyardSCAEditor) {
            return ((SwitchyardSCAEditor) container).getModelFile().getProject();
        }
        return null;
    }
}
