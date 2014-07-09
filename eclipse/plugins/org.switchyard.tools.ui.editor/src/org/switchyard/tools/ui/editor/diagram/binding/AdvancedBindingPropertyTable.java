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
package org.switchyard.tools.ui.editor.diagram.binding;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.CellEditorProperties;
import org.eclipse.jface.databinding.viewers.ObservableValueEditingSupport;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewerEditor;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.FocusCellOwnerDrawHighlighter;
import org.eclipse.jface.viewers.ICellEditorValidator;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TableViewerEditor;
import org.eclipse.jface.viewers.TableViewerFocusCellManager;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.EMFUpdateValueStrategyNullForEmptyString;

/**
 * @author bfitzpat
 * 
 */
public class AdvancedBindingPropertyTable extends Composite {

    private class PropertyValueEditingSupport extends ObservableValueEditingSupport {
        private final TableViewer _viewer;
        private final DataBindingContext _context;
        private PropertyObject _lastPO;

        public PropertyValueEditingSupport(TableViewer viewer, DataBindingContext context) {
            super(viewer, context);
            _viewer = viewer;
            _context = context;
        }

        @Override
        protected CellEditor getCellEditor(Object element) {
            if (element instanceof PropertyObject) {
                PropertyObject po = (PropertyObject) element;
                EStructuralFeature feature = getFeature(po.getEObject(), po.getFeatureName());
                if (feature != null) {
                    CellEditor ce = null;
                    String type = feature.getEType().getName();
                    System.out.println("Creating cell editor for: " + type); //$NON-NLS-1$
                    boolean isEnum = feature.getEType().getInstanceClass().isEnum();
                    if (type.equalsIgnoreCase("String") || type.equalsIgnoreCase("AnyURI") //$NON-NLS-1$ //$NON-NLS-2$
                            || type.equalsIgnoreCase("PropInteger")  //$NON-NLS-1$
                            || type.equalsIgnoreCase("PropLong")) { //$NON-NLS-1$
                        ce = new TextCellEditor(_viewer.getTable());
                    } else if (type.equalsIgnoreCase("BooleanObject") || type.equalsIgnoreCase("Boolean")) { //$NON-NLS-1$ //$NON-NLS-2$
                        if (feature.getDefaultValueLiteral() == null) {
                            ce = new ComboBoxCellEditor(_viewer.getTable(), new String[] {"false", "true", "" }, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                                    SWT.READ_ONLY);
                        } else {
                            ce = new ComboBoxCellEditor(_viewer.getTable(), new String[] {"false", "true" }, //$NON-NLS-1$ //$NON-NLS-2$
                                    SWT.READ_ONLY);
                        }
                    } else if ((type.equalsIgnoreCase("Integer") || type.equalsIgnoreCase("IntObject") || type.equalsIgnoreCase("Int"))) { //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        ce = new TextCellEditor(_viewer.getTable());
                        ce.setValidator(new ICellEditorValidator() {
                            @Override
                            public String isValid(Object value) {
                                if (value instanceof String) {
                                    String string = (String) value;
                                    char[] chars = new char[string.length()];
                                    string.getChars(0, chars.length, chars, 0);
                                    for (int i = 0; i < chars.length; i++) {
                                        if (!('0' <= chars[i] && chars[i] <= '9')) {
                                            return Messages.error_invalidInteger;
                                        }
                                    }
                                }
                                return null;
                            }
                        });
                    } else if (type.equalsIgnoreCase("BigInteger")) { //$NON-NLS-1$
                        ce = new TextCellEditor(_viewer.getTable());
                        ce.setValidator(new ICellEditorValidator() {
                            @Override
                            public String isValid(Object value) {
                                if (value instanceof String) {
                                    String string = (String) value;
                                    char[] chars = new char[string.length()];
                                    string.getChars(0, chars.length, chars, 0);
                                    for (int i = 0; i < chars.length; i++) {
                                        if (!('0' <= chars[i] && chars[i] <= '9')) {
                                            return Messages.error_invalidBigInteger;
                                        }
                                    }
                                }
                                return null;
                            }
                        });
                    } else if (type.equalsIgnoreCase("LongObject") || type.equalsIgnoreCase("Long")) { //$NON-NLS-1$ //$NON-NLS-2$
                        ce = new TextCellEditor(_viewer.getTable());
                        ce.setValidator(new ICellEditorValidator() {
                            @Override
                            public String isValid(Object value) {
                                if (value instanceof String) {
                                    String string = (String) value;
                                    char[] chars = new char[string.length()];
                                    string.getChars(0, chars.length, chars, 0);
                                    for (int i = 0; i < chars.length; i++) {
                                        if (!('0' <= chars[i] && chars[i] <= '9')) {
                                            return Messages.error_invalidLongValue;
                                        }
                                    }
                                }
                                return null;
                            }
                        });
                    } else {
                        if (isEnum) {
                            ArrayList<String> values = new ArrayList<String>();
                            Object[] enums = feature.getEType().getInstanceClass().getEnumConstants();
                            for (Object enumItem : enums) {
                                values.add(enumItem.toString());
                            }
                            ce = new ComboBoxCellEditor(_viewer.getTable(), (String[]) values.toArray(new String[values
                                    .size()]), SWT.READ_ONLY);
                        }
                    }
                    // ce.setFocus();
                    return ce;
                }
            }
            return null;
        }

        @Override
        protected IObservableValue doCreateCellEditorObservable(CellEditor cellEditor) {
            if (cellEditor.getControl() instanceof CCombo) {
                IObservableValue ccomboObservable =
                        SWTObservables.observeSelection(cellEditor.getControl());
                return ccomboObservable;
            }
            
            return CellEditorProperties.control()
                    .value(WidgetProperties.text(new int[] {SWT.DefaultSelection, SWT.FocusOut, SWT.Modify }))
                    .observe(cellEditor);
        }

        @Override
        protected IObservableValue doCreateElementObservable(Object element, ViewerCell cell) {
            _lastPO = (PropertyObject) element;
            final EStructuralFeature feature = _lastPO.getEObject().eClass().getEStructuralFeature(_lastPO.getFeatureName());
            final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(_lastPO.getEObject());
            if (domain == null) {
                return EMFProperties.value(feature).observe(_lastPO.getEObject());
            }
            return EMFEditProperties.value(domain, feature).observe(_lastPO.getEObject());
        }

        @Override
        protected Binding createBinding(IObservableValue target, IObservableValue model) {
            // Need to use the EMF updater to handle conversions
            final Binding binding = _context.bindValue(target, model, new EMFUpdateValueStrategyNullForEmptyString(null,
                    UpdateValueStrategy.POLICY_CONVERT), null);
            model.addChangeListener(new IChangeListener() {
                @Override
                public void handleChange(org.eclipse.core.databinding.observable.ChangeEvent event) {
                    _propertyTreeTable.update(_lastPO, TREE_COLUMNS);
                    _lastPO = null;
                }
            });
            return binding;
        }
    }

    private class PropertyTreeContentProvider implements ITreeContentProvider {
        private List<PropertyObject> _properties;

        @Override
        public void dispose() {
        }

        @SuppressWarnings("unchecked")
        @Override
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
            if (newInput instanceof List<?>) {
                _properties = (List<PropertyObject>) newInput;
            }
        }

        @Override
        public Object[] getElements(Object inputElement) {
            if (inputElement instanceof List<?>) {
                return _properties.toArray();
            }
            return null;
        }

        @Override
        public Object[] getChildren(Object parentElement) {
            return null;
        }

        @Override
        public Object getParent(Object element) {
            if (element instanceof PropertyObject) {
                return ((PropertyObject) element).getEObject().eContainer();
            }
            return null;
        }

        @Override
        public boolean hasChildren(Object element) {
            if (element instanceof List<?>) {
                return ((List<?>) element).size() > 0;
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
            if (element instanceof PropertyObject && property.equalsIgnoreCase(NAME_COLUMN)) {
                return true;
            } else if (element instanceof PropertyObject && property.equalsIgnoreCase(VALUE_COLUMN)) {
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
            if (element instanceof PropertyObject && columnIndex == 0) {
                if (element instanceof PropertyObject) {
                    PropertyObject po = (PropertyObject) element;
                    return po.getFeatureName();
                }
                return null;
            } else if (element instanceof PropertyObject && columnIndex == 1) {
                if (element instanceof PropertyObject) {
                    PropertyObject po = (PropertyObject) element;
                    Object value = getFeatureValue(po.getEObject(), po.getFeatureName());
                    if (value == null) {
                        return ""; //$NON-NLS-1$
                    } else if (value instanceof String) {
                        return (String) value;
                    } else if (value instanceof Boolean) {
                        return ((Boolean) value).toString();
                    } else if (value instanceof Integer) {
                        return ((Integer) value).toString();
                    } else if (value instanceof Long) {
                        return ((Long) value).toString();
                    } else if (value instanceof BigInteger) {
                        return ((BigInteger) value).toString();
                    } else {
                        EStructuralFeature feature = getFeature(po.getEObject(), po.getFeatureName());
                        if (feature != null) {
                            boolean isEnum = feature.getEType().getInstanceClass().isEnum();
                            if (isEnum) {
                                Object[] enums = feature.getEType().getInstanceClass().getEnumConstants();
                                for (int i = 0; i < enums.length; i++) {
                                    if (value.equals(enums[i])) {
                                        return enums[i].toString();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    private TableViewer _propertyTreeTable;

    /**
     * Name column.
     */
    public static final String NAME_COLUMN = "name"; //$NON-NLS-1$

    /**
     * Value column.
     */
    public static final String VALUE_COLUMN = "value"; //$NON-NLS-1$
    private static final String[] TREE_COLUMNS = new String[] {NAME_COLUMN, VALUE_COLUMN };

    private EObject _targetObj = null;
    private ListenerList _changeListeners;

    AdvancedBindingPropertyTable(Composite parent, int style, DataBindingContext context) {
        super(parent, style);
        this._changeListeners = new ListenerList();

        final GridLayout gridLayout = new GridLayout();
        gridLayout.marginWidth = 0;
        gridLayout.marginHeight = 0;
        gridLayout.numColumns = 2;
        setLayout(gridLayout);

        _propertyTreeTable = new TableViewer(this, SWT.BORDER | SWT.V_SCROLL | SWT.FULL_SELECTION);
        GridData gd11 = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 2);
        gd11.heightHint = 100;
        _propertyTreeTable.getTable().setLayoutData(gd11);
        _propertyTreeTable.getTable().setHeaderVisible(true);
        TableViewerColumn nameColumn = new TableViewerColumn(_propertyTreeTable, SWT.LEFT);
        nameColumn.getColumn().setText(Messages.label_name);
        nameColumn.getColumn().setWidth(200);

        TableViewerColumn valueColumn = new TableViewerColumn(_propertyTreeTable, SWT.LEFT);
        valueColumn.getColumn().setText(Messages.label_value);
        valueColumn.getColumn().setWidth(200);
        valueColumn.setEditingSupport(new PropertyValueEditingSupport(_propertyTreeTable, context));
        
        FocusCellOwnerDrawHighlighter h = new FocusCellOwnerDrawHighlighter(_propertyTreeTable) {

            protected Color getSelectedCellBackgroundColorNoFocus(ViewerCell cell) {
                return Display.getCurrent().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND);
            }

            protected Color getSelectedCellForegroundColorNoFocus(ViewerCell cell) {
                return Display.getCurrent().getSystemColor(SWT.COLOR_WIDGET_FOREGROUND);
            }
        };

        TableViewerFocusCellManager focusCellManager = new TableViewerFocusCellManager(_propertyTreeTable,
                h);
        ColumnViewerEditorActivationStrategy actSupport = new ColumnViewerEditorActivationStrategy(_propertyTreeTable) {
            protected boolean isEditorActivationEvent(ColumnViewerEditorActivationEvent event) {
                return event.eventType == ColumnViewerEditorActivationEvent.TRAVERSAL
                        || event.eventType == ColumnViewerEditorActivationEvent.MOUSE_CLICK_SELECTION
                        || (event.eventType == ColumnViewerEditorActivationEvent.KEY_PRESSED && event.keyCode == SWT.CR)
                        || event.eventType == ColumnViewerEditorActivationEvent.PROGRAMMATIC;
            }
        };
        actSupport.setEnableEditorActivationWithKeyboard(true);

        TableViewerEditor.create(_propertyTreeTable, focusCellManager, actSupport,
                ColumnViewerEditor.TABBING_HORIZONTAL | ColumnViewerEditor.TABBING_MOVE_TO_ROW_NEIGHBOR
                        | ColumnViewerEditor.TABBING_VERTICAL | ColumnViewerEditor.KEYBOARD_ACTIVATION);

        // This really just gets the traverse events for the TABLE itself.  If there is an active cell editor, this doesn't see anything.
        _propertyTreeTable.getControl().addTraverseListener(new TraverseListener() {
            public void keyTraversed(TraverseEvent e) {
                if (e.detail == SWT.TRAVERSE_RETURN) {
                    // edit first column of selected row
                    if (!_propertyTreeTable.isCellEditorActive()) {
                        IStructuredSelection ssel = (IStructuredSelection) _propertyTreeTable.getSelection();
                        if (ssel != null && !ssel.isEmpty()) {
                            _propertyTreeTable.editElement(ssel.getFirstElement(), 1);
                        }
                    }
                }
            }
        });
        _propertyTreeTable.setComparator(new PropertyObjectViewerComparator());

        _propertyTreeTable.setColumnProperties(TREE_COLUMNS);

        _propertyTreeTable.setLabelProvider(new PropertyTreeLabelProvider());

        _propertyTreeTable.setContentProvider(new PropertyTreeContentProvider());
    }

    class PropertyObjectViewerComparator extends ViewerComparator {

        @Override
        public int compare(Viewer viewer, Object e1, Object e2) {
            if (e1 instanceof PropertyObject && e2 instanceof PropertyObject) {
                PropertyObject p1 = (PropertyObject) e1;
                PropertyObject p2 = (PropertyObject) e2;
                return p1.getFeatureName().compareTo(p2.getFeatureName());
            }
            return super.compare(viewer, e1, e2);
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

    protected TableViewer getTreeViewer() {
        return this._propertyTreeTable;
    }

    /**
     * @param eObject incoming object to retrieve
     * @param featureId feature to retrieve
     * @return object value
     */
    protected Object getFeatureValue(EObject eObject, String featureId) {
        EClass eClass = eObject.eClass();
        EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(featureId);
        if (eStructuralFeature.isChangeable()) {
            if (eStructuralFeature.getName().equalsIgnoreCase(featureId)) {
                return eObject.eGet(eStructuralFeature);
            }
        }
        return null;
    }

    /**
     * @param eObject incoming object to retrieve
     * @param featureId feature to retrieve
     * @return object value
     */
    protected EStructuralFeature getFeature(EObject eObject, String featureId) {
        EClass eClass = eObject.eClass();
        EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(featureId);
        if (eStructuralFeature.isChangeable()) {
            if (eStructuralFeature.getName().equalsIgnoreCase(featureId)) {
                return eStructuralFeature;
            }
        }
        return null;
    }

}
