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
package org.switchyard.tools.ui.editor.components.soap;

import java.util.ArrayList;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wst.wsdl.Port;
import org.switchyard.tools.models.switchyard1_0.soap.BasicAuthenticationType;
import org.switchyard.tools.models.switchyard1_0.soap.NTLMAuthenticationType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPFactory;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.diagram.shared.WSDLPortSelectionDialog;

/**
 * @author bfitzpat
 * 
 */
public class SOAPAuthenticationComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private SOAPBindingType _binding = null;
    private Combo _authTypeCombo;
    private Text _authUserText;
    private Text _authPasswordText;
    private Text _authDomainText;

    /**
     * Create a new SOAPAuthenticationComposite.
     */
    public SOAPAuthenticationComposite() {
    }

    @Override
    public String getTitle() {
        return "Authentication Details";
    }

    @Override
    public String getDescription() {
        return "Specify authentication details for your SOAP Binding.";
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
        _authDomainText = createLabelAndText(composite, "Domain");
        
        _authTypeCombo.select(0);
        _authDomainText.setEnabled(_authTypeCombo.getText().equals("NTLM"));
        
        return composite;
    }

    protected void handleModify(Control control) {
        if (_binding != null) {
            if (control.equals(_authUserText)) {
                String user = _authUserText.getText().trim();
                updateAuthFeature("user", user);
            } else if (control.equals(_authPasswordText)) {
                String password = _authPasswordText.getText().trim();
                updateAuthFeature("password", password);
            } else if (control.equals(_authDomainText)) {
                String domain = _authDomainText.getText().trim();
                updateAuthFeature("domain", domain);
            } else {
                super.handleModify(control);
            }
        }
        validate();
        setHasChanged(false);
        setDidSomething(true);
    }

    protected void handleUndo(Control control) {
        super.handleUndo(control);
        setHasChanged(false);
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
        if (switchYardBindingType instanceof SOAPBindingType) {
            setTargetObject(switchYardBindingType.eContainer());
            this._binding = (SOAPBindingType) switchYardBindingType;
            setInUpdate(true);
            if (this._binding.getBasic() != null) {
                _authTypeCombo.select(0);
                setTextValue(_authUserText, this._binding.getBasic().getUser());
                setTextValue(_authPasswordText, this._binding.getBasic().getPassword());
            } else if (this._binding.getNtlm() != null) {
                _authTypeCombo.select(1);
                setTextValue(_authUserText, this._binding.getNtlm().getUser());
                setTextValue(_authPasswordText, this._binding.getNtlm().getPassword());
                setTextValue(_authDomainText, this._binding.getNtlm().getDomain());
            } else {
                if (_authTypeCombo != null) {
                    _authTypeCombo.select(0);
                    setTextValue(_authUserText, null);
                    setTextValue(_authPasswordText, null);
                    setTextValue(_authDomainText, null);
                }
            }
            if (_authDomainText != null) {
                _authDomainText.setEnabled(_authTypeCombo.getText().equals("NTLM"));
            }
            setInUpdate(false);
            validate();
        }
        addObservableListeners();
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
                BasicAuthenticationType basicAuth = SOAPFactory.eINSTANCE.createBasicAuthenticationType();
                _binding.setBasic(basicAuth);
            }
        }
    }
    
    class AddNtlmAuthenticatiOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getNtlm() == null) {
                NTLMAuthenticationType ntlmAuth = SOAPFactory.eINSTANCE.createNTLMAuthenticationType();
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
