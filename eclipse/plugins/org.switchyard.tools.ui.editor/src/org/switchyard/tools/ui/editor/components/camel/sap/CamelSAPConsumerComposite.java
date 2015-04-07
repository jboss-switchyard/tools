/*************************************************************************************
 * Copyright (c) 2015 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.editor.components.camel.sap;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
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
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListServerType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcServerType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcServerType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.SapFactory;
import org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;
import org.switchyard.tools.ui.editor.databinding.ObservablesUtil;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;
import org.switchyard.tools.ui.editor.databinding.StringEmptyControlAwareValidator;
import org.switchyard.tools.ui.editor.databinding.StringEmptyValidator;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;

/**
 * @author bfitzpat
 * 
 */
public class CamelSAPConsumerComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelSapBindingType _binding = null;
    private Text _nameText;
    private Composite _iDocPage;
    private Composite _sRFCPage;
    private Composite _tRFCPage;
    private WritableValue _bindingValue;
    private Text _idocServerText;
    private Text _idocTypeText;
    private Text _idocTypeExtText;
    private Text _systemReleaseText;
    private Text _applicationReleaseText;
    private Text _srfcServerText;
    private Text _srfcRFCNameText;
    private Text _tRFCServerText;
    private Text _trfcRFCNameText;
    private Composite _contentPanel;
    private StackLayout _layout;
    private Combo _typeCombo;
    private org.eclipse.core.databinding.Binding _idocServerTextBinding;
    private org.eclipse.core.databinding.Binding _idocTypeTextBinding;
    private org.eclipse.core.databinding.Binding _tRFCServerTextBinding;
    private org.eclipse.core.databinding.Binding _sRFCServerTextBinding;
    private org.eclipse.core.databinding.Binding _tRFCRFCTextBinding;
    private org.eclipse.core.databinding.Binding _sRFCRFCTextBinding;

    CamelSAPConsumerComposite(FormToolkit toolkit) {
        super(toolkit);
    }

    @Override
    public String getTitle() {
        return "SAP Binding Details";
    }

    @Override
    public String getDescription() {
        return "Specify pertinent details for your SAP Binding.";
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof CamelSapBindingType) {
            this._binding = (CamelSapBindingType) impl;
            if (_binding.getIdoclistServer() == null && _binding.getTrfcServer() == null
                    && _binding.getSrfcServer() == null) {
                _typeCombo.setText("IDoc List");
                handleSelection("IDoc List");
            } else if (_binding.getIdoclistServer() != null) {
                _typeCombo.setText("IDoc List");
                handleSelection("IDoc List");
            } else if (_binding.getSrfcServer() != null) {
                _typeCombo.setText("sRFC");
                handleSelection("sRFC");
            } else if (_binding.getTrfcServer() != null) {
                _typeCombo.setText("tRFC");
                handleSelection("tRFC");
            }
            _bindingValue.setValue(_binding);
        } else {
            _bindingValue.setValue(null);
        }
    }

    @Override
    public void setTargetObject(EObject target) {
        super.setTargetObject(target);
    }

    @Override
    public void createContents(Composite parent, int style, DataBindingContext context) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getSAPTabControl(_panel);

        bindControls(context);
    }

    private Control getSAPTabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);

        _nameText = createLabelAndText(composite, Messages.label_name);

        _typeCombo = createLabelAndCombo(composite, "SAP Object", true);
        _typeCombo.add("IDoc List");
        _typeCombo.add("sRFC");
        _typeCombo.add("tRFC");

        _contentPanel = new Composite(composite, SWT.NONE);
        _layout = new StackLayout();
        _contentPanel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
        _contentPanel.setLayout(_layout);

        _iDocPage = new Composite(_contentPanel, SWT.NONE);
        _iDocPage.setLayout(new GridLayout(2, false));
        _idocServerText = createLabelAndText(_iDocPage, Messages.CamelSAPComposite_Server_name_label);
        _idocTypeText = createLabelAndText(_iDocPage, "IDoc Type*");
        _idocTypeExtText = createLabelAndText(_iDocPage, "IDoc Type Extension");
        _systemReleaseText = createLabelAndText(_iDocPage, "System Release");
        _applicationReleaseText = createLabelAndText(_iDocPage, "Application Release");

        _sRFCPage = new Composite(_contentPanel, SWT.NONE);
        _sRFCPage.setLayout(new GridLayout(2, false));
        _srfcServerText = createLabelAndText(_sRFCPage, Messages.CamelSAPComposite_Server_name_label);
        _srfcRFCNameText = createLabelAndText(_sRFCPage, "RFC Name*");

        _tRFCPage = new Composite(_contentPanel, SWT.NONE);
        _tRFCPage.setLayout(new GridLayout(2, false));
        _tRFCServerText = createLabelAndText(_tRFCPage, Messages.CamelSAPComposite_Server_name_label);
        _trfcRFCNameText = createLabelAndText(_tRFCPage, "RFC Name*");

        _typeCombo.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                handleSelection(_typeCombo.getText());
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
            }
        });

        return composite;
    }

    private void selectSAPType(final Class<?> clazz) {
        TransactionalEditingDomain domain = getDomain(_binding);
        if (domain != null) {
            domain.getCommandStack().execute(new RecordingCommand(domain) {
                protected void doExecute() {
                    if (clazz.equals(CamelSapIDocListServerType.class)) {
                        if (_binding.getIdoclistServer() == null) {
                            _binding.setIdoclistServer(SapFactory.eINSTANCE.createCamelSapIDocListServerType());
                        }
                        _binding.setSrfcServer(null);
                        _binding.setTrfcServer(null);
                    } else if (clazz.equals(CamelSapSRfcServerType.class)) {
                        _binding.setIdoclistServer(null);
                        if (_binding.getSrfcServer() == null) {
                            _binding.setSrfcServer(SapFactory.eINSTANCE.createCamelSapSRfcServerType());
                        }
                        _binding.setTrfcServer(null);
                    } else if (clazz.equals(CamelSapTRfcServerType.class)) {
                        _binding.setIdoclistServer(null);
                        _binding.setSrfcServer(null);
                        if (_binding.getTrfcServer() == null) {
                            _binding.setTrfcServer(SapFactory.eINSTANCE.createCamelSapTRfcServerType());
                        }
                    }
                    _iDocPage.setEnabled(clazz.equals(CamelSapIDocListServerType.class));
                    _sRFCPage.setEnabled(clazz.equals(CamelSapSRfcServerType.class));
                    _tRFCPage.setEnabled(clazz.equals(CamelSapTRfcServerType.class));
                    _idocServerTextBinding.validateTargetToModel();
                    _idocTypeTextBinding.validateTargetToModel();
                    _tRFCServerTextBinding.validateTargetToModel();
                    _tRFCRFCTextBinding.validateTargetToModel();
                    _sRFCServerTextBinding.validateTargetToModel();
                    _sRFCRFCTextBinding.validateTargetToModel();
                }
            });
        }
    }

    private void handleSelection(String sapType) {

        if (sapType.equals("IDoc List")) {
            _layout.topControl = _iDocPage;
            selectSAPType(CamelSapIDocListServerType.class);
        } else if (sapType.equals("sRFC")) {
            _layout.topControl = _sRFCPage;
            selectSAPType(CamelSapSRfcServerType.class);
        } else if (sapType.equals("tRFC")) {
            _layout.topControl = _tRFCPage;
            selectSAPType(CamelSapTRfcServerType.class);
        }
        _contentPanel.layout();
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

        _bindingValue = new WritableValue(realm, null, CamelSapBindingType.class);

        org.eclipse.core.databinding.Binding binding = context.bindValue(SWTObservables.observeText(_nameText,
                new int[] {SWT.Modify }), ObservablesUtil.observeDetailValue(domain, _bindingValue,
                ScaPackage.eINSTANCE.getBinding_Name()), new EMFUpdateValueStrategyNullForEmptyString(null,
                UpdateValueStrategy.POLICY_CONVERT).setAfterConvertValidator(new StringEmptyValidator(
                Messages.CamelSAPComposite_Binding_name_empty_warning, Status.WARNING)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        /*
         * we also want to bind the name field to the binding name. note that
         * the model to target updater is configured to NEVER update. we want
         * the camel binding name to be the definitive source for this field.
         */
        binding = context.bindValue(SWTObservables.observeText(_nameText, new int[] {SWT.Modify }), ObservablesUtil
                .observeDetailValue(domain, _bindingValue, ScaPackage.eINSTANCE.getBinding_Name()),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyValidator(
                                Messages.CamelSAPComposite_Binding_name_empty_warning, Status.WARNING)),
                new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER));
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        FeaturePath path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__IDOCLIST_SERVER,
                SapPackage.Literals.CAMEL_SAP_IDOC_LIST_SERVER_TYPE__SERVER_NAME);
        _idocServerTextBinding = context.bindValue(
                SWTObservables.observeText(_idocServerText, new int[] {SWT.Modify }), ObservablesUtil
                        .observeDetailValue(domain, _bindingValue, path), new EMFUpdateValueStrategyNullForEmptyString(
                        null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyControlAwareValidator(
                                Messages.CamelSAPComposite_Server_name_empty_error, _idocServerText)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_idocServerTextBinding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__IDOCLIST_SERVER,
                SapPackage.Literals.CAMEL_SAP_IDOC_LIST_SERVER_TYPE__IDOC_TYPE);
        _idocTypeTextBinding = context.bindValue(SWTObservables.observeText(_idocTypeText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyControlAwareValidator("IDoc Type cannot be empty.",
                                _idocTypeText)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_idocTypeTextBinding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__IDOCLIST_SERVER,
                SapPackage.Literals.CAMEL_SAP_IDOC_LIST_SERVER_TYPE__IDOC_TYPE_EXTENSION);
        binding = context.bindValue(SWTObservables.observeText(_idocTypeExtText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__IDOCLIST_SERVER,
                SapPackage.Literals.CAMEL_SAP_IDOC_LIST_SERVER_TYPE__SYSTEM_RELEASE);
        binding = context.bindValue(SWTObservables.observeText(_systemReleaseText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__IDOCLIST_SERVER,
                SapPackage.Literals.CAMEL_SAP_IDOC_LIST_SERVER_TYPE__APPLICATION_RELEASE);
        binding = context.bindValue(SWTObservables.observeText(_applicationReleaseText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__TRFC_SERVER,
                SapPackage.Literals.CAMEL_SAP_TRFC_SERVER_TYPE__SERVER_NAME);
        _tRFCServerTextBinding = context.bindValue(
                SWTObservables.observeText(_tRFCServerText, new int[] {SWT.Modify }), ObservablesUtil
                        .observeDetailValue(domain, _bindingValue, path), new EMFUpdateValueStrategyNullForEmptyString(
                        null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyControlAwareValidator(
                                Messages.CamelSAPComposite_Server_name_empty_error, _tRFCServerText)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_tRFCServerTextBinding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__TRFC_SERVER,
                SapPackage.Literals.CAMEL_SAP_TRFC_SERVER_TYPE__RFC_NAME);
        _tRFCRFCTextBinding = context.bindValue(SWTObservables.observeText(_trfcRFCNameText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyControlAwareValidator(
                                Messages.CamelSAPComposite_RFC_name_empty_error, _trfcRFCNameText)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_tRFCRFCTextBinding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__SRFC_SERVER,
                SapPackage.Literals.CAMEL_SAP_SRFC_SERVER_TYPE__SERVER_NAME);
        _sRFCServerTextBinding = context.bindValue(
                SWTObservables.observeText(_srfcServerText, new int[] {SWT.Modify }), ObservablesUtil
                        .observeDetailValue(domain, _bindingValue, path), new EMFUpdateValueStrategyNullForEmptyString(
                        null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyControlAwareValidator(
                                Messages.CamelSAPComposite_Server_name_empty_error, _srfcServerText)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_sRFCServerTextBinding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__SRFC_SERVER,
                SapPackage.Literals.CAMEL_SAP_SRFC_SERVER_TYPE__RFC_NAME);
        _sRFCRFCTextBinding = context.bindValue(SWTObservables.observeText(_srfcRFCNameText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyControlAwareValidator(
                                Messages.CamelSAPComposite_RFC_name_empty_error, _srfcRFCNameText)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_sRFCRFCTextBinding), SWT.TOP | SWT.LEFT);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite
     * #dispose()
     */
    @Override
    public void dispose() {
        _bindingValue.dispose();
        super.dispose();
    }
}
