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
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.SmooksTransformType1;
import org.switchyard.tools.models.switchyard1_0.transform.TransformPackage;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class SmooksTransformComposite extends BaseTransformComposite {

    private Combo _smooksTypeCombo;
    private Text _reportPathText;
    private Text _configText;

    @Override
    public void createContents(Composite parent, int style) {
        super.createContents(parent, style);

        _configText = createLabelAndText(getPanel(), "Config");
        _configText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                if (!inUpdate()) {
                    handleModify(_configText);
                    fireChangedEvent(_configText);
                }
            }
        });

        _reportPathText = createLabelAndText(getPanel(), "Report Path");
        _reportPathText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                if (!inUpdate()) {
                    handleModify(_reportPathText);
                    fireChangedEvent(_reportPathText);
                }
            }
        });

        new Label(getPanel(), SWT.NONE).setText("Smooks Transform Type");
        _smooksTypeCombo = new Combo(getPanel(), SWT.DROP_DOWN | SWT.READ_ONLY);
        _smooksTypeCombo.add("SMOOKS", 0);
        _smooksTypeCombo.setData("SMOOKS", SmooksTransformType.SMOOKS);
        _smooksTypeCombo.add("XML2JAVA", 1);
        _smooksTypeCombo.setData("XML2JAVA", SmooksTransformType.XML2JAVA);
        _smooksTypeCombo.add("JAVA2XML", 2);
        _smooksTypeCombo.setData("JAVA2XML", SmooksTransformType.JAVA2XML);
        _smooksTypeCombo.select(0);
        _smooksTypeCombo.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                if (!inUpdate()) {
                    handleModify(_smooksTypeCombo);
                    fireChangedEvent(_smooksTypeCombo);
                }
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                widgetSelected(e);
            }
        });
    }

    protected void validate() {
        super.validate();
        if (getErrorMessage() == null) {
            if (_configText != null && !_configText.isDisposed()) {
                String text = _configText.getText().trim();
                if (text.length() == 0) {
                    setErrorMessage("Config file name field may not be empty.");
                }
            }
        }
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
                        ((SmooksTransformType1) getTransform()).setConfig(_reportPathText.getText().trim());
                    }
                });
            } else {
                ((SmooksTransformType1) getTransform()).setConfig(_reportPathText.getText().trim());
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
}
