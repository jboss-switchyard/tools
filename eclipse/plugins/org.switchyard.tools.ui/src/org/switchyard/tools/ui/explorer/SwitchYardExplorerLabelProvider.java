/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.explorer;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.IDescriptionProvider;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.IImageDescriptors;

/**
 * SwitchYardExplorerLabelProvider
 * 
 * <p/>
 * Label provider for SwitchYard project explorer content.
 * 
 * @author Rob Cernich
 */
public class SwitchYardExplorerLabelProvider extends LabelProvider implements ILabelProvider, IDescriptionProvider {

    @Override
    public Image getImage(Object element) {
        if (element instanceof ISwitchYardRootNode) {
            return Activator.getDefault().getImageRegistry().get(IImageDescriptors.SWITCH_YARD_SMALL);
        } else if (element instanceof IServicesNode || element instanceof IReferencesNode
                || element instanceof IComponentsNode) {
            return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER);
        } else if (element instanceof IServiceNode || element instanceof IComponentService) {
            return Activator.getDefault().getImageRegistry().get(IImageDescriptors.SERVICE_ICON);
        } else if (element instanceof IReferenceNode || element instanceof IComponentReference) {
            return Activator.getDefault().getImageRegistry().get(IImageDescriptors.REFERENCE_ICON);
        } else if (element instanceof IComponentNode) {
            return Activator.getDefault().getImageRegistry().get(IImageDescriptors.COMPONENT_ICON);
        } else if (element instanceof IArtifactsNode) {
            return Activator.getDefault().getImageRegistry().get(IImageDescriptors.ARTIFACT_ICON);
        } else if (element instanceof IServiceGateway || element instanceof IArtifactNode) {
            return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FILE);
        }
        return super.getImage(element);
    }

    @Override
    public String getText(Object element) {
        if (element instanceof ISwitchYardRootNode) {
            return "SwitchYard";
        } else if (element instanceof ISwitchYardNode) {
            return named(((ISwitchYardNode) element).getName());
        }
        return super.getText(element);
    }

    @Override
    public String getDescription(Object element) {
        if (element instanceof ISwitchYardRootNode) {
            ISwitchYardRootNode root = (ISwitchYardRootNode) element;
            return named(root.getName()) + " Application - " + root.getProject().getName();
        } else if (element instanceof IServicesNode) {
            ISwitchYardRootNode root = ((IServicesNode) element).getRoot();
            return named(root.getName()) + " Application Services - " + root.getProject().getName();
        } else if (element instanceof IReferencesNode) {
            ISwitchYardRootNode root = ((IReferencesNode) element).getRoot();
            return named(root.getName()) + " Application References - " + root.getProject().getName();
        } else if (element instanceof IComponentsNode) {
            ISwitchYardRootNode root = ((IComponentsNode) element).getRoot();
            return named(root.getName()) + " Application Components - " + root.getProject().getName();
        } else if (element instanceof IArtifactsNode) {
            ISwitchYardRootNode root = ((IArtifactsNode) element).getRoot();
            return named(root.getName()) + " Application Artifacts - " + root.getProject().getName();
        } else if (element instanceof IServiceNode) {
            return getText(element) + " Service";
        } else if (element instanceof IReferenceNode) {
            return getText(element) + " Reference";
        } else if (element instanceof IComponentNode) {
            return getText(element) + " Component";
        } else if (element instanceof IComponentService) {
            return getText(element) + " Component Service";
        } else if (element instanceof IComponentReference) {
            return getText(element) + " Component Reference";
        } else if (element instanceof IArtifactNode) {
            return getText(element) + " Artifact Reference";
        } else if (element instanceof IServiceGateway) {
            return getText(element) + " Binding";
        }
        return super.getText(element);
    }

    private String named(String name) {
        if (name == null || name.length() == 0) {
            return "<unnamed>";
        }
        return name;
    }

}
