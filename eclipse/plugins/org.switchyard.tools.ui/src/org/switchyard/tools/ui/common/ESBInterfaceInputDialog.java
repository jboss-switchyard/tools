/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.common;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * @author bfitzpat
 * 
 */
public class ESBInterfaceInputDialog extends TitleAreaDialog {

    private Text _inputTypeText;
    private Text _outputTypeText;
    private Text _faultTypeText;

    private String _inputType = null;
    private String _outputType = null;
    private String _faultType = null;

    /**
     * ESBInterfaceInputDialog constructor.
     * 
     * @param parent the parent
     */
    public ESBInterfaceInputDialog(Shell parent) {
        super(parent);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        setTitle("ESB Interface Details");
        setMessage("Specify input, output, and fault details for the ESB interface.");
        getShell().setText("Interface Details");

        Composite area = new Composite(parent, SWT.NULL);
        GridLayout gridLayout = new GridLayout(2, false);
        area.setLayout(gridLayout);
        area.setLayoutData(new GridData(GridData.FILL_BOTH));
        _inputTypeText = createLabelAndText(area, "Input Type*");
        if (_inputType != null && !_inputType.trim().isEmpty()) {
            _inputTypeText.setText(_inputType);
        }
        _inputTypeText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                _inputType = _inputTypeText.getText().trim();
            }
        });
        _outputTypeText = createLabelAndText(area, "Output Type");
        if (_outputType != null && !_outputType.trim().isEmpty()) {
            _outputTypeText.setText(_outputType);
        }
        _outputTypeText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                _outputType = _outputTypeText.getText().trim();
            }
        });
        _faultTypeText = createLabelAndText(area, "Fault Type");
        if (_faultType != null && !_faultType.trim().isEmpty()) {
            _faultTypeText.setText(_faultType);
        }
        _faultTypeText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                _faultType = _faultTypeText.getText().trim();
            }
        });

        return area;
    }
    
    protected Control createButtonBar(Composite parent) {
        Control rtnControl = super.createButtonBar(parent);
        getButton(IDialogConstants.OK_ID).setEnabled(validate());
        setErrorMessage(null);
        return rtnControl;
    }

    /**
     * @param parent parent composite
     * @param label string to put in label
     * @return reference to created Text control
     */
    protected Text createLabelAndText(Composite parent, String label) {
        new Label(parent, SWT.NONE).setText(label);
        Text newText = new Text(parent, SWT.BORDER);
        newText.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
        newText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // ignore
            }

            @Override
            public void focusLost(FocusEvent e) {
                getButton(IDialogConstants.OK_ID).setEnabled(validate());
            }
        });
        newText.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                // ignore
            }

            @Override
            public void keyReleased(KeyEvent e) {
                getButton(IDialogConstants.OK_ID).setEnabled(validate());
            }
        });
        return newText;
    }

    protected boolean validate() {
        setErrorMessage(null);
        if (_inputTypeText.getText().trim().isEmpty()) {
            setErrorMessage("Please specify an input type for the ESB interface.");
        } else if (!_faultTypeText.getText().isEmpty() && _outputTypeText.getText().isEmpty()) {
            setErrorMessage("Specifying a fault type also requires the output type for the ESB interface.");
        }
        return (getErrorMessage() == null);
    }

    /**
     * @return input type
     */
    public String getInputType() {
        return _inputType;
    }

    /**
     * @return output type
     */
    public String getOutputType() {
        return _outputType;
    }

    /**
     * @return fault type
     */
    public String getFaultType() {
        return _faultType;
    }

    /**
     * @param input string
     */
    public void setInputType(String input) {
        _inputType = input;
    }

    /**
     * @param output string
     */
    public void setOutputType(String output) {
        _outputType = output;
    }

    /**
     * @param fault string
     */
    public void setFaultType(String fault) {
        _faultType = fault;
    }
}
