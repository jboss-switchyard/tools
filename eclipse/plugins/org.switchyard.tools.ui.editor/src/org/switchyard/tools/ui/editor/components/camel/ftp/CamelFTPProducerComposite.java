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
package org.switchyard.tools.ui.editor.components.camel.ftp;

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
import org.switchyard.tools.models.switchyard1_0.camel.CamelFtpBindingType;
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class CamelFTPProducerComposite extends AbstractSwitchyardComposite implements IBindingComposite {

    private Composite _panel;
    private CamelFtpBindingType _binding = null;
    private Text _hostText;
    private Text _portText;
    private Text _usernameText;
    private Text _pwdText;
    private Button _binaryButton;
    private Text _directoryText;
    private Button _autoCreateButton;
    private Text _fileNameText;
    private Text _fileExistText;
    private Text _tempPrefixText;

    @Override
    public Binding getBinding() {
        return this._binding;
    }

    @Override
    public void setBinding(Binding impl) {
        if (impl instanceof CamelFtpBindingType) {
            this._binding = (CamelFtpBindingType) impl;
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
            if (this._binding.getHost() != null) {
                _hostText.setText(this._binding.getHost());
            }
            if (this._binding.isSetPort()) {
                _portText.setText(Integer.toString(this._binding.getPort()));
            }
            if (this._binding.getUsername() != null) {
                _usernameText.setText(this._binding.getUsername());
            }
            if (this._binding.getPassword() != null) {
                _pwdText.setText(this._binding.getPassword());
            }
            if (this._binding.isBinary()) {
                _binaryButton.setSelection(this._binding.isBinary());
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
            } else if (!_portText.getText().trim().isEmpty()) {
                try {
                    new Integer(_portText.getText().trim());
                } catch (NumberFormatException nfe) {
                    setErrorMessage("Port value must be a valid number.");
                }
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

        Group ftpGroup = new Group(composite, SWT.NONE);
        ftpGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        ftpGroup.setLayout(new GridLayout(2, false));
        ftpGroup.setText("FTP Options");

        _hostText = createLabelAndText(ftpGroup, "Host");
        _portText = createLabelAndText(ftpGroup, "Port (Default 21)");
        _usernameText = createLabelAndText(ftpGroup, "User Name");
        _pwdText = createLabelAndText(ftpGroup, "Password");
        _pwdText.setEchoChar('*');
        _binaryButton = createCheckbox(ftpGroup, "Use Binary Transfer Mode");
        
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
        } else if (control.equals(_hostText)) {
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        _binding.setHost(_hostText.getText().trim());
                    }
                });
            } else {
                _binding.setHost(_hostText.getText().trim());
            }
        } else if (control.equals(_usernameText)) {
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        _binding.setUsername(_usernameText.getText().trim());
                    }
                });
            } else {
                _binding.setUsername(_usernameText.getText().trim());
            }
        } else if (control.equals(_pwdText)) {
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        _binding.setPassword(_pwdText.getText().trim());
                    }
                });
            } else {
                _binding.setPassword(_pwdText.getText().trim());
            }
        } else if (control.equals(_binaryButton)) {
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        _binding.setBinary(_binaryButton.getSelection());
                    }
                });
            } else {
                _binding.setBinary(_binaryButton.getSelection());
            }
        } else if (control.equals(_portText)) {
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        try {
                            int port = Integer.parseInt(_portText.getText().trim());
                            _binding.setPort(port);
                        } catch (NumberFormatException nfe) {
                            nfe.fillInStackTrace();
                        }
                    }
                });
            } else {
                try {
                    int port = Integer.parseInt(_portText.getText().trim());
                    _binding.setPort(port);
                } catch (NumberFormatException nfe) {
                    nfe.fillInStackTrace();
                }
            }
        } else if (control.equals(_fileExistText)) {
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        if (_binding.getProduce() == null) {
                            _binding.setProduce(CamelFactory.eINSTANCE.createRemoteFileProducerType());
                        }
                        _binding.getProduce().setFileExist(_fileExistText.getText().trim());
                    }
                });
            } else {
                if (_binding.getProduce() == null) {
                    _binding.setProduce(CamelFactory.eINSTANCE.createRemoteFileProducerType());
                }
                _binding.getProduce().setFileExist(_fileExistText.getText().trim());
            }
        } else if (control.equals(_tempPrefixText)) {
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        if (_binding.getProduce() == null) {
                            _binding.setProduce(CamelFactory.eINSTANCE.createRemoteFileProducerType());
                        }
                        _binding.getProduce().setTempPrefix(_tempPrefixText.getText().trim());
                    }
                });
            } else {
                if (_binding.getProduce() == null) {
                    _binding.setProduce(CamelFactory.eINSTANCE.createRemoteFileProducerType());
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
                } else if (control.equals(_hostText)) {
                    _hostText.setText(this._binding.getHost());
                } else if (control.equals(_portText)) {
                    _portText.setText(Integer.toString(this._binding.getPort()));
                } else if (control.equals(_usernameText)) {
                    _usernameText.setText(this._binding.getUsername());
                } else if (control.equals(_pwdText)) {
                    _pwdText.setText(this._binding.getPassword());
                } else if (control.equals(_binaryButton)) {
                    _binaryButton.setSelection(this._binding.isBinary());
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
