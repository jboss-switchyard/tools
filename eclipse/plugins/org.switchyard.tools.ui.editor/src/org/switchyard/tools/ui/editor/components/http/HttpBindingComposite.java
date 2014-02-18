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
package org.switchyard.tools.ui.editor.components.http;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.WritableValue;
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
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
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
import org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType;
import org.switchyard.tools.models.switchyard1_0.http.HttpPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;
import org.switchyard.tools.ui.editor.databinding.EscapedPropertyIntegerValidator;
import org.switchyard.tools.ui.editor.databinding.ObservablesUtil;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;
import org.switchyard.tools.ui.editor.databinding.StringEmptyValidator;
//import org.switchyard.tools.ui.editor.databinding.URLValidator;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorComposite;

/**
 * @author bfitzpat
 * 
 */
public class HttpBindingComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private Text _nameText;
    private Text _mAddressURLText;
    private ComboViewer _methodCombo;
    private Text _contentTypeText;
    private Text _contextPathText = null;
    private HTTPBindingType _binding = null;
    private OperationSelectorComposite _opSelectorComposite;
    private Text _requestTimeoutText = null;
    private WritableValue _bindingValue;

    HttpBindingComposite(FormToolkit toolkit) {
        super(toolkit);
    }

    @Override
    public String getTitle() {
        return Messages.title_httpBindingDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_httpBindingDetails;
    }

    @Override
    public void createContents(Composite parent, int style, DataBindingContext context) {

        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getHttpControl(_panel);

        if (getTargetObject() != null && getTargetObject() instanceof Service) {
            if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed()) {
                _opSelectorComposite.setTargetObject((EObject) getTargetObject());
            }
        }
        
        bindControls(context);
    }

    private Control getHttpControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);

        _nameText = createLabelAndText(composite, Messages.label_name);

        if (getTargetObject() instanceof Service) {
            _contextPathText = createLabelAndText(composite, Messages.label_contextPath);
//            _contextPathText.setEnabled(canEdit());

            _opSelectorComposite = new OperationSelectorComposite(composite, SWT.NONE, this);
            _opSelectorComposite.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
            _opSelectorComposite.setLayout(new GridLayout(2, false));
            _opSelectorComposite.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    handleModify(_opSelectorComposite);
                }
             });
            _opSelectorComposite.setTargetObject((EObject) getTargetObject());
        }

        if (getTargetObject() instanceof Reference) {
            _mAddressURLText = createLabelAndText(composite, Messages.label_address);
            
            _methodCombo = createLabelAndComboViewer(composite, Messages.label_method, false);
            _methodCombo.setContentProvider(ArrayContentProvider.getInstance());
            _methodCombo.setLabelProvider(new LabelProvider());
            String[] methods = new String[] {"GET", "POST", "PUT", "DELETE",
                    "HEAD", "OPTIONS", "TRACE", "CONNECT"
            };
            _methodCombo.setInput(methods);

            _contentTypeText = createLabelAndText(composite, Messages.label_contentType);

            _requestTimeoutText = createLabelAndText(composite, Messages.label_requestTimeout);
        }

        return composite;
    }
    
    protected void handleModify(Control control) {
        // at this point, this is the only control we can't do with strict
        // databinding
        if (control.equals(_opSelectorComposite)) {
            fireChangedEvent(_opSelectorComposite);
        }
        setHasChanged(false);
        setDidSomething(true);
    }
    
    @Override
    public void setTargetObject(EObject target) {
        super.setTargetObject(target);
        if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed()) {
            _opSelectorComposite.setTargetObject(target);
        }
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
        if (switchYardBindingType instanceof HTTPBindingType) {
            _binding = (HTTPBindingType) switchYardBindingType;
            _bindingValue.setValue(_binding);

            // refresh the operation selector control
            if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed() && getTargetObject() != null) {
                _opSelectorComposite.setTargetObject(getTargetObject());
            }
            if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed()) {
                _opSelectorComposite.setBinding(_binding);
            }

            // Set the default of the context path to be the name of the root switchyard if unset
            if (_binding.getContextPath() == null && _contextPathText != null && !_contextPathText.isDisposed()) {
                if (getTargetObject() != null && getTargetObject() instanceof Contract) {
                    Contract contract = (Contract) getTargetObject();
                    if (contract.eContainer() != null && contract.eContainer() instanceof org.eclipse.soa.sca.sca1_1.model.sca.Composite) {
                        org.eclipse.soa.sca.sca1_1.model.sca.Composite composite = (org.eclipse.soa.sca.sca1_1.model.sca.Composite) contract.eContainer();
                        if (composite.eContainer() != null && composite.eContainer() instanceof SwitchYardType) {
                            SwitchYardType rootSwitchYard = (SwitchYardType) composite.eContainer();
                            if (rootSwitchYard.getName() != null) {
                                this._contextPathText.setText(rootSwitchYard.getName());
                                // make sure a notify event gets sent, to update the binding
                                _contextPathText.notifyListeners(SWT.Modify, null);
                                // simulate "ENTER" to commit the change
                                _contextPathText.notifyListeners(SWT.DefaultSelection, null);
                                _contextPathText.setFocus();
                            }
                        }
                    }
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

        _bindingValue = new WritableValue(realm, null, HTTPBindingType.class);

        org.eclipse.core.databinding.Binding binding = context.bindValue(
                SWTObservables.observeText(_nameText, new int[] {SWT.Modify }),
                ObservablesUtil.observeDetailValue(domain, _bindingValue,
                        ScaPackage.eINSTANCE.getBinding_Name()),
                new EMFUpdateValueStrategyNullForEmptyString(null, UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new StringEmptyValidator(
                                "HTTP binding name cannot be empty")), null);
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
                                "HTTP binding name cannot be empty")), new UpdateValueStrategy(
                        UpdateValueStrategy.POLICY_NEVER));
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        if (getTargetObject() instanceof Service) {
            if (_opSelectorComposite != null) {
                _opSelectorComposite.bindControls(domain, context);
            }
            
            binding = context.bindValue(
                    SWTObservables.observeText(_contextPathText, new int[] {SWT.Modify }),
                    ObservablesUtil.observeDetailValue(domain, _bindingValue,
                            HttpPackage.Literals.HTTP_BINDING_TYPE__CONTEXT_PATH),
                    new EMFUpdateValueStrategyNullForEmptyString(null,
                            UpdateValueStrategy.POLICY_CONVERT), null);
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        } else if (getTargetObject() instanceof Reference) {
            binding = context.bindValue(
                    ViewersObservables.observeSingleSelection(_methodCombo),
                    ObservablesUtil.observeDetailValue(domain, _bindingValue,
                            HttpPackage.Literals.HTTP_BINDING_TYPE__METHOD));
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
            
            binding = context.bindValue(
                    SWTObservables.observeText(_mAddressURLText, new int[] {SWT.Modify }),
                    ObservablesUtil.observeDetailValue(domain, _bindingValue,
                            HttpPackage.Literals.HTTP_BINDING_TYPE__ADDRESS),
                    new EMFUpdateValueStrategyNullForEmptyString(null,
                            UpdateValueStrategy.POLICY_CONVERT), null);
            // TODO: Validate the URL to make sure it's ok
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

            binding = context.bindValue(
                    SWTObservables.observeText(_contentTypeText, new int[] {SWT.Modify }),
                    ObservablesUtil.observeDetailValue(domain, _bindingValue,
                            HttpPackage.Literals.HTTP_BINDING_TYPE__CONTENT_TYPE),
                    new EMFUpdateValueStrategyNullForEmptyString(
                            null, UpdateValueStrategy.POLICY_CONVERT), null);
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

            binding = context.bindValue(
                    SWTObservables.observeText(_requestTimeoutText, new int[] {SWT.Modify }),
                    ObservablesUtil.observeDetailValue(domain, _bindingValue,
                            HttpPackage.Literals.HTTP_BINDING_TYPE__TIMEOUT),
                    new EMFUpdateValueStrategyNullForEmptyString("", 
                            UpdateValueStrategy.POLICY_CONVERT).setAfterConvertValidator(
                                    new EscapedPropertyIntegerValidator("Request Timeout must be a valid numeric value or follow the pattern for escaped properties (i.e. '${propName}')."))
                                    , null);
            ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);
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
