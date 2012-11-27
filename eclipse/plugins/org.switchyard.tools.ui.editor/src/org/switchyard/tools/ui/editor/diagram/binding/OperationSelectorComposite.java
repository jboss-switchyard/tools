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

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.internal.databinding.swt.SWTObservableValueDecorator;
import org.eclipse.jface.internal.databinding.swt.SWTVetoableValueDecorator;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.JavaOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.RegexOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.StaticOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.XPathOperationSelectorType;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.util.ErrorUtils;
import org.switchyard.tools.ui.editor.util.InterfaceOpsUtil;

/**
 * @author bfitzpat
 * 
 */
@SuppressWarnings("restriction")
public class OperationSelectorComposite extends Composite {

    private class RadioListener implements SelectionListener {
        @Override
        public void widgetSelected(SelectionEvent e) {
            selectOptionButton((Control) e.widget);
        }

        @Override
        public void widgetDefaultSelected(SelectionEvent e) {
        }
    }

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
    private Button _opNameRadio;
    private Button _xpathRadio;
    private Button _regexRadio;
    private Button _javaRadio;
    private SwitchYardOperationSelectorType _opSelector = null;
    private ArrayList<Control> _observableControls = new ArrayList<Control>();
    private ArrayList<IObservable> _observables = null;
    private boolean _observersAdded = false;
    private TextValueChangeListener _textValueChangeListener = null;
    private ComboValueChangeListener _comboValueChangeListener = null;
    private Control _comboTextChanged = null;
    private boolean _inUpdate = false;

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
        opGroup.setLayout(new GridLayout(2, false));
        opGroup.setText("Operation Options");

        RadioListener radioListener = new RadioListener();
        _opNameRadio = createRadio(opGroup, "Operation Name", false);
        _opNameRadio.addSelectionListener(radioListener);
        _operationSelectionCombo = createCombo(opGroup, "Operation Name", this._isReadOnly);

        _xpathRadio = createRadio(opGroup, "XPath", false);
        _xpathRadio.addSelectionListener(radioListener);
        _xpathText = createText(opGroup, this._isReadOnly);

        _regexRadio = createRadio(opGroup, "Regex", false);
        _regexRadio.addSelectionListener(radioListener);
        _regexText = createText(opGroup, this._isReadOnly);

        _javaRadio = createRadio(opGroup, "Java Class", false);
        _javaRadio.addSelectionListener(radioListener);
        _javaText = createText(opGroup, this._isReadOnly);

        selectOptionButton(_opNameRadio);
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
        addObservableListeners();
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

    protected Button createRadio(Composite parent, String label, boolean selected) {
        Button radio = new Button(parent, SWT.RADIO);
        radio.setText(label);
        radio.setSelection(selected);
        TabbedPropertySheetWidgetFactory factory = new TabbedPropertySheetWidgetFactory();
        factory.adapt(radio, false, false);
        return radio;
    }

    protected Combo createCombo(Composite parent, String label, boolean readOnly) {
        int styles = SWT.BORDER | SWT.DROP_DOWN;
        if (readOnly) {
            styles = SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY;
        }
        Combo combo = new Combo(parent, styles);
        combo.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
        if (!readOnly) {
            addEnterNextListener(combo);
        }
        _observableControls.add(combo);
        return combo;
    }

    protected Text createText(Composite parent, boolean readOnly) {
        int styles = SWT.BORDER;
        if (readOnly) {
            styles = SWT.BORDER | SWT.READ_ONLY;
        }
        Text textfield = new Text(parent, styles);
        textfield.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
        if (!readOnly) {
            addEnterNextListener(textfield);
        }
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
            if (getTargetObject() == null) {
                PictogramElement[] pes = SwitchyardSCAEditor.getActiveEditor().getSelectedPictogramElements();
                if (pes.length > 0) {
                    Object bo = SwitchyardSCAEditor.getActiveEditor().getDiagramTypeProvider().getFeatureProvider()
                            .getBusinessObjectForPictogramElement(pes[0]);
                    if (bo instanceof Contract) {
                        target = (EObject) bo;
                        setTargetObject(target);
                    }
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
        _operationSelectionCombo.setText("");
        _xpathText.setText("");
        _regexText.setText("");
        _javaText.setText("");
        
        String value = getValueOfExistingOpSelector(opSelector);
        if (_opSelector instanceof StaticOperationSelectorType) {
            selectOptionButton(_opNameRadio);
            _operationSelectionCombo.setText(value);
        } else if (_opSelector instanceof XPathOperationSelectorType) {
            selectOptionButton(_xpathRadio);
            _xpathText.setText(value);
        } else if (_opSelector instanceof RegexOperationSelectorType) {
            selectOptionButton(_regexRadio);
            _regexText.setText(value);
        } else if (_opSelector instanceof JavaOperationSelectorType) {
            selectOptionButton(_javaRadio);
            _javaText.setText(value);
        }
        _inUpdate = false;
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
                featureId = "operationName";
                newOpSelectorOp = new StaticOperationSelectorGroupOp((Binding) getBinding());
                break;
            case REGEX_TYPE:
                featureId = "expression";
                newOpSelectorOp = new RegexOperationSelectorGroupOp((Binding) getBinding(), value);
                break;
            case XPATH_TYPE:
                featureId = "expression";
                newOpSelectorOp = new XPathOperationSelectorGroupOp((Binding) getBinding());
                break;
            case JAVA_TYPE:
                featureId = "class";
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
    
    private void selectOptionButton(Control radio) {
        _opNameRadio.setSelection(false);
        _operationSelectionCombo.setEnabled(false);
        
        _xpathRadio.setSelection(false);
        _xpathText.setEnabled(false);
        
        _regexRadio.setSelection(false);
        _regexText.setEnabled(false);

        _javaRadio.setSelection(false);
        _javaText.setEnabled(false);
        
        if (radio.equals(_opNameRadio)) {
            _opNameRadio.setSelection(true);
            _operationSelectionCombo.setEnabled(true);
            populateOperationCombo();
            _selectedType = STATIC_TYPE;
        } else if (radio.equals(_xpathRadio)) {
            _xpathRadio.setSelection(true);
            _xpathText.setEnabled(true);
            _selectedType = XPATH_TYPE;
        } else if (radio.equals(_regexRadio)) {
            _regexRadio.setSelection(true);
            _regexText.setEnabled(true);
            _selectedType = REGEX_TYPE;
        } else if (radio.equals(_javaRadio)) {
            _javaRadio.setSelection(true);
            _javaText.setEnabled(true);
            _selectedType = JAVA_TYPE;
        }
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
        Iterator<Control> iter = _observableControls.iterator();
        while (iter.hasNext()) {
            Control ctrl = iter.next();
            if (ctrl instanceof Text) {
                Text newText = (Text) ctrl;

                ISWTObservableValue focusObserver = SWTObservables.observeText(newText, SWT.FocusOut);
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
                                    (e.keyCode == SWT.BS)) { // backspace
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
                    newCombo.addFocusListener(new FocusListener() {
                        @Override
                        public void focusGained(FocusEvent e) {
                        }

                        @Override
                        public void focusLost(FocusEvent e) {
                            if (_comboTextChanged != null && _comboTextChanged.equals((Control) e.getSource())) {
                                System.out.println("OperationSelectorComposite: New Combo Value (text entry): " + ((Combo) _comboTextChanged).getText());
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
                System.out.println("OperationSelectorComposite: TextValueChanged: " + e.diff);
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
                System.out.println("OperationSelectorComposite: ComboValueChanged: " + e.diff);
                SWTObservableValueDecorator decorator = (SWTObservableValueDecorator) e.getSource();
                fireChangedEvent((Control) decorator.getWidget());
                ErrorUtils.showErrorMessage(null);
            }
        }
    }
}
