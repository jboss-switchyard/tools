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
package org.switchyard.tools.ui.explorer.impl;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.switchyard.config.model.ModelPuller;
import org.switchyard.config.model.switchyard.SwitchYardModel;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.common.ISwitchYardProject;
import org.switchyard.tools.ui.common.impl.SwitchYardProjectManager;
import org.switchyard.tools.ui.explorer.IArtifactsNode;
import org.switchyard.tools.ui.explorer.IComponentsNode;
import org.switchyard.tools.ui.explorer.IReferencesNode;
import org.switchyard.tools.ui.explorer.IServicesNode;
import org.switchyard.tools.ui.explorer.ISwitchYardNode;
import org.switchyard.tools.ui.explorer.ISwitchYardRootNode;

/**
 * SwitchYardRootNode
 * 
 * <p/>
 * Implementation for SwitchYard project explorer root node.
 * 
 * @author Rob Cernich
 */
public class SwitchYardRootNode implements ISwitchYardRootNode {

    private ISwitchYardProject _switchYardProject;
    private SwitchYardModel _configuration;
    private IServicesNode _servicesNode;
    private IReferencesNode _referencesNode;
    private IComponentsNode _componentsNode;
    private IArtifactsNode _artifactsNode;

    /**
     * Create a new SwitchYardRootNode.
     * 
     * @param project the containing project
     */
    public SwitchYardRootNode(IProject project) {
        _switchYardProject = SwitchYardProjectManager.instance().getSwitchYardProject(project);
    }

    @Override
    public synchronized IServicesNode getServicesNode() {
        if (_servicesNode == null) {
            _servicesNode = new ServicesNode(this, _configuration);
        }
        return _servicesNode;
    }

    @Override
    public synchronized IReferencesNode getReferencesNode() {
        if (_referencesNode == null) {
            _referencesNode = new ReferencesNode(this, _configuration);
        }
        return _referencesNode;
    }

    @Override
    public synchronized IComponentsNode getComponentsNode() {
        if (_componentsNode == null) {
            _componentsNode = new ComponentsNode(this, _configuration);
        }
        return _componentsNode;
    }

    @Override
    public synchronized IArtifactsNode getArtifactsNode() {
        if (_artifactsNode == null) {
            _artifactsNode = new ArtifactsNode(this, _configuration);
        }
        return _artifactsNode;
    }

    @Override
    public ISwitchYardProject getSwitchYardProject() {
        return _switchYardProject;
    }

    @Override
    public IProject getProject() {
        return _switchYardProject.getProject();
    }

    @Override
    public ISwitchYardNode getParent() {
        return null;
    }

    @Override
    public synchronized String getTargetNamespace() {
        if (_configuration == null) {
            return null;
        } else if (_configuration.getTargetNamespace() != null) {
            return _configuration.getTargetNamespace();
        } else if (_configuration.getComposite() != null) {
            return _configuration.getComposite().getTargetNamespace();
        }
        return null;
    }

    /**
     * @return the SwitchYardModel.
     */
    public synchronized SwitchYardModel getModel() {
        return _configuration;
    }

    /**
     * Free references, listeners, etc.
     */
    public void dispose() {
        resetState();
        _switchYardProject = null;
    }

    @Override
    public synchronized String getName() {
        if (_configuration == null) {
            return getProject().getName();
        } else if (_configuration.getName() != null) {
            return _configuration.getName();
        } else if (_configuration.getComposite() != null) {
            return _configuration.getComposite().getName();
        }
        return null;
    }

    @Override
    public ISwitchYardRootNode getRoot() {
        return this;
    }

    /**
     * Reloads the generated SwitchYard project configuration (i.e. the output
     * switchyard.xml file).
     * 
     * @param monitor progress monitor.
     */
    public synchronized void reload(IProgressMonitor monitor) {
        resetState();
        try {
            IFile outputFile = _switchYardProject.getOutputSwitchYardConfigurationFile();
            if (outputFile == null || !outputFile.exists()) {
                // just load the source, better than nothing
                outputFile = _switchYardProject.getSwitchYardConfigurationFile();
            }
            ModelPuller<SwitchYardModel> puller = new ModelPuller<SwitchYardModel>();
            _configuration = puller.pull(outputFile.getContents());
        } catch (CoreException e) {
            Activator.getDefault().getLog().log(e.getStatus());
        } catch (Exception e) {
            Activator
                    .getDefault()
                    .getLog()
                    .log(new Status(Status.ERROR, Activator.PLUGIN_ID, "Error loading SwitchYard configuration for: "
                            + _switchYardProject.getProject(), e));
        }
        monitor.done();
    }

    private synchronized void resetState() {
        _servicesNode = null;
        _referencesNode = null;
        _componentsNode = null;
        _artifactsNode = null;
        _configuration = null;
    }
}
