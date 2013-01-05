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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.switchyard.tools.models.switchyard1_0.rules.ActionType1;
import org.switchyard.tools.models.switchyard1_0.rules.ContainerType;
import org.switchyard.tools.models.switchyard1_0.rules.ResourcesType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesFactory;
import org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesPackage;
import org.switchyard.tools.ui.editor.Activator;

/**
 * RulesImplementationPropertySection
 * 
 * Property sheet composite for BPM component implementations.
 */
public class RulesImplementationPropertySection extends GFPropertySection implements ITabbedPropertyConstants {

    private static final Pattern GAV_PATTERN = Pattern.compile("([^: ]*)(:([^: ]*)(:([^: ]*))?)?");

    private TabbedPropertySheetPage _page;
    private Composite _panel;
    private Button _resourcesRadio;
    private Button _containerRadio;
    private StackLayout _manifestLayout;
    private RulesResourceTable _resourcesTable;
    private Composite _containerDetailsControls;
    private Text _sessionNameText;
    private Text _baseNameText;
    private Text _groupIdText;
    private Text _artifactIdText;
    private Text _versionText;
    private Button _scanCheckbox;
    private Text _scanIntervalText;
    private RulesActionTable _actionsTable;
    private RulesMappingsTable _inputsTable;
    private RulesMappingsTable _outputsTable;
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
     * Create a new RulesImplementationPropertySection.
     */
    public RulesImplementationPropertySection() {
    }

    @Override
    public void refresh() {
        _implementation = null;
        final PictogramElement pe = getSelectedPictogramElement();
        if (pe != null) {
            final Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
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
            _sessionNameText.setText(_container.getSessionName() == null ? "" : _container.getSessionName());
            _baseNameText.setText(_container.getBaseName() == null ? "" : _container.getBaseName());
            _scanCheckbox.setSelection(_container.isScan());
            _scanIntervalText.setEnabled(_container.isScan());
            _scanIntervalText.setText(Long.toString(_container.getScanInterval()));
            if (_container.getReleaseId() == null) {
                _groupIdText.setText("");
                _artifactIdText.setText("");
                _versionText.setText("");
            } else {
                final Matcher matcher = GAV_PATTERN.matcher(_container.getReleaseId());
                final String groupId;
                final String artifactId;
                final String version;
                if (matcher.matches()) {
                    groupId = matcher.group(1);
                    artifactId = matcher.group(3);
                    version = matcher.group(5);
                } else {
                    groupId = "";
                    artifactId = "";
                    version = "";
                }
                _groupIdText.setText(groupId == null ? "" : groupId);
                _artifactIdText.setText(artifactId == null ? "" : artifactId);
                _versionText.setText(version == null ? "" : version);
            }
        } finally {
            _updating = false;
        }
    }

    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);

        _page = tabbedPropertySheetPage;

        final TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        _panel = factory.createComposite(parent);
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

                int maxWidth = 0, maxHeight = 0;
                TabItem[] selected = folder.getSelection();
                if (selected != null && selected.length > 0) {
                    Point pt = selected[0].getControl().computeSize(SWT.DEFAULT, SWT.DEFAULT, flushCache);
                    maxWidth = Math.max(0, pt.x);
                    maxHeight = Math.max(0, pt.y);
                }

                if (wHint != SWT.DEFAULT) {
                    maxWidth = wHint;
                }
                if (hHint != SWT.DEFAULT) {
                    maxHeight = hHint;
                }

                return new Point(maxWidth, maxHeight);
            }
        });
        folder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        TabItem resources = new TabItem(folder, SWT.NONE);
        TabItem actions = new TabItem(folder, SWT.NONE);
        TabItem advanced = new TabItem(folder, SWT.NONE);

        resources.setText("Resources");
        actions.setText("Actions");
        advanced.setText("Advanced");

        createResourcesControls(folder, resources);
        createActionsControls(folder, actions);
        createAdvancedControls(folder, advanced);

        folder.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                _page.resizeScrolledComposite();
            }
        });

        folder.setSelection(0);
    }

    private void createResourcesControls(TabFolder folder, TabItem item) {
        final TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
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
        final TabbedPropertySheetWidgetFactory factory = getWidgetFactory();

        _containerDetailsControls = factory.createComposite(parent);
        _containerDetailsControls.setLayout(new GridLayout(3, false));

        factory.createLabel(_containerDetailsControls, "Session Name:");
        _sessionNameText = factory.createText(_containerDetailsControls, "");
        _sessionNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        _sessionNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                final String newValue = _sessionNameText.getText().length() == 0 ? null : _sessionNameText.getText();
                if (!_updating
                        && ((newValue == null && _container.getSessionName() != null) || (newValue != null && !newValue
                                .equals(_container.getSessionName())))) {
                    wrapOperation(new Runnable() {
                        public void run() {
                            _container.setSessionName(newValue);
                        }
                    });
                }
            }
        });

        Group releaseGroup = factory.createGroup(_containerDetailsControls, "Release ID");
        factory.paintBordersFor(releaseGroup);
        releaseGroup.setLayout(new GridLayout(2, false));
        releaseGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 4));

        ModifyListener releaseIdListener = new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                if (_updating) {
                    return;
                }
                final String artifactId = _artifactIdText.getText();
                final String groupId = _groupIdText.getText();
                final String version = _versionText.getText();
                final String newValue;
                if (artifactId.length() == 0 && groupId.length() == 0 && version.length() == 0) {
                    newValue = null;
                } else {
                    final StringBuffer buf = new StringBuffer();
                    if (groupId.length() > 0) {
                        buf.append(groupId);
                    }
                    buf.append(":");
                    if (artifactId.length() > 0) {
                        buf.append(artifactId);
                    }
                    if (version.length() > 0) {
                        buf.append(":").append(version);
                    }
                    newValue = buf.toString();
                }
                if ((newValue == null && _container.getReleaseId() != null)
                        || (newValue != null && !newValue.equals(_container.getReleaseId()))) {
                    wrapOperation(new Runnable() {
                        public void run() {
                            _container.setReleaseId(newValue);
                        }
                    });
                }
            }
        };

        factory.createLabel(releaseGroup, "Group ID:");
        _groupIdText = factory.createText(releaseGroup, "");
        _groupIdText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        _groupIdText.addModifyListener(releaseIdListener);

        factory.createLabel(releaseGroup, "Artifact ID:");
        _artifactIdText = factory.createText(releaseGroup, "");
        _artifactIdText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        _artifactIdText.addModifyListener(releaseIdListener);

        factory.createLabel(releaseGroup, "Version:");
        _versionText = factory.createText(releaseGroup, "");
        _versionText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        _versionText.addModifyListener(releaseIdListener);

        factory.createLabel(_containerDetailsControls, "Base Name:");
        _baseNameText = factory.createText(_containerDetailsControls, "");
        _baseNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        _baseNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                final String newValue = _baseNameText.getText().length() == 0 ? null : _baseNameText.getText();
                if (!_updating
                        && ((newValue == null && _container.getBaseName() != null) || (newValue != null && !newValue
                                .equals(_container.getBaseName())))) {
                    wrapOperation(new Runnable() {
                        public void run() {
                            _container.setBaseName(newValue);
                        }
                    });
                }
            }
        });

        _scanCheckbox = factory.createButton(_containerDetailsControls, "Scan for updates", SWT.CHECK);
        _scanCheckbox.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        _scanCheckbox.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                final boolean scan = _scanCheckbox.getSelection();
                _scanIntervalText.setEnabled(scan);
                if (!_updating && scan != _container.isScan()) {
                    wrapOperation(new Runnable() {
                        @Override
                        public void run() {
                            _container.setScan(scan);
                        }
                    });
                }
            }
        });

        Label label = factory.createLabel(_containerDetailsControls, "Scan Interval:");
        GridData gd = new GridData();
        gd.horizontalIndent = 20;
        label.setLayoutData(gd);
        _scanIntervalText = factory.createText(_containerDetailsControls, "");
        _scanIntervalText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        _scanIntervalText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                try {
                    final long newValue = _scanIntervalText.getText().length() == 0 ? 0 : Long
                            .valueOf(_scanIntervalText.getText());
                    if (!_updating && newValue != _container.getScanInterval()) {
                        wrapOperation(new Runnable() {
                            public void run() {
                                _container.setScanInterval(newValue);
                            }
                        });
                    }
                } catch (Exception e) {
                    e.fillInStackTrace();
                }
            }
        });
    }

    private void createActionsControls(TabFolder folder, TabItem item) {
        final TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        final Composite control = factory.createComposite(folder);
        control.setLayout(new GridLayout(2, false));
        control.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        Composite actionsComposite = factory.createComposite(control);
        actionsComposite.setLayout(new GridLayout());
        actionsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        Section actionsSection = factory.createSection(actionsComposite, Section.TITLE_BAR | Section.EXPANDED);
        actionsSection.setText("Actions");
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
                _inputsTable.setTargetObject((ActionType1) selected);
                _outputsTable.setTargetObject((ActionType1) selected);
                _globalsTable.setTargetObject((ActionType1) selected);
            }
        });

        Composite mappingsComposite = factory.createComposite(control);
        mappingsComposite.setLayout(new GridLayout());
        mappingsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        Section inputsSection = factory.createSection(mappingsComposite, Section.TWISTIE | Section.TITLE_BAR
                | Section.EXPANDED);
        inputsSection.setText("Inputs");
        inputsSection.setLayout(new GridLayout());
        inputsSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        inputsSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                _page.resizeScrolledComposite();
            }
        });

        _inputsTable = new RulesMappingsTable(inputsSection, SWT.NONE, RulesPackage.eINSTANCE.getActionType1_Inputs(),
                RulesPackage.eINSTANCE.getMappingsType_Mapping());
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
                _page.resizeScrolledComposite();
            }
        });

        _outputsTable = new RulesMappingsTable(outputsSection, SWT.NONE,
                RulesPackage.eINSTANCE.getActionType1_Outputs(), RulesPackage.eINSTANCE.getMappingsType_Mapping());
        _outputsTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        factory.adapt(_outputsTable);
        outputsSection.setClient(_outputsTable);

        Section globalsSection = factory.createSection(mappingsComposite, Section.TWISTIE | Section.TITLE_BAR);
        globalsSection.setText("Globals");
        globalsSection.setLayout(new GridLayout());
        globalsSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        globalsSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                _page.resizeScrolledComposite();
            }
        });

        _globalsTable = new RulesMappingsTable(globalsSection, SWT.NONE,
                RulesPackage.eINSTANCE.getActionType1_Globals(), RulesPackage.eINSTANCE.getMappingsType_Mapping());
        _globalsTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        factory.adapt(_globalsTable);
        globalsSection.setClient(_globalsTable);

        item.setControl(control);
    }

    private void createAdvancedControls(TabFolder folder, TabItem item) {
        final TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        final Composite control = factory.createComposite(folder);
        control.setLayout(new GridLayout());
        control.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        Section propertiesSection = factory.createSection(control, Section.TWISTIE | Section.TITLE_BAR
                | Section.EXPANDED);
        propertiesSection.setText("Properties");
        propertiesSection.setLayout(new GridLayout());
        propertiesSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        propertiesSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                _page.resizeScrolledComposite();
            }
        });

        _propertiesTable = new RulesPropertyTable(propertiesSection, SWT.NONE);
        _propertiesTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        factory.adapt(_propertiesTable);
        propertiesSection.setClient(_propertiesTable);

        Section loggersSection = factory.createSection(control, Section.TWISTIE | Section.TITLE_BAR);
        loggersSection.setText("Audit Loggers");
        loggersSection.setLayout(new GridLayout());
        loggersSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        loggersSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                _page.resizeScrolledComposite();
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
                _page.resizeScrolledComposite();
            }
        });

        _listenersTable = new RulesEventListenerTable(listenersSection, SWT.NONE);
        _listenersTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        factory.adapt(_listenersTable);
        listenersSection.setClient(_listenersTable);

        Section channelsSection = factory.createSection(control, Section.TWISTIE | Section.TITLE_BAR);
        channelsSection.setText("Channels");
        channelsSection.setLayout(new GridLayout());
        channelsSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        channelsSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                _page.resizeScrolledComposite();
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

        item.setControl(control);
    }

    private void wrapOperation(final Runnable runner) {
        TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(_implementation);
        if (domain != null) {
            domain.getCommandStack().execute(new RecordingCommand(domain) {
                @Override
                protected void doExecute() {
                    try {
                        runner.run();
                    } catch (Exception e) {
                        Activator.logError(e);
                    }
                }
            });
        } else {
            try {
                runner.run();
            } catch (Exception e) {
                Activator.logError(e);
            }
        }
    }
}
