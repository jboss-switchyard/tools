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

import java.math.BigInteger;
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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpFactory;
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
public class CamelFTPSConsumerComposite extends AbstractSYBindingComposite {

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
    private Button _deleteButton;
    private Button _recursiveButton;
    private Text _preMoveText;
    private Text _moveText;
    private Text _moveFailedText;
    private Text _includeText;
    private Text _excludeText;
    private Text _delayText;
    private OperationSelectorComposite _opSelectorComposite;

    @Override
    public String getTitle() {
        return Messages.title_ftpsBindingDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_ftpsBindingDetails;
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof CamelFtpsBindingType) {
            this._binding = (CamelFtpsBindingType) impl;
            setInUpdate(true);
            if (this._binding.getConsume() != null) {
                if (this._binding.getConsume().isSetDelay()) {
                    setTextValue(_delayText, PropTypeUtil.getPropValueString(this._binding.getConsume().getDelay()));
                } else {
                    _delayText.setText(""); //$NON-NLS-1$
                }
                if (this._binding.getConsume().getExclude() != null) {
                    _excludeText.setText(this._binding.getConsume().getExclude());
                } else {
                    _excludeText.setText(""); //$NON-NLS-1$
                }
                if (this._binding.getConsume().getInclude() != null) {
                    _includeText.setText(this._binding.getConsume().getInclude());
                } else {
                    _includeText.setText(""); //$NON-NLS-1$
                }
                if (this._binding.getConsume().getMoveFailed() != null) {
                    _moveFailedText.setText(this._binding.getConsume().getMoveFailed());
                } else {
                    _moveFailedText.setText(""); //$NON-NLS-1$
                }
                if (this._binding.getConsume().getMove() != null) {
                    _moveText.setText(this._binding.getConsume().getMove());
                } else {
                    _moveText.setText(""); //$NON-NLS-1$
                }
                if (this._binding.getConsume().getPreMove() != null) {
                    _preMoveText.setText(this._binding.getConsume().getPreMove());
                } else {
                    _preMoveText.setText(""); //$NON-NLS-1$
                }
                _deleteButton.setSelection(this._binding.getConsume().isDelete());
                _recursiveButton.setSelection(this._binding.getConsume().isRecursive());
            }
            if (this._binding.getDirectory() != null) {
                _directoryText.setText(this._binding.getDirectory());
            } else {
                _directoryText.setText(""); //$NON-NLS-1$
            }
            if (this._binding.getFileName() != null) {
                _fileNameText.setText(this._binding.getFileName());
            } else {
                _fileNameText.setText(""); //$NON-NLS-1$
            }
            _autoCreateButton.setSelection(this._binding.isAutoCreate());
            if (this._binding.getHost() != null) {
                _hostText.setText(this._binding.getHost());
            } else {
                _hostText.setText(""); //$NON-NLS-1$
            }
            if (this._binding.isSetPort()) {
                setTextValue(_portText, PropTypeUtil.getPropValueString(this._binding.getPort()));
            } else {
                _portText.setText(""); //$NON-NLS-1$
            }
            if (this._binding.getUsername() != null) {
                _usernameText.setText(this._binding.getUsername());
            } else {
                _usernameText.setText(""); //$NON-NLS-1$
            }
            if (this._binding.getPassword() != null) {
                _pwdText.setText(this._binding.getPassword());
            } else {
                _pwdText.setText(""); //$NON-NLS-1$
            }
            if (_binding.getName() == null) {
                _nameText.setText(""); //$NON-NLS-1$
            } else {
                _nameText.setText(_binding.getName());
            }
            _binaryButton.setSelection(this._binding.isBinary());
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
            if (_directoryText.getText().trim().isEmpty()) {
                setErrorMessage(Messages.error_emptyDirectory);
                return false;
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

        _hostText = createLabelAndText(composite, Messages.label_host);
        _portText = createLabelAndText(composite, Messages.label_portDefault21);
        _usernameText = createLabelAndText(composite, Messages.label_userName);
        _pwdText = createLabelAndText(composite, Messages.label_password);
        _pwdText.setEchoChar('*');
        _binaryButton = createCheckbox(composite, Messages.label_useBinaryTransferMode);

        Group fileGroup = new Group(composite, SWT.NONE);
        fileGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
        fileGroup.setLayout(new GridLayout(2, false));
        fileGroup.setText(Messages.label_fileAndDirectoryOptions);

        _directoryText = createLabelAndText(fileGroup, Messages.label_directoryStar);
        _fileNameText = createLabelAndText(fileGroup, Messages.label_fileName);
        _autoCreateButton = createCheckbox(fileGroup, Messages.label_autoCreateMissingDirectories);
        _includeText = createLabelAndText(fileGroup, Messages.label_include);
        _excludeText = createLabelAndText(fileGroup, Messages.label_exclude);
        _deleteButton = createCheckbox(fileGroup, Messages.label_deleteFilesOnceProcessed);
        _recursiveButton = createCheckbox(fileGroup, Messages.label_processSubDirectoriesRecursively);

        _opSelectorComposite = new OperationSelectorComposite(composite, SWT.NONE);
        _opSelectorComposite.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
        _opSelectorComposite.setLayout(new GridLayout(2, false));
        _opSelectorComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                handleModify(_opSelectorComposite);
            }
         });

        Group moveGroup = new Group(composite, SWT.NONE);
        moveGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
        moveGroup.setLayout(new GridLayout(2, false));
        moveGroup.setText(Messages.label_moveOptions);

        _preMoveText = createLabelAndText(moveGroup, Messages.label_preMove);
        _moveText = createLabelAndText(moveGroup, Messages.label_moveDefaultDotCamel);
        _moveFailedText = createLabelAndText(moveGroup, Messages.label_moveFailed);

        Group pollGroup = new Group(composite, SWT.NONE);
        pollGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
        pollGroup.setLayout(new GridLayout(2, false));
        pollGroup.setText(Messages.label_pollOptions);

        _delayText = createLabelAndText(pollGroup, Messages.label_delayBetweenPollsDefault500);

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
                setFeatureValue(_binding, "consume", FtpFactory.eINSTANCE.createRemoteFileConsumerType()); //$NON-NLS-1$
            }
        }
    }

    protected void updateConsumeFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new ConsumeOp());
        ops.add(new BasicOperation("consume", featureId, value)); //$NON-NLS-1$
        wrapOperation(ops);
    }

    private void handleConsumer(Control control) {
        if (control.equals(_delayText)) {
            try {
                updateConsumeFeature("delay", new BigInteger(_delayText.getText().trim())); //$NON-NLS-1$
            } catch (NumberFormatException nfe) {
                updateConsumeFeature("delay", _delayText.getText().trim()); //$NON-NLS-1$
            }
        } else if (control.equals(_deleteButton)) {
            updateConsumeFeature("delete", new Boolean(_deleteButton.getSelection())); //$NON-NLS-1$
        } else if (control.equals(_recursiveButton)) {
            updateConsumeFeature("recursive", new Boolean(_recursiveButton.getSelection())); //$NON-NLS-1$
        } else if (control.equals(_excludeText)) {
            updateConsumeFeature("exclude", _excludeText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_includeText)) {
            updateConsumeFeature("include", _includeText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_moveFailedText)) {
            updateConsumeFeature("moveFailed", _moveFailedText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_moveText)) {
            updateConsumeFeature("move", _moveText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_preMoveText)) {
            updateConsumeFeature("preMove", _preMoveText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_opSelectorComposite)) {
            int opType = _opSelectorComposite.getSelectedOperationSelectorType();
            updateOperationSelectorFeature(opType, _opSelectorComposite.getSelectedOperationSelectorValue());
        }
    }

    protected void handleModify(Control control) {
        if (control.equals(_directoryText)) {
            updateFeature(_binding, "directory", _directoryText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_fileNameText)) {
            updateFeature(_binding, "fileName", _fileNameText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_autoCreateButton)) {
            updateFeature(_binding, "autoCreate", new Boolean(_autoCreateButton.getSelection())); //$NON-NLS-1$
        } else if (control.equals(_hostText)) {
            updateFeature(_binding, "host", _hostText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_usernameText)) {
            updateFeature(_binding, "username", _usernameText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_pwdText)) {
            updateFeature(_binding, "password", _pwdText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_binaryButton)) {
            updateFeature(_binding, "binary", new Boolean(_binaryButton.getSelection())); //$NON-NLS-1$
        } else if (control.equals(_portText)) {
            try {
                int port = Integer.parseInt(_portText.getText().trim());
                updateFeature(_binding, "port", port); //$NON-NLS-1$
            } catch (NumberFormatException nfe) {
                updateFeature(_binding, "port", _portText.getText().trim()); //$NON-NLS-1$
            }
        } else if (control.equals(_nameText)) {
            super.updateFeature(_binding, "name", _nameText.getText().trim()); //$NON-NLS-1$
        } else {
            handleConsumer(control);
        }
        super.handleModify(control);
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
                _nameText.setText(_binding.getName() == null ? "" : _binding.getName()); //$NON-NLS-1$
            } else if (this._binding.getConsume() != null) {
                if (control.equals(_delayText)) {
                    setTextValue(_delayText, PropTypeUtil.getPropValueString(this._binding.getConsume().getDelay()));
                } else if (control.equals(_excludeText)) {
                    _excludeText.setText(this._binding.getConsume().getExclude());
                } else if (control.equals(_includeText)) {
                    _includeText.setText(this._binding.getConsume().getInclude());
                } else if (control.equals(_moveFailedText)) {
                    _moveFailedText.setText(this._binding.getConsume().getMoveFailed());
                } else if (control.equals(_moveText)) {
                    _moveText.setText(this._binding.getConsume().getMove());
                } else if (control.equals(_preMoveText)) {
                    _preMoveText.setText(this._binding.getConsume().getPreMove());
                } else if (control.equals(_deleteButton)) {
                    _deleteButton.setSelection(this._binding.getConsume().isDelete());
                } else if (control.equals(_recursiveButton)) {
                    _recursiveButton.setSelection(this._binding.getConsume().isRecursive());
                }
            } else {
                super.handleUndo(control);
            }
        }
        setHasChanged(false);
    }

}
