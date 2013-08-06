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
package org.switchyard.tools.ui.editor.components.jca;

import java.util.ArrayList;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.jca.BatchCommit;
import org.switchyard.tools.models.switchyard1_0.jca.Endpoint;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.util.PropTypeUtil;

/**
 * @author bfitzpat
 * 
 */
public class JCAInteractionDetailsComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private JCABinding _binding = null;
//    private Combo _resourceAdapterText;
    private Combo _endpointMappingTypeCombo;
    private Button _transactedButton;
    private Group _batchGroup;
    private Button _batchEnabledCheckbox;
    private Text _batchSizeText;
    private Text _batchTimeoutText;

    private enum ENDPOINT_MAPPING_TYPE {
        JMSENDPOINT, CCIENDPOINT
    }

    @Override
    public String getTitle() {
        return "Interaction Details";
    }

    @Override
    public String getDescription() {
        return "Specify pertinent interaction details for your JCA Binding.";
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof JCABinding) {
            this._binding = (JCABinding) impl;
            setInUpdate(true);
            if (this._binding.getInboundConnection() != null) {
                if (_binding.getInboundInteraction() != null) {
                    JCAInboundInteraction interaction = _binding.getInboundInteraction();
                    if (interaction.getEndpoint() != null) {
                        String className = interaction.getEndpoint().getType();
                        className = className.substring(className.lastIndexOf('.') + 1);
                        if (className.equalsIgnoreCase("jmsendpoint")) {
                            _endpointMappingTypeCombo.select(ENDPOINT_MAPPING_TYPE.JMSENDPOINT.ordinal());
                        } else if (className.equalsIgnoreCase("cciendpoint")) {
                            _endpointMappingTypeCombo.select(ENDPOINT_MAPPING_TYPE.CCIENDPOINT.ordinal());
                        }
                    }
                    if (interaction.getBatchCommit() != null) {
                        _batchEnabledCheckbox.setSelection(true);
                        setTextValue(_batchSizeText, PropTypeUtil.getPropValueString(this._binding.getInboundInteraction().getBatchCommit().getBatchSize()));
                        setTextValue(_batchTimeoutText, PropTypeUtil.getPropValueString(this._binding.getInboundInteraction().getBatchCommit().getBatchTimeout()));
                    } else {
                        _batchEnabledCheckbox.setSelection(false);
                    }
                    if (interaction.isTransacted()) {
                        _transactedButton.setSelection(interaction.isTransacted());
                    }
                }
            }
            setInUpdate(false);
            validate();
        } else {
            this._binding = null;
        }
        addObservableListeners();
    }

    @Override
    protected boolean validate() {
        setErrorMessage(null);
        if (getBinding() != null) {
            if (!_endpointMappingTypeCombo.isDisposed() && _endpointMappingTypeCombo.getSelectionIndex() == -1) {
                setErrorMessage("You must select an endpoint mapping type.");
            }
        }
        return (getErrorMessage() == null);
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getJCAInteractionDetailsTabControl(_panel);
    }
    
    private Control getJCAInteractionDetailsTabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(1, false);
        composite.setLayout(gl);
        
        _endpointMappingTypeCombo = createLabelAndCombo(composite, "Endpoint Mapping Type", true);
        _endpointMappingTypeCombo.add("JMS Endpoint", ENDPOINT_MAPPING_TYPE.JMSENDPOINT.ordinal());
        _endpointMappingTypeCombo.setData("JMS Endpoint", ENDPOINT_MAPPING_TYPE.JMSENDPOINT);
        _endpointMappingTypeCombo.add("CCI Endpoint", ENDPOINT_MAPPING_TYPE.CCIENDPOINT.ordinal());
        _endpointMappingTypeCombo.setData("CCI Endpoint", ENDPOINT_MAPPING_TYPE.CCIENDPOINT);

        _transactedButton = createCheckbox(composite, "Transacted");
        
        _batchGroup = new Group(composite, SWT.NONE);
        GridData bgGridData = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
        _batchGroup.setLayoutData(bgGridData);
        _batchGroup.setLayout(new GridLayout(2, false));
        _batchGroup.setText("Batch Commit Options");
        
        _batchEnabledCheckbox = createCheckbox(_batchGroup, "Enable Batch Commit");
        _batchSizeText = createLabelAndText(_batchGroup, "Batch Size");
        _batchTimeoutText = createLabelAndText(_batchGroup, "Batch Timeout (in MS)");
        _batchEnabledCheckbox.addSelectionListener(new SelectionListener(){

            @Override
            public void widgetDefaultSelected(SelectionEvent arg0) {
            }

            @Override
            public void widgetSelected(SelectionEvent e) {
                _batchSizeText.setEnabled(_batchEnabledCheckbox.getSelection());
                _batchTimeoutText.setEnabled(_batchEnabledCheckbox.getSelection());
                handleModify(_batchEnabledCheckbox);
            }
        });

        return composite;
    }

    @Override
    public Composite getPanel() {
        return this._panel;
    }

    class InboundInteractionOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getInboundInteraction() == null) {
                JCAInboundInteraction interaction = JcaFactory.eINSTANCE.createJCAInboundInteraction();
                setFeatureValue(_binding, "inboundInteraction", interaction);
            }
        }
    }
    
    class BatchCommitOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            JCAInboundInteraction interaction = _binding.getInboundInteraction();
            if (interaction != null) {
                BatchCommit batchCommit = interaction.getBatchCommit();
                if (batchCommit == null) {
                    batchCommit = JcaFactory.eINSTANCE.createBatchCommit();
                    setFeatureValue(_binding.getInboundInteraction(), "batchCommit", batchCommit);
                }
            }
        }
    }

    class RemoveBatchCommitOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            JCAInboundInteraction interaction = _binding.getInboundInteraction();
            if (interaction != null) {
                BatchCommit batchCommit = interaction.getBatchCommit();
                if (batchCommit != null) {
                    setFeatureValue(_binding.getInboundInteraction(), "batchCommit", null);
                }
            }
        }
    }

    class EndpointOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            JCAInboundInteraction interaction = _binding.getInboundInteraction();
            ENDPOINT_MAPPING_TYPE type = (ENDPOINT_MAPPING_TYPE) _endpointMappingTypeCombo
                    .getData(_endpointMappingTypeCombo.getText());
            String listener = null;
            // String inboundOpName = null;
            String endpointClass = null;
            boolean foundEndpoint = true;
            switch (type) {
            case JMSENDPOINT:
                listener = "javax.jms.MessageListener";
                // inboundOpName = "onMessage";
                endpointClass = "org.switchyard.component.jca.endpoint.JMSEndpoint";
                break;
            case CCIENDPOINT:
                listener = "javax.resource.cci.MessageListener";
                // inboundOpName = "onMessage";
                endpointClass = "org.switchyard.component.jca.endpoint.CCIEndpoint";
                break;
            default:
                foundEndpoint = false;
                break;
            }

            if (foundEndpoint) {
                interaction.setListener(listener);
                if (interaction.getEndpoint() == null) {
                    Endpoint endpoint = JcaFactory.eINSTANCE.createEndpoint();
                    endpoint.setType(endpointClass);
                    setFeatureValue(interaction, "endpoint", endpoint);
                } else {
                    interaction.getEndpoint().setType(endpointClass);
                }
            }
        }
    }

    protected void updateInboundInteractionFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new InboundInteractionOp());
        ops.add(new BasicOperation("inboundInteraction", featureId, value));
        wrapOperation(ops);
    }

    protected void updateInboundInteractionBatchCommitFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new InboundInteractionOp());
        ops.add(new BatchCommitOp());
        if (featureId != null) {
            ops.add(new BasicOperation("inboundInteraction/batchCommit", featureId, value));
        }
        wrapOperation(ops);
    }

    protected void removeInboundInteractionBatchCommitFeature() {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new InboundInteractionOp());
        ops.add(new RemoveBatchCommitOp());
        wrapOperation(ops);
    }

    protected void updateEndpoint() {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new InboundInteractionOp());
        ops.add(new EndpointOp());
        wrapOperation(ops);
    }

    protected void handleModify(final Control control) {
        if (control.equals(_endpointMappingTypeCombo)) {
            updateEndpoint();
        } else if (control.equals(_transactedButton)) {
            updateInboundInteractionFeature("transacted", Boolean.valueOf(_transactedButton.getSelection()));
        } else if (control.equals(_batchEnabledCheckbox)) {
            if (!_batchEnabledCheckbox.getSelection()) {
                removeInboundInteractionBatchCommitFeature();
            } else {
                updateInboundInteractionBatchCommitFeature(null,  null);
            }
        } else if (control.equals(_batchSizeText)) {
            updateInboundInteractionBatchCommitFeature("batchSize", _batchSizeText.getText().trim());
        } else if (control.equals(_batchTimeoutText)) {
            updateInboundInteractionBatchCommitFeature("batchTimeout", _batchTimeoutText.getText().trim());
        } else {
            super.handleModify(control);
        }
        validate();
        setHasChanged(false);
        setDidSomething(true);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (control.equals(_batchSizeText)) {
                setTextValue(_batchSizeText, PropTypeUtil.getPropValueString(this._binding.getInboundInteraction().getBatchCommit().getBatchSize()));
            } else if (control.equals(_batchTimeoutText)) {
                setTextValue(_batchTimeoutText, PropTypeUtil.getPropValueString(this._binding.getInboundInteraction().getBatchCommit().getBatchTimeout()));
            } else {
                super.handleUndo(control);
            }
        }
    }

}
