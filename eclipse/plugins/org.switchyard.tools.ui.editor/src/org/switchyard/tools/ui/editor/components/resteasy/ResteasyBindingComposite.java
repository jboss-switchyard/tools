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
package org.switchyard.tools.ui.editor.components.resteasy;

import java.net.URI;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class ResteasyBindingComposite extends AbstractSwitchyardComposite implements IBindingComposite {

    private Composite _panel;
    private Text _mAddressURLText;
    private Text _contextPathText = null;
    private DelimitedStringList _interfacesList = null;
    private RESTBindingType _binding = null;
    private EObject _targetObj;

    /**
     * Constructor.
     */
    public ResteasyBindingComposite() {
        // empty
    }

    /**
     * @param parent composite parent
     * @param style any style bits
     */
    public void createContents(Composite parent, int style) {

        _panel = new Composite(parent, style);
        GridLayout gl = new GridLayout();
        gl.numColumns = 3;
        _panel.setLayout(gl);
        if (getRootGridData() != null) {
            _panel.setLayoutData(getRootGridData());
        }

        Label interfacesLabel = new Label(_panel, SWT.NULL);
        interfacesLabel.setText("RESTful Interfaces");
        interfacesLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, false, false));
        _interfacesList = new DelimitedStringList(_panel, SWT.NULL, !canEdit());
        GridData ilGD = new GridData(GridData.FILL_HORIZONTAL);
        ilGD.horizontalSpan = 2;
        _interfacesList.setLayoutData(ilGD);
        _interfacesList.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                if (_binding != null) {
                    validate();
                    handleModify(_interfacesList);
                    fireChangedEvent(_interfacesList);
                }
            }
        });
        
        if (_targetObj instanceof Reference) {
            _mAddressURLText = createLabelAndText(_panel, "Address");
            _mAddressURLText.setEnabled(canEdit());
            GridData uriGD = new GridData(GridData.FILL_HORIZONTAL);
            uriGD.horizontalSpan = 2;
            _mAddressURLText.setLayoutData(uriGD);
        }

        if (_targetObj instanceof Service) {
            _contextPathText = createLabelAndText(_panel, "Context Path");
            _contextPathText.setEnabled(canEdit());
            GridData cpGD = new GridData(GridData.FILL_HORIZONTAL);
            cpGD.horizontalSpan = 2;
            _contextPathText.setLayoutData(cpGD);
        }

    }

    protected void handleModify(Control control) {
        TransactionalEditingDomain domain = null;
        if (_binding != null) {
            if (_binding.eContainer() != null) {
                domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
            }
            if (control.equals(_mAddressURLText)) {
                final String _sURL = _mAddressURLText.getText().trim();
                if (domain != null) {
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            _binding.setAddress(_sURL);
                        }
                    });
                } else {
                    _binding.setAddress(_sURL);
                }
            } else if (control.equals(_contextPathText)) {
                final String contextPath = _contextPathText.getText().trim();
                if (domain != null) {
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            if (contextPath != null && contextPath.trim().length() > 0) {
                                _binding.setContextPath(contextPath);
                            }
                        }
                    });
                } else {
                    if (contextPath != null && contextPath.trim().length() > 0) {
                        _binding.setContextPath(contextPath);
                    }
                }
            } else if (control.equals(_interfacesList)) {
                final String interfacesString = _interfacesList.getSelection();
                if (domain != null) {
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            if (interfacesString != null && interfacesString.trim().length() > 0) {
                                _binding.setInterfaces(interfacesString);
                            }
                        }
                    });
                } else {
                    if (interfacesString != null && interfacesString.trim().length() > 0) {
                        _binding.setInterfaces(interfacesString);
                    }
                }
            }
        }
        validate();
        setHasChanged(false);
    }

    protected boolean validate() {
        setErrorMessage(null);
        String urlString = null;
        if (_mAddressURLText != null && !_mAddressURLText.isDisposed()) {
            urlString = _mAddressURLText.getText();

            if (urlString != null && urlString.trim().length() > 0) {
                if (urlString.trim().length() < urlString.length()) {
                    setErrorMessage("No spaces allowed in address URL");
                } else {
                    try {
                        URI.create(urlString);
                    } catch (IllegalArgumentException e) {
                        setErrorMessage("Invalid address URL");
                    }
                }
            }
        }

        String delimited = _interfacesList.getSelection();
        if (delimited.trim().length() == 0) {
            setErrorMessage("At least one Java interface or abstract/empty classe with REST annotations must be specified.");
        }

        return (getErrorMessage() == null);
    }

    /**
     * @return RESTeasy Binding
     */
    public Binding getBinding() {
        return _binding;
    }

    /**
     * @return panel
     */
    public Composite getPanel() {
        return _panel;
    }

    /**
     * @param switchYardBindingType binding
     */
    public void setBinding(Binding switchYardBindingType) {
        if (switchYardBindingType instanceof RESTBindingType) {
            this._binding = (RESTBindingType) switchYardBindingType;
            setInUpdate(true);
            String addressUrl = _binding.getAddress();
            if (_mAddressURLText != null && !_mAddressURLText.isDisposed() && addressUrl != null && addressUrl.trim().length() > 0) {
                _mAddressURLText.setText(addressUrl);
            }
            if (_contextPathText != null && !_contextPathText.isDisposed()) {
                if (_binding.getContextPath() != null) {
                    this._contextPathText.setText(_binding.getContextPath());
                } else {
                    if (_targetObj != null && _targetObj instanceof Contract) {
                        Contract contract = (Contract) _targetObj;
                        if (contract.eContainer() != null && contract.eContainer() instanceof org.eclipse.soa.sca.sca1_1.model.sca.Composite) {
                            org.eclipse.soa.sca.sca1_1.model.sca.Composite composite = (org.eclipse.soa.sca.sca1_1.model.sca.Composite) contract.eContainer();
                            if (composite.eContainer() != null && composite.eContainer() instanceof SwitchYardType) {
                                SwitchYardType rootSwitchYard = (SwitchYardType) composite.eContainer();
                                this._contextPathText.setText(rootSwitchYard.getName());
                                handleModify(_contextPathText);
                            }
                        }
                    }
                }
            }
            if (_interfacesList != null && !_interfacesList.isDisposed()) {
                if (_binding.getInterfaces() != null) {
                    this._interfacesList.setSelection(_binding.getInterfaces());
                }
            }
            setInUpdate(false);
        }
    }

    /**
     * @param canEdit flag
     */
    public void setCanEdit(boolean canEdit) {
        super.setCanEdit(canEdit);
        if (this._mAddressURLText != null && !this._mAddressURLText.isDisposed()) {
            this._mAddressURLText.setEnabled(canEdit());
        }
        if (this._contextPathText != null && !this._contextPathText.isDisposed()) {
            this._contextPathText.setEnabled(canEdit());
        }
        if (this._interfacesList != null && !this._interfacesList.isDisposed()) {
            this._interfacesList.setEnabled(canEdit());
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (!inUpdate()) {
            setHasChanged(true);
            handleModify((Control)e.getSource());
            fireChangedEvent((Control)e.getSource());
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
    
    /**
     * @param target EObject target
     */
    public void setTargetObject(EObject target) {
        this._targetObj = target;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.keyCode == SWT.ESC) {
            // cancel out and return to original value
            setInUpdate(true);
            if (_binding != null) {
                Control control = (Control) e.getSource();
                 if (control.equals(_contextPathText)) {
                     _contextPathText.setText(_binding.getContextPath());
                } else if (control.equals(_mAddressURLText)) {
                    _mAddressURLText.setText(_binding.getAddress());
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
}
