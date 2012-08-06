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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.transform.XsltTransformType;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.common.ClasspathResourceSelectionDialog;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class XSLTTransformComposite extends BaseTransformComposite {

    private Button _failOnWarningText;
    private Text _xsltFileText;
    private Button _browseButton;

    @Override
    public void createContents(Composite parent, int style) {
        super.createContents(parent, style);

        Composite inner = new Composite(getPanel(), SWT.NONE);
        GridData innerGD = new GridData(SWT.FILL, SWT.NULL, true, false, 2, 1);
        innerGD.horizontalIndent = -5;
        innerGD.verticalIndent = -5;
        inner.setLayoutData(innerGD);
        inner.setLayout(new GridLayout(3, false));
        _xsltFileText = createLabelAndText(inner, "XSLT File");
        _xsltFileText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                if (!inUpdate()) {
                    handleModify(_xsltFileText);
                    fireChangedEvent(_xsltFileText);
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
            if (_xsltFileText != null && !_xsltFileText.isDisposed()) {
                String text = _xsltFileText.getText().trim();
                if (text.length() == 0) {
                    setErrorMessage("XSLT file name field may not be empty.");
                }
            }
        }
        return (getErrorMessage() == null);
    }

    protected void handleModify(final Control control) {
        if (control.equals(_failOnWarningText)) {
            String value = Boolean.toString(_failOnWarningText.getSelection());                        
            updateFeature((XsltTransformType) getTransform(), "failOnWarning", value);
        } else if (control.equals(_xsltFileText)) {
            updateFeature((XsltTransformType) getTransform(), "xsltFile", _xsltFileText.getText().trim());
        } else {
            super.handleModify(control);
        }
        validate();
    }

    protected void handleUndo(Control control) {
        super.handleUndo(control);
        setInUpdate(true);
        if (getTransform() != null) {
            XsltTransformType xsltTransform = (XsltTransformType) getTransform();
            if (control.equals(_xsltFileText)) {
                _xsltFileText.setText(xsltTransform.getXsltFile());
            } else if (control.equals(_failOnWarningText)) { 
                boolean value = Boolean.parseBoolean(xsltTransform.getFailOnWarning());                        
                _failOnWarningText.setSelection(value);
            }
        }
        setInUpdate(false);
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
        dialog.setTitle("Select XSLT file from Project");
        dialog.setInitialPattern("*.xslt");
        dialog.open();
        Object[] result = dialog.getResult();
        if (result == null || result.length == 0 || !(result[0] instanceof IResource)) {
            return;
        }
        String filepath = JavaUtil.getJavaPathForResource((IResource) result[0]).toString();
        _xsltFileText.setText(filepath);
        handleModify(_xsltFileText);
    }
}
