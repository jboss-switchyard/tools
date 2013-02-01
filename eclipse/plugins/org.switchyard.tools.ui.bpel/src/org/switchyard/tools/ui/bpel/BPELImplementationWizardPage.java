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
package org.switchyard.tools.ui.bpel;

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.open.oasis.docs.ns.opencsa.sca.bpel.BPELFactory;
import org.open.oasis.docs.ns.opencsa.sca.bpel.BPELImplementation;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.common.ClasspathResourceSelectionDialog;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * BPELImplementationWizardPage
 * 
 * <p/>
 * Collects information for a BPEL component implementation.
 * 
 * @author Rob Cernich
 */
public class BPELImplementationWizardPage extends WizardPage {

    private Component _component;
    private ComponentService _serviceInterface;
    private Link _newBPELLink;
    private Text _bpelFileText;
    private Button _browseBPELButton;
    private IJavaProject _project;
    private BPELImplementation _implementation;
    private ComponentService _service;

    /**
     * Create a new BPELImplementationWizardPage.
     * 
     * @param pageName the page name.
     */
    public BPELImplementationWizardPage(String pageName) {
        super(pageName);
        setTitle("BPEL Implementation Details");
        setDescription("Select a BPEL file.");
        setPageComplete(false);
        ResourceSet resourceSet = (ResourceSet) SwitchyardSCAEditor.getActiveEditor().getEditorInput()
                .getAdapter(ResourceSet.class);
        if (resourceSet != null && resourceSet.getResources().size() > 0) {
            for (Resource emfResource : resourceSet.getResources()) {
                String path = resourceSet.getURIConverter().normalize(emfResource.getURI()).toPlatformString(true);
                if (path != null) {
                    IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(path);
                    if (resource != null) {
                        IProject project = resource.getProject();
                        if (project != null) {
                            _project = JavaCore.create(project);
                            break;
                        }
                    }
                }
            }
        }
    }

    /**
     * @return the BPEL implementation configuration.
     */
    public BPELImplementation getImplementation() {
        return _implementation;
    }

    /**
     * @return the component service.
     */
    public ComponentService getService() {
        return _service;
    }

    /**
     * Initialize controls based on the target component (e.g. service interface
     * details).
     * 
     * @param component the containing component.
     */
    public void init(Component component) {
        _component = component;
        if (component == null || component.getService() == null) {
            return;
        }
        for (ComponentService service : component.getService()) {
            _serviceInterface = service;
            return;
        }
    }

    @Override
    public void createControl(Composite parent) {
        Composite contents = new Composite(parent, SWT.NONE);
        contents.setLayout(new GridLayout(3, false));

        _newBPELLink = new Link(contents, SWT.NONE);
        _newBPELLink.setText("<a>BPEL File:</a>");
        _newBPELLink.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                openNewWizard();
            }

        });

        _bpelFileText = new Text(contents, SWT.READ_ONLY | SWT.BORDER);
        _bpelFileText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _bpelFileText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                validate();
            }

        });

        _browseBPELButton = new Button(contents, SWT.PUSH);
        _browseBPELButton.setText("Browse...");
        _browseBPELButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                handleBrowse();
            }

        });

        setControl(contents);
    }

    private void validate() {
        setErrorMessage(null);
        if (_implementation == null) {
            setErrorMessage("Please select a BPEL file.");
        }
        setPageComplete(getErrorMessage() == null);
    }

    private void handleBrowse() {
        IContainer container;
        if (_project == null) {
            container = ResourcesPlugin.getWorkspace().getRoot();
        } else {
            container = _project.getProject();
        }
        ClasspathResourceSelectionDialog dialog = new ClasspathResourceSelectionDialog(getShell(), container, "bpel");
        if (dialog.open() == SelectionDialog.OK) {
            Object[] result = dialog.getResult();
            if (result.length > 0 && result[0] instanceof IFile) {
                IFile bpelFile = (IFile) result[0];
                String bpelFilePath = JavaUtil.getJavaPathForResource(bpelFile).toString();
                _implementation = BPELFactory.eINSTANCE.createBPELImplementation();

                // load process
                final QName processName = Activator.getDefault().getProcessForFile(bpelFile);
                // get process qname
                _implementation.setProcess(processName);

                // TODO: navigate myRole partner link back to a portType
                _service = null;

                // update the text box, which should trigger a validate
                _bpelFileText.setText(bpelFilePath);
            }
        }
    }

    private void openNewWizard() {
        BPELComponentWizard wizard = new BPELComponentWizard(false);
        SwitchyardSCAEditor editor = SwitchyardSCAEditor.getActiveEditor();
        IResource resource = JavaUtil.getFirstResourceRoot(_project);
        IStructuredSelection selection = resource == null ? StructuredSelection.EMPTY : new StructuredSelection(
                resource);
        IWorkbench workbench = editor == null ? PlatformUI.getWorkbench() : editor.getEditorSite().getWorkbenchWindow()
                .getWorkbench();
        wizard.init(workbench, selection);
        wizard.init(_component == null ? null : (org.eclipse.soa.sca.sca1_1.model.sca.Composite) _component
                .eContainer());
        wizard.forceServiceInterfaceType(_serviceInterface);
        WizardDialog dialog = new WizardDialog(getShell(), wizard);
        if (dialog.open() == WizardDialog.OK) {
            _implementation = (BPELImplementation) wizard.getCreatedObject().getImplementation();
            _service = wizard.getService();
            _bpelFileText.setText(_implementation.getProcess().getLocalPart() + " "
                    + _implementation.getProcess().getNamespaceURI());
        }
    }

}
