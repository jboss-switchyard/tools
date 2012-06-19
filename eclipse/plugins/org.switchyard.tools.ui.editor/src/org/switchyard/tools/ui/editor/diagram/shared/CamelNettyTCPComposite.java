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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelNettyTcpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelOperationSelectorType;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.util.InterfaceOpsUtil;

/**
 * @author bfitzpat
 * 
 */
public class CamelNettyTCPComposite extends AbstractSwitchyardComposite implements IBindingComposite {

    private Composite _panel;
    private CamelNettyTcpBindingType _binding = null;
    private Text _hostText;
    private Text _portText;
    private Text _sendBufferSizeText;
    private Text _receiveBufferSizeText;
    private Button _syncCheckbox;
    private Button _keepAliveCheckbox;
    private Combo _operationSelectionCombo;
    private Object _targetObj = null;

    @Override
    public Binding getBinding() {
        return this._binding;
    }

    @Override
    public void setBinding(Binding impl) {
        if (impl instanceof CamelNettyTcpBindingType) {
            this._binding = (CamelNettyTcpBindingType) impl;
            setInUpdate(true);
            if (this._binding.getHost() != null) {
                _hostText.setText(this._binding.getHost());
            }
            if (this._binding.getPort() > 0) {
                _portText.setText(""+this._binding.getPort());
            }
            if (this._binding.getSendBufferSize() > 0) {
                _sendBufferSizeText.setText(""+this._binding.getSendBufferSize());
            }
            if (this._binding.getReceiveBufferSize() > 0) {
                _receiveBufferSizeText.setText(""+this._binding.getReceiveBufferSize());
            }
            _syncCheckbox.setSelection(this._binding.isSync());
            _keepAliveCheckbox.setSelection(this._binding.isKeepAlive());
            populateOperationCombo();
            if (this._binding.getCamelOperationSelector() != null) {
                CamelOperationSelectorType camelOpSelector = (CamelOperationSelectorType) this._binding
                        .getCamelOperationSelector();
                _operationSelectionCombo.setText(camelOpSelector.getOperationName());
            }
            setInUpdate(false);
            validate();
        } else {
            this._binding = null;
            populateOperationCombo();
        }
    }

    @Override
    protected boolean validate() {
        setErrorMessage(null);
        if (getBinding() != null) {
            if (_hostText.getText().trim().isEmpty()) {
                setErrorMessage("Host may not be empty.");
                return false;
            }
            if (_portText.getText().trim().isEmpty()) {
                setErrorMessage("Port may not be empty.");
                return false;
            } else {
                try {
                    Integer.parseInt(_portText.getText().trim());
                } catch (NumberFormatException nfe) {
                    setErrorMessage("Port must be a valid number.");
                    return false;
                }
            }
            if (!_sendBufferSizeText.getText().trim().isEmpty()) {
                try {
                    Long.parseLong(_portText.getText().trim());
                } catch (NumberFormatException nfe) {
                    setErrorMessage("Send Buffer Size must be a valid number.");
                    return false;
                }
            }
            if (!_receiveBufferSizeText.getText().trim().isEmpty()) {
                try {
                    Long.parseLong(_receiveBufferSizeText.getText().trim());
                } catch (NumberFormatException nfe) {
                    setErrorMessage("Receive Buffer Size must be a valid number.");
                    return false;
                }
            }
        }
        return (getErrorMessage() == null);
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());
        if (getRootGridData() != null) {
            _panel.setLayoutData(getRootGridData());
        }

        TabFolder tabFolder = new TabFolder(_panel, SWT.NONE);

        TabItem one = new TabItem(tabFolder, SWT.NONE);
        one.setText("Netty TCP Gateway");
        one.setControl(getSchedulerTabControl(tabFolder));
    }

    private Control getSchedulerTabControl(TabFolder tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(1, false);
        composite.setLayout(gl);

        Group tcpGroup = new Group(composite, SWT.NONE);
        tcpGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        tcpGroup.setLayout(new GridLayout(2, false));
        tcpGroup.setText("TCP Options");

        _hostText = createLabelAndText(tcpGroup, "Host*");
        _portText = createLabelAndText(tcpGroup, "Port*");
        _syncCheckbox = createCheckbox(tcpGroup, "Sync");
        _keepAliveCheckbox = createCheckbox(tcpGroup, "Keep Alive");
        _sendBufferSizeText = createLabelAndText(tcpGroup, "Send Buffer Size");
        _receiveBufferSizeText = createLabelAndText(tcpGroup, "Receive Buffer Size");

        Group opGroup = new Group(composite, SWT.NONE);
        opGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        opGroup.setLayout(new GridLayout(2, false));
        opGroup.setText("Operation Options");
        _operationSelectionCombo = createLabelAndCombo(opGroup, "Operation");
        populateOperationCombo();

        return composite;
    }

    private void populateOperationCombo() {
        if (_operationSelectionCombo != null && !_operationSelectionCombo.isDisposed()) {
            _operationSelectionCombo.removeAll();
            _operationSelectionCombo.clearSelection();

            if (_targetObj == null) {
                @SuppressWarnings("restriction")
                PictogramElement[] pes = SwitchyardSCAEditor.getActiveEditor().getSelectedPictogramElements();
                if (pes.length > 0) {
                    @SuppressWarnings("restriction")
                    Object bo = SwitchyardSCAEditor.getActiveEditor().getDiagramTypeProvider().getFeatureProvider()
                            .getBusinessObjectForPictogramElement(pes[0]);
                    if (bo instanceof Service) {
                        _targetObj = bo;
                    }
                }
            }
            if (_targetObj != null && _targetObj instanceof Service) {
                String[] operations = InterfaceOpsUtil.gatherOperations((Service) _targetObj);
                for (int i = 0; i < operations.length; i++) {
                    _operationSelectionCombo.add(operations[i]);
                }
            }
        }
    }

    @Override
    public Composite getPanel() {
        return this._panel;
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

    private class BindingRecordingCommand extends RecordingCommand {

        private CamelNettyTcpBindingType _innerBinding;
        private String _featureId;
        private Object _value;

        public BindingRecordingCommand(TransactionalEditingDomain domain, CamelNettyTcpBindingType binding,
                String featureId, Object value) {
            super(domain);
            this._innerBinding = binding;
            this._featureId = featureId;
            this._value = value;
        }

        @Override
        protected void doExecute() {
            setFeatureValue(_innerBinding, _featureId, _value);
        }

    }

    @SuppressWarnings("restriction")
    protected void handleModify(final Control control) {
        TransactionalEditingDomain domain = null;
        if (_binding.eContainer() != null) {
            domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
        }
        if (control.equals(_hostText)) {
            if (domain != null) {
                BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "host",
                        _hostText.getText().trim());
                domain.getCommandStack().execute(command);
            } else {
                _binding.setHost(_hostText.getText().trim());
            }
        } else if (control.equals(_portText)) {
            int portInt = -1;
            try {
                portInt = Integer.parseInt(_portText.getText().trim());
            } catch (NumberFormatException nfe) {
                // ignore
                nfe.fillInStackTrace();
            }
            if (portInt > -1) {
                if (domain != null) {
                    BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "port", portInt);
                    domain.getCommandStack().execute(command);
                } else {
                    _binding.setPort(portInt);
                }
            }
        } else if (control.equals(_sendBufferSizeText)) {
            long sendSizeLong = -1;
            try {
                sendSizeLong = Long.parseLong(_sendBufferSizeText.getText().trim());
            } catch (NumberFormatException nfe) {
                // ignore
                nfe.fillInStackTrace();
            }
            if (sendSizeLong > -1) {
                if (domain != null) {
                    BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "sendBufferSize", sendSizeLong);
                    domain.getCommandStack().execute(command);
                } else {
                    _binding.setSendBufferSize(sendSizeLong);
                }
            }
        } else if (control.equals(_receiveBufferSizeText)) {
            long receiveSizeLong = -1;
            try {
                receiveSizeLong = Long.parseLong(_receiveBufferSizeText.getText().trim());
            } catch (NumberFormatException nfe) {
                // ignore
                nfe.fillInStackTrace();
            }
            if (receiveSizeLong > -1) {
                if (domain != null) {
                    BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "receiveBufferSize", receiveSizeLong);
                    domain.getCommandStack().execute(command);
                } else {
                    _binding.setReceiveBufferSize(receiveSizeLong);
                }
            }
        } else if (control.equals(_syncCheckbox)) {
            if (domain != null) {
                BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "sync",
                        _syncCheckbox.getSelection());
                domain.getCommandStack().execute(command);
            } else {
                _binding.setSync(_syncCheckbox.getSelection());
            }
        } else if (control.equals(_keepAliveCheckbox)) {
            if (domain != null) {
                BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "keepAlive",
                        _keepAliveCheckbox.getSelection());
                domain.getCommandStack().execute(command);
            } else {
                _binding.setKeepAlive(_keepAliveCheckbox.getSelection());
            }
        } else if (control.equals(_operationSelectionCombo)) {
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        if (_binding.getOperationSelector() == null) {
                            _binding.setCamelOperationSelector(CamelFactory.eINSTANCE
                                    .createCamelOperationSelectorType());
                        }
                        ((CamelOperationSelectorType) _binding.getCamelOperationSelector())
                                .setOperationName(_operationSelectionCombo.getText().trim());
                    }
                });
            } else {
                if (_binding.getOperationSelector() == null) {
                    _binding.setCamelOperationSelector(CamelFactory.eINSTANCE.createCamelOperationSelectorType());
                }
                ((CamelOperationSelectorType) _binding.getCamelOperationSelector())
                        .setOperationName(_operationSelectionCombo.getText().trim());
            }
        }
        setHasChanged(false);
    }

    /**
     * @param target Passed in what we're dropping on
     */
    public void setTargetObject(Object target) {
        this._targetObj = target;
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (_binding != null && !inUpdate() && hasChanged()) {
            validate();
            handleModify((Control) e.getSource());
            fireChangedEvent((Control) e.getSource());
        } else {
            validate();
            fireChangedEvent((Control) e.getSource());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.keyCode == SWT.ESC) {
            // cancel out and return to original value
            setInUpdate(true);
            if (_binding != null) {
                Control control = (Control) e.getSource();
                if (control.equals(_hostText)) {
                    _hostText.setText(this._binding.getHost());
                } else if (control.equals(_portText)) {
                    _portText.setText(Integer.toString(this._binding.getPort()));
                } else if (control.equals(_receiveBufferSizeText)) {
                    _receiveBufferSizeText.setText(Long.toString(this._binding.getReceiveBufferSize()));
                } else if (control.equals(_sendBufferSizeText)) {
                    _sendBufferSizeText.setText(Long.toString(this._binding.getSendBufferSize()));
                } else if (control.equals(_keepAliveCheckbox)) {
                    _keepAliveCheckbox.setSelection(this._binding.isKeepAlive());
                } else if (control.equals(_syncCheckbox)) {
                    _syncCheckbox.setSelection(this._binding.isSync());
                } else if (control.equals(_operationSelectionCombo)) {
                    if (this._binding.getCamelOperationSelector() != null) {
                        populateOperationCombo();
                        CamelOperationSelectorType camelOpSelector = (CamelOperationSelectorType) this._binding
                                .getCamelOperationSelector();
                        _operationSelectionCombo.setText(camelOpSelector.getOperationName());
                    }
                }
            }
            setInUpdate(false);
        } else if (e.keyCode == SWT.CR) {
            // accept change
            if (_binding != null && !inUpdate() && hasChanged()) {
                validate();
                handleModify((Control) e.getSource());
                fireChangedEvent((Control) e.getSource());
            }
        } else if (e.keyCode == SWT.TAB) {
            if (_binding != null && !inUpdate() && hasChanged()) {
                boolean flag = validate();
                if (flag) {
                    handleModify((Control) e.getSource());
                }
                fireChangedEvent((Control) e.getSource());
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
