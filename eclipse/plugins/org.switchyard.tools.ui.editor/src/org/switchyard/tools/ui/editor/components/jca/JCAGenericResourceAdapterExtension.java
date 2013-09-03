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

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;


/**
 * @author bfitzpat
 *
 */
public class JCAGenericResourceAdapterExtension extends AbstractResourceAdapterExtension {

    private JCACustomResourceAdapterComposite _composite;

    @Override
    public AbstractSwitchyardComposite getComposite(Composite parent) {
        if (_composite == null) {
            _composite = new JCACustomResourceAdapterComposite();
        }
        return _composite;
    }

    /**
     * Constructor.
     */
    public JCAGenericResourceAdapterExtension() {
    }

    @Override
    public String getDisplayName() {
        return Messages.label_genericResourceAdapter;
    }

    /**
     * @author bfitzpat
     *
     */
    public class JCACustomResourceAdapterComposite extends AbstractJCABindingComposite {

        private Text _resourceAdapterText;
        private JCABinding _binding;
        private Composite _panel;

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
            if (_resourceAdapterText.getText().trim().isEmpty()) {
                setErrorMessage(Messages.error_emptyResourceAdapterName);
                return false;
            } 
            return true;
        }

        @Override
        public void createContents(Composite parent, int style) {
            _panel = new Composite(parent, style);
            _panel.setLayout(new GridLayout(2, false));
            _resourceAdapterText = createLabelAndText(_panel, Messages.label_resourceAdapterArchive);
        }

        @Override
        protected void handleModify(Control control) {
            if (control.equals(_resourceAdapterText)) {
                updateInboundConnectionResourceAdapterFeature("name", _resourceAdapterText.getText().trim()); //$NON-NLS-1$
            } else {
                super.handleModify(control);
            }
            fireChangedEvent(control);
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
            if (inbound.getResourceAdapter() != null && inbound.getResourceAdapter().getName() != null) {
                this._resourceAdapterText.setText(inbound.getResourceAdapter().getName());
            } else {
                this._resourceAdapterText.setText(""); //$NON-NLS-1$
            }
            validate();
            addObservableListeners(true);
        }

        /**
         * @param binding incoming binding
         */
        public void setJCABinding(JCABinding binding) {
        }
    }

}
