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
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1;
import org.switchyard.tools.models.switchyard1_0.transform.TransformPackage;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.common.ClasspathResourceSelectionDialog;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class SmooksTransformComposite extends BaseTransformComposite {

    private Combo _smooksTypeCombo;
    private Text _reportPathText;
    private Text _configText;
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
        _configText = createLabelAndText(inner, "Config");

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
        Composite outer = new Composite(getPanel(), SWT.NONE);
        GridData outerGD = new GridData(SWT.FILL, SWT.NULL, true, false, 2, 1);
        outerGD.horizontalIndent = -5;
        outerGD.verticalIndent = -5;
        outer.setLayoutData(outerGD);
        outer.setLayout(new GridLayout(2, false));

        _reportPathText = createLabelAndText(outer, "Report Path");

        _smooksTypeCombo = createLabelAndCombo(outer, "Smooks Transform Type", true);
        _smooksTypeCombo.add("SMOOKS", 0);
        _smooksTypeCombo.setData("SMOOKS", SmooksTransformType.SMOOKS);
        _smooksTypeCombo.add("XML2JAVA", 1);
        _smooksTypeCombo.setData("XML2JAVA", SmooksTransformType.XML2JAVA);
        _smooksTypeCombo.add("JAVA2XML", 2);
        _smooksTypeCombo.setData("JAVA2XML", SmooksTransformType.JAVA2XML);
        _smooksTypeCombo.select(0);
//        _smooksTypeCombo.addSelectionListener(new SelectionListener() {
//
//            @Override
//            public void widgetSelected(SelectionEvent e) {
//                if (!inUpdate()) {
//                    handleModify(_smooksTypeCombo);
//                    fireChangedEvent(_smooksTypeCombo);
//                }
//            }
//
//            @Override
//            public void widgetDefaultSelected(SelectionEvent e) {
//                widgetSelected(e);
//            }
//        });
    }

    protected boolean validate() {
        super.validate();
        if (getErrorMessage() == null) {
            if (_configText != null && !_configText.isDisposed()) {
                String text = _configText.getText().trim();
                if (text.length() == 0) {
                    setErrorMessage("Config file name field may not be empty.");
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
        if (control.equals(_configText)) {
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        ((SmooksTransformType1) getTransform()).setConfig(_configText.getText().trim());
                    }
                });
            } else {
                ((SmooksTransformType1) getTransform()).setConfig(_configText.getText().trim());
            }
        } else if (control.equals(_reportPathText)) {
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        ((SmooksTransformType1) getTransform()).setReportPath(_reportPathText.getText().trim());
                    }
                });
            } else {
                ((SmooksTransformType1) getTransform()).setReportPath(_reportPathText.getText().trim());
            }
        } else if (control.equals(_smooksTypeCombo)) {
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        SmooksTransformType selectedType = (SmooksTransformType) _smooksTypeCombo
                                .getData(_smooksTypeCombo.getText());
                        SmooksTransformType1 smooksTransform = (SmooksTransformType1) getTransform();
                        smooksTransform.eSet(TransformPackage.eINSTANCE.getSmooksTransformType1_Type(), selectedType);
                    }
                });
            } else {
                SmooksTransformType selectedType = (SmooksTransformType) _smooksTypeCombo.getData(_smooksTypeCombo
                        .getText());
                SmooksTransformType1 smooksTransform = (SmooksTransformType1) getTransform();
                smooksTransform.eSet(TransformPackage.eINSTANCE.getSmooksTransformType1_Type(), selectedType);
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
        SmooksTransformType1 smooksTransform = (SmooksTransformType1) getTransform();
        if (_reportPathText != null && !_reportPathText.isDisposed() && smooksTransform.getReportPath() != null) {
            _reportPathText.setText(smooksTransform.getReportPath());
        }
        if (_configText != null && !_configText.isDisposed() && smooksTransform.getConfig() != null) {
            _configText.setText(smooksTransform.getConfig());
        }
        if (_smooksTypeCombo != null && !_smooksTypeCombo.isDisposed() && smooksTransform.getType() != null) {
            _smooksTypeCombo.select(smooksTransform.getType().ordinal());
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
                SmooksTransformType1 smooksTransform = (SmooksTransformType1) getTransform();
                if (control.equals(_configText)) {
                    _configText.setText(smooksTransform.getConfig());
                } else if (control.equals(_reportPathText)) {
                    _reportPathText.setText(smooksTransform.getReportPath());
                } else if (control.equals(_smooksTypeCombo)) { 
                    _smooksTypeCombo.select(smooksTransform.getType().ordinal());
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
        dialog.setTitle("Select Smooks XML File from Project");
        dialog.setInitialPattern("*smooks*.xml");
        dialog.open();
        Object[] result = dialog.getResult();
        if (result == null || result.length == 0 || !(result[0] instanceof IResource)) {
            return;
        }
        String filepath = JavaUtil.getJavaPathForResource((IResource) result[0]).toString();
        _configText.setText(filepath);
        handleModify(_configText);
    }
}
