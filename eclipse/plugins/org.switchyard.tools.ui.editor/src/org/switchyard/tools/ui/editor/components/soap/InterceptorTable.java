/******************************************************************************* 
 * Copyright (c) 2013-2014 Red Hat, Inc. 
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
package org.switchyard.tools.ui.editor.components.soap;

import java.util.Collection;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.ObservableTracker;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.CellEditorProperties;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapCellLabelProvider;
import org.eclipse.jface.databinding.viewers.ObservableValueEditingSupport;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.switchyard.tools.models.switchyard1_0.soap.InterceptorType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.shared.TableColumnLayout;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class InterceptorTable extends Composite {

    private TableViewer _interceptorTable;
    private Button _mAddButton;
    private Button _mRemoveButton;
    private Button _mEditButton;
    private boolean _isReadOnly = false;
    private EObject _targetObj = null;
    private ListenerList _changeListeners;
    private final EReference _interceptorsFeature;
    private final EReference _interceptorsListFeature;
    private final EClass _interceptorType;
    private WritableValue _bindingValue;

    /**
     * Constructor.
     * 
     * @param parent Composite parent
     * @param style any SWT style bits to pass along
     * @param interceptorsListFeature list we're editing
     * @param interceptorsFeature actual interceptor list feature
     * @param interceptorType actual class for the interceptor type
     * @param context DataBindingContext to use 
     */
    public InterceptorTable(Composite parent, int style, EReference interceptorsListFeature,
            EReference interceptorsFeature, EClass interceptorType, DataBindingContext context) {
        this(parent, style, false, interceptorsListFeature, interceptorsFeature, interceptorType, context);
    }

    /**
     * Constructor.
     * 
     * @param parent composite parent
     * @param style any SWT style bits
     * @param isReadOnly boolean flag
     * @param interceptorsListFeature list we're editing
     * @param interceptorsFeature actual interceptor list feature
     * @param interceptorType actual class for the interceptor type
     * @param context DataBindingContext to use 
     */
    public InterceptorTable(Composite parent, int style, boolean isReadOnly,
            EReference interceptorsListFeature, EReference interceptorsFeature, 
            EClass interceptorType,
            DataBindingContext context) {
        super(parent, style);

        final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(getTargetObject());

        this._isReadOnly = isReadOnly;
        this._changeListeners = new ListenerList();
        _interceptorsListFeature = interceptorsListFeature;
        _interceptorsFeature = interceptorsFeature;
        _interceptorType = interceptorType;

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
        GridData gd11 = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 3);
        gd11.heightHint = 100;
        tableComposite.setLayoutData(gd11);

        _interceptorTable = new TableViewer(tableComposite, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.FULL_SELECTION
                | additionalStyles);
        this._interceptorTable.getTable().setHeaderVisible(true);

        TableColumnLayout tableLayout = new TableColumnLayout();
        tableComposite.setLayout(tableLayout);

        TableViewerColumn nameColumn = new TableViewerColumn(_interceptorTable, SWT.LEFT);
        nameColumn.getColumn().setText(Messages.label_name);
        tableLayout.setColumnData(nameColumn.getColumn(), new ColumnWeightData(100, 150, true));

        IValueProperty nameProperty = domain == null ? EMFProperties
                .value(_interceptorType.getEStructuralFeature("class")) : EMFEditProperties.value(domain,
                _interceptorType.getEStructuralFeature("class"));
        IValueProperty cellEditorTextProperty = CellEditorProperties.control().value(WidgetProperties.text(SWT.Modify));
        
        final ObservableListContentProvider contentProvider;
        ObservableTracker.setIgnore(true);
        try {
            // ignore any observers created internally
            contentProvider = new ObservableListContentProvider();
        } finally {
            ObservableTracker.setIgnore(false);
        }

        nameColumn.setEditingSupport(ObservableValueEditingSupport.create(_interceptorTable, context, new TextCellEditor(_interceptorTable.getTable()), cellEditorTextProperty, nameProperty));
        nameColumn.setLabelProvider(new ObservableMapCellLabelProvider(nameProperty.observeDetail(contentProvider.getKnownElements())));

        _interceptorTable.setContentProvider(contentProvider);

        this._mAddButton = new Button(this, SWT.NONE);
        this._mAddButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
        this._mAddButton.setText(Messages.button_add);
        this._mAddButton.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                addInterceptorTypeToList();
                fireChangedEvent(e.getSource());
            }
        });

        this._mAddButton.setEnabled(false);

        _interceptorTable.getTable().addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                updateInterceptorTypeButtons();
            }
        });

        this._mEditButton = new Button(this, SWT.NONE);
        this._mEditButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
        this._mEditButton.setText(Messages.button_edit);
        this._mEditButton.setEnabled(false);
        this._mEditButton.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                editInterceptorType();
                fireChangedEvent(e.getSource());
            }
        });

        this._mRemoveButton = new Button(this, SWT.NONE);
        this._mRemoveButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
        this._mRemoveButton.setText(Messages.button_remove);
        this._mRemoveButton.setEnabled(false);
        this._mRemoveButton.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                removeFromList();
                fireChangedEvent(e.getSource());
            }
        });

        // set the input. we're observing a list on the binding value
        _bindingValue = new WritableValue(SWTObservables.getRealm(getDisplay()), null, SOAPBindingType.class);
        _interceptorTable.setInput(EMFProperties.list(
                FeaturePath.fromList(_interceptorsListFeature, _interceptorsFeature)).observeDetail(_bindingValue));

        updateInterceptorTypeButtons();
    }

    /**
     * Add a new interceptor to the list
     */
    @SuppressWarnings({"unchecked", "rawtypes" })
    protected void addInterceptorTypeToList() {
        final InterceptorTypeInputDialog dialog = new InterceptorTypeInputDialog(Display.getCurrent()
                .getActiveShell());
        final InterceptorType interceptor = SOAPFactory.eINSTANCE.createInterceptorType();
        dialog.setInterceptor(interceptor);
        int rtn_value = dialog.open();
        if (rtn_value == InterceptorTypeInputDialog.OK) {
            final SOAPBindingType soapBinding = (SOAPBindingType) _targetObj;
            final EObject mapping = interceptor; 

            if (_targetObj.eContainer() != null) {
                TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        Object variableContainer = soapBinding.eGet(_interceptorsListFeature);
                        if (variableContainer == null) {
                            final EClass variableContainerClass = _interceptorsListFeature.getEReferenceType();
                            variableContainer = variableContainerClass.getEPackage().getEFactoryInstance().create(variableContainerClass);
                            soapBinding.eSet(_interceptorsListFeature, variableContainer);
                        }
                        if (variableContainer instanceof EObject) {
                            final Object mappings = ((EObject) variableContainer).eGet(_interceptorsFeature);
                            if (mappings instanceof Collection) {
                                ((Collection) mappings).add(mapping);
                            }
                        }
                    }
                });
            } else {
                Object variableContainer = soapBinding.eGet(_interceptorsListFeature);
                if (variableContainer == null) {
                    final EClass variableContainerClass = _interceptorsListFeature.getEReferenceType();
                    variableContainer = variableContainerClass.getEPackage().getEFactoryInstance().create(variableContainerClass);
                    soapBinding.eSet(_interceptorsListFeature, variableContainer);
                }
                if (variableContainer instanceof EObject) {
                    final Object mappings = ((EObject) variableContainer).eGet(_interceptorsFeature);
                    if (mappings instanceof Collection) {
                        ((Collection) mappings).add(mapping);
                    }
                }
            }
            fireChangedEvent(this);
        }
    };

    /**
     * Remove a property from the list
     */
    @SuppressWarnings({"rawtypes"})
    protected void removeFromList() {
        if (getTargetObject() instanceof SwitchYardBindingType) {
            final SwitchYardBindingType baseCamel = (SwitchYardBindingType) getTargetObject();
            final EObject actionToRemove = getTableSelection();
            if (baseCamel.eContainer() != null) {
                TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        final Object variableContainer = baseCamel.eGet(_interceptorsListFeature);
                        if (variableContainer instanceof EObject) {
                            final Object mappings = ((EObject) variableContainer).eGet(_interceptorsFeature);
                            if (mappings instanceof Collection) {
                                ((Collection) mappings).remove(actionToRemove);
                            }
                            if (((Collection)mappings).isEmpty()) {
                                baseCamel.eSet(_interceptorsListFeature, null);
                            }
                        }
                    }
                });
            } else {
                final Object variableContainer = baseCamel.eGet(_interceptorsListFeature);
                if (variableContainer instanceof EObject) {
                    final Object mappings = ((EObject) variableContainer).eGet(_interceptorsFeature);
                    if (mappings instanceof Collection) {
                        ((Collection) mappings).remove(actionToRemove);
                    }
                    if (((Collection)mappings).isEmpty()) {
                        baseCamel.eSet(_interceptorsListFeature, null);
                    }
                }
            }
            fireChangedEvent(this);
        }
    };
    
    /**
     * Edit the selected interceptor type.
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    protected void editInterceptorType() {
        if (getTargetObject() instanceof SwitchYardBindingType) {
            final SwitchYardBindingType baseCamel = (SwitchYardBindingType) getTargetObject();
            final EObject actionToRemove = getTableSelection();
            final InterceptorTypeInputDialog dialog = new InterceptorTypeInputDialog(Display.getCurrent()
                    .getActiveShell());
            dialog.setInterceptor((InterceptorType)actionToRemove);
            int rtn_value = dialog.open();
            if (rtn_value == InterceptorTypeInputDialog.OK) {
                if (baseCamel.eContainer() != null) {
                    TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                    domain.getCommandStack().execute(new RecordingCommand(domain) {
                        @Override
                        protected void doExecute() {
                            final Object variableContainer = baseCamel.eGet(_interceptorsListFeature);
                            if (variableContainer instanceof EObject) {
                                final Object mappings = ((EObject) variableContainer).eGet(_interceptorsFeature);
                                if (mappings instanceof Collection) {
                                    ((Collection) mappings).remove(actionToRemove);
                                    ((Collection) mappings).add(dialog.getInterceptor());
                                }
                            }
                        }
                    });
                } else {
                    final Object variableContainer = baseCamel.eGet(_interceptorsListFeature);
                    if (variableContainer instanceof EObject) {
                        final Object mappings = ((EObject) variableContainer).eGet(_interceptorsFeature);
                        if (mappings instanceof Collection) {
                            ((Collection) mappings).remove(actionToRemove);
                            ((Collection) mappings).add(dialog.getInterceptor());
                        }
                    }
                }
                fireChangedEvent(this);
            }
        }
    };

    /**
     * Return the current selection.
     * 
     * @return String list
     */
    @SuppressWarnings("unchecked")
    public EList<InterceptorType> getSelection() {
        if (_interceptorTable != null && _interceptorTable.getInput() != null) {
            return (EList<InterceptorType>) _interceptorTable.getInput();
        }
        return null;
    }
    
    /**
     * @return the currently selected InterceptorType
     */
    public InterceptorType getTableSelection() {
        if (_interceptorTable != null && !_interceptorTable.getSelection().isEmpty()) {
            IStructuredSelection ssel = (IStructuredSelection) _interceptorTable.getSelection();
            if (ssel.getFirstElement() instanceof InterceptorType) {
                return (InterceptorType) ssel.getFirstElement();
            }
        }
        return null;
    }

    /**
     * Update button state based on what's selected.
     */
    public void updateInterceptorTypeButtons() {
        if (_isReadOnly) {
            this._mAddButton.setEnabled(false);
            this._mRemoveButton.setEnabled(false);
            this._mEditButton.setEnabled(false);
        } else {
            this._mAddButton.setEnabled(true);
            IStructuredSelection ssel = (IStructuredSelection) _interceptorTable.getSelection();
            if (ssel != null && ssel.getFirstElement() != null) {
                _mEditButton.setEnabled(true);
                _mRemoveButton.setEnabled(true);
            }
        }
    }

    /**
     * @param properties incoming property list
     */
    public void setSelection(EList<InterceptorType> properties) {
        _interceptorTable.setInput(properties);
        updateInterceptorTypeButtons();
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
        _bindingValue.setValue(target);
        updateInterceptorTypeButtons();
    }

    protected EObject getTargetObject() {
        return this._targetObj;
    }

    protected TableViewer getTableViewer() {
        return this._interceptorTable;
    }
}
