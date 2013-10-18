/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.editor.refactoring;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.resource.ResourceChange;
import org.switchyard.tools.ui.editor.Activator;

/**
 * UpdateReferencedModelURIChange
 * <p/>
 * Copies a diagram file from one location to another.
 */
public abstract class UpdateReferencedModelURIChange extends ResourceChange {

    private final IFile _source;

    /**
     * Create a new UpdateReferencedModelURIChange.
     * 
     * @param source the source file.
     */
    public UpdateReferencedModelURIChange(IFile source) {
        _source = source;
    }

    @Override
    protected IResource getModifiedResource() {
        return _source;
    }

    @Override
    public String getName() {
        return "Update SwitchYard Diagram File";
    }

    protected abstract IFile getDestination();

    protected IFile getDiagram() {
        /*
         * normal operation is for this change to occur after a move/copy
         * change.
         */
        return getDestination();
    }

    @Override
    public Change perform(IProgressMonitor pm) throws CoreException {
        final IFile destination = getDestination();
        final String oldModelPath = getModelPathForDiagram(_source);
        final URI newModelURI = URI.createPlatformResourceURI(getModelPathForDiagram(destination), true);
        final ResourceSet rs = new ResourceSetImpl();
        final Resource diagram = rs.createResource(
                URI.createPlatformResourceURI(getDiagram().getFullPath().toPortableString(), true),
                "org.eclipse.graphiti.content.diagram");
        rs.getResources().remove(diagram);
        try {
            diagram.load(getLoadOptions());
            for (EObject eobject : EcoreUtil.ExternalCrossReferencer.find(diagram).keySet()) {
                final InternalEObject ieobject = (InternalEObject) eobject;
                if (ieobject.eIsProxy() && oldModelPath.equals(ieobject.eProxyURI().toPlatformString(true))) {
                    ieobject.eSetProxyURI(newModelURI.appendFragment(ieobject.eProxyURI().fragment()));
                }
            }
            diagram.save(null);
        } catch (IOException e) {
            throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID,
                    "Error updating SwitchYard diagram file.", e));
        } finally {
            try {
                diagram.unload();
            } catch (Exception e) {
                e.fillInStackTrace();
            }
        }
        return new UndoUpdateReferencedModelURIChange(destination, _source, destination);
    }

    @SuppressWarnings("serial")
    private Map<?, ?> getLoadOptions() {
        return new HashMap<Object, Object>() {
            {
                put(XMLResource.OPTION_URI_HANDLER, new URIHandlerImpl() {
                    {
                        resolve = true;
                        baseURI = URI.createPlatformResourceURI(_source.getFullPath().toPortableString(), true);
                    }

                    @Override
                    public void setBaseURI(URI uri) {
                    }
                });
            }
        };
    }

    private String getModelPathForDiagram(IFile file) {
        return file.getProject().getFullPath()
                .append(file.getProjectRelativePath().removeFirstSegments(1).removeFileExtension()).toPortableString();
    }

    private static final class UndoUpdateReferencedModelURIChange extends UpdateReferencedModelURIChange {
        private final IFile _destination;
        private final IFile _diagram;

        private UndoUpdateReferencedModelURIChange(IFile source, IFile destination, IFile diagram) {
            super(source);
            _destination = destination;
            _diagram = diagram;
        }

        @Override
        protected IFile getDestination() {
            return _destination;
        }

        @Override
        protected IFile getDiagram() {
            return _diagram;
        }
    }
}
