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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
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
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.jca.Endpoint;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;
import org.switchyard.tools.ui.editor.databinding.EscapedPropertyBooleanValidator;
import org.switchyard.tools.ui.editor.databinding.ObservablesUtil;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;

/**
 * @author bfitzpat
 * 
 */
public class JCAInteractionDetailsComposite extends AbstractSYBindingComposite {

    private Map<EndpointType, AbstractJCABindingComposite> _extensionComposites = new HashMap<EndpointType, AbstractJCABindingComposite>();
    private EndpointType _activeExtension;
    private Composite _panel;
    private JCABinding _binding = null;
    private ComboViewer _endpointMappingTypeCombo;
    private Text _transactedText;
    private Group _batchGroup;
    private Text _batchSizeText;
    private Text _batchTimeoutText;
    private AbstractJCABindingComposite _endpointPropsComposite;
    private Composite _stackComposite;
    private StackLayout _stackLayout;
    private WritableValue _bindingValue;

    private static enum EndpointType {
        JMS(Messages.label_jmsEndpoint, "org.switchyard.component.jca.endpoint.JMSEndpoint", "javax.jms.MessageListener", new JCAJMSEndpointPropertiesExtension()),
        CCI(Messages.label_cciEndpoint, "org.switchyard.component.jca.endpoint.CCIEndpoint", "javax.resource.cci.MessageListener", new JCACCIEndpointPropertiesExtension()),
        CUSTOM("Custom", null, null, new JCACustomEndpointPropertiesExtension());
        
        private final String _label;
        private final String _endpointType;
        private final String _listenerType;
        private final IJCAEndpointPropertiesExtension _extension;

        private EndpointType(String label, String endpointType, String listenerType, IJCAEndpointPropertiesExtension extension) {
            _label = label;
            _endpointType = endpointType;
            _listenerType = listenerType;
            _extension = extension;
        }

        /**
         * Get the label.
         * 
         * @return the label.
         */
        public String getLabel() {
            return _label;
        }

        /**
         * Get the endpointType.
         * 
         * @return the endpointType.
         */
        public String getEndpointType() {
            return _endpointType;
        }

        /**
         * Get the listenerType.
         * 
         * @return the listenerType.
         */
        public String getListenerType() {
            return _listenerType;
        }

        public AbstractJCABindingComposite createComposite(FormToolkit toolkit) {
            return _extension.createComposite(toolkit);
        }

        /**
         * @param endpointType the endpoint type
         * @return the corresponding EndpointType
         */
        public static EndpointType fromEndpointType(String endpointType) {
            if (JMS._endpointType.equals(endpointType)) {
                return JMS;
            } else if (CCI._endpointType.equals(endpointType)) {
                return CCI;
            }
            return CUSTOM;
        }
    }

    JCAInteractionDetailsComposite(FormToolkit toolkit) {
        super(toolkit);
    }

    @Override
    public String getTitle() {
        return Messages.title_interactionDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_interactionDetails;
    }

    private void processEndpointComboSelection() {
        final IStructuredSelection selection = (IStructuredSelection) _endpointMappingTypeCombo.getSelection();
        swapExtensionComposites(selection.isEmpty() ? null : (EndpointType) selection.getFirstElement(), true);
    }

    private void swapExtensionComposites(final EndpointType newExtension, final boolean updateValues) {
        if (newExtension == null || newExtension == _activeExtension) {
            return;
        }
        final TransactionalEditingDomain domain = getDomain(_binding);
        if (updateValues && domain != null) {
            domain.getCommandStack().execute(
                    new RecordingCommand(domain, "Change JCA endpoint type") {
                        @Override
                        protected void doExecute() {
                            deactivateExtension(_activeExtension);
                            activateExtension(newExtension, updateValues);
                        }
                    });
        } else {
            deactivateExtension(_activeExtension);
            activateExtension(newExtension, updateValues);
        }

        _activeExtension = newExtension;

        _endpointPropsComposite = _extensionComposites.get(newExtension);
        _stackLayout.topControl = _endpointPropsComposite.getPanel();
        _stackComposite.layout();
        if (_stackComposite.getParent() != null) {
            _stackComposite.getParent().layout();
        }
    }
 
    private void activateExtension(EndpointType extension, boolean updateValues) {
        if (extension == null) {
            return;
        }
        if (updateValues) {
            JCAInboundInteraction interaction = _binding.getInboundInteraction();
            if (interaction == null) {
                interaction = JcaFactory.eINSTANCE.createJCAInboundInteraction();
                _binding.setInboundInteraction(interaction);
            }
            Endpoint endpoint = interaction.getEndpoint();
            if (endpoint == null) {
                endpoint = JcaFactory.eINSTANCE.createEndpoint();
                interaction.setEndpoint(endpoint);
            }
            endpoint.setType(extension.getEndpointType());
            interaction.setListener(extension.getListenerType());
        }
        _extensionComposites.get(extension).setBinding(_binding);
    }

    private void deactivateExtension(EndpointType extension) {
        if (extension == null) {
            return;
        }
        final AbstractJCABindingComposite extensionComposite = _extensionComposites.get(extension);
        extensionComposite.setBinding(null);
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
    }

    @Override
    public void createContents(Composite parent, int style, DataBindingContext context) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getJCAInteractionDetailsTabControl(_panel, context);
        
        bindControls(context);
    }
    
    private Control getJCAInteractionDetailsTabControl(Composite tabFolder, DataBindingContext context) {
        Composite composite = getToolkit().createComposite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);
        
        _endpointMappingTypeCombo = new ComboViewer(createLabelAndCombo(composite, Messages.label_endpointMappingType, true, 2));
        _endpointMappingTypeCombo.setContentProvider(ArrayContentProvider.getInstance());
        _endpointMappingTypeCombo.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                return ((EndpointType) element).getLabel();
            }
        });
        _endpointMappingTypeCombo.setInput(EndpointType.values());
        _endpointMappingTypeCombo.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                processEndpointComboSelection();
            }
        });

        _transactedText = createLabelAndText(composite, Messages.label_transacted);
        
        _batchGroup = new Group(composite, SWT.NONE);
        GridData bgGridData = new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1);
        _batchGroup.setLayoutData(bgGridData);
        _batchGroup.setLayout(new GridLayout(2, false));
        _batchGroup.setText(Messages.label_batchCommitOptions);
        getToolkit().adapt(_batchGroup);
        
        _batchSizeText = createLabelAndText(_batchGroup, Messages.label_batchSize);
        _batchTimeoutText = createLabelAndText(_batchGroup, Messages.label_batchTimeout);

        _stackComposite = getToolkit().createComposite(composite, SWT.NONE);
        GridData gd = new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1);
        _stackComposite.setLayoutData(gd);
        _stackLayout = new StackLayout();
        _stackComposite.setLayout(_stackLayout);
        Composite dummy = getToolkit().createComposite(_stackComposite, SWT.NONE);
        _stackLayout.topControl = dummy;

        // initialize endpoint composites
        for (EndpointType endpointType : EndpointType.values()) {
            AbstractJCABindingComposite endpointComposite = endpointType.createComposite(getToolkit());
            endpointComposite.setTargetObject(getTargetObject());
            endpointComposite.createContents(_stackComposite, SWT.NONE, context);
            endpointComposite.setBinding(null);
            _extensionComposites.put(endpointType, endpointComposite);
        }

        return composite;
    }

    private void bindControls(DataBindingContext context) {
        final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(getTargetObject());
        final Realm realm = SWTObservables.getRealm(_stackComposite.getDisplay());

        _bindingValue = new WritableValue(realm, null, JCABinding.class);

        final FeaturePath batchSizeFeaturePath = FeaturePath
                .fromList(JcaPackage.Literals.JCA_BINDING__INBOUND_INTERACTION,
                        JcaPackage.Literals.JCA_INBOUND_INTERACTION__BATCH_COMMIT,
                        JcaPackage.Literals.BATCH_COMMIT__BATCH_SIZE);
        org.eclipse.core.databinding.Binding binding = context.bindValue(SWTObservables.observeText(_batchSizeText,
                SWT.Modify), EMFProperties.value(batchSizeFeaturePath).observeDetail(_bindingValue),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT, domain,
                        _bindingValue, batchSizeFeaturePath, true), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        final FeaturePath batchTimeoutFeaturePath = FeaturePath
                .fromList(JcaPackage.Literals.JCA_BINDING__INBOUND_INTERACTION,
                        JcaPackage.Literals.JCA_INBOUND_INTERACTION__BATCH_COMMIT,
                        JcaPackage.Literals.BATCH_COMMIT__BATCH_TIMEOUT);
        binding = context.bindValue(SWTObservables.observeText(_batchTimeoutText,
                SWT.Modify), EMFProperties.value(batchTimeoutFeaturePath).observeDetail(_bindingValue),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT, domain,
                        _bindingValue, batchTimeoutFeaturePath, true), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        final FeaturePath transactedFeaturePath = FeaturePath.fromList(
                JcaPackage.Literals.JCA_BINDING__INBOUND_INTERACTION,
                JcaPackage.Literals.JCA_INBOUND_INTERACTION__TRANSACTED);
        binding = context.bindValue(SWTObservables.observeText(_transactedText, SWT.Modify),
                EMFProperties.value(transactedFeaturePath).observeDetail(_bindingValue),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_UPDATE, domain,
                        _bindingValue, transactedFeaturePath, false).
                        setAfterConvertValidator(new EscapedPropertyBooleanValidator("Transacted must be a valid boolean value or follow the pattern for escaped properties (i.e. '${propName}').")), null);
        
        IObservableValue endpointType = ObservablesUtil.observeDetailValue(domain, _bindingValue, FeaturePath.fromList(
                JcaPackage.Literals.JCA_BINDING__INBOUND_INTERACTION,
                JcaPackage.Literals.JCA_INBOUND_INTERACTION__ENDPOINT, JcaPackage.Literals.ENDPOINT__TYPE));
        endpointType.addValueChangeListener(new IValueChangeListener() {
            @Override
            public void handleValueChange(ValueChangeEvent event) {
                final EndpointType newExtension = EndpointType.fromEndpointType((String) event.diff.getNewValue());
                if (newExtension != _activeExtension) {
                    swapExtensionComposites(newExtension, false);
                    _endpointMappingTypeCombo.setSelection(new StructuredSelection(newExtension), true);
                }
            }
        });
    }

    @Override
    public Composite getPanel() {
        return _panel;
    }

}
