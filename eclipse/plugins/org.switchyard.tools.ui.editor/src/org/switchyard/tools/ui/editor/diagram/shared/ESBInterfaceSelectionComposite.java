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
import org.switchyard.tools.ui.editor.Messages;

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
        _inputTypeText = createLabelAndText(_panel, Messages.label_inputTypeStar);
        _outputTypeText = createLabelAndText(_panel, Messages.label_outputTypeStar);
        _faultTypeText = createLabelAndText(_panel, Messages.label_faultType);
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
                _inputTypeText.setText(_inputType);
            }
            if (esbIntfc.getOutputType() != null) {
                _outputType = esbIntfc.getOutputType();
                _outputTypeText.setText(_outputType);
            }
            if (esbIntfc.getFaultType() != null) {
                _faultType = esbIntfc.getFaultType();
                _faultTypeText.setText(_faultType);
            }
            setInUpdate(false);
            addObservableListeners();
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
            setErrorMessage(Messages.error_noInputTypeForEsbInterface);
        } else if (_faultTypeText != null && !_faultTypeText.isDisposed() && !_faultTypeText.getText().trim().isEmpty()
                && _outputTypeText != null && !_outputTypeText.isDisposed() && _outputTypeText.getText().trim().isEmpty()) {
            setErrorMessage(Messages.error_noOutputTypeForEsbInterfaceWithFault);
        }
        return (getErrorMessage() == null);
    }

    @Override
    protected void handleModify(Control control) {
        validate();
        if (_interface != null) {
            if (control.equals(_inputTypeText)) {
                _inputType = _inputTypeText.getText().trim();
                updateFeature(_interface, "inputType", _inputType); //$NON-NLS-1$
            } else if (control.equals(_outputTypeText)) {
                _outputType = _outputTypeText.getText().trim();
                updateFeature(_interface, "outputType", _outputType); //$NON-NLS-1$
            } else if (control.equals(_faultTypeText)) {
                _faultType = _faultTypeText.getText().trim();
                updateFeature(_interface, "faultType", _faultType); //$NON-NLS-1$
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
