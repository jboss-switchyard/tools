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
package org.switchyard.tools.ui.bpmn2.component;

import java.util.Collection;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
import org.switchyard.tools.models.switchyard1_0.bpm.ActionType1;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMFactory;
import org.switchyard.tools.models.switchyard1_0.bpm.MappingType;
import org.switchyard.tools.ui.editor.diagram.shared.TableColumnLayout;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class BPMMappingsTable extends Composite implements ICellModifier {

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
            if (element instanceof MappingType && property.equalsIgnoreCase(FROM_COLUMN)) {
                return true;
            } else if (element instanceof MappingType && property.equalsIgnoreCase(TO_COLUMN)) {
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
            if (element instanceof MappingType && columnIndex == 0) {
                return ((MappingType) element).getFrom();
            } else if (element instanceof MappingType && columnIndex == 1) {
                MappingType tp = (MappingType) element;
                return tp.getTo();
            }
            return null;
        }
    }

    private TableViewer _propertyTreeTable;

    /**
     * Expression column.
     */
    public static final String FROM_COLUMN = "from";

    /**
     * To column.
     */
    public static final String TO_COLUMN = "to";


    private static final String[] TREE_COLUMNS = new String[] {FROM_COLUMN, TO_COLUMN};

    private Button _mAddButton;
    private Button _mRemoveButton;
    private boolean _isReadOnly = false;
    private EObject _targetObj = null;
    private String _mWarning = null;
    private ListenerList _changeListeners;
    private final EReference _mappingsFeature;
    private final EReference _actionVariableFeature;
    private final String _defaultFrom;
    private final String _defaultTo;

    /**
     * Constructor.
     * 
     * @param parent Composite parent
     * @param style any SWT style bits to pass along
     * @param defaultFrom default text for "from"
     * @param defaultTo default text for "to"
     * @param actionVariableFeature the feature describing the variable type
     *            (e.g. inputs, outputs, globals).
     * @param mappingsFeature the feature describing the "mappings" feature on
     *            the variable type.
     */
    public BPMMappingsTable(Composite parent, int style, String defaultFrom, String defaultTo, EReference actionVariableFeature, EReference mappingsFeature) {
        this(parent, style, false, defaultFrom, defaultTo, actionVariableFeature, mappingsFeature);
    }

    /**
     * Constructor.
     * 
     * @param parent composite parent
     * @param style any SWT style bits
     * @param isReadOnly boolean flag
     * @param defaultFrom default text for "from"
     * @param defaultTo default text for "to"
     * @param actionVariableFeature the feature describing the variable type
     *            (e.g. inputs, outputs, globals).
     * @param mappingsFeature the feature describing the "mappings" feature on
     *            the variable type.
     */
    public BPMMappingsTable(Composite parent, int style, boolean isReadOnly, String defaultFrom, String defaultTo, EReference actionVariableFeature,
            EReference mappingsFeature) {
        super(parent, style);
        _isReadOnly = isReadOnly;
        _changeListeners = new ListenerList();
        _actionVariableFeature = actionVariableFeature;
        _mappingsFeature = mappingsFeature;
        _defaultFrom = defaultFrom;
        _defaultTo = defaultTo;

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
        nameColumn.setText("From");
        tableLayout.setColumnData(nameColumn, new ColumnWeightData(100, 150, true));
        TableColumn entryPointColumn = new TableColumn(_propertyTreeTable.getTable(), SWT.LEFT);
        entryPointColumn.setText("To");
        tableLayout.setColumnData(entryPointColumn, new ColumnWeightData(100, 150, true));

        _propertyTreeTable.setColumnProperties(TREE_COLUMNS);

        _propertyTreeTable.setLabelProvider(new PropertyTreeLabelProvider());

        _propertyTreeTable.setContentProvider(new PropertyTreeContentProvider());

        _propertyTreeTable.setCellModifier(this);
        _propertyTreeTable
                .setCellEditors(new CellEditor[] {
                        new TextCellEditor(_propertyTreeTable.getTable()),
                        new TextCellEditor(_propertyTreeTable.getTable()) });

        _mAddButton = new Button(this, SWT.NONE);
        _mAddButton.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, false, false));
        _mAddButton.setText("Add");
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
        _mRemoveButton.setText("Remove");
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
     * Add a new property to the list
     */
    @SuppressWarnings({"unchecked", "rawtypes" })
    protected void addPropertyToList() {
        if (getTargetObject() instanceof ActionType1) {
            final ActionType1 impl = (ActionType1) getTargetObject();
            final MappingType newMapping = BPMFactory.eINSTANCE.createMappingType();
            newMapping.setFrom(_defaultFrom);
            newMapping.setTo(_defaultTo);
            if (impl.eContainer() != null) {
                TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        Object variableContainer = impl.eGet(_actionVariableFeature);
                        if (variableContainer == null) {
                            final EClass variableContainerClass = _actionVariableFeature.getEReferenceType();
                            variableContainer = variableContainerClass.getEPackage().getEFactoryInstance()
                                    .create(variableContainerClass);
                            impl.eSet(_actionVariableFeature, variableContainer);
                        }
                        if (variableContainer instanceof EObject) {
                            final Object mappings = ((EObject) variableContainer).eGet(_mappingsFeature);
                            if (mappings instanceof Collection) {
                                ((Collection) mappings).add(newMapping);
                            }
                        }
                        getTableViewer().refresh(true);
                    }
                });
            } else {
                Object variableContainer = impl.eGet(_actionVariableFeature);
                if (variableContainer == null) {
                    final EClass variableContainerClass = _actionVariableFeature.getEReferenceType();
                    variableContainer = variableContainerClass.getEPackage().getEFactoryInstance()
                            .create(variableContainerClass);
                    impl.eSet(_actionVariableFeature, variableContainer);
                }
                if (variableContainer instanceof EObject) {
                    final Object mappings = ((EObject) variableContainer).eGet(_mappingsFeature);
                    if (mappings instanceof Collection) {
                        ((Collection) mappings).add(newMapping);
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
        if (getTargetObject() instanceof ActionType1) {
            final ActionType1 impl = (ActionType1) getTargetObject();
            final MappingType actionToRemove = getTableSelection();
            if (impl.eContainer() != null) {
                TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        final Object variableContainer = impl.eGet(_actionVariableFeature);
                        if (variableContainer instanceof EObject) {
                            final Object mappings = ((EObject) variableContainer).eGet(_mappingsFeature);
                            if (mappings instanceof Collection) {
                                ((Collection) mappings).remove(actionToRemove);
                            }
                        }
                        getTableViewer().refresh(true);
                    }
                });
            } else {
                final Object variableContainer = impl.eGet(_actionVariableFeature);
                if (variableContainer instanceof EObject) {
                    final Object mappings = ((EObject) variableContainer).eGet(_mappingsFeature);
                    if (mappings instanceof Collection) {
                        ((Collection) mappings).remove(actionToRemove);
                    }
                }
                getTableViewer().refresh(true);
            }
            fireChangedEvent(this);
        }
    }

    protected MappingType getTableSelection() {
        if (_propertyTreeTable != null && !_propertyTreeTable.getSelection().isEmpty()) {
            IStructuredSelection ssel = (IStructuredSelection) _propertyTreeTable.getSelection();
            if (ssel.getFirstElement() instanceof MappingType) {
                return (MappingType) ssel.getFirstElement();
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
        if (element instanceof MappingType && property.equalsIgnoreCase(FROM_COLUMN)) {
            if (((MappingType) element).getFrom() != null) {
                return ((MappingType) element).getFrom();
            } else {
                return "";
            }
        } else if (element instanceof MappingType && property.equalsIgnoreCase(TO_COLUMN)) {
            if (((MappingType) element).getTo() != null) {
                return ((MappingType) element).getTo();
            } else {
                return "";
            }
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
        if (element instanceof TableItem && property.equalsIgnoreCase(FROM_COLUMN)) {
            final TableItem ti = (TableItem) element;
            if (getTargetObject() instanceof ActionType1) {
                final ActionType1 impl = (ActionType1) getTargetObject();
                final String newValue = value == null || ((String) value).length() == 0 ? null : (String) value;
                if (impl.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            MappingType parm = (MappingType) ti.getData();
                            parm.setFrom(newValue);
                            getTableViewer().refresh(true);
                        }
                    });
                } else {
                    MappingType parm = (MappingType) ti.getData();
                    parm.setFrom(newValue);
                    getTableViewer().refresh(true);
                }
            }
            fireChangedEvent(this);
            // validate();
        } else if (element instanceof TableItem && property.equalsIgnoreCase(TO_COLUMN)) {
            final TableItem ti = (TableItem) element;
            final String newValue = value == null || ((String) value).length() == 0 ? null : (String) value;
            if (getTargetObject() instanceof ActionType1) {
                final ActionType1 impl = (ActionType1) getTargetObject();
                if (impl.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            MappingType parm = (MappingType) ti.getData();
                            parm.setTo(newValue);
                            getTableViewer().refresh(true);
                        }
                    });
                } else {
                    MappingType parm = (MappingType) ti.getData();
                    parm.setTo(newValue);
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

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        _mAddButton.setEnabled(enabled);
        _mRemoveButton.setEnabled(enabled);
        _propertyTreeTable.getTable().setEnabled(enabled);
        if (enabled) {
            updatePropertyButtons();
        }
    }
}
