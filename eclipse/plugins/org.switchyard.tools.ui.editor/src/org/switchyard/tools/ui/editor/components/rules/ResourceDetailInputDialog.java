/*************************************************************************************
 * Copyright (c) 2013 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.editor.components.rules;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.switchyard.tools.models.switchyard1_0.rules.ResourceType;

/**
 * @author bfitzpat
 * 
 */
public class ResourceDetailInputDialog extends TitleAreaDialog {

    private Combo _inputTypeCombo;
    private Text _worksheetNameText;
    private Button _usingExternalTypesButton;

    private String _inputType = null;
    private String _worksheetName = null;
    private boolean _usingExternalTypes = false;

    private ResourceType _resourceType = null;
    
    /**
     * ResourceDetailInputDialog constructor.
     * 
     * @param parent the parent
     */
    public ResourceDetailInputDialog(Shell parent) {
        super(parent);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        setTitle("Advanced Resource Details");
        setMessage("Specify the input type and other available properties for the selected resource.");
        getShell().setText("Resource Details");

        Composite area = new Composite(parent, SWT.NULL);
        GridLayout gridLayout = new GridLayout(2, false);
        area.setLayout(gridLayout);
        area.setLayoutData(new GridData(GridData.FILL_BOTH));
        _inputTypeCombo = createLabelAndCombo(area, "Input Type", true);
        _worksheetNameText = createLabelAndText(area, "Worksheet Name");
        _usingExternalTypesButton = new Button(area, SWT.CHECK);
        _usingExternalTypesButton.setText("Uses External Types");
        _usingExternalTypesButton.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false, 1, 2));
        
        updateOptionsBasedOnInput();
        if (_inputType != null && !_inputType.trim().isEmpty()) {
            _inputTypeCombo.setText(_inputType);
        }
        _inputTypeCombo.addSelectionListener(new SelectionListener(){
            @Override
            public void widgetDefaultSelected(SelectionEvent arg0) {
                _inputType = _inputTypeCombo.getText().trim();
                getButton(IDialogConstants.OK_ID).setEnabled(validate());
            }

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                widgetDefaultSelected(arg0);
            }
        });
        _inputType = _inputTypeCombo.getText().trim();
        
        if (_worksheetName != null && !_worksheetName.trim().isEmpty()) {
            _worksheetNameText.setText(_worksheetName);
            if (_worksheetName.isEmpty()) {
                _worksheetName = null;
            }
        }
        _worksheetNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                _worksheetName = _worksheetNameText.getText().trim();
                getButton(IDialogConstants.OK_ID).setEnabled(validate());
            }
        });
        _worksheetName = _worksheetNameText.getText().trim();
        
        _usingExternalTypesButton.setSelection(_usingExternalTypes);
        _usingExternalTypesButton.addSelectionListener(new SelectionListener(){

            @Override
            public void widgetDefaultSelected(SelectionEvent arg0) {
                _usingExternalTypes = _usingExternalTypesButton.getSelection();
                getButton(IDialogConstants.OK_ID).setEnabled(validate());
            }

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                widgetDefaultSelected(arg0);
            }
        });
        _usingExternalTypes = _usingExternalTypesButton.getSelection();

        return area;
    }
    
    private void updateOptionsBasedOnInput() {
        if (_resourceType != null) {
            if (_resourceType.getType().equalsIgnoreCase("DTABLE")) {
                _inputTypeCombo.removeAll();
                _inputTypeCombo.add("");
                _inputTypeCombo.add("XLS");
                _inputTypeCombo.add("CSV");
                _usingExternalTypesButton.setVisible(false);
//            } else if (_resourceType.getType().equalsIgnoreCase("SCARD")) {
//                _inputTypeCombo.removeAll();
//                _inputTypeCombo.add("");
//                _inputTypeCombo.add("EXCEL");
//                _inputTypeCombo.add("PMML");
//                _usingExternalTypesButton.setVisible(true);
            }
        }
    }
    
    protected Control createButtonBar(Composite parent) {
        Control rtnControl = super.createButtonBar(parent);
        getButton(IDialogConstants.OK_ID).setEnabled(validate());
        setErrorMessage(null);
        return rtnControl;
    }

    protected Combo createLabelAndCombo(Composite parent, String label, boolean readOnly) {
        if (label != null && !label.trim().isEmpty()) {
            Label labelControl = new Label(parent, SWT.NONE);
            labelControl.setText(label);
            TabbedPropertySheetWidgetFactory factory = new TabbedPropertySheetWidgetFactory();
            factory.adapt(labelControl, false, false);
        }
        int styles = SWT.BORDER | SWT.DROP_DOWN;
        if (readOnly) {
            styles = SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY;
        }
        Combo newCombo = new Combo(parent, styles);
        newCombo.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
    
        return newCombo;
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
        return newText;
    }

    protected boolean validate() {
        setErrorMessage(null);
        // no validation - everything is optional at this point
        return (getErrorMessage() == null);
    }

    /**
     * @return input type
     */
    public String getInputType() {
        return _inputType;
    }

    /**
     * @return worksheet name
     */
    public String getWorksheetName() {
        return _worksheetName;
    }

    /**
     * @param value input type
     */
    public void setInputType(String value) {
        _inputType = value;
    }

    /**
     * @param value worksheet name
     */
    public void setWorksheetName(String value) {
        _worksheetName = value;
    }
    
    /**
     * @param value ResourceType object coming in
     */
    public void setResourceType(ResourceType value) {
        _resourceType = value;
    }
    
    /**
     * @param value Using External Types flag
     */
    public void setUsingExternalTypes(boolean value) {
        _usingExternalTypes = value;
    }
    
    /**
     * @return boolean for uses external types
     */
    public boolean getUsingExternalTypes() {
        return _usingExternalTypes;
    }
}

