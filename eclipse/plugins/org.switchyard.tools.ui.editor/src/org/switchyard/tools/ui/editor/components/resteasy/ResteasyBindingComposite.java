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

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;

/**
 * @author bfitzpat
 * 
 */
public class ResteasyBindingComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private Text _mAddressURLText;
    private Text _contextPathText = null;
    private DelimitedStringList _interfacesList = null;
    private RESTBindingType _binding = null;
    private TabFolder _tabFolder;

    /**
     * @param parent composite parent
     * @param style any style bits
     */
    public void createContents(Composite parent, int style) {

        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());
        if (getRootGridData() != null) {
            _panel.setLayoutData(getRootGridData());
        }

        _tabFolder = new TabFolder(_panel, SWT.NONE);

        TabItem one = new TabItem(_tabFolder, SWT.NONE);
        one.setText("REST");
        one.setControl(getResteasyControl(_tabFolder));

        addTabs(_tabFolder);
    }

    private Control getResteasyControl(TabFolder tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(1, false);
        composite.setLayout(gl);

        Group resteasyGroup = new Group(composite, SWT.NONE);
        resteasyGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        resteasyGroup.setLayout(new GridLayout(2, false));
        resteasyGroup.setText("REST Options");

        Label interfacesLabel = new Label(resteasyGroup, SWT.NULL);
        interfacesLabel.setText("RESTful Interfaces");
        interfacesLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, false, false));
        _interfacesList = new DelimitedStringList(resteasyGroup, SWT.NULL, !canEdit());
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
        
        if (getTargetObject() instanceof Reference) {
            _mAddressURLText = createLabelAndText(resteasyGroup, "Address");
            _mAddressURLText.setEnabled(canEdit());
            GridData uriGD = new GridData(GridData.FILL_HORIZONTAL);
            uriGD.horizontalSpan = 2;
            _mAddressURLText.setLayoutData(uriGD);
        }

        if (getTargetObject() instanceof Service) {
            _contextPathText = createLabelAndText(resteasyGroup, "Context Path");
            _contextPathText.setEnabled(canEdit());
            GridData cpGD = new GridData(GridData.FILL_HORIZONTAL);
            cpGD.horizontalSpan = 2;
            _contextPathText.setLayoutData(cpGD);
        }

        return composite;
    }
    
    protected void handleModify(Control control) {
        if (_binding != null) {
            if (control.equals(_mAddressURLText)) {
                String _sURL = _mAddressURLText.getText().trim();
                updateFeature(_binding, "address", _sURL);
            } else if (control.equals(_contextPathText)) {
                String contextPath = _contextPathText.getText().trim();
                updateFeature(_binding, "contextPath", contextPath);
            } else if (control.equals(_interfacesList)) {
                String interfacesString = _interfacesList.getSelection();
                updateFeature(_binding, "interfaces", interfacesString);
            }
        }
        super.handleModify(control);
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
            setErrorMessage("At least one Java interface or abstract/empty class with REST annotations must be specified.");
        }

        super.validateTabs();
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
                    if (getTargetObject() != null && getTargetObject() instanceof Contract) {
                        Contract contract = (Contract) getTargetObject();
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
            super.setTabsBinding(_binding);
            setInUpdate(false);
            validate();
        } else {
            this._binding = null;
        }
        addObservableListeners();
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

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (control.equals(_contextPathText)) {
                _contextPathText.setText(_binding.getContextPath());
           } else if (control.equals(_mAddressURLText)) {
               _mAddressURLText.setText(_binding.getAddress());
           }
        } else {
            super.handleUndo(control);
        }
        setHasChanged(false);
    }

}
