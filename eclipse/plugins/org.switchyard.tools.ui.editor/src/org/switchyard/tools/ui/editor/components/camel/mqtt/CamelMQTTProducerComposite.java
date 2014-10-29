/******************************************************************************* 
 * Copyright (c) 2014 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ******************************************************************************/
package org.switchyard.tools.ui.editor.components.camel.mqtt;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.camel.mqtt.CamelMqttBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage;
import org.switchyard.tools.models.switchyard1_0.camel.mqtt.QualityOfServiceType;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.CompoundValidator;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;
import org.switchyard.tools.ui.editor.databinding.EscapedPropertyIntegerValidator;
import org.switchyard.tools.ui.editor.databinding.ObservablesUtil;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;
import org.switchyard.tools.ui.editor.databinding.StringEmptyValidator;
import org.switchyard.tools.ui.editor.databinding.URLValidator;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;

/**
 * @author bfitzpat
 * 
 */
public class CamelMQTTProducerComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelMqttBindingType _binding = null;
    private Text _nameText;
    private Text _hostURIText;
    private Text _publishTopicNameText;
    private Button _byDefaultRetainCheckbox;
    private WritableValue _bindingValue;
    private Text _connectAttemptsMaxText;
    private Text _reconnectAttemptsMaxText;
    private ComboViewer _qosCombo;

    CamelMQTTProducerComposite(FormToolkit toolkit) {
        super(toolkit);
    }

    @Override
    public String getTitle() {
        return "MQTT Binding";
    }

    @Override
    public String getDescription() {
        return "MQTT Binding";
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof CamelMqttBindingType) {
            _binding = (CamelMqttBindingType) impl;

            _bindingValue.setValue(_binding);
        } else {
            _bindingValue.setValue(null);
        }
    }

    @Override
    public void createContents(Composite parent, int style, DataBindingContext context) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getProducerTabControl(_panel);

        bindControls(context);
    }

    private Control getProducerTabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);

        _nameText = createLabelAndText(composite, Messages.label_name);

        _hostURIText = createLabelAndText(composite, "Host URI (Default: tcp://127.0.0.1:1883)");
        _publishTopicNameText = createLabelAndText(composite, "Publish Topic Name");
        _connectAttemptsMaxText = createLabelAndText(composite, "Connect Attempts Max");
        _reconnectAttemptsMaxText = createLabelAndText(composite, "Reconnect Attempts Max");

        getToolkit().createLabel(composite, "Quality of Service", SWT.NONE);
        _qosCombo = new ComboViewer(composite);
        _qosCombo.getControl().setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
        _qosCombo.setContentProvider(ArrayContentProvider.getInstance());
        _qosCombo.setLabelProvider(new LabelProvider());
        QualityOfServiceType[] qosTypes = new QualityOfServiceType[] {QualityOfServiceType.AT_MOST_ONCE,
                QualityOfServiceType.AT_LEAST_ONCE, QualityOfServiceType.EXACTLY_ONCE
        };
        _qosCombo.setInput(qosTypes);
        getToolkit().adapt(_qosCombo.getControl(), true, true);
        
        _byDefaultRetainCheckbox = createCheckbox(composite, "Retain By Default", 2);

        return composite;
    }

    @Override
    public Composite getPanel() {
        return this._panel;
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            super.handleUndo(control);
        }
    }

    private void bindControls(final DataBindingContext context) {
        final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(getTargetObject());
        final Realm realm = SWTObservables.getRealm(_nameText.getDisplay());

        _bindingValue = new WritableValue(realm, null, CamelMqttBindingType.class);

        org.eclipse.core.databinding.Binding binding = context.bindValue(
                SWTObservables.observeText(_nameText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue,
                        ScaPackage.eINSTANCE.getBinding_Name()),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyValidator(
                                "MQTT binding name should not be empty", Status.WARNING)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        CompoundValidator uriValidator = new CompoundValidator(
                new URLValidator("Potential problem with Host URI")); 

        binding = context
                .bindValue(
                        SWTObservables.observeText(_hostURIText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                MqttPackage.Literals.CAMEL_MQTT_BINDING_TYPE__HOST),
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                                .setAfterConvertValidator(uriValidator), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
        
        binding = context
                .bindValue(
                        SWTObservables.observeText(_publishTopicNameText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                MqttPackage.Literals.CAMEL_MQTT_BINDING_TYPE__PUBLISH_TOPIC_NAME),
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                                , null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
        
        binding = context
                .bindValue(
                        SWTObservables.observeText(_connectAttemptsMaxText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                MqttPackage.Literals.CAMEL_MQTT_BINDING_TYPE__CONNECT_ATTEMPTS_MAX),
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                                .setAfterConvertValidator(new EscapedPropertyIntegerValidator(
                                        "Connect Attempts Max must be a valid numeric value or follow the pattern for escaped properties (i.e. '${propName}').")), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_reconnectAttemptsMaxText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                MqttPackage.Literals.CAMEL_MQTT_BINDING_TYPE__RECONNECT_ATTEMPTS_MAX),
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new EscapedPropertyIntegerValidator(
                                "Reconnect Attempts Max must be a valid numeric value or follow the pattern for escaped properties (i.e. '${propName}').")), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context.bindValue(
                ViewersObservables.observeSingleSelection(_qosCombo),
                ObservablesUtil.observeDetailValue(domain, _bindingValue,
                        MqttPackage.Literals.CAMEL_MQTT_BINDING_TYPE__QUALITY_OF_SERVICE),
                new EMFUpdateValueStrategyNullForEmptyString(
                        null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeSelection(_byDefaultRetainCheckbox),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                MqttPackage.Literals.CAMEL_MQTT_BINDING_TYPE__BY_DEFAULT_RETAIN),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
    }

    /* (non-Javadoc)
     * @see org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite#dispose()
     */
    @Override
    public void dispose() {
        _bindingValue.dispose();
        super.dispose();
    }
}
