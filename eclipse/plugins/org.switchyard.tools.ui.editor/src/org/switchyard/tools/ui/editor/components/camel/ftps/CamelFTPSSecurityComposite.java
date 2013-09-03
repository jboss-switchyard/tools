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
package org.switchyard.tools.ui.editor.components.camel.ftps;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;

/**
 * @author bfitzpat
 * 
 */
public class CamelFTPSSecurityComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelFtpsBindingType _binding = null;
    private Button _isImplicitCheckbox;
    private Combo _execProtCombo;
    private Combo _securityProtocolCombo;

    @Override
    public String getTitle() {
        return Messages.title_ftpsSecurityDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_ftpsSecurityDetails;
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof CamelFtpsBindingType) {
            this._binding = (CamelFtpsBindingType) impl;
            setInUpdate(true);
            _isImplicitCheckbox.setSelection(this._binding.isIsImplicit());
            if (this._binding.getSecurityProtocol() != null) {
                _securityProtocolCombo.setText(this._binding.getSecurityProtocol());
            } else {
                _securityProtocolCombo.setText(""); //$NON-NLS-1$
            }
            if (this._binding.getExecProt() != null) {
                _execProtCombo.setText(this._binding.getExecProt());
            } else {
                _execProtCombo.setText(""); //$NON-NLS-1$
            }
            setInUpdate(false);
            validate();
        } else {
            this._binding = null;
        }
        addObservableListeners();
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getFTPSTabControl(_panel);
    }
    
    private Control getFTPSTabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);
        
        _securityProtocolCombo = createLabelAndCombo(composite, Messages.label_securityProtocol, true);
        _securityProtocolCombo.add(Messages.label_tls);
        _securityProtocolCombo.add(Messages.label_ssl);
        
        _isImplicitCheckbox = createCheckbox(composite, Messages.label_implicit);
        
        _execProtCombo = createLabelAndCombo(composite, Messages.label_executionProtocol, true);
        _execProtCombo.add("C"); //$NON-NLS-1$
        _execProtCombo.add("S"); //$NON-NLS-1$
        _execProtCombo.add("E"); //$NON-NLS-1$
        _execProtCombo.add("P"); //$NON-NLS-1$
        
        return composite;
    }

    @Override
    public Composite getPanel() {
        return this._panel;
    }

    @Override
    protected boolean validate() {
        setErrorMessage(null);
        return true;
    }

    protected void handleModify(final Control control) {
        if (control.equals(_isImplicitCheckbox)) {
            updateFeature(_binding, "isImplicit", new Boolean(_isImplicitCheckbox.getSelection())); //$NON-NLS-1$
        } else if (control.equals(_securityProtocolCombo)) {
            updateFeature(_binding, "securityProtocol", _securityProtocolCombo.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_execProtCombo)) {
            updateFeature(_binding, "execProt", _execProtCombo.getText().trim()); //$NON-NLS-1$
        } else {
            super.handleModify(control);
        }
        validate();
        setHasChanged(false);
        setDidSomething(true);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (control.equals(_isImplicitCheckbox)) {
                _isImplicitCheckbox.setSelection(this._binding.isIsImplicit());
            } else if (control.equals(_securityProtocolCombo)) {
                _securityProtocolCombo.setText(this._binding.getSecurityProtocol());
            } else if (control.equals(_execProtCombo)) {
                _execProtCombo.setText(this._binding.getExecProt());
            } else {
                super.handleUndo(control);
            }
        }
        setHasChanged(false);
    }

}
