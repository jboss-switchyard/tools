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
package org.switchyard.tools.ui.editor.components.bean;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.common.ISwitchYardComponentExtension;
import org.switchyard.tools.ui.common.SwitchYardComponentExtensionManager;
import org.switchyard.tools.ui.operations.AbstractSwitchYardProjectOperation;
import org.switchyard.tools.ui.wizards.NewServiceTestClassWizardPage;

/**
 * CreateBeanServiceOperation
 * 
 * Creates a new Bean service.
 * 
 * @author Rob Cernich
 */
public class CreateBeanServiceOperation extends AbstractSwitchYardProjectOperation {

    private static final Collection<ISwitchYardComponentExtension> REQUIRED_COMPONENTS;
    private NewBeanServiceClassWizardPage _serviceClassPage;
    private NewServiceTestClassWizardPage _serviceTestClassPage;

    /**
     * Create a new CreateBeanServiceOperation.
     * 
     * @param serviceClassPage the page creating the new class.
     * @param serviceTestClassPage the page creating the new test class.
     * @param uiInfo adaptable for UI Shell, may be null.
     */
    public CreateBeanServiceOperation(NewBeanServiceClassWizardPage serviceClassPage,
            NewServiceTestClassWizardPage serviceTestClassPage, IAdaptable uiInfo) {
        this(serviceClassPage, serviceTestClassPage, true, uiInfo);
    }

    /**
     * Create a new CreateBeanServiceOperation.
     * 
     * @param serviceClassPage the page creating the new class.
     * @param serviceTestClassPage the page creating the new test class.
     * @param addServices true if the switchyard.xml file should be updated.
     * @param uiInfo adaptable for UI Shell, may be null.
     */
    public CreateBeanServiceOperation(NewBeanServiceClassWizardPage serviceClassPage,
            NewServiceTestClassWizardPage serviceTestClassPage, boolean addServices, IAdaptable uiInfo) {
        super(null, REQUIRED_COMPONENTS, addServices, "Creating new SwitchYard bean service.", uiInfo);
        _serviceClassPage = serviceClassPage;
        _serviceTestClassPage = serviceTestClassPage;
    }

    @Override
    protected void execute(IProgressMonitor monitor) throws CoreException {
        try {
            monitor.beginTask("", 100);
            monitor.subTask("Creating service implementation.");
            IProgressMonitor subMonitor = new SubProgressMonitor(monitor, 50,
                    SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
            try {
                _serviceClassPage.createType(subMonitor);
            } catch (InterruptedException e) {
                throw new CoreException(new Status(Status.CANCEL, Activator.PLUGIN_ID, e.getMessage(), e));
            } finally {
                subMonitor.done();
                subMonitor.setTaskName("");
            }

            try {
                if (_serviceTestClassPage != null) {
                    monitor.subTask("Creating service test.");
                    subMonitor = new SubProgressMonitor(monitor, 50, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                    _serviceTestClassPage.createType(subMonitor);
                }
            } catch (CoreException e) {
                throw new CoreException(new Status(Status.WARNING, Activator.PLUGIN_ID,
                        "An error occurred while creating service test class.", e));
            } catch (InterruptedException e) {
                throw new CoreException(new Status(Status.CANCEL, Activator.PLUGIN_ID, e.getMessage(), e));
            } finally {
                subMonitor.done();
                subMonitor.setTaskName("");
            }
        } finally {
            monitor.setTaskName("");
            monitor.done();
        }
    }

    @Override
    protected IProject getProject() {
        return _serviceClassPage.getJavaProject().getProject();
    }

    static {
        ISwitchYardComponentExtension found = null;
        for (ISwitchYardComponentExtension extension : SwitchYardComponentExtensionManager.instance()
                .getComponentExtensions()) {
            if ("org.switchyard.components:switchyard-component-bean".equals(extension.getId())) {
                found = extension;
                break;
            }
        }
        if (found == null) {
            REQUIRED_COMPONENTS = Collections.emptySet();
        } else {
            REQUIRED_COMPONENTS = Collections.singleton(found);
        }
    }
}
