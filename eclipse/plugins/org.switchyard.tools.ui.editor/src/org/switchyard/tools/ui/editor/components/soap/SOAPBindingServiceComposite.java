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
import org.switchyard.tools.models.switchyard1_0.soap.EndpointConfigType;
import org.switchyard.tools.models.switchyard1_0.soap.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.soap.MtomType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPFactory;
import org.switchyard.tools.models.switchyard1_0.soap.SoapHeadersType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.editor.Messages;
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
public class SOAPBindingServiceComposite extends AbstractSYBindingComposite {

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
    private Button _browseBtnConfigWorkspace;
    private Link _newWSDLLink;
    private Button _enableMtomCheckbox = null;
    private Button _enableXopExpandCheckbox = null;
    private Button _disableMtomCheckbox =  null;
    private Text _configFileText;
    private Text _configNameText;
    private final SOAPMessageComposerComposite _messageComposerComposite;
    private Text _mtomThresholdText = null;

    /**
     * Create a new SOAPBindingServiceComposite.
     * 
     * @param messageComposerComposite the associated composite for editing
     *            message composer/context mapper settings.
     */
    public SOAPBindingServiceComposite(SOAPMessageComposerComposite messageComposerComposite) {
        _messageComposerComposite = messageComposerComposite;
    }

    @Override
    public String getTitle() {
        return Messages.title_soapBindingDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_soapBindingDetails;
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

        _nameText = createLabelAndText(composite, Messages.label_name);
        _nameText.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));

        _newWSDLLink = new Link(composite, SWT.NONE);
        String message = Messages.link_wsdlUri;
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
        _mWSDLURIText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        _browseBtnWorkspace = new Button(composite, SWT.PUSH);
        _browseBtnWorkspace.setText(Messages.button_browse);
        _browseBtnWorkspace.setEnabled(canEdit());
        GridData btnGD = new GridData();
        _browseBtnWorkspace.setLayoutData(btnGD);
        _browseBtnWorkspace.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                String result = selectResourceFromWorkspace(_panel.getShell(), "*.wsdl"); //$NON-NLS-1$
                if (result != null) {
                    _mWSDLURIText.setText(result);
                    setHasChanged(true);
                    handleModify(_mWSDLURIText);
                    fireChangedEvent(_mWSDLURIText);
                }
            }
        });

        _portNameText = createLabelAndText(composite, Messages.label_wsdlPort);
        _portNameText.setEnabled(canEdit());
        GridData pnGD = new GridData(GridData.FILL_HORIZONTAL);
        pnGD.horizontalSpan = 2;
        _portNameText.setLayoutData(pnGD);

        if (getTargetObject() != null && getTargetObject() instanceof Service) {
            _contextPathText = createLabelAndText(composite, Messages.label_contextPath);
            _contextPathText.setEnabled(canEdit());
            GridData cpGD = new GridData(GridData.FILL_HORIZONTAL);
            cpGD.horizontalSpan = 2;
            _contextPathText.setLayoutData(cpGD);

            _mWSDLSocketText = createLabelAndText(composite, Messages.label_serverPort);
            _mWSDLSocketText.setEnabled(canEdit());

            GridData portGD = new GridData(GridData.FILL_HORIZONTAL);
            portGD.horizontalSpan = 2;
            _mWSDLSocketText.setLayoutData(portGD);
        }

        _unwrappedPayloadCheckbox = createCheckbox(composite, Messages.label_unwrappedPayload);
        GridData upChxGD = new GridData(GridData.FILL_HORIZONTAL);
        upChxGD.horizontalSpan = 3;
        _unwrappedPayloadCheckbox.setLayoutData(upChxGD);

        _soapHeadersTypeCombo = createLabelAndCombo(composite, Messages.label_soapHeadersType, true);
        GridData cmcGD = new GridData(GridData.FILL_HORIZONTAL);
        cmcGD.horizontalSpan = 2;
        _soapHeadersTypeCombo.setLayoutData(cmcGD);

        for (int i = 0; i < SoapHeadersType.values().length; i++) {
            _soapHeadersTypeCombo.add(SoapHeadersType.get(i).getLiteral(), i);
        }
        _soapHeadersTypeCombo.select(SoapHeadersType.VALUE_VALUE);
        
        Group endpointConfigGroup = new Group(composite, SWT.NONE);
        endpointConfigGroup.setText(Messages.label_endpointConfiguration);
        GridData epGrpGD = new GridData(GridData.FILL_HORIZONTAL);
        epGrpGD.horizontalSpan = 3;
        endpointConfigGroup.setLayoutData(epGrpGD);
        GridLayout groupGridLayout = new GridLayout(3, false);
        groupGridLayout.marginLeft = -5;
        endpointConfigGroup.setLayout(groupGridLayout);
        
        _configFileText = createLabelAndText(endpointConfigGroup,  Messages.label_configFile);
        _configFileText.setEnabled(canEdit());
        _configFileText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        _browseBtnConfigWorkspace = new Button(endpointConfigGroup, SWT.PUSH);
        _browseBtnConfigWorkspace.setText(Messages.button_browse);
        _browseBtnConfigWorkspace.setEnabled(canEdit());
        GridData btnConfigGD = new GridData();
        _browseBtnConfigWorkspace.setLayoutData(btnConfigGD);
        _browseBtnConfigWorkspace.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                String result = selectResourceFromWorkspace(_panel.getShell(), "*.xml"); //$NON-NLS-1$
                if (result != null) {
                    _configFileText.setText(result);
                    setHasChanged(true);
                    handleModify(_configFileText);
                    fireChangedEvent(_configFileText);
                }
            }
        });

        _configNameText = createLabelAndText(endpointConfigGroup,  Messages.label_configName);
        _configNameText.setEnabled(canEdit());
        GridData cnGD = new GridData(GridData.FILL_HORIZONTAL);
        cnGD.horizontalSpan = 2;
        _configNameText.setLayoutData(cnGD);
        
        addMtomControls(composite);

        return composite;
    }
    
    private void addMtomControls(Composite composite) {
        Group mtomGroup = new Group(composite, SWT.NONE);
        mtomGroup.setText(Messages.label_mtom);
        mtomGroup.setLayout(new GridLayout(4, false));
        GridData epConfigGroupGD = new GridData(GridData.FILL_HORIZONTAL);
        epConfigGroupGD.horizontalSpan = 3;
        epConfigGroupGD.horizontalIndent = -5;
        mtomGroup.setLayoutData(epConfigGroupGD);

        _enableMtomCheckbox = createCheckbox(mtomGroup, Messages.label_enable);
        GridData enableMtomChxGD = new GridData();
        enableMtomChxGD.horizontalSpan = 4;
        _enableMtomCheckbox.setLayoutData(enableMtomChxGD);

        _disableMtomCheckbox = createCheckbox(mtomGroup, Messages.label_temporarilyDisable);
        GridData disableMtomChxGD = new GridData();
        disableMtomChxGD.horizontalIndent = 10;
        _disableMtomCheckbox.setLayoutData(disableMtomChxGD);

        _enableXopExpandCheckbox = createCheckbox(mtomGroup, Messages.label_xopExpand);
        GridData enableXopExpandChxGD = new GridData();
        _enableXopExpandCheckbox.setLayoutData(enableXopExpandChxGD);
        
        _mtomThresholdText = createLabelAndText(mtomGroup, Messages.label_threshold);
        GridData mtomThresholdGD = new GridData(GridData.FILL_HORIZONTAL);
        _mtomThresholdText.setLayoutData(mtomThresholdGD);
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
                updateFeature(_binding, new String[] {"wsdl", "wsdlPort" }, new Object[] {_sWSDLURI, wsdlPort }); //$NON-NLS-1$ //$NON-NLS-2$
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
                if (isJustPort && !_bindingSocket.startsWith(":")) { //$NON-NLS-1$
                    _bindingSocket = ":" + _bindingSocket; //$NON-NLS-1$
                    _mWSDLSocketText.setText(_bindingSocket);
                }
                updateFeature(_binding, "socketAddr", _bindingSocket); //$NON-NLS-1$
            } else if (control.equals(_soapHeadersTypeCombo)) {
                final SoapHeadersType mapperValue = SoapHeadersType.getByName(_soapHeadersTypeCombo.getText());
                _messageComposerComposite.updateContextMapperFeature("soapHeadersType", mapperValue); //$NON-NLS-1$
            } else if (control.equals(_unwrappedPayloadCheckbox)) {
                _unwrappedPayloadCheckbox.setData("unwrapped"); //$NON-NLS-1$
                _messageComposerComposite.updateMessageComposerFeature(_unwrappedPayloadCheckbox);
            } else if (control.equals(_contextPathText)) {
                final String contextPath = _contextPathText.getText().trim();
                updateFeature(_binding, "contextPath", contextPath); //$NON-NLS-1$
            } else if (control.equals(_portNameText)) {
                final String wsdlPort = _portNameText.getText();
                updateFeature(_binding, "wsdlPort", wsdlPort); //$NON-NLS-1$
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
                updateMTomFeature("enabled", !_disableMtomCheckbox.getSelection()); //$NON-NLS-1$
            } else if (control.equals(_enableXopExpandCheckbox)) {
                updateMTomFeature("xopExpand", _enableXopExpandCheckbox.getSelection()); //$NON-NLS-1$
            } else if (control.equals(_configFileText)) {
                if (_configFileText.getText().trim().isEmpty() && _configNameText.getText().trim().isEmpty()) {
                    removeEndpointConfigFeature();
                } else {
                    updateEndpointConfigFeature("configFile", _configFileText.getText().trim()); //$NON-NLS-1$
                }
            } else if (control.equals(_configNameText)) {
                if (_configFileText.getText().trim().isEmpty() && _configNameText.getText().trim().isEmpty()) {
                    removeEndpointConfigFeature();
                } else {
                    updateEndpointConfigFeature("configName", _configNameText.getText().trim()); //$NON-NLS-1$
                }
            } else if (control.equals(_nameText)) {
                super.updateFeature(_binding, "name", _nameText.getText().trim()); //$NON-NLS-1$
            } else if (control.equals(_mtomThresholdText)) {
                final String threshold = _mtomThresholdText.getText();
                updateMTomFeature("threshold", threshold); //$NON-NLS-1$
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
                    _mtomThresholdText.setText(""); //$NON-NLS-1$
                }
            } else if (control.equals(_disableMtomCheckbox)) {
                if (_binding.getMtom() != null) {
                    _disableMtomCheckbox.setSelection(!(Boolean)_binding.getMtom().getEnabled());
                }
            } else if (control.equals(_enableXopExpandCheckbox)) {
                if (_binding.getMtom() != null) {
                    _enableXopExpandCheckbox.setSelection(!(Boolean)_binding.getMtom().getXopExpand());
                }
            } else if (control.equals(_configFileText)) {
                if (_binding.getEndpointConfig() != null) {
                    String configFile = _binding.getEndpointConfig().getConfigFile();
                    setTextValue(_configFileText, configFile);
                } else {
                    setTextValue(_configFileText, null);
                }
            } else if (control.equals(_configNameText)) {
                if (_binding.getEndpointConfig() != null) {
                    String configName = _binding.getEndpointConfig().getConfigName();
                    setTextValue(_configNameText, configName);
                } else {
                    setTextValue(_configNameText, null);
                }
            } else if (control.equals(_nameText)) {
                _nameText.setText(_binding.getName() == null ? "" : _binding.getName()); //$NON-NLS-1$
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
            setErrorMessage(Messages.error_noUri);
        } else if (uriString.trim().length() < uriString.length()) {
            setErrorMessage(Messages.error_spacesInUri);
//        } else {
//            try {
//                URI.create(uriString);
//            } catch (IllegalArgumentException e) {
//                setErrorMessage("Invalid URI");
//            }
        }

//        if (getBinding() != null && _mWSDLSocketText != null) {
//            String portString = _bindingSocket;
//            if (portString != null && portString.trim().length() > 0) {
//                int pos = portString.indexOf(':');
//                if (pos == -1) {
//                    setErrorMessage("Socket string should match one of these patterns: localhost:8080, 0.0.0.0:8080, or :8080");
//                } else {
//                    String left = portString.substring(0, pos).trim();
//                    if (left.length() > 0
//                            && !left.matches("^([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]{0,61}[a-zA-Z0-9])(\\.([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]{0,61}[a-zA-Z0-9]))*$")) {
//                        setErrorMessage("Socket string should match one of these patterns: localhost:8080, 0.0.0.0:8080, or :8080");
//                    }
//                    String right = portString.substring(pos + 1, portString.length()).trim();
//                    try {
//                        Integer.parseInt(right);
//                    } catch (NumberFormatException nfe) {
//                        setErrorMessage("The port number right of the : must be a valid integer.");
//                    }
//                }
////            } else {
////                setErrorMessage("No socket specified");
//            }
//        }

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
                    _mWSDLURIText.setText(""); //$NON-NLS-1$
                }
            }
            if (_portNameText != null && !_portNameText.isDisposed()) {
                String portName = _binding.getWsdlPort();
                if (portName != null) {
                    _portNameText.setText(portName);
                } else {
                    _portNameText.setText(""); //$NON-NLS-1$
                }
            }
            if (_mWSDLSocketText != null && !_mWSDLSocketText.isDisposed()) {
                _bindingSocket = _binding.getSocketAddr();
                if (_bindingSocket != null) {
                    _mWSDLSocketText.setText(_bindingSocket);
                } else {
                    _mWSDLSocketText.setText(""); //$NON-NLS-1$
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
            if (_binding.getEndpointConfig() != null) {
                if (_configFileText != null && !_configFileText.isDisposed()) {
                    String configFile = _binding.getEndpointConfig().getConfigFile();
                    if (configFile != null && !configFile.trim().isEmpty()) {
                        _configFileText.setText(configFile);
                    }
                }
                if (_configNameText != null && !_configNameText.isDisposed()) {
                    String configName = _binding.getEndpointConfig().getConfigName();
                    if (configName != null && !configName.trim().isEmpty()) {
                        _configNameText.setText(configName);
                    }
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
                        _mtomThresholdText.setText(""); //$NON-NLS-1$
                    }
                } else {
                    _enableXopExpandCheckbox.setEnabled(false);
                    _disableMtomCheckbox.setEnabled(false);
                    _mtomThresholdText.setEnabled(false);
                }
            }
            if (_binding.getName() == null) {
                _nameText.setText(""); //$NON-NLS-1$
            } else {
                _nameText.setText(_binding.getName());
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
     * @param initialPattern the file type to look for (*.xml, *.wsdl, etc)
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
    }

    class MessageComposerOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getMessageComposer() == null) {
                MessageComposerType messageComposer = (MessageComposerType) createMessageComposer();
                setFeatureValue(_binding, "messageComposer", messageComposer); //$NON-NLS-1$
            }
        }
    }
    
    class AddMTomOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getMtom() == null) {
                MtomType mtomType = SOAPFactory.eINSTANCE.createMtomType();
                setFeatureValue(_binding, "mtom", mtomType); //$NON-NLS-1$
            }
        }
    }

    class RemoveMTomOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getMtom() != null) {
                setFeatureValue(_binding, "mtom", null); //$NON-NLS-1$
            }
        }
    }

    protected void updateMessageComposerFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new MessageComposerOp());
        ops.add(new BasicOperation("messageComposer", featureId, value)); //$NON-NLS-1$
        wrapOperation(ops);
    }
    
    protected void updateMTomFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new AddMTomOp());
        if (featureId != null) {
            ops.add(new BasicOperation("mtom", featureId, value)); //$NON-NLS-1$
        }
        wrapOperation(ops);
    }
    
    protected void removeMTomFeature() {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new RemoveMTomOp());
        wrapOperation(ops);
    }

    class AddEndpointConfigOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getEndpointConfig() == null) {
                EndpointConfigType endpointConfigType = SOAPFactory.eINSTANCE.createEndpointConfigType();
                _binding.setEndpointConfig(endpointConfigType);
//                setFeatureValue(_binding, "endpointConfig", endpointConfigType);
            }
        }
    }

    class RemoveEndpointConfigOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getEndpointConfig() != null) {
                setFeatureValue(_binding, "endpointConfig", null); //$NON-NLS-1$
            }
        }
    }
    
    protected void updateEndpointConfigFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        String epName = null;
        String epFile =  null;
        if (_binding.getEndpointConfig() != null) {
            epName = _binding.getEndpointConfig().getConfigName();
            epFile = _binding.getEndpointConfig().getConfigFile();
        }
        if (featureId.equalsIgnoreCase("configName")) { //$NON-NLS-1$
            epName = (String) value;
        } else if (featureId.equalsIgnoreCase("configFile")) { //$NON-NLS-1$
            epFile = (String) value;
        }
        ops.add(new RemoveEndpointConfigOp());
        if (epName != null || epFile != null) {
            ops.add(new AddEndpointConfigOp());
            ops.add(new BasicOperation("endpointConfig", "configName", epName)); //$NON-NLS-1$ //$NON-NLS-2$
            ops.add(new BasicOperation("endpointConfig", "configFile",  epFile)); //$NON-NLS-1$ //$NON-NLS-2$
        }
        wrapOperation(ops);
    }

    protected void removeEndpointConfigFeature() {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new RemoveEndpointConfigOp());
        wrapOperation(ops);
    }
    
}
