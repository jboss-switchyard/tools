/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.editor.transform;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.ui.PlatformResourceAdapterFactory;
import org.switchyard.tools.ui.editor.Activator;

/**
 * NewTransformWizardPage
 * 
 * </p> Wizard page for creating a new Java class with transformation methods.
 */
public class NewTransformWizardPage extends WizardPage implements ITransformProvider.IContainer {

    private TransformDetails _details;
    private IProject _project;
    private CheckboxTableViewer _transformsTable;
    private ListViewer _detailsList;
    private Button _selectAll;
    private Button _deselectAll;
    private ComboViewer _transformProviderList;
    private ITransformProvider _selectedProvider;
    private ITransformControl _activeControl;
    private Map<ITransformProvider, ITransformControl> _providerControls = new HashMap<ITransformProvider, ITransformControl>();
    private Map<ITransformProvider, INewTransformWizard> _providerWizards = new HashMap<ITransformProvider, INewTransformWizard>();
    private Collection<TransformType> _newTransforms;
    private ICheckStateListener _checkListener = new ICheckStateListener() {
        @Override
        public void checkStateChanged(CheckStateChangedEvent event) {
            if (_activeControl == null) {
                INewTransformWizard providerWizard = _providerWizards.get(_selectedProvider);
                if (providerWizard != null) {
                    providerWizard.setSelectedTransforms(getSelectedTransforms());
                }
            } else {
                _activeControl.setSelectedTransforms(getSelectedTransforms());
            }
            validate(null);
        }
    };

    /**
     * Create a new NewTransformWizardPage.
     */
    public NewTransformWizardPage() {
        super(NewTransformWizardPage.class.getCanonicalName());
        setTitle("New Transformers");
        setDescription("Create transformers for the selected transform pairs.");
    }

    /**
     * @param details the set of transformers.
     */
    public void init(TransformDetails details) {
        _details = details;
        _project = PlatformResourceAdapterFactory.getContainingProject(details.getSwitchYard());
        if (_transformsTable == null || _transformsTable.getControl().isDisposed()) {
            return;
        }
        _transformsTable.setInput(details);
        _transformsTable.setCheckedElements(details.getRequiredTransforms().toArray());
        validate(null);
    }

    @Override
    public void createControl(Composite parent) {
        initializeDialogUnits(parent);

        Composite content = new Composite(parent, SWT.NONE);
        content.setFont(parent.getFont());
        content.setLayout(new GridLayout(3, false));

        final Label transformLabel = new Label(content, SWT.NONE);
        transformLabel.setText("Transformer type pairs:");
        transformLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 3, 1));

        final Composite tableComposite = new Composite(content, SWT.NONE);
        final TableColumnLayout tableLayout = new TableColumnLayout();
        tableComposite.setLayout(tableLayout);

        createTransformsTable(tableComposite, tableLayout);

        final GridData tableCompositeGD = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 2);
        tableCompositeGD.heightHint = _transformsTable.getTable().getHeaderHeight()
                + _transformsTable.getTable().getItemHeight() * 5;
        tableComposite.setLayoutData(tableCompositeGD);

        _selectAll = new Button(content, SWT.PUSH);
        _selectAll.setText("Select All");
        _selectAll.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
        _selectAll.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                _transformsTable.setCheckedElements(((TransformDetails) _transformsTable.getInput())
                        .getRequiredTransforms().toArray());
                _checkListener.checkStateChanged(null);
            }
        });

        _deselectAll = new Button(content, SWT.PUSH);
        _deselectAll.setText("Deselect All");
        _deselectAll.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
        _deselectAll.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                _transformsTable.setCheckedElements(new Object[0]);
                _checkListener.checkStateChanged(null);
            }
        });

        final Label detailsLabel = new Label(content, SWT.NONE);
        detailsLabel.setText("Interaction contexts for selected type pair:");
        detailsLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 3, 1));

        _detailsList = new ListViewer(content, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL | SWT.READ_ONLY);
        final GridData detailsGD = new GridData(SWT.FILL, SWT.TOP, true, false, 3, 1);
        detailsGD.heightHint = _detailsList.getList().getItemHeight() * 3;
        _detailsList.getControl().setLayoutData(detailsGD);
        _detailsList.getList().setEnabled(false);
        _detailsList.setContentProvider(ArrayContentProvider.getInstance());
        _detailsList.setLabelProvider(new LabelProvider());

        final Label separator = new Label(content, SWT.SEPARATOR | SWT.HORIZONTAL);
        separator.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 3, 1));
        ((GridData) separator.getLayoutData()).heightHint = 20;

        final Label transformTypeLabel = new Label(content, SWT.NONE);
        transformTypeLabel.setText("Transformer Type:");

        _transformProviderList = new ComboViewer(content);
        _transformProviderList.getControl().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        _transformProviderList.setContentProvider(ArrayContentProvider.getInstance());
        _transformProviderList.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                return ((ITransformProvider) element).getName();
            }
        });
        _transformProviderList.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                if (_activeControl != null) {
                    _activeControl.setVisible(false);
                }
                if (event.getSelection().isEmpty()) {
                    _activeControl = null;
                    _selectedProvider = null;
                } else {
                    _selectedProvider = (ITransformProvider) ((IStructuredSelection) event.getSelection())
                            .getFirstElement();
                    if (!_selectedProvider.providesWizard()) {
                        _activeControl = _providerControls.get(_selectedProvider);
                        if (_activeControl != null) {
                            _activeControl.setSelectedTransforms(getSelectedTransforms());
                            _activeControl.setVisible(true);
                        }
                    }
                }
                validate(null);
                if (getWizard().getContainer().getCurrentPage() != null) {
                    getWizard().getContainer().updateButtons();
                }
            }
        });

        Composite providers = new Composite(content, SWT.NONE);
        providers.setLayout(new FormLayout());
        providers.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
        for (ITransformProvider provider : TransformProviderRegistry.instance().getProviders()) {
            if (provider.providesWizard()) {
                continue;
            }
            ITransformControl providerControl = provider.createTransformControl(providers, this);
            FormData formData = new FormData();
            formData.top = new FormAttachment(0);
            formData.bottom = new FormAttachment(100);
            formData.left = new FormAttachment(0);
            formData.right = new FormAttachment(100);
            providerControl.setLayoutData(formData);
            providerControl.setVisible(false);
            _providerControls.put(provider, providerControl);
        }

        setControl(content);

        Dialog.applyDialogFont(content);

        initControls();
        validate(null);
        setErrorMessage(null);
    }

    private void createTransformsTable(Composite parent, TableColumnLayout tableLayout) {
        _transformsTable = CheckboxTableViewer.newCheckList(parent, SWT.BORDER | SWT.FULL_SELECTION | SWT.V_SCROLL
                | SWT.H_SCROLL);
        final Table table = _transformsTable.getTable();
        table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        table.setHeaderVisible(true);
        table.setLinesVisible(true);

        final TableColumn from = new TableColumn(table, SWT.LEFT);
        from.setText("From");
        from.setResizable(true);
        tableLayout.setColumnData(from, new ColumnWeightData(50));

        final TableColumn to = new TableColumn(table, SWT.LEFT);
        to.setText("To");
        to.setResizable(true);
        tableLayout.setColumnData(to, new ColumnWeightData(50));

        _transformsTable.setLabelProvider(new TransformTypeLabelProvider());
        _transformsTable.setContentProvider(new TransformDetailsContentProvider());
        _transformsTable.addFilter(new ViewerFilter() {
            @Override
            public boolean select(Viewer viewer, Object parentElement, Object element) {
                TransformDetails input = (TransformDetails) _transformsTable.getInput();
                return input != null && !input.getDeclaredTransforms().contains(element);
            }
        });
        _transformsTable.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                if (event.getSelection().isEmpty()) {
                    _detailsList.setInput(Collections.emptyList());
                    return;
                }
                TransformDetails input = (TransformDetails) _transformsTable.getInput();
                if (input == null) {
                    _detailsList.setInput(Collections.emptyList());
                    return;
                }

                Set<String> detailsSet = input.getTransformDetails((TransformType) ((IStructuredSelection) event
                        .getSelection()).getFirstElement());
                if (detailsSet == null) {
                    _detailsList.setInput(Collections.emptyList());
                    return;
                }
                _detailsList.setInput(detailsSet);
            }
        });
        _transformsTable.addCheckStateListener(_checkListener);
    }

    @Override
    public void dispose() {
        for (ITransformControl control : _providerControls.values()) {
            if (control != null) {
                try {
                    control.dispose();
                } catch (Exception e) {
                    e.fillInStackTrace();
                }
            }
        }
        for (INewTransformWizard wizard : _providerWizards.values()) {
            if (wizard != null) {
                try {
                    wizard.dispose();
                } catch (Exception e) {
                    e.fillInStackTrace();
                }
            }
        }
        super.dispose();
    }

    @Override
    public IRunnableContext getContext() {
        return getWizard().getContainer();
    }

    @Override
    public void updateStatus(ITransformControl control, IStatus status) {
        if (control != _activeControl) {
            return;
        }
        validate(status);
    }

    @Override
    public IProject getContainingProject() {
        return _project;
    }

    /**
     * Creates the new transformers.
     * 
     * @return true if successfully finished.
     */
    public boolean performFinish() {
        if (_activeControl != null) {
            try {
                _newTransforms = _activeControl.createTransforms();
            } catch (CoreException e) {
                Activator.logStatus(e.getStatus());
            }
        }
        return true;
    }

    /**
     * @return the transforms created by this wizard.
     */
    public Collection<TransformType> getCreatedTransforms() {
        if (_activeControl == null) {
            INewTransformWizard providerWizard = _providerWizards.get(_selectedProvider);
            return providerWizard.getCreatedTransforms();
        }
        return _newTransforms;
    }

    private void initControls() {
        _transformsTable.setInput(_details);
        _transformsTable.setCheckedElements(_details.getRequiredTransforms().toArray());

        List<ITransformProvider> providers = TransformProviderRegistry.instance().getProviders();
        _transformProviderList.setInput(providers);
        if (providers.size() > 0) {
            _transformProviderList.setSelection(new StructuredSelection(providers.get(0)), true);
        }
    }

    private void validate(IStatus status) {
        setMessage(null);
        setErrorMessage(null);

        if (_transformsTable.getCheckedElements().length == 0) {
            setErrorMessage("Please select one or more transform pairs.");
        } else if (_activeControl == null && !_selectedProvider.providesWizard()) {
            setErrorMessage("Please select an implementation type for the new transformer(s).");
        } else {
            if (status == null && !_selectedProvider.providesWizard()) {
                status = _activeControl.validate();
            }
            if (status != null && !status.isOK()) {
                switch (status.getSeverity()) {
                case IStatus.INFO:
                    setMessage(status.getMessage(), INFORMATION);
                    break;
                case IStatus.WARNING:
                    setMessage(status.getMessage(), WARNING);
                    break;
                default: // error or cancel?
                    setErrorMessage(status.getMessage());
                }
            }
        }
        setPageComplete(getErrorMessage() == null);
    }

    protected INewTransformWizard getNextWizard() {
        if (_selectedProvider == null || !_selectedProvider.providesWizard()) {
            return null;
        }
        INewTransformWizard providerWizard = _providerWizards.get(_selectedProvider);
        if (providerWizard == null) {
            providerWizard = _selectedProvider.createWizard();
            providerWizard.init(_project);
            providerWizard.setSelectedTransforms(getSelectedTransforms());
            providerWizard.addPages();
            _providerWizards.put(_selectedProvider, providerWizard);
        }
        return providerWizard;
    }

    private Collection<TransformType> getSelectedTransforms() {
        if (_transformsTable == null) {
            return Collections.emptyList();
        }
        final Object[] checked = _transformsTable.getCheckedElements();
        final ArrayList<TransformType> transforms = new ArrayList<TransformType>(checked.length);
        for (Object obj : checked) {
            transforms.add((TransformType) obj);
        }
        return transforms;
    }

    private static final class TransformDetailsContentProvider implements IStructuredContentProvider {

        @Override
        public void dispose() {
        }

        @Override
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        }

        @Override
        public Object[] getElements(Object inputElement) {
            return ((TransformDetails) inputElement).getRequiredTransforms().toArray();
        }

    }

    private static final class TransformTypeLabelProvider extends BaseLabelProvider implements ITableLabelProvider {

        @Override
        public Image getColumnImage(Object element, int columnIndex) {
            return null;
        }

        @Override
        public String getColumnText(Object element, int columnIndex) {
            final String typeString;
            if (columnIndex == 0) {
                typeString = ((TransformType) element).getFrom();
            } else {
                typeString = ((TransformType) element).getTo();
            }
            if (typeString == null || typeString.length() == 0) {
                return "";
            }
            final QName qname = QName.valueOf(typeString);
            if (NewTransformWizard.isJavaType(typeString)) {
                final int lastDot = qname.getLocalPart().lastIndexOf('.');
                if (lastDot >= 0) {
                    return qname.getLocalPart().substring(lastDot + 1) + " {"
                            + qname.getLocalPart().substring(5, lastDot) + "}";
                }
                return qname.getLocalPart().substring(5);
            }
            return qname.getLocalPart() + " {" + qname.getNamespaceURI() + "}";
        }

    }

}
