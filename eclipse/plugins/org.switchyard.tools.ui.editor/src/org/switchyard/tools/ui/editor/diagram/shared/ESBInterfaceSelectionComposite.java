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

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class ESBInterfaceSelectionComposite extends AbstractSwitchyardComposite implements IInterfaceComposite {

    private Composite _panel;
    private Interface _interface = null;
    private Text _inputTypeText;
    private Text _outputTypeText;
    private Text _faultTypeText;

    private String _inputType = null;
    private String _outputType = null;
    private String _faultType = null;

    /**
     * Constructor.
     */
    public ESBInterfaceSelectionComposite() {
        // empty
    }

    /**
     * @param parent composite parent
     * @param style any style bits
     */
    public void createContents(Composite parent, int style) {

        _panel = new Composite(parent, SWT.NONE);
        GridLayout gl = new GridLayout();
        gl.numColumns = 2;
        _panel.setLayout(gl);
        if (getRootGridData() != null) {
            _panel.setLayoutData(getRootGridData());
        }
        _inputTypeText = createLabelAndText(_panel, "Input Type*");
        _outputTypeText = createLabelAndText(_panel, "Output Type");
        _faultTypeText = createLabelAndText(_panel, "Fault Type");
    }

    /**
     * @return interface
     */
    public Interface getInterface() {
        return _interface;
    }

    /**
     * @param cInterface interface coming in
     */
    public void setInterface(Interface cInterface) {
        this._interface = cInterface;
        if (this._interface != null && this._interface instanceof EsbInterface) {
            setInUpdate(true);
            EsbInterface esbIntfc = (EsbInterface) this._interface;
            if (esbIntfc.getInputType() != null) {
                _inputType = esbIntfc.getInputType();
                _inputTypeText.setText(esbIntfc.getInputType());
            }
            if (esbIntfc.getOutputType() != null) {
                _outputType = esbIntfc.getOutputType();
                _outputTypeText.setText(esbIntfc.getOutputType());
            }
            if (esbIntfc.getFaultType() != null) {
                _faultType = esbIntfc.getFaultType();
                _faultTypeText.setText(esbIntfc.getFaultType());
            }
            setInUpdate(false);
        }
    }

    /**
     * @return panel
     */
    public Composite getPanel() {
        return _panel;
    }

    @Override
    protected boolean validate() {
        if (_inputTypeText != null && !_inputTypeText.isDisposed() && _inputTypeText.getText().trim().isEmpty()) {
            setErrorMessage("Please specify an input type for the ESB interface.");
        } else if (_faultTypeText != null && !_faultTypeText.isDisposed() && !_faultTypeText.getText().trim().isEmpty()
                && _outputTypeText != null && !_outputTypeText.isDisposed() && _outputTypeText.getText().trim().isEmpty()) {
            setErrorMessage("Specifying a fault type also requires the output type for the ESB interface.");
        }
        return (getErrorMessage() == null);
    }

    @SuppressWarnings("restriction")
    @Override
    protected void handleModify(Control control) {
        validate();
        if (control.equals(_inputTypeText)) {
            if (_inputTypeText != null && !_inputTypeText.isDisposed() && _inputTypeText.isEnabled()) {
                if (_interface.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            ((EsbInterface) _interface).setInputType(_inputType);
                        }
                    });
                } else {
                    ((EsbInterface) _interface).setInputType(_inputType);
                }
            }
        } else if (control.equals(_outputTypeText)) {
            if (_outputTypeText != null && !_outputTypeText.isDisposed() && _outputTypeText.isEnabled()) {
                if (_interface.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            ((EsbInterface) _interface).setOutputType(_outputType);
                        }
                    });
                } else {
                    ((EsbInterface) _interface).setOutputType(_outputType);
                }
            }
        } else if (control.equals(_faultTypeText)) {
            if (_faultTypeText != null && !_faultTypeText.isDisposed() && _faultTypeText.isEnabled()) {
                if (_interface.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            ((EsbInterface) _interface).setFaultType(_faultType);
                        }
                    });
                } else {
                    ((EsbInterface) _interface).setFaultType(_faultType);
                }
            }
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (_interface != null && !inUpdate() && hasChanged()) {
            validate();
            handleModify((Control) e.getSource());
            fireChangedEvent((Control) e.getSource());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.keyCode == SWT.ESC) {
            // cancel out and return to original value
            setInUpdate(true);
            if (_interface != null) {
                EsbInterface esbIntfc = (EsbInterface) _interface;
                Control control = (Control) e.getSource();
                if (control.equals(_inputTypeText)) {
                    _inputTypeText.setText(esbIntfc.getInputType());
                    _inputType = esbIntfc.getInputType();
                } else if (control.equals(_outputTypeText)) {
                    _outputTypeText.setText(esbIntfc.getOutputType());
                    _outputType = esbIntfc.getOutputType();
                } else if (control.equals(_faultTypeText)) {
                    _faultTypeText.setText(esbIntfc.getFaultType());
                    _faultType = esbIntfc.getFaultType();
                }
                handleModify(control);
            }
            setInUpdate(false);
        } else if (e.keyCode == SWT.CR) {
            // accept change
            if (_interface != null && !inUpdate() && hasChanged()) {
                validate();
                handleModify((Control) e.getSource());
                fireChangedEvent((Control) e.getSource());
            }
        } else if (e.keyCode == SWT.TAB) {
            if (_interface != null && !inUpdate() && hasChanged()) {
                boolean flag = validate();
                if (flag) {
                    handleModify((Control) e.getSource());
                }
                fireChangedEvent((Control) e.getSource());
            }
        }
    }

    @Override
    public void modifyText(ModifyEvent e) {
        super.modifyText(e);
        _inputType = _inputTypeText.getText().trim();
        _outputType = _outputTypeText.getText().trim();
        _faultType = _faultTypeText.getText().trim();
    }
}
