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
package org.switchyard.tools.ui.bpel;

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.soa.sca.sca1_1.model.sca.BPELImplementation;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.PlatformResourceAdapterFactory;
import org.switchyard.tools.ui.common.ClasspathResourceSelectionDialog;

/**
 * BPELImplementationPropertySection
 * 
 * Property sheet composite for BPM component implementations.
 */
public class BPELImplementationPropertySection extends GFPropertySection implements ITabbedPropertyConstants {

    private Composite _panel;
    private Link _newBPELLink;
    private Text _bpelFileText;
    private Button _browseBPELButton;
    private BPELImplementation _implementation;
    private IProject _project;
    private boolean _updating;

    /**
     * Create a new BPELImplementationPropertySection.
     */
    public BPELImplementationPropertySection() {
    }

    @Override
    public void refresh() {
        _implementation = null;
        final PictogramElement pe = getSelectedPictogramElement();
        if (pe != null) {
            final Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
            _implementation = (BPELImplementation) ((Component) bo).getImplementation();
            _project = PlatformResourceAdapterFactory.getContainingProject(_implementation);
        }
        _updating = true;
        try {
            if (_implementation == null || _implementation.getProcess() == null) {
                _bpelFileText.setText(""); //$NON-NLS-1$
            } else {
                _bpelFileText.setText(_implementation.getProcess().toString());

            }
        } finally {
            _updating = false;
        }
    }

    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);

        final TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        _panel = factory.createComposite(parent);
        _panel.setLayout(new GridLayout(3, false));

        _newBPELLink = new Link(_panel, SWT.NONE);
        _newBPELLink.setText("<a>" + Messages.BPELImplementationPropertySection_textLabel + "</a>"); //$NON-NLS-1$ //$NON-NLS-2$
        _newBPELLink.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                openFile();
            }

        });

        _bpelFileText = factory.createText(_panel, "", SWT.READ_ONLY); //$NON-NLS-1$
        _bpelFileText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _bpelFileText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                final QName newValue = _bpelFileText.getText().length() == 0 ? null : QName.valueOf(_bpelFileText
                        .getText());
                if (!_updating
                        && ((newValue == null && _implementation.getProcess() != null) || (newValue != null && !newValue
                                .equals(_implementation.getProcess())))) {
                    wrapOperation(new Runnable() {
                        public void run() {
                            _implementation.setProcess(newValue);
                        }
                    });
                }
            }

        });

        _browseBPELButton = factory.createButton(_panel, Messages.BPELImplementationPropertySection_browseButtonLabel, SWT.PUSH);
        _browseBPELButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                handleBrowse();
            }

        });
    }

    private void openFile() {
        final IFile resource = BPELResourceAdapterFactory.getFileForObject(_implementation, _project);
        if (resource != null) {
            try {
                IDE.openEditor(getPart().getSite().getPage(), resource);
            } catch (PartInitException e) {
                Activator.getDefault().getLog().log(e.getStatus());
            }
        }
    }

    private void handleBrowse() {
        IContainer container;
        if (_project == null) {
            container = ResourcesPlugin.getWorkspace().getRoot();
        } else {
            container = _project.getProject();
        }
        ClasspathResourceSelectionDialog dialog = new ClasspathResourceSelectionDialog(_panel.getShell(), container,
                "bpel"); //$NON-NLS-1$
        if (dialog.open() == SelectionDialog.OK) {
            Object[] result = dialog.getResult();
            if (result.length > 0 && result[0] instanceof IFile) {
                IFile bpelFile = (IFile) result[0];
                String bpelFilePath = JavaUtil.getJavaPathForResource(bpelFile).toString();
                _implementation = ScaFactory.eINSTANCE.createBPELImplementation();

                // load process
                final QName processName = Activator.getDefault().getProcessForFile(bpelFile);
                // get process qname
                _implementation.setProcess(processName);

                // update the text box, which should trigger a validate
                _bpelFileText.setText(bpelFilePath);
            }
        }
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
