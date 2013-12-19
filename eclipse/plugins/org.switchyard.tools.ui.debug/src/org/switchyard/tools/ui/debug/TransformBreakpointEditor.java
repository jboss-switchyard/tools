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
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceFactoryImpl;
import org.switchyard.tools.ui.SwitchYardModelUtils;
import org.switchyard.tools.ui.common.ISwitchYardProject;
import org.switchyard.tools.ui.common.impl.SwitchYardProjectManager;
import org.switchyard.tools.ui.debug.IInteractionConfiguration.TriggerType;
import org.switchyard.tools.ui.debug.TransformConfigurationBuilder.DummyTransformType;

/**
 * TransformBreakpointEditor
 * <p/>
 * Editor for transform breakpoints.
 */
@SuppressWarnings("restriction")
public class TransformBreakpointEditor extends AbstractJavaBreakpointEditor {

    /** The property ID for triggers. */
    public static final int TRIGGER_PROP = 1;
    /** The property ID for transforms. */
    public static final int TRANSFORMS_PROP = 2;

    private TransformSequenceBreakpoint _breakpoint;
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
        _typesTable.getTable().setHeaderVisible(true);

        TableViewerColumn fromColumn = new TableViewerColumn(_typesTable, SWT.LEFT);
        fromColumn.getColumn().setText("From");
        fromColumn.getColumn().setResizable(true);
        fromColumn.getColumn().setWidth(200);

        TableViewerColumn toColumn = new TableViewerColumn(_typesTable, SWT.LEFT);
        toColumn.getColumn().setText("To");
        toColumn.getColumn().setResizable(true);
        toColumn.getColumn().setWidth(200);

        GridData gd = new GridData(GridData.FILL_BOTH);
        gd.minimumHeight = _typesTable.getTable().getHeaderHeight() + 5 * _typesTable.getTable().getItemHeight();
        _typesTable.getControl().setLayoutData(gd);

        _typesTable.setLabelProvider(new ITableLabelProvider() {
            @Override
            public void addListener(ILabelProviderListener listener) {
            }

            @Override
            public void dispose() {
            }

            @Override
            public boolean isLabelProperty(Object element, String property) {
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
                if (element instanceof TransformType) {
                    if (columnIndex == 0) {
                        return getText(((TransformType) element).getFrom());
                    } else {
                        return getText(((TransformType) element).getTo());
                    }
                }
                return "";
            }

            private String getText(final String typeName) {
                if (typeName == null || typeName.length() == 0) {
                    return "";
                }
                final QName type = QName.valueOf(typeName);
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
        });
        _typesTable.addFilter(new ViewerFilter() {
            @Override
            public boolean select(Viewer viewer, Object parentElement, Object element) {
                return element instanceof TransformType && ((TransformType) element).getFrom() != null
                        && ((TransformType) element).getFrom().length() > 0
                        && ((TransformType) element).getTo() != null && ((TransformType) element).getTo().length() > 0;
            }
        });
        _typesTable.setContentProvider(ArrayContentProvider.getInstance());
        _typesTable.addCheckStateListener(new ICheckStateListener() {
            @Override
            public void checkStateChanged(CheckStateChangedEvent event) {
                if (_updating) {
                    return;
                }
                setDirty(TRANSFORMS_PROP);
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
            if (breakpoint instanceof TransformSequenceBreakpoint) {
                _breakpoint = (TransformSequenceBreakpoint) breakpoint;
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

            final Set<TransformType> transforms = new LinkedHashSet<TransformType>();
            for (Object obj : _typesTable.getCheckedElements()) {
                final TransformType transform = (TransformType) obj;
                if (transform != null && transform.getFrom() != null && transform.getTo() != null) {
                    transforms.add(transform);
                }
            }
            final TransformConfigurationBuilder transformBuilder = TransformConfigurationBuilder.createFrom(_breakpoint
                    .getTransformConfiguration());
            transformBuilder.transforms(transforms);
            _breakpoint.setTransformConfiguration(transformBuilder.build());
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
            final ITransformConfiguration transformConfig = _breakpoint.getTransformConfiguration();

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

            _typesTable.setInput(getTransforms());
            if (transformConfig.getTransforms() == null) {
                _typesTable.setCheckedElements(new Object[0]);
            } else {
                _typesTable.setCheckedElements(transformConfig.getTransforms().toArray());
            }

            updateEnablement();
        }
        setDirty(false);
    }

    private void updateEnablement() {
        _faultButton.setEnabled(!_outButton.getSelection());
        _typesTable.getControl().setEnabled(_triggers != null && _triggers.size() > 0);
    }

    private Collection<TransformType> getTransforms() {
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
                    final Set<TransformType> transforms = new LinkedHashSet<TransformType>();
                    for (TransformType transform : getTransforms((SwitchYardType) content)) {
                        transforms.add(new DummyTransformType(transform));
                    }
                    return transforms;
                } else if (content instanceof DocumentRoot) {
                    final Set<TransformType> transforms = new LinkedHashSet<TransformType>();
                    for (TransformType transform : getTransforms(((DocumentRoot) content).getSwitchyard())) {
                        transforms.add(new DummyTransformType(transform));
                    }
                    return transforms;
                }
            }
        } catch (IOException e) {
            e.fillInStackTrace();
        } finally {
            resource.unload();
        }
        return Collections.emptyList();
    }

    private Collection<TransformType> getTransforms(final SwitchYardType switchyard) {
        if (switchyard == null || switchyard.getTransforms() == null) {
            return Collections.emptyList();
        }
        return switchyard.getTransforms().getTransform();
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
