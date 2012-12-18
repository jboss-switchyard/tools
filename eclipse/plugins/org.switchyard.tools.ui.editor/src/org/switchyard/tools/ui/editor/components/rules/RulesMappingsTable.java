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
package org.switchyard.tools.ui.editor.components.rules;

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
import org.eclipse.jface.viewers.ComboBoxCellEditor;
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
import org.switchyard.tools.models.switchyard1_0.rules.ActionType1;
import org.switchyard.tools.models.switchyard1_0.rules.ExpressionType;
import org.switchyard.tools.models.switchyard1_0.rules.MappingType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesFactory;
import org.switchyard.tools.models.switchyard1_0.rules.ScopeType;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class RulesMappingsTable extends Composite implements ICellModifier {

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
            if (element instanceof MappingType && property.equalsIgnoreCase(EXPRESSION_COLUMN)) {
                return true;
            } else if (element instanceof MappingType && property.equalsIgnoreCase(CONTEXTSCOPE_COLUMN)) {
                return true;
            } else if (element instanceof MappingType && property.equalsIgnoreCase(VARIABLE_COLUMN)) {
                return true;
            } else if (element instanceof MappingType && property.equalsIgnoreCase(EXPRESSION_TYPE_COLUMN)) {
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
                return ((MappingType) element).getExpression();
            } else if (element instanceof MappingType && columnIndex == 1) {
                MappingType tp = (MappingType) element;
                return (String) tp.getScope().getLiteral();
            } else if (element instanceof MappingType && columnIndex == 2) {
                MappingType tp = (MappingType) element;
                return tp.getVariable();
            } else if (element instanceof MappingType && columnIndex == 3) {
                MappingType tp = (MappingType) element;
                return tp.getExpressionType().getLiteral();
            }
            return null;
        }
    }

    private TableViewer _propertyTreeTable;

    /**
     * Expression column.
     */
    public static final String EXPRESSION_COLUMN = "expression";

    /**
     * Context Scope column.
     */
    public static final String CONTEXTSCOPE_COLUMN = "contextScope";
    /**
     * Variable column.
     */
    public static final String VARIABLE_COLUMN = "variable";

    /**
     * Expression type column.
     */
    public static final String EXPRESSION_TYPE_COLUMN = "expressionType";

    private static final String[] TREE_COLUMNS = new String[] {EXPRESSION_COLUMN, CONTEXTSCOPE_COLUMN, VARIABLE_COLUMN,
            EXPRESSION_TYPE_COLUMN };

    private Button _mAddButton;
    private Button _mRemoveButton;
    private boolean _isReadOnly = false;
    private EObject _targetObj = null;
    private String _mWarning = null;
    private ListenerList _changeListeners;
    private final EReference _mappingsFeature;
    private final EReference _actionVariableFeature;

    /**
     * Constructor.
     * 
     * @param parent Composite parent
     * @param style any SWT style bits to pass along
     * @param actionVariableFeature the feature describing the variable type
     *            (e.g. inputs, outputs, globals).
     * @param mappingsFeature the feature describing the "mappings" feature on
     *            the variable type.
     */
    public RulesMappingsTable(Composite parent, int style, EReference actionVariableFeature, EReference mappingsFeature) {
        this(parent, style, false, actionVariableFeature, mappingsFeature);
    }

    /**
     * Constructor.
     * 
     * @param parent composite parent
     * @param style any SWT style bits
     * @param isReadOnly boolean flag
     * @param actionVariableFeature the feature describing the variable type
     *            (e.g. inputs, outputs, globals).
     * @param mappingsFeature the feature describing the "mappings" feature on
     *            the variable type.
     */
    public RulesMappingsTable(Composite parent, int style, boolean isReadOnly, EReference actionVariableFeature,
            EReference mappingsFeature) {
        super(parent, style);
        _isReadOnly = isReadOnly;
        _changeListeners = new ListenerList();
        _actionVariableFeature = actionVariableFeature;
        _mappingsFeature = mappingsFeature;

        int additionalStyles = SWT.NONE;
        if (isReadOnly) {
            additionalStyles = SWT.READ_ONLY;
        }

        final GridLayout gridLayout = new GridLayout();
        gridLayout.marginWidth = 0;
        gridLayout.marginHeight = 0;
        gridLayout.numColumns = 2;
        setLayout(gridLayout);

        _propertyTreeTable = new TableViewer(this, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.FULL_SELECTION
                | additionalStyles);
        GridData gd11 = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 3);
        gd11.heightHint = 100;
        _propertyTreeTable.getTable().setLayoutData(gd11);
        _propertyTreeTable.getTable().setHeaderVisible(true);
        TableColumn nameColumn = new TableColumn(_propertyTreeTable.getTable(), SWT.LEFT);
        nameColumn.setText("Expression");
        nameColumn.setWidth(200);
        TableColumn valueColumn = new TableColumn(_propertyTreeTable.getTable(), SWT.LEFT);
        valueColumn.setText("Context Scope");
        valueColumn.setWidth(200);
        TableColumn entryPointColumn = new TableColumn(_propertyTreeTable.getTable(), SWT.LEFT);
        entryPointColumn.setText("Variable");
        entryPointColumn.setWidth(200);
        TableColumn expressionTypeColumn = new TableColumn(_propertyTreeTable.getTable(), SWT.LEFT);
        expressionTypeColumn.setText("Expression Type");
        expressionTypeColumn.setWidth(200);

        _propertyTreeTable.setColumnProperties(TREE_COLUMNS);

        _propertyTreeTable.setLabelProvider(new PropertyTreeLabelProvider());

        _propertyTreeTable.setContentProvider(new PropertyTreeContentProvider());

        _propertyTreeTable.setCellModifier(this);
        _propertyTreeTable
                .setCellEditors(new CellEditor[] {
                        new TextCellEditor(_propertyTreeTable.getTable()),
                        new ComboBoxCellEditor(_propertyTreeTable.getTable(), new String[] {ScopeType.IN.getLiteral(),
                                ScopeType.OUT.getLiteral(), ScopeType.EXCHANGE.getLiteral() }),
                        new TextCellEditor(_propertyTreeTable.getTable()),
                        new ComboBoxCellEditor(_propertyTreeTable.getTable(), new String[] {ExpressionType.MVEL
                                .getLiteral() }) });

        this._mAddButton = new Button(this, SWT.NONE);
        this._mAddButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
        this._mAddButton.setText("Add");
        this._mAddButton.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                addPropertyToList();
                if (_propertyTreeTable.getInput() == null) {
                    _propertyTreeTable.setInput(_targetObj);
                }
                _propertyTreeTable.refresh();
                fireChangedEvent(e.getSource());
            }
        });

        this._mAddButton.setEnabled(false);

        _propertyTreeTable.getTable().addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                updatePropertyButtons();
            }
        });

        this._mRemoveButton = new Button(this, SWT.NONE);
        this._mRemoveButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
        this._mRemoveButton.setText("Remove");
        this._mRemoveButton.setEnabled(false);
        this._mRemoveButton.addSelectionListener(new SelectionAdapter() {

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
            if (impl.eContainer() != null) {
                TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        MappingType newMapping = RulesFactory.eINSTANCE.createMappingType();
                        newMapping.setExpression("NewExpression");
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
                MappingType newMapping = RulesFactory.eINSTANCE.createMappingType();
                newMapping.setExpression("NewExpression");
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
        if (element instanceof MappingType && property.equalsIgnoreCase(EXPRESSION_COLUMN)) {
            return ((MappingType) element).getExpression();
        } else if (element instanceof MappingType && property.equalsIgnoreCase(CONTEXTSCOPE_COLUMN)) {
            return new Integer(((MappingType) element).getScope().getValue());
        } else if (element instanceof MappingType && property.equalsIgnoreCase(VARIABLE_COLUMN)) {
            if (((MappingType) element).getVariable() != null) {
                return ((MappingType) element).getVariable();
            } else {
                return "";
            }
        } else if (element instanceof MappingType && property.equalsIgnoreCase(EXPRESSION_TYPE_COLUMN)) {
            return new Integer(((MappingType) element).getExpressionType().getValue());
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
        if (element instanceof TableItem && property.equalsIgnoreCase(EXPRESSION_COLUMN)) {
            final TableItem ti = (TableItem) element;
            if (getTargetObject() instanceof ActionType1) {
                final ActionType1 impl = (ActionType1) getTargetObject();
                if (impl.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            MappingType parm = (MappingType) ti.getData();
                            parm.setExpression((String) value);
                            getTableViewer().refresh(true);
                        }
                    });
                } else {
                    MappingType parm = (MappingType) ti.getData();
                    parm.setExpression((String) value);
                    getTableViewer().refresh(true);
                }
            }
            fireChangedEvent(this);
            // validate();
        } else if (element instanceof TableItem && property.equalsIgnoreCase(CONTEXTSCOPE_COLUMN)) {
            final TableItem ti = (TableItem) element;
            if (getTargetObject() instanceof ActionType1) {
                final ActionType1 impl = (ActionType1) getTargetObject();
                if (impl.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            MappingType parm = (MappingType) ti.getData();
                            ScopeType atype = ScopeType.get(((Integer) value).intValue());
                            parm.setScope(atype);
                            getTableViewer().refresh(true);
                        }
                    });
                } else {
                    MappingType parm = (MappingType) ti.getData();
                    ScopeType atype = ScopeType.get(((Integer) value).intValue());
                    parm.setScope(atype);
                    getTableViewer().refresh(true);
                }
            }
            fireChangedEvent(this);
            // validate();
        } else if (element instanceof TableItem && property.equalsIgnoreCase(VARIABLE_COLUMN)) {
            final TableItem ti = (TableItem) element;
            if (getTargetObject() instanceof ActionType1) {
                final ActionType1 impl = (ActionType1) getTargetObject();
                if (impl.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            MappingType parm = (MappingType) ti.getData();
                            parm.setVariable((String) value);
                            getTableViewer().refresh(true);
                        }
                    });
                } else {
                    MappingType parm = (MappingType) ti.getData();
                    parm.setVariable((String) value);
                    getTableViewer().refresh(true);
                }
            }
            fireChangedEvent(this);
            // validate();
        } else if (element instanceof TableItem && property.equalsIgnoreCase(EXPRESSION_TYPE_COLUMN)) {
            final TableItem ti = (TableItem) element;
            if (getTargetObject() instanceof ActionType1) {
                final ActionType1 impl = (ActionType1) getTargetObject();
                if (impl.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            MappingType parm = (MappingType) ti.getData();
                            ExpressionType atype = ExpressionType.get(((Integer) value).intValue());
                            parm.setExpressionType(atype);
                            getTableViewer().refresh(true);
                        }
                    });
                } else {
                    MappingType parm = (MappingType) ti.getData();
                    ExpressionType atype = ExpressionType.get(((Integer) value).intValue());
                    parm.setExpressionType(atype);
                    getTableViewer().refresh(true);
                }
            }
            fireChangedEvent(this);
        }
    }

    protected TableViewer getTableViewer() {
        return this._propertyTreeTable;
    }
}
