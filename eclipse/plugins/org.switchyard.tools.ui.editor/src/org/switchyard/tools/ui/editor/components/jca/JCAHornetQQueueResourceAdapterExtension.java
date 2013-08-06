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

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection;
import org.switchyard.tools.models.switchyard1_0.jca.Property;
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;


/**
 * @author bfitzpat
 *
 */
public class JCAHornetQQueueResourceAdapterExtension extends AbstractResourceAdapterExtension {
    
    @Override
    public boolean isDefault() {
        return true;
    }

    private JCAHornetQQueueResourceAdapterComposite _composite;

    /**
     * Constructor.
     */
    public JCAHornetQQueueResourceAdapterExtension() {
    }

    @Override
    public Property[] getPropertyList() {
        ArrayList<Property> list = new ArrayList<Property>();
        list.add(createNewProperty("destination", "queue/YourQueueName"));
        list.add(createNewProperty("destinationType", "javax.jms.Queue"));
        return list.toArray(new Property[list.size()]);
    }

    @Override
    public String getDisplayName() {
        return "HornetQ Queue Resource Adapter";
    }

    @Override
    public AbstractSwitchyardComposite getComposite(Composite parent) {
        if (_composite == null) {
            _composite = new JCAHornetQQueueResourceAdapterComposite();
        }
        return _composite;
    }

    /**
     * @author bfitzpat
     *
     */
    public class JCAHornetQQueueResourceAdapterComposite extends AbstractJCABindingComposite {

        private Text _messageSelectorText;
        private JCABinding _binding;
        private Composite _panel;
        private Text _destinationText;
        private Combo _acknowledgeModeCombo;

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
                setErrorMessage("Destination topic must be specified.");
                return false;
            }
            return true;
        }

        @Override
        public void createContents(Composite parent, int style) {
            _panel = new Composite(parent, style);
            _panel.setLayout(new GridLayout(2, false));
            _destinationText = createLabelAndText(_panel, "Destination (Queue)");
            _messageSelectorText = createLabelAndText(_panel, "Message Selector");
            _acknowledgeModeCombo = createLabelAndCombo(_panel, "Acknowledge Mode", true);
            _acknowledgeModeCombo.add("Auto-acknowledge");
            _acknowledgeModeCombo.add("Dups-ok-acknowledge");
            _acknowledgeModeCombo.setText("Auto-acknowledge");
        }

        @Override
        protected void handleModify(Control control) {
            if (control.equals(_destinationText)) {
                updateInboundActivationProperty("destination", _destinationText.getText().trim());
            } else if (control.equals(_messageSelectorText)) {
                updateInboundActivationProperty("messageSelector", _messageSelectorText.getText().trim());
            } else if (control.equals(_acknowledgeModeCombo)) {
                updateInboundActivationProperty("acknowledgeMode", _acknowledgeModeCombo.getText().trim());
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
                getActivationPropertyForControl(inbound.getActivationSpec(), "destination", this._destinationText);
                getActivationPropertyForControl(inbound.getActivationSpec(), "messageSelector", this._messageSelectorText);
                getActivationPropertyForControl(inbound.getActivationSpec(), "acknowledgeMode", this._acknowledgeModeCombo);
            }
            validate();
            addObservableListeners(true);
        }
    }

    @Override
    public String getResourceAdapter() {
        return "hornetq-ra.rar";
    }

    @Override
    public String getDestinationType() {
        return "javax.jms.Queue";
    }
}
