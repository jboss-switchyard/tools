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
package org.switchyard.tools.ui.common;

import static org.switchyard.tools.ui.M2EUtils.resolveSwitchYardVersionRange;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.sonatype.aether.util.version.GenericVersionScheme;
import org.sonatype.aether.version.Version;
import org.switchyard.tools.ui.Activator;

/**
 * SwitchYardSettingsGroup
 * 
 * <p/>
 * Controls for editing/viewing for SwitchYard settings.
 * 
 * @author Rob Cernich
 */
public class SwitchYardSettingsGroup {

    private IRunnableContext _context;
    private ComboViewer _runtimeVersionsList;
    private Button _runtimeProvidedCheckbox;
    private CheckboxTableViewer _componentsTable;
    private Text _descriptionText;
    private List<Version> _availableVersions;

    /**
     * Create a new SwitchYardSettingsGroup.
     * 
     * @param parent the parent composite
     * @param layoutUtilities utilities to help with layout.
     * @param context a runnable context to use for long running operations.
     */
    public SwitchYardSettingsGroup(Composite parent, ILayoutUtilities layoutUtilities, IRunnableContext context) {
        super();
        _context = context;

        Composite runtimeControls = new Composite(parent, SWT.NONE);
        runtimeControls.setLayout(new GridLayout(2, false));
        runtimeControls.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        Label label = new Label(runtimeControls, SWT.NONE);
        label.setText("Runtime Version:");

        _runtimeVersionsList = new VersionComboViewer(runtimeControls);
        _runtimeVersionsList.getCombo().setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _runtimeVersionsList.setLabelProvider(new LabelProvider());
        _runtimeVersionsList.setContentProvider(ArrayContentProvider.getInstance());

        Composite componentsControls = new Composite(parent, SWT.NONE);
        componentsControls.setLayout(new GridLayout());
        componentsControls.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        _runtimeProvidedCheckbox = new Button(componentsControls, SWT.CHECK);
        _runtimeProvidedCheckbox.setText("SwitchYard dependencies provided by container");
        _runtimeProvidedCheckbox.setLayoutData(new GridData());
        // not currently supported
        _runtimeProvidedCheckbox.setVisible(false);

        label = new Label(componentsControls, SWT.NONE);
        label.setText("Components:");

        _componentsTable = CheckboxTableViewer.newCheckList(componentsControls, SWT.SINGLE | SWT.BORDER | SWT.V_SCROLL
                | SWT.V_SCROLL);
        _componentsTable.setLabelProvider(new LabelProvider() {
            public String getText(Object element) {
                if (element instanceof ISwitchYardComponentExtension) {
                    return ((ISwitchYardComponentExtension) element).getName();
                }
                return super.getText(element);
            }
        });
        _componentsTable.setContentProvider(ArrayContentProvider.getInstance());
        _componentsTable.getTable().setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _componentsTable.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                ISelection selection = _componentsTable.getSelection();
                if (selection instanceof IStructuredSelection && !selection.isEmpty()) {
                    String description = ((ISwitchYardComponentExtension) ((IStructuredSelection) selection)
                            .getFirstElement()).getDescription();
                    if (description == null || description.length() == 0) {
                        description = "unavailable";
                    }
                    _descriptionText.setText(description);
                } else {
                    _descriptionText.setText("");
                }
            }
        });
        _componentsTable.addFilter(new ViewerFilter() {
            private final Object _runtimeComponent = SwitchYardComponentExtensionManager.instance()
                    .getRuntimeComponentExtension();

            @Override
            public boolean select(Viewer viewer, Object parentElement, Object element) {
                return element != _runtimeComponent;
            }
        });

        Composite buttonControls = new Composite(componentsControls, SWT.NONE);
        buttonControls.setLayout(new GridLayout(2, true));
        buttonControls.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        Button selectAll = new Button(buttonControls, SWT.PUSH);
        layoutUtilities.setButtonLayoutData(selectAll);
        selectAll.setText("&Select All");
        selectAll.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event) {
                selectAllComponents();
            }
        });

        Button deselectAll = new Button(buttonControls, SWT.PUSH);
        layoutUtilities.setButtonLayoutData(deselectAll);
        deselectAll.setText("&Deselect All");
        deselectAll.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event) {
                deselectAllComponents();
            }
        });

        Group detailsGroup = new Group(parent, SWT.NONE);
        detailsGroup.setText("Component Description");
        detailsGroup.setLayout(new GridLayout());
        detailsGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        _descriptionText = new Text(detailsGroup, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL | SWT.V_SCROLL);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        gd.heightHint = _descriptionText.getLineHeight() * 3;
        _descriptionText.setLayoutData(gd);

        initControls();
    }

    /**
     * @return the available SwitchYard runtime versions.
     */
    public List<Version> getAvailableVersions() {
        return _availableVersions;
    }

    /**
     * @return the components viewer.
     */
    public CheckboxTableViewer getComponentsTable() {
        return _componentsTable;
    }

    /**
     * @return the runtime versions viewer.
     */
    public StructuredViewer getRuntimeVersionsList() {
        return _runtimeVersionsList;
    }

    /**
     * @return the runtime provided checkbox.
     */
    public Button getRuntimeProvidedCheckbox() {
        return _runtimeProvidedCheckbox;
    }

    /**
     * @return components added by the user.
     */
    @SuppressWarnings({"unchecked", "rawtypes" })
    public Set<ISwitchYardComponentExtension> getSelectedComponents() {
        Set<ISwitchYardComponentExtension> selectedComponents = new LinkedHashSet<ISwitchYardComponentExtension>(
                (List) Arrays.asList(_componentsTable.getCheckedElements()));
        selectedComponents.add(SwitchYardComponentExtensionManager.instance().getRuntimeComponentExtension());
        return selectedComponents;
    }

    private void initControls() {
        try {
            _context.run(false, true, new IRunnableWithProgress() {
                @Override
                public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                    monitor.beginTask("Loading available SwitchYard capabilities.", 100);
                    try {
                        populateComponentsTable();
                        monitor.worked(50);
                        populateRuntimeVersionsList(new SubProgressMonitor(monitor, 50));
                    } catch (CoreException e) {
                        throw new InvocationTargetException(e);
                    } finally {
                        monitor.done();
                    }
                }
            });
        } catch (Exception e) {
            if (e.getCause() instanceof CoreException) {
                Activator
                        .getDefault()
                        .getLog()
                        .log(new MultiStatus(Activator.PLUGIN_ID, -1, new IStatus[] {((CoreException) e.getCause())
                                .getStatus() }, "Error loading available SwitchYard capabilities.", e));
            } else {
                Activator
                        .getDefault()
                        .getLog()
                        .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
                                "Error loading available SwitchYard capabilities.", e));
            }
        }
    }

    private void populateRuntimeVersionsList(IProgressMonitor monitor) throws CoreException {
        _availableVersions = resolveSwitchYardVersionRange(monitor).getVersions();
        Collections.sort(_availableVersions, new Comparator<Version>() {
            @Override
            public int compare(Version o1, Version o2) {
                // list the highest version first
                return -o1.compareTo(o2);
            }
        });
        _runtimeVersionsList.setInput(_availableVersions);
    }

    private void populateComponentsTable() {
        _componentsTable.setInput(SwitchYardComponentExtensionManager.instance().getComponentExtensions());
    }

    private void selectAllComponents() {
        _componentsTable.setAllChecked(true);
    }

    private void deselectAllComponents() {
        _componentsTable.setAllChecked(false);
    }

    private final class VersionComboViewer extends ComboViewer {
        private VersionComboViewer(Composite parent) {
            super(parent, SWT.DROP_DOWN);
            getCombo().addModifyListener(new ModifyListener() {
                @Override
                public void modifyText(ModifyEvent e) {
                    SelectionChangedEvent event = new SelectionChangedEvent(VersionComboViewer.this, getSelection());
                    fireSelectionChanged(event);
                }
            });
        }

        @Override
        protected List<?> getSelectionFromWidget() {
            if (getCombo().getSelectionIndex() < 0) {
                List<Version> selected = new ArrayList<Version>();
                try {
                    selected.add(new GenericVersionScheme().parseVersion(getCombo().getText()));
                } catch (Exception e) {
                    e.fillInStackTrace();
                }
                return selected;
            }
            return super.getSelectionFromWidget();
        }

        @Override
        protected void setSelectionToWidget(ISelection selection, boolean reveal) {
            if (!selection.isEmpty() && _availableVersions != null) {
                Object obj = ((IStructuredSelection) selection).getFirstElement();
                if (!_availableVersions.contains(obj)) {
                    getCombo().setText(obj.toString());
                    return;
                }
            }
            super.setSelectionToWidget(selection, reveal);
        }
    }
}
