/******************************************************************************* 
 * Copyright (c) 2013-2014 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package org.switchyard.tools.ui.editor.diagram.binding;

import java.util.Collection;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.ObservableTracker;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.CellEditorProperties;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapCellLabelProvider;
import org.eclipse.jface.databinding.viewers.ObservableValueEditingSupport;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.shared.TableColumnLayout;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class CamelAdditionalURIPropertyTable extends Composite {

    private TableViewer _propertyTreeTable;
    private Button _mAddButton;
    private Button _mRemoveButton;
    private boolean _isReadOnly = false;
    private EObject _targetObj = null;
    private ListenerList _changeListeners;
    private final EReference _parameterFeature;
    private final EReference _additionalUriParametersFeature;
    private final EClass _parameterType;
    private WritableValue _bindingValue;

    CamelAdditionalURIPropertyTable(Composite parent, int style, EReference additionalUriParametersFeature,
            EReference parameterFeature, EClass parameterType, DataBindingContext context) {
        this(parent, style, false, additionalUriParametersFeature, parameterFeature, parameterType, context);
    }

    CamelAdditionalURIPropertyTable(Composite parent, int style, boolean isReadOnly,
            EReference additionalUriParametersFeature, EReference parameterFeature, EClass parameterType,
            DataBindingContext context) {
        super(parent, style);
        final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(getTargetObject());
        this._isReadOnly = isReadOnly;
        this._changeListeners = new ListenerList();
        _additionalUriParametersFeature = additionalUriParametersFeature;
        _parameterFeature = parameterFeature;
        _parameterType = parameterType;

        int additionalStyles = SWT.NONE;
        if (isReadOnly) {
            additionalStyles = SWT.READ_ONLY;
        }

        final GridLayout gridLayout = new GridLayout();
        gridLayout.marginWidth = 0;
        gridLayout.marginHeight = 0;
        gridLayout.numColumns = 2;
        setLayout(gridLayout);

        Composite tableComposite = new Composite(this, additionalStyles);
        GridData gd11 = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 2);
        gd11.heightHint = 100;
        tableComposite.setLayoutData(gd11);

        _propertyTreeTable = new TableViewer(tableComposite, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.FULL_SELECTION
                | additionalStyles);
        _propertyTreeTable.getTable().setHeaderVisible(true);

        TableColumnLayout tableLayout = new TableColumnLayout();
        tableComposite.setLayout(tableLayout);

        TableViewerColumn nameColumn = new TableViewerColumn(_propertyTreeTable, SWT.LEFT);
        nameColumn.getColumn().setText(Messages.label_name);
        tableLayout.setColumnData(nameColumn.getColumn(), new ColumnWeightData(100, 150, true));

        TableViewerColumn valueColumn = new TableViewerColumn(_propertyTreeTable, SWT.LEFT);
        valueColumn.getColumn().setText(Messages.label_value);
        tableLayout.setColumnData(valueColumn.getColumn(), new ColumnWeightData(100, 150, true));

        // TODO: need to use EMFEditProperties if we're in an editing context
        IValueProperty nameProperty = domain == null ? EMFProperties
                .value(_parameterType.getEStructuralFeature("name")) : EMFEditProperties.value(domain,
                _parameterType.getEStructuralFeature("name"));
        IValueProperty valueProperty = domain == null ? EMFProperties.value(_parameterType
                .getEStructuralFeature("value")) : EMFEditProperties.value(domain,
                _parameterType.getEStructuralFeature("value"));
        IValueProperty cellEditorTextProperty = CellEditorProperties.control().value(WidgetProperties.text(SWT.Modify));

        final ObservableListContentProvider contentProvider;
        ObservableTracker.setIgnore(true);
        try {
            // ignore any observers created internally
            contentProvider = new ObservableListContentProvider();
        } finally {
            ObservableTracker.setIgnore(false);
        }

        nameColumn.setEditingSupport(ObservableValueEditingSupport.create(_propertyTreeTable, context, new TextCellEditor(_propertyTreeTable.getTable()), cellEditorTextProperty, nameProperty));
        nameColumn.setLabelProvider(new ObservableMapCellLabelProvider(nameProperty.observeDetail(contentProvider.getKnownElements())));

        valueColumn.setEditingSupport(ObservableValueEditingSupport.create(_propertyTreeTable, context, new TextCellEditor(_propertyTreeTable.getTable()), cellEditorTextProperty, valueProperty));
        valueColumn.setLabelProvider(new ObservableMapCellLabelProvider(valueProperty.observeDetail(contentProvider.getKnownElements())));

        _propertyTreeTable.setContentProvider(contentProvider);

        _mAddButton = new Button(this, SWT.NONE);
        _mAddButton.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, false, false));
        _mAddButton.setText(Messages.button_add);
        _mAddButton.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                addPropertyToList();
                fireChangedEvent(e.getSource());
            }
        });

        _mAddButton.setEnabled(false);

        _propertyTreeTable.getTable().addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                updatePropertyButtons();
            }
        });

        _mRemoveButton = new Button(this, SWT.NONE);
        _mRemoveButton.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, false, false));
        _mRemoveButton.setText(Messages.button_remove);
        _mRemoveButton.setEnabled(false);
        _mRemoveButton.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                removeFromList();
                fireChangedEvent(e.getSource());
            }
        });

        // set the input. we're observing a list on the binding value
        _bindingValue = new WritableValue(SWTObservables.getRealm(getDisplay()), null, Binding.class);
        _propertyTreeTable.setInput(EMFProperties.list(
                FeaturePath.fromList(_additionalUriParametersFeature, _parameterFeature)).observeDetail(_bindingValue));

        updatePropertyButtons();
    }

    /**
     * @param eObject incoming object to update
     * @param featureId feature to update
     * @param value value for feature
     * @throws Exception in case something can't be found
     */
    private void setFeatureValue(EObject eObject, String featureId, Object value) throws Exception {
        EClass eClass = eObject.eClass();
        for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
            EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
            if (eStructuralFeature.isChangeable()) {
                if (eStructuralFeature.getName().equalsIgnoreCase(featureId)) {
                    if (value != null) {
                        eObject.eSet(eStructuralFeature, value);
                    } else {
                        eObject.eUnset(eStructuralFeature);
                    }
                    return;
                }
            }
        }
        System.out.println("CamelAdditionalURIPropertyTable: Didn't find feature: " + featureId); //$NON-NLS-1$
        showFeatures(eObject);
        throw new Exception("CamelAdditionalURIPropertyTable:Feature ID (" + featureId + ") not found."); //$NON-NLS-1$ //$NON-NLS-2$
    }

    /**
     * Add a new property to the list
     */
    @SuppressWarnings({"unchecked", "rawtypes" })
    private void addPropertyToList() {
        if (getTargetObject() instanceof SwitchYardBindingType) {
            final SwitchYardBindingType baseCamel = (SwitchYardBindingType) getTargetObject();
            
            final EClass mappingsClass = _parameterFeature.getEReferenceType();
            final EObject mapping = mappingsClass.getEPackage().getEFactoryInstance().create(mappingsClass);
            try {
                setFeatureValue(mapping, "name", "property"); //$NON-NLS-1$ //$NON-NLS-2$
                setFeatureValue(mapping, "value", "value"); //$NON-NLS-1$ //$NON-NLS-2$
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
            if (baseCamel.eContainer() != null) {
                TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        Object variableContainer = baseCamel.eGet(_additionalUriParametersFeature);
                        if (variableContainer == null) {
                            final EClass variableContainerClass = _additionalUriParametersFeature.getEReferenceType();
                            variableContainer = variableContainerClass.getEPackage().getEFactoryInstance().create(variableContainerClass);
                            baseCamel.eSet(_additionalUriParametersFeature, variableContainer);
                        }
                        if (variableContainer instanceof EObject) {
                            final Object mappings = ((EObject) variableContainer).eGet(_parameterFeature);
                            if (mappings instanceof Collection) {
                                ((Collection) mappings).add(mapping);
                            }
                        }
                    }
                });
            } else {
                Object variableContainer = baseCamel.eGet(_additionalUriParametersFeature);
                if (variableContainer == null) {
                    final EClass variableContainerClass = _additionalUriParametersFeature.getEReferenceType();
                    variableContainer = variableContainerClass.getEPackage().getEFactoryInstance().create(variableContainerClass);
                    baseCamel.eSet(_additionalUriParametersFeature, variableContainer);
                }
                if (variableContainer instanceof EObject) {
                    final Object mappings = ((EObject) variableContainer).eGet(_parameterFeature);
                    if (mappings instanceof Collection) {
                        ((Collection) mappings).add(mapping);
                    }
                }
            }
            fireChangedEvent(this);
        }
    }

    /**
     * Remove a property from the list
     */
    @SuppressWarnings("rawtypes")
    private void removeFromList() {
        if (getTargetObject() instanceof SwitchYardBindingType) {
            final SwitchYardBindingType baseCamel = (SwitchYardBindingType) getTargetObject();
            final EObject actionToRemove = getTableSelection();
            if (baseCamel.eContainer() != null) {
                TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        final Object variableContainer = baseCamel.eGet(_additionalUriParametersFeature);
                        if (variableContainer instanceof EObject) {
                            final Object mappings = ((EObject) variableContainer).eGet(_parameterFeature);
                            if (mappings instanceof Collection) {
                                ((Collection) mappings).remove(actionToRemove);
                            }
                            if (((Collection)mappings).isEmpty()) {
                                baseCamel.eSet(_additionalUriParametersFeature, null);
                            }
                        }
                    }
                });
            } else {
                final Object variableContainer = baseCamel.eGet(_additionalUriParametersFeature);
                if (variableContainer instanceof EObject) {
                    final Object mappings = ((EObject) variableContainer).eGet(_parameterFeature);
                    if (mappings instanceof Collection) {
                        ((Collection) mappings).remove(actionToRemove);
                    }
                    if (((Collection)mappings).isEmpty()) {
                        baseCamel.eSet(_additionalUriParametersFeature, null);
                    }
                }
            }
            fireChangedEvent(this);
        }
    }

    private EObject getTableSelection() {
        if (_propertyTreeTable != null && !_propertyTreeTable.getSelection().isEmpty()) {
            IStructuredSelection ssel = (IStructuredSelection) _propertyTreeTable.getSelection();
            if (ssel.getFirstElement() instanceof EObject) {
                return (EObject) ssel.getFirstElement();
            }
        }
        return null;
    }

    private void updatePropertyButtons() {
        if (_isReadOnly) {
            this._mAddButton.setEnabled(false);
            this._mRemoveButton.setEnabled(false);

        } else {
            this._mAddButton.setEnabled(true);
            if (getTableSelection() != null) {
                _mRemoveButton.setEnabled(true);
            }
        }
    }

    private void fireChangedEvent(Object source) {
        ChangeEvent e = new ChangeEvent(source);
        // inform any listeners of the resize event
        Object[] listeners = this._changeListeners.getListeners();
        for (int i = 0; i < listeners.length; ++i) {
            ((ChangeListener) listeners[i]).stateChanged(e);
        }
    }

    /**
     * Add a change listener.
     * 
     * @param listener new listener
     */
    public void addChangeListener(ChangeListener listener) {
        this._changeListeners.add(listener);
    }

    /**
     * Remove a change listener.
     * 
     * @param listener old listener
     */
    public void removeChangeListener(ChangeListener listener) {
        this._changeListeners.remove(listener);
    }

    /**
     * @param target Passed in what we're dropping on
     */
    public void setTargetObject(EObject target) {
        _targetObj = target;
        _bindingValue.setValue(target);
        updatePropertyButtons();
    }

    private EObject getTargetObject() {
        return this._targetObj;
    }

    private void showFeatures(EObject eObject) {
        EClass eClass = eObject.eClass();
        for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
            EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
            if (eStructuralFeature.isChangeable()) {
                System.out.println("CamelAdditionalURIPropertyTable:Feature: " + eStructuralFeature.getName()); //$NON-NLS-1$
            }
        }
    }
}
