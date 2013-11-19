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

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jdt.ui.actions.OpenNewInterfaceWizardAction;
import org.eclipse.jdt.ui.wizards.NewInterfaceWizardPage;
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
import org.eclipse.ui.dialogs.SelectionDialog;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.SwitchYardModelUtils;
import org.switchyard.tools.ui.common.IInterfaceControlAdapter;
import org.switchyard.tools.ui.i18n.Messages;
import org.switchyard.tools.ui.wizards.WSDL2JavaWizard;

/**
 * JavaInterfaceControlAdapter
 * 
 * <p/>
 * Control adapter supporting Java interfaces.
 * 
 * @author Rob Cernich
 */
public class JavaInterfaceControlAdapter implements IInterfaceControlAdapter {

    private JavaInterface _interface;
    private Interface _related;

    /**
     * Create a new JavaInterfaceControlAdapter.
     * 
     */
    public JavaInterfaceControlAdapter() {
        _interface = ScaFactory.eINSTANCE.createJavaInterface();
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
        final String typeString = intf == null ? null : ((JavaInterface) intf).getInterface();
        _interface = ScaFactory.eINSTANCE.createJavaInterface();
        _interface.setInterface(typeString);
    }

    @Override
    public boolean browse(Shell shell, IJavaElement element) {
        IJavaSearchScope scope;
        if (element == null) {
            scope = SearchEngine.createWorkspaceScope();
        } else {
            scope = SearchEngine.createJavaSearchScope(new IJavaElement[] {element });
        }
        try {
            SelectionDialog dialog = JavaUI.createTypeDialog(shell, PlatformUI.getWorkbench().getProgressService(),
                    scope, IJavaElementSearchConstants.CONSIDER_INTERFACES, false,
                    _interface.getInterface() == null ? "*Service" : _interface.getInterface()); //$NON-NLS-1$
            if (dialog.open() == SelectionDialog.OK) {
                Object[] result = dialog.getResult();
                if (result.length > 0 && result[0] instanceof IType) {
                    IType type = (IType) result[0];
                    _interface.setInterface(type.getFullyQualifiedName());
                    return true;
                }
            }
        } catch (JavaModelException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean open(Shell shell, IJavaProject project, boolean useRelated) {
        if (useRelated) {
            if (_related instanceof WSDLPortType) {
                return openWSDL2JavaWizard(shell, project);
            }
        }
        return openNewJavaInterfaceWizard(shell, project);
    }

    private boolean openNewJavaInterfaceWizard(Shell shell, IJavaProject project) {
        // TODO: if useRelated....
        IJavaElement initialJavaElement = JavaUtil.getInitialPackageForProject(project);
        IStructuredSelection selectionToPass;
        if (initialJavaElement == null) {
            selectionToPass = StructuredSelection.EMPTY;
        } else {
            selectionToPass = new StructuredSelection(initialJavaElement);
        }

        OpenNewInterfaceWizardAction action = new OpenNewInterfaceWizardAction();
        action.setSelection(selectionToPass);
        action.setOpenEditorOnFinish(false);

        NewInterfaceWizardPage page = new NewInterfaceWizardPage();
        page.init(selectionToPass);
        action.setConfiguredWizardPage(page);

        action.run();
        IJavaElement createdElement = action.getCreatedElement();
        if (createdElement != null && createdElement instanceof IType) {
            IType type = (IType) createdElement;
            _interface.setInterface(type.getFullyQualifiedName());
            return true;
        }
        return false;
    }

    private boolean openWSDL2JavaWizard(Shell shell, IJavaProject project) {
        final WSDL2JavaWizard newWizard = new WSDL2JavaWizard();
        final WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                newWizard);
        newWizard.init(PlatformUI.getWorkbench(), getResourceForInterface((WSDLPortType) _related));
        if (dialog.open() == Window.OK) {
            // unfortunately, user needs to browse for generated file
            return browse(shell, newWizard.getOutputPackage());
        }
        return false;
    }

    private IStructuredSelection getResourceForInterface(WSDLPortType wsdlIntf) {
        final IResource file = (IResource) Platform.getAdapterManager().loadAdapter(wsdlIntf,
                IResource.class.getCanonicalName());
        if (file == null) {
            return StructuredSelection.EMPTY;
        }
        return new StructuredSelection(file);
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
            return new Status(Status.ERROR, Activator.PLUGIN_ID, Messages.JavaInterfaceControlAdapter_statusMessage_selectJavaInterface);
        } else if (SwitchYardModelUtils.getJavaType(project == null ? null : project.getProject(),
                _interface.getInterface()) == null) {
            return new Status(Status.WARNING, Activator.PLUGIN_ID,
                    Messages.JavaInterfaceControlAdapter_statusMessage_SelectedTypeNotOnClasspath);
        }
        return Status.OK_STATUS;
    }

}
