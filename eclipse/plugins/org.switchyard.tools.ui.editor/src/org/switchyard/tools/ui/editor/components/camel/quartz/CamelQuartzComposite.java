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
package org.switchyard.tools.ui.editor.components.camel.quartz;

import java.util.Arrays;
import java.util.TimeZone;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzPackage;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;
import org.switchyard.tools.ui.editor.databinding.EscapedPropertyIntegerValidator;
import org.switchyard.tools.ui.editor.databinding.EscapedPropertyLongValidator;
import org.switchyard.tools.ui.editor.databinding.ObservablesUtil;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;
import org.switchyard.tools.ui.editor.databinding.StringEmptyValidator;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorComposite;

/**
 * @author bfitzpat
 * 
 */
public class CamelQuartzComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelQuartzBindingType _binding = null;
    private Text _nameText;
    private Text _cronText;
    private Text _startTimeText;
    private Text _endTimeText;
    private Text _repeatCountText;
    private Text _repeatIntervalText;
    private Combo _quartzTypeCombo;
    private ComboViewer _timezoneViewer;
    private OperationSelectorComposite _opSelectorComposite;
    private WritableValue _bindingValue;
    private org.eclipse.core.databinding.Binding _cronBinding;
    private IObservableValue _cronValue;
    private org.eclipse.core.databinding.Binding _repeatIntervalBinding;
    private IObservableValue _repeatIntervalValue;
    private org.eclipse.core.databinding.Binding _repeatCountBinding;
    private IObservableValue _repeatCountValue;

    CamelQuartzComposite(FormToolkit toolkit) {
        super(toolkit);
    }

    @Override
    public String getTitle() {
        return Messages.title_schedulingBindingDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_schedulingBindingDetails;
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof CamelQuartzBindingType) {
            _binding = (CamelQuartzBindingType) impl;

            _bindingValue.setValue(_binding);

            // refresh the operation selector control
            if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed() && getTargetObject() != null) {
                _opSelectorComposite.setTargetObject(getTargetObject());
            }

            if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed() && _binding != null) {
                _opSelectorComposite.setBinding(_binding);
            }
            
            if (_binding != null) {
                boolean cronSet = _binding.getCron() != null;
                boolean repeatCountSet = _binding.getTriggerRepeatCount() != null;
                boolean repeatIntervalSet = _binding.getTriggerRepeatInterval() != null;
                if (cronSet) {
                    _quartzTypeCombo.select(0);
                } else if (repeatCountSet || repeatIntervalSet) {
                    _quartzTypeCombo.select(1);
                } else if (!cronSet && !repeatCountSet && !repeatIntervalSet) {
                    _quartzTypeCombo.select(0);
                }
                handleScheduleTypeSelection();
            }
        } else {
            _bindingValue.setValue(null);
        }
    }

    @Override
    public void setTargetObject(EObject target) {
        super.setTargetObject(target);
        if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed()) {
            _opSelectorComposite.setTargetObject((EObject) target);
        }
    }

    @Override
    public void createContents(Composite parent, int style, DataBindingContext context) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getSchedulerTabControl(_panel);
        
        bindControls(context);
    }

    private Control getSchedulerTabControl(Composite tabFolder) {
        Composite composite = getToolkit().createComposite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);

        _nameText = createLabelAndText(composite, Messages.label_nameStar);
        
        _quartzTypeCombo = createLabelAndCombo(composite, "Scheduling Type", true);
        _quartzTypeCombo.add("cron");
        _quartzTypeCombo.add("trigger");
        _quartzTypeCombo.addSelectionListener(new SelectionListener(){
            @Override
            public void widgetSelected(SelectionEvent e) {
                handleScheduleTypeSelection();
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
            }
        });
        _quartzTypeCombo.select(0);
        
        _cronText = createLabelAndText(composite, Messages.label_cronStar, 1, "The cron field is only mandatory when the Scheduling Type is set to 'cron'.");

        _repeatCountText = createLabelAndText(composite, "Repeat Count");
        _repeatIntervalText = createLabelAndText(composite, "Repeat Interval");

        _startTimeText = createLabelAndText(composite, Messages.label_startTime);
        _endTimeText = createLabelAndText(composite, Messages.label_endTime);

        _timezoneViewer = createLabelAndComboViewer(composite, Messages.label_timeZone, true);
        _timezoneViewer.setContentProvider(ArrayContentProvider.getInstance());
        _timezoneViewer.setLabelProvider(new LabelProvider());
        String[] timezones = TimeZone.getAvailableIDs();
        String[] tzPlusBlank = Arrays.copyOf(timezones, timezones.length + 1);
        tzPlusBlank[timezones.length] = "";
        Arrays.sort(tzPlusBlank);
        _timezoneViewer.setInput(tzPlusBlank);

        _opSelectorComposite = new OperationSelectorComposite(composite, SWT.NONE, this);
        _opSelectorComposite.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
        _opSelectorComposite.setLayout(new GridLayout(2, false));
        _opSelectorComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                handleModify(_opSelectorComposite);
            }
        });

        return composite;
    }

    private void handleScheduleTypeSelection() {
        boolean cronEnabled = _quartzTypeCombo.getSelectionIndex() == 0;
        _cronText.setEnabled(cronEnabled);
        _repeatCountText.setEnabled(!cronEnabled);
        _repeatIntervalText.setEnabled(!cronEnabled);
        if (!cronEnabled) {
            _cronValue.setValue(null);
        } else {
            _repeatCountValue.setValue(null);
            _repeatIntervalValue.setValue(null);
        }
        _cronBinding.validateTargetToModel();
        _repeatCountBinding.validateTargetToModel();
        _repeatIntervalBinding.validateTargetToModel();
    }
    
    @Override
    public Composite getPanel() {
        return this._panel;
    }

    protected void handleModify(final Control control) {
        // at this point, this is the only control we can't do with strict
        // databinding
        if (control.equals(_opSelectorComposite)) {
            fireChangedEvent(_opSelectorComposite);
        }
        setHasChanged(false);
        setDidSomething(true);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            super.handleUndo(control);
        }
    }

    private void bindControls(final DataBindingContext context) {
        final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(getTargetObject());
        final Realm realm = SWTObservables.getRealm(_nameText.getDisplay());

        _bindingValue = new WritableValue(realm, null, CamelQuartzBindingType.class);

        org.eclipse.core.databinding.Binding binding = context.bindValue(
                SWTObservables.observeText(_nameText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue,
                        QuartzPackage.Literals.CAMEL_QUARTZ_BINDING_TYPE__CAMEL_BINDING_NAME),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyValidator(
                                "Schedule binding name should not be empty", Status.WARNING)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        /*
         * we also want to bind the name field to the binding name. note that
         * the model to target updater is configured to NEVER update. we want
         * the camel binding name to be the definitive source for this field.
         */
        binding = context.bindValue(SWTObservables.observeText(_nameText, new int[] {SWT.Modify }), ObservablesUtil
                .observeDetailValue(domain, _bindingValue,
                        QuartzPackage.Literals.CAMEL_QUARTZ_BINDING_TYPE__CAMEL_BINDING_NAME),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyValidator(
                                "Schedule binding name should not be empty", Status.WARNING)), new UpdateValueStrategy(
                        UpdateValueStrategy.POLICY_NEVER));
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
        
        _cronValue = ObservablesUtil.observeDetailValue(domain, _bindingValue,
                QuartzPackage.Literals.CAMEL_QUARTZ_BINDING_TYPE__CRON);
        _cronBinding = context
                .bindValue(
                        SWTObservables.observeText(_cronText, new int[] {SWT.Modify }),
                        _cronValue,
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                                .setAfterConvertValidator(new StringEmptyValidatorControlAware(
                                        Messages.CamelQuartzComposite_Validation_CRON_Empty, _cronText)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_cronBinding), SWT.TOP | SWT.LEFT);

        EMFUpdateValueStrategy startTimeStrategy = new EMFUpdateValueStrategyNullForEmptyString(
                Messages.CamelQuartzComposite_Validation_Start_Time_Format,
                UpdateValueStrategy.POLICY_CONVERT);
        
        binding = context
                .bindValue(
                        SWTObservables.observeText(_startTimeText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                QuartzPackage.Literals.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_START_TIME),
                        startTimeStrategy, null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        EMFUpdateValueStrategy endTimeStrategy = new EMFUpdateValueStrategyNullForEmptyString(
                Messages.CamelQuartzComposite_Validation_End_Time_Format,
                UpdateValueStrategy.POLICY_CONVERT);

        binding = context.bindValue(
                SWTObservables.observeText(_endTimeText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue,
                        QuartzPackage.Literals.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_END_TIME),
                endTimeStrategy, null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context.bindValue(
                ViewersObservables.observeSingleSelection(_timezoneViewer),
                ObservablesUtil.observeDetailValue(domain, _bindingValue,
                        QuartzPackage.Literals.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_TIME_ZONE),
                new EMFUpdateValueStrategyNullForEmptyString(
                        null, UpdateValueStrategy.POLICY_CONVERT), null);

        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        _repeatCountValue = ObservablesUtil.observeDetailValue(domain, _bindingValue,
                QuartzPackage.Literals.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_REPEAT_COUNT);
        _repeatCountBinding = context
                .bindValue(
                        SWTObservables.observeText(_repeatCountText, new int[] {SWT.Modify }),
                        _repeatCountValue,
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                            .setAfterConvertValidator(new EscapedPropertyIntegerValidatorControlAware(
                                "Repeat Count must be a valid numeric value or follow the pattern for escaped properties (i.e. '${propName}').", _repeatCountText)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_repeatCountBinding), SWT.TOP | SWT.LEFT);

        _repeatIntervalValue = ObservablesUtil.observeDetailValue(domain, _bindingValue,
                QuartzPackage.Literals.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_REPEAT_INTERVAL);
        _repeatIntervalBinding = context
                .bindValue(
                        SWTObservables.observeText(_repeatIntervalText, new int[] {SWT.Modify }),
                        _repeatIntervalValue,
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                            .setAfterConvertValidator(new EscapedPropertyLongValidatorControlAware(
                                    "Repeat Interval must be a valid numeric value or follow the pattern for escaped properties (i.e. '${propName}').", _repeatIntervalText)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_repeatIntervalBinding), SWT.TOP | SWT.LEFT);
        

        _opSelectorComposite.bindControls(domain, context);
    }

    /* (non-Javadoc)
     * @see org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite#dispose()
     */
    @Override
    public void dispose() {
        _bindingValue.dispose();
        super.dispose();
    }

    private class StringEmptyValidatorControlAware extends StringEmptyValidator {

        private Control _control = null;
        
        public StringEmptyValidatorControlAware(String message, Control control) {
            super(message);
            _control = control;
        }
        
        @Override
        public IStatus validate(Object value) {
            if (_control != null && !_control.isEnabled()) {
                return Status.OK_STATUS;
            }
            return super.validate(value);
        }
    }
    
    private class EscapedPropertyLongValidatorControlAware extends EscapedPropertyLongValidator {

        private Control _control = null;
        
        public EscapedPropertyLongValidatorControlAware(String message, Control control) {
            super(message);
            _control = control;
        }
        
        @Override
        public IStatus validate(Object value) {
            if (_control != null && !_control.isEnabled()) {
                return Status.OK_STATUS;
            }
            return super.validate(value);
        }
    }
    
    private class EscapedPropertyIntegerValidatorControlAware extends EscapedPropertyIntegerValidator {
        
        private Control _control = null;
        
        public EscapedPropertyIntegerValidatorControlAware(String message, Control control) {
            super(message);
            _control = control;
        }
        
        @Override
        public IStatus validate(Object value) {
            if (_control != null && !_control.isEnabled()) {
                return Status.OK_STATUS;
            }
            return super.validate(value);
        }
    }
}
