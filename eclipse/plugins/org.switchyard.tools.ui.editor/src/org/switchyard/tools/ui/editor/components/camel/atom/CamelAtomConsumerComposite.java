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
package org.switchyard.tools.ui.editor.components.camel.atom;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.camel.atom.AtomPackage;
import org.switchyard.tools.models.switchyard1_0.camel.atom.CamelAtomBindingType;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.CompoundValidator;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;
import org.switchyard.tools.ui.editor.databinding.ObservablesUtil;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;
import org.switchyard.tools.ui.editor.databinding.StringEmptyValidator;
import org.switchyard.tools.ui.editor.databinding.URLValidator;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;

/**
 * @author bfitzpat
 * 
 */
public class CamelAtomConsumerComposite extends AbstractSYBindingComposite  {

    private Composite _panel;
    private CamelAtomBindingType _binding = null;
    private Text _nameText;
    private Text _feedURIText;
    private Text _lastUpdateText;
    private Text _delayText;
    private Button _filterCheckbox;
    private Button _splitEntriesCheckbox;
    private WritableValue _bindingValue;
    private Button _sortEntriesCheckbox;

    CamelAtomConsumerComposite(FormToolkit toolkit) {
        super(toolkit);
    }

    @Override
    public String getTitle() {
        return "Atom Binding";
    }

    @Override
    public String getDescription() {
        return "Atom Binding";
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof CamelAtomBindingType) {
            _binding = (CamelAtomBindingType) impl;

            _bindingValue.setValue(_binding);

            _filterCheckbox.setEnabled(_splitEntriesCheckbox.getSelection());
            _lastUpdateText.setEnabled(_splitEntriesCheckbox.getSelection());
            _sortEntriesCheckbox.setEnabled(_splitEntriesCheckbox.getSelection());
        } else {
            _bindingValue.setValue(null);
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

        _feedURIText = createLabelAndText(composite, "Feed URI*");
        
        getToolkit().createLabel(composite, "");
        getToolkit().createLabel(composite, "");

        Group splitEntryOptionsGroup = new Group(composite, SWT.NONE);
        splitEntryOptionsGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
        splitEntryOptionsGroup.setLayout(new GridLayout(2, false));
        splitEntryOptionsGroup.setText("Split Entry Options");

        _splitEntriesCheckbox = createCheckbox(splitEntryOptionsGroup, "Split Entries", 2);
        _filterCheckbox = createCheckbox(splitEntryOptionsGroup, "Filter", 2);
        _lastUpdateText = createLabelAndText(splitEntryOptionsGroup, "Last Update (Starting Timestamp)");
        _sortEntriesCheckbox = createCheckbox(splitEntryOptionsGroup, "Sort Entries (by Date)", 2);

        Group pollOptionsGroup = new Group(composite, SWT.NONE);
        pollOptionsGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
        pollOptionsGroup.setLayout(new GridLayout(2, false));
        pollOptionsGroup.setText("Poll Options");

        _delayText = createLabelAndText(pollOptionsGroup, "Delay Between Polls (MS) (Default 500)");

        return composite;
    }

    @Override
    public Composite getPanel() {
        return this._panel;
    }

    protected void handleModify(final Control control) {
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

        _bindingValue = new WritableValue(realm, null, CamelAtomBindingType.class);

        org.eclipse.core.databinding.Binding binding = context.bindValue(
                SWTObservables.observeText(_nameText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue,
                        ScaPackage.eINSTANCE.getBinding_Name()),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyValidator(
                                "Atom binding name should not be empty", Status.WARNING)), null);
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
                                "Atom binding name should not be empty", Status.WARNING)), new UpdateValueStrategy(
                        UpdateValueStrategy.POLICY_NEVER));
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        CompoundValidator uriValidator = new CompoundValidator(
                new StringEmptyValidator("Feed URI may not be empty."),
                new URLValidator("Potential problem with Feed URI")); 

        binding = context
                .bindValue(
                        SWTObservables.observeText(_feedURIText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                AtomPackage.Literals.CAMEL_ATOM_BINDING_TYPE__FEED_URI),
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                                .setAfterConvertValidator(uriValidator), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        final IObservableValue splitEntriesCheckboxValue = SWTObservables.observeSelection(_splitEntriesCheckbox);
        final IObservableValue filterValue = ObservablesUtil.observeDetailValue(domain, _bindingValue,
                AtomPackage.Literals.CAMEL_ATOM_BINDING_TYPE__FILTER);
        final IObservableValue lastUpdateValue = ObservablesUtil.observeDetailValue(domain, _bindingValue,
                AtomPackage.Literals.CAMEL_ATOM_BINDING_TYPE__LAST_UPDATE);
        final IObservableValue sortEntriesValue =  ObservablesUtil.observeDetailValue(domain, _bindingValue,
                AtomPackage.Literals.CAMEL_ATOM_BINDING_TYPE__SORT_ENTRIES);
                
        binding = context
                .bindValue(
                        splitEntriesCheckboxValue,
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                AtomPackage.Literals.CAMEL_ATOM_BINDING_TYPE__SPLIT_ENTRIES),
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
        
        _splitEntriesCheckbox.addSelectionListener(new SelectionListener(){

            @Override
            public void widgetSelected(SelectionEvent e) {
                _filterCheckbox.setEnabled(_splitEntriesCheckbox.getSelection());
                _lastUpdateText.setEnabled(_splitEntriesCheckbox.getSelection());
                _sortEntriesCheckbox.setEnabled(_splitEntriesCheckbox.getSelection());
                if (!_splitEntriesCheckbox.getSelection()) {
                    filterValue.setValue(Boolean.TRUE); // default
                    lastUpdateValue.setValue(null); // default
                    sortEntriesValue.setValue(Boolean.FALSE); // default
                }
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
            }
        });

        binding = context
                .bindValue(
                        SWTObservables.observeSelection(_filterCheckbox),
                        filterValue,
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeText(_lastUpdateText, new int[] {SWT.Modify }),
                        lastUpdateValue,
                        new EMFUpdateValueStrategyNullForEmptyString(
                                "Last Update must match the format yyyy-MM-ddTHH:mm:ss",
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context
                .bindValue(
                        SWTObservables.observeSelection(_sortEntriesCheckbox),
                        sortEntriesValue,
                        new EMFUpdateValueStrategyNullForEmptyString(
                                null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        FeaturePath path = FeaturePath.fromList(
                AtomPackage.Literals.CAMEL_ATOM_BINDING_TYPE__CONSUME,
                AtomPackage.Literals.ATOM_SCHEDULED_POLL_CONSUMER_TYPE__DELAY
              );
        binding = context
                .bindValue(
                        SWTObservables.observeText(_delayText, new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                path),
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
