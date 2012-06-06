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
package org.switchyard.tools.ui.editor.diagram.shared;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
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
import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelOperationSelectorType;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.util.InterfaceOpsUtil;

/**
 * @author bfitzpat
 * 
 */
public class CamelFTPConsumerComposite extends AbstractSwitchyardComposite implements IBindingComposite {

    private Composite _panel;
    private CamelFtpBindingType _binding = null;
    private boolean _inUpdate = false;

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
    private Combo _operationSelectionCombo;
    private Object _targetObj = null;

    @Override
    public Binding getBinding() {
        return this._binding;
    }

    @Override
    public void setBinding(Binding impl) {
        if (impl instanceof CamelFtpBindingType) {
            this._binding = (CamelFtpBindingType) impl;
            _inUpdate = true;
            if (this._binding.getConsume() != null) {
                if (this._binding.getConsume().getDelay() != null) {
                    _delayText.setText(this._binding.getConsume().getDelay().toString());
                }
                if (this._binding.getConsume().getExclude() != null) {
                    _excludeText.setText(this._binding.getConsume().getExclude());
                }
                if (this._binding.getConsume().getInclude() != null) {
                    _includeText.setText(this._binding.getConsume().getInclude());
                }
                if (this._binding.getConsume().getMoveFailed() != null) {
                    _moveFailedText.setText(this._binding.getConsume().getMoveFailed());
                }
                if (this._binding.getConsume().getMove() != null) {
                    _moveText.setText(this._binding.getConsume().getMove());
                }
                if (this._binding.getConsume().getPreMove() != null) {
                    _preMoveText.setText(this._binding.getConsume().getPreMove());
                }
                if (this._binding.getConsume().isDelete()) {
                    _deleteButton.setSelection(this._binding.getConsume().isDelete());
                }
                if (this._binding.getConsume().isRecursive()) {
                    _recursiveButton.setSelection(this._binding.getConsume().isRecursive());
                }
            }
            if (this._binding.getDirectory() != null) {
                _directoryText.setText(this._binding.getDirectory());
            }
            if (this._binding.getFileName() != null) {
                _fileNameText.setText(this._binding.getFileName());
            }
            if (this._binding.isAutoCreate()) {
                _autoCreateButton.setSelection(this._binding.isAutoCreate());
            }
            if (this._binding.getHost() != null) {
                _hostText.setText(this._binding.getHost());
            }
            if (this._binding.isSetPort()) {
                _portText.setText(Integer.toString(this._binding.getPort()));
            }
            if (this._binding.getUsername() != null) {
                _usernameText.setText(this._binding.getUsername());
            }
            if (this._binding.getPassword() != null) {
                _pwdText.setText(this._binding.getPassword());
            }
            if (this._binding.isBinary()) {
                _binaryButton.setSelection(this._binding.isBinary());
            }
            populateOperationCombo();
            if (this._binding.getCamelOperationSelector() != null) {
                CamelOperationSelectorType camelOpSelector = (CamelOperationSelectorType) this._binding
                        .getCamelOperationSelector();
                _operationSelectionCombo.setText(camelOpSelector.getOperationName());
            }
            _inUpdate = false;
            validate();
        } else {
            this._binding = null;
            populateOperationCombo();
        }
    }

    @Override
    protected void validate() {
        setErrorMessage(null);
        if (getBinding() != null) {
            if (_directoryText.getText().trim().isEmpty()) {
                setErrorMessage("Directory may not be empty.");
            } else if (!_delayText.getText().trim().isEmpty()) {
                try {
                    new BigInteger(_delayText.getText().trim());
                } catch (NumberFormatException nfe) {
                    setErrorMessage("Delay value must be a valid number.");
                }
            } else if (!_portText.getText().trim().isEmpty()) {
                try {
                    new Integer(_portText.getText().trim());
                } catch (NumberFormatException nfe) {
                    setErrorMessage("Port value must be a valid number.");
                }
            }
        }
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());
        if (getRootGridData() != null) {
            _panel.setLayoutData(getRootGridData());
        }

        TabFolder tabFolder = new TabFolder(_panel, SWT.NONE);

        TabItem one = new TabItem(tabFolder, SWT.NONE);
        one.setText("Consumer");
        one.setControl(getConsumerTabControl(tabFolder));
    }

    private Control getConsumerTabControl(TabFolder tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(1, false);
        composite.setLayout(gl);

        Group ftpGroup = new Group(composite, SWT.NONE);
        ftpGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        ftpGroup.setLayout(new GridLayout(2, false));
        ftpGroup.setText("FTP Options");

        _hostText = createLabelAndText(ftpGroup, "Host");
        _portText = createLabelAndText(ftpGroup, "Port (Default 21)");
        _usernameText = createLabelAndText(ftpGroup, "User Name");
        _pwdText = createLabelAndText(ftpGroup, "Password");
        _pwdText.setEchoChar('*');
        _binaryButton = createCheckbox(ftpGroup, "Use Binary Transfer Mode");

        Group fileGroup = new Group(composite, SWT.NONE);
        fileGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        fileGroup.setLayout(new GridLayout(2, false));
        fileGroup.setText("File and Directory Options");

        _directoryText = createLabelAndText(fileGroup, "Directory*");
        _fileNameText = createLabelAndText(fileGroup, "File Name");
        _autoCreateButton = createCheckbox(fileGroup, "Auto Create Missing Directories in File Path");
        _includeText = createLabelAndText(fileGroup, "Include");
        _excludeText = createLabelAndText(fileGroup, "Exclude");
        _deleteButton = createCheckbox(fileGroup, "Delete Files Once Processed");
        _recursiveButton = createCheckbox(fileGroup, "Process Sub-Directories Recursively");

        Group opGroup = new Group(composite, SWT.NONE);
        opGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        opGroup.setLayout(new GridLayout(2, false));
        opGroup.setText("Operation Options");
        _operationSelectionCombo = createLabelAndCombo(opGroup, "Operation");
        populateOperationCombo();

        Group moveGroup = new Group(composite, SWT.NONE);
        moveGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        moveGroup.setLayout(new GridLayout(2, false));
        moveGroup.setText("Move Options");

        _preMoveText = createLabelAndText(moveGroup, "Pre-Move");
        _moveText = createLabelAndText(moveGroup, "Move (Default .camel)");
        _moveFailedText = createLabelAndText(moveGroup, "Move Failed");

        Group pollGroup = new Group(composite, SWT.NONE);
        pollGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        pollGroup.setLayout(new GridLayout(2, false));
        pollGroup.setText("Poll Options");

        _delayText = createLabelAndText(pollGroup, "Delay Between Polls (MS) (Default 500)");

        return composite;
    }

    @Override
    public Composite getPanel() {
        return this._panel;
    }

    private void populateOperationCombo() {
        if (_operationSelectionCombo != null && !_operationSelectionCombo.isDisposed()) {
            _operationSelectionCombo.removeAll();
            _operationSelectionCombo.clearSelection();

            if (_targetObj == null) {
                @SuppressWarnings("restriction")
                PictogramElement[] pes = 
                        SwitchyardSCAEditor.getActiveEditor().getSelectedPictogramElements();
                if (pes.length > 0) {
                    @SuppressWarnings("restriction")
                    Object bo = SwitchyardSCAEditor.getActiveEditor().
                        getDiagramTypeProvider().getFeatureProvider().
                           getBusinessObjectForPictogramElement(pes[0]);
                    if (bo instanceof Service) {
                        _targetObj = bo;
                    }
                }
            }
            if (_targetObj != null && _targetObj instanceof Service) {
                String[] operations = InterfaceOpsUtil.gatherOperations((Service) _targetObj);
                for (int i = 0; i < operations.length; i++) {
                    _operationSelectionCombo.add(operations[i]);
                }
            }
        }
    }
    /**
     * @param parent parent composite
     * @param label string to put in label
     * @return reference to created Text control
     */
    protected Text createLabelAndText(Composite parent, String label) {
        Text newText = super.createLabelAndText(parent, label);
        newText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                if (!_inUpdate) {
                    validate();
                    handleModify((Control) e.getSource());
                    fireChangedEvent((Control) e.getSource());
                }
            }
        });
        return newText;
    }

    /**
     * @param parent parent composite
     * @param label string to put in label
     * @return reference to created Text control
     */
    protected Combo createLabelAndCombo(Composite parent, String label) {
        Combo combo = super.createLabelAndCombo(parent, label);
        combo.addSelectionListener(new SelectionListener() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (!_inUpdate) {
                    validate();
                    handleModify((Control) e.getSource());
                    fireChangedEvent((Control) e.getSource());
                }
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                widgetSelected(e);
            }
        });
        return combo;
    }

    /**
     * @param parent parent composite
     * @param label string for label
     * @return reference to created Button
     */
    protected Button createCheckbox(Composite parent, String label) {
        Button newButton = super.createCheckbox(parent, label);
        newButton.addSelectionListener(new SelectionListener() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (!_inUpdate) {
                    handleModify((Control) e.getSource());
                    validate();
                    fireChangedEvent((Control) e.getSource());
                }
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                widgetSelected(e);
            }
        });
        return newButton;
    }

    private void setFeatureValue(EObject eObject, String featureId, Object value) {
        EClass eClass = eObject.eClass();
        for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
            EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
            if (eStructuralFeature.isChangeable()) {
                if (eStructuralFeature.getName().equalsIgnoreCase(featureId)) {
                    eObject.eSet(eStructuralFeature, value);
                    break;
                }
            }
        }
    }

    private class ConsumeRecordingCommand extends RecordingCommand {

        private CamelFtpBindingType _innerBinding;
        private String _featureId;
        private Object _value;

        public ConsumeRecordingCommand(TransactionalEditingDomain domain, CamelFtpBindingType binding,
                String featureId, Object value) {
            super(domain);
            this._innerBinding = binding;
            this._featureId = featureId;
            this._value = value;
        }

        @Override
        protected void doExecute() {
            if (_innerBinding.getConsume() == null) {
                _innerBinding.setConsume(CamelFactory.eINSTANCE.createRemoteFileConsumerType());
            }
            setFeatureValue(_innerBinding.getConsume(), _featureId, _value);
        }

    }

    private class BindingRecordingCommand extends RecordingCommand {

        private CamelFtpBindingType _innerBinding;
        private String _featureId;
        private Object _value;

        public BindingRecordingCommand(TransactionalEditingDomain domain, CamelFtpBindingType binding,
                String featureId, Object value) {
            super(domain);
            this._innerBinding = binding;
            this._featureId = featureId;
            this._value = value;
        }

        @Override
        protected void doExecute() {
            setFeatureValue(_innerBinding, _featureId, _value);
        }

    }

    private void handleConsumer(final Control control, final TransactionalEditingDomain domain) {
        if (control.equals(_delayText)) {
            if (domain != null) {
                try {
                    ConsumeRecordingCommand command = new ConsumeRecordingCommand(domain, _binding, "delay",
                            new BigInteger(_delayText.getText().trim()));
                    domain.getCommandStack().execute(command);
                } catch (NumberFormatException nfe) {
                    // do nothing
                    nfe.fillInStackTrace();
                }
            } else {
                if (_binding.getConsume() == null) {
                    _binding.setConsume(CamelFactory.eINSTANCE.createRemoteFileConsumerType());
                }
                try {
                    setFeatureValue(_binding.getConsume(), "delay", new BigInteger(_delayText.getText().trim()));
                } catch (NumberFormatException nfe) {
                    // do nothing
                    nfe.fillInStackTrace();
                }
            }
        } else if (control.equals(_deleteButton)) {
            if (domain != null) {
                ConsumeRecordingCommand command = new ConsumeRecordingCommand(domain, _binding, "delete", new Boolean(
                        _deleteButton.getSelection()));
                domain.getCommandStack().execute(command);
            } else {
                if (_binding.getConsume() == null) {
                    _binding.setConsume(CamelFactory.eINSTANCE.createRemoteFileConsumerType());
                }
                _binding.getConsume().setDelete(_deleteButton.getSelection());
            }
        } else if (control.equals(_recursiveButton)) {
            if (domain != null) {
                ConsumeRecordingCommand command = new ConsumeRecordingCommand(domain, _binding, "recursive",
                        new Boolean(_recursiveButton.getSelection()));
                domain.getCommandStack().execute(command);
            } else {
                if (_binding.getConsume() == null) {
                    _binding.setConsume(CamelFactory.eINSTANCE.createRemoteFileConsumerType());
                }
                _binding.getConsume().setRecursive(_recursiveButton.getSelection());
            }
        } else if (control.equals(_excludeText)) {
            if (domain != null) {
                ConsumeRecordingCommand command = new ConsumeRecordingCommand(domain, _binding, "exclude", _excludeText
                        .getText().trim());
                domain.getCommandStack().execute(command);
            } else {
                if (_binding.getConsume() == null) {
                    _binding.setConsume(CamelFactory.eINSTANCE.createRemoteFileConsumerType());
                }
                _binding.getConsume().setExclude(_excludeText.getText().trim());
            }
        } else if (control.equals(_includeText)) {
            if (domain != null) {
                ConsumeRecordingCommand command = new ConsumeRecordingCommand(domain, _binding, "include", _includeText
                        .getText().trim());
                domain.getCommandStack().execute(command);
            } else {
                if (_binding.getConsume() == null) {
                    _binding.setConsume(CamelFactory.eINSTANCE.createRemoteFileConsumerType());
                }
                _binding.getConsume().setInclude(_includeText.getText().trim());
            }
        } else if (control.equals(_moveFailedText)) {
            if (domain != null) {
                ConsumeRecordingCommand command = new ConsumeRecordingCommand(domain, _binding, "moveFailed",
                        _moveFailedText.getText().trim());
                domain.getCommandStack().execute(command);
            } else {
                if (_binding.getConsume() == null) {
                    _binding.setConsume(CamelFactory.eINSTANCE.createRemoteFileConsumerType());
                }
                _binding.getConsume().setMoveFailed(_moveText.getText().trim());
            }
        } else if (control.equals(_moveText)) {
            if (domain != null) {
                ConsumeRecordingCommand command = new ConsumeRecordingCommand(domain, _binding, "move", _moveFailedText
                        .getText().trim());
                domain.getCommandStack().execute(command);
            } else {
                if (_binding.getConsume() == null) {
                    _binding.setConsume(CamelFactory.eINSTANCE.createRemoteFileConsumerType());
                }
                _binding.getConsume().setMove(_moveText.getText().trim());
            }
        } else if (control.equals(_preMoveText)) {
            if (domain != null) {
                ConsumeRecordingCommand command = new ConsumeRecordingCommand(domain, _binding, "preMove", _preMoveText
                        .getText().trim());
                domain.getCommandStack().execute(command);
            } else {
                if (_binding.getConsume() == null) {
                    _binding.setConsume(CamelFactory.eINSTANCE.createRemoteFileConsumerType());
                }
                _binding.getConsume().setPreMove(_preMoveText.getText().trim());
            }
        } else if (control.equals(_operationSelectionCombo)) {
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        if (_binding.getOperationSelector() == null) {
                            _binding.setCamelOperationSelector(CamelFactory.eINSTANCE
                                    .createCamelOperationSelectorType());
                        }
                        ((CamelOperationSelectorType) _binding.getCamelOperationSelector())
                                .setOperationName(_operationSelectionCombo.getText().trim());
                    }
                });
            } else {
                if (_binding.getOperationSelector() == null) {
                    _binding.setCamelOperationSelector(CamelFactory.eINSTANCE.createCamelOperationSelectorType());
                }
                ((CamelOperationSelectorType) _binding.getCamelOperationSelector())
                        .setOperationName(_operationSelectionCombo.getText().trim());
            }
        }
    }

    @SuppressWarnings("restriction")
    private void handleModify(final Control control) {
        TransactionalEditingDomain domain = null;
        if (_binding.eContainer() != null) {
            domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
        }
        if (control.equals(_directoryText)) {
            if (domain != null) {
                BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "directory",
                        _directoryText.getText().trim());
                domain.getCommandStack().execute(command);
            } else {
                _binding.setDirectory(_directoryText.getText().trim());
            }
        } else if (control.equals(_fileNameText)) {
            if (domain != null) {
                BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "fileName",
                        _fileNameText.getText().trim());
                domain.getCommandStack().execute(command);
            } else {
                _binding.setFileName(_fileNameText.getText().trim());
            }
        } else if (control.equals(_autoCreateButton)) {
            if (domain != null) {
                BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "autoCreate",
                        new Boolean(_autoCreateButton.getSelection()));
                domain.getCommandStack().execute(command);
            } else {
                _binding.setAutoCreate(_autoCreateButton.getSelection());
            }
        } else if (control.equals(_hostText)) {
            if (domain != null) {
                BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "host", _hostText
                        .getText().trim());
                domain.getCommandStack().execute(command);
            } else {
                _binding.setHost(_hostText.getText().trim());
            }
        } else if (control.equals(_usernameText)) {
            if (domain != null) {
                BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "username",
                        _usernameText.getText().trim());
                domain.getCommandStack().execute(command);
            } else {
                _binding.setUsername(_usernameText.getText().trim());
            }
        } else if (control.equals(_pwdText)) {
            if (domain != null) {
                BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "password", _pwdText
                        .getText().trim());
                domain.getCommandStack().execute(command);
            } else {
                _binding.setPassword(_pwdText.getText().trim());
            }
        } else if (control.equals(_binaryButton)) {
            if (domain != null) {
                BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "binary", new Boolean(
                        _binaryButton.getSelection()));
                domain.getCommandStack().execute(command);
            } else {
                _binding.setBinary(_binaryButton.getSelection());
            }
        } else if (control.equals(_portText)) {
            if (domain != null) {
                try {
                    BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "port",
                            new Integer(_portText.getText().trim()));
                    domain.getCommandStack().execute(command);
                } catch (NumberFormatException nfe) {
                    nfe.fillInStackTrace();
                }
            } else {
                try {
                    int port = Integer.parseInt(_portText.getText().trim());
                    _binding.setPort(port);
                } catch (NumberFormatException nfe) {
                    nfe.fillInStackTrace();
                }
            }
        } else {
            handleConsumer(control, domain);
        }
    }

    /**
     * @param target Passed in what we're dropping on
     */
    public void setTargetObject(Object target) {
        this._targetObj = target;
    }
}
