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
package org.switchyard.tools.ui.editor.diagram.shared;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.internal.databinding.swt.SWTObservableValueDecorator;
import org.eclipse.jface.internal.databinding.swt.SWTVetoableValueDecorator;
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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.util.ErrorUtils;

/**
 * @author bfitzpat
 * 
 */
@SuppressWarnings("restriction")
public abstract class AbstractSwitchyardComposite implements FocusListener, KeyListener, ModifyListener,
        SelectionListener {

    private boolean _canEdit = true;
    private String _errorMessage = null;
    private GridData _rootGridData = null;
    private boolean _openOnCreate = false;
    private boolean _hasChanged = false;
    private boolean _inUpdate = false;
    private ArrayList<Control> _observableControls = new ArrayList<Control>();
    private Control _comboTextChanged = null;
    private TextValueChangeListener _textValueChangeListener = null;
    private ComboValueChangeListener _comboValueChangeListener = null;
    private ButtonValueChangeListener _buttonValueChangeListener = null;
    private ArrayList<IObservable> _observables = null;
    private boolean _observersAdded = false;

    // change listeners
    private ListenerList _changeListeners;

    /**
     * Empty constructor.
     */
    public AbstractSwitchyardComposite() {
        // empty
    }

    abstract protected boolean validate();

    protected boolean hasChanged() {
        return _hasChanged;
    }

    protected void setHasChanged(boolean flag) {
        this._hasChanged = flag;
    }

    /**
     * @param parent Composite parent
     * @param style any style bits
     */
    abstract public void createContents(Composite parent, int style);

    abstract protected void handleModify(final Control control);

    /**
     * @return panel
     */
    abstract public Composite getPanel();

    /**
     * @return string error message
     */
    public String getErrorMessage() {
        return this._errorMessage;
    }

    /**
     * @param msg string to set
     */
    public void setErrorMessage(String msg) {
        this._errorMessage = msg;
    }

    /**
     * If we changed, fire a changed event.
     * 
     * @param source
     */
    protected void fireChangedEvent(Object source) {
        ChangeEvent e = new ChangeEvent(source);
        // inform any listeners of the change event
        if (this._changeListeners != null && !this._changeListeners.isEmpty()) {
            Object[] listeners = this._changeListeners.getListeners();
            for (int i = 0; i < listeners.length; ++i) {
                ((ChangeListener) listeners[i]).stateChanged(e);
            }
        }
    }

    /**
     * Add a change listener.
     * 
     * @param listener new listener
     */
    public void addChangeListener(ChangeListener listener) {
        if (this._changeListeners == null) {
            this._changeListeners = new ListenerList();
        }
        this._changeListeners.add(listener);
    }

    /**
     * Remove a change listener.
     * 
     * @param listener to remove
     */
    public void removeChangeListener(ChangeListener listener) {
        if (this._changeListeners != null && !this._changeListeners.isEmpty()) {
            this._changeListeners.remove(listener);
        }
    }

    /**
     * @return flag
     */
    public boolean canEdit() {
        return this._canEdit;
    }

    /**
     * @param canEdit flag
     */
    public void setCanEdit(boolean canEdit) {
        this._canEdit = canEdit;
    }

    /**
     * @param rootGridData the _rootGridData to set
     */
    public void setRootGridData(GridData rootGridData) {
        this._rootGridData = rootGridData;
    }

    /**
     * @return GridData or null
     */
    public GridData getRootGridData() {
        return this._rootGridData;
    }

    /**
     * @param flag open on create? true/false
     */
    public void setOpenOnCreate(boolean flag) {
        this._openOnCreate = flag;
    }

    /**
     * @return true/false
     */
    public boolean openOnCreate() {
        return this._openOnCreate;
    }

    /**
     * Dispose of the composite widgets.
     */
    public void dispose() {
        if (getPanel() != null) {
            disposeChildWidgets(getPanel());
        }
    }

    /**
     * @param parent Parent composite
     */
    public static void disposeChildWidgets(Composite parent) {
        Control[] kids = parent.getChildren();
        for (Control k : kids) {
            if (k instanceof Composite) {
                disposeChildWidgets((Composite) k);
            }
            k.dispose();
        }
    }

    /**
     * @param parent parent composite
     * @param label string for label
     * @return reference to created Button
     */
    protected Button createCheckbox(Composite parent, String label) {
        Button newButton = new Button(parent, SWT.CHECK | SWT.LEFT);
        newButton.setText(label);
        newButton.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false, 2, 1));
        _observableControls.add(newButton);

        return newButton;
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
     * @param parent parent composite
     * @param label string to put in label
     * @return reference to created Text control
     */
    protected Text createLabelAndText(Composite parent, String label) {
        if (label != null && !label.trim().isEmpty()) {
            new Label(parent, SWT.NONE).setText(label);
        }
        Text newText = new Text(parent, SWT.BORDER);
        newText.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
        newText.addKeyListener(this);
        addEnterNextListener(newText);

        _observableControls.add(newText);

        return newText;
    }

    private void handleChange(Control control) {
        setHasChanged(true);
        validate();
        handleModify(control);
        fireChangedEvent(this);
    }

    class TextValueChangeListener implements IValueChangeListener {
        @Override
        public void handleValueChange(final ValueChangeEvent e) {
            if (!inUpdate() && e.diff != null && !e.diff.getOldValue().equals(e.diff.getNewValue())) {
                System.out.println("AbstractSwitchyardComposite:TextValueChanged: " + e.diff);
                SWTVetoableValueDecorator decorator = (SWTVetoableValueDecorator) e.getSource();
                handleChange((Control) decorator.getWidget());
                ErrorUtils.showErrorMessage(null);
            }
        }
    }

    class ComboValueChangeListener implements IValueChangeListener {
        @Override
        public void handleValueChange(final ValueChangeEvent e) {
            if (!inUpdate() && e.diff != null) {
                System.out.println("AbstractSwitchyardComposite:ComboValueChanged: " + e.diff);
                SWTObservableValueDecorator decorator = (SWTObservableValueDecorator) e.getSource();
                handleChange((Control) decorator.getWidget());
                ErrorUtils.showErrorMessage(null);
            }
        }
    }

    class ButtonValueChangeListener implements IValueChangeListener {
        @Override
        public void handleValueChange(final ValueChangeEvent e) {
            if (!inUpdate() && e.diff != null) {
                if (!inUpdate() && e.diff != null) {
                    System.out.println("AbstractSwitchyardComposite:ButtonValueChanged: " + e.diff);
                    SWTObservableValueDecorator decorator = (SWTObservableValueDecorator) e.getSource();
                    handleChange((Control) decorator.getWidget());
                }
            }
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
        if (_buttonValueChangeListener == null) {
            _buttonValueChangeListener = new ButtonValueChangeListener();
        }
        Iterator<Control> iter = _observableControls.iterator();
        while (iter.hasNext()) {
            Control ctrl = iter.next();
            if (ctrl instanceof Text) {
                Text newText = (Text) ctrl;

                ISWTObservableValue focusObserver = SWTObservables.observeText(newText, SWT.FocusOut);
                _observables.add(focusObserver);
                // focusObserver.removeValueChangeListener(_textValueChangeListener);
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
                                AbstractSwitchyardComposite.this._comboTextChanged = (Control) e.widget;
                            }
                        }
                    });
                    newCombo.addModifyListener(new ModifyListener() {
                        @Override
                        public void modifyText(ModifyEvent arg0) {
                            AbstractSwitchyardComposite.this._comboTextChanged = (Control) arg0.widget;
                        }
                    });
                    newCombo.addFocusListener(new FocusListener() {
                        @Override
                        public void focusGained(FocusEvent e) {
                        }

                        @Override
                        public void focusLost(FocusEvent e) {
                            if (AbstractSwitchyardComposite.this._comboTextChanged == (Control) e.getSource()) {
                                System.out.println("AbstractSwitchyardComposite:New Combo Value (text entry): " + ((Combo) e.getSource()).getText());
                                handleChange((Control) e.getSource());
                                AbstractSwitchyardComposite.this._comboTextChanged = null;
                            }
                        }
                    });
                }

                ISWTObservableValue selectionObserver = SWTObservables.observeSelection(newCombo);
                _observables.add(selectionObserver);
                // selectionObserver.removeValueChangeListener(_comboValueChangeListener);
                selectionObserver.addValueChangeListener(_comboValueChangeListener);

            } else if (ctrl instanceof Button) {
                Button newButton = (Button) ctrl;
                ISWTObservableValue buttonObserver = SWTObservables.observeSelection(newButton);
                _observables.add(buttonObserver);
                // buttonObserver.removeValueChangeListener(_buttonValueChangeListener);
                buttonObserver.addValueChangeListener(_buttonValueChangeListener);
            }
        }
        _observersAdded = true;
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
        _observableControls.add(combo);

        return combo;
    }

    @Override
    public void focusGained(FocusEvent e) {
        // ignore
    }

    @Override
    public void focusLost(FocusEvent e) {
        // ignore
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.keyCode != SWT.CR && e.keyCode != SWT.TAB) {
            setHasChanged(true);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.keyCode == SWT.ESC) {
            Control control = (Control) e.getSource();
            setInUpdate(true);
            handleUndo(control);
            setInUpdate(false);
        }
    }

    protected boolean inUpdate() {
        return _inUpdate;
    }

    protected void setInUpdate(boolean inUpdate) {
        this._inUpdate = inUpdate;
    }

    @Override
    public void modifyText(ModifyEvent e) {
        if (!inUpdate()) {
            _hasChanged = true;
        }
    }

    @Override
    public void widgetSelected(SelectionEvent e) {
        if (!inUpdate()) {
            _hasChanged = true;
        }
    }

    @Override
    public void widgetDefaultSelected(SelectionEvent e) {
        widgetSelected(e);
    }

    /**
     * @param text Text field
     * @param value value to set
     */
    public void setTextValue(Text text, String value) {
        if (value == null) {
            value = "";
        }
        if (text != null && !text.isDisposed()) {
            text.setText(value);
        }
    }

    /**
     * @param combo Combo field
     * @param value value to set
     */
    public void setTextValue(Combo combo, String value) {
        if (value == null) {
            value = "";
        }
        if (combo != null && !combo.isDisposed()) {
            combo.setText(value);
        }
    }

    /**
     * @param eObject incoming object to update
     * @param featureId feature to update
     * @param value value for feature
     * @throws Exception in case something can't be found
     */
    public void setFeatureValue(EObject eObject, String featureId, Object value) throws Exception {
        EClass eClass = eObject.eClass();
        for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
            EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
            if (eStructuralFeature.isChangeable()) {
                if (eStructuralFeature.getName().equalsIgnoreCase(featureId)) {
                    eObject.eSet(eStructuralFeature, value);
                    return;
                }
            }
        }
        System.out.println("AbstractSwitchyardComposite: Didn't find feature: " + featureId);
        showFeatures(eObject);
        throw new Exception("AbstractSwitchyardComposite:Feature ID (" + featureId + ") not found.");
    }
    
    private void showFeatures(EObject eObject) {
        EClass eClass = eObject.eClass();
        for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
            EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
            if (eStructuralFeature.isChangeable()) {
                System.out.println("AbstractSwitchyardComposite:Feature: " + eStructuralFeature.getName());
            }
        }
    }

    /**
     * @param eObject incoming object to retrieve
     * @param featureId feature to retrieve
     * @return object value
     */
    public Object getFeatureValue(EObject eObject, String featureId) {
        EClass eClass = eObject.eClass();
        for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
            EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
            if (eStructuralFeature.isChangeable()) {
                if (eStructuralFeature.getName().equalsIgnoreCase(featureId)) {
                    return eObject.eGet(eStructuralFeature);
                }
            }
        }
        System.out.println("AbstractSwitchyardComposite: Didn't find feature: " + featureId);
        showFeatures(eObject);
        return null;
    }

    /**
     * Parse the list.
     * 
     * @param str_list string to parse
     * @param token token string
     * @return parsed string array
     */
    public String[] parseString(String str_list, String token) {
        StringTokenizer tk = new StringTokenizer(str_list, token);
        String[] pieces = new String[tk.countTokens()];
        int index = 0;
        while (tk.hasMoreTokens()) {
            pieces[index++] = tk.nextToken();
        }
        return pieces;
    }

    protected void handleUndo(Control control) {
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

    protected void addGridData(Control control, int columns, int style) {
        GridData controlGD = new GridData(style);
        controlGD.horizontalSpan = columns;
        control.setLayoutData(controlGD);
    }
}
