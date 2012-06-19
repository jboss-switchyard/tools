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
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class CamelFileProducerComposite extends AbstractSwitchyardComposite implements IBindingComposite {

    private Composite _panel;
    private CamelFileBindingType _binding = null;
    private Text _directoryText;
    private Text _fileNameText;
    private Button _autoCreateButton;
    private Text _fileExistText;
    private Text _tempPrefixText;

    @Override
    public Binding getBinding() {
        return this._binding;
    }

    @Override
    public void setBinding(Binding impl) {
        if (impl instanceof CamelFileBindingType) {
            this._binding = (CamelFileBindingType) impl;
            setInUpdate(true);
            if (this._binding.getProduce() != null) {
                if (this._binding.getProduce().getFileExist() != null) {
                    _fileExistText.setText(this._binding.getProduce().getFileExist());
                }
                if (this._binding.getProduce().getTempPrefix() != null) {
                    _tempPrefixText.setText(this._binding.getProduce().getTempPrefix());
                }
            }
            if (this._binding.getDirectory() != null) {
                _directoryText.setText(this._binding.getDirectory());
            }
            if (this._binding.getFileName() != null) {
                _fileNameText.setText(this._binding.getFileName());
            }
            if (this._binding.isAutoCreate()) {
                _autoCreateButton.setSelection(this._binding.isAutoCreate());
            }
            setInUpdate(false);
            validate();
        } else {
            this._binding = null;
        }
    }

    @Override
    protected boolean validate() {
        setErrorMessage(null);
        if (getBinding() != null) {
            if (_directoryText.getText().trim().isEmpty()) {
                setErrorMessage("Directory may not be empty.");
            }
        }
        return (getErrorMessage() == null);
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());
        if (getRootGridData() != null) {
            _panel.setLayoutData(getRootGridData());
        }

        TabFolder tabFolder = new TabFolder(_panel, SWT.NONE);

        TabItem one = new TabItem(tabFolder, SWT.NONE);
        one.setText("Producer");
        one.setControl(getConsumerTabControl(tabFolder));
    }

    private Control getConsumerTabControl(TabFolder tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(1, false);
        composite.setLayout(gl);

        Group fileGroup = new Group(composite, SWT.NONE);
        fileGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        fileGroup.setLayout(new GridLayout(2, false));
        fileGroup.setText("File and Directory Options");

        _directoryText = createLabelAndText(fileGroup, "Directory*");
        _fileNameText = createLabelAndText(fileGroup, "File Name");
        _autoCreateButton = createCheckbox(fileGroup, "Auto Create Missing Directories in File Path");
        _fileExistText = createLabelAndText(fileGroup, "File Exist");
        _tempPrefixText = createLabelAndText(fileGroup, "Temp Prefix");

        return composite;
    }

    @Override
    public Composite getPanel() {
        return this._panel;
    }

    @SuppressWarnings("restriction")
    protected void handleModify(final Control control) {
        TransactionalEditingDomain domain = null;
        if (_binding.eContainer() != null) {
            domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
        }
        if (control.equals(_directoryText)) {
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        _binding.setDirectory(_directoryText.getText().trim());
                    }
                });
            } else {
                _binding.setDirectory(_directoryText.getText().trim());
            }
        } else if (control.equals(_fileNameText)) {
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        _binding.setFileName(_fileNameText.getText().trim());
                    }
                });
            } else {
                _binding.setFileName(_fileNameText.getText().trim());
            }
        } else if (control.equals(_autoCreateButton)) {
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        _binding.setAutoCreate(_autoCreateButton.getSelection());
                    }
                });
            } else {
                _binding.setAutoCreate(_autoCreateButton.getSelection());
            }
        } else if (control.equals(_fileExistText)) {
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        if (_binding.getProduce() == null) {
                            _binding.setProduce(CamelFactory.eINSTANCE.createFileProducerType());
                        }
                        _binding.getProduce().setFileExist(_fileExistText.getText().trim());
                    }
                });
            } else {
                if (_binding.getProduce() == null) {
                    _binding.setProduce(CamelFactory.eINSTANCE.createFileProducerType());
                }
                _binding.getProduce().setFileExist(_fileExistText.getText().trim());
            }
        } else if (control.equals(_tempPrefixText)) {
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        if (_binding.getProduce() == null) {
                            _binding.setProduce(CamelFactory.eINSTANCE.createFileProducerType());
                        }
                        _binding.getProduce().setTempPrefix(_tempPrefixText.getText().trim());
                    }
                });
            } else {
                if (_binding.getProduce() == null) {
                    _binding.setProduce(CamelFactory.eINSTANCE.createFileProducerType());
                }
                _binding.getProduce().setTempPrefix(_tempPrefixText.getText().trim());
            }
        }
        setHasChanged(false);
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (_binding != null && !inUpdate() && hasChanged()) {
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
            if (_binding != null) {
                Control control = (Control) e.getSource();
                if (control.equals(_directoryText)) {
                    _directoryText.setText(this._binding.getDirectory());
                } else if (control.equals(_fileNameText)) {
                    _fileNameText.setText(this._binding.getFileName());
                } else if (control.equals(_autoCreateButton)) {
                    _autoCreateButton.setSelection(this._binding.isAutoCreate());
                } else if (this._binding.getProduce() != null) {
                    if (control.equals(_fileExistText)) {
                        _fileExistText.setText(this._binding.getProduce().getFileExist());
                    } else if (control.equals(_tempPrefixText)) {
                        _tempPrefixText.setText(this._binding.getProduce().getTempPrefix());
                    }
                }
            }
            setInUpdate(false);
        } else if (e.keyCode == SWT.CR) {
            // accept change
            if (_binding != null && !inUpdate() && hasChanged()) {
                validate();
                handleModify((Control) e.getSource());
                fireChangedEvent((Control) e.getSource());
            }
        } else if (e.keyCode == SWT.TAB) {
            if (_binding != null && !inUpdate() && hasChanged()) {
                boolean flag = validate();
                if (flag) {
                    handleModify((Control) e.getSource());
                }
                fireChangedEvent((Control) e.getSource());
            }
        }
    }

    @Override
    public void widgetSelected(SelectionEvent e) {
        if (!inUpdate()) {
            setHasChanged(true);
            handleModify((Control)e.getSource());
            fireChangedEvent((Control)e.getSource());
        }
    }
}
