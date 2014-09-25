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
package org.switchyard.tools.ui.editor.components.camel.file;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;
import org.switchyard.tools.ui.editor.databinding.EscapedPropertyIntegerValidator;
import org.switchyard.tools.ui.editor.databinding.ObservablesUtil;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;
import org.switchyard.tools.ui.editor.databinding.StringEmptyValidator;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorComposite;

/**
 * @author bfitzpat
 * 
 */
public class CamelFileConsumerComposite extends AbstractSYBindingComposite  {

    private Composite _panel;
    private CamelFileBindingType _binding = null;
    private Text _nameText;
    private Text _directoryText;
    private Text _fileNameText;
    private Button _autoCreateButton;
    private Text _includeText;
    private Text _excludeText;
    private Text _preMoveText;
    private Text _moveText;
    private Text _moveFailedText;
    private Text _maxMessagesPerPollText;
    private Text _delayText;
    private OperationSelectorComposite _opSelectorComposite;
    private WritableValue _bindingValue;

    CamelFileConsumerComposite(FormToolkit toolkit) {
        super(toolkit);
    }

    @Override
    public String getTitle() {
        return Messages.title_fileBindingDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_fileBindingDetails;
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof CamelFileBindingType) {
            _binding = (CamelFileBindingType) impl;

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

        getConsumerTabControl(_panel);
        
        bindControls(context);
    }

    private Control getConsumerTabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);

        _nameText = createLabelAndText(composite, Messages.label_name);

        _directoryText = createLabelAndText(composite, Messages.label_directoryStar);
        _fileNameText = createLabelAndText(composite, Messages.label_fileName);

        _autoCreateButton = createCheckbox(composite, Messages.label_autoCreateMissingDirectories, 2);
        _includeText = createLabelAndText(composite, Messages.label_include);
        _excludeText = createLabelAndText(composite, Messages.label_exclude);

        _opSelectorComposite = new OperationSelectorComposite(composite, SWT.NONE, this);
        _opSelectorComposite.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
        _opSelectorComposite.setLayout(new GridLayout(2, false));
        _opSelectorComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                handleModify(_opSelectorComposite);
            }
         });
        
        Group moveGroup = new Group(composite, SWT.NONE);
        moveGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
        moveGroup.setLayout(new GridLayout(2, false));
        moveGroup.setText(Messages.label_moveOptions);

        _preMoveText = createLabelAndText(moveGroup, Messages.label_preMove);
        _moveText = createLabelAndText(moveGroup, Messages.label_moveDefaultDotCamel);
        _moveFailedText = createLabelAndText(moveGroup, Messages.label_moveFailed);

        Group pollGroup = new Group(composite, SWT.NONE);
        pollGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
        pollGroup.setLayout(new GridLayout(2, false));
        pollGroup.setText(Messages.label_pollOptions);

        _maxMessagesPerPollText = createLabelAndText(pollGroup, Messages.label_maxMessagesPerPollDefault0);
        _delayText = createLabelAndText(pollGroup, Messages.label_delayBetweenPollsDefault500);

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

        _bindingValue = new WritableValue(realm, null, CamelFileBindingType.class);

        org.eclipse.core.databinding.Binding binding = context.bindValue(
                SWTObservables.observeText(_nameText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue,
                        ScaPackage.eINSTANCE.getBinding_Name()),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyValidator(
                                "File binding name should not be empty", Status.WARNING)), null);
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
                                "File binding name should not be empty", Status.WARNING)), new UpdateValueStrategy(
                        UpdateValueStrategy.POLICY_NEVER));
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_directoryText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                FilePackage.Literals.CAMEL_FILE_BINDING_TYPE__DIRECTORY),
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                                .setAfterConvertValidator(new StringEmptyValidator(
                                        Messages.error_emptyDirectory)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_fileNameText , new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                FilePackage.Literals.CAMEL_FILE_BINDING_TYPE__FILE_NAME),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                "", UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeSelection(_autoCreateButton),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                FilePackage.Literals.CAMEL_FILE_BINDING_TYPE__AUTO_CREATE),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        bindConsumeControls(context, domain);
        
        _opSelectorComposite.bindControls(domain, context);
    }

    private void bindConsumeControls(final DataBindingContext context, final EditingDomain domain) {
        FeaturePath path = FeaturePath.fromList(
                FilePackage.Literals.CAMEL_FILE_BINDING_TYPE__CONSUME,
                FilePackage.Literals.FILE_CONSUMER_TYPE__INCLUDE
              );
        
        org.eclipse.core.databinding.Binding binding = context
                .bindValue(
                        SWTObservables.observeText(_includeText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                path),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(
                FilePackage.Literals.CAMEL_FILE_BINDING_TYPE__CONSUME,
                FilePackage.Literals.FILE_CONSUMER_TYPE__EXCLUDE
              );
        
        binding = context
                .bindValue(
                        SWTObservables.observeText(_excludeText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                path),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(
                FilePackage.Literals.CAMEL_FILE_BINDING_TYPE__CONSUME,
                FilePackage.Literals.FILE_CONSUMER_TYPE__PRE_MOVE
              );
        
        binding = context
                .bindValue(
                        SWTObservables.observeText(_preMoveText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                path),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(
                FilePackage.Literals.CAMEL_FILE_BINDING_TYPE__CONSUME,
                FilePackage.Literals.FILE_CONSUMER_TYPE__MOVE
              );
        
        binding = context
                .bindValue(
                        SWTObservables.observeText(_moveText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                path),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(
                FilePackage.Literals.CAMEL_FILE_BINDING_TYPE__CONSUME,
                FilePackage.Literals.FILE_CONSUMER_TYPE__MOVE_FAILED
              );
        
        binding = context
                .bindValue(
                        SWTObservables.observeText(_moveFailedText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                path),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(
                FilePackage.Literals.CAMEL_FILE_BINDING_TYPE__CONSUME,
                FilePackage.Literals.FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL
              );
        
        binding = context
                .bindValue(
                        SWTObservables.observeText(_maxMessagesPerPollText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                path),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null,
                                UpdateValueStrategy.POLICY_CONVERT).setAfterConvertValidator(
                                        new EscapedPropertyIntegerValidator("Max Messages per Poll must be a valid numeric value or follow the pattern for escaped properties (i.e. '${propName}')."))
                                        , null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(
                FilePackage.Literals.CAMEL_FILE_BINDING_TYPE__CONSUME,
                FilePackage.Literals.FILE_CONSUMER_TYPE__DELAY
              );
        
        binding = context
                .bindValue(
                        SWTObservables.observeText(_delayText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                path),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null,
                                UpdateValueStrategy.POLICY_CONVERT).setAfterConvertValidator(
                                        new EscapedPropertyIntegerValidator("Delay must be a valid numeric value or follow the pattern for escaped properties (i.e. '${propName}')."))
                                        , null);
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
