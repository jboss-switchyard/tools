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
package org.switchyard.tools.ui.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.maven.model.Dependency;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.M2EUtils;

/**
 * SwitchYardComponentExtensionManager
 * 
 * <p/>
 * Manages the org.switchyard.tools.ui.switchYardComponent extension point.
 * 
 * @author Rob Cernich
 */
public final class SwitchYardComponentExtensionManager {

    /** The ID of the core SwitchYard runtime component. */
    public static final String RUNTIME_COMPONENT_EXTENSION_ID = "org.switchyard:switchyard-runtime";

    private static final SwitchYardComponentExtensionManager INSTANCE = new SwitchYardComponentExtensionManager();

    /**
     * @return the instance.
     */
    public static SwitchYardComponentExtensionManager instance() {
        return INSTANCE;
    }

    private Map<String, ISwitchYardComponentExtension> _extensions = new TreeMap<String, ISwitchYardComponentExtension>();

    private SwitchYardComponentExtensionManager() {
        IExtensionPoint extensionPoint = Platform.getExtensionRegistry().getExtensionPoint(Activator.PLUGIN_ID,
                "switchYardComponent");
        for (IExtension extension : extensionPoint.getExtensions()) {
            for (IConfigurationElement element : extension.getConfigurationElements()) {
                processComponent(element);
            }
        }
    }

    /**
     * @return the extension representing the core runtime.
     */
    public ISwitchYardComponentExtension getRuntimeComponentExtension() {
        if (_extensions.containsKey(RUNTIME_COMPONENT_EXTENSION_ID)) {
            return _extensions.get(RUNTIME_COMPONENT_EXTENSION_ID);
        }
        return null;
    }

    /**
     * @return the list of registered component extensions.
     */
    public Collection<ISwitchYardComponentExtension> getComponentExtensions() {
        return Collections.unmodifiableCollection(_extensions.values());
    }

    /**
     * @param id the id of the component extension.
     * @return the component extension; null if no extension is registered with
     *         the specified id.
     */
    public ISwitchYardComponentExtension getComponentExtension(String id) {
        if (_extensions.containsKey(id)) {
            return _extensions.get(id);
        }
        return null;
    }

    private void processComponent(IConfigurationElement element) {
        if (!"component".equals(element.getName())) {
            Activator
                    .getDefault()
                    .getLog()
                    .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
                            "Invalid element in switchYardComponent extension: element=" + element.getName()
                                    + ", plugin=" + element.getContributor().getName()));
            return;
        }
        String id = element.getAttribute("id");
        String name = element.getAttribute("name");
        String description = parseDescription(element);
        List<Dependency> dependencies = parseDependencies(element);
        if (id == null) {
            Activator
                    .getDefault()
                    .getLog()
                    .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
                            "Invalid \"id\" must be specified in switchYardComponent extension: plugin="
                                    + element.getContributor().getName()));
            return;
        } else if (_extensions.containsKey(id)) {
            Activator
                    .getDefault()
                    .getLog()
                    .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
                            "Duplicate \"id\" specified in switchYardComponent extension: plugin="
                                    + element.getContributor().getName()));
            return;
        } else if (name == null || name.length() == 0) {
            name = id;
        }
        _extensions.put(id, new SwitchYardComponentExtension(id, name, element.getAttribute("scannerClass"),
                description, dependencies));
    }

    private String parseDescription(IConfigurationElement element) {
        IConfigurationElement[] descriptions = element.getChildren("description");
        if (descriptions.length == 0) {
            return null;
        }
        return descriptions[0].getValue();
    }

    private List<Dependency> parseDependencies(IConfigurationElement element) {
        IConfigurationElement[] dependencyElements = element.getChildren("dependency");
        if (dependencyElements == null) {
            return Collections.emptyList();
        }
        List<Dependency> dependencies = new ArrayList<Dependency>(dependencyElements.length);
        for (IConfigurationElement dependencyElement : dependencyElements) {
            String artifactId = parseArtifactId(dependencyElement);
            String groupId = parseGroupId(dependencyElement);
            String scope = parseScope(dependencyElement);
            if (artifactId == null || artifactId.length() == 0 || groupId == null || groupId.length() == 0) {
                Activator
                        .getDefault()
                        .getLog()
                        .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
                                "Invalid dependency in switchYardComponent extension: plugin="
                                        + element.getContributor().getName()));
                continue;
            }
            dependencies.add(M2EUtils.createSwitchYardDependency(groupId, artifactId, scope));
        }
        return dependencies;
    }

    private String parseGroupId(IConfigurationElement element) {
        IConfigurationElement[] groupIds = element.getChildren("groupId");
        if (groupIds.length != 1) {
            Activator
                    .getDefault()
                    .getLog()
                    .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
                            "Only one \"groupId\" element may be specified in a \"dependency\" for a switchYardComponent extension: plugin="
                                    + element.getContributor().getName()));
            return null;
        }
        return groupIds[0].getValue().trim();
    }

    private String parseArtifactId(IConfigurationElement element) {
        IConfigurationElement[] artifactIds = element.getChildren("artifactId");
        if (artifactIds.length != 1) {
            Activator
                    .getDefault()
                    .getLog()
                    .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
                            "Only one \"artifactId\" element may be specified in a \"dependency\" for a switchYardComponent extension: plugin="
                                    + element.getContributor().getName()));
            return null;
        }
        return artifactIds[0].getValue().trim();
    }

    private String parseScope(IConfigurationElement element) {
        IConfigurationElement[] scopes = element.getChildren("scope");
        if (scopes.length != 1) {
            Activator
                    .getDefault()
                    .getLog()
                    .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
                            "Only one \"scope\" element may be specified in a \"dependency\" for a switchYardComponent extension: plugin="
                                    + element.getContributor().getName()));
            return null;
        }
        String scope = scopes[0].getValue().trim();
        return scope.length() == 0 ? null : scope;
    }

    private static final class SwitchYardComponentExtension implements ISwitchYardComponentExtension {

        private final String _id;
        private final String _name;
        private final String _scannerClassName;
        private final String _description;
        private final List<Dependency> _dependencies;

        private SwitchYardComponentExtension(String id, String name, String scannerClassName, String description,
                List<Dependency> dependencies) {
            super();
            _id = id;
            _name = name;
            _scannerClassName = scannerClassName;
            _description = description;
            _dependencies = Collections.unmodifiableList(dependencies);
        }

        @Override
        public String getId() {
            return _id;
        }

        @Override
        public String getName() {
            return _name;
        }

        @Override
        public String getScannerClassName() {
            return _scannerClassName;
        }

        @Override
        public String getDescription() {
            return _description;
        }

        @Override
        public List<Dependency> getDependencies() {
            return _dependencies;
        }

    }
}
