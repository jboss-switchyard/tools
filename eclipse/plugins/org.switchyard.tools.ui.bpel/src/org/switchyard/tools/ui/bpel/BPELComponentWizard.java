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

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.bpel.common.wsdl.parsers.WsdlParser;
import org.eclipse.bpel.ui.wizards.NewBpelFileFirstPage.BpelCreationMode;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.soa.sca.sca1_1.model.sca.BPELImplementation;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.wst.wsdl.Definition;
import org.eclipse.wst.wsdl.PortType;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.SwitchYardModelUtils;
import org.switchyard.tools.ui.bpel.util.ICreationDetails;
import org.switchyard.tools.ui.bpel.util.IWSDLDetails;
import org.switchyard.tools.ui.bpel.util.NewBPELFileUtils;
import org.switchyard.tools.ui.common.InterfaceControl.InterfaceType;
import org.switchyard.tools.ui.editor.diagram.shared.BaseNewServiceFileWizard;

/**
 * BPELComponentWizard
 * 
 * <p/>
 * Wizard for collecting data necessary for creating new BPEL services
 * (components).
 * 
 * @author Rob Cernich
 */
public class BPELComponentWizard extends BaseNewServiceFileWizard implements INewWizard {

    private static final String WSDL_PORTTYPE = "#wsdl.porttype(";
    private boolean _openAfterCreate;
    private BPELImplementation _implementation;
    private BPELProcessDetailsWizardPage _processPage;
    private Composite _container;

    /**
     * Create a new BPELComponentWizard.
     * 
     * @param openAfterCreate true if the new file should be opened in an
     *            editor.
     */
    public BPELComponentWizard(boolean openAfterCreate) {
        super(false, "bpel", EnumSet.of(InterfaceType.WSDL));
        _openAfterCreate = openAfterCreate;
    }

    @Override
    public void init(Composite container) {
        super.init(container);
        _container = container;
    }

    @Override
    public void addPages() {
        super.addPages();

        WizardNewFileCreationPage page = getFileCreationPage();
        page.setTitle("New SwitchYard BPEL File");
        page.setDescription("Create a new SwitchYard BPEL file.");
        if (getService() == null) {
            page.setFileName("Process.bpel");
        } else {
            page.setFileName("" + getService().getName() + "Process.bpel");
        }

        _processPage = new BPELProcessDetailsWizardPage(BPELProcessDetailsWizardPage.class.getCanonicalName());
        if (_container != null) {
            _processPage.setProcessNamespace(_container.getTargetNamespace());
        }
        addPage(_processPage);
    }

    @Override
    public boolean canFinish() {
        _processPage.update(getJavaProject(), getFileCreationPage().getFileName(), getService());
        return super.canFinish();
    }

    @Override
    public boolean performFinish() {
        _implementation = ScaFactory.eINSTANCE.createBPELImplementation();

        if (!super.performFinish()) {
            return false;
        }

        IRunnableWithProgress op = new IRunnableWithProgress() {
            public void run(IProgressMonitor monitor) throws InvocationTargetException {
                try {
                    new NewBPELFileUtils(new CreationDetails(), null, new WSDLDetails(), getCreatedFile())
                            .createResourcesFromWsdl(monitor);
                } catch (Exception e) {
                    throw new InvocationTargetException(e);
                }
            }
        };
        try {
            getContainer().run(false, true, op);
        } catch (InterruptedException e) {
            return false;
        } catch (InvocationTargetException e) {
            Throwable realException = e.getTargetException();
            if (realException instanceof CoreException) {
                Activator.getDefault().getLog().log(((CoreException) realException).getStatus());
            } else {
                Activator
                        .getDefault()
                        .getLog()
                        .log(new Status(Status.ERROR, Activator.PLUGIN_ID, "Error creating BPEL process.",
                                realException));
            }
            MessageDialog.openError(getShell(), "Error Creating BPEL Service", realException.getMessage());
        }

        // make sure the implementation is initialized (to get correct defaults)
        final String processName = _processPage.getProcessName();
        final String prefix = processName.length() == 0 ? processName : processName.substring(0, 1).toLowerCase()
                + processName.substring(1, processName.length());
        _implementation.setProcess(new QName(_processPage.getProcessNamespace(), processName, prefix));

        if (!_openAfterCreate) {
            return true;
        }
        final IWorkbenchPage activePage = getWorkbench().getActiveWorkbenchWindow().getActivePage();
        if (activePage != null) {
            getShell().getDisplay().asyncExec(new Runnable() {
                @Override
                public void run() {
                    try {
                        IDE.openEditor(activePage, getCreatedFile(), true);
                    } catch (PartInitException e) {
                        Activator.getDefault().getLog()
                                .log(new Status(Status.ERROR, Activator.PLUGIN_ID, "Error opening BPEL file.", e));
                    }
                }
            });
        }

        return true;
    }

    @Override
    protected Implementation createImplementation() {
        return _implementation;
    }

    @Override
    protected List<ComponentReference> createReferences() {
        return Collections.emptyList();
    }

    @Override
    protected InputStream getInitialContents() {
        return null;
    }

    private final class CreationDetails implements ICreationDetails {

        @Override
        public String getProcessName() {
            return _processPage.getProcessName();
        }

        @Override
        public String getProcessNamespace() {
            return _processPage.getProcessNamespace();
        }

        @Override
        public boolean isAbstractProcess() {
            return false;
        }

        @Override
        public BpelCreationMode getCreationMode() {
            return BpelCreationMode.GENERATE_BPEL_FROM_WSDL;
        }

        @Override
        public String getServiceName() {
            return getService().getName();
        }

    }

    private final class WSDLDetails implements IWSDLDetails {

        private PortType _portType;

        @Override
        public String getWsdlUrl() {
            final String intf = ((WSDLPortType) getService().getInterface()).getInterface();
            return intf.substring(0, intf.indexOf('#'));
        }

        @Override
        public boolean isImportWsdl() {
            return false;
        }

        @Override
        public PortType getPortType() {
            if (_portType == null) {
                final String portTypeURL = ((WSDLPortType) getService().getInterface()).getInterface();
                final String portTypeName = portTypeURL.substring(
                        portTypeURL.indexOf(WSDL_PORTTYPE) + WSDL_PORTTYPE.length(), portTypeURL.length() - 1);
                final IFile wsdlFile = (IFile) SwitchYardModelUtils.getJavaResource(getCreatedFile().getProject(),
                        portTypeURL);
                final ResourceSet rs = WsdlParser.createBasicResourceSetForWsdl();
                final Definition definition = WsdlParser.loadWsdlDefinition(
                        URI.createPlatformResourceURI(wsdlFile.getFullPath().toString(), true), rs);
                _portType = (PortType) definition.getPortType(new QName(definition.getTargetNamespace(), portTypeName));
                for (Resource resource : rs.getResources()) {
                    try {
                        resource.unload();
                    } catch (Exception e) {
                        e.fillInStackTrace();
                    }
                }
            }
            return _portType;
        }

    }
}
