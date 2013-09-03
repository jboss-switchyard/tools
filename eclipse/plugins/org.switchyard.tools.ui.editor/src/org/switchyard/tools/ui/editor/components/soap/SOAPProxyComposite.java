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

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.soap.ProxyType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPFactory;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;

/**
 * @author bfitzpat
 * 
 */
public class SOAPProxyComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private SOAPBindingType _binding = null;
    private Text _proxyHostText;
    private Text _proxyPortText;
    private String _proxyPort;
    private Text _proxyUserText;
    private Text _proxyPasswordText;
    private Combo _proxyTypeCombo;

    /**
     * Create a new SOAPProxyComposite.
     */
    public SOAPProxyComposite() {
    }

    @Override
    public String getTitle() {
        return Messages.title_proxySettings;
    }

    @Override
    public String getDescription() {
        return Messages.description_soapProxySettings;
    }

    /**
     * @param parent composite parent
     * @param style any style bits
     */
    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getProxyTabControl(_panel);
    }

    private Control getProxyTabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);

        _proxyTypeCombo = createLabelAndCombo(composite, Messages.label_type);
        _proxyTypeCombo.add("HTTP"); //$NON-NLS-1$
        _proxyTypeCombo.add("SOCKS"); //$NON-NLS-1$
        _proxyTypeCombo.select(0);
        _proxyHostText = createLabelAndText(composite, Messages.label_host);
        _proxyPortText = createLabelAndText(composite, Messages.label_port);
        _proxyUserText = createLabelAndText(composite, Messages.label_userName);
        _proxyPasswordText = createLabelAndText(composite, Messages.label_password);
        
        return composite;
    }
    
    protected void handleModify(Control control) {
        if (_binding != null) {
            if (control.equals(_proxyTypeCombo)) {
                updateProxyFeature("type", _proxyTypeCombo.getText()); //$NON-NLS-1$
            } else if (control.equals(_proxyHostText)) {
                updateProxyFeature("host", _proxyHostText.getText()); //$NON-NLS-1$
            } else if (control.equals(_proxyPasswordText)) {
                updateProxyFeature("password", _proxyPasswordText.getText()); //$NON-NLS-1$
            } else if (control.equals(_proxyUserText)) {
                updateProxyFeature("user", _proxyUserText.getText()); //$NON-NLS-1$
            } else if (control.equals(_proxyPortText)) {
                _proxyPort = _proxyPortText.getText();
                updateProxyFeature("port", _proxyPort); //$NON-NLS-1$
            } else {
                super.handleModify(control);
            }
        }
        validate();
        setHasChanged(false);
        setDidSomething(true);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (control.equals(_proxyTypeCombo)) {
                if (_binding.getProxy() != null) {
                    setTextValue(_proxyTypeCombo, _binding.getProxy().getType());
                } else {
                    _proxyTypeCombo.setText("HTTP"); //$NON-NLS-1$
                }
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
            } else {
                super.handleUndo(control);
            }
        }
        setHasChanged(false);
    }

    protected boolean validate() {
        setErrorMessage(null);
        
//        if (_proxyPort != null && _proxyPort.trim().length() > 0) {
//            try {
//                Integer.parseInt(_proxyPort);
//            } catch (NumberFormatException nfe) {
//                setErrorMessage("The proxy port must be a valid integer");
//            }
//        }

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
            if (_binding.getProxy() != null) {
                setTextValue(_proxyTypeCombo, _binding.getProxy().getType());
                setTextValue(_proxyHostText, _binding.getProxy().getHost());
                if (_binding.getProxy().getPort() != null) {
                    setTextValue(_proxyPortText, _binding.getProxy().getPort().toString());
                } else {
                    setTextValue(_proxyPortText, null);
                }
                setTextValue(_proxyUserText, _binding.getProxy().getUser());
                setTextValue(_proxyPasswordText, _binding.getProxy().getPassword());
            } else {
                setTextValue(_proxyTypeCombo, null);
                _proxyTypeCombo.select(0);
                setTextValue(_proxyHostText, null);
                setTextValue(_proxyPortText, null);
                setTextValue(_proxyUserText, null);
                setTextValue(_proxyPasswordText, null);
            }
            setInUpdate(false);
            validate();
        }
        addObservableListeners();
    }

    class AddProxyOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getProxy() == null) {
                ProxyType proxy = SOAPFactory.eINSTANCE.createProxyType();
                setFeatureValue(_binding, "proxy", proxy); //$NON-NLS-1$
                setFeatureValue(_binding.getProxy(), "type", "HTTP"); //$NON-NLS-1$ //$NON-NLS-2$
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
                    setFeatureValue(_binding, "proxy", null); //$NON-NLS-1$
                }
            }
        }
    }

    protected void updateProxyFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new AddProxyOp());
        if (featureId != null) {
            ops.add(new BasicOperation("proxy", featureId, value)); //$NON-NLS-1$
        }
        ops.add(new CleanupProxyOp());
        wrapOperation(ops);
    }

}
