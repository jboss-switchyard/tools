/******************************************************************************* 
 * Copyright (c) 2014 Red Hat, Inc. 
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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;
import org.switchyard.tools.models.switchyard1_0.jca.Property;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;
import org.switchyard.tools.ui.editor.databinding.ObservablesUtil;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;

/**
 * @author bfitzpat
 *
 */
public class JCAJMSProcessorPropertiesExtension implements
        IJCAEndpointPropertiesExtension {

    /*
     * These properties correspond to setters on the JMSProcessor class, e.g.
     * setConnectionFactoryJNDIName().
     */
    private static final String JNDI_PROPERTIES_FILE_PROP = "jndiPropertiesFileName"; //$NON-NLS-1$

    private static final String DESTINATION_PROP = "destination"; //$NON-NLS-1$
    private static final String USER_NAME_PROP = "username"; //$NON-NLS-1$
    private static final String PASSWORD_PROP = "password"; //$NON-NLS-1$
    private static final String MESSAGE_TYPE_PROP = "messageType"; //$NON-NLS-1$
    private static final String DESTINATION_JNDI_PROPERTIES_FILE_PROP = "destinationJndiPropertiesFileName"; //$NON-NLS-1$
    private static final String DESTINATION_TYPE_PROP = "destinationType"; //$NON-NLS-1$

    @SuppressWarnings("serial")
    private static final Set<String> HIDDEN_PROPERTIES = new HashSet<String>() {
        {
            add(JNDI_PROPERTIES_FILE_PROP);
            add(DESTINATION_PROP);
            add(USER_NAME_PROP);
            add(PASSWORD_PROP);
            add(MESSAGE_TYPE_PROP);
            add(DESTINATION_JNDI_PROPERTIES_FILE_PROP);
        }
    };

    @Override
    public AbstractJCABindingComposite createComposite(FormToolkit toolkit) {
            return new JCAJMSProcessorPropertiesComposite(toolkit);
    }

    private static final class JCAJMSProcessorPropertiesComposite extends AbstractJCABindingComposite {

        /**
         * @param toolkit Form toolkit to use during control creation
         */
        private JCAJMSProcessorPropertiesComposite(FormToolkit toolkit) {
            super(toolkit);
        }

        private JCABinding _binding;
        private Composite _panel;
        private JCAProcessorPropertyTable _propsList;
        private Text _jndiPropsFileNameText;
        private Text _destinationJndiPropertiesFileNameText;
        private Combo _messageTypeCombo;
        private Text _usernameText;
        private Text _passwordText;
        private Text _destinationText;
        private ComboViewer _destinationTypeCombo;
        private Button _jndiLookupCheckbox;
        private WritableValue _bindingValue;
        private IObservableValue _destinationTypeValue; 
        private IObservableValue _jndiLookupSelectionValue;
        private Text _jndiNameText;

        @Override
        public String getTitle() {
            return "JMS Processor Properties";
        }

        @Override
        public String getDescription() {
            return getTitle();
        }

        @Override
        public void createContents(Composite parent, int style, DataBindingContext context) {
            _panel = getToolkit().createComposite(parent, style);
            _panel.setLayout(new GridLayout(2, false));
            
            _jndiNameText = createLabelAndText(_panel, "JNDI Name");

            Group processorPropsGroup = new Group(_panel, SWT.NONE);
            processorPropsGroup.setText(getTitle());
            processorPropsGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, true, 3, 1));
            processorPropsGroup.setLayout(new GridLayout(2, false));
            getToolkit().adapt(processorPropsGroup);

            /* Connection Factory related properties */
            _jndiPropsFileNameText = createLabelAndText(processorPropsGroup, Messages.JCAJMSEndpointPropertiesExtension_JNDIPropsFileName_Label);

            /* Properties related to sending output message */
            _jndiLookupCheckbox = createCheckbox(processorPropsGroup, "Use JNDI Lookup for Destination", 2);
            _destinationTypeCombo = createLabelAndComboViewer(processorPropsGroup, "Destination Type", true); 
            _destinationTypeCombo.add("javax.jms.Queue"); //$NON-NLS-1$
            _destinationTypeCombo.add("javax.jms.Topic"); //$NON-NLS-1$

            _destinationJndiPropertiesFileNameText = createLabelAndText(processorPropsGroup, Messages.JCAJMSEndpointPropertiesExtension_DestinationJNDIPropertiesFileName_label);
            _destinationText = createLabelAndText(processorPropsGroup, "Destination");

            _messageTypeCombo = createLabelAndCombo(processorPropsGroup, Messages.JCAJMSEndpointPropertiesExtension_MessageType_label, true);
            _messageTypeCombo.add("");
            _messageTypeCombo.add("Stream"); //$NON-NLS-1$
            _messageTypeCombo.add("Map"); //$NON-NLS-1$
            _messageTypeCombo.add("Text"); //$NON-NLS-1$
            _messageTypeCombo.add("Object"); //$NON-NLS-1$
            _messageTypeCombo.add("Bytes"); //$NON-NLS-1$
            _messageTypeCombo.add("Plain"); //$NON-NLS-1$
            
            /* Other properties */
            _usernameText = createLabelAndText(processorPropsGroup, Messages.JCAJMSEndpointPropertiesExtension_UserName_label);
            _passwordText = createLabelAndText(processorPropsGroup, Messages.JCAJMSEndpointPropertiesExtension_Password_label);

            getToolkit().createLabel(processorPropsGroup, Messages.JCAJMSEndpointPropertiesExtension_PropertyList_label); //new Label(processorPropsGroup, SWT.NONE);
            getToolkit().createLabel(processorPropsGroup, ""); // spacer

            _propsList = new JCAProcessorPropertyTable(processorPropsGroup, SWT.NONE, getToolkit(), context, getDomain(getTargetObject()));
            _propsList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 4));
            _propsList.getTableViewer().addFilter(new ViewerFilter() {
                @Override
                public boolean select(Viewer viewer, Object parentElement, Object element) {
                    final String name = ((Property) element).getName();
                    return !(name != null && HIDDEN_PROPERTIES.contains(name));
                }
            });
            getToolkit().adapt(_propsList, false, false);

            bindControls(context);
        }

        private void bindControls(DataBindingContext context) {
            final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(getTargetObject());
            final Realm realm = SWTObservables.getRealm(_panel.getDisplay());

            _bindingValue = new WritableValue(realm, null, JCABinding.class);

            final FeaturePath propertiesFeaturePath = FeaturePath.fromList(
                    JcaPackage.Literals.JCA_BINDING__OUTBOUND_INTERACTION,
                    JcaPackage.Literals.JCA_OUTBOUND_INTERACTION__PROCESSOR, 
                    JcaPackage.Literals.PROCESSOR__PROPERTY);
            final IObservableList propertiesList = (domain == null ? EMFProperties.list(propertiesFeaturePath)
                    : EMFEditProperties.list(domain, propertiesFeaturePath)).observeDetail(_bindingValue);

            org.eclipse.core.databinding.Binding binding;

            final FeaturePath jndiNameFeaturePath = FeaturePath.fromList(
                    JcaPackage.Literals.JCA_BINDING__OUTBOUND_CONNECTION,
                    JcaPackage.Literals.JCA_OUTBOUND_CONNECTION__CONNECTION,
                    JcaPackage.Literals.CONNECTION__JNDI_NAME);
            binding = context.bindValue(
                    SWTObservables.observeText(_jndiNameText, SWT.Modify),
                    ObservablesUtil.observeDetailValue(domain, _bindingValue,
                            jndiNameFeaturePath),
                    new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT, _panel);

            final IObservableValue destinationJNDIPropFileNameValue = new JCANamedPropertyObservableValue(realm, propertiesList, DESTINATION_JNDI_PROPERTIES_FILE_PROP, true);
            _destinationTypeValue = new JCANamedPropertyObservableValue(realm, propertiesList, DESTINATION_TYPE_PROP);
            _jndiLookupSelectionValue = new WritableValue(realm, null, Boolean.class);
            
            binding = context.bindValue(
                    SWTObservables.observeSelection(_jndiLookupCheckbox), 
                    _jndiLookupSelectionValue,
                    new EMFUpdateValueStrategyNullForEmptyString(null,
                            UpdateValueStrategy.POLICY_CONVERT), null);
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
            
            _jndiLookupSelectionValue.addChangeListener(new IChangeListener() {
                @Override
                public void handleChange(ChangeEvent event) {
                    boolean isJNDILookupSelected = ((Boolean) _jndiLookupSelectionValue.getValue()).booleanValue();
                    _destinationTypeCombo.getControl().setEnabled(!isJNDILookupSelected);
                    _destinationJndiPropertiesFileNameText.setEnabled(isJNDILookupSelected);
                    if (isJNDILookupSelected) {
                        _destinationTypeValue.setValue("JNDI");
                    } else {
                        String value = (String) _destinationTypeValue.getValue();
                        if (value == null || (value != null && value.equalsIgnoreCase("JNDI"))) {
                            _destinationTypeValue.setValue("javax.jms.Queue");
                            destinationJNDIPropFileNameValue.setValue(null);
                        }
                    }
                }
            });
            
            binding = context.bindValue(ViewersObservables.observeSingleSelection(_destinationTypeCombo),
                    _destinationTypeValue,
                    new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT, _panel);
            
            binding = context.bindValue(SWTObservables.observeText(_destinationJndiPropertiesFileNameText, SWT.Modify),
                    destinationJNDIPropFileNameValue,
                    new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT, _panel);

            binding = context.bindValue(SWTObservables.observeText(_destinationText, SWT.Modify),
                    new JCANamedPropertyObservableValue(realm, propertiesList, DESTINATION_PROP),
                    new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT, _panel);

            binding = context.bindValue(SWTObservables.observeText(_jndiPropsFileNameText, SWT.Modify),
                    new JCANamedPropertyObservableValue(realm, propertiesList, JNDI_PROPERTIES_FILE_PROP),
                    new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT, _panel);

            binding = context.bindValue(SWTObservables.observeText(_messageTypeCombo),
                    new JCANamedPropertyObservableValue(realm, propertiesList, MESSAGE_TYPE_PROP),
                    new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_UPDATE), null);

            binding = context.bindValue(SWTObservables.observeText(_passwordText, SWT.Modify),
                    new JCANamedPropertyObservableValue(realm, propertiesList, PASSWORD_PROP),
                    new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT, _panel);

            binding = context.bindValue(SWTObservables.observeText(_usernameText, SWT.Modify),
                    new JCANamedPropertyObservableValue(realm, propertiesList, USER_NAME_PROP),
                    new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT, _panel);
        }

        @Override
        public Composite getPanel() {
            return _panel;
        }

        @Override
        public void setBinding(Binding impl) {
            super.setBinding(impl);
            _binding = (JCABinding) impl;
            _bindingValue.setValue(_binding);
            _propsList.setTargetObject(_binding);
            if (_destinationTypeValue.getValue() != null) {
                String value = (String) _destinationTypeValue.getValue();
                if (value.equalsIgnoreCase("JNDI")) {
                    _jndiLookupSelectionValue.setValue(Boolean.TRUE);
                } else {
                    _jndiLookupSelectionValue.setValue(Boolean.FALSE);
                }
            }
        }
    }
}
