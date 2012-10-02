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
package org.switchyard.tools.ui.editor.components.camel.java;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.ui.wizards.NewClassCreationWizard;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.models.switchyard1_0.camel.JavaDSLType;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.PlatformResourceAdapterFactory;
import org.switchyard.tools.ui.editor.diagram.component.IComponentWizard;

/**
 * NewCamelJavaRouteComponentWizard
 * 
 * <p/>
 * Creates a new Camel Java based route implementation.
 * 
 * @author Rob Cernich
 */
@SuppressWarnings("restriction")
public class NewCamelJavaRouteComponentWizard extends NewClassCreationWizard implements IComponentWizard {

    private Contract _serviceInterface;
    private Component _component;

    /**
     * Create a new NewCamelJavaServiceWizard.
     */
    public NewCamelJavaRouteComponentWizard() {
        this(true);
    }

    /**
     * Create a new NewCamelJavaServiceWizard.
     * 
     * @param openEditorOnFinish true if the editor should be opened upon
     *            completion.
     */
    public NewCamelJavaRouteComponentWizard(boolean openEditorOnFinish) {
        super(new NewCamelRouteClassWizardPage(), openEditorOnFinish);
    }

    /**
     * Create a new NewCamelJavaRouteComponentWizard.
     * 
     * @param page an initialized NewCamelRouteClassWizardPage
     * @param openEditorOnFinish true if the editor should be opened upon
     *            completion.
     */
    public NewCamelJavaRouteComponentWizard(NewCamelRouteClassWizardPage page, boolean openEditorOnFinish) {
        super(page, openEditorOnFinish);
    }

    @Override
    public Component getCreatedObject() {
        return _component;
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
        super.init(workbench, currentSelection);
    }

    @Override
    public void init(Composite container) {
        if (container == null || !(getSelection() == null || getSelection().isEmpty())) {
            return;
        }
        IProject project = PlatformResourceAdapterFactory.getContainingProject(container);
        if (project == null) {
            return;
        }
        IJavaElement element = JavaUtil.getInitialPackageForProject(JavaCore.create(project));
        StructuredSelection selection = element == null ? StructuredSelection.EMPTY : new StructuredSelection(element);
        init(getWorkbench() == null ? PlatformUI.getWorkbench() : getWorkbench(), selection);
    }

    /**
     * Must be invoked before the dialog is opened.
     * 
     * @param serviceInterface the interface; may be null, indicating any
     *            interface is OK.
     */
    public void forceServiceInterfaceType(Contract serviceInterface) {
        _serviceInterface = serviceInterface;
    }

    @Override
    public void addPages() {
        super.addPages();

        // initialize the page
        NewCamelRouteClassWizardPage page = getCamelRouteClassPage();
        page.init(getSelection());
        page.forceServiceInterfaceType(_serviceInterface);
    }

    @Override
    protected void finishPage(IProgressMonitor monitor) throws InterruptedException, CoreException {
        super.finishPage(monitor);

        NewCamelRouteClassWizardPage page = getCamelRouteClassPage();
        IType newType = page.getCreatedType();

        if (newType == null) {
            return;
        }

        JavaDSLType javaType = CamelFactory.eINSTANCE.createJavaDSLType();
        javaType.setClass(newType.getFullyQualifiedName());

        CamelImplementationType implementation = CamelFactory.eINSTANCE.createCamelImplementationType();
        implementation.setJava(javaType);

        _component = ScaFactory.eINSTANCE.createComponent();
        _component.setName(newType.getElementName());
        _component.setImplementation(implementation);

        ComponentService service = page.getService();
        if (service != null) {
            _component.getService().add(service);
        }
    }

    private NewCamelRouteClassWizardPage getCamelRouteClassPage() {
        return (NewCamelRouteClassWizardPage) getPages()[0];
    }

}
