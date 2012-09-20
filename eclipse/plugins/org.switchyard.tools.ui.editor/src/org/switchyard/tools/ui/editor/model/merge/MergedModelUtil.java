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
package org.switchyard.tools.ui.editor.model.merge;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;

/**
 * MergedModelUtil
 * 
 * <p/>
 * Utility functions for working with a merged model.
 * 
 */
public final class MergedModelUtil {

    /**
     * Returns the SwitchYard object from the source file.
     * 
     * @param object a SwitchYard model object.
     * 
     * @return the SwitchYard object from the source file.
     */
    public static SwitchYardType getSwitchYard(EObject object) {
        if (object == null) {
            return null;
        }
        final AbstractMergedModelAdapter adapter = (AbstractMergedModelAdapter) EcoreUtil.getRegisteredAdapter(object,
                AbstractMergedModelAdapter.class);
        if (adapter != null) {
            return adapter.getSwitchYard();
        }
        return getSwitchYard(object.eResource());
    }

    /**
     * Returns the root SwitchYard object from the resource.
     * 
     * @param resource the resource.
     * 
     * @return the SwitchYard object, null if not found.
     */
    public static SwitchYardType getSwitchYard(Resource resource) {
        if (resource == null) {
            return null;
        }
        for (EObject content : resource.getContents()) {
            if (content instanceof SwitchYardType) {
                return (SwitchYardType) content;
            } else if (content instanceof DocumentRoot) {
                return ((DocumentRoot) content).getSwitchyard();
            }
        }
        return null;
    }

    /**
     * Returns a merged model adapter for the given type.
     * 
     * @param <T> the adapter type.
     * @param object the model object.
     * @param adapterType the adapter type.
     * @return the adapter.
     */
    public static <T extends AbstractMergedModelAdapter> T getAdapter(EObject object, Class<T> adapterType) {
        return adapterType.cast(EcoreUtil.getRegisteredAdapter(object, adapterType));
    }

    /**
     * The merged model adapter factory associated with the resource set.
     * 
     * @param rs the resource set.
     * @return the adapter factory.
     */
    public static MergedModelAdapterFactory getAdapterFactory(ResourceSet rs) {
        return (MergedModelAdapterFactory) EcoreUtil.getAdapterFactory(rs.getAdapterFactories(),
                MergedModelAdapterFactory.class);
    }

    /**
     * @param object the object to test.
     * @return true if the containing resource is read-only; false if the object
     *         is not contained within a resource or the resource is not managed
     *         by an editing domain.
     */
    public static boolean isReadOnly(EObject object) {
        final EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(object);
        return domain != null && object.eResource() != null && domain.isReadOnly(object.eResource());
    }

    private MergedModelUtil() {
    }

}
