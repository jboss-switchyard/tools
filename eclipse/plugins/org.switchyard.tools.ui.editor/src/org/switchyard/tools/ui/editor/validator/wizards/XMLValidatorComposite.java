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
package org.switchyard.tools.ui.editor.validator.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidateType;
import org.switchyard.tools.models.switchyard1_0.validate.XmlSchemaType;
import org.switchyard.tools.models.switchyard1_0.validate.XmlValidateType;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.common.ClasspathResourceSelectionDialog;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class XMLValidatorComposite extends BaseValidatorComposite {

    private Button _failOnWarningText;
    private Text _xsdFileText;
    private Button _browseButton;
    private Combo _schemaTypeCombo;

    @Override
    public void createContents(Composite parent, int style) {
        super.createContents(parent, style);

        Composite outer = new Composite(getPanel(), SWT.NONE);
        GridData outerGD = new GridData(SWT.FILL, SWT.NULL, true, false, 2, 1);
        outerGD.horizontalIndent = -5;
        outerGD.verticalIndent = -5;
        outer.setLayoutData(outerGD);
        outer.setLayout(new GridLayout(2, false));

        _schemaTypeCombo = createLabelAndCombo(outer, "Schema Type", true);
        _schemaTypeCombo.add("DTD", 0);
        _schemaTypeCombo.setData("DTD", XmlSchemaType.DTD);
        _schemaTypeCombo.add("XMLSCHEMA", 1);
        _schemaTypeCombo.setData("XMLSCHEMA", XmlSchemaType.XMLSCHEMA);
        _schemaTypeCombo.add("RELAX_NG",2);
        _schemaTypeCombo.setData("RELAX_NG", XmlSchemaType.RELAXNG);
        _schemaTypeCombo.select(XmlSchemaType.DTD_VALUE);

        Composite inner = new Composite(getPanel(), SWT.NONE);
        GridData innerGD = new GridData(SWT.FILL, SWT.NULL, true, false, 2, 1);
        innerGD.horizontalIndent = -5;
        innerGD.verticalIndent = -5;
        inner.setLayoutData(innerGD);
        inner.setLayout(new GridLayout(3, false));
        _xsdFileText = createLabelAndText(inner, "Schema File");
        _xsdFileText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                if (!inUpdate()) {
                    handleModify(_xsdFileText);
                    fireChangedEvent(_xsdFileText);
                }
            }
        });
        _browseButton = new Button(inner, SWT.PUSH);
        _browseButton.setText("Browse...");
        _browseButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                handleBrowse();
                validate();
                fireChangedEvent((Control) e.getSource());
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
            if (_xsdFileText != null && !_xsdFileText.isDisposed()) {
                String text = _xsdFileText.getText().trim();
                if (text.length() == 0) {
                    setErrorMessage("File name field may not be empty.");
                }
            }
        }
        return (getErrorMessage() == null);
    }

    protected void handleModify(final Control control) {
        if (control.equals(_failOnWarningText)) {
            String value = Boolean.toString(_failOnWarningText.getSelection());                        
            updateFeature((XmlValidateType) getValidator(), "failOnWarning", value);
        } else if (control.equals(_xsdFileText)) {
            updateFeature((XmlValidateType) getValidator(), "schemaFile", _xsdFileText.getText().trim());
        } else if (control.equals(_schemaTypeCombo)) {
            XmlSchemaType selectedType = (XmlSchemaType) _schemaTypeCombo.getData(_schemaTypeCombo.getText());
            updateFeature((XmlValidateType) getValidator(), "schemaType", selectedType);
        } else {
            super.handleModify(control);
        }
        validate();
    }

    protected void handleUndo(Control control) {
        super.handleUndo(control);
        setInUpdate(true);
        if (getValidator() != null) {
            XmlValidateType xmlValidator = (XmlValidateType) getValidator();
            if (control.equals(_xsdFileText)) {
                _xsdFileText.setText(xmlValidator.getSchemaFile());
            } else if (control.equals(_failOnWarningText)) { 
                boolean value = Boolean.parseBoolean(xmlValidator.getFailOnWarning());                        
                _failOnWarningText.setSelection(value);
            } else if (control.equals(_schemaTypeCombo)) {
                _schemaTypeCombo.select(xmlValidator.getSchemaType().getValue());
            }
        }
        setInUpdate(false);
    }    

    /**
     * @param validator incoming validator type
     */
    public void setValidator(ValidateType validator) {
        setInUpdate(true);
        super.setValidator(validator);
        XmlValidateType xmlValidator = (XmlValidateType) getValidator();
        if (_failOnWarningText != null && !_failOnWarningText.isDisposed() && xmlValidator.getFailOnWarning() != null) {
            boolean value = Boolean.parseBoolean(xmlValidator.getFailOnWarning());                        
            _failOnWarningText.setSelection(value);
        }
        if (_xsdFileText != null && !_xsdFileText.isDisposed() && xmlValidator.getSchemaFile() != null) {
            _xsdFileText.setText(xmlValidator.getSchemaFile());
        }
        if (_schemaTypeCombo != null && !_schemaTypeCombo.isDisposed() && xmlValidator.getSchemaType() != null) {
            _schemaTypeCombo.select(xmlValidator.getSchemaType().getValue());
        }
        setInUpdate(false);
        addObservableListeners();
    }

    private void handleBrowse() {

        IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
        IJavaProject javaProject = null;
        if (modelFile != null) {
            if (modelFile.getProject() != null) { //$NON-NLS-1$
                javaProject = JavaCore.create(modelFile.getProject());
            }
        }
        ClasspathResourceSelectionDialog dialog = null;
        if (javaProject == null) {
            dialog = new ClasspathResourceSelectionDialog(Display.getCurrent().getActiveShell(), ResourcesPlugin.getWorkspace().getRoot());
        } else {
            dialog = new ClasspathResourceSelectionDialog(Display.getCurrent().getActiveShell(), javaProject.getProject());
        }
        String title = "Select XSD, DTD, or RNG file from Project";
        String extension = "*.xsd;*.dtd;*.rng;*.rnc";
        if (_schemaTypeCombo.getText().trim() != null) {
            String value = _schemaTypeCombo.getText().trim();
            if (value.contentEquals("DTD")) {
                title = "Select DTD file from Project";
                extension = "*.dtd";
            } else if (value.contentEquals("XMLSCHEMA")) {
                title = "Select XSD file from Project";
                extension = "*.xsd";
            } else if (value.contentEquals("RELAX_NG")) {
                title = "Select RELAX_NG file from Project";
                extension = "*.rng";
            }
        }
        dialog.setTitle(title);
        dialog.setInitialPattern(extension);
        dialog.open();
        Object[] result = dialog.getResult();
        if (result == null || result.length == 0 || !(result[0] instanceof IResource)) {
            return;
        }
        String filepath = JavaUtil.getJavaPathForResource((IResource) result[0]).toString();
        _xsdFileText.setText(filepath);
        handleModify(_xsdFileText);
    }
}
