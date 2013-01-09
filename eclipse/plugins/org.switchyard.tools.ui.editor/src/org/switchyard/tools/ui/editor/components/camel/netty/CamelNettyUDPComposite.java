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

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyUdpBindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorComposite;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorUtil;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;

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
    private TabFolder _tabFolder;
    private List<String> _advancedPropsFilterList;
    private OperationSelectorComposite _opSelectorComposite;

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
            if (this._binding.isSetSendBufferSize()) {
                _sendBufferSizeText.setText(""+this._binding.getSendBufferSize());
            }
            if (this._binding.isSetReceiveBufferSize()) {
                _receiveBufferSizeText.setText(""+this._binding.getReceiveBufferSize());
            }
            _syncCheckbox.setSelection(this._binding.isSync());
            _broadcastCheckbox.setSelection(this._binding.isBroadcast());

            OperationSelectorType opSelector = OperationSelectorUtil.getFirstOperationSelector(this._binding);
            _opSelectorComposite.setBinding(this._binding);
            _opSelectorComposite.setOperation((SwitchYardOperationSelectorType) opSelector);

            super.setTabsBinding(_binding);
            setInUpdate(false);
            validate();
        } else {
            this._binding = null;
        }
        addObservableListeners();
    }

    @Override
    public void setTargetObject(Object target) {
        super.setTargetObject(target);
        _opSelectorComposite.setTargetObject((EObject) target);
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

        _opSelectorComposite = new OperationSelectorComposite(composite, SWT.NONE);
        _opSelectorComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        _opSelectorComposite.setLayout(new GridLayout(2, false));
        _opSelectorComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                handleModify(_opSelectorComposite);
            }
         });

        return composite;
    }

    @Override
    public Composite getPanel() {
        return this._panel;
    }

    class CamelOperationSelectorOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding.getOperationSelector() == null) {
                setFeatureValue(_binding, "operationSelector", SwitchyardFactory.eINSTANCE.createStaticOperationSelectorType());
            }
        }
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
        } else if (control.equals(_opSelectorComposite)) {
            int opType = _opSelectorComposite.getSelectedOperationSelectorType();
            updateOperationSelectorFeature(opType, _opSelectorComposite.getSelectedOperationSelectorValue());
        }
        super.handleModify(control);
        setHasChanged(false);
        setDidSomething(true);
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
//            } else if (control.equals(_operationSelectionCombo)) {
//                String opName = OperationSelectorUtil.getOperationNameForStaticOperationSelector(this._binding);
//                setTextValue(_operationSelectionCombo, opName);
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
        return SwitchyardFactory.eINSTANCE.createContextMapperType();
    }

    @Override
    protected MessageComposerType createMessageComposer() {
        return SwitchyardFactory.eINSTANCE.createMessageComposerType();
    }
    
}
