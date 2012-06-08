/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.editor.diagram.shared;

import java.io.InputStream;
import java.util.EnumSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.diagram.shared.InterfaceControl.InterfaceType;
import org.switchyard.tools.ui.editor.util.JavaUtil;

/**
 * BaseNewServiceFileWizard
 * 
 * <p/>
 * Base wizard for new service implementations. Extenders should add additional
 * pages and implement getInitialContents() appropriately.
 * 
 * @author bfitzpat
 * @author Rob Cernich
 */
public abstract class BaseNewServiceFileWizard extends BasicNewFileResourceWizard {

    private ServiceImplementationFileCreationPage _page;
    private ComponentService _service;
    private boolean _openFileAfterCreate = false;
    private String _createdFilePath = null;
    private String _fileExtension;
    private IJavaProject _project;

    /**
     * Create a new BaseNewServiceFileWizard.
     * 
     * @param openAfterCreate true if the new file should be opened in an
     *            editor.
     */
    protected BaseNewServiceFileWizard(boolean openAfterCreate, String fileExtension) {
        super();
        _openFileAfterCreate = openAfterCreate;
        _fileExtension = fileExtension;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard#performFinish
     * ()
     */
    @Override
    public boolean performFinish() {
        if (_page != null) {
            IFile file = _page.createNewFile();
            if (file == null) {
                return false;
            }

            _createdFilePath = JavaUtil.getJavaPathForResource(file).toString();

            selectAndReveal(file);

            if (_openFileAfterCreate) {
                // Open editor on new file.
                IWorkbenchWindow dw = getWorkbench().getActiveWorkbenchWindow();
                try {
                    if (dw != null) {
                        IWorkbenchPage page = dw.getActivePage();
                        if (page != null) {
                            IDE.openEditor(page, file, true);
                        }
                    }
                } catch (PartInitException e) {
                    e.printStackTrace();
                    Activator.logError(e);
                }
            }
            return true;
        }
        return false;
    }

    /**
     * @return the ComponentService for the implementation.
     */
    public ComponentService getService() {
        return _service;
    }

    /**
     * @return the file path to the new implementation.
     */
    public String getCreatedFilePath() {
        return _createdFilePath;
    }

    /**
     * @param inPath the path to the file being created.
     */
    public void setCreatedFilePath(String inPath) {
        _createdFilePath = inPath;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard#addPages()
     */
    @Override
    public void addPages() {
        _page = new ServiceImplementationFileCreationPage("newFilePage1", getSelection());
        if (_createdFilePath != null) {
            _page.setFileName(_createdFilePath);
        }
        if (_fileExtension != null) {
            _page.setFileExtension(_fileExtension);
        }
        addPage(_page);
    }

    /**
     * @return the new file page
     */
    protected WizardNewFileCreationPage getFileCreationPage() {
        return _page;
    }

    protected InputStream getInitialContents() {
        return null;
    }

    protected IJavaProject getJavaProject() {
        if (_page == null) {
            return null;
        }
        IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder(_page.getContainerFullPath());
        if (folder == null) {
            _project = null;
        } else if (_project == null || !_project.getProject().equals(folder.getProject())) {

            _project = JavaCore.create(folder.getProject());
        }
        return _project;
    }

    private class ServiceImplementationFileCreationPage extends WizardNewFileCreationPage {

        private ContractControl _contractControl;

        public ServiceImplementationFileCreationPage(String pageName, IStructuredSelection selection) {
            super(pageName, selection);
        }

        @Override
        protected InputStream getInitialContents() {
            return BaseNewServiceFileWizard.this.getInitialContents();
        }

        @Override
        protected void createAdvancedControls(Composite parent) {
            Composite contents = new Composite(parent, SWT.NONE);
            contents.setLayout(new GridLayout(3, false));
            contents.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

            _contractControl = new ContractControl(ScaPackage.eINSTANCE.getComponentService(), getJavaProject(),
                    EnumSet.of(InterfaceType.Java, InterfaceType.WSDL));
            _contractControl.createControl(contents, 3);
            _contractControl.addSelectionChangedListener(new ISelectionChangedListener() {
                @Override
                public void selectionChanged(SelectionChangedEvent event) {
                    setPageComplete(validatePage());
                }
            });
            _service = (ComponentService) _contractControl.getContract();
        }

        @Override
        protected boolean validatePage() {
            if (super.validatePage()) {
                _contractControl.setProject(getJavaProject());
                IStatus status = _contractControl.getStatus();
                if (status.getSeverity() < Status.ERROR) {
                    if (!status.isOK()) {
                        setMessage(status.getMessage(), status.getSeverity() == IStatus.WARNING ? WARNING : INFORMATION);
                    }
                    return true;
                }
                setErrorMessage(status.getMessage());
                return false;
            }
            return false;
        }

        @Override
        protected IStatus validateLinkedResource() {
            return Status.OK_STATUS;
        }

        @Override
        protected void createLinkTarget() {
        }

    }

}
