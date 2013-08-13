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

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
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
import org.switchyard.tools.models.switchyard1_0.rules.ResourceType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesFactory;
import org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType;
import org.switchyard.tools.ui.editor.diagram.shared.TableColumnLayout;

/**
 * @author bfitzpat
 * 
 */
public class RulesResourceTable extends Composite {

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
                if (bpmImpl.getManifest() != null && bpmImpl.getManifest().getResources() != null) {
                    return bpmImpl.getManifest().getResources().getResource().toArray();
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
            if (element instanceof ResourceType && property.equalsIgnoreCase(LOCATION_COLUMN)) {
                return true;
            } else if (element instanceof ResourceType && property.equalsIgnoreCase(TYPE_COLUMN)) {
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
            if (element instanceof ResourceType && columnIndex == 0) {
                return ((ResourceType) element).getLocation();
            } else if (element instanceof ResourceType && columnIndex == 1) {
                return ((ResourceType) element).getType();
            }
            return null;
        }
    }

    private TableViewer _propertyTreeTable;

    /**
     * Value column.
     */
    public static final String LOCATION_COLUMN = "location";
    /**
     * Entry point column.
     */
    public static final String TYPE_COLUMN = "type";

    private static final String[] TREE_COLUMNS = new String[] {LOCATION_COLUMN, TYPE_COLUMN };

    private Button _mAddButton;
    private Button _mRemoveButton;
    private boolean _isReadOnly = false;
    private EObject _targetObj = null;
    private String _mWarning = null;
    private ListenerList _changeListeners;

    private String[] _resourceTypeList = 
            new String[] {"BPMN", "BPMN2", "BRL", "CHANGE_SET", 
            "DESCR", "DRF", "DRL", "DSL", "DSLR", "DTABLE", "PMML", "PKG", "WID", "XDRL"};

    /**
     * Constructor.
     * 
     * @param parent Composite parent
     * @param style any SWT style bits to pass along
     */
    public RulesResourceTable(Composite parent, int style) {
        this(parent, style, false);
    }

    /**
     * Constructor.
     * 
     * @param parent composite parent
     * @param style any SWT style bits
     * @param isReadOnly boolean flag
     */
    public RulesResourceTable(Composite parent, int style, boolean isReadOnly) {
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
        GridData gd11 = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2);
        gd11.heightHint = 100;
        tableComposite.setLayoutData(gd11);

        _propertyTreeTable = new TableViewer(tableComposite, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.FULL_SELECTION
                | additionalStyles);
        _propertyTreeTable.getTable().setHeaderVisible(true);

        TableColumnLayout tableLayout = new TableColumnLayout();
        tableComposite.setLayout(tableLayout);

        TableViewerColumn locationColumn = new TableViewerColumn(_propertyTreeTable, SWT.LEFT);
        locationColumn.getColumn().setText("Resource");
        tableLayout.setColumnData(locationColumn.getColumn(), new ColumnWeightData(300, 150, true));
        locationColumn.setEditingSupport(new ResourceColumnEditingSupport(_propertyTreeTable));
        
        TableViewerColumn typeColumn = new TableViewerColumn(_propertyTreeTable, SWT.LEFT);
        typeColumn.getColumn().setText("Type");
        typeColumn.setEditingSupport(new TypeColumnEditingSupport(_propertyTreeTable));
        tableLayout.setColumnData(typeColumn.getColumn(), new ColumnWeightData(100, 50, true));

        _propertyTreeTable.setColumnProperties(TREE_COLUMNS);

        _propertyTreeTable.setLabelProvider(new PropertyTreeLabelProvider());

        _propertyTreeTable.setContentProvider(new PropertyTreeContentProvider());

        _mAddButton = new Button(this, SWT.NONE);
        _mAddButton.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, false, false));
        _mAddButton.setText("Add");
        _mAddButton.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                addPropertyToList(true);
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
    protected void addPropertyToList(boolean isRules) {
        if (getTargetObject() instanceof RulesImplementationType) {
            final RulesImplementationType impl = (RulesImplementationType) getTargetObject();
            final ResourceType newAction = RulesFactory.eINSTANCE.createResourceType();
            if (isRules) {
                newAction.setLocation("rules.drl");
                newAction.setType("DRL");
            } else {
                newAction.setLocation("process.bpmn2");
                newAction.setType("BPMN2");
            }
            if (impl.eContainer() != null) {
                TransactionalEditingDomain domain = 
                        (TransactionalEditingDomain) AdapterFactoryEditingDomain.getEditingDomainFor(impl);
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        if (impl.getManifest() == null) {
                            impl.setManifest(RulesFactory.eINSTANCE.createManifestType());
                            impl.getManifest().setResources(RulesFactory.eINSTANCE.createResourcesType());
                        } else if (impl.getManifest().getResources() == null) {
                            impl.getManifest().setResources(RulesFactory.eINSTANCE.createResourcesType());
                        }
                        impl.getManifest().getResources().getResource().add(newAction);
                        getTableViewer().refresh(true);
                    }
                });
            } else {
                if (impl.getManifest() == null) {
                    impl.setManifest(RulesFactory.eINSTANCE.createManifestType());
                    impl.getManifest().setResources(RulesFactory.eINSTANCE.createResourcesType());
                } else if (impl.getManifest().getResources() == null) {
                    impl.getManifest().setResources(RulesFactory.eINSTANCE.createResourcesType());
                }
                impl.getManifest().getResources().getResource().add(newAction);
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
            final ResourceType actionToRemove = getTableSelection();
            if (impl.eContainer() != null) {
                TransactionalEditingDomain domain = 
                        (TransactionalEditingDomain) AdapterFactoryEditingDomain.getEditingDomainFor(impl);
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        impl.getManifest().getResources().getResource().remove(actionToRemove);
                        if (impl.getManifest().getResources().getResource().isEmpty()) {
                            impl.getManifest().setResources(null);
                        }
                        getTableViewer().refresh(true);
                    }
                });
            } else {
                impl.getManifest().getResources().getResource().remove(actionToRemove);
                if (impl.getManifest().getResources().getResource().isEmpty()) {
                    impl.getManifest().setResources(null);
                }
                getTableViewer().refresh(true);
            }
            fireChangedEvent(this);
        }
    }

    protected ResourceType getTableSelection() {
        if (_propertyTreeTable != null && !_propertyTreeTable.getSelection().isEmpty()) {
            IStructuredSelection ssel = (IStructuredSelection) _propertyTreeTable.getSelection();
            if (ssel.getFirstElement() instanceof ResourceType) {
                return (ResourceType) ssel.getFirstElement();
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

    protected TableViewer getTableViewer() {
        return this._propertyTreeTable;
    }

    private class TypeColumnEditingSupport extends EditingSupport {

        public TypeColumnEditingSupport(TableViewer viewer) {
            super(viewer);
        }

        @Override
        protected CellEditor getCellEditor(Object element) {
            if (element instanceof ResourceType) {
                return new ComboBoxCellEditor(
                        _propertyTreeTable.getTable(), 
                        _resourceTypeList, SWT.READ_ONLY);
            }
            return null;
        }

        @Override
        protected boolean canEdit(Object element) {
            return true;
        }

        @Override
        protected Object getValue(Object element) {
            if (element instanceof ResourceType) {
                ResourceType resType = (ResourceType) element;
                String resTypeStr = resType.getType();
                for (int i = 0; i < _resourceTypeList.length; i++) {
                    String array_element = _resourceTypeList[i];
                    if (array_element.equalsIgnoreCase(resTypeStr)) {
                        return i;
                    }
                }
                return 0;
            }            
            return null;
        }

        @Override
        protected void setValue(final Object element, final Object value) {
            TransactionalEditingDomain domain = 
                    (TransactionalEditingDomain) AdapterFactoryEditingDomain.getEditingDomainFor(element);
            domain.getCommandStack().execute(new RecordingCommand(domain) {
                @Override
                protected void doExecute() {
                    ResourceType parm = (ResourceType) element;
                    Integer intVal = (Integer) value;
                    parm.setType(_resourceTypeList[intVal.intValue()]);
                }
            });
            fireChangedEvent(_propertyTreeTable);
            getTableViewer().refresh(true);
        }
    }

    private class ResourceColumnEditingSupport extends EditingSupport {

        public ResourceColumnEditingSupport(TableViewer viewer) {
            super(viewer);
        }

        @Override
        protected CellEditor getCellEditor(Object element) {
            if (element instanceof ResourceType) {
                return new TextCellEditor(_propertyTreeTable.getTable());
            }
            return null;
        }

        @Override
        protected boolean canEdit(Object element) {
            return true;
        }

        @Override
        protected Object getValue(Object element) {
            if (element instanceof ResourceType) {
                ResourceType resType = (ResourceType) element;
                return resType.getLocation();
            }            
            return null;
        }

        @Override
        protected void setValue(final Object element, final Object value) {
            TransactionalEditingDomain domain = 
                    (TransactionalEditingDomain) AdapterFactoryEditingDomain.getEditingDomainFor(element);
            domain.getCommandStack().execute(new RecordingCommand(domain) {
                @Override
                protected void doExecute() {
                    ResourceType parm = (ResourceType) element;
                    String strVal = (String) value;
                    parm.setLocation(strVal);
                }
            });
            fireChangedEvent(_propertyTreeTable);
            getTableViewer().refresh(true);
        }
    }
}
