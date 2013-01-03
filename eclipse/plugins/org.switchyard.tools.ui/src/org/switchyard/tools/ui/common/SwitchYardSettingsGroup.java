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
import java.util.EnumSet;
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
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
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
import org.switchyard.tools.ui.common.ISwitchYardComponentExtension.Category;

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
    private CheckboxTreeViewer _componentsTable;
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

        Composite content = new Composite(parent, SWT.NONE);
        content.setLayout(new GridLayout());
        content.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        Composite runtimeControls = new Composite(content, SWT.NONE);
        runtimeControls.setLayout(new GridLayout(2, false));
        runtimeControls.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        Label label = new Label(runtimeControls, SWT.NONE);
        label.setText("Runtime Version:");

        _runtimeVersionsList = new VersionComboViewer(runtimeControls);
        _runtimeVersionsList.getCombo().setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _runtimeVersionsList.setLabelProvider(new LabelProvider());
        _runtimeVersionsList.setContentProvider(ArrayContentProvider.getInstance());

        Composite componentControls = new Composite(content, SWT.NONE);
        componentControls.setLayout(new GridLayout());
        componentControls.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        label = new Label(componentControls, SWT.NONE);
        label.setText("Components:");
        label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));

        _componentsTable = new CheckboxTreeViewer(componentControls, SWT.SINGLE | SWT.BORDER | SWT.V_SCROLL
                | SWT.V_SCROLL);
        _componentsTable.setLabelProvider(new ComponentsLabelProvider());
        _componentsTable.setContentProvider(new ComponentsContentProvider());
        _componentsTable.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        _componentsTable.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                ISelection selection = _componentsTable.getSelection();
                if (selection instanceof IStructuredSelection && !selection.isEmpty()) {
                    Object selected = ((IStructuredSelection) selection).getFirstElement();
                    if (selected instanceof ISwitchYardComponentExtension) {
                        String description = ((ISwitchYardComponentExtension) selected).getDescription();
                        if (description == null || description.length() == 0) {
                            description = "unavailable";
                        }
                        _descriptionText.setText(description);
                    } else {
                        _descriptionText.setText("");
                    }
                } else {
                    _descriptionText.setText("");
                }
            }
        });
        _componentsTable.addFilter(new ViewerFilter() {
            private final Object _runtimeComponent = SwitchYardComponentExtensionManager.instance()
                    .getRuntimeComponentExtension();
            private final boolean _hasUnknownComponents = SwitchYardComponentExtensionManager.instance()
                    .getComponentExtensions(Category.UNKNOWN).size() > 1;

            @Override
            public boolean select(Viewer viewer, Object parentElement, Object element) {
                return element != _runtimeComponent && (element != Category.UNKNOWN || _hasUnknownComponents);
            }
        });
        _componentsTable.setSorter(new ComponentsSorter());
        _componentsTable.addCheckStateListener(new ICheckStateListener() {
            @Override
            public void checkStateChanged(CheckStateChangedEvent event) {
                updateCheckState(event.getElement(), event.getChecked());
            }
        });

        Group detailsGroup = new Group(componentControls, SWT.NONE);
        detailsGroup.setText("Component Description");
        detailsGroup.setLayout(new GridLayout());
        detailsGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

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
    public CheckboxTreeViewer getComponentsTable() {
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
        Set selectedComponents = new LinkedHashSet((List) Arrays.asList(_componentsTable.getCheckedElements()));
        selectedComponents.add(SwitchYardComponentExtensionManager.instance().getRuntimeComponentExtension());
        selectedComponents.removeAll(Arrays.asList(Category.values()));
        return selectedComponents;
    }

    /**
     * Set the check state for the set of components.
     * 
     * @param components the components to check/uncheck.
     * @param checked true, checked; false, unchecked.
     */
    public void setCheckedComponents(Set<ISwitchYardComponentExtension> components, boolean checked) {
        if (components == null || components.isEmpty() || _componentsTable == null
                || _componentsTable.getTree().isDisposed()) {
            return;
        }
        for (ISwitchYardComponentExtension component : components) {
            _componentsTable.setChecked(component, checked);
            updateCheckState(component, checked);
        }
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
        _componentsTable.setInput(SwitchYardComponentExtensionManager.instance());
        _componentsTable.setExpandedElements(EnumSet.of(Category.IMPLEMENTATION).toArray());
    }

    private void updateCheckState(Object element, boolean checked) {
        final ITreeContentProvider contentProvider = (ITreeContentProvider) _componentsTable.getContentProvider();
        // ensure children are checked
        _componentsTable.setSubtreeChecked(element, checked);
        _componentsTable.setGrayed(element, false);
        for (Object parent = contentProvider.getParent(element), input = _componentsTable.getInput(); parent != null
                && parent != input; parent = contentProvider.getParent(parent)) {
            final Object[] siblings = contentProvider.getChildren(parent);
            int count = 0;
            for (int i = 0; i < siblings.length; i++) {
                if (_componentsTable.getChecked(siblings[i])) {
                    count++;
                }
            }
            if (count == 0) {
                _componentsTable.setGrayChecked(parent, false);
            } else if (count == siblings.length) {
                _componentsTable.setChecked(parent, true);
                _componentsTable.setGrayed(parent, false);
            } else {
                _componentsTable.setGrayChecked(parent, true);
            }
        }
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

    private final static class ComponentsLabelProvider extends LabelProvider {
        public String getText(Object element) {
            if (element instanceof Category) {
                switch ((Category) element) {
                case UNKNOWN:
                    return "Unknown";
                case IMPLEMENTATION:
                    return "Implementation Support";
                case GATEWAY:
                    return "Gateway Bindings";
                case TEST:
                    return "Test Mixins";
                }
            } else if (element instanceof ISwitchYardComponentExtension) {
                return ((ISwitchYardComponentExtension) element).getName();
            }
            return super.getText(element);
        }
    }

    private final static class ComponentsContentProvider implements ITreeContentProvider {
        @Override
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        }

        @Override
        public void dispose() {
        }

        @Override
        public boolean hasChildren(Object element) {
            return getChildren(element).length > 0;
        }

        @Override
        public Object getParent(Object element) {
            if (element instanceof Category) {
                return SwitchYardComponentExtensionManager.instance();
            } else if (element instanceof ISwitchYardComponentExtension) {
                return ((ISwitchYardComponentExtension) element).getCategory();
            }
            return null;
        }

        @Override
        public Object[] getElements(Object inputElement) {
            return getChildren(inputElement);
        }

        @Override
        public Object[] getChildren(Object parentElement) {
            if (parentElement instanceof SwitchYardComponentExtensionManager) {
                return Category.values();
            } else if (parentElement instanceof Category) {
                return SwitchYardComponentExtensionManager.instance().getComponentExtensions((Category) parentElement)
                        .toArray();
            }
            return new Object[0];
        }
    }

    private final static class ComponentsSorter extends ViewerSorter {
        public int category(Object element) {
            final Category category;
            if (element instanceof Category) {
                category = (Category) element;
            } else if (element instanceof ISwitchYardComponentExtension) {
                category = ((ISwitchYardComponentExtension) element).getCategory();
            } else {
                category = Category.UNKNOWN;
            }
            switch (category) {
            case IMPLEMENTATION:
                return 0;
            case GATEWAY:
                return 1;
            case TEST:
                return 2;
            case UNKNOWN:
            default:
                return 3;
            }
        }
    }

}
