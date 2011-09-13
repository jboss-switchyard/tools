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
package org.switchyard.tools.ui.wizards;

import static org.switchyard.tools.ui.M2EUtils.SWITCHYARD_API_ARTIFACT_ID;
import static org.switchyard.tools.ui.M2EUtils.SWITCHYARD_CORE_GROUP_ID;
import static org.switchyard.tools.ui.M2EUtils.resolveVersionRange;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.JavaConventions;
import org.eclipse.jdt.internal.ui.dialogs.StatusUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.m2e.core.internal.index.IndexedArtifactFile;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.sonatype.aether.util.artifact.DefaultArtifact;
import org.sonatype.aether.version.Version;
import org.switchyard.tools.ui.Activator;

/**
 * ProjectConfigurationWizardPage
 * 
 * Collects information about SwitchYard project configuration, e.g. components,
 * handlers, etc.
 * 
 * @author Rob Cernich
 */
@SuppressWarnings("restriction")
public class ProjectConfigurationWizardPage extends WizardPage {

    /** TODO: use preferences */
    private static final String DEFAULT_GROUP_ID = "com.example.switchyard";

    private Text _groupIdText;
    private Text _packageNameText;
    private ListViewer _runtimeVersionsList;
    private boolean _isInitialized;
    private String _groupId = "";
    private String _packageName = "";

    /**
     * Create a new ProjectConfigurationWizardPage.
     */
    public ProjectConfigurationWizardPage() {
        super(ProjectConfigurationWizardPage.class.getSimpleName());
        setTitle("SwitchYard Project Configuration");
        setDescription("Please specify project details.");
    }

    /**
     * @return the group id.
     */
    public String getGroupId() {
        return _groupId;
    }

    /**
     * @return the package name.
     */
    public String getPackageName() {
        return _packageName;
    }

    /**
     * @return the selected SwitchYard runtime version.
     */
    public Version getRuntimeVersion() {
        ISelection runtimeVersionListSelection = _runtimeVersionsList.getSelection();
        if (runtimeVersionListSelection.isEmpty()) {
            return null;
        }
        return (Version) ((IStructuredSelection) runtimeVersionListSelection).getFirstElement();
    }

    @Override
    public void createControl(Composite parent) {
        Composite content = new Composite(parent, SWT.NONE);
        content.setLayout(new GridLayout(2, false));

        // group id
        Label label = new Label(content, SWT.RIGHT);
        label.setText("Group Id:");
        _groupIdText = new Text(content, SWT.SINGLE | SWT.BORDER);
        _groupIdText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _groupIdText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                String oldGroupId = _groupId;
                _groupId = _groupIdText.getText();
                updatePackageName(oldGroupId, _groupId);
                validate();
            }
        });

        // package name
        label = new Label(content, SWT.RIGHT);
        label.setText("Package Name:");
        _packageNameText = new Text(content, SWT.SINGLE | SWT.BORDER);
        _packageNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _packageNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                _packageName = _packageNameText.getText();
                validate();
            }
        });

        // runtime version
        label = new Label(content, SWT.NONE);
        label.setText("Select target runtime:");
        GridData gd = new GridData();
        gd.horizontalSpan = 2;
        label.setLayoutData(gd);

        _runtimeVersionsList = new ListViewer(content, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
        gd = new GridData(GridData.FILL_BOTH);
        gd.horizontalSpan = 2;
        _runtimeVersionsList.getList().setLayoutData(gd);
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

        setControl(content);
        setPageComplete(false);
    }

    @Override
    public void setVisible(boolean visible) {
        if (visible && !_isInitialized) {
            try {
                populateRuntimeVersionsList();
                String projectName = ((NewSwitchYardProjectWizard) getWizard()).getProjectName();
                _packageNameText.setText(normalizePackageName(projectName));
                _groupIdText.setText(DEFAULT_GROUP_ID);
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
    }

    private void validate() {
        IStatus packageNameStatus = JavaConventions.validatePackageName(_packageName, "1.6", "1.6");
        if (packageNameStatus.isOK()) {
            setMessage(null);
            setErrorMessage(null);
        } else {
            StatusUtil.applyToStatusLine(this, packageNameStatus);
        }
        setPageComplete(getErrorMessage() == null);
    }

    private void updatePackageName(String oldGroupId, String newGroupId) {
        // strip off trailing .'s
        while (oldGroupId.endsWith(".")) {
            oldGroupId = oldGroupId.substring(0, oldGroupId.length() - 1);
        }
        while (newGroupId.endsWith(".")) {
            newGroupId = newGroupId.substring(0, newGroupId.length() - 1);
        }

        // normalize the id's (e.g. replace invalid Java package name chars with
        // _)
        oldGroupId = normalizePackageName(oldGroupId);
        newGroupId = normalizePackageName(newGroupId);

        // make sure it changed
        if (oldGroupId.equals(newGroupId)) {
            return;
        }

        // make sure the package name actually starts with the old group id
        // before we update it
        if (!_packageName.startsWith(oldGroupId)) {
            return;
        }
        if (oldGroupId.length() == 0) {
            // new group id
            if (_packageName.length() == 0) {
                _packageNameText.setText(newGroupId);
            } else {
                _packageNameText.setText(newGroupId + '.' + _packageName);
            }
        } else if (_packageName.equals(oldGroupId)) {
            // package name is tracking group id exactly
            _packageNameText.setText(newGroupId);
        } else if (_packageName.charAt(oldGroupId.length()) == '.') {
            // package name is prefixed with group id
            _packageNameText.setText(newGroupId + _packageName.substring(oldGroupId.length()));
        } else {
            // need to insert a . between the two
            _packageNameText.setText(newGroupId + '.' + _packageName.substring(oldGroupId.length()));
        }
    }

    /**
     * Remove any non-word characters from the proposed name (e.g. -, *, etc.).
     */
    private String normalizePackageName(String proposedPackageName) {
        return proposedPackageName.replaceAll("[^\\w\\.]", "_");
    }
}
