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

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.camel.sql.CamelSqlBindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorComposite;
import org.switchyard.tools.ui.editor.diagram.binding.OperationSelectorUtil;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.util.PropTypeUtil;

/**
 * @author bfitzpat
 * 
 */
public class CamelSQLComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelSqlBindingType _binding = null;
    private Text _nameText;
    private Text _queryText;
    private Text _dataSourceRefText;
    private Text _placeholderText;
    private OperationSelectorComposite _opSelectorComposite;
    private Text _periodText;
    private Text _initialDelayText;

    @Override
    public String getTitle() {
        return Messages.title_sqlBindingDetails;
    }

    @Override
    public String getDescription() {
        return Messages.description_sqlBindingDetails;
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof CamelSqlBindingType) {
            this._binding = (CamelSqlBindingType) impl;
            setInUpdate(true);
            if (this._binding.getQuery() != null) {
                _queryText.setText(this._binding.getQuery());
            } else {
                _queryText.setText(""); //$NON-NLS-1$
            }
            if (this._binding.getDataSourceRef() != null) {
                _dataSourceRefText.setText(this._binding.getDataSourceRef());
            } else {
                _dataSourceRefText.setText(""); //$NON-NLS-1$
            }
            if (this._binding.getPlaceholder() != null && _placeholderText != null) {
                _placeholderText.setText(this._binding.getPlaceholder());
            } else if (_placeholderText != null) {
                _placeholderText.setText(""); //$NON-NLS-1$
            }
            if (this._binding.getInitialDelay() != null && _initialDelayText != null) {
                setTextValue(_initialDelayText, PropTypeUtil.getPropValueString(this._binding.getInitialDelay()));
            } else if (_initialDelayText != null) {
                _initialDelayText.setText(""); //$NON-NLS-1$
            }
            if (this._binding.getPeriod() != null && _periodText != null) {
                _periodText.setText(this._binding.getPeriod());
            } else if (_periodText != null) {
                _periodText.setText(""); //$NON-NLS-1$
            }
            if (_binding.getName() == null) {
                _nameText.setText(""); //$NON-NLS-1$
            } else {
                _nameText.setText(_binding.getName());
            }
            
            if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed()) {
                OperationSelectorType opSelector = OperationSelectorUtil.getFirstOperationSelector(this._binding);
                _opSelectorComposite.setBinding(this._binding);
                _opSelectorComposite.setOperation((SwitchYardOperationSelectorType) opSelector);
            }

            setInUpdate(false);
            validate();
        } else {
            this._binding = null;
        }
        addObservableListeners();
    }

    @Override
    public void setTargetObject(EObject target) {
        super.setTargetObject(target);
        if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed()) {
            _opSelectorComposite.setTargetObject((EObject) target);
        }
    }

    @Override
    protected boolean validate() {
        setErrorMessage(null);
        if (getBinding() != null) {
            if (_queryText.getText().trim().isEmpty()) {
                setErrorMessage(Messages.error_emptyQuery);
                return false;
            }
            if (_dataSourceRefText.getText().trim().isEmpty()) {
                setErrorMessage(Messages.error_emptyDataSourceReference);
                return false;
            }
        }
        return (getErrorMessage() == null);
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getSQLTabControl(_panel);

        if (getTargetObject() != null && getTargetObject() instanceof Service) {
            if (_opSelectorComposite != null && !_opSelectorComposite.isDisposed()) {
                _opSelectorComposite.setTargetObject((EObject) getTargetObject());
            }
        }
    }

    private Control getSQLTabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        composite.setLayout(gl);

        _nameText = createLabelAndText(composite, Messages.label_name);

        _queryText = createLabelAndText(composite, Messages.label_queryStar);
        _dataSourceRefText = createLabelAndText(composite, Messages.label_dataSourceStar);
        _periodText = createLabelAndText(composite, Messages.label_period);
        if (getTargetObject() instanceof Service) {
            _initialDelayText = createLabelAndText(composite, Messages.label_initialDelay);
        }

        if (getTargetObject() instanceof Service) {
            _opSelectorComposite = new OperationSelectorComposite(composite, SWT.NONE);
            _opSelectorComposite.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
            _opSelectorComposite.setLayout(new GridLayout(2, false));
            _opSelectorComposite.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    handleModify(_opSelectorComposite);
                }
             });
        }

        return composite;
    }

    @Override
    public Composite getPanel() {
        return this._panel;
    }

    class CamelOperationSelectorOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding.getOperationSelector() == null) {
                setFeatureValue(_binding, "operationSelector", SwitchyardFactory.eINSTANCE.createStaticOperationSelectorType()); //$NON-NLS-1$
            }
        }
    }

    protected void handleModify(final Control control) {
        if (control.equals(_queryText)) {
            updateFeature(_binding, "query", _queryText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_dataSourceRefText)) {
            updateFeature(_binding, "dataSourceRef", _dataSourceRefText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_placeholderText)) {
            updateFeature(_binding, "placeholder", _placeholderText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_periodText)) {
            updateFeature(_binding, "period", _periodText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_initialDelayText)) {
            updateFeature(_binding, "initialDelay", _initialDelayText.getText().trim()); //$NON-NLS-1$
        } else if (control.equals(_opSelectorComposite)) {
            int opType = _opSelectorComposite.getSelectedOperationSelectorType();
            updateOperationSelectorFeature(opType, _opSelectorComposite.getSelectedOperationSelectorValue());
            fireChangedEvent(_opSelectorComposite);
        } else if (control.equals(_nameText)) {
            super.updateFeature(_binding, "name", _nameText.getText().trim()); //$NON-NLS-1$
        }
        super.handleModify(control);
        validate();
        setHasChanged(false);
        setDidSomething(true);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (control.equals(_queryText)) {
                _queryText.setText(this._binding.getQuery());
            } else if (control.equals(_dataSourceRefText)) {
                _dataSourceRefText.setText(this._binding.getDataSourceRef());
            } else if (control.equals(_placeholderText)) {
                _placeholderText.setText(this._binding.getPlaceholder());
            } else if (control.equals(_periodText)) {
                _periodText.setText(PropTypeUtil.getPropValueString(this._binding.getPeriod()));
            } else if (control.equals(_initialDelayText)) {
                _initialDelayText.setText(PropTypeUtil.getPropValueString(this._binding.getInitialDelay()));
//            } else if (control.equals(_operationSelectionCombo)) {
//                String opName = OperationSelectorUtil.getOperationNameForStaticOperationSelector(this._binding);
//                setTextValue(_operationSelectionCombo, opName);
            } else if (control.equals(_nameText)) {
                _nameText.setText(_binding.getName() == null ? "" : _binding.getName()); //$NON-NLS-1$
            } else {
                super.handleUndo(control);
            }
        }
        setHasChanged(false);
    }
    
}
