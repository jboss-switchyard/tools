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

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.ComputedValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType;
import org.switchyard.tools.models.switchyard1_0.http.HttpFactory;
import org.switchyard.tools.models.switchyard1_0.http.HttpPackage;
import org.switchyard.tools.models.switchyard1_0.http.ProxyType;
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
public class HttpProxyComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private HTTPBindingType _binding = null;
    private Text _proxyHostText;
    private Text _proxyPortText;
    private Text _proxyUserText;
    private Text _proxyPasswordText;
    private WritableValue _bindingValue;

    HttpProxyComposite(FormToolkit toolkit) {
        super(toolkit);
    }

    @Override
    public String getTitle() {
        return Messages.title_proxySettings;
    }

    @Override
    public String getDescription() {
        return Messages.description_httpProxySettings;
    }

    @Override
    public void createContents(Composite parent, int style, DataBindingContext context) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getProxyTabControl(_panel);

        bindControls(context);
    }

    private Control getProxyTabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);

        _proxyHostText = createLabelAndText(composite, Messages.label_host);
        _proxyPortText = createLabelAndText(composite, Messages.label_port);
        _proxyUserText = createLabelAndText(composite, Messages.label_userName);
        _proxyPasswordText = createLabelAndText(composite, Messages.label_password);
        
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
        if (switchYardBindingType instanceof HTTPBindingType) {
            setTargetObject(switchYardBindingType.eContainer());
            this._binding = (HTTPBindingType) switchYardBindingType;
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

    private void bindControls(final DataBindingContext context) {
        final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(getTargetObject());
        final Realm realm = SWTObservables.getRealm(_proxyHostText.getDisplay());

        _bindingValue = new WritableValue(realm, null, HTTPBindingType.class);
        final IObservableValue hostValue = new WritableValue(realm, null, String.class);
        final IObservableValue passwordValue = new WritableValue(realm, null, String.class);
        final IObservableValue portValue = new WritableValue(realm, null, String.class);
        final IObservableValue userValue = new WritableValue(realm, null, String.class);

        org.eclipse.core.databinding.Binding binding = 
                context.bindValue(SWTObservables.observeText(_proxyHostText, SWT.Modify), hostValue,
                        new EMFUpdateValueStrategyNullForEmptyString(null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = 
                context.bindValue(SWTObservables.observeText(_proxyPasswordText, SWT.Modify), passwordValue,
                        new EMFUpdateValueStrategyNullForEmptyString(null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = 
                context.bindValue(SWTObservables.observeText(_proxyPortText, SWT.Modify), portValue,
                    new EMFUpdateValueStrategyNullForEmptyString("", 
                            UpdateValueStrategy.POLICY_CONVERT).setAfterConvertValidator(
                                    new EscapedPropertyIntegerValidator("Port must be a valid numeric value or follow the pattern for escaped properties (i.e. '${propName}')."))
                                    , null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = 
                context.bindValue(SWTObservables.observeText(_proxyUserText, SWT.Modify), userValue,
                        new EMFUpdateValueStrategyNullForEmptyString(null,
                                UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        ComputedValue computedProxy = new ComputedValue() {
            @Override
            protected Object calculate() {
                final String host = (String) hostValue.getValue();
                final String pwd = (String) passwordValue.getValue();
                final String port = (String) portValue.getValue();
                final String user = (String) userValue.getValue();
                if (host != null || pwd != null || port != null || user != null) {
                    final ProxyType proxy = HttpFactory.eINSTANCE
                            .createProxyType();
                    proxy.setHost(host);
                    proxy.setPassword(pwd);
                    proxy.setPort(port);
                    proxy.setUser(user);
                    return proxy;
                }
                return null;
            }

            protected void doSetValue(Object value) {
                if (value instanceof ProxyType) {
                    final ProxyType proxy = (ProxyType) value;
                    hostValue.setValue(proxy.getHost());
                    passwordValue.setValue(proxy.getPassword());
                    portValue.setValue(proxy.getPort());
                    userValue.setValue(proxy.getUser());
                } else {
                    hostValue.setValue(null);
                    passwordValue.setValue(null);
                    portValue.setValue(null);
                    userValue.setValue(null);
                }
                getValue();
            }
        };
        
        // now bind the proxy into the binding
        binding = context.bindValue(
                computedProxy,
                ObservablesUtil.observeDetailValue(domain, _bindingValue, 
                        HttpPackage.Literals.HTTP_BINDING_TYPE__PROXY));
        
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
