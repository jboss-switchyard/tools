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
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.wst.wsdl.Port;
import org.switchyard.tools.models.switchyard1_0.soap.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.soap.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPFactory;
import org.switchyard.tools.models.switchyard1_0.soap.SoapHeadersType;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.editor.core.ModelHandler;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.util.OpenFileUtil;

/**
 * @author bfitzpat
 * 
 */
@SuppressWarnings("restriction")
public class SOAPBindingComposite extends AbstractSwitchyardComposite implements IBindingComposite {

    private static final String WSDL = "wsdl";

    private Composite _panel;
    private Text _mWSDLURIText;
    private String _sWSDLURI = null;
    private SOAPBindingType _binding = null;
    private Text _mWSDLSocketText;
    private String _bindingSocket = null;
    private Combo _contextMappingCombo = null;
    private Text _contextPathText = null;
    private Button _unwrappedPayloadCheckbox = null;
    private Text _portNameText = null;
    private Button _browseBtnWorkspace;
    private Button _browseBtnFile;
    private Link _newWSDLLink;
    private ModelHandler _modelHandler = SwitchyardSCAEditor.getActiveEditor().getModelHandler();

    /**
     * Constructor.
     */
    public SOAPBindingComposite() {
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
        String message = "<a>WSDL URI</a>";
        _newWSDLLink.setText(message);
        _newWSDLLink.setEnabled(canEdit());

        _newWSDLLink.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                String oldResult = _mWSDLURIText.getText().trim();
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
                        _mWSDLURIText.setText(result);
                        setHasChanged(true);
                        handleModify(_mWSDLURIText);
                        fireChangedEvent(_mWSDLURIText);
                    }
                }
            }
        });
        _mWSDLURIText = createLabelAndText(_panel, null);
        _mWSDLURIText.setEnabled(canEdit());

        GridData uriGD = new GridData(GridData.FILL_HORIZONTAL);
        // uriGD.horizontalSpan = 2;
        _mWSDLURIText.setLayoutData(uriGD);

        _browseBtnWorkspace = new Button(_panel, SWT.PUSH);
        _browseBtnWorkspace.setText("Workspace...");
        _browseBtnWorkspace.setEnabled(canEdit());
        GridData btnGD = new GridData();
        _browseBtnWorkspace.setLayoutData(btnGD);
        _browseBtnWorkspace.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                String result = selectResourceFromWorkspace(_panel.getShell(), WSDL);
                if (result != null) {
                    _mWSDLURIText.setText(result);
                    setHasChanged(true);
                    handleModify(_mWSDLURIText);
                    fireChangedEvent(_mWSDLURIText);
                }
            }
        });

        _portNameText = createLabelAndText(_panel, "WSDL Port");
        _portNameText.setEnabled(canEdit());
        GridData pnGD = new GridData(GridData.FILL_HORIZONTAL);
        pnGD.horizontalSpan = 2;
        _portNameText.setLayoutData(pnGD);

        _contextPathText = createLabelAndText(_panel, "Context Path");
        _contextPathText.setEnabled(canEdit());
        GridData cpGD = new GridData(GridData.FILL_HORIZONTAL);
        cpGD.horizontalSpan = 2;
        _contextPathText.setLayoutData(cpGD);
        
        _mWSDLSocketText = createLabelAndText(_panel, "Server Port");
        _mWSDLSocketText.setEnabled(canEdit());

        GridData portGD = new GridData(GridData.FILL_HORIZONTAL);
        portGD.horizontalSpan = 2;
        _mWSDLSocketText.setLayoutData(portGD);

        _unwrappedPayloadCheckbox = createCheckbox(_panel, "Unwrapped Payload");
        GridData upChxGD = new GridData(GridData.FILL_HORIZONTAL);
        upChxGD.horizontalSpan = 3;
        _unwrappedPayloadCheckbox.setLayoutData(upChxGD);
       
        _contextMappingCombo = createLabelAndCombo(_panel, "Context Mapping", true);
        GridData cmcGD = new GridData(GridData.FILL_HORIZONTAL);
        cmcGD.horizontalSpan = 2;
        _contextMappingCombo.setLayoutData(cmcGD);
        
        for (int i = 0; i < SoapHeadersType.values().length; i++) {
            _contextMappingCombo.add(SoapHeadersType.get(i).getLiteral(), i);
        }
        _contextMappingCombo.select(SoapHeadersType.VALUE_VALUE);
    }

    protected void handleModify(Control control) {
        TransactionalEditingDomain domain = null;
        if (_binding != null) {
            if (_binding.eContainer() != null) {
                domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
            }
            if (control.equals(_mWSDLURIText)) {
                _sWSDLURI = _mWSDLURIText.getText().trim();
                final String wsdlPort = _portNameText.getText().trim();
                if (domain != null) {
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            _binding.setWsdl(_sWSDLURI);
                            if (_binding.getContextMapper() == null) {
                                ContextMapperType contextMapper = SOAPFactory.eINSTANCE.createContextMapperType();
                                _binding.setContextMapper(contextMapper);
                            }
                            if (wsdlPort != null && wsdlPort.trim().length() > 0) {
                                _binding.setWsdlPort(wsdlPort);
                            }
                        }
                    });
                } else {
                    _binding.setWsdl(_sWSDLURI);
                    if (_binding.getContextMapper() == null) {
                        ContextMapperType contextMapper = SOAPFactory.eINSTANCE.createContextMapperType();
                        _binding.setContextMapper(contextMapper);
                    }
                    if (wsdlPort != null && wsdlPort.trim().length() > 0) {
                        _binding.setWsdlPort(wsdlPort);
                    }
                }
            } else if (control.equals(_mWSDLSocketText)) {
                _bindingSocket = _mWSDLSocketText.getText().trim();
                if (domain != null) {
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            if (_bindingSocket != null && _bindingSocket.trim().length() > 0) {
                                _binding.setSocketAddr(_bindingSocket);
                            }
                        }
                    });
                } else {
                    if (_bindingSocket != null && _bindingSocket.trim().length() > 0) {
                        _binding.setSocketAddr(_bindingSocket);
                    }
                }
            } else if (control.equals(_contextMappingCombo)) {
                final SoapHeadersType mapperValue = SoapHeadersType.getByName(_contextMappingCombo.getText());
                if (domain != null) {
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            if (_binding.getContextMapper() == null) {
                                ContextMapperType contextMapper = SOAPFactory.eINSTANCE.createContextMapperType();
                                _binding.setContextMapper(contextMapper);
                            }
                            _binding.getContextMapper().setSoapHeadersType(mapperValue);
                        }
                    });
                } else {
                    if (_binding.getContextMapper() == null) {
                        ContextMapperType contextMapper = SOAPFactory.eINSTANCE.createContextMapperType();
                        _binding.setContextMapper(contextMapper);
                    }
                    _binding.getContextMapper().setSoapHeadersType(mapperValue);
                }
            } else if (control.equals(_unwrappedPayloadCheckbox)) {
                if (domain != null) {
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            if (_binding.getMessageComposer() == null) {
                                MessageComposerType messageComposer = SOAPFactory.eINSTANCE.createMessageComposerType();
                                setFeatureValue(_binding, "messageComposer", messageComposer);
                            }
                            setFeatureValue(_binding.getMessageComposer(), "unwrapped", _unwrappedPayloadCheckbox.getSelection());
//                            _binding.getMessageComposer().setUnwrapped(_unwrappedPayloadCheckbox.getSelection());
                        }
                    });
                } else {
                    if (_binding.getMessageComposer() == null) {
                        MessageComposerType messageComposer = SOAPFactory.eINSTANCE.createMessageComposerType();
                        setFeatureValue(_binding, "messageComposer", messageComposer);
                    }
                    setFeatureValue(_binding.getMessageComposer(), "unwrapped", _unwrappedPayloadCheckbox.getSelection());
//                    _binding.getMessageComposer().setUnwrapped(_unwrappedPayloadCheckbox.getSelection());
                }
            } else if (control.equals(_contextPathText)) {
                final String contextPath = _contextPathText.getText().trim();
                if (domain != null) {
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            if (contextPath != null && contextPath.trim().length() > 0) {
                                _binding.setContextPath(contextPath);
                            }
                        }
                    });
                } else {
                    if (contextPath != null && contextPath.trim().length() > 0) {
                        _binding.setContextPath(contextPath);
                    }
                }
            } else if (control.equals(_portNameText)) {
                final String wsdlPort = _portNameText.getText();
                if (domain != null) {
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            if (wsdlPort != null) {
                                _binding.setWsdlPort(wsdlPort);
                            }
                        }
                    });
                } else {
                    if (wsdlPort != null) {
                        _binding.setWsdlPort(wsdlPort);
                    }
                }
            }
        }
        validate();
        setHasChanged(false);
    }

    protected boolean validate() {
        setErrorMessage(null);
        String uriString = _mWSDLURIText.getText();

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
                    if (left.length() > 0
                            && !left.matches("^([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]{0,61}[a-zA-Z0-9])(\\.([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]{0,61}[a-zA-Z0-9]))*$")) {
                        setErrorMessage("Socket string should match one of these patterns: localhost:8080, 0.0.0.0:8080, or :8080");
                    }
                    String right = portString.substring(pos + 1, portString.length()).trim();
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
        return (getErrorMessage() == null);
    }

    /**
     * @return wsdl URI string
     */
    public String getWSDLURI() {
        return this._sWSDLURI;
    }

    /**
     * @return SOAP Binding
     */
    public Binding getBinding() {
        return _binding;
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
            setInUpdate(true);
            _bindingSocket = _binding.getSocketAddr();
            if (_mWSDLURIText != null && !_mWSDLURIText.isDisposed()) {
                _mWSDLURIText.setText(_binding.getWsdl());
            }
            if (_portNameText != null && !_portNameText.isDisposed()) {
                String portName = _binding.getWsdlPort();
                if (portName != null) {
                    _portNameText.setText(portName);
                }
            }
            if (_mWSDLSocketText != null && !_mWSDLSocketText.isDisposed()) {
                _bindingSocket = _binding.getSocketAddr();
                if (_bindingSocket != null) {
                    _mWSDLSocketText.setText(_bindingSocket);
                }
            }
            if (_contextPathText != null && !_contextPathText.isDisposed()) {
                if (_binding.getContextPath() != null) {
                    this._contextPathText.setText(_binding.getContextPath());
                } else {
                    this._contextPathText.setText(_modelHandler.getRootSwitchYard().getName());
                    _binding.setContextPath(_modelHandler.getRootSwitchYard().getName());
                }
            }
            if (_unwrappedPayloadCheckbox != null && !_unwrappedPayloadCheckbox.isDisposed()) {
                if (_binding.getMessageComposer() != null && _binding.getMessageComposer() instanceof MessageComposerType) {
                    MessageComposerType mct = (MessageComposerType) _binding.getMessageComposer();
                    _unwrappedPayloadCheckbox.setSelection(mct.isUnwrapped());
                }
            }
            if (_binding.getContextMapper() != null) {
                int index = _binding.getContextMapper().getSoapHeadersType().getValue();
                if (_contextMappingCombo != null && !_contextMappingCombo.isDisposed()) {
                    _contextMappingCombo.select(index);
                }
            }
            setInUpdate(false);
        }
    }

    /**
     * @return string port
     */
    public String getsBindingPort() {
        return _bindingSocket;
    }

    /**
     * @param shell Shell for dialog
     * @param project java project to use for resolving classpaths
     * @return PortType result
     */
    public Port browse(Shell shell, IJavaProject project) {
        WSDLPortSelectionDialog dialog = new WSDLPortSelectionDialog(shell, project == null ? ResourcesPlugin
                .getWorkspace().getRoot() : project.getProject());
        dialog.setInitialPattern("*.wsdl");
        if (dialog.open() == WSDLPortTypeSelectionDialog.OK) {
            Port result = dialog.getSelectedPort();
            if (result != null) {
                return result;
            }
        }
        return null;
    }

    private String selectResourceFromWorkspace(Shell shell, final String extension) {

        IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
        IJavaProject javaProject = null;
        if (modelFile != null) {
            if (modelFile.getProject() != null) { //$NON-NLS-1$
                javaProject = JavaCore.create(modelFile.getProject());
            }
        }
        Port port = browse(shell, javaProject);
        if (port != null) {
            this._portNameText.setText(port.getName());
            IPath filePath = new Path(port.eResource().getURI().toPlatformString(true));
            IResource resource = javaProject.getProject().getWorkspace().getRoot().getFile(filePath);
            filePath = JavaUtil.getJavaPathForResource(resource);
            return filePath.toString();
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
        if (this._mWSDLURIText != null && !this._mWSDLURIText.isDisposed()) {
            this._mWSDLURIText.setEnabled(canEdit());
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
        if (this._portNameText != null && !this._portNameText.isDisposed()) {
            this._portNameText.setEnabled(canEdit());
        }
        if (this._contextPathText != null && !this._contextPathText.isDisposed()) {
            this._contextPathText.setEnabled(canEdit());
        }
        if (this._mWSDLSocketText != null && !this._mWSDLSocketText.isDisposed()) {
            this._mWSDLSocketText.setEnabled(canEdit());
        }
        if (this._unwrappedPayloadCheckbox != null && !this._unwrappedPayloadCheckbox.isDisposed()) {
            this._unwrappedPayloadCheckbox.setEnabled(canEdit());
        }
        if (this._contextMappingCombo != null && !this._contextMappingCombo.isDisposed()) {
            this._contextMappingCombo.setEnabled(canEdit());
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (!inUpdate()) {
            setHasChanged(true);
            handleModify((Control)e.getSource());
            fireChangedEvent((Control)e.getSource());
        }
    }

    private void setFeatureValue(EObject eObject, String featureId, Object value) {
        EClass eClass = eObject.eClass();
        for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
            EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
            if (eStructuralFeature.isChangeable()) {
                if (eStructuralFeature.getName().equalsIgnoreCase(featureId)) {
                    eObject.eSet(eStructuralFeature, value);
                    break;
                }
            }
        }
    }

    @Override
    public void widgetSelected(SelectionEvent e) {
        if (!inUpdate()) {
            setHasChanged(true);
            handleModify((Control)e.getSource());
            fireChangedEvent((Control)e.getSource());
        }
    }
}
