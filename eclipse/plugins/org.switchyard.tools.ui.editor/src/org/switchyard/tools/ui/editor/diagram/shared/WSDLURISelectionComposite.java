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

import java.net.URI;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.models.switchyard1_0.soap.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPFactory;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.util.OpenFileUtil;

/**
 * @author bfitzpat
 * 
 */
@SuppressWarnings("restriction")
public class WSDLURISelectionComposite extends AbstractSwitchyardComposite implements IBindingComposite, IInterfaceComposite {

    private static final String WSDL = "wsdl";

    private Composite _panel;
    private Text _mWSDLInterfaceURIText;
    private String _sWSDLURI = null;
    private Interface _interface = null;
    private SOAPBindingType _binding = null;
    private Text _mWSDLSocketText;
    private Label _socketLabel;
    private String _bindingSocket = null;
    private boolean _inUpdate = false;

    private Button _browseBtnWorkspace;
    private Button _browseBtnFile;
    private Link _newWSDLLink;

    /**
     * Constructor.
     */
    public WSDLURISelectionComposite() {
        // empty
    }

    /**
     * @param parent composite parent
     * @param style any style bits
     */
    public void createContents(Composite parent, int style) {

        _panel = new Composite(parent, style);
        GridLayout gl = new GridLayout();
        gl.numColumns = 3;
        _panel.setLayout(gl);
        if (getRootGridData() != null) {
            _panel.setLayoutData(getRootGridData());
        }

        _newWSDLLink = new Link(_panel, SWT.NONE);
        String message = "<a>WSDL URI:</a>";
        _newWSDLLink.setText(message);
        _newWSDLLink.setEnabled(canEdit());
        // link.setSize(400, 100);
        _newWSDLLink.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                String oldResult = _mWSDLInterfaceURIText.getText().trim();
                IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
                IPath wsdlPath = modelFile.getParent().getParent().getProjectRelativePath();
                wsdlPath = wsdlPath.append(oldResult);
                IProject project = SwitchyardSCAEditor.getActiveEditor().getModelFile().getProject();
                if (project.exists(wsdlPath)) {
                    IResource wsdlFile = project.findMember(wsdlPath);
                    OpenFileUtil.openFile(wsdlFile);
                } else {
                    String result = getPathToNewWSDL(_panel.getShell(), wsdlPath, openOnCreate());
                    if (result != null) {
                        _mWSDLInterfaceURIText.setText(result);
                        handleModify();
                        fireChangedEvent(_newWSDLLink);
                    }
                }
            }
        });
        _mWSDLInterfaceURIText = new Text(_panel, SWT.BORDER);
        if (_interface != null && _interface instanceof WSDLPortType) {
            _mWSDLInterfaceURIText.setText(((WSDLPortType) _interface).getInterface());
        }
        _mWSDLInterfaceURIText.setEnabled(canEdit());
        _mWSDLInterfaceURIText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                if (!_inUpdate) {
                    handleModify();
                    fireChangedEvent(_mWSDLInterfaceURIText);
                }
            }
        });
        GridData uriGD = new GridData(GridData.FILL_HORIZONTAL);
        // uriGD.horizontalSpan = 2;
        _mWSDLInterfaceURIText.setLayoutData(uriGD);

        _browseBtnWorkspace = new Button(_panel, SWT.PUSH);
        _browseBtnWorkspace.setText("Workspace...");
        _browseBtnWorkspace.setEnabled(canEdit());
        GridData btnGD = new GridData();
        _browseBtnWorkspace.setLayoutData(btnGD);
        _browseBtnWorkspace.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                String result = selectResourceFromWorkspace(_panel.getShell(), WSDL);
                if (result != null) {
                    _mWSDLInterfaceURIText.setText(result);
                    handleModify();
                    fireChangedEvent(_browseBtnWorkspace);
                }
            }
        });

        _socketLabel = new Label(_panel, SWT.NONE);
        _socketLabel.setText("Socket:");
        _mWSDLSocketText = new Text(_panel, SWT.BORDER);
        _mWSDLSocketText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                if (!_inUpdate) {
                    _bindingSocket = _mWSDLSocketText.getText().trim();
                    handleModify();
                    fireChangedEvent(_mWSDLSocketText);
                }
            }
        });

        GridData portGD = new GridData(GridData.FILL_HORIZONTAL);
        portGD.horizontalSpan = 2;
        _mWSDLSocketText.setLayoutData(portGD);

        setVisibilityOfPortControls(this._binding != null);

        // _mWSDLInterfaceURIText.setText("MyService.wsdl");
        // _sWSDLURI = _mWSDLInterfaceURIText.getText();
    }

    private void setVisibilityOfPortControls(boolean flag) {
        _socketLabel.setVisible(flag);
        _mWSDLSocketText.setVisible(flag);
    }

    private void handleModify() {
        _sWSDLURI = _mWSDLInterfaceURIText.getText().trim();
        if (_interface != null && _interface instanceof WSDLPortType) {
            if (_interface.eContainer() != null) {
                TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        ((WSDLPortType) _interface).setInterface(_sWSDLURI);
                    }
                });

            } else {
                ((WSDLPortType) _interface).setInterface(_sWSDLURI);
            }
        } else if (_binding != null) {
            if (_binding.eContainer() != null) {
                TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        _binding.setWsdl(_sWSDLURI);
                        if (_binding.getContextMapper() == null) {
                            ContextMapperType contextMapper = SOAPFactory.eINSTANCE.createContextMapperType();
                            _binding.setContextMapper(contextMapper);
                        }
                        if (_bindingSocket != null && _bindingSocket.trim().length() > 0) {
                            _binding.setSocketAddr(_bindingSocket);
                        }
                    }
                });
            } else {
                _binding.setWsdl(_sWSDLURI);
                if (_binding.getContextMapper() == null) {
                    ContextMapperType contextMapper = SOAPFactory.eINSTANCE.createContextMapperType();
                    _binding.setContextMapper(contextMapper);
                }
                if (_bindingSocket != null && _bindingSocket.trim().length() > 0) {
                    _binding.setSocketAddr(_bindingSocket);
                }
            }
        }
        validate();
    }

    protected void validate() {
        setErrorMessage(null);
        String uriString = _mWSDLInterfaceURIText.getText();

        if (uriString == null || uriString.trim().length() == 0) {
            setErrorMessage("No uri specified");
        } else if (uriString.trim().length() < uriString.length()) {
            setErrorMessage("No spaces allowed in uri");
        } else {
            try {
                URI.create(uriString);
            } catch (IllegalArgumentException e) {
                setErrorMessage("Invalid URI");
            }
        }

        if (getBinding() != null) {
            String portString = _bindingSocket;
            if (portString != null && portString.trim().length() > 0) {
                int pos = portString.indexOf(':');
                if (pos == -1) {
                    setErrorMessage("Socket string should match one of these patterns: localhost:8080, 0.0.0.0:8080, or :8080");
                } else {
                    String left = portString.substring(0, pos).trim();
                    if (left.length() > 0 && !left.matches("^([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]{0,61}[a-zA-Z0-9])(\\.([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]{0,61}[a-zA-Z0-9]))*$")) {
                        setErrorMessage("Socket string should match one of these patterns: localhost:8080, 0.0.0.0:8080, or :8080");
                        return;
                    }
                    String right = portString.substring(pos+1, portString.length()).trim();
                    try {
                        Integer.parseInt(right);
                    } catch (NumberFormatException nfe) {
                        setErrorMessage("The port number right of the : must be a valid integer.");
                    }
                }
            } else {
                setErrorMessage("No socket specified");
            }
        }
    }

    /**
     * @return wsdl URI string
     */
    public String getWSDLURI() {
        return this._sWSDLURI;
    }

    /**
     * @return interface
     */
    public Interface getInterface() {
        return _interface;
    }

    /**
     * @return SOAP Binding
     */
    public Binding getBinding() {
        return _binding;
    }

    /**
     * @param cInterface interface
     */
    public void setInterface(Interface cInterface) {
        this._interface = cInterface;
        if (cInterface instanceof WSDLPortType && _mWSDLInterfaceURIText != null && !_mWSDLInterfaceURIText.isDisposed()) {
            WSDLPortType wPortType = (WSDLPortType) this._interface;
            _inUpdate = true;
            if (wPortType.getInterface() != null) {
                _mWSDLInterfaceURIText.setText(wPortType.getInterface());
            } else {
                _mWSDLInterfaceURIText.setText("MyService.wsdl");
            }
            _inUpdate = false;
        }
    }

    /**
     * @return panel
     */
    public Composite getPanel() {
        return _panel;
    }

    /**
     * @param switchYardBindingType binding
     */
    public void setBinding(Binding switchYardBindingType) {
        if (switchYardBindingType instanceof SOAPBindingType) {
            this._binding = (SOAPBindingType) switchYardBindingType;
            _sWSDLURI = _binding.getWsdl();
            _bindingSocket = _binding.getSocketAddr();
            if (_mWSDLInterfaceURIText != null && !_mWSDLInterfaceURIText.isDisposed()) {
                _inUpdate = true;
                _mWSDLInterfaceURIText.setText(_binding.getWsdl());
                _inUpdate = false;
            }
            if (_mWSDLSocketText != null && !_mWSDLSocketText.isDisposed()) {
                _inUpdate = true;
                _bindingSocket = _binding.getSocketAddr();
                if (_bindingSocket != null) {
                    _mWSDLSocketText.setText(_bindingSocket);
                }
                _inUpdate = false;
            }
            setVisibilityOfPortControls(this._binding != null);
        }
    }

    /**
     * @return string port
     */
    public String getsBindingPort() {
        return _bindingSocket;
    }

    private static String selectResourceFromWorkspace(Shell shell, final String extension) {

        IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
        IJavaProject javaProject = null;
        if (modelFile != null) {
            if (modelFile.getProject() != null) { //$NON-NLS-1$
                javaProject = JavaCore.create(modelFile.getProject());
            }
        }
        FindResourceDialog dialog = null;
        if (javaProject == null) {
            dialog = new FindResourceDialog(shell, ResourcesPlugin.getWorkspace().getRoot());
        } else {
            dialog = new FindResourceDialog(shell, javaProject.getProject());
        }
        dialog.setTitle("Select WSDL from Project");
        dialog.setInitialPattern("*.wsdl");
        dialog.open();
        Object[] result = dialog.getResult();
        if (result == null || result.length == 0 || !(result[0] instanceof IResource)) {
            return null;
        }
        IJavaElement element = JavaCore.create((IResource) result[0]);
        IResource resource = null;
        if (element != null && element.exists()) {
            try {
                resource = element.getCorrespondingResource();
            } catch (JavaModelException e) {
                e.fillInStackTrace();
            }
        } else {
            resource = ((IResource) result[0]);
        }
        IPackageFragmentRoot root = javaProject.getPackageFragmentRoot(modelFile);
        IResource pkgresource = root.getResource();
        if (pkgresource == null) {
            IJavaElement parent = root.getParent();
            pkgresource = parent.getResource();
        }
        if (resource instanceof IFile) {
            pkgresource = ((IFile) resource).getParent();
        }
        if (pkgresource instanceof IFolder) {
            IFolder folder = (IFolder) pkgresource;
            IFolder parent = (IFolder) folder.getParent();
            IPath outpath  = resource.getProjectRelativePath()
                    .makeRelativeTo(parent.getProjectRelativePath());
            return outpath.toPortableString();
        }

        return null;
    }

    private static String getPathToNewWSDL(final Shell shell, final IPath path, boolean _openWhenFinish) {
        NewWSDLFileWizard newWizard = new NewWSDLFileWizard();
        IStructuredSelection selectionToPass = StructuredSelection.EMPTY;
        IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
        if (modelFile != null) {
            if (modelFile.getProject() != null) { //$NON-NLS-1$
                IJavaProject javaProject = JavaCore.create(modelFile.getProject());
                IPackageFragmentRoot folder = javaProject.getPackageFragmentRoot(modelFile);
                selectionToPass = new StructuredSelection(folder);
            }
        }
        if (path != null) {
            newWizard.setStartingFileName(path.lastSegment());
        }
        newWizard.setOpenOnFinish(_openWhenFinish);
        newWizard.init(PlatformUI.getWorkbench(), selectionToPass);
        WizardDialog dialog = new WizardDialog(shell, newWizard);
        if (dialog.open() == Window.OK) {
            return newWizard.getCreatedFilePath();
        }
        return null;
    }

    /**
     * @param canEdit flag
     */
    public void setCanEdit(boolean canEdit) {
        super.setCanEdit(canEdit);
        if (this._mWSDLInterfaceURIText != null && !this._mWSDLInterfaceURIText.isDisposed()) {
            this._mWSDLInterfaceURIText.setEnabled(canEdit());
        }
        if (this._newWSDLLink != null && !this._newWSDLLink.isDisposed()) {
            this._newWSDLLink.setEnabled(canEdit());
        }
        if (this._browseBtnFile != null && !this._browseBtnFile.isDisposed()) {
            this._browseBtnFile.setEnabled(canEdit());
        }
        if (this._browseBtnWorkspace != null && !this._browseBtnWorkspace.isDisposed()) {
            this._browseBtnWorkspace.setEnabled(canEdit());
        }
    }

}
