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
package org.switchyard.tools.ui.wizards;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;

/**
 * AbstractSwitchYardServiceWizard.
 * 
 * Base wizard for new SwitchYard services. Manages a service test page added to
 * the end of the wizard.
 * 
 * @author Rob Cernich
 */
public abstract class AbstractSwitchYardServiceWizard extends BasicNewResourceWizard {

    private NewServiceTestClassWizardPage _newTestClassPage;
    private boolean _initNewTestClassPage = true;
    private String _serviceInterfaceName;

    /**
     * Create a new NewBeanServiceWizard.
     */
    public AbstractSwitchYardServiceWizard() {
        setNeedsProgressMonitor(true);
    }

    /**
     * Extensions should invoke this after they have added their pages.
     */
    @Override
    public void addPages() {
        _newTestClassPage = new NewServiceTestClassWizardPage();
        _newTestClassPage.init(selection);
        addPage(_newTestClassPage);
    }

    @Override
    public boolean canFinish() {
        IWizardPage[] pages = getPages();
        for (int i = 0, count = pages.length - 1; i < count; ++i) {
            if (!pages[i].isPageComplete()) {
                return false;
            }
        }
        return !getCreateTestClass()
                || (_newTestClassPage.isPageComplete() && _serviceInterfaceName != null && _serviceInterfaceName
                        .equals(_newTestClassPage.getServiceInterface()));
    }

    @Override
    public IWizardPage getNextPage(IWizardPage page) {
        IWizardPage nextPage = super.getNextPage(page);
        if (nextPage != _newTestClassPage) {
            return nextPage;
        }
        if (!getCreateTestClass()) {
            return null;
        }
        if (_initNewTestClassPage || _serviceInterfaceName.equals(getServiceInterfaceName())
                || !getJavaProject().equals(_newTestClassPage.getJavaProject())) {
            _serviceInterfaceName = getServiceInterfaceName();
            _initNewTestClassPage = true;

            IPackageFragment packageFragment = getPackageFragment();
            _newTestClassPage.init(packageFragment == null ? StructuredSelection.EMPTY : new StructuredSelection(
                    packageFragment));
            _newTestClassPage.setServiceInterface(_serviceInterfaceName, false);
            _newTestClassPage.setTypeName(getSimpleServiceInterfaceName() + "Test", true);
            _newTestClassPage.setPackageFragment(packageFragment, _newTestClassPage.getPackageFragmentRoot() != null);
        }
        return _newTestClassPage;
    }

    /**
     * @return the NewServiceTestClassWizardPage.
     */
    protected NewServiceTestClassWizardPage getNewServiceTestClassWizardPage() {
        return _newTestClassPage;
    }

    /**
     * @return the name of the currently selected service interface.
     */
    protected abstract String getServiceInterfaceName();

    /**
     * @return the Java project in which the new object will be created.
     */
    protected abstract IJavaProject getJavaProject();

    /**
     * @return true if the user wishes to create a test class.
     */
    protected abstract boolean getCreateTestClass();

    /**
     * @return the simple (unqualified) name for the service interface
     */
    private String getSimpleServiceInterfaceName() {
        int lastDotIndex = _serviceInterfaceName.lastIndexOf('.');
        if (lastDotIndex > 0) {
            return _serviceInterfaceName.substring(lastDotIndex + 1);
        }
        return _serviceInterfaceName;
    }

    private IPackageFragment getPackageFragment() {
        IJavaProject project = getJavaProject();
        if (project == null) {
            return null;
        }
        try {
            IType serviceType = project.findType(_serviceInterfaceName);
            return serviceType == null ? null : serviceType.getPackageFragment();
        } catch (JavaModelException e) {
            return null;
        }
    }

}
