/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.editor.core;

import java.io.IOException;
import java.util.HashMap;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.switchyard.tools.models.switchyard1_0.switchyard.util.SwitchyardResourceImpl;

/**
 * @author bfitzpat
 *
 */
public final class ModelHandlerLocator {

    private static HashMap<URI, ModelHandler> MAP = new HashMap<URI, ModelHandler>();
    private static HashMap<URI, ModelHandler> DIAGRAM_MAP = new HashMap<URI, ModelHandler>();

    private ModelHandlerLocator() {
        // empty
    }
    
    /**
     * @param eResource the resource to search for
     * @return the model handler for the resource
     * @throws IOException the exception
     */
    public static ModelHandler getModelHandler(Resource eResource) throws IOException {
        if (eResource == null) {
            return null;
        }
        URI uri = eResource.getURI();

        return getModelHandler(uri);
    }

    /**
     * @param path the URI of the resource to search for
     * @return the model handler
     * @throws IOException the exception
     */
    public static ModelHandler getModelHandler(URI path) throws IOException {
        ModelHandler modelHandler = MAP.get(path);
        if (modelHandler == null) {
            return DIAGRAM_MAP.get(path);
        }
        return modelHandler;
    }

    /**
     * @param diagramPath the URI for the diagram
     * @param mh the model handler instance
     */
    public static void put(URI diagramPath, ModelHandler mh) {
        DIAGRAM_MAP.put(diagramPath, mh);
    }

    /**
     * @param path the URI of the model to release
     */
    public static void releaseModel(URI path) {
        MAP.remove(path);
    }

    /**
     * @param path the URI of the model
     * @param switchyardResource the resource
     * @return the model handler
     */
    public static ModelHandler createModelHandler(URI path, final SwitchyardResourceImpl switchyardResource) {
        if (MAP.containsKey(path)) {
            return MAP.get(path);
        }
        return createNewModelHandler(path, switchyardResource);
    }

    private static ModelHandler createNewModelHandler(URI path, final SwitchyardResourceImpl switchyardResource) {
        ModelHandler handler = new ModelHandler();
        MAP.put(path, handler);
        handler.setResource(switchyardResource);

        URI uri = switchyardResource.getURI();

        try {
            IWorkspace workspace = ResourcesPlugin.getWorkspace();
            String platformString = uri.toPlatformString(true);

            // platformString is null if file is outside of workspace
            if ((platformString == null || workspace.getRoot().getFile(new Path(platformString)).exists())
                    && !switchyardResource.isLoaded()) {
                handler.loadResource();
            }
        } catch (IllegalStateException e) {

            // Workspace is not initialized so we must be running tests!
            if (!switchyardResource.isLoaded()) {
                handler.loadResource();
            }
        }

        handler.createDefinitionsIfMissing();
        return handler;
    }

}
