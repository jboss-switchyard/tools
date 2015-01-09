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

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.ComputedValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
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
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.XPathOperationSelectorType;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.databinding.AccessibleClassValidator;
import org.switchyard.tools.ui.editor.databinding.ObservablesUtil;
import org.switchyard.tools.ui.editor.databinding.RegexValidator;
import org.switchyard.tools.ui.editor.databinding.SWTValueUpdater;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.util.InterfaceOpsUtil;

/**
 * @author bfitzpat
 * 
 */
public class OperationSelectorComposite extends Composite {

    private boolean _isReadOnly = false;
    private EObject _targetObj = null;
    private Binding _binding = null;
    private ListenerList _changeListeners;
    private Combo _operationSelectionCombo;
    private Text _xpathText;
    private Text _regexText;
    private Text _javaText;
    private Composite _operationSelectionComposite;
    private Composite _xpathComposite;
    private Composite _regexComposite;
    private Composite _javaComposite;
    private Composite _panel;
    private ComboViewer _typeCombo;
    private Composite _contentPanel = null;
    private StackLayout _stackLayout = null;
    private Button _browseClassBtn = null;

    private WritableValue _bindingValue;
    private IObservableValue _selectorValue;

    /**
     * Constructor.
     * 
     * @param parent composite
     * @param style style bits
     * @param container the containing binding composite
     */
    public OperationSelectorComposite(Composite parent, int style, AbstractSYBindingComposite container) {
        this(parent, style, container, false);
    }

    /**
     * Constructor.
     * 
     * @param parent composite
     * @param style style bits
     * @param container the containing binding composite
     * @param isReadOnly true/false
     */
    public OperationSelectorComposite(Composite parent, int style, AbstractSYBindingComposite container,
            boolean isReadOnly) {
        super(parent, style);
        _panel = parent;
        _isReadOnly = isReadOnly;
        _changeListeners = new ListenerList();

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

        _typeCombo = new ComboViewer(createCombo(opGroup, null, true));
        _typeCombo.getControl().setLayoutData(new GridData());
        _typeCombo.setContentProvider(ArrayContentProvider.getInstance());
        _typeCombo.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                if (element instanceof SelectorType) {
                    return ((SelectorType) element).getLabel();
                }
                return super.getText(element);
            }
        });
        _typeCombo.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                if (event.getSelection().isEmpty()) {
                    return;
                }
                handleSelectorTypeChanged((SelectorType) ((IStructuredSelection) event.getSelection())
                        .getFirstElement());
            }
        });
        _typeCombo.setInput(SelectorType.values());

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
                        _javaText.notifyListeners(SWT.Modify, null);
                        // simulate "ENTER" to commit the change
                        _javaText.notifyListeners(SWT.DefaultSelection, null);
                        _javaText.setFocus();
                    }
                } catch (JavaModelException e1) {
                    e1.printStackTrace();
                }
            }
        });
        _typeCombo.setSelection(new StructuredSelection(SelectorType.STATIC_TYPE));
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
        _binding = binding;
        populateOperationCombo();
        _bindingValue.setValue(binding);
    }

    /**
     * Bind the controls.
     * 
     * @param domain the editing domain, may be null
     * @param context the data binding context
     */
    public void bindControls(EditingDomain domain, DataBindingContext context) {
        final Realm realm = SWTObservables.getRealm(getDisplay());

        _bindingValue = new WritableValue(realm, null, Binding.class);

        /*
         * intermediate values, used to separate control changes from value
         * changes (i.e. the bindings for these are wrapped with
         * SWTValueUpdater).
         */
        final IObservableValue selectorTypeValue = new WritableValue(realm, null, SelectorType.class);
        final IObservableValue staticValue = new WritableValue(realm, null, String.class);
        final IObservableValue regexValue = new WritableValue(realm, null, String.class);
        final IObservableValue xpathValue = new WritableValue(realm, null, String.class);
        final IObservableValue javaValue = new WritableValue(realm, null, String.class);

        // bind intermediate values to controls
        org.eclipse.core.databinding.Binding binding = context.bindValue(
                ViewersObservables.observeSingleSelection(_typeCombo), selectorTypeValue, new UpdateValueStrategy(),
                null);
        ControlDecorationSupport.create(binding, SWT.TOP | SWT.LEFT);

        binding = context.bindValue(SWTObservables.observeSelection(_operationSelectionCombo), staticValue,
                new UpdateValueStrategy(UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context.bindValue(SWTObservables.observeText(_regexText, SWT.Modify), regexValue,
                new UpdateValueStrategy(UpdateValueStrategy.POLICY_CONVERT)
                        .setAfterConvertValidator(new RegexValidator()), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context.bindValue(SWTObservables.observeText(_xpathText, SWT.Modify), xpathValue,
                new UpdateValueStrategy(UpdateValueStrategy.POLICY_CONVERT), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        binding = context.bindValue(SWTObservables.observeText(_javaText, SWT.Modify), javaValue,
                new UpdateValueStrategy(UpdateValueStrategy.POLICY_CONVERT).
                setAfterConvertValidator(new AccessibleClassValidator(javaValue, getTargetObject())), null);
        ControlDecorationSupport.create(SWTValueUpdater.attach(binding), SWT.TOP | SWT.LEFT);

        /*
         * computed value. creates an operation selector based on the current
         * state of the controls.
         */
        _selectorValue = new ComputedValue(realm, OperationSelectorType.class) {
            @Override
            protected Object calculate() {
                // we need to interrogate all values, or we'll miss events
                final SelectorType selectedType = (SelectorType) selectorTypeValue.getValue();
                final String operationText = (String) staticValue.getValue();
                final String xpathText = (String) xpathValue.getValue();
                final String regexText = (String) regexValue.getValue();
                final String javaText = (String) javaValue.getValue();
                if (selectedType == null) {
                    return null;
                }
                switch (selectedType) {
                case STATIC_TYPE:
                    return selectedType.createOperationSelector(operationText);
                case XPATH_TYPE:
                    return selectedType.createOperationSelector(xpathText);
                case REGEX_TYPE:
                    return selectedType.createOperationSelector(regexText);
                case JAVA_TYPE:
                    return selectedType.createOperationSelector(javaText);
                }
                return null;
            }

            @Override
            protected void doSetValue(Object value) {
                if (value == null) {
                    selectorTypeValue.setValue(SelectorType.STATIC_TYPE);
                    staticValue.setValue("");
                } else if (value instanceof OperationSelectorType) {
                    final SelectorType selectorType = SelectorType.valueOf((OperationSelectorType) value);
                    selectorTypeValue.setValue(selectorType);
                    switch (selectorType) {
                    case STATIC_TYPE:
                        staticValue.setValue(((StaticOperationSelectorType) value).getOperationName());
                        break;
                    case XPATH_TYPE:
                        xpathValue.setValue(((XPathOperationSelectorType) value).getExpression());
                        break;
                    case REGEX_TYPE:
                        regexValue.setValue(((RegexOperationSelectorType) value).getExpression());
                        break;
                    case JAVA_TYPE:
                        javaValue.setValue(((JavaOperationSelectorType) value).getClass_());
                        break;
                    }
                } else {
                    throw new IllegalArgumentException("Unknown selector type: " + value.getClass().getCanonicalName());
                }
                // update our cached value
                getValue();
            }
        };

        // now bind the selector into the binding
        context.bindValue(
                _selectorValue,
                ObservablesUtil.observeDetailValue(domain, _bindingValue,
                        ScaPackage.eINSTANCE.getBinding_OperationSelector()));

        // propagate changes to the old binding composites
        _selectorValue.addValueChangeListener(new IValueChangeListener() {
            @Override
            public void handleValueChange(ValueChangeEvent event) {
                fireChangedEvent(OperationSelectorComposite.this);
            }
        });
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
        return combo;
    }

    protected Text createText(Composite parent) {
        int styles = SWT.BORDER;
        Text textfield = new Text(parent, styles);
        textfield.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
        addEnterNextListener(textfield);
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
     * Populate the drop-down with available operations from the contract
     * interface.
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
            final String selection = _operationSelectionCombo.getText();
            if (getTargetObject() != null && getTargetObject() instanceof Contract) {
                String[] operations = InterfaceOpsUtil.gatherOperations((Contract) getTargetObject());
                _operationSelectionCombo.setItems(operations);
            }
            if (selection != null && selection.length() > 0) {
                final int index = _operationSelectionCombo.indexOf(selection);
                if (index < 0) {
                    _operationSelectionCombo.setText(selection);
                } else {
                    _operationSelectionCombo.select(index);
                }
            }
        }
    }

    private void handleSelectorTypeChanged(final SelectorType typeToSelect) {
        _xpathText.setEnabled(false);
        _regexText.setEnabled(false);
        _javaText.setEnabled(false);
        _browseClassBtn.setEnabled(false);

        switch (typeToSelect) {
        case STATIC_TYPE:
            _operationSelectionCombo.setEnabled(true);
            _stackLayout.topControl = _operationSelectionComposite;
            break;
        case XPATH_TYPE:
            _xpathText.setEnabled(true);
            _stackLayout.topControl = _xpathComposite;
            break;
        case REGEX_TYPE:
            _regexText.setEnabled(true);
            _stackLayout.topControl = _regexComposite;
            break;
        case JAVA_TYPE:
            _javaText.setEnabled(true);
            _browseClassBtn.setEnabled(true);
            _stackLayout.topControl = _javaComposite;
            break;
        }
        _contentPanel.layout();
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

    private enum SelectorType {
        STATIC_TYPE(Messages.label_operationName) {
            @Override
            public OperationSelectorType createOperationSelector(String selectorText) {
                if (selectorText == null || selectorText.trim().length() == 0) {
                    return null;
                }
                final StaticOperationSelectorType selector = SwitchyardFactory.eINSTANCE
                        .createStaticOperationSelectorType();
                selector.setOperationName(selectorText);
                return selector;
            }
        },
        XPATH_TYPE(Messages.label_xpath) {
            @Override
            public OperationSelectorType createOperationSelector(String selectorText) {
                if (selectorText == null || selectorText.trim().length() == 0) {
                    return null;
                }
                final XPathOperationSelectorType selector = SwitchyardFactory.eINSTANCE
                        .createXPathOperationSelectorType();
                selector.setExpression(selectorText);
                return selector;
            }
        },
        REGEX_TYPE(Messages.label_regex) {
            @Override
            public OperationSelectorType createOperationSelector(String selectorText) {
                if (selectorText == null || selectorText.trim().length() == 0) {
                    return null;
                }
                final RegexOperationSelectorType selector = SwitchyardFactory.eINSTANCE
                        .createRegexOperationSelectorType();
                selector.setExpression(selectorText);
                return selector;
            }
        },
        JAVA_TYPE(Messages.label_javaClass) {
            @Override
            public OperationSelectorType createOperationSelector(String selectorText) {
                if (selectorText == null || selectorText.trim().length() == 0) {
                    return null;
                }
                final JavaOperationSelectorType selector = SwitchyardFactory.eINSTANCE
                        .createJavaOperationSelectorType();
                selector.setClass(selectorText);
                return selector;
            }
        };

        private final String _label;

        private SelectorType(String label) {
            _label = label;
        }

        /**
         * @return the display label for this selector type.
         */
        public String getLabel() {
            return _label;
        }

        /**
         * Create a new operation selector.
         * 
         * @param selectorText the selector text
         * @return a new operation selector
         */
        public abstract OperationSelectorType createOperationSelector(String selectorText);

        /**
         * @param value an operation selector
         * @return the matching enum value
         */
        public static SelectorType valueOf(final OperationSelectorType value) {
            if (value == null) {
                return null;
            } else if (value instanceof StaticOperationSelectorType) {
                return STATIC_TYPE;
            } else if (value instanceof XPathOperationSelectorType) {
                return XPATH_TYPE;
            } else if (value instanceof RegexOperationSelectorType) {
                return REGEX_TYPE;
            } else if (value instanceof JavaOperationSelectorType) {
                return JAVA_TYPE;
            } else {
                throw new IllegalArgumentException("Unknown selector type: " + value.getClass().getCanonicalName());
            }
        }
    }
}
