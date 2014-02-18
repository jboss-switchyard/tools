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
import org.eclipse.core.databinding.observable.value.WritableValue;
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
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzPackage;
import org.switchyard.tools.ui.editor.Messages;
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
public class CamelQuartzComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelQuartzBindingType _binding = null;
    private Text _nameText;
    private Text _cronText;
    private Text _startTimeText;
    private Text _endTimeText;
    private ComboViewer _timezoneViewer;
    private OperationSelectorComposite _opSelectorComposite;
    private WritableValue _bindingValue;

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

            _opSelectorComposite.setBinding(_binding);
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
        _cronText = createLabelAndText(composite, Messages.label_cronStar);
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
                                Messages.CamelQuartzComposite_Validation_Name_Empty)), null);
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
                                Messages.CamelQuartzComposite_Validation_Name_Empty)), new UpdateValueStrategy(
                        UpdateValueStrategy.POLICY_NEVER));
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_cronText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                QuartzPackage.Literals.CAMEL_QUARTZ_BINDING_TYPE__CRON),
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                                .setAfterConvertValidator(new StringEmptyValidator(
                                        Messages.CamelQuartzComposite_Validation_CRON_Empty)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

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
}
