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
package org.switchyard.tools.ui.editor.components.soap;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.wst.wsdl.Port;
import org.switchyard.tools.models.switchyard1_0.soap.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.soap.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.soap.MtomType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPFactory;
import org.switchyard.tools.models.switchyard1_0.soap.SoapHeadersType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.diagram.shared.WSDLPortSelectionDialog;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.util.OpenFileUtil;
import org.switchyard.tools.ui.editor.util.PropTypeUtil;
import org.switchyard.tools.ui.wizards.NewWSDLFileWizard;

/**
 * @author bfitzpat
 * 
 */
public class SOAPBindingReferenceComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private Text _nameText;
    private Text _mWSDLURIText;
    private String _sWSDLURI = null;
    private SOAPBindingType _binding = null;
    private Text _mWSDLSocketText;
    private String _bindingSocket = null;
    private Combo _soapHeadersTypeCombo = null;
    private Text _contextPathText = null;
    private Button _unwrappedPayloadCheckbox = null;
    private Text _portNameText = null;
    private Button _browseBtnWorkspace;
    private Button _browseBtnFile;
    private Link _newWSDLLink;
    private Text _endpointAddressText;
    private String _endpointAddress = null;
    private Button _enableMtomCheckbox = null;
    private Button _enableXopExpandCheckbox = null;
    private Button _disableMtomCheckbox =  null;
    private final SOAPMessageComposerComposite _messageComposerComposite;
    private Text _requestTimeoutText = null;
    private Text _mtomThresholdText = null;

    /**
     * Create a new SOAPBindingReferenceComposite.
     * 
     * @param messageComposerComposite the associated composite for editing
     *            message composer/context mapper settings.
     */
    public SOAPBindingReferenceComposite(SOAPMessageComposerComposite messageComposerComposite) {
        _messageComposerComposite = messageComposerComposite;
    }

    @Override
    public String getTitle() {
        return "SOAP Binding Details";
    }

    @Override
    public String getDescription() {
        return "Specify pertinent details for your SOAP Binding.";
    }

    /**
     * @param parent composite parent
     * @param style any style bits
     */
    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getSOAPTabControl(_panel);
    }

    private Control getSOAPTabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(3, false);
        composite.setLayout(gl);

        _nameText = createLabelAndText(composite, "Name");
        _nameText.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));

        _newWSDLLink = new Link(composite, SWT.NONE);
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
        _mWSDLURIText = createLabelAndText(composite, null);
        _mWSDLURIText.setEnabled(canEdit());

        GridData uriGD = new GridData(GridData.FILL_HORIZONTAL);
        // uriGD.horizontalSpan = 2;
        _mWSDLURIText.setLayoutData(uriGD);

        _browseBtnWorkspace = new Button(composite, SWT.PUSH);
        _browseBtnWorkspace.setText("Browse...");
        _browseBtnWorkspace.setEnabled(canEdit());
        GridData btnGD = new GridData();
        _browseBtnWorkspace.setLayoutData(btnGD);
        _browseBtnWorkspace.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                String result = selectResourceFromWorkspace(_panel.getShell(), "*.wsdl");
                if (result != null) {
                    _mWSDLURIText.setText(result);
                    setHasChanged(true);
                    handleModify(_mWSDLURIText);
                    fireChangedEvent(_mWSDLURIText);
                }
            }
        });

        _portNameText = createLabelAndText(composite, "WSDL Port");
        _portNameText.setEnabled(canEdit());
        GridData pnGD = new GridData(GridData.FILL_HORIZONTAL);
        pnGD.horizontalSpan = 2;
        _portNameText.setLayoutData(pnGD);

        if (getTargetObject() != null && getTargetObject() instanceof Service) {
            _contextPathText = createLabelAndText(composite, "Context Path");
            _contextPathText.setEnabled(canEdit());
            GridData cpGD = new GridData(GridData.FILL_HORIZONTAL);
            cpGD.horizontalSpan = 2;
            _contextPathText.setLayoutData(cpGD);

            _mWSDLSocketText = createLabelAndText(composite, "Server Port");
            _mWSDLSocketText.setEnabled(canEdit());

            GridData portGD = new GridData(GridData.FILL_HORIZONTAL);
            portGD.horizontalSpan = 2;
            _mWSDLSocketText.setLayoutData(portGD);
        }

        _unwrappedPayloadCheckbox = createCheckbox(composite, "Unwrapped Payload");
        GridData upChxGD = new GridData(GridData.FILL_HORIZONTAL);
        upChxGD.horizontalSpan = 3;
        _unwrappedPayloadCheckbox.setLayoutData(upChxGD);

        _soapHeadersTypeCombo = createLabelAndCombo(composite, "SOAP Headers Type", true);
        GridData cmcGD = new GridData(GridData.FILL_HORIZONTAL);
        cmcGD.horizontalSpan = 2;
        _soapHeadersTypeCombo.setLayoutData(cmcGD);

        for (int i = 0; i < SoapHeadersType.values().length; i++) {
            _soapHeadersTypeCombo.add(SoapHeadersType.get(i).getLiteral(), i);
        }
        _soapHeadersTypeCombo.select(SoapHeadersType.VALUE_VALUE);

        _endpointAddressText = createLabelAndText(composite, "Endpoint Address");
        _endpointAddressText.setEnabled(canEdit());
        GridData epAddrGD = new GridData(GridData.FILL_HORIZONTAL);
        epAddrGD.horizontalSpan = 2;
        _endpointAddressText.setLayoutData(epAddrGD);
        
        _requestTimeoutText = createLabelAndText(composite, "Request Timeout");
        _requestTimeoutText.setEnabled(canEdit());
        GridData rtAddrGD = new GridData(GridData.FILL_HORIZONTAL);
        rtAddrGD.horizontalSpan = 2;
        _requestTimeoutText.setLayoutData(rtAddrGD);
        
        Group mtomGroup = new Group(composite, SWT.NONE);
        mtomGroup.setText("MTom");
        mtomGroup.setLayout(new GridLayout(4, false));
        GridData epConfigGroupGD = new GridData(GridData.FILL_HORIZONTAL);
        epConfigGroupGD.horizontalSpan = 3;
        epConfigGroupGD.horizontalIndent = -5;
        mtomGroup.setLayoutData(epConfigGroupGD);

        _enableMtomCheckbox = createCheckbox(mtomGroup, "Enable");
        GridData enableMtomChxGD = new GridData();
        enableMtomChxGD.horizontalSpan = 4;
        _enableMtomCheckbox.setLayoutData(enableMtomChxGD);

        _disableMtomCheckbox = createCheckbox(mtomGroup, "Temporarily Disable");
        GridData disableMtomChxGD = new GridData();
        disableMtomChxGD.horizontalIndent = 10;
        _disableMtomCheckbox.setLayoutData(disableMtomChxGD);

        _enableXopExpandCheckbox = createCheckbox(mtomGroup, "xopExpand");
        GridData enableXopExpandChxGD = new GridData();
        _enableXopExpandCheckbox.setLayoutData(enableXopExpandChxGD);
        
        _mtomThresholdText = createLabelAndText(mtomGroup, "Threshold");
        GridData mtomThresholdGD = new GridData(GridData.FILL_HORIZONTAL);
        _mtomThresholdText.setLayoutData(mtomThresholdGD);

        return composite;
    }

    protected MessageComposerType createMessageComposer() {
        MessageComposerType messageComposer = SOAPFactory.eINSTANCE.createMessageComposerType();
        return messageComposer;
    }

    protected ContextMapperType createContextMapper() {
        ContextMapperType contextMapper = SOAPFactory.eINSTANCE.createContextMapperType();
        return contextMapper;
    }

    protected void handleModify(Control control) {
        if (_binding != null) {
            if (control.equals(_mWSDLURIText)) {
                _sWSDLURI = _mWSDLURIText.getText().trim();
                String wsdlPort = _portNameText.getText().trim();
                updateFeature(_binding, new String[] {"wsdl", "wsdlPort" }, new Object[] {_sWSDLURI, wsdlPort });
            } else if (control.equals(_mWSDLSocketText)) {
                _bindingSocket = _mWSDLSocketText.getText().trim();
                // for SWITCHYARD-1614 - check to make sure we have a colon and add one if missing
                boolean isJustPort = false;
                try {
                    Integer.valueOf(_bindingSocket);
                    isJustPort = true;
                } catch (NumberFormatException nfe) {
                    isJustPort = false;
                }
                if (isJustPort && !_bindingSocket.startsWith(":")) {
                    _bindingSocket = ":" + _bindingSocket;
                    _mWSDLSocketText.setText(_bindingSocket);
                }
                updateFeature(_binding, "socketAddr", _bindingSocket);
            } else if (control.equals(_soapHeadersTypeCombo)) {
                final SoapHeadersType mapperValue = SoapHeadersType.getByName(_soapHeadersTypeCombo.getText());
                _messageComposerComposite.updateContextMapperFeature("soapHeadersType", mapperValue);
            } else if (control.equals(_unwrappedPayloadCheckbox)) {
                _unwrappedPayloadCheckbox.setData("unwrapped");
                _messageComposerComposite.updateMessageComposerFeature(_unwrappedPayloadCheckbox);
            } else if (control.equals(_contextPathText)) {
                final String contextPath = _contextPathText.getText().trim();
                updateFeature(_binding, "contextPath", contextPath);
            } else if (control.equals(_portNameText)) {
                final String wsdlPort = _portNameText.getText();
                updateFeature(_binding, "wsdlPort", wsdlPort);
            } else if (control.equals(_endpointAddressText)) {
                final String endpointAddress = _endpointAddressText.getText();
                updateFeature(_binding, "endpointAddress", endpointAddress);
            } else if (control.equals(_enableMtomCheckbox)) {
                _disableMtomCheckbox.setEnabled(_enableMtomCheckbox.getSelection());
                _enableXopExpandCheckbox.setEnabled(_enableMtomCheckbox.getSelection());
                _mtomThresholdText.setEnabled(_enableMtomCheckbox.getSelection());
                if (!_enableMtomCheckbox.getSelection()) {
                    _disableMtomCheckbox.setSelection(false);
                    _enableXopExpandCheckbox.setSelection(false);
                    removeMTomFeature();
                } else {
                    updateMTomFeature(null, null);
                }
            } else if (control.equals(_disableMtomCheckbox)) {
                updateMTomFeature("enabled", !_disableMtomCheckbox.getSelection());
            } else if (control.equals(_enableXopExpandCheckbox)) {
                updateMTomFeature("xopExpand", _enableXopExpandCheckbox.getSelection());
            } else if (control.equals(_nameText)) {
                super.updateFeature(_binding, "name", _nameText.getText().trim());
            } else if (control.equals(_requestTimeoutText)) {
                final String requestTimeout = _requestTimeoutText.getText();
                updateFeature(_binding, "timeout", requestTimeout);
            } else if (control.equals(_mtomThresholdText)) {
                final String threshold = _mtomThresholdText.getText();
                updateMTomFeature("threshold", threshold);
            } else {
                super.handleModify(control);
            }
        }
        validate();
        setHasChanged(false);
        setDidSomething(true);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (control.equals(_contextPathText)) {
                _contextPathText.setText(_binding.getContextPath());
            } else if (control.equals(_mWSDLSocketText)) {
                _bindingSocket = _binding.getSocketAddr();
                if (_bindingSocket != null) {
                    _mWSDLSocketText.setText(_bindingSocket);
                }
            } else if (control.equals(_mWSDLURIText)) {
                _mWSDLURIText.setText(_binding.getWsdl());
            } else if (control.equals(_portNameText)) {
                String portName = _binding.getWsdlPort();
                if (portName != null) {
                    _portNameText.setText(portName);
                }
            } else if (control.equals(_unwrappedPayloadCheckbox)) {
                if (_binding.getMessageComposer() instanceof MessageComposerType) {
                    MessageComposerType mct = (MessageComposerType) _binding.getMessageComposer();
                    _unwrappedPayloadCheckbox.setSelection(mct.isUnwrapped());
                }
            } else if (control.equals(_soapHeadersTypeCombo)) {
                if (_binding.getContextMapper() instanceof ContextMapperType) {
                    int index = ((ContextMapperType) _binding.getContextMapper()).getSoapHeadersType().getValue();
                    if (_soapHeadersTypeCombo != null && !_soapHeadersTypeCombo.isDisposed()) {
                        _soapHeadersTypeCombo.select(index);
                    }
                }
            } else if (control.equals(_endpointAddressText)) {
                _endpointAddressText.setText(_binding.getEndpointAddress());
            } else if (control.equals(_enableMtomCheckbox)) {
                _enableMtomCheckbox.setSelection(_binding.getMtom() != null);
                if (_binding.getMtom() != null) {
                    _enableXopExpandCheckbox.setEnabled(true);
                    _disableMtomCheckbox.setEnabled(true);
                    _mtomThresholdText.setEnabled(true);
                    if (_binding.getMtom().getEnabled() != null) {
                        _disableMtomCheckbox.setSelection(!(Boolean)_binding.getMtom().getEnabled());
                        if (_binding.getMtom().getXopExpand() != null) {
                            _enableXopExpandCheckbox.setSelection((Boolean)_binding.getMtom().getXopExpand());
                        }
                    }
                } else {
                    _mtomThresholdText.setEnabled(false);
                    _enableXopExpandCheckbox.setEnabled(false);
                    _disableMtomCheckbox.setEnabled(false);
                }
            } else if (control.equals(_mtomThresholdText)) {
                if (_binding.getMtom() != null && _binding.getMtom().getThreshold() != null) {
                    _mtomThresholdText.setText(PropTypeUtil.getPropValueString(_binding.getMtom().getThreshold()));
                } else {
                    _mtomThresholdText.setText("");
                }
            } else if (control.equals(_disableMtomCheckbox)) {
                if (_binding.getMtom() != null) {
                    _disableMtomCheckbox.setSelection(!(Boolean)_binding.getMtom().getEnabled());
                }
            } else if (control.equals(_enableXopExpandCheckbox)) {
                if (_binding.getMtom() != null) {
                    _enableXopExpandCheckbox.setSelection(!(Boolean)_binding.getMtom().getXopExpand());
                }
            } else if (control.equals(_nameText)) {
                _nameText.setText(_binding.getName() == null ? "" : _binding.getName());
            } else if (control.equals(_requestTimeoutText)) {
                _requestTimeoutText.setText(_binding.getTimeout() == null ? "" : PropTypeUtil.getPropValueString(_binding.getTimeout()));
            } else {
                super.handleUndo(control);
            }
        }
        setHasChanged(false);
    }

    protected boolean validate() {
        setErrorMessage(null);
        String uriString = _mWSDLURIText.getText();

        if (uriString == null || uriString.trim().length() == 0) {
            setErrorMessage("No uri specified");
        } else if (uriString.trim().length() < uriString.length()) {
            setErrorMessage("No spaces allowed in uri");
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
     * @return panel
     */
    public Composite getPanel() {
        return _panel;
    }

    /**
     * @param switchYardBindingType binding
     */
    public void setBinding(Binding switchYardBindingType) {
        super.setBinding(switchYardBindingType);
        if (switchYardBindingType instanceof SOAPBindingType) {
            setTargetObject(switchYardBindingType.eContainer());
            this._binding = (SOAPBindingType) switchYardBindingType;
            _sWSDLURI = _binding.getWsdl();
            setInUpdate(true);
            _bindingSocket = _binding.getSocketAddr();
            if (_mWSDLURIText != null && !_mWSDLURIText.isDisposed()) {
                String wsdlURI = _binding.getWsdl();
                if (wsdlURI != null) {
                    _mWSDLURIText.setText(wsdlURI);
                } else {
                    _mWSDLURIText.setText("");
                }
            }
            if (_portNameText != null && !_portNameText.isDisposed()) {
                String portName = _binding.getWsdlPort();
                if (portName != null) {
                    _portNameText.setText(portName);
                } else {
                    _portNameText.setText("");
                }
            }
            if (_mWSDLSocketText != null && !_mWSDLSocketText.isDisposed()) {
                _bindingSocket = _binding.getSocketAddr();
                if (_bindingSocket != null) {
                    _mWSDLSocketText.setText(_bindingSocket);
                } else {
                    _mWSDLSocketText.setText("");
                }
            }
            if (_contextPathText != null && !_contextPathText.isDisposed()) {
                if (_binding.getContextPath() != null) {
                    this._contextPathText.setText(_binding.getContextPath());
                } else {
                    if (getTargetObject() != null && getTargetObject() instanceof Contract) {
                        Contract contract = (Contract) getTargetObject();
                        if (contract.eContainer() != null
                                && contract.eContainer() instanceof org.eclipse.soa.sca.sca1_1.model.sca.Composite) {
                            org.eclipse.soa.sca.sca1_1.model.sca.Composite composite = (org.eclipse.soa.sca.sca1_1.model.sca.Composite) contract
                                    .eContainer();
                            if (composite.eContainer() != null && composite.eContainer() instanceof SwitchYardType) {
                                SwitchYardType rootSwitchYard = (SwitchYardType) composite.eContainer();
                                // fixes SWITCHYARD-1191
                                if (rootSwitchYard != null && rootSwitchYard.getName() != null) {
                                    this._contextPathText.setText(rootSwitchYard.getName());
                                } else {
                                    this._contextPathText.setText(composite.getName());
                                }
                                handleModify(_contextPathText);
                            }
                        }
                    }
                }
            }
            if (_unwrappedPayloadCheckbox != null && !_unwrappedPayloadCheckbox.isDisposed()) {
                if (_binding.getMessageComposer() != null
                        && _binding.getMessageComposer() instanceof MessageComposerType) {
                    MessageComposerType mct = (MessageComposerType) _binding.getMessageComposer();
                    _unwrappedPayloadCheckbox.setSelection(mct.isUnwrapped());
                } else {
                    _unwrappedPayloadCheckbox.setSelection(false);
                }
            }
            if (_binding.getContextMapper() != null) {
                ContextMapperType mapper = (ContextMapperType) _binding.getContextMapper();
                int index = mapper.getSoapHeadersType().getValue();
                if (_soapHeadersTypeCombo != null && !_soapHeadersTypeCombo.isDisposed()) {
                    _soapHeadersTypeCombo.select(index);
                }
            } else {
                _soapHeadersTypeCombo.select(SoapHeadersType.VALUE_VALUE);
            }
            if (_endpointAddressText != null && !_endpointAddressText.isDisposed()) {
                _endpointAddress  = _binding.getEndpointAddress();
                if (_endpointAddress != null) {
                    _endpointAddressText.setText(_endpointAddress);
                } else {
                    _endpointAddressText.setText("");
                }
            }
            if (_enableMtomCheckbox != null && !_enableMtomCheckbox.isDisposed()) {
                _enableMtomCheckbox.setSelection(_binding.getMtom() != null);
                if (_binding.getMtom() != null) {
                    _enableXopExpandCheckbox.setEnabled(true);
                    _disableMtomCheckbox.setEnabled(true);
                    _mtomThresholdText.setEnabled(true);
                    if (_binding.getMtom().getEnabled() != null) {
                        _disableMtomCheckbox.setSelection(!PropTypeUtil.getBooleanPropValue(_binding.getMtom().getEnabled()));
                    }
                    if (_binding.getMtom().getXopExpand() != null) {
                        _enableXopExpandCheckbox.setSelection(PropTypeUtil.getBooleanPropValue(_binding.getMtom().getXopExpand()));
                    }
                    if (_binding.getMtom().getThreshold() != null) {
                        _mtomThresholdText.setText(PropTypeUtil.getPropValueString(_binding.getMtom().getThreshold()));
                    } else {
                        _mtomThresholdText.setText("");
                    }
                } else {
                    _enableXopExpandCheckbox.setEnabled(false);
                    _disableMtomCheckbox.setEnabled(false);
                    _mtomThresholdText.setEnabled(false);
                }
            }
            if (_binding.getName() == null) {
                _nameText.setText("");
            } else {
                _nameText.setText(_binding.getName());
            }
            if (_binding.getTimeout() == null) {
                _requestTimeoutText.setText("");
            } else {
                _requestTimeoutText.setText(PropTypeUtil.getPropValueString(_binding.getTimeout()));
            }
            setInUpdate(false);
            validate();
        }
        addObservableListeners();
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
     * @param initialPattern initial file pattern to show
     * @return PortType result
     */
    public Port browse(Shell shell, IJavaProject project, String initialPattern) {
        WSDLPortSelectionDialog dialog = new WSDLPortSelectionDialog(shell, project == null ? ResourcesPlugin
                .getWorkspace().getRoot() : project.getProject());
        dialog.setInitialPattern(initialPattern);
        if (dialog.open() == WSDLPortSelectionDialog.OK) {
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
        Port port = browse(shell, javaProject, extension);
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
        updateControlEditable(_mWSDLURIText);
        updateControlEditable(_newWSDLLink);
        updateControlEditable(_browseBtnFile);
        updateControlEditable(_browseBtnWorkspace);
        updateControlEditable(_portNameText);
        updateControlEditable(_contextPathText);
        updateControlEditable(_mWSDLSocketText);
        updateControlEditable(_unwrappedPayloadCheckbox);
        updateControlEditable(_soapHeadersTypeCombo);
        updateControlEditable(_endpointAddressText);
    }

    class AddMTomOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getMtom() == null) {
                MtomType mtomType = SOAPFactory.eINSTANCE.createMtomType();
                setFeatureValue(_binding, "mtom", mtomType);
            }
        }
    }

    class RemoveMTomOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getMtom() != null) {
                setFeatureValue(_binding, "mtom", null);
            }
        }
    }

    protected void updateMTomFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new AddMTomOp());
        if (featureId != null) {
            ops.add(new BasicOperation("mtom", featureId, value));
        }
        wrapOperation(ops);
    }
    
    protected void removeMTomFeature() {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new RemoveMTomOp());
        wrapOperation(ops);
    }

}
