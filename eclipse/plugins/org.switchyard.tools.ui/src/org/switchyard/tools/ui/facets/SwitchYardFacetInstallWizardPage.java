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

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.project.facet.ui.AbstractFacetWizardPage;
import org.eclipse.wst.common.project.facet.ui.IFacetWizardPage;
import org.sonatype.aether.version.Version;
import org.switchyard.tools.ui.common.ILayoutUtilities;
import org.switchyard.tools.ui.common.ISwitchYardComponentExtension;
import org.switchyard.tools.ui.common.SwitchYardComponentExtensionManager;
import org.switchyard.tools.ui.common.SwitchYardSettingsGroup;

/**
 * SwitchYardFacetInstallWizardPage
 * 
 * Wizard page for configuring SwitchYard facet.
 * 
 * @author Rob Cernich
 */
public class SwitchYardFacetInstallWizardPage extends AbstractFacetWizardPage implements IFacetWizardPage,
        ISwitchYardFacetConstants, ILayoutUtilities {

    private boolean _isInitialized;
    private SwitchYardSettingsGroup _settingsGroup;
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
        initializeDialogUnits(parent);

        Composite content = new Composite(parent, SWT.NONE);
        content.setLayout(new GridLayout());

        _settingsGroup = new SwitchYardSettingsGroup(content, this, getWizard().getContainer());

        _settingsGroup.getRuntimeVersionsList().addSelectionChangedListener(new ISelectionChangedListener() {
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

        setControl(content);
    }

    @Override
    public void transferStateToConfig() {
        super.transferStateToConfig();
        _config.setProperty(RUNTIME_COMPONENTS, _settingsGroup.getSelectedComponents());
    }

    @Override
    public void setConfig(Object config) {
        _config = (IDataModel) config;
    }

    @Override
    public void setVisible(boolean visible) {
        if (visible && !_isInitialized) {
            initControls();
            // clear out any error the first time we are displayed
            setErrorMessage(null);
            _isInitialized = true;
        }
        super.setVisible(visible);
    }

    @SuppressWarnings("unchecked")
    private void initControls() {
        if (_settingsGroup == null) {
            return;
        }
        if (_config.isPropertySet(RUNTIME_PROVIDED)) {
            _settingsGroup.getRuntimeProvidedCheckbox().setSelection(_config.getBooleanProperty(RUNTIME_PROVIDED));
        } else {
            _settingsGroup.getRuntimeProvidedCheckbox().setSelection(
                    (Boolean) _config.getDefaultProperty(RUNTIME_PROVIDED));
        }
        if (_config.isPropertySet(RUNTIME_VERSION)) {
            _settingsGroup.getRuntimeVersionsList().setSelection(
                    new StructuredSelection(_config.getProperty(RUNTIME_VERSION)), true);
        } else {
            Version defaultVersion = (Version) _config.getDefaultProperty(RUNTIME_VERSION);
            if (defaultVersion != null) {
                _settingsGroup.getRuntimeVersionsList().setSelection(new StructuredSelection(defaultVersion), true);
            }
        }
        if (_config.isPropertySet(RUNTIME_COMPONENTS)) {
            _settingsGroup.getComponentsTable().setCheckedElements(
                    ((List<ISwitchYardComponentExtension>) _config.getProperty(RUNTIME_COMPONENTS)).toArray());
        } else {
            _settingsGroup.getComponentsTable().setCheckedElements(
                    ((List<ISwitchYardComponentExtension>) _config.getDefaultProperty(RUNTIME_COMPONENTS)).toArray());
        }
        _settingsGroup.getComponentsTable().setCheckedElements(
                new Object[] {SwitchYardComponentExtensionManager.instance().getRuntimeComponentExtension() });
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

    @Override
    public GridData setButtonLayoutData(Button button) {
        return super.setButtonLayoutData(button);
    }

}
