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
package org.switchyard.tools.ui.common.impl;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.wst.wsdl.Definition;
import org.eclipse.wst.wsdl.PortType;
import org.eclipse.wst.wsdl.util.WSDLResourceImpl;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.SwitchYardModelUtils;
import org.switchyard.tools.ui.common.IInterfaceControlAdapter;
import org.switchyard.tools.ui.common.WSDLPortTypeSelectionDialog;
import org.switchyard.tools.ui.i18n.Messages;
import org.switchyard.tools.ui.wizards.Java2WSDLWizard;
import org.switchyard.tools.ui.wizards.NewWSDLFileWizard;

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
    private Interface _related;

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
    public void setRelatedInterface(Interface related) {
        _related = related;
    }

    @Override
    public void init(Interface intf) {
        final String typeString = intf == null ? null : ((WSDLPortType) intf).getInterface();
        _interface = ScaFactory.eINSTANCE.createWSDLPortType();
        _interface.setInterface(typeString);
    }

    @Override
    public boolean browse(Shell shell, IJavaElement element) {
        WSDLPortTypeSelectionDialog dialog = new WSDLPortTypeSelectionDialog(shell, element == null ? ResourcesPlugin
                .getWorkspace().getRoot() : element.getJavaProject().getProject());
        dialog.setInitialPattern("*.wsdl"); //$NON-NLS-1$
        if (dialog.open() == WSDLPortTypeSelectionDialog.OK) {
            PortType result = dialog.getSelectedPortType();
            if (result != null) {
                _interface.setInterface(getInterfaceURL(element, result));
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean open(Shell shell, IJavaProject project, boolean useRelated) {
        if (useRelated) {
            if (_related instanceof JavaInterface) {
                return openJava2WSDLWizard(shell, project);
            }
        }
        return openNewWSDLFileWizard(shell, project);
    }

    private boolean openNewWSDLFileWizard(Shell shell, IJavaProject project) {
        IResource container = JavaUtil.getFirstResourceRoot(project);
        IStructuredSelection selectionToPass;
        if (container == null) {
            selectionToPass = StructuredSelection.EMPTY;
        } else {
            selectionToPass = new StructuredSelection(container);
        }

        NewWSDLFileWizard newWizard = new NewWSDLFileWizard();
        newWizard.setOpenOnFinish(false);
        newWizard.setStartingFileName("MyService.wsdl"); //$NON-NLS-1$
        newWizard.init(PlatformUI.getWorkbench(), selectionToPass);

        WizardDialog dialog = new WizardDialog(shell, newWizard);
        if (dialog.open() == Window.OK) {
            return updateInterfaceFromNewFile(newWizard.getNewFile(), project);
        }
        return false;
    }

    private boolean openJava2WSDLWizard(Shell shell, IJavaProject project) {
        final Java2WSDLWizard newWizard = new Java2WSDLWizard();
        final WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                newWizard);
        newWizard.init(PlatformUI.getWorkbench(), getResourceForInterface((JavaInterface) _related));
        if (dialog.open() == Window.OK) {
            return updateInterfaceFromNewFile(newWizard.getWSDLFile(), project);
        }
        return false;
    }

    private IStructuredSelection getResourceForInterface(JavaInterface javaIntf) {
        final IResource file = (IResource) Platform.getAdapterManager().loadAdapter(javaIntf,
                IResource.class.getCanonicalName());
        if (file == null) {
            return StructuredSelection.EMPTY;
        }
        return new StructuredSelection(file);
    }

    private boolean updateInterfaceFromNewFile(IFile newFile, IJavaProject project) {
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
        return false;
    }

    @Override
    public String getText() {
        if (_interface.getInterface() == null) {
            return ""; //$NON-NLS-1$
        }
        return _interface.getInterface();
    }

    @Override
    public IStatus validate(IJavaProject project) {
        if (_interface.getInterface() == null) {
            return new Status(Status.ERROR, Activator.PLUGIN_ID, Messages.WSDLInterfaceControlAdapter_statusMessage_selectPortType);
        } else {
            IResource wsdlResource = SwitchYardModelUtils.getJavaResource(
                    project == null ? null : project.getProject(), _interface.getInterface());
            if (wsdlResource == null) {
                return new Status(Status.WARNING, Activator.PLUGIN_ID,
                        Messages.WSDLInterfaceControlAdapter_statusMessage_selectedWSDLNotOnClasspath);

            }
            // else {
            // TODO: validate portType exists
            // }
        }
        return Status.OK_STATUS;
    }

    private String getInterfaceURL(IJavaElement element, PortType portType) {
        IPath filePath = new Path(portType.eResource().getURI().toPlatformString(true));
        IResource resource = element.getJavaProject().getProject().getWorkspace().getRoot().getFile(filePath);
        filePath = JavaUtil.getJavaPathForResource(resource);
        return filePath.toString() + "#wsdl.porttype(" + portType.getQName().getLocalPart() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
    }
}
