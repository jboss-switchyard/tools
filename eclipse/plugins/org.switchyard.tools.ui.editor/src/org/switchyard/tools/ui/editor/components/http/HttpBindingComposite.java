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
package org.switchyard.tools.ui.editor.components.http;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorComposite;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorUtil;

/**
 * @author bfitzpat
 * 
 */
public class HttpBindingComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private Text _nameText;
    private Text _mAddressURLText;
    private Combo _methodCombo;
    private Text _contentTypeText;
    private Text _contextPathText = null;
    private HTTPBindingType _binding = null;
    private OperationSelectorComposite _opSelectorComposite;

    @Override
    public String getTitle() {
        return "HTTP Binding Details";
    }

    @Override
    public String getDescription() {
        return "Specify pertinent details for your HTTP Binding.";
    }

    /**
     * @param parent composite parent
     * @param style any style bits
     */
    @Override
    public void createContents(Composite parent, int style) {

        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getHttpControl(_panel);

        if (getTargetObject() != null && getTargetObject() instanceof Service) {
            if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed()) {
                _opSelectorComposite.setTargetObject((EObject) getTargetObject());
            }
        }
    }

    private Control getHttpControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);

        _nameText = createLabelAndText(composite, "Name");

        if (getTargetObject() instanceof Service) {
            _contextPathText = createLabelAndText(composite, "Context Path");
            _contextPathText.setEnabled(canEdit());

            _opSelectorComposite = new OperationSelectorComposite(composite, SWT.NONE);
            _opSelectorComposite.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
            _opSelectorComposite.setLayout(new GridLayout(2, false));
            _opSelectorComposite.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    handleModify(_opSelectorComposite);
                }
             });
            _opSelectorComposite.setTargetObject((EObject) getTargetObject());
        }

        if (getTargetObject() instanceof Reference) {
            _mAddressURLText = createLabelAndText(composite, "Address");
            _mAddressURLText.setEnabled(canEdit());
            
            _methodCombo = createLabelAndCombo(composite, "Method", false);
            _methodCombo.add("GET");
            _methodCombo.add("POST");
            _methodCombo.add("PUT");
            _methodCombo.add("DELETE");
            _methodCombo.add("HEAD");
            _methodCombo.add("OPTIONS");
            _methodCombo.add("TRACE");
            _methodCombo.add("CONNECT");
            _methodCombo.setEnabled(canEdit());

            _contentTypeText = createLabelAndText(composite, "Content Type");
            _contentTypeText.setEnabled(canEdit());
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
            } else if (control.equals(_opSelectorComposite)) {
                int opType = _opSelectorComposite.getSelectedOperationSelectorType();
                updateOperationSelectorFeature(opType, _opSelectorComposite.getSelectedOperationSelectorValue());
            } else if (control.equals(_methodCombo)) {
                String methodName = _methodCombo.getText().trim();
                updateFeature(_binding, "method", methodName);
            } else if (control.equals(_contentTypeText)) {
                String contentType = _contentTypeText.getText().trim();
                updateFeature(_binding, "contentType", contentType);
            } else if (control.equals(_nameText)) {
                super.updateFeature(_binding, "name", _nameText.getText().trim());
            }
        }
        super.handleModify(control);
        validate();
        setHasChanged(false);
        setDidSomething(true);
    }
    
    @Override
    public void setTargetObject(EObject target) {
        super.setTargetObject(target);
        if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed()) {
            _opSelectorComposite.setTargetObject(target);
        }
    }

    protected boolean validate() {
        setErrorMessage(null);
        String urlString = null;
        if (_mAddressURLText != null && !_mAddressURLText.isDisposed()) {
            urlString = _mAddressURLText.getText();

            if (urlString != null && urlString.trim().length() > 0) {
                if (urlString.trim().length() < urlString.length()) {
                    setErrorMessage("No spaces allowed in address URL");
                }
            }
        }

        return (getErrorMessage() == null);
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
        super.setBinding(switchYardBindingType);
        if (switchYardBindingType instanceof HTTPBindingType) {
            setTargetObject(switchYardBindingType.eContainer());
            this._binding = (HTTPBindingType) switchYardBindingType;
            setInUpdate(true);
            
            setTextValue(_mAddressURLText, _binding.getAddress());
            setTextValue(_contentTypeText, _binding.getContentType());
            setTextValue(_methodCombo, _binding.getMethod());

            if (_binding.getName() == null) {
                _nameText.setText("");
            } else {
                _nameText.setText(_binding.getName());
            }

            if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed()) {
                OperationSelectorType opSelector = OperationSelectorUtil.getFirstOperationSelector(this._binding);
                _opSelectorComposite.setBinding(this._binding);
                _opSelectorComposite.setOperation((SwitchYardOperationSelectorType) opSelector);
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
                                if (rootSwitchYard.getName() != null) {
                                    this._contextPathText.setText(rootSwitchYard.getName());
                                    handleModify(_contextPathText);
                                }
                            }
                        }
                    }
                }
            }
            
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
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (control.equals(_contextPathText)) {
                _contextPathText.setText(_binding.getContextPath());
            } else if (control.equals(_nameText)) {
                _nameText.setText(_binding.getName() == null ? "" : _binding.getName());
           } else if (control.equals(_mAddressURLText)) {
               _mAddressURLText.setText(_binding.getAddress());
           }
        } else {
            super.handleUndo(control);
        }
        setHasChanged(false);
    }

}
