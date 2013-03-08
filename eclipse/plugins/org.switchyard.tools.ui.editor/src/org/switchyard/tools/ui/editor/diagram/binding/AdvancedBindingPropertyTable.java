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
import java.util.Iterator;
import java.util.List;

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
import org.eclipse.jface.viewers.ColumnViewerEditor;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.FocusCellOwnerDrawHighlighter;
import org.eclipse.jface.viewers.ICellEditorValidator;
import org.eclipse.jface.viewers.ICellModifier;
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
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TreeItem;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.Property;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class AdvancedBindingPropertyTable extends Composite implements ICellModifier {

    private class PropertyValueEditingSupport extends EditingSupport {
        private final TableViewer _viewer;

        public PropertyValueEditingSupport(TableViewer viewer) {
            super(viewer);
            this._viewer = viewer;
        }

        @Override
        protected CellEditor getCellEditor(Object element) {
            if (element instanceof PropertyObject) {
                PropertyObject po = (PropertyObject) element;
                EStructuralFeature feature = getFeature(po.getEObject(), po.getFeatureName());
                if (feature != null) {
                    CellEditor ce = null;
                    String type = feature.getEType().getName();
                    System.out.println("Creating cell editor for: " + type);
                    boolean isEnum = feature.getEType().getInstanceClass().isEnum();
                    if (type.equalsIgnoreCase("String") || type.equalsIgnoreCase("AnyURI")
                            || type.equalsIgnoreCase("PropInteger") 
                            || type.equalsIgnoreCase("PropLong")) {
                        ce = new TextCellEditor(_viewer.getTable());
                    } else if (type.equalsIgnoreCase("BooleanObject") || type.equalsIgnoreCase("Boolean")) {
                        if (feature.getDefaultValueLiteral() == null) {
                            ce = new ComboBoxCellEditor(_viewer.getTable(), new String[] {"false", "true", "" },
                                    SWT.READ_ONLY);
                        } else {
                            ce = new ComboBoxCellEditor(_viewer.getTable(), new String[] {"false", "true" },
                                    SWT.READ_ONLY);
                        }
                    } else if ((type.equalsIgnoreCase("Integer") || type.equalsIgnoreCase("IntObject") || type.equalsIgnoreCase("Int"))) {
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
                                            return "Invalid Integer value";
                                        }
                                    }
                                }
                                return null;
                            }
                        });
                    } else if (type.equalsIgnoreCase("BigInteger")) {
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
                                            return "Invalid BigInteger value";
                                        }
                                    }
                                }
                                return null;
                            }
                        });
                    } else if (type.equalsIgnoreCase("LongObject") || type.equalsIgnoreCase("Long")) {
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
                                            return "Invalid Long value";
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
        protected boolean canEdit(Object element) {
            if (element instanceof PropertyObject) {
                return true;
            }
            return false;
        }

        @Override
        protected Object getValue(Object element) {
            if (element instanceof PropertyObject) {
                PropertyObject po = (PropertyObject) element;
                Object value = getFeatureValue(po.getEObject(), po.getFeatureName());
                EStructuralFeature feature = getFeature(po.getEObject(), po.getFeatureName());
                if (feature != null) {
                    String type = feature.getEType().getName();
                    boolean isEnum = feature.getEType().getInstanceClass().isEnum();
                    if (type.equalsIgnoreCase("BooleanObject") && value == null) {
                        return new Integer(2);
                    } else if (value == null) {
                        return "";
                    } else if (value instanceof Boolean) {
                        Boolean bool = (Boolean) value;
                        if (bool.booleanValue()) {
                            return 1;
                        } else if (!bool.booleanValue()) {
                            return 0;
                        }
                        return 2;
                    } else if (value instanceof Integer) {
                        if (type.equalsIgnoreCase("BooleanObject")) {
                            Integer intValue = (Integer) value;
                            if (intValue.intValue() == 0) {
                                return "false";
                            } else if (intValue.intValue() == 1) {
                                return "true";
                            } else {
                                return "";
                            }
                        } else if (type.equalsIgnoreCase("IntObject") || type.equalsIgnoreCase("Int")) {
                            return ((Integer) value).toString();
                        }
                        return value;
                    } else if (value instanceof Long) {
                        Long longValue = (Long) value;
                        return longValue.toString();
                    } else if (feature.getEType().getInstanceClass().isAssignableFrom(BigInteger.class)) {
                        BigInteger bigIntValue = (BigInteger) value;
                        return bigIntValue.toString();
                    } else if (isEnum) {
                        Object[] enums = feature.getEType().getInstanceClass().getEnumConstants();
                        for (int i = 0; i < enums.length; i++) {
                            if (value.equals(enums[i])) {
                                return new Integer(i);
                            }
                        }
                    }
                    return value;
                }
            }
            return null;
        }

        @Override
        protected void setValue(Object element, Object value) {
            if (element instanceof PropertyObject) {
                PropertyObject po = (PropertyObject) element;
                EStructuralFeature feature = getFeature(po.getEObject(), po.getFeatureName());
                if (feature != null) {
                    String type = feature.getEType().getName();
                    boolean isEnum = feature.getEType().getInstanceClass().isEnum();
                    Object realValue = null;
                    if (type.equalsIgnoreCase("String") || type.equalsIgnoreCase("AnyURI")
                            || type.equalsIgnoreCase("PropInteger") 
                            || type.equalsIgnoreCase("PropLong")) {
                        if (((String) value).trim().isEmpty()) {
                            realValue = null;
                        } else {
                            realValue = (String) value;
                        }
                    } else if (type.equalsIgnoreCase("BooleanObject") || type.equalsIgnoreCase("Boolean")) {
                        Integer num = (Integer) value;
                        if (num.intValue() == 0) {
                            value = "false";
                            realValue = Boolean.parseBoolean((String) value);
                        } else if (num.intValue() == 1) {
                            value = "true";
                            realValue = Boolean.parseBoolean((String) value);
                        } else {
                            realValue = null;
                        }
                    } else if ((type.equalsIgnoreCase("Integer") || type.equalsIgnoreCase("IntObject") || type.equalsIgnoreCase("Int"))) {
                        if (((String) value).trim().isEmpty()) {
                            realValue = null;
                        } else if (feature.getEType().getInstanceClass().isAssignableFrom(BigInteger.class)) {
                            try {
                                realValue = new BigInteger((String) value);
                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                            }
                        } else {
                            realValue = Integer.parseInt((String) value);
                        }
                    } else if (type.equalsIgnoreCase("LongObject") || type.equalsIgnoreCase("Long")) {
                        if (((String) value).trim().isEmpty()) {
                            realValue = null;
                        } else {
                            realValue = new Long((String) value);
                        }
                    } else if (isEnum) {
                        Integer valueStr = (Integer) value;
                        Object[] enums = feature.getEType().getInstanceClass().getEnumConstants();
                        if (valueStr.intValue() < enums.length) {
                            realValue = enums[valueStr.intValue()];
                        } else {
                            realValue = null;
                        }
                    }
                    if (getFeatureValue(po.getEObject(), po.getFeatureName()) != realValue) {
                        if (realValue != null) {
                            updateFeature(po.getEObject(), po.getFeatureName(), realValue);
                        } else {
                            if (feature.isUnsettable()) {
                                unsetFeature(po.getEObject(), po.getFeatureName());
                            } else {
                                updateFeature(po.getEObject(), po.getFeatureName(), null);
                            }
                        }
                    }
                }
            }
            _viewer.update(element, null);
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
                        return "";
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
    public static final String NAME_COLUMN = "name";

    /**
     * Value column.
     */
    public static final String VALUE_COLUMN = "value";
    private static final String[] TREE_COLUMNS = new String[] {NAME_COLUMN, VALUE_COLUMN };

    private EObject _targetObj = null;
    private String _mWarning = null;
    private ListenerList _changeListeners;

    /**
     * Constructor.
     * 
     * @param parent composite parent
     * @param style any SWT style bits
     */
    public AdvancedBindingPropertyTable(Composite parent, int style) {
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
        nameColumn.getColumn().setText("Name");
        nameColumn.getColumn().setWidth(200);

        TableViewerColumn valueColumn = new TableViewerColumn(_propertyTreeTable, SWT.LEFT);
        valueColumn.getColumn().setText("Value");
        valueColumn.getColumn().setWidth(200);
        valueColumn.setEditingSupport(new PropertyValueEditingSupport(_propertyTreeTable));
        
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

    @Override
    public void dispose() {
        super.dispose();
    }

    @Override
    protected void checkSubclass() {
        // empty
    }

    /**
     * Return the current selection.
     * 
     * @return String list
     */
    @SuppressWarnings("unchecked")
    public List<PropertyObject> getSelection() {
        if (_propertyTreeTable != null && _propertyTreeTable.getInput() != null) {
            return (List<PropertyObject>) _propertyTreeTable.getInput();
        }
        return null;
    }

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
     * @param properties incoming property list
     */
    public void setSelection(EList<Property> properties) {
        _propertyTreeTable.setInput(properties);
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

    protected void unsetFeatureValue(EObject eObject, String featureId) {
        EClass eClass = eObject.eClass();
        for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
            EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
            if (eStructuralFeature.isChangeable()) {
                if (eStructuralFeature.getName().equalsIgnoreCase(featureId)) {
                    eObject.eUnset(eStructuralFeature);
                    break;
                }
            }
        }
    }

    /**
     * @param element Object being modified
     * @param property Property being modified
     * @return boolean flag
     * @see org.eclipse.jface.viewers.ICellModifier#canModify(java.lang.Object,
     *      java.lang.String)
     */
    public boolean canModify(Object element, String property) {
        if (element instanceof Property && property.equalsIgnoreCase(VALUE_COLUMN)) {
            return true;
        }
        return false;
    }

    /**
     * @param element Object being modified
     * @param property Property being modified
     * @return value of element property
     * @see org.eclipse.jface.viewers.ICellModifier#getValue(java.lang.Object ,
     *      java.lang.String)
     */
    public Object getValue(Object element, String property) {
        if (element instanceof Property && property.equalsIgnoreCase(VALUE_COLUMN)) {
            return ((Property) element).getValue();
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
        if (element instanceof TreeItem && property.equalsIgnoreCase(VALUE_COLUMN)) {
            final TreeItem ti = (TreeItem) element;
            if (getTargetObject() instanceof JCABinding) {
                final JCABinding binding = (JCABinding) getTargetObject();
                if (binding.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            Property parm = (Property) ti.getData();
                            setFeatureValue(parm, "value", value);
                            getTreeViewer().refresh(true);
                        }
                    });
                } else {
                    Property parm = (Property) ti.getData();
                    setFeatureValue(parm, "value", value);
                    getTreeViewer().refresh(true);
                }
            }
            fireChangedEvent(this);
            // validate();
        }
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
        for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
            EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
            if (eStructuralFeature.isChangeable()) {
                if (eStructuralFeature.getName().equalsIgnoreCase(featureId)) {
                    return eObject.eGet(eStructuralFeature);
                }
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
        for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
            EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
            if (eStructuralFeature.isChangeable()) {
                if (eStructuralFeature.getName().equalsIgnoreCase(featureId)) {
                    return eStructuralFeature;
                }
            }
        }
        return null;
    }

    /**
     * @author bfitzpat
     */
    public class BasicEObjectOperation extends ModelOperation {

        private EObject _localObject;
        private String _localFeature;
        private Object _localValue;

        /**
         * @param object incoming object
         * @param featureId feature id
         * @param value incoming value
         */
        public BasicEObjectOperation(EObject object, String featureId, Object value) {
            _localObject = object;
            _localFeature = featureId;
            _localValue = value;
        }

        @Override
        public void run() throws Exception {
            try {
                if (_localValue instanceof String && ((String) _localValue).length() == 0) {
                    setFeatureValue(_localObject, _localFeature, null);
                } else {
                    setFeatureValue(_localObject, _localFeature, _localValue);
                }
            } catch (Exception e) {
                throw e;
            }
        }
    }

    /**
     * @author bfitzpat
     */
    public class BasicUnsetEObjectOperation extends ModelOperation {

        private EObject _localObject;
        private String _localFeature;

        /**
         * @param object incoming object
         * @param featureId feature id
         */
        public BasicUnsetEObjectOperation(EObject object, String featureId) {
            _localObject = object;
            _localFeature = featureId;
        }

        @Override
        public void run() throws Exception {
            try {
                unsetFeatureValue(_localObject, _localFeature);
            } catch (Exception e) {
                throw e;
            }
        }
    }

    protected void wrapOperation(final EObject eobject, final List<ModelOperation> ops) {
        TransactionalEditingDomain domain = getDomain(eobject);
        if (domain != null) {
            domain.getCommandStack().execute(new RecordingCommand(domain) {
                @Override
                protected void doExecute() {
                    Iterator<ModelOperation> execOps = ops.iterator();
                    while (execOps.hasNext()) {
                        try {
                            execOps.next().run();
                        } catch (Exception e) {
                            Activator.logError(e);
                            break;
                        }
                    }
                }
            });
        } else {
            Iterator<ModelOperation> execOps = ops.iterator();
            while (execOps.hasNext()) {
                try {
                    execOps.next().run();
                } catch (Exception e) {
                    Activator.logError(e);
                    break;
                }
            }
        }
    }

    protected void updateFeature(EObject eObject, String featureId, Object value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new BasicEObjectOperation(eObject, featureId, value));
        wrapOperation(eObject, ops);
    }

    protected void unsetFeature(EObject eObject, String featureId) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(new BasicUnsetEObjectOperation(eObject, featureId));
        wrapOperation(eObject, ops);
    }

    protected TransactionalEditingDomain getDomain(EObject object) {
        TransactionalEditingDomain domain = null;
        if (object != null) {
            if (object.eContainer() != null) {
                domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                return domain;
            }
        }
        return null;
    }
}
