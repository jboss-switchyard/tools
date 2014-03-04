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
package org.switchyard.tools.ui.editor.transform;

import java.util.ArrayList;
import java.util.List;

/**
 * TransformProviderRegistry
 * 
 * <p/>
 * Registry for transform providers (e.g. json, jaxb, java, etc.).
 */
public final class TransformProviderRegistry {

    /**
     * @return the registry.
     */
    public static TransformProviderRegistry instance() {
        return INSTANCE;
    }

    private static final TransformProviderRegistry INSTANCE = new TransformProviderRegistry();

    private List<ITransformProvider> _providers;

    /**
     * Create a new TransformProviderRegistry.
     */
    private TransformProviderRegistry() {
        _providers = new ArrayList<ITransformProvider>(6);
        _providers.add(new DozerTransformProvider());
        _providers.add(new JavaTransformProvider());
        _providers.add(new JAXBTransformProvider());
        _providers.add(new JSONTransformProvider());
        _providers.add(new XSLTransformProvider());
        _providers.add(new SmooksTransformProvider());
    }

    /**
     * @return the registered providers.
     */
    public List<ITransformProvider> getProviders() {
        return _providers;
    }

}
