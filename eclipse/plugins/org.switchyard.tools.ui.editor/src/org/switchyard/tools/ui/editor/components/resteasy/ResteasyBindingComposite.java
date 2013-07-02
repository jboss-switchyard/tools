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

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.resteasy.BasicAuthenticationType;
import org.switchyard.tools.models.switchyard1_0.resteasy.NTLMAuthenticationType;
import org.switchyard.tools.models.switchyard1_0.resteasy.ProxyType;
import org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType;
import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;

/**
 * @author bfitzpat
 * 
 */
public class ResteasyBindingComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private Text _mAddressURLText;
    private Text _contextPathText = null;
    private DelimitedStringList _interfacesList = null;
    private RESTBindingType _binding = null;
    private TabFolder _tabFolder;
    private List<String> _advancedPropsFilterList;
    private Text _proxyHostText;
    private Text _proxyPortText;
    private String _proxyPort;
    private Text _proxyUserText;
    private Text _proxyPasswordText;
    private Combo _authTypeCombo;
    private Text _authUserText;
    private Text _authPasswordText;
    private Text _authRealmText;
    private Text _authHostText;
    private Text _authPortText;
    private Text _authDomainText;

    /**
     * @param parent composite parent
     * @param style any style bits
     */
    public void createContents(Composite parent, int style) {

        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());
        if (getRootGridData() != null) {
            _panel.setLayoutData(getRootGridData());
        }

        _tabFolder = new TabFolder(_panel, SWT.NONE);

        TabItem one = new TabItem(_tabFolder, SWT.NONE);
        one.setText("REST");
        one.setControl(getResteasyControl(_tabFolder));

        if (getTargetObject() instanceof Reference) {
            TabItem two = new TabItem(_tabFolder, SWT.NONE);
            two.setText("Authentication");
            two.setControl(getAuthenticationControl(_tabFolder));

            TabItem three = new TabItem(_tabFolder, SWT.NONE);
            three.setText("Proxy Settings");
            three.setControl(getProxyTabControl(_tabFolder));
        }

        addTabs(_tabFolder);
    }

    private Control getAuthenticationControl(TabFolder tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);
        
        _authTypeCombo = createLabelAndCombo(composite, "Authentication Type", true);
        _authTypeCombo.add("Basic");
        _authTypeCombo.add("NTLM");
        _authTypeCombo.setText("Basic");
        _authTypeCombo.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                _authDomainText.setEnabled(_authTypeCombo.getText().equals("NTLM"));
                _authUserText.setText("");
                _authPasswordText.setText("");
                _authRealmText.setText("");
                _authHostText.setText("");
                _authPortText.setText("");
                _authDomainText.setText("");
                removeAuthFeatures();
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                widgetSelected(e);
            }
        });
        
        _authUserText = createLabelAndText(composite, "User");
        _authPasswordText = createLabelAndText(composite, "Password");
        _authRealmText = createLabelAndText(composite, "Realm");
        _authHostText = createLabelAndText(composite, "Host");
        _authPortText = createLabelAndText(composite, "Port");
        _authDomainText = createLabelAndText(composite, "Domain");
        
        _authTypeCombo.select(0);
        _authDomainText.setEnabled(_authTypeCombo.getText().equals("NTLM"));
        
        return composite;
    }

    private Control getProxyTabControl(TabFolder tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);

        _proxyHostText = createLabelAndText(composite, "Host");
        _proxyPortText = createLabelAndText(composite, "Port");
        _proxyUserText = createLabelAndText(composite, "User Name");
        _proxyPasswordText = createLabelAndText(composite, "Password");
        
        return composite;
    }

    private Control getResteasyControl(TabFolder tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(1, false);
        composite.setLayout(gl);

        Group resteasyGroup = new Group(composite, SWT.NONE);
        resteasyGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        resteasyGroup.setLayout(new GridLayout(2, false));
        resteasyGroup.setText("REST Options");

        if (getTargetObject() instanceof Reference) {
            _mAddressURLText = createLabelAndText(resteasyGroup, "Address");
            _mAddressURLText.setEnabled(canEdit());
            GridData uriGD = new GridData(GridData.FILL_HORIZONTAL);
            uriGD.horizontalSpan = 2;
            _mAddressURLText.setLayoutData(uriGD);
        }

        Label interfacesLabel = new Label(resteasyGroup, SWT.NULL);
        interfacesLabel.setText("RESTful Interfaces");
        interfacesLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, false, false));
        _interfacesList = new DelimitedStringList(resteasyGroup, SWT.NULL, !canEdit());
        GridData ilGD = new GridData(GridData.FILL_HORIZONTAL);
        ilGD.horizontalSpan = 2;
        _interfacesList.setLayoutData(ilGD);
        _interfacesList.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                if (_binding != null) {
                    validate();
                    handleModify(_interfacesList);
                    fireChangedEvent(_interfacesList);
                }
            }
        });
        
        if (getTargetObject() instanceof Service) {
            _contextPathText = createLabelAndText(resteasyGroup, "Context Path");
            _contextPathText.setEnabled(canEdit());
            GridData cpGD = new GridData(GridData.FILL_HORIZONTAL);
            cpGD.horizontalSpan = 2;
            _contextPathText.setLayoutData(cpGD);
        }

        return composite;
    }
    
    protected void handleModify(Control control) {
        if (_binding != null) {
            if (control.equals(_mAddressURLText)) {
                String _sURL = _mAddressURLText.getText().trim();
                updateFeature(_binding, "address", _sURL);
            } else if (control.equals(_contextPathText)) {
                String contextPath = _contextPathText.getText().trim();
                updateFeature(_binding, "contextPath", contextPath);
            } else if (control.equals(_interfacesList)) {
                String interfacesString = _interfacesList.getSelection();
                updateFeature(_binding, "interfaces", interfacesString);
            } else if (control.equals(_proxyHostText)) {
                updateProxyFeature("host", _proxyHostText.getText());
            } else if (control.equals(_proxyPasswordText)) {
                updateProxyFeature("password", _proxyPasswordText.getText());
            } else if (control.equals(_proxyUserText)) {
                updateProxyFeature("user", _proxyUserText.getText());
            } else if (control.equals(_proxyPortText)) {
                _proxyPort = _proxyPortText.getText();
                if (_proxyPort.trim().isEmpty()) {
                    updateProxyFeature("port", null);
                } else {
                    try {
                        Integer portVal = Integer.parseInt(_proxyPort);
                        updateProxyFeature("port", portVal);
                    } catch (NumberFormatException nfe) {
                        nfe.fillInStackTrace();
                    }
                }
            } else if (control.equals(_authUserText)) {
                String user = _authUserText.getText().trim();
                updateAuthFeature("user", user);
            } else if (control.equals(_authPasswordText)) {
                String password = _authPasswordText.getText().trim();
                updateAuthFeature("password", password);
            } else if (control.equals(_authPortText)) {
                String port = _authPortText.getText().trim();
                try {
                    Integer portInt = Integer.parseInt(port);
                    updateAuthFeature("port", portInt);
                } catch (NumberFormatException nfe) {
                    // ignore
                    nfe.fillInStackTrace();
                }
            } else if (control.equals(_authRealmText)) {
                String realm = _authRealmText.getText().trim();
                updateAuthFeature("realm", realm);
            } else if (control.equals(_authHostText)) {
                String host = _authHostText.getText().trim();
                updateAuthFeature("host", host);
            } else if (control.equals(_authDomainText)) {
                String domain = _authDomainText.getText().trim();
                updateAuthFeature("domain", domain);
            }
        }
        super.handleModify(control);
        validate();
        setHasChanged(false);
        setDidSomething(true);
    }

    protected boolean validate() {
        setErrorMessage(null);
        String urlString = null;
        if (_mAddressURLText != null && !_mAddressURLText.isDisposed()) {
            urlString = _mAddressURLText.getText();

            if (urlString != null && urlString.trim().length() > 0) {
                if (urlString.trim().length() < urlString.length()) {
                    setErrorMessage("No spaces allowed in address URL");
                }
            }
        }

        String delimited = _interfacesList.getSelection();
        if (delimited.trim().length() == 0) {
            setErrorMessage("At least one Java interface or abstract/empty class with REST annotations must be specified.");
        }

        String portText = null;
        if (_authPortText != null && !_authPortText.isDisposed()) {
            portText = _authPortText.getText();
            if (!portText.trim().isEmpty()) {
                try {
                    Integer.parseInt(portText);
                } catch (NumberFormatException nfe) {
                    setErrorMessage("The authentication port must be a valid integer");
                }
            }
        }

        if (_proxyPort != null && _proxyPort.trim().length() > 0) {
            try {
                Integer.parseInt(_proxyPort);
            } catch (NumberFormatException nfe) {
                setErrorMessage("The proxy port must be a valid integer");
            }
        }

        super.validateTabs();
        return (getErrorMessage() == null);
    }

    /**
     * @return RESTeasy Binding
     */
    public Binding getBinding() {
        return _binding;
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
        if (switchYardBindingType instanceof RESTBindingType) {
            setTargetObject(switchYardBindingType.eContainer());
            this._binding = (RESTBindingType) switchYardBindingType;
            setInUpdate(true);
            String addressUrl = _binding.getAddress();
            if (_mAddressURLText != null && !_mAddressURLText.isDisposed() && addressUrl != null && addressUrl.trim().length() > 0) {
                _mAddressURLText.setText(addressUrl);
            } else if (_mAddressURLText != null) {
                _mAddressURLText.setText("");
            }
            if (_contextPathText != null && !_contextPathText.isDisposed()) {
                if (_binding.getContextPath() != null) {
                    this._contextPathText.setText(_binding.getContextPath());
                } else {
                    if (getTargetObject() != null && getTargetObject() instanceof Contract) {
                        Contract contract = (Contract) getTargetObject();
                        if (contract.eContainer() != null && contract.eContainer() instanceof org.eclipse.soa.sca.sca1_1.model.sca.Composite) {
                            org.eclipse.soa.sca.sca1_1.model.sca.Composite composite = (org.eclipse.soa.sca.sca1_1.model.sca.Composite) contract.eContainer();
                            if (composite.eContainer() != null && composite.eContainer() instanceof SwitchYardType) {
                                SwitchYardType rootSwitchYard = (SwitchYardType) composite.eContainer();
                                this._contextPathText.setText(rootSwitchYard.getName());
                                handleModify(_contextPathText);
                            }
                        }
                    }
                }
            }
            if (_interfacesList != null && !_interfacesList.isDisposed()) {
                if (_binding.getInterfaces() != null) {
                    this._interfacesList.setSelection(_binding.getInterfaces());
                }
            }
            if (_binding.getProxy() != null) {
                setTextValue(_proxyHostText, _binding.getProxy().getHost());
                if (_binding.getProxy().getPort() != null) {
                    setTextValue(_proxyPortText, _binding.getProxy().getPort().toString());
                }
                setTextValue(_proxyUserText, _binding.getProxy().getUser());
                setTextValue(_proxyPasswordText, _binding.getProxy().getPassword());
            }
            if (this._binding.getBasic() != null) {
                _authTypeCombo.select(0);
                setTextValue(_authUserText, this._binding.getBasic().getUser());
                setTextValue(_authPasswordText, this._binding.getBasic().getPassword());
                setTextValue(_authHostText, this._binding.getBasic().getHost());
                setTextValue(_authRealmText, this._binding.getBasic().getRealm());
                if (this._binding.getBasic().getPort() != null) {
                    setTextValue(_authPortText, this._binding.getBasic().getPort().toString());
                } else {
                    setTextValue(_authPortText, "");
                }
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
                    setTextValue(_authPortText, "");
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
                _authDomainText.setEnabled(_authTypeCombo.getText().equals("NTLM"));
            }
            super.setTabsBinding(_binding);
            setInUpdate(false);
            validate();
        } else {
            this._binding = null;
        }
        addObservableListeners();
    }

    /**
     * @param canEdit flag
     */
    public void setCanEdit(boolean canEdit) {
        super.setCanEdit(canEdit);
        if (this._mAddressURLText != null && !this._mAddressURLText.isDisposed()) {
            this._mAddressURLText.setEnabled(canEdit());
        }
        if (this._contextPathText != null && !this._contextPathText.isDisposed()) {
            this._contextPathText.setEnabled(canEdit());
        }
        if (this._interfacesList != null && !this._interfacesList.isDisposed()) {
            this._interfacesList.setEnabled(canEdit());
        }
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (control.equals(_contextPathText)) {
                _contextPathText.setText(_binding.getContextPath());
           } else if (control.equals(_mAddressURLText)) {
               _mAddressURLText.setText(_binding.getAddress());
           } else if (control.equals(_proxyHostText)) {
               if (_binding.getProxy() != null) {
                   setTextValue(_proxyHostText, _binding.getProxy().getHost());
               } else {
                   setTextValue(_proxyHostText, null);
               }
           } else if (control.equals(_proxyPasswordText)) {
               if (_binding.getProxy() != null) {
                   setTextValue(_proxyPasswordText, _binding.getProxy().getPassword());
               } else {
                   setTextValue(_proxyPasswordText, null);
               }
           } else if (control.equals(_proxyUserText)) {
               if (_binding.getProxy() != null) {
                   setTextValue(_proxyUserText, _binding.getProxy().getUser());
               } else {
                   setTextValue(_proxyUserText, null);
               }
           } else if (control.equals(_proxyPortText)) {
               if (_binding.getProxy() != null) {
                   setTextValue(_proxyPortText, _binding.getProxy().getPort().toString());
               } else {
                   setTextValue(_proxyPortText, null);
               }
           }
        } else {
            super.handleUndo(control);
        }
        setHasChanged(false);
    }

    @Override
    protected List<String> getAdvancedPropertiesFilterList() {
        return _advancedPropsFilterList;
    }

    protected void updateProxyFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new AddProxyOp());
        if (featureId != null) {
            ops.add(new BasicOperation("proxy", featureId, value));
        }
        ops.add(new CleanupProxyOp());
        wrapOperation(ops);
    }
    
    class AddProxyOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getProxy() == null) {
                ProxyType proxy = ResteasyFactory.eINSTANCE.createProxyType();
                setFeatureValue(_binding, "proxy", proxy);
            }
        }
    }

    class CleanupProxyOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getProxy() != null) {
                if (_binding.getProxy().getHost() == null 
                        && _binding.getProxy().getPassword() == null 
                        && _binding.getProxy().getPort() == null
                        && _binding.getProxy().getUser() == null) {
                    setFeatureValue(_binding, "proxy", null);
                }
            }
        }
    }

    class RemoveBasicAuthenticationOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getBasic() != null) {
                setFeatureValue(_binding, "basic", null);
            }
        }
    }
    
    class RemoveNtlmAuthenticationOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getNtlm() != null) {
                setFeatureValue(_binding, "ntlm", null);
            }
        }
    }

    class AddBasicAuthenticatiOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getBasic() == null) {
                BasicAuthenticationType basicAuth = ResteasyFactory.eINSTANCE.createBasicAuthenticationType();
                _binding.setBasic(basicAuth);
            }
        }
    }
    
    class AddNtlmAuthenticatiOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getNtlm() == null) {
                NTLMAuthenticationType ntlmAuth = ResteasyFactory.eINSTANCE.createNTLMAuthenticationType();
                _binding.setNtlm(ntlmAuth);
            }
        }
    }

    protected void updateBasicAuthFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new RemoveNtlmAuthenticationOp());
        ops.add(new AddBasicAuthenticatiOp());
        ops.add(new BasicOperation("basic", featureId, value));
        wrapOperation(ops);
    }

    protected void updateNtlmAuthFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new RemoveBasicAuthenticationOp());
        ops.add(new AddNtlmAuthenticatiOp());
        ops.add(new BasicOperation("ntlm", featureId, value));
        wrapOperation(ops);
    }

    protected void removeAuthFeatures() {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new RemoveBasicAuthenticationOp());
        ops.add(new RemoveNtlmAuthenticationOp());
        wrapOperation(ops);
    }

    private void updateAuthFeature(String featureId, Object value) {
        boolean basicAuth = _authTypeCombo.getText().equalsIgnoreCase("basic");
        if (basicAuth) {
            updateBasicAuthFeature(featureId, value);
        } else {
            updateNtlmAuthFeature(featureId, value);
        }
    }
}
