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
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocDestinationType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapIDocListDestinationType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocDestinationType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQIDocListDestinationType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapQRfcDestinationType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapSRfcDestinationType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.CamelSapTRfcDestinationType;
import org.switchyard.tools.models.switchyard1_0.camel.sap.SapFactory;
import org.switchyard.tools.models.switchyard1_0.camel.sap.SapPackage;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;
import org.switchyard.tools.ui.editor.databinding.EscapedPropertyBooleanValidator;
import org.switchyard.tools.ui.editor.databinding.ObservablesUtil;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;
import org.switchyard.tools.ui.editor.databinding.StringEmptyControlAwareValidator;
import org.switchyard.tools.ui.editor.databinding.StringEmptyValidator;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;

/**
 * @author bfitzpat
 * 
 */
public class CamelSAPProducerComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelSapBindingType _binding = null;
    private Text _nameText;
    private WritableValue _bindingValue;
    private Composite _contentPanel;
    private StackLayout _layout;
    private Combo _typeCombo;

    private Composite _iDocPage;
    private Composite _iDocListPage;
    private Composite _qIDocPage;
    private Composite _qIDocListPage;
    private Composite _qRFCPage;
    private Composite _sRFCPage;
    private Composite _tRFCPage;

    private Text _idocDestinationText;
    private Text _idocTypeText;
    private Text _idocTypeExtText;
    private Text _systemReleaseText;
    private Text _applicationReleaseText;

    private Text _idoclistDestinationText;
    private Text _idoclistTypeText;
    private Text _idoclistTypeExtText;
    private Text _idoclistSystemReleaseText;
    private Text _idoclistApplicationReleaseText;

    private org.eclipse.core.databinding.Binding _idocDestinationTextBinding;
    private org.eclipse.core.databinding.Binding _idocTypeTextBinding;
    private org.eclipse.core.databinding.Binding _idoclistDestinationTextBinding;
    private org.eclipse.core.databinding.Binding _idoclistTypeTextBinding;
    private org.eclipse.core.databinding.Binding _qidocDestinationTextBinding;
    private org.eclipse.core.databinding.Binding _qidocTypeTextBinding;
    private org.eclipse.core.databinding.Binding _qidocQueueNameTextBinding;
    private org.eclipse.core.databinding.Binding _qidoclistDestinationTextBinding;
    private org.eclipse.core.databinding.Binding _qidoclistTypeTextBinding;
    private org.eclipse.core.databinding.Binding _qidoclistQueueNameTextBinding;
    private org.eclipse.core.databinding.Binding _qRFCDestinationTextBinding;
    private org.eclipse.core.databinding.Binding _sRFCDestinationTextBinding;
    private org.eclipse.core.databinding.Binding _tRFCDestinationTextBinding;
    private org.eclipse.core.databinding.Binding _qRFCRFCTextBinding;
    private org.eclipse.core.databinding.Binding _sRFCRFCTextBinding;
    private org.eclipse.core.databinding.Binding _tRFCRFCTextBinding;
    private org.eclipse.core.databinding.Binding _qRFCQueueNameTextBinding;

    private Text _qidocDestinationText;
    private Text _qidocQueueNameText;
    private Text _qidocTypeText;
    private Text _qidocTypeExtText;
    private Text _qidocSystemReleaseText;
    private Text _qidocApplicationReleaseText;

    private Text _qidoclistDestinationText;
    private Text _qidoclistQueueNameText;
    private Text _qidoclistTypeText;
    private Text _qidoclistTypeExtText;
    private Text _qidoclistSystemReleaseText;
    private Text _qidoclistApplicationReleaseText;

    private Text _qrfcDestinationText;
    private Text _qrfcQueueNameText;
    private Combo _qrfcTransactedCombo;
    private Text _qrfcRFCNameText;

    private Text _srfcDestinationText;
    private Combo _srfcTransactedCombo;
    private Text _srfcRFCNameText;

    private Text _trfcDestinationText;
    private Combo _trfcTransactedCombo;
    private Text _trfcRFCNameText;

    CamelSAPProducerComposite(FormToolkit toolkit) {
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
            if (_binding.getIdocDestination() == null && _binding.getIdoclistDestination() == null
                    && _binding.getQidocDestination() == null && _binding.getQidoclistDestination() == null
                    && _binding.getQrfcDestination() == null && _binding.getSrfcDestination() == null
                    && _binding.getTrfcDestination() == null) {
                _typeCombo.setText("IDoc");
                handleSelection("IDoc");
            } else if (_binding.getIdocDestination() != null) {
                _typeCombo.setText("IDoc");
                handleSelection("IDoc");
            } else if (_binding.getIdoclistDestination() != null) {
                _typeCombo.setText("IDoc List");
                handleSelection("IDoc List");
            } else if (_binding.getQidocDestination() != null) {
                _typeCombo.setText("QIDoc");
                handleSelection("QIDoc");
            } else if (_binding.getQidoclistDestination() != null) {
                _typeCombo.setText("QIDoc List");
                handleSelection("QIDoc List");
            } else if (_binding.getQrfcDestination() != null) {
                _typeCombo.setText("qRFC");
                handleSelection("qRFC");
            } else if (_binding.getSrfcDestination() != null) {
                _typeCombo.setText("sRFC");
                handleSelection("sRFC");
            } else if (_binding.getTrfcDestination() != null) {
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
        _typeCombo.add("IDoc");
        _typeCombo.add("IDoc List");
        _typeCombo.add("QIDoc");
        _typeCombo.add("QIDoc List");
        _typeCombo.add("qRFC");
        _typeCombo.add("sRFC");
        _typeCombo.add("tRFC");

        _contentPanel = new Composite(composite, SWT.NONE);
        _layout = new StackLayout();
        _contentPanel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
        _contentPanel.setLayout(_layout);

        _iDocPage = new Composite(_contentPanel, SWT.NONE);
        _iDocPage.setLayout(new GridLayout(2, false));
        _idocDestinationText = createLabelAndText(_iDocPage, "Destination Name*");
        _idocTypeText = createLabelAndText(_iDocPage, "IDoc Type*");
        _idocTypeExtText = createLabelAndText(_iDocPage, "IDoc Type Extension");
        _systemReleaseText = createLabelAndText(_iDocPage, "System Release");
        _applicationReleaseText = createLabelAndText(_iDocPage, "Application Release");

        _iDocListPage = new Composite(_contentPanel, SWT.NONE);
        _iDocListPage.setLayout(new GridLayout(2, false));
        _idoclistDestinationText = createLabelAndText(_iDocListPage, "Destination Name*");
        _idoclistTypeText = createLabelAndText(_iDocListPage, "IDoc Type*");
        _idoclistTypeExtText = createLabelAndText(_iDocListPage, "IDoc Type Extension");
        _idoclistSystemReleaseText = createLabelAndText(_iDocListPage, "System Release");
        _idoclistApplicationReleaseText = createLabelAndText(_iDocListPage, "Application Release");

        _qIDocPage = new Composite(_contentPanel, SWT.NONE);
        _qIDocPage.setLayout(new GridLayout(2, false));
        _qidocDestinationText = createLabelAndText(_qIDocPage, "Destination Name*");
        _qidocQueueNameText = createLabelAndText(_qIDocPage, "Queue Name");
        _qidocTypeText = createLabelAndText(_qIDocPage, "IDoc Type*");
        _qidocTypeExtText = createLabelAndText(_qIDocPage, "IDoc Type Extension");
        _qidocSystemReleaseText = createLabelAndText(_qIDocPage, "System Release");
        _qidocApplicationReleaseText = createLabelAndText(_qIDocPage, "Application Release");

        _qIDocListPage = new Composite(_contentPanel, SWT.NONE);
        _qIDocListPage.setLayout(new GridLayout(2, false));
        _qidoclistDestinationText = createLabelAndText(_qIDocListPage, "Destination Name*");
        _qidoclistQueueNameText = createLabelAndText(_qIDocListPage, "Queue Name");
        _qidoclistTypeText = createLabelAndText(_qIDocListPage, "IDoc Type*");
        _qidoclistTypeExtText = createLabelAndText(_qIDocListPage, "IDoc Type Extension");
        _qidoclistSystemReleaseText = createLabelAndText(_qIDocListPage, "System Release");
        _qidoclistApplicationReleaseText = createLabelAndText(_qIDocListPage, "Application Release");

        _qRFCPage = new Composite(_contentPanel, SWT.NONE);
        _qRFCPage.setLayout(new GridLayout(2, false));
        _qrfcDestinationText = createLabelAndText(_qRFCPage, "Destination Name*");
        _qrfcQueueNameText = createLabelAndText(_qRFCPage, "Queue Name");
        _qrfcRFCNameText = createLabelAndText(_qRFCPage, "RFC Name*");
        getToolkit().createLabel(_qRFCPage, "Transacted");
        _qrfcTransactedCombo = new Combo(_qRFCPage, SWT.DROP_DOWN | SWT.BORDER);
        getToolkit().adapt(_qrfcTransactedCombo);
        _qrfcTransactedCombo.add("true");
        _qrfcTransactedCombo.add("false");
        _qrfcTransactedCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

        _sRFCPage = new Composite(_contentPanel, SWT.NONE);
        _sRFCPage.setLayout(new GridLayout(2, false));
        _srfcDestinationText = createLabelAndText(_sRFCPage, "Destination Name*");
        _srfcRFCNameText = createLabelAndText(_sRFCPage, "RFC Name*");
        getToolkit().createLabel(_sRFCPage, "Transacted");
        _srfcTransactedCombo = new Combo(_sRFCPage, SWT.DROP_DOWN | SWT.BORDER);
        getToolkit().adapt(_srfcTransactedCombo);
        _srfcTransactedCombo.add("true");
        _srfcTransactedCombo.add("false");
        _srfcTransactedCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

        _tRFCPage = new Composite(_contentPanel, SWT.NONE);
        _tRFCPage.setLayout(new GridLayout(2, false));
        _trfcDestinationText = createLabelAndText(_tRFCPage, "Destination Name*");
        _trfcRFCNameText = createLabelAndText(_tRFCPage, "RFC Name*");
        getToolkit().createLabel(_tRFCPage, "Transacted");
        _trfcTransactedCombo = new Combo(_tRFCPage, SWT.DROP_DOWN | SWT.BORDER);
        getToolkit().adapt(_trfcTransactedCombo);
        _trfcTransactedCombo.add("true");
        _trfcTransactedCombo.add("false");
        _trfcTransactedCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

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
                    if (clazz.equals(CamelSapIDocDestinationType.class)) {
                        if (_binding.getIdocDestination() == null) {
                            _binding.setIdocDestination(SapFactory.eINSTANCE.createCamelSapIDocDestinationType());
                        }
                        _binding.setIdoclistDestination(null);
                        _binding.setQidocDestination(null);
                        _binding.setQidoclistDestination(null);
                        _binding.setQrfcDestination(null);
                        _binding.setSrfcDestination(null);
                        _binding.setTrfcDestination(null);
                    } else if (clazz.equals(CamelSapIDocListDestinationType.class)) {
                        _binding.setIdocDestination(null);
                        _binding.setIdoclistDestination(null);
                        _binding.setQidocDestination(null);
                        if (_binding.getIdoclistDestination() == null) {
                            _binding.setIdoclistDestination(SapFactory.eINSTANCE
                                    .createCamelSapIDocListDestinationType());
                        }
                        _binding.setQrfcDestination(null);
                        _binding.setSrfcDestination(null);
                        _binding.setTrfcDestination(null);
                    } else if (clazz.equals(CamelSapQIDocDestinationType.class)) {
                        _binding.setIdocDestination(null);
                        _binding.setIdoclistDestination(null);
                        _binding.setQidoclistDestination(null);
                        if (_binding.getQidocDestination() == null) {
                            _binding.setQidocDestination(SapFactory.eINSTANCE.createCamelSapQIDocDestinationType());
                        }
                        _binding.setQrfcDestination(null);
                        _binding.setSrfcDestination(null);
                        _binding.setTrfcDestination(null);
                    } else if (clazz.equals(CamelSapQIDocListDestinationType.class)) {
                        _binding.setIdocDestination(null);
                        _binding.setIdoclistDestination(null);
                        _binding.setQidocDestination(null);
                        if (_binding.getQidoclistDestination() == null) {
                            _binding.setQidoclistDestination(SapFactory.eINSTANCE
                                    .createCamelSapQIDocListDestinationType());
                        }
                        _binding.setQrfcDestination(null);
                        _binding.setSrfcDestination(null);
                        _binding.setTrfcDestination(null);
                    } else if (clazz.equals(CamelSapQRfcDestinationType.class)) {
                        _binding.setIdocDestination(null);
                        _binding.setIdoclistDestination(null);
                        _binding.setQidocDestination(null);
                        _binding.setQidoclistDestination(null);
                        if (_binding.getQrfcDestination() == null) {
                            _binding.setQrfcDestination(SapFactory.eINSTANCE.createCamelSapQRfcDestinationType());
                        }
                        _binding.setSrfcDestination(null);
                        _binding.setTrfcDestination(null);
                    } else if (clazz.equals(CamelSapSRfcDestinationType.class)) {
                        _binding.setIdocDestination(null);
                        _binding.setIdoclistDestination(null);
                        _binding.setQidocDestination(null);
                        _binding.setQidoclistDestination(null);
                        if (_binding.getSrfcDestination() == null) {
                            _binding.setSrfcDestination(SapFactory.eINSTANCE.createCamelSapSRfcDestinationType());
                        }
                        _binding.setQrfcDestination(null);
                        _binding.setTrfcDestination(null);
                    } else if (clazz.equals(CamelSapTRfcDestinationType.class)) {
                        _binding.setIdocDestination(null);
                        _binding.setIdoclistDestination(null);
                        _binding.setQidocDestination(null);
                        _binding.setQidoclistDestination(null);
                        if (_binding.getTrfcDestination() == null) {
                            _binding.setTrfcDestination(SapFactory.eINSTANCE.createCamelSapTRfcDestinationType());
                        }
                        _binding.setQrfcDestination(null);
                        _binding.setSrfcDestination(null);
                    }
                    _iDocPage.setEnabled(clazz.equals(CamelSapIDocDestinationType.class));
                    _idocDestinationTextBinding.validateTargetToModel();
                    _idocTypeTextBinding.validateTargetToModel();
                    _iDocListPage.setEnabled(clazz.equals(CamelSapIDocListDestinationType.class));
                    _idoclistDestinationTextBinding.validateTargetToModel();
                    _idoclistTypeTextBinding.validateTargetToModel();
                    _qIDocPage.setEnabled(clazz.equals(CamelSapQIDocDestinationType.class));
                    _qidocDestinationTextBinding.validateTargetToModel();
                    _qidocQueueNameTextBinding.validateTargetToModel();
                    _qidocTypeTextBinding.validateTargetToModel();
                    _qIDocListPage.setEnabled(clazz.equals(CamelSapQIDocListDestinationType.class));
                    _qidoclistDestinationTextBinding.validateTargetToModel();
                    _qidoclistTypeTextBinding.validateTargetToModel();
                    _qidoclistQueueNameTextBinding.validateTargetToModel();
                    _qRFCPage.setEnabled(clazz.equals(CamelSapQRfcDestinationType.class));
                    _qRFCDestinationTextBinding.validateTargetToModel();
                    _qRFCRFCTextBinding.validateTargetToModel();
                    _qRFCQueueNameTextBinding.validateTargetToModel();
                    _sRFCPage.setEnabled(clazz.equals(CamelSapSRfcDestinationType.class));
                    _sRFCDestinationTextBinding.validateTargetToModel();
                    _sRFCRFCTextBinding.validateTargetToModel();
                    _tRFCPage.setEnabled(clazz.equals(CamelSapTRfcDestinationType.class));
                    _tRFCDestinationTextBinding.validateTargetToModel();
                    _tRFCRFCTextBinding.validateTargetToModel();
                }
            });
        }
    }

    private void handleSelection(String sapType) {

        if (sapType.equals("IDoc")) {
            _layout.topControl = _iDocPage;
            selectSAPType(CamelSapIDocDestinationType.class);
        } else if (sapType.equals("IDoc List")) {
            _layout.topControl = _iDocListPage;
            selectSAPType(CamelSapIDocListDestinationType.class);
        } else if (sapType.equals("QIDoc")) {
            _layout.topControl = _qIDocPage;
            selectSAPType(CamelSapQIDocDestinationType.class);
        } else if (sapType.equals("QIDoc List")) {
            _layout.topControl = _qIDocListPage;
            selectSAPType(CamelSapQIDocListDestinationType.class);
        } else if (sapType.equals("qRFC")) {
            _layout.topControl = _qRFCPage;
            selectSAPType(CamelSapQRfcDestinationType.class);
        } else if (sapType.equals("sRFC")) {
            _layout.topControl = _sRFCPage;
            selectSAPType(CamelSapSRfcDestinationType.class);
        } else if (sapType.equals("tRFC")) {
            _layout.topControl = _tRFCPage;
            selectSAPType(CamelSapTRfcDestinationType.class);
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

    private void bindIdocControls(final DataBindingContext context, final EditingDomain domain, final Realm realm) {

        FeaturePath path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__IDOC_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_IDOC_DESTINATION_TYPE__DESTINATION_NAME);
        _idocDestinationTextBinding = context.bindValue(SWTObservables.observeText(_idocDestinationText,
                new int[] {SWT.Modify }), ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyControlAwareValidator(
                                Messages.CamelSAPComposite_Destination_name_empty_error, _idocDestinationText)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_idocDestinationTextBinding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__IDOC_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_IDOC_DESTINATION_TYPE__IDOC_TYPE);
        _idocTypeTextBinding = context.bindValue(SWTObservables.observeText(_idocTypeText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyControlAwareValidator("IDoc Type cannot be empty.",
                                _idocTypeText)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_idocTypeTextBinding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__IDOC_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_IDOC_DESTINATION_TYPE__IDOC_TYPE_EXTENSION);
        org.eclipse.core.databinding.Binding binding = context.bindValue(
                SWTObservables.observeText(_idocTypeExtText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__IDOC_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_IDOC_DESTINATION_TYPE__SYSTEM_RELEASE);
        binding = context.bindValue(SWTObservables.observeText(_systemReleaseText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__IDOC_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_IDOC_DESTINATION_TYPE__APPLICATION_RELEASE);
        binding = context.bindValue(SWTObservables.observeText(_applicationReleaseText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

    }

    private void bindIdocListControls(final DataBindingContext context, final EditingDomain domain, final Realm realm) {

        FeaturePath path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__IDOCLIST_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__DESTINATION_NAME);
        _idoclistDestinationTextBinding = context.bindValue(SWTObservables.observeText(_idoclistDestinationText,
                new int[] {SWT.Modify }), ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyControlAwareValidator(
                                Messages.CamelSAPComposite_Destination_name_empty_error, _idoclistDestinationText)),
                null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_idoclistDestinationTextBinding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__IDOCLIST_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__IDOC_TYPE);
        _idoclistTypeTextBinding = context.bindValue(SWTObservables.observeText(_idoclistTypeText,
                new int[] {SWT.Modify }), ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyControlAwareValidator("IDoc Type cannot be empty.",
                                _idoclistTypeText)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_idoclistTypeTextBinding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__IDOCLIST_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__IDOC_TYPE_EXTENSION);
        org.eclipse.core.databinding.Binding binding = context.bindValue(
                SWTObservables.observeText(_idoclistTypeExtText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__IDOCLIST_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__SYSTEM_RELEASE);
        binding = context.bindValue(SWTObservables.observeText(_idoclistSystemReleaseText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__IDOCLIST_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_IDOC_LIST_DESTINATION_TYPE__APPLICATION_RELEASE);
        binding = context.bindValue(
                SWTObservables.observeText(_idoclistApplicationReleaseText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
    }

    private void bindqIdocControls(final DataBindingContext context, final EditingDomain domain, final Realm realm) {

        FeaturePath path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__QIDOC_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_QI_DOC_DESTINATION_TYPE__DESTINATION_NAME);
        _qidocDestinationTextBinding = context.bindValue(SWTObservables.observeText(_qidocDestinationText,
                new int[] {SWT.Modify }), ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyControlAwareValidator(
                                Messages.CamelSAPComposite_Destination_name_empty_error, _qidocDestinationText)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_qidocDestinationTextBinding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__QIDOC_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_QI_DOC_DESTINATION_TYPE__QUEUE_NAME);
        _qidocQueueNameTextBinding = context.bindValue(SWTObservables.observeText(_qidocQueueNameText,
                new int[] {SWT.Modify }), ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyControlAwareValidator("Queue Name cannot be empty.",
                                _qidocQueueNameText)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_qidocQueueNameTextBinding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__QIDOC_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_QI_DOC_DESTINATION_TYPE__IDOC_TYPE);
        _qidocTypeTextBinding = context.bindValue(SWTObservables.observeText(_qidocTypeText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyControlAwareValidator("IDoc Type cannot be empty.",
                                _qidocTypeText)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_qidocTypeTextBinding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__QIDOC_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_QI_DOC_DESTINATION_TYPE__IDOC_TYPE_EXTENSION);
        org.eclipse.core.databinding.Binding binding = context.bindValue(
                SWTObservables.observeText(_qidocTypeExtText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__QIDOC_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_QI_DOC_DESTINATION_TYPE__SYSTEM_RELEASE);
        binding = context.bindValue(SWTObservables.observeText(_qidocSystemReleaseText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__QIDOC_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_QI_DOC_DESTINATION_TYPE__APPLICATION_RELEASE);
        binding = context.bindValue(SWTObservables.observeText(_qidocApplicationReleaseText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

    }

    private void bindQIdocListControls(final DataBindingContext context, final EditingDomain domain, final Realm realm) {

        FeaturePath path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__QIDOCLIST_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE__DESTINATION_NAME);
        _qidoclistDestinationTextBinding = context.bindValue(SWTObservables.observeText(_qidoclistDestinationText,
                new int[] {SWT.Modify }), ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyControlAwareValidator(
                                Messages.CamelSAPComposite_Destination_name_empty_error, _qidoclistDestinationText)),
                null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_qidoclistDestinationTextBinding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__QIDOCLIST_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE__QUEUE_NAME);
        _qidoclistQueueNameTextBinding = context.bindValue(SWTObservables.observeText(_qidoclistQueueNameText,
                new int[] {SWT.Modify }), ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyControlAwareValidator("Queue Name cannot be empty.",
                                _qidoclistQueueNameText)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_qidoclistQueueNameTextBinding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__QIDOCLIST_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE__IDOC_TYPE);
        _qidoclistTypeTextBinding = context.bindValue(SWTObservables.observeText(_qidoclistTypeText,
                new int[] {SWT.Modify }), ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyControlAwareValidator("IDoc Type cannot be empty.",
                                _qidoclistTypeText)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_qidoclistTypeTextBinding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__QIDOCLIST_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE__IDOC_TYPE_EXTENSION);
        org.eclipse.core.databinding.Binding binding = context.bindValue(
                SWTObservables.observeText(_qidoclistTypeExtText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__QIDOCLIST_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE__SYSTEM_RELEASE);
        binding = context.bindValue(SWTObservables.observeText(_qidoclistSystemReleaseText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__QIDOCLIST_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_QI_DOC_LIST_DESTINATION_TYPE__APPLICATION_RELEASE);
        binding = context.bindValue(
                SWTObservables.observeText(_qidoclistApplicationReleaseText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
    }

    private void bindQRFCControls(final DataBindingContext context, final EditingDomain domain, final Realm realm) {

        FeaturePath path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__QRFC_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_QRFC_DESTINATION_TYPE__DESTINATION_NAME);
        _qRFCDestinationTextBinding = context.bindValue(SWTObservables.observeText(_qrfcDestinationText,
                new int[] {SWT.Modify }), ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyControlAwareValidator(
                                Messages.CamelSAPComposite_Destination_name_empty_error, _qrfcDestinationText)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_qRFCDestinationTextBinding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__QRFC_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_QRFC_DESTINATION_TYPE__RFC_NAME);
        _qRFCRFCTextBinding = context.bindValue(SWTObservables.observeText(_qrfcRFCNameText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyControlAwareValidator(
                                Messages.CamelSAPComposite_RFC_name_empty_error, _qrfcRFCNameText)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_qRFCRFCTextBinding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__QRFC_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_QRFC_DESTINATION_TYPE__QUEUE_NAME);
        _qRFCQueueNameTextBinding = context.bindValue(SWTObservables.observeText(_qrfcQueueNameText,
                new int[] {SWT.Modify }), ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyControlAwareValidator("Queue Name cannot be empty.",
                                _qrfcQueueNameText)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_qRFCQueueNameTextBinding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__QRFC_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_QRFC_DESTINATION_TYPE__TRANSACTED);
        org.eclipse.core.databinding.Binding binding = context.bindValue(
                SWTObservables.observeText(_qrfcTransactedCombo),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                    .setAfterConvertValidator(new EscapedPropertyBooleanValidator(
                        "Transacted must be a valid boolean value (true or false) or follow the pattern for escaped properties (i.e. '${propName}').")), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
    }

    private void bindSRFCControls(final DataBindingContext context, final EditingDomain domain, final Realm realm) {

        FeaturePath path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__SRFC_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_SRFC_DESTINATION_TYPE__DESTINATION_NAME);
        _sRFCDestinationTextBinding = context.bindValue(SWTObservables.observeText(_srfcDestinationText,
                new int[] {SWT.Modify }), ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyControlAwareValidator(
                                Messages.CamelSAPComposite_Destination_name_empty_error, _srfcDestinationText)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_sRFCDestinationTextBinding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__SRFC_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_SRFC_DESTINATION_TYPE__RFC_NAME);
        _sRFCRFCTextBinding = context.bindValue(SWTObservables.observeText(_srfcRFCNameText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyControlAwareValidator(
                                Messages.CamelSAPComposite_RFC_name_empty_error, _srfcRFCNameText)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_sRFCRFCTextBinding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__SRFC_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_SRFC_DESTINATION_TYPE__TRANSACTED);
        org.eclipse.core.databinding.Binding binding = context.bindValue(
                SWTObservables.observeText(_srfcTransactedCombo),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                    .setAfterConvertValidator(new EscapedPropertyBooleanValidator(
                        "Transacted must be a valid boolean value (true or false) or follow the pattern for escaped properties (i.e. '${propName}').")), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
    }

    private void bindTRFCControls(final DataBindingContext context, final EditingDomain domain, final Realm realm) {

        FeaturePath path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__TRFC_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_TRFC_DESTINATION_TYPE__DESTINATION_NAME);
        _tRFCDestinationTextBinding = context.bindValue(SWTObservables.observeText(_trfcDestinationText,
                new int[] {SWT.Modify }), ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyControlAwareValidator(
                                Messages.CamelSAPComposite_Destination_name_empty_error, _trfcDestinationText)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_tRFCDestinationTextBinding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__TRFC_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_TRFC_DESTINATION_TYPE__RFC_NAME);
        _tRFCRFCTextBinding = context.bindValue(SWTObservables.observeText(_trfcRFCNameText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyControlAwareValidator(
                                Messages.CamelSAPComposite_RFC_name_empty_error, _trfcRFCNameText)), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(_tRFCRFCTextBinding), SWT.TOP | SWT.LEFT);

        path = FeaturePath.fromList(SapPackage.Literals.CAMEL_SAP_BINDING_TYPE__TRFC_DESTINATION,
                SapPackage.Literals.CAMEL_SAP_TRFC_DESTINATION_TYPE__TRANSACTED);
        org.eclipse.core.databinding.Binding binding = context.bindValue(
                SWTObservables.observeText(_trfcTransactedCombo),
                ObservablesUtil.observeDetailValue(domain, _bindingValue, path),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                    .setAfterConvertValidator(new EscapedPropertyBooleanValidator(
                        "Transacted must be a valid boolean value (true or false) or follow the pattern for escaped properties (i.e. '${propName}').")), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
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

        bindIdocControls(context, domain, realm);
        bindIdocListControls(context, domain, realm);
        bindqIdocControls(context, domain, realm);
        bindQIdocListControls(context, domain, realm);
        bindQRFCControls(context, domain, realm);
        bindSRFCControls(context, domain, realm);
        bindTRFCControls(context, domain, realm);
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
