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
package org.switchyard.tools.ui.editor.components.bpm;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.switchyard.tools.models.switchyard1_0.bpm.ActionType;
import org.switchyard.tools.models.switchyard1_0.bpm.ActionType1;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMFactory;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class BPMActionTable extends Composite implements ICellModifier {

    private class PropertyTreeContentProvider implements ITreeContentProvider {
        private EList<ActionType1> _properties;

        @Override
        public void dispose() {
        }

        @SuppressWarnings("unchecked")
        @Override
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
            if (newInput instanceof EList<?>) {
                _properties = (EList<ActionType1>) newInput;
            }
        }

        @Override
        public Object[] getElements(Object inputElement) {
            if (inputElement instanceof EList<?>) {
                return _properties.toArray();
            }
            return null;
        }

        @Override
        public Object[] getChildren(Object parentElement) {
            if (parentElement instanceof ActionType1[]) {
                return new Object[] {_properties.toArray() };
            }
            return null;
        }

        @Override
        public Object getParent(Object element) {
            if (element instanceof ActionType1) {
                return ((ActionType1) element).eContainer();
            }
            return null;
        }

        @Override
        public boolean hasChildren(Object element) {
            if (element instanceof EList<?>) {
                return ((EList<?>) element).size() > 0;
            }
            return false;
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
            if (element instanceof ActionType1 && property.equalsIgnoreCase(NAME_COLUMN)) {
                return true;
            } else if (element instanceof ActionType1 && property.equalsIgnoreCase(VALUE_COLUMN)) {
                return true;
            } else if (element instanceof ActionType1 && property.equalsIgnoreCase(ENTRY_POINT_COLUMN)) {
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
            if (element instanceof ActionType1 && columnIndex == 0) {
                return ((ActionType1) element).getName();
            } else if (element instanceof ActionType1 && columnIndex == 1) {
                ActionType1 tp = (ActionType1) element;
                return (String) tp.getType().getLiteral();
            } else if (element instanceof ActionType1 && columnIndex == 2) {
                ActionType1 tp = (ActionType1) element;
                return tp.getEventType();
            }
            return null;
        }
    }

    private TreeViewer _propertyTreeTable;
    
    /**
     *  Name column.
     */
    public static final String NAME_COLUMN = "name";
    
    /**
     * Value column. 
     */
    public static final String VALUE_COLUMN = "value";
    /**
     * Entry point column.
     */
    public static final String ENTRY_POINT_COLUMN = "entryPoint";
    
    private static final String[] TREE_COLUMNS = new String[] {NAME_COLUMN, VALUE_COLUMN, ENTRY_POINT_COLUMN };

    private Button _mAddButton;
    private Button _mRemoveButton;
    private boolean _isReadOnly = false;
    private EObject _targetObj = null;
    private String _mWarning = null;
    private ListenerList _changeListeners;

    /**
     * Constructor.
     * 
     * @param parent Composite parent
     * @param style any SWT style bits to pass along
     */
    public BPMActionTable(Composite parent, int style) {
        this(parent, style, false);
    }

    /**
     * Constructor.
     * 
     * @param parent composite parent
     * @param style any SWT style bits
     * @param isReadOnly boolean flag
     */
    public BPMActionTable(Composite parent, int style, boolean isReadOnly) {
        super(parent, style);
        this._isReadOnly = isReadOnly;
        this._changeListeners = new ListenerList();

        int additionalStyles = SWT.NONE;
        if (isReadOnly) {
            additionalStyles = SWT.READ_ONLY;
        }

        final GridLayout gridLayout = new GridLayout();
        gridLayout.marginWidth = 0;
        gridLayout.marginHeight = 0;
        gridLayout.numColumns = 2;
        setLayout(gridLayout);

        _propertyTreeTable = new TreeViewer(this, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.FULL_SELECTION
                | additionalStyles);
        this._propertyTreeTable.setAutoExpandLevel(TreeViewer.ALL_LEVELS);
        GridData gd11 = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 3);
        gd11.heightHint = 100;
        _propertyTreeTable.getTree().setLayoutData(gd11);
        _propertyTreeTable.getTree().setHeaderVisible(true);
        TreeColumn nameColumn = new TreeColumn(_propertyTreeTable.getTree(), SWT.LEFT);
        nameColumn.setText("Name");
        nameColumn.setWidth(200);
        TreeColumn valueColumn = new TreeColumn(_propertyTreeTable.getTree(), SWT.LEFT);
        valueColumn.setText("Type");
        valueColumn.setWidth(200);
        TreeColumn entryPointColumn = new TreeColumn(_propertyTreeTable.getTree(), SWT.LEFT);
        entryPointColumn.setText("Event Type");
        entryPointColumn.setWidth(200);

        _propertyTreeTable.setColumnProperties(TREE_COLUMNS);

        _propertyTreeTable.setLabelProvider(new PropertyTreeLabelProvider());

        _propertyTreeTable.setContentProvider(new PropertyTreeContentProvider());

        _propertyTreeTable.setCellModifier(this);
        _propertyTreeTable.setCellEditors(new CellEditor[] {
                new TextCellEditor(_propertyTreeTable.getTree()), 
                new ComboBoxCellEditor(_propertyTreeTable.getTree(), new String[] {
                    ActionType.STARTPROCESS.getLiteral(),
                    ActionType.SIGNALEVENT.getLiteral(),
                    ActionType.ABORTPROCESSINSTANCE.getLiteral()
                }),
                new TextCellEditor(_propertyTreeTable.getTree()) });

        this._mAddButton = new Button(this, SWT.NONE);
        this._mAddButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
        this._mAddButton.setText("Add");
        this._mAddButton.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                addPropertyToList();
                if (_propertyTreeTable.getInput() == null) {
                    BPMImplementationType impl = (BPMImplementationType) _targetObj;
                    _propertyTreeTable.setInput(impl.getAction());
                }
                _propertyTreeTable.refresh();
                fireChangedEvent(e.getSource());
            }
        });

        this._mAddButton.setEnabled(false);

        _propertyTreeTable.getTree().addSelectionListener(new SelectionAdapter() {

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
    protected void addPropertyToList() {
        if (getTargetObject() instanceof BPMImplementationType) {
            final BPMImplementationType impl = (BPMImplementationType) getTargetObject();
            if (impl.eContainer() != null) {
                TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        ActionType1 newAction = BPMFactory.eINSTANCE.createActionType1();
                        newAction.setType(ActionType.STARTPROCESS);
                        newAction.setName("NewAction");
                        impl.getAction().add(newAction);
                        getTreeViewer().refresh(true);
                    }
                });
            } else {
                ActionType1 newAction = BPMFactory.eINSTANCE.createActionType1();
                newAction.setType(ActionType.STARTPROCESS);
                newAction.setName("NewAction");
                impl.getAction().add(newAction);
                getTreeViewer().refresh(true);
            }
            fireChangedEvent(this);
        }
    }

    /**
     * Remove a property from the list
     */
    protected void removeFromList() {
        if (getTargetObject() instanceof BPMImplementationType) {
            final BPMImplementationType impl = (BPMImplementationType) getTargetObject();
            final ActionType1 actionToRemove = getTableSelection();
            if (impl.eContainer() != null) {
                TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        impl.getAction().remove(actionToRemove);
                        getTreeViewer().refresh(true);
                    }
                });
            } else {
                impl.getAction().remove(actionToRemove);
                getTreeViewer().refresh(true);
            }
            fireChangedEvent(this);
        }
    }

    /**
     * Return the current selection.
     * 
     * @return String list
     */
    @SuppressWarnings("unchecked")
    public EList<ActionType1> getSelection() {
        if (_propertyTreeTable != null && _propertyTreeTable.getInput() != null) {
            return (EList<ActionType1>) _propertyTreeTable.getInput();
        }
        return null;
    }
    
    protected ActionType1 getTableSelection() {
        if (_propertyTreeTable != null && !_propertyTreeTable.getSelection().isEmpty()) {
            IStructuredSelection ssel = (IStructuredSelection) _propertyTreeTable.getSelection();
            if (ssel.getFirstElement() instanceof ActionType1) {
                return (ActionType1) ssel.getFirstElement();
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
            if (getSelection() != null) {
                _mRemoveButton.setEnabled(true);
            }
        }
    }

    /**
     * @param properties incoming property list
     */
    public void setSelection(EList<ActionType1> properties) {
        _propertyTreeTable.setInput(properties);
        updatePropertyButtons();
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
        this._targetObj = target;
    }

    protected EObject getTargetObject() {
        return this._targetObj;
    }
    
    protected void setFeatureValue(EObject eObject, String featureId, Object value) {
        EClass eClass = eObject.eClass();
        for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
            EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
            if (eStructuralFeature.isChangeable()) {
                if (eStructuralFeature.getName().equalsIgnoreCase(featureId)) {
                    eObject.eSet(eStructuralFeature, value);
                    break;
                }
            }
        }
    }

    /**
     * @param element Object being modified
     * @param property Property being modified
     * @return boolean flag
     * @see org.eclipse.jface.viewers.ICellModifier#canModify(java.lang.Object, java.lang.String)
     */
    public boolean canModify(Object element, String property) {
        return true;
    }

    /**
     * @param element Object being modified
     * @param property Property being modified
     * @return value of element property
     * @see
     * org.eclipse.jface.viewers.ICellModifier#getValue(java.lang.Object ,
     * java.lang.String)
     */
    public Object getValue(Object element, String property) {
        if (element instanceof ActionType1 && property.equalsIgnoreCase(NAME_COLUMN)) {
            return ((ActionType1) element).getName();
        } else if (element instanceof ActionType1 && property.equalsIgnoreCase(VALUE_COLUMN)) {
            return new Integer(((ActionType1) element).getType().getValue());
        } else if (element instanceof ActionType1 && property.equalsIgnoreCase(ENTRY_POINT_COLUMN)) {
            if (((ActionType1) element).getEventType() != null) {
                return ((ActionType1) element).getEventType();
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
     * java.lang.String, java.lang.Object)
     */
    public void modify(Object element, String property, final Object value) {
        if (element instanceof TreeItem && property.equalsIgnoreCase(NAME_COLUMN)) {
            final TreeItem ti = (TreeItem) element;
            if (getTargetObject() instanceof BPMImplementationType) {
                final BPMImplementationType impl = (BPMImplementationType) getTargetObject();
                if (impl.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            ActionType1 parm = (ActionType1) ti.getData();
                            setFeatureValue(parm, "name", value);
                            getTreeViewer().refresh(true);
                        }
                    });
                } else {
                    ActionType1 parm = (ActionType1) ti.getData();
                    setFeatureValue(parm, "name", value);
                    getTreeViewer().refresh(true);
                }
            }
            fireChangedEvent(this);
            // validate();
        } else if (element instanceof TreeItem && property.equalsIgnoreCase(VALUE_COLUMN)) {
            final TreeItem ti = (TreeItem) element;
            if (getTargetObject() instanceof BPMImplementationType) {
                final BPMImplementationType impl = (BPMImplementationType) getTargetObject();
                if (impl.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            ActionType1 parm = (ActionType1) ti.getData();
                            ActionType atype = ActionType.get(((Integer)value).intValue());
                            setFeatureValue(parm, "type", atype);
                            getTreeViewer().refresh(true);
                        }
                    });
                } else {
                    ActionType1 parm = (ActionType1) ti.getData();
                    setFeatureValue(parm, "type", value);
                    getTreeViewer().refresh(true);
                }
            }
            fireChangedEvent(this);
            // validate();
        } else if (element instanceof TreeItem && property.equalsIgnoreCase(ENTRY_POINT_COLUMN)) {
            final TreeItem ti = (TreeItem) element;
            if (getTargetObject() instanceof BPMImplementationType) {
                final BPMImplementationType impl = (BPMImplementationType) getTargetObject();
                if (impl.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            ActionType1 parm = (ActionType1) ti.getData();
                            setFeatureValue(parm, "eventType", value);
                            getTreeViewer().refresh(true);
                        }
                    });
                } else {
                    ActionType1 parm = (ActionType1) ti.getData();
                    setFeatureValue(parm, "eventType", value);
                    getTreeViewer().refresh(true);
                }
            }
            fireChangedEvent(this);
            // validate();
        }
    }

    protected TreeViewer getTreeViewer() {
        return this._propertyTreeTable;
    }
}
