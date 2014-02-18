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
package org.switchyard.tools.ui.editor.components.jca;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.ObservableTracker;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
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
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;
import org.switchyard.tools.models.switchyard1_0.jca.Property;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.shared.TableColumnLayout;

/**
 * @author bfitzpat
 * 
 */
public abstract class JCAPropertyTable extends Composite {

    private TableViewer _propertyTreeTable;
    
    private Button _mAddButton;
    private Button _mRemoveButton;
    private boolean _isReadOnly = false;
    private EObject _targetObj = null;
    private ListenerList _changeListeners;
    
    private IObservableValue _bindingValue;

    /**
     * Constructor.
     * 
     * @param parent Composite parent
     * @param style any SWT style bits to pass along
     * @param toolkit Form toolkit to use when creating controls
     * @param context the data binding context
     * @param featurePathToProperties the feature path to the Property list
     * @param domain the editing domain
     */
    public JCAPropertyTable(Composite parent, int style, FormToolkit toolkit, DataBindingContext context,
            FeaturePath featurePathToProperties, EditingDomain domain) {
        this(parent, style, false, toolkit, context, featurePathToProperties, domain);
    }

    /**
     * Constructor.
     * 
     * @param parent composite parent
     * @param style any SWT style bits
     * @param isReadOnly boolean flag
     * @param toolkit Form toolkit to use when creating controls
     * @param context the data binding context
     * @param featurePathToProperties the feature path to the Property list
     * @param domain the editing domain
     */
    public JCAPropertyTable(Composite parent, int style, boolean isReadOnly, FormToolkit toolkit,
            DataBindingContext context, FeaturePath featurePathToProperties, EditingDomain domain) {
        super(parent, style);
        _isReadOnly = isReadOnly;
        _changeListeners = new ListenerList();

        _bindingValue = new WritableValue(SWTObservables.getRealm(getDisplay()), null, JCABinding.class);

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
        GridData gd11 = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 5);
        gd11.heightHint = 100;
        tableComposite.setLayoutData(gd11);

        TableColumnLayout tableLayout = new TableColumnLayout();
        tableComposite.setLayout(tableLayout);

        _propertyTreeTable = new TableViewer(tableComposite, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.FULL_SELECTION
                | additionalStyles);
        _propertyTreeTable.getTable().setHeaderVisible(true);

        TableViewerColumn nameColumn = new TableViewerColumn(_propertyTreeTable, SWT.LEFT);
        nameColumn.getColumn().setText(Messages.label_name);
        tableLayout.setColumnData(nameColumn.getColumn(), new ColumnWeightData(100, 150, true));

        TableViewerColumn valueColumn = new TableViewerColumn(_propertyTreeTable, SWT.LEFT);
        valueColumn.getColumn().setText(Messages.label_value);
        tableLayout.setColumnData(valueColumn.getColumn(), new ColumnWeightData(100, 150, true));

        IValueProperty nameProperty = domain == null ? EMFProperties.value(JcaPackage.Literals.PROPERTY__NAME)
                : EMFEditProperties.value(domain, JcaPackage.Literals.PROPERTY__NAME);
        IValueProperty valueProperty = domain == null ? EMFProperties.value(JcaPackage.Literals.PROPERTY__VALUE)
                : EMFEditProperties.value(domain, JcaPackage.Literals.PROPERTY__VALUE);
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

        _mAddButton = toolkit.createButton(this, Messages.button_add, SWT.NONE);
        _mAddButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
        _mAddButton.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent e) {
                addPropertyToList();
            }
        });

        _mAddButton.setEnabled(false);
        _propertyTreeTable.getTable().addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent e) {
                updatePropertyButtons();
            }
        });

        _mRemoveButton = toolkit.createButton(this, Messages.button_remove, SWT.NONE);
        _mRemoveButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
        _mRemoveButton.setEnabled(false);
        _mRemoveButton.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent e) {
                removeFromList();
            }
        });

        final IObservableList propertiesList = (domain == null ? EMFProperties.list(featurePathToProperties)
                : EMFEditProperties.list(domain, featurePathToProperties)).observeDetail(_bindingValue);
        _propertyTreeTable.setInput(propertiesList);

        updatePropertyButtons();
    }

    /**
     * Add a new property to the list
     */
    protected abstract void addPropertyToList();

    /**
     * Remove a property from the list
     */
    protected abstract void removeFromList();

    protected Property getTableSelection() {
        if (_propertyTreeTable != null && !_propertyTreeTable.getSelection().isEmpty()) {
            IStructuredSelection ssel = (IStructuredSelection) _propertyTreeTable.getSelection();
            if (ssel.getFirstElement() instanceof Property) {
                return (Property) ssel.getFirstElement();
            }
        }
        return null;
    }

    /**
     * Update button state based on what's selected.
     */
    public void updatePropertyButtons() {
        if (_isReadOnly) {
            _mAddButton.setEnabled(false);
            _mRemoveButton.setEnabled(false);

        } else {
            _mAddButton.setEnabled(true);
            if (getTableSelection() != null) {
                _mRemoveButton.setEnabled(true);
            }
        }
    }

    /**
     * If we changed, fire a changed event.
     * 
     * @param source
     */
    protected void fireChangedEvent(Object source) {
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
        _changeListeners.add(listener);
    }

    /**
     * Remove a change listener.
     * 
     * @param listener old listener
     */
    public void removeChangeListener(ChangeListener listener) {
        _changeListeners.remove(listener);
    }

    /**
     * @param target Passed in what we're dropping on
     */
    public void setTargetObject(EObject target) {
        _targetObj = target;
        _bindingValue.setValue(target);
    }

    protected EObject getTargetObject() {
        return _targetObj;
    }
    
    protected TableViewer getTableViewer() {
        return _propertyTreeTable;
    }
}
