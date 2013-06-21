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
import java.util.List;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType;
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
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.http.BasicAuthenticationType;
import org.switchyard.tools.models.switchyard1_0.http.HttpBindingType;
import org.switchyard.tools.models.switchyard1_0.http.HttpContextMapperType;
import org.switchyard.tools.models.switchyard1_0.http.HttpFactory;
import org.switchyard.tools.models.switchyard1_0.http.HttpMessageComposerType;
import org.switchyard.tools.models.switchyard1_0.http.NTLMAuthenticationType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorComposite;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorUtil;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;

/**
 * @author bfitzpat
 * 
 */
public class HttpBindingComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private Text _mAddressURLText;
    private Combo _methodCombo;
    private Text _contentTypeText;
    private Text _contextPathText = null;
    private HttpBindingType _binding = null;
    private TabFolder _tabFolder;
    private List<String> _advancedPropsFilterList;
    private OperationSelectorComposite _opSelectorComposite;
    private Combo _authTypeCombo;
    private Text _userText;
    private Text _passwordText;
    private Text _realmText;
    private Text _hostText;
    private Text _portText;
    private Text _domainText;

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
        one.setText("HTTP");
        one.setControl(getHttpControl(_tabFolder));

        if (getTargetObject() != null && getTargetObject() instanceof Service) {
            if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed()) {
                _opSelectorComposite.setTargetObject((EObject) getTargetObject());
            }
        }

        if (getTargetObject() instanceof Reference) {
            TabItem two = new TabItem(_tabFolder, SWT.NONE);
            two.setText("Authentication");
            two.setControl(getAuthenticationControl(_tabFolder));
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
                _domainText.setEnabled(_authTypeCombo.getText().equals("NTLM"));
                _userText.setText("");
                _passwordText.setText("");
                _realmText.setText("");
                _hostText.setText("");
                _portText.setText("");
                _domainText.setText("");
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                widgetSelected(e);
            }
        });
        
        _userText = createLabelAndText(composite, "User");
        _passwordText = createLabelAndText(composite, "Password");
        _realmText = createLabelAndText(composite, "Realm");
        _hostText = createLabelAndText(composite, "Host");
        _portText = createLabelAndText(composite, "Port");
        _domainText = createLabelAndText(composite, "Domain");
        
        _authTypeCombo.select(0);
        _domainText.setEnabled(_authTypeCombo.getText().equals("NTLM"));
        
        return composite;
    }
    
    private Control getHttpControl(TabFolder tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(1, false);
        composite.setLayout(gl);

        Group httpGroup = new Group(composite, SWT.NONE);
        httpGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        httpGroup.setLayout(new GridLayout(2, false));
        httpGroup.setText("HTTP Options");
        
        if (getTargetObject() instanceof Service) {
            _contextPathText = createLabelAndText(httpGroup, "Context Path");
            _contextPathText.setEnabled(canEdit());
            GridData cpGD = new GridData(GridData.FILL_HORIZONTAL);
            cpGD.horizontalSpan = 2;
            _contextPathText.setLayoutData(cpGD);

            _opSelectorComposite = new OperationSelectorComposite(composite, SWT.NONE);
            _opSelectorComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
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
            _mAddressURLText = createLabelAndText(httpGroup, "Address");
            _mAddressURLText.setEnabled(canEdit());
            GridData uriGD = new GridData(GridData.FILL_HORIZONTAL);
            uriGD.horizontalSpan = 2;
            _mAddressURLText.setLayoutData(uriGD);
            
            _methodCombo = createLabelAndCombo(httpGroup, "Method", false);
            _methodCombo.add("GET");
            _methodCombo.add("POST");
            _methodCombo.add("PUT");
            _methodCombo.add("DELETE");
            _methodCombo.add("HEAD");
            _methodCombo.add("OPTIONS");
            _methodCombo.add("TRACE");
            _methodCombo.add("CONNECT");
            _methodCombo.setEnabled(canEdit());
            GridData methodGD = new GridData(GridData.FILL_HORIZONTAL);
            methodGD.horizontalSpan = 2;
            _methodCombo.setLayoutData(methodGD);

            _contentTypeText = createLabelAndText(httpGroup, "Content Type");
            _contentTypeText.setEnabled(canEdit());
            GridData contentTypeGD = new GridData(GridData.FILL_HORIZONTAL);
            contentTypeGD.horizontalSpan = 2;
            _contentTypeText.setLayoutData(contentTypeGD);
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
            } else if (control.equals(_opSelectorComposite)) {
                int opType = _opSelectorComposite.getSelectedOperationSelectorType();
                updateOperationSelectorFeature(opType, _opSelectorComposite.getSelectedOperationSelectorValue());
            } else if (control.equals(_methodCombo)) {
                String methodName = _methodCombo.getText().trim();
                updateFeature(_binding, "method", methodName);
            } else if (control.equals(_contentTypeText)) {
                String contentType = _contentTypeText.getText().trim();
                updateFeature(_binding, "contentType", contentType);
            } else if (control.equals(_userText)) {
                String user = _userText.getText().trim();
                updateAuthFeature("user", user);
            } else if (control.equals(_passwordText)) {
                String password = _passwordText.getText().trim();
                updateAuthFeature("password", password);
            } else if (control.equals(_portText)) {
                String port = _portText.getText().trim();
                try {
                    Integer portInt = Integer.parseInt(port);
                    updateAuthFeature("port", portInt);
                } catch (NumberFormatException nfe) {
                    // ignore
                    nfe.fillInStackTrace();
                }
            } else if (control.equals(_realmText)) {
                String realm = _realmText.getText().trim();
                updateAuthFeature("realm", realm);
            } else if (control.equals(_hostText)) {
                String host = _hostText.getText().trim();
                updateAuthFeature("host", host);
            } else if (control.equals(_domainText)) {
                String domain = _domainText.getText().trim();
                updateAuthFeature("domain", domain);
            }
        }
        super.handleModify(control);
        validate();
        setHasChanged(false);
        setDidSomething(true);
    }
    
    private void updateAuthFeature(String featureId, Object value) {
        boolean basicAuth = _authTypeCombo.getText().equalsIgnoreCase("basic");
        if (basicAuth) {
            updateBasicAuthFeature(featureId, value);
        } else {
            updateNtlmAuthFeature(featureId, value);
        }
    }

    @Override
    public void setTargetObject(Object target) {
        super.setTargetObject(target);
        if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed()) {
            _opSelectorComposite.setTargetObject((EObject) target);
        }
    }

    protected boolean validate() {
        setErrorMessage(null);
        String urlString = null;
        if (_mAddressURLText != null && !_mAddressURLText.isDisposed()) {
            urlString = _mAddressURLText.getText();

            if (urlString != null && urlString.trim().length() > 0) {
                if (urlString.trim().length() < urlString.length()) {
                    setErrorMessage("No spaces allowed in address URL");
//                } else {
//                    try {
//                        URI.create(urlString);
//                    } catch (IllegalArgumentException e) {
//                        setErrorMessage("Invalid address URL");
//                        return false;
//                    }
                }
            }
        }
        String portText = null;
        if (_portText != null && !_portText.isDisposed()) {
            portText = _portText.getText();
            if (!portText.trim().isEmpty()) {
                try {
                    Integer.parseInt(portText);
                } catch (NumberFormatException nfe) {
                    setErrorMessage("The authentication port must be a valid integer");
                }
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
        if (switchYardBindingType instanceof HttpBindingType) {
            setTargetObject(switchYardBindingType.eContainer());
            this._binding = (HttpBindingType) switchYardBindingType;
            setInUpdate(true);
            
            setTextValue(_mAddressURLText, _binding.getAddress());
            setTextValue(_contentTypeText, _binding.getContentType());
            setTextValue(_methodCombo, _binding.getMethod());

            if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed()) {
                OperationSelectorType opSelector = OperationSelectorUtil.getFirstOperationSelector(this._binding);
                _opSelectorComposite.setBinding(this._binding);
                _opSelectorComposite.setOperation((SwitchYardOperationSelectorType) opSelector);
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
                                if (rootSwitchYard.getName() != null) {
                                    this._contextPathText.setText(rootSwitchYard.getName());
                                    handleModify(_contextPathText);
                                }
                            }
                        }
                    }
                }
            }
            
            if (this._binding.getBasic() != null) {
                _authTypeCombo.select(0);
                setTextValue(_userText, this._binding.getBasic().getUser());
                setTextValue(_passwordText, this._binding.getBasic().getPassword());
                setTextValue(_hostText, this._binding.getBasic().getHost());
                setTextValue(_realmText, this._binding.getBasic().getRealm());
                if (this._binding.getBasic().getPort() != null) {
                    setTextValue(_portText, this._binding.getBasic().getPort().toString());
                } else {
                    setTextValue(_portText, "");
                }
            } else if (this._binding.getNtlm() != null) {
                _authTypeCombo.select(1);
                setTextValue(_userText, this._binding.getNtlm().getUser());
                setTextValue(_passwordText, this._binding.getNtlm().getPassword());
                setTextValue(_hostText, this._binding.getNtlm().getHost());
                setTextValue(_realmText, this._binding.getNtlm().getRealm());
                setTextValue(_domainText, this._binding.getNtlm().getDomain());
                if (this._binding.getNtlm().getPort() != null) {
                    setTextValue(_portText, this._binding.getNtlm().getPort().toString());
                } else {
                    setTextValue(_portText, "");
                }
            } else {
                _authTypeCombo.select(0);
                setTextValue(_userText, null);
                setTextValue(_passwordText, null);
                setTextValue(_hostText, null);
                setTextValue(_realmText, null);
                setTextValue(_domainText, null);
                setTextValue(_portText, null);
            }
            _domainText.setEnabled(_authTypeCombo.getText().equals("NTLM"));
            setTabsBinding(_binding);
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
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (control.equals(_contextPathText)) {
                _contextPathText.setText(_binding.getContextPath());
           } else if (control.equals(_mAddressURLText)) {
               _mAddressURLText.setText(_binding.getAddress());
//           } else if (control.equals(_operationSelectionCombo)) {
//               String opName = OperationSelectorUtil.getOperationNameForStaticOperationSelector(this._binding);
//               setTextValue(_operationSelectionCombo, opName);
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

    protected MessageComposerType createMessageComposer() {
        HttpMessageComposerType messageComposer = HttpFactory.eINSTANCE.createHttpMessageComposerType();
        return messageComposer;
    }

    protected ContextMapperType createContextMapper() {
        HttpContextMapperType contextMapper = HttpFactory.eINSTANCE.createHttpContextMapperType();
        return contextMapper;
    }

    class MessageComposerOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getMessageComposer() == null) {
                HttpMessageComposerType messageComposer = (HttpMessageComposerType) createMessageComposer();
                setFeatureValue(_binding, "messageComposer", messageComposer);
            }
        }
    }

    class ContextMapperOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getContextMapper() == null) {
                HttpContextMapperType contextMapper = (HttpContextMapperType) createContextMapper();
                setFeatureValue(_binding, "contextMapper", contextMapper);
            }
        }
    }

    protected void updateMessageComposerFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new MessageComposerOp());
        ops.add(new BasicOperation("messageComposer", featureId, value));
        wrapOperation(ops);
    }

    protected void updateContextMapperFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new ContextMapperOp());
        ops.add(new BasicOperation("contextMapper", featureId, value));
        wrapOperation(ops);
    }

    /**
     * @param switchYardBindingType incoming binding
     */
    public void setTabsBinding(Binding switchYardBindingType) {
        super.setTabsBinding(switchYardBindingType);
        if (_binding != null && _binding instanceof HttpBindingType) {
            HttpBindingType binding = (HttpBindingType) _binding;
            if (binding.getContextMapper() instanceof HttpContextMapperType
                    && ((HttpContextMapperType) binding.getContextMapper()).getClass_() != null) {
                setTextValue(getMapperClassText(), ((HttpContextMapperType) binding.getContextMapper()).getClass_());
            } else {
                setTextValue(getMapperClassText(), "");
            }
            if (binding.getMessageComposer() instanceof HttpMessageComposerType
                    && ((HttpMessageComposerType) binding.getMessageComposer()).getClass_() != null) {
                setTextValue(getComposerClassText(),
                        ((HttpMessageComposerType) binding.getMessageComposer()).getClass_());
            } else {
                setTextValue(getComposerClassText(), "");
            }
            if (binding.getContextMapper() != null) {
                setTextValue(getIncludesText(), binding.getContextMapper().getIncludes());
                setTextValue(getIncludesNSText(), binding.getContextMapper().getIncludeNamespaces());
                setTextValue(getExcludesText(), binding.getContextMapper().getExcludes());
                setTextValue(getExcludesNSText(), binding.getContextMapper().getExcludeNamespaces());
            } else {
                setTextValue(getIncludesText(), "");
                setTextValue(getIncludesNSText(), "");
                setTextValue(getExcludesText(), "");
                setTextValue(getExcludesNSText(), "");
            }
        }
        resetSelectedTab();
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
}
