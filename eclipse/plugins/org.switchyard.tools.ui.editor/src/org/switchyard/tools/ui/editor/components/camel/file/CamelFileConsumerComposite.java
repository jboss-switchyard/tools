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
package org.switchyard.tools.ui.editor.components.camel.file;

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
import org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.file.FileFactory;
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
public class CamelFileConsumerComposite extends AbstractSYBindingComposite  {

    private Composite _panel;
    private CamelFileBindingType _binding = null;
    private Text _nameText;
    private Text _directoryText;
    private Text _fileNameText;
    private Button _autoCreateButton;
    private Text _includeText;
    private Text _excludeText;
    private Text _preMoveText;
    private Text _moveText;
    private Text _moveFailedText;
    private Text _maxMessagesPerPollText;
    private Text _delayText;
    private OperationSelectorComposite _opSelectorComposite;

    @Override
    public String getTitle() {
        return Messages.title_fileBindingDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_fileBindingDetails;
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof CamelFileBindingType) {
            this._binding = (CamelFileBindingType) impl;
            setInUpdate(true);
            if (this._binding.getConsume() != null) {
                if (this._binding.getConsume().isSetDelay()) {
                    setTextValue(_delayText, PropTypeUtil.getPropValueString(this._binding.getConsume().getDelay()));
//                    _delayText.setText(Integer.toString(this._binding.getConsume().getDelay()));
                } else {
                    _delayText.setText(""); //$NON-NLS-1$
                }
                if (this._binding.getConsume().isSetMaxMessagesPerPoll()) {
                    setTextValue(_maxMessagesPerPollText, PropTypeUtil.getPropValueString(this._binding.getConsume().getMaxMessagesPerPoll()));
//                    _maxMessagesPerPollText.setText(Integer.toString(this._binding.getConsume().getMaxMessagesPerPoll()));
                } else {
                    _maxMessagesPerPollText.setText(""); //$NON-NLS-1$
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
            if (_binding.getName() == null) {
                _nameText.setText(""); //$NON-NLS-1$
            } else {
                _nameText.setText(_binding.getName());
            }
            _autoCreateButton.setSelection(this._binding.isAutoCreate());
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
//            } else if (!_delayText.getText().trim().isEmpty()) {
//                try {
//                    new BigInteger(_delayText.getText().trim());
//                } catch (NumberFormatException nfe) {
//                    setErrorMessage("Delay value must be a valid number.");
//                }
//            } else if (!_maxMessagesPerPollText.getText().trim().isEmpty()) {
//                try {
//                    new BigInteger(_maxMessagesPerPollText.getText().trim());
//                } catch (NumberFormatException nfe) {
//                    setErrorMessage("Max Messages per Poll value must be a valid number.");
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

        _directoryText = createLabelAndText(composite, Messages.label_directoryStar);
        _fileNameText = createLabelAndText(composite, Messages.label_fileName);

        _autoCreateButton = createCheckbox(composite, Messages.label_autoCreateMissingDirectories);
        _includeText = createLabelAndText(composite, Messages.label_include);
        _excludeText = createLabelAndText(composite, Messages.label_exclude);

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

        _maxMessagesPerPollText = createLabelAndText(pollGroup, Messages.label_maxMessagesPerPollDefault0);
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
                setFeatureValue(_binding, "consume", FileFactory.eINSTANCE.createFileConsumerType()); //$NON-NLS-1$
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
        if (control.equals(_directoryText)) {
            updateFeature(_binding, "directory", _directoryText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_fileNameText)) {
            updateFeature(_binding, "fileName", _fileNameText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_autoCreateButton)) {
            updateFeature(_binding, "autoCreate", new Boolean(_autoCreateButton.getSelection())); //$NON-NLS-1$
        } else if (control.equals(_delayText)) {
            try {
                BigInteger delay = new BigInteger(_delayText.getText().trim());
                updateConsumeFeature("delay", delay); //$NON-NLS-1$
            } catch (NumberFormatException nfe) {
                updateConsumeFeature("delay", _delayText.getText().trim()); //$NON-NLS-1$
            }
        } else if (control.equals(_excludeText)) {
            updateConsumeFeature("exclude", _excludeText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_includeText)) {
            updateConsumeFeature("include", _includeText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_maxMessagesPerPollText)) {
            try {
                BigInteger max = new BigInteger(_maxMessagesPerPollText.getText().trim());
                updateConsumeFeature("maxMessagesPerPoll", max); //$NON-NLS-1$
            } catch (NumberFormatException nfe) {
                updateConsumeFeature("maxMessagesPerPoll", _maxMessagesPerPollText.getText().trim()); //$NON-NLS-1$
            }
        } else if (control.equals(_moveFailedText)) {
            updateConsumeFeature("moveFailed", _moveFailedText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_moveText)) {
            updateConsumeFeature("move", _moveText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_preMoveText)) {
            updateConsumeFeature("preMove", _preMoveText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_opSelectorComposite)) {
            int opType = _opSelectorComposite.getSelectedOperationSelectorType();
            updateOperationSelectorFeature(opType, _opSelectorComposite.getSelectedOperationSelectorValue());
            fireChangedEvent(_opSelectorComposite);
        } else if (control.equals(_nameText)) {
            super.updateFeature(_binding, "name", _nameText.getText().trim()); //$NON-NLS-1$
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
//            } else if (control.equals(_operationSelectionCombo)) {
//                String opName = CamelBindingUtil.getOperationNameForStaticOperationSelector(this._binding);
//                setTextValue(_operationSelectionCombo, opName);
            } else if (control.equals(_nameText)) {
                _nameText.setText(_binding.getName() == null ? "" : _binding.getName()); //$NON-NLS-1$
            } else if (this._binding.getConsume() != null) {
                if (control.equals(_delayText)) {
                    setTextValue(_delayText, PropTypeUtil.getPropValueString(this._binding.getConsume().getDelay()));
//                    _delayText.setText(Integer.toString(this._binding.getConsume().getDelay()));
                } else if (control.equals(_maxMessagesPerPollText)) {
                    setTextValue(_maxMessagesPerPollText, PropTypeUtil.getPropValueString(this._binding.getConsume().getMaxMessagesPerPoll()));
//                    _maxMessagesPerPollText.setText(Integer.toString(this._binding.getConsume().getMaxMessagesPerPoll()));
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
                }
            } else {
                super.handleUndo(control);
            }
        }
        setHasChanged(false);
    }

}
