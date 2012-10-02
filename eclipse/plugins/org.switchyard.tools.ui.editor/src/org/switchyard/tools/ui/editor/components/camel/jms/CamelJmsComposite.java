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
package org.switchyard.tools.ui.editor.components.camel.jms;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
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
import org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType;
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
public class CamelJmsComposite extends AbstractSYBindingComposite {

    private final static int QUEUE = 0;
    private final static int TOPIC = 1;

    private Composite _panel;
    private CamelJmsBindingType _binding = null;
    private Combo _operationSelectionCombo;
    private Combo _typeCombo;
    private Text _typeNameText;
    private Text _connectionFactoryText;
    private Text _concurrentConsumersText;
    private Text _maxConcurrentConsumersText;
    private Text _replyToText;
    private Text _requestTimeOutText;
    private Text _transactionManagerText;
    private Button _transactedButton;
    private TabFolder _tabFolder;
    private List<String> _advancedPropsFilterList;

    @Override
    public Binding getBinding() {
        return this._binding;
    }

    @Override
    public void setBinding(Binding impl) {
        if (impl instanceof CamelJmsBindingType) {
            this._binding = (CamelJmsBindingType) impl;
            setInUpdate(true);
            if (this._binding.getQueue() != null && !this._binding.getQueue().trim().isEmpty()) {
                _typeCombo.select(QUEUE);
                _typeNameText.setText(this._binding.getQueue());
            } else if (this._binding.getTopic() != null && !this._binding.getTopic().trim().isEmpty()) {
                _typeCombo.select(TOPIC);
                _typeNameText.setText(this._binding.getTopic());
            }
            if (this._binding.getConcurrentConsumers() > 0) {
                _concurrentConsumersText.setText(Integer.toString(this._binding.getConcurrentConsumers()));
            }
            if (_requestTimeOutText != null && this._binding.getRequestTimeout() != null 
                    && this._binding.getRequestTimeout().intValue() > 0
                    && this._binding.getRequestTimeout() != 2000) {
                _requestTimeOutText.setText(Integer.toString(this._binding.getRequestTimeout()));
            }
            if (_maxConcurrentConsumersText != null) {
                if (this._binding.getMaxConcurrentConsumers() > 0) {
                    _maxConcurrentConsumersText.setText(Integer.toString(this._binding.getMaxConcurrentConsumers()));
                }
            }
            if (this._binding.getConnectionFactory() != null && !this._binding.getConnectionFactory().trim().isEmpty()) {
                _connectionFactoryText.setText(this._binding.getConnectionFactory());
            }
            _transactedButton.setSelection(this._binding.isTransacted());
            if (this._binding.getTransactionManager() != null
                    && !this._binding.getTransactionManager().trim().isEmpty()) {
                _transactionManagerText.setText(this._binding.getTransactionManager());
            }
            if (this._binding.getReplyTo() != null && !this._binding.getReplyTo().trim().isEmpty()) {
                _replyToText.setText(this._binding.getReplyTo());
            }
            populateOperationCombo();
            String opName = CamelBindingUtil.getOperationNameForStaticOperationSelector(this._binding);
            if (opName != null) {
                setTextValue(_operationSelectionCombo, opName);
            }
            if (this._binding.getConnectionFactory() == null || this._binding.getConnectionFactory().trim().isEmpty()) {
                _connectionFactoryText.setText("#ConnectionFactory");
                handleModify(_connectionFactoryText);
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
            if (_typeNameText.getText().trim().isEmpty()) {
                setErrorMessage("Name may not be empty.");
            }
            if (_connectionFactoryText.getText().trim().isEmpty()) {
                setErrorMessage("Connection Factory may not be empty.");
            }
            if (!_concurrentConsumersText.getText().trim().isEmpty()) {
                try {
                    Integer.valueOf(_concurrentConsumersText.getText().trim());
                } catch (NumberFormatException nfe) {
                    setErrorMessage("Concurrent Consumers must be a valid integer.");
                }
            }
            if (!_maxConcurrentConsumersText.getText().trim().isEmpty()) {
                try {
                    Integer.valueOf(_maxConcurrentConsumersText.getText().trim());
                } catch (NumberFormatException nfe) {
                    setErrorMessage("Maximum Concurrent Consumers must be a valid integer.");
                }
            }
            if (_requestTimeOutText != null && _requestTimeOutText.getText().trim().isEmpty()) {
                try {
                    Integer.valueOf(_requestTimeOutText.getText().trim());
                } catch (NumberFormatException nfe) {
                    setErrorMessage("Request Timeout must be a valid integer.");
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
        if (getTargetObject() == null && this._binding.eContainer() != null) {
            setTargetObject(this._binding.eContainer());
        }
        if (getTargetObject() != null && getTargetObject() instanceof Service) {
            one.setText("JMS Consumer");
        } else if (getTargetObject() != null && getTargetObject() instanceof Reference) {
            one.setText("JMS Producer");
        }
        one.setControl(getJmsTabControl(_tabFolder));

        addTabs(_tabFolder);
    }

    private Control getJmsTabControl(TabFolder tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(1, false);
        composite.setLayout(gl);

        Group jmsGroup = new Group(composite, SWT.NONE);
        jmsGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        jmsGroup.setLayout(new GridLayout(2, false));
        jmsGroup.setText("Jms Options");

        _typeCombo = createLabelAndCombo(jmsGroup, "Type", true);
        _typeCombo.add("Queue", QUEUE);
        _typeCombo.add("Topic", TOPIC);
        _typeCombo.select(0);

        _typeNameText = createLabelAndText(jmsGroup, "Name");

        _connectionFactoryText = createLabelAndText(jmsGroup, "Connection Factory");
        _connectionFactoryText.setText("#ConnectionFactory");

        _concurrentConsumersText = createLabelAndText(jmsGroup, "Concurrent Consumers");
        _concurrentConsumersText.setText("1");
        _maxConcurrentConsumersText = createLabelAndText(jmsGroup, "Maximum Concurrent Consumers");
        _maxConcurrentConsumersText.setText("1");
        _replyToText = createLabelAndText(jmsGroup, "Reply To");
        _requestTimeOutText = null;
        if (getTargetObject() != null && getTargetObject() instanceof Reference) {
            _requestTimeOutText = createLabelAndText(jmsGroup, "Request Timeout");
            _requestTimeOutText.setText("20000");
        }
        _transactionManagerText = createLabelAndText(jmsGroup, "Transaction Manager");
        _transactedButton = createCheckbox(jmsGroup, "Transacted");

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
        if (control.equals(_typeCombo) || control.equals(_typeNameText)) {
            boolean isQueue = (_typeCombo.getSelectionIndex() == QUEUE) ? true : false;
            String topic = null;
            String queue = null;
            if (isQueue) {
                topic = null;
                queue = _typeNameText.getText().trim();
            } else {
                queue = null;
                topic = _typeNameText.getText().trim();
            }
            updateFeature(_binding, new String[] {"topic", "queue" }, new Object[] {topic, queue });
        } else if (control.equals(_connectionFactoryText)) {
            String value = null;
            if (!_connectionFactoryText.getText().trim().isEmpty()) {
                value = _connectionFactoryText.getText().trim();
            }
            updateFeature(_binding, "connectionFactory", value);
        } else if (control.equals(_concurrentConsumersText)) {
            Integer value = null;
            try {
                value = Integer.valueOf(_concurrentConsumersText.getText().trim());
                if (value != null && value.intValue() > 1) {
                    updateFeature(_binding, "concurrentConsumers", value.intValue());
                }
            } catch (NumberFormatException nfe) {
                // ignore
                nfe.fillInStackTrace();
            }
        } else if (control.equals(_maxConcurrentConsumersText)) {
            Integer value = null;
            try {
                value = Integer.valueOf(_maxConcurrentConsumersText.getText().trim());
                if (value != null && value.intValue() > 1) {
                    updateFeature(_binding, "maxConcurrentConsumers", value.intValue());
                }
            } catch (NumberFormatException nfe) {
                // ignore
                nfe.fillInStackTrace();
            }
        } else if (control.equals(_replyToText)) {
            String value = null;
            if (!_replyToText.getText().trim().isEmpty()) {
                value = _replyToText.getText().trim();
            }
            updateFeature(_binding, "replyTo", value);
        } else if (control.equals(_requestTimeOutText)) {
            Integer value = null;
            try {
                value = Integer.valueOf(_requestTimeOutText.getText().trim());
                if (value != null && value.intValue() != 20000) {
                    updateFeature(_binding, "requestTimeout", value.intValue());
                }
            } catch (NumberFormatException nfe) {
                // ignore
                nfe.fillInStackTrace();
            }
        } else if (control.equals(_transactedButton)) {
            boolean value = _transactedButton.getSelection();
            updateFeature(_binding, "transacted", value);
        } else if (control.equals(_transactionManagerText)) {
            String value = null;
            if (!_transactionManagerText.getText().trim().isEmpty()) {
                value = _transactionManagerText.getText().trim();
            }
            updateFeature(_binding, "transactionManager", value);
        } else if (control.equals(_operationSelectionCombo)) {
            updateCamelOperationSelectorFeature("operationName", _operationSelectionCombo.getText().trim());
        } else {
            super.handleModify(control);
        }
        validate();
        setHasChanged(false);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (control.equals(_concurrentConsumersText)) {
                if (this._binding.getConcurrentConsumers() > 0) {
                    _concurrentConsumersText.setText(Integer.toString(this._binding.getConcurrentConsumers()));
                } else {
                    _concurrentConsumersText.setText("1");
                }
            } else if (control.equals(_connectionFactoryText)) {
                _connectionFactoryText.setText(this._binding.getConnectionFactory());
            } else if (control.equals(_maxConcurrentConsumersText)) {
                if (this._binding.getMaxConcurrentConsumers() > 0) {
                    _maxConcurrentConsumersText.setText(Integer.toString(this._binding.getMaxConcurrentConsumers()));
                } else {
                    _maxConcurrentConsumersText.setText("1");
                }
            } else if (control.equals(_replyToText)) {
                _replyToText.setText(this._binding.getReplyTo());
            } else if (control.equals(_requestTimeOutText)) {
                if (this._binding.getMaxConcurrentConsumers() > 0 && this._binding.getMaxConcurrentConsumers() != 2000) {
                    _maxConcurrentConsumersText.setText(Integer.toString(this._binding.getMaxConcurrentConsumers()));
                } else {
                    _maxConcurrentConsumersText.setText("2000");
                }
            } else if (control.equals(_transactedButton)) {
                _transactedButton.setSelection(this._binding.isTransacted());
            } else if (control.equals(_typeCombo) || control.equals(_typeNameText)) {
                if (this._binding.getQueue() != null && !this._binding.getQueue().trim().isEmpty()) {
                    _typeCombo.select(QUEUE);
                    _typeNameText.setText(this._binding.getQueue());
                } else if (this._binding.getTopic() != null && !this._binding.getTopic().trim().isEmpty()) {
                    _typeCombo.select(TOPIC);
                    _typeNameText.setText(this._binding.getTopic());
                }
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
            _advancedPropsFilterList.add("username");
            _advancedPropsFilterList.add("password");
            _advancedPropsFilterList.add("clientId");
            _advancedPropsFilterList.add("durableSubscriptionName");
            _advancedPropsFilterList.add("disableReplyTo");
            _advancedPropsFilterList.add("preserveMessageQos");
            _advancedPropsFilterList.add("deliveryPersistent");
            _advancedPropsFilterList.add("priority");
            _advancedPropsFilterList.add("explicitQosEnabled");
            _advancedPropsFilterList.add("replyToType");
            _advancedPropsFilterList.add("requestTimeout");
            _advancedPropsFilterList.add("selector");
            _advancedPropsFilterList.add("timeToLive");
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
