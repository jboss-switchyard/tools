/*************************************************************************************
 * Copyright (c) 2011 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.editor.diagram.component.wizards;

import java.util.EnumSet;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.ui.CodeGeneration;
import org.eclipse.jdt.ui.wizards.NewClassWizardPage;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.ui.editor.diagram.shared.ContractControl;
import org.switchyard.tools.ui.editor.diagram.shared.InterfaceControl.InterfaceType;

/**
 * NewCamelRouteClassWizardPage
 * 
 * Create a new Camel route definition class.
 * 
 * @author Rob Cernich
 */
public class NewCamelRouteClassWizardPage extends NewClassWizardPage {

    private static final String SERVICE_INTERFACE = "SERVICE_INTERFACE";

    private ContractControl _serviceInterfaceControl;
    private IStatus _serviceInterfaceStatus;

    /**
     * Create a new NewCamelRouteClassWizardPage.
     */
    public NewCamelRouteClassWizardPage() {
        super();

        setTitle("New Camel Route Service");
        setDescription("Create a new service implementation based on a Camel route definition.");

        _serviceInterfaceControl = new ContractControl(ScaPackage.eINSTANCE.getComponentService(), getJavaProject(),
                EnumSet.of(InterfaceType.Java, InterfaceType.WSDL));
        _serviceInterfaceControl.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                handleFieldChanged(SERVICE_INTERFACE);
            }
        });
    }

    /**
     * @param selection the current selection
     */
    public void init(IStructuredSelection selection) {
        super.init(selection);
        setModifiers(Flags.AccPublic, false);
        setMethodStubSelection(false, false, false, false);
        if (getTypeName().length() == 0) {
            setTypeName("CamelServiceRoute", true);
        }
        setSuperClass("org.apache.camel.builder.RouteBuilder", false);

        doStatusUpdate();
    }

    @Override
    public void createControl(Composite parent) {
        initializeDialogUnits(parent);

        Composite composite = new Composite(parent, SWT.NONE);
        composite.setFont(parent.getFont());

        int nColumns = 4;

        GridLayout layout = new GridLayout();
        layout.numColumns = nColumns;
        composite.setLayout(layout);

        // pick & choose the wanted UI components

        createContainerControls(composite, nColumns);
        createPackageControls(composite, nColumns);

        createSeparator(composite, nColumns);

        createTypeNameControls(composite, nColumns);
        createSeparator(composite, nColumns);
        createServiceInterfaceControls(composite, nColumns);

        createSeparator(composite, nColumns);

        createModifierControls(composite, nColumns);

        createSuperClassControls(composite, nColumns);

        createSeparator(composite, nColumns);

        createCommentControls(composite, nColumns);
        enableCommentControl(true);

        setControl(composite);

        Dialog.applyDialogFont(composite);
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible) {
            setFocus();
        }
    }

    @Override
    protected void createTypeMembers(IType type, ImportsManager imports, IProgressMonitor monitor) throws CoreException {
        super.createTypeMembers(type, imports, monitor);

        final String methodName = "configure";
        final StringBuffer buf = new StringBuffer();
        final String lineDelim = getJavaProject().getJavaModel().findRecommendedLineSeparator();
        buf.append("/**").append(lineDelim);
        buf.append(" * The Camel route is configured via this method.  The from:").append(lineDelim);
        buf.append(" * endpoint is required to be a SwitchYard service.").append(lineDelim);
        buf.append(" */").append(lineDelim);
        buf.append("public void ").append(methodName).append("() {"); //$NON-NLS-1$
        buf.append(lineDelim);

        String serviceName = getService().getName();
        StringBuffer body = new StringBuffer();
        body.append("from(\"switchyard://").append(serviceName).append("\")");
        body.append(lineDelim);
        body.append(".log(\"Received message for '").append(serviceName).append("' : ${body}\");");
        body.append(lineDelim);

        try {
            buf.append(CodeGeneration.getMethodBodyContent(type.getCompilationUnit(), type.getFullyQualifiedName(),
                    methodName, false, body.toString(), lineDelim));
        } catch (CoreException e) {
            buf.append(body);
        }

        buf.append("}"); //$NON-NLS-1$
        type.createMethod(buf.toString(), null, false, null);
    }

    @Override
    protected void handleFieldChanged(String fieldName) {
        super.handleFieldChanged(fieldName);

        if (fieldName == SERVICE_INTERFACE) {
            serviceInterfaceChanged();
        } else if (fieldName == CONTAINER) {
            _serviceInterfaceControl.setProject(getJavaProject());
            serviceInterfaceChanged();
        }
        doStatusUpdate();
    }

    private void doStatusUpdate() {
        // status of all used components
        IStatus[] status = new IStatus[] {fContainerStatus, fPackageStatus, fTypeNameStatus, fModifierStatus,
                fSuperClassStatus, fSuperInterfacesStatus, _serviceInterfaceStatus };

        updateStatus(status);
    }

    /**
     * @return the selected service.
     */
    public ComponentService getService() {
        return (ComponentService) _serviceInterfaceControl.getContract();
    }

    private void createServiceInterfaceControls(Composite composite, int nColumns) {
        _serviceInterfaceControl.createControl(composite, nColumns);
    }

    private void serviceInterfaceChanged() {
        _serviceInterfaceStatus = _serviceInterfaceControl.getStatus();
    }

}
