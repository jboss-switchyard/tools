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
package org.switchyard.tools.ui.editor.diagram.shared;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.ui.common.ISwitchYardComponentExtension;
import org.switchyard.tools.ui.common.SwitchYardComponentExtensionManager;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.model.merge.MergedModelUtil;
import org.switchyard.tools.ui.operations.AbstractSwitchYardProjectOperation;

/**
 * CreateTypeFeature
 * 
 * <p/>
 * Create a new implementation.
 * 
 * @param <T> the base type being created.
 * @param <C> the type containing the base type.
 * 
 * @author Rob Cernich
 */
public abstract class CreateTypeFeature<T extends EObject, C extends EObject> extends AbstractCreateFeature {

    private boolean _hasDoneChanges;
    private ITypeFactory<T, C> _factory;
    private Class<C> _containerClass;

    /**
     * Create a new CreateTypeFeature.
     * 
     * @param fp the feature provider
     * @param factory the factory for creating the object
     * @param containerClass the type for the container class.
     * @param name the name for this feature
     * @param description the description for this feature
     */
    public CreateTypeFeature(IFeatureProvider fp, ITypeFactory<T, C> factory, Class<C> containerClass, String name,
            String description) {
        super(fp, name, description);
        _factory = factory;
        _containerClass = containerClass;
    }

    /**
     * @param context the create context.
     * 
     * @return true if the business object associated with the PictogramElement
     *         matches the container type <C>.
     */
    @Override
    public boolean canCreate(ICreateContext context) {
        final PictogramElement pe = context.getTargetContainer();
        final Object bo = getBusinessObjectForPictogramElement(pe);
        return pe != null && _containerClass.isInstance(bo)
                && !getDiagramBehavior().getEditingDomain().isReadOnly(((EObject) bo).eResource());
    }

    @Override
    public boolean hasDoneChanges() {
        return _hasDoneChanges;
    }

    @Override
    public Object[] create(ICreateContext context) {
        _hasDoneChanges = false;
        final T newObject = _factory.createType(getShell(), getContainerObject(context));
        if (newObject == null) {
            return null;
        }
        final Object[] addedObjects = updateContainer(context, newObject);
        if (addedObjects == null || addedObjects.length == 0) {
            return null;
        }
        _hasDoneChanges = true;
        for (Object object : addedObjects) {
            addGraphicalRepresentation(context, object);
        }

        updateProjectCapabilities(newObject);

        return addedObjects;
    }

    /**
     * Extensions should integrate the new object into the model.
     * 
     * @param context the create context.
     * @param newObject the newly created object.
     * 
     * @return objects added to the model.
     */
    protected abstract Object[] updateContainer(ICreateContext context, T newObject);

    /**
     * @param newObject the newly created object
     * @return a list of SwitchYard component extension IDs that are required to
     *         use this object within a project.
     */
    protected abstract Collection<String> getRequiredCapabilities(T newObject);

    /**
     * @param context the create context
     * @return the business object for the pictogram element, cast to the
     *         appropriate type.
     */
    protected C getContainerObject(ICreateContext context) {
        return _containerClass.cast(getBusinessObjectForPictogramElement(context.getTargetContainer()));
    }

    /**
     * @return the type factory associated with this feature.
     */
    protected ITypeFactory<T, C> getFactory() {
        return _factory;
    }

    /**
     * @return the shell for the active workbench window.
     */
    protected Shell getShell() {
        return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
    }

    protected void updateProjectCapabilities(T newObject) {
        final IProject project = getContainingProject(newObject);
        if (project == null) {
            return;
        }
        final Collection<String> componentIDs = getRequiredCapabilities(newObject);
        if (componentIDs == null || componentIDs.isEmpty()) {
            return;
        }
        final Set<ISwitchYardComponentExtension> capabilities = new HashSet<ISwitchYardComponentExtension>();
        for (String id : componentIDs) {
            final ISwitchYardComponentExtension capability = SwitchYardComponentExtensionManager.instance()
                    .getComponentExtension(id);
            if (capability != null) {
                capabilities.add(capability);
            }
        }
        Display.getDefault().asyncExec(new Runnable() {
            @Override
            public void run() {
                try {
                    new AbstractSwitchYardProjectOperation(null, capabilities, false,
                            Messages.description_updateSwitchYardCapabilities, null) {
                        @Override
                        protected IProject getProject() {
                            return project;
                        }

                        @Override
                        protected void execute(IProgressMonitor monitor) throws CoreException {
                            // no extra work
                        }
                    }.run(new NullProgressMonitor());
                } catch (CoreException e) {
                    Activator.logStatus(e.getStatus());
                }
            }
        });
    }

    private IProject getContainingProject(T newObject) {
        // get the source resource
        final Resource resource = MergedModelUtil.getSwitchYard(newObject.eContainer()).eResource();
        final IFile file = ResourcesPlugin.getWorkspace().getRoot()
                .getFile(new Path(resource.getURI().toPlatformString(true)));
        if (file == null || !file.getProject().isAccessible()) {
            return null;
        }
        return file.getProject();
    }
}
