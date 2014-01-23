/******************************************************************************* 
 * Copyright (c) 2012-2014 Red Hat, Inc. 
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

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.internal.databinding.swt.SWTObservableValueDecorator;
import org.eclipse.jface.internal.databinding.swt.SWTVetoableValueDecorator;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.JavaOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.RegexOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.StaticOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.XPathOperationSelectorType;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.property.AbstractModelComposite;
import org.switchyard.tools.ui.editor.property.AbstractPropertyPage;
import org.switchyard.tools.ui.editor.util.ErrorUtils;
import org.switchyard.tools.ui.editor.util.InterfaceOpsUtil;

/**
 * @author bfitzpat
 * 
 */
@SuppressWarnings("restriction")
public class OperationSelectorComposite extends Composite {

    /**
     * Static operation selector type.
     */
    public static final int STATIC_TYPE = 0;
    /**
     * XPath operation selector type.
     */
    public static final int XPATH_TYPE = 1;
    /**
     * Regex operation selector type.
     */
    public static final int REGEX_TYPE = 2;
    /**
     * Java operation selector type.
     */
    public static final int JAVA_TYPE = 3;
    
    private int _selectedType = 0;
    private boolean _isReadOnly = false;
    private EObject _targetObj = null;
    private Binding _binding = null;
    private String _mWarning = null;
    private ListenerList _changeListeners;
    private Combo _operationSelectionCombo;
    private Text _xpathText;
    private Text _regexText;
    private Text _javaText;
    private Composite _operationSelectionComposite;
    private Composite _xpathComposite;
    private Composite _regexComposite;
    private Composite _javaComposite;
    private SwitchYardOperationSelectorType _opSelector = null;
    private ArrayList<Control> _observableControls = new ArrayList<Control>();
    private ArrayList<IObservable> _observables = null;
    private boolean _observersAdded = false;
    private TextValueChangeListener _textValueChangeListener = null;
    private ComboValueChangeListener _comboValueChangeListener = null;
    private Control _comboTextChanged = null;
    private boolean _inUpdate = false;
    private Composite _panel;
    private Combo _typeCombo;
    private Composite _contentPanel = null;
    private StackLayout _stackLayout = null;
    private Button _browseClassBtn = null;

    /**
     * Constructor.
     * 
     * @param parent composite
     * @param style style bits
     */
    public OperationSelectorComposite(Composite parent, int style) {
        this(parent, style, false);
    }

    /**
     * Constructor.
     * 
     * @param parent composite
     * @param style style bits
     * @param isReadOnly true/false
     */
    public OperationSelectorComposite(Composite parent, int style, boolean isReadOnly) {
        super(parent, style);
        _panel = parent;
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

        Group opGroup = new Group(this, additionalStyles);
        opGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        GridLayout layout = new GridLayout(2, false);
        opGroup.setLayout(layout);
        opGroup.setText(Messages.OperationSelectorComposite_OperationSelectorGroup_label);
        
        _typeCombo = createCombo(opGroup, null, true);
        _typeCombo.add(Messages.label_operationName, STATIC_TYPE);
        _typeCombo.add(Messages.label_xpath, XPATH_TYPE);
        _typeCombo.add(Messages.label_regex, REGEX_TYPE);
        _typeCombo.add(Messages.label_javaClass, JAVA_TYPE);
        _typeCombo.select(STATIC_TYPE);
        _typeCombo.setLayoutData(new GridData());
        
        _typeCombo.addSelectionListener(new SelectionListener() {
            
            @Override
            public void widgetSelected(SelectionEvent e) {
                String selected = _typeCombo.getText();
                if (selected.contentEquals(Messages.label_operationName)) {
                    selectOperationTypeInDropdown(Messages.label_operationName);
                } else if (selected.contentEquals(Messages.label_xpath)) {
                    selectOperationTypeInDropdown(Messages.label_xpath);
                } else if (selected.contentEquals(Messages.label_regex)) {
                    selectOperationTypeInDropdown(Messages.label_regex);
                } else if (selected.contentEquals(Messages.label_javaClass)) {
                    selectOperationTypeInDropdown(Messages.label_javaClass);
                }
                fireChangedEvent(_typeCombo);
            }
            
            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
            }
        });
        
        _contentPanel = new Composite(opGroup, SWT.NONE);
        _stackLayout = new StackLayout();
        _contentPanel.setLayout(_stackLayout);
        _contentPanel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        
        _operationSelectionComposite = new Composite(_contentPanel, SWT.NONE);
        _operationSelectionCombo = createCombo(_operationSelectionComposite, Messages.label_operationName, false);
        _operationSelectionComposite.setLayout(new GridLayout());
        _operationSelectionCombo.setLayoutData(new GridData(SWT.FILL, SWT.NULL, true, false));
        
        _xpathComposite = new Composite(_contentPanel, SWT.NONE);
        _xpathText = createText(_xpathComposite);
        _xpathComposite.setLayout(new GridLayout());
        _xpathText.setLayoutData(new GridData(SWT.FILL, SWT.NULL, true, false));

        _regexComposite = new Composite(_contentPanel, SWT.NONE);
        _regexText = createText(_regexComposite);
        _regexComposite.setLayout(new GridLayout());
        _regexText.setLayoutData(new GridData(SWT.FILL, SWT.NULL, true, false));

        _javaComposite = new Composite(_contentPanel, SWT.NONE);
        _javaText = createText(_javaComposite);
        _javaComposite.setLayout(new GridLayout(2, false));
        _browseClassBtn = new Button(_javaComposite, SWT.PUSH);
        _browseClassBtn.setText("...");
        _browseClassBtn.setEnabled(this._isReadOnly);
        _javaText.setLayoutData(new GridData(SWT.FILL, SWT.NULL, true, false));
        _browseClassBtn.setLayoutData(new GridData(SWT.FILL, SWT.NULL, false, false));

        _browseClassBtn.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                try {
                    IType selected = selectType(_panel.getShell(), "org.switchyard.selector.OperationSelector", null); //$NON-NLS-1$
                    if (selected != null) {
                        _javaText.setText(selected.getFullyQualifiedName());
                        fireChangedEvent(_javaText);
                    }
                } catch (JavaModelException e1) {
                    e1.printStackTrace();
                }
            }
        });

        selectOperationTypeInDropdown(Messages.label_operationName);
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
        populateOperationCombo();
    }

    protected EObject getTargetObject() {
        return this._targetObj;
    }
    
    protected Binding getBinding() {
        return this._binding;
    }

    /**
     * @param binding incoming
     */
    public void setBinding(Binding binding) {
        this._binding = binding;
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
     * @param parent parent composite
     * @param label string to put in label
     * @return reference to created Text control
     */
    protected Combo createLabelAndCombo(Composite parent, String label) {
        return createLabelAndCombo(parent, label, false);
    }

    protected Combo createLabelAndCombo(Composite parent, String label, boolean readOnly) {
        if (label != null && !label.trim().isEmpty()) {
            Label labelControl = new Label(parent, SWT.NONE);
            labelControl.setText(label);
            TabbedPropertySheetWidgetFactory factory = new TabbedPropertySheetWidgetFactory();
            factory.adapt(labelControl, false, false);
        }
        int styles = SWT.BORDER | SWT.DROP_DOWN;
        if (readOnly) {
            styles = SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY;
        }
        Combo combo = new Combo(parent, styles);
        combo.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
        if (!readOnly) {
            addEnterNextListener(combo);
        }
        // _observableControls.add(combo);

        return combo;
    }

    protected Combo createCombo(Composite parent, String label, boolean readOnly) {
        int styles = SWT.BORDER | SWT.DROP_DOWN;
        if (readOnly) {
            styles = SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY;
        }
        Combo combo = new Combo(parent, styles);
        combo.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
            addEnterNextListener(combo);
        _observableControls.add(combo);
        return combo;
    }

    protected Text createText(Composite parent) {
        int styles = SWT.BORDER;
        Text textfield = new Text(parent, styles);
        textfield.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
        addEnterNextListener(textfield);
        _observableControls.add(textfield);
        return textfield;
    }

    private void addEnterNextListener(final Control control) {
        control.addTraverseListener(new TraverseListener() {

            @Override
            public void keyTraversed(TraverseEvent e) {
                if (e.character == SWT.CR) {
                    control.traverse(SWT.TRAVERSE_TAB_NEXT);
                }
            }
        });
    }
    
    /**
     * Populate the drop-down with available operations from the contract interface.
     */
    public void populateOperationCombo() {
        if (_operationSelectionCombo != null && !_operationSelectionCombo.isDisposed()) {

            EObject target = null;
            if (getBinding() != null && getTargetObject() == null) {
                EObject parent = getBinding().eContainer();
                if (parent != null && !(parent instanceof Contract)) {
                    parent = parent.eContainer();
                }
                if (parent instanceof Contract) {
                    target = (EObject) parent;
                    setTargetObject(target);
                }
            }
            _operationSelectionCombo.removeAll();
            _operationSelectionCombo.clearSelection();
            if (getTargetObject() != null && getTargetObject() instanceof Contract) {
                String[] operations = InterfaceOpsUtil.gatherOperations((Contract) getTargetObject());
                for (int i = 0; i < operations.length; i++) {
                    _operationSelectionCombo.add(operations[i]);
                }
            }
        }
    }

    /**
     * @param opSelector Incoming operation selector class
     */
    public void setOperation(SwitchYardOperationSelectorType opSelector) {
        _opSelector = opSelector;
        _inUpdate = true;
        _operationSelectionCombo.setText(""); //$NON-NLS-1$
        _xpathText.setText(""); //$NON-NLS-1$
        _regexText.setText(""); //$NON-NLS-1$
        _javaText.setText(""); //$NON-NLS-1$
        
        String value = getValueOfExistingOpSelector(opSelector);
        if (_opSelector instanceof StaticOperationSelectorType) {
            selectOperationTypeInDropdown(Messages.label_operationName);
            _operationSelectionCombo.setText(value);
        } else if (_opSelector instanceof XPathOperationSelectorType) {
            selectOperationTypeInDropdown(Messages.label_xpath);
            _xpathText.setText(value);
        } else if (_opSelector instanceof RegexOperationSelectorType) {
            selectOperationTypeInDropdown(Messages.label_regex);
            _regexText.setText(value);
        } else if (_opSelector instanceof JavaOperationSelectorType) {
            selectOperationTypeInDropdown(Messages.label_javaClass);
            _javaText.setText(value);
        }
        _inUpdate = false;
        addObservableListeners(true);
    }
    
    /**
     * @param opSelector incoming operation selector class
     * @return String value
     */
    public static String getValueOfExistingOpSelector(OperationSelectorType opSelector) {
        if (opSelector instanceof StaticOperationSelectorType) {
            return ((StaticOperationSelectorType) opSelector).getOperationName();
        } else if (opSelector instanceof XPathOperationSelectorType) {
            return ((XPathOperationSelectorType) opSelector).getExpression();
        } else if (opSelector instanceof RegexOperationSelectorType) {
            return ((RegexOperationSelectorType) opSelector).getExpression();
        } else if (opSelector instanceof JavaOperationSelectorType) {
            return ((JavaOperationSelectorType) opSelector).getClass_();
        }
        return null;
    }
    
    /**
     * @param opSelector incoming operation selector class
     * @return int of type
     */
    public static int getTypeOfExistingOpSelector(OperationSelectorType opSelector) {
        if (opSelector instanceof StaticOperationSelectorType) {
            return STATIC_TYPE;
        } else if (opSelector instanceof XPathOperationSelectorType) {
            return XPATH_TYPE;
        } else if (opSelector instanceof RegexOperationSelectorType) {
            return REGEX_TYPE;
        } else if (opSelector instanceof JavaOperationSelectorType) {
            return JAVA_TYPE;
        }
        return -1;
    }

    /**
     * @param toTest Control to test
     * @return true/false
     */
    public boolean controlExists(Control toTest) {
        if (toTest.equals(_operationSelectionCombo) 
                || toTest.equals(_xpathText) 
                || toTest.equals(_regexText)
                || toTest.equals(_javaText)) {
            return true;
        }
        return false;
    }

    /**
     * @return int corresponding to type of operation selector
     */
    public int getSelectedOperationSelectorType() {
        return this._selectedType;
    }
    
    /**
     * @return String value for the selected operation selector
     */
    public String getSelectedOperationSelectorValue() {
        switch (getSelectedOperationSelectorType()) {
            case STATIC_TYPE:
                return _operationSelectionCombo.getText();
            case REGEX_TYPE:
                return _regexText.getText();
            case XPATH_TYPE:
                return _xpathText.getText();
            case JAVA_TYPE:
                return _javaText.getText();

        }
        return null;
    }

    /**
     * @return list of ops to handle adding/removing operation selector
     */
    public ArrayList<ModelOperation> getOperationSelectorFeatureOps() {
        
        String featureId = null;
        String value = getSelectedOperationSelectorValue();
        ModelOperation newOpSelectorOp = null;
        switch (getSelectedOperationSelectorType()) {
            case STATIC_TYPE:
                featureId = "operationName"; //$NON-NLS-1$
                newOpSelectorOp = new StaticOperationSelectorGroupOp((Binding) getBinding());
                break;
            case REGEX_TYPE:
                featureId = "expression"; //$NON-NLS-1$
                newOpSelectorOp = new RegexOperationSelectorGroupOp((Binding) getBinding(), value);
                break;
            case XPATH_TYPE:
                featureId = "expression"; //$NON-NLS-1$
                newOpSelectorOp = new XPathOperationSelectorGroupOp((Binding) getBinding());
                break;
            case JAVA_TYPE:
                featureId = "class"; //$NON-NLS-1$
                newOpSelectorOp = new JavaOperationSelectorGroupOp((Binding) getBinding());
                break;
        }
        
        if (_opSelector != null) {
            Object oldValue = getFeatureValue(_opSelector, featureId);
            // don't do anything if the value is the same
            if (oldValue == null && value == null) {
                return null;
            } else if (oldValue != null && oldValue.equals(value)) {
                return null;
            } else if (value != null && value.equals(oldValue)) {
                return null;
            }
        }
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();
        ops.add(newOpSelectorOp);
        return ops;
    }

    /**
     * @param eObject incoming object to retrieve
     * @param featureId feature to retrieve
     * @return object value
     */
    private Object getFeatureValue(EObject eObject, String featureId) {
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
    
    private void selectOperationTypeInDropdown(Object typeToSelect) {
        
        _typeCombo.select(0);
        _operationSelectionCombo.setEnabled(false);
        _xpathText.setEnabled(false);
        _regexText.setEnabled(false);
        _javaText.setEnabled(false);
        _browseClassBtn.setEnabled(false);
        
        if (typeToSelect.equals(Messages.label_operationName)) {
            _typeCombo.select(STATIC_TYPE);
            _operationSelectionCombo.setEnabled(true);
            populateOperationCombo();
            _selectedType = STATIC_TYPE;
            _stackLayout.topControl = _operationSelectionComposite;
        } else if (typeToSelect.equals(Messages.label_xpath)) {
            _typeCombo.select(XPATH_TYPE);
            _xpathText.setEnabled(true);
            _selectedType = XPATH_TYPE;
            _stackLayout.topControl = _xpathComposite;
        } else if (typeToSelect.equals(Messages.label_regex)) {
            _typeCombo.select(REGEX_TYPE);
            _regexText.setEnabled(true);
            _selectedType = REGEX_TYPE;
            _stackLayout.topControl = _regexComposite;
        } else if (typeToSelect.equals(Messages.label_javaClass)) {
            _typeCombo.select(JAVA_TYPE);
            _javaText.setEnabled(true);
            _browseClassBtn.setEnabled(true);
            _selectedType = JAVA_TYPE;
            _stackLayout.topControl = _javaComposite;
        }
        _contentPanel.layout();
    }

    protected void addObservableListeners() {
        addObservableListeners(false);
    }

    protected void addObservableListeners(boolean reset) {
        if (_observersAdded && !reset) {
            return;
        }

        if (reset && _observables != null && _observables.size() > 0) {
            for (int i = 0; i < _observables.size(); i++) {
                _observables.get(i).dispose();
            }
            _observables.clear();
        }
        _observables = new ArrayList<IObservable>();

        if (_textValueChangeListener == null) {
            _textValueChangeListener = new TextValueChangeListener();
        }
        if (_comboValueChangeListener == null) {
            _comboValueChangeListener = new ComboValueChangeListener();
        }

        int styleBit = 0;
        Composite parent = _panel.getParent();
        while (parent != null && !(parent instanceof AbstractModelComposite<?>)) {
            parent = parent.getParent();
        }
        if (parent != null && parent instanceof AbstractModelComposite<?>) {
            AbstractModelComposite<?> modelComposite = (AbstractModelComposite<?>) parent;
            if (modelComposite.getContainer() instanceof AbstractPropertyPage) {
                styleBit = SWT.Modify;
            }
        }

        Iterator<Control> iter = _observableControls.iterator();
        while (iter.hasNext()) {
            Control ctrl = iter.next();
            if (ctrl instanceof Text) {
                Text newText = (Text) ctrl;

                ISWTObservableValue focusObserver = SWTObservables.observeText(newText, SWT.FocusOut | styleBit);
                _observables.add(focusObserver);
                focusObserver.addValueChangeListener(_textValueChangeListener);
            } else if (ctrl instanceof Combo) {
                final Combo newCombo = (Combo) ctrl;
                if ((newCombo.getStyle() & SWT.READ_ONLY) == 0) {
                    newCombo.addKeyListener(new KeyListener() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                        }

                        @Override
                        public void keyReleased(KeyEvent e) {
                            if ((e.keyCode >= 97 && e.keyCode <= 122) || // characters
                                    (e.keyCode >= 48 && e.keyCode <= 57) || // digits
                                    (e.keyCode == 32) || // spacebar
                                    (e.keyCode == SWT.BS) || // backspace
                                    (e.keyCode == SWT.ARROW_UP) || // up arrow
                                    (e.keyCode == SWT.ARROW_DOWN)) {
                                _comboTextChanged = (Control) e.widget;
                            }
                        }
                    });
                    newCombo.addModifyListener(new ModifyListener() {
                        @Override
                        public void modifyText(ModifyEvent arg0) {
                            _comboTextChanged = (Control) arg0.widget;
                        }
                    });
                    if (styleBit != 0) {
                        newCombo.addSelectionListener(new SelectionAdapter() {
                            @Override
                            public void widgetSelected(SelectionEvent e) {
                                if (_comboTextChanged != null && _comboTextChanged.equals((Control) e.getSource())) {
                                    System.out.println("OperationSelectorComposite: New Combo Selection (text entry): " + ((Combo) _comboTextChanged).getText()); //$NON-NLS-1$
                                    fireChangedEvent(_comboTextChanged);
                                    _comboTextChanged = null;
                                }
                            }
                        });
                    }
                    newCombo.addFocusListener(new FocusListener() {
                        @Override
                        public void focusGained(FocusEvent e) {
                        }

                        @Override
                        public void focusLost(FocusEvent e) {
                            if (_comboTextChanged != null && _comboTextChanged.equals((Control) e.getSource())) {
                                System.out.println("OperationSelectorComposite: New Combo Value (text entry): " + ((Combo) _comboTextChanged).getText()); //$NON-NLS-1$
                                fireChangedEvent(_comboTextChanged);
                                _comboTextChanged = null;
                            }
                        }
                    });
                }
            }

        }
        _observersAdded = true;
    }

    class TextValueChangeListener implements IValueChangeListener {
        @Override
        public void handleValueChange(final ValueChangeEvent e) {
            if (e.diff != null && !_inUpdate) {
                System.out.println("OperationSelectorComposite: TextValueChanged: " + e.diff); //$NON-NLS-1$
                SWTVetoableValueDecorator decorator = (SWTVetoableValueDecorator) e.getSource();
                fireChangedEvent((Control) decorator.getWidget());
                ErrorUtils.showErrorMessage(null);
            }
        }
    }

    class ComboValueChangeListener implements IValueChangeListener {
        @Override
        public void handleValueChange(final ValueChangeEvent e) {
            if (e.diff != null && !_inUpdate) {
                System.out.println("OperationSelectorComposite: ComboValueChanged: " + e.diff); //$NON-NLS-1$
                SWTObservableValueDecorator decorator = (SWTObservableValueDecorator) e.getSource();
                fireChangedEvent((Control) decorator.getWidget());
                ErrorUtils.showErrorMessage(null);
            }
        }
    }

    /**
     * @param shell Shell for the window
     * @param superTypeName supertype to search for
     * @param project project to look in
     * @return IType the type created
     * @throws JavaModelException exception thrown
     */
    public IType selectType(Shell shell, String superTypeName, IProject project) throws JavaModelException {
        IJavaSearchScope searchScope = null;
        if (project == null) {
            ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService()
                    .getSelection();
            IStructuredSelection selectionToPass = StructuredSelection.EMPTY;
            if (selection instanceof IStructuredSelection) {
                selectionToPass = (IStructuredSelection) selection;
                if (selectionToPass.getFirstElement() instanceof IFile) {
                    project = ((IFile) selectionToPass.getFirstElement()).getProject();
                }
            }
        }
        if (superTypeName != null) {
            if (project == null) {
                project = SwitchyardSCAEditor.getActiveEditor().getModelFile().getProject();
            }
            IJavaProject javaProject = JavaCore.create(project);
            IType superType = javaProject.findType(superTypeName);
            if (superType != null) {
                searchScope = SearchEngine.createStrictHierarchyScope(javaProject, superType, true, false, null);
            }
        } else {
            searchScope = SearchEngine.createWorkspaceScope();
        }
        SelectionDialog dialog = JavaUI.createTypeDialog(shell, new ProgressMonitorDialog(shell), searchScope,
                IJavaElementSearchConstants.CONSIDER_CLASSES_AND_INTERFACES, false);
        dialog.setTitle(Messages.label_selectEntries);
        dialog.setMessage(Messages.label_matchingItems);
        if (dialog.open() == IDialogConstants.CANCEL_ID) {
            return null;
        }
        Object[] types = dialog.getResult();
        if (types == null || types.length == 0) {
            return null;
        }
        return (IType) types[0];
    }

}
