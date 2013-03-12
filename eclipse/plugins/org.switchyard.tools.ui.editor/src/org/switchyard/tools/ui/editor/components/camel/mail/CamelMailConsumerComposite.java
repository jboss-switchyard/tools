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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.mail.MailConsumerAccountType;
import org.switchyard.tools.models.switchyard1_0.camel.mail.MailFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.util.PropTypeUtil;

/**
 * @author bfitzpat
 * 
 */
public class CamelMailConsumerComposite extends AbstractSYBindingComposite  {

    private Composite _panel;
    private CamelMailBindingType _binding = null;
    private TabFolder _tabFolder;
    private List<String> _advancedPropsFilterList;
    private Text _hostText;
    private Text _portText;
    private Text _usernameText;
    private Text _passwordText;
    private Combo _accountTypeCombo;
    private Text _folderNameText;
    private Text _fetchSizeText;
    private Button _unseenCheckbox;
    private Button _deleteCheckbox;
//    private Text _copyToText;
//    private Button _disconnectCheckbox;
    private Button _securedCheckbox;

    @Override
    public Binding getBinding() {
        return this._binding;
    }

    @Override
    public void setBinding(Binding impl) {
        if (impl instanceof CamelMailBindingType) {
            this._binding = (CamelMailBindingType) impl;
            setInUpdate(true);
            if (this._binding.getConsume() != null) {
                    _deleteCheckbox.setSelection(this._binding.getConsume().isDelete());
//                    _disconnectCheckbox.setSelection(this._binding.getConsume().isDisconnect());
                    _unseenCheckbox.setSelection(this._binding.getConsume().isUnseen());
                if (this._binding.getConsume().getAccountType() != null) {
                    _accountTypeCombo.select(this._binding.getConsume().getAccountType().getValue());
                }
//                if (this._binding.getConsume().getCopyTo() != null) {
//                    _copyToText.setText(this._binding.getConsume().getCopyTo());
//                } else {
//                    _copyToText.setText("");
//                }
                if (this._binding.getConsume().isSetFetchSize()) {
                    setTextValue(_fetchSizeText, PropTypeUtil.getPropValueString(this._binding.getConsume().getFetchSize()));
//                    _fetchSizeText.setText(Integer.toString(this._binding.getConsume().getFetchSize()));
                } else {
                    _fetchSizeText.setText("");
                }
                if (this._binding.getConsume().getFolderName() != null) {
                    _folderNameText.setText(this._binding.getConsume().getFolderName());
                } else {
                    _folderNameText.setText("");
                }
            }
            if (this._binding.getHost() != null) {
                _hostText.setText(this._binding.getHost());
            } else {
                _hostText.setText("");
            }
            if (this._binding.isSetPort()) {
                setTextValue(_portText, PropTypeUtil.getPropValueString(this._binding.getPort()));
//                _portText.setText(Integer.toString(this._binding.getPort()));
            } else {
                _portText.setText("");
            }
            if (this._binding.getUsername() != null) {
                _usernameText.setText(this._binding.getUsername());
            } else {
                _usernameText.setText("");
            }
            if (this._binding.getPassword() != null) {
                _passwordText.setText(this._binding.getPassword());
            } else {
                _passwordText.setText("");
            }
            _securedCheckbox.setSelection(this._binding.isSecure());

            super.setTabsBinding(_binding);
            setInUpdate(false);
            validate();
        } else {
            this._binding = null;
        }
        addObservableListeners();
    }

    @Override
    public void setTargetObject(Object target) {
        super.setTargetObject(target);
    }

    @Override
    protected boolean validate() {
        setErrorMessage(null);
        if (getBinding() != null) {
            if (_hostText.getText().trim().isEmpty()) {
                setErrorMessage("Host may not be empty.");
//            } else if (!_portText.getText().trim().isEmpty()) {
//                try {
//                    new Integer(_portText.getText().trim());
//                } catch (NumberFormatException nfe) {
//                    setErrorMessage("Port value must be a valid number.");
//                }
//            } else if (!_fetchSizeText.getText().trim().isEmpty()) {
//                try {
//                    new Integer(_fetchSizeText.getText().trim());
//                } catch (NumberFormatException nfe) {
//                    setErrorMessage("Fetch Size value must be a valid number.");
//                }
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
        one.setText("Consumer");
        one.setControl(getConsumerTabControl(_tabFolder));
        
        addTabs(_tabFolder);
    }

    private Control getConsumerTabControl(TabFolder tabFolder) {
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
        _securedCheckbox = createCheckbox(mailGroup, "Secured");

        Group consumeGroup = new Group(composite, SWT.NONE);
        consumeGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        consumeGroup.setLayout(new GridLayout(2, false));
        consumeGroup.setText("Consumer Options");
        
        _accountTypeCombo = createLabelAndCombo(consumeGroup, "Account Type", true);
        _accountTypeCombo.add(MailConsumerAccountType.IMAP.getLiteral());
        _accountTypeCombo.add(MailConsumerAccountType.POP3.getLiteral());
        _folderNameText = createLabelAndText(consumeGroup, "Folder Name");
        _fetchSizeText = createLabelAndText(consumeGroup, "Fetch Size");
        _unseenCheckbox = createCheckbox(consumeGroup, "Unread Only");
        _deleteCheckbox = createCheckbox(consumeGroup, "Delete");
//        _copyToText = createLabelAndText(consumeGroup, "Copy To");
//        _disconnectCheckbox = createCheckbox(consumeGroup, "Disconnect");

        return composite;
    }

    @Override
    public Composite getPanel() {
        return this._panel;
    }

    class ConsumeOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getConsume() == null) {
                setFeatureValue(_binding, "consume", MailFactory.eINSTANCE.createCamelMailConsumerType());
            }
        }
    }

    protected void updateConsumeFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new ConsumeOp());
        ops.add(new BasicOperation("consume", featureId, value));
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
                updateFeature(_binding, "port", _portText.getText().trim());
            }
            updateFeature(_binding, "port", _portText.getText().trim());
        } else if (control.equals(_usernameText)) {
            updateFeature(_binding, "username", _usernameText.getText().trim());
        } else if (control.equals(_passwordText)) {
            updateFeature(_binding, "password", _passwordText.getText().trim());
        } else if (control.equals(_folderNameText)) {
            updateConsumeFeature("folderName", _folderNameText.getText().trim());
        } else if (control.equals(_fetchSizeText)) {
            try {
                Integer fetchSize = new Integer(_fetchSizeText.getText().trim());
                updateConsumeFeature("fetchSize", fetchSize);
            } catch (NumberFormatException nfe) {
                updateConsumeFeature("fetchSize", _fetchSizeText.getText().trim());
            }
        } else if (control.equals(_unseenCheckbox)) {
            updateConsumeFeature("unseen", new Boolean(_unseenCheckbox.getSelection()));
        } else if (control.equals(_deleteCheckbox)) {
            updateConsumeFeature("delete", new Boolean(_deleteCheckbox.getSelection()));
//        } else if (control.equals(_copyToText)) {
//            updateConsumeFeature("copyTo", _copyToText.getText().trim());
//        } else if (control.equals(_disconnectCheckbox)) {
//            updateConsumeFeature("disconnect", new Boolean(_disconnectCheckbox.getSelection()));
        } else if (control.equals(_accountTypeCombo)) {
            MailConsumerAccountType acctType = MailConsumerAccountType.get(_accountTypeCombo.getSelectionIndex());
            updateConsumeFeature("accountType", acctType);
        } else if (control.equals(_securedCheckbox)) {
            updateFeature(_binding, "secure", _securedCheckbox.getSelection());
        } else {
            super.handleModify(control);
        }
        validate();
        setHasChanged(false);
        setDidSomething(true);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (this._binding.getConsume() != null) {
                if (control.equals(_deleteCheckbox)) {
                    _deleteCheckbox.setSelection(this._binding.getConsume().isDelete());
//                } else if (control.equals(_disconnectCheckbox)) {
//                    _disconnectCheckbox.setSelection(this._binding.getConsume().isDisconnect());
                } else if (control.equals(_unseenCheckbox)) {
                    _unseenCheckbox.setSelection(this._binding.getConsume().isUnseen());
                } else if (control.equals(_accountTypeCombo)) {
                    _accountTypeCombo.select(this._binding.getConsume().getAccountType().getValue());
//                } else if (control.equals(_copyToText)) {
//                    _copyToText.setText(this._binding.getConsume().getCopyTo());
                } else if (control.equals(_fetchSizeText)) {
                    setTextValue(_fetchSizeText, PropTypeUtil.getPropValueString(this._binding.getConsume().getFetchSize()));
//                    _fetchSizeText.setText(Integer.toString(this._binding.getConsume().getFetchSize()));
                } else if (control.equals(_folderNameText)) {
                    _folderNameText.setText(this._binding.getConsume().getFolderName());
                }
            } else if (control.equals(_hostText)) {
                _hostText.setText(this._binding.getHost());
            } else if (control.equals(_portText)) {
                setTextValue(_portText, PropTypeUtil.getPropValueString(this._binding.getPort()));
//                _portText.setText(Integer.toString(this._binding.getPort()));
            } else if (control.equals(_usernameText)) {
                _usernameText.setText(this._binding.getUsername());
            } else if (control.equals(_passwordText)) {
                _passwordText.setText(this._binding.getPassword());
            } else if (control.equals(_securedCheckbox)) {
                _securedCheckbox.setSelection(this._binding.isSecure());
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
            _advancedPropsFilterList.add("maxMessagesPerPoll");
            _advancedPropsFilterList.add("initialDelay");
            _advancedPropsFilterList.add("delay");
            _advancedPropsFilterList.add("useFixedDelay");
            _advancedPropsFilterList.add("sendEmptyMessageWhenIdle");
            _advancedPropsFilterList.add("timeUnit");
            _advancedPropsFilterList.add("copyTo");
            _advancedPropsFilterList.add("disconnect");
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
