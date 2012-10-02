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
package org.switchyard.tools.ui.editor.components.camel.netty;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
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
import org.switchyard.tools.models.switchyard1_0.camel.CamelNettyUdpBindingType;
import org.switchyard.tools.models.switchyard1_0.commonselector.CommonselectorFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.binding.CamelBindingUtil;
import org.switchyard.tools.ui.editor.diagram.binding.CamelOperationSelectorGroupOp;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorOp;
import org.switchyard.tools.ui.editor.diagram.binding.RemoveOperationSelectorOp;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.util.InterfaceOpsUtil;

/**
 * @author bfitzpat
 * 
 */
public class CamelNettyUDPComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelNettyUdpBindingType _binding = null;
    private Text _hostText;
    private Text _portText;
    private Text _sendBufferSizeText;
    private Text _receiveBufferSizeText;
    private Button _syncCheckbox;
    private Button _broadcastCheckbox;
    private Combo _operationSelectionCombo;
    private TabFolder _tabFolder;
    private List<String> _advancedPropsFilterList;

    @Override
    public Binding getBinding() {
        return this._binding;
    }

    @Override
    public void setBinding(Binding impl) {
        if (impl instanceof CamelNettyUdpBindingType) {
            this._binding = (CamelNettyUdpBindingType) impl;
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
            _broadcastCheckbox.setSelection(this._binding.isBroadcast());
            populateOperationCombo();
            String opName = CamelBindingUtil.getOperationNameForStaticOperationSelector(this._binding);
            if (opName != null) {
                setTextValue(_operationSelectionCombo, opName);
            }
            super.setTabsBinding(_binding);
            setInUpdate(false);
            validate();
        } else {
            this._binding = null;
            populateOperationCombo();
        }
        addObservableListeners();
    }

    @Override
    protected boolean validate() {
        setErrorMessage(null);
        if (getBinding() != null) {
            if (_hostText.getText().trim().isEmpty()) {
                setErrorMessage("Host may not be empty.");
            }
            if (_portText.getText().trim().isEmpty()) {
                setErrorMessage("Port may not be empty.");
            } else {
                try {
                    Integer.valueOf(_portText.getText().trim());
                } catch (NumberFormatException nfe) {
                    setErrorMessage("Port must be a valid number.");
                }
            }
            if (!_sendBufferSizeText.getText().trim().isEmpty()) {
                try {
                    Long.valueOf(_sendBufferSizeText.getText().trim());
                } catch (NumberFormatException nfe) {
                    setErrorMessage("Send Buffer Size must be a valid number.");
                }
            }
            if (!_receiveBufferSizeText.getText().trim().isEmpty()) {
                try {
                    Long.valueOf(_receiveBufferSizeText.getText().trim());
                } catch (NumberFormatException nfe) {
                    setErrorMessage("Receive Buffer Size must be a valid number.");
                }
            }
        }
        super.validateTabs();
        return (getErrorMessage() == null);
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());
        if (getRootGridData() != null) {
            _panel.setLayoutData(getRootGridData());
        }

        _tabFolder = new TabFolder(_panel, SWT.NONE);

        TabItem one = new TabItem(_tabFolder, SWT.NONE);
        one.setText("Netty UDP Gateway");
        one.setControl(getSchedulerTabControl(_tabFolder));

        addTabs(_tabFolder);
    }

    private Control getSchedulerTabControl(TabFolder tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(1, false);
        composite.setLayout(gl);

        Group udpGroup = new Group(composite, SWT.NONE);
        udpGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        udpGroup.setLayout(new GridLayout(2, false));
        udpGroup.setText("UDP Options");

        _hostText = createLabelAndText(udpGroup, "Host*");
        _portText = createLabelAndText(udpGroup, "Port*");
        _syncCheckbox = createCheckbox(udpGroup, "Sync");
        _broadcastCheckbox = createCheckbox(udpGroup, "Broadcast");
        _sendBufferSizeText = createLabelAndText(udpGroup, "Send Buffer Size");
        _receiveBufferSizeText = createLabelAndText(udpGroup, "Receive Buffer Size");

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

            if (getTargetObject() == null) {
                PictogramElement[] pes = SwitchyardSCAEditor.getActiveEditor().getSelectedPictogramElements();
                if (pes.length > 0) {
                    Object bo = SwitchyardSCAEditor.getActiveEditor().getDiagramTypeProvider().getFeatureProvider()
                            .getBusinessObjectForPictogramElement(pes[0]);
                    if (bo instanceof Service) {
                        setTargetObject(bo);
                    }
                }
            }
            if (getTargetObject() != null && getTargetObject() instanceof Contract) {
                String[] operations = InterfaceOpsUtil.gatherOperations((Contract) getTargetObject());
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

    class CamelOperationSelectorOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding.getOperationSelector() == null) {
                setFeatureValue(_binding, "operationSelector", CommonselectorFactory.eINSTANCE.createStaticOperationSelectorType());
            }
        }
    }

    private void updateCamelOperationSelectorFeature(String featureId, Object value) {
        if (CamelBindingUtil.getFirstOperationSelector(_binding) != null) {
            OperationSelectorType opSelect = CamelBindingUtil.getFirstOperationSelector(_binding);
            Object oldValue = getFeatureValue(opSelect, featureId);
            // don't do anything if the value is the same
            if (oldValue == null && value == null) {
                return;
            } else if (oldValue != null && oldValue.equals(value)) {
                return;
            } else if (value != null && value.equals(oldValue)) {
                return;
            }
        }
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        if (featureId.equals("operationName") && value instanceof String && ((String)value).trim().isEmpty()) {
            ops.add(new RemoveOperationSelectorOp(this._binding));
        } else {
            ops.add(new CamelOperationSelectorGroupOp(this._binding));
            ops.add(new OperationSelectorOp(this._binding, featureId, value));
        }
        wrapOperation(ops);
    }
    
    protected void handleModify(final Control control) {
        if (control.equals(_hostText)) {
            updateFeature(_binding, "host", _hostText.getText().trim());
        } else if (control.equals(_portText)) {
            int portInt = -1;
            try {
                portInt = Integer.valueOf(_portText.getText().trim());
                if (portInt > -1) {
                    updateFeature(_binding, "port", portInt);
                }
            } catch (NumberFormatException nfe) {
                // ignore
                nfe.fillInStackTrace();
            }
        } else if (control.equals(_sendBufferSizeText)) {
            long sendSizeLong = -1;
            try {
                sendSizeLong = Long.valueOf(_sendBufferSizeText.getText().trim());
                if (sendSizeLong > -1) {
                    updateFeature(_binding, "sendBufferSize", sendSizeLong);
                }
            } catch (NumberFormatException nfe) {
                // ignore
                nfe.fillInStackTrace();
            }
        } else if (control.equals(_receiveBufferSizeText)) {
            long receiveSizeLong = -1;
            try {
                receiveSizeLong = Long.valueOf(_receiveBufferSizeText.getText().trim());
                if (receiveSizeLong > -1) {
                    updateFeature(_binding, "receiveBufferSize", receiveSizeLong);
                }
            } catch (NumberFormatException nfe) {
                // ignore
                nfe.fillInStackTrace();
            }
        } else if (control.equals(_syncCheckbox)) {
            boolean value = _syncCheckbox.getSelection();
            updateFeature(_binding, "sync", value);
        } else if (control.equals(_broadcastCheckbox)) {
            boolean value = _broadcastCheckbox.getSelection();
            updateFeature(_binding, "broadcast", value);
        } else if (control.equals(_operationSelectionCombo)) {
            updateCamelOperationSelectorFeature("operationName", _operationSelectionCombo.getText().trim());
        }
        super.handleModify(control);
        setHasChanged(false);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (control.equals(_hostText)) {
                _hostText.setText(this._binding.getHost());
            } else if (control.equals(_portText)) {
                _portText.setText(Integer.toString(this._binding.getPort()));
            } else if (control.equals(_receiveBufferSizeText)) {
                _receiveBufferSizeText.setText(Long.toString(this._binding.getReceiveBufferSize()));
            } else if (control.equals(_sendBufferSizeText)) {
                _sendBufferSizeText.setText(Long.toString(this._binding.getSendBufferSize()));
            } else if (control.equals(_broadcastCheckbox)) {
                _broadcastCheckbox.setSelection(this._binding.isBroadcast());
            } else if (control.equals(_syncCheckbox)) {
                _syncCheckbox.setSelection(this._binding.isSync());
            } else if (control.equals(_operationSelectionCombo)) {
                String opName = CamelBindingUtil.getOperationNameForStaticOperationSelector(this._binding);
                setTextValue(_operationSelectionCombo, opName);
            } else {
                super.handleUndo(control);
            }
        }
        setHasChanged(false);
    }

    @Override
    protected List<String> getAdvancedPropertiesFilterList() {
        if (_advancedPropsFilterList == null) {
            _advancedPropsFilterList = new ArrayList<String>();
            _advancedPropsFilterList.add("reuseAddress");
            _advancedPropsFilterList.add("encoders");
            _advancedPropsFilterList.add("decoders");
            _advancedPropsFilterList.add("allowDefaultCodec");
            _advancedPropsFilterList.add("workerCount");
            _advancedPropsFilterList.add("disconnect");
        }
        return _advancedPropsFilterList;
    }

    @Override
    protected ContextMapperType createContextMapper() {
        return CamelFactory.eINSTANCE.createCamelContextMapperType();
    }

    @Override
    protected MessageComposerType createMessageComposer() {
        return CamelFactory.eINSTANCE.createCamelMessageComposerType();
    }
    
}
