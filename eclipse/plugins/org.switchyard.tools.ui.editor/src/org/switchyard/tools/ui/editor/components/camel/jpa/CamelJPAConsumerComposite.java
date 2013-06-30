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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.model.merge.MergedModelUtil;
import org.switchyard.tools.ui.editor.util.PropTypeUtil;

/**
 * @author bfitzpat
 * 
 */
public class CamelJPAConsumerComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelJpaBindingType _binding = null;
    private TabFolder _tabFolder;
    private List<String> _advancedPropsFilterList;
    private Text _entityClassNameText;
    private Button _browseEntityClassButton;
    private Text _persistenceUnitText;
    private Text _transcationManagerText;
    private Button _deleteCheckbox;
    private Button _lockEntityCheckbox;
    private Text _maximumResultsText;
    private Text _queryText;
    private Text _namedQueryText;
    private Text _nativeQueryText;
    private Button _transactedCheckbox;
    private IJavaProject _project;

    @Override
    public Binding getBinding() {
        return this._binding;
    }

    @Override
    public void setBinding(Binding impl) {
        if (impl instanceof CamelJpaBindingType) {
            this._binding = (CamelJpaBindingType) impl;
            setInUpdate(true);
            if (this._binding.getConsume() != null) {
                _deleteCheckbox.setSelection(this._binding.getConsume().isConsumeDelete());
                _lockEntityCheckbox.setSelection(this._binding.getConsume().isConsumeLockEntity());
                if (this._binding.getConsume().isSetMaximumResults()) {
                    setTextValue(_maximumResultsText, PropTypeUtil.getPropValueString(this._binding.getConsume().getMaximumResults()));
                } else {
                    _maximumResultsText.setText("");
                }
                if (this._binding.getConsume().getConsumerQuery() != null) {
                    _queryText.setText(this._binding.getConsume().getConsumerQuery());
                } else {
                    _queryText.setText("");
                }
                if (this._binding.getConsume().getConsumerNamedQuery() != null) {
                    _namedQueryText.setText(this._binding.getConsume().getConsumerNamedQuery());
                } else {
                    _namedQueryText.setText("");
                }
                if (this._binding.getConsume().getConsumerNativeQuery() != null) {
                    _nativeQueryText.setText(this._binding.getConsume().getConsumerNativeQuery());
                } else {
                    _nativeQueryText.setText("");
                }
                _transactedCheckbox.setSelection(this._binding.getConsume().isConsumerTransacted());
            }
            if (this._binding.getEntityClassName() != null) {
                _entityClassNameText.setText(this._binding.getEntityClassName());
            } else {
                _entityClassNameText.setText("");
            }
            if (this._binding.getPersistenceUnit() != null) {
                _persistenceUnitText.setText(this._binding.getPersistenceUnit().toString());
            } else {
                _persistenceUnitText.setText("");
            }
            if (this._binding.getTransactionManager() != null) {
                _transcationManagerText.setText(this._binding.getTransactionManager());
            } else {
                _transcationManagerText.setText("");
            }

            final Resource resource = MergedModelUtil.getSwitchYard((EObject) getTargetObject()).eResource();
            if (resource.getURI().isPlatformResource()) {
                final IFile file = ResourcesPlugin.getWorkspace().getRoot()
                        .getFile(new Path(resource.getURI().toPlatformString(true)));
                if (file != null) {
                    _project = JavaCore.create(file.getProject());
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
//            } else if (!_maximumResultsText.getText().trim().isEmpty()) {
//                try {
//                    new Integer(_maximumResultsText.getText().trim());
//                } catch (NumberFormatException nfe) {
//                    setErrorMessage("Maximum Results must be a valid number.");
//                }
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
        jpaGroup.setLayout(new GridLayout(3, false));
        jpaGroup.setText("JPA Options");

        _entityClassNameText = createLabelAndText(jpaGroup, "Entity Class Name");

        _browseEntityClassButton = new Button(jpaGroup, SWT.PUSH);
        _browseEntityClassButton.setText("Browse...");
        GridData btnGD = new GridData();
        _browseEntityClassButton.setLayoutData(btnGD);
        _browseEntityClassButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                String newClass = handleBrowse(_entityClassNameText.getText());
                if (newClass != null) {
                    _entityClassNameText.setText(newClass);
                    setHasChanged(true);
                    handleModify(_entityClassNameText);
                    fireChangedEvent(_entityClassNameText);
                }
            }
        });

        _persistenceUnitText = createLabelAndText(jpaGroup, "Persistence Unit");
        addGridData(_persistenceUnitText, 2, GridData.FILL_HORIZONTAL);
        
        _transcationManagerText = createLabelAndText(jpaGroup, "Transaction Manager");
        addGridData(_transcationManagerText, 2, GridData.FILL_HORIZONTAL);

        Group consumeGroup = new Group(composite, SWT.NONE);
        consumeGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        consumeGroup.setLayout(new GridLayout(3, false));
        consumeGroup.setText("Consumer Options");

        _deleteCheckbox = createCheckbox(consumeGroup, "Delete");
        addGridData(_deleteCheckbox, 3, GridData.FILL_HORIZONTAL);
        _lockEntityCheckbox = createCheckbox(consumeGroup, "Lock Entity");
        addGridData(_lockEntityCheckbox, 3, GridData.FILL_HORIZONTAL);
        _maximumResultsText = createLabelAndText(consumeGroup, "Maximum Results");
        addGridData(_maximumResultsText, 2, GridData.FILL_HORIZONTAL);
        _queryText = createLabelAndText(consumeGroup, "Query");
        addGridData(_queryText, 2, GridData.FILL_HORIZONTAL);
        _namedQueryText = createLabelAndText(consumeGroup, "Named Query");
        addGridData(_namedQueryText, 2, GridData.FILL_HORIZONTAL);
        _nativeQueryText = createLabelAndText(consumeGroup, "Native Query");
        addGridData(_nativeQueryText, 2, GridData.FILL_HORIZONTAL);
        _transactedCheckbox = createCheckbox(consumeGroup, "Transacted");
        addGridData(_transactedCheckbox, 3, GridData.FILL_HORIZONTAL);

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
                setFeatureValue(_binding, "consume", JpaFactory.eINSTANCE.createJpaConsumerType());
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
                updateConsumeFeature("maximumResults", _maximumResultsText.getText().trim());
            }
        } else if (control.equals(_queryText)) {
            updateConsumeFeature("consumerQuery", _queryText.getText().trim());
        } else if (control.equals(_namedQueryText)) {
            updateConsumeFeature("consumerNamedQuery", _namedQueryText.getText().trim());
        } else if (control.equals(_nativeQueryText)) {
            updateConsumeFeature("consumerNativeQuery", _nativeQueryText.getText().trim());
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
                _deleteCheckbox.setSelection(this._binding.getConsume().isConsumeDelete());
            } else if (control.equals(_lockEntityCheckbox)) {
                _lockEntityCheckbox.setSelection(this._binding.getConsume().isConsumeLockEntity());
            } else if (control.equals(_maximumResultsText)) {
                setTextValue(_maximumResultsText, PropTypeUtil.getPropValueString(this._binding.getConsume().getMaximumResults()));
            } else if (control.equals(_queryText)) {
                _queryText.setText(this._binding.getConsume().getConsumerQuery());
            } else if (control.equals(_namedQueryText)) {
                _namedQueryText.setText(this._binding.getConsume().getConsumerNamedQuery());
            } else if (control.equals(_nativeQueryText)) {
                _nativeQueryText.setText(this._binding.getConsume().getConsumerNativeQuery());
            } else if (control.equals(_transactedCheckbox)) {
                _transactedCheckbox.setSelection(this._binding.getConsume().isConsumerTransacted());
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
            _advancedPropsFilterList.add("consumerResultClass");
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

    private String handleBrowse(String filter) {
        IJavaSearchScope scope = null;
        if (_project == null) {
            scope = SearchEngine.createWorkspaceScope();
        } else {
            scope = SearchEngine.createJavaSearchScope(new IJavaElement[] {_project });
        }
        try {
            SelectionDialog dialog = JavaUI.createTypeDialog(Display.getCurrent().getActiveShell(), null, scope,
                    IJavaElementSearchConstants.CONSIDER_CLASSES, false, filter.isEmpty() ? "* " : filter);
            if (dialog.open() == SelectionDialog.OK) {
                Object[] result = dialog.getResult();
                if (result.length > 0 && result[0] instanceof IType) {
                    return ((IType) result[0]).getFullyQualifiedName();
                }
            }
        } catch (JavaModelException e) {
            e.printStackTrace();
        }
        return null;
    }
}
