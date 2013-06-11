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
package org.switchyard.tools.ui.editor.components.soap;

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
public class InterceptorPropertyInputDialog extends TitleAreaDialog {

    private Text _propertyNameText;
    private Text _propertyValueText;

    private String _propertyName = null;
    private String _propertyValue = null;

    /**
     * ESBInterfaceInputDialog constructor.
     * 
     * @param parent the parent
     */
    public InterceptorPropertyInputDialog(Shell parent) {
        super(parent);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        setTitle("New Property Details");
        setMessage("Specify a name and value for the new property.");
        getShell().setText("Interceptor Property");

        Composite area = new Composite(parent, SWT.NULL);
        GridLayout gridLayout = new GridLayout(2, false);
        area.setLayout(gridLayout);
        area.setLayoutData(new GridData(GridData.FILL_BOTH));
        _propertyNameText = createLabelAndText(area, "Name*");
        if (_propertyName != null && !_propertyName.trim().isEmpty()) {
            _propertyNameText.setText(_propertyName);
        }
        _propertyNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                _propertyName = _propertyNameText.getText().trim();
            }
        });
        _propertyValueText = createLabelAndText(area, "Value*");
        if (_propertyValue != null && !_propertyValue.trim().isEmpty()) {
            _propertyValueText.setText(_propertyValue);
        }
        _propertyValueText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                _propertyValue = _propertyValueText.getText().trim();
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
        if (_propertyNameText.getText().trim().isEmpty()) {
            setErrorMessage("Please specify a name for the new property.");
        } else if (_propertyValueText.getText().trim().isEmpty()) {
            setErrorMessage("Please specify a value for the new property.");
        }
        return (getErrorMessage() == null);
    }

    /**
     * @return input type
     */
    public String getPropertyName() {
        return _propertyName;
    }

    /**
     * @return output type
     */
    public String getPropertyValue() {
        return _propertyValue;
    }

    /**
     * @param name prop name
     */
    public void setPropertyName(String name) {
        _propertyName = name;
    }

    /**
     * @param value prop value
     */
    public void setPropertyValue(String value) {
        _propertyValue = value;
    }
}
