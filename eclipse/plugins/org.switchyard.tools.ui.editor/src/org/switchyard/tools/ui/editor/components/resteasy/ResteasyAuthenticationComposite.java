/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
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
import org.eclipse.core.databinding.observable.DisposeEvent;
import org.eclipse.core.databinding.observable.IDisposeListener;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.ComputedValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.resteasy.BasicAuthenticationType;
import org.switchyard.tools.models.switchyard1_0.resteasy.NTLMAuthenticationType;
import org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType;
import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyFactory;
import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyPackage;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;
import org.switchyard.tools.ui.editor.databinding.EscapedPropertyIntegerValidator;
import org.switchyard.tools.ui.editor.databinding.ObservablesUtil;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;

/**
 * @author bfitzpat
 * 
 */
public class ResteasyAuthenticationComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private RESTBindingType _binding = null;
    private ComboViewer _authTypeCombo;
    private Text _authUserText;
    private Text _authPasswordText;
    private Text _authRealmText;
    private Text _authHostText;
    private Text _authPortText;
    private Text _authDomainText;
    private WritableValue _bindingValue;
    
    protected static final String BASIC_AUTH = "Basic";
    protected static final String NTLM_AUTH = "NTLM";

    ResteasyAuthenticationComposite(FormToolkit toolkit) {
        super(toolkit);
    }

    @Override
    public String getTitle() {
        return Messages.title_resteasyAuthenticationDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_resteasyAuthenticationDetails;
    }

    @Override
    public void createContents(Composite parent, int style, DataBindingContext context) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getAuthenticationControl(_panel);

        bindControls(context);
    }

    private Control getAuthenticationControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);

        _authTypeCombo = createLabelAndComboViewer(composite, Messages.label_authenticationType, true);
        _authTypeCombo.setContentProvider(ArrayContentProvider.getInstance());
        _authTypeCombo.setLabelProvider(new LabelProvider());
        String[] authTypes = new String[] {BASIC_AUTH, NTLM_AUTH};
        _authTypeCombo.setInput(authTypes);

        _authUserText = createLabelAndText(composite, Messages.label_user);
        _authPasswordText = createLabelAndText(composite, Messages.label_password);
        _authRealmText = createLabelAndText(composite, Messages.label_realm);
        _authHostText = createLabelAndText(composite, Messages.label_host);
        _authPortText = createLabelAndText(composite, Messages.label_port);
        _authDomainText = createLabelAndText(composite, Messages.label_domain);

        return composite;
    }

    protected void handleModify(Control control) {
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
        } else {
            _bindingValue.setValue(null);
        }
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            super.handleUndo(control);
        }
    }

    class AuthComputedValue extends ComputedValue {

        private IObservableValue _authType = null;
        private IObservableValue _basicAuthUser = null;
        private IObservableValue _basicAuthPwd = null;
        private IObservableValue _basicAuthRealm = null;
        private IObservableValue _basicAuthHost = null;
        private IObservableValue _basicAuthPort = null;
        private IObservableValue _ntlmAuthDomain = null;

        public AuthComputedValue(
                IObservableValue authType, IObservableValue user, IObservableValue pwd,
                IObservableValue authrealm, IObservableValue host, IObservableValue port,
                IObservableValue domain) {
            super();
            this._authType = authType; 
            this._basicAuthUser = user; 
            this._basicAuthPwd = pwd; 
            this._basicAuthRealm = authrealm; 
            this._basicAuthHost = host; 
            this._basicAuthPort = port; 
            this._ntlmAuthDomain = domain;
        }
        
        @Override
        protected Object calculate() {
            final String authTypeStr = (String) _authType.getValue();
            final String user = (String) _basicAuthUser.getValue();
            final String pwd = (String) _basicAuthPwd.getValue();
            final String realm = (String) _basicAuthRealm.getValue();
            final String host = (String) _basicAuthHost.getValue();
            final String port = (String) _basicAuthPort.getValue();
            final String domain = (String) _ntlmAuthDomain.getValue();
            
            boolean isBasic = false;
            boolean isNtlm = false;
            if (authTypeStr == null) {
                updateControls(isBasic, isNtlm);
                return null;
            }

            // "Basic", "NTLM"
            if (authTypeStr.equalsIgnoreCase(BASIC_AUTH)) {
                isBasic = true;
                if (user != null || pwd != null || realm != null || host != null || port != null) {
                    final BasicAuthenticationType basicAuth =
                            ResteasyFactory.eINSTANCE.createBasicAuthenticationType();
                    basicAuth.setUser(user);
                    basicAuth.setPassword(pwd);
                    basicAuth.setRealm(realm);
                    basicAuth.setHost(host);
                    basicAuth.setPort(port);
                    updateControls(isBasic, isNtlm);
                    return basicAuth;
                } else {
                    updateControls(isBasic, isNtlm);
                    return null;
                }
            } else if (authTypeStr.equalsIgnoreCase(NTLM_AUTH)) {
                isNtlm = true;
                if (user != null || pwd != null || realm != null || host != null || port != null || domain != null) {
                    final NTLMAuthenticationType ntlmAuth =
                            ResteasyFactory.eINSTANCE.createNTLMAuthenticationType();
                    ntlmAuth.setUser(user);
                    ntlmAuth.setPassword(pwd);
                    ntlmAuth.setRealm(realm);
                    ntlmAuth.setHost(host);
                    ntlmAuth.setPort(port);
                    ntlmAuth.setDomain(domain);
                    updateControls(isBasic, isNtlm);
                    return ntlmAuth;
                } else {
                    updateControls(isBasic, isNtlm);
                    return null;
                }
            }
            return null;
        }

        protected void doSetValue(Object value) {
            if (value instanceof NTLMAuthenticationType) {
                _authType.setValue(NTLM_AUTH);
                final NTLMAuthenticationType ntlmAuth = (NTLMAuthenticationType) value;
                _basicAuthHost.setValue(ntlmAuth.getHost());
                _basicAuthPwd.setValue(ntlmAuth.getPassword());
                _basicAuthPort.setValue(ntlmAuth.getPort());
                _basicAuthUser.setValue(ntlmAuth.getUser());
                _basicAuthRealm.setValue(ntlmAuth.getRealm());
                _ntlmAuthDomain.setValue(ntlmAuth.getDomain());
            } else  if (value instanceof BasicAuthenticationType) {
                final BasicAuthenticationType basicAuth = (BasicAuthenticationType) value;
                _authType.setValue(BASIC_AUTH);
                _basicAuthHost.setValue(basicAuth.getHost());
                _basicAuthPwd.setValue(basicAuth.getPassword());
                _basicAuthPort.setValue(basicAuth.getPort());
                _basicAuthUser.setValue(basicAuth.getUser());
                _basicAuthRealm.setValue(basicAuth.getRealm());
                _ntlmAuthDomain.setValue(null);
            } else {
                _authType.setValue(null);
                _basicAuthHost.setValue(null);
                _basicAuthPwd.setValue(null);
                _basicAuthPort.setValue(null);
                _basicAuthUser.setValue(null);
                _basicAuthRealm.setValue(null);
                _ntlmAuthDomain.setValue(null);
            }
            getValue();
        }
        
        private void updateControls(boolean isBasic, boolean isNtlm) {
            _authDomainText.setEnabled(isNtlm);
            _authHostText.setEnabled(isBasic || isNtlm);
            _authPasswordText.setEnabled(isBasic || isNtlm);
            _authPortText.setEnabled(isBasic || isNtlm);
            _authRealmText.setEnabled(isBasic || isNtlm);
            _authUserText.setEnabled(isBasic || isNtlm);
        }
    }
    
    private void bindControls(final DataBindingContext context) {
        final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(getTargetObject());
        final Realm realm = SWTObservables.getRealm(_authTypeCombo.getCombo().getDisplay());

        _bindingValue = new WritableValue(realm, null, RESTBindingType.class);
        final IObservableValue authType = new WritableValue(realm, null, String.class);
        final IObservableValue basicAuthUser = new WritableValue(realm, null, String.class);
        final IObservableValue basicAuthPwd = new WritableValue(realm, null, String.class);
        final IObservableValue basicAuthRealm = new WritableValue(realm, null, String.class);
        final IObservableValue basicAuthHost = new WritableValue(realm, null, String.class);
        final IObservableValue basicAuthPort = new WritableValue(realm, null, String.class);
        final IObservableValue ntlmAuthDomain = new WritableValue(realm, null, String.class);


        org.eclipse.core.databinding.Binding binding = 
                context.bindValue(SWTObservables.observeSelection(_authTypeCombo.getCombo()), authType);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = 
                context.bindValue(SWTObservables.observeText(_authUserText, SWT.Modify), basicAuthUser,
                        new EMFUpdateValueStrategyNullForEmptyString(null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = 
                context.bindValue(SWTObservables.observeText(_authPasswordText, SWT.Modify), basicAuthPwd,
                        new EMFUpdateValueStrategyNullForEmptyString(null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = 
                context.bindValue(SWTObservables.observeText(_authRealmText, SWT.Modify), basicAuthRealm,
                        new EMFUpdateValueStrategyNullForEmptyString(null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = 
                context.bindValue(SWTObservables.observeText(_authHostText, SWT.Modify), basicAuthHost,
                        new EMFUpdateValueStrategyNullForEmptyString(null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = 
                context.bindValue(SWTObservables.observeText(_authPortText, SWT.Modify), basicAuthPort,
                    new EMFUpdateValueStrategyNullForEmptyString("", 
                            UpdateValueStrategy.POLICY_CONVERT).setAfterConvertValidator(
                                    new EscapedPropertyIntegerValidator("Port must be a valid numeric value or follow the pattern for escaped properties (i.e. '${propName}')."))
                                    , null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = 
                context.bindValue(SWTObservables.observeText(_authDomainText, SWT.Modify), ntlmAuthDomain,
                        new EMFUpdateValueStrategyNullForEmptyString(null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        final IObservableValue computed = new AuthComputedValue(authType, basicAuthUser, basicAuthPwd, basicAuthRealm, basicAuthHost, basicAuthPort, ntlmAuthDomain);
        final IObservableValue ntlmValue = ObservablesUtil.observeDetailValue(domain, _bindingValue, ResteasyPackage.Literals.REST_BINDING_TYPE__NTLM);
        final IObservableValue basicValue = ObservablesUtil.observeDetailValue(domain, _bindingValue, ResteasyPackage.Literals.REST_BINDING_TYPE__BASIC);
        final org.eclipse.core.databinding.Binding ntlmBinding = context.bindValue(computed, ntlmValue, new EMFUpdateValueStrategy(UpdateValueStrategy.POLICY_ON_REQUEST), new EMFUpdateValueStrategy(UpdateValueStrategy.POLICY_ON_REQUEST));
        final org.eclipse.core.databinding.Binding basicBinding = context.bindValue(computed, basicValue, new EMFUpdateValueStrategy(UpdateValueStrategy.POLICY_ON_REQUEST), new EMFUpdateValueStrategy(UpdateValueStrategy.POLICY_ON_REQUEST));

        final IValueChangeListener changeListener = new IValueChangeListener() {
            private boolean _updating = false;
            
            public void handleValueChange(ValueChangeEvent event) {
                if (!_updating) {
                    _updating = true;
                    if (event.getSource() == ntlmValue || event.getSource() == basicValue) {
                        if (ntlmValue.getValue() == null) {
                            // default to basic
                            basicBinding.updateModelToTarget();
                        } else {
                            ntlmBinding.updateModelToTarget();
                        }
                    } else {
                        // computed
                        // we might want to do this using a command if domain != null, so the changes are atomic
                        if (computed.getValue() instanceof NTLMAuthenticationType) {
                            ntlmBinding.updateTargetToModel();
                            basicValue.setValue(null);
                        } else {
                            basicBinding.updateTargetToModel();
                            ntlmValue.setValue(null);
                        }
                    }
                    _updating = false;
                }
            }
          };

          IDisposeListener disposeListener = new IDisposeListener() {
            public void handleDispose(DisposeEvent event) {
              ((IObservableValue) event.getSource()).removeValueChangeListener(changeListener);
            }
          };

          computed.addValueChangeListener(changeListener);
          ntlmValue.addValueChangeListener(changeListener);
          basicValue.addValueChangeListener(changeListener);

          computed.addDisposeListener(disposeListener);
          ntlmValue.addDisposeListener(disposeListener);
          basicValue.addDisposeListener(disposeListener);        
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
