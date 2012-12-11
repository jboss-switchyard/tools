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
package org.switchyard.tools.ui.editor.components.camel.jpa;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
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
import org.switchyard.tools.models.switchyard1_0.camel.CamelJPABindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;

/**
 * @author bfitzpat
 * 
 */
public class CamelJPAConsumerComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelJPABindingType _binding = null;
    private TabFolder _tabFolder;
    private List<String> _advancedPropsFilterList;
    private Text _entityClassNameText;
    private Text _persistenceUnitText;
    private Text _transcationManagerText;
    private Button _deleteCheckbox;
    private Button _lockEntityCheckbox;
    private Text _maximumResultsText;
    private Text _queryText;
    private Text _namedQueryText;
    private Text _nativeQueryText;
    private Text _resultClassText;
    private Button _transactedCheckbox;

    @Override
    public Binding getBinding() {
        return this._binding;
    }

    @Override
    public void setBinding(Binding impl) {
        if (impl instanceof CamelJPABindingType) {
            this._binding = (CamelJPABindingType) impl;
            setInUpdate(true);
            if (this._binding.getConsume() != null) {
                if (this._binding.getConsume().getConsumeDelete() != null) {
                    _deleteCheckbox.setSelection(this._binding.getConsume().getConsumeDelete().booleanValue());
                }
                if (this._binding.getConsume().getConsumeLockEntity() != null) {
                    _lockEntityCheckbox.setSelection(this._binding.getConsume().getConsumeLockEntity().booleanValue());
                }
                if (this._binding.getConsume().getMaximumResults() != null) {
                    _maximumResultsText.setText(this._binding.getConsume().getMaximumResults().toString());
                }
                if (this._binding.getConsume().getConsumerQuery() != null) {
                    _queryText.setText(this._binding.getConsume().getConsumerQuery());
                }
                if (this._binding.getConsume().getConsumerNamedQuery() != null) {
                    _namedQueryText.setText(this._binding.getConsume().getConsumerNamedQuery());
                }
                if (this._binding.getConsume().getConsumerNativeQuery() != null) {
                    _nativeQueryText.setText(this._binding.getConsume().getConsumerNativeQuery());
                }
                if (this._binding.getConsume().getConsumerResultClass() != null) {
                    _resultClassText.setText(this._binding.getConsume().getConsumerResultClass());
                }
                if (this._binding.getConsume().getConsumerTransacted() != null) {
                    _transactedCheckbox.setSelection(this._binding.getConsume().getConsumerTransacted().booleanValue());
                }
            }
            if (this._binding.getEntityClassName() != null) {
                _entityClassNameText.setText(this._binding.getEntityClassName());
            }
            if (this._binding.getPersistenceUnit() != null) {
                _persistenceUnitText.setText(this._binding.getPersistenceUnit().toString());
            }
            if (this._binding.getTransactionManager() != null) {
                _transcationManagerText.setText(this._binding.getTransactionManager());
            }

            super.setTabsBinding(_binding);
            setInUpdate(false);
            validate();
        } else {
            this._binding = null;
        }
        addObservableListeners();
    }

    @Override
    public void setTargetObject(Object target) {
        super.setTargetObject(target);
    }

    @Override
    protected boolean validate() {
        setErrorMessage(null);
        if (getBinding() != null) {
            if (_entityClassNameText.getText().trim().isEmpty()) {
                setErrorMessage("Entity Class Name may not be empty.");
            } else if (_entityClassNameText.getText().trim().isEmpty()) {
                setErrorMessage("Persistence Unit may not be empty.");
            } else if (!_maximumResultsText.getText().trim().isEmpty()) {
                try {
                    new Integer(_maximumResultsText.getText().trim());
                } catch (NumberFormatException nfe) {
                    setErrorMessage("Maximum Results must be a valid number.");
                }
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
        one.setText("Consumer");
        one.setControl(getConsumerTabControl(_tabFolder));

        addTabs(_tabFolder);
    }

    private Control getConsumerTabControl(TabFolder tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(1, false);
        composite.setLayout(gl);

        Group jpaGroup = new Group(composite, SWT.NONE);
        jpaGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        jpaGroup.setLayout(new GridLayout(2, false));
        jpaGroup.setText("JPA Options");

        _entityClassNameText = createLabelAndText(jpaGroup, "Entity Class Name");
        _persistenceUnitText = createLabelAndText(jpaGroup, "Persistence Unit");
        _transcationManagerText = createLabelAndText(jpaGroup, "Transaction Manager");

        Group consumeGroup = new Group(composite, SWT.NONE);
        consumeGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        consumeGroup.setLayout(new GridLayout(2, false));
        consumeGroup.setText("Consumer Options");

        _deleteCheckbox = createCheckbox(consumeGroup, "Delete");
        _lockEntityCheckbox = createCheckbox(consumeGroup, "Lock Entity");
        _maximumResultsText = createLabelAndText(consumeGroup, "Maximum Results");
        _queryText = createLabelAndText(consumeGroup, "Query");
        _namedQueryText = createLabelAndText(consumeGroup, "Named Query");
        _nativeQueryText = createLabelAndText(consumeGroup, "Native Query");
        _resultClassText = createLabelAndText(consumeGroup, "Result Class");
        _transactedCheckbox = createCheckbox(consumeGroup, "Transacted");

        return composite;
    }

    @Override
    public Composite getPanel() {
        return this._panel;
    }

    class ConsumeOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getConsume() == null) {
                setFeatureValue(_binding, "consume", CamelFactory.eINSTANCE.createJpaConsumerType());
            }
        }
    }

    protected void updateConsumeFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new ConsumeOp());
        ops.add(new BasicOperation("consume", featureId, value));
        wrapOperation(ops);
    }

    protected void handleModify(final Control control) {
        if (control.equals(_entityClassNameText)) {
            updateFeature(_binding, "entityClassName", _entityClassNameText.getText().trim());
        } else if (control.equals(_persistenceUnitText)) {
            updateFeature(_binding, "persistenceUnit", _persistenceUnitText.getText().trim());
        } else if (control.equals(_transcationManagerText)) {
            updateFeature(_binding, "transactionManager", _transcationManagerText.getText().trim());
        } else if (control.equals(_deleteCheckbox)) {
            updateConsumeFeature("consumeDelete", _deleteCheckbox.getSelection());
        } else if (control.equals(_lockEntityCheckbox)) {
            updateConsumeFeature("consumeLockEntity", _lockEntityCheckbox.getSelection());
        } else if (control.equals(_maximumResultsText)) {
            try {
                Integer port = new Integer(_maximumResultsText.getText().trim());
                updateConsumeFeature("maximumResults", port.intValue());
            } catch (NumberFormatException nfe) {
                // ignore
                nfe.fillInStackTrace();
            }
        } else if (control.equals(_queryText)) {
            updateConsumeFeature("consumerQuery", _queryText.getText().trim());
        } else if (control.equals(_namedQueryText)) {
            updateConsumeFeature("consumerNamedQuery", _namedQueryText.getText().trim());
        } else if (control.equals(_nativeQueryText)) {
            updateConsumeFeature("consumerNativeQuery", _nativeQueryText.getText().trim());
        } else if (control.equals(_resultClassText)) {
            updateConsumeFeature("consumerResultClass", _resultClassText.getText().trim());
        } else if (control.equals(_transactedCheckbox)) {
            updateConsumeFeature("consumerTransacted", _transactedCheckbox.getSelection());
        } else {
            super.handleModify(control);
        }
        validate();
        setHasChanged(false);
        setDidSomething(true);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (control.equals(_entityClassNameText)) {
                _entityClassNameText.setText(this._binding.getEntityClassName());
            } else if (control.equals(_persistenceUnitText)) {
                _persistenceUnitText.setText(this._binding.getPersistenceUnit().toString());
            } else if (control.equals(_transcationManagerText)) {
                _transcationManagerText.setText(this._binding.getTransactionManager());
            } else if (control.equals(_deleteCheckbox)) {
                _deleteCheckbox.setSelection(this._binding.getConsume().getConsumeDelete().booleanValue());
            } else if (control.equals(_lockEntityCheckbox)) {
                _lockEntityCheckbox.setSelection(this._binding.getConsume().getConsumeLockEntity().booleanValue());
            } else if (control.equals(_maximumResultsText)) {
                _maximumResultsText.setText(this._binding.getConsume().getMaximumResults().toString());
            } else if (control.equals(_queryText)) {
                _queryText.setText(this._binding.getConsume().getConsumerQuery());
            } else if (control.equals(_namedQueryText)) {
                _namedQueryText.setText(this._binding.getConsume().getConsumerNamedQuery());
            } else if (control.equals(_nativeQueryText)) {
                _nativeQueryText.setText(this._binding.getConsume().getConsumerNativeQuery());
            } else if (control.equals(_resultClassText)) {
                _resultClassText.setText(this._binding.getConsume().getConsumerResultClass());
            } else if (control.equals(_transactedCheckbox)) {
                _transactedCheckbox.setSelection(this._binding.getConsume().getConsumerTransacted().booleanValue());
            } else {
                super.handleUndo(control);
            }
        }
        setHasChanged(false);
    }

    @Override
    protected List<String> getAdvancedPropertiesFilterList() {
        if (_advancedPropsFilterList == null) {
            _advancedPropsFilterList = new ArrayList<String>();
            _advancedPropsFilterList.add("maxMessagesPerPoll");
            _advancedPropsFilterList.add("initialDelay");
            _advancedPropsFilterList.add("delay");
            _advancedPropsFilterList.add("useFixedDelay");
            _advancedPropsFilterList.add("sendEmptyMessageWhenIdle");
            _advancedPropsFilterList.add("timeUnit");
        }
        return _advancedPropsFilterList;
    }

    @Override
    protected ContextMapperType createContextMapper() {
        return CamelFactory.eINSTANCE.createCamelContextMapperType();
    }

    @Override
    protected MessageComposerType createMessageComposer() {
        return CamelFactory.eINSTANCE.createCamelMessageComposerType();
    }

}
