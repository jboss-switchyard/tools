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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJpaBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.JpaFactory;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.model.merge.MergedModelUtil;

/**
 * @author bfitzpat
 * 
 */
public class CamelJPAProducerComposite extends AbstractSYBindingComposite {

    private Composite _panel;
    private CamelJpaBindingType _binding = null;
    private Text _nameText;
    private Text _entityClassNameText;
    private Button _browseEntityClassButton;
    private Text _persistenceUnitText;
    private Text _transcationManagerText;
    private Button _flushOnSendCheckbox;
    private Button _usePersistCheckbox;
    private IJavaProject _project;

    @Override
    public String getTitle() {
        return "JPA Binding Details";
    }

    @Override
    public String getDescription() {
        return "Specify pertinent details for your JPA Binding.";
    }

    @Override
    public void setBinding(Binding impl) {
        super.setBinding(impl);
        if (impl instanceof CamelJpaBindingType) {
            this._binding = (CamelJpaBindingType) impl;
            setInUpdate(true);
            if (this._binding.getProduce() != null) {
                _flushOnSendCheckbox.setSelection(this._binding.getProduce().isFlushOnSend());
                _usePersistCheckbox.setSelection(this._binding.getProduce().isUsePersist());
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
            if (_binding.getName() == null) {
                _nameText.setText("");
            } else {
                _nameText.setText(_binding.getName());
            }
            final Resource resource = MergedModelUtil.getSwitchYard((EObject) getTargetObject()).eResource();
            if (resource.getURI().isPlatformResource()) {
                final IFile file = ResourcesPlugin.getWorkspace().getRoot()
                        .getFile(new Path(resource.getURI().toPlatformString(true)));
                if (file != null) {
                    _project = JavaCore.create(file.getProject());
                }
            }
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
        return (getErrorMessage() == null);
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());

        getProducerTabControl(_panel);
    }

    private Control getProducerTabControl(Composite tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(3, false);
        composite.setLayout(gl);

        _nameText = createLabelAndText(composite, "Name");
        _nameText.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));

        _entityClassNameText = createLabelAndText(composite, "Entity Class Name");
        _browseEntityClassButton = new Button(composite, SWT.PUSH);
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

        _persistenceUnitText = createLabelAndText(composite, "Persistence Unit");
        addGridData(_persistenceUnitText, 2, GridData.FILL_HORIZONTAL);
        
        _transcationManagerText = createLabelAndText(composite, "Transaction Manager");
        addGridData(_transcationManagerText, 2, GridData.FILL_HORIZONTAL);

        Group producerGroup = new Group(composite, SWT.NONE);
        producerGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
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
        } else if (control.equals(_nameText)) {
            super.updateFeature(_binding, "name", _nameText.getText().trim());
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
                    _flushOnSendCheckbox.setSelection(this._binding.getProduce().isFlushOnSend());
                } else if (control.equals(_usePersistCheckbox)) {
                    _usePersistCheckbox.setSelection(this._binding.getProduce().isUsePersist());
                } else if (control.equals(_nameText)) {
                    _nameText.setText(_binding.getName() == null ? "" : _binding.getName());
                } else {
                    super.handleUndo(control);
                }
            }
        }
        setHasChanged(false);
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
