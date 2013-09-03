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

import java.math.BigInteger;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor.EDataTypeCellEditor;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnWeightData;
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
import org.switchyard.tools.models.switchyard1_0.rules.LoggerType;
import org.switchyard.tools.models.switchyard1_0.rules.LoggerType1;
import org.switchyard.tools.models.switchyard1_0.rules.RulesFactory;
import org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesPackage;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.shared.TableColumnLayout;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class RulesLoggerTable extends Composite implements ICellModifier {

    private class PropertyTreeContentProvider implements IStructuredContentProvider {

        @Override
        public void dispose() {
        }

        @Override
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        }

        @Override
        public Object[] getElements(Object inputElement) {
            if (inputElement instanceof RulesImplementationType) {
                final RulesImplementationType bpmImpl = (RulesImplementationType) inputElement;
                if (bpmImpl.getLoggers() != null) {
                    return bpmImpl.getLoggers().getLogger().toArray();
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
            if (element instanceof LoggerType1 && property.equalsIgnoreCase(LOG_COLUMN)) {
                return true;
            } else if (element instanceof LoggerType1 && property.equalsIgnoreCase(TYPE_COLUMN)) {
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
            if (element instanceof LoggerType1 && columnIndex == 1) {
                if (((LoggerType1) element).getLog() != null) {
                    return ((LoggerType1) element).getLog();
                } else {
                    return ""; //$NON-NLS-1$
                }
            } else if (element instanceof LoggerType1 && columnIndex == 0) {
                return ((LoggerType1) element).getType().getLiteral();
            } else if (element instanceof LoggerType1 && columnIndex == 2) {
                if (((LoggerType1) element).getInterval() != null) {
                    return ((LoggerType1) element).getInterval().toString();
                } else {
                    return ""; //$NON-NLS-1$
                }
            }
            return null;
        }
    }

    private TableViewer _propertyTreeTable;

    private static final String LOG_COLUMN = "log"; //$NON-NLS-1$
    private static final String TYPE_COLUMN = "type"; //$NON-NLS-1$
    private static final String INTERVAL_COLUMN = "interval"; //$NON-NLS-1$

    private static final String[] TREE_COLUMNS = new String[] {TYPE_COLUMN, LOG_COLUMN, INTERVAL_COLUMN };

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
    public RulesLoggerTable(Composite parent, int style) {
        this(parent, style, false);
    }

    /**
     * Constructor.
     * 
     * @param parent composite parent
     * @param style any SWT style bits
     * @param isReadOnly boolean flag
     */
    public RulesLoggerTable(Composite parent, int style, boolean isReadOnly) {
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

        TableColumn typeColumn = new TableColumn(_propertyTreeTable.getTable(), SWT.LEFT);
        typeColumn.setText(Messages.label_type);
        tableLayout.setColumnData(typeColumn, new ColumnWeightData(100, 150, true));
        TableColumn logColumn = new TableColumn(_propertyTreeTable.getTable(), SWT.LEFT);
        logColumn.setText(Messages.label_log);
        tableLayout.setColumnData(logColumn, new ColumnWeightData(100, 150, true));
        TableColumn intervalColumn = new TableColumn(_propertyTreeTable.getTable(), SWT.LEFT);
        intervalColumn.setText(Messages.label_interval);
        tableLayout.setColumnData(intervalColumn, new ColumnWeightData(100, 150, true));

        _propertyTreeTable.setColumnProperties(TREE_COLUMNS);

        _propertyTreeTable.setLabelProvider(new PropertyTreeLabelProvider());

        _propertyTreeTable.setContentProvider(new PropertyTreeContentProvider());

        _propertyTreeTable.setCellModifier(this);
        _propertyTreeTable.setCellEditors(new CellEditor[] {
                new ComboBoxCellEditor(_propertyTreeTable.getTable(), new String[] {LoggerType.CONSOLE.getLiteral(),
                        LoggerType.FILE.getLiteral(), LoggerType.THREADEDFILE.getLiteral() }),
                new TextCellEditor(_propertyTreeTable.getTable()),
                new EDataTypeCellEditor(RulesPackage.eINSTANCE.getLoggerType1_Interval().getEAttributeType(),
                        _propertyTreeTable.getTable()) });

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
        if (getTargetObject() instanceof RulesImplementationType) {
            final RulesImplementationType impl = (RulesImplementationType) getTargetObject();
            final LoggerType1 newLogger = RulesFactory.eINSTANCE.createLoggerType1();
            newLogger.setLog("NewLogger"); //$NON-NLS-1$
            if (impl.eContainer() != null) {
                TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        if (impl.getLoggers() == null) {
                            impl.setLoggers(RulesFactory.eINSTANCE.createLoggersType());
                        }
                        impl.getLoggers().getLogger().add(newLogger);
                        getTableViewer().refresh(true);
                    }
                });
            } else {
                if (impl.getLoggers() == null) {
                    impl.setLoggers(RulesFactory.eINSTANCE.createLoggersType());
                }
                impl.getLoggers().getLogger().add(newLogger);
                getTableViewer().refresh(true);
            }
            fireChangedEvent(this);
        }
    }

    /**
     * Remove a property from the list
     */
    protected void removeFromList() {
        if (getTargetObject() instanceof RulesImplementationType) {
            final RulesImplementationType impl = (RulesImplementationType) getTargetObject();
            final LoggerType1 actionToRemove = getTableSelection();
            if (impl.eContainer() != null) {
                TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        impl.getLoggers().getLogger().remove(actionToRemove);
                        if (impl.getLoggers().getLogger().isEmpty()) {
                            impl.setLoggers(null);
                        }
                        getTableViewer().refresh(true);
                    }
                });
            } else {
                impl.getLoggers().getLogger().remove(actionToRemove);
                if (impl.getLoggers().getLogger().isEmpty()) {
                    impl.setLoggers(null);
                }
                getTableViewer().refresh(true);
            }
            fireChangedEvent(this);
        }
    }

    protected LoggerType1 getTableSelection() {
        if (_propertyTreeTable != null && !_propertyTreeTable.getSelection().isEmpty()) {
            IStructuredSelection ssel = (IStructuredSelection) _propertyTreeTable.getSelection();
            if (ssel.getFirstElement() instanceof LoggerType1) {
                return (LoggerType1) ssel.getFirstElement();
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
        if (element instanceof LoggerType1) {
            LoggerType1 logger = (LoggerType1) element;
            if (property.equalsIgnoreCase(LOG_COLUMN) 
                    && (logger.getType().equals(LoggerType.THREADEDFILE) 
                            || logger.getType().equals(LoggerType.FILE))) {
                return true;
            } else if (property.equalsIgnoreCase(INTERVAL_COLUMN)
                && (logger.getType().equals(LoggerType.THREADEDFILE))) {
                return true;
            } else if (property.equalsIgnoreCase(TYPE_COLUMN)) {
                return true;
            }
            return false;
        }
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
        if (element instanceof LoggerType1 && property.equalsIgnoreCase(LOG_COLUMN)) {
            if (((LoggerType1) element).getLog() != null) {
                return ((LoggerType1) element).getLog();
            } else {
                return ""; //$NON-NLS-1$
            }
        } else if (element instanceof LoggerType1 && property.equalsIgnoreCase(TYPE_COLUMN)) {
            return new Integer(((LoggerType1) element).getType().getValue());
        } else if (element instanceof LoggerType1 && property.equalsIgnoreCase(INTERVAL_COLUMN)) {
            return ((LoggerType1) element).getInterval();
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
        if (element instanceof TableItem && property.equalsIgnoreCase(LOG_COLUMN)) {
            final TableItem ti = (TableItem) element;
            if (getTargetObject() instanceof RulesImplementationType) {
                final RulesImplementationType impl = (RulesImplementationType) getTargetObject();
                final LoggerType1 parm = (LoggerType1) ti.getData();
                if ((value == null && parm.getLog() == null) || (value != null && value.equals(parm.getLog()))) {
                    return;
                }
                if (impl.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            parm.setLog((String) value);
                            getTableViewer().refresh(true);
                        }
                    });
                } else {
                    parm.setLog((String) value);
                    getTableViewer().refresh(true);
                }
            }
            fireChangedEvent(this);
            // validate();
        } else if (element instanceof TableItem && property.equalsIgnoreCase(TYPE_COLUMN)) {
            final TableItem ti = (TableItem) element;
            if (getTargetObject() instanceof RulesImplementationType) {
                final RulesImplementationType impl = (RulesImplementationType) getTargetObject();
                if (impl.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            LoggerType1 parm = (LoggerType1) ti.getData();
                            LoggerType atype = LoggerType.get(((Integer) value).intValue());
                            parm.setType(atype);
                            if (atype.equals(LoggerType.FILE)) {
                                parm.setInterval(null);
                            } else if (!atype.equals(LoggerType.THREADEDFILE)) {
                                parm.setLog(null);
                                parm.setInterval(null);
                            }
                            getTableViewer().refresh(true);
                        }
                    });
                } else {
                    LoggerType1 parm = (LoggerType1) ti.getData();
                    LoggerType atype = LoggerType.get(((Integer) value).intValue());
                    parm.setType(atype);
                    if (atype.equals(LoggerType.FILE)) {
                        parm.setInterval(null);
                    } else if (!atype.equals(LoggerType.THREADEDFILE)) {
                        parm.setLog(null);
                        parm.setInterval(null);
                    }
                    getTableViewer().refresh(true);
                }
            }
            fireChangedEvent(this);
            // validate();
        } else if (element instanceof TableItem && property.equalsIgnoreCase(INTERVAL_COLUMN)) {
            final TableItem ti = (TableItem) element;
            if (getTargetObject() instanceof RulesImplementationType) {
                final RulesImplementationType impl = (RulesImplementationType) getTargetObject();
                if (impl.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            LoggerType1 parm = (LoggerType1) ti.getData();
                            parm.setInterval((BigInteger) value);
                            getTableViewer().refresh(true);
                        }
                    });
                } else {
                    LoggerType1 parm = (LoggerType1) ti.getData();
                    parm.setInterval((BigInteger) value);
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
