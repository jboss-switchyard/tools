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
package org.switchyard.tools.ui.editor.diagram.shared;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.wst.wsdl.Definition;
import org.eclipse.wst.wsdl.PortType;
import org.eclipse.wst.wsdl.util.WSDLResourceImpl;
import org.switchyard.tools.ui.SwitchYardModelUtils;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.util.JavaUtil;

/**
 * JavaInterfaceControlAdapter
 * 
 * <p/>
 * Control adapter supporting Java interfaces.
 * 
 * @author Rob Cernich
 */
public class WSDLInterfaceControlAdapter implements IInterfaceControlAdapter {

    private WSDLPortType _interface;

    /**
     * Create a new JavaInterfaceControlAdapter.
     */
    public WSDLInterfaceControlAdapter() {
        _interface = ScaFactory.eINSTANCE.createWSDLPortType();
    }

    @Override
    public Interface getInterface() {
        return _interface;
    }

    @Override
    public void init(Interface intf) {
        final String typeString = intf == null ? null : ((WSDLPortType) intf).getInterface();
        _interface.setInterface(typeString);
    }

    @Override
    public boolean browse(Shell shell, IJavaProject project) {
        WSDLPortTypeSelectionDialog dialog = new WSDLPortTypeSelectionDialog(shell, project == null ? ResourcesPlugin
                .getWorkspace().getRoot() : project.getProject());
        dialog.setInitialPattern("*.wsdl");
        if (dialog.open() == WSDLPortTypeSelectionDialog.OK) {
            PortType result = dialog.getSelectedPortType();
            if (result != null) {
                _interface.setInterface(getInterfaceURL(project, result));
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean open(Shell shell, IJavaProject project) {
        IResource container = JavaUtil.getFirstResourceRoot(project);
        IStructuredSelection selectionToPass;
        if (container == null) {
            selectionToPass = StructuredSelection.EMPTY;
        } else {
            selectionToPass = new StructuredSelection(container);
        }

        NewWSDLFileWizard newWizard = new NewWSDLFileWizard();
        newWizard.setOpenOnFinish(false);
        newWizard.setStartingFileName("MyService.wsdl");
        newWizard.init(PlatformUI.getWorkbench(), selectionToPass);

        WizardDialog dialog = new WizardDialog(shell, newWizard);
        if (dialog.open() == Window.OK) {
            IFile newFile = newWizard.getNewFile();
            ResourceSet resourceSet = new ResourceSetImpl();
            WSDLResourceImpl resource = (WSDLResourceImpl) resourceSet.getResource(
                    URI.createPlatformResourceURI(newFile.getFullPath().toString(), true), true);
            Definition definition = resource.getDefinition();
            @SuppressWarnings("unchecked")
            List<PortType> portTypes = definition.getEPortTypes();
            if (portTypes.size() > 0) {
                _interface.setInterface(getInterfaceURL(project, portTypes.get(0)));
                return true;
            }
        }
        return false;
    }

    @Override
    public String getText() {
        if (_interface.getInterface() == null) {
            return "";
        }
        return _interface.getInterface();
    }

    @Override
    public IStatus validate(IJavaProject project) {
        if (_interface.getInterface() == null) {
            return new Status(Status.ERROR, Activator.PLUGIN_ID, "Please specify a WSDL portType.");
        } else {
            IResource wsdlResource = SwitchYardModelUtils.getJavaResource(
                    project == null ? null : project.getProject(), _interface.getInterface());
            if (wsdlResource == null) {
                return new Status(Status.WARNING, Activator.PLUGIN_ID,
                        "The specified WSDL file is not on the project's classpath.");

            }
            // else {
            // TODO: validate portType exists
            // }
        }
        return Status.OK_STATUS;
    }

    private String getInterfaceURL(IJavaProject project, PortType portType) {
        IPath filePath = new Path(portType.eResource().getURI().toPlatformString(true));
        IResource resource = project.getProject().getWorkspace().getRoot().getFile(filePath);
        filePath = JavaUtil.getJavaPathForResource(resource);
        return filePath.toString() + "#wsdl.porttype(" + portType.getQName().getLocalPart() + ")";
    }
}
