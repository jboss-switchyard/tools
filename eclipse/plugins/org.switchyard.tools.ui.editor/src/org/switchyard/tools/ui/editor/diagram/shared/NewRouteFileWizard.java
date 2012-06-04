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

import java.io.IOException;
import java.io.InputStream;
import java.util.EnumSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
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
 * @author bfitzpat
 * 
 */
class NewRouteFileWizard extends BasicNewFileResourceWizard {

    private RouteFileCreationPage _page;
    private boolean _openFileAfterCreate = false;
    private String _createdFilePath = null;
    private ComponentService _service;

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

            try {
                InputStream inputStream = FileLocator.openStream(Activator.getDefault().getBundle(), new Path(
                        "resources/RouteXmlTemplate.xml"), false);
                file.setContents(inputStream, true, true, null);
            } catch (CoreException e1) {
                Activator.logError(e1);
            } catch (IOException e2) {
                e2.printStackTrace();
                Activator.logError(e2);
            }

            if (_openFileAfterCreate) {
                selectAndReveal(file);

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

    public ComponentService getService() {
        return _service;
    }

    public String getCreatedFilePath() {
        return _createdFilePath;
    }

    public void setCreatedFilePath(String inPath) {
        this._createdFilePath = inPath;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard#addPages()
     */
    @Override
    public void addPages() {
        _page = new RouteFileCreationPage("newFilePage1", getSelection());
        if (_page != null) {
            _page.setTitle("Route File");
            _page.setDescription("Create a new Camel Route file resource.");
            _page.setFileName("route.xml");
            if (_createdFilePath != null) {
                _page.setFileName(_createdFilePath);
            }
        }
        addPage(_page);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard#init(org
     * .eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
     */
    @Override
    public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
        super.init(workbench, currentSelection);
        setWindowTitle("New Camel XML Route File");
    }

    private class RouteFileCreationPage extends WizardNewFileCreationPage {

        private InterfaceControl _interfaceControl;

        public RouteFileCreationPage(String pageName, IStructuredSelection selection) {
            super(pageName, selection);
        }

        @Override
        protected void createAdvancedControls(Composite parent) {
            Composite contents = new Composite(parent, SWT.NONE);
            contents.setLayout(new GridLayout(3, false));
            contents.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

            _interfaceControl = new InterfaceControl(getJavaProject(), EnumSet.of(InterfaceType.Java,
                    InterfaceType.WSDL));
            _interfaceControl.createControl(contents, 3);
            _interfaceControl.addSelectionChangedListener(new ISelectionChangedListener() {
                @Override
                public void selectionChanged(SelectionChangedEvent event) {
                    setPageComplete(validatePage());
                }
            });
        }

        @Override
        protected boolean validatePage() {
            if (super.validatePage()) {
                IStatus status = _interfaceControl.getStatus();
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
            IStructuredSelection selection = (IStructuredSelection) _interfaceControl.getSelection();
            if (selection.isEmpty()) {
                _service = null;
                return;
            }
            Interface intf = (Interface) selection.getFirstElement();
            _service = ScaFactory.eINSTANCE.createComponentService();
            _service.setName(InterfaceControl.getSimpleServiceInterfaceName(intf));
            _service.getInterfaceGroup().set(intf.getDocumentFeature(), intf);
        }

        private IJavaProject getJavaProject() {
            IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder(getContainerFullPath());
            if (folder == null) {
                return null;
            }
            return JavaCore.create(folder.getProject());
        }

    }

}
