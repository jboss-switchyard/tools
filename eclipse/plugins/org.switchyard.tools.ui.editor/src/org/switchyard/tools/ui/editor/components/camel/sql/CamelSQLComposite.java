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
package org.switchyard.tools.ui.editor.components.camel.sql;

import java.util.ArrayList;

import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelSqlBindingType;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.util.InterfaceOpsUtil;

/**
 * @author bfitzpat
 * 
 */
public class CamelSQLComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelSqlBindingType _binding = null;
    private Text _queryText;
    private Text _dataSourceRefText;
    private Text _placeholderText;
    private Button _batchCheckbox;
    private Combo _operationSelectionCombo;
    private TabFolder _tabFolder;

    @Override
    public Binding getBinding() {
        return this._binding;
    }

    @Override
    public void setBinding(Binding impl) {
        if (impl instanceof CamelSqlBindingType) {
            this._binding = (CamelSqlBindingType) impl;
            setInUpdate(true);
            if (this._binding.getQuery() != null) {
                _queryText.setText(this._binding.getQuery());
            }
            if (this._binding.getDataSourceRef() != null) {
                _dataSourceRefText.setText(this._binding.getDataSourceRef());
            }
            if (this._binding.getPlaceholder() != null) {
                _placeholderText.setText(this._binding.getPlaceholder());
            }
            _batchCheckbox.setSelection(this._binding.isBatch());
            populateOperationCombo();
            if (this._binding.getCamelOperationSelector() != null) {
                CamelOperationSelectorType camelOpSelector = (CamelOperationSelectorType) this._binding
                        .getCamelOperationSelector();
                setTextValue(_operationSelectionCombo, camelOpSelector.getOperationName());
            }
            super.setTabsBinding(_binding);
            setInUpdate(false);
            validate();
        } else {
            this._binding = null;
            populateOperationCombo();
        }
        addObservableListeners();
    }

    @Override
    protected boolean validate() {
        setErrorMessage(null);
        if (getBinding() != null) {
            if (_queryText.getText().trim().isEmpty()) {
                setErrorMessage("Query may not be empty.");
                return false;
            }
            if (_dataSourceRefText.getText().trim().isEmpty()) {
                setErrorMessage("Data Source Reference may not be empty.");
                return false;
            }
        }
        super.validateTabs();
        return (getErrorMessage() == null);
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());
        if (getRootGridData() != null) {
            _panel.setLayoutData(getRootGridData());
        }

        _tabFolder = new TabFolder(_panel, SWT.NONE);

        TabItem one = new TabItem(_tabFolder, SWT.NONE);
        one.setText("SQL Gateway");
        one.setControl(getSQLTabControl(_tabFolder));

        addTabs(_tabFolder);
    }

    private Control getSQLTabControl(TabFolder tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(1, false);
        composite.setLayout(gl);

        Group sqlGroup = new Group(composite, SWT.NONE);
        sqlGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        sqlGroup.setLayout(new GridLayout(2, false));
        sqlGroup.setText("SQL Options");

        _queryText = createLabelAndText(sqlGroup, "Query*");
        _dataSourceRefText = createLabelAndText(sqlGroup, "Data Source*");
        _batchCheckbox = createCheckbox(sqlGroup, "Batch");
//        _placeholderText = createLabelAndText(sqlGroup, "Placeholder");

        Group opGroup = new Group(composite, SWT.NONE);
        opGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        opGroup.setLayout(new GridLayout(2, false));
        opGroup.setText("Operation Options");
        _operationSelectionCombo = createLabelAndCombo(opGroup, "Operation");
        populateOperationCombo();

        return composite;
    }

    private void populateOperationCombo() {
        if (_operationSelectionCombo != null && !_operationSelectionCombo.isDisposed()) {
            _operationSelectionCombo.removeAll();
            _operationSelectionCombo.clearSelection();

            if (getTargetObject() == null) {
                PictogramElement[] pes = SwitchyardSCAEditor.getActiveEditor().getSelectedPictogramElements();
                if (pes.length > 0) {
                    Object bo = SwitchyardSCAEditor.getActiveEditor().getDiagramTypeProvider().getFeatureProvider()
                            .getBusinessObjectForPictogramElement(pes[0]);
                    if (bo instanceof Service) {
                        setTargetObject(bo);
                    }
                }
            }
            if (getTargetObject() != null && getTargetObject() instanceof Service) {
                String[] operations = InterfaceOpsUtil.gatherOperations((Service) getTargetObject());
                for (int i = 0; i < operations.length; i++) {
                    _operationSelectionCombo.add(operations[i]);
                }
            }
        }
    }

    @Override
    public Composite getPanel() {
        return this._panel;
    }

    class CamelOperationSelectorOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding.getOperationSelector() == null) {
                setFeatureValue(_binding, "camelOperationSelector", CamelFactory.eINSTANCE.createCamelOperationSelectorType());
            }
        }
    }

    protected void updateCamelOperationSelectorFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new CamelOperationSelectorOp());
        ops.add(new BasicOperation("camelOperationSelector", featureId, value));
        wrapOperation(ops);
    }

    protected void handleModify(final Control control) {
        if (control.equals(_queryText)) {
            updateFeature(_binding, "query", _queryText.getText().trim());
        } else if (control.equals(_dataSourceRefText)) {
            updateFeature(_binding, "dataSourceRef", _dataSourceRefText.getText().trim());
        } else if (control.equals(_placeholderText)) {
            updateFeature(_binding, "placeholder", _placeholderText.getText().trim());
        } else if (control.equals(_batchCheckbox)) {
            boolean value = _batchCheckbox.getSelection();
            updateFeature(_binding, "batch", value);
        } else if (control.equals(_operationSelectionCombo)) {
            updateCamelOperationSelectorFeature("operationName", _operationSelectionCombo.getText().trim());
        }
        super.handleModify(control);
        validate();
        setHasChanged(false);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (control.equals(_queryText)) {
                _queryText.setText(this._binding.getQuery());
            } else if (control.equals(_dataSourceRefText)) {
                _dataSourceRefText.setText(this._binding.getDataSourceRef());
            } else if (control.equals(_placeholderText)) {
                _placeholderText.setText(this._binding.getPlaceholder());
            } else if (control.equals(_batchCheckbox)) {
                _batchCheckbox.setSelection(this._binding.isBatch());
            } else if (control.equals(_operationSelectionCombo)) {
                if (this._binding.getCamelOperationSelector() != null) {
                    populateOperationCombo();
                    CamelOperationSelectorType camelOpSelector = (CamelOperationSelectorType) this._binding
                            .getCamelOperationSelector();
                    setTextValue(_operationSelectionCombo, camelOpSelector.getOperationName());
                }
            } else {
                super.handleUndo(control);
            }
        }
        setHasChanged(false);
    }
    
}
