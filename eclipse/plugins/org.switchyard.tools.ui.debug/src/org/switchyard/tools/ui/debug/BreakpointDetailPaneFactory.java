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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.ui.IDetailPane;
import org.eclipse.debug.ui.IDetailPaneFactory;
import org.eclipse.jface.viewers.IStructuredSelection;

/**
 * BreakpointDetailPaneFactory
 * <p/>
 * Contributes detail panes for SwitchYard breakpoints.
 */
public class BreakpointDetailPaneFactory implements IDetailPaneFactory {

    @SuppressWarnings("rawtypes")
    @Override
    public Set getDetailPaneTypes(IStructuredSelection selection) {
        HashSet<String> set = new HashSet<String>();
        if (selection.size() == 1) {
            IBreakpoint b = (IBreakpoint) selection.getFirstElement();
            try {
                String type = b.getMarker().getType();
                if (SwitchYardDebugUtil.SERVICE_INTERACTION_BREAKPOINT_MARKER_ID.equals(type)) {
                    set.add(ServiceInteractionBreakpointDetailPane.ID);
                } else if (SwitchYardDebugUtil.TRANSFORM_BREAKPOINT_MARKER_ID.equals(type)) {
                    set.add(TransformBreakpointDetailPane.ID);
                } else if (SwitchYardDebugUtil.VALIDATE_BREAKPOINT_MARKER_ID.equals(type)) {
                    set.add(ValidateBreakpointDetailPane.ID);
                }
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }
        return set;
    }

    @Override
    public String getDefaultDetailPane(IStructuredSelection selection) {
        if (selection.size() == 1) {
            IBreakpoint b = (IBreakpoint) selection.getFirstElement();
            try {
                String type = b.getMarker().getType();
                if (SwitchYardDebugUtil.SERVICE_INTERACTION_BREAKPOINT_MARKER_ID.equals(type)) {
                    return ServiceInteractionBreakpointDetailPane.ID;
                } else if (SwitchYardDebugUtil.TRANSFORM_BREAKPOINT_MARKER_ID.equals(type)) {
                    return TransformBreakpointDetailPane.ID;
                } else if (SwitchYardDebugUtil.VALIDATE_BREAKPOINT_MARKER_ID.equals(type)) {
                    return ValidateBreakpointDetailPane.ID;
                }
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public IDetailPane createDetailPane(String paneID) {
        if (ServiceInteractionBreakpointDetailPane.ID.equals(paneID)) {
            return new ServiceInteractionBreakpointDetailPane();
        } else if (TransformBreakpointDetailPane.ID.equals(paneID)) {
            return new TransformBreakpointDetailPane();
        } else if (ValidateBreakpointDetailPane.ID.equals(paneID)) {
            return new ValidateBreakpointDetailPane();
        }
        return null;
    }

    @Override
    public String getDetailPaneName(String paneID) {
        if (ServiceInteractionBreakpointDetailPane.ID.equals(paneID)) {
            return "SwitchYard Service Breakpoint Settings";
        } else if (SwitchYardDebugUtil.TRANSFORM_BREAKPOINT_MARKER_ID.equals(paneID)) {
            return "SwitchYard Transform Breakpoint Settings";
        } else if (SwitchYardDebugUtil.VALIDATE_BREAKPOINT_MARKER_ID.equals(paneID)) {
            return "SwitchYard Validate Breakpoint Settings";
        }
        return null;
    }

    @Override
    public String getDetailPaneDescription(String paneID) {
        return getDetailPaneName(paneID);
    }

}
