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

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
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
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.camel.jms.CamelJmsBindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardOperationSelectorType;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorComposite;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorUtil;
import org.switchyard.tools.ui.editor.util.PropTypeUtil;

/**
 * @author bfitzpat
 * 
 */
public class CamelJmsComposite extends AbstractSYBindingComposite {

    private final static int QUEUE = 0;
    private final static int TOPIC = 1;

    private Composite _panel;
    private CamelJmsBindingType _binding = null;
    private Text _nameText;
    private Combo _typeCombo;
    private Text _typeNameText;
    private Text _connectionFactoryText;
    private Text _concurrentConsumersText;
    private Text _maxConcurrentConsumersText;
    private Text _replyToText;
    private Text _requestTimeOutText;
    private Text _transactionManagerText;
    private Text _selectorText;
    private Button _transactedButton;
    private OperationSelectorComposite _opSelectorComposite;

    @Override
    public String getTitle() {
        return "JMS Binding Details";
    }

    @Override
    public String getDescription() {
        return "Specify pertinent details for your JMS Binding.";
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof CamelJmsBindingType) {
            setTargetObject(impl.eContainer());
            this._binding = (CamelJmsBindingType) impl;
            setInUpdate(true);
            if (this._binding.getQueue() != null && !this._binding.getQueue().trim().isEmpty()) {
                _typeCombo.select(QUEUE);
                _typeNameText.setText(this._binding.getQueue());
            } else if (this._binding.getTopic() != null && !this._binding.getTopic().trim().isEmpty()) {
                _typeCombo.select(TOPIC);
                _typeNameText.setText(this._binding.getTopic());
            }
            if (this._binding.isSetConcurrentConsumers()) {
                setTextValue(_concurrentConsumersText, PropTypeUtil.getPropValueString(this._binding.getConcurrentConsumers()));
//                _concurrentConsumersText.setText(Integer.toString(this._binding.getConcurrentConsumers()));
            }
            if (_requestTimeOutText != null && this._binding.isSetRequestTimeout()) {
                setTextValue(_requestTimeOutText, PropTypeUtil.getPropValueString(this._binding.getRequestTimeout()));
//                _requestTimeOutText.setText(Integer.toString(this._binding.getRequestTimeout()));
            } else  if (_requestTimeOutText != null) {
                _requestTimeOutText.setText("");
            }
            if (_maxConcurrentConsumersText != null) {
                if (this._binding.isSetMaxConcurrentConsumers()) {
                    setTextValue(_maxConcurrentConsumersText, PropTypeUtil.getPropValueString(this._binding.getMaxConcurrentConsumers()));
//                    _maxConcurrentConsumersText.setText(Integer.toString(this._binding.getMaxConcurrentConsumers()));
                } else {
                    _maxConcurrentConsumersText.setText("");
                }
            }
            if (this._binding.getConnectionFactory() != null && !this._binding.getConnectionFactory().trim().isEmpty()) {
                _connectionFactoryText.setText(this._binding.getConnectionFactory());
            } else {
                _connectionFactoryText.setText("");
            }
            _transactedButton.setSelection(this._binding.isTransacted());
            if (this._binding.getTransactionManager() != null
                    && !this._binding.getTransactionManager().trim().isEmpty()) {
                _transactionManagerText.setText(this._binding.getTransactionManager());
            } else {
                _transactionManagerText.setText("");
            }
            if (this._binding.getReplyTo() != null && !this._binding.getReplyTo().trim().isEmpty()) {
                _replyToText.setText(this._binding.getReplyTo());
            } else {
                _replyToText.setText("");
            }
            if (this._binding.getSelector() != null && !this._binding.getSelector().trim().isEmpty()) {
                _selectorText.setText(this._binding.getSelector());
            } else {
                _selectorText.setText("");
            }
            if (_binding.getName() == null) {
                _nameText.setText("");
            } else {
                _nameText.setText(_binding.getName());
            }
            
            if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed()) {
                OperationSelectorType opSelector = OperationSelectorUtil.getFirstOperationSelector(this._binding);
                _opSelectorComposite.setBinding(this._binding);
                _opSelectorComposite.setOperation((SwitchYardOperationSelectorType) opSelector);
            }

            if (this._binding.getConnectionFactory() == null || this._binding.getConnectionFactory().trim().isEmpty()) {
                _connectionFactoryText.setText("#ConnectionFactory");
                handleModify(_connectionFactoryText);
            }
            setInUpdate(false);
            validate();
        } else {
            this._binding = null;
        }
        addObservableListeners();
    }

    @Override
    public void setTargetObject(EObject target) {
        super.setTargetObject(target);
        if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed()) {
            _opSelectorComposite.setTargetObject((EObject) target);
        }
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
//            if (!_concurrentConsumersText.getText().trim().isEmpty()) {
//                try {
//                    Integer.valueOf(_concurrentConsumersText.getText().trim());
//                } catch (NumberFormatException nfe) {
//                    setErrorMessage("Concurrent Consumers must be a valid integer.");
//                }
//            }
//            if (!_maxConcurrentConsumersText.getText().trim().isEmpty()) {
//                try {
//                    Integer.valueOf(_maxConcurrentConsumersText.getText().trim());
//                } catch (NumberFormatException nfe) {
//                    setErrorMessage("Maximum Concurrent Consumers must be a valid integer.");
//                }
//            }
//            if (_requestTimeOutText != null && _requestTimeOutText.getText().trim().isEmpty()) {
//                try {
//                    Integer.valueOf(_requestTimeOutText.getText().trim());
//                } catch (NumberFormatException nfe) {
//                    setErrorMessage("Request Timeout must be a valid integer.");
//                }
//            }
        }
        return (getErrorMessage() == null);
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        if (getTargetObject() == null && _binding != null && this._binding.eContainer() != null) {
            setTargetObject(this._binding.eContainer());
        }
        getJmsTabControl(_panel);
        if (getTargetObject() != null && getTargetObject() instanceof Service) {
            if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed()) {
                _opSelectorComposite.setTargetObject((EObject) getTargetObject());
            }
        }
    }

    private Control getJmsTabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);

        _nameText = createLabelAndText(composite, "Name");

        _typeCombo = createLabelAndCombo(composite, "Type", true);
        _typeCombo.add("Queue", QUEUE);
        _typeCombo.add("Topic", TOPIC);
        _typeCombo.select(0);

        _typeNameText = createLabelAndText(composite, "Queue/Topic Name");

        _connectionFactoryText = createLabelAndText(composite, "Connection Factory");
        _connectionFactoryText.setText("#ConnectionFactory");

        _concurrentConsumersText = createLabelAndText(composite, "Concurrent Consumers");
        _concurrentConsumersText.setText("1");
        _maxConcurrentConsumersText = createLabelAndText(composite, "Maximum Concurrent Consumers");
        _maxConcurrentConsumersText.setText("1");
        _replyToText = createLabelAndText(composite, "Reply To");
        _requestTimeOutText = null;
        if (getTargetObject() != null && getTargetObject() instanceof Reference) {
            _requestTimeOutText = createLabelAndText(composite, "Request Timeout");
            _requestTimeOutText.setText("20000");
        }
        _selectorText = createLabelAndText(composite, "Selector");
        _transactionManagerText = createLabelAndText(composite, "Transaction Manager");
        _transactedButton = createCheckbox(composite, "Transacted");

        if (getTargetObject() != null && getTargetObject() instanceof Service) {
            _opSelectorComposite = new OperationSelectorComposite(composite, SWT.NONE);
            _opSelectorComposite.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
            _opSelectorComposite.setLayout(new GridLayout(2, false));
            _opSelectorComposite.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    handleModify(_opSelectorComposite);
                }
             });
        }

        return composite;
    }

    @Override
    public Composite getPanel() {
        return this._panel;
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
                updateFeature(_binding, "concurrentConsumers", _concurrentConsumersText.getText().trim());
            }
        } else if (control.equals(_maxConcurrentConsumersText)) {
            Integer value = null;
            try {
                value = Integer.valueOf(_maxConcurrentConsumersText.getText().trim());
                if (value != null && value.intValue() > 1) {
                    updateFeature(_binding, "maxConcurrentConsumers", value.intValue());
                }
            } catch (NumberFormatException nfe) {
                updateFeature(_binding, "maxConcurrentConsumers", _maxConcurrentConsumersText.getText().trim());
            }
        } else if (control.equals(_replyToText)) {
            String value = null;
            if (!_replyToText.getText().trim().isEmpty()) {
                value = _replyToText.getText().trim();
            }
            updateFeature(_binding, "replyTo", value);
        } else if (control.equals(_selectorText)) {
            String value = null;
            if (!_selectorText.getText().trim().isEmpty()) {
                value = _selectorText.getText().trim();
            }
            updateFeature(_binding, "selector", value);
        } else if (control.equals(_requestTimeOutText)) {
            Integer value = null;
            try {
                value = Integer.valueOf(_requestTimeOutText.getText().trim());
                if (value != null && value.intValue() != 20000) {
                    updateFeature(_binding, "requestTimeout", value.intValue());
                }
            } catch (NumberFormatException nfe) {
                updateFeature(_binding, "requestTimeout", _requestTimeOutText.getText().trim());
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
        } else if (control.equals(_opSelectorComposite)) {
            int opType = _opSelectorComposite.getSelectedOperationSelectorType();
            updateOperationSelectorFeature(opType, _opSelectorComposite.getSelectedOperationSelectorValue());
        } else if (control.equals(_nameText)) {
            super.updateFeature(_binding, "name", _nameText.getText().trim());
        } else {
            super.handleModify(control);
        }
        validate();
        setHasChanged(false);
        setDidSomething(true);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (control.equals(_concurrentConsumersText)) {
                if (this._binding.getConcurrentConsumers() != null) {
                    setTextValue(_concurrentConsumersText, PropTypeUtil.getPropValueString(this._binding.getConcurrentConsumers()));
//                    _concurrentConsumersText.setText(Integer.toString(this._binding.getConcurrentConsumers()));
                } else {
                    _concurrentConsumersText.setText("1");
                }
            } else if (control.equals(_connectionFactoryText)) {
                _connectionFactoryText.setText(this._binding.getConnectionFactory());
            } else if (control.equals(_maxConcurrentConsumersText)) {
                if (this._binding.getMaxConcurrentConsumers() != null) {
                    setTextValue(_maxConcurrentConsumersText, PropTypeUtil.getPropValueString(this._binding.getMaxConcurrentConsumers()));
//                    _maxConcurrentConsumersText.setText(Integer.toString(this._binding.getMaxConcurrentConsumers()));
                } else {
                    _maxConcurrentConsumersText.setText("1");
                }
            } else if (control.equals(_replyToText)) {
                _replyToText.setText(this._binding.getReplyTo());
            } else if (control.equals(_selectorText)) {
                _selectorText.setText(this._binding.getSelector());
            } else if (control.equals(_requestTimeOutText)) {
                if (this._binding.getRequestTimeout() != null) {
                    setTextValue(_requestTimeOutText, PropTypeUtil.getPropValueString(this._binding.getRequestTimeout()));
//                    _maxConcurrentConsumersText.setText(Integer.toString(this._binding.getMaxConcurrentConsumers()));
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
//            } else if (control.equals(_operationSelectionCombo)) {
//                String opName = OperationSelectorUtil.getOperationNameForStaticOperationSelector(this._binding);
//                setTextValue(_operationSelectionCombo, opName);
            } else if (control.equals(_nameText)) {
                _nameText.setText(_binding.getName() == null ? "" : _binding.getName());
            } else {
                super.handleUndo(control);
            }
        }
        setHasChanged(false);
    }

}
