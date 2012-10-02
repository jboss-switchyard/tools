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

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.graphiti.mm.pictograms.PictogramElement;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.http.HttpBindingType;
import org.switchyard.tools.models.switchyard1_0.http.HttpContextMapperType;
import org.switchyard.tools.models.switchyard1_0.http.HttpFactory;
import org.switchyard.tools.models.switchyard1_0.http.HttpMessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.binding.CamelBindingUtil;
import org.switchyard.tools.ui.editor.diagram.binding.CamelOperationSelectorGroupOp;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorOp;
import org.switchyard.tools.ui.editor.diagram.binding.RemoveOperationSelectorOp;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.util.InterfaceOpsUtil;

/**
 * @author bfitzpat
 * 
 */
public class HttpBindingComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private Text _mAddressURLText;
    private Combo _operationSelectionCombo;
    private Combo _methodCombo;
    private Text _contentTypeText;
    private Text _contextPathText = null;
    private HttpBindingType _binding = null;
    private TabFolder _tabFolder;
    private List<String> _advancedPropsFilterList;

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
        one.setText("HTTP");
        one.setControl(getHttpControl(_tabFolder));

        addTabs(_tabFolder);
    }

    private Control getHttpControl(TabFolder tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(1, false);
        composite.setLayout(gl);

        Group httpGroup = new Group(composite, SWT.NONE);
        httpGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        httpGroup.setLayout(new GridLayout(2, false));
        httpGroup.setText("HTTP Options");
        
        if (getTargetObject() instanceof Service) {
            _contextPathText = createLabelAndText(httpGroup, "Context Path");
            _contextPathText.setEnabled(canEdit());
            GridData cpGD = new GridData(GridData.FILL_HORIZONTAL);
            cpGD.horizontalSpan = 2;
            _contextPathText.setLayoutData(cpGD);
        }

        Group opGroup = new Group(composite, SWT.NONE);
        opGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        opGroup.setLayout(new GridLayout(2, false));
        opGroup.setText("Operation Options");
        _operationSelectionCombo = createLabelAndCombo(opGroup, "Operation");
        populateOperationCombo();

        if (getTargetObject() instanceof Reference) {
            _mAddressURLText = createLabelAndText(httpGroup, "Address");
            _mAddressURLText.setEnabled(canEdit());
            GridData uriGD = new GridData(GridData.FILL_HORIZONTAL);
            uriGD.horizontalSpan = 2;
            _mAddressURLText.setLayoutData(uriGD);
            
            _methodCombo = createLabelAndCombo(httpGroup, "Method", true);
            _methodCombo.add("GET");
            _methodCombo.add("POST");
            _methodCombo.add("PUT");
            _methodCombo.add("DELETE");
            _methodCombo.add("HEAD");
            _methodCombo.add("OPTIONS");
            _methodCombo.add("TRACE");
            _methodCombo.add("CONNECT");
            _methodCombo.setEnabled(canEdit());
            GridData methodGD = new GridData(GridData.FILL_HORIZONTAL);
            methodGD.horizontalSpan = 2;
            _methodCombo.setLayoutData(methodGD);

            _contentTypeText = createLabelAndText(httpGroup, "Content Type");
            _contentTypeText.setEnabled(canEdit());
            GridData contentTypeGD = new GridData(GridData.FILL_HORIZONTAL);
            contentTypeGD.horizontalSpan = 2;
            _contentTypeText.setLayoutData(contentTypeGD);
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
            } else if (control.equals(_operationSelectionCombo)) {
                updateOperationSelectorFeature("operationName", _operationSelectionCombo.getText().trim());
            } else if (control.equals(_methodCombo)) {
                String methodName = _methodCombo.getText().trim();
                updateFeature(_binding, "method", methodName);
            } else if (control.equals(_contentTypeText)) {
                String contentType = _contentTypeText.getText().trim();
                updateFeature(_binding, "contentType", contentType);
            }
        }
        super.handleModify(control);
        validate();
        setHasChanged(false);
    }

    private void populateOperationCombo() {
        if (_operationSelectionCombo != null && !_operationSelectionCombo.isDisposed()) {
            _operationSelectionCombo.removeAll();
            _operationSelectionCombo.clearSelection();

            if (getTargetObject() == null) {
                PictogramElement[] pes = 
                        SwitchyardSCAEditor.getActiveEditor().getSelectedPictogramElements();
                if (pes.length > 0) {
                    Object bo = SwitchyardSCAEditor.getActiveEditor().
                        getDiagramTypeProvider().getFeatureProvider().
                           getBusinessObjectForPictogramElement(pes[0]);
                    if (bo instanceof Service) {
                        setTargetObject(bo);
                    }
                }
            }
            if (getTargetObject() != null && getTargetObject() instanceof Contract) {
                String[] operations = InterfaceOpsUtil.gatherOperations((Contract) getTargetObject());
                for (int i = 0; i < operations.length; i++) {
                    _operationSelectionCombo.add(operations[i]);
                }
            }
        }
    }
    
    private void updateOperationSelectorFeature(String featureId, Object value) {
        if (CamelBindingUtil.getFirstOperationSelector(_binding) != null) {
            OperationSelectorType opSelect = CamelBindingUtil.getFirstOperationSelector(_binding);
            Object oldValue = getFeatureValue(opSelect, featureId);
            // don't do anything if the value is the same
            if (oldValue == null && value == null) {
                return;
            } else if (oldValue != null && oldValue.equals(value)) {
                return;
            } else if (value != null && value.equals(oldValue)) {
                return;
            }
        }
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        if (featureId.equals("operationName") && value instanceof String && ((String)value).trim().isEmpty()) {
            ops.add(new RemoveOperationSelectorOp(this._binding));
        } else {
            ops.add(new CamelOperationSelectorGroupOp(this._binding));
            ops.add(new OperationSelectorOp(this._binding, featureId, value));
        }
        wrapOperation(ops);
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
        if (switchYardBindingType instanceof HttpBindingType) {
            this._binding = (HttpBindingType) switchYardBindingType;
            setInUpdate(true);
            
            setTextValue(_mAddressURLText, _binding.getAddress());
            setTextValue(_contentTypeText, _binding.getContentType());
            setTextValue(_methodCombo, _binding.getMethod());

            populateOperationCombo();
            String opName = CamelBindingUtil.getOperationNameForStaticOperationSelector(this._binding);
            if (opName != null) {
                setTextValue(_operationSelectionCombo, opName);
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
            setTabsBinding(_binding);
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
           } else if (control.equals(_mAddressURLText)) {
               _mAddressURLText.setText(_binding.getAddress());
           } else if (control.equals(_operationSelectionCombo)) {
               String opName = CamelBindingUtil.getOperationNameForStaticOperationSelector(this._binding);
               setTextValue(_operationSelectionCombo, opName);
           }
        } else {
            super.handleUndo(control);
        }
        setHasChanged(false);
    }

    @Override
    protected List<String> getAdvancedPropertiesFilterList() {
        return _advancedPropsFilterList;
    }

    protected MessageComposerType createMessageComposer() {
        HttpMessageComposerType messageComposer = HttpFactory.eINSTANCE.createHttpMessageComposerType();
        return messageComposer;
    }

    protected ContextMapperType createContextMapper() {
        HttpContextMapperType contextMapper = HttpFactory.eINSTANCE.createHttpContextMapperType();
        return contextMapper;
    }

    class MessageComposerOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getMessageComposer() == null) {
                HttpMessageComposerType messageComposer = (HttpMessageComposerType) createMessageComposer();
                setFeatureValue(_binding, "messageComposer", messageComposer);
            }
        }
    }

    class ContextMapperOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getContextMapper() == null) {
                HttpContextMapperType contextMapper = (HttpContextMapperType) createContextMapper();
                setFeatureValue(_binding, "contextMapper", contextMapper);
            }
        }
    }

    protected void updateMessageComposerFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new MessageComposerOp());
        ops.add(new BasicOperation("messageComposer", featureId, value));
        wrapOperation(ops);
    }

    protected void updateContextMapperFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new ContextMapperOp());
        ops.add(new BasicOperation("contextMapper", featureId, value));
        wrapOperation(ops);
    }

    /**
     * @param switchYardBindingType incoming binding
     */
    public void setTabsBinding(Binding switchYardBindingType) {
        super.setTabsBinding(switchYardBindingType);
        if (_binding != null && _binding instanceof HttpBindingType) {
            HttpBindingType binding = (HttpBindingType) _binding;
            if (binding.getContextMapper() instanceof HttpContextMapperType
                    && ((HttpContextMapperType) binding.getContextMapper()).getClass_() != null) {
                setTextValue(getMapperClassText(), ((HttpContextMapperType) binding.getContextMapper()).getClass_());
            } else {
                setTextValue(getMapperClassText(), "");
            }
            if (binding.getMessageComposer() instanceof HttpMessageComposerType
                    && ((HttpMessageComposerType) binding.getMessageComposer()).getClass_() != null) {
                setTextValue(getComposerClassText(),
                        ((HttpMessageComposerType) binding.getMessageComposer()).getClass_());
            } else {
                setTextValue(getComposerClassText(), "");
            }
            if (binding.getContextMapper() != null) {
                setTextValue(getIncludesText(), binding.getContextMapper().getIncludes());
                setTextValue(getIncludesNSText(), binding.getContextMapper().getIncludeNamespaces());
                setTextValue(getExcludesText(), binding.getContextMapper().getExcludes());
                setTextValue(getExcludesNSText(), binding.getContextMapper().getExcludeNamespaces());
            } else {
                setTextValue(getIncludesText(), "");
                setTextValue(getIncludesNSText(), "");
                setTextValue(getExcludesText(), "");
                setTextValue(getExcludesNSText(), "");
            }
        }
        resetSelectedTab();
    }
}
