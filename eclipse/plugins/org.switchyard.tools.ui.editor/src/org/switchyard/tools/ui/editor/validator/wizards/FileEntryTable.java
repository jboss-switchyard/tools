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
package org.switchyard.tools.ui.editor.validator.wizards;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
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
import org.switchyard.tools.models.switchyard1_0.validate.FileEntryType;
import org.switchyard.tools.models.switchyard1_0.validate.SchemaCatalogsType;
import org.switchyard.tools.models.switchyard1_0.validate.SchemaFilesType;

/**
 * @author bfitzpat
 * 
 */
public abstract class FileEntryTable extends Composite implements ICellModifier {

    private class FileEntryTypeTreeContentProvider implements ITreeContentProvider {
        private EList<FileEntryType> _properties;

        @Override
        public void dispose() {
        }

        @SuppressWarnings("unchecked")
        @Override
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
            if (newInput instanceof EList<?>) {
                _properties = (EList<FileEntryType>) newInput;
            } else if (newInput instanceof SchemaFilesType) {
                _properties = ((SchemaFilesType)newInput).getEntry();
            }
        }

        @Override
        public Object[] getElements(Object inputElement) {
            if (inputElement instanceof EList<?>) {
                return _properties.toArray();
            } else if (inputElement instanceof SchemaFilesType) {
                return ((SchemaFilesType)inputElement).getEntry().toArray();
            }
            return null;
        }

        @Override
        public Object[] getChildren(Object parentElement) {
            if (parentElement instanceof FileEntryType[]) {
                return new Object[] {_properties.toArray() };
            } else if (parentElement instanceof SchemaFilesType) {
                return new Object[] {((SchemaFilesType)parentElement).getEntry().toArray()};
            }
            return null;
        }

        @Override
        public Object getParent(Object element) {
            if (element instanceof FileEntryType) {
                return ((FileEntryType) element).eContainer();
            }
            return null;
        }

        @Override
        public boolean hasChildren(Object element) {
            if (element instanceof EList<?>) {
                return ((EList<?>) element).size() > 0;
            } else if (element instanceof SchemaFilesType) {
                return ((SchemaFilesType)element).getEntry().size() > 0;
            }
            return false;
        }
    }

    private class FileEntryTypeTreeLabelProvider implements ITableLabelProvider {
        @Override
        public void addListener(ILabelProviderListener listener) {
        }

        @Override
        public void dispose() {
        }

        @Override
        public boolean isLabelProperty(Object element, String property) {
            if (element instanceof FileEntryType && property.equalsIgnoreCase(FILE_COLUMN)) {
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
            if (element instanceof FileEntryType && columnIndex == 0) {
                return ((FileEntryType) element).getFile();
            }
            return null;
        }
    }

    private TreeViewer _propertyTreeTable;
    
    /**
     *  Name column.
     */
    public static final String FILE_COLUMN = "file";
    
    private static final String[] TREE_COLUMNS = new String[] {FILE_COLUMN };

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
    public FileEntryTable(Composite parent, int style) {
        this(parent, style, false);
    }

    /**
     * Constructor.
     * 
     * @param parent composite parent
     * @param style any SWT style bits
     * @param isReadOnly boolean flag
     */
    public FileEntryTable(Composite parent, int style, boolean isReadOnly) {
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
        GridData gd11 = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 5);
        gd11.heightHint = 100;
        _propertyTreeTable.getTree().setLayoutData(gd11);
        _propertyTreeTable.getTree().setHeaderVisible(true);
        TreeColumn nameColumn = new TreeColumn(_propertyTreeTable.getTree(), SWT.LEFT);
        nameColumn.setText("File");
        nameColumn.setWidth(400);

        _propertyTreeTable.setColumnProperties(TREE_COLUMNS);

        _propertyTreeTable.setLabelProvider(new FileEntryTypeTreeLabelProvider());

        _propertyTreeTable.setContentProvider(new FileEntryTypeTreeContentProvider());

        this._mAddButton = new Button(this, SWT.NONE);
        this._mAddButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
        this._mAddButton.setText("Add");
        this._mAddButton.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                addFileEntryTypeToList();
                _propertyTreeTable.refresh();
                fireChangedEvent(e.getSource());
            }
        });

        this._mAddButton.setEnabled(false);

        _propertyTreeTable.getTree().addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                updateFileEntryTypeButtons();
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

        updateFileEntryTypeButtons();
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
    protected abstract void addFileEntryTypeToList();

    /**
     * Remove a property from the list
     */
    protected abstract void removeFromList();

    /**
     * Return the current selection.
     * 
     * @return String list
     */
    @SuppressWarnings("unchecked")
    public EList<FileEntryType> getSelection() {
        if (_propertyTreeTable != null && _propertyTreeTable.getInput() != null) {
            return (EList<FileEntryType>) _propertyTreeTable.getInput();
        }
        return null;
    }
    
    /**
     * @return the currently selected FileEntryType
     */
    public FileEntryType getTableSelection() {
        if (_propertyTreeTable != null && !_propertyTreeTable.getSelection().isEmpty()) {
            IStructuredSelection ssel = (IStructuredSelection) _propertyTreeTable.getSelection();
            if (ssel.getFirstElement() instanceof FileEntryType) {
                return (FileEntryType) ssel.getFirstElement();
            }
        }
        return null;
    }

    /**
     * Update button state based on what's selected.
     */
    public void updateFileEntryTypeButtons() {
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
    public void setSelection(EList<FileEntryType> properties) {
        _propertyTreeTable.setInput(properties);
        updateFileEntryTypeButtons();
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
     * @param property FileEntryType being modified
     * @return boolean flag
     * @see org.eclipse.jface.viewers.ICellModifier#canModify(java.lang.Object, java.lang.String)
     */
    public boolean canModify(Object element, String property) {
        if (element instanceof FileEntryType && property.equalsIgnoreCase(FILE_COLUMN)) {
            return true;
        }
        return false;
    }

    /**
     * @param element Object being modified
     * @param property FileEntryType being modified
     * @return value of element property
     * @see
     * org.eclipse.jface.viewers.ICellModifier#getValue(java.lang.Object ,
     * java.lang.String)
     */
    public Object getValue(Object element, String property) {
        if (element instanceof FileEntryType && property.equalsIgnoreCase(FILE_COLUMN)) {
            return ((FileEntryType) element).getFile();
        }
        return null;
    }

    /**
     * @param element Object being modified
     * @param property FileEntryType being modified
     * @param value New property value
     *
     * @see org.eclipse.jface.viewers.ICellModifier#modify(java.lang.Object,
     * java.lang.String, java.lang.Object)
     */
    public void modify(Object element, String property, final Object value) {
        if (element instanceof TreeItem && property.equalsIgnoreCase(FILE_COLUMN)) {
            final TreeItem ti = (TreeItem) element;
            if (getTargetObject() instanceof SchemaFilesType) {
                final SchemaFilesType domainType = (SchemaFilesType) getTargetObject();
                if (domainType.eContainer() != null) {
                    TransactionalEditingDomain domain = (TransactionalEditingDomain) AdapterFactoryEditingDomain.getEditingDomainFor(domainType);
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            FileEntryType parm = (FileEntryType) ti.getData();
                            setFeatureValue(parm, "file", value);
                            getTreeViewer().refresh(true);
                        }
                    });
                } else {
                    FileEntryType parm = (FileEntryType) ti.getData();
                    setFeatureValue(parm, "file", value);
                    getTreeViewer().refresh(true);
                }
            } else if (getTargetObject() instanceof SchemaCatalogsType) {
                final SchemaCatalogsType securityType = (SchemaCatalogsType) getTargetObject();
                if (securityType.eContainer() != null) {
                    TransactionalEditingDomain domain = (TransactionalEditingDomain) AdapterFactoryEditingDomain.getEditingDomainFor(securityType);
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            FileEntryType parm = (FileEntryType) ti.getData();
                            setFeatureValue(parm, "file", value);
                            getTreeViewer().refresh(true);
                        }
                    });
                } else {
                    FileEntryType parm = (FileEntryType) ti.getData();
                    setFeatureValue(parm, "file", value);
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
