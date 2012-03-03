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
package org.switchyard.tools.ui.common.impl;

import static org.switchyard.tools.ui.M2EUtils.JBOSS_PUBLIC_REPOSITORY_DEFAULT_ID;
import static org.switchyard.tools.ui.M2EUtils.JBOSS_PUBLIC_REPOSITORY_URL;
import static org.switchyard.tools.ui.M2EUtils.createJBossPublicRepository;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;
import org.apache.maven.model.Repository;
import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.internal.IMavenConstants;
import org.eclipse.m2e.core.project.MavenUpdateRequest;
import org.eclipse.m2e.core.ui.internal.UpdateConfigurationJob;
import org.switchyard.config.model.switchyard.SwitchYardModel;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.common.ISwitchYardComponentExtension;
import org.switchyard.tools.ui.common.ISwitchYardProjectWorkingCopy;
import org.switchyard.tools.ui.common.SwitchYardComponentExtensionManager;

/**
 * SwitchYardProjectWorkingCopy
 * 
 * <p/>
 * Implements {@link ISwitchYardProjectWorkingCopy}.
 * 
 * @author Rob Cernich
 */
@SuppressWarnings("restriction")
public class SwitchYardProjectWorkingCopy implements ISwitchYardProjectWorkingCopy {

    private final SwitchYardProject _switchYardProject;
    private MavenProject _mavenProject;
    private Map<String, ISwitchYardComponentExtension> _addedComponents = new LinkedHashMap<String, ISwitchYardComponentExtension>();
    private Map<String, ISwitchYardComponentExtension> _removedComponents = new LinkedHashMap<String, ISwitchYardComponentExtension>();
    private Set<ISwitchYardComponentExtension> _mergedComponents = new LinkedHashSet<ISwitchYardComponentExtension>();
    private volatile String _newVersion;
    private boolean _configurationChanged;

    /**
     * Create a new SwitchYardProjectWorkingCopy.
     * 
     * @param switchYardProject the original SwitchYard project.
     */
    public SwitchYardProjectWorkingCopy(SwitchYardProject switchYardProject) {
        _switchYardProject = switchYardProject;
        _mavenProject = _switchYardProject.getMavenProject();
        _mergedComponents.addAll(_switchYardProject.getComponents());
    }

    @Override
    public IProject getProject() {
        return _switchYardProject.getProject();
    }

    @Override
    public MavenProject getMavenProject() {
        return _switchYardProject.getMavenProject();
    }

    @Override
    public String getVersion() {
        return _newVersion == null ? _switchYardProject.getVersion() : _newVersion;
    }

    @Override
    public String getVersionPropertyKey() {
        return _switchYardProject.getVersionPropertyKey();
    }

    @Override
    public Set<ISwitchYardComponentExtension> getComponents() {
        return _mergedComponents;
    }

    @Override
    public boolean isUsingDependencyManagement() {
        return _switchYardProject.isUsingDependencyManagement();
    }

    @Override
    public String getRawVersionString() {
        return _switchYardProject.getRawVersionString();
    }

    @Override
    public IFile getSwitchYardConfigurationFile() {
        return _switchYardProject.getSwitchYardConfigurationFile();
    }

    @Override
    public SwitchYardModel loadSwitchYardModel(IProgressMonitor monitor) throws CoreException, IOException {
        return _switchYardProject.loadSwitchYardModel(monitor);
    }

    @Override
    public boolean needsLoading() {
        return _switchYardProject.needsLoading();
    }

    @Override
    public void load(IProgressMonitor monitor) {
        _switchYardProject.load(monitor);
    }

    /* package */
    void reloaded() {
        synchronized (_switchYardProject) {
            _mavenProject = _switchYardProject.getMavenProject();
            _mergedComponents.clear();
            _mergedComponents.addAll(_switchYardProject.getComponents());
            if (_newVersion != null && _newVersion.equals(_switchYardProject.getVersion())) {
                _newVersion = null;
            }
            for (Iterator<ISwitchYardComponentExtension> it = _removedComponents.values().iterator(); it.hasNext();) {
                ISwitchYardComponentExtension component = it.next();
                if (!_mergedComponents.contains(component)) {
                    it.remove();
                }
            }
            for (Iterator<ISwitchYardComponentExtension> it = _addedComponents.values().iterator(); it.hasNext();) {
                ISwitchYardComponentExtension component = it.next();
                if (_switchYardProject.getComponents().contains(component)) {
                    it.remove();
                }
                _mergedComponents.add(component);
            }
        }
    }

    @Override
    public ISwitchYardProjectWorkingCopy createWorkingCopy() {
        return _switchYardProject.createWorkingCopy();
    }

    @Override
    public void setRuntimeVersion(String version) {
        if (version == null) {
            _newVersion = null;
            return;
        }
        _newVersion = version;
        if (_newVersion.equals(_switchYardProject.getVersion())) {
            _newVersion = null;
        }
    }

    @Override
    public void addComponent(ISwitchYardComponentExtension component) {
        synchronized (_switchYardProject) {
            _removedComponents.remove(component.getId());
            _mergedComponents.add(component);
            if (_addedComponents.containsKey(component.getId())
                    || _switchYardProject.getComponents().contains(component)) {
                // already in added list or was there originally
                return;
            }
            _addedComponents.put(component.getId(), component);
        }
    }

    @Override
    public void addComponents(Collection<ISwitchYardComponentExtension> components) {
        synchronized (_switchYardProject) {
            for (ISwitchYardComponentExtension component : components) {
                addComponent(component);
            }
        }
    }

    @Override
    public void removeComponent(ISwitchYardComponentExtension component) {
        synchronized (_switchYardProject) {
            _addedComponents.remove(component.getId());
            _mergedComponents.remove(component);
            if (_removedComponents.containsKey(component.getId())
                    || !_switchYardProject.getComponents().contains(component)) {
                // already in removed list or wasn't there originally
                return;
            }
            _removedComponents.put(component.getId(), component);
        }
    }

    @Override
    public void removeComponents(Collection<ISwitchYardComponentExtension> components) {
        synchronized (_switchYardProject) {
            for (ISwitchYardComponentExtension component : components) {
                removeComponent(component);
            }
        }
    }

    @Override
    public boolean isModified() {
        synchronized (_switchYardProject) {
            return _newVersion != null || !_removedComponents.isEmpty() || !_addedComponents.isEmpty();
        }
    }

    @Override
    public void commit(IProgressMonitor monitor) throws CoreException {
        synchronized (_switchYardProject) {

            _configurationChanged = false;

            if (!isModified()) {
                monitor.done();
                return;
            }
            monitor.beginTask("Updating project pom.", 300);
            IProgressMonitor subMonitor = new SubProgressMonitor(monitor, 100,
                    SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
            if (processUpdates(subMonitor)) {
                subMonitor.done();

                // write out the changes
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                MavenPlugin.getMaven().writeModel(getMavenProject().getOriginalModel(), baos);

                subMonitor = new SubProgressMonitor(monitor, 100, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                getProject().getFile(IMavenConstants.POM_FILE_NAME).setContents(
                        new ByteArrayInputStream(baos.toByteArray()), true, true, subMonitor);
                subMonitor.done();

                // make sure the project gets refreshed
                MavenPlugin.getMavenProjectRegistry().refresh(
                        new MavenUpdateRequest(getProject(), MavenPlugin.getMavenConfiguration().isOffline(), false));

                // update ourselves
                if (_configurationChanged) {
                    // need to update maven project configuration; refreshes the
                    // project too.
                    new UpdateConfigurationJob(new IProject[] {getProject() }).schedule();
                } else {
                    MavenPlugin.getMavenProjectRegistry()
                            .refresh(
                                    new MavenUpdateRequest(getProject(), MavenPlugin.getMavenConfiguration()
                                            .isOffline(), false));
                }

                subMonitor = new SubProgressMonitor(monitor, 100, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                load(subMonitor);

            }
            subMonitor.done();
            monitor.done();
        }
    }

    @Override
    public void revert() {
        synchronized (_switchYardProject) {
            _newVersion = null;
            _addedComponents.clear();
            _removedComponents.clear();
            _mergedComponents.clear();
            _mergedComponents.addAll(_switchYardProject.getComponents());
        }
    }

    @Override
    public void dispose() {
        _switchYardProject.disposed(this);
    }

    private boolean processUpdates(IProgressMonitor monitor) throws CoreException {
        boolean modelUpdated = false;

        monitor.beginTask("Processing SwitchYard settings changes.", 50);

        if (_mavenProject != _switchYardProject.getMavenProject()) {
            throw new CoreException(
                    new Status(Status.ERROR, Activator.PLUGIN_ID,
                            "ISwitchYardProjectWorkingCopy is out of sync with ISwitchYardProject.  Updates cannot be processed."));
        }

        Model model = _switchYardProject.getMavenProject().getOriginalModel();

        monitor.subTask("Validating switchyard.version property.");
        final String switchYardVersionPropertyKey = getVersionPropertyKey();
        final String currentSwitchYardVersion = _switchYardProject.getVersion();
        if (switchYardVersionPropertyKey != null) {
            if (_newVersion != null) {
                model.addProperty(switchYardVersionPropertyKey, _newVersion);
                modelUpdated = true;
            } else if (currentSwitchYardVersion == null) {
                model.addProperty(switchYardVersionPropertyKey, "");
                modelUpdated = true;
            }
        }
        monitor.worked(10);

        monitor.subTask("Validating component dependencies.");

        if (_removedComponents.size() > 0) {
            // there's got to be a better way....
            for (ISwitchYardComponentExtension component : _removedComponents.values()) {
                for (Dependency dependency : component.getDependencies()) {
                    for (Iterator<Dependency> it = model.getDependencies().iterator(); it.hasNext();) {
                        if (it.next().getManagementKey().equals(dependency.getManagementKey())) {
                            it.remove();
                            modelUpdated = true;
                            break;
                        }
                    }
                }
            }
        }
        monitor.worked(10);

        // make sure the runtime component is always present
        addComponent(SwitchYardComponentExtensionManager.instance().getRuntimeComponentExtension());
        if (_addedComponents.size() > 0) {
            final String versionString = getRawVersionString();
            for (ISwitchYardComponentExtension component : _addedComponents.values()) {
                for (Dependency dependency : component.getDependencies()) {
                    dependency = dependency.clone();
                    dependency.setVersion(versionString);
                    model.getDependencies().add(dependency);
                    modelUpdated = true;
                }
            }
        }
        monitor.worked(10);

        monitor.subTask("Validating SwitchYard plugin.");
        if (_switchYardProject.getPlugin().updateScannerClasses(collectScanners(_addedComponents.values()),
                collectScanners(_removedComponents.values()))) {
            modelUpdated = true;
            _configurationChanged = true;
        }
        monitor.worked(10);

        monitor.subTask("Validating repository settings.");
        boolean foundRepo = false;
        for (Repository repo : getMavenProject().getRepositories()) {
            if (JBOSS_PUBLIC_REPOSITORY_URL.equals(repo.getUrl())) {
                foundRepo = true;
                break;
            }
        }
        if (!foundRepo) {
            model.addRepository(createJBossPublicRepository(JBOSS_PUBLIC_REPOSITORY_DEFAULT_ID));
            modelUpdated = true;
        }
        foundRepo = false;
        for (Repository repo : getMavenProject().getPluginRepositories()) {
            if (JBOSS_PUBLIC_REPOSITORY_URL.equals(repo.getUrl())) {
                foundRepo = true;
                break;
            }
        }
        if (!foundRepo) {
            model.addPluginRepository(createJBossPublicRepository(JBOSS_PUBLIC_REPOSITORY_DEFAULT_ID));
            modelUpdated = true;
        }

        monitor.done();

        return modelUpdated;
    }

    private Set<String> collectScanners(Collection<ISwitchYardComponentExtension> components) {
        Set<String> scanners = new LinkedHashSet<String>();
        for (ISwitchYardComponentExtension component : components) {
            String scanner = component.getScannerClassName();
            if (scanner != null && scanner.length() > 0) {
                scanners.add(scanner);
            }
        }
        return scanners;
    }
}
