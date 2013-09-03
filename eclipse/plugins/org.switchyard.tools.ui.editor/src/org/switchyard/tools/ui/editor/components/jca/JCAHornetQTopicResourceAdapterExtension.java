/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
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
package org.switchyard.tools.ui.editor.components.jca;

import java.util.ArrayList;
import java.util.UUID;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection;
import org.switchyard.tools.models.switchyard1_0.jca.Property;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;


/**
 * @author bfitzpat
 *
 */
public class JCAHornetQTopicResourceAdapterExtension extends AbstractResourceAdapterExtension {

    private JCAHornetQTopicResourceAdapterComposite _composite;

    /**
     * Constructor.
     */
    public JCAHornetQTopicResourceAdapterExtension() {
    }

    @Override
    public Property[] getPropertyList() {
        ArrayList<Property> list = new ArrayList<Property>();
        list.add(createNewProperty("destinationType", "javax.jms.Topic")); //$NON-NLS-1$ //$NON-NLS-2$
        list.add(createNewProperty("subscriptionDurability", "NonDurable")); //$NON-NLS-1$ //$NON-NLS-2$
        list.add(createNewProperty("destination", "topic/YourTopicName")); //$NON-NLS-1$ //$NON-NLS-2$
        return list.toArray(new Property[list.size()]);
    }

    @Override
    public String getDisplayName() {
        return Messages.label_hornetQTopicResourceAdapter;
    }

    @Override
    public AbstractSwitchyardComposite getComposite(Composite parent) {
        if (_composite == null) {
            _composite = new JCAHornetQTopicResourceAdapterComposite();
        }
        return _composite;
    }

    /**
     * @author bfitzpat
     *
     */
    public class JCAHornetQTopicResourceAdapterComposite extends AbstractJCABindingComposite {

        private Text _messageSelectorText;
        private JCABinding _binding;
        private Composite _panel;
        private Combo _acknowledgeModeCombo;
        private Button _subscriptionDurabilityCheckbox;
        private Text _clientIdText;
        private Text _subscriptionNameText;
        private Text _destinationText;

        @Override
        public String getTitle() {
            return getDisplayName();
        }

        @Override
        public String getDescription() {
            return getTitle();
        }

        @Override
        protected boolean validate() {
            if (!_destinationText.isDisposed() && _destinationText.getText().trim().isEmpty()) {
                setErrorMessage(Messages.error_emptyTopic);
                return false;
            } else if (_subscriptionDurabilityCheckbox.getSelection() && _clientIdText.getText().trim().isEmpty() && _subscriptionNameText.getText().trim().isEmpty()) {
                setErrorMessage(Messages.error_emptyClientIdAndSubscriptionName);
                return false;
            }
            return true;
        }

        @Override
        public void createContents(Composite parent, int style) {
            _panel = new Composite(parent, style);
            _panel.setLayout(new GridLayout(2, false));
            _destinationText = createLabelAndText(_panel, Messages.label_destinationTopic);
            _messageSelectorText = createLabelAndText(_panel, Messages.label_messageSelector);
            _acknowledgeModeCombo = createLabelAndCombo(_panel, Messages.label_acknowledgeMode, true);
            _acknowledgeModeCombo.add("Auto-acknowledge"); //$NON-NLS-1$
            _acknowledgeModeCombo.add("Dups-ok-acknowledge"); //$NON-NLS-1$
            _acknowledgeModeCombo.setText("Auto-acknowledge"); //$NON-NLS-1$
            _subscriptionDurabilityCheckbox = createCheckbox(_panel, Messages.label_subscriptionDurability);
            _clientIdText = createLabelAndText(_panel, Messages.label_clientId);
            _subscriptionNameText = createLabelAndText(_panel, Messages.label_subscriptionName);
            
            _subscriptionDurabilityCheckbox.addSelectionListener(new SelectionListener(){

                @Override
                public void widgetSelected(SelectionEvent e) {
                    _clientIdText.setEnabled(_subscriptionDurabilityCheckbox.getSelection());
                    _subscriptionNameText.setEnabled(_subscriptionDurabilityCheckbox.getSelection());
                    if (_subscriptionDurabilityCheckbox.getSelection()) {
                        _clientIdText.setText(UUID.randomUUID().toString());
                        updateInboundActivationProperty("clientId", _clientIdText.getText().trim()); //$NON-NLS-1$
                        _subscriptionNameText.setText(UUID.randomUUID().toString());
                        updateInboundActivationProperty("subscriptionName", _subscriptionNameText.getText().trim()); //$NON-NLS-1$
                    } else {
                        _clientIdText.setText(""); //$NON-NLS-1$
                        _subscriptionNameText.setText(""); //$NON-NLS-1$
                        updateInboundActivationProperty("clientId", null); //$NON-NLS-1$
                        updateInboundActivationProperty("subscriptionName", null); //$NON-NLS-1$
                    }
                }

                @Override
                public void widgetDefaultSelected(SelectionEvent e) {
                    widgetSelected(e);
                }
             });
            
            _clientIdText.setEnabled(_subscriptionDurabilityCheckbox.getSelection());
            _subscriptionNameText.setEnabled(_subscriptionDurabilityCheckbox.getSelection());
        }

        @Override
        protected void handleModify(Control control) {
            if (control.equals(_destinationText)) {
                updateInboundActivationProperty("destination", _destinationText.getText().trim()); //$NON-NLS-1$
            } else if (control.equals(_messageSelectorText)) {
                updateInboundActivationProperty("messageSelector", _messageSelectorText.getText().trim()); //$NON-NLS-1$
            } else if (control.equals(_clientIdText)) {
                updateInboundActivationProperty("clientId", _clientIdText.getText().trim()); //$NON-NLS-1$
            } else if (control.equals(_subscriptionNameText)) {
                updateInboundActivationProperty("subscriptionName", _subscriptionNameText.getText().trim()); //$NON-NLS-1$
            } else if (control.equals(_subscriptionDurabilityCheckbox)) {
                if (_subscriptionDurabilityCheckbox.getSelection()) {
                    updateInboundActivationProperty("subscriptionDurability", "Durable"); //$NON-NLS-1$ //$NON-NLS-2$
                } else {
                    updateInboundActivationProperty("subscriptionDurability", "NonDurable"); //$NON-NLS-1$ //$NON-NLS-2$
                }
            } else if (control.equals(_acknowledgeModeCombo)) {
                updateInboundActivationProperty("acknowledgeMode", _acknowledgeModeCombo.getText().trim()); //$NON-NLS-1$
            } else {
                super.handleModify(control);
            }
        }

        @Override
        public Composite getPanel() {
            return _panel;
        }
        
        @Override
        public void setBinding(Binding impl) {
            super.setBinding(impl);
            this._binding = (JCABinding) impl;
            JCAInboundConnection inbound = this._binding.getInboundConnection();
            if (inbound.getResourceAdapter() != null) {
                getActivationPropertyForControl(inbound.getActivationSpec(), "destination", this._destinationText); //$NON-NLS-1$
                getActivationPropertyForControl(inbound.getActivationSpec(), "messageSelector", this._messageSelectorText); //$NON-NLS-1$
                getActivationPropertyForControl(inbound.getActivationSpec(), "clientId", this._clientIdText); //$NON-NLS-1$
                getActivationPropertyForControl(inbound.getActivationSpec(), "subscriptionName", this._subscriptionNameText); //$NON-NLS-1$
                getActivationPropertyForControl(inbound.getActivationSpec(), "acknowledgeMode", this._acknowledgeModeCombo); //$NON-NLS-1$

                String subscriptionDurability =
                        getResourceAdapterPropertyValue(inbound.getActivationSpec(), "subscriptionDurability"); //$NON-NLS-1$
                if (subscriptionDurability != null && !this._subscriptionDurabilityCheckbox.isDisposed()) {
                    _subscriptionDurabilityCheckbox.setSelection(subscriptionDurability.equals("Durable")); //$NON-NLS-1$
                    _clientIdText.setEnabled(_subscriptionDurabilityCheckbox.getSelection());
                    _subscriptionNameText.setEnabled(_subscriptionDurabilityCheckbox.getSelection());
                }

            }
            validate();
            addObservableListeners(true);
        }
    }

    @Override
    public String getResourceAdapter() {
        return "hornetq-ra.rar"; //$NON-NLS-1$
    }

    @Override
    public String getDestinationType() {
        return "javax.jms.Topic"; //$NON-NLS-1$
    }
}
