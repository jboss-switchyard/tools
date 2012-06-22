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
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
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
import org.switchyard.tools.models.switchyard1_0.camel.CamelJmsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelOperationSelectorType;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.util.InterfaceOpsUtil;

/**
 * @author bfitzpat
 * 
 */
public class CamelJmsComposite extends AbstractSwitchyardComposite implements IBindingComposite {

    private final static int QUEUE = 0;
    private final static int TOPIC = 1;
    
    private Composite _panel;
    private CamelJmsBindingType _binding = null;
    private boolean _inUpdate = false;
    private Combo _operationSelectionCombo;
    private Object _targetObj = null;
    private Combo _typeCombo;
    private Text _typeNameText;
    private Text _connectionFactoryText;
    private Text _concurrentConsumersText;
    private Text _maxConcurrentConsumersText;
    private Text _replyToText;
    private Text _requestTimeOutText;
    private Text _transactionManagerText;
    private Button _transactedButton;

    @Override
    public Binding getBinding() {
        return this._binding;
    }

    @Override
    public void setBinding(Binding impl) {
        if (impl instanceof CamelJmsBindingType) {
            this._binding = (CamelJmsBindingType) impl;
            _inUpdate = true;
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
            if (_requestTimeOutText != null && this._binding.getRequestTimeout() > 0 && this._binding.getRequestTimeout() != 2000) {
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
            if (this._binding.getTransactionManager() != null && !this._binding.getTransactionManager().trim().isEmpty()) {
                _transactionManagerText.setText(this._binding.getTransactionManager());
            }
            if (this._binding.getReplyTo() != null && !this._binding.getReplyTo().trim().isEmpty()) {
                _replyToText.setText(this._binding.getReplyTo());
            }
            populateOperationCombo();
            if (this._binding.getCamelOperationSelector() != null) {
                CamelOperationSelectorType camelOpSelector = (CamelOperationSelectorType) this._binding
                        .getCamelOperationSelector();
                _operationSelectionCombo.setText(camelOpSelector.getOperationName());
            }
            if (this._binding.getConnectionFactory() == null || this._binding.getConnectionFactory().trim().isEmpty()) {
                _binding.setConnectionFactory("#ConnectionFactory");
            }
            _inUpdate = false;
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
            if (_typeNameText.getText().trim().isEmpty()) {
                setErrorMessage("Name may not be empty.");
            } else if (_connectionFactoryText.getText().trim().isEmpty()) {
                setErrorMessage("Connection Factory may not be empty.");
            } else if (!_concurrentConsumersText.getText().trim().isEmpty()) {
                try {
                    Integer.parseInt(_concurrentConsumersText.getText().trim());
                } catch (NumberFormatException nfe) {
                    setErrorMessage("Concurrent Consumers must be a valid integer.");
                }
            } else if (!_maxConcurrentConsumersText.getText().trim().isEmpty()) {
                try {
                    Integer.parseInt(_maxConcurrentConsumersText.getText().trim());
                } catch (NumberFormatException nfe) {
                    setErrorMessage("Maximum Concurrent Consumers must be a valid integer.");
                }
            } else if (_requestTimeOutText != null && _requestTimeOutText.getText().trim().isEmpty()) {
                try {
                    Integer.parseInt(_requestTimeOutText.getText().trim());
                } catch (NumberFormatException nfe) {
                    setErrorMessage("Request Timeout must be a valid integer.");
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
        if (_targetObj == null && this._binding.eContainer() != null) {
            _targetObj = this._binding.eContainer();
        }
        if (_targetObj != null && _targetObj instanceof Service) {
            one.setText("JMS Consumer");
        } else if (_targetObj != null && _targetObj instanceof Reference) {
            one.setText("JMS Producer");
        }
        one.setControl(getJmsTabControl(tabFolder));
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
        _replyToText = createLabelAndText(jmsGroup,  "Reply To");
        _requestTimeOutText = null;        
        if (_targetObj != null && _targetObj instanceof Reference) {
            _requestTimeOutText = createLabelAndText(jmsGroup, "Request Timeout");
            _requestTimeOutText.setText("20000");
        }
        _transactionManagerText = createLabelAndText(jmsGroup, "Transaction Manager");
        _transactedButton = createCheckbox(jmsGroup,  "Transacted");
        
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

    @Override
    public void widgetSelected(SelectionEvent e) {
        if (!_inUpdate) {
            validate();
            handleModify((Control) e.getSource());
            fireChangedEvent((Control) e.getSource());
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

    private class BindingRecordingCommand extends RecordingCommand {

        private CamelJmsBindingType _innerBinding;
        private String _featureId;
        private Object _value;

        public BindingRecordingCommand(TransactionalEditingDomain domain, CamelJmsBindingType binding,
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
        if (control.equals(_typeCombo) || control.equals(_typeNameText)) {
            final boolean isQueue = (_typeCombo.getSelectionIndex() == QUEUE) ? true : false; 
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        if (isQueue) {
                            _binding.setTopic(null);
                            _binding.setQueue(_typeNameText.getText().trim());
                        } else {
                            _binding.setQueue(null);
                            _binding.setTopic(_typeNameText.getText().trim());
                        }
                    }
                });
            } else {
                if (isQueue) {
                    _binding.setTopic(null);
                    _binding.setQueue(_typeNameText.getText().trim());
                } else {
                    _binding.setQueue(null);
                    _binding.setTopic(_typeNameText.getText().trim());
                }
            }
        } else if (control.equals(_connectionFactoryText)) {
            String value = null;
            if (!_connectionFactoryText.getText().trim().isEmpty()) {
                value = _connectionFactoryText.getText().trim();
            }
            if (domain != null) {
                BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "connectionFactory",
                        value);
                domain.getCommandStack().execute(command);
            } else {
                _binding.setConnectionFactory(value);
            }
        } else if (control.equals(_concurrentConsumersText)) {
            Integer value = null;
            try {
                value = Integer.decode(_concurrentConsumersText.getText().trim());
            } catch (NumberFormatException nfe) {
                return;
            }
            if (value != null && value.intValue() > 1) {
                if (domain != null) {
                    BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "concurrentConsumers",
                            value.intValue());
                    domain.getCommandStack().execute(command);
                } else {
                    _binding.setConcurrentConsumers(value.intValue());
                }
            }
        } else if (control.equals(_maxConcurrentConsumersText)) {
            Integer value = null;
            try {
                value = Integer.decode(_maxConcurrentConsumersText.getText().trim());
            } catch (NumberFormatException nfe) {
                return;
            }
            if (value != null && value.intValue() > 1) {
                if (domain != null) {
                    BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "maxConcurrentConsumers",
                            value.intValue());
                    domain.getCommandStack().execute(command);
                } else {
                    _binding.setMaxConcurrentConsumers(value.intValue());
                }
            }
        } else if (control.equals(_replyToText)) {
            String value = null;
            if (!_replyToText.getText().trim().isEmpty()) {
                value = _replyToText.getText().trim();
            }
            if (domain != null) {
                BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "replyTo",
                        value);
                domain.getCommandStack().execute(command);
            } else {
                _binding.setReplyTo(value);
            }
        } else if (control.equals(_requestTimeOutText)) {
            Integer value = null;
            try {
                value = Integer.decode(_requestTimeOutText.getText().trim());
            } catch (NumberFormatException nfe) {
                return;
            }
            if (value != null && value.intValue() != 20000) {
                if (domain != null) {
                    BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "requestTimeout",
                            value.intValue());
                    domain.getCommandStack().execute(command);
                } else {
                    _binding.setRequestTimeout(value.intValue());
                }
            }
        } else if (control.equals(_transactedButton)) {
            boolean value = _transactedButton.getSelection();
            if (domain != null) {
                BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "transacted",
                        value);
                domain.getCommandStack().execute(command);
            } else {
                _binding.setTransacted(value);
            }
        } else if (control.equals(_transactionManagerText)) {
            String value = null;
            if (!_transactionManagerText.getText().trim().isEmpty()) {
                value = _transactionManagerText.getText().trim();
            }
            if (domain != null) {
                BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "transactionManager",
                        value);
                domain.getCommandStack().execute(command);
            } else {
                _binding.setTransactionManager(value);
            }
        } else if (control.equals(_operationSelectionCombo)) {
            if (_operationSelectionCombo.getSelectionIndex() > -1) {
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
        }
    }

    /**
     * @param target Passed in what we're dropping on
     */
    public void setTargetObject(Object target) {
        this._targetObj = target;
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource().equals(_typeCombo)) {
            //ignore it, is handled by handleModify
            return;
        }
        if (_binding != null && !_inUpdate && hasChanged()) {
            validate();
            handleModify((Control) e.getSource());
            fireChangedEvent((Control) e.getSource());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.keyCode == SWT.ESC) {
            // cancel out and return to original value
            _inUpdate = true;
            if (_binding != null) {
                Control control = (Control) e.getSource();
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
                    if (this._binding.getCamelOperationSelector() != null) {
                        populateOperationCombo();
                        CamelOperationSelectorType camelOpSelector = (CamelOperationSelectorType) this._binding
                                .getCamelOperationSelector();
                        _operationSelectionCombo.setText(camelOpSelector.getOperationName());
                    }
                }
            }
            _inUpdate = false;
        } else if (e.keyCode == SWT.CR) {
            // accept change
            if (_binding != null && !_inUpdate) {
                validate();
                handleModify((Control) e.getSource());
                fireChangedEvent((Control) e.getSource());
            }
        }
    }
}
