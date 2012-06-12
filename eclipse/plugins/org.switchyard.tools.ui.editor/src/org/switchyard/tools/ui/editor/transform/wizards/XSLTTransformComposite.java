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

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.transform.XsltTransformType;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class XSLTTransformComposite extends BaseTransformComposite {

    private Button _failOnWarningText;
    private Text _xsltFileText;

    @Override
    public void createContents(Composite parent, int style) {
        super.createContents(parent, style);
        _xsltFileText = createLabelAndText(getPanel(), "XSLT File");
        _xsltFileText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                if (!inUpdate()) {
                    handleModify(_xsltFileText);
                    fireChangedEvent(_xsltFileText);
                }
            }
        });
        _failOnWarningText = createCheckbox(getPanel(), "Fail on Warning");
        _failOnWarningText.addSelectionListener(new SelectionListener() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (!inUpdate()) {
                    handleModify(_failOnWarningText);
                    fireChangedEvent(_failOnWarningText);
                }
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                widgetSelected(e);
            }
        });
    }

    protected boolean validate() {
        super.validate();
        if (getErrorMessage() == null) {
            if (_xsltFileText != null && !_xsltFileText.isDisposed()) {
                String text = _xsltFileText.getText().trim();
                if (text.length() == 0) {
                    setErrorMessage("XSLT file name field may not be empty.");
                }
            }
        }
        return (getErrorMessage() == null);
    }

    @SuppressWarnings("restriction")
    protected void handleModify(final Control control) {
        TransactionalEditingDomain domain = null;
        if (getTransform().eContainer() != null) {
            domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
        }
        if (control.equals(_failOnWarningText)) {
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        String value = Boolean.toString(_failOnWarningText.getSelection());                        
                        ((XsltTransformType) getTransform()).setFailOnWarning(value);
                    }
                });
            } else {
                String value = Boolean.toString(_failOnWarningText.getSelection());                        
                ((XsltTransformType) getTransform()).setFailOnWarning(value);
            }
        } else if (control.equals(_xsltFileText)) {
                if (domain != null) {
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            ((XsltTransformType) getTransform()).setXsltFile(_xsltFileText.getText().trim());
                        }
                    });
                } else {
                    ((XsltTransformType) getTransform()).setXsltFile(_xsltFileText.getText().trim());
                }
        } else {
            super.handleModify(control);
        }
        validate();
    }

    /**
     * @param transform incoming transform type
     */
    public void setTransform(TransformType transform) {
        super.setTransform(transform);
        setInUpdate(true);
        XsltTransformType xsltTransform = (XsltTransformType) getTransform();
        if (_failOnWarningText != null && !_failOnWarningText.isDisposed() && xsltTransform.getFailOnWarning() != null) {
            boolean value = Boolean.parseBoolean(xsltTransform.getFailOnWarning());                        
            _failOnWarningText.setSelection(value);
        }
        if (_xsltFileText != null && !_xsltFileText.isDisposed() && xsltTransform.getXsltFile() != null) {
            _xsltFileText.setText(xsltTransform.getXsltFile());
        }
        setInUpdate(false);
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (getTransform() != null && !inUpdate()) {
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
            if (getTransform() != null) {
                Control control = (Control) e.getSource();
                XsltTransformType xsltTransform = (XsltTransformType) getTransform();
                if (control.equals(_xsltFileText)) {
                    _xsltFileText.setText(xsltTransform.getXsltFile());
                } else if (control.equals(_failOnWarningText)) { 
                    boolean value = Boolean.parseBoolean(xsltTransform.getFailOnWarning());                        
                    _failOnWarningText.setSelection(value);
                }
            }
            setInUpdate(false);
        } else if (e.keyCode == SWT.CR) {
            // accept change
            if (getTransform() != null && !inUpdate()) {
                validate();
                handleModify((Control) e.getSource());
                fireChangedEvent((Control) e.getSource());
            }
        }
    }
}
