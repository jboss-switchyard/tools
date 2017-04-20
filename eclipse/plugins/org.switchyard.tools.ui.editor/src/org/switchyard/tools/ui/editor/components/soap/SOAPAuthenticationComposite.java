/******************************************************************************* 
 * Copyright (c) 2012-2017 Red Hat, Inc. 
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
package org.switchyard.tools.ui.editor.components.soap;

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
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.DisplayRealm;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.wst.wsdl.Port;
import org.switchyard.tools.models.switchyard1_0.soap.BasicAuthenticationType;
import org.switchyard.tools.models.switchyard1_0.soap.NTLMAuthenticationType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPFactory;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;
import org.switchyard.tools.ui.editor.databinding.ObservablesUtil;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.WSDLPortSelectionDialog;

/**
 * @author bfitzpat
 * 
 */
public class SOAPAuthenticationComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private SOAPBindingType _binding = null;
    private ComboViewer _authTypeCombo;
    private Text _authUserText;
    private Text _authPasswordText;
    private Text _authDomainText;
    private WritableValue<SOAPBindingType> _bindingValue;

    protected static final String BASIC_AUTH = "Basic";
    protected static final String NTLM_AUTH = "NTLM";

    SOAPAuthenticationComposite(FormToolkit toolkit) {
        super(toolkit);
    }

    @Override
    public String getTitle() {
        return Messages.title_authenticationDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_soapAuthenticationDetails;
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
        _authDomainText = createLabelAndText(composite, Messages.label_domain);
        
        return composite;
    }

    @Override
    protected void handleModify(Control control) {
        setHasChanged(false);
        setDidSomething(true);
    }

    @Override
    protected void handleUndo(Control control) {
        if (_binding != null) {
            super.handleUndo(control);
        }
    }
    /**
     * @return panel
     */
    @Override
    public Composite getPanel() {
        return _panel;
    }

    /**
     * @param switchYardBindingType binding
     */
    @Override
    public void setBinding(Binding switchYardBindingType) {
        super.setBinding(switchYardBindingType);
        if (switchYardBindingType instanceof SOAPBindingType) {
            setTargetObject(switchYardBindingType.eContainer());
            this._binding = (SOAPBindingType) switchYardBindingType;
            _bindingValue.setValue(_binding);
        } else {
            _bindingValue.setValue(null);
        }
    }

    /**
     * @param shell Shell for dialog
     * @param project java project to use for resolving classpaths
     * @param initialPattern initial file pattern to show
     * @return PortType result
     */
    public Port browse(Shell shell, IJavaProject project, String initialPattern) {
        WSDLPortSelectionDialog dialog = new WSDLPortSelectionDialog(shell, project == null ? ResourcesPlugin
                .getWorkspace().getRoot() : project.getProject());
        dialog.setInitialPattern(initialPattern);
        if (dialog.open() == WSDLPortSelectionDialog.OK) {
            Port result = dialog.getSelectedPort();
            if (result != null) {
                return result;
            }
        }
        return null;
    }

    class AuthComputedValue extends ComputedValue<Object> {

        private IObservableValue<String> _authType = null;
        private IObservableValue<String> _basicAuthUser = null;
        private IObservableValue<String> _basicAuthPwd = null;
        private IObservableValue<String> _ntlmAuthDomain = null;

        public AuthComputedValue(
                IObservableValue<String> authType, IObservableValue<String> user, 
                IObservableValue<String> pwd, IObservableValue<String> domain) {
            super();
            this._authType = authType; 
            this._basicAuthUser = user; 
            this._basicAuthPwd = pwd; 
            this._ntlmAuthDomain = domain; 
        }
        
        @Override
        protected Object calculate() {
            final String authTypeStr = _authType.getValue();
            final String user = _basicAuthUser.getValue();
            final String pwd = _basicAuthPwd.getValue();
            final String domain = _ntlmAuthDomain.getValue();
            
            boolean isBasic = false;
            boolean isNtlm = false;
            if (authTypeStr == null) {
                updateControls(isBasic, isNtlm);
                return null;
            }
            // "Basic", "NTLM"
            if (authTypeStr.equalsIgnoreCase(BASIC_AUTH)) {
                isBasic = true;
                if (user != null || pwd != null) {
                    final BasicAuthenticationType basicAuth =
                        SOAPFactory.eINSTANCE.createBasicAuthenticationType();
                    basicAuth.setUser(user);
                    basicAuth.setPassword(pwd);
                    updateControls(isBasic, isNtlm);
                    return basicAuth;
                } else {
                    updateControls(isBasic, isNtlm);
                    return null;
                }
            } else if (authTypeStr.equalsIgnoreCase(NTLM_AUTH)) {
                isNtlm = true;
                if (user != null || pwd != null || domain != null) {
                    final NTLMAuthenticationType ntlmAuth =
                            SOAPFactory.eINSTANCE.createNTLMAuthenticationType();
                    ntlmAuth.setUser(user);
                    ntlmAuth.setPassword(pwd);
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

        @Override
        protected void doSetValue(Object value) {
            if (value instanceof NTLMAuthenticationType) {
                _authType.setValue(NTLM_AUTH);
                final NTLMAuthenticationType ntlmAuth = (NTLMAuthenticationType) value;
                _basicAuthPwd.setValue(ntlmAuth.getPassword());
                _basicAuthUser.setValue(ntlmAuth.getUser());
                _ntlmAuthDomain.setValue(ntlmAuth.getDomain());
            } else  if (value instanceof BasicAuthenticationType) {
                final BasicAuthenticationType basicAuth = (BasicAuthenticationType) value;
                _authType.setValue(BASIC_AUTH);
                _basicAuthPwd.setValue(basicAuth.getPassword());
                _basicAuthUser.setValue(basicAuth.getUser());
                _ntlmAuthDomain.setValue(null);
            } else {
                _authType.setValue(null);
                _basicAuthPwd.setValue(null);
                _basicAuthUser.setValue(null);
                _ntlmAuthDomain.setValue(null);
            }
            getValue();
        }
        
        private void updateControls(boolean isBasic, boolean isNtlm) {
            _authDomainText.setEnabled(isNtlm);
            _authPasswordText.setEnabled(isBasic || isNtlm);
            _authUserText.setEnabled(isBasic || isNtlm);
        }
        
    }
    
    private void bindControls(final DataBindingContext context) {
        final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(getTargetObject());
        final Realm realm = DisplayRealm.getRealm(_authTypeCombo.getCombo().getDisplay());

        _bindingValue = new WritableValue<>(realm, null, SOAPBindingType.class);
        final IObservableValue<String> authType = new WritableValue<>(realm, null, String.class);
        final IObservableValue<String> basicAuthUser = new WritableValue<>(realm, null, String.class);
        final IObservableValue<String> basicAuthPwd = new WritableValue<>(realm, null, String.class);
        final IObservableValue<String> ntlmAuthDomain = new WritableValue<>(realm, null, String.class);


        org.eclipse.core.databinding.Binding binding = 
                context.bindValue(observeSelection(_authTypeCombo.getCombo()), authType);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = 
                context.bindValue(observeText(_authUserText, SWT.Modify), basicAuthUser,
                        new EMFUpdateValueStrategyNullForEmptyString(null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = 
                context.bindValue(observeText(_authPasswordText, SWT.Modify), basicAuthPwd,
                        new EMFUpdateValueStrategyNullForEmptyString(null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = 
                context.bindValue(observeText(_authDomainText, SWT.Modify), ntlmAuthDomain,
                        new EMFUpdateValueStrategyNullForEmptyString(null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        final IObservableValue<?> computed = new AuthComputedValue(authType, basicAuthUser, basicAuthPwd, ntlmAuthDomain);
        final IObservableValue<?> ntlmValue = ObservablesUtil.observeDetailValue(domain, _bindingValue, SOAPPackage.Literals.SOAP_BINDING_TYPE__NTLM);
        final IObservableValue<?> basicValue = ObservablesUtil.observeDetailValue(domain, _bindingValue, SOAPPackage.Literals.SOAP_BINDING_TYPE__BASIC);
        final org.eclipse.core.databinding.Binding ntlmBinding = context.bindValue(computed, ntlmValue, new EMFUpdateValueStrategy(UpdateValueStrategy.POLICY_ON_REQUEST), new EMFUpdateValueStrategy(UpdateValueStrategy.POLICY_ON_REQUEST));
        final org.eclipse.core.databinding.Binding basicBinding = context.bindValue(computed, basicValue, new EMFUpdateValueStrategy(UpdateValueStrategy.POLICY_ON_REQUEST), new EMFUpdateValueStrategy(UpdateValueStrategy.POLICY_ON_REQUEST));

        final IValueChangeListener<Object> changeListener = new IValueChangeListener<Object>() {
            private boolean _updating = false;
            
            @Override
            public void handleValueChange(ValueChangeEvent<?> event) {
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
        	  @Override
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
