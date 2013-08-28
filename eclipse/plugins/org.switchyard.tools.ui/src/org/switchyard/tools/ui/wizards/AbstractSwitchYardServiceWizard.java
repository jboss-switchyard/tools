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
package org.switchyard.tools.ui.wizards;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;
import org.switchyard.tools.ui.JavaUtil;

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
    private Contract _serviceContract;
    private String _serviceName;
    private String _serviceInterfaceType;
    private String _testTypeName;
    private IPackageFragment _testPackageFragment;

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
        return !getCreateTestClass() || (_newTestClassPage.isPageComplete() && _serviceContract != null);
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
        _serviceContract = getServiceContract();
        if (_initNewTestClassPage || !_serviceName.equals(_serviceContract.getName())
                || !_serviceInterfaceType.equals(getServiceInterfaceType())
                || !getJavaProject().equals(_newTestClassPage.getJavaProject())) {
            _serviceName = _serviceContract.getName();
            _serviceInterfaceType = getServiceInterfaceType();
            _initNewTestClassPage = false;

            IPackageFragment origTestPackageFragment = _newTestClassPage.getPackageFragment();
            IJavaProject javaProject = getJavaProject();
            // initialize project and source folder
            _newTestClassPage.init(javaProject == null ? StructuredSelection.EMPTY : new StructuredSelection(
                    javaProject));
            // initialize interface name
            _newTestClassPage.setServiceContract(_serviceContract, false);
            // update type name
            if (_testTypeName == null || _testTypeName.equals(_newTestClassPage.getTypeName())) {
                _testTypeName = _serviceName + "Test"; //$NON-NLS-1$
                _newTestClassPage.setTypeName(_testTypeName, true);
            }
            // update package name
            if (_testPackageFragment == null || origTestPackageFragment == null
                    || _testPackageFragment.equals(origTestPackageFragment)) {
                IPackageFragment packageFragment = getPackageFragment();
                if (packageFragment == null) {
                    _newTestClassPage.setPackageFragment(_testPackageFragment,
                            _newTestClassPage.getPackageFragmentRoot() != null);
                } else {
                    _newTestClassPage.setPackageFragment(packageFragment,
                            _newTestClassPage.getPackageFragmentRoot() != null);
                }
                _testPackageFragment = _newTestClassPage.getPackageFragment();
            }
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
     * @return the contract to be implemented.
     */
    protected abstract Contract getServiceContract();

    /**
     * @return the Java project in which the new object will be created.
     */
    protected abstract IJavaProject getJavaProject();

    /**
     * @return true if the user wishes to create a test class.
     */
    protected abstract boolean getCreateTestClass();

    /**
     * @return the java type name, or an empty string.
     */
    private String getServiceInterfaceType() {
        if (_serviceContract.getInterface() instanceof JavaInterface) {
            return ((JavaInterface) _serviceContract.getInterface()).getInterface();
        }
        return ""; //$NON-NLS-1$
    }

    private IPackageFragment getPackageFragment() {
        IJavaProject project = getJavaProject();
        if (project == null) {
            return null;
        }
        Interface intf = _serviceContract.getInterface();
        if (intf instanceof JavaInterface && ((JavaInterface) intf).getInterface() != null) {
            try {
                IType serviceType = project.findType(((JavaInterface) intf).getInterface());
                return serviceType == null ? null : serviceType.getPackageFragment();
            } catch (JavaModelException e) {
                return null;
            }
        } else {
            IJavaElement possiblePackage = JavaUtil.getInitialPackageForProject(project);
            if (possiblePackage.getElementType() == IJavaElement.PACKAGE_FRAGMENT) {
                return (IPackageFragment) possiblePackage;
            }
        }
        return null;
    }

}
