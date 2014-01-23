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
package org.switchyard.tools.ui.editor.components.camel.ftp;

import java.math.BigInteger;
import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpFactory;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.util.PropTypeUtil;

/**
 * @author bfitzpat
 * 
 */
public class CamelFTPConsumerMoveAndPollComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelFtpBindingType _binding = null;
    private Text _preMoveText;
    private Text _moveText;
    private Text _moveFailedText;
    private Text _delayText;
    private Text _maxMessagesPerPollText;

    @Override
    public String getTitle() {
        return Messages.CamelFTPConsumerMoveAndPollComposite_MoveAndPoll_wizard_page_title;
    }

    @Override
    public String getDescription() {
        return Messages.CamelFTPConsumerMoveAndPollComposite_MoveAndPoll_wizard_page_description;
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof CamelFtpBindingType) {
            this._binding = (CamelFtpBindingType) impl;
            setInUpdate(true);
            if (this._binding.getConsume() != null) {
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
                if (this._binding.getConsume().getMaxMessagesPerPoll() != null) {
                    setTextValue(_maxMessagesPerPollText, 
                            PropTypeUtil.getPropValueString(this._binding.getConsume().getMaxMessagesPerPoll()));
                } else {
                    _maxMessagesPerPollText.setText(""); //$NON-NLS-1$
                }
                if (this._binding.getConsume().getDelay() != null) {
                    setTextValue(_delayText, 
                            PropTypeUtil.getPropValueString(this._binding.getConsume().getDelay()));
                } else {
                    _delayText.setText(""); //$NON-NLS-1$
                }
            }
            
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
    }

    @Override
    protected boolean validate() {
        setErrorMessage(null);
//        if (getBinding() != null) {
//            if (_directoryText.getText().trim().isEmpty()) {
//                setErrorMessage(Messages.error_emptyDirectory);
//                return false;
//            }
//        }
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
        _maxMessagesPerPollText = createLabelAndText(pollGroup, Messages.label_maxMessagesPerPollDefault0);

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
        } else if (control.equals(_moveFailedText)) {
            updateConsumeFeature("moveFailed", _moveFailedText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_moveText)) {
            updateConsumeFeature("move", _moveText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_preMoveText)) {
            updateConsumeFeature("preMove", _preMoveText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_maxMessagesPerPollText)) {
            try {
                updateConsumeFeature("maxMessagesPerPoll", new BigInteger(_maxMessagesPerPollText.getText().trim())); //$NON-NLS-1$
            } catch (NumberFormatException nfe) {
                updateConsumeFeature("maxMessagesPerPoll", _maxMessagesPerPollText.getText().trim()); //$NON-NLS-1$
            }
        }

    }

    protected void handleModify(Control control) {
        handleConsumer(control);
        super.handleModify(control);
        setHasChanged(false);
        setDidSomething(true);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (this._binding.getConsume() != null) {
                if (control.equals(_delayText)) {
                    setTextValue(_delayText, PropTypeUtil.getPropValueString(this._binding.getConsume().getDelay()));
                } else if (control.equals(_moveFailedText)) {
                    _moveFailedText.setText(this._binding.getConsume().getMoveFailed());
                } else if (control.equals(_moveText)) {
                    _moveText.setText(this._binding.getConsume().getMove());
                } else if (control.equals(_preMoveText)) {
                    _preMoveText.setText(this._binding.getConsume().getPreMove());
                } else if (control.equals(_maxMessagesPerPollText)) {
                    setTextValue(_maxMessagesPerPollText, PropTypeUtil.getPropValueString(this._binding.getConsume().getMaxMessagesPerPoll()));
                }
            } else {
                super.handleUndo(control);
            }
        }
        setHasChanged(false);
    }

}
