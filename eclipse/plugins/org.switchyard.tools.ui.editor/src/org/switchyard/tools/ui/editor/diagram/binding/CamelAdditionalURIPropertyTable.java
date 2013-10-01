/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
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
package org.switchyard.tools.ui.editor.diagram.binding;

import java.util.Collection;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.shared.TableColumnLayout;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class CamelAdditionalURIPropertyTable extends Composite implements ICellModifier {

    private class PropertyTreeContentProvider implements IStructuredContentProvider {

        @Override
        public void dispose() {
        }

        @Override
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        }

        @Override
        public Object[] getElements(Object inputElement) {
            if (inputElement instanceof EObject) {
                final EObject object = (EObject) inputElement;
                final Object variableContainer = object.eGet(_actionVariableFeature);
                if (variableContainer instanceof EObject) {
                    final Object mappings = ((EObject) variableContainer).eGet(_mappingsFeature);
                    if (mappings instanceof Collection<?>) {
                        return ((Collection<?>) mappings).toArray();
                    }
                }
            }
            return new Object[0];
        }
    }

    private class PropertyTreeLabelProvider implements ITableLabelProvider {
        @Override
        public void addListener(ILabelProviderListener listener) {
        }

        @Override
        public void dispose() {
        }

        @Override
        public boolean isLabelProperty(Object element, String property) {
            if (element.getClass().isAssignableFrom(_parameterType.getInstanceClass()) && property.equalsIgnoreCase(NAME_COLUMN)) {
                return true;
            } else if (element.getClass().isAssignableFrom(_parameterType.getInstanceClass()) && property.equalsIgnoreCase(VALUE_COLUMN)) {
                return true;
            }
            return false;
        }

        @Override
        public void removeListener(ILabelProviderListener listener) {
        }

        @Override
        public Image getColumnImage(Object element, int columnIndex) {
            return null;
        }

        @Override
        public String getColumnText(Object element, int columnIndex) {
            Class<? extends Object> elementClass = element.getClass();
            Class<?> instanceClass = _parameterType.getInstanceClass();
            boolean rightClass = instanceClass.isAssignableFrom(elementClass);
            if (rightClass && columnIndex == 0) {
                return (String) getFeatureValue((EObject) element, "name"); //$NON-NLS-1$
            } else if (rightClass && columnIndex == 1) {
                return (String) getFeatureValue((EObject) element, "value"); //$NON-NLS-1$
            }
            return null;
        }
    }

    private TableViewer _propertyTreeTable;

    /**
     * Value column.
     */
    public static final String NAME_COLUMN = "name"; //$NON-NLS-1$
    /**
     * Entry point column.
     */
    public static final String VALUE_COLUMN = "value"; //$NON-NLS-1$

    private static final String[] TREE_COLUMNS = new String[] {NAME_COLUMN, VALUE_COLUMN };

    private Button _mAddButton;
    private Button _mRemoveButton;
    private boolean _isReadOnly = false;
    private EObject _targetObj = null;
    private String _mWarning = null;
    private ListenerList _changeListeners;
    private final EReference _mappingsFeature;
    private final EReference _actionVariableFeature;
    private final EClass _parameterType;

    /**
     * Constructor.
     * 
     * @param parent Composite parent
     * @param style any SWT style bits to pass along
     * @param actionVariableFeature blah
     * @param mappingsFeature blah
     * @param parameterType blah
     */
    public CamelAdditionalURIPropertyTable(Composite parent, int style, EReference actionVariableFeature, EReference mappingsFeature, EClass parameterType) {
        this(parent, style, false, actionVariableFeature, mappingsFeature, parameterType);
    }

    /**
     * Constructor.
     * 
     * @param parent composite parent
     * @param style any SWT style bits
     * @param isReadOnly boolean flag
     * @param actionVariableFeature blah
     * @param mappingsFeature blah
     * @param parameterType blah
     */
    public CamelAdditionalURIPropertyTable(Composite parent, int style, boolean isReadOnly, EReference actionVariableFeature, EReference mappingsFeature, EClass parameterType) {
        super(parent, style);
        this._isReadOnly = isReadOnly;
        this._changeListeners = new ListenerList();
        _actionVariableFeature = actionVariableFeature;
        _mappingsFeature = mappingsFeature;
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

        TableColumn nameColumn = new TableColumn(_propertyTreeTable.getTable(), SWT.LEFT);
        nameColumn.setText(Messages.label_name);
        tableLayout.setColumnData(nameColumn, new ColumnWeightData(100, 150, true));
        TableColumn valueColumn = new TableColumn(_propertyTreeTable.getTable(), SWT.LEFT);
        valueColumn.setText(Messages.label_value);
        tableLayout.setColumnData(valueColumn, new ColumnWeightData(100, 150, true));

        _propertyTreeTable.setColumnProperties(TREE_COLUMNS);

        _propertyTreeTable.setLabelProvider(new PropertyTreeLabelProvider());

        _propertyTreeTable.setContentProvider(new PropertyTreeContentProvider());

        _propertyTreeTable.setCellModifier(this);
        _propertyTreeTable.setCellEditors(new CellEditor[] {new TextCellEditor(_propertyTreeTable.getTable()),
                new TextCellEditor(_propertyTreeTable.getTable()) });

        _mAddButton = new Button(this, SWT.NONE);
        _mAddButton.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, false, false));
        _mAddButton.setText(Messages.button_add);
        _mAddButton.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                addPropertyToList();
                if (_propertyTreeTable.getInput() == null) {
                    _propertyTreeTable.setInput(_targetObj);
                }
                _propertyTreeTable.refresh();
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
                _propertyTreeTable.refresh();
                fireChangedEvent(e.getSource());
            }
        });

        updatePropertyButtons();
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    @Override
    protected void checkSubclass() {
        // empty
    }

    /**
     * @param eObject incoming object to update
     * @param featureId feature to update
     * @param value value for feature
     * @throws Exception in case something can't be found
     */
    public void setFeatureValue(EObject eObject, String featureId, Object value) throws Exception {
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
    protected void addPropertyToList() {
        if (getTargetObject() instanceof SwitchYardBindingType) {
            final SwitchYardBindingType baseCamel = (SwitchYardBindingType) getTargetObject();
            
            final EClass mappingsClass = _mappingsFeature.getEReferenceType();
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
                        Object variableContainer = baseCamel.eGet(_actionVariableFeature);
                        if (variableContainer == null) {
                            final EClass variableContainerClass = _actionVariableFeature.getEReferenceType();
                            variableContainer = variableContainerClass.getEPackage().getEFactoryInstance().create(variableContainerClass);
                            baseCamel.eSet(_actionVariableFeature, variableContainer);
                        }
                        if (variableContainer instanceof EObject) {
                            final Object mappings = ((EObject) variableContainer).eGet(_mappingsFeature);
                            if (mappings instanceof Collection) {
                                ((Collection) mappings).add(mapping);
                            }
                        }
                        getTableViewer().refresh(true);
                    }
                });
            } else {
                Object variableContainer = baseCamel.eGet(_actionVariableFeature);
                if (variableContainer == null) {
                    final EClass variableContainerClass = _actionVariableFeature.getEReferenceType();
                    variableContainer = variableContainerClass.getEPackage().getEFactoryInstance().create(variableContainerClass);
                    baseCamel.eSet(_actionVariableFeature, variableContainer);
                }
                if (variableContainer instanceof EObject) {
                    final Object mappings = ((EObject) variableContainer).eGet(_mappingsFeature);
                    if (mappings instanceof Collection) {
                        ((Collection) mappings).add(mapping);
                    }
                }
                getTableViewer().refresh(true);
            }
            fireChangedEvent(this);
        }
    }

    /**
     * Remove a property from the list
     */
    @SuppressWarnings("rawtypes")
    protected void removeFromList() {
        if (getTargetObject() instanceof SwitchYardBindingType) {
            final SwitchYardBindingType baseCamel = (SwitchYardBindingType) getTargetObject();
            final EObject actionToRemove = getTableSelection();
            if (baseCamel.eContainer() != null) {
                TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        final Object variableContainer = baseCamel.eGet(_actionVariableFeature);
                        if (variableContainer instanceof EObject) {
                            final Object mappings = ((EObject) variableContainer).eGet(_mappingsFeature);
                            if (mappings instanceof Collection) {
                                ((Collection) mappings).remove(actionToRemove);
                            }
                            if (((Collection)mappings).isEmpty()) {
                                baseCamel.eSet(_actionVariableFeature, null);
                            }
                        }
                        getTableViewer().refresh(true);
                    }
                });
            } else {
                final Object variableContainer = baseCamel.eGet(_actionVariableFeature);
                if (variableContainer instanceof EObject) {
                    final Object mappings = ((EObject) variableContainer).eGet(_mappingsFeature);
                    if (mappings instanceof Collection) {
                        ((Collection) mappings).remove(actionToRemove);
                    }
                    if (((Collection)mappings).isEmpty()) {
                        baseCamel.eSet(_actionVariableFeature, null);
                    }
                }
                getTableViewer().refresh(true);
            }
            fireChangedEvent(this);
        }
    }

    protected EObject getTableSelection() {
        if (_propertyTreeTable != null && !_propertyTreeTable.getSelection().isEmpty()) {
            IStructuredSelection ssel = (IStructuredSelection) _propertyTreeTable.getSelection();
            if (ssel.getFirstElement() instanceof EObject) {
                return (EObject) ssel.getFirstElement();
            }
        }
        return null;
    }

    /**
     * Update button state based on what's selected.
     */
    public void updatePropertyButtons() {
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

    /**
     * @return warning string
     */
    public String getWarning() {
        return this._mWarning;
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
        _propertyTreeTable.setInput(target);
        updatePropertyButtons();
    }

    protected EObject getTargetObject() {
        return this._targetObj;
    }

    /**
     * @param element Object being modified
     * @param property Property being modified
     * @return boolean flag
     * @see org.eclipse.jface.viewers.ICellModifier#canModify(java.lang.Object,
     *      java.lang.String)
     */
    public boolean canModify(Object element, String property) {
        return true;
    }

    /**
     * @param element Object being modified
     * @param property Property being modified
     * @return value of element property
     * @see org.eclipse.jface.viewers.ICellModifier#getValue(java.lang.Object ,
     *      java.lang.String)
     */
    public Object getValue(Object element, String property) {
        Class<? extends Object> elementClass = element.getClass();
        Class<?> instanceClass = _parameterType.getInstanceClass();
        boolean rightClass = instanceClass.isAssignableFrom(elementClass);
        if (rightClass && property.equalsIgnoreCase(NAME_COLUMN)) {
            return (String) getFeatureValue((EObject) element, "name"); //$NON-NLS-1$
        } else if (rightClass && property.equalsIgnoreCase(VALUE_COLUMN)) {
            return (String) getFeatureValue((EObject) element, "value"); //$NON-NLS-1$
        }
        return null;
    }

    /**
     * @param element Object being modified
     * @param property Property being modified
     * @param value New property value
     * 
     * @see org.eclipse.jface.viewers.ICellModifier#modify(java.lang.Object,
     *      java.lang.String, java.lang.Object)
     */
    public void modify(Object element, String property, final Object value) {
        if (element instanceof TableItem && property.equalsIgnoreCase(NAME_COLUMN)) {
            final TableItem ti = (TableItem) element;
            if (getTargetObject() instanceof SwitchYardBindingType) {
                final SwitchYardBindingType impl = (SwitchYardBindingType) getTargetObject();
                final EObject parm = (EObject) ti.getData();
                final String name = (String) getFeatureValue(parm, "name"); //$NON-NLS-1$
                if ((value == null && name == null) || (value != null && value.equals(name))) {
                    return;
                }
                if (impl.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            try {
                                setFeatureValue(parm, "name", value); //$NON-NLS-1$
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            getTableViewer().refresh(true);
                        }
                    });
                } else {
                    try {
                        setFeatureValue(parm, "name", value); //$NON-NLS-1$
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    getTableViewer().refresh(true);
                }
            }
            fireChangedEvent(this);
            // validate();
        } else if (element instanceof TableItem && property.equalsIgnoreCase(VALUE_COLUMN)) {
            final TableItem ti = (TableItem) element;
            if (getTargetObject() instanceof SwitchYardBindingType) {
                final SwitchYardBindingType impl = (SwitchYardBindingType) getTargetObject();
                final EObject parm = (EObject) ti.getData();
                final String oldvalue = (String) getFeatureValue(parm, "value"); //$NON-NLS-1$
                if ((value == null && oldvalue == null) || (value != null && value.equals(oldvalue))) {
                    return;
                }
                if (impl.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            try {
                                setFeatureValue(parm, "value", value); //$NON-NLS-1$
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            getTableViewer().refresh(true);
                        }
                    });
                } else {
                    try {
                        setFeatureValue(parm, "value", value); //$NON-NLS-1$
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    getTableViewer().refresh(true);
                }
            }
            fireChangedEvent(this);
            // validate();
        }
    }

    protected TableViewer getTableViewer() {
        return this._propertyTreeTable;
    }

    /**
     * @param eObject incoming object to retrieve
     * @param featureId feature to retrieve
     * @return object value
     */
    public Object getFeatureValue(EObject eObject, String featureId) {
        EClass eClass = eObject.eClass();
        for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
            EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
            if (eStructuralFeature.isChangeable()) {
                if (eStructuralFeature.getName().equalsIgnoreCase(featureId)) {
                    return eObject.eGet(eStructuralFeature);
                }
            }
        }
        System.out.println("CamelAdditionalURIPropertyTable: Didn't find feature: " + featureId); //$NON-NLS-1$
        showFeatures(eObject);
        return null;
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
