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

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
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
import org.switchyard.tools.models.switchyard1_0.bpm.BPMFactory;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType;
import org.switchyard.tools.models.switchyard1_0.bpm.ChannelType;
import org.switchyard.tools.ui.bpmn2.Messages;
import org.switchyard.tools.ui.editor.diagram.shared.ClassDialogCellEditor;
import org.switchyard.tools.ui.editor.diagram.shared.TableColumnLayout;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class BPMChannelTable extends Composite implements ICellModifier {

    private class PropertyTreeContentProvider implements IStructuredContentProvider {
        @Override
        public void dispose() {
        }

        @Override
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        }

        @Override
        public Object[] getElements(Object inputElement) {
            if (inputElement instanceof BPMImplementationType) {
                final BPMImplementationType bpmImpl = (BPMImplementationType) inputElement;
                if (bpmImpl.getChannels() != null) {
                    return bpmImpl.getChannels().getChannel().toArray();
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
            if (element instanceof ChannelType && property.equalsIgnoreCase(NAME_COLUMN)) {
                return true;
            } else if (element instanceof ChannelType && property.equalsIgnoreCase(OPERATION_COLUMN)) {
                return true;
            } else if (element instanceof ChannelType && property.equalsIgnoreCase(REFERENCE_COLUMN)) {
                return true;
            } else if (element instanceof ChannelType && property.equalsIgnoreCase(CLASS_COLUMN)) {
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
            if (element instanceof ChannelType && columnIndex == 0) {
                return ((ChannelType) element).getName();
            } else if (element instanceof ChannelType && columnIndex == 1) {
                return ((ChannelType) element).getOperation();
            } else if (element instanceof ChannelType && columnIndex == 2) {
                return ((ChannelType) element).getReference();
            } else if (element instanceof ChannelType && columnIndex == 3) {
                return ((ChannelType) element).getClass_();
            }
            return null;
        }
    }

    private TableViewer _propertyTreeTable;

    private static final String NAME_COLUMN = "name"; //$NON-NLS-1$
    private static final String OPERATION_COLUMN = "operation"; //$NON-NLS-1$
    private static final String REFERENCE_COLUMN = "reference"; //$NON-NLS-1$
    private static final String CLASS_COLUMN = "class"; //$NON-NLS-1$

    private static final String[] TREE_COLUMNS = new String[] {NAME_COLUMN, OPERATION_COLUMN, REFERENCE_COLUMN,
            CLASS_COLUMN };

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
    public BPMChannelTable(Composite parent, int style) {
        this(parent, style, false);
    }

    /**
     * Constructor.
     * 
     * @param parent composite parent
     * @param style any SWT style bits
     * @param isReadOnly boolean flag
     */
    public BPMChannelTable(Composite parent, int style, boolean isReadOnly) {
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
        TableColumn operationColumn = new TableColumn(_propertyTreeTable.getTable(), SWT.LEFT);
        operationColumn.setText(Messages.label_operation);
        tableLayout.setColumnData(operationColumn, new ColumnWeightData(100, 150, true));
        TableColumn referenceColumn = new TableColumn(_propertyTreeTable.getTable(), SWT.LEFT);
        referenceColumn.setText(Messages.label_reference);
        tableLayout.setColumnData(referenceColumn, new ColumnWeightData(100, 150, true));
        TableColumn valueColumn = new TableColumn(_propertyTreeTable.getTable(), SWT.LEFT);
        valueColumn.setText(Messages.label_class);
        tableLayout.setColumnData(valueColumn, new ColumnWeightData(200, 300, true));

        _propertyTreeTable.setColumnProperties(TREE_COLUMNS);

        _propertyTreeTable.setLabelProvider(new PropertyTreeLabelProvider());

        _propertyTreeTable.setContentProvider(new PropertyTreeContentProvider());

        _propertyTreeTable.setCellModifier(this);
        _propertyTreeTable.setCellEditors(new CellEditor[] {
                new TextCellEditor(_propertyTreeTable.getTable()),
                new TextCellEditor(_propertyTreeTable.getTable()),
                new TextCellEditor(_propertyTreeTable.getTable()),
                new ClassDialogCellEditor(_propertyTreeTable.getTable(), "org.kie.api.runtime.Channel", Messages.title_channel, //$NON-NLS-1$
                        Messages.description_channel) {
                    protected Resource getResource() {
                        return _targetObj == null ? null : _targetObj.eResource();
                    }
                } });

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
     * Add a new property to the list
     */
    protected void addPropertyToList() {
        if (getTargetObject() instanceof BPMImplementationType) {
            final BPMImplementationType impl = (BPMImplementationType) getTargetObject();
            final ChannelType newAction = BPMFactory.eINSTANCE.createChannelType();
            newAction.setName("ChannelName"); //$NON-NLS-1$
            newAction.setOperation("ChannelOperation"); //$NON-NLS-1$
            newAction.setReference("ChannelReference"); //$NON-NLS-1$
            newAction.setClass("NewChannel"); //$NON-NLS-1$
            if (impl.eContainer() != null) {
                TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        if (impl.getChannels() == null) {
                            impl.setChannels(BPMFactory.eINSTANCE.createChannelsType());
                        }
                        impl.getChannels().getChannel().add(newAction);
                        getTableViewer().refresh(true);
                    }
                });
            } else {
                if (impl.getChannels() == null) {
                    impl.setChannels(BPMFactory.eINSTANCE.createChannelsType());
                }
                impl.getChannels().getChannel().add(newAction);
                getTableViewer().refresh(true);
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
            final ChannelType actionToRemove = getTableSelection();
            if (impl.eContainer() != null) {
                TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        impl.getChannels().getChannel().remove(actionToRemove);
                        if (impl.getChannels().getChannel().isEmpty()) {
                            impl.setChannels(null);
                        }
                        getTableViewer().refresh(true);
                    }
                });
            } else {
                impl.getChannels().getChannel().remove(actionToRemove);
                if (impl.getChannels().getChannel().isEmpty()) {
                    impl.setChannels(null);
                }
                getTableViewer().refresh(true);
            }
            fireChangedEvent(this);
        }
    }

    protected ChannelType getTableSelection() {
        if (_propertyTreeTable != null && !_propertyTreeTable.getSelection().isEmpty()) {
            IStructuredSelection ssel = (IStructuredSelection) _propertyTreeTable.getSelection();
            if (ssel.getFirstElement() instanceof ChannelType) {
                return (ChannelType) ssel.getFirstElement();
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
        if (element instanceof ChannelType && property.equalsIgnoreCase(NAME_COLUMN)) {
            if (((ChannelType) element).getName() != null) {
                return ((ChannelType) element).getName();
            } else {
                return ""; //$NON-NLS-1$
            }
        } else if (element instanceof ChannelType && property.equalsIgnoreCase(OPERATION_COLUMN)) {
            if (((ChannelType) element).getOperation() != null) {
                return ((ChannelType) element).getOperation();
            } else {
                return ""; //$NON-NLS-1$
            }
        } else if (element instanceof ChannelType && property.equalsIgnoreCase(REFERENCE_COLUMN)) {
            if (((ChannelType) element).getReference() != null) {
                return ((ChannelType) element).getReference();
            } else {
                return ""; //$NON-NLS-1$
            }
        } else if (element instanceof ChannelType && property.equalsIgnoreCase(CLASS_COLUMN)) {
            if (((ChannelType) element).getClass_() != null) {
                return ((ChannelType) element).getClass_();
            } else {
                return ""; //$NON-NLS-1$
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
        if (element instanceof TableItem && property.equalsIgnoreCase(NAME_COLUMN)) {
            final TableItem ti = (TableItem) element;
            if (getTargetObject() instanceof BPMImplementationType) {
                final BPMImplementationType impl = (BPMImplementationType) getTargetObject();
                final ChannelType parm = (ChannelType) ti.getData();
                if ((value == null && parm.getName() == null) || (value != null && value.equals(parm.getName()))) {
                    return;
                }
                if (impl.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            parm.setName((String) value);
                            getTableViewer().refresh(true);
                        }
                    });
                } else {
                    parm.setName((String) value);
                    getTableViewer().refresh(true);
                }
            }
            fireChangedEvent(this);
            // validate();
        } else if (element instanceof TableItem && property.equalsIgnoreCase(OPERATION_COLUMN)) {
            final TableItem ti = (TableItem) element;
            if (getTargetObject() instanceof BPMImplementationType) {
                final BPMImplementationType impl = (BPMImplementationType) getTargetObject();
                final ChannelType parm = (ChannelType) ti.getData();
                if ((value == null && parm.getOperation() == null)
                        || (value != null && value.equals(parm.getOperation()))) {
                    return;
                }
                if (impl.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            ChannelType parm = (ChannelType) ti.getData();
                            parm.setOperation((String) value);
                            getTableViewer().refresh(true);
                        }
                    });
                } else {
                    parm.setClass((String) value);
                    getTableViewer().refresh(true);
                }
            }
            fireChangedEvent(this);
            // validate();
        } else if (element instanceof TableItem && property.equalsIgnoreCase(REFERENCE_COLUMN)) {
            final TableItem ti = (TableItem) element;
            if (getTargetObject() instanceof BPMImplementationType) {
                final BPMImplementationType impl = (BPMImplementationType) getTargetObject();
                final ChannelType parm = (ChannelType) ti.getData();
                if ((value == null && parm.getReference() == null)
                        || (value != null && value.equals(parm.getReference()))) {
                    return;
                }
                if (impl.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            ChannelType parm = (ChannelType) ti.getData();
                            parm.setReference((String) value);
                            getTableViewer().refresh(true);
                        }
                    });
                } else {
                    parm.setClass((String) value);
                    getTableViewer().refresh(true);
                }
            }
            fireChangedEvent(this);
            // validate();
        } else if (element instanceof TableItem && property.equalsIgnoreCase(CLASS_COLUMN)) {
            final TableItem ti = (TableItem) element;
            if (getTargetObject() instanceof BPMImplementationType) {
                final BPMImplementationType impl = (BPMImplementationType) getTargetObject();
                final ChannelType parm = (ChannelType) ti.getData();
                if ((value == null && parm.getClass_() == null) || (value != null && value.equals(parm.getClass_()))) {
                    return;
                }
                if (impl.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            ChannelType parm = (ChannelType) ti.getData();
                            parm.setClass((String) value);
                            getTableViewer().refresh(true);
                        }
                    });
                } else {
                    parm.setClass((String) value);
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
}
