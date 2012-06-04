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
package org.switchyard.tools.ui.editor.transform.wizards;

import javax.xml.namespace.QName;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class BaseTransformComposite extends AbstractSwitchyardComposite {

    private Composite _panel;
    private TransformType _transform;
    private Text _toText;
    private Text _fromText;
    private boolean _inUpdate = false;

    @Override
    protected void validate() {
        setErrorMessage(null);
        if (_toText != null && !_toText.isDisposed()) {
            String text = _toText.getText().trim();
            if (text.length() == 0) {
                setErrorMessage("To field may not be empty.");
            } else {
                try {
                    QName.valueOf(text);
                } catch (IllegalArgumentException e) {
                    setErrorMessage("To field must be a valid QName.");
                }
            }
        }
        if (_fromText != null && !_fromText.isDisposed()) {
            String text = _fromText.getText().trim();
            if (text.length() == 0) {
                setErrorMessage("From field may not be empty.");
            } else {
                try {
                    QName.valueOf(text);
                } catch (IllegalArgumentException e) {
                    setErrorMessage("From field must be a valid QName.");
                }
            }
        }
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        _panel.setLayout(gl);
        if (getRootGridData() != null) {
            _panel.setLayoutData(getRootGridData());
        }
        _toText = createLabelAndText(_panel, "To");
        _toText.addModifyListener(new ModifyListener(){
            @Override
            public void modifyText(ModifyEvent e) {
                if (!_inUpdate) {
                    handleModify(_toText);
                    fireChangedEvent(_toText);
                }
            }
        });
        _fromText = createLabelAndText(_panel, "From");
        _fromText.addModifyListener(new ModifyListener(){
            @Override
            public void modifyText(ModifyEvent e) {
                if (!_inUpdate) {
                    handleModify(_fromText);
                    fireChangedEvent(_fromText);
                }
            }
        });
    }

    @Override
    public Composite getPanel() {
        return _panel;
    }

    /**
     * @param transform incoming transform type
     */
    public void setTransform(TransformType transform) {
        _inUpdate = true;
        this._transform = transform;
        if (_toText != null && !_toText.isDisposed() && transform.getTo() != null) {
            _toText.setText(transform.getTo());
        }
        if (_fromText != null && !_fromText.isDisposed() && transform.getFrom() != null) {
            _fromText.setText(transform.getFrom());
        }
        _inUpdate = false;
    }

    /**
     * @return outgoing transform type
     */
    public TransformType getTransform() {
        return this._transform;
    }

    @SuppressWarnings("restriction")
    protected void handleModify(final Control control) {
        TransactionalEditingDomain domain = null;
        if (_transform.eContainer() != null) {
            domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
        }
        if (control.equals(_toText)) {
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        _transform.setTo(_toText.getText().trim());
                    }
                });
            } else {
                _transform.setTo(_toText.getText().trim());
            }
        } else if (control.equals(_fromText)) {
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        _transform.setFrom(_fromText.getText().trim());
                    }
                });
            } else {
                _transform.setFrom(_fromText.getText().trim());
            }
        }
        validate();
    }

    protected boolean inUpdate() {
        return _inUpdate;
    }

    protected void setInUpdate(boolean inUpdate) {
        this._inUpdate = inUpdate;
    }
}
