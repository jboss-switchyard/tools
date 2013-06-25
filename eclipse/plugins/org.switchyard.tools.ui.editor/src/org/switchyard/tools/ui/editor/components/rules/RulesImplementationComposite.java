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
package org.switchyard.tools.ui.editor.components.rules;

import java.util.Arrays;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
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
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.switchyard.tools.models.switchyard1_0.rules.ContainerType;
import org.switchyard.tools.models.switchyard1_0.rules.ResourcesType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesFactory;
import org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesOperationType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesPackage;
import org.switchyard.tools.ui.editor.property.AbstractChangeAwareModelComposite;
import org.switchyard.tools.ui.editor.property.ICompositeContainer;

/**
 * BPMImplementationComposite
 * 
 * Composite for BPM component implementations.
 */
public class RulesImplementationComposite extends AbstractChangeAwareModelComposite<Component> {

    private Composite _panel;
    private Button _resourcesRadio;
    private Button _containerRadio;
    private StackLayout _manifestLayout;
    private RulesResourceTable _resourcesTable;
    private KIEContainerDetailsComposite _containerDetailsControls;
    private RulesActionTable _actionsTable;
    private RulesMappingsTable _inputsTable;
    private RulesMappingsTable _outputsTable;
    private RulesMappingsTable _faultsTable;
    private RulesMappingsTable _globalsTable;
    private RulesPropertyTable _propertiesTable;
    private RulesLoggerTable _loggersTable;
    private RulesEventListenerTable _listenersTable;
    private RulesChannelTable _channelsTable;
    private RulesImplementationType _implementation;
    private ResourcesType _resources;
    private ContainerType _container;
    private boolean _updating;

    /**
     * Create a new BPMImplementationComposite.
     * 
     * @param container the container.
     * @param parent the parent composite.
     * @param style style bits.
     */
    public RulesImplementationComposite(ICompositeContainer container, Composite parent, int style) {
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

        TabItem resources = new TabItem(folder, SWT.NONE);
        TabItem actions = new TabItem(folder, SWT.NONE);
        TabItem advanced = new TabItem(folder, SWT.NONE);

        resources.setText("Resources");
        actions.setText("Operations");
        advanced.setText("Advanced");

        createResourcesControls(folder, resources);
        createActionsControls(folder, actions);
        createAdvancedControls(folder, advanced);

        folder.setSelection(0);

        folder.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                getContainer().layout();
            }
        });
        
        adaptChildren(folder);
    }

    @Override
    public void refresh() {
        _implementation = null;
        final Component bo = getTargetObject();
        if (bo != null) {
            _implementation = (RulesImplementationType) ((Component) bo).getImplementation();
            if (_implementation != null && _implementation.getManifest() != null) {
                _resources = _implementation.getManifest().getResources();
                _container = _implementation.getManifest().getContainer();
            }
        }
        _updating = true;
        try {
            _resourcesTable.setTargetObject(_implementation);
            _actionsTable.setTargetObject(_implementation);
            _propertiesTable.setTargetObject(_implementation);
            _loggersTable.setTargetObject(_implementation);
            _listenersTable.setTargetObject(_implementation);
            _channelsTable.setTargetObject(_implementation);
            if (_resources != null || _container == null) {
                _resourcesRadio.setSelection(true);
                _containerRadio.setSelection(false);
                _manifestLayout.topControl = _resourcesTable;
                _resourcesTable.getParent().layout();

                // container should be null if we get here
                _container = RulesFactory.eINSTANCE.createContainerType();
            } else {
                _resourcesRadio.setSelection(false);
                _containerRadio.setSelection(true);
                _manifestLayout.topControl = _containerDetailsControls;
                _containerDetailsControls.getParent().layout();
            }
            // initialize container controls
            _containerDetailsControls.setContainer(_container);
        } finally {
            _updating = false;
        }
    }

    private void createResourcesControls(TabFolder folder, TabItem item) {
        final FormToolkit factory = getWidgetFactory();
        Composite control = factory.createComposite(folder);
        control.setLayout(new GridLayout());
        control.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        Section resourcesSection = factory.createSection(control, Section.TITLE_BAR | Section.EXPANDED);
        resourcesSection.setText("Resources");
        resourcesSection.setLayout(new GridLayout(2, false));
        resourcesSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        Composite resourcesComposite = factory.createComposite(resourcesSection);
        resourcesComposite.setLayout(new GridLayout());
        resourcesComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        resourcesSection.setClient(resourcesComposite);

        Composite resourceButtonsComposite = factory.createComposite(resourcesComposite);
        resourceButtonsComposite.setLayout(new RowLayout());
        resourceButtonsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

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
                                        _implementation.setManifest(RulesFactory.eINSTANCE.createManifestType());
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
        _resourcesRadio = factory.createButton(resourceButtonsComposite, "Defined Resources", SWT.RADIO);
        _resourcesRadio.addSelectionListener(radioListener);
        _containerRadio = factory.createButton(resourceButtonsComposite, "Knowledge Container", SWT.RADIO);
        _containerRadio.addSelectionListener(radioListener);

        Composite resourceDetailsComposite = factory.createComposite(resourcesComposite);
        _manifestLayout = new StackLayout();
        resourceDetailsComposite.setLayout(_manifestLayout);
        resourceDetailsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        _resourcesTable = new RulesResourceTable(resourceDetailsComposite, SWT.NONE);
        _resourcesTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        factory.adapt(_resourcesTable);

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
        actionsSection.setText("Operations");
        actionsSection.setLayout(new GridLayout());
        actionsSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        _actionsTable = new RulesActionTable(actionsSection, SWT.NONE);
        _actionsTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        factory.adapt(_actionsTable);
        actionsSection.setClient(_actionsTable);
        _actionsTable.getTableViewer().addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                final Object selected;
                if (event.getSelection().isEmpty()) {
                    selected = null;
                } else {
                    selected = ((IStructuredSelection) event.getSelection()).getFirstElement();
                }
                _inputsTable.setTargetObject((RulesOperationType) selected);
                _outputsTable.setTargetObject((RulesOperationType) selected);
                _globalsTable.setTargetObject((RulesOperationType) selected);
                _faultsTable.setTargetObject((RulesOperationType) selected);
                
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
        globalsSection.setText("Globals");
        globalsSection.setLayout(new GridLayout());
        globalsSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        globalsSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                getContainer().layout();
            }
        });

        _globalsTable = new RulesMappingsTable(globalsSection, SWT.NONE, "message.content", null,
                RulesPackage.eINSTANCE.getRulesOperationType_Globals(), RulesPackage.eINSTANCE.getGlobalsType_Global(),
                Arrays.asList(RulesMappingsTable.FROM_COLUMN, RulesMappingsTable.TO_COLUMN));
        _globalsTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        factory.adapt(_globalsTable);
        globalsSection.setClient(_globalsTable);

        Section inputsSection = factory.createSection(mappingsComposite, Section.TWISTIE | Section.TITLE_BAR
                | Section.EXPANDED);
        inputsSection.setText("Inputs");
        inputsSection.setLayout(new GridLayout());
        inputsSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        inputsSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                getContainer().layout();
            }
        });

        _inputsTable = new RulesMappingsTable(inputsSection, SWT.NONE, "message.content", null,
                RulesPackage.eINSTANCE.getRulesOperationType_Inputs(), RulesPackage.eINSTANCE.getInputsType_Input(),
                Arrays.asList(RulesMappingsTable.FROM_COLUMN, RulesMappingsTable.TO_COLUMN));
        _inputsTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        factory.adapt(_inputsTable);
        inputsSection.setClient(_inputsTable);

        Section outputsSection = factory.createSection(mappingsComposite, Section.TWISTIE | Section.TITLE_BAR
                | Section.EXPANDED);
        outputsSection.setText("Outputs");
        outputsSection.setLayout(new GridLayout());
        outputsSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        outputsSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                getContainer().layout();
            }
        });

        _outputsTable = new RulesMappingsTable(outputsSection, SWT.NONE, null, "message.content",
                RulesPackage.eINSTANCE.getRulesOperationType_Outputs(), RulesPackage.eINSTANCE.getOutputsType_Output(),
                Arrays.asList(RulesMappingsTable.FROM_COLUMN, RulesMappingsTable.TO_COLUMN));
        _outputsTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        factory.adapt(_outputsTable);
        outputsSection.setClient(_outputsTable);

        Section faultsSection = factory.createSection(mappingsComposite, Section.TWISTIE | Section.TITLE_BAR
                | Section.EXPANDED);
        faultsSection.setText("Faults");
        faultsSection.setLayout(new GridLayout());
        faultsSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        faultsSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                getContainer().layout();
            }
        });

        _faultsTable = new RulesMappingsTable(faultsSection, SWT.NONE, null, "message.content",
                RulesPackage.eINSTANCE.getRulesOperationType_Faults(), RulesPackage.eINSTANCE.getFaultsType_Fault(),
                Arrays.asList(RulesMappingsTable.FROM_COLUMN, RulesMappingsTable.TO_COLUMN));
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

        Section channelsSection = factory.createSection(control, Section.TWISTIE | Section.TITLE_BAR);
        channelsSection.setText("Channels");
        channelsSection.setLayout(new GridLayout());
        channelsSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        channelsSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                getContainer().layout();
            }
        });

        Composite channelsComposite = factory.createComposite(channelsSection);
        channelsComposite.setLayout(new GridLayout(2, false));
        channelsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        channelsSection.setClient(channelsComposite);

        _channelsTable = new RulesChannelTable(channelsSection, SWT.NONE);
        _channelsTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        factory.adapt(_channelsTable);
        channelsSection.setClient(_channelsTable);

        Section propertiesSection = factory.createSection(control, Section.TWISTIE | Section.TITLE_BAR
                | Section.EXPANDED);
        propertiesSection.setText("Drools Runtime Properties");
        propertiesSection.setLayout(new GridLayout());
        propertiesSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        propertiesSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                getContainer().layout();
            }
        });

        _propertiesTable = new RulesPropertyTable(propertiesSection, SWT.NONE);
        _propertiesTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        factory.adapt(_propertiesTable);
        propertiesSection.setClient(_propertiesTable);

        Section loggersSection = factory.createSection(control, Section.TWISTIE | Section.TITLE_BAR);
        loggersSection.setText("Loggers");
        loggersSection.setLayout(new GridLayout());
        loggersSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        loggersSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                getContainer().layout();
            }
        });

        _loggersTable = new RulesLoggerTable(loggersSection, SWT.NONE);
        _loggersTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        factory.adapt(_loggersTable);
        loggersSection.setClient(_loggersTable);

        Section listenersSection = factory.createSection(control, Section.TWISTIE | Section.TITLE_BAR);
        listenersSection.setText("Event Listeners");
        listenersSection.setLayout(new GridLayout());
        listenersSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        listenersSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                getContainer().layout();
            }
        });

        _listenersTable = new RulesEventListenerTable(listenersSection, SWT.NONE);
        _listenersTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        factory.adapt(_listenersTable);
        listenersSection.setClient(_listenersTable);

        item.setControl(control);
    }

}
