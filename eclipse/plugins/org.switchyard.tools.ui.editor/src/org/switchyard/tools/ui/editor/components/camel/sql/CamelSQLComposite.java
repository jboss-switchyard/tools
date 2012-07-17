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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionEvent;
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
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.util.InterfaceOpsUtil;

/**
 * @author bfitzpat
 * 
 */
public class CamelSQLComposite extends AbstractSwitchyardComposite implements IBindingComposite {

    private Composite _panel;
    private CamelSqlBindingType _binding = null;
    private Text _queryText;
    private Text _dataSourceRefText;
    private Text _placeholderText;
    private Button _batchCheckbox;
    private Combo _operationSelectionCombo;
    private Object _targetObj = null;

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
                _operationSelectionCombo.setText(camelOpSelector.getOperationName());
            }
            setInUpdate(false);
            validate();
        } else {
            this._binding = null;
            populateOperationCombo();
        }
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
        one.setText("SQL Gateway");
        one.setControl(getSQLTabControl(tabFolder));
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

            if (_targetObj == null) {
                @SuppressWarnings("restriction")
                PictogramElement[] pes = SwitchyardSCAEditor.getActiveEditor().getSelectedPictogramElements();
                if (pes.length > 0) {
                    @SuppressWarnings("restriction")
                    Object bo = SwitchyardSCAEditor.getActiveEditor().getDiagramTypeProvider().getFeatureProvider()
                            .getBusinessObjectForPictogramElement(pes[0]);
                    if (bo instanceof Service) {
                        _targetObj = bo;
                    }
                }
            }
            if (_targetObj != null && _targetObj instanceof Service) {
                String[] operations = InterfaceOpsUtil.gatherOperations((Service) _targetObj);
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

    private void setFeatureValue(EObject eObject, String featureId, Object value) {
        EClass eClass = eObject.eClass();
        for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
            EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
            if (eStructuralFeature.isChangeable()) {
                if (eStructuralFeature.getName().equalsIgnoreCase(featureId)) {
                    eObject.eSet(eStructuralFeature, value);
                    break;
                }
            }
        }
    }

    private class BindingRecordingCommand extends RecordingCommand {

        private CamelSqlBindingType _innerBinding;
        private String _featureId;
        private Object _value;

        public BindingRecordingCommand(TransactionalEditingDomain domain, CamelSqlBindingType binding,
                String featureId, Object value) {
            super(domain);
            this._innerBinding = binding;
            this._featureId = featureId;
            this._value = value;
        }

        @Override
        protected void doExecute() {
            setFeatureValue(_innerBinding, _featureId, _value);
        }

    }

    @SuppressWarnings("restriction")
    protected void handleModify(final Control control) {
        TransactionalEditingDomain domain = null;
        if (_binding.eContainer() != null) {
            domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
        }
        if (control.equals(_queryText)) {
            if (domain != null) {
                BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "query",
                        _queryText.getText().trim());
                domain.getCommandStack().execute(command);
            } else {
                _binding.setQuery(_queryText.getText().trim());
            }
        } else if (control.equals(_dataSourceRefText)) {
            if (domain != null) {
                BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "dataSourceRef", 
                    _dataSourceRefText.getText().trim());
                domain.getCommandStack().execute(command);
            } else {
                _binding.setDataSourceRef(_dataSourceRefText.getText().trim());
            }
        } else if (control.equals(_placeholderText)) {
            if (domain != null) {
                BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "placeholder", 
                    _placeholderText.getText().trim());
                domain.getCommandStack().execute(command);
            } else {
                _binding.setPlaceholder(_placeholderText.getText().trim());
            }
        } else if (control.equals(_batchCheckbox)) {
            if (domain != null) {
                BindingRecordingCommand command = new BindingRecordingCommand(domain, _binding, "batch",
                        _batchCheckbox.getSelection());
                domain.getCommandStack().execute(command);
            } else {
                _binding.setBatch(_batchCheckbox.getSelection());
            }
        } else if (control.equals(_operationSelectionCombo)) {
            if (domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        if (_binding.getOperationSelector() == null) {
                            _binding.setCamelOperationSelector(CamelFactory.eINSTANCE
                                    .createCamelOperationSelectorType());
                        }
                        ((CamelOperationSelectorType) _binding.getCamelOperationSelector())
                                .setOperationName(_operationSelectionCombo.getText().trim());
                    }
                });
            } else {
                if (_binding.getOperationSelector() == null) {
                    _binding.setCamelOperationSelector(CamelFactory.eINSTANCE.createCamelOperationSelectorType());
                }
                ((CamelOperationSelectorType) _binding.getCamelOperationSelector())
                        .setOperationName(_operationSelectionCombo.getText().trim());
            }
        }
        setHasChanged(false);
    }

    /**
     * @param target Passed in what we're dropping on
     */
    public void setTargetObject(Object target) {
        this._targetObj = target;
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (_binding != null && !inUpdate() && hasChanged()) {
            validate();
            handleModify((Control) e.getSource());
            fireChangedEvent((Control) e.getSource());
        } else {
            validate();
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
                        _operationSelectionCombo.setText(camelOpSelector.getOperationName());
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
