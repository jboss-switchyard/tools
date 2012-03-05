/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.common.impl;

import static org.switchyard.tools.ui.M2EUtils.CONFIGURATION_ELEMENT;
import static org.switchyard.tools.ui.M2EUtils.CONFIGURE_GOAL;
import static org.switchyard.tools.ui.M2EUtils.PARAM_ELEMENT;
import static org.switchyard.tools.ui.M2EUtils.SCANNER_CLASS_NAMES_ELEMENT;
import static org.switchyard.tools.ui.M2EUtils.SWITCHYARD_CORE_GROUP_ID;
import static org.switchyard.tools.ui.M2EUtils.SWITCHYARD_PLUGIN_KEY;
import static org.switchyard.tools.ui.M2EUtils.SWITCHYARD_VERSION;
import static org.switchyard.tools.ui.M2EUtils.UNKNOWN_VERSION_STRING;
import static org.switchyard.tools.ui.M2EUtils.createSwitchYardPlugin;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.xml.namespace.QName;

import org.apache.maven.model.Build;
import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.PluginExecution;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.internal.IMavenConstants;
import org.eclipse.m2e.core.project.IMavenProjectFacade;
import org.eclipse.m2e.core.project.MavenProjectUtils;
import org.switchyard.config.model.ModelPuller;
import org.switchyard.config.model.switchyard.SwitchYardModel;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.common.ISwitchYardComponentExtension;
import org.switchyard.tools.ui.common.ISwitchYardProject;
import org.switchyard.tools.ui.common.ISwitchYardProjectWorkingCopy;
import org.switchyard.tools.ui.common.SwitchYardComponentExtensionManager;

/**
 * SwitchYardProject
 * 
 * <p/>
 * Implementation of ISwitchYardProject.
 * 
 * @author Rob Cernich
 */
@SuppressWarnings("restriction")
public class SwitchYardProject implements ISwitchYardProject {

    private IProject _project;
    private volatile MavenProject _mavenProject;
    private volatile String _version;
    private volatile String _versionPropertyKey;
    private volatile String _rawVersionString;
    private volatile boolean _usingDependencyManagement;
    private volatile Set<ISwitchYardComponentExtension> _components;
    private volatile SwitchYardConfigurePlugin _plugin;
    private volatile IFile _switchYardConfigurationFile;
    private Set<SwitchYardProjectWorkingCopy> _workingCopies = new HashSet<SwitchYardProjectWorkingCopy>();

    /**
     * Create a new SwitchYardProject.
     * 
     * @param project the underlying Eclipse project.
     */
    public SwitchYardProject(IProject project) {
        _project = project;
        IMavenProjectFacade mavenProjectFacade = MavenPlugin.getMavenProjectRegistry().getProject(project);
        if (mavenProjectFacade != null && !mavenProjectFacade.isStale()) {
            _mavenProject = mavenProjectFacade.getMavenProject();
        }
        init();
    }

    @Override
    public IProject getProject() {
        return _project;
    }

    @Override
    public MavenProject getMavenProject() {
        return _mavenProject;
    }

    @Override
    public String getVersion() {
        return _version;
    }

    @Override
    public String getVersionPropertyKey() {
        return _versionPropertyKey;
    }

    @Override
    public Set<ISwitchYardComponentExtension> getComponents() {
        return Collections.unmodifiableSet(_components);
    }

    @Override
    public boolean isUsingDependencyManagement() {
        return _usingDependencyManagement;
    }

    @Override
    public String getRawVersionString() {
        return _rawVersionString;
    }

    @Override
    public IFile getSwitchYardConfigurationFile() {
        return _switchYardConfigurationFile;
    }

    @Override
    public SwitchYardModel loadSwitchYardModel(IProgressMonitor monitor) throws CoreException, IOException {
        if (needsLoading()) {
            load(monitor);
        }
        if (_switchYardConfigurationFile.exists()) {
            try {
                InputStream is = _switchYardConfigurationFile.getContents(true);
                try {
                    return new ModelPuller<SwitchYardModel>().pull(is);
                } finally {
                    is.close();
                }
            } catch (CoreException e) {
                Activator.getDefault().getLog().log(e.getStatus());
            } catch (IOException e) {
                Activator
                        .getDefault()
                        .getLog()
                        .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
                                "Exception while loading switchyard.xml file.", e));
            }
        }
        return new ModelPuller<SwitchYardModel>().pull(new QName(SwitchYardModel.DEFAULT_NAMESPACE,
                SwitchYardModel.SWITCHYARD));
    }

    @Override
    public boolean needsLoading() {
        return _mavenProject == null;
    }

    @Override
    public synchronized void load(IProgressMonitor monitor) {
        monitor.beginTask("Loading Maven configuration for SwitchYard project.", 100);
        monitor.worked(10);
        SubProgressMonitor subMonitor = new SubProgressMonitor(monitor, 75);
        try {
            // reload the project
            _mavenProject = MavenPlugin.getMaven().readProject(
                    _project.getFile(IMavenConstants.POM_FILE_NAME).getLocation().toFile(), subMonitor);
            subMonitor.done();
        } catch (CoreException e) {
            Activator.getDefault().getLog().log(e.getStatus());
        }
        subMonitor.done();
        init();

        for (SwitchYardProjectWorkingCopy workingCopy : _workingCopies) {
            workingCopy.reloaded();
        }
        monitor.done();
    }

    @Override
    public synchronized ISwitchYardProjectWorkingCopy createWorkingCopy() {
        SwitchYardProjectWorkingCopy workingCopy = new SwitchYardProjectWorkingCopy(this);
        _workingCopies.add(workingCopy);
        return workingCopy;
    }

    protected SwitchYardConfigurePlugin getPlugin() {
        return _plugin;
    }

    /* package */
    synchronized void disposed(SwitchYardProjectWorkingCopy workingCopy) {
        _workingCopies.remove(workingCopy);
    }

    private synchronized void init() {
        _version = null;
        _versionPropertyKey = SWITCHYARD_VERSION;
        _components = Collections.emptySet();
        _rawVersionString = null;
        _usingDependencyManagement = false;
        _plugin = new SwitchYardConfigurePlugin();
        _switchYardConfigurationFile = null;

        if (_mavenProject == null) {
            return;
        }

        _version = readSwitchYardVersion();
        _versionPropertyKey = readSwitchYardVersionPropertyKey();
        _rawVersionString = readRawVersionString();
        if (_rawVersionString == null) {
            _usingDependencyManagement = true;
        } else if (_rawVersionString == UNKNOWN_VERSION_STRING) {
            if (_version == null) {
                _usingDependencyManagement = false;
                _rawVersionString = "${" + _versionPropertyKey + "}";
            } else {
                _usingDependencyManagement = true;
                _rawVersionString = null;
            }
        }
        _components = readComponents();

        for (IPath resourceLocation : MavenProjectUtils.getResourceLocations(_project, _mavenProject.getResources())) {
            IFile temp = _project.getFolder(resourceLocation).getFile("META-INF/switchyard.xml");
            if (_switchYardConfigurationFile == null) {
                _switchYardConfigurationFile = temp;
            }
            if (temp.exists()) {
                _switchYardConfigurationFile = temp;
                break;
            }
        }
    }

    private String readSwitchYardVersion() {
        for (Dependency dependency : _mavenProject.getDependencies()) {
            if (SWITCHYARD_CORE_GROUP_ID.equals(dependency.getGroupId()) && dependency.getVersion() != null) {
                return dependency.getVersion();
            }
        }
        Plugin switchYardPlugin = getSwitchYardPlugin();
        if (switchYardPlugin == null) {
            return null;
        }
        return switchYardPlugin.getVersion();
    }

    private Plugin getSwitchYardPlugin() {
        if (_mavenProject == null) {
            return null;
        }
        return _mavenProject.getPlugin(SWITCHYARD_PLUGIN_KEY);
    }

    private String readRawVersionString() {
        if (_mavenProject.getDependencyManagement() != null) {
            for (Dependency dependency : _mavenProject.getDependencyManagement().getDependencies()) {
                if (SWITCHYARD_CORE_GROUP_ID.equals(dependency.getGroupId())) {
                    // using dependency management
                    return null;
                }
            }
        }
        for (Dependency dependency : _mavenProject.getOriginalModel().getDependencies()) {
            if (SWITCHYARD_CORE_GROUP_ID.equals(dependency.getGroupId())) {
                return dependency.getVersion();
            }
        }
        return UNKNOWN_VERSION_STRING;
    }

    private Set<ISwitchYardComponentExtension> readComponents() {
        Collection<ISwitchYardComponentExtension> extensions = SwitchYardComponentExtensionManager.instance()
                .getComponentExtensions();
        Set<ISwitchYardComponentExtension> retVal = new LinkedHashSet<ISwitchYardComponentExtension>(extensions.size());
        Set<String> dependencyKeys = createDependencyKeySet(_mavenProject.getDependencies());
        Set<String> pluginScanners = new SwitchYardConfigurePlugin().getScannerClasses();
        ExtensionsLoop: for (ISwitchYardComponentExtension extension : extensions) {
            if (extension.getScannerClassName() != null && !pluginScanners.contains(extension.getScannerClassName())) {
                continue ExtensionsLoop;
            }
            for (Dependency dependency : extension.getDependencies()) {
                if (!dependencyKeys.contains(dependency.getManagementKey())) {
                    continue ExtensionsLoop;
                }
            }
            retVal.add(extension);
        }
        return retVal;
    }

    private String readSwitchYardVersionPropertyKey() {
        boolean foundComponent = false;
        for (Dependency dependency : _mavenProject.getOriginalModel().getDependencies()) {
            if (SWITCHYARD_CORE_GROUP_ID.equals(dependency.getGroupId())) {
                String dependencyVersion = dependency.getVersion();
                if (dependencyVersion == null || !dependencyVersion.startsWith("${") || dependencyVersion.length() < 4) {
                    foundComponent = true;
                    continue;
                }
                return dependencyVersion.substring(2, dependencyVersion.length() - 1);
            }
        }
        if (_mavenProject.getOriginalModel().getDependencyManagement() != null) {
            for (Dependency dependency : _mavenProject.getOriginalModel().getDependencyManagement().getDependencies()) {
                if (SWITCHYARD_CORE_GROUP_ID.equals(dependency.getGroupId())) {
                    String dependencyVersion = dependency.getVersion();
                    if (dependencyVersion == null || !dependencyVersion.startsWith("${")
                            || dependencyVersion.length() < 4) {
                        foundComponent = true;
                        continue;
                    }
                    return dependencyVersion.substring(2, dependencyVersion.length() - 1);
                }
            }
        }
        Plugin switchYardPlugin = getPlugin().getOriginalPlugin();
        if (switchYardPlugin == null) {
            return foundComponent ? null : SWITCHYARD_VERSION;
        }
        String pluginVersion = switchYardPlugin.getVersion();
        if (pluginVersion == null || !pluginVersion.startsWith("${") || pluginVersion.length() < 4) {
            return null;
        }
        return pluginVersion.substring(2, pluginVersion.length() - 1);
    }

    private Set<String> createDependencyKeySet(Collection<Dependency> dependencies) {
        Set<String> dependencyKeySet = new HashSet<String>();
        for (Dependency dependency : dependencies) {
            dependencyKeySet.add(dependency.getManagementKey());
        }
        return dependencyKeySet;
    }

    protected final class SwitchYardConfigurePlugin {

        private Plugin _switchYardPlugin;
        private Set<String> _scannerClasses;

        private SwitchYardConfigurePlugin() {
            _switchYardPlugin = getSwitchYardPlugin();
            if (_switchYardPlugin == null) {
                _scannerClasses = Collections.emptySet();
                return;
            }

            _scannerClasses = new HashSet<String>();
            Object configuration = _switchYardPlugin.getConfiguration();
            if (configuration instanceof Xpp3Dom) {
                _scannerClasses.addAll(parseConfiguration((Xpp3Dom) configuration));
            }
            for (PluginExecution execution : _switchYardPlugin.getExecutions()) {
                if (execution.getGoals().contains(CONFIGURE_GOAL)) {
                    configuration = execution.getConfiguration();
                    if (configuration instanceof Xpp3Dom) {
                        _scannerClasses.addAll(parseConfiguration((Xpp3Dom) configuration));
                    }
                }
            }
        }

        public Set<String> getScannerClasses() {
            return _scannerClasses;
        }

        public Plugin getPlugin() {
            return _switchYardPlugin;
        }

        public Plugin getOriginalPlugin() {
            if (_mavenProject == null) {
                return null;
            }
            return _mavenProject.getOriginalModel().getBuild().getPluginsAsMap().get(SWITCHYARD_PLUGIN_KEY);
        }

        public boolean updateScannerClasses(Set<String> added, Set<String> removed) {
            added.removeAll(_scannerClasses);
            removed.retainAll(_scannerClasses);
            if (added.isEmpty() && removed.isEmpty()) {
                return false;
            }
            Plugin plugin = getOriginalPlugin();
            if (plugin == null) {
                if (added.isEmpty()) {
                    // can't remove anything and we're not adding anything, so
                    // no changes
                    return false;
                }
                // see if we need to create an execution
                boolean createExecution = true;
                if (_switchYardPlugin != null) {
                    for (PluginExecution execution : _switchYardPlugin.getExecutions()) {
                        if (execution.getGoals().contains(CONFIGURE_GOAL)) {
                            createExecution = false;
                            break;
                        }
                    }
                }
                installSwitchYardPlugin(createExecution, added);
            } else {
                Xpp3Dom configuration = null;
                Object pluginConfiguration = plugin.getConfiguration();
                if (pluginConfiguration instanceof Xpp3Dom) {
                    configuration = (Xpp3Dom) pluginConfiguration;
                    Xpp3Dom[] children = configuration.getChildren(SCANNER_CLASS_NAMES_ELEMENT);
                    if (children != null && children.length > 0) {
                        removeScanners(children[0], removed);
                        addScanners(children[0], added);
                        return true;
                    }
                }

                for (PluginExecution execution : plugin.getExecutions()) {
                    if (execution.getGoals().contains(CONFIGURE_GOAL)) {
                        Object test = execution.getConfiguration();
                        if (test instanceof Xpp3Dom) {
                            Xpp3Dom[] children = ((Xpp3Dom) test).getChildren(SCANNER_CLASS_NAMES_ELEMENT);
                            if (children != null && children.length > 0) {
                                removeScanners(children[0], removed);
                                addScanners(children[0], added);
                                // we'll only process the first execution. not
                                // sure how to handle multiple executions. i'm
                                // assuming we wouldn't want them to all have
                                // the same configuration.
                                return true;
                            }
                        }
                    }
                }

                // no scanners config
                if (configuration == null) {
                    configuration = new Xpp3Dom(CONFIGURATION_ELEMENT);
                    plugin.setConfiguration(configuration);
                }
                Xpp3Dom scannerElement;
                Xpp3Dom[] children = configuration.getChildren(SCANNER_CLASS_NAMES_ELEMENT);
                if (children == null || children.length == 0) {
                    scannerElement = new Xpp3Dom(SCANNER_CLASS_NAMES_ELEMENT);
                    configuration.addChild(scannerElement);
                } else {
                    scannerElement = children[0];
                }
                addScanners(scannerElement, added);
            }
            return true;
        }

        private void removeScanners(Xpp3Dom scannerElement, Set<String> removed) {
            for (int index = 0; index < scannerElement.getChildCount(); ++index) {
                Xpp3Dom child = scannerElement.getChild(index);
                if (PARAM_ELEMENT.equals(child.getName()) && removed.contains(child.getValue())) {
                    scannerElement.removeChild(index);
                    --index;
                }
            }
        }

        private void addScanners(Xpp3Dom scannerElement, Set<String> added) {
            for (String scanner : added) {
                Xpp3Dom paramElement = new Xpp3Dom(PARAM_ELEMENT);
                paramElement.setValue(scanner);
                scannerElement.addChild(paramElement);
            }
        }

        private Set<String> parseConfiguration(Xpp3Dom configuration) {
            Xpp3Dom scannerClassNames = configuration.getChild(SCANNER_CLASS_NAMES_ELEMENT);
            if (scannerClassNames == null) {
                return Collections.emptySet();
            }
            Set<String> scannerClasses = new HashSet<String>();
            for (Xpp3Dom param : scannerClassNames.getChildren(PARAM_ELEMENT)) {
                _scannerClasses.add(param.getValue());
            }
            return scannerClasses;
        }

        private void installSwitchYardPlugin(boolean createExecution, Set<String> scanners) {
            Model model = _mavenProject.getOriginalModel();
            Build build = model.getBuild();
            if (build == null) {
                build = new Build();
                model.setBuild(build);
            }
            build.addPlugin(createSwitchYardPlugin(_rawVersionString, createExecution, scanners));
        }

    }
}
