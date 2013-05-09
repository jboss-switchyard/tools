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
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec;
import org.switchyard.tools.models.switchyard1_0.jca.BatchCommit;
import org.switchyard.tools.models.switchyard1_0.jca.Endpoint;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection;
import org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.models.switchyard1_0.jca.Property;
import org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter;
import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;

/**
 * @author bfitzpat
 * 
 */
public abstract class AbstractJCABindingComposite extends AbstractSYBindingComposite {

    private JCABinding _binding = null;

    private enum ENDPOINT_MAPPING_TYPE {
        JMSENDPOINT, CCIENDPOINT
    }

    @Override
    public Binding getBinding() {
        return this._binding;
    }

    @Override
    public void setBinding(Binding impl) {
        if (impl instanceof JCABinding) {
            this._binding = (JCABinding) impl;
        } else {
            this._binding = null;
        }
        addObservableListeners();
    }

    @Override
    public void setTargetObject(Object target) {
        super.setTargetObject(target);
    }

    @Override
    protected boolean validate() {
        setErrorMessage(null);
        if (getBinding() != null) {
            super.validateTabs();
        }
        return (getErrorMessage() == null);
    }

    /**
     * @return boolean as to validity
     */
    public boolean isValid() {
        return validate();
    }

    protected String getResourceAdapterPropertyValue(ActivationSpec as, String propertyName) {
        if (as != null && as.getProperty() != null && as.getProperty().size() > 0) {
            Iterator<Property> propIter = as.getProperty().iterator();
            while (propIter.hasNext()) {
                Property current = propIter.next();
                if (current.getName().equals(propertyName)) {
                    return (String) current.getValue();
                }
            }
        }
        return null;
    }

    class InboundConnectionOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getInboundConnection() == null) {
                JCAInboundConnection inbound = JcaFactory.eINSTANCE.createJCAInboundConnection();
                setFeatureValue(_binding, "inboundConnection", inbound);
            }
        }
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
    
    class ResourceAdapterOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getInboundConnection() != null
                    && _binding.getInboundConnection().getResourceAdapter() == null) {
                ResourceAdapter resAdapter = JcaFactory.eINSTANCE.createResourceAdapter();
                setFeatureValue(_binding.getInboundConnection(), "resourceAdapter", resAdapter);
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
        
        private ENDPOINT_MAPPING_TYPE _selType = ENDPOINT_MAPPING_TYPE.JMSENDPOINT;
        
        public void setEndpointMappingType(ENDPOINT_MAPPING_TYPE inType) {
            this._selType = inType;
        }
        
        @Override
        public void run() throws Exception {
            JCAInboundInteraction interaction = _binding.getInboundInteraction();
            ENDPOINT_MAPPING_TYPE type = _selType;
            String listener = null;
            // String inboundOpName = null;
            String endpointClass = null;
            boolean foundEndpoint = true;
            switch (type) {
            case JMSENDPOINT:
                listener = "javax.jms.MessageListener";
                endpointClass = "org.switchyard.component.jca.endpoint.JMSEndpoint";
                break;
            case CCIENDPOINT:
                listener = "javax.resource.cci.MessageListener";
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

    protected void updateInboundConnectionFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new InboundConnectionOp());
        ops.add(new BasicOperation("inboundConnection", featureId, value));
        wrapOperation(ops);
    }

    protected void updateInboundInteractionFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new InboundInteractionOp());
        ops.add(new BasicOperation("inboundInteraction", featureId, value));
        wrapOperation(ops);
    }

    protected void updateInboundConnectionResourceAdapterFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new InboundConnectionOp());
        ops.add(new ResourceAdapterOp());
        ops.add(new BasicOperation("inboundConnection/resourceAdapter", featureId, value));
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
    
    @Override
    protected ContextMapperType createContextMapper() {
        return JcaFactory.eINSTANCE.createJCAContextMapperType();
    }

    @Override
    protected MessageComposerType createMessageComposer() {
        return JcaFactory.eINSTANCE.createJCAMessageComposerType();
    }
    
    protected void updatePropertiesFromPropertyArray(Property[] propList) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new ActivationSpecOp());
        ops.add(new ClearActivationSpecPropertiesOp());
        if (propList != null && propList.length > 0) {
            for (int i = 0; i < propList.length; i++) {
                Property property = propList[i];
                ops.add(new ActivationSpecPropertyOp(property));
            }
        }
        wrapOperation(ops);
    }

    protected void updateInboundActivationProperty(String propName, String propValue) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new FindOrAddActivationPropertyOp(propName, propValue));
        wrapOperation(ops);
    }

    class FindOrAddActivationPropertyOp extends ModelOperation {
        
        private String _propName;
        private String _propValue;
        
        public FindOrAddActivationPropertyOp(String propName, String propValue) {
            _propName = propName;
            _propValue = propValue;
        }
        @Override
        public void run() throws Exception {
            EList<Property> inboundProps = _binding.getInboundConnection().getActivationSpec().getProperty();
            Iterator<Property> propIter = inboundProps.iterator();
            while (propIter.hasNext()) {
                Property next = propIter.next();
                if (next.getName().equals(_propName)) {
                    if (_propValue != null && !_propValue.trim().isEmpty()) {
                        next.setValue(_propValue);
                    } else {
                        inboundProps.remove(next);
                    }
                    return;
                }
            }
            // if we got this far, we need to add a new property
            Property newProp = JcaFactory.eINSTANCE.createProperty();
            newProp.setName(_propName);
            newProp.setValue(_propValue);
            inboundProps.add(newProp);
        }
    }
    
    class ActivationSpecOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getInboundConnection() == null) {
                JCAInboundConnection inbound = JcaFactory.eINSTANCE.createJCAInboundConnection();
                setFeatureValue(_binding, "inboundConnection", inbound);
            }
            if (_binding != null && _binding.getInboundConnection().getActivationSpec() == null) {
                ActivationSpec activationSpec = JcaFactory.eINSTANCE.createActivationSpec();
                setFeatureValue(_binding.getInboundConnection(), "activationSpec", activationSpec);
            }
        }
    }

    class ClearActivationSpecPropertiesOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getInboundConnection() != null
                    && _binding.getInboundConnection().getActivationSpec() != null 
                    && _binding.getInboundConnection().getActivationSpec().getProperty() != null) {
                EList<Property> props = _binding.getInboundConnection().getActivationSpec().getProperty();
                props.clear();
            }
        }
    }

    class ActivationSpecPropertyOp extends ModelOperation {
        private Property _property;
        public ActivationSpecPropertyOp(Property prop) {
            _property = prop;
        }
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getInboundConnection() != null
                    && _binding.getInboundConnection().getActivationSpec() != null 
                    && _binding.getInboundConnection().getActivationSpec().getProperty() != null) {
                EList<Property> props = _binding.getInboundConnection().getActivationSpec().getProperty();
                props.add(_property);
            }
        }
    }
    
    protected void getActivationPropertyForControl(ActivationSpec activationSpec, String property, Control control) {
        String value = 
                getResourceAdapterPropertyValue(activationSpec, property);
        if (value != null && control != null && !control.isDisposed()) {
            if (control instanceof Text) {
                ((Text)control).setText(value);
            } else if (control instanceof Combo) {
                ((Combo)control).setText(value);
            }
        }
    }

}
