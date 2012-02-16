/* 
 * JBoss, Home of Professional Open Source 
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved. 
 * See the copyright.txt in the distribution for a 
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use, 
 * modify, copy, or redistribute it subject to the terms and conditions 
 * of the GNU Lesser General Public License, v. 2.1. 
 * This program is distributed in the hope that it will be useful, but WITHOUT A 
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details. 
 * You should have received a copy of the GNU Lesser General Public License, 
 * v.2.1 along with this distribution; if not, write to the Free Software 
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA  02110-1301, USA.
 */
package org.switchyard.tools.ui.operations;

import java.util.Collections;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.common.SwitchYardComponentExtensionManager;
import org.switchyard.tools.ui.wizards.NewServiceTestClassWizardPage;

/**
 * CreateServiceTestOperation
 * 
 * Creates a new service test class.
 * 
 * @author Rob Cernich
 */
public class CreateServiceTestOperation extends AbstractSwitchYardProjectOperation {

    private NewServiceTestClassWizardPage _serviceTestClassPage;

    /**
     * Create a new CreateServiceTestOperation.
     * 
     * @param serviceTestClassPage the page creating the new test class.
     * @param uiInfo adaptable for UI Shell, may be null.
     */
    public CreateServiceTestOperation(NewServiceTestClassWizardPage serviceTestClassPage, IAdaptable uiInfo) {
        super(null, Collections
                .singleton(SwitchYardComponentExtensionManager.instance().getRuntimeComponentExtension()), false,
                "Creating new SwitchYard service test.", uiInfo);
        _serviceTestClassPage = serviceTestClassPage;
    }

    @Override
    protected void execute(IProgressMonitor monitor) throws CoreException {
        try {
            monitor.beginTask("", 100);
            monitor.subTask("Creating service implementation.");
            IProgressMonitor subMonitor = new SubProgressMonitor(monitor, 100,
                    SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
            try {
                _serviceTestClassPage.createType(subMonitor);
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
        return _serviceTestClassPage.getJavaProject().getProject();
    }

}
