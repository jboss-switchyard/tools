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

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.resteasy.ProxyType;
import org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType;
import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyFactory;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;

/**
 * @author bfitzpat
 * 
 */
public class ResteasyProxyComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private RESTBindingType _binding = null;
    private Text _proxyHostText;
    private Text _proxyPortText;
    private String _proxyPort;
    private Text _proxyUserText;
    private Text _proxyPasswordText;

    @Override
    public String getTitle() {
        return "Proxy Settings";
    }

    @Override
    public String getDescription() {
        return "Specify proxy settings for your REST Binding.";
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

        _proxyHostText = createLabelAndText(composite, "Host");
        _proxyPortText = createLabelAndText(composite, "Port");
        _proxyUserText = createLabelAndText(composite, "User Name");
        _proxyPasswordText = createLabelAndText(composite, "Password");

        return composite;
    }

    protected void handleModify(Control control) {
        if (_binding != null) {
            if (control.equals(_proxyHostText)) {
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
            }
        }
        super.handleModify(control);
        validate();
        setHasChanged(false);
        setDidSomething(true);
    }

    protected boolean validate() {
        setErrorMessage(null);
        if (_proxyPort != null && _proxyPort.trim().length() > 0) {
            try {
                Integer.parseInt(_proxyPort);
            } catch (NumberFormatException nfe) {
                setErrorMessage("The proxy port must be a valid integer");
            }
        }

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
        if (switchYardBindingType instanceof RESTBindingType) {
            setTargetObject(switchYardBindingType.eContainer());
            this._binding = (RESTBindingType) switchYardBindingType;
            setInUpdate(true);
            if (_binding.getProxy() != null) {
                setTextValue(_proxyHostText, _binding.getProxy().getHost());
                if (_binding.getProxy().getPort() != null) {
                    setTextValue(_proxyPortText, _binding.getProxy().getPort().toString());
                }
                setTextValue(_proxyUserText, _binding.getProxy().getUser());
                setTextValue(_proxyPasswordText, _binding.getProxy().getPassword());
            }
            setInUpdate(false);
            validate();
        } else {
            this._binding = null;
        }
        addObservableListeners();
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (control.equals(_proxyHostText)) {
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
                if (_binding.getProxy().getHost() == null && _binding.getProxy().getPassword() == null
                        && _binding.getProxy().getPort() == null && _binding.getProxy().getUser() == null) {
                    setFeatureValue(_binding, "proxy", null);
                }
            }
        }
    }

}
