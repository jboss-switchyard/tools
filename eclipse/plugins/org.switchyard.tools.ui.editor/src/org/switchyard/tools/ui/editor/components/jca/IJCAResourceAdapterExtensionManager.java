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
package org.switchyard.tools.ui.editor.components.jca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.switchyard.tools.ui.editor.Activator;

/**
 * BindingTypeExtensionManager
 * 
 * <p/>
 * Manages the set of contributed component type extensions, i.e. loads the
 * extensions and provides access to them.
 */
public final class IJCAResourceAdapterExtensionManager {

    private static final IJCAResourceAdapterExtensionManager INSTANCE = new IJCAResourceAdapterExtensionManager();

    /**
     * @return the sole instance of the component type extension manager.
     */
    public static IJCAResourceAdapterExtensionManager instance() {
        return INSTANCE;
    }

    private Map<Class<? extends Binding>, IJCAResourceAdapterExtension> _cache = new HashMap<Class<? extends Binding>, IJCAResourceAdapterExtension>();
    private List<IJCAResourceAdapterExtension> _extensions = new ArrayList<IJCAResourceAdapterExtension>();
    private IJCAResourceAdapterExtension _defaultExtension = new JCAGenericResourceAdapterExtension();

    /**
     * Create a new BindingTypeExtensionManager.
     */
    private IJCAResourceAdapterExtensionManager() {
        loadExtensions();
    }

    /**
     * @param type the binding type
     * @return the extension supporting this type.
     */
    public IJCAResourceAdapterExtension getExtensionFor(Class<? extends Binding> type) {
        if (_cache.containsKey(type)) {
            return _cache.get(type);
        }
        _cache.put(type, _defaultExtension);
        return _defaultExtension;
    }

    /**
     * @return all the registered extensions.
     */
    public Collection<IJCAResourceAdapterExtension> getExtensions() {
        return Collections.unmodifiableCollection(_extensions);
    }

    private void loadExtensions() {
        IExtensionPoint extensionPoint = Platform.getExtensionRegistry().getExtensionPoint(Activator.PLUGIN_ID,
                "jcaResourceAdapterExtension"); //$NON-NLS-1$
        for (IExtension pluginExtension : extensionPoint.getExtensions()) {
            for (IConfigurationElement element : pluginExtension.getConfigurationElements()) {
                try {
                    _extensions.add((IJCAResourceAdapterExtension) element.createExecutableExtension("class")); //$NON-NLS-1$
                } catch (CoreException e) {
                    Activator.getDefault().getLog().log(e.getStatus());
                }
            }
        }
    }

}
