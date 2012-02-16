/* 
 * JBoss, Home of Professional Open Source 
 * Copyright 2012 Red Hat Inc. and/or its affiliates and other contributors
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
package org.switchyard.tools.ui.properties;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbenchPropertyPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.PropertyPage;
import org.sonatype.aether.util.version.GenericVersionScheme;
import org.sonatype.aether.version.InvalidVersionSpecificationException;
import org.sonatype.aether.version.Version;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.common.ILayoutUtilities;
import org.switchyard.tools.ui.common.ISwitchYardComponentExtension;
import org.switchyard.tools.ui.common.ISwitchYardProjectWorkingCopy;
import org.switchyard.tools.ui.common.SwitchYardSettingsGroup;
import org.switchyard.tools.ui.common.impl.SwitchYardProject;
import org.switchyard.tools.ui.operations.UpdateProjectPomOperation;

/**
 * SwitchYardSettingsPropertyPage
 * 
 * <p/>
 * Property page implementation for SwitchYard settings.
 * 
 * @author Rob Cernich
 */
public class SwitchYardSettingsPropertyPage extends PropertyPage implements IWorkbenchPropertyPage, ILayoutUtilities {

    private SwitchYardSettingsGroup _settingsGroup;
    private ISwitchYardProjectWorkingCopy _switchYardProject;

    /**
     * Create a new SwitchYardSettingsPropertyPage.
     */
    public SwitchYardSettingsPropertyPage() {
        super();
        noDefaultAndApplyButton();
    }

    @Override
    protected Control createContents(Composite parent) {
        Composite content = new Composite(parent, SWT.NONE);
        content.setLayout(new GridLayout());

        _settingsGroup = new SwitchYardSettingsGroup(content, this, PlatformUI.getWorkbench().getProgressService());

        initControls();

        return content;
    }

    @Override
    public boolean performOk() {
        BusyIndicator.showWhile(getShell().getDisplay(), new Runnable() {
            public void run() {
                try {
                    new UpdateProjectPomOperation(_switchYardProject).run(new NullProgressMonitor());
                } catch (CoreException e) {
                    Activator.getDefault().getLog().log(e.getStatus());
                }
            }
        });
        return true;
    }

    private void initControls() {
        _switchYardProject = new SwitchYardProject(getProject()).createWorkingCopy();
        if (_switchYardProject.needsLoading()) {
            BusyIndicator.showWhile(getShell().getDisplay(), new Runnable() {
                @Override
                public void run() {
                    _switchYardProject.load(new NullProgressMonitor());
                }
            });
        }
        initRuntimeVersion();
        initComponentsTable();
    }

    private void initRuntimeVersion() {
        Version version = null;
        String versionString = _switchYardProject.getVersion();
        if (versionString != null && versionString.length() > 0) {
            try {
                version = new GenericVersionScheme().parseVersion(versionString);
            } catch (InvalidVersionSpecificationException e) {
                e.fillInStackTrace();
            }
        }
        if (version != null) {
            _settingsGroup.getRuntimeVersionsList().setSelection(new StructuredSelection(version), true);
        }
        _settingsGroup.getRuntimeVersionsList().getControl()
                .setEnabled(!_switchYardProject.isUsingDependencyManagement());
        _settingsGroup.getRuntimeVersionsList().addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                ISelection selection = event.getSelection();
                if (selection == null || selection.isEmpty() || !(selection instanceof IStructuredSelection)) {
                    return;
                }
                _switchYardProject.setRuntimeVersion(((IStructuredSelection) selection).getFirstElement().toString());
            }
        });
    }

    private void initComponentsTable() {
        _settingsGroup.getComponentsTable().setCheckedElements(_switchYardProject.getComponents().toArray());
        _settingsGroup.getComponentsTable().addCheckStateListener(new ICheckStateListener() {
            @Override
            public void checkStateChanged(CheckStateChangedEvent event) {
                if (event.getChecked()) {
                    _switchYardProject.addComponent((ISwitchYardComponentExtension) event.getElement());
                } else {
                    _switchYardProject.removeComponent((ISwitchYardComponentExtension) event.getElement());
                }
            }
        });
    }

    private IProject getProject() {
        return (IProject) getElement().getAdapter(IProject.class);
    }

    @Override
    public GridData setButtonLayoutData(Button button) {
        return super.setButtonLayoutData(button);
    }

}
