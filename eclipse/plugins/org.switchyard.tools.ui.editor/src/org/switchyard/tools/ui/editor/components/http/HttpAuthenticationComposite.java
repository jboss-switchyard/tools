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
package org.switchyard.tools.ui.editor.components.http;

import java.util.ArrayList;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType;
import org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType;
import org.switchyard.tools.models.switchyard1_0.http.HttpFactory;
import org.switchyard.tools.models.switchyard1_0.http.NTLMAuthenticationType;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;

/**
 * @author bfitzpat
 * 
 */
public class HttpAuthenticationComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private HTTPBindingType _binding = null;
    private Combo _authTypeCombo;
    private Text _authUserText;
    private Text _authPasswordText;
    private Text _authRealmText;
    private Text _authHostText;
    private Text _authPortText;
    private Text _authDomainText;

    @Override
    public String getTitle() {
        return Messages.title_httpAuthenticationDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_httpAuthenticationDetals;
    }

    /**
     * @param parent composite parent
     * @param style any style bits
     */
    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getAuthenticationControl(_panel);
    }

    private Control getAuthenticationControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);
        
        _authTypeCombo = createLabelAndCombo(composite, Messages.label_authenticationType, true);
        _authTypeCombo.add("Basic"); //$NON-NLS-1$
        _authTypeCombo.add("NTLM"); //$NON-NLS-1$
        _authTypeCombo.setText("Basic"); //$NON-NLS-1$
        _authTypeCombo.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                _authDomainText.setEnabled(_authTypeCombo.getText().equals("NTLM")); //$NON-NLS-1$
                _authUserText.setText(""); //$NON-NLS-1$
                _authPasswordText.setText(""); //$NON-NLS-1$
                _authRealmText.setText(""); //$NON-NLS-1$
                _authHostText.setText(""); //$NON-NLS-1$
                _authPortText.setText(""); //$NON-NLS-1$
                _authDomainText.setText(""); //$NON-NLS-1$
                removeAuthFeatures();
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                widgetSelected(e);
            }
        });
        
        _authUserText = createLabelAndText(composite, Messages.label_user);
        _authPasswordText = createLabelAndText(composite, Messages.label_password);
        _authRealmText = createLabelAndText(composite, Messages.label_realm);
        _authHostText = createLabelAndText(composite, Messages.label_host);
        _authPortText = createLabelAndText(composite, Messages.label_port);
        _authDomainText = createLabelAndText(composite, Messages.label_domain);
        
        _authTypeCombo.select(0);
        _authDomainText.setEnabled(_authTypeCombo.getText().equals("NTLM")); //$NON-NLS-1$
        
        return composite;
    }
    
    protected void handleModify(Control control) {
        if (_binding != null) {
            if (control.equals(_authUserText)) {
                String user = _authUserText.getText().trim();
                updateAuthFeature("user", user); //$NON-NLS-1$
            } else if (control.equals(_authPasswordText)) {
                String password = _authPasswordText.getText().trim();
                updateAuthFeature("password", password); //$NON-NLS-1$
            } else if (control.equals(_authPortText)) {
                String port = _authPortText.getText().trim();
                updateAuthFeature("port", port); //$NON-NLS-1$
            } else if (control.equals(_authRealmText)) {
                String realm = _authRealmText.getText().trim();
                updateAuthFeature("realm", realm); //$NON-NLS-1$
            } else if (control.equals(_authHostText)) {
                String host = _authHostText.getText().trim();
                updateAuthFeature("host", host); //$NON-NLS-1$
            } else if (control.equals(_authDomainText)) {
                String domain = _authDomainText.getText().trim();
                updateAuthFeature("domain", domain); //$NON-NLS-1$
            }
        }
        super.handleModify(control);
        validate();
        setHasChanged(false);
        setDidSomething(true);
    }
    
    private void updateAuthFeature(String featureId, Object value) {
        boolean basicAuth = _authTypeCombo.getText().equalsIgnoreCase("basic"); //$NON-NLS-1$
        if (basicAuth) {
            updateBasicAuthFeature(featureId, value);
        } else {
            updateNtlmAuthFeature(featureId, value);
        }
    }

    protected boolean validate() {
        setErrorMessage(null);

        return (getErrorMessage() == null);
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
            setInUpdate(true);
            
            if (this._binding.getBasic() != null) {
                _authTypeCombo.select(0);
                setTextValue(_authUserText, this._binding.getBasic().getUser());
                setTextValue(_authPasswordText, this._binding.getBasic().getPassword());
                setTextValue(_authHostText, this._binding.getBasic().getHost());
                setTextValue(_authRealmText, this._binding.getBasic().getRealm());
                if (this._binding.getBasic().getPort() != null) {
                    setTextValue(_authPortText, this._binding.getBasic().getPort().toString());
                } else {
                    setTextValue(_authPortText, ""); //$NON-NLS-1$
                }
                setTextValue(_authDomainText, null);
            } else if (this._binding.getNtlm() != null) {
                _authTypeCombo.select(1);
                setTextValue(_authUserText, this._binding.getNtlm().getUser());
                setTextValue(_authPasswordText, this._binding.getNtlm().getPassword());
                setTextValue(_authHostText, this._binding.getNtlm().getHost());
                setTextValue(_authRealmText, this._binding.getNtlm().getRealm());
                setTextValue(_authDomainText, this._binding.getNtlm().getDomain());
                if (this._binding.getNtlm().getPort() != null) {
                    setTextValue(_authPortText, this._binding.getNtlm().getPort().toString());
                } else {
                    setTextValue(_authPortText, ""); //$NON-NLS-1$
                }
            } else {
                if (_authTypeCombo != null) {
                    _authTypeCombo.select(0);
                    setTextValue(_authUserText, null);
                    setTextValue(_authPasswordText, null);
                    setTextValue(_authHostText, null);
                    setTextValue(_authRealmText, null);
                    setTextValue(_authDomainText, null);
                    setTextValue(_authPortText, null);
                }
            }
            if (_authDomainText != null) {
                _authDomainText.setEnabled(_authTypeCombo.getText().equals("NTLM")); //$NON-NLS-1$
            }
            setInUpdate(false);
            validate();
        } else {
            this._binding = null;
        }
        addObservableListeners();
    }

    protected void handleUndo(Control control) {
        super.handleUndo(control);
        setHasChanged(false);
    }

    class RemoveBasicAuthenticationOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getBasic() != null) {
                setFeatureValue(_binding, "basic", null); //$NON-NLS-1$
            }
        }
    }
    
    class RemoveNtlmAuthenticationOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getNtlm() != null) {
                setFeatureValue(_binding, "ntlm", null); //$NON-NLS-1$
            }
        }
    }

    class AddBasicAuthenticatiOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getBasic() == null) {
                BasicAuthenticationType basicAuth = HttpFactory.eINSTANCE.createBasicAuthenticationType();
                _binding.setBasic(basicAuth);
            }
        }
    }
    
    class AddNtlmAuthenticatiOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getNtlm() == null) {
                NTLMAuthenticationType ntlmAuth = HttpFactory.eINSTANCE.createNTLMAuthenticationType();
                _binding.setNtlm(ntlmAuth);
            }
        }
    }

    class CleanupBasicAuthenticationOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getBasic() != null) {
                if (_binding.getBasic().getHost() == null 
                        && _binding.getBasic().getPassword() == null 
                        && _binding.getBasic().getPort() == null
                        && _binding.getBasic().getUser() == null
                        && _binding.getBasic().getRealm() == null) {
                    setFeatureValue(_binding, "basic", null); //$NON-NLS-1$
                }
            }
        }
    }

    class CleanupNTLMAuthenticationOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getNtlm() != null) {
                if (_binding.getNtlm().getHost() == null 
                        && _binding.getNtlm().getPassword() == null 
                        && _binding.getNtlm().getPort() == null
                        && _binding.getNtlm().getUser() == null
                        && _binding.getNtlm().getRealm() == null) {
                    setFeatureValue(_binding, "ntlm", null); //$NON-NLS-1$
                }
            }
        }
    }

    protected void updateBasicAuthFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new RemoveNtlmAuthenticationOp());
        ops.add(new AddBasicAuthenticatiOp());
        ops.add(new BasicOperation("basic", featureId, value)); //$NON-NLS-1$
        ops.add(new CleanupBasicAuthenticationOp());
        wrapOperation(ops);
    }

    protected void updateNtlmAuthFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new RemoveBasicAuthenticationOp());
        ops.add(new AddNtlmAuthenticatiOp());
        ops.add(new BasicOperation("ntlm", featureId, value)); //$NON-NLS-1$
        ops.add(new CleanupNTLMAuthenticationOp());
        wrapOperation(ops);
    }

    protected void removeAuthFeatures() {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new RemoveBasicAuthenticationOp());
        ops.add(new RemoveNtlmAuthenticationOp());
        wrapOperation(ops);
    }
}
