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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;
import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.text.DocumentRewriteSession;
import org.eclipse.jface.text.DocumentRewriteSessionType;
import org.eclipse.jface.text.IDocumentExtension4;
import org.eclipse.m2e.core.ui.internal.UpdateMavenProjectJob;
import org.eclipse.m2e.core.ui.internal.editing.AddDependencyOperation;
import org.eclipse.m2e.core.ui.internal.editing.PomEdits;
import org.eclipse.m2e.core.ui.internal.editing.PomHelper;
import org.eclipse.m2e.core.ui.internal.editing.RemoveDependencyOperation;
import org.eclipse.wst.sse.core.StructuredModelManager;
import org.eclipse.wst.sse.core.internal.undo.IStructuredTextUndoManager;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMDocument;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMModel;
import org.switchyard.config.model.switchyard.SwitchYardModel;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.M2EUtils;
import org.switchyard.tools.ui.common.ISwitchYardComponentExtension;
import org.switchyard.tools.ui.common.ISwitchYardProjectWorkingCopy;
import org.switchyard.tools.ui.common.SwitchYardComponentExtensionManager;
import org.switchyard.tools.ui.i18n.Messages;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

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
    private volatile String _newKieVersion;
    private volatile String _newIntegrationVersion;

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
    public IFile getOutputSwitchYardConfigurationFile() {
        return _switchYardProject.getOutputSwitchYardConfigurationFile();
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
        _switchYardProject.readLock();
        try {
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
        } finally {
            _switchYardProject.readUnlock();
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
    public void setIntegrationVersion(String version) {
        if (version == null) {
            _newIntegrationVersion = null;
            return;
        }
        _newIntegrationVersion = version;
        if (_newIntegrationVersion.equals(_switchYardProject.getIntegrationVersion())) {
            _newIntegrationVersion = null;
        }
    }

    @Override
    public void setKieVersion(String version) {
        if (version == null) {
            _newKieVersion = null;
            return;
        }
        _newKieVersion = version;
        if (_newKieVersion.equals(_switchYardProject.getKieVersion())) {
            _newKieVersion = null;
        }
    }

    @Override
    public void addComponent(ISwitchYardComponentExtension component) {
        _switchYardProject.readLock();
        try {
            _removedComponents.remove(component.getId());
            _mergedComponents.add(component);
            if (_addedComponents.containsKey(component.getId())
                    || _switchYardProject.getComponents().contains(component)) {
                // already in added list or was there originally
                return;
            }
            _addedComponents.put(component.getId(), component);
        } finally {
            _switchYardProject.readUnlock();
        }
    }

    @Override
    public void addComponents(Collection<ISwitchYardComponentExtension> components) {
        _switchYardProject.readLock();
        try {
            for (ISwitchYardComponentExtension component : components) {
                addComponent(component);
            }
        } finally {
            _switchYardProject.readUnlock();
        }
    }

    @Override
    public void removeComponent(ISwitchYardComponentExtension component) {
        _switchYardProject.readLock();
        try {
            _addedComponents.remove(component.getId());
            _mergedComponents.remove(component);
            if (_removedComponents.containsKey(component.getId())
                    || !_switchYardProject.getComponents().contains(component)) {
                // already in removed list or wasn't there originally
                return;
            }
            _removedComponents.put(component.getId(), component);
        } finally {
            _switchYardProject.readUnlock();
        }
    }

    @Override
    public void removeComponents(Collection<ISwitchYardComponentExtension> components) {
        _switchYardProject.readLock();
        try {
            for (ISwitchYardComponentExtension component : components) {
                removeComponent(component);
            }
        } finally {
            _switchYardProject.readUnlock();
        }
    }

    @Override
    public boolean isModified() {
        _switchYardProject.readLock();
        try {
            return _newVersion != null || _newKieVersion != null || _newIntegrationVersion != null 
                    || !_removedComponents.isEmpty() || !_addedComponents.isEmpty();
        } finally {
            _switchYardProject.readUnlock();
        }
    }

    @Override
    public void commit(IProgressMonitor monitor) throws CoreException {
        _switchYardProject.readLock();
        try {
            if (!isModified()) {
                monitor.done();
                return;
            }
            monitor.beginTask(Messages.SwitchYardProjectWorkingCopy_taskMessage_updatingProjectPOM, 300);
            IProgressMonitor subMonitor = new SubProgressMonitor(monitor, 100,
                    SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
            final List<Operation> updateOperations = processUpdates(subMonitor);
            if (updateOperations.size() > 0) {
                subMonitor.done();

                subMonitor = new SubProgressMonitor(monitor, 100, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                try {
                    updatePom(updateOperations);
                } catch (IOException e) {
                    throw new CoreException(
                            new Status(Status.ERROR, Activator.PLUGIN_ID, "Could not update pom.xml", e));
                }
                subMonitor.done();
            }
            subMonitor.done();
            final List<Operation> updateFeatureOperations = processFeatureUpdates(subMonitor);
            if (updateFeatureOperations.size() > 0) {
                subMonitor.done();

                subMonitor = new SubProgressMonitor(monitor, 100, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
                try {
                    updateFeatures(updateFeatureOperations);
                } catch (IOException e) {
                    throw new CoreException(
                            new Status(Status.ERROR, Activator.PLUGIN_ID, "Could not update features.xml", e));
                }
                subMonitor.done();
            }
            subMonitor.done();
            monitor.done();
        } finally {
            _switchYardProject.readUnlock();
            _switchYardProject.getSwitchYardFeaturesFile().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
            refreshProject(new NullProgressMonitor());
        }
    }

    private void refreshProject(IProgressMonitor monitor) throws CoreException {
        // update the project so we ensure a Project->Clean is done so the
        // MANIFEST.MF is built and we don't run into trouble deploying the 
        // project on a Fuse server.
        IProject project = _switchYardProject.getSwitchYardFeaturesFile().getProject();
        if (project != null) {
            // update the maven project so we start in a deployable state
            // with a valid MANIFEST.MF built as part of the build process.
            Job updateJob = new UpdateMavenProjectJob(new IProject[] {project});
            updateJob.schedule();
        }
    }
    
    
    @Override
    public void revert() {
        _switchYardProject.readLock();
        try {
            _newVersion = null;
            _addedComponents.clear();
            _removedComponents.clear();
            _mergedComponents.clear();
            _mergedComponents.addAll(_switchYardProject.getComponents());
        } finally {
            _switchYardProject.readUnlock();
        }
    }

    @Override
    public void dispose() {
        _switchYardProject.disposed(this);
    }

    private List<Operation> processFeatureUpdates(IProgressMonitor monitor) throws CoreException {
        final List<Operation> operations = new ArrayList<Operation>();

        if (_switchYardProject.getSwitchYardFeaturesFile() == null 
                || (_switchYardProject.getSwitchYardConfigurationFile() != null && !_switchYardProject.getSwitchYardFeaturesFile().exists())) {
            return operations;
        }
        
        monitor.beginTask(Messages.SwitchYardProjectWorkingCopy_taskMessage_processingSYSettingsChanges, 50);

        if (_mavenProject != _switchYardProject.getMavenProject()) {
            throw new CoreException(
                    new Status(Status.ERROR, Activator.PLUGIN_ID,
                            Messages.SwitchYardProjectWorkingCopy_errorMessage_workingCopyOutOfSync));
        }

        monitor.subTask(Messages.SwitchYardProjectWorkingCopy_taskMessage_validatingVersionProperty);
        final String switchYardVersionPropertyKey = getVersionPropertyKey();
        final String currentSwitchYardVersion = _switchYardProject.getVersion();
        if (switchYardVersionPropertyKey != null) {
            if (_newVersion != null) {
                operations.add(new UpdatePropertyOperation(switchYardVersionPropertyKey, _newVersion));
            } else if (currentSwitchYardVersion == null) {
                operations.add(new UpdatePropertyOperation(switchYardVersionPropertyKey, "")); //$NON-NLS-1$
            }
        }
        monitor.worked(33);

        monitor.subTask(Messages.SwitchYardProjectWorkingCopy_taskMessage_validatingComponentDependencies);

        if (_removedComponents.size() > 0) {
            // there's got to be a better way....
            final List<ISwitchYardComponentExtension> removedComponentList = new ArrayList<ISwitchYardComponentExtension>();
            for (ISwitchYardComponentExtension component : _removedComponents.values()) {
                removedComponentList.add(component);
            }
            if (removedComponentList.size() > 0) {
                RemoveFeaturesOperation featuresOp = new RemoveFeaturesOperation(removedComponentList);
                operations.add(featuresOp);
            }
        }
        monitor.worked(33);

        // make sure the runtime component is always present
        addComponent(SwitchYardComponentExtensionManager.instance().getRuntimeComponentExtension());
        if (_addedComponents.size() > 0) {
            final List<ISwitchYardComponentExtension> addedComponentList = new ArrayList<ISwitchYardComponentExtension>();
            for (ISwitchYardComponentExtension component : _addedComponents.values()) {
                addedComponentList.add(component);
            }
            if (addedComponentList.size() > 0) {
                AddFeaturesOperation featuresOp = new AddFeaturesOperation(addedComponentList);
                operations.add(featuresOp);
            }
        }
        monitor.worked(33);

        monitor.done();

        return operations;
    }    
    
    private List<Operation> processUpdates(IProgressMonitor monitor) throws CoreException {
        final List<Operation> operations = new ArrayList<Operation>();

        monitor.beginTask(Messages.SwitchYardProjectWorkingCopy_taskMessage_processingSYSettingsChanges, 50);

        if (_mavenProject != _switchYardProject.getMavenProject()) {
            throw new CoreException(
                    new Status(Status.ERROR, Activator.PLUGIN_ID,
                            Messages.SwitchYardProjectWorkingCopy_errorMessage_workingCopyOutOfSync));
        }

        Model model = _switchYardProject.getMavenProject().getOriginalModel();

        monitor.subTask(Messages.SwitchYardProjectWorkingCopy_taskMessage_validatingVersionProperty);
        final String switchYardVersionPropertyKey = getVersionPropertyKey();
        final String currentSwitchYardVersion = _switchYardProject.getVersion();
        if (switchYardVersionPropertyKey != null) {
            if (_newVersion != null) {
                operations.add(new UpdatePropertyOperation(switchYardVersionPropertyKey, _newVersion));
            } else if (currentSwitchYardVersion == null) {
                operations.add(new UpdatePropertyOperation(switchYardVersionPropertyKey, "")); //$NON-NLS-1$
            }
        }

        monitor.subTask(Messages.SwitchYardProjectWorkingCopy_taskMessage_validatingVersionProperty);
        final String integrationVersionPropertyKey = getIntegrationVersionPropertyKey();
        final String currentIntegrationVersion = _switchYardProject.getIntegrationVersion();
        if (integrationVersionPropertyKey != null) {
            if (_newIntegrationVersion != null) {
                operations.add(new UpdatePropertyOperation(integrationVersionPropertyKey, _newIntegrationVersion));
            } else if (currentIntegrationVersion == null) {
                operations.add(new UpdatePropertyOperation(integrationVersionPropertyKey, "")); //$NON-NLS-1$
            }
        }

        monitor.subTask(Messages.SwitchYardProjectWorkingCopy_taskMessage_validatingVersionProperty);
        final String kieVersionPropertyKey = getKieVersionPropertyKey();
        final String currentkieVersion = _switchYardProject.getKieVersion();
        if (kieVersionPropertyKey != null) {
            if (_newKieVersion != null) {
                operations.add(new UpdatePropertyOperation(kieVersionPropertyKey, _newKieVersion));
            } else if (currentkieVersion == null) {
                operations.add(new UpdatePropertyOperation(kieVersionPropertyKey, "")); //$NON-NLS-1$
            }
        }
        monitor.worked(10);

        monitor.subTask(Messages.SwitchYardProjectWorkingCopy_taskMessage_validatingComponentDependencies);

        if (_removedComponents.size() > 0) {
            // there's got to be a better way....
            final List<Dependency> removedDependencies = new ArrayList<Dependency>();
            for (ISwitchYardComponentExtension component : _removedComponents.values()) {
                for (Dependency dependency : component.getDependencies()) {
                    for (Iterator<Dependency> it = model.getDependencies().iterator(); it.hasNext();) {
                        final Dependency existingDependency = it.next();
                        if (existingDependency.getManagementKey().equals(dependency.getManagementKey())) {
                            removedDependencies.add(existingDependency);
                            break;
                        }
                    }
                }
            }
            if (removedDependencies.size() > 0) {
                operations.add(new RemoveDependenciesOperation(removedDependencies));
            }
        }
        monitor.worked(10);

        // make sure the runtime component is always present
        addComponent(SwitchYardComponentExtensionManager.instance().getRuntimeComponentExtension());
        if (_addedComponents.size() > 0) {
            final String versionString = getRawVersionString();
            final List<Dependency> addedDependencies = new ArrayList<Dependency>();
            final List<ISwitchYardComponentExtension> addedComponentList = new ArrayList<ISwitchYardComponentExtension>();
            for (ISwitchYardComponentExtension component : _addedComponents.values()) {
                addedComponentList.add(component);
                COMPONENT_DEPENDENCIES: for (Dependency dependency : component.getDependencies()) {
                    // crude, but effective
                    for (Iterator<Dependency> it = model.getDependencies().iterator(); it.hasNext();) {
                        if (it.next().getManagementKey().equals(dependency.getManagementKey())) {
                            // skip this dependency as it already exists.
                            continue COMPONENT_DEPENDENCIES;
                        }
                    }
                    dependency = dependency.clone();
                    dependency.setVersion(versionString);
                    addedDependencies.add(dependency);
                }
            }
//            if (addedComponentList.size() > 0) {
//                AddFeaturesOperation featuresOp = new AddFeaturesOperation(addedComponentList);
//                operations.add(featuresOp);
//            }
            if (addedDependencies.size() > 0) {
                operations.add(new AddDependenciesOperation(addedDependencies));
            }
        }
        monitor.worked(10);

        monitor.subTask(Messages.SwitchYardProjectWorkingCopy_taskMessage_validatingSYPlugin);
        final Set<String> existingScanners = _switchYardProject.getPlugin().getScannerClasses();
        final Set<String> addedScanners = collectScanners(_addedComponents.values());
        final Set<String> removedScanners = collectScanners(_removedComponents.values());
        removedScanners.removeAll(addedScanners);
        addedScanners.removeAll(existingScanners);
        removedScanners.retainAll(existingScanners);
        if (addedScanners.size() > 0 || removedScanners.size() > 0) {
            operations.add(new UpdateScannersOperation(addedScanners, removedScanners));
        }
        monitor.worked(10);

        // monitor.subTask(Messages.SwitchYardProjectWorkingCopy_taskMessage_validatingRepoSettings);
        // boolean foundRepo = false;
        // for (Repository repo : getMavenProject().getRepositories()) {
        // if (JBOSS_PUBLIC_REPOSITORY_URL.equals(repo.getUrl())) {
        // foundRepo = true;
        // break;
        // }
        // }
        // if (!foundRepo) {
        // model.addRepository(createJBossPublicRepository(JBOSS_PUBLIC_REPOSITORY_DEFAULT_ID));
        // modelUpdated = true;
        // }
        // foundRepo = false;
        // for (Repository repo : getMavenProject().getPluginRepositories()) {
        // if (JBOSS_PUBLIC_REPOSITORY_URL.equals(repo.getUrl())) {
        // foundRepo = true;
        // break;
        // }
        // }
        // if (!foundRepo) {
        // model.addPluginRepository(createJBossPublicRepository(JBOSS_PUBLIC_REPOSITORY_DEFAULT_ID));
        // modelUpdated = true;
        // }

        monitor.done();

        return operations;
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

    /**
     * performs an modifying operation on top the
     * 
     * Adapted from org.eclipse.m2e.core.ui.internal.editing.PomEdits.performOnDOMDocument()
     */
    private void updatePom(List<Operation> operations) throws IOException, CoreException {
        final IDOMModel domModel = (IDOMModel) StructuredModelManager.getModelManager().getModelForEdit(
                _switchYardProject.getMavenProjectFacade().getPom());
        if (domModel == null) {
            throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "Could not update pom.xml."));
        }
        
        try {
            DocumentRewriteSession session = null;
            IStructuredTextUndoManager undo = null;

            // let the model know we make changes
            domModel.aboutToChangeModel();
            undo = domModel.getStructuredDocument().getUndoManager();
            // let the document know we make changes
            if (domModel.getStructuredDocument() instanceof IDocumentExtension4) {
                IDocumentExtension4 ext4 = (IDocumentExtension4) domModel.getStructuredDocument();
                session = ext4.startRewriteSession(DocumentRewriteSessionType.UNRESTRICTED_SMALL);
            }
            undo.beginRecording(domModel);

            try {
                for (Operation operation : operations) {
                    try {
                        operation.process(domModel.getDocument());
                    } catch (Exception e) {
                        // XXX: should we log an error?
                        e.printStackTrace();
                    }
                }
            } finally {
                undo.endRecording(domModel);
                if (session != null && domModel.getStructuredDocument() instanceof IDocumentExtension4) {
                    IDocumentExtension4 ext4 = (IDocumentExtension4) domModel.getStructuredDocument();
                    ext4.stopRewriteSession(session);
                }
                domModel.changedModel();
            }
        } finally {
            try {
                domModel.save();
            } finally {
                domModel.releaseFromEdit();
            }
        }
    }

    /**
     * performs an modifying operation on top of the features
     * 
     * Adapted from org.eclipse.m2e.core.ui.internal.editing.PomEdits.performOnDOMDocument()
     */
    private void updateFeatures(List<Operation> operations) throws IOException, CoreException {
        final IDOMModel domFeatureModel = (IDOMModel) StructuredModelManager.getModelManager().getModelForEdit(
                _switchYardProject.getSwitchYardFeaturesFile());
        if (domFeatureModel == null) {
            throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "Could not update features.xml."));
        }
        
        try {
            DocumentRewriteSession session = null;
            IStructuredTextUndoManager undo = null;

            // let the model know we make changes
            domFeatureModel.aboutToChangeModel();
            undo = domFeatureModel.getStructuredDocument().getUndoManager();
            // let the document know we make changes
            if (domFeatureModel.getStructuredDocument() instanceof IDocumentExtension4) {
                IDocumentExtension4 ext4 = (IDocumentExtension4) domFeatureModel.getStructuredDocument();
                session = ext4.startRewriteSession(DocumentRewriteSessionType.UNRESTRICTED_SMALL);
            }
            undo.beginRecording(domFeatureModel);

            try {
                for (Operation operation : operations) {
                    try {
                        operation.process(domFeatureModel.getDocument());
                    } catch (Exception e) {
                        // XXX: should we log an error?
                        e.printStackTrace();
                    }
                }
            } finally {
                undo.endRecording(domFeatureModel);
                if (session != null && domFeatureModel.getStructuredDocument() instanceof IDocumentExtension4) {
                    IDocumentExtension4 ext4 = (IDocumentExtension4) domFeatureModel.getStructuredDocument();
                    ext4.stopRewriteSession(session);
                }
                domFeatureModel.changedModel();
            }
        } finally {
            try {
                domFeatureModel.save();
            } finally {
                domFeatureModel.releaseFromEdit();
            }
        }
    }

    private static interface Operation {
        public void process(IDOMDocument document);
    }

    private final class UpdatePropertyOperation implements Operation {

        private final String _key;
        private final String _value;

        private UpdatePropertyOperation(String key, String value) {
            _key = key;
            _value = value;
        }

        @Override
        public void process(IDOMDocument document) {
            final Element property = PomEdits.getChild(document.getDocumentElement(), PomEdits.PROPERTIES, _key);
            PomEdits.setText(property, _value);
        }
    }

    private final class RemoveDependenciesOperation implements Operation {

        private final List<Dependency> _removedDependencies;

        private RemoveDependenciesOperation(List<Dependency> removedDependencies) {
            _removedDependencies = removedDependencies;
        }

        @Override
        public void process(IDOMDocument document) {
            for (Dependency dependency : _removedDependencies) {
                try {
                    new RemoveDependencyOperation(dependency).process(document);
                } catch (Exception e) {
                    // TODO: log an error?
                    e.printStackTrace();
                }
            }
        }
    }

    private final class AddDependenciesOperation implements Operation {

        private final List<Dependency> _addedDependencies;

        private AddDependenciesOperation(List<Dependency> addedDependencies) {
            _addedDependencies = addedDependencies;
        }

        @Override
        public void process(IDOMDocument document) {
            for (Dependency dependency : _addedDependencies) {
                try {
                    new AddDependencyOperation(dependency).process(document);
                } catch (Exception e) {
                    // TODO: log an error?
                    e.printStackTrace();
                }
            }
        }
    }

    private final class AddFeaturesOperation implements Operation {

        private final List<ISwitchYardComponentExtension> _addedComponentsList;

        private AddFeaturesOperation(List<ISwitchYardComponentExtension> addedDependencies) {
            _addedComponentsList = addedDependencies;
        }

        @Override
        public void process(IDOMDocument document) {
            NodeList featureNodes = document.getElementsByTagName("feature");
            if (featureNodes != null && featureNodes.getLength() > 0) {
                Node firstFeature = featureNodes.item(0);
                if (firstFeature instanceof Element) {
                    Element firstFeatureElement = (Element) firstFeature;
                    NodeList childFeatures = firstFeatureElement.getElementsByTagName("feature");
                    for (ISwitchYardComponentExtension component : _addedComponentsList) {
                        try {
                            boolean foundIt = false; 
                            String addIt = null;
                            String featureId = component.getBundleId();
                            for (int i = 0; i < childFeatures.getLength(); i++) {
                                Node feature = childFeatures.item(i);
                                if (feature instanceof Element) {
                                    Text value = null;
                                    if (feature.getFirstChild() instanceof Text) {
                                        value = (Text) feature.getFirstChild();
                                    }
                                    String featureIdText = value.getTextContent();
                                    if (featureIdText.equalsIgnoreCase(featureId)) {
                                        foundIt = true;
                                    } else {
                                        addIt = featureId;
                                    }
                                }
                            }
                            if (!foundIt && addIt != null) {
                                Element newFeature = document.createElement("feature");
                                newFeature.setAttribute("version", "${switchyard.version}"); //getVersion());
                                newFeature.appendChild(document.createTextNode(addIt));
                                firstFeatureElement.appendChild(newFeature);
                            }
                        } catch (Exception e) {
                            // TODO: log an error?
                            e.printStackTrace();
                        }
                    }
                }
                
            }
        }
    }

    private final class RemoveFeaturesOperation implements Operation {

        private final List<ISwitchYardComponentExtension> _removedComponentsList;

        private RemoveFeaturesOperation(List<ISwitchYardComponentExtension> removedDependencies) {
            _removedComponentsList = removedDependencies;
        }

        @Override
        public void process(IDOMDocument document) {
            NodeList featureNodes = document.getElementsByTagName("feature");
            if (featureNodes != null && featureNodes.getLength() > 0) {
                Node firstFeature = featureNodes.item(0);
                if (firstFeature instanceof Element) {
                    Element firstFeatureElement = (Element) firstFeature;
                    NodeList childFeatures = firstFeatureElement.getElementsByTagName("feature");
                    for (ISwitchYardComponentExtension component : _removedComponentsList) {
                        try {
                            boolean foundIt = false; 
                            String featureId = component.getBundleId();
                            Node removeIt = null;
                            for (int i = 0; i < childFeatures.getLength(); i++) {
                                Node feature = childFeatures.item(i);
                                if (feature instanceof Element) {
                                    Text value = null;
                                    if (feature.getFirstChild() instanceof Text) {
                                        value = (Text) feature.getFirstChild();
                                    }
                                    String featureIdText = value.getTextContent();
                                    if (featureIdText.equalsIgnoreCase(featureId)) {
                                        foundIt = true;
                                        removeIt = feature;
                                    }
                                }
                            }
                            if (foundIt && removeIt != null) {
                                firstFeatureElement.removeChild(removeIt);
                            }
                        } catch (Exception e) {
                            // TODO: log an error?
                            e.printStackTrace();
                        }
                    }
                }
                
            }
        }
    }

    private final class UpdateScannersOperation implements Operation {

        private final Set<String> _addedScanners;
        private final Set<String> _removedScanners;

        private UpdateScannersOperation(Set<String> addedScanners, Set<String> removedScanners) {
            _addedScanners = addedScanners;
            _removedScanners = removedScanners;
        }

        @Override
        public void process(IDOMDocument document) {
            Element switchYardPlugin = PomEdits.findChild(PomEdits.findChild(
                    PomEdits.findChild(document.getDocumentElement(), PomEdits.BUILD), PomEdits.PLUGINS),
                    PomEdits.PLUGIN, PomEdits.childEquals(PomEdits.GROUP_ID, M2EUtils.SWITCHYARD_CORE_GROUP_ID),
                    PomEdits.childEquals(PomEdits.ARTIFACT_ID, M2EUtils.SWITCHYARD_PLUGIN_ARTIFACT_ID));
            if (switchYardPlugin == null) {
                if (_addedScanners.size() == 0 || _switchYardProject.getPlugin().getPlugin() != null) {
                    /*
                     * if we're not adding anything or the plugin is declared in
                     * a parent pom, just bail.
                     */
                    return;
                }
                Element pluginsElement = PomEdits.getChild(document.getDocumentElement(), PomEdits.BUILD, PomEdits.PLUGINS);
                switchYardPlugin = PomHelper.createPlugin(pluginsElement, M2EUtils.SWITCHYARD_CORE_GROUP_ID, M2EUtils.SWITCHYARD_PLUGIN_ARTIFACT_ID, getRawVersionString());
                Element goalElement = PomEdits.getChild(switchYardPlugin, PomEdits.EXECUTIONS, PomEdits.EXECUTION, PomEdits.GOALS, PomEdits.GOAL);
                PomEdits.setText(goalElement, M2EUtils.CONFIGURE_GOAL);
                PomEdits.getChild(switchYardPlugin, PomEdits.CONFIGURATION);
            }

            Element configElement = PomEdits.findChild(switchYardPlugin, PomEdits.CONFIGURATION);
            if (configElement == null) {
                List<Element> executionElements = PomEdits.findChilds(
                        PomEdits.findChild(switchYardPlugin, PomEdits.EXECUTIONS), PomEdits.EXECUTION);
                boolean addConfig = _addedScanners.size() > 0;
                if (executionElements.size() > 0) {
                    for (Element executionElement : executionElements) {
                        if (PomEdits.findChild(PomEdits.findChild(executionElement, PomEdits.GOALS), PomEdits.GOAL,
                                PomEdits.textEquals(M2EUtils.CONFIGURE_GOAL)) == null) {
                            continue;
                        }
                        Element executionConfigElement = PomEdits.findChild(executionElement, PomEdits.CONFIGURATION);
                        if (executionConfigElement != null) {
                            updateScanners(executionConfigElement);
                            addConfig = false;
                            /*
                             * we'll only process the first execution. not sure
                             * how to handle multiple executions. i'm assuming
                             * we wouldn't want them to all have the same
                             * configuration.
                             */
                            break;
                        }
                    }
                }
                if (addConfig) {
                    configElement = PomEdits.createElement(switchYardPlugin, PomEdits.CONFIGURATION);
                    updateScanners(configElement);
                }
            } else {
                updateScanners(configElement);
            }
        }
        
        private void updateScanners(Element configElement) {
            Element scannersElement = PomEdits.findChild(configElement, M2EUtils.SCANNER_CLASS_NAMES_ELEMENT);
            if (scannersElement == null) {
                if (_addedScanners.size() == 0) {
                    return;
                }
                scannersElement = PomEdits.getChild(configElement, M2EUtils.SCANNER_CLASS_NAMES_ELEMENT);
            }
            for (String scanner : _removedScanners) {
                PomEdits.removeChild(scannersElement, PomEdits.findChild(scannersElement, M2EUtils.PARAM_ELEMENT, PomEdits.textEquals(scanner)));
            }
            for (String scanner : _addedScanners) {
                Element paramElement = PomEdits.findChild(scannersElement, M2EUtils.PARAM_ELEMENT, PomEdits.textEquals(scanner));
                if (paramElement == null) {
                    paramElement = PomEdits.createElementWithText(scannersElement, M2EUtils.PARAM_ELEMENT, scanner);
                    PomEdits.format(paramElement);
                }
            }
            PomEdits.removeIfNoChildElement(scannersElement);
        }
    }

    @Override
    public IFile getSwitchYardFeaturesFile() {
        return _switchYardProject.getSwitchYardFeaturesFile();
    }

    @Override
    public boolean isUsingIntegrationPack() {
        return _switchYardProject.isUsingIntegrationPack();
    }

    @Override
    public String getIntegrationVersion() {
        return _newIntegrationVersion == null ? _switchYardProject.getIntegrationVersion() : _newIntegrationVersion;
    }

    @Override
    public String getIntegrationVersionPropertyKey() {
        return _switchYardProject.getIntegrationVersionPropertyKey();
    }

    @Override
    public String getKieVersion() {
        return _newKieVersion == null ? _switchYardProject.getKieVersion() : _newKieVersion;
    }

    @Override
    public String getKieVersionPropertyKey() {
        return _switchYardProject.getKieVersionPropertyKey();
    }

}
