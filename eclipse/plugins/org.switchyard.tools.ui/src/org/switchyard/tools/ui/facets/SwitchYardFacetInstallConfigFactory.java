/*************************************************************************************
 * Copyright (c) 2011 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.facets;

import static org.switchyard.tools.ui.M2EUtils.resolveSwitchYardVersionRange;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.wst.common.componentcore.datamodel.FacetInstallDataModelProvider;
import org.eclipse.wst.common.project.facet.core.IFacetedProjectWorkingCopy;
import org.eclipse.wst.common.project.facet.core.runtime.IRuntime;
import org.eclipse.wst.common.project.facet.core.runtime.IRuntimeComponent;
import org.sonatype.aether.util.version.GenericVersionScheme;
import org.sonatype.aether.version.InvalidVersionSpecificationException;
import org.sonatype.aether.version.Version;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.common.ISwitchYardProject;
import org.switchyard.tools.ui.common.impl.SwitchYardProjectManager;
import org.switchyard.tools.ui.i18n.Messages;
import org.switchyard.tools.ui.wizards.NewSwitchYardProjectWizard;

/**
 * SwitchYardFacetInstallConfigFactory
 * 
 * Creates configuration object used when installing the SwitchYard facet.
 * 
 * @author Rob Cernich
 */
public class SwitchYardFacetInstallConfigFactory extends FacetInstallDataModelProvider implements
        ISwitchYardFacetConstants {

    private List<Version> _versions;
    private Set<IRuntime> _originalRuntimes;
    private Version _defaultVersion;
    private ISwitchYardProject _switchYardProject;

    /**
     * Create a new SwitchYardFacetInstallConfigFactory.
     */
    public SwitchYardFacetInstallConfigFactory() {
        super();
        try {
            // TODO: we should look this up from preferences
            _defaultVersion = new GenericVersionScheme()
                    .parseVersion(NewSwitchYardProjectWizard.DEFAULT_RUNTIME_VERSION);
        } catch (InvalidVersionSpecificationException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings({"rawtypes", "unchecked" })
    @Override
    public Set getPropertyNames() {
        Set names = super.getPropertyNames();
        names.add(RUNTIME_PROVIDED);
        names.add(RUNTIME_VERSION);
        names.add(RUNTIME_COMPONENTS);
        names.add(RUNTIME_TARGET);
        names.add(SWITCHYARD_PROJECT);
        return names;
    }

    private void projectWorkingCopyUpdated(IFacetedProjectWorkingCopy ifpwc) {
        try {
            loadDefaults(ifpwc);
        } catch (Exception e) {
            e.fillInStackTrace();
        }

        // the default version
        if (_defaultVersion == null) {
            for (ListIterator<Version> lit = _versions.listIterator(_versions.size()); lit.hasPrevious();) {
                Version version = lit.previous();
                _defaultVersion = version;
                if (!version.toString().endsWith("-SNAPSHOT")) { //$NON-NLS-1$
                    _defaultVersion = version;
                    break;
                }
            }
        }
        if (_switchYardProject != null) {
            String versionString = _switchYardProject.getVersion();
            if (versionString != null && versionString.length() > 0) {
                try {
                    getDataModel().setProperty(RUNTIME_VERSION, new GenericVersionScheme().parseVersion(versionString));
                } catch (InvalidVersionSpecificationException e) {
                    e.fillInStackTrace();
                }
                getDataModel().setProperty(RUNTIME_COMPONENTS, _switchYardProject.getComponents());
            }
        }
        getDataModel().setProperty(SWITCHYARD_PROJECT, _switchYardProject);
        if (ifpwc.getPrimaryRuntime() != null) {
            for (IRuntimeComponent component : ifpwc.getPrimaryRuntime().getRuntimeComponents()) {
                if (SWITCHYARD_RUNTIME_ID.equals(component.getRuntimeComponentType().getId())
                        || FSW_RUNTIME_ID.equals(component.getRuntimeComponentType().getId())) {
                    getDataModel().setProperty(RUNTIME_TARGET, component);
                    break;
                }
            }
        }
    }

    @Override
    public Object getDefaultProperty(String propertyName) {
        if (FACET_ID.equals(propertyName)) {
            return SWITCHYARD_FACET_ID;
        } else if (RUNTIME_PROVIDED.equals(propertyName)) {
            return true;
        } else if (RUNTIME_VERSION.equals(propertyName)) {
            return _defaultVersion;
        } else if (RUNTIME_COMPONENTS.equals(propertyName)) {
            return Collections.emptySet();
        } else if (RUNTIME_TARGET.equals(propertyName)) {
            // TODO: maybe use preferences?
            return null;
        } else if (SWITCHYARD_PROJECT.equals(propertyName)) {
            return null;
        }
        return super.getDefaultProperty(propertyName);
    }

    @Override
    public boolean propertySet(String propertyName, Object propertyValue) {
        if (RUNTIME_PROVIDED.equals(propertyName)) {
            return true;
        } else if (RUNTIME_VERSION.equals(propertyName)) {
            return true;
        } else if (RUNTIME_COMPONENTS.equals(propertyName)) {
            return true;
        } else if (SWITCHYARD_PROJECT.equals(propertyName)) {
            return false;
        } else if (RUNTIME_TARGET.equals(propertyName)) {
            // update the primary runtime
            final IFacetedProjectWorkingCopy ifpwc = (IFacetedProjectWorkingCopy)getProperty(FACETED_PROJECT_WORKING_COPY);
            if (ifpwc != null) {
                final IRuntime primaryRuntime = ifpwc.getPrimaryRuntime();
                if (primaryRuntime != null && !_originalRuntimes.contains(primaryRuntime)) {
                    ifpwc.removeTargetedRuntime(primaryRuntime);
                }
                if (propertyValue != null) {
                    ifpwc.addTargetedRuntime(((IRuntimeComponent)propertyValue).getRuntime());
                    ifpwc.setPrimaryRuntime(((IRuntimeComponent)propertyValue).getRuntime());
                }
            }
            return true;
        } else if (FACETED_PROJECT_WORKING_COPY.equals(propertyName)) {
            // initialize defaults, et al.
            projectWorkingCopyUpdated((IFacetedProjectWorkingCopy) propertyValue);
        }
        return super.propertySet(propertyName, propertyValue);
    }

    @Override
    public IStatus validate(String name) {
        if (RUNTIME_PROVIDED.equals(name)) {
            return Status.OK_STATUS;
        } else if (RUNTIME_VERSION.equals(name)) {
            Object version = getProperty(RUNTIME_VERSION);
            if (version instanceof Version) {
                return Status.OK_STATUS;
            }
            return new Status(Status.ERROR, Activator.PLUGIN_ID, Messages.SwitchYardFacetInstallConfigFactory_statusMessage_MustSpecifySYVersion);
        } else if (RUNTIME_COMPONENTS.equals(name)) {
            return Status.OK_STATUS;
        }
        return super.validate(name);
    }

    private void loadDefaults(IFacetedProjectWorkingCopy ifpwc) throws InvocationTargetException, InterruptedException {
        if (ifpwc != null && ifpwc.getProject() != null && ifpwc.getProject().exists()) {
            _switchYardProject = SwitchYardProjectManager.instance().getSwitchYardProject(ifpwc.getProject());
        }
        if (_switchYardProject != null && _switchYardProject.needsLoading()) {
            _switchYardProject.load(new NullProgressMonitor());
            try {
                _versions = resolveSwitchYardVersionRange(new NullProgressMonitor()).getVersions();
            } catch (CoreException e) {
                _versions = new ArrayList<Version>();
            }
        } else {
            try {
                _versions = resolveSwitchYardVersionRange(new NullProgressMonitor()).getVersions();
            } catch (CoreException e) {
                _versions = new ArrayList<Version>();
            }
        }
        _originalRuntimes = ifpwc.getTargetedRuntimes();
    }

}
