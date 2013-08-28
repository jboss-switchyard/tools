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
package org.switchyard.tools.ui.common;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.osgi.util.NLS;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.i18n.Messages;

/**
 * SwitchYardTestMixInExtensionManager
 * 
 * <p/>
 * Manages the set of contributed SwitchYard mix-in extensions, i.e. loads the
 * extensions and provides access to them.
 */
public final class SwitchYardTestMixInExtensionManager {

    private static final SwitchYardTestMixInExtensionManager INSTANCE = new SwitchYardTestMixInExtensionManager();

    /**
     * @return the sole instance of the mixin extension manager.
     */
    public static SwitchYardTestMixInExtensionManager instance() {
        return INSTANCE;
    }

    private Map<String, ISwitchYardTestMixInExtension> _extensions = new HashMap<String, ISwitchYardTestMixInExtension>();

    /**
     * Create a new SwitchYardTestMixInExtensionManager.
     */
    private SwitchYardTestMixInExtensionManager() {
        loadExtensions();
    }

    /**
     * @return all the registered extensions.
     */
    public Collection<ISwitchYardTestMixInExtension> getExtensions() {
        return Collections.unmodifiableCollection(_extensions.values());
    }

    private void loadExtensions() {
        IExtensionPoint extensionPoint = Platform.getExtensionRegistry().getExtensionPoint(Activator.PLUGIN_ID,
                "switchYardTestMixIn"); //$NON-NLS-1$
        for (IExtension pluginExtension : extensionPoint.getExtensions()) {
            for (IConfigurationElement element : pluginExtension.getConfigurationElements()) {
                if (!"switchYardTestMixIn".equals(element.getName())) { //$NON-NLS-1$
                    continue;
                }
                final String name = element.getAttribute("name"); //$NON-NLS-1$
                final String description = element.getAttribute("description"); //$NON-NLS-1$
                final String mixInClass = element.getAttribute("mixInClass"); //$NON-NLS-1$
                final ISwitchYardComponentExtension capability = SwitchYardComponentExtensionManager.instance()
                        .getComponentExtension(element.getAttribute("componentId")); //$NON-NLS-1$
                if (name == null) {
                    String message = NLS.bind(Messages.SwitchYardTestMixInExtensionManager_logMessageMissingNameForSYMixIn, 
                            new Object[] {mixInClass, element.getNamespaceIdentifier()});
                    Activator
                            .getDefault()
                            .getLog()
                            .log(new Status(Status.ERROR, Activator.PLUGIN_ID,message));
                    continue;
                } else if (_extensions.containsKey(name)) {
                    String message = NLS.bind(Messages.SwitchYardTestMixInExtensionManager_logMessageDuplicateNameForSYMixIn, 
                            new Object[] {name, element.getNamespaceIdentifier()});
                    Activator
                            .getDefault()
                            .getLog()
                            .log(new Status(Status.ERROR, Activator.PLUGIN_ID, message));
                    continue;
                }
                _extensions.put(name, new SwitchYardTestMixInExtension(name, description, mixInClass, capability));
            }
        }
    }

    private static final class SwitchYardTestMixInExtension implements ISwitchYardTestMixInExtension {
        private final ISwitchYardComponentExtension _capability;
        private final String _mixInClass;
        private final String _name;
        private final String _description;

        private SwitchYardTestMixInExtension(String name, String description, String mixInClass,
                ISwitchYardComponentExtension capability) {
            super();
            _capability = capability;
            _mixInClass = mixInClass;
            _name = name;
            _description = description;
        }

        @Override
        public String getMixInClass() {
            return _mixInClass;
        }

        @Override
        public ISwitchYardComponentExtension getRequiredComponent() {
            return _capability;
        }

        @Override
        public String getName() {
            return _name;
        }

        @Override
        public String getDescription() {
            return _description;
        }

    }
}
