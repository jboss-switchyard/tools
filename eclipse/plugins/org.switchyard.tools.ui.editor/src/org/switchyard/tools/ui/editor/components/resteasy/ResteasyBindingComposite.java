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
package org.switchyard.tools.ui.editor.components.resteasy;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType;
import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;
import org.switchyard.tools.ui.editor.databinding.EscapedPropertyIntegerValidator;
import org.switchyard.tools.ui.editor.databinding.ObservablesUtil;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;
import org.switchyard.tools.ui.editor.databinding.StringEmptyValidator;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;

/**
 * @author bfitzpat
 * 
 */
public class ResteasyBindingComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private Text _nameText;
    private Text _mAddressURLText;
    private Text _contextPathText = null;
    private DelimitedStringList _interfacesList = null;
    private RESTBindingType _binding = null;
    private Text _requestTimeoutText = null;
    private WritableValue _bindingValue;

    ResteasyBindingComposite(FormToolkit toolkit) {
        super(toolkit);
    }

    @Override
    public String getTitle() {
        return Messages.title_restBindingDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_restBindingDetails;
    }

    @Override
    public void createContents(Composite parent, int style, DataBindingContext context) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getResteasyControl(_panel);

        bindControls(context);
    }

    private Control getResteasyControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);

        _nameText = createLabelAndText(composite, Messages.label_name);

        if (getTargetObject() instanceof Reference) {
            _mAddressURLText = createLabelAndText(composite, Messages.label_address);
            _mAddressURLText.setEnabled(canEdit());

            _requestTimeoutText = createLabelAndText(composite, Messages.label_requestTimeout);
            _requestTimeoutText.setEnabled(canEdit());
            
        } else {
            _contextPathText = createLabelAndText(composite, Messages.label_contextPath);
            _contextPathText.setEnabled(canEdit());
        }

        Label interfacesLabel = new Label(composite, SWT.NULL);
        interfacesLabel.setText(Messages.label_restfulInterfaces);
        interfacesLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, false, false, 2, 1));
        _interfacesList = new DelimitedStringList(composite, SWT.NULL, !canEdit());
        GridData ilGD = new GridData(GridData.FILL_HORIZONTAL);
        ilGD.horizontalSpan = 2;
        _interfacesList.setLayoutData(ilGD);

        return composite;
    }

    protected void handleModify(Control control) {
//        if (control.equals(_interfacesList)) {
//            fireChangedEvent(_interfacesList);
//        }
        setHasChanged(false);
        setDidSomething(true);
    }

    /**
     * @return panel
     */
    public Composite getPanel() {
        return _panel;
    }

    /**
     * @param switchYardBindingType binding
     */
    public void setBinding(Binding switchYardBindingType) {
        super.setBinding(switchYardBindingType);
        if (switchYardBindingType instanceof RESTBindingType) {
            setTargetObject(switchYardBindingType.eContainer());
            this._binding = (RESTBindingType) switchYardBindingType;
            _bindingValue.setValue(_binding);
            if (_interfacesList != null && !_interfacesList.isDisposed()) {
                if (_binding.getInterfaces() != null) {
                    this._interfacesList.setSelection(_binding.getInterfaces());
                }
            }
        } else {
            _bindingValue.setValue(null);
        }
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            super.handleUndo(control);
        }
    }

    private void bindControls(final DataBindingContext context) {
        final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(getTargetObject());
        final Realm realm = SWTObservables.getRealm(_nameText.getDisplay());

        _bindingValue = new WritableValue(realm, null, RESTBindingType.class);

        org.eclipse.core.databinding.Binding binding = context.bindValue(
                SWTObservables.observeText(_nameText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue,
                        ScaPackage.eINSTANCE.getBinding_Name()),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyValidator(
                                "REST binding name cannot be empty")), null);
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
                                "REST binding name cannot be empty")), new UpdateValueStrategy(
                        UpdateValueStrategy.POLICY_NEVER));
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        if (getTargetObject() instanceof Reference) {
            binding = context
                    .bindValue(
                            SWTObservables.observeText(_mAddressURLText , new int[] {SWT.Modify }),
                            ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                    ResteasyPackage.Literals.REST_BINDING_TYPE__ADDRESS),
                            new EMFUpdateValueStrategyNullForEmptyString(
                                    "", UpdateValueStrategy.POLICY_CONVERT), null);
            // TODO: Need to validate to make sure no spaces before/after address
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
    
            binding = context
                    .bindValue(
                            SWTObservables.observeText(_requestTimeoutText , new int[] {SWT.Modify }),
                            ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                    ResteasyPackage.Literals.REST_BINDING_TYPE__TIMEOUT),
                            new EMFUpdateValueStrategyNullForEmptyString("", 
                                    UpdateValueStrategy.POLICY_CONVERT).setAfterConvertValidator(
                                            new EscapedPropertyIntegerValidator("Request Timeout must be a valid numeric value or follow the pattern for escaped properties (i.e. '${propName}')."))
                                            , null);
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
        } else {
            binding = context
                    .bindValue(
                            SWTObservables.observeText(_contextPathText , new int[] {SWT.Modify }),
                            ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                    ResteasyPackage.Literals.REST_BINDING_TYPE__CONTEXT_PATH),
                            new EMFUpdateValueStrategyNullForEmptyString(
                                    "", UpdateValueStrategy.POLICY_CONVERT), null);
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
        }

        binding = context
                .bindValue(
                        SWTObservables.observeText(_interfacesList.getHiddenText() , new int[] {SWT.Modify }),
                        ObservablesUtil.observeDetailValue(domain, _bindingValue,
                                ResteasyPackage.Literals.REST_BINDING_TYPE__INTERFACES),
                        new EMFUpdateValueStrategyNullForEmptyString("", UpdateValueStrategy.POLICY_CONVERT).
                            setAfterConvertValidator(new StringEmptyValidator(Messages.error_noRestInterfaceOrClass)), 
                            null);
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
