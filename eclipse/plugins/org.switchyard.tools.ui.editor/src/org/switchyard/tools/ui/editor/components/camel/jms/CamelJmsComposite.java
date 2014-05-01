/******************************************************************************* 
 * Copyright (c) 2012-2014 Red Hat, Inc. 
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

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.camel.jms.CamelJmsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.jms.JmsPackage;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;
import org.switchyard.tools.ui.editor.databinding.EscapedPropertyIntegerValidator;
import org.switchyard.tools.ui.editor.databinding.ObservablesUtil;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;
import org.switchyard.tools.ui.editor.databinding.StringEmptyValidator;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorComposite;

/**
 * @author bfitzpat
 * 
 */
public class CamelJmsComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelJmsBindingType _binding = null;
    private Text _nameText;
    private ComboViewer _typeCombo;
    private Text _connectionFactoryText;
    private Text _concurrentConsumersText;
    private Text _maxConcurrentConsumersText;
    private Text _replyToText;
    private Text _requestTimeOutText;
    private Text _transactionManagerText;
    private Text _selectorText;
    private Button _transactedButton;
    private OperationSelectorComposite _opSelectorComposite;
    private WritableValue _bindingValue;
    private org.eclipse.core.databinding.Binding _queueNameBinding;
    private org.eclipse.core.databinding.Binding _topicNameBinding;
    private StackLayout _stackLayout = null;
    private Composite _contentPanel = null;
    private Composite _queuePanel = null;
    private Text _queueNameText;
    private Composite _topicPanel = null;
    private Text _topicNameText;
    private DataBindingContext _context;
    private IObservableValue _queueValue;
    private IObservableValue _topicValue;

    CamelJmsComposite(FormToolkit toolkit) {
        super(toolkit);
    }

    @Override
    public String getTitle() {
        return Messages.title_jmsBindingDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_jmsBindingDetails;
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof CamelJmsBindingType) {
            
            setTargetObject(impl.eContainer());
            _binding = (CamelJmsBindingType) impl;

            _bindingValue.setValue(_binding);
            
            // refresh the operation selector control
            if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed() && getTargetObject() != null) {
                _opSelectorComposite.setTargetObject(getTargetObject());
            }
            if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed()) {
                _opSelectorComposite.setBinding(_binding);
            }

            JMSType initialType = JMSType.QUEUE;
            String queueText = _binding.getQueue();
            String topicText = _binding.getTopic();
            if (queueText != null && topicText == null) {
                initialType = JMSType.QUEUE;
            } else if (topicText != null && queueText == null) {
                initialType = JMSType.TOPIC;
            }
            _typeCombo.setSelection(new StructuredSelection(initialType));

        } else {
            _bindingValue.setValue(null);
        }
    }

    @Override
    public void setTargetObject(EObject target) {
        super.setTargetObject(target);
        if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed()) {
            _opSelectorComposite.setTargetObject((EObject) target);
        }
    }

    @Override
    public void createContents(Composite parent, int style, DataBindingContext context) {
        _context = context;
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
        
        bindControls(context);

        _typeCombo.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                if (event.getSelection().isEmpty()) {
                    return;
                }
                handleSelectorTypeChanged((JMSType) ((IStructuredSelection) event.getSelection())
                        .getFirstElement());
            }
        });

    }

    private Control getJmsTabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);

        _nameText = createLabelAndText(composite, Messages.label_name);

        _typeCombo = createLabelAndComboViewer(composite, Messages.label_type, true);
        _typeCombo.setContentProvider(ArrayContentProvider.getInstance());
        _typeCombo.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                if (element instanceof JMSType) {
                    return ((JMSType) element).getLabel();
                }
                return super.getText(element);
            }
        });
        _typeCombo.setInput(JMSType.values());
        
        getToolkit().createLabel(composite, Messages.label_queueTopicName);
        
        _contentPanel = new Composite(composite, SWT.NONE);
        _stackLayout = new StackLayout();
        _contentPanel.setLayout(_stackLayout);
        GridData gd = new GridData(SWT.FILL, SWT.FILL, true, false);
        gd.horizontalIndent = -5;
        gd.verticalIndent = -5;
        _contentPanel.setLayoutData(gd);

        _queuePanel = new Composite(_contentPanel, SWT.NONE);
        _queueNameText = createLabelAndText(_queuePanel, null);
        _queuePanel.setLayout(new GridLayout(2, false));
        _queueNameText.setLayoutData(new GridData(SWT.FILL, SWT.NULL, true, false));
        
        _topicPanel = new Composite(_contentPanel, SWT.NONE);
        _topicNameText = createLabelAndText(_topicPanel, null);
        _topicPanel.setLayout(new GridLayout(2, false));
        _topicNameText.setLayoutData(new GridData(SWT.FILL, SWT.NULL, true, false));

        _connectionFactoryText = createLabelAndText(composite, Messages.label_connectionFactory);
        _connectionFactoryText.setText("#ConnectionFactory"); //$NON-NLS-1$

        _concurrentConsumersText = createLabelAndText(composite, Messages.label_concurrentConsumers);
        _concurrentConsumersText.setText("1"); //$NON-NLS-1$
        _maxConcurrentConsumersText = createLabelAndText(composite, Messages.label_maximumConcurrentConsumers);
        _maxConcurrentConsumersText.setText("1"); //$NON-NLS-1$
        _replyToText = createLabelAndText(composite, Messages.label_replyTo);
        _requestTimeOutText = null;
        if (getTargetObject() != null && getTargetObject() instanceof Reference) {
            _requestTimeOutText = createLabelAndText(composite, Messages.label_requestTimeout);
            _requestTimeOutText.setText("20000"); //$NON-NLS-1$
        }
        _selectorText = createLabelAndText(composite, Messages.label_selector);
        _transactionManagerText = createLabelAndText(composite, Messages.label_transactionManager);
        _transactedButton = createCheckbox(composite, Messages.label_transacted);

        if (getTargetObject() != null && getTargetObject() instanceof Service) {
            _opSelectorComposite = new OperationSelectorComposite(composite, SWT.NONE, this);
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

    private void handleSelectorTypeChanged(final JMSType typeToSelect) {
        _queueNameText.setEnabled(false);
        _topicNameText.setEnabled(false);

        switch (typeToSelect) {
        case QUEUE:
            _queueNameText.setEnabled(true);
            if (_topicValue.getValue() != null) {
                _topicValue.setValue(null);
            }
            _stackLayout.topControl = _queuePanel;
            _context.removeBinding(_topicNameBinding);
            _context.addBinding(_queueNameBinding);
            break;
        case TOPIC:
            _topicNameText.setEnabled(true);
            if (_queueValue.getValue() != null) {
                _queueValue.setValue(null);
            }
            _stackLayout.topControl = _topicPanel;
            _context.removeBinding(_queueNameBinding);
            _context.addBinding(_topicNameBinding);
            break;
        }
        _contentPanel.layout();
    }

    @Override
    public Composite getPanel() {
        return this._panel;
    }

    protected void handleModify(final Control control) {
        // at this point, this is the only control we can't do with strict
        // databinding
        if (control.equals(_opSelectorComposite)) {
            fireChangedEvent(_opSelectorComposite);
        }
        setHasChanged(false);
        setDidSomething(true);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            super.handleUndo(control);
        }
    }

    private void bindControls(final DataBindingContext context) {
        final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(getTargetObject());
        final Realm realm = SWTObservables.getRealm(_nameText.getDisplay());

        _bindingValue = new WritableValue(realm, null, CamelJmsBindingType.class);

        org.eclipse.core.databinding.Binding binding = context.bindValue(
                SWTObservables.observeText(_nameText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue,
                        ScaPackage.eINSTANCE.getBinding_Name()),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyValidator(
                                "JMS binding name should not be empty", Status.WARNING)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        /*
         * we also want to bind the name field to the binding name. note that
         * the model to target updater is configured to NEVER update. we want
         * the camel binding name to be the definitive source for this field.
         */
        binding = context.bindValue(SWTObservables.observeText(_nameText, new int[] {SWT.Modify }), ObservablesUtil
                .observeDetailValue(domain, _bindingValue,
                        ScaPackage.eINSTANCE.getBinding_Name()),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyValidator(
                                "JMS binding name should not be empty", Status.WARNING)), new UpdateValueStrategy(
                        UpdateValueStrategy.POLICY_NEVER));
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
        
        _queueValue = ObservablesUtil.observeDetailValue(domain, _bindingValue,
                JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__QUEUE);
        
        _queueNameBinding = context
                .bindValue(
                        SWTObservables.observeText(_queueNameText , new int[] {SWT.Modify }),
                        _queueValue,
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                            .setAfterConvertValidator(new StringEmptyValidator(
                                "Queue may not be empty.")), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_queueNameBinding), SWT.TOP | SWT.LEFT);

        _topicValue = ObservablesUtil.observeDetailValue(domain, _bindingValue,
                JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__TOPIC);
        _topicNameBinding = context
                .bindValue(
                        SWTObservables.observeText(_topicNameText , new int[] {SWT.Modify }),
                        _topicValue,
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                            .setAfterConvertValidator(new StringEmptyValidator(
                                "Topic may not be empty.")), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_topicNameBinding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_connectionFactoryText , new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__CONNECTION_FACTORY),
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                            .setAfterConvertValidator(new StringEmptyValidator(
                                Messages.error_emptyConnectionFactory)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_concurrentConsumersText , new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__CONCURRENT_CONSUMERS),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null,
                                UpdateValueStrategy.POLICY_CONVERT).setAfterConvertValidator(
                                        new EscapedPropertyIntegerValidator("Concurrent Consumers must be a valid numeric value or follow the pattern for escaped properties (i.e. '${propName}')."))
                                        , null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_maxConcurrentConsumersText , new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__MAX_CONCURRENT_CONSUMERS),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null,
                                UpdateValueStrategy.POLICY_CONVERT).setAfterConvertValidator(
                                        new EscapedPropertyIntegerValidator("Max Concurrent Consumers must be a valid numeric value or follow the pattern for escaped properties (i.e. '${propName}')."))
                                        , null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_replyToText , new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__REPLY_TO),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                "", UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        if (_requestTimeOutText != null && !_requestTimeOutText.isDisposed()) {
            binding = context
                    .bindValue(
                            SWTObservables.observeText(_requestTimeOutText , new int[] {SWT.Modify }),
                            ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                    JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__REQUEST_TIMEOUT),
                            new EMFUpdateValueStrategyNullForEmptyString(
                                    null,
                                    UpdateValueStrategy.POLICY_CONVERT).setAfterConvertValidator(
                                            new EscapedPropertyIntegerValidator("Request Timeout must be a valid numeric value or follow the pattern for escaped properties (i.e. '${propName}')."))
                                            , null);
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
        }

        binding = context
                .bindValue(
                        SWTObservables.observeText(_transactionManagerText , new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__TRANSACTION_MANAGER),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                "", UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeSelection(_transactedButton),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__TRANSACTED),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_selectorText , new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                JmsPackage.Literals.CAMEL_JMS_BINDING_TYPE__SELECTOR),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                "", UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        if (_opSelectorComposite != null) {
            _opSelectorComposite.bindControls(domain, context);
        }

    }

    private enum JMSType {
        QUEUE(Messages.label_queue) {},
        TOPIC(Messages.label_topic) {};

        private final String _label;

        private JMSType(String label) {
            _label = label;
        }

        /**
         * @return the display label for this JMS type.
         */
        public String getLabel() {
            return _label;
        }


    }

    /* (non-Javadoc)
     * @see org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite#dispose()
     */
    @Override
    public void dispose() {
        _bindingValue.dispose();
        _queueValue.dispose();
        _topicValue.dispose();
        _topicNameBinding.dispose();
        _queueNameBinding.dispose();
        super.dispose();
    }
}
