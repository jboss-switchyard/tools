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

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.mail.MailConsumerAccountType;
import org.switchyard.tools.models.switchyard1_0.camel.mail.MailFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardOperationSelectorType;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorComposite;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorUtil;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.util.PropTypeUtil;

/**
 * @author bfitzpat
 * 
 */
public class CamelMailConsumerComposite extends AbstractSYBindingComposite  {

    private Composite _panel;
    private CamelMailBindingType _binding = null;
    private Text _nameText;
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
    private OperationSelectorComposite _opSelectorComposite;

    @Override
    public String getTitle() {
        return Messages.title_mailBindingDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_mailBindingDetails;
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
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
                    _fetchSizeText.setText(""); //$NON-NLS-1$
                }
                if (this._binding.getConsume().getFolderName() != null) {
                    _folderNameText.setText(this._binding.getConsume().getFolderName());
                } else {
                    _folderNameText.setText(""); //$NON-NLS-1$
                }
            }
            if (this._binding.getHost() != null) {
                _hostText.setText(this._binding.getHost());
            } else {
                _hostText.setText(""); //$NON-NLS-1$
            }
            if (this._binding.isSetPort()) {
                setTextValue(_portText, PropTypeUtil.getPropValueString(this._binding.getPort()));
//                _portText.setText(Integer.toString(this._binding.getPort()));
            } else {
                _portText.setText(""); //$NON-NLS-1$
            }
            if (this._binding.getUsername() != null) {
                _usernameText.setText(this._binding.getUsername());
            } else {
                _usernameText.setText(""); //$NON-NLS-1$
            }
            if (this._binding.getPassword() != null) {
                _passwordText.setText(this._binding.getPassword());
            } else {
                _passwordText.setText(""); //$NON-NLS-1$
            }
            if (_binding.getName() == null) {
                _nameText.setText(""); //$NON-NLS-1$
            } else {
                _nameText.setText(_binding.getName());
            }
            _securedCheckbox.setSelection(this._binding.isSecure());
            OperationSelectorType opSelector = OperationSelectorUtil.getFirstOperationSelector(this._binding);
            _opSelectorComposite.setBinding(this._binding);
            _opSelectorComposite.setOperation((SwitchYardOperationSelectorType) opSelector);

            setInUpdate(false);
            validate();
        } else {
            this._binding = null;
        }
        addObservableListeners();
    }

    @Override
    public void setTargetObject(EObject target) {
        super.setTargetObject(target);
        if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed()) {
            _opSelectorComposite.setTargetObject((EObject) target);
        }
    }

    @Override
    protected boolean validate() {
        setErrorMessage(null);
        if (getBinding() != null) {
            if (_hostText.getText().trim().isEmpty()) {
                setErrorMessage(Messages.error_emptyHost);
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
        return (getErrorMessage() == null);
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getConsumerTabControl(_panel);
    }

    private Control getConsumerTabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);

        _nameText = createLabelAndText(composite, Messages.label_name);

        _hostText = createLabelAndText(composite, Messages.label_hostStar);
        _portText = createLabelAndText(composite, Messages.label_port);
        _usernameText = createLabelAndText(composite, Messages.label_userName);
        _passwordText = createLabelAndText(composite, Messages.label_password);
        _passwordText.setEchoChar('*');
        _securedCheckbox = createCheckbox(composite, Messages.label_secured);

        Group consumeGroup = new Group(composite, SWT.NONE);
        consumeGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
        consumeGroup.setLayout(new GridLayout(2, false));
        consumeGroup.setText(Messages.label_consumerOptions);
        
        _accountTypeCombo = createLabelAndCombo(consumeGroup, Messages.label_accountType, true);
        _accountTypeCombo.add(MailConsumerAccountType.IMAP.getLiteral());
        _accountTypeCombo.add(MailConsumerAccountType.POP3.getLiteral());
        _folderNameText = createLabelAndText(consumeGroup, Messages.label_folderName);
        _fetchSizeText = createLabelAndText(consumeGroup, Messages.label_fetchSize);
        _unseenCheckbox = createCheckbox(consumeGroup, Messages.label_unreadOnly);
        _deleteCheckbox = createCheckbox(consumeGroup, Messages.label_delete);
//        _copyToText = createLabelAndText(consumeGroup, "Copy To");
//        _disconnectCheckbox = createCheckbox(consumeGroup, "Disconnect");

        _opSelectorComposite = new OperationSelectorComposite(composite, SWT.NONE);
        GridData opSelectGD = new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1);
        opSelectGD.horizontalIndent = -5;
        _opSelectorComposite.setLayoutData(opSelectGD);
        _opSelectorComposite.setLayout(new GridLayout(2, false));
        _opSelectorComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                handleModify(_opSelectorComposite);
            }
         });

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
                setFeatureValue(_binding, "consume", MailFactory.eINSTANCE.createCamelMailConsumerType()); //$NON-NLS-1$
            }
        }
    }

    protected void updateConsumeFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new ConsumeOp());
        ops.add(new BasicOperation("consume", featureId, value)); //$NON-NLS-1$
        wrapOperation(ops);
    }

    protected void handleModify(final Control control) {
        if (control.equals(_hostText)) {
            updateFeature(_binding, "host", _hostText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_portText)) {
            try {
                Integer port = new Integer(_portText.getText().trim());
                updateFeature(_binding, "port", port.intValue()); //$NON-NLS-1$
            } catch (NumberFormatException nfe) {
                updateFeature(_binding, "port", _portText.getText().trim()); //$NON-NLS-1$
            }
            updateFeature(_binding, "port", _portText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_usernameText)) {
            updateFeature(_binding, "username", _usernameText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_passwordText)) {
            updateFeature(_binding, "password", _passwordText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_folderNameText)) {
            updateConsumeFeature("folderName", _folderNameText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_fetchSizeText)) {
            try {
                Integer fetchSize = new Integer(_fetchSizeText.getText().trim());
                updateConsumeFeature("fetchSize", fetchSize); //$NON-NLS-1$
            } catch (NumberFormatException nfe) {
                updateConsumeFeature("fetchSize", _fetchSizeText.getText().trim()); //$NON-NLS-1$
            }
        } else if (control.equals(_unseenCheckbox)) {
            updateConsumeFeature("unseen", new Boolean(_unseenCheckbox.getSelection())); //$NON-NLS-1$
        } else if (control.equals(_deleteCheckbox)) {
            updateConsumeFeature("delete", new Boolean(_deleteCheckbox.getSelection())); //$NON-NLS-1$
//        } else if (control.equals(_copyToText)) {
//            updateConsumeFeature("copyTo", _copyToText.getText().trim());
//        } else if (control.equals(_disconnectCheckbox)) {
//            updateConsumeFeature("disconnect", new Boolean(_disconnectCheckbox.getSelection()));
        } else if (control.equals(_accountTypeCombo)) {
            MailConsumerAccountType acctType = MailConsumerAccountType.get(_accountTypeCombo.getSelectionIndex());
            updateConsumeFeature("accountType", acctType); //$NON-NLS-1$
        } else if (control.equals(_securedCheckbox)) {
            updateFeature(_binding, "secure", _securedCheckbox.getSelection()); //$NON-NLS-1$
        } else if (control.equals(_nameText)) {
            super.updateFeature(_binding, "name", _nameText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_opSelectorComposite)) {
            int opType = _opSelectorComposite.getSelectedOperationSelectorType();
            updateOperationSelectorFeature(opType, _opSelectorComposite.getSelectedOperationSelectorValue());
            fireChangedEvent(_opSelectorComposite);
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
            } else if (control.equals(_nameText)) {
                _nameText.setText(_binding.getName() == null ? "" : _binding.getName()); //$NON-NLS-1$
            } else {
                super.handleUndo(control);
            }
        }
        setHasChanged(false);
    }

}
