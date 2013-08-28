/*************************************************************************************
 * Copyright (c) 2013 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.i18n.Messages;

/**
 * WSDL2JavaWizard
 * 
 * <p/>
 * Wizard supporting WSDL file creation from a SwitchYard service.
 */
public class WSDL2JavaWizard extends BasicNewResourceWizard {

    private WSDL2JavaOptionsWizardPage _optionsPage;

    /**
     * Create a new WSDL2JavaWizard.
     */
    public WSDL2JavaWizard() {
        setNeedsProgressMonitor(true);
        setWindowTitle(Messages.WSDL2JavaWizard_wizardTitle);
    }

    @Override
    public void addPages() {
        _optionsPage = new WSDL2JavaOptionsWizardPage();
        _optionsPage.init(getSelection());
        addPage(_optionsPage);
    }

    @Override
    public boolean performFinish() {
        IRunnableWithProgress op = new IRunnableWithProgress() {
            @Override
            public void run(IProgressMonitor monitor) throws InterruptedException, InvocationTargetException {
                try {
                    _optionsPage.createType(monitor);
                } catch (final CoreException e) {
                    Activator.getDefault().getLog().log(e.getStatus());
                    getContainer().getShell().getDisplay().syncExec(new Runnable() {
                        @Override
                        public void run() {
                            ErrorDialog.openError(getContainer().getShell(), null,
                                    Messages.WSDL2JavaWizard_errorMessage_errorWhileGeneratingJava, e.getStatus());
                        }
                    });
                }
            }
        };

        try {
            getContainer().run(false, false, op);
            selectAndReveal(_optionsPage.getPackageFragment().getCorrespondingResource());
        } catch (JavaModelException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.fillInStackTrace();
        }

        return true;
    }

    /**
     * @return the selected package for new Java files
     */
    public IPackageFragment getOutputPackage() {
        return _optionsPage == null ? null : _optionsPage.getPackageFragment();
    }

}
