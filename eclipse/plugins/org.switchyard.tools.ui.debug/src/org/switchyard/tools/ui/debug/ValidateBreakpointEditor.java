/******************************************************************************* 
 * Copyright (c) 2014 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.debug;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.xml.XMLConstants;
import javax.xml.namespace.QName;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.internal.debug.ui.breakpoints.AbstractJavaBreakpointEditor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidateType;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceFactoryImpl;
import org.switchyard.tools.ui.SwitchYardModelUtils;
import org.switchyard.tools.ui.common.ISwitchYardProject;
import org.switchyard.tools.ui.common.impl.SwitchYardProjectManager;
import org.switchyard.tools.ui.debug.IInteractionConfiguration.TriggerType;

/**
 * ValidateBreakpointEditor
 * <p/>
 * Editor for validate breakpoints.
 */
@SuppressWarnings("restriction")
public class ValidateBreakpointEditor extends AbstractJavaBreakpointEditor {

    /** The property ID for triggers. */
    public static final int TRIGGER_PROP = 1;
    /** The property ID for types. */
    public static final int TYPES_PROP = 2;

    private ValidateHandlerBreakpoint _breakpoint;
    private Button _inButton;
    private Button _outButton;
    private Button _faultButton;
    private CheckboxTableViewer _typesTable;
    private Set<TriggerType> _triggers;
    private boolean _updating;

    @Override
    public Control createControl(Composite parent) {
        final ScrolledComposite scrollable = new ScrolledComposite(parent, SWT.H_SCROLL | SWT.V_SCROLL);
        scrollable.setLayout(new GridLayout());
        scrollable.setLayoutData(new GridData(GridData.FILL_BOTH));

        final Composite content = new Composite(scrollable, SWT.NONE);
        content.setLayout(new GridLayout());
        content.setLayoutData(new GridData(GridData.FILL_BOTH));
        content.setBackground(parent.getBackground());
        content.setBackgroundMode(SWT.INHERIT_DEFAULT);

        final Group phaseGroup = new Group(content, SWT.NONE);
        phaseGroup.setLayout(new GridLayout(3, false));
        phaseGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
        phaseGroup.setText("Triggering phase");

        _inButton = new Button(phaseGroup, SWT.CHECK);
        _inButton.setText("IN");
        _inButton.addSelectionListener(new TriggerSelectionListener(TriggerType.IN));

        _outButton = new Button(phaseGroup, SWT.CHECK);
        _outButton.setText("OUT");
        _outButton.addSelectionListener(new TriggerSelectionListener(TriggerType.OUT));

        _faultButton = new Button(phaseGroup, SWT.CHECK);
        _faultButton.setText("FAULT");
        _faultButton.addSelectionListener(new TriggerSelectionListener(TriggerType.FAULT));

        _typesTable = CheckboxTableViewer.newCheckList(content, SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
        GridData gd = new GridData(GridData.FILL_BOTH);
        gd.minimumHeight = _typesTable.getTable().getHeaderHeight() + 5 * _typesTable.getTable().getItemHeight();
        _typesTable.getControl().setLayoutData(gd);

        TableViewerColumn typeColumn = new TableViewerColumn(_typesTable, SWT.LEFT);
        typeColumn.getColumn().setResizable(true);
        typeColumn.getColumn().setText("Type");
        typeColumn.getColumn().setWidth(500);

        _typesTable.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                if (element instanceof String) {
                    final QName type = QName.valueOf((String) element);
                    final String localPart = type.getLocalPart();
                    final String namespaceUri = type.getNamespaceURI();
                    if (namespaceUri == null || XMLConstants.NULL_NS_URI.equals(namespaceUri)) {
                        if (localPart.startsWith("java:")) {
                            final int lastDot = localPart.lastIndexOf('.');
                            if (lastDot > 0) {
                                return localPart.substring(lastDot + 1) + " {" + localPart.substring(5, lastDot) + "}";
                            } else {
                                return localPart.substring(5);
                            }
                        } else {
                            return localPart;
                        }
                    } else {
                        return localPart + " {" + namespaceUri + "}";
                    }
                }
                return super.getText(element);
            }
        });
        _typesTable.addFilter(new ViewerFilter() {
            @Override
            public boolean select(Viewer viewer, Object parentElement, Object element) {
                return element instanceof String && ((String) element).length() > 0;
            }
        });
        _typesTable.setContentProvider(ArrayContentProvider.getInstance());
        _typesTable.getTable().setHeaderVisible(true);
        _typesTable.addCheckStateListener(new ICheckStateListener() {
            @Override
            public void checkStateChanged(CheckStateChangedEvent event) {
                if (_updating) {
                    return;
                }
                setDirty(TYPES_PROP);
            }
        });

        scrollable.setContent(content);
        content.setSize(content.computeSize(SWT.DEFAULT, SWT.DEFAULT));

        return scrollable;
    }

    @Override
    public void setFocus() {
    }

    @Override
    public IStatus getStatus() {
        if (_inButton.getSelection() || _outButton.getSelection() || _faultButton.getSelection()) {
            return Status.OK_STATUS;
        }
        return new Status(Status.ERROR, Activator.PLUGIN_ID, "Must select at least one trigger (IN, OUT or FAULT).");
    }

    @Override
    public Object getInput() {
        return _breakpoint;
    }

    @Override
    public void setInput(Object breakpoint) throws CoreException {
        _updating = true;
        try {
            if (breakpoint instanceof ValidateHandlerBreakpoint) {
                _breakpoint = (ValidateHandlerBreakpoint) breakpoint;
            } else {
                breakpoint = null;
            }
            initialize();
        } finally {
            _updating = false;
        }
    }

    @Override
    public void doSave() throws CoreException {
        if (_breakpoint != null) {
            final InteractionConfigurationBuilder builder = InteractionConfigurationBuilder.createFrom(_breakpoint
                    .getInteractionConfiguration());
            builder.triggers(_triggers.isEmpty() ? null : EnumSet.copyOf(_triggers));
            _breakpoint.setInteractionConfiguration(builder.build());

            final Set<String> types = new LinkedHashSet<String>();
            for (Object obj : _typesTable.getCheckedElements()) {
                final String type = (String) obj;
                if (type != null && type.length() > 0) {
                    types.add(type);
                }
            }
            final ValidateConfigurationBuilder validateBuilder = ValidateConfigurationBuilder.createFrom(_breakpoint
                    .getValidateConfiguration());
            validateBuilder.types(types);
            _breakpoint.setValidateConfiguration(validateBuilder.build());
        }
        setDirty(false);
    }

    private void initialize() {
        if (_breakpoint == null) {
            _inButton.setEnabled(false);
            _inButton.setSelection(false);

            _outButton.setEnabled(false);
            _outButton.setSelection(false);

            _faultButton.setEnabled(false);
            _faultButton.setSelection(false);
        } else {
            final IInteractionConfiguration config = _breakpoint.getInteractionConfiguration();
            final IValidateConfiguration validateConfig = _breakpoint.getValidateConfiguration();

            _triggers = config == null ? EnumSet.allOf(TriggerType.class) : config.getTriggers();
            if (_triggers == null || _triggers.isEmpty()) {
                _triggers = EnumSet.allOf(TriggerType.class);
            } else {
                _triggers = EnumSet.copyOf(_triggers);
            }

            _inButton.setEnabled(true);
            _inButton.setSelection(_triggers.contains(TriggerType.IN));

            _outButton.setEnabled(true);
            _outButton.setSelection(_triggers.contains(TriggerType.OUT));

            _faultButton.setSelection(_triggers.contains(TriggerType.FAULT));

            _typesTable.setInput(getValidators());
            if (validateConfig.getValidateTypes() == null) {
                _typesTable.setCheckedElements(new Object[0]);
            } else {
                _typesTable.setCheckedElements(validateConfig.getValidateTypes().toArray());
            }

            updateEnablement();
        }
        setDirty(false);
    }

    private void updateEnablement() {
        _faultButton.setEnabled(!_outButton.getSelection());
        _typesTable.getControl().setEnabled(_triggers != null && _triggers.size() > 0);
    }

    private Collection<String> getValidators() {
        final IResource markerResource = _breakpoint.getMarker().getResource();
        if (markerResource == null || markerResource.getProject() == null) {
            return Collections.emptyList();
        }
        ISwitchYardProject switchYardProject = SwitchYardProjectManager.instance().getSwitchYardProject(
                markerResource.getProject());
        if (switchYardProject == null) {
            return Collections.emptyList();
        }
        IFile switchYardFile = switchYardProject.getOutputSwitchYardConfigurationFile();
        if (switchYardFile == null || !switchYardFile.isAccessible()) {
            switchYardFile = switchYardProject.getSwitchYardConfigurationFile();
        }
        if (switchYardFile == null || !switchYardFile.isAccessible()) {
            return Collections.emptyList();
        }
        ResourceSet rs = SwitchYardModelUtils.newResourceSet();
        Resource resource = rs.createResource(
                URI.createPlatformResourceURI(switchYardFile.getFullPath().toPortableString(), true),
                SwitchyardResourceFactoryImpl.CONTENT_TYPE);
        try {
            resource.load(null);
            if (resource.getContents().size() > 0) {
                Object content = resource.getContents().get(0);
                if (content instanceof SwitchYardType) {
                    return getValidates((SwitchYardType) content);
                } else if (content instanceof DocumentRoot) {
                    return getValidates(((DocumentRoot) content).getSwitchyard());
                }
            }
        } catch (IOException e) {
            e.fillInStackTrace();
        } finally {
            resource.unload();
        }
        return Collections.emptyList();
    }

    private Collection<String> getValidates(final SwitchYardType switchyard) {
        if (switchyard == null || switchyard.getValidates() == null) {
            return Collections.emptyList();
        }
        final Set<String> validates = new LinkedHashSet<String>();
        for (ValidateType validate : switchyard.getValidates().getValidate()) {
            validates.add(validate.getName());
        }
        return validates;
    }

    private final class TriggerSelectionListener extends SelectionAdapter {
        private final TriggerType _trigger;

        private TriggerSelectionListener(final TriggerType trigger) {
            _trigger = trigger;
        }

        @Override
        public void widgetSelected(SelectionEvent event) {
            if (_updating) {
                return;
            }

            if (((Button) event.widget).getSelection()) {
                _triggers.add(_trigger);
            } else {
                _triggers.remove(_trigger);
            }
            updateEnablement();
            setDirty(TRIGGER_PROP);
        }
    }
}
