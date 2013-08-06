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

import java.util.ArrayList;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpFactory;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.util.PropTypeUtil;

/**
 * @author bfitzpat
 * 
 */
public class CamelFTPSProducerComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelFtpsBindingType _binding = null;
    private Text _nameText;
    private Text _hostText;
    private Text _portText;
    private Text _usernameText;
    private Text _pwdText;
    private Button _binaryButton;
    private Text _directoryText;
    private Button _autoCreateButton;
    private Text _fileNameText;
    private Text _fileExistText;
    private Text _tempPrefixText;

    @Override
    public String getTitle() {
        return "FTPS Binding Details";
    }

    @Override
    public String getDescription() {
        return "Specify pertinent details for your FTPS Binding.";
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof CamelFtpsBindingType) {
            this._binding = (CamelFtpsBindingType) impl;
            setInUpdate(true);
            if (this._binding.getProduce() != null) {
                if (this._binding.getProduce().getFileExist() != null) {
                    _fileExistText.setText(this._binding.getProduce().getFileExist());
                } else {
                    _fileExistText.setText("");
                }
                if (this._binding.getProduce().getTempPrefix() != null) {
                    _tempPrefixText.setText(this._binding.getProduce().getTempPrefix());
                } else {
                    _tempPrefixText.setText("");
                }
            }
            if (this._binding.getDirectory() != null) {
                _directoryText.setText(this._binding.getDirectory());
            } else {
                _directoryText.setText("");
            }
            if (this._binding.getFileName() != null) {
                _fileNameText.setText(this._binding.getFileName());
            } else {
                _fileNameText.setText("");
            }
            _autoCreateButton.setSelection(this._binding.isAutoCreate());
            if (this._binding.getHost() != null) {
                _hostText.setText(this._binding.getHost());
            } else {
                _hostText.setText("");
            }
            if (this._binding.isSetPort()) {
                setTextValue(_portText, PropTypeUtil.getPropValueString(this._binding.getPort()));
            } else {
                _portText.setText("");
            }
            if (this._binding.getUsername() != null) {
                _usernameText.setText(this._binding.getUsername());
            } else {
                _usernameText.setText("");
            }
            if (this._binding.getPassword() != null) {
                _pwdText.setText(this._binding.getPassword());
            } else {
                _pwdText.setText("");
            }
            if (_binding.getName() == null) {
                _nameText.setText("");
            } else {
                _nameText.setText(_binding.getName());
            }
            _binaryButton.setSelection(this._binding.isBinary());
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
            if (_directoryText.getText().trim().isEmpty()) {
                setErrorMessage("Directory may not be empty.");
            }
        }
        return (getErrorMessage() == null);
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getProducerTabControl(_panel);
    }

    private Control getProducerTabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);

        _nameText = createLabelAndText(composite, "Name");

        _hostText = createLabelAndText(composite, "Host");
        _portText = createLabelAndText(composite, "Port (Default 21)");
        _usernameText = createLabelAndText(composite, "User Name");
        _pwdText = createLabelAndText(composite, "Password");
        _pwdText.setEchoChar('*');
        _binaryButton = createCheckbox(composite, "Use Binary Transfer Mode");
        
        Group fileGroup = new Group(composite, SWT.NONE);
        fileGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
        fileGroup.setLayout(new GridLayout(2, false));
        fileGroup.setText("File and Directory Options");

        _directoryText = createLabelAndText(fileGroup, "Directory*");
        _fileNameText = createLabelAndText(fileGroup, "File Name");
        _autoCreateButton = createCheckbox(fileGroup, "Auto Create Missing Directories in File Path");
        _fileExistText = createLabelAndText(fileGroup, "File Exist");
        _tempPrefixText = createLabelAndText(fileGroup, "Temp Prefix");
        
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
                setFeatureValue(_binding, "produce", FtpFactory.eINSTANCE.createRemoteFileProducerType());
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
        if (control.equals(_directoryText)) {
            updateFeature(_binding, "directory", _directoryText.getText().trim());
        } else if (control.equals(_fileNameText)) {
            updateFeature(_binding, "fileName", _fileNameText.getText().trim());
        } else if (control.equals(_autoCreateButton)) {
            updateFeature(_binding, "autoCreate", new Boolean(_autoCreateButton.getSelection()));
        } else if (control.equals(_hostText)) {
            updateFeature(_binding, "host", _hostText.getText().trim());
        } else if (control.equals(_usernameText)) {
            updateFeature(_binding, "username", _usernameText.getText().trim());
        } else if (control.equals(_pwdText)) {
            updateFeature(_binding, "password", _pwdText.getText().trim());
        } else if (control.equals(_binaryButton)) {
            updateFeature(_binding, "binary", new Boolean(_binaryButton.getSelection()));
        } else if (control.equals(_portText)) {
            try {
                int port = Integer.parseInt(_portText.getText().trim());
                updateFeature(_binding, "port", port);
            } catch (NumberFormatException nfe) {
                updateFeature(_binding, "port", _portText.getText().trim());
            }
        } else if (control.equals(_fileExistText)) {
            updateProduceFeature("fileExist", _fileExistText.getText().trim());
        } else if (control.equals(_tempPrefixText)) {
            updateProduceFeature("tempPrefix", _tempPrefixText.getText().trim());
        } else if (control.equals(_nameText)) {
            super.updateFeature(_binding, "name", _nameText.getText().trim());
        } else {
            super.handleModify(control);
        }
        validate();
        setHasChanged(false);
        setDidSomething(true);
    }
    
    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (control.equals(_directoryText)) {
                _directoryText.setText(this._binding.getDirectory());
            } else if (control.equals(_fileNameText)) {
                _fileNameText.setText(this._binding.getFileName());
            } else if (control.equals(_autoCreateButton)) {
                _autoCreateButton.setSelection(this._binding.isAutoCreate());
            } else if (control.equals(_hostText)) {
                _hostText.setText(this._binding.getHost());
            } else if (control.equals(_portText)) {
                setTextValue(_portText, PropTypeUtil.getPropValueString(this._binding.getPort()));
            } else if (control.equals(_usernameText)) {
                _usernameText.setText(this._binding.getUsername());
            } else if (control.equals(_pwdText)) {
                _pwdText.setText(this._binding.getPassword());
            } else if (control.equals(_binaryButton)) {
                _binaryButton.setSelection(this._binding.isBinary());
            } else if (control.equals(_nameText)) {
                _nameText.setText(_binding.getName() == null ? "" : _binding.getName());
            } else if (this._binding.getProduce() != null) {
                if (control.equals(_fileExistText)) {
                    _fileExistText.setText(this._binding.getProduce().getFileExist());
                } else if (control.equals(_tempPrefixText)) {
                    _tempPrefixText.setText(this._binding.getProduce().getTempPrefix());
                }
            } else {
                super.handleUndo(control);
            }
        }
        setHasChanged(false);
    }

}
