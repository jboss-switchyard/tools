/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.editor.components.rules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
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
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.rules.ContainerType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesFactory;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.util.PropTypeUtil;

/**
 * KIEContainerDetailsComposite
 * 
 * Controls for editing a KIE container object (ContainerType).
 */
public class KIEContainerDetailsComposite extends Composite {

    private static final Pattern GAV_PATTERN = Pattern.compile("([^: ]*)(:([^: ]*)(:([^: ]*))?)?"); //$NON-NLS-1$

    private ContainerType _container = RulesFactory.eINSTANCE.createContainerType();
    private boolean _updating;
    private Text _sessionNameText;
    private Text _baseNameText;
    private Text _groupIdText;
    private Text _artifactIdText;
    private Text _versionText;
    private Button _scanCheckbox;
    private Text _scanIntervalText;

    /**
     * Create a new KIEContainerDetailsComposite.
     * 
     * @param parent the parent composite.
     * @param factory the widget factory.
     */
    public KIEContainerDetailsComposite(Composite parent, FormToolkit factory) {
        super(parent, SWT.NONE);
        setLayout(new GridLayout(3, false));

        factory.createLabel(this, Messages.label_sessionName);
        _sessionNameText = factory.createText(this, "", SWT.BORDER); //$NON-NLS-1$
        _sessionNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        _sessionNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                final String newValue = _sessionNameText.getText().length() == 0 ? null : _sessionNameText.getText();
                if (!_updating
                        && ((newValue == null && getContainer().getSessionName() != null) || (newValue != null && !newValue
                                .equals(getContainer().getSessionName())))) {
                    wrapOperation(new Runnable() {
                        public void run() {
                            getContainer().setSessionName(newValue);
                        }
                    });
                }
            }
        });

        Group releaseGroup = new Group(this, SWT.NONE); 
        releaseGroup.setText(Messages.label_releaseId);
        releaseGroup.setLayout(new GridLayout(2, false));
        releaseGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 4));
        releaseGroup.setToolTipText(Messages.tooltip_releaseId);

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
                    buf.append(":"); //$NON-NLS-1$
                    if (artifactId.length() > 0) {
                        buf.append(artifactId);
                    }
                    if (version.length() > 0) {
                        buf.append(":").append(version); //$NON-NLS-1$
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

        factory.createLabel(releaseGroup, Messages.label_groupId);
        _groupIdText = factory.createText(releaseGroup, "", SWT.BORDER); //$NON-NLS-1$
        _groupIdText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        _groupIdText.addModifyListener(releaseIdListener);

        factory.createLabel(releaseGroup, Messages.label_artifactId);
        _artifactIdText = factory.createText(releaseGroup, "", SWT.BORDER); //$NON-NLS-1$
        _artifactIdText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        _artifactIdText.addModifyListener(releaseIdListener);

        factory.createLabel(releaseGroup, Messages.label_version);
        _versionText = factory.createText(releaseGroup, "", SWT.BORDER); //$NON-NLS-1$
        _versionText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        _versionText.addModifyListener(releaseIdListener);

        factory.createLabel(this, Messages.label_baseName);
        _baseNameText = factory.createText(this, "", SWT.BORDER); //$NON-NLS-1$
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

        _scanCheckbox = factory.createButton(this, Messages.label_scanForUpdates, SWT.CHECK);
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

        Label label = factory.createLabel(this, Messages.label_scanInterval);
        GridData gd = new GridData();
        gd.horizontalIndent = 20;
        label.setLayoutData(gd);
        _scanIntervalText = factory.createText(this, "", SWT.BORDER); //$NON-NLS-1$
        _scanIntervalText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        _scanIntervalText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                try {
                    final long newValue = _scanIntervalText.getText().length() == 0 ? 0 : Long
                            .valueOf(_scanIntervalText.getText());
                    long oldValue = -1;
                    try {
                        oldValue = Long.parseLong(PropTypeUtil.getPropValueString(_container.getScanInterval()));
                    } catch (NumberFormatException nfe) {
                        nfe.printStackTrace();
                    }
                    if (!_updating && newValue != oldValue) {
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

    /**
     * @param container the container to be edited.
     */
    public void setContainer(ContainerType container) {
        if (container == null) {
            container = RulesFactory.eINSTANCE.createContainerType();
        }
        _container = container;

        _sessionNameText.setText(_container.getSessionName() == null ? "" : _container.getSessionName()); //$NON-NLS-1$
        _baseNameText.setText(_container.getBaseName() == null ? "" : _container.getBaseName()); //$NON-NLS-1$
        _scanCheckbox.setSelection(_container.isScan());
        _scanIntervalText.setEnabled(_container.isScan());
        _scanIntervalText.setText(PropTypeUtil.getPropValueString(_container.getScanInterval()));
        if (_container.getReleaseId() == null) {
            _groupIdText.setText(""); //$NON-NLS-1$
            _artifactIdText.setText(""); //$NON-NLS-1$
            _versionText.setText(""); //$NON-NLS-1$
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
                groupId = ""; //$NON-NLS-1$
                artifactId = ""; //$NON-NLS-1$
                version = ""; //$NON-NLS-1$
            }
            _groupIdText.setText(groupId == null ? "" : groupId); //$NON-NLS-1$
            _artifactIdText.setText(artifactId == null ? "" : artifactId); //$NON-NLS-1$
            _versionText.setText(version == null ? "" : version); //$NON-NLS-1$
        }
    }

    /**
     * @return the container being edited.
     */
    public ContainerType getContainer() {
        return _container;
    }

    private void wrapOperation(final Runnable runner) {
        TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(_container);
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
