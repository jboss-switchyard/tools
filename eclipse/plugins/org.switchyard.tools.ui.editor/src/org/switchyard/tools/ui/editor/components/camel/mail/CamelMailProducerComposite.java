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
package org.switchyard.tools.ui.editor.components.camel.mail;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.mail.MailFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;

/**
 * @author bfitzpat
 * 
 */
public class CamelMailProducerComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelMailBindingType _binding = null;
    private TabFolder _tabFolder;
    private List<String> _advancedPropsFilterList;
    private Text _hostText;
    private Text _portText;
    private Text _usernameText;
    private Text _passwordText;
    private Text _subjectText;
    private Text _fromText;
    private Text _toText;
    private Text _ccText;
    private Text _bccText;
    private Text _replyToText;

    @Override
    public Binding getBinding() {
        return this._binding;
    }

    @Override
    public void setBinding(Binding impl) {
        if (impl instanceof CamelMailBindingType) {
            this._binding = (CamelMailBindingType) impl;
            setInUpdate(true);
            if (this._binding.getProduce() != null) {
                if (this._binding.getProduce().getSubject() != null) {
                    _subjectText.setText(this._binding.getProduce().getSubject());
                }
                if (this._binding.getProduce().getFrom() != null) {
                    _fromText.setText(this._binding.getProduce().getFrom());
                }
                if (this._binding.getProduce().getTo() != null) {
                    _toText.setText(this._binding.getProduce().getTo());
                }
                if (this._binding.getProduce().getCC() != null) {
                    _ccText.setText(this._binding.getProduce().getCC());
                }
                if (this._binding.getProduce().getCC() != null) {
                    _ccText.setText(this._binding.getProduce().getCC());
                }
                if (this._binding.getProduce().getBCC() != null) {
                    _bccText.setText(this._binding.getProduce().getBCC());
                }
                if (this._binding.getProduce().getReplyTo() != null) {
                    _replyToText.setText(this._binding.getProduce().getReplyTo());
                }
            }
            if (this._binding.getHost() != null) {
                _hostText.setText(this._binding.getHost());
            }
            if (this._binding.getPort() != null) {
                _portText.setText(this._binding.getPort().toString());
            }
            if (this._binding.getUsername() != null) {
                _usernameText.setText(this._binding.getUsername());
            }
            if (this._binding.getPassword() != null) {
                _passwordText.setText(this._binding.getPassword());
            }
            super.setTabsBinding(_binding);
            setInUpdate(false);
            validate();
        } else {
            this._binding = null;
        }
        addObservableListeners();
    }

    @Override
    protected boolean validate() {
        setErrorMessage(null);
        if (getBinding() != null) {
            if (_hostText.getText().trim().isEmpty()) {
                setErrorMessage("Host may not be empty.");
            } else if (!_portText.getText().trim().isEmpty()) {
                try {
                    new Integer(_portText.getText().trim());
                } catch (NumberFormatException nfe) {
                    setErrorMessage("Port value must be a valid number.");
                }
            }
        }
        super.validateTabs();
        return (getErrorMessage() == null);
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());
        if (getRootGridData() != null) {
            _panel.setLayoutData(getRootGridData());
        }

        _tabFolder = new TabFolder(_panel, SWT.NONE);

        TabItem one = new TabItem(_tabFolder, SWT.NONE);
        one.setText("Producer");
        one.setControl(getProducerTabControl(_tabFolder));

        addTabs(_tabFolder);
    }

    private Control getProducerTabControl(TabFolder tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(1, false);
        composite.setLayout(gl);

        Group mailGroup = new Group(composite, SWT.NONE);
        mailGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        mailGroup.setLayout(new GridLayout(2, false));
        mailGroup.setText("Mail Server Options");

        _hostText = createLabelAndText(mailGroup, "Host*");
        _portText = createLabelAndText(mailGroup, "Port");
        _usernameText = createLabelAndText(mailGroup, "User Name");
        _passwordText = createLabelAndText(mailGroup, "Password");
        _passwordText.setEchoChar('*');

        Group producerGroup = new Group(composite, SWT.NONE);
        producerGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        producerGroup.setLayout(new GridLayout(2, false));
        producerGroup.setText("Producer Options");
        
        _subjectText = createLabelAndText(producerGroup, "Subject");
        _fromText = createLabelAndText(producerGroup, "From");
        _toText = createLabelAndText(producerGroup, "To");
        _ccText = createLabelAndText(producerGroup, "CC");
        _bccText = createLabelAndText(producerGroup, "BCC");
        _replyToText = createLabelAndText(producerGroup, "Reply To");

        return composite;
    }

    @Override
    public Composite getPanel() {
        return this._panel;
    }

    class ProduceOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getProduce() == null) {
                setFeatureValue(_binding, "produce", MailFactory.eINSTANCE.createCamelMailProducerType());
            }
        }
    }

    protected void updateProduceFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new ProduceOp());
        ops.add(new BasicOperation("produce", featureId, value));
        wrapOperation(ops);
    }

    protected void handleModify(final Control control) {
        if (control.equals(_hostText)) {
            updateFeature(_binding, "host", _hostText.getText().trim());
        } else if (control.equals(_portText)) {
            try {
                Integer port = new Integer(_portText.getText().trim());
                updateFeature(_binding, "port", port.intValue());
            } catch (NumberFormatException nfe) {
                // ignore
                nfe.fillInStackTrace();
            }
            updateFeature(_binding, "port", _portText.getText().trim());
        } else if (control.equals(_usernameText)) {
            updateFeature(_binding, "username", _usernameText.getText().trim());
        } else if (control.equals(_passwordText)) {
            updateFeature(_binding, "password", _passwordText.getText().trim());
        } else if (control.equals(_subjectText)) {
            updateProduceFeature("subject", _subjectText.getText().trim());
        } else if (control.equals(_fromText)) {
            updateProduceFeature("from", _fromText.getText().trim());
        } else if (control.equals(_toText)) {
            updateProduceFeature("to", _toText.getText().trim());
        } else if (control.equals(_ccText)) {
            updateProduceFeature("cc", _ccText.getText().trim());
        } else if (control.equals(_bccText)) {
            updateProduceFeature("bcc", _bccText.getText().trim());
        } else if (control.equals(_replyToText)) {
            updateProduceFeature("replyTo", _replyToText.getText().trim());
        } else {
            super.handleModify(control);
        }
        validate();
        setHasChanged(false);
        setDidSomething(true);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (control.equals(_hostText)) {
                _hostText.setText(this._binding.getHost());
            } else if (control.equals(_portText)) {
                _portText.setText(this._binding.getPort().toString());
            } else if (control.equals(_usernameText)) {
                _usernameText.setText(this._binding.getUsername());
            } else if (control.equals(_passwordText)) {
                _passwordText.setText(this._binding.getPassword());
            } else if (control.equals(_subjectText)) {
                _subjectText.setText(this._binding.getPassword());
            } else if (control.equals(_fromText)) {
                _fromText.setText(this._binding.getProduce().getFrom());
            } else if (control.equals(_toText)) {
                _toText.setText(this._binding.getProduce().getTo());
            } else if (control.equals(_ccText)) {
                _ccText.setText(this._binding.getProduce().getCC());
            } else if (control.equals(_bccText)) {
                _bccText.setText(this._binding.getProduce().getBCC());
            } else if (control.equals(_replyToText)) {
                _replyToText.setText(this._binding.getProduce().getReplyTo());
            } else {
                super.handleUndo(control);
            }
        }
        setHasChanged(false);
    }

    @Override
    protected List<String> getAdvancedPropertiesFilterList() {
        if (_advancedPropsFilterList == null) {
            _advancedPropsFilterList = new ArrayList<String>();
            _advancedPropsFilterList.add("connectionTimeout");
        }
        return _advancedPropsFilterList;
    }
    
    @Override
    protected ContextMapperType createContextMapper() {
        return SwitchyardFactory.eINSTANCE.createContextMapperType();
    }

    @Override
    protected MessageComposerType createMessageComposer() {
        return SwitchyardFactory.eINSTANCE.createMessageComposerType();
    }
    
}
