/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.editor.components.jca;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec;
import org.switchyard.tools.models.switchyard1_0.jca.Connection;
import org.switchyard.tools.models.switchyard1_0.jca.Endpoint;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection;
import org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction;
import org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection;
import org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.models.switchyard1_0.jca.Processor;
import org.switchyard.tools.models.switchyard1_0.jca.Property;
import org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter;
import org.switchyard.tools.ui.editor.components.jca.IJCAResourceAdapterExtension.IInboundConnectionSettings;
import org.switchyard.tools.ui.editor.components.jca.IJCAResourceAdapterExtension.IInboundInteractionSettings;
import org.switchyard.tools.ui.editor.components.jca.IJCAResourceAdapterExtension.IOutboundConnectionSettings;
import org.switchyard.tools.ui.editor.components.jca.IJCAResourceAdapterExtension.IOutboundInteractionSettings;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractBindingWizard;
import org.switchyard.tools.ui.editor.diagram.binding.IBindingWizard;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * SOAPBindingWizard
 * 
 * <p/>
 * Wizard for creating new {@link JCABinding} objects.
 * 
 * @author Rob Cernich
 */
public class JCABindingWizard extends AbstractBindingWizard implements IBindingWizard {

    @Override
    protected Binding createBinding() {
        final JCABinding binding = JcaFactory.eINSTANCE.createJCABinding();
        for (IJCAResourceAdapterExtension extension : IJCAResourceAdapterExtensionManager.instance().getExtensions()) {
            if (!extension.isDefault()) {
                continue;
            }
            if (getTargetContainer() instanceof Service) {
                binding.setInboundConnection(JcaFactory.eINSTANCE.createJCAInboundConnection());
                binding.getInboundConnection().setActivationSpec(JcaFactory.eINSTANCE.createActivationSpec());
                binding.getInboundConnection().setResourceAdapter(JcaFactory.eINSTANCE.createResourceAdapter());

                binding.setInboundInteraction(JcaFactory.eINSTANCE.createJCAInboundInteraction());
                binding.getInboundInteraction().setEndpoint(JcaFactory.eINSTANCE.createEndpoint());

                applyInboundConnectionSettings(extension.getInboundConnectionSettings(), binding);
                applyInboundInteractionSettings(extension.getInboundInteractionSettings(), binding);
                break;
            } else {
                binding.setOutboundConnection(JcaFactory.eINSTANCE.createJCAOutboundConnection());
                binding.getOutboundConnection().setConnection(JcaFactory.eINSTANCE.createConnection());
                binding.getOutboundConnection().setResourceAdapter(JcaFactory.eINSTANCE.createResourceAdapter());

                binding.setOutboundInteraction(JcaFactory.eINSTANCE.createJCAOutboundInteraction());
                binding.getOutboundInteraction().setProcessor(JcaFactory.eINSTANCE.createProcessor());
                binding.getOutboundInteraction().setConnectionSpec(JcaFactory.eINSTANCE.createConnectionSpec());
                binding.getOutboundInteraction().setInteractionSpec(JcaFactory.eINSTANCE.createInteractionSpec());

                applyOutboundConnectionSettings(extension.getOutboundConnectionSettings(), binding);
                applyOutboundInteractionSettings(extension.getOutboundInteractionSettings(), binding);
            }
        }
        binding.setName(makeUniqueName("jca")); //$NON-NLS-1$
        return binding;
    }

    @Override
    protected List<IBindingComposite> createComposites() {
        return JCABindingTypeExtension.createComposites(getToolkit(), getTargetContainer() instanceof Service);
    }

    private void applyInboundConnectionSettings(IInboundConnectionSettings settings, JCABinding binding) {
        if (settings == null) {
            return;
        }
        final JCAInboundConnection connection = binding.getInboundConnection();

        final ResourceAdapter resourceAdapter = connection.getResourceAdapter();
        resourceAdapter.setName(settings.getResourceAdapterName());
        addDefaultProperties(resourceAdapter.getProperty(), settings.getResourceAdapterProperties());

        final ActivationSpec activationSpec = connection.getActivationSpec();
        addDefaultProperties(activationSpec.getProperty(), settings.getActivationSpecProperties());
    }

    private void applyInboundInteractionSettings(IInboundInteractionSettings settings, JCABinding binding) {
        if (settings == null) {
            return;
        }

        final JCAInboundInteraction interaction = binding.getInboundInteraction();
        interaction.setListener(settings.getListenerType());
        if (settings.isTransacted() != null) {
            interaction.setTransacted(settings.isTransacted());
        }

        final Endpoint endpoint = interaction.getEndpoint();
        endpoint.setType(settings.getEndpointType());
        addDefaultProperties(endpoint.getProperty(), settings.getEndpointProperties());
    }

    private void applyOutboundConnectionSettings(IOutboundConnectionSettings settings, JCABinding binding) {
        if (settings == null) {
            return;
        }
        final JCAOutboundConnection connection = binding.getOutboundConnection();

        final ResourceAdapter resourceAdapter = connection.getResourceAdapter();
        resourceAdapter.setName(settings.getResourceAdapterName());
        addDefaultProperties(resourceAdapter.getProperty(), settings.getResourceAdapterProperties());

        final Connection connectionConnection = connection.getConnection();
        connectionConnection.setJndiName(settings.getConnectionJndiName());
        addDefaultProperties(connectionConnection.getProperty(), settings.getConnectionProperties());
    }

    private void applyOutboundInteractionSettings(IOutboundInteractionSettings settings, JCABinding binding) {
        if (settings == null) {
            return;
        }

        final JCAOutboundInteraction interaction = binding.getOutboundInteraction();

        final Processor processor = interaction.getProcessor();
        processor.setType(settings.getProcessorType());
        addDefaultProperties(processor.getProperty(), settings.getProcessorProperties());

        addDefaultProperties(interaction.getConnectionSpec().getProperty(), settings.getConnectionSpecProperties());
        addDefaultProperties(interaction.getInteractionSpec().getProperty(), settings.getInteractionSpecProperties());
    }

    private void addDefaultProperties(List<Property> properties, Map<String, String> defaults) {
        if (defaults == null) {
            return;
        }
        final Map<String, Property> propertiesMap = new HashMap<String, Property>();
        for (Property property : properties) {
            if (property.getName() != null) {
                propertiesMap.put(property.getName(), property);
            }
        }
        for (Map.Entry<String, String> entry : defaults.entrySet()) {
            final String name = entry.getKey();
            if (name == null || propertiesMap.containsKey(name)) {
                continue;
            }
            final Property property = JcaFactory.eINSTANCE.createProperty();
            property.setName(name);
            property.setValue(entry.getValue());
            properties.add(property);
        }
    }

}
