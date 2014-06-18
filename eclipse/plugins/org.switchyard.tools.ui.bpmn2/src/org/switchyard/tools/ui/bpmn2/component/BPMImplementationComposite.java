/* 
 * JBoss, Home of Professional Open Source 
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved. 
 * See the copyright.txt in the distribution for a 
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use, 
 * modify, copy, or redistribute it subject to the terms and conditions 
 * of the GNU Lesser General Public License, v. 2.1. 
 * This program is distributed in the hope that it will be useful, but WITHOUT A 
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details. 
 * You should have received a copy of the GNU Lesser General Public License, 
 * v.2.1 along with this distribution; if not, write to the Free Software 
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA  02110-1301, USA.
 */
package org.switchyard.tools.ui.bpmn2.component;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.internal.core.PackageFragment;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jdt.ui.actions.OpenNewClassWizardAction;
import org.eclipse.jdt.ui.wizards.NewClassWizardPage;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMOperationType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMFactory;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;
import org.switchyard.tools.models.switchyard1_0.bpm.ContainerType;
import org.switchyard.tools.models.switchyard1_0.bpm.OperationsType;
import org.switchyard.tools.models.switchyard1_0.bpm.ResourcesType;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.PlatformResourceAdapterFactory;
import org.switchyard.tools.ui.bpmn2.Messages;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.property.AbstractModelComposite;
import org.switchyard.tools.ui.editor.property.ICompositeContainer;

/**
 * BPMImplementationComposite
 * 
 * Composite for BPM component implementations.
 */
@SuppressWarnings("restriction")
public class BPMImplementationComposite extends AbstractModelComposite<Component> {

    private Composite _panel;
    private Text _processIDText;
    private Button _persistentButton;
    private Button _resourcesRadio;
    private Button _containerRadio;
    private StackLayout _manifestLayout;
    private BPMResourceTable _resourcesTable;
    private KIEContainerDetailsComposite _containerDetailsControls;
    private BPMActionTable _actionsTable;
    private BPMMappingsTable _inputsTable;
    private BPMMappingsTable _outputsTable;
    private BPMMappingsTable _globalsTable;
    private BPMMappingsTable _faultsTable;
    private BPMPropertyTable _propertiesTable;
    private BPMLoggerTable _loggersTable;
    private BPMTaskHandlerTable _handlersTable;
    private BPMEventListenerTable _listenersTable;
    private BPMChannelTable _channelsTable;
    private BPMImplementationType _implementation;
    private ResourcesType _resources;
    private ContainerType _container;
    private boolean _updating;
    private Text _userGroupCallbackClassText;
    private BPMUserGroupCallbackPropertyTable _userCallbackPropertiesTable;
    private Link _callbackLinkLabel;

    /**
     * Create a new BPMImplementationComposite.
     * 
     * @param container the container.
     * @param parent the parent composite.
     * @param style style bits.
     */
    public BPMImplementationComposite(ICompositeContainer container, Composite parent, int style) {
        super(Component.class, container, parent, style);

        final FormToolkit factory = getWidgetFactory();
        _panel = this;
        _panel.setLayout(new GridLayout());

        final TabFolder folder = new TabFolder(_panel, SWT.TOP);
        factory.adapt(folder);
        folder.setLayout(new Layout() {
            @Override
            protected void layout(Composite composite, boolean flushCache) {
                Rectangle rect = composite.getClientArea();

                TabItem[] selected = folder.getSelection();
                if (selected == null || selected.length == 0) {
                    return;
                }
                selected[0].getControl().setBounds(rect);
            }

            @Override
            protected Point computeSize(Composite composite, int wHint, int hHint, boolean flushCache) {
                if (wHint != SWT.DEFAULT && hHint != SWT.DEFAULT) {
                    return new Point(wHint, hHint);
                }

                int maxWidth = 0;
                int maxHeight = 0;
                TabItem[] selected = folder.getSelection();
                if (selected != null && selected.length > 0) {
                    Point pt = selected[0].getControl().computeSize(wHint, hHint, flushCache);
                    maxWidth = Math.max(0, pt.x);
                    maxHeight = Math.max(0, pt.y);
                }

                if (wHint != SWT.DEFAULT) {
                    maxWidth = Math.max(wHint, maxWidth);
                }
                if (hHint != SWT.DEFAULT) {
                    maxWidth = Math.max(hHint, maxHeight);
                }

                return new Point(maxWidth, maxHeight);
            }
        });
        folder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        TabItem general = new TabItem(folder, SWT.NONE);
        TabItem actions = new TabItem(folder, SWT.NONE);
        TabItem advanced = new TabItem(folder, SWT.NONE);

        general.setText(Messages.title_general);
        actions.setText(Messages.title_operations);
        advanced.setText(Messages.title_advanced);

        createGeneralControls(folder, general);
        createActionsControls(folder, actions);
        createAdvancedControls(folder, advanced);

        folder.setSelection(0);

        folder.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                getContainer().layout();
            }
        });
    }

    @Override
    public void refresh() {
        BPMOperationType selectedOp = null;
        if (_implementation != null && _actionsTable.getTableSelection() != null) {
            selectedOp = _actionsTable.getTableSelection();
        }
        _implementation = null;
        final Component bo = getTargetObject();
        if (bo != null) {
            Implementation rawImpl = ((Component) bo).getImplementation();
            if (rawImpl instanceof BPMImplementationType) {
                _implementation = (BPMImplementationType) rawImpl;
            } else {
                _implementation = null;
            }
            if (_implementation != null && _implementation.getManifest() != null) {
                _resources = _implementation.getManifest().getResources();
                _container = _implementation.getManifest().getContainer();
            }
        }
        _updating = true;
        try {
            _resourcesTable.setTargetObject(_implementation);
            _actionsTable.setTargetObject(_implementation);
            if (selectedOp != null) {
                OperationsType ops = _implementation.getOperations();
                if (ops != null && ops.getOperation() != null && !ops.getOperation().isEmpty()) {
                    Iterator<BPMOperationType> opIter = ops.getOperation().iterator();
                    while (opIter.hasNext()) {
                        BPMOperationType op = opIter.next();
                        if (op.getName().equals(selectedOp.getName())) { 
                            _actionsTable.getTableViewer().setSelection(new StructuredSelection(op));
                            break;
                        }
                    }
                } else {
                    _actionsTable.getTableViewer().setSelection(null);
                }
            }
            _propertiesTable.setTargetObject(_implementation);
            _loggersTable.setTargetObject(_implementation);
            _handlersTable.setTargetObject(_implementation);
            _listenersTable.setTargetObject(_implementation);
            _channelsTable.setTargetObject(_implementation);
            _userCallbackPropertiesTable.setTargetObject(_implementation);
            if (_implementation == null) {
                _processIDText.setText(""); //$NON-NLS-1$
                _persistentButton.setSelection(false);
            } else {
                _processIDText.setText(_implementation.getProcessId() == null ? "" : _implementation.getProcessId()); //$NON-NLS-1$
                _persistentButton.setSelection(_implementation.isPersistent());
            }
            if (_resources != null || _container == null) {
                _resourcesRadio.setSelection(true);
                _containerRadio.setSelection(false);
                _manifestLayout.topControl = _resourcesTable;
                _resourcesTable.getParent().layout();

                // container should be null if we get here
                _container = BPMFactory.eINSTANCE.createContainerType();
            } else {
                _resourcesRadio.setSelection(false);
                _containerRadio.setSelection(true);
                _manifestLayout.topControl = _containerDetailsControls;
                _containerDetailsControls.getParent().layout();
            }

            // initialize container controls
            _containerDetailsControls.setContainer(_container);
            if (_implementation != null && _implementation.getUserGroupCallback() != null) {
                String value = _implementation.getUserGroupCallback().getClass_();
                if (value == null) {
                    value = ""; //$NON-NLS-1$
                }
                _userGroupCallbackClassText.setText(value);
            }
        } finally {
            _updating = false;
        }
    }

    private void createGeneralControls(TabFolder folder, TabItem item) {
        final FormToolkit factory = getWidgetFactory();
        Composite control = factory.createComposite(folder);
        control.setLayout(new GridLayout(2, false));
        control.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        factory.createLabel(control, Messages.label_processId);
        _processIDText = factory.createText(control, "", SWT.BORDER); //$NON-NLS-1$
        _processIDText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        _processIDText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                final String newValue = _processIDText.getText().length() == 0 ? null : _processIDText.getText();
                if (!_updating
                        && ((newValue == null && _implementation.getProcessId() != null) || (newValue != null && !newValue
                                .equals(_implementation.getProcessId())))) {
                    wrapOperation(new Runnable() {
                        public void run() {
                            _implementation.setProcessId(newValue);
                        }
                    });
                }
            }
        });

        _persistentButton = factory.createButton(control, Messages.label_persistent, SWT.CHECK);
        _persistentButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        _persistentButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (!_updating && (_implementation.isPersistent() != _persistentButton.getSelection())) {
                    wrapOperation(new Runnable() {
                        public void run() {
                            _implementation.setPersistent(_persistentButton.getSelection());
                        }
                    });
                }
            }
        });

        Section resourcesSection = factory.createSection(control, Section.TITLE_BAR | Section.EXPANDED);
        resourcesSection.setText(Messages.label_manifest);
        resourcesSection.setLayout(new GridLayout());
        resourcesSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));

        Composite resourcesComposite = factory.createComposite(resourcesSection);
        resourcesComposite.setLayout(new GridLayout());
        resourcesComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        resourcesSection.setClient(resourcesComposite);

        Composite resourceButtonsComposite = factory.createComposite(resourcesComposite);
        resourceButtonsComposite.setLayout(new RowLayout());
        resourceButtonsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));

        SelectionListener radioListener = new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                if (_resourcesRadio.getSelection()) {
                    _manifestLayout.topControl = _resourcesTable;
                    _resourcesTable.getParent().layout();
                    if (!_updating && _implementation.getManifest() != null
                            && _implementation.getManifest().getContainer() != null) {
                        wrapOperation(new Runnable() {
                            public void run() {
                                _implementation.getManifest().setContainer(null);
                                _implementation.getManifest().setResources(_resources);
                            };
                        });
                    }
                } else {
                    _manifestLayout.topControl = _containerDetailsControls;
                    _containerDetailsControls.getParent().layout();
                    if (!_updating) {
                        if (_implementation.getManifest() == null
                                || _implementation.getManifest().getContainer() == null) {
                            wrapOperation(new Runnable() {
                                public void run() {
                                    if (_implementation.getManifest() == null) {
                                        _implementation.setManifest(BPMFactory.eINSTANCE.createManifestType());
                                    }
                                    _resources = _implementation.getManifest().getResources();
                                    _implementation.getManifest().setResources(null);
                                    _implementation.getManifest().setContainer(_container);
                                };
                            });
                        }
                    }
                }
            }
        };
        _resourcesRadio = factory.createButton(resourceButtonsComposite, Messages.label_definedResources, SWT.RADIO);
        _resourcesRadio.addSelectionListener(radioListener);
        _containerRadio = factory.createButton(resourceButtonsComposite, Messages.label_knowledgeContainer, SWT.RADIO);
        _containerRadio.addSelectionListener(radioListener);

        Composite resourceDetailsComposite = factory.createComposite(resourcesComposite);
        _manifestLayout = new StackLayout();
        resourceDetailsComposite.setLayout(_manifestLayout);
        resourceDetailsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        _resourcesTable = new BPMResourceTable(resourceDetailsComposite, SWT.NONE);
        _resourcesTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        createContainerDetailsControls(resourceDetailsComposite);

        item.setControl(control);
    }

    private void createContainerDetailsControls(Composite parent) {
        _containerDetailsControls = new KIEContainerDetailsComposite(parent, getWidgetFactory());
    }

    private void createActionsControls(TabFolder folder, TabItem item) {
        final FormToolkit factory = getWidgetFactory();
        final Composite control = factory.createComposite(folder);
        control.setLayout(new GridLayout(2, false));
        control.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        Composite actionsComposite = factory.createComposite(control);
        actionsComposite.setLayout(new GridLayout());
        actionsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        Section actionsSection = factory.createSection(actionsComposite, Section.TITLE_BAR | Section.EXPANDED);
        actionsSection.setText(Messages.title_operations);
        actionsSection.setLayout(new GridLayout());
        actionsSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        _actionsTable = new BPMActionTable(actionsSection, SWT.NONE);
        _actionsTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        actionsSection.setClient(_actionsTable);
        factory.adapt(_actionsTable);
        _actionsTable.getTableViewer().addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                final Object selected;
                if (event.getSelection().isEmpty()) {
                    selected = null;
                } else {
                    selected = ((IStructuredSelection) event.getSelection()).getFirstElement();
                }
                _inputsTable.setTargetObject((BPMOperationType) selected);
                _outputsTable.setTargetObject((BPMOperationType) selected);
                _globalsTable.setTargetObject((BPMOperationType) selected);
                _faultsTable.setTargetObject((BPMOperationType) selected);

                _inputsTable.setEnabled(selected != null);
                _outputsTable.setEnabled(selected != null);
                _globalsTable.setEnabled(selected != null);
                _faultsTable.setEnabled(selected != null);
            }
        });

        Composite mappingsComposite = factory.createComposite(control);
        mappingsComposite.setLayout(new GridLayout());
        mappingsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        Section globalsSection = factory.createSection(mappingsComposite, Section.TWISTIE | Section.TITLE_BAR);
        globalsSection.setText(Messages.title_globals);
        globalsSection.setLayout(new GridLayout());
        globalsSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        globalsSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                getContainer().layout();
            }
        });

        _globalsTable = new BPMMappingsTable(globalsSection, SWT.NONE,"message.content", "",  //$NON-NLS-1$ //$NON-NLS-2$
                BPMPackage.eINSTANCE.getBPMOperationType_Globals(), BPMPackage.eINSTANCE.getGlobalsType_Global());
        _globalsTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        factory.adapt(_globalsTable);
        globalsSection.setClient(_globalsTable);

        Section inputsSection = factory.createSection(mappingsComposite, Section.TWISTIE | Section.TITLE_BAR
                | Section.EXPANDED);
        inputsSection.setText(Messages.title_inputs);
        inputsSection.setLayout(new GridLayout());
        inputsSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        inputsSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                getContainer().layout();
            }
        });

        _inputsTable = new BPMMappingsTable(inputsSection, SWT.NONE, "message.content", "Parameter", //$NON-NLS-1$ //$NON-NLS-2$
                BPMPackage.eINSTANCE.getBPMOperationType_Inputs(), BPMPackage.eINSTANCE.getInputsType_Input());
        _inputsTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        factory.adapt(_inputsTable);
        inputsSection.setClient(_inputsTable);

        Section outputsSection = factory.createSection(mappingsComposite, Section.TWISTIE | Section.TITLE_BAR
                | Section.EXPANDED);
        outputsSection.setText(Messages.title_outputs);
        outputsSection.setLayout(new GridLayout());
        outputsSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        outputsSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                getContainer().layout();
            }
        });

        _outputsTable = new BPMMappingsTable(outputsSection, SWT.NONE, "Result", "message.content", //$NON-NLS-1$ //$NON-NLS-2$
                BPMPackage.eINSTANCE.getBPMOperationType_Outputs(), BPMPackage.eINSTANCE.getOutputsType_Output());
        _outputsTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        factory.adapt(_outputsTable);
        outputsSection.setClient(_outputsTable);

        Section faultsSection = factory.createSection(mappingsComposite, Section.TWISTIE | Section.TITLE_BAR
                | Section.EXPANDED);
        faultsSection.setText(Messages.title_faults);
        faultsSection.setLayout(new GridLayout());
        faultsSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        faultsSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                getContainer().layout();
            }
        });

        _faultsTable = new BPMMappingsTable(faultsSection, SWT.NONE, "Fault", "message.content", //$NON-NLS-1$ //$NON-NLS-2$
                BPMPackage.eINSTANCE.getBPMOperationType_Faults(), BPMPackage.eINSTANCE.getFaultsType_Fault());
        _faultsTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        factory.adapt(_faultsTable);
        faultsSection.setClient(_faultsTable);

        _inputsTable.setEnabled(false);
        _outputsTable.setEnabled(false);
        _globalsTable.setEnabled(false);
        _faultsTable.setEnabled(false);

        item.setControl(control);
    }

    private void createAdvancedControls(TabFolder folder, TabItem item) {
        final FormToolkit factory = getWidgetFactory();
        final Composite control = factory.createComposite(folder);
        control.setLayout(new GridLayout());
        control.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        Section channelsSection = factory.createSection(control, Section.TWISTIE | Section.TITLE_BAR
                | Section.EXPANDED);
        channelsSection.setText(Messages.title_channels);
        channelsSection.setLayout(new GridLayout());
        channelsSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        channelsSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                getContainer().layout();
            }
        });

        _channelsTable = new BPMChannelTable(channelsSection, SWT.NONE);
        _channelsTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        factory.adapt(_channelsTable);
        channelsSection.setClient(_channelsTable);

        Section listenersSection = factory.createSection(control, Section.TWISTIE | Section.TITLE_BAR);
        listenersSection.setText(Messages.title_listeners);
        listenersSection.setLayout(new GridLayout());
        listenersSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        listenersSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                getContainer().layout();
            }
        });

        _listenersTable = new BPMEventListenerTable(listenersSection, SWT.NONE);
        _listenersTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        factory.adapt(_listenersTable);
        listenersSection.setClient(_listenersTable);

        Section loggersSection = factory.createSection(control, Section.TWISTIE | Section.TITLE_BAR);
        loggersSection.setText(Messages.title_loggers);
        loggersSection.setLayout(new GridLayout());
        loggersSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        loggersSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                getContainer().layout();
            }
        });

        _loggersTable = new BPMLoggerTable(loggersSection, SWT.NONE);
        _loggersTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        factory.adapt(_loggersTable);
        loggersSection.setClient(_loggersTable);

        Section propertiesSection = factory.createSection(control, Section.TWISTIE | Section.TITLE_BAR);
        propertiesSection.setText(Messages.title_properties);
        propertiesSection.setLayout(new GridLayout());
        propertiesSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        propertiesSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                getContainer().layout();
            }
        });

        _propertiesTable = new BPMPropertyTable(propertiesSection, SWT.NONE);
        _propertiesTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        factory.adapt(_propertiesTable);
        propertiesSection.setClient(_propertiesTable);

        addUserGroupCallBackSection(factory, control);

        final Section handlersSection = factory.createSection(control, Section.TWISTIE | Section.TITLE_BAR);
        handlersSection.setText(Messages.title_workItemHandlers);
        handlersSection.setLayout(new GridLayout());
        handlersSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        handlersSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                getContainer().layout();
            }
        });

        _handlersTable = new BPMTaskHandlerTable(handlersSection, SWT.NONE);
        _handlersTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        factory.adapt(_handlersTable);
        handlersSection.setClient(_handlersTable);

        item.setControl(control);
    }
    
    private void addUserGroupCallBackSection(final FormToolkit factory, final Composite control) {
        Section userGroupCallbackSection = factory.createSection(control, Section.TWISTIE | Section.TITLE_BAR);
        userGroupCallbackSection.setText(Messages.title_userGroupCallback);
        userGroupCallbackSection.setLayout(new GridLayout());
        userGroupCallbackSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        userGroupCallbackSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                getContainer().layout();
            }
        });

        Composite userGroupCallbackControl = factory.createComposite(userGroupCallbackSection);
        userGroupCallbackControl.setLayout(new GridLayout(3, false));
        userGroupCallbackControl.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        _callbackLinkLabel = new Link(userGroupCallbackControl, SWT.NONE);
        String message = Messages.link_class;
        _callbackLinkLabel.setText(message);
        _callbackLinkLabel.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                handleClassLink(_userGroupCallbackClassText, _callbackLinkLabel,
                        "org.kie.internal.task.api.UserGroupCallback"); //$NON-NLS-1$
            }
        });

        _userGroupCallbackClassText = factory.createText(userGroupCallbackControl, "", SWT.BORDER); //$NON-NLS-1$
        _userGroupCallbackClassText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        _userGroupCallbackClassText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                final String newValue = _userGroupCallbackClassText.getText().length() == 0 ? null : _userGroupCallbackClassText.getText();
                if (!_updating) {
                    wrapOperation(new Runnable() {
                        public void run() {
                            if (_implementation.getUserGroupCallback() == null) {
                                _implementation.setUserGroupCallback(BPMFactory.eINSTANCE.createUserGroupCallbackType());
                            }
                            
                            _implementation.getUserGroupCallback().setClass(newValue);

                            if (_implementation.getUserGroupCallback().getClass_() == null
                                    && _implementation.getUserGroupCallback().getProperties() == null) {
                                _implementation.setUserGroupCallback(null);
                            }
                        }
                    });
                }
            }
        });
        Button _userGroupCallbackClassBrowseBtn = factory.createButton(userGroupCallbackControl, Messages.button_dots, SWT.PUSH);
        _userGroupCallbackClassBrowseBtn.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
        _userGroupCallbackClassBrowseBtn.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                try {
                    IProject project = null;
                    if (_implementation != null) {
                        project = PlatformResourceAdapterFactory.getContainingProject(_implementation);
                    }
                    IType selected = selectType(_panel.getShell(), "org.kie.internal.task.api.UserGroupCallback", project); //$NON-NLS-1$
                    if (selected != null) {
                        _userGroupCallbackClassText.setText(selected.getFullyQualifiedName());
                    }
                } catch (JavaModelException e1) {
                    e1.printStackTrace();
                }
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                widgetSelected(e);
            }
        });
        
        Label callbackPropsLabel = factory.createLabel(userGroupCallbackControl, Messages.label_properties);
        callbackPropsLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
        
        _userCallbackPropertiesTable = new BPMUserGroupCallbackPropertyTable(userGroupCallbackControl, SWT.NONE);
        _userCallbackPropertiesTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 5));
        factory.adapt(_userCallbackPropertiesTable);

        userGroupCallbackSection.setClient(userGroupCallbackControl);
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
        if (superTypeName != null && !superTypeName.equals("java.lang.Object")) { //$NON-NLS-1$
            if (project == null && _implementation != null) {
                project = PlatformResourceAdapterFactory.getContainingProject(_implementation);
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
        dialog.setTitle(Messages.title_selectEntries);
        dialog.setMessage(Messages.description_matchingItems);
        if (dialog.open() == IDialogConstants.CANCEL_ID) {
            return null;
        }
        Object[] types = dialog.getResult();
        if (types == null || types.length == 0) {
            return null;
        }
        return (IType) types[0];
    }

    private String handleCreateJavaClass(String className, String interfaceName) throws JavaModelException {
        IProject project = null;
        IJavaProject javaProject = null;
        OpenNewClassWizardAction action = new OpenNewClassWizardAction();
        IFile modelFile = SwitchyardSCAEditor.getEditor(_implementation).getModelFile();
        IStructuredSelection selectionToPass = StructuredSelection.EMPTY;
        if (modelFile != null) {
            selectionToPass = new StructuredSelection(modelFile);
            project = ((IFile) selectionToPass.getFirstElement()).getProject();
        }
        NewClassWizardPage page = new NewClassWizardPage();
        ArrayList<String> interfaces = new ArrayList<String>();
        if (interfaceName != null && interfaceName.trim().length() > 0) {
            interfaces.add(interfaceName);
            page.setSuperInterfaces(interfaces, false);
        }
        IPackageFragmentRoot packRoot = null;
        if (project != null) { //$NON-NLS-1$
            javaProject = JavaCore.create(project);
            if (!className.isEmpty()) {
                if (className.contains(".")) { //$NON-NLS-1$
                    className = className.substring(className.lastIndexOf('.') + 1);
                }
                page.setTypeName(className, true);
            }
            packRoot = JavaUtil.getFirstJavaSourceRoot(javaProject);
            page.setPackageFragmentRoot(packRoot, true);
        }
        action.setSelection(selectionToPass);
        if (javaProject != null) {
            IJavaElement[] roots = packRoot.getChildren();
            PackageFragment stashFrag = null;
            for (int i = 0; i < roots.length; i++) {
                PackageFragment frag = (PackageFragment) roots[i];
                if (!frag.isDefaultPackage() && !frag.hasSubpackages()) {
                    stashFrag = frag;
                    break;
                }
            }
            if (stashFrag != null) {
                page.setPackageFragment(stashFrag, true);
            }
        }
        action.setConfiguredWizardPage(page);
        action.setOpenEditorOnFinish(false);
        action.run();
        IJavaElement createdElement = action.getCreatedElement();
        if (createdElement != null && createdElement instanceof IType) {
            IType stype = (IType) createdElement;
            String name = stype.getFullyQualifiedName();
            if (name != null) {
                return name;
            }
        }
        return null;
    }

    private void handleClassLink(Text classText, Link classLink, String interfaceName) {
        if (classText != null && !classText.isDisposed()) {
            String classname = classText.getText();
            try {
                IType foundClass = canFindClass(classname);
                if (foundClass == null) {
                    String className = handleCreateJavaClass(classname, interfaceName);
                    if (className != null) {
                        classText.setText(className);
                    }
                    return;
                } else {
                    handleOpenJavaClass(foundClass);
                }
            } catch (JavaModelException e1) {
                e1.printStackTrace();
            }
        }
    }

    private IType canFindClass(String classname) throws JavaModelException {
        IProject project = null;
        ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService()
                .getSelection();
        IStructuredSelection selectionToPass = StructuredSelection.EMPTY;
        if (selection instanceof IStructuredSelection) {
            selectionToPass = (IStructuredSelection) selection;
            if (selectionToPass.getFirstElement() instanceof IFile) {
                project = ((IFile) selectionToPass.getFirstElement()).getProject();
            } else if (selectionToPass.getFirstElement() instanceof AbstractGraphicalEditPart) {
                project = PlatformResourceAdapterFactory.getContainingProject(_implementation); 
            }
        }
        if (selectionToPass == StructuredSelection.EMPTY) {
            project = PlatformResourceAdapterFactory.getContainingProject(_implementation); 
        }
        if (project != null && classname != null) { //$NON-NLS-1$
            IJavaProject javaProject = JavaCore.create(project);
            IType superType = javaProject.findType(classname);
            if (superType != null) {
                return superType;
            }
        }
        return null;
    }

    private void handleOpenJavaClass(IType classToOpen) {
        if (classToOpen != null) {
            try {
                JavaUI.openInEditor(classToOpen);
            } catch (PartInitException e) {
                e.printStackTrace();
            } catch (JavaModelException e) {
                e.printStackTrace();
            }
        }
    }
}
