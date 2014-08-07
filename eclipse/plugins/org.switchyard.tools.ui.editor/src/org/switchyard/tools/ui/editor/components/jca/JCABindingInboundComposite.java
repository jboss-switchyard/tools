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
package org.switchyard.tools.ui.editor.components.jca;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec;
import org.switchyard.tools.models.switchyard1_0.jca.Endpoint;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection;
import org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.models.switchyard1_0.jca.Property;
import org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.components.jca.IJCAResourceAdapterExtension.IInboundConnectionSettings;
import org.switchyard.tools.ui.editor.components.jca.IJCAResourceAdapterExtension.IInboundInteractionSettings;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;
import org.switchyard.tools.ui.editor.databinding.ObservablesUtil;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;
import org.switchyard.tools.ui.editor.databinding.StringEmptyValidator;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorComposite;

/**
 * @author bfitzpat
 * 
 */
public class JCABindingInboundComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private JCABinding _binding = null;
    private JCAPropertyTable _propsList;
    private Text _nameText;
    private OperationSelectorComposite _opSelectorComposite;
    private HashMap<IJCAResourceAdapterExtension, AbstractJCABindingComposite> _resAdapterMap;
    private ComboViewer _resourceAdapterTypeCombo;
    private Composite _stackComposite;
    private IJCAResourceAdapterExtension _defaultJCAExtension;
    private IJCAResourceAdapterExtension _activeExtension;
    private WritableValue _bindingValue;
    private StackLayout _stackLayout = null;

    JCABindingInboundComposite(FormToolkit toolkit) {
        super(toolkit);
    }

    @Override
    public String getTitle() {
        return Messages.title_jcaBindingDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_jcaBindingDetails;
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof JCABinding) {
            _binding = (JCABinding) impl;
        } else {
            _binding = null;
        }
        _bindingValue.setValue(_binding);
        
        // refresh the operation selector control
        if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed() && getTargetObject() != null) {
            _opSelectorComposite.setTargetObject(getTargetObject());
        }
        if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed()) {
            _opSelectorComposite.setBinding(_binding);
        }

        final IJCAResourceAdapterExtension newExtension = findJCAExtension(_binding);
        if (_activeExtension != newExtension) {
            processJCAExtensionSelection(newExtension, false);
            _resourceAdapterTypeCombo.setSelection(new StructuredSelection(newExtension), true);
        } else {
            processJCAExtensionSelection(_activeExtension, false);
            _resAdapterMap.get(_activeExtension).setBinding(_binding);
        }

        // after the extension is set, for filtering
        _propsList.setTargetObject(_binding);
    }

    @Override
    public void setTargetObject(EObject target) {
        super.setTargetObject(target);
        if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed()) {
            _opSelectorComposite.setTargetObject(target);
        }
    }

    @Override
    public void createContents(Composite parent, int style, DataBindingContext context) {
        _panel = getToolkit().createComposite(parent, style);
        _panel.setLayout(new GridLayout(1, false));

        _resAdapterMap = new HashMap<IJCAResourceAdapterExtension, AbstractJCABindingComposite>();

        getJCATabControl(_panel, context).setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
        getJCAOperationSelectorTabControl(_panel).setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
        
        bindControls(context);
    }
    
    private void processJCAExtensionSelection(final IJCAResourceAdapterExtension newExtension, final boolean processDefaults) {
        if (_activeExtension == newExtension) {
            return;
        }

        _propsList.setTargetObject(null);

        final TransactionalEditingDomain domain = getDomain(_binding);
        if (processDefaults && domain != null) {
            domain.getCommandStack().execute(
                    new RecordingCommand(domain, "Change JCA connector type") {
                        @Override
                        protected void doExecute() {
                            deactivateExtension(_activeExtension, processDefaults);
                            activateExtension(newExtension, processDefaults);
                        }
                    });
        } else {
            deactivateExtension(_activeExtension, processDefaults);
            activateExtension(newExtension, processDefaults);
        }

        _activeExtension = newExtension;

        AbstractJCABindingComposite syComposite = _resAdapterMap.get(newExtension);
        _stackLayout.topControl = syComposite.getPanel();
        _stackComposite.layout();
        _panel.layout();
        
        _propsList.setTargetObject(_binding);
    }

    private void activateExtension(IJCAResourceAdapterExtension extension, boolean processDefaults) {
        if (extension == null) {
            return;
        }
        if (processDefaults) {
            applyConnectionSettings(extension.getInboundConnectionSettings());
            applyInteractionSettings(extension.getInboundInteractionSettings());
        }
        final AbstractJCABindingComposite extensionComposite = _resAdapterMap.get(extension);
        extensionComposite.setBinding(_binding);
    }

    private void applyConnectionSettings(IInboundConnectionSettings settings) {
        if (_binding == null || settings == null) {
            return;
        }
        JCAInboundConnection connection = _binding.getInboundConnection();
        if (connection == null) {
            connection = JcaFactory.eINSTANCE.createJCAInboundConnection();
            _binding.setInboundConnection(connection);
        }

        ResourceAdapter resourceAdapter = connection.getResourceAdapter();
        if (resourceAdapter == null) {
            resourceAdapter = JcaFactory.eINSTANCE.createResourceAdapter();
            connection.setResourceAdapter(resourceAdapter);
        }
        resourceAdapter.setName(settings.getResourceAdapterName());
        addDefaultProperties(resourceAdapter.getProperty(), settings.getResourceAdapterProperties());

        ActivationSpec activationSpec = connection.getActivationSpec();
        if (activationSpec == null) {
            activationSpec = JcaFactory.eINSTANCE.createActivationSpec();
            connection.setActivationSpec(activationSpec);
        }
        addDefaultProperties(activationSpec.getProperty(), settings.getActivationSpecProperties());
    }

    private void applyInteractionSettings(IInboundInteractionSettings settings) {
        if (_binding == null || settings == null) {
            return;
        }
        JCAInboundInteraction interaction = _binding.getInboundInteraction();
        if (interaction == null) {
            interaction = JcaFactory.eINSTANCE.createJCAInboundInteraction();
            _binding.setInboundInteraction(interaction);
        }
        
        interaction.setListener(settings.getListenerType());
        
        if (settings.isTransacted() != null) {
            interaction.setTransacted(settings.isTransacted());
        }

        Endpoint endpoint = interaction.getEndpoint();
        if (endpoint == null) {
            endpoint = JcaFactory.eINSTANCE.createEndpoint();
            interaction.setEndpoint(endpoint);
        }
        endpoint.setType(settings.getEndpointType());
        addDefaultProperties(endpoint.getProperty(), settings.getEndpointProperties());
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
            if (name == null) {
                continue;
            }
            Object value = entry.getValue();
            if (propertiesMap.containsKey(name)) {
                // override
                Object oldPropValue = propertiesMap.get(name).getValue();
                if (oldPropValue != null && !oldPropValue.equals(value)) {
                    Iterator<Property> propIter = properties.iterator();
                    while (propIter.hasNext()) {
                        Property next = propIter.next();
                        if (next.getName().equals(name)) {
                            properties.remove(next);
                            break;
                        }
                    }
                }
            }
            final Property property = JcaFactory.eINSTANCE.createProperty();
            property.setName(name);
            property.setValue(entry.getValue());
            properties.add(property);
        }
    }

    private void deactivateExtension(IJCAResourceAdapterExtension extension, boolean processDefaults) {
        if (extension == null) {
            return;
        }
        if (processDefaults) {
            unapplyConnectionSettings(extension.getInboundConnectionSettings());
//            unapplyInteractionSettings(extension.getInboundInteractionSettings());
        }
        final AbstractJCABindingComposite extensionComposite = _resAdapterMap.get(extension);
        extensionComposite.setBinding(null);
    }

    private void unapplyConnectionSettings(IInboundConnectionSettings settings) {
        if (_binding == null || settings == null) {
            return;
        }
        JCAInboundConnection connection = _binding.getInboundConnection();
        if (connection == null) {
            return;
        }
        ResourceAdapter resourceAdapter = connection.getResourceAdapter();
        if (resourceAdapter != null) {
//            if (settings.getResourceAdapterName() != null && settings.getResourceAdapterName().equals(resourceAdapter.getName())) {
//                resourceAdapter.setName(null);
//            }
            removeDefaultProperties(resourceAdapter.getProperty(), settings.getResourceAdapterProperties());
        }

        ActivationSpec activationSpec = connection.getActivationSpec();
        if (activationSpec != null) {
            removeDefaultProperties(activationSpec.getProperty(), settings.getActivationSpecProperties());
        }
    }

//    private void unapplyInteractionSettings(IInboundInteractionSettings settings) {
//        if (_binding == null || settings == null) {
//            return;
//        }
//        JCAInboundInteraction interaction = _binding.getInboundInteraction();
//        if (interaction == null) {
//            return;
//        }
//
//        if (settings.getListenerType() != null && settings.getListenerType().equals(interaction.getListener())) {
//            interaction.setListener(null);
//        }
//
//        if (settings.isTransacted() != null && settings.isTransacted() == interaction.isTransacted()) {
//            interaction.unsetTransacted();
//        }
//
//        Endpoint endpoint = interaction.getEndpoint();
//        if (endpoint != null) {
//            if (settings.getEndpointType() != null && settings.getEndpointType().equals(endpoint.getType())) {
//                endpoint.setType(null);
//            }
//            removeDefaultProperties(endpoint.getProperty(), settings.getEndpointProperties());
//        }
//    }

    private void removeDefaultProperties(List<Property> properties, Map<String, String> defaults) {
        if (defaults == null) {
            return;
        }
        for (Iterator<Property> it = properties.iterator(); it.hasNext();) {
            final Property property = it.next();
            final String name = property.getName();
            if (name == null) {
                continue;
            }
//            final String value = defaults.get(name);
//            if (value == null) {
//                if (property.getValue() == null) {
//                    it.remove();
//                }
//            } else if (value.equals(property.getValue())) {
//                it.remove();
//            }
        }
    }

    private IJCAResourceAdapterExtension findJCAExtension(JCABinding binding) {
        IJCAResourceAdapterExtension foundExtension = null;
        int score = -1;
        for (IJCAResourceAdapterExtension extension : IJCAResourceAdapterExtensionManager.instance().getExtensions()) {
            int newScore = extension.score(binding);
            if (newScore > score) {
                foundExtension = extension;
                score = newScore;
            }
        }
        if (foundExtension == null) {
            foundExtension = _defaultJCAExtension;
        }
        return foundExtension;
    }

    private Control getJCATabControl(Composite tabFolder, DataBindingContext context) {
        Composite composite = getToolkit().createComposite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);
        
        _nameText = createLabelAndText(composite, Messages.label_name);

        Collection<IJCAResourceAdapterExtension> extensions =
                IJCAResourceAdapterExtensionManager.instance().getExtensions();
        _resourceAdapterTypeCombo = new ComboViewer(createLabelAndCombo(composite, Messages.label_resourceAdapterType, true));
        _resourceAdapterTypeCombo.setContentProvider(ArrayContentProvider.getInstance());
        _resourceAdapterTypeCombo.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                return ((IJCAResourceAdapterExtension) element).getDisplayName();
            }
        });
        _resourceAdapterTypeCombo.setInput(extensions);
        _resourceAdapterTypeCombo.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                processJCAExtensionSelection(
                        (IJCAResourceAdapterExtension) ((IStructuredSelection) event.getSelection()).getFirstElement(),
                        true);
            }
        });

        _stackComposite = new Composite(composite, SWT.NONE);
        GridData gd = new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1);
        _stackComposite.setLayoutData(gd);
        _stackLayout = new StackLayout();
        _stackComposite.setLayout(_stackLayout);

        Composite dummy = getToolkit().createComposite(_stackComposite, SWT.NONE);
        _stackLayout.topControl = dummy;
        
        _defaultJCAExtension = null;
        for (IJCAResourceAdapterExtension extension : extensions) {
            if (extension.isDefault() || _defaultJCAExtension == null) {
                _defaultJCAExtension = extension;
            }
            // just create the extensions now, so their bindings get cleaned up
            // appropriately
            AbstractJCABindingComposite extensionComposite = extension.createComposite(getToolkit());
            extensionComposite.setTargetObject(getTargetObject());
            extensionComposite.createContents(_stackComposite, SWT.NONE, context);
            extensionComposite.setBinding(null);
            _resAdapterMap.put(extension, extensionComposite);
        }

        Group activationPropsGroup = new Group(composite, SWT.NONE);
        activationPropsGroup.setText(Messages.label_activationProperties);
        activationPropsGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
        activationPropsGroup.setLayout(new GridLayout(1, false));
        getToolkit().adapt(activationPropsGroup);

        _propsList = new JCAActivationSpecPropertyTable(activationPropsGroup, SWT.NONE, getToolkit(), context, getDomain(getTargetObject()));
        _propsList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        _propsList.getTableViewer().addFilter(new ViewerFilter() {
            @Override
            public boolean select(Viewer viewer, Object parentElement, Object element) {
                if (_activeExtension == null || _activeExtension.getInboundConnectionSettings() == null || _activeExtension.getInboundConnectionSettings().getActivationSpecProperties() == null) {
                    return true;
                }
                final String name = ((Property) element).getName();
                return !(name != null && _activeExtension.getInboundConnectionSettings().getActivationSpecProperties()
                        .containsKey(name));
            }
        });

        return composite;
    }

    private Control getJCAOperationSelectorTabControl(Composite tabFolder) {
        Composite composite = getToolkit().createComposite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(1, false);
        composite.setLayout(gl);
        
        _opSelectorComposite = new OperationSelectorComposite(composite, SWT.NONE, this);
        _opSelectorComposite.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
        _opSelectorComposite.setLayout(new GridLayout(2, false));
        _opSelectorComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                handleModify(_opSelectorComposite);
            }
         });

        return composite;
    }

    @Override
    public Composite getPanel() {
        return this._panel;
    }

    private void bindControls(final DataBindingContext context) {
        final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(getTargetObject());
        final Realm realm = SWTObservables.getRealm(_nameText.getDisplay());

        _bindingValue = new WritableValue(realm, null, JCABinding.class);

        org.eclipse.core.databinding.Binding binding = context.bindValue(
                SWTObservables.observeText(_nameText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue,
                        ScaPackage.eINSTANCE.getBinding_Name()),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyValidator(
                                "JCA binding name should not be empty", Status.WARNING)), null);
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
                                "JCA binding name should not be empty", Status.WARNING)), new UpdateValueStrategy(
                        UpdateValueStrategy.POLICY_NEVER));
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        _opSelectorComposite.bindControls(domain, context);
    }

}
