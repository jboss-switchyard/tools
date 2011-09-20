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

import static org.switchyard.tools.ui.M2EUtils.DEFAULT_DEPENDENCIES;
import static org.switchyard.tools.ui.M2EUtils.createSwitchYardDependency;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.maven.model.Dependency;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.wizards.NewBeanServiceClassWizardPage;
import org.switchyard.tools.ui.wizards.NewServiceTestClassWizardPage;

/**
 * CreateBeanServiceOperation
 * 
 * Creates a new Bean service.
 * 
 * @author Rob Cernich
 */
public class CreateBeanServiceOperation extends AbstractSwitchYardProjectOperation {

    private static final Collection<String> SCANNERS;
    private static final Collection<Dependency> DEPENDENCIES;
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
        super(DEPENDENCIES, SCANNERS, true, "Creating new SwitchYard bean service.", uiInfo);
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
                monitor.subTask("Creating service test.");
                subMonitor = new SubProgressMonitor(monitor, 50, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                _serviceTestClassPage.createType(subMonitor);
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
        List<Dependency> dependencies = new ArrayList<Dependency>();
        dependencies.addAll(DEFAULT_DEPENDENCIES);
        dependencies.add(createSwitchYardDependency("org.switchyard.components", "switchyard-component-bean"));
        DEPENDENCIES = Collections.unmodifiableCollection(dependencies);
        SCANNERS = Collections.singletonList("org.switchyard.component.bean.config.model.BeanSwitchYardScanner");
    }
}
