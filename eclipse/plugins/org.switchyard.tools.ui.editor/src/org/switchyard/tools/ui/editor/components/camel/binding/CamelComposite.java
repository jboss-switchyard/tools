/******************************************************************************* 
 * Copyright (c) 2013-2014 Red Hat, Inc. 
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
package org.switchyard.tools.ui.editor.components.camel.binding;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.camel.core.CamelBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.CompoundValidator;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;
import org.switchyard.tools.ui.editor.databinding.ObservablesUtil;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;
import org.switchyard.tools.ui.editor.databinding.StringEmptyValidator;
import org.switchyard.tools.ui.editor.databinding.URLValidator;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorComposite;

/**
 * @author bfitzpat
 * 
 */
public class CamelComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelBindingType _binding = null;
    private Text _nameText;
    private Text _configURIText;
    private OperationSelectorComposite _opSelectorComposite;
    private WritableValue _bindingValue;

    CamelComposite(FormToolkit toolkit) {
        super(toolkit);
    }

    @Override
    public String getTitle() {
        return Messages.title_camelBindingDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_camelBindingDetails;
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof CamelBindingType) {
            this._binding = (CamelBindingType) impl;
            _bindingValue.setValue(_binding);

            // refresh the operation selector control
            if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed() && getTargetObject() != null) {
                _opSelectorComposite.setTargetObject(getTargetObject());
                _opSelectorComposite.setBinding(_binding);
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
        if (getRootGridData() != null) {
            _panel.setLayoutData(getRootGridData());
        }

        getCamelTabControl(_panel);

        if (getTargetObject() != null && getTargetObject() instanceof Service) {
            if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed()) {
                _opSelectorComposite.setTargetObject((EObject) getTargetObject());
            }
        }
        bindControls(context);
    }

    private Control getCamelTabControl(Composite tabFolder) {
        Composite composite = getToolkit().createComposite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);

        _nameText = createLabelAndText(composite, Messages.label_name);

        _configURIText = createLabelAndText(composite, Messages.label_configUriStar);

        if (getTargetObject() != null && getTargetObject() instanceof Service) {
            _opSelectorComposite = new OperationSelectorComposite(composite, SWT.NONE, this);
            _opSelectorComposite.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
            _opSelectorComposite.setLayout(new GridLayout(2, false));
            _opSelectorComposite.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    handleModify(_opSelectorComposite);
                }
             });
        }

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

        _bindingValue = new WritableValue(realm, null, CamelBindingType.class);

        org.eclipse.core.databinding.Binding binding = context.bindValue(
                SWTObservables.observeText(_nameText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue,
                        ScaPackage.eINSTANCE.getBinding_Name()),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyValidator(
                                "Camel binding name cannot be empty")), null);
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
                                "Camel binding name cannot be empty")), new UpdateValueStrategy(
                        UpdateValueStrategy.POLICY_NEVER));
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        final IObservableValue configURIValue = ObservablesUtil.observeDetailValue(domain, _bindingValue,
                CorePackage.Literals.CAMEL_BINDING_TYPE__CONFIG_URI);

        CompoundValidator uriValidator = new CompoundValidator(
                new StringEmptyValidator(Messages.error_configUriMayNotBeEmpty),
                new URLValidator("Potential problem with Camel URI")); 
        
        binding = context
                .bindValue(
                        SWTObservables.observeText(_configURIText, new int[] {SWT.Modify }),
                        configURIValue,
                        new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                                .setAfterConvertValidator(uriValidator), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        if (_opSelectorComposite != null) {
            _opSelectorComposite.bindControls(domain, context);
        }
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
