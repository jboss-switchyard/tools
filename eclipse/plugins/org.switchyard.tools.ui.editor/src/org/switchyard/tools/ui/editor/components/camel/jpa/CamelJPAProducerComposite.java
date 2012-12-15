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
import org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJPABindingType;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;

/**
 * @author bfitzpat
 * 
 */
public class CamelJPAProducerComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelJPABindingType _binding = null;
    private TabFolder _tabFolder;
    private List<String> _advancedPropsFilterList;
    private Text _entityClassNameText;
    private Text _persistenceUnitText;
    private Text _transcationManagerText;
    private Button _flushOnSendCheckbox;
    private Button _usePersistCheckbox;

    @Override
    public Binding getBinding() {
        return this._binding;
    }

    @Override
    public void setBinding(Binding impl) {
        if (impl instanceof CamelJPABindingType) {
            this._binding = (CamelJPABindingType) impl;
            setInUpdate(true);
            if (this._binding.getProduce() != null) {
                if (this._binding.getProduce().getFlushOnSend() != null) {
                    _flushOnSendCheckbox.setSelection(this._binding.getProduce().getFlushOnSend().booleanValue());
                }
                if (this._binding.getProduce().getUsePersist() != null) {
                    _usePersistCheckbox.setSelection(this._binding.getProduce().getUsePersist().booleanValue());
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
    protected boolean validate() {
        setErrorMessage(null);
        if (getBinding() != null) {
            if (_entityClassNameText.getText().trim().isEmpty()) {
                setErrorMessage("Entity Class Name may not be empty.");
            } else if (_entityClassNameText.getText().trim().isEmpty()) {
                setErrorMessage("Persistence Unit may not be empty.");
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
        one.setText("Producer");
        one.setControl(getProducerTabControl(_tabFolder));

        addTabs(_tabFolder);
    }

    private Control getProducerTabControl(TabFolder tabFolder) {
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

        Group producerGroup = new Group(composite, SWT.NONE);
        producerGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        producerGroup.setLayout(new GridLayout(2, false));
        producerGroup.setText("Producer Options");
        
        _flushOnSendCheckbox = createCheckbox(producerGroup, "Flush on Send");
        _usePersistCheckbox = createCheckbox(producerGroup, "Use Persist");

        return composite;
    }

    @Override
    public Composite getPanel() {
        return this._panel;
    }

    class ProduceOp extends ModelOperation {
        @Override
        public void run() throws Exception {
            if (_binding != null && _binding.getProduce() == null) {
                setFeatureValue(_binding, "produce", JpaFactory.eINSTANCE.createJpaProducerType());
            }
        }
    }

    protected void updateProduceFeature(String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new ProduceOp());
        ops.add(new BasicOperation("produce", featureId, value));
        wrapOperation(ops);
    }

    protected void handleModify(final Control control) {
        if (control.equals(_entityClassNameText)) {
            updateFeature(_binding, "entityClassName", _entityClassNameText.getText().trim());
        } else if (control.equals(_persistenceUnitText)) {
            updateFeature(_binding, "persistenceUnit", _persistenceUnitText.getText().trim());
        } else if (control.equals(_transcationManagerText)) {
            updateFeature(_binding, "transactionManager", _transcationManagerText.getText().trim());
        } else if (control.equals(_flushOnSendCheckbox)) {
            updateProduceFeature("flushOnSend", _flushOnSendCheckbox.getSelection());
        } else if (control.equals(_usePersistCheckbox)) {
            updateProduceFeature("usePersist", _usePersistCheckbox.getSelection());
        } else {
            super.handleModify(control);
        }
        validate();
        setHasChanged(false);
        setDidSomething(true);
    }

    protected void handleUndo(Control control) {
        if (_binding != null) {
            if (_binding != null) {
                if (control.equals(_entityClassNameText)) {
                    _entityClassNameText.setText(this._binding.getEntityClassName());
                } else if (control.equals(_persistenceUnitText)) {
                    _persistenceUnitText.setText(this._binding.getPersistenceUnit().toString());
                } else if (control.equals(_transcationManagerText)) {
                    _transcationManagerText.setText(this._binding.getTransactionManager());
                } else if (control.equals(_flushOnSendCheckbox)) {
                    _flushOnSendCheckbox.setSelection(this._binding.getProduce().getFlushOnSend().booleanValue());
                } else if (control.equals(_usePersistCheckbox)) {
                    _usePersistCheckbox.setSelection(this._binding.getProduce().getUsePersist().booleanValue());
                } else {
                    super.handleUndo(control);
                }
            }
        }
        setHasChanged(false);
    }

    @Override
    protected List<String> getAdvancedPropertiesFilterList() {
        if (_advancedPropsFilterList == null) {
            _advancedPropsFilterList = new ArrayList<String>();
        }
        return _advancedPropsFilterList;
    }

    @Override
    protected ContextMapperType createContextMapper() {
        return SwitchyardFactory.eINSTANCE.createContextMapperType();
    }

    @Override
    protected MessageComposerType createMessageComposer() {
        return SwitchyardFactory.eINSTANCE.createMessageComposerType();
    }

}
