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
package org.switchyard.tools.ui.facets;

import static org.switchyard.tools.ui.M2EUtils.SWITCHYARD_API_ARTIFACT_ID;
import static org.switchyard.tools.ui.M2EUtils.SWITCHYARD_CORE_GROUP_ID;
import static org.switchyard.tools.ui.M2EUtils.resolveVersionRange;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.m2e.core.internal.index.IndexedArtifactFile;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.project.facet.ui.AbstractFacetWizardPage;
import org.eclipse.wst.common.project.facet.ui.IFacetWizardPage;
import org.sonatype.aether.util.artifact.DefaultArtifact;
import org.sonatype.aether.version.Version;
import org.switchyard.tools.ui.Activator;

/**
 * SwitchYardFacetInstallWizardPage
 * 
 * Wizard page for configuring SwitchYard facet.
 * 
 * @author Rob Cernich
 */
@SuppressWarnings("restriction")
public class SwitchYardFacetInstallWizardPage extends AbstractFacetWizardPage implements IFacetWizardPage,
        ISwitchYardFacetConstants {

    private boolean _isInitialized;
    private ListViewer _runtimeVersionsList;
    private Button _runtimeProvidedCheckbox;
    private IDataModel _config;

    /**
     * Create a new SwitchYardFacetInstallWizardPage.
     */
    public SwitchYardFacetInstallWizardPage() {
        super("SwitchYard");
        setTitle("SwitchYard");
        setDescription("Configure SwitchYard capabilities on project");
    }

    @Override
    public void createControl(Composite parent) {
        Composite content = new Composite(parent, SWT.NONE);
        content.setLayout(new GridLayout());

        _runtimeProvidedCheckbox = new Button(content, SWT.CHECK);
        _runtimeProvidedCheckbox.setText("SwitchYard dependencies provided by runtime");
        _runtimeProvidedCheckbox.setLayoutData(new GridData());
        _runtimeProvidedCheckbox.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                _config.setBooleanProperty(RUNTIME_PROVIDED, _runtimeProvidedCheckbox.getSelection());
                validate();
            }

        });
        // not currently supported
        _runtimeProvidedCheckbox.setVisible(false);

        Label label = new Label(content, SWT.NONE);
        label.setText("SwitchYard Runtime Version:");

        _runtimeVersionsList = new ListViewer(content, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
        _runtimeVersionsList.getList().setLayoutData(new GridData(GridData.FILL_BOTH));
        _runtimeVersionsList.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                if (element instanceof IndexedArtifactFile) {
                    return ((IndexedArtifactFile) element).getArtifactKey().getVersion();
                }
                return super.getText(element);
            }
        });
        _runtimeVersionsList.setContentProvider(new ArrayContentProvider());
        _runtimeVersionsList.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                if (event.getSelection().isEmpty()) {
                    _config.setProperty(RUNTIME_VERSION, null);
                } else {
                    _config.setProperty(RUNTIME_VERSION,
                            (Version) ((IStructuredSelection) event.getSelection()).getFirstElement());
                }
                validate();
            }
        });

        initControls();

        setControl(content);
    }

    @Override
    public void setConfig(Object config) {
        _config = (IDataModel) config;
        initControls();
    }
    
    @Override
    public void setVisible(boolean visible) {
        if (visible && !_isInitialized) {
            try {
                populateRuntimeVersionsList();
                // clear out any error the first time we are displayed
                setErrorMessage(null);
                _isInitialized = true;
            } catch (CoreException e) {
                MessageDialog
                        .openError(getShell(), "Error Populating SwitchYard Runtime Versions",
                                "An error occurred while trying to resolve SwitchYard runtime versions available from Maven repositories.");
                Activator.getDefault().getLog().log(e.getStatus());
            }
        }
        super.setVisible(visible);
    }

    private void initControls() {
        if (_runtimeProvidedCheckbox == null) {
            return;
        }
        if (_config.isPropertySet(RUNTIME_PROVIDED)) {
            _runtimeProvidedCheckbox.setSelection(_config.getBooleanProperty(RUNTIME_PROVIDED));
        } else {
            _runtimeProvidedCheckbox.setSelection((Boolean) _config.getDefaultProperty(RUNTIME_PROVIDED));
        }
        if (_config.isPropertySet(RUNTIME_VERSION)) {
            _runtimeVersionsList.setSelection(new StructuredSelection(_config.getProperty(RUNTIME_VERSION)), true);
        }
    }

    private void populateRuntimeVersionsList() throws CoreException {
        List<Version> versions = resolveVersionRange(
                new DefaultArtifact(SWITCHYARD_CORE_GROUP_ID, SWITCHYARD_API_ARTIFACT_ID, "jar", "[,]")).getVersions();
        Collections.sort(versions, new Comparator<Version>() {
            @Override
            public int compare(Version o1, Version o2) {
                // list the highest version first
                return -o1.compareTo(o2);
            }
        });
        _runtimeVersionsList.setInput(versions);
        if (versions.size() > 0) {
            // TODO: allow use of preferred version or allow association of
            // server runtime version.
            _runtimeVersionsList.setSelection(new StructuredSelection(versions.get(0)), true);
        }
        validate();
    }
    
    private void validate() {
        IStatus status = _config.validate();
        switch (status.getSeverity()) {
        case IStatus.OK:
            setErrorMessage(null);
            break;
        case IStatus.INFO:
            setMessage(status.getMessage(), INFORMATION);
            break;
        case IStatus.WARNING:
            setMessage(status.getMessage(), WARNING);
            break;
        case IStatus.ERROR:
        default:
            setErrorMessage(status.getMessage());
            break;
        }
        setPageComplete(getErrorMessage() == null);
    }

}
