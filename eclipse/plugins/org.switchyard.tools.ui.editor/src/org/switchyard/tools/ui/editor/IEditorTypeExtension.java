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
package org.switchyard.tools.ui.editor;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.tb.IImageDecorator;

/**
 * IEditorTypeExtension
 * 
 * <p/>
 * Describes a type that can be used within a SwitchYard application. The
 * SwitchYard editor will use the information to expose the type within the
 * editor.
 * 
 * @param <T> The type being contributed
 */
public interface IEditorTypeExtension<T extends EObject> {

    /**
     * @param fp the feature provider
     * @return a new create features that can be used for creating a new
     *         component or implementation of the types supported by this
     *         extension; must not be null.
     */
    public ICreateFeature[] newCreateFeatures(IFeatureProvider fp);

    /**
     * @param object the model object.
     * @return an IImageDecorator that represents the model object.
     */
    public IImageDecorator getImageDecorator(T object);

    /**
     * @param type the type
     * @return true if this extension supports the specified type.
     */
    public boolean supports(Class<? extends T> type);

    /**
     * Returns a list of capabilities required to use this object within a
     * project. The ID's returned will be used to resolve component extensions,
     * adding the listed dependencies to the project's pom.
     * 
     * @param object the object being used.
     * @return a list of SwitchYard component extension IDs that are required to
     *         use this object within a project.
     * @See {@link org.switchyard.tools.ui.common.SwitchYardComponentExtensionManager#getComponentExtension(String)}
     */
    public List<String> getRequiredCapabilities(T object);
}
